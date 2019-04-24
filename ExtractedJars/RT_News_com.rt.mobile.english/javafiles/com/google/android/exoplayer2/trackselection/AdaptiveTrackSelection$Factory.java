// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			AdaptiveTrackSelection, TrackSelection

public static final class AdaptiveTrackSelection$Factory
	implements TrackSelection.Factory
{

	public transient AdaptiveTrackSelection createTrackSelection(TrackGroup trackgroup, int ai[])
	{
		return new AdaptiveTrackSelection(trackgroup, ai, bandwidthMeter, minDurationForQualityIncreaseMs, maxDurationForQualityDecreaseMs, minDurationToRetainAfterDiscardMs, bandwidthFraction, bufferedFractionToLiveEdgeForQualityIncrease, minTimeBetweenBufferReevaluationMs, clock);
	//    0    0:new             #8   <Class AdaptiveTrackSelection>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #42  <Field BandwidthMeter bandwidthMeter>
	//    6   10:aload_0         
	//    7   11:getfield        #44  <Field int minDurationForQualityIncreaseMs>
	//    8   14:i2l             
	//    9   15:aload_0         
	//   10   16:getfield        #46  <Field int maxDurationForQualityDecreaseMs>
	//   11   19:i2l             
	//   12   20:aload_0         
	//   13   21:getfield        #48  <Field int minDurationToRetainAfterDiscardMs>
	//   14   24:i2l             
	//   15   25:aload_0         
	//   16   26:getfield        #50  <Field float bandwidthFraction>
	//   17   29:aload_0         
	//   18   30:getfield        #52  <Field float bufferedFractionToLiveEdgeForQualityIncrease>
	//   19   33:aload_0         
	//   20   34:getfield        #54  <Field long minTimeBetweenBufferReevaluationMs>
	//   21   37:aload_0         
	//   22   38:getfield        #56  <Field Clock clock>
	//   23   41:invokespecial   #61  <Method void AdaptiveTrackSelection(TrackGroup, int[], BandwidthMeter, long, long, long, float, float, long, Clock)>
	//   24   44:areturn         
	}

	public volatile TrackSelection createTrackSelection(TrackGroup trackgroup, int ai[])
	{
		return ((TrackSelection) (createTrackSelection(trackgroup, ai)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #64  <Method AdaptiveTrackSelection createTrackSelection(TrackGroup, int[])>
	//    4    6:areturn         
	}

	private final float bandwidthFraction;
	private final BandwidthMeter bandwidthMeter;
	private final float bufferedFractionToLiveEdgeForQualityIncrease;
	private final Clock clock;
	private final int maxDurationForQualityDecreaseMs;
	private final int minDurationForQualityIncreaseMs;
	private final int minDurationToRetainAfterDiscardMs;
	private final long minTimeBetweenBufferReevaluationMs;

	public AdaptiveTrackSelection$Factory(BandwidthMeter bandwidthmeter)
	{
		this(bandwidthmeter, 10000, 25000, 25000, 0.75F, 0.75F, 2000L, Clock.DEFAULT);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          10000
	//    3    5:sipush          25000
	//    4    8:sipush          25000
	//    5   11:ldc1            #25  <Float 0.75F>
	//    6   13:ldc1            #25  <Float 0.75F>
	//    7   15:ldc2w           #26  <Long 2000L>
	//    8   18:getstatic       #32  <Field Clock Clock.DEFAULT>
	//    9   21:invokespecial   #35  <Method void AdaptiveTrackSelection$Factory(BandwidthMeter, int, int, int, float, float, long, Clock)>
	//   10   24:return          
	}

	public AdaptiveTrackSelection$Factory(BandwidthMeter bandwidthmeter, int i, int j, int k, float f)
	{
		this(bandwidthmeter, i, j, k, f, 0.75F, 2000L, Clock.DEFAULT);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:fload           5
	//    6    8:ldc1            #25  <Float 0.75F>
	//    7   10:ldc2w           #26  <Long 2000L>
	//    8   13:getstatic       #32  <Field Clock Clock.DEFAULT>
	//    9   16:invokespecial   #35  <Method void AdaptiveTrackSelection$Factory(BandwidthMeter, int, int, int, float, float, long, Clock)>
	//   10   19:return          
	}

	public AdaptiveTrackSelection$Factory(BandwidthMeter bandwidthmeter, int i, int j, int k, float f, float f1, long l, Clock clock1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		bandwidthMeter = bandwidthmeter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field BandwidthMeter bandwidthMeter>
		minDurationForQualityIncreaseMs = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #44  <Field int minDurationForQualityIncreaseMs>
		maxDurationForQualityDecreaseMs = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #46  <Field int maxDurationForQualityDecreaseMs>
		minDurationToRetainAfterDiscardMs = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #48  <Field int minDurationToRetainAfterDiscardMs>
		bandwidthFraction = f;
	//   14   25:aload_0         
	//   15   26:fload           5
	//   16   28:putfield        #50  <Field float bandwidthFraction>
		bufferedFractionToLiveEdgeForQualityIncrease = f1;
	//   17   31:aload_0         
	//   18   32:fload           6
	//   19   34:putfield        #52  <Field float bufferedFractionToLiveEdgeForQualityIncrease>
		minTimeBetweenBufferReevaluationMs = l;
	//   20   37:aload_0         
	//   21   38:lload           7
	//   22   40:putfield        #54  <Field long minTimeBetweenBufferReevaluationMs>
		clock = clock1;
	//   23   43:aload_0         
	//   24   44:aload           9
	//   25   46:putfield        #56  <Field Clock clock>
	//   26   49:return          
	}
}
