// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			Period, UtcTimingElement

public class MediaPresentationDescription
	implements com.google.android.exoplayer.util.ManifestFetcher.RedirectingManifest
{

	public MediaPresentationDescription(long l, long l1, long l2, boolean flag, 
			long l3, long l4, UtcTimingElement utctimingelement, String s, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		availabilityStartTime = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #28  <Field long availabilityStartTime>
		duration = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #30  <Field long duration>
		minBufferTime = l2;
	//    8   14:aload_0         
	//    9   15:lload           5
	//   10   17:putfield        #32  <Field long minBufferTime>
		dynamic = flag;
	//   11   20:aload_0         
	//   12   21:iload           7
	//   13   23:putfield        #34  <Field boolean dynamic>
		minUpdatePeriod = l3;
	//   14   26:aload_0         
	//   15   27:lload           8
	//   16   29:putfield        #36  <Field long minUpdatePeriod>
		timeShiftBufferDepth = l4;
	//   17   32:aload_0         
	//   18   33:lload           10
	//   19   35:putfield        #38  <Field long timeShiftBufferDepth>
		utcTiming = utctimingelement;
	//   20   38:aload_0         
	//   21   39:aload           12
	//   22   41:putfield        #40  <Field UtcTimingElement utcTiming>
		location = s;
	//   23   44:aload_0         
	//   24   45:aload           13
	//   25   47:putfield        #42  <Field String location>
		utctimingelement = ((UtcTimingElement) (list));
	//   26   50:aload           14
	//   27   52:astore          12
		if(list == null)
	//*  28   54:aload           14
	//*  29   56:ifnonnull       64
			utctimingelement = ((UtcTimingElement) (Collections.emptyList()));
	//   30   59:invokestatic    #48  <Method List Collections.emptyList()>
	//   31   62:astore          12
		periods = ((List) (utctimingelement));
	//   32   64:aload_0         
	//   33   65:aload           12
	//   34   67:putfield        #50  <Field List periods>
	//   35   70:return          
	}

	public final String getNextManifestUri()
	{
		return location;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String location>
	//    2    4:areturn         
	}

	public final Period getPeriod(int i)
	{
		return (Period)periods.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field List periods>
	//    2    4:iload_1         
	//    3    5:invokeinterface #63  <Method Object List.get(int)>
	//    4   10:checkcast       #65  <Class Period>
	//    5   13:areturn         
	}

	public final int getPeriodCount()
	{
		return periods.size();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field List periods>
	//    2    4:invokeinterface #70  <Method int List.size()>
	//    3    9:ireturn         
	}

	public final long getPeriodDuration(int i)
	{
		if(i == periods.size() - 1)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #50  <Field List periods>
	//*   3    5:invokeinterface #70  <Method int List.size()>
	//*   4   10:iconst_1        
	//*   5   11:isub            
	//*   6   12:icmpne          51
		{
			long l = duration;
	//    7   15:aload_0         
	//    8   16:getfield        #30  <Field long duration>
	//    9   19:lstore_2        
			if(l == -1L)
	//*  10   20:lload_2         
	//*  11   21:ldc2w           #73  <Long -1L>
	//*  12   24:lcmp            
	//*  13   25:ifne            32
				return -1L;
	//   14   28:ldc2w           #73  <Long -1L>
	//   15   31:lreturn         
			else
				return l - ((Period)periods.get(i)).startMs;
	//   16   32:lload_2         
	//   17   33:aload_0         
	//   18   34:getfield        #50  <Field List periods>
	//   19   37:iload_1         
	//   20   38:invokeinterface #63  <Method Object List.get(int)>
	//   21   43:checkcast       #65  <Class Period>
	//   22   46:getfield        #77  <Field long Period.startMs>
	//   23   49:lsub            
	//   24   50:lreturn         
		} else
		{
			return ((Period)periods.get(i + 1)).startMs - ((Period)periods.get(i)).startMs;
	//   25   51:aload_0         
	//   26   52:getfield        #50  <Field List periods>
	//   27   55:iload_1         
	//   28   56:iconst_1        
	//   29   57:iadd            
	//   30   58:invokeinterface #63  <Method Object List.get(int)>
	//   31   63:checkcast       #65  <Class Period>
	//   32   66:getfield        #77  <Field long Period.startMs>
	//   33   69:aload_0         
	//   34   70:getfield        #50  <Field List periods>
	//   35   73:iload_1         
	//   36   74:invokeinterface #63  <Method Object List.get(int)>
	//   37   79:checkcast       #65  <Class Period>
	//   38   82:getfield        #77  <Field long Period.startMs>
	//   39   85:lsub            
	//   40   86:lreturn         
		}
	}

	public final long availabilityStartTime;
	public final long duration;
	public final boolean dynamic;
	public final String location;
	public final long minBufferTime;
	public final long minUpdatePeriod;
	private final List periods;
	public final long timeShiftBufferDepth;
	public final UtcTimingElement utcTiming;
}
