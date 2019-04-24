// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.chunk;

import android.util.Log;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.*;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source.chunk:
//			ChunkHolder, BaseMediaChunkOutput, BaseMediaChunk, MediaChunk, 
//			ChunkSource, Chunk

public class ChunkSampleStream
	implements SampleStream, SequenceableLoader, com.google.android.exoplayer2.upstream.Loader.Callback, com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
{
	public final class EmbeddedSampleStream
		implements SampleStream
	{

		private void maybeNotifyTrackFormatChanged()
		{
			if(!formatNotificationSent)
		//*   0    0:aload_0         
		//*   1    1:getfield        #38  <Field boolean formatNotificationSent>
		//*   2    4:ifne            55
			{
				eventDispatcher.downstreamFormatChanged(embeddedTrackTypes[index], embeddedTrackFormats[index], 0, ((Object) (null)), lastSeekPositionUs);
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field ChunkSampleStream this$0>
		//    5   11:invokestatic    #42  <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher ChunkSampleStream.access$400(ChunkSampleStream)>
		//    6   14:aload_0         
		//    7   15:getfield        #23  <Field ChunkSampleStream this$0>
		//    8   18:invokestatic    #46  <Method int[] ChunkSampleStream.access$100(ChunkSampleStream)>
		//    9   21:aload_0         
		//   10   22:getfield        #32  <Field int index>
		//   11   25:iaload          
		//   12   26:aload_0         
		//   13   27:getfield        #23  <Field ChunkSampleStream this$0>
		//   14   30:invokestatic    #50  <Method Format[] ChunkSampleStream.access$200(ChunkSampleStream)>
		//   15   33:aload_0         
		//   16   34:getfield        #32  <Field int index>
		//   17   37:aaload          
		//   18   38:iconst_0        
		//   19   39:aconst_null     
		//   20   40:aload_0         
		//   21   41:getfield        #23  <Field ChunkSampleStream this$0>
		//   22   44:invokestatic    #54  <Method long ChunkSampleStream.access$300(ChunkSampleStream)>
		//   23   47:invokevirtual   #60  <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.downstreamFormatChanged(int, Format, int, Object, long)>
				formatNotificationSent = true;
		//   24   50:aload_0         
		//   25   51:iconst_1        
		//   26   52:putfield        #38  <Field boolean formatNotificationSent>
			}
		//   27   55:return          
		}

		public boolean isReady()
		{
			return loadingFinished || !isPendingReset() && sampleQueue.hasNextSample();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field ChunkSampleStream this$0>
		//    2    4:getfield        #65  <Field boolean ChunkSampleStream.loadingFinished>
		//    3    7:ifne            35
		//    4   10:aload_0         
		//    5   11:getfield        #23  <Field ChunkSampleStream this$0>
		//    6   14:invokevirtual   #68  <Method boolean ChunkSampleStream.isPendingReset()>
		//    7   17:ifne            33
		//    8   20:aload_0         
		//    9   21:getfield        #30  <Field SampleQueue sampleQueue>
		//   10   24:invokevirtual   #73  <Method boolean SampleQueue.hasNextSample()>
		//   11   27:ifeq            33
		//   12   30:goto            35
		//   13   33:iconst_0        
		//   14   34:ireturn         
		//   15   35:iconst_1        
		//   16   36:ireturn         
		}

		public void maybeThrowError()
			throws IOException
		{
		//    0    0:return          
		}

		public int readData(FormatHolder formatholder, DecoderInputBuffer decoderinputbuffer, boolean flag)
		{
			if(isPendingReset())
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field ChunkSampleStream this$0>
		//*   2    4:invokevirtual   #68  <Method boolean ChunkSampleStream.isPendingReset()>
		//*   3    7:ifeq            13
				return -3;
		//    4   10:bipush          -3
		//    5   12:ireturn         
			int i = sampleQueue.read(formatholder, decoderinputbuffer, flag, loadingFinished, decodeOnlyUntilPositionUs);
		//    6   13:aload_0         
		//    7   14:getfield        #30  <Field SampleQueue sampleQueue>
		//    8   17:aload_1         
		//    9   18:aload_2         
		//   10   19:iload_3         
		//   11   20:aload_0         
		//   12   21:getfield        #23  <Field ChunkSampleStream this$0>
		//   13   24:getfield        #65  <Field boolean ChunkSampleStream.loadingFinished>
		//   14   27:aload_0         
		//   15   28:getfield        #23  <Field ChunkSampleStream this$0>
		//   16   31:getfield        #83  <Field long ChunkSampleStream.decodeOnlyUntilPositionUs>
		//   17   34:invokevirtual   #87  <Method int SampleQueue.read(FormatHolder, DecoderInputBuffer, boolean, boolean, long)>
		//   18   37:istore          4
			if(i == -4)
		//*  19   39:iload           4
		//*  20   41:bipush          -4
		//*  21   43:icmpne          50
				maybeNotifyTrackFormatChanged();
		//   22   46:aload_0         
		//   23   47:invokespecial   #89  <Method void maybeNotifyTrackFormatChanged()>
			return i;
		//   24   50:iload           4
		//   25   52:ireturn         
		}

		public void release()
		{
			Assertions.checkState(embeddedTracksSelected[index]);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field ChunkSampleStream this$0>
		//    2    4:invokestatic    #94  <Method boolean[] ChunkSampleStream.access$000(ChunkSampleStream)>
		//    3    7:aload_0         
		//    4    8:getfield        #32  <Field int index>
		//    5   11:baload          
		//    6   12:invokestatic    #100 <Method void Assertions.checkState(boolean)>
			embeddedTracksSelected[index] = false;
		//    7   15:aload_0         
		//    8   16:getfield        #23  <Field ChunkSampleStream this$0>
		//    9   19:invokestatic    #94  <Method boolean[] ChunkSampleStream.access$000(ChunkSampleStream)>
		//   10   22:aload_0         
		//   11   23:getfield        #32  <Field int index>
		//   12   26:iconst_0        
		//   13   27:bastore         
		//   14   28:return          
		}

		public int skipData(long l)
		{
			int i;
			if(loadingFinished && l > sampleQueue.getLargestQueuedTimestampUs())
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field ChunkSampleStream this$0>
		//*   2    4:getfield        #65  <Field boolean ChunkSampleStream.loadingFinished>
		//*   3    7:ifeq            33
		//*   4   10:lload_1         
		//*   5   11:aload_0         
		//*   6   12:getfield        #30  <Field SampleQueue sampleQueue>
		//*   7   15:invokevirtual   #106 <Method long SampleQueue.getLargestQueuedTimestampUs()>
		//*   8   18:lcmp            
		//*   9   19:ifle            33
			{
				i = sampleQueue.advanceToEnd();
		//   10   22:aload_0         
		//   11   23:getfield        #30  <Field SampleQueue sampleQueue>
		//   12   26:invokevirtual   #110 <Method int SampleQueue.advanceToEnd()>
		//   13   29:istore_3        
			} else
		//*  14   30:goto            56
			{
				int j = sampleQueue.advanceTo(l, true, true);
		//   15   33:aload_0         
		//   16   34:getfield        #30  <Field SampleQueue sampleQueue>
		//   17   37:lload_1         
		//   18   38:iconst_1        
		//   19   39:iconst_1        
		//   20   40:invokevirtual   #114 <Method int SampleQueue.advanceTo(long, boolean, boolean)>
		//   21   43:istore          4
				i = j;
		//   22   45:iload           4
		//   23   47:istore_3        
				if(j == -1)
		//*  24   48:iload           4
		//*  25   50:iconst_m1       
		//*  26   51:icmpne          56
					i = 0;
		//   27   54:iconst_0        
		//   28   55:istore_3        
			}
			if(i > 0)
		//*  29   56:iload_3         
		//*  30   57:ifle            64
				maybeNotifyTrackFormatChanged();
		//   31   60:aload_0         
		//   32   61:invokespecial   #89  <Method void maybeNotifyTrackFormatChanged()>
			return i;
		//   33   64:iload_3         
		//   34   65:ireturn         
		}

		private boolean formatNotificationSent;
		private final int index;
		public final ChunkSampleStream parent;
		private final SampleQueue sampleQueue;
		final ChunkSampleStream this$0;

		public EmbeddedSampleStream(ChunkSampleStream chunksamplestream1, SampleQueue samplequeue, int i)
		{
			this$0 = ChunkSampleStream.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field ChunkSampleStream this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #26  <Method void Object()>
			parent = chunksamplestream1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #28  <Field ChunkSampleStream parent>
			sampleQueue = samplequeue;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #30  <Field SampleQueue sampleQueue>
			index = i;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #32  <Field int index>
		//   14   25:return          
		}
	}

	public static interface ReleaseCallback
	{

		public abstract void onSampleStreamReleased(ChunkSampleStream chunksamplestream);
	}


	public ChunkSampleStream(int i, int ai[], Format aformat[], ChunkSource chunksource, com.google.android.exoplayer2.source.SequenceableLoader.Callback callback1, Allocator allocator, long l, int j, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventdispatcher)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void Object()>
		primaryTrackType = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #75  <Field int primaryTrackType>
		embeddedTrackTypes = ai;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #77  <Field int[] embeddedTrackTypes>
		embeddedTrackFormats = aformat;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #79  <Field Format[] embeddedTrackFormats>
		chunkSource = chunksource;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #81  <Field ChunkSource chunkSource>
		callback = callback1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #83  <Field com.google.android.exoplayer2.source.SequenceableLoader$Callback callback>
		eventDispatcher = eventdispatcher;
	//   17   31:aload_0         
	//   18   32:aload           10
	//   19   34:putfield        #85  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
		minLoadableRetryCount = j;
	//   20   37:aload_0         
	//   21   38:iload           9
	//   22   40:putfield        #87  <Field int minLoadableRetryCount>
	//   23   43:aload_0         
	//   24   44:new             #89  <Class Loader>
	//   25   47:dup             
	//   26   48:ldc1            #91  <String "Loader:ChunkSampleStream">
	//   27   50:invokespecial   #94  <Method void Loader(String)>
	//   28   53:putfield        #96  <Field Loader loader>
	//   29   56:aload_0         
	//   30   57:new             #98  <Class ChunkHolder>
	//   31   60:dup             
	//   32   61:invokespecial   #99  <Method void ChunkHolder()>
	//   33   64:putfield        #101 <Field ChunkHolder nextChunkHolder>
	//   34   67:aload_0         
	//   35   68:new             #103 <Class ArrayList>
	//   36   71:dup             
	//   37   72:invokespecial   #104 <Method void ArrayList()>
	//   38   75:putfield        #106 <Field ArrayList mediaChunks>
		readOnlyMediaChunks = Collections.unmodifiableList(((List) (mediaChunks)));
	//   39   78:aload_0         
	//   40   79:aload_0         
	//   41   80:getfield        #106 <Field ArrayList mediaChunks>
	//   42   83:invokestatic    #112 <Method List Collections.unmodifiableList(List)>
	//   43   86:putfield        #114 <Field List readOnlyMediaChunks>
		int k = 0;
	//   44   89:iconst_0        
	//   45   90:istore          11
		if(ai == null)
	//*  46   92:aload_2         
	//*  47   93:ifnonnull       102
			j = 0;
	//   48   96:iconst_0        
	//   49   97:istore          9
		else
	//*  50   99:goto            106
			j = ai.length;
	//   51  102:aload_2         
	//   52  103:arraylength     
	//   53  104:istore          9
		embeddedSampleQueues = new SampleQueue[j];
	//   54  106:aload_0         
	//   55  107:iload           9
	//   56  109:anewarray       SampleQueue[]
	//   57  112:putfield        #118 <Field SampleQueue[] embeddedSampleQueues>
		embeddedTracksSelected = new boolean[j];
	//   58  115:aload_0         
	//   59  116:iload           9
	//   60  118:newarray        boolean[]
	//   61  120:putfield        #120 <Field boolean[] embeddedTracksSelected>
		int i1 = 1 + j;
	//   62  123:iconst_1        
	//   63  124:iload           9
	//   64  126:iadd            
	//   65  127:istore          12
		aformat = ((Format []) (new int[i1]));
	//   66  129:iload           12
	//   67  131:newarray        int[]
	//   68  133:astore_3        
		chunksource = ((ChunkSource) (new SampleQueue[i1]));
	//   69  134:iload           12
	//   70  136:anewarray       SampleQueue[]
	//   71  139:astore          4
		primarySampleQueue = new SampleQueue(allocator);
	//   72  141:aload_0         
	//   73  142:new             #116 <Class SampleQueue>
	//   74  145:dup             
	//   75  146:aload           6
	//   76  148:invokespecial   #123 <Method void SampleQueue(Allocator)>
	//   77  151:putfield        #125 <Field SampleQueue primarySampleQueue>
		aformat[0] = ((Format) (i));
	//   78  154:aload_3         
	//   79  155:iconst_0        
	//   80  156:iload_1         
	//   81  157:iastore         
		chunksource[0] = ((/*<invalid signature>*/java.lang.Object) (primarySampleQueue));
	//   82  158:aload           4
	//   83  160:iconst_0        
	//   84  161:aload_0         
	//   85  162:getfield        #125 <Field SampleQueue primarySampleQueue>
	//   86  165:aastore         
		for(i = k; i < j; i = k)
	//*  87  166:iload           11
	//*  88  168:istore_1        
	//*  89  169:iload_1         
	//*  90  170:iload           9
	//*  91  172:icmpge          219
		{
			callback1 = ((com.google.android.exoplayer2.source.SequenceableLoader.Callback) (new SampleQueue(allocator)));
	//   92  175:new             #116 <Class SampleQueue>
	//   93  178:dup             
	//   94  179:aload           6
	//   95  181:invokespecial   #123 <Method void SampleQueue(Allocator)>
	//   96  184:astore          5
			embeddedSampleQueues[i] = ((SampleQueue) (callback1));
	//   97  186:aload_0         
	//   98  187:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//   99  190:iload_1         
	//  100  191:aload           5
	//  101  193:aastore         
			k = i + 1;
	//  102  194:iload_1         
	//  103  195:iconst_1        
	//  104  196:iadd            
	//  105  197:istore          11
			chunksource[k] = ((/*<invalid signature>*/java.lang.Object) (callback1));
	//  106  199:aload           4
	//  107  201:iload           11
	//  108  203:aload           5
	//  109  205:aastore         
			aformat[k] = ((Format) (ai[i]));
	//  110  206:aload_3         
	//  111  207:iload           11
	//  112  209:aload_2         
	//  113  210:iload_1         
	//  114  211:iaload          
	//  115  212:iastore         
		}

	//  116  213:iload           11
	//  117  215:istore_1        
	//* 118  216:goto            169
		mediaChunkOutput = new BaseMediaChunkOutput(((int []) (aformat)), ((SampleQueue []) (chunksource)));
	//  119  219:aload_0         
	//  120  220:new             #127 <Class BaseMediaChunkOutput>
	//  121  223:dup             
	//  122  224:aload_3         
	//  123  225:aload           4
	//  124  227:invokespecial   #130 <Method void BaseMediaChunkOutput(int[], SampleQueue[])>
	//  125  230:putfield        #132 <Field BaseMediaChunkOutput mediaChunkOutput>
		pendingResetPositionUs = l;
	//  126  233:aload_0         
	//  127  234:lload           7
	//  128  236:putfield        #134 <Field long pendingResetPositionUs>
		lastSeekPositionUs = l;
	//  129  239:aload_0         
	//  130  240:lload           7
	//  131  242:putfield        #136 <Field long lastSeekPositionUs>
	//  132  245:return          
	}

	private void discardDownstreamMediaChunks(int i)
	{
		i = primaryStreamIndexToMediaChunkIndex(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #155 <Method int primaryStreamIndexToMediaChunkIndex(int, int)>
	//    4    6:istore_1        
		if(i > 0)
	//*   5    7:iload_1         
	//*   6    8:ifle            20
			Util.removeRange(((List) (mediaChunks)), 0, i);
	//    7   11:aload_0         
	//    8   12:getfield        #106 <Field ArrayList mediaChunks>
	//    9   15:iconst_0        
	//   10   16:iload_1         
	//   11   17:invokestatic    #161 <Method void Util.removeRange(List, int, int)>
	//   12   20:return          
	}

	private BaseMediaChunk discardUpstreamMediaChunksFromIndex(int i)
	{
		BaseMediaChunk basemediachunk = (BaseMediaChunk)mediaChunks.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field ArrayList mediaChunks>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #167 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #169 <Class BaseMediaChunk>
	//    5   11:astore_2        
		Util.removeRange(((List) (mediaChunks)), i, mediaChunks.size());
	//    6   12:aload_0         
	//    7   13:getfield        #106 <Field ArrayList mediaChunks>
	//    8   16:iload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #106 <Field ArrayList mediaChunks>
	//   11   21:invokevirtual   #173 <Method int ArrayList.size()>
	//   12   24:invokestatic    #161 <Method void Util.removeRange(List, int, int)>
		SampleQueue samplequeue = primarySampleQueue;
	//   13   27:aload_0         
	//   14   28:getfield        #125 <Field SampleQueue primarySampleQueue>
	//   15   31:astore_3        
		i = 0;
	//   16   32:iconst_0        
	//   17   33:istore_1        
		samplequeue.discardUpstreamSamples(basemediachunk.getFirstSampleIndex(0));
	//   18   34:aload_3         
	//   19   35:aload_2         
	//   20   36:iconst_0        
	//   21   37:invokevirtual   #177 <Method int BaseMediaChunk.getFirstSampleIndex(int)>
	//   22   40:invokevirtual   #180 <Method void SampleQueue.discardUpstreamSamples(int)>
		while(i < embeddedSampleQueues.length) 
	//*  23   43:iload_1         
	//*  24   44:aload_0         
	//*  25   45:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//*  26   48:arraylength     
	//*  27   49:icmpge          75
		{
			SampleQueue samplequeue1 = embeddedSampleQueues[i];
	//   28   52:aload_0         
	//   29   53:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//   30   56:iload_1         
	//   31   57:aaload          
	//   32   58:astore_3        
			i++;
	//   33   59:iload_1         
	//   34   60:iconst_1        
	//   35   61:iadd            
	//   36   62:istore_1        
			samplequeue1.discardUpstreamSamples(basemediachunk.getFirstSampleIndex(i));
	//   37   63:aload_3         
	//   38   64:aload_2         
	//   39   65:iload_1         
	//   40   66:invokevirtual   #177 <Method int BaseMediaChunk.getFirstSampleIndex(int)>
	//   41   69:invokevirtual   #180 <Method void SampleQueue.discardUpstreamSamples(int)>
		}
	//*  42   72:goto            43
		return basemediachunk;
	//   43   75:aload_2         
	//   44   76:areturn         
	}

	private BaseMediaChunk getLastMediaChunk()
	{
		return (BaseMediaChunk)mediaChunks.get(mediaChunks.size() - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field ArrayList mediaChunks>
	//    2    4:aload_0         
	//    3    5:getfield        #106 <Field ArrayList mediaChunks>
	//    4    8:invokevirtual   #173 <Method int ArrayList.size()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:invokevirtual   #167 <Method Object ArrayList.get(int)>
	//    8   16:checkcast       #169 <Class BaseMediaChunk>
	//    9   19:areturn         
	}

	private boolean haveReadFromMediaChunk(int i)
	{
		BaseMediaChunk basemediachunk = (BaseMediaChunk)mediaChunks.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field ArrayList mediaChunks>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #167 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #169 <Class BaseMediaChunk>
	//    5   11:astore          4
		if(primarySampleQueue.getReadIndex() > basemediachunk.getFirstSampleIndex(0))
	//*   6   13:aload_0         
	//*   7   14:getfield        #125 <Field SampleQueue primarySampleQueue>
	//*   8   17:invokevirtual   #187 <Method int SampleQueue.getReadIndex()>
	//*   9   20:aload           4
	//*  10   22:iconst_0        
	//*  11   23:invokevirtual   #177 <Method int BaseMediaChunk.getFirstSampleIndex(int)>
	//*  12   26:icmple          31
			return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         
		for(i = 0; i < embeddedSampleQueues.length;)
	//*  15   31:iconst_0        
	//*  16   32:istore_1        
	//*  17   33:iload_1         
	//*  18   34:aload_0         
	//*  19   35:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//*  20   38:arraylength     
	//*  21   39:icmpge          70
		{
			int k = embeddedSampleQueues[i].getReadIndex();
	//   22   42:aload_0         
	//   23   43:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//   24   46:iload_1         
	//   25   47:aaload          
	//   26   48:invokevirtual   #187 <Method int SampleQueue.getReadIndex()>
	//   27   51:istore_3        
			int j = i + 1;
	//   28   52:iload_1         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_2        
			i = j;
	//   32   56:iload_2         
	//   33   57:istore_1        
			if(k > basemediachunk.getFirstSampleIndex(j))
	//*  34   58:iload_3         
	//*  35   59:aload           4
	//*  36   61:iload_2         
	//*  37   62:invokevirtual   #177 <Method int BaseMediaChunk.getFirstSampleIndex(int)>
	//*  38   65:icmple          33
				return true;
	//   39   68:iconst_1        
	//   40   69:ireturn         
		}

		return false;
	//   41   70:iconst_0        
	//   42   71:ireturn         
	}

	private boolean isMediaChunk(Chunk chunk)
	{
		return chunk instanceof BaseMediaChunk;
	//    0    0:aload_1         
	//    1    1:instanceof      #169 <Class BaseMediaChunk>
	//    2    4:ireturn         
	}

	private void maybeNotifyPrimaryTrackFormatChanged(int i)
	{
		BaseMediaChunk basemediachunk = (BaseMediaChunk)mediaChunks.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field ArrayList mediaChunks>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #167 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #169 <Class BaseMediaChunk>
	//    5   11:astore_2        
		Format format = basemediachunk.trackFormat;
	//    6   12:aload_2         
	//    7   13:getfield        #193 <Field Format BaseMediaChunk.trackFormat>
	//    8   16:astore_3        
		if(!format.equals(((Object) (primaryDownstreamTrackFormat))))
	//*   9   17:aload_3         
	//*  10   18:aload_0         
	//*  11   19:getfield        #195 <Field Format primaryDownstreamTrackFormat>
	//*  12   22:invokevirtual   #201 <Method boolean Format.equals(Object)>
	//*  13   25:ifne            52
			eventDispatcher.downstreamFormatChanged(primaryTrackType, format, basemediachunk.trackSelectionReason, basemediachunk.trackSelectionData, basemediachunk.startTimeUs);
	//   14   28:aload_0         
	//   15   29:getfield        #85  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   16   32:aload_0         
	//   17   33:getfield        #75  <Field int primaryTrackType>
	//   18   36:aload_3         
	//   19   37:aload_2         
	//   20   38:getfield        #204 <Field int BaseMediaChunk.trackSelectionReason>
	//   21   41:aload_2         
	//   22   42:getfield        #208 <Field Object BaseMediaChunk.trackSelectionData>
	//   23   45:aload_2         
	//   24   46:getfield        #211 <Field long BaseMediaChunk.startTimeUs>
	//   25   49:invokevirtual   #217 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.downstreamFormatChanged(int, Format, int, Object, long)>
		primaryDownstreamTrackFormat = format;
	//   26   52:aload_0         
	//   27   53:aload_3         
	//   28   54:putfield        #195 <Field Format primaryDownstreamTrackFormat>
	//   29   57:return          
	}

	private void maybeNotifyPrimaryTrackFormatChanged(int i, int j)
	{
		int k = primaryStreamIndexToMediaChunkIndex(i - j, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:isub            
	//    4    4:iconst_0        
	//    5    5:invokespecial   #155 <Method int primaryStreamIndexToMediaChunkIndex(int, int)>
	//    6    8:istore_3        
		if(j == 1)
	//*   7    9:iload_2         
	//*   8   10:iconst_1        
	//*   9   11:icmpne          19
			i = k;
	//   10   14:iload_3         
	//   11   15:istore_1        
		else
	//*  12   16:goto            28
			i = primaryStreamIndexToMediaChunkIndex(i - 1, k);
	//   13   19:aload_0         
	//   14   20:iload_1         
	//   15   21:iconst_1        
	//   16   22:isub            
	//   17   23:iload_3         
	//   18   24:invokespecial   #155 <Method int primaryStreamIndexToMediaChunkIndex(int, int)>
	//   19   27:istore_1        
		for(; k <= i; k++)
	//*  20   28:iload_3         
	//*  21   29:iload_1         
	//*  22   30:icmpgt          45
			maybeNotifyPrimaryTrackFormatChanged(k);
	//   23   33:aload_0         
	//   24   34:iload_3         
	//   25   35:invokespecial   #220 <Method void maybeNotifyPrimaryTrackFormatChanged(int)>

	//   26   38:iload_3         
	//   27   39:iconst_1        
	//   28   40:iadd            
	//   29   41:istore_3        
	//*  30   42:goto            28
	//   31   45:return          
	}

	private int primaryStreamIndexToMediaChunkIndex(int i, int j)
	{
		do
		{
			int k = j + 1;
	//    0    0:iload_2         
	//    1    1:iconst_1        
	//    2    2:iadd            
	//    3    3:istore_3        
			if(k < mediaChunks.size())
	//*   4    4:iload_3         
	//*   5    5:aload_0         
	//*   6    6:getfield        #106 <Field ArrayList mediaChunks>
	//*   7    9:invokevirtual   #173 <Method int ArrayList.size()>
	//*   8   12:icmpge          40
			{
				j = k;
	//    9   15:iload_3         
	//   10   16:istore_2        
				if(((BaseMediaChunk)mediaChunks.get(k)).getFirstSampleIndex(0) > i)
	//*  11   17:aload_0         
	//*  12   18:getfield        #106 <Field ArrayList mediaChunks>
	//*  13   21:iload_3         
	//*  14   22:invokevirtual   #167 <Method Object ArrayList.get(int)>
	//*  15   25:checkcast       #169 <Class BaseMediaChunk>
	//*  16   28:iconst_0        
	//*  17   29:invokevirtual   #177 <Method int BaseMediaChunk.getFirstSampleIndex(int)>
	//*  18   32:iload_1         
	//*  19   33:icmple          0
					return k - 1;
	//   20   36:iload_3         
	//   21   37:iconst_1        
	//   22   38:isub            
	//   23   39:ireturn         
			} else
			{
				return mediaChunks.size() - 1;
	//   24   40:aload_0         
	//   25   41:getfield        #106 <Field ArrayList mediaChunks>
	//   26   44:invokevirtual   #173 <Method int ArrayList.size()>
	//   27   47:iconst_1        
	//   28   48:isub            
	//   29   49:ireturn         
			}
		} while(true);
	}

	public boolean continueLoading(long l)
	{
		boolean flag1 = loadingFinished;
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field boolean loadingFinished>
	//    2    4:istore          6
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(!flag1)
	//*   5    8:iload           6
	//*   6   10:ifne            280
		{
			if(loader.isLoading())
	//*   7   13:aload_0         
	//*   8   14:getfield        #96  <Field Loader loader>
	//*   9   17:invokevirtual   #228 <Method boolean Loader.isLoading()>
	//*  10   20:ifeq            25
				return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
			boolean flag2 = isPendingReset();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #231 <Method boolean isPendingReset()>
	//   15   29:istore          6
			long l1;
			Object obj;
			if(flag2)
	//*  16   31:iload           6
	//*  17   33:ifeq            48
			{
				obj = null;
	//   18   36:aconst_null     
	//   19   37:astore          8
				l1 = pendingResetPositionUs;
	//   20   39:aload_0         
	//   21   40:getfield        #134 <Field long pendingResetPositionUs>
	//   22   43:lstore          4
			} else
	//*  23   45:goto            64
			{
				obj = ((Object) (getLastMediaChunk()));
	//   24   48:aload_0         
	//   25   49:invokespecial   #233 <Method BaseMediaChunk getLastMediaChunk()>
	//   26   52:astore          8
				l1 = ((MediaChunk) (obj)).endTimeUs;
	//   27   54:aload           8
	//   28   56:getfield        #238 <Field long MediaChunk.endTimeUs>
	//   29   59:lstore          4
			}
	//*  30   61:goto            45
			chunkSource.getNextChunk(((MediaChunk) (obj)), l, l1, nextChunkHolder);
	//   31   64:aload_0         
	//   32   65:getfield        #81  <Field ChunkSource chunkSource>
	//   33   68:aload           8
	//   34   70:lload_1         
	//   35   71:lload           4
	//   36   73:aload_0         
	//   37   74:getfield        #101 <Field ChunkHolder nextChunkHolder>
	//   38   77:invokeinterface #244 <Method void ChunkSource.getNextChunk(MediaChunk, long, long, ChunkHolder)>
			boolean flag3 = nextChunkHolder.endOfStream;
	//   39   82:aload_0         
	//   40   83:getfield        #101 <Field ChunkHolder nextChunkHolder>
	//   41   86:getfield        #247 <Field boolean ChunkHolder.endOfStream>
	//   42   89:istore          7
			obj = ((Object) (nextChunkHolder.chunk));
	//   43   91:aload_0         
	//   44   92:getfield        #101 <Field ChunkHolder nextChunkHolder>
	//   45   95:getfield        #251 <Field Chunk ChunkHolder.chunk>
	//   46   98:astore          8
			nextChunkHolder.clear();
	//   47  100:aload_0         
	//   48  101:getfield        #101 <Field ChunkHolder nextChunkHolder>
	//   49  104:invokevirtual   #254 <Method void ChunkHolder.clear()>
			if(flag3)
	//*  50  107:iload           7
	//*  51  109:ifeq            126
			{
				pendingResetPositionUs = 0x1L;
	//   52  112:aload_0         
	//   53  113:ldc2w           #255 <Long 0x1L>
	//   54  116:putfield        #134 <Field long pendingResetPositionUs>
				loadingFinished = true;
	//   55  119:aload_0         
	//   56  120:iconst_1        
	//   57  121:putfield        #224 <Field boolean loadingFinished>
				return true;
	//   58  124:iconst_1        
	//   59  125:ireturn         
			}
			if(obj == null)
	//*  60  126:aload           8
	//*  61  128:ifnonnull       133
				return false;
	//   62  131:iconst_0        
	//   63  132:ireturn         
			if(isMediaChunk(((Chunk) (obj))))
	//*  64  133:aload_0         
	//*  65  134:aload           8
	//*  66  136:invokespecial   #258 <Method boolean isMediaChunk(Chunk)>
	//*  67  139:ifeq            216
			{
				BaseMediaChunk basemediachunk = (BaseMediaChunk)obj;
	//   68  142:aload           8
	//   69  144:checkcast       #169 <Class BaseMediaChunk>
	//   70  147:astore          9
				if(flag2)
	//*  71  149:iload           6
	//*  72  151:ifeq            197
				{
					if(basemediachunk.startTimeUs == pendingResetPositionUs)
	//*  73  154:aload           9
	//*  74  156:getfield        #211 <Field long BaseMediaChunk.startTimeUs>
	//*  75  159:aload_0         
	//*  76  160:getfield        #134 <Field long pendingResetPositionUs>
	//*  77  163:lcmp            
	//*  78  164:ifne            169
						flag = true;
	//   79  167:iconst_1        
	//   80  168:istore_3        
					if(flag)
	//*  81  169:iload_3         
	//*  82  170:ifeq            180
						l = 0x0L;
	//   83  173:ldc2w           #259 <Long 0x0L>
	//   84  176:lstore_1        
					else
	//*  85  177:goto            185
						l = pendingResetPositionUs;
	//   86  180:aload_0         
	//   87  181:getfield        #134 <Field long pendingResetPositionUs>
	//   88  184:lstore_1        
					decodeOnlyUntilPositionUs = l;
	//   89  185:aload_0         
	//   90  186:lload_1         
	//   91  187:putfield        #262 <Field long decodeOnlyUntilPositionUs>
					pendingResetPositionUs = 0x1L;
	//   92  190:aload_0         
	//   93  191:ldc2w           #255 <Long 0x1L>
	//   94  194:putfield        #134 <Field long pendingResetPositionUs>
				}
				basemediachunk.init(mediaChunkOutput);
	//   95  197:aload           9
	//   96  199:aload_0         
	//   97  200:getfield        #132 <Field BaseMediaChunkOutput mediaChunkOutput>
	//   98  203:invokevirtual   #266 <Method void BaseMediaChunk.init(BaseMediaChunkOutput)>
				mediaChunks.add(((Object) (basemediachunk)));
	//   99  206:aload_0         
	//  100  207:getfield        #106 <Field ArrayList mediaChunks>
	//  101  210:aload           9
	//  102  212:invokevirtual   #269 <Method boolean ArrayList.add(Object)>
	//  103  215:pop             
			}
			l = loader.startLoading(((com.google.android.exoplayer2.upstream.Loader.Loadable) (obj)), ((com.google.android.exoplayer2.upstream.Loader.Callback) (this)), minLoadableRetryCount);
	//  104  216:aload_0         
	//  105  217:getfield        #96  <Field Loader loader>
	//  106  220:aload           8
	//  107  222:aload_0         
	//  108  223:aload_0         
	//  109  224:getfield        #87  <Field int minLoadableRetryCount>
	//  110  227:invokevirtual   #273 <Method long Loader.startLoading(com.google.android.exoplayer2.upstream.Loader$Loadable, com.google.android.exoplayer2.upstream.Loader$Callback, int)>
	//  111  230:lstore_1        
			eventDispatcher.loadStarted(((Chunk) (obj)).dataSpec, ((Chunk) (obj)).type, primaryTrackType, ((Chunk) (obj)).trackFormat, ((Chunk) (obj)).trackSelectionReason, ((Chunk) (obj)).trackSelectionData, ((Chunk) (obj)).startTimeUs, ((Chunk) (obj)).endTimeUs, l);
	//  112  231:aload_0         
	//  113  232:getfield        #85  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//  114  235:aload           8
	//  115  237:getfield        #279 <Field com.google.android.exoplayer2.upstream.DataSpec Chunk.dataSpec>
	//  116  240:aload           8
	//  117  242:getfield        #282 <Field int Chunk.type>
	//  118  245:aload_0         
	//  119  246:getfield        #75  <Field int primaryTrackType>
	//  120  249:aload           8
	//  121  251:getfield        #283 <Field Format Chunk.trackFormat>
	//  122  254:aload           8
	//  123  256:getfield        #284 <Field int Chunk.trackSelectionReason>
	//  124  259:aload           8
	//  125  261:getfield        #285 <Field Object Chunk.trackSelectionData>
	//  126  264:aload           8
	//  127  266:getfield        #286 <Field long Chunk.startTimeUs>
	//  128  269:aload           8
	//  129  271:getfield        #287 <Field long Chunk.endTimeUs>
	//  130  274:lload_1         
	//  131  275:invokevirtual   #291 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadStarted(com.google.android.exoplayer2.upstream.DataSpec, int, int, Format, int, Object, long, long, long)>
			return true;
	//  132  278:iconst_1        
	//  133  279:ireturn         
		} else
		{
			return false;
	//  134  280:iconst_0        
	//  135  281:ireturn         
		}
	}

	public void discardBuffer(long l, boolean flag)
	{
		int i = primarySampleQueue.getFirstIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field SampleQueue primarySampleQueue>
	//    2    4:invokevirtual   #296 <Method int SampleQueue.getFirstIndex()>
	//    3    7:istore          4
		primarySampleQueue.discardTo(l, flag, true);
	//    4    9:aload_0         
	//    5   10:getfield        #125 <Field SampleQueue primarySampleQueue>
	//    6   13:lload_1         
	//    7   14:iload_3         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #300 <Method void SampleQueue.discardTo(long, boolean, boolean)>
		int k = primarySampleQueue.getFirstIndex();
	//   10   19:aload_0         
	//   11   20:getfield        #125 <Field SampleQueue primarySampleQueue>
	//   12   23:invokevirtual   #296 <Method int SampleQueue.getFirstIndex()>
	//   13   26:istore          5
		if(k > i)
	//*  14   28:iload           5
	//*  15   30:iload           4
	//*  16   32:icmple          90
		{
			l = primarySampleQueue.getFirstTimestampUs();
	//   17   35:aload_0         
	//   18   36:getfield        #125 <Field SampleQueue primarySampleQueue>
	//   19   39:invokevirtual   #304 <Method long SampleQueue.getFirstTimestampUs()>
	//   20   42:lstore_1        
			for(int j = 0; j < embeddedSampleQueues.length; j++)
	//*  21   43:iconst_0        
	//*  22   44:istore          4
	//*  23   46:iload           4
	//*  24   48:aload_0         
	//*  25   49:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//*  26   52:arraylength     
	//*  27   53:icmpge          84
				embeddedSampleQueues[j].discardTo(l, flag, embeddedTracksSelected[j]);
	//   28   56:aload_0         
	//   29   57:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//   30   60:iload           4
	//   31   62:aaload          
	//   32   63:lload_1         
	//   33   64:iload_3         
	//   34   65:aload_0         
	//   35   66:getfield        #120 <Field boolean[] embeddedTracksSelected>
	//   36   69:iload           4
	//   37   71:baload          
	//   38   72:invokevirtual   #300 <Method void SampleQueue.discardTo(long, boolean, boolean)>

	//   39   75:iload           4
	//   40   77:iconst_1        
	//   41   78:iadd            
	//   42   79:istore          4
	//*  43   81:goto            46
			discardDownstreamMediaChunks(k);
	//   44   84:aload_0         
	//   45   85:iload           5
	//   46   87:invokespecial   #306 <Method void discardDownstreamMediaChunks(int)>
		}
	//   47   90:return          
	}

	public long getAdjustedSeekPositionUs(long l, SeekParameters seekparameters)
	{
		return chunkSource.getAdjustedSeekPositionUs(l, seekparameters);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field ChunkSource chunkSource>
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:invokeinterface #310 <Method long ChunkSource.getAdjustedSeekPositionUs(long, SeekParameters)>
	//    5   11:lreturn         
	}

	public long getBufferedPositionUs()
	{
		if(loadingFinished)
	//*   0    0:aload_0         
	//*   1    1:getfield        #224 <Field boolean loadingFinished>
	//*   2    4:ifeq            11
			return 0x0L;
	//    3    7:ldc2w           #259 <Long 0x0L>
	//    4   10:lreturn         
		if(isPendingReset())
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #231 <Method boolean isPendingReset()>
	//*   7   15:ifeq            23
			return pendingResetPositionUs;
	//    8   18:aload_0         
	//    9   19:getfield        #134 <Field long pendingResetPositionUs>
	//   10   22:lreturn         
		long l1 = lastSeekPositionUs;
	//   11   23:aload_0         
	//   12   24:getfield        #136 <Field long lastSeekPositionUs>
	//   13   27:lstore_3        
		BaseMediaChunk basemediachunk = getLastMediaChunk();
	//   14   28:aload_0         
	//   15   29:invokespecial   #233 <Method BaseMediaChunk getLastMediaChunk()>
	//   16   32:astore          5
		if(!basemediachunk.isLoadCompleted())
	//*  17   34:aload           5
	//*  18   36:invokevirtual   #314 <Method boolean BaseMediaChunk.isLoadCompleted()>
	//*  19   39:ifeq            45
	//*  20   42:goto            83
			if(mediaChunks.size() > 1)
	//*  21   45:aload_0         
	//*  22   46:getfield        #106 <Field ArrayList mediaChunks>
	//*  23   49:invokevirtual   #173 <Method int ArrayList.size()>
	//*  24   52:iconst_1        
	//*  25   53:icmple          80
				basemediachunk = (BaseMediaChunk)mediaChunks.get(mediaChunks.size() - 2);
	//   26   56:aload_0         
	//   27   57:getfield        #106 <Field ArrayList mediaChunks>
	//   28   60:aload_0         
	//   29   61:getfield        #106 <Field ArrayList mediaChunks>
	//   30   64:invokevirtual   #173 <Method int ArrayList.size()>
	//   31   67:iconst_2        
	//   32   68:isub            
	//   33   69:invokevirtual   #167 <Method Object ArrayList.get(int)>
	//   34   72:checkcast       #169 <Class BaseMediaChunk>
	//   35   75:astore          5
			else
	//*  36   77:goto            83
				basemediachunk = null;
	//   37   80:aconst_null     
	//   38   81:astore          5
		long l = l1;
	//   39   83:lload_3         
	//   40   84:lstore_1        
		if(basemediachunk != null)
	//*  41   85:aload           5
	//*  42   87:ifnull          100
			l = Math.max(l1, basemediachunk.endTimeUs);
	//   43   90:lload_3         
	//   44   91:aload           5
	//   45   93:getfield        #315 <Field long BaseMediaChunk.endTimeUs>
	//   46   96:invokestatic    #321 <Method long Math.max(long, long)>
	//   47   99:lstore_1        
		return Math.max(l, primarySampleQueue.getLargestQueuedTimestampUs());
	//   48  100:lload_1         
	//   49  101:aload_0         
	//   50  102:getfield        #125 <Field SampleQueue primarySampleQueue>
	//   51  105:invokevirtual   #324 <Method long SampleQueue.getLargestQueuedTimestampUs()>
	//   52  108:invokestatic    #321 <Method long Math.max(long, long)>
	//   53  111:lreturn         
	}

	public ChunkSource getChunkSource()
	{
		return chunkSource;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field ChunkSource chunkSource>
	//    2    4:areturn         
	}

	public long getNextLoadPositionUs()
	{
		if(isPendingReset())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #231 <Method boolean isPendingReset()>
	//*   2    4:ifeq            12
			return pendingResetPositionUs;
	//    3    7:aload_0         
	//    4    8:getfield        #134 <Field long pendingResetPositionUs>
	//    5   11:lreturn         
		if(loadingFinished)
	//*   6   12:aload_0         
	//*   7   13:getfield        #224 <Field boolean loadingFinished>
	//*   8   16:ifeq            23
			return 0x0L;
	//    9   19:ldc2w           #259 <Long 0x0L>
	//   10   22:lreturn         
		else
			return getLastMediaChunk().endTimeUs;
	//   11   23:aload_0         
	//   12   24:invokespecial   #233 <Method BaseMediaChunk getLastMediaChunk()>
	//   13   27:getfield        #315 <Field long BaseMediaChunk.endTimeUs>
	//   14   30:lreturn         
	}

	boolean isPendingReset()
	{
		return pendingResetPositionUs != 0x1L;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field long pendingResetPositionUs>
	//    2    4:ldc2w           #255 <Long 0x1L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean isReady()
	{
		return loadingFinished || !isPendingReset() && primarySampleQueue.hasNextSample();
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field boolean loadingFinished>
	//    2    4:ifne            29
	//    3    7:aload_0         
	//    4    8:invokevirtual   #231 <Method boolean isPendingReset()>
	//    5   11:ifne            27
	//    6   14:aload_0         
	//    7   15:getfield        #125 <Field SampleQueue primarySampleQueue>
	//    8   18:invokevirtual   #332 <Method boolean SampleQueue.hasNextSample()>
	//    9   21:ifeq            27
	//   10   24:goto            29
	//   11   27:iconst_0        
	//   12   28:ireturn         
	//   13   29:iconst_1        
	//   14   30:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		loader.maybeThrowError();
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field Loader loader>
	//    2    4:invokevirtual   #337 <Method void Loader.maybeThrowError()>
		if(!loader.isLoading())
	//*   3    7:aload_0         
	//*   4    8:getfield        #96  <Field Loader loader>
	//*   5   11:invokevirtual   #228 <Method boolean Loader.isLoading()>
	//*   6   14:ifne            26
			chunkSource.maybeThrowError();
	//    7   17:aload_0         
	//    8   18:getfield        #81  <Field ChunkSource chunkSource>
	//    9   21:invokeinterface #338 <Method void ChunkSource.maybeThrowError()>
	//   10   26:return          
	}

	public void onLoadCanceled(Chunk chunk, long l, long l1, boolean flag)
	{
		eventDispatcher.loadCanceled(chunk.dataSpec, chunk.type, primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, l, l1, chunk.bytesLoaded());
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    2    4:aload_1         
	//    3    5:getfield        #279 <Field com.google.android.exoplayer2.upstream.DataSpec Chunk.dataSpec>
	//    4    8:aload_1         
	//    5    9:getfield        #282 <Field int Chunk.type>
	//    6   12:aload_0         
	//    7   13:getfield        #75  <Field int primaryTrackType>
	//    8   16:aload_1         
	//    9   17:getfield        #283 <Field Format Chunk.trackFormat>
	//   10   20:aload_1         
	//   11   21:getfield        #284 <Field int Chunk.trackSelectionReason>
	//   12   24:aload_1         
	//   13   25:getfield        #285 <Field Object Chunk.trackSelectionData>
	//   14   28:aload_1         
	//   15   29:getfield        #286 <Field long Chunk.startTimeUs>
	//   16   32:aload_1         
	//   17   33:getfield        #287 <Field long Chunk.endTimeUs>
	//   18   36:lload_2         
	//   19   37:lload           4
	//   20   39:aload_1         
	//   21   40:invokevirtual   #344 <Method long Chunk.bytesLoaded()>
	//   22   43:invokevirtual   #348 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadCanceled(com.google.android.exoplayer2.upstream.DataSpec, int, int, Format, int, Object, long, long, long, long, long)>
		if(!flag)
	//*  23   46:iload           6
	//*  24   48:ifne            103
		{
			primarySampleQueue.reset();
	//   25   51:aload_0         
	//   26   52:getfield        #125 <Field SampleQueue primarySampleQueue>
	//   27   55:invokevirtual   #351 <Method void SampleQueue.reset()>
			chunk = ((Chunk) (embeddedSampleQueues));
	//   28   58:aload_0         
	//   29   59:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//   30   62:astore_1        
			int j = chunk.length;
	//   31   63:aload_1         
	//   32   64:arraylength     
	//   33   65:istore          8
			for(int i = 0; i < j; i++)
	//*  34   67:iconst_0        
	//*  35   68:istore          7
	//*  36   70:iload           7
	//*  37   72:iload           8
	//*  38   74:icmpge          93
				((SampleQueue) (chunk[i])).reset();
	//   39   77:aload_1         
	//   40   78:iload           7
	//   41   80:aaload          
	//   42   81:invokevirtual   #351 <Method void SampleQueue.reset()>

	//   43   84:iload           7
	//   44   86:iconst_1        
	//   45   87:iadd            
	//   46   88:istore          7
	//*  47   90:goto            70
			callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//   48   93:aload_0         
	//   49   94:getfield        #83  <Field com.google.android.exoplayer2.source.SequenceableLoader$Callback callback>
	//   50   97:aload_0         
	//   51   98:invokeinterface #357 <Method void com.google.android.exoplayer2.source.SequenceableLoader$Callback.onContinueLoadingRequested(SequenceableLoader)>
		}
	//   52  103:return          
	}

	public volatile void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, boolean flag)
	{
		onLoadCanceled((Chunk)loadable, l, l1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #275 <Class Chunk>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:iload           6
	//    6   10:invokevirtual   #360 <Method void onLoadCanceled(Chunk, long, long, boolean)>
	//    7   13:return          
	}

	public void onLoadCompleted(Chunk chunk, long l, long l1)
	{
		chunkSource.onChunkLoadCompleted(chunk);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field ChunkSource chunkSource>
	//    2    4:aload_1         
	//    3    5:invokeinterface #366 <Method void ChunkSource.onChunkLoadCompleted(Chunk)>
		eventDispatcher.loadCompleted(chunk.dataSpec, chunk.type, primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, l, l1, chunk.bytesLoaded());
	//    4   10:aload_0         
	//    5   11:getfield        #85  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    6   14:aload_1         
	//    7   15:getfield        #279 <Field com.google.android.exoplayer2.upstream.DataSpec Chunk.dataSpec>
	//    8   18:aload_1         
	//    9   19:getfield        #282 <Field int Chunk.type>
	//   10   22:aload_0         
	//   11   23:getfield        #75  <Field int primaryTrackType>
	//   12   26:aload_1         
	//   13   27:getfield        #283 <Field Format Chunk.trackFormat>
	//   14   30:aload_1         
	//   15   31:getfield        #284 <Field int Chunk.trackSelectionReason>
	//   16   34:aload_1         
	//   17   35:getfield        #285 <Field Object Chunk.trackSelectionData>
	//   18   38:aload_1         
	//   19   39:getfield        #286 <Field long Chunk.startTimeUs>
	//   20   42:aload_1         
	//   21   43:getfield        #287 <Field long Chunk.endTimeUs>
	//   22   46:lload_2         
	//   23   47:lload           4
	//   24   49:aload_1         
	//   25   50:invokevirtual   #344 <Method long Chunk.bytesLoaded()>
	//   26   53:invokevirtual   #369 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadCompleted(com.google.android.exoplayer2.upstream.DataSpec, int, int, Format, int, Object, long, long, long, long, long)>
		callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//   27   56:aload_0         
	//   28   57:getfield        #83  <Field com.google.android.exoplayer2.source.SequenceableLoader$Callback callback>
	//   29   60:aload_0         
	//   30   61:invokeinterface #357 <Method void com.google.android.exoplayer2.source.SequenceableLoader$Callback.onContinueLoadingRequested(SequenceableLoader)>
	//   31   66:return          
	}

	public volatile void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1)
	{
		onLoadCompleted((Chunk)loadable, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #275 <Class Chunk>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #372 <Method void onLoadCompleted(Chunk, long, long)>
	//    6   11:return          
	}

	public int onLoadError(Chunk chunk, long l, long l1, IOException ioexception)
	{
		long l2;
		boolean flag;
label0:
		{
			l2 = chunk.bytesLoaded();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #344 <Method long Chunk.bytesLoaded()>
	//    2    4:lstore          8
			boolean flag1 = isMediaChunk(chunk);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #258 <Method boolean isMediaChunk(Chunk)>
	//    6   11:istore          11
			int i = mediaChunks.size() - 1;
	//    7   13:aload_0         
	//    8   14:getfield        #106 <Field ArrayList mediaChunks>
	//    9   17:invokevirtual   #173 <Method int ArrayList.size()>
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:istore          7
			if(l2 != 0L && flag1 && haveReadFromMediaChunk(i))
	//*  13   24:lload           8
	//*  14   26:lconst_0        
	//*  15   27:lcmp            
	//*  16   28:ifeq            54
	//*  17   31:iload           11
	//*  18   33:ifeq            54
	//*  19   36:aload_0         
	//*  20   37:iload           7
	//*  21   39:invokespecial   #376 <Method boolean haveReadFromMediaChunk(int)>
	//*  22   42:ifne            48
	//*  23   45:goto            54
				flag = false;
	//   24   48:iconst_0        
	//   25   49:istore          10
			else
	//*  26   51:goto            57
				flag = true;
	//   27   54:iconst_1        
	//   28   55:istore          10
			if(chunkSource.onChunkLoadError(chunk, flag, ((Exception) (ioexception))))
	//*  29   57:aload_0         
	//*  30   58:getfield        #81  <Field ChunkSource chunkSource>
	//*  31   61:aload_1         
	//*  32   62:iload           10
	//*  33   64:aload           6
	//*  34   66:invokeinterface #380 <Method boolean ChunkSource.onChunkLoadError(Chunk, boolean, Exception)>
	//*  35   71:ifeq            144
				if(!flag)
	//*  36   74:iload           10
	//*  37   76:ifne            91
				{
					Log.w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
	//   38   79:ldc1            #23  <String "ChunkSampleStream">
	//   39   81:ldc2            #382 <String "Ignoring attempt to cancel non-cancelable load.">
	//   40   84:invokestatic    #388 <Method int Log.w(String, String)>
	//   41   87:pop             
				} else
	//*  42   88:goto            144
				{
					if(flag1)
	//*  43   91:iload           11
	//*  44   93:ifeq            138
					{
						if(discardUpstreamMediaChunksFromIndex(i) == chunk)
	//*  45   96:aload_0         
	//*  46   97:iload           7
	//*  47   99:invokespecial   #390 <Method BaseMediaChunk discardUpstreamMediaChunksFromIndex(int)>
	//*  48  102:aload_1         
	//*  49  103:if_acmpne       112
							flag = true;
	//   50  106:iconst_1        
	//   51  107:istore          10
						else
	//*  52  109:goto            115
							flag = false;
	//   53  112:iconst_0        
	//   54  113:istore          10
						Assertions.checkState(flag);
	//   55  115:iload           10
	//   56  117:invokestatic    #396 <Method void Assertions.checkState(boolean)>
						if(mediaChunks.isEmpty())
	//*  57  120:aload_0         
	//*  58  121:getfield        #106 <Field ArrayList mediaChunks>
	//*  59  124:invokevirtual   #399 <Method boolean ArrayList.isEmpty()>
	//*  60  127:ifeq            138
							pendingResetPositionUs = lastSeekPositionUs;
	//   61  130:aload_0         
	//   62  131:aload_0         
	//   63  132:getfield        #136 <Field long lastSeekPositionUs>
	//   64  135:putfield        #134 <Field long pendingResetPositionUs>
					}
					flag = true;
	//   65  138:iconst_1        
	//   66  139:istore          10
					break label0;
	//   67  141:goto            147
				}
			flag = false;
	//   68  144:iconst_0        
	//   69  145:istore          10
		}
		eventDispatcher.loadError(chunk.dataSpec, chunk.type, primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, l, l1, l2, ioexception, flag);
	//   70  147:aload_0         
	//   71  148:getfield        #85  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   72  151:aload_1         
	//   73  152:getfield        #279 <Field com.google.android.exoplayer2.upstream.DataSpec Chunk.dataSpec>
	//   74  155:aload_1         
	//   75  156:getfield        #282 <Field int Chunk.type>
	//   76  159:aload_0         
	//   77  160:getfield        #75  <Field int primaryTrackType>
	//   78  163:aload_1         
	//   79  164:getfield        #283 <Field Format Chunk.trackFormat>
	//   80  167:aload_1         
	//   81  168:getfield        #284 <Field int Chunk.trackSelectionReason>
	//   82  171:aload_1         
	//   83  172:getfield        #285 <Field Object Chunk.trackSelectionData>
	//   84  175:aload_1         
	//   85  176:getfield        #286 <Field long Chunk.startTimeUs>
	//   86  179:aload_1         
	//   87  180:getfield        #287 <Field long Chunk.endTimeUs>
	//   88  183:lload_2         
	//   89  184:lload           4
	//   90  186:lload           8
	//   91  188:aload           6
	//   92  190:iload           10
	//   93  192:invokevirtual   #403 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadError(com.google.android.exoplayer2.upstream.DataSpec, int, int, Format, int, Object, long, long, long, long, long, IOException, boolean)>
		if(flag)
	//*  94  195:iload           10
	//*  95  197:ifeq            212
		{
			callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//   96  200:aload_0         
	//   97  201:getfield        #83  <Field com.google.android.exoplayer2.source.SequenceableLoader$Callback callback>
	//   98  204:aload_0         
	//   99  205:invokeinterface #357 <Method void com.google.android.exoplayer2.source.SequenceableLoader$Callback.onContinueLoadingRequested(SequenceableLoader)>
			return 2;
	//  100  210:iconst_2        
	//  101  211:ireturn         
		} else
		{
			return 0;
	//  102  212:iconst_0        
	//  103  213:ireturn         
		}
	}

	public volatile int onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, IOException ioexception)
	{
		return onLoadError((Chunk)loadable, l, l1, ioexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #275 <Class Chunk>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:aload           6
	//    6   10:invokevirtual   #406 <Method int onLoadError(Chunk, long, long, IOException)>
	//    7   13:ireturn         
	}

	public void onLoaderReleased()
	{
		primarySampleQueue.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field SampleQueue primarySampleQueue>
	//    2    4:invokevirtual   #351 <Method void SampleQueue.reset()>
		SampleQueue asamplequeue[] = embeddedSampleQueues;
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//    5   11:astore_3        
		int i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		for(int j = asamplequeue.length; i < j; i++)
	//*   8   14:aload_3         
	//*   9   15:arraylength     
	//*  10   16:istore_2        
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          35
			asamplequeue[i].reset();
	//   14   22:aload_3         
	//   15   23:iload_1         
	//   16   24:aaload          
	//   17   25:invokevirtual   #351 <Method void SampleQueue.reset()>

	//   18   28:iload_1         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:istore_1        
	//*  22   32:goto            17
		if(releaseCallback != null)
	//*  23   35:aload_0         
	//*  24   36:getfield        #409 <Field ChunkSampleStream$ReleaseCallback releaseCallback>
	//*  25   39:ifnull          52
			releaseCallback.onSampleStreamReleased(this);
	//   26   42:aload_0         
	//   27   43:getfield        #409 <Field ChunkSampleStream$ReleaseCallback releaseCallback>
	//   28   46:aload_0         
	//   29   47:invokeinterface #413 <Method void ChunkSampleStream$ReleaseCallback.onSampleStreamReleased(ChunkSampleStream)>
	//   30   52:return          
	}

	public int readData(FormatHolder formatholder, DecoderInputBuffer decoderinputbuffer, boolean flag)
	{
		if(isPendingReset())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #231 <Method boolean isPendingReset()>
	//*   2    4:ifeq            10
			return -3;
	//    3    7:bipush          -3
	//    4    9:ireturn         
		int i = primarySampleQueue.read(formatholder, decoderinputbuffer, flag, loadingFinished, decodeOnlyUntilPositionUs);
	//    5   10:aload_0         
	//    6   11:getfield        #125 <Field SampleQueue primarySampleQueue>
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:iload_3         
	//   10   17:aload_0         
	//   11   18:getfield        #224 <Field boolean loadingFinished>
	//   12   21:aload_0         
	//   13   22:getfield        #262 <Field long decodeOnlyUntilPositionUs>
	//   14   25:invokevirtual   #419 <Method int SampleQueue.read(FormatHolder, DecoderInputBuffer, boolean, boolean, long)>
	//   15   28:istore          4
		if(i == -4)
	//*  16   30:iload           4
	//*  17   32:bipush          -4
	//*  18   34:icmpne          49
			maybeNotifyPrimaryTrackFormatChanged(primarySampleQueue.getReadIndex(), 1);
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #125 <Field SampleQueue primarySampleQueue>
	//   22   42:invokevirtual   #187 <Method int SampleQueue.getReadIndex()>
	//   23   45:iconst_1        
	//   24   46:invokespecial   #421 <Method void maybeNotifyPrimaryTrackFormatChanged(int, int)>
		return i;
	//   25   49:iload           4
	//   26   51:ireturn         
	}

	public void reevaluateBuffer(long l)
	{
label0:
		{
			int i;
			int j;
label1:
			{
				if(loader.isLoading())
					break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field Loader loader>
	//    2    4:invokevirtual   #228 <Method boolean Loader.isLoading()>
	//    3    7:ifne            144
				if(isPendingReset())
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #231 <Method boolean isPendingReset()>
	//*   6   14:ifeq            18
					return;
	//    7   17:return          
				j = mediaChunks.size();
	//    8   18:aload_0         
	//    9   19:getfield        #106 <Field ArrayList mediaChunks>
	//   10   22:invokevirtual   #173 <Method int ArrayList.size()>
	//   11   25:istore          4
				int k = chunkSource.getPreferredQueueSize(l, readOnlyMediaChunks);
	//   12   27:aload_0         
	//   13   28:getfield        #81  <Field ChunkSource chunkSource>
	//   14   31:lload_1         
	//   15   32:aload_0         
	//   16   33:getfield        #114 <Field List readOnlyMediaChunks>
	//   17   36:invokeinterface #427 <Method int ChunkSource.getPreferredQueueSize(long, List)>
	//   18   41:istore          5
				i = k;
	//   19   43:iload           5
	//   20   45:istore_3        
				if(j <= k)
	//*  21   46:iload           4
	//*  22   48:iload           5
	//*  23   50:icmpgt          54
					return;
	//   24   53:return          
				for(; i < j; i++)
	//*  25   54:iload_3         
	//*  26   55:iload           4
	//*  27   57:icmpge          78
					if(!haveReadFromMediaChunk(i))
	//*  28   60:aload_0         
	//*  29   61:iload_3         
	//*  30   62:invokespecial   #376 <Method boolean haveReadFromMediaChunk(int)>
	//*  31   65:ifne            71
						break label1;
	//   32   68:goto            81

	//   33   71:iload_3         
	//   34   72:iconst_1        
	//   35   73:iadd            
	//   36   74:istore_3        
	//*  37   75:goto            54
				i = j;
	//   38   78:iload           4
	//   39   80:istore_3        
			}
			if(i == j)
	//*  40   81:iload_3         
	//*  41   82:iload           4
	//*  42   84:icmpne          88
				return;
	//   43   87:return          
			l = getLastMediaChunk().endTimeUs;
	//   44   88:aload_0         
	//   45   89:invokespecial   #233 <Method BaseMediaChunk getLastMediaChunk()>
	//   46   92:getfield        #315 <Field long BaseMediaChunk.endTimeUs>
	//   47   95:lstore_1        
			BaseMediaChunk basemediachunk = discardUpstreamMediaChunksFromIndex(i);
	//   48   96:aload_0         
	//   49   97:iload_3         
	//   50   98:invokespecial   #390 <Method BaseMediaChunk discardUpstreamMediaChunksFromIndex(int)>
	//   51  101:astore          6
			if(mediaChunks.isEmpty())
	//*  52  103:aload_0         
	//*  53  104:getfield        #106 <Field ArrayList mediaChunks>
	//*  54  107:invokevirtual   #399 <Method boolean ArrayList.isEmpty()>
	//*  55  110:ifeq            121
				pendingResetPositionUs = lastSeekPositionUs;
	//   56  113:aload_0         
	//   57  114:aload_0         
	//   58  115:getfield        #136 <Field long lastSeekPositionUs>
	//   59  118:putfield        #134 <Field long pendingResetPositionUs>
			loadingFinished = false;
	//   60  121:aload_0         
	//   61  122:iconst_0        
	//   62  123:putfield        #224 <Field boolean loadingFinished>
			eventDispatcher.upstreamDiscarded(primaryTrackType, basemediachunk.startTimeUs, l);
	//   63  126:aload_0         
	//   64  127:getfield        #85  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   65  130:aload_0         
	//   66  131:getfield        #75  <Field int primaryTrackType>
	//   67  134:aload           6
	//   68  136:getfield        #211 <Field long BaseMediaChunk.startTimeUs>
	//   69  139:lload_1         
	//   70  140:invokevirtual   #431 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.upstreamDiscarded(int, long, long)>
			return;
	//   71  143:return          
		}
	//   72  144:return          
	}

	public void release()
	{
		release(((ReleaseCallback) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #435 <Method void release(ChunkSampleStream$ReleaseCallback)>
	//    3    5:return          
	}

	public void release(ReleaseCallback releasecallback)
	{
		releaseCallback = releasecallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #409 <Field ChunkSampleStream$ReleaseCallback releaseCallback>
		primarySampleQueue.discardToEnd();
	//    3    5:aload_0         
	//    4    6:getfield        #125 <Field SampleQueue primarySampleQueue>
	//    5    9:invokevirtual   #438 <Method void SampleQueue.discardToEnd()>
		releasecallback = ((ReleaseCallback) (embeddedSampleQueues));
	//    6   12:aload_0         
	//    7   13:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//    8   16:astore_1        
		int i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		for(int j = releasecallback.length; i < j; i++)
	//*  11   19:aload_1         
	//*  12   20:arraylength     
	//*  13   21:istore_3        
	//*  14   22:iload_2         
	//*  15   23:iload_3         
	//*  16   24:icmpge          40
			((SampleQueue) (releasecallback[i])).discardToEnd();
	//   17   27:aload_1         
	//   18   28:iload_2         
	//   19   29:aaload          
	//   20   30:invokevirtual   #438 <Method void SampleQueue.discardToEnd()>

	//   21   33:iload_2         
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:istore_2        
	//*  25   37:goto            22
		loader.release(((com.google.android.exoplayer2.upstream.Loader.ReleaseCallback) (this)));
	//   26   40:aload_0         
	//   27   41:getfield        #96  <Field Loader loader>
	//   28   44:aload_0         
	//   29   45:invokevirtual   #441 <Method void Loader.release(com.google.android.exoplayer2.upstream.Loader$ReleaseCallback)>
	//   30   48:return          
	}

	public void seekToUs(long l)
	{
		lastSeekPositionUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #136 <Field long lastSeekPositionUs>
		primarySampleQueue.rewind();
	//    3    5:aload_0         
	//    4    6:getfield        #125 <Field SampleQueue primarySampleQueue>
	//    5    9:invokevirtual   #447 <Method void SampleQueue.rewind()>
		boolean flag = isPendingReset();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #231 <Method boolean isPendingReset()>
	//    8   16:istore          8
		int i1 = 0;
	//    9   18:iconst_0        
	//   10   19:istore          4
		if(flag)
	//*  11   21:iload           8
	//*  12   23:ifeq            32
		{
			flag = false;
	//   13   26:iconst_0        
	//   14   27:istore          8
		} else
	//*  15   29:goto            199
		{
			Object obj = null;
	//   16   32:aconst_null     
	//   17   33:astore          10
			int i = 0;
	//   18   35:iconst_0        
	//   19   36:istore_3        
			BaseMediaChunk basemediachunk;
			do
			{
				basemediachunk = ((BaseMediaChunk) (obj));
	//   20   37:aload           10
	//   21   39:astore          9
				if(i >= mediaChunks.size())
					break;
	//   22   41:iload_3         
	//   23   42:aload_0         
	//   24   43:getfield        #106 <Field ArrayList mediaChunks>
	//   25   46:invokevirtual   #173 <Method int ArrayList.size()>
	//   26   49:icmpge          115
				basemediachunk = (BaseMediaChunk)mediaChunks.get(i);
	//   27   52:aload_0         
	//   28   53:getfield        #106 <Field ArrayList mediaChunks>
	//   29   56:iload_3         
	//   30   57:invokevirtual   #167 <Method Object ArrayList.get(int)>
	//   31   60:checkcast       #169 <Class BaseMediaChunk>
	//   32   63:astore          9
				long l1 = basemediachunk.startTimeUs;
	//   33   65:aload           9
	//   34   67:getfield        #211 <Field long BaseMediaChunk.startTimeUs>
	//   35   70:lstore          6
				if(l1 == l && basemediachunk.seekTimeUs == 0x1L)
	//*  36   72:lload           6
	//*  37   74:lload_1         
	//*  38   75:lcmp            
	//*  39   76:ifne            94
	//*  40   79:aload           9
	//*  41   81:getfield        #450 <Field long BaseMediaChunk.seekTimeUs>
	//*  42   84:ldc2w           #255 <Long 0x1L>
	//*  43   87:lcmp            
	//*  44   88:ifne            94
					break;
	//   45   91:goto            115
				if(l1 > l)
	//*  46   94:lload           6
	//*  47   96:lload_1         
	//*  48   97:lcmp            
	//*  49   98:ifle            108
				{
					basemediachunk = ((BaseMediaChunk) (obj));
	//   50  101:aload           10
	//   51  103:astore          9
					break;
	//   52  105:goto            115
				}
				i++;
	//   53  108:iload_3         
	//   54  109:iconst_1        
	//   55  110:iadd            
	//   56  111:istore_3        
			} while(true);
	//   57  112:goto            37
			if(basemediachunk != null)
	//*  58  115:aload           9
	//*  59  117:ifnull          145
			{
				flag = primarySampleQueue.setReadPosition(basemediachunk.getFirstSampleIndex(0));
	//   60  120:aload_0         
	//   61  121:getfield        #125 <Field SampleQueue primarySampleQueue>
	//   62  124:aload           9
	//   63  126:iconst_0        
	//   64  127:invokevirtual   #177 <Method int BaseMediaChunk.getFirstSampleIndex(int)>
	//   65  130:invokevirtual   #453 <Method boolean SampleQueue.setReadPosition(int)>
	//   66  133:istore          8
				decodeOnlyUntilPositionUs = 0x0L;
	//   67  135:aload_0         
	//   68  136:ldc2w           #259 <Long 0x0L>
	//   69  139:putfield        #262 <Field long decodeOnlyUntilPositionUs>
			} else
	//*  70  142:goto            199
			{
				SampleQueue samplequeue = primarySampleQueue;
	//   71  145:aload_0         
	//   72  146:getfield        #125 <Field SampleQueue primarySampleQueue>
	//   73  149:astore          9
				if(l < getNextLoadPositionUs())
	//*  74  151:lload_1         
	//*  75  152:aload_0         
	//*  76  153:invokevirtual   #455 <Method long getNextLoadPositionUs()>
	//*  77  156:lcmp            
	//*  78  157:ifge            166
					flag = true;
	//   79  160:iconst_1        
	//   80  161:istore          8
				else
	//*  81  163:goto            169
					flag = false;
	//   82  166:iconst_0        
	//   83  167:istore          8
				if(samplequeue.advanceTo(l, true, flag) != -1)
	//*  84  169:aload           9
	//*  85  171:lload_1         
	//*  86  172:iconst_1        
	//*  87  173:iload           8
	//*  88  175:invokevirtual   #459 <Method int SampleQueue.advanceTo(long, boolean, boolean)>
	//*  89  178:iconst_m1       
	//*  90  179:icmpeq          188
					flag = true;
	//   91  182:iconst_1        
	//   92  183:istore          8
				else
	//*  93  185:goto            191
					flag = false;
	//   94  188:iconst_0        
	//   95  189:istore          8
				decodeOnlyUntilPositionUs = lastSeekPositionUs;
	//   96  191:aload_0         
	//   97  192:aload_0         
	//   98  193:getfield        #136 <Field long lastSeekPositionUs>
	//   99  196:putfield        #262 <Field long decodeOnlyUntilPositionUs>
			}
		}
		if(flag)
	//* 100  199:iload           8
	//* 101  201:ifeq            250
		{
			SampleQueue asamplequeue[] = embeddedSampleQueues;
	//  102  204:aload_0         
	//  103  205:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//  104  208:astore          9
			i1 = asamplequeue.length;
	//  105  210:aload           9
	//  106  212:arraylength     
	//  107  213:istore          4
			for(int j = 0; j < i1; j++)
	//* 108  215:iconst_0        
	//* 109  216:istore_3        
	//* 110  217:iload_3         
	//* 111  218:iload           4
	//* 112  220:icmpge          326
			{
				SampleQueue samplequeue1 = asamplequeue[j];
	//  113  223:aload           9
	//  114  225:iload_3         
	//  115  226:aaload          
	//  116  227:astore          10
				samplequeue1.rewind();
	//  117  229:aload           10
	//  118  231:invokevirtual   #447 <Method void SampleQueue.rewind()>
				samplequeue1.advanceTo(l, true, false);
	//  119  234:aload           10
	//  120  236:lload_1         
	//  121  237:iconst_1        
	//  122  238:iconst_0        
	//  123  239:invokevirtual   #459 <Method int SampleQueue.advanceTo(long, boolean, boolean)>
	//  124  242:pop             
			}

	//  125  243:iload_3         
	//  126  244:iconst_1        
	//  127  245:iadd            
	//  128  246:istore_3        
		} else
	//* 129  247:goto            217
		{
			pendingResetPositionUs = l;
	//  130  250:aload_0         
	//  131  251:lload_1         
	//  132  252:putfield        #134 <Field long pendingResetPositionUs>
			loadingFinished = false;
	//  133  255:aload_0         
	//  134  256:iconst_0        
	//  135  257:putfield        #224 <Field boolean loadingFinished>
			mediaChunks.clear();
	//  136  260:aload_0         
	//  137  261:getfield        #106 <Field ArrayList mediaChunks>
	//  138  264:invokevirtual   #460 <Method void ArrayList.clear()>
			if(loader.isLoading())
	//* 139  267:aload_0         
	//* 140  268:getfield        #96  <Field Loader loader>
	//* 141  271:invokevirtual   #228 <Method boolean Loader.isLoading()>
	//* 142  274:ifeq            285
			{
				loader.cancelLoading();
	//  143  277:aload_0         
	//  144  278:getfield        #96  <Field Loader loader>
	//  145  281:invokevirtual   #463 <Method void Loader.cancelLoading()>
				return;
	//  146  284:return          
			}
			primarySampleQueue.reset();
	//  147  285:aload_0         
	//  148  286:getfield        #125 <Field SampleQueue primarySampleQueue>
	//  149  289:invokevirtual   #351 <Method void SampleQueue.reset()>
			SampleQueue asamplequeue1[] = embeddedSampleQueues;
	//  150  292:aload_0         
	//  151  293:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//  152  296:astore          9
			int j1 = asamplequeue1.length;
	//  153  298:aload           9
	//  154  300:arraylength     
	//  155  301:istore          5
			for(int k = i1; k < j1; k++)
	//* 156  303:iload           4
	//* 157  305:istore_3        
	//* 158  306:iload_3         
	//* 159  307:iload           5
	//* 160  309:icmpge          326
				asamplequeue1[k].reset();
	//  161  312:aload           9
	//  162  314:iload_3         
	//  163  315:aaload          
	//  164  316:invokevirtual   #351 <Method void SampleQueue.reset()>

	//  165  319:iload_3         
	//  166  320:iconst_1        
	//  167  321:iadd            
	//  168  322:istore_3        
		}
	//* 169  323:goto            306
	//  170  326:return          
	}

	public EmbeddedSampleStream selectEmbeddedTrack(long l, int i)
	{
		for(int j = 0; j < embeddedSampleQueues.length; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:aload_0         
	//*   4    6:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//*   5    9:arraylength     
	//*   6   10:icmpge          96
			if(embeddedTrackTypes[j] == i)
	//*   7   13:aload_0         
	//*   8   14:getfield        #77  <Field int[] embeddedTrackTypes>
	//*   9   17:iload           4
	//*  10   19:iaload          
	//*  11   20:iload_3         
	//*  12   21:icmpne          87
			{
				Assertions.checkState(embeddedTracksSelected[j] ^ true);
	//   13   24:aload_0         
	//   14   25:getfield        #120 <Field boolean[] embeddedTracksSelected>
	//   15   28:iload           4
	//   16   30:baload          
	//   17   31:iconst_1        
	//   18   32:ixor            
	//   19   33:invokestatic    #396 <Method void Assertions.checkState(boolean)>
				embeddedTracksSelected[j] = true;
	//   20   36:aload_0         
	//   21   37:getfield        #120 <Field boolean[] embeddedTracksSelected>
	//   22   40:iload           4
	//   23   42:iconst_1        
	//   24   43:bastore         
				embeddedSampleQueues[j].rewind();
	//   25   44:aload_0         
	//   26   45:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//   27   48:iload           4
	//   28   50:aaload          
	//   29   51:invokevirtual   #447 <Method void SampleQueue.rewind()>
				embeddedSampleQueues[j].advanceTo(l, true, true);
	//   30   54:aload_0         
	//   31   55:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//   32   58:iload           4
	//   33   60:aaload          
	//   34   61:lload_1         
	//   35   62:iconst_1        
	//   36   63:iconst_1        
	//   37   64:invokevirtual   #459 <Method int SampleQueue.advanceTo(long, boolean, boolean)>
	//   38   67:pop             
				return new EmbeddedSampleStream(this, embeddedSampleQueues[j], j);
	//   39   68:new             #15  <Class ChunkSampleStream$EmbeddedSampleStream>
	//   40   71:dup             
	//   41   72:aload_0         
	//   42   73:aload_0         
	//   43   74:aload_0         
	//   44   75:getfield        #118 <Field SampleQueue[] embeddedSampleQueues>
	//   45   78:iload           4
	//   46   80:aaload          
	//   47   81:iload           4
	//   48   83:invokespecial   #468 <Method void ChunkSampleStream$EmbeddedSampleStream(ChunkSampleStream, ChunkSampleStream, SampleQueue, int)>
	//   49   86:areturn         
			}

	//   50   87:iload           4
	//   51   89:iconst_1        
	//   52   90:iadd            
	//   53   91:istore          4
	//*  54   93:goto            3
		throw new IllegalStateException();
	//   55   96:new             #470 <Class IllegalStateException>
	//   56   99:dup             
	//   57  100:invokespecial   #471 <Method void IllegalStateException()>
	//   58  103:athrow          
	}

	public int skipData(long l)
	{
		boolean flag = isPendingReset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #231 <Method boolean isPendingReset()>
	//    2    4:istore          5
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(flag)
	//*   5    8:iload           5
	//*   6   10:ifeq            15
			return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		if(loadingFinished && l > primarySampleQueue.getLargestQueuedTimestampUs())
	//*   9   15:aload_0         
	//*  10   16:getfield        #224 <Field boolean loadingFinished>
	//*  11   19:ifeq            45
	//*  12   22:lload_1         
	//*  13   23:aload_0         
	//*  14   24:getfield        #125 <Field SampleQueue primarySampleQueue>
	//*  15   27:invokevirtual   #324 <Method long SampleQueue.getLargestQueuedTimestampUs()>
	//*  16   30:lcmp            
	//*  17   31:ifle            45
		{
			i = primarySampleQueue.advanceToEnd();
	//   18   34:aload_0         
	//   19   35:getfield        #125 <Field SampleQueue primarySampleQueue>
	//   20   38:invokevirtual   #477 <Method int SampleQueue.advanceToEnd()>
	//   21   41:istore_3        
		} else
	//*  22   42:goto            69
		{
			int j = primarySampleQueue.advanceTo(l, true, true);
	//   23   45:aload_0         
	//   24   46:getfield        #125 <Field SampleQueue primarySampleQueue>
	//   25   49:lload_1         
	//   26   50:iconst_1        
	//   27   51:iconst_1        
	//   28   52:invokevirtual   #459 <Method int SampleQueue.advanceTo(long, boolean, boolean)>
	//   29   55:istore          4
			if(j != -1)
	//*  30   57:iload           4
	//*  31   59:iconst_m1       
	//*  32   60:icmpne          66
	//*  33   63:goto            69
				i = j;
	//   34   66:iload           4
	//   35   68:istore_3        
		}
		if(i > 0)
	//*  36   69:iload_3         
	//*  37   70:ifle            85
			maybeNotifyPrimaryTrackFormatChanged(primarySampleQueue.getReadIndex(), i);
	//   38   73:aload_0         
	//   39   74:aload_0         
	//   40   75:getfield        #125 <Field SampleQueue primarySampleQueue>
	//   41   78:invokevirtual   #187 <Method int SampleQueue.getReadIndex()>
	//   42   81:iload_3         
	//   43   82:invokespecial   #421 <Method void maybeNotifyPrimaryTrackFormatChanged(int, int)>
		return i;
	//   44   85:iload_3         
	//   45   86:ireturn         
	}

	private static final String TAG = "ChunkSampleStream";
	private final com.google.android.exoplayer2.source.SequenceableLoader.Callback callback;
	private final ChunkSource chunkSource;
	long decodeOnlyUntilPositionUs;
	private final SampleQueue embeddedSampleQueues[];
	private final Format embeddedTrackFormats[];
	private final int embeddedTrackTypes[];
	private final boolean embeddedTracksSelected[];
	private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher;
	private long lastSeekPositionUs;
	private final Loader loader = new Loader("Loader:ChunkSampleStream");
	boolean loadingFinished;
	private final BaseMediaChunkOutput mediaChunkOutput;
	private final ArrayList mediaChunks = new ArrayList();
	private final int minLoadableRetryCount;
	private final ChunkHolder nextChunkHolder = new ChunkHolder();
	private long pendingResetPositionUs;
	private Format primaryDownstreamTrackFormat;
	private final SampleQueue primarySampleQueue;
	public final int primaryTrackType;
	private final List readOnlyMediaChunks;
	private ReleaseCallback releaseCallback;


/*
	static boolean[] access$000(ChunkSampleStream chunksamplestream)
	{
		return chunksamplestream.embeddedTracksSelected;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field boolean[] embeddedTracksSelected>
	//    2    4:areturn         
	}

*/


/*
	static int[] access$100(ChunkSampleStream chunksamplestream)
	{
		return chunksamplestream.embeddedTrackTypes;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int[] embeddedTrackTypes>
	//    2    4:areturn         
	}

*/


/*
	static Format[] access$200(ChunkSampleStream chunksamplestream)
	{
		return chunksamplestream.embeddedTrackFormats;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Format[] embeddedTrackFormats>
	//    2    4:areturn         
	}

*/


/*
	static long access$300(ChunkSampleStream chunksamplestream)
	{
		return chunksamplestream.lastSeekPositionUs;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field long lastSeekPositionUs>
	//    2    4:lreturn         
	}

*/


/*
	static com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher access$400(ChunkSampleStream chunksamplestream)
	{
		return chunksamplestream.eventDispatcher;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    2    4:areturn         
	}

*/
}
