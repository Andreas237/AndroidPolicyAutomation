// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			fo

class fo$3
	implements Runnable
{

	public void run()
	{
		b.smoothScrollTo(0, a * fo.b(b));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field fo b>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field int a>
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field fo b>
	//    7   13:invokestatic    #28  <Method int fo.b(fo)>
	//    8   16:imul            
	//    9   17:invokevirtual   #32  <Method void fo.smoothScrollTo(int, int)>
	//   10   20:return          
	}

	final int a;
	final fo b;

	fo$3(fo fo1, int i)
	{
		b = fo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field fo b>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field int a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
