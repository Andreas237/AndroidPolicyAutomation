// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.*;

public final class PlayerEmsgHandler
	implements android.os.Handler.Callback
{
	private static final class ManifestExpiryEventInfo
	{

		public final long eventTimeUs;
		public final long manifestPublishTimeMsInEmsg;

		public ManifestExpiryEventInfo(long l, long l1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			eventTimeUs = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #17  <Field long eventTimeUs>
			manifestPublishTimeMsInEmsg = l1;
		//    5    9:aload_0         
		//    6   10:lload_3         
		//    7   11:putfield        #19  <Field long manifestPublishTimeMsInEmsg>
		//    8   14:return          
		}
	}

	public static interface PlayerEmsgCallback
	{

		public abstract void onDashLiveMediaPresentationEndSignalEncountered();

		public abstract void onDashManifestPublishTimeExpired(long l);

		public abstract void onDashManifestRefreshRequested();
	}

	public final class PlayerTrackEmsgHandler
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
			ManifestExpiryEventInfo manifestexpiryeventinfo = new ManifestExpiryEventInfo(l, l1);
		//    0    0:new             #57  <Class PlayerEmsgHandler$ManifestExpiryEventInfo>
		//    1    3:dup             
		//    2    4:lload_1         
		//    3    5:lload_3         
		//    4    6:invokespecial   #59  <Method void PlayerEmsgHandler$ManifestExpiryEventInfo(long, long)>
		//    5    9:astore          5
			handler.sendMessage(handler.obtainMessage(2, ((Object) (manifestexpiryeventinfo))));
		//    6   11:aload_0         
		//    7   12:getfield        #21  <Field PlayerEmsgHandler this$0>
		//    8   15:invokestatic    #63  <Method Handler PlayerEmsgHandler.access$300(PlayerEmsgHandler)>
		//    9   18:aload_0         
		//   10   19:getfield        #21  <Field PlayerEmsgHandler this$0>
		//   11   22:invokestatic    #63  <Method Handler PlayerEmsgHandler.access$300(PlayerEmsgHandler)>
		//   12   25:iconst_2        
		//   13   26:aload           5
		//   14   28:invokevirtual   #69  <Method Message Handler.obtainMessage(int, Object)>
		//   15   31:invokevirtual   #73  <Method boolean Handler.sendMessage(Message)>
		//   16   34:pop             
		//   17   35:return          
		}

		private void onMediaPresentationEndedMessageEncountered()
		{
			handler.sendMessage(handler.obtainMessage(1));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field PlayerEmsgHandler this$0>
		//    2    4:invokestatic    #63  <Method Handler PlayerEmsgHandler.access$300(PlayerEmsgHandler)>
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field PlayerEmsgHandler this$0>
		//    5   11:invokestatic    #63  <Method Handler PlayerEmsgHandler.access$300(PlayerEmsgHandler)>
		//    6   14:iconst_1        
		//    7   15:invokevirtual   #77  <Method Message Handler.obtainMessage(int)>
		//    8   18:invokevirtual   #73  <Method boolean Handler.sendMessage(Message)>
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
					obj = ((Object) ((EventMessage)decoder.decode(((MetadataInputBuffer) (obj))).get(0)));
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
			long l1 = PlayerEmsgHandler.getManifestPublishTimeMsInEmsg(eventmessage);
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
			if(PlayerEmsgHandler.isMessageSignalingMediaPresentationEnded(eventmessage))
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

		PlayerTrackEmsgHandler(SampleQueue samplequeue)
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


	public PlayerEmsgHandler(DashManifest dashmanifest, PlayerEmsgCallback playeremsgcallback, Allocator allocator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		manifest = dashmanifest;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #48  <Field DashManifest manifest>
		playerEmsgCallback = playeremsgcallback;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #50  <Field PlayerEmsgHandler$PlayerEmsgCallback playerEmsgCallback>
		allocator = allocator1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #52  <Field Allocator allocator>
	//   11   19:aload_0         
	//   12   20:new             #54  <Class TreeMap>
	//   13   23:dup             
	//   14   24:invokespecial   #55  <Method void TreeMap()>
	//   15   27:putfield        #57  <Field TreeMap manifestPublishTimeToExpiryTimeUs>
	//   16   30:aload_0         
	//   17   31:new             #59  <Class Handler>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:invokespecial   #62  <Method void Handler(android.os.Handler$Callback)>
	//   21   39:putfield        #64  <Field Handler handler>
	//   22   42:aload_0         
	//   23   43:new             #66  <Class EventMessageDecoder>
	//   24   46:dup             
	//   25   47:invokespecial   #67  <Method void EventMessageDecoder()>
	//   26   50:putfield        #69  <Field EventMessageDecoder decoder>
		lastLoadedChunkEndTimeUs = 0x1L;
	//   27   53:aload_0         
	//   28   54:ldc2w           #70  <Long 0x1L>
	//   29   57:putfield        #73  <Field long lastLoadedChunkEndTimeUs>
		lastLoadedChunkEndTimeBeforeRefreshUs = 0x1L;
	//   30   60:aload_0         
	//   31   61:ldc2w           #70  <Long 0x1L>
	//   32   64:putfield        #75  <Field long lastLoadedChunkEndTimeBeforeRefreshUs>
	//   33   67:return          
	}

	private java.util.Map.Entry ceilingExpiryEntryForPublishTime(long l)
	{
		return manifestPublishTimeToExpiryTimeUs.ceilingEntry(((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field TreeMap manifestPublishTimeToExpiryTimeUs>
	//    2    4:lload_1         
	//    3    5:invokestatic    #99  <Method Long Long.valueOf(long)>
	//    4    8:invokevirtual   #103 <Method java.util.Map$Entry TreeMap.ceilingEntry(Object)>
	//    5   11:areturn         
	}

	private static long getManifestPublishTimeMsInEmsg(EventMessage eventmessage)
	{
		long l;
		try
		{
			l = Util.parseXsDateTime(new String(eventmessage.messageData));
	//    0    0:new             #110 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #116 <Field byte[] EventMessage.messageData>
	//    4    8:invokespecial   #119 <Method void String(byte[])>
	//    5   11:invokestatic    #125 <Method long Util.parseXsDateTime(String)>
	//    6   14:lstore_1        
		}
	//*   7   15:lload_1         
	//*   8   16:lreturn         
	//*   9   17:ldc2w           #70  <Long 0x1L>
	//*  10   20:lreturn         
		// Misplaced declaration of an exception variable
		catch(EventMessage eventmessage)
		{
			return 0x1L;
		}
		return l;
	//*  11   21:astore_0        
	//*  12   22:goto            17
	}

	private void handleManifestExpiredMessage(long l, long l1)
	{
		Long long1 = (Long)manifestPublishTimeToExpiryTimeUs.get(((Object) (Long.valueOf(l1))));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field TreeMap manifestPublishTimeToExpiryTimeUs>
	//    2    4:lload_3         
	//    3    5:invokestatic    #99  <Method Long Long.valueOf(long)>
	//    4    8:invokevirtual   #131 <Method Object TreeMap.get(Object)>
	//    5   11:checkcast       #95  <Class Long>
	//    6   14:astore          5
		if(long1 == null)
	//*   7   16:aload           5
	//*   8   18:ifnonnull       38
		{
			manifestPublishTimeToExpiryTimeUs.put(((Object) (Long.valueOf(l1))), ((Object) (Long.valueOf(l))));
	//    9   21:aload_0         
	//   10   22:getfield        #57  <Field TreeMap manifestPublishTimeToExpiryTimeUs>
	//   11   25:lload_3         
	//   12   26:invokestatic    #99  <Method Long Long.valueOf(long)>
	//   13   29:lload_1         
	//   14   30:invokestatic    #99  <Method Long Long.valueOf(long)>
	//   15   33:invokevirtual   #135 <Method Object TreeMap.put(Object, Object)>
	//   16   36:pop             
			return;
	//   17   37:return          
		}
		if(long1.longValue() > l)
	//*  18   38:aload           5
	//*  19   40:invokevirtual   #139 <Method long Long.longValue()>
	//*  20   43:lload_1         
	//*  21   44:lcmp            
	//*  22   45:ifle            64
			manifestPublishTimeToExpiryTimeUs.put(((Object) (Long.valueOf(l1))), ((Object) (Long.valueOf(l))));
	//   23   48:aload_0         
	//   24   49:getfield        #57  <Field TreeMap manifestPublishTimeToExpiryTimeUs>
	//   25   52:lload_3         
	//   26   53:invokestatic    #99  <Method Long Long.valueOf(long)>
	//   27   56:lload_1         
	//   28   57:invokestatic    #99  <Method Long Long.valueOf(long)>
	//   29   60:invokevirtual   #135 <Method Object TreeMap.put(Object, Object)>
	//   30   63:pop             
	//   31   64:return          
	}

	private void handleMediaPresentationEndedMessageEncountered()
	{
		dynamicMediaPresentationEnded = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #142 <Field boolean dynamicMediaPresentationEnded>
		notifySourceMediaPresentationEnded();
	//    3    5:aload_0         
	//    4    6:invokespecial   #145 <Method void notifySourceMediaPresentationEnded()>
	//    5    9:return          
	}

	private static boolean isMessageSignalingMediaPresentationEnded(EventMessage eventmessage)
	{
		return eventmessage.presentationTimeUs == 0L && eventmessage.durationMs == 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field long EventMessage.presentationTimeUs>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifne            20
	//    5    9:aload_0         
	//    6   10:getfield        #151 <Field long EventMessage.durationMs>
	//    7   13:lconst_0        
	//    8   14:lcmp            
	//    9   15:ifne            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	public static boolean isPlayerEmsgEvent(String s, String s1)
	{
		return "urn:mpeg:dash:event:2012".equals(((Object) (s))) && ("1".equals(((Object) (s1))) || "2".equals(((Object) (s1))) || "3".equals(((Object) (s1))));
	//    0    0:ldc1            #155 <String "urn:mpeg:dash:event:2012">
	//    1    2:aload_0         
	//    2    3:invokevirtual   #159 <Method boolean String.equals(Object)>
	//    3    6:ifeq            38
	//    4    9:ldc1            #161 <String "1">
	//    5   11:aload_1         
	//    6   12:invokevirtual   #159 <Method boolean String.equals(Object)>
	//    7   15:ifne            36
	//    8   18:ldc1            #163 <String "2">
	//    9   20:aload_1         
	//   10   21:invokevirtual   #159 <Method boolean String.equals(Object)>
	//   11   24:ifne            36
	//   12   27:ldc1            #165 <String "3">
	//   13   29:aload_1         
	//   14   30:invokevirtual   #159 <Method boolean String.equals(Object)>
	//   15   33:ifeq            38
	//   16   36:iconst_1        
	//   17   37:ireturn         
	//   18   38:iconst_0        
	//   19   39:ireturn         
	}

	private void maybeNotifyDashManifestRefreshNeeded()
	{
		if(lastLoadedChunkEndTimeBeforeRefreshUs != 0x1L && lastLoadedChunkEndTimeBeforeRefreshUs == lastLoadedChunkEndTimeUs)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field long lastLoadedChunkEndTimeBeforeRefreshUs>
	//*   2    4:ldc2w           #70  <Long 0x1L>
	//*   3    7:lcmp            
	//*   4    8:ifeq            24
	//*   5   11:aload_0         
	//*   6   12:getfield        #75  <Field long lastLoadedChunkEndTimeBeforeRefreshUs>
	//*   7   15:aload_0         
	//*   8   16:getfield        #73  <Field long lastLoadedChunkEndTimeUs>
	//*   9   19:lcmp            
	//*  10   20:ifne            24
		{
			return;
	//   11   23:return          
		} else
		{
			isWaitingForManifestRefresh = true;
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:putfield        #168 <Field boolean isWaitingForManifestRefresh>
			lastLoadedChunkEndTimeBeforeRefreshUs = lastLoadedChunkEndTimeUs;
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #73  <Field long lastLoadedChunkEndTimeUs>
	//   18   34:putfield        #75  <Field long lastLoadedChunkEndTimeBeforeRefreshUs>
			playerEmsgCallback.onDashManifestRefreshRequested();
	//   19   37:aload_0         
	//   20   38:getfield        #50  <Field PlayerEmsgHandler$PlayerEmsgCallback playerEmsgCallback>
	//   21   41:invokeinterface #171 <Method void PlayerEmsgHandler$PlayerEmsgCallback.onDashManifestRefreshRequested()>
			return;
	//   22   46:return          
		}
	}

	private void notifyManifestPublishTimeExpired()
	{
		playerEmsgCallback.onDashManifestPublishTimeExpired(expiredManifestPublishTimeUs);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field PlayerEmsgHandler$PlayerEmsgCallback playerEmsgCallback>
	//    2    4:aload_0         
	//    3    5:getfield        #174 <Field long expiredManifestPublishTimeUs>
	//    4    8:invokeinterface #178 <Method void PlayerEmsgHandler$PlayerEmsgCallback.onDashManifestPublishTimeExpired(long)>
	//    5   13:return          
	}

	private void notifySourceMediaPresentationEnded()
	{
		playerEmsgCallback.onDashLiveMediaPresentationEndSignalEncountered();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field PlayerEmsgHandler$PlayerEmsgCallback playerEmsgCallback>
	//    2    4:invokeinterface #181 <Method void PlayerEmsgHandler$PlayerEmsgCallback.onDashLiveMediaPresentationEndSignalEncountered()>
	//    3    9:return          
	}

	private void removePreviouslyExpiredManifestPublishTimeValues()
	{
		Iterator iterator = manifestPublishTimeToExpiryTimeUs.entrySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field TreeMap manifestPublishTimeToExpiryTimeUs>
	//    2    4:invokevirtual   #186 <Method Set TreeMap.entrySet()>
	//    3    7:invokeinterface #192 <Method Iterator Set.iterator()>
	//    4   12:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   13:aload_1         
	//    6   14:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            62
			if(((Long)((java.util.Map.Entry)iterator.next()).getKey()).longValue() < manifest.publishTimeMs)
	//*   8   22:aload_1         
	//*   9   23:invokeinterface #202 <Method Object Iterator.next()>
	//*  10   28:checkcast       #204 <Class java.util.Map$Entry>
	//*  11   31:invokeinterface #207 <Method Object java.util.Map$Entry.getKey()>
	//*  12   36:checkcast       #95  <Class Long>
	//*  13   39:invokevirtual   #139 <Method long Long.longValue()>
	//*  14   42:aload_0         
	//*  15   43:getfield        #48  <Field DashManifest manifest>
	//*  16   46:getfield        #212 <Field long DashManifest.publishTimeMs>
	//*  17   49:lcmp            
	//*  18   50:ifge            13
				iterator.remove();
	//   19   53:aload_1         
	//   20   54:invokeinterface #215 <Method void Iterator.remove()>
		} while(true);
	//   21   59:goto            13
	//   22   62:return          
	}

	public boolean handleMessage(Message message)
	{
		if(released)
	//*   0    0:aload_0         
	//*   1    1:getfield        #219 <Field boolean released>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		switch(message.what)
	//*   5    9:aload_1         
	//*   6   10:getfield        #224 <Field int Message.what>
		{
	//*   7   13:tableswitch     1 2: default 36
	//	               1 60
	//	               2 38
		default:
			return false;
	//    8   36:iconst_0        
	//    9   37:ireturn         

		case 2: // '\002'
			message = ((Message) ((ManifestExpiryEventInfo)message.obj));
	//   10   38:aload_1         
	//   11   39:getfield        #228 <Field Object Message.obj>
	//   12   42:checkcast       #8   <Class PlayerEmsgHandler$ManifestExpiryEventInfo>
	//   13   45:astore_1        
			handleManifestExpiredMessage(((ManifestExpiryEventInfo) (message)).eventTimeUs, ((ManifestExpiryEventInfo) (message)).manifestPublishTimeMsInEmsg);
	//   14   46:aload_0         
	//   15   47:aload_1         
	//   16   48:getfield        #231 <Field long PlayerEmsgHandler$ManifestExpiryEventInfo.eventTimeUs>
	//   17   51:aload_1         
	//   18   52:getfield        #234 <Field long PlayerEmsgHandler$ManifestExpiryEventInfo.manifestPublishTimeMsInEmsg>
	//   19   55:invokespecial   #236 <Method void handleManifestExpiredMessage(long, long)>
			return true;
	//   20   58:iconst_1        
	//   21   59:ireturn         

		case 1: // '\001'
			handleMediaPresentationEndedMessageEncountered();
	//   22   60:aload_0         
	//   23   61:invokespecial   #238 <Method void handleMediaPresentationEndedMessageEncountered()>
			return true;
	//   24   64:iconst_1        
	//   25   65:ireturn         
		}
	}

	boolean maybeRefreshManifestBeforeLoadingNextChunk(long l)
	{
		if(!manifest.dynamic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field DashManifest manifest>
	//*   2    4:getfield        #243 <Field boolean DashManifest.dynamic>
	//*   3    7:ifne            12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		boolean flag1 = isWaitingForManifestRefresh;
	//    6   12:aload_0         
	//    7   13:getfield        #168 <Field boolean isWaitingForManifestRefresh>
	//    8   16:istore          4
		boolean flag = true;
	//    9   18:iconst_1        
	//   10   19:istore_3        
		if(flag1)
	//*  11   20:iload           4
	//*  12   22:ifeq            27
			return true;
	//   13   25:iconst_1        
	//   14   26:ireturn         
		if(!dynamicMediaPresentationEnded)
	//*  15   27:aload_0         
	//*  16   28:getfield        #142 <Field boolean dynamicMediaPresentationEnded>
	//*  17   31:ifeq            37
	//*  18   34:goto            99
		{
			java.util.Map.Entry entry = ceilingExpiryEntryForPublishTime(manifest.publishTimeMs);
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #48  <Field DashManifest manifest>
	//   22   42:getfield        #212 <Field long DashManifest.publishTimeMs>
	//   23   45:invokespecial   #245 <Method java.util.Map$Entry ceilingExpiryEntryForPublishTime(long)>
	//   24   48:astore          5
			if(entry != null && ((Long)entry.getValue()).longValue() < l)
	//*  25   50:aload           5
	//*  26   52:ifnull          97
	//*  27   55:aload           5
	//*  28   57:invokeinterface #248 <Method Object java.util.Map$Entry.getValue()>
	//*  29   62:checkcast       #95  <Class Long>
	//*  30   65:invokevirtual   #139 <Method long Long.longValue()>
	//*  31   68:lload_1         
	//*  32   69:lcmp            
	//*  33   70:ifge            97
			{
				expiredManifestPublishTimeUs = ((Long)entry.getKey()).longValue();
	//   34   73:aload_0         
	//   35   74:aload           5
	//   36   76:invokeinterface #207 <Method Object java.util.Map$Entry.getKey()>
	//   37   81:checkcast       #95  <Class Long>
	//   38   84:invokevirtual   #139 <Method long Long.longValue()>
	//   39   87:putfield        #174 <Field long expiredManifestPublishTimeUs>
				notifyManifestPublishTimeExpired();
	//   40   90:aload_0         
	//   41   91:invokespecial   #250 <Method void notifyManifestPublishTimeExpired()>
			} else
	//*  42   94:goto            99
			{
				flag = false;
	//   43   97:iconst_0        
	//   44   98:istore_3        
			}
		}
		if(flag)
	//*  45   99:iload_3         
	//*  46  100:ifeq            107
			maybeNotifyDashManifestRefreshNeeded();
	//   47  103:aload_0         
	//   48  104:invokespecial   #252 <Method void maybeNotifyDashManifestRefreshNeeded()>
		return flag;
	//   49  107:iload_3         
	//   50  108:ireturn         
	}

	boolean maybeRefreshManifestOnLoadingError(Chunk chunk)
	{
		if(!manifest.dynamic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field DashManifest manifest>
	//*   2    4:getfield        #243 <Field boolean DashManifest.dynamic>
	//*   3    7:ifne            12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		if(isWaitingForManifestRefresh)
	//*   6   12:aload_0         
	//*   7   13:getfield        #168 <Field boolean isWaitingForManifestRefresh>
	//*   8   16:ifeq            21
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
		boolean flag;
		if(lastLoadedChunkEndTimeUs != 0x1L && lastLoadedChunkEndTimeUs < chunk.startTimeUs)
	//*  11   21:aload_0         
	//*  12   22:getfield        #73  <Field long lastLoadedChunkEndTimeUs>
	//*  13   25:ldc2w           #70  <Long 0x1L>
	//*  14   28:lcmp            
	//*  15   29:ifeq            49
	//*  16   32:aload_0         
	//*  17   33:getfield        #73  <Field long lastLoadedChunkEndTimeUs>
	//*  18   36:aload_1         
	//*  19   37:getfield        #259 <Field long Chunk.startTimeUs>
	//*  20   40:lcmp            
	//*  21   41:ifge            49
			flag = true;
	//   22   44:iconst_1        
	//   23   45:istore_2        
		else
	//*  24   46:goto            51
			flag = false;
	//   25   49:iconst_0        
	//   26   50:istore_2        
		if(flag)
	//*  27   51:iload_2         
	//*  28   52:ifeq            61
		{
			maybeNotifyDashManifestRefreshNeeded();
	//   29   55:aload_0         
	//   30   56:invokespecial   #252 <Method void maybeNotifyDashManifestRefreshNeeded()>
			return true;
	//   31   59:iconst_1        
	//   32   60:ireturn         
		} else
		{
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		}
	}

	public PlayerTrackEmsgHandler newPlayerTrackEmsgHandler()
	{
		return new PlayerTrackEmsgHandler(new SampleQueue(allocator));
	//    0    0:new             #14  <Class PlayerEmsgHandler$PlayerTrackEmsgHandler>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #263 <Class SampleQueue>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field Allocator allocator>
	//    7   13:invokespecial   #266 <Method void SampleQueue(Allocator)>
	//    8   16:invokespecial   #269 <Method void PlayerEmsgHandler$PlayerTrackEmsgHandler(PlayerEmsgHandler, SampleQueue)>
	//    9   19:areturn         
	}

	void onChunkLoadCompleted(Chunk chunk)
	{
		if(lastLoadedChunkEndTimeUs != 0x1L || chunk.endTimeUs > lastLoadedChunkEndTimeUs)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field long lastLoadedChunkEndTimeUs>
	//*   2    4:ldc2w           #70  <Long 0x1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            23
	//*   5   11:aload_1         
	//*   6   12:getfield        #274 <Field long Chunk.endTimeUs>
	//*   7   15:aload_0         
	//*   8   16:getfield        #73  <Field long lastLoadedChunkEndTimeUs>
	//*   9   19:lcmp            
	//*  10   20:ifle            31
			lastLoadedChunkEndTimeUs = chunk.endTimeUs;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:getfield        #274 <Field long Chunk.endTimeUs>
	//   14   28:putfield        #73  <Field long lastLoadedChunkEndTimeUs>
	//   15   31:return          
	}

	public void release()
	{
		released = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #219 <Field boolean released>
		handler.removeCallbacksAndMessages(((Object) (null)));
	//    3    5:aload_0         
	//    4    6:getfield        #64  <Field Handler handler>
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #279 <Method void Handler.removeCallbacksAndMessages(Object)>
	//    7   13:return          
	}

	public void updateManifest(DashManifest dashmanifest)
	{
		isWaitingForManifestRefresh = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #168 <Field boolean isWaitingForManifestRefresh>
		expiredManifestPublishTimeUs = 0x1L;
	//    3    5:aload_0         
	//    4    6:ldc2w           #70  <Long 0x1L>
	//    5    9:putfield        #174 <Field long expiredManifestPublishTimeUs>
		manifest = dashmanifest;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #48  <Field DashManifest manifest>
		removePreviouslyExpiredManifestPublishTimeValues();
	//    9   17:aload_0         
	//   10   18:invokespecial   #283 <Method void removePreviouslyExpiredManifestPublishTimeValues()>
	//   11   21:return          
	}

	private static final int EMSG_MANIFEST_EXPIRED = 2;
	private static final int EMSG_MEDIA_PRESENTATION_ENDED = 1;
	private final Allocator allocator;
	private final EventMessageDecoder decoder = new EventMessageDecoder();
	private boolean dynamicMediaPresentationEnded;
	private long expiredManifestPublishTimeUs;
	private final Handler handler = new Handler(((android.os.Handler.Callback) (this)));
	private boolean isWaitingForManifestRefresh;
	private long lastLoadedChunkEndTimeBeforeRefreshUs;
	private long lastLoadedChunkEndTimeUs;
	private DashManifest manifest;
	private final TreeMap manifestPublishTimeToExpiryTimeUs = new TreeMap();
	private final PlayerEmsgCallback playerEmsgCallback;
	private boolean released;


/*
	static EventMessageDecoder access$000(PlayerEmsgHandler playeremsghandler)
	{
		return playeremsghandler.decoder;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field EventMessageDecoder decoder>
	//    2    4:areturn         
	}

*/


/*
	static long access$100(EventMessage eventmessage)
	{
		return getManifestPublishTimeMsInEmsg(eventmessage);
	//    0    0:aload_0         
	//    1    1:invokestatic    #83  <Method long getManifestPublishTimeMsInEmsg(EventMessage)>
	//    2    4:lreturn         
	}

*/


/*
	static boolean access$200(EventMessage eventmessage)
	{
		return isMessageSignalingMediaPresentationEnded(eventmessage);
	//    0    0:aload_0         
	//    1    1:invokestatic    #88  <Method boolean isMessageSignalingMediaPresentationEnded(EventMessage)>
	//    2    4:ireturn         
	}

*/


/*
	static Handler access$300(PlayerEmsgHandler playeremsghandler)
	{
		return playeremsghandler.handler;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Handler handler>
	//    2    4:areturn         
	}

*/
}
