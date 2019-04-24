// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;

import android.os.Handler;
import com.startapp.android.publish.ads.video.b.c;

// Referenced classes of package com.startapp.android.publish.ads.video:
//			f

class f$19$1
	implements Runnable
{

	public void run()
	{
		a.a.G();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field f$19 a>
	//    2    4:getfield        #23  <Field f f$19.a>
	//    3    7:invokevirtual   #28  <Method void f.G()>
	//    4   10:return          
	}

	final f._cls19 a;

	f$19$1(f._cls19 _pcls19)
	{
		a = _pcls19;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field f$19 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/startapp/android/publish/ads/video/f$19

/* anonymous class */
	class f._cls19
		implements Runnable
	{

		public void run()
		{
			if(a.h != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field f a>
		//*   2    4:getfield        #27  <Field c f.h>
		//*   3    7:ifnull          56
			{
				a.h.a();
		//    4   10:aload_0         
		//    5   11:getfield        #19  <Field f a>
		//    6   14:getfield        #27  <Field c f.h>
		//    7   17:invokeinterface #31  <Method void c.a()>
				a.q = true;
		//    8   22:aload_0         
		//    9   23:getfield        #19  <Field f a>
		//   10   26:iconst_1        
		//   11   27:putfield        #35  <Field boolean f.q>
				a.M();
		//   12   30:aload_0         
		//   13   31:getfield        #19  <Field f a>
		//   14   34:invokevirtual   #38  <Method void f.M()>
				(new Handler()).post(((Runnable) (new f._cls19._cls1(this))));
		//   15   37:new             #40  <Class Handler>
		//   16   40:dup             
		//   17   41:invokespecial   #41  <Method void Handler()>
		//   18   44:new             #13  <Class f$19$1>
		//   19   47:dup             
		//   20   48:aload_0         
		//   21   49:invokespecial   #44  <Method void f$19$1(f$19)>
		//   22   52:invokevirtual   #48  <Method boolean Handler.post(Runnable)>
		//   23   55:pop             
			}
		//   24   56:return          
		}

		final f a;

			
			{
				a = f1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field f a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}

}
