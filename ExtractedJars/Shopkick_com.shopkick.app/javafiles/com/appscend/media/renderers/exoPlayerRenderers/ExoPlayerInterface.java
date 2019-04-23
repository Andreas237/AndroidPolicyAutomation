// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers.exoPlayerRenderers;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.google.android.exoplayer.*;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.text.TextRenderer;
import com.google.android.exoplayer.upstream.BandwidthMeter;
import com.google.android.exoplayer.util.PlayerControl;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.appscend.media.renderers.exoPlayerRenderers:
//			PlayerView

public class ExoPlayerInterface
	implements com.google.android.exoplayer.ExoPlayer.Listener, com.google.android.exoplayer.chunk.ChunkSampleSource.EventListener, com.google.android.exoplayer.hls.HlsSampleSource.EventListener, com.google.android.exoplayer.extractor.ExtractorSampleSource.EventListener, com.google.android.exoplayer.SingleSampleSource.EventListener, com.google.android.exoplayer.upstream.BandwidthMeter.EventListener, com.google.android.exoplayer.MediaCodecVideoTrackRenderer.EventListener, com.google.android.exoplayer.MediaCodecAudioTrackRenderer.EventListener, com.google.android.exoplayer.drm.StreamingDrmSessionManager.EventListener, com.google.android.exoplayer.dash.DashChunkSource.EventListener, TextRenderer, com.google.android.exoplayer.metadata.MetadataTrackRenderer.MetadataRenderer, com.google.android.exoplayer.util.DebugTextViewHelper.Provider
{
	public static interface CaptionListener
	{

		public abstract void onCues(List list);
	}

	public static interface Id3MetadataListener
	{

		public abstract void onId3Metadata(List list);
	}

	public static interface InfoListener
	{

		public abstract void onAudioFormatEnabled(Format format, int i, long l);

		public abstract void onAvailableRangeChanged(int i, TimeRange timerange);

		public abstract void onBandwidthSample(int i, long l, long l1);

		public abstract void onDecoderInitialized(String s, long l, long l1);

		public abstract void onDroppedFrames(int i, long l);

		public abstract void onLoadCompleted(int i, long l, int j, int k, Format format, long l1, long l2, long l3, long l4);

		public abstract void onLoadStarted(int i, long l, int j, int k, Format format, long l1, long l2);

		public abstract void onVideoFormatEnabled(Format format, int i, long l);
	}

	public static interface InternalErrorListener
	{

		public abstract void onAudioTrackInitializationError(com.google.android.exoplayer.audio.AudioTrack.InitializationException initializationexception);

		public abstract void onAudioTrackUnderrun(int i, long l, long l1);

		public abstract void onAudioTrackWriteError(com.google.android.exoplayer.audio.AudioTrack.WriteException writeexception);

		public abstract void onCryptoError(android.media.MediaCodec.CryptoException cryptoexception);

		public abstract void onDecoderInitializationError(com.google.android.exoplayer.MediaCodecTrackRenderer.DecoderInitializationException decoderinitializationexception);

		public abstract void onDrmSessionManagerError(Exception exception);

		public abstract void onLoadError(int i, IOException ioexception);

		public abstract void onRendererInitializationError(Exception exception);
	}

	public static interface Listener
	{

		public abstract void onError(Exception exception);

		public abstract void onStateChanged(boolean flag, int i);

		public abstract void onVideoSizeChanged(int i, int j, int k, float f);
	}

	public static interface RendererBuilder
	{

		public abstract void buildRenderers(ExoPlayerInterface exoplayerinterface);

		public abstract void cancel();
	}


	public ExoPlayerInterface(RendererBuilder rendererbuilder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #115 <Method void Object()>
		rendererBuilder = rendererbuilder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #117 <Field ExoPlayerInterface$RendererBuilder rendererBuilder>
	//    5    9:aload_0         
	//    6   10:iconst_4        
	//    7   11:sipush          1000
	//    8   14:sipush          5000
	//    9   17:invokestatic    #123 <Method ExoPlayer com.google.android.exoplayer.ExoPlayer$Factory.newInstance(int, int, int)>
	//   10   20:putfield        #125 <Field ExoPlayer player>
		player.addListener(((com.google.android.exoplayer.ExoPlayer.Listener) (this)));
	//   11   23:aload_0         
	//   12   24:getfield        #125 <Field ExoPlayer player>
	//   13   27:aload_0         
	//   14   28:invokeinterface #131 <Method void ExoPlayer.addListener(com.google.android.exoplayer.ExoPlayer$Listener)>
		playerControl = new PlayerControl(player);
	//   15   33:aload_0         
	//   16   34:new             #133 <Class PlayerControl>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:getfield        #125 <Field ExoPlayer player>
	//   20   42:invokespecial   #136 <Method void PlayerControl(ExoPlayer)>
	//   21   45:putfield        #138 <Field PlayerControl playerControl>
	//   22   48:aload_0         
	//   23   49:new             #140 <Class Handler>
	//   24   52:dup             
	//   25   53:invokespecial   #141 <Method void Handler()>
	//   26   56:putfield        #143 <Field Handler mainHandler>
	//   27   59:aload_0         
	//   28   60:new             #145 <Class CopyOnWriteArrayList>
	//   29   63:dup             
	//   30   64:invokespecial   #146 <Method void CopyOnWriteArrayList()>
	//   31   67:putfield        #148 <Field CopyOnWriteArrayList listeners>
		lastReportedPlaybackState = 1;
	//   32   70:aload_0         
	//   33   71:iconst_1        
	//   34   72:putfield        #150 <Field int lastReportedPlaybackState>
		rendererBuildingState = 1;
	//   35   75:aload_0         
	//   36   76:iconst_1        
	//   37   77:putfield        #152 <Field int rendererBuildingState>
		player.setSelectedTrack(2, -1);
	//   38   80:aload_0         
	//   39   81:getfield        #125 <Field ExoPlayer player>
	//   40   84:iconst_2        
	//   41   85:iconst_m1       
	//   42   86:invokeinterface #156 <Method void ExoPlayer.setSelectedTrack(int, int)>
	//   43   91:return          
	}

	private void maybeReportPlayerState()
	{
		boolean flag = player.getPlayWhenReady();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ExoPlayer player>
	//    2    4:invokeinterface #162 <Method boolean ExoPlayer.getPlayWhenReady()>
	//    3    9:istore_2        
		int i = getPlaybackState();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #166 <Method int getPlaybackState()>
	//    6   14:istore_1        
		if(lastReportedPlayWhenReady != flag || lastReportedPlaybackState != i)
	//*   7   15:aload_0         
	//*   8   16:getfield        #168 <Field boolean lastReportedPlayWhenReady>
	//*   9   19:iload_2         
	//*  10   20:icmpne          31
	//*  11   23:aload_0         
	//*  12   24:getfield        #150 <Field int lastReportedPlaybackState>
	//*  13   27:iload_1         
	//*  14   28:icmpeq          77
		{
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onStateChanged(flag, i));
	//   15   31:aload_0         
	//   16   32:getfield        #148 <Field CopyOnWriteArrayList listeners>
	//   17   35:invokevirtual   #172 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   18   38:astore_3        
	//   19   39:aload_3         
	//   20   40:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            67
	//   22   48:aload_3         
	//   23   49:invokeinterface #181 <Method Object Iterator.next()>
	//   24   54:checkcast       #45  <Class ExoPlayerInterface$Listener>
	//   25   57:iload_2         
	//   26   58:iload_1         
	//   27   59:invokeinterface #185 <Method void ExoPlayerInterface$Listener.onStateChanged(boolean, int)>
	//*  28   64:goto            39
			lastReportedPlayWhenReady = flag;
	//   29   67:aload_0         
	//   30   68:iload_2         
	//   31   69:putfield        #168 <Field boolean lastReportedPlayWhenReady>
			lastReportedPlaybackState = i;
	//   32   72:aload_0         
	//   33   73:iload_1         
	//   34   74:putfield        #150 <Field int lastReportedPlaybackState>
		}
	//   35   77:return          
	}

	private void pushSurface(boolean flag)
	{
		if(videoRenderer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field TrackRenderer videoRenderer>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		Object obj = ((Object) (surfaceTexture));
	//    4    8:aload_0         
	//    5    9:getfield        #191 <Field SurfaceTexture surfaceTexture>
	//    6   12:astore_2        
		if(obj == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       22
			obj = null;
	//    9   17:aconst_null     
	//   10   18:astore_2        
		else
	//*  11   19:goto            31
			obj = ((Object) (new Surface(((SurfaceTexture) (obj)))));
	//   12   22:new             #193 <Class Surface>
	//   13   25:dup             
	//   14   26:aload_2         
	//   15   27:invokespecial   #196 <Method void Surface(SurfaceTexture)>
	//   16   30:astore_2        
		if(flag)
	//*  17   31:iload_1         
	//*  18   32:ifeq            51
		{
			player.blockingSendMessage(((com.google.android.exoplayer.ExoPlayer.ExoPlayerComponent) (videoRenderer)), 1, obj);
	//   19   35:aload_0         
	//   20   36:getfield        #125 <Field ExoPlayer player>
	//   21   39:aload_0         
	//   22   40:getfield        #189 <Field TrackRenderer videoRenderer>
	//   23   43:iconst_1        
	//   24   44:aload_2         
	//   25   45:invokeinterface #200 <Method void ExoPlayer.blockingSendMessage(com.google.android.exoplayer.ExoPlayer$ExoPlayerComponent, int, Object)>
			return;
	//   26   50:return          
		} else
		{
			player.sendMessage(((com.google.android.exoplayer.ExoPlayer.ExoPlayerComponent) (videoRenderer)), 1, obj);
	//   27   51:aload_0         
	//   28   52:getfield        #125 <Field ExoPlayer player>
	//   29   55:aload_0         
	//   30   56:getfield        #189 <Field TrackRenderer videoRenderer>
	//   31   59:iconst_1        
	//   32   60:aload_2         
	//   33   61:invokeinterface #203 <Method void ExoPlayer.sendMessage(com.google.android.exoplayer.ExoPlayer$ExoPlayerComponent, int, Object)>
			return;
	//   34   66:return          
		}
	}

	public void addListener(Listener listener)
	{
		listeners.add(((Object) (listener)));
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field CopyOnWriteArrayList listeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #208 <Method boolean CopyOnWriteArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void blockingClearSurface()
	{
		surfaceTexture = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #191 <Field SurfaceTexture surfaceTexture>
		pushSurface(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #211 <Method void pushSurface(boolean)>
	//    6   10:return          
	}

	public boolean getBackgrounded()
	{
		return backgrounded;
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field boolean backgrounded>
	//    2    4:ireturn         
	}

	public BandwidthMeter getBandwidthMeter()
	{
		return bandwidthMeter;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field BandwidthMeter bandwidthMeter>
	//    2    4:areturn         
	}

	public int getBufferedPercentage()
	{
		return player.getBufferedPercentage();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ExoPlayer player>
	//    2    4:invokeinterface #221 <Method int ExoPlayer.getBufferedPercentage()>
	//    3    9:ireturn         
	}

	public CodecCounters getCodecCounters()
	{
		return codecCounters;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field CodecCounters codecCounters>
	//    2    4:areturn         
	}

	public long getCurrentPosition()
	{
		return player.getCurrentPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ExoPlayer player>
	//    2    4:invokeinterface #229 <Method long ExoPlayer.getCurrentPosition()>
	//    3    9:lreturn         
	}

	public long getDuration()
	{
		return player.getDuration();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ExoPlayer player>
	//    2    4:invokeinterface #232 <Method long ExoPlayer.getDuration()>
	//    3    9:lreturn         
	}

	public ExoPlayer getExoPlayer()
	{
		return player;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ExoPlayer player>
	//    2    4:areturn         
	}

	public Format getFormat()
	{
		return videoFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field Format videoFormat>
	//    2    4:areturn         
	}

	Handler getMainHandler()
	{
		return mainHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field Handler mainHandler>
	//    2    4:areturn         
	}

	public boolean getPlayWhenReady()
	{
		return player.getPlayWhenReady();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ExoPlayer player>
	//    2    4:invokeinterface #162 <Method boolean ExoPlayer.getPlayWhenReady()>
	//    3    9:ireturn         
	}

	Looper getPlaybackLooper()
	{
		return player.getPlaybackLooper();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ExoPlayer player>
	//    2    4:invokeinterface #244 <Method Looper ExoPlayer.getPlaybackLooper()>
	//    3    9:areturn         
	}

	public int getPlaybackState()
	{
		if(rendererBuildingState == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field int rendererBuildingState>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          10
			return 2;
	//    4    8:iconst_2        
	//    5    9:ireturn         
		int i = player.getPlaybackState();
	//    6   10:aload_0         
	//    7   11:getfield        #125 <Field ExoPlayer player>
	//    8   14:invokeinterface #245 <Method int ExoPlayer.getPlaybackState()>
	//    9   19:istore_1        
		if(rendererBuildingState == 3 && i == 1)
	//*  10   20:aload_0         
	//*  11   21:getfield        #152 <Field int rendererBuildingState>
	//*  12   24:iconst_3        
	//*  13   25:icmpne          35
	//*  14   28:iload_1         
	//*  15   29:iconst_1        
	//*  16   30:icmpne          35
			return 2;
	//   17   33:iconst_2        
	//   18   34:ireturn         
		else
			return i;
	//   19   35:iload_1         
	//   20   36:ireturn         
	}

	public PlayerControl getPlayerControl()
	{
		return playerControl;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field PlayerControl playerControl>
	//    2    4:areturn         
	}

	public int getSelectedTrack(int i)
	{
		return player.getSelectedTrack(i);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ExoPlayer player>
	//    2    4:iload_1         
	//    3    5:invokeinterface #251 <Method int ExoPlayer.getSelectedTrack(int)>
	//    4   10:ireturn         
	}

	public SurfaceTexture getSurfaceTexture()
	{
		return surfaceTexture;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field SurfaceTexture surfaceTexture>
	//    2    4:areturn         
	}

	public int getTrackCount(int i)
	{
		return player.getTrackCount(i);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ExoPlayer player>
	//    2    4:iload_1         
	//    3    5:invokeinterface #256 <Method int ExoPlayer.getTrackCount(int)>
	//    4   10:ireturn         
	}

	public MediaFormat getTrackFormat(int i, int j)
	{
		return player.getTrackFormat(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ExoPlayer player>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #260 <Method MediaFormat ExoPlayer.getTrackFormat(int, int)>
	//    5   11:areturn         
	}

	public void onAudioTrackInitializationError(com.google.android.exoplayer.audio.AudioTrack.InitializationException initializationexception)
	{
		InternalErrorListener internalerrorlistener = internalErrorListener;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field ExoPlayerInterface$InternalErrorListener internalErrorListener>
	//    2    4:astore_2        
		if(internalerrorlistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			internalerrorlistener.onAudioTrackInitializationError(initializationexception);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #266 <Method void ExoPlayerInterface$InternalErrorListener.onAudioTrackInitializationError(com.google.android.exoplayer.audio.AudioTrack$InitializationException)>
	//    8   16:return          
	}

	public void onAudioTrackUnderrun(int i, long l, long l1)
	{
		InternalErrorListener internalerrorlistener = internalErrorListener;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field ExoPlayerInterface$InternalErrorListener internalErrorListener>
	//    2    4:astore          6
		if(internalerrorlistener != null)
	//*   3    6:aload           6
	//*   4    8:ifnull          22
			internalerrorlistener.onAudioTrackUnderrun(i, l, l1);
	//    5   11:aload           6
	//    6   13:iload_1         
	//    7   14:lload_2         
	//    8   15:lload           4
	//    9   17:invokeinterface #270 <Method void ExoPlayerInterface$InternalErrorListener.onAudioTrackUnderrun(int, long, long)>
	//   10   22:return          
	}

	public void onAudioTrackWriteError(com.google.android.exoplayer.audio.AudioTrack.WriteException writeexception)
	{
		InternalErrorListener internalerrorlistener = internalErrorListener;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field ExoPlayerInterface$InternalErrorListener internalErrorListener>
	//    2    4:astore_2        
		if(internalerrorlistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			internalerrorlistener.onAudioTrackWriteError(writeexception);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #274 <Method void ExoPlayerInterface$InternalErrorListener.onAudioTrackWriteError(com.google.android.exoplayer.audio.AudioTrack$WriteException)>
	//    8   16:return          
	}

	public void onAvailableRangeChanged(int i, TimeRange timerange)
	{
		InfoListener infolistener = infoListener;
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field ExoPlayerInterface$InfoListener infoListener>
	//    2    4:astore_3        
		if(infolistener != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			infolistener.onAvailableRangeChanged(i, timerange);
	//    5    9:aload_3         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:invokeinterface #280 <Method void ExoPlayerInterface$InfoListener.onAvailableRangeChanged(int, TimeRange)>
	//    9   17:return          
	}

	public void onBandwidthSample(int i, long l, long l1)
	{
		InfoListener infolistener = infoListener;
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field ExoPlayerInterface$InfoListener infoListener>
	//    2    4:astore          6
		if(infolistener != null)
	//*   3    6:aload           6
	//*   4    8:ifnull          22
			infolistener.onBandwidthSample(i, l, l1);
	//    5   11:aload           6
	//    6   13:iload_1         
	//    7   14:lload_2         
	//    8   15:lload           4
	//    9   17:invokeinterface #283 <Method void ExoPlayerInterface$InfoListener.onBandwidthSample(int, long, long)>
	//   10   22:return          
	}

	public void onCryptoError(android.media.MediaCodec.CryptoException cryptoexception)
	{
		InternalErrorListener internalerrorlistener = internalErrorListener;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field ExoPlayerInterface$InternalErrorListener internalErrorListener>
	//    2    4:astore_2        
		if(internalerrorlistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			internalerrorlistener.onCryptoError(cryptoexception);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #287 <Method void ExoPlayerInterface$InternalErrorListener.onCryptoError(android.media.MediaCodec$CryptoException)>
	//    8   16:return          
	}

	public void onCues(List list)
	{
		if(captionListener != null && getSelectedTrack(2) != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #291 <Field ExoPlayerInterface$CaptionListener captionListener>
	//*   2    4:ifnull          26
	//*   3    7:aload_0         
	//*   4    8:iconst_2        
	//*   5    9:invokevirtual   #292 <Method int getSelectedTrack(int)>
	//*   6   12:iconst_m1       
	//*   7   13:icmpeq          26
			captionListener.onCues(list);
	//    8   16:aload_0         
	//    9   17:getfield        #291 <Field ExoPlayerInterface$CaptionListener captionListener>
	//   10   20:aload_1         
	//   11   21:invokeinterface #294 <Method void ExoPlayerInterface$CaptionListener.onCues(List)>
	//   12   26:return          
	}

	public void onDecoderInitializationError(com.google.android.exoplayer.MediaCodecTrackRenderer.DecoderInitializationException decoderinitializationexception)
	{
		InternalErrorListener internalerrorlistener = internalErrorListener;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field ExoPlayerInterface$InternalErrorListener internalErrorListener>
	//    2    4:astore_2        
		if(internalerrorlistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			internalerrorlistener.onDecoderInitializationError(decoderinitializationexception);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #300 <Method void ExoPlayerInterface$InternalErrorListener.onDecoderInitializationError(com.google.android.exoplayer.MediaCodecTrackRenderer$DecoderInitializationException)>
	//    8   16:return          
	}

	public void onDecoderInitialized(String s, long l, long l1)
	{
		InfoListener infolistener = infoListener;
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field ExoPlayerInterface$InfoListener infoListener>
	//    2    4:astore          6
		if(infolistener != null)
	//*   3    6:aload           6
	//*   4    8:ifnull          22
			infolistener.onDecoderInitialized(s, l, l1);
	//    5   11:aload           6
	//    6   13:aload_1         
	//    7   14:lload_2         
	//    8   15:lload           4
	//    9   17:invokeinterface #304 <Method void ExoPlayerInterface$InfoListener.onDecoderInitialized(String, long, long)>
	//   10   22:return          
	}

	public void onDownstreamFormatChanged(int i, Format format, int j, long l)
	{
		InfoListener infolistener = infoListener;
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field ExoPlayerInterface$InfoListener infoListener>
	//    2    4:astore          6
		if(infolistener == null)
	//*   3    6:aload           6
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		if(i == 0)
	//*   6   12:iload_1         
	//*   7   13:ifne            33
		{
			videoFormat = format;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #238 <Field Format videoFormat>
			infolistener.onVideoFormatEnabled(format, j, l);
	//   11   21:aload           6
	//   12   23:aload_2         
	//   13   24:iload_3         
	//   14   25:lload           4
	//   15   27:invokeinterface #310 <Method void ExoPlayerInterface$InfoListener.onVideoFormatEnabled(Format, int, long)>
			return;
	//   16   32:return          
		}
		if(i == 1)
	//*  17   33:iload_1         
	//*  18   34:iconst_1        
	//*  19   35:icmpne          49
			infolistener.onAudioFormatEnabled(format, j, l);
	//   20   38:aload           6
	//   21   40:aload_2         
	//   22   41:iload_3         
	//   23   42:lload           4
	//   24   44:invokeinterface #313 <Method void ExoPlayerInterface$InfoListener.onAudioFormatEnabled(Format, int, long)>
	//   25   49:return          
	}

	public void onDrawnToSurface(Surface surface)
	{
	//    0    0:return          
	}

	public void onDrmKeysLoaded()
	{
	//    0    0:return          
	}

	public void onDrmSessionManagerError(Exception exception)
	{
		InternalErrorListener internalerrorlistener = internalErrorListener;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field ExoPlayerInterface$InternalErrorListener internalErrorListener>
	//    2    4:astore_2        
		if(internalerrorlistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			internalerrorlistener.onDrmSessionManagerError(exception);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #320 <Method void ExoPlayerInterface$InternalErrorListener.onDrmSessionManagerError(Exception)>
	//    8   16:return          
	}

	public void onDroppedFrames(int i, long l)
	{
		InfoListener infolistener = infoListener;
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field ExoPlayerInterface$InfoListener infoListener>
	//    2    4:astore          4
		if(infolistener != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          20
			infolistener.onDroppedFrames(i, l);
	//    5   11:aload           4
	//    6   13:iload_1         
	//    7   14:lload_2         
	//    8   15:invokeinterface #324 <Method void ExoPlayerInterface$InfoListener.onDroppedFrames(int, long)>
	//    9   20:return          
	}

	public void onLoadCanceled(int i, long l)
	{
	//    0    0:return          
	}

	public void onLoadCompleted(int i, long l, int j, int k, Format format, long l1, long l2, long l3, long l4)
	{
		InfoListener infolistener = infoListener;
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field ExoPlayerInterface$InfoListener infoListener>
	//    2    4:astore          15
		if(infolistener != null)
	//*   3    6:aload           15
	//*   4    8:ifnull          34
			infolistener.onLoadCompleted(i, l, j, k, format, l1, l2, l3, l4);
	//    5   11:aload           15
	//    6   13:iload_1         
	//    7   14:lload_2         
	//    8   15:iload           4
	//    9   17:iload           5
	//   10   19:aload           6
	//   11   21:lload           7
	//   12   23:lload           9
	//   13   25:lload           11
	//   14   27:lload           13
	//   15   29:invokeinterface #329 <Method void ExoPlayerInterface$InfoListener.onLoadCompleted(int, long, int, int, Format, long, long, long, long)>
	//   16   34:return          
	}

	public void onLoadError(int i, IOException ioexception)
	{
		InternalErrorListener internalerrorlistener = internalErrorListener;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field ExoPlayerInterface$InternalErrorListener internalErrorListener>
	//    2    4:astore_3        
		if(internalerrorlistener != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			internalerrorlistener.onLoadError(i, ioexception);
	//    5    9:aload_3         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:invokeinterface #333 <Method void ExoPlayerInterface$InternalErrorListener.onLoadError(int, IOException)>
	//    9   17:return          
	}

	public void onLoadStarted(int i, long l, int j, int k, Format format, long l1, long l2)
	{
		InfoListener infolistener = infoListener;
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field ExoPlayerInterface$InfoListener infoListener>
	//    2    4:astore          11
		if(infolistener != null)
	//*   3    6:aload           11
	//*   4    8:ifnull          30
			infolistener.onLoadStarted(i, l, j, k, format, l1, l2);
	//    5   11:aload           11
	//    6   13:iload_1         
	//    7   14:lload_2         
	//    8   15:iload           4
	//    9   17:iload           5
	//   10   19:aload           6
	//   11   21:lload           7
	//   12   23:lload           9
	//   13   25:invokeinterface #337 <Method void ExoPlayerInterface$InfoListener.onLoadStarted(int, long, int, int, Format, long, long)>
	//   14   30:return          
	}

	public volatile void onMetadata(Object obj)
	{
		onMetadata((List)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #341 <Class List>
	//    3    5:invokevirtual   #343 <Method void onMetadata(List)>
	//    4    8:return          
	}

	public void onMetadata(List list)
	{
		if(id3MetadataListener != null && getSelectedTrack(3) != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #345 <Field ExoPlayerInterface$Id3MetadataListener id3MetadataListener>
	//*   2    4:ifnull          26
	//*   3    7:aload_0         
	//*   4    8:iconst_3        
	//*   5    9:invokevirtual   #292 <Method int getSelectedTrack(int)>
	//*   6   12:iconst_m1       
	//*   7   13:icmpeq          26
			id3MetadataListener.onId3Metadata(list);
	//    8   16:aload_0         
	//    9   17:getfield        #345 <Field ExoPlayerInterface$Id3MetadataListener id3MetadataListener>
	//   10   20:aload_1         
	//   11   21:invokeinterface #348 <Method void ExoPlayerInterface$Id3MetadataListener.onId3Metadata(List)>
	//   12   26:return          
	}

	public void onPlayWhenReadyCommitted()
	{
	//    0    0:return          
	}

	public void onPlayerError(ExoPlaybackException exoplaybackexception)
	{
		rendererBuildingState = 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #152 <Field int rendererBuildingState>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onError(((Exception) (exoplaybackexception))));
	//    3    5:aload_0         
	//    4    6:getfield        #148 <Field CopyOnWriteArrayList listeners>
	//    5    9:invokevirtual   #172 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    6   12:astore_2        
	//    7   13:aload_2         
	//    8   14:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            40
	//   10   22:aload_2         
	//   11   23:invokeinterface #181 <Method Object Iterator.next()>
	//   12   28:checkcast       #45  <Class ExoPlayerInterface$Listener>
	//   13   31:aload_1         
	//   14   32:invokeinterface #355 <Method void ExoPlayerInterface$Listener.onError(Exception)>
	//*  15   37:goto            13
	//   16   40:return          
	}

	public void onPlayerStateChanged(boolean flag, int i)
	{
		maybeReportPlayerState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #358 <Method void maybeReportPlayerState()>
	//    2    4:return          
	}

	void onRenderers(TrackRenderer atrackrenderer[], BandwidthMeter bandwidthmeter)
	{
		for(int i = 0; i < 4; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:iconst_4        
	//*   4    4:icmpge          30
			if(atrackrenderer[i] == null)
	//*   5    7:aload_1         
	//*   6    8:iload_3         
	//*   7    9:aaload          
	//*   8   10:ifnonnull       23
				atrackrenderer[i] = ((TrackRenderer) (new DummyTrackRenderer()));
	//    9   13:aload_1         
	//   10   14:iload_3         
	//   11   15:new             #362 <Class DummyTrackRenderer>
	//   12   18:dup             
	//   13   19:invokespecial   #363 <Method void DummyTrackRenderer()>
	//   14   22:aastore         

	//   15   23:iload_3         
	//   16   24:iconst_1        
	//   17   25:iadd            
	//   18   26:istore_3        
	//*  19   27:goto            2
		videoRenderer = atrackrenderer[0];
	//   20   30:aload_0         
	//   21   31:aload_1         
	//   22   32:iconst_0        
	//   23   33:aaload          
	//   24   34:putfield        #189 <Field TrackRenderer videoRenderer>
		audioRenderer = atrackrenderer[1];
	//   25   37:aload_0         
	//   26   38:aload_1         
	//   27   39:iconst_1        
	//   28   40:aaload          
	//   29   41:putfield        #365 <Field TrackRenderer audioRenderer>
		Object obj = ((Object) (videoRenderer));
	//   30   44:aload_0         
	//   31   45:getfield        #189 <Field TrackRenderer videoRenderer>
	//   32   48:astore          4
		if(obj instanceof MediaCodecTrackRenderer)
	//*  33   50:aload           4
	//*  34   52:instanceof      #367 <Class MediaCodecTrackRenderer>
	//*  35   55:ifeq            71
			obj = ((Object) (((MediaCodecTrackRenderer)obj).codecCounters));
	//   36   58:aload           4
	//   37   60:checkcast       #367 <Class MediaCodecTrackRenderer>
	//   38   63:getfield        #368 <Field CodecCounters MediaCodecTrackRenderer.codecCounters>
	//   39   66:astore          4
		else
	//*  40   68:goto            97
		if(atrackrenderer[1] instanceof MediaCodecTrackRenderer)
	//*  41   71:aload_1         
	//*  42   72:iconst_1        
	//*  43   73:aaload          
	//*  44   74:instanceof      #367 <Class MediaCodecTrackRenderer>
	//*  45   77:ifeq            94
			obj = ((Object) (((MediaCodecTrackRenderer)atrackrenderer[1]).codecCounters));
	//   46   80:aload_1         
	//   47   81:iconst_1        
	//   48   82:aaload          
	//   49   83:checkcast       #367 <Class MediaCodecTrackRenderer>
	//   50   86:getfield        #368 <Field CodecCounters MediaCodecTrackRenderer.codecCounters>
	//   51   89:astore          4
		else
	//*  52   91:goto            97
			obj = null;
	//   53   94:aconst_null     
	//   54   95:astore          4
		codecCounters = ((CodecCounters) (obj));
	//   55   97:aload_0         
	//   56   98:aload           4
	//   57  100:putfield        #225 <Field CodecCounters codecCounters>
		bandwidthMeter = bandwidthmeter;
	//   58  103:aload_0         
	//   59  104:aload_2         
	//   60  105:putfield        #218 <Field BandwidthMeter bandwidthMeter>
		pushSurface(false);
	//   61  108:aload_0         
	//   62  109:iconst_0        
	//   63  110:invokespecial   #211 <Method void pushSurface(boolean)>
		player.prepare(atrackrenderer);
	//   64  113:aload_0         
	//   65  114:getfield        #125 <Field ExoPlayer player>
	//   66  117:aload_1         
	//   67  118:invokeinterface #372 <Method void ExoPlayer.prepare(TrackRenderer[])>
		rendererBuildingState = 3;
	//   68  123:aload_0         
	//   69  124:iconst_3        
	//   70  125:putfield        #152 <Field int rendererBuildingState>
	//   71  128:return          
	}

	void onRenderersError(Exception exception)
	{
		InternalErrorListener internalerrorlistener = internalErrorListener;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field ExoPlayerInterface$InternalErrorListener internalErrorListener>
	//    2    4:astore_2        
		if(internalerrorlistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			internalerrorlistener.onRendererInitializationError(exception);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #376 <Method void ExoPlayerInterface$InternalErrorListener.onRendererInitializationError(Exception)>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onError(exception));
	//    8   16:aload_0         
	//    9   17:getfield        #148 <Field CopyOnWriteArrayList listeners>
	//   10   20:invokevirtual   #172 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   11   23:astore_2        
	//   12   24:aload_2         
	//   13   25:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   14   30:ifeq            51
	//   15   33:aload_2         
	//   16   34:invokeinterface #181 <Method Object Iterator.next()>
	//   17   39:checkcast       #45  <Class ExoPlayerInterface$Listener>
	//   18   42:aload_1         
	//   19   43:invokeinterface #355 <Method void ExoPlayerInterface$Listener.onError(Exception)>
	//*  20   48:goto            24
		rendererBuildingState = 1;
	//   21   51:aload_0         
	//   22   52:iconst_1        
	//   23   53:putfield        #152 <Field int rendererBuildingState>
		maybeReportPlayerState();
	//   24   56:aload_0         
	//   25   57:invokespecial   #358 <Method void maybeReportPlayerState()>
	//   26   60:return          
	}

	public void onUpstreamDiscarded(int i, long l, long l1)
	{
	//    0    0:return          
	}

	public void onVideoSizeChanged(int i, int j, int k, float f)
	{
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onVideoSizeChanged(i, j, k, f));
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field CopyOnWriteArrayList listeners>
	//    2    4:invokevirtual   #172 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore          5
	//    4    9:aload           5
	//    5   11:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            42
	//    7   19:aload           5
	//    8   21:invokeinterface #181 <Method Object Iterator.next()>
	//    9   26:checkcast       #45  <Class ExoPlayerInterface$Listener>
	//   10   29:iload_1         
	//   11   30:iload_2         
	//   12   31:iload_3         
	//   13   32:fload           4
	//   14   34:invokeinterface #381 <Method void ExoPlayerInterface$Listener.onVideoSizeChanged(int, int, int, float)>
	//*  15   39:goto            9
	//   16   42:return          
	}

	public void prepare()
	{
		if(rendererBuildingState == 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field int rendererBuildingState>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          17
			player.stop();
	//    4    8:aload_0         
	//    5    9:getfield        #125 <Field ExoPlayer player>
	//    6   12:invokeinterface #384 <Method void ExoPlayer.stop()>
		rendererBuilder.cancel();
	//    7   17:aload_0         
	//    8   18:getfield        #117 <Field ExoPlayerInterface$RendererBuilder rendererBuilder>
	//    9   21:invokeinterface #387 <Method void ExoPlayerInterface$RendererBuilder.cancel()>
		videoFormat = null;
	//   10   26:aload_0         
	//   11   27:aconst_null     
	//   12   28:putfield        #238 <Field Format videoFormat>
		videoRenderer = null;
	//   13   31:aload_0         
	//   14   32:aconst_null     
	//   15   33:putfield        #189 <Field TrackRenderer videoRenderer>
		audioRenderer = null;
	//   16   36:aload_0         
	//   17   37:aconst_null     
	//   18   38:putfield        #365 <Field TrackRenderer audioRenderer>
		rendererBuildingState = 2;
	//   19   41:aload_0         
	//   20   42:iconst_2        
	//   21   43:putfield        #152 <Field int rendererBuildingState>
		maybeReportPlayerState();
	//   22   46:aload_0         
	//   23   47:invokespecial   #358 <Method void maybeReportPlayerState()>
		rendererBuilder.buildRenderers(this);
	//   24   50:aload_0         
	//   25   51:getfield        #117 <Field ExoPlayerInterface$RendererBuilder rendererBuilder>
	//   26   54:aload_0         
	//   27   55:invokeinterface #391 <Method void ExoPlayerInterface$RendererBuilder.buildRenderers(ExoPlayerInterface)>
	//   28   60:return          
	}

	public void release()
	{
		rendererBuilder.cancel();
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field ExoPlayerInterface$RendererBuilder rendererBuilder>
	//    2    4:invokeinterface #387 <Method void ExoPlayerInterface$RendererBuilder.cancel()>
		rendererBuildingState = 1;
	//    3    9:aload_0         
	//    4   10:iconst_1        
	//    5   11:putfield        #152 <Field int rendererBuildingState>
		surfaceTexture = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #191 <Field SurfaceTexture surfaceTexture>
		player.release();
	//    9   19:aload_0         
	//   10   20:getfield        #125 <Field ExoPlayer player>
	//   11   23:invokeinterface #394 <Method void ExoPlayer.release()>
		PlayerView playerview = currentPlayerView;
	//   12   28:aload_0         
	//   13   29:getfield        #396 <Field PlayerView currentPlayerView>
	//   14   32:astore_1        
		if(playerview != null)
	//*  15   33:aload_1         
	//*  16   34:ifnull          41
			playerview.releaseVideoTexture();
	//   17   37:aload_1         
	//   18   38:invokevirtual   #401 <Method void PlayerView.releaseVideoTexture()>
	//   19   41:return          
	}

	public void removeListener(Listener listener)
	{
		listeners.remove(((Object) (listener)));
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field CopyOnWriteArrayList listeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #405 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void seekTo(long l)
	{
		player.seekTo(l);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ExoPlayer player>
	//    2    4:lload_1         
	//    3    5:invokeinterface #409 <Method void ExoPlayer.seekTo(long)>
	//    4   10:return          
	}

	public void setBackgrounded(boolean flag)
	{
		if(backgrounded == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #214 <Field boolean backgrounded>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		backgrounded = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #214 <Field boolean backgrounded>
		if(flag)
	//*   8   14:iload_1         
	//*   9   15:ifeq            38
		{
			videoTrackToRestore = getSelectedTrack(0);
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #292 <Method int getSelectedTrack(int)>
	//   14   24:putfield        #412 <Field int videoTrackToRestore>
			setSelectedTrack(0, -1);
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:iconst_m1       
	//   18   30:invokevirtual   #413 <Method void setSelectedTrack(int, int)>
			blockingClearSurface();
	//   19   33:aload_0         
	//   20   34:invokevirtual   #415 <Method void blockingClearSurface()>
			return;
	//   21   37:return          
		} else
		{
			setSelectedTrack(0, videoTrackToRestore);
	//   22   38:aload_0         
	//   23   39:iconst_0        
	//   24   40:aload_0         
	//   25   41:getfield        #412 <Field int videoTrackToRestore>
	//   26   44:invokevirtual   #413 <Method void setSelectedTrack(int, int)>
			return;
	//   27   47:return          
		}
	}

	public void setCaptionListener(CaptionListener captionlistener)
	{
		captionListener = captionlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #291 <Field ExoPlayerInterface$CaptionListener captionListener>
	//    3    5:return          
	}

	public void setInfoListener(InfoListener infolistener)
	{
		infoListener = infolistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #278 <Field ExoPlayerInterface$InfoListener infoListener>
	//    3    5:return          
	}

	public void setInternalErrorListener(InternalErrorListener internalerrorlistener)
	{
		internalErrorListener = internalerrorlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #264 <Field ExoPlayerInterface$InternalErrorListener internalErrorListener>
	//    3    5:return          
	}

	public void setMetadataListener(Id3MetadataListener id3metadatalistener)
	{
		id3MetadataListener = id3metadatalistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #345 <Field ExoPlayerInterface$Id3MetadataListener id3MetadataListener>
	//    3    5:return          
	}

	public void setMute(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
		{
			setVolume(0.0F);
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:invokevirtual   #428 <Method void setVolume(float)>
			return;
	//    5    9:return          
		} else
		{
			setVolume(1.0F);
	//    6   10:aload_0         
	//    7   11:fconst_1        
	//    8   12:invokevirtual   #428 <Method void setVolume(float)>
			return;
	//    9   15:return          
		}
	}

	public void setPlayWhenReady(boolean flag)
	{
		player.setPlayWhenReady(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ExoPlayer player>
	//    2    4:iload_1         
	//    3    5:invokeinterface #431 <Method void ExoPlayer.setPlayWhenReady(boolean)>
	//    4   10:return          
	}

	public void setSelectedTrack(int i, int j)
	{
		player.setSelectedTrack(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ExoPlayer player>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #156 <Method void ExoPlayer.setSelectedTrack(int, int)>
		if(i == 2 && j < 0)
	//*   5   11:iload_1         
	//*   6   12:iconst_2        
	//*   7   13:icmpne          38
	//*   8   16:iload_2         
	//*   9   17:ifge            38
		{
			CaptionListener captionlistener = captionListener;
	//   10   20:aload_0         
	//   11   21:getfield        #291 <Field ExoPlayerInterface$CaptionListener captionListener>
	//   12   24:astore_3        
			if(captionlistener != null)
	//*  13   25:aload_3         
	//*  14   26:ifnull          38
				captionlistener.onCues(Collections.emptyList());
	//   15   29:aload_3         
	//   16   30:invokestatic    #437 <Method List Collections.emptyList()>
	//   17   33:invokeinterface #294 <Method void ExoPlayerInterface$CaptionListener.onCues(List)>
		}
	//   18   38:return          
	}

	public void setSurfaceTexture(SurfaceTexture surfacetexture)
	{
		surfaceTexture = surfacetexture;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #191 <Field SurfaceTexture surfaceTexture>
		pushSurface(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokespecial   #211 <Method void pushSurface(boolean)>
	//    6   10:return          
	}

	public void setVolume(float f)
	{
		ExoPlayer exoplayer = player;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ExoPlayer player>
	//    2    4:astore_2        
		if(exoplayer != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
		{
			TrackRenderer trackrenderer = audioRenderer;
	//    5    9:aload_0         
	//    6   10:getfield        #365 <Field TrackRenderer audioRenderer>
	//    7   13:astore_3        
			if(trackrenderer != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          30
				exoplayer.sendMessage(((com.google.android.exoplayer.ExoPlayer.ExoPlayerComponent) (trackrenderer)), 1, ((Object) (Float.valueOf(f))));
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:iconst_1        
	//   13   21:fload_1         
	//   14   22:invokestatic    #444 <Method Float Float.valueOf(float)>
	//   15   25:invokeinterface #203 <Method void ExoPlayer.sendMessage(com.google.android.exoplayer.ExoPlayer$ExoPlayerComponent, int, Object)>
		}
	//   16   30:return          
	}

	public void switchPlayerView(PlayerView playerview)
	{
		PlayerView playerview1 = currentPlayerView;
	//    0    0:aload_0         
	//    1    1:getfield        #396 <Field PlayerView currentPlayerView>
	//    2    4:astore_2        
		if(playerview1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			playerview1.releaseVideoTexture();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #401 <Method void PlayerView.releaseVideoTexture()>
		currentPlayerView = playerview;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #396 <Field PlayerView currentPlayerView>
	//   10   18:return          
	}

	private static final int RENDERER_BUILDING_STATE_BUILDING = 2;
	private static final int RENDERER_BUILDING_STATE_BUILT = 3;
	private static final int RENDERER_BUILDING_STATE_IDLE = 1;
	public static final int RENDERER_COUNT = 4;
	public static final int STATE_BUFFERING = 3;
	public static final int STATE_ENDED = 5;
	public static final int STATE_IDLE = 1;
	public static final int STATE_PREPARING = 2;
	public static final int STATE_READY = 4;
	public static final int TRACK_DEFAULT = 0;
	public static final int TRACK_DISABLED = -1;
	public static final int TYPE_AUDIO = 1;
	public static final int TYPE_METADATA = 3;
	public static final int TYPE_TEXT = 2;
	public static final int TYPE_VIDEO = 0;
	private TrackRenderer audioRenderer;
	private boolean backgrounded;
	private BandwidthMeter bandwidthMeter;
	private CaptionListener captionListener;
	private CodecCounters codecCounters;
	private PlayerView currentPlayerView;
	private Id3MetadataListener id3MetadataListener;
	private InfoListener infoListener;
	private InternalErrorListener internalErrorListener;
	private boolean lastReportedPlayWhenReady;
	private int lastReportedPlaybackState;
	private final CopyOnWriteArrayList listeners = new CopyOnWriteArrayList();
	private final Handler mainHandler = new Handler();
	private final ExoPlayer player = com.google.android.exoplayer.ExoPlayer.Factory.newInstance(4, 1000, 5000);
	private final PlayerControl playerControl;
	private final RendererBuilder rendererBuilder;
	private int rendererBuildingState;
	private SurfaceTexture surfaceTexture;
	private Format videoFormat;
	private TrackRenderer videoRenderer;
	private int videoTrackToRestore;
}
