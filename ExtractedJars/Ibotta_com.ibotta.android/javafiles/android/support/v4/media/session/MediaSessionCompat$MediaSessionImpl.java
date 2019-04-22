// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.VolumeProviderCompat;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, PlaybackStateCompat

static interface MediaSessionCompat$MediaSessionImpl
{

	public abstract String getCallingPackage();

	public abstract Object getMediaSession();

	public abstract PlaybackStateCompat getPlaybackState();

	public abstract Object getRemoteControlClient();

	public abstract MediaSessionCompat.Token getSessionToken();

	public abstract boolean isActive();

	public abstract void release();

	public abstract void sendSessionEvent(String s, Bundle bundle);

	public abstract void setActive(boolean flag);

	public abstract void setCallback(MediaSessionCompat.Callback callback, Handler handler);

	public abstract void setCaptioningEnabled(boolean flag);

	public abstract void setExtras(Bundle bundle);

	public abstract void setFlags(int i);

	public abstract void setMediaButtonReceiver(PendingIntent pendingintent);

	public abstract void setMetadata(MediaMetadataCompat mediametadatacompat);

	public abstract void setPlaybackState(PlaybackStateCompat playbackstatecompat);

	public abstract void setPlaybackToLocal(int i);

	public abstract void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat);

	public abstract void setQueue(List list);

	public abstract void setQueueTitle(CharSequence charsequence);

	public abstract void setRatingType(int i);

	public abstract void setRepeatMode(int i);

	public abstract void setSessionActivity(PendingIntent pendingintent);

	public abstract void setShuffleMode(int i);
}
