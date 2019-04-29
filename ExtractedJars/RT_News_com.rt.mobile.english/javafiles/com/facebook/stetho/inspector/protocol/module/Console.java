// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import org.json.JSONObject;

public class Console
	implements ChromeDevtoolsDomain
{
	public static class CallFrame
	{

		public int columnNumber;
		public String functionName;
		public int lineNumber;
		public String url;

		public CallFrame()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:return          
		}

		public CallFrame(String s, String s1, int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			functionName = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #28  <Field String functionName>
			url = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #30  <Field String url>
			lineNumber = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #32  <Field int lineNumber>
			columnNumber = j;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #34  <Field int columnNumber>
		//   14   25:return          
		}
	}

	public static class ConsoleMessage
	{

		public MessageLevel level;
		public MessageSource source;
		public String text;

		public ConsoleMessage()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class MessageAddedRequest
	{

		public ConsoleMessage message;

		public MessageAddedRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class MessageLevel extends Enum
	{

		public static MessageLevel valueOf(String s)
		{
			return (MessageLevel)Enum.valueOf(com/facebook/stetho/inspector/protocol/module/Console$MessageLevel, s);
		//    0    0:ldc1            #2   <Class Console$MessageLevel>
		//    1    2:aload_0         
		//    2    3:invokestatic    #58  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Console$MessageLevel>
		//    4    9:areturn         
		}

		public static MessageLevel[] values()
		{
			return (MessageLevel[])((MessageLevel []) ($VALUES)).clone();
		//    0    0:getstatic       #45  <Field Console$MessageLevel[] $VALUES>
		//    1    3:invokevirtual   #65  <Method Object _5B_Lcom.facebook.stetho.inspector.protocol.module.Console$MessageLevel_3B_.clone()>
		//    2    6:checkcast       #61  <Class Console$MessageLevel[]>
		//    3    9:areturn         
		}

		public String getProtocolValue()
		{
			return mProtocolValue;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field String mProtocolValue>
		//    2    4:areturn         
		}

		private static final MessageLevel $VALUES[];
		public static final MessageLevel DEBUG;
		public static final MessageLevel ERROR;
		public static final MessageLevel LOG;
		public static final MessageLevel WARNING;
		private final String mProtocolValue;

		static 
		{
			LOG = new MessageLevel("LOG", 0, "log");
		//    0    0:new             #2   <Class Console$MessageLevel>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "LOG">
		//    3    6:iconst_0        
		//    4    7:ldc1            #22  <String "log">
		//    5    9:invokespecial   #26  <Method void Console$MessageLevel(String, int, String)>
		//    6   12:putstatic       #28  <Field Console$MessageLevel LOG>
			WARNING = new MessageLevel("WARNING", 1, "warning");
		//    7   15:new             #2   <Class Console$MessageLevel>
		//    8   18:dup             
		//    9   19:ldc1            #29  <String "WARNING">
		//   10   21:iconst_1        
		//   11   22:ldc1            #31  <String "warning">
		//   12   24:invokespecial   #26  <Method void Console$MessageLevel(String, int, String)>
		//   13   27:putstatic       #33  <Field Console$MessageLevel WARNING>
			ERROR = new MessageLevel("ERROR", 2, "error");
		//   14   30:new             #2   <Class Console$MessageLevel>
		//   15   33:dup             
		//   16   34:ldc1            #34  <String "ERROR">
		//   17   36:iconst_2        
		//   18   37:ldc1            #36  <String "error">
		//   19   39:invokespecial   #26  <Method void Console$MessageLevel(String, int, String)>
		//   20   42:putstatic       #38  <Field Console$MessageLevel ERROR>
			DEBUG = new MessageLevel("DEBUG", 3, "debug");
		//   21   45:new             #2   <Class Console$MessageLevel>
		//   22   48:dup             
		//   23   49:ldc1            #39  <String "DEBUG">
		//   24   51:iconst_3        
		//   25   52:ldc1            #41  <String "debug">
		//   26   54:invokespecial   #26  <Method void Console$MessageLevel(String, int, String)>
		//   27   57:putstatic       #43  <Field Console$MessageLevel DEBUG>
			$VALUES = (new MessageLevel[] {
				LOG, WARNING, ERROR, DEBUG
			});
		//   28   60:iconst_4        
		//   29   61:anewarray       MessageLevel[]
		//   30   64:dup             
		//   31   65:iconst_0        
		//   32   66:getstatic       #28  <Field Console$MessageLevel LOG>
		//   33   69:aastore         
		//   34   70:dup             
		//   35   71:iconst_1        
		//   36   72:getstatic       #33  <Field Console$MessageLevel WARNING>
		//   37   75:aastore         
		//   38   76:dup             
		//   39   77:iconst_2        
		//   40   78:getstatic       #38  <Field Console$MessageLevel ERROR>
		//   41   81:aastore         
		//   42   82:dup             
		//   43   83:iconst_3        
		//   44   84:getstatic       #43  <Field Console$MessageLevel DEBUG>
		//   45   87:aastore         
		//   46   88:putstatic       #45  <Field Console$MessageLevel[] $VALUES>
		//*  47   91:return          
		}

		private MessageLevel(String s, int i, String s1)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #49  <Method void Enum(String, int)>
			mProtocolValue = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #51  <Field String mProtocolValue>
		//    7   11:return          
		}
	}

	public static final class MessageSource extends Enum
	{

		public static MessageSource valueOf(String s)
		{
			return (MessageSource)Enum.valueOf(com/facebook/stetho/inspector/protocol/module/Console$MessageSource, s);
		//    0    0:ldc1            #2   <Class Console$MessageSource>
		//    1    2:aload_0         
		//    2    3:invokestatic    #94  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Console$MessageSource>
		//    4    9:areturn         
		}

		public static MessageSource[] values()
		{
			return (MessageSource[])((MessageSource []) ($VALUES)).clone();
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

		private static final MessageSource $VALUES[];
		public static final MessageSource APPCACHE;
		public static final MessageSource CONSOLE_API;
		public static final MessageSource CSS;
		public static final MessageSource JAVASCRIPT;
		public static final MessageSource NETWORK;
		public static final MessageSource OTHER;
		public static final MessageSource RENDERING;
		public static final MessageSource SECURITY;
		public static final MessageSource STORAGE;
		public static final MessageSource XML;
		private final String mProtocolValue;

		static 
		{
			XML = new MessageSource("XML", 0, "xml");
		//    0    0:new             #2   <Class Console$MessageSource>
		//    1    3:dup             
		//    2    4:ldc1            #26  <String "XML">
		//    3    6:iconst_0        
		//    4    7:ldc1            #28  <String "xml">
		//    5    9:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
		//    6   12:putstatic       #34  <Field Console$MessageSource XML>
			JAVASCRIPT = new MessageSource("JAVASCRIPT", 1, "javascript");
		//    7   15:new             #2   <Class Console$MessageSource>
		//    8   18:dup             
		//    9   19:ldc1            #35  <String "JAVASCRIPT">
		//   10   21:iconst_1        
		//   11   22:ldc1            #37  <String "javascript">
		//   12   24:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
		//   13   27:putstatic       #39  <Field Console$MessageSource JAVASCRIPT>
			NETWORK = new MessageSource("NETWORK", 2, "network");
		//   14   30:new             #2   <Class Console$MessageSource>
		//   15   33:dup             
		//   16   34:ldc1            #40  <String "NETWORK">
		//   17   36:iconst_2        
		//   18   37:ldc1            #42  <String "network">
		//   19   39:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
		//   20   42:putstatic       #44  <Field Console$MessageSource NETWORK>
			CONSOLE_API = new MessageSource("CONSOLE_API", 3, "console-api");
		//   21   45:new             #2   <Class Console$MessageSource>
		//   22   48:dup             
		//   23   49:ldc1            #45  <String "CONSOLE_API">
		//   24   51:iconst_3        
		//   25   52:ldc1            #47  <String "console-api">
		//   26   54:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
		//   27   57:putstatic       #49  <Field Console$MessageSource CONSOLE_API>
			STORAGE = new MessageSource("STORAGE", 4, "storage");
		//   28   60:new             #2   <Class Console$MessageSource>
		//   29   63:dup             
		//   30   64:ldc1            #50  <String "STORAGE">
		//   31   66:iconst_4        
		//   32   67:ldc1            #52  <String "storage">
		//   33   69:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
		//   34   72:putstatic       #54  <Field Console$MessageSource STORAGE>
			APPCACHE = new MessageSource("APPCACHE", 5, "appcache");
		//   35   75:new             #2   <Class Console$MessageSource>
		//   36   78:dup             
		//   37   79:ldc1            #55  <String "APPCACHE">
		//   38   81:iconst_5        
		//   39   82:ldc1            #57  <String "appcache">
		//   40   84:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
		//   41   87:putstatic       #59  <Field Console$MessageSource APPCACHE>
			RENDERING = new MessageSource("RENDERING", 6, "rendering");
		//   42   90:new             #2   <Class Console$MessageSource>
		//   43   93:dup             
		//   44   94:ldc1            #60  <String "RENDERING">
		//   45   96:bipush          6
		//   46   98:ldc1            #62  <String "rendering">
		//   47  100:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
		//   48  103:putstatic       #64  <Field Console$MessageSource RENDERING>
			CSS = new MessageSource("CSS", 7, "css");
		//   49  106:new             #2   <Class Console$MessageSource>
		//   50  109:dup             
		//   51  110:ldc1            #65  <String "CSS">
		//   52  112:bipush          7
		//   53  114:ldc1            #67  <String "css">
		//   54  116:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
		//   55  119:putstatic       #69  <Field Console$MessageSource CSS>
			SECURITY = new MessageSource("SECURITY", 8, "security");
		//   56  122:new             #2   <Class Console$MessageSource>
		//   57  125:dup             
		//   58  126:ldc1            #70  <String "SECURITY">
		//   59  128:bipush          8
		//   60  130:ldc1            #72  <String "security">
		//   61  132:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
		//   62  135:putstatic       #74  <Field Console$MessageSource SECURITY>
			OTHER = new MessageSource("OTHER", 9, "other");
		//   63  138:new             #2   <Class Console$MessageSource>
		//   64  141:dup             
		//   65  142:ldc1            #75  <String "OTHER">
		//   66  144:bipush          9
		//   67  146:ldc1            #77  <String "other">
		//   68  148:invokespecial   #32  <Method void Console$MessageSource(String, int, String)>
		//   69  151:putstatic       #79  <Field Console$MessageSource OTHER>
			$VALUES = (new MessageSource[] {
				XML, JAVASCRIPT, NETWORK, CONSOLE_API, STORAGE, APPCACHE, RENDERING, CSS, SECURITY, OTHER
			});
		//   70  154:bipush          10
		//   71  156:anewarray       MessageSource[]
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

		private MessageSource(String s, int i, String s1)
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


	public Console()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public void disable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}

	public void enable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}
}