// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DefaultBandwidthMeter

public static final class DefaultBandwidthMeter$Builder
{

	public DefaultBandwidthMeter build()
	{
		return new DefaultBandwidthMeter(eventHandler, eventListener, initialBitrateEstimate, slidingWindowMaxWeight, clock, ((DefaultBandwidthMeter._cls1) (null)));
	//    0    0:new             #6   <Class DefaultBandwidthMeter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field Handler eventHandler>
	//    4    8:aload_0         
	//    5    9:getfield        #42  <Field BandwidthMeter$EventListener eventListener>
	//    6   12:aload_0         
	//    7   13:getfield        #26  <Field long initialBitrateEstimate>
	//    8   16:aload_0         
	//    9   17:getfield        #28  <Field int slidingWindowMaxWeight>
	//   10   20:aload_0         
	//   11   21:getfield        #35  <Field Clock clock>
	//   12   24:aconst_null     
	//   13   25:invokespecial   #45  <Method void DefaultBandwidthMeter(Handler, BandwidthMeter$EventListener, long, int, Clock, DefaultBandwidthMeter$1)>
	//   14   28:areturn         
	}

	public DefaultBandwidthMeter$Builder setClock(Clock clock1)
	{
		clock = clock1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field Clock clock>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DefaultBandwidthMeter$Builder setEventListener(Handler handler, BandwidthMeter.EventListener eventlistener)
	{
		boolean flag;
		if(handler != null && eventlistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
	//*   2    4:aload_2         
	//*   3    5:ifnull          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_3        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		Assertions.checkArgument(flag);
	//    9   15:iload_3         
	//   10   16:invokestatic    #55  <Method void Assertions.checkArgument(boolean)>
		eventHandler = handler;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #40  <Field Handler eventHandler>
		eventListener = eventlistener;
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:putfield        #42  <Field BandwidthMeter$EventListener eventListener>
		return this;
	//   17   29:aload_0         
	//   18   30:areturn         
	}

	public DefaultBandwidthMeter$Builder setInitialBitrateEstimate(long l)
	{
		initialBitrateEstimate = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #26  <Field long initialBitrateEstimate>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DefaultBandwidthMeter$Builder setSlidingWindowMaxWeight(int i)
	{
		slidingWindowMaxWeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int slidingWindowMaxWeight>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private Clock clock;
	private Handler eventHandler;
	private BandwidthMeter.EventListener eventListener;
	private long initialBitrateEstimate;
	private int slidingWindowMaxWeight;

	public DefaultBandwidthMeter$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		initialBitrateEstimate = 0xf4240L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #23  <Long 0xf4240L>
	//    4    8:putfield        #26  <Field long initialBitrateEstimate>
		slidingWindowMaxWeight = 2000;
	//    5   11:aload_0         
	//    6   12:sipush          2000
	//    7   15:putfield        #28  <Field int slidingWindowMaxWeight>
		clock = Clock.DEFAULT;
	//    8   18:aload_0         
	//    9   19:getstatic       #33  <Field Clock Clock.DEFAULT>
	//   10   22:putfield        #35  <Field Clock clock>
	//   11   25:return          
	}
}
