// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.subst;


// Referenced classes of package ch.qos.logback.core.subst:
//			Node

static final class Node$Type extends Enum
{

	public static Node$Type valueOf(String s)
	{
		return (Node$Type)Enum.valueOf(ch/qos/logback/core/subst/Node$Type, s);
	//    0    0:ldc1            #2   <Class Node$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Node$Type>
	//    4    9:areturn         
	}

	public static Node$Type[] values()
	{
		return (Node$Type[])((Node$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field Node$Type[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lch.qos.logback.core.subst.Node$Type_3B_.clone()>
	//    2    6:checkcast       #38  <Class Node$Type[]>
	//    3    9:areturn         
	}

	private static final Node$Type $VALUES[];
	public static final Node$Type LITERAL;
	public static final Node$Type VARIABLE;

	static 
	{
		LITERAL = new Node$Type("LITERAL", 0);
	//    0    0:new             #2   <Class Node$Type>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "LITERAL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void Node$Type(String, int)>
	//    5   10:putstatic       #22  <Field Node$Type LITERAL>
		VARIABLE = new Node$Type("VARIABLE", 1);
	//    6   13:new             #2   <Class Node$Type>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "VARIABLE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void Node$Type(String, int)>
	//   11   23:putstatic       #25  <Field Node$Type VARIABLE>
		$VALUES = (new Node$Type[] {
			LITERAL, VARIABLE
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       Node$Type[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field Node$Type LITERAL>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field Node$Type VARIABLE>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field Node$Type[] $VALUES>
	//*  23   45:return          
	}

	private Node$Type(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
