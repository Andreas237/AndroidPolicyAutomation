// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;


public class CommonStatusCodes
{

	protected CommonStatusCodes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
	//    2    4:return          
	}

	public static String getStatusCodeString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     -1 18: default 96
	//	               -1 169
	//	               0 166
	//	               1 96
	//	               2 163
	//	               3 160
	//	               4 157
	//	               5 154
	//	               6 151
	//	               7 148
	//	               8 145
	//	               9 96
	//	               10 142
	//	               11 96
	//	               12 96
	//	               13 139
	//	               14 136
	//	               15 133
	//	               16 130
	//	               17 127
	//	               18 124
		case 1: // '\001'
		case 9: // '\t'
		case 11: // '\013'
		case 12: // '\f'
		default:
			StringBuilder stringbuilder = new StringBuilder(32);
	//    2   96:new             #47  <Class StringBuilder>
	//    3   99:dup             
	//    4  100:bipush          32
	//    5  102:invokespecial   #50  <Method void StringBuilder(int)>
	//    6  105:astore_1        
			stringbuilder.append("unknown status code: ");
	//    7  106:aload_1         
	//    8  107:ldc1            #52  <String "unknown status code: ">
	//    9  109:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   10  112:pop             
			stringbuilder.append(i);
	//   11  113:aload_1         
	//   12  114:iload_0         
	//   13  115:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   14  118:pop             
			return stringbuilder.toString();
	//   15  119:aload_1         
	//   16  120:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   17  123:areturn         

		case 18: // '\022'
			return "DEAD_CLIENT";
	//   18  124:ldc1            #65  <String "DEAD_CLIENT">
	//   19  126:areturn         

		case 17: // '\021'
			return "API_NOT_CONNECTED";
	//   20  127:ldc1            #66  <String "API_NOT_CONNECTED">
	//   21  129:areturn         

		case 16: // '\020'
			return "CANCELED";
	//   22  130:ldc1            #67  <String "CANCELED">
	//   23  132:areturn         

		case 15: // '\017'
			return "TIMEOUT";
	//   24  133:ldc1            #68  <String "TIMEOUT">
	//   25  135:areturn         

		case 14: // '\016'
			return "INTERRUPTED";
	//   26  136:ldc1            #69  <String "INTERRUPTED">
	//   27  138:areturn         

		case 13: // '\r'
			return "ERROR";
	//   28  139:ldc1            #70  <String "ERROR">
	//   29  141:areturn         

		case 10: // '\n'
			return "DEVELOPER_ERROR";
	//   30  142:ldc1            #71  <String "DEVELOPER_ERROR">
	//   31  144:areturn         

		case 8: // '\b'
			return "INTERNAL_ERROR";
	//   32  145:ldc1            #72  <String "INTERNAL_ERROR">
	//   33  147:areturn         

		case 7: // '\007'
			return "NETWORK_ERROR";
	//   34  148:ldc1            #73  <String "NETWORK_ERROR">
	//   35  150:areturn         

		case 6: // '\006'
			return "RESOLUTION_REQUIRED";
	//   36  151:ldc1            #74  <String "RESOLUTION_REQUIRED">
	//   37  153:areturn         

		case 5: // '\005'
			return "INVALID_ACCOUNT";
	//   38  154:ldc1            #75  <String "INVALID_ACCOUNT">
	//   39  156:areturn         

		case 4: // '\004'
			return "SIGN_IN_REQUIRED";
	//   40  157:ldc1            #76  <String "SIGN_IN_REQUIRED">
	//   41  159:areturn         

		case 3: // '\003'
			return "SERVICE_DISABLED";
	//   42  160:ldc1            #77  <String "SERVICE_DISABLED">
	//   43  162:areturn         

		case 2: // '\002'
			return "SERVICE_VERSION_UPDATE_REQUIRED";
	//   44  163:ldc1            #78  <String "SERVICE_VERSION_UPDATE_REQUIRED">
	//   45  165:areturn         

		case 0: // '\0'
			return "SUCCESS";
	//   46  166:ldc1            #79  <String "SUCCESS">
	//   47  168:areturn         

		case -1: 
			return "SUCCESS_CACHE";
	//   48  169:ldc1            #80  <String "SUCCESS_CACHE">
	//   49  171:areturn         
		}
	}

	public static final int API_NOT_CONNECTED = 17;
	public static final int CANCELED = 16;
	public static final int DEVELOPER_ERROR = 10;
	public static final int ERROR = 13;
	public static final int INTERNAL_ERROR = 8;
	public static final int INTERRUPTED = 14;
	public static final int INVALID_ACCOUNT = 5;
	public static final int NETWORK_ERROR = 7;
	public static final int RESOLUTION_REQUIRED = 6;
	public static final int SERVICE_DISABLED = 3;
	public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
	public static final int SIGN_IN_REQUIRED = 4;
	public static final int SUCCESS = 0;
	public static final int SUCCESS_CACHE = -1;
	public static final int TIMEOUT = 15;
}
