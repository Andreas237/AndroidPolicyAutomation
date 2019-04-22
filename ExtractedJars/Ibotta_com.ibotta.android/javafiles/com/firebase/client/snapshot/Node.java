// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;

import com.firebase.client.core.Path;
import java.util.Iterator;

// Referenced classes of package com.firebase.client.snapshot:
//			ChildrenNode, ChildKey, EmptyNode

public interface Node
	extends Comparable, Iterable
{
	public static final class HashVersion extends Enum
	{

		public static HashVersion valueOf(String s)
		{
			return (HashVersion)Enum.valueOf(com/firebase/client/snapshot/Node$HashVersion, s);
		//    0    0:ldc1            #2   <Class Node$HashVersion>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Node$HashVersion>
		//    4    9:areturn         
		}

		public static HashVersion[] values()
		{
			return (HashVersion[])((HashVersion []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field Node$HashVersion[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.firebase.client.snapshot.Node$HashVersion_3B_.clone()>
		//    2    6:checkcast       #38  <Class Node$HashVersion[]>
		//    3    9:areturn         
		}

		private static final HashVersion $VALUES[];
		public static final HashVersion V1;
		public static final HashVersion V2;

		static 
		{
			V1 = new HashVersion("V1", 0);
		//    0    0:new             #2   <Class Node$HashVersion>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "V1">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void Node$HashVersion(String, int)>
		//    5   10:putstatic       #22  <Field Node$HashVersion V1>
			V2 = new HashVersion("V2", 1);
		//    6   13:new             #2   <Class Node$HashVersion>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "V2">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void Node$HashVersion(String, int)>
		//   11   23:putstatic       #25  <Field Node$HashVersion V2>
			$VALUES = (new HashVersion[] {
				V1, V2
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       HashVersion[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field Node$HashVersion V1>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field Node$HashVersion V2>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field Node$HashVersion[] $VALUES>
		//*  23   45:return          
		}

		private HashVersion(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract Node getChild(Path path);

	public abstract int getChildCount();

	public abstract String getHash();

	public abstract String getHashRepresentation(HashVersion hashversion);

	public abstract Node getImmediateChild(ChildKey childkey);

	public abstract ChildKey getPredecessorChildKey(ChildKey childkey);

	public abstract Node getPriority();

	public abstract ChildKey getSuccessorChildKey(ChildKey childkey);

	public abstract Object getValue();

	public abstract Object getValue(boolean flag);

	public abstract boolean hasChild(ChildKey childkey);

	public abstract boolean isEmpty();

	public abstract boolean isLeafNode();

	public abstract Iterator reverseIterator();

	public abstract Node updateChild(Path path, Node node);

	public abstract Node updateImmediateChild(ChildKey childkey, Node node);

	public abstract Node updatePriority(Node node);

	public static final ChildrenNode MAX_NODE = new ChildrenNode() {

		public int compareTo(Node node)
		{
			return node != this ? 1 : 0;
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:if_acmpne       7
		//    3    5:iconst_0        
		//    4    6:ireturn         
		//    5    7:iconst_1        
		//    6    8:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((Node)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #6   <Class Node>
		//    3    5:invokevirtual   #16  <Method int compareTo(Node)>
		//    4    8:ireturn         
		}

		public boolean equals(Object obj)
		{
			return obj == this;
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:if_acmpne       7
		//    3    5:iconst_1        
		//    4    6:ireturn         
		//    5    7:iconst_0        
		//    6    8:ireturn         
		}

		public Node getImmediateChild(ChildKey childkey)
		{
			if(childkey.isPriorityChildName())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #26  <Method boolean ChildKey.isPriorityChildName()>
		//*   2    4:ifeq            12
				return getPriority();
		//    3    7:aload_0         
		//    4    8:invokevirtual   #30  <Method Node getPriority()>
		//    5   11:areturn         
			else
				return ((Node) (EmptyNode.Empty()));
		//    6   12:invokestatic    #36  <Method EmptyNode EmptyNode.Empty()>
		//    7   15:areturn         
		}

		public Node getPriority()
		{
			return ((Node) (this));
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public boolean hasChild(ChildKey childkey)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isEmpty()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public String toString()
		{
			return "<Max Node>";
		//    0    0:ldc1            #43  <String "<Max Node>">
		//    1    2:areturn         
		}

	}
;

	/* static  */
	/* { */
	//    0    0:new             #11  <Class Node$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Node$1()>
	//    3    7:putstatic       #23  <Field ChildrenNode MAX_NODE>
	//*   4   10:return          
	/* } */
}
