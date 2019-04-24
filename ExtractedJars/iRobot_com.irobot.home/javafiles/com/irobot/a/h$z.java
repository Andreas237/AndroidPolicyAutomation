// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.a;


// Referenced classes of package com.irobot.a:
//			h

public class h$z extends h$r
{

	public byte[] a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method byte[] h$r.a()>
	//    2    4:pop             
		a(a);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field byte a>
	//    6   10:invokevirtual   #30  <Method void a(byte)>
		a(b);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #32  <Field byte b>
	//   10   18:invokevirtual   #30  <Method void a(byte)>
		d();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #36  <Method void d()>
		return j;
	//   13   25:aload_0         
	//   14   26:getfield        #40  <Field byte[] j>
	//   15   29:areturn         
	}

	public void b()
	{
		super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void h$r.b()>
		a = f();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #46  <Method byte f()>
	//    5    9:putfield        #27  <Field byte a>
		b = f();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #46  <Method byte f()>
	//    9   17:putfield        #32  <Field byte b>
	//   10   20:return          
	}

	public byte a;
	public byte b;
	final h c;

	public h$z(h h1)
	{
		c = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field h c>
		super(h1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #18  <Method void h$r(h)>
		a((byte)2, 2);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:iconst_2        
	//    9   13:invokevirtual   #21  <Method void a(byte, int)>
	//   10   16:return          
	}
}
