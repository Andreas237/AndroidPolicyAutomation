// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayDeque;

// Referenced classes of package com.google.android.exoplayer2.decoder:
//			Decoder, DecoderInputBuffer, OutputBuffer

public abstract class SimpleDecoder
	implements Decoder
{

	protected SimpleDecoder(DecoderInputBuffer adecoderinputbuffer[], OutputBuffer aoutputbuffer[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #42  <Method void Object()>
	//    6   12:putfield        #44  <Field Object lock>
	//    7   15:aload_0         
	//    8   16:new             #46  <Class ArrayDeque>
	//    9   19:dup             
	//   10   20:invokespecial   #47  <Method void ArrayDeque()>
	//   11   23:putfield        #49  <Field ArrayDeque queuedInputBuffers>
	//   12   26:aload_0         
	//   13   27:new             #46  <Class ArrayDeque>
	//   14   30:dup             
	//   15   31:invokespecial   #47  <Method void ArrayDeque()>
	//   16   34:putfield        #51  <Field ArrayDeque queuedOutputBuffers>
		availableInputBuffers = adecoderinputbuffer;
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:putfield        #53  <Field DecoderInputBuffer[] availableInputBuffers>
		boolean flag = false;
	//   20   42:iconst_0        
	//   21   43:istore          4
		availableInputBufferCount = adecoderinputbuffer.length;
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:arraylength     
	//   25   48:putfield        #55  <Field int availableInputBufferCount>
		for(int i = 0; i < availableInputBufferCount; i++)
	//*  26   51:iconst_0        
	//*  27   52:istore_3        
	//*  28   53:iload_3         
	//*  29   54:aload_0         
	//*  30   55:getfield        #55  <Field int availableInputBufferCount>
	//*  31   58:icmpge          78
			availableInputBuffers[i] = createInputBuffer();
	//   32   61:aload_0         
	//   33   62:getfield        #53  <Field DecoderInputBuffer[] availableInputBuffers>
	//   34   65:iload_3         
	//   35   66:aload_0         
	//   36   67:invokevirtual   #59  <Method DecoderInputBuffer createInputBuffer()>
	//   37   70:aastore         

	//   38   71:iload_3         
	//   39   72:iconst_1        
	//   40   73:iadd            
	//   41   74:istore_3        
	//*  42   75:goto            53
		availableOutputBuffers = aoutputbuffer;
	//   43   78:aload_0         
	//   44   79:aload_2         
	//   45   80:putfield        #61  <Field OutputBuffer[] availableOutputBuffers>
		availableOutputBufferCount = aoutputbuffer.length;
	//   46   83:aload_0         
	//   47   84:aload_2         
	//   48   85:arraylength     
	//   49   86:putfield        #63  <Field int availableOutputBufferCount>
		for(int j = ((int) (flag)); j < availableOutputBufferCount; j++)
	//*  50   89:iload           4
	//*  51   91:istore_3        
	//*  52   92:iload_3         
	//*  53   93:aload_0         
	//*  54   94:getfield        #63  <Field int availableOutputBufferCount>
	//*  55   97:icmpge          117
			availableOutputBuffers[j] = createOutputBuffer();
	//   56  100:aload_0         
	//   57  101:getfield        #61  <Field OutputBuffer[] availableOutputBuffers>
	//   58  104:iload_3         
	//   59  105:aload_0         
	//   60  106:invokevirtual   #67  <Method OutputBuffer createOutputBuffer()>
	//   61  109:aastore         

	//   62  110:iload_3         
	//   63  111:iconst_1        
	//   64  112:iadd            
	//   65  113:istore_3        
	//*  66  114:goto            92
	//   67  117:aload_0         
	//   68  118:new             #9   <Class SimpleDecoder$1>
	//   69  121:dup             
	//   70  122:aload_0         
	//   71  123:invokespecial   #70  <Method void SimpleDecoder$1(SimpleDecoder)>
	//   72  126:putfield        #72  <Field Thread decodeThread>
		decodeThread.start();
	//   73  129:aload_0         
	//   74  130:getfield        #72  <Field Thread decodeThread>
	//   75  133:invokevirtual   #77  <Method void Thread.start()>
	//   76  136:return          
	}

	private boolean canDecodeBuffer()
	{
		return !queuedInputBuffers.isEmpty() && availableOutputBufferCount > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ArrayDeque queuedInputBuffers>
	//    2    4:invokevirtual   #89  <Method boolean ArrayDeque.isEmpty()>
	//    3    7:ifne            19
	//    4   10:aload_0         
	//    5   11:getfield        #63  <Field int availableOutputBufferCount>
	//    6   14:ifle            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private boolean decode()
		throws InterruptedException
	{
		Object obj2 = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Object lock>
	//    2    4:astore          5
		obj2;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		for(; !released && !canDecodeBuffer(); lock.wait());
	//    5    9:aload_0         
	//    6   10:getfield        #98  <Field boolean released>
	//    7   13:ifne            33
	//    8   16:aload_0         
	//    9   17:invokespecial   #100 <Method boolean canDecodeBuffer()>
	//   10   20:ifne            33
	//   11   23:aload_0         
	//   12   24:getfield        #44  <Field Object lock>
	//   13   27:invokevirtual   #103 <Method void Object.wait()>
	//*  14   30:goto            9
		if(!released)
			break MISSING_BLOCK_LABEL_45;
	//   15   33:aload_0         
	//   16   34:getfield        #98  <Field boolean released>
	//   17   37:ifeq            45
		obj2;
	//   18   40:aload           5
		JVM INSTR monitorexit ;
	//   19   42:monitorexit     
		return false;
	//   20   43:iconst_0        
	//   21   44:ireturn         
		int i;
		OutputBuffer aoutputbuffer[];
		obj = ((Object) ((DecoderInputBuffer)queuedInputBuffers.removeFirst()));
	//   22   45:aload_0         
	//   23   46:getfield        #49  <Field ArrayDeque queuedInputBuffers>
	//   24   49:invokevirtual   #107 <Method Object ArrayDeque.removeFirst()>
	//   25   52:checkcast       #109 <Class DecoderInputBuffer>
	//   26   55:astore_3        
		aoutputbuffer = availableOutputBuffers;
	//   27   56:aload_0         
	//   28   57:getfield        #61  <Field OutputBuffer[] availableOutputBuffers>
	//   29   60:astore          4
		i = availableOutputBufferCount - 1;
	//   30   62:aload_0         
	//   31   63:getfield        #63  <Field int availableOutputBufferCount>
	//   32   66:iconst_1        
	//   33   67:isub            
	//   34   68:istore_1        
		availableOutputBufferCount = i;
	//   35   69:aload_0         
	//   36   70:iload_1         
	//   37   71:putfield        #63  <Field int availableOutputBufferCount>
		obj1 = ((Object) (aoutputbuffer[i]));
	//   38   74:aload           4
	//   39   76:iload_1         
	//   40   77:aaload          
	//   41   78:astore          4
		boolean flag;
		flag = flushed;
	//   42   80:aload_0         
	//   43   81:getfield        #111 <Field boolean flushed>
	//   44   84:istore_2        
		flushed = false;
	//   45   85:aload_0         
	//   46   86:iconst_0        
	//   47   87:putfield        #111 <Field boolean flushed>
		obj2;
	//   48   90:aload           5
		JVM INSTR monitorexit ;
	//   49   92:monitorexit     
		if(((DecoderInputBuffer) (obj)).isEndOfStream())
	//*  50   93:aload_3         
	//*  51   94:invokevirtual   #114 <Method boolean DecoderInputBuffer.isEndOfStream()>
	//*  52   97:ifeq            109
		{
			((OutputBuffer) (obj1)).addFlag(4);
	//   53  100:aload           4
	//   54  102:iconst_4        
	//   55  103:invokevirtual   #120 <Method void OutputBuffer.addFlag(int)>
		} else
	//*  56  106:goto            190
		{
			if(((DecoderInputBuffer) (obj)).isDecodeOnly())
	//*  57  109:aload_3         
	//*  58  110:invokevirtual   #123 <Method boolean DecoderInputBuffer.isDecodeOnly()>
	//*  59  113:ifeq            123
				((OutputBuffer) (obj1)).addFlag(0x80000000);
	//   60  116:aload           4
	//   61  118:ldc1            #124 <Int 0x80000000>
	//   62  120:invokevirtual   #120 <Method void OutputBuffer.addFlag(int)>
			try
			{
				exception = decode(((DecoderInputBuffer) (obj)), ((OutputBuffer) (obj1)), flag);
	//   63  123:aload_0         
	//   64  124:aload_0         
	//   65  125:aload_3         
	//   66  126:aload           4
	//   67  128:iload_2         
	//   68  129:invokevirtual   #127 <Method Exception decode(DecoderInputBuffer, OutputBuffer, boolean)>
	//   69  132:putfield        #129 <Field Exception exception>
			}
	//*  70  135:goto            165
	//*  71  138:astore          5
	//*  72  140:aload_0         
	//*  73  141:aload_0         
	//*  74  142:aload           5
	//*  75  144:invokevirtual   #133 <Method Exception createUnexpectedDecodeException(Throwable)>
	//*  76  147:putfield        #129 <Field Exception exception>
	//*  77  150:goto            165
			// Misplaced declaration of an exception variable
			catch(Object obj2)
	//*  78  153:astore          5
			{
				exception = createUnexpectedDecodeException(((Throwable) (obj2)));
	//   79  155:aload_0         
	//   80  156:aload_0         
	//   81  157:aload           5
	//   82  159:invokevirtual   #133 <Method Exception createUnexpectedDecodeException(Throwable)>
	//   83  162:putfield        #129 <Field Exception exception>
			}
			// Misplaced declaration of an exception variable
			catch(Object obj2)
			{
				exception = createUnexpectedDecodeException(((Throwable) (obj2)));
			}
			if(exception != null)
	//*  84  165:aload_0         
	//*  85  166:getfield        #129 <Field Exception exception>
	//*  86  169:ifnull          190
			{
				synchronized(lock) { }
	//   87  172:aload_0         
	//   88  173:getfield        #44  <Field Object lock>
	//   89  176:astore_3        
	//   90  177:aload_3         
	//   91  178:monitorenter    
	//   92  179:aload_3         
	//   93  180:monitorexit     
				return false;
	//   94  181:iconst_0        
	//   95  182:ireturn         
			}
		}
		break MISSING_BLOCK_LABEL_190;
		obj1;
	//   96  183:astore          4
		obj;
	//   97  185:aload_3         
		JVM INSTR monitorexit ;
	//   98  186:monitorexit     
		throw obj1;
	//   99  187:aload           4
	//  100  189:athrow          
		obj2 = lock;
	//  101  190:aload_0         
	//  102  191:getfield        #44  <Field Object lock>
	//  103  194:astore          5
		obj2;
	//  104  196:aload           5
		JVM INSTR monitorenter ;
	//  105  198:monitorenter    
		if(flushed)
	//* 106  199:aload_0         
	//* 107  200:getfield        #111 <Field boolean flushed>
	//* 108  203:ifeq            215
		{
			releaseOutputBufferInternal(((OutputBuffer) (obj1)));
	//  109  206:aload_0         
	//  110  207:aload           4
	//  111  209:invokespecial   #137 <Method void releaseOutputBufferInternal(OutputBuffer)>
			break MISSING_BLOCK_LABEL_265;
	//  112  212:goto            265
		}
		if(((OutputBuffer) (obj1)).isDecodeOnly())
	//* 113  215:aload           4
	//* 114  217:invokevirtual   #138 <Method boolean OutputBuffer.isDecodeOnly()>
	//* 115  220:ifeq            242
		{
			skippedOutputBufferCount = skippedOutputBufferCount + 1;
	//  116  223:aload_0         
	//  117  224:aload_0         
	//  118  225:getfield        #140 <Field int skippedOutputBufferCount>
	//  119  228:iconst_1        
	//  120  229:iadd            
	//  121  230:putfield        #140 <Field int skippedOutputBufferCount>
			releaseOutputBufferInternal(((OutputBuffer) (obj1)));
	//  122  233:aload_0         
	//  123  234:aload           4
	//  124  236:invokespecial   #137 <Method void releaseOutputBufferInternal(OutputBuffer)>
			break MISSING_BLOCK_LABEL_265;
	//  125  239:goto            265
		}
		obj1.skippedOutputBufferCount = skippedOutputBufferCount;
	//  126  242:aload           4
	//  127  244:aload_0         
	//  128  245:getfield        #140 <Field int skippedOutputBufferCount>
	//  129  248:putfield        #141 <Field int OutputBuffer.skippedOutputBufferCount>
		skippedOutputBufferCount = 0;
	//  130  251:aload_0         
	//  131  252:iconst_0        
	//  132  253:putfield        #140 <Field int skippedOutputBufferCount>
		queuedOutputBuffers.addLast(obj1);
	//  133  256:aload_0         
	//  134  257:getfield        #51  <Field ArrayDeque queuedOutputBuffers>
	//  135  260:aload           4
	//  136  262:invokevirtual   #145 <Method void ArrayDeque.addLast(Object)>
		releaseInputBufferInternal(((DecoderInputBuffer) (obj)));
	//  137  265:aload_0         
	//  138  266:aload_3         
	//  139  267:invokespecial   #149 <Method void releaseInputBufferInternal(DecoderInputBuffer)>
		obj2;
	//  140  270:aload           5
		JVM INSTR monitorexit ;
	//  141  272:monitorexit     
		return true;
	//  142  273:iconst_1        
	//  143  274:ireturn         
		Exception exception1;
		exception1;
	//  144  275:astore_3        
		obj2;
	//  145  276:aload           5
		JVM INSTR monitorexit ;
	//  146  278:monitorexit     
		throw exception1;
	//  147  279:aload_3         
	//  148  280:athrow          
		exception1;
	//  149  281:astore_3        
		obj2;
	//  150  282:aload           5
		JVM INSTR monitorexit ;
	//  151  284:monitorexit     
		throw exception1;
	//  152  285:aload_3         
	//  153  286:athrow          
	}

	private void maybeNotifyDecodeLoop()
	{
		if(canDecodeBuffer())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #100 <Method boolean canDecodeBuffer()>
	//*   2    4:ifeq            14
			lock.notify();
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field Object lock>
	//    5   11:invokevirtual   #154 <Method void Object.notify()>
	//    6   14:return          
	}

	private void maybeThrowException()
		throws Exception
	{
		if(exception != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Exception exception>
	//*   2    4:ifnull          12
			throw exception;
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Exception exception>
	//    5   11:athrow          
		else
			return;
	//    6   12:return          
	}

	private void releaseInputBufferInternal(DecoderInputBuffer decoderinputbuffer)
	{
		decoderinputbuffer.clear();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #161 <Method void DecoderInputBuffer.clear()>
		DecoderInputBuffer adecoderinputbuffer[] = availableInputBuffers;
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field DecoderInputBuffer[] availableInputBuffers>
	//    4    8:astore_3        
		int i = availableInputBufferCount;
	//    5    9:aload_0         
	//    6   10:getfield        #55  <Field int availableInputBufferCount>
	//    7   13:istore_2        
		availableInputBufferCount = i + 1;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:iconst_1        
	//   11   17:iadd            
	//   12   18:putfield        #55  <Field int availableInputBufferCount>
		adecoderinputbuffer[i] = decoderinputbuffer;
	//   13   21:aload_3         
	//   14   22:iload_2         
	//   15   23:aload_1         
	//   16   24:aastore         
	//   17   25:return          
	}

	private void releaseOutputBufferInternal(OutputBuffer outputbuffer)
	{
		outputbuffer.clear();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #163 <Method void OutputBuffer.clear()>
		OutputBuffer aoutputbuffer[] = availableOutputBuffers;
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field OutputBuffer[] availableOutputBuffers>
	//    4    8:astore_3        
		int i = availableOutputBufferCount;
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field int availableOutputBufferCount>
	//    7   13:istore_2        
		availableOutputBufferCount = i + 1;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:iconst_1        
	//   11   17:iadd            
	//   12   18:putfield        #63  <Field int availableOutputBufferCount>
		aoutputbuffer[i] = outputbuffer;
	//   13   21:aload_3         
	//   14   22:iload_2         
	//   15   23:aload_1         
	//   16   24:aastore         
	//   17   25:return          
	}

	private void run()
	{
		boolean flag;
		do
			try
			{
				flag = decode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method boolean decode()>
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
	//    8   14:new             #168 <Class IllegalStateException>
	//    9   17:dup             
	//   10   18:aload_2         
	//   11   19:invokespecial   #171 <Method void IllegalStateException(Throwable)>
	//   12   22:athrow          
			}
		while(flag);
	}

	protected abstract DecoderInputBuffer createInputBuffer();

	protected abstract OutputBuffer createOutputBuffer();

	protected abstract Exception createUnexpectedDecodeException(Throwable throwable);

	protected abstract Exception decode(DecoderInputBuffer decoderinputbuffer, OutputBuffer outputbuffer, boolean flag);

	public final DecoderInputBuffer dequeueInputBuffer()
		throws Exception
	{
		Object obj1 = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Object lock>
	//    2    4:astore          4
		obj1;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		maybeThrowException();
	//    5    9:aload_0         
	//    6   10:invokespecial   #174 <Method void maybeThrowException()>
		int i;
		boolean flag;
		Object obj;
		Exception exception1;
		if(dequeuedInputBuffer == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #176 <Field DecoderInputBuffer dequeuedInputBuffer>
	//*   9   17:ifnonnull       83
			flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_2        
		else
	//*  12   22:goto            25
	//*  13   25:iload_2         
	//*  14   26:invokestatic    #182 <Method void Assertions.checkState(boolean)>
	//*  15   29:aload_0         
	//*  16   30:getfield        #55  <Field int availableInputBufferCount>
	//*  17   33:ifne            41
	//*  18   36:aconst_null     
	//*  19   37:astore_3        
	//*  20   38:goto            62
	//*  21   41:aload_0         
	//*  22   42:getfield        #53  <Field DecoderInputBuffer[] availableInputBuffers>
	//*  23   45:astore_3        
	//*  24   46:aload_0         
	//*  25   47:getfield        #55  <Field int availableInputBufferCount>
	//*  26   50:iconst_1        
	//*  27   51:isub            
	//*  28   52:istore_1        
	//*  29   53:aload_0         
	//*  30   54:iload_1         
	//*  31   55:putfield        #55  <Field int availableInputBufferCount>
	//*  32   58:aload_3         
	//*  33   59:iload_1         
	//*  34   60:aaload          
	//*  35   61:astore_3        
	//*  36   62:aload_0         
	//*  37   63:aload_3         
	//*  38   64:putfield        #176 <Field DecoderInputBuffer dequeuedInputBuffer>
	//*  39   67:aload_0         
	//*  40   68:getfield        #176 <Field DecoderInputBuffer dequeuedInputBuffer>
	//*  41   71:astore_3        
	//*  42   72:aload           4
	//*  43   74:monitorexit     
	//*  44   75:aload_3         
	//*  45   76:areturn         
	//*  46   77:astore_3        
	//*  47   78:aload           4
	//*  48   80:monitorexit     
	//*  49   81:aload_3         
	//*  50   82:athrow          
			flag = false;
	//   51   83:iconst_0        
	//   52   84:istore_2        
		Assertions.checkState(flag);
		if(availableInputBufferCount == 0)
		{
			obj = null;
			break MISSING_BLOCK_LABEL_62;
		}
		obj = ((Object) (availableInputBuffers));
		i = availableInputBufferCount - 1;
		availableInputBufferCount = i;
		obj = ((Object) (obj[i]));
		dequeuedInputBuffer = ((DecoderInputBuffer) (obj));
		obj = ((Object) (dequeuedInputBuffer));
		obj1;
		JVM INSTR monitorexit ;
		return ((DecoderInputBuffer) (obj));
		exception1;
		obj1;
		JVM INSTR monitorexit ;
		throw exception1;
	//*  53   85:goto            25
	}

	public volatile Object dequeueInputBuffer()
		throws Exception
	{
		return ((Object) (dequeueInputBuffer()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #185 <Method DecoderInputBuffer dequeueInputBuffer()>
	//    2    4:areturn         
	}

	public final OutputBuffer dequeueOutputBuffer()
		throws Exception
	{
label0:
		{
			synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				maybeThrowException();
	//    5    7:aload_0         
	//    6    8:invokespecial   #174 <Method void maybeThrowException()>
				if(!queuedOutputBuffers.isEmpty())
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #51  <Field ArrayDeque queuedOutputBuffers>
	//    9   15:invokevirtual   #89  <Method boolean ArrayDeque.isEmpty()>
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
	//   16   26:getfield        #51  <Field ArrayDeque queuedOutputBuffers>
	//   17   29:invokevirtual   #107 <Method Object ArrayDeque.removeFirst()>
	//   18   32:checkcast       #116 <Class OutputBuffer>
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
	//    1    1:invokevirtual   #189 <Method OutputBuffer dequeueOutputBuffer()>
	//    2    4:areturn         
	}

	public final void flush()
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Object lock>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		flushed = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #111 <Field boolean flushed>
		skippedOutputBufferCount = 0;
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:putfield        #140 <Field int skippedOutputBufferCount>
		if(dequeuedInputBuffer != null)
	//*  11   17:aload_0         
	//*  12   18:getfield        #176 <Field DecoderInputBuffer dequeuedInputBuffer>
	//*  13   21:ifnull          37
		{
			releaseInputBufferInternal(dequeuedInputBuffer);
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #176 <Field DecoderInputBuffer dequeuedInputBuffer>
	//   17   29:invokespecial   #149 <Method void releaseInputBufferInternal(DecoderInputBuffer)>
			dequeuedInputBuffer = null;
	//   18   32:aload_0         
	//   19   33:aconst_null     
	//   20   34:putfield        #176 <Field DecoderInputBuffer dequeuedInputBuffer>
		}
		for(; !queuedInputBuffers.isEmpty(); releaseInputBufferInternal((DecoderInputBuffer)queuedInputBuffers.removeFirst()));
	//   21   37:aload_0         
	//   22   38:getfield        #49  <Field ArrayDeque queuedInputBuffers>
	//   23   41:invokevirtual   #89  <Method boolean ArrayDeque.isEmpty()>
	//   24   44:ifne            64
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #49  <Field ArrayDeque queuedInputBuffers>
	//   28   52:invokevirtual   #107 <Method Object ArrayDeque.removeFirst()>
	//   29   55:checkcast       #109 <Class DecoderInputBuffer>
	//   30   58:invokespecial   #149 <Method void releaseInputBufferInternal(DecoderInputBuffer)>
	//*  31   61:goto            37
		for(; !queuedOutputBuffers.isEmpty(); releaseOutputBufferInternal((OutputBuffer)queuedOutputBuffers.removeFirst()));
	//   32   64:aload_0         
	//   33   65:getfield        #51  <Field ArrayDeque queuedOutputBuffers>
	//   34   68:invokevirtual   #89  <Method boolean ArrayDeque.isEmpty()>
	//   35   71:ifne            91
	//   36   74:aload_0         
	//   37   75:aload_0         
	//   38   76:getfield        #51  <Field ArrayDeque queuedOutputBuffers>
	//   39   79:invokevirtual   #107 <Method Object ArrayDeque.removeFirst()>
	//   40   82:checkcast       #116 <Class OutputBuffer>
	//   41   85:invokespecial   #137 <Method void releaseOutputBufferInternal(OutputBuffer)>
	//*  42   88:goto            64
		obj;
	//   43   91:aload_1         
		JVM INSTR monitorexit ;
	//   44   92:monitorexit     
		return;
	//   45   93:return          
		Exception exception1;
		exception1;
	//   46   94:astore_2        
		obj;
	//   47   95:aload_1         
		JVM INSTR monitorexit ;
	//   48   96:monitorexit     
		throw exception1;
	//   49   97:aload_2         
	//   50   98:athrow          
	}

	public final void queueInputBuffer(DecoderInputBuffer decoderinputbuffer)
		throws Exception
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Object lock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		maybeThrowException();
	//    5    7:aload_0         
	//    6    8:invokespecial   #174 <Method void maybeThrowException()>
		boolean flag;
		if(decoderinputbuffer == dequeuedInputBuffer)
	//*   7   11:aload_1         
	//*   8   12:aload_0         
	//*   9   13:getfield        #176 <Field DecoderInputBuffer dequeuedInputBuffer>
	//*  10   16:if_acmpne       53
			flag = true;
	//   11   19:iconst_1        
	//   12   20:istore_2        
		else
	//*  13   21:goto            24
	//*  14   24:iload_2         
	//*  15   25:invokestatic    #194 <Method void Assertions.checkArgument(boolean)>
	//*  16   28:aload_0         
	//*  17   29:getfield        #49  <Field ArrayDeque queuedInputBuffers>
	//*  18   32:aload_1         
	//*  19   33:invokevirtual   #145 <Method void ArrayDeque.addLast(Object)>
	//*  20   36:aload_0         
	//*  21   37:invokespecial   #196 <Method void maybeNotifyDecodeLoop()>
	//*  22   40:aload_0         
	//*  23   41:aconst_null     
	//*  24   42:putfield        #176 <Field DecoderInputBuffer dequeuedInputBuffer>
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
		queuedInputBuffers.addLast(((Object) (decoderinputbuffer)));
		maybeNotifyDecodeLoop();
		dequeuedInputBuffer = null;
		obj;
		JVM INSTR monitorexit ;
		return;
		decoderinputbuffer;
		obj;
		JVM INSTR monitorexit ;
		throw decoderinputbuffer;
	//*  35   55:goto            24
	}

	public volatile void queueInputBuffer(Object obj)
		throws Exception
	{
		queueInputBuffer((DecoderInputBuffer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #109 <Class DecoderInputBuffer>
	//    3    5:invokevirtual   #199 <Method void queueInputBuffer(DecoderInputBuffer)>
	//    4    8:return          
	}

	public void release()
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			released = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #98  <Field boolean released>
			lock.notify();
	//    8   12:aload_0         
	//    9   13:getfield        #44  <Field Object lock>
	//   10   16:invokevirtual   #154 <Method void Object.notify()>
		}
	//   11   19:aload_1         
	//   12   20:monitorexit     
		try
		{
			decodeThread.join();
	//   13   21:aload_0         
	//   14   22:getfield        #72  <Field Thread decodeThread>
	//   15   25:invokevirtual   #203 <Method void Thread.join()>
			return;
	//   16   28:return          
		}
	//*  17   29:invokestatic    #207 <Method Thread Thread.currentThread()>
	//*  18   32:invokevirtual   #210 <Method void Thread.interrupt()>
	//*  19   35:return          
	//*  20   36:astore_2        
	//*  21   37:aload_1         
	//*  22   38:monitorexit     
	//*  23   39:aload_2         
	//*  24   40:athrow          
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
	//*  25   41:astore_1        
	//*  26   42:goto            29
	}

	protected void releaseOutputBuffer(OutputBuffer outputbuffer)
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			releaseOutputBufferInternal(outputbuffer);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokespecial   #137 <Method void releaseOutputBufferInternal(OutputBuffer)>
			maybeNotifyDecodeLoop();
	//    8   12:aload_0         
	//    9   13:invokespecial   #196 <Method void maybeNotifyDecodeLoop()>
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		outputbuffer;
	//   13   19:astore_1        
		obj;
	//   14   20:aload_2         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw outputbuffer;
	//   16   22:aload_1         
	//   17   23:athrow          
	}

	protected final void setInitialInputBufferSize(int i)
	{
		int k = availableInputBufferCount;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int availableInputBufferCount>
	//    2    4:istore_3        
		DecoderInputBuffer adecoderinputbuffer[] = availableInputBuffers;
	//    3    5:aload_0         
	//    4    6:getfield        #53  <Field DecoderInputBuffer[] availableInputBuffers>
	//    5    9:astore          5
		int j = 0;
	//    6   11:iconst_0        
	//    7   12:istore_2        
		boolean flag;
		if(k == adecoderinputbuffer.length)
	//*   8   13:iload_3         
	//*   9   14:aload           5
	//*  10   16:arraylength     
	//*  11   17:icmpne          26
			flag = true;
	//   12   20:iconst_1        
	//   13   21:istore          4
		else
	//*  14   23:goto            29
			flag = false;
	//   15   26:iconst_0        
	//   16   27:istore          4
		Assertions.checkState(flag);
	//   17   29:iload           4
	//   18   31:invokestatic    #182 <Method void Assertions.checkState(boolean)>
		adecoderinputbuffer = availableInputBuffers;
	//   19   34:aload_0         
	//   20   35:getfield        #53  <Field DecoderInputBuffer[] availableInputBuffers>
	//   21   38:astore          5
		for(int l = adecoderinputbuffer.length; j < l; j++)
	//*  22   40:aload           5
	//*  23   42:arraylength     
	//*  24   43:istore_3        
	//*  25   44:iload_2         
	//*  26   45:iload_3         
	//*  27   46:icmpge          64
			adecoderinputbuffer[j].ensureSpaceForWrite(i);
	//   28   49:aload           5
	//   29   51:iload_2         
	//   30   52:aaload          
	//   31   53:iload_1         
	//   32   54:invokevirtual   #215 <Method void DecoderInputBuffer.ensureSpaceForWrite(int)>

	//   33   57:iload_2         
	//   34   58:iconst_1        
	//   35   59:iadd            
	//   36   60:istore_2        
	//*  37   61:goto            44
	//   38   64:return          
	}

	private int availableInputBufferCount;
	private final DecoderInputBuffer availableInputBuffers[];
	private int availableOutputBufferCount;
	private final OutputBuffer availableOutputBuffers[];
	private final Thread decodeThread = new Thread() {

		public void run()
		{
			SimpleDecoder.this.run();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field SimpleDecoder this$0>
		//    2    4:invokestatic    #22  <Method void SimpleDecoder.access$000(SimpleDecoder)>
		//    3    7:return          
		}

		final SimpleDecoder this$0;

			
			{
				this$0 = SimpleDecoder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SimpleDecoder this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Thread()>
			//    5    9:return          
			}
	}
;
	private DecoderInputBuffer dequeuedInputBuffer;
	private Exception exception;
	private boolean flushed;
	private final Object lock = new Object();
	private final ArrayDeque queuedInputBuffers = new ArrayDeque();
	private final ArrayDeque queuedOutputBuffers = new ArrayDeque();
	private boolean released;
	private int skippedOutputBufferCount;


/*
	static void access$000(SimpleDecoder simpledecoder)
	{
		simpledecoder.run();
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void run()>
		return;
	//    2    4:return          
	}

*/
}
