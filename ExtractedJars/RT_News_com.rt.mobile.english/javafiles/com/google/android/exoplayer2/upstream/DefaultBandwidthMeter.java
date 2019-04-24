// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import com.google.android.exoplayer2.util.*;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			BandwidthMeter, TransferListener, DataSpec

public final class DefaultBandwidthMeter
	implements BandwidthMeter, TransferListener
{
	public static final class Builder
	{

		public DefaultBandwidthMeter build()
		{
			return new DefaultBandwidthMeter(eventHandler, eventListener, initialBitrateEstimate, slidingWindowMaxWeight, clock);
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

		public Builder setClock(Clock clock1)
		{
			clock = clock1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #35  <Field Clock clock>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setEventListener(Handler handler, BandwidthMeter.EventListener eventlistener)
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

		public Builder setInitialBitrateEstimate(long l)
		{
			initialBitrateEstimate = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #26  <Field long initialBitrateEstimate>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setSlidingWindowMaxWeight(int i)
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

		public Builder()
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


	public DefaultBandwidthMeter()
	{
		this(((Handler) (null)), ((BandwidthMeter.EventListener) (null)), 0xf4240L, 2000, Clock.DEFAULT);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:ldc2w           #20  <Long 0xf4240L>
	//    4    6:sipush          2000
	//    5    9:getstatic       #46  <Field Clock Clock.DEFAULT>
	//    6   12:invokespecial   #49  <Method void DefaultBandwidthMeter(Handler, BandwidthMeter$EventListener, long, int, Clock)>
	//    7   15:return          
	}

	public DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventlistener)
	{
		this(handler, eventlistener, 0xf4240L, 2000, Clock.DEFAULT);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc2w           #20  <Long 0xf4240L>
	//    4    6:sipush          2000
	//    5    9:getstatic       #46  <Field Clock Clock.DEFAULT>
	//    6   12:invokespecial   #49  <Method void DefaultBandwidthMeter(Handler, BandwidthMeter$EventListener, long, int, Clock)>
	//    7   15:return          
	}

	public DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventlistener, int i)
	{
		this(handler, eventlistener, 0xf4240L, i, Clock.DEFAULT);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc2w           #20  <Long 0xf4240L>
	//    4    6:iload_3         
	//    5    7:getstatic       #46  <Field Clock Clock.DEFAULT>
	//    6   10:invokespecial   #49  <Method void DefaultBandwidthMeter(Handler, BandwidthMeter$EventListener, long, int, Clock)>
	//    7   13:return          
	}

	private DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventlistener, long l, int i, Clock clock1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		eventHandler = handler;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #58  <Field Handler eventHandler>
		eventListener = eventlistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #60  <Field BandwidthMeter$EventListener eventListener>
		slidingPercentile = new SlidingPercentile(i);
	//    8   14:aload_0         
	//    9   15:new             #62  <Class SlidingPercentile>
	//   10   18:dup             
	//   11   19:iload           5
	//   12   21:invokespecial   #65  <Method void SlidingPercentile(int)>
	//   13   24:putfield        #67  <Field SlidingPercentile slidingPercentile>
		clock = clock1;
	//   14   27:aload_0         
	//   15   28:aload           6
	//   16   30:putfield        #69  <Field Clock clock>
		bitrateEstimate = l;
	//   17   33:aload_0         
	//   18   34:lload_3         
	//   19   35:putfield        #71  <Field long bitrateEstimate>
	//   20   38:return          
	}

	DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventlistener, long l, int i, Clock clock1, _cls1 _pcls1)
	{
		this(handler, eventlistener, l, i, clock1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lload_3         
	//    4    4:iload           5
	//    5    6:aload           6
	//    6    8:invokespecial   #49  <Method void DefaultBandwidthMeter(Handler, BandwidthMeter$EventListener, long, int, Clock)>
	//    7   11:return          
	}

	private void notifyBandwidthSample(final int elapsedMs, final long bytes, final long bitrate)
	{
		if(eventHandler != null && eventListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Handler eventHandler>
	//*   2    4:ifnull          34
	//*   3    7:aload_0         
	//*   4    8:getfield        #60  <Field BandwidthMeter$EventListener eventListener>
	//*   5   11:ifnull          34
			eventHandler.post(new Runnable() {

				public void run()
				{
					eventListener.onBandwidthSample(elapsedMs, bytes, bitrate);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field DefaultBandwidthMeter this$0>
				//    2    4:invokestatic    #37  <Method BandwidthMeter$EventListener DefaultBandwidthMeter.access$100(DefaultBandwidthMeter)>
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
	//    6   14:aload_0         
	//    7   15:getfield        #58  <Field Handler eventHandler>
	//    8   18:new             #11  <Class DefaultBandwidthMeter$1>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:lload_2         
	//   13   25:lload           4
	//   14   27:invokespecial   #80  <Method void DefaultBandwidthMeter$1(DefaultBandwidthMeter, int, long, long)>
	//   15   30:invokevirtual   #86  <Method boolean Handler.post(Runnable)>
	//   16   33:pop             
	//   17   34:return          
	}

	public long getBitrateEstimate()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = bitrateEstimate;
	//    2    2:aload_0         
	//    3    3:getfield        #71  <Field long bitrateEstimate>
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

	public void onBytesTransferred(Object obj, int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		sampleBytesTransferred = sampleBytesTransferred + (long)i;
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #92  <Field long sampleBytesTransferred>
	//    5    7:iload_2         
	//    6    8:i2l             
	//    7    9:ladd            
	//    8   10:putfield        #92  <Field long sampleBytesTransferred>
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return;
	//   11   15:return          
		obj;
	//   12   16:astore_1        
	//*  13   17:aload_0         
		throw obj;
	//   14   18:monitorexit     
	//   15   19:aload_1         
	//   16   20:athrow          
	}

	public void onTransferEnd(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		boolean flag;
		long l;
		long l1;
		long l2;
		if(streamCount > 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #96  <Field int streamCount>
	//*   4    6:ifle            190
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore          4
		else
	//*   7   12:goto            15
	//*   8   15:iload           4
	//*   9   17:invokestatic    #102 <Method void Assertions.checkState(boolean)>
	//*  10   20:aload_0         
	//*  11   21:getfield        #69  <Field Clock clock>
	//*  12   24:invokeinterface #105 <Method long Clock.elapsedRealtime()>
	//*  13   29:lstore          5
	//*  14   31:lload           5
	//*  15   33:aload_0         
	//*  16   34:getfield        #107 <Field long sampleStartTimeMs>
	//*  17   37:lsub            
	//*  18   38:l2i             
	//*  19   39:istore_3        
	//*  20   40:aload_0         
	//*  21   41:getfield        #109 <Field long totalElapsedTimeMs>
	//*  22   44:lstore          7
	//*  23   46:iload_3         
	//*  24   47:i2l             
	//*  25   48:lstore          9
	//*  26   50:aload_0         
	//*  27   51:lload           7
	//*  28   53:lload           9
	//*  29   55:ladd            
	//*  30   56:putfield        #109 <Field long totalElapsedTimeMs>
	//*  31   59:aload_0         
	//*  32   60:aload_0         
	//*  33   61:getfield        #111 <Field long totalBytesTransferred>
	//*  34   64:aload_0         
	//*  35   65:getfield        #92  <Field long sampleBytesTransferred>
	//*  36   68:ladd            
	//*  37   69:putfield        #111 <Field long totalBytesTransferred>
	//*  38   72:iload_3         
	//*  39   73:ifle            142
	//*  40   76:aload_0         
	//*  41   77:getfield        #92  <Field long sampleBytesTransferred>
	//*  42   80:ldc2w           #112 <Long 8000L>
	//*  43   83:lmul            
	//*  44   84:lload           9
	//*  45   86:ldiv            
	//*  46   87:l2f             
	//*  47   88:fstore_2        
	//*  48   89:aload_0         
	//*  49   90:getfield        #67  <Field SlidingPercentile slidingPercentile>
	//*  50   93:aload_0         
	//*  51   94:getfield        #92  <Field long sampleBytesTransferred>
	//*  52   97:l2d             
	//*  53   98:invokestatic    #119 <Method double Math.sqrt(double)>
	//*  54  101:d2i             
	//*  55  102:fload_2         
	//*  56  103:invokevirtual   #123 <Method void SlidingPercentile.addSample(int, float)>
	//*  57  106:aload_0         
	//*  58  107:getfield        #109 <Field long totalElapsedTimeMs>
	//*  59  110:ldc2w           #124 <Long 2000L>
	//*  60  113:lcmp            
	//*  61  114:ifge            128
	//*  62  117:aload_0         
	//*  63  118:getfield        #111 <Field long totalBytesTransferred>
	//*  64  121:ldc2w           #126 <Long 0x80000L>
	//*  65  124:lcmp            
	//*  66  125:iflt            142
	//*  67  128:aload_0         
	//*  68  129:aload_0         
	//*  69  130:getfield        #67  <Field SlidingPercentile slidingPercentile>
	//*  70  133:ldc1            #128 <Float 0.5F>
	//*  71  135:invokevirtual   #132 <Method float SlidingPercentile.getPercentile(float)>
	//*  72  138:f2l             
	//*  73  139:putfield        #71  <Field long bitrateEstimate>
	//*  74  142:aload_0         
	//*  75  143:iload_3         
	//*  76  144:aload_0         
	//*  77  145:getfield        #92  <Field long sampleBytesTransferred>
	//*  78  148:aload_0         
	//*  79  149:getfield        #71  <Field long bitrateEstimate>
	//*  80  152:invokespecial   #134 <Method void notifyBandwidthSample(int, long, long)>
	//*  81  155:aload_0         
	//*  82  156:getfield        #96  <Field int streamCount>
	//*  83  159:iconst_1        
	//*  84  160:isub            
	//*  85  161:istore_3        
	//*  86  162:aload_0         
	//*  87  163:iload_3         
	//*  88  164:putfield        #96  <Field int streamCount>
	//*  89  167:iload_3         
	//*  90  168:ifle            177
	//*  91  171:aload_0         
	//*  92  172:lload           5
	//*  93  174:putfield        #107 <Field long sampleStartTimeMs>
	//*  94  177:aload_0         
	//*  95  178:lconst_0        
	//*  96  179:putfield        #92  <Field long sampleBytesTransferred>
	//*  97  182:aload_0         
	//*  98  183:monitorexit     
	//*  99  184:return          
	//* 100  185:astore_1        
	//* 101  186:aload_0         
	//* 102  187:monitorexit     
	//* 103  188:aload_1         
	//* 104  189:athrow          
			flag = false;
	//  105  190:iconst_0        
	//  106  191:istore          4
		Assertions.checkState(flag);
		l = clock.elapsedRealtime();
		i = (int)(l - sampleStartTimeMs);
		l1 = totalElapsedTimeMs;
		l2 = i;
		totalElapsedTimeMs = l1 + l2;
		totalBytesTransferred = totalBytesTransferred + sampleBytesTransferred;
		if(i <= 0)
			break MISSING_BLOCK_LABEL_142;
		float f = (sampleBytesTransferred * 8000L) / l2;
		slidingPercentile.addSample((int)Math.sqrt(sampleBytesTransferred), f);
		if(totalElapsedTimeMs >= 2000L || totalBytesTransferred >= 0x80000L)
			bitrateEstimate = (long)slidingPercentile.getPercentile(0.5F);
		notifyBandwidthSample(i, sampleBytesTransferred, bitrateEstimate);
		i = streamCount - 1;
		streamCount = i;
		if(i <= 0)
			break MISSING_BLOCK_LABEL_177;
		sampleStartTimeMs = l;
		sampleBytesTransferred = 0L;
		this;
		JVM INSTR monitorexit ;
		return;
		obj;
		throw obj;
	//* 107  193:goto            15
	}

	public void onTransferStart(Object obj, DataSpec dataspec)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(streamCount == 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #96  <Field int streamCount>
	//*   4    6:ifne            22
			sampleStartTimeMs = clock.elapsedRealtime();
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #69  <Field Clock clock>
	//    8   14:invokeinterface #105 <Method long Clock.elapsedRealtime()>
	//    9   19:putfield        #107 <Field long sampleStartTimeMs>
		streamCount = streamCount + 1;
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #96  <Field int streamCount>
	//   13   27:iconst_1        
	//   14   28:iadd            
	//   15   29:putfield        #96  <Field int streamCount>
		this;
	//   16   32:aload_0         
		JVM INSTR monitorexit ;
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		obj;
	//   19   35:astore_1        
	//*  20   36:aload_0         
		throw obj;
	//   21   37:monitorexit     
	//   22   38:aload_1         
	//   23   39:athrow          
	}

	private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 0x80000;
	public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 0xf4240L;
	public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
	private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;
	private long bitrateEstimate;
	private final Clock clock;
	private final Handler eventHandler;
	private final BandwidthMeter.EventListener eventListener;
	private long sampleBytesTransferred;
	private long sampleStartTimeMs;
	private final SlidingPercentile slidingPercentile;
	private int streamCount;
	private long totalBytesTransferred;
	private long totalElapsedTimeMs;


/*
	static BandwidthMeter.EventListener access$100(DefaultBandwidthMeter defaultbandwidthmeter)
	{
		return defaultbandwidthmeter.eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field BandwidthMeter$EventListener eventListener>
	//    2    4:areturn         
	}

*/
}
