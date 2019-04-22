// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;

import com.firebase.client.core.Path;
import java.util.Comparator;

// Referenced classes of package com.firebase.client.snapshot:
//			ValueIndex, KeyIndex, PathIndex, NamedNode, 
//			ChildKey, Node

public abstract class Index
	implements Comparator
{

	public Index()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Index fromQueryDefinition(String s)
	{
		if(s.equals(".value"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #16  <String ".value">
	//*   2    3:invokevirtual   #22  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            13
			return ((Index) (ValueIndex.getInstance()));
	//    4    9:invokestatic    #28  <Method ValueIndex ValueIndex.getInstance()>
	//    5   12:areturn         
		if(s.equals(".key"))
	//*   6   13:aload_0         
	//*   7   14:ldc1            #30  <String ".key">
	//*   8   16:invokevirtual   #22  <Method boolean String.equals(Object)>
	//*   9   19:ifeq            26
			return ((Index) (KeyIndex.getInstance()));
	//   10   22:invokestatic    #35  <Method KeyIndex KeyIndex.getInstance()>
	//   11   25:areturn         
		if(!s.equals(".priority"))
	//*  12   26:aload_0         
	//*  13   27:ldc1            #37  <String ".priority">
	//*  14   29:invokevirtual   #22  <Method boolean String.equals(Object)>
	//*  15   32:ifne            51
			return ((Index) (new PathIndex(new Path(s))));
	//   16   35:new             #39  <Class PathIndex>
	//   17   38:dup             
	//   18   39:new             #41  <Class Path>
	//   19   42:dup             
	//   20   43:aload_0         
	//   21   44:invokespecial   #44  <Method void Path(String)>
	//   22   47:invokespecial   #47  <Method void PathIndex(Path)>
	//   23   50:areturn         
		else
			throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
	//   24   51:new             #49  <Class IllegalStateException>
	//   25   54:dup             
	//   26   55:ldc1            #51  <String "queryDefinition shouldn't ever be .priority since it's the default">
	//   27   57:invokespecial   #52  <Method void IllegalStateException(String)>
	//   28   60:athrow          
	}

	public int compare(NamedNode namednode, NamedNode namednode1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            11
			return compare(((Object) (namednode1)), ((Object) (namednode)));
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #57  <Method int compare(Object, Object)>
	//    6   10:ireturn         
		else
			return compare(((Object) (namednode)), ((Object) (namednode1)));
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #57  <Method int compare(Object, Object)>
	//   11   17:ireturn         
	}

	public abstract String getQueryDefinition();

	public boolean indexedValueChanged(Node node, Node node1)
	{
		return compare(((Object) (new NamedNode(ChildKey.getMinName(), node))), ((Object) (new NamedNode(ChildKey.getMinName(), node1)))) != 0;
	//    0    0:aload_0         
	//    1    1:new             #63  <Class NamedNode>
	//    2    4:dup             
	//    3    5:invokestatic    #69  <Method ChildKey ChildKey.getMinName()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #72  <Method void NamedNode(ChildKey, Node)>
	//    6   12:new             #63  <Class NamedNode>
	//    7   15:dup             
	//    8   16:invokestatic    #69  <Method ChildKey ChildKey.getMinName()>
	//    9   19:aload_2         
	//   10   20:invokespecial   #72  <Method void NamedNode(ChildKey, Node)>
	//   11   23:invokevirtual   #57  <Method int compare(Object, Object)>
	//   12   26:ifeq            31
	//   13   29:iconst_1        
	//   14   30:ireturn         
	//   15   31:iconst_0        
	//   16   32:ireturn         
	}

	public abstract boolean isDefinedOn(Node node);

	public abstract NamedNode makePost(ChildKey childkey, Node node);

	public abstract NamedNode maxPost();

	public NamedNode minPost()
	{
		return NamedNode.getMinNode();
	//    0    0:invokestatic    #82  <Method NamedNode NamedNode.getMinNode()>
	//    1    3:areturn         
	}
}
