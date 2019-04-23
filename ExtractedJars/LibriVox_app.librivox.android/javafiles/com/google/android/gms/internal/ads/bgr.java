// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bgp, bgl, bno

final class bgr
	implements bgp
{

	public bgr(bgl bgl1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		c = bgl1.aP;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #21  <Field bno bgl.aP>
	//    5    9:putfield        #23  <Field bno c>
		c.c(12);
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field bno c>
	//    8   16:bipush          12
	//    9   18:invokevirtual   #28  <Method void bno.c(int)>
		a = c.o();
	//   10   21:aload_0         
	//   11   22:aload_0         
	//   12   23:getfield        #23  <Field bno c>
	//   13   26:invokevirtual   #32  <Method int bno.o()>
	//   14   29:putfield        #34  <Field int a>
		b = c.o();
	//   15   32:aload_0         
	//   16   33:aload_0         
	//   17   34:getfield        #23  <Field bno c>
	//   18   37:invokevirtual   #32  <Method int bno.o()>
	//   19   40:putfield        #36  <Field int b>
	//   20   43:return          
	}

	public final int a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int b>
	//    2    4:ireturn         
	}

	public final int b()
	{
		int j = a;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int a>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            19
			i = c.o();
	//    7   11:aload_0         
	//    8   12:getfield        #23  <Field bno c>
	//    9   15:invokevirtual   #32  <Method int bno.o()>
	//   10   18:istore_1        
		return i;
	//   11   19:iload_1         
	//   12   20:ireturn         
	}

	public final boolean c()
	{
		return a != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int a>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private final int a;
	private final int b;
	private final bno c;
}
