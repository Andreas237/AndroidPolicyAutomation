// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			b, fq, fo

class b$29
	implements Runnable
{

	public void run()
	{
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean a>
	//*   2    4:ifeq            16
		{
			b.b(true);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field b b>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #28  <Method void b.b(boolean)>
			return;
	//    7   15:return          
		}
		if(com.amap.api.mapcore.util.b.e(b) != null && com.amap.api.mapcore.util.b.e(b).e() != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #19  <Field b b>
	//*  10   20:invokestatic    #32  <Method fq b.e(b)>
	//*  11   23:ifnull          53
	//*  12   26:aload_0         
	//*  13   27:getfield        #19  <Field b b>
	//*  14   30:invokestatic    #32  <Method fq b.e(b)>
	//*  15   33:invokevirtual   #37  <Method fo fq.e()>
	//*  16   36:ifnull          53
			com.amap.api.mapcore.util.b.e(b).e().a(false);
	//   17   39:aload_0         
	//   18   40:getfield        #19  <Field b b>
	//   19   43:invokestatic    #32  <Method fq b.e(b)>
	//   20   46:invokevirtual   #37  <Method fo fq.e()>
	//   21   49:iconst_0        
	//   22   50:invokevirtual   #41  <Method void fo.a(boolean)>
	//   23   53:return          
	}

	final boolean a;
	final b b;

	b$29(b b1, boolean flag)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field b b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
