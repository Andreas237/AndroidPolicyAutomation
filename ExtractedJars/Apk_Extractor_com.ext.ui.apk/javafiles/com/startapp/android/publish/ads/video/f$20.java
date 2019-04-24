// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import com.startapp.android.publish.ads.video.b.c;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.e;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.common.b;

// Referenced classes of package com.startapp.android.publish.ads.video:
//			f

class f$20
	implements Runnable
{

	public void run()
	{
		if(a.h == null)
			break MISSING_BLOCK_LABEL_152;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field com.startapp.android.publish.ads.video.f a>
	//    2    4:getfield        #27  <Field c f.h>
	//    3    7:ifnull          152
		if(a.h.d() > 0)
	//*   4   10:aload_0         
	//*   5   11:getfield        #17  <Field com.startapp.android.publish.ads.video.f a>
	//*   6   14:getfield        #27  <Field c f.h>
	//*   7   17:invokeinterface #33  <Method int c.d()>
	//*   8   22:ifle            82
		{
			a.f(0);
	//    9   25:aload_0         
	//   10   26:getfield        #17  <Field com.startapp.android.publish.ads.video.f a>
	//   11   29:iconst_0        
	//   12   30:invokevirtual   #37  <Method void com.startapp.android.publish.ads.video.f.f(int)>
			a.g(0);
	//   13   33:aload_0         
	//   14   34:getfield        #17  <Field com.startapp.android.publish.ads.video.f a>
	//   15   37:iconst_0        
	//   16   38:invokevirtual   #40  <Method void f.g(int)>
			if(a.l == 0)
	//*  17   41:aload_0         
	//*  18   42:getfield        #17  <Field com.startapp.android.publish.ads.video.f a>
	//*  19   45:getfield        #44  <Field int f.l>
	//*  20   48:ifne            152
			{
				a.Z();
	//   21   51:aload_0         
	//   22   52:getfield        #17  <Field com.startapp.android.publish.ads.video.f a>
	//   23   55:invokevirtual   #47  <Method void f.Z()>
				b.a(((android.content.Context) (a.b()))).a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
	//   24   58:aload_0         
	//   25   59:getfield        #17  <Field com.startapp.android.publish.ads.video.f a>
	//   26   62:invokevirtual   #51  <Method Activity com.startapp.android.publish.ads.video.f.b()>
	//   27   65:invokestatic    #56  <Method b b.a(android.content.Context)>
	//   28   68:new             #58  <Class Intent>
	//   29   71:dup             
	//   30   72:ldc1            #60  <String "com.startapp.android.ShowDisplayBroadcastListener">
	//   31   74:invokespecial   #63  <Method void Intent(String)>
	//   32   77:invokevirtual   #66  <Method boolean b.a(Intent)>
	//   33   80:pop             
				return;
	//   34   81:return          
			}
			break MISSING_BLOCK_LABEL_152;
		}
		try
		{
			if(!a.r)
	//*  35   82:aload_0         
	//*  36   83:getfield        #17  <Field com.startapp.android.publish.ads.video.f a>
	//*  37   86:getfield        #69  <Field boolean f.r>
	//*  38   89:ifne            152
			{
				a.B.postDelayed(((Runnable) (this)), 100L);
	//   39   92:aload_0         
	//   40   93:getfield        #17  <Field com.startapp.android.publish.ads.video.f a>
	//   41   96:getfield        #73  <Field Handler f.B>
	//   42   99:aload_0         
	//   43  100:ldc2w           #74  <Long 100L>
	//   44  103:invokevirtual   #81  <Method boolean Handler.postDelayed(Runnable, long)>
	//   45  106:pop             
				return;
	//   46  107:return          
			}
		}
		catch(Exception exception)
	//*  47  108:astore_1        
		{
			f.a(a.b().getApplicationContext(), new e(d.b, "VideoMode.startVideoPlayback", exception.getMessage()), f.a(a));
	//   48  109:aload_0         
	//   49  110:getfield        #17  <Field com.startapp.android.publish.ads.video.f a>
	//   50  113:invokevirtual   #51  <Method Activity com.startapp.android.publish.ads.video.f.b()>
	//   51  116:invokevirtual   #87  <Method android.content.Context Activity.getApplicationContext()>
	//   52  119:new             #89  <Class e>
	//   53  122:dup             
	//   54  123:getstatic       #94  <Field d d.b>
	//   55  126:ldc1            #96  <String "VideoMode.startVideoPlayback">
	//   56  128:aload_1         
	//   57  129:invokevirtual   #100 <Method String Exception.getMessage()>
	//   58  132:invokespecial   #103 <Method void e(d, String, String)>
	//   59  135:aload_0         
	//   60  136:getfield        #17  <Field com.startapp.android.publish.ads.video.f a>
	//   61  139:invokestatic    #106 <Method String f.a(com.startapp.android.publish.ads.video.f)>
	//   62  142:invokestatic    #111 <Method void f.a(android.content.Context, e, String)>
			a.p();
	//   63  145:aload_0         
	//   64  146:getfield        #17  <Field com.startapp.android.publish.ads.video.f a>
	//   65  149:invokevirtual   #114 <Method void f.p()>
		}
	//   66  152:return          
	}

	final com.startapp.android.publish.ads.video.f a;

	f$20(com.startapp.android.publish.ads.video.f f1)
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
