// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioProcessor

final class ResamplingAudioProcessor
	implements AudioProcessor
{

	public ResamplingAudioProcessor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		sampleRateHz = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #21  <Field int sampleRateHz>
		channelCount = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #23  <Field int channelCount>
		encoding = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #25  <Field int encoding>
		buffer = EMPTY_BUFFER;
	//   11   19:aload_0         
	//   12   20:getstatic       #28  <Field ByteBuffer EMPTY_BUFFER>
	//   13   23:putfield        #30  <Field ByteBuffer buffer>
		outputBuffer = EMPTY_BUFFER;
	//   14   26:aload_0         
	//   15   27:getstatic       #28  <Field ByteBuffer EMPTY_BUFFER>
	//   16   30:putfield        #32  <Field ByteBuffer outputBuffer>
	//   17   33:return          
	}

	public boolean configure(int i, int j, int k)
		throws AudioProcessor.UnhandledFormatException
	{
		if(k != 3 && k != 2 && k != 0x80000000 && k != 0x40000000)
	//*   0    0:iload_3         
	//*   1    1:iconst_3        
	//*   2    2:icmpeq          33
	//*   3    5:iload_3         
	//*   4    6:iconst_2        
	//*   5    7:icmpeq          33
	//*   6   10:iload_3         
	//*   7   11:ldc1            #38  <Int 0x80000000>
	//*   8   13:icmpeq          33
	//*   9   16:iload_3         
	//*  10   17:ldc1            #39  <Int 0x40000000>
	//*  11   19:icmpeq          33
			throw new AudioProcessor.UnhandledFormatException(i, j, k);
	//   12   22:new             #37  <Class AudioProcessor$UnhandledFormatException>
	//   13   25:dup             
	//   14   26:iload_1         
	//   15   27:iload_2         
	//   16   28:iload_3         
	//   17   29:invokespecial   #42  <Method void AudioProcessor$UnhandledFormatException(int, int, int)>
	//   18   32:athrow          
		if(sampleRateHz == i && channelCount == j && encoding == k)
	//*  19   33:aload_0         
	//*  20   34:getfield        #21  <Field int sampleRateHz>
	//*  21   37:iload_1         
	//*  22   38:icmpne          59
	//*  23   41:aload_0         
	//*  24   42:getfield        #23  <Field int channelCount>
	//*  25   45:iload_2         
	//*  26   46:icmpne          59
	//*  27   49:aload_0         
	//*  28   50:getfield        #25  <Field int encoding>
	//*  29   53:iload_3         
	//*  30   54:icmpne          59
		{
			return false;
	//   31   57:iconst_0        
	//   32   58:ireturn         
		} else
		{
			sampleRateHz = i;
	//   33   59:aload_0         
	//   34   60:iload_1         
	//   35   61:putfield        #21  <Field int sampleRateHz>
			channelCount = j;
	//   36   64:aload_0         
	//   37   65:iload_2         
	//   38   66:putfield        #23  <Field int channelCount>
			encoding = k;
	//   39   69:aload_0         
	//   40   70:iload_3         
	//   41   71:putfield        #25  <Field int encoding>
			return true;
	//   42   74:iconst_1        
	//   43   75:ireturn         
		}
	}

	public void flush()
	{
		outputBuffer = EMPTY_BUFFER;
	//    0    0:aload_0         
	//    1    1:getstatic       #28  <Field ByteBuffer EMPTY_BUFFER>
	//    2    4:putfield        #32  <Field ByteBuffer outputBuffer>
		inputEnded = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #46  <Field boolean inputEnded>
	//    6   12:return          
	}

	public ByteBuffer getOutput()
	{
		ByteBuffer bytebuffer = outputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ByteBuffer outputBuffer>
	//    2    4:astore_1        
		outputBuffer = EMPTY_BUFFER;
	//    3    5:aload_0         
	//    4    6:getstatic       #28  <Field ByteBuffer EMPTY_BUFFER>
	//    5    9:putfield        #32  <Field ByteBuffer outputBuffer>
		return bytebuffer;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	public int getOutputChannelCount()
	{
		return channelCount;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int channelCount>
	//    2    4:ireturn         
	}

	public int getOutputEncoding()
	{
		return 2;
	//    0    0:iconst_2        
	//    1    1:ireturn         
	}

	public int getOutputSampleRateHz()
	{
		return sampleRateHz;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int sampleRateHz>
	//    2    4:ireturn         
	}

	public boolean isActive()
	{
		return encoding != 0 && encoding != 2;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int encoding>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field int encoding>
	//    5   11:iconst_2        
	//    6   12:icmpeq          17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public boolean isEnded()
	{
		return inputEnded && outputBuffer == EMPTY_BUFFER;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean inputEnded>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field ByteBuffer outputBuffer>
	//    5   11:getstatic       #28  <Field ByteBuffer EMPTY_BUFFER>
	//    6   14:if_acmpne       19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void queueEndOfStream()
	{
		inputEnded = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #46  <Field boolean inputEnded>
	//    3    5:return          
	}

	public void queueInput(ByteBuffer bytebuffer)
	{
		int i = bytebuffer.position();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #63  <Method int ByteBuffer.position()>
	//    2    4:istore_2        
		int k = bytebuffer.limit();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #66  <Method int ByteBuffer.limit()>
	//    5    9:istore          4
		int j = k - i;
	//    6   11:iload           4
	//    7   13:iload_2         
	//    8   14:isub            
	//    9   15:istore_3        
		int l = encoding;
	//   10   16:aload_0         
	//   11   17:getfield        #25  <Field int encoding>
	//   12   20:istore          5
		if(l != 0x80000000)
	//*  13   22:iload           5
	//*  14   24:ldc1            #38  <Int 0x80000000>
	//*  15   26:icmpeq          64
		{
			if(l != 3)
	//*  16   29:iload           5
	//*  17   31:iconst_3        
	//*  18   32:icmpeq          57
			{
				if(l != 0x40000000)
	//*  19   35:iload           5
	//*  20   37:ldc1            #39  <Int 0x40000000>
	//*  21   39:icmpeq          50
					throw new IllegalStateException();
	//   22   42:new             #68  <Class IllegalStateException>
	//   23   45:dup             
	//   24   46:invokespecial   #69  <Method void IllegalStateException()>
	//   25   49:athrow          
				j /= 2;
	//   26   50:iload_3         
	//   27   51:iconst_2        
	//   28   52:idiv            
	//   29   53:istore_3        
			} else
	//*  30   54:goto            70
			{
				j *= 2;
	//   31   57:iload_3         
	//   32   58:iconst_2        
	//   33   59:imul            
	//   34   60:istore_3        
			}
		} else
	//*  35   61:goto            70
		{
			j = (j / 3) * 2;
	//   36   64:iload_3         
	//   37   65:iconst_3        
	//   38   66:idiv            
	//   39   67:iconst_2        
	//   40   68:imul            
	//   41   69:istore_3        
		}
		if(buffer.capacity() < j)
	//*  42   70:aload_0         
	//*  43   71:getfield        #30  <Field ByteBuffer buffer>
	//*  44   74:invokevirtual   #72  <Method int ByteBuffer.capacity()>
	//*  45   77:iload_3         
	//*  46   78:icmpge          98
			buffer = ByteBuffer.allocateDirect(j).order(ByteOrder.nativeOrder());
	//   47   81:aload_0         
	//   48   82:iload_3         
	//   49   83:invokestatic    #76  <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//   50   86:invokestatic    #82  <Method ByteOrder ByteOrder.nativeOrder()>
	//   51   89:invokevirtual   #86  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   52   92:putfield        #30  <Field ByteBuffer buffer>
		else
	//*  53   95:goto            106
			buffer.clear();
	//   54   98:aload_0         
	//   55   99:getfield        #30  <Field ByteBuffer buffer>
	//   56  102:invokevirtual   #90  <Method java.nio.Buffer ByteBuffer.clear()>
	//   57  105:pop             
		l = encoding;
	//   58  106:aload_0         
	//   59  107:getfield        #25  <Field int encoding>
	//   60  110:istore          5
		j = i;
	//   61  112:iload_2         
	//   62  113:istore_3        
		if(l != 0x80000000)
	//*  63  114:iload           5
	//*  64  116:ldc1            #38  <Int 0x80000000>
	//*  65  118:icmpeq          231
		{
			j = i;
	//   66  121:iload_2         
	//   67  122:istore_3        
			if(l != 3)
	//*  68  123:iload           5
	//*  69  125:iconst_3        
	//*  70  126:icmpeq          187
			{
				if(l != 0x40000000)
	//*  71  129:iload           5
	//*  72  131:ldc1            #39  <Int 0x40000000>
	//*  73  133:icmpeq          144
					throw new IllegalStateException();
	//   74  136:new             #68  <Class IllegalStateException>
	//   75  139:dup             
	//   76  140:invokespecial   #69  <Method void IllegalStateException()>
	//   77  143:athrow          
				for(; i < k; i += 4)
	//*  78  144:iload_2         
	//*  79  145:iload           4
	//*  80  147:icmpge          274
				{
					buffer.put(bytebuffer.get(i + 2));
	//   81  150:aload_0         
	//   82  151:getfield        #30  <Field ByteBuffer buffer>
	//   83  154:aload_1         
	//   84  155:iload_2         
	//   85  156:iconst_2        
	//   86  157:iadd            
	//   87  158:invokevirtual   #94  <Method byte ByteBuffer.get(int)>
	//   88  161:invokevirtual   #98  <Method ByteBuffer ByteBuffer.put(byte)>
	//   89  164:pop             
					buffer.put(bytebuffer.get(i + 3));
	//   90  165:aload_0         
	//   91  166:getfield        #30  <Field ByteBuffer buffer>
	//   92  169:aload_1         
	//   93  170:iload_2         
	//   94  171:iconst_3        
	//   95  172:iadd            
	//   96  173:invokevirtual   #94  <Method byte ByteBuffer.get(int)>
	//   97  176:invokevirtual   #98  <Method ByteBuffer ByteBuffer.put(byte)>
	//   98  179:pop             
				}

	//   99  180:iload_2         
	//  100  181:iconst_4        
	//  101  182:iadd            
	//  102  183:istore_2        
			} else
	//* 103  184:goto            144
			{
				for(; j < k; j++)
	//* 104  187:iload_3         
	//* 105  188:iload           4
	//* 106  190:icmpge          274
				{
					buffer.put((byte)0);
	//  107  193:aload_0         
	//  108  194:getfield        #30  <Field ByteBuffer buffer>
	//  109  197:iconst_0        
	//  110  198:invokevirtual   #98  <Method ByteBuffer ByteBuffer.put(byte)>
	//  111  201:pop             
					buffer.put((byte)((bytebuffer.get(j) & 0xff) - 128));
	//  112  202:aload_0         
	//  113  203:getfield        #30  <Field ByteBuffer buffer>
	//  114  206:aload_1         
	//  115  207:iload_3         
	//  116  208:invokevirtual   #94  <Method byte ByteBuffer.get(int)>
	//  117  211:sipush          255
	//  118  214:iand            
	//  119  215:sipush          128
	//  120  218:isub            
	//  121  219:int2byte        
	//  122  220:invokevirtual   #98  <Method ByteBuffer ByteBuffer.put(byte)>
	//  123  223:pop             
				}

	//  124  224:iload_3         
	//  125  225:iconst_1        
	//  126  226:iadd            
	//  127  227:istore_3        
			}
		} else
	//* 128  228:goto            187
		{
			for(; j < k; j += 3)
	//* 129  231:iload_3         
	//* 130  232:iload           4
	//* 131  234:icmpge          274
			{
				buffer.put(bytebuffer.get(j + 1));
	//  132  237:aload_0         
	//  133  238:getfield        #30  <Field ByteBuffer buffer>
	//  134  241:aload_1         
	//  135  242:iload_3         
	//  136  243:iconst_1        
	//  137  244:iadd            
	//  138  245:invokevirtual   #94  <Method byte ByteBuffer.get(int)>
	//  139  248:invokevirtual   #98  <Method ByteBuffer ByteBuffer.put(byte)>
	//  140  251:pop             
				buffer.put(bytebuffer.get(j + 2));
	//  141  252:aload_0         
	//  142  253:getfield        #30  <Field ByteBuffer buffer>
	//  143  256:aload_1         
	//  144  257:iload_3         
	//  145  258:iconst_2        
	//  146  259:iadd            
	//  147  260:invokevirtual   #94  <Method byte ByteBuffer.get(int)>
	//  148  263:invokevirtual   #98  <Method ByteBuffer ByteBuffer.put(byte)>
	//  149  266:pop             
			}

	//  150  267:iload_3         
	//  151  268:iconst_3        
	//  152  269:iadd            
	//  153  270:istore_3        
		}
	//* 154  271:goto            231
		bytebuffer.position(bytebuffer.limit());
	//  155  274:aload_1         
	//  156  275:aload_1         
	//  157  276:invokevirtual   #66  <Method int ByteBuffer.limit()>
	//  158  279:invokevirtual   #101 <Method java.nio.Buffer ByteBuffer.position(int)>
	//  159  282:pop             
		buffer.flip();
	//  160  283:aload_0         
	//  161  284:getfield        #30  <Field ByteBuffer buffer>
	//  162  287:invokevirtual   #104 <Method java.nio.Buffer ByteBuffer.flip()>
	//  163  290:pop             
		outputBuffer = buffer;
	//  164  291:aload_0         
	//  165  292:aload_0         
	//  166  293:getfield        #30  <Field ByteBuffer buffer>
	//  167  296:putfield        #32  <Field ByteBuffer outputBuffer>
	//  168  299:return          
	}

	public void reset()
	{
		flush();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method void flush()>
		sampleRateHz = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #21  <Field int sampleRateHz>
		channelCount = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #23  <Field int channelCount>
		encoding = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #25  <Field int encoding>
		buffer = EMPTY_BUFFER;
	//   11   19:aload_0         
	//   12   20:getstatic       #28  <Field ByteBuffer EMPTY_BUFFER>
	//   13   23:putfield        #30  <Field ByteBuffer buffer>
	//   14   26:return          
	}

	private ByteBuffer buffer;
	private int channelCount;
	private int encoding;
	private boolean inputEnded;
	private ByteBuffer outputBuffer;
	private int sampleRateHz;
}
