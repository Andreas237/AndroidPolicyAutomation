// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import android.os.Handler;
import com.google.android.exoplayer.util.*;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			BandwidthMeter

public final class DefaultBandwidthMeter
	implements BandwidthMeter
{

	public DefaultBandwidthMeter()
	{
		this(((Handler) (null)), ((BandwidthMeter.EventListener) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokespecial   #29  <Method void DefaultBandwidthMeter(Handler, BandwidthMeter$EventListener)>
	//    4    6:return          
	}

	public DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventlistener)
	{
		this(handler, eventlistener, ((Clock) (new SystemClock())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #32  <Class SystemClock>
	//    4    6:dup             
	//    5    7:invokespecial   #34  <Method void SystemClock()>
	//    6   10:invokespecial   #37  <Method void DefaultBandwidthMeter(Handler, BandwidthMeter$EventListener, Clock)>
	//    7   13:return          
	}

	public DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventlistener, int i)
	{
		this(handler, eventlistener, ((Clock) (new SystemClock())), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #32  <Class SystemClock>
	//    4    6:dup             
	//    5    7:invokespecial   #34  <Method void SystemClock()>
	//    6   10:iload_3         
	//    7   11:invokespecial   #41  <Method void DefaultBandwidthMeter(Handler, BandwidthMeter$EventListener, Clock, int)>
	//    8   14:return          
	}

	public DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventlistener, Clock clock1)
	{
		this(handler, eventlistener, clock1, 2000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:sipush          2000
	//    5    7:invokespecial   #41  <Method void DefaultBandwidthMeter(Handler, BandwidthMeter$EventListener, Clock, int)>
	//    6   10:return          
	}

	public DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventlistener, Clock clock1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		eventHandler = handler;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #44  <Field Handler eventHandler>
		eventListener = eventlistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #46  <Field BandwidthMeter$EventListener eventListener>
		clock = clock1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #48  <Field Clock clock>
		slidingPercentile = new SlidingPercentile(i);
	//   11   19:aload_0         
	//   12   20:new             #50  <Class SlidingPercentile>
	//   13   23:dup             
	//   14   24:iload           4
	//   15   26:invokespecial   #53  <Method void SlidingPercentile(int)>
	//   16   29:putfield        #55  <Field SlidingPercentile slidingPercentile>
		bitrateEstimate = -1L;
	//   17   32:aload_0         
	//   18   33:ldc2w           #56  <Long -1L>
	//   19   36:putfield        #59  <Field long bitrateEstimate>
	//   20   39:return          
	}

	private void notifyBandwidthSample(final int elapsedMs, final long bytes, final long bitrate)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Handler eventHandler>
	//    2    4:astore          6
		if(handler != null && eventListener != null)
	//*   3    6:aload           6
	//*   4    8:ifnull          36
	//*   5   11:aload_0         
	//*   6   12:getfield        #46  <Field BandwidthMeter$EventListener eventListener>
	//*   7   15:ifnull          36
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onBandwidthSample(elapsedMs, bytes, bitrate);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field DefaultBandwidthMeter this$0>
				//    2    4:invokestatic    #37  <Method BandwidthMeter$EventListener DefaultBandwidthMeter.access$000(DefaultBandwidthMeter)>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field int val$elapsedMs>
				//    5   11:aload_0         
				//    6   12:getfield        #26  <Field long val$bytes>
				//    7   15:aload_0         
				//    8   16:getfield        #28  <Field long val$bitrate>
				//    9   19:invokeinterface #42  <Method void BandwidthMeter$EventListener.onBandwidthSample(int, long, long)>
				//   10   24:return          
				}

				final DefaultBandwidthMeter this$0;
				final long val$bitrate;
				final long val$bytes;
				final int val$elapsedMs;

			
			{
				this$0 = DefaultBandwidthMeter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field DefaultBandwidthMeter this$0>
				elapsedMs = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #24  <Field int val$elapsedMs>
				bytes = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #26  <Field long val$bytes>
				bitrate = l1;
			//    9   15:aload_0         
			//   10   16:lload           5
			//   11   18:putfield        #28  <Field long val$bitrate>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//    8   18:aload           6
	//    9   20:new             #8   <Class DefaultBandwidthMeter$1>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:iload_1         
	//   13   26:lload_2         
	//   14   27:lload           4
	//   15   29:invokespecial   #66  <Method void DefaultBandwidthMeter$1(DefaultBandwidthMeter, int, long, long)>
	//   16   32:invokevirtual   #72  <Method boolean Handler.post(Runnable)>
	//   17   35:pop             
	//   18   36:return          
	}

	public long getBitrateEstimate()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = bitrateEstimate;
	//    2    2:aload_0         
	//    3    3:getfield        #59  <Field long bitrateEstimate>
	//    4    6:lstore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return l;
	//    7    9:lload_1         
	//    8   10:lreturn         
		Exception exception;
		exception;
	//    9   11:astore_3        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_3         
	//   13   15:athrow          
	}

	public void onBytesTransferred(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		bytesAccumulator = bytesAccumulator + (long)i;
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #77  <Field long bytesAccumulator>
	//    5    7:iload_1         
	//    6    8:i2l             
	//    7    9:ladd            
	//    8   10:putfield        #77  <Field long bytesAccumulator>
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return;
	//   11   15:return          
		Exception exception;
		exception;
	//   12   16:astore_2        
	//*  13   17:aload_0         
		throw exception;
	//   14   18:monitorexit     
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public void onTransferEnd()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		float f;
		int i;
		boolean flag;
		long l;
		long l1;
		Exception exception;
		if(streamCount > 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #80  <Field int streamCount>
	//*   4    6:ifle            154
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_3        
		else
	//*   7   11:goto            14
	//*   8   14:iload_3         
	//*   9   15:invokestatic    #86  <Method void Assertions.checkState(boolean)>
	//*  10   18:aload_0         
	//*  11   19:getfield        #48  <Field Clock clock>
	//*  12   22:invokeinterface #91  <Method long Clock.elapsedRealtime()>
	//*  13   27:lstore          6
	//*  14   29:lload           6
	//*  15   31:aload_0         
	//*  16   32:getfield        #93  <Field long startTimeMs>
	//*  17   35:lsub            
	//*  18   36:l2i             
	//*  19   37:istore_2        
	//*  20   38:iload_2         
	//*  21   39:ifle            116
	//*  22   42:aload_0         
	//*  23   43:getfield        #77  <Field long bytesAccumulator>
	//*  24   46:ldc2w           #94  <Long 8000L>
	//*  25   49:lmul            
	//*  26   50:iload_2         
	//*  27   51:i2l             
	//*  28   52:ldiv            
	//*  29   53:l2f             
	//*  30   54:fstore_1        
	//*  31   55:aload_0         
	//*  32   56:getfield        #55  <Field SlidingPercentile slidingPercentile>
	//*  33   59:aload_0         
	//*  34   60:getfield        #77  <Field long bytesAccumulator>
	//*  35   63:l2d             
	//*  36   64:invokestatic    #101 <Method double Math.sqrt(double)>
	//*  37   67:d2i             
	//*  38   68:fload_1         
	//*  39   69:invokevirtual   #105 <Method void SlidingPercentile.addSample(int, float)>
	//*  40   72:aload_0         
	//*  41   73:getfield        #55  <Field SlidingPercentile slidingPercentile>
	//*  42   76:ldc1            #106 <Float 0.5F>
	//*  43   78:invokevirtual   #110 <Method float SlidingPercentile.getPercentile(float)>
	//*  44   81:fstore_1        
	//*  45   82:fload_1         
	//*  46   83:invokestatic    #116 <Method boolean Float.isNaN(float)>
	//*  47   86:ifeq            159
	//*  48   89:ldc2w           #56  <Long -1L>
	//*  49   92:lstore          4
	//*  50   94:goto            97
	//*  51   97:aload_0         
	//*  52   98:lload           4
	//*  53  100:putfield        #59  <Field long bitrateEstimate>
	//*  54  103:aload_0         
	//*  55  104:iload_2         
	//*  56  105:aload_0         
	//*  57  106:getfield        #77  <Field long bytesAccumulator>
	//*  58  109:aload_0         
	//*  59  110:getfield        #59  <Field long bitrateEstimate>
	//*  60  113:invokespecial   #118 <Method void notifyBandwidthSample(int, long, long)>
	//*  61  116:aload_0         
	//*  62  117:aload_0         
	//*  63  118:getfield        #80  <Field int streamCount>
	//*  64  121:iconst_1        
	//*  65  122:isub            
	//*  66  123:putfield        #80  <Field int streamCount>
	//*  67  126:aload_0         
	//*  68  127:getfield        #80  <Field int streamCount>
	//*  69  130:ifle            139
	//*  70  133:aload_0         
	//*  71  134:lload           6
	//*  72  136:putfield        #93  <Field long startTimeMs>
	//*  73  139:aload_0         
	//*  74  140:lconst_0        
	//*  75  141:putfield        #77  <Field long bytesAccumulator>
	//*  76  144:aload_0         
	//*  77  145:monitorexit     
	//*  78  146:return          
	//*  79  147:astore          8
	//*  80  149:aload_0         
	//*  81  150:monitorexit     
	//*  82  151:aload           8
	//*  83  153:athrow          
			flag = false;
	//   84  154:iconst_0        
	//   85  155:istore_3        
		Assertions.checkState(flag);
		l1 = clock.elapsedRealtime();
		i = (int)(l1 - startTimeMs);
		if(i <= 0)
			break MISSING_BLOCK_LABEL_116;
		f = (bytesAccumulator * 8000L) / (long)i;
		slidingPercentile.addSample((int)Math.sqrt(bytesAccumulator), f);
		f = slidingPercentile.getPercentile(0.5F);
		if(Float.isNaN(f))
			l = -1L;
		else
	//*  86  156:goto            14
			l = (long)f;
	//   87  159:fload_1         
	//   88  160:f2l             
	//   89  161:lstore          4
		bitrateEstimate = l;
		notifyBandwidthSample(i, bytesAccumulator, bitrateEstimate);
		streamCount = streamCount - 1;
		if(streamCount > 0)
			startTimeMs = l1;
		bytesAccumulator = 0L;
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
	//*  90  163:goto            97
	}

	public void onTransferStart()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(streamCount == 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #80  <Field int streamCount>
	//*   4    6:ifne            22
			startTimeMs = clock.elapsedRealtime();
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #48  <Field Clock clock>
	//    8   14:invokeinterface #91  <Method long Clock.elapsedRealtime()>
	//    9   19:putfield        #93  <Field long startTimeMs>
		streamCount = streamCount + 1;
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #80  <Field int streamCount>
	//   13   27:iconst_1        
	//   14   28:iadd            
	//   15   29:putfield        #80  <Field int streamCount>
		this;
	//   16   32:aload_0         
		JVM INSTR monitorexit ;
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		Exception exception;
		exception;
	//   19   35:astore_1        
	//*  20   36:aload_0         
		throw exception;
	//   21   37:monitorexit     
	//   22   38:aload_1         
	//   23   39:athrow          
	}

	public static final int DEFAULT_MAX_WEIGHT = 2000;
	private long bitrateEstimate;
	private long bytesAccumulator;
	private final Clock clock;
	private final Handler eventHandler;
	private final BandwidthMeter.EventListener eventListener;
	private final SlidingPercentile slidingPercentile;
	private long startTimeMs;
	private int streamCount;


/*
	static BandwidthMeter.EventListener access$000(DefaultBandwidthMeter defaultbandwidthmeter)
	{
		return defaultbandwidthmeter.eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field BandwidthMeter$EventListener eventListener>
	//    2    4:areturn         
	}

*/
}
