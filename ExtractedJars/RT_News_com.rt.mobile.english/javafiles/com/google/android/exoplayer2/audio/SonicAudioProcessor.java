// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.nio.*;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioProcessor, Sonic

public final class SonicAudioProcessor
	implements AudioProcessor
{

	public SonicAudioProcessor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		speed = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #45  <Field float speed>
		pitch = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #47  <Field float pitch>
		channelCount = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #49  <Field int channelCount>
		sampleRateHz = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #51  <Field int sampleRateHz>
		outputSampleRateHz = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #53  <Field int outputSampleRateHz>
		buffer = EMPTY_BUFFER;
	//   17   29:aload_0         
	//   18   30:getstatic       #56  <Field ByteBuffer EMPTY_BUFFER>
	//   19   33:putfield        #58  <Field ByteBuffer buffer>
		shortBuffer = buffer.asShortBuffer();
	//   20   36:aload_0         
	//   21   37:aload_0         
	//   22   38:getfield        #58  <Field ByteBuffer buffer>
	//   23   41:invokevirtual   #64  <Method ShortBuffer ByteBuffer.asShortBuffer()>
	//   24   44:putfield        #66  <Field ShortBuffer shortBuffer>
		outputBuffer = EMPTY_BUFFER;
	//   25   47:aload_0         
	//   26   48:getstatic       #56  <Field ByteBuffer EMPTY_BUFFER>
	//   27   51:putfield        #68  <Field ByteBuffer outputBuffer>
		pendingOutputSampleRateHz = -1;
	//   28   54:aload_0         
	//   29   55:iconst_m1       
	//   30   56:putfield        #70  <Field int pendingOutputSampleRateHz>
	//   31   59:return          
	}

	public boolean configure(int i, int j, int k)
		throws AudioProcessor.UnhandledFormatException
	{
		if(k != 2)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:icmpeq          16
			throw new AudioProcessor.UnhandledFormatException(i, j, k);
	//    3    5:new             #75  <Class AudioProcessor$UnhandledFormatException>
	//    4    8:dup             
	//    5    9:iload_1         
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:invokespecial   #78  <Method void AudioProcessor$UnhandledFormatException(int, int, int)>
	//    9   15:athrow          
		if(pendingOutputSampleRateHz == -1)
	//*  10   16:aload_0         
	//*  11   17:getfield        #70  <Field int pendingOutputSampleRateHz>
	//*  12   20:iconst_m1       
	//*  13   21:icmpne          29
			k = i;
	//   14   24:iload_1         
	//   15   25:istore_3        
		else
	//*  16   26:goto            34
			k = pendingOutputSampleRateHz;
	//   17   29:aload_0         
	//   18   30:getfield        #70  <Field int pendingOutputSampleRateHz>
	//   19   33:istore_3        
		if(sampleRateHz == i && channelCount == j && outputSampleRateHz == k)
	//*  20   34:aload_0         
	//*  21   35:getfield        #51  <Field int sampleRateHz>
	//*  22   38:iload_1         
	//*  23   39:icmpne          60
	//*  24   42:aload_0         
	//*  25   43:getfield        #49  <Field int channelCount>
	//*  26   46:iload_2         
	//*  27   47:icmpne          60
	//*  28   50:aload_0         
	//*  29   51:getfield        #53  <Field int outputSampleRateHz>
	//*  30   54:iload_3         
	//*  31   55:icmpne          60
		{
			return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
		} else
		{
			sampleRateHz = i;
	//   34   60:aload_0         
	//   35   61:iload_1         
	//   36   62:putfield        #51  <Field int sampleRateHz>
			channelCount = j;
	//   37   65:aload_0         
	//   38   66:iload_2         
	//   39   67:putfield        #49  <Field int channelCount>
			outputSampleRateHz = k;
	//   40   70:aload_0         
	//   41   71:iload_3         
	//   42   72:putfield        #53  <Field int outputSampleRateHz>
			sonic = null;
	//   43   75:aload_0         
	//   44   76:aconst_null     
	//   45   77:putfield        #80  <Field Sonic sonic>
			return true;
	//   46   80:iconst_1        
	//   47   81:ireturn         
		}
	}

	public void flush()
	{
		if(isActive())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #86  <Method boolean isActive()>
	//*   2    4:ifeq            55
			if(sonic == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #80  <Field Sonic sonic>
	//*   5   11:ifnonnull       48
				sonic = new Sonic(sampleRateHz, channelCount, speed, pitch, outputSampleRateHz);
	//    6   14:aload_0         
	//    7   15:new             #88  <Class Sonic>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:getfield        #51  <Field int sampleRateHz>
	//   11   23:aload_0         
	//   12   24:getfield        #49  <Field int channelCount>
	//   13   27:aload_0         
	//   14   28:getfield        #45  <Field float speed>
	//   15   31:aload_0         
	//   16   32:getfield        #47  <Field float pitch>
	//   17   35:aload_0         
	//   18   36:getfield        #53  <Field int outputSampleRateHz>
	//   19   39:invokespecial   #91  <Method void Sonic(int, int, float, float, int)>
	//   20   42:putfield        #80  <Field Sonic sonic>
			else
	//*  21   45:goto            55
				sonic.flush();
	//   22   48:aload_0         
	//   23   49:getfield        #80  <Field Sonic sonic>
	//   24   52:invokevirtual   #93  <Method void Sonic.flush()>
		outputBuffer = EMPTY_BUFFER;
	//   25   55:aload_0         
	//   26   56:getstatic       #56  <Field ByteBuffer EMPTY_BUFFER>
	//   27   59:putfield        #68  <Field ByteBuffer outputBuffer>
		inputBytes = 0L;
	//   28   62:aload_0         
	//   29   63:lconst_0        
	//   30   64:putfield        #95  <Field long inputBytes>
		outputBytes = 0L;
	//   31   67:aload_0         
	//   32   68:lconst_0        
	//   33   69:putfield        #97  <Field long outputBytes>
		inputEnded = false;
	//   34   72:aload_0         
	//   35   73:iconst_0        
	//   36   74:putfield        #99  <Field boolean inputEnded>
	//   37   77:return          
	}

	public ByteBuffer getOutput()
	{
		ByteBuffer bytebuffer = outputBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field ByteBuffer outputBuffer>
	//    2    4:astore_1        
		outputBuffer = EMPTY_BUFFER;
	//    3    5:aload_0         
	//    4    6:getstatic       #56  <Field ByteBuffer EMPTY_BUFFER>
	//    5    9:putfield        #68  <Field ByteBuffer outputBuffer>
		return bytebuffer;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	public int getOutputChannelCount()
	{
		return channelCount;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int channelCount>
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
		return outputSampleRateHz;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int outputSampleRateHz>
	//    2    4:ireturn         
	}

	public boolean isActive()
	{
		return sampleRateHz != -1 && (Math.abs(speed - 1.0F) >= 0.01F || Math.abs(pitch - 1.0F) >= 0.01F || outputSampleRateHz != sampleRateHz);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int sampleRateHz>
	//    2    4:iconst_m1       
	//    3    5:icmpeq          51
	//    4    8:aload_0         
	//    5    9:getfield        #45  <Field float speed>
	//    6   12:fconst_1        
	//    7   13:fsub            
	//    8   14:invokestatic    #111 <Method float Math.abs(float)>
	//    9   17:ldc1            #9   <Float 0.01F>
	//   10   19:fcmpl           
	//   11   20:ifge            49
	//   12   23:aload_0         
	//   13   24:getfield        #47  <Field float pitch>
	//   14   27:fconst_1        
	//   15   28:fsub            
	//   16   29:invokestatic    #111 <Method float Math.abs(float)>
	//   17   32:ldc1            #9   <Float 0.01F>
	//   18   34:fcmpl           
	//   19   35:ifge            49
	//   20   38:aload_0         
	//   21   39:getfield        #53  <Field int outputSampleRateHz>
	//   22   42:aload_0         
	//   23   43:getfield        #51  <Field int sampleRateHz>
	//   24   46:icmpeq          51
	//   25   49:iconst_1        
	//   26   50:ireturn         
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	public boolean isEnded()
	{
		return inputEnded && (sonic == null || sonic.getFramesAvailable() == 0);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field boolean inputEnded>
	//    2    4:ifeq            26
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field Sonic sonic>
	//    5   11:ifnull          24
	//    6   14:aload_0         
	//    7   15:getfield        #80  <Field Sonic sonic>
	//    8   18:invokevirtual   #115 <Method int Sonic.getFramesAvailable()>
	//    9   21:ifne            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public void queueEndOfStream()
	{
		boolean flag;
		if(sonic != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field Sonic sonic>
	//*   2    4:ifnull          12
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
	//    9   15:invokestatic    #122 <Method void Assertions.checkState(boolean)>
		sonic.queueEndOfStream();
	//   10   18:aload_0         
	//   11   19:getfield        #80  <Field Sonic sonic>
	//   12   22:invokevirtual   #124 <Method void Sonic.queueEndOfStream()>
		inputEnded = true;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #99  <Field boolean inputEnded>
	//   16   30:return          
	}

	public void queueInput(ByteBuffer bytebuffer)
	{
		boolean flag;
		if(sonic != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field Sonic sonic>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		Assertions.checkState(flag);
	//    8   14:iload_3         
	//    9   15:invokestatic    #122 <Method void Assertions.checkState(boolean)>
		if(bytebuffer.hasRemaining())
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #129 <Method boolean ByteBuffer.hasRemaining()>
	//*  12   22:ifeq            67
		{
			ShortBuffer shortbuffer = bytebuffer.asShortBuffer();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #64  <Method ShortBuffer ByteBuffer.asShortBuffer()>
	//   15   29:astore          4
			int i = bytebuffer.remaining();
	//   16   31:aload_1         
	//   17   32:invokevirtual   #132 <Method int ByteBuffer.remaining()>
	//   18   35:istore_2        
			inputBytes = inputBytes + (long)i;
	//   19   36:aload_0         
	//   20   37:aload_0         
	//   21   38:getfield        #95  <Field long inputBytes>
	//   22   41:iload_2         
	//   23   42:i2l             
	//   24   43:ladd            
	//   25   44:putfield        #95  <Field long inputBytes>
			sonic.queueInput(shortbuffer);
	//   26   47:aload_0         
	//   27   48:getfield        #80  <Field Sonic sonic>
	//   28   51:aload           4
	//   29   53:invokevirtual   #135 <Method void Sonic.queueInput(ShortBuffer)>
			bytebuffer.position(bytebuffer.position() + i);
	//   30   56:aload_1         
	//   31   57:aload_1         
	//   32   58:invokevirtual   #138 <Method int ByteBuffer.position()>
	//   33   61:iload_2         
	//   34   62:iadd            
	//   35   63:invokevirtual   #141 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   36   66:pop             
		}
		int j = sonic.getFramesAvailable() * channelCount * 2;
	//   37   67:aload_0         
	//   38   68:getfield        #80  <Field Sonic sonic>
	//   39   71:invokevirtual   #115 <Method int Sonic.getFramesAvailable()>
	//   40   74:aload_0         
	//   41   75:getfield        #49  <Field int channelCount>
	//   42   78:imul            
	//   43   79:iconst_2        
	//   44   80:imul            
	//   45   81:istore_2        
		if(j > 0)
	//*  46   82:iload_2         
	//*  47   83:ifle            180
		{
			if(buffer.capacity() < j)
	//*  48   86:aload_0         
	//*  49   87:getfield        #58  <Field ByteBuffer buffer>
	//*  50   90:invokevirtual   #144 <Method int ByteBuffer.capacity()>
	//*  51   93:iload_2         
	//*  52   94:icmpge          125
			{
				buffer = ByteBuffer.allocateDirect(j).order(ByteOrder.nativeOrder());
	//   53   97:aload_0         
	//   54   98:iload_2         
	//   55   99:invokestatic    #148 <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//   56  102:invokestatic    #154 <Method ByteOrder ByteOrder.nativeOrder()>
	//   57  105:invokevirtual   #158 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   58  108:putfield        #58  <Field ByteBuffer buffer>
				shortBuffer = buffer.asShortBuffer();
	//   59  111:aload_0         
	//   60  112:aload_0         
	//   61  113:getfield        #58  <Field ByteBuffer buffer>
	//   62  116:invokevirtual   #64  <Method ShortBuffer ByteBuffer.asShortBuffer()>
	//   63  119:putfield        #66  <Field ShortBuffer shortBuffer>
			} else
	//*  64  122:goto            141
			{
				buffer.clear();
	//   65  125:aload_0         
	//   66  126:getfield        #58  <Field ByteBuffer buffer>
	//   67  129:invokevirtual   #162 <Method java.nio.Buffer ByteBuffer.clear()>
	//   68  132:pop             
				shortBuffer.clear();
	//   69  133:aload_0         
	//   70  134:getfield        #66  <Field ShortBuffer shortBuffer>
	//   71  137:invokevirtual   #165 <Method java.nio.Buffer ShortBuffer.clear()>
	//   72  140:pop             
			}
			sonic.getOutput(shortBuffer);
	//   73  141:aload_0         
	//   74  142:getfield        #80  <Field Sonic sonic>
	//   75  145:aload_0         
	//   76  146:getfield        #66  <Field ShortBuffer shortBuffer>
	//   77  149:invokevirtual   #167 <Method void Sonic.getOutput(ShortBuffer)>
			outputBytes = outputBytes + (long)j;
	//   78  152:aload_0         
	//   79  153:aload_0         
	//   80  154:getfield        #97  <Field long outputBytes>
	//   81  157:iload_2         
	//   82  158:i2l             
	//   83  159:ladd            
	//   84  160:putfield        #97  <Field long outputBytes>
			buffer.limit(j);
	//   85  163:aload_0         
	//   86  164:getfield        #58  <Field ByteBuffer buffer>
	//   87  167:iload_2         
	//   88  168:invokevirtual   #170 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   89  171:pop             
			outputBuffer = buffer;
	//   90  172:aload_0         
	//   91  173:aload_0         
	//   92  174:getfield        #58  <Field ByteBuffer buffer>
	//   93  177:putfield        #68  <Field ByteBuffer outputBuffer>
		}
	//   94  180:return          
	}

	public void reset()
	{
		speed = 1.0F;
	//    0    0:aload_0         
	//    1    1:fconst_1        
	//    2    2:putfield        #45  <Field float speed>
		pitch = 1.0F;
	//    3    5:aload_0         
	//    4    6:fconst_1        
	//    5    7:putfield        #47  <Field float pitch>
		channelCount = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #49  <Field int channelCount>
		sampleRateHz = -1;
	//    9   15:aload_0         
	//   10   16:iconst_m1       
	//   11   17:putfield        #51  <Field int sampleRateHz>
		outputSampleRateHz = -1;
	//   12   20:aload_0         
	//   13   21:iconst_m1       
	//   14   22:putfield        #53  <Field int outputSampleRateHz>
		buffer = EMPTY_BUFFER;
	//   15   25:aload_0         
	//   16   26:getstatic       #56  <Field ByteBuffer EMPTY_BUFFER>
	//   17   29:putfield        #58  <Field ByteBuffer buffer>
		shortBuffer = buffer.asShortBuffer();
	//   18   32:aload_0         
	//   19   33:aload_0         
	//   20   34:getfield        #58  <Field ByteBuffer buffer>
	//   21   37:invokevirtual   #64  <Method ShortBuffer ByteBuffer.asShortBuffer()>
	//   22   40:putfield        #66  <Field ShortBuffer shortBuffer>
		outputBuffer = EMPTY_BUFFER;
	//   23   43:aload_0         
	//   24   44:getstatic       #56  <Field ByteBuffer EMPTY_BUFFER>
	//   25   47:putfield        #68  <Field ByteBuffer outputBuffer>
		pendingOutputSampleRateHz = -1;
	//   26   50:aload_0         
	//   27   51:iconst_m1       
	//   28   52:putfield        #70  <Field int pendingOutputSampleRateHz>
		sonic = null;
	//   29   55:aload_0         
	//   30   56:aconst_null     
	//   31   57:putfield        #80  <Field Sonic sonic>
		inputBytes = 0L;
	//   32   60:aload_0         
	//   33   61:lconst_0        
	//   34   62:putfield        #95  <Field long inputBytes>
		outputBytes = 0L;
	//   35   65:aload_0         
	//   36   66:lconst_0        
	//   37   67:putfield        #97  <Field long outputBytes>
		inputEnded = false;
	//   38   70:aload_0         
	//   39   71:iconst_0        
	//   40   72:putfield        #99  <Field boolean inputEnded>
	//   41   75:return          
	}

	public long scaleDurationForSpeedup(long l)
	{
		if(outputBytes >= 1024L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field long outputBytes>
	//*   2    4:ldc2w           #174 <Long 1024L>
	//*   3    7:lcmp            
	//*   4    8:iflt            60
		{
			if(outputSampleRateHz == sampleRateHz)
	//*   5   11:aload_0         
	//*   6   12:getfield        #53  <Field int outputSampleRateHz>
	//*   7   15:aload_0         
	//*   8   16:getfield        #51  <Field int sampleRateHz>
	//*   9   19:icmpne          35
				return Util.scaleLargeTimestamp(l, inputBytes, outputBytes);
	//   10   22:lload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #95  <Field long inputBytes>
	//   13   27:aload_0         
	//   14   28:getfield        #97  <Field long outputBytes>
	//   15   31:invokestatic    #181 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   16   34:lreturn         
			else
				return Util.scaleLargeTimestamp(l, inputBytes * (long)outputSampleRateHz, outputBytes * (long)sampleRateHz);
	//   17   35:lload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #95  <Field long inputBytes>
	//   20   40:aload_0         
	//   21   41:getfield        #53  <Field int outputSampleRateHz>
	//   22   44:i2l             
	//   23   45:lmul            
	//   24   46:aload_0         
	//   25   47:getfield        #97  <Field long outputBytes>
	//   26   50:aload_0         
	//   27   51:getfield        #51  <Field int sampleRateHz>
	//   28   54:i2l             
	//   29   55:lmul            
	//   30   56:invokestatic    #181 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   31   59:lreturn         
		} else
		{
			return (long)((double)speed * (double)l);
	//   32   60:aload_0         
	//   33   61:getfield        #45  <Field float speed>
	//   34   64:f2d             
	//   35   65:lload_1         
	//   36   66:l2d             
	//   37   67:dmul            
	//   38   68:d2l             
	//   39   69:lreturn         
		}
	}

	public void setOutputSampleRateHz(int i)
	{
		pendingOutputSampleRateHz = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #70  <Field int pendingOutputSampleRateHz>
	//    3    5:return          
	}

	public float setPitch(float f)
	{
		f = Util.constrainValue(f, 0.1F, 8F);
	//    0    0:fload_1         
	//    1    1:ldc1            #14  <Float 0.1F>
	//    2    3:ldc1            #11  <Float 8F>
	//    3    5:invokestatic    #188 <Method float Util.constrainValue(float, float, float)>
	//    4    8:fstore_1        
		if(pitch != f)
	//*   5    9:aload_0         
	//*   6   10:getfield        #47  <Field float pitch>
	//*   7   13:fload_1         
	//*   8   14:fcmpl           
	//*   9   15:ifeq            28
		{
			pitch = f;
	//   10   18:aload_0         
	//   11   19:fload_1         
	//   12   20:putfield        #47  <Field float pitch>
			sonic = null;
	//   13   23:aload_0         
	//   14   24:aconst_null     
	//   15   25:putfield        #80  <Field Sonic sonic>
		}
		flush();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #189 <Method void flush()>
		return f;
	//   18   32:fload_1         
	//   19   33:freturn         
	}

	public float setSpeed(float f)
	{
		f = Util.constrainValue(f, 0.1F, 8F);
	//    0    0:fload_1         
	//    1    1:ldc1            #14  <Float 0.1F>
	//    2    3:ldc1            #11  <Float 8F>
	//    3    5:invokestatic    #188 <Method float Util.constrainValue(float, float, float)>
	//    4    8:fstore_1        
		if(speed != f)
	//*   5    9:aload_0         
	//*   6   10:getfield        #45  <Field float speed>
	//*   7   13:fload_1         
	//*   8   14:fcmpl           
	//*   9   15:ifeq            28
		{
			speed = f;
	//   10   18:aload_0         
	//   11   19:fload_1         
	//   12   20:putfield        #45  <Field float speed>
			sonic = null;
	//   13   23:aload_0         
	//   14   24:aconst_null     
	//   15   25:putfield        #80  <Field Sonic sonic>
		}
		flush();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #189 <Method void flush()>
		return f;
	//   18   32:fload_1         
	//   19   33:freturn         
	}

	private static final float CLOSE_THRESHOLD = 0.01F;
	public static final float MAXIMUM_PITCH = 8F;
	public static final float MAXIMUM_SPEED = 8F;
	public static final float MINIMUM_PITCH = 0.1F;
	public static final float MINIMUM_SPEED = 0.1F;
	private static final int MIN_BYTES_FOR_SPEEDUP_CALCULATION = 1024;
	public static final int SAMPLE_RATE_NO_CHANGE = -1;
	private ByteBuffer buffer;
	private int channelCount;
	private long inputBytes;
	private boolean inputEnded;
	private ByteBuffer outputBuffer;
	private long outputBytes;
	private int outputSampleRateHz;
	private int pendingOutputSampleRateHz;
	private float pitch;
	private int sampleRateHz;
	private ShortBuffer shortBuffer;
	private Sonic sonic;
	private float speed;
}
