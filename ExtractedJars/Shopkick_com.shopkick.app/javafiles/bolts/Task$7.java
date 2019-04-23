// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.*;

// Referenced classes of package bolts:
//			Continuation, Task

static final class Task$7
	implements Continuation
{

	public volatile Object then(Task task)
		throws Exception
	{
		return ((Object) (then(task)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #29  <Method List then(Task)>
	//    3    5:areturn         
	}

	public List then(Task task)
		throws Exception
	{
		if(val$tasks.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Collection val$tasks>
	//*   2    4:invokeinterface #36  <Method int Collection.size()>
	//*   3    9:ifne            16
			return Collections.emptyList();
	//    4   12:invokestatic    #42  <Method List Collections.emptyList()>
	//    5   15:areturn         
		task = ((Task) (new ArrayList()));
	//    6   16:new             #44  <Class ArrayList>
	//    7   19:dup             
	//    8   20:invokespecial   #45  <Method void ArrayList()>
	//    9   23:astore_1        
		for(Iterator iterator = val$tasks.iterator(); iterator.hasNext(); ((List) (task)).add(((Task)iterator.next()).getResult()));
	//   10   24:aload_0         
	//   11   25:getfield        #18  <Field Collection val$tasks>
	//   12   28:invokeinterface #49  <Method Iterator Collection.iterator()>
	//   13   33:astore_2        
	//   14   34:aload_2         
	//   15   35:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//   16   40:ifeq            65
	//   17   43:aload_1         
	//   18   44:aload_2         
	//   19   45:invokeinterface #59  <Method Object Iterator.next()>
	//   20   50:checkcast       #9   <Class Task>
	//   21   53:invokevirtual   #62  <Method Object Task.getResult()>
	//   22   56:invokeinterface #68  <Method boolean List.add(Object)>
	//   23   61:pop             
	//*  24   62:goto            34
		return ((List) (task));
	//   25   65:aload_1         
	//   26   66:areturn         
	}

	final Collection val$tasks;

	Task$7(Collection collection)
	{
		val$tasks = collection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Collection val$tasks>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
