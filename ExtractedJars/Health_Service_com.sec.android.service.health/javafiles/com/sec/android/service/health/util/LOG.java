// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.util;

import android.util.Log;
import com.samsung.android.util.SemLog;

public class LOG
{
	private static abstract class Logger extends Enum
	{

		public static Logger valueOf(String s)
		{
			return (Logger)Enum.valueOf(com/sec/android/service/health/util/LOG$Logger, s);
		//    0    0:ldc1            #2   <Class LOG$Logger>
		//    1    2:aload_0         
		//    2    3:invokestatic    #49  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LOG$Logger>
		//    4    9:areturn         
		}

		public static Logger[] values()
		{
			return (Logger[])((Logger []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field LOG$Logger[] $VALUES>
		//    1    3:invokevirtual   #56  <Method Object _5B_Lcom.sec.android.service.health.util.LOG$Logger_3B_.clone()>
		//    2    6:checkcast       #52  <Class LOG$Logger[]>
		//    3    9:areturn         
		}

		abstract void d(String s, String s1);

		abstract void e(String s, String s1);

		abstract void e(String s, String s1, Throwable throwable);

		abstract void i(String s, String s1);

		abstract void v(String s, String s1);

		abstract void w(String s, String s1);

		private static final Logger $VALUES[];
		public static final Logger ANDROID_LOGGER;
		public static final Logger SDL_LOGGER;
		public static final Logger SEP_LOGGER;

		static 
		{
			ANDROID_LOGGER = ((Logger) (new Logger("ANDROID_LOGGER", 0) {

				void d(String s, String s1)
				{
					Log.d(s, s1);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokestatic    #20  <Method int Log.d(String, String)>
				//    3    5:pop             
				//    4    6:return          
				}

				void e(String s, String s1)
				{
					Log.e(s, s1);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokestatic    #23  <Method int Log.e(String, String)>
				//    3    5:pop             
				//    4    6:return          
				}

				void e(String s, String s1, Throwable throwable)
				{
					Log.e(s, s1, throwable);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:aload_3         
				//    3    3:invokestatic    #27  <Method int Log.e(String, String, Throwable)>
				//    4    6:pop             
				//    5    7:return          
				}

				void i(String s, String s1)
				{
					Log.i(s, s1);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokestatic    #30  <Method int Log.i(String, String)>
				//    3    5:pop             
				//    4    6:return          
				}

				void v(String s, String s1)
				{
					Log.v(s, s1);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokestatic    #33  <Method int Log.v(String, String)>
				//    3    5:pop             
				//    4    6:return          
				}

				void w(String s, String s1)
				{
					Log.w(s, s1);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokestatic    #36  <Method int Log.w(String, String)>
				//    3    5:pop             
				//    4    6:return          
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void LOG$Logger(String, int, LOG$1)>
			//    5    7:return          
			}
			}
));
		//    0    0:new             #10  <Class LOG$Logger$1>
		//    1    3:dup             
		//    2    4:ldc1            #23  <String "ANDROID_LOGGER">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #27  <Method void LOG$Logger$1(String, int)>
		//    5   10:putstatic       #29  <Field LOG$Logger ANDROID_LOGGER>
			SDL_LOGGER = ((Logger) (new Logger("SDL_LOGGER", 1) {

				void d(String s, String s1)
				{
					android.util.secutil.Log.secD(s, s1);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokestatic    #21  <Method int android.util.secutil.Log.secD(String, String)>
				//    3    5:pop             
				//    4    6:return          
				}

				void e(String s, String s1)
				{
					android.util.secutil.Log.secE(s, s1);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokestatic    #25  <Method int android.util.secutil.Log.secE(String, String)>
				//    3    5:pop             
				//    4    6:return          
				}

				void e(String s, String s1, Throwable throwable)
				{
					android.util.secutil.Log.secE(s, s1, throwable);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:aload_3         
				//    3    3:invokestatic    #29  <Method int android.util.secutil.Log.secE(String, String, Throwable)>
				//    4    6:pop             
				//    5    7:return          
				}

				void i(String s, String s1)
				{
					android.util.secutil.Log.secI(s, s1);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokestatic    #33  <Method int android.util.secutil.Log.secI(String, String)>
				//    3    5:pop             
				//    4    6:return          
				}

				void v(String s, String s1)
				{
					android.util.secutil.Log.secV(s, s1);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokestatic    #37  <Method int android.util.secutil.Log.secV(String, String)>
				//    3    5:pop             
				//    4    6:return          
				}

				void w(String s, String s1)
				{
					android.util.secutil.Log.secW(s, s1);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokestatic    #41  <Method int android.util.secutil.Log.secW(String, String)>
				//    3    5:pop             
				//    4    6:return          
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void LOG$Logger(String, int, LOG$1)>
			//    5    7:return          
			}
			}
));
		//    6   13:new             #12  <Class LOG$Logger$2>
		//    7   16:dup             
		//    8   17:ldc1            #30  <String "SDL_LOGGER">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #31  <Method void LOG$Logger$2(String, int)>
		//   11   23:putstatic       #33  <Field LOG$Logger SDL_LOGGER>
			SEP_LOGGER = ((Logger) (new Logger("SEP_LOGGER", 2) {

				void d(String s, String s1)
				{
					SemLog.secD(s, s1);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokestatic    #21  <Method int SemLog.secD(String, String)>
				//    3    5:pop             
				//    4    6:return          
				}

				void e(String s, String s1)
				{
					SemLog.secE(s, s1);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokestatic    #25  <Method int SemLog.secE(String, String)>
				//    3    5:pop             
				//    4    6:return          
				}

				void e(String s, String s1, Throwable throwable)
				{
					SemLog.secE(s, s1, throwable);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:aload_3         
				//    3    3:invokestatic    #29  <Method int SemLog.secE(String, String, Throwable)>
				//    4    6:pop             
				//    5    7:return          
				}

				void i(String s, String s1)
				{
					SemLog.secI(s, s1);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokestatic    #33  <Method int SemLog.secI(String, String)>
				//    3    5:pop             
				//    4    6:return          
				}

				void v(String s, String s1)
				{
					SemLog.secV(s, s1);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokestatic    #37  <Method int SemLog.secV(String, String)>
				//    3    5:pop             
				//    4    6:return          
				}

				void w(String s, String s1)
				{
					SemLog.secW(s, s1);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokestatic    #41  <Method int SemLog.secW(String, String)>
				//    3    5:pop             
				//    4    6:return          
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void LOG$Logger(String, int, LOG$1)>
			//    5    7:return          
			}
			}
));
		//   12   26:new             #14  <Class LOG$Logger$3>
		//   13   29:dup             
		//   14   30:ldc1            #34  <String "SEP_LOGGER">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #35  <Method void LOG$Logger$3(String, int)>
		//   17   36:putstatic       #37  <Field LOG$Logger SEP_LOGGER>
			$VALUES = (new Logger[] {
				ANDROID_LOGGER, SDL_LOGGER, SEP_LOGGER
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       Logger[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #29  <Field LOG$Logger ANDROID_LOGGER>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #33  <Field LOG$Logger SDL_LOGGER>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #37  <Field LOG$Logger SEP_LOGGER>
		//   31   60:aastore         
		//   32   61:putstatic       #39  <Field LOG$Logger[] $VALUES>
		//*  33   64:return          
		}

		private Logger(String s, int j)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}

	}


	private LOG()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	public static void d(Class class1, String s)
	{
		sLogger.d(getLogTag(class1), s);
	//    0    0:getstatic       #25  <Field LOG$Logger sLogger>
	//    1    3:aload_0         
	//    2    4:invokestatic    #35  <Method String getLogTag(Class)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #38  <Method void LOG$Logger.d(String, String)>
	//    5   11:return          
	}

	public static void d(String s, String s1)
	{
		sLogger.d(s, s1);
	//    0    0:getstatic       #25  <Field LOG$Logger sLogger>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #38  <Method void LOG$Logger.d(String, String)>
	//    4    8:return          
	}

	public static void e(Class class1, String s)
	{
		sLogger.e(getLogTag(class1), s);
	//    0    0:getstatic       #25  <Field LOG$Logger sLogger>
	//    1    3:aload_0         
	//    2    4:invokestatic    #35  <Method String getLogTag(Class)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #43  <Method void LOG$Logger.e(String, String)>
	//    5   11:return          
	}

	public static void e(String s, String s1)
	{
		sLogger.e(s, s1);
	//    0    0:getstatic       #25  <Field LOG$Logger sLogger>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method void LOG$Logger.e(String, String)>
	//    4    8:return          
	}

	private static String getLogTag(Class class1)
	{
		return (new StringBuilder()).append("[PrivilegeHealthService]").append(class1.getSimpleName()).toString();
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void StringBuilder()>
	//    3    7:ldc1            #48  <String "[PrivilegeHealthService]">
	//    4    9:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #58  <Method String Class.getSimpleName()>
	//    7   16:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #61  <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	private static boolean hasClass(String s)
	{
		try
		{
			Class.forName(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #70  <Method Class Class.forName(String)>
	//    2    4:pop             
		}
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    7:astore_0        
		{
			return false;
	//    6    8:iconst_0        
	//    7    9:ireturn         
		}
		return true;
	}

	public static void i(Class class1, String s)
	{
		sLogger.i(getLogTag(class1), s);
	//    0    0:getstatic       #25  <Field LOG$Logger sLogger>
	//    1    3:aload_0         
	//    2    4:invokestatic    #35  <Method String getLogTag(Class)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #73  <Method void LOG$Logger.i(String, String)>
	//    5   11:return          
	}

	public static void i(String s, String s1)
	{
		sLogger.i(s, s1);
	//    0    0:getstatic       #25  <Field LOG$Logger sLogger>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #73  <Method void LOG$Logger.i(String, String)>
	//    4    8:return          
	}

	public static void logThrowable(Class class1, String s, Throwable throwable)
	{
		sLogger.e(getLogTag(class1), s, throwable);
	//    0    0:getstatic       #25  <Field LOG$Logger sLogger>
	//    1    3:aload_0         
	//    2    4:invokestatic    #35  <Method String getLogTag(Class)>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #78  <Method void LOG$Logger.e(String, String, Throwable)>
		s = ((String) (throwable.getCause()));
	//    6   12:aload_2         
	//    7   13:invokevirtual   #84  <Method Throwable Throwable.getCause()>
	//    8   16:astore_1        
		if(s != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          38
		{
			sLogger.e(getLogTag(class1), "-----<<<<<Was caused by");
	//   11   21:getstatic       #25  <Field LOG$Logger sLogger>
	//   12   24:aload_0         
	//   13   25:invokestatic    #35  <Method String getLogTag(Class)>
	//   14   28:ldc1            #86  <String "-----<<<<<Was caused by">
	//   15   30:invokevirtual   #43  <Method void LOG$Logger.e(String, String)>
			logThrowable(class1, ((Throwable) (s)));
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:invokestatic    #89  <Method void logThrowable(Class, Throwable)>
		}
	//   19   38:return          
	}

	public static void logThrowable(Class class1, Throwable throwable)
	{
		logThrowable(class1, (new StringBuilder()).append("-----<<<<<").append(((Object) (throwable)).getClass().getCanonicalName()).toString(), throwable);
	//    0    0:aload_0         
	//    1    1:new             #45  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #46  <Method void StringBuilder()>
	//    4    8:ldc1            #19  <String "-----<<<<<">
	//    5   10:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #94  <Method Class Object.getClass()>
	//    8   17:invokevirtual   #97  <Method String Class.getCanonicalName()>
	//    9   20:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   11   26:aload_1         
	//   12   27:invokestatic    #99  <Method void logThrowable(Class, String, Throwable)>
	//   13   30:return          
	}

	public static void setLogger()
	{
label0:
		{
			if(sLogger == null)
	//*   0    0:getstatic       #25  <Field LOG$Logger sLogger>
	//*   1    3:ifnonnull       20
			{
				if(!hasClass("com.samsung.android.util.SemLog"))
					break label0;
	//    2    6:ldc1            #103 <String "com.samsung.android.util.SemLog">
	//    3    8:invokestatic    #105 <Method boolean hasClass(String)>
	//    4   11:ifeq            21
				sLogger = Logger.SEP_LOGGER;
	//    5   14:getstatic       #108 <Field LOG$Logger LOG$Logger.SEP_LOGGER>
	//    6   17:putstatic       #25  <Field LOG$Logger sLogger>
			}
			return;
	//    7   20:return          
		}
		if(hasClass("android.util.secutil.Log"))
	//*   8   21:ldc1            #110 <String "android.util.secutil.Log">
	//*   9   23:invokestatic    #105 <Method boolean hasClass(String)>
	//*  10   26:ifeq            36
		{
			sLogger = Logger.SDL_LOGGER;
	//   11   29:getstatic       #113 <Field LOG$Logger LOG$Logger.SDL_LOGGER>
	//   12   32:putstatic       #25  <Field LOG$Logger sLogger>
			return;
	//   13   35:return          
		} else
		{
			sLogger = Logger.ANDROID_LOGGER;
	//   14   36:getstatic       #116 <Field LOG$Logger LOG$Logger.ANDROID_LOGGER>
	//   15   39:putstatic       #25  <Field LOG$Logger sLogger>
			return;
	//   16   42:return          
		}
	}

	public static void v(Class class1, String s)
	{
		sLogger.v(getLogTag(class1), s);
	//    0    0:getstatic       #25  <Field LOG$Logger sLogger>
	//    1    3:aload_0         
	//    2    4:invokestatic    #35  <Method String getLogTag(Class)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #119 <Method void LOG$Logger.v(String, String)>
	//    5   11:return          
	}

	public static void v(String s, String s1)
	{
		sLogger.v(s, s1);
	//    0    0:getstatic       #25  <Field LOG$Logger sLogger>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #119 <Method void LOG$Logger.v(String, String)>
	//    4    8:return          
	}

	public static void w(Class class1, String s)
	{
		sLogger.w(getLogTag(class1), s);
	//    0    0:getstatic       #25  <Field LOG$Logger sLogger>
	//    1    3:aload_0         
	//    2    4:invokestatic    #35  <Method String getLogTag(Class)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #122 <Method void LOG$Logger.w(String, String)>
	//    5   11:return          
	}

	public static void w(String s, String s1)
	{
		sLogger.w(s, s1);
	//    0    0:getstatic       #25  <Field LOG$Logger sLogger>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #122 <Method void LOG$Logger.w(String, String)>
	//    4    8:return          
	}

	private static final String LOG_DELIMITER = "-----<<<<<";
	private static Logger sLogger = null;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #25  <Field LOG$Logger sLogger>
	//*   2    4:return          
	}
}
