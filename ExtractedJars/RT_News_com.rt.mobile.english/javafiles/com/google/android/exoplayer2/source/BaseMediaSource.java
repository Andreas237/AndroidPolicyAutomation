// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaSource, MediaSourceEventListener

public abstract class BaseMediaSource
	implements MediaSource
{

	public BaseMediaSource()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class ArrayList>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #26  <Method void ArrayList(int)>
	//    7   13:putfield        #28  <Field ArrayList sourceInfoListeners>
	//    8   16:aload_0         
	//    9   17:new             #30  <Class MediaSourceEventListener$EventDispatcher>
	//   10   20:dup             
	//   11   21:invokespecial   #31  <Method void MediaSourceEventListener$EventDispatcher()>
	//   12   24:putfield        #33  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   13   27:return          
	}

	public final void addEventListener(Handler handler, MediaSourceEventListener mediasourceeventlistener)
	{
		eventDispatcher.addEventListener(handler, mediasourceeventlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #38  <Method void MediaSourceEventListener$EventDispatcher.addEventListener(Handler, MediaSourceEventListener)>
	//    5    9:return          
	}

	protected final MediaSourceEventListener.EventDispatcher createEventDispatcher(int i, MediaSource.MediaPeriodId mediaperiodid, long l)
	{
		return eventDispatcher.withParameters(i, mediaperiodid, l);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:lload_3         
	//    5    7:invokevirtual   #44  <Method MediaSourceEventListener$EventDispatcher MediaSourceEventListener$EventDispatcher.withParameters(int, MediaSource$MediaPeriodId, long)>
	//    6   10:areturn         
	}

	protected final MediaSourceEventListener.EventDispatcher createEventDispatcher(MediaSource.MediaPeriodId mediaperiodid)
	{
		return eventDispatcher.withParameters(0, mediaperiodid, 0L);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    2    4:iconst_0        
	//    3    5:aload_1         
	//    4    6:lconst_0        
	//    5    7:invokevirtual   #44  <Method MediaSourceEventListener$EventDispatcher MediaSourceEventListener$EventDispatcher.withParameters(int, MediaSource$MediaPeriodId, long)>
	//    6   10:areturn         
	}

	protected final MediaSourceEventListener.EventDispatcher createEventDispatcher(MediaSource.MediaPeriodId mediaperiodid, long l)
	{
		boolean flag;
		if(mediaperiodid != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:goto            13
			flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          4
		Assertions.checkArgument(flag);
	//    7   13:iload           4
	//    8   15:invokestatic    #53  <Method void Assertions.checkArgument(boolean)>
		return eventDispatcher.withParameters(0, mediaperiodid, l);
	//    9   18:aload_0         
	//   10   19:getfield        #33  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   11   22:iconst_0        
	//   12   23:aload_1         
	//   13   24:lload_2         
	//   14   25:invokevirtual   #44  <Method MediaSourceEventListener$EventDispatcher MediaSourceEventListener$EventDispatcher.withParameters(int, MediaSource$MediaPeriodId, long)>
	//   15   28:areturn         
	}

	public final void prepareSource(ExoPlayer exoplayer, boolean flag, MediaSource.SourceInfoRefreshListener sourceinforefreshlistener)
	{
		boolean flag1;
		if(player != null && player != exoplayer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field ExoPlayer player>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #57  <Field ExoPlayer player>
	//*   5   11:aload_1         
	//*   6   12:if_acmpne       18
	//*   7   15:goto            24
			flag1 = false;
	//    8   18:iconst_0        
	//    9   19:istore          4
		else
	//*  10   21:goto            27
			flag1 = true;
	//   11   24:iconst_1        
	//   12   25:istore          4
		Assertions.checkArgument(flag1);
	//   13   27:iload           4
	//   14   29:invokestatic    #53  <Method void Assertions.checkArgument(boolean)>
		sourceInfoListeners.add(((Object) (sourceinforefreshlistener)));
	//   15   32:aload_0         
	//   16   33:getfield        #28  <Field ArrayList sourceInfoListeners>
	//   17   36:aload_3         
	//   18   37:invokevirtual   #61  <Method boolean ArrayList.add(Object)>
	//   19   40:pop             
		if(player == null)
	//*  20   41:aload_0         
	//*  21   42:getfield        #57  <Field ExoPlayer player>
	//*  22   45:ifnonnull       60
		{
			player = exoplayer;
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:putfield        #57  <Field ExoPlayer player>
			prepareSourceInternal(exoplayer, flag);
	//   26   53:aload_0         
	//   27   54:aload_1         
	//   28   55:iload_2         
	//   29   56:invokevirtual   #65  <Method void prepareSourceInternal(ExoPlayer, boolean)>
			return;
	//   30   59:return          
		}
		if(timeline != null)
	//*  31   60:aload_0         
	//*  32   61:getfield        #67  <Field Timeline timeline>
	//*  33   64:ifnull          82
			sourceinforefreshlistener.onSourceInfoRefreshed(((MediaSource) (this)), timeline, manifest);
	//   34   67:aload_3         
	//   35   68:aload_0         
	//   36   69:aload_0         
	//   37   70:getfield        #67  <Field Timeline timeline>
	//   38   73:aload_0         
	//   39   74:getfield        #69  <Field Object manifest>
	//   40   77:invokeinterface #75  <Method void MediaSource$SourceInfoRefreshListener.onSourceInfoRefreshed(MediaSource, Timeline, Object)>
	//   41   82:return          
	}

	protected abstract void prepareSourceInternal(ExoPlayer exoplayer, boolean flag);

	protected final void refreshSourceInfo(Timeline timeline1, Object obj)
	{
		timeline = timeline1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field Timeline timeline>
		manifest = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #69  <Field Object manifest>
		for(Iterator iterator = sourceInfoListeners.iterator(); iterator.hasNext(); ((MediaSource.SourceInfoRefreshListener)iterator.next()).onSourceInfoRefreshed(((MediaSource) (this)), timeline1, obj));
	//    6   10:aload_0         
	//    7   11:getfield        #28  <Field ArrayList sourceInfoListeners>
	//    8   14:invokevirtual   #81  <Method Iterator ArrayList.iterator()>
	//    9   17:astore_3        
	//   10   18:aload_3         
	//   11   19:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//   12   24:ifeq            47
	//   13   27:aload_3         
	//   14   28:invokeinterface #91  <Method Object Iterator.next()>
	//   15   33:checkcast       #71  <Class MediaSource$SourceInfoRefreshListener>
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:aload_2         
	//   19   39:invokeinterface #75  <Method void MediaSource$SourceInfoRefreshListener.onSourceInfoRefreshed(MediaSource, Timeline, Object)>
	//*  20   44:goto            18
	//   21   47:return          
	}

	public final void releaseSource(MediaSource.SourceInfoRefreshListener sourceinforefreshlistener)
	{
		sourceInfoListeners.remove(((Object) (sourceinforefreshlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ArrayList sourceInfoListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #96  <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
		if(sourceInfoListeners.isEmpty())
	//*   5    9:aload_0         
	//*   6   10:getfield        #28  <Field ArrayList sourceInfoListeners>
	//*   7   13:invokevirtual   #99  <Method boolean ArrayList.isEmpty()>
	//*   8   16:ifeq            38
		{
			player = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #57  <Field ExoPlayer player>
			timeline = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #67  <Field Timeline timeline>
			manifest = null;
	//   15   29:aload_0         
	//   16   30:aconst_null     
	//   17   31:putfield        #69  <Field Object manifest>
			releaseSourceInternal();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #102 <Method void releaseSourceInternal()>
		}
	//   20   38:return          
	}

	protected abstract void releaseSourceInternal();

	public final void removeEventListener(MediaSourceEventListener mediasourceeventlistener)
	{
		eventDispatcher.removeEventListener(mediasourceeventlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #106 <Method void MediaSourceEventListener$EventDispatcher.removeEventListener(MediaSourceEventListener)>
	//    4    8:return          
	}

	private final MediaSourceEventListener.EventDispatcher eventDispatcher = new MediaSourceEventListener.EventDispatcher();
	private Object manifest;
	private ExoPlayer player;
	private final ArrayList sourceInfoListeners = new ArrayList(1);
	private Timeline timeline;
}
