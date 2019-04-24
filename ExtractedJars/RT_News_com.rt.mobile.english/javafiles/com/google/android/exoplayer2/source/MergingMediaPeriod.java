// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaPeriod, SequenceableLoader, CompositeSequenceableLoaderFactory, TrackGroupArray, 
//			TrackGroup, SampleStream

final class MergingMediaPeriod
	implements MediaPeriod, MediaPeriod.Callback
{

	public transient MergingMediaPeriod(CompositeSequenceableLoaderFactory compositesequenceableloaderfactory, MediaPeriod amediaperiod[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		compositeSequenceableLoaderFactory = compositesequenceableloaderfactory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		periods = amediaperiod;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #34  <Field MediaPeriod[] periods>
	//    8   14:aload_0         
	//    9   15:new             #36  <Class ArrayList>
	//   10   18:dup             
	//   11   19:invokespecial   #37  <Method void ArrayList()>
	//   12   22:putfield        #39  <Field ArrayList childrenPendingPreparation>
		compositeSequenceableLoader = compositesequenceableloaderfactory.createCompositeSequenceableLoader(new SequenceableLoader[0]);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:iconst_0        
	//   16   28:anewarray       SequenceableLoader[]
	//   17   31:invokeinterface #47  <Method SequenceableLoader CompositeSequenceableLoaderFactory.createCompositeSequenceableLoader(SequenceableLoader[])>
	//   18   36:putfield        #49  <Field SequenceableLoader compositeSequenceableLoader>
	//   19   39:aload_0         
	//   20   40:new             #51  <Class IdentityHashMap>
	//   21   43:dup             
	//   22   44:invokespecial   #52  <Method void IdentityHashMap()>
	//   23   47:putfield        #54  <Field IdentityHashMap streamPeriodIndices>
	//   24   50:return          
	}

	public boolean continueLoading(long l)
	{
		if(!childrenPendingPreparation.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field ArrayList childrenPendingPreparation>
	//*   2    4:invokevirtual   #61  <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifne            54
		{
			int j = childrenPendingPreparation.size();
	//    4   10:aload_0         
	//    5   11:getfield        #39  <Field ArrayList childrenPendingPreparation>
	//    6   14:invokevirtual   #65  <Method int ArrayList.size()>
	//    7   17:istore          4
			for(int i = 0; i < j; i++)
	//*   8   19:iconst_0        
	//*   9   20:istore_3        
	//*  10   21:iload_3         
	//*  11   22:iload           4
	//*  12   24:icmpge          52
				((MediaPeriod)childrenPendingPreparation.get(i)).continueLoading(l);
	//   13   27:aload_0         
	//   14   28:getfield        #39  <Field ArrayList childrenPendingPreparation>
	//   15   31:iload_3         
	//   16   32:invokevirtual   #69  <Method Object ArrayList.get(int)>
	//   17   35:checkcast       #6   <Class MediaPeriod>
	//   18   38:lload_1         
	//   19   39:invokeinterface #71  <Method boolean MediaPeriod.continueLoading(long)>
	//   20   44:pop             

	//   21   45:iload_3         
	//   22   46:iconst_1        
	//   23   47:iadd            
	//   24   48:istore_3        
	//*  25   49:goto            21
			return false;
	//   26   52:iconst_0        
	//   27   53:ireturn         
		} else
		{
			return compositeSequenceableLoader.continueLoading(l);
	//   28   54:aload_0         
	//   29   55:getfield        #49  <Field SequenceableLoader compositeSequenceableLoader>
	//   30   58:lload_1         
	//   31   59:invokeinterface #72  <Method boolean SequenceableLoader.continueLoading(long)>
	//   32   64:ireturn         
		}
	}

	public void discardBuffer(long l, boolean flag)
	{
		MediaPeriod amediaperiod[] = enabledPeriods;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field MediaPeriod[] enabledPeriods>
	//    2    4:astore          6
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		for(int j = amediaperiod.length; i < j; i++)
	//*   5    9:aload           6
	//*   6   11:arraylength     
	//*   7   12:istore          5
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          42
			amediaperiod[i].discardBuffer(l, flag);
	//   11   21:aload           6
	//   12   23:iload           4
	//   13   25:aaload          
	//   14   26:lload_1         
	//   15   27:iload_3         
	//   16   28:invokeinterface #78  <Method void MediaPeriod.discardBuffer(long, boolean)>

	//   17   33:iload           4
	//   18   35:iconst_1        
	//   19   36:iadd            
	//   20   37:istore          4
	//*  21   39:goto            14
	//   22   42:return          
	}

	public long getAdjustedSeekPositionUs(long l, SeekParameters seekparameters)
	{
		return enabledPeriods[0].getAdjustedSeekPositionUs(l, seekparameters);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field MediaPeriod[] enabledPeriods>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:lload_1         
	//    5    7:aload_3         
	//    6    8:invokeinterface #82  <Method long MediaPeriod.getAdjustedSeekPositionUs(long, SeekParameters)>
	//    7   13:lreturn         
	}

	public long getBufferedPositionUs()
	{
		return compositeSequenceableLoader.getBufferedPositionUs();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field SequenceableLoader compositeSequenceableLoader>
	//    2    4:invokeinterface #86  <Method long SequenceableLoader.getBufferedPositionUs()>
	//    3    9:lreturn         
	}

	public long getNextLoadPositionUs()
	{
		return compositeSequenceableLoader.getNextLoadPositionUs();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field SequenceableLoader compositeSequenceableLoader>
	//    2    4:invokeinterface #89  <Method long SequenceableLoader.getNextLoadPositionUs()>
	//    3    9:lreturn         
	}

	public TrackGroupArray getTrackGroups()
	{
		return trackGroups;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field TrackGroupArray trackGroups>
	//    2    4:areturn         
	}

	public void maybeThrowPrepareError()
		throws IOException
	{
		MediaPeriod amediaperiod[] = periods;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field MediaPeriod[] periods>
	//    2    4:astore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		for(int j = amediaperiod.length; i < j; i++)
	//*   5    7:aload_3         
	//*   6    8:arraylength     
	//*   7    9:istore_2        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          30
			amediaperiod[i].maybeThrowPrepareError();
	//   11   15:aload_3         
	//   12   16:iload_1         
	//   13   17:aaload          
	//   14   18:invokeinterface #98  <Method void MediaPeriod.maybeThrowPrepareError()>

	//   15   23:iload_1         
	//   16   24:iconst_1        
	//   17   25:iadd            
	//   18   26:istore_1        
	//*  19   27:goto            10
	//   20   30:return          
	}

	public void onContinueLoadingRequested(MediaPeriod mediaperiod)
	{
		callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field MediaPeriod$Callback callback>
	//    2    4:aload_0         
	//    3    5:invokeinterface #106 <Method void MediaPeriod$Callback.onContinueLoadingRequested(SequenceableLoader)>
	//    4   10:return          
	}

	public volatile void onContinueLoadingRequested(SequenceableLoader sequenceableloader)
	{
		onContinueLoadingRequested((MediaPeriod)sequenceableloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #6   <Class MediaPeriod>
	//    3    5:invokevirtual   #108 <Method void onContinueLoadingRequested(MediaPeriod)>
	//    4    8:return          
	}

	public void onPrepared(MediaPeriod mediaperiod)
	{
		childrenPendingPreparation.remove(((Object) (mediaperiod)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ArrayList childrenPendingPreparation>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #113 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
		if(!childrenPendingPreparation.isEmpty())
	//*   5    9:aload_0         
	//*   6   10:getfield        #39  <Field ArrayList childrenPendingPreparation>
	//*   7   13:invokevirtual   #61  <Method boolean ArrayList.isEmpty()>
	//*   8   16:ifne            20
			return;
	//    9   19:return          
		mediaperiod = ((MediaPeriod) (periods));
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field MediaPeriod[] periods>
	//   12   24:astore_1        
		int k = mediaperiod.length;
	//   13   25:aload_1         
	//   14   26:arraylength     
	//   15   27:istore          4
		int i = 0;
	//   16   29:iconst_0        
	//   17   30:istore_2        
		int j = i;
	//   18   31:iload_2         
	//   19   32:istore_3        
		for(; i < k; i++)
	//*  20   33:iload_2         
	//*  21   34:iload           4
	//*  22   36:icmpge          60
			j += ((MediaPeriod) (mediaperiod[i])).getTrackGroups().length;
	//   23   39:iload_3         
	//   24   40:aload_1         
	//   25   41:iload_2         
	//   26   42:aaload          
	//   27   43:invokeinterface #115 <Method TrackGroupArray MediaPeriod.getTrackGroups()>
	//   28   48:getfield        #121 <Field int TrackGroupArray.length>
	//   29   51:iadd            
	//   30   52:istore_3        

	//   31   53:iload_2         
	//   32   54:iconst_1        
	//   33   55:iadd            
	//   34   56:istore_2        
	//*  35   57:goto            33
		mediaperiod = ((MediaPeriod) (new TrackGroup[j]));
	//   36   60:iload_3         
	//   37   61:anewarray       TrackGroup[]
	//   38   64:astore_1        
		MediaPeriod amediaperiod[] = periods;
	//   39   65:aload_0         
	//   40   66:getfield        #34  <Field MediaPeriod[] periods>
	//   41   69:astore          7
		int i1 = amediaperiod.length;
	//   42   71:aload           7
	//   43   73:arraylength     
	//   44   74:istore          5
		j = 0;
	//   45   76:iconst_0        
	//   46   77:istore_3        
		i = j;
	//   47   78:iload_3         
	//   48   79:istore_2        
		for(; j < i1; j++)
	//*  49   80:iload_3         
	//*  50   81:iload           5
	//*  51   83:icmpge          144
		{
			TrackGroupArray trackgrouparray = amediaperiod[j].getTrackGroups();
	//   52   86:aload           7
	//   53   88:iload_3         
	//   54   89:aaload          
	//   55   90:invokeinterface #115 <Method TrackGroupArray MediaPeriod.getTrackGroups()>
	//   56   95:astore          8
			int j1 = trackgrouparray.length;
	//   57   97:aload           8
	//   58   99:getfield        #121 <Field int TrackGroupArray.length>
	//   59  102:istore          6
			for(int l = 0; l < j1;)
	//*  60  104:iconst_0        
	//*  61  105:istore          4
	//*  62  107:iload           4
	//*  63  109:iload           6
	//*  64  111:icmpge          137
			{
				mediaperiod[i] = ((/*<invalid signature>*/java.lang.Object) (trackgrouparray.get(l)));
	//   65  114:aload_1         
	//   66  115:iload_2         
	//   67  116:aload           8
	//   68  118:iload           4
	//   69  120:invokevirtual   #126 <Method TrackGroup TrackGroupArray.get(int)>
	//   70  123:aastore         
				l++;
	//   71  124:iload           4
	//   72  126:iconst_1        
	//   73  127:iadd            
	//   74  128:istore          4
				i++;
	//   75  130:iload_2         
	//   76  131:iconst_1        
	//   77  132:iadd            
	//   78  133:istore_2        
			}

		}

	//   79  134:goto            107
	//   80  137:iload_3         
	//   81  138:iconst_1        
	//   82  139:iadd            
	//   83  140:istore_3        
	//*  84  141:goto            80
		trackGroups = new TrackGroupArray(((TrackGroup []) (mediaperiod)));
	//   85  144:aload_0         
	//   86  145:new             #117 <Class TrackGroupArray>
	//   87  148:dup             
	//   88  149:aload_1         
	//   89  150:invokespecial   #129 <Method void TrackGroupArray(TrackGroup[])>
	//   90  153:putfield        #93  <Field TrackGroupArray trackGroups>
		callback.onPrepared(((MediaPeriod) (this)));
	//   91  156:aload_0         
	//   92  157:getfield        #103 <Field MediaPeriod$Callback callback>
	//   93  160:aload_0         
	//   94  161:invokeinterface #131 <Method void MediaPeriod$Callback.onPrepared(MediaPeriod)>
	//   95  166:return          
	}

	public void prepare(MediaPeriod.Callback callback1, long l)
	{
		callback = callback1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #103 <Field MediaPeriod$Callback callback>
		Collections.addAll(((java.util.Collection) (childrenPendingPreparation)), ((Object []) (periods)));
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field ArrayList childrenPendingPreparation>
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field MediaPeriod[] periods>
	//    7   13:invokestatic    #139 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//    8   16:pop             
		callback1 = ((MediaPeriod.Callback) (periods));
	//    9   17:aload_0         
	//   10   18:getfield        #34  <Field MediaPeriod[] periods>
	//   11   21:astore_1        
		int i = 0;
	//   12   22:iconst_0        
	//   13   23:istore          4
		for(int j = callback1.length; i < j; i++)
	//*  14   25:aload_1         
	//*  15   26:arraylength     
	//*  16   27:istore          5
	//*  17   29:iload           4
	//*  18   31:iload           5
	//*  19   33:icmpge          56
			((MediaPeriod) (callback1[i])).prepare(((MediaPeriod.Callback) (this)), l);
	//   20   36:aload_1         
	//   21   37:iload           4
	//   22   39:aaload          
	//   23   40:aload_0         
	//   24   41:lload_2         
	//   25   42:invokeinterface #141 <Method void MediaPeriod.prepare(MediaPeriod$Callback, long)>

	//   26   47:iload           4
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:istore          4
	//*  30   53:goto            29
	//   31   56:return          
	}

	public long readDiscontinuity()
	{
		long l = periods[0].readDiscontinuity();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field MediaPeriod[] periods>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:invokeinterface #144 <Method long MediaPeriod.readDiscontinuity()>
	//    5   11:lstore_3        
		for(int i = 1; i < periods.length; i++)
	//*   6   12:iconst_1        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #34  <Field MediaPeriod[] periods>
	//*  11   19:arraylength     
	//*  12   20:icmpge          58
			if(periods[i].readDiscontinuity() != 0x1L)
	//*  13   23:aload_0         
	//*  14   24:getfield        #34  <Field MediaPeriod[] periods>
	//*  15   27:iload_1         
	//*  16   28:aaload          
	//*  17   29:invokeinterface #144 <Method long MediaPeriod.readDiscontinuity()>
	//*  18   34:ldc2w           #145 <Long 0x1L>
	//*  19   37:lcmp            
	//*  20   38:ifeq            51
				throw new IllegalStateException("Child reported discontinuity.");
	//   21   41:new             #148 <Class IllegalStateException>
	//   22   44:dup             
	//   23   45:ldc1            #150 <String "Child reported discontinuity.">
	//   24   47:invokespecial   #153 <Method void IllegalStateException(String)>
	//   25   50:athrow          

	//   26   51:iload_1         
	//   27   52:iconst_1        
	//   28   53:iadd            
	//   29   54:istore_1        
	//*  30   55:goto            14
		if(l != 0x1L)
	//*  31   58:lload_3         
	//*  32   59:ldc2w           #145 <Long 0x1L>
	//*  33   62:lcmp            
	//*  34   63:ifeq            130
		{
			MediaPeriod amediaperiod[] = enabledPeriods;
	//   35   66:aload_0         
	//   36   67:getfield        #76  <Field MediaPeriod[] enabledPeriods>
	//   37   70:astore          5
			int k = amediaperiod.length;
	//   38   72:aload           5
	//   39   74:arraylength     
	//   40   75:istore_2        
			for(int j = 0; j < k; j++)
	//*  41   76:iconst_0        
	//*  42   77:istore_1        
	//*  43   78:iload_1         
	//*  44   79:iload_2         
	//*  45   80:icmpge          130
			{
				MediaPeriod mediaperiod = amediaperiod[j];
	//   46   83:aload           5
	//   47   85:iload_1         
	//   48   86:aaload          
	//   49   87:astore          6
				if(mediaperiod != periods[0] && mediaperiod.seekToUs(l) != l)
	//*  50   89:aload           6
	//*  51   91:aload_0         
	//*  52   92:getfield        #34  <Field MediaPeriod[] periods>
	//*  53   95:iconst_0        
	//*  54   96:aaload          
	//*  55   97:if_acmpeq       123
	//*  56  100:aload           6
	//*  57  102:lload_3         
	//*  58  103:invokeinterface #157 <Method long MediaPeriod.seekToUs(long)>
	//*  59  108:lload_3         
	//*  60  109:lcmp            
	//*  61  110:ifeq            123
					throw new IllegalStateException("Unexpected child seekToUs result.");
	//   62  113:new             #148 <Class IllegalStateException>
	//   63  116:dup             
	//   64  117:ldc1            #159 <String "Unexpected child seekToUs result.">
	//   65  119:invokespecial   #153 <Method void IllegalStateException(String)>
	//   66  122:athrow          
			}

	//   67  123:iload_1         
	//   68  124:iconst_1        
	//   69  125:iadd            
	//   70  126:istore_1        
		}
	//*  71  127:goto            78
		return l;
	//   72  130:lload_3         
	//   73  131:lreturn         
	}

	public void reevaluateBuffer(long l)
	{
		compositeSequenceableLoader.reevaluateBuffer(l);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field SequenceableLoader compositeSequenceableLoader>
	//    2    4:lload_1         
	//    3    5:invokeinterface #163 <Method void SequenceableLoader.reevaluateBuffer(long)>
	//    4   10:return          
	}

	public long seekToUs(long l)
	{
		l = enabledPeriods[0].seekToUs(l);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field MediaPeriod[] enabledPeriods>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:lload_1         
	//    5    7:invokeinterface #157 <Method long MediaPeriod.seekToUs(long)>
	//    6   12:lstore_1        
		for(int i = 1; i < enabledPeriods.length; i++)
	//*   7   13:iconst_1        
	//*   8   14:istore_3        
	//*   9   15:iload_3         
	//*  10   16:aload_0         
	//*  11   17:getfield        #76  <Field MediaPeriod[] enabledPeriods>
	//*  12   20:arraylength     
	//*  13   21:icmpge          58
			if(enabledPeriods[i].seekToUs(l) != l)
	//*  14   24:aload_0         
	//*  15   25:getfield        #76  <Field MediaPeriod[] enabledPeriods>
	//*  16   28:iload_3         
	//*  17   29:aaload          
	//*  18   30:lload_1         
	//*  19   31:invokeinterface #157 <Method long MediaPeriod.seekToUs(long)>
	//*  20   36:lload_1         
	//*  21   37:lcmp            
	//*  22   38:ifeq            51
				throw new IllegalStateException("Unexpected child seekToUs result.");
	//   23   41:new             #148 <Class IllegalStateException>
	//   24   44:dup             
	//   25   45:ldc1            #159 <String "Unexpected child seekToUs result.">
	//   26   47:invokespecial   #153 <Method void IllegalStateException(String)>
	//   27   50:athrow          

	//   28   51:iload_3         
	//   29   52:iconst_1        
	//   30   53:iadd            
	//   31   54:istore_3        
	//*  32   55:goto            15
		return l;
	//   33   58:lload_1         
	//   34   59:lreturn         
	}

	public long selectTracks(TrackSelection atrackselection[], boolean aflag[], SampleStream asamplestream[], boolean aflag1[], long l)
	{
		int ai[] = new int[atrackselection.length];
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:newarray        int[]
	//    3    4:astore          20
		int ai1[] = new int[atrackselection.length];
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:newarray        int[]
	//    7   10:astore          21
label0:
		for(int i = 0; i < atrackselection.length; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore          7
	//*  10   15:iload           7
	//*  11   17:aload_1         
	//*  12   18:arraylength     
	//*  13   19:icmpge          147
		{
			int k;
			if(asamplestream[i] == null)
	//*  14   22:aload_3         
	//*  15   23:iload           7
	//*  16   25:aaload          
	//*  17   26:ifnonnull       35
				k = -1;
	//   18   29:iconst_m1       
	//   19   30:istore          8
			else
	//*  20   32:goto            54
				k = ((Integer)streamPeriodIndices.get(((Object) (asamplestream[i])))).intValue();
	//   21   35:aload_0         
	//   22   36:getfield        #54  <Field IdentityHashMap streamPeriodIndices>
	//   23   39:aload_3         
	//   24   40:iload           7
	//   25   42:aaload          
	//   26   43:invokevirtual   #168 <Method Object IdentityHashMap.get(Object)>
	//   27   46:checkcast       #170 <Class Integer>
	//   28   49:invokevirtual   #173 <Method int Integer.intValue()>
	//   29   52:istore          8
			ai[i] = k;
	//   30   54:aload           20
	//   31   56:iload           7
	//   32   58:iload           8
	//   33   60:iastore         
			ai1[i] = -1;
	//   34   61:aload           21
	//   35   63:iload           7
	//   36   65:iconst_m1       
	//   37   66:iastore         
			if(atrackselection[i] == null)
				continue;
	//   38   67:aload_1         
	//   39   68:iload           7
	//   40   70:aaload          
	//   41   71:ifnull          138
			TrackGroup trackgroup = atrackselection[i].getTrackGroup();
	//   42   74:aload_1         
	//   43   75:iload           7
	//   44   77:aaload          
	//   45   78:invokeinterface #179 <Method TrackGroup TrackSelection.getTrackGroup()>
	//   46   83:astore          16
			k = 0;
	//   47   85:iconst_0        
	//   48   86:istore          8
			do
			{
				if(k >= periods.length)
					continue label0;
	//   49   88:iload           8
	//   50   90:aload_0         
	//   51   91:getfield        #34  <Field MediaPeriod[] periods>
	//   52   94:arraylength     
	//   53   95:icmpge          138
				if(periods[k].getTrackGroups().indexOf(trackgroup) != -1)
	//*  54   98:aload_0         
	//*  55   99:getfield        #34  <Field MediaPeriod[] periods>
	//*  56  102:iload           8
	//*  57  104:aaload          
	//*  58  105:invokeinterface #115 <Method TrackGroupArray MediaPeriod.getTrackGroups()>
	//*  59  110:aload           16
	//*  60  112:invokevirtual   #183 <Method int TrackGroupArray.indexOf(TrackGroup)>
	//*  61  115:iconst_m1       
	//*  62  116:icmpeq          129
				{
					ai1[i] = k;
	//   63  119:aload           21
	//   64  121:iload           7
	//   65  123:iload           8
	//   66  125:iastore         
					continue label0;
	//   67  126:goto            138
				}
				k++;
	//   68  129:iload           8
	//   69  131:iconst_1        
	//   70  132:iadd            
	//   71  133:istore          8
			} while(true);
	//   72  135:goto            88
		}

	//   73  138:iload           7
	//   74  140:iconst_1        
	//   75  141:iadd            
	//   76  142:istore          7
	//*  77  144:goto            15
		streamPeriodIndices.clear();
	//   78  147:aload_0         
	//   79  148:getfield        #54  <Field IdentityHashMap streamPeriodIndices>
	//   80  151:invokevirtual   #186 <Method void IdentityHashMap.clear()>
		SampleStream asamplestream1[] = new SampleStream[atrackselection.length];
	//   81  154:aload_1         
	//   82  155:arraylength     
	//   83  156:anewarray       SampleStream[]
	//   84  159:astore          22
		SampleStream asamplestream2[] = new SampleStream[atrackselection.length];
	//   85  161:aload_1         
	//   86  162:arraylength     
	//   87  163:anewarray       SampleStream[]
	//   88  166:astore          23
		TrackSelection atrackselection1[] = new TrackSelection[atrackselection.length];
	//   89  168:aload_1         
	//   90  169:arraylength     
	//   91  170:anewarray       TrackSelection[]
	//   92  173:astore          16
		ArrayList arraylist = new ArrayList(periods.length);
	//   93  175:new             #36  <Class ArrayList>
	//   94  178:dup             
	//   95  179:aload_0         
	//   96  180:getfield        #34  <Field MediaPeriod[] periods>
	//   97  183:arraylength     
	//   98  184:invokespecial   #191 <Method void ArrayList(int)>
	//   99  187:astore          17
		for(int j = 0; j < periods.length;)
	//* 100  189:iconst_0        
	//* 101  190:istore          7
	//* 102  192:iload           7
	//* 103  194:aload_0         
	//* 104  195:getfield        #34  <Field MediaPeriod[] periods>
	//* 105  198:arraylength     
	//* 106  199:icmpge          508
		{
			for(int i1 = 0; i1 < atrackselection.length; i1++)
	//* 107  202:iconst_0        
	//* 108  203:istore          8
	//* 109  205:iload           8
	//* 110  207:aload_1         
	//* 111  208:arraylength     
	//* 112  209:icmpge          284
			{
				int k1 = ai[i1];
	//  113  212:aload           20
	//  114  214:iload           8
	//  115  216:iaload          
	//  116  217:istore          9
				Object obj1 = null;
	//  117  219:aconst_null     
	//  118  220:astore          19
				Object obj;
				if(k1 == j)
	//* 119  222:iload           9
	//* 120  224:iload           7
	//* 121  226:icmpne          238
					obj = ((Object) (asamplestream[i1]));
	//  122  229:aload_3         
	//  123  230:iload           8
	//  124  232:aaload          
	//  125  233:astore          18
				else
	//* 126  235:goto            241
					obj = null;
	//  127  238:aconst_null     
	//  128  239:astore          18
				asamplestream2[i1] = ((SampleStream) (obj));
	//  129  241:aload           23
	//  130  243:iload           8
	//  131  245:aload           18
	//  132  247:aastore         
				obj = ((Object) (obj1));
	//  133  248:aload           19
	//  134  250:astore          18
				if(ai1[i1] == j)
	//* 135  252:aload           21
	//* 136  254:iload           8
	//* 137  256:iaload          
	//* 138  257:iload           7
	//* 139  259:icmpne          268
					obj = ((Object) (atrackselection[i1]));
	//  140  262:aload_1         
	//  141  263:iload           8
	//  142  265:aaload          
	//  143  266:astore          18
				atrackselection1[i1] = ((TrackSelection) (obj));
	//  144  268:aload           16
	//  145  270:iload           8
	//  146  272:aload           18
	//  147  274:aastore         
			}

	//  148  275:iload           8
	//  149  277:iconst_1        
	//  150  278:iadd            
	//  151  279:istore          8
	//* 152  281:goto            205
			long l3 = periods[j].selectTracks(atrackselection1, aflag, asamplestream2, aflag1, l);
	//  153  284:aload_0         
	//  154  285:getfield        #34  <Field MediaPeriod[] periods>
	//  155  288:iload           7
	//  156  290:aaload          
	//  157  291:aload           16
	//  158  293:aload_2         
	//  159  294:aload           23
	//  160  296:aload           4
	//  161  298:lload           5
	//  162  300:invokeinterface #193 <Method long MediaPeriod.selectTracks(TrackSelection[], boolean[], SampleStream[], boolean[], long)>
	//  163  305:lstore          13
			long l2;
			if(j == 0)
	//* 164  307:iload           7
	//* 165  309:ifne            319
			{
				l2 = l3;
	//  166  312:lload           13
	//  167  314:lstore          11
			} else
	//* 168  316:goto            341
			{
				l2 = l;
	//  169  319:lload           5
	//  170  321:lstore          11
				if(l3 != l)
	//* 171  323:lload           13
	//* 172  325:lload           5
	//* 173  327:lcmp            
	//* 174  328:ifeq            341
					throw new IllegalStateException("Children enabled at different positions.");
	//  175  331:new             #148 <Class IllegalStateException>
	//  176  334:dup             
	//  177  335:ldc1            #195 <String "Children enabled at different positions.">
	//  178  337:invokespecial   #153 <Method void IllegalStateException(String)>
	//  179  340:athrow          
			}
			int j1 = 0;
	//  180  341:iconst_0        
	//  181  342:istore          8
			boolean flag;
			int l1;
			for(flag = false; j1 < atrackselection.length; flag = ((boolean) (l1)))
	//* 182  344:iconst_0        
	//* 183  345:istore          9
	//* 184  347:iload           8
	//* 185  349:aload_1         
	//* 186  350:arraylength     
	//* 187  351:icmpge          477
			{
				l1 = ai1[j1];
	//  188  354:aload           21
	//  189  356:iload           8
	//  190  358:iaload          
	//  191  359:istore          10
				boolean flag1 = true;
	//  192  361:iconst_1        
	//  193  362:istore          15
				if(l1 == j)
	//* 194  364:iload           10
	//* 195  366:iload           7
	//* 196  368:icmpne          427
				{
					if(asamplestream2[j1] != null)
	//* 197  371:aload           23
	//* 198  373:iload           8
	//* 199  375:aaload          
	//* 200  376:ifnull          385
						flag1 = true;
	//  201  379:iconst_1        
	//  202  380:istore          15
					else
	//* 203  382:goto            388
						flag1 = false;
	//  204  385:iconst_0        
	//  205  386:istore          15
					Assertions.checkState(flag1);
	//  206  388:iload           15
	//  207  390:invokestatic    #201 <Method void Assertions.checkState(boolean)>
					asamplestream1[j1] = asamplestream2[j1];
	//  208  393:aload           22
	//  209  395:iload           8
	//  210  397:aload           23
	//  211  399:iload           8
	//  212  401:aaload          
	//  213  402:aastore         
					streamPeriodIndices.put(((Object) (asamplestream2[j1])), ((Object) (Integer.valueOf(j))));
	//  214  403:aload_0         
	//  215  404:getfield        #54  <Field IdentityHashMap streamPeriodIndices>
	//  216  407:aload           23
	//  217  409:iload           8
	//  218  411:aaload          
	//  219  412:iload           7
	//  220  414:invokestatic    #205 <Method Integer Integer.valueOf(int)>
	//  221  417:invokevirtual   #209 <Method Object IdentityHashMap.put(Object, Object)>
	//  222  420:pop             
					l1 = 1;
	//  223  421:iconst_1        
	//  224  422:istore          10
				} else
	//* 225  424:goto            464
				{
					l1 = ((int) (flag));
	//  226  427:iload           9
	//  227  429:istore          10
					if(ai[j1] == j)
	//* 228  431:aload           20
	//* 229  433:iload           8
	//* 230  435:iaload          
	//* 231  436:iload           7
	//* 232  438:icmpne          464
					{
						if(asamplestream2[j1] != null)
	//* 233  441:aload           23
	//* 234  443:iload           8
	//* 235  445:aaload          
	//* 236  446:ifnonnull       452
	//* 237  449:goto            455
							flag1 = false;
	//  238  452:iconst_0        
	//  239  453:istore          15
						Assertions.checkState(flag1);
	//  240  455:iload           15
	//  241  457:invokestatic    #201 <Method void Assertions.checkState(boolean)>
						l1 = ((int) (flag));
	//  242  460:iload           9
	//  243  462:istore          10
					}
				}
				j1++;
	//  244  464:iload           8
	//  245  466:iconst_1        
	//  246  467:iadd            
	//  247  468:istore          8
			}

	//  248  470:iload           10
	//  249  472:istore          9
	//* 250  474:goto            347
			if(flag)
	//* 251  477:iload           9
	//* 252  479:ifeq            495
				arraylist.add(((Object) (periods[j])));
	//  253  482:aload           17
	//  254  484:aload_0         
	//  255  485:getfield        #34  <Field MediaPeriod[] periods>
	//  256  488:iload           7
	//  257  490:aaload          
	//  258  491:invokevirtual   #212 <Method boolean ArrayList.add(Object)>
	//  259  494:pop             
			j++;
	//  260  495:iload           7
	//  261  497:iconst_1        
	//  262  498:iadd            
	//  263  499:istore          7
			l = l2;
	//  264  501:lload           11
	//  265  503:lstore          5
		}

	//* 266  505:goto            192
		System.arraycopy(((Object) (asamplestream1)), 0, ((Object) (asamplestream)), 0, asamplestream1.length);
	//  267  508:aload           22
	//  268  510:iconst_0        
	//  269  511:aload_3         
	//  270  512:iconst_0        
	//  271  513:aload           22
	//  272  515:arraylength     
	//  273  516:invokestatic    #218 <Method void System.arraycopy(Object, int, Object, int, int)>
		enabledPeriods = new MediaPeriod[arraylist.size()];
	//  274  519:aload_0         
	//  275  520:aload           17
	//  276  522:invokevirtual   #65  <Method int ArrayList.size()>
	//  277  525:anewarray       MediaPeriod[]
	//  278  528:putfield        #76  <Field MediaPeriod[] enabledPeriods>
		arraylist.toArray(((Object []) (enabledPeriods)));
	//  279  531:aload           17
	//  280  533:aload_0         
	//  281  534:getfield        #76  <Field MediaPeriod[] enabledPeriods>
	//  282  537:invokevirtual   #222 <Method Object[] ArrayList.toArray(Object[])>
	//  283  540:pop             
		compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(((SequenceableLoader []) (enabledPeriods)));
	//  284  541:aload_0         
	//  285  542:aload_0         
	//  286  543:getfield        #32  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
	//  287  546:aload_0         
	//  288  547:getfield        #76  <Field MediaPeriod[] enabledPeriods>
	//  289  550:invokeinterface #47  <Method SequenceableLoader CompositeSequenceableLoaderFactory.createCompositeSequenceableLoader(SequenceableLoader[])>
	//  290  555:putfield        #49  <Field SequenceableLoader compositeSequenceableLoader>
		return l;
	//  291  558:lload           5
	//  292  560:lreturn         
	}

	private MediaPeriod.Callback callback;
	private final ArrayList childrenPendingPreparation = new ArrayList();
	private SequenceableLoader compositeSequenceableLoader;
	private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
	private MediaPeriod enabledPeriods[];
	public final MediaPeriod periods[];
	private final IdentityHashMap streamPeriodIndices = new IdentityHashMap();
	private TrackGroupArray trackGroups;
}
