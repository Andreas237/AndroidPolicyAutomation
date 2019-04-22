// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Intent;
import android.util.Log;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			Validate

public final class CallbackManagerImpl
	implements CallbackManager
{
	public static interface Callback
	{

		public abstract boolean onActivityResult(int i, Intent intent);
	}

	public static final class RequestCodeOffset extends Enum
	{

		public static RequestCodeOffset valueOf(String s)
		{
			return (RequestCodeOffset)Enum.valueOf(com/facebook/internal/CallbackManagerImpl$RequestCodeOffset, s);
		//    0    0:ldc1            #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//    1    2:aload_0         
		//    2    3:invokestatic    #74  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//    4    9:areturn         
		}

		public static RequestCodeOffset[] values()
		{
			return (RequestCodeOffset[])((RequestCodeOffset []) ($VALUES)).clone();
		//    0    0:getstatic       #61  <Field CallbackManagerImpl$RequestCodeOffset[] $VALUES>
		//    1    3:invokevirtual   #81  <Method Object _5B_Lcom.facebook.internal.CallbackManagerImpl$RequestCodeOffset_3B_.clone()>
		//    2    6:checkcast       #77  <Class CallbackManagerImpl$RequestCodeOffset[]>
		//    3    9:areturn         
		}

		public int toRequestCode()
		{
			return FacebookSdk.getCallbackRequestCodeOffset() + offset;
		//    0    0:invokestatic    #88  <Method int FacebookSdk.getCallbackRequestCodeOffset()>
		//    1    3:aload_0         
		//    2    4:getfield        #67  <Field int offset>
		//    3    7:iadd            
		//    4    8:ireturn         
		}

		private static final RequestCodeOffset $VALUES[];
		public static final RequestCodeOffset AppGroupCreate;
		public static final RequestCodeOffset AppGroupJoin;
		public static final RequestCodeOffset AppInvite;
		public static final RequestCodeOffset DeviceShare;
		public static final RequestCodeOffset GameRequest;
		public static final RequestCodeOffset InAppPurchase;
		public static final RequestCodeOffset Like;
		public static final RequestCodeOffset Login;
		public static final RequestCodeOffset Message;
		public static final RequestCodeOffset Share;
		private final int offset;

		static 
		{
			Login = new RequestCodeOffset("Login", 0, 0);
		//    0    0:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//    1    3:dup             
		//    2    4:ldc1            #26  <String "Login">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//    6   11:putstatic       #32  <Field CallbackManagerImpl$RequestCodeOffset Login>
			Share = new RequestCodeOffset("Share", 1, 1);
		//    7   14:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//    8   17:dup             
		//    9   18:ldc1            #33  <String "Share">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   13   25:putstatic       #35  <Field CallbackManagerImpl$RequestCodeOffset Share>
			Message = new RequestCodeOffset("Message", 2, 2);
		//   14   28:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   15   31:dup             
		//   16   32:ldc1            #36  <String "Message">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   20   39:putstatic       #38  <Field CallbackManagerImpl$RequestCodeOffset Message>
			Like = new RequestCodeOffset("Like", 3, 3);
		//   21   42:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   22   45:dup             
		//   23   46:ldc1            #39  <String "Like">
		//   24   48:iconst_3        
		//   25   49:iconst_3        
		//   26   50:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   27   53:putstatic       #41  <Field CallbackManagerImpl$RequestCodeOffset Like>
			GameRequest = new RequestCodeOffset("GameRequest", 4, 4);
		//   28   56:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   29   59:dup             
		//   30   60:ldc1            #42  <String "GameRequest">
		//   31   62:iconst_4        
		//   32   63:iconst_4        
		//   33   64:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   34   67:putstatic       #44  <Field CallbackManagerImpl$RequestCodeOffset GameRequest>
			AppGroupCreate = new RequestCodeOffset("AppGroupCreate", 5, 5);
		//   35   70:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   36   73:dup             
		//   37   74:ldc1            #45  <String "AppGroupCreate">
		//   38   76:iconst_5        
		//   39   77:iconst_5        
		//   40   78:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   41   81:putstatic       #47  <Field CallbackManagerImpl$RequestCodeOffset AppGroupCreate>
			AppGroupJoin = new RequestCodeOffset("AppGroupJoin", 6, 6);
		//   42   84:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   43   87:dup             
		//   44   88:ldc1            #48  <String "AppGroupJoin">
		//   45   90:bipush          6
		//   46   92:bipush          6
		//   47   94:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   48   97:putstatic       #50  <Field CallbackManagerImpl$RequestCodeOffset AppGroupJoin>
			AppInvite = new RequestCodeOffset("AppInvite", 7, 7);
		//   49  100:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   50  103:dup             
		//   51  104:ldc1            #51  <String "AppInvite">
		//   52  106:bipush          7
		//   53  108:bipush          7
		//   54  110:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   55  113:putstatic       #53  <Field CallbackManagerImpl$RequestCodeOffset AppInvite>
			DeviceShare = new RequestCodeOffset("DeviceShare", 8, 8);
		//   56  116:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   57  119:dup             
		//   58  120:ldc1            #54  <String "DeviceShare">
		//   59  122:bipush          8
		//   60  124:bipush          8
		//   61  126:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   62  129:putstatic       #56  <Field CallbackManagerImpl$RequestCodeOffset DeviceShare>
			InAppPurchase = new RequestCodeOffset("InAppPurchase", 9, 9);
		//   63  132:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   64  135:dup             
		//   65  136:ldc1            #57  <String "InAppPurchase">
		//   66  138:bipush          9
		//   67  140:bipush          9
		//   68  142:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   69  145:putstatic       #59  <Field CallbackManagerImpl$RequestCodeOffset InAppPurchase>
			$VALUES = (new RequestCodeOffset[] {
				Login, Share, Message, Like, GameRequest, AppGroupCreate, AppGroupJoin, AppInvite, DeviceShare, InAppPurchase
			});
		//   70  148:bipush          10
		//   71  150:anewarray       RequestCodeOffset[]
		//   72  153:dup             
		//   73  154:iconst_0        
		//   74  155:getstatic       #32  <Field CallbackManagerImpl$RequestCodeOffset Login>
		//   75  158:aastore         
		//   76  159:dup             
		//   77  160:iconst_1        
		//   78  161:getstatic       #35  <Field CallbackManagerImpl$RequestCodeOffset Share>
		//   79  164:aastore         
		//   80  165:dup             
		//   81  166:iconst_2        
		//   82  167:getstatic       #38  <Field CallbackManagerImpl$RequestCodeOffset Message>
		//   83  170:aastore         
		//   84  171:dup             
		//   85  172:iconst_3        
		//   86  173:getstatic       #41  <Field CallbackManagerImpl$RequestCodeOffset Like>
		//   87  176:aastore         
		//   88  177:dup             
		//   89  178:iconst_4        
		//   90  179:getstatic       #44  <Field CallbackManagerImpl$RequestCodeOffset GameRequest>
		//   91  182:aastore         
		//   92  183:dup             
		//   93  184:iconst_5        
		//   94  185:getstatic       #47  <Field CallbackManagerImpl$RequestCodeOffset AppGroupCreate>
		//   95  188:aastore         
		//   96  189:dup             
		//   97  190:bipush          6
		//   98  192:getstatic       #50  <Field CallbackManagerImpl$RequestCodeOffset AppGroupJoin>
		//   99  195:aastore         
		//  100  196:dup             
		//  101  197:bipush          7
		//  102  199:getstatic       #53  <Field CallbackManagerImpl$RequestCodeOffset AppInvite>
		//  103  202:aastore         
		//  104  203:dup             
		//  105  204:bipush          8
		//  106  206:getstatic       #56  <Field CallbackManagerImpl$RequestCodeOffset DeviceShare>
		//  107  209:aastore         
		//  108  210:dup             
		//  109  211:bipush          9
		//  110  213:getstatic       #59  <Field CallbackManagerImpl$RequestCodeOffset InAppPurchase>
		//  111  216:aastore         
		//  112  217:putstatic       #61  <Field CallbackManagerImpl$RequestCodeOffset[] $VALUES>
		//* 113  220:return          
		}

		private RequestCodeOffset(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #65  <Method void Enum(String, int)>
			offset = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #67  <Field int offset>
		//    7   11:return          
		}
	}


	public CallbackManagerImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		callbacks = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #25  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void HashMap()>
	//    6   12:putfield        #34  <Field Map callbacks>
	//    7   15:return          
	}

	private static Callback getStaticCallback(Integer integer)
	{
		com/facebook/internal/CallbackManagerImpl;
	//    0    0:ldc1            #2   <Class CallbackManagerImpl>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		integer = ((Integer) ((Callback)staticCallbacks.get(((Object) (integer)))));
	//    2    3:getstatic       #30  <Field Map staticCallbacks>
	//    3    6:aload_0         
	//    4    7:invokeinterface #42  <Method Object Map.get(Object)>
	//    5   12:checkcast       #8   <Class CallbackManagerImpl$Callback>
	//    6   15:astore_0        
		com/facebook/internal/CallbackManagerImpl;
	//    7   16:ldc1            #2   <Class CallbackManagerImpl>
		JVM INSTR monitorexit ;
	//    8   18:monitorexit     
		return ((Callback) (integer));
	//    9   19:aload_0         
	//   10   20:areturn         
		integer;
	//   11   21:astore_0        
	//*  12   22:ldc1            #2   <Class CallbackManagerImpl>
		throw integer;
	//   13   24:monitorexit     
	//   14   25:aload_0         
	//   15   26:athrow          
	}

	private static boolean isPurchaseIntent(Intent intent)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(intent == null)
			break MISSING_BLOCK_LABEL_120;
	//    2    2:aload_0         
	//    3    3:ifnull          120
		intent = ((Intent) (intent.getStringExtra("INAPP_PURCHASE_DATA")));
	//    4    6:aload_0         
	//    5    7:ldc1            #48  <String "INAPP_PURCHASE_DATA">
	//    6    9:invokevirtual   #54  <Method String Intent.getStringExtra(String)>
	//    7   12:astore_0        
		if(intent == null)
	//*   8   13:aload_0         
	//*   9   14:ifnonnull       19
			return false;
	//   10   17:iconst_0        
	//   11   18:ireturn         
		boolean flag;
		boolean flag2;
		try
		{
			intent = ((Intent) (JSONObjectInstrumentation.init(((String) (intent)))));
	//   12   19:aload_0         
	//   13   20:invokestatic    #60  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   14   23:astore_0        
		}
	//*  15   24:iload_2         
	//*  16   25:istore_1        
	//*  17   26:aload_0         
	//*  18   27:ldc1            #62  <String "orderId">
	//*  19   29:invokevirtual   #68  <Method boolean JSONObject.has(String)>
	//*  20   32:ifeq            105
	//*  21   35:iload_2         
	//*  22   36:istore_1        
	//*  23   37:aload_0         
	//*  24   38:ldc1            #70  <String "packageName">
	//*  25   40:invokevirtual   #68  <Method boolean JSONObject.has(String)>
	//*  26   43:ifeq            105
	//*  27   46:iload_2         
	//*  28   47:istore_1        
	//*  29   48:aload_0         
	//*  30   49:ldc1            #72  <String "productId">
	//*  31   51:invokevirtual   #68  <Method boolean JSONObject.has(String)>
	//*  32   54:ifeq            105
	//*  33   57:iload_2         
	//*  34   58:istore_1        
	//*  35   59:aload_0         
	//*  36   60:ldc1            #74  <String "purchaseTime">
	//*  37   62:invokevirtual   #68  <Method boolean JSONObject.has(String)>
	//*  38   65:ifeq            105
	//*  39   68:iload_2         
	//*  40   69:istore_1        
	//*  41   70:aload_0         
	//*  42   71:ldc1            #76  <String "purchaseState">
	//*  43   73:invokevirtual   #68  <Method boolean JSONObject.has(String)>
	//*  44   76:ifeq            105
	//*  45   79:iload_2         
	//*  46   80:istore_1        
	//*  47   81:aload_0         
	//*  48   82:ldc1            #78  <String "developerPayload">
	//*  49   84:invokevirtual   #68  <Method boolean JSONObject.has(String)>
	//*  50   87:ifeq            105
	//*  51   90:aload_0         
	//*  52   91:ldc1            #80  <String "purchaseToken">
	//*  53   93:invokevirtual   #68  <Method boolean JSONObject.has(String)>
	//*  54   96:istore_3        
	//*  55   97:iload_2         
	//*  56   98:istore_1        
	//*  57   99:iload_3         
	//*  58  100:ifeq            105
	//*  59  103:iconst_1        
	//*  60  104:istore_1        
	//*  61  105:iload_1         
	//*  62  106:ireturn         
		// Misplaced declaration of an exception variable
		catch(Intent intent)
	//*  63  107:astore_0        
		{
			Log.e(TAG, "Error parsing intent data.", ((Throwable) (intent)));
	//   64  108:getstatic       #82  <Field String TAG>
	//   65  111:ldc1            #84  <String "Error parsing intent data.">
	//   66  113:aload_0         
	//   67  114:invokestatic    #90  <Method int Log.e(String, String, Throwable)>
	//   68  117:pop             
			return false;
	//   69  118:iconst_0        
	//   70  119:ireturn         
		}
		flag = flag1;
		if(!((JSONObject) (intent)).has("orderId"))
			break MISSING_BLOCK_LABEL_105;
		flag = flag1;
		if(!((JSONObject) (intent)).has("packageName"))
			break MISSING_BLOCK_LABEL_105;
		flag = flag1;
		if(!((JSONObject) (intent)).has("productId"))
			break MISSING_BLOCK_LABEL_105;
		flag = flag1;
		if(!((JSONObject) (intent)).has("purchaseTime"))
			break MISSING_BLOCK_LABEL_105;
		flag = flag1;
		if(!((JSONObject) (intent)).has("purchaseState"))
			break MISSING_BLOCK_LABEL_105;
		flag = flag1;
		if(!((JSONObject) (intent)).has("developerPayload"))
			break MISSING_BLOCK_LABEL_105;
		flag2 = ((JSONObject) (intent)).has("purchaseToken");
		flag = flag1;
		if(flag2)
			flag = true;
		return flag;
		return false;
	//   71  120:iconst_0        
	//   72  121:ireturn         
	}

	public static void registerStaticCallback(int i, Callback callback)
	{
		com/facebook/internal/CallbackManagerImpl;
	//    0    0:ldc1            #2   <Class CallbackManagerImpl>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag;
		Validate.notNull(((Object) (callback)), "callback");
	//    2    3:aload_1         
	//    3    4:ldc1            #94  <String "callback">
	//    4    6:invokestatic    #100 <Method void Validate.notNull(Object, String)>
		flag = staticCallbacks.containsKey(((Object) (Integer.valueOf(i))));
	//    5    9:getstatic       #30  <Field Map staticCallbacks>
	//    6   12:iload_0         
	//    7   13:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//    8   16:invokeinterface #110 <Method boolean Map.containsKey(Object)>
	//    9   21:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_30;
	//   10   22:iload_2         
	//   11   23:ifeq            30
		com/facebook/internal/CallbackManagerImpl;
	//   12   26:ldc1            #2   <Class CallbackManagerImpl>
		JVM INSTR monitorexit ;
	//   13   28:monitorexit     
		return;
	//   14   29:return          
		staticCallbacks.put(((Object) (Integer.valueOf(i))), ((Object) (callback)));
	//   15   30:getstatic       #30  <Field Map staticCallbacks>
	//   16   33:iload_0         
	//   17   34:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   18   37:aload_1         
	//   19   38:invokeinterface #114 <Method Object Map.put(Object, Object)>
	//   20   43:pop             
		com/facebook/internal/CallbackManagerImpl;
	//   21   44:ldc1            #2   <Class CallbackManagerImpl>
		JVM INSTR monitorexit ;
	//   22   46:monitorexit     
		return;
	//   23   47:return          
		callback;
	//   24   48:astore_1        
	//*  25   49:ldc1            #2   <Class CallbackManagerImpl>
		throw callback;
	//   26   51:monitorexit     
	//   27   52:aload_1         
	//   28   53:athrow          
	}

	private static boolean runStaticCallback(int i, int j, Intent intent)
	{
		Callback callback = getStaticCallback(Integer.valueOf(i));
	//    0    0:iload_0         
	//    1    1:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//    2    4:invokestatic    #118 <Method CallbackManagerImpl$Callback getStaticCallback(Integer)>
	//    3    7:astore_3        
		if(callback != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          21
			return callback.onActivityResult(j, intent);
	//    6   12:aload_3         
	//    7   13:iload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #122 <Method boolean CallbackManagerImpl$Callback.onActivityResult(int, Intent)>
	//   10   20:ireturn         
		else
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	public boolean onActivityResult(int i, int j, Intent intent)
	{
		if(isPurchaseIntent(intent))
	//*   0    0:aload_3         
	//*   1    1:invokestatic    #124 <Method boolean isPurchaseIntent(Intent)>
	//*   2    4:ifeq            14
			i = RequestCodeOffset.InAppPurchase.toRequestCode();
	//    3    7:getstatic       #128 <Field CallbackManagerImpl$RequestCodeOffset CallbackManagerImpl$RequestCodeOffset.InAppPurchase>
	//    4   10:invokevirtual   #132 <Method int CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    5   13:istore_1        
		Callback callback = (Callback)callbacks.get(((Object) (Integer.valueOf(i))));
	//    6   14:aload_0         
	//    7   15:getfield        #34  <Field Map callbacks>
	//    8   18:iload_1         
	//    9   19:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   10   22:invokeinterface #42  <Method Object Map.get(Object)>
	//   11   27:checkcast       #8   <Class CallbackManagerImpl$Callback>
	//   12   30:astore          4
		if(callback != null)
	//*  13   32:aload           4
	//*  14   34:ifnull          47
			return callback.onActivityResult(j, intent);
	//   15   37:aload           4
	//   16   39:iload_2         
	//   17   40:aload_3         
	//   18   41:invokeinterface #122 <Method boolean CallbackManagerImpl$Callback.onActivityResult(int, Intent)>
	//   19   46:ireturn         
		else
			return runStaticCallback(i, j, intent);
	//   20   47:iload_1         
	//   21   48:iload_2         
	//   22   49:aload_3         
	//   23   50:invokestatic    #134 <Method boolean runStaticCallback(int, int, Intent)>
	//   24   53:ireturn         
	}

	public void registerCallback(int i, Callback callback)
	{
		Validate.notNull(((Object) (callback)), "callback");
	//    0    0:aload_2         
	//    1    1:ldc1            #94  <String "callback">
	//    2    3:invokestatic    #100 <Method void Validate.notNull(Object, String)>
		callbacks.put(((Object) (Integer.valueOf(i))), ((Object) (callback)));
	//    3    6:aload_0         
	//    4    7:getfield        #34  <Field Map callbacks>
	//    5   10:iload_1         
	//    6   11:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//    7   14:aload_2         
	//    8   15:invokeinterface #114 <Method Object Map.put(Object, Object)>
	//    9   20:pop             
	//   10   21:return          
	}

	private static final String TAG = "CallbackManagerImpl";
	private static Map staticCallbacks = new HashMap();
	private Map callbacks;

	static 
	{
	//    0    0:new             #25  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void HashMap()>
	//    3    7:putstatic       #30  <Field Map staticCallbacks>
	//*   4   10:return          
	}
}
