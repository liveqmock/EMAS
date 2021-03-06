	var check = {
			cbCk:function(id){
				$("#AllCheck").attr('checked',false);
				if($('#checkbox'+id).attr("checked")){
					$("#tr"+id).css('backgroundColor','#D8F79D');
				}else{
					$("#tr"+id).css('backgroundColor','');
				}
			},
			trCk:function(id){
				$("#AllCheck").attr('checked',false);
				$("input[name='checkbox']:checked").each(function(){
					$(this).attr('checked',false);
					var tid = $(this).attr('id').substr(8);
					$("#tr" + tid).css('backgroundColor','');
				});
				$('#checkbox'+id).attr("checked",true);
				$("#tr" + id).css('backgroundColor','#D8F79D');
			},
			addCk:function(table){
				$('#'+table+' tr').each(function (i) { 
					$(this).children('td').each(function(){
						var checkbox = $(this).find(':input[name="checkbox"]');
						if(!$(this).attr("ignore")){
			                if(checkbox.val()){
			                	checkbox.attr("onclick","check.cbCk("+i+")");
			                }else{
			                	$(this).attr("onclick","check.trCk("+i+")");
			                }
						}
		           });
		       });
			},
			selectAllBox:function(checked){
				var trs = $("tr[class=tr]");//所有tr
				var checkbox = $("input[name='checkbox']");
				if(checked){
					checkbox.attr("checked","true");
					trs.css("background","#D8F79D");
				}else{
					checkbox.removeAttr("checked");
					trs.css("background","");
				}
			},
			selectValue:function(opt,n){//返回选中项的值
				if(!opt){opt = ",";}
				if(!n){n="checkbox";}
				var checkbox = $("input[name='"+n+"']:checked");
				var val=new Array();
				checkbox.each(function(i){ //由于复选框一般选中的是多个,所以可以循环输出
					val.push($(this).val());
				});
				return val.join(opt);
			},
			selectFirst:function(){//获取选中的第一项
				return $("input[name='checkbox']:checked").val();
			},
			divCk:function(id,clz){
				$("."+clz).css('backgroundColor','');
				$('#checkbox'+id).attr("checked","checked");
				$("#tr"+id).css('backgroundColor','#D8F79D');
				/*if($('#checkbox'+id).attr("checked")){
				}*/
			}
	};
	function selectAllBox(checked,tag,clz){
		if(!clz) clz = "tr";
		if(!tag) tag = "tr";
		var trs = $(tag+"[class="+clz+"]");//所有tr
		var checkbox = $("input[name='checkbox']");
		if(checked){
			checkbox.attr("checked","true");
			trs.css("background","#D8F79D");
		}else{
			checkbox.removeAttr("checked");
			trs.css("background","");
		}
	}