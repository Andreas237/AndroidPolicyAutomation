// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;


// Referenced classes of package com.firebase.client.snapshot:
//			Node

public static final class Node$HashVersion extends Enum
{

	public static Node$HashVersion valueOf(String s)
	{
		return (Node$HashVersion)Enum.valueOf(com/firebase/client/snapshot/Node$HashVersion, s);
	//    0    0:ldc1            #2   <Class Node$HashVersion>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Node$HashVersion>
	//    4    9:areturn         
	}

	public static Node$HashVersion[] values()
	{
		return (Node$HashVersion[])((Node$HashVersion []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field Node$HashVersion[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.firebase.client.snapshot.Node$HashVersion_3B_.clone()>
	//    2    6:checkcast       #38  <Class Node$HashVersion[]>
	//    3    9:areturn         
	}

	private static final Node$HashVersion $VALUES[];
	public static final Node$HashVersion V1;
	public static final Node$HashVersion V2;

	static 
	{
		V1 = new Node$HashVersion("V1", 0);
	//    0    0:new             #2   <Class Node$HashVersion>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "V1">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void Node$HashVersion(String, int)>
	//    5   10:putstatic       #22  <Field Node$HashVersion V1>
		V2 = new Node$HashVersion("V2", 1);
	//    6   13:new             #2   <Class Node$HashVersion>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "V2">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void Node$HashVersion(String, int)>
	//   11   23:putstatic       #25  <Field Node$HashVersion V2>
		$VALUES = (new Node$HashVersion[] {
			V1, V2
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       Node$HashVersion[]
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

	private Node$HashVersion(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
