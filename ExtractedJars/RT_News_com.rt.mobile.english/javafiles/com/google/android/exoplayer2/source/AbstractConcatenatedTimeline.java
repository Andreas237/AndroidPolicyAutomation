// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;

// Referenced classes of package com.google.android.exoplayer2.source:
//			ShuffleOrder

abstract class AbstractConcatenatedTimeline extends Timeline
{

	public AbstractConcatenatedTimeline(boolean flag, ShuffleOrder shuffleorder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Timeline()>
		isAtomic = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field boolean isAtomic>
		shuffleOrder = shuffleorder;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field ShuffleOrder shuffleOrder>
		childCount = shuffleorder.getLength();
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokeinterface #25  <Method int ShuffleOrder.getLength()>
	//   11   21:putfield        #27  <Field int childCount>
	//   12   24:return          
	}

	private int getNextChildIndex(int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            15
			return shuffleOrder.getNextIndex(i);
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field ShuffleOrder shuffleOrder>
	//    4    8:iload_1         
	//    5    9:invokeinterface #34  <Method int ShuffleOrder.getNextIndex(int)>
	//    6   14:ireturn         
		if(i < childCount - 1)
	//*   7   15:iload_1         
	//*   8   16:aload_0         
	//*   9   17:getfield        #27  <Field int childCount>
	//*  10   20:iconst_1        
	//*  11   21:isub            
	//*  12   22:icmpge          29
			return i + 1;
	//   13   25:iload_1         
	//   14   26:iconst_1        
	//   15   27:iadd            
	//   16   28:ireturn         
		else
			return -1;
	//   17   29:iconst_m1       
	//   18   30:ireturn         
	}

	private int getPreviousChildIndex(int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            15
			return shuffleOrder.getPreviousIndex(i);
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field ShuffleOrder shuffleOrder>
	//    4    8:iload_1         
	//    5    9:invokeinterface #38  <Method int ShuffleOrder.getPreviousIndex(int)>
	//    6   14:ireturn         
		if(i > 0)
	//*   7   15:iload_1         
	//*   8   16:ifle            23
			return i - 1;
	//    9   19:iload_1         
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:ireturn         
		else
			return -1;
	//   13   23:iconst_m1       
	//   14   24:ireturn         
	}

	protected abstract int getChildIndexByChildUid(Object obj);

	protected abstract int getChildIndexByPeriodIndex(int i);

	protected abstract int getChildIndexByWindowIndex(int i);

	protected abstract Object getChildUidByChildIndex(int i);

	protected abstract int getFirstPeriodIndexByChildIndex(int i);

	public int getFirstWindowIndex(boolean flag)
	{
		if(childCount == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field int childCount>
	//*   2    4:ifne            9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		boolean flag1 = isAtomic;
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field boolean isAtomic>
	//    7   13:istore          4
		int i = 0;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		if(flag1)
	//*  10   17:iload           4
	//*  11   19:ifeq            24
			flag = false;
	//   12   22:iconst_0        
	//   13   23:istore_1        
		if(flag)
	//*  14   24:iload_1         
	//*  15   25:ifeq            38
			i = shuffleOrder.getFirstIndex();
	//   16   28:aload_0         
	//   17   29:getfield        #19  <Field ShuffleOrder shuffleOrder>
	//   18   32:invokeinterface #50  <Method int ShuffleOrder.getFirstIndex()>
	//   19   37:istore_2        
		while(getTimelineByChildIndex(i).isEmpty()) 
	//*  20   38:aload_0         
	//*  21   39:iload_2         
	//*  22   40:invokevirtual   #54  <Method Timeline getTimelineByChildIndex(int)>
	//*  23   43:invokevirtual   #58  <Method boolean Timeline.isEmpty()>
	//*  24   46:ifeq            65
		{
			int j = getNextChildIndex(i, flag);
	//   25   49:aload_0         
	//   26   50:iload_2         
	//   27   51:iload_1         
	//   28   52:invokespecial   #60  <Method int getNextChildIndex(int, boolean)>
	//   29   55:istore_3        
			i = j;
	//   30   56:iload_3         
	//   31   57:istore_2        
			if(j == -1)
	//*  32   58:iload_3         
	//*  33   59:iconst_m1       
	//*  34   60:icmpne          38
				return -1;
	//   35   63:iconst_m1       
	//   36   64:ireturn         
		}
		return getFirstWindowIndexByChildIndex(i) + getTimelineByChildIndex(i).getFirstWindowIndex(flag);
	//   37   65:aload_0         
	//   38   66:iload_2         
	//   39   67:invokevirtual   #63  <Method int getFirstWindowIndexByChildIndex(int)>
	//   40   70:aload_0         
	//   41   71:iload_2         
	//   42   72:invokevirtual   #54  <Method Timeline getTimelineByChildIndex(int)>
	//   43   75:iload_1         
	//   44   76:invokevirtual   #65  <Method int Timeline.getFirstWindowIndex(boolean)>
	//   45   79:iadd            
	//   46   80:ireturn         
	}

	protected abstract int getFirstWindowIndexByChildIndex(int i);

	public final int getIndexOfPeriod(Object obj)
	{
		if(!(obj instanceof Pair))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #68  <Class Pair>
	//*   2    4:ifne            9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		Object obj1 = ((Object) ((Pair)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #68  <Class Pair>
	//    7   13:astore          4
		obj = ((Pair) (obj1)).first;
	//    8   15:aload           4
	//    9   17:getfield        #72  <Field Object Pair.first>
	//   10   20:astore_1        
		obj1 = ((Pair) (obj1)).second;
	//   11   21:aload           4
	//   12   23:getfield        #75  <Field Object Pair.second>
	//   13   26:astore          4
		int i = getChildIndexByChildUid(obj);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #77  <Method int getChildIndexByChildUid(Object)>
	//   17   33:istore_2        
		if(i == -1)
	//*  18   34:iload_2         
	//*  19   35:iconst_m1       
	//*  20   36:icmpne          41
			return -1;
	//   21   39:iconst_m1       
	//   22   40:ireturn         
		int j = getTimelineByChildIndex(i).getIndexOfPeriod(obj1);
	//   23   41:aload_0         
	//   24   42:iload_2         
	//   25   43:invokevirtual   #54  <Method Timeline getTimelineByChildIndex(int)>
	//   26   46:aload           4
	//   27   48:invokevirtual   #79  <Method int Timeline.getIndexOfPeriod(Object)>
	//   28   51:istore_3        
		if(j == -1)
	//*  29   52:iload_3         
	//*  30   53:iconst_m1       
	//*  31   54:icmpne          59
			return -1;
	//   32   57:iconst_m1       
	//   33   58:ireturn         
		else
			return getFirstPeriodIndexByChildIndex(i) + j;
	//   34   59:aload_0         
	//   35   60:iload_2         
	//   36   61:invokevirtual   #81  <Method int getFirstPeriodIndexByChildIndex(int)>
	//   37   64:iload_3         
	//   38   65:iadd            
	//   39   66:ireturn         
	}

	public int getLastWindowIndex(boolean flag)
	{
		if(childCount == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field int childCount>
	//*   2    4:ifne            9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		if(isAtomic)
	//*   5    9:aload_0         
	//*   6   10:getfield        #17  <Field boolean isAtomic>
	//*   7   13:ifeq            18
			flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_1        
		int i;
		if(flag)
	//*  10   18:iload_1         
	//*  11   19:ifeq            35
			i = shuffleOrder.getLastIndex();
	//   12   22:aload_0         
	//   13   23:getfield        #19  <Field ShuffleOrder shuffleOrder>
	//   14   26:invokeinterface #85  <Method int ShuffleOrder.getLastIndex()>
	//   15   31:istore_2        
		else
	//*  16   32:goto            42
			i = childCount - 1;
	//   17   35:aload_0         
	//   18   36:getfield        #27  <Field int childCount>
	//   19   39:iconst_1        
	//   20   40:isub            
	//   21   41:istore_2        
		while(getTimelineByChildIndex(i).isEmpty()) 
	//*  22   42:aload_0         
	//*  23   43:iload_2         
	//*  24   44:invokevirtual   #54  <Method Timeline getTimelineByChildIndex(int)>
	//*  25   47:invokevirtual   #58  <Method boolean Timeline.isEmpty()>
	//*  26   50:ifeq            69
		{
			int j = getPreviousChildIndex(i, flag);
	//   27   53:aload_0         
	//   28   54:iload_2         
	//   29   55:iload_1         
	//   30   56:invokespecial   #87  <Method int getPreviousChildIndex(int, boolean)>
	//   31   59:istore_3        
			i = j;
	//   32   60:iload_3         
	//   33   61:istore_2        
			if(j == -1)
	//*  34   62:iload_3         
	//*  35   63:iconst_m1       
	//*  36   64:icmpne          42
				return -1;
	//   37   67:iconst_m1       
	//   38   68:ireturn         
		}
		return getFirstWindowIndexByChildIndex(i) + getTimelineByChildIndex(i).getLastWindowIndex(flag);
	//   39   69:aload_0         
	//   40   70:iload_2         
	//   41   71:invokevirtual   #63  <Method int getFirstWindowIndexByChildIndex(int)>
	//   42   74:aload_0         
	//   43   75:iload_2         
	//   44   76:invokevirtual   #54  <Method Timeline getTimelineByChildIndex(int)>
	//   45   79:iload_1         
	//   46   80:invokevirtual   #89  <Method int Timeline.getLastWindowIndex(boolean)>
	//   47   83:iadd            
	//   48   84:ireturn         
	}

	public int getNextWindowIndex(int i, int j, boolean flag)
	{
		boolean flag2 = isAtomic;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field boolean isAtomic>
	//    2    4:istore          8
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		int k = j;
	//    5    9:iload_2         
	//    6   10:istore          4
		if(flag2)
	//*   7   12:iload           8
	//*   8   14:ifeq            30
		{
			k = j;
	//    9   17:iload_2         
	//   10   18:istore          4
			if(j == 1)
	//*  11   20:iload_2         
	//*  12   21:iconst_1        
	//*  13   22:icmpne          28
				k = 2;
	//   14   25:iconst_2        
	//   15   26:istore          4
			flag = false;
	//   16   28:iconst_0        
	//   17   29:istore_3        
		}
		int l = getChildIndexByWindowIndex(i);
	//   18   30:aload_0         
	//   19   31:iload_1         
	//   20   32:invokevirtual   #93  <Method int getChildIndexByWindowIndex(int)>
	//   21   35:istore          6
		int i1 = getFirstWindowIndexByChildIndex(l);
	//   22   37:aload_0         
	//   23   38:iload           6
	//   24   40:invokevirtual   #63  <Method int getFirstWindowIndexByChildIndex(int)>
	//   25   43:istore          7
		Timeline timeline = getTimelineByChildIndex(l);
	//   26   45:aload_0         
	//   27   46:iload           6
	//   28   48:invokevirtual   #54  <Method Timeline getTimelineByChildIndex(int)>
	//   29   51:astore          9
		if(k == 2)
	//*  30   53:iload           4
	//*  31   55:iconst_2        
	//*  32   56:icmpne          65
			j = ((int) (flag1));
	//   33   59:iload           5
	//   34   61:istore_2        
		else
	//*  35   62:goto            68
			j = k;
	//   36   65:iload           4
	//   37   67:istore_2        
		i = timeline.getNextWindowIndex(i - i1, j, flag);
	//   38   68:aload           9
	//   39   70:iload_1         
	//   40   71:iload           7
	//   41   73:isub            
	//   42   74:iload_2         
	//   43   75:iload_3         
	//   44   76:invokevirtual   #95  <Method int Timeline.getNextWindowIndex(int, int, boolean)>
	//   45   79:istore_1        
		if(i != -1)
	//*  46   80:iload_1         
	//*  47   81:iconst_m1       
	//*  48   82:icmpeq          90
			return i1 + i;
	//   49   85:iload           7
	//   50   87:iload_1         
	//   51   88:iadd            
	//   52   89:ireturn         
		for(i = getNextChildIndex(l, flag); i != -1 && getTimelineByChildIndex(i).isEmpty(); i = getNextChildIndex(i, flag));
	//   53   90:aload_0         
	//   54   91:iload           6
	//   55   93:iload_3         
	//   56   94:invokespecial   #60  <Method int getNextChildIndex(int, boolean)>
	//   57   97:istore_1        
	//   58   98:iload_1         
	//   59   99:iconst_m1       
	//   60  100:icmpeq          124
	//   61  103:aload_0         
	//   62  104:iload_1         
	//   63  105:invokevirtual   #54  <Method Timeline getTimelineByChildIndex(int)>
	//   64  108:invokevirtual   #58  <Method boolean Timeline.isEmpty()>
	//   65  111:ifeq            124
	//   66  114:aload_0         
	//   67  115:iload_1         
	//   68  116:iload_3         
	//   69  117:invokespecial   #60  <Method int getNextChildIndex(int, boolean)>
	//   70  120:istore_1        
	//*  71  121:goto            98
		if(i != -1)
	//*  72  124:iload_1         
	//*  73  125:iconst_m1       
	//*  74  126:icmpeq          145
			return getFirstWindowIndexByChildIndex(i) + getTimelineByChildIndex(i).getFirstWindowIndex(flag);
	//   75  129:aload_0         
	//   76  130:iload_1         
	//   77  131:invokevirtual   #63  <Method int getFirstWindowIndexByChildIndex(int)>
	//   78  134:aload_0         
	//   79  135:iload_1         
	//   80  136:invokevirtual   #54  <Method Timeline getTimelineByChildIndex(int)>
	//   81  139:iload_3         
	//   82  140:invokevirtual   #65  <Method int Timeline.getFirstWindowIndex(boolean)>
	//   83  143:iadd            
	//   84  144:ireturn         
		if(k == 2)
	//*  85  145:iload           4
	//*  86  147:iconst_2        
	//*  87  148:icmpne          157
			return getFirstWindowIndex(flag);
	//   88  151:aload_0         
	//   89  152:iload_3         
	//   90  153:invokevirtual   #96  <Method int getFirstWindowIndex(boolean)>
	//   91  156:ireturn         
		else
			return -1;
	//   92  157:iconst_m1       
	//   93  158:ireturn         
	}

	public final com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean flag)
	{
		int j = getChildIndexByPeriodIndex(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #100 <Method int getChildIndexByPeriodIndex(int)>
	//    3    5:istore          4
		int k = getFirstWindowIndexByChildIndex(j);
	//    4    7:aload_0         
	//    5    8:iload           4
	//    6   10:invokevirtual   #63  <Method int getFirstWindowIndexByChildIndex(int)>
	//    7   13:istore          5
		int l = getFirstPeriodIndexByChildIndex(j);
	//    8   15:aload_0         
	//    9   16:iload           4
	//   10   18:invokevirtual   #81  <Method int getFirstPeriodIndexByChildIndex(int)>
	//   11   21:istore          6
		getTimelineByChildIndex(j).getPeriod(i - l, period, flag);
	//   12   23:aload_0         
	//   13   24:iload           4
	//   14   26:invokevirtual   #54  <Method Timeline getTimelineByChildIndex(int)>
	//   15   29:iload_1         
	//   16   30:iload           6
	//   17   32:isub            
	//   18   33:aload_2         
	//   19   34:iload_3         
	//   20   35:invokevirtual   #102 <Method com.google.android.exoplayer2.Timeline$Period Timeline.getPeriod(int, com.google.android.exoplayer2.Timeline$Period, boolean)>
	//   21   38:pop             
		period.windowIndex = period.windowIndex + k;
	//   22   39:aload_2         
	//   23   40:aload_2         
	//   24   41:getfield        #107 <Field int com.google.android.exoplayer2.Timeline$Period.windowIndex>
	//   25   44:iload           5
	//   26   46:iadd            
	//   27   47:putfield        #107 <Field int com.google.android.exoplayer2.Timeline$Period.windowIndex>
		if(flag)
	//*  28   50:iload_3         
	//*  29   51:ifeq            71
			period.uid = ((Object) (Pair.create(getChildUidByChildIndex(j), period.uid)));
	//   30   54:aload_2         
	//   31   55:aload_0         
	//   32   56:iload           4
	//   33   58:invokevirtual   #109 <Method Object getChildUidByChildIndex(int)>
	//   34   61:aload_2         
	//   35   62:getfield        #112 <Field Object com.google.android.exoplayer2.Timeline$Period.uid>
	//   36   65:invokestatic    #116 <Method Pair Pair.create(Object, Object)>
	//   37   68:putfield        #112 <Field Object com.google.android.exoplayer2.Timeline$Period.uid>
		return period;
	//   38   71:aload_2         
	//   39   72:areturn         
	}

	public int getPreviousWindowIndex(int i, int j, boolean flag)
	{
		boolean flag2 = isAtomic;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field boolean isAtomic>
	//    2    4:istore          8
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		int k = j;
	//    5    9:iload_2         
	//    6   10:istore          4
		if(flag2)
	//*   7   12:iload           8
	//*   8   14:ifeq            30
		{
			k = j;
	//    9   17:iload_2         
	//   10   18:istore          4
			if(j == 1)
	//*  11   20:iload_2         
	//*  12   21:iconst_1        
	//*  13   22:icmpne          28
				k = 2;
	//   14   25:iconst_2        
	//   15   26:istore          4
			flag = false;
	//   16   28:iconst_0        
	//   17   29:istore_3        
		}
		int l = getChildIndexByWindowIndex(i);
	//   18   30:aload_0         
	//   19   31:iload_1         
	//   20   32:invokevirtual   #93  <Method int getChildIndexByWindowIndex(int)>
	//   21   35:istore          6
		int i1 = getFirstWindowIndexByChildIndex(l);
	//   22   37:aload_0         
	//   23   38:iload           6
	//   24   40:invokevirtual   #63  <Method int getFirstWindowIndexByChildIndex(int)>
	//   25   43:istore          7
		Timeline timeline = getTimelineByChildIndex(l);
	//   26   45:aload_0         
	//   27   46:iload           6
	//   28   48:invokevirtual   #54  <Method Timeline getTimelineByChildIndex(int)>
	//   29   51:astore          9
		if(k == 2)
	//*  30   53:iload           4
	//*  31   55:iconst_2        
	//*  32   56:icmpne          65
			j = ((int) (flag1));
	//   33   59:iload           5
	//   34   61:istore_2        
		else
	//*  35   62:goto            68
			j = k;
	//   36   65:iload           4
	//   37   67:istore_2        
		i = timeline.getPreviousWindowIndex(i - i1, j, flag);
	//   38   68:aload           9
	//   39   70:iload_1         
	//   40   71:iload           7
	//   41   73:isub            
	//   42   74:iload_2         
	//   43   75:iload_3         
	//   44   76:invokevirtual   #119 <Method int Timeline.getPreviousWindowIndex(int, int, boolean)>
	//   45   79:istore_1        
		if(i != -1)
	//*  46   80:iload_1         
	//*  47   81:iconst_m1       
	//*  48   82:icmpeq          90
			return i1 + i;
	//   49   85:iload           7
	//   50   87:iload_1         
	//   51   88:iadd            
	//   52   89:ireturn         
		for(i = getPreviousChildIndex(l, flag); i != -1 && getTimelineByChildIndex(i).isEmpty(); i = getPreviousChildIndex(i, flag));
	//   53   90:aload_0         
	//   54   91:iload           6
	//   55   93:iload_3         
	//   56   94:invokespecial   #87  <Method int getPreviousChildIndex(int, boolean)>
	//   57   97:istore_1        
	//   58   98:iload_1         
	//   59   99:iconst_m1       
	//   60  100:icmpeq          124
	//   61  103:aload_0         
	//   62  104:iload_1         
	//   63  105:invokevirtual   #54  <Method Timeline getTimelineByChildIndex(int)>
	//   64  108:invokevirtual   #58  <Method boolean Timeline.isEmpty()>
	//   65  111:ifeq            124
	//   66  114:aload_0         
	//   67  115:iload_1         
	//   68  116:iload_3         
	//   69  117:invokespecial   #87  <Method int getPreviousChildIndex(int, boolean)>
	//   70  120:istore_1        
	//*  71  121:goto            98
		if(i != -1)
	//*  72  124:iload_1         
	//*  73  125:iconst_m1       
	//*  74  126:icmpeq          145
			return getFirstWindowIndexByChildIndex(i) + getTimelineByChildIndex(i).getLastWindowIndex(flag);
	//   75  129:aload_0         
	//   76  130:iload_1         
	//   77  131:invokevirtual   #63  <Method int getFirstWindowIndexByChildIndex(int)>
	//   78  134:aload_0         
	//   79  135:iload_1         
	//   80  136:invokevirtual   #54  <Method Timeline getTimelineByChildIndex(int)>
	//   81  139:iload_3         
	//   82  140:invokevirtual   #89  <Method int Timeline.getLastWindowIndex(boolean)>
	//   83  143:iadd            
	//   84  144:ireturn         
		if(k == 2)
	//*  85  145:iload           4
	//*  86  147:iconst_2        
	//*  87  148:icmpne          157
			return getLastWindowIndex(flag);
	//   88  151:aload_0         
	//   89  152:iload_3         
	//   90  153:invokevirtual   #120 <Method int getLastWindowIndex(boolean)>
	//   91  156:ireturn         
		else
			return -1;
	//   92  157:iconst_m1       
	//   93  158:ireturn         
	}

	protected abstract Timeline getTimelineByChildIndex(int i);

	public final com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, boolean flag, long l)
	{
		int j = getChildIndexByWindowIndex(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #93  <Method int getChildIndexByWindowIndex(int)>
	//    3    5:istore          6
		int k = getFirstWindowIndexByChildIndex(j);
	//    4    7:aload_0         
	//    5    8:iload           6
	//    6   10:invokevirtual   #63  <Method int getFirstWindowIndexByChildIndex(int)>
	//    7   13:istore          7
		int i1 = getFirstPeriodIndexByChildIndex(j);
	//    8   15:aload_0         
	//    9   16:iload           6
	//   10   18:invokevirtual   #81  <Method int getFirstPeriodIndexByChildIndex(int)>
	//   11   21:istore          8
		getTimelineByChildIndex(j).getWindow(i - k, window, flag, l);
	//   12   23:aload_0         
	//   13   24:iload           6
	//   14   26:invokevirtual   #54  <Method Timeline getTimelineByChildIndex(int)>
	//   15   29:iload_1         
	//   16   30:iload           7
	//   17   32:isub            
	//   18   33:aload_2         
	//   19   34:iload_3         
	//   20   35:lload           4
	//   21   37:invokevirtual   #124 <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window, boolean, long)>
	//   22   40:pop             
		window.firstPeriodIndex = window.firstPeriodIndex + i1;
	//   23   41:aload_2         
	//   24   42:aload_2         
	//   25   43:getfield        #129 <Field int com.google.android.exoplayer2.Timeline$Window.firstPeriodIndex>
	//   26   46:iload           8
	//   27   48:iadd            
	//   28   49:putfield        #129 <Field int com.google.android.exoplayer2.Timeline$Window.firstPeriodIndex>
		window.lastPeriodIndex = window.lastPeriodIndex + i1;
	//   29   52:aload_2         
	//   30   53:aload_2         
	//   31   54:getfield        #132 <Field int com.google.android.exoplayer2.Timeline$Window.lastPeriodIndex>
	//   32   57:iload           8
	//   33   59:iadd            
	//   34   60:putfield        #132 <Field int com.google.android.exoplayer2.Timeline$Window.lastPeriodIndex>
		return window;
	//   35   63:aload_2         
	//   36   64:areturn         
	}

	private final int childCount;
	private final boolean isAtomic;
	private final ShuffleOrder shuffleOrder;
}
