// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon.adinformation;

import com.startapp.android.publish.adsCommon.e.*;
import com.startapp.android.publish.adsCommon.l;
import com.startapp.android.publish.common.metaData.h;

// Referenced classes of package com.startapp.android.publish.adsCommon.adinformation:
//			b, AdInformationConfig

class b$2
	implements Runnable
{

	public void run()
	{
		try
		{
			a.d();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field b a>
	//    2    4:invokevirtual   #24  <Method void com.startapp.android.publish.adsCommon.adinformation.b.d()>
			l.b();
	//    3    7:invokestatic    #29  <Method void l.b()>
			a.e.a(a.a, false);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field b a>
	//    6   14:getfield        #33  <Field h com.startapp.android.publish.adsCommon.adinformation.b.e>
	//    7   17:aload_0         
	//    8   18:getfield        #14  <Field b a>
	//    9   21:getfield        #36  <Field android.content.Context b.a>
	//   10   24:iconst_0        
	//   11   25:invokevirtual   #41  <Method void h.a(android.content.Context, boolean)>
			a.d.a(a.a, true);
	//   12   28:aload_0         
	//   13   29:getfield        #14  <Field b a>
	//   14   32:getfield        #44  <Field AdInformationConfig com.startapp.android.publish.adsCommon.adinformation.b.d>
	//   15   35:aload_0         
	//   16   36:getfield        #14  <Field b a>
	//   17   39:getfield        #36  <Field android.content.Context b.a>
	//   18   42:iconst_1        
	//   19   43:invokevirtual   #47  <Method void AdInformationConfig.a(android.content.Context, boolean)>
			a.a(false);
	//   20   46:aload_0         
	//   21   47:getfield        #14  <Field b a>
	//   22   50:iconst_0        
	//   23   51:invokevirtual   #50  <Method void b.a(boolean)>
			return;
	//   24   54:return          
		}
		catch(Exception exception)
	//*  25   55:astore_1        
		{
			f.a(a.a, new e(d.b, "AdInformationObject.declineRunnable failed", exception.getMessage()), "");
	//   26   56:aload_0         
	//   27   57:getfield        #14  <Field b a>
	//   28   60:getfield        #36  <Field android.content.Context b.a>
	//   29   63:new             #52  <Class e>
	//   30   66:dup             
	//   31   67:getstatic       #57  <Field d d.b>
	//   32   70:ldc1            #59  <String "AdInformationObject.declineRunnable failed">
	//   33   72:aload_1         
	//   34   73:invokevirtual   #63  <Method String Exception.getMessage()>
	//   35   76:invokespecial   #66  <Method void e(d, String, String)>
	//   36   79:ldc1            #68  <String "">
	//   37   81:invokestatic    #73  <Method void f.a(android.content.Context, e, String)>
		}
	//   38   84:return          
	}

	final b a;

	b$2(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
