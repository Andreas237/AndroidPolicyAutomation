// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.operation.AckUserWrite;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.core.utilities.ImmutableTree;
import com.firebase.client.utilities.Clock;
import java.util.*;
import java.util.concurrent.Callable;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, WriteTree, UserWriteRecord, ServerValues, 
//			Path, CompoundWrite

class SyncTree$3
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method List call()>
	//    2    4:areturn         
	}

	public List call()
	{
		if(val$persist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean val$persist>
	//*   2    4:ifeq            23
			SyncTree.access$200(SyncTree.this).removeUserWrite(val$writeId);
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field SyncTree this$0>
	//    5   11:invokestatic    #49  <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//    6   14:aload_0         
	//    7   15:getfield        #29  <Field long val$writeId>
	//    8   18:invokeinterface #55  <Method void PersistenceManager.removeUserWrite(long)>
		UserWriteRecord userwriterecord = SyncTree.access$300(SyncTree.this).getWrite(val$writeId);
	//    9   23:aload_0         
	//   10   24:getfield        #25  <Field SyncTree this$0>
	//   11   27:invokestatic    #59  <Method WriteTree SyncTree.access$300(SyncTree)>
	//   12   30:aload_0         
	//   13   31:getfield        #29  <Field long val$writeId>
	//   14   34:invokevirtual   #65  <Method UserWriteRecord WriteTree.getWrite(long)>
	//   15   37:astore          4
		boolean flag = SyncTree.access$300(SyncTree.this).removeWrite(val$writeId);
	//   16   39:aload_0         
	//   17   40:getfield        #25  <Field SyncTree this$0>
	//   18   43:invokestatic    #59  <Method WriteTree SyncTree.access$300(SyncTree)>
	//   19   46:aload_0         
	//   20   47:getfield        #29  <Field long val$writeId>
	//   21   50:invokevirtual   #69  <Method boolean WriteTree.removeWrite(long)>
	//   22   53:istore_1        
		if(userwriterecord.isVisible() && !val$revert)
	//*  23   54:aload           4
	//*  24   56:invokevirtual   #75  <Method boolean UserWriteRecord.isVisible()>
	//*  25   59:ifeq            144
	//*  26   62:aload_0         
	//*  27   63:getfield        #31  <Field boolean val$revert>
	//*  28   66:ifne            144
		{
			Object obj = ((Object) (ServerValues.generateServerValues(val$serverClock)));
	//   29   69:aload_0         
	//   30   70:getfield        #33  <Field Clock val$serverClock>
	//   31   73:invokestatic    #81  <Method java.util.Map ServerValues.generateServerValues(Clock)>
	//   32   76:astore_2        
			if(userwriterecord.isOverwrite())
	//*  33   77:aload           4
	//*  34   79:invokevirtual   #84  <Method boolean UserWriteRecord.isOverwrite()>
	//*  35   82:ifeq            116
			{
				obj = ((Object) (ServerValues.resolveDeferredValueSnapshot(userwriterecord.getOverwrite(), ((java.util.Map) (obj)))));
	//   36   85:aload           4
	//   37   87:invokevirtual   #88  <Method com.firebase.client.snapshot.Node UserWriteRecord.getOverwrite()>
	//   38   90:aload_2         
	//   39   91:invokestatic    #92  <Method com.firebase.client.snapshot.Node ServerValues.resolveDeferredValueSnapshot(com.firebase.client.snapshot.Node, java.util.Map)>
	//   40   94:astore_2        
				SyncTree.access$200(SyncTree.this).applyUserWriteToServerCache(userwriterecord.getPath(), ((com.firebase.client.snapshot.Node) (obj)));
	//   41   95:aload_0         
	//   42   96:getfield        #25  <Field SyncTree this$0>
	//   43   99:invokestatic    #49  <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//   44  102:aload           4
	//   45  104:invokevirtual   #96  <Method Path UserWriteRecord.getPath()>
	//   46  107:aload_2         
	//   47  108:invokeinterface #100 <Method void PersistenceManager.applyUserWriteToServerCache(Path, com.firebase.client.snapshot.Node)>
			} else
	//*  48  113:goto            144
			{
				obj = ((Object) (ServerValues.resolveDeferredValueMerge(userwriterecord.getMerge(), ((java.util.Map) (obj)))));
	//   49  116:aload           4
	//   50  118:invokevirtual   #104 <Method CompoundWrite UserWriteRecord.getMerge()>
	//   51  121:aload_2         
	//   52  122:invokestatic    #108 <Method CompoundWrite ServerValues.resolveDeferredValueMerge(CompoundWrite, java.util.Map)>
	//   53  125:astore_2        
				SyncTree.access$200(SyncTree.this).applyUserWriteToServerCache(userwriterecord.getPath(), ((CompoundWrite) (obj)));
	//   54  126:aload_0         
	//   55  127:getfield        #25  <Field SyncTree this$0>
	//   56  130:invokestatic    #49  <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//   57  133:aload           4
	//   58  135:invokevirtual   #96  <Method Path UserWriteRecord.getPath()>
	//   59  138:aload_2         
	//   60  139:invokeinterface #111 <Method void PersistenceManager.applyUserWriteToServerCache(Path, CompoundWrite)>
			}
		}
		if(!flag)
	//*  61  144:iload_1         
	//*  62  145:ifne            152
			return Collections.emptyList();
	//   63  148:invokestatic    #116 <Method List Collections.emptyList()>
	//   64  151:areturn         
		ImmutableTree immutabletree = ImmutableTree.emptyInstance();
	//   65  152:invokestatic    #122 <Method ImmutableTree ImmutableTree.emptyInstance()>
	//   66  155:astore_2        
		ImmutableTree immutabletree1;
		if(userwriterecord.isOverwrite())
	//*  67  156:aload           4
	//*  68  158:invokevirtual   #84  <Method boolean UserWriteRecord.isOverwrite()>
	//*  69  161:ifeq            179
		{
			immutabletree1 = immutabletree.set(Path.getEmptyPath(), ((Object) (Boolean.valueOf(true))));
	//   70  164:aload_2         
	//   71  165:invokestatic    #127 <Method Path Path.getEmptyPath()>
	//   72  168:iconst_1        
	//   73  169:invokestatic    #133 <Method Boolean Boolean.valueOf(boolean)>
	//   74  172:invokevirtual   #137 <Method ImmutableTree ImmutableTree.set(Path, Object)>
	//   75  175:astore_3        
		} else
	//*  76  176:goto            231
		{
			Iterator iterator = userwriterecord.getMerge().iterator();
	//   77  179:aload           4
	//   78  181:invokevirtual   #104 <Method CompoundWrite UserWriteRecord.getMerge()>
	//   79  184:invokevirtual   #143 <Method Iterator CompoundWrite.iterator()>
	//   80  187:astore          5
			do
			{
				immutabletree1 = immutabletree;
	//   81  189:aload_2         
	//   82  190:astore_3        
				if(!iterator.hasNext())
					break;
	//   83  191:aload           5
	//   84  193:invokeinterface #148 <Method boolean Iterator.hasNext()>
	//   85  198:ifeq            231
				immutabletree = immutabletree.set((Path)((java.util.Map.Entry)iterator.next()).getKey(), ((Object) (Boolean.valueOf(true))));
	//   86  201:aload_2         
	//   87  202:aload           5
	//   88  204:invokeinterface #151 <Method Object Iterator.next()>
	//   89  209:checkcast       #153 <Class java.util.Map$Entry>
	//   90  212:invokeinterface #156 <Method Object java.util.Map$Entry.getKey()>
	//   91  217:checkcast       #124 <Class Path>
	//   92  220:iconst_1        
	//   93  221:invokestatic    #133 <Method Boolean Boolean.valueOf(boolean)>
	//   94  224:invokevirtual   #137 <Method ImmutableTree ImmutableTree.set(Path, Object)>
	//   95  227:astore_2        
			} while(true);
	//   96  228:goto            189
		}
		return SyncTree.access$400(SyncTree.this, ((com.firebase.client.core.operation.Operation) (new AckUserWrite(userwriterecord.getPath(), immutabletree1, val$revert))));
	//   97  231:aload_0         
	//   98  232:getfield        #25  <Field SyncTree this$0>
	//   99  235:new             #158 <Class AckUserWrite>
	//  100  238:dup             
	//  101  239:aload           4
	//  102  241:invokevirtual   #96  <Method Path UserWriteRecord.getPath()>
	//  103  244:aload_3         
	//  104  245:aload_0         
	//  105  246:getfield        #31  <Field boolean val$revert>
	//  106  249:invokespecial   #161 <Method void AckUserWrite(Path, ImmutableTree, boolean)>
	//  107  252:invokestatic    #165 <Method List SyncTree.access$400(SyncTree, com.firebase.client.core.operation.Operation)>
	//  108  255:areturn         
	}

	final SyncTree this$0;
	final boolean val$persist;
	final boolean val$revert;
	final Clock val$serverClock;
	final long val$writeId;

	SyncTree$3()
	{
		this$0 = final_synctree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field SyncTree this$0>
		val$persist = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #27  <Field boolean val$persist>
		val$writeId = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #29  <Field long val$writeId>
		val$revert = flag1;
	//    9   15:aload_0         
	//   10   16:iload           5
	//   11   18:putfield        #31  <Field boolean val$revert>
		val$serverClock = Clock.this;
	//   12   21:aload_0         
	//   13   22:aload           6
	//   14   24:putfield        #33  <Field Clock val$serverClock>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #36  <Method void Object()>
	//   17   31:return          
	}
}
