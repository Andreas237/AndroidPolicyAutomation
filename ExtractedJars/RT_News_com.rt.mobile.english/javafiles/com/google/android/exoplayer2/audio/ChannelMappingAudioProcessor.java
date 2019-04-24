// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioProcessor

final class ChannelMappingAudioProcessor
	implements AudioProcessor
{

	public ChannelMappingAudioProcessor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		buffer = EMPTY_BUFFER;
	//    2    4:aload_0         
	//    3    5:getstatic       #26  <Field ByteBuffer EMPTY_BUFFER>
	//    4    8:putfield        #28  <Field ByteBuffer buffer>
		outputBuffer = EMPTY_BUFFER;
	//    5   11:aload_0         
	//    6   12:getstatic       #26  <Field ByteBuffer EMPTY_BUFFER>
	//    7   15:putfield        #30  <Field ByteBuffer outputBuffer>
		channelCount = -1;
	//    8   18:aload_0         
	//    9   19:iconst_m1       
	//   10   20:putfield        #32  <Field int channelCount>
		sampleRateHz = -1;
	//   11   23:aload_0         
	//   12   24:iconst_m1       
	//   13   25:putfield        #34  <Field int sampleRateHz>
	//   14   28:return          
	}

	public boolean configure(int i, int j, int k)
		throws AudioProcessor.UnhandledFormatException
	{
		boolean flag = Arrays.equals(pendingOutputChannels, outputChannels) ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int[] pendingOutputChannels>
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field int[] outputChannels>
	//    4    8:invokestatic    #49  <Method boolean Arrays.equals(int[], int[])>
	//    5   11:iconst_1        
	//    6   12:ixor            
	//    7   13:istore          6
		outputChannels = pendingOutputChannels;
	//    8   15:aload_0         
	//    9   16:aload_0         
	//   10   17:getfield        #41  <Field int[] pendingOutputChannels>
	//   11   20:putfield        #43  <Field int[] outputChannels>
		if(outputChannels == null)
	//*  12   23:aload_0         
	//*  13   24:getfield        #43  <Field int[] outputChannels>
	//*  14   27:ifnonnull       38
		{
			active = false;
	//   15   30:aload_0         
	//   16   31:iconst_0        
	//   17   32:putfield        #51  <Field boolean active>
			return flag;
	//   18   35:iload           6
	//   19   37:ireturn         
		}
		if(k != 2)
	//*  20   38:iload_3         
	//*  21   39:iconst_2        
	//*  22   40:icmpeq          54
			throw new AudioProcessor.UnhandledFormatException(i, j, k);
	//   23   43:new             #39  <Class AudioProcessor$UnhandledFormatException>
	//   24   46:dup             
	//   25   47:iload_1         
	//   26   48:iload_2         
	//   27   49:iload_3         
	//   28   50:invokespecial   #54  <Method void AudioProcessor$UnhandledFormatException(int, int, int)>
	//   29   53:athrow          
		if(!flag && sampleRateHz == i && channelCount == j)
	//*  30   54:iload           6
	//*  31   56:ifne            77
	//*  32   59:aload_0         
	//*  33   60:getfield        #34  <Field int sampleRateHz>
	//*  34   63:iload_1         
	//*  35   64:icmpne          77
	//*  36   67:aload_0         
	//*  37   68:getfield        #32  <Field int channelCount>
	//*  38   71:iload_2         
	//*  39   72:icmpne          77
			return false;
	//   40   75:iconst_0        
	//   41   76:ireturn         
		sampleRateHz = i;
	//   42   77:aload_0         
	//   43   78:iload_1         
	//   44   79:putfield        #34  <Field int sampleRateHz>
		channelCount = j;
	//   45   82:aload_0         
	//   46   83:iload_2         
	//   47   84:putfield        #32  <Field int channelCount>
		if(j != outputChannels.length)
	//*  48   87:iload_2         
	//*  49   88:aload_0         
	//*  50   89:getfield        #43  <Field int[] outputChannels>
	//*  51   92:arraylength     
	//*  52   93:icmpeq          102
			flag = true;
	//   53   96:iconst_1        
	//   54   97:istore          6
		else
	//*  55   99:goto            105
			flag = false;
	//   56  102:iconst_0        
	//   57  103:istore          6
		active = flag;
	//   58  105:aload_0         
	//   59  106:iload           6
	//   60  108:putfield        #51  <Field boolean active>
		for(int l = 0; l < outputChannels.length; l++)
	//*  61  111:iconst_0        
	//*  62  112:istore          4
	//*  63  114:iload           4
	//*  64  116:aload_0         
	//*  65  117:getfield        #43  <Field int[] outputChannels>
	//*  66  120:arraylength     
	//*  67  121:icmpge          190
		{
			int i1 = outputChannels[l];
	//   68  124:aload_0         
	//   69  125:getfield        #43  <Field int[] outputChannels>
	//   70  128:iload           4
	//   71  130:iaload          
	//   72  131:istore          5
			if(i1 >= j)
	//*  73  133:iload           5
	//*  74  135:iload_2         
	//*  75  136:icmplt          150
				throw new AudioProcessor.UnhandledFormatException(i, j, k);
	//   76  139:new             #39  <Class AudioProcessor$UnhandledFormatException>
	//   77  142:dup             
	//   78  143:iload_1         
	//   79  144:iload_2         
	//   80  145:iload_3         
	//   81  146:invokespecial   #54  <Method void AudioProcessor$UnhandledFormatException(int, int, int)>
	//   82  149:athrow          
			boolean flag1 = active;
	//   83  150:aload_0         
	//   84  151:getfield        #51  <Field boolean active>
	//   85  154:istore          6
			if(i1 != l)
	//*  86  156:iload           5
	//*  87  158:iload           4
	//*  88  160:icmpeq          169
				i1 = 1;
	//   89  163:iconst_1        
	//   90  164:istore          5
			else
	//*  91  166:goto            172
				i1 = 0;
	//   92  169:iconst_0        
	//   93  170:istore          5
			active = i1 | flag1;
	//   94  172:aload_0         
	//   95  173:iload           5
	//   96  175:iload           6
	//   97  177:ior             
	//   98  178:putfield        #51  <Field boolean active>
		}

	//   99  181:iload           4
	//  100  183:iconst_1        
	//  101  184:iadd            
	//  102  185:istore          4
	//* 103  187:goto            114
		return true;
	//  104  190:iconst_1        
	//  105  191:ireturn         
	}

	public void flush()
	{
		outputBuffer = EMPTY_BUFFER;
	//    0    0:aload_0         
	//    1    1:getstatic       #26  <Field ByteBuffer EMPTY_BUFFER>
	//    2    4:putfield        #30  <Field ByteBuffer outputBuffer>
		inputEnded = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #58  <Field boolean inputEnded>
	//    6   12:return          
	}

	public ByteBuffer getOutput()
	{
		ByteBuffer bytebuffer = outputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ByteBuffer outputBuffer>
	//    2    4:astore_1        
		outputBuffer = EMPTY_BUFFER;
	//    3    5:aload_0         
	//    4    6:getstatic       #26  <Field ByteBuffer EMPTY_BUFFER>
	//    5    9:putfield        #30  <Field ByteBuffer outputBuffer>
		return bytebuffer;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	public int getOutputChannelCount()
	{
		if(outputChannels == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field int[] outputChannels>
	//*   2    4:ifnonnull       12
			return channelCount;
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field int channelCount>
	//    5   11:ireturn         
		else
			return outputChannels.length;
	//    6   12:aload_0         
	//    7   13:getfield        #43  <Field int[] outputChannels>
	//    8   16:arraylength     
	//    9   17:ireturn         
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
	//    1    1:getfield        #34  <Field int sampleRateHz>
	//    2    4:ireturn         
	}

	public boolean isActive()
	{
		return active;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean active>
	//    2    4:ireturn         
	}

	public boolean isEnded()
	{
		return inputEnded && outputBuffer == EMPTY_BUFFER;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean inputEnded>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field ByteBuffer outputBuffer>
	//    5   11:getstatic       #26  <Field ByteBuffer EMPTY_BUFFER>
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
	//    2    2:putfield        #58  <Field boolean inputEnded>
	//    3    5:return          
	}

	public void queueInput(ByteBuffer bytebuffer)
	{
		boolean flag;
		if(outputChannels != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field int[] outputChannels>
	//*   2    4:ifnull          13
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore          7
		else
	//*   5   10:goto            16
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore          7
		Assertions.checkState(flag);
	//    8   16:iload           7
	//    9   18:invokestatic    #76  <Method void Assertions.checkState(boolean)>
		int i = bytebuffer.position();
	//   10   21:aload_1         
	//   11   22:invokevirtual   #81  <Method int ByteBuffer.position()>
	//   12   25:istore_2        
		int l = bytebuffer.limit();
	//   13   26:aload_1         
	//   14   27:invokevirtual   #84  <Method int ByteBuffer.limit()>
	//   15   30:istore          4
		int j = ((l - i) / (channelCount * 2)) * outputChannels.length * 2;
	//   16   32:iload           4
	//   17   34:iload_2         
	//   18   35:isub            
	//   19   36:aload_0         
	//   20   37:getfield        #32  <Field int channelCount>
	//   21   40:iconst_2        
	//   22   41:imul            
	//   23   42:idiv            
	//   24   43:aload_0         
	//   25   44:getfield        #43  <Field int[] outputChannels>
	//   26   47:arraylength     
	//   27   48:imul            
	//   28   49:iconst_2        
	//   29   50:imul            
	//   30   51:istore_3        
		if(buffer.capacity() < j)
	//*  31   52:aload_0         
	//*  32   53:getfield        #28  <Field ByteBuffer buffer>
	//*  33   56:invokevirtual   #87  <Method int ByteBuffer.capacity()>
	//*  34   59:iload_3         
	//*  35   60:icmpge          80
			buffer = ByteBuffer.allocateDirect(j).order(ByteOrder.nativeOrder());
	//   36   63:aload_0         
	//   37   64:iload_3         
	//   38   65:invokestatic    #91  <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//   39   68:invokestatic    #97  <Method ByteOrder ByteOrder.nativeOrder()>
	//   40   71:invokevirtual   #101 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   41   74:putfield        #28  <Field ByteBuffer buffer>
		else
	//*  42   77:goto            88
			buffer.clear();
	//   43   80:aload_0         
	//   44   81:getfield        #28  <Field ByteBuffer buffer>
	//   45   84:invokevirtual   #105 <Method java.nio.Buffer ByteBuffer.clear()>
	//   46   87:pop             
		for(; i < l; i += channelCount * 2)
	//*  47   88:iload_2         
	//*  48   89:iload           4
	//*  49   91:icmpge          156
		{
			int ai[] = outputChannels;
	//   50   94:aload_0         
	//   51   95:getfield        #43  <Field int[] outputChannels>
	//   52   98:astore          8
			int i1 = ai.length;
	//   53  100:aload           8
	//   54  102:arraylength     
	//   55  103:istore          5
			for(int k = 0; k < i1; k++)
	//*  56  105:iconst_0        
	//*  57  106:istore_3        
	//*  58  107:iload_3         
	//*  59  108:iload           5
	//*  60  110:icmpge          144
			{
				int j1 = ai[k];
	//   61  113:aload           8
	//   62  115:iload_3         
	//   63  116:iaload          
	//   64  117:istore          6
				buffer.putShort(bytebuffer.getShort(j1 * 2 + i));
	//   65  119:aload_0         
	//   66  120:getfield        #28  <Field ByteBuffer buffer>
	//   67  123:aload_1         
	//   68  124:iload           6
	//   69  126:iconst_2        
	//   70  127:imul            
	//   71  128:iload_2         
	//   72  129:iadd            
	//   73  130:invokevirtual   #109 <Method short ByteBuffer.getShort(int)>
	//   74  133:invokevirtual   #113 <Method ByteBuffer ByteBuffer.putShort(short)>
	//   75  136:pop             
			}

	//   76  137:iload_3         
	//   77  138:iconst_1        
	//   78  139:iadd            
	//   79  140:istore_3        
		}

	//   80  141:goto            107
	//   81  144:iload_2         
	//   82  145:aload_0         
	//   83  146:getfield        #32  <Field int channelCount>
	//   84  149:iconst_2        
	//   85  150:imul            
	//   86  151:iadd            
	//   87  152:istore_2        
	//*  88  153:goto            88
		bytebuffer.position(l);
	//   89  156:aload_1         
	//   90  157:iload           4
	//   91  159:invokevirtual   #116 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   92  162:pop             
		buffer.flip();
	//   93  163:aload_0         
	//   94  164:getfield        #28  <Field ByteBuffer buffer>
	//   95  167:invokevirtual   #119 <Method java.nio.Buffer ByteBuffer.flip()>
	//   96  170:pop             
		outputBuffer = buffer;
	//   97  171:aload_0         
	//   98  172:aload_0         
	//   99  173:getfield        #28  <Field ByteBuffer buffer>
	//  100  176:putfield        #30  <Field ByteBuffer outputBuffer>
	//  101  179:return          
	}

	public void reset()
	{
		flush();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method void flush()>
		buffer = EMPTY_BUFFER;
	//    2    4:aload_0         
	//    3    5:getstatic       #26  <Field ByteBuffer EMPTY_BUFFER>
	//    4    8:putfield        #28  <Field ByteBuffer buffer>
		channelCount = -1;
	//    5   11:aload_0         
	//    6   12:iconst_m1       
	//    7   13:putfield        #32  <Field int channelCount>
		sampleRateHz = -1;
	//    8   16:aload_0         
	//    9   17:iconst_m1       
	//   10   18:putfield        #34  <Field int sampleRateHz>
		outputChannels = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #43  <Field int[] outputChannels>
		pendingOutputChannels = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #41  <Field int[] pendingOutputChannels>
		active = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #51  <Field boolean active>
	//   20   36:return          
	}

	public void setChannelMap(int ai[])
	{
		pendingOutputChannels = ai;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field int[] pendingOutputChannels>
	//    3    5:return          
	}

	private boolean active;
	private ByteBuffer buffer;
	private int channelCount;
	private boolean inputEnded;
	private ByteBuffer outputBuffer;
	private int outputChannels[];
	private int pendingOutputChannels[];
	private int sampleRateHz;
}
