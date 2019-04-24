// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2:
//			C

public abstract class Timeline
{
	public static final class Period
	{

		public int getAdCountInAdGroup(int i)
		{
			return adPlaybackState.adGroups[i].count;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field AdPlaybackState adPlaybackState>
		//    2    4:getfield        #32  <Field com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] AdPlaybackState.adGroups>
		//    3    7:iload_1         
		//    4    8:aaload          
		//    5    9:getfield        #37  <Field int com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup.count>
		//    6   12:ireturn         
		}

		public long getAdDurationUs(int i, int j)
		{
			com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup adgroup = adPlaybackState.adGroups[i];
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field AdPlaybackState adPlaybackState>
		//    2    4:getfield        #32  <Field com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] AdPlaybackState.adGroups>
		//    3    7:iload_1         
		//    4    8:aaload          
		//    5    9:astore_3        
			if(adgroup.count != -1)
		//*   6   10:aload_3         
		//*   7   11:getfield        #37  <Field int com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup.count>
		//*   8   14:iconst_m1       
		//*   9   15:icmpeq          25
				return adgroup.durationsUs[j];
		//   10   18:aload_3         
		//   11   19:getfield        #43  <Field long[] com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup.durationsUs>
		//   12   22:iload_2         
		//   13   23:laload          
		//   14   24:lreturn         
			else
				return 0x1L;
		//   15   25:ldc2w           #44  <Long 0x1L>
		//   16   28:lreturn         
		}

		public int getAdGroupCount()
		{
			return adPlaybackState.adGroupCount;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field AdPlaybackState adPlaybackState>
		//    2    4:getfield        #50  <Field int AdPlaybackState.adGroupCount>
		//    3    7:ireturn         
		}

		public int getAdGroupIndexAfterPositionUs(long l)
		{
			return adPlaybackState.getAdGroupIndexAfterPositionUs(l);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field AdPlaybackState adPlaybackState>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #54  <Method int AdPlaybackState.getAdGroupIndexAfterPositionUs(long)>
		//    4    8:ireturn         
		}

		public int getAdGroupIndexForPositionUs(long l)
		{
			return adPlaybackState.getAdGroupIndexForPositionUs(l);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field AdPlaybackState adPlaybackState>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #57  <Method int AdPlaybackState.getAdGroupIndexForPositionUs(long)>
		//    4    8:ireturn         
		}

		public long getAdGroupTimeUs(int i)
		{
			return adPlaybackState.adGroupTimesUs[i];
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field AdPlaybackState adPlaybackState>
		//    2    4:getfield        #62  <Field long[] AdPlaybackState.adGroupTimesUs>
		//    3    7:iload_1         
		//    4    8:laload          
		//    5    9:lreturn         
		}

		public long getAdResumePositionUs()
		{
			return adPlaybackState.adResumePositionUs;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field AdPlaybackState adPlaybackState>
		//    2    4:getfield        #67  <Field long AdPlaybackState.adResumePositionUs>
		//    3    7:lreturn         
		}

		public long getDurationMs()
		{
			return C.usToMs(durationUs);
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field long durationUs>
		//    2    4:invokestatic    #76  <Method long C.usToMs(long)>
		//    3    7:lreturn         
		}

		public long getDurationUs()
		{
			return durationUs;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field long durationUs>
		//    2    4:lreturn         
		}

		public int getFirstAdIndexToPlay(int i)
		{
			return adPlaybackState.adGroups[i].getFirstAdIndexToPlay();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field AdPlaybackState adPlaybackState>
		//    2    4:getfield        #32  <Field com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] AdPlaybackState.adGroups>
		//    3    7:iload_1         
		//    4    8:aaload          
		//    5    9:invokevirtual   #80  <Method int com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup.getFirstAdIndexToPlay()>
		//    6   12:ireturn         
		}

		public int getNextAdIndexToPlay(int i, int j)
		{
			return adPlaybackState.adGroups[i].getNextAdIndexToPlay(j);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field AdPlaybackState adPlaybackState>
		//    2    4:getfield        #32  <Field com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] AdPlaybackState.adGroups>
		//    3    7:iload_1         
		//    4    8:aaload          
		//    5    9:iload_2         
		//    6   10:invokevirtual   #84  <Method int com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup.getNextAdIndexToPlay(int)>
		//    7   13:ireturn         
		}

		public long getPositionInWindowMs()
		{
			return C.usToMs(positionInWindowUs);
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field long positionInWindowUs>
		//    2    4:invokestatic    #76  <Method long C.usToMs(long)>
		//    3    7:lreturn         
		}

		public long getPositionInWindowUs()
		{
			return positionInWindowUs;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field long positionInWindowUs>
		//    2    4:lreturn         
		}

		public boolean hasPlayedAdGroup(int i)
		{
			return adPlaybackState.adGroups[i].hasUnplayedAds() ^ true;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field AdPlaybackState adPlaybackState>
		//    2    4:getfield        #32  <Field com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] AdPlaybackState.adGroups>
		//    3    7:iload_1         
		//    4    8:aaload          
		//    5    9:invokevirtual   #94  <Method boolean com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup.hasUnplayedAds()>
		//    6   12:iconst_1        
		//    7   13:ixor            
		//    8   14:ireturn         
		}

		public boolean isAdAvailable(int i, int j)
		{
			com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup adgroup = adPlaybackState.adGroups[i];
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field AdPlaybackState adPlaybackState>
		//    2    4:getfield        #32  <Field com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] AdPlaybackState.adGroups>
		//    3    7:iload_1         
		//    4    8:aaload          
		//    5    9:astore_3        
			return adgroup.count != -1 && adgroup.states[j] != 0;
		//    6   10:aload_3         
		//    7   11:getfield        #37  <Field int com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup.count>
		//    8   14:iconst_m1       
		//    9   15:icmpeq          29
		//   10   18:aload_3         
		//   11   19:getfield        #100 <Field int[] com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup.states>
		//   12   22:iload_2         
		//   13   23:iaload          
		//   14   24:ifeq            29
		//   15   27:iconst_1        
		//   16   28:ireturn         
		//   17   29:iconst_0        
		//   18   30:ireturn         
		}

		public Period set(Object obj, Object obj1, int i, long l, long l1)
		{
			return set(obj, obj1, i, l, l1, AdPlaybackState.NONE);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:lload           4
		//    5    6:lload           6
		//    6    8:getstatic       #105 <Field AdPlaybackState AdPlaybackState.NONE>
		//    7   11:invokevirtual   #108 <Method Timeline$Period set(Object, Object, int, long, long, AdPlaybackState)>
		//    8   14:areturn         
		}

		public Period set(Object obj, Object obj1, int i, long l, long l1, 
				AdPlaybackState adplaybackstate)
		{
			id = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #110 <Field Object id>
			uid = obj1;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #112 <Field Object uid>
			windowIndex = i;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #114 <Field int windowIndex>
			durationUs = l;
		//    9   15:aload_0         
		//   10   16:lload           4
		//   11   18:putfield        #70  <Field long durationUs>
			positionInWindowUs = l1;
		//   12   21:aload_0         
		//   13   22:lload           6
		//   14   24:putfield        #87  <Field long positionInWindowUs>
			adPlaybackState = adplaybackstate;
		//   15   27:aload_0         
		//   16   28:aload           8
		//   17   30:putfield        #26  <Field AdPlaybackState adPlaybackState>
			return this;
		//   18   33:aload_0         
		//   19   34:areturn         
		}

		private AdPlaybackState adPlaybackState;
		public long durationUs;
		public Object id;
		private long positionInWindowUs;
		public Object uid;
		public int windowIndex;

		public Period()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class Window
	{

		public long getDefaultPositionMs()
		{
			return C.usToMs(defaultPositionUs);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field long defaultPositionUs>
		//    2    4:invokestatic    #37  <Method long C.usToMs(long)>
		//    3    7:lreturn         
		}

		public long getDefaultPositionUs()
		{
			return defaultPositionUs;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field long defaultPositionUs>
		//    2    4:lreturn         
		}

		public long getDurationMs()
		{
			return C.usToMs(durationUs);
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field long durationUs>
		//    2    4:invokestatic    #37  <Method long C.usToMs(long)>
		//    3    7:lreturn         
		}

		public long getDurationUs()
		{
			return durationUs;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field long durationUs>
		//    2    4:lreturn         
		}

		public long getPositionInFirstPeriodMs()
		{
			return C.usToMs(positionInFirstPeriodUs);
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field long positionInFirstPeriodUs>
		//    2    4:invokestatic    #37  <Method long C.usToMs(long)>
		//    3    7:lreturn         
		}

		public long getPositionInFirstPeriodUs()
		{
			return positionInFirstPeriodUs;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field long positionInFirstPeriodUs>
		//    2    4:lreturn         
		}

		public Window set(Object obj, long l, long l1, boolean flag, boolean flag1, 
				long l2, long l3, int i, int j, long l4)
		{
			tag = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #50  <Field Object tag>
			presentationStartTimeMs = l;
		//    3    5:aload_0         
		//    4    6:lload_2         
		//    5    7:putfield        #52  <Field long presentationStartTimeMs>
			windowStartTimeMs = l1;
		//    6   10:aload_0         
		//    7   11:lload           4
		//    8   13:putfield        #54  <Field long windowStartTimeMs>
			isSeekable = flag;
		//    9   16:aload_0         
		//   10   17:iload           6
		//   11   19:putfield        #56  <Field boolean isSeekable>
			isDynamic = flag1;
		//   12   22:aload_0         
		//   13   23:iload           7
		//   14   25:putfield        #58  <Field boolean isDynamic>
			defaultPositionUs = l2;
		//   15   28:aload_0         
		//   16   29:lload           8
		//   17   31:putfield        #31  <Field long defaultPositionUs>
			durationUs = l3;
		//   18   34:aload_0         
		//   19   35:lload           10
		//   20   37:putfield        #41  <Field long durationUs>
			firstPeriodIndex = i;
		//   21   40:aload_0         
		//   22   41:iload           12
		//   23   43:putfield        #60  <Field int firstPeriodIndex>
			lastPeriodIndex = j;
		//   24   46:aload_0         
		//   25   47:iload           13
		//   26   49:putfield        #62  <Field int lastPeriodIndex>
			positionInFirstPeriodUs = l4;
		//   27   52:aload_0         
		//   28   53:lload           14
		//   29   55:putfield        #45  <Field long positionInFirstPeriodUs>
			return this;
		//   30   58:aload_0         
		//   31   59:areturn         
		}

		public long defaultPositionUs;
		public long durationUs;
		public int firstPeriodIndex;
		public boolean isDynamic;
		public boolean isSeekable;
		public int lastPeriodIndex;
		public long positionInFirstPeriodUs;
		public long presentationStartTimeMs;
		public Object tag;
		public long windowStartTimeMs;

		public Window()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
		//    2    4:return          
		}
	}


	public Timeline()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public int getFirstWindowIndex(boolean flag)
	{
		return !isEmpty() ? 0 : -1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method boolean isEmpty()>
	//    2    4:ifeq            9
	//    3    7:iconst_m1       
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public abstract int getIndexOfPeriod(Object obj);

	public int getLastWindowIndex(boolean flag)
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #29  <Method boolean isEmpty()>
	//*   2    4:ifeq            9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		else
			return getWindowCount() - 1;
	//    5    9:aload_0         
	//    6   10:invokevirtual   #36  <Method int getWindowCount()>
	//    7   13:iconst_1        
	//    8   14:isub            
	//    9   15:ireturn         
	}

	public final int getNextPeriodIndex(int i, Period period, Window window, int j, boolean flag)
	{
		int k = getPeriod(i, period).windowIndex;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #42  <Method Timeline$Period getPeriod(int, Timeline$Period)>
	//    4    6:getfield        #46  <Field int Timeline$Period.windowIndex>
	//    5    9:istore          6
		if(getWindow(k, window).lastPeriodIndex == i)
	//*   6   11:aload_0         
	//*   7   12:iload           6
	//*   8   14:aload_3         
	//*   9   15:invokevirtual   #50  <Method Timeline$Window getWindow(int, Timeline$Window)>
	//*  10   18:getfield        #53  <Field int Timeline$Window.lastPeriodIndex>
	//*  11   21:iload_1         
	//*  12   22:icmpne          53
		{
			i = getNextWindowIndex(k, j, flag);
	//   13   25:aload_0         
	//   14   26:iload           6
	//   15   28:iload           4
	//   16   30:iload           5
	//   17   32:invokevirtual   #57  <Method int getNextWindowIndex(int, int, boolean)>
	//   18   35:istore_1        
			if(i == -1)
	//*  19   36:iload_1         
	//*  20   37:iconst_m1       
	//*  21   38:icmpne          43
				return -1;
	//   22   41:iconst_m1       
	//   23   42:ireturn         
			else
				return getWindow(i, window).firstPeriodIndex;
	//   24   43:aload_0         
	//   25   44:iload_1         
	//   26   45:aload_3         
	//   27   46:invokevirtual   #50  <Method Timeline$Window getWindow(int, Timeline$Window)>
	//   28   49:getfield        #60  <Field int Timeline$Window.firstPeriodIndex>
	//   29   52:ireturn         
		} else
		{
			return i + 1;
	//   30   53:iload_1         
	//   31   54:iconst_1        
	//   32   55:iadd            
	//   33   56:ireturn         
		}
	}

	public int getNextWindowIndex(int i, int j, boolean flag)
	{
		switch(j)
	//*   0    0:iload_2         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 57
	//	               1 55
	//	               2 36
		default:
			throw new IllegalStateException();
	//    2   28:new             #62  <Class IllegalStateException>
	//    3   31:dup             
	//    4   32:invokespecial   #63  <Method void IllegalStateException()>
	//    5   35:athrow          

		case 2: // '\002'
			if(i == getLastWindowIndex(flag))
	//*   6   36:iload_1         
	//*   7   37:aload_0         
	//*   8   38:iload_3         
	//*   9   39:invokevirtual   #65  <Method int getLastWindowIndex(boolean)>
	//*  10   42:icmpne          51
				return getFirstWindowIndex(flag);
	//   11   45:aload_0         
	//   12   46:iload_3         
	//   13   47:invokevirtual   #67  <Method int getFirstWindowIndex(boolean)>
	//   14   50:ireturn         
			else
				return i + 1;
	//   15   51:iload_1         
	//   16   52:iconst_1        
	//   17   53:iadd            
	//   18   54:ireturn         

		case 1: // '\001'
			return i;
	//   19   55:iload_1         
	//   20   56:ireturn         

		case 0: // '\0'
			break;
		}
		if(i == getLastWindowIndex(flag))
	//*  21   57:iload_1         
	//*  22   58:aload_0         
	//*  23   59:iload_3         
	//*  24   60:invokevirtual   #65  <Method int getLastWindowIndex(boolean)>
	//*  25   63:icmpne          68
			return -1;
	//   26   66:iconst_m1       
	//   27   67:ireturn         
		else
			return i + 1;
	//   28   68:iload_1         
	//   29   69:iconst_1        
	//   30   70:iadd            
	//   31   71:ireturn         
	}

	public final Period getPeriod(int i, Period period)
	{
		return getPeriod(i, period, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #70  <Method Timeline$Period getPeriod(int, Timeline$Period, boolean)>
	//    5    7:areturn         
	}

	public abstract Period getPeriod(int i, Period period, boolean flag);

	public abstract int getPeriodCount();

	public final Pair getPeriodPosition(Window window, Period period, int i, long l)
	{
		return getPeriodPosition(window, period, i, l, 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:lload           4
	//    5    6:lconst_0        
	//    6    7:invokevirtual   #76  <Method Pair getPeriodPosition(Timeline$Window, Timeline$Period, int, long, long)>
	//    7   10:areturn         
	}

	public final Pair getPeriodPosition(Window window, Period period, int i, long l, long l1)
	{
		Assertions.checkIndex(i, 0, getWindowCount());
	//    0    0:iload_3         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #36  <Method int getWindowCount()>
	//    4    6:invokestatic    #84  <Method int Assertions.checkIndex(int, int, int)>
	//    5    9:pop             
		getWindow(i, window, false, l1);
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:lload           6
	//   11   16:invokevirtual   #87  <Method Timeline$Window getWindow(int, Timeline$Window, boolean, long)>
	//   12   19:pop             
		l1 = l;
	//   13   20:lload           4
	//   14   22:lstore          6
		if(l == 0x1L)
	//*  15   24:lload           4
	//*  16   26:ldc2w           #88  <Long 0x1L>
	//*  17   29:lcmp            
	//*  18   30:ifne            54
		{
			l = window.getDefaultPositionUs();
	//   19   33:aload_1         
	//   20   34:invokevirtual   #93  <Method long Timeline$Window.getDefaultPositionUs()>
	//   21   37:lstore          4
			l1 = l;
	//   22   39:lload           4
	//   23   41:lstore          6
			if(l == 0x1L)
	//*  24   43:lload           4
	//*  25   45:ldc2w           #88  <Long 0x1L>
	//*  26   48:lcmp            
	//*  27   49:ifne            54
				return null;
	//   28   52:aconst_null     
	//   29   53:areturn         
		}
		i = window.firstPeriodIndex;
	//   30   54:aload_1         
	//   31   55:getfield        #60  <Field int Timeline$Window.firstPeriodIndex>
	//   32   58:istore_3        
		l1 = window.getPositionInFirstPeriodUs() + l1;
	//   33   59:aload_1         
	//   34   60:invokevirtual   #96  <Method long Timeline$Window.getPositionInFirstPeriodUs()>
	//   35   63:lload           6
	//   36   65:ladd            
	//   37   66:lstore          6
		l = getPeriod(i, period).getDurationUs();
	//   38   68:aload_0         
	//   39   69:iload_3         
	//   40   70:aload_2         
	//   41   71:invokevirtual   #42  <Method Timeline$Period getPeriod(int, Timeline$Period)>
	//   42   74:invokevirtual   #99  <Method long Timeline$Period.getDurationUs()>
	//   43   77:lstore          4
		do
		{
			long l2 = l;
	//   44   79:lload           4
	//   45   81:lstore          8
			if(l2 != 0x1L && l1 >= l2 && i < window.lastPeriodIndex)
	//*  46   83:lload           8
	//*  47   85:ldc2w           #88  <Long 0x1L>
	//*  48   88:lcmp            
	//*  49   89:ifeq            133
	//*  50   92:lload           6
	//*  51   94:lload           8
	//*  52   96:lcmp            
	//*  53   97:iflt            133
	//*  54  100:iload_3         
	//*  55  101:aload_1         
	//*  56  102:getfield        #53  <Field int Timeline$Window.lastPeriodIndex>
	//*  57  105:icmpge          133
			{
				i++;
	//   58  108:iload_3         
	//   59  109:iconst_1        
	//   60  110:iadd            
	//   61  111:istore_3        
				l = getPeriod(i, period).getDurationUs();
	//   62  112:aload_0         
	//   63  113:iload_3         
	//   64  114:aload_2         
	//   65  115:invokevirtual   #42  <Method Timeline$Period getPeriod(int, Timeline$Period)>
	//   66  118:invokevirtual   #99  <Method long Timeline$Period.getDurationUs()>
	//   67  121:lstore          4
				l1 -= l2;
	//   68  123:lload           6
	//   69  125:lload           8
	//   70  127:lsub            
	//   71  128:lstore          6
			} else
	//*  72  130:goto            79
			{
				return Pair.create(((Object) (Integer.valueOf(i))), ((Object) (Long.valueOf(l1))));
	//   73  133:iload_3         
	//   74  134:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   75  137:lload           6
	//   76  139:invokestatic    #110 <Method Long Long.valueOf(long)>
	//   77  142:invokestatic    #116 <Method Pair Pair.create(Object, Object)>
	//   78  145:areturn         
			}
		} while(true);
	}

	public int getPreviousWindowIndex(int i, int j, boolean flag)
	{
		switch(j)
	//*   0    0:iload_2         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 57
	//	               1 55
	//	               2 36
		default:
			throw new IllegalStateException();
	//    2   28:new             #62  <Class IllegalStateException>
	//    3   31:dup             
	//    4   32:invokespecial   #63  <Method void IllegalStateException()>
	//    5   35:athrow          

		case 2: // '\002'
			if(i == getFirstWindowIndex(flag))
	//*   6   36:iload_1         
	//*   7   37:aload_0         
	//*   8   38:iload_3         
	//*   9   39:invokevirtual   #67  <Method int getFirstWindowIndex(boolean)>
	//*  10   42:icmpne          51
				return getLastWindowIndex(flag);
	//   11   45:aload_0         
	//   12   46:iload_3         
	//   13   47:invokevirtual   #65  <Method int getLastWindowIndex(boolean)>
	//   14   50:ireturn         
			else
				return i - 1;
	//   15   51:iload_1         
	//   16   52:iconst_1        
	//   17   53:isub            
	//   18   54:ireturn         

		case 1: // '\001'
			return i;
	//   19   55:iload_1         
	//   20   56:ireturn         

		case 0: // '\0'
			break;
		}
		if(i == getFirstWindowIndex(flag))
	//*  21   57:iload_1         
	//*  22   58:aload_0         
	//*  23   59:iload_3         
	//*  24   60:invokevirtual   #67  <Method int getFirstWindowIndex(boolean)>
	//*  25   63:icmpne          68
			return -1;
	//   26   66:iconst_m1       
	//   27   67:ireturn         
		else
			return i - 1;
	//   28   68:iload_1         
	//   29   69:iconst_1        
	//   30   70:isub            
	//   31   71:ireturn         
	}

	public final Window getWindow(int i, Window window)
	{
		return getWindow(i, window, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #121 <Method Timeline$Window getWindow(int, Timeline$Window, boolean)>
	//    5    7:areturn         
	}

	public final Window getWindow(int i, Window window, boolean flag)
	{
		return getWindow(i, window, flag, 0L);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:lconst_0        
	//    5    5:invokevirtual   #87  <Method Timeline$Window getWindow(int, Timeline$Window, boolean, long)>
	//    6    8:areturn         
	}

	public abstract Window getWindow(int i, Window window, boolean flag, long l);

	public abstract int getWindowCount();

	public final boolean isEmpty()
	{
		return getWindowCount() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method int getWindowCount()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final boolean isLastPeriod(int i, Period period, Window window, int j, boolean flag)
	{
		return getNextPeriodIndex(i, period, window, j, flag) == -1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokevirtual   #125 <Method int getNextPeriodIndex(int, Timeline$Period, Timeline$Window, int, boolean)>
	//    7   11:iconst_m1       
	//    8   12:icmpne          17
	//    9   15:iconst_1        
	//   10   16:ireturn         
	//   11   17:iconst_0        
	//   12   18:ireturn         
	}

	public static final Timeline EMPTY = new Timeline() {

		public int getIndexOfPeriod(Object obj)
		{
			return -1;
		//    0    0:iconst_m1       
		//    1    1:ireturn         
		}

		public Period getPeriod(int i, Period period, boolean flag)
		{
			throw new IndexOutOfBoundsException();
		//    0    0:new             #15  <Class IndexOutOfBoundsException>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void IndexOutOfBoundsException()>
		//    3    7:athrow          
		}

		public int getPeriodCount()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Window getWindow(int i, Window window, boolean flag, long l)
		{
			throw new IndexOutOfBoundsException();
		//    0    0:new             #15  <Class IndexOutOfBoundsException>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void IndexOutOfBoundsException()>
		//    3    7:athrow          
		}

		public int getWindowCount()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

	}
;

	static 
	{
	//    0    0:new             #6   <Class Timeline$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void Timeline$1()>
	//    3    7:putstatic       #21  <Field Timeline EMPTY>
	//*   4   10:return          
	}
}
