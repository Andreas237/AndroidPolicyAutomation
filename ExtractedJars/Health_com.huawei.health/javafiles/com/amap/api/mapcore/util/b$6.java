// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			b, fq, fs

class b$6
	implements Runnable
{

	public void run()
	{
		if(b.e(a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field b a>
	//*   2    4:invokestatic    #23  <Method fq b.e(b)>
	//*   3    7:ifnull          29
		{
			fs fs1 = b.e(a).h();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field b a>
	//    6   14:invokestatic    #23  <Method fq b.e(b)>
	//    7   17:invokevirtual   #29  <Method fs fq.h()>
	//    8   20:astore_1        
			if(fs1 != null)
	//*   9   21:aload_1         
	//*  10   22:ifnull          29
				fs1.d();
	//   11   25:aload_1         
	//   12   26:invokevirtual   #34  <Method void fs.d()>
		}
	//   13   29:return          
	}

	final b a;

	b$6(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
