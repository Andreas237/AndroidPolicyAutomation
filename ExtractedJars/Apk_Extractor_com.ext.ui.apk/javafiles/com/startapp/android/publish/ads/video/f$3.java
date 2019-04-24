// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;

import android.os.Handler;

// Referenced classes of package com.startapp.android.publish.ads.video:
//			f

class f$3
	implements Runnable
{

	public void run()
	{
		int i = a.P();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field f a>
	//    2    4:invokevirtual   #25  <Method int f.P()>
	//    3    7:istore_1        
		if(i >= 1000)
	//*   4    8:iload_1         
	//*   5    9:sipush          1000
	//*   6   12:icmplt          35
			a.C.postDelayed(((Runnable) (this)), a.c(i));
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field f a>
	//    9   19:getfield        #29  <Field Handler f.C>
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #17  <Field f a>
	//   13   27:iload_1         
	//   14   28:invokevirtual   #33  <Method long f.c(int)>
	//   15   31:invokevirtual   #39  <Method boolean Handler.postDelayed(Runnable, long)>
	//   16   34:pop             
	//   17   35:return          
	}

	final f a;

	f$3(f f1)
	{
		a = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field f a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
