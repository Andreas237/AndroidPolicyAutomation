// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;


// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Page

public static final class Page$ResourceType extends Enum
{

	public static Page$ResourceType valueOf(String s)
	{
		return (Page$ResourceType)Enum.valueOf(com/facebook/stetho/inspector/protocol/module/Page$ResourceType, s);
	//    0    0:ldc1            #2   <Class Page$ResourceType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #80  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Page$ResourceType>
	//    4    9:areturn         
	}

	public static Page$ResourceType[] values()
	{
		return (Page$ResourceType[])((Page$ResourceType []) ($VALUES)).clone();
	//    0    0:getstatic       #67  <Field Page$ResourceType[] $VALUES>
	//    1    3:invokevirtual   #87  <Method Object _5B_Lcom.facebook.stetho.inspector.protocol.module.Page$ResourceType_3B_.clone()>
	//    2    6:checkcast       #83  <Class Page$ResourceType[]>
	//    3    9:areturn         
	}

	public String getProtocolValue()
	{
		return mProtocolValue;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String mProtocolValue>
	//    2    4:areturn         
	}

	private static final Page$ResourceType $VALUES[];
	public static final Page$ResourceType DOCUMENT;
	public static final Page$ResourceType FONT;
	public static final Page$ResourceType IMAGE;
	public static final Page$ResourceType OTHER;
	public static final Page$ResourceType SCRIPT;
	public static final Page$ResourceType STYLESHEET;
	public static final Page$ResourceType WEBSOCKET;
	public static final Page$ResourceType XHR;
	private final String mProtocolValue;

	static 
	{
		DOCUMENT = new Page$ResourceType("DOCUMENT", 0, "Document");
	//    0    0:new             #2   <Class Page$ResourceType>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "DOCUMENT">
	//    3    6:iconst_0        
	//    4    7:ldc1            #26  <String "Document">
	//    5    9:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
	//    6   12:putstatic       #32  <Field Page$ResourceType DOCUMENT>
		STYLESHEET = new Page$ResourceType("STYLESHEET", 1, "Stylesheet");
	//    7   15:new             #2   <Class Page$ResourceType>
	//    8   18:dup             
	//    9   19:ldc1            #33  <String "STYLESHEET">
	//   10   21:iconst_1        
	//   11   22:ldc1            #35  <String "Stylesheet">
	//   12   24:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
	//   13   27:putstatic       #37  <Field Page$ResourceType STYLESHEET>
		IMAGE = new Page$ResourceType("IMAGE", 2, "Image");
	//   14   30:new             #2   <Class Page$ResourceType>
	//   15   33:dup             
	//   16   34:ldc1            #38  <String "IMAGE">
	//   17   36:iconst_2        
	//   18   37:ldc1            #40  <String "Image">
	//   19   39:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
	//   20   42:putstatic       #42  <Field Page$ResourceType IMAGE>
		FONT = new Page$ResourceType("FONT", 3, "Font");
	//   21   45:new             #2   <Class Page$ResourceType>
	//   22   48:dup             
	//   23   49:ldc1            #43  <String "FONT">
	//   24   51:iconst_3        
	//   25   52:ldc1            #45  <String "Font">
	//   26   54:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
	//   27   57:putstatic       #47  <Field Page$ResourceType FONT>
		SCRIPT = new Page$ResourceType("SCRIPT", 4, "Script");
	//   28   60:new             #2   <Class Page$ResourceType>
	//   29   63:dup             
	//   30   64:ldc1            #48  <String "SCRIPT">
	//   31   66:iconst_4        
	//   32   67:ldc1            #50  <String "Script">
	//   33   69:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
	//   34   72:putstatic       #52  <Field Page$ResourceType SCRIPT>
		XHR = new Page$ResourceType("XHR", 5, "XHR");
	//   35   75:new             #2   <Class Page$ResourceType>
	//   36   78:dup             
	//   37   79:ldc1            #53  <String "XHR">
	//   38   81:iconst_5        
	//   39   82:ldc1            #53  <String "XHR">
	//   40   84:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
	//   41   87:putstatic       #55  <Field Page$ResourceType XHR>
		WEBSOCKET = new Page$ResourceType("WEBSOCKET", 6, "WebSocket");
	//   42   90:new             #2   <Class Page$ResourceType>
	//   43   93:dup             
	//   44   94:ldc1            #56  <String "WEBSOCKET">
	//   45   96:bipush          6
	//   46   98:ldc1            #58  <String "WebSocket">
	//   47  100:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
	//   48  103:putstatic       #60  <Field Page$ResourceType WEBSOCKET>
		OTHER = new Page$ResourceType("OTHER", 7, "Other");
	//   49  106:new             #2   <Class Page$ResourceType>
	//   50  109:dup             
	//   51  110:ldc1            #61  <String "OTHER">
	//   52  112:bipush          7
	//   53  114:ldc1            #63  <String "Other">
	//   54  116:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
	//   55  119:putstatic       #65  <Field Page$ResourceType OTHER>
		$VALUES = (new Page$ResourceType[] {
			DOCUMENT, STYLESHEET, IMAGE, FONT, SCRIPT, XHR, WEBSOCKET, OTHER
		});
	//   56  122:bipush          8
	//   57  124:anewarray       Page$ResourceType[]
	//   58  127:dup             
	//   59  128:iconst_0        
	//   60  129:getstatic       #32  <Field Page$ResourceType DOCUMENT>
	//   61  132:aastore         
	//   62  133:dup             
	//   63  134:iconst_1        
	//   64  135:getstatic       #37  <Field Page$ResourceType STYLESHEET>
	//   65  138:aastore         
	//   66  139:dup             
	//   67  140:iconst_2        
	//   68  141:getstatic       #42  <Field Page$ResourceType IMAGE>
	//   69  144:aastore         
	//   70  145:dup             
	//   71  146:iconst_3        
	//   72  147:getstatic       #47  <Field Page$ResourceType FONT>
	//   73  150:aastore         
	//   74  151:dup             
	//   75  152:iconst_4        
	//   76  153:getstatic       #52  <Field Page$ResourceType SCRIPT>
	//   77  156:aastore         
	//   78  157:dup             
	//   79  158:iconst_5        
	//   80  159:getstatic       #55  <Field Page$ResourceType XHR>
	//   81  162:aastore         
	//   82  163:dup             
	//   83  164:bipush          6
	//   84  166:getstatic       #60  <Field Page$ResourceType WEBSOCKET>
	//   85  169:aastore         
	//   86  170:dup             
	//   87  171:bipush          7
	//   88  173:getstatic       #65  <Field Page$ResourceType OTHER>
	//   89  176:aastore         
	//   90  177:putstatic       #67  <Field Page$ResourceType[] $VALUES>
	//*  91  180:return          
	}

	private Page$ResourceType(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #71  <Method void Enum(String, int)>
		mProtocolValue = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #73  <Field String mProtocolValue>
	//    7   11:return          
	}
}
