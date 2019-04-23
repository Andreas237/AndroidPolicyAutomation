// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Intent;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.Map;

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
		//    2    3:invokestatic    #70  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//    4    9:areturn         
		}

		public static RequestCodeOffset[] values()
		{
			return (RequestCodeOffset[])((RequestCodeOffset []) ($VALUES)).clone();
		//    0    0:getstatic       #57  <Field CallbackManagerImpl$RequestCodeOffset[] $VALUES>
		//    1    3:invokevirtual   #77  <Method Object _5B_Lcom.facebook.internal.CallbackManagerImpl$RequestCodeOffset_3B_.clone()>
		//    2    6:checkcast       #73  <Class CallbackManagerImpl$RequestCodeOffset[]>
		//    3    9:areturn         
		}

		public int toRequestCode()
		{
			return FacebookSdk.getCallbackRequestCodeOffset() + offset;
		//    0    0:invokestatic    #84  <Method int FacebookSdk.getCallbackRequestCodeOffset()>
		//    1    3:aload_0         
		//    2    4:getfield        #63  <Field int offset>
		//    3    7:iadd            
		//    4    8:ireturn         
		}

		private static final RequestCodeOffset $VALUES[];
		public static final RequestCodeOffset AppGroupCreate;
		public static final RequestCodeOffset AppGroupJoin;
		public static final RequestCodeOffset AppInvite;
		public static final RequestCodeOffset DeviceShare;
		public static final RequestCodeOffset GameRequest;
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
		//    2    4:ldc1            #25  <String "Login">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//    6   11:putstatic       #31  <Field CallbackManagerImpl$RequestCodeOffset Login>
			Share = new RequestCodeOffset("Share", 1, 1);
		//    7   14:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//    8   17:dup             
		//    9   18:ldc1            #32  <String "Share">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   13   25:putstatic       #34  <Field CallbackManagerImpl$RequestCodeOffset Share>
			Message = new RequestCodeOffset("Message", 2, 2);
		//   14   28:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   15   31:dup             
		//   16   32:ldc1            #35  <String "Message">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   20   39:putstatic       #37  <Field CallbackManagerImpl$RequestCodeOffset Message>
			Like = new RequestCodeOffset("Like", 3, 3);
		//   21   42:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   22   45:dup             
		//   23   46:ldc1            #38  <String "Like">
		//   24   48:iconst_3        
		//   25   49:iconst_3        
		//   26   50:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   27   53:putstatic       #40  <Field CallbackManagerImpl$RequestCodeOffset Like>
			GameRequest = new RequestCodeOffset("GameRequest", 4, 4);
		//   28   56:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   29   59:dup             
		//   30   60:ldc1            #41  <String "GameRequest">
		//   31   62:iconst_4        
		//   32   63:iconst_4        
		//   33   64:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   34   67:putstatic       #43  <Field CallbackManagerImpl$RequestCodeOffset GameRequest>
			AppGroupCreate = new RequestCodeOffset("AppGroupCreate", 5, 5);
		//   35   70:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   36   73:dup             
		//   37   74:ldc1            #44  <String "AppGroupCreate">
		//   38   76:iconst_5        
		//   39   77:iconst_5        
		//   40   78:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   41   81:putstatic       #46  <Field CallbackManagerImpl$RequestCodeOffset AppGroupCreate>
			AppGroupJoin = new RequestCodeOffset("AppGroupJoin", 6, 6);
		//   42   84:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   43   87:dup             
		//   44   88:ldc1            #47  <String "AppGroupJoin">
		//   45   90:bipush          6
		//   46   92:bipush          6
		//   47   94:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   48   97:putstatic       #49  <Field CallbackManagerImpl$RequestCodeOffset AppGroupJoin>
			AppInvite = new RequestCodeOffset("AppInvite", 7, 7);
		//   49  100:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   50  103:dup             
		//   51  104:ldc1            #50  <String "AppInvite">
		//   52  106:bipush          7
		//   53  108:bipush          7
		//   54  110:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   55  113:putstatic       #52  <Field CallbackManagerImpl$RequestCodeOffset AppInvite>
			DeviceShare = new RequestCodeOffset("DeviceShare", 8, 8);
		//   56  116:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   57  119:dup             
		//   58  120:ldc1            #53  <String "DeviceShare">
		//   59  122:bipush          8
		//   60  124:bipush          8
		//   61  126:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   62  129:putstatic       #55  <Field CallbackManagerImpl$RequestCodeOffset DeviceShare>
			$VALUES = (new RequestCodeOffset[] {
				Login, Share, Message, Like, GameRequest, AppGroupCreate, AppGroupJoin, AppInvite, DeviceShare
			});
		//   63  132:bipush          9
		//   64  134:anewarray       RequestCodeOffset[]
		//   65  137:dup             
		//   66  138:iconst_0        
		//   67  139:getstatic       #31  <Field CallbackManagerImpl$RequestCodeOffset Login>
		//   68  142:aastore         
		//   69  143:dup             
		//   70  144:iconst_1        
		//   71  145:getstatic       #34  <Field CallbackManagerImpl$RequestCodeOffset Share>
		//   72  148:aastore         
		//   73  149:dup             
		//   74  150:iconst_2        
		//   75  151:getstatic       #37  <Field CallbackManagerImpl$RequestCodeOffset Message>
		//   76  154:aastore         
		//   77  155:dup             
		//   78  156:iconst_3        
		//   79  157:getstatic       #40  <Field CallbackManagerImpl$RequestCodeOffset Like>
		//   80  160:aastore         
		//   81  161:dup             
		//   82  162:iconst_4        
		//   83  163:getstatic       #43  <Field CallbackManagerImpl$RequestCodeOffset GameRequest>
		//   84  166:aastore         
		//   85  167:dup             
		//   86  168:iconst_5        
		//   87  169:getstatic       #46  <Field CallbackManagerImpl$RequestCodeOffset AppGroupCreate>
		//   88  172:aastore         
		//   89  173:dup             
		//   90  174:bipush          6
		//   91  176:getstatic       #49  <Field CallbackManagerImpl$RequestCodeOffset AppGroupJoin>
		//   92  179:aastore         
		//   93  180:dup             
		//   94  181:bipush          7
		//   95  183:getstatic       #52  <Field CallbackManagerImpl$RequestCodeOffset AppInvite>
		//   96  186:aastore         
		//   97  187:dup             
		//   98  188:bipush          8
		//   99  190:getstatic       #55  <Field CallbackManagerImpl$RequestCodeOffset DeviceShare>
		//  100  193:aastore         
		//  101  194:putstatic       #57  <Field CallbackManagerImpl$RequestCodeOffset[] $VALUES>
		//* 102  197:return          
		}

		private RequestCodeOffset(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #61  <Method void Enum(String, int)>
			offset = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #63  <Field int offset>
		//    7   11:return          
		}
	}


	public CallbackManagerImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		callbacks = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #26  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void HashMap()>
	//    6   12:putfield        #35  <Field Map callbacks>
	//    7   15:return          
	}

	private static Callback getStaticCallback(Integer integer)
	{
		com/facebook/internal/CallbackManagerImpl;
	//    0    0:ldc1            #2   <Class CallbackManagerImpl>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		integer = ((Integer) ((Callback)staticCallbacks.get(((Object) (integer)))));
	//    2    3:getstatic       #31  <Field Map staticCallbacks>
	//    3    6:aload_0         
	//    4    7:invokeinterface #43  <Method Object Map.get(Object)>
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

	public static void registerStaticCallback(int i, Callback callback)
	{
		com/facebook/internal/CallbackManagerImpl;
	//    0    0:ldc1            #2   <Class CallbackManagerImpl>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag;
		Validate.notNull(((Object) (callback)), "callback");
	//    2    3:aload_1         
	//    3    4:ldc1            #47  <String "callback">
	//    4    6:invokestatic    #53  <Method void Validate.notNull(Object, String)>
		flag = staticCallbacks.containsKey(((Object) (Integer.valueOf(i))));
	//    5    9:getstatic       #31  <Field Map staticCallbacks>
	//    6   12:iload_0         
	//    7   13:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//    8   16:invokeinterface #63  <Method boolean Map.containsKey(Object)>
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
	//   15   30:getstatic       #31  <Field Map staticCallbacks>
	//   16   33:iload_0         
	//   17   34:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//   18   37:aload_1         
	//   19   38:invokeinterface #67  <Method Object Map.put(Object, Object)>
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
	//    1    1:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//    2    4:invokestatic    #71  <Method CallbackManagerImpl$Callback getStaticCallback(Integer)>
	//    3    7:astore_3        
		if(callback != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          21
			return callback.onActivityResult(j, intent);
	//    6   12:aload_3         
	//    7   13:iload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #75  <Method boolean CallbackManagerImpl$Callback.onActivityResult(int, Intent)>
	//   10   20:ireturn         
		else
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	public boolean onActivityResult(int i, int j, Intent intent)
	{
		Callback callback = (Callback)callbacks.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Map callbacks>
	//    2    4:iload_1         
	//    3    5:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #43  <Method Object Map.get(Object)>
	//    5   13:checkcast       #8   <Class CallbackManagerImpl$Callback>
	//    6   16:astore          4
		if(callback != null)
	//*   7   18:aload           4
	//*   8   20:ifnull          33
			return callback.onActivityResult(j, intent);
	//    9   23:aload           4
	//   10   25:iload_2         
	//   11   26:aload_3         
	//   12   27:invokeinterface #75  <Method boolean CallbackManagerImpl$Callback.onActivityResult(int, Intent)>
	//   13   32:ireturn         
		else
			return runStaticCallback(i, j, intent);
	//   14   33:iload_1         
	//   15   34:iload_2         
	//   16   35:aload_3         
	//   17   36:invokestatic    #77  <Method boolean runStaticCallback(int, int, Intent)>
	//   18   39:ireturn         
	}

	public void registerCallback(int i, Callback callback)
	{
		Validate.notNull(((Object) (callback)), "callback");
	//    0    0:aload_2         
	//    1    1:ldc1            #47  <String "callback">
	//    2    3:invokestatic    #53  <Method void Validate.notNull(Object, String)>
		callbacks.put(((Object) (Integer.valueOf(i))), ((Object) (callback)));
	//    3    6:aload_0         
	//    4    7:getfield        #35  <Field Map callbacks>
	//    5   10:iload_1         
	//    6   11:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//    7   14:aload_2         
	//    8   15:invokeinterface #67  <Method Object Map.put(Object, Object)>
	//    9   20:pop             
	//   10   21:return          
	}

	public void unregisterCallback(int i)
	{
		callbacks.remove(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Map callbacks>
	//    2    4:iload_1         
	//    3    5:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #83  <Method Object Map.remove(Object)>
	//    5   13:pop             
	//    6   14:return          
	}

	private static final String INAPP_PURCHASE_DATA = "INAPP_PURCHASE_DATA";
	private static final String TAG = "CallbackManagerImpl";
	private static Map staticCallbacks = new HashMap();
	private Map callbacks;

	static 
	{
	//    0    0:new             #26  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void HashMap()>
	//    3    7:putstatic       #31  <Field Map staticCallbacks>
	//*   4   10:return          
	}
}
