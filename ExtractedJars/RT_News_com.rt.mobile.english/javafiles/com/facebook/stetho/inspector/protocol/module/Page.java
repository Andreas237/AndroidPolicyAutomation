// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import android.content.Context;
import com.facebook.stetho.common.ProcessUtil;
import com.facebook.stetho.inspector.domstorage.SharedPreferencesHelper;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			SimpleBooleanResult

public class Page
	implements ChromeDevtoolsDomain
{
	private static class ExecutionContextCreatedParams
	{

		public ExecutionContextDescription context;

		private ExecutionContextCreatedParams()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class ExecutionContextDescription
	{

		public String frameId;
		public int id;

		private ExecutionContextDescription()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class Frame
	{

		public String id;
		public String loaderId;
		public String mimeType;
		public String name;
		public String parentId;
		public String securityOrigin;
		public String url;

		private Frame()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class FrameResourceTree
	{

		public List childFrames;
		public Frame frame;
		public List resources;

		private FrameResourceTree()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class GetResourceTreeParams
		implements JsonRpcResult
	{

		public FrameResourceTree frameTree;

		private GetResourceTreeParams()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class Resource
	{

		private Resource()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class ResourceType extends Enum
	{

		public static ResourceType valueOf(String s)
		{
			return (ResourceType)Enum.valueOf(com/facebook/stetho/inspector/protocol/module/Page$ResourceType, s);
		//    0    0:ldc1            #2   <Class Page$ResourceType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #80  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Page$ResourceType>
		//    4    9:areturn         
		}

		public static ResourceType[] values()
		{
			return (ResourceType[])((ResourceType []) ($VALUES)).clone();
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

		private static final ResourceType $VALUES[];
		public static final ResourceType DOCUMENT;
		public static final ResourceType FONT;
		public static final ResourceType IMAGE;
		public static final ResourceType OTHER;
		public static final ResourceType SCRIPT;
		public static final ResourceType STYLESHEET;
		public static final ResourceType WEBSOCKET;
		public static final ResourceType XHR;
		private final String mProtocolValue;

		static 
		{
			DOCUMENT = new ResourceType("DOCUMENT", 0, "Document");
		//    0    0:new             #2   <Class Page$ResourceType>
		//    1    3:dup             
		//    2    4:ldc1            #24  <String "DOCUMENT">
		//    3    6:iconst_0        
		//    4    7:ldc1            #26  <String "Document">
		//    5    9:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
		//    6   12:putstatic       #32  <Field Page$ResourceType DOCUMENT>
			STYLESHEET = new ResourceType("STYLESHEET", 1, "Stylesheet");
		//    7   15:new             #2   <Class Page$ResourceType>
		//    8   18:dup             
		//    9   19:ldc1            #33  <String "STYLESHEET">
		//   10   21:iconst_1        
		//   11   22:ldc1            #35  <String "Stylesheet">
		//   12   24:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
		//   13   27:putstatic       #37  <Field Page$ResourceType STYLESHEET>
			IMAGE = new ResourceType("IMAGE", 2, "Image");
		//   14   30:new             #2   <Class Page$ResourceType>
		//   15   33:dup             
		//   16   34:ldc1            #38  <String "IMAGE">
		//   17   36:iconst_2        
		//   18   37:ldc1            #40  <String "Image">
		//   19   39:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
		//   20   42:putstatic       #42  <Field Page$ResourceType IMAGE>
			FONT = new ResourceType("FONT", 3, "Font");
		//   21   45:new             #2   <Class Page$ResourceType>
		//   22   48:dup             
		//   23   49:ldc1            #43  <String "FONT">
		//   24   51:iconst_3        
		//   25   52:ldc1            #45  <String "Font">
		//   26   54:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
		//   27   57:putstatic       #47  <Field Page$ResourceType FONT>
			SCRIPT = new ResourceType("SCRIPT", 4, "Script");
		//   28   60:new             #2   <Class Page$ResourceType>
		//   29   63:dup             
		//   30   64:ldc1            #48  <String "SCRIPT">
		//   31   66:iconst_4        
		//   32   67:ldc1            #50  <String "Script">
		//   33   69:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
		//   34   72:putstatic       #52  <Field Page$ResourceType SCRIPT>
			XHR = new ResourceType("XHR", 5, "XHR");
		//   35   75:new             #2   <Class Page$ResourceType>
		//   36   78:dup             
		//   37   79:ldc1            #53  <String "XHR">
		//   38   81:iconst_5        
		//   39   82:ldc1            #53  <String "XHR">
		//   40   84:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
		//   41   87:putstatic       #55  <Field Page$ResourceType XHR>
			WEBSOCKET = new ResourceType("WEBSOCKET", 6, "WebSocket");
		//   42   90:new             #2   <Class Page$ResourceType>
		//   43   93:dup             
		//   44   94:ldc1            #56  <String "WEBSOCKET">
		//   45   96:bipush          6
		//   46   98:ldc1            #58  <String "WebSocket">
		//   47  100:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
		//   48  103:putstatic       #60  <Field Page$ResourceType WEBSOCKET>
			OTHER = new ResourceType("OTHER", 7, "Other");
		//   49  106:new             #2   <Class Page$ResourceType>
		//   50  109:dup             
		//   51  110:ldc1            #61  <String "OTHER">
		//   52  112:bipush          7
		//   53  114:ldc1            #63  <String "Other">
		//   54  116:invokespecial   #30  <Method void Page$ResourceType(String, int, String)>
		//   55  119:putstatic       #65  <Field Page$ResourceType OTHER>
			$VALUES = (new ResourceType[] {
				DOCUMENT, STYLESHEET, IMAGE, FONT, SCRIPT, XHR, WEBSOCKET, OTHER
			});
		//   56  122:bipush          8
		//   57  124:anewarray       ResourceType[]
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

		private ResourceType(String s, int i, String s1)
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


	public Page(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field Context mContext>
	//    5    9:return          
	}

	private static FrameResourceTree createSimpleFrameResourceTree(String s, String s1, String s2, String s3)
	{
		Frame frame = new Frame();
	//    0    0:new             #16  <Class Page$Frame>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #44  <Method void Page$Frame(Page$1)>
	//    4    8:astore          4
		frame.id = s;
	//    5   10:aload           4
	//    6   12:aload_0         
	//    7   13:putfield        #48  <Field String Page$Frame.id>
		frame.parentId = s1;
	//    8   16:aload           4
	//    9   18:aload_1         
	//   10   19:putfield        #51  <Field String Page$Frame.parentId>
		frame.loaderId = "1";
	//   11   22:aload           4
	//   12   24:ldc1            #53  <String "1">
	//   13   26:putfield        #56  <Field String Page$Frame.loaderId>
		frame.name = s2;
	//   14   29:aload           4
	//   15   31:aload_2         
	//   16   32:putfield        #59  <Field String Page$Frame.name>
		frame.url = "";
	//   17   35:aload           4
	//   18   37:ldc1            #61  <String "">
	//   19   39:putfield        #64  <Field String Page$Frame.url>
		frame.securityOrigin = s3;
	//   20   42:aload           4
	//   21   44:aload_3         
	//   22   45:putfield        #67  <Field String Page$Frame.securityOrigin>
		frame.mimeType = "text/plain";
	//   23   48:aload           4
	//   24   50:ldc1            #69  <String "text/plain">
	//   25   52:putfield        #72  <Field String Page$Frame.mimeType>
		s = ((String) (new FrameResourceTree()));
	//   26   55:new             #19  <Class Page$FrameResourceTree>
	//   27   58:dup             
	//   28   59:aconst_null     
	//   29   60:invokespecial   #73  <Method void Page$FrameResourceTree(Page$1)>
	//   30   63:astore_0        
		s.frame = frame;
	//   31   64:aload_0         
	//   32   65:aload           4
	//   33   67:putfield        #77  <Field Page$Frame Page$FrameResourceTree.frame>
		s.resources = Collections.emptyList();
	//   34   70:aload_0         
	//   35   71:invokestatic    #83  <Method List Collections.emptyList()>
	//   36   74:putfield        #87  <Field List Page$FrameResourceTree.resources>
		s.childFrames = null;
	//   37   77:aload_0         
	//   38   78:aconst_null     
	//   39   79:putfield        #90  <Field List Page$FrameResourceTree.childFrames>
		return ((FrameResourceTree) (s));
	//   40   82:aload_0         
	//   41   83:areturn         
	}

	private void notifyExecutionContexts(JsonRpcPeer jsonrpcpeer)
	{
		ExecutionContextDescription executioncontextdescription = new ExecutionContextDescription();
	//    0    0:new             #13  <Class Page$ExecutionContextDescription>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #93  <Method void Page$ExecutionContextDescription(Page$1)>
	//    4    8:astore_2        
		executioncontextdescription.frameId = "1";
	//    5    9:aload_2         
	//    6   10:ldc1            #53  <String "1">
	//    7   12:putfield        #96  <Field String Page$ExecutionContextDescription.frameId>
		executioncontextdescription.id = 1;
	//    8   15:aload_2         
	//    9   16:iconst_1        
	//   10   17:putfield        #99  <Field int Page$ExecutionContextDescription.id>
		ExecutionContextCreatedParams executioncontextcreatedparams = new ExecutionContextCreatedParams();
	//   11   20:new             #10  <Class Page$ExecutionContextCreatedParams>
	//   12   23:dup             
	//   13   24:aconst_null     
	//   14   25:invokespecial   #100 <Method void Page$ExecutionContextCreatedParams(Page$1)>
	//   15   28:astore_3        
		executioncontextcreatedparams.context = executioncontextdescription;
	//   16   29:aload_3         
	//   17   30:aload_2         
	//   18   31:putfield        #104 <Field Page$ExecutionContextDescription Page$ExecutionContextCreatedParams.context>
		jsonrpcpeer.invokeMethod("Runtime.executionContextCreated", ((Object) (executioncontextcreatedparams)), ((com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback) (null)));
	//   19   34:aload_1         
	//   20   35:ldc1            #106 <String "Runtime.executionContextCreated">
	//   21   37:aload_3         
	//   22   38:aconst_null     
	//   23   39:invokevirtual   #112 <Method void JsonRpcPeer.invokeMethod(String, Object, com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback)>
	//   24   42:return          
	}

	private void sendWelcomeMessage(JsonRpcPeer jsonrpcpeer)
	{
		Console.ConsoleMessage consolemessage = new Console.ConsoleMessage();
	//    0    0:new             #115 <Class Console$ConsoleMessage>
	//    1    3:dup             
	//    2    4:invokespecial   #116 <Method void Console$ConsoleMessage()>
	//    3    7:astore_2        
		consolemessage.source = Console.MessageSource.JAVASCRIPT;
	//    4    8:aload_2         
	//    5    9:getstatic       #122 <Field Console$MessageSource Console$MessageSource.JAVASCRIPT>
	//    6   12:putfield        #125 <Field Console$MessageSource Console$ConsoleMessage.source>
		consolemessage.level = Console.MessageLevel.LOG;
	//    7   15:aload_2         
	//    8   16:getstatic       #131 <Field Console$MessageLevel Console$MessageLevel.LOG>
	//    9   19:putfield        #134 <Field Console$MessageLevel Console$ConsoleMessage.level>
		Object obj = ((Object) (new StringBuilder()));
	//   10   22:new             #136 <Class StringBuilder>
	//   11   25:dup             
	//   12   26:invokespecial   #137 <Method void StringBuilder()>
	//   13   29:astore_3        
		((StringBuilder) (obj)).append("_____/\\\\\\\\\\\\\\\\\\\\\\_______________________________________________/\\\\\\_______________________\n ___/\\\\\\/////////\\\\\\____________________________________________\\/\\\\\\_______________________\n  __\\//\\\\\\______\\///______/\\\\\\_________________________/\\\\\\______\\/\\\\\\_______________________\n   ___\\////\\\\\\__________/\\\\\\\\\\\\\\\\\\\\\\_____/\\\\\\\\\\\\\\\\___/\\\\\\\\\\\\\\\\\\\\\\_\\/\\\\\\_____________/\\\\\\\\\\____\n    ______\\////\\\\\\______\\////\\\\\\////____/\\\\\\/////\\\\\\_\\////\\\\\\////__\\/\\\\\\\\\\\\\\\\\\\\____/\\\\\\///\\\\\\__\n     _________\\////\\\\\\______\\/\\\\\\_______/\\\\\\\\\\\\\\\\\\\\\\_____\\/\\\\\\______\\/\\\\\\/////\\\\\\__/\\\\\\__\\//\\\\\\_\n      __/\\\\\\______\\//\\\\\\_____\\/\\\\\\_/\\\\__\\//\\\\///////______\\/\\\\\\_/\\\\__\\/\\\\\\___\\/\\\\\\_\\//\\\\\\__/\\\\\\__\n       _\\///\\\\\\\\\\\\\\\\\\\\\\/______\\//\\\\\\\\\\____\\//\\\\\\\\\\\\\\\\\\\\____\\//\\\\\\\\\\___\\/\\\\\\___\\/\\\\\\__\\///\\\\\\\\\\/___\n        ___\\///////////_________\\/////______\\//////////______\\/////____\\///____\\///_____\\/////_____\n         Welcome to Stetho\n          Attached to ");
	//   14   30:aload_3         
	//   15   31:ldc1            #139 <String "_____/\\\\\\\\\\\\\\\\\\\\\\_______________________________________________/\\\\\\_______________________\n ___/\\\\\\/////////\\\\\\____________________________________________\\/\\\\\\_______________________\n  __\\//\\\\\\______\\///______/\\\\\\_________________________/\\\\\\______\\/\\\\\\_______________________\n   ___\\////\\\\\\__________/\\\\\\\\\\\\\\\\\\\\\\_____/\\\\\\\\\\\\\\\\___/\\\\\\\\\\\\\\\\\\\\\\_\\/\\\\\\_____________/\\\\\\\\\\____\n    ______\\////\\\\\\______\\////\\\\\\////____/\\\\\\/////\\\\\\_\\////\\\\\\////__\\/\\\\\\\\\\\\\\\\\\\\____/\\\\\\///\\\\\\__\n     _________\\////\\\\\\______\\/\\\\\\_______/\\\\\\\\\\\\\\\\\\\\\\_____\\/\\\\\\______\\/\\\\\\/////\\\\\\__/\\\\\\__\\//\\\\\\_\n      __/\\\\\\______\\//\\\\\\_____\\/\\\\\\_/\\\\__\\//\\\\///////______\\/\\\\\\_/\\\\__\\/\\\\\\___\\/\\\\\\_\\//\\\\\\__/\\\\\\__\n       _\\///\\\\\\\\\\\\\\\\\\\\\\/______\\//\\\\\\\\\\____\\//\\\\\\\\\\\\\\\\\\\\____\\//\\\\\\\\\\___\\/\\\\\\___\\/\\\\\\__\\///\\\\\\\\\\/___\n        ___\\///////////_________\\/////______\\//////////______\\/////____\\///____\\///_____\\/////_____\n         Welcome to Stetho\n          Attached to ">
	//   16   33:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
		((StringBuilder) (obj)).append(ProcessUtil.getProcessName());
	//   18   37:aload_3         
	//   19   38:invokestatic    #149 <Method String ProcessUtil.getProcessName()>
	//   20   41:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
		((StringBuilder) (obj)).append("\n");
	//   22   45:aload_3         
	//   23   46:ldc1            #151 <String "\n">
	//   24   48:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		consolemessage.text = ((StringBuilder) (obj)).toString();
	//   26   52:aload_2         
	//   27   53:aload_3         
	//   28   54:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   29   57:putfield        #157 <Field String Console$ConsoleMessage.text>
		obj = ((Object) (new Console.MessageAddedRequest()));
	//   30   60:new             #159 <Class Console$MessageAddedRequest>
	//   31   63:dup             
	//   32   64:invokespecial   #160 <Method void Console$MessageAddedRequest()>
	//   33   67:astore_3        
		obj.message = consolemessage;
	//   34   68:aload_3         
	//   35   69:aload_2         
	//   36   70:putfield        #164 <Field Console$ConsoleMessage Console$MessageAddedRequest.message>
		jsonrpcpeer.invokeMethod("Console.messageAdded", obj, ((com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback) (null)));
	//   37   73:aload_1         
	//   38   74:ldc1            #166 <String "Console.messageAdded">
	//   39   76:aload_3         
	//   40   77:aconst_null     
	//   41   78:invokevirtual   #112 <Method void JsonRpcPeer.invokeMethod(String, Object, com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback)>
	//   42   81:return          
	}

	public JsonRpcResult canScreencast(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		return ((JsonRpcResult) (new SimpleBooleanResult(false)));
	//    0    0:new             #171 <Class SimpleBooleanResult>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #174 <Method void SimpleBooleanResult(boolean)>
	//    4    8:areturn         
	}

	public void clearDeviceOrientationOverride(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}

	public void clearGeolocationOverride(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}

	public void disable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}

	public void enable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		notifyExecutionContexts(jsonrpcpeer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #182 <Method void notifyExecutionContexts(JsonRpcPeer)>
		sendWelcomeMessage(jsonrpcpeer);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #184 <Method void sendWelcomeMessage(JsonRpcPeer)>
	//    6   10:return          
	}

	public JsonRpcResult getResourceTree(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		jsonobject = ((JSONObject) (SharedPreferencesHelper.getSharedPreferenceTags(mContext).iterator()));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Context mContext>
	//    2    4:invokestatic    #191 <Method List SharedPreferencesHelper.getSharedPreferenceTags(Context)>
	//    3    7:invokeinterface #197 <Method Iterator List.iterator()>
	//    4   12:astore_2        
		if(((Iterator) (jsonobject)).hasNext())
	//*   5   13:aload_2         
	//*   6   14:invokeinterface #203 <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            35
			jsonrpcpeer = ((JsonRpcPeer) ((String)((Iterator) (jsonobject)).next()));
	//    8   22:aload_2         
	//    9   23:invokeinterface #207 <Method Object Iterator.next()>
	//   10   28:checkcast       #209 <Class String>
	//   11   31:astore_1        
		else
	//*  12   32:goto            38
			jsonrpcpeer = "";
	//   13   35:ldc1            #61  <String "">
	//   14   37:astore_1        
		jsonrpcpeer = ((JsonRpcPeer) (createSimpleFrameResourceTree("1", ((String) (null)), "Stetho", ((String) (jsonrpcpeer)))));
	//   15   38:ldc1            #53  <String "1">
	//   16   40:aconst_null     
	//   17   41:ldc1            #211 <String "Stetho">
	//   18   43:aload_1         
	//   19   44:invokestatic    #213 <Method Page$FrameResourceTree createSimpleFrameResourceTree(String, String, String, String)>
	//   20   47:astore_1        
		if(((FrameResourceTree) (jsonrpcpeer)).childFrames == null)
	//*  21   48:aload_1         
	//*  22   49:getfield        #90  <Field List Page$FrameResourceTree.childFrames>
	//*  23   52:ifnonnull       66
			jsonrpcpeer.childFrames = ((List) (new ArrayList()));
	//   24   55:aload_1         
	//   25   56:new             #215 <Class ArrayList>
	//   26   59:dup             
	//   27   60:invokespecial   #216 <Method void ArrayList()>
	//   28   63:putfield        #90  <Field List Page$FrameResourceTree.childFrames>
		for(int i = 1; ((Iterator) (jsonobject)).hasNext(); i++)
	//*  29   66:iconst_1        
	//*  30   67:istore_3        
	//*  31   68:aload_2         
	//*  32   69:invokeinterface #203 <Method boolean Iterator.hasNext()>
	//*  33   74:ifeq            179
		{
			Object obj = ((Object) (new StringBuilder()));
	//   34   77:new             #136 <Class StringBuilder>
	//   35   80:dup             
	//   36   81:invokespecial   #137 <Method void StringBuilder()>
	//   37   84:astore          4
			((StringBuilder) (obj)).append("1.");
	//   38   86:aload           4
	//   39   88:ldc1            #218 <String "1.">
	//   40   90:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   41   93:pop             
			((StringBuilder) (obj)).append(i);
	//   42   94:aload           4
	//   43   96:iload_3         
	//   44   97:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   45  100:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   46  101:aload           4
	//   47  103:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   48  106:astore          4
			String s = (String)((Iterator) (jsonobject)).next();
	//   49  108:aload_2         
	//   50  109:invokeinterface #207 <Method Object Iterator.next()>
	//   51  114:checkcast       #209 <Class String>
	//   52  117:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   53  119:new             #136 <Class StringBuilder>
	//   54  122:dup             
	//   55  123:invokespecial   #137 <Method void StringBuilder()>
	//   56  126:astore          6
			stringbuilder.append("Child #");
	//   57  128:aload           6
	//   58  130:ldc1            #223 <String "Child #">
	//   59  132:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   60  135:pop             
			stringbuilder.append(((String) (obj)));
	//   61  136:aload           6
	//   62  138:aload           4
	//   63  140:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   64  143:pop             
			obj = ((Object) (createSimpleFrameResourceTree(((String) (obj)), "1", stringbuilder.toString(), s)));
	//   65  144:aload           4
	//   66  146:ldc1            #53  <String "1">
	//   67  148:aload           6
	//   68  150:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   69  153:aload           5
	//   70  155:invokestatic    #213 <Method Page$FrameResourceTree createSimpleFrameResourceTree(String, String, String, String)>
	//   71  158:astore          4
			((FrameResourceTree) (jsonrpcpeer)).childFrames.add(obj);
	//   72  160:aload_1         
	//   73  161:getfield        #90  <Field List Page$FrameResourceTree.childFrames>
	//   74  164:aload           4
	//   75  166:invokeinterface #227 <Method boolean List.add(Object)>
	//   76  171:pop             
		}

	//   77  172:iload_3         
	//   78  173:iconst_1        
	//   79  174:iadd            
	//   80  175:istore_3        
	//*  81  176:goto            68
		jsonobject = ((JSONObject) (new GetResourceTreeParams()));
	//   82  179:new             #22  <Class Page$GetResourceTreeParams>
	//   83  182:dup             
	//   84  183:aconst_null     
	//   85  184:invokespecial   #228 <Method void Page$GetResourceTreeParams(Page$1)>
	//   86  187:astore_2        
		jsonobject.frameTree = ((FrameResourceTree) (jsonrpcpeer));
	//   87  188:aload_2         
	//   88  189:aload_1         
	//   89  190:putfield        #232 <Field Page$FrameResourceTree Page$GetResourceTreeParams.frameTree>
		return ((JsonRpcResult) (jsonobject));
	//   90  193:aload_2         
	//   91  194:areturn         
	}

	public JsonRpcResult hasTouchInputs(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		return ((JsonRpcResult) (new SimpleBooleanResult(false)));
	//    0    0:new             #171 <Class SimpleBooleanResult>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #174 <Method void SimpleBooleanResult(boolean)>
	//    4    8:areturn         
	}

	public void setDeviceMetricsOverride(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}

	public void setEmulatedMedia(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}

	public void setShowViewportSizeOnResize(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}

	public void setTouchEmulationEnabled(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}

	private final Context mContext;
}
