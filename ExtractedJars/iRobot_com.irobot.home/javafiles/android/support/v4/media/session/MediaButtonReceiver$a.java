// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.util.Log;
import android.view.KeyEvent;

// Referenced classes of package android.support.v4.media.session:
//			MediaButtonReceiver, MediaControllerCompat

private static class MediaButtonReceiver$a extends android.support.v4.media.MediaBrowserCompat.b
{

	private void d()
	{
		f.b();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field MediaBrowserCompat f>
	//    2    4:invokevirtual   #34  <Method void MediaBrowserCompat.b()>
		e.finish();
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field android.content.BroadcastReceiver$PendingResult e>
	//    5   11:invokevirtual   #39  <Method void android.content.BroadcastReceiver$PendingResult.finish()>
	//    6   14:return          
	}

	public void a()
	{
		try
		{
			(new MediaControllerCompat(c, f.c())).a((KeyEvent)d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
	//    0    0:new             #43  <Class MediaControllerCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field Context c>
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field MediaBrowserCompat f>
	//    6   12:invokevirtual   #46  <Method MediaSessionCompat$Token MediaBrowserCompat.c()>
	//    7   15:invokespecial   #49  <Method void MediaControllerCompat(Context, MediaSessionCompat$Token)>
	//    8   18:aload_0         
	//    9   19:getfield        #24  <Field Intent d>
	//   10   22:ldc1            #51  <String "android.intent.extra.KEY_EVENT">
	//   11   24:invokevirtual   #57  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   12   27:checkcast       #59  <Class KeyEvent>
	//   13   30:invokevirtual   #62  <Method boolean MediaControllerCompat.a(KeyEvent)>
	//   14   33:pop             
		}
	//*  15   34:goto            47
		catch(RemoteException remoteexception)
	//*  16   37:astore_1        
		{
			Log.e("MediaButtonReceiver", "Failed to create a media controller", ((Throwable) (remoteexception)));
	//   17   38:ldc1            #64  <String "MediaButtonReceiver">
	//   18   40:ldc1            #66  <String "Failed to create a media controller">
	//   19   42:aload_1         
	//   20   43:invokestatic    #71  <Method int Log.e(String, String, Throwable)>
	//   21   46:pop             
		}
		d();
	//   22   47:aload_0         
	//   23   48:invokespecial   #73  <Method void d()>
	//   24   51:return          
	}

	void a(MediaBrowserCompat mediabrowsercompat)
	{
		f = mediabrowsercompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field MediaBrowserCompat f>
	//    3    5:return          
	}

	public void b()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void d()>
	//    2    4:return          
	}

	public void c()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void d()>
	//    2    4:return          
	}

	private final Context c;
	private final Intent d;
	private final android.content.ingResult e;
	private MediaBrowserCompat f;

	MediaButtonReceiver$a(Context context, Intent intent, android.content.ingResult ingresult)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void android.support.v4.media.MediaBrowserCompat$b()>
		c = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Context c>
		d = intent;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Intent d>
		e = ingresult;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field android.content.BroadcastReceiver$PendingResult e>
	//   11   19:return          
	}
}
