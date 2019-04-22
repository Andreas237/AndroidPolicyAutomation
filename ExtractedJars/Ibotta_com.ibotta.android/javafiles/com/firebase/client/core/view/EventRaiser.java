// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import com.firebase.client.EventTarget;
import com.firebase.client.core.Context;
import com.firebase.client.utilities.LogWrapper;
import java.util.*;

// Referenced classes of package com.firebase.client.core.view:
//			Event

public class EventRaiser
{

	public EventRaiser(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		eventTarget = context.getEventTarget();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #21  <Method EventTarget Context.getEventTarget()>
	//    5    9:putfield        #23  <Field EventTarget eventTarget>
		logger = context.getLogger("EventRaiser");
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:ldc1            #25  <String "EventRaiser">
	//    9   16:invokevirtual   #29  <Method LogWrapper Context.getLogger(String)>
	//   10   19:putfield        #31  <Field LogWrapper logger>
	//   11   22:return          
	}

	public void raiseEvents(final List eventsClone)
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field LogWrapper logger>
	//*   2    4:invokevirtual   #42  <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            56
		{
			LogWrapper logwrapper = logger;
	//    4   10:aload_0         
	//    5   11:getfield        #31  <Field LogWrapper logger>
	//    6   14:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #44  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #45  <Method void StringBuilder()>
	//   10   22:astore_3        
			stringbuilder.append("Raising ");
	//   11   23:aload_3         
	//   12   24:ldc1            #47  <String "Raising ">
	//   13   26:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			stringbuilder.append(eventsClone.size());
	//   15   30:aload_3         
	//   16   31:aload_1         
	//   17   32:invokeinterface #57  <Method int List.size()>
	//   18   37:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
	//   19   40:pop             
			stringbuilder.append(" event(s)");
	//   20   41:aload_3         
	//   21   42:ldc1            #62  <String " event(s)">
	//   22   44:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			logwrapper.debug(stringbuilder.toString());
	//   24   48:aload_2         
	//   25   49:aload_3         
	//   26   50:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   27   53:invokevirtual   #70  <Method void LogWrapper.debug(String)>
		}
		eventsClone = ((List) (new ArrayList(((java.util.Collection) (eventsClone)))));
	//   28   56:new             #72  <Class ArrayList>
	//   29   59:dup             
	//   30   60:aload_1         
	//   31   61:invokespecial   #75  <Method void ArrayList(java.util.Collection)>
	//   32   64:astore_1        
		eventTarget.postEvent(new Runnable() {

			public void run()
			{
				Event event;
				for(Iterator iterator = eventsClone.iterator(); iterator.hasNext(); event.fire())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field ArrayList val$eventsClone>
			//*   2    4:invokevirtual   #32  <Method Iterator ArrayList.iterator()>
			//*   3    7:astore_1        
			//*   4    8:aload_1         
			//*   5    9:invokeinterface #38  <Method boolean Iterator.hasNext()>
			//*   6   14:ifeq            95
				{
					event = (Event)iterator.next();
			//    7   17:aload_1         
			//    8   18:invokeinterface #42  <Method Object Iterator.next()>
			//    9   23:checkcast       #44  <Class Event>
			//   10   26:astore_2        
					if(logger.logsDebug())
			//*  11   27:aload_0         
			//*  12   28:getfield        #19  <Field EventRaiser this$0>
			//*  13   31:invokestatic    #48  <Method LogWrapper EventRaiser.access$000(EventRaiser)>
			//*  14   34:invokevirtual   #53  <Method boolean LogWrapper.logsDebug()>
			//*  15   37:ifeq            86
					{
						LogWrapper logwrapper1 = logger;
			//   16   40:aload_0         
			//   17   41:getfield        #19  <Field EventRaiser this$0>
			//   18   44:invokestatic    #48  <Method LogWrapper EventRaiser.access$000(EventRaiser)>
			//   19   47:astore_3        
						StringBuilder stringbuilder1 = new StringBuilder();
			//   20   48:new             #55  <Class StringBuilder>
			//   21   51:dup             
			//   22   52:invokespecial   #56  <Method void StringBuilder()>
			//   23   55:astore          4
						stringbuilder1.append("Raising ");
			//   24   57:aload           4
			//   25   59:ldc1            #58  <String "Raising ">
			//   26   61:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
			//   27   64:pop             
						stringbuilder1.append(event.toString());
			//   28   65:aload           4
			//   29   67:aload_2         
			//   30   68:invokeinterface #66  <Method String Event.toString()>
			//   31   73:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
			//   32   76:pop             
						logwrapper1.debug(stringbuilder1.toString());
			//   33   77:aload_3         
			//   34   78:aload           4
			//   35   80:invokevirtual   #67  <Method String StringBuilder.toString()>
			//   36   83:invokevirtual   #71  <Method void LogWrapper.debug(String)>
					}
				}

			//   37   86:aload_2         
			//   38   87:invokeinterface #74  <Method void Event.fire()>
			//*  39   92:goto            8
			//   40   95:return          
			}

			final EventRaiser this$0;
			final ArrayList val$eventsClone;

			
			{
				this$0 = EventRaiser.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field EventRaiser this$0>
				eventsClone = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ArrayList val$eventsClone>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   33   65:aload_0         
	//   34   66:getfield        #23  <Field EventTarget eventTarget>
	//   35   69:new             #6   <Class EventRaiser$1>
	//   36   72:dup             
	//   37   73:aload_0         
	//   38   74:aload_1         
	//   39   75:invokespecial   #78  <Method void EventRaiser$1(EventRaiser, ArrayList)>
	//   40   78:invokeinterface #84  <Method void EventTarget.postEvent(Runnable)>
	//   41   83:return          
	}

	private final EventTarget eventTarget;
	private final LogWrapper logger;


/*
	static LogWrapper access$000(EventRaiser eventraiser)
	{
		return eventraiser.logger;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field LogWrapper logger>
	//    2    4:areturn         
	}

*/
}
