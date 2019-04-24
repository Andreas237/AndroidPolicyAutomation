// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.a;


// Referenced classes of package com.irobot.a:
//			h

public class h$k extends h$r
{

	public byte[] a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method byte[] h$r.a()>
	//    2    4:pop             
		a(a);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field byte a>
	//    6   10:invokevirtual   #29  <Method void a(byte)>
		d();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #33  <Method void d()>
		return j;
	//    9   17:aload_0         
	//   10   18:getfield        #37  <Field byte[] j>
	//   11   21:areturn         
	}

	public void b()
	{
		super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void h$r.b()>
		a = f();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #43  <Method byte f()>
	//    5    9:putfield        #26  <Field byte a>
	//    6   12:return          
	}

	public byte a;
	final h b;

	public h$k(h h1)
	{
		b = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field h b>
		super(h1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #17  <Method void h$r(h)>
		a((byte)7, 1);
	//    6   10:aload_0         
	//    7   11:bipush          7
	//    8   13:iconst_1        
	//    9   14:invokevirtual   #20  <Method void a(byte, int)>
	//   10   17:return          
	}
}
