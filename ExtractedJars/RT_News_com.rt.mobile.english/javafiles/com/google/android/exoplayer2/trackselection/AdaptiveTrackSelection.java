// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			BaseTrackSelection, TrackSelection

public class AdaptiveTrackSelection extends BaseTrackSelection
{
	public static final class Factory
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

		public Factory(BandwidthMeter bandwidthmeter)
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

		public Factory(BandwidthMeter bandwidthmeter, int i, int j, int k, float f)
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

		public Factory(BandwidthMeter bandwidthmeter, int i, int j, int k, float f, float f1, long l, Clock clock1)
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


	public AdaptiveTrackSelection(TrackGroup trackgroup, int ai[], BandwidthMeter bandwidthmeter)
	{
		this(trackgroup, ai, bandwidthmeter, 10000L, 25000L, 25000L, 0.75F, 0.75F, 2000L, Clock.DEFAULT);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc2w           #38  <Long 10000L>
	//    5    7:ldc2w           #40  <Long 25000L>
	//    6   10:ldc2w           #40  <Long 25000L>
	//    7   13:ldc1            #10  <Float 0.75F>
	//    8   15:ldc1            #10  <Float 0.75F>
	//    9   17:ldc2w           #20  <Long 2000L>
	//   10   20:getstatic       #46  <Field Clock Clock.DEFAULT>
	//   11   23:invokespecial   #49  <Method void AdaptiveTrackSelection(TrackGroup, int[], BandwidthMeter, long, long, long, float, float, long, Clock)>
	//   12   26:return          
	}

	public AdaptiveTrackSelection(TrackGroup trackgroup, int ai[], BandwidthMeter bandwidthmeter, long l, long l1, 
			long l2, float f, float f1, long l3, Clock clock1)
	{
		super(trackgroup, ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #53  <Method void BaseTrackSelection(TrackGroup, int[])>
		bandwidthMeter = bandwidthmeter;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #55  <Field BandwidthMeter bandwidthMeter>
		minDurationForQualityIncreaseUs = l * 1000L;
	//    7   11:aload_0         
	//    8   12:lload           4
	//    9   14:ldc2w           #56  <Long 1000L>
	//   10   17:lmul            
	//   11   18:putfield        #59  <Field long minDurationForQualityIncreaseUs>
		maxDurationForQualityDecreaseUs = l1 * 1000L;
	//   12   21:aload_0         
	//   13   22:lload           6
	//   14   24:ldc2w           #56  <Long 1000L>
	//   15   27:lmul            
	//   16   28:putfield        #61  <Field long maxDurationForQualityDecreaseUs>
		minDurationToRetainAfterDiscardUs = l2 * 1000L;
	//   17   31:aload_0         
	//   18   32:lload           8
	//   19   34:ldc2w           #56  <Long 1000L>
	//   20   37:lmul            
	//   21   38:putfield        #63  <Field long minDurationToRetainAfterDiscardUs>
		bandwidthFraction = f;
	//   22   41:aload_0         
	//   23   42:fload           10
	//   24   44:putfield        #65  <Field float bandwidthFraction>
		bufferedFractionToLiveEdgeForQualityIncrease = f1;
	//   25   47:aload_0         
	//   26   48:fload           11
	//   27   50:putfield        #67  <Field float bufferedFractionToLiveEdgeForQualityIncrease>
		minTimeBetweenBufferReevaluationMs = l3;
	//   28   53:aload_0         
	//   29   54:lload           12
	//   30   56:putfield        #69  <Field long minTimeBetweenBufferReevaluationMs>
		clock = clock1;
	//   31   59:aload_0         
	//   32   60:aload           14
	//   33   62:putfield        #71  <Field Clock clock>
		playbackSpeed = 1.0F;
	//   34   65:aload_0         
	//   35   66:fconst_1        
	//   36   67:putfield        #73  <Field float playbackSpeed>
		reason = 1;
	//   37   70:aload_0         
	//   38   71:iconst_1        
	//   39   72:putfield        #75  <Field int reason>
		lastBufferEvaluationMs = 0x1L;
	//   40   75:aload_0         
	//   41   76:ldc2w           #76  <Long 0x1L>
	//   42   79:putfield        #79  <Field long lastBufferEvaluationMs>
		selectedIndex = determineIdealSelectedIndex(0x0L);
	//   43   82:aload_0         
	//   44   83:aload_0         
	//   45   84:ldc2w           #80  <Long 0x0L>
	//   46   87:invokespecial   #85  <Method int determineIdealSelectedIndex(long)>
	//   47   90:putfield        #87  <Field int selectedIndex>
	//   48   93:return          
	}

	private int determineIdealSelectedIndex(long l)
	{
		long l1 = (long)((float)bandwidthMeter.getBitrateEstimate() * bandwidthFraction);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field BandwidthMeter bandwidthMeter>
	//    2    4:invokeinterface #93  <Method long BandwidthMeter.getBitrateEstimate()>
	//    3    9:l2f             
	//    4   10:aload_0         
	//    5   11:getfield        #65  <Field float bandwidthFraction>
	//    6   14:fmul            
	//    7   15:f2l             
	//    8   16:lstore          5
		int i = 0;
	//    9   18:iconst_0        
	//   10   19:istore_3        
		int j = 0;
	//   11   20:iconst_0        
	//   12   21:istore          4
		for(; i < length; i++)
	//*  13   23:iload_3         
	//*  14   24:aload_0         
	//*  15   25:getfield        #96  <Field int length>
	//*  16   28:icmpge          84
		{
			if(l != 0x0L && isBlacklisted(i, l))
				continue;
	//   17   31:lload_1         
	//   18   32:ldc2w           #80  <Long 0x0L>
	//   19   35:lcmp            
	//   20   36:ifeq            48
	//   21   39:aload_0         
	//   22   40:iload_3         
	//   23   41:lload_1         
	//   24   42:invokevirtual   #100 <Method boolean isBlacklisted(int, long)>
	//   25   45:ifne            77
			if((long)Math.round((float)getFormat(i).bitrate * playbackSpeed) <= l1)
	//*  26   48:aload_0         
	//*  27   49:iload_3         
	//*  28   50:invokevirtual   #104 <Method Format getFormat(int)>
	//*  29   53:getfield        #109 <Field int Format.bitrate>
	//*  30   56:i2f             
	//*  31   57:aload_0         
	//*  32   58:getfield        #73  <Field float playbackSpeed>
	//*  33   61:fmul            
	//*  34   62:invokestatic    #115 <Method int Math.round(float)>
	//*  35   65:i2l             
	//*  36   66:lload           5
	//*  37   68:lcmp            
	//*  38   69:ifgt            74
				return i;
	//   39   72:iload_3         
	//   40   73:ireturn         
			j = i;
	//   41   74:iload_3         
	//   42   75:istore          4
		}

	//   43   77:iload_3         
	//   44   78:iconst_1        
	//   45   79:iadd            
	//   46   80:istore_3        
	//*  47   81:goto            23
		return j;
	//   48   84:iload           4
	//   49   86:ireturn         
	}

	private long minDurationForQualityIncreaseUs(long l)
	{
		boolean flag;
		if(l != 0x1L && l <= minDurationForQualityIncreaseUs)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #76  <Long 0x1L>
	//*   2    4:lcmp            
	//*   3    5:ifeq            22
	//*   4    8:lload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #59  <Field long minDurationForQualityIncreaseUs>
	//*   7   13:lcmp            
	//*   8   14:ifgt            22
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_3        
		else
	//*  11   19:goto            24
			flag = false;
	//   12   22:iconst_0        
	//   13   23:istore_3        
		if(flag)
	//*  14   24:iload_3         
	//*  15   25:ifeq            37
			return (long)((float)l * bufferedFractionToLiveEdgeForQualityIncrease);
	//   16   28:lload_1         
	//   17   29:l2f             
	//   18   30:aload_0         
	//   19   31:getfield        #67  <Field float bufferedFractionToLiveEdgeForQualityIncrease>
	//   20   34:fmul            
	//   21   35:f2l             
	//   22   36:lreturn         
		else
			return minDurationForQualityIncreaseUs;
	//   23   37:aload_0         
	//   24   38:getfield        #59  <Field long minDurationForQualityIncreaseUs>
	//   25   41:lreturn         
	}

	public void enable()
	{
		lastBufferEvaluationMs = 0x1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #76  <Long 0x1L>
	//    2    4:putfield        #79  <Field long lastBufferEvaluationMs>
	//    3    7:return          
	}

	public int evaluateQueueSize(long l, List list)
	{
		long l1 = clock.elapsedRealtime();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field Clock clock>
	//    2    4:invokeinterface #123 <Method long Clock.elapsedRealtime()>
	//    3    9:lstore          6
		if(lastBufferEvaluationMs != 0x1L && l1 - lastBufferEvaluationMs < minTimeBetweenBufferReevaluationMs)
	//*   4   11:aload_0         
	//*   5   12:getfield        #79  <Field long lastBufferEvaluationMs>
	//*   6   15:ldc2w           #76  <Long 0x1L>
	//*   7   18:lcmp            
	//*   8   19:ifeq            44
	//*   9   22:lload           6
	//*  10   24:aload_0         
	//*  11   25:getfield        #79  <Field long lastBufferEvaluationMs>
	//*  12   28:lsub            
	//*  13   29:aload_0         
	//*  14   30:getfield        #69  <Field long minTimeBetweenBufferReevaluationMs>
	//*  15   33:lcmp            
	//*  16   34:ifge            44
			return list.size();
	//   17   37:aload_3         
	//   18   38:invokeinterface #129 <Method int List.size()>
	//   19   43:ireturn         
		lastBufferEvaluationMs = l1;
	//   20   44:aload_0         
	//   21   45:lload           6
	//   22   47:putfield        #79  <Field long lastBufferEvaluationMs>
		boolean flag = list.isEmpty();
	//   23   50:aload_3         
	//   24   51:invokeinterface #133 <Method boolean List.isEmpty()>
	//   25   56:istore          8
		int i = 0;
	//   26   58:iconst_0        
	//   27   59:istore          4
		if(flag)
	//*  28   61:iload           8
	//*  29   63:ifeq            68
			return 0;
	//   30   66:iconst_0        
	//   31   67:ireturn         
		int j = list.size();
	//   32   68:aload_3         
	//   33   69:invokeinterface #129 <Method int List.size()>
	//   34   74:istore          5
		if(Util.getPlayoutDurationForMediaDuration(((MediaChunk)list.get(j - 1)).startTimeUs - l, playbackSpeed) < minDurationToRetainAfterDiscardUs)
	//*  35   76:aload_3         
	//*  36   77:iload           5
	//*  37   79:iconst_1        
	//*  38   80:isub            
	//*  39   81:invokeinterface #137 <Method Object List.get(int)>
	//*  40   86:checkcast       #139 <Class MediaChunk>
	//*  41   89:getfield        #142 <Field long MediaChunk.startTimeUs>
	//*  42   92:lload_1         
	//*  43   93:lsub            
	//*  44   94:aload_0         
	//*  45   95:getfield        #73  <Field float playbackSpeed>
	//*  46   98:invokestatic    #148 <Method long Util.getPlayoutDurationForMediaDuration(long, float)>
	//*  47  101:aload_0         
	//*  48  102:getfield        #63  <Field long minDurationToRetainAfterDiscardUs>
	//*  49  105:lcmp            
	//*  50  106:ifge            112
			return j;
	//   51  109:iload           5
	//   52  111:ireturn         
		Format format = getFormat(determineIdealSelectedIndex(l1));
	//   53  112:aload_0         
	//   54  113:aload_0         
	//   55  114:lload           6
	//   56  116:invokespecial   #85  <Method int determineIdealSelectedIndex(long)>
	//   57  119:invokevirtual   #104 <Method Format getFormat(int)>
	//   58  122:astore          9
		for(; i < j; i++)
	//*  59  124:iload           4
	//*  60  126:iload           5
	//*  61  128:icmpge          251
		{
			MediaChunk mediachunk = (MediaChunk)list.get(i);
	//   62  131:aload_3         
	//   63  132:iload           4
	//   64  134:invokeinterface #137 <Method Object List.get(int)>
	//   65  139:checkcast       #139 <Class MediaChunk>
	//   66  142:astore          10
			Format format1 = mediachunk.trackFormat;
	//   67  144:aload           10
	//   68  146:getfield        #152 <Field Format MediaChunk.trackFormat>
	//   69  149:astore          11
			if(Util.getPlayoutDurationForMediaDuration(mediachunk.startTimeUs - l, playbackSpeed) >= minDurationToRetainAfterDiscardUs && format1.bitrate < format.bitrate && format1.height != -1 && format1.height < 720 && format1.width != -1 && format1.width < 1280 && format1.height < format.height)
	//*  70  151:aload           10
	//*  71  153:getfield        #142 <Field long MediaChunk.startTimeUs>
	//*  72  156:lload_1         
	//*  73  157:lsub            
	//*  74  158:aload_0         
	//*  75  159:getfield        #73  <Field float playbackSpeed>
	//*  76  162:invokestatic    #148 <Method long Util.getPlayoutDurationForMediaDuration(long, float)>
	//*  77  165:aload_0         
	//*  78  166:getfield        #63  <Field long minDurationToRetainAfterDiscardUs>
	//*  79  169:lcmp            
	//*  80  170:iflt            242
	//*  81  173:aload           11
	//*  82  175:getfield        #109 <Field int Format.bitrate>
	//*  83  178:aload           9
	//*  84  180:getfield        #109 <Field int Format.bitrate>
	//*  85  183:icmpge          242
	//*  86  186:aload           11
	//*  87  188:getfield        #155 <Field int Format.height>
	//*  88  191:iconst_m1       
	//*  89  192:icmpeq          242
	//*  90  195:aload           11
	//*  91  197:getfield        #155 <Field int Format.height>
	//*  92  200:sipush          720
	//*  93  203:icmpge          242
	//*  94  206:aload           11
	//*  95  208:getfield        #158 <Field int Format.width>
	//*  96  211:iconst_m1       
	//*  97  212:icmpeq          242
	//*  98  215:aload           11
	//*  99  217:getfield        #158 <Field int Format.width>
	//* 100  220:sipush          1280
	//* 101  223:icmpge          242
	//* 102  226:aload           11
	//* 103  228:getfield        #155 <Field int Format.height>
	//* 104  231:aload           9
	//* 105  233:getfield        #155 <Field int Format.height>
	//* 106  236:icmpge          242
				return i;
	//  107  239:iload           4
	//  108  241:ireturn         
		}

	//  109  242:iload           4
	//  110  244:iconst_1        
	//  111  245:iadd            
	//  112  246:istore          4
	//* 113  248:goto            124
		return j;
	//  114  251:iload           5
	//  115  253:ireturn         
	}

	public int getSelectedIndex()
	{
		return selectedIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int selectedIndex>
	//    2    4:ireturn         
	}

	public Object getSelectionData()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getSelectionReason()
	{
		return reason;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field int reason>
	//    2    4:ireturn         
	}

	public void onPlaybackSpeed(float f)
	{
		playbackSpeed = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #73  <Field float playbackSpeed>
	//    3    5:return          
	}

	public void updateSelectedTrack(long l, long l1, long l2)
	{
		l = clock.elapsedRealtime();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field Clock clock>
	//    2    4:invokeinterface #123 <Method long Clock.elapsedRealtime()>
	//    3    9:lstore_1        
		int i = selectedIndex;
	//    4   10:aload_0         
	//    5   11:getfield        #87  <Field int selectedIndex>
	//    6   14:istore          7
		selectedIndex = determineIdealSelectedIndex(l);
	//    7   16:aload_0         
	//    8   17:aload_0         
	//    9   18:lload_1         
	//   10   19:invokespecial   #85  <Method int determineIdealSelectedIndex(long)>
	//   11   22:putfield        #87  <Field int selectedIndex>
		if(selectedIndex == i)
	//*  12   25:aload_0         
	//*  13   26:getfield        #87  <Field int selectedIndex>
	//*  14   29:iload           7
	//*  15   31:icmpne          35
			return;
	//   16   34:return          
		if(!isBlacklisted(i, l))
	//*  17   35:aload_0         
	//*  18   36:iload           7
	//*  19   38:lload_1         
	//*  20   39:invokevirtual   #100 <Method boolean isBlacklisted(int, long)>
	//*  21   42:ifne            124
		{
			Format format = getFormat(i);
	//   22   45:aload_0         
	//   23   46:iload           7
	//   24   48:invokevirtual   #104 <Method Format getFormat(int)>
	//   25   51:astore          8
			Format format1 = getFormat(selectedIndex);
	//   26   53:aload_0         
	//   27   54:aload_0         
	//   28   55:getfield        #87  <Field int selectedIndex>
	//   29   58:invokevirtual   #104 <Method Format getFormat(int)>
	//   30   61:astore          9
			if(format1.bitrate > format.bitrate && l1 < minDurationForQualityIncreaseUs(l2))
	//*  31   63:aload           9
	//*  32   65:getfield        #109 <Field int Format.bitrate>
	//*  33   68:aload           8
	//*  34   70:getfield        #109 <Field int Format.bitrate>
	//*  35   73:icmple          96
	//*  36   76:lload_3         
	//*  37   77:aload_0         
	//*  38   78:lload           5
	//*  39   80:invokespecial   #172 <Method long minDurationForQualityIncreaseUs(long)>
	//*  40   83:lcmp            
	//*  41   84:ifge            96
				selectedIndex = i;
	//   42   87:aload_0         
	//   43   88:iload           7
	//   44   90:putfield        #87  <Field int selectedIndex>
			else
	//*  45   93:goto            124
			if(format1.bitrate < format.bitrate && l1 >= maxDurationForQualityDecreaseUs)
	//*  46   96:aload           9
	//*  47   98:getfield        #109 <Field int Format.bitrate>
	//*  48  101:aload           8
	//*  49  103:getfield        #109 <Field int Format.bitrate>
	//*  50  106:icmpge          124
	//*  51  109:lload_3         
	//*  52  110:aload_0         
	//*  53  111:getfield        #61  <Field long maxDurationForQualityDecreaseUs>
	//*  54  114:lcmp            
	//*  55  115:iflt            124
				selectedIndex = i;
	//   56  118:aload_0         
	//   57  119:iload           7
	//   58  121:putfield        #87  <Field int selectedIndex>
		}
		if(selectedIndex != i)
	//*  59  124:aload_0         
	//*  60  125:getfield        #87  <Field int selectedIndex>
	//*  61  128:iload           7
	//*  62  130:icmpeq          138
			reason = 3;
	//   63  133:aload_0         
	//   64  134:iconst_3        
	//   65  135:putfield        #75  <Field int reason>
	//   66  138:return          
	}

	public static final float DEFAULT_BANDWIDTH_FRACTION = 0.75F;
	public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75F;
	public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
	public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
	public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
	public static final long DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 2000L;
	private final float bandwidthFraction;
	private final BandwidthMeter bandwidthMeter;
	private final float bufferedFractionToLiveEdgeForQualityIncrease;
	private final Clock clock;
	private long lastBufferEvaluationMs;
	private final long maxDurationForQualityDecreaseUs;
	private final long minDurationForQualityIncreaseUs;
	private final long minDurationToRetainAfterDiscardUs;
	private final long minTimeBetweenBufferReevaluationMs;
	private float playbackSpeed;
	private int reason;
	private int selectedIndex;
}
