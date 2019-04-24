// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source:
//			CompositeMediaSource, DefaultCompositeSequenceableLoaderFactory, MediaPeriod, MediaSource, 
//			MergingMediaPeriod, CompositeSequenceableLoaderFactory

public final class MergingMediaSource extends CompositeMediaSource
{
	public static final class IllegalMergeException extends IOException
	{

		public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
		public final int reason;

		public IllegalMergeException(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void IOException()>
			reason = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #21  <Field int reason>
		//    5    9:return          
		}
	}

	public static interface IllegalMergeException.Reason
		extends Annotation
	{
	}


	public transient MergingMediaSource(CompositeSequenceableLoaderFactory compositesequenceableloaderfactory, MediaSource amediasource[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void CompositeMediaSource()>
		mediaSources = amediasource;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #35  <Field MediaSource[] mediaSources>
		compositeSequenceableLoaderFactory = compositesequenceableloaderfactory;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #37  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		pendingTimelineSources = new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (amediasource))))));
	//    8   14:aload_0         
	//    9   15:new             #39  <Class ArrayList>
	//   10   18:dup             
	//   11   19:aload_2         
	//   12   20:invokestatic    #45  <Method java.util.List Arrays.asList(Object[])>
	//   13   23:invokespecial   #48  <Method void ArrayList(java.util.Collection)>
	//   14   26:putfield        #50  <Field ArrayList pendingTimelineSources>
		periodCount = -1;
	//   15   29:aload_0         
	//   16   30:iconst_m1       
	//   17   31:putfield        #52  <Field int periodCount>
	//   18   34:return          
	}

	public transient MergingMediaSource(MediaSource amediasource[])
	{
		this(((CompositeSequenceableLoaderFactory) (new DefaultCompositeSequenceableLoaderFactory())), amediasource);
	//    0    0:aload_0         
	//    1    1:new             #56  <Class DefaultCompositeSequenceableLoaderFactory>
	//    2    4:dup             
	//    3    5:invokespecial   #57  <Method void DefaultCompositeSequenceableLoaderFactory()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #59  <Method void MergingMediaSource(CompositeSequenceableLoaderFactory, MediaSource[])>
	//    6   12:return          
	}

	private IllegalMergeException checkTimelineMerges(Timeline timeline)
	{
		if(periodCount == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int periodCount>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          19
			periodCount = timeline.getPeriodCount();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #67  <Method int Timeline.getPeriodCount()>
	//    7   13:putfield        #52  <Field int periodCount>
		else
	//*   8   16:goto            39
		if(timeline.getPeriodCount() != periodCount)
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #67  <Method int Timeline.getPeriodCount()>
	//*  11   23:aload_0         
	//*  12   24:getfield        #52  <Field int periodCount>
	//*  13   27:icmpeq          39
			return new IllegalMergeException(0);
	//   14   30:new             #7   <Class MergingMediaSource$IllegalMergeException>
	//   15   33:dup             
	//   16   34:iconst_0        
	//   17   35:invokespecial   #70  <Method void MergingMediaSource$IllegalMergeException(int)>
	//   18   38:areturn         
		return null;
	//   19   39:aconst_null     
	//   20   40:areturn         
	}

	public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaperiodid, Allocator allocator)
	{
		Object aobj[] = ((Object []) (mediaSources));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field MediaSource[] mediaSources>
	//    2    4:astore          4
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		for(aobj = ((Object []) (new MediaPeriod[aobj.length])); i < aobj.length; i++)
	//*   5    8:aload           4
	//*   6   10:arraylength     
	//*   7   11:anewarray       MediaPeriod[]
	//*   8   14:astore          4
	//*   9   16:iload_3         
	//*  10   17:aload           4
	//*  11   19:arraylength     
	//*  12   20:icmpge          47
			aobj[i] = mediaSources[i].createPeriod(mediaperiodid, allocator);
	//   13   23:aload           4
	//   14   25:iload_3         
	//   15   26:aload_0         
	//   16   27:getfield        #35  <Field MediaSource[] mediaSources>
	//   17   30:iload_3         
	//   18   31:aaload          
	//   19   32:aload_1         
	//   20   33:aload_2         
	//   21   34:invokeinterface #78  <Method MediaPeriod MediaSource.createPeriod(MediaSource$MediaPeriodId, Allocator)>
	//   22   39:aastore         

	//   23   40:iload_3         
	//   24   41:iconst_1        
	//   25   42:iadd            
	//   26   43:istore_3        
	//*  27   44:goto            16
		return ((MediaPeriod) (new MergingMediaPeriod(compositeSequenceableLoaderFactory, ((MediaPeriod []) (aobj)))));
	//   28   47:new             #80  <Class MergingMediaPeriod>
	//   29   50:dup             
	//   30   51:aload_0         
	//   31   52:getfield        #37  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
	//   32   55:aload           4
	//   33   57:invokespecial   #83  <Method void MergingMediaPeriod(CompositeSequenceableLoaderFactory, MediaPeriod[])>
	//   34   60:areturn         
	}

	public void maybeThrowSourceInfoRefreshError()
		throws IOException
	{
		if(mergeError != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field MergingMediaSource$IllegalMergeException mergeError>
	//*   2    4:ifnull          12
		{
			throw mergeError;
	//    3    7:aload_0         
	//    4    8:getfield        #88  <Field MergingMediaSource$IllegalMergeException mergeError>
	//    5   11:athrow          
		} else
		{
			super.maybeThrowSourceInfoRefreshError();
	//    6   12:aload_0         
	//    7   13:invokespecial   #90  <Method void CompositeMediaSource.maybeThrowSourceInfoRefreshError()>
			return;
	//    8   16:return          
		}
	}

	protected void onChildSourceInfoRefreshed(Integer integer, MediaSource mediasource, Timeline timeline, Object obj)
	{
		if(mergeError == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field MergingMediaSource$IllegalMergeException mergeError>
	//*   2    4:ifnonnull       16
			mergeError = checkTimelineMerges(timeline);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:invokespecial   #96  <Method MergingMediaSource$IllegalMergeException checkTimelineMerges(Timeline)>
	//    7   13:putfield        #88  <Field MergingMediaSource$IllegalMergeException mergeError>
		if(mergeError != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #88  <Field MergingMediaSource$IllegalMergeException mergeError>
	//*  10   20:ifnull          24
			return;
	//   11   23:return          
		pendingTimelineSources.remove(((Object) (mediasource)));
	//   12   24:aload_0         
	//   13   25:getfield        #50  <Field ArrayList pendingTimelineSources>
	//   14   28:aload_2         
	//   15   29:invokevirtual   #100 <Method boolean ArrayList.remove(Object)>
	//   16   32:pop             
		if(mediasource == mediaSources[0])
	//*  17   33:aload_2         
	//*  18   34:aload_0         
	//*  19   35:getfield        #35  <Field MediaSource[] mediaSources>
	//*  20   38:iconst_0        
	//*  21   39:aaload          
	//*  22   40:if_acmpne       54
		{
			primaryTimeline = timeline;
	//   23   43:aload_0         
	//   24   44:aload_3         
	//   25   45:putfield        #102 <Field Timeline primaryTimeline>
			primaryManifest = obj;
	//   26   48:aload_0         
	//   27   49:aload           4
	//   28   51:putfield        #104 <Field Object primaryManifest>
		}
		if(pendingTimelineSources.isEmpty())
	//*  29   54:aload_0         
	//*  30   55:getfield        #50  <Field ArrayList pendingTimelineSources>
	//*  31   58:invokevirtual   #108 <Method boolean ArrayList.isEmpty()>
	//*  32   61:ifeq            76
			refreshSourceInfo(primaryTimeline, primaryManifest);
	//   33   64:aload_0         
	//   34   65:aload_0         
	//   35   66:getfield        #102 <Field Timeline primaryTimeline>
	//   36   69:aload_0         
	//   37   70:getfield        #104 <Field Object primaryManifest>
	//   38   73:invokevirtual   #112 <Method void refreshSourceInfo(Timeline, Object)>
	//   39   76:return          
	}

	protected volatile void onChildSourceInfoRefreshed(Object obj, MediaSource mediasource, Timeline timeline, Object obj1)
	{
		onChildSourceInfoRefreshed((Integer)obj, mediasource, timeline, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #116 <Class Integer>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #118 <Method void onChildSourceInfoRefreshed(Integer, MediaSource, Timeline, Object)>
	//    7   12:return          
	}

	public void prepareSourceInternal(ExoPlayer exoplayer, boolean flag)
	{
		super.prepareSourceInternal(exoplayer, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #122 <Method void CompositeMediaSource.prepareSourceInternal(ExoPlayer, boolean)>
		for(int i = 0; i < mediaSources.length; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_3        
	//*   6    8:iload_3         
	//*   7    9:aload_0         
	//*   8   10:getfield        #35  <Field MediaSource[] mediaSources>
	//*   9   13:arraylength     
	//*  10   14:icmpge          38
			prepareChildSource(((Object) (Integer.valueOf(i))), mediaSources[i]);
	//   11   17:aload_0         
	//   12   18:iload_3         
	//   13   19:invokestatic    #126 <Method Integer Integer.valueOf(int)>
	//   14   22:aload_0         
	//   15   23:getfield        #35  <Field MediaSource[] mediaSources>
	//   16   26:iload_3         
	//   17   27:aaload          
	//   18   28:invokevirtual   #130 <Method void prepareChildSource(Object, MediaSource)>

	//   19   31:iload_3         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_3        
	//*  23   35:goto            8
	//   24   38:return          
	}

	public void releasePeriod(MediaPeriod mediaperiod)
	{
		mediaperiod = ((MediaPeriod) ((MergingMediaPeriod)mediaperiod));
	//    0    0:aload_1         
	//    1    1:checkcast       #80  <Class MergingMediaPeriod>
	//    2    4:astore_1        
		for(int i = 0; i < mediaSources.length; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #35  <Field MediaSource[] mediaSources>
	//*   8   12:arraylength     
	//*   9   13:icmpge          40
			mediaSources[i].releasePeriod(((MergingMediaPeriod) (mediaperiod)).periods[i]);
	//   10   16:aload_0         
	//   11   17:getfield        #35  <Field MediaSource[] mediaSources>
	//   12   20:iload_2         
	//   13   21:aaload          
	//   14   22:aload_1         
	//   15   23:getfield        #136 <Field MediaPeriod[] MergingMediaPeriod.periods>
	//   16   26:iload_2         
	//   17   27:aaload          
	//   18   28:invokeinterface #138 <Method void MediaSource.releasePeriod(MediaPeriod)>

	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_2        
	//*  23   37:goto            7
	//   24   40:return          
	}

	public void releaseSourceInternal()
	{
		super.releaseSourceInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #141 <Method void CompositeMediaSource.releaseSourceInternal()>
		primaryTimeline = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #102 <Field Timeline primaryTimeline>
		primaryManifest = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #104 <Field Object primaryManifest>
		periodCount = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #52  <Field int periodCount>
		mergeError = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #88  <Field MergingMediaSource$IllegalMergeException mergeError>
		pendingTimelineSources.clear();
	//   14   24:aload_0         
	//   15   25:getfield        #50  <Field ArrayList pendingTimelineSources>
	//   16   28:invokevirtual   #144 <Method void ArrayList.clear()>
		Collections.addAll(((java.util.Collection) (pendingTimelineSources)), ((Object []) (mediaSources)));
	//   17   31:aload_0         
	//   18   32:getfield        #50  <Field ArrayList pendingTimelineSources>
	//   19   35:aload_0         
	//   20   36:getfield        #35  <Field MediaSource[] mediaSources>
	//   21   39:invokestatic    #150 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   22   42:pop             
	//   23   43:return          
	}

	private static final int PERIOD_COUNT_UNSET = -1;
	private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
	private final MediaSource mediaSources[];
	private IllegalMergeException mergeError;
	private final ArrayList pendingTimelineSources;
	private int periodCount;
	private Object primaryManifest;
	private Timeline primaryTimeline;
}
