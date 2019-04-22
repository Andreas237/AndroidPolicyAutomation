// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.core.Path;
import com.firebase.client.core.PersistentConnection;
import com.firebase.client.utilities.LogWrapper;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.firebase.client.authentication:
//			AuthenticationManager

class AuthenticationManager$12$1
	implements com.firebase.client.
{

	public void onComplete(FirebaseError firebaseerror, Firebase firebase)
	{
		if(val$listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field AuthenticationManager$12 this$1>
	//*   2    4:getfield        #26  <Field com.firebase.client.Firebase$CompletionListener AuthenticationManager$12.val$listener>
	//*   3    7:ifnull          51
		{
			firebase = new Firebase(AuthenticationManager.access$1700(this$0), new Path(""));
	//    4   10:new             #28  <Class Firebase>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field AuthenticationManager$12 this$1>
	//    8   18:getfield        #32  <Field AuthenticationManager AuthenticationManager$12.this$0>
	//    9   21:invokestatic    #38  <Method com.firebase.client.core.Repo AuthenticationManager.access$1700(AuthenticationManager)>
	//   10   24:new             #40  <Class Path>
	//   11   27:dup             
	//   12   28:ldc1            #42  <String "">
	//   13   30:invokespecial   #45  <Method void Path(String)>
	//   14   33:invokespecial   #48  <Method void Firebase(com.firebase.client.core.Repo, Path)>
	//   15   36:astore_2        
			val$listener.onComplete(firebaseerror, firebase);
	//   16   37:aload_0         
	//   17   38:getfield        #17  <Field AuthenticationManager$12 this$1>
	//   18   41:getfield        #26  <Field com.firebase.client.Firebase$CompletionListener AuthenticationManager$12.val$listener>
	//   19   44:aload_1         
	//   20   45:aload_2         
	//   21   46:invokeinterface #50  <Method void com.firebase.client.Firebase$CompletionListener.onComplete(FirebaseError, Firebase)>
		}
	//   22   51:return          
	}

	final AuthenticationManager._cls12 this$1;

	AuthenticationManager$12$1()
	{
		this$1 = AuthenticationManager._cls12.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AuthenticationManager$12 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/firebase/client/authentication/AuthenticationManager$12

/* anonymous class */
	class AuthenticationManager._cls12
		implements Runnable
	{

		public void run()
		{
			AuthenticationManager.access$1400(AuthenticationManager.this);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field AuthenticationManager this$0>
		//    2    4:invokestatic    #36  <Method void AuthenticationManager.access$1400(AuthenticationManager)>
			AuthenticationManager.access$1500(AuthenticationManager.this, ((com.firebase.client.AuthData) (null)));
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field AuthenticationManager this$0>
		//    5   11:aconst_null     
		//    6   12:invokestatic    #40  <Method void AuthenticationManager.access$1500(AuthenticationManager, com.firebase.client.AuthData)>
			semaphore.release();
		//    7   15:aload_0         
		//    8   16:getfield        #25  <Field Semaphore val$semaphore>
		//    9   19:invokevirtual   #45  <Method void Semaphore.release()>
			boolean _tmp = AuthenticationManager.access$1600(AuthenticationManager.this);
		//   10   22:aload_0         
		//   11   23:getfield        #23  <Field AuthenticationManager this$0>
		//   12   26:invokestatic    #49  <Method boolean AuthenticationManager.access$1600(AuthenticationManager)>
		//   13   29:pop             
			AuthenticationManager.access$500(AuthenticationManager.this).unauth(((com.firebase.client.Firebase.CompletionListener) (new AuthenticationManager._cls12._cls1())));
		//   14   30:aload_0         
		//   15   31:getfield        #23  <Field AuthenticationManager this$0>
		//   16   34:invokestatic    #53  <Method PersistentConnection AuthenticationManager.access$500(AuthenticationManager)>
		//   17   37:new             #13  <Class AuthenticationManager$12$1>
		//   18   40:dup             
		//   19   41:aload_0         
		//   20   42:invokespecial   #56  <Method void AuthenticationManager$12$1(AuthenticationManager$12)>
		//   21   45:invokevirtual   #61  <Method void PersistentConnection.unauth(com.firebase.client.Firebase$CompletionListener)>
			if(AuthenticationManager.access$500(AuthenticationManager.this).writesPaused())
		//*  22   48:aload_0         
		//*  23   49:getfield        #23  <Field AuthenticationManager this$0>
		//*  24   52:invokestatic    #53  <Method PersistentConnection AuthenticationManager.access$500(AuthenticationManager)>
		//*  25   55:invokevirtual   #65  <Method boolean PersistentConnection.writesPaused()>
		//*  26   58:ifeq            96
			{
				if(AuthenticationManager.access$1800(AuthenticationManager.this).logsDebug())
		//*  27   61:aload_0         
		//*  28   62:getfield        #23  <Field AuthenticationManager this$0>
		//*  29   65:invokestatic    #69  <Method LogWrapper AuthenticationManager.access$1800(AuthenticationManager)>
		//*  30   68:invokevirtual   #74  <Method boolean LogWrapper.logsDebug()>
		//*  31   71:ifeq            86
					AuthenticationManager.access$1800(AuthenticationManager.this).debug("Unpausing writes after explicit unauth.");
		//   32   74:aload_0         
		//   33   75:getfield        #23  <Field AuthenticationManager this$0>
		//   34   78:invokestatic    #69  <Method LogWrapper AuthenticationManager.access$1800(AuthenticationManager)>
		//   35   81:ldc1            #76  <String "Unpausing writes after explicit unauth.">
		//   36   83:invokevirtual   #80  <Method void LogWrapper.debug(String)>
				AuthenticationManager.access$500(AuthenticationManager.this).unpauseWrites();
		//   37   86:aload_0         
		//   38   87:getfield        #23  <Field AuthenticationManager this$0>
		//   39   90:invokestatic    #53  <Method PersistentConnection AuthenticationManager.access$500(AuthenticationManager)>
		//   40   93:invokevirtual   #83  <Method void PersistentConnection.unpauseWrites()>
			}
		//   41   96:return          
		}

		final AuthenticationManager this$0;
		final com.firebase.client.Firebase.CompletionListener val$listener;
		final Semaphore val$semaphore;

			
			{
				this$0 = final_authenticationmanager;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field AuthenticationManager this$0>
				semaphore = semaphore1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Semaphore val$semaphore>
				listener = com.firebase.client.Firebase.CompletionListener.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field com.firebase.client.Firebase$CompletionListener val$listener>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
	}

}
