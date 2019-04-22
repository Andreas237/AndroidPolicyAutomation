// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;


public final class NodeType extends Enum
{

	private NodeType(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #50  <Method void Enum(String, int)>
		mValue = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #52  <Field int mValue>
	//    7   11:return          
	}

	public static NodeType valueOf(String s)
	{
		return (NodeType)Enum.valueOf(com/facebook/stetho/inspector/elements/NodeType, s);
	//    0    0:ldc1            #2   <Class NodeType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class NodeType>
	//    4    9:areturn         
	}

	public static NodeType[] values()
	{
		return (NodeType[])((NodeType []) ($VALUES)).clone();
	//    0    0:getstatic       #46  <Field NodeType[] $VALUES>
	//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.facebook.stetho.inspector.elements.NodeType_3B_.clone()>
	//    2    6:checkcast       #62  <Class NodeType[]>
	//    3    9:areturn         
	}

	public int getProtocolValue()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int mValue>
	//    2    4:ireturn         
	}

	private static final NodeType $VALUES[];
	public static final NodeType COMMENT_NODE;
	public static final NodeType DOCUMENT_FRAGMENT_NODE;
	public static final NodeType DOCUMENT_NODE;
	public static final NodeType DOCUMENT_TYPE_NODE;
	public static final NodeType ELEMENT_NODE;
	public static final NodeType PROCESSING_INSTRUCTION_NODE;
	public static final NodeType TEXT_NODE;
	private final int mValue;

	static 
	{
		ELEMENT_NODE = new NodeType("ELEMENT_NODE", 0, 1);
	//    0    0:new             #2   <Class NodeType>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "ELEMENT_NODE">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #24  <Method void NodeType(String, int, int)>
	//    6   11:putstatic       #26  <Field NodeType ELEMENT_NODE>
		TEXT_NODE = new NodeType("TEXT_NODE", 1, 3);
	//    7   14:new             #2   <Class NodeType>
	//    8   17:dup             
	//    9   18:ldc1            #27  <String "TEXT_NODE">
	//   10   20:iconst_1        
	//   11   21:iconst_3        
	//   12   22:invokespecial   #24  <Method void NodeType(String, int, int)>
	//   13   25:putstatic       #29  <Field NodeType TEXT_NODE>
		PROCESSING_INSTRUCTION_NODE = new NodeType("PROCESSING_INSTRUCTION_NODE", 2, 7);
	//   14   28:new             #2   <Class NodeType>
	//   15   31:dup             
	//   16   32:ldc1            #30  <String "PROCESSING_INSTRUCTION_NODE">
	//   17   34:iconst_2        
	//   18   35:bipush          7
	//   19   37:invokespecial   #24  <Method void NodeType(String, int, int)>
	//   20   40:putstatic       #32  <Field NodeType PROCESSING_INSTRUCTION_NODE>
		COMMENT_NODE = new NodeType("COMMENT_NODE", 3, 8);
	//   21   43:new             #2   <Class NodeType>
	//   22   46:dup             
	//   23   47:ldc1            #33  <String "COMMENT_NODE">
	//   24   49:iconst_3        
	//   25   50:bipush          8
	//   26   52:invokespecial   #24  <Method void NodeType(String, int, int)>
	//   27   55:putstatic       #35  <Field NodeType COMMENT_NODE>
		DOCUMENT_NODE = new NodeType("DOCUMENT_NODE", 4, 9);
	//   28   58:new             #2   <Class NodeType>
	//   29   61:dup             
	//   30   62:ldc1            #36  <String "DOCUMENT_NODE">
	//   31   64:iconst_4        
	//   32   65:bipush          9
	//   33   67:invokespecial   #24  <Method void NodeType(String, int, int)>
	//   34   70:putstatic       #38  <Field NodeType DOCUMENT_NODE>
		DOCUMENT_TYPE_NODE = new NodeType("DOCUMENT_TYPE_NODE", 5, 10);
	//   35   73:new             #2   <Class NodeType>
	//   36   76:dup             
	//   37   77:ldc1            #39  <String "DOCUMENT_TYPE_NODE">
	//   38   79:iconst_5        
	//   39   80:bipush          10
	//   40   82:invokespecial   #24  <Method void NodeType(String, int, int)>
	//   41   85:putstatic       #41  <Field NodeType DOCUMENT_TYPE_NODE>
		DOCUMENT_FRAGMENT_NODE = new NodeType("DOCUMENT_FRAGMENT_NODE", 6, 11);
	//   42   88:new             #2   <Class NodeType>
	//   43   91:dup             
	//   44   92:ldc1            #42  <String "DOCUMENT_FRAGMENT_NODE">
	//   45   94:bipush          6
	//   46   96:bipush          11
	//   47   98:invokespecial   #24  <Method void NodeType(String, int, int)>
	//   48  101:putstatic       #44  <Field NodeType DOCUMENT_FRAGMENT_NODE>
		$VALUES = (new NodeType[] {
			ELEMENT_NODE, TEXT_NODE, PROCESSING_INSTRUCTION_NODE, COMMENT_NODE, DOCUMENT_NODE, DOCUMENT_TYPE_NODE, DOCUMENT_FRAGMENT_NODE
		});
	//   49  104:bipush          7
	//   50  106:anewarray       NodeType[]
	//   51  109:dup             
	//   52  110:iconst_0        
	//   53  111:getstatic       #26  <Field NodeType ELEMENT_NODE>
	//   54  114:aastore         
	//   55  115:dup             
	//   56  116:iconst_1        
	//   57  117:getstatic       #29  <Field NodeType TEXT_NODE>
	//   58  120:aastore         
	//   59  121:dup             
	//   60  122:iconst_2        
	//   61  123:getstatic       #32  <Field NodeType PROCESSING_INSTRUCTION_NODE>
	//   62  126:aastore         
	//   63  127:dup             
	//   64  128:iconst_3        
	//   65  129:getstatic       #35  <Field NodeType COMMENT_NODE>
	//   66  132:aastore         
	//   67  133:dup             
	//   68  134:iconst_4        
	//   69  135:getstatic       #38  <Field NodeType DOCUMENT_NODE>
	//   70  138:aastore         
	//   71  139:dup             
	//   72  140:iconst_5        
	//   73  141:getstatic       #41  <Field NodeType DOCUMENT_TYPE_NODE>
	//   74  144:aastore         
	//   75  145:dup             
	//   76  146:bipush          6
	//   77  148:getstatic       #44  <Field NodeType DOCUMENT_FRAGMENT_NODE>
	//   78  151:aastore         
	//   79  152:putstatic       #46  <Field NodeType[] $VALUES>
	//*  80  155:return          
	}
}
