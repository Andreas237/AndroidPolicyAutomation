// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.irobot.core.AssetUpdateProgressEvent;
import org.androidannotations.api.a;
import org.androidannotations.api.b;

// Referenced classes of package com.irobot.home.util:
//			AssetSoftwareUpdateUtils

public final class AssetSoftwareUpdateUtils_ extends AssetSoftwareUpdateUtils
{

	private AssetSoftwareUpdateUtils_(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void AssetSoftwareUpdateUtils()>
		e = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Context e>
		d();
	//    5    9:aload_0         
	//    6   10:invokespecial   #26  <Method void d()>
	//    7   13:return          
	}

	public static AssetSoftwareUpdateUtils_ a(Context context)
	{
		return new AssetSoftwareUpdateUtils_(context);
	//    0    0:new             #2   <Class AssetSoftwareUpdateUtils_>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #31  <Method void AssetSoftwareUpdateUtils_(Context)>
	//    4    8:areturn         
	}

	static void a(AssetSoftwareUpdateUtils_ assetsoftwareupdateutils_)
	{
		((AssetSoftwareUpdateUtils) (assetsoftwareupdateutils_)).com.irobot.home.util.AssetSoftwareUpdateUtils.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void com.irobot.home.util.AssetSoftwareUpdateUtils.a()>
	//    2    4:return          
	}

	static void a(AssetSoftwareUpdateUtils_ assetsoftwareupdateutils_, android.content.DialogInterface.OnClickListener onclicklistener)
	{
		((AssetSoftwareUpdateUtils) (assetsoftwareupdateutils_)).com.irobot.home.util.AssetSoftwareUpdateUtils.a(onclicklistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void com.irobot.home.util.AssetSoftwareUpdateUtils.a(android.content.DialogInterface$OnClickListener)>
	//    3    5:return          
	}

	static void a(AssetSoftwareUpdateUtils_ assetsoftwareupdateutils_, android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnClickListener onclicklistener1)
	{
		((AssetSoftwareUpdateUtils) (assetsoftwareupdateutils_)).com.irobot.home.util.AssetSoftwareUpdateUtils.a(onclicklistener, onclicklistener1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #42  <Method void com.irobot.home.util.AssetSoftwareUpdateUtils.a(android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnClickListener)>
	//    4    6:return          
	}

	static void a(AssetSoftwareUpdateUtils_ assetsoftwareupdateutils_, AssetUpdateProgressEvent assetupdateprogressevent)
	{
		((AssetSoftwareUpdateUtils) (assetsoftwareupdateutils_)).AssetSoftwareUpdateUtils.onAssetUpdateProgressEvent(assetupdateprogressevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method void AssetSoftwareUpdateUtils.onAssetUpdateProgressEvent(AssetUpdateProgressEvent)>
	//    3    5:return          
	}

	static void b(AssetSoftwareUpdateUtils_ assetsoftwareupdateutils_)
	{
		((AssetSoftwareUpdateUtils) (assetsoftwareupdateutils_)).AssetSoftwareUpdateUtils.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void AssetSoftwareUpdateUtils.c()>
	//    2    4:return          
	}

	private void d()
	{
		if(e instanceof Activity)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Context e>
	//*   2    4:instanceof      #53  <Class Activity>
	//*   3    7:ifeq            22
		{
			a = (Activity)e;
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field Context e>
	//    7   15:checkcast       #53  <Class Activity>
	//    8   18:putfield        #56  <Field Activity a>
			return;
	//    9   21:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   22:new             #58  <Class StringBuilder>
	//   11   25:dup             
	//   12   26:invokespecial   #59  <Method void StringBuilder()>
	//   13   29:astore_1        
			stringbuilder.append("Due to Context class ");
	//   14   30:aload_1         
	//   15   31:ldc1            #61  <String "Due to Context class ">
	//   16   33:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
			stringbuilder.append(((Object) (e)).getClass().getSimpleName());
	//   18   37:aload_1         
	//   19   38:aload_0         
	//   20   39:getfield        #23  <Field Context e>
	//   21   42:invokevirtual   #71  <Method Class Object.getClass()>
	//   22   45:invokevirtual   #77  <Method String Class.getSimpleName()>
	//   23   48:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
			stringbuilder.append(", the @RootContext Activity won't be populated");
	//   25   52:aload_1         
	//   26   53:ldc1            #79  <String ", the @RootContext Activity won't be populated">
	//   27   55:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
			Log.w("AssetSoftwareUpdateUtil", stringbuilder.toString());
	//   29   59:ldc1            #81  <String "AssetSoftwareUpdateUtil">
	//   30   61:aload_1         
	//   31   62:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   32   65:invokestatic    #90  <Method int Log.w(String, String)>
	//   33   68:pop             
			return;
	//   34   69:return          
		}
	}

	public void a()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.util.AssetSoftwareUpdateUtils_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field AssetSoftwareUpdateUtils_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.util.AssetSoftwareUpdateUtils_.a(AssetSoftwareUpdateUtils_)>
					return;
			//    3    7:return          
				}
				catch(Throwable throwable)
			//*   4    8:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    5    9:invokestatic    #29  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    6   12:invokestatic    #33  <Method Thread Thread.currentThread()>
			//    7   15:aload_1         
			//    8   16:invokeinterface #39  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//    9   21:return          
			}

			final AssetSoftwareUpdateUtils_ a;

			
			{
				a = AssetSoftwareUpdateUtils_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field AssetSoftwareUpdateUtils_ a>
				super(s, l, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #17  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #12  <Class AssetSoftwareUpdateUtils_$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #92  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #92  <String "">
	//    6   10:invokespecial   #95  <Method void AssetSoftwareUpdateUtils_$4(AssetSoftwareUpdateUtils_, String, long, String)>
	//    7   13:invokestatic    #100 <Method void a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void a(android.content.DialogInterface.OnClickListener onclicklistener)
	{
		org.androidannotations.api.b.a("", new Runnable(onclicklistener) {

			public void run()
			{
				com.irobot.home.util.AssetSoftwareUpdateUtils_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field AssetSoftwareUpdateUtils_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field android.content.DialogInterface$OnClickListener a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.util.AssetSoftwareUpdateUtils_.a(AssetSoftwareUpdateUtils_, android.content.DialogInterface$OnClickListener)>
			//    5   11:return          
			}

			final android.content.DialogInterface.OnClickListener a;
			final AssetSoftwareUpdateUtils_ b;

			
			{
				b = AssetSoftwareUpdateUtils_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AssetSoftwareUpdateUtils_ b>
				a = onclicklistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field android.content.DialogInterface$OnClickListener a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #92  <String "">
	//    1    2:new             #8   <Class AssetSoftwareUpdateUtils_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #102 <Method void AssetSoftwareUpdateUtils_$2(AssetSoftwareUpdateUtils_, android.content.DialogInterface$OnClickListener)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #107 <Method void b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnClickListener onclicklistener1)
	{
		org.androidannotations.api.b.a("", new Runnable(onclicklistener, onclicklistener1) {

			public void run()
			{
				com.irobot.home.util.AssetSoftwareUpdateUtils_.a(c, a, b);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field AssetSoftwareUpdateUtils_ c>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field android.content.DialogInterface$OnClickListener a>
			//    4    8:aload_0         
			//    5    9:getfield        #23  <Field android.content.DialogInterface$OnClickListener b>
			//    6   12:invokestatic    #30  <Method void com.irobot.home.util.AssetSoftwareUpdateUtils_.a(AssetSoftwareUpdateUtils_, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnClickListener)>
			//    7   15:return          
			}

			final android.content.DialogInterface.OnClickListener a;
			final android.content.DialogInterface.OnClickListener b;
			final AssetSoftwareUpdateUtils_ c;

			
			{
				c = AssetSoftwareUpdateUtils_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AssetSoftwareUpdateUtils_ c>
				a = onclicklistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field android.content.DialogInterface$OnClickListener a>
				b = onclicklistener1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field android.content.DialogInterface$OnClickListener b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
		}
, 0L);
	//    0    0:ldc1            #92  <String "">
	//    1    2:new             #6   <Class AssetSoftwareUpdateUtils_$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:invokespecial   #109 <Method void AssetSoftwareUpdateUtils_$1(AssetSoftwareUpdateUtils_, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnClickListener)>
	//    7   12:lconst_0        
	//    8   13:invokestatic    #107 <Method void b.a(String, Runnable, long)>
	//    9   16:return          
	}

	protected void c()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.util.AssetSoftwareUpdateUtils_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AssetSoftwareUpdateUtils_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.util.AssetSoftwareUpdateUtils_.b(AssetSoftwareUpdateUtils_)>
					return;
			//    3    7:return          
				}
				catch(Throwable throwable)
			//*   4    8:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    5    9:invokestatic    #31  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    6   12:invokestatic    #35  <Method Thread Thread.currentThread()>
			//    7   15:aload_1         
			//    8   16:invokeinterface #41  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//    9   21:return          
			}

			final AssetSoftwareUpdateUtils_ a;

			
			{
				a = AssetSoftwareUpdateUtils_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AssetSoftwareUpdateUtils_ a>
				super(s, l, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #14  <Class AssetSoftwareUpdateUtils_$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #92  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #92  <String "">
	//    6   10:invokespecial   #110 <Method void AssetSoftwareUpdateUtils_$5(AssetSoftwareUpdateUtils_, String, long, String)>
	//    7   13:invokestatic    #100 <Method void a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void onAssetUpdateProgressEvent(AssetUpdateProgressEvent assetupdateprogressevent)
	{
		org.androidannotations.api.b.a("", new Runnable(assetupdateprogressevent) {

			public void run()
			{
				com.irobot.home.util.AssetSoftwareUpdateUtils_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field AssetSoftwareUpdateUtils_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field AssetUpdateProgressEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.util.AssetSoftwareUpdateUtils_.a(AssetSoftwareUpdateUtils_, AssetUpdateProgressEvent)>
			//    5   11:return          
			}

			final AssetUpdateProgressEvent a;
			final AssetSoftwareUpdateUtils_ b;

			
			{
				b = AssetSoftwareUpdateUtils_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AssetSoftwareUpdateUtils_ b>
				a = assetupdateprogressevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AssetUpdateProgressEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #92  <String "">
	//    1    2:new             #10  <Class AssetSoftwareUpdateUtils_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #113 <Method void AssetSoftwareUpdateUtils_$3(AssetSoftwareUpdateUtils_, AssetUpdateProgressEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #107 <Method void b.a(String, Runnable, long)>
	//    8   15:return          
	}

	private Context e;
}
