// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.upstream.BandwidthMeter;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.google.android.exoplayer.chunk:
//			Format, MediaChunk

public interface FormatEvaluator
{
	public static final class AdaptiveEvaluator
		implements FormatEvaluator
	{

		private Format determineIdealFormat(Format aformat[], long l)
		{
			if(l == -1L)
		//*   0    0:lload_2         
		//*   1    1:ldc2w           #52  <Long -1L>
		//*   2    4:lcmp            
		//*   3    5:ifne            17
				l = maxInitialBitrate;
		//    4    8:aload_0         
		//    5    9:getfield        #39  <Field int maxInitialBitrate>
		//    6   12:i2l             
		//    7   13:lstore_2        
			else
		//*   8   14:goto            26
				l = (long)((float)l * bandwidthFraction);
		//    9   17:lload_2         
		//   10   18:l2f             
		//   11   19:aload_0         
		//   12   20:getfield        #49  <Field float bandwidthFraction>
		//   13   23:fmul            
		//   14   24:f2l             
		//   15   25:lstore_2        
			for(int i = 0; i < aformat.length; i++)
		//*  16   26:iconst_0        
		//*  17   27:istore          4
		//*  18   29:iload           4
		//*  19   31:aload_1         
		//*  20   32:arraylength     
		//*  21   33:icmpge          65
			{
				Format format = aformat[i];
		//   22   36:aload_1         
		//   23   37:iload           4
		//   24   39:aaload          
		//   25   40:astore          5
				if((long)format.bitrate <= l)
		//*  26   42:aload           5
		//*  27   44:getfield        #58  <Field int Format.bitrate>
		//*  28   47:i2l             
		//*  29   48:lload_2         
		//*  30   49:lcmp            
		//*  31   50:ifgt            56
					return format;
		//   32   53:aload           5
		//   33   55:areturn         
			}

		//   34   56:iload           4
		//   35   58:iconst_1        
		//   36   59:iadd            
		//   37   60:istore          4
		//*  38   62:goto            29
			return aformat[aformat.length - 1];
		//   39   65:aload_1         
		//   40   66:aload_1         
		//   41   67:arraylength     
		//   42   68:iconst_1        
		//   43   69:isub            
		//   44   70:aaload          
		//   45   71:areturn         
		}

		public void disable()
		{
		//    0    0:return          
		}

		public void enable()
		{
		//    0    0:return          
		}

		public void evaluate(List list, long l, Format aformat[], Evaluation evaluation)
		{
			Format format;
label0:
			{
				boolean flag4 = list.isEmpty();
		//    0    0:aload_1         
		//    1    1:invokeinterface #68  <Method boolean List.isEmpty()>
		//    2    6:istore          12
				boolean flag2 = true;
		//    3    8:iconst_1        
		//    4    9:istore          8
				long l1;
				if(flag4)
		//*   5   11:iload           12
		//*   6   13:ifeq            22
					l1 = 0L;
		//    7   16:lconst_0        
		//    8   17:lstore          10
				else
		//*   9   19:goto            46
					l1 = ((MediaChunk)list.get(list.size() - 1)).endTimeUs - l;
		//   10   22:aload_1         
		//   11   23:aload_1         
		//   12   24:invokeinterface #72  <Method int List.size()>
		//   13   29:iconst_1        
		//   14   30:isub            
		//   15   31:invokeinterface #76  <Method Object List.get(int)>
		//   16   36:checkcast       #78  <Class MediaChunk>
		//   17   39:getfield        #81  <Field long MediaChunk.endTimeUs>
		//   18   42:lload_2         
		//   19   43:lsub            
		//   20   44:lstore          10
				format = evaluation.format;
		//   21   46:aload           5
		//   22   48:getfield        #87  <Field Format FormatEvaluator$Evaluation.format>
		//   23   51:astore          13
				Format format1 = determineIdealFormat(aformat, bandwidthMeter.getBitrateEstimate());
		//   24   53:aload_0         
		//   25   54:aload           4
		//   26   56:aload_0         
		//   27   57:getfield        #37  <Field BandwidthMeter bandwidthMeter>
		//   28   60:invokeinterface #93  <Method long BandwidthMeter.getBitrateEstimate()>
		//   29   65:invokespecial   #95  <Method Format determineIdealFormat(Format[], long)>
		//   30   68:astore          14
				boolean flag3 = false;
		//   31   70:iconst_0        
		//   32   71:istore          9
				boolean flag;
				if(format1 != null && format != null && format1.bitrate > format.bitrate)
		//*  33   73:aload           14
		//*  34   75:ifnull          102
		//*  35   78:aload           13
		//*  36   80:ifnull          102
		//*  37   83:aload           14
		//*  38   85:getfield        #58  <Field int Format.bitrate>
		//*  39   88:aload           13
		//*  40   90:getfield        #58  <Field int Format.bitrate>
		//*  41   93:icmple          102
					flag = true;
		//   42   96:iconst_1        
		//   43   97:istore          6
				else
		//*  44   99:goto            105
					flag = false;
		//   45  102:iconst_0        
		//   46  103:istore          6
				boolean flag1 = flag3;
		//   47  105:iload           9
		//   48  107:istore          7
				if(format1 != null)
		//*  49  109:aload           14
		//*  50  111:ifnull          143
				{
					flag1 = flag3;
		//   51  114:iload           9
		//   52  116:istore          7
					if(format != null)
		//*  53  118:aload           13
		//*  54  120:ifnull          143
					{
						flag1 = flag3;
		//   55  123:iload           9
		//   56  125:istore          7
						if(format1.bitrate < format.bitrate)
		//*  57  127:aload           14
		//*  58  129:getfield        #58  <Field int Format.bitrate>
		//*  59  132:aload           13
		//*  60  134:getfield        #58  <Field int Format.bitrate>
		//*  61  137:icmpge          143
							flag1 = true;
		//   62  140:iconst_1        
		//   63  141:istore          7
					}
				}
				if(flag)
		//*  64  143:iload           6
		//*  65  145:ifeq            305
				{
					if(l1 >= minDurationForQualityIncreaseUs)
		//*  66  148:lload           10
		//*  67  150:aload_0         
		//*  68  151:getfield        #43  <Field long minDurationForQualityIncreaseUs>
		//*  69  154:lcmp            
		//*  70  155:ifge            161
		//*  71  158:goto            337
					{
						aformat = ((Format []) (format1));
		//   72  161:aload           14
		//   73  163:astore          4
						if(l1 >= minDurationToRetainAfterDiscardUs)
		//*  74  165:lload           10
		//*  75  167:aload_0         
		//*  76  168:getfield        #47  <Field long minDurationToRetainAfterDiscardUs>
		//*  77  171:lcmp            
		//*  78  172:iflt            341
						{
							int i = ((int) (flag2));
		//   79  175:iload           8
		//   80  177:istore          6
							do
							{
								aformat = ((Format []) (format1));
		//   81  179:aload           14
		//   82  181:astore          4
								if(i >= list.size())
									break;
		//   83  183:iload           6
		//   84  185:aload_1         
		//   85  186:invokeinterface #72  <Method int List.size()>
		//   86  191:icmpge          341
								aformat = ((Format []) ((MediaChunk)list.get(i)));
		//   87  194:aload_1         
		//   88  195:iload           6
		//   89  197:invokeinterface #76  <Method Object List.get(int)>
		//   90  202:checkcast       #78  <Class MediaChunk>
		//   91  205:astore          4
								if(((MediaChunk) (aformat)).startTimeUs - l >= minDurationToRetainAfterDiscardUs && ((MediaChunk) (aformat)).format.bitrate < format1.bitrate && ((MediaChunk) (aformat)).format.height < format1.height && ((MediaChunk) (aformat)).format.height < 720 && ((MediaChunk) (aformat)).format.width < 1280)
		//*  92  207:aload           4
		//*  93  209:getfield        #98  <Field long MediaChunk.startTimeUs>
		//*  94  212:lload_2         
		//*  95  213:lsub            
		//*  96  214:aload_0         
		//*  97  215:getfield        #47  <Field long minDurationToRetainAfterDiscardUs>
		//*  98  218:lcmp            
		//*  99  219:iflt            296
		//* 100  222:aload           4
		//* 101  224:getfield        #99  <Field Format MediaChunk.format>
		//* 102  227:getfield        #58  <Field int Format.bitrate>
		//* 103  230:aload           14
		//* 104  232:getfield        #58  <Field int Format.bitrate>
		//* 105  235:icmpge          296
		//* 106  238:aload           4
		//* 107  240:getfield        #99  <Field Format MediaChunk.format>
		//* 108  243:getfield        #102 <Field int Format.height>
		//* 109  246:aload           14
		//* 110  248:getfield        #102 <Field int Format.height>
		//* 111  251:icmpge          296
		//* 112  254:aload           4
		//* 113  256:getfield        #99  <Field Format MediaChunk.format>
		//* 114  259:getfield        #102 <Field int Format.height>
		//* 115  262:sipush          720
		//* 116  265:icmpge          296
		//* 117  268:aload           4
		//* 118  270:getfield        #99  <Field Format MediaChunk.format>
		//* 119  273:getfield        #105 <Field int Format.width>
		//* 120  276:sipush          1280
		//* 121  279:icmpge          296
								{
									evaluation.queueSize = i;
		//  122  282:aload           5
		//  123  284:iload           6
		//  124  286:putfield        #108 <Field int FormatEvaluator$Evaluation.queueSize>
									aformat = ((Format []) (format1));
		//  125  289:aload           14
		//  126  291:astore          4
									break;
		//  127  293:goto            341
								}
								i++;
		//  128  296:iload           6
		//  129  298:iconst_1        
		//  130  299:iadd            
		//  131  300:istore          6
							} while(true);
		//  132  302:goto            179
						}
						break label0;
					}
				} else
				{
					aformat = ((Format []) (format1));
		//  133  305:aload           14
		//  134  307:astore          4
					if(!flag1)
						break label0;
		//  135  309:iload           7
		//  136  311:ifeq            341
					aformat = ((Format []) (format1));
		//  137  314:aload           14
		//  138  316:astore          4
					if(format == null)
						break label0;
		//  139  318:aload           13
		//  140  320:ifnull          341
					aformat = ((Format []) (format1));
		//  141  323:aload           14
		//  142  325:astore          4
					if(l1 < maxDurationForQualityDecreaseUs)
						break label0;
		//  143  327:lload           10
		//  144  329:aload_0         
		//  145  330:getfield        #45  <Field long maxDurationForQualityDecreaseUs>
		//  146  333:lcmp            
		//  147  334:iflt            341
				}
				aformat = ((Format []) (format));
		//  148  337:aload           13
		//  149  339:astore          4
			}
			if(format != null && aformat != format)
		//* 150  341:aload           13
		//* 151  343:ifnull          359
		//* 152  346:aload           4
		//* 153  348:aload           13
		//* 154  350:if_acmpeq       359
				evaluation.trigger = 3;
		//  155  353:aload           5
		//  156  355:iconst_3        
		//  157  356:putfield        #111 <Field int FormatEvaluator$Evaluation.trigger>
			evaluation.format = ((Format) (aformat));
		//  158  359:aload           5
		//  159  361:aload           4
		//  160  363:putfield        #87  <Field Format FormatEvaluator$Evaluation.format>
		//  161  366:return          
		}

		public static final float DEFAULT_BANDWIDTH_FRACTION = 0.75F;
		public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
		public static final int DEFAULT_MAX_INITIAL_BITRATE = 0xc3500;
		public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
		public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
		private final float bandwidthFraction;
		private final BandwidthMeter bandwidthMeter;
		private final long maxDurationForQualityDecreaseUs;
		private final int maxInitialBitrate;
		private final long minDurationForQualityIncreaseUs;
		private final long minDurationToRetainAfterDiscardUs;

		public AdaptiveEvaluator(BandwidthMeter bandwidthmeter)
		{
			this(bandwidthmeter, 0xc3500, 10000, 25000, 25000, 0.75F);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #15  <Int 0xc3500>
		//    3    4:sipush          10000
		//    4    7:sipush          25000
		//    5   10:sipush          25000
		//    6   13:ldc1            #10  <Float 0.75F>
		//    7   15:invokespecial   #31  <Method void FormatEvaluator$AdaptiveEvaluator(BandwidthMeter, int, int, int, int, float)>
		//    8   18:return          
		}

		public AdaptiveEvaluator(BandwidthMeter bandwidthmeter, int i, int j, int k, int l, float f)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
			bandwidthMeter = bandwidthmeter;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #37  <Field BandwidthMeter bandwidthMeter>
			maxInitialBitrate = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #39  <Field int maxInitialBitrate>
			minDurationForQualityIncreaseUs = (long)j * 1000L;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:i2l             
		//   11   17:ldc2w           #40  <Long 1000L>
		//   12   20:lmul            
		//   13   21:putfield        #43  <Field long minDurationForQualityIncreaseUs>
			maxDurationForQualityDecreaseUs = (long)k * 1000L;
		//   14   24:aload_0         
		//   15   25:iload           4
		//   16   27:i2l             
		//   17   28:ldc2w           #40  <Long 1000L>
		//   18   31:lmul            
		//   19   32:putfield        #45  <Field long maxDurationForQualityDecreaseUs>
			minDurationToRetainAfterDiscardUs = (long)l * 1000L;
		//   20   35:aload_0         
		//   21   36:iload           5
		//   22   38:i2l             
		//   23   39:ldc2w           #40  <Long 1000L>
		//   24   42:lmul            
		//   25   43:putfield        #47  <Field long minDurationToRetainAfterDiscardUs>
			bandwidthFraction = f;
		//   26   46:aload_0         
		//   27   47:fload           6
		//   28   49:putfield        #49  <Field float bandwidthFraction>
		//   29   52:return          
		}
	}

	public static final class Evaluation
	{

		public Format format;
		public int queueSize;
		public int trigger;

		public Evaluation()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			trigger = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #18  <Field int trigger>
		//    5    9:return          
		}
	}

	public static final class FixedEvaluator
		implements FormatEvaluator
	{

		public void disable()
		{
		//    0    0:return          
		}

		public void enable()
		{
		//    0    0:return          
		}

		public void evaluate(List list, long l, Format aformat[], Evaluation evaluation)
		{
			evaluation.format = aformat[0];
		//    0    0:aload           5
		//    1    2:aload           4
		//    2    4:iconst_0        
		//    3    5:aaload          
		//    4    6:putfield        #22  <Field Format FormatEvaluator$Evaluation.format>
		//    5    9:return          
		}

		public FixedEvaluator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class RandomEvaluator
		implements FormatEvaluator
	{

		public void disable()
		{
		//    0    0:return          
		}

		public void enable()
		{
		//    0    0:return          
		}

		public void evaluate(List list, long l, Format aformat[], Evaluation evaluation)
		{
			list = ((List) (aformat[random.nextInt(aformat.length)]));
		//    0    0:aload           4
		//    1    2:aload_0         
		//    2    3:getfield        #18  <Field Random random>
		//    3    6:aload           4
		//    4    8:arraylength     
		//    5    9:invokevirtual   #31  <Method int Random.nextInt(int)>
		//    6   12:aaload          
		//    7   13:astore_1        
			if(evaluation.format != null && !evaluation.format.equals(((Object) (list))))
		//*   8   14:aload           5
		//*   9   16:getfield        #37  <Field Format FormatEvaluator$Evaluation.format>
		//*  10   19:ifnull          40
		//*  11   22:aload           5
		//*  12   24:getfield        #37  <Field Format FormatEvaluator$Evaluation.format>
		//*  13   27:aload_1         
		//*  14   28:invokevirtual   #43  <Method boolean Format.equals(Object)>
		//*  15   31:ifne            40
				evaluation.trigger = 3;
		//   16   34:aload           5
		//   17   36:iconst_3        
		//   18   37:putfield        #47  <Field int FormatEvaluator$Evaluation.trigger>
			evaluation.format = ((Format) (list));
		//   19   40:aload           5
		//   20   42:aload_1         
		//   21   43:putfield        #37  <Field Format FormatEvaluator$Evaluation.format>
		//   22   46:return          
		}

		private final Random random;

		public RandomEvaluator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
			random = new Random();
		//    2    4:aload_0         
		//    3    5:new             #15  <Class Random>
		//    4    8:dup             
		//    5    9:invokespecial   #16  <Method void Random()>
		//    6   12:putfield        #18  <Field Random random>
		//    7   15:return          
		}

		public RandomEvaluator(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
			random = new Random(i);
		//    2    4:aload_0         
		//    3    5:new             #15  <Class Random>
		//    4    8:dup             
		//    5    9:iload_1         
		//    6   10:i2l             
		//    7   11:invokespecial   #23  <Method void Random(long)>
		//    8   14:putfield        #18  <Field Random random>
		//    9   17:return          
		}
	}


	public abstract void disable();

	public abstract void enable();

	public abstract void evaluate(List list, long l, Format aformat[], Evaluation evaluation);
}
