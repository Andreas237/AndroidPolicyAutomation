// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.util;

import android.util.Log;
import com.samsung.android.util.SemLog;

// Referenced classes of package com.sec.android.service.health.util:
//			LOG

private static abstract class LOG$Logger extends Enum
{

	public static LOG$Logger valueOf(String s)
	{
		return (LOG$Logger)Enum.valueOf(com/sec/android/service/health/util/LOG$Logger, s);
	//    0    0:ldc1            #2   <Class LOG$Logger>
	//    1    2:aload_0         
	//    2    3:invokestatic    #49  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LOG$Logger>
	//    4    9:areturn         
	}

	public static LOG$Logger[] values()
	{
		return (LOG$Logger[])((LOG$Logger []) ($VALUES)).clone();
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

	private static final LOG$Logger $VALUES[];
	public static final LOG$Logger ANDROID_LOGGER;
	public static final LOG$Logger SDL_LOGGER;
	public static final LOG$Logger SEP_LOGGER;

	static 
	{
		ANDROID_LOGGER = ((LOG$Logger) (new LOG.Logger("ANDROID_LOGGER", 0) {

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
		SDL_LOGGER = ((LOG$Logger) (new LOG.Logger("SDL_LOGGER", 1) {

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
		SEP_LOGGER = ((LOG$Logger) (new LOG.Logger("SEP_LOGGER", 2) {

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
		$VALUES = (new LOG$Logger[] {
			ANDROID_LOGGER, SDL_LOGGER, SEP_LOGGER
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       LOG$Logger[]
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

	private LOG$Logger(String s, int j)
	{
		super(s, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}

	LOG$Logger(String s, int j, LOG._cls1 _pcls1)
	{
		this(s, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #44  <Method void LOG$Logger(String, int)>
	//    4    6:return          
	}
}
