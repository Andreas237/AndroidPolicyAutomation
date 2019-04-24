// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			cg, bd, ch

public class cn extends cg
{

	public cn(int i, bd bd1)
	{
		super(i, bd1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void cg(int, bd)>
	//    4    6:return          
	}

	public void c()
	{
		b(b.b);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field bd b>
	//    3    5:getfield        #20  <Field ch bd.b>
	//    4    8:invokevirtual   #23  <Method void b(ch)>
		b.setCompleteCode(0);
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field bd b>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #27  <Method void bd.setCompleteCode(int)>
		b.a(b.b);
	//    9   19:aload_0         
	//   10   20:getfield        #15  <Field bd b>
	//   11   23:aload_0         
	//   12   24:getfield        #15  <Field bd b>
	//   13   27:getfield        #20  <Field ch bd.b>
	//   14   30:invokevirtual   #30  <Method void bd.a(ch)>
		b.c().h();
	//   15   33:aload_0         
	//   16   34:getfield        #15  <Field bd b>
	//   17   37:invokevirtual   #33  <Method ch bd.c()>
	//   18   40:invokevirtual   #38  <Method void ch.h()>
	//   19   43:return          
	}

	public void h()
	{
		b.d();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field bd b>
	//    2    4:invokevirtual   #41  <Method void bd.d()>
	//    3    7:return          
	}
}
