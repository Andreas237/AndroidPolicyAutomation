// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.Handler;

// Referenced classes of package com.amap.api.mapcore.util:
//			b, fq, fs

class b$36$1
	implements Runnable
{

	public void run()
	{
		b.b(a.b, a.a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field b$36 a>
	//    2    4:getfield        #25  <Field b b$36.b>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field b$36 a>
	//    5   11:getfield        #28  <Field int b$36.a>
	//    6   14:invokestatic    #33  <Method int b.b(b, int)>
	//    7   17:pop             
		if(b.e(a.b) != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #17  <Field b$36 a>
	//*  10   22:getfield        #25  <Field b b$36.b>
	//*  11   25:invokestatic    #37  <Method fq b.e(b)>
	//*  12   28:ifnull          48
			b.e(a.b).h().setVisibility(0);
	//   13   31:aload_0         
	//   14   32:getfield        #17  <Field b$36 a>
	//   15   35:getfield        #25  <Field b b$36.b>
	//   16   38:invokestatic    #37  <Method fq b.e(b)>
	//   17   41:invokevirtual   #43  <Method fs fq.h()>
	//   18   44:iconst_0        
	//   19   45:invokevirtual   #49  <Method void fs.setVisibility(int)>
	//   20   48:return          
	}

	final b._cls36 a;

	b$36$1(b._cls36 _pcls36)
	{
		a = _pcls36;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field b$36 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/amap/api/mapcore/util/b$36

/* anonymous class */
	class b._cls36
		implements com.amap.api.maps.model.animation.Animation.AnimationListener
	{

		public void onAnimationEnd()
		{
			b.i.post(((Runnable) (new b._cls36._cls1(this))));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field b b>
		//    2    4:getfield        #32  <Field Handler b.i>
		//    3    7:new             #13  <Class b$36$1>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:invokespecial   #35  <Method void b$36$1(b$36)>
		//    7   15:invokevirtual   #41  <Method boolean Handler.post(Runnable)>
		//    8   18:pop             
		//    9   19:return          
		}

		public void onAnimationStart()
		{
		//    0    0:return          
		}

		final int a;
		final b b;

			
			{
				b = b1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field b b>
				a = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}

}
