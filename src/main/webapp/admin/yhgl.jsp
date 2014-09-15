<%@ page language="java" pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(function() {
		$('#dddd').panel();

		$('#admin_yhgl_datagrid').datagrid({
			url : '${pageContext.request.contextPath}/userAction!dataGrid.action',
			columns : [ [ {
				field : 'code',
				title : 'Code',
				width : 100
			}, {
				field : 'name',
				title : 'Name',
				width : 100
			}, {
				field : 'price',
				title : 'Price',
				width : 100,
				align : 'right'
			} ] ]
		});

	});
</script>
<div id="dddd" data-options="title:'alsdfjklskadfj'">
	asldkfsldjkaf
	<button onclick="$.messager.alert('title','msdjfksdjfkjs');">click...</button>
</div>
<table id="admin_yhgl_datagrid"></table>
