// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.*;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, PlaybackStateCompat

static interface MediaControllerCompat$MediaControllerImpl
{

	public abstract void addQueueItem(MediaDescriptionCompat mediadescriptioncompat);

	public abstract void addQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i);

	public abstract void adjustVolume(int i, int j);

	public abstract boolean dispatchMediaButtonEvent(KeyEvent keyevent);

	public abstract Bundle getExtras();

	public abstract long getFlags();

	public abstract Object getMediaController();

	public abstract MediaMetadataCompat getMetadata();

	public abstract String getPackageName();

	public abstract MediaControllerCompat.PlaybackInfo getPlaybackInfo();

	public abstract PlaybackStateCompat getPlaybackState();

	public abstract List getQueue();

	public abstract CharSequence getQueueTitle();

	public abstract int getRatingType();

	public abstract int getRepeatMode();

	public abstract PendingIntent getSessionActivity();

	public abstract MediaControllerCompat.TransportControls getTransportControls();

	public abstract boolean isShuffleModeEnabled();

	public abstract void registerCallback(MediaControllerCompat.Callback callback, Handler handler);

	public abstract void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat);

	public abstract void removeQueueItemAt(int i);

	public abstract void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver);

	public abstract void setVolumeTo(int i, int j);

	public abstract void unregisterCallback(MediaControllerCompat.Callback callback);
}
