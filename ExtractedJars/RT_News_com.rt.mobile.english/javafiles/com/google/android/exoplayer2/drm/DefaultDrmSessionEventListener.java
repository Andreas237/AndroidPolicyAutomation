// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.os.Handler;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public interface DefaultDrmSessionEventListener
{
	public static final class EventDispatcher
	{

		public void addListener(Handler handler, DefaultDrmSessionEventListener defaultdrmsessioneventlistener)
		{
			boolean flag;
			if(handler != null && defaultdrmsessioneventlistener != null)
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
		//   10   16:invokestatic    #39  <Method void Assertions.checkArgument(boolean)>
			listeners.add(((Object) (new HandlerAndListener(handler, defaultdrmsessioneventlistener))));
		//   11   19:aload_0         
		//   12   20:getfield        #30  <Field CopyOnWriteArrayList listeners>
		//   13   23:new             #17  <Class DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener>
		//   14   26:dup             
		//   15   27:aload_1         
		//   16   28:aload_2         
		//   17   29:invokespecial   #41  <Method void DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener(Handler, DefaultDrmSessionEventListener)>
		//   18   32:invokevirtual   #45  <Method boolean CopyOnWriteArrayList.add(Object)>
		//   19   35:pop             
		//   20   36:return          
		}

		public void drmKeysLoaded()
		{
			HandlerAndListener handlerandlistener;
			DefaultDrmSessionEventListener defaultdrmsessioneventlistener;
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); handlerandlistener.handler.post(((_cls1) (defaultdrmsessioneventlistener)). new Runnable() {

		public void run()
		{
			listener.onDrmKeysLoaded();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field DefaultDrmSessionEventListener val$listener>
		//    2    4:invokeinterface #31  <Method void DefaultDrmSessionEventListener.onDrmKeysLoaded()>
		//    3    9:return          
		}

		final EventDispatcher this$0;
		final DefaultDrmSessionEventListener val$listener;

			
			{
				this$0 = final_eventdispatcher;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field DefaultDrmSessionEventListener$EventDispatcher this$0>
				listener = DefaultDrmSessionEventListener.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field DefaultDrmSessionEventListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}
))
		//*   0    0:aload_0         
		//*   1    1:getfield        #30  <Field CopyOnWriteArrayList listeners>
		//*   2    4:invokevirtual   #50  <Method Iterator CopyOnWriteArrayList.iterator()>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:invokeinterface #56  <Method boolean Iterator.hasNext()>
		//*   6   14:ifeq            52
			{
				handlerandlistener = (HandlerAndListener)iterator.next();
		//    7   17:aload_1         
		//    8   18:invokeinterface #60  <Method Object Iterator.next()>
		//    9   23:checkcast       #17  <Class DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener>
		//   10   26:astore_2        
				defaultdrmsessioneventlistener = handlerandlistener.listener;
		//   11   27:aload_2         
		//   12   28:getfield        #64  <Field DefaultDrmSessionEventListener DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener.listener>
		//   13   31:astore_3        
			}

		//   14   32:aload_2         
		//   15   33:getfield        #68  <Field Handler DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener.handler>
		//   16   36:new             #9   <Class DefaultDrmSessionEventListener$EventDispatcher$1>
		//   17   39:dup             
		//   18   40:aload_0         
		//   19   41:aload_3         
		//   20   42:invokespecial   #71  <Method void DefaultDrmSessionEventListener$EventDispatcher$1(DefaultDrmSessionEventListener$EventDispatcher, DefaultDrmSessionEventListener)>
		//   21   45:invokevirtual   #77  <Method boolean Handler.post(Runnable)>
		//   22   48:pop             
		//*  23   49:goto            8
		//   24   52:return          
		}

		public void drmKeysRemoved()
		{
			HandlerAndListener handlerandlistener;
			DefaultDrmSessionEventListener defaultdrmsessioneventlistener;
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); handlerandlistener.handler.post(((_cls4) (defaultdrmsessioneventlistener)). new Runnable() {

		public void run()
		{
			listener.onDrmKeysRemoved();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field DefaultDrmSessionEventListener val$listener>
		//    2    4:invokeinterface #31  <Method void DefaultDrmSessionEventListener.onDrmKeysRemoved()>
		//    3    9:return          
		}

		final EventDispatcher this$0;
		final DefaultDrmSessionEventListener val$listener;

			
			{
				this$0 = final_eventdispatcher;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field DefaultDrmSessionEventListener$EventDispatcher this$0>
				listener = DefaultDrmSessionEventListener.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field DefaultDrmSessionEventListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}
))
		//*   0    0:aload_0         
		//*   1    1:getfield        #30  <Field CopyOnWriteArrayList listeners>
		//*   2    4:invokevirtual   #50  <Method Iterator CopyOnWriteArrayList.iterator()>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:invokeinterface #56  <Method boolean Iterator.hasNext()>
		//*   6   14:ifeq            52
			{
				handlerandlistener = (HandlerAndListener)iterator.next();
		//    7   17:aload_1         
		//    8   18:invokeinterface #60  <Method Object Iterator.next()>
		//    9   23:checkcast       #17  <Class DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener>
		//   10   26:astore_2        
				defaultdrmsessioneventlistener = handlerandlistener.listener;
		//   11   27:aload_2         
		//   12   28:getfield        #64  <Field DefaultDrmSessionEventListener DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener.listener>
		//   13   31:astore_3        
			}

		//   14   32:aload_2         
		//   15   33:getfield        #68  <Field Handler DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener.handler>
		//   16   36:new             #15  <Class DefaultDrmSessionEventListener$EventDispatcher$4>
		//   17   39:dup             
		//   18   40:aload_0         
		//   19   41:aload_3         
		//   20   42:invokespecial   #79  <Method void DefaultDrmSessionEventListener$EventDispatcher$4(DefaultDrmSessionEventListener$EventDispatcher, DefaultDrmSessionEventListener)>
		//   21   45:invokevirtual   #77  <Method boolean Handler.post(Runnable)>
		//   22   48:pop             
		//*  23   49:goto            8
		//   24   52:return          
		}

		public void drmKeysRestored()
		{
			HandlerAndListener handlerandlistener;
			DefaultDrmSessionEventListener defaultdrmsessioneventlistener;
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); handlerandlistener.handler.post(((_cls3) (defaultdrmsessioneventlistener)). new Runnable() {

		public void run()
		{
			listener.onDrmKeysRestored();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field DefaultDrmSessionEventListener val$listener>
		//    2    4:invokeinterface #31  <Method void DefaultDrmSessionEventListener.onDrmKeysRestored()>
		//    3    9:return          
		}

		final EventDispatcher this$0;
		final DefaultDrmSessionEventListener val$listener;

			
			{
				this$0 = final_eventdispatcher;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field DefaultDrmSessionEventListener$EventDispatcher this$0>
				listener = DefaultDrmSessionEventListener.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field DefaultDrmSessionEventListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}
))
		//*   0    0:aload_0         
		//*   1    1:getfield        #30  <Field CopyOnWriteArrayList listeners>
		//*   2    4:invokevirtual   #50  <Method Iterator CopyOnWriteArrayList.iterator()>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:invokeinterface #56  <Method boolean Iterator.hasNext()>
		//*   6   14:ifeq            52
			{
				handlerandlistener = (HandlerAndListener)iterator.next();
		//    7   17:aload_1         
		//    8   18:invokeinterface #60  <Method Object Iterator.next()>
		//    9   23:checkcast       #17  <Class DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener>
		//   10   26:astore_2        
				defaultdrmsessioneventlistener = handlerandlistener.listener;
		//   11   27:aload_2         
		//   12   28:getfield        #64  <Field DefaultDrmSessionEventListener DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener.listener>
		//   13   31:astore_3        
			}

		//   14   32:aload_2         
		//   15   33:getfield        #68  <Field Handler DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener.handler>
		//   16   36:new             #13  <Class DefaultDrmSessionEventListener$EventDispatcher$3>
		//   17   39:dup             
		//   18   40:aload_0         
		//   19   41:aload_3         
		//   20   42:invokespecial   #81  <Method void DefaultDrmSessionEventListener$EventDispatcher$3(DefaultDrmSessionEventListener$EventDispatcher, DefaultDrmSessionEventListener)>
		//   21   45:invokevirtual   #77  <Method boolean Handler.post(Runnable)>
		//   22   48:pop             
		//*  23   49:goto            8
		//   24   52:return          
		}

		public void drmSessionManagerError(Exception exception)
		{
			HandlerAndListener handlerandlistener;
			final DefaultDrmSessionEventListener listener;
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); handlerandlistener.handler.post(((_cls2) (exception)). new Runnable() {

		public void run()
		{
			listener.onDrmSessionManagerError(e);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field DefaultDrmSessionEventListener val$listener>
		//    2    4:aload_0         
		//    3    5:getfield        #28  <Field Exception val$e>
		//    4    8:invokeinterface #36  <Method void DefaultDrmSessionEventListener.onDrmSessionManagerError(Exception)>
		//    5   13:return          
		}

		final EventDispatcher this$0;
		final Exception val$e;
		final DefaultDrmSessionEventListener val$listener;

			
			{
				this$0 = final_eventdispatcher;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field DefaultDrmSessionEventListener$EventDispatcher this$0>
				listener = defaultdrmsessioneventlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field DefaultDrmSessionEventListener val$listener>
				e = Exception.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field Exception val$e>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
	}
))
		//*   0    0:aload_0         
		//*   1    1:getfield        #30  <Field CopyOnWriteArrayList listeners>
		//*   2    4:invokevirtual   #50  <Method Iterator CopyOnWriteArrayList.iterator()>
		//*   3    7:astore_2        
		//*   4    8:aload_2         
		//*   5    9:invokeinterface #56  <Method boolean Iterator.hasNext()>
		//*   6   14:ifeq            55
			{
				handlerandlistener = (HandlerAndListener)iterator.next();
		//    7   17:aload_2         
		//    8   18:invokeinterface #60  <Method Object Iterator.next()>
		//    9   23:checkcast       #17  <Class DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener>
		//   10   26:astore_3        
				listener = handlerandlistener.listener;
		//   11   27:aload_3         
		//   12   28:getfield        #64  <Field DefaultDrmSessionEventListener DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener.listener>
		//   13   31:astore          4
			}

		//   14   33:aload_3         
		//   15   34:getfield        #68  <Field Handler DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener.handler>
		//   16   37:new             #11  <Class DefaultDrmSessionEventListener$EventDispatcher$2>
		//   17   40:dup             
		//   18   41:aload_0         
		//   19   42:aload           4
		//   20   44:aload_1         
		//   21   45:invokespecial   #86  <Method void DefaultDrmSessionEventListener$EventDispatcher$2(DefaultDrmSessionEventListener$EventDispatcher, DefaultDrmSessionEventListener, Exception)>
		//   22   48:invokevirtual   #77  <Method boolean Handler.post(Runnable)>
		//   23   51:pop             
		//*  24   52:goto            8
		//   25   55:return          
		}

		public void removeListener(DefaultDrmSessionEventListener defaultdrmsessioneventlistener)
		{
			Iterator iterator = listeners.iterator();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field CopyOnWriteArrayList listeners>
		//    2    4:invokevirtual   #50  <Method Iterator CopyOnWriteArrayList.iterator()>
		//    3    7:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
		//    4    8:aload_2         
		//    5    9:invokeinterface #56  <Method boolean Iterator.hasNext()>
		//    6   14:ifeq            47
				HandlerAndListener handlerandlistener = (HandlerAndListener)iterator.next();
		//    7   17:aload_2         
		//    8   18:invokeinterface #60  <Method Object Iterator.next()>
		//    9   23:checkcast       #17  <Class DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener>
		//   10   26:astore_3        
				if(handlerandlistener.listener == defaultdrmsessioneventlistener)
		//*  11   27:aload_3         
		//*  12   28:getfield        #64  <Field DefaultDrmSessionEventListener DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener.listener>
		//*  13   31:aload_1         
		//*  14   32:if_acmpne       8
					listeners.remove(((Object) (handlerandlistener)));
		//   15   35:aload_0         
		//   16   36:getfield        #30  <Field CopyOnWriteArrayList listeners>
		//   17   39:aload_3         
		//   18   40:invokevirtual   #91  <Method boolean CopyOnWriteArrayList.remove(Object)>
		//   19   43:pop             
			} while(true);
		//   20   44:goto            8
		//   21   47:return          
		}

		private final CopyOnWriteArrayList listeners = new CopyOnWriteArrayList();

		public EventDispatcher()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #27  <Class CopyOnWriteArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #28  <Method void CopyOnWriteArrayList()>
		//    6   12:putfield        #30  <Field CopyOnWriteArrayList listeners>
		//    7   15:return          
		}
	}

	private static final class EventDispatcher.HandlerAndListener
	{

		public final Handler handler;
		public final DefaultDrmSessionEventListener listener;

		public EventDispatcher.HandlerAndListener(Handler handler1, DefaultDrmSessionEventListener defaultdrmsessioneventlistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			handler = handler1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field Handler handler>
			listener = defaultdrmsessioneventlistener;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field DefaultDrmSessionEventListener listener>
		//    8   14:return          
		}
	}


	public abstract void onDrmKeysLoaded();

	public abstract void onDrmKeysRemoved();

	public abstract void onDrmKeysRestored();

	public abstract void onDrmSessionManagerError(Exception exception);
}
