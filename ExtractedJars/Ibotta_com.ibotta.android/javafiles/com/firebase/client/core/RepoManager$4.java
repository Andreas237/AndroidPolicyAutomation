// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			RepoManager, Repo, Context

class RepoManager$4
	implements Runnable
{

	public void run()
	{
		Map map = RepoManager.access$000(RepoManager.this);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RepoManager this$0>
	//    2    4:invokestatic    #30  <Method Map RepoManager.access$000(RepoManager)>
	//    3    7:astore_1        
		map;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(RepoManager.access$000(RepoManager.this).containsKey(((Object) (val$ctx))))
	//*   6   10:aload_0         
	//*   7   11:getfield        #19  <Field RepoManager this$0>
	//*   8   14:invokestatic    #30  <Method Map RepoManager.access$000(RepoManager)>
	//*   9   17:aload_0         
	//*  10   18:getfield        #21  <Field Context val$ctx>
	//*  11   21:invokeinterface #36  <Method boolean Map.containsKey(Object)>
	//*  12   26:ifeq            83
		{
			for(Iterator iterator = ((Map)RepoManager.access$000(RepoManager.this).get(((Object) (val$ctx)))).values().iterator(); iterator.hasNext(); ((Repo)iterator.next()).resume());
	//   13   29:aload_0         
	//   14   30:getfield        #19  <Field RepoManager this$0>
	//   15   33:invokestatic    #30  <Method Map RepoManager.access$000(RepoManager)>
	//   16   36:aload_0         
	//   17   37:getfield        #21  <Field Context val$ctx>
	//   18   40:invokeinterface #40  <Method Object Map.get(Object)>
	//   19   45:checkcast       #32  <Class Map>
	//   20   48:invokeinterface #44  <Method Collection Map.values()>
	//   21   53:invokeinterface #50  <Method Iterator Collection.iterator()>
	//   22   58:astore_2        
	//   23   59:aload_2         
	//   24   60:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//   25   65:ifeq            83
	//   26   68:aload_2         
	//   27   69:invokeinterface #60  <Method Object Iterator.next()>
	//   28   74:checkcast       #62  <Class Repo>
	//   29   77:invokevirtual   #65  <Method void Repo.resume()>
		}
	//*  30   80:goto            59
		map;
	//   31   83:aload_1         
		JVM INSTR monitorexit ;
	//   32   84:monitorexit     
		return;
	//   33   85:return          
		Exception exception;
		exception;
	//   34   86:astore_2        
		map;
	//   35   87:aload_1         
		JVM INSTR monitorexit ;
	//   36   88:monitorexit     
		throw exception;
	//   37   89:aload_2         
	//   38   90:athrow          
	}

	final RepoManager this$0;
	final Context val$ctx;

	RepoManager$4()
	{
		this$0 = final_repomanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RepoManager this$0>
		val$ctx = Context.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Context val$ctx>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
