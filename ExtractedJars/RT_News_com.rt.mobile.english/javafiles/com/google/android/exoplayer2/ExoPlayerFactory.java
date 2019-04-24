// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.content.Context;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.util.Clock;

// Referenced classes of package com.google.android.exoplayer2:
//			DefaultLoadControl, ExoPlayerImpl, DefaultRenderersFactory, SimpleExoPlayer, 
//			Renderer, ExoPlayer, LoadControl, RenderersFactory

public final class ExoPlayerFactory
{

	private ExoPlayerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static ExoPlayer newInstance(Renderer arenderer[], TrackSelector trackselector)
	{
		return newInstance(arenderer, trackselector, ((LoadControl) (new DefaultLoadControl())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #13  <Class DefaultLoadControl>
	//    3    5:dup             
	//    4    6:invokespecial   #14  <Method void DefaultLoadControl()>
	//    5    9:invokestatic    #17  <Method ExoPlayer newInstance(Renderer[], TrackSelector, LoadControl)>
	//    6   12:areturn         
	}

	public static ExoPlayer newInstance(Renderer arenderer[], TrackSelector trackselector, LoadControl loadcontrol)
	{
		return ((ExoPlayer) (new ExoPlayerImpl(arenderer, trackselector, loadcontrol, Clock.DEFAULT)));
	//    0    0:new             #19  <Class ExoPlayerImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:getstatic       #25  <Field Clock Clock.DEFAULT>
	//    6   10:invokespecial   #28  <Method void ExoPlayerImpl(Renderer[], TrackSelector, LoadControl, Clock)>
	//    7   13:areturn         
	}

	public static SimpleExoPlayer newSimpleInstance(Context context, TrackSelector trackselector)
	{
		return newSimpleInstance(((RenderersFactory) (new DefaultRenderersFactory(context))), trackselector);
	//    0    0:new             #32  <Class DefaultRenderersFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void DefaultRenderersFactory(Context)>
	//    4    8:aload_1         
	//    5    9:invokestatic    #38  <Method SimpleExoPlayer newSimpleInstance(RenderersFactory, TrackSelector)>
	//    6   12:areturn         
	}

	public static SimpleExoPlayer newSimpleInstance(Context context, TrackSelector trackselector, LoadControl loadcontrol)
	{
		return newSimpleInstance(((RenderersFactory) (new DefaultRenderersFactory(context))), trackselector, loadcontrol);
	//    0    0:new             #32  <Class DefaultRenderersFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void DefaultRenderersFactory(Context)>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #43  <Method SimpleExoPlayer newSimpleInstance(RenderersFactory, TrackSelector, LoadControl)>
	//    7   13:areturn         
	}

	public static SimpleExoPlayer newSimpleInstance(Context context, TrackSelector trackselector, LoadControl loadcontrol, DrmSessionManager drmsessionmanager)
	{
		return newSimpleInstance(((RenderersFactory) (new DefaultRenderersFactory(context))), trackselector, loadcontrol, drmsessionmanager);
	//    0    0:new             #32  <Class DefaultRenderersFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void DefaultRenderersFactory(Context)>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokestatic    #49  <Method SimpleExoPlayer newSimpleInstance(RenderersFactory, TrackSelector, LoadControl, DrmSessionManager)>
	//    8   14:areturn         
	}

	public static SimpleExoPlayer newSimpleInstance(Context context, TrackSelector trackselector, LoadControl loadcontrol, DrmSessionManager drmsessionmanager, int i)
	{
		return newSimpleInstance(((RenderersFactory) (new DefaultRenderersFactory(context, i))), trackselector, loadcontrol, drmsessionmanager);
	//    0    0:new             #32  <Class DefaultRenderersFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload           4
	//    4    7:invokespecial   #56  <Method void DefaultRenderersFactory(Context, int)>
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:invokestatic    #49  <Method SimpleExoPlayer newSimpleInstance(RenderersFactory, TrackSelector, LoadControl, DrmSessionManager)>
	//    9   16:areturn         
	}

	public static SimpleExoPlayer newSimpleInstance(Context context, TrackSelector trackselector, LoadControl loadcontrol, DrmSessionManager drmsessionmanager, int i, long l)
	{
		return newSimpleInstance(((RenderersFactory) (new DefaultRenderersFactory(context, i, l))), trackselector, loadcontrol, drmsessionmanager);
	//    0    0:new             #32  <Class DefaultRenderersFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload           4
	//    4    7:lload           5
	//    5    9:invokespecial   #61  <Method void DefaultRenderersFactory(Context, int, long)>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokestatic    #49  <Method SimpleExoPlayer newSimpleInstance(RenderersFactory, TrackSelector, LoadControl, DrmSessionManager)>
	//   10   18:areturn         
	}

	public static SimpleExoPlayer newSimpleInstance(RenderersFactory renderersfactory, TrackSelector trackselector)
	{
		return newSimpleInstance(renderersfactory, trackselector, ((LoadControl) (new DefaultLoadControl())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #13  <Class DefaultLoadControl>
	//    3    5:dup             
	//    4    6:invokespecial   #14  <Method void DefaultLoadControl()>
	//    5    9:invokestatic    #43  <Method SimpleExoPlayer newSimpleInstance(RenderersFactory, TrackSelector, LoadControl)>
	//    6   12:areturn         
	}

	public static SimpleExoPlayer newSimpleInstance(RenderersFactory renderersfactory, TrackSelector trackselector, LoadControl loadcontrol)
	{
		return new SimpleExoPlayer(renderersfactory, trackselector, loadcontrol, ((DrmSessionManager) (null)));
	//    0    0:new             #64  <Class SimpleExoPlayer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #67  <Method void SimpleExoPlayer(RenderersFactory, TrackSelector, LoadControl, DrmSessionManager)>
	//    7   11:areturn         
	}

	public static SimpleExoPlayer newSimpleInstance(RenderersFactory renderersfactory, TrackSelector trackselector, LoadControl loadcontrol, DrmSessionManager drmsessionmanager)
	{
		return new SimpleExoPlayer(renderersfactory, trackselector, loadcontrol, drmsessionmanager);
	//    0    0:new             #64  <Class SimpleExoPlayer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #67  <Method void SimpleExoPlayer(RenderersFactory, TrackSelector, LoadControl, DrmSessionManager)>
	//    7   11:areturn         
	}

	public static SimpleExoPlayer newSimpleInstance(RenderersFactory renderersfactory, TrackSelector trackselector, LoadControl loadcontrol, DrmSessionManager drmsessionmanager, com.google.android.exoplayer2.analytics.AnalyticsCollector.Factory factory)
	{
		return new SimpleExoPlayer(renderersfactory, trackselector, loadcontrol, drmsessionmanager, factory);
	//    0    0:new             #64  <Class SimpleExoPlayer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #72  <Method void SimpleExoPlayer(RenderersFactory, TrackSelector, LoadControl, DrmSessionManager, com.google.android.exoplayer2.analytics.AnalyticsCollector$Factory)>
	//    8   13:areturn         
	}

	public static SimpleExoPlayer newSimpleInstance(RenderersFactory renderersfactory, TrackSelector trackselector, DrmSessionManager drmsessionmanager)
	{
		return newSimpleInstance(renderersfactory, trackselector, ((LoadControl) (new DefaultLoadControl())), drmsessionmanager);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #13  <Class DefaultLoadControl>
	//    3    5:dup             
	//    4    6:invokespecial   #14  <Method void DefaultLoadControl()>
	//    5    9:aload_2         
	//    6   10:invokestatic    #49  <Method SimpleExoPlayer newSimpleInstance(RenderersFactory, TrackSelector, LoadControl, DrmSessionManager)>
	//    7   13:areturn         
	}
}
