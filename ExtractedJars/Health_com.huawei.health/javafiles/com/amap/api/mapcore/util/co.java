// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			cg, bd, ch

public class co extends cg
{

	public co(int i, bd bd1)
	{
		super(i, bd1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void cg(int, bd)>
	//    4    6:return          
	}

	public void d()
	{
		b(b.b);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field bd b>
	//    3    5:getfield        #20  <Field ch bd.b>
	//    4    8:invokevirtual   #23  <Method void b(ch)>
		b.a(b.b);
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field bd b>
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field bd b>
	//    9   19:getfield        #20  <Field ch bd.b>
	//   10   22:invokevirtual   #26  <Method void bd.a(ch)>
		b.c().h();
	//   11   25:aload_0         
	//   12   26:getfield        #15  <Field bd b>
	//   13   29:invokevirtual   #30  <Method ch bd.c()>
	//   14   32:invokevirtual   #35  <Method void ch.h()>
	//   15   35:return          
	}

	public void h()
	{
		b.d();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field bd b>
	//    2    4:invokevirtual   #37  <Method void bd.d()>
		b.m();
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field bd b>
	//    5   11:invokevirtual   #40  <Method void bd.m()>
	//    6   14:return          
	}
}
