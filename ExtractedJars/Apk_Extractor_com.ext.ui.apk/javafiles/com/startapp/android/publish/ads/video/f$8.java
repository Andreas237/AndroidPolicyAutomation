// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;

import android.app.Activity;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.e;
import com.startapp.android.publish.adsCommon.e.f;

// Referenced classes of package com.startapp.android.publish.ads.video:
//			f

class f$8
	implements Runnable
{

	public void run()
	{
		try
		{
			a.T();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field com.startapp.android.publish.ads.video.f a>
	//    2    4:invokevirtual   #26  <Method void f.T()>
			return;
	//    3    7:return          
		}
		catch(Exception exception)
	//*   4    8:astore_1        
		{
			f.a(a.b().getApplicationContext(), new e(d.b, "VideoMode.scheduleVideoListenerEvents", exception.getMessage()), f.a(a));
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field com.startapp.android.publish.ads.video.f a>
	//    7   13:invokevirtual   #30  <Method Activity f.b()>
	//    8   16:invokevirtual   #36  <Method android.content.Context Activity.getApplicationContext()>
	//    9   19:new             #38  <Class e>
	//   10   22:dup             
	//   11   23:getstatic       #43  <Field d d.b>
	//   12   26:ldc1            #45  <String "VideoMode.scheduleVideoListenerEvents">
	//   13   28:aload_1         
	//   14   29:invokevirtual   #49  <Method String Exception.getMessage()>
	//   15   32:invokespecial   #52  <Method void e(d, String, String)>
	//   16   35:aload_0         
	//   17   36:getfield        #17  <Field com.startapp.android.publish.ads.video.f a>
	//   18   39:invokestatic    #55  <Method String f.a(com.startapp.android.publish.ads.video.f)>
	//   19   42:invokestatic    #60  <Method void f.a(android.content.Context, e, String)>
		}
	//   20   45:return          
	}

	final com.startapp.android.publish.ads.video.f a;

	f$8(com.startapp.android.publish.ads.video.f f1)
	{
		a = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field com.startapp.android.publish.ads.video.f a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
