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

private static class MediaButtonReceiver$MediaButtonConnectionCallback extends android.support.v4.media.MediaBrowserCompat.ConnectionCallback
{

	private void finish()
	{
		mMediaBrowser.disconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field MediaBrowserCompat mMediaBrowser>
	//    2    4:invokevirtual   #35  <Method void MediaBrowserCompat.disconnect()>
		mPendingResult.finish();
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field android.content.BroadcastReceiver$PendingResult mPendingResult>
	//    5   11:invokevirtual   #39  <Method void android.content.BroadcastReceiver$PendingResult.finish()>
	//    6   14:return          
	}

	public void onConnected()
	{
		try
		{
			(new MediaControllerCompat(mContext, mMediaBrowser.getSessionToken())).dispatchMediaButtonEvent((KeyEvent)mIntent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
	//    0    0:new             #44  <Class MediaControllerCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field Context mContext>
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field MediaBrowserCompat mMediaBrowser>
	//    6   12:invokevirtual   #48  <Method MediaSessionCompat$Token MediaBrowserCompat.getSessionToken()>
	//    7   15:invokespecial   #51  <Method void MediaControllerCompat(Context, MediaSessionCompat$Token)>
	//    8   18:aload_0         
	//    9   19:getfield        #24  <Field Intent mIntent>
	//   10   22:ldc1            #53  <String "android.intent.extra.KEY_EVENT">
	//   11   24:invokevirtual   #59  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   12   27:checkcast       #61  <Class KeyEvent>
	//   13   30:invokevirtual   #65  <Method boolean MediaControllerCompat.dispatchMediaButtonEvent(KeyEvent)>
	//   14   33:pop             
		}
	//*  15   34:goto            47
		catch(RemoteException remoteexception)
	//*  16   37:astore_1        
		{
			Log.e("MediaButtonReceiver", "Failed to create a media controller", ((Throwable) (remoteexception)));
	//   17   38:ldc1            #67  <String "MediaButtonReceiver">
	//   18   40:ldc1            #69  <String "Failed to create a media controller">
	//   19   42:aload_1         
	//   20   43:invokestatic    #75  <Method int Log.e(String, String, Throwable)>
	//   21   46:pop             
		}
		finish();
	//   22   47:aload_0         
	//   23   48:invokespecial   #76  <Method void finish()>
	//   24   51:return          
	}

	public void onConnectionFailed()
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void finish()>
	//    2    4:return          
	}

	public void onConnectionSuspended()
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void finish()>
	//    2    4:return          
	}

	void setMediaBrowser(MediaBrowserCompat mediabrowsercompat)
	{
		mMediaBrowser = mediabrowsercompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field MediaBrowserCompat mMediaBrowser>
	//    3    5:return          
	}

	private final Context mContext;
	private final Intent mIntent;
	private MediaBrowserCompat mMediaBrowser;
	private final android.content.BroadcastReceiver.PendingResult mPendingResult;

	MediaButtonReceiver$MediaButtonConnectionCallback(Context context, Intent intent, android.content.BroadcastReceiver.PendingResult pendingresult)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void android.support.v4.media.MediaBrowserCompat$ConnectionCallback()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Context mContext>
		mIntent = intent;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Intent mIntent>
		mPendingResult = pendingresult;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field android.content.BroadcastReceiver$PendingResult mPendingResult>
	//   11   19:return          
	}
}
