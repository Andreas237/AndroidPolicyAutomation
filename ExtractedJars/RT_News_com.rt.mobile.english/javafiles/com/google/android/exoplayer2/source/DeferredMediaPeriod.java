// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaPeriod, MediaSource, TrackGroupArray, SequenceableLoader, 
//			SampleStream

public final class DeferredMediaPeriod
	implements MediaPeriod, MediaPeriod.Callback
{
	public static interface PrepareErrorListener
	{

		public abstract void onPrepareError(MediaSource.MediaPeriodId mediaperiodid, IOException ioexception);
	}


	public DeferredMediaPeriod(MediaSource mediasource, MediaSource.MediaPeriodId mediaperiodid, Allocator allocator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		id = mediaperiodid;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #36  <Field MediaSource$MediaPeriodId id>
		allocator = allocator1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #38  <Field Allocator allocator>
		mediaSource = mediasource;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #40  <Field MediaSource mediaSource>
		preparePositionOverrideUs = 0x1L;
	//   11   19:aload_0         
	//   12   20:ldc2w           #41  <Long 0x1L>
	//   13   23:putfield        #44  <Field long preparePositionOverrideUs>
	//   14   26:return          
	}

	public boolean continueLoading(long l)
	{
		return mediaPeriod != null && mediaPeriod.continueLoading(l);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field MediaPeriod mediaPeriod>
	//    2    4:ifnull          22
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field MediaPeriod mediaPeriod>
	//    5   11:lload_1         
	//    6   12:invokeinterface #51  <Method boolean MediaPeriod.continueLoading(long)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public void createPeriod()
	{
		mediaPeriod = mediaSource.createPeriod(id, allocator);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field MediaSource mediaSource>
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field MediaSource$MediaPeriodId id>
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field Allocator allocator>
	//    7   13:invokeinterface #57  <Method MediaPeriod MediaSource.createPeriod(MediaSource$MediaPeriodId, Allocator)>
	//    8   18:putfield        #49  <Field MediaPeriod mediaPeriod>
		if(callback != null)
	//*   9   21:aload_0         
	//*  10   22:getfield        #59  <Field MediaPeriod$Callback callback>
	//*  11   25:ifnull          42
			mediaPeriod.prepare(((MediaPeriod.Callback) (this)), preparePositionUs);
	//   12   28:aload_0         
	//   13   29:getfield        #49  <Field MediaPeriod mediaPeriod>
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getfield        #61  <Field long preparePositionUs>
	//   17   37:invokeinterface #65  <Method void MediaPeriod.prepare(MediaPeriod$Callback, long)>
	//   18   42:return          
	}

	public void discardBuffer(long l, boolean flag)
	{
		mediaPeriod.discardBuffer(l, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field MediaPeriod mediaPeriod>
	//    2    4:lload_1         
	//    3    5:iload_3         
	//    4    6:invokeinterface #69  <Method void MediaPeriod.discardBuffer(long, boolean)>
	//    5   11:return          
	}

	public long getAdjustedSeekPositionUs(long l, SeekParameters seekparameters)
	{
		return mediaPeriod.getAdjustedSeekPositionUs(l, seekparameters);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field MediaPeriod mediaPeriod>
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:invokeinterface #73  <Method long MediaPeriod.getAdjustedSeekPositionUs(long, SeekParameters)>
	//    5   11:lreturn         
	}

	public long getBufferedPositionUs()
	{
		return mediaPeriod.getBufferedPositionUs();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field MediaPeriod mediaPeriod>
	//    2    4:invokeinterface #77  <Method long MediaPeriod.getBufferedPositionUs()>
	//    3    9:lreturn         
	}

	public long getNextLoadPositionUs()
	{
		return mediaPeriod.getNextLoadPositionUs();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field MediaPeriod mediaPeriod>
	//    2    4:invokeinterface #80  <Method long MediaPeriod.getNextLoadPositionUs()>
	//    3    9:lreturn         
	}

	public TrackGroupArray getTrackGroups()
	{
		return mediaPeriod.getTrackGroups();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field MediaPeriod mediaPeriod>
	//    2    4:invokeinterface #84  <Method TrackGroupArray MediaPeriod.getTrackGroups()>
	//    3    9:areturn         
	}

	public void maybeThrowPrepareError()
		throws IOException
	{
		try
		{
			if(mediaPeriod != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field MediaPeriod mediaPeriod>
	//*   2    4:ifnull          17
			{
				mediaPeriod.maybeThrowPrepareError();
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field MediaPeriod mediaPeriod>
	//    5   11:invokeinterface #89  <Method void MediaPeriod.maybeThrowPrepareError()>
				return;
	//    6   16:return          
			}
		}
	//*   7   17:aload_0         
	//*   8   18:getfield        #40  <Field MediaSource mediaSource>
	//*   9   21:invokeinterface #92  <Method void MediaSource.maybeThrowSourceInfoRefreshError()>
	//*  10   26:return          
		catch(IOException ioexception)
	//*  11   27:astore_1        
		{
			if(listener == null)
	//*  12   28:aload_0         
	//*  13   29:getfield        #94  <Field DeferredMediaPeriod$PrepareErrorListener listener>
	//*  14   32:ifnonnull       37
				throw ioexception;
	//   15   35:aload_1         
	//   16   36:athrow          
			if(!notifiedPrepareError)
	//*  17   37:aload_0         
	//*  18   38:getfield        #96  <Field boolean notifiedPrepareError>
	//*  19   41:ifne            63
			{
				notifiedPrepareError = true;
	//   20   44:aload_0         
	//   21   45:iconst_1        
	//   22   46:putfield        #96  <Field boolean notifiedPrepareError>
				listener.onPrepareError(id, ioexception);
	//   23   49:aload_0         
	//   24   50:getfield        #94  <Field DeferredMediaPeriod$PrepareErrorListener listener>
	//   25   53:aload_0         
	//   26   54:getfield        #36  <Field MediaSource$MediaPeriodId id>
	//   27   57:aload_1         
	//   28   58:invokeinterface #100 <Method void DeferredMediaPeriod$PrepareErrorListener.onPrepareError(MediaSource$MediaPeriodId, IOException)>
			}
			return;
	//   29   63:return          
		}
		mediaSource.maybeThrowSourceInfoRefreshError();
		return;
	}

	public void onContinueLoadingRequested(MediaPeriod mediaperiod)
	{
		callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field MediaPeriod$Callback callback>
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
		callback.onPrepared(((MediaPeriod) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field MediaPeriod$Callback callback>
	//    2    4:aload_0         
	//    3    5:invokeinterface #111 <Method void MediaPeriod$Callback.onPrepared(MediaPeriod)>
	//    4   10:return          
	}

	public void prepare(MediaPeriod.Callback callback1, long l)
	{
		callback = callback1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field MediaPeriod$Callback callback>
		preparePositionUs = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #61  <Field long preparePositionUs>
		if(mediaPeriod != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #49  <Field MediaPeriod mediaPeriod>
	//*   8   14:ifnull          28
			mediaPeriod.prepare(((MediaPeriod.Callback) (this)), l);
	//    9   17:aload_0         
	//   10   18:getfield        #49  <Field MediaPeriod mediaPeriod>
	//   11   21:aload_0         
	//   12   22:lload_2         
	//   13   23:invokeinterface #65  <Method void MediaPeriod.prepare(MediaPeriod$Callback, long)>
	//   14   28:return          
	}

	public long readDiscontinuity()
	{
		return mediaPeriod.readDiscontinuity();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field MediaPeriod mediaPeriod>
	//    2    4:invokeinterface #114 <Method long MediaPeriod.readDiscontinuity()>
	//    3    9:lreturn         
	}

	public void reevaluateBuffer(long l)
	{
		mediaPeriod.reevaluateBuffer(l);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field MediaPeriod mediaPeriod>
	//    2    4:lload_1         
	//    3    5:invokeinterface #118 <Method void MediaPeriod.reevaluateBuffer(long)>
	//    4   10:return          
	}

	public void releasePeriod()
	{
		if(mediaPeriod != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field MediaPeriod mediaPeriod>
	//*   2    4:ifnull          20
			mediaSource.releasePeriod(mediaPeriod);
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field MediaSource mediaSource>
	//    5   11:aload_0         
	//    6   12:getfield        #49  <Field MediaPeriod mediaPeriod>
	//    7   15:invokeinterface #121 <Method void MediaSource.releasePeriod(MediaPeriod)>
	//    8   20:return          
	}

	public long seekToUs(long l)
	{
		return mediaPeriod.seekToUs(l);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field MediaPeriod mediaPeriod>
	//    2    4:lload_1         
	//    3    5:invokeinterface #125 <Method long MediaPeriod.seekToUs(long)>
	//    4   10:lreturn         
	}

	public long selectTracks(TrackSelection atrackselection[], boolean aflag[], SampleStream asamplestream[], boolean aflag1[], long l)
	{
		if(preparePositionOverrideUs != 0x1L && l == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field long preparePositionOverrideUs>
	//*   2    4:ldc2w           #41  <Long 0x1L>
	//*   3    7:lcmp            
	//*   4    8:ifeq            34
	//*   5   11:lload           5
	//*   6   13:lconst_0        
	//*   7   14:lcmp            
	//*   8   15:ifne            34
		{
			l = preparePositionOverrideUs;
	//    9   18:aload_0         
	//   10   19:getfield        #44  <Field long preparePositionOverrideUs>
	//   11   22:lstore          5
			preparePositionOverrideUs = 0x1L;
	//   12   24:aload_0         
	//   13   25:ldc2w           #41  <Long 0x1L>
	//   14   28:putfield        #44  <Field long preparePositionOverrideUs>
		}
	//*  15   31:goto            34
		return mediaPeriod.selectTracks(atrackselection, aflag, asamplestream, aflag1, l);
	//   16   34:aload_0         
	//   17   35:getfield        #49  <Field MediaPeriod mediaPeriod>
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:aload           4
	//   22   43:lload           5
	//   23   45:invokeinterface #129 <Method long MediaPeriod.selectTracks(TrackSelection[], boolean[], SampleStream[], boolean[], long)>
	//   24   50:lreturn         
	}

	public void setDefaultPreparePositionUs(long l)
	{
		if(preparePositionUs == 0L && l != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field long preparePositionUs>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            25
	//*   5    9:lload_1         
	//*   6   10:lconst_0        
	//*   7   11:lcmp            
	//*   8   12:ifeq            25
		{
			preparePositionOverrideUs = l;
	//    9   15:aload_0         
	//   10   16:lload_1         
	//   11   17:putfield        #44  <Field long preparePositionOverrideUs>
			preparePositionUs = l;
	//   12   20:aload_0         
	//   13   21:lload_1         
	//   14   22:putfield        #61  <Field long preparePositionUs>
		}
	//   15   25:return          
	}

	public void setPrepareErrorListener(PrepareErrorListener prepareerrorlistener)
	{
		listener = prepareerrorlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field DeferredMediaPeriod$PrepareErrorListener listener>
	//    3    5:return          
	}

	private final Allocator allocator;
	private MediaPeriod.Callback callback;
	public final MediaSource.MediaPeriodId id;
	private PrepareErrorListener listener;
	private MediaPeriod mediaPeriod;
	public final MediaSource mediaSource;
	private boolean notifiedPrepareError;
	private long preparePositionOverrideUs;
	private long preparePositionUs;
}
