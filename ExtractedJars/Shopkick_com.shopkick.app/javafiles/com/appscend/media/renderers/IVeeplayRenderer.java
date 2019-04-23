// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers;

import android.app.Activity;
import android.view.View;
import com.appscend.hub.KRAdapter;
import com.appscend.media.renderers.exoPlayerRenderers.PlayerView;

public interface IVeeplayRenderer
	extends KRAdapter
{

	public abstract int duration();

	public abstract int getCurrentPosition();

	public abstract View getView();

	public abstract boolean handlesInitialPlaybackTime();

	public abstract void init(Activity activity);

	public abstract void onActivityPaused();

	public abstract void onActivityResumed();

	public abstract void pause();

	public abstract void playVideo(String s);

	public abstract void playVideo(String s, String s1);

	public abstract void playingSurfaceSizeChanged();

	public abstract void recylePlayerView();

	public abstract void release();

	public abstract boolean resumePlay();

	public abstract void seekTo(int i);

	public abstract void setMute(boolean flag);

	public abstract void setVolume(float f);

	public abstract void switchSurface(PlayerView playerview);

	public abstract void unitFinished(com.appscend.media.APSMediaPlayer.MPMovieFinishReason mpmoviefinishreason);
}
