// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.webvtt;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.text.webvtt:
//			WebvttCue

final class WebvttSubtitle
	implements Subtitle
{

	public WebvttSubtitle(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		cues = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field List cues>
		numCues = list.size();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #27  <Method int List.size()>
	//    8   16:putfield        #29  <Field int numCues>
		cueTimesUs = new long[2 * numCues];
	//    9   19:aload_0         
	//   10   20:iconst_2        
	//   11   21:aload_0         
	//   12   22:getfield        #29  <Field int numCues>
	//   13   25:imul            
	//   14   26:newarray        long[]
	//   15   28:putfield        #31  <Field long[] cueTimesUs>
		for(int i = 0; i < numCues; i++)
	//*  16   31:iconst_0        
	//*  17   32:istore_2        
	//*  18   33:iload_2         
	//*  19   34:aload_0         
	//*  20   35:getfield        #29  <Field int numCues>
	//*  21   38:icmpge          88
		{
			WebvttCue webvttcue = (WebvttCue)list.get(i);
	//   22   41:aload_1         
	//   23   42:iload_2         
	//   24   43:invokeinterface #35  <Method Object List.get(int)>
	//   25   48:checkcast       #37  <Class WebvttCue>
	//   26   51:astore          4
			int j = i * 2;
	//   27   53:iload_2         
	//   28   54:iconst_2        
	//   29   55:imul            
	//   30   56:istore_3        
			cueTimesUs[j] = webvttcue.startTime;
	//   31   57:aload_0         
	//   32   58:getfield        #31  <Field long[] cueTimesUs>
	//   33   61:iload_3         
	//   34   62:aload           4
	//   35   64:getfield        #41  <Field long WebvttCue.startTime>
	//   36   67:lastore         
			cueTimesUs[j + 1] = webvttcue.endTime;
	//   37   68:aload_0         
	//   38   69:getfield        #31  <Field long[] cueTimesUs>
	//   39   72:iload_3         
	//   40   73:iconst_1        
	//   41   74:iadd            
	//   42   75:aload           4
	//   43   77:getfield        #44  <Field long WebvttCue.endTime>
	//   44   80:lastore         
		}

	//   45   81:iload_2         
	//   46   82:iconst_1        
	//   47   83:iadd            
	//   48   84:istore_2        
	//*  49   85:goto            33
		sortedCueTimesUs = Arrays.copyOf(cueTimesUs, cueTimesUs.length);
	//   50   88:aload_0         
	//   51   89:aload_0         
	//   52   90:getfield        #31  <Field long[] cueTimesUs>
	//   53   93:aload_0         
	//   54   94:getfield        #31  <Field long[] cueTimesUs>
	//   55   97:arraylength     
	//   56   98:invokestatic    #50  <Method long[] Arrays.copyOf(long[], int)>
	//   57  101:putfield        #52  <Field long[] sortedCueTimesUs>
		Arrays.sort(sortedCueTimesUs);
	//   58  104:aload_0         
	//   59  105:getfield        #52  <Field long[] sortedCueTimesUs>
	//   60  108:invokestatic    #56  <Method void Arrays.sort(long[])>
	//   61  111:return          
	}

	public List getCues(long l)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_3        
		ArrayList arraylist = null;
	//    4    5:aconst_null     
	//    5    6:astore          5
		Object obj;
		Object obj3;
		for(obj = ((Object) (arraylist)); i < numCues; obj = obj3)
	//*   6    8:aload           5
	//*   7   10:astore          7
	//*   8   12:iload_3         
	//*   9   13:aload_0         
	//*  10   14:getfield        #29  <Field int numCues>
	//*  11   17:icmpge          239
		{
			long al[] = cueTimesUs;
	//   12   20:aload_0         
	//   13   21:getfield        #31  <Field long[] cueTimesUs>
	//   14   24:astore          11
			int j = i * 2;
	//   15   26:iload_3         
	//   16   27:iconst_2        
	//   17   28:imul            
	//   18   29:istore          4
			Object obj2 = obj1;
	//   19   31:aload           8
	//   20   33:astore          9
			ArrayList arraylist1 = arraylist;
	//   21   35:aload           5
	//   22   37:astore          6
			obj3 = obj;
	//   23   39:aload           7
	//   24   41:astore          10
			if(al[j] <= l)
	//*  25   43:aload           11
	//*  26   45:iload           4
	//*  27   47:laload          
	//*  28   48:lload_1         
	//*  29   49:lcmp            
	//*  30   50:ifgt            220
			{
				obj2 = obj1;
	//   31   53:aload           8
	//   32   55:astore          9
				arraylist1 = arraylist;
	//   33   57:aload           5
	//   34   59:astore          6
				obj3 = obj;
	//   35   61:aload           7
	//   36   63:astore          10
				if(l < cueTimesUs[j + 1])
	//*  37   65:lload_1         
	//*  38   66:aload_0         
	//*  39   67:getfield        #31  <Field long[] cueTimesUs>
	//*  40   70:iload           4
	//*  41   72:iconst_1        
	//*  42   73:iadd            
	//*  43   74:laload          
	//*  44   75:lcmp            
	//*  45   76:ifge            220
				{
					arraylist1 = arraylist;
	//   46   79:aload           5
	//   47   81:astore          6
					if(arraylist == null)
	//*  48   83:aload           5
	//*  49   85:ifnonnull       97
						arraylist1 = new ArrayList();
	//   50   88:new             #63  <Class ArrayList>
	//   51   91:dup             
	//   52   92:invokespecial   #64  <Method void ArrayList()>
	//   53   95:astore          6
					obj3 = ((Object) ((WebvttCue)cues.get(i)));
	//   54   97:aload_0         
	//   55   98:getfield        #21  <Field List cues>
	//   56  101:iload_3         
	//   57  102:invokeinterface #35  <Method Object List.get(int)>
	//   58  107:checkcast       #37  <Class WebvttCue>
	//   59  110:astore          10
					if(((WebvttCue) (obj3)).isNormalCue())
	//*  60  112:aload           10
	//*  61  114:invokevirtual   #68  <Method boolean WebvttCue.isNormalCue()>
	//*  62  117:ifeq            204
					{
						if(obj == null)
	//*  63  120:aload           7
	//*  64  122:ifnonnull       132
							obj2 = obj1;
	//   65  125:aload           8
	//   66  127:astore          9
						else
	//*  67  129:goto            220
						if(obj1 == null)
	//*  68  132:aload           8
	//*  69  134:ifnonnull       177
						{
							obj2 = ((Object) (new SpannableStringBuilder()));
	//   70  137:new             #70  <Class SpannableStringBuilder>
	//   71  140:dup             
	//   72  141:invokespecial   #71  <Method void SpannableStringBuilder()>
	//   73  144:astore          9
							((SpannableStringBuilder) (obj2)).append(((WebvttCue) (obj)).text).append("\n").append(((WebvttCue) (obj3)).text);
	//   74  146:aload           9
	//   75  148:aload           7
	//   76  150:getfield        #75  <Field CharSequence WebvttCue.text>
	//   77  153:invokevirtual   #79  <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   78  156:ldc1            #81  <String "\n">
	//   79  158:invokevirtual   #79  <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   80  161:aload           10
	//   81  163:getfield        #75  <Field CharSequence WebvttCue.text>
	//   82  166:invokevirtual   #79  <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   83  169:pop             
							obj3 = obj;
	//   84  170:aload           7
	//   85  172:astore          10
						} else
	//*  86  174:goto            220
						{
							((SpannableStringBuilder) (obj1)).append("\n").append(((WebvttCue) (obj3)).text);
	//   87  177:aload           8
	//   88  179:ldc1            #81  <String "\n">
	//   89  181:invokevirtual   #79  <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   90  184:aload           10
	//   91  186:getfield        #75  <Field CharSequence WebvttCue.text>
	//   92  189:invokevirtual   #79  <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   93  192:pop             
							obj2 = obj1;
	//   94  193:aload           8
	//   95  195:astore          9
							obj3 = obj;
	//   96  197:aload           7
	//   97  199:astore          10
						}
					} else
	//*  98  201:goto            220
					{
						arraylist1.add(obj3);
	//   99  204:aload           6
	//  100  206:aload           10
	//  101  208:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//  102  211:pop             
						obj3 = obj;
	//  103  212:aload           7
	//  104  214:astore          10
						obj2 = obj1;
	//  105  216:aload           8
	//  106  218:astore          9
					}
				}
			}
			i++;
	//  107  220:iload_3         
	//  108  221:iconst_1        
	//  109  222:iadd            
	//  110  223:istore_3        
			obj1 = obj2;
	//  111  224:aload           9
	//  112  226:astore          8
			arraylist = arraylist1;
	//  113  228:aload           6
	//  114  230:astore          5
		}

	//  115  232:aload           10
	//  116  234:astore          7
	//* 117  236:goto            12
		if(obj1 != null)
	//* 118  239:aload           8
	//* 119  241:ifnull          262
			arraylist.add(((Object) (new WebvttCue(((CharSequence) (obj1))))));
	//  120  244:aload           5
	//  121  246:new             #37  <Class WebvttCue>
	//  122  249:dup             
	//  123  250:aload           8
	//  124  252:invokespecial   #88  <Method void WebvttCue(CharSequence)>
	//  125  255:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//  126  258:pop             
		else
	//* 127  259:goto            275
		if(obj != null)
	//* 128  262:aload           7
	//* 129  264:ifnull          275
			arraylist.add(obj);
	//  130  267:aload           5
	//  131  269:aload           7
	//  132  271:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//  133  274:pop             
		if(arraylist != null)
	//* 134  275:aload           5
	//* 135  277:ifnull          283
			return ((List) (arraylist));
	//  136  280:aload           5
	//  137  282:areturn         
		else
			return Collections.emptyList();
	//  138  283:invokestatic    #94  <Method List Collections.emptyList()>
	//  139  286:areturn         
	}

	public long getEventTime(int i)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(i >= 0)
	//*   2    2:iload_1         
	//*   3    3:iflt            11
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore_2        
		else
	//*   6    8:goto            13
			flag = false;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		Assertions.checkArgument(flag);
	//    9   13:iload_2         
	//   10   14:invokestatic    #103 <Method void Assertions.checkArgument(boolean)>
		flag = flag1;
	//   11   17:iload_3         
	//   12   18:istore_2        
		if(i < sortedCueTimesUs.length)
	//*  13   19:iload_1         
	//*  14   20:aload_0         
	//*  15   21:getfield        #52  <Field long[] sortedCueTimesUs>
	//*  16   24:arraylength     
	//*  17   25:icmpge          30
			flag = true;
	//   18   28:iconst_1        
	//   19   29:istore_2        
		Assertions.checkArgument(flag);
	//   20   30:iload_2         
	//   21   31:invokestatic    #103 <Method void Assertions.checkArgument(boolean)>
		return sortedCueTimesUs[i];
	//   22   34:aload_0         
	//   23   35:getfield        #52  <Field long[] sortedCueTimesUs>
	//   24   38:iload_1         
	//   25   39:laload          
	//   26   40:lreturn         
	}

	public int getEventTimeCount()
	{
		return sortedCueTimesUs.length;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field long[] sortedCueTimesUs>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public int getNextEventTimeIndex(long l)
	{
		int i = Util.binarySearchCeil(sortedCueTimesUs, l, false, false);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field long[] sortedCueTimesUs>
	//    2    4:lload_1         
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokestatic    #112 <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
	//    6   10:istore_3        
		if(i < sortedCueTimesUs.length)
	//*   7   11:iload_3         
	//*   8   12:aload_0         
	//*   9   13:getfield        #52  <Field long[] sortedCueTimesUs>
	//*  10   16:arraylength     
	//*  11   17:icmpge          22
			return i;
	//   12   20:iload_3         
	//   13   21:ireturn         
		else
			return -1;
	//   14   22:iconst_m1       
	//   15   23:ireturn         
	}

	private final long cueTimesUs[];
	private final List cues;
	private final int numCues;
	private final long sortedCueTimesUs[];
}
