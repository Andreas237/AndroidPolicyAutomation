// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.a;


// Referenced classes of package com.irobot.a:
//			h

public class h$q extends h$r
{

	public byte[] a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method byte[] h$r.a()>
	//    2    4:pop             
		a(a);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #29  <Field byte a>
	//    6   10:invokevirtual   #32  <Method void a(byte)>
		a(b);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #34  <Field byte b>
	//   10   18:invokevirtual   #32  <Method void a(byte)>
		a(c);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #36  <Field byte c>
	//   14   26:invokevirtual   #32  <Method void a(byte)>
		a(d);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #38  <Field byte d>
	//   18   34:invokevirtual   #32  <Method void a(byte)>
		d();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #41  <Method void d()>
		return j;
	//   21   41:aload_0         
	//   22   42:getfield        #45  <Field byte[] j>
	//   23   45:areturn         
	}

	public void b()
	{
		super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void h$r.b()>
		a = f();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #51  <Method byte f()>
	//    5    9:putfield        #29  <Field byte a>
		b = f();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #51  <Method byte f()>
	//    9   17:putfield        #34  <Field byte b>
		c = f();
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #51  <Method byte f()>
	//   13   25:putfield        #36  <Field byte c>
		d = f();
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #51  <Method byte f()>
	//   17   33:putfield        #38  <Field byte d>
	//   18   36:return          
	}

	public byte a;
	public byte b;
	public byte c;
	public byte d;
	final h e;

	public h$q(h h1)
	{
		e = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field h e>
		super(h1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #20  <Method void h$r(h)>
		a((byte)1, 4);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:iconst_4        
	//    9   13:invokevirtual   #23  <Method void a(byte, int)>
	//   10   16:return          
	}
}
