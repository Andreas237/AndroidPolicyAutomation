// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			PlayerEmsgHandler

public final class PlayerEmsgHandler$PlayerTrackEmsgHandler
	implements TrackOutput
{

	private MetadataInputBuffer dequeueSample()
	{
		buffer.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field MetadataInputBuffer buffer>
	//    2    4:invokevirtual   #43  <Method void MetadataInputBuffer.clear()>
		if(sampleQueue.read(formatHolder, ((com.google.android.exoplayer2.decoder.DecoderInputBuffer) (buffer)), false, false, 0L) == -4)
	//*   3    7:aload_0         
	//*   4    8:getfield        #26  <Field SampleQueue sampleQueue>
	//*   5   11:aload_0         
	//*   6   12:getfield        #31  <Field FormatHolder formatHolder>
	//*   7   15:aload_0         
	//*   8   16:getfield        #36  <Field MetadataInputBuffer buffer>
	//*   9   19:iconst_0        
	//*  10   20:iconst_0        
	//*  11   21:lconst_0        
	//*  12   22:invokevirtual   #49  <Method int SampleQueue.read(FormatHolder, com.google.android.exoplayer2.decoder.DecoderInputBuffer, boolean, boolean, long)>
	//*  13   25:bipush          -4
	//*  14   27:icmpne          42
		{
			buffer.flip();
	//   15   30:aload_0         
	//   16   31:getfield        #36  <Field MetadataInputBuffer buffer>
	//   17   34:invokevirtual   #52  <Method void MetadataInputBuffer.flip()>
			return buffer;
	//   18   37:aload_0         
	//   19   38:getfield        #36  <Field MetadataInputBuffer buffer>
	//   20   41:areturn         
		} else
		{
			return null;
	//   21   42:aconst_null     
	//   22   43:areturn         
		}
	}

	private void onManifestExpiredMessageEncountered(long l, long l1)
	{
		  = new (l, l1);
	//    0    0:new             #57  <Class PlayerEmsgHandler$ManifestExpiryEventInfo>
	//    1    3:dup             
	//    2    4:lload_1         
	//    3    5:lload_3         
	//    4    6:invokespecial   #59  <Method void PlayerEmsgHandler$ManifestExpiryEventInfo(long, long)>
	//    5    9:astore          5
		PlayerEmsgHandler.access$300(PlayerEmsgHandler.this).sendMessage(PlayerEmsgHandler.access$300(PlayerEmsgHandler.this).obtainMessage(2, ((Object) ())));
	//    6   11:aload_0         
	//    7   12:getfield        #21  <Field PlayerEmsgHandler this$0>
	//    8   15:invokestatic    #63  <Method Handler PlayerEmsgHandler.access$300(PlayerEmsgHandler)>
	//    9   18:aload_0         
	//   10   19:getfield        #21  <Field PlayerEmsgHandler this$0>
	//   11   22:invokestatic    #63  <Method Handler PlayerEmsgHandler.access$300(PlayerEmsgHandler)>
	//   12   25:iconst_2        
	//   13   26:aload           5
	//   14   28:invokevirtual   #69  <Method android.os.Message Handler.obtainMessage(int, Object)>
	//   15   31:invokevirtual   #73  <Method boolean Handler.sendMessage(android.os.Message)>
	//   16   34:pop             
	//   17   35:return          
	}

	private void onMediaPresentationEndedMessageEncountered()
	{
		PlayerEmsgHandler.access$300(PlayerEmsgHandler.this).sendMessage(PlayerEmsgHandler.access$300(PlayerEmsgHandler.this).obtainMessage(1));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field PlayerEmsgHandler this$0>
	//    2    4:invokestatic    #63  <Method Handler PlayerEmsgHandler.access$300(PlayerEmsgHandler)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field PlayerEmsgHandler this$0>
	//    5   11:invokestatic    #63  <Method Handler PlayerEmsgHandler.access$300(PlayerEmsgHandler)>
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #77  <Method android.os.Message Handler.obtainMessage(int)>
	//    8   18:invokevirtual   #73  <Method boolean Handler.sendMessage(android.os.Message)>
	//    9   21:pop             
	//   10   22:return          
	}

	private void parseAndDiscardSamples()
	{
		do
		{
			if(!sampleQueue.hasNextSample())
				break;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SampleQueue sampleQueue>
	//    2    4:invokevirtual   #82  <Method boolean SampleQueue.hasNextSample()>
	//    3    7:ifeq            69
			Object obj = ((Object) (dequeueSample()));
	//    4   10:aload_0         
	//    5   11:invokespecial   #84  <Method MetadataInputBuffer dequeueSample()>
	//    6   14:astore_3        
			if(obj != null)
	//*   7   15:aload_3         
	//*   8   16:ifnonnull       22
	//*   9   19:goto            0
			{
				long l = ((MetadataInputBuffer) (obj)).timeUs;
	//   10   22:aload_3         
	//   11   23:getfield        #88  <Field long MetadataInputBuffer.timeUs>
	//   12   26:lstore_1        
				obj = ((Object) ((EventMessage)PlayerEmsgHandler.access$000(PlayerEmsgHandler.this).decode(((MetadataInputBuffer) (obj))).get(0)));
	//   13   27:aload_0         
	//   14   28:getfield        #21  <Field PlayerEmsgHandler this$0>
	//   15   31:invokestatic    #92  <Method EventMessageDecoder PlayerEmsgHandler.access$000(PlayerEmsgHandler)>
	//   16   34:aload_3         
	//   17   35:invokevirtual   #98  <Method Metadata EventMessageDecoder.decode(MetadataInputBuffer)>
	//   18   38:iconst_0        
	//   19   39:invokevirtual   #104 <Method com.google.android.exoplayer2.metadata.Metadata$Entry Metadata.get(int)>
	//   20   42:checkcast       #106 <Class EventMessage>
	//   21   45:astore_3        
				if(PlayerEmsgHandler.isPlayerEmsgEvent(((EventMessage) (obj)).schemeIdUri, ((EventMessage) (obj)).value))
	//*  22   46:aload_3         
	//*  23   47:getfield        #110 <Field String EventMessage.schemeIdUri>
	//*  24   50:aload_3         
	//*  25   51:getfield        #113 <Field String EventMessage.value>
	//*  26   54:invokestatic    #117 <Method boolean PlayerEmsgHandler.isPlayerEmsgEvent(String, String)>
	//*  27   57:ifeq            0
					parsePlayerEmsgEvent(l, ((EventMessage) (obj)));
	//   28   60:aload_0         
	//   29   61:lload_1         
	//   30   62:aload_3         
	//   31   63:invokespecial   #121 <Method void parsePlayerEmsgEvent(long, EventMessage)>
			}
		} while(true);
	//   32   66:goto            0
		sampleQueue.discardToRead();
	//   33   69:aload_0         
	//   34   70:getfield        #26  <Field SampleQueue sampleQueue>
	//   35   73:invokevirtual   #124 <Method void SampleQueue.discardToRead()>
	//   36   76:return          
	}

	private void parsePlayerEmsgEvent(long l, EventMessage eventmessage)
	{
		long l1 = PlayerEmsgHandler.access$100(eventmessage);
	//    0    0:aload_3         
	//    1    1:invokestatic    #128 <Method long PlayerEmsgHandler.access$100(EventMessage)>
	//    2    4:lstore          4
		if(l1 == 0x1L)
	//*   3    6:lload           4
	//*   4    8:ldc2w           #129 <Long 0x1L>
	//*   5   11:lcmp            
	//*   6   12:ifne            16
			return;
	//    7   15:return          
		if(PlayerEmsgHandler.access$200(eventmessage))
	//*   8   16:aload_3         
	//*   9   17:invokestatic    #134 <Method boolean PlayerEmsgHandler.access$200(EventMessage)>
	//*  10   20:ifeq            28
		{
			onMediaPresentationEndedMessageEncountered();
	//   11   23:aload_0         
	//   12   24:invokespecial   #136 <Method void onMediaPresentationEndedMessageEncountered()>
			return;
	//   13   27:return          
		} else
		{
			onManifestExpiredMessageEncountered(l, l1);
	//   14   28:aload_0         
	//   15   29:lload_1         
	//   16   30:lload           4
	//   17   32:invokespecial   #138 <Method void onManifestExpiredMessageEncountered(long, long)>
			return;
	//   18   35:return          
		}
	}

	public void format(Format format1)
	{
		sampleQueue.format(format1);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SampleQueue sampleQueue>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #142 <Method void SampleQueue.format(Format)>
	//    4    8:return          
	}

	public boolean maybeRefreshManifestBeforeLoadingNextChunk(long l)
	{
		return PlayerEmsgHandler.this.maybeRefreshManifestBeforeLoadingNextChunk(l);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field PlayerEmsgHandler this$0>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #146 <Method boolean PlayerEmsgHandler.maybeRefreshManifestBeforeLoadingNextChunk(long)>
	//    4    8:ireturn         
	}

	public boolean maybeRefreshManifestOnLoadingError(Chunk chunk)
	{
		return PlayerEmsgHandler.this.maybeRefreshManifestOnLoadingError(chunk);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field PlayerEmsgHandler this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #150 <Method boolean PlayerEmsgHandler.maybeRefreshManifestOnLoadingError(Chunk)>
	//    4    8:ireturn         
	}

	public void onChunkLoadCompleted(Chunk chunk)
	{
		PlayerEmsgHandler.this.onChunkLoadCompleted(chunk);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field PlayerEmsgHandler this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #154 <Method void PlayerEmsgHandler.onChunkLoadCompleted(Chunk)>
	//    4    8:return          
	}

	public void release()
	{
		sampleQueue.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SampleQueue sampleQueue>
	//    2    4:invokevirtual   #158 <Method void SampleQueue.reset()>
	//    3    7:return          
	}

	public int sampleData(ExtractorInput extractorinput, int i, boolean flag)
		throws IOException, InterruptedException
	{
		return sampleQueue.sampleData(extractorinput, i, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SampleQueue sampleQueue>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #166 <Method int SampleQueue.sampleData(ExtractorInput, int, boolean)>
	//    6   10:ireturn         
	}

	public void sampleData(ParsableByteArray parsablebytearray, int i)
	{
		sampleQueue.sampleData(parsablebytearray, i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SampleQueue sampleQueue>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #170 <Method void SampleQueue.sampleData(ParsableByteArray, int)>
	//    5    9:return          
	}

	public void sampleMetadata(long l, int i, int j, int k, com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptodata)
	{
		sampleQueue.sampleMetadata(l, i, j, k, cryptodata);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SampleQueue sampleQueue>
	//    2    4:lload_1         
	//    3    5:iload_3         
	//    4    6:iload           4
	//    5    8:iload           5
	//    6   10:aload           6
	//    7   12:invokevirtual   #174 <Method void SampleQueue.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
		parseAndDiscardSamples();
	//    8   15:aload_0         
	//    9   16:invokespecial   #176 <Method void parseAndDiscardSamples()>
	//   10   19:return          
	}

	private final MetadataInputBuffer buffer = new MetadataInputBuffer();
	private final FormatHolder formatHolder = new FormatHolder();
	private final SampleQueue sampleQueue;
	final PlayerEmsgHandler this$0;

	PlayerEmsgHandler$PlayerTrackEmsgHandler(SampleQueue samplequeue)
	{
		this$0 = PlayerEmsgHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field PlayerEmsgHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		sampleQueue = samplequeue;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field SampleQueue sampleQueue>
	//    8   14:aload_0         
	//    9   15:new             #28  <Class FormatHolder>
	//   10   18:dup             
	//   11   19:invokespecial   #29  <Method void FormatHolder()>
	//   12   22:putfield        #31  <Field FormatHolder formatHolder>
	//   13   25:aload_0         
	//   14   26:new             #33  <Class MetadataInputBuffer>
	//   15   29:dup             
	//   16   30:invokespecial   #34  <Method void MetadataInputBuffer()>
	//   17   33:putfield        #36  <Field MetadataInputBuffer buffer>
	//   18   36:return          
	}
}
