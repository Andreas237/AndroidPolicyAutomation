// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$11 extends b.a
{

	public void run()
	{
		super.run();
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void b$a.run()>
		try
		{
			a.setTrafficEnabled(c);
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field b a>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field boolean c>
	//    6   12:invokevirtual   #30  <Method void b.setTrafficEnabled(boolean)>
			return;
	//    7   15:return          
		}
		catch(Throwable throwable)
	//*   8   16:astore_1        
		{
			throwable.printStackTrace();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #33  <Method void Throwable.printStackTrace()>
		}
	//   11   21:return          
	}

	final b a;

	b$11(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field b a>
		super(((b._cls1) (null)));
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #15  <Method void b$a(b$1)>
	//    6   10:return          
	}
}
