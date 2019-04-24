// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hwcommonmodel.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.multidex.MultiDex;
import com.huawei.feedback.logic.CrashHandler;
import o.*;

public class BaseApplication extends Application
{
	public static final class e extends Enum
	{

		public static e valueOf(String s)
		{
			return (e)Enum.valueOf(com/huawei/hwcommonmodel/application/BaseApplication$e, s);
		//    0    0:ldc1            #2   <Class BaseApplication$e>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class BaseApplication$e>
		//    4    9:areturn         
		}

		public static e[] values()
		{
			return (e[])((e []) (a)).clone();
		//    0    0:getstatic       #34  <Field BaseApplication$e[] a>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.huawei.hwcommonmodel.application.BaseApplication$e_3B_.clone()>
		//    2    6:checkcast       #50  <Class BaseApplication$e[]>
		//    3    9:areturn         
		}

		public String c()
		{
			return c;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field String c>
		//    2    4:areturn         
		}

		private static final e a[];
		public static final e d;
		public static final e e;
		String c;

		static 
		{
			e = new e("WEAR", 0, "com.huawei.bone");
		//    0    0:new             #2   <Class BaseApplication$e>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "WEAR">
		//    3    6:iconst_0        
		//    4    7:ldc1            #20  <String "com.huawei.bone">
		//    5    9:invokespecial   #24  <Method void BaseApplication$e(String, int, String)>
		//    6   12:putstatic       #26  <Field BaseApplication$e e>
			d = new e("HEALTH", 1, "com.huawei.health");
		//    7   15:new             #2   <Class BaseApplication$e>
		//    8   18:dup             
		//    9   19:ldc1            #28  <String "HEALTH">
		//   10   21:iconst_1        
		//   11   22:ldc1            #30  <String "com.huawei.health">
		//   12   24:invokespecial   #24  <Method void BaseApplication$e(String, int, String)>
		//   13   27:putstatic       #32  <Field BaseApplication$e d>
			a = (new e[] {
				e, d
			});
		//   14   30:iconst_2        
		//   15   31:anewarray       e[]
		//   16   34:dup             
		//   17   35:iconst_0        
		//   18   36:getstatic       #26  <Field BaseApplication$e e>
		//   19   39:aastore         
		//   20   40:dup             
		//   21   41:iconst_1        
		//   22   42:getstatic       #32  <Field BaseApplication$e d>
		//   23   45:aastore         
		//   24   46:putstatic       #34  <Field BaseApplication$e[] a>
		//*  25   49:return          
		}

		private e(String s, int j, String s1)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #38  <Method void Enum(String, int)>
			c = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #40  <Field String c>
		//    7   11:return          
		}
	}


	public BaseApplication()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Application()>
		h = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #46  <Field boolean h>
		k = 0L;
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:putfield        #48  <Field long k>
		b = new android.app.Application.ActivityLifecycleCallbacks() {

			public void onActivityCreated(Activity activity, Bundle bundle)
			{
			//    0    0:return          
			}

			public void onActivityDestroyed(Activity activity)
			{
			//    0    0:return          
			}

			public void onActivityPaused(Activity activity)
			{
			//    0    0:return          
			}

			public void onActivityResumed(Activity activity)
			{
			//    0    0:return          
			}

			public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
			{
			//    0    0:return          
			}

			public void onActivityStarted(Activity activity)
			{
				BaseApplication.h();
			//    0    0:invokestatic    #30  <Method int BaseApplication.h()>
			//    1    3:pop             
				if(BaseApplication.k() && BaseApplication.a(a) && BaseApplication.c(a) != null)
			//*   2    4:invokestatic    #34  <Method boolean BaseApplication.k()>
			//*   3    7:ifeq            78
			//*   4   10:aload_0         
			//*   5   11:getfield        #14  <Field BaseApplication a>
			//*   6   14:invokestatic    #37  <Method boolean BaseApplication.a(BaseApplication)>
			//*   7   17:ifeq            78
			//*   8   20:aload_0         
			//*   9   21:getfield        #14  <Field BaseApplication a>
			//*  10   24:invokestatic    #41  <Method czv BaseApplication.c(BaseApplication)>
			//*  11   27:ifnull          78
				{
					dho.d(BaseApplication.i(), new Object[] {
						"onActivityStarted : ", Long.valueOf(System.currentTimeMillis())
					});
			//   12   30:invokestatic    #45  <Method String BaseApplication.i()>
			//   13   33:iconst_2        
			//   14   34:anewarray       Object[]
			//   15   37:dup             
			//   16   38:iconst_0        
			//   17   39:ldc1            #47  <String "onActivityStarted : ">
			//   18   41:aastore         
			//   19   42:dup             
			//   20   43:iconst_1        
			//   21   44:invokestatic    #53  <Method long System.currentTimeMillis()>
			//   22   47:invokestatic    #59  <Method Long Long.valueOf(long)>
			//   23   50:aastore         
			//   24   51:invokestatic    #65  <Method void dho.d(String, Object[])>
					BaseApplication.c(a).a(System.currentTimeMillis());
			//   25   54:aload_0         
			//   26   55:getfield        #14  <Field BaseApplication a>
			//   27   58:invokestatic    #41  <Method czv BaseApplication.c(BaseApplication)>
			//   28   61:invokestatic    #53  <Method long System.currentTimeMillis()>
			//   29   64:invokeinterface #70  <Method void czv.a(long)>
					BaseApplication.b(a, false);
			//   30   69:aload_0         
			//   31   70:getfield        #14  <Field BaseApplication a>
			//   32   73:iconst_0        
			//   33   74:invokestatic    #74  <Method boolean BaseApplication.b(BaseApplication, boolean)>
			//   34   77:pop             
				}
			//   35   78:return          
			}

			public void onActivityStopped(Activity activity)
			{
				BaseApplication.f();
			//    0    0:invokestatic    #78  <Method int BaseApplication.f()>
			//    1    3:pop             
				if(!BaseApplication.k() && BaseApplication.c(a) != null)
			//*   2    4:invokestatic    #34  <Method boolean BaseApplication.k()>
			//*   3    7:ifne            68
			//*   4   10:aload_0         
			//*   5   11:getfield        #14  <Field BaseApplication a>
			//*   6   14:invokestatic    #41  <Method czv BaseApplication.c(BaseApplication)>
			//*   7   17:ifnull          68
				{
					dho.d(BaseApplication.i(), new Object[] {
						"onActivityStopped : ", Long.valueOf(System.currentTimeMillis())
					});
			//    8   20:invokestatic    #45  <Method String BaseApplication.i()>
			//    9   23:iconst_2        
			//   10   24:anewarray       Object[]
			//   11   27:dup             
			//   12   28:iconst_0        
			//   13   29:ldc1            #80  <String "onActivityStopped : ">
			//   14   31:aastore         
			//   15   32:dup             
			//   16   33:iconst_1        
			//   17   34:invokestatic    #53  <Method long System.currentTimeMillis()>
			//   18   37:invokestatic    #59  <Method Long Long.valueOf(long)>
			//   19   40:aastore         
			//   20   41:invokestatic    #65  <Method void dho.d(String, Object[])>
					BaseApplication.c(a).d(System.currentTimeMillis());
			//   21   44:aload_0         
			//   22   45:getfield        #14  <Field BaseApplication a>
			//   23   48:invokestatic    #41  <Method czv BaseApplication.c(BaseApplication)>
			//   24   51:invokestatic    #53  <Method long System.currentTimeMillis()>
			//   25   54:invokeinterface #82  <Method void czv.d(long)>
					BaseApplication.b(a, true);
			//   26   59:aload_0         
			//   27   60:getfield        #14  <Field BaseApplication a>
			//   28   63:iconst_1        
			//   29   64:invokestatic    #74  <Method boolean BaseApplication.b(BaseApplication, boolean)>
			//   30   67:pop             
				}
			//   31   68:return          
			}

			final BaseApplication a;

			
			{
				a = BaseApplication.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field BaseApplication a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    8   14:aload_0         
	//    9   15:new             #6   <Class BaseApplication$3>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:invokespecial   #51  <Method void BaseApplication$3(BaseApplication)>
	//   13   23:putfield        #53  <Field android.app.Application$ActivityLifecycleCallbacks b>
	//   14   26:return          
	}

	public static Context a()
	{
		return c;
	//    0    0:getstatic       #56  <Field Context c>
	//    1    3:areturn         
	}

	public static void a(Context context)
	{
		if(context != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          74
		{
			c = context;
	//    2    4:aload_0         
	//    3    5:putstatic       #56  <Field Context c>
			if(e.e.c().equals(((Object) (context.getPackageName()))))
	//*   4    8:getstatic       #37  <Field BaseApplication$e BaseApplication$e.e>
	//*   5   11:invokevirtual   #59  <Method String BaseApplication$e.c()>
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #64  <Method String Context.getPackageName()>
	//*   8   18:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*   9   21:ifeq            33
				e = e.e;
	//   10   24:getstatic       #37  <Field BaseApplication$e BaseApplication$e.e>
	//   11   27:putstatic       #38  <Field BaseApplication$e e>
			else
	//*  12   30:goto            39
				e = e.d;
	//   13   33:getstatic       #72  <Field BaseApplication$e BaseApplication$e.d>
	//   14   36:putstatic       #38  <Field BaseApplication$e e>
			dho.b(a, new Object[] {
				"AppType = ", e, ", AppTypeName = ", e.c()
			});
	//   15   39:getstatic       #35  <Field String a>
	//   16   42:iconst_4        
	//   17   43:anewarray       Object[]
	//   18   46:dup             
	//   19   47:iconst_0        
	//   20   48:ldc1            #76  <String "AppType = ">
	//   21   50:aastore         
	//   22   51:dup             
	//   23   52:iconst_1        
	//   24   53:getstatic       #38  <Field BaseApplication$e e>
	//   25   56:aastore         
	//   26   57:dup             
	//   27   58:iconst_2        
	//   28   59:ldc1            #78  <String ", AppTypeName = ">
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_3        
	//   32   64:getstatic       #38  <Field BaseApplication$e e>
	//   33   67:invokevirtual   #59  <Method String BaseApplication$e.c()>
	//   34   70:aastore         
	//   35   71:invokestatic    #83  <Method void dho.b(String, Object[])>
		}
	//   36   74:return          
	}

	static boolean a(BaseApplication baseapplication)
	{
		return baseapplication.h;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean h>
	//    2    4:ireturn         
	}

	public static boolean b()
	{
		return d;
	//    0    0:getstatic       #40  <Field boolean d>
	//    1    3:ireturn         
	}

	static boolean b(BaseApplication baseapplication, boolean flag)
	{
		baseapplication.h = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field boolean h>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static czv c(BaseApplication baseapplication)
	{
		return baseapplication.g;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field czv g>
	//    2    4:areturn         
	}

	public static e d()
	{
		if(c == null)
	//*   0    0:getstatic       #56  <Field Context c>
	//*   1    3:ifnonnull       27
			dho.f(a, new Object[] {
				"Context is null for getAppType = ", e
			});
	//    2    6:getstatic       #35  <Field String a>
	//    3    9:iconst_2        
	//    4   10:anewarray       Object[]
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:ldc1            #92  <String "Context is null for getAppType = ">
	//    8   17:aastore         
	//    9   18:dup             
	//   10   19:iconst_1        
	//   11   20:getstatic       #38  <Field BaseApplication$e e>
	//   12   23:aastore         
	//   13   24:invokestatic    #95  <Method void dho.f(String, Object[])>
		return e;
	//   14   27:getstatic       #38  <Field BaseApplication$e e>
	//   15   30:areturn         
	}

	protected static void d(boolean flag)
	{
		d = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #40  <Field boolean d>
	//    2    4:return          
	}

	static int f()
	{
		int j = i;
	//    0    0:getstatic       #99  <Field int i>
	//    1    3:istore_0        
		i = j - 1;
	//    2    4:iload_0         
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putstatic       #99  <Field int i>
		return j;
	//    6   10:iload_0         
	//    7   11:ireturn         
	}

	static int h()
	{
		int j = i;
	//    0    0:getstatic       #99  <Field int i>
	//    1    3:istore_0        
		i = j + 1;
	//    2    4:iload_0         
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putstatic       #99  <Field int i>
		return j;
	//    6   10:iload_0         
	//    7   11:ireturn         
	}

	static String i()
	{
		return a;
	//    0    0:getstatic       #35  <Field String a>
	//    1    3:areturn         
	}

	public static boolean k()
	{
		return i != 0;
	//    0    0:getstatic       #99  <Field int i>
	//    1    3:ifeq            8
	//    2    6:iconst_1        
	//    3    7:ireturn         
	//    4    8:iconst_0        
	//    5    9:ireturn         
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #102 <Method void Application.attachBaseContext(Context)>
		MultiDex.install(((Context) (this)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #107 <Method void MultiDex.install(Context)>
	//    5    9:return          
	}

	public void c()
	{
		g = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #89  <Field czv g>
		h = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #46  <Field boolean h>
	//    6   10:return          
	}

	public void c(czv czv)
	{
		g = czv;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #89  <Field czv g>
	//    3    5:return          
	}

	public void e(long l)
	{
		k = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #48  <Field long k>
	//    3    5:return          
	}

	public long g()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field long k>
	//    2    4:lreturn         
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #113 <Method void Application.onCreate()>
		e(System.currentTimeMillis());
	//    2    4:aload_0         
	//    3    5:invokestatic    #118 <Method long System.currentTimeMillis()>
	//    4    8:invokevirtual   #120 <Method void e(long)>
		if("beta".equals("release"))
	//*   5   11:ldc1            #122 <String "beta">
	//*   6   13:ldc1            #124 <String "release">
	//*   7   15:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*   8   18:ifeq            35
			(new CrashHandler()).init(getApplicationContext());
	//    9   21:new             #126 <Class CrashHandler>
	//   10   24:dup             
	//   11   25:invokespecial   #127 <Method void CrashHandler()>
	//   12   28:aload_0         
	//   13   29:invokevirtual   #130 <Method Context getApplicationContext()>
	//   14   32:invokevirtual   #133 <Method void CrashHandler.init(Context)>
		dho.a(((Context) (this)), getPackageName());
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:invokevirtual   #134 <Method String getPackageName()>
	//   18   40:invokestatic    #137 <Method void dho.a(Context, String)>
		dbf.a("TimeEat_BaseApplication", "Enter BaseApplication onCreate");
	//   19   43:ldc1            #139 <String "TimeEat_BaseApplication">
	//   20   45:ldc1            #141 <String "Enter BaseApplication onCreate">
	//   21   47:invokestatic    #146 <Method void dbf.a(String, String)>
		a(getApplicationContext());
	//   22   50:aload_0         
	//   23   51:invokevirtual   #130 <Method Context getApplicationContext()>
	//   24   54:invokestatic    #148 <Method void a(Context)>
		registerActivityLifecycleCallbacks(b);
	//   25   57:aload_0         
	//   26   58:aload_0         
	//   27   59:getfield        #53  <Field android.app.Application$ActivityLifecycleCallbacks b>
	//   28   62:invokevirtual   #152 <Method void registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
	//   29   65:return          
	}

	private static final String a = ((Class) (com/huawei/hwcommonmodel/application/BaseApplication)).getSimpleName();
	private static Context c;
	private static boolean d = false;
	private static e e;
	private static int i;
	android.app.Application.ActivityLifecycleCallbacks b;
	private czv g;
	private boolean h;
	private long k;

	static 
	{
	//    0    0:ldc1            #2   <Class BaseApplication>
	//    1    2:invokevirtual   #33  <Method String Class.getSimpleName()>
	//    2    5:putstatic       #35  <Field String a>
		e = e.e;
	//    3    8:getstatic       #37  <Field BaseApplication$e BaseApplication$e.e>
	//    4   11:putstatic       #38  <Field BaseApplication$e e>
	//    5   14:iconst_0        
	//    6   15:putstatic       #40  <Field boolean d>
	//*   7   18:return          
	}
}
