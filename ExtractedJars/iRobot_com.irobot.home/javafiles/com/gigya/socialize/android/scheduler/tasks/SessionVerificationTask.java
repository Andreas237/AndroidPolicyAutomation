// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.scheduler.tasks;

import android.content.Intent;
import android.support.v4.content.c;
import com.gigya.socialize.*;
import com.gigya.socialize.android.GSAPI;
import com.gigya.socialize.android.log.GigyaLog;
import com.gigya.socialize.android.scheduler.PeriodicTask;

public class SessionVerificationTask extends PeriodicTask
{

	public SessionVerificationTask(GSAPI gsapi, long l)
	{
		super("SessionVerificationTask", l);
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <String "SessionVerificationTask">
	//    2    3:lload_2         
	//    3    4:invokespecial   #29  <Method void PeriodicTask(String, long)>
		api = gsapi;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:putfield        #31  <Field GSAPI api>
	//    7   12:return          
	}

	private void onPendingSessionError(GSObject gsobject)
	{
		api.onSessionVerificationFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field GSAPI api>
	//    2    4:invokevirtual   #44  <Method void GSAPI.onSessionVerificationFailed()>
		Intent intent = new Intent("session_verification");
	//    3    7:new             #46  <Class Intent>
	//    4   10:dup             
	//    5   11:ldc1            #19  <String "session_verification">
	//    6   13:invokespecial   #49  <Method void Intent(String)>
	//    7   16:astore_2        
		intent.putExtra("session_verification_data", ((java.io.Serializable) (gsobject)));
	//    8   17:aload_2         
	//    9   18:ldc1            #10  <String "session_verification_data">
	//   10   20:aload_1         
	//   11   21:invokevirtual   #53  <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   12   24:pop             
		if(api.getResumedActivityName() != null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #31  <Field GSAPI api>
	//*  15   29:invokevirtual   #57  <Method String GSAPI.getResumedActivityName()>
	//*  16   32:ifnull          49
			intent.putExtra("session_verification_target", api.getResumedActivityName());
	//   17   35:aload_2         
	//   18   36:ldc1            #22  <String "session_verification_target">
	//   19   38:aload_0         
	//   20   39:getfield        #31  <Field GSAPI api>
	//   21   42:invokevirtual   #57  <Method String GSAPI.getResumedActivityName()>
	//   22   45:invokevirtual   #60  <Method Intent Intent.putExtra(String, String)>
	//   23   48:pop             
		c.a(api.getContext()).a(intent);
	//   24   49:aload_0         
	//   25   50:getfield        #31  <Field GSAPI api>
	//   26   53:invokevirtual   #64  <Method android.content.Context GSAPI.getContext()>
	//   27   56:invokestatic    #70  <Method c c.a(android.content.Context)>
	//   28   59:aload_2         
	//   29   60:invokevirtual   #73  <Method boolean c.a(Intent)>
	//   30   63:pop             
	//   31   64:return          
	}

	public void run()
	{
		api.sendRequest("accounts.verifyLogin", ((GSObject) (null)), new GSResponseListener() {

			public void onGSResponse(String s, GSResponse gsresponse, Object obj)
			{
				if(gsresponse.getErrorCode() == 0)
			//*   0    0:aload_2         
			//*   1    1:invokevirtual   #28  <Method int GSResponse.getErrorCode()>
			//*   2    4:ifne            15
				{
					GigyaLog.d("SessionVerificationTask", "Verify login success");
			//    3    7:ldc1            #30  <String "SessionVerificationTask">
			//    4    9:ldc1            #32  <String "Verify login success">
			//    5   11:invokestatic    #38  <Method void GigyaLog.d(String, String)>
					return;
			//    6   14:return          
				}
				int i = gsresponse.getErrorCode();
			//    7   15:aload_2         
			//    8   16:invokevirtual   #28  <Method int GSResponse.getErrorCode()>
			//    9   19:istore          4
				s = ((String) (new StringBuilder()));
			//   10   21:new             #40  <Class StringBuilder>
			//   11   24:dup             
			//   12   25:invokespecial   #41  <Method void StringBuilder()>
			//   13   28:astore_1        
				((StringBuilder) (s)).append("Verify login error with error code: ");
			//   14   29:aload_1         
			//   15   30:ldc1            #43  <String "Verify login error with error code: ">
			//   16   32:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
			//   17   35:pop             
				((StringBuilder) (s)).append(i);
			//   18   36:aload_1         
			//   19   37:iload           4
			//   20   39:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
			//   21   42:pop             
				GigyaLog.d("SessionVerificationTask", ((StringBuilder) (s)).toString());
			//   22   43:ldc1            #30  <String "SessionVerificationTask">
			//   23   45:aload_1         
			//   24   46:invokevirtual   #54  <Method String StringBuilder.toString()>
			//   25   49:invokestatic    #38  <Method void GigyaLog.d(String, String)>
				if(i == 0x7a13a)
			//*  26   52:iload           4
			//*  27   54:ldc1            #55  <Int 0x7a13a>
			//*  28   56:icmpne          67
				{
					GigyaLog.d("SessionVerificationTask", "Verify login error - Network - ignore should not affect session");
			//   29   59:ldc1            #30  <String "SessionVerificationTask">
			//   30   61:ldc1            #57  <String "Verify login error - Network - ignore should not affect session">
			//   31   63:invokestatic    #38  <Method void GigyaLog.d(String, String)>
					return;
			//   32   66:return          
				} else
				{
					onPendingSessionError(gsresponse.getData());
			//   33   67:aload_0         
			//   34   68:getfield        #17  <Field SessionVerificationTask this$0>
			//   35   71:aload_2         
			//   36   72:invokevirtual   #61  <Method GSObject GSResponse.getData()>
			//   37   75:invokestatic    #65  <Method void SessionVerificationTask.access$000(SessionVerificationTask, GSObject)>
					return;
			//   38   78:return          
				}
			}

			final SessionVerificationTask this$0;

			
			{
				this$0 = SessionVerificationTask.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SessionVerificationTask this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field GSAPI api>
	//    2    4:ldc1            #76  <String "accounts.verifyLogin">
	//    3    6:aconst_null     
	//    4    7:new             #6   <Class SessionVerificationTask$1>
	//    5   10:dup             
	//    6   11:aload_0         
	//    7   12:invokespecial   #79  <Method void SessionVerificationTask$1(SessionVerificationTask)>
	//    8   15:aconst_null     
	//    9   16:invokevirtual   #83  <Method void GSAPI.sendRequest(String, GSObject, GSResponseListener, Object)>
	//   10   19:return          
	}

	public static final String DATA = "session_verification_data";
	private static final int ERROR_CODE_NETWORK = 0x7a13a;
	public static final String ID = "SessionVerificationTask";
	public static final String INTENT_FILTER = "session_verification";
	public static final String TARGET = "session_verification_target";
	private GSAPI api;


/*
	static void access$000(SessionVerificationTask sessionverificationtask, GSObject gsobject)
	{
		sessionverificationtask.onPendingSessionError(gsobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void onPendingSessionError(GSObject)>
		return;
	//    3    5:return          
	}

*/
}
