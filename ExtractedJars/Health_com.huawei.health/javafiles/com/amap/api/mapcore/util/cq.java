// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			cg, bd, ch

public class cq extends cg
{

	public cq(int i, bd bd1)
	{
		super(i, bd1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void cg(int, bd)>
	//    4    6:return          
	}

	public void a(int i)
	{
		b(b.b(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field bd b>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #20  <Method ch bd.b(int)>
	//    5    9:invokevirtual   #23  <Method void b(ch)>
		b.a(b.b(i));
	//    6   12:aload_0         
	//    7   13:getfield        #15  <Field bd b>
	//    8   16:aload_0         
	//    9   17:getfield        #15  <Field bd b>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #20  <Method ch bd.b(int)>
	//   12   24:invokevirtual   #25  <Method void bd.a(ch)>
		b.c().h();
	//   13   27:aload_0         
	//   14   28:getfield        #15  <Field bd b>
	//   15   31:invokevirtual   #29  <Method ch bd.c()>
	//   16   34:invokevirtual   #35  <Method void ch.h()>
	//   17   37:return          
	}

	public void c()
	{
		b(b.c);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field bd b>
	//    3    5:getfield        #38  <Field ch bd.c>
	//    4    8:invokevirtual   #23  <Method void b(ch)>
		b.a(b.c);
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field bd b>
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field bd b>
	//    9   19:getfield        #38  <Field ch bd.c>
	//   10   22:invokevirtual   #25  <Method void bd.a(ch)>
		b.c().h();
	//   11   25:aload_0         
	//   12   26:getfield        #15  <Field bd b>
	//   13   29:invokevirtual   #29  <Method ch bd.c()>
	//   14   32:invokevirtual   #35  <Method void ch.h()>
	//   15   35:return          
	}

	public void e()
	{
		b(b.d);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field bd b>
	//    3    5:getfield        #42  <Field ch bd.d>
	//    4    8:invokevirtual   #23  <Method void b(ch)>
		b.a(b.d);
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field bd b>
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field bd b>
	//    9   19:getfield        #42  <Field ch bd.d>
	//   10   22:invokevirtual   #25  <Method void bd.a(ch)>
		b.c().h();
	//   11   25:aload_0         
	//   12   26:getfield        #15  <Field bd b>
	//   13   29:invokevirtual   #29  <Method ch bd.c()>
	//   14   32:invokevirtual   #35  <Method void ch.h()>
	//   15   35:return          
	}

	public void h()
	{
		b.l();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field bd b>
	//    2    4:invokevirtual   #45  <Method void bd.l()>
		b.d();
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field bd b>
	//    5   11:invokevirtual   #47  <Method void bd.d()>
	//    6   14:return          
	}
}
