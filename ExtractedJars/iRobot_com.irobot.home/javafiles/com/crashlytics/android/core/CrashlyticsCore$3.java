// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import b.a.a.a.c;
import b.a.a.a.l;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore, CrashlyticsFileMarker

class CrashlyticsCore$3
	implements Callable
{

	public Boolean call()
	{
		boolean flag;
		try
		{
			flag = CrashlyticsCore.access$100(CrashlyticsCore.this).remove();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field CrashlyticsCore this$0>
	//    2    4:invokestatic    #29  <Method CrashlyticsFileMarker CrashlyticsCore.access$100(CrashlyticsCore)>
	//    3    7:invokevirtual   #35  <Method boolean CrashlyticsFileMarker.remove()>
	//    4   10:istore_1        
			l l1 = c.g();
	//    5   11:invokestatic    #41  <Method l c.g()>
	//    6   14:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #43  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #44  <Method void StringBuilder()>
	//   10   22:astore_3        
			stringbuilder.append("Initialization marker file removed: ");
	//   11   23:aload_3         
	//   12   24:ldc1            #46  <String "Initialization marker file removed: ">
	//   13   26:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			stringbuilder.append(flag);
	//   15   30:aload_3         
	//   16   31:iload_1         
	//   17   32:invokevirtual   #53  <Method StringBuilder StringBuilder.append(boolean)>
	//   18   35:pop             
			l1.a("CrashlyticsCore", stringbuilder.toString());
	//   19   36:aload_2         
	//   20   37:ldc1            #55  <String "CrashlyticsCore">
	//   21   39:aload_3         
	//   22   40:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   23   43:invokeinterface #65  <Method void l.a(String, String)>
		}
	//*  24   48:iload_1         
	//*  25   49:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//*  26   52:areturn         
		catch(Exception exception)
	//*  27   53:astore_2        
		{
			c.g().e("CrashlyticsCore", "Problem encountered deleting Crashlytics initialization marker.", ((Throwable) (exception)));
	//   28   54:invokestatic    #41  <Method l c.g()>
	//   29   57:ldc1            #55  <String "CrashlyticsCore">
	//   30   59:ldc1            #73  <String "Problem encountered deleting Crashlytics initialization marker.">
	//   31   61:aload_2         
	//   32   62:invokeinterface #77  <Method void l.e(String, String, Throwable)>
			return Boolean.valueOf(false);
	//   33   67:iconst_0        
	//   34   68:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//   35   71:areturn         
		}
		return Boolean.valueOf(flag);
	}

	public volatile Object call()
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method Boolean call()>
	//    2    4:areturn         
	}

	final CrashlyticsCore this$0;

	CrashlyticsCore$3()
	{
		this$0 = CrashlyticsCore.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field CrashlyticsCore this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
