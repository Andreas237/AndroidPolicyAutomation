// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bgp, bgl, bno

final class bgs
	implements bgp
{

	public bgs(bgl bgl1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		a = bgl1.aP;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #23  <Field bno bgl.aP>
	//    5    9:putfield        #25  <Field bno a>
		a.c(12);
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field bno a>
	//    8   16:bipush          12
	//    9   18:invokevirtual   #30  <Method void bno.c(int)>
		c = a.o() & 0xff;
	//   10   21:aload_0         
	//   11   22:aload_0         
	//   12   23:getfield        #25  <Field bno a>
	//   13   26:invokevirtual   #34  <Method int bno.o()>
	//   14   29:sipush          255
	//   15   32:iand            
	//   16   33:putfield        #36  <Field int c>
		b = a.o();
	//   17   36:aload_0         
	//   18   37:aload_0         
	//   19   38:getfield        #25  <Field bno a>
	//   20   41:invokevirtual   #34  <Method int bno.o()>
	//   21   44:putfield        #38  <Field int b>
	//   22   47:return          
	}

	public final int a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int b>
	//    2    4:ireturn         
	}

	public final int b()
	{
		int i = c;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int c>
	//    2    4:istore_1        
		if(i == 8)
	//*   3    5:iload_1         
	//*   4    6:bipush          8
	//*   5    8:icmpne          19
			return a.f();
	//    6   11:aload_0         
	//    7   12:getfield        #25  <Field bno a>
	//    8   15:invokevirtual   #42  <Method int bno.f()>
	//    9   18:ireturn         
		if(i == 16)
	//*  10   19:iload_1         
	//*  11   20:bipush          16
	//*  12   22:icmpne          33
			return a.g();
	//   13   25:aload_0         
	//   14   26:getfield        #25  <Field bno a>
	//   15   29:invokevirtual   #45  <Method int bno.g()>
	//   16   32:ireturn         
		i = d;
	//   17   33:aload_0         
	//   18   34:getfield        #47  <Field int d>
	//   19   37:istore_1        
		d = i + 1;
	//   20   38:aload_0         
	//   21   39:iload_1         
	//   22   40:iconst_1        
	//   23   41:iadd            
	//   24   42:putfield        #47  <Field int d>
		if(i % 2 == 0)
	//*  25   45:iload_1         
	//*  26   46:iconst_2        
	//*  27   47:irem            
	//*  28   48:ifne            73
		{
			e = a.f();
	//   29   51:aload_0         
	//   30   52:aload_0         
	//   31   53:getfield        #25  <Field bno a>
	//   32   56:invokevirtual   #42  <Method int bno.f()>
	//   33   59:putfield        #49  <Field int e>
			return (e & 0xf0) >> 4;
	//   34   62:aload_0         
	//   35   63:getfield        #49  <Field int e>
	//   36   66:sipush          240
	//   37   69:iand            
	//   38   70:iconst_4        
	//   39   71:ishr            
	//   40   72:ireturn         
		} else
		{
			return e & 0xf;
	//   41   73:aload_0         
	//   42   74:getfield        #49  <Field int e>
	//   43   77:bipush          15
	//   44   79:iand            
	//   45   80:ireturn         
		}
	}

	public final boolean c()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private final bno a;
	private final int b;
	private final int c;
	private int d;
	private int e;
}
