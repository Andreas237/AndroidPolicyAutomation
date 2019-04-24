// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			ch, bd

public abstract class cg extends ch
{

	public cg(int i, bd bd1)
	{
		super(i, bd1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void ch(int, bd)>
	//    4    6:return          
	}

	public void a()
	{
		b(b.a);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field bd b>
	//    3    5:getfield        #20  <Field ch bd.a>
	//    4    8:invokevirtual   #23  <Method void b(ch)>
		b.setCompleteCode(0);
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field bd b>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #27  <Method void bd.setCompleteCode(int)>
		b.a(b.a);
	//    9   19:aload_0         
	//   10   20:getfield        #15  <Field bd b>
	//   11   23:aload_0         
	//   12   24:getfield        #15  <Field bd b>
	//   13   27:getfield        #20  <Field ch bd.a>
	//   14   30:invokevirtual   #29  <Method void bd.a(ch)>
		b.d();
	//   15   33:aload_0         
	//   16   34:getfield        #15  <Field bd b>
	//   17   37:invokevirtual   #32  <Method void bd.d()>
	//   18   40:return          
	}
}
