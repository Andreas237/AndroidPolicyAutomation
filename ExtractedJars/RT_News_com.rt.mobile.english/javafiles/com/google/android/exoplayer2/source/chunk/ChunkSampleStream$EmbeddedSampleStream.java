// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source.chunk:
//			ChunkSampleStream

public final class ChunkSampleStream$EmbeddedSampleStream
	implements SampleStream
{

	private void maybeNotifyTrackFormatChanged()
	{
		if(!formatNotificationSent)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field boolean formatNotificationSent>
	//*   2    4:ifne            55
		{
			ChunkSampleStream.access$400(ChunkSampleStream.this).downstreamFormatChanged(ChunkSampleStream.access$100(ChunkSampleStream.this)[index], ChunkSampleStream.access$200(ChunkSampleStream.this)[index], 0, ((Object) (null)), ChunkSampleStream.access$300(ChunkSampleStream.this));
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
	//   14   30:invokestatic    #50  <Method com.google.android.exoplayer2.Format[] ChunkSampleStream.access$200(ChunkSampleStream)>
	//   15   33:aload_0         
	//   16   34:getfield        #32  <Field int index>
	//   17   37:aaload          
	//   18   38:iconst_0        
	//   19   39:aconst_null     
	//   20   40:aload_0         
	//   21   41:getfield        #23  <Field ChunkSampleStream this$0>
	//   22   44:invokestatic    #54  <Method long ChunkSampleStream.access$300(ChunkSampleStream)>
	//   23   47:invokevirtual   #60  <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.downstreamFormatChanged(int, com.google.android.exoplayer2.Format, int, Object, long)>
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
		Assertions.checkState(ChunkSampleStream.access$000(ChunkSampleStream.this)[index]);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ChunkSampleStream this$0>
	//    2    4:invokestatic    #94  <Method boolean[] ChunkSampleStream.access$000(ChunkSampleStream)>
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field int index>
	//    5   11:baload          
	//    6   12:invokestatic    #100 <Method void Assertions.checkState(boolean)>
		ChunkSampleStream.access$000(ChunkSampleStream.this)[index] = false;
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

	public ChunkSampleStream$EmbeddedSampleStream(ChunkSampleStream chunksamplestream1, SampleQueue samplequeue, int i)
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
