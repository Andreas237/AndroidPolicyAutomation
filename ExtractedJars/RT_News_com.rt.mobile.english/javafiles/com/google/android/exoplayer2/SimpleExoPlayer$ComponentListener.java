// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.exoplayer2:
//			SimpleExoPlayer, Format

private final class SimpleExoPlayer$ComponentListener
	implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, android.view.SurfaceHolder.Callback, android.view.
{

	public void onAudioDecoderInitialized(String s, long l, long l1)
	{
		for(Iterator iterator = SimpleExoPlayer.access$700(SimpleExoPlayer.this).iterator(); iterator.hasNext(); ((AudioRendererEventListener)iterator.next()).onAudioDecoderInitialized(s, l, l1));
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
		for(Iterator iterator = SimpleExoPlayer.access$700(SimpleExoPlayer.this).iterator(); iterator.hasNext(); ((AudioRendererEventListener)iterator.next()).onAudioDisabled(decodercounters));
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
		SimpleExoPlayer.access$902(SimpleExoPlayer.this, ((Format) (null)));
	//   14   38:aload_0         
	//   15   39:getfield        #25  <Field SimpleExoPlayer this$0>
	//   16   42:aconst_null     
	//   17   43:invokestatic    #64  <Method Format SimpleExoPlayer.access$902(SimpleExoPlayer, Format)>
	//   18   46:pop             
		SimpleExoPlayer.access$602(SimpleExoPlayer.this, ((DecoderCounters) (null)));
	//   19   47:aload_0         
	//   20   48:getfield        #25  <Field SimpleExoPlayer this$0>
	//   21   51:aconst_null     
	//   22   52:invokestatic    #68  <Method DecoderCounters SimpleExoPlayer.access$602(SimpleExoPlayer, DecoderCounters)>
	//   23   55:pop             
		SimpleExoPlayer.access$802(SimpleExoPlayer.this, 0);
	//   24   56:aload_0         
	//   25   57:getfield        #25  <Field SimpleExoPlayer this$0>
	//   26   60:iconst_0        
	//   27   61:invokestatic    #72  <Method int SimpleExoPlayer.access$802(SimpleExoPlayer, int)>
	//   28   64:pop             
	//   29   65:return          
	}

	public void onAudioEnabled(DecoderCounters decodercounters)
	{
		SimpleExoPlayer.access$602(SimpleExoPlayer.this, decodercounters);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #68  <Method DecoderCounters SimpleExoPlayer.access$602(SimpleExoPlayer, DecoderCounters)>
	//    4    8:pop             
		for(Iterator iterator = SimpleExoPlayer.access$700(SimpleExoPlayer.this).iterator(); iterator.hasNext(); ((AudioRendererEventListener)iterator.next()).onAudioEnabled(decodercounters));
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
		SimpleExoPlayer.access$902(SimpleExoPlayer.this, format);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #64  <Method Format SimpleExoPlayer.access$902(SimpleExoPlayer, Format)>
	//    4    8:pop             
		for(Iterator iterator = SimpleExoPlayer.access$700(SimpleExoPlayer.this).iterator(); iterator.hasNext(); ((AudioRendererEventListener)iterator.next()).onAudioInputFormatChanged(format));
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
		SimpleExoPlayer.access$802(SimpleExoPlayer.this, i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
	//    2    4:iload_1         
	//    3    5:invokestatic    #72  <Method int SimpleExoPlayer.access$802(SimpleExoPlayer, int)>
	//    4    8:pop             
		for(Iterator iterator = SimpleExoPlayer.access$700(SimpleExoPlayer.this).iterator(); iterator.hasNext(); ((AudioRendererEventListener)iterator.next()).onAudioSessionId(i));
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
		for(Iterator iterator = SimpleExoPlayer.access$700(SimpleExoPlayer.this).iterator(); iterator.hasNext(); ((AudioRendererEventListener)iterator.next()).onAudioSinkUnderrun(i, l, l1));
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
		SimpleExoPlayer.access$1002(SimpleExoPlayer.this, list);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #93  <Method List SimpleExoPlayer.access$1002(SimpleExoPlayer, List)>
	//    4    8:pop             
		for(Iterator iterator = SimpleExoPlayer.access$1100(SimpleExoPlayer.this).iterator(); iterator.hasNext(); ((TextOutput)iterator.next()).onCues(list));
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
		for(Iterator iterator = SimpleExoPlayer.access$200(SimpleExoPlayer.this).iterator(); iterator.hasNext(); ((VideoRendererEventListener)iterator.next()).onDroppedFrames(i, l));
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
		for(Iterator iterator = SimpleExoPlayer.access$1200(SimpleExoPlayer.this).iterator(); iterator.hasNext(); ((MetadataOutput)iterator.next()).onMetadata(metadata));
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

	public void onRenderedFirstFrame(Surface surface)
	{
		if(SimpleExoPlayer.access$500(SimpleExoPlayer.this) == surface)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field SimpleExoPlayer this$0>
	//*   2    4:invokestatic    #120 <Method Surface SimpleExoPlayer.access$500(SimpleExoPlayer)>
	//*   3    7:aload_1         
	//*   4    8:if_acmpne       48
		{
			for(Iterator iterator = SimpleExoPlayer.access$400(SimpleExoPlayer.this).iterator(); iterator.hasNext(); ((VideoListener)iterator.next()).onRenderedFirstFrame());
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
		for(Iterator iterator1 = SimpleExoPlayer.access$200(SimpleExoPlayer.this).iterator(); iterator1.hasNext(); ((VideoRendererEventListener)iterator1.next()).onRenderedFirstFrame(surface));
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
		SimpleExoPlayer.access$1300(SimpleExoPlayer.this, new Surface(surfacetexture), true);
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
		SimpleExoPlayer.access$1300(SimpleExoPlayer.this, ((Surface) (null)), true);
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
		for(Iterator iterator = SimpleExoPlayer.access$200(SimpleExoPlayer.this).iterator(); iterator.hasNext(); ((VideoRendererEventListener)iterator.next()).onVideoDecoderInitialized(s, l, l1));
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
		for(Iterator iterator = SimpleExoPlayer.access$200(SimpleExoPlayer.this).iterator(); iterator.hasNext(); ((VideoRendererEventListener)iterator.next()).onVideoDisabled(decodercounters));
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
		SimpleExoPlayer.access$302(SimpleExoPlayer.this, ((Format) (null)));
	//   14   38:aload_0         
	//   15   39:getfield        #25  <Field SimpleExoPlayer this$0>
	//   16   42:aconst_null     
	//   17   43:invokestatic    #153 <Method Format SimpleExoPlayer.access$302(SimpleExoPlayer, Format)>
	//   18   46:pop             
		SimpleExoPlayer.access$102(SimpleExoPlayer.this, ((DecoderCounters) (null)));
	//   19   47:aload_0         
	//   20   48:getfield        #25  <Field SimpleExoPlayer this$0>
	//   21   51:aconst_null     
	//   22   52:invokestatic    #156 <Method DecoderCounters SimpleExoPlayer.access$102(SimpleExoPlayer, DecoderCounters)>
	//   23   55:pop             
	//   24   56:return          
	}

	public void onVideoEnabled(DecoderCounters decodercounters)
	{
		SimpleExoPlayer.access$102(SimpleExoPlayer.this, decodercounters);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #156 <Method DecoderCounters SimpleExoPlayer.access$102(SimpleExoPlayer, DecoderCounters)>
	//    4    8:pop             
		for(Iterator iterator = SimpleExoPlayer.access$200(SimpleExoPlayer.this).iterator(); iterator.hasNext(); ((VideoRendererEventListener)iterator.next()).onVideoEnabled(decodercounters));
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
		SimpleExoPlayer.access$302(SimpleExoPlayer.this, format);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #153 <Method Format SimpleExoPlayer.access$302(SimpleExoPlayer, Format)>
	//    4    8:pop             
		for(Iterator iterator = SimpleExoPlayer.access$200(SimpleExoPlayer.this).iterator(); iterator.hasNext(); ((VideoRendererEventListener)iterator.next()).onVideoInputFormatChanged(format));
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
		for(Iterator iterator = SimpleExoPlayer.access$400(SimpleExoPlayer.this).iterator(); iterator.hasNext(); ((VideoListener)iterator.next()).onVideoSizeChanged(i, j, k, f));
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
		for(Iterator iterator1 = SimpleExoPlayer.access$200(SimpleExoPlayer.this).iterator(); iterator1.hasNext(); ((VideoRendererEventListener)iterator1.next()).onVideoSizeChanged(i, j, k, f));
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
		SimpleExoPlayer.access$1300(SimpleExoPlayer.this, surfaceholder.getSurface(), false);
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
		SimpleExoPlayer.access$1300(SimpleExoPlayer.this, ((Surface) (null)), false);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SimpleExoPlayer this$0>
	//    2    4:aconst_null     
	//    3    5:iconst_0        
	//    4    6:invokestatic    #140 <Method void SimpleExoPlayer.access$1300(SimpleExoPlayer, Surface, boolean)>
	//    5    9:return          
	}

	final SimpleExoPlayer this$0;

	private SimpleExoPlayer$ComponentListener()
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

	SimpleExoPlayer$ComponentListener(SimpleExoPlayer._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void SimpleExoPlayer$ComponentListener(SimpleExoPlayer)>
	//    3    5:return          
	}
}
