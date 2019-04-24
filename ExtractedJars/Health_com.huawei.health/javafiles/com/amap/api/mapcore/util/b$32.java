// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$32 extends b.a
{

	public void run()
	{
		super.run();
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void b$a.run()>
		try
		{
			a.setCenterToPixel(b.o(a), b.p(a));
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field b a>
	//    4    8:aload_0         
	//    5    9:getfield        #12  <Field b a>
	//    6   12:invokestatic    #26  <Method int b.o(b)>
	//    7   15:aload_0         
	//    8   16:getfield        #12  <Field b a>
	//    9   19:invokestatic    #29  <Method int b.p(b)>
	//   10   22:invokevirtual   #33  <Method void b.setCenterToPixel(int, int)>
			return;
	//   11   25:return          
		}
		catch(Throwable throwable)
	//*  12   26:astore_1        
		{
			throwable.printStackTrace();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #36  <Method void Throwable.printStackTrace()>
		}
	//   15   31:return          
	}

	final b a;

	b$32(b b1)
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
