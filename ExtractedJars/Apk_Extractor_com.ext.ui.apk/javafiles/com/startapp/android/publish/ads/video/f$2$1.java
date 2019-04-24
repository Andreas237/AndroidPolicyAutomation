// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;

import android.app.Activity;
import android.os.Handler;
import android.widget.ProgressBar;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.e;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.n;
import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.ads.video:
//			f

class f$2$1
	implements Runnable
{

	public void run()
	{
		g.a("VideoMode", 5, "Buffering timeout reached");
	//    0    0:ldc1            #24  <String "VideoMode">
	//    1    2:iconst_5        
	//    2    3:ldc1            #26  <String "Buffering timeout reached">
	//    3    5:invokestatic    #31  <Method void g.a(String, int, String)>
		try
		{
			a.a.M();
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field f$2 a>
	//    6   12:getfield        #34  <Field com.startapp.android.publish.ads.video.f f$2.a>
	//    7   15:invokevirtual   #39  <Method void f.M()>
			a.a.s = true;
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field f$2 a>
	//   10   22:getfield        #34  <Field com.startapp.android.publish.ads.video.f f$2.a>
	//   11   25:iconst_1        
	//   12   26:putfield        #43  <Field boolean f.s>
			a.a.a(new com.startapp.android.publish.ads.video.b.c.g(com.startapp.android.publish.ads.video.b.c.h.c, "Buffering timeout reached", a.a.m));
	//   13   29:aload_0         
	//   14   30:getfield        #17  <Field f$2 a>
	//   15   33:getfield        #34  <Field com.startapp.android.publish.ads.video.f f$2.a>
	//   16   36:new             #45  <Class com.startapp.android.publish.ads.video.b.c$g>
	//   17   39:dup             
	//   18   40:getstatic       #51  <Field com.startapp.android.publish.ads.video.b.c$h com.startapp.android.publish.ads.video.b.c$h.c>
	//   19   43:ldc1            #26  <String "Buffering timeout reached">
	//   20   45:aload_0         
	//   21   46:getfield        #17  <Field f$2 a>
	//   22   49:getfield        #34  <Field com.startapp.android.publish.ads.video.f f$2.a>
	//   23   52:getfield        #55  <Field int f.m>
	//   24   55:invokespecial   #58  <Method void com.startapp.android.publish.ads.video.b.c$g(com.startapp.android.publish.ads.video.b.c$h, String, int)>
	//   25   58:invokevirtual   #61  <Method void f.a(com.startapp.android.publish.ads.video.b.c$g)>
			return;
	//   26   61:return          
		}
		catch(Exception exception)
	//*  27   62:astore_1        
		{
			f.a(a.a.b().getApplicationContext(), new e(d.b, "VideoMode.startBufferingIndicator", exception.getMessage()), "");
	//   28   63:aload_0         
	//   29   64:getfield        #17  <Field f$2 a>
	//   30   67:getfield        #34  <Field com.startapp.android.publish.ads.video.f f$2.a>
	//   31   70:invokevirtual   #65  <Method Activity com.startapp.android.publish.ads.video.f.b()>
	//   32   73:invokevirtual   #71  <Method android.content.Context Activity.getApplicationContext()>
	//   33   76:new             #73  <Class e>
	//   34   79:dup             
	//   35   80:getstatic       #78  <Field d d.b>
	//   36   83:ldc1            #80  <String "VideoMode.startBufferingIndicator">
	//   37   85:aload_1         
	//   38   86:invokevirtual   #84  <Method String Exception.getMessage()>
	//   39   89:invokespecial   #87  <Method void e(d, String, String)>
	//   40   92:ldc1            #89  <String "">
	//   41   94:invokestatic    #94  <Method void f.a(android.content.Context, e, String)>
		}
	//   42   97:return          
	}

	final f._cls2 a;

	f$2$1(f._cls2 _pcls2)
	{
		a = _pcls2;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field f$2 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/startapp/android/publish/ads/video/f$2

/* anonymous class */
	class f._cls2
		implements Runnable
	{

		public void run()
		{
			try
			{
				a.j.setVisibility(0);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field com.startapp.android.publish.ads.video.f a>
		//    2    4:getfield        #29  <Field ProgressBar f.j>
		//    3    7:iconst_0        
		//    4    8:invokevirtual   #35  <Method void ProgressBar.setVisibility(int)>
				a.E.postDelayed(((Runnable) (new f._cls2._cls1(this))), b.a().G().g());
		//    5   11:aload_0         
		//    6   12:getfield        #19  <Field com.startapp.android.publish.ads.video.f a>
		//    7   15:getfield        #39  <Field Handler f.E>
		//    8   18:new             #13  <Class f$2$1>
		//    9   21:dup             
		//   10   22:aload_0         
		//   11   23:invokespecial   #42  <Method void f$2$1(f$2)>
		//   12   26:invokestatic    #47  <Method b b.a()>
		//   13   29:invokevirtual   #51  <Method n b.G()>
		//   14   32:invokevirtual   #57  <Method long n.g()>
		//   15   35:invokevirtual   #63  <Method boolean Handler.postDelayed(Runnable, long)>
		//   16   38:pop             
				return;
		//   17   39:return          
			}
			catch(Exception exception)
		//*  18   40:astore_1        
			{
				a.M();
		//   19   41:aload_0         
		//   20   42:getfield        #19  <Field com.startapp.android.publish.ads.video.f a>
		//   21   45:invokevirtual   #66  <Method void f.M()>
				f.a(a.b().getApplicationContext(), new e(d.b, "VideoMode.startBufferingIndicator", exception.getMessage()), f.a(a));
		//   22   48:aload_0         
		//   23   49:getfield        #19  <Field com.startapp.android.publish.ads.video.f a>
		//   24   52:invokevirtual   #70  <Method Activity com.startapp.android.publish.ads.video.f.b()>
		//   25   55:invokevirtual   #76  <Method android.content.Context Activity.getApplicationContext()>
		//   26   58:new             #78  <Class e>
		//   27   61:dup             
		//   28   62:getstatic       #83  <Field d d.b>
		//   29   65:ldc1            #85  <String "VideoMode.startBufferingIndicator">
		//   30   67:aload_1         
		//   31   68:invokevirtual   #89  <Method String Exception.getMessage()>
		//   32   71:invokespecial   #92  <Method void e(d, String, String)>
		//   33   74:aload_0         
		//   34   75:getfield        #19  <Field com.startapp.android.publish.ads.video.f a>
		//   35   78:invokestatic    #95  <Method String f.a(com.startapp.android.publish.ads.video.f)>
		//   36   81:invokestatic    #100 <Method void f.a(android.content.Context, e, String)>
				return;
		//   37   84:return          
			}
		}

		final com.startapp.android.publish.ads.video.f a;

			
			{
				a = f1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field com.startapp.android.publish.ads.video.f a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}

}
