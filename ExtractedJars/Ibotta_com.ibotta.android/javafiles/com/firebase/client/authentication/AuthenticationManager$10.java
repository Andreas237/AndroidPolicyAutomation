// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.firebase.client.AuthData;
import com.firebase.client.FirebaseError;
import com.firebase.client.utilities.Utilities;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.firebase.client.authentication:
//			RequestHandler, AuthenticationManager

class AuthenticationManager$10
	implements RequestHandler
{

	public void onError(IOException ioexception)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #35  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("There was an exception while performing the request: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #38  <String "There was an exception while performing the request: ">
	//    6   11:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(ioexception.getLocalizedMessage());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #48  <Method String IOException.getLocalizedMessage()>
	//   11   20:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		ioexception = ((IOException) (new FirebaseError(-24, stringbuilder.toString())));
	//   13   24:new             #50  <Class FirebaseError>
	//   14   27:dup             
	//   15   28:bipush          -24
	//   16   30:aload_2         
	//   17   31:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   18   34:invokespecial   #56  <Method void FirebaseError(int, String)>
	//   19   37:astore_1        
		AuthenticationManager.access$1300(AuthenticationManager.this, val$handler, ((FirebaseError) (ioexception)));
	//   20   38:aload_0         
	//   21   39:getfield        #23  <Field AuthenticationManager this$0>
	//   22   42:aload_0         
	//   23   43:getfield        #27  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
	//   24   46:aload_1         
	//   25   47:invokestatic    #60  <Method void AuthenticationManager.access$1300(AuthenticationManager, com.firebase.client.Firebase$ValueResultHandler, FirebaseError)>
	//   26   50:return          
	}

	public void onResult(final Map result)
	{
		Object obj = result.get("error");
	//    0    0:aload_1         
	//    1    1:ldc1            #64  <String "error">
	//    2    3:invokeinterface #70  <Method Object Map.get(Object)>
	//    3    8:astore_2        
		if(obj == null)
	//*   4    9:aload_2         
	//*   5   10:ifnonnull       89
		{
			if(val$logUserOut)
	//*   6   13:aload_0         
	//*   7   14:getfield        #25  <Field boolean val$logUserOut>
	//*   8   17:ifeq            72
			{
				obj = ((Object) ((String)Utilities.getOrNull(((Object) (result)), "uid", java/lang/String)));
	//    9   20:aload_1         
	//   10   21:ldc1            #72  <String "uid">
	//   11   23:ldc1            #74  <Class String>
	//   12   25:invokestatic    #80  <Method Object Utilities.getOrNull(Object, String, Class)>
	//   13   28:checkcast       #74  <Class String>
	//   14   31:astore_2        
				if(obj != null && AuthenticationManager.access$1100(AuthenticationManager.this) != null && ((String) (obj)).equals(((Object) (AuthenticationManager.access$1100(AuthenticationManager.this).getUid()))))
	//*  15   32:aload_2         
	//*  16   33:ifnull          72
	//*  17   36:aload_0         
	//*  18   37:getfield        #23  <Field AuthenticationManager this$0>
	//*  19   40:invokestatic    #84  <Method AuthData AuthenticationManager.access$1100(AuthenticationManager)>
	//*  20   43:ifnull          72
	//*  21   46:aload_2         
	//*  22   47:aload_0         
	//*  23   48:getfield        #23  <Field AuthenticationManager this$0>
	//*  24   51:invokestatic    #84  <Method AuthData AuthenticationManager.access$1100(AuthenticationManager)>
	//*  25   54:invokevirtual   #89  <Method String AuthData.getUid()>
	//*  26   57:invokevirtual   #93  <Method boolean String.equals(Object)>
	//*  27   60:ifeq            72
					unauth(((com.firebase.client.er) (null)), false);
	//   28   63:aload_0         
	//   29   64:getfield        #23  <Field AuthenticationManager this$0>
	//   30   67:aconst_null     
	//   31   68:iconst_0        
	//   32   69:invokevirtual   #97  <Method void AuthenticationManager.unauth(com.firebase.client.Firebase$CompletionListener, boolean)>
			}
			AuthenticationManager.access$600(AuthenticationManager.this, new Runnable() {

				public void run()
				{
					AuthenticationManager.access$1200(this$0, handler, ((Object) (result)));
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field AuthenticationManager$10 this$1>
				//    2    4:getfield        #30  <Field AuthenticationManager AuthenticationManager$10.this$0>
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field AuthenticationManager$10 this$1>
				//    5   11:getfield        #34  <Field com.firebase.client.Firebase$ValueResultHandler AuthenticationManager$10.val$handler>
				//    6   14:aload_0         
				//    7   15:getfield        #21  <Field Map val$result>
				//    8   18:invokestatic    #40  <Method void AuthenticationManager.access$1200(AuthenticationManager, com.firebase.client.Firebase$ValueResultHandler, Object)>
				//    9   21:return          
				}

				final AuthenticationManager._cls10 this$1;
				final Map val$result;

			
			{
				this$1 = AuthenticationManager._cls10.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AuthenticationManager$10 this$1>
				result = map;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Map val$result>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   33   72:aload_0         
	//   34   73:getfield        #23  <Field AuthenticationManager this$0>
	//   35   76:new             #13  <Class AuthenticationManager$10$1>
	//   36   79:dup             
	//   37   80:aload_0         
	//   38   81:aload_1         
	//   39   82:invokespecial   #100 <Method void AuthenticationManager$10$1(AuthenticationManager$10, Map)>
	//   40   85:invokestatic    #104 <Method void AuthenticationManager.access$600(AuthenticationManager, Runnable)>
			return;
	//   41   88:return          
		} else
		{
			result = ((Map) (AuthenticationManager.access$900(AuthenticationManager.this, obj)));
	//   42   89:aload_0         
	//   43   90:getfield        #23  <Field AuthenticationManager this$0>
	//   44   93:aload_2         
	//   45   94:invokestatic    #108 <Method FirebaseError AuthenticationManager.access$900(AuthenticationManager, Object)>
	//   46   97:astore_1        
			AuthenticationManager.access$1300(AuthenticationManager.this, val$handler, ((FirebaseError) (result)));
	//   47   98:aload_0         
	//   48   99:getfield        #23  <Field AuthenticationManager this$0>
	//   49  102:aload_0         
	//   50  103:getfield        #27  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
	//   51  106:aload_1         
	//   52  107:invokestatic    #60  <Method void AuthenticationManager.access$1300(AuthenticationManager, com.firebase.client.Firebase$ValueResultHandler, FirebaseError)>
			return;
	//   53  110:return          
		}
	}

	final AuthenticationManager this$0;
	final com.firebase.client.er val$handler;
	final boolean val$logUserOut;

	AuthenticationManager$10()
	{
		this$0 = final_authenticationmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field AuthenticationManager this$0>
		val$logUserOut = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #25  <Field boolean val$logUserOut>
		val$handler = com.firebase.client.er.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field com.firebase.client.Firebase$ValueResultHandler val$handler>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #30  <Method void Object()>
	//   11   19:return          
	}
}
