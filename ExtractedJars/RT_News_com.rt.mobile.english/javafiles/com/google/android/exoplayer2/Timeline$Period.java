// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;

// Referenced classes of package com.google.android.exoplayer2:
//			Timeline, C

public static final class Timeline$Period
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
		com.google.android.exoplayer2.source.ads.AdGroup adgroup = adPlaybackState.adGroups[i];
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
		com.google.android.exoplayer2.source.ads.AdGroup adgroup = adPlaybackState.adGroups[i];
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

	public Timeline$Period set(Object obj, Object obj1, int i, long l, long l1)
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

	public Timeline$Period set(Object obj, Object obj1, int i, long l, long l1, 
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

	public Timeline$Period()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}
}
