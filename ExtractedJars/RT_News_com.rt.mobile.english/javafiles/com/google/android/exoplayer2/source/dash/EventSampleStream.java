// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.dash.manifest.EventStream;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;

final class EventSampleStream
	implements SampleStream
{

	public EventSampleStream(EventStream eventstream, Format format, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		upstreamFormat = format;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #28  <Field Format upstreamFormat>
		eventStream = eventstream;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #30  <Field EventStream eventStream>
	//    8   14:aload_0         
	//    9   15:new             #32  <Class EventMessageEncoder>
	//   10   18:dup             
	//   11   19:invokespecial   #33  <Method void EventMessageEncoder()>
	//   12   22:putfield        #35  <Field EventMessageEncoder eventMessageEncoder>
		pendingSeekPositionUs = 0x1L;
	//   13   25:aload_0         
	//   14   26:ldc2w           #36  <Long 0x1L>
	//   15   29:putfield        #39  <Field long pendingSeekPositionUs>
		eventTimesUs = eventstream.presentationTimesUs;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:getfield        #44  <Field long[] EventStream.presentationTimesUs>
	//   19   37:putfield        #46  <Field long[] eventTimesUs>
		updateEventStream(eventstream, flag);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:iload_3         
	//   23   43:invokevirtual   #50  <Method void updateEventStream(EventStream, boolean)>
	//   24   46:return          
	}

	public String eventStreamId()
	{
		return eventStream.id();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field EventStream eventStream>
	//    2    4:invokevirtual   #56  <Method String EventStream.id()>
	//    3    7:areturn         
	}

	public boolean isReady()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
	//    0    0:return          
	}

	public int readData(FormatHolder formatholder, DecoderInputBuffer decoderinputbuffer, boolean flag)
	{
		if(!flag && isFormatSentDownstream)
	//*   0    0:iload_3         
	//*   1    1:ifne            124
	//*   2    4:aload_0         
	//*   3    5:getfield        #66  <Field boolean isFormatSentDownstream>
	//*   4    8:ifne            14
	//*   5   11:goto            124
		{
			if(currentIndex == eventTimesUs.length)
	//*   6   14:aload_0         
	//*   7   15:getfield        #68  <Field int currentIndex>
	//*   8   18:aload_0         
	//*   9   19:getfield        #46  <Field long[] eventTimesUs>
	//*  10   22:arraylength     
	//*  11   23:icmpne          44
				if(!eventStreamAppendable)
	//*  12   26:aload_0         
	//*  13   27:getfield        #70  <Field boolean eventStreamAppendable>
	//*  14   30:ifne            41
				{
					decoderinputbuffer.setFlags(4);
	//   15   33:aload_2         
	//   16   34:iconst_4        
	//   17   35:invokevirtual   #76  <Method void DecoderInputBuffer.setFlags(int)>
					return -4;
	//   18   38:bipush          -4
	//   19   40:ireturn         
				} else
				{
					return -3;
	//   20   41:bipush          -3
	//   21   43:ireturn         
				}
			int i = currentIndex;
	//   22   44:aload_0         
	//   23   45:getfield        #68  <Field int currentIndex>
	//   24   48:istore          4
			currentIndex = i + 1;
	//   25   50:aload_0         
	//   26   51:iload           4
	//   27   53:iconst_1        
	//   28   54:iadd            
	//   29   55:putfield        #68  <Field int currentIndex>
			formatholder = ((FormatHolder) (eventMessageEncoder.encode(eventStream.events[i], eventStream.timescale)));
	//   30   58:aload_0         
	//   31   59:getfield        #35  <Field EventMessageEncoder eventMessageEncoder>
	//   32   62:aload_0         
	//   33   63:getfield        #30  <Field EventStream eventStream>
	//   34   66:getfield        #80  <Field com.google.android.exoplayer2.metadata.emsg.EventMessage[] EventStream.events>
	//   35   69:iload           4
	//   36   71:aaload          
	//   37   72:aload_0         
	//   38   73:getfield        #30  <Field EventStream eventStream>
	//   39   76:getfield        #83  <Field long EventStream.timescale>
	//   40   79:invokevirtual   #87  <Method byte[] EventMessageEncoder.encode(com.google.android.exoplayer2.metadata.emsg.EventMessage, long)>
	//   41   82:astore_1        
			if(formatholder != null)
	//*  42   83:aload_1         
	//*  43   84:ifnull          121
			{
				decoderinputbuffer.ensureSpaceForWrite(formatholder.length);
	//   44   87:aload_2         
	//   45   88:aload_1         
	//   46   89:arraylength     
	//   47   90:invokevirtual   #90  <Method void DecoderInputBuffer.ensureSpaceForWrite(int)>
				decoderinputbuffer.setFlags(1);
	//   48   93:aload_2         
	//   49   94:iconst_1        
	//   50   95:invokevirtual   #76  <Method void DecoderInputBuffer.setFlags(int)>
				decoderinputbuffer.data.put(((byte []) (formatholder)));
	//   51   98:aload_2         
	//   52   99:getfield        #94  <Field ByteBuffer DecoderInputBuffer.data>
	//   53  102:aload_1         
	//   54  103:invokevirtual   #100 <Method ByteBuffer ByteBuffer.put(byte[])>
	//   55  106:pop             
				decoderinputbuffer.timeUs = eventTimesUs[i];
	//   56  107:aload_2         
	//   57  108:aload_0         
	//   58  109:getfield        #46  <Field long[] eventTimesUs>
	//   59  112:iload           4
	//   60  114:laload          
	//   61  115:putfield        #103 <Field long DecoderInputBuffer.timeUs>
				return -4;
	//   62  118:bipush          -4
	//   63  120:ireturn         
			} else
			{
				return -3;
	//   64  121:bipush          -3
	//   65  123:ireturn         
			}
		} else
		{
			formatholder.format = upstreamFormat;
	//   66  124:aload_1         
	//   67  125:aload_0         
	//   68  126:getfield        #28  <Field Format upstreamFormat>
	//   69  129:putfield        #108 <Field Format FormatHolder.format>
			isFormatSentDownstream = true;
	//   70  132:aload_0         
	//   71  133:iconst_1        
	//   72  134:putfield        #66  <Field boolean isFormatSentDownstream>
			return -5;
	//   73  137:bipush          -5
	//   74  139:ireturn         
		}
	}

	public void seekToUs(long l)
	{
		long al[] = eventTimesUs;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field long[] eventTimesUs>
	//    2    4:astore          5
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
		currentIndex = Util.binarySearchCeil(al, l, true, false);
	//    5    9:aload_0         
	//    6   10:aload           5
	//    7   12:lload_1         
	//    8   13:iconst_1        
	//    9   14:iconst_0        
	//   10   15:invokestatic    #116 <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
	//   11   18:putfield        #68  <Field int currentIndex>
		boolean flag = flag1;
	//   12   21:iload           4
	//   13   23:istore_3        
		if(eventStreamAppendable)
	//*  14   24:aload_0         
	//*  15   25:getfield        #70  <Field boolean eventStreamAppendable>
	//*  16   28:ifeq            48
		{
			flag = flag1;
	//   17   31:iload           4
	//   18   33:istore_3        
			if(currentIndex == eventTimesUs.length)
	//*  19   34:aload_0         
	//*  20   35:getfield        #68  <Field int currentIndex>
	//*  21   38:aload_0         
	//*  22   39:getfield        #46  <Field long[] eventTimesUs>
	//*  23   42:arraylength     
	//*  24   43:icmpne          48
				flag = true;
	//   25   46:iconst_1        
	//   26   47:istore_3        
		}
		if(!flag)
	//*  27   48:iload_3         
	//*  28   49:ifeq            55
	//*  29   52:goto            59
			l = 0x1L;
	//   30   55:ldc2w           #36  <Long 0x1L>
	//   31   58:lstore_1        
		pendingSeekPositionUs = l;
	//   32   59:aload_0         
	//   33   60:lload_1         
	//   34   61:putfield        #39  <Field long pendingSeekPositionUs>
	//   35   64:return          
	}

	public int skipData(long l)
	{
		int i = Math.max(currentIndex, Util.binarySearchCeil(eventTimesUs, l, true, false));
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int currentIndex>
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field long[] eventTimesUs>
	//    4    8:lload_1         
	//    5    9:iconst_1        
	//    6   10:iconst_0        
	//    7   11:invokestatic    #116 <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
	//    8   14:invokestatic    #124 <Method int Math.max(int, int)>
	//    9   17:istore_3        
		int j = currentIndex;
	//   10   18:aload_0         
	//   11   19:getfield        #68  <Field int currentIndex>
	//   12   22:istore          4
		currentIndex = i;
	//   13   24:aload_0         
	//   14   25:iload_3         
	//   15   26:putfield        #68  <Field int currentIndex>
		return i - j;
	//   16   29:iload_3         
	//   17   30:iload           4
	//   18   32:isub            
	//   19   33:ireturn         
	}

	public void updateEventStream(EventStream eventstream, boolean flag)
	{
		long l;
		if(currentIndex == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field int currentIndex>
	//*   2    4:ifne            14
			l = 0x1L;
	//    3    7:ldc2w           #36  <Long 0x1L>
	//    4   10:lstore_3        
		else
	//*   5   11:goto            26
			l = eventTimesUs[currentIndex - 1];
	//    6   14:aload_0         
	//    7   15:getfield        #46  <Field long[] eventTimesUs>
	//    8   18:aload_0         
	//    9   19:getfield        #68  <Field int currentIndex>
	//   10   22:iconst_1        
	//   11   23:isub            
	//   12   24:laload          
	//   13   25:lstore_3        
		eventStreamAppendable = flag;
	//   14   26:aload_0         
	//   15   27:iload_2         
	//   16   28:putfield        #70  <Field boolean eventStreamAppendable>
		eventStream = eventstream;
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:putfield        #30  <Field EventStream eventStream>
		eventTimesUs = eventstream.presentationTimesUs;
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:getfield        #44  <Field long[] EventStream.presentationTimesUs>
	//   23   41:putfield        #46  <Field long[] eventTimesUs>
		if(pendingSeekPositionUs != 0x1L)
	//*  24   44:aload_0         
	//*  25   45:getfield        #39  <Field long pendingSeekPositionUs>
	//*  26   48:ldc2w           #36  <Long 0x1L>
	//*  27   51:lcmp            
	//*  28   52:ifeq            64
		{
			seekToUs(pendingSeekPositionUs);
	//   29   55:aload_0         
	//   30   56:aload_0         
	//   31   57:getfield        #39  <Field long pendingSeekPositionUs>
	//   32   60:invokevirtual   #126 <Method void seekToUs(long)>
			return;
	//   33   63:return          
		}
		if(l != 0x1L)
	//*  34   64:lload_3         
	//*  35   65:ldc2w           #36  <Long 0x1L>
	//*  36   68:lcmp            
	//*  37   69:ifeq            86
			currentIndex = Util.binarySearchCeil(eventTimesUs, l, false, false);
	//   38   72:aload_0         
	//   39   73:aload_0         
	//   40   74:getfield        #46  <Field long[] eventTimesUs>
	//   41   77:lload_3         
	//   42   78:iconst_0        
	//   43   79:iconst_0        
	//   44   80:invokestatic    #116 <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
	//   45   83:putfield        #68  <Field int currentIndex>
	//   46   86:return          
	}

	private int currentIndex;
	private final EventMessageEncoder eventMessageEncoder = new EventMessageEncoder();
	private EventStream eventStream;
	private boolean eventStreamAppendable;
	private long eventTimesUs[];
	private boolean isFormatSentDownstream;
	private long pendingSeekPositionUs;
	private final Format upstreamFormat;
}
