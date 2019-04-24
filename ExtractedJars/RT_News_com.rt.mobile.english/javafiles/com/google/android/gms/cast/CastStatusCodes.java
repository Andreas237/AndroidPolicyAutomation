// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class CastStatusCodes extends CommonStatusCodes
{

	private CastStatusCodes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void CommonStatusCodes()>
	//    2    4:return          
	}

	public static String getStatusCodeString(int i)
	{
		if(i != 0)
	//*   0    0:iload_0         
	//*   1    1:ifeq            233
		{
			if(i != 2015)
	//*   2    4:iload_0         
	//*   3    5:sipush          2015
	//*   4    8:icmpeq          230
				switch(i)
	//*   5   11:iload_0         
				{
	//*   6   12:tableswitch     7 8: default 36
	//	               7 227
	//	               8 224
				default:
					switch(i)
	//*   7   36:iload_0         
					{
	//*   8   37:tableswitch     13 15: default 64
	//	               13 221
	//	               14 218
	//	               15 215
					default:
						switch(i)
	//*   9   64:iload_0         
						{
	//*  10   65:tableswitch     2000 2007: default 112
	//	               2000 212
	//	               2001 209
	//	               2002 206
	//	               2003 203
	//	               2004 200
	//	               2005 197
	//	               2006 194
	//	               2007 191
						default:
							switch(i)
	//*  11  112:iload_0         
							{
	//*  12  113:tableswitch     2100 2103: default 144
	//	               2100 188
	//	               2101 185
	//	               2102 182
	//	               2103 179
							default:
								switch(i)
	//*  13  144:iload_0         
								{
	//*  14  145:tableswitch     2200 2201: default 168
	//	               2200 176
	//	               2201 173
								default:
									return CommonStatusCodes.getStatusCodeString(i);
	//   15  168:iload_0         
	//   16  169:invokestatic    #54  <Method String CommonStatusCodes.getStatusCodeString(int)>
	//   17  172:areturn         

								case 2201: 
									return "ERROR_SERVICE_DISCONNECTED";
	//   18  173:ldc1            #55  <String "ERROR_SERVICE_DISCONNECTED">
	//   19  175:areturn         

								case 2200: 
									return "ERROR_SERVICE_CREATION_FAILED";
	//   20  176:ldc1            #56  <String "ERROR_SERVICE_CREATION_FAILED">
	//   21  178:areturn         
								}

							case 2103: 
								return "REPLACED";
	//   22  179:ldc1            #57  <String "REPLACED">
	//   23  181:areturn         

							case 2102: 
								return "STATUS_TIMED_OUT";
	//   24  182:ldc1            #59  <String "STATUS_TIMED_OUT">
	//   25  184:areturn         

							case 2101: 
								return "STATUS_CANCELLED";
	//   26  185:ldc1            #61  <String "STATUS_CANCELLED">
	//   27  187:areturn         

							case 2100: 
								return "FAILED";
	//   28  188:ldc1            #62  <String "FAILED">
	//   29  190:areturn         
							}

						case 2007: 
							return "MESSAGE_SEND_BUFFER_TOO_FULL";
	//   30  191:ldc1            #63  <String "MESSAGE_SEND_BUFFER_TOO_FULL">
	//   31  193:areturn         

						case 2006: 
							return "MESSAGE_TOO_LARGE";
	//   32  194:ldc1            #64  <String "MESSAGE_TOO_LARGE">
	//   33  196:areturn         

						case 2005: 
							return "APPLICATION_NOT_RUNNING";
	//   34  197:ldc1            #65  <String "APPLICATION_NOT_RUNNING">
	//   35  199:areturn         

						case 2004: 
							return "APPLICATION_NOT_FOUND";
	//   36  200:ldc1            #66  <String "APPLICATION_NOT_FOUND">
	//   37  202:areturn         

						case 2003: 
							return "NOT_ALLOWED";
	//   38  203:ldc1            #67  <String "NOT_ALLOWED">
	//   39  205:areturn         

						case 2002: 
							return "CANCELED";
	//   40  206:ldc1            #68  <String "CANCELED">
	//   41  208:areturn         

						case 2001: 
							return "INVALID_REQUEST";
	//   42  209:ldc1            #69  <String "INVALID_REQUEST">
	//   43  211:areturn         

						case 2000: 
							return "AUTHENTICATION_FAILED";
	//   44  212:ldc1            #70  <String "AUTHENTICATION_FAILED">
	//   45  214:areturn         
						}

					case 15: // '\017'
						return "TIMEOUT";
	//   46  215:ldc1            #71  <String "TIMEOUT">
	//   47  217:areturn         

					case 14: // '\016'
						return "INTERRUPTED";
	//   48  218:ldc1            #72  <String "INTERRUPTED">
	//   49  220:areturn         

					case 13: // '\r'
						return "UNKNOWN_ERROR";
	//   50  221:ldc1            #73  <String "UNKNOWN_ERROR">
	//   51  223:areturn         
					}

				case 8: // '\b'
					return "INTERNAL_ERROR";
	//   52  224:ldc1            #74  <String "INTERNAL_ERROR">
	//   53  226:areturn         

				case 7: // '\007'
					return "NETWORK_ERROR";
	//   54  227:ldc1            #75  <String "NETWORK_ERROR">
	//   55  229:areturn         
				}
			else
				return "TCP_PROBER_FAIL_TO_VERIFY_DEVICE";
	//   56  230:ldc1            #77  <String "TCP_PROBER_FAIL_TO_VERIFY_DEVICE">
	//   57  232:areturn         
		} else
		{
			return "SUCCESS";
	//   58  233:ldc1            #78  <String "SUCCESS">
	//   59  235:areturn         
		}
	}

	public static final int APPLICATION_NOT_FOUND = 2004;
	public static final int APPLICATION_NOT_RUNNING = 2005;
	public static final int AUTHENTICATION_FAILED = 2000;
	public static final int CANCELED = 2002;
	public static final int DEVICE_CONNECTION_SUSPENDED = 2016;
	public static final int ERROR_SERVICE_CREATION_FAILED = 2200;
	public static final int ERROR_SERVICE_DISCONNECTED = 2201;
	public static final int ERROR_STOPPING_SERVICE_FAILED = 2202;
	public static final int FAILED = 2100;
	public static final int INTERNAL_ERROR = 8;
	public static final int INTERRUPTED = 14;
	public static final int INVALID_REQUEST = 2001;
	public static final int MESSAGE_SEND_BUFFER_TOO_FULL = 2007;
	public static final int MESSAGE_TOO_LARGE = 2006;
	public static final int NETWORK_ERROR = 7;
	public static final int NOT_ALLOWED = 2003;
	public static final int REPLACED = 2103;
	public static final int SUCCESS = 0;
	public static final int TIMEOUT = 15;
	public static final int UNKNOWN_ERROR = 13;
}
