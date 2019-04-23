// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import java.util.*;

public final class SlidingPercentile
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
		int j = recycledSampleCount;
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field int recycledSampleCount>
	//    4    8:istore_3        
		Sample sample;
		if(j > 0)
	//*   5    9:iload_3         
	//*   6   10:ifle            37
		{
			Sample asample[] = recycledSamples;
	//    7   13:aload_0         
	//    8   14:getfield        #51  <Field SlidingPercentile$Sample[] recycledSamples>
	//    9   17:astore          4
			j--;
	//   10   19:iload_3         
	//   11   20:iconst_1        
	//   12   21:isub            
	//   13   22:istore_3        
			recycledSampleCount = j;
	//   14   23:aload_0         
	//   15   24:iload_3         
	//   16   25:putfield        #72  <Field int recycledSampleCount>
			sample = asample[j];
	//   17   28:aload           4
	//   18   30:iload_3         
	//   19   31:aaload          
	//   20   32:astore          4
		} else
	//*  21   34:goto            47
		{
			sample = new Sample();
	//   22   37:new             #10  <Class SlidingPercentile$Sample>
	//   23   40:dup             
	//   24   41:aconst_null     
	//   25   42:invokespecial   #75  <Method void SlidingPercentile$Sample(SlidingPercentile$1)>
	//   26   45:astore          4
		}
		j = nextSampleIndex;
	//   27   47:aload_0         
	//   28   48:getfield        #77  <Field int nextSampleIndex>
	//   29   51:istore_3        
		nextSampleIndex = j + 1;
	//   30   52:aload_0         
	//   31   53:iload_3         
	//   32   54:iconst_1        
	//   33   55:iadd            
	//   34   56:putfield        #77  <Field int nextSampleIndex>
		sample.index = j;
	//   35   59:aload           4
	//   36   61:iload_3         
	//   37   62:putfield        #80  <Field int SlidingPercentile$Sample.index>
		sample.weight = i;
	//   38   65:aload           4
	//   39   67:iload_1         
	//   40   68:putfield        #83  <Field int SlidingPercentile$Sample.weight>
		sample.value = f;
	//   41   71:aload           4
	//   42   73:fload_2         
	//   43   74:putfield        #87  <Field float SlidingPercentile$Sample.value>
		samples.add(((Object) (sample)));
	//   44   77:aload_0         
	//   45   78:getfield        #56  <Field ArrayList samples>
	//   46   81:aload           4
	//   47   83:invokevirtual   #91  <Method boolean ArrayList.add(Object)>
	//   48   86:pop             
		totalWeight = totalWeight + i;
	//   49   87:aload_0         
	//   50   88:aload_0         
	//   51   89:getfield        #93  <Field int totalWeight>
	//   52   92:iload_1         
	//   53   93:iadd            
	//   54   94:putfield        #93  <Field int totalWeight>
		do
		{
			i = totalWeight;
	//   55   97:aload_0         
	//   56   98:getfield        #93  <Field int totalWeight>
	//   57  101:istore_1        
			int k = maxWeight;
	//   58  102:aload_0         
	//   59  103:getfield        #49  <Field int maxWeight>
	//   60  106:istore_3        
			if(i <= k)
				break;
	//   61  107:iload_1         
	//   62  108:iload_3         
	//   63  109:icmple          218
			i -= k;
	//   64  112:iload_1         
	//   65  113:iload_3         
	//   66  114:isub            
	//   67  115:istore_1        
			Sample sample1 = (Sample)samples.get(0);
	//   68  116:aload_0         
	//   69  117:getfield        #56  <Field ArrayList samples>
	//   70  120:iconst_0        
	//   71  121:invokevirtual   #97  <Method Object ArrayList.get(int)>
	//   72  124:checkcast       #10  <Class SlidingPercentile$Sample>
	//   73  127:astore          4
			if(sample1.weight <= i)
	//*  74  129:aload           4
	//*  75  131:getfield        #83  <Field int SlidingPercentile$Sample.weight>
	//*  76  134:iload_1         
	//*  77  135:icmpgt          193
			{
				totalWeight = totalWeight - sample1.weight;
	//   78  138:aload_0         
	//   79  139:aload_0         
	//   80  140:getfield        #93  <Field int totalWeight>
	//   81  143:aload           4
	//   82  145:getfield        #83  <Field int SlidingPercentile$Sample.weight>
	//   83  148:isub            
	//   84  149:putfield        #93  <Field int totalWeight>
				samples.remove(0);
	//   85  152:aload_0         
	//   86  153:getfield        #56  <Field ArrayList samples>
	//   87  156:iconst_0        
	//   88  157:invokevirtual   #100 <Method Object ArrayList.remove(int)>
	//   89  160:pop             
				i = recycledSampleCount;
	//   90  161:aload_0         
	//   91  162:getfield        #72  <Field int recycledSampleCount>
	//   92  165:istore_1        
				if(i < 5)
	//*  93  166:iload_1         
	//*  94  167:iconst_5        
	//*  95  168:icmpge          97
				{
					Sample asample1[] = recycledSamples;
	//   96  171:aload_0         
	//   97  172:getfield        #51  <Field SlidingPercentile$Sample[] recycledSamples>
	//   98  175:astore          5
					recycledSampleCount = i + 1;
	//   99  177:aload_0         
	//  100  178:iload_1         
	//  101  179:iconst_1        
	//  102  180:iadd            
	//  103  181:putfield        #72  <Field int recycledSampleCount>
					asample1[i] = sample1;
	//  104  184:aload           5
	//  105  186:iload_1         
	//  106  187:aload           4
	//  107  189:aastore         
				}
			} else
	//* 108  190:goto            97
			{
				sample1.weight = sample1.weight - i;
	//  109  193:aload           4
	//  110  195:aload           4
	//  111  197:getfield        #83  <Field int SlidingPercentile$Sample.weight>
	//  112  200:iload_1         
	//  113  201:isub            
	//  114  202:putfield        #83  <Field int SlidingPercentile$Sample.weight>
				totalWeight = totalWeight - i;
	//  115  205:aload_0         
	//  116  206:aload_0         
	//  117  207:getfield        #93  <Field int totalWeight>
	//  118  210:iload_1         
	//  119  211:isub            
	//  120  212:putfield        #93  <Field int totalWeight>
			}
		} while(true);
	//  121  215:goto            97
	//  122  218:return          
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
		{
			return (0.0F / 0.0F);
	//   45   82:ldc1            #113 <Float (0.0F / 0.0F)>
	//   46   84:freturn         
		} else
		{
			ArrayList arraylist = samples;
	//   47   85:aload_0         
	//   48   86:getfield        #56  <Field ArrayList samples>
	//   49   89:astore          5
			return ((Sample)arraylist.get(arraylist.size() - 1)).value;
	//   50   91:aload           5
	//   51   93:aload           5
	//   52   95:invokevirtual   #108 <Method int ArrayList.size()>
	//   53   98:iconst_1        
	//   54   99:isub            
	//   55  100:invokevirtual   #97  <Method Object ArrayList.get(int)>
	//   56  103:checkcast       #10  <Class SlidingPercentile$Sample>
	//   57  106:getfield        #87  <Field float SlidingPercentile$Sample.value>
	//   58  109:freturn         
		}
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
