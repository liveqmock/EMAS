<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE jsp:include PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${rc.contextPath}/style/status.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${rc.contextPath}/js/self/play.js"></script>
<style type="text/css">
a {font-size: 12px;}
</style>
<title>审核流程</title>
<jsp:include page="../css.jsp" />
</head>
<body>
	<div class="content">
		<div class="nav" id="nav_logo"></div>
		<div id="data">
			<div class="table">
				<table border="0" cellpadding="0" cellspacing="0" rules="none">
					<c:if test="${not empty contract}">
						<thead><tr height="30"><th colspan="3"><div style="text-align: center;width:100%;font-size: 20px">合同基本信息</div></th></tr></thead>
						<tr><td rowspan="7" width="400" height="130">
							<script type="text/javascript">
								var play = playHtml("${rc.contextPath}/${resource.fpath}","${resource.fwidth}", "${resource.fheight}",400,130);
								document.write(play);
							</script>
						</td><td><b>合同编号：</b>${contract.fguid}</td><td><b>合同名称：</b>${contract.ftitle}</td></tr>
						<tr height="30"><td><b>广告商：</b>${contract.fadvname}</td><td><b>广告级别：</b>${contract.fadvlevel}</td></tr>
						<tr height="30"><td><b>联系人：</b>${contract.fcontactname}</td><td><b>联系电话：</b>${contract.fcontacttel}</td></tr>
						<tr height="30"><td><b>单价：</b>${contract.fprice}</td><td><b>折扣：</b>${contract.fdiscount}</td></tr>
						<tr height="30"><td><b>广告位：</b>${contractAdv.ftype}</td><td><b>解析度：</b>${contractAdv.fdefinition}</td></tr>
						<tr height="30"><td><b>代理商：</b>${contract.fagent}</td><td><b>付款方式：</b>${contract.fpayway}</td></tr>
						<tr height="30"><td><b>起始日期：</b>${contract.fstarttime}</td><td><b>终止日期：</b>${contract.fendtime}</td></tr>
					</c:if>
					<c:if test="${not empty version}">
						<tr height="30"><td width="30%"><b>版本号：</b>${version.fversion}</td><td><b>创建时间：</b>${version.fcreatetime}</td></tr>
						<tr height="30"><td><b>发布人：</b>${version.userName}</td><td><b>分公司：</b>${version.branch}</td></tr>
						<tr height="30"><td><b>版本状态：</b>${version.fstatus == 0 ? '待发布' : version.fstatus == 1 ? '发布成功' : '未通过审核'}</td><td><b>版本描述：</b>${version.fdesc}</td></tr>
					</c:if>
				</table>
				<table border="0" cellpadding="0" cellspacing="0" rules="none">
					<c:set var="bool" value="true"></c:set>
					<c:forEach var="n" items="${nodes}" varStatus="statusIndex">
						<tr>
							<td width="200" align="center" style="border: 0px;">
								<div class="raised">
									<b class="b1"></b><b class="b2"></b><b class="b3"></b><b class="b4"></b>
									<div class="boxcontent">
										<h1>${n.fname}</h1>
									</div>
									<b class="b4b"></b><b class="b3b"></b><b class="b2b"></b><b class="b1b"></b>
								</div>
							</td>
							<td width="100" align="center" style="border: 0px;"><img src="${rc.contextPath}/images/right.jpg"></td>
							<td align="center" style="border: 1px;">
								<div class="raised">
									<b class="b1"></b><b class="b2"></b><b class="b3"></b><b class="b4"></b>
									<div class="raisedcontent">
										<div style="font-size:12px; vertical-align: bottom;">
											<c:if test="${not empty n.fstatus}">
								 				&nbsp;&nbsp;&nbsp;<strong>操作人：</strong>${n.userName} <strong>操作时间：</strong>${n.fcreatetime}
								 				<strong>状态：</strong><c:if test="${n.fstatus==1}"><font color="blue">通过</font></c:if><c:if test="${n.fstatus==2}"><font color="red">未通过</font></c:if>
								 				<%-- <div style="text-align: right; float: right;"><a href="javascript:void(0)" onclick="taskStatus.showOrHide('${statusIndex.index}')" id="a${statusIndex.index}">打开</a></div> --%>
								 				<c:if test="${n.fstatus==2}">
								 					<c:if test="${bool && (((n.fusergroupid == USERLOGIN.fusergroupid) && ((n.fisprovincecompany==1 && USERLOGIN.fbranchid==1) || n.fisprovincecompany==0)) || ((1 == USERLOGIN.fusergroupid) && (USERLOGIN.id==1)))}">
														<div id="status${statusIndex.index}" style="display: none;">${n.fstatus}</div>
														<div id="remark${statusIndex.index}" style="display: none;">${n.fremark}</div>
														<c:if test="${n.fischecked==1 || n.fischecked==2}">
															<c:if test="${not empty car}">
																<div style="text-align: right; vertical-align: bottom;"><a href="javascript:void(0)" onclick="taskStatus.checked(${n.id},${car.id},${car.fcontractadvid},${contract.id})">审核</a></div>
															</c:if>
															<c:if test="${empty car}">
																<div style="text-align: right; vertical-align: bottom;"><a href="javascript:void(0)" onclick="taskStatus.checked(${n.id},${version.id})">审核</a></div>
															</c:if>
														</c:if>
														<c:if test="${n.fischecked==0}">
															<div style="text-align: right; vertical-align: bottom;">请至编辑页面编辑</div>
														</c:if>
													</c:if>
													<c:set var="bool" value="false"></c:set>
								 				</c:if>
								 				<div style="clear: both;"></div>
								 				<div id="id${statusIndex.index}" style="display: '';"><strong>备注：</strong>
								 					<c:if test="${fn:length (n.fremark) > 220}">
								 						${fn:substring(n.fremark,0,220)}...
								 						<div id="div${statusIndex.index}" style="display: none;">${n.fremark}</div>
								 						<a href="javascript:void(0);" onclick="taskStatus.show('div${statusIndex.index}')">打开更多</a>
								 					</c:if>
								 					<c:if test="${fn:length (n.fremark) <= 220}">${n.fremark}</c:if>
								 				</div>
											</c:if>
											<c:if test="${empty n.fstatus}">
												&nbsp;&nbsp;&nbsp;<font color="red">待处理</font>
								 				<c:if test="${bool && (((n.fusergroupid == USERLOGIN.fusergroupid) && ((n.fisprovincecompany==1 && USERLOGIN.fbranchid==1) || n.fisprovincecompany==0)) || ((1 == USERLOGIN.fusergroupid) && (USERLOGIN.id==1)))}">
													<c:if test="${n.fischecked==1 || n.fischecked==2}">
														<%-- <div style="text-align: right; vertical-align: bottom;"><a href="javascript:void(0)" onclick="taskStatus.checked(${n.id},${car.id},${car.fcontractadvid},${contract.id})">审核</a></div> --%>
														<c:if test="${not empty car}">
															<div style="text-align: right; vertical-align: bottom;"><a href="javascript:void(0)" onclick="taskStatus.checked(${n.id},${car.id},${car.fcontractadvid},${contract.id})">审核</a></div>
														</c:if>
														<c:if test="${empty car}">
															<div style="text-align: right; vertical-align: bottom;"><a href="javascript:void(0)" onclick="taskStatus.checked(${n.id},${version.id})">审核</a></div>
														</c:if>
													</c:if>
													<c:if test="${n.fischecked==0}">
														<div style="text-align: right; vertical-align: bottom;">请至编辑页面编辑</div>
													</c:if>
												</c:if>
												<c:set var="bool" value="false"></c:set>
											</c:if>
							 			</div>
									</div>
									<b class="b4b"></b><b class="b3b"></b><b class="b2b"></b><b class="b1b"></b>
								</div>
							</td>
						</tr>
						<c:if test="${!statusIndex.last}">
							<tr>
								<td width="200" align="center" style="border: 0px;">
									<div class="raised"><img src="${rc.contextPath}/images/down.jpg" height="30"></div>
								</td>
								<td width="100" align="center" style="border: 0px;"></td>
								<td align="center" style="border: 1px;"></td>
							</tr>
						</c:if>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
<jsp:include page="../contentHead.jsp" />
<script type="text/javascript" src="${rc.contextPath}/js/self/status.js"></script>
<script type="text/javascript">
	navTag("广告管理&gt;广告审批流程");
</script>
</body>
</html>