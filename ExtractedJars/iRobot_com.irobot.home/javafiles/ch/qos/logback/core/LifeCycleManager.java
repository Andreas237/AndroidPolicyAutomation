// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core;

import ch.qos.logback.core.spi.LifeCycle;
import java.util.*;

public class LifeCycleManager
{

	public LifeCycleManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void HashSet()>
	//    6   12:putfield        #16  <Field Set components>
	//    7   15:return          
	}

	public void register(LifeCycle lifecycle)
	{
		components.add(((Object) (lifecycle)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Set components>
	//    2    4:aload_1         
	//    3    5:invokeinterface #25  <Method boolean Set.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void reset()
	{
		Iterator iterator = components.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Set components>
	//    2    4:invokeinterface #30  <Method Iterator Set.iterator()>
	//    3    9:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4   10:aload_1         
	//    5   11:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            47
			LifeCycle lifecycle = (LifeCycle)iterator.next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #40  <Method Object Iterator.next()>
	//    9   25:checkcast       #42  <Class LifeCycle>
	//   10   28:astore_2        
			if(lifecycle.isStarted())
	//*  11   29:aload_2         
	//*  12   30:invokeinterface #45  <Method boolean LifeCycle.isStarted()>
	//*  13   35:ifeq            10
				lifecycle.stop();
	//   14   38:aload_2         
	//   15   39:invokeinterface #48  <Method void LifeCycle.stop()>
		} while(true);
	//   16   44:goto            10
		components.clear();
	//   17   47:aload_0         
	//   18   48:getfield        #16  <Field Set components>
	//   19   51:invokeinterface #51  <Method void Set.clear()>
	//   20   56:return          
	}

	private final Set components = new HashSet();
}
