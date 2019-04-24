// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.splash;

import android.app.Activity;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.ads.splash:
//			h, c, e

class h$2$1$1
	implements AdDisplayListener
{

	public void adClicked(Ad ad)
	{
		a.a.a.b.i();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field h$2$1 a>
	//    2    4:getfield        #26  <Field h$2 h$2$1.a>
	//    3    7:getfield        #29  <Field h h$2.a>
	//    4   10:getfield        #35  <Field c h.b>
	//    5   13:invokevirtual   #40  <Method void c.i()>
	//    6   16:return          
	}

	public void adDisplayed(Ad ad)
	{
		a.a.a.b.d();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field h$2$1 a>
	//    2    4:getfield        #26  <Field h$2 h$2$1.a>
	//    3    7:getfield        #29  <Field h h$2.a>
	//    4   10:getfield        #35  <Field c h.b>
	//    5   13:invokevirtual   #44  <Method void c.d()>
	//    6   16:return          
	}

	public void adHidden(Ad ad)
	{
		a.a.a.b.c();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field h$2$1 a>
	//    2    4:getfield        #26  <Field h$2 h$2$1.a>
	//    3    7:getfield        #29  <Field h h$2.a>
	//    4   10:getfield        #35  <Field c h.b>
	//    5   13:invokevirtual   #48  <Method void c.c()>
	//    6   16:return          
	}

	public void adNotDisplayed(Ad ad)
	{
	//    0    0:return          
	}

	final h._cls2._cls1 a;

	h$2$1$1(h._cls2._cls1 _pcls1)
	{
		a = _pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field h$2$1 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/startapp/android/publish/ads/splash/h$2

/* anonymous class */
	class h._cls2
		implements Runnable
	{

		public void run()
		{
			a.b.a(a.d, new h._cls2._cls1(this));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field h a>
		//    2    4:getfield        #27  <Field c h.b>
		//    3    7:aload_0         
		//    4    8:getfield        #18  <Field h a>
		//    5   11:getfield        #31  <Field d h.d>
		//    6   14:new             #10  <Class h$2$1>
		//    7   17:dup             
		//    8   18:aload_0         
		//    9   19:invokespecial   #34  <Method void h$2$1(h$2)>
		//   10   22:invokevirtual   #39  <Method void c.a(d, e)>
		//   11   25:return          
		}

		final h a;

			
			{
				a = h1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field h a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}


	// Unreferenced inner class com/startapp/android/publish/ads/splash/h$2$1

/* anonymous class */
	class h._cls2._cls1
		implements e
	{

		public void a()
		{
			if(!a.a.e && a.a.f != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field h$2 a>
		//*   2    4:getfield        #25  <Field h h$2.a>
		//*   3    7:getfield        #31  <Field boolean h.e>
		//*   4   10:ifne            79
		//*   5   13:aload_0         
		//*   6   14:getfield        #19  <Field h$2 a>
		//*   7   17:getfield        #25  <Field h h$2.a>
		//*   8   20:getfield        #35  <Field h$a h.f>
		//*   9   23:ifnull          79
			{
				g.a("Splash", 4, "Displaying Splash ad");
		//   10   26:ldc1            #37  <String "Splash">
		//   11   28:iconst_4        
		//   12   29:ldc1            #39  <String "Displaying Splash ad">
		//   13   31:invokestatic    #44  <Method void g.a(String, int, String)>
				a.a.f.showAd(((AdDisplayListener) (new h._cls2._cls1._cls1(this))));
		//   14   34:aload_0         
		//   15   35:getfield        #19  <Field h$2 a>
		//   16   38:getfield        #25  <Field h h$2.a>
		//   17   41:getfield        #35  <Field h$a h.f>
		//   18   44:new             #13  <Class h$2$1$1>
		//   19   47:dup             
		//   20   48:aload_0         
		//   21   49:invokespecial   #47  <Method void h$2$1$1(h$2$1)>
		//   22   52:invokevirtual   #53  <Method boolean h$a.showAd(AdDisplayListener)>
		//   23   55:pop             
				a.a.f();
		//   24   56:aload_0         
		//   25   57:getfield        #19  <Field h$2 a>
		//   26   60:getfield        #25  <Field h h$2.a>
		//   27   63:invokevirtual   #55  <Method void h.f()>
				a.a.a.finish();
		//   28   66:aload_0         
		//   29   67:getfield        #19  <Field h$2 a>
		//   30   70:getfield        #25  <Field h h$2.a>
		//   31   73:getfield        #58  <Field Activity h.a>
		//   32   76:invokevirtual   #63  <Method void Activity.finish()>
			}
		//   33   79:return          
		}

		final h._cls2 a;

			
			{
				a = _pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field h$2 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}

}
