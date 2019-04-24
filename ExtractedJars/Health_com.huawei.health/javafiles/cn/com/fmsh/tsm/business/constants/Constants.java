// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.constants;


public interface Constants
{
	public static interface AppLock4Consume
	{

		public static final int lock = 1;
		public static final int unlock = 0;
	}

	public static interface AppLock4Load
	{

		public static final int lock = 1;
		public static final int unlock = 0;
	}

	public static interface AppManagerType
	{

		public static final byte CLEAN = 15;
		public static final byte INSTALL = 3;
		public static final byte ISSUER = 1;
		public static final byte PERSONLIZATION = 2;
		public static final byte QUERY_STATUS = 4;
	}

	public static interface BillType
	{

		public static final int ALL = 0;
		public static final int CONFIRM_DOUBT = 2;
		public static final int DOUBT = 1;
	}

	public static interface CardForm
	{

		public static final int IN_CARD = 2;
		public static final int OUT_CARD = 1;
	}

	public static interface CardType
	{

		public static final byte CARD_SH = 1;
	}

	public static interface Command
	{

		public static final byte LOAD_HEAD[] = {
			-128, 82
		};
		public static final byte LOAD_INITIALIZE_HEAD[] = {
			-128, 80
		};
		public static final byte SELECT_0015[] = abyte0;
		public static final byte SELECT_3F01[] = abyte0;
		public static final byte UPDATE_VALID_DATE[] = {
			4, -42, -107, 24, 8
		};

		/* static  */
		{
		//    0    0:iconst_2        
		//    1    1:newarray        byte[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:ldc1            #16  <Int -128>
		//    5    7:bastore         
		//    6    8:dup             
		//    7    9:iconst_1        
		//    8   10:ldc1            #17  <Int 80>
		//    9   12:bastore         
		//   10   13:putstatic       #19  <Field byte[] LOAD_INITIALIZE_HEAD>
		//   11   16:iconst_2        
		//   12   17:newarray        byte[]
		//   13   19:dup             
		//   14   20:iconst_0        
		//   15   21:ldc1            #16  <Int -128>
		//   16   23:bastore         
		//   17   24:dup             
		//   18   25:iconst_1        
		//   19   26:ldc1            #20  <Int 82>
		//   20   28:bastore         
		//   21   29:putstatic       #22  <Field byte[] LOAD_HEAD>
			byte abyte0[] = new byte[7];
		//   22   32:bipush          7
		//   23   34:newarray        byte[]
		//   24   36:astore_0        
			abyte0[1] = -92;
		//   25   37:aload_0         
		//   26   38:iconst_1        
		//   27   39:bipush          -92
		//   28   41:bastore         
			abyte0[4] = 2;
		//   29   42:aload_0         
		//   30   43:iconst_4        
		//   31   44:iconst_2        
		//   32   45:bastore         
			abyte0[5] = 63;
		//   33   46:aload_0         
		//   34   47:iconst_5        
		//   35   48:bipush          63
		//   36   50:bastore         
			abyte0[6] = 1;
		//   37   51:aload_0         
		//   38   52:bipush          6
		//   39   54:iconst_1        
		//   40   55:bastore         
		//   41   56:aload_0         
		//   42   57:putstatic       #24  <Field byte[] SELECT_3F01>
			abyte0 = new byte[5];
		//   43   60:iconst_5        
		//   44   61:newarray        byte[]
		//   45   63:astore_0        
			abyte0[1] = -80;
		//   46   64:aload_0         
		//   47   65:iconst_1        
		//   48   66:bipush          -80
		//   49   68:bastore         
			abyte0[2] = -107;
		//   50   69:aload_0         
		//   51   70:iconst_2        
		//   52   71:bipush          -107
		//   53   73:bastore         
		//   54   74:aload_0         
		//   55   75:putstatic       #26  <Field byte[] SELECT_0015>
		//   56   78:iconst_5        
		//   57   79:newarray        byte[]
		//   58   81:dup             
		//   59   82:iconst_0        
		//   60   83:ldc1            #27  <Int 4>
		//   61   85:bastore         
		//   62   86:dup             
		//   63   87:iconst_1        
		//   64   88:ldc1            #28  <Int -42>
		//   65   90:bastore         
		//   66   91:dup             
		//   67   92:iconst_2        
		//   68   93:ldc1            #29  <Int -107>
		//   69   95:bastore         
		//   70   96:dup             
		//   71   97:iconst_3        
		//   72   98:ldc1            #30  <Int 24>
		//   73  100:bastore         
		//   74  101:dup             
		//   75  102:iconst_4        
		//   76  103:ldc1            #31  <Int 8>
		//   77  105:bastore         
		//   78  106:putstatic       #33  <Field byte[] UPDATE_VALID_DATE>
		//*  79  109:return          
		}
	}

	public static interface Config
	{

		public static final String CONFIG_NAME_PREFIC = "business";
	}

	public static interface LoginCode
	{

		public static final byte CANCEL_CONTRACT[] = {
			16, 16
		};
		public static final byte CONTRACTING[] = {
			16, 3
		};
		public static final byte CONTRACT_FAIL[] = {
			16, 4
		};
		public static final byte CONTRACT_OK[] = {
			16, 5
		};
		public static final byte FROZEN[] = {
			16, 18
		};
		public static final byte INFO_INCOMPLETE[] = {
			16, 20
		};
		public static final byte INVALID_PWD[] = {
			16, 1
		};
		public static final byte LOCKED[] = {
			16, 17
		};
		public static final byte LOGOUT[] = {
			16, 6
		};
		public static final byte PWD_OVERRUN[] = {
			16, 19
		};
		public static final byte REGISTER[] = {
			16, 7
		};
		public static final byte UNCONTRACT[] = {
			16, 8
		};
		public static final byte UNCONTRACT_USER[] = {
			16, 2
		};
		public static final byte UNREGISTER[] = abyte0;

		/* static  */
		{
			byte abyte0[] = new byte[2];
		//    0    0:iconst_2        
		//    1    1:newarray        byte[]
		//    2    3:astore_0        
			abyte0[0] = 16;
		//    3    4:aload_0         
		//    4    5:iconst_0        
		//    5    6:bipush          16
		//    6    8:bastore         
		//    7    9:aload_0         
		//    8   10:putstatic       #26  <Field byte[] UNREGISTER>
		//    9   13:iconst_2        
		//   10   14:newarray        byte[]
		//   11   16:dup             
		//   12   17:iconst_0        
		//   13   18:ldc1            #27  <Int 16>
		//   14   20:bastore         
		//   15   21:dup             
		//   16   22:iconst_1        
		//   17   23:ldc1            #28  <Int 1>
		//   18   25:bastore         
		//   19   26:putstatic       #30  <Field byte[] INVALID_PWD>
		//   20   29:iconst_2        
		//   21   30:newarray        byte[]
		//   22   32:dup             
		//   23   33:iconst_0        
		//   24   34:ldc1            #27  <Int 16>
		//   25   36:bastore         
		//   26   37:dup             
		//   27   38:iconst_1        
		//   28   39:ldc1            #31  <Int 2>
		//   29   41:bastore         
		//   30   42:putstatic       #33  <Field byte[] UNCONTRACT_USER>
		//   31   45:iconst_2        
		//   32   46:newarray        byte[]
		//   33   48:dup             
		//   34   49:iconst_0        
		//   35   50:ldc1            #27  <Int 16>
		//   36   52:bastore         
		//   37   53:dup             
		//   38   54:iconst_1        
		//   39   55:ldc1            #34  <Int 3>
		//   40   57:bastore         
		//   41   58:putstatic       #36  <Field byte[] CONTRACTING>
		//   42   61:iconst_2        
		//   43   62:newarray        byte[]
		//   44   64:dup             
		//   45   65:iconst_0        
		//   46   66:ldc1            #27  <Int 16>
		//   47   68:bastore         
		//   48   69:dup             
		//   49   70:iconst_1        
		//   50   71:ldc1            #37  <Int 4>
		//   51   73:bastore         
		//   52   74:putstatic       #39  <Field byte[] CONTRACT_FAIL>
		//   53   77:iconst_2        
		//   54   78:newarray        byte[]
		//   55   80:dup             
		//   56   81:iconst_0        
		//   57   82:ldc1            #27  <Int 16>
		//   58   84:bastore         
		//   59   85:dup             
		//   60   86:iconst_1        
		//   61   87:ldc1            #40  <Int 5>
		//   62   89:bastore         
		//   63   90:putstatic       #42  <Field byte[] CONTRACT_OK>
		//   64   93:iconst_2        
		//   65   94:newarray        byte[]
		//   66   96:dup             
		//   67   97:iconst_0        
		//   68   98:ldc1            #27  <Int 16>
		//   69  100:bastore         
		//   70  101:dup             
		//   71  102:iconst_1        
		//   72  103:ldc1            #43  <Int 6>
		//   73  105:bastore         
		//   74  106:putstatic       #45  <Field byte[] LOGOUT>
		//   75  109:iconst_2        
		//   76  110:newarray        byte[]
		//   77  112:dup             
		//   78  113:iconst_0        
		//   79  114:ldc1            #27  <Int 16>
		//   80  116:bastore         
		//   81  117:dup             
		//   82  118:iconst_1        
		//   83  119:ldc1            #46  <Int 7>
		//   84  121:bastore         
		//   85  122:putstatic       #48  <Field byte[] REGISTER>
		//   86  125:iconst_2        
		//   87  126:newarray        byte[]
		//   88  128:dup             
		//   89  129:iconst_0        
		//   90  130:ldc1            #27  <Int 16>
		//   91  132:bastore         
		//   92  133:dup             
		//   93  134:iconst_1        
		//   94  135:ldc1            #49  <Int 8>
		//   95  137:bastore         
		//   96  138:putstatic       #51  <Field byte[] UNCONTRACT>
		//   97  141:iconst_2        
		//   98  142:newarray        byte[]
		//   99  144:dup             
		//  100  145:iconst_0        
		//  101  146:ldc1            #27  <Int 16>
		//  102  148:bastore         
		//  103  149:dup             
		//  104  150:iconst_1        
		//  105  151:ldc1            #27  <Int 16>
		//  106  153:bastore         
		//  107  154:putstatic       #53  <Field byte[] CANCEL_CONTRACT>
		//  108  157:iconst_2        
		//  109  158:newarray        byte[]
		//  110  160:dup             
		//  111  161:iconst_0        
		//  112  162:ldc1            #27  <Int 16>
		//  113  164:bastore         
		//  114  165:dup             
		//  115  166:iconst_1        
		//  116  167:ldc1            #54  <Int 17>
		//  117  169:bastore         
		//  118  170:putstatic       #56  <Field byte[] LOCKED>
		//  119  173:iconst_2        
		//  120  174:newarray        byte[]
		//  121  176:dup             
		//  122  177:iconst_0        
		//  123  178:ldc1            #27  <Int 16>
		//  124  180:bastore         
		//  125  181:dup             
		//  126  182:iconst_1        
		//  127  183:ldc1            #57  <Int 18>
		//  128  185:bastore         
		//  129  186:putstatic       #59  <Field byte[] FROZEN>
		//  130  189:iconst_2        
		//  131  190:newarray        byte[]
		//  132  192:dup             
		//  133  193:iconst_0        
		//  134  194:ldc1            #27  <Int 16>
		//  135  196:bastore         
		//  136  197:dup             
		//  137  198:iconst_1        
		//  138  199:ldc1            #60  <Int 19>
		//  139  201:bastore         
		//  140  202:putstatic       #62  <Field byte[] PWD_OVERRUN>
		//  141  205:iconst_2        
		//  142  206:newarray        byte[]
		//  143  208:dup             
		//  144  209:iconst_0        
		//  145  210:ldc1            #27  <Int 16>
		//  146  212:bastore         
		//  147  213:dup             
		//  148  214:iconst_1        
		//  149  215:ldc1            #63  <Int 20>
		//  150  217:bastore         
		//  151  218:putstatic       #65  <Field byte[] INFO_INCOMPLETE>
		//* 152  221:return          
		}
	}

	public static interface NetworkStatus
	{

		public static final int CONNECT_FAILURE = 2;
		public static final int NONE = 1;
		public static final int SUCCESS = 99;
	}

	public static interface OrderSource
	{

		public static final int CHANNEL_MI = 32;
		public static final int CHANNEL_MOBILE = 21;
	}

	public static interface PayChannel
	{

		public static final byte ONEKEY = 1;
		public static final byte SECURITY = 2;
		public static final byte UNIONPAY = 3;
	}

	public static interface RechargeStatus
	{

		public static final int DOUBT = 2;
		public static final int FAILURE = 0;
		public static final int SUCCESS = 1;
	}

	public static interface RespCodeonse4Platform
	{

		public static final byte CARD_REQUEST[] = {
			-112, 1
		};
		public static final byte SUCESS[] = abyte0;

		/* static  */
		{
			byte abyte0[] = new byte[2];
		//    0    0:iconst_2        
		//    1    1:newarray        byte[]
		//    2    3:astore_0        
			abyte0[0] = -112;
		//    3    4:aload_0         
		//    4    5:iconst_0        
		//    5    6:bipush          -112
		//    6    8:bastore         
		//    7    9:aload_0         
		//    8   10:putstatic       #14  <Field byte[] SUCESS>
		//    9   13:iconst_2        
		//   10   14:newarray        byte[]
		//   11   16:dup             
		//   12   17:iconst_0        
		//   13   18:ldc1            #15  <Int -112>
		//   14   20:bastore         
		//   15   21:dup             
		//   16   22:iconst_1        
		//   17   23:ldc1            #16  <Int 1>
		//   18   25:bastore         
		//   19   26:putstatic       #18  <Field byte[] CARD_REQUEST>
		//*  20   29:return          
		}
	}

	public static interface Result4BusinessHandle
	{

		public static final int FAILURE = -1;
		public static final int SUCESS = 0;
	}

	public static interface TagName
	{

		public static final byte ACTIVITIES = -128;
		public static final byte ACTIVITY = -127;
		public static final byte ACTIVITY_CODE = -125;
		public static final byte ACTIVITY_CODE_LIST = 51;
		public static final byte ACTIVITY_DEFINITION = -120;
		public static final byte ACTIVITY_END = -123;
		public static final byte ACTIVITY_INFO = 71;
		public static final byte ACTIVITY_NAME = -126;
		public static final byte ACTIVITY_REMAINDER = -121;
		public static final byte ACTIVITY_START = -124;
		public static final byte ACTIVITY_STATUS = -115;
		public static final byte ACTIVITY_TOTAL = -122;
		public static final byte APK_DOWNLOAD_URL = 28;
		public static final byte APK_SIZE = 48;
		public static final byte APK_UPDATE_FLAG = 45;
		public static final byte APP_AID = -77;
		public static final byte APP_MANAGE_OPEATE_TYPE = -69;
		public static final byte APP_TYPE = -78;
		public static final byte BUSINESS_HANDLE_RESULT = -75;
		public static final byte BUSINESS_ORDER = 26;
		public static final byte BUSINESS_ORDER_ID = 17;
		public static final byte BUSINESS_ORDER_LIST = 27;
		public static final byte BUSINESS_ORDER_LOAD_TYPE = -55;
		public static final byte BUSINESS_ORDER_OP_TYPE = 58;
		public static final byte BUSINESS_ORDER_TYPE = 72;
		public static final byte CARD_APP_ACTIVATION_STATUS = 63;
		public static final byte CARD_APP_BLANCE = 40;
		public static final byte CARD_APP_RAMDOM = 59;
		public static final byte CARD_APP_VERSION = 61;
		public static final byte CARD_BUSINESS_OP_RECOMMENED = 88;
		public static final byte CARD_BUSINESS_ORDER_STATUS = 62;
		public static final byte CARD_FORM = 47;
		public static final byte CARD_NO = 15;
		public static final byte CARD_TYPE = 14;
		public static final byte CITY_CODE = -101;
		public static final byte COMPANY_CODE = -119;
		public static final byte CPLC = -74;
		public static final byte CP_NO = 79;
		public static final byte DEVICE_MODEL = 104;
		public static final byte ELECTRONIC = 107;
		public static final byte ELECTRONIC_APP_TYPE = 120;
		public static final byte ELECTRONIC_END_TIME = 111;
		public static final byte ELECTRONIC_FROZEN_FLAG = 118;
		public static final byte ELECTRONIC_ID = 112;
		public static final byte ELECTRONIC_LIST = 108;
		public static final byte ELECTRONIC_NUMBER = 114;
		public static final byte ELECTRONIC_OUT_SERIAL = 126;
		public static final byte ELECTRONIC_OUT_STATE = 122;
		public static final byte ELECTRONIC_PRICE_FAVOURABLE = 125;
		public static final byte ELECTRONIC_PUBLISH_START_TIME = 127;
		public static final byte ELECTRONIC_STARTTIME = 110;
		public static final byte ELECTRONIC_STATE = 121;
		public static final byte ELECTRONIC_TRANSFER_FLAG = 117;
		public static final byte ELECTRONIC_TYPE = 115;
		public static final byte ELECTRONIC_TYPE_ID = 113;
		public static final int ELECTRONIC_USE_COUNT = 119;
		public static final byte ELECTRONIC_USE_TIME = 123;
		public static final byte ELECTRONIC_USE_TYPE = 116;
		public static final byte EUID = -72;
		public static final byte IDENTIFYING_CODE = 12;
		public static final byte IDENTIFYING_SERIAL = 64;
		public static final byte IDENTIFYING_TYPE = 11;
		public static final byte IMEI = -70;
		public static final byte INVOICE_TOKEN = 66;
		public static final byte INVOICE_TOKEN_OBJECT = -99;
		public static final byte INVOICE_TOKEN_OBJECT_LIST = -98;
		public static final byte MAIN_ORDER = 96;
		public static final byte MAIN_ORDER_ID = 105;
		public static final byte MAIN_ORDER_LIST = 97;
		public static final byte MOC = 95;
		public static final byte NOTICE_BODY = 52;
		public static final byte NOTICE_END_TIME = 55;
		public static final byte NOTICE_ID = 49;
		public static final byte NOTICE_START_TIME = 54;
		public static final byte NOTICE_TITLE = 50;
		public static final byte OPERATE_TIMING = 98;
		public static final byte OPERATION_ID = -90;
		public static final byte OPERATION_STEP = -89;
		public static final byte ORDER_AMOUNT = 16;
		public static final byte ORDER_BRIEF_INFO = 73;
		public static final byte ORDER_BRIEF_INFO_LIST = 80;
		public static final byte ORDER_CHANNEL = 30;
		public static final byte ORDER_DATE = 19;
		public static final byte ORDER_INVOICE_STATUS = 24;
		public static final byte ORDER_QUERY_PARAM = 25;
		public static final byte ORDER_RANGE_TYPE = 37;
		public static final byte ORDER_TAC = 32;
		public static final byte ORDER_TERMINAL = 23;
		public static final byte ORDER_TIME = 20;
		public static final byte ORDER_TRADE_NO = 22;
		public static final byte ORDER_TRADE_STATUS = 21;
		public static final byte ORDER_TRADE_STATUSES = 92;
		public static final byte ORDER_TYPE = 101;
		public static final byte PASSWORD_MODIFY = 9;
		public static final byte PASSWORD_PROMPT = 10;
		public static final byte PATCH_DATA = -76;
		public static final byte PAY_CHANNEL = 13;
		public static final byte PAY_CHANNEL_MIN = -117;
		public static final byte PAY_CHANNEL_NAME = -118;
		public static final byte PAY_ORDER = 99;
		public static final byte PAY_ORDER_ID = 106;
		public static final byte PAY_ORDER_LIST = 100;
		public static final byte PLATFORM_NOTICES = -109;
		public static final byte PREDEPOSIT_BLANCE = 91;
		public static final byte PREDEPOSIT_INFO = -106;
		public static final byte PREDEPOSIT_LIST = -105;
		public static final byte PREDEPOSIT_STATUS = -116;
		public static final byte PREDEPOSIT_TOTAL = 90;
		public static final byte PREDEPOSIT_TYPE = -107;
		public static final byte PRICE = 124;
		public static final byte PRODUCT_CODE = -103;
		public static final byte PRODUCT_ID = 103;
		public static final byte PRODUCT_INFO = -104;
		public static final byte PRODUCT_LIST = -100;
		public static final byte PRODUCT_NAME = -102;
		public static final byte PROMOTION_MESSAGE = -58;
		public static final byte PROMOTION_MESSAGE_DATA = -56;
		public static final byte PROMOTION_MESSAGE_LIST = -57;
		public static final byte PUBLISH_END_TIME = 109;
		public static final byte QUERY_DATA_SORT_TYPE = 86;
		public static final byte QUERY_RECORD_COUNT = 38;
		public static final byte RENT_HANDLE_DATD = -61;
		public static final byte RENT_HANDLE_TYPE = -62;
		public static final byte SEID = -79;
		public static final byte SIM_SEID = 46;
		public static final byte SIR = -71;
		public static final byte STATION_CONFIG_VERSION = -68;
		public static final byte STATION_ENAME = -64;
		public static final byte STATION_ID = -65;
		public static final byte STATION_INFO = -67;
		public static final byte STATION_INFO_LIST = -66;
		public static final byte STATION_NAME = -63;
		public static final byte SYSTEM_NEW_VERSION = 44;
		public static final byte SYSTEM_VERSION = -112;
		public static final byte TERMINAL_BACK_CHILDREN_ID = 85;
		public static final byte TERMINAL_BACK_CONTENT = 65;
		public static final byte TERMINAL_BACK_INFO = 83;
		public static final byte TERMINAL_BACK_INFO_LIST = 84;
		public static final byte TERMINAL_BACK_INFO_TYPE = 67;
		public static final byte TERMINAL_BACK_MAIN_ID = 81;
		public static final byte TERMINAL_BACK_QUESTION_FLAG = 82;
		public static final byte TERMINAL_BASEBAND_VERSION = 70;
		public static final byte TERMINAL_INFO_TYPE = 93;
		public static final byte TERMINAL_MODEL_NUMBER = 69;
		public static final byte TERMINAL_OP_TYPE = 76;
		public static final byte TERMINAL_OS_VERSION = 68;
		public static final byte TEXT_NOTICE = -110;
		public static final byte THIRD_PAY_NUMBER = 18;
		public static final byte TRADE_STATUS = 31;
		public static final byte UNSOLVED_NOTICES = -108;
		public static final byte URL_LIST = -113;
		public static final byte URL_TYPE = -114;
		public static final byte USER_ACCOUNT = 2;
		public static final byte USER_CERT_NO = 8;
		public static final byte USER_CERT_TYPE = 7;
		public static final byte USER_EMAIL = 4;
		public static final byte USER_LOCK_TIME = 43;
		public static final byte USER_LOGIN_FAIL_COUNT = 36;
		public static final byte USER_MOBILE = 5;
		public static final byte USER_NAME = 6;
		public static final byte USER_PASS = 3;
		public static final byte USER_PLATFORM_ID = -59;
		public static final byte USER_PLATFORM_TYPE = -60;
		public static final byte USER_TYPE = 1;
	}

	public static interface TagName.TerminalInfoTag
	{

		public static final byte BUSINESS_VERSION = 5;
		public static final byte SKD_VERSION = 4;
		public static final byte TERMINAL_MODEL = 1;
		public static final byte TERMINAL_OS_VERSION = 2;
		public static final byte TERMINAL_VERSION = 3;
	}

	public static interface TagValue
	{

		public static final byte BUSINESS_HANDLE_RESULT_FAIL = -1;
		public static final byte BUSINESS_HANDLE_RESULT_SUCESS = 0;
	}

	public static interface TagValueLength
	{

		public static final int NOTICE_ID = 8;
	}

	public static interface TicketOperateType
	{

		public static final int APPLY_BUSINESS = 91;
		public static final int QUERY_LAST_OPERATE = 94;
		public static final int RETURN_TICKET = 92;
		public static final int WRITE_TICKET = 93;
	}

	public static interface TradeCode
	{

		public static final int ALIPAY_ONE_KEY = 2111;
		public static final int ALIPAY_ONE_KEY_CANCEL = 2031;
		public static final int ALIPAY_ONE_KEY_QUERY = 2021;
		public static final int ALIPAY_ONE_KEY_SIGN = 2011;
		public static final int APPLET_DOWNLOAD = 8851;
		public static final int APPLET_DOWNLOAD_VER2 = 8852;
		public static final int APPLY_FOR_ELECTRONIC_TAKEUP = 4611;
		public static final int APPLY_ORDER = 1111;
		public static final int APPLY_ORDER_EX = 1141;
		public static final int APPLY_ORDER_EX_VER2 = 1142;
		public static final int APPLY_ORDER_VER2 = 1112;
		public static final int APP_ISSUER = 8811;
		public static final int APP_ISSUER_PREPARE = 8821;
		public static final int APP_ISSUER_PREPARE_RESULT = 8831;
		public static final int APP_ISSUER_VER2 = 8812;
		public static final int APP_MANAGER = 8841;
		public static final int APP_MANAGER_VER2 = 8842;
		public static final int BUSINESS_ORDER_SETTING = 3041;
		public static final int BUSINESS_ORDER_SETTING_VER2 = 3042;
		public static final int CHECK_SERVER = 1221;
		public static final int DEAL_WITH_DOUBT = 3021;
		public static final int DELETE_TERMINAL_BACK = 4021;
		public static final int GET_CODE = 1061;
		public static final int GET_INVOICE = 3061;
		public static final int GET_INVOICE_VER2 = 3062;
		public static final int GET_INVOICE_VER3 = 3063;
		public static final int LOGIN = 1021;
		public static final int LOGIN_VER2 = 1022;
		public static final int LOGIN_VER3 = 1023;
		public static final int MAIN_ORDER_EXEC = 3091;
		public static final int PERSONLIZATION = 3071;
		public static final int PROMOTION_APPLY_ORDER = 1201;
		public static final int PWD_MODIFY = 1031;
		public static final int QUERY_ACTIVITIES = 1151;
		public static final int QUERY_BUSINESS_ORDER_STATUS = 3051;
		public static final int QUERY_ELECTRONIC_ACTIVITY = 1181;
		public static final int QUERY_ELECTRONIC_TAKEUP = 4631;
		public static final int QUERY_ELECTRONIC_TAKEUP_LIST = 4641;
		public static final int QUERY_ELECTRONIC_TAKEUP_LIST_VER2 = 4642;
		public static final int QUERY_IDENTIFYING = 1061;
		public static final int QUERY_NOTICE = 1311;
		public static final int QUERY_ORDER = 1121;
		public static final int QUERY_ORDERS = 1131;
		public static final int QUERY_ORDERS_VER2 = 1132;
		public static final int QUERY_ORDERS_VER3 = 1133;
		public static final int QUERY_ORDERS_VER4 = 1134;
		public static final int QUERY_ORDER_VER2 = 1122;
		public static final int QUERY_PREDEPOSIT = 1161;
		public static final int QUERY_PREDEPOSIT_VER2 = 1162;
		public static final int QUERY_PRODUCT_INFO = 5021;
		public static final int QUERY_PRODUCT_LIST = 5011;
		public static final int QUERY_PROMOTION_MESSAGE_LIST = 1191;
		public static final int QUERY_TERMINAL_BACK = 4011;
		public static final int QUERY_USER_INFO = 1051;
		public static final int QUERY_USER_INFO_VER2 = 1052;
		public static final int QUERY_VERSION = 1211;
		public static final int REFUND = 2121;
		public static final int REFUND_VER2 = 2122;
		public static final int REMOTE_RECHARGE = 3011;
		public static final int RENT_BUSINESS_HANDLE = 3101;
		public static final int REPORT_TO_PLATFORM = 9001;
		public static final int RETRIVE_PWD = 1041;
		public static final int RETRIVE_PWD_VER3 = 1043;
		public static final int SET_ORDER_STATUS = 1171;
		public static final int STATION_INFO_UPDATE = 3081;
		public static final int SUCESS_4_PLATFORM = 9000;
		public static final int TERMINAL_BACK = 4001;
		public static final int TERMINAL_INFO_REPORT = 4031;
		public static final int TICKET_MANAGER = 8861;
		public static final int USER_REGISTER = 1001;
		public static final int USER_REGISTER_VER2 = 1002;
		public static final int USER_REGISTER_VER3 = 1003;
		public static final int USER_UPDATE = 1011;
		public static final int USER_UPDATE_VER2 = 1012;
		public static final int USE_ELECTRONIC_TAKEUP = 4621;
		public static final int VERIFY_CODE = 1071;
	}

	public static interface UserType
	{

		public static final int COMMON = 1;
		public static final int REAL_NAME = 2;
		public static final int REAL_NAME_AUTH = 3;
	}

	public static interface XMLNode
	{

		public static final String AID = "Aid";
		public static final String AID_VALUE = "value";
		public static final String BUSINESS_AND_SERVER = "BusinessAndServer";
		public static final String BUSINESS_NAME = "businessName";
		public static final String CIPHER = "Cipher";
		public static final String COMPANY_CODE = "CompanyCode";
		public static final String COMPANY_CODE_VALUE = "value";
		public static final String KEY = "Key";
		public static final String KEY_CIPHER = "cipher";
		public static final String KEY_ENCRY_TYPE = "encryType";
		public static final String KEY_EXPONENT = "exponent";
		public static final String KEY_INDEX = "index";
		public static final String KEY_MODULUS = "modulus";
		public static final String LOG_LEVEL = "LogLevel";
		public static final String LOG_LEVEL_VALUE = "value";
		public static final String ORDER_SOURCE = "OrderSource";
		public static final String ORDER_SOURCE_VALUE = "value";
		public static final String SDK_VERSION = "sdkVersion";
		public static final String SERVER = "Server";
		public static final String SERVER_DOMAIN = "domain";
		public static final String SERVER_NAME = "serverName";
		public static final String SERVER_PORT = "port";
		public static final String SERVER_TOMEOUT = "socketTimeout";
		public static final String TERMINAL = "Termianl";
		public static final String TERMINAL_BUSINESS_VERSION = "businessVersion";
		public static final String TERMINAL_OS_VERSION = "osVersion";
		public static final String TERMINAL_TYPE = "type";
		public static final String TERMINAL_VERSION = "terminalVersion";
	}


	public static final String CODE_PROPERTIES_FILE = "/code.properties";
	public static final String DEFAULT_APP_NO = "00000000000000000000";
	public static final String DEFAULT_STATION_VERSION = "0";
	public static final String PROTOCOL_CONFIG_FILE = "/message.xml";
	public static final String SYSTEM_CONFIG_FILE = "/business.xml";
	public static final int TERMIANL_NUMBER_LENGTH = 32;
}
