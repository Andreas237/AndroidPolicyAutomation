// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;


// Referenced classes of package com.startapp.android.publish.ads.video:
//			f

class f$9
	implements Runnable
{

	public void run()
	{
		f f1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field f a>
	//    2    4:astore_2        
		boolean flag;
		if(!a.k)
	//*   3    5:aload_0         
	//*   4    6:getfield        #17  <Field f a>
	//*   5    9:getfield        #26  <Field boolean f.k>
	//*   6   12:ifne            44
			flag = true;
	//    7   15:iconst_1        
	//    8   16:istore_1        
		else
	//*   9   17:aload_2         
	//*  10   18:iload_1         
	//*  11   19:putfield        #26  <Field boolean f.k>
	//*  12   22:aload_0         
	//*  13   23:getfield        #17  <Field f a>
	//*  14   26:invokevirtual   #29  <Method void f.W()>
	//*  15   29:aload_0         
	//*  16   30:getfield        #17  <Field f a>
	//*  17   33:aload_0         
	//*  18   34:getfield        #17  <Field f a>
	//*  19   37:getfield        #26  <Field boolean f.k>
	//*  20   40:invokevirtual   #32  <Method void f.a(boolean)>
	//*  21   43:return          
			flag = false;
	//   22   44:iconst_0        
	//   23   45:istore_1        
		f1.k = flag;
		a.W();
		a.a(a.k);
	//*  24   46:goto            17
	}

	final f a;

	f$9(f f1)
	{
		a = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field f a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
