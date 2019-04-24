// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Bundle;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompatApi21

public static interface MediaControllerCompatApi21$Callback
{

	public abstract void onAudioInfoChanged(int i, int j, int k, int l, int i1);

	public abstract void onExtrasChanged(Bundle bundle);

	public abstract void onMetadataChanged(Object obj);

	public abstract void onPlaybackStateChanged(Object obj);

	public abstract void onQueueChanged(List list);

	public abstract void onQueueTitleChanged(CharSequence charsequence);

	public abstract void onSessionDestroyed();

	public abstract void onSessionEvent(String s, Bundle bundle);
}
