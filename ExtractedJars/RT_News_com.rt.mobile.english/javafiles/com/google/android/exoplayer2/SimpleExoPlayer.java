// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.*;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.exoplayer2:
//			ExoPlayer, RenderersFactory, Renderer, PlayerMessage, 
//			ExoPlayerImpl, PlaybackParameters, Format, LoadControl, 
//			Timeline, ExoPlaybackException, SeekParameters

public class SimpleExoPlayer
	implements ExoPlayer, Player.VideoComponent, Player.TextComponent
{
	private final class ComponentListener
		implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener
	{

		public void onAudioDecoderInitialized(String s, long l, long l1)
		{
			for(Iterator iterator = audioDebugListeners.iterator(); iterator.hasNext(); ((AudioRendererEventListener)iterator.next()).onAudioDecoderInitialized(s, l, l1));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:invokestatic    #38  <Method CopyOnWriteArraySet SimpleExoPlayer.access$700(SimpleExoPlayer)>
		//    3    7:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//    4   10:astore          6
		//    5   12:aload           6
		//    6   14:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//    7   19:ifeq            44
		//    8   22:aload           6
		//    9   24:invokeinterface #54  <Method Object Iterator.next()>
		//   10   29:checkcast       #8   <Class AudioRendererEventListener>
		//   11   32:aload_1         
		//   12   33:lload_2         
		//   13   34:lload           4
		//   14   36:invokeinterface #56  <Method void AudioRendererEventListener.onAudioDecoderInitialized(String, long, long)>
		//*  15   41:goto            12
		//   16   44:return          
		}

		public void onAudioDisabled(DecoderCounters decodercounters)
		{
			for(Iterator iterator = audioDebugListeners.iterator(); iterator.hasNext(); ((AudioRendererEventListener)iterator.next()).onAudioDisabled(decodercounters));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:invokestatic    #38  <Method CopyOnWriteArraySet SimpleExoPlayer.access$700(SimpleExoPlayer)>
		//    3    7:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//    4   10:astore_2        
		//    5   11:aload_2         
		//    6   12:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//    7   17:ifeq            38
		//    8   20:aload_2         
		//    9   21:invokeinterface #54  <Method Object Iterator.next()>
		//   10   26:checkcast       #8   <Class AudioRendererEventListener>
		//   11   29:aload_1         
		//   12   30:invokeinterface #60  <Method void AudioRendererEventListener.onAudioDisabled(DecoderCounters)>
		//*  13   35:goto            11
			audioFormat = null;
		//   14   38:aload_0         
		//   15   39:getfield        #25  <Field SimpleExoPlayer this$0>
		//   16   42:aconst_null     
		//   17   43:invokestatic    #64  <Method Format SimpleExoPlayer.access$902(SimpleExoPlayer, Format)>
		//   18   46:pop             
			audioDecoderCounters = null;
		//   19   47:aload_0         
		//   20   48:getfield        #25  <Field SimpleExoPlayer this$0>
		//   21   51:aconst_null     
		//   22   52:invokestatic    #68  <Method DecoderCounters SimpleExoPlayer.access$602(SimpleExoPlayer, DecoderCounters)>
		//   23   55:pop             
			audioSessionId = 0;
		//   24   56:aload_0         
		//   25   57:getfield        #25  <Field SimpleExoPlayer this$0>
		//   26   60:iconst_0        
		//   27   61:invokestatic    #72  <Method int SimpleExoPlayer.access$802(SimpleExoPlayer, int)>
		//   28   64:pop             
		//   29   65:return          
		}

		public void onAudioEnabled(DecoderCounters decodercounters)
		{
			audioDecoderCounters = decodercounters;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #68  <Method DecoderCounters SimpleExoPlayer.access$602(SimpleExoPlayer, DecoderCounters)>
		//    4    8:pop             
			for(Iterator iterator = audioDebugListeners.iterator(); iterator.hasNext(); ((AudioRendererEventListener)iterator.next()).onAudioEnabled(decodercounters));
		//    5    9:aload_0         
		//    6   10:getfield        #25  <Field SimpleExoPlayer this$0>
		//    7   13:invokestatic    #38  <Method CopyOnWriteArraySet SimpleExoPlayer.access$700(SimpleExoPlayer)>
		//    8   16:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//    9   19:astore_2        
		//   10   20:aload_2         
		//   11   21:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//   12   26:ifeq            47
		//   13   29:aload_2         
		//   14   30:invokeinterface #54  <Method Object Iterator.next()>
		//   15   35:checkcast       #8   <Class AudioRendererEventListener>
		//   16   38:aload_1         
		//   17   39:invokeinterface #75  <Method void AudioRendererEventListener.onAudioEnabled(DecoderCounters)>
		//*  18   44:goto            20
		//   19   47:return          
		}

		public void onAudioInputFormatChanged(Format format)
		{
			audioFormat = format;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #64  <Method Format SimpleExoPlayer.access$902(SimpleExoPlayer, Format)>
		//    4    8:pop             
			for(Iterator iterator = audioDebugListeners.iterator(); iterator.hasNext(); ((AudioRendererEventListener)iterator.next()).onAudioInputFormatChanged(format));
		//    5    9:aload_0         
		//    6   10:getfield        #25  <Field SimpleExoPlayer this$0>
		//    7   13:invokestatic    #38  <Method CopyOnWriteArraySet SimpleExoPlayer.access$700(SimpleExoPlayer)>
		//    8   16:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//    9   19:astore_2        
		//   10   20:aload_2         
		//   11   21:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//   12   26:ifeq            47
		//   13   29:aload_2         
		//   14   30:invokeinterface #54  <Method Object Iterator.next()>
		//   15   35:checkcast       #8   <Class AudioRendererEventListener>
		//   16   38:aload_1         
		//   17   39:invokeinterface #79  <Method void AudioRendererEventListener.onAudioInputFormatChanged(Format)>
		//*  18   44:goto            20
		//   19   47:return          
		}

		public void onAudioSessionId(int i)
		{
			audioSessionId = i;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:iload_1         
		//    3    5:invokestatic    #72  <Method int SimpleExoPlayer.access$802(SimpleExoPlayer, int)>
		//    4    8:pop             
			for(Iterator iterator = audioDebugListeners.iterator(); iterator.hasNext(); ((AudioRendererEventListener)iterator.next()).onAudioSessionId(i));
		//    5    9:aload_0         
		//    6   10:getfield        #25  <Field SimpleExoPlayer this$0>
		//    7   13:invokestatic    #38  <Method CopyOnWriteArraySet SimpleExoPlayer.access$700(SimpleExoPlayer)>
		//    8   16:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//    9   19:astore_2        
		//   10   20:aload_2         
		//   11   21:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//   12   26:ifeq            47
		//   13   29:aload_2         
		//   14   30:invokeinterface #54  <Method Object Iterator.next()>
		//   15   35:checkcast       #8   <Class AudioRendererEventListener>
		//   16   38:iload_1         
		//   17   39:invokeinterface #83  <Method void AudioRendererEventListener.onAudioSessionId(int)>
		//*  18   44:goto            20
		//   19   47:return          
		}

		public void onAudioSinkUnderrun(int i, long l, long l1)
		{
			for(Iterator iterator = audioDebugListeners.iterator(); iterator.hasNext(); ((AudioRendererEventListener)iterator.next()).onAudioSinkUnderrun(i, l, l1));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:invokestatic    #38  <Method CopyOnWriteArraySet SimpleExoPlayer.access$700(SimpleExoPlayer)>
		//    3    7:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//    4   10:astore          6
		//    5   12:aload           6
		//    6   14:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//    7   19:ifeq            44
		//    8   22:aload           6
		//    9   24:invokeinterface #54  <Method Object Iterator.next()>
		//   10   29:checkcast       #8   <Class AudioRendererEventListener>
		//   11   32:iload_1         
		//   12   33:lload_2         
		//   13   34:lload           4
		//   14   36:invokeinterface #87  <Method void AudioRendererEventListener.onAudioSinkUnderrun(int, long, long)>
		//*  15   41:goto            12
		//   16   44:return          
		}

		public void onCues(List list)
		{
			currentCues = list;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #93  <Method List SimpleExoPlayer.access$1002(SimpleExoPlayer, List)>
		//    4    8:pop             
			for(Iterator iterator = textOutputs.iterator(); iterator.hasNext(); ((TextOutput)iterator.next()).onCues(list));
		//    5    9:aload_0         
		//    6   10:getfield        #25  <Field SimpleExoPlayer this$0>
		//    7   13:invokestatic    #96  <Method CopyOnWriteArraySet SimpleExoPlayer.access$1100(SimpleExoPlayer)>
		//    8   16:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//    9   19:astore_2        
		//   10   20:aload_2         
		//   11   21:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//   12   26:ifeq            47
		//   13   29:aload_2         
		//   14   30:invokeinterface #54  <Method Object Iterator.next()>
		//   15   35:checkcast       #10  <Class TextOutput>
		//   16   38:aload_1         
		//   17   39:invokeinterface #98  <Method void TextOutput.onCues(List)>
		//*  18   44:goto            20
		//   19   47:return          
		}

		public void onDroppedFrames(int i, long l)
		{
			for(Iterator iterator = videoDebugListeners.iterator(); iterator.hasNext(); ((VideoRendererEventListener)iterator.next()).onDroppedFrames(i, l));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:invokestatic    #105 <Method CopyOnWriteArraySet SimpleExoPlayer.access$200(SimpleExoPlayer)>
		//    3    7:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//    4   10:astore          4
		//    5   12:aload           4
		//    6   14:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//    7   19:ifeq            42
		//    8   22:aload           4
		//    9   24:invokeinterface #54  <Method Object Iterator.next()>
		//   10   29:checkcast       #6   <Class VideoRendererEventListener>
		//   11   32:iload_1         
		//   12   33:lload_2         
		//   13   34:invokeinterface #107 <Method void VideoRendererEventListener.onDroppedFrames(int, long)>
		//*  14   39:goto            12
		//   15   42:return          
		}

		public void onMetadata(Metadata metadata)
		{
			for(Iterator iterator = metadataOutputs.iterator(); iterator.hasNext(); ((MetadataOutput)iterator.next()).onMetadata(metadata));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:invokestatic    #112 <Method CopyOnWriteArraySet SimpleExoPlayer.access$1200(SimpleExoPlayer)>
		//    3    7:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//    4   10:astore_2        
		//    5   11:aload_2         
		//    6   12:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//    7   17:ifeq            38
		//    8   20:aload_2         
		//    9   21:invokeinterface #54  <Method Object Iterator.next()>
		//   10   26:checkcast       #12  <Class MetadataOutput>
		//   11   29:aload_1         
		//   12   30:invokeinterface #114 <Method void MetadataOutput.onMetadata(Metadata)>
		//*  13   35:goto            11
		//   14   38:return          
		}

		public void onRenderedFirstFrame(Surface surface1)
		{
			if(surface == surface1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//*   2    4:invokestatic    #120 <Method Surface SimpleExoPlayer.access$500(SimpleExoPlayer)>
		//*   3    7:aload_1         
		//*   4    8:if_acmpne       48
			{
				for(Iterator iterator = videoListeners.iterator(); iterator.hasNext(); ((com.google.android.exoplayer2.video.VideoListener)iterator.next()).onRenderedFirstFrame());
		//    5   11:aload_0         
		//    6   12:getfield        #25  <Field SimpleExoPlayer this$0>
		//    7   15:invokestatic    #123 <Method CopyOnWriteArraySet SimpleExoPlayer.access$400(SimpleExoPlayer)>
		//    8   18:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//    9   21:astore_2        
		//   10   22:aload_2         
		//   11   23:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//   12   28:ifeq            48
		//   13   31:aload_2         
		//   14   32:invokeinterface #54  <Method Object Iterator.next()>
		//   15   37:checkcast       #125 <Class VideoListener>
		//   16   40:invokeinterface #127 <Method void VideoListener.onRenderedFirstFrame()>
			}
		//*  17   45:goto            22
			for(Iterator iterator1 = videoDebugListeners.iterator(); iterator1.hasNext(); ((VideoRendererEventListener)iterator1.next()).onRenderedFirstFrame(surface1));
		//   18   48:aload_0         
		//   19   49:getfield        #25  <Field SimpleExoPlayer this$0>
		//   20   52:invokestatic    #105 <Method CopyOnWriteArraySet SimpleExoPlayer.access$200(SimpleExoPlayer)>
		//   21   55:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//   22   58:astore_2        
		//   23   59:aload_2         
		//   24   60:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//   25   65:ifeq            86
		//   26   68:aload_2         
		//   27   69:invokeinterface #54  <Method Object Iterator.next()>
		//   28   74:checkcast       #6   <Class VideoRendererEventListener>
		//   29   77:aload_1         
		//   30   78:invokeinterface #129 <Method void VideoRendererEventListener.onRenderedFirstFrame(Surface)>
		//*  31   83:goto            59
		//   32   86:return          
		}

		public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
		{
			setVideoSurfaceInternal(new Surface(surfacetexture), true);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:new             #133 <Class Surface>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #136 <Method void Surface(SurfaceTexture)>
		//    6   12:iconst_1        
		//    7   13:invokestatic    #140 <Method void SimpleExoPlayer.access$1300(SimpleExoPlayer, Surface, boolean)>
		//    8   16:return          
		}

		public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
		{
			setVideoSurfaceInternal(((Surface) (null)), true);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:aconst_null     
		//    3    5:iconst_1        
		//    4    6:invokestatic    #140 <Method void SimpleExoPlayer.access$1300(SimpleExoPlayer, Surface, boolean)>
			return true;
		//    5    9:iconst_1        
		//    6   10:ireturn         
		}

		public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
		{
		//    0    0:return          
		}

		public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
		{
		//    0    0:return          
		}

		public void onVideoDecoderInitialized(String s, long l, long l1)
		{
			for(Iterator iterator = videoDebugListeners.iterator(); iterator.hasNext(); ((VideoRendererEventListener)iterator.next()).onVideoDecoderInitialized(s, l, l1));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:invokestatic    #105 <Method CopyOnWriteArraySet SimpleExoPlayer.access$200(SimpleExoPlayer)>
		//    3    7:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//    4   10:astore          6
		//    5   12:aload           6
		//    6   14:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//    7   19:ifeq            44
		//    8   22:aload           6
		//    9   24:invokeinterface #54  <Method Object Iterator.next()>
		//   10   29:checkcast       #6   <Class VideoRendererEventListener>
		//   11   32:aload_1         
		//   12   33:lload_2         
		//   13   34:lload           4
		//   14   36:invokeinterface #147 <Method void VideoRendererEventListener.onVideoDecoderInitialized(String, long, long)>
		//*  15   41:goto            12
		//   16   44:return          
		}

		public void onVideoDisabled(DecoderCounters decodercounters)
		{
			for(Iterator iterator = videoDebugListeners.iterator(); iterator.hasNext(); ((VideoRendererEventListener)iterator.next()).onVideoDisabled(decodercounters));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:invokestatic    #105 <Method CopyOnWriteArraySet SimpleExoPlayer.access$200(SimpleExoPlayer)>
		//    3    7:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//    4   10:astore_2        
		//    5   11:aload_2         
		//    6   12:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//    7   17:ifeq            38
		//    8   20:aload_2         
		//    9   21:invokeinterface #54  <Method Object Iterator.next()>
		//   10   26:checkcast       #6   <Class VideoRendererEventListener>
		//   11   29:aload_1         
		//   12   30:invokeinterface #150 <Method void VideoRendererEventListener.onVideoDisabled(DecoderCounters)>
		//*  13   35:goto            11
			videoFormat = null;
		//   14   38:aload_0         
		//   15   39:getfield        #25  <Field SimpleExoPlayer this$0>
		//   16   42:aconst_null     
		//   17   43:invokestatic    #153 <Method Format SimpleExoPlayer.access$302(SimpleExoPlayer, Format)>
		//   18   46:pop             
			videoDecoderCounters = null;
		//   19   47:aload_0         
		//   20   48:getfield        #25  <Field SimpleExoPlayer this$0>
		//   21   51:aconst_null     
		//   22   52:invokestatic    #156 <Method DecoderCounters SimpleExoPlayer.access$102(SimpleExoPlayer, DecoderCounters)>
		//   23   55:pop             
		//   24   56:return          
		}

		public void onVideoEnabled(DecoderCounters decodercounters)
		{
			videoDecoderCounters = decodercounters;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #156 <Method DecoderCounters SimpleExoPlayer.access$102(SimpleExoPlayer, DecoderCounters)>
		//    4    8:pop             
			for(Iterator iterator = videoDebugListeners.iterator(); iterator.hasNext(); ((VideoRendererEventListener)iterator.next()).onVideoEnabled(decodercounters));
		//    5    9:aload_0         
		//    6   10:getfield        #25  <Field SimpleExoPlayer this$0>
		//    7   13:invokestatic    #105 <Method CopyOnWriteArraySet SimpleExoPlayer.access$200(SimpleExoPlayer)>
		//    8   16:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//    9   19:astore_2        
		//   10   20:aload_2         
		//   11   21:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//   12   26:ifeq            47
		//   13   29:aload_2         
		//   14   30:invokeinterface #54  <Method Object Iterator.next()>
		//   15   35:checkcast       #6   <Class VideoRendererEventListener>
		//   16   38:aload_1         
		//   17   39:invokeinterface #159 <Method void VideoRendererEventListener.onVideoEnabled(DecoderCounters)>
		//*  18   44:goto            20
		//   19   47:return          
		}

		public void onVideoInputFormatChanged(Format format)
		{
			videoFormat = format;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #153 <Method Format SimpleExoPlayer.access$302(SimpleExoPlayer, Format)>
		//    4    8:pop             
			for(Iterator iterator = videoDebugListeners.iterator(); iterator.hasNext(); ((VideoRendererEventListener)iterator.next()).onVideoInputFormatChanged(format));
		//    5    9:aload_0         
		//    6   10:getfield        #25  <Field SimpleExoPlayer this$0>
		//    7   13:invokestatic    #105 <Method CopyOnWriteArraySet SimpleExoPlayer.access$200(SimpleExoPlayer)>
		//    8   16:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//    9   19:astore_2        
		//   10   20:aload_2         
		//   11   21:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//   12   26:ifeq            47
		//   13   29:aload_2         
		//   14   30:invokeinterface #54  <Method Object Iterator.next()>
		//   15   35:checkcast       #6   <Class VideoRendererEventListener>
		//   16   38:aload_1         
		//   17   39:invokeinterface #162 <Method void VideoRendererEventListener.onVideoInputFormatChanged(Format)>
		//*  18   44:goto            20
		//   19   47:return          
		}

		public void onVideoSizeChanged(int i, int j, int k, float f)
		{
			for(Iterator iterator = videoListeners.iterator(); iterator.hasNext(); ((com.google.android.exoplayer2.video.VideoListener)iterator.next()).onVideoSizeChanged(i, j, k, f));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:invokestatic    #123 <Method CopyOnWriteArraySet SimpleExoPlayer.access$400(SimpleExoPlayer)>
		//    3    7:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//    4   10:astore          5
		//    5   12:aload           5
		//    6   14:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//    7   19:ifeq            45
		//    8   22:aload           5
		//    9   24:invokeinterface #54  <Method Object Iterator.next()>
		//   10   29:checkcast       #125 <Class VideoListener>
		//   11   32:iload_1         
		//   12   33:iload_2         
		//   13   34:iload_3         
		//   14   35:fload           4
		//   15   37:invokeinterface #166 <Method void VideoListener.onVideoSizeChanged(int, int, int, float)>
		//*  16   42:goto            12
			for(Iterator iterator1 = videoDebugListeners.iterator(); iterator1.hasNext(); ((VideoRendererEventListener)iterator1.next()).onVideoSizeChanged(i, j, k, f));
		//   17   45:aload_0         
		//   18   46:getfield        #25  <Field SimpleExoPlayer this$0>
		//   19   49:invokestatic    #105 <Method CopyOnWriteArraySet SimpleExoPlayer.access$200(SimpleExoPlayer)>
		//   20   52:invokevirtual   #44  <Method Iterator CopyOnWriteArraySet.iterator()>
		//   21   55:astore          5
		//   22   57:aload           5
		//   23   59:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//   24   64:ifeq            90
		//   25   67:aload           5
		//   26   69:invokeinterface #54  <Method Object Iterator.next()>
		//   27   74:checkcast       #6   <Class VideoRendererEventListener>
		//   28   77:iload_1         
		//   29   78:iload_2         
		//   30   79:iload_3         
		//   31   80:fload           4
		//   32   82:invokeinterface #167 <Method void VideoRendererEventListener.onVideoSizeChanged(int, int, int, float)>
		//*  33   87:goto            57
		//   34   90:return          
		}

		public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
		{
		//    0    0:return          
		}

		public void surfaceCreated(SurfaceHolder surfaceholder)
		{
			setVideoSurfaceInternal(surfaceholder.getSurface(), false);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:aload_1         
		//    3    5:invokeinterface #177 <Method Surface SurfaceHolder.getSurface()>
		//    4   10:iconst_0        
		//    5   11:invokestatic    #140 <Method void SimpleExoPlayer.access$1300(SimpleExoPlayer, Surface, boolean)>
		//    6   14:return          
		}

		public void surfaceDestroyed(SurfaceHolder surfaceholder)
		{
			setVideoSurfaceInternal(((Surface) (null)), false);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
		//    2    4:aconst_null     
		//    3    5:iconst_0        
		//    4    6:invokestatic    #140 <Method void SimpleExoPlayer.access$1300(SimpleExoPlayer, Surface, boolean)>
		//    5    9:return          
		}

		final SimpleExoPlayer this$0;

		private ComponentListener()
		{
			this$0 = SimpleExoPlayer.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field SimpleExoPlayer this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #28  <Method void Object()>
		//    5    9:return          
		}

	}

	public static interface VideoListener
		extends com.google.android.exoplayer2.video.VideoListener
	{
	}


	protected SimpleExoPlayer(RenderersFactory renderersfactory, TrackSelector trackselector, LoadControl loadcontrol, DrmSessionManager drmsessionmanager)
	{
		this(renderersfactory, trackselector, loadcontrol, drmsessionmanager, new com.google.android.exoplayer2.analytics.AnalyticsCollector.Factory());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:new             #77  <Class com.google.android.exoplayer2.analytics.AnalyticsCollector$Factory>
	//    6    9:dup             
	//    7   10:invokespecial   #80  <Method void com.google.android.exoplayer2.analytics.AnalyticsCollector$Factory()>
	//    8   13:invokespecial   #83  <Method void SimpleExoPlayer(RenderersFactory, TrackSelector, LoadControl, DrmSessionManager, com.google.android.exoplayer2.analytics.AnalyticsCollector$Factory)>
	//    9   16:return          
	}

	protected SimpleExoPlayer(RenderersFactory renderersfactory, TrackSelector trackselector, LoadControl loadcontrol, DrmSessionManager drmsessionmanager, com.google.android.exoplayer2.analytics.AnalyticsCollector.Factory factory)
	{
		this(renderersfactory, trackselector, loadcontrol, drmsessionmanager, factory, Clock.DEFAULT);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:getstatic       #93  <Field Clock Clock.DEFAULT>
	//    7   11:invokespecial   #96  <Method void SimpleExoPlayer(RenderersFactory, TrackSelector, LoadControl, DrmSessionManager, com.google.android.exoplayer2.analytics.AnalyticsCollector$Factory, Clock)>
	//    8   14:return          
	}

	protected SimpleExoPlayer(RenderersFactory renderersfactory, TrackSelector trackselector, LoadControl loadcontrol, DrmSessionManager drmsessionmanager, com.google.android.exoplayer2.analytics.AnalyticsCollector.Factory factory, Clock clock)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Object()>
		componentListener = new ComponentListener();
	//    2    4:aload_0         
	//    3    5:new             #14  <Class SimpleExoPlayer$ComponentListener>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #101 <Method void SimpleExoPlayer$ComponentListener(SimpleExoPlayer, SimpleExoPlayer$1)>
	//    8   14:putfield        #103 <Field SimpleExoPlayer$ComponentListener componentListener>
		videoListeners = new CopyOnWriteArraySet();
	//    9   17:aload_0         
	//   10   18:new             #105 <Class CopyOnWriteArraySet>
	//   11   21:dup             
	//   12   22:invokespecial   #106 <Method void CopyOnWriteArraySet()>
	//   13   25:putfield        #108 <Field CopyOnWriteArraySet videoListeners>
		textOutputs = new CopyOnWriteArraySet();
	//   14   28:aload_0         
	//   15   29:new             #105 <Class CopyOnWriteArraySet>
	//   16   32:dup             
	//   17   33:invokespecial   #106 <Method void CopyOnWriteArraySet()>
	//   18   36:putfield        #110 <Field CopyOnWriteArraySet textOutputs>
		metadataOutputs = new CopyOnWriteArraySet();
	//   19   39:aload_0         
	//   20   40:new             #105 <Class CopyOnWriteArraySet>
	//   21   43:dup             
	//   22   44:invokespecial   #106 <Method void CopyOnWriteArraySet()>
	//   23   47:putfield        #112 <Field CopyOnWriteArraySet metadataOutputs>
		videoDebugListeners = new CopyOnWriteArraySet();
	//   24   50:aload_0         
	//   25   51:new             #105 <Class CopyOnWriteArraySet>
	//   26   54:dup             
	//   27   55:invokespecial   #106 <Method void CopyOnWriteArraySet()>
	//   28   58:putfield        #114 <Field CopyOnWriteArraySet videoDebugListeners>
		audioDebugListeners = new CopyOnWriteArraySet();
	//   29   61:aload_0         
	//   30   62:new             #105 <Class CopyOnWriteArraySet>
	//   31   65:dup             
	//   32   66:invokespecial   #106 <Method void CopyOnWriteArraySet()>
	//   33   69:putfield        #116 <Field CopyOnWriteArraySet audioDebugListeners>
		Looper looper;
		if(Looper.myLooper() != null)
	//*  34   72:invokestatic    #122 <Method Looper Looper.myLooper()>
	//*  35   75:ifnull          86
			looper = Looper.myLooper();
	//   36   78:invokestatic    #122 <Method Looper Looper.myLooper()>
	//   37   81:astore          7
		else
	//*  38   83:goto            91
			looper = Looper.getMainLooper();
	//   39   86:invokestatic    #125 <Method Looper Looper.getMainLooper()>
	//   40   89:astore          7
		eventHandler = new Handler(looper);
	//   41   91:aload_0         
	//   42   92:new             #127 <Class Handler>
	//   43   95:dup             
	//   44   96:aload           7
	//   45   98:invokespecial   #130 <Method void Handler(Looper)>
	//   46  101:putfield        #132 <Field Handler eventHandler>
		renderers = renderersfactory.createRenderers(eventHandler, ((VideoRendererEventListener) (componentListener)), ((AudioRendererEventListener) (componentListener)), ((TextOutput) (componentListener)), ((MetadataOutput) (componentListener)), drmsessionmanager);
	//   47  104:aload_0         
	//   48  105:aload_1         
	//   49  106:aload_0         
	//   50  107:getfield        #132 <Field Handler eventHandler>
	//   51  110:aload_0         
	//   52  111:getfield        #103 <Field SimpleExoPlayer$ComponentListener componentListener>
	//   53  114:aload_0         
	//   54  115:getfield        #103 <Field SimpleExoPlayer$ComponentListener componentListener>
	//   55  118:aload_0         
	//   56  119:getfield        #103 <Field SimpleExoPlayer$ComponentListener componentListener>
	//   57  122:aload_0         
	//   58  123:getfield        #103 <Field SimpleExoPlayer$ComponentListener componentListener>
	//   59  126:aload           4
	//   60  128:invokeinterface #138 <Method Renderer[] RenderersFactory.createRenderers(Handler, VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, DrmSessionManager)>
	//   61  133:putfield        #140 <Field Renderer[] renderers>
		audioVolume = 1.0F;
	//   62  136:aload_0         
	//   63  137:fconst_1        
	//   64  138:putfield        #142 <Field float audioVolume>
		audioSessionId = 0;
	//   65  141:aload_0         
	//   66  142:iconst_0        
	//   67  143:putfield        #144 <Field int audioSessionId>
		audioAttributes = AudioAttributes.DEFAULT;
	//   68  146:aload_0         
	//   69  147:getstatic       #148 <Field AudioAttributes AudioAttributes.DEFAULT>
	//   70  150:putfield        #150 <Field AudioAttributes audioAttributes>
		videoScalingMode = 1;
	//   71  153:aload_0         
	//   72  154:iconst_1        
	//   73  155:putfield        #152 <Field int videoScalingMode>
		currentCues = Collections.emptyList();
	//   74  158:aload_0         
	//   75  159:invokestatic    #158 <Method List Collections.emptyList()>
	//   76  162:putfield        #160 <Field List currentCues>
		player = createExoPlayerImpl(renderers, trackselector, loadcontrol, clock);
	//   77  165:aload_0         
	//   78  166:aload_0         
	//   79  167:aload_0         
	//   80  168:getfield        #140 <Field Renderer[] renderers>
	//   81  171:aload_2         
	//   82  172:aload_3         
	//   83  173:aload           6
	//   84  175:invokevirtual   #164 <Method ExoPlayer createExoPlayerImpl(Renderer[], TrackSelector, LoadControl, Clock)>
	//   85  178:putfield        #166 <Field ExoPlayer player>
		analyticsCollector = factory.createAnalyticsCollector(((Player) (player)), clock);
	//   86  181:aload_0         
	//   87  182:aload           5
	//   88  184:aload_0         
	//   89  185:getfield        #166 <Field ExoPlayer player>
	//   90  188:aload           6
	//   91  190:invokevirtual   #170 <Method AnalyticsCollector com.google.android.exoplayer2.analytics.AnalyticsCollector$Factory.createAnalyticsCollector(Player, Clock)>
	//   92  193:putfield        #172 <Field AnalyticsCollector analyticsCollector>
		addListener(((Player.EventListener) (analyticsCollector)));
	//   93  196:aload_0         
	//   94  197:aload_0         
	//   95  198:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//   96  201:invokevirtual   #176 <Method void addListener(Player$EventListener)>
		videoDebugListeners.add(((Object) (analyticsCollector)));
	//   97  204:aload_0         
	//   98  205:getfield        #114 <Field CopyOnWriteArraySet videoDebugListeners>
	//   99  208:aload_0         
	//  100  209:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//  101  212:invokevirtual   #180 <Method boolean CopyOnWriteArraySet.add(Object)>
	//  102  215:pop             
		audioDebugListeners.add(((Object) (analyticsCollector)));
	//  103  216:aload_0         
	//  104  217:getfield        #116 <Field CopyOnWriteArraySet audioDebugListeners>
	//  105  220:aload_0         
	//  106  221:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//  107  224:invokevirtual   #180 <Method boolean CopyOnWriteArraySet.add(Object)>
	//  108  227:pop             
		addMetadataOutput(((MetadataOutput) (analyticsCollector)));
	//  109  228:aload_0         
	//  110  229:aload_0         
	//  111  230:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//  112  233:invokevirtual   #184 <Method void addMetadataOutput(MetadataOutput)>
		if(drmsessionmanager instanceof DefaultDrmSessionManager)
	//* 113  236:aload           4
	//* 114  238:instanceof      #186 <Class DefaultDrmSessionManager>
	//* 115  241:ifeq            260
			((DefaultDrmSessionManager)drmsessionmanager).addListener(eventHandler, ((com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener) (analyticsCollector)));
	//  116  244:aload           4
	//  117  246:checkcast       #186 <Class DefaultDrmSessionManager>
	//  118  249:aload_0         
	//  119  250:getfield        #132 <Field Handler eventHandler>
	//  120  253:aload_0         
	//  121  254:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//  122  257:invokevirtual   #189 <Method void DefaultDrmSessionManager.addListener(Handler, com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener)>
	//  123  260:return          
	}

	private void removeSurfaceCallbacks()
	{
		if(textureView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #227 <Field TextureView textureView>
	//*   2    4:ifnull          45
		{
			if(textureView.getSurfaceTextureListener() != componentListener)
	//*   3    7:aload_0         
	//*   4    8:getfield        #227 <Field TextureView textureView>
	//*   5   11:invokevirtual   #233 <Method android.view.TextureView$SurfaceTextureListener TextureView.getSurfaceTextureListener()>
	//*   6   14:aload_0         
	//*   7   15:getfield        #103 <Field SimpleExoPlayer$ComponentListener componentListener>
	//*   8   18:if_acmpeq       32
				Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
	//    9   21:ldc1            #25  <String "SimpleExoPlayer">
	//   10   23:ldc1            #235 <String "SurfaceTextureListener already unset or replaced.">
	//   11   25:invokestatic    #241 <Method int Log.w(String, String)>
	//   12   28:pop             
			else
	//*  13   29:goto            40
				textureView.setSurfaceTextureListener(((android.view.TextureView.SurfaceTextureListener) (null)));
	//   14   32:aload_0         
	//   15   33:getfield        #227 <Field TextureView textureView>
	//   16   36:aconst_null     
	//   17   37:invokevirtual   #245 <Method void TextureView.setSurfaceTextureListener(android.view.TextureView$SurfaceTextureListener)>
			textureView = null;
	//   18   40:aload_0         
	//   19   41:aconst_null     
	//   20   42:putfield        #227 <Field TextureView textureView>
		}
		if(surfaceHolder != null)
	//*  21   45:aload_0         
	//*  22   46:getfield        #247 <Field SurfaceHolder surfaceHolder>
	//*  23   49:ifnull          70
		{
			surfaceHolder.removeCallback(((android.view.SurfaceHolder.Callback) (componentListener)));
	//   24   52:aload_0         
	//   25   53:getfield        #247 <Field SurfaceHolder surfaceHolder>
	//   26   56:aload_0         
	//   27   57:getfield        #103 <Field SimpleExoPlayer$ComponentListener componentListener>
	//   28   60:invokeinterface #253 <Method void SurfaceHolder.removeCallback(android.view.SurfaceHolder$Callback)>
			surfaceHolder = null;
	//   29   65:aload_0         
	//   30   66:aconst_null     
	//   31   67:putfield        #247 <Field SurfaceHolder surfaceHolder>
		}
	//   32   70:return          
	}

	private void setVideoSurfaceInternal(Surface surface1, boolean flag)
	{
		InterruptedException interruptedexception;
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #257 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #258 <Method void ArrayList()>
	//    3    7:astore          5
		Renderer arenderer[] = renderers;
	//    4    9:aload_0         
	//    5   10:getfield        #140 <Field Renderer[] renderers>
	//    6   13:astore          6
		int i = 0;
	//    7   15:iconst_0        
	//    8   16:istore_3        
		for(int j = arenderer.length; i < j; i++)
	//*   9   17:aload           6
	//*  10   19:arraylength     
	//*  11   20:istore          4
	//*  12   22:iload_3         
	//*  13   23:iload           4
	//*  14   25:icmpge          82
		{
			Renderer renderer = arenderer[i];
	//   15   28:aload           6
	//   16   30:iload_3         
	//   17   31:aaload          
	//   18   32:astore          7
			if(renderer.getTrackType() == 2)
	//*  19   34:aload           7
	//*  20   36:invokeinterface #264 <Method int Renderer.getTrackType()>
	//*  21   41:iconst_2        
	//*  22   42:icmpne          75
				((List) (obj)).add(((Object) (player.createMessage(((PlayerMessage.Target) (renderer))).setType(1).setPayload(((Object) (surface1))).send())));
	//   23   45:aload           5
	//   24   47:aload_0         
	//   25   48:getfield        #166 <Field ExoPlayer player>
	//   26   51:aload           7
	//   27   53:invokeinterface #268 <Method PlayerMessage ExoPlayer.createMessage(PlayerMessage$Target)>
	//   28   58:iconst_1        
	//   29   59:invokevirtual   #274 <Method PlayerMessage PlayerMessage.setType(int)>
	//   30   62:aload_1         
	//   31   63:invokevirtual   #278 <Method PlayerMessage PlayerMessage.setPayload(Object)>
	//   32   66:invokevirtual   #282 <Method PlayerMessage PlayerMessage.send()>
	//   33   69:invokeinterface #285 <Method boolean List.add(Object)>
	//   34   74:pop             
		}

	//   35   75:iload_3         
	//   36   76:iconst_1        
	//   37   77:iadd            
	//   38   78:istore_3        
	//*  39   79:goto            22
		if(surface != null && surface != surface1)
	//*  40   82:aload_0         
	//*  41   83:getfield        #215 <Field Surface surface>
	//*  42   86:ifnull          153
	//*  43   89:aload_0         
	//*  44   90:getfield        #215 <Field Surface surface>
	//*  45   93:aload_1         
	//*  46   94:if_acmpeq       153
		{
			try
			{
				for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((PlayerMessage)((Iterator) (obj)).next()).blockUntilDelivered());
	//   47   97:aload           5
	//   48   99:invokeinterface #289 <Method Iterator List.iterator()>
	//   49  104:astore          5
	//   50  106:aload           5
	//   51  108:invokeinterface #295 <Method boolean Iterator.hasNext()>
	//   52  113:ifeq            139
	//   53  116:aload           5
	//   54  118:invokeinterface #299 <Method Object Iterator.next()>
	//   55  123:checkcast       #270 <Class PlayerMessage>
	//   56  126:invokevirtual   #302 <Method boolean PlayerMessage.blockUntilDelivered()>
	//   57  129:pop             
			}
	//*  58  130:goto            106
	//*  59  133:invokestatic    #308 <Method Thread Thread.currentThread()>
	//*  60  136:invokevirtual   #311 <Method void Thread.interrupt()>
	//*  61  139:aload_0         
	//*  62  140:getfield        #313 <Field boolean ownsSurface>
	//*  63  143:ifeq            153
	//*  64  146:aload_0         
	//*  65  147:getfield        #215 <Field Surface surface>
	//*  66  150:invokevirtual   #318 <Method void Surface.release()>
	//*  67  153:aload_0         
	//*  68  154:aload_1         
	//*  69  155:putfield        #215 <Field Surface surface>
	//*  70  158:aload_0         
	//*  71  159:iload_2         
	//*  72  160:putfield        #313 <Field boolean ownsSurface>
	//*  73  163:return          
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				Thread.currentThread().interrupt();
			}
			if(ownsSurface)
				surface.release();
		}
		surface = surface1;
		ownsSurface = flag;
	//*  74  164:astore          5
	//*  75  166:goto            133
	}

	public void addAnalyticsListener(AnalyticsListener analyticslistener)
	{
		analyticsCollector.addListener(analyticslistener);
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #324 <Method void AnalyticsCollector.addListener(AnalyticsListener)>
	//    4    8:return          
	}

	public void addAudioDebugListener(AudioRendererEventListener audiorenderereventlistener)
	{
		audioDebugListeners.add(((Object) (audiorenderereventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field CopyOnWriteArraySet audioDebugListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #180 <Method boolean CopyOnWriteArraySet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addListener(Player.EventListener eventlistener)
	{
		player.addListener(eventlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:aload_1         
	//    3    5:invokeinterface #329 <Method void ExoPlayer.addListener(Player$EventListener)>
	//    4   10:return          
	}

	public void addMetadataOutput(MetadataOutput metadataoutput)
	{
		metadataOutputs.add(((Object) (metadataoutput)));
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field CopyOnWriteArraySet metadataOutputs>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #180 <Method boolean CopyOnWriteArraySet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addTextOutput(TextOutput textoutput)
	{
		if(!currentCues.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field List currentCues>
	//*   2    4:invokeinterface #334 <Method boolean List.isEmpty()>
	//*   3    9:ifne            22
			textoutput.onCues(currentCues);
	//    4   12:aload_1         
	//    5   13:aload_0         
	//    6   14:getfield        #160 <Field List currentCues>
	//    7   17:invokeinterface #340 <Method void TextOutput.onCues(List)>
		textOutputs.add(((Object) (textoutput)));
	//    8   22:aload_0         
	//    9   23:getfield        #110 <Field CopyOnWriteArraySet textOutputs>
	//   10   26:aload_1         
	//   11   27:invokevirtual   #180 <Method boolean CopyOnWriteArraySet.add(Object)>
	//   12   30:pop             
	//   13   31:return          
	}

	public void addVideoDebugListener(VideoRendererEventListener videorenderereventlistener)
	{
		videoDebugListeners.add(((Object) (videorenderereventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field CopyOnWriteArraySet videoDebugListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #180 <Method boolean CopyOnWriteArraySet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addVideoListener(com.google.android.exoplayer2.video.VideoListener videolistener)
	{
		videoListeners.add(((Object) (videolistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field CopyOnWriteArraySet videoListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #180 <Method boolean CopyOnWriteArraySet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public transient void blockingSendMessages(ExoPlayer.ExoPlayerMessage aexoplayermessage[])
	{
		player.blockingSendMessages(aexoplayermessage);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:aload_1         
	//    3    5:invokeinterface #348 <Method void ExoPlayer.blockingSendMessages(ExoPlayer$ExoPlayerMessage[])>
	//    4   10:return          
	}

	public void clearMetadataOutput(MetadataOutput metadataoutput)
	{
		removeMetadataOutput(metadataoutput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #352 <Method void removeMetadataOutput(MetadataOutput)>
	//    3    5:return          
	}

	public void clearTextOutput(TextOutput textoutput)
	{
		removeTextOutput(textoutput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #356 <Method void removeTextOutput(TextOutput)>
	//    3    5:return          
	}

	public void clearVideoListener(VideoListener videolistener)
	{
		removeVideoListener(((com.google.android.exoplayer2.video.VideoListener) (videolistener)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #361 <Method void removeVideoListener(VideoListener)>
	//    3    5:return          
	}

	public void clearVideoSurface()
	{
		setVideoSurface(((Surface) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #366 <Method void setVideoSurface(Surface)>
	//    3    5:return          
	}

	public void clearVideoSurface(Surface surface1)
	{
		if(surface1 != null && surface1 == surface)
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #215 <Field Surface surface>
	//*   5    9:if_acmpne       17
			setVideoSurface(((Surface) (null)));
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #366 <Method void setVideoSurface(Surface)>
	//    9   17:return          
	}

	public void clearVideoSurfaceHolder(SurfaceHolder surfaceholder)
	{
		if(surfaceholder != null && surfaceholder == surfaceHolder)
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #247 <Field SurfaceHolder surfaceHolder>
	//*   5    9:if_acmpne       17
			setVideoSurfaceHolder(((SurfaceHolder) (null)));
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #371 <Method void setVideoSurfaceHolder(SurfaceHolder)>
	//    9   17:return          
	}

	public void clearVideoSurfaceView(SurfaceView surfaceview)
	{
		if(surfaceview == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			surfaceview = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:goto            14
			surfaceview = ((SurfaceView) (surfaceview.getHolder()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #379 <Method SurfaceHolder SurfaceView.getHolder()>
	//    7   13:astore_1        
		clearVideoSurfaceHolder(((SurfaceHolder) (surfaceview)));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #381 <Method void clearVideoSurfaceHolder(SurfaceHolder)>
	//   11   19:return          
	}

	public void clearVideoTextureView(TextureView textureview)
	{
		if(textureview != null && textureview == textureView)
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #227 <Field TextureView textureView>
	//*   5    9:if_acmpne       17
			setVideoTextureView(((TextureView) (null)));
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #386 <Method void setVideoTextureView(TextureView)>
	//    9   17:return          
	}

	protected ExoPlayer createExoPlayerImpl(Renderer arenderer[], TrackSelector trackselector, LoadControl loadcontrol, Clock clock)
	{
		return ((ExoPlayer) (new ExoPlayerImpl(arenderer, trackselector, loadcontrol, clock)));
	//    0    0:new             #388 <Class ExoPlayerImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #391 <Method void ExoPlayerImpl(Renderer[], TrackSelector, LoadControl, Clock)>
	//    7   12:areturn         
	}

	public PlayerMessage createMessage(PlayerMessage.Target target)
	{
		return player.createMessage(target);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:aload_1         
	//    3    5:invokeinterface #268 <Method PlayerMessage ExoPlayer.createMessage(PlayerMessage$Target)>
	//    4   10:areturn         
	}

	public AnalyticsCollector getAnalyticsCollector()
	{
		return analyticsCollector;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//    2    4:areturn         
	}

	public AudioAttributes getAudioAttributes()
	{
		return audioAttributes;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field AudioAttributes audioAttributes>
	//    2    4:areturn         
	}

	public DecoderCounters getAudioDecoderCounters()
	{
		return audioDecoderCounters;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field DecoderCounters audioDecoderCounters>
	//    2    4:areturn         
	}

	public Format getAudioFormat()
	{
		return audioFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field Format audioFormat>
	//    2    4:areturn         
	}

	public int getAudioSessionId()
	{
		return audioSessionId;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field int audioSessionId>
	//    2    4:ireturn         
	}

	public int getAudioStreamType()
	{
		return Util.getStreamTypeForAudioUsage(audioAttributes.usage);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field AudioAttributes audioAttributes>
	//    2    4:getfield        #404 <Field int AudioAttributes.usage>
	//    3    7:invokestatic    #410 <Method int Util.getStreamTypeForAudioUsage(int)>
	//    4   10:ireturn         
	}

	public int getBufferedPercentage()
	{
		return player.getBufferedPercentage();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #413 <Method int ExoPlayer.getBufferedPercentage()>
	//    3    9:ireturn         
	}

	public long getBufferedPosition()
	{
		return player.getBufferedPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #417 <Method long ExoPlayer.getBufferedPosition()>
	//    3    9:lreturn         
	}

	public long getContentPosition()
	{
		return player.getContentPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #420 <Method long ExoPlayer.getContentPosition()>
	//    3    9:lreturn         
	}

	public int getCurrentAdGroupIndex()
	{
		return player.getCurrentAdGroupIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #423 <Method int ExoPlayer.getCurrentAdGroupIndex()>
	//    3    9:ireturn         
	}

	public int getCurrentAdIndexInAdGroup()
	{
		return player.getCurrentAdIndexInAdGroup();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #426 <Method int ExoPlayer.getCurrentAdIndexInAdGroup()>
	//    3    9:ireturn         
	}

	public Object getCurrentManifest()
	{
		return player.getCurrentManifest();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #429 <Method Object ExoPlayer.getCurrentManifest()>
	//    3    9:areturn         
	}

	public int getCurrentPeriodIndex()
	{
		return player.getCurrentPeriodIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #432 <Method int ExoPlayer.getCurrentPeriodIndex()>
	//    3    9:ireturn         
	}

	public long getCurrentPosition()
	{
		return player.getCurrentPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #435 <Method long ExoPlayer.getCurrentPosition()>
	//    3    9:lreturn         
	}

	public Object getCurrentTag()
	{
		return player.getCurrentTag();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #438 <Method Object ExoPlayer.getCurrentTag()>
	//    3    9:areturn         
	}

	public Timeline getCurrentTimeline()
	{
		return player.getCurrentTimeline();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #443 <Method Timeline ExoPlayer.getCurrentTimeline()>
	//    3    9:areturn         
	}

	public TrackGroupArray getCurrentTrackGroups()
	{
		return player.getCurrentTrackGroups();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #447 <Method TrackGroupArray ExoPlayer.getCurrentTrackGroups()>
	//    3    9:areturn         
	}

	public TrackSelectionArray getCurrentTrackSelections()
	{
		return player.getCurrentTrackSelections();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #451 <Method TrackSelectionArray ExoPlayer.getCurrentTrackSelections()>
	//    3    9:areturn         
	}

	public int getCurrentWindowIndex()
	{
		return player.getCurrentWindowIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #454 <Method int ExoPlayer.getCurrentWindowIndex()>
	//    3    9:ireturn         
	}

	public long getDuration()
	{
		return player.getDuration();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #457 <Method long ExoPlayer.getDuration()>
	//    3    9:lreturn         
	}

	public int getNextWindowIndex()
	{
		return player.getNextWindowIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #460 <Method int ExoPlayer.getNextWindowIndex()>
	//    3    9:ireturn         
	}

	public boolean getPlayWhenReady()
	{
		return player.getPlayWhenReady();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #463 <Method boolean ExoPlayer.getPlayWhenReady()>
	//    3    9:ireturn         
	}

	public ExoPlaybackException getPlaybackError()
	{
		return player.getPlaybackError();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #467 <Method ExoPlaybackException ExoPlayer.getPlaybackError()>
	//    3    9:areturn         
	}

	public Looper getPlaybackLooper()
	{
		return player.getPlaybackLooper();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #470 <Method Looper ExoPlayer.getPlaybackLooper()>
	//    3    9:areturn         
	}

	public PlaybackParameters getPlaybackParameters()
	{
		return player.getPlaybackParameters();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #474 <Method PlaybackParameters ExoPlayer.getPlaybackParameters()>
	//    3    9:areturn         
	}

	public int getPlaybackState()
	{
		return player.getPlaybackState();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #477 <Method int ExoPlayer.getPlaybackState()>
	//    3    9:ireturn         
	}

	public int getPreviousWindowIndex()
	{
		return player.getPreviousWindowIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #480 <Method int ExoPlayer.getPreviousWindowIndex()>
	//    3    9:ireturn         
	}

	public int getRendererCount()
	{
		return player.getRendererCount();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #483 <Method int ExoPlayer.getRendererCount()>
	//    3    9:ireturn         
	}

	public int getRendererType(int i)
	{
		return player.getRendererType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:iload_1         
	//    3    5:invokeinterface #486 <Method int ExoPlayer.getRendererType(int)>
	//    4   10:ireturn         
	}

	public int getRepeatMode()
	{
		return player.getRepeatMode();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #489 <Method int ExoPlayer.getRepeatMode()>
	//    3    9:ireturn         
	}

	public boolean getShuffleModeEnabled()
	{
		return player.getShuffleModeEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #492 <Method boolean ExoPlayer.getShuffleModeEnabled()>
	//    3    9:ireturn         
	}

	public Player.TextComponent getTextComponent()
	{
		return ((Player.TextComponent) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Player.VideoComponent getVideoComponent()
	{
		return ((Player.VideoComponent) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public DecoderCounters getVideoDecoderCounters()
	{
		return videoDecoderCounters;
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field DecoderCounters videoDecoderCounters>
	//    2    4:areturn         
	}

	public Format getVideoFormat()
	{
		return videoFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field Format videoFormat>
	//    2    4:areturn         
	}

	public int getVideoScalingMode()
	{
		return videoScalingMode;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field int videoScalingMode>
	//    2    4:ireturn         
	}

	public float getVolume()
	{
		return audioVolume;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field float audioVolume>
	//    2    4:freturn         
	}

	public boolean isCurrentWindowDynamic()
	{
		return player.isCurrentWindowDynamic();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #504 <Method boolean ExoPlayer.isCurrentWindowDynamic()>
	//    3    9:ireturn         
	}

	public boolean isCurrentWindowSeekable()
	{
		return player.isCurrentWindowSeekable();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #507 <Method boolean ExoPlayer.isCurrentWindowSeekable()>
	//    3    9:ireturn         
	}

	public boolean isLoading()
	{
		return player.isLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #510 <Method boolean ExoPlayer.isLoading()>
	//    3    9:ireturn         
	}

	public boolean isPlayingAd()
	{
		return player.isPlayingAd();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #513 <Method boolean ExoPlayer.isPlayingAd()>
	//    3    9:ireturn         
	}

	public void prepare(MediaSource mediasource)
	{
		prepare(mediasource, true, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #518 <Method void prepare(MediaSource, boolean, boolean)>
	//    5    7:return          
	}

	public void prepare(MediaSource mediasource, boolean flag, boolean flag1)
	{
		if(mediaSource != mediasource)
	//*   0    0:aload_0         
	//*   1    1:getfield        #520 <Field MediaSource mediaSource>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       54
		{
			if(mediaSource != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #520 <Field MediaSource mediaSource>
	//*   6   12:ifnull          35
			{
				mediaSource.removeEventListener(((com.google.android.exoplayer2.source.MediaSourceEventListener) (analyticsCollector)));
	//    7   15:aload_0         
	//    8   16:getfield        #520 <Field MediaSource mediaSource>
	//    9   19:aload_0         
	//   10   20:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//   11   23:invokeinterface #526 <Method void MediaSource.removeEventListener(com.google.android.exoplayer2.source.MediaSourceEventListener)>
				analyticsCollector.resetForNewMediaSource();
	//   12   28:aload_0         
	//   13   29:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//   14   32:invokevirtual   #529 <Method void AnalyticsCollector.resetForNewMediaSource()>
			}
			mediasource.addEventListener(eventHandler, ((com.google.android.exoplayer2.source.MediaSourceEventListener) (analyticsCollector)));
	//   15   35:aload_1         
	//   16   36:aload_0         
	//   17   37:getfield        #132 <Field Handler eventHandler>
	//   18   40:aload_0         
	//   19   41:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//   20   44:invokeinterface #533 <Method void MediaSource.addEventListener(Handler, com.google.android.exoplayer2.source.MediaSourceEventListener)>
			mediaSource = mediasource;
	//   21   49:aload_0         
	//   22   50:aload_1         
	//   23   51:putfield        #520 <Field MediaSource mediaSource>
		}
		player.prepare(mediasource, flag, flag1);
	//   24   54:aload_0         
	//   25   55:getfield        #166 <Field ExoPlayer player>
	//   26   58:aload_1         
	//   27   59:iload_2         
	//   28   60:iload_3         
	//   29   61:invokeinterface #534 <Method void ExoPlayer.prepare(MediaSource, boolean, boolean)>
	//   30   66:return          
	}

	public void release()
	{
		player.release();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:invokeinterface #535 <Method void ExoPlayer.release()>
		removeSurfaceCallbacks();
	//    3    9:aload_0         
	//    4   10:invokespecial   #537 <Method void removeSurfaceCallbacks()>
		if(surface != null)
	//*   5   13:aload_0         
	//*   6   14:getfield        #215 <Field Surface surface>
	//*   7   17:ifnull          39
		{
			if(ownsSurface)
	//*   8   20:aload_0         
	//*   9   21:getfield        #313 <Field boolean ownsSurface>
	//*  10   24:ifeq            34
				surface.release();
	//   11   27:aload_0         
	//   12   28:getfield        #215 <Field Surface surface>
	//   13   31:invokevirtual   #318 <Method void Surface.release()>
			surface = null;
	//   14   34:aload_0         
	//   15   35:aconst_null     
	//   16   36:putfield        #215 <Field Surface surface>
		}
		if(mediaSource != null)
	//*  17   39:aload_0         
	//*  18   40:getfield        #520 <Field MediaSource mediaSource>
	//*  19   43:ifnull          59
			mediaSource.removeEventListener(((com.google.android.exoplayer2.source.MediaSourceEventListener) (analyticsCollector)));
	//   20   46:aload_0         
	//   21   47:getfield        #520 <Field MediaSource mediaSource>
	//   22   50:aload_0         
	//   23   51:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//   24   54:invokeinterface #526 <Method void MediaSource.removeEventListener(com.google.android.exoplayer2.source.MediaSourceEventListener)>
		currentCues = Collections.emptyList();
	//   25   59:aload_0         
	//   26   60:invokestatic    #158 <Method List Collections.emptyList()>
	//   27   63:putfield        #160 <Field List currentCues>
	//   28   66:return          
	}

	public void removeAnalyticsListener(AnalyticsListener analyticslistener)
	{
		analyticsCollector.removeListener(analyticslistener);
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #541 <Method void AnalyticsCollector.removeListener(AnalyticsListener)>
	//    4    8:return          
	}

	public void removeAudioDebugListener(AudioRendererEventListener audiorenderereventlistener)
	{
		audioDebugListeners.remove(((Object) (audiorenderereventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field CopyOnWriteArraySet audioDebugListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #545 <Method boolean CopyOnWriteArraySet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeListener(Player.EventListener eventlistener)
	{
		player.removeListener(eventlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:aload_1         
	//    3    5:invokeinterface #547 <Method void ExoPlayer.removeListener(Player$EventListener)>
	//    4   10:return          
	}

	public void removeMetadataOutput(MetadataOutput metadataoutput)
	{
		metadataOutputs.remove(((Object) (metadataoutput)));
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field CopyOnWriteArraySet metadataOutputs>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #545 <Method boolean CopyOnWriteArraySet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeTextOutput(TextOutput textoutput)
	{
		textOutputs.remove(((Object) (textoutput)));
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field CopyOnWriteArraySet textOutputs>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #545 <Method boolean CopyOnWriteArraySet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeVideoDebugListener(VideoRendererEventListener videorenderereventlistener)
	{
		videoDebugListeners.remove(((Object) (videorenderereventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field CopyOnWriteArraySet videoDebugListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #545 <Method boolean CopyOnWriteArraySet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeVideoListener(com.google.android.exoplayer2.video.VideoListener videolistener)
	{
		videoListeners.remove(((Object) (videolistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field CopyOnWriteArraySet videoListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #545 <Method boolean CopyOnWriteArraySet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void seekTo(int i, long l)
	{
		analyticsCollector.notifySeekStarted();
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//    2    4:invokevirtual   #553 <Method void AnalyticsCollector.notifySeekStarted()>
		player.seekTo(i, l);
	//    3    7:aload_0         
	//    4    8:getfield        #166 <Field ExoPlayer player>
	//    5   11:iload_1         
	//    6   12:lload_2         
	//    7   13:invokeinterface #555 <Method void ExoPlayer.seekTo(int, long)>
	//    8   18:return          
	}

	public void seekTo(long l)
	{
		analyticsCollector.notifySeekStarted();
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//    2    4:invokevirtual   #553 <Method void AnalyticsCollector.notifySeekStarted()>
		player.seekTo(l);
	//    3    7:aload_0         
	//    4    8:getfield        #166 <Field ExoPlayer player>
	//    5   11:lload_1         
	//    6   12:invokeinterface #558 <Method void ExoPlayer.seekTo(long)>
	//    7   17:return          
	}

	public void seekToDefaultPosition()
	{
		analyticsCollector.notifySeekStarted();
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//    2    4:invokevirtual   #553 <Method void AnalyticsCollector.notifySeekStarted()>
		player.seekToDefaultPosition();
	//    3    7:aload_0         
	//    4    8:getfield        #166 <Field ExoPlayer player>
	//    5   11:invokeinterface #561 <Method void ExoPlayer.seekToDefaultPosition()>
	//    6   16:return          
	}

	public void seekToDefaultPosition(int i)
	{
		analyticsCollector.notifySeekStarted();
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//    2    4:invokevirtual   #553 <Method void AnalyticsCollector.notifySeekStarted()>
		player.seekToDefaultPosition(i);
	//    3    7:aload_0         
	//    4    8:getfield        #166 <Field ExoPlayer player>
	//    5   11:iload_1         
	//    6   12:invokeinterface #564 <Method void ExoPlayer.seekToDefaultPosition(int)>
	//    7   17:return          
	}

	public transient void sendMessages(ExoPlayer.ExoPlayerMessage aexoplayermessage[])
	{
		player.sendMessages(aexoplayermessage);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:aload_1         
	//    3    5:invokeinterface #567 <Method void ExoPlayer.sendMessages(ExoPlayer$ExoPlayerMessage[])>
	//    4   10:return          
	}

	public void setAudioAttributes(AudioAttributes audioattributes)
	{
		audioAttributes = audioattributes;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #150 <Field AudioAttributes audioAttributes>
		Renderer arenderer[] = renderers;
	//    3    5:aload_0         
	//    4    6:getfield        #140 <Field Renderer[] renderers>
	//    5    9:astore          4
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_2        
		for(int j = arenderer.length; i < j; i++)
	//*   8   13:aload           4
	//*   9   15:arraylength     
	//*  10   16:istore_3        
	//*  11   17:iload_2         
	//*  12   18:iload_3         
	//*  13   19:icmpge          69
		{
			Renderer renderer = arenderer[i];
	//   14   22:aload           4
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:astore          5
			if(renderer.getTrackType() == 1)
	//*  18   28:aload           5
	//*  19   30:invokeinterface #264 <Method int Renderer.getTrackType()>
	//*  20   35:iconst_1        
	//*  21   36:icmpne          62
				player.createMessage(((PlayerMessage.Target) (renderer))).setType(3).setPayload(((Object) (audioattributes))).send();
	//   22   39:aload_0         
	//   23   40:getfield        #166 <Field ExoPlayer player>
	//   24   43:aload           5
	//   25   45:invokeinterface #268 <Method PlayerMessage ExoPlayer.createMessage(PlayerMessage$Target)>
	//   26   50:iconst_3        
	//   27   51:invokevirtual   #274 <Method PlayerMessage PlayerMessage.setType(int)>
	//   28   54:aload_1         
	//   29   55:invokevirtual   #278 <Method PlayerMessage PlayerMessage.setPayload(Object)>
	//   30   58:invokevirtual   #282 <Method PlayerMessage PlayerMessage.send()>
	//   31   61:pop             
		}

	//   32   62:iload_2         
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore_2        
	//*  36   66:goto            17
	//   37   69:return          
	}

	public void setAudioDebugListener(AudioRendererEventListener audiorenderereventlistener)
	{
		audioDebugListeners.retainAll(((java.util.Collection) (Collections.singleton(((Object) (analyticsCollector))))));
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field CopyOnWriteArraySet audioDebugListeners>
	//    2    4:aload_0         
	//    3    5:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//    4    8:invokestatic    #574 <Method java.util.Set Collections.singleton(Object)>
	//    5   11:invokevirtual   #578 <Method boolean CopyOnWriteArraySet.retainAll(java.util.Collection)>
	//    6   14:pop             
		if(audiorenderereventlistener != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          24
			addAudioDebugListener(audiorenderereventlistener);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #580 <Method void addAudioDebugListener(AudioRendererEventListener)>
	//   12   24:return          
	}

	public void setAudioStreamType(int i)
	{
		int j = Util.getAudioUsageForStreamType(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #584 <Method int Util.getAudioUsageForStreamType(int)>
	//    2    4:istore_2        
		i = Util.getAudioContentTypeForStreamType(i);
	//    3    5:iload_1         
	//    4    6:invokestatic    #587 <Method int Util.getAudioContentTypeForStreamType(int)>
	//    5    9:istore_1        
		setAudioAttributes((new com.google.android.exoplayer2.audio.AudioAttributes.Builder()).setUsage(j).setContentType(i).build());
	//    6   10:aload_0         
	//    7   11:new             #589 <Class com.google.android.exoplayer2.audio.AudioAttributes$Builder>
	//    8   14:dup             
	//    9   15:invokespecial   #590 <Method void com.google.android.exoplayer2.audio.AudioAttributes$Builder()>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #594 <Method com.google.android.exoplayer2.audio.AudioAttributes$Builder com.google.android.exoplayer2.audio.AudioAttributes$Builder.setUsage(int)>
	//   12   22:iload_1         
	//   13   23:invokevirtual   #597 <Method com.google.android.exoplayer2.audio.AudioAttributes$Builder com.google.android.exoplayer2.audio.AudioAttributes$Builder.setContentType(int)>
	//   14   26:invokevirtual   #600 <Method AudioAttributes com.google.android.exoplayer2.audio.AudioAttributes$Builder.build()>
	//   15   29:invokevirtual   #602 <Method void setAudioAttributes(AudioAttributes)>
	//   16   32:return          
	}

	public void setMetadataOutput(MetadataOutput metadataoutput)
	{
		metadataOutputs.retainAll(((java.util.Collection) (Collections.singleton(((Object) (analyticsCollector))))));
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field CopyOnWriteArraySet metadataOutputs>
	//    2    4:aload_0         
	//    3    5:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//    4    8:invokestatic    #574 <Method java.util.Set Collections.singleton(Object)>
	//    5   11:invokevirtual   #578 <Method boolean CopyOnWriteArraySet.retainAll(java.util.Collection)>
	//    6   14:pop             
		if(metadataoutput != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          24
			addMetadataOutput(metadataoutput);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #184 <Method void addMetadataOutput(MetadataOutput)>
	//   12   24:return          
	}

	public void setPlayWhenReady(boolean flag)
	{
		player.setPlayWhenReady(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:iload_1         
	//    3    5:invokeinterface #607 <Method void ExoPlayer.setPlayWhenReady(boolean)>
	//    4   10:return          
	}

	public void setPlaybackParameters(PlaybackParameters playbackparameters)
	{
		player.setPlaybackParameters(playbackparameters);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:aload_1         
	//    3    5:invokeinterface #611 <Method void ExoPlayer.setPlaybackParameters(PlaybackParameters)>
	//    4   10:return          
	}

	public void setPlaybackParams(PlaybackParams playbackparams)
	{
		if(playbackparams != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
		{
			playbackparams.allowDefaults();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #620 <Method PlaybackParams PlaybackParams.allowDefaults()>
	//    4    8:pop             
			playbackparams = ((PlaybackParams) (new PlaybackParameters(playbackparams.getSpeed(), playbackparams.getPitch())));
	//    5    9:new             #622 <Class PlaybackParameters>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokevirtual   #625 <Method float PlaybackParams.getSpeed()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #628 <Method float PlaybackParams.getPitch()>
	//   11   21:invokespecial   #631 <Method void PlaybackParameters(float, float)>
	//   12   24:astore_1        
		} else
	//*  13   25:goto            30
		{
			playbackparams = null;
	//   14   28:aconst_null     
	//   15   29:astore_1        
		}
		setPlaybackParameters(((PlaybackParameters) (playbackparams)));
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #632 <Method void setPlaybackParameters(PlaybackParameters)>
	//   19   35:return          
	}

	public void setRepeatMode(int i)
	{
		player.setRepeatMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:iload_1         
	//    3    5:invokeinterface #635 <Method void ExoPlayer.setRepeatMode(int)>
	//    4   10:return          
	}

	public void setSeekParameters(SeekParameters seekparameters)
	{
		player.setSeekParameters(seekparameters);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:aload_1         
	//    3    5:invokeinterface #639 <Method void ExoPlayer.setSeekParameters(SeekParameters)>
	//    4   10:return          
	}

	public void setShuffleModeEnabled(boolean flag)
	{
		player.setShuffleModeEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:iload_1         
	//    3    5:invokeinterface #642 <Method void ExoPlayer.setShuffleModeEnabled(boolean)>
	//    4   10:return          
	}

	public void setTextOutput(TextOutput textoutput)
	{
		textOutputs.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field CopyOnWriteArraySet textOutputs>
	//    2    4:invokevirtual   #646 <Method void CopyOnWriteArraySet.clear()>
		if(textoutput != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          16
			addTextOutput(textoutput);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #648 <Method void addTextOutput(TextOutput)>
	//    8   16:return          
	}

	public void setVideoDebugListener(VideoRendererEventListener videorenderereventlistener)
	{
		videoDebugListeners.retainAll(((java.util.Collection) (Collections.singleton(((Object) (analyticsCollector))))));
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field CopyOnWriteArraySet videoDebugListeners>
	//    2    4:aload_0         
	//    3    5:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//    4    8:invokestatic    #574 <Method java.util.Set Collections.singleton(Object)>
	//    5   11:invokevirtual   #578 <Method boolean CopyOnWriteArraySet.retainAll(java.util.Collection)>
	//    6   14:pop             
		if(videorenderereventlistener != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          24
			addVideoDebugListener(videorenderereventlistener);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #651 <Method void addVideoDebugListener(VideoRendererEventListener)>
	//   12   24:return          
	}

	public void setVideoListener(VideoListener videolistener)
	{
		videoListeners.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field CopyOnWriteArraySet videoListeners>
	//    2    4:invokevirtual   #646 <Method void CopyOnWriteArraySet.clear()>
		if(videolistener != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          16
			addVideoListener(((com.google.android.exoplayer2.video.VideoListener) (videolistener)));
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #654 <Method void addVideoListener(VideoListener)>
	//    8   16:return          
	}

	public void setVideoScalingMode(int i)
	{
		videoScalingMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #152 <Field int videoScalingMode>
		Renderer arenderer[] = renderers;
	//    3    5:aload_0         
	//    4    6:getfield        #140 <Field Renderer[] renderers>
	//    5    9:astore          4
		int j = 0;
	//    6   11:iconst_0        
	//    7   12:istore_2        
		for(int k = arenderer.length; j < k; j++)
	//*   8   13:aload           4
	//*   9   15:arraylength     
	//*  10   16:istore_3        
	//*  11   17:iload_2         
	//*  12   18:iload_3         
	//*  13   19:icmpge          72
		{
			Renderer renderer = arenderer[j];
	//   14   22:aload           4
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:astore          5
			if(renderer.getTrackType() == 2)
	//*  18   28:aload           5
	//*  19   30:invokeinterface #264 <Method int Renderer.getTrackType()>
	//*  20   35:iconst_2        
	//*  21   36:icmpne          65
				player.createMessage(((PlayerMessage.Target) (renderer))).setType(4).setPayload(((Object) (Integer.valueOf(i)))).send();
	//   22   39:aload_0         
	//   23   40:getfield        #166 <Field ExoPlayer player>
	//   24   43:aload           5
	//   25   45:invokeinterface #268 <Method PlayerMessage ExoPlayer.createMessage(PlayerMessage$Target)>
	//   26   50:iconst_4        
	//   27   51:invokevirtual   #274 <Method PlayerMessage PlayerMessage.setType(int)>
	//   28   54:iload_1         
	//   29   55:invokestatic    #661 <Method Integer Integer.valueOf(int)>
	//   30   58:invokevirtual   #278 <Method PlayerMessage PlayerMessage.setPayload(Object)>
	//   31   61:invokevirtual   #282 <Method PlayerMessage PlayerMessage.send()>
	//   32   64:pop             
		}

	//   33   65:iload_2         
	//   34   66:iconst_1        
	//   35   67:iadd            
	//   36   68:istore_2        
	//*  37   69:goto            17
	//   38   72:return          
	}

	public void setVideoSurface(Surface surface1)
	{
		removeSurfaceCallbacks();
	//    0    0:aload_0         
	//    1    1:invokespecial   #537 <Method void removeSurfaceCallbacks()>
		setVideoSurfaceInternal(surface1, false);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:invokespecial   #205 <Method void setVideoSurfaceInternal(Surface, boolean)>
	//    6   10:return          
	}

	public void setVideoSurfaceHolder(SurfaceHolder surfaceholder)
	{
		removeSurfaceCallbacks();
	//    0    0:aload_0         
	//    1    1:invokespecial   #537 <Method void removeSurfaceCallbacks()>
		surfaceHolder = surfaceholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #247 <Field SurfaceHolder surfaceHolder>
		if(surfaceholder == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       20
		{
			setVideoSurfaceInternal(((Surface) (null)), false);
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:iconst_0        
	//   10   16:invokespecial   #205 <Method void setVideoSurfaceInternal(Surface, boolean)>
			return;
	//   11   19:return          
		}
		surfaceholder.addCallback(((android.view.SurfaceHolder.Callback) (componentListener)));
	//   12   20:aload_1         
	//   13   21:aload_0         
	//   14   22:getfield        #103 <Field SimpleExoPlayer$ComponentListener componentListener>
	//   15   25:invokeinterface #664 <Method void SurfaceHolder.addCallback(android.view.SurfaceHolder$Callback)>
		surfaceholder = ((SurfaceHolder) (surfaceholder.getSurface()));
	//   16   30:aload_1         
	//   17   31:invokeinterface #668 <Method Surface SurfaceHolder.getSurface()>
	//   18   36:astore_1        
		if(surfaceholder == null || !((Surface) (surfaceholder)).isValid())
	//*  19   37:aload_1         
	//*  20   38:ifnull          51
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #671 <Method boolean Surface.isValid()>
	//*  23   45:ifeq            51
	//*  24   48:goto            53
			surfaceholder = null;
	//   25   51:aconst_null     
	//   26   52:astore_1        
		setVideoSurfaceInternal(((Surface) (surfaceholder)), false);
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:iconst_0        
	//   30   56:invokespecial   #205 <Method void setVideoSurfaceInternal(Surface, boolean)>
	//   31   59:return          
	}

	public void setVideoSurfaceView(SurfaceView surfaceview)
	{
		if(surfaceview == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			surfaceview = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:goto            14
			surfaceview = ((SurfaceView) (surfaceview.getHolder()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #379 <Method SurfaceHolder SurfaceView.getHolder()>
	//    7   13:astore_1        
		setVideoSurfaceHolder(((SurfaceHolder) (surfaceview)));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #371 <Method void setVideoSurfaceHolder(SurfaceHolder)>
	//   11   19:return          
	}

	public void setVideoTextureView(TextureView textureview)
	{
		removeSurfaceCallbacks();
	//    0    0:aload_0         
	//    1    1:invokespecial   #537 <Method void removeSurfaceCallbacks()>
		textureView = textureview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #227 <Field TextureView textureView>
		Object obj = null;
	//    5    9:aconst_null     
	//    6   10:astore_2        
		if(textureview == null)
	//*   7   11:aload_1         
	//*   8   12:ifnonnull       22
		{
			setVideoSurfaceInternal(((Surface) (null)), true);
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:iconst_1        
	//   12   18:invokespecial   #205 <Method void setVideoSurfaceInternal(Surface, boolean)>
			return;
	//   13   21:return          
		}
		if(textureview.getSurfaceTextureListener() != null)
	//*  14   22:aload_1         
	//*  15   23:invokevirtual   #233 <Method android.view.TextureView$SurfaceTextureListener TextureView.getSurfaceTextureListener()>
	//*  16   26:ifnull          38
			Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
	//   17   29:ldc1            #25  <String "SimpleExoPlayer">
	//   18   31:ldc2            #674 <String "Replacing existing SurfaceTextureListener.">
	//   19   34:invokestatic    #241 <Method int Log.w(String, String)>
	//   20   37:pop             
		textureview.setSurfaceTextureListener(((android.view.TextureView.SurfaceTextureListener) (componentListener)));
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #103 <Field SimpleExoPlayer$ComponentListener componentListener>
	//   24   43:invokevirtual   #245 <Method void TextureView.setSurfaceTextureListener(android.view.TextureView$SurfaceTextureListener)>
		if(textureview.isAvailable())
	//*  25   46:aload_1         
	//*  26   47:invokevirtual   #677 <Method boolean TextureView.isAvailable()>
	//*  27   50:ifeq            61
			textureview = ((TextureView) (textureview.getSurfaceTexture()));
	//   28   53:aload_1         
	//   29   54:invokevirtual   #681 <Method SurfaceTexture TextureView.getSurfaceTexture()>
	//   30   57:astore_1        
		else
	//*  31   58:goto            63
			textureview = null;
	//   32   61:aconst_null     
	//   33   62:astore_1        
		if(textureview == null)
	//*  34   63:aload_1         
	//*  35   64:ifnonnull       72
			textureview = ((TextureView) (obj));
	//   36   67:aload_2         
	//   37   68:astore_1        
		else
	//*  38   69:goto            81
			textureview = ((TextureView) (new Surface(((SurfaceTexture) (textureview)))));
	//   39   72:new             #315 <Class Surface>
	//   40   75:dup             
	//   41   76:aload_1         
	//   42   77:invokespecial   #684 <Method void Surface(SurfaceTexture)>
	//   43   80:astore_1        
		setVideoSurfaceInternal(((Surface) (textureview)), true);
	//   44   81:aload_0         
	//   45   82:aload_1         
	//   46   83:iconst_1        
	//   47   84:invokespecial   #205 <Method void setVideoSurfaceInternal(Surface, boolean)>
	//   48   87:return          
	}

	public void setVolume(float f)
	{
		audioVolume = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #142 <Field float audioVolume>
		Renderer arenderer[] = renderers;
	//    3    5:aload_0         
	//    4    6:getfield        #140 <Field Renderer[] renderers>
	//    5    9:astore          4
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_2        
		for(int j = arenderer.length; i < j; i++)
	//*   8   13:aload           4
	//*   9   15:arraylength     
	//*  10   16:istore_3        
	//*  11   17:iload_2         
	//*  12   18:iload_3         
	//*  13   19:icmpge          72
		{
			Renderer renderer = arenderer[i];
	//   14   22:aload           4
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:astore          5
			if(renderer.getTrackType() == 1)
	//*  18   28:aload           5
	//*  19   30:invokeinterface #264 <Method int Renderer.getTrackType()>
	//*  20   35:iconst_1        
	//*  21   36:icmpne          65
				player.createMessage(((PlayerMessage.Target) (renderer))).setType(2).setPayload(((Object) (Float.valueOf(f)))).send();
	//   22   39:aload_0         
	//   23   40:getfield        #166 <Field ExoPlayer player>
	//   24   43:aload           5
	//   25   45:invokeinterface #268 <Method PlayerMessage ExoPlayer.createMessage(PlayerMessage$Target)>
	//   26   50:iconst_2        
	//   27   51:invokevirtual   #274 <Method PlayerMessage PlayerMessage.setType(int)>
	//   28   54:fload_1         
	//   29   55:invokestatic    #691 <Method Float Float.valueOf(float)>
	//   30   58:invokevirtual   #278 <Method PlayerMessage PlayerMessage.setPayload(Object)>
	//   31   61:invokevirtual   #282 <Method PlayerMessage PlayerMessage.send()>
	//   32   64:pop             
		}

	//   33   65:iload_2         
	//   34   66:iconst_1        
	//   35   67:iadd            
	//   36   68:istore_2        
	//*  37   69:goto            17
	//   38   72:return          
	}

	public void stop()
	{
		stop(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #694 <Method void stop(boolean)>
	//    3    5:return          
	}

	public void stop(boolean flag)
	{
		player.stop(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ExoPlayer player>
	//    2    4:iload_1         
	//    3    5:invokeinterface #695 <Method void ExoPlayer.stop(boolean)>
		if(mediaSource != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #520 <Field MediaSource mediaSource>
	//*   6   14:ifnull          42
		{
			mediaSource.removeEventListener(((com.google.android.exoplayer2.source.MediaSourceEventListener) (analyticsCollector)));
	//    7   17:aload_0         
	//    8   18:getfield        #520 <Field MediaSource mediaSource>
	//    9   21:aload_0         
	//   10   22:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//   11   25:invokeinterface #526 <Method void MediaSource.removeEventListener(com.google.android.exoplayer2.source.MediaSourceEventListener)>
			mediaSource = null;
	//   12   30:aload_0         
	//   13   31:aconst_null     
	//   14   32:putfield        #520 <Field MediaSource mediaSource>
			analyticsCollector.resetForNewMediaSource();
	//   15   35:aload_0         
	//   16   36:getfield        #172 <Field AnalyticsCollector analyticsCollector>
	//   17   39:invokevirtual   #529 <Method void AnalyticsCollector.resetForNewMediaSource()>
		}
		currentCues = Collections.emptyList();
	//   18   42:aload_0         
	//   19   43:invokestatic    #158 <Method List Collections.emptyList()>
	//   20   46:putfield        #160 <Field List currentCues>
	//   21   49:return          
	}

	private static final String TAG = "SimpleExoPlayer";
	private final AnalyticsCollector analyticsCollector;
	private AudioAttributes audioAttributes;
	private final CopyOnWriteArraySet audioDebugListeners;
	private DecoderCounters audioDecoderCounters;
	private Format audioFormat;
	private int audioSessionId;
	private float audioVolume;
	private final ComponentListener componentListener;
	private List currentCues;
	private final Handler eventHandler;
	private MediaSource mediaSource;
	private final CopyOnWriteArraySet metadataOutputs;
	private boolean ownsSurface;
	private final ExoPlayer player;
	protected final Renderer renderers[];
	private Surface surface;
	private SurfaceHolder surfaceHolder;
	private final CopyOnWriteArraySet textOutputs;
	private TextureView textureView;
	private final CopyOnWriteArraySet videoDebugListeners;
	private DecoderCounters videoDecoderCounters;
	private Format videoFormat;
	private final CopyOnWriteArraySet videoListeners;
	private int videoScalingMode;


/*
	static List access$1002(SimpleExoPlayer simpleexoplayer, List list)
	{
		simpleexoplayer.currentCues = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #160 <Field List currentCues>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static DecoderCounters access$102(SimpleExoPlayer simpleexoplayer, DecoderCounters decodercounters)
	{
		simpleexoplayer.videoDecoderCounters = decodercounters;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #196 <Field DecoderCounters videoDecoderCounters>
		return decodercounters;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static CopyOnWriteArraySet access$1100(SimpleExoPlayer simpleexoplayer)
	{
		return simpleexoplayer.textOutputs;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field CopyOnWriteArraySet textOutputs>
	//    2    4:areturn         
	}

*/


/*
	static CopyOnWriteArraySet access$1200(SimpleExoPlayer simpleexoplayer)
	{
		return simpleexoplayer.metadataOutputs;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field CopyOnWriteArraySet metadataOutputs>
	//    2    4:areturn         
	}

*/


/*
	static void access$1300(SimpleExoPlayer simpleexoplayer, Surface surface1, boolean flag)
	{
		simpleexoplayer.setVideoSurfaceInternal(surface1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #205 <Method void setVideoSurfaceInternal(Surface, boolean)>
		return;
	//    4    6:return          
	}

*/


/*
	static CopyOnWriteArraySet access$200(SimpleExoPlayer simpleexoplayer)
	{
		return simpleexoplayer.videoDebugListeners;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field CopyOnWriteArraySet videoDebugListeners>
	//    2    4:areturn         
	}

*/


/*
	static Format access$302(SimpleExoPlayer simpleexoplayer, Format format)
	{
		simpleexoplayer.videoFormat = format;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #210 <Field Format videoFormat>
		return format;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static CopyOnWriteArraySet access$400(SimpleExoPlayer simpleexoplayer)
	{
		return simpleexoplayer.videoListeners;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field CopyOnWriteArraySet videoListeners>
	//    2    4:areturn         
	}

*/


/*
	static Surface access$500(SimpleExoPlayer simpleexoplayer)
	{
		return simpleexoplayer.surface;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field Surface surface>
	//    2    4:areturn         
	}

*/


/*
	static DecoderCounters access$602(SimpleExoPlayer simpleexoplayer, DecoderCounters decodercounters)
	{
		simpleexoplayer.audioDecoderCounters = decodercounters;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #218 <Field DecoderCounters audioDecoderCounters>
		return decodercounters;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static CopyOnWriteArraySet access$700(SimpleExoPlayer simpleexoplayer)
	{
		return simpleexoplayer.audioDebugListeners;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field CopyOnWriteArraySet audioDebugListeners>
	//    2    4:areturn         
	}

*/


/*
	static int access$802(SimpleExoPlayer simpleexoplayer, int i)
	{
		simpleexoplayer.audioSessionId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #144 <Field int audioSessionId>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static Format access$902(SimpleExoPlayer simpleexoplayer, Format format)
	{
		simpleexoplayer.audioFormat = format;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #224 <Field Format audioFormat>
		return format;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
