// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.view.CacheNode;
import com.firebase.client.snapshot.*;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.firebase.client.core:
//			WriteTree, Path

public class WriteTreeRef
{

	public WriteTreeRef(Path path, WriteTree writetree)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		treePath = path;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Path treePath>
		writeTree = writetree;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field WriteTree writeTree>
	//    8   14:return          
	}

	public Node calcCompleteChild(ChildKey childkey, CacheNode cachenode)
	{
		return writeTree.calcCompleteChild(treePath, childkey, cachenode);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field WriteTree writeTree>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field Path treePath>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #25  <Method Node WriteTree.calcCompleteChild(Path, ChildKey, CacheNode)>
	//    7   13:areturn         
	}

	public Node calcCompleteEventCache(Node node)
	{
		return calcCompleteEventCache(node, Collections.emptyList());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #33  <Method List Collections.emptyList()>
	//    3    5:invokevirtual   #36  <Method Node calcCompleteEventCache(Node, List)>
	//    4    8:areturn         
	}

	public Node calcCompleteEventCache(Node node, List list)
	{
		return calcCompleteEventCache(node, list, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #39  <Method Node calcCompleteEventCache(Node, List, boolean)>
	//    5    7:areturn         
	}

	public Node calcCompleteEventCache(Node node, List list, boolean flag)
	{
		return writeTree.calcCompleteEventCache(treePath, node, list, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field WriteTree writeTree>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field Path treePath>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #44  <Method Node WriteTree.calcCompleteEventCache(Path, Node, List, boolean)>
	//    8   14:areturn         
	}

	public Node calcCompleteEventChildren(Node node)
	{
		return writeTree.calcCompleteEventChildren(treePath, node);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field WriteTree writeTree>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field Path treePath>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #49  <Method Node WriteTree.calcCompleteEventChildren(Path, Node)>
	//    6   12:areturn         
	}

	public Node calcEventCacheAfterServerOverwrite(Path path, Node node, Node node1)
	{
		return writeTree.calcEventCacheAfterServerOverwrite(treePath, path, node, node1);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field WriteTree writeTree>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field Path treePath>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #54  <Method Node WriteTree.calcEventCacheAfterServerOverwrite(Path, Path, Node, Node)>
	//    8   14:areturn         
	}

	public NamedNode calcNextNodeAfterPost(Node node, NamedNode namednode, boolean flag, Index index)
	{
		return writeTree.calcNextNodeAfterPost(treePath, node, namednode, flag, index);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field WriteTree writeTree>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field Path treePath>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokevirtual   #59  <Method NamedNode WriteTree.calcNextNodeAfterPost(Path, Node, NamedNode, boolean, Index)>
	//    9   16:areturn         
	}

	public WriteTreeRef child(ChildKey childkey)
	{
		return new WriteTreeRef(treePath.child(childkey), writeTree);
	//    0    0:new             #2   <Class WriteTreeRef>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field Path treePath>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #66  <Method Path Path.child(ChildKey)>
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field WriteTree writeTree>
	//    8   16:invokespecial   #68  <Method void WriteTreeRef(Path, WriteTree)>
	//    9   19:areturn         
	}

	public Node shadowingWrite(Path path)
	{
		return writeTree.shadowingWrite(treePath.child(path));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field WriteTree writeTree>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field Path treePath>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #73  <Method Path Path.child(Path)>
	//    6   12:invokevirtual   #75  <Method Node WriteTree.shadowingWrite(Path)>
	//    7   15:areturn         
	}

	private final Path treePath;
	private final WriteTree writeTree;
}
