// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util.extensions;

import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.util.Assertions;
import java.util.LinkedList;

// Referenced classes of package com.google.android.exoplayer.util.extensions:
//			Decoder, InputBuffer, OutputBuffer

public abstract class SimpleDecoder extends Thread
	implements Decoder
{
	public static interface EventListener
	{

		public abstract void onDecoderError(Object obj);
	}


	protected SimpleDecoder(InputBuffer ainputbuffer[], OutputBuffer aoutputbuffer[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Thread()>
	//    2    4:aload_0         
	//    3    5:new             #42  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #43  <Method void Object()>
	//    6   12:putfield        #45  <Field Object lock>
	//    7   15:aload_0         
	//    8   16:new             #47  <Class LinkedList>
	//    9   19:dup             
	//   10   20:invokespecial   #48  <Method void LinkedList()>
	//   11   23:putfield        #50  <Field LinkedList queuedInputBuffers>
	//   12   26:aload_0         
	//   13   27:new             #47  <Class LinkedList>
	//   14   30:dup             
	//   15   31:invokespecial   #48  <Method void LinkedList()>
	//   16   34:putfield        #52  <Field LinkedList queuedOutputBuffers>
		availableInputBuffers = ainputbuffer;
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:putfield        #54  <Field InputBuffer[] availableInputBuffers>
		availableInputBufferCount = ainputbuffer.length;
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:arraylength     
	//   23   45:putfield        #56  <Field int availableInputBufferCount>
		boolean flag = false;
	//   24   48:iconst_0        
	//   25   49:istore          4
		for(int i = 0; i < availableInputBufferCount; i++)
	//*  26   51:iconst_0        
	//*  27   52:istore_3        
	//*  28   53:iload_3         
	//*  29   54:aload_0         
	//*  30   55:getfield        #56  <Field int availableInputBufferCount>
	//*  31   58:icmpge          78
			availableInputBuffers[i] = createInputBuffer();
	//   32   61:aload_0         
	//   33   62:getfield        #54  <Field InputBuffer[] availableInputBuffers>
	//   34   65:iload_3         
	//   35   66:aload_0         
	//   36   67:invokevirtual   #60  <Method InputBuffer createInputBuffer()>
	//   37   70:aastore         

	//   38   71:iload_3         
	//   39   72:iconst_1        
	//   40   73:iadd            
	//   41   74:istore_3        
	//*  42   75:goto            53
		availableOutputBuffers = aoutputbuffer;
	//   43   78:aload_0         
	//   44   79:aload_2         
	//   45   80:putfield        #62  <Field OutputBuffer[] availableOutputBuffers>
		availableOutputBufferCount = aoutputbuffer.length;
	//   46   83:aload_0         
	//   47   84:aload_2         
	//   48   85:arraylength     
	//   49   86:putfield        #64  <Field int availableOutputBufferCount>
		for(int j = ((int) (flag)); j < availableOutputBufferCount; j++)
	//*  50   89:iload           4
	//*  51   91:istore_3        
	//*  52   92:iload_3         
	//*  53   93:aload_0         
	//*  54   94:getfield        #64  <Field int availableOutputBufferCount>
	//*  55   97:icmpge          117
			availableOutputBuffers[j] = createOutputBuffer();
	//   56  100:aload_0         
	//   57  101:getfield        #62  <Field OutputBuffer[] availableOutputBuffers>
	//   58  104:iload_3         
	//   59  105:aload_0         
	//   60  106:invokevirtual   #68  <Method OutputBuffer createOutputBuffer()>
	//   61  109:aastore         

	//   62  110:iload_3         
	//   63  111:iconst_1        
	//   64  112:iadd            
	//   65  113:istore_3        
	//*  66  114:goto            92
	//   67  117:return          
	}

	private boolean canDecodeBuffer()
	{
		return !queuedInputBuffers.isEmpty() && availableOutputBufferCount > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field LinkedList queuedInputBuffers>
	//    2    4:invokevirtual   #76  <Method boolean LinkedList.isEmpty()>
	//    3    7:ifne            19
	//    4   10:aload_0         
	//    5   11:getfield        #64  <Field int availableOutputBufferCount>
	//    6   14:ifle            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private boolean decode()
		throws InterruptedException
	{
		obj1 = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object lock>
	//    2    4:astore          4
		obj1;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		for(; !released && !canDecodeBuffer(); lock.wait());
	//    5    9:aload_0         
	//    6   10:getfield        #81  <Field boolean released>
	//    7   13:ifne            33
	//    8   16:aload_0         
	//    9   17:invokespecial   #83  <Method boolean canDecodeBuffer()>
	//   10   20:ifne            33
	//   11   23:aload_0         
	//   12   24:getfield        #45  <Field Object lock>
	//   13   27:invokevirtual   #86  <Method void Object.wait()>
	//*  14   30:goto            9
		if(!released)
			break MISSING_BLOCK_LABEL_45;
	//   15   33:aload_0         
	//   16   34:getfield        #81  <Field boolean released>
	//   17   37:ifeq            45
		obj1;
	//   18   40:aload           4
		JVM INSTR monitorexit ;
	//   19   42:monitorexit     
		return false;
	//   20   43:iconst_0        
	//   21   44:ireturn         
		int i;
		Object aobj[];
		obj = ((Object) ((InputBuffer)queuedInputBuffers.removeFirst()));
	//   22   45:aload_0         
	//   23   46:getfield        #50  <Field LinkedList queuedInputBuffers>
	//   24   49:invokevirtual   #90  <Method Object LinkedList.removeFirst()>
	//   25   52:checkcast       #92  <Class InputBuffer>
	//   26   55:astore_3        
		aobj = ((Object []) (availableOutputBuffers));
	//   27   56:aload_0         
	//   28   57:getfield        #62  <Field OutputBuffer[] availableOutputBuffers>
	//   29   60:astore          5
		i = availableOutputBufferCount - 1;
	//   30   62:aload_0         
	//   31   63:getfield        #64  <Field int availableOutputBufferCount>
	//   32   66:iconst_1        
	//   33   67:isub            
	//   34   68:istore_1        
		availableOutputBufferCount = i;
	//   35   69:aload_0         
	//   36   70:iload_1         
	//   37   71:putfield        #64  <Field int availableOutputBufferCount>
		OutputBuffer outputbuffer = aobj[i];
	//   38   74:aload           5
	//   39   76:iload_1         
	//   40   77:aaload          
	//   41   78:astore          5
		boolean flag;
		flag = flushed;
	//   42   80:aload_0         
	//   43   81:getfield        #94  <Field boolean flushed>
	//   44   84:istore_2        
		flushed = false;
	//   45   85:aload_0         
	//   46   86:iconst_0        
	//   47   87:putfield        #94  <Field boolean flushed>
		obj1;
	//   48   90:aload           4
		JVM INSTR monitorexit ;
	//   49   92:monitorexit     
		outputbuffer.reset();
	//   50   93:aload           5
	//   51   95:invokevirtual   #99  <Method void OutputBuffer.reset()>
		if(((InputBuffer) (obj)).getFlag(1))
	//*  52   98:aload_3         
	//*  53   99:iconst_1        
	//*  54  100:invokevirtual   #103 <Method boolean InputBuffer.getFlag(int)>
	//*  55  103:ifeq            115
		{
			outputbuffer.setFlag(1);
	//   56  106:aload           5
	//   57  108:iconst_1        
	//   58  109:invokevirtual   #107 <Method void OutputBuffer.setFlag(int)>
		} else
	//*  59  112:goto            166
		{
			if(((InputBuffer) (obj)).getFlag(2))
	//*  60  115:aload_3         
	//*  61  116:iconst_2        
	//*  62  117:invokevirtual   #103 <Method boolean InputBuffer.getFlag(int)>
	//*  63  120:ifeq            129
				outputbuffer.setFlag(2);
	//   64  123:aload           5
	//   65  125:iconst_2        
	//   66  126:invokevirtual   #107 <Method void OutputBuffer.setFlag(int)>
			exception = decode(((InputBuffer) (obj)), outputbuffer, flag);
	//   67  129:aload_0         
	//   68  130:aload_0         
	//   69  131:aload_3         
	//   70  132:aload           5
	//   71  134:iload_2         
	//   72  135:invokevirtual   #110 <Method Exception decode(InputBuffer, OutputBuffer, boolean)>
	//   73  138:putfield        #112 <Field Exception exception>
			if(exception != null)
	//*  74  141:aload_0         
	//*  75  142:getfield        #112 <Field Exception exception>
	//*  76  145:ifnull          166
			{
				synchronized(lock) { }
	//   77  148:aload_0         
	//   78  149:getfield        #45  <Field Object lock>
	//   79  152:astore_3        
	//   80  153:aload_3         
	//   81  154:monitorenter    
	//   82  155:aload_3         
	//   83  156:monitorexit     
				return false;
	//   84  157:iconst_0        
	//   85  158:ireturn         
			}
		}
		break MISSING_BLOCK_LABEL_166;
		obj1;
	//   86  159:astore          4
		obj;
	//   87  161:aload_3         
		JVM INSTR monitorexit ;
	//   88  162:monitorexit     
		throw obj1;
	//   89  163:aload           4
	//   90  165:athrow          
		obj1 = lock;
	//   91  166:aload_0         
	//   92  167:getfield        #45  <Field Object lock>
	//   93  170:astore          4
		obj1;
	//   94  172:aload           4
		JVM INSTR monitorenter ;
	//   95  174:monitorenter    
		if(flushed || outputbuffer.getFlag(2))
	//*  96  175:aload_0         
	//*  97  176:getfield        #94  <Field boolean flushed>
	//*  98  179:ifne            206
	//*  99  182:aload           5
	//* 100  184:iconst_2        
	//* 101  185:invokevirtual   #113 <Method boolean OutputBuffer.getFlag(int)>
	//* 102  188:ifeq            194
			break MISSING_BLOCK_LABEL_206;
	//  103  191:goto            206
		queuedOutputBuffers.addLast(((Object) (outputbuffer)));
	//  104  194:aload_0         
	//  105  195:getfield        #52  <Field LinkedList queuedOutputBuffers>
	//  106  198:aload           5
	//  107  200:invokevirtual   #117 <Method void LinkedList.addLast(Object)>
		break MISSING_BLOCK_LABEL_230;
	//  108  203:goto            230
		OutputBuffer aoutputbuffer[];
		aoutputbuffer = availableOutputBuffers;
	//  109  206:aload_0         
	//  110  207:getfield        #62  <Field OutputBuffer[] availableOutputBuffers>
	//  111  210:astore          6
		i = availableOutputBufferCount;
	//  112  212:aload_0         
	//  113  213:getfield        #64  <Field int availableOutputBufferCount>
	//  114  216:istore_1        
		availableOutputBufferCount = i + 1;
	//  115  217:aload_0         
	//  116  218:iload_1         
	//  117  219:iconst_1        
	//  118  220:iadd            
	//  119  221:putfield        #64  <Field int availableOutputBufferCount>
		aoutputbuffer[i] = outputbuffer;
	//  120  224:aload           6
	//  121  226:iload_1         
	//  122  227:aload           5
	//  123  229:aastore         
		outputbuffer = ((OutputBuffer) (availableInputBuffers));
	//  124  230:aload_0         
	//  125  231:getfield        #54  <Field InputBuffer[] availableInputBuffers>
	//  126  234:astore          5
		i = availableInputBufferCount;
	//  127  236:aload_0         
	//  128  237:getfield        #56  <Field int availableInputBufferCount>
	//  129  240:istore_1        
		availableInputBufferCount = i + 1;
	//  130  241:aload_0         
	//  131  242:iload_1         
	//  132  243:iconst_1        
	//  133  244:iadd            
	//  134  245:putfield        #56  <Field int availableInputBufferCount>
		outputbuffer[i] = ((InputBuffer) (obj));
	//  135  248:aload           5
	//  136  250:iload_1         
	//  137  251:aload_3         
	//  138  252:aastore         
		obj1;
	//  139  253:aload           4
		JVM INSTR monitorexit ;
	//  140  255:monitorexit     
		return true;
	//  141  256:iconst_1        
	//  142  257:ireturn         
		Exception exception1;
		exception1;
	//  143  258:astore_3        
		obj1;
	//  144  259:aload           4
		JVM INSTR monitorexit ;
	//  145  261:monitorexit     
		throw exception1;
	//  146  262:aload_3         
	//  147  263:athrow          
		exception1;
	//  148  264:astore_3        
		obj1;
	//  149  265:aload           4
		JVM INSTR monitorexit ;
	//  150  267:monitorexit     
		throw exception1;
	//  151  268:aload_3         
	//  152  269:athrow          
	}

	private void maybeNotifyDecodeLoop()
	{
		if(canDecodeBuffer())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #83  <Method boolean canDecodeBuffer()>
	//*   2    4:ifeq            14
			lock.notify();
	//    3    7:aload_0         
	//    4    8:getfield        #45  <Field Object lock>
	//    5   11:invokevirtual   #122 <Method void Object.notify()>
	//    6   14:return          
	}

	private void maybeThrowException()
		throws Exception
	{
		Exception exception1 = exception;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field Exception exception>
	//    2    4:astore_1        
		if(exception1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		else
			throw exception1;
	//    6   10:aload_1         
	//    7   11:athrow          
	}

	protected abstract InputBuffer createInputBuffer();

	protected abstract OutputBuffer createOutputBuffer();

	protected abstract Exception decode(InputBuffer inputbuffer, OutputBuffer outputbuffer, boolean flag);

	public final InputBuffer dequeueInputBuffer()
		throws Exception
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object lock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		maybeThrowException();
	//    5    7:aload_0         
	//    6    8:invokespecial   #129 <Method void maybeThrowException()>
		int i;
		boolean flag;
		InputBuffer ainputbuffer[];
		InputBuffer inputbuffer;
		Exception exception1;
		if(dequeuedInputBuffer == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #131 <Field InputBuffer dequeuedInputBuffer>
	//*   9   15:ifnonnull       85
			flag = true;
	//   10   18:iconst_1        
	//   11   19:istore_2        
		else
	//*  12   20:goto            23
	//*  13   23:iload_2         
	//*  14   24:invokestatic    #137 <Method void Assertions.checkState(boolean)>
	//*  15   27:aload_0         
	//*  16   28:getfield        #56  <Field int availableInputBufferCount>
	//*  17   31:ifne            38
	//*  18   34:aload_3         
	//*  19   35:monitorexit     
	//*  20   36:aconst_null     
	//*  21   37:areturn         
	//*  22   38:aload_0         
	//*  23   39:getfield        #54  <Field InputBuffer[] availableInputBuffers>
	//*  24   42:astore          4
	//*  25   44:aload_0         
	//*  26   45:getfield        #56  <Field int availableInputBufferCount>
	//*  27   48:iconst_1        
	//*  28   49:isub            
	//*  29   50:istore_1        
	//*  30   51:aload_0         
	//*  31   52:iload_1         
	//*  32   53:putfield        #56  <Field int availableInputBufferCount>
	//*  33   56:aload           4
	//*  34   58:iload_1         
	//*  35   59:aaload          
	//*  36   60:astore          4
	//*  37   62:aload           4
	//*  38   64:invokevirtual   #138 <Method void InputBuffer.reset()>
	//*  39   67:aload_0         
	//*  40   68:aload           4
	//*  41   70:putfield        #131 <Field InputBuffer dequeuedInputBuffer>
	//*  42   73:aload_3         
	//*  43   74:monitorexit     
	//*  44   75:aload           4
	//*  45   77:areturn         
	//*  46   78:astore          4
	//*  47   80:aload_3         
	//*  48   81:monitorexit     
	//*  49   82:aload           4
	//*  50   84:athrow          
			flag = false;
	//   51   85:iconst_0        
	//   52   86:istore_2        
		Assertions.checkState(flag);
		if(availableInputBufferCount != 0)
			break MISSING_BLOCK_LABEL_38;
		obj;
		JVM INSTR monitorexit ;
		return null;
		ainputbuffer = availableInputBuffers;
		i = availableInputBufferCount - 1;
		availableInputBufferCount = i;
		inputbuffer = ainputbuffer[i];
		inputbuffer.reset();
		dequeuedInputBuffer = inputbuffer;
		obj;
		JVM INSTR monitorexit ;
		return inputbuffer;
		exception1;
		obj;
		JVM INSTR monitorexit ;
		throw exception1;
	//*  53   87:goto            23
	}

	public volatile Object dequeueInputBuffer()
		throws Exception
	{
		return ((Object) (dequeueInputBuffer()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method InputBuffer dequeueInputBuffer()>
	//    2    4:areturn         
	}

	public final OutputBuffer dequeueOutputBuffer()
		throws Exception
	{
label0:
		{
			synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				maybeThrowException();
	//    5    7:aload_0         
	//    6    8:invokespecial   #129 <Method void maybeThrowException()>
				if(!queuedOutputBuffers.isEmpty())
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #52  <Field LinkedList queuedOutputBuffers>
	//    9   15:invokevirtual   #76  <Method boolean LinkedList.isEmpty()>
	//   10   18:ifeq            25
			}
	//   11   21:aload_1         
	//   12   22:monitorexit     
			return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
		}
		OutputBuffer outputbuffer = (OutputBuffer)queuedOutputBuffers.removeFirst();
	//   15   25:aload_0         
	//   16   26:getfield        #52  <Field LinkedList queuedOutputBuffers>
	//   17   29:invokevirtual   #90  <Method Object LinkedList.removeFirst()>
	//   18   32:checkcast       #96  <Class OutputBuffer>
	//   19   35:astore_2        
		obj;
	//   20   36:aload_1         
		JVM INSTR monitorexit ;
	//   21   37:monitorexit     
		return outputbuffer;
	//   22   38:aload_2         
	//   23   39:areturn         
		exception1;
	//   24   40:astore_2        
		obj;
	//   25   41:aload_1         
		JVM INSTR monitorexit ;
	//   26   42:monitorexit     
		throw exception1;
	//   27   43:aload_2         
	//   28   44:athrow          
	}

	public volatile Object dequeueOutputBuffer()
		throws Exception
	{
		return ((Object) (dequeueOutputBuffer()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method OutputBuffer dequeueOutputBuffer()>
	//    2    4:areturn         
	}

	public final void flush()
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object lock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		flushed = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #94  <Field boolean flushed>
		if(dequeuedInputBuffer != null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #131 <Field InputBuffer dequeuedInputBuffer>
	//*  10   16:ifnull          48
		{
			InputBuffer ainputbuffer[] = availableInputBuffers;
	//   11   19:aload_0         
	//   12   20:getfield        #54  <Field InputBuffer[] availableInputBuffers>
	//   13   23:astore_3        
			int i = availableInputBufferCount;
	//   14   24:aload_0         
	//   15   25:getfield        #56  <Field int availableInputBufferCount>
	//   16   28:istore_1        
			availableInputBufferCount = i + 1;
	//   17   29:aload_0         
	//   18   30:iload_1         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:putfield        #56  <Field int availableInputBufferCount>
			ainputbuffer[i] = dequeuedInputBuffer;
	//   22   36:aload_3         
	//   23   37:iload_1         
	//   24   38:aload_0         
	//   25   39:getfield        #131 <Field InputBuffer dequeuedInputBuffer>
	//   26   42:aastore         
			dequeuedInputBuffer = null;
	//   27   43:aload_0         
	//   28   44:aconst_null     
	//   29   45:putfield        #131 <Field InputBuffer dequeuedInputBuffer>
		}
		while(!queuedInputBuffers.isEmpty()) 
	//*  30   48:aload_0         
	//*  31   49:getfield        #50  <Field LinkedList queuedInputBuffers>
	//*  32   52:invokevirtual   #76  <Method boolean LinkedList.isEmpty()>
	//*  33   55:ifne            91
		{
			InputBuffer ainputbuffer1[] = availableInputBuffers;
	//   34   58:aload_0         
	//   35   59:getfield        #54  <Field InputBuffer[] availableInputBuffers>
	//   36   62:astore_3        
			int j = availableInputBufferCount;
	//   37   63:aload_0         
	//   38   64:getfield        #56  <Field int availableInputBufferCount>
	//   39   67:istore_1        
			availableInputBufferCount = j + 1;
	//   40   68:aload_0         
	//   41   69:iload_1         
	//   42   70:iconst_1        
	//   43   71:iadd            
	//   44   72:putfield        #56  <Field int availableInputBufferCount>
			ainputbuffer1[j] = (InputBuffer)queuedInputBuffers.removeFirst();
	//   45   75:aload_3         
	//   46   76:iload_1         
	//   47   77:aload_0         
	//   48   78:getfield        #50  <Field LinkedList queuedInputBuffers>
	//   49   81:invokevirtual   #90  <Method Object LinkedList.removeFirst()>
	//   50   84:checkcast       #92  <Class InputBuffer>
	//   51   87:aastore         
		}
	//*  52   88:goto            48
		while(!queuedOutputBuffers.isEmpty()) 
	//*  53   91:aload_0         
	//*  54   92:getfield        #52  <Field LinkedList queuedOutputBuffers>
	//*  55   95:invokevirtual   #76  <Method boolean LinkedList.isEmpty()>
	//*  56   98:ifne            134
		{
			OutputBuffer aoutputbuffer[] = availableOutputBuffers;
	//   57  101:aload_0         
	//   58  102:getfield        #62  <Field OutputBuffer[] availableOutputBuffers>
	//   59  105:astore_3        
			int k = availableOutputBufferCount;
	//   60  106:aload_0         
	//   61  107:getfield        #64  <Field int availableOutputBufferCount>
	//   62  110:istore_1        
			availableOutputBufferCount = k + 1;
	//   63  111:aload_0         
	//   64  112:iload_1         
	//   65  113:iconst_1        
	//   66  114:iadd            
	//   67  115:putfield        #64  <Field int availableOutputBufferCount>
			aoutputbuffer[k] = (OutputBuffer)queuedOutputBuffers.removeFirst();
	//   68  118:aload_3         
	//   69  119:iload_1         
	//   70  120:aload_0         
	//   71  121:getfield        #52  <Field LinkedList queuedOutputBuffers>
	//   72  124:invokevirtual   #90  <Method Object LinkedList.removeFirst()>
	//   73  127:checkcast       #96  <Class OutputBuffer>
	//   74  130:aastore         
		}
	//*  75  131:goto            91
		obj;
	//   76  134:aload_2         
		JVM INSTR monitorexit ;
	//   77  135:monitorexit     
		return;
	//   78  136:return          
		Exception exception1;
		exception1;
	//   79  137:astore_3        
		obj;
	//   80  138:aload_2         
		JVM INSTR monitorexit ;
	//   81  139:monitorexit     
		throw exception1;
	//   82  140:aload_3         
	//   83  141:athrow          
	}

	public final void queueInputBuffer(InputBuffer inputbuffer)
		throws Exception
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object lock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		maybeThrowException();
	//    5    7:aload_0         
	//    6    8:invokespecial   #129 <Method void maybeThrowException()>
		boolean flag;
		if(inputbuffer == dequeuedInputBuffer)
	//*   7   11:aload_1         
	//*   8   12:aload_0         
	//*   9   13:getfield        #131 <Field InputBuffer dequeuedInputBuffer>
	//*  10   16:if_acmpne       53
			flag = true;
	//   11   19:iconst_1        
	//   12   20:istore_2        
		else
	//*  13   21:goto            24
	//*  14   24:iload_2         
	//*  15   25:invokestatic    #151 <Method void Assertions.checkArgument(boolean)>
	//*  16   28:aload_0         
	//*  17   29:getfield        #50  <Field LinkedList queuedInputBuffers>
	//*  18   32:aload_1         
	//*  19   33:invokevirtual   #117 <Method void LinkedList.addLast(Object)>
	//*  20   36:aload_0         
	//*  21   37:invokespecial   #153 <Method void maybeNotifyDecodeLoop()>
	//*  22   40:aload_0         
	//*  23   41:aconst_null     
	//*  24   42:putfield        #131 <Field InputBuffer dequeuedInputBuffer>
	//*  25   45:aload_3         
	//*  26   46:monitorexit     
	//*  27   47:return          
	//*  28   48:astore_1        
	//*  29   49:aload_3         
	//*  30   50:monitorexit     
	//*  31   51:aload_1         
	//*  32   52:athrow          
			flag = false;
	//   33   53:iconst_0        
	//   34   54:istore_2        
		Assertions.checkArgument(flag);
		queuedInputBuffers.addLast(((Object) (inputbuffer)));
		maybeNotifyDecodeLoop();
		dequeuedInputBuffer = null;
		obj;
		JVM INSTR monitorexit ;
		return;
		inputbuffer;
		obj;
		JVM INSTR monitorexit ;
		throw inputbuffer;
	//*  35   55:goto            24
	}

	public volatile void queueInputBuffer(Object obj)
		throws Exception
	{
		queueInputBuffer((InputBuffer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #92  <Class InputBuffer>
	//    3    5:invokevirtual   #156 <Method void queueInputBuffer(InputBuffer)>
	//    4    8:return          
	}

	public void release()
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			released = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #81  <Field boolean released>
			lock.notify();
	//    8   12:aload_0         
	//    9   13:getfield        #45  <Field Object lock>
	//   10   16:invokevirtual   #122 <Method void Object.notify()>
		}
	//   11   19:aload_1         
	//   12   20:monitorexit     
		try
		{
			join();
	//   13   21:aload_0         
	//   14   22:invokevirtual   #160 <Method void join()>
			return;
	//   15   25:return          
		}
	//*  16   26:invokestatic    #164 <Method Thread Thread.currentThread()>
	//*  17   29:invokevirtual   #167 <Method void Thread.interrupt()>
	//*  18   32:return          
	//*  19   33:astore_2        
	//*  20   34:aload_1         
	//*  21   35:monitorexit     
	//*  22   36:aload_2         
	//*  23   37:athrow          
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			Thread.currentThread().interrupt();
		}
		return;
		exception1;
		obj;
		JVM INSTR monitorexit ;
		InterruptedException interruptedexception;
		throw exception1;
	//*  24   38:astore_1        
	//*  25   39:goto            26
	}

	protected void releaseOutputBuffer(OutputBuffer outputbuffer)
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object lock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int i;
		OutputBuffer aoutputbuffer[];
		aoutputbuffer = availableOutputBuffers;
	//    5    7:aload_0         
	//    6    8:getfield        #62  <Field OutputBuffer[] availableOutputBuffers>
	//    7   11:astore          4
		i = availableOutputBufferCount;
	//    8   13:aload_0         
	//    9   14:getfield        #64  <Field int availableOutputBufferCount>
	//   10   17:istore_2        
		availableOutputBufferCount = i + 1;
	//   11   18:aload_0         
	//   12   19:iload_2         
	//   13   20:iconst_1        
	//   14   21:iadd            
	//   15   22:putfield        #64  <Field int availableOutputBufferCount>
		aoutputbuffer[i] = outputbuffer;
	//   16   25:aload           4
	//   17   27:iload_2         
	//   18   28:aload_1         
	//   19   29:aastore         
		maybeNotifyDecodeLoop();
	//   20   30:aload_0         
	//   21   31:invokespecial   #153 <Method void maybeNotifyDecodeLoop()>
		obj;
	//   22   34:aload_3         
		JVM INSTR monitorexit ;
	//   23   35:monitorexit     
		return;
	//   24   36:return          
		outputbuffer;
	//   25   37:astore_1        
		obj;
	//   26   38:aload_3         
		JVM INSTR monitorexit ;
	//   27   39:monitorexit     
		throw outputbuffer;
	//   28   40:aload_1         
	//   29   41:athrow          
	}

	public final void run()
	{
		boolean flag;
		do
			try
			{
				flag = decode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #173 <Method boolean decode()>
	//    2    4:istore_1        
			}
	//*   3    5:iload_1         
	//*   4    6:ifeq            12
	//*   5    9:goto            0
	//*   6   12:return          
			catch(InterruptedException interruptedexception)
	//*   7   13:astore_2        
			{
				throw new IllegalStateException(((Throwable) (interruptedexception)));
	//    8   14:new             #175 <Class IllegalStateException>
	//    9   17:dup             
	//   10   18:aload_2         
	//   11   19:invokespecial   #178 <Method void IllegalStateException(Throwable)>
	//   12   22:athrow          
			}
		while(flag);
	}

	protected final void setInitialInputBufferSize(int i)
	{
		int k = availableInputBufferCount;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int availableInputBufferCount>
	//    2    4:istore_3        
		int l = availableInputBuffers.length;
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field InputBuffer[] availableInputBuffers>
	//    5    9:arraylength     
	//    6   10:istore          4
		int j = 0;
	//    7   12:iconst_0        
	//    8   13:istore_2        
		boolean flag;
		if(k == l)
	//*   9   14:iload_3         
	//*  10   15:iload           4
	//*  11   17:icmpne          26
			flag = true;
	//   12   20:iconst_1        
	//   13   21:istore          5
		else
	//*  14   23:goto            29
			flag = false;
	//   15   26:iconst_0        
	//   16   27:istore          5
		Assertions.checkState(flag);
	//   17   29:iload           5
	//   18   31:invokestatic    #137 <Method void Assertions.checkState(boolean)>
		do
		{
			InputBuffer ainputbuffer[] = availableInputBuffers;
	//   19   34:aload_0         
	//   20   35:getfield        #54  <Field InputBuffer[] availableInputBuffers>
	//   21   38:astore          6
			if(j < ainputbuffer.length)
	//*  22   40:iload_2         
	//*  23   41:aload           6
	//*  24   43:arraylength     
	//*  25   44:icmpge          65
			{
				ainputbuffer[j].sampleHolder.ensureSpaceForWrite(i);
	//   26   47:aload           6
	//   27   49:iload_2         
	//   28   50:aaload          
	//   29   51:getfield        #183 <Field SampleHolder InputBuffer.sampleHolder>
	//   30   54:iload_1         
	//   31   55:invokevirtual   #188 <Method void SampleHolder.ensureSpaceForWrite(int)>
				j++;
	//   32   58:iload_2         
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:istore_2        
			} else
	//*  36   62:goto            34
			{
				return;
	//   37   65:return          
			}
		} while(true);
	}

	private int availableInputBufferCount;
	private final InputBuffer availableInputBuffers[];
	private int availableOutputBufferCount;
	private final OutputBuffer availableOutputBuffers[];
	private InputBuffer dequeuedInputBuffer;
	private Exception exception;
	private boolean flushed;
	private final Object lock = new Object();
	private final LinkedList queuedInputBuffers = new LinkedList();
	private final LinkedList queuedOutputBuffers = new LinkedList();
	private boolean released;
}
