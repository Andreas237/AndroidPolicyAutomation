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
		//    2    3:invokestatic    #66  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//    4    9:areturn         
		}

		public static RequestCodeOffset[] values()
		{
			return (RequestCodeOffset[])((RequestCodeOffset []) ($VALUES)).clone();
		//    0    0:getstatic       #53  <Field CallbackManagerImpl$RequestCodeOffset[] $VALUES>
		//    1    3:invokevirtual   #73  <Method Object _5B_Lcom.facebook.internal.CallbackManagerImpl$RequestCodeOffset_3B_.clone()>
		//    2    6:checkcast       #69  <Class CallbackManagerImpl$RequestCodeOffset[]>
		//    3    9:areturn         
		}

		public int toRequestCode()
		{
			return FacebookSdk.getCallbackRequestCodeOffset() + offset;
		//    0    0:invokestatic    #80  <Method int FacebookSdk.getCallbackRequestCodeOffset()>
		//    1    3:aload_0         
		//    2    4:getfield        #59  <Field int offset>
		//    3    7:iadd            
		//    4    8:ireturn         
		}

		private static final RequestCodeOffset $VALUES[];
		public static final RequestCodeOffset AppGroupCreate;
		public static final RequestCodeOffset AppGroupJoin;
		public static final RequestCodeOffset AppInvite;
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
		//    2    4:ldc1            #24  <String "Login">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//    6   11:putstatic       #30  <Field CallbackManagerImpl$RequestCodeOffset Login>
			Share = new RequestCodeOffset("Share", 1, 1);
		//    7   14:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//    8   17:dup             
		//    9   18:ldc1            #31  <String "Share">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   13   25:putstatic       #33  <Field CallbackManagerImpl$RequestCodeOffset Share>
			Message = new RequestCodeOffset("Message", 2, 2);
		//   14   28:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   15   31:dup             
		//   16   32:ldc1            #34  <String "Message">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   20   39:putstatic       #36  <Field CallbackManagerImpl$RequestCodeOffset Message>
			Like = new RequestCodeOffset("Like", 3, 3);
		//   21   42:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   22   45:dup             
		//   23   46:ldc1            #37  <String "Like">
		//   24   48:iconst_3        
		//   25   49:iconst_3        
		//   26   50:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   27   53:putstatic       #39  <Field CallbackManagerImpl$RequestCodeOffset Like>
			GameRequest = new RequestCodeOffset("GameRequest", 4, 4);
		//   28   56:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   29   59:dup             
		//   30   60:ldc1            #40  <String "GameRequest">
		//   31   62:iconst_4        
		//   32   63:iconst_4        
		//   33   64:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   34   67:putstatic       #42  <Field CallbackManagerImpl$RequestCodeOffset GameRequest>
			AppGroupCreate = new RequestCodeOffset("AppGroupCreate", 5, 5);
		//   35   70:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   36   73:dup             
		//   37   74:ldc1            #43  <String "AppGroupCreate">
		//   38   76:iconst_5        
		//   39   77:iconst_5        
		//   40   78:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   41   81:putstatic       #45  <Field CallbackManagerImpl$RequestCodeOffset AppGroupCreate>
			AppGroupJoin = new RequestCodeOffset("AppGroupJoin", 6, 6);
		//   42   84:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   43   87:dup             
		//   44   88:ldc1            #46  <String "AppGroupJoin">
		//   45   90:bipush          6
		//   46   92:bipush          6
		//   47   94:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   48   97:putstatic       #48  <Field CallbackManagerImpl$RequestCodeOffset AppGroupJoin>
			AppInvite = new RequestCodeOffset("AppInvite", 7, 7);
		//   49  100:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
		//   50  103:dup             
		//   51  104:ldc1            #49  <String "AppInvite">
		//   52  106:bipush          7
		//   53  108:bipush          7
		//   54  110:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
		//   55  113:putstatic       #51  <Field CallbackManagerImpl$RequestCodeOffset AppInvite>
			$VALUES = (new RequestCodeOffset[] {
				Login, Share, Message, Like, GameRequest, AppGroupCreate, AppGroupJoin, AppInvite
			});
		//   56  116:bipush          8
		//   57  118:anewarray       RequestCodeOffset[]
		//   58  121:dup             
		//   59  122:iconst_0        
		//   60  123:getstatic       #30  <Field CallbackManagerImpl$RequestCodeOffset Login>
		//   61  126:aastore         
		//   62  127:dup             
		//   63  128:iconst_1        
		//   64  129:getstatic       #33  <Field CallbackManagerImpl$RequestCodeOffset Share>
		//   65  132:aastore         
		//   66  133:dup             
		//   67  134:iconst_2        
		//   68  135:getstatic       #36  <Field CallbackManagerImpl$RequestCodeOffset Message>
		//   69  138:aastore         
		//   70  139:dup             
		//   71  140:iconst_3        
		//   72  141:getstatic       #39  <Field CallbackManagerImpl$RequestCodeOffset Like>
		//   73  144:aastore         
		//   74  145:dup             
		//   75  146:iconst_4        
		//   76  147:getstatic       #42  <Field CallbackManagerImpl$RequestCodeOffset GameRequest>
		//   77  150:aastore         
		//   78  151:dup             
		//   79  152:iconst_5        
		//   80  153:getstatic       #45  <Field CallbackManagerImpl$RequestCodeOffset AppGroupCreate>
		//   81  156:aastore         
		//   82  157:dup             
		//   83  158:bipush          6
		//   84  160:getstatic       #48  <Field CallbackManagerImpl$RequestCodeOffset AppGroupJoin>
		//   85  163:aastore         
		//   86  164:dup             
		//   87  165:bipush          7
		//   88  167:getstatic       #51  <Field CallbackManagerImpl$RequestCodeOffset AppInvite>
		//   89  170:aastore         
		//   90  171:putstatic       #53  <Field CallbackManagerImpl$RequestCodeOffset[] $VALUES>
		//*  91  174:return          
		}

		private RequestCodeOffset(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #57  <Method void Enum(String, int)>
			offset = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #59  <Field int offset>
		//    7   11:return          
		}
	}


	public CallbackManagerImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		callbacks = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void HashMap()>
	//    6   12:putfield        #29  <Field Map callbacks>
	//    7   15:return          
	}

	private static Callback getStaticCallback(Integer integer)
	{
		com/facebook/internal/CallbackManagerImpl;
	//    0    0:ldc1            #2   <Class CallbackManagerImpl>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		integer = ((Integer) ((Callback)staticCallbacks.get(((Object) (integer)))));
	//    2    3:getstatic       #25  <Field Map staticCallbacks>
	//    3    6:aload_0         
	//    4    7:invokeinterface #37  <Method Object Map.get(Object)>
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
	//    3    4:ldc1            #41  <String "callback">
	//    4    6:invokestatic    #47  <Method void Validate.notNull(Object, String)>
		flag = staticCallbacks.containsKey(((Object) (Integer.valueOf(i))));
	//    5    9:getstatic       #25  <Field Map staticCallbacks>
	//    6   12:iload_0         
	//    7   13:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//    8   16:invokeinterface #57  <Method boolean Map.containsKey(Object)>
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
	//   15   30:getstatic       #25  <Field Map staticCallbacks>
	//   16   33:iload_0         
	//   17   34:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   18   37:aload_1         
	//   19   38:invokeinterface #61  <Method Object Map.put(Object, Object)>
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
	//    1    1:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//    2    4:invokestatic    #65  <Method CallbackManagerImpl$Callback getStaticCallback(Integer)>
	//    3    7:astore_3        
		if(callback != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          21
			return callback.onActivityResult(j, intent);
	//    6   12:aload_3         
	//    7   13:iload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #69  <Method boolean CallbackManagerImpl$Callback.onActivityResult(int, Intent)>
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
	//    1    1:getfield        #29  <Field Map callbacks>
	//    2    4:iload_1         
	//    3    5:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #37  <Method Object Map.get(Object)>
	//    5   13:checkcast       #8   <Class CallbackManagerImpl$Callback>
	//    6   16:astore          4
		if(callback != null)
	//*   7   18:aload           4
	//*   8   20:ifnull          33
			return callback.onActivityResult(j, intent);
	//    9   23:aload           4
	//   10   25:iload_2         
	//   11   26:aload_3         
	//   12   27:invokeinterface #69  <Method boolean CallbackManagerImpl$Callback.onActivityResult(int, Intent)>
	//   13   32:ireturn         
		else
			return runStaticCallback(i, j, intent);
	//   14   33:iload_1         
	//   15   34:iload_2         
	//   16   35:aload_3         
	//   17   36:invokestatic    #71  <Method boolean runStaticCallback(int, int, Intent)>
	//   18   39:ireturn         
	}

	public void registerCallback(int i, Callback callback)
	{
		Validate.notNull(((Object) (callback)), "callback");
	//    0    0:aload_2         
	//    1    1:ldc1            #41  <String "callback">
	//    2    3:invokestatic    #47  <Method void Validate.notNull(Object, String)>
		callbacks.put(((Object) (Integer.valueOf(i))), ((Object) (callback)));
	//    3    6:aload_0         
	//    4    7:getfield        #29  <Field Map callbacks>
	//    5   10:iload_1         
	//    6   11:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//    7   14:aload_2         
	//    8   15:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//    9   20:pop             
	//   10   21:return          
	}

	private static Map staticCallbacks = new HashMap();
	private Map callbacks;

	static 
	{
	//    0    0:new             #20  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void HashMap()>
	//    3    7:putstatic       #25  <Field Map staticCallbacks>
	//*   4   10:return          
	}
}
