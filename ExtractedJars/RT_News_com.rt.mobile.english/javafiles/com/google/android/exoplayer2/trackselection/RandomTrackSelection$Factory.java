// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroup;
import java.util.Random;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			RandomTrackSelection, TrackSelection

public static final class RandomTrackSelection$Factory
	implements TrackSelection.Factory
{

	public transient RandomTrackSelection createTrackSelection(TrackGroup trackgroup, int ai[])
	{
		return new RandomTrackSelection(trackgroup, ai, random);
	//    0    0:new             #8   <Class RandomTrackSelection>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #20  <Field Random random>
	//    6   10:invokespecial   #30  <Method void RandomTrackSelection(TrackGroup, int[], Random)>
	//    7   13:areturn         
	}

	public volatile TrackSelection createTrackSelection(TrackGroup trackgroup, int ai[])
	{
		return ((TrackSelection) (createTrackSelection(trackgroup, ai)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #33  <Method RandomTrackSelection createTrackSelection(TrackGroup, int[])>
	//    4    6:areturn         
	}

	private final Random random;

	public RandomTrackSelection$Factory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		random = new Random();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class Random>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void Random()>
	//    6   12:putfield        #20  <Field Random random>
	//    7   15:return          
	}

	public RandomTrackSelection$Factory(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		random = new Random(i);
	//    2    4:aload_0         
	//    3    5:new             #17  <Class Random>
	//    4    8:dup             
	//    5    9:iload_1         
	//    6   10:i2l             
	//    7   11:invokespecial   #25  <Method void Random(long)>
	//    8   14:putfield        #20  <Field Random random>
	//    9   17:return          
	}
}
