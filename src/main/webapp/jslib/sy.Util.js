	$.extend($.fn.validatebox.defaults.rules, {
		eqPwd : {
			validator : function(value, param) {
				console.info(param[0]);
				console.info($(param[0]).val());
				return value == $(param[0]).val();
			},
			message : 'pwd not eq'
		}
	});