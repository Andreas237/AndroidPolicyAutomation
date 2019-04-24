// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioProcessor

final class FloatResamplingAudioProcessor
	implements AudioProcessor
{

	public FloatResamplingAudioProcessor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		sampleRateHz = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #37  <Field int sampleRateHz>
		channelCount = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #39  <Field int channelCount>
		sourceEncoding = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #41  <Field int sourceEncoding>
		buffer = EMPTY_BUFFER;
	//   11   19:aload_0         
	//   12   20:getstatic       #44  <Field ByteBuffer EMPTY_BUFFER>
	//   13   23:putfield        #46  <Field ByteBuffer buffer>
		outputBuffer = EMPTY_BUFFER;
	//   14   26:aload_0         
	//   15   27:getstatic       #44  <Field ByteBuffer EMPTY_BUFFER>
	//   16   30:putfield        #48  <Field ByteBuffer outputBuffer>
	//   17   33:return          
	}

	private static void writePcm32BitFloat(int i, ByteBuffer bytebuffer)
	{
		int j = Float.floatToIntBits((float)(4.6566128752457969E-10D * (double)i));
	//    0    0:ldc2w           #11  <Double 4.6566128752457969E-10D>
	//    1    3:iload_0         
	//    2    4:i2d             
	//    3    5:dmul            
	//    4    6:d2f             
	//    5    7:invokestatic    #29  <Method int Float.floatToIntBits(float)>
	//    6   10:istore_2        
		i = j;
	//    7   11:iload_2         
	//    8   12:istore_0        
		if(j == FLOAT_NAN_AS_INT)
	//*   9   13:iload_2         
	//*  10   14:getstatic       #31  <Field int FLOAT_NAN_AS_INT>
	//*  11   17:icmpne          25
			i = Float.floatToIntBits(0.0F);
	//   12   20:fconst_0        
	//   13   21:invokestatic    #29  <Method int Float.floatToIntBits(float)>
	//   14   24:istore_0        
		bytebuffer.putInt(i);
	//   15   25:aload_1         
	//   16   26:iload_0         
	//   17   27:invokevirtual   #56  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   18   30:pop             
	//   19   31:return          
	}

	public boolean configure(int i, int j, int k)
		throws AudioProcessor.UnhandledFormatException
	{
		if(!Util.isEncodingHighResolutionIntegerPcm(k))
	//*   0    0:iload_3         
	//*   1    1:invokestatic    #66  <Method boolean Util.isEncodingHighResolutionIntegerPcm(int)>
	//*   2    4:ifne            18
			throw new AudioProcessor.UnhandledFormatException(i, j, k);
	//    3    7:new             #60  <Class AudioProcessor$UnhandledFormatException>
	//    4   10:dup             
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokespecial   #69  <Method void AudioProcessor$UnhandledFormatException(int, int, int)>
	//    9   17:athrow          
		if(sampleRateHz == i && channelCount == j && sourceEncoding == k)
	//*  10   18:aload_0         
	//*  11   19:getfield        #37  <Field int sampleRateHz>
	//*  12   22:iload_1         
	//*  13   23:icmpne          44
	//*  14   26:aload_0         
	//*  15   27:getfield        #39  <Field int channelCount>
	//*  16   30:iload_2         
	//*  17   31:icmpne          44
	//*  18   34:aload_0         
	//*  19   35:getfield        #41  <Field int sourceEncoding>
	//*  20   38:iload_3         
	//*  21   39:icmpne          44
		{
			return false;
	//   22   42:iconst_0        
	//   23   43:ireturn         
		} else
		{
			sampleRateHz = i;
	//   24   44:aload_0         
	//   25   45:iload_1         
	//   26   46:putfield        #37  <Field int sampleRateHz>
			channelCount = j;
	//   27   49:aload_0         
	//   28   50:iload_2         
	//   29   51:putfield        #39  <Field int channelCount>
			sourceEncoding = k;
	//   30   54:aload_0         
	//   31   55:iload_3         
	//   32   56:putfield        #41  <Field int sourceEncoding>
			return true;
	//   33   59:iconst_1        
	//   34   60:ireturn         
		}
	}

	public void flush()
	{
		outputBuffer = EMPTY_BUFFER;
	//    0    0:aload_0         
	//    1    1:getstatic       #44  <Field ByteBuffer EMPTY_BUFFER>
	//    2    4:putfield        #48  <Field ByteBuffer outputBuffer>
		inputEnded = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #73  <Field boolean inputEnded>
	//    6   12:return          
	}

	public ByteBuffer getOutput()
	{
		ByteBuffer bytebuffer = outputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field ByteBuffer outputBuffer>
	//    2    4:astore_1        
		outputBuffer = EMPTY_BUFFER;
	//    3    5:aload_0         
	//    4    6:getstatic       #44  <Field ByteBuffer EMPTY_BUFFER>
	//    5    9:putfield        #48  <Field ByteBuffer outputBuffer>
		return bytebuffer;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	public int getOutputChannelCount()
	{
		return channelCount;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int channelCount>
	//    2    4:ireturn         
	}

	public int getOutputEncoding()
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public int getOutputSampleRateHz()
	{
		return sampleRateHz;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int sampleRateHz>
	//    2    4:ireturn         
	}

	public boolean isActive()
	{
		return Util.isEncodingHighResolutionIntegerPcm(sourceEncoding);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int sourceEncoding>
	//    2    4:invokestatic    #66  <Method boolean Util.isEncodingHighResolutionIntegerPcm(int)>
	//    3    7:ireturn         
	}

	public boolean isEnded()
	{
		return inputEnded && outputBuffer == EMPTY_BUFFER;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field boolean inputEnded>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:getfield        #48  <Field ByteBuffer outputBuffer>
	//    5   11:getstatic       #44  <Field ByteBuffer EMPTY_BUFFER>
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
	//    2    2:putfield        #73  <Field boolean inputEnded>
	//    3    5:return          
	}

	public void queueInput(ByteBuffer bytebuffer)
	{
		boolean flag;
		if(sourceEncoding == 0x40000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field int sourceEncoding>
	//*   2    4:ldc1            #86  <Int 0x40000000>
	//*   3    6:icmpne          14
			flag = true;
	//    4    9:iconst_1        
	//    5   10:istore_2        
		else
	//*   6   11:goto            16
			flag = false;
	//    7   14:iconst_0        
	//    8   15:istore_2        
		int i = bytebuffer.position();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #89  <Method int ByteBuffer.position()>
	//   11   20:istore_3        
		int k = bytebuffer.limit();
	//   12   21:aload_1         
	//   13   22:invokevirtual   #92  <Method int ByteBuffer.limit()>
	//   14   25:istore          5
		int j = k - i;
	//   15   27:iload           5
	//   16   29:iload_3         
	//   17   30:isub            
	//   18   31:istore          4
		if(!flag)
	//*  19   33:iload_2         
	//*  20   34:ifeq            40
	//*  21   37:goto            48
			j = (j / 3) * 4;
	//   22   40:iload           4
	//   23   42:iconst_3        
	//   24   43:idiv            
	//   25   44:iconst_4        
	//   26   45:imul            
	//   27   46:istore          4
		if(buffer.capacity() < j)
	//*  28   48:aload_0         
	//*  29   49:getfield        #46  <Field ByteBuffer buffer>
	//*  30   52:invokevirtual   #95  <Method int ByteBuffer.capacity()>
	//*  31   55:iload           4
	//*  32   57:icmpge          78
			buffer = ByteBuffer.allocateDirect(j).order(ByteOrder.nativeOrder());
	//   33   60:aload_0         
	//   34   61:iload           4
	//   35   63:invokestatic    #98  <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//   36   66:invokestatic    #104 <Method ByteOrder ByteOrder.nativeOrder()>
	//   37   69:invokevirtual   #108 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   38   72:putfield        #46  <Field ByteBuffer buffer>
		else
	//*  39   75:goto            86
			buffer.clear();
	//   40   78:aload_0         
	//   41   79:getfield        #46  <Field ByteBuffer buffer>
	//   42   82:invokevirtual   #112 <Method java.nio.Buffer ByteBuffer.clear()>
	//   43   85:pop             
		j = i;
	//   44   86:iload_3         
	//   45   87:istore          4
		if(flag)
	//*  46   89:iload_2         
	//*  47   90:ifeq            167
			for(; i < k; i += 4)
	//*  48   93:iload_3         
	//*  49   94:iload           5
	//*  50   96:icmpge          235
				writePcm32BitFloat(bytebuffer.get(i) & 0xff | (bytebuffer.get(i + 1) & 0xff) << 8 | (bytebuffer.get(i + 2) & 0xff) << 16 | (bytebuffer.get(i + 3) & 0xff) << 24, buffer);
	//   51   99:aload_1         
	//   52  100:iload_3         
	//   53  101:invokevirtual   #116 <Method byte ByteBuffer.get(int)>
	//   54  104:sipush          255
	//   55  107:iand            
	//   56  108:aload_1         
	//   57  109:iload_3         
	//   58  110:iconst_1        
	//   59  111:iadd            
	//   60  112:invokevirtual   #116 <Method byte ByteBuffer.get(int)>
	//   61  115:sipush          255
	//   62  118:iand            
	//   63  119:bipush          8
	//   64  121:ishl            
	//   65  122:ior             
	//   66  123:aload_1         
	//   67  124:iload_3         
	//   68  125:iconst_2        
	//   69  126:iadd            
	//   70  127:invokevirtual   #116 <Method byte ByteBuffer.get(int)>
	//   71  130:sipush          255
	//   72  133:iand            
	//   73  134:bipush          16
	//   74  136:ishl            
	//   75  137:ior             
	//   76  138:aload_1         
	//   77  139:iload_3         
	//   78  140:iconst_3        
	//   79  141:iadd            
	//   80  142:invokevirtual   #116 <Method byte ByteBuffer.get(int)>
	//   81  145:sipush          255
	//   82  148:iand            
	//   83  149:bipush          24
	//   84  151:ishl            
	//   85  152:ior             
	//   86  153:aload_0         
	//   87  154:getfield        #46  <Field ByteBuffer buffer>
	//   88  157:invokestatic    #118 <Method void writePcm32BitFloat(int, ByteBuffer)>

	//   89  160:iload_3         
	//   90  161:iconst_4        
	//   91  162:iadd            
	//   92  163:istore_3        
		else
	//*  93  164:goto            93
			for(; j < k; j += 3)
	//*  94  167:iload           4
	//*  95  169:iload           5
	//*  96  171:icmpge          235
				writePcm32BitFloat((bytebuffer.get(j) & 0xff) << 8 | (bytebuffer.get(j + 1) & 0xff) << 16 | (bytebuffer.get(j + 2) & 0xff) << 24, buffer);
	//   97  174:aload_1         
	//   98  175:iload           4
	//   99  177:invokevirtual   #116 <Method byte ByteBuffer.get(int)>
	//  100  180:sipush          255
	//  101  183:iand            
	//  102  184:bipush          8
	//  103  186:ishl            
	//  104  187:aload_1         
	//  105  188:iload           4
	//  106  190:iconst_1        
	//  107  191:iadd            
	//  108  192:invokevirtual   #116 <Method byte ByteBuffer.get(int)>
	//  109  195:sipush          255
	//  110  198:iand            
	//  111  199:bipush          16
	//  112  201:ishl            
	//  113  202:ior             
	//  114  203:aload_1         
	//  115  204:iload           4
	//  116  206:iconst_2        
	//  117  207:iadd            
	//  118  208:invokevirtual   #116 <Method byte ByteBuffer.get(int)>
	//  119  211:sipush          255
	//  120  214:iand            
	//  121  215:bipush          24
	//  122  217:ishl            
	//  123  218:ior             
	//  124  219:aload_0         
	//  125  220:getfield        #46  <Field ByteBuffer buffer>
	//  126  223:invokestatic    #118 <Method void writePcm32BitFloat(int, ByteBuffer)>

	//  127  226:iload           4
	//  128  228:iconst_3        
	//  129  229:iadd            
	//  130  230:istore          4
	//* 131  232:goto            167
		bytebuffer.position(bytebuffer.limit());
	//  132  235:aload_1         
	//  133  236:aload_1         
	//  134  237:invokevirtual   #92  <Method int ByteBuffer.limit()>
	//  135  240:invokevirtual   #121 <Method java.nio.Buffer ByteBuffer.position(int)>
	//  136  243:pop             
		buffer.flip();
	//  137  244:aload_0         
	//  138  245:getfield        #46  <Field ByteBuffer buffer>
	//  139  248:invokevirtual   #124 <Method java.nio.Buffer ByteBuffer.flip()>
	//  140  251:pop             
		outputBuffer = buffer;
	//  141  252:aload_0         
	//  142  253:aload_0         
	//  143  254:getfield        #46  <Field ByteBuffer buffer>
	//  144  257:putfield        #48  <Field ByteBuffer outputBuffer>
	//  145  260:return          
	}

	public void reset()
	{
		flush();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method void flush()>
		sampleRateHz = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #37  <Field int sampleRateHz>
		channelCount = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #39  <Field int channelCount>
		sourceEncoding = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #41  <Field int sourceEncoding>
		buffer = EMPTY_BUFFER;
	//   11   19:aload_0         
	//   12   20:getstatic       #44  <Field ByteBuffer EMPTY_BUFFER>
	//   13   23:putfield        #46  <Field ByteBuffer buffer>
	//   14   26:return          
	}

	private static final int FLOAT_NAN_AS_INT = Float.floatToIntBits((0.0F / 0.0F));
	private static final double PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR = 4.6566128752457969E-10D;
	private ByteBuffer buffer;
	private int channelCount;
	private boolean inputEnded;
	private ByteBuffer outputBuffer;
	private int sampleRateHz;
	private int sourceEncoding;

	static 
	{
	//    0    0:ldc1            #23  <Float (0.0F / 0.0F)>
	//    1    2:invokestatic    #29  <Method int Float.floatToIntBits(float)>
	//    2    5:putstatic       #31  <Field int FLOAT_NAN_AS_INT>
	//*   3    8:return          
	}
}
