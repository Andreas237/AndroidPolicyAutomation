// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioProcessor

final class TrimmingAudioProcessor
	implements AudioProcessor
{

	public TrimmingAudioProcessor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		buffer = EMPTY_BUFFER;
	//    2    4:aload_0         
	//    3    5:getstatic       #28  <Field ByteBuffer EMPTY_BUFFER>
	//    4    8:putfield        #30  <Field ByteBuffer buffer>
		outputBuffer = EMPTY_BUFFER;
	//    5   11:aload_0         
	//    6   12:getstatic       #28  <Field ByteBuffer EMPTY_BUFFER>
	//    7   15:putfield        #32  <Field ByteBuffer outputBuffer>
		channelCount = -1;
	//    8   18:aload_0         
	//    9   19:iconst_m1       
	//   10   20:putfield        #34  <Field int channelCount>
		sampleRateHz = -1;
	//   11   23:aload_0         
	//   12   24:iconst_m1       
	//   13   25:putfield        #36  <Field int sampleRateHz>
		endBuffer = new byte[0];
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:newarray        byte[]
	//   17   32:putfield        #38  <Field byte[] endBuffer>
	//   18   35:return          
	}

	public boolean configure(int i, int j, int k)
		throws AudioProcessor.UnhandledFormatException
	{
		if(k != 2)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:icmpeq          16
			throw new AudioProcessor.UnhandledFormatException(i, j, k);
	//    3    5:new             #43  <Class AudioProcessor$UnhandledFormatException>
	//    4    8:dup             
	//    5    9:iload_1         
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:invokespecial   #46  <Method void AudioProcessor$UnhandledFormatException(int, int, int)>
	//    9   15:athrow          
		channelCount = j;
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:putfield        #34  <Field int channelCount>
		sampleRateHz = i;
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:putfield        #36  <Field int sampleRateHz>
		endBuffer = new byte[trimEndFrames * j * 2];
	//   16   26:aload_0         
	//   17   27:aload_0         
	//   18   28:getfield        #48  <Field int trimEndFrames>
	//   19   31:iload_2         
	//   20   32:imul            
	//   21   33:iconst_2        
	//   22   34:imul            
	//   23   35:newarray        byte[]
	//   24   37:putfield        #38  <Field byte[] endBuffer>
		boolean flag1 = false;
	//   25   40:iconst_0        
	//   26   41:istore          5
		endBufferSize = 0;
	//   27   43:aload_0         
	//   28   44:iconst_0        
	//   29   45:putfield        #50  <Field int endBufferSize>
		pendingTrimStartBytes = trimStartFrames * j * 2;
	//   30   48:aload_0         
	//   31   49:aload_0         
	//   32   50:getfield        #52  <Field int trimStartFrames>
	//   33   53:iload_2         
	//   34   54:imul            
	//   35   55:iconst_2        
	//   36   56:imul            
	//   37   57:putfield        #54  <Field int pendingTrimStartBytes>
		boolean flag2 = isActive;
	//   38   60:aload_0         
	//   39   61:getfield        #56  <Field boolean isActive>
	//   40   64:istore          6
		boolean flag;
		if(trimStartFrames == 0 && trimEndFrames == 0)
	//*  41   66:aload_0         
	//*  42   67:getfield        #52  <Field int trimStartFrames>
	//*  43   70:ifne            89
	//*  44   73:aload_0         
	//*  45   74:getfield        #48  <Field int trimEndFrames>
	//*  46   77:ifeq            83
	//*  47   80:goto            89
			flag = false;
	//   48   83:iconst_0        
	//   49   84:istore          4
		else
	//*  50   86:goto            92
			flag = true;
	//   51   89:iconst_1        
	//   52   90:istore          4
		isActive = flag;
	//   53   92:aload_0         
	//   54   93:iload           4
	//   55   95:putfield        #56  <Field boolean isActive>
		flag = flag1;
	//   56   98:iload           5
	//   57  100:istore          4
		if(flag2 != isActive)
	//*  58  102:iload           6
	//*  59  104:aload_0         
	//*  60  105:getfield        #56  <Field boolean isActive>
	//*  61  108:icmpeq          114
			flag = true;
	//   62  111:iconst_1        
	//   63  112:istore          4
		return flag;
	//   64  114:iload           4
	//   65  116:ireturn         
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
	//    5    9:putfield        #60  <Field boolean inputEnded>
		pendingTrimStartBytes = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #54  <Field int pendingTrimStartBytes>
		endBufferSize = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #50  <Field int endBufferSize>
	//   12   22:return          
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
	//    1    1:getfield        #34  <Field int channelCount>
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
	//    1    1:getfield        #36  <Field int sampleRateHz>
	//    2    4:ireturn         
	}

	public boolean isActive()
	{
		return isActive;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean isActive>
	//    2    4:ireturn         
	}

	public boolean isEnded()
	{
		return inputEnded && outputBuffer == EMPTY_BUFFER;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean inputEnded>
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
	//    2    2:putfield        #60  <Field boolean inputEnded>
	//    3    5:return          
	}

	public void queueInput(ByteBuffer bytebuffer)
	{
		int j = bytebuffer.position();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #76  <Method int ByteBuffer.position()>
	//    2    4:istore_3        
		int i = bytebuffer.limit();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #79  <Method int ByteBuffer.limit()>
	//    5    9:istore_2        
		int k = i - j;
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:isub            
	//    9   13:istore          4
		int l = Math.min(k, pendingTrimStartBytes);
	//   10   15:iload           4
	//   11   17:aload_0         
	//   12   18:getfield        #54  <Field int pendingTrimStartBytes>
	//   13   21:invokestatic    #85  <Method int Math.min(int, int)>
	//   14   24:istore          5
		pendingTrimStartBytes = pendingTrimStartBytes - l;
	//   15   26:aload_0         
	//   16   27:aload_0         
	//   17   28:getfield        #54  <Field int pendingTrimStartBytes>
	//   18   31:iload           5
	//   19   33:isub            
	//   20   34:putfield        #54  <Field int pendingTrimStartBytes>
		bytebuffer.position(j + l);
	//   21   37:aload_1         
	//   22   38:iload_3         
	//   23   39:iload           5
	//   24   41:iadd            
	//   25   42:invokevirtual   #88  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   26   45:pop             
		if(pendingTrimStartBytes > 0)
	//*  27   46:aload_0         
	//*  28   47:getfield        #54  <Field int pendingTrimStartBytes>
	//*  29   50:ifle            54
			return;
	//   30   53:return          
		k -= l;
	//   31   54:iload           4
	//   32   56:iload           5
	//   33   58:isub            
	//   34   59:istore          4
		l = (endBufferSize + k) - endBuffer.length;
	//   35   61:aload_0         
	//   36   62:getfield        #50  <Field int endBufferSize>
	//   37   65:iload           4
	//   38   67:iadd            
	//   39   68:aload_0         
	//   40   69:getfield        #38  <Field byte[] endBuffer>
	//   41   72:arraylength     
	//   42   73:isub            
	//   43   74:istore          5
		if(buffer.capacity() < l)
	//*  44   76:aload_0         
	//*  45   77:getfield        #30  <Field ByteBuffer buffer>
	//*  46   80:invokevirtual   #91  <Method int ByteBuffer.capacity()>
	//*  47   83:iload           5
	//*  48   85:icmpge          106
			buffer = ByteBuffer.allocateDirect(l).order(ByteOrder.nativeOrder());
	//   49   88:aload_0         
	//   50   89:iload           5
	//   51   91:invokestatic    #95  <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//   52   94:invokestatic    #101 <Method ByteOrder ByteOrder.nativeOrder()>
	//   53   97:invokevirtual   #105 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   54  100:putfield        #30  <Field ByteBuffer buffer>
		else
	//*  55  103:goto            114
			buffer.clear();
	//   56  106:aload_0         
	//   57  107:getfield        #30  <Field ByteBuffer buffer>
	//   58  110:invokevirtual   #109 <Method java.nio.Buffer ByteBuffer.clear()>
	//   59  113:pop             
		j = Util.constrainValue(l, 0, endBufferSize);
	//   60  114:iload           5
	//   61  116:iconst_0        
	//   62  117:aload_0         
	//   63  118:getfield        #50  <Field int endBufferSize>
	//   64  121:invokestatic    #115 <Method int Util.constrainValue(int, int, int)>
	//   65  124:istore_3        
		buffer.put(endBuffer, 0, j);
	//   66  125:aload_0         
	//   67  126:getfield        #30  <Field ByteBuffer buffer>
	//   68  129:aload_0         
	//   69  130:getfield        #38  <Field byte[] endBuffer>
	//   70  133:iconst_0        
	//   71  134:iload_3         
	//   72  135:invokevirtual   #119 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//   73  138:pop             
		l = Util.constrainValue(l - j, 0, k);
	//   74  139:iload           5
	//   75  141:iload_3         
	//   76  142:isub            
	//   77  143:iconst_0        
	//   78  144:iload           4
	//   79  146:invokestatic    #115 <Method int Util.constrainValue(int, int, int)>
	//   80  149:istore          5
		bytebuffer.limit(bytebuffer.position() + l);
	//   81  151:aload_1         
	//   82  152:aload_1         
	//   83  153:invokevirtual   #76  <Method int ByteBuffer.position()>
	//   84  156:iload           5
	//   85  158:iadd            
	//   86  159:invokevirtual   #121 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   87  162:pop             
		buffer.put(bytebuffer);
	//   88  163:aload_0         
	//   89  164:getfield        #30  <Field ByteBuffer buffer>
	//   90  167:aload_1         
	//   91  168:invokevirtual   #124 <Method ByteBuffer ByteBuffer.put(ByteBuffer)>
	//   92  171:pop             
		bytebuffer.limit(i);
	//   93  172:aload_1         
	//   94  173:iload_2         
	//   95  174:invokevirtual   #121 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   96  177:pop             
		i = k - l;
	//   97  178:iload           4
	//   98  180:iload           5
	//   99  182:isub            
	//  100  183:istore_2        
		endBufferSize = endBufferSize - j;
	//  101  184:aload_0         
	//  102  185:aload_0         
	//  103  186:getfield        #50  <Field int endBufferSize>
	//  104  189:iload_3         
	//  105  190:isub            
	//  106  191:putfield        #50  <Field int endBufferSize>
		System.arraycopy(((Object) (endBuffer)), j, ((Object) (endBuffer)), 0, endBufferSize);
	//  107  194:aload_0         
	//  108  195:getfield        #38  <Field byte[] endBuffer>
	//  109  198:iload_3         
	//  110  199:aload_0         
	//  111  200:getfield        #38  <Field byte[] endBuffer>
	//  112  203:iconst_0        
	//  113  204:aload_0         
	//  114  205:getfield        #50  <Field int endBufferSize>
	//  115  208:invokestatic    #130 <Method void System.arraycopy(Object, int, Object, int, int)>
		bytebuffer.get(endBuffer, endBufferSize, i);
	//  116  211:aload_1         
	//  117  212:aload_0         
	//  118  213:getfield        #38  <Field byte[] endBuffer>
	//  119  216:aload_0         
	//  120  217:getfield        #50  <Field int endBufferSize>
	//  121  220:iload_2         
	//  122  221:invokevirtual   #133 <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//  123  224:pop             
		endBufferSize = endBufferSize + i;
	//  124  225:aload_0         
	//  125  226:aload_0         
	//  126  227:getfield        #50  <Field int endBufferSize>
	//  127  230:iload_2         
	//  128  231:iadd            
	//  129  232:putfield        #50  <Field int endBufferSize>
		buffer.flip();
	//  130  235:aload_0         
	//  131  236:getfield        #30  <Field ByteBuffer buffer>
	//  132  239:invokevirtual   #136 <Method java.nio.Buffer ByteBuffer.flip()>
	//  133  242:pop             
		outputBuffer = buffer;
	//  134  243:aload_0         
	//  135  244:aload_0         
	//  136  245:getfield        #30  <Field ByteBuffer buffer>
	//  137  248:putfield        #32  <Field ByteBuffer outputBuffer>
	//  138  251:return          
	}

	public void reset()
	{
		flush();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method void flush()>
		buffer = EMPTY_BUFFER;
	//    2    4:aload_0         
	//    3    5:getstatic       #28  <Field ByteBuffer EMPTY_BUFFER>
	//    4    8:putfield        #30  <Field ByteBuffer buffer>
		channelCount = -1;
	//    5   11:aload_0         
	//    6   12:iconst_m1       
	//    7   13:putfield        #34  <Field int channelCount>
		sampleRateHz = -1;
	//    8   16:aload_0         
	//    9   17:iconst_m1       
	//   10   18:putfield        #36  <Field int sampleRateHz>
		endBuffer = new byte[0];
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:newarray        byte[]
	//   14   25:putfield        #38  <Field byte[] endBuffer>
	//   15   28:return          
	}

	public void setTrimFrameCount(int i, int j)
	{
		trimStartFrames = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field int trimStartFrames>
		trimEndFrames = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #48  <Field int trimEndFrames>
	//    6   10:return          
	}

	private ByteBuffer buffer;
	private int channelCount;
	private byte endBuffer[];
	private int endBufferSize;
	private boolean inputEnded;
	private boolean isActive;
	private ByteBuffer outputBuffer;
	private int pendingTrimStartBytes;
	private int sampleRateHz;
	private int trimEndFrames;
	private int trimStartFrames;
}
