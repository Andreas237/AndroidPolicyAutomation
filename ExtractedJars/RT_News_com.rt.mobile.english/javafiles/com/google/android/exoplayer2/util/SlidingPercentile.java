// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import java.util.*;

public class SlidingPercentile
{
	private static class Sample
	{

		public int index;
		public float value;
		public int weight;

		private Sample()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}

	}


	public SlidingPercentile(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		maxWeight = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #49  <Field int maxWeight>
	//    5    9:aload_0         
	//    6   10:iconst_5        
	//    7   11:anewarray       Sample[]
	//    8   14:putfield        #51  <Field SlidingPercentile$Sample[] recycledSamples>
	//    9   17:aload_0         
	//   10   18:new             #53  <Class ArrayList>
	//   11   21:dup             
	//   12   22:invokespecial   #54  <Method void ArrayList()>
	//   13   25:putfield        #56  <Field ArrayList samples>
		currentSortOrder = -1;
	//   14   28:aload_0         
	//   15   29:iconst_m1       
	//   16   30:putfield        #58  <Field int currentSortOrder>
	//   17   33:return          
	}

	private void ensureSortedByIndex()
	{
		if(currentSortOrder != 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field int currentSortOrder>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          23
		{
			Collections.sort(((java.util.List) (samples)), INDEX_COMPARATOR);
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field ArrayList samples>
	//    6   12:getstatic       #41  <Field Comparator INDEX_COMPARATOR>
	//    7   15:invokestatic    #65  <Method void Collections.sort(java.util.List, Comparator)>
			currentSortOrder = 1;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #58  <Field int currentSortOrder>
		}
	//   11   23:return          
	}

	private void ensureSortedByValue()
	{
		if(currentSortOrder != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field int currentSortOrder>
	//*   2    4:ifeq            22
		{
			Collections.sort(((java.util.List) (samples)), VALUE_COMPARATOR);
	//    3    7:aload_0         
	//    4    8:getfield        #56  <Field ArrayList samples>
	//    5   11:getstatic       #44  <Field Comparator VALUE_COMPARATOR>
	//    6   14:invokestatic    #65  <Method void Collections.sort(java.util.List, Comparator)>
			currentSortOrder = 0;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #58  <Field int currentSortOrder>
		}
	//   10   22:return          
	}

	public void addSample(int i, float f)
	{
		ensureSortedByIndex();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void ensureSortedByIndex()>
		Sample sample;
		if(recycledSampleCount > 0)
	//*   2    4:aload_0         
	//*   3    5:getfield        #72  <Field int recycledSampleCount>
	//*   4    8:ifle            38
		{
			Sample asample[] = recycledSamples;
	//    5   11:aload_0         
	//    6   12:getfield        #51  <Field SlidingPercentile$Sample[] recycledSamples>
	//    7   15:astore          4
			int j = recycledSampleCount - 1;
	//    8   17:aload_0         
	//    9   18:getfield        #72  <Field int recycledSampleCount>
	//   10   21:iconst_1        
	//   11   22:isub            
	//   12   23:istore_3        
			recycledSampleCount = j;
	//   13   24:aload_0         
	//   14   25:iload_3         
	//   15   26:putfield        #72  <Field int recycledSampleCount>
			sample = asample[j];
	//   16   29:aload           4
	//   17   31:iload_3         
	//   18   32:aaload          
	//   19   33:astore          4
		} else
	//*  20   35:goto            48
		{
			sample = new Sample();
	//   21   38:new             #10  <Class SlidingPercentile$Sample>
	//   22   41:dup             
	//   23   42:aconst_null     
	//   24   43:invokespecial   #75  <Method void SlidingPercentile$Sample(SlidingPercentile$1)>
	//   25   46:astore          4
		}
		int k = nextSampleIndex;
	//   26   48:aload_0         
	//   27   49:getfield        #77  <Field int nextSampleIndex>
	//   28   52:istore_3        
		nextSampleIndex = k + 1;
	//   29   53:aload_0         
	//   30   54:iload_3         
	//   31   55:iconst_1        
	//   32   56:iadd            
	//   33   57:putfield        #77  <Field int nextSampleIndex>
		sample.index = k;
	//   34   60:aload           4
	//   35   62:iload_3         
	//   36   63:putfield        #80  <Field int SlidingPercentile$Sample.index>
		sample.weight = i;
	//   37   66:aload           4
	//   38   68:iload_1         
	//   39   69:putfield        #83  <Field int SlidingPercentile$Sample.weight>
		sample.value = f;
	//   40   72:aload           4
	//   41   74:fload_2         
	//   42   75:putfield        #87  <Field float SlidingPercentile$Sample.value>
		samples.add(((Object) (sample)));
	//   43   78:aload_0         
	//   44   79:getfield        #56  <Field ArrayList samples>
	//   45   82:aload           4
	//   46   84:invokevirtual   #91  <Method boolean ArrayList.add(Object)>
	//   47   87:pop             
		totalWeight = totalWeight + i;
	//   48   88:aload_0         
	//   49   89:aload_0         
	//   50   90:getfield        #93  <Field int totalWeight>
	//   51   93:iload_1         
	//   52   94:iadd            
	//   53   95:putfield        #93  <Field int totalWeight>
		do
		{
			if(totalWeight <= maxWeight)
				break;
	//   54   98:aload_0         
	//   55   99:getfield        #93  <Field int totalWeight>
	//   56  102:aload_0         
	//   57  103:getfield        #49  <Field int maxWeight>
	//   58  106:icmple          224
			i = totalWeight - maxWeight;
	//   59  109:aload_0         
	//   60  110:getfield        #93  <Field int totalWeight>
	//   61  113:aload_0         
	//   62  114:getfield        #49  <Field int maxWeight>
	//   63  117:isub            
	//   64  118:istore_1        
			Sample sample1 = (Sample)samples.get(0);
	//   65  119:aload_0         
	//   66  120:getfield        #56  <Field ArrayList samples>
	//   67  123:iconst_0        
	//   68  124:invokevirtual   #97  <Method Object ArrayList.get(int)>
	//   69  127:checkcast       #10  <Class SlidingPercentile$Sample>
	//   70  130:astore          4
			if(sample1.weight <= i)
	//*  71  132:aload           4
	//*  72  134:getfield        #83  <Field int SlidingPercentile$Sample.weight>
	//*  73  137:iload_1         
	//*  74  138:icmpgt          199
			{
				totalWeight = totalWeight - sample1.weight;
	//   75  141:aload_0         
	//   76  142:aload_0         
	//   77  143:getfield        #93  <Field int totalWeight>
	//   78  146:aload           4
	//   79  148:getfield        #83  <Field int SlidingPercentile$Sample.weight>
	//   80  151:isub            
	//   81  152:putfield        #93  <Field int totalWeight>
				samples.remove(0);
	//   82  155:aload_0         
	//   83  156:getfield        #56  <Field ArrayList samples>
	//   84  159:iconst_0        
	//   85  160:invokevirtual   #100 <Method Object ArrayList.remove(int)>
	//   86  163:pop             
				if(recycledSampleCount < 5)
	//*  87  164:aload_0         
	//*  88  165:getfield        #72  <Field int recycledSampleCount>
	//*  89  168:iconst_5        
	//*  90  169:icmpge          98
				{
					Sample asample1[] = recycledSamples;
	//   91  172:aload_0         
	//   92  173:getfield        #51  <Field SlidingPercentile$Sample[] recycledSamples>
	//   93  176:astore          5
					i = recycledSampleCount;
	//   94  178:aload_0         
	//   95  179:getfield        #72  <Field int recycledSampleCount>
	//   96  182:istore_1        
					recycledSampleCount = i + 1;
	//   97  183:aload_0         
	//   98  184:iload_1         
	//   99  185:iconst_1        
	//  100  186:iadd            
	//  101  187:putfield        #72  <Field int recycledSampleCount>
					asample1[i] = sample1;
	//  102  190:aload           5
	//  103  192:iload_1         
	//  104  193:aload           4
	//  105  195:aastore         
				}
			} else
	//* 106  196:goto            98
			{
				sample1.weight = sample1.weight - i;
	//  107  199:aload           4
	//  108  201:aload           4
	//  109  203:getfield        #83  <Field int SlidingPercentile$Sample.weight>
	//  110  206:iload_1         
	//  111  207:isub            
	//  112  208:putfield        #83  <Field int SlidingPercentile$Sample.weight>
				totalWeight = totalWeight - i;
	//  113  211:aload_0         
	//  114  212:aload_0         
	//  115  213:getfield        #93  <Field int totalWeight>
	//  116  216:iload_1         
	//  117  217:isub            
	//  118  218:putfield        #93  <Field int totalWeight>
			}
		} while(true);
	//  119  221:goto            98
	//  120  224:return          
	}

	public float getPercentile(float f)
	{
		ensureSortedByValue();
	//    0    0:aload_0         
	//    1    1:invokespecial   #104 <Method void ensureSortedByValue()>
		float f1 = totalWeight;
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field int totalWeight>
	//    4    8:i2f             
	//    5    9:fstore_2        
		int i = 0;
	//    6   10:iconst_0        
	//    7   11:istore_3        
		int j = 0;
	//    8   12:iconst_0        
	//    9   13:istore          4
		for(; i < samples.size(); i++)
	//*  10   15:iload_3         
	//*  11   16:aload_0         
	//*  12   17:getfield        #56  <Field ArrayList samples>
	//*  13   20:invokevirtual   #108 <Method int ArrayList.size()>
	//*  14   23:icmpge          72
		{
			Sample sample = (Sample)samples.get(i);
	//   15   26:aload_0         
	//   16   27:getfield        #56  <Field ArrayList samples>
	//   17   30:iload_3         
	//   18   31:invokevirtual   #97  <Method Object ArrayList.get(int)>
	//   19   34:checkcast       #10  <Class SlidingPercentile$Sample>
	//   20   37:astore          5
			j += sample.weight;
	//   21   39:iload           4
	//   22   41:aload           5
	//   23   43:getfield        #83  <Field int SlidingPercentile$Sample.weight>
	//   24   46:iadd            
	//   25   47:istore          4
			if((float)j >= f * f1)
	//*  26   49:iload           4
	//*  27   51:i2f             
	//*  28   52:fload_1         
	//*  29   53:fload_2         
	//*  30   54:fmul            
	//*  31   55:fcmpl           
	//*  32   56:iflt            65
				return sample.value;
	//   33   59:aload           5
	//   34   61:getfield        #87  <Field float SlidingPercentile$Sample.value>
	//   35   64:freturn         
		}

	//   36   65:iload_3         
	//   37   66:iconst_1        
	//   38   67:iadd            
	//   39   68:istore_3        
	//*  40   69:goto            15
		if(samples.isEmpty())
	//*  41   72:aload_0         
	//*  42   73:getfield        #56  <Field ArrayList samples>
	//*  43   76:invokevirtual   #112 <Method boolean ArrayList.isEmpty()>
	//*  44   79:ifeq            85
			return (0.0F / 0.0F);
	//   45   82:ldc1            #113 <Float (0.0F / 0.0F)>
	//   46   84:freturn         
		else
			return ((Sample)samples.get(samples.size() - 1)).value;
	//   47   85:aload_0         
	//   48   86:getfield        #56  <Field ArrayList samples>
	//   49   89:aload_0         
	//   50   90:getfield        #56  <Field ArrayList samples>
	//   51   93:invokevirtual   #108 <Method int ArrayList.size()>
	//   52   96:iconst_1        
	//   53   97:isub            
	//   54   98:invokevirtual   #97  <Method Object ArrayList.get(int)>
	//   55  101:checkcast       #10  <Class SlidingPercentile$Sample>
	//   56  104:getfield        #87  <Field float SlidingPercentile$Sample.value>
	//   57  107:freturn         
	}

	private static final Comparator INDEX_COMPARATOR = new Comparator() {

		public int compare(Sample sample, Sample sample1)
		{
			return sample.index - sample1.index;
		//    0    0:aload_1         
		//    1    1:getfield        #22  <Field int SlidingPercentile$Sample.index>
		//    2    4:aload_2         
		//    3    5:getfield        #22  <Field int SlidingPercentile$Sample.index>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((Sample)obj, (Sample)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class SlidingPercentile$Sample>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class SlidingPercentile$Sample>
		//    5    9:invokevirtual   #25  <Method int compare(SlidingPercentile$Sample, SlidingPercentile$Sample)>
		//    6   12:ireturn         
		}

	}
;
	private static final int MAX_RECYCLED_SAMPLES = 5;
	private static final int SORT_ORDER_BY_INDEX = 1;
	private static final int SORT_ORDER_BY_VALUE = 0;
	private static final int SORT_ORDER_NONE = -1;
	private static final Comparator VALUE_COMPARATOR = new Comparator() {

		public int compare(Sample sample, Sample sample1)
		{
			if(sample.value < sample1.value)
		//*   0    0:aload_1         
		//*   1    1:getfield        #22  <Field float SlidingPercentile$Sample.value>
		//*   2    4:aload_2         
		//*   3    5:getfield        #22  <Field float SlidingPercentile$Sample.value>
		//*   4    8:fcmpg           
		//*   5    9:ifge            14
				return -1;
		//    6   12:iconst_m1       
		//    7   13:ireturn         
			return sample1.value >= sample.value ? 0 : 1;
		//    8   14:aload_2         
		//    9   15:getfield        #22  <Field float SlidingPercentile$Sample.value>
		//   10   18:aload_1         
		//   11   19:getfield        #22  <Field float SlidingPercentile$Sample.value>
		//   12   22:fcmpg           
		//   13   23:ifge            28
		//   14   26:iconst_1        
		//   15   27:ireturn         
		//   16   28:iconst_0        
		//   17   29:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((Sample)obj, (Sample)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class SlidingPercentile$Sample>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class SlidingPercentile$Sample>
		//    5    9:invokevirtual   #25  <Method int compare(SlidingPercentile$Sample, SlidingPercentile$Sample)>
		//    6   12:ireturn         
		}

	}
;
	private int currentSortOrder;
	private final int maxWeight;
	private int nextSampleIndex;
	private int recycledSampleCount;
	private final Sample recycledSamples[] = new Sample[5];
	private final ArrayList samples = new ArrayList();
	private int totalWeight;

	static 
	{
	//    0    0:new             #6   <Class SlidingPercentile$1>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void SlidingPercentile$1()>
	//    3    7:putstatic       #41  <Field Comparator INDEX_COMPARATOR>
	//    4   10:new             #8   <Class SlidingPercentile$2>
	//    5   13:dup             
	//    6   14:invokespecial   #42  <Method void SlidingPercentile$2()>
	//    7   17:putstatic       #44  <Field Comparator VALUE_COMPARATOR>
	//*   8   20:return          
	}
}
