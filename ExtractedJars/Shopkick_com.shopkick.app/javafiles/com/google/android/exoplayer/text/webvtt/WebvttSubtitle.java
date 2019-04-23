// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.webvtt;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer.text.Subtitle;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.text.webvtt:
//			WebvttCue

public final class WebvttSubtitle
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
		cueTimesUs = new long[numCues * 2];
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #29  <Field int numCues>
	//   12   24:iconst_2        
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
		list = ((List) (cueTimesUs));
	//   50   88:aload_0         
	//   51   89:getfield        #31  <Field long[] cueTimesUs>
	//   52   92:astore_1        
		sortedCueTimesUs = Arrays.copyOf(((long []) (list)), list.length);
	//   53   93:aload_0         
	//   54   94:aload_1         
	//   55   95:aload_1         
	//   56   96:arraylength     
	//   57   97:invokestatic    #50  <Method long[] Arrays.copyOf(long[], int)>
	//   58  100:putfield        #52  <Field long[] sortedCueTimesUs>
		Arrays.sort(sortedCueTimesUs);
	//   59  103:aload_0         
	//   60  104:getfield        #52  <Field long[] sortedCueTimesUs>
	//   61  107:invokestatic    #56  <Method void Arrays.sort(long[])>
	//   62  110:return          
	}

	public List getCues(long l)
	{
		Object obj2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_3        
		WebvttCue webvttcue = null;
	//    4    5:aconst_null     
	//    5    6:astore          7
		Object obj;
		Object obj1;
		for(obj = ((Object) (webvttcue)); i < numCues; obj = obj1)
	//*   6    8:aload           7
	//*   7   10:astore          5
	//*   8   12:iload_3         
	//*   9   13:aload_0         
	//*  10   14:getfield        #29  <Field int numCues>
	//*  11   17:icmpge          237
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
			Object obj3 = obj2;
	//   19   31:aload           8
	//   20   33:astore          9
			WebvttCue webvttcue1 = webvttcue;
	//   21   35:aload           7
	//   22   37:astore          10
			obj1 = obj;
	//   23   39:aload           5
	//   24   41:astore          6
			if(al[j] <= l)
	//*  25   43:aload           11
	//*  26   45:iload           4
	//*  27   47:laload          
	//*  28   48:lload_1         
	//*  29   49:lcmp            
	//*  30   50:ifgt            218
			{
				obj3 = obj2;
	//   31   53:aload           8
	//   32   55:astore          9
				webvttcue1 = webvttcue;
	//   33   57:aload           7
	//   34   59:astore          10
				obj1 = obj;
	//   35   61:aload           5
	//   36   63:astore          6
				if(l < al[j + 1])
	//*  37   65:lload_1         
	//*  38   66:aload           11
	//*  39   68:iload           4
	//*  40   70:iconst_1        
	//*  41   71:iadd            
	//*  42   72:laload          
	//*  43   73:lcmp            
	//*  44   74:ifge            218
				{
					obj1 = obj;
	//   45   77:aload           5
	//   46   79:astore          6
					if(obj == null)
	//*  47   81:aload           5
	//*  48   83:ifnonnull       95
						obj1 = ((Object) (new ArrayList()));
	//   49   86:new             #63  <Class ArrayList>
	//   50   89:dup             
	//   51   90:invokespecial   #64  <Method void ArrayList()>
	//   52   93:astore          6
					webvttcue1 = (WebvttCue)cues.get(i);
	//   53   95:aload_0         
	//   54   96:getfield        #21  <Field List cues>
	//   55   99:iload_3         
	//   56  100:invokeinterface #35  <Method Object List.get(int)>
	//   57  105:checkcast       #37  <Class WebvttCue>
	//   58  108:astore          10
					if(webvttcue1.isNormalCue())
	//*  59  110:aload           10
	//*  60  112:invokevirtual   #68  <Method boolean WebvttCue.isNormalCue()>
	//*  61  115:ifeq            202
					{
						if(webvttcue == null)
	//*  62  118:aload           7
	//*  63  120:ifnonnull       130
							obj3 = obj2;
	//   64  123:aload           8
	//   65  125:astore          9
						else
	//*  66  127:goto            218
						if(obj2 == null)
	//*  67  130:aload           8
	//*  68  132:ifnonnull       175
						{
							obj3 = ((Object) (new SpannableStringBuilder()));
	//   69  135:new             #70  <Class SpannableStringBuilder>
	//   70  138:dup             
	//   71  139:invokespecial   #71  <Method void SpannableStringBuilder()>
	//   72  142:astore          9
							((SpannableStringBuilder) (obj3)).append(webvttcue.text).append("\n").append(webvttcue1.text);
	//   73  144:aload           9
	//   74  146:aload           7
	//   75  148:getfield        #75  <Field CharSequence WebvttCue.text>
	//   76  151:invokevirtual   #79  <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   77  154:ldc1            #81  <String "\n">
	//   78  156:invokevirtual   #79  <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   79  159:aload           10
	//   80  161:getfield        #75  <Field CharSequence WebvttCue.text>
	//   81  164:invokevirtual   #79  <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   82  167:pop             
							webvttcue1 = webvttcue;
	//   83  168:aload           7
	//   84  170:astore          10
						} else
	//*  85  172:goto            218
						{
							((SpannableStringBuilder) (obj2)).append("\n").append(webvttcue1.text);
	//   86  175:aload           8
	//   87  177:ldc1            #81  <String "\n">
	//   88  179:invokevirtual   #79  <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   89  182:aload           10
	//   90  184:getfield        #75  <Field CharSequence WebvttCue.text>
	//   91  187:invokevirtual   #79  <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   92  190:pop             
							obj3 = obj2;
	//   93  191:aload           8
	//   94  193:astore          9
							webvttcue1 = webvttcue;
	//   95  195:aload           7
	//   96  197:astore          10
						}
					} else
	//*  97  199:goto            218
					{
						((ArrayList) (obj1)).add(((Object) (webvttcue1)));
	//   98  202:aload           6
	//   99  204:aload           10
	//  100  206:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//  101  209:pop             
						webvttcue1 = webvttcue;
	//  102  210:aload           7
	//  103  212:astore          10
						obj3 = obj2;
	//  104  214:aload           8
	//  105  216:astore          9
					}
				}
			}
			i++;
	//  106  218:iload_3         
	//  107  219:iconst_1        
	//  108  220:iadd            
	//  109  221:istore_3        
			obj2 = obj3;
	//  110  222:aload           9
	//  111  224:astore          8
			webvttcue = webvttcue1;
	//  112  226:aload           10
	//  113  228:astore          7
		}

	//  114  230:aload           6
	//  115  232:astore          5
	//* 116  234:goto            12
		if(obj2 != null)
	//* 117  237:aload           8
	//* 118  239:ifnull          260
			((ArrayList) (obj)).add(((Object) (new WebvttCue(((CharSequence) (obj2))))));
	//  119  242:aload           5
	//  120  244:new             #37  <Class WebvttCue>
	//  121  247:dup             
	//  122  248:aload           8
	//  123  250:invokespecial   #88  <Method void WebvttCue(CharSequence)>
	//  124  253:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//  125  256:pop             
		else
	//* 126  257:goto            273
		if(webvttcue != null)
	//* 127  260:aload           7
	//* 128  262:ifnull          273
			((ArrayList) (obj)).add(((Object) (webvttcue)));
	//  129  265:aload           5
	//  130  267:aload           7
	//  131  269:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//  132  272:pop             
		if(obj != null)
	//* 133  273:aload           5
	//* 134  275:ifnull          281
			return ((List) (obj));
	//  135  278:aload           5
	//  136  280:areturn         
		else
			return Collections.emptyList();
	//  137  281:invokestatic    #94  <Method List Collections.emptyList()>
	//  138  284:areturn         
	}

	public long getEventTime(int i)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
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
		if(i < sortedCueTimesUs.length)
	//*  11   17:iload_1         
	//*  12   18:aload_0         
	//*  13   19:getfield        #52  <Field long[] sortedCueTimesUs>
	//*  14   22:arraylength     
	//*  15   23:icmpge          31
			flag = flag1;
	//   16   26:iload_3         
	//   17   27:istore_2        
		else
	//*  18   28:goto            33
			flag = false;
	//   19   31:iconst_0        
	//   20   32:istore_2        
		Assertions.checkArgument(flag);
	//   21   33:iload_2         
	//   22   34:invokestatic    #103 <Method void Assertions.checkArgument(boolean)>
		return sortedCueTimesUs[i];
	//   23   37:aload_0         
	//   24   38:getfield        #52  <Field long[] sortedCueTimesUs>
	//   25   41:iload_1         
	//   26   42:laload          
	//   27   43:lreturn         
	}

	public int getEventTimeCount()
	{
		return sortedCueTimesUs.length;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field long[] sortedCueTimesUs>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public long getLastEventTime()
	{
		if(getEventTimeCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #108 <Method int getEventTimeCount()>
	//*   2    4:ifne            11
		{
			return -1L;
	//    3    7:ldc2w           #109 <Long -1L>
	//    4   10:lreturn         
		} else
		{
			long al[] = sortedCueTimesUs;
	//    5   11:aload_0         
	//    6   12:getfield        #52  <Field long[] sortedCueTimesUs>
	//    7   15:astore_1        
			return al[al.length - 1];
	//    8   16:aload_1         
	//    9   17:aload_1         
	//   10   18:arraylength     
	//   11   19:iconst_1        
	//   12   20:isub            
	//   13   21:laload          
	//   14   22:lreturn         
		}
	}

	public int getNextEventTimeIndex(long l)
	{
		int i = Util.binarySearchCeil(sortedCueTimesUs, l, false, false);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field long[] sortedCueTimesUs>
	//    2    4:lload_1         
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokestatic    #118 <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
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
