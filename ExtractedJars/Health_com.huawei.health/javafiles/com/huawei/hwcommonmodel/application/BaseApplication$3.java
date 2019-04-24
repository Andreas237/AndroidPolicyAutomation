// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hwcommonmodel.application;

import android.app.Activity;
import android.os.Bundle;
import o.czv;
import o.dho;

// Referenced classes of package com.huawei.hwcommonmodel.application:
//			BaseApplication

class BaseApplication$3
	implements android.app.tyLifecycleCallbacks
{

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

	BaseApplication$3(BaseApplication baseapplication)
	{
		a = baseapplication;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field BaseApplication a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
