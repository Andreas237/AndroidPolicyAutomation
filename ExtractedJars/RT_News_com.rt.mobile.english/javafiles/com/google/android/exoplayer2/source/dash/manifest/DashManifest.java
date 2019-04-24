// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.offline.FilterableManifest;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source.dash.manifest:
//			RepresentationKey, AdaptationSet, Representation, Period, 
//			UtcTimingElement

public class DashManifest
	implements FilterableManifest
{

	public DashManifest(long l, long l1, long l2, boolean flag, 
			long l3, long l4, long l5, long l6, UtcTimingElement utctimingelement, Uri uri, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		availabilityStartTimeMs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #31  <Field long availabilityStartTimeMs>
		durationMs = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #33  <Field long durationMs>
		minBufferTimeMs = l2;
	//    8   14:aload_0         
	//    9   15:lload           5
	//   10   17:putfield        #35  <Field long minBufferTimeMs>
		dynamic = flag;
	//   11   20:aload_0         
	//   12   21:iload           7
	//   13   23:putfield        #37  <Field boolean dynamic>
		minUpdatePeriodMs = l3;
	//   14   26:aload_0         
	//   15   27:lload           8
	//   16   29:putfield        #39  <Field long minUpdatePeriodMs>
		timeShiftBufferDepthMs = l4;
	//   17   32:aload_0         
	//   18   33:lload           10
	//   19   35:putfield        #41  <Field long timeShiftBufferDepthMs>
		suggestedPresentationDelayMs = l5;
	//   20   38:aload_0         
	//   21   39:lload           12
	//   22   41:putfield        #43  <Field long suggestedPresentationDelayMs>
		publishTimeMs = l6;
	//   23   44:aload_0         
	//   24   45:lload           14
	//   25   47:putfield        #45  <Field long publishTimeMs>
		utcTiming = utctimingelement;
	//   26   50:aload_0         
	//   27   51:aload           16
	//   28   53:putfield        #47  <Field UtcTimingElement utcTiming>
		location = uri;
	//   29   56:aload_0         
	//   30   57:aload           17
	//   31   59:putfield        #49  <Field Uri location>
		if(list == null)
	//*  32   62:aload           18
	//*  33   64:ifnonnull       75
			list = Collections.emptyList();
	//   34   67:invokestatic    #55  <Method List Collections.emptyList()>
	//   35   70:astore          18
	//*  36   72:goto            75
		periods = list;
	//   37   75:aload_0         
	//   38   76:aload           18
	//   39   78:putfield        #57  <Field List periods>
	//   40   81:return          
	}

	private static ArrayList copyAdaptationSets(List list, LinkedList linkedlist)
	{
		RepresentationKey representationkey = (RepresentationKey)linkedlist.poll();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #68  <Method Object LinkedList.poll()>
	//    2    4:checkcast       #70  <Class RepresentationKey>
	//    3    7:astore          4
		int i = representationkey.periodIndex;
	//    4    9:aload           4
	//    5   11:getfield        #74  <Field int RepresentationKey.periodIndex>
	//    6   14:istore_2        
		ArrayList arraylist = new ArrayList();
	//    7   15:new             #76  <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #77  <Method void ArrayList()>
	//   10   22:astore          6
		RepresentationKey representationkey1;
		do
		{
			int j = representationkey.adaptationSetIndex;
	//   11   24:aload           4
	//   12   26:getfield        #80  <Field int RepresentationKey.adaptationSetIndex>
	//   13   29:istore_3        
			AdaptationSet adaptationset = (AdaptationSet)list.get(j);
	//   14   30:aload_0         
	//   15   31:iload_3         
	//   16   32:invokeinterface #86  <Method Object List.get(int)>
	//   17   37:checkcast       #88  <Class AdaptationSet>
	//   18   40:astore          7
			List list1 = adaptationset.representations;
	//   19   42:aload           7
	//   20   44:getfield        #91  <Field List AdaptationSet.representations>
	//   21   47:astore          8
			ArrayList arraylist1 = new ArrayList();
	//   22   49:new             #76  <Class ArrayList>
	//   23   52:dup             
	//   24   53:invokespecial   #77  <Method void ArrayList()>
	//   25   56:astore          9
			do
			{
				arraylist1.add(((Object) ((Representation)list1.get(representationkey.representationIndex))));
	//   26   58:aload           9
	//   27   60:aload           8
	//   28   62:aload           4
	//   29   64:getfield        #94  <Field int RepresentationKey.representationIndex>
	//   30   67:invokeinterface #86  <Method Object List.get(int)>
	//   31   72:checkcast       #96  <Class Representation>
	//   32   75:invokevirtual   #100 <Method boolean ArrayList.add(Object)>
	//   33   78:pop             
				representationkey1 = (RepresentationKey)linkedlist.poll();
	//   34   79:aload_1         
	//   35   80:invokevirtual   #68  <Method Object LinkedList.poll()>
	//   36   83:checkcast       #70  <Class RepresentationKey>
	//   37   86:astore          5
				if(representationkey1.periodIndex != i)
					break;
	//   38   88:aload           5
	//   39   90:getfield        #74  <Field int RepresentationKey.periodIndex>
	//   40   93:iload_2         
	//   41   94:icmpne          110
				representationkey = representationkey1;
	//   42   97:aload           5
	//   43   99:astore          4
			} while(representationkey1.adaptationSetIndex == j);
	//   44  101:aload           5
	//   45  103:getfield        #80  <Field int RepresentationKey.adaptationSetIndex>
	//   46  106:iload_3         
	//   47  107:icmpeq          58
			arraylist.add(((Object) (new AdaptationSet(adaptationset.id, adaptationset.type, ((List) (arraylist1)), adaptationset.accessibilityDescriptors, adaptationset.supplementalProperties))));
	//   48  110:aload           6
	//   49  112:new             #88  <Class AdaptationSet>
	//   50  115:dup             
	//   51  116:aload           7
	//   52  118:getfield        #103 <Field int AdaptationSet.id>
	//   53  121:aload           7
	//   54  123:getfield        #106 <Field int AdaptationSet.type>
	//   55  126:aload           9
	//   56  128:aload           7
	//   57  130:getfield        #109 <Field List AdaptationSet.accessibilityDescriptors>
	//   58  133:aload           7
	//   59  135:getfield        #112 <Field List AdaptationSet.supplementalProperties>
	//   60  138:invokespecial   #115 <Method void AdaptationSet(int, int, List, List, List)>
	//   61  141:invokevirtual   #100 <Method boolean ArrayList.add(Object)>
	//   62  144:pop             
			representationkey = representationkey1;
	//   63  145:aload           5
	//   64  147:astore          4
		} while(representationkey1.periodIndex == i);
	//   65  149:aload           5
	//   66  151:getfield        #74  <Field int RepresentationKey.periodIndex>
	//   67  154:iload_2         
	//   68  155:icmpeq          24
		linkedlist.addFirst(((Object) (representationkey1)));
	//   69  158:aload_1         
	//   70  159:aload           5
	//   71  161:invokevirtual   #119 <Method void LinkedList.addFirst(Object)>
		return arraylist;
	//   72  164:aload           6
	//   73  166:areturn         
	}

	public final DashManifest copy(List list)
	{
		list = ((List) (new LinkedList(((java.util.Collection) (list)))));
	//    0    0:new             #64  <Class LinkedList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #125 <Method void LinkedList(java.util.Collection)>
	//    4    8:astore_1        
		Collections.sort(list);
	//    5    9:aload_1         
	//    6   10:invokestatic    #129 <Method void Collections.sort(List)>
		((LinkedList) (list)).add(((Object) (new RepresentationKey(-1, -1, -1))));
	//    7   13:aload_1         
	//    8   14:new             #70  <Class RepresentationKey>
	//    9   17:dup             
	//   10   18:iconst_m1       
	//   11   19:iconst_m1       
	//   12   20:iconst_m1       
	//   13   21:invokespecial   #132 <Method void RepresentationKey(int, int, int)>
	//   14   24:invokevirtual   #133 <Method boolean LinkedList.add(Object)>
	//   15   27:pop             
		ArrayList arraylist = new ArrayList();
	//   16   28:new             #76  <Class ArrayList>
	//   17   31:dup             
	//   18   32:invokespecial   #77  <Method void ArrayList()>
	//   19   35:astore          10
		long l = 0L;
	//   20   37:lconst_0        
	//   21   38:lstore          4
		int i = 0;
	//   22   40:iconst_0        
	//   23   41:istore_2        
		long l1;
		do
		{
			int j = getPeriodCount();
	//   24   42:aload_0         
	//   25   43:invokevirtual   #137 <Method int getPeriodCount()>
	//   26   46:istore_3        
			l1 = 0x1L;
	//   27   47:ldc2w           #138 <Long 0x1L>
	//   28   50:lstore          6
			if(i >= j)
				break;
	//   29   52:iload_2         
	//   30   53:iload_3         
	//   31   54:icmpge          167
			if(((RepresentationKey)((LinkedList) (list)).peek()).periodIndex != i)
	//*  32   57:aload_1         
	//*  33   58:invokevirtual   #142 <Method Object LinkedList.peek()>
	//*  34   61:checkcast       #70  <Class RepresentationKey>
	//*  35   64:getfield        #74  <Field int RepresentationKey.periodIndex>
	//*  36   67:iload_2         
	//*  37   68:icmpeq          101
			{
				long l2 = getPeriodDurationMs(i);
	//   38   71:aload_0         
	//   39   72:iload_2         
	//   40   73:invokevirtual   #146 <Method long getPeriodDurationMs(int)>
	//   41   76:lstore          8
				l1 = l;
	//   42   78:lload           4
	//   43   80:lstore          6
				if(l2 != 0x1L)
	//*  44   82:lload           8
	//*  45   84:ldc2w           #138 <Long 0x1L>
	//*  46   87:lcmp            
	//*  47   88:ifeq            156
					l1 = l + l2;
	//   48   91:lload           4
	//   49   93:lload           8
	//   50   95:ladd            
	//   51   96:lstore          6
			} else
	//*  52   98:goto            156
			{
				Period period = getPeriod(i);
	//   53  101:aload_0         
	//   54  102:iload_2         
	//   55  103:invokevirtual   #150 <Method Period getPeriod(int)>
	//   56  106:astore          11
				ArrayList arraylist1 = copyAdaptationSets(period.adaptationSets, ((LinkedList) (list)));
	//   57  108:aload           11
	//   58  110:getfield        #155 <Field List Period.adaptationSets>
	//   59  113:aload_1         
	//   60  114:invokestatic    #157 <Method ArrayList copyAdaptationSets(List, LinkedList)>
	//   61  117:astore          12
				arraylist.add(((Object) (new Period(period.id, period.startMs - l, ((List) (arraylist1)), period.eventStreams))));
	//   62  119:aload           10
	//   63  121:new             #152 <Class Period>
	//   64  124:dup             
	//   65  125:aload           11
	//   66  127:getfield        #160 <Field String Period.id>
	//   67  130:aload           11
	//   68  132:getfield        #163 <Field long Period.startMs>
	//   69  135:lload           4
	//   70  137:lsub            
	//   71  138:aload           12
	//   72  140:aload           11
	//   73  142:getfield        #166 <Field List Period.eventStreams>
	//   74  145:invokespecial   #169 <Method void Period(String, long, List, List)>
	//   75  148:invokevirtual   #100 <Method boolean ArrayList.add(Object)>
	//   76  151:pop             
				l1 = l;
	//   77  152:lload           4
	//   78  154:lstore          6
			}
			i++;
	//   79  156:iload_2         
	//   80  157:iconst_1        
	//   81  158:iadd            
	//   82  159:istore_2        
			l = l1;
	//   83  160:lload           6
	//   84  162:lstore          4
		} while(true);
	//   85  164:goto            42
		if(durationMs != 0x1L)
	//*  86  167:aload_0         
	//*  87  168:getfield        #33  <Field long durationMs>
	//*  88  171:ldc2w           #138 <Long 0x1L>
	//*  89  174:lcmp            
	//*  90  175:ifeq            187
			l1 = durationMs - l;
	//   91  178:aload_0         
	//   92  179:getfield        #33  <Field long durationMs>
	//   93  182:lload           4
	//   94  184:lsub            
	//   95  185:lstore          6
		return new DashManifest(availabilityStartTimeMs, l1, minBufferTimeMs, dynamic, minUpdatePeriodMs, timeShiftBufferDepthMs, suggestedPresentationDelayMs, publishTimeMs, utcTiming, location, ((List) (arraylist)));
	//   96  187:new             #2   <Class DashManifest>
	//   97  190:dup             
	//   98  191:aload_0         
	//   99  192:getfield        #31  <Field long availabilityStartTimeMs>
	//  100  195:lload           6
	//  101  197:aload_0         
	//  102  198:getfield        #35  <Field long minBufferTimeMs>
	//  103  201:aload_0         
	//  104  202:getfield        #37  <Field boolean dynamic>
	//  105  205:aload_0         
	//  106  206:getfield        #39  <Field long minUpdatePeriodMs>
	//  107  209:aload_0         
	//  108  210:getfield        #41  <Field long timeShiftBufferDepthMs>
	//  109  213:aload_0         
	//  110  214:getfield        #43  <Field long suggestedPresentationDelayMs>
	//  111  217:aload_0         
	//  112  218:getfield        #45  <Field long publishTimeMs>
	//  113  221:aload_0         
	//  114  222:getfield        #47  <Field UtcTimingElement utcTiming>
	//  115  225:aload_0         
	//  116  226:getfield        #49  <Field Uri location>
	//  117  229:aload           10
	//  118  231:invokespecial   #171 <Method void DashManifest(long, long, long, boolean, long, long, long, long, UtcTimingElement, Uri, List)>
	//  119  234:areturn         
	}

	public volatile Object copy(List list)
	{
		return ((Object) (copy(list)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #175 <Method DashManifest copy(List)>
	//    3    5:areturn         
	}

	public final Period getPeriod(int i)
	{
		return (Period)periods.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field List periods>
	//    2    4:iload_1         
	//    3    5:invokeinterface #86  <Method Object List.get(int)>
	//    4   10:checkcast       #152 <Class Period>
	//    5   13:areturn         
	}

	public final int getPeriodCount()
	{
		return periods.size();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field List periods>
	//    2    4:invokeinterface #178 <Method int List.size()>
	//    3    9:ireturn         
	}

	public final long getPeriodDurationMs(int i)
	{
		if(i == periods.size() - 1)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #57  <Field List periods>
	//*   3    5:invokeinterface #178 <Method int List.size()>
	//*   4   10:iconst_1        
	//*   5   11:isub            
	//*   6   12:icmpne          52
		{
			if(durationMs == 0x1L)
	//*   7   15:aload_0         
	//*   8   16:getfield        #33  <Field long durationMs>
	//*   9   19:ldc2w           #138 <Long 0x1L>
	//*  10   22:lcmp            
	//*  11   23:ifne            30
				return 0x1L;
	//   12   26:ldc2w           #138 <Long 0x1L>
	//   13   29:lreturn         
			else
				return durationMs - ((Period)periods.get(i)).startMs;
	//   14   30:aload_0         
	//   15   31:getfield        #33  <Field long durationMs>
	//   16   34:aload_0         
	//   17   35:getfield        #57  <Field List periods>
	//   18   38:iload_1         
	//   19   39:invokeinterface #86  <Method Object List.get(int)>
	//   20   44:checkcast       #152 <Class Period>
	//   21   47:getfield        #163 <Field long Period.startMs>
	//   22   50:lsub            
	//   23   51:lreturn         
		} else
		{
			return ((Period)periods.get(i + 1)).startMs - ((Period)periods.get(i)).startMs;
	//   24   52:aload_0         
	//   25   53:getfield        #57  <Field List periods>
	//   26   56:iload_1         
	//   27   57:iconst_1        
	//   28   58:iadd            
	//   29   59:invokeinterface #86  <Method Object List.get(int)>
	//   30   64:checkcast       #152 <Class Period>
	//   31   67:getfield        #163 <Field long Period.startMs>
	//   32   70:aload_0         
	//   33   71:getfield        #57  <Field List periods>
	//   34   74:iload_1         
	//   35   75:invokeinterface #86  <Method Object List.get(int)>
	//   36   80:checkcast       #152 <Class Period>
	//   37   83:getfield        #163 <Field long Period.startMs>
	//   38   86:lsub            
	//   39   87:lreturn         
		}
	}

	public final long getPeriodDurationUs(int i)
	{
		return C.msToUs(getPeriodDurationMs(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #146 <Method long getPeriodDurationMs(int)>
	//    3    5:invokestatic    #185 <Method long C.msToUs(long)>
	//    4    8:lreturn         
	}

	public final long availabilityStartTimeMs;
	public final long durationMs;
	public final boolean dynamic;
	public final Uri location;
	public final long minBufferTimeMs;
	public final long minUpdatePeriodMs;
	private final List periods;
	public final long publishTimeMs;
	public final long suggestedPresentationDelayMs;
	public final long timeShiftBufferDepthMs;
	public final UtcTimingElement utcTiming;
}
