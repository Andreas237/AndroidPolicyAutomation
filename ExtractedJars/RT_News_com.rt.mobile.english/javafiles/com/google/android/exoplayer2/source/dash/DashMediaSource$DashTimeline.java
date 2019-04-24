// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.util.Assertions;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			DashMediaSource, DashSegmentIndex

private static final class DashMediaSource$DashTimeline extends Timeline
{

	private long getAdjustedWindowDefaultStartPositionUs(long l)
	{
		long l2 = windowDefaultStartPositionUs;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long windowDefaultStartPositionUs>
	//    2    4:lstore          6
		if(!manifest.dynamic)
	//*   3    6:aload_0         
	//*   4    7:getfield        #39  <Field DashManifest manifest>
	//*   5   10:getfield        #51  <Field boolean DashManifest.dynamic>
	//*   6   13:ifne            19
			return l2;
	//    7   16:lload           6
	//    8   18:lreturn         
		long l1 = l2;
	//    9   19:lload           6
	//   10   21:lstore          4
		if(l > 0L)
	//*  11   23:lload_1         
	//*  12   24:lconst_0        
	//*  13   25:lcmp            
	//*  14   26:ifle            49
		{
			l1 = l2 + l;
	//   15   29:lload           6
	//   16   31:lload_1         
	//   17   32:ladd            
	//   18   33:lstore          4
			if(l1 > windowDurationUs)
	//*  19   35:lload           4
	//*  20   37:aload_0         
	//*  21   38:getfield        #35  <Field long windowDurationUs>
	//*  22   41:lcmp            
	//*  23   42:ifle            49
				return 0x1L;
	//   24   45:ldc2w           #52  <Long 0x1L>
	//   25   48:lreturn         
		}
		l2 = offsetInFirstPeriodUs + l1;
	//   26   49:aload_0         
	//   27   50:getfield        #33  <Field long offsetInFirstPeriodUs>
	//   28   53:lload           4
	//   29   55:ladd            
	//   30   56:lstore          6
		l = manifest.getPeriodDurationUs(0);
	//   31   58:aload_0         
	//   32   59:getfield        #39  <Field DashManifest manifest>
	//   33   62:iconst_0        
	//   34   63:invokevirtual   #57  <Method long DashManifest.getPeriodDurationUs(int)>
	//   35   66:lstore_1        
		int i = 0;
	//   36   67:iconst_0        
	//   37   68:istore_3        
		long l3;
		do
		{
			l3 = l;
	//   38   69:lload_1         
	//   39   70:lstore          8
			if(i >= manifest.getPeriodCount() - 1 || l2 < l3)
				break;
	//   40   72:iload_3         
	//   41   73:aload_0         
	//   42   74:getfield        #39  <Field DashManifest manifest>
	//   43   77:invokevirtual   #61  <Method int DashManifest.getPeriodCount()>
	//   44   80:iconst_1        
	//   45   81:isub            
	//   46   82:icmpge          116
	//   47   85:lload           6
	//   48   87:lload           8
	//   49   89:lcmp            
	//   50   90:iflt            116
			i++;
	//   51   93:iload_3         
	//   52   94:iconst_1        
	//   53   95:iadd            
	//   54   96:istore_3        
			l = manifest.getPeriodDurationUs(i);
	//   55   97:aload_0         
	//   56   98:getfield        #39  <Field DashManifest manifest>
	//   57  101:iload_3         
	//   58  102:invokevirtual   #57  <Method long DashManifest.getPeriodDurationUs(int)>
	//   59  105:lstore_1        
			l2 -= l3;
	//   60  106:lload           6
	//   61  108:lload           8
	//   62  110:lsub            
	//   63  111:lstore          6
		} while(true);
	//   64  113:goto            69
		Object obj = ((Object) (manifest.getPeriod(i)));
	//   65  116:aload_0         
	//   66  117:getfield        #39  <Field DashManifest manifest>
	//   67  120:iload_3         
	//   68  121:invokevirtual   #65  <Method Period DashManifest.getPeriod(int)>
	//   69  124:astore          10
		i = ((Period) (obj)).getAdaptationSetIndex(2);
	//   70  126:aload           10
	//   71  128:iconst_2        
	//   72  129:invokevirtual   #71  <Method int Period.getAdaptationSetIndex(int)>
	//   73  132:istore_3        
		if(i == -1)
	//*  74  133:iload_3         
	//*  75  134:iconst_m1       
	//*  76  135:icmpne          141
			return l1;
	//   77  138:lload           4
	//   78  140:lreturn         
		obj = ((Object) (((Representation)((AdaptationSet)((Period) (obj)).adaptationSets.get(i)).representations.get(0)).getIndex()));
	//   79  141:aload           10
	//   80  143:getfield        #75  <Field List Period.adaptationSets>
	//   81  146:iload_3         
	//   82  147:invokeinterface #81  <Method Object List.get(int)>
	//   83  152:checkcast       #83  <Class AdaptationSet>
	//   84  155:getfield        #86  <Field List AdaptationSet.representations>
	//   85  158:iconst_0        
	//   86  159:invokeinterface #81  <Method Object List.get(int)>
	//   87  164:checkcast       #88  <Class Representation>
	//   88  167:invokevirtual   #92  <Method DashSegmentIndex Representation.getIndex()>
	//   89  170:astore          10
		if(obj != null)
	//*  90  172:aload           10
	//*  91  174:ifnull          217
		{
			if(((DashSegmentIndex) (obj)).getSegmentCount(l3) == 0)
	//*  92  177:aload           10
	//*  93  179:lload           8
	//*  94  181:invokeinterface #98  <Method int DashSegmentIndex.getSegmentCount(long)>
	//*  95  186:ifne            192
				return l1;
	//   96  189:lload           4
	//   97  191:lreturn         
			else
				return (l1 + ((DashSegmentIndex) (obj)).getTimeUs(((DashSegmentIndex) (obj)).getSegmentNum(l2, l3))) - l2;
	//   98  192:lload           4
	//   99  194:aload           10
	//  100  196:aload           10
	//  101  198:lload           6
	//  102  200:lload           8
	//  103  202:invokeinterface #102 <Method long DashSegmentIndex.getSegmentNum(long, long)>
	//  104  207:invokeinterface #105 <Method long DashSegmentIndex.getTimeUs(long)>
	//  105  212:ladd            
	//  106  213:lload           6
	//  107  215:lsub            
	//  108  216:lreturn         
		} else
		{
			return l1;
	//  109  217:lload           4
	//  110  219:lreturn         
		}
	}

	public int getIndexOfPeriod(Object obj)
	{
		boolean flag = obj instanceof Integer;
	//    0    0:aload_1         
	//    1    1:instanceof      #109 <Class Integer>
	//    2    4:istore          4
		int i = -1;
	//    3    6:iconst_m1       
	//    4    7:istore_2        
		if(!flag)
	//*   5    8:iload           4
	//*   6   10:ifne            15
			return -1;
	//    7   13:iconst_m1       
	//    8   14:ireturn         
		int j = ((Integer)obj).intValue();
	//    9   15:aload_1         
	//   10   16:checkcast       #109 <Class Integer>
	//   11   19:invokevirtual   #112 <Method int Integer.intValue()>
	//   12   22:istore_3        
		if(j >= firstPeriodId)
	//*  13   23:iload_3         
	//*  14   24:aload_0         
	//*  15   25:getfield        #31  <Field int firstPeriodId>
	//*  16   28:icmplt          53
		{
			if(j >= firstPeriodId + getPeriodCount())
	//*  17   31:iload_3         
	//*  18   32:aload_0         
	//*  19   33:getfield        #31  <Field int firstPeriodId>
	//*  20   36:aload_0         
	//*  21   37:invokevirtual   #113 <Method int getPeriodCount()>
	//*  22   40:iadd            
	//*  23   41:icmplt          46
				return -1;
	//   24   44:iconst_m1       
	//   25   45:ireturn         
			i = j - firstPeriodId;
	//   26   46:iload_3         
	//   27   47:aload_0         
	//   28   48:getfield        #31  <Field int firstPeriodId>
	//   29   51:isub            
	//   30   52:istore_2        
		}
		return i;
	//   31   53:iload_2         
	//   32   54:ireturn         
	}

	public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean flag)
	{
		Assertions.checkIndex(i, 0, manifest.getPeriodCount());
	//    0    0:iload_1         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #39  <Field DashManifest manifest>
	//    4    6:invokevirtual   #61  <Method int DashManifest.getPeriodCount()>
	//    5    9:invokestatic    #120 <Method int Assertions.checkIndex(int, int, int)>
	//    6   12:pop             
		Integer integer = null;
	//    7   13:aconst_null     
	//    8   14:astore          5
		String s;
		if(flag)
	//*   9   16:iload_3         
	//*  10   17:ifeq            36
			s = manifest.getPeriod(i).id;
	//   11   20:aload_0         
	//   12   21:getfield        #39  <Field DashManifest manifest>
	//   13   24:iload_1         
	//   14   25:invokevirtual   #65  <Method Period DashManifest.getPeriod(int)>
	//   15   28:getfield        #124 <Field String Period.id>
	//   16   31:astore          4
		else
	//*  17   33:goto            39
			s = null;
	//   18   36:aconst_null     
	//   19   37:astore          4
		if(flag)
	//*  20   39:iload_3         
	//*  21   40:ifeq            65
			integer = Integer.valueOf(firstPeriodId + Assertions.checkIndex(i, 0, manifest.getPeriodCount()));
	//   22   43:aload_0         
	//   23   44:getfield        #31  <Field int firstPeriodId>
	//   24   47:iload_1         
	//   25   48:iconst_0        
	//   26   49:aload_0         
	//   27   50:getfield        #39  <Field DashManifest manifest>
	//   28   53:invokevirtual   #61  <Method int DashManifest.getPeriodCount()>
	//   29   56:invokestatic    #120 <Method int Assertions.checkIndex(int, int, int)>
	//   30   59:iadd            
	//   31   60:invokestatic    #128 <Method Integer Integer.valueOf(int)>
	//   32   63:astore          5
		return period.set(((Object) (s)), ((Object) (integer)), 0, manifest.getPeriodDurationUs(i), C.msToUs(manifest.getPeriod(i).startMs - manifest.getPeriod(0).startMs) - offsetInFirstPeriodUs);
	//   33   65:aload_2         
	//   34   66:aload           4
	//   35   68:aload           5
	//   36   70:iconst_0        
	//   37   71:aload_0         
	//   38   72:getfield        #39  <Field DashManifest manifest>
	//   39   75:iload_1         
	//   40   76:invokevirtual   #57  <Method long DashManifest.getPeriodDurationUs(int)>
	//   41   79:aload_0         
	//   42   80:getfield        #39  <Field DashManifest manifest>
	//   43   83:iload_1         
	//   44   84:invokevirtual   #65  <Method Period DashManifest.getPeriod(int)>
	//   45   87:getfield        #131 <Field long Period.startMs>
	//   46   90:aload_0         
	//   47   91:getfield        #39  <Field DashManifest manifest>
	//   48   94:iconst_0        
	//   49   95:invokevirtual   #65  <Method Period DashManifest.getPeriod(int)>
	//   50   98:getfield        #131 <Field long Period.startMs>
	//   51  101:lsub            
	//   52  102:invokestatic    #136 <Method long C.msToUs(long)>
	//   53  105:aload_0         
	//   54  106:getfield        #33  <Field long offsetInFirstPeriodUs>
	//   55  109:lsub            
	//   56  110:invokevirtual   #142 <Method com.google.android.exoplayer2.Timeline$Period com.google.android.exoplayer2.Timeline$Period.set(Object, Object, int, long, long)>
	//   57  113:areturn         
	}

	public int getPeriodCount()
	{
		return manifest.getPeriodCount();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field DashManifest manifest>
	//    2    4:invokevirtual   #61  <Method int DashManifest.getPeriodCount()>
	//    3    7:ireturn         
	}

	public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, boolean flag, long l)
	{
		Assertions.checkIndex(i, 0, 1);
	//    0    0:iload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_1        
	//    3    3:invokestatic    #120 <Method int Assertions.checkIndex(int, int, int)>
	//    4    6:pop             
		l = getAdjustedWindowDefaultStartPositionUs(l);
	//    5    7:aload_0         
	//    6    8:lload           4
	//    7   10:invokespecial   #146 <Method long getAdjustedWindowDefaultStartPositionUs(long)>
	//    8   13:lstore          4
		Object obj;
		if(flag)
	//*   9   15:iload_3         
	//*  10   16:ifeq            28
			obj = windowTag;
	//   11   19:aload_0         
	//   12   20:getfield        #41  <Field Object windowTag>
	//   13   23:astore          6
		else
	//*  14   25:goto            34
			obj = null;
	//   15   28:aconst_null     
	//   16   29:astore          6
	//*  17   31:goto            25
		return window.set(obj, presentationStartTimeMs, windowStartTimeMs, true, manifest.dynamic, l, windowDurationUs, 0, manifest.getPeriodCount() - 1, offsetInFirstPeriodUs);
	//   18   34:aload_2         
	//   19   35:aload           6
	//   20   37:aload_0         
	//   21   38:getfield        #27  <Field long presentationStartTimeMs>
	//   22   41:aload_0         
	//   23   42:getfield        #29  <Field long windowStartTimeMs>
	//   24   45:iconst_1        
	//   25   46:aload_0         
	//   26   47:getfield        #39  <Field DashManifest manifest>
	//   27   50:getfield        #51  <Field boolean DashManifest.dynamic>
	//   28   53:lload           4
	//   29   55:aload_0         
	//   30   56:getfield        #35  <Field long windowDurationUs>
	//   31   59:iconst_0        
	//   32   60:aload_0         
	//   33   61:getfield        #39  <Field DashManifest manifest>
	//   34   64:invokevirtual   #61  <Method int DashManifest.getPeriodCount()>
	//   35   67:iconst_1        
	//   36   68:isub            
	//   37   69:aload_0         
	//   38   70:getfield        #33  <Field long offsetInFirstPeriodUs>
	//   39   73:invokevirtual   #151 <Method com.google.android.exoplayer2.Timeline$Window com.google.android.exoplayer2.Timeline$Window.set(Object, long, long, boolean, boolean, long, long, int, int, long)>
	//   40   76:areturn         
	}

	public int getWindowCount()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final int firstPeriodId;
	private final DashManifest manifest;
	private final long offsetInFirstPeriodUs;
	private final long presentationStartTimeMs;
	private final long windowDefaultStartPositionUs;
	private final long windowDurationUs;
	private final long windowStartTimeMs;
	private final Object windowTag;

	public DashMediaSource$DashTimeline(long l, long l1, int i, long l2, 
			long l3, long l4, DashManifest dashmanifest, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Timeline()>
		presentationStartTimeMs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #27  <Field long presentationStartTimeMs>
		windowStartTimeMs = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #29  <Field long windowStartTimeMs>
		firstPeriodId = i;
	//    8   14:aload_0         
	//    9   15:iload           5
	//   10   17:putfield        #31  <Field int firstPeriodId>
		offsetInFirstPeriodUs = l2;
	//   11   20:aload_0         
	//   12   21:lload           6
	//   13   23:putfield        #33  <Field long offsetInFirstPeriodUs>
		windowDurationUs = l3;
	//   14   26:aload_0         
	//   15   27:lload           8
	//   16   29:putfield        #35  <Field long windowDurationUs>
		windowDefaultStartPositionUs = l4;
	//   17   32:aload_0         
	//   18   33:lload           10
	//   19   35:putfield        #37  <Field long windowDefaultStartPositionUs>
		manifest = dashmanifest;
	//   20   38:aload_0         
	//   21   39:aload           12
	//   22   41:putfield        #39  <Field DashManifest manifest>
		windowTag = obj;
	//   23   44:aload_0         
	//   24   45:aload           13
	//   25   47:putfield        #41  <Field Object windowTag>
	//   26   50:return          
	}
}
