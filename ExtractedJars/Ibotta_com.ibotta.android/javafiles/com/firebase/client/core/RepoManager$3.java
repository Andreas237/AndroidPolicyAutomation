// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			RepoManager, Repo, Context

class RepoManager$3
	implements Runnable
{

	public void run()
	{
		Map map = RepoManager.access$000(RepoManager.this);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RepoManager this$0>
	//    2    4:invokestatic    #30  <Method Map RepoManager.access$000(RepoManager)>
	//    3    7:astore_2        
		map;
	//    4    8:aload_2         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(!RepoManager.access$000(RepoManager.this).containsKey(((Object) (val$ctx)))) goto _L2; else goto _L1
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field RepoManager this$0>
	//    8   14:invokestatic    #30  <Method Map RepoManager.access$000(RepoManager)>
	//    9   17:aload_0         
	//   10   18:getfield        #21  <Field Context val$ctx>
	//   11   21:invokeinterface #36  <Method boolean Map.containsKey(Object)>
	//   12   26:ifeq            114
_L1:
		Iterator iterator = ((Map)RepoManager.access$000(RepoManager.this).get(((Object) (val$ctx)))).values().iterator();
	//   13   29:aload_0         
	//   14   30:getfield        #19  <Field RepoManager this$0>
	//   15   33:invokestatic    #30  <Method Map RepoManager.access$000(RepoManager)>
	//   16   36:aload_0         
	//   17   37:getfield        #21  <Field Context val$ctx>
	//   18   40:invokeinterface #40  <Method Object Map.get(Object)>
	//   19   45:checkcast       #32  <Class Map>
	//   20   48:invokeinterface #44  <Method Collection Map.values()>
	//   21   53:invokeinterface #50  <Method Iterator Collection.iterator()>
	//   22   58:astore_3        
		boolean flag = true;
	//   23   59:iconst_1        
	//   24   60:istore_1        
_L9:
		if(!iterator.hasNext()) goto _L4; else goto _L3
	//   25   61:aload_3         
	//   26   62:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//   27   67:ifeq            103
_L3:
		Repo repo;
		repo = (Repo)iterator.next();
	//   28   70:aload_3         
	//   29   71:invokeinterface #60  <Method Object Iterator.next()>
	//   30   76:checkcast       #62  <Class Repo>
	//   31   79:astore          4
		repo.interrupt();
	//   32   81:aload           4
	//   33   83:invokevirtual   #65  <Method void Repo.interrupt()>
		if(!flag) goto _L6; else goto _L5
	//   34   86:iload_1         
	//   35   87:ifeq            122
_L5:
		if(!repo.hasListeners())
	//*  36   90:aload           4
	//*  37   92:invokevirtual   #68  <Method boolean Repo.hasListeners()>
	//*  38   95:ifne            122
		{
			flag = true;
	//   39   98:iconst_1        
	//   40   99:istore_1        
			continue; /* Loop/switch isn't completed */
	//   41  100:goto            61
		}
		  goto _L6
_L4:
		if(!flag) goto _L2; else goto _L7
	//   42  103:iload_1         
	//   43  104:ifeq            114
_L7:
		val$ctx.stop();
	//   44  107:aload_0         
	//   45  108:getfield        #21  <Field Context val$ctx>
	//   46  111:invokevirtual   #73  <Method void Context.stop()>
_L2:
		map;
	//   47  114:aload_2         
		JVM INSTR monitorexit ;
	//   48  115:monitorexit     
		return;
	//   49  116:return          
		Exception exception;
		exception;
	//   50  117:astore_3        
		map;
	//   51  118:aload_2         
		JVM INSTR monitorexit ;
	//   52  119:monitorexit     
		throw exception;
	//   53  120:aload_3         
	//   54  121:athrow          
_L6:
		flag = false;
	//   55  122:iconst_0        
	//   56  123:istore_1        
		if(true) goto _L9; else goto _L8
	//   57  124:goto            61
_L8:
	}

	final RepoManager this$0;
	final Context val$ctx;

	RepoManager$3()
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
