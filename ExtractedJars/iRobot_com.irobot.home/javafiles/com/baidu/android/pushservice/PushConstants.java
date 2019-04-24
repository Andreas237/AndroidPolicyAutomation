// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;


public final class PushConstants
{

	public PushConstants()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
	//    2    4:return          
	}

	public static String a(int i)
	{
		if(i != 0)
	//*   0    0:iload_0         
	//*   1    1:ifeq            222
		{
			if(i != 30699)
	//*   2    4:iload_0         
	//*   3    5:sipush          30699
	//*   4    8:icmpeq          219
			{
				if(i != 40002)
	//*   5   11:iload_0         
	//*   6   12:ldc1            #55  <Int 40002>
	//*   7   14:icmpeq          216
				{
					if(i != 0x1adb1)
	//*   8   17:iload_0         
	//*   9   18:ldc1            #56  <Int 0x1adb1>
	//*  10   20:icmpeq          213
						switch(i)
	//*  11   23:iload_0         
						{
	//*  12   24:tableswitch     10001 10003: default 52
	//	               10001 210
	//	               10002 207
	//	               10003 204
						default:
							switch(i)
	//*  13   52:iload_0         
							{
	//*  14   53:tableswitch     30600 30618: default 144
	//	               30600 201
	//	               30601 198
	//	               30602 195
	//	               30603 192
	//	               30604 189
	//	               30605 186
	//	               30606 183
	//	               30607 180
	//	               30608 177
	//	               30609 174
	//	               30610 171
	//	               30611 168
	//	               30612 165
	//	               30613 162
	//	               30614 159
	//	               30615 156
	//	               30616 153
	//	               30617 150
	//	               30618 147
							default:
								return "Unknown";
	//   15  144:ldc1            #58  <String "Unknown">
	//   16  146:areturn         

							case 30618: 
								return "Application Is Not Approved, Can Not Use The Push Service";
	//   17  147:ldc1            #60  <String "Application Is Not Approved, Can Not Use The Push Service">
	//   18  149:areturn         

							case 30617: 
								return "Application Do Not Have Multicast Capability";
	//   19  150:ldc1            #62  <String "Application Do Not Have Multicast Capability">
	//   20  152:areturn         

							case 30616: 
								return "Application Do Not Have Unicast Capability";
	//   21  153:ldc1            #64  <String "Application Do Not Have Unicast Capability">
	//   22  155:areturn         

							case 30615: 
								return "Number Of Tag For App Too Many";
	//   23  156:ldc1            #66  <String "Number Of Tag For App Too Many">
	//   24  158:areturn         

							case 30614: 
								return "Number Of Tag For User Too Many";
	//   25  159:ldc1            #68  <String "Number Of Tag For User Too Many">
	//   26  161:areturn         

							case 30613: 
								return "App Need Inied First In Push-console";
	//   27  162:ldc1            #70  <String "App Need Inied First In Push-console">
	//   28  164:areturn         

							case 30612: 
								return "Application Forbidden, Need Whitelist Authorization";
	//   29  165:ldc1            #72  <String "Application Forbidden, Need Whitelist Authorization">
	//   30  167:areturn         

							case 30611: 
								return "Group Not Found";
	//   31  168:ldc1            #74  <String "Group Not Found">
	//   32  170:areturn         

							case 30610: 
								return "Duplicate Operation";
	//   33  171:ldc1            #76  <String "Duplicate Operation">
	//   34  173:areturn         

							case 30609: 
								return "Bind Number Too Many";
	//   35  174:ldc1            #78  <String "Bind Number Too Many">
	//   36  176:areturn         

							case 30608: 
								return "Bind Relation Not Found";
	//   37  177:ldc1            #80  <String "Bind Relation Not Found">
	//   38  179:areturn         

							case 30607: 
								return "Channel Token Timeout";
	//   39  180:ldc1            #82  <String "Channel Token Timeout">
	//   40  182:areturn         

							case 30606: 
								return "Request Time Expires Timeout";
	//   41  183:ldc1            #84  <String "Request Time Expires Timeout">
	//   42  185:areturn         

							case 30605: 
								return "Data Required Not Found";
	//   43  186:ldc1            #86  <String "Data Required Not Found">
	//   44  188:areturn         

							case 30604: 
								return "Quota Use Up Payment Required";
	//   45  189:ldc1            #88  <String "Quota Use Up Payment Required">
	//   46  191:areturn         

							case 30603: 
								return "Authentication Failed";
	//   47  192:ldc1            #90  <String "Authentication Failed">
	//   48  194:areturn         

							case 30602: 
								return "Request Params Not Valid";
	//   49  195:ldc1            #92  <String "Request Params Not Valid">
	//   50  197:areturn         

							case 30601: 
								return "Method Not Allowed";
	//   51  198:ldc1            #94  <String "Method Not Allowed">
	//   52  200:areturn         

							case 30600: 
								return "Internal Server Error";
	//   53  201:ldc1            #96  <String "Internal Server Error">
	//   54  203:areturn         
							}

						case 10003: 
							return "Service not available temporary";
	//   55  204:ldc1            #98  <String "Service not available temporary">
	//   56  206:areturn         

						case 10002: 
							return "Service not available";
	//   57  207:ldc1            #100 <String "Service not available">
	//   58  209:areturn         

						case 10001: 
							return "Network Problem";
	//   59  210:ldc1            #102 <String "Network Problem">
	//   60  212:areturn         
						}
					else
						return "User blacked this app";
	//   61  213:ldc1            #104 <String "User blacked this app">
	//   62  215:areturn         
				} else
				{
					return "Get lightapp info fail";
	//   63  216:ldc1            #106 <String "Get lightapp info fail">
	//   64  218:areturn         
				}
			} else
			{
				return "Requests Are Too Frequent To Be Temporarily Rejected";
	//   65  219:ldc1            #108 <String "Requests Are Too Frequent To Be Temporarily Rejected">
	//   66  221:areturn         
			}
		} else
		{
			return "Success";
	//   67  222:ldc1            #110 <String "Success">
	//   68  224:areturn         
		}
	}

	public static final String ACTION_MESSAGE = "com.baidu.android.pushservice.action.MESSAGE";
	public static final String ACTION_METHOD = "com.baidu.android.pushservice.action.METHOD";
	public static final String ACTION_RECEIVE = "com.baidu.android.pushservice.action.RECEIVE";
	public static final int ERROR_SUCCESS = 0;
	public static final String EXTRA_APP = "app";
	public static final String EXTRA_CONTENT = "content";
	public static final String EXTRA_ERROR_CODE = "error_msg";
	public static final String EXTRA_METHOD = "method";
	public static final String EXTRA_PUSH_MESSAGE = "message";
	public static final int LOGIN_TYPE_ACCESS_TOKEN = 1;
	public static final int LOGIN_TYPE_API_KEY = 0;
	public static final int LOGIN_TYPE_BDUSS = 2;
	public static final int LOGIN_TYPE_LIGHT_APP_API_KEY = 4;
	public static final int LOGIN_TYPE_WEB_APP_API_KEY = 3;
	public static final String METHOD_BIND = "method_bind";
	public static final String PACKAGE_NAME = "pkg_name";
}
