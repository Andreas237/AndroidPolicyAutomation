// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, PlaybackStateCompat, ParcelableVolumeInfo

class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback extends IMediaControllerCallback.Stub
{

	public void onEvent(final String event, final Bundle extras)
		throws RemoteException
	{
		mCallback.mHandler.post(new Runnable() {

			public void run()
			{
				mCallback.onSessionEvent(event, extras);
			//    0    0:aload_0         
			//    1    1:getfield        #27  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
			//    2    4:invokestatic    #40  <Method MediaControllerCompat$Callback MediaControllerCompat$MediaControllerImplApi21$ExtraCallback.access$500(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback)>
			//    3    7:aload_0         
			//    4    8:getfield        #29  <Field String val$event>
			//    5   11:aload_0         
			//    6   12:getfield        #31  <Field Bundle val$extras>
			//    7   15:invokevirtual   #45  <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
			//    8   18:return          
			}

			final MediaControllerCompat.MediaControllerImplApi21.ExtraCallback this$1;
			final String val$event;
			final Bundle val$extras;

			
			{
				this$1 = MediaControllerCompat.MediaControllerImplApi21.ExtraCallback.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
				event = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #29  <Field String val$event>
				extras = bundle;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #31  <Field Bundle val$extras>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #34  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediaControllerCompat$Callback mCallback>
	//    2    4:getfield        #44  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
	//    3    7:new             #12  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$1>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #47  <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$1(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback, String, Bundle)>
	//    9   17:invokevirtual   #53  <Method boolean MediaControllerCompat$Callback$MessageHandler.post(Runnable)>
	//   10   20:pop             
	//   11   21:return          
	}

	public void onExtrasChanged(Bundle bundle)
		throws RemoteException
	{
		throw new AssertionError();
	//    0    0:new             #58  <Class AssertionError>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void AssertionError()>
	//    3    7:athrow          
	}

	public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
		throws RemoteException
	{
		throw new AssertionError();
	//    0    0:new             #58  <Class AssertionError>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void AssertionError()>
	//    3    7:athrow          
	}

	public void onPlaybackStateChanged(final PlaybackStateCompat state)
		throws RemoteException
	{
		mCallback.mHandler.post(new Runnable() {

			public void run()
			{
				mCallback.onPlaybackStateChanged(state);
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
			//    2    4:invokestatic    #36  <Method MediaControllerCompat$Callback MediaControllerCompat$MediaControllerImplApi21$ExtraCallback.access$500(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback)>
			//    3    7:aload_0         
			//    4    8:getfield        #27  <Field PlaybackStateCompat val$state>
			//    5   11:invokevirtual   #39  <Method void MediaControllerCompat$Callback.onPlaybackStateChanged(PlaybackStateCompat)>
			//    6   14:return          
			}

			final MediaControllerCompat.MediaControllerImplApi21.ExtraCallback this$1;
			final PlaybackStateCompat val$state;

			
			{
				this$1 = MediaControllerCompat.MediaControllerImplApi21.ExtraCallback.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
				state = playbackstatecompat;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field PlaybackStateCompat val$state>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #30  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediaControllerCompat$Callback mCallback>
	//    2    4:getfield        #44  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
	//    3    7:new             #14  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$2>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #66  <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$2(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback, PlaybackStateCompat)>
	//    8   16:invokevirtual   #53  <Method boolean MediaControllerCompat$Callback$MessageHandler.post(Runnable)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void onQueueChanged(List list)
		throws RemoteException
	{
		throw new AssertionError();
	//    0    0:new             #58  <Class AssertionError>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void AssertionError()>
	//    3    7:athrow          
	}

	public void onQueueTitleChanged(CharSequence charsequence)
		throws RemoteException
	{
		throw new AssertionError();
	//    0    0:new             #58  <Class AssertionError>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void AssertionError()>
	//    3    7:athrow          
	}

	public void onRepeatModeChanged(final int repeatMode)
		throws RemoteException
	{
		mCallback.mHandler.post(new Runnable() {

			public void run()
			{
				mCallback.onRepeatModeChanged(repeatMode);
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
			//    2    4:invokestatic    #36  <Method MediaControllerCompat$Callback MediaControllerCompat$MediaControllerImplApi21$ExtraCallback.access$500(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback)>
			//    3    7:aload_0         
			//    4    8:getfield        #27  <Field int val$repeatMode>
			//    5   11:invokevirtual   #39  <Method void MediaControllerCompat$Callback.onRepeatModeChanged(int)>
			//    6   14:return          
			}

			final MediaControllerCompat.MediaControllerImplApi21.ExtraCallback this$1;
			final int val$repeatMode;

			
			{
				this$1 = MediaControllerCompat.MediaControllerImplApi21.ExtraCallback.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
				repeatMode = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #27  <Field int val$repeatMode>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #30  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediaControllerCompat$Callback mCallback>
	//    2    4:getfield        #44  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
	//    3    7:new             #16  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$3>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokespecial   #77  <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$3(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback, int)>
	//    8   16:invokevirtual   #53  <Method boolean MediaControllerCompat$Callback$MessageHandler.post(Runnable)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void onSessionDestroyed()
		throws RemoteException
	{
		throw new AssertionError();
	//    0    0:new             #58  <Class AssertionError>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void AssertionError()>
	//    3    7:athrow          
	}

	public void onShuffleModeChanged(final boolean enabled)
		throws RemoteException
	{
		mCallback.mHandler.post(new Runnable() {

			public void run()
			{
				mCallback.onShuffleModeChanged(enabled);
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
			//    2    4:invokestatic    #36  <Method MediaControllerCompat$Callback MediaControllerCompat$MediaControllerImplApi21$ExtraCallback.access$500(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback)>
			//    3    7:aload_0         
			//    4    8:getfield        #27  <Field boolean val$enabled>
			//    5   11:invokevirtual   #39  <Method void MediaControllerCompat$Callback.onShuffleModeChanged(boolean)>
			//    6   14:return          
			}

			final MediaControllerCompat.MediaControllerImplApi21.ExtraCallback this$1;
			final boolean val$enabled;

			
			{
				this$1 = MediaControllerCompat.MediaControllerImplApi21.ExtraCallback.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
				enabled = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #27  <Field boolean val$enabled>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #30  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediaControllerCompat$Callback mCallback>
	//    2    4:getfield        #44  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
	//    3    7:new             #18  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$4>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokespecial   #83  <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$4(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback, boolean)>
	//    8   16:invokevirtual   #53  <Method boolean MediaControllerCompat$Callback$MessageHandler.post(Runnable)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
		throws RemoteException
	{
		throw new AssertionError();
	//    0    0:new             #58  <Class AssertionError>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void AssertionError()>
	//    3    7:athrow          
	}

	private MediaControllerCompat.Callback mCallback;
	final MediaControllerCompat.MediaControllerImplApi21 this$0;


/*
	static MediaControllerCompat.Callback access$500(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback mediacontrollercompat$mediacontrollerimplapi21$extracallback)
	{
		return mediacontrollercompat$mediacontrollerimplapi21$extracallback.mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediaControllerCompat$Callback mCallback>
	//    2    4:areturn         
	}

*/

	MediaControllerCompat$MediaControllerImplApi21$ExtraCallback(MediaControllerCompat.Callback callback)
	{
		this$0 = MediaControllerCompat.MediaControllerImplApi21.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field MediaControllerCompat$MediaControllerImplApi21 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #29  <Method void IMediaControllerCallback$Stub()>
		mCallback = callback;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field MediaControllerCompat$Callback mCallback>
	//    8   14:return          
	}
}
