// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.a;


// Referenced classes of package com.irobot.a:
//			h

public class h$m extends h$r
{

	public byte[] a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method byte[] h$r.a()>
	//    2    4:pop             
		a(a);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field byte a>
	//    6   10:invokevirtual   #31  <Method void a(byte)>
		a(b);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #33  <Field byte b>
	//   10   18:invokevirtual   #31  <Method void a(byte)>
		a(c);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #35  <Field byte c>
	//   14   26:invokevirtual   #31  <Method void a(byte)>
		d();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #38  <Method void d()>
		return j;
	//   17   33:aload_0         
	//   18   34:getfield        #42  <Field byte[] j>
	//   19   37:areturn         
	}

	public void b()
	{
		super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void h$r.b()>
		a = f();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #48  <Method byte f()>
	//    5    9:putfield        #28  <Field byte a>
		b = f();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #48  <Method byte f()>
	//    9   17:putfield        #33  <Field byte b>
		c = f();
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #48  <Method byte f()>
	//   13   25:putfield        #35  <Field byte c>
	//   14   28:return          
	}

	public byte a;
	public byte b;
	public byte c;
	final h d;

	public h$m(h h1)
	{
		d = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field h d>
		super(h1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #19  <Method void h$r(h)>
		a((byte)18, 3);
	//    6   10:aload_0         
	//    7   11:bipush          18
	//    8   13:iconst_3        
	//    9   14:invokevirtual   #22  <Method void a(byte, int)>
	//   10   17:return          
	}
}
