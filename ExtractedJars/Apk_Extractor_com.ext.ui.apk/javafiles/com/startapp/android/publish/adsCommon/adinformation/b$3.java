// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon.adinformation;

import com.startapp.android.publish.adsCommon.e.*;

// Referenced classes of package com.startapp.android.publish.adsCommon.adinformation:
//			b

class b$3
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
			a.c();
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field b a>
	//    5   11:invokevirtual   #27  <Method void b.c()>
			a.a(false);
	//    6   14:aload_0         
	//    7   15:getfield        #14  <Field b a>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #30  <Method void b.a(boolean)>
			return;
	//   10   22:return          
		}
		catch(Exception exception)
	//*  11   23:astore_1        
		{
			f.a(a.a, new e(d.b, "AdInformationObject.fullPrivacyPolicy failed", exception.getMessage()), "");
	//   12   24:aload_0         
	//   13   25:getfield        #14  <Field b a>
	//   14   28:getfield        #33  <Field android.content.Context b.a>
	//   15   31:new             #35  <Class e>
	//   16   34:dup             
	//   17   35:getstatic       #41  <Field d d.b>
	//   18   38:ldc1            #43  <String "AdInformationObject.fullPrivacyPolicy failed">
	//   19   40:aload_1         
	//   20   41:invokevirtual   #47  <Method String Exception.getMessage()>
	//   21   44:invokespecial   #50  <Method void e(d, String, String)>
	//   22   47:ldc1            #52  <String "">
	//   23   49:invokestatic    #57  <Method void f.a(android.content.Context, e, String)>
		}
	//   24   52:return          
	}

	final b a;

	b$3(b b1)
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
