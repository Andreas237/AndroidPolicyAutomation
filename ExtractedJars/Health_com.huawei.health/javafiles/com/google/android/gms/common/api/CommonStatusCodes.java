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
	//	               -1 99
	//	               0 102
	//	               1 147
	//	               2 105
	//	               3 108
	//	               4 111
	//	               5 114
	//	               6 117
	//	               7 120
	//	               8 123
	//	               9 147
	//	               10 126
	//	               11 147
	//	               12 147
	//	               13 129
	//	               14 132
	//	               15 135
	//	               16 138
	//	               17 141
	//	               18 144
	//*   2   96:goto            147
		case -1: 
			return "SUCCESS_CACHE";
	//    3   99:ldc1            #47  <String "SUCCESS_CACHE">
	//    4  101:areturn         

		case 0: // '\0'
			return "SUCCESS";
	//    5  102:ldc1            #48  <String "SUCCESS">
	//    6  104:areturn         

		case 2: // '\002'
			return "SERVICE_VERSION_UPDATE_REQUIRED";
	//    7  105:ldc1            #49  <String "SERVICE_VERSION_UPDATE_REQUIRED">
	//    8  107:areturn         

		case 3: // '\003'
			return "SERVICE_DISABLED";
	//    9  108:ldc1            #50  <String "SERVICE_DISABLED">
	//   10  110:areturn         

		case 4: // '\004'
			return "SIGN_IN_REQUIRED";
	//   11  111:ldc1            #51  <String "SIGN_IN_REQUIRED">
	//   12  113:areturn         

		case 5: // '\005'
			return "INVALID_ACCOUNT";
	//   13  114:ldc1            #52  <String "INVALID_ACCOUNT">
	//   14  116:areturn         

		case 6: // '\006'
			return "RESOLUTION_REQUIRED";
	//   15  117:ldc1            #53  <String "RESOLUTION_REQUIRED">
	//   16  119:areturn         

		case 7: // '\007'
			return "NETWORK_ERROR";
	//   17  120:ldc1            #54  <String "NETWORK_ERROR">
	//   18  122:areturn         

		case 8: // '\b'
			return "INTERNAL_ERROR";
	//   19  123:ldc1            #55  <String "INTERNAL_ERROR">
	//   20  125:areturn         

		case 10: // '\n'
			return "DEVELOPER_ERROR";
	//   21  126:ldc1            #56  <String "DEVELOPER_ERROR">
	//   22  128:areturn         

		case 13: // '\r'
			return "ERROR";
	//   23  129:ldc1            #57  <String "ERROR">
	//   24  131:areturn         

		case 14: // '\016'
			return "INTERRUPTED";
	//   25  132:ldc1            #58  <String "INTERRUPTED">
	//   26  134:areturn         

		case 15: // '\017'
			return "TIMEOUT";
	//   27  135:ldc1            #59  <String "TIMEOUT">
	//   28  137:areturn         

		case 16: // '\020'
			return "CANCELED";
	//   29  138:ldc1            #60  <String "CANCELED">
	//   30  140:areturn         

		case 17: // '\021'
			return "API_NOT_CONNECTED";
	//   31  141:ldc1            #61  <String "API_NOT_CONNECTED">
	//   32  143:areturn         

		case 18: // '\022'
			return "DEAD_CLIENT";
	//   33  144:ldc1            #62  <String "DEAD_CLIENT">
	//   34  146:areturn         
		}
		return (new StringBuilder(32)).append("unknown status code: ").append(i).toString();
	//   35  147:new             #64  <Class StringBuilder>
	//   36  150:dup             
	//   37  151:bipush          32
	//   38  153:invokespecial   #67  <Method void StringBuilder(int)>
	//   39  156:ldc1            #69  <String "unknown status code: ">
	//   40  158:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   41  161:iload_0         
	//   42  162:invokevirtual   #76  <Method StringBuilder StringBuilder.append(int)>
	//   43  165:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   44  168:areturn         
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
