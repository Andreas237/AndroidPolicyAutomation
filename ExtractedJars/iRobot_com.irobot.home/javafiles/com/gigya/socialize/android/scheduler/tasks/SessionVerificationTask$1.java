// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.scheduler.tasks;

import com.gigya.socialize.GSResponse;
import com.gigya.socialize.GSResponseListener;
import com.gigya.socialize.android.log.GigyaLog;

// Referenced classes of package com.gigya.socialize.android.scheduler.tasks:
//			SessionVerificationTask

class SessionVerificationTask$1
	implements GSResponseListener
{

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
			SessionVerificationTask.access$000(SessionVerificationTask.this, gsresponse.getData());
	//   33   67:aload_0         
	//   34   68:getfield        #17  <Field SessionVerificationTask this$0>
	//   35   71:aload_2         
	//   36   72:invokevirtual   #61  <Method com.gigya.socialize.GSObject GSResponse.getData()>
	//   37   75:invokestatic    #65  <Method void SessionVerificationTask.access$000(SessionVerificationTask, com.gigya.socialize.GSObject)>
			return;
	//   38   78:return          
		}
	}

	final SessionVerificationTask this$0;

	SessionVerificationTask$1()
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
