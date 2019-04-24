// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaSourceEventListener

public static final class MediaSourceEventListener$EventDispatcher
{
	private static final class ListenerAndHandler
	{

		public final Handler handler;
		public final MediaSourceEventListener listener;

		public ListenerAndHandler(Handler handler1, MediaSourceEventListener mediasourceeventlistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			handler = handler1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field Handler handler>
			listener = mediasourceeventlistener;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field MediaSourceEventListener listener>
		//    8   14:return          
		}
	}


	private long adjustMediaTime(long l)
	{
		l = C.usToMs(l);
	//    0    0:lload_1         
	//    1    1:invokestatic    #67  <Method long C.usToMs(long)>
	//    2    4:lstore_1        
		if(l == 0x1L)
	//*   3    5:lload_1         
	//*   4    6:ldc2w           #68  <Long 0x1L>
	//*   5    9:lcmp            
	//*   6   10:ifne            17
			return 0x1L;
	//    7   13:ldc2w           #68  <Long 0x1L>
	//    8   16:lreturn         
		else
			return mediaTimeOffsetMs + l;
	//    9   17:aload_0         
	//   10   18:getfield        #57  <Field long mediaTimeOffsetMs>
	//   11   21:lload_1         
	//   12   22:ladd            
	//   13   23:lreturn         
	}

	private void postOrRun(Handler handler, Runnable runnable)
	{
		if(handler.getLooper() == Looper.myLooper())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #77  <Method Looper Handler.getLooper()>
	//*   2    4:invokestatic    #82  <Method Looper Looper.myLooper()>
	//*   3    7:if_acmpne       17
		{
			runnable.run();
	//    4   10:aload_2         
	//    5   11:invokeinterface #87  <Method void Runnable.run()>
			return;
	//    6   16:return          
		} else
		{
			handler.post(runnable);
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokevirtual   #91  <Method boolean Handler.post(Runnable)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
	}

	public void addEventListener(Handler handler, MediaSourceEventListener mediasourceeventlistener)
	{
		boolean flag;
		if(handler != null && mediasourceeventlistener != null)
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
	//   10   16:invokestatic    #99  <Method void Assertions.checkArgument(boolean)>
		listenerAndHandlers.add(((Object) (new ListenerAndHandler(handler, mediasourceeventlistener))));
	//   11   19:aload_0         
	//   12   20:getfield        #51  <Field CopyOnWriteArrayList listenerAndHandlers>
	//   13   23:new             #27  <Class MediaSourceEventListener$EventDispatcher$ListenerAndHandler>
	//   14   26:dup             
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:invokespecial   #101 <Method void MediaSourceEventListener$EventDispatcher$ListenerAndHandler(Handler, MediaSourceEventListener)>
	//   18   32:invokevirtual   #105 <Method boolean CopyOnWriteArrayList.add(Object)>
	//   19   35:pop             
	//   20   36:return          
	}

	public void downstreamFormatChanged(int i, Format format, int j, Object obj, long l)
	{
		downstreamFormatChanged(new MediaSourceEventListener.MediaLoadData(1, i, format, j, obj, adjustMediaTime(l), 0x1L));
	//    0    0:aload_0         
	//    1    1:new             #109 <Class MediaSourceEventListener$MediaLoadData>
	//    2    4:dup             
	//    3    5:iconst_1        
	//    4    6:iload_1         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:aload           4
	//    8   11:aload_0         
	//    9   12:lload           5
	//   10   14:invokespecial   #111 <Method long adjustMediaTime(long)>
	//   11   17:ldc2w           #68  <Long 0x1L>
	//   12   20:invokespecial   #114 <Method void MediaSourceEventListener$MediaLoadData(int, int, Format, int, Object, long, long)>
	//   13   23:invokevirtual   #117 <Method void downstreamFormatChanged(MediaSourceEventListener$MediaLoadData)>
	//   14   26:return          
	}

	public void downstreamFormatChanged(final MediaSourceEventListener.MediaLoadData mediaLoadData)
	{
		ListenerAndHandler listenerandhandler;
		final MediaSourceEventListener listener;
		for(Iterator iterator = listenerAndHandlers.iterator(); iterator.hasNext(); postOrRun(listenerandhandler.handler, new Runnable() {

		public void run()
		{
			listener.onDownstreamFormatChanged(windowIndex, mediaPeriodId, mediaLoadData);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field MediaSourceEventListener val$listener>
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    4    8:getfield        #37  <Field int MediaSourceEventListener$EventDispatcher.windowIndex>
		//    5   11:aload_0         
		//    6   12:getfield        #24  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    7   15:getfield        #41  <Field MediaSource$MediaPeriodId MediaSourceEventListener$EventDispatcher.mediaPeriodId>
		//    8   18:aload_0         
		//    9   19:getfield        #28  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
		//   10   22:invokeinterface #45  <Method void MediaSourceEventListener.onDownstreamFormatChanged(int, MediaSource$MediaPeriodId, MediaSourceEventListener$MediaLoadData)>
		//   11   27:return          
		}

		final MediaSourceEventListener.EventDispatcher this$0;
		final MediaSourceEventListener val$listener;
		final MediaSourceEventListener.MediaLoadData val$mediaLoadData;

			
			{
				this$0 = MediaSourceEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaSourceEventListener$EventDispatcher this$0>
				listener = mediasourceeventlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field MediaSourceEventListener val$listener>
				mediaLoadData = medialoaddata;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
	}
))
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field CopyOnWriteArrayList listenerAndHandlers>
	//*   2    4:invokevirtual   #121 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            55
		{
			listenerandhandler = (ListenerAndHandler)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #131 <Method Object Iterator.next()>
	//    9   23:checkcast       #27  <Class MediaSourceEventListener$EventDispatcher$ListenerAndHandler>
	//   10   26:astore_3        
			listener = listenerandhandler.listener;
	//   11   27:aload_3         
	//   12   28:getfield        #135 <Field MediaSourceEventListener MediaSourceEventListener$EventDispatcher$ListenerAndHandler.listener>
	//   13   31:astore          4
		}

	//   14   33:aload_0         
	//   15   34:aload_3         
	//   16   35:getfield        #139 <Field Handler MediaSourceEventListener$EventDispatcher$ListenerAndHandler.handler>
	//   17   38:new             #25  <Class MediaSourceEventListener$EventDispatcher$9>
	//   18   41:dup             
	//   19   42:aload_0         
	//   20   43:aload           4
	//   21   45:aload_1         
	//   22   46:invokespecial   #142 <Method void MediaSourceEventListener$EventDispatcher$9(MediaSourceEventListener$EventDispatcher, MediaSourceEventListener, MediaSourceEventListener$MediaLoadData)>
	//   23   49:invokespecial   #144 <Method void postOrRun(Handler, Runnable)>
	//*  24   52:goto            8
	//   25   55:return          
	}

	public void loadCanceled(final MediaSourceEventListener.LoadEventInfo loadEventInfo, final MediaSourceEventListener.MediaLoadData mediaLoadData)
	{
		ListenerAndHandler listenerandhandler;
		final MediaSourceEventListener listener;
		for(Iterator iterator = listenerAndHandlers.iterator(); iterator.hasNext(); postOrRun(listenerandhandler.handler, new Runnable() {

		public void run()
		{
			listener.onLoadCanceled(windowIndex, mediaPeriodId, loadEventInfo, mediaLoadData);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field MediaSourceEventListener val$listener>
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    4    8:getfield        #41  <Field int MediaSourceEventListener$EventDispatcher.windowIndex>
		//    5   11:aload_0         
		//    6   12:getfield        #26  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    7   15:getfield        #45  <Field MediaSource$MediaPeriodId MediaSourceEventListener$EventDispatcher.mediaPeriodId>
		//    8   18:aload_0         
		//    9   19:getfield        #30  <Field MediaSourceEventListener$LoadEventInfo val$loadEventInfo>
		//   10   22:aload_0         
		//   11   23:getfield        #32  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
		//   12   26:invokeinterface #49  <Method void MediaSourceEventListener.onLoadCanceled(int, MediaSource$MediaPeriodId, MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData)>
		//   13   31:return          
		}

		final MediaSourceEventListener.EventDispatcher this$0;
		final MediaSourceEventListener val$listener;
		final MediaSourceEventListener.LoadEventInfo val$loadEventInfo;
		final MediaSourceEventListener.MediaLoadData val$mediaLoadData;

			
			{
				this$0 = MediaSourceEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaSourceEventListener$EventDispatcher this$0>
				listener = mediasourceeventlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaSourceEventListener val$listener>
				loadEventInfo = loadeventinfo;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field MediaSourceEventListener$LoadEventInfo val$loadEventInfo>
				mediaLoadData = medialoaddata;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
	}
))
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field CopyOnWriteArrayList listenerAndHandlers>
	//*   2    4:invokevirtual   #121 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*   3    7:astore_3        
	//*   4    8:aload_3         
	//*   5    9:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            59
		{
			listenerandhandler = (ListenerAndHandler)iterator.next();
	//    7   17:aload_3         
	//    8   18:invokeinterface #131 <Method Object Iterator.next()>
	//    9   23:checkcast       #27  <Class MediaSourceEventListener$EventDispatcher$ListenerAndHandler>
	//   10   26:astore          4
			listener = listenerandhandler.listener;
	//   11   28:aload           4
	//   12   30:getfield        #135 <Field MediaSourceEventListener MediaSourceEventListener$EventDispatcher$ListenerAndHandler.listener>
	//   13   33:astore          5
		}

	//   14   35:aload_0         
	//   15   36:aload           4
	//   16   38:getfield        #139 <Field Handler MediaSourceEventListener$EventDispatcher$ListenerAndHandler.handler>
	//   17   41:new             #17  <Class MediaSourceEventListener$EventDispatcher$5>
	//   18   44:dup             
	//   19   45:aload_0         
	//   20   46:aload           5
	//   21   48:aload_1         
	//   22   49:aload_2         
	//   23   50:invokespecial   #149 <Method void MediaSourceEventListener$EventDispatcher$5(MediaSourceEventListener$EventDispatcher, MediaSourceEventListener, MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData)>
	//   24   53:invokespecial   #144 <Method void postOrRun(Handler, Runnable)>
	//*  25   56:goto            8
	//   26   59:return          
	}

	public void loadCanceled(DataSpec dataspec, int i, int j, Format format, int k, Object obj, long l, long l1, long l2, long l3, 
			long l4)
	{
		loadCanceled(new MediaSourceEventListener.LoadEventInfo(dataspec, l2, l3, l4), new MediaSourceEventListener.MediaLoadData(i, j, format, k, obj, adjustMediaTime(l), adjustMediaTime(l1)));
	//    0    0:aload_0         
	//    1    1:new             #152 <Class MediaSourceEventListener$LoadEventInfo>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:lload           11
	//    5    8:lload           13
	//    6   10:lload           15
	//    7   12:invokespecial   #155 <Method void MediaSourceEventListener$LoadEventInfo(DataSpec, long, long, long)>
	//    8   15:new             #109 <Class MediaSourceEventListener$MediaLoadData>
	//    9   18:dup             
	//   10   19:iload_2         
	//   11   20:iload_3         
	//   12   21:aload           4
	//   13   23:iload           5
	//   14   25:aload           6
	//   15   27:aload_0         
	//   16   28:lload           7
	//   17   30:invokespecial   #111 <Method long adjustMediaTime(long)>
	//   18   33:aload_0         
	//   19   34:lload           9
	//   20   36:invokespecial   #111 <Method long adjustMediaTime(long)>
	//   21   39:invokespecial   #114 <Method void MediaSourceEventListener$MediaLoadData(int, int, Format, int, Object, long, long)>
	//   22   42:invokevirtual   #157 <Method void loadCanceled(MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData)>
	//   23   45:return          
	}

	public void loadCanceled(DataSpec dataspec, int i, long l, long l1, long l2)
	{
		loadCanceled(dataspec, i, -1, ((Format) (null)), 0, ((Object) (null)), 0x1L, 0x1L, l, l1, l2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_m1       
	//    4    4:aconst_null     
	//    5    5:iconst_0        
	//    6    6:aconst_null     
	//    7    7:ldc2w           #68  <Long 0x1L>
	//    8   10:ldc2w           #68  <Long 0x1L>
	//    9   13:lload_3         
	//   10   14:lload           5
	//   11   16:lload           7
	//   12   18:invokevirtual   #160 <Method void loadCanceled(DataSpec, int, int, Format, int, Object, long, long, long, long, long)>
	//   13   21:return          
	}

	public void loadCompleted(final MediaSourceEventListener.LoadEventInfo loadEventInfo, final MediaSourceEventListener.MediaLoadData mediaLoadData)
	{
		ListenerAndHandler listenerandhandler;
		final MediaSourceEventListener listener;
		for(Iterator iterator = listenerAndHandlers.iterator(); iterator.hasNext(); postOrRun(listenerandhandler.handler, new Runnable() {

		public void run()
		{
			listener.onLoadCompleted(windowIndex, mediaPeriodId, loadEventInfo, mediaLoadData);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field MediaSourceEventListener val$listener>
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    4    8:getfield        #41  <Field int MediaSourceEventListener$EventDispatcher.windowIndex>
		//    5   11:aload_0         
		//    6   12:getfield        #26  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    7   15:getfield        #45  <Field MediaSource$MediaPeriodId MediaSourceEventListener$EventDispatcher.mediaPeriodId>
		//    8   18:aload_0         
		//    9   19:getfield        #30  <Field MediaSourceEventListener$LoadEventInfo val$loadEventInfo>
		//   10   22:aload_0         
		//   11   23:getfield        #32  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
		//   12   26:invokeinterface #49  <Method void MediaSourceEventListener.onLoadCompleted(int, MediaSource$MediaPeriodId, MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData)>
		//   13   31:return          
		}

		final MediaSourceEventListener.EventDispatcher this$0;
		final MediaSourceEventListener val$listener;
		final MediaSourceEventListener.LoadEventInfo val$loadEventInfo;
		final MediaSourceEventListener.MediaLoadData val$mediaLoadData;

			
			{
				this$0 = MediaSourceEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaSourceEventListener$EventDispatcher this$0>
				listener = mediasourceeventlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaSourceEventListener val$listener>
				loadEventInfo = loadeventinfo;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field MediaSourceEventListener$LoadEventInfo val$loadEventInfo>
				mediaLoadData = medialoaddata;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
	}
))
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field CopyOnWriteArrayList listenerAndHandlers>
	//*   2    4:invokevirtual   #121 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*   3    7:astore_3        
	//*   4    8:aload_3         
	//*   5    9:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            59
		{
			listenerandhandler = (ListenerAndHandler)iterator.next();
	//    7   17:aload_3         
	//    8   18:invokeinterface #131 <Method Object Iterator.next()>
	//    9   23:checkcast       #27  <Class MediaSourceEventListener$EventDispatcher$ListenerAndHandler>
	//   10   26:astore          4
			listener = listenerandhandler.listener;
	//   11   28:aload           4
	//   12   30:getfield        #135 <Field MediaSourceEventListener MediaSourceEventListener$EventDispatcher$ListenerAndHandler.listener>
	//   13   33:astore          5
		}

	//   14   35:aload_0         
	//   15   36:aload           4
	//   16   38:getfield        #139 <Field Handler MediaSourceEventListener$EventDispatcher$ListenerAndHandler.handler>
	//   17   41:new             #15  <Class MediaSourceEventListener$EventDispatcher$4>
	//   18   44:dup             
	//   19   45:aload_0         
	//   20   46:aload           5
	//   21   48:aload_1         
	//   22   49:aload_2         
	//   23   50:invokespecial   #162 <Method void MediaSourceEventListener$EventDispatcher$4(MediaSourceEventListener$EventDispatcher, MediaSourceEventListener, MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData)>
	//   24   53:invokespecial   #144 <Method void postOrRun(Handler, Runnable)>
	//*  25   56:goto            8
	//   26   59:return          
	}

	public void loadCompleted(DataSpec dataspec, int i, int j, Format format, int k, Object obj, long l, long l1, long l2, long l3, 
			long l4)
	{
		loadCompleted(new MediaSourceEventListener.LoadEventInfo(dataspec, l2, l3, l4), new MediaSourceEventListener.MediaLoadData(i, j, format, k, obj, adjustMediaTime(l), adjustMediaTime(l1)));
	//    0    0:aload_0         
	//    1    1:new             #152 <Class MediaSourceEventListener$LoadEventInfo>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:lload           11
	//    5    8:lload           13
	//    6   10:lload           15
	//    7   12:invokespecial   #155 <Method void MediaSourceEventListener$LoadEventInfo(DataSpec, long, long, long)>
	//    8   15:new             #109 <Class MediaSourceEventListener$MediaLoadData>
	//    9   18:dup             
	//   10   19:iload_2         
	//   11   20:iload_3         
	//   12   21:aload           4
	//   13   23:iload           5
	//   14   25:aload           6
	//   15   27:aload_0         
	//   16   28:lload           7
	//   17   30:invokespecial   #111 <Method long adjustMediaTime(long)>
	//   18   33:aload_0         
	//   19   34:lload           9
	//   20   36:invokespecial   #111 <Method long adjustMediaTime(long)>
	//   21   39:invokespecial   #114 <Method void MediaSourceEventListener$MediaLoadData(int, int, Format, int, Object, long, long)>
	//   22   42:invokevirtual   #164 <Method void loadCompleted(MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData)>
	//   23   45:return          
	}

	public void loadCompleted(DataSpec dataspec, int i, long l, long l1, long l2)
	{
		loadCompleted(dataspec, i, -1, ((Format) (null)), 0, ((Object) (null)), 0x1L, 0x1L, l, l1, l2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_m1       
	//    4    4:aconst_null     
	//    5    5:iconst_0        
	//    6    6:aconst_null     
	//    7    7:ldc2w           #68  <Long 0x1L>
	//    8   10:ldc2w           #68  <Long 0x1L>
	//    9   13:lload_3         
	//   10   14:lload           5
	//   11   16:lload           7
	//   12   18:invokevirtual   #166 <Method void loadCompleted(DataSpec, int, int, Format, int, Object, long, long, long, long, long)>
	//   13   21:return          
	}

	public void loadError(final MediaSourceEventListener.LoadEventInfo loadEventInfo, final MediaSourceEventListener.MediaLoadData mediaLoadData, final IOException error, final boolean wasCanceled)
	{
		ListenerAndHandler listenerandhandler;
		final MediaSourceEventListener listener;
		for(Iterator iterator = listenerAndHandlers.iterator(); iterator.hasNext(); postOrRun(listenerandhandler.handler, new Runnable() {

		public void run()
		{
			listener.onLoadError(windowIndex, mediaPeriodId, loadEventInfo, mediaLoadData, error, wasCanceled);
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field MediaSourceEventListener val$listener>
		//    2    4:aload_0         
		//    3    5:getfield        #30  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    4    8:getfield        #49  <Field int MediaSourceEventListener$EventDispatcher.windowIndex>
		//    5   11:aload_0         
		//    6   12:getfield        #30  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    7   15:getfield        #53  <Field MediaSource$MediaPeriodId MediaSourceEventListener$EventDispatcher.mediaPeriodId>
		//    8   18:aload_0         
		//    9   19:getfield        #34  <Field MediaSourceEventListener$LoadEventInfo val$loadEventInfo>
		//   10   22:aload_0         
		//   11   23:getfield        #36  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
		//   12   26:aload_0         
		//   13   27:getfield        #38  <Field IOException val$error>
		//   14   30:aload_0         
		//   15   31:getfield        #40  <Field boolean val$wasCanceled>
		//   16   34:invokeinterface #57  <Method void MediaSourceEventListener.onLoadError(int, MediaSource$MediaPeriodId, MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData, IOException, boolean)>
		//   17   39:return          
		}

		final MediaSourceEventListener.EventDispatcher this$0;
		final IOException val$error;
		final MediaSourceEventListener val$listener;
		final MediaSourceEventListener.LoadEventInfo val$loadEventInfo;
		final MediaSourceEventListener.MediaLoadData val$mediaLoadData;
		final boolean val$wasCanceled;

			
			{
				this$0 = MediaSourceEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #30  <Field MediaSourceEventListener$EventDispatcher this$0>
				listener = mediasourceeventlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #32  <Field MediaSourceEventListener val$listener>
				loadEventInfo = loadeventinfo;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #34  <Field MediaSourceEventListener$LoadEventInfo val$loadEventInfo>
				mediaLoadData = medialoaddata;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #36  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
				error = ioexception;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #38  <Field IOException val$error>
				wasCanceled = flag;
			//   15   27:aload_0         
			//   16   28:iload           6
			//   17   30:putfield        #40  <Field boolean val$wasCanceled>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #43  <Method void Object()>
			//   20   37:return          
			}
	}
))
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field CopyOnWriteArrayList listenerAndHandlers>
	//*   2    4:invokevirtual   #121 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*   3    7:astore          5
	//*   4    9:aload           5
	//*   5   11:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            65
		{
			listenerandhandler = (ListenerAndHandler)iterator.next();
	//    7   19:aload           5
	//    8   21:invokeinterface #131 <Method Object Iterator.next()>
	//    9   26:checkcast       #27  <Class MediaSourceEventListener$EventDispatcher$ListenerAndHandler>
	//   10   29:astore          6
			listener = listenerandhandler.listener;
	//   11   31:aload           6
	//   12   33:getfield        #135 <Field MediaSourceEventListener MediaSourceEventListener$EventDispatcher$ListenerAndHandler.listener>
	//   13   36:astore          7
		}

	//   14   38:aload_0         
	//   15   39:aload           6
	//   16   41:getfield        #139 <Field Handler MediaSourceEventListener$EventDispatcher$ListenerAndHandler.handler>
	//   17   44:new             #19  <Class MediaSourceEventListener$EventDispatcher$6>
	//   18   47:dup             
	//   19   48:aload_0         
	//   20   49:aload           7
	//   21   51:aload_1         
	//   22   52:aload_2         
	//   23   53:aload_3         
	//   24   54:iload           4
	//   25   56:invokespecial   #171 <Method void MediaSourceEventListener$EventDispatcher$6(MediaSourceEventListener$EventDispatcher, MediaSourceEventListener, MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData, IOException, boolean)>
	//   26   59:invokespecial   #144 <Method void postOrRun(Handler, Runnable)>
	//*  27   62:goto            9
	//   28   65:return          
	}

	public void loadError(DataSpec dataspec, int i, int j, Format format, int k, Object obj, long l, long l1, long l2, long l3, 
			long l4, IOException ioexception, boolean flag)
	{
		loadError(new MediaSourceEventListener.LoadEventInfo(dataspec, l2, l3, l4), new MediaSourceEventListener.MediaLoadData(i, j, format, k, obj, adjustMediaTime(l), adjustMediaTime(l1)), ioexception, flag);
	//    0    0:aload_0         
	//    1    1:new             #152 <Class MediaSourceEventListener$LoadEventInfo>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:lload           11
	//    5    8:lload           13
	//    6   10:lload           15
	//    7   12:invokespecial   #155 <Method void MediaSourceEventListener$LoadEventInfo(DataSpec, long, long, long)>
	//    8   15:new             #109 <Class MediaSourceEventListener$MediaLoadData>
	//    9   18:dup             
	//   10   19:iload_2         
	//   11   20:iload_3         
	//   12   21:aload           4
	//   13   23:iload           5
	//   14   25:aload           6
	//   15   27:aload_0         
	//   16   28:lload           7
	//   17   30:invokespecial   #111 <Method long adjustMediaTime(long)>
	//   18   33:aload_0         
	//   19   34:lload           9
	//   20   36:invokespecial   #111 <Method long adjustMediaTime(long)>
	//   21   39:invokespecial   #114 <Method void MediaSourceEventListener$MediaLoadData(int, int, Format, int, Object, long, long)>
	//   22   42:aload           17
	//   23   44:iload           18
	//   24   46:invokevirtual   #174 <Method void loadError(MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData, IOException, boolean)>
	//   25   49:return          
	}

	public void loadError(DataSpec dataspec, int i, long l, long l1, long l2, IOException ioexception, boolean flag)
	{
		loadError(dataspec, i, -1, ((Format) (null)), 0, ((Object) (null)), 0x1L, 0x1L, l, l1, l2, ioexception, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_m1       
	//    4    4:aconst_null     
	//    5    5:iconst_0        
	//    6    6:aconst_null     
	//    7    7:ldc2w           #68  <Long 0x1L>
	//    8   10:ldc2w           #68  <Long 0x1L>
	//    9   13:lload_3         
	//   10   14:lload           5
	//   11   16:lload           7
	//   12   18:aload           9
	//   13   20:iload           10
	//   14   22:invokevirtual   #177 <Method void loadError(DataSpec, int, int, Format, int, Object, long, long, long, long, long, IOException, boolean)>
	//   15   25:return          
	}

	public void loadStarted(final MediaSourceEventListener.LoadEventInfo loadEventInfo, final MediaSourceEventListener.MediaLoadData mediaLoadData)
	{
		ListenerAndHandler listenerandhandler;
		final MediaSourceEventListener listener;
		for(Iterator iterator = listenerAndHandlers.iterator(); iterator.hasNext(); postOrRun(listenerandhandler.handler, new Runnable() {

		public void run()
		{
			listener.onLoadStarted(windowIndex, mediaPeriodId, loadEventInfo, mediaLoadData);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field MediaSourceEventListener val$listener>
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    4    8:getfield        #41  <Field int MediaSourceEventListener$EventDispatcher.windowIndex>
		//    5   11:aload_0         
		//    6   12:getfield        #26  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    7   15:getfield        #45  <Field MediaSource$MediaPeriodId MediaSourceEventListener$EventDispatcher.mediaPeriodId>
		//    8   18:aload_0         
		//    9   19:getfield        #30  <Field MediaSourceEventListener$LoadEventInfo val$loadEventInfo>
		//   10   22:aload_0         
		//   11   23:getfield        #32  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
		//   12   26:invokeinterface #49  <Method void MediaSourceEventListener.onLoadStarted(int, MediaSource$MediaPeriodId, MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData)>
		//   13   31:return          
		}

		final MediaSourceEventListener.EventDispatcher this$0;
		final MediaSourceEventListener val$listener;
		final MediaSourceEventListener.LoadEventInfo val$loadEventInfo;
		final MediaSourceEventListener.MediaLoadData val$mediaLoadData;

			
			{
				this$0 = MediaSourceEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaSourceEventListener$EventDispatcher this$0>
				listener = mediasourceeventlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaSourceEventListener val$listener>
				loadEventInfo = loadeventinfo;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field MediaSourceEventListener$LoadEventInfo val$loadEventInfo>
				mediaLoadData = medialoaddata;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
	}
))
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field CopyOnWriteArrayList listenerAndHandlers>
	//*   2    4:invokevirtual   #121 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*   3    7:astore_3        
	//*   4    8:aload_3         
	//*   5    9:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            59
		{
			listenerandhandler = (ListenerAndHandler)iterator.next();
	//    7   17:aload_3         
	//    8   18:invokeinterface #131 <Method Object Iterator.next()>
	//    9   23:checkcast       #27  <Class MediaSourceEventListener$EventDispatcher$ListenerAndHandler>
	//   10   26:astore          4
			listener = listenerandhandler.listener;
	//   11   28:aload           4
	//   12   30:getfield        #135 <Field MediaSourceEventListener MediaSourceEventListener$EventDispatcher$ListenerAndHandler.listener>
	//   13   33:astore          5
		}

	//   14   35:aload_0         
	//   15   36:aload           4
	//   16   38:getfield        #139 <Field Handler MediaSourceEventListener$EventDispatcher$ListenerAndHandler.handler>
	//   17   41:new             #13  <Class MediaSourceEventListener$EventDispatcher$3>
	//   18   44:dup             
	//   19   45:aload_0         
	//   20   46:aload           5
	//   21   48:aload_1         
	//   22   49:aload_2         
	//   23   50:invokespecial   #179 <Method void MediaSourceEventListener$EventDispatcher$3(MediaSourceEventListener$EventDispatcher, MediaSourceEventListener, MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData)>
	//   24   53:invokespecial   #144 <Method void postOrRun(Handler, Runnable)>
	//*  25   56:goto            8
	//   26   59:return          
	}

	public void loadStarted(DataSpec dataspec, int i, int j, Format format, int k, Object obj, long l, long l1, long l2)
	{
		loadStarted(new MediaSourceEventListener.LoadEventInfo(dataspec, l2, 0L, 0L), new MediaSourceEventListener.MediaLoadData(i, j, format, k, obj, adjustMediaTime(l), adjustMediaTime(l1)));
	//    0    0:aload_0         
	//    1    1:new             #152 <Class MediaSourceEventListener$LoadEventInfo>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:lload           11
	//    5    8:lconst_0        
	//    6    9:lconst_0        
	//    7   10:invokespecial   #155 <Method void MediaSourceEventListener$LoadEventInfo(DataSpec, long, long, long)>
	//    8   13:new             #109 <Class MediaSourceEventListener$MediaLoadData>
	//    9   16:dup             
	//   10   17:iload_2         
	//   11   18:iload_3         
	//   12   19:aload           4
	//   13   21:iload           5
	//   14   23:aload           6
	//   15   25:aload_0         
	//   16   26:lload           7
	//   17   28:invokespecial   #111 <Method long adjustMediaTime(long)>
	//   18   31:aload_0         
	//   19   32:lload           9
	//   20   34:invokespecial   #111 <Method long adjustMediaTime(long)>
	//   21   37:invokespecial   #114 <Method void MediaSourceEventListener$MediaLoadData(int, int, Format, int, Object, long, long)>
	//   22   40:invokevirtual   #182 <Method void loadStarted(MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData)>
	//   23   43:return          
	}

	public void loadStarted(DataSpec dataspec, int i, long l)
	{
		loadStarted(dataspec, i, -1, ((Format) (null)), 0, ((Object) (null)), 0x1L, 0x1L, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_m1       
	//    4    4:aconst_null     
	//    5    5:iconst_0        
	//    6    6:aconst_null     
	//    7    7:ldc2w           #68  <Long 0x1L>
	//    8   10:ldc2w           #68  <Long 0x1L>
	//    9   13:lload_3         
	//   10   14:invokevirtual   #185 <Method void loadStarted(DataSpec, int, int, Format, int, Object, long, long, long)>
	//   11   17:return          
	}

	public void mediaPeriodCreated()
	{
		boolean flag;
		if(mediaPeriodId != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field MediaSource$MediaPeriodId mediaPeriodId>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		Assertions.checkState(flag);
	//    8   14:iload_1         
	//    9   15:invokestatic    #189 <Method void Assertions.checkState(boolean)>
		ListenerAndHandler listenerandhandler;
		final MediaSourceEventListener listener;
		for(Iterator iterator = listenerAndHandlers.iterator(); iterator.hasNext(); postOrRun(listenerandhandler.handler, new Runnable() {

		public void run()
		{
			listener.onMediaPeriodCreated(windowIndex, mediaPeriodId);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field MediaSourceEventListener val$listener>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    4    8:getfield        #32  <Field int MediaSourceEventListener$EventDispatcher.windowIndex>
		//    5   11:aload_0         
		//    6   12:getfield        #22  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    7   15:getfield        #36  <Field MediaSource$MediaPeriodId MediaSourceEventListener$EventDispatcher.mediaPeriodId>
		//    8   18:invokeinterface #40  <Method void MediaSourceEventListener.onMediaPeriodCreated(int, MediaSource$MediaPeriodId)>
		//    9   23:return          
		}

		final MediaSourceEventListener.EventDispatcher this$0;
		final MediaSourceEventListener val$listener;

			
			{
				this$0 = MediaSourceEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaSourceEventListener$EventDispatcher this$0>
				listener = mediasourceeventlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field MediaSourceEventListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}
))
	//*  10   18:aload_0         
	//*  11   19:getfield        #51  <Field CopyOnWriteArrayList listenerAndHandlers>
	//*  12   22:invokevirtual   #121 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  13   25:astore_2        
	//*  14   26:aload_2         
	//*  15   27:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*  16   32:ifeq            72
		{
			listenerandhandler = (ListenerAndHandler)iterator.next();
	//   17   35:aload_2         
	//   18   36:invokeinterface #131 <Method Object Iterator.next()>
	//   19   41:checkcast       #27  <Class MediaSourceEventListener$EventDispatcher$ListenerAndHandler>
	//   20   44:astore_3        
			listener = listenerandhandler.listener;
	//   21   45:aload_3         
	//   22   46:getfield        #135 <Field MediaSourceEventListener MediaSourceEventListener$EventDispatcher$ListenerAndHandler.listener>
	//   23   49:astore          4
		}

	//   24   51:aload_0         
	//   25   52:aload_3         
	//   26   53:getfield        #139 <Field Handler MediaSourceEventListener$EventDispatcher$ListenerAndHandler.handler>
	//   27   56:new             #9   <Class MediaSourceEventListener$EventDispatcher$1>
	//   28   59:dup             
	//   29   60:aload_0         
	//   30   61:aload           4
	//   31   63:invokespecial   #192 <Method void MediaSourceEventListener$EventDispatcher$1(MediaSourceEventListener$EventDispatcher, MediaSourceEventListener)>
	//   32   66:invokespecial   #144 <Method void postOrRun(Handler, Runnable)>
	//*  33   69:goto            26
	//   34   72:return          
	}

	public void mediaPeriodReleased()
	{
		boolean flag;
		if(mediaPeriodId != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field MediaSource$MediaPeriodId mediaPeriodId>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		Assertions.checkState(flag);
	//    8   14:iload_1         
	//    9   15:invokestatic    #189 <Method void Assertions.checkState(boolean)>
		ListenerAndHandler listenerandhandler;
		final MediaSourceEventListener listener;
		for(Iterator iterator = listenerAndHandlers.iterator(); iterator.hasNext(); postOrRun(listenerandhandler.handler, new Runnable() {

		public void run()
		{
			listener.onMediaPeriodReleased(windowIndex, mediaPeriodId);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field MediaSourceEventListener val$listener>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    4    8:getfield        #32  <Field int MediaSourceEventListener$EventDispatcher.windowIndex>
		//    5   11:aload_0         
		//    6   12:getfield        #22  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    7   15:getfield        #36  <Field MediaSource$MediaPeriodId MediaSourceEventListener$EventDispatcher.mediaPeriodId>
		//    8   18:invokeinterface #40  <Method void MediaSourceEventListener.onMediaPeriodReleased(int, MediaSource$MediaPeriodId)>
		//    9   23:return          
		}

		final MediaSourceEventListener.EventDispatcher this$0;
		final MediaSourceEventListener val$listener;

			
			{
				this$0 = MediaSourceEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaSourceEventListener$EventDispatcher this$0>
				listener = mediasourceeventlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field MediaSourceEventListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}
))
	//*  10   18:aload_0         
	//*  11   19:getfield        #51  <Field CopyOnWriteArrayList listenerAndHandlers>
	//*  12   22:invokevirtual   #121 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  13   25:astore_2        
	//*  14   26:aload_2         
	//*  15   27:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*  16   32:ifeq            72
		{
			listenerandhandler = (ListenerAndHandler)iterator.next();
	//   17   35:aload_2         
	//   18   36:invokeinterface #131 <Method Object Iterator.next()>
	//   19   41:checkcast       #27  <Class MediaSourceEventListener$EventDispatcher$ListenerAndHandler>
	//   20   44:astore_3        
			listener = listenerandhandler.listener;
	//   21   45:aload_3         
	//   22   46:getfield        #135 <Field MediaSourceEventListener MediaSourceEventListener$EventDispatcher$ListenerAndHandler.listener>
	//   23   49:astore          4
		}

	//   24   51:aload_0         
	//   25   52:aload_3         
	//   26   53:getfield        #139 <Field Handler MediaSourceEventListener$EventDispatcher$ListenerAndHandler.handler>
	//   27   56:new             #11  <Class MediaSourceEventListener$EventDispatcher$2>
	//   28   59:dup             
	//   29   60:aload_0         
	//   30   61:aload           4
	//   31   63:invokespecial   #194 <Method void MediaSourceEventListener$EventDispatcher$2(MediaSourceEventListener$EventDispatcher, MediaSourceEventListener)>
	//   32   66:invokespecial   #144 <Method void postOrRun(Handler, Runnable)>
	//*  33   69:goto            26
	//   34   72:return          
	}

	public void readingStarted()
	{
		boolean flag;
		if(mediaPeriodId != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field MediaSource$MediaPeriodId mediaPeriodId>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		Assertions.checkState(flag);
	//    8   14:iload_1         
	//    9   15:invokestatic    #189 <Method void Assertions.checkState(boolean)>
		ListenerAndHandler listenerandhandler;
		final MediaSourceEventListener listener;
		for(Iterator iterator = listenerAndHandlers.iterator(); iterator.hasNext(); postOrRun(listenerandhandler.handler, new Runnable() {

		public void run()
		{
			listener.onReadingStarted(windowIndex, mediaPeriodId);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field MediaSourceEventListener val$listener>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    4    8:getfield        #32  <Field int MediaSourceEventListener$EventDispatcher.windowIndex>
		//    5   11:aload_0         
		//    6   12:getfield        #22  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    7   15:getfield        #36  <Field MediaSource$MediaPeriodId MediaSourceEventListener$EventDispatcher.mediaPeriodId>
		//    8   18:invokeinterface #40  <Method void MediaSourceEventListener.onReadingStarted(int, MediaSource$MediaPeriodId)>
		//    9   23:return          
		}

		final MediaSourceEventListener.EventDispatcher this$0;
		final MediaSourceEventListener val$listener;

			
			{
				this$0 = MediaSourceEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaSourceEventListener$EventDispatcher this$0>
				listener = mediasourceeventlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field MediaSourceEventListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}
))
	//*  10   18:aload_0         
	//*  11   19:getfield        #51  <Field CopyOnWriteArrayList listenerAndHandlers>
	//*  12   22:invokevirtual   #121 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  13   25:astore_2        
	//*  14   26:aload_2         
	//*  15   27:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*  16   32:ifeq            72
		{
			listenerandhandler = (ListenerAndHandler)iterator.next();
	//   17   35:aload_2         
	//   18   36:invokeinterface #131 <Method Object Iterator.next()>
	//   19   41:checkcast       #27  <Class MediaSourceEventListener$EventDispatcher$ListenerAndHandler>
	//   20   44:astore_3        
			listener = listenerandhandler.listener;
	//   21   45:aload_3         
	//   22   46:getfield        #135 <Field MediaSourceEventListener MediaSourceEventListener$EventDispatcher$ListenerAndHandler.listener>
	//   23   49:astore          4
		}

	//   24   51:aload_0         
	//   25   52:aload_3         
	//   26   53:getfield        #139 <Field Handler MediaSourceEventListener$EventDispatcher$ListenerAndHandler.handler>
	//   27   56:new             #21  <Class MediaSourceEventListener$EventDispatcher$7>
	//   28   59:dup             
	//   29   60:aload_0         
	//   30   61:aload           4
	//   31   63:invokespecial   #196 <Method void MediaSourceEventListener$EventDispatcher$7(MediaSourceEventListener$EventDispatcher, MediaSourceEventListener)>
	//   32   66:invokespecial   #144 <Method void postOrRun(Handler, Runnable)>
	//*  33   69:goto            26
	//   34   72:return          
	}

	public void removeEventListener(MediaSourceEventListener mediasourceeventlistener)
	{
		Iterator iterator = listenerAndHandlers.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field CopyOnWriteArrayList listenerAndHandlers>
	//    2    4:invokevirtual   #121 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    8:aload_2         
	//    5    9:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            47
			ListenerAndHandler listenerandhandler = (ListenerAndHandler)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #131 <Method Object Iterator.next()>
	//    9   23:checkcast       #27  <Class MediaSourceEventListener$EventDispatcher$ListenerAndHandler>
	//   10   26:astore_3        
			if(listenerandhandler.listener == mediasourceeventlistener)
	//*  11   27:aload_3         
	//*  12   28:getfield        #135 <Field MediaSourceEventListener MediaSourceEventListener$EventDispatcher$ListenerAndHandler.listener>
	//*  13   31:aload_1         
	//*  14   32:if_acmpne       8
				listenerAndHandlers.remove(((Object) (listenerandhandler)));
	//   15   35:aload_0         
	//   16   36:getfield        #51  <Field CopyOnWriteArrayList listenerAndHandlers>
	//   17   39:aload_3         
	//   18   40:invokevirtual   #201 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   19   43:pop             
		} while(true);
	//   20   44:goto            8
	//   21   47:return          
	}

	public void upstreamDiscarded(int i, long l, long l1)
	{
		upstreamDiscarded(new MediaSourceEventListener.MediaLoadData(1, i, ((Format) (null)), 3, ((Object) (null)), adjustMediaTime(l), adjustMediaTime(l1)));
	//    0    0:aload_0         
	//    1    1:new             #109 <Class MediaSourceEventListener$MediaLoadData>
	//    2    4:dup             
	//    3    5:iconst_1        
	//    4    6:iload_1         
	//    5    7:aconst_null     
	//    6    8:iconst_3        
	//    7    9:aconst_null     
	//    8   10:aload_0         
	//    9   11:lload_2         
	//   10   12:invokespecial   #111 <Method long adjustMediaTime(long)>
	//   11   15:aload_0         
	//   12   16:lload           4
	//   13   18:invokespecial   #111 <Method long adjustMediaTime(long)>
	//   14   21:invokespecial   #114 <Method void MediaSourceEventListener$MediaLoadData(int, int, Format, int, Object, long, long)>
	//   15   24:invokevirtual   #205 <Method void upstreamDiscarded(MediaSourceEventListener$MediaLoadData)>
	//   16   27:return          
	}

	public void upstreamDiscarded(final MediaSourceEventListener.MediaLoadData mediaLoadData)
	{
		ListenerAndHandler listenerandhandler;
		final MediaSourceEventListener listener;
		for(Iterator iterator = listenerAndHandlers.iterator(); iterator.hasNext(); postOrRun(listenerandhandler.handler, new Runnable() {

		public void run()
		{
			listener.onUpstreamDiscarded(windowIndex, mediaPeriodId, mediaLoadData);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field MediaSourceEventListener val$listener>
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    4    8:getfield        #37  <Field int MediaSourceEventListener$EventDispatcher.windowIndex>
		//    5   11:aload_0         
		//    6   12:getfield        #24  <Field MediaSourceEventListener$EventDispatcher this$0>
		//    7   15:getfield        #41  <Field MediaSource$MediaPeriodId MediaSourceEventListener$EventDispatcher.mediaPeriodId>
		//    8   18:aload_0         
		//    9   19:getfield        #28  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
		//   10   22:invokeinterface #45  <Method void MediaSourceEventListener.onUpstreamDiscarded(int, MediaSource$MediaPeriodId, MediaSourceEventListener$MediaLoadData)>
		//   11   27:return          
		}

		final MediaSourceEventListener.EventDispatcher this$0;
		final MediaSourceEventListener val$listener;
		final MediaSourceEventListener.MediaLoadData val$mediaLoadData;

			
			{
				this$0 = MediaSourceEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaSourceEventListener$EventDispatcher this$0>
				listener = mediasourceeventlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field MediaSourceEventListener val$listener>
				mediaLoadData = medialoaddata;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
	}
))
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field CopyOnWriteArrayList listenerAndHandlers>
	//*   2    4:invokevirtual   #121 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            55
		{
			listenerandhandler = (ListenerAndHandler)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #131 <Method Object Iterator.next()>
	//    9   23:checkcast       #27  <Class MediaSourceEventListener$EventDispatcher$ListenerAndHandler>
	//   10   26:astore_3        
			listener = listenerandhandler.listener;
	//   11   27:aload_3         
	//   12   28:getfield        #135 <Field MediaSourceEventListener MediaSourceEventListener$EventDispatcher$ListenerAndHandler.listener>
	//   13   31:astore          4
		}

	//   14   33:aload_0         
	//   15   34:aload_3         
	//   16   35:getfield        #139 <Field Handler MediaSourceEventListener$EventDispatcher$ListenerAndHandler.handler>
	//   17   38:new             #23  <Class MediaSourceEventListener$EventDispatcher$8>
	//   18   41:dup             
	//   19   42:aload_0         
	//   20   43:aload           4
	//   21   45:aload_1         
	//   22   46:invokespecial   #206 <Method void MediaSourceEventListener$EventDispatcher$8(MediaSourceEventListener$EventDispatcher, MediaSourceEventListener, MediaSourceEventListener$MediaLoadData)>
	//   23   49:invokespecial   #144 <Method void postOrRun(Handler, Runnable)>
	//*  24   52:goto            8
	//   25   55:return          
	}

	public MediaSourceEventListener$EventDispatcher withParameters(int i, MediaSource.MediaPeriodId mediaperiodid, long l)
	{
		return new MediaSourceEventListener$EventDispatcher(listenerAndHandlers, i, mediaperiodid, l);
	//    0    0:new             #2   <Class MediaSourceEventListener$EventDispatcher>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field CopyOnWriteArrayList listenerAndHandlers>
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:lload_3         
	//    7   11:invokespecial   #47  <Method void MediaSourceEventListener$EventDispatcher(CopyOnWriteArrayList, int, MediaSource$MediaPeriodId, long)>
	//    8   14:areturn         
	}

	private final CopyOnWriteArrayList listenerAndHandlers;
	public final MediaSource.MediaPeriodId mediaPeriodId;
	private final long mediaTimeOffsetMs;
	public final int windowIndex;

	public MediaSourceEventListener$EventDispatcher()
	{
		this(new CopyOnWriteArrayList(), 0, ((MediaSource.MediaPeriodId) (null)), 0L);
	//    0    0:aload_0         
	//    1    1:new             #42  <Class CopyOnWriteArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #44  <Method void CopyOnWriteArrayList()>
	//    4    8:iconst_0        
	//    5    9:aconst_null     
	//    6   10:lconst_0        
	//    7   11:invokespecial   #47  <Method void MediaSourceEventListener$EventDispatcher(CopyOnWriteArrayList, int, MediaSource$MediaPeriodId, long)>
	//    8   14:return          
	}

	private MediaSourceEventListener$EventDispatcher(CopyOnWriteArrayList copyonwritearraylist, int i, MediaSource.MediaPeriodId mediaperiodid, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		listenerAndHandlers = copyonwritearraylist;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #51  <Field CopyOnWriteArrayList listenerAndHandlers>
		windowIndex = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #53  <Field int windowIndex>
		mediaPeriodId = mediaperiodid;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #55  <Field MediaSource$MediaPeriodId mediaPeriodId>
		mediaTimeOffsetMs = l;
	//   11   19:aload_0         
	//   12   20:lload           4
	//   13   22:putfield        #57  <Field long mediaTimeOffsetMs>
	//   14   25:return          
	}
}
