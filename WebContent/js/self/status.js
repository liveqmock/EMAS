var taskStatus={
	show : function(id){
		var content = $("#" +id).text();
		$.jBox(content,{title:"详细信息","top":"10%","width":800,"height":500});
	},
	showOrHide : function(id){
		var a = $("#a"+id);
		var div = $("#id"+id);
		var display = div.css("display");
		if("none" == display){
			div.css("display","");
			a.text("关闭");
		}else{
			div.css("display","none");
			a.text("打开");
		}
	},
	checked : function(nid,carid,caid,contractid,sIndex,sid,opt){
		var s = $("#status"+sIndex).text();
		var r = $("#remark"+sIndex).text();
		if(!s) s = "";
		if(!r) r = "";
		if(!sid) sid = "";
		var select = "selected='selected'";
		var html = "<form id='form1'>";
		html += "<input name='fnodeid' value='"+nid+"' type='hidden'>";
		if(caid){
			html += "<input name='fcontractadvresourceid' value='"+carid+"' type='hidden'>";
			html += "<input name='id' value='"+sid+"' type='hidden'>";
			html += "<input name='fcontractadvid' value='"+caid+"' type='hidden'>";
			html += "<input name='fcontractid' value='"+contractid+"' type='hidden'>";
		}else{
			html += "<input name='freleaseversionid' value='"+carid+"' type='hidden'>";
		}
		html += '<label for="fstatus">审核状态：</label><select name="fstatus" id="fstatus"><option value="1" '+(s==1 ? select : '')+'>通过</option><option value="2" '+(s==2 ? select : '')+'>不通过</option></select>';
		html += '<br/><br/><textarea name="fremark" cols="56" rows="6">'+r+'</textarea></form>';
		var kdialog = null;
		kdialog = KindEditor.dialog({
			width : 450,
			height : 240,
			title : '广告审核',
			body : '<div id="txt_source_div" style="padding:0px;height:100%;overflow:auto;overflow-x:hidden;margin:15px;">'+html+'</div>',
			shadowMode : true,
			closeBtn : {name : '关闭',click : function(e) {kdialog.remove();}},
			noBtn : {name : '关闭',click : function(e) {kdialog.remove();}},
			yesBtn : {name : '提交',click : function(e) {taskStatus.submitForm(opt);}}
		});
	},
	/**
	 * 审核
	 */
//	cheched : function(id,ftype,data,cid,sid){
//		var html = '';
//		var height = 550;
//		var branchid = "";
//		var top = "10%";
//		var source = data.source;
//		if (ftype && source) {
//			branchid = source.fbranchid;
//			cid = source.fcontractid;
//			var url = "/EAMS/"+source.fpath;
//			var playHtml = mediaPlayer(url,320, 200,0,0);
//			html += '<div style="border:1px solid #B4C9C6;padding : 1px;"><style>td{border:1px solid #B4C9C6}</style><label style="text-align: center;width:100%;font-size: 16px">广告基本信息</label><table style="width:100%" cellpadding="0" cellspacing="0" border="1" rules="none">';
////			<img src="/EAMS/'+source.fpath+'" width="120" height="90">
//			html += '<tr height="31"><td rowspan="7">'+playHtml+'</td><td>广告名称:</td><td>'+source.fname+'</td><tr>';
//			html += '<tr height="31"><td>广告位:</td><td>'+source.ftype+'</td></tr>';
//			html += '<tr height="31"><td>频道名:</td><td>'+source.fchannel+'</td></tr>';
//			html += '<tr height="31"><td>业务号:</td><td>'+source.fservice+'</td></tr>';
//			html += '<tr height="31"><td>时间段:</td><td>'+source.fstarttime+'-'+source.fendtime+'</td></tr>';
//			html += '<tr height="31"><td>创建用户:</td><td>'+source.fuser+'</td></tr></table></div>';
//			height = 420;
//		} else {
//			top = "1%";
//			var contract = data.contract;
//			cid = contract.id;
//			branchid = contract.fbranchid;
//			html = '<div style="border:1px solid #B4C9C6;padding : 1px;"><style>td{border:1px solid #B4C9C6;font-size:13px;}th{border:1px solid #B4C9C6;font-size:14px;}</style><div style="text-align: center;width:100%;font-size: 20px">合同基本信息</div><table style="width:100%" cellpadding="0" cellspacing="0" border="1" rules="none">';
//			html += '<tr><th>合同编号：</th><td>'+contract.fguid+'</td><th>合同名称：</th><td>'+contract.ftitle+'</td><th>解析度：</th><td>'+contract.fdefinition+'</td><th>广告商：</th><td>'+contract.fadvname+'</td></tr>';
//			html += '<tr><th>广告位：</th><td>'+data.adv.ftype+'</td><th>广告级别：</th><td>'+contract.fadvlevel+'</td><th>代理商：</th><td>'+contract.fagent+'</td><th>联系人：</th><td>'+contract.fcontactname+'</th></tr>';
//			html += '<tr><th>联系电话：</th><td>'+contract.fcontacttel+'</td><th>单价：</th><td>￥'+contract.fprice+'元</td><th>折扣：</th><td>'+contract.fdiscount+'</td><th>付款方式：</th><td>'+contract.fpayway+'</td></tr>';
//			html += '<th>起始日期：</th><td>'+contract.fstarttime+'</td><th>终止日期：</th><td>'+contract.fendtime+'</td><td colspan="4"></td></tr></table>';
//			html += '<label style="text-align: center;width:100%;font-size: 16px;">合同内容</label><br/><div style="padding:0px;height:245px;overflow:auto;overflow-x:hidden;word-break:break-all;">'+contract.fcontent+'</div></div>';
//		}
//		var status = data.status;
//		if(!status){
//			status = {"fremark":"","fstatus":1,"id":''};
//		}
//		var select = 'selected="selected"';
//		html += '<div style="border:1px solid #B4C9C6; margin:1px;padding : 1px;"><form name="form1" id="form1"><label style="text-align: center;width:100%;font-size: 20px">审核操作</label><br/><input type="hidden" name="fusernodeid" value="'+id+'">';
//		html += '<input name="id" value="'+status.id+'" type="hidden"><input name="fsourceid" value="'+sid+'" type="hidden"><input name="fcontractid" value="'+cid+'" type="hidden"><input name="fbranchid" value="'+branchid+'" type="hidden">'; 	
//		html += '<table style="width:100%" cellpadding="0" cellspacing="0" border="0" rules="none"><tr><td style="border:0px;">审核状态：<select name="fstatus" id="fstatus"><option value="1" '+(status.fstatus==1 ? select : '')+'>通过</option><option value="2" '+(status.fstatus==2 ? select : '')+'>不通过</option></select></td>';
//		html += '<td style="border:0px;"><textarea name="fremark" cols="70" rows="3">'+status.fremark+'</textarea></td></tr></table></form></div>';
//		
//		$.jBox(html,{
//			title:"详细信息",
//			width:750,
//			height:height,
//			top:top,
//			submit:function(){
//				taskStatus.submitForm(cid,sid,ftype);
//			}
//		});
//		/*var kdialog = null;
//		kdialog = KindEditor.dialog({
//			width : 750,
//			height : height,
//			title : '详细信息',
//			body : '<div id="txt_source_div" style="padding:0px;height:100%;overflow:auto;overflow-x:hidden;margin:15px;">'+html+'</div>',
//			shadowMode : true,
//			closeBtn : {name : '关闭',click : function(e) {kdialog.remove();}},
//			noBtn : {name : '关闭',click : function(e) {kdialog.remove();}},
//			yesBtn : {name : '提交',click : function(e) {taskStatus.submitForm(cid);}}
//		});*/
//	},
	/**
	 * 加载数据
	 * @param id 用户节点
	 * @param ftype 合同/广告
	 * @param sid 广告索引
	 * @param cid 合同索引
	 */
	/*loadSourceOrContract : function(id,ftype,statusId,cid,sid,branchid){
		//异步查询
		$.post("selectByChecked",{"sid":sid,"cid":cid,"type":ftype,"statusId":statusId,"fbranchid":branchid},function(data,status){
			if(status){
				taskStatus.cheched(id, ftype,data,cid,sid);
			}else{
				$.jBox.tip('数据加载失败','error'); 
			}
		},"json");
	},*/
	submitForm : function(opt){
		var uri = "insert";
		if(opt) uri = "update";
		$("#form1").ajaxSubmit({
			url:uri,
			type:'post',
			dataType:'json',
			success:function(data){
				$.jBox.tip('操作成功','success');
//				window.location.reload();
				parent.window.location.reload();
				window.close();
				_waiting._hide();
			},
			error:function(msg){
				$.jBox.tip('操作失败','error'); 
				_waiting._hide();
			}
		});
	}
};