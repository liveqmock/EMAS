$(document).ready(function(){
	menu.load();
});
var menu={
	load:function(){//加载菜单
		$.ajax({
			url:"menuUser/queryUserMenu",
			type:"post",
			dataType:"json",
			async:false,
			success:function(data){
				menu.bindGrid(data);
			},
			error:function(data){
				$.jBox.tip('菜单加载失败','error'); 
			}
		});
	},
	bindGrid:function(V){
		var ul = '';
		var parentLi = '';
		var j = 0;
		$.each(V,function(i,parent){
			var display = "style='display:none'";
			if(parent.fparentid==-1){
				if(j++ == 0) display = "";
				var childrenLi = '';
				parentLi = '<ul><li class="t_column" onclick="showsubmenu('+i+')">'+parent.fname+'</li>';
				$.each(V,function(j,menu){
					if(menu.fparentid==parent.id){
						var target = "I2";
						if(menu.id==57){target = "_blank";}
						childrenLi += '<li class="c_column" name="submenu'+i+'" '+display+'><img src="../images/left.gif" />&nbsp;<a href="'+menu.furl+'" target="'+target+'" id="a'+j+'">'+menu.fname+'</a></li>';
					}
				});
				if(childrenLi){
					ul += parentLi + childrenLi + '<li class="e_column" name="submenu'+i+'" '+display+'></li></ul>';
				}
			}
		});
		$("#menuColumn").html(ul);
		$("#a0").click(function(){
			window.open($(this).attr("href"),$(this).attr("target"));
		});
		$("#a0").click();
	}
};
function showsubmenu(sid) {
	var submenu = document.getElementsByName("submenu"+sid);
	for(var i=0;i<submenu.length;i++){
		if(submenu[i].style.display=='')
			submenu[i].style.display="none";
		else
			submenu[i].style.display="";
	}
}