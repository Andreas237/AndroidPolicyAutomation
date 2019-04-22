// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;


// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Console

public static final class Console$MessageSource extends Enum
{

	public static Console$MessageSource valueOf(String s)
	{
		return (Console$MessageSource)Enum.valueOf(com/facebook/stetho/inspector/protocol/module/Console$MessageSource, s);
	//    0    0:ldc1            #2   <Class Console$MessageSource>
	//    1    2:aload_0         
	//    2    3:invokestatic    #94  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Console$MessageSource>
	//    4    9:areturn         
	}

	public static Console$MessageSource[] values()
	{
		return (Console$MessageSource[])((Console$MessageSource []) ($VALUES)).clone();
	//    0    0:getstatic       #81  <Field Console$MessageSource[] $VALUES>
	//    1    3:invokevirtual   #101 <Method Object _5B_Lcom.facebook.stetho.inspector.protocol.module.Console$MessageSource_3B_.clone()>
	//    2    6:checkcast       #97  <Class Console$MessageSource[]>
	//    3    9:areturn         
	}

	public String getProtocolValue()
	{
		return mProtocolValue;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field String mProtocolValue>
	//    2    4:areturn         
	}

	private static final Console$MessageSource $VALUES[];
	public static final Console$MessageSource APPCACHE;
	public static final Console$MessageSource CONSOLE_API;
	public static final Console$MessageSource CSS;
	public static final Console$MessageSource JAVASCRIPT;
	public static final Console$MessageSource NETWORK;
	public static final Console$MessageSource OTHER;
	public static final Console$MessageSource RENDERING;
	public static final Console$MessageSource SECURITY;
	public static final Console$MessageSource STORAGE;
	public static final Console$MessageSource XML;
	private final String mProtocolValue;

	static 
	{
		XML = new Console$MessageSource("XML", 0, "xml");
	//    0    0:new             #2   <Class Console$MessageSource>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "XML">
	//    3    6:iconst_0        
	//    4    7:ldc1            #28  <String "xml">
	//    5    9:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
	//    6   12:putstatic       #34  <Field Console$MessageSource XML>
		JAVASCRIPT = new Console$MessageSource("JAVASCRIPT", 1, "javascript");
	//    7   15:new             #2   <Class Console$MessageSource>
	//    8   18:dup             
	//    9   19:ldc1            #35  <String "JAVASCRIPT">
	//   10   21:iconst_1        
	//   11   22:ldc1            #37  <String "javascript">
	//   12   24:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
	//   13   27:putstatic       #39  <Field Console$MessageSource JAVASCRIPT>
		NETWORK = new Console$MessageSource("NETWORK", 2, "network");
	//   14   30:new             #2   <Class Console$MessageSource>
	//   15   33:dup             
	//   16   34:ldc1            #40  <String "NETWORK">
	//   17   36:iconst_2        
	//   18   37:ldc1            #42  <String "network">
	//   19   39:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
	//   20   42:putstatic       #44  <Field Console$MessageSource NETWORK>
		CONSOLE_API = new Console$MessageSource("CONSOLE_API", 3, "console-api");
	//   21   45:new             #2   <Class Console$MessageSource>
	//   22   48:dup             
	//   23   49:ldc1            #45  <String "CONSOLE_API">
	//   24   51:iconst_3        
	//   25   52:ldc1            #47  <String "console-api">
	//   26   54:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
	//   27   57:putstatic       #49  <Field Console$MessageSource CONSOLE_API>
		STORAGE = new Console$MessageSource("STORAGE", 4, "storage");
	//   28   60:new             #2   <Class Console$MessageSource>
	//   29   63:dup             
	//   30   64:ldc1            #50  <String "STORAGE">
	//   31   66:iconst_4        
	//   32   67:ldc1            #52  <String "storage">
	//   33   69:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
	//   34   72:putstatic       #54  <Field Console$MessageSource STORAGE>
		APPCACHE = new Console$MessageSource("APPCACHE", 5, "appcache");
	//   35   75:new             #2   <Class Console$MessageSource>
	//   36   78:dup             
	//   37   79:ldc1            #55  <String "APPCACHE">
	//   38   81:iconst_5        
	//   39   82:ldc1            #57  <String "appcache">
	//   40   84:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
	//   41   87:putstatic       #59  <Field Console$MessageSource APPCACHE>
		RENDERING = new Console$MessageSource("RENDERING", 6, "rendering");
	//   42   90:new             #2   <Class Console$MessageSource>
	//   43   93:dup             
	//   44   94:ldc1            #60  <String "RENDERING">
	//   45   96:bipush          6
	//   46   98:ldc1            #62  <String "rendering">
	//   47  100:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
	//   48  103:putstatic       #64  <Field Console$MessageSource RENDERING>
		CSS = new Console$MessageSource("CSS", 7, "css");
	//   49  106:new             #2   <Class Console$MessageSource>
	//   50  109:dup             
	//   51  110:ldc1            #65  <String "CSS">
	//   52  112:bipush          7
	//   53  114:ldc1            #67  <String "css">
	//   54  116:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
	//   55  119:putstatic       #69  <Field Console$MessageSource CSS>
		SECURITY = new Console$MessageSource("SECURITY", 8, "security");
	//   56  122:new             #2   <Class Console$MessageSource>
	//   57  125:dup             
	//   58  126:ldc1            #70  <String "SECURITY">
	//   59  128:bipush          8
	//   60  130:ldc1            #72  <String "security">
	//   61  132:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
	//   62  135:putstatic       #74  <Field Console$MessageSource SECURITY>
		OTHER = new Console$MessageSource("OTHER", 9, "other");
	//   63  138:new             #2   <Class Console$MessageSource>
	//   64  141:dup             
	//   65  142:ldc1            #75  <String "OTHER">
	//   66  144:bipush          9
	//   67  146:ldc1            #77  <String "other">
	//   68  148:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
	//   69  151:putstatic       #79  <Field Console$MessageSource OTHER>
		$VALUES = (new Console$MessageSource[] {
			XML, JAVASCRIPT, NETWORK, CONSOLE_API, STORAGE, APPCACHE, RENDERING, CSS, SECURITY, OTHER
		});
	//   70  154:bipush          10
	//   71  156:anewarray       Console$MessageSource[]
	//   72  159:dup             
	//   73  160:iconst_0        
	//   74  161:getstatic       #34  <Field Console$MessageSource XML>
	//   75  164:aastore         
	//   76  165:dup             
	//   77  166:iconst_1        
	//   78  167:getstatic       #39  <Field Console$MessageSource JAVASCRIPT>
	//   79  170:aastore         
	//   80  171:dup             
	//   81  172:iconst_2        
	//   82  173:getstatic       #44  <Field Console$MessageSource NETWORK>
	//   83  176:aastore         
	//   84  177:dup             
	//   85  178:iconst_3        
	//   86  179:getstatic       #49  <Field Console$MessageSource CONSOLE_API>
	//   87  182:aastore         
	//   88  183:dup             
	//   89  184:iconst_4        
	//   90  185:getstatic       #54  <Field Console$MessageSource STORAGE>
	//   91  188:aastore         
	//   92  189:dup             
	//   93  190:iconst_5        
	//   94  191:getstatic       #59  <Field Console$MessageSource APPCACHE>
	//   95  194:aastore         
	//   96  195:dup             
	//   97  196:bipush          6
	//   98  198:getstatic       #64  <Field Console$MessageSource RENDERING>
	//   99  201:aastore         
	//  100  202:dup             
	//  101  203:bipush          7
	//  102  205:getstatic       #69  <Field Console$MessageSource CSS>
	//  103  208:aastore         
	//  104  209:dup             
	//  105  210:bipush          8
	//  106  212:getstatic       #74  <Field Console$MessageSource SECURITY>
	//  107  215:aastore         
	//  108  216:dup             
	//  109  217:bipush          9
	//  110  219:getstatic       #79  <Field Console$MessageSource OTHER>
	//  111  222:aastore         
	//  112  223:putstatic       #81  <Field Console$MessageSource[] $VALUES>
	//* 113  226:return          
	}

	private Console$MessageSource(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #85  <Method void Enum(String, int)>
		mProtocolValue = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #87  <Field String mProtocolValue>
	//    7   11:return          
	}
}
