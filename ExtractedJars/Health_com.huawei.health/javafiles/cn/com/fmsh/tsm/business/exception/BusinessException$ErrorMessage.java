// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.exception;


// Referenced classes of package cn.com.fmsh.tsm.business.exception:
//			BusinessException

public static final class BusinessException$ErrorMessage extends Enum
{
	static final class ErrorType extends Enum
	{

		public static ErrorType valueOf(String s)
		{
			return (ErrorType)Enum.valueOf(cn/com/fmsh/tsm/business/exception/BusinessException$ErrorMessage$ErrorType, s);
		//    0    0:ldc1            #2   <Class BusinessException$ErrorMessage$ErrorType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #37  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class BusinessException$ErrorMessage$ErrorType>
		//    4    9:areturn         
		}

		public static ErrorType[] values()
		{
			ErrorType aerrortype[] = ENUM$VALUES;
		//    0    0:getstatic       #30  <Field BusinessException$ErrorMessage$ErrorType[] ENUM$VALUES>
		//    1    3:astore_1        
			int i = aerrortype.length;
		//    2    4:aload_1         
		//    3    5:arraylength     
		//    4    6:istore_0        
			ErrorType aerrortype1[] = new ErrorType[i];
		//    5    7:iload_0         
		//    6    8:anewarray       ErrorType[]
		//    7   11:astore_2        
			System.arraycopy(((Object) (aerrortype)), 0, ((Object) (aerrortype1)), 0, i);
		//    8   12:aload_1         
		//    9   13:iconst_0        
		//   10   14:aload_2         
		//   11   15:iconst_0        
		//   12   16:iload_0         
		//   13   17:invokestatic    #45  <Method void System.arraycopy(Object, int, Object, int, int)>
			return aerrortype1;
		//   14   20:aload_2         
		//   15   21:areturn         
		}

		private static final ErrorType ENUM$VALUES[];
		public static final ErrorType local;
		public static final ErrorType remote;

		static 
		{
			local = new ErrorType("local", 0);
		//    0    0:new             #2   <Class BusinessException$ErrorMessage$ErrorType>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "local">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void BusinessException$ErrorMessage$ErrorType(String, int)>
		//    5   10:putstatic       #25  <Field BusinessException$ErrorMessage$ErrorType local>
			remote = new ErrorType("remote", 1);
		//    6   13:new             #2   <Class BusinessException$ErrorMessage$ErrorType>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "remote">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void BusinessException$ErrorMessage$ErrorType(String, int)>
		//   11   23:putstatic       #28  <Field BusinessException$ErrorMessage$ErrorType remote>
			ENUM$VALUES = (new ErrorType[] {
				local, remote
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       ErrorType[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #25  <Field BusinessException$ErrorMessage$ErrorType local>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #28  <Field BusinessException$ErrorMessage$ErrorType remote>
		//   21   41:aastore         
		//   22   42:putstatic       #30  <Field BusinessException$ErrorMessage$ErrorType[] ENUM$VALUES>
		//*  23   45:return          
		}

		private ErrorType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #32  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public static BusinessException$ErrorMessage instance(String s)
	{
		BusinessException$ErrorMessage abusinessexception$errormessage[] = values();
	//    0    0:invokestatic    #1189 <Method BusinessException$ErrorMessage[] values()>
	//    1    3:astore_3        
		int j = abusinessexception$errormessage.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int i = 0; i < j; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            36
		{
			BusinessException$ErrorMessage businessexception$errormessage = abusinessexception$errormessage[i];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(businessexception$errormessage.getId().equals(((Object) (s))))
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #1193 <Method String getId()>
	//*  14   22:aload_0         
	//*  15   23:invokevirtual   #1199 <Method boolean String.equals(Object)>
	//*  16   26:ifeq            32
				return businessexception$errormessage;
	//   17   29:aload           4
	//   18   31:areturn         
		}

	//   19   32:iload_1         
	//   20   33:iconst_1        
	//   21   34:iadd            
	//   22   35:istore_1        
	//   23   36:iload_1         
	//   24   37:iload_2         
	//   25   38:icmplt          12
		return business_system_unknow_error;
	//   26   41:getstatic       #576 <Field BusinessException$ErrorMessage business_system_unknow_error>
	//   27   44:areturn         
	}

	public static BusinessException$ErrorMessage valueOf(String s)
	{
		return (BusinessException$ErrorMessage)Enum.valueOf(cn/com/fmsh/tsm/business/exception/BusinessException$ErrorMessage, s);
	//    0    0:ldc1            #2   <Class BusinessException$ErrorMessage>
	//    1    2:aload_0         
	//    2    3:invokestatic    #1203 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class BusinessException$ErrorMessage>
	//    4    9:areturn         
	}

	public static BusinessException$ErrorMessage[] values()
	{
		BusinessException$ErrorMessage abusinessexception$errormessage[] = ENUM$VALUES;
	//    0    0:getstatic       #1173 <Field BusinessException$ErrorMessage[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = abusinessexception$errormessage.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		BusinessException$ErrorMessage abusinessexception$errormessage1[] = new BusinessException$ErrorMessage[i];
	//    5    7:iload_0         
	//    6    8:anewarray       BusinessException$ErrorMessage[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (abusinessexception$errormessage)), 0, ((Object) (abusinessexception$errormessage1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #1209 <Method void System.arraycopy(Object, int, Object, int, int)>
		return abusinessexception$errormessage1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #1183 <Field String desc>
	//    2    4:areturn         
	}

	public String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #1179 <Field String id>
	//    2    4:areturn         
	}

	public ErrorType getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #1181 <Field BusinessException$ErrorMessage$ErrorType type>
	//    2    4:areturn         
	}

	private static final BusinessException$ErrorMessage ENUM$VALUES[];
	public static final BusinessException$ErrorMessage OT_AC_REQUEST_NOTICE;
	public static final BusinessException$ErrorMessage OT_APPLY_SIR_FAIL;
	public static final BusinessException$ErrorMessage OT_BUSY;
	public static final BusinessException$ErrorMessage OT_CHECK_FAIL;
	public static final BusinessException$ErrorMessage OT_STATE_CHANGE_NOTICE;
	public static final BusinessException$ErrorMessage ack_card_app_order_fail;
	public static final BusinessException$ErrorMessage ack_card_app_unorder_fail;
	public static final BusinessException$ErrorMessage ack_card_app_unpersonal;
	public static final BusinessException$ErrorMessage ack_card_app_unprepare;
	public static final BusinessException$ErrorMessage amount_invalid;
	public static final BusinessException$ErrorMessage apdu_exec_fail;
	public static final BusinessException$ErrorMessage apdu_result_ffff;
	public static final BusinessException$ErrorMessage app_issuer_fail;
	public static final BusinessException$ErrorMessage app_move_code_invalid;
	public static final BusinessException$ErrorMessage business_1920_unknow;
	public static final BusinessException$ErrorMessage business_business_no_support;
	public static final BusinessException$ErrorMessage business_business_stop;
	public static final BusinessException$ErrorMessage business_business_will_exist;
	public static final BusinessException$ErrorMessage business_interface_version_error;
	public static final BusinessException$ErrorMessage business_invalid_message_format;
	public static final BusinessException$ErrorMessage business_invalid_message_length;
	public static final BusinessException$ErrorMessage business_invalid_message_type;
	public static final BusinessException$ErrorMessage business_invalid_terminal;
	public static final BusinessException$ErrorMessage business_merchants_not_exist;
	public static final BusinessException$ErrorMessage business_message_check_fail;
	public static final BusinessException$ErrorMessage business_message_invalid_serial;
	public static final BusinessException$ErrorMessage business_operate_timeout;
	public static final BusinessException$ErrorMessage business_order_amount_inconsistent;
	public static final BusinessException$ErrorMessage business_order_apply_no_pay;
	public static final BusinessException$ErrorMessage business_order_apply_refund;
	public static final BusinessException$ErrorMessage business_order_card_no_inconsistent;
	public static final BusinessException$ErrorMessage business_order_codenot_exist;
	public static final BusinessException$ErrorMessage business_order_invoice;
	public static final BusinessException$ErrorMessage business_order_no_invoice;
	public static final BusinessException$ErrorMessage business_order_no_refund;
	public static final BusinessException$ErrorMessage business_order_not_exist;
	public static final BusinessException$ErrorMessage business_order_pay_no_write;
	public static final BusinessException$ErrorMessage business_order_paying;
	public static final BusinessException$ErrorMessage business_order_recharge_sucess;
	public static final BusinessException$ErrorMessage business_order_recharget_fail;
	public static final BusinessException$ErrorMessage business_order_rechargeting;
	public static final BusinessException$ErrorMessage business_order_refund;
	public static final BusinessException$ErrorMessage business_order_unsettled_exist;
	public static final BusinessException$ErrorMessage business_platform_busy;
	public static final BusinessException$ErrorMessage business_repeat_message;
	public static final BusinessException$ErrorMessage business_serial_not_exist;
	public static final BusinessException$ErrorMessage business_system_error;
	public static final BusinessException$ErrorMessage business_system_unknow_error;
	public static final BusinessException$ErrorMessage business_trade_timeout;
	public static final BusinessException$ErrorMessage business_unsettled_overrun;
	public static final BusinessException$ErrorMessage card_balance_overrun;
	public static final BusinessException$ErrorMessage card_invaild_check;
	public static final BusinessException$ErrorMessage card_invalid;
	public static final BusinessException$ErrorMessage card_not_order;
	public static final BusinessException$ErrorMessage card_order_by_other;
	public static final BusinessException$ErrorMessage ese_no_space;
	public static final BusinessException$ErrorMessage invaild_personalization_info;
	public static final BusinessException$ErrorMessage load_more;
	public static final BusinessException$ErrorMessage local_apdu_reponse_invalid;
	public static final BusinessException$ErrorMessage local_app_config_invaild_content;
	public static final BusinessException$ErrorMessage local_app_load_config_fail;
	public static final BusinessException$ErrorMessage local_app_query_app_no_fail;
	public static final BusinessException$ErrorMessage local_app_query_server_fail;
	public static final BusinessException$ErrorMessage local_business_apdu_handler_busying;
	public static final BusinessException$ErrorMessage local_business_apdu_handler_null;
	public static final BusinessException$ErrorMessage local_business_cancel;
	public static final BusinessException$ErrorMessage local_business_execute_fail;
	public static final BusinessException$ErrorMessage local_business_init_fail;
	public static final BusinessException$ErrorMessage local_business_local_data_handler_null;
	public static final BusinessException$ErrorMessage local_business_no_card_app_type;
	public static final BusinessException$ErrorMessage local_business_para_error;
	public static final BusinessException$ErrorMessage local_communication_connect_fail;
	public static final BusinessException$ErrorMessage local_communication_connect_param_error;
	public static final BusinessException$ErrorMessage local_communication_disconnect_fail;
	public static final BusinessException$ErrorMessage local_communication_invalid_control;
	public static final BusinessException$ErrorMessage local_communication_invalid_direction;
	public static final BusinessException$ErrorMessage local_communication_invalid_format;
	public static final BusinessException$ErrorMessage local_communication_invalid_response;
	public static final BusinessException$ErrorMessage local_communication_invalid_session;
	public static final BusinessException$ErrorMessage local_communication_invalid_session_serial;
	public static final BusinessException$ErrorMessage local_communication_invalid_verify;
	public static final BusinessException$ErrorMessage local_communication_invalid_version;
	public static final BusinessException$ErrorMessage local_communication_no_key;
	public static final BusinessException$ErrorMessage local_communication_no_response;
	public static final BusinessException$ErrorMessage local_communication_register_notify_exception;
	public static final BusinessException$ErrorMessage local_communication_request_param_error;
	public static final BusinessException$ErrorMessage local_communication_sign_in_fail;
	public static final BusinessException$ErrorMessage local_communication_sign_out_fail;
	public static final BusinessException$ErrorMessage local_get_app_info_fail;
	public static final BusinessException$ErrorMessage local_get_app_info_no_sptcc;
	public static final BusinessException$ErrorMessage local_message_apdu_execute_exception;
	public static final BusinessException$ErrorMessage local_message_command_data_invaild;
	public static final BusinessException$ErrorMessage local_message_load_config_fail;
	public static final BusinessException$ErrorMessage local_message_message_handle_exception;
	public static final BusinessException$ErrorMessage local_message_open_mobile_exception;
	public static final BusinessException$ErrorMessage local_message_platform_business_handle_fail;
	public static final BusinessException$ErrorMessage move_user_no_issure;
	public static final BusinessException$ErrorMessage no_activity;
	public static final BusinessException$ErrorMessage no_stock;
	public static final BusinessException$ErrorMessage no_suppert_in_card;
	public static final BusinessException$ErrorMessage no_suppert_out_card;
	public static final BusinessException$ErrorMessage not_support_retrieve_email;
	public static final BusinessException$ErrorMessage order_amount_low;
	public static final BusinessException$ErrorMessage order_apply_frequent;
	public static final BusinessException$ErrorMessage pasm_overrun;
	public static final BusinessException$ErrorMessage sptc_app_not_issuer;
	public static final BusinessException$ErrorMessage sptc_close_exception;
	public static final BusinessException$ErrorMessage sptc_data_not_matching;
	public static final BusinessException$ErrorMessage sptc_open_exception;
	public static final BusinessException$ErrorMessage sptc_personalization;
	public static final BusinessException$ErrorMessage sptc_personalization_fail;
	public static final BusinessException$ErrorMessage third_seq_repeat;
	public static final BusinessException$ErrorMessage trade_act_check_fail;
	public static final BusinessException$ErrorMessage trade_act_used;
	public static final BusinessException$ErrorMessage trade_fail;
	public static final BusinessException$ErrorMessage trade_handling;
	public static final BusinessException$ErrorMessage trade_not_exist;
	public static final BusinessException$ErrorMessage trade_sucess;
	public static final BusinessException$ErrorMessage user_auth_code_expire;
	public static final BusinessException$ErrorMessage user_auth_code_invalid;
	public static final BusinessException$ErrorMessage user_auth_code_mobile_invalid;
	public static final BusinessException$ErrorMessage user_auth_code_type_invalid;
	public static final BusinessException$ErrorMessage user_freeze;
	public static final BusinessException$ErrorMessage user_get_password_count_exceed;
	public static final BusinessException$ErrorMessage user_id_not_matching;
	public static final BusinessException$ErrorMessage user_incorrect_password;
	public static final BusinessException$ErrorMessage user_info_incomplete;
	public static final BusinessException$ErrorMessage user_locked;
	public static final BusinessException$ErrorMessage user_logout;
	public static final BusinessException$ErrorMessage user_not_login;
	public static final BusinessException$ErrorMessage user_not_sign;
	public static final BusinessException$ErrorMessage user_order_fail;
	public static final BusinessException$ErrorMessage user_order_invaild_info;
	public static final BusinessException$ErrorMessage user_order_no_open;
	public static final BusinessException$ErrorMessage user_order_open;
	public static final BusinessException$ErrorMessage user_register;
	public static final BusinessException$ErrorMessage user_severance;
	public static final BusinessException$ErrorMessage user_sign_apply;
	public static final BusinessException$ErrorMessage user_sign_fail;
	public static final BusinessException$ErrorMessage user_sign_sucess;
	public static final BusinessException$ErrorMessage user_unregistered;
	public static final BusinessException$ErrorMessage user_unsubscribe_closed;
	public static final BusinessException$ErrorMessage user_unsubscribe_fail;
	private String desc;
	private String id;
	private ErrorType type;

	static 
	{
		local_business_cancel = new BusinessException$ErrorMessage("local_business_cancel", 0, "9001", ErrorType.local, "\u4E1A\u52A1\u5904\u7406\u8FC7\u7A0B\u4E2D\uFF0C\u63A5\u6536\u5230\u53D6\u6D88\u6307\u4EE4");
	//    0    0:new             #2   <Class BusinessException$ErrorMessage>
	//    1    3:dup             
	//    2    4:ldc1            #165 <String "local_business_cancel">
	//    3    6:iconst_0        
	//    4    7:ldc1            #167 <String "9001">
	//    5    9:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//    6   12:ldc1            #172 <String "\u4E1A\u52A1\u5904\u7406\u8FC7\u7A0B\u4E2D\uFF0C\u63A5\u6536\u5230\u53D6\u6D88\u6307\u4EE4">
	//    7   14:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//    8   17:putstatic       #178 <Field BusinessException$ErrorMessage local_business_cancel>
		local_business_apdu_handler_null = new BusinessException$ErrorMessage("local_business_apdu_handler_null", 1, "9002", ErrorType.local, "APDU\u6307\u4EE4\u5904\u7406\u5668\u672A\u6CE8\u518C");
	//    9   20:new             #2   <Class BusinessException$ErrorMessage>
	//   10   23:dup             
	//   11   24:ldc1            #179 <String "local_business_apdu_handler_null">
	//   12   26:iconst_1        
	//   13   27:ldc1            #181 <String "9002">
	//   14   29:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//   15   32:ldc1            #183 <String "APDU\u6307\u4EE4\u5904\u7406\u5668\u672A\u6CE8\u518C">
	//   16   34:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//   17   37:putstatic       #185 <Field BusinessException$ErrorMessage local_business_apdu_handler_null>
		local_business_execute_fail = new BusinessException$ErrorMessage("local_business_execute_fail", 2, "9003", ErrorType.local, "APDU\u6307\u4EE4\u5904\u7406\u5668\u5904\u7406APDU\u8BF7\u6C42\u5931\u8D25");
	//   18   40:new             #2   <Class BusinessException$ErrorMessage>
	//   19   43:dup             
	//   20   44:ldc1            #186 <String "local_business_execute_fail">
	//   21   46:iconst_2        
	//   22   47:ldc1            #188 <String "9003">
	//   23   49:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//   24   52:ldc1            #190 <String "APDU\u6307\u4EE4\u5904\u7406\u5668\u5904\u7406APDU\u8BF7\u6C42\u5931\u8D25">
	//   25   54:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//   26   57:putstatic       #192 <Field BusinessException$ErrorMessage local_business_execute_fail>
		local_business_init_fail = new BusinessException$ErrorMessage("local_business_init_fail", 3, "9004", ErrorType.local, "\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25");
	//   27   60:new             #2   <Class BusinessException$ErrorMessage>
	//   28   63:dup             
	//   29   64:ldc1            #193 <String "local_business_init_fail">
	//   30   66:iconst_3        
	//   31   67:ldc1            #195 <String "9004">
	//   32   69:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//   33   72:ldc1            #197 <String "\u4E1A\u52A1\u5904\u7406\u5668\u521D\u59CB\u5316\u5931\u8D25">
	//   34   74:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//   35   77:putstatic       #199 <Field BusinessException$ErrorMessage local_business_init_fail>
		local_business_no_card_app_type = new BusinessException$ErrorMessage("local_business_no_card_app_type", 4, "9005", ErrorType.local, "\u6CA1\u6709\u5BF9\u5E94\u7C7B\u578B\u7684\u5361");
	//   36   80:new             #2   <Class BusinessException$ErrorMessage>
	//   37   83:dup             
	//   38   84:ldc1            #200 <String "local_business_no_card_app_type">
	//   39   86:iconst_4        
	//   40   87:ldc1            #202 <String "9005">
	//   41   89:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//   42   92:ldc1            #204 <String "\u6CA1\u6709\u5BF9\u5E94\u7C7B\u578B\u7684\u5361">
	//   43   94:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//   44   97:putstatic       #206 <Field BusinessException$ErrorMessage local_business_no_card_app_type>
		local_business_apdu_handler_busying = new BusinessException$ErrorMessage("local_business_apdu_handler_busying", 5, "9006", ErrorType.local, "APDU\u6307\u4EE4\u5904\u7406\u5668\u6B63\u5FD9");
	//   45  100:new             #2   <Class BusinessException$ErrorMessage>
	//   46  103:dup             
	//   47  104:ldc1            #207 <String "local_business_apdu_handler_busying">
	//   48  106:iconst_5        
	//   49  107:ldc1            #209 <String "9006">
	//   50  109:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//   51  112:ldc1            #211 <String "APDU\u6307\u4EE4\u5904\u7406\u5668\u6B63\u5FD9">
	//   52  114:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//   53  117:putstatic       #213 <Field BusinessException$ErrorMessage local_business_apdu_handler_busying>
		local_message_platform_business_handle_fail = new BusinessException$ErrorMessage("local_message_platform_business_handle_fail", 6, "9007", ErrorType.local, "\u5E73\u53F0\u5904\u7406\u4E1A\u52A1\u5931\u8D25");
	//   54  120:new             #2   <Class BusinessException$ErrorMessage>
	//   55  123:dup             
	//   56  124:ldc1            #214 <String "local_message_platform_business_handle_fail">
	//   57  126:bipush          6
	//   58  128:ldc1            #216 <String "9007">
	//   59  130:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//   60  133:ldc1            #218 <String "\u5E73\u53F0\u5904\u7406\u4E1A\u52A1\u5931\u8D25">
	//   61  135:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//   62  138:putstatic       #220 <Field BusinessException$ErrorMessage local_message_platform_business_handle_fail>
		local_business_local_data_handler_null = new BusinessException$ErrorMessage("local_business_local_data_handler_null", 7, "9008", ErrorType.local, "\u672C\u5730\u6570\u636E\u5904\u7406\u5668\u4E3A\u7A7A");
	//   63  141:new             #2   <Class BusinessException$ErrorMessage>
	//   64  144:dup             
	//   65  145:ldc1            #221 <String "local_business_local_data_handler_null">
	//   66  147:bipush          7
	//   67  149:ldc1            #223 <String "9008">
	//   68  151:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//   69  154:ldc1            #225 <String "\u672C\u5730\u6570\u636E\u5904\u7406\u5668\u4E3A\u7A7A">
	//   70  156:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//   71  159:putstatic       #227 <Field BusinessException$ErrorMessage local_business_local_data_handler_null>
		local_business_para_error = new BusinessException$ErrorMessage("local_business_para_error", 8, "9009", ErrorType.local, "\u51FD\u6570\u8C03\u7528\u65F6\uFF0C\u53C2\u6570\u5F02\u5E38");
	//   72  162:new             #2   <Class BusinessException$ErrorMessage>
	//   73  165:dup             
	//   74  166:ldc1            #228 <String "local_business_para_error">
	//   75  168:bipush          8
	//   76  170:ldc1            #230 <String "9009">
	//   77  172:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//   78  175:ldc1            #232 <String "\u51FD\u6570\u8C03\u7528\u65F6\uFF0C\u53C2\u6570\u5F02\u5E38">
	//   79  177:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//   80  180:putstatic       #234 <Field BusinessException$ErrorMessage local_business_para_error>
		local_communication_connect_fail = new BusinessException$ErrorMessage("local_communication_connect_fail", 9, "9010", ErrorType.local, "\u7EC8\u7AEF\u548C\u5E73\u53F0\u7684\u94FE\u63A5\u5931\u8D25");
	//   81  183:new             #2   <Class BusinessException$ErrorMessage>
	//   82  186:dup             
	//   83  187:ldc1            #235 <String "local_communication_connect_fail">
	//   84  189:bipush          9
	//   85  191:ldc1            #237 <String "9010">
	//   86  193:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//   87  196:ldc1            #239 <String "\u7EC8\u7AEF\u548C\u5E73\u53F0\u7684\u94FE\u63A5\u5931\u8D25">
	//   88  198:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//   89  201:putstatic       #241 <Field BusinessException$ErrorMessage local_communication_connect_fail>
		local_communication_connect_param_error = new BusinessException$ErrorMessage("local_communication_connect_param_error", 10, "9011", ErrorType.local, "\u7EC8\u7AEF\u5411\u5E73\u53F0\u94FE\u63A5\u8BF7\u6C42\u65F6\uFF0C\u4F20\u5165\u7684\u5E73\u53F0\u94FE\u63A5\u4FE1\u606F\u65E0\u6548");
	//   90  204:new             #2   <Class BusinessException$ErrorMessage>
	//   91  207:dup             
	//   92  208:ldc1            #242 <String "local_communication_connect_param_error">
	//   93  210:bipush          10
	//   94  212:ldc1            #244 <String "9011">
	//   95  214:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//   96  217:ldc1            #246 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u94FE\u63A5\u8BF7\u6C42\u65F6\uFF0C\u4F20\u5165\u7684\u5E73\u53F0\u94FE\u63A5\u4FE1\u606F\u65E0\u6548">
	//   97  219:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//   98  222:putstatic       #248 <Field BusinessException$ErrorMessage local_communication_connect_param_error>
		local_communication_disconnect_fail = new BusinessException$ErrorMessage("local_communication_disconnect_fail", 11, "9012", ErrorType.local, "\u7EC8\u7AEF\u5173\u95ED\u5230\u7EC8\u7AEF\u7684\u94FE\u63A5\u51FA\u73B0\u5F02\u5E38");
	//   99  225:new             #2   <Class BusinessException$ErrorMessage>
	//  100  228:dup             
	//  101  229:ldc1            #249 <String "local_communication_disconnect_fail">
	//  102  231:bipush          11
	//  103  233:ldc1            #251 <String "9012">
	//  104  235:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  105  238:ldc1            #253 <String "\u7EC8\u7AEF\u5173\u95ED\u5230\u7EC8\u7AEF\u7684\u94FE\u63A5\u51FA\u73B0\u5F02\u5E38">
	//  106  240:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  107  243:putstatic       #255 <Field BusinessException$ErrorMessage local_communication_disconnect_fail>
		local_communication_sign_in_fail = new BusinessException$ErrorMessage("local_communication_sign_in_fail", 12, "9013", ErrorType.local, "\u7EC8\u7AEF\u7B7E\u5230\u5931\u8D25");
	//  108  246:new             #2   <Class BusinessException$ErrorMessage>
	//  109  249:dup             
	//  110  250:ldc2            #256 <String "local_communication_sign_in_fail">
	//  111  253:bipush          12
	//  112  255:ldc2            #258 <String "9013">
	//  113  258:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  114  261:ldc2            #260 <String "\u7EC8\u7AEF\u7B7E\u5230\u5931\u8D25">
	//  115  264:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  116  267:putstatic       #262 <Field BusinessException$ErrorMessage local_communication_sign_in_fail>
		local_communication_request_param_error = new BusinessException$ErrorMessage("local_communication_request_param_error", 13, "9014", ErrorType.local, "\u7EC8\u7AEF\u5411\u5E73\u53F0\u4E1A\u52A1\u8BF7\u6C42\u65F6\uFF0C\u7EC8\u7AEF\u6307\u4EE4\u65E0\u6548");
	//  117  270:new             #2   <Class BusinessException$ErrorMessage>
	//  118  273:dup             
	//  119  274:ldc2            #263 <String "local_communication_request_param_error">
	//  120  277:bipush          13
	//  121  279:ldc2            #265 <String "9014">
	//  122  282:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  123  285:ldc2            #267 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u4E1A\u52A1\u8BF7\u6C42\u65F6\uFF0C\u7EC8\u7AEF\u6307\u4EE4\u65E0\u6548">
	//  124  288:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  125  291:putstatic       #269 <Field BusinessException$ErrorMessage local_communication_request_param_error>
		local_communication_no_response = new BusinessException$ErrorMessage("local_communication_no_response", 14, "9017", ErrorType.local, "\u7EC8\u7AEF\u672A\u6536\u5230\u5E73\u53F0\u7684\u5E94\u7B54\u6570\u636E");
	//  126  294:new             #2   <Class BusinessException$ErrorMessage>
	//  127  297:dup             
	//  128  298:ldc2            #270 <String "local_communication_no_response">
	//  129  301:bipush          14
	//  130  303:ldc2            #272 <String "9017">
	//  131  306:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  132  309:ldc2            #274 <String "\u7EC8\u7AEF\u672A\u6536\u5230\u5E73\u53F0\u7684\u5E94\u7B54\u6570\u636E">
	//  133  312:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  134  315:putstatic       #276 <Field BusinessException$ErrorMessage local_communication_no_response>
		local_communication_invalid_version = new BusinessException$ErrorMessage("local_communication_invalid_version", 15, "9018", ErrorType.local, "\u7EC8\u7AEF\u901A\u4FE1\u5305\u7684\u7248\u672C\u65E0\u6548");
	//  135  318:new             #2   <Class BusinessException$ErrorMessage>
	//  136  321:dup             
	//  137  322:ldc2            #277 <String "local_communication_invalid_version">
	//  138  325:bipush          15
	//  139  327:ldc2            #279 <String "9018">
	//  140  330:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  141  333:ldc2            #281 <String "\u7EC8\u7AEF\u901A\u4FE1\u5305\u7684\u7248\u672C\u65E0\u6548">
	//  142  336:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  143  339:putstatic       #283 <Field BusinessException$ErrorMessage local_communication_invalid_version>
		local_communication_invalid_format = new BusinessException$ErrorMessage("local_communication_invalid_format", 16, "9019", ErrorType.local, "\u7EC8\u7AEF\u8BF7\u6C42\u6570\u636E\u683C\u5F0F\u65E0\u6548");
	//  144  342:new             #2   <Class BusinessException$ErrorMessage>
	//  145  345:dup             
	//  146  346:ldc2            #284 <String "local_communication_invalid_format">
	//  147  349:bipush          16
	//  148  351:ldc2            #286 <String "9019">
	//  149  354:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  150  357:ldc2            #288 <String "\u7EC8\u7AEF\u8BF7\u6C42\u6570\u636E\u683C\u5F0F\u65E0\u6548">
	//  151  360:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  152  363:putstatic       #290 <Field BusinessException$ErrorMessage local_communication_invalid_format>
		local_communication_invalid_verify = new BusinessException$ErrorMessage("local_communication_invalid_verify", 17, "9020", ErrorType.local, "\u62A5\u6587\u68C0\u9A8C\u5931\u8D25");
	//  153  366:new             #2   <Class BusinessException$ErrorMessage>
	//  154  369:dup             
	//  155  370:ldc2            #291 <String "local_communication_invalid_verify">
	//  156  373:bipush          17
	//  157  375:ldc2            #293 <String "9020">
	//  158  378:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  159  381:ldc2            #295 <String "\u62A5\u6587\u68C0\u9A8C\u5931\u8D25">
	//  160  384:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  161  387:putstatic       #297 <Field BusinessException$ErrorMessage local_communication_invalid_verify>
		local_communication_invalid_control = new BusinessException$ErrorMessage("local_communication_invalid_control", 18, "9021", ErrorType.local, "\u65E0\u6548\u7684\u62A5\u6587\u63A7\u5236\u5B57");
	//  162  390:new             #2   <Class BusinessException$ErrorMessage>
	//  163  393:dup             
	//  164  394:ldc2            #298 <String "local_communication_invalid_control">
	//  165  397:bipush          18
	//  166  399:ldc2            #300 <String "9021">
	//  167  402:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  168  405:ldc2            #302 <String "\u65E0\u6548\u7684\u62A5\u6587\u63A7\u5236\u5B57">
	//  169  408:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  170  411:putstatic       #304 <Field BusinessException$ErrorMessage local_communication_invalid_control>
		local_communication_invalid_session = new BusinessException$ErrorMessage("local_communication_invalid_session", 19, "9022", ErrorType.local, "\u65E0\u6548\u7684\u4F1A\u8BDD");
	//  171  414:new             #2   <Class BusinessException$ErrorMessage>
	//  172  417:dup             
	//  173  418:ldc2            #305 <String "local_communication_invalid_session">
	//  174  421:bipush          19
	//  175  423:ldc2            #307 <String "9022">
	//  176  426:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  177  429:ldc2            #309 <String "\u65E0\u6548\u7684\u4F1A\u8BDD">
	//  178  432:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  179  435:putstatic       #311 <Field BusinessException$ErrorMessage local_communication_invalid_session>
		local_communication_invalid_session_serial = new BusinessException$ErrorMessage("local_communication_invalid_session_serial", 20, "9023", ErrorType.local, "\u4F1A\u8BDD\u6D41\u6C34\u9519\u8BEF");
	//  180  438:new             #2   <Class BusinessException$ErrorMessage>
	//  181  441:dup             
	//  182  442:ldc2            #312 <String "local_communication_invalid_session_serial">
	//  183  445:bipush          20
	//  184  447:ldc2            #314 <String "9023">
	//  185  450:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  186  453:ldc2            #316 <String "\u4F1A\u8BDD\u6D41\u6C34\u9519\u8BEF">
	//  187  456:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  188  459:putstatic       #318 <Field BusinessException$ErrorMessage local_communication_invalid_session_serial>
		local_communication_invalid_direction = new BusinessException$ErrorMessage("local_communication_invalid_direction", 21, "9024", ErrorType.local, "\u4F1A\u8BDD\u6D41\u6C34\u9519\u8BEF");
	//  189  462:new             #2   <Class BusinessException$ErrorMessage>
	//  190  465:dup             
	//  191  466:ldc2            #319 <String "local_communication_invalid_direction">
	//  192  469:bipush          21
	//  193  471:ldc2            #321 <String "9024">
	//  194  474:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  195  477:ldc2            #316 <String "\u4F1A\u8BDD\u6D41\u6C34\u9519\u8BEF">
	//  196  480:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  197  483:putstatic       #323 <Field BusinessException$ErrorMessage local_communication_invalid_direction>
		local_communication_invalid_response = new BusinessException$ErrorMessage("local_communication_invalid_response", 22, "9025", ErrorType.local, "\u901A\u8BAF\u5E94\u7B54\u6570\u636E\u65E0\u6548");
	//  198  486:new             #2   <Class BusinessException$ErrorMessage>
	//  199  489:dup             
	//  200  490:ldc2            #324 <String "local_communication_invalid_response">
	//  201  493:bipush          22
	//  202  495:ldc2            #326 <String "9025">
	//  203  498:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  204  501:ldc2            #328 <String "\u901A\u8BAF\u5E94\u7B54\u6570\u636E\u65E0\u6548">
	//  205  504:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  206  507:putstatic       #330 <Field BusinessException$ErrorMessage local_communication_invalid_response>
		local_communication_no_key = new BusinessException$ErrorMessage("local_communication_no_key", 23, "9027", ErrorType.local, "\u901A\u4FE1\u65F6\uFF0C\u672A\u627E\u4E0D\u5230\u901A\u4FE1\u516C\u94A5");
	//  207  510:new             #2   <Class BusinessException$ErrorMessage>
	//  208  513:dup             
	//  209  514:ldc2            #331 <String "local_communication_no_key">
	//  210  517:bipush          23
	//  211  519:ldc2            #333 <String "9027">
	//  212  522:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  213  525:ldc2            #335 <String "\u901A\u4FE1\u65F6\uFF0C\u672A\u627E\u4E0D\u5230\u901A\u4FE1\u516C\u94A5">
	//  214  528:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  215  531:putstatic       #337 <Field BusinessException$ErrorMessage local_communication_no_key>
		local_communication_sign_out_fail = new BusinessException$ErrorMessage("local_communication_sign_out_fail", 24, "9028", ErrorType.local, "\u7B7E\u9000\u5931\u8D25");
	//  216  534:new             #2   <Class BusinessException$ErrorMessage>
	//  217  537:dup             
	//  218  538:ldc2            #338 <String "local_communication_sign_out_fail">
	//  219  541:bipush          24
	//  220  543:ldc2            #340 <String "9028">
	//  221  546:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  222  549:ldc2            #342 <String "\u7B7E\u9000\u5931\u8D25">
	//  223  552:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  224  555:putstatic       #344 <Field BusinessException$ErrorMessage local_communication_sign_out_fail>
		local_communication_register_notify_exception = new BusinessException$ErrorMessage("local_communication_register_notify_exception", 25, "9030", ErrorType.local, "\u901A\u4FE1\u6D88\u606F\u5904\u7406\u5668\u6CE8\u518C\u5F02\u5E38");
	//  225  558:new             #2   <Class BusinessException$ErrorMessage>
	//  226  561:dup             
	//  227  562:ldc2            #345 <String "local_communication_register_notify_exception">
	//  228  565:bipush          25
	//  229  567:ldc2            #347 <String "9030">
	//  230  570:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  231  573:ldc2            #349 <String "\u901A\u4FE1\u6D88\u606F\u5904\u7406\u5668\u6CE8\u518C\u5F02\u5E38">
	//  232  576:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  233  579:putstatic       #351 <Field BusinessException$ErrorMessage local_communication_register_notify_exception>
		local_message_load_config_fail = new BusinessException$ErrorMessage("local_message_load_config_fail", 26, "9050", ErrorType.local, "\u52A0\u8F7DMessage\u914D\u7F6E\u6587\u4EF6\u5931\u8D25");
	//  234  582:new             #2   <Class BusinessException$ErrorMessage>
	//  235  585:dup             
	//  236  586:ldc2            #352 <String "local_message_load_config_fail">
	//  237  589:bipush          26
	//  238  591:ldc2            #354 <String "9050">
	//  239  594:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  240  597:ldc2            #356 <String "\u52A0\u8F7DMessage\u914D\u7F6E\u6587\u4EF6\u5931\u8D25">
	//  241  600:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  242  603:putstatic       #358 <Field BusinessException$ErrorMessage local_message_load_config_fail>
		local_message_command_data_invaild = new BusinessException$ErrorMessage("local_message_command_data_invaild", 27, "9051", ErrorType.local, "\u65E0\u6548\u7684\u5E73\u53F0\u54CD\u5E94\u6570\u636E");
	//  243  606:new             #2   <Class BusinessException$ErrorMessage>
	//  244  609:dup             
	//  245  610:ldc2            #359 <String "local_message_command_data_invaild">
	//  246  613:bipush          27
	//  247  615:ldc2            #361 <String "9051">
	//  248  618:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  249  621:ldc2            #363 <String "\u65E0\u6548\u7684\u5E73\u53F0\u54CD\u5E94\u6570\u636E">
	//  250  624:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  251  627:putstatic       #365 <Field BusinessException$ErrorMessage local_message_command_data_invaild>
		local_message_apdu_execute_exception = new BusinessException$ErrorMessage("local_message_apdu_execute_exception", 28, "9053", ErrorType.local, "APDU\u6307\u4EE4\u6267\u884C\u5F02\u5E38");
	//  252  630:new             #2   <Class BusinessException$ErrorMessage>
	//  253  633:dup             
	//  254  634:ldc2            #366 <String "local_message_apdu_execute_exception">
	//  255  637:bipush          28
	//  256  639:ldc2            #368 <String "9053">
	//  257  642:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  258  645:ldc2            #370 <String "APDU\u6307\u4EE4\u6267\u884C\u5F02\u5E38">
	//  259  648:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  260  651:putstatic       #372 <Field BusinessException$ErrorMessage local_message_apdu_execute_exception>
		local_message_message_handle_exception = new BusinessException$ErrorMessage("local_message_message_handle_exception", 29, "9054", ErrorType.local, "Message\u5904\u7406\u51FA\u73B0\u5F02\u5E38");
	//  261  654:new             #2   <Class BusinessException$ErrorMessage>
	//  262  657:dup             
	//  263  658:ldc2            #373 <String "local_message_message_handle_exception">
	//  264  661:bipush          29
	//  265  663:ldc2            #375 <String "9054">
	//  266  666:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  267  669:ldc2            #377 <String "Message\u5904\u7406\u51FA\u73B0\u5F02\u5E38">
	//  268  672:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  269  675:putstatic       #379 <Field BusinessException$ErrorMessage local_message_message_handle_exception>
		local_message_open_mobile_exception = new BusinessException$ErrorMessage("local_message_open_mobile_exception", 30, "9055", ErrorType.local, "Open mobile\u51FA\u73B0\u5F02\u5E38");
	//  270  678:new             #2   <Class BusinessException$ErrorMessage>
	//  271  681:dup             
	//  272  682:ldc2            #380 <String "local_message_open_mobile_exception">
	//  273  685:bipush          30
	//  274  687:ldc2            #382 <String "9055">
	//  275  690:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  276  693:ldc2            #384 <String "Open mobile\u51FA\u73B0\u5F02\u5E38">
	//  277  696:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  278  699:putstatic       #386 <Field BusinessException$ErrorMessage local_message_open_mobile_exception>
		local_get_app_info_fail = new BusinessException$ErrorMessage("local_get_app_info_fail", 31, "9080", ErrorType.local, "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u4FE1\u606F\u5931\u8D25");
	//  279  702:new             #2   <Class BusinessException$ErrorMessage>
	//  280  705:dup             
	//  281  706:ldc2            #387 <String "local_get_app_info_fail">
	//  282  709:bipush          31
	//  283  711:ldc2            #389 <String "9080">
	//  284  714:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  285  717:ldc2            #391 <String "\u83B7\u53D6\u5361\u4E0A\u5E94\u7528\u4FE1\u606F\u5931\u8D25">
	//  286  720:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  287  723:putstatic       #393 <Field BusinessException$ErrorMessage local_get_app_info_fail>
		local_apdu_reponse_invalid = new BusinessException$ErrorMessage("local_apdu_reponse_invalid", 32, "9081", ErrorType.local, "apdu\u6307\u4EE4\u7684\u54CD\u5E94\u65E0\u6548");
	//  288  726:new             #2   <Class BusinessException$ErrorMessage>
	//  289  729:dup             
	//  290  730:ldc2            #394 <String "local_apdu_reponse_invalid">
	//  291  733:bipush          32
	//  292  735:ldc2            #396 <String "9081">
	//  293  738:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  294  741:ldc2            #398 <String "apdu\u6307\u4EE4\u7684\u54CD\u5E94\u65E0\u6548">
	//  295  744:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  296  747:putstatic       #400 <Field BusinessException$ErrorMessage local_apdu_reponse_invalid>
		local_get_app_info_no_sptcc = new BusinessException$ErrorMessage("local_get_app_info_no_sptcc", 33, "9082", ErrorType.local, "\u4E0D\u662F\u4E0A\u6D77\u4EA4\u901A\u5361");
	//  297  750:new             #2   <Class BusinessException$ErrorMessage>
	//  298  753:dup             
	//  299  754:ldc2            #401 <String "local_get_app_info_no_sptcc">
	//  300  757:bipush          33
	//  301  759:ldc2            #403 <String "9082">
	//  302  762:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  303  765:ldc2            #405 <String "\u4E0D\u662F\u4E0A\u6D77\u4EA4\u901A\u5361">
	//  304  768:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  305  771:putstatic       #407 <Field BusinessException$ErrorMessage local_get_app_info_no_sptcc>
		local_app_load_config_fail = new BusinessException$ErrorMessage("local_app_load_config_fail", 34, "9070", ErrorType.local, "\u4E1A\u52A1\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u5931\u8D25");
	//  306  774:new             #2   <Class BusinessException$ErrorMessage>
	//  307  777:dup             
	//  308  778:ldc2            #408 <String "local_app_load_config_fail">
	//  309  781:bipush          34
	//  310  783:ldc2            #410 <String "9070">
	//  311  786:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  312  789:ldc2            #412 <String "\u4E1A\u52A1\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u5931\u8D25">
	//  313  792:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  314  795:putstatic       #414 <Field BusinessException$ErrorMessage local_app_load_config_fail>
		local_app_config_invaild_content = new BusinessException$ErrorMessage("local_app_config_invaild_content", 35, "9071", ErrorType.local, "\u4E1A\u52A1\u914D\u7F6E\u6587\u4EF6\u5185\u5BB9\u65E0\u6548");
	//  315  798:new             #2   <Class BusinessException$ErrorMessage>
	//  316  801:dup             
	//  317  802:ldc2            #415 <String "local_app_config_invaild_content">
	//  318  805:bipush          35
	//  319  807:ldc2            #417 <String "9071">
	//  320  810:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  321  813:ldc2            #419 <String "\u4E1A\u52A1\u914D\u7F6E\u6587\u4EF6\u5185\u5BB9\u65E0\u6548">
	//  322  816:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  323  819:putstatic       #421 <Field BusinessException$ErrorMessage local_app_config_invaild_content>
		local_app_query_app_no_fail = new BusinessException$ErrorMessage("local_app_query_app_no_fail", 36, "9072", ErrorType.local, "\u7EC8\u7AEF\u83B7\u53D6\u5361\u7684\u5E94\u7528\u5E8F\u5217\u53F7\u5931\u8D25");
	//  324  822:new             #2   <Class BusinessException$ErrorMessage>
	//  325  825:dup             
	//  326  826:ldc2            #422 <String "local_app_query_app_no_fail">
	//  327  829:bipush          36
	//  328  831:ldc2            #424 <String "9072">
	//  329  834:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  330  837:ldc2            #426 <String "\u7EC8\u7AEF\u83B7\u53D6\u5361\u7684\u5E94\u7528\u5E8F\u5217\u53F7\u5931\u8D25">
	//  331  840:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  332  843:putstatic       #428 <Field BusinessException$ErrorMessage local_app_query_app_no_fail>
		local_app_query_server_fail = new BusinessException$ErrorMessage("local_app_query_server_fail", 37, "9073", ErrorType.local, "\u6839\u636E\u6839\u636E\u4E1A\u52A1\u4FE1\u606F\u83B7\u53D6\u5F85\u8BBF\u95EE\u7684\u5E73\u53F0\u5931\u8D25");
	//  333  846:new             #2   <Class BusinessException$ErrorMessage>
	//  334  849:dup             
	//  335  850:ldc2            #429 <String "local_app_query_server_fail">
	//  336  853:bipush          37
	//  337  855:ldc2            #431 <String "9073">
	//  338  858:getstatic       #170 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.local>
	//  339  861:ldc2            #433 <String "\u6839\u636E\u6839\u636E\u4E1A\u52A1\u4FE1\u606F\u83B7\u53D6\u5F85\u8BBF\u95EE\u7684\u5E73\u53F0\u5931\u8D25">
	//  340  864:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  341  867:putstatic       #435 <Field BusinessException$ErrorMessage local_app_query_server_fail>
		business_order_codenot_exist = new BusinessException$ErrorMessage("business_order_codenot_exist", 38, "0001", ErrorType.remote, "\u4EA4\u6613\u4EE3\u7801\u4E0D\u5B58\u5728");
	//  342  870:new             #2   <Class BusinessException$ErrorMessage>
	//  343  873:dup             
	//  344  874:ldc2            #436 <String "business_order_codenot_exist">
	//  345  877:bipush          38
	//  346  879:ldc2            #438 <String "0001">
	//  347  882:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  348  885:ldc2            #443 <String "\u4EA4\u6613\u4EE3\u7801\u4E0D\u5B58\u5728">
	//  349  888:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  350  891:putstatic       #445 <Field BusinessException$ErrorMessage business_order_codenot_exist>
		business_invalid_message_format = new BusinessException$ErrorMessage("business_invalid_message_format", 39, "0002", ErrorType.remote, "\u62A5\u6587\u683C\u5F0F\u9519\u8BEF");
	//  351  894:new             #2   <Class BusinessException$ErrorMessage>
	//  352  897:dup             
	//  353  898:ldc2            #446 <String "business_invalid_message_format">
	//  354  901:bipush          39
	//  355  903:ldc2            #448 <String "0002">
	//  356  906:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  357  909:ldc2            #450 <String "\u62A5\u6587\u683C\u5F0F\u9519\u8BEF">
	//  358  912:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  359  915:putstatic       #452 <Field BusinessException$ErrorMessage business_invalid_message_format>
		business_invalid_message_type = new BusinessException$ErrorMessage("business_invalid_message_type", 40, "0003", ErrorType.remote, "\u65E0\u6548\u7684\u6D88\u606F\u7C7B\u578B");
	//  360  918:new             #2   <Class BusinessException$ErrorMessage>
	//  361  921:dup             
	//  362  922:ldc2            #453 <String "business_invalid_message_type">
	//  363  925:bipush          40
	//  364  927:ldc2            #455 <String "0003">
	//  365  930:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  366  933:ldc2            #457 <String "\u65E0\u6548\u7684\u6D88\u606F\u7C7B\u578B">
	//  367  936:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  368  939:putstatic       #459 <Field BusinessException$ErrorMessage business_invalid_message_type>
		business_message_check_fail = new BusinessException$ErrorMessage("business_message_check_fail", 41, "0004", ErrorType.remote, "\u62A5\u6587\u68C0\u9A8C\u5931\u8D25");
	//  369  942:new             #2   <Class BusinessException$ErrorMessage>
	//  370  945:dup             
	//  371  946:ldc2            #460 <String "business_message_check_fail">
	//  372  949:bipush          41
	//  373  951:ldc2            #462 <String "0004">
	//  374  954:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  375  957:ldc2            #295 <String "\u62A5\u6587\u68C0\u9A8C\u5931\u8D25">
	//  376  960:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  377  963:putstatic       #464 <Field BusinessException$ErrorMessage business_message_check_fail>
		business_business_no_support = new BusinessException$ErrorMessage("business_business_no_support", 42, "0005", ErrorType.remote, "\u8BE5\u4E1A\u52A1\u6682\u4E0D\u652F\u6301");
	//  378  966:new             #2   <Class BusinessException$ErrorMessage>
	//  379  969:dup             
	//  380  970:ldc2            #465 <String "business_business_no_support">
	//  381  973:bipush          42
	//  382  975:ldc2            #467 <String "0005">
	//  383  978:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  384  981:ldc2            #469 <String "\u8BE5\u4E1A\u52A1\u6682\u4E0D\u652F\u6301">
	//  385  984:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  386  987:putstatic       #471 <Field BusinessException$ErrorMessage business_business_no_support>
		business_platform_busy = new BusinessException$ErrorMessage("business_platform_busy", 43, "0006", ErrorType.remote, "\u7CFB\u7EDF\u5FD9,\u8BF7\u7A0D\u5019\u518D\u8BD5");
	//  387  990:new             #2   <Class BusinessException$ErrorMessage>
	//  388  993:dup             
	//  389  994:ldc2            #472 <String "business_platform_busy">
	//  390  997:bipush          43
	//  391  999:ldc2            #474 <String "0006">
	//  392 1002:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  393 1005:ldc2            #476 <String "\u7CFB\u7EDF\u5FD9,\u8BF7\u7A0D\u5019\u518D\u8BD5">
	//  394 1008:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  395 1011:putstatic       #478 <Field BusinessException$ErrorMessage business_platform_busy>
		business_invalid_terminal = new BusinessException$ErrorMessage("business_invalid_terminal", 44, "0007", ErrorType.remote, "\u624B\u673A\u7EC8\u7AEF\u53F7\u65E0\u6548");
	//  396 1014:new             #2   <Class BusinessException$ErrorMessage>
	//  397 1017:dup             
	//  398 1018:ldc2            #479 <String "business_invalid_terminal">
	//  399 1021:bipush          44
	//  400 1023:ldc2            #481 <String "0007">
	//  401 1026:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  402 1029:ldc2            #483 <String "\u624B\u673A\u7EC8\u7AEF\u53F7\u65E0\u6548">
	//  403 1032:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  404 1035:putstatic       #485 <Field BusinessException$ErrorMessage business_invalid_terminal>
		business_operate_timeout = new BusinessException$ErrorMessage("business_operate_timeout", 45, "0008", ErrorType.remote, "\u64CD\u4F5C\u8D85\u65F6\uFF0C\u8BF7\u91CD\u65B0\u767B\u5F55");
	//  405 1038:new             #2   <Class BusinessException$ErrorMessage>
	//  406 1041:dup             
	//  407 1042:ldc2            #486 <String "business_operate_timeout">
	//  408 1045:bipush          45
	//  409 1047:ldc2            #488 <String "0008">
	//  410 1050:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  411 1053:ldc2            #490 <String "\u64CD\u4F5C\u8D85\u65F6\uFF0C\u8BF7\u91CD\u65B0\u767B\u5F55">
	//  412 1056:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  413 1059:putstatic       #492 <Field BusinessException$ErrorMessage business_operate_timeout>
		business_repeat_message = new BusinessException$ErrorMessage("business_repeat_message", 46, "0010", ErrorType.remote, "\u91CD\u590D\u5305");
	//  414 1062:new             #2   <Class BusinessException$ErrorMessage>
	//  415 1065:dup             
	//  416 1066:ldc2            #493 <String "business_repeat_message">
	//  417 1069:bipush          46
	//  418 1071:ldc2            #495 <String "0010">
	//  419 1074:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  420 1077:ldc2            #497 <String "\u91CD\u590D\u5305">
	//  421 1080:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  422 1083:putstatic       #499 <Field BusinessException$ErrorMessage business_repeat_message>
		business_message_invalid_serial = new BusinessException$ErrorMessage("business_message_invalid_serial", 47, "0011", ErrorType.remote, "\u5305\u5E8F\u5217\u53F7\u4E0D\u8FDE\u7EED");
	//  423 1086:new             #2   <Class BusinessException$ErrorMessage>
	//  424 1089:dup             
	//  425 1090:ldc2            #500 <String "business_message_invalid_serial">
	//  426 1093:bipush          47
	//  427 1095:ldc2            #502 <String "0011">
	//  428 1098:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  429 1101:ldc2            #504 <String "\u5305\u5E8F\u5217\u53F7\u4E0D\u8FDE\u7EED">
	//  430 1104:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  431 1107:putstatic       #506 <Field BusinessException$ErrorMessage business_message_invalid_serial>
		business_serial_not_exist = new BusinessException$ErrorMessage("business_serial_not_exist", 48, "0012", ErrorType.remote, "\u539F\u7EC8\u7AEF\u4EA4\u6613\u6D41\u6C34\u53F7\u4E0D\u5B58\u5728");
	//  432 1110:new             #2   <Class BusinessException$ErrorMessage>
	//  433 1113:dup             
	//  434 1114:ldc2            #507 <String "business_serial_not_exist">
	//  435 1117:bipush          48
	//  436 1119:ldc2            #509 <String "0012">
	//  437 1122:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  438 1125:ldc2            #511 <String "\u539F\u7EC8\u7AEF\u4EA4\u6613\u6D41\u6C34\u53F7\u4E0D\u5B58\u5728">
	//  439 1128:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  440 1131:putstatic       #513 <Field BusinessException$ErrorMessage business_serial_not_exist>
		business_system_error = new BusinessException$ErrorMessage("business_system_error", 49, "0014", ErrorType.remote, "\u7CFB\u7EDF\u9519\u8BEF");
	//  441 1134:new             #2   <Class BusinessException$ErrorMessage>
	//  442 1137:dup             
	//  443 1138:ldc2            #514 <String "business_system_error">
	//  444 1141:bipush          49
	//  445 1143:ldc2            #516 <String "0014">
	//  446 1146:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  447 1149:ldc2            #518 <String "\u7CFB\u7EDF\u9519\u8BEF">
	//  448 1152:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  449 1155:putstatic       #520 <Field BusinessException$ErrorMessage business_system_error>
		business_invalid_message_length = new BusinessException$ErrorMessage("business_invalid_message_length", 50, "0015", ErrorType.remote, "\u62A5\u6587\u957F\u5EA6\u9519\u8BEF");
	//  450 1158:new             #2   <Class BusinessException$ErrorMessage>
	//  451 1161:dup             
	//  452 1162:ldc2            #521 <String "business_invalid_message_length">
	//  453 1165:bipush          50
	//  454 1167:ldc2            #523 <String "0015">
	//  455 1170:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  456 1173:ldc2            #525 <String "\u62A5\u6587\u957F\u5EA6\u9519\u8BEF">
	//  457 1176:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  458 1179:putstatic       #527 <Field BusinessException$ErrorMessage business_invalid_message_length>
		business_trade_timeout = new BusinessException$ErrorMessage("business_trade_timeout", 51, "0016", ErrorType.remote, "\u4EA4\u6613\u8D85\u65F6");
	//  459 1182:new             #2   <Class BusinessException$ErrorMessage>
	//  460 1185:dup             
	//  461 1186:ldc2            #528 <String "business_trade_timeout">
	//  462 1189:bipush          51
	//  463 1191:ldc2            #530 <String "0016">
	//  464 1194:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  465 1197:ldc2            #532 <String "\u4EA4\u6613\u8D85\u65F6">
	//  466 1200:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  467 1203:putstatic       #534 <Field BusinessException$ErrorMessage business_trade_timeout>
		business_1920_unknow = new BusinessException$ErrorMessage("business_1920_unknow", 52, "0017", ErrorType.remote, "1920\u672A\u77E5\u9519\u8BEF");
	//  468 1206:new             #2   <Class BusinessException$ErrorMessage>
	//  469 1209:dup             
	//  470 1210:ldc2            #535 <String "business_1920_unknow">
	//  471 1213:bipush          52
	//  472 1215:ldc2            #537 <String "0017">
	//  473 1218:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  474 1221:ldc2            #539 <String "1920\u672A\u77E5\u9519\u8BEF">
	//  475 1224:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  476 1227:putstatic       #541 <Field BusinessException$ErrorMessage business_1920_unknow>
		business_interface_version_error = new BusinessException$ErrorMessage("business_interface_version_error", 53, "0018", ErrorType.remote, "\u4E1A\u52A1\u63A5\u53E3\u7248\u672C\u9519\u8BEF");
	//  477 1230:new             #2   <Class BusinessException$ErrorMessage>
	//  478 1233:dup             
	//  479 1234:ldc2            #542 <String "business_interface_version_error">
	//  480 1237:bipush          53
	//  481 1239:ldc2            #544 <String "0018">
	//  482 1242:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  483 1245:ldc2            #546 <String "\u4E1A\u52A1\u63A5\u53E3\u7248\u672C\u9519\u8BEF">
	//  484 1248:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  485 1251:putstatic       #548 <Field BusinessException$ErrorMessage business_interface_version_error>
		business_merchants_not_exist = new BusinessException$ErrorMessage("business_merchants_not_exist", 54, "0019", ErrorType.remote, "\u5546\u6237\u4E0D\u5B58\u5728");
	//  486 1254:new             #2   <Class BusinessException$ErrorMessage>
	//  487 1257:dup             
	//  488 1258:ldc2            #549 <String "business_merchants_not_exist">
	//  489 1261:bipush          54
	//  490 1263:ldc2            #551 <String "0019">
	//  491 1266:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  492 1269:ldc2            #553 <String "\u5546\u6237\u4E0D\u5B58\u5728">
	//  493 1272:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  494 1275:putstatic       #555 <Field BusinessException$ErrorMessage business_merchants_not_exist>
		business_business_stop = new BusinessException$ErrorMessage("business_business_stop", 55, "0020", ErrorType.remote, "\u5BF9\u8BE5\u5546\u6237\u5DF2\u505C\u6B62\u670D\u52A1");
	//  495 1278:new             #2   <Class BusinessException$ErrorMessage>
	//  496 1281:dup             
	//  497 1282:ldc2            #556 <String "business_business_stop">
	//  498 1285:bipush          55
	//  499 1287:ldc2            #558 <String "0020">
	//  500 1290:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  501 1293:ldc2            #560 <String "\u5BF9\u8BE5\u5546\u6237\u5DF2\u505C\u6B62\u670D\u52A1">
	//  502 1296:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  503 1299:putstatic       #562 <Field BusinessException$ErrorMessage business_business_stop>
		business_business_will_exist = new BusinessException$ErrorMessage("business_business_will_exist", 56, "0021", ErrorType.remote, "\u4E1A\u52A1\u5373\u5C06\u63A8\u51FA\uFF0C\u5C3D\u8BF7\u671F\u5F85");
	//  504 1302:new             #2   <Class BusinessException$ErrorMessage>
	//  505 1305:dup             
	//  506 1306:ldc2            #563 <String "business_business_will_exist">
	//  507 1309:bipush          56
	//  508 1311:ldc2            #565 <String "0021">
	//  509 1314:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  510 1317:ldc2            #567 <String "\u4E1A\u52A1\u5373\u5C06\u63A8\u51FA\uFF0C\u5C3D\u8BF7\u671F\u5F85">
	//  511 1320:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  512 1323:putstatic       #569 <Field BusinessException$ErrorMessage business_business_will_exist>
		business_system_unknow_error = new BusinessException$ErrorMessage("business_system_unknow_error", 57, "0099", ErrorType.remote, "\u7CFB\u7EDF\u672A\u77E5\u9519\u8BEF");
	//  513 1326:new             #2   <Class BusinessException$ErrorMessage>
	//  514 1329:dup             
	//  515 1330:ldc2            #570 <String "business_system_unknow_error">
	//  516 1333:bipush          57
	//  517 1335:ldc2            #572 <String "0099">
	//  518 1338:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  519 1341:ldc2            #574 <String "\u7CFB\u7EDF\u672A\u77E5\u9519\u8BEF">
	//  520 1344:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  521 1347:putstatic       #576 <Field BusinessException$ErrorMessage business_system_unknow_error>
		OT_CHECK_FAIL = new BusinessException$ErrorMessage("OT_CHECK_FAIL", 58, "5011", ErrorType.remote, "\u5E94\u7528\u5B89\u88C5\u51C6\u5907\u672C\u5730\u8D44\u683C\u5BA1\u67E5\u5931\u8D25");
	//  522 1350:new             #2   <Class BusinessException$ErrorMessage>
	//  523 1353:dup             
	//  524 1354:ldc2            #577 <String "OT_CHECK_FAIL">
	//  525 1357:bipush          58
	//  526 1359:ldc2            #579 <String "5011">
	//  527 1362:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  528 1365:ldc2            #581 <String "\u5E94\u7528\u5B89\u88C5\u51C6\u5907\u672C\u5730\u8D44\u683C\u5BA1\u67E5\u5931\u8D25">
	//  529 1368:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  530 1371:putstatic       #583 <Field BusinessException$ErrorMessage OT_CHECK_FAIL>
		OT_APPLY_SIR_FAIL = new BusinessException$ErrorMessage("OT_APPLY_SIR_FAIL", 59, "5012", ErrorType.remote, "\u5411\u6B27\u8D1D\u7279\u7533\u8BF7\u670D\u52A1\u5B9E\u4F8B\u5F15\u7528\u53F7\uFF08sir\uFF09\u5931\u8D25");
	//  531 1374:new             #2   <Class BusinessException$ErrorMessage>
	//  532 1377:dup             
	//  533 1378:ldc2            #584 <String "OT_APPLY_SIR_FAIL">
	//  534 1381:bipush          59
	//  535 1383:ldc2            #586 <String "5012">
	//  536 1386:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  537 1389:ldc2            #588 <String "\u5411\u6B27\u8D1D\u7279\u7533\u8BF7\u670D\u52A1\u5B9E\u4F8B\u5F15\u7528\u53F7\uFF08sir\uFF09\u5931\u8D25">
	//  538 1392:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  539 1395:putstatic       #590 <Field BusinessException$ErrorMessage OT_APPLY_SIR_FAIL>
		OT_STATE_CHANGE_NOTICE = new BusinessException$ErrorMessage("OT_STATE_CHANGE_NOTICE", 60, "5013", ErrorType.remote, "\u5411\u6B27\u8D1D\u7279\u53D1\u8D77\u670D\u52A1\u72B6\u6001\u53D8\u66F4\u901A\u77E5\u5931\u8D25");
	//  540 1398:new             #2   <Class BusinessException$ErrorMessage>
	//  541 1401:dup             
	//  542 1402:ldc2            #591 <String "OT_STATE_CHANGE_NOTICE">
	//  543 1405:bipush          60
	//  544 1407:ldc2            #593 <String "5013">
	//  545 1410:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  546 1413:ldc2            #595 <String "\u5411\u6B27\u8D1D\u7279\u53D1\u8D77\u670D\u52A1\u72B6\u6001\u53D8\u66F4\u901A\u77E5\u5931\u8D25">
	//  547 1416:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  548 1419:putstatic       #597 <Field BusinessException$ErrorMessage OT_STATE_CHANGE_NOTICE>
		OT_AC_REQUEST_NOTICE = new BusinessException$ErrorMessage("OT_AC_REQUEST_NOTICE", 61, "5014", ErrorType.remote, "\u5411\u6B27\u8D1D\u7279\u53D1\u8D77\u643A\u5E26AC\u89C4\u5219\u7684\u5F02\u6B65\u670D\u52A1\u90E8\u7F72\u8BF7\u6C42\u5931\u8D25");
	//  549 1422:new             #2   <Class BusinessException$ErrorMessage>
	//  550 1425:dup             
	//  551 1426:ldc2            #598 <String "OT_AC_REQUEST_NOTICE">
	//  552 1429:bipush          61
	//  553 1431:ldc2            #600 <String "5014">
	//  554 1434:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  555 1437:ldc2            #602 <String "\u5411\u6B27\u8D1D\u7279\u53D1\u8D77\u643A\u5E26AC\u89C4\u5219\u7684\u5F02\u6B65\u670D\u52A1\u90E8\u7F72\u8BF7\u6C42\u5931\u8D25">
	//  556 1440:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  557 1443:putstatic       #604 <Field BusinessException$ErrorMessage OT_AC_REQUEST_NOTICE>
		OT_BUSY = new BusinessException$ErrorMessage("OT_BUSY", 62, "9029", ErrorType.remote, "OT\u5E73\u53F0\u6B63\u5728\u5904\u7406\u5B89\u88C5\u51C6\u5907");
	//  558 1446:new             #2   <Class BusinessException$ErrorMessage>
	//  559 1449:dup             
	//  560 1450:ldc2            #605 <String "OT_BUSY">
	//  561 1453:bipush          62
	//  562 1455:ldc2            #607 <String "9029">
	//  563 1458:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  564 1461:ldc2            #609 <String "OT\u5E73\u53F0\u6B63\u5728\u5904\u7406\u5B89\u88C5\u51C6\u5907">
	//  565 1464:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  566 1467:putstatic       #611 <Field BusinessException$ErrorMessage OT_BUSY>
		user_unregistered = new BusinessException$ErrorMessage("user_unregistered", 63, "1000", ErrorType.remote, "\u7528\u6237\u672A\u6CE8\u518C");
	//  567 1470:new             #2   <Class BusinessException$ErrorMessage>
	//  568 1473:dup             
	//  569 1474:ldc2            #612 <String "user_unregistered">
	//  570 1477:bipush          63
	//  571 1479:ldc2            #614 <String "1000">
	//  572 1482:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  573 1485:ldc2            #616 <String "\u7528\u6237\u672A\u6CE8\u518C">
	//  574 1488:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  575 1491:putstatic       #618 <Field BusinessException$ErrorMessage user_unregistered>
		user_incorrect_password = new BusinessException$ErrorMessage("user_incorrect_password", 64, "1001", ErrorType.remote, "\u7528\u6237\u5BC6\u7801\u4E0D\u6B63\u786E");
	//  576 1494:new             #2   <Class BusinessException$ErrorMessage>
	//  577 1497:dup             
	//  578 1498:ldc2            #619 <String "user_incorrect_password">
	//  579 1501:bipush          64
	//  580 1503:ldc2            #621 <String "1001">
	//  581 1506:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  582 1509:ldc2            #623 <String "\u7528\u6237\u5BC6\u7801\u4E0D\u6B63\u786E">
	//  583 1512:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  584 1515:putstatic       #625 <Field BusinessException$ErrorMessage user_incorrect_password>
		user_not_sign = new BusinessException$ErrorMessage("user_not_sign", 65, "1002", ErrorType.remote, "\u7528\u6237\u672A\u7B7E\u7EA6");
	//  585 1518:new             #2   <Class BusinessException$ErrorMessage>
	//  586 1521:dup             
	//  587 1522:ldc2            #626 <String "user_not_sign">
	//  588 1525:bipush          65
	//  589 1527:ldc2            #628 <String "1002">
	//  590 1530:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  591 1533:ldc2            #630 <String "\u7528\u6237\u672A\u7B7E\u7EA6">
	//  592 1536:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  593 1539:putstatic       #632 <Field BusinessException$ErrorMessage user_not_sign>
		user_sign_apply = new BusinessException$ErrorMessage("user_sign_apply", 66, "1003", ErrorType.remote, "\u7528\u6237\u5728\u7B7E\u7EA6\u7533\u8BF7\u4E2D");
	//  594 1542:new             #2   <Class BusinessException$ErrorMessage>
	//  595 1545:dup             
	//  596 1546:ldc2            #633 <String "user_sign_apply">
	//  597 1549:bipush          66
	//  598 1551:ldc2            #635 <String "1003">
	//  599 1554:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  600 1557:ldc2            #637 <String "\u7528\u6237\u5728\u7B7E\u7EA6\u7533\u8BF7\u4E2D">
	//  601 1560:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  602 1563:putstatic       #639 <Field BusinessException$ErrorMessage user_sign_apply>
		user_sign_fail = new BusinessException$ErrorMessage("user_sign_fail", 67, "1004", ErrorType.remote, "\u7B7E\u7EA6\u5931\u8D25");
	//  603 1566:new             #2   <Class BusinessException$ErrorMessage>
	//  604 1569:dup             
	//  605 1570:ldc2            #640 <String "user_sign_fail">
	//  606 1573:bipush          67
	//  607 1575:ldc2            #642 <String "1004">
	//  608 1578:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  609 1581:ldc2            #644 <String "\u7B7E\u7EA6\u5931\u8D25">
	//  610 1584:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  611 1587:putstatic       #646 <Field BusinessException$ErrorMessage user_sign_fail>
		user_sign_sucess = new BusinessException$ErrorMessage("user_sign_sucess", 68, "1005", ErrorType.remote, "\u7B7E\u7EA6\u5DF2\u6210\u529F");
	//  612 1590:new             #2   <Class BusinessException$ErrorMessage>
	//  613 1593:dup             
	//  614 1594:ldc2            #647 <String "user_sign_sucess">
	//  615 1597:bipush          68
	//  616 1599:ldc2            #649 <String "1005">
	//  617 1602:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  618 1605:ldc2            #651 <String "\u7B7E\u7EA6\u5DF2\u6210\u529F">
	//  619 1608:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  620 1611:putstatic       #653 <Field BusinessException$ErrorMessage user_sign_sucess>
		user_logout = new BusinessException$ErrorMessage("user_logout", 69, "1006", ErrorType.remote, "\u7528\u6237\u5DF2\u6CE8\u9500");
	//  621 1614:new             #2   <Class BusinessException$ErrorMessage>
	//  622 1617:dup             
	//  623 1618:ldc2            #654 <String "user_logout">
	//  624 1621:bipush          69
	//  625 1623:ldc2            #656 <String "1006">
	//  626 1626:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  627 1629:ldc2            #658 <String "\u7528\u6237\u5DF2\u6CE8\u9500">
	//  628 1632:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  629 1635:putstatic       #660 <Field BusinessException$ErrorMessage user_logout>
		user_register = new BusinessException$ErrorMessage("user_register", 70, "1007", ErrorType.remote, "\u7528\u6237\u5DF2\u6CE8\u518C");
	//  630 1638:new             #2   <Class BusinessException$ErrorMessage>
	//  631 1641:dup             
	//  632 1642:ldc2            #661 <String "user_register">
	//  633 1645:bipush          70
	//  634 1647:ldc2            #663 <String "1007">
	//  635 1650:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  636 1653:ldc2            #665 <String "\u7528\u6237\u5DF2\u6CE8\u518C">
	//  637 1656:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  638 1659:putstatic       #667 <Field BusinessException$ErrorMessage user_register>
		user_severance = new BusinessException$ErrorMessage("user_severance", 71, "1008", ErrorType.remote, "\u7528\u6237\u5DF2\u89E3\u7EA6");
	//  639 1662:new             #2   <Class BusinessException$ErrorMessage>
	//  640 1665:dup             
	//  641 1666:ldc2            #668 <String "user_severance">
	//  642 1669:bipush          71
	//  643 1671:ldc2            #670 <String "1008">
	//  644 1674:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  645 1677:ldc2            #672 <String "\u7528\u6237\u5DF2\u89E3\u7EA6">
	//  646 1680:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  647 1683:putstatic       #674 <Field BusinessException$ErrorMessage user_severance>
		user_not_login = new BusinessException$ErrorMessage("user_not_login", 72, "1009", ErrorType.remote, "\u7528\u6237\u672A\u767B\u5F55");
	//  648 1686:new             #2   <Class BusinessException$ErrorMessage>
	//  649 1689:dup             
	//  650 1690:ldc2            #675 <String "user_not_login">
	//  651 1693:bipush          72
	//  652 1695:ldc2            #677 <String "1009">
	//  653 1698:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  654 1701:ldc2            #679 <String "\u7528\u6237\u672A\u767B\u5F55">
	//  655 1704:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  656 1707:putstatic       #681 <Field BusinessException$ErrorMessage user_not_login>
		user_id_not_matching = new BusinessException$ErrorMessage("user_id_not_matching", 73, "1010", ErrorType.remote, "\u7528\u6237\u8EAB\u4EFD\u8BC1\u4FE1\u606F\u4E0D\u5339\u914D");
	//  657 1710:new             #2   <Class BusinessException$ErrorMessage>
	//  658 1713:dup             
	//  659 1714:ldc2            #682 <String "user_id_not_matching">
	//  660 1717:bipush          73
	//  661 1719:ldc2            #684 <String "1010">
	//  662 1722:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  663 1725:ldc2            #686 <String "\u7528\u6237\u8EAB\u4EFD\u8BC1\u4FE1\u606F\u4E0D\u5339\u914D">
	//  664 1728:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  665 1731:putstatic       #688 <Field BusinessException$ErrorMessage user_id_not_matching>
		user_locked = new BusinessException$ErrorMessage("user_locked", 74, "1011", ErrorType.remote, "\u7528\u6237\u5DF2\u9501\u5B9A");
	//  666 1734:new             #2   <Class BusinessException$ErrorMessage>
	//  667 1737:dup             
	//  668 1738:ldc2            #689 <String "user_locked">
	//  669 1741:bipush          74
	//  670 1743:ldc2            #691 <String "1011">
	//  671 1746:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  672 1749:ldc2            #693 <String "\u7528\u6237\u5DF2\u9501\u5B9A">
	//  673 1752:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  674 1755:putstatic       #695 <Field BusinessException$ErrorMessage user_locked>
		user_freeze = new BusinessException$ErrorMessage("user_freeze", 75, "1012", ErrorType.remote, "\u7528\u6237\u5DF2\u51BB\u7ED3");
	//  675 1758:new             #2   <Class BusinessException$ErrorMessage>
	//  676 1761:dup             
	//  677 1762:ldc2            #696 <String "user_freeze">
	//  678 1765:bipush          75
	//  679 1767:ldc2            #698 <String "1012">
	//  680 1770:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  681 1773:ldc2            #700 <String "\u7528\u6237\u5DF2\u51BB\u7ED3">
	//  682 1776:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  683 1779:putstatic       #702 <Field BusinessException$ErrorMessage user_freeze>
		user_get_password_count_exceed = new BusinessException$ErrorMessage("user_get_password_count_exceed", 76, "1013", ErrorType.remote, "\u5BC6\u7801\u627E\u56DE\u5DF2\u7ECF\u8FBE\u5230\u5F53\u65E5\u4E0A\u9650");
	//  684 1782:new             #2   <Class BusinessException$ErrorMessage>
	//  685 1785:dup             
	//  686 1786:ldc2            #703 <String "user_get_password_count_exceed">
	//  687 1789:bipush          76
	//  688 1791:ldc2            #705 <String "1013">
	//  689 1794:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  690 1797:ldc2            #707 <String "\u5BC6\u7801\u627E\u56DE\u5DF2\u7ECF\u8FBE\u5230\u5F53\u65E5\u4E0A\u9650">
	//  691 1800:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  692 1803:putstatic       #709 <Field BusinessException$ErrorMessage user_get_password_count_exceed>
		user_info_incomplete = new BusinessException$ErrorMessage("user_info_incomplete", 77, "1014", ErrorType.remote, "\u7528\u6237\u6CE8\u518C\u4FE1\u606F\u4E0D\u5B8C\u6574\uFF0C\u8BF7\u8865\u5145\u767B\u8BB0\u76F8\u5173\u4FE1\u606F");
	//  693 1806:new             #2   <Class BusinessException$ErrorMessage>
	//  694 1809:dup             
	//  695 1810:ldc2            #710 <String "user_info_incomplete">
	//  696 1813:bipush          77
	//  697 1815:ldc2            #712 <String "1014">
	//  698 1818:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  699 1821:ldc2            #714 <String "\u7528\u6237\u6CE8\u518C\u4FE1\u606F\u4E0D\u5B8C\u6574\uFF0C\u8BF7\u8865\u5145\u767B\u8BB0\u76F8\u5173\u4FE1\u606F">
	//  700 1824:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  701 1827:putstatic       #716 <Field BusinessException$ErrorMessage user_info_incomplete>
		user_auth_code_invalid = new BusinessException$ErrorMessage("user_auth_code_invalid", 78, "1016", ErrorType.remote, "\u7528\u6237\u8BA4\u8BC1\u7801\u6821\u9A8C\u5931\u8D25");
	//  702 1830:new             #2   <Class BusinessException$ErrorMessage>
	//  703 1833:dup             
	//  704 1834:ldc2            #717 <String "user_auth_code_invalid">
	//  705 1837:bipush          78
	//  706 1839:ldc2            #719 <String "1016">
	//  707 1842:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  708 1845:ldc2            #721 <String "\u7528\u6237\u8BA4\u8BC1\u7801\u6821\u9A8C\u5931\u8D25">
	//  709 1848:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  710 1851:putstatic       #723 <Field BusinessException$ErrorMessage user_auth_code_invalid>
		user_auth_code_mobile_invalid = new BusinessException$ErrorMessage("user_auth_code_mobile_invalid", 79, "1017", ErrorType.remote, "\u9A8C\u8BC1\u7801\u624B\u673A\u53F7\u548C\u6CE8\u518C\u624B\u673A\u53F7\u4E0D\u4E00\u81F4");
	//  711 1854:new             #2   <Class BusinessException$ErrorMessage>
	//  712 1857:dup             
	//  713 1858:ldc2            #724 <String "user_auth_code_mobile_invalid">
	//  714 1861:bipush          79
	//  715 1863:ldc2            #726 <String "1017">
	//  716 1866:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  717 1869:ldc2            #728 <String "\u9A8C\u8BC1\u7801\u624B\u673A\u53F7\u548C\u6CE8\u518C\u624B\u673A\u53F7\u4E0D\u4E00\u81F4">
	//  718 1872:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  719 1875:putstatic       #730 <Field BusinessException$ErrorMessage user_auth_code_mobile_invalid>
		not_support_retrieve_email = new BusinessException$ErrorMessage("not_support_retrieve_email", 80, "1018", ErrorType.remote, "\u5BC6\u7801\u4E0D\u652F\u6301\u90AE\u7BB1\u627E\u56DE");
	//  720 1878:new             #2   <Class BusinessException$ErrorMessage>
	//  721 1881:dup             
	//  722 1882:ldc2            #731 <String "not_support_retrieve_email">
	//  723 1885:bipush          80
	//  724 1887:ldc2            #733 <String "1018">
	//  725 1890:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  726 1893:ldc2            #735 <String "\u5BC6\u7801\u4E0D\u652F\u6301\u90AE\u7BB1\u627E\u56DE">
	//  727 1896:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  728 1899:putstatic       #737 <Field BusinessException$ErrorMessage not_support_retrieve_email>
		user_auth_code_type_invalid = new BusinessException$ErrorMessage("user_auth_code_type_invalid", 81, "1019", ErrorType.remote, "\u9A8C\u8BC1\u7801\u7C7B\u578B\u4E0D\u5339\u914D");
	//  729 1902:new             #2   <Class BusinessException$ErrorMessage>
	//  730 1905:dup             
	//  731 1906:ldc2            #738 <String "user_auth_code_type_invalid">
	//  732 1909:bipush          81
	//  733 1911:ldc2            #740 <String "1019">
	//  734 1914:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  735 1917:ldc2            #742 <String "\u9A8C\u8BC1\u7801\u7C7B\u578B\u4E0D\u5339\u914D">
	//  736 1920:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  737 1923:putstatic       #744 <Field BusinessException$ErrorMessage user_auth_code_type_invalid>
		user_auth_code_expire = new BusinessException$ErrorMessage("user_auth_code_expire", 82, "1020", ErrorType.remote, "\u9A8C\u8BC1\u7801\u5DF2\u8FC7\u671F");
	//  738 1926:new             #2   <Class BusinessException$ErrorMessage>
	//  739 1929:dup             
	//  740 1930:ldc2            #745 <String "user_auth_code_expire">
	//  741 1933:bipush          82
	//  742 1935:ldc2            #747 <String "1020">
	//  743 1938:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  744 1941:ldc2            #749 <String "\u9A8C\u8BC1\u7801\u5DF2\u8FC7\u671F">
	//  745 1944:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  746 1947:putstatic       #751 <Field BusinessException$ErrorMessage user_auth_code_expire>
		sptc_open_exception = new BusinessException$ErrorMessage("sptc_open_exception", 83, "1021", ErrorType.remote, "\u4EA4\u901A\u5361\u5F00\u901A\u53D1\u751F\u5F02\u5E38\uFF0C\u8BF7\u91CD\u8BD5");
	//  747 1950:new             #2   <Class BusinessException$ErrorMessage>
	//  748 1953:dup             
	//  749 1954:ldc2            #752 <String "sptc_open_exception">
	//  750 1957:bipush          83
	//  751 1959:ldc2            #754 <String "1021">
	//  752 1962:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  753 1965:ldc2            #756 <String "\u4EA4\u901A\u5361\u5F00\u901A\u53D1\u751F\u5F02\u5E38\uFF0C\u8BF7\u91CD\u8BD5">
	//  754 1968:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  755 1971:putstatic       #758 <Field BusinessException$ErrorMessage sptc_open_exception>
		sptc_close_exception = new BusinessException$ErrorMessage("sptc_close_exception", 84, "1022", ErrorType.remote, "\u4EA4\u901A\u5361\u5173\u95ED\u53D1\u751F\u5F02\u5E38\uFF0C\u8BF7\u91CD\u8BD5");
	//  756 1974:new             #2   <Class BusinessException$ErrorMessage>
	//  757 1977:dup             
	//  758 1978:ldc2            #759 <String "sptc_close_exception">
	//  759 1981:bipush          84
	//  760 1983:ldc2            #761 <String "1022">
	//  761 1986:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  762 1989:ldc2            #763 <String "\u4EA4\u901A\u5361\u5173\u95ED\u53D1\u751F\u5F02\u5E38\uFF0C\u8BF7\u91CD\u8BD5">
	//  763 1992:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  764 1995:putstatic       #765 <Field BusinessException$ErrorMessage sptc_close_exception>
		sptc_personalization_fail = new BusinessException$ErrorMessage("sptc_personalization_fail", 85, "1023", ErrorType.remote, "\u4EA4\u901A\u5361\u4E2A\u4EBA\u5316\u5931\u8D25");
	//  765 1998:new             #2   <Class BusinessException$ErrorMessage>
	//  766 2001:dup             
	//  767 2002:ldc2            #766 <String "sptc_personalization_fail">
	//  768 2005:bipush          85
	//  769 2007:ldc2            #768 <String "1023">
	//  770 2010:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  771 2013:ldc2            #770 <String "\u4EA4\u901A\u5361\u4E2A\u4EBA\u5316\u5931\u8D25">
	//  772 2016:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  773 2019:putstatic       #772 <Field BusinessException$ErrorMessage sptc_personalization_fail>
		app_issuer_fail = new BusinessException$ErrorMessage("app_issuer_fail", 86, "1024", ErrorType.remote, "\u7528\u6237\u5361\u53D1\u884C\u5931\u8D25");
	//  774 2022:new             #2   <Class BusinessException$ErrorMessage>
	//  775 2025:dup             
	//  776 2026:ldc2            #773 <String "app_issuer_fail">
	//  777 2029:bipush          86
	//  778 2031:ldc2            #775 <String "1024">
	//  779 2034:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  780 2037:ldc2            #777 <String "\u7528\u6237\u5361\u53D1\u884C\u5931\u8D25">
	//  781 2040:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  782 2043:putstatic       #779 <Field BusinessException$ErrorMessage app_issuer_fail>
		sptc_data_not_matching = new BusinessException$ErrorMessage("sptc_data_not_matching", 87, "1029", ErrorType.remote, "\u4EA4\u901A\u5361\u6570\u636E\u4E0D\u5339\u914D");
	//  783 2046:new             #2   <Class BusinessException$ErrorMessage>
	//  784 2049:dup             
	//  785 2050:ldc2            #780 <String "sptc_data_not_matching">
	//  786 2053:bipush          87
	//  787 2055:ldc2            #782 <String "1029">
	//  788 2058:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  789 2061:ldc2            #784 <String "\u4EA4\u901A\u5361\u6570\u636E\u4E0D\u5339\u914D">
	//  790 2064:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  791 2067:putstatic       #786 <Field BusinessException$ErrorMessage sptc_data_not_matching>
		card_invaild_check = new BusinessException$ErrorMessage("card_invaild_check", 88, "1030", ErrorType.remote, "\u5361\u7247\u9A8C\u8BC1\u65E0\u6548");
	//  792 2070:new             #2   <Class BusinessException$ErrorMessage>
	//  793 2073:dup             
	//  794 2074:ldc2            #787 <String "card_invaild_check">
	//  795 2077:bipush          88
	//  796 2079:ldc2            #789 <String "1030">
	//  797 2082:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  798 2085:ldc2            #791 <String "\u5361\u7247\u9A8C\u8BC1\u65E0\u6548">
	//  799 2088:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  800 2091:putstatic       #793 <Field BusinessException$ErrorMessage card_invaild_check>
		card_not_order = new BusinessException$ErrorMessage("card_not_order", 89, "1031", ErrorType.remote, "\u5361\u7247\u8BA2\u8D2D\u5173\u7CFB\u4E0D\u5B58\u5728");
	//  801 2094:new             #2   <Class BusinessException$ErrorMessage>
	//  802 2097:dup             
	//  803 2098:ldc2            #794 <String "card_not_order">
	//  804 2101:bipush          89
	//  805 2103:ldc2            #796 <String "1031">
	//  806 2106:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  807 2109:ldc2            #798 <String "\u5361\u7247\u8BA2\u8D2D\u5173\u7CFB\u4E0D\u5B58\u5728">
	//  808 2112:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  809 2115:putstatic       #800 <Field BusinessException$ErrorMessage card_not_order>
		card_order_by_other = new BusinessException$ErrorMessage("card_order_by_other", 90, "1032", ErrorType.remote, "\u5361\u7247\u8BA2\u8D2D\u5173\u7CFB\u4E0D\u5339\u914D\uFF0C\u5DF2\u88AB\u5176\u4ED6\u6CE8\u518C\u7528\u6237\u8BA2\u8D2D");
	//  810 2118:new             #2   <Class BusinessException$ErrorMessage>
	//  811 2121:dup             
	//  812 2122:ldc2            #801 <String "card_order_by_other">
	//  813 2125:bipush          90
	//  814 2127:ldc2            #803 <String "1032">
	//  815 2130:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  816 2133:ldc2            #805 <String "\u5361\u7247\u8BA2\u8D2D\u5173\u7CFB\u4E0D\u5339\u914D\uFF0C\u5DF2\u88AB\u5176\u4ED6\u6CE8\u518C\u7528\u6237\u8BA2\u8D2D">
	//  817 2136:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  818 2139:putstatic       #807 <Field BusinessException$ErrorMessage card_order_by_other>
		user_order_open = new BusinessException$ErrorMessage("user_order_open", 91, "1033", ErrorType.remote, "\u7528\u6237\u5DF2\u8BA2\u8D2D\u4E14\u5361\u5DF2\u5F00\u901A");
	//  819 2142:new             #2   <Class BusinessException$ErrorMessage>
	//  820 2145:dup             
	//  821 2146:ldc2            #808 <String "user_order_open">
	//  822 2149:bipush          91
	//  823 2151:ldc2            #810 <String "1033">
	//  824 2154:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  825 2157:ldc2            #812 <String "\u7528\u6237\u5DF2\u8BA2\u8D2D\u4E14\u5361\u5DF2\u5F00\u901A">
	//  826 2160:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  827 2163:putstatic       #814 <Field BusinessException$ErrorMessage user_order_open>
		user_unsubscribe_closed = new BusinessException$ErrorMessage("user_unsubscribe_closed", 92, "1034", ErrorType.remote, "\u7528\u6237\u5DF2\u9000\u8BA2\u4E14\u5173\u95ED\u4E86\u529F\u80FD");
	//  828 2166:new             #2   <Class BusinessException$ErrorMessage>
	//  829 2169:dup             
	//  830 2170:ldc2            #815 <String "user_unsubscribe_closed">
	//  831 2173:bipush          92
	//  832 2175:ldc2            #817 <String "1034">
	//  833 2178:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  834 2181:ldc2            #819 <String "\u7528\u6237\u5DF2\u9000\u8BA2\u4E14\u5173\u95ED\u4E86\u529F\u80FD">
	//  835 2184:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  836 2187:putstatic       #821 <Field BusinessException$ErrorMessage user_unsubscribe_closed>
		user_order_no_open = new BusinessException$ErrorMessage("user_order_no_open", 93, "1035", ErrorType.remote, "\u7528\u6237\u5DF2\u8BA2\u8D2D\u4F46\u8FD8\u672A\u5F00\u901A");
	//  837 2190:new             #2   <Class BusinessException$ErrorMessage>
	//  838 2193:dup             
	//  839 2194:ldc2            #822 <String "user_order_no_open">
	//  840 2197:bipush          93
	//  841 2199:ldc2            #824 <String "1035">
	//  842 2202:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  843 2205:ldc2            #826 <String "\u7528\u6237\u5DF2\u8BA2\u8D2D\u4F46\u8FD8\u672A\u5F00\u901A">
	//  844 2208:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  845 2211:putstatic       #828 <Field BusinessException$ErrorMessage user_order_no_open>
		user_order_fail = new BusinessException$ErrorMessage("user_order_fail", 94, "1036", ErrorType.remote, "\u7528\u6237\u8BA2\u8D2D\u5931\u8D25");
	//  846 2214:new             #2   <Class BusinessException$ErrorMessage>
	//  847 2217:dup             
	//  848 2218:ldc2            #829 <String "user_order_fail">
	//  849 2221:bipush          94
	//  850 2223:ldc2            #831 <String "1036">
	//  851 2226:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  852 2229:ldc2            #833 <String "\u7528\u6237\u8BA2\u8D2D\u5931\u8D25">
	//  853 2232:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  854 2235:putstatic       #835 <Field BusinessException$ErrorMessage user_order_fail>
		user_unsubscribe_fail = new BusinessException$ErrorMessage("user_unsubscribe_fail", 95, "1037", ErrorType.remote, "\u7528\u6237\u9000\u8BA2\u5931\u8D25");
	//  855 2238:new             #2   <Class BusinessException$ErrorMessage>
	//  856 2241:dup             
	//  857 2242:ldc2            #836 <String "user_unsubscribe_fail">
	//  858 2245:bipush          95
	//  859 2247:ldc2            #838 <String "1037">
	//  860 2250:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  861 2253:ldc2            #840 <String "\u7528\u6237\u9000\u8BA2\u5931\u8D25">
	//  862 2256:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  863 2259:putstatic       #842 <Field BusinessException$ErrorMessage user_unsubscribe_fail>
		user_order_invaild_info = new BusinessException$ErrorMessage("user_order_invaild_info", 96, "1038", ErrorType.remote, "\u8BA2\u8D2D\u4FE1\u606F\u6570\u636E\u6709\u95EE\u9898");
	//  864 2262:new             #2   <Class BusinessException$ErrorMessage>
	//  865 2265:dup             
	//  866 2266:ldc2            #843 <String "user_order_invaild_info">
	//  867 2269:bipush          96
	//  868 2271:ldc2            #845 <String "1038">
	//  869 2274:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  870 2277:ldc2            #847 <String "\u8BA2\u8D2D\u4FE1\u606F\u6570\u636E\u6709\u95EE\u9898">
	//  871 2280:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  872 2283:putstatic       #849 <Field BusinessException$ErrorMessage user_order_invaild_info>
		sptc_app_not_issuer = new BusinessException$ErrorMessage("sptc_app_not_issuer", 97, "1039", ErrorType.remote, "\u4EA4\u901A\u5361\u5E94\u7528\u672A\u4E0B\u8F7D");
	//  873 2286:new             #2   <Class BusinessException$ErrorMessage>
	//  874 2289:dup             
	//  875 2290:ldc2            #850 <String "sptc_app_not_issuer">
	//  876 2293:bipush          97
	//  877 2295:ldc2            #852 <String "1039">
	//  878 2298:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  879 2301:ldc2            #854 <String "\u4EA4\u901A\u5361\u5E94\u7528\u672A\u4E0B\u8F7D">
	//  880 2304:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  881 2307:putstatic       #856 <Field BusinessException$ErrorMessage sptc_app_not_issuer>
		sptc_personalization = new BusinessException$ErrorMessage("sptc_personalization", 98, "1040", ErrorType.remote, "\u4EA4\u901A\u5361\u5DF2\u5B8C\u6210\u4E2A\u4EBA\u5316");
	//  882 2310:new             #2   <Class BusinessException$ErrorMessage>
	//  883 2313:dup             
	//  884 2314:ldc2            #857 <String "sptc_personalization">
	//  885 2317:bipush          98
	//  886 2319:ldc2            #859 <String "1040">
	//  887 2322:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  888 2325:ldc2            #861 <String "\u4EA4\u901A\u5361\u5DF2\u5B8C\u6210\u4E2A\u4EBA\u5316">
	//  889 2328:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  890 2331:putstatic       #863 <Field BusinessException$ErrorMessage sptc_personalization>
		invaild_personalization_info = new BusinessException$ErrorMessage("invaild_personalization_info", 99, "1041", ErrorType.remote, "\u4E2A\u4EBA\u5316\u6570\u636E\u4E0D\u8DB3");
	//  891 2334:new             #2   <Class BusinessException$ErrorMessage>
	//  892 2337:dup             
	//  893 2338:ldc2            #864 <String "invaild_personalization_info">
	//  894 2341:bipush          99
	//  895 2343:ldc2            #866 <String "1041">
	//  896 2346:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  897 2349:ldc2            #868 <String "\u4E2A\u4EBA\u5316\u6570\u636E\u4E0D\u8DB3">
	//  898 2352:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  899 2355:putstatic       #870 <Field BusinessException$ErrorMessage invaild_personalization_info>
		ack_card_app_unpersonal = new BusinessException$ErrorMessage("ack_card_app_unpersonal", 100, "1042", ErrorType.remote, "\u5E94\u7528\u672A\u4E2A\u4EBA\u5316");
	//  900 2358:new             #2   <Class BusinessException$ErrorMessage>
	//  901 2361:dup             
	//  902 2362:ldc2            #871 <String "ack_card_app_unpersonal">
	//  903 2365:bipush          100
	//  904 2367:ldc2            #873 <String "1042">
	//  905 2370:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  906 2373:ldc2            #875 <String "\u5E94\u7528\u672A\u4E2A\u4EBA\u5316">
	//  907 2376:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  908 2379:putstatic       #877 <Field BusinessException$ErrorMessage ack_card_app_unpersonal>
		ack_card_app_unprepare = new BusinessException$ErrorMessage("ack_card_app_unprepare", 101, "1043", ErrorType.remote, "\u5E94\u7528\u5B89\u88C5\u672A\u51C6\u5907");
	//  909 2382:new             #2   <Class BusinessException$ErrorMessage>
	//  910 2385:dup             
	//  911 2386:ldc2            #878 <String "ack_card_app_unprepare">
	//  912 2389:bipush          101
	//  913 2391:ldc2            #880 <String "1043">
	//  914 2394:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  915 2397:ldc2            #882 <String "\u5E94\u7528\u5B89\u88C5\u672A\u51C6\u5907">
	//  916 2400:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  917 2403:putstatic       #884 <Field BusinessException$ErrorMessage ack_card_app_unprepare>
		ack_card_app_order_fail = new BusinessException$ErrorMessage("ack_card_app_order_fail", 102, "1044", ErrorType.remote, "\u7528\u6237\u975E\u8BA2\u8D2D\u6210\u529F\u72B6\u6001");
	//  918 2406:new             #2   <Class BusinessException$ErrorMessage>
	//  919 2409:dup             
	//  920 2410:ldc2            #885 <String "ack_card_app_order_fail">
	//  921 2413:bipush          102
	//  922 2415:ldc2            #887 <String "1044">
	//  923 2418:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  924 2421:ldc2            #889 <String "\u7528\u6237\u975E\u8BA2\u8D2D\u6210\u529F\u72B6\u6001">
	//  925 2424:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  926 2427:putstatic       #891 <Field BusinessException$ErrorMessage ack_card_app_order_fail>
		ack_card_app_unorder_fail = new BusinessException$ErrorMessage("ack_card_app_unorder_fail", 103, "1045", ErrorType.remote, "\u7528\u6237\u975E\u9000\u8BA2\u6210\u529F\u72B6\u6001");
	//  927 2430:new             #2   <Class BusinessException$ErrorMessage>
	//  928 2433:dup             
	//  929 2434:ldc2            #892 <String "ack_card_app_unorder_fail">
	//  930 2437:bipush          103
	//  931 2439:ldc2            #894 <String "1045">
	//  932 2442:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  933 2445:ldc2            #896 <String "\u7528\u6237\u975E\u9000\u8BA2\u6210\u529F\u72B6\u6001">
	//  934 2448:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  935 2451:putstatic       #898 <Field BusinessException$ErrorMessage ack_card_app_unorder_fail>
		no_suppert_in_card = new BusinessException$ErrorMessage("no_suppert_in_card", 104, "1046", ErrorType.remote, "\u6682\u4E0D\u652F\u6301\u5185\u5361");
	//  936 2454:new             #2   <Class BusinessException$ErrorMessage>
	//  937 2457:dup             
	//  938 2458:ldc2            #899 <String "no_suppert_in_card">
	//  939 2461:bipush          104
	//  940 2463:ldc2            #901 <String "1046">
	//  941 2466:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  942 2469:ldc2            #903 <String "\u6682\u4E0D\u652F\u6301\u5185\u5361">
	//  943 2472:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  944 2475:putstatic       #905 <Field BusinessException$ErrorMessage no_suppert_in_card>
		no_suppert_out_card = new BusinessException$ErrorMessage("no_suppert_out_card", 105, "1047", ErrorType.remote, "\u6682\u4E0D\u652F\u6301\u5916\u5361");
	//  945 2478:new             #2   <Class BusinessException$ErrorMessage>
	//  946 2481:dup             
	//  947 2482:ldc2            #906 <String "no_suppert_out_card">
	//  948 2485:bipush          105
	//  949 2487:ldc2            #908 <String "1047">
	//  950 2490:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  951 2493:ldc2            #910 <String "\u6682\u4E0D\u652F\u6301\u5916\u5361">
	//  952 2496:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  953 2499:putstatic       #912 <Field BusinessException$ErrorMessage no_suppert_out_card>
		business_order_not_exist = new BusinessException$ErrorMessage("business_order_not_exist", 106, "1101", ErrorType.remote, "\u8BA2\u5355\u4E0D\u5B58\u5728");
	//  954 2502:new             #2   <Class BusinessException$ErrorMessage>
	//  955 2505:dup             
	//  956 2506:ldc2            #913 <String "business_order_not_exist">
	//  957 2509:bipush          106
	//  958 2511:ldc2            #915 <String "1101">
	//  959 2514:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  960 2517:ldc2            #917 <String "\u8BA2\u5355\u4E0D\u5B58\u5728">
	//  961 2520:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  962 2523:putstatic       #919 <Field BusinessException$ErrorMessage business_order_not_exist>
		business_order_apply_no_pay = new BusinessException$ErrorMessage("business_order_apply_no_pay", 107, "1102", ErrorType.remote, "\u8BA2\u5355\u5DF2\u7533\u8BF7\u3001\u672A\u6263\u6B3E");
	//  963 2526:new             #2   <Class BusinessException$ErrorMessage>
	//  964 2529:dup             
	//  965 2530:ldc2            #920 <String "business_order_apply_no_pay">
	//  966 2533:bipush          107
	//  967 2535:ldc2            #922 <String "1102">
	//  968 2538:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  969 2541:ldc2            #924 <String "\u8BA2\u5355\u5DF2\u7533\u8BF7\u3001\u672A\u6263\u6B3E">
	//  970 2544:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  971 2547:putstatic       #926 <Field BusinessException$ErrorMessage business_order_apply_no_pay>
		business_order_pay_no_write = new BusinessException$ErrorMessage("business_order_pay_no_write", 108, "1103", ErrorType.remote, "\u8BA2\u5355\u5DF2\u6263\u6B3E\u3001\u672A\u5145\u503C");
	//  972 2550:new             #2   <Class BusinessException$ErrorMessage>
	//  973 2553:dup             
	//  974 2554:ldc2            #927 <String "business_order_pay_no_write">
	//  975 2557:bipush          108
	//  976 2559:ldc2            #929 <String "1103">
	//  977 2562:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  978 2565:ldc2            #931 <String "\u8BA2\u5355\u5DF2\u6263\u6B3E\u3001\u672A\u5145\u503C">
	//  979 2568:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  980 2571:putstatic       #933 <Field BusinessException$ErrorMessage business_order_pay_no_write>
		business_order_recharge_sucess = new BusinessException$ErrorMessage("business_order_recharge_sucess", 109, "1104", ErrorType.remote, "\u8BA2\u5355\u5DF2\u7ECF\u5145\u503C\u6210\u529F");
	//  981 2574:new             #2   <Class BusinessException$ErrorMessage>
	//  982 2577:dup             
	//  983 2578:ldc2            #934 <String "business_order_recharge_sucess">
	//  984 2581:bipush          109
	//  985 2583:ldc2            #936 <String "1104">
	//  986 2586:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  987 2589:ldc2            #938 <String "\u8BA2\u5355\u5DF2\u7ECF\u5145\u503C\u6210\u529F">
	//  988 2592:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  989 2595:putstatic       #940 <Field BusinessException$ErrorMessage business_order_recharge_sucess>
		business_order_amount_inconsistent = new BusinessException$ErrorMessage("business_order_amount_inconsistent", 110, "1105", ErrorType.remote, "\u8BA2\u5355\u91D1\u989D\u4E0D\u7B26");
	//  990 2598:new             #2   <Class BusinessException$ErrorMessage>
	//  991 2601:dup             
	//  992 2602:ldc2            #941 <String "business_order_amount_inconsistent">
	//  993 2605:bipush          110
	//  994 2607:ldc2            #943 <String "1105">
	//  995 2610:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	//  996 2613:ldc2            #945 <String "\u8BA2\u5355\u91D1\u989D\u4E0D\u7B26">
	//  997 2616:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	//  998 2619:putstatic       #947 <Field BusinessException$ErrorMessage business_order_amount_inconsistent>
		business_order_unsettled_exist = new BusinessException$ErrorMessage("business_order_unsettled_exist", 111, "1106", ErrorType.remote, "\u5B58\u5728\u53EF\u7591\u8BA2\u5355");
	//  999 2622:new             #2   <Class BusinessException$ErrorMessage>
	// 1000 2625:dup             
	// 1001 2626:ldc2            #948 <String "business_order_unsettled_exist">
	// 1002 2629:bipush          111
	// 1003 2631:ldc2            #950 <String "1106">
	// 1004 2634:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1005 2637:ldc2            #952 <String "\u5B58\u5728\u53EF\u7591\u8BA2\u5355">
	// 1006 2640:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1007 2643:putstatic       #954 <Field BusinessException$ErrorMessage business_order_unsettled_exist>
		business_order_recharget_fail = new BusinessException$ErrorMessage("business_order_recharget_fail", 112, "1107", ErrorType.remote, "\u8BA2\u5355\u4EA4\u6613\u5931\u8D25");
	// 1008 2646:new             #2   <Class BusinessException$ErrorMessage>
	// 1009 2649:dup             
	// 1010 2650:ldc2            #955 <String "business_order_recharget_fail">
	// 1011 2653:bipush          112
	// 1012 2655:ldc2            #957 <String "1107">
	// 1013 2658:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1014 2661:ldc2            #959 <String "\u8BA2\u5355\u4EA4\u6613\u5931\u8D25">
	// 1015 2664:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1016 2667:putstatic       #961 <Field BusinessException$ErrorMessage business_order_recharget_fail>
		business_order_apply_refund = new BusinessException$ErrorMessage("business_order_apply_refund", 113, "1108", ErrorType.remote, "\u8BA2\u5355\u7533\u8BF7\u9000\u6B3E\u4E2D");
	// 1017 2670:new             #2   <Class BusinessException$ErrorMessage>
	// 1018 2673:dup             
	// 1019 2674:ldc2            #962 <String "business_order_apply_refund">
	// 1020 2677:bipush          113
	// 1021 2679:ldc2            #964 <String "1108">
	// 1022 2682:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1023 2685:ldc2            #966 <String "\u8BA2\u5355\u7533\u8BF7\u9000\u6B3E\u4E2D">
	// 1024 2688:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1025 2691:putstatic       #968 <Field BusinessException$ErrorMessage business_order_apply_refund>
		business_order_refund = new BusinessException$ErrorMessage("business_order_refund", 114, "1109", ErrorType.remote, "\u8BA2\u5355\u5DF2\u9000\u6B3E");
	// 1026 2694:new             #2   <Class BusinessException$ErrorMessage>
	// 1027 2697:dup             
	// 1028 2698:ldc2            #969 <String "business_order_refund">
	// 1029 2701:bipush          114
	// 1030 2703:ldc2            #971 <String "1109">
	// 1031 2706:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1032 2709:ldc2            #973 <String "\u8BA2\u5355\u5DF2\u9000\u6B3E">
	// 1033 2712:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1034 2715:putstatic       #975 <Field BusinessException$ErrorMessage business_order_refund>
		business_order_rechargeting = new BusinessException$ErrorMessage("business_order_rechargeting", 115, "1110", ErrorType.remote, "\u8BA2\u5355\u6B63\u5728\u5145\u503C\u4E2D");
	// 1035 2718:new             #2   <Class BusinessException$ErrorMessage>
	// 1036 2721:dup             
	// 1037 2722:ldc2            #976 <String "business_order_rechargeting">
	// 1038 2725:bipush          115
	// 1039 2727:ldc2            #978 <String "1110">
	// 1040 2730:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1041 2733:ldc2            #980 <String "\u8BA2\u5355\u6B63\u5728\u5145\u503C\u4E2D">
	// 1042 2736:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1043 2739:putstatic       #982 <Field BusinessException$ErrorMessage business_order_rechargeting>
		business_order_paying = new BusinessException$ErrorMessage("business_order_paying", 116, "1111", ErrorType.remote, "\u8BA2\u5355\u6B63\u5728\u652F\u4ED8\u4E2D");
	// 1044 2742:new             #2   <Class BusinessException$ErrorMessage>
	// 1045 2745:dup             
	// 1046 2746:ldc2            #983 <String "business_order_paying">
	// 1047 2749:bipush          116
	// 1048 2751:ldc2            #985 <String "1111">
	// 1049 2754:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1050 2757:ldc2            #987 <String "\u8BA2\u5355\u6B63\u5728\u652F\u4ED8\u4E2D">
	// 1051 2760:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1052 2763:putstatic       #989 <Field BusinessException$ErrorMessage business_order_paying>
		business_order_no_refund = new BusinessException$ErrorMessage("business_order_no_refund", 117, "1112", ErrorType.remote, "\u8BA2\u5355\u4E0D\u80FD\u9000\u6B3E");
	// 1053 2766:new             #2   <Class BusinessException$ErrorMessage>
	// 1054 2769:dup             
	// 1055 2770:ldc2            #990 <String "business_order_no_refund">
	// 1056 2773:bipush          117
	// 1057 2775:ldc2            #992 <String "1112">
	// 1058 2778:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1059 2781:ldc2            #994 <String "\u8BA2\u5355\u4E0D\u80FD\u9000\u6B3E">
	// 1060 2784:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1061 2787:putstatic       #996 <Field BusinessException$ErrorMessage business_order_no_refund>
		business_order_card_no_inconsistent = new BusinessException$ErrorMessage("business_order_card_no_inconsistent", 118, "1113", ErrorType.remote, "\u8BA2\u5355\u7ED1\u5B9A\u7684\u5361\u53F7\u548C\u672C\u6B21\u4EA4\u6613\u7684\u5361\u53F7\u4E0D\u4E00\u81F4");
	// 1062 2790:new             #2   <Class BusinessException$ErrorMessage>
	// 1063 2793:dup             
	// 1064 2794:ldc2            #997 <String "business_order_card_no_inconsistent">
	// 1065 2797:bipush          118
	// 1066 2799:ldc2            #999 <String "1113">
	// 1067 2802:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1068 2805:ldc2            #1001 <String "\u8BA2\u5355\u7ED1\u5B9A\u7684\u5361\u53F7\u548C\u672C\u6B21\u4EA4\u6613\u7684\u5361\u53F7\u4E0D\u4E00\u81F4">
	// 1069 2808:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1070 2811:putstatic       #1003 <Field BusinessException$ErrorMessage business_order_card_no_inconsistent>
		business_order_invoice = new BusinessException$ErrorMessage("business_order_invoice", 119, "1114", ErrorType.remote, "\u53D1\u7968\u5DF2\u9886\u53D6");
	// 1071 2814:new             #2   <Class BusinessException$ErrorMessage>
	// 1072 2817:dup             
	// 1073 2818:ldc2            #1004 <String "business_order_invoice">
	// 1074 2821:bipush          119
	// 1075 2823:ldc2            #1006 <String "1114">
	// 1076 2826:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1077 2829:ldc2            #1008 <String "\u53D1\u7968\u5DF2\u9886\u53D6">
	// 1078 2832:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1079 2835:putstatic       #1010 <Field BusinessException$ErrorMessage business_order_invoice>
		business_order_no_invoice = new BusinessException$ErrorMessage("business_order_no_invoice", 120, "1115", ErrorType.remote, "\u8BE5\u7B14\u4EA4\u6613\u5DF2\u5931\u6548\uFF0C\u4E0D\u80FD\u9886\u53D6\u53D1\u7968");
	// 1080 2838:new             #2   <Class BusinessException$ErrorMessage>
	// 1081 2841:dup             
	// 1082 2842:ldc2            #1011 <String "business_order_no_invoice">
	// 1083 2845:bipush          120
	// 1084 2847:ldc2            #1013 <String "1115">
	// 1085 2850:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1086 2853:ldc2            #1015 <String "\u8BE5\u7B14\u4EA4\u6613\u5DF2\u5931\u6548\uFF0C\u4E0D\u80FD\u9886\u53D6\u53D1\u7968">
	// 1087 2856:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1088 2859:putstatic       #1017 <Field BusinessException$ErrorMessage business_order_no_invoice>
		business_unsettled_overrun = new BusinessException$ErrorMessage("business_unsettled_overrun", 121, "1116", ErrorType.remote, "\u53EF\u7591\u8BA2\u5355\u8D85\u8FC7\u4E0A\u9650\uFF0C\u8BF7\u8FDB\u884C\u5904\u7406");
	// 1089 2862:new             #2   <Class BusinessException$ErrorMessage>
	// 1090 2865:dup             
	// 1091 2866:ldc2            #1018 <String "business_unsettled_overrun">
	// 1092 2869:bipush          121
	// 1093 2871:ldc2            #1020 <String "1116">
	// 1094 2874:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1095 2877:ldc2            #1022 <String "\u53EF\u7591\u8BA2\u5355\u8D85\u8FC7\u4E0A\u9650\uFF0C\u8BF7\u8FDB\u884C\u5904\u7406">
	// 1096 2880:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1097 2883:putstatic       #1024 <Field BusinessException$ErrorMessage business_unsettled_overrun>
		order_apply_frequent = new BusinessException$ErrorMessage("order_apply_frequent", 122, "1126", ErrorType.remote, "\u8BA2\u5355\u91CD\u590D\u7533\u8BF7\u5C0F\u4E8E\u8BA2\u5355\u95F4\u9694");
	// 1098 2886:new             #2   <Class BusinessException$ErrorMessage>
	// 1099 2889:dup             
	// 1100 2890:ldc2            #1025 <String "order_apply_frequent">
	// 1101 2893:bipush          122
	// 1102 2895:ldc2            #1027 <String "1126">
	// 1103 2898:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1104 2901:ldc2            #1029 <String "\u8BA2\u5355\u91CD\u590D\u7533\u8BF7\u5C0F\u4E8E\u8BA2\u5355\u95F4\u9694">
	// 1105 2904:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1106 2907:putstatic       #1031 <Field BusinessException$ErrorMessage order_apply_frequent>
		app_move_code_invalid = new BusinessException$ErrorMessage("app_move_code_invalid", 123, "1127", ErrorType.remote, "\u5E94\u7528\u8FC1\u79FB\u8FC7\u4E86\u6709\u6548\u671F");
	// 1107 2910:new             #2   <Class BusinessException$ErrorMessage>
	// 1108 2913:dup             
	// 1109 2914:ldc2            #1032 <String "app_move_code_invalid">
	// 1110 2917:bipush          123
	// 1111 2919:ldc2            #1034 <String "1127">
	// 1112 2922:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1113 2925:ldc2            #1036 <String "\u5E94\u7528\u8FC1\u79FB\u8FC7\u4E86\u6709\u6548\u671F">
	// 1114 2928:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1115 2931:putstatic       #1038 <Field BusinessException$ErrorMessage app_move_code_invalid>
		order_amount_low = new BusinessException$ErrorMessage("order_amount_low", 124, "1128", ErrorType.remote, "\u8BA2\u5355\u7533\u8BF7\u91D1\u989D\u5C0F\u4E8E\u914D\u7F6E");
	// 1116 2934:new             #2   <Class BusinessException$ErrorMessage>
	// 1117 2937:dup             
	// 1118 2938:ldc2            #1039 <String "order_amount_low">
	// 1119 2941:bipush          124
	// 1120 2943:ldc2            #1041 <String "1128">
	// 1121 2946:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1122 2949:ldc2            #1043 <String "\u8BA2\u5355\u7533\u8BF7\u91D1\u989D\u5C0F\u4E8E\u914D\u7F6E">
	// 1123 2952:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1124 2955:putstatic       #1045 <Field BusinessException$ErrorMessage order_amount_low>
		trade_not_exist = new BusinessException$ErrorMessage("trade_not_exist", 125, "1201", ErrorType.remote, "\u4EA4\u6613\u4E0D\u5B58\u5728");
	// 1125 2958:new             #2   <Class BusinessException$ErrorMessage>
	// 1126 2961:dup             
	// 1127 2962:ldc2            #1046 <String "trade_not_exist">
	// 1128 2965:bipush          125
	// 1129 2967:ldc2            #1048 <String "1201">
	// 1130 2970:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1131 2973:ldc2            #1050 <String "\u4EA4\u6613\u4E0D\u5B58\u5728">
	// 1132 2976:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1133 2979:putstatic       #1052 <Field BusinessException$ErrorMessage trade_not_exist>
		trade_handling = new BusinessException$ErrorMessage("trade_handling", 126, "1202", ErrorType.remote, "\u4EA4\u6613\u5904\u7406\u4E2D");
	// 1134 2982:new             #2   <Class BusinessException$ErrorMessage>
	// 1135 2985:dup             
	// 1136 2986:ldc2            #1053 <String "trade_handling">
	// 1137 2989:bipush          126
	// 1138 2991:ldc2            #1055 <String "1202">
	// 1139 2994:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1140 2997:ldc2            #1057 <String "\u4EA4\u6613\u5904\u7406\u4E2D">
	// 1141 3000:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1142 3003:putstatic       #1059 <Field BusinessException$ErrorMessage trade_handling>
		trade_fail = new BusinessException$ErrorMessage("trade_fail", 127, "1203", ErrorType.remote, "\u4EA4\u6613\u5931\u8D25");
	// 1143 3006:new             #2   <Class BusinessException$ErrorMessage>
	// 1144 3009:dup             
	// 1145 3010:ldc2            #1060 <String "trade_fail">
	// 1146 3013:bipush          127
	// 1147 3015:ldc2            #1062 <String "1203">
	// 1148 3018:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1149 3021:ldc2            #1064 <String "\u4EA4\u6613\u5931\u8D25">
	// 1150 3024:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1151 3027:putstatic       #1066 <Field BusinessException$ErrorMessage trade_fail>
		trade_sucess = new BusinessException$ErrorMessage("trade_sucess", 128, "1204", ErrorType.remote, "\u4EA4\u6613\u6210\u529F");
	// 1152 3030:new             #2   <Class BusinessException$ErrorMessage>
	// 1153 3033:dup             
	// 1154 3034:ldc2            #1067 <String "trade_sucess">
	// 1155 3037:sipush          128
	// 1156 3040:ldc2            #1069 <String "1204">
	// 1157 3043:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1158 3046:ldc2            #1071 <String "\u4EA4\u6613\u6210\u529F">
	// 1159 3049:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1160 3052:putstatic       #1073 <Field BusinessException$ErrorMessage trade_sucess>
		trade_act_check_fail = new BusinessException$ErrorMessage("trade_act_check_fail", 129, "1207", ErrorType.remote, "\u6D3B\u52A8\u4EE3\u7801\u6821\u9A8C\u5931\u8D25");
	// 1161 3055:new             #2   <Class BusinessException$ErrorMessage>
	// 1162 3058:dup             
	// 1163 3059:ldc2            #1074 <String "trade_act_check_fail">
	// 1164 3062:sipush          129
	// 1165 3065:ldc2            #1076 <String "1207">
	// 1166 3068:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1167 3071:ldc2            #1078 <String "\u6D3B\u52A8\u4EE3\u7801\u6821\u9A8C\u5931\u8D25">
	// 1168 3074:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1169 3077:putstatic       #1080 <Field BusinessException$ErrorMessage trade_act_check_fail>
		trade_act_used = new BusinessException$ErrorMessage("trade_act_used", 130, "1208", ErrorType.remote, "\u6D3B\u52A8\u4EE3\u7801\u5DF2\u4F7F\u7528");
	// 1170 3080:new             #2   <Class BusinessException$ErrorMessage>
	// 1171 3083:dup             
	// 1172 3084:ldc2            #1081 <String "trade_act_used">
	// 1173 3087:sipush          130
	// 1174 3090:ldc2            #1083 <String "1208">
	// 1175 3093:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1176 3096:ldc2            #1085 <String "\u6D3B\u52A8\u4EE3\u7801\u5DF2\u4F7F\u7528">
	// 1177 3099:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1178 3102:putstatic       #1087 <Field BusinessException$ErrorMessage trade_act_used>
		apdu_exec_fail = new BusinessException$ErrorMessage("apdu_exec_fail", 131, "1209", ErrorType.remote, "\u53D1\u5361\u7EC8\u7AEF\u6307\u4EE4\u6267\u884C\u5931\u8D25");
	// 1179 3105:new             #2   <Class BusinessException$ErrorMessage>
	// 1180 3108:dup             
	// 1181 3109:ldc2            #1088 <String "apdu_exec_fail">
	// 1182 3112:sipush          131
	// 1183 3115:ldc2            #1090 <String "1209">
	// 1184 3118:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1185 3121:ldc2            #1092 <String "\u53D1\u5361\u7EC8\u7AEF\u6307\u4EE4\u6267\u884C\u5931\u8D25">
	// 1186 3124:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1187 3127:putstatic       #1094 <Field BusinessException$ErrorMessage apdu_exec_fail>
		third_seq_repeat = new BusinessException$ErrorMessage("third_seq_repeat", 132, "1210", ErrorType.remote, "\u7B2C\u4E09\u65B9\u5E73\u53F0\u6D41\u6C34\u91CD\u590D");
	// 1188 3130:new             #2   <Class BusinessException$ErrorMessage>
	// 1189 3133:dup             
	// 1190 3134:ldc2            #1095 <String "third_seq_repeat">
	// 1191 3137:sipush          132
	// 1192 3140:ldc2            #1097 <String "1210">
	// 1193 3143:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1194 3146:ldc2            #1099 <String "\u7B2C\u4E09\u65B9\u5E73\u53F0\u6D41\u6C34\u91CD\u590D">
	// 1195 3149:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1196 3152:putstatic       #1101 <Field BusinessException$ErrorMessage third_seq_repeat>
		ese_no_space = new BusinessException$ErrorMessage("ese_no_space", 133, "1211", ErrorType.remote, "\u7EC8\u7AEFeSE\u7A7A\u95F4\u4E0D\u8DB3");
	// 1197 3155:new             #2   <Class BusinessException$ErrorMessage>
	// 1198 3158:dup             
	// 1199 3159:ldc2            #1102 <String "ese_no_space">
	// 1200 3162:sipush          133
	// 1201 3165:ldc2            #1104 <String "1211">
	// 1202 3168:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1203 3171:ldc2            #1106 <String "\u7EC8\u7AEFeSE\u7A7A\u95F4\u4E0D\u8DB3">
	// 1204 3174:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1205 3177:putstatic       #1108 <Field BusinessException$ErrorMessage ese_no_space>
		load_more = new BusinessException$ErrorMessage("load_more", 134, "1212", ErrorType.remote, "\u5708\u5B58\u9519\u8BEF\u6B21\u6570\u8D85\u9650");
	// 1206 3180:new             #2   <Class BusinessException$ErrorMessage>
	// 1207 3183:dup             
	// 1208 3184:ldc2            #1109 <String "load_more">
	// 1209 3187:sipush          134
	// 1210 3190:ldc2            #1111 <String "1212">
	// 1211 3193:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1212 3196:ldc2            #1113 <String "\u5708\u5B58\u9519\u8BEF\u6B21\u6570\u8D85\u9650">
	// 1213 3199:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1214 3202:putstatic       #1115 <Field BusinessException$ErrorMessage load_more>
		apdu_result_ffff = new BusinessException$ErrorMessage("apdu_result_ffff", 135, "1213", ErrorType.remote, "\u7EC8\u7AEF\u6307\u4EE4\u6267\u884C\u8FD4\u56DEFFFF");
	// 1215 3205:new             #2   <Class BusinessException$ErrorMessage>
	// 1216 3208:dup             
	// 1217 3209:ldc2            #1116 <String "apdu_result_ffff">
	// 1218 3212:sipush          135
	// 1219 3215:ldc2            #1118 <String "1213">
	// 1220 3218:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1221 3221:ldc2            #1120 <String "\u7EC8\u7AEF\u6307\u4EE4\u6267\u884C\u8FD4\u56DEFFFF">
	// 1222 3224:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1223 3227:putstatic       #1122 <Field BusinessException$ErrorMessage apdu_result_ffff>
		no_stock = new BusinessException$ErrorMessage("no_stock", 136, "1214", ErrorType.remote, "\u5361\u6570\u636E\u5E93\u5B58\u4E0D\u8DB3");
	// 1224 3230:new             #2   <Class BusinessException$ErrorMessage>
	// 1225 3233:dup             
	// 1226 3234:ldc2            #1123 <String "no_stock">
	// 1227 3237:sipush          136
	// 1228 3240:ldc2            #1125 <String "1214">
	// 1229 3243:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1230 3246:ldc2            #1127 <String "\u5361\u6570\u636E\u5E93\u5B58\u4E0D\u8DB3">
	// 1231 3249:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1232 3252:putstatic       #1129 <Field BusinessException$ErrorMessage no_stock>
		move_user_no_issure = new BusinessException$ErrorMessage("move_user_no_issure", 137, "1215", ErrorType.remote, "\u5E94\u7528\u8FC1\u79FB\u7528\u6237\u975E\u53D1\u5361\u7528\u6237");
	// 1233 3255:new             #2   <Class BusinessException$ErrorMessage>
	// 1234 3258:dup             
	// 1235 3259:ldc2            #1130 <String "move_user_no_issure">
	// 1236 3262:sipush          137
	// 1237 3265:ldc2            #1132 <String "1215">
	// 1238 3268:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1239 3271:ldc2            #1134 <String "\u5E94\u7528\u8FC1\u79FB\u7528\u6237\u975E\u53D1\u5361\u7528\u6237">
	// 1240 3274:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1241 3277:putstatic       #1136 <Field BusinessException$ErrorMessage move_user_no_issure>
		card_balance_overrun = new BusinessException$ErrorMessage("card_balance_overrun", 138, "3013", ErrorType.remote, "\u5361\u4E0A\u4F59\u989D\u8D85\u9650");
	// 1242 3280:new             #2   <Class BusinessException$ErrorMessage>
	// 1243 3283:dup             
	// 1244 3284:ldc2            #1137 <String "card_balance_overrun">
	// 1245 3287:sipush          138
	// 1246 3290:ldc2            #1139 <String "3013">
	// 1247 3293:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1248 3296:ldc2            #1141 <String "\u5361\u4E0A\u4F59\u989D\u8D85\u9650">
	// 1249 3299:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1250 3302:putstatic       #1143 <Field BusinessException$ErrorMessage card_balance_overrun>
		amount_invalid = new BusinessException$ErrorMessage("amount_invalid", 139, "3016", ErrorType.remote, "\u975E\u6CD5\u4EA4\u6613\u91D1\u989D");
	// 1251 3305:new             #2   <Class BusinessException$ErrorMessage>
	// 1252 3308:dup             
	// 1253 3309:ldc2            #1144 <String "amount_invalid">
	// 1254 3312:sipush          139
	// 1255 3315:ldc2            #1146 <String "3016">
	// 1256 3318:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1257 3321:ldc2            #1148 <String "\u975E\u6CD5\u4EA4\u6613\u91D1\u989D">
	// 1258 3324:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1259 3327:putstatic       #1150 <Field BusinessException$ErrorMessage amount_invalid>
		pasm_overrun = new BusinessException$ErrorMessage("pasm_overrun", 140, "3017", ErrorType.remote, "PASM\u91D1\u989D\u8D85\u8FC7\u5F53\u65E5\u4E0A\u9650");
	// 1260 3330:new             #2   <Class BusinessException$ErrorMessage>
	// 1261 3333:dup             
	// 1262 3334:ldc2            #1151 <String "pasm_overrun">
	// 1263 3337:sipush          140
	// 1264 3340:ldc2            #1153 <String "3017">
	// 1265 3343:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1266 3346:ldc2            #1155 <String "PASM\u91D1\u989D\u8D85\u8FC7\u5F53\u65E5\u4E0A\u9650">
	// 1267 3349:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1268 3352:putstatic       #1157 <Field BusinessException$ErrorMessage pasm_overrun>
		card_invalid = new BusinessException$ErrorMessage("card_invalid", 141, "3018", ErrorType.remote, "\u4EA4\u901A\u5361\u5F02\u5E38\u6216\u975E\u6CD5\u5361");
	// 1269 3355:new             #2   <Class BusinessException$ErrorMessage>
	// 1270 3358:dup             
	// 1271 3359:ldc2            #1158 <String "card_invalid">
	// 1272 3362:sipush          141
	// 1273 3365:ldc2            #1160 <String "3018">
	// 1274 3368:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1275 3371:ldc2            #1162 <String "\u4EA4\u901A\u5361\u5F02\u5E38\u6216\u975E\u6CD5\u5361">
	// 1276 3374:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1277 3377:putstatic       #1164 <Field BusinessException$ErrorMessage card_invalid>
		no_activity = new BusinessException$ErrorMessage("no_activity", 142, "5001", ErrorType.remote, "\u8BE5\u5382\u5546\u6CA1\u6709\u6D3B\u52A8\u4FE1\u606F");
	// 1278 3380:new             #2   <Class BusinessException$ErrorMessage>
	// 1279 3383:dup             
	// 1280 3384:ldc2            #1165 <String "no_activity">
	// 1281 3387:sipush          142
	// 1282 3390:ldc2            #1167 <String "5001">
	// 1283 3393:getstatic       #441 <Field BusinessException$ErrorMessage$ErrorType BusinessException$ErrorMessage$ErrorType.remote>
	// 1284 3396:ldc2            #1169 <String "\u8BE5\u5382\u5546\u6CA1\u6709\u6D3B\u52A8\u4FE1\u606F">
	// 1285 3399:invokespecial   #176 <Method void BusinessException$ErrorMessage(String, int, String, BusinessException$ErrorMessage$ErrorType, String)>
	// 1286 3402:putstatic       #1171 <Field BusinessException$ErrorMessage no_activity>
		ENUM$VALUES = (new BusinessException$ErrorMessage[] {
			local_business_cancel, local_business_apdu_handler_null, local_business_execute_fail, local_business_init_fail, local_business_no_card_app_type, local_business_apdu_handler_busying, local_message_platform_business_handle_fail, local_business_local_data_handler_null, local_business_para_error, local_communication_connect_fail, 
			local_communication_connect_param_error, local_communication_disconnect_fail, local_communication_sign_in_fail, local_communication_request_param_error, local_communication_no_response, local_communication_invalid_version, local_communication_invalid_format, local_communication_invalid_verify, local_communication_invalid_control, local_communication_invalid_session, 
			local_communication_invalid_session_serial, local_communication_invalid_direction, local_communication_invalid_response, local_communication_no_key, local_communication_sign_out_fail, local_communication_register_notify_exception, local_message_load_config_fail, local_message_command_data_invaild, local_message_apdu_execute_exception, local_message_message_handle_exception, 
			local_message_open_mobile_exception, local_get_app_info_fail, local_apdu_reponse_invalid, local_get_app_info_no_sptcc, local_app_load_config_fail, local_app_config_invaild_content, local_app_query_app_no_fail, local_app_query_server_fail, business_order_codenot_exist, business_invalid_message_format, 
			business_invalid_message_type, business_message_check_fail, business_business_no_support, business_platform_busy, business_invalid_terminal, business_operate_timeout, business_repeat_message, business_message_invalid_serial, business_serial_not_exist, business_system_error, 
			business_invalid_message_length, business_trade_timeout, business_1920_unknow, business_interface_version_error, business_merchants_not_exist, business_business_stop, business_business_will_exist, business_system_unknow_error, OT_CHECK_FAIL, OT_APPLY_SIR_FAIL, 
			OT_STATE_CHANGE_NOTICE, OT_AC_REQUEST_NOTICE, OT_BUSY, user_unregistered, user_incorrect_password, user_not_sign, user_sign_apply, user_sign_fail, user_sign_sucess, user_logout, 
			user_register, user_severance, user_not_login, user_id_not_matching, user_locked, user_freeze, user_get_password_count_exceed, user_info_incomplete, user_auth_code_invalid, user_auth_code_mobile_invalid, 
			not_support_retrieve_email, user_auth_code_type_invalid, user_auth_code_expire, sptc_open_exception, sptc_close_exception, sptc_personalization_fail, app_issuer_fail, sptc_data_not_matching, card_invaild_check, card_not_order, 
			card_order_by_other, user_order_open, user_unsubscribe_closed, user_order_no_open, user_order_fail, user_unsubscribe_fail, user_order_invaild_info, sptc_app_not_issuer, sptc_personalization, invaild_personalization_info, 
			ack_card_app_unpersonal, ack_card_app_unprepare, ack_card_app_order_fail, ack_card_app_unorder_fail, no_suppert_in_card, no_suppert_out_card, business_order_not_exist, business_order_apply_no_pay, business_order_pay_no_write, business_order_recharge_sucess, 
			business_order_amount_inconsistent, business_order_unsettled_exist, business_order_recharget_fail, business_order_apply_refund, business_order_refund, business_order_rechargeting, business_order_paying, business_order_no_refund, business_order_card_no_inconsistent, business_order_invoice, 
			business_order_no_invoice, business_unsettled_overrun, order_apply_frequent, app_move_code_invalid, order_amount_low, trade_not_exist, trade_handling, trade_fail, trade_sucess, trade_act_check_fail, 
			trade_act_used, apdu_exec_fail, third_seq_repeat, ese_no_space, load_more, apdu_result_ffff, no_stock, move_user_no_issure, card_balance_overrun, amount_invalid, 
			pasm_overrun, card_invalid, no_activity
		});
	// 1287 3405:sipush          143
	// 1288 3408:anewarray       BusinessException$ErrorMessage[]
	// 1289 3411:dup             
	// 1290 3412:iconst_0        
	// 1291 3413:getstatic       #178 <Field BusinessException$ErrorMessage local_business_cancel>
	// 1292 3416:aastore         
	// 1293 3417:dup             
	// 1294 3418:iconst_1        
	// 1295 3419:getstatic       #185 <Field BusinessException$ErrorMessage local_business_apdu_handler_null>
	// 1296 3422:aastore         
	// 1297 3423:dup             
	// 1298 3424:iconst_2        
	// 1299 3425:getstatic       #192 <Field BusinessException$ErrorMessage local_business_execute_fail>
	// 1300 3428:aastore         
	// 1301 3429:dup             
	// 1302 3430:iconst_3        
	// 1303 3431:getstatic       #199 <Field BusinessException$ErrorMessage local_business_init_fail>
	// 1304 3434:aastore         
	// 1305 3435:dup             
	// 1306 3436:iconst_4        
	// 1307 3437:getstatic       #206 <Field BusinessException$ErrorMessage local_business_no_card_app_type>
	// 1308 3440:aastore         
	// 1309 3441:dup             
	// 1310 3442:iconst_5        
	// 1311 3443:getstatic       #213 <Field BusinessException$ErrorMessage local_business_apdu_handler_busying>
	// 1312 3446:aastore         
	// 1313 3447:dup             
	// 1314 3448:bipush          6
	// 1315 3450:getstatic       #220 <Field BusinessException$ErrorMessage local_message_platform_business_handle_fail>
	// 1316 3453:aastore         
	// 1317 3454:dup             
	// 1318 3455:bipush          7
	// 1319 3457:getstatic       #227 <Field BusinessException$ErrorMessage local_business_local_data_handler_null>
	// 1320 3460:aastore         
	// 1321 3461:dup             
	// 1322 3462:bipush          8
	// 1323 3464:getstatic       #234 <Field BusinessException$ErrorMessage local_business_para_error>
	// 1324 3467:aastore         
	// 1325 3468:dup             
	// 1326 3469:bipush          9
	// 1327 3471:getstatic       #241 <Field BusinessException$ErrorMessage local_communication_connect_fail>
	// 1328 3474:aastore         
	// 1329 3475:dup             
	// 1330 3476:bipush          10
	// 1331 3478:getstatic       #248 <Field BusinessException$ErrorMessage local_communication_connect_param_error>
	// 1332 3481:aastore         
	// 1333 3482:dup             
	// 1334 3483:bipush          11
	// 1335 3485:getstatic       #255 <Field BusinessException$ErrorMessage local_communication_disconnect_fail>
	// 1336 3488:aastore         
	// 1337 3489:dup             
	// 1338 3490:bipush          12
	// 1339 3492:getstatic       #262 <Field BusinessException$ErrorMessage local_communication_sign_in_fail>
	// 1340 3495:aastore         
	// 1341 3496:dup             
	// 1342 3497:bipush          13
	// 1343 3499:getstatic       #269 <Field BusinessException$ErrorMessage local_communication_request_param_error>
	// 1344 3502:aastore         
	// 1345 3503:dup             
	// 1346 3504:bipush          14
	// 1347 3506:getstatic       #276 <Field BusinessException$ErrorMessage local_communication_no_response>
	// 1348 3509:aastore         
	// 1349 3510:dup             
	// 1350 3511:bipush          15
	// 1351 3513:getstatic       #283 <Field BusinessException$ErrorMessage local_communication_invalid_version>
	// 1352 3516:aastore         
	// 1353 3517:dup             
	// 1354 3518:bipush          16
	// 1355 3520:getstatic       #290 <Field BusinessException$ErrorMessage local_communication_invalid_format>
	// 1356 3523:aastore         
	// 1357 3524:dup             
	// 1358 3525:bipush          17
	// 1359 3527:getstatic       #297 <Field BusinessException$ErrorMessage local_communication_invalid_verify>
	// 1360 3530:aastore         
	// 1361 3531:dup             
	// 1362 3532:bipush          18
	// 1363 3534:getstatic       #304 <Field BusinessException$ErrorMessage local_communication_invalid_control>
	// 1364 3537:aastore         
	// 1365 3538:dup             
	// 1366 3539:bipush          19
	// 1367 3541:getstatic       #311 <Field BusinessException$ErrorMessage local_communication_invalid_session>
	// 1368 3544:aastore         
	// 1369 3545:dup             
	// 1370 3546:bipush          20
	// 1371 3548:getstatic       #318 <Field BusinessException$ErrorMessage local_communication_invalid_session_serial>
	// 1372 3551:aastore         
	// 1373 3552:dup             
	// 1374 3553:bipush          21
	// 1375 3555:getstatic       #323 <Field BusinessException$ErrorMessage local_communication_invalid_direction>
	// 1376 3558:aastore         
	// 1377 3559:dup             
	// 1378 3560:bipush          22
	// 1379 3562:getstatic       #330 <Field BusinessException$ErrorMessage local_communication_invalid_response>
	// 1380 3565:aastore         
	// 1381 3566:dup             
	// 1382 3567:bipush          23
	// 1383 3569:getstatic       #337 <Field BusinessException$ErrorMessage local_communication_no_key>
	// 1384 3572:aastore         
	// 1385 3573:dup             
	// 1386 3574:bipush          24
	// 1387 3576:getstatic       #344 <Field BusinessException$ErrorMessage local_communication_sign_out_fail>
	// 1388 3579:aastore         
	// 1389 3580:dup             
	// 1390 3581:bipush          25
	// 1391 3583:getstatic       #351 <Field BusinessException$ErrorMessage local_communication_register_notify_exception>
	// 1392 3586:aastore         
	// 1393 3587:dup             
	// 1394 3588:bipush          26
	// 1395 3590:getstatic       #358 <Field BusinessException$ErrorMessage local_message_load_config_fail>
	// 1396 3593:aastore         
	// 1397 3594:dup             
	// 1398 3595:bipush          27
	// 1399 3597:getstatic       #365 <Field BusinessException$ErrorMessage local_message_command_data_invaild>
	// 1400 3600:aastore         
	// 1401 3601:dup             
	// 1402 3602:bipush          28
	// 1403 3604:getstatic       #372 <Field BusinessException$ErrorMessage local_message_apdu_execute_exception>
	// 1404 3607:aastore         
	// 1405 3608:dup             
	// 1406 3609:bipush          29
	// 1407 3611:getstatic       #379 <Field BusinessException$ErrorMessage local_message_message_handle_exception>
	// 1408 3614:aastore         
	// 1409 3615:dup             
	// 1410 3616:bipush          30
	// 1411 3618:getstatic       #386 <Field BusinessException$ErrorMessage local_message_open_mobile_exception>
	// 1412 3621:aastore         
	// 1413 3622:dup             
	// 1414 3623:bipush          31
	// 1415 3625:getstatic       #393 <Field BusinessException$ErrorMessage local_get_app_info_fail>
	// 1416 3628:aastore         
	// 1417 3629:dup             
	// 1418 3630:bipush          32
	// 1419 3632:getstatic       #400 <Field BusinessException$ErrorMessage local_apdu_reponse_invalid>
	// 1420 3635:aastore         
	// 1421 3636:dup             
	// 1422 3637:bipush          33
	// 1423 3639:getstatic       #407 <Field BusinessException$ErrorMessage local_get_app_info_no_sptcc>
	// 1424 3642:aastore         
	// 1425 3643:dup             
	// 1426 3644:bipush          34
	// 1427 3646:getstatic       #414 <Field BusinessException$ErrorMessage local_app_load_config_fail>
	// 1428 3649:aastore         
	// 1429 3650:dup             
	// 1430 3651:bipush          35
	// 1431 3653:getstatic       #421 <Field BusinessException$ErrorMessage local_app_config_invaild_content>
	// 1432 3656:aastore         
	// 1433 3657:dup             
	// 1434 3658:bipush          36
	// 1435 3660:getstatic       #428 <Field BusinessException$ErrorMessage local_app_query_app_no_fail>
	// 1436 3663:aastore         
	// 1437 3664:dup             
	// 1438 3665:bipush          37
	// 1439 3667:getstatic       #435 <Field BusinessException$ErrorMessage local_app_query_server_fail>
	// 1440 3670:aastore         
	// 1441 3671:dup             
	// 1442 3672:bipush          38
	// 1443 3674:getstatic       #445 <Field BusinessException$ErrorMessage business_order_codenot_exist>
	// 1444 3677:aastore         
	// 1445 3678:dup             
	// 1446 3679:bipush          39
	// 1447 3681:getstatic       #452 <Field BusinessException$ErrorMessage business_invalid_message_format>
	// 1448 3684:aastore         
	// 1449 3685:dup             
	// 1450 3686:bipush          40
	// 1451 3688:getstatic       #459 <Field BusinessException$ErrorMessage business_invalid_message_type>
	// 1452 3691:aastore         
	// 1453 3692:dup             
	// 1454 3693:bipush          41
	// 1455 3695:getstatic       #464 <Field BusinessException$ErrorMessage business_message_check_fail>
	// 1456 3698:aastore         
	// 1457 3699:dup             
	// 1458 3700:bipush          42
	// 1459 3702:getstatic       #471 <Field BusinessException$ErrorMessage business_business_no_support>
	// 1460 3705:aastore         
	// 1461 3706:dup             
	// 1462 3707:bipush          43
	// 1463 3709:getstatic       #478 <Field BusinessException$ErrorMessage business_platform_busy>
	// 1464 3712:aastore         
	// 1465 3713:dup             
	// 1466 3714:bipush          44
	// 1467 3716:getstatic       #485 <Field BusinessException$ErrorMessage business_invalid_terminal>
	// 1468 3719:aastore         
	// 1469 3720:dup             
	// 1470 3721:bipush          45
	// 1471 3723:getstatic       #492 <Field BusinessException$ErrorMessage business_operate_timeout>
	// 1472 3726:aastore         
	// 1473 3727:dup             
	// 1474 3728:bipush          46
	// 1475 3730:getstatic       #499 <Field BusinessException$ErrorMessage business_repeat_message>
	// 1476 3733:aastore         
	// 1477 3734:dup             
	// 1478 3735:bipush          47
	// 1479 3737:getstatic       #506 <Field BusinessException$ErrorMessage business_message_invalid_serial>
	// 1480 3740:aastore         
	// 1481 3741:dup             
	// 1482 3742:bipush          48
	// 1483 3744:getstatic       #513 <Field BusinessException$ErrorMessage business_serial_not_exist>
	// 1484 3747:aastore         
	// 1485 3748:dup             
	// 1486 3749:bipush          49
	// 1487 3751:getstatic       #520 <Field BusinessException$ErrorMessage business_system_error>
	// 1488 3754:aastore         
	// 1489 3755:dup             
	// 1490 3756:bipush          50
	// 1491 3758:getstatic       #527 <Field BusinessException$ErrorMessage business_invalid_message_length>
	// 1492 3761:aastore         
	// 1493 3762:dup             
	// 1494 3763:bipush          51
	// 1495 3765:getstatic       #534 <Field BusinessException$ErrorMessage business_trade_timeout>
	// 1496 3768:aastore         
	// 1497 3769:dup             
	// 1498 3770:bipush          52
	// 1499 3772:getstatic       #541 <Field BusinessException$ErrorMessage business_1920_unknow>
	// 1500 3775:aastore         
	// 1501 3776:dup             
	// 1502 3777:bipush          53
	// 1503 3779:getstatic       #548 <Field BusinessException$ErrorMessage business_interface_version_error>
	// 1504 3782:aastore         
	// 1505 3783:dup             
	// 1506 3784:bipush          54
	// 1507 3786:getstatic       #555 <Field BusinessException$ErrorMessage business_merchants_not_exist>
	// 1508 3789:aastore         
	// 1509 3790:dup             
	// 1510 3791:bipush          55
	// 1511 3793:getstatic       #562 <Field BusinessException$ErrorMessage business_business_stop>
	// 1512 3796:aastore         
	// 1513 3797:dup             
	// 1514 3798:bipush          56
	// 1515 3800:getstatic       #569 <Field BusinessException$ErrorMessage business_business_will_exist>
	// 1516 3803:aastore         
	// 1517 3804:dup             
	// 1518 3805:bipush          57
	// 1519 3807:getstatic       #576 <Field BusinessException$ErrorMessage business_system_unknow_error>
	// 1520 3810:aastore         
	// 1521 3811:dup             
	// 1522 3812:bipush          58
	// 1523 3814:getstatic       #583 <Field BusinessException$ErrorMessage OT_CHECK_FAIL>
	// 1524 3817:aastore         
	// 1525 3818:dup             
	// 1526 3819:bipush          59
	// 1527 3821:getstatic       #590 <Field BusinessException$ErrorMessage OT_APPLY_SIR_FAIL>
	// 1528 3824:aastore         
	// 1529 3825:dup             
	// 1530 3826:bipush          60
	// 1531 3828:getstatic       #597 <Field BusinessException$ErrorMessage OT_STATE_CHANGE_NOTICE>
	// 1532 3831:aastore         
	// 1533 3832:dup             
	// 1534 3833:bipush          61
	// 1535 3835:getstatic       #604 <Field BusinessException$ErrorMessage OT_AC_REQUEST_NOTICE>
	// 1536 3838:aastore         
	// 1537 3839:dup             
	// 1538 3840:bipush          62
	// 1539 3842:getstatic       #611 <Field BusinessException$ErrorMessage OT_BUSY>
	// 1540 3845:aastore         
	// 1541 3846:dup             
	// 1542 3847:bipush          63
	// 1543 3849:getstatic       #618 <Field BusinessException$ErrorMessage user_unregistered>
	// 1544 3852:aastore         
	// 1545 3853:dup             
	// 1546 3854:bipush          64
	// 1547 3856:getstatic       #625 <Field BusinessException$ErrorMessage user_incorrect_password>
	// 1548 3859:aastore         
	// 1549 3860:dup             
	// 1550 3861:bipush          65
	// 1551 3863:getstatic       #632 <Field BusinessException$ErrorMessage user_not_sign>
	// 1552 3866:aastore         
	// 1553 3867:dup             
	// 1554 3868:bipush          66
	// 1555 3870:getstatic       #639 <Field BusinessException$ErrorMessage user_sign_apply>
	// 1556 3873:aastore         
	// 1557 3874:dup             
	// 1558 3875:bipush          67
	// 1559 3877:getstatic       #646 <Field BusinessException$ErrorMessage user_sign_fail>
	// 1560 3880:aastore         
	// 1561 3881:dup             
	// 1562 3882:bipush          68
	// 1563 3884:getstatic       #653 <Field BusinessException$ErrorMessage user_sign_sucess>
	// 1564 3887:aastore         
	// 1565 3888:dup             
	// 1566 3889:bipush          69
	// 1567 3891:getstatic       #660 <Field BusinessException$ErrorMessage user_logout>
	// 1568 3894:aastore         
	// 1569 3895:dup             
	// 1570 3896:bipush          70
	// 1571 3898:getstatic       #667 <Field BusinessException$ErrorMessage user_register>
	// 1572 3901:aastore         
	// 1573 3902:dup             
	// 1574 3903:bipush          71
	// 1575 3905:getstatic       #674 <Field BusinessException$ErrorMessage user_severance>
	// 1576 3908:aastore         
	// 1577 3909:dup             
	// 1578 3910:bipush          72
	// 1579 3912:getstatic       #681 <Field BusinessException$ErrorMessage user_not_login>
	// 1580 3915:aastore         
	// 1581 3916:dup             
	// 1582 3917:bipush          73
	// 1583 3919:getstatic       #688 <Field BusinessException$ErrorMessage user_id_not_matching>
	// 1584 3922:aastore         
	// 1585 3923:dup             
	// 1586 3924:bipush          74
	// 1587 3926:getstatic       #695 <Field BusinessException$ErrorMessage user_locked>
	// 1588 3929:aastore         
	// 1589 3930:dup             
	// 1590 3931:bipush          75
	// 1591 3933:getstatic       #702 <Field BusinessException$ErrorMessage user_freeze>
	// 1592 3936:aastore         
	// 1593 3937:dup             
	// 1594 3938:bipush          76
	// 1595 3940:getstatic       #709 <Field BusinessException$ErrorMessage user_get_password_count_exceed>
	// 1596 3943:aastore         
	// 1597 3944:dup             
	// 1598 3945:bipush          77
	// 1599 3947:getstatic       #716 <Field BusinessException$ErrorMessage user_info_incomplete>
	// 1600 3950:aastore         
	// 1601 3951:dup             
	// 1602 3952:bipush          78
	// 1603 3954:getstatic       #723 <Field BusinessException$ErrorMessage user_auth_code_invalid>
	// 1604 3957:aastore         
	// 1605 3958:dup             
	// 1606 3959:bipush          79
	// 1607 3961:getstatic       #730 <Field BusinessException$ErrorMessage user_auth_code_mobile_invalid>
	// 1608 3964:aastore         
	// 1609 3965:dup             
	// 1610 3966:bipush          80
	// 1611 3968:getstatic       #737 <Field BusinessException$ErrorMessage not_support_retrieve_email>
	// 1612 3971:aastore         
	// 1613 3972:dup             
	// 1614 3973:bipush          81
	// 1615 3975:getstatic       #744 <Field BusinessException$ErrorMessage user_auth_code_type_invalid>
	// 1616 3978:aastore         
	// 1617 3979:dup             
	// 1618 3980:bipush          82
	// 1619 3982:getstatic       #751 <Field BusinessException$ErrorMessage user_auth_code_expire>
	// 1620 3985:aastore         
	// 1621 3986:dup             
	// 1622 3987:bipush          83
	// 1623 3989:getstatic       #758 <Field BusinessException$ErrorMessage sptc_open_exception>
	// 1624 3992:aastore         
	// 1625 3993:dup             
	// 1626 3994:bipush          84
	// 1627 3996:getstatic       #765 <Field BusinessException$ErrorMessage sptc_close_exception>
	// 1628 3999:aastore         
	// 1629 4000:dup             
	// 1630 4001:bipush          85
	// 1631 4003:getstatic       #772 <Field BusinessException$ErrorMessage sptc_personalization_fail>
	// 1632 4006:aastore         
	// 1633 4007:dup             
	// 1634 4008:bipush          86
	// 1635 4010:getstatic       #779 <Field BusinessException$ErrorMessage app_issuer_fail>
	// 1636 4013:aastore         
	// 1637 4014:dup             
	// 1638 4015:bipush          87
	// 1639 4017:getstatic       #786 <Field BusinessException$ErrorMessage sptc_data_not_matching>
	// 1640 4020:aastore         
	// 1641 4021:dup             
	// 1642 4022:bipush          88
	// 1643 4024:getstatic       #793 <Field BusinessException$ErrorMessage card_invaild_check>
	// 1644 4027:aastore         
	// 1645 4028:dup             
	// 1646 4029:bipush          89
	// 1647 4031:getstatic       #800 <Field BusinessException$ErrorMessage card_not_order>
	// 1648 4034:aastore         
	// 1649 4035:dup             
	// 1650 4036:bipush          90
	// 1651 4038:getstatic       #807 <Field BusinessException$ErrorMessage card_order_by_other>
	// 1652 4041:aastore         
	// 1653 4042:dup             
	// 1654 4043:bipush          91
	// 1655 4045:getstatic       #814 <Field BusinessException$ErrorMessage user_order_open>
	// 1656 4048:aastore         
	// 1657 4049:dup             
	// 1658 4050:bipush          92
	// 1659 4052:getstatic       #821 <Field BusinessException$ErrorMessage user_unsubscribe_closed>
	// 1660 4055:aastore         
	// 1661 4056:dup             
	// 1662 4057:bipush          93
	// 1663 4059:getstatic       #828 <Field BusinessException$ErrorMessage user_order_no_open>
	// 1664 4062:aastore         
	// 1665 4063:dup             
	// 1666 4064:bipush          94
	// 1667 4066:getstatic       #835 <Field BusinessException$ErrorMessage user_order_fail>
	// 1668 4069:aastore         
	// 1669 4070:dup             
	// 1670 4071:bipush          95
	// 1671 4073:getstatic       #842 <Field BusinessException$ErrorMessage user_unsubscribe_fail>
	// 1672 4076:aastore         
	// 1673 4077:dup             
	// 1674 4078:bipush          96
	// 1675 4080:getstatic       #849 <Field BusinessException$ErrorMessage user_order_invaild_info>
	// 1676 4083:aastore         
	// 1677 4084:dup             
	// 1678 4085:bipush          97
	// 1679 4087:getstatic       #856 <Field BusinessException$ErrorMessage sptc_app_not_issuer>
	// 1680 4090:aastore         
	// 1681 4091:dup             
	// 1682 4092:bipush          98
	// 1683 4094:getstatic       #863 <Field BusinessException$ErrorMessage sptc_personalization>
	// 1684 4097:aastore         
	// 1685 4098:dup             
	// 1686 4099:bipush          99
	// 1687 4101:getstatic       #870 <Field BusinessException$ErrorMessage invaild_personalization_info>
	// 1688 4104:aastore         
	// 1689 4105:dup             
	// 1690 4106:bipush          100
	// 1691 4108:getstatic       #877 <Field BusinessException$ErrorMessage ack_card_app_unpersonal>
	// 1692 4111:aastore         
	// 1693 4112:dup             
	// 1694 4113:bipush          101
	// 1695 4115:getstatic       #884 <Field BusinessException$ErrorMessage ack_card_app_unprepare>
	// 1696 4118:aastore         
	// 1697 4119:dup             
	// 1698 4120:bipush          102
	// 1699 4122:getstatic       #891 <Field BusinessException$ErrorMessage ack_card_app_order_fail>
	// 1700 4125:aastore         
	// 1701 4126:dup             
	// 1702 4127:bipush          103
	// 1703 4129:getstatic       #898 <Field BusinessException$ErrorMessage ack_card_app_unorder_fail>
	// 1704 4132:aastore         
	// 1705 4133:dup             
	// 1706 4134:bipush          104
	// 1707 4136:getstatic       #905 <Field BusinessException$ErrorMessage no_suppert_in_card>
	// 1708 4139:aastore         
	// 1709 4140:dup             
	// 1710 4141:bipush          105
	// 1711 4143:getstatic       #912 <Field BusinessException$ErrorMessage no_suppert_out_card>
	// 1712 4146:aastore         
	// 1713 4147:dup             
	// 1714 4148:bipush          106
	// 1715 4150:getstatic       #919 <Field BusinessException$ErrorMessage business_order_not_exist>
	// 1716 4153:aastore         
	// 1717 4154:dup             
	// 1718 4155:bipush          107
	// 1719 4157:getstatic       #926 <Field BusinessException$ErrorMessage business_order_apply_no_pay>
	// 1720 4160:aastore         
	// 1721 4161:dup             
	// 1722 4162:bipush          108
	// 1723 4164:getstatic       #933 <Field BusinessException$ErrorMessage business_order_pay_no_write>
	// 1724 4167:aastore         
	// 1725 4168:dup             
	// 1726 4169:bipush          109
	// 1727 4171:getstatic       #940 <Field BusinessException$ErrorMessage business_order_recharge_sucess>
	// 1728 4174:aastore         
	// 1729 4175:dup             
	// 1730 4176:bipush          110
	// 1731 4178:getstatic       #947 <Field BusinessException$ErrorMessage business_order_amount_inconsistent>
	// 1732 4181:aastore         
	// 1733 4182:dup             
	// 1734 4183:bipush          111
	// 1735 4185:getstatic       #954 <Field BusinessException$ErrorMessage business_order_unsettled_exist>
	// 1736 4188:aastore         
	// 1737 4189:dup             
	// 1738 4190:bipush          112
	// 1739 4192:getstatic       #961 <Field BusinessException$ErrorMessage business_order_recharget_fail>
	// 1740 4195:aastore         
	// 1741 4196:dup             
	// 1742 4197:bipush          113
	// 1743 4199:getstatic       #968 <Field BusinessException$ErrorMessage business_order_apply_refund>
	// 1744 4202:aastore         
	// 1745 4203:dup             
	// 1746 4204:bipush          114
	// 1747 4206:getstatic       #975 <Field BusinessException$ErrorMessage business_order_refund>
	// 1748 4209:aastore         
	// 1749 4210:dup             
	// 1750 4211:bipush          115
	// 1751 4213:getstatic       #982 <Field BusinessException$ErrorMessage business_order_rechargeting>
	// 1752 4216:aastore         
	// 1753 4217:dup             
	// 1754 4218:bipush          116
	// 1755 4220:getstatic       #989 <Field BusinessException$ErrorMessage business_order_paying>
	// 1756 4223:aastore         
	// 1757 4224:dup             
	// 1758 4225:bipush          117
	// 1759 4227:getstatic       #996 <Field BusinessException$ErrorMessage business_order_no_refund>
	// 1760 4230:aastore         
	// 1761 4231:dup             
	// 1762 4232:bipush          118
	// 1763 4234:getstatic       #1003 <Field BusinessException$ErrorMessage business_order_card_no_inconsistent>
	// 1764 4237:aastore         
	// 1765 4238:dup             
	// 1766 4239:bipush          119
	// 1767 4241:getstatic       #1010 <Field BusinessException$ErrorMessage business_order_invoice>
	// 1768 4244:aastore         
	// 1769 4245:dup             
	// 1770 4246:bipush          120
	// 1771 4248:getstatic       #1017 <Field BusinessException$ErrorMessage business_order_no_invoice>
	// 1772 4251:aastore         
	// 1773 4252:dup             
	// 1774 4253:bipush          121
	// 1775 4255:getstatic       #1024 <Field BusinessException$ErrorMessage business_unsettled_overrun>
	// 1776 4258:aastore         
	// 1777 4259:dup             
	// 1778 4260:bipush          122
	// 1779 4262:getstatic       #1031 <Field BusinessException$ErrorMessage order_apply_frequent>
	// 1780 4265:aastore         
	// 1781 4266:dup             
	// 1782 4267:bipush          123
	// 1783 4269:getstatic       #1038 <Field BusinessException$ErrorMessage app_move_code_invalid>
	// 1784 4272:aastore         
	// 1785 4273:dup             
	// 1786 4274:bipush          124
	// 1787 4276:getstatic       #1045 <Field BusinessException$ErrorMessage order_amount_low>
	// 1788 4279:aastore         
	// 1789 4280:dup             
	// 1790 4281:bipush          125
	// 1791 4283:getstatic       #1052 <Field BusinessException$ErrorMessage trade_not_exist>
	// 1792 4286:aastore         
	// 1793 4287:dup             
	// 1794 4288:bipush          126
	// 1795 4290:getstatic       #1059 <Field BusinessException$ErrorMessage trade_handling>
	// 1796 4293:aastore         
	// 1797 4294:dup             
	// 1798 4295:bipush          127
	// 1799 4297:getstatic       #1066 <Field BusinessException$ErrorMessage trade_fail>
	// 1800 4300:aastore         
	// 1801 4301:dup             
	// 1802 4302:sipush          128
	// 1803 4305:getstatic       #1073 <Field BusinessException$ErrorMessage trade_sucess>
	// 1804 4308:aastore         
	// 1805 4309:dup             
	// 1806 4310:sipush          129
	// 1807 4313:getstatic       #1080 <Field BusinessException$ErrorMessage trade_act_check_fail>
	// 1808 4316:aastore         
	// 1809 4317:dup             
	// 1810 4318:sipush          130
	// 1811 4321:getstatic       #1087 <Field BusinessException$ErrorMessage trade_act_used>
	// 1812 4324:aastore         
	// 1813 4325:dup             
	// 1814 4326:sipush          131
	// 1815 4329:getstatic       #1094 <Field BusinessException$ErrorMessage apdu_exec_fail>
	// 1816 4332:aastore         
	// 1817 4333:dup             
	// 1818 4334:sipush          132
	// 1819 4337:getstatic       #1101 <Field BusinessException$ErrorMessage third_seq_repeat>
	// 1820 4340:aastore         
	// 1821 4341:dup             
	// 1822 4342:sipush          133
	// 1823 4345:getstatic       #1108 <Field BusinessException$ErrorMessage ese_no_space>
	// 1824 4348:aastore         
	// 1825 4349:dup             
	// 1826 4350:sipush          134
	// 1827 4353:getstatic       #1115 <Field BusinessException$ErrorMessage load_more>
	// 1828 4356:aastore         
	// 1829 4357:dup             
	// 1830 4358:sipush          135
	// 1831 4361:getstatic       #1122 <Field BusinessException$ErrorMessage apdu_result_ffff>
	// 1832 4364:aastore         
	// 1833 4365:dup             
	// 1834 4366:sipush          136
	// 1835 4369:getstatic       #1129 <Field BusinessException$ErrorMessage no_stock>
	// 1836 4372:aastore         
	// 1837 4373:dup             
	// 1838 4374:sipush          137
	// 1839 4377:getstatic       #1136 <Field BusinessException$ErrorMessage move_user_no_issure>
	// 1840 4380:aastore         
	// 1841 4381:dup             
	// 1842 4382:sipush          138
	// 1843 4385:getstatic       #1143 <Field BusinessException$ErrorMessage card_balance_overrun>
	// 1844 4388:aastore         
	// 1845 4389:dup             
	// 1846 4390:sipush          139
	// 1847 4393:getstatic       #1150 <Field BusinessException$ErrorMessage amount_invalid>
	// 1848 4396:aastore         
	// 1849 4397:dup             
	// 1850 4398:sipush          140
	// 1851 4401:getstatic       #1157 <Field BusinessException$ErrorMessage pasm_overrun>
	// 1852 4404:aastore         
	// 1853 4405:dup             
	// 1854 4406:sipush          141
	// 1855 4409:getstatic       #1164 <Field BusinessException$ErrorMessage card_invalid>
	// 1856 4412:aastore         
	// 1857 4413:dup             
	// 1858 4414:sipush          142
	// 1859 4417:getstatic       #1171 <Field BusinessException$ErrorMessage no_activity>
	// 1860 4420:aastore         
	// 1861 4421:putstatic       #1173 <Field BusinessException$ErrorMessage[] ENUM$VALUES>
	//*1862 4424:return          
	}

	private BusinessException$ErrorMessage(String s, int i, String s1, ErrorType errortype, String s2)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #1177 <Method void Enum(String, int)>
		id = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #1179 <Field String id>
		type = errortype;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #1181 <Field BusinessException$ErrorMessage$ErrorType type>
		desc = s2;
	//   10   17:aload_0         
	//   11   18:aload           5
	//   12   20:putfield        #1183 <Field String desc>
	//   13   23:return          
	}
}
