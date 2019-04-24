// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.participant;

import com.pactforcure.app.api.dto.*;
import retrofit2.*;

// Referenced classes of package com.pactforcure.app.participant:
//			ParticipantServerAgent

class ParticipantServerAgent$2
	implements Callback
{

	public void onFailure(Call call, Throwable throwable)
	{
		val$cb.onError(new ErrorV2(-1));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field DtoCallbackV2 val$cb>
	//    2    4:new             #30  <Class ErrorV2>
	//    3    7:dup             
	//    4    8:iconst_m1       
	//    5    9:invokespecial   #33  <Method void ErrorV2(int)>
	//    6   12:invokeinterface #39  <Method void DtoCallbackV2.onError(ErrorV2)>
	//    7   17:return          
	}

	public void onResponse(Call call, Response response)
	{
label0:
		{
			call = ((Call) ((BaseDtoV2)response.body()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #49  <Method Object Response.body()>
	//    2    4:checkcast       #51  <Class BaseDtoV2>
	//    3    7:astore_1        
			if(call != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          32
			{
				if(!((BaseDtoV2) (call)).getSuccess().booleanValue())
					break label0;
	//    6   12:aload_1         
	//    7   13:invokevirtual   #55  <Method Boolean BaseDtoV2.getSuccess()>
	//    8   16:invokevirtual   #61  <Method boolean Boolean.booleanValue()>
	//    9   19:ifeq            33
				val$cb.onSuccess(((Object) (call)));
	//   10   22:aload_0         
	//   11   23:getfield        #22  <Field DtoCallbackV2 val$cb>
	//   12   26:aload_1         
	//   13   27:invokeinterface #65  <Method void DtoCallbackV2.onSuccess(Object)>
			}
			return;
	//   14   32:return          
		}
		val$cb.onError(((BaseDtoV2) (call)).getError());
	//   15   33:aload_0         
	//   16   34:getfield        #22  <Field DtoCallbackV2 val$cb>
	//   17   37:aload_1         
	//   18   38:invokevirtual   #69  <Method ErrorV2 BaseDtoV2.getError()>
	//   19   41:invokeinterface #39  <Method void DtoCallbackV2.onError(ErrorV2)>
	//   20   46:return          
	}

	final ParticipantServerAgent this$0;
	final DtoCallbackV2 val$cb;

	ParticipantServerAgent$2()
	{
		this$0 = final_participantserveragent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ParticipantServerAgent this$0>
		val$cb = DtoCallbackV2.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field DtoCallbackV2 val$cb>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
