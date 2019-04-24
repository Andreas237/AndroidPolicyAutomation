// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$8 extends b$a
{

	public void run()
	{
		super.run();
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void b$a.run()>
		try
		{
			a.setMyTrafficStyle(b.q(a));
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field b a>
	//    4    8:aload_0         
	//    5    9:getfield        #12  <Field b a>
	//    6   12:invokestatic    #26  <Method com.amap.api.maps.model.MyTrafficStyle b.q(b)>
	//    7   15:invokevirtual   #30  <Method void b.setMyTrafficStyle(com.amap.api.maps.model.MyTrafficStyle)>
			return;
	//    8   18:return          
		}
		catch(Throwable throwable)
	//*   9   19:astore_1        
		{
			throwable.printStackTrace();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #33  <Method void Throwable.printStackTrace()>
		}
	//   12   24:return          
	}

	final b a;

	b$8(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field b a>
		super(((b$1) (null)));
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #15  <Method void b$a(b$1)>
	//    6   10:return          
	}
}
