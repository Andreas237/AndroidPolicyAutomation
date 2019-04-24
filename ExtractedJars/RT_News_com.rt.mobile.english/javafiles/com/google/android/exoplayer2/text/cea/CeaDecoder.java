// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.text.*;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

abstract class CeaDecoder
	implements SubtitleDecoder
{
	private static final class CeaInputBuffer extends SubtitleInputBuffer
		implements Comparable
	{

		public int compareTo(CeaInputBuffer ceainputbuffer)
		{
			boolean flag = isEndOfStream();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #30  <Method boolean isEndOfStream()>
		//    2    4:istore_3        
			boolean flag1 = ceainputbuffer.isEndOfStream();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #30  <Method boolean isEndOfStream()>
		//    5    9:istore          4
			byte byte0 = -1;
		//    6   11:iconst_m1       
		//    7   12:istore_2        
			if(flag != flag1)
		//*   8   13:iload_3         
		//*   9   14:iload           4
		//*  10   16:icmpeq          30
			{
				if(isEndOfStream())
		//*  11   19:aload_0         
		//*  12   20:invokevirtual   #30  <Method boolean isEndOfStream()>
		//*  13   23:ifeq            28
					byte0 = 1;
		//   14   26:iconst_1        
		//   15   27:istore_2        
				return ((int) (byte0));
		//   16   28:iload_2         
		//   17   29:ireturn         
			}
			long l1 = timeUs - ceainputbuffer.timeUs;
		//   18   30:aload_0         
		//   19   31:getfield        #33  <Field long timeUs>
		//   20   34:aload_1         
		//   21   35:getfield        #33  <Field long timeUs>
		//   22   38:lsub            
		//   23   39:lstore          7
			long l = l1;
		//   24   41:lload           7
		//   25   43:lstore          5
			if(l1 == 0L)
		//*  26   45:lload           7
		//*  27   47:lconst_0        
		//*  28   48:lcmp            
		//*  29   49:ifne            72
			{
				l = queuedInputBufferCount - ceainputbuffer.queuedInputBufferCount;
		//   30   52:aload_0         
		//   31   53:getfield        #23  <Field long queuedInputBufferCount>
		//   32   56:aload_1         
		//   33   57:getfield        #23  <Field long queuedInputBufferCount>
		//   34   60:lsub            
		//   35   61:lstore          5
				if(l == 0L)
		//*  36   63:lload           5
		//*  37   65:lconst_0        
		//*  38   66:lcmp            
		//*  39   67:ifne            72
					return 0;
		//   40   70:iconst_0        
		//   41   71:ireturn         
			}
			if(l > 0L)
		//*  42   72:lload           5
		//*  43   74:lconst_0        
		//*  44   75:lcmp            
		//*  45   76:ifle            81
				byte0 = 1;
		//   46   79:iconst_1        
		//   47   80:istore_2        
			return ((int) (byte0));
		//   48   81:iload_2         
		//   49   82:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((CeaInputBuffer)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class CeaDecoder$CeaInputBuffer>
		//    3    5:invokevirtual   #37  <Method int compareTo(CeaDecoder$CeaInputBuffer)>
		//    4    8:ireturn         
		}

		private long queuedInputBufferCount;


/*
		static long access$202(CeaInputBuffer ceainputbuffer, long l)
		{
			ceainputbuffer.queuedInputBufferCount = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #23  <Field long queuedInputBufferCount>
			return l;
		//    3    5:lload_1         
		//    4    6:lreturn         
		}

*/

		private CeaInputBuffer()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void SubtitleInputBuffer()>
		//    2    4:return          
		}

	}

	private final class CeaOutputBuffer extends SubtitleOutputBuffer
	{

		public final void release()
		{
			releaseOutputBuffer(((SubtitleOutputBuffer) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field CeaDecoder this$0>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #25  <Method void CeaDecoder.releaseOutputBuffer(SubtitleOutputBuffer)>
		//    4    8:return          
		}

		final CeaDecoder this$0;

		private CeaOutputBuffer()
		{
			this$0 = CeaDecoder.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field CeaDecoder this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void SubtitleOutputBuffer()>
		//    5    9:return          
		}

	}


	public CeaDecoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #38  <Class ArrayDeque>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void ArrayDeque()>
	//    6   12:putfield        #41  <Field ArrayDeque availableInputBuffers>
		boolean flag = false;
	//    7   15:iconst_0        
	//    8   16:istore_2        
		for(int i = 0; i < 10; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:bipush          10
	//*  13   22:icmpge          48
			availableInputBuffers.add(((Object) (new CeaInputBuffer())));
	//   14   25:aload_0         
	//   15   26:getfield        #41  <Field ArrayDeque availableInputBuffers>
	//   16   29:new             #10  <Class CeaDecoder$CeaInputBuffer>
	//   17   32:dup             
	//   18   33:aconst_null     
	//   19   34:invokespecial   #44  <Method void CeaDecoder$CeaInputBuffer(CeaDecoder$1)>
	//   20   37:invokevirtual   #48  <Method boolean ArrayDeque.add(Object)>
	//   21   40:pop             

	//   22   41:iload_1         
	//   23   42:iconst_1        
	//   24   43:iadd            
	//   25   44:istore_1        
	//*  26   45:goto            19
	//   27   48:aload_0         
	//   28   49:new             #38  <Class ArrayDeque>
	//   29   52:dup             
	//   30   53:invokespecial   #39  <Method void ArrayDeque()>
	//   31   56:putfield        #50  <Field ArrayDeque availableOutputBuffers>
		for(int j = ((int) (flag)); j < 2; j++)
	//*  32   59:iload_2         
	//*  33   60:istore_1        
	//*  34   61:iload_1         
	//*  35   62:iconst_2        
	//*  36   63:icmpge          90
			availableOutputBuffers.add(((Object) (new CeaOutputBuffer())));
	//   37   66:aload_0         
	//   38   67:getfield        #50  <Field ArrayDeque availableOutputBuffers>
	//   39   70:new             #13  <Class CeaDecoder$CeaOutputBuffer>
	//   40   73:dup             
	//   41   74:aload_0         
	//   42   75:aconst_null     
	//   43   76:invokespecial   #53  <Method void CeaDecoder$CeaOutputBuffer(CeaDecoder, CeaDecoder$1)>
	//   44   79:invokevirtual   #48  <Method boolean ArrayDeque.add(Object)>
	//   45   82:pop             

	//   46   83:iload_1         
	//   47   84:iconst_1        
	//   48   85:iadd            
	//   49   86:istore_1        
	//*  50   87:goto            61
	//   51   90:aload_0         
	//   52   91:new             #55  <Class PriorityQueue>
	//   53   94:dup             
	//   54   95:invokespecial   #56  <Method void PriorityQueue()>
	//   55   98:putfield        #58  <Field PriorityQueue queuedInputBuffers>
	//   56  101:return          
	}

	private void releaseInputBuffer(CeaInputBuffer ceainputbuffer)
	{
		ceainputbuffer.clear();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #64  <Method void CeaDecoder$CeaInputBuffer.clear()>
		availableInputBuffers.add(((Object) (ceainputbuffer)));
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field ArrayDeque availableInputBuffers>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #48  <Method boolean ArrayDeque.add(Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	protected abstract Subtitle createSubtitle();

	protected abstract void decode(SubtitleInputBuffer subtitleinputbuffer);

	public SubtitleInputBuffer dequeueInputBuffer()
		throws SubtitleDecoderException
	{
		boolean flag;
		if(dequeuedInputBuffer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field CeaDecoder$CeaInputBuffer dequeuedInputBuffer>
	//*   2    4:ifnonnull       12
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
	//    9   15:invokestatic    #80  <Method void Assertions.checkState(boolean)>
		if(availableInputBuffers.isEmpty())
	//*  10   18:aload_0         
	//*  11   19:getfield        #41  <Field ArrayDeque availableInputBuffers>
	//*  12   22:invokevirtual   #84  <Method boolean ArrayDeque.isEmpty()>
	//*  13   25:ifeq            30
		{
			return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
		} else
		{
			dequeuedInputBuffer = (CeaInputBuffer)availableInputBuffers.pollFirst();
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:getfield        #41  <Field ArrayDeque availableInputBuffers>
	//   19   35:invokevirtual   #88  <Method Object ArrayDeque.pollFirst()>
	//   20   38:checkcast       #10  <Class CeaDecoder$CeaInputBuffer>
	//   21   41:putfield        #74  <Field CeaDecoder$CeaInputBuffer dequeuedInputBuffer>
			return ((SubtitleInputBuffer) (dequeuedInputBuffer));
	//   22   44:aload_0         
	//   23   45:getfield        #74  <Field CeaDecoder$CeaInputBuffer dequeuedInputBuffer>
	//   24   48:areturn         
		}
	}

	public volatile Object dequeueInputBuffer()
		throws Exception
	{
		return ((Object) (dequeueInputBuffer()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method SubtitleInputBuffer dequeueInputBuffer()>
	//    2    4:areturn         
	}

	public SubtitleOutputBuffer dequeueOutputBuffer()
		throws SubtitleDecoderException
	{
		if(availableOutputBuffers.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field ArrayDeque availableOutputBuffers>
	//*   2    4:invokevirtual   #84  <Method boolean ArrayDeque.isEmpty()>
	//*   3    7:ifeq            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		CeaInputBuffer ceainputbuffer;
		for(; !queuedInputBuffers.isEmpty() && ((CeaInputBuffer)queuedInputBuffers.peek()).timeUs <= playbackPositionUs; releaseInputBuffer(ceainputbuffer))
	//*   6   12:aload_0         
	//*   7   13:getfield        #58  <Field PriorityQueue queuedInputBuffers>
	//*   8   16:invokevirtual   #96  <Method boolean PriorityQueue.isEmpty()>
	//*   9   19:ifne            146
	//*  10   22:aload_0         
	//*  11   23:getfield        #58  <Field PriorityQueue queuedInputBuffers>
	//*  12   26:invokevirtual   #99  <Method Object PriorityQueue.peek()>
	//*  13   29:checkcast       #10  <Class CeaDecoder$CeaInputBuffer>
	//*  14   32:getfield        #102 <Field long CeaDecoder$CeaInputBuffer.timeUs>
	//*  15   35:aload_0         
	//*  16   36:getfield        #104 <Field long playbackPositionUs>
	//*  17   39:lcmp            
	//*  18   40:ifgt            146
		{
			ceainputbuffer = (CeaInputBuffer)queuedInputBuffers.poll();
	//   19   43:aload_0         
	//   20   44:getfield        #58  <Field PriorityQueue queuedInputBuffers>
	//   21   47:invokevirtual   #107 <Method Object PriorityQueue.poll()>
	//   22   50:checkcast       #10  <Class CeaDecoder$CeaInputBuffer>
	//   23   53:astore_1        
			if(ceainputbuffer.isEndOfStream())
	//*  24   54:aload_1         
	//*  25   55:invokevirtual   #110 <Method boolean CeaDecoder$CeaInputBuffer.isEndOfStream()>
	//*  26   58:ifeq            84
			{
				SubtitleOutputBuffer subtitleoutputbuffer = (SubtitleOutputBuffer)availableOutputBuffers.pollFirst();
	//   27   61:aload_0         
	//   28   62:getfield        #50  <Field ArrayDeque availableOutputBuffers>
	//   29   65:invokevirtual   #88  <Method Object ArrayDeque.pollFirst()>
	//   30   68:checkcast       #112 <Class SubtitleOutputBuffer>
	//   31   71:astore_2        
				subtitleoutputbuffer.addFlag(4);
	//   32   72:aload_2         
	//   33   73:iconst_4        
	//   34   74:invokevirtual   #116 <Method void SubtitleOutputBuffer.addFlag(int)>
				releaseInputBuffer(ceainputbuffer);
	//   35   77:aload_0         
	//   36   78:aload_1         
	//   37   79:invokespecial   #118 <Method void releaseInputBuffer(CeaDecoder$CeaInputBuffer)>
				return subtitleoutputbuffer;
	//   38   82:aload_2         
	//   39   83:areturn         
			}
			decode(((SubtitleInputBuffer) (ceainputbuffer)));
	//   40   84:aload_0         
	//   41   85:aload_1         
	//   42   86:invokevirtual   #120 <Method void decode(SubtitleInputBuffer)>
			if(!isNewSubtitleDataAvailable())
				continue;
	//   43   89:aload_0         
	//   44   90:invokevirtual   #123 <Method boolean isNewSubtitleDataAvailable()>
	//   45   93:ifeq            138
			Subtitle subtitle = createSubtitle();
	//   46   96:aload_0         
	//   47   97:invokevirtual   #125 <Method Subtitle createSubtitle()>
	//   48  100:astore_2        
			if(!ceainputbuffer.isDecodeOnly())
	//*  49  101:aload_1         
	//*  50  102:invokevirtual   #128 <Method boolean CeaDecoder$CeaInputBuffer.isDecodeOnly()>
	//*  51  105:ifne            138
			{
				SubtitleOutputBuffer subtitleoutputbuffer1 = (SubtitleOutputBuffer)availableOutputBuffers.pollFirst();
	//   52  108:aload_0         
	//   53  109:getfield        #50  <Field ArrayDeque availableOutputBuffers>
	//   54  112:invokevirtual   #88  <Method Object ArrayDeque.pollFirst()>
	//   55  115:checkcast       #112 <Class SubtitleOutputBuffer>
	//   56  118:astore_3        
				subtitleoutputbuffer1.setContent(ceainputbuffer.timeUs, subtitle, 0xffffffffL);
	//   57  119:aload_3         
	//   58  120:aload_1         
	//   59  121:getfield        #102 <Field long CeaDecoder$CeaInputBuffer.timeUs>
	//   60  124:aload_2         
	//   61  125:ldc2w           #129 <Long 0xffffffffL>
	//   62  128:invokevirtual   #134 <Method void SubtitleOutputBuffer.setContent(long, Subtitle, long)>
				releaseInputBuffer(ceainputbuffer);
	//   63  131:aload_0         
	//   64  132:aload_1         
	//   65  133:invokespecial   #118 <Method void releaseInputBuffer(CeaDecoder$CeaInputBuffer)>
				return subtitleoutputbuffer1;
	//   66  136:aload_3         
	//   67  137:areturn         
			}
		}

	//   68  138:aload_0         
	//   69  139:aload_1         
	//   70  140:invokespecial   #118 <Method void releaseInputBuffer(CeaDecoder$CeaInputBuffer)>
	//*  71  143:goto            12
		return null;
	//   72  146:aconst_null     
	//   73  147:areturn         
	}

	public volatile Object dequeueOutputBuffer()
		throws Exception
	{
		return ((Object) (dequeueOutputBuffer()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #136 <Method SubtitleOutputBuffer dequeueOutputBuffer()>
	//    2    4:areturn         
	}

	public void flush()
	{
		queuedInputBufferCount = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #139 <Field long queuedInputBufferCount>
		playbackPositionUs = 0L;
	//    3    5:aload_0         
	//    4    6:lconst_0        
	//    5    7:putfield        #104 <Field long playbackPositionUs>
		for(; !queuedInputBuffers.isEmpty(); releaseInputBuffer((CeaInputBuffer)queuedInputBuffers.poll()));
	//    6   10:aload_0         
	//    7   11:getfield        #58  <Field PriorityQueue queuedInputBuffers>
	//    8   14:invokevirtual   #96  <Method boolean PriorityQueue.isEmpty()>
	//    9   17:ifne            37
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #58  <Field PriorityQueue queuedInputBuffers>
	//   13   25:invokevirtual   #107 <Method Object PriorityQueue.poll()>
	//   14   28:checkcast       #10  <Class CeaDecoder$CeaInputBuffer>
	//   15   31:invokespecial   #118 <Method void releaseInputBuffer(CeaDecoder$CeaInputBuffer)>
	//*  16   34:goto            10
		if(dequeuedInputBuffer != null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #74  <Field CeaDecoder$CeaInputBuffer dequeuedInputBuffer>
	//*  19   41:ifnull          57
		{
			releaseInputBuffer(dequeuedInputBuffer);
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:getfield        #74  <Field CeaDecoder$CeaInputBuffer dequeuedInputBuffer>
	//   23   49:invokespecial   #118 <Method void releaseInputBuffer(CeaDecoder$CeaInputBuffer)>
			dequeuedInputBuffer = null;
	//   24   52:aload_0         
	//   25   53:aconst_null     
	//   26   54:putfield        #74  <Field CeaDecoder$CeaInputBuffer dequeuedInputBuffer>
		}
	//   27   57:return          
	}

	public abstract String getName();

	protected abstract boolean isNewSubtitleDataAvailable();

	public void queueInputBuffer(SubtitleInputBuffer subtitleinputbuffer)
		throws SubtitleDecoderException
	{
		boolean flag;
		if(subtitleinputbuffer == dequeuedInputBuffer)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #74  <Field CeaDecoder$CeaInputBuffer dequeuedInputBuffer>
	//*   3    5:if_acmpne       13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		Assertions.checkArgument(flag);
	//    9   15:iload_2         
	//   10   16:invokestatic    #145 <Method void Assertions.checkArgument(boolean)>
		if(subtitleinputbuffer.isDecodeOnly())
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #148 <Method boolean SubtitleInputBuffer.isDecodeOnly()>
	//*  13   23:ifeq            37
		{
			releaseInputBuffer(dequeuedInputBuffer);
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #74  <Field CeaDecoder$CeaInputBuffer dequeuedInputBuffer>
	//   17   31:invokespecial   #118 <Method void releaseInputBuffer(CeaDecoder$CeaInputBuffer)>
		} else
	//*  18   34:goto            72
		{
			subtitleinputbuffer = ((SubtitleInputBuffer) (dequeuedInputBuffer));
	//   19   37:aload_0         
	//   20   38:getfield        #74  <Field CeaDecoder$CeaInputBuffer dequeuedInputBuffer>
	//   21   41:astore_1        
			long l = queuedInputBufferCount;
	//   22   42:aload_0         
	//   23   43:getfield        #139 <Field long queuedInputBufferCount>
	//   24   46:lstore_3        
			queuedInputBufferCount = l + 1L;
	//   25   47:aload_0         
	//   26   48:lload_3         
	//   27   49:lconst_1        
	//   28   50:ladd            
	//   29   51:putfield        #139 <Field long queuedInputBufferCount>
			subtitleinputbuffer.queuedInputBufferCount = l;
	//   30   54:aload_1         
	//   31   55:lload_3         
	//   32   56:invokestatic    #152 <Method long CeaDecoder$CeaInputBuffer.access$202(CeaDecoder$CeaInputBuffer, long)>
	//   33   59:pop2            
			queuedInputBuffers.add(((Object) (dequeuedInputBuffer)));
	//   34   60:aload_0         
	//   35   61:getfield        #58  <Field PriorityQueue queuedInputBuffers>
	//   36   64:aload_0         
	//   37   65:getfield        #74  <Field CeaDecoder$CeaInputBuffer dequeuedInputBuffer>
	//   38   68:invokevirtual   #153 <Method boolean PriorityQueue.add(Object)>
	//   39   71:pop             
		}
		dequeuedInputBuffer = null;
	//   40   72:aload_0         
	//   41   73:aconst_null     
	//   42   74:putfield        #74  <Field CeaDecoder$CeaInputBuffer dequeuedInputBuffer>
	//   43   77:return          
	}

	public volatile void queueInputBuffer(Object obj)
		throws Exception
	{
		queueInputBuffer((SubtitleInputBuffer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #147 <Class SubtitleInputBuffer>
	//    3    5:invokevirtual   #156 <Method void queueInputBuffer(SubtitleInputBuffer)>
	//    4    8:return          
	}

	public void release()
	{
	//    0    0:return          
	}

	protected void releaseOutputBuffer(SubtitleOutputBuffer subtitleoutputbuffer)
	{
		subtitleoutputbuffer.clear();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #160 <Method void SubtitleOutputBuffer.clear()>
		availableOutputBuffers.add(((Object) (subtitleoutputbuffer)));
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field ArrayDeque availableOutputBuffers>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #48  <Method boolean ArrayDeque.add(Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void setPositionUs(long l)
	{
		playbackPositionUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #104 <Field long playbackPositionUs>
	//    3    5:return          
	}

	private static final int NUM_INPUT_BUFFERS = 10;
	private static final int NUM_OUTPUT_BUFFERS = 2;
	private final ArrayDeque availableInputBuffers = new ArrayDeque();
	private final ArrayDeque availableOutputBuffers = new ArrayDeque();
	private CeaInputBuffer dequeuedInputBuffer;
	private long playbackPositionUs;
	private long queuedInputBufferCount;
	private final PriorityQueue queuedInputBuffers = new PriorityQueue();
}
