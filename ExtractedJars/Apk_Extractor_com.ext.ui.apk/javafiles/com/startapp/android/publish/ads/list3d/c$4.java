// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.list3d;


// Referenced classes of package com.startapp.android.publish.ads.list3d:
//			c

class c$4
	implements Runnable
{

	public void run()
	{
		if(a.a == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field c a>
	//*   2    4:getfield        #24  <Field int c.a>
	//*   3    7:iconst_1        
	//*   4    8:icmpne          46
		{
			int i = a.a(a.b, a.c);
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field c a>
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field c a>
	//    9   19:getfield        #27  <Field int c.b>
	//   10   22:aload_0         
	//   11   23:getfield        #17  <Field c a>
	//   12   26:getfield        #30  <Field int c.c>
	//   13   29:invokevirtual   #33  <Method int c.a(int, int)>
	//   14   32:istore_1        
			if(i != -1)
	//*  15   33:iload_1         
	//*  16   34:iconst_m1       
	//*  17   35:icmpeq          46
				a.b(i);
	//   18   38:aload_0         
	//   19   39:getfield        #17  <Field c a>
	//   20   42:iload_1         
	//   21   43:invokevirtual   #36  <Method void c.b(int)>
		}
	//   22   46:return          
	}

	final c a;

	c$4(c c1)
	{
		a = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field c a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
