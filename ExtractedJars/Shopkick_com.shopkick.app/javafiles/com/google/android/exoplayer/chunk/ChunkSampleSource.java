// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer.*;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.DefaultTrackOutput;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.upstream.Loader;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.chunk:
//			ChunkOperationHolder, BaseMediaChunk, ChunkSource, Chunk, 
//			Format, MediaChunk, BaseChunkSampleSourceEventListener

public class ChunkSampleSource
	implements SampleSource, com.google.android.exoplayer.SampleSource.SampleSourceReader, com.google.android.exoplayer.upstream.Loader.Callback
{
	public static interface EventListener
		extends BaseChunkSampleSourceEventListener
	{
	}


	public ChunkSampleSource(ChunkSource chunksource, LoadControl loadcontrol, int i)
	{
		this(chunksource, loadcontrol, i, ((Handler) (null)), ((EventListener) (null)), 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:iconst_0        
	//    7    7:invokespecial   #87  <Method void ChunkSampleSource(ChunkSource, LoadControl, int, Handler, ChunkSampleSource$EventListener, int)>
	//    8   10:return          
	}

	public ChunkSampleSource(ChunkSource chunksource, LoadControl loadcontrol, int i, Handler handler, EventListener eventlistener, int j)
	{
		this(chunksource, loadcontrol, i, handler, eventlistener, j, 3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:iload           6
	//    7   10:iconst_3        
	//    8   11:invokespecial   #91  <Method void ChunkSampleSource(ChunkSource, LoadControl, int, Handler, ChunkSampleSource$EventListener, int, int)>
	//    9   14:return          
	}

	public ChunkSampleSource(ChunkSource chunksource, LoadControl loadcontrol, int i, Handler handler, EventListener eventlistener, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method void Object()>
		chunkSource = chunksource;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #96  <Field ChunkSource chunkSource>
		loadControl = loadcontrol;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #98  <Field LoadControl loadControl>
		bufferSizeContribution = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #100 <Field int bufferSizeContribution>
		eventHandler = handler;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #102 <Field Handler eventHandler>
		eventListener = eventlistener;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #104 <Field ChunkSampleSource$EventListener eventListener>
		eventSourceId = j;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #106 <Field int eventSourceId>
		minLoadableRetryCount = k;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #108 <Field int minLoadableRetryCount>
		currentLoadableHolder = new ChunkOperationHolder();
	//   23   43:aload_0         
	//   24   44:new             #110 <Class ChunkOperationHolder>
	//   25   47:dup             
	//   26   48:invokespecial   #111 <Method void ChunkOperationHolder()>
	//   27   51:putfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
		mediaChunks = new LinkedList();
	//   28   54:aload_0         
	//   29   55:new             #115 <Class LinkedList>
	//   30   58:dup             
	//   31   59:invokespecial   #116 <Method void LinkedList()>
	//   32   62:putfield        #118 <Field LinkedList mediaChunks>
		readOnlyMediaChunks = Collections.unmodifiableList(((List) (mediaChunks)));
	//   33   65:aload_0         
	//   34   66:aload_0         
	//   35   67:getfield        #118 <Field LinkedList mediaChunks>
	//   36   70:invokestatic    #124 <Method List Collections.unmodifiableList(List)>
	//   37   73:putfield        #126 <Field List readOnlyMediaChunks>
		sampleQueue = new DefaultTrackOutput(loadcontrol.getAllocator());
	//   38   76:aload_0         
	//   39   77:new             #128 <Class DefaultTrackOutput>
	//   40   80:dup             
	//   41   81:aload_2         
	//   42   82:invokeinterface #134 <Method com.google.android.exoplayer.upstream.Allocator LoadControl.getAllocator()>
	//   43   87:invokespecial   #137 <Method void DefaultTrackOutput(com.google.android.exoplayer.upstream.Allocator)>
	//   44   90:putfield        #139 <Field DefaultTrackOutput sampleQueue>
		state = 0;
	//   45   93:aload_0         
	//   46   94:iconst_0        
	//   47   95:putfield        #141 <Field int state>
		pendingResetPositionUs = 0x0L;
	//   48   98:aload_0         
	//   49   99:ldc2w           #31  <Long 0x0L>
	//   50  102:putfield        #143 <Field long pendingResetPositionUs>
	//   51  105:return          
	}

	private void clearCurrentLoadable()
	{
		currentLoadableHolder.chunk = null;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//    2    4:aconst_null     
	//    3    5:putfield        #152 <Field Chunk ChunkOperationHolder.chunk>
		clearCurrentLoadableException();
	//    4    8:aload_0         
	//    5    9:invokespecial   #155 <Method void clearCurrentLoadableException()>
	//    6   12:return          
	}

	private void clearCurrentLoadableException()
	{
		currentLoadableException = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #157 <Field IOException currentLoadableException>
		currentLoadableExceptionCount = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #159 <Field int currentLoadableExceptionCount>
	//    6   10:return          
	}

	private boolean discardUpstreamMediaChunks(int i)
	{
		if(mediaChunks.size() <= i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field LinkedList mediaChunks>
	//*   2    4:invokevirtual   #165 <Method int LinkedList.size()>
	//*   3    7:iload_1         
	//*   4    8:icmpgt          13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		long l = 0L;
	//    7   13:lconst_0        
	//    8   14:lstore_2        
		long l1 = ((BaseMediaChunk)mediaChunks.getLast()).endTimeUs;
	//    9   15:aload_0         
	//   10   16:getfield        #118 <Field LinkedList mediaChunks>
	//   11   19:invokevirtual   #169 <Method Object LinkedList.getLast()>
	//   12   22:checkcast       #171 <Class BaseMediaChunk>
	//   13   25:getfield        #174 <Field long BaseMediaChunk.endTimeUs>
	//   14   28:lstore          4
		BaseMediaChunk basemediachunk = null;
	//   15   30:aconst_null     
	//   16   31:astore          6
		while(mediaChunks.size() > i) 
	//*  17   33:aload_0         
	//*  18   34:getfield        #118 <Field LinkedList mediaChunks>
	//*  19   37:invokevirtual   #165 <Method int LinkedList.size()>
	//*  20   40:iload_1         
	//*  21   41:icmple          70
		{
			basemediachunk = (BaseMediaChunk)mediaChunks.removeLast();
	//   22   44:aload_0         
	//   23   45:getfield        #118 <Field LinkedList mediaChunks>
	//   24   48:invokevirtual   #177 <Method Object LinkedList.removeLast()>
	//   25   51:checkcast       #171 <Class BaseMediaChunk>
	//   26   54:astore          6
			l = basemediachunk.startTimeUs;
	//   27   56:aload           6
	//   28   58:getfield        #180 <Field long BaseMediaChunk.startTimeUs>
	//   29   61:lstore_2        
			loadingFinished = false;
	//   30   62:aload_0         
	//   31   63:iconst_0        
	//   32   64:putfield        #182 <Field boolean loadingFinished>
		}
	//*  33   67:goto            33
		sampleQueue.discardUpstreamSamples(basemediachunk.getFirstSampleIndex());
	//   34   70:aload_0         
	//   35   71:getfield        #139 <Field DefaultTrackOutput sampleQueue>
	//   36   74:aload           6
	//   37   76:invokevirtual   #185 <Method int BaseMediaChunk.getFirstSampleIndex()>
	//   38   79:invokevirtual   #189 <Method void DefaultTrackOutput.discardUpstreamSamples(int)>
		notifyUpstreamDiscarded(l, l1);
	//   39   82:aload_0         
	//   40   83:lload_2         
	//   41   84:lload           4
	//   42   86:invokespecial   #193 <Method void notifyUpstreamDiscarded(long, long)>
		return true;
	//   43   89:iconst_1        
	//   44   90:ireturn         
	}

	private void doChunkOperation()
	{
		Object obj = ((Object) (currentLoadableHolder));
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//    2    4:astore_3        
		obj.endOfStream = false;
	//    3    5:aload_3         
	//    4    6:iconst_0        
	//    5    7:putfield        #197 <Field boolean ChunkOperationHolder.endOfStream>
		obj.queueSize = readOnlyMediaChunks.size();
	//    6   10:aload_3         
	//    7   11:aload_0         
	//    8   12:getfield        #126 <Field List readOnlyMediaChunks>
	//    9   15:invokeinterface #200 <Method int List.size()>
	//   10   20:putfield        #203 <Field int ChunkOperationHolder.queueSize>
		obj = ((Object) (chunkSource));
	//   11   23:aload_0         
	//   12   24:getfield        #96  <Field ChunkSource chunkSource>
	//   13   27:astore_3        
		List list = readOnlyMediaChunks;
	//   14   28:aload_0         
	//   15   29:getfield        #126 <Field List readOnlyMediaChunks>
	//   16   32:astore          4
		long l = pendingResetPositionUs;
	//   17   34:aload_0         
	//   18   35:getfield        #143 <Field long pendingResetPositionUs>
	//   19   38:lstore_1        
		if(l == 0x0L)
	//*  20   39:lload_1         
	//*  21   40:ldc2w           #31  <Long 0x0L>
	//*  22   43:lcmp            
	//*  23   44:ifeq            50
	//*  24   47:goto            55
			l = downstreamPositionUs;
	//   25   50:aload_0         
	//   26   51:getfield        #205 <Field long downstreamPositionUs>
	//   27   54:lstore_1        
		((ChunkSource) (obj)).getChunkOperation(list, l, currentLoadableHolder);
	//   28   55:aload_3         
	//   29   56:aload           4
	//   30   58:lload_1         
	//   31   59:aload_0         
	//   32   60:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//   33   63:invokeinterface #211 <Method void ChunkSource.getChunkOperation(List, long, ChunkOperationHolder)>
		loadingFinished = currentLoadableHolder.endOfStream;
	//   34   68:aload_0         
	//   35   69:aload_0         
	//   36   70:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//   37   73:getfield        #197 <Field boolean ChunkOperationHolder.endOfStream>
	//   38   76:putfield        #182 <Field boolean loadingFinished>
	//   39   79:return          
	}

	private long getNextLoadPositionUs()
	{
		if(isPendingReset())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #217 <Method boolean isPendingReset()>
	//*   2    4:ifeq            12
			return pendingResetPositionUs;
	//    3    7:aload_0         
	//    4    8:getfield        #143 <Field long pendingResetPositionUs>
	//    5   11:lreturn         
		if(loadingFinished)
	//*   6   12:aload_0         
	//*   7   13:getfield        #182 <Field boolean loadingFinished>
	//*   8   16:ifeq            23
			return -1L;
	//    9   19:ldc2w           #218 <Long -1L>
	//   10   22:lreturn         
		else
			return ((BaseMediaChunk)mediaChunks.getLast()).endTimeUs;
	//   11   23:aload_0         
	//   12   24:getfield        #118 <Field LinkedList mediaChunks>
	//   13   27:invokevirtual   #169 <Method Object LinkedList.getLast()>
	//   14   30:checkcast       #171 <Class BaseMediaChunk>
	//   15   33:getfield        #174 <Field long BaseMediaChunk.endTimeUs>
	//   16   36:lreturn         
	}

	private long getRetryDelayMillis(long l)
	{
		return Math.min((l - 1L) * 1000L, 5000L);
	//    0    0:lload_1         
	//    1    1:lconst_1        
	//    2    2:lsub            
	//    3    3:ldc2w           #222 <Long 1000L>
	//    4    6:lmul            
	//    5    7:ldc2w           #224 <Long 5000L>
	//    6   10:invokestatic    #231 <Method long Math.min(long, long)>
	//    7   13:lreturn         
	}

	private boolean isMediaChunk(Chunk chunk)
	{
		return chunk instanceof BaseMediaChunk;
	//    0    0:aload_1         
	//    1    1:instanceof      #171 <Class BaseMediaChunk>
	//    2    4:ireturn         
	}

	private boolean isPendingReset()
	{
		return pendingResetPositionUs != 0x0L;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field long pendingResetPositionUs>
	//    2    4:ldc2w           #31  <Long 0x0L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private void maybeStartLoading()
	{
		Chunk chunk = currentLoadableHolder.chunk;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//    2    4:getfield        #152 <Field Chunk ChunkOperationHolder.chunk>
	//    3    7:astore_1        
		if(chunk == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		currentLoadStartTimeMs = SystemClock.elapsedRealtime();
	//    7   13:aload_0         
	//    8   14:invokestatic    #239 <Method long SystemClock.elapsedRealtime()>
	//    9   17:putfield        #241 <Field long currentLoadStartTimeMs>
		if(isMediaChunk(chunk))
	//*  10   20:aload_0         
	//*  11   21:aload_1         
	//*  12   22:invokespecial   #243 <Method boolean isMediaChunk(Chunk)>
	//*  13   25:ifeq            98
		{
			BaseMediaChunk basemediachunk = (BaseMediaChunk)chunk;
	//   14   28:aload_1         
	//   15   29:checkcast       #171 <Class BaseMediaChunk>
	//   16   32:astore_2        
			basemediachunk.init(sampleQueue);
	//   17   33:aload_2         
	//   18   34:aload_0         
	//   19   35:getfield        #139 <Field DefaultTrackOutput sampleQueue>
	//   20   38:invokevirtual   #247 <Method void BaseMediaChunk.init(DefaultTrackOutput)>
			mediaChunks.add(((Object) (basemediachunk)));
	//   21   41:aload_0         
	//   22   42:getfield        #118 <Field LinkedList mediaChunks>
	//   23   45:aload_2         
	//   24   46:invokevirtual   #251 <Method boolean LinkedList.add(Object)>
	//   25   49:pop             
			if(isPendingReset())
	//*  26   50:aload_0         
	//*  27   51:invokespecial   #217 <Method boolean isPendingReset()>
	//*  28   54:ifeq            64
				pendingResetPositionUs = 0x0L;
	//   29   57:aload_0         
	//   30   58:ldc2w           #31  <Long 0x0L>
	//   31   61:putfield        #143 <Field long pendingResetPositionUs>
			notifyLoadStarted(basemediachunk.dataSpec.length, basemediachunk.type, basemediachunk.trigger, basemediachunk.format, basemediachunk.startTimeUs, basemediachunk.endTimeUs);
	//   32   64:aload_0         
	//   33   65:aload_2         
	//   34   66:getfield        #255 <Field DataSpec BaseMediaChunk.dataSpec>
	//   35   69:getfield        #260 <Field long DataSpec.length>
	//   36   72:aload_2         
	//   37   73:getfield        #263 <Field int BaseMediaChunk.type>
	//   38   76:aload_2         
	//   39   77:getfield        #266 <Field int BaseMediaChunk.trigger>
	//   40   80:aload_2         
	//   41   81:getfield        #269 <Field Format BaseMediaChunk.format>
	//   42   84:aload_2         
	//   43   85:getfield        #180 <Field long BaseMediaChunk.startTimeUs>
	//   44   88:aload_2         
	//   45   89:getfield        #174 <Field long BaseMediaChunk.endTimeUs>
	//   46   92:invokespecial   #273 <Method void notifyLoadStarted(long, int, int, Format, long, long)>
		} else
	//*  47   95:goto            127
		{
			notifyLoadStarted(chunk.dataSpec.length, chunk.type, chunk.trigger, chunk.format, -1L, -1L);
	//   48   98:aload_0         
	//   49   99:aload_1         
	//   50  100:getfield        #276 <Field DataSpec Chunk.dataSpec>
	//   51  103:getfield        #260 <Field long DataSpec.length>
	//   52  106:aload_1         
	//   53  107:getfield        #277 <Field int Chunk.type>
	//   54  110:aload_1         
	//   55  111:getfield        #278 <Field int Chunk.trigger>
	//   56  114:aload_1         
	//   57  115:getfield        #279 <Field Format Chunk.format>
	//   58  118:ldc2w           #218 <Long -1L>
	//   59  121:ldc2w           #218 <Long -1L>
	//   60  124:invokespecial   #273 <Method void notifyLoadStarted(long, int, int, Format, long, long)>
		}
		loader.startLoading(((com.google.android.exoplayer.upstream.Loader.Loadable) (chunk)), ((com.google.android.exoplayer.upstream.Loader.Callback) (this)));
	//   61  127:aload_0         
	//   62  128:getfield        #281 <Field Loader loader>
	//   63  131:aload_1         
	//   64  132:aload_0         
	//   65  133:invokevirtual   #287 <Method void Loader.startLoading(com.google.android.exoplayer.upstream.Loader$Loadable, com.google.android.exoplayer.upstream.Loader$Callback)>
	//   66  136:return          
	}

	private void notifyDownstreamFormatChanged(final Format format, final int trigger, final long positionUs)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Handler eventHandler>
	//    2    4:astore          5
		if(handler != null && eventListener != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          35
	//*   5   11:aload_0         
	//*   6   12:getfield        #104 <Field ChunkSampleSource$EventListener eventListener>
	//*   7   15:ifnull          35
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onDownstreamFormatChanged(eventSourceId, format, trigger, usToMs(positionUs));
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field ChunkSampleSource this$0>
				//    2    4:invokestatic    #38  <Method ChunkSampleSource$EventListener ChunkSampleSource.access$100(ChunkSampleSource)>
				//    3    7:aload_0         
				//    4    8:getfield        #23  <Field ChunkSampleSource this$0>
				//    5   11:invokestatic    #42  <Method int ChunkSampleSource.access$000(ChunkSampleSource)>
				//    6   14:aload_0         
				//    7   15:getfield        #25  <Field Format val$format>
				//    8   18:aload_0         
				//    9   19:getfield        #27  <Field int val$trigger>
				//   10   22:aload_0         
				//   11   23:getfield        #23  <Field ChunkSampleSource this$0>
				//   12   26:aload_0         
				//   13   27:getfield        #29  <Field long val$positionUs>
				//   14   30:invokevirtual   #46  <Method long ChunkSampleSource.usToMs(long)>
				//   15   33:invokeinterface #52  <Method void ChunkSampleSource$EventListener.onDownstreamFormatChanged(int, Format, int, long)>
				//   16   38:return          
				}

				final ChunkSampleSource this$0;
				final Format val$format;
				final long val$positionUs;
				final int val$trigger;

			
			{
				this$0 = ChunkSampleSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field ChunkSampleSource this$0>
				format = format1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Format val$format>
				trigger = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field int val$trigger>
				positionUs = l;
			//    9   15:aload_0         
			//   10   16:lload           4
			//   11   18:putfield        #29  <Field long val$positionUs>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//    8   18:aload           5
	//    9   20:new             #22  <Class ChunkSampleSource$6>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:iload_2         
	//   14   27:lload_3         
	//   15   28:invokespecial   #292 <Method void ChunkSampleSource$6(ChunkSampleSource, Format, int, long)>
	//   16   31:invokevirtual   #298 <Method boolean Handler.post(Runnable)>
	//   17   34:pop             
	//   18   35:return          
	}

	private void notifyLoadCanceled(final long bytesLoaded)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Handler eventHandler>
	//    2    4:astore_3        
		if(handler != null && eventListener != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
	//*   5    9:aload_0         
	//*   6   10:getfield        #104 <Field ChunkSampleSource$EventListener eventListener>
	//*   7   13:ifnull          30
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onLoadCanceled(eventSourceId, bytesLoaded);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field ChunkSampleSource this$0>
				//    2    4:invokestatic    #30  <Method ChunkSampleSource$EventListener ChunkSampleSource.access$100(ChunkSampleSource)>
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field ChunkSampleSource this$0>
				//    5   11:invokestatic    #34  <Method int ChunkSampleSource.access$000(ChunkSampleSource)>
				//    6   14:aload_0         
				//    7   15:getfield        #21  <Field long val$bytesLoaded>
				//    8   18:invokeinterface #40  <Method void ChunkSampleSource$EventListener.onLoadCanceled(int, long)>
				//    9   23:return          
				}

				final ChunkSampleSource this$0;
				final long val$bytesLoaded;

			
			{
				this$0 = ChunkSampleSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ChunkSampleSource this$0>
				bytesLoaded = l;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #21  <Field long val$bytesLoaded>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   16:aload_3         
	//    9   17:new             #16  <Class ChunkSampleSource$3>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:lload_1         
	//   13   23:invokespecial   #303 <Method void ChunkSampleSource$3(ChunkSampleSource, long)>
	//   14   26:invokevirtual   #298 <Method boolean Handler.post(Runnable)>
	//   15   29:pop             
	//   16   30:return          
	}

	private void notifyLoadCompleted(final long bytesLoaded, final int type, final int trigger, final Format format, final long mediaStartTimeUs, 
			final long mediaEndTimeUs, final long elapsedRealtimeMs, final long loadDurationMs)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Handler eventHandler>
	//    2    4:astore          14
		if(handler != null && eventListener != null)
	//*   3    6:aload           14
	//*   4    8:ifnull          46
	//*   5   11:aload_0         
	//*   6   12:getfield        #104 <Field ChunkSampleSource$EventListener eventListener>
	//*   7   15:ifnull          46
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onLoadCompleted(eventSourceId, bytesLoaded, type, trigger, format, usToMs(mediaStartTimeUs), usToMs(mediaEndTimeUs), elapsedRealtimeMs, loadDurationMs);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field ChunkSampleSource this$0>
				//    2    4:invokestatic    #53  <Method ChunkSampleSource$EventListener ChunkSampleSource.access$100(ChunkSampleSource)>
				//    3    7:aload_0         
				//    4    8:getfield        #28  <Field ChunkSampleSource this$0>
				//    5   11:invokestatic    #57  <Method int ChunkSampleSource.access$000(ChunkSampleSource)>
				//    6   14:aload_0         
				//    7   15:getfield        #30  <Field long val$bytesLoaded>
				//    8   18:aload_0         
				//    9   19:getfield        #32  <Field int val$type>
				//   10   22:aload_0         
				//   11   23:getfield        #34  <Field int val$trigger>
				//   12   26:aload_0         
				//   13   27:getfield        #36  <Field Format val$format>
				//   14   30:aload_0         
				//   15   31:getfield        #28  <Field ChunkSampleSource this$0>
				//   16   34:aload_0         
				//   17   35:getfield        #38  <Field long val$mediaStartTimeUs>
				//   18   38:invokevirtual   #61  <Method long ChunkSampleSource.usToMs(long)>
				//   19   41:aload_0         
				//   20   42:getfield        #28  <Field ChunkSampleSource this$0>
				//   21   45:aload_0         
				//   22   46:getfield        #40  <Field long val$mediaEndTimeUs>
				//   23   49:invokevirtual   #61  <Method long ChunkSampleSource.usToMs(long)>
				//   24   52:aload_0         
				//   25   53:getfield        #42  <Field long val$elapsedRealtimeMs>
				//   26   56:aload_0         
				//   27   57:getfield        #44  <Field long val$loadDurationMs>
				//   28   60:invokeinterface #67  <Method void ChunkSampleSource$EventListener.onLoadCompleted(int, long, int, int, Format, long, long, long, long)>
				//   29   65:return          
				}

				final ChunkSampleSource this$0;
				final long val$bytesLoaded;
				final long val$elapsedRealtimeMs;
				final Format val$format;
				final long val$loadDurationMs;
				final long val$mediaEndTimeUs;
				final long val$mediaStartTimeUs;
				final int val$trigger;
				final int val$type;

			
			{
				this$0 = ChunkSampleSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field ChunkSampleSource this$0>
				bytesLoaded = l;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #30  <Field long val$bytesLoaded>
				type = i;
			//    6   10:aload_0         
			//    7   11:iload           4
			//    8   13:putfield        #32  <Field int val$type>
				trigger = j;
			//    9   16:aload_0         
			//   10   17:iload           5
			//   11   19:putfield        #34  <Field int val$trigger>
				format = format1;
			//   12   22:aload_0         
			//   13   23:aload           6
			//   14   25:putfield        #36  <Field Format val$format>
				mediaStartTimeUs = l1;
			//   15   28:aload_0         
			//   16   29:lload           7
			//   17   31:putfield        #38  <Field long val$mediaStartTimeUs>
				mediaEndTimeUs = l2;
			//   18   34:aload_0         
			//   19   35:lload           9
			//   20   37:putfield        #40  <Field long val$mediaEndTimeUs>
				elapsedRealtimeMs = l3;
			//   21   40:aload_0         
			//   22   41:lload           11
			//   23   43:putfield        #42  <Field long val$elapsedRealtimeMs>
				loadDurationMs = l4;
			//   24   46:aload_0         
			//   25   47:lload           13
			//   26   49:putfield        #44  <Field long val$loadDurationMs>
				super();
			//   27   52:aload_0         
			//   28   53:invokespecial   #47  <Method void Object()>
			//   29   56:return          
			}
			}
);
	//    8   18:aload           14
	//    9   20:new             #14  <Class ChunkSampleSource$2>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:lload_1         
	//   13   26:iload_3         
	//   14   27:iload           4
	//   15   29:aload           5
	//   16   31:lload           6
	//   17   33:lload           8
	//   18   35:lload           10
	//   19   37:lload           12
	//   20   39:invokespecial   #308 <Method void ChunkSampleSource$2(ChunkSampleSource, long, int, int, Format, long, long, long, long)>
	//   21   42:invokevirtual   #298 <Method boolean Handler.post(Runnable)>
	//   22   45:pop             
	//   23   46:return          
	}

	private void notifyLoadError(final IOException e)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Handler eventHandler>
	//    2    4:astore_2        
		if(handler != null && eventListener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
	//*   5    9:aload_0         
	//*   6   10:getfield        #104 <Field ChunkSampleSource$EventListener eventListener>
	//*   7   13:ifnull          30
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onLoadError(eventSourceId, e);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field ChunkSampleSource this$0>
				//    2    4:invokestatic    #30  <Method ChunkSampleSource$EventListener ChunkSampleSource.access$100(ChunkSampleSource)>
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field ChunkSampleSource this$0>
				//    5   11:invokestatic    #34  <Method int ChunkSampleSource.access$000(ChunkSampleSource)>
				//    6   14:aload_0         
				//    7   15:getfield        #21  <Field IOException val$e>
				//    8   18:invokeinterface #40  <Method void ChunkSampleSource$EventListener.onLoadError(int, IOException)>
				//    9   23:return          
				}

				final ChunkSampleSource this$0;
				final IOException val$e;

			
			{
				this$0 = ChunkSampleSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ChunkSampleSource this$0>
				e = ioexception;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field IOException val$e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   16:aload_2         
	//    9   17:new             #18  <Class ChunkSampleSource$4>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #313 <Method void ChunkSampleSource$4(ChunkSampleSource, IOException)>
	//   14   26:invokevirtual   #298 <Method boolean Handler.post(Runnable)>
	//   15   29:pop             
	//   16   30:return          
	}

	private void notifyLoadStarted(final long length, final int type, final int trigger, final Format format, final long mediaStartTimeUs, 
			final long mediaEndTimeUs)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Handler eventHandler>
	//    2    4:astore          10
		if(handler != null && eventListener != null)
	//*   3    6:aload           10
	//*   4    8:ifnull          42
	//*   5   11:aload_0         
	//*   6   12:getfield        #104 <Field ChunkSampleSource$EventListener eventListener>
	//*   7   15:ifnull          42
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onLoadStarted(eventSourceId, length, type, trigger, format, usToMs(mediaStartTimeUs), usToMs(mediaEndTimeUs));
				//    0    0:aload_0         
				//    1    1:getfield        #26  <Field ChunkSampleSource this$0>
				//    2    4:invokestatic    #47  <Method ChunkSampleSource$EventListener ChunkSampleSource.access$100(ChunkSampleSource)>
				//    3    7:aload_0         
				//    4    8:getfield        #26  <Field ChunkSampleSource this$0>
				//    5   11:invokestatic    #51  <Method int ChunkSampleSource.access$000(ChunkSampleSource)>
				//    6   14:aload_0         
				//    7   15:getfield        #28  <Field long val$length>
				//    8   18:aload_0         
				//    9   19:getfield        #30  <Field int val$type>
				//   10   22:aload_0         
				//   11   23:getfield        #32  <Field int val$trigger>
				//   12   26:aload_0         
				//   13   27:getfield        #34  <Field Format val$format>
				//   14   30:aload_0         
				//   15   31:getfield        #26  <Field ChunkSampleSource this$0>
				//   16   34:aload_0         
				//   17   35:getfield        #36  <Field long val$mediaStartTimeUs>
				//   18   38:invokevirtual   #55  <Method long ChunkSampleSource.usToMs(long)>
				//   19   41:aload_0         
				//   20   42:getfield        #26  <Field ChunkSampleSource this$0>
				//   21   45:aload_0         
				//   22   46:getfield        #38  <Field long val$mediaEndTimeUs>
				//   23   49:invokevirtual   #55  <Method long ChunkSampleSource.usToMs(long)>
				//   24   52:invokeinterface #61  <Method void ChunkSampleSource$EventListener.onLoadStarted(int, long, int, int, Format, long, long)>
				//   25   57:return          
				}

				final ChunkSampleSource this$0;
				final Format val$format;
				final long val$length;
				final long val$mediaEndTimeUs;
				final long val$mediaStartTimeUs;
				final int val$trigger;
				final int val$type;

			
			{
				this$0 = ChunkSampleSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field ChunkSampleSource this$0>
				length = l;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #28  <Field long val$length>
				type = i;
			//    6   10:aload_0         
			//    7   11:iload           4
			//    8   13:putfield        #30  <Field int val$type>
				trigger = j;
			//    9   16:aload_0         
			//   10   17:iload           5
			//   11   19:putfield        #32  <Field int val$trigger>
				format = format1;
			//   12   22:aload_0         
			//   13   23:aload           6
			//   14   25:putfield        #34  <Field Format val$format>
				mediaStartTimeUs = l1;
			//   15   28:aload_0         
			//   16   29:lload           7
			//   17   31:putfield        #36  <Field long val$mediaStartTimeUs>
				mediaEndTimeUs = l2;
			//   18   34:aload_0         
			//   19   35:lload           9
			//   20   37:putfield        #38  <Field long val$mediaEndTimeUs>
				super();
			//   21   40:aload_0         
			//   22   41:invokespecial   #41  <Method void Object()>
			//   23   44:return          
			}
			}
);
	//    8   18:aload           10
	//    9   20:new             #12  <Class ChunkSampleSource$1>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:lload_1         
	//   13   26:iload_3         
	//   14   27:iload           4
	//   15   29:aload           5
	//   16   31:lload           6
	//   17   33:lload           8
	//   18   35:invokespecial   #316 <Method void ChunkSampleSource$1(ChunkSampleSource, long, int, int, Format, long, long)>
	//   19   38:invokevirtual   #298 <Method boolean Handler.post(Runnable)>
	//   20   41:pop             
	//   21   42:return          
	}

	private void notifyUpstreamDiscarded(final long mediaStartTimeUs, final long mediaEndTimeUs)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Handler eventHandler>
	//    2    4:astore          5
		if(handler != null && eventListener != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          34
	//*   5   11:aload_0         
	//*   6   12:getfield        #104 <Field ChunkSampleSource$EventListener eventListener>
	//*   7   15:ifnull          34
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onUpstreamDiscarded(eventSourceId, usToMs(mediaStartTimeUs), usToMs(mediaEndTimeUs));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ChunkSampleSource this$0>
				//    2    4:invokestatic    #33  <Method ChunkSampleSource$EventListener ChunkSampleSource.access$100(ChunkSampleSource)>
				//    3    7:aload_0         
				//    4    8:getfield        #20  <Field ChunkSampleSource this$0>
				//    5   11:invokestatic    #37  <Method int ChunkSampleSource.access$000(ChunkSampleSource)>
				//    6   14:aload_0         
				//    7   15:getfield        #20  <Field ChunkSampleSource this$0>
				//    8   18:aload_0         
				//    9   19:getfield        #22  <Field long val$mediaStartTimeUs>
				//   10   22:invokevirtual   #41  <Method long ChunkSampleSource.usToMs(long)>
				//   11   25:aload_0         
				//   12   26:getfield        #20  <Field ChunkSampleSource this$0>
				//   13   29:aload_0         
				//   14   30:getfield        #24  <Field long val$mediaEndTimeUs>
				//   15   33:invokevirtual   #41  <Method long ChunkSampleSource.usToMs(long)>
				//   16   36:invokeinterface #47  <Method void ChunkSampleSource$EventListener.onUpstreamDiscarded(int, long, long)>
				//   17   41:return          
				}

				final ChunkSampleSource this$0;
				final long val$mediaEndTimeUs;
				final long val$mediaStartTimeUs;

			
			{
				this$0 = ChunkSampleSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ChunkSampleSource this$0>
				mediaStartTimeUs = l;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #22  <Field long val$mediaStartTimeUs>
				mediaEndTimeUs = l1;
			//    6   10:aload_0         
			//    7   11:lload           4
			//    8   13:putfield        #24  <Field long val$mediaEndTimeUs>
				super();
			//    9   16:aload_0         
			//   10   17:invokespecial   #27  <Method void Object()>
			//   11   20:return          
			}
			}
);
	//    8   18:aload           5
	//    9   20:new             #20  <Class ChunkSampleSource$5>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:lload_1         
	//   13   26:lload_3         
	//   14   27:invokespecial   #319 <Method void ChunkSampleSource$5(ChunkSampleSource, long, long)>
	//   15   30:invokevirtual   #298 <Method boolean Handler.post(Runnable)>
	//   16   33:pop             
	//   17   34:return          
	}

	private void restartFrom(long l)
	{
		pendingResetPositionUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #143 <Field long pendingResetPositionUs>
		loadingFinished = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #182 <Field boolean loadingFinished>
		if(loader.isLoading())
	//*   6   10:aload_0         
	//*   7   11:getfield        #281 <Field Loader loader>
	//*   8   14:invokevirtual   #323 <Method boolean Loader.isLoading()>
	//*   9   17:ifeq            28
		{
			loader.cancelLoading();
	//   10   20:aload_0         
	//   11   21:getfield        #281 <Field Loader loader>
	//   12   24:invokevirtual   #326 <Method void Loader.cancelLoading()>
			return;
	//   13   27:return          
		} else
		{
			sampleQueue.clear();
	//   14   28:aload_0         
	//   15   29:getfield        #139 <Field DefaultTrackOutput sampleQueue>
	//   16   32:invokevirtual   #329 <Method void DefaultTrackOutput.clear()>
			mediaChunks.clear();
	//   17   35:aload_0         
	//   18   36:getfield        #118 <Field LinkedList mediaChunks>
	//   19   39:invokevirtual   #330 <Method void LinkedList.clear()>
			clearCurrentLoadable();
	//   20   42:aload_0         
	//   21   43:invokespecial   #332 <Method void clearCurrentLoadable()>
			updateLoadControl();
	//   22   46:aload_0         
	//   23   47:invokespecial   #335 <Method void updateLoadControl()>
			return;
	//   24   50:return          
		}
	}

	private void resumeFromBackOff()
	{
		currentLoadableException = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #157 <Field IOException currentLoadableException>
		Chunk chunk = currentLoadableHolder.chunk;
	//    3    5:aload_0         
	//    4    6:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//    5    9:getfield        #152 <Field Chunk ChunkOperationHolder.chunk>
	//    6   12:astore_2        
		if(!isMediaChunk(chunk))
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:invokespecial   #243 <Method boolean isMediaChunk(Chunk)>
	//*  10   18:ifne            71
		{
			doChunkOperation();
	//   11   21:aload_0         
	//   12   22:invokespecial   #338 <Method void doChunkOperation()>
			discardUpstreamMediaChunks(currentLoadableHolder.queueSize);
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//   16   30:getfield        #203 <Field int ChunkOperationHolder.queueSize>
	//   17   33:invokespecial   #340 <Method boolean discardUpstreamMediaChunks(int)>
	//   18   36:pop             
			if(currentLoadableHolder.chunk == chunk)
	//*  19   37:aload_0         
	//*  20   38:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//*  21   41:getfield        #152 <Field Chunk ChunkOperationHolder.chunk>
	//*  22   44:aload_2         
	//*  23   45:if_acmpne       58
			{
				loader.startLoading(((com.google.android.exoplayer.upstream.Loader.Loadable) (chunk)), ((com.google.android.exoplayer.upstream.Loader.Callback) (this)));
	//   24   48:aload_0         
	//   25   49:getfield        #281 <Field Loader loader>
	//   26   52:aload_2         
	//   27   53:aload_0         
	//   28   54:invokevirtual   #287 <Method void Loader.startLoading(com.google.android.exoplayer.upstream.Loader$Loadable, com.google.android.exoplayer.upstream.Loader$Callback)>
				return;
	//   29   57:return          
			} else
			{
				notifyLoadCanceled(chunk.bytesLoaded());
	//   30   58:aload_0         
	//   31   59:aload_2         
	//   32   60:invokevirtual   #343 <Method long Chunk.bytesLoaded()>
	//   33   63:invokespecial   #345 <Method void notifyLoadCanceled(long)>
				maybeStartLoading();
	//   34   66:aload_0         
	//   35   67:invokespecial   #347 <Method void maybeStartLoading()>
				return;
	//   36   70:return          
			}
		}
		if(chunk == mediaChunks.getFirst())
	//*  37   71:aload_2         
	//*  38   72:aload_0         
	//*  39   73:getfield        #118 <Field LinkedList mediaChunks>
	//*  40   76:invokevirtual   #350 <Method Object LinkedList.getFirst()>
	//*  41   79:if_acmpne       92
		{
			loader.startLoading(((com.google.android.exoplayer.upstream.Loader.Loadable) (chunk)), ((com.google.android.exoplayer.upstream.Loader.Callback) (this)));
	//   42   82:aload_0         
	//   43   83:getfield        #281 <Field Loader loader>
	//   44   86:aload_2         
	//   45   87:aload_0         
	//   46   88:invokevirtual   #287 <Method void Loader.startLoading(com.google.android.exoplayer.upstream.Loader$Loadable, com.google.android.exoplayer.upstream.Loader$Callback)>
			return;
	//   47   91:return          
		}
		BaseMediaChunk basemediachunk = (BaseMediaChunk)mediaChunks.removeLast();
	//   48   92:aload_0         
	//   49   93:getfield        #118 <Field LinkedList mediaChunks>
	//   50   96:invokevirtual   #177 <Method Object LinkedList.removeLast()>
	//   51   99:checkcast       #171 <Class BaseMediaChunk>
	//   52  102:astore_3        
		boolean flag;
		if(chunk == basemediachunk)
	//*  53  103:aload_2         
	//*  54  104:aload_3         
	//*  55  105:if_acmpne       113
			flag = true;
	//   56  108:iconst_1        
	//   57  109:istore_1        
		else
	//*  58  110:goto            115
			flag = false;
	//   59  113:iconst_0        
	//   60  114:istore_1        
		Assertions.checkState(flag);
	//   61  115:iload_1         
	//   62  116:invokestatic    #356 <Method void Assertions.checkState(boolean)>
		doChunkOperation();
	//   63  119:aload_0         
	//   64  120:invokespecial   #338 <Method void doChunkOperation()>
		mediaChunks.add(((Object) (basemediachunk)));
	//   65  123:aload_0         
	//   66  124:getfield        #118 <Field LinkedList mediaChunks>
	//   67  127:aload_3         
	//   68  128:invokevirtual   #251 <Method boolean LinkedList.add(Object)>
	//   69  131:pop             
		if(currentLoadableHolder.chunk == chunk)
	//*  70  132:aload_0         
	//*  71  133:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//*  72  136:getfield        #152 <Field Chunk ChunkOperationHolder.chunk>
	//*  73  139:aload_2         
	//*  74  140:if_acmpne       153
		{
			loader.startLoading(((com.google.android.exoplayer.upstream.Loader.Loadable) (chunk)), ((com.google.android.exoplayer.upstream.Loader.Callback) (this)));
	//   75  143:aload_0         
	//   76  144:getfield        #281 <Field Loader loader>
	//   77  147:aload_2         
	//   78  148:aload_0         
	//   79  149:invokevirtual   #287 <Method void Loader.startLoading(com.google.android.exoplayer.upstream.Loader$Loadable, com.google.android.exoplayer.upstream.Loader$Callback)>
			return;
	//   80  152:return          
		} else
		{
			notifyLoadCanceled(chunk.bytesLoaded());
	//   81  153:aload_0         
	//   82  154:aload_2         
	//   83  155:invokevirtual   #343 <Method long Chunk.bytesLoaded()>
	//   84  158:invokespecial   #345 <Method void notifyLoadCanceled(long)>
			discardUpstreamMediaChunks(currentLoadableHolder.queueSize);
	//   85  161:aload_0         
	//   86  162:aload_0         
	//   87  163:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//   88  166:getfield        #203 <Field int ChunkOperationHolder.queueSize>
	//   89  169:invokespecial   #340 <Method boolean discardUpstreamMediaChunks(int)>
	//   90  172:pop             
			clearCurrentLoadableException();
	//   91  173:aload_0         
	//   92  174:invokespecial   #155 <Method void clearCurrentLoadableException()>
			maybeStartLoading();
	//   93  177:aload_0         
	//   94  178:invokespecial   #347 <Method void maybeStartLoading()>
			return;
	//   95  181:return          
		}
	}

	private void updateLoadControl()
	{
		long l1 = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #239 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore          4
		long l = getNextLoadPositionUs();
	//    2    5:aload_0         
	//    3    6:invokespecial   #358 <Method long getNextLoadPositionUs()>
	//    4    9:lstore_2        
		boolean flag;
		if(currentLoadableException != null)
	//*   5   10:aload_0         
	//*   6   11:getfield        #157 <Field IOException currentLoadableException>
	//*   7   14:ifnull          22
			flag = true;
	//    8   17:iconst_1        
	//    9   18:istore_1        
		else
	//*  10   19:goto            24
			flag = false;
	//   11   22:iconst_0        
	//   12   23:istore_1        
		boolean flag1;
		if(!loader.isLoading() && !flag)
	//*  13   24:aload_0         
	//*  14   25:getfield        #281 <Field Loader loader>
	//*  15   28:invokevirtual   #323 <Method boolean Loader.isLoading()>
	//*  16   31:ifne            47
	//*  17   34:iload_1         
	//*  18   35:ifeq            41
	//*  19   38:goto            47
			flag1 = false;
	//   20   41:iconst_0        
	//   21   42:istore          6
		else
	//*  22   44:goto            50
			flag1 = true;
	//   23   47:iconst_1        
	//   24   48:istore          6
		if(!flag1 && (currentLoadableHolder.chunk == null && l != -1L || l1 - lastPerformedBufferOperation > 2000L))
	//*  25   50:iload           6
	//*  26   52:ifne            140
	//*  27   55:aload_0         
	//*  28   56:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//*  29   59:getfield        #152 <Field Chunk ChunkOperationHolder.chunk>
	//*  30   62:ifnonnull       73
	//*  31   65:lload_2         
	//*  32   66:ldc2w           #218 <Long -1L>
	//*  33   69:lcmp            
	//*  34   70:ifne            87
	//*  35   73:lload           4
	//*  36   75:aload_0         
	//*  37   76:getfield        #360 <Field long lastPerformedBufferOperation>
	//*  38   79:lsub            
	//*  39   80:ldc2w           #361 <Long 2000L>
	//*  40   83:lcmp            
	//*  41   84:ifle            140
		{
			lastPerformedBufferOperation = l1;
	//   42   87:aload_0         
	//   43   88:lload           4
	//   44   90:putfield        #360 <Field long lastPerformedBufferOperation>
			doChunkOperation();
	//   45   93:aload_0         
	//   46   94:invokespecial   #338 <Method void doChunkOperation()>
			boolean flag2 = discardUpstreamMediaChunks(currentLoadableHolder.queueSize);
	//   47   97:aload_0         
	//   48   98:aload_0         
	//   49   99:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//   50  102:getfield        #203 <Field int ChunkOperationHolder.queueSize>
	//   51  105:invokespecial   #340 <Method boolean discardUpstreamMediaChunks(int)>
	//   52  108:istore          7
			if(currentLoadableHolder.chunk == null)
	//*  53  110:aload_0         
	//*  54  111:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//*  55  114:getfield        #152 <Field Chunk ChunkOperationHolder.chunk>
	//*  56  117:ifnonnull       127
				l = -1L;
	//   57  120:ldc2w           #218 <Long -1L>
	//   58  123:lstore_2        
			else
	//*  59  124:goto            140
			if(flag2)
	//*  60  127:iload           7
	//*  61  129:ifeq            140
				l = getNextLoadPositionUs();
	//   62  132:aload_0         
	//   63  133:invokespecial   #358 <Method long getNextLoadPositionUs()>
	//   64  136:lstore_2        
		}
	//*  65  137:goto            140
		flag1 = loadControl.update(((Object) (this)), downstreamPositionUs, l, flag1);
	//   66  140:aload_0         
	//   67  141:getfield        #98  <Field LoadControl loadControl>
	//   68  144:aload_0         
	//   69  145:aload_0         
	//   70  146:getfield        #205 <Field long downstreamPositionUs>
	//   71  149:lload_2         
	//   72  150:iload           6
	//   73  152:invokeinterface #366 <Method boolean LoadControl.update(Object, long, long, boolean)>
	//   74  157:istore          6
		if(flag)
	//*  75  159:iload_1         
	//*  76  160:ifeq            188
		{
			if(l1 - currentLoadableExceptionTimestamp >= getRetryDelayMillis(currentLoadableExceptionCount))
	//*  77  163:lload           4
	//*  78  165:aload_0         
	//*  79  166:getfield        #368 <Field long currentLoadableExceptionTimestamp>
	//*  80  169:lsub            
	//*  81  170:aload_0         
	//*  82  171:aload_0         
	//*  83  172:getfield        #159 <Field int currentLoadableExceptionCount>
	//*  84  175:i2l             
	//*  85  176:invokespecial   #370 <Method long getRetryDelayMillis(long)>
	//*  86  179:lcmp            
	//*  87  180:iflt            187
				resumeFromBackOff();
	//   88  183:aload_0         
	//   89  184:invokespecial   #372 <Method void resumeFromBackOff()>
			return;
	//   90  187:return          
		}
		if(!loader.isLoading() && flag1)
	//*  91  188:aload_0         
	//*  92  189:getfield        #281 <Field Loader loader>
	//*  93  192:invokevirtual   #323 <Method boolean Loader.isLoading()>
	//*  94  195:ifne            207
	//*  95  198:iload           6
	//*  96  200:ifeq            207
			maybeStartLoading();
	//   97  203:aload_0         
	//   98  204:invokespecial   #347 <Method void maybeStartLoading()>
	//   99  207:return          
	}

	public boolean continueBuffering(int i, long l)
	{
		i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int state>
	//    2    4:istore_1        
		boolean flag1 = true;
	//    3    5:iconst_1        
	//    4    6:istore          5
		boolean flag;
		if(i == 3)
	//*   5    8:iload_1         
	//*   6    9:iconst_3        
	//*   7   10:icmpne          19
			flag = true;
	//    8   13:iconst_1        
	//    9   14:istore          4
		else
	//*  10   16:goto            22
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore          4
		Assertions.checkState(flag);
	//   13   22:iload           4
	//   14   24:invokestatic    #356 <Method void Assertions.checkState(boolean)>
		downstreamPositionUs = l;
	//   15   27:aload_0         
	//   16   28:lload_2         
	//   17   29:putfield        #205 <Field long downstreamPositionUs>
		chunkSource.continueBuffering(l);
	//   18   32:aload_0         
	//   19   33:getfield        #96  <Field ChunkSource chunkSource>
	//   20   36:lload_2         
	//   21   37:invokeinterface #376 <Method void ChunkSource.continueBuffering(long)>
		updateLoadControl();
	//   22   42:aload_0         
	//   23   43:invokespecial   #335 <Method void updateLoadControl()>
		flag = flag1;
	//   24   46:iload           5
	//   25   48:istore          4
		if(!loadingFinished)
	//*  26   50:aload_0         
	//*  27   51:getfield        #182 <Field boolean loadingFinished>
	//*  28   54:ifne            72
		{
			if(!sampleQueue.isEmpty())
	//*  29   57:aload_0         
	//*  30   58:getfield        #139 <Field DefaultTrackOutput sampleQueue>
	//*  31   61:invokevirtual   #379 <Method boolean DefaultTrackOutput.isEmpty()>
	//*  32   64:ifne            69
				return true;
	//   33   67:iconst_1        
	//   34   68:ireturn         
			flag = false;
	//   35   69:iconst_0        
	//   36   70:istore          4
		}
		return flag;
	//   37   72:iload           4
	//   38   74:ireturn         
	}

	public void disable(int i)
	{
		i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int state>
	//    2    4:istore_1        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		boolean flag;
		if(i == 3)
	//*   5    7:iload_1         
	//*   6    8:iconst_3        
	//*   7    9:icmpne          17
			flag = true;
	//    8   12:iconst_1        
	//    9   13:istore_2        
		else
	//*  10   14:goto            19
			flag = false;
	//   11   17:iconst_0        
	//   12   18:istore_2        
		Assertions.checkState(flag);
	//   13   19:iload_2         
	//   14   20:invokestatic    #356 <Method void Assertions.checkState(boolean)>
		i = enabledTrackCount - 1;
	//   15   23:aload_0         
	//   16   24:getfield        #382 <Field int enabledTrackCount>
	//   17   27:iconst_1        
	//   18   28:isub            
	//   19   29:istore_1        
		enabledTrackCount = i;
	//   20   30:aload_0         
	//   21   31:iload_1         
	//   22   32:putfield        #382 <Field int enabledTrackCount>
		flag = flag1;
	//   23   35:iload_3         
	//   24   36:istore_2        
		if(i == 0)
	//*  25   37:iload_1         
	//*  26   38:ifne            43
			flag = true;
	//   27   41:iconst_1        
	//   28   42:istore_2        
		Assertions.checkState(flag);
	//   29   43:iload_2         
	//   30   44:invokestatic    #356 <Method void Assertions.checkState(boolean)>
		state = 2;
	//   31   47:aload_0         
	//   32   48:iconst_2        
	//   33   49:putfield        #141 <Field int state>
		chunkSource.disable(((List) (mediaChunks)));
	//   34   52:aload_0         
	//   35   53:getfield        #96  <Field ChunkSource chunkSource>
	//   36   56:aload_0         
	//   37   57:getfield        #118 <Field LinkedList mediaChunks>
	//   38   60:invokeinterface #385 <Method void ChunkSource.disable(List)>
		loadControl.unregister(((Object) (this)));
	//   39   65:aload_0         
	//   40   66:getfield        #98  <Field LoadControl loadControl>
	//   41   69:aload_0         
	//   42   70:invokeinterface #389 <Method void LoadControl.unregister(Object)>
		if(loader.isLoading())
	//*  43   75:aload_0         
	//*  44   76:getfield        #281 <Field Loader loader>
	//*  45   79:invokevirtual   #323 <Method boolean Loader.isLoading()>
	//*  46   82:ifeq            93
		{
			loader.cancelLoading();
	//   47   85:aload_0         
	//   48   86:getfield        #281 <Field Loader loader>
	//   49   89:invokevirtual   #326 <Method void Loader.cancelLoading()>
			return;
	//   50   92:return          
		} else
		{
			sampleQueue.clear();
	//   51   93:aload_0         
	//   52   94:getfield        #139 <Field DefaultTrackOutput sampleQueue>
	//   53   97:invokevirtual   #329 <Method void DefaultTrackOutput.clear()>
			mediaChunks.clear();
	//   54  100:aload_0         
	//   55  101:getfield        #118 <Field LinkedList mediaChunks>
	//   56  104:invokevirtual   #330 <Method void LinkedList.clear()>
			clearCurrentLoadable();
	//   57  107:aload_0         
	//   58  108:invokespecial   #332 <Method void clearCurrentLoadable()>
			loadControl.trimAllocator();
	//   59  111:aload_0         
	//   60  112:getfield        #98  <Field LoadControl loadControl>
	//   61  115:invokeinterface #392 <Method void LoadControl.trimAllocator()>
			return;
	//   62  120:return          
		}
		Exception exception;
		exception;
	//   63  121:astore          4
		loadControl.unregister(((Object) (this)));
	//   64  123:aload_0         
	//   65  124:getfield        #98  <Field LoadControl loadControl>
	//   66  127:aload_0         
	//   67  128:invokeinterface #389 <Method void LoadControl.unregister(Object)>
		if(loader.isLoading())
	//*  68  133:aload_0         
	//*  69  134:getfield        #281 <Field Loader loader>
	//*  70  137:invokevirtual   #323 <Method boolean Loader.isLoading()>
	//*  71  140:ifeq            153
		{
			loader.cancelLoading();
	//   72  143:aload_0         
	//   73  144:getfield        #281 <Field Loader loader>
	//   74  147:invokevirtual   #326 <Method void Loader.cancelLoading()>
		} else
	//*  75  150:goto            180
		{
			sampleQueue.clear();
	//   76  153:aload_0         
	//   77  154:getfield        #139 <Field DefaultTrackOutput sampleQueue>
	//   78  157:invokevirtual   #329 <Method void DefaultTrackOutput.clear()>
			mediaChunks.clear();
	//   79  160:aload_0         
	//   80  161:getfield        #118 <Field LinkedList mediaChunks>
	//   81  164:invokevirtual   #330 <Method void LinkedList.clear()>
			clearCurrentLoadable();
	//   82  167:aload_0         
	//   83  168:invokespecial   #332 <Method void clearCurrentLoadable()>
			loadControl.trimAllocator();
	//   84  171:aload_0         
	//   85  172:getfield        #98  <Field LoadControl loadControl>
	//   86  175:invokeinterface #392 <Method void LoadControl.trimAllocator()>
		}
		throw exception;
	//   87  180:aload           4
	//   88  182:athrow          
	}

	public void enable(int i, long l)
	{
		int j = state;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int state>
	//    2    4:istore          4
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          6
		boolean flag;
		if(j == 2)
	//*   5    9:iload           4
	//*   6   11:iconst_2        
	//*   7   12:icmpne          21
			flag = true;
	//    8   15:iconst_1        
	//    9   16:istore          5
		else
	//*  10   18:goto            24
			flag = false;
	//   11   21:iconst_0        
	//   12   22:istore          5
		Assertions.checkState(flag);
	//   13   24:iload           5
	//   14   26:invokestatic    #356 <Method void Assertions.checkState(boolean)>
		j = enabledTrackCount;
	//   15   29:aload_0         
	//   16   30:getfield        #382 <Field int enabledTrackCount>
	//   17   33:istore          4
		enabledTrackCount = j + 1;
	//   18   35:aload_0         
	//   19   36:iload           4
	//   20   38:iconst_1        
	//   21   39:iadd            
	//   22   40:putfield        #382 <Field int enabledTrackCount>
		if(j == 0)
	//*  23   43:iload           4
	//*  24   45:ifne            55
			flag = flag1;
	//   25   48:iload           6
	//   26   50:istore          5
		else
	//*  27   52:goto            58
			flag = false;
	//   28   55:iconst_0        
	//   29   56:istore          5
		Assertions.checkState(flag);
	//   30   58:iload           5
	//   31   60:invokestatic    #356 <Method void Assertions.checkState(boolean)>
		state = 3;
	//   32   63:aload_0         
	//   33   64:iconst_3        
	//   34   65:putfield        #141 <Field int state>
		chunkSource.enable(i);
	//   35   68:aload_0         
	//   36   69:getfield        #96  <Field ChunkSource chunkSource>
	//   37   72:iload_1         
	//   38   73:invokeinterface #396 <Method void ChunkSource.enable(int)>
		loadControl.register(((Object) (this)), bufferSizeContribution);
	//   39   78:aload_0         
	//   40   79:getfield        #98  <Field LoadControl loadControl>
	//   41   82:aload_0         
	//   42   83:aload_0         
	//   43   84:getfield        #100 <Field int bufferSizeContribution>
	//   44   87:invokeinterface #400 <Method void LoadControl.register(Object, int)>
		downstreamFormat = null;
	//   45   92:aload_0         
	//   46   93:aconst_null     
	//   47   94:putfield        #402 <Field Format downstreamFormat>
		downstreamMediaFormat = null;
	//   48   97:aload_0         
	//   49   98:aconst_null     
	//   50   99:putfield        #404 <Field MediaFormat downstreamMediaFormat>
		downstreamDrmInitData = null;
	//   51  102:aload_0         
	//   52  103:aconst_null     
	//   53  104:putfield        #406 <Field DrmInitData downstreamDrmInitData>
		downstreamPositionUs = l;
	//   54  107:aload_0         
	//   55  108:lload_2         
	//   56  109:putfield        #205 <Field long downstreamPositionUs>
		lastSeekPositionUs = l;
	//   57  112:aload_0         
	//   58  113:lload_2         
	//   59  114:putfield        #408 <Field long lastSeekPositionUs>
		pendingDiscontinuity = false;
	//   60  117:aload_0         
	//   61  118:iconst_0        
	//   62  119:putfield        #410 <Field boolean pendingDiscontinuity>
		restartFrom(l);
	//   63  122:aload_0         
	//   64  123:lload_2         
	//   65  124:invokespecial   #412 <Method void restartFrom(long)>
	//   66  127:return          
	}

	public long getBufferedPositionUs()
	{
		boolean flag;
		if(state == 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field int state>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		Assertions.checkState(flag);
	//    9   15:iload_1         
	//   10   16:invokestatic    #356 <Method void Assertions.checkState(boolean)>
		if(isPendingReset())
	//*  11   19:aload_0         
	//*  12   20:invokespecial   #217 <Method boolean isPendingReset()>
	//*  13   23:ifeq            31
			return pendingResetPositionUs;
	//   14   26:aload_0         
	//   15   27:getfield        #143 <Field long pendingResetPositionUs>
	//   16   30:lreturn         
		if(loadingFinished)
	//*  17   31:aload_0         
	//*  18   32:getfield        #182 <Field boolean loadingFinished>
	//*  19   35:ifeq            42
			return -3L;
	//   20   38:ldc2w           #414 <Long -3L>
	//   21   41:lreturn         
		long l1 = sampleQueue.getLargestParsedTimestampUs();
	//   22   42:aload_0         
	//   23   43:getfield        #139 <Field DefaultTrackOutput sampleQueue>
	//   24   46:invokevirtual   #418 <Method long DefaultTrackOutput.getLargestParsedTimestampUs()>
	//   25   49:lstore          4
		long l = l1;
	//   26   51:lload           4
	//   27   53:lstore_2        
		if(l1 == 0x0L)
	//*  28   54:lload           4
	//*  29   56:ldc2w           #31  <Long 0x0L>
	//*  30   59:lcmp            
	//*  31   60:ifne            68
			l = downstreamPositionUs;
	//   32   63:aload_0         
	//   33   64:getfield        #205 <Field long downstreamPositionUs>
	//   34   67:lstore_2        
		return l;
	//   35   68:lload_2         
	//   36   69:lreturn         
	}

	public MediaFormat getFormat(int i)
	{
		int j = state;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int state>
	//    2    4:istore_2        
		boolean flag;
		if(j != 2 && j != 3)
	//*   3    5:iload_2         
	//*   4    6:iconst_2        
	//*   5    7:icmpeq          23
	//*   6   10:iload_2         
	//*   7   11:iconst_3        
	//*   8   12:icmpne          18
	//*   9   15:goto            23
			flag = false;
	//   10   18:iconst_0        
	//   11   19:istore_3        
		else
	//*  12   20:goto            25
			flag = true;
	//   13   23:iconst_1        
	//   14   24:istore_3        
		Assertions.checkState(flag);
	//   15   25:iload_3         
	//   16   26:invokestatic    #356 <Method void Assertions.checkState(boolean)>
		return chunkSource.getFormat(i);
	//   17   29:aload_0         
	//   18   30:getfield        #96  <Field ChunkSource chunkSource>
	//   19   33:iload_1         
	//   20   34:invokeinterface #422 <Method MediaFormat ChunkSource.getFormat(int)>
	//   21   39:areturn         
	}

	public int getTrackCount()
	{
		int i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int state>
	//    2    4:istore_1        
		boolean flag;
		if(i != 2 && i != 3)
	//*   3    5:iload_1         
	//*   4    6:iconst_2        
	//*   5    7:icmpeq          23
	//*   6   10:iload_1         
	//*   7   11:iconst_3        
	//*   8   12:icmpne          18
	//*   9   15:goto            23
			flag = false;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		else
	//*  12   20:goto            25
			flag = true;
	//   13   23:iconst_1        
	//   14   24:istore_2        
		Assertions.checkState(flag);
	//   15   25:iload_2         
	//   16   26:invokestatic    #356 <Method void Assertions.checkState(boolean)>
		return chunkSource.getTrackCount();
	//   17   29:aload_0         
	//   18   30:getfield        #96  <Field ChunkSource chunkSource>
	//   19   33:invokeinterface #425 <Method int ChunkSource.getTrackCount()>
	//   20   38:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		IOException ioexception = currentLoadableException;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field IOException currentLoadableException>
	//    2    4:astore_1        
		if(ioexception != null && currentLoadableExceptionCount > minLoadableRetryCount)
	//*   3    5:aload_1         
	//*   4    6:ifnull          25
	//*   5    9:aload_0         
	//*   6   10:getfield        #159 <Field int currentLoadableExceptionCount>
	//*   7   13:aload_0         
	//*   8   14:getfield        #108 <Field int minLoadableRetryCount>
	//*   9   17:icmpgt          23
	//*  10   20:goto            25
			throw ioexception;
	//   11   23:aload_1         
	//   12   24:athrow          
		if(currentLoadableHolder.chunk == null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//*  15   29:getfield        #152 <Field Chunk ChunkOperationHolder.chunk>
	//*  16   32:ifnonnull       44
			chunkSource.maybeThrowError();
	//   17   35:aload_0         
	//   18   36:getfield        #96  <Field ChunkSource chunkSource>
	//   19   39:invokeinterface #430 <Method void ChunkSource.maybeThrowError()>
	//   20   44:return          
	}

	public void onLoadCanceled(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
	{
		notifyLoadCanceled(currentLoadableHolder.chunk.bytesLoaded());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//    3    5:getfield        #152 <Field Chunk ChunkOperationHolder.chunk>
	//    4    8:invokevirtual   #343 <Method long Chunk.bytesLoaded()>
	//    5   11:invokespecial   #345 <Method void notifyLoadCanceled(long)>
		clearCurrentLoadable();
	//    6   14:aload_0         
	//    7   15:invokespecial   #332 <Method void clearCurrentLoadable()>
		if(state == 3)
	//*   8   18:aload_0         
	//*   9   19:getfield        #141 <Field int state>
	//*  10   22:iconst_3        
	//*  11   23:icmpne          35
		{
			restartFrom(pendingResetPositionUs);
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #143 <Field long pendingResetPositionUs>
	//   15   31:invokespecial   #412 <Method void restartFrom(long)>
			return;
	//   16   34:return          
		} else
		{
			sampleQueue.clear();
	//   17   35:aload_0         
	//   18   36:getfield        #139 <Field DefaultTrackOutput sampleQueue>
	//   19   39:invokevirtual   #329 <Method void DefaultTrackOutput.clear()>
			mediaChunks.clear();
	//   20   42:aload_0         
	//   21   43:getfield        #118 <Field LinkedList mediaChunks>
	//   22   46:invokevirtual   #330 <Method void LinkedList.clear()>
			clearCurrentLoadable();
	//   23   49:aload_0         
	//   24   50:invokespecial   #332 <Method void clearCurrentLoadable()>
			loadControl.trimAllocator();
	//   25   53:aload_0         
	//   26   54:getfield        #98  <Field LoadControl loadControl>
	//   27   57:invokeinterface #392 <Method void LoadControl.trimAllocator()>
			return;
	//   28   62:return          
		}
	}

	public void onLoadCompleted(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
	{
		long l = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #239 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore_2        
		long l1 = l - currentLoadStartTimeMs;
	//    2    4:lload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #241 <Field long currentLoadStartTimeMs>
	//    5    9:lsub            
	//    6   10:lstore          4
		loadable = ((com.google.android.exoplayer.upstream.Loader.Loadable) (currentLoadableHolder.chunk));
	//    7   12:aload_0         
	//    8   13:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//    9   16:getfield        #152 <Field Chunk ChunkOperationHolder.chunk>
	//   10   19:astore_1        
		chunkSource.onChunkLoadCompleted(((Chunk) (loadable)));
	//   11   20:aload_0         
	//   12   21:getfield        #96  <Field ChunkSource chunkSource>
	//   13   24:aload_1         
	//   14   25:invokeinterface #438 <Method void ChunkSource.onChunkLoadCompleted(Chunk)>
		if(isMediaChunk(((Chunk) (loadable))))
	//*  15   30:aload_0         
	//*  16   31:aload_1         
	//*  17   32:invokespecial   #243 <Method boolean isMediaChunk(Chunk)>
	//*  18   35:ifeq            83
		{
			BaseMediaChunk basemediachunk = (BaseMediaChunk)loadable;
	//   19   38:aload_1         
	//   20   39:checkcast       #171 <Class BaseMediaChunk>
	//   21   42:astore          6
			notifyLoadCompleted(((Chunk) (loadable)).bytesLoaded(), basemediachunk.type, basemediachunk.trigger, basemediachunk.format, basemediachunk.startTimeUs, basemediachunk.endTimeUs, l, l1);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #343 <Method long Chunk.bytesLoaded()>
	//   25   49:aload           6
	//   26   51:getfield        #263 <Field int BaseMediaChunk.type>
	//   27   54:aload           6
	//   28   56:getfield        #266 <Field int BaseMediaChunk.trigger>
	//   29   59:aload           6
	//   30   61:getfield        #269 <Field Format BaseMediaChunk.format>
	//   31   64:aload           6
	//   32   66:getfield        #180 <Field long BaseMediaChunk.startTimeUs>
	//   33   69:aload           6
	//   34   71:getfield        #174 <Field long BaseMediaChunk.endTimeUs>
	//   35   74:lload_2         
	//   36   75:lload           4
	//   37   77:invokespecial   #440 <Method void notifyLoadCompleted(long, int, int, Format, long, long, long, long)>
		} else
	//*  38   80:goto            112
		{
			notifyLoadCompleted(((Chunk) (loadable)).bytesLoaded(), ((Chunk) (loadable)).type, ((Chunk) (loadable)).trigger, ((Chunk) (loadable)).format, -1L, -1L, l, l1);
	//   39   83:aload_0         
	//   40   84:aload_1         
	//   41   85:invokevirtual   #343 <Method long Chunk.bytesLoaded()>
	//   42   88:aload_1         
	//   43   89:getfield        #277 <Field int Chunk.type>
	//   44   92:aload_1         
	//   45   93:getfield        #278 <Field int Chunk.trigger>
	//   46   96:aload_1         
	//   47   97:getfield        #279 <Field Format Chunk.format>
	//   48  100:ldc2w           #218 <Long -1L>
	//   49  103:ldc2w           #218 <Long -1L>
	//   50  106:lload_2         
	//   51  107:lload           4
	//   52  109:invokespecial   #440 <Method void notifyLoadCompleted(long, int, int, Format, long, long, long, long)>
		}
		clearCurrentLoadable();
	//   53  112:aload_0         
	//   54  113:invokespecial   #332 <Method void clearCurrentLoadable()>
		updateLoadControl();
	//   55  116:aload_0         
	//   56  117:invokespecial   #335 <Method void updateLoadControl()>
	//   57  120:return          
	}

	public void onLoadError(com.google.android.exoplayer.upstream.Loader.Loadable loadable, IOException ioexception)
	{
		currentLoadableException = ioexception;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #157 <Field IOException currentLoadableException>
		currentLoadableExceptionCount = currentLoadableExceptionCount + 1;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #159 <Field int currentLoadableExceptionCount>
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:putfield        #159 <Field int currentLoadableExceptionCount>
		currentLoadableExceptionTimestamp = SystemClock.elapsedRealtime();
	//    9   15:aload_0         
	//   10   16:invokestatic    #239 <Method long SystemClock.elapsedRealtime()>
	//   11   19:putfield        #368 <Field long currentLoadableExceptionTimestamp>
		notifyLoadError(ioexception);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokespecial   #444 <Method void notifyLoadError(IOException)>
		chunkSource.onChunkLoadError(currentLoadableHolder.chunk, ((Exception) (ioexception)));
	//   15   27:aload_0         
	//   16   28:getfield        #96  <Field ChunkSource chunkSource>
	//   17   31:aload_0         
	//   18   32:getfield        #113 <Field ChunkOperationHolder currentLoadableHolder>
	//   19   35:getfield        #152 <Field Chunk ChunkOperationHolder.chunk>
	//   20   38:aload_2         
	//   21   39:invokeinterface #448 <Method void ChunkSource.onChunkLoadError(Chunk, Exception)>
		updateLoadControl();
	//   22   44:aload_0         
	//   23   45:invokespecial   #335 <Method void updateLoadControl()>
	//   24   48:return          
	}

	protected void onSampleRead(MediaChunk mediachunk, SampleHolder sampleholder)
	{
	//    0    0:return          
	}

	public boolean prepare(long l)
	{
		int i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int state>
	//    2    4:istore_3        
		boolean flag;
		if(i != 1 && i != 2)
	//*   3    5:iload_3         
	//*   4    6:iconst_1        
	//*   5    7:icmpeq          24
	//*   6   10:iload_3         
	//*   7   11:iconst_2        
	//*   8   12:icmpne          18
	//*   9   15:goto            24
			flag = false;
	//   10   18:iconst_0        
	//   11   19:istore          4
		else
	//*  12   21:goto            27
			flag = true;
	//   13   24:iconst_1        
	//   14   25:istore          4
		Assertions.checkState(flag);
	//   15   27:iload           4
	//   16   29:invokestatic    #356 <Method void Assertions.checkState(boolean)>
		if(state == 2)
	//*  17   32:aload_0         
	//*  18   33:getfield        #141 <Field int state>
	//*  19   36:iconst_2        
	//*  20   37:icmpne          42
			return true;
	//   21   40:iconst_1        
	//   22   41:ireturn         
		if(!chunkSource.prepare())
	//*  23   42:aload_0         
	//*  24   43:getfield        #96  <Field ChunkSource chunkSource>
	//*  25   46:invokeinterface #454 <Method boolean ChunkSource.prepare()>
	//*  26   51:ifne            56
			return false;
	//   27   54:iconst_0        
	//   28   55:ireturn         
		if(chunkSource.getTrackCount() > 0)
	//*  29   56:aload_0         
	//*  30   57:getfield        #96  <Field ChunkSource chunkSource>
	//*  31   60:invokeinterface #425 <Method int ChunkSource.getTrackCount()>
	//*  32   65:ifle            121
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   33   68:new             #456 <Class StringBuilder>
	//   34   71:dup             
	//   35   72:invokespecial   #457 <Method void StringBuilder()>
	//   36   75:astore          5
			stringbuilder.append("Loader:");
	//   37   77:aload           5
	//   38   79:ldc2            #459 <String "Loader:">
	//   39   82:invokevirtual   #463 <Method StringBuilder StringBuilder.append(String)>
	//   40   85:pop             
			stringbuilder.append(chunkSource.getFormat(0).mimeType);
	//   41   86:aload           5
	//   42   88:aload_0         
	//   43   89:getfield        #96  <Field ChunkSource chunkSource>
	//   44   92:iconst_0        
	//   45   93:invokeinterface #422 <Method MediaFormat ChunkSource.getFormat(int)>
	//   46   98:getfield        #469 <Field String MediaFormat.mimeType>
	//   47  101:invokevirtual   #463 <Method StringBuilder StringBuilder.append(String)>
	//   48  104:pop             
			loader = new Loader(stringbuilder.toString());
	//   49  105:aload_0         
	//   50  106:new             #283 <Class Loader>
	//   51  109:dup             
	//   52  110:aload           5
	//   53  112:invokevirtual   #473 <Method String StringBuilder.toString()>
	//   54  115:invokespecial   #476 <Method void Loader(String)>
	//   55  118:putfield        #281 <Field Loader loader>
		}
		state = 2;
	//   56  121:aload_0         
	//   57  122:iconst_2        
	//   58  123:putfield        #141 <Field int state>
		return true;
	//   59  126:iconst_1        
	//   60  127:ireturn         
	}

	public int readData(int i, long l, MediaFormatHolder mediaformatholder, SampleHolder sampleholder)
	{
label0:
		{
			Object obj;
			DrmInitData drminitdata;
label1:
			{
				int k = state;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int state>
	//    2    4:istore          7
				int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore          6
				i = 1;
	//    5    9:iconst_1        
	//    6   10:istore_1        
				boolean flag1;
				if(k == 3)
	//*   7   11:iload           7
	//*   8   13:iconst_3        
	//*   9   14:icmpne          23
					flag1 = true;
	//   10   17:iconst_1        
	//   11   18:istore          8
				else
	//*  12   20:goto            26
					flag1 = false;
	//   13   23:iconst_0        
	//   14   24:istore          8
				Assertions.checkState(flag1);
	//   15   26:iload           8
	//   16   28:invokestatic    #356 <Method void Assertions.checkState(boolean)>
				downstreamPositionUs = l;
	//   17   31:aload_0         
	//   18   32:lload_2         
	//   19   33:putfield        #205 <Field long downstreamPositionUs>
				if(pendingDiscontinuity)
					break label0;
	//   20   36:aload_0         
	//   21   37:getfield        #410 <Field boolean pendingDiscontinuity>
	//   22   40:ifne            362
				if(isPendingReset())
	//*  23   43:aload_0         
	//*  24   44:invokespecial   #217 <Method boolean isPendingReset()>
	//*  25   47:ifeq            53
					return -2;
	//   26   50:bipush          -2
	//   27   52:ireturn         
				boolean flag = sampleQueue.isEmpty() ^ true;
	//   28   53:aload_0         
	//   29   54:getfield        #139 <Field DefaultTrackOutput sampleQueue>
	//   30   57:invokevirtual   #379 <Method boolean DefaultTrackOutput.isEmpty()>
	//   31   60:iconst_1        
	//   32   61:ixor            
	//   33   62:istore          7
				BaseMediaChunk basemediachunk;
				for(basemediachunk = (BaseMediaChunk)mediaChunks.getFirst(); flag && mediaChunks.size() > 1 && ((BaseMediaChunk)mediaChunks.get(1)).getFirstSampleIndex() <= sampleQueue.getReadIndex(); basemediachunk = (BaseMediaChunk)mediaChunks.getFirst())
	//*  34   64:aload_0         
	//*  35   65:getfield        #118 <Field LinkedList mediaChunks>
	//*  36   68:invokevirtual   #350 <Method Object LinkedList.getFirst()>
	//*  37   71:checkcast       #171 <Class BaseMediaChunk>
	//*  38   74:astore          9
	//*  39   76:iload           7
	//*  40   78:ifeq            139
	//*  41   81:aload_0         
	//*  42   82:getfield        #118 <Field LinkedList mediaChunks>
	//*  43   85:invokevirtual   #165 <Method int LinkedList.size()>
	//*  44   88:iconst_1        
	//*  45   89:icmple          139
	//*  46   92:aload_0         
	//*  47   93:getfield        #118 <Field LinkedList mediaChunks>
	//*  48   96:iconst_1        
	//*  49   97:invokevirtual   #482 <Method Object LinkedList.get(int)>
	//*  50  100:checkcast       #171 <Class BaseMediaChunk>
	//*  51  103:invokevirtual   #185 <Method int BaseMediaChunk.getFirstSampleIndex()>
	//*  52  106:aload_0         
	//*  53  107:getfield        #139 <Field DefaultTrackOutput sampleQueue>
	//*  54  110:invokevirtual   #485 <Method int DefaultTrackOutput.getReadIndex()>
	//*  55  113:icmpgt          139
					mediaChunks.removeFirst();
	//   56  116:aload_0         
	//   57  117:getfield        #118 <Field LinkedList mediaChunks>
	//   58  120:invokevirtual   #488 <Method Object LinkedList.removeFirst()>
	//   59  123:pop             

	//   60  124:aload_0         
	//   61  125:getfield        #118 <Field LinkedList mediaChunks>
	//   62  128:invokevirtual   #350 <Method Object LinkedList.getFirst()>
	//   63  131:checkcast       #171 <Class BaseMediaChunk>
	//   64  134:astore          9
	//*  65  136:goto            76
				obj = ((Object) (basemediachunk.format));
	//   66  139:aload           9
	//   67  141:getfield        #269 <Field Format BaseMediaChunk.format>
	//   68  144:astore          10
				if(!((Format) (obj)).equals(((Object) (downstreamFormat))))
	//*  69  146:aload           10
	//*  70  148:aload_0         
	//*  71  149:getfield        #402 <Field Format downstreamFormat>
	//*  72  152:invokevirtual   #493 <Method boolean Format.equals(Object)>
	//*  73  155:ifne            174
					notifyDownstreamFormatChanged(((Format) (obj)), basemediachunk.trigger, basemediachunk.startTimeUs);
	//   74  158:aload_0         
	//   75  159:aload           10
	//   76  161:aload           9
	//   77  163:getfield        #266 <Field int BaseMediaChunk.trigger>
	//   78  166:aload           9
	//   79  168:getfield        #180 <Field long BaseMediaChunk.startTimeUs>
	//   80  171:invokespecial   #495 <Method void notifyDownstreamFormatChanged(Format, int, long)>
				downstreamFormat = ((Format) (obj));
	//   81  174:aload_0         
	//   82  175:aload           10
	//   83  177:putfield        #402 <Field Format downstreamFormat>
				if(flag || basemediachunk.isMediaFormatFinal)
	//*  84  180:iload           7
	//*  85  182:ifne            193
	//*  86  185:aload           9
	//*  87  187:getfield        #498 <Field boolean BaseMediaChunk.isMediaFormatFinal>
	//*  88  190:ifeq            246
				{
					obj = ((Object) (basemediachunk.getMediaFormat()));
	//   89  193:aload           9
	//   90  195:invokevirtual   #502 <Method MediaFormat BaseMediaChunk.getMediaFormat()>
	//   91  198:astore          10
					drminitdata = basemediachunk.getDrmInitData();
	//   92  200:aload           9
	//   93  202:invokevirtual   #506 <Method DrmInitData BaseMediaChunk.getDrmInitData()>
	//   94  205:astore          11
					if(!((MediaFormat) (obj)).equals(((Object) (downstreamMediaFormat))) || !Util.areEqual(((Object) (downstreamDrmInitData)), ((Object) (drminitdata))))
	//*  95  207:aload           10
	//*  96  209:aload_0         
	//*  97  210:getfield        #404 <Field MediaFormat downstreamMediaFormat>
	//*  98  213:invokevirtual   #507 <Method boolean MediaFormat.equals(Object)>
	//*  99  216:ifeq            333
	//* 100  219:aload_0         
	//* 101  220:getfield        #406 <Field DrmInitData downstreamDrmInitData>
	//* 102  223:aload           11
	//* 103  225:invokestatic    #513 <Method boolean Util.areEqual(Object, Object)>
	//* 104  228:ifne            234
						break label1;
	//  105  231:goto            333
					downstreamMediaFormat = ((MediaFormat) (obj));
	//  106  234:aload_0         
	//  107  235:aload           10
	//  108  237:putfield        #404 <Field MediaFormat downstreamMediaFormat>
					downstreamDrmInitData = drminitdata;
	//  109  240:aload_0         
	//  110  241:aload           11
	//  111  243:putfield        #406 <Field DrmInitData downstreamDrmInitData>
				}
				if(!flag)
	//* 112  246:iload           7
	//* 113  248:ifne            263
					return !loadingFinished ? -2 : -1;
	//  114  251:aload_0         
	//  115  252:getfield        #182 <Field boolean loadingFinished>
	//  116  255:ifeq            260
	//  117  258:iconst_m1       
	//  118  259:ireturn         
	//  119  260:bipush          -2
	//  120  262:ireturn         
				if(sampleQueue.getSample(sampleholder))
	//* 121  263:aload_0         
	//* 122  264:getfield        #139 <Field DefaultTrackOutput sampleQueue>
	//* 123  267:aload           5
	//* 124  269:invokevirtual   #517 <Method boolean DefaultTrackOutput.getSample(SampleHolder)>
	//* 125  272:ifeq            330
				{
					if(sampleholder.timeUs >= lastSeekPositionUs)
	//* 126  275:aload           5
	//* 127  277:getfield        #522 <Field long SampleHolder.timeUs>
	//* 128  280:aload_0         
	//* 129  281:getfield        #408 <Field long lastSeekPositionUs>
	//* 130  284:lcmp            
	//* 131  285:ifge            291
	//* 132  288:goto            293
						i = 0;
	//  133  291:iconst_0        
	//  134  292:istore_1        
					int i1 = sampleholder.flags;
	//  135  293:aload           5
	//  136  295:getfield        #525 <Field int SampleHolder.flags>
	//  137  298:istore          7
					if(i != 0)
	//* 138  300:iload_1         
	//* 139  301:ifeq            309
						j = 0x8000000;
	//  140  304:ldc2            #526 <Int 0x8000000>
	//  141  307:istore          6
					sampleholder.flags = i1 | j;
	//  142  309:aload           5
	//  143  311:iload           7
	//  144  313:iload           6
	//  145  315:ior             
	//  146  316:putfield        #525 <Field int SampleHolder.flags>
					onSampleRead(((MediaChunk) (basemediachunk)), sampleholder);
	//  147  319:aload_0         
	//  148  320:aload           9
	//  149  322:aload           5
	//  150  324:invokevirtual   #528 <Method void onSampleRead(MediaChunk, SampleHolder)>
					return -3;
	//  151  327:bipush          -3
	//  152  329:ireturn         
				} else
				{
					return -2;
	//  153  330:bipush          -2
	//  154  332:ireturn         
				}
			}
			mediaformatholder.format = ((MediaFormat) (obj));
	//  155  333:aload           4
	//  156  335:aload           10
	//  157  337:putfield        #532 <Field MediaFormat MediaFormatHolder.format>
			mediaformatholder.drmInitData = drminitdata;
	//  158  340:aload           4
	//  159  342:aload           11
	//  160  344:putfield        #535 <Field DrmInitData MediaFormatHolder.drmInitData>
			downstreamMediaFormat = ((MediaFormat) (obj));
	//  161  347:aload_0         
	//  162  348:aload           10
	//  163  350:putfield        #404 <Field MediaFormat downstreamMediaFormat>
			downstreamDrmInitData = drminitdata;
	//  164  353:aload_0         
	//  165  354:aload           11
	//  166  356:putfield        #406 <Field DrmInitData downstreamDrmInitData>
			return -4;
	//  167  359:bipush          -4
	//  168  361:ireturn         
		}
		return -2;
	//  169  362:bipush          -2
	//  170  364:ireturn         
	}

	public long readDiscontinuity(int i)
	{
		if(pendingDiscontinuity)
	//*   0    0:aload_0         
	//*   1    1:getfield        #410 <Field boolean pendingDiscontinuity>
	//*   2    4:ifeq            17
		{
			pendingDiscontinuity = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #410 <Field boolean pendingDiscontinuity>
			return lastSeekPositionUs;
	//    6   12:aload_0         
	//    7   13:getfield        #408 <Field long lastSeekPositionUs>
	//    8   16:lreturn         
		} else
		{
			return 0x0L;
	//    9   17:ldc2w           #31  <Long 0x0L>
	//   10   20:lreturn         
		}
	}

	public com.google.android.exoplayer.SampleSource.SampleSourceReader register()
	{
		boolean flag;
		if(state == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field int state>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		Assertions.checkState(flag);
	//    8   14:iload_1         
	//    9   15:invokestatic    #356 <Method void Assertions.checkState(boolean)>
		state = 1;
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:putfield        #141 <Field int state>
		return ((com.google.android.exoplayer.SampleSource.SampleSourceReader) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
	}

	public void release()
	{
		boolean flag;
		if(state != 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field int state>
	//*   2    4:iconst_3        
	//*   3    5:icmpeq          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		Assertions.checkState(flag);
	//    9   15:iload_1         
	//   10   16:invokestatic    #356 <Method void Assertions.checkState(boolean)>
		Loader loader1 = loader;
	//   11   19:aload_0         
	//   12   20:getfield        #281 <Field Loader loader>
	//   13   23:astore_2        
		if(loader1 != null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          37
		{
			loader1.release();
	//   16   28:aload_2         
	//   17   29:invokevirtual   #541 <Method void Loader.release()>
			loader = null;
	//   18   32:aload_0         
	//   19   33:aconst_null     
	//   20   34:putfield        #281 <Field Loader loader>
		}
		state = 0;
	//   21   37:aload_0         
	//   22   38:iconst_0        
	//   23   39:putfield        #141 <Field int state>
	//   24   42:return          
	}

	public void seekToUs(long l)
	{
		int i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int state>
	//    2    4:istore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		boolean flag2;
		if(i == 3)
	//*   5    8:iload_3         
	//*   6    9:iconst_3        
	//*   7   10:icmpne          19
			flag2 = true;
	//    8   13:iconst_1        
	//    9   14:istore          7
		else
	//*  10   16:goto            22
			flag2 = false;
	//   11   19:iconst_0        
	//   12   20:istore          7
		Assertions.checkState(flag2);
	//   13   22:iload           7
	//   14   24:invokestatic    #356 <Method void Assertions.checkState(boolean)>
		long l1;
		if(isPendingReset())
	//*  15   27:aload_0         
	//*  16   28:invokespecial   #217 <Method boolean isPendingReset()>
	//*  17   31:ifeq            43
			l1 = pendingResetPositionUs;
	//   18   34:aload_0         
	//   19   35:getfield        #143 <Field long pendingResetPositionUs>
	//   20   38:lstore          5
		else
	//*  21   40:goto            49
			l1 = downstreamPositionUs;
	//   22   43:aload_0         
	//   23   44:getfield        #205 <Field long downstreamPositionUs>
	//   24   47:lstore          5
		downstreamPositionUs = l;
	//   25   49:aload_0         
	//   26   50:lload_1         
	//   27   51:putfield        #205 <Field long downstreamPositionUs>
		lastSeekPositionUs = l;
	//   28   54:aload_0         
	//   29   55:lload_1         
	//   30   56:putfield        #408 <Field long lastSeekPositionUs>
		if(l1 == l)
	//*  31   59:lload           5
	//*  32   61:lload_1         
	//*  33   62:lcmp            
	//*  34   63:ifne            67
			return;
	//   35   66:return          
		boolean flag = flag1;
	//   36   67:iload           4
	//   37   69:istore_3        
		if(!isPendingReset())
	//*  38   70:aload_0         
	//*  39   71:invokespecial   #217 <Method boolean isPendingReset()>
	//*  40   74:ifne            93
		{
			flag = flag1;
	//   41   77:iload           4
	//   42   79:istore_3        
			if(sampleQueue.skipToKeyframeBefore(l))
	//*  43   80:aload_0         
	//*  44   81:getfield        #139 <Field DefaultTrackOutput sampleQueue>
	//*  45   84:lload_1         
	//*  46   85:invokevirtual   #545 <Method boolean DefaultTrackOutput.skipToKeyframeBefore(long)>
	//*  47   88:ifeq            93
				flag = true;
	//   48   91:iconst_1        
	//   49   92:istore_3        
		}
		if(flag)
	//*  50   93:iload_3         
	//*  51   94:ifeq            159
		{
			for(boolean flag3 = sampleQueue.isEmpty(); flag3 ^ true && mediaChunks.size() > 1 && ((BaseMediaChunk)mediaChunks.get(1)).getFirstSampleIndex() <= sampleQueue.getReadIndex(); mediaChunks.removeFirst());
	//   52   97:aload_0         
	//   53   98:getfield        #139 <Field DefaultTrackOutput sampleQueue>
	//   54  101:invokevirtual   #379 <Method boolean DefaultTrackOutput.isEmpty()>
	//   55  104:istore          7
	//   56  106:iload           7
	//   57  108:iconst_1        
	//   58  109:ixor            
	//   59  110:ifeq            164
	//   60  113:aload_0         
	//   61  114:getfield        #118 <Field LinkedList mediaChunks>
	//   62  117:invokevirtual   #165 <Method int LinkedList.size()>
	//   63  120:iconst_1        
	//   64  121:icmple          164
	//   65  124:aload_0         
	//   66  125:getfield        #118 <Field LinkedList mediaChunks>
	//   67  128:iconst_1        
	//   68  129:invokevirtual   #482 <Method Object LinkedList.get(int)>
	//   69  132:checkcast       #171 <Class BaseMediaChunk>
	//   70  135:invokevirtual   #185 <Method int BaseMediaChunk.getFirstSampleIndex()>
	//   71  138:aload_0         
	//   72  139:getfield        #139 <Field DefaultTrackOutput sampleQueue>
	//   73  142:invokevirtual   #485 <Method int DefaultTrackOutput.getReadIndex()>
	//   74  145:icmpgt          164
	//   75  148:aload_0         
	//   76  149:getfield        #118 <Field LinkedList mediaChunks>
	//   77  152:invokevirtual   #488 <Method Object LinkedList.removeFirst()>
	//   78  155:pop             
		} else
	//*  79  156:goto            106
		{
			restartFrom(l);
	//   80  159:aload_0         
	//   81  160:lload_1         
	//   82  161:invokespecial   #412 <Method void restartFrom(long)>
		}
		pendingDiscontinuity = true;
	//   83  164:aload_0         
	//   84  165:iconst_1        
	//   85  166:putfield        #410 <Field boolean pendingDiscontinuity>
	//   86  169:return          
	}

	protected final long usToMs(long l)
	{
		return l / 1000L;
	//    0    0:lload_1         
	//    1    1:ldc2w           #222 <Long 1000L>
	//    2    4:ldiv            
	//    3    5:lreturn         
	}

	public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
	private static final long NO_RESET_PENDING = 0x0L;
	private static final int STATE_ENABLED = 3;
	private static final int STATE_IDLE = 0;
	private static final int STATE_INITIALIZED = 1;
	private static final int STATE_PREPARED = 2;
	private final int bufferSizeContribution;
	private final ChunkSource chunkSource;
	private long currentLoadStartTimeMs;
	private IOException currentLoadableException;
	private int currentLoadableExceptionCount;
	private long currentLoadableExceptionTimestamp;
	private final ChunkOperationHolder currentLoadableHolder;
	private DrmInitData downstreamDrmInitData;
	private Format downstreamFormat;
	private MediaFormat downstreamMediaFormat;
	private long downstreamPositionUs;
	private int enabledTrackCount;
	private final Handler eventHandler;
	private final EventListener eventListener;
	private final int eventSourceId;
	private long lastPerformedBufferOperation;
	private long lastSeekPositionUs;
	private final LoadControl loadControl;
	private Loader loader;
	private boolean loadingFinished;
	private final LinkedList mediaChunks;
	private final int minLoadableRetryCount;
	private boolean pendingDiscontinuity;
	private long pendingResetPositionUs;
	private final List readOnlyMediaChunks;
	protected final DefaultTrackOutput sampleQueue;
	private int state;


/*
	static int access$000(ChunkSampleSource chunksamplesource)
	{
		return chunksamplesource.eventSourceId;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int eventSourceId>
	//    2    4:ireturn         
	}

*/


/*
	static EventListener access$100(ChunkSampleSource chunksamplesource)
	{
		return chunksamplesource.eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field ChunkSampleSource$EventListener eventListener>
	//    2    4:areturn         
	}

*/
}
