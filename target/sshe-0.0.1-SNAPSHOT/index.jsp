<%@ page language="java" pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript"
	src="jslib/jquery-easyui-1.3.6/jquery.min.js"></script>
<script type="text/javascript"
	src="jslib/jquery-easyui-1.3.6/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="jslib/jquery-easyui-1.3.6/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet"
	href="jslib/jquery-easyui-1.3.6/themes/default/easyui.css"
	type="text/css"></link>
<link rel="stylesheet" href="jslib/jquery-easyui-1.3.6/themes/icon.css"
	type="text/css"></link>
<script type="text/javascript" src="jslib/sy.Util.js"></script>
<script type="text/javascript">


</script>
</head>

<body class="easyui-layout">
	<div data-options="region:'north',title:'North Title',split:true"
		style="height: 60px;"></div>
	<div data-options="region:'south',title:'South Title',split:true"
		style="height: 20px;"></div>
	<div data-options="region:'east',title:'East',split:true"
		style="width: 60px;"></div>
	<div data-options="region:'west',split:true" style="width: 60px;">
		<div class="easyui-pannel"
			data-options="title:'sss',boader:false,fit:true"></div>
	</div>
	<div data-options="region:'center',title:'center title'"></div>

	<div class="easyui-dialog" title="登陆"
		data-options="iconCls:'icon-save',resizable:true,modal:true,closable:false,
			buttons:[{
				text:'regist',
				iconCls:'icon-edit',
				handler:function(){$('#index_regDialog').dialog('open');}
			},{
				text:'Help',
				iconCls:'icon-help',
				handler:function(){alert('help')}
			}]">
		<table>
			<tr>
				<th>登陆名</th>
				<td><input /></td>
			</tr>
			<tr>
				<th>密码</th>
				<td><input /></td>
			</tr>
		</table>
	</div>
	<div id="index_regDialog" class="easyui-dialog" title="注册"
		style="width: 250px"
		data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,
			buttons:[{
				text:'提交',
				iconCls:'icon-edit',
				handler:function(){$('#index_regForm').submit();}
			}]">
		<form id="index_regForm" action="${pageContext.request.contextPath}/UserAction!reg.action" method="post">
			<table>
				<tr>
					<th>注册名</th>
					<td><input name="name " class="easyui-validatebox"
						data-options="required:true" missingMessage="need pram" />
					</td>
				</tr>
				<tr>
					<th>密码</th>
					<td><input name="pwd " class="easyui-validatebox"
						data-options="required:true" />
					</td>
				</tr>
				<tr>
					<th>重复密码</th>
					<td><input name="rPwd " class="easyui-validatebox"
						data-options="required:true, validType:'eqPwd[\'#index_regForm input[name=pwd]\']'" />
					</td>
				</tr>
			</table>
		</form>

	</div>
</body>
</html>
