// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;


// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Network

public static final class Network$InitiatorType extends Enum
{

	public static Network$InitiatorType valueOf(String s)
	{
		return (Network$InitiatorType)Enum.valueOf(com/facebook/stetho/inspector/protocol/module/Network$InitiatorType, s);
	//    0    0:ldc1            #2   <Class Network$InitiatorType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Network$InitiatorType>
	//    4    9:areturn         
	}

	public static Network$InitiatorType[] values()
	{
		return (Network$InitiatorType[])((Network$InitiatorType []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field Network$InitiatorType[] $VALUES>
	//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.facebook.stetho.inspector.protocol.module.Network$InitiatorType_3B_.clone()>
	//    2    6:checkcast       #55  <Class Network$InitiatorType[]>
	//    3    9:areturn         
	}

	public String getProtocolValue()
	{
		return mProtocolValue;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String mProtocolValue>
	//    2    4:areturn         
	}

	private static final Network$InitiatorType $VALUES[];
	public static final Network$InitiatorType OTHER;
	public static final Network$InitiatorType PARSER;
	public static final Network$InitiatorType SCRIPT;
	private final String mProtocolValue;

	static 
	{
		PARSER = new Network$InitiatorType("PARSER", 0, "parser");
	//    0    0:new             #2   <Class Network$InitiatorType>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "PARSER">
	//    3    6:iconst_0        
	//    4    7:ldc1            #21  <String "parser">
	//    5    9:invokespecial   #25  <Method void Network$InitiatorType(String, int, String)>
	//    6   12:putstatic       #27  <Field Network$InitiatorType PARSER>
		SCRIPT = new Network$InitiatorType("SCRIPT", 1, "script");
	//    7   15:new             #2   <Class Network$InitiatorType>
	//    8   18:dup             
	//    9   19:ldc1            #28  <String "SCRIPT">
	//   10   21:iconst_1        
	//   11   22:ldc1            #30  <String "script">
	//   12   24:invokespecial   #25  <Method void Network$InitiatorType(String, int, String)>
	//   13   27:putstatic       #32  <Field Network$InitiatorType SCRIPT>
		OTHER = new Network$InitiatorType("OTHER", 2, "other");
	//   14   30:new             #2   <Class Network$InitiatorType>
	//   15   33:dup             
	//   16   34:ldc1            #33  <String "OTHER">
	//   17   36:iconst_2        
	//   18   37:ldc1            #35  <String "other">
	//   19   39:invokespecial   #25  <Method void Network$InitiatorType(String, int, String)>
	//   20   42:putstatic       #37  <Field Network$InitiatorType OTHER>
		$VALUES = (new Network$InitiatorType[] {
			PARSER, SCRIPT, OTHER
		});
	//   21   45:iconst_3        
	//   22   46:anewarray       Network$InitiatorType[]
	//   23   49:dup             
	//   24   50:iconst_0        
	//   25   51:getstatic       #27  <Field Network$InitiatorType PARSER>
	//   26   54:aastore         
	//   27   55:dup             
	//   28   56:iconst_1        
	//   29   57:getstatic       #32  <Field Network$InitiatorType SCRIPT>
	//   30   60:aastore         
	//   31   61:dup             
	//   32   62:iconst_2        
	//   33   63:getstatic       #37  <Field Network$InitiatorType OTHER>
	//   34   66:aastore         
	//   35   67:putstatic       #39  <Field Network$InitiatorType[] $VALUES>
	//*  36   70:return          
	}

	private Network$InitiatorType(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #43  <Method void Enum(String, int)>
		mProtocolValue = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #45  <Field String mProtocolValue>
	//    7   11:return          
	}
}
