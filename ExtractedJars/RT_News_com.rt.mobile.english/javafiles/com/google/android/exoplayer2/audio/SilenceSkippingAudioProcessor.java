// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioProcessor

public final class SilenceSkippingAudioProcessor
	implements AudioProcessor
{

	public SilenceSkippingAudioProcessor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		buffer = EMPTY_BUFFER;
	//    2    4:aload_0         
	//    3    5:getstatic       #50  <Field ByteBuffer EMPTY_BUFFER>
	//    4    8:putfield        #52  <Field ByteBuffer buffer>
		outputBuffer = EMPTY_BUFFER;
	//    5   11:aload_0         
	//    6   12:getstatic       #50  <Field ByteBuffer EMPTY_BUFFER>
	//    7   15:putfield        #54  <Field ByteBuffer outputBuffer>
		channelCount = -1;
	//    8   18:aload_0         
	//    9   19:iconst_m1       
	//   10   20:putfield        #56  <Field int channelCount>
		sampleRateHz = -1;
	//   11   23:aload_0         
	//   12   24:iconst_m1       
	//   13   25:putfield        #58  <Field int sampleRateHz>
		maybeSilenceBuffer = new byte[0];
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:newarray        byte[]
	//   17   32:putfield        #60  <Field byte[] maybeSilenceBuffer>
		paddingBuffer = new byte[0];
	//   18   35:aload_0         
	//   19   36:iconst_0        
	//   20   37:newarray        byte[]
	//   21   39:putfield        #62  <Field byte[] paddingBuffer>
	//   22   42:return          
	}

	private int durationUsToFrames(long l)
	{
		return (int)((l * (long)sampleRateHz) / 0xf4240L);
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field int sampleRateHz>
	//    3    5:i2l             
	//    4    6:lmul            
	//    5    7:ldc2w           #66  <Long 0xf4240L>
	//    6   10:ldiv            
	//    7   11:l2i             
	//    8   12:ireturn         
	}

	private int findNoiseLimit(ByteBuffer bytebuffer)
	{
		for(int i = bytebuffer.limit() - 1; i >= bytebuffer.position(); i -= 2)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #75  <Method int ByteBuffer.limit()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_1         
	//*   7    9:invokevirtual   #78  <Method int ByteBuffer.position()>
	//*   8   12:icmplt          51
			if(Math.abs(((int) (bytebuffer.get(i)))) > 4)
	//*   9   15:aload_1         
	//*  10   16:iload_2         
	//*  11   17:invokevirtual   #82  <Method byte ByteBuffer.get(int)>
	//*  12   20:invokestatic    #88  <Method int Math.abs(int)>
	//*  13   23:iconst_4        
	//*  14   24:icmple          44
				return bytesPerFrame * (i / bytesPerFrame) + bytesPerFrame;
	//   15   27:aload_0         
	//   16   28:getfield        #90  <Field int bytesPerFrame>
	//   17   31:iload_2         
	//   18   32:aload_0         
	//   19   33:getfield        #90  <Field int bytesPerFrame>
	//   20   36:idiv            
	//   21   37:imul            
	//   22   38:aload_0         
	//   23   39:getfield        #90  <Field int bytesPerFrame>
	//   24   42:iadd            
	//   25   43:ireturn         

	//   26   44:iload_2         
	//   27   45:iconst_2        
	//   28   46:isub            
	//   29   47:istore_2        
	//*  30   48:goto            7
		return bytebuffer.position();
	//   31   51:aload_1         
	//   32   52:invokevirtual   #78  <Method int ByteBuffer.position()>
	//   33   55:ireturn         
	}

	private int findNoisePosition(ByteBuffer bytebuffer)
	{
		for(int i = bytebuffer.position() + 1; i < bytebuffer.limit(); i += 2)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #78  <Method int ByteBuffer.position()>
	//*   2    4:iconst_1        
	//*   3    5:iadd            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_1         
	//*   7    9:invokevirtual   #75  <Method int ByteBuffer.limit()>
	//*   8   12:icmpge          46
			if(Math.abs(((int) (bytebuffer.get(i)))) > 4)
	//*   9   15:aload_1         
	//*  10   16:iload_2         
	//*  11   17:invokevirtual   #82  <Method byte ByteBuffer.get(int)>
	//*  12   20:invokestatic    #88  <Method int Math.abs(int)>
	//*  13   23:iconst_4        
	//*  14   24:icmple          39
				return bytesPerFrame * (i / bytesPerFrame);
	//   15   27:aload_0         
	//   16   28:getfield        #90  <Field int bytesPerFrame>
	//   17   31:iload_2         
	//   18   32:aload_0         
	//   19   33:getfield        #90  <Field int bytesPerFrame>
	//   20   36:idiv            
	//   21   37:imul            
	//   22   38:ireturn         

	//   23   39:iload_2         
	//   24   40:iconst_2        
	//   25   41:iadd            
	//   26   42:istore_2        
	//*  27   43:goto            7
		return bytebuffer.limit();
	//   28   46:aload_1         
	//   29   47:invokevirtual   #75  <Method int ByteBuffer.limit()>
	//   30   50:ireturn         
	}

	private void output(ByteBuffer bytebuffer)
	{
		prepareForOutput(bytebuffer.remaining());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #96  <Method int ByteBuffer.remaining()>
	//    3    5:invokespecial   #100 <Method void prepareForOutput(int)>
		buffer.put(bytebuffer);
	//    4    8:aload_0         
	//    5    9:getfield        #52  <Field ByteBuffer buffer>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #104 <Method ByteBuffer ByteBuffer.put(ByteBuffer)>
	//    8   16:pop             
		buffer.flip();
	//    9   17:aload_0         
	//   10   18:getfield        #52  <Field ByteBuffer buffer>
	//   11   21:invokevirtual   #108 <Method java.nio.Buffer ByteBuffer.flip()>
	//   12   24:pop             
		outputBuffer = buffer;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #52  <Field ByteBuffer buffer>
	//   16   30:putfield        #54  <Field ByteBuffer outputBuffer>
	//   17   33:return          
	}

	private void output(byte abyte0[], int i)
	{
		prepareForOutput(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokespecial   #100 <Method void prepareForOutput(int)>
		buffer.put(abyte0, 0, i);
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field ByteBuffer buffer>
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:iload_2         
	//    8   12:invokevirtual   #112 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//    9   15:pop             
		buffer.flip();
	//   10   16:aload_0         
	//   11   17:getfield        #52  <Field ByteBuffer buffer>
	//   12   20:invokevirtual   #108 <Method java.nio.Buffer ByteBuffer.flip()>
	//   13   23:pop             
		outputBuffer = buffer;
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #52  <Field ByteBuffer buffer>
	//   17   29:putfield        #54  <Field ByteBuffer outputBuffer>
	//   18   32:return          
	}

	private void prepareForOutput(int i)
	{
		if(buffer.capacity() < i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field ByteBuffer buffer>
	//*   2    4:invokevirtual   #115 <Method int ByteBuffer.capacity()>
	//*   3    7:iload_1         
	//*   4    8:icmpge          28
			buffer = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokestatic    #119 <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//    8   16:invokestatic    #125 <Method ByteOrder ByteOrder.nativeOrder()>
	//    9   19:invokevirtual   #129 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   10   22:putfield        #52  <Field ByteBuffer buffer>
		else
	//*  11   25:goto            36
			buffer.clear();
	//   12   28:aload_0         
	//   13   29:getfield        #52  <Field ByteBuffer buffer>
	//   14   32:invokevirtual   #132 <Method java.nio.Buffer ByteBuffer.clear()>
	//   15   35:pop             
		if(i > 0)
	//*  16   36:iload_1         
	//*  17   37:ifle            45
			hasOutputNoise = true;
	//   18   40:aload_0         
	//   19   41:iconst_1        
	//   20   42:putfield        #134 <Field boolean hasOutputNoise>
	//   21   45:return          
	}

	private void processMaybeSilence(ByteBuffer bytebuffer)
	{
		int i = bytebuffer.limit();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #75  <Method int ByteBuffer.limit()>
	//    2    4:istore_2        
		int j = findNoisePosition(bytebuffer);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #137 <Method int findNoisePosition(ByteBuffer)>
	//    6   10:istore_3        
		int k = j - bytebuffer.position();
	//    7   11:iload_3         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #78  <Method int ByteBuffer.position()>
	//   10   16:isub            
	//   11   17:istore          4
		int l = maybeSilenceBuffer.length - maybeSilenceBufferSize;
	//   12   19:aload_0         
	//   13   20:getfield        #60  <Field byte[] maybeSilenceBuffer>
	//   14   23:arraylength     
	//   15   24:aload_0         
	//   16   25:getfield        #139 <Field int maybeSilenceBufferSize>
	//   17   28:isub            
	//   18   29:istore          5
		if(j < i && k < l)
	//*  19   31:iload_3         
	//*  20   32:iload_2         
	//*  21   33:icmpge          66
	//*  22   36:iload           4
	//*  23   38:iload           5
	//*  24   40:icmpge          66
		{
			output(maybeSilenceBuffer, maybeSilenceBufferSize);
	//   25   43:aload_0         
	//   26   44:aload_0         
	//   27   45:getfield        #60  <Field byte[] maybeSilenceBuffer>
	//   28   48:aload_0         
	//   29   49:getfield        #139 <Field int maybeSilenceBufferSize>
	//   30   52:invokespecial   #141 <Method void output(byte[], int)>
			maybeSilenceBufferSize = 0;
	//   31   55:aload_0         
	//   32   56:iconst_0        
	//   33   57:putfield        #139 <Field int maybeSilenceBufferSize>
			state = 0;
	//   34   60:aload_0         
	//   35   61:iconst_0        
	//   36   62:putfield        #143 <Field int state>
			return;
	//   37   65:return          
		}
		j = Math.min(k, l);
	//   38   66:iload           4
	//   39   68:iload           5
	//   40   70:invokestatic    #147 <Method int Math.min(int, int)>
	//   41   73:istore_3        
		bytebuffer.limit(bytebuffer.position() + j);
	//   42   74:aload_1         
	//   43   75:aload_1         
	//   44   76:invokevirtual   #78  <Method int ByteBuffer.position()>
	//   45   79:iload_3         
	//   46   80:iadd            
	//   47   81:invokevirtual   #150 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   48   84:pop             
		bytebuffer.get(maybeSilenceBuffer, maybeSilenceBufferSize, j);
	//   49   85:aload_1         
	//   50   86:aload_0         
	//   51   87:getfield        #60  <Field byte[] maybeSilenceBuffer>
	//   52   90:aload_0         
	//   53   91:getfield        #139 <Field int maybeSilenceBufferSize>
	//   54   94:iload_3         
	//   55   95:invokevirtual   #152 <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   56   98:pop             
		maybeSilenceBufferSize = maybeSilenceBufferSize + j;
	//   57   99:aload_0         
	//   58  100:aload_0         
	//   59  101:getfield        #139 <Field int maybeSilenceBufferSize>
	//   60  104:iload_3         
	//   61  105:iadd            
	//   62  106:putfield        #139 <Field int maybeSilenceBufferSize>
		if(maybeSilenceBufferSize == maybeSilenceBuffer.length)
	//*  63  109:aload_0         
	//*  64  110:getfield        #139 <Field int maybeSilenceBufferSize>
	//*  65  113:aload_0         
	//*  66  114:getfield        #60  <Field byte[] maybeSilenceBuffer>
	//*  67  117:arraylength     
	//*  68  118:icmpne          216
		{
			if(hasOutputNoise)
	//*  69  121:aload_0         
	//*  70  122:getfield        #134 <Field boolean hasOutputNoise>
	//*  71  125:ifeq            169
			{
				output(maybeSilenceBuffer, paddingSize);
	//   72  128:aload_0         
	//   73  129:aload_0         
	//   74  130:getfield        #60  <Field byte[] maybeSilenceBuffer>
	//   75  133:aload_0         
	//   76  134:getfield        #154 <Field int paddingSize>
	//   77  137:invokespecial   #141 <Method void output(byte[], int)>
				skippedFrames = skippedFrames + (long)((maybeSilenceBufferSize - paddingSize * 2) / bytesPerFrame);
	//   78  140:aload_0         
	//   79  141:aload_0         
	//   80  142:getfield        #156 <Field long skippedFrames>
	//   81  145:aload_0         
	//   82  146:getfield        #139 <Field int maybeSilenceBufferSize>
	//   83  149:aload_0         
	//   84  150:getfield        #154 <Field int paddingSize>
	//   85  153:iconst_2        
	//   86  154:imul            
	//   87  155:isub            
	//   88  156:aload_0         
	//   89  157:getfield        #90  <Field int bytesPerFrame>
	//   90  160:idiv            
	//   91  161:i2l             
	//   92  162:ladd            
	//   93  163:putfield        #156 <Field long skippedFrames>
			} else
	//*  94  166:goto            193
			{
				skippedFrames = skippedFrames + (long)((maybeSilenceBufferSize - paddingSize) / bytesPerFrame);
	//   95  169:aload_0         
	//   96  170:aload_0         
	//   97  171:getfield        #156 <Field long skippedFrames>
	//   98  174:aload_0         
	//   99  175:getfield        #139 <Field int maybeSilenceBufferSize>
	//  100  178:aload_0         
	//  101  179:getfield        #154 <Field int paddingSize>
	//  102  182:isub            
	//  103  183:aload_0         
	//  104  184:getfield        #90  <Field int bytesPerFrame>
	//  105  187:idiv            
	//  106  188:i2l             
	//  107  189:ladd            
	//  108  190:putfield        #156 <Field long skippedFrames>
			}
			updatePaddingBuffer(bytebuffer, maybeSilenceBuffer, maybeSilenceBufferSize);
	//  109  193:aload_0         
	//  110  194:aload_1         
	//  111  195:aload_0         
	//  112  196:getfield        #60  <Field byte[] maybeSilenceBuffer>
	//  113  199:aload_0         
	//  114  200:getfield        #139 <Field int maybeSilenceBufferSize>
	//  115  203:invokespecial   #160 <Method void updatePaddingBuffer(ByteBuffer, byte[], int)>
			maybeSilenceBufferSize = 0;
	//  116  206:aload_0         
	//  117  207:iconst_0        
	//  118  208:putfield        #139 <Field int maybeSilenceBufferSize>
			state = 2;
	//  119  211:aload_0         
	//  120  212:iconst_2        
	//  121  213:putfield        #143 <Field int state>
		}
		bytebuffer.limit(i);
	//  122  216:aload_1         
	//  123  217:iload_2         
	//  124  218:invokevirtual   #150 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//  125  221:pop             
	//  126  222:return          
	}

	private void processNoisy(ByteBuffer bytebuffer)
	{
		int i = bytebuffer.limit();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #75  <Method int ByteBuffer.limit()>
	//    2    4:istore_2        
		bytebuffer.limit(Math.min(i, bytebuffer.position() + maybeSilenceBuffer.length));
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #78  <Method int ByteBuffer.position()>
	//    7   11:aload_0         
	//    8   12:getfield        #60  <Field byte[] maybeSilenceBuffer>
	//    9   15:arraylength     
	//   10   16:iadd            
	//   11   17:invokestatic    #147 <Method int Math.min(int, int)>
	//   12   20:invokevirtual   #150 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   13   23:pop             
		int j = findNoiseLimit(bytebuffer);
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokespecial   #163 <Method int findNoiseLimit(ByteBuffer)>
	//   17   29:istore_3        
		if(j == bytebuffer.position())
	//*  18   30:iload_3         
	//*  19   31:aload_1         
	//*  20   32:invokevirtual   #78  <Method int ByteBuffer.position()>
	//*  21   35:icmpne          46
		{
			state = 1;
	//   22   38:aload_0         
	//   23   39:iconst_1        
	//   24   40:putfield        #143 <Field int state>
		} else
	//*  25   43:goto            57
		{
			bytebuffer.limit(j);
	//   26   46:aload_1         
	//   27   47:iload_3         
	//   28   48:invokevirtual   #150 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   29   51:pop             
			output(bytebuffer);
	//   30   52:aload_0         
	//   31   53:aload_1         
	//   32   54:invokespecial   #165 <Method void output(ByteBuffer)>
		}
		bytebuffer.limit(i);
	//   33   57:aload_1         
	//   34   58:iload_2         
	//   35   59:invokevirtual   #150 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   36   62:pop             
	//   37   63:return          
	}

	private void processSilence(ByteBuffer bytebuffer)
	{
		int i = bytebuffer.limit();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #75  <Method int ByteBuffer.limit()>
	//    2    4:istore_2        
		int j = findNoisePosition(bytebuffer);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #137 <Method int findNoisePosition(ByteBuffer)>
	//    6   10:istore_3        
		bytebuffer.limit(j);
	//    7   11:aload_1         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #150 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   10   16:pop             
		skippedFrames = skippedFrames + (long)(bytebuffer.remaining() / bytesPerFrame);
	//   11   17:aload_0         
	//   12   18:aload_0         
	//   13   19:getfield        #156 <Field long skippedFrames>
	//   14   22:aload_1         
	//   15   23:invokevirtual   #96  <Method int ByteBuffer.remaining()>
	//   16   26:aload_0         
	//   17   27:getfield        #90  <Field int bytesPerFrame>
	//   18   30:idiv            
	//   19   31:i2l             
	//   20   32:ladd            
	//   21   33:putfield        #156 <Field long skippedFrames>
		updatePaddingBuffer(bytebuffer, paddingBuffer, paddingSize);
	//   22   36:aload_0         
	//   23   37:aload_1         
	//   24   38:aload_0         
	//   25   39:getfield        #62  <Field byte[] paddingBuffer>
	//   26   42:aload_0         
	//   27   43:getfield        #154 <Field int paddingSize>
	//   28   46:invokespecial   #160 <Method void updatePaddingBuffer(ByteBuffer, byte[], int)>
		if(j < i)
	//*  29   49:iload_3         
	//*  30   50:iload_2         
	//*  31   51:icmpge          77
		{
			output(paddingBuffer, paddingSize);
	//   32   54:aload_0         
	//   33   55:aload_0         
	//   34   56:getfield        #62  <Field byte[] paddingBuffer>
	//   35   59:aload_0         
	//   36   60:getfield        #154 <Field int paddingSize>
	//   37   63:invokespecial   #141 <Method void output(byte[], int)>
			state = 0;
	//   38   66:aload_0         
	//   39   67:iconst_0        
	//   40   68:putfield        #143 <Field int state>
			bytebuffer.limit(i);
	//   41   71:aload_1         
	//   42   72:iload_2         
	//   43   73:invokevirtual   #150 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   44   76:pop             
		}
	//   45   77:return          
	}

	private void updatePaddingBuffer(ByteBuffer bytebuffer, byte abyte0[], int i)
	{
		int j = Math.min(bytebuffer.remaining(), paddingSize);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #96  <Method int ByteBuffer.remaining()>
	//    2    4:aload_0         
	//    3    5:getfield        #154 <Field int paddingSize>
	//    4    8:invokestatic    #147 <Method int Math.min(int, int)>
	//    5   11:istore          4
		int k = paddingSize - j;
	//    6   13:aload_0         
	//    7   14:getfield        #154 <Field int paddingSize>
	//    8   17:iload           4
	//    9   19:isub            
	//   10   20:istore          5
		System.arraycopy(((Object) (abyte0)), i - k, ((Object) (paddingBuffer)), 0, k);
	//   11   22:aload_2         
	//   12   23:iload_3         
	//   13   24:iload           5
	//   14   26:isub            
	//   15   27:aload_0         
	//   16   28:getfield        #62  <Field byte[] paddingBuffer>
	//   17   31:iconst_0        
	//   18   32:iload           5
	//   19   34:invokestatic    #172 <Method void System.arraycopy(Object, int, Object, int, int)>
		bytebuffer.position(bytebuffer.limit() - j);
	//   20   37:aload_1         
	//   21   38:aload_1         
	//   22   39:invokevirtual   #75  <Method int ByteBuffer.limit()>
	//   23   42:iload           4
	//   24   44:isub            
	//   25   45:invokevirtual   #174 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   26   48:pop             
		bytebuffer.get(paddingBuffer, k, j);
	//   27   49:aload_1         
	//   28   50:aload_0         
	//   29   51:getfield        #62  <Field byte[] paddingBuffer>
	//   30   54:iload           5
	//   31   56:iload           4
	//   32   58:invokevirtual   #152 <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   33   61:pop             
	//   34   62:return          
	}

	public boolean configure(int i, int j, int k)
		throws AudioProcessor.UnhandledFormatException
	{
		if(k != 2)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:icmpeq          16
			throw new AudioProcessor.UnhandledFormatException(i, j, k);
	//    3    5:new             #178 <Class AudioProcessor$UnhandledFormatException>
	//    4    8:dup             
	//    5    9:iload_1         
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:invokespecial   #181 <Method void AudioProcessor$UnhandledFormatException(int, int, int)>
	//    9   15:athrow          
		if(sampleRateHz == i && channelCount == j)
	//*  10   16:aload_0         
	//*  11   17:getfield        #58  <Field int sampleRateHz>
	//*  12   20:iload_1         
	//*  13   21:icmpne          34
	//*  14   24:aload_0         
	//*  15   25:getfield        #56  <Field int channelCount>
	//*  16   28:iload_2         
	//*  17   29:icmpne          34
		{
			return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
		} else
		{
			sampleRateHz = i;
	//   20   34:aload_0         
	//   21   35:iload_1         
	//   22   36:putfield        #58  <Field int sampleRateHz>
			channelCount = j;
	//   23   39:aload_0         
	//   24   40:iload_2         
	//   25   41:putfield        #56  <Field int channelCount>
			bytesPerFrame = j * 2;
	//   26   44:aload_0         
	//   27   45:iload_2         
	//   28   46:iconst_2        
	//   29   47:imul            
	//   30   48:putfield        #90  <Field int bytesPerFrame>
			return true;
	//   31   51:iconst_1        
	//   32   52:ireturn         
		}
	}

	public void flush()
	{
		if(isActive())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #187 <Method boolean isActive()>
	//*   2    4:ifeq            74
		{
			int i = durationUsToFrames(0x249f0L) * bytesPerFrame;
	//    3    7:aload_0         
	//    4    8:ldc2w           #9   <Long 0x249f0L>
	//    5   11:invokespecial   #189 <Method int durationUsToFrames(long)>
	//    6   14:aload_0         
	//    7   15:getfield        #90  <Field int bytesPerFrame>
	//    8   18:imul            
	//    9   19:istore_1        
			if(maybeSilenceBuffer.length != i)
	//*  10   20:aload_0         
	//*  11   21:getfield        #60  <Field byte[] maybeSilenceBuffer>
	//*  12   24:arraylength     
	//*  13   25:iload_1         
	//*  14   26:icmpeq          36
				maybeSilenceBuffer = new byte[i];
	//   15   29:aload_0         
	//   16   30:iload_1         
	//   17   31:newarray        byte[]
	//   18   33:putfield        #60  <Field byte[] maybeSilenceBuffer>
			paddingSize = durationUsToFrames(20000L) * bytesPerFrame;
	//   19   36:aload_0         
	//   20   37:aload_0         
	//   21   38:ldc2w           #12  <Long 20000L>
	//   22   41:invokespecial   #189 <Method int durationUsToFrames(long)>
	//   23   44:aload_0         
	//   24   45:getfield        #90  <Field int bytesPerFrame>
	//   25   48:imul            
	//   26   49:putfield        #154 <Field int paddingSize>
			if(paddingBuffer.length != paddingSize)
	//*  27   52:aload_0         
	//*  28   53:getfield        #62  <Field byte[] paddingBuffer>
	//*  29   56:arraylength     
	//*  30   57:aload_0         
	//*  31   58:getfield        #154 <Field int paddingSize>
	//*  32   61:icmpeq          74
				paddingBuffer = new byte[paddingSize];
	//   33   64:aload_0         
	//   34   65:aload_0         
	//   35   66:getfield        #154 <Field int paddingSize>
	//   36   69:newarray        byte[]
	//   37   71:putfield        #62  <Field byte[] paddingBuffer>
		}
		state = 0;
	//   38   74:aload_0         
	//   39   75:iconst_0        
	//   40   76:putfield        #143 <Field int state>
		outputBuffer = EMPTY_BUFFER;
	//   41   79:aload_0         
	//   42   80:getstatic       #50  <Field ByteBuffer EMPTY_BUFFER>
	//   43   83:putfield        #54  <Field ByteBuffer outputBuffer>
		inputEnded = false;
	//   44   86:aload_0         
	//   45   87:iconst_0        
	//   46   88:putfield        #191 <Field boolean inputEnded>
		skippedFrames = 0L;
	//   47   91:aload_0         
	//   48   92:lconst_0        
	//   49   93:putfield        #156 <Field long skippedFrames>
		maybeSilenceBufferSize = 0;
	//   50   96:aload_0         
	//   51   97:iconst_0        
	//   52   98:putfield        #139 <Field int maybeSilenceBufferSize>
		hasOutputNoise = false;
	//   53  101:aload_0         
	//   54  102:iconst_0        
	//   55  103:putfield        #134 <Field boolean hasOutputNoise>
	//   56  106:return          
	}

	public ByteBuffer getOutput()
	{
		ByteBuffer bytebuffer = outputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ByteBuffer outputBuffer>
	//    2    4:astore_1        
		outputBuffer = EMPTY_BUFFER;
	//    3    5:aload_0         
	//    4    6:getstatic       #50  <Field ByteBuffer EMPTY_BUFFER>
	//    5    9:putfield        #54  <Field ByteBuffer outputBuffer>
		return bytebuffer;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	public int getOutputChannelCount()
	{
		return channelCount;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int channelCount>
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
	//    1    1:getfield        #58  <Field int sampleRateHz>
	//    2    4:ireturn         
	}

	public long getSkippedFrames()
	{
		return skippedFrames;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field long skippedFrames>
	//    2    4:lreturn         
	}

	public boolean isActive()
	{
		return sampleRateHz != -1 && enabled;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int sampleRateHz>
	//    2    4:iconst_m1       
	//    3    5:icmpeq          17
	//    4    8:aload_0         
	//    5    9:getfield        #200 <Field boolean enabled>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public boolean isEnded()
	{
		return inputEnded && outputBuffer == EMPTY_BUFFER;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field boolean inputEnded>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:getfield        #54  <Field ByteBuffer outputBuffer>
	//    5   11:getstatic       #50  <Field ByteBuffer EMPTY_BUFFER>
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
	//    2    2:putfield        #191 <Field boolean inputEnded>
		if(maybeSilenceBufferSize > 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #139 <Field int maybeSilenceBufferSize>
	//*   5    9:ifle            24
			output(maybeSilenceBuffer, maybeSilenceBufferSize);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #60  <Field byte[] maybeSilenceBuffer>
	//    9   17:aload_0         
	//   10   18:getfield        #139 <Field int maybeSilenceBufferSize>
	//   11   21:invokespecial   #141 <Method void output(byte[], int)>
		if(!hasOutputNoise)
	//*  12   24:aload_0         
	//*  13   25:getfield        #134 <Field boolean hasOutputNoise>
	//*  14   28:ifne            50
			skippedFrames = skippedFrames + (long)(paddingSize / bytesPerFrame);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #156 <Field long skippedFrames>
	//   18   36:aload_0         
	//   19   37:getfield        #154 <Field int paddingSize>
	//   20   40:aload_0         
	//   21   41:getfield        #90  <Field int bytesPerFrame>
	//   22   44:idiv            
	//   23   45:i2l             
	//   24   46:ladd            
	//   25   47:putfield        #156 <Field long skippedFrames>
	//   26   50:return          
	}

	public void queueInput(ByteBuffer bytebuffer)
	{
		do
		{
			if(!bytebuffer.hasRemaining() || outputBuffer.hasRemaining())
				break;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #206 <Method boolean ByteBuffer.hasRemaining()>
	//    2    4:ifeq            80
	//    3    7:aload_0         
	//    4    8:getfield        #54  <Field ByteBuffer outputBuffer>
	//    5   11:invokevirtual   #206 <Method boolean ByteBuffer.hasRemaining()>
	//    6   14:ifne            80
			switch(state)
	//*   7   17:aload_0         
	//*   8   18:getfield        #143 <Field int state>
			{
	//*   9   21:tableswitch     0 2: default 48
	//	               0 72
	//	               1 64
	//	               2 56
			default:
				throw new IllegalStateException();
	//   10   48:new             #208 <Class IllegalStateException>
	//   11   51:dup             
	//   12   52:invokespecial   #209 <Method void IllegalStateException()>
	//   13   55:athrow          

			case 2: // '\002'
				processSilence(bytebuffer);
	//   14   56:aload_0         
	//   15   57:aload_1         
	//   16   58:invokespecial   #211 <Method void processSilence(ByteBuffer)>
				break;

	//*  17   61:goto            0
			case 1: // '\001'
				processMaybeSilence(bytebuffer);
	//   18   64:aload_0         
	//   19   65:aload_1         
	//   20   66:invokespecial   #213 <Method void processMaybeSilence(ByteBuffer)>
				break;

	//*  21   69:goto            0
			case 0: // '\0'
				processNoisy(bytebuffer);
	//   22   72:aload_0         
	//   23   73:aload_1         
	//   24   74:invokespecial   #215 <Method void processNoisy(ByteBuffer)>
				break;
			}
		} while(true);
	//*  25   77:goto            0
	//   26   80:return          
	}

	public void reset()
	{
		enabled = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #200 <Field boolean enabled>
		flush();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #218 <Method void flush()>
		buffer = EMPTY_BUFFER;
	//    5    9:aload_0         
	//    6   10:getstatic       #50  <Field ByteBuffer EMPTY_BUFFER>
	//    7   13:putfield        #52  <Field ByteBuffer buffer>
		channelCount = -1;
	//    8   16:aload_0         
	//    9   17:iconst_m1       
	//   10   18:putfield        #56  <Field int channelCount>
		sampleRateHz = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #58  <Field int sampleRateHz>
		paddingSize = 0;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #154 <Field int paddingSize>
		maybeSilenceBuffer = new byte[0];
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:newarray        byte[]
	//   20   35:putfield        #60  <Field byte[] maybeSilenceBuffer>
		paddingBuffer = new byte[0];
	//   21   38:aload_0         
	//   22   39:iconst_0        
	//   23   40:newarray        byte[]
	//   24   42:putfield        #62  <Field byte[] paddingBuffer>
	//   25   45:return          
	}

	public void setEnabled(boolean flag)
	{
		enabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #200 <Field boolean enabled>
		flush();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #218 <Method void flush()>
	//    5    9:return          
	}

	private static final long MINIMUM_SILENCE_DURATION_US = 0x249f0L;
	private static final long PADDING_SILENCE_US = 20000L;
	private static final short SILENCE_THRESHOLD_LEVEL = 1024;
	private static final byte SILENCE_THRESHOLD_LEVEL_MSB = 4;
	private static final int STATE_MAYBE_SILENT = 1;
	private static final int STATE_NOISY = 0;
	private static final int STATE_SILENT = 2;
	private ByteBuffer buffer;
	private int bytesPerFrame;
	private int channelCount;
	private boolean enabled;
	private boolean hasOutputNoise;
	private boolean inputEnded;
	private byte maybeSilenceBuffer[];
	private int maybeSilenceBufferSize;
	private ByteBuffer outputBuffer;
	private byte paddingBuffer[];
	private int paddingSize;
	private int sampleRateHz;
	private long skippedFrames;
	private int state;
}
