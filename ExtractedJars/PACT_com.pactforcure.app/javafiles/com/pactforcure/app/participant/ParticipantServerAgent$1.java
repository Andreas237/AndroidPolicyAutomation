// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.participant;

import com.pactforcure.app.api.SimpleCallback;
import com.pactforcure.app.api.dto.BaseDtoV2;
import com.pactforcure.app.api.dto.ErrorV2;
import retrofit2.*;

// Referenced classes of package com.pactforcure.app.participant:
//			ParticipantServerAgent

class ParticipantServerAgent$1
	implements Callback
{

	public void onFailure(Call call, Throwable throwable)
	{
		val$cb.onError(((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SimpleCallback val$cb>
	//    2    4:aconst_null     
	//    3    5:invokeinterface #34  <Method void SimpleCallback.onError(String)>
	//    4   10:return          
	}

	public void onResponse(Call call, Response response)
	{
		call = ((Call) ((BaseDtoV2)response.body()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #44  <Method Object Response.body()>
	//    2    4:checkcast       #46  <Class BaseDtoV2>
	//    3    7:astore_1        
		if(call == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       22
		{
			val$cb.onSuccess();
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field SimpleCallback val$cb>
	//    8   16:invokeinterface #49  <Method void SimpleCallback.onSuccess()>
			return;
	//    9   21:return          
		} else
		{
			val$cb.onError(((BaseDtoV2) (call)).getError().getCode());
	//   10   22:aload_0         
	//   11   23:getfield        #22  <Field SimpleCallback val$cb>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #53  <Method ErrorV2 BaseDtoV2.getError()>
	//   14   30:invokevirtual   #59  <Method String ErrorV2.getCode()>
	//   15   33:invokeinterface #34  <Method void SimpleCallback.onError(String)>
			return;
	//   16   38:return          
		}
	}

	final ParticipantServerAgent this$0;
	final SimpleCallback val$cb;

	ParticipantServerAgent$1()
	{
		this$0 = final_participantserveragent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ParticipantServerAgent this$0>
		val$cb = SimpleCallback.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field SimpleCallback val$cb>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
