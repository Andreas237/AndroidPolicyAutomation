// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.operation.OperationSource;
import com.firebase.client.core.operation.Overwrite;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.snapshot.Node;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, WriteTree, Path

class SyncTree$1
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method List call()>
	//    2    4:areturn         
	}

	public List call()
	{
		if(val$persist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field boolean val$persist>
	//*   2    4:ifeq            31
			SyncTree.access$200(SyncTree.this).saveUserOverwrite(val$path, val$newDataUnresolved, val$writeId);
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field SyncTree this$0>
	//    5   11:invokestatic    #56  <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//    6   14:aload_0         
	//    7   15:getfield        #32  <Field Path val$path>
	//    8   18:aload_0         
	//    9   19:getfield        #34  <Field Node val$newDataUnresolved>
	//   10   22:aload_0         
	//   11   23:getfield        #36  <Field long val$writeId>
	//   12   26:invokeinterface #62  <Method void PersistenceManager.saveUserOverwrite(Path, Node, long)>
		SyncTree.access$300(SyncTree.this).addOverwrite(val$path, val$newData, Long.valueOf(val$writeId), val$visible);
	//   13   31:aload_0         
	//   14   32:getfield        #28  <Field SyncTree this$0>
	//   15   35:invokestatic    #66  <Method WriteTree SyncTree.access$300(SyncTree)>
	//   16   38:aload_0         
	//   17   39:getfield        #32  <Field Path val$path>
	//   18   42:aload_0         
	//   19   43:getfield        #38  <Field Node val$newData>
	//   20   46:aload_0         
	//   21   47:getfield        #36  <Field long val$writeId>
	//   22   50:invokestatic    #72  <Method Long Long.valueOf(long)>
	//   23   53:aload_0         
	//   24   54:getfield        #40  <Field boolean val$visible>
	//   25   57:invokevirtual   #78  <Method void WriteTree.addOverwrite(Path, Node, Long, boolean)>
		if(!val$visible)
	//*  26   60:aload_0         
	//*  27   61:getfield        #40  <Field boolean val$visible>
	//*  28   64:ifne            71
			return Collections.emptyList();
	//   29   67:invokestatic    #83  <Method List Collections.emptyList()>
	//   30   70:areturn         
		else
			return SyncTree.access$400(SyncTree.this, ((com.firebase.client.core.operation.Operation) (new Overwrite(OperationSource.USER, val$path, val$newData))));
	//   31   71:aload_0         
	//   32   72:getfield        #28  <Field SyncTree this$0>
	//   33   75:new             #85  <Class Overwrite>
	//   34   78:dup             
	//   35   79:getstatic       #91  <Field OperationSource OperationSource.USER>
	//   36   82:aload_0         
	//   37   83:getfield        #32  <Field Path val$path>
	//   38   86:aload_0         
	//   39   87:getfield        #38  <Field Node val$newData>
	//   40   90:invokespecial   #94  <Method void Overwrite(OperationSource, Path, Node)>
	//   41   93:invokestatic    #98  <Method List SyncTree.access$400(SyncTree, com.firebase.client.core.operation.Operation)>
	//   42   96:areturn         
	}

	final SyncTree this$0;
	final Node val$newData;
	final Node val$newDataUnresolved;
	final Path val$path;
	final boolean val$persist;
	final boolean val$visible;
	final long val$writeId;

	SyncTree$1()
	{
		this$0 = final_synctree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field SyncTree this$0>
		val$persist = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #30  <Field boolean val$persist>
		val$path = path1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #32  <Field Path val$path>
		val$newDataUnresolved = node;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #34  <Field Node val$newDataUnresolved>
		val$writeId = l;
	//   12   21:aload_0         
	//   13   22:lload           5
	//   14   24:putfield        #36  <Field long val$writeId>
		val$newData = node1;
	//   15   27:aload_0         
	//   16   28:aload           7
	//   17   30:putfield        #38  <Field Node val$newData>
		val$visible = Z.this;
	//   18   33:aload_0         
	//   19   34:iload           8
	//   20   36:putfield        #40  <Field boolean val$visible>
		super();
	//   21   39:aload_0         
	//   22   40:invokespecial   #43  <Method void Object()>
	//   23   43:return          
	}
}
