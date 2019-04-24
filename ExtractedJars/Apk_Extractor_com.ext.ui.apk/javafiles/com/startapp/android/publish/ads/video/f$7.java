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

class f$7
	implements Runnable
{

	public void run()
	{
		try
		{
			b.g(a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field com.startapp.android.publish.ads.video.f b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field int a>
	//    4    8:invokevirtual   #31  <Method void f.g(int)>
			return;
	//    5   11:return          
		}
		catch(Exception exception)
	//*   6   12:astore_1        
		{
			f.a(b.b().getApplicationContext(), new e(d.b, "VideoMode.scheduleAbsoluteProgressEvents", exception.getMessage()), f.a(b));
	//    7   13:aload_0         
	//    8   14:getfield        #19  <Field com.startapp.android.publish.ads.video.f b>
	//    9   17:invokevirtual   #34  <Method Activity f.b()>
	//   10   20:invokevirtual   #40  <Method android.content.Context Activity.getApplicationContext()>
	//   11   23:new             #42  <Class e>
	//   12   26:dup             
	//   13   27:getstatic       #47  <Field d d.b>
	//   14   30:ldc1            #49  <String "VideoMode.scheduleAbsoluteProgressEvents">
	//   15   32:aload_1         
	//   16   33:invokevirtual   #53  <Method String Exception.getMessage()>
	//   17   36:invokespecial   #56  <Method void e(d, String, String)>
	//   18   39:aload_0         
	//   19   40:getfield        #19  <Field com.startapp.android.publish.ads.video.f b>
	//   20   43:invokestatic    #59  <Method String f.a(com.startapp.android.publish.ads.video.f)>
	//   21   46:invokestatic    #64  <Method void f.a(android.content.Context, e, String)>
		}
	//   22   49:return          
	}

	final int a;
	final com.startapp.android.publish.ads.video.f b;

	f$7(com.startapp.android.publish.ads.video.f f1, int i)
	{
		b = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field com.startapp.android.publish.ads.video.f b>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field int a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
