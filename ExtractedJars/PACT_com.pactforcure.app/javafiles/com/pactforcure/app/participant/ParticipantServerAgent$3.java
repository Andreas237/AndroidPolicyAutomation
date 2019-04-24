// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.participant;

import com.pactforcure.app.api.SimpleCallback;
import com.pactforcure.app.api.dto.BaseDto;
import com.pactforcure.app.api.dto.CodeDescriptionError;
import retrofit2.*;

// Referenced classes of package com.pactforcure.app.participant:
//			ParticipantServerAgent

class ParticipantServerAgent$3
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
label0:
		{
			call = ((Call) ((BaseDto)response.body()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #44  <Method Object Response.body()>
	//    2    4:checkcast       #46  <Class BaseDto>
	//    3    7:astore_1        
			if(call != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
			{
				if(!((BaseDto) (call)).getSuccess().booleanValue())
					break label0;
	//    6   12:aload_1         
	//    7   13:invokevirtual   #50  <Method Boolean BaseDto.getSuccess()>
	//    8   16:invokevirtual   #56  <Method boolean Boolean.booleanValue()>
	//    9   19:ifeq            32
				val$cb.onSuccess();
	//   10   22:aload_0         
	//   11   23:getfield        #22  <Field SimpleCallback val$cb>
	//   12   26:invokeinterface #59  <Method void SimpleCallback.onSuccess()>
			}
			return;
	//   13   31:return          
		}
		val$cb.onError(((BaseDto) (call)).getError().getDescription());
	//   14   32:aload_0         
	//   15   33:getfield        #22  <Field SimpleCallback val$cb>
	//   16   36:aload_1         
	//   17   37:invokevirtual   #63  <Method CodeDescriptionError BaseDto.getError()>
	//   18   40:invokevirtual   #69  <Method String CodeDescriptionError.getDescription()>
	//   19   43:invokeinterface #34  <Method void SimpleCallback.onError(String)>
	//   20   48:return          
	}

	final ParticipantServerAgent this$0;
	final SimpleCallback val$cb;

	ParticipantServerAgent$3()
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
