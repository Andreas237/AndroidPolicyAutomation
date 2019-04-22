// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import com.firebase.client.utilities.LogWrapper;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.firebase.client.core.view:
//			EventRaiser, Event

class EventRaiser$1
	implements Runnable
{

	public void run()
	{
		Event event;
		for(Iterator iterator = val$eventsClone.iterator(); iterator.hasNext(); event.fire())
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
			if(EventRaiser.access$000(EventRaiser.this).logsDebug())
	//*  11   27:aload_0         
	//*  12   28:getfield        #19  <Field EventRaiser this$0>
	//*  13   31:invokestatic    #48  <Method LogWrapper EventRaiser.access$000(EventRaiser)>
	//*  14   34:invokevirtual   #53  <Method boolean LogWrapper.logsDebug()>
	//*  15   37:ifeq            86
			{
				LogWrapper logwrapper = EventRaiser.access$000(EventRaiser.this);
	//   16   40:aload_0         
	//   17   41:getfield        #19  <Field EventRaiser this$0>
	//   18   44:invokestatic    #48  <Method LogWrapper EventRaiser.access$000(EventRaiser)>
	//   19   47:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   20   48:new             #55  <Class StringBuilder>
	//   21   51:dup             
	//   22   52:invokespecial   #56  <Method void StringBuilder()>
	//   23   55:astore          4
				stringbuilder.append("Raising ");
	//   24   57:aload           4
	//   25   59:ldc1            #58  <String "Raising ">
	//   26   61:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   27   64:pop             
				stringbuilder.append(event.toString());
	//   28   65:aload           4
	//   29   67:aload_2         
	//   30   68:invokeinterface #66  <Method String Event.toString()>
	//   31   73:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   32   76:pop             
				logwrapper.debug(stringbuilder.toString());
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

	EventRaiser$1()
	{
		this$0 = final_eventraiser;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field EventRaiser this$0>
		val$eventsClone = ArrayList.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ArrayList val$eventsClone>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
