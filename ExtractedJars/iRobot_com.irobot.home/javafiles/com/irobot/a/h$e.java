// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.a;


// Referenced classes of package com.irobot.a:
//			h

public class h$e extends h$r
{

	public byte[] a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method byte[] h$r.a()>
	//    2    4:pop             
		a(a, 20);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field String a>
	//    6   10:bipush          20
	//    7   12:invokevirtual   #34  <Method void a(String, int)>
		d();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #37  <Method void d()>
		return j;
	//   10   19:aload_0         
	//   11   20:getfield        #41  <Field byte[] j>
	//   12   23:areturn         
	}

	public void b()
	{
		super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void h$r.b()>
		a = h();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #47  <Method String h()>
	//    5    9:putfield        #24  <Field String a>
	//    6   12:return          
	}

	public String a;
	final h b;

	public h$e(h h1)
	{
		b = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field h b>
		super(h1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #17  <Method void h$r(h)>
		a = new String();
	//    6   10:aload_0         
	//    7   11:new             #19  <Class String>
	//    8   14:dup             
	//    9   15:invokespecial   #22  <Method void String()>
	//   10   18:putfield        #24  <Field String a>
		a((byte)24, 20);
	//   11   21:aload_0         
	//   12   22:bipush          24
	//   13   24:bipush          20
	//   14   26:invokevirtual   #27  <Method void a(byte, int)>
	//   15   29:return          
	}
}
