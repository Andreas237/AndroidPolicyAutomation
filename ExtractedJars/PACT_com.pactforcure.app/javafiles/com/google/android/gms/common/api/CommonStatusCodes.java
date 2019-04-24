// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;


public class CommonStatusCodes
{

	protected CommonStatusCodes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:return          
	}

	public static String getStatusCodeString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     -1 18: default 96
	//	               -1 118
	//	               0 121
	//	               1 96
	//	               2 124
	//	               3 127
	//	               4 130
	//	               5 133
	//	               6 136
	//	               7 139
	//	               8 142
	//	               9 96
	//	               10 145
	//	               11 96
	//	               12 96
	//	               13 148
	//	               14 151
	//	               15 154
	//	               16 157
	//	               17 160
	//	               18 163
		case 1: // '\001'
		case 9: // '\t'
		case 11: // '\013'
		case 12: // '\f'
		default:
			return (new StringBuilder(32)).append("unknown status code: ").append(i).toString();
	//    2   96:new             #48  <Class StringBuilder>
	//    3   99:dup             
	//    4  100:bipush          32
	//    5  102:invokespecial   #51  <Method void StringBuilder(int)>
	//    6  105:ldc1            #53  <String "unknown status code: ">
	//    7  107:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    8  110:iload_0         
	//    9  111:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
	//   10  114:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   11  117:areturn         

		case -1: 
			return "SUCCESS_CACHE";
	//   12  118:ldc1            #65  <String "SUCCESS_CACHE">
	//   13  120:areturn         

		case 0: // '\0'
			return "SUCCESS";
	//   14  121:ldc1            #66  <String "SUCCESS">
	//   15  123:areturn         

		case 2: // '\002'
			return "SERVICE_VERSION_UPDATE_REQUIRED";
	//   16  124:ldc1            #67  <String "SERVICE_VERSION_UPDATE_REQUIRED">
	//   17  126:areturn         

		case 3: // '\003'
			return "SERVICE_DISABLED";
	//   18  127:ldc1            #68  <String "SERVICE_DISABLED">
	//   19  129:areturn         

		case 4: // '\004'
			return "SIGN_IN_REQUIRED";
	//   20  130:ldc1            #69  <String "SIGN_IN_REQUIRED">
	//   21  132:areturn         

		case 5: // '\005'
			return "INVALID_ACCOUNT";
	//   22  133:ldc1            #70  <String "INVALID_ACCOUNT">
	//   23  135:areturn         

		case 6: // '\006'
			return "RESOLUTION_REQUIRED";
	//   24  136:ldc1            #71  <String "RESOLUTION_REQUIRED">
	//   25  138:areturn         

		case 7: // '\007'
			return "NETWORK_ERROR";
	//   26  139:ldc1            #72  <String "NETWORK_ERROR">
	//   27  141:areturn         

		case 8: // '\b'
			return "INTERNAL_ERROR";
	//   28  142:ldc1            #73  <String "INTERNAL_ERROR">
	//   29  144:areturn         

		case 10: // '\n'
			return "DEVELOPER_ERROR";
	//   30  145:ldc1            #74  <String "DEVELOPER_ERROR">
	//   31  147:areturn         

		case 13: // '\r'
			return "ERROR";
	//   32  148:ldc1            #75  <String "ERROR">
	//   33  150:areturn         

		case 14: // '\016'
			return "INTERRUPTED";
	//   34  151:ldc1            #76  <String "INTERRUPTED">
	//   35  153:areturn         

		case 15: // '\017'
			return "TIMEOUT";
	//   36  154:ldc1            #77  <String "TIMEOUT">
	//   37  156:areturn         

		case 16: // '\020'
			return "CANCELED";
	//   38  157:ldc1            #78  <String "CANCELED">
	//   39  159:areturn         

		case 17: // '\021'
			return "API_NOT_CONNECTED";
	//   40  160:ldc1            #79  <String "API_NOT_CONNECTED">
	//   41  162:areturn         

		case 18: // '\022'
			return "DEAD_CLIENT";
	//   42  163:ldc1            #80  <String "DEAD_CLIENT">
	//   43  165:areturn         
		}
	}

	public static final int API_NOT_CONNECTED = 17;
	public static final int CANCELED = 16;
	public static final int DEAD_CLIENT = 18;
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
