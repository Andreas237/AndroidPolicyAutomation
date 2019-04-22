// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.firebase.client.FirebaseError;
import com.firebase.client.utilities.Utilities;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.firebase.client.authentication:
//			RequestHandler, AuthenticationManager

class AuthenticationManager$9
	implements RequestHandler
{

	public void onError(IOException ioexception)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("There was an exception while connecting to the authentication server: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "There was an exception while connecting to the authentication server: ">
	//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(ioexception.getLocalizedMessage());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #42  <Method String IOException.getLocalizedMessage()>
	//   11   20:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		ioexception = ((IOException) (new FirebaseError(-24, stringbuilder.toString())));
	//   13   24:new             #44  <Class FirebaseError>
	//   14   27:dup             
	//   15   28:bipush          -24
	//   16   30:aload_2         
	//   17   31:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   18   34:invokespecial   #50  <Method void FirebaseError(int, String)>
	//   19   37:astore_1        
		AuthenticationManager.access$1000(AuthenticationManager.this, ((FirebaseError) (ioexception)), val$attempt);
	//   20   38:aload_0         
	//   21   39:getfield        #19  <Field AuthenticationManager this$0>
	//   22   42:aload_1         
	//   23   43:aload_0         
	//   24   44:getfield        #21  <Field AuthenticationManager$AuthAttempt val$attempt>
	//   25   47:invokestatic    #54  <Method void AuthenticationManager.access$1000(AuthenticationManager, FirebaseError, AuthenticationManager$AuthAttempt)>
	//   26   50:return          
	}

	public void onResult(Map map)
	{
		Object obj = map.get("error");
	//    0    0:aload_1         
	//    1    1:ldc1            #58  <String "error">
	//    2    3:invokeinterface #64  <Method Object Map.get(Object)>
	//    3    8:astore_2        
		String s = (String)Utilities.getOrNull(((Object) (map)), "token", java/lang/String);
	//    4    9:aload_1         
	//    5   10:ldc1            #66  <String "token">
	//    6   12:ldc1            #68  <Class String>
	//    7   14:invokestatic    #74  <Method Object Utilities.getOrNull(Object, String, Class)>
	//    8   17:checkcast       #68  <Class String>
	//    9   20:astore_3        
		if(obj == null && s != null)
	//*  10   21:aload_2         
	//*  11   22:ifnonnull       57
	//*  12   25:aload_3         
	//*  13   26:ifnull          57
		{
			if(!AuthenticationManager.access$700(AuthenticationManager.this, val$attempt))
	//*  14   29:aload_0         
	//*  15   30:getfield        #19  <Field AuthenticationManager this$0>
	//*  16   33:aload_0         
	//*  17   34:getfield        #21  <Field AuthenticationManager$AuthAttempt val$attempt>
	//*  18   37:invokestatic    #78  <Method boolean AuthenticationManager.access$700(AuthenticationManager, AuthenticationManager$AuthAttempt)>
	//*  19   40:ifne            78
			{
				AuthenticationManager.access$800(AuthenticationManager.this, s, map, val$attempt);
	//   20   43:aload_0         
	//   21   44:getfield        #19  <Field AuthenticationManager this$0>
	//   22   47:aload_3         
	//   23   48:aload_1         
	//   24   49:aload_0         
	//   25   50:getfield        #21  <Field AuthenticationManager$AuthAttempt val$attempt>
	//   26   53:invokestatic    #82  <Method void AuthenticationManager.access$800(AuthenticationManager, String, Map, AuthenticationManager$AuthAttempt)>
				return;
	//   27   56:return          
			}
		} else
		{
			map = ((Map) (AuthenticationManager.access$900(AuthenticationManager.this, obj)));
	//   28   57:aload_0         
	//   29   58:getfield        #19  <Field AuthenticationManager this$0>
	//   30   61:aload_2         
	//   31   62:invokestatic    #86  <Method FirebaseError AuthenticationManager.access$900(AuthenticationManager, Object)>
	//   32   65:astore_1        
			AuthenticationManager.access$1000(AuthenticationManager.this, ((FirebaseError) (map)), val$attempt);
	//   33   66:aload_0         
	//   34   67:getfield        #19  <Field AuthenticationManager this$0>
	//   35   70:aload_1         
	//   36   71:aload_0         
	//   37   72:getfield        #21  <Field AuthenticationManager$AuthAttempt val$attempt>
	//   38   75:invokestatic    #54  <Method void AuthenticationManager.access$1000(AuthenticationManager, FirebaseError, AuthenticationManager$AuthAttempt)>
		}
	//   39   78:return          
	}

	final AuthenticationManager this$0;
	final thAttempt val$attempt;

	AuthenticationManager$9()
	{
		this$0 = final_authenticationmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AuthenticationManager this$0>
		val$attempt = thAttempt.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field AuthenticationManager$AuthAttempt val$attempt>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
