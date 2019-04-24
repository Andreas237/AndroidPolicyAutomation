// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Assertions;
import java.nio.ShortBuffer;
import java.util.Arrays;

final class Sonic
{

	public Sonic(int i, int j, float f, float f1, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		inputSampleRateHz = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #42  <Field int inputSampleRateHz>
		channelCount = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #44  <Field int channelCount>
		speed = f;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #46  <Field float speed>
		pitch = f1;
	//   11   19:aload_0         
	//   12   20:fload           4
	//   13   22:putfield        #48  <Field float pitch>
		rate = (float)i / (float)k;
	//   14   25:aload_0         
	//   15   26:iload_1         
	//   16   27:i2f             
	//   17   28:iload           5
	//   18   30:i2f             
	//   19   31:fdiv            
	//   20   32:putfield        #50  <Field float rate>
		minPeriod = i / 400;
	//   21   35:aload_0         
	//   22   36:iload_1         
	//   23   37:sipush          400
	//   24   40:idiv            
	//   25   41:putfield        #52  <Field int minPeriod>
		maxPeriod = i / 65;
	//   26   44:aload_0         
	//   27   45:iload_1         
	//   28   46:bipush          65
	//   29   48:idiv            
	//   30   49:putfield        #54  <Field int maxPeriod>
		maxRequiredFrameCount = 2 * maxPeriod;
	//   31   52:aload_0         
	//   32   53:iconst_2        
	//   33   54:aload_0         
	//   34   55:getfield        #54  <Field int maxPeriod>
	//   35   58:imul            
	//   36   59:putfield        #56  <Field int maxRequiredFrameCount>
		downSampleBuffer = new short[maxRequiredFrameCount];
	//   37   62:aload_0         
	//   38   63:aload_0         
	//   39   64:getfield        #56  <Field int maxRequiredFrameCount>
	//   40   67:newarray        short[]
	//   41   69:putfield        #58  <Field short[] downSampleBuffer>
		inputBuffer = new short[maxRequiredFrameCount * j];
	//   42   72:aload_0         
	//   43   73:aload_0         
	//   44   74:getfield        #56  <Field int maxRequiredFrameCount>
	//   45   77:iload_2         
	//   46   78:imul            
	//   47   79:newarray        short[]
	//   48   81:putfield        #60  <Field short[] inputBuffer>
		outputBuffer = new short[maxRequiredFrameCount * j];
	//   49   84:aload_0         
	//   50   85:aload_0         
	//   51   86:getfield        #56  <Field int maxRequiredFrameCount>
	//   52   89:iload_2         
	//   53   90:imul            
	//   54   91:newarray        short[]
	//   55   93:putfield        #62  <Field short[] outputBuffer>
		pitchBuffer = new short[maxRequiredFrameCount * j];
	//   56   96:aload_0         
	//   57   97:aload_0         
	//   58   98:getfield        #56  <Field int maxRequiredFrameCount>
	//   59  101:iload_2         
	//   60  102:imul            
	//   61  103:newarray        short[]
	//   62  105:putfield        #64  <Field short[] pitchBuffer>
	//   63  108:return          
	}

	private void adjustRate(float f, int i)
	{
		if(outputFrameCount == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int outputFrameCount>
	//*   2    4:iload_2         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		int k = (int)((float)inputSampleRateHz / f);
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field int inputSampleRateHz>
	//    7   13:i2f             
	//    8   14:fload_1         
	//    9   15:fdiv            
	//   10   16:f2i             
	//   11   17:istore          4
		int j = inputSampleRateHz;
	//   12   19:aload_0         
	//   13   20:getfield        #42  <Field int inputSampleRateHz>
	//   14   23:istore_3        
		do
		{
			if(k <= 16384 && j <= 16384)
	//*  15   24:iload           4
	//*  16   26:sipush          16384
	//*  17   29:icmpgt          248
	//*  18   32:iload_3         
	//*  19   33:sipush          16384
	//*  20   36:icmple          42
	//*  21   39:goto            248
			{
				moveNewSamplesToPitchBuffer(i);
	//   22   42:aload_0         
	//   23   43:iload_2         
	//   24   44:invokespecial   #73  <Method void moveNewSamplesToPitchBuffer(int)>
				i = 0;
	//   25   47:iconst_0        
	//   26   48:istore_2        
				do
				{
					int l = pitchFrameCount;
	//   27   49:aload_0         
	//   28   50:getfield        #75  <Field int pitchFrameCount>
	//   29   53:istore          5
					boolean flag = true;
	//   30   55:iconst_1        
	//   31   56:istore          6
					if(i < l - 1)
	//*  32   58:iload_2         
	//*  33   59:iload           5
	//*  34   61:iconst_1        
	//*  35   62:isub            
	//*  36   63:icmpge          237
					{
						while((oldRatePosition + 1) * k > newRatePosition * j) 
	//*  37   66:aload_0         
	//*  38   67:getfield        #77  <Field int oldRatePosition>
	//*  39   70:iconst_1        
	//*  40   71:iadd            
	//*  41   72:iload           4
	//*  42   74:imul            
	//*  43   75:aload_0         
	//*  44   76:getfield        #79  <Field int newRatePosition>
	//*  45   79:iload_3         
	//*  46   80:imul            
	//*  47   81:icmple          182
						{
							outputBuffer = ensureSpaceForAdditionalFrames(outputBuffer, outputFrameCount, 1);
	//   48   84:aload_0         
	//   49   85:aload_0         
	//   50   86:aload_0         
	//   51   87:getfield        #62  <Field short[] outputBuffer>
	//   52   90:aload_0         
	//   53   91:getfield        #69  <Field int outputFrameCount>
	//   54   94:iconst_1        
	//   55   95:invokespecial   #83  <Method short[] ensureSpaceForAdditionalFrames(short[], int, int)>
	//   56   98:putfield        #62  <Field short[] outputBuffer>
							for(int i1 = 0; i1 < channelCount; i1++)
	//*  57  101:iconst_0        
	//*  58  102:istore          5
	//*  59  104:iload           5
	//*  60  106:aload_0         
	//*  61  107:getfield        #44  <Field int channelCount>
	//*  62  110:icmpge          159
								outputBuffer[outputFrameCount * channelCount + i1] = interpolate(pitchBuffer, channelCount * i + i1, j, k);
	//   63  113:aload_0         
	//   64  114:getfield        #62  <Field short[] outputBuffer>
	//   65  117:aload_0         
	//   66  118:getfield        #69  <Field int outputFrameCount>
	//   67  121:aload_0         
	//   68  122:getfield        #44  <Field int channelCount>
	//   69  125:imul            
	//   70  126:iload           5
	//   71  128:iadd            
	//   72  129:aload_0         
	//   73  130:aload_0         
	//   74  131:getfield        #64  <Field short[] pitchBuffer>
	//   75  134:aload_0         
	//   76  135:getfield        #44  <Field int channelCount>
	//   77  138:iload_2         
	//   78  139:imul            
	//   79  140:iload           5
	//   80  142:iadd            
	//   81  143:iload_3         
	//   82  144:iload           4
	//   83  146:invokespecial   #87  <Method short interpolate(short[], int, int, int)>
	//   84  149:sastore         

	//   85  150:iload           5
	//   86  152:iconst_1        
	//   87  153:iadd            
	//   88  154:istore          5
	//*  89  156:goto            104
							newRatePosition = newRatePosition + 1;
	//   90  159:aload_0         
	//   91  160:aload_0         
	//   92  161:getfield        #79  <Field int newRatePosition>
	//   93  164:iconst_1        
	//   94  165:iadd            
	//   95  166:putfield        #79  <Field int newRatePosition>
							outputFrameCount = outputFrameCount + 1;
	//   96  169:aload_0         
	//   97  170:aload_0         
	//   98  171:getfield        #69  <Field int outputFrameCount>
	//   99  174:iconst_1        
	//  100  175:iadd            
	//  101  176:putfield        #69  <Field int outputFrameCount>
						}
	//* 102  179:goto            66
						oldRatePosition = oldRatePosition + 1;
	//  103  182:aload_0         
	//  104  183:aload_0         
	//  105  184:getfield        #77  <Field int oldRatePosition>
	//  106  187:iconst_1        
	//  107  188:iadd            
	//  108  189:putfield        #77  <Field int oldRatePosition>
						if(oldRatePosition == j)
	//* 109  192:aload_0         
	//* 110  193:getfield        #77  <Field int oldRatePosition>
	//* 111  196:iload_3         
	//* 112  197:icmpne          230
						{
							oldRatePosition = 0;
	//  113  200:aload_0         
	//  114  201:iconst_0        
	//  115  202:putfield        #77  <Field int oldRatePosition>
							if(newRatePosition != k)
	//* 116  205:aload_0         
	//* 117  206:getfield        #79  <Field int newRatePosition>
	//* 118  209:iload           4
	//* 119  211:icmpne          217
	//* 120  214:goto            220
								flag = false;
	//  121  217:iconst_0        
	//  122  218:istore          6
							Assertions.checkState(flag);
	//  123  220:iload           6
	//  124  222:invokestatic    #93  <Method void Assertions.checkState(boolean)>
							newRatePosition = 0;
	//  125  225:aload_0         
	//  126  226:iconst_0        
	//  127  227:putfield        #79  <Field int newRatePosition>
						}
						i++;
	//  128  230:iload_2         
	//  129  231:iconst_1        
	//  130  232:iadd            
	//  131  233:istore_2        
					} else
	//* 132  234:goto            49
					{
						removePitchFrames(pitchFrameCount - 1);
	//  133  237:aload_0         
	//  134  238:aload_0         
	//  135  239:getfield        #75  <Field int pitchFrameCount>
	//  136  242:iconst_1        
	//  137  243:isub            
	//  138  244:invokespecial   #96  <Method void removePitchFrames(int)>
						return;
	//  139  247:return          
					}
				} while(true);
			}
			k /= 2;
	//  140  248:iload           4
	//  141  250:iconst_2        
	//  142  251:idiv            
	//  143  252:istore          4
			j /= 2;
	//  144  254:iload_3         
	//  145  255:iconst_2        
	//  146  256:idiv            
	//  147  257:istore_3        
		} while(true);
	//  148  258:goto            24
	}

	private void changeSpeed(float f)
	{
		if(inputFrameCount < maxRequiredFrameCount)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field int inputFrameCount>
	//*   2    4:aload_0         
	//*   3    5:getfield        #56  <Field int maxRequiredFrameCount>
	//*   4    8:icmpge          12
			return;
	//    5   11:return          
		int k = inputFrameCount;
	//    6   12:aload_0         
	//    7   13:getfield        #100 <Field int inputFrameCount>
	//    8   16:istore          4
		int j = 0;
	//    9   18:iconst_0        
	//   10   19:istore_3        
		int i;
		do
		{
			if(remainingInputToCopyFrameCount > 0)
	//*  11   20:aload_0         
	//*  12   21:getfield        #102 <Field int remainingInputToCopyFrameCount>
	//*  13   24:ifle            38
			{
				i = j + copyInputToOutput(j);
	//   14   27:iload_3         
	//   15   28:aload_0         
	//   16   29:iload_3         
	//   17   30:invokespecial   #106 <Method int copyInputToOutput(int)>
	//   18   33:iadd            
	//   19   34:istore_2        
			} else
	//*  20   35:goto            88
			{
				i = findPitchPeriod(inputBuffer, j);
	//   21   38:aload_0         
	//   22   39:aload_0         
	//   23   40:getfield        #60  <Field short[] inputBuffer>
	//   24   43:iload_3         
	//   25   44:invokespecial   #110 <Method int findPitchPeriod(short[], int)>
	//   26   47:istore_2        
				if((double)f > 1.0D)
	//*  27   48:fload_1         
	//*  28   49:f2d             
	//*  29   50:dconst_1        
	//*  30   51:dcmpl           
	//*  31   52:ifle            74
					i = j + (i + skipPitchPeriod(inputBuffer, j, f, i));
	//   32   55:iload_3         
	//   33   56:iload_2         
	//   34   57:aload_0         
	//   35   58:aload_0         
	//   36   59:getfield        #60  <Field short[] inputBuffer>
	//   37   62:iload_3         
	//   38   63:fload_1         
	//   39   64:iload_2         
	//   40   65:invokespecial   #114 <Method int skipPitchPeriod(short[], int, float, int)>
	//   41   68:iadd            
	//   42   69:iadd            
	//   43   70:istore_2        
				else
	//*  44   71:goto            88
					i = j + insertPitchPeriod(inputBuffer, j, f, i);
	//   45   74:iload_3         
	//   46   75:aload_0         
	//   47   76:aload_0         
	//   48   77:getfield        #60  <Field short[] inputBuffer>
	//   49   80:iload_3         
	//   50   81:fload_1         
	//   51   82:iload_2         
	//   52   83:invokespecial   #117 <Method int insertPitchPeriod(short[], int, float, int)>
	//   53   86:iadd            
	//   54   87:istore_2        
			}
			j = i;
	//   55   88:iload_2         
	//   56   89:istore_3        
		} while(maxRequiredFrameCount + i <= k);
	//   57   90:aload_0         
	//   58   91:getfield        #56  <Field int maxRequiredFrameCount>
	//   59   94:iload_2         
	//   60   95:iadd            
	//   61   96:iload           4
	//   62   98:icmple          20
		removeProcessedInputFrames(i);
	//   63  101:aload_0         
	//   64  102:iload_2         
	//   65  103:invokespecial   #120 <Method void removeProcessedInputFrames(int)>
	//   66  106:return          
	}

	private int copyInputToOutput(int i)
	{
		int j = Math.min(maxRequiredFrameCount, remainingInputToCopyFrameCount);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int maxRequiredFrameCount>
	//    2    4:aload_0         
	//    3    5:getfield        #102 <Field int remainingInputToCopyFrameCount>
	//    4    8:invokestatic    #126 <Method int Math.min(int, int)>
	//    5   11:istore_2        
		copyToOutput(inputBuffer, i, j);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #60  <Field short[] inputBuffer>
	//    9   17:iload_1         
	//   10   18:iload_2         
	//   11   19:invokespecial   #130 <Method void copyToOutput(short[], int, int)>
		remainingInputToCopyFrameCount = remainingInputToCopyFrameCount - j;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #102 <Field int remainingInputToCopyFrameCount>
	//   15   27:iload_2         
	//   16   28:isub            
	//   17   29:putfield        #102 <Field int remainingInputToCopyFrameCount>
		return j;
	//   18   32:iload_2         
	//   19   33:ireturn         
	}

	private void copyToOutput(short aword0[], int i, int j)
	{
		outputBuffer = ensureSpaceForAdditionalFrames(outputBuffer, outputFrameCount, j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #62  <Field short[] outputBuffer>
	//    4    6:aload_0         
	//    5    7:getfield        #69  <Field int outputFrameCount>
	//    6   10:iload_3         
	//    7   11:invokespecial   #83  <Method short[] ensureSpaceForAdditionalFrames(short[], int, int)>
	//    8   14:putfield        #62  <Field short[] outputBuffer>
		System.arraycopy(((Object) (aword0)), i * channelCount, ((Object) (outputBuffer)), outputFrameCount * channelCount, channelCount * j);
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:aload_0         
	//   12   20:getfield        #44  <Field int channelCount>
	//   13   23:imul            
	//   14   24:aload_0         
	//   15   25:getfield        #62  <Field short[] outputBuffer>
	//   16   28:aload_0         
	//   17   29:getfield        #69  <Field int outputFrameCount>
	//   18   32:aload_0         
	//   19   33:getfield        #44  <Field int channelCount>
	//   20   36:imul            
	//   21   37:aload_0         
	//   22   38:getfield        #44  <Field int channelCount>
	//   23   41:iload_3         
	//   24   42:imul            
	//   25   43:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
		outputFrameCount = outputFrameCount + j;
	//   26   46:aload_0         
	//   27   47:aload_0         
	//   28   48:getfield        #69  <Field int outputFrameCount>
	//   29   51:iload_3         
	//   30   52:iadd            
	//   31   53:putfield        #69  <Field int outputFrameCount>
	//   32   56:return          
	}

	private void downSampleInput(short aword0[], int i, int j)
	{
		int i1 = maxRequiredFrameCount / j;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int maxRequiredFrameCount>
	//    2    4:iload_3         
	//    3    5:idiv            
	//    4    6:istore          6
		int j1 = channelCount * j;
	//    5    8:aload_0         
	//    6    9:getfield        #44  <Field int channelCount>
	//    7   12:iload_3         
	//    8   13:imul            
	//    9   14:istore          7
		int k1 = channelCount;
	//   10   16:aload_0         
	//   11   17:getfield        #44  <Field int channelCount>
	//   12   20:istore          8
		for(j = 0; j < i1; j++)
	//*  13   22:iconst_0        
	//*  14   23:istore_3        
	//*  15   24:iload_3         
	//*  16   25:iload           6
	//*  17   27:icmpge          95
		{
			int k = 0;
	//   18   30:iconst_0        
	//   19   31:istore          4
			int l = k;
	//   20   33:iload           4
	//   21   35:istore          5
			for(; k < j1; k++)
	//*  22   37:iload           4
	//*  23   39:iload           7
	//*  24   41:icmpge          72
				l += ((int) (aword0[j * j1 + i * k1 + k]));
	//   25   44:iload           5
	//   26   46:aload_1         
	//   27   47:iload_3         
	//   28   48:iload           7
	//   29   50:imul            
	//   30   51:iload_2         
	//   31   52:iload           8
	//   32   54:imul            
	//   33   55:iadd            
	//   34   56:iload           4
	//   35   58:iadd            
	//   36   59:saload          
	//   37   60:iadd            
	//   38   61:istore          5

	//   39   63:iload           4
	//   40   65:iconst_1        
	//   41   66:iadd            
	//   42   67:istore          4
	//*  43   69:goto            37
			k = l / j1;
	//   44   72:iload           5
	//   45   74:iload           7
	//   46   76:idiv            
	//   47   77:istore          4
			downSampleBuffer[j] = (short)k;
	//   48   79:aload_0         
	//   49   80:getfield        #58  <Field short[] downSampleBuffer>
	//   50   83:iload_3         
	//   51   84:iload           4
	//   52   86:int2short       
	//   53   87:sastore         
		}

	//   54   88:iload_3         
	//   55   89:iconst_1        
	//   56   90:iadd            
	//   57   91:istore_3        
	//*  58   92:goto            24
	//   59   95:return          
	}

	private short[] ensureSpaceForAdditionalFrames(short aword0[], int i, int j)
	{
		int k = aword0.length / channelCount;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:aload_0         
	//    3    3:getfield        #44  <Field int channelCount>
	//    4    6:idiv            
	//    5    7:istore          4
		if(i + j <= k)
	//*   6    9:iload_2         
	//*   7   10:iload_3         
	//*   8   11:iadd            
	//*   9   12:iload           4
	//*  10   14:icmpgt          19
			return aword0;
	//   11   17:aload_1         
	//   12   18:areturn         
		else
			return Arrays.copyOf(aword0, ((3 * k) / 2 + j) * channelCount);
	//   13   19:aload_1         
	//   14   20:iconst_3        
	//   15   21:iload           4
	//   16   23:imul            
	//   17   24:iconst_2        
	//   18   25:idiv            
	//   19   26:iload_3         
	//   20   27:iadd            
	//   21   28:aload_0         
	//   22   29:getfield        #44  <Field int channelCount>
	//   23   32:imul            
	//   24   33:invokestatic    #143 <Method short[] Arrays.copyOf(short[], int)>
	//   25   36:areturn         
	}

	private int findPitchPeriod(short aword0[], int i)
	{
		int j;
		if(inputSampleRateHz > 4000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field int inputSampleRateHz>
	//*   2    4:sipush          4000
	//*   3    7:icmple          22
			j = inputSampleRateHz / 4000;
	//    4   10:aload_0         
	//    5   11:getfield        #42  <Field int inputSampleRateHz>
	//    6   14:sipush          4000
	//    7   17:idiv            
	//    8   18:istore_3        
		else
	//*   9   19:goto            24
			j = 1;
	//   10   22:iconst_1        
	//   11   23:istore_3        
		if(channelCount == 1 && j == 1)
	//*  12   24:aload_0         
	//*  13   25:getfield        #44  <Field int channelCount>
	//*  14   28:iconst_1        
	//*  15   29:icmpne          55
	//*  16   32:iload_3         
	//*  17   33:iconst_1        
	//*  18   34:icmpne          55
		{
			i = findPitchPeriodInRange(aword0, i, minPeriod, maxPeriod);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:iload_2         
	//   22   40:aload_0         
	//   23   41:getfield        #52  <Field int minPeriod>
	//   24   44:aload_0         
	//   25   45:getfield        #54  <Field int maxPeriod>
	//   26   48:invokespecial   #147 <Method int findPitchPeriodInRange(short[], int, int, int)>
	//   27   51:istore_2        
		} else
	//*  28   52:goto            195
		{
			downSampleInput(aword0, i, j);
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:iload_2         
	//   32   58:iload_3         
	//   33   59:invokespecial   #149 <Method void downSampleInput(short[], int, int)>
			int k = findPitchPeriodInRange(downSampleBuffer, 0, minPeriod / j, maxPeriod / j);
	//   34   62:aload_0         
	//   35   63:aload_0         
	//   36   64:getfield        #58  <Field short[] downSampleBuffer>
	//   37   67:iconst_0        
	//   38   68:aload_0         
	//   39   69:getfield        #52  <Field int minPeriod>
	//   40   72:iload_3         
	//   41   73:idiv            
	//   42   74:aload_0         
	//   43   75:getfield        #54  <Field int maxPeriod>
	//   44   78:iload_3         
	//   45   79:idiv            
	//   46   80:invokespecial   #147 <Method int findPitchPeriodInRange(short[], int, int, int)>
	//   47   83:istore          4
			if(j != 1)
	//*  48   85:iload_3         
	//*  49   86:iconst_1        
	//*  50   87:icmpeq          192
			{
				int l = k * j;
	//   51   90:iload           4
	//   52   92:iload_3         
	//   53   93:imul            
	//   54   94:istore          5
				j *= 4;
	//   55   96:iload_3         
	//   56   97:iconst_4        
	//   57   98:imul            
	//   58   99:istore_3        
				k = l - j;
	//   59  100:iload           5
	//   60  102:iload_3         
	//   61  103:isub            
	//   62  104:istore          4
				l += j;
	//   63  106:iload           5
	//   64  108:iload_3         
	//   65  109:iadd            
	//   66  110:istore          5
				j = k;
	//   67  112:iload           4
	//   68  114:istore_3        
				if(k < minPeriod)
	//*  69  115:iload           4
	//*  70  117:aload_0         
	//*  71  118:getfield        #52  <Field int minPeriod>
	//*  72  121:icmpge          129
					j = minPeriod;
	//   73  124:aload_0         
	//   74  125:getfield        #52  <Field int minPeriod>
	//   75  128:istore_3        
				k = l;
	//   76  129:iload           5
	//   77  131:istore          4
				if(l > maxPeriod)
	//*  78  133:iload           5
	//*  79  135:aload_0         
	//*  80  136:getfield        #54  <Field int maxPeriod>
	//*  81  139:icmple          148
					k = maxPeriod;
	//   82  142:aload_0         
	//   83  143:getfield        #54  <Field int maxPeriod>
	//   84  146:istore          4
				if(channelCount == 1)
	//*  85  148:aload_0         
	//*  86  149:getfield        #44  <Field int channelCount>
	//*  87  152:iconst_1        
	//*  88  153:icmpne          169
				{
					i = findPitchPeriodInRange(aword0, i, j, k);
	//   89  156:aload_0         
	//   90  157:aload_1         
	//   91  158:iload_2         
	//   92  159:iload_3         
	//   93  160:iload           4
	//   94  162:invokespecial   #147 <Method int findPitchPeriodInRange(short[], int, int, int)>
	//   95  165:istore_2        
				} else
	//*  96  166:goto            195
				{
					downSampleInput(aword0, i, 1);
	//   97  169:aload_0         
	//   98  170:aload_1         
	//   99  171:iload_2         
	//  100  172:iconst_1        
	//  101  173:invokespecial   #149 <Method void downSampleInput(short[], int, int)>
					i = findPitchPeriodInRange(downSampleBuffer, 0, j, k);
	//  102  176:aload_0         
	//  103  177:aload_0         
	//  104  178:getfield        #58  <Field short[] downSampleBuffer>
	//  105  181:iconst_0        
	//  106  182:iload_3         
	//  107  183:iload           4
	//  108  185:invokespecial   #147 <Method int findPitchPeriodInRange(short[], int, int, int)>
	//  109  188:istore_2        
				}
			} else
	//* 110  189:goto            195
			{
				i = k;
	//  111  192:iload           4
	//  112  194:istore_2        
			}
		}
		if(previousPeriodBetter(minDiff, maxDiff))
	//* 113  195:aload_0         
	//* 114  196:aload_0         
	//* 115  197:getfield        #151 <Field int minDiff>
	//* 116  200:aload_0         
	//* 117  201:getfield        #153 <Field int maxDiff>
	//* 118  204:invokespecial   #157 <Method boolean previousPeriodBetter(int, int)>
	//* 119  207:ifeq            218
			j = prevPeriod;
	//  120  210:aload_0         
	//  121  211:getfield        #159 <Field int prevPeriod>
	//  122  214:istore_3        
		else
	//* 123  215:goto            220
			j = i;
	//  124  218:iload_2         
	//  125  219:istore_3        
		prevMinDiff = minDiff;
	//  126  220:aload_0         
	//  127  221:aload_0         
	//  128  222:getfield        #151 <Field int minDiff>
	//  129  225:putfield        #161 <Field int prevMinDiff>
		prevPeriod = i;
	//  130  228:aload_0         
	//  131  229:iload_2         
	//  132  230:putfield        #159 <Field int prevPeriod>
		return j;
	//  133  233:iload_3         
	//  134  234:ireturn         
	}

	private int findPitchPeriodInRange(short aword0[], int i, int j, int k)
	{
		int l2 = i * channelCount;
	//    0    0:iload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field int channelCount>
	//    3    5:imul            
	//    4    6:istore          13
		int k1 = 1;
	//    5    8:iconst_1        
	//    6    9:istore          8
		int i1 = 0;
	//    7   11:iconst_0        
	//    8   12:istore          6
		int l = 255;
	//    9   14:sipush          255
	//   10   17:istore          5
		int j1 = i1;
	//   11   19:iload           6
	//   12   21:istore          7
		while(j <= k) 
	//*  13   23:iload_3         
	//*  14   24:iload           4
	//*  15   26:icmpgt          146
		{
			int l1 = 0;
	//   16   29:iconst_0        
	//   17   30:istore          9
			i = l1;
	//   18   32:iload           9
	//   19   34:istore_2        
			for(; l1 < j; l1++)
	//*  20   35:iload           9
	//*  21   37:iload_3         
	//*  22   38:icmpge          73
				i += Math.abs(aword0[l2 + l1] - aword0[l2 + j + l1]);
	//   23   41:iload_2         
	//   24   42:aload_1         
	//   25   43:iload           13
	//   26   45:iload           9
	//   27   47:iadd            
	//   28   48:saload          
	//   29   49:aload_1         
	//   30   50:iload           13
	//   31   52:iload_3         
	//   32   53:iadd            
	//   33   54:iload           9
	//   34   56:iadd            
	//   35   57:saload          
	//   36   58:isub            
	//   37   59:invokestatic    #164 <Method int Math.abs(int)>
	//   38   62:iadd            
	//   39   63:istore_2        

	//   40   64:iload           9
	//   41   66:iconst_1        
	//   42   67:iadd            
	//   43   68:istore          9
	//*  44   70:goto            35
			int i2 = k1;
	//   45   73:iload           8
	//   46   75:istore          10
			l1 = j1;
	//   47   77:iload           7
	//   48   79:istore          9
			if(i * j1 < k1 * j)
	//*  49   81:iload_2         
	//*  50   82:iload           7
	//*  51   84:imul            
	//*  52   85:iload           8
	//*  53   87:iload_3         
	//*  54   88:imul            
	//*  55   89:icmpge          98
			{
				l1 = j;
	//   56   92:iload_3         
	//   57   93:istore          9
				i2 = i;
	//   58   95:iload_2         
	//   59   96:istore          10
			}
			int k2 = i1;
	//   60   98:iload           6
	//   61  100:istore          12
			int j2 = l;
	//   62  102:iload           5
	//   63  104:istore          11
			if(i * l > i1 * j)
	//*  64  106:iload_2         
	//*  65  107:iload           5
	//*  66  109:imul            
	//*  67  110:iload           6
	//*  68  112:iload_3         
	//*  69  113:imul            
	//*  70  114:icmple          123
			{
				j2 = j;
	//   71  117:iload_3         
	//   72  118:istore          11
				k2 = i;
	//   73  120:iload_2         
	//   74  121:istore          12
			}
			j++;
	//   75  123:iload_3         
	//   76  124:iconst_1        
	//   77  125:iadd            
	//   78  126:istore_3        
			k1 = i2;
	//   79  127:iload           10
	//   80  129:istore          8
			j1 = l1;
	//   81  131:iload           9
	//   82  133:istore          7
			i1 = k2;
	//   83  135:iload           12
	//   84  137:istore          6
			l = j2;
	//   85  139:iload           11
	//   86  141:istore          5
		}
	//*  87  143:goto            23
		minDiff = k1 / j1;
	//   88  146:aload_0         
	//   89  147:iload           8
	//   90  149:iload           7
	//   91  151:idiv            
	//   92  152:putfield        #151 <Field int minDiff>
		maxDiff = i1 / l;
	//   93  155:aload_0         
	//   94  156:iload           6
	//   95  158:iload           5
	//   96  160:idiv            
	//   97  161:putfield        #153 <Field int maxDiff>
		return j1;
	//   98  164:iload           7
	//   99  166:ireturn         
	}

	private int insertPitchPeriod(short aword0[], int i, float f, int j)
	{
		int k;
		if(f < 0.5F)
	//*   0    0:fload_3         
	//*   1    1:ldc1            #165 <Float 0.5F>
	//*   2    3:fcmpg           
	//*   3    4:ifge            22
		{
			k = (int)(((float)j * f) / (1.0F - f));
	//    4    7:iload           4
	//    5    9:i2f             
	//    6   10:fload_3         
	//    7   11:fmul            
	//    8   12:fconst_1        
	//    9   13:fload_3         
	//   10   14:fsub            
	//   11   15:fdiv            
	//   12   16:f2i             
	//   13   17:istore          5
		} else
	//*  14   19:goto            44
		{
			remainingInputToCopyFrameCount = (int)(((float)j * (2.0F * f - 1.0F)) / (1.0F - f));
	//   15   22:aload_0         
	//   16   23:iload           4
	//   17   25:i2f             
	//   18   26:fconst_2        
	//   19   27:fload_3         
	//   20   28:fmul            
	//   21   29:fconst_1        
	//   22   30:fsub            
	//   23   31:fmul            
	//   24   32:fconst_1        
	//   25   33:fload_3         
	//   26   34:fsub            
	//   27   35:fdiv            
	//   28   36:f2i             
	//   29   37:putfield        #102 <Field int remainingInputToCopyFrameCount>
			k = j;
	//   30   40:iload           4
	//   31   42:istore          5
		}
		short aword1[] = outputBuffer;
	//   32   44:aload_0         
	//   33   45:getfield        #62  <Field short[] outputBuffer>
	//   34   48:astore          8
		int l = outputFrameCount;
	//   35   50:aload_0         
	//   36   51:getfield        #69  <Field int outputFrameCount>
	//   37   54:istore          6
		int i1 = j + k;
	//   38   56:iload           4
	//   39   58:iload           5
	//   40   60:iadd            
	//   41   61:istore          7
		outputBuffer = ensureSpaceForAdditionalFrames(aword1, l, i1);
	//   42   63:aload_0         
	//   43   64:aload_0         
	//   44   65:aload           8
	//   45   67:iload           6
	//   46   69:iload           7
	//   47   71:invokespecial   #83  <Method short[] ensureSpaceForAdditionalFrames(short[], int, int)>
	//   48   74:putfield        #62  <Field short[] outputBuffer>
		System.arraycopy(((Object) (aword0)), channelCount * i, ((Object) (outputBuffer)), outputFrameCount * channelCount, channelCount * j);
	//   49   77:aload_1         
	//   50   78:aload_0         
	//   51   79:getfield        #44  <Field int channelCount>
	//   52   82:iload_2         
	//   53   83:imul            
	//   54   84:aload_0         
	//   55   85:getfield        #62  <Field short[] outputBuffer>
	//   56   88:aload_0         
	//   57   89:getfield        #69  <Field int outputFrameCount>
	//   58   92:aload_0         
	//   59   93:getfield        #44  <Field int channelCount>
	//   60   96:imul            
	//   61   97:aload_0         
	//   62   98:getfield        #44  <Field int channelCount>
	//   63  101:iload           4
	//   64  103:imul            
	//   65  104:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
		overlapAdd(k, channelCount, outputBuffer, outputFrameCount + j, aword0, i + j, aword0, i);
	//   66  107:iload           5
	//   67  109:aload_0         
	//   68  110:getfield        #44  <Field int channelCount>
	//   69  113:aload_0         
	//   70  114:getfield        #62  <Field short[] outputBuffer>
	//   71  117:aload_0         
	//   72  118:getfield        #69  <Field int outputFrameCount>
	//   73  121:iload           4
	//   74  123:iadd            
	//   75  124:aload_1         
	//   76  125:iload_2         
	//   77  126:iload           4
	//   78  128:iadd            
	//   79  129:aload_1         
	//   80  130:iload_2         
	//   81  131:invokestatic    #169 <Method void overlapAdd(int, int, short[], int, short[], int, short[], int)>
		outputFrameCount = outputFrameCount + i1;
	//   82  134:aload_0         
	//   83  135:aload_0         
	//   84  136:getfield        #69  <Field int outputFrameCount>
	//   85  139:iload           7
	//   86  141:iadd            
	//   87  142:putfield        #69  <Field int outputFrameCount>
		return k;
	//   88  145:iload           5
	//   89  147:ireturn         
	}

	private short interpolate(short aword0[], int i, int j, int k)
	{
		short word0 = aword0[i];
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:saload          
	//    3    3:istore          5
		i = ((int) (aword0[i + channelCount]));
	//    4    5:aload_1         
	//    5    6:iload_2         
	//    6    7:aload_0         
	//    7    8:getfield        #44  <Field int channelCount>
	//    8   11:iadd            
	//    9   12:saload          
	//   10   13:istore_2        
		int j1 = newRatePosition;
	//   11   14:aload_0         
	//   12   15:getfield        #79  <Field int newRatePosition>
	//   13   18:istore          8
		int l = oldRatePosition;
	//   14   20:aload_0         
	//   15   21:getfield        #77  <Field int oldRatePosition>
	//   16   24:istore          6
		int i1 = (oldRatePosition + 1) * k;
	//   17   26:aload_0         
	//   18   27:getfield        #77  <Field int oldRatePosition>
	//   19   30:iconst_1        
	//   20   31:iadd            
	//   21   32:iload           4
	//   22   34:imul            
	//   23   35:istore          7
		j = i1 - j1 * j;
	//   24   37:iload           7
	//   25   39:iload           8
	//   26   41:iload_3         
	//   27   42:imul            
	//   28   43:isub            
	//   29   44:istore_3        
		k = i1 - l * k;
	//   30   45:iload           7
	//   31   47:iload           6
	//   32   49:iload           4
	//   33   51:imul            
	//   34   52:isub            
	//   35   53:istore          4
		return (short)((word0 * j + (k - j) * i) / k);
	//   36   55:iload           5
	//   37   57:iload_3         
	//   38   58:imul            
	//   39   59:iload           4
	//   40   61:iload_3         
	//   41   62:isub            
	//   42   63:iload_2         
	//   43   64:imul            
	//   44   65:iadd            
	//   45   66:iload           4
	//   46   68:idiv            
	//   47   69:int2short       
	//   48   70:ireturn         
	}

	private void moveNewSamplesToPitchBuffer(int i)
	{
		int j = outputFrameCount - i;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int outputFrameCount>
	//    2    4:iload_1         
	//    3    5:isub            
	//    4    6:istore_2        
		pitchBuffer = ensureSpaceForAdditionalFrames(pitchBuffer, pitchFrameCount, j);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:aload_0         
	//    8   10:getfield        #64  <Field short[] pitchBuffer>
	//    9   13:aload_0         
	//   10   14:getfield        #75  <Field int pitchFrameCount>
	//   11   17:iload_2         
	//   12   18:invokespecial   #83  <Method short[] ensureSpaceForAdditionalFrames(short[], int, int)>
	//   13   21:putfield        #64  <Field short[] pitchBuffer>
		System.arraycopy(((Object) (outputBuffer)), channelCount * i, ((Object) (pitchBuffer)), pitchFrameCount * channelCount, channelCount * j);
	//   14   24:aload_0         
	//   15   25:getfield        #62  <Field short[] outputBuffer>
	//   16   28:aload_0         
	//   17   29:getfield        #44  <Field int channelCount>
	//   18   32:iload_1         
	//   19   33:imul            
	//   20   34:aload_0         
	//   21   35:getfield        #64  <Field short[] pitchBuffer>
	//   22   38:aload_0         
	//   23   39:getfield        #75  <Field int pitchFrameCount>
	//   24   42:aload_0         
	//   25   43:getfield        #44  <Field int channelCount>
	//   26   46:imul            
	//   27   47:aload_0         
	//   28   48:getfield        #44  <Field int channelCount>
	//   29   51:iload_2         
	//   30   52:imul            
	//   31   53:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
		outputFrameCount = i;
	//   32   56:aload_0         
	//   33   57:iload_1         
	//   34   58:putfield        #69  <Field int outputFrameCount>
		pitchFrameCount = pitchFrameCount + j;
	//   35   61:aload_0         
	//   36   62:aload_0         
	//   37   63:getfield        #75  <Field int pitchFrameCount>
	//   38   66:iload_2         
	//   39   67:iadd            
	//   40   68:putfield        #75  <Field int pitchFrameCount>
	//   41   71:return          
	}

	private static void overlapAdd(int i, int j, short aword0[], int k, short aword1[], int l, short aword2[], int i1)
	{
		for(int j1 = 0; j1 < j; j1++)
	//*   0    0:iconst_0        
	//*   1    1:istore          8
	//*   2    3:iload           8
	//*   3    5:iload_1         
	//*   4    6:icmpge          106
		{
			int l1 = l * j + j1;
	//    5    9:iload           5
	//    6   11:iload_1         
	//    7   12:imul            
	//    8   13:iload           8
	//    9   15:iadd            
	//   10   16:istore          10
			int k1 = i1 * j + j1;
	//   11   18:iload           7
	//   12   20:iload_1         
	//   13   21:imul            
	//   14   22:iload           8
	//   15   24:iadd            
	//   16   25:istore          9
			int j2 = k * j + j1;
	//   17   27:iload_3         
	//   18   28:iload_1         
	//   19   29:imul            
	//   20   30:iload           8
	//   21   32:iadd            
	//   22   33:istore          12
			for(int i2 = 0; i2 < i; i2++)
	//*  23   35:iconst_0        
	//*  24   36:istore          11
	//*  25   38:iload           11
	//*  26   40:iload_0         
	//*  27   41:icmpge          97
			{
				aword0[j2] = (short)((aword1[l1] * (i - i2) + aword2[k1] * i2) / i);
	//   28   44:aload_2         
	//   29   45:iload           12
	//   30   47:aload           4
	//   31   49:iload           10
	//   32   51:saload          
	//   33   52:iload_0         
	//   34   53:iload           11
	//   35   55:isub            
	//   36   56:imul            
	//   37   57:aload           6
	//   38   59:iload           9
	//   39   61:saload          
	//   40   62:iload           11
	//   41   64:imul            
	//   42   65:iadd            
	//   43   66:iload_0         
	//   44   67:idiv            
	//   45   68:int2short       
	//   46   69:sastore         
				j2 += j;
	//   47   70:iload           12
	//   48   72:iload_1         
	//   49   73:iadd            
	//   50   74:istore          12
				l1 += j;
	//   51   76:iload           10
	//   52   78:iload_1         
	//   53   79:iadd            
	//   54   80:istore          10
				k1 += j;
	//   55   82:iload           9
	//   56   84:iload_1         
	//   57   85:iadd            
	//   58   86:istore          9
			}

	//   59   88:iload           11
	//   60   90:iconst_1        
	//   61   91:iadd            
	//   62   92:istore          11
		}

	//   63   94:goto            38
	//   64   97:iload           8
	//   65   99:iconst_1        
	//   66  100:iadd            
	//   67  101:istore          8
	//*  68  103:goto            3
	//   69  106:return          
	}

	private boolean previousPeriodBetter(int i, int j)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            38
		{
			if(prevPeriod == 0)
	//*   2    4:aload_0         
	//*   3    5:getfield        #159 <Field int prevPeriod>
	//*   4    8:ifne            13
				return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			if(j > i * 3)
	//*   7   13:iload_2         
	//*   8   14:iload_1         
	//*   9   15:iconst_3        
	//*  10   16:imul            
	//*  11   17:icmple          22
				return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
			return i * 2 > prevMinDiff * 3;
	//   14   22:iload_1         
	//   15   23:iconst_2        
	//   16   24:imul            
	//   17   25:aload_0         
	//   18   26:getfield        #161 <Field int prevMinDiff>
	//   19   29:iconst_3        
	//   20   30:imul            
	//   21   31:icmpgt          36
	//   22   34:iconst_0        
	//   23   35:ireturn         
	//   24   36:iconst_1        
	//   25   37:ireturn         
		} else
		{
			return false;
	//   26   38:iconst_0        
	//   27   39:ireturn         
		}
	}

	private void processStreamInput()
	{
		int i = outputFrameCount;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int outputFrameCount>
	//    2    4:istore          5
		float f = speed / pitch;
	//    3    6:aload_0         
	//    4    7:getfield        #46  <Field float speed>
	//    5   10:aload_0         
	//    6   11:getfield        #48  <Field float pitch>
	//    7   14:fdiv            
	//    8   15:fstore_3        
		float f1 = rate * pitch;
	//    9   16:aload_0         
	//   10   17:getfield        #50  <Field float rate>
	//   11   20:aload_0         
	//   12   21:getfield        #48  <Field float pitch>
	//   13   24:fmul            
	//   14   25:fstore          4
		double d = f;
	//   15   27:fload_3         
	//   16   28:f2d             
	//   17   29:dstore_1        
		if(d <= 1.0000100000000001D && d >= 0.99999000000000005D)
	//*  18   30:dload_1         
	//*  19   31:ldc2w           #171 <Double 1.0000100000000001D>
	//*  20   34:dcmpl           
	//*  21   35:ifgt            70
	//*  22   38:dload_1         
	//*  23   39:ldc2w           #173 <Double 0.99999000000000005D>
	//*  24   42:dcmpg           
	//*  25   43:ifge            49
	//*  26   46:goto            70
		{
			copyToOutput(inputBuffer, 0, inputFrameCount);
	//   27   49:aload_0         
	//   28   50:aload_0         
	//   29   51:getfield        #60  <Field short[] inputBuffer>
	//   30   54:iconst_0        
	//   31   55:aload_0         
	//   32   56:getfield        #100 <Field int inputFrameCount>
	//   33   59:invokespecial   #130 <Method void copyToOutput(short[], int, int)>
			inputFrameCount = 0;
	//   34   62:aload_0         
	//   35   63:iconst_0        
	//   36   64:putfield        #100 <Field int inputFrameCount>
		} else
	//*  37   67:goto            75
		{
			changeSpeed(f);
	//   38   70:aload_0         
	//   39   71:fload_3         
	//   40   72:invokespecial   #176 <Method void changeSpeed(float)>
		}
		if(f1 != 1.0F)
	//*  41   75:fload           4
	//*  42   77:fconst_1        
	//*  43   78:fcmpl           
	//*  44   79:ifeq            90
			adjustRate(f1, i);
	//   45   82:aload_0         
	//   46   83:fload           4
	//   47   85:iload           5
	//   48   87:invokespecial   #178 <Method void adjustRate(float, int)>
	//   49   90:return          
	}

	private void removePitchFrames(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            5
		{
			return;
	//    2    4:return          
		} else
		{
			System.arraycopy(((Object) (pitchBuffer)), channelCount * i, ((Object) (pitchBuffer)), 0, (pitchFrameCount - i) * channelCount);
	//    3    5:aload_0         
	//    4    6:getfield        #64  <Field short[] pitchBuffer>
	//    5    9:aload_0         
	//    6   10:getfield        #44  <Field int channelCount>
	//    7   13:iload_1         
	//    8   14:imul            
	//    9   15:aload_0         
	//   10   16:getfield        #64  <Field short[] pitchBuffer>
	//   11   19:iconst_0        
	//   12   20:aload_0         
	//   13   21:getfield        #75  <Field int pitchFrameCount>
	//   14   24:iload_1         
	//   15   25:isub            
	//   16   26:aload_0         
	//   17   27:getfield        #44  <Field int channelCount>
	//   18   30:imul            
	//   19   31:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
			pitchFrameCount = pitchFrameCount - i;
	//   20   34:aload_0         
	//   21   35:aload_0         
	//   22   36:getfield        #75  <Field int pitchFrameCount>
	//   23   39:iload_1         
	//   24   40:isub            
	//   25   41:putfield        #75  <Field int pitchFrameCount>
			return;
	//   26   44:return          
		}
	}

	private void removeProcessedInputFrames(int i)
	{
		int j = inputFrameCount - i;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field int inputFrameCount>
	//    2    4:iload_1         
	//    3    5:isub            
	//    4    6:istore_2        
		System.arraycopy(((Object) (inputBuffer)), i * channelCount, ((Object) (inputBuffer)), 0, channelCount * j);
	//    5    7:aload_0         
	//    6    8:getfield        #60  <Field short[] inputBuffer>
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #44  <Field int channelCount>
	//   10   16:imul            
	//   11   17:aload_0         
	//   12   18:getfield        #60  <Field short[] inputBuffer>
	//   13   21:iconst_0        
	//   14   22:aload_0         
	//   15   23:getfield        #44  <Field int channelCount>
	//   16   26:iload_2         
	//   17   27:imul            
	//   18   28:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
		inputFrameCount = j;
	//   19   31:aload_0         
	//   20   32:iload_2         
	//   21   33:putfield        #100 <Field int inputFrameCount>
	//   22   36:return          
	}

	private int skipPitchPeriod(short aword0[], int i, float f, int j)
	{
		int k;
		if(f >= 2.0F)
	//*   0    0:fload_3         
	//*   1    1:fconst_2        
	//*   2    2:fcmpl           
	//*   3    3:iflt            19
		{
			k = (int)((float)j / (f - 1.0F));
	//    4    6:iload           4
	//    5    8:i2f             
	//    6    9:fload_3         
	//    7   10:fconst_1        
	//    8   11:fsub            
	//    9   12:fdiv            
	//   10   13:f2i             
	//   11   14:istore          5
		} else
	//*  12   16:goto            39
		{
			remainingInputToCopyFrameCount = (int)(((float)j * (2.0F - f)) / (f - 1.0F));
	//   13   19:aload_0         
	//   14   20:iload           4
	//   15   22:i2f             
	//   16   23:fconst_2        
	//   17   24:fload_3         
	//   18   25:fsub            
	//   19   26:fmul            
	//   20   27:fload_3         
	//   21   28:fconst_1        
	//   22   29:fsub            
	//   23   30:fdiv            
	//   24   31:f2i             
	//   25   32:putfield        #102 <Field int remainingInputToCopyFrameCount>
			k = j;
	//   26   35:iload           4
	//   27   37:istore          5
		}
		outputBuffer = ensureSpaceForAdditionalFrames(outputBuffer, outputFrameCount, k);
	//   28   39:aload_0         
	//   29   40:aload_0         
	//   30   41:aload_0         
	//   31   42:getfield        #62  <Field short[] outputBuffer>
	//   32   45:aload_0         
	//   33   46:getfield        #69  <Field int outputFrameCount>
	//   34   49:iload           5
	//   35   51:invokespecial   #83  <Method short[] ensureSpaceForAdditionalFrames(short[], int, int)>
	//   36   54:putfield        #62  <Field short[] outputBuffer>
		overlapAdd(k, channelCount, outputBuffer, outputFrameCount, aword0, i, aword0, i + j);
	//   37   57:iload           5
	//   38   59:aload_0         
	//   39   60:getfield        #44  <Field int channelCount>
	//   40   63:aload_0         
	//   41   64:getfield        #62  <Field short[] outputBuffer>
	//   42   67:aload_0         
	//   43   68:getfield        #69  <Field int outputFrameCount>
	//   44   71:aload_1         
	//   45   72:iload_2         
	//   46   73:aload_1         
	//   47   74:iload_2         
	//   48   75:iload           4
	//   49   77:iadd            
	//   50   78:invokestatic    #169 <Method void overlapAdd(int, int, short[], int, short[], int, short[], int)>
		outputFrameCount = outputFrameCount + k;
	//   51   81:aload_0         
	//   52   82:aload_0         
	//   53   83:getfield        #69  <Field int outputFrameCount>
	//   54   86:iload           5
	//   55   88:iadd            
	//   56   89:putfield        #69  <Field int outputFrameCount>
		return k;
	//   57   92:iload           5
	//   58   94:ireturn         
	}

	public void flush()
	{
		inputFrameCount = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #100 <Field int inputFrameCount>
		outputFrameCount = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #69  <Field int outputFrameCount>
		pitchFrameCount = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #75  <Field int pitchFrameCount>
		oldRatePosition = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #77  <Field int oldRatePosition>
		newRatePosition = 0;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #79  <Field int newRatePosition>
		remainingInputToCopyFrameCount = 0;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #102 <Field int remainingInputToCopyFrameCount>
		prevPeriod = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #159 <Field int prevPeriod>
		prevMinDiff = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #161 <Field int prevMinDiff>
		minDiff = 0;
	//   24   40:aload_0         
	//   25   41:iconst_0        
	//   26   42:putfield        #151 <Field int minDiff>
		maxDiff = 0;
	//   27   45:aload_0         
	//   28   46:iconst_0        
	//   29   47:putfield        #153 <Field int maxDiff>
	//   30   50:return          
	}

	public int getFramesAvailable()
	{
		return outputFrameCount;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int outputFrameCount>
	//    2    4:ireturn         
	}

	public void getOutput(ShortBuffer shortbuffer)
	{
		int i = Math.min(shortbuffer.remaining() / channelCount, outputFrameCount);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #188 <Method int ShortBuffer.remaining()>
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field int channelCount>
	//    4    8:idiv            
	//    5    9:aload_0         
	//    6   10:getfield        #69  <Field int outputFrameCount>
	//    7   13:invokestatic    #126 <Method int Math.min(int, int)>
	//    8   16:istore_2        
		shortbuffer.put(outputBuffer, 0, channelCount * i);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #62  <Field short[] outputBuffer>
	//   12   22:iconst_0        
	//   13   23:aload_0         
	//   14   24:getfield        #44  <Field int channelCount>
	//   15   27:iload_2         
	//   16   28:imul            
	//   17   29:invokevirtual   #192 <Method ShortBuffer ShortBuffer.put(short[], int, int)>
	//   18   32:pop             
		outputFrameCount = outputFrameCount - i;
	//   19   33:aload_0         
	//   20   34:aload_0         
	//   21   35:getfield        #69  <Field int outputFrameCount>
	//   22   38:iload_2         
	//   23   39:isub            
	//   24   40:putfield        #69  <Field int outputFrameCount>
		System.arraycopy(((Object) (outputBuffer)), i * channelCount, ((Object) (outputBuffer)), 0, outputFrameCount * channelCount);
	//   25   43:aload_0         
	//   26   44:getfield        #62  <Field short[] outputBuffer>
	//   27   47:iload_2         
	//   28   48:aload_0         
	//   29   49:getfield        #44  <Field int channelCount>
	//   30   52:imul            
	//   31   53:aload_0         
	//   32   54:getfield        #62  <Field short[] outputBuffer>
	//   33   57:iconst_0        
	//   34   58:aload_0         
	//   35   59:getfield        #69  <Field int outputFrameCount>
	//   36   62:aload_0         
	//   37   63:getfield        #44  <Field int channelCount>
	//   38   66:imul            
	//   39   67:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
	//   40   70:return          
	}

	public void queueEndOfStream()
	{
		int j = inputFrameCount;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field int inputFrameCount>
	//    2    4:istore          5
		float f = speed / pitch;
	//    3    6:aload_0         
	//    4    7:getfield        #46  <Field float speed>
	//    5   10:aload_0         
	//    6   11:getfield        #48  <Field float pitch>
	//    7   14:fdiv            
	//    8   15:fstore_1        
		float f1 = rate;
	//    9   16:aload_0         
	//   10   17:getfield        #50  <Field float rate>
	//   11   20:fstore_2        
		float f2 = pitch;
	//   12   21:aload_0         
	//   13   22:getfield        #48  <Field float pitch>
	//   14   25:fstore_3        
		int k = outputFrameCount + (int)(((float)j / f + (float)pitchFrameCount) / (f1 * f2) + 0.5F);
	//   15   26:aload_0         
	//   16   27:getfield        #69  <Field int outputFrameCount>
	//   17   30:iload           5
	//   18   32:i2f             
	//   19   33:fload_1         
	//   20   34:fdiv            
	//   21   35:aload_0         
	//   22   36:getfield        #75  <Field int pitchFrameCount>
	//   23   39:i2f             
	//   24   40:fadd            
	//   25   41:fload_2         
	//   26   42:fload_3         
	//   27   43:fmul            
	//   28   44:fdiv            
	//   29   45:ldc1            #165 <Float 0.5F>
	//   30   47:fadd            
	//   31   48:f2i             
	//   32   49:iadd            
	//   33   50:istore          6
		inputBuffer = ensureSpaceForAdditionalFrames(inputBuffer, inputFrameCount, maxRequiredFrameCount * 2 + j);
	//   34   52:aload_0         
	//   35   53:aload_0         
	//   36   54:aload_0         
	//   37   55:getfield        #60  <Field short[] inputBuffer>
	//   38   58:aload_0         
	//   39   59:getfield        #100 <Field int inputFrameCount>
	//   40   62:aload_0         
	//   41   63:getfield        #56  <Field int maxRequiredFrameCount>
	//   42   66:iconst_2        
	//   43   67:imul            
	//   44   68:iload           5
	//   45   70:iadd            
	//   46   71:invokespecial   #83  <Method short[] ensureSpaceForAdditionalFrames(short[], int, int)>
	//   47   74:putfield        #60  <Field short[] inputBuffer>
		for(int i = 0; i < maxRequiredFrameCount * 2 * channelCount; i++)
	//*  48   77:iconst_0        
	//*  49   78:istore          4
	//*  50   80:iload           4
	//*  51   82:aload_0         
	//*  52   83:getfield        #56  <Field int maxRequiredFrameCount>
	//*  53   86:iconst_2        
	//*  54   87:imul            
	//*  55   88:aload_0         
	//*  56   89:getfield        #44  <Field int channelCount>
	//*  57   92:imul            
	//*  58   93:icmpge          121
			inputBuffer[channelCount * j + i] = 0;
	//   59   96:aload_0         
	//   60   97:getfield        #60  <Field short[] inputBuffer>
	//   61  100:aload_0         
	//   62  101:getfield        #44  <Field int channelCount>
	//   63  104:iload           5
	//   64  106:imul            
	//   65  107:iload           4
	//   66  109:iadd            
	//   67  110:iconst_0        
	//   68  111:sastore         

	//   69  112:iload           4
	//   70  114:iconst_1        
	//   71  115:iadd            
	//   72  116:istore          4
	//*  73  118:goto            80
		inputFrameCount = inputFrameCount + 2 * maxRequiredFrameCount;
	//   74  121:aload_0         
	//   75  122:aload_0         
	//   76  123:getfield        #100 <Field int inputFrameCount>
	//   77  126:iconst_2        
	//   78  127:aload_0         
	//   79  128:getfield        #56  <Field int maxRequiredFrameCount>
	//   80  131:imul            
	//   81  132:iadd            
	//   82  133:putfield        #100 <Field int inputFrameCount>
		processStreamInput();
	//   83  136:aload_0         
	//   84  137:invokespecial   #195 <Method void processStreamInput()>
		if(outputFrameCount > k)
	//*  85  140:aload_0         
	//*  86  141:getfield        #69  <Field int outputFrameCount>
	//*  87  144:iload           6
	//*  88  146:icmple          155
			outputFrameCount = k;
	//   89  149:aload_0         
	//   90  150:iload           6
	//   91  152:putfield        #69  <Field int outputFrameCount>
		inputFrameCount = 0;
	//   92  155:aload_0         
	//   93  156:iconst_0        
	//   94  157:putfield        #100 <Field int inputFrameCount>
		remainingInputToCopyFrameCount = 0;
	//   95  160:aload_0         
	//   96  161:iconst_0        
	//   97  162:putfield        #102 <Field int remainingInputToCopyFrameCount>
		pitchFrameCount = 0;
	//   98  165:aload_0         
	//   99  166:iconst_0        
	//  100  167:putfield        #75  <Field int pitchFrameCount>
	//  101  170:return          
	}

	public void queueInput(ShortBuffer shortbuffer)
	{
		int i = shortbuffer.remaining() / channelCount;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #188 <Method int ShortBuffer.remaining()>
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field int channelCount>
	//    4    8:idiv            
	//    5    9:istore_2        
		int j = channelCount;
	//    6   10:aload_0         
	//    7   11:getfield        #44  <Field int channelCount>
	//    8   14:istore_3        
		inputBuffer = ensureSpaceForAdditionalFrames(inputBuffer, inputFrameCount, i);
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:getfield        #60  <Field short[] inputBuffer>
	//   13   21:aload_0         
	//   14   22:getfield        #100 <Field int inputFrameCount>
	//   15   25:iload_2         
	//   16   26:invokespecial   #83  <Method short[] ensureSpaceForAdditionalFrames(short[], int, int)>
	//   17   29:putfield        #60  <Field short[] inputBuffer>
		shortbuffer.get(inputBuffer, inputFrameCount * channelCount, (j * i * 2) / 2);
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:getfield        #60  <Field short[] inputBuffer>
	//   21   37:aload_0         
	//   22   38:getfield        #100 <Field int inputFrameCount>
	//   23   41:aload_0         
	//   24   42:getfield        #44  <Field int channelCount>
	//   25   45:imul            
	//   26   46:iload_3         
	//   27   47:iload_2         
	//   28   48:imul            
	//   29   49:iconst_2        
	//   30   50:imul            
	//   31   51:iconst_2        
	//   32   52:idiv            
	//   33   53:invokevirtual   #199 <Method ShortBuffer ShortBuffer.get(short[], int, int)>
	//   34   56:pop             
		inputFrameCount = inputFrameCount + i;
	//   35   57:aload_0         
	//   36   58:aload_0         
	//   37   59:getfield        #100 <Field int inputFrameCount>
	//   38   62:iload_2         
	//   39   63:iadd            
	//   40   64:putfield        #100 <Field int inputFrameCount>
		processStreamInput();
	//   41   67:aload_0         
	//   42   68:invokespecial   #195 <Method void processStreamInput()>
	//   43   71:return          
	}

	private static final int AMDF_FREQUENCY = 4000;
	private static final int MAXIMUM_PITCH = 400;
	private static final int MINIMUM_PITCH = 65;
	private final int channelCount;
	private final short downSampleBuffer[];
	private short inputBuffer[];
	private int inputFrameCount;
	private final int inputSampleRateHz;
	private int maxDiff;
	private final int maxPeriod;
	private final int maxRequiredFrameCount;
	private int minDiff;
	private final int minPeriod;
	private int newRatePosition;
	private int oldRatePosition;
	private short outputBuffer[];
	private int outputFrameCount;
	private final float pitch;
	private short pitchBuffer[];
	private int pitchFrameCount;
	private int prevMinDiff;
	private int prevPeriod;
	private final float rate;
	private int remainingInputToCopyFrameCount;
	private final float speed;
}
