// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.android;

import com.firebase.client.core.Path;
import com.firebase.client.core.utilities.ImmutableTree;
import com.firebase.client.snapshot.Node;
import com.firebase.client.utilities.Pair;
import java.util.List;

// Referenced classes of package com.firebase.client.android:
//			SqlPersistenceStorageEngine

class SqlPersistenceStorageEngine$2
	implements com.firebase.client.core.utilities.ImmutableTree.TreeVisitor
{

	public volatile Object onNodeValue(Path path, Object obj, Object obj1)
	{
		return ((Object) (onNodeValue(path, (Void)obj, (Void)obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #42  <Class Void>
	//    4    6:aload_3         
	//    5    7:checkcast       #42  <Class Void>
	//    6   10:invokevirtual   #45  <Method Void onNodeValue(Path, Void, Void)>
	//    7   13:areturn         
	}

	public Void onNodeValue(Path path, Void void1, Void void2)
	{
		if(val$rowIdsToKeep.get(path) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field ImmutableTree val$rowIdsToKeep>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #51  <Method Object ImmutableTree.get(Path)>
	//*   4    8:ifnonnull       46
			val$rowsToResaveAccumulator.add(((Object) (new Pair(((Object) (val$relativePath.child(path))), ((Object) (val$currentNode.getChild(path)))))));
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field List val$rowsToResaveAccumulator>
	//    7   15:new             #53  <Class Pair>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:getfield        #32  <Field Path val$relativePath>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #59  <Method Path Path.child(Path)>
	//   13   27:aload_0         
	//   14   28:getfield        #34  <Field Node val$currentNode>
	//   15   31:aload_1         
	//   16   32:invokeinterface #65  <Method Node Node.getChild(Path)>
	//   17   37:invokespecial   #68  <Method void Pair(Object, Object)>
	//   18   40:invokeinterface #74  <Method boolean List.add(Object)>
	//   19   45:pop             
		return null;
	//   20   46:aconst_null     
	//   21   47:areturn         
	}

	final SqlPersistenceStorageEngine this$0;
	final Node val$currentNode;
	final Path val$relativePath;
	final ImmutableTree val$rowIdsToKeep;
	final List val$rowsToResaveAccumulator;

	SqlPersistenceStorageEngine$2()
	{
		this$0 = final_sqlpersistencestorageengine;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field SqlPersistenceStorageEngine this$0>
		val$rowIdsToKeep = immutabletree;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field ImmutableTree val$rowIdsToKeep>
		val$rowsToResaveAccumulator = list;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field List val$rowsToResaveAccumulator>
		val$relativePath = path;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field Path val$relativePath>
		val$currentNode = Node.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #34  <Field Node val$currentNode>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #37  <Method void Object()>
	//   17   31:return          
	}
}
