// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.participant;

import com.pactforcure.app.api.*;
import com.pactforcure.app.api.dto.*;
import com.pactforcure.app.core.BackboneApplication;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.survey.PpdResultsStorage;
import com.pactforcure.app.tip.TipOfTheWeekContentFetcher;
import com.pactforcure.app.util.VersionUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import retrofit2.*;

// Referenced classes of package com.pactforcure.app.participant:
//			ParticipantStorage, Participant

public class ParticipantServerAgent
{

	public ParticipantServerAgent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		participant = ParticipantStorage.getParticipant();
	//    2    4:aload_0         
	//    3    5:invokestatic    #32  <Method Participant ParticipantStorage.getParticipant()>
	//    4    8:putfield        #34  <Field Participant participant>
	//    5   11:aload_0         
	//    6   12:invokestatic    #40  <Method BackboneApplication BackboneApplication.get()>
	//    7   15:invokevirtual   #44  <Method ApiService BackboneApplication.getApi()>
	//    8   18:putfield        #46  <Field ApiService api>
	//    9   21:aload_0         
	//   10   22:invokestatic    #40  <Method BackboneApplication BackboneApplication.get()>
	//   11   25:invokevirtual   #50  <Method AuthorizedApiService BackboneApplication.getAuthorizedApi()>
	//   12   28:putfield        #52  <Field AuthorizedApiService authorizedApi>
	//   13   31:return          
	}

	private Callback dtoCallbackAdapter(final DtoCallback cb)
	{
		return new Callback() {

			public void onFailure(Call call, Throwable throwable)
			{
				cb.onError(new CodeDescriptionError(-1));
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field DtoCallback val$cb>
			//    2    4:new             #30  <Class CodeDescriptionError>
			//    3    7:dup             
			//    4    8:iconst_m1       
			//    5    9:invokespecial   #33  <Method void CodeDescriptionError(int)>
			//    6   12:invokeinterface #39  <Method void DtoCallback.onError(CodeDescriptionError)>
			//    7   17:return          
			}

			public void onResponse(Call call, Response response)
			{
				call = ((Call) ((BaseDto)response.body()));
			//    0    0:aload_2         
			//    1    1:invokevirtual   #49  <Method Object Response.body()>
			//    2    4:checkcast       #51  <Class BaseDto>
			//    3    7:astore_1        
				if(call != null)
			//*   4    8:aload_1         
			//*   5    9:ifnull          47
				{
					if(((BaseDto) (call)).getSuccess().booleanValue())
			//*   6   12:aload_1         
			//*   7   13:invokevirtual   #55  <Method Boolean BaseDto.getSuccess()>
			//*   8   16:invokevirtual   #61  <Method boolean Boolean.booleanValue()>
			//*   9   19:ifeq            33
					{
						cb.onSuccess(((Object) (call)));
			//   10   22:aload_0         
			//   11   23:getfield        #22  <Field DtoCallback val$cb>
			//   12   26:aload_1         
			//   13   27:invokeinterface #65  <Method void DtoCallback.onSuccess(Object)>
						return;
			//   14   32:return          
					} else
					{
						cb.onError(((BaseDto) (call)).getError());
			//   15   33:aload_0         
			//   16   34:getfield        #22  <Field DtoCallback val$cb>
			//   17   37:aload_1         
			//   18   38:invokevirtual   #69  <Method CodeDescriptionError BaseDto.getError()>
			//   19   41:invokeinterface #39  <Method void DtoCallback.onError(CodeDescriptionError)>
						return;
			//   20   46:return          
					}
				} else
				{
					cb.onError(new CodeDescriptionError(-2));
			//   21   47:aload_0         
			//   22   48:getfield        #22  <Field DtoCallback val$cb>
			//   23   51:new             #30  <Class CodeDescriptionError>
			//   24   54:dup             
			//   25   55:bipush          -2
			//   26   57:invokespecial   #33  <Method void CodeDescriptionError(int)>
			//   27   60:invokeinterface #39  <Method void DtoCallback.onError(CodeDescriptionError)>
					return;
			//   28   65:return          
				}
			}

			final ParticipantServerAgent this$0;
			final DtoCallback val$cb;

			
			{
				this$0 = ParticipantServerAgent.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ParticipantServerAgent this$0>
				cb = dtocallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field DtoCallback val$cb>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #12  <Class ParticipantServerAgent$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #58  <Method void ParticipantServerAgent$4(ParticipantServerAgent, DtoCallback)>
	//    5    9:areturn         
	}

	private Callback dtoCallbackAdapterV2(final DtoCallbackV2 cb)
	{
		return new Callback() {

			public void onFailure(Call call, Throwable throwable)
			{
				cb.onError(new ErrorV2(-1));
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
						cb.onSuccess(((Object) (call)));
			//   10   22:aload_0         
			//   11   23:getfield        #22  <Field DtoCallbackV2 val$cb>
			//   12   26:aload_1         
			//   13   27:invokeinterface #65  <Method void DtoCallbackV2.onSuccess(Object)>
					}
					return;
			//   14   32:return          
				}
				cb.onError(((BaseDtoV2) (call)).getError());
			//   15   33:aload_0         
			//   16   34:getfield        #22  <Field DtoCallbackV2 val$cb>
			//   17   37:aload_1         
			//   18   38:invokevirtual   #69  <Method ErrorV2 BaseDtoV2.getError()>
			//   19   41:invokeinterface #39  <Method void DtoCallbackV2.onError(ErrorV2)>
			//   20   46:return          
			}

			final ParticipantServerAgent this$0;
			final DtoCallbackV2 val$cb;

			
			{
				this$0 = ParticipantServerAgent.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ParticipantServerAgent this$0>
				cb = dtocallbackv2;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field DtoCallbackV2 val$cb>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #8   <Class ParticipantServerAgent$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #65  <Method void ParticipantServerAgent$2(ParticipantServerAgent, DtoCallbackV2)>
	//    5    9:areturn         
	}

	private Callback simpleCallbackAdapter(final SimpleCallback cb)
	{
		return new Callback() {

			public void onFailure(Call call, Throwable throwable)
			{
				cb.onError(((String) (null)));
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
						cb.onSuccess();
			//   10   22:aload_0         
			//   11   23:getfield        #22  <Field SimpleCallback val$cb>
			//   12   26:invokeinterface #59  <Method void SimpleCallback.onSuccess()>
					}
					return;
			//   13   31:return          
				}
				cb.onError(((BaseDto) (call)).getError().getDescription());
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

			
			{
				this$0 = ParticipantServerAgent.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ParticipantServerAgent this$0>
				cb = simplecallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field SimpleCallback val$cb>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #10  <Class ParticipantServerAgent$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #71  <Method void ParticipantServerAgent$3(ParticipantServerAgent, SimpleCallback)>
	//    5    9:areturn         
	}

	private Call updateProfile(Participant participant1)
	{
		return api.updateProfile(ParticipantStorage.getAccessToken(), participant1.firstName, participant1.lastName, participant1.email, participant1.telephone, participant1.optOut, participant1.inWatchStudy, PpdResultsStorage.hasSentDnaKitBack(Res.getStudyId()), TipOfTheWeekContentFetcher.getNumberOfDeliveredTips());
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field ApiService api>
	//    2    4:invokestatic    #78  <Method String ParticipantStorage.getAccessToken()>
	//    3    7:aload_1         
	//    4    8:getfield        #83  <Field String Participant.firstName>
	//    5   11:aload_1         
	//    6   12:getfield        #86  <Field String Participant.lastName>
	//    7   15:aload_1         
	//    8   16:getfield        #89  <Field String Participant.email>
	//    9   19:aload_1         
	//   10   20:getfield        #92  <Field String Participant.telephone>
	//   11   23:aload_1         
	//   12   24:getfield        #96  <Field boolean Participant.optOut>
	//   13   27:aload_1         
	//   14   28:getfield        #99  <Field boolean Participant.inWatchStudy>
	//   15   31:invokestatic    #105 <Method com.pactforcure.app.studies.StudyId Res.getStudyId()>
	//   16   34:invokestatic    #111 <Method boolean PpdResultsStorage.hasSentDnaKitBack(com.pactforcure.app.studies.StudyId)>
	//   17   37:invokestatic    #117 <Method int TipOfTheWeekContentFetcher.getNumberOfDeliveredTips()>
	//   18   40:invokeinterface #122 <Method Call ApiService.updateProfile(String, String, String, String, String, boolean, boolean, boolean, int)>
	//   19   45:areturn         
	}

	public void leaveDna(DtoCallback dtocallback)
	{
		String s = ParticipantStorage.getAccessToken();
	//    0    0:invokestatic    #78  <Method String ParticipantStorage.getAccessToken()>
	//    1    3:astore_2        
		api.leaveDna(s).enqueue(dtoCallbackAdapter(dtocallback));
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field ApiService api>
	//    4    8:aload_2         
	//    5    9:invokeinterface #128 <Method Call ApiService.leaveDna(String)>
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokespecial   #130 <Method Callback dtoCallbackAdapter(DtoCallback)>
	//    9   19:invokeinterface #136 <Method void Call.enqueue(Callback)>
	//   10   24:return          
	}

	public void login(String s, String s1, DtoCallbackV2 dtocallbackv2)
	{
		api.login(s, s1).enqueue(dtoCallbackAdapterV2(dtocallbackv2));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field ApiService api>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #142 <Method Call ApiService.login(String, String)>
	//    5   11:aload_0         
	//    6   12:aload_3         
	//    7   13:invokespecial   #144 <Method Callback dtoCallbackAdapterV2(DtoCallbackV2)>
	//    8   16:invokeinterface #136 <Method void Call.enqueue(Callback)>
	//    9   21:return          
	}

	public void logout(final SimpleCallback cb)
	{
		authorizedApi.logout().enqueue(new Callback() {

			public void onFailure(Call call, Throwable throwable)
			{
				cb.onError(((String) (null)));
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
					cb.onSuccess();
			//    6   12:aload_0         
			//    7   13:getfield        #22  <Field SimpleCallback val$cb>
			//    8   16:invokeinterface #49  <Method void SimpleCallback.onSuccess()>
					return;
			//    9   21:return          
				} else
				{
					cb.onError(((BaseDtoV2) (call)).getError().getCode());
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

			
			{
				this$0 = ParticipantServerAgent.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ParticipantServerAgent this$0>
				cb = simplecallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field SimpleCallback val$cb>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field AuthorizedApiService authorizedApi>
	//    2    4:invokeinterface #152 <Method Call AuthorizedApiService.logout()>
	//    3    9:new             #6   <Class ParticipantServerAgent$1>
	//    4   12:dup             
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:invokespecial   #153 <Method void ParticipantServerAgent$1(ParticipantServerAgent, SimpleCallback)>
	//    8   18:invokeinterface #136 <Method void Call.enqueue(Callback)>
	//    9   23:return          
	}

	public void optInOrOutContact(boolean flag, SimpleCallback simplecallback)
	{
		Participant participant1 = ParticipantStorage.getParticipant();
	//    0    0:invokestatic    #32  <Method Participant ParticipantStorage.getParticipant()>
	//    1    3:astore_3        
		participant1.optOut = flag;
	//    2    4:aload_3         
	//    3    5:iload_1         
	//    4    6:putfield        #96  <Field boolean Participant.optOut>
		participant1.save();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #158 <Method void Participant.save()>
		updateProfile(participant1).enqueue(simpleCallbackAdapter(simplecallback));
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:invokespecial   #160 <Method Call updateProfile(Participant)>
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokespecial   #162 <Method Callback simpleCallbackAdapter(SimpleCallback)>
	//   13   23:invokeinterface #136 <Method void Call.enqueue(Callback)>
	//   14   28:return          
	}

	public void register(String s, DtoCallback dtocallback)
	{
		BackboneApplication backboneapplication = BackboneApplication.get();
	//    0    0:invokestatic    #40  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:astore          4
		HashMap hashmap = new HashMap();
	//    2    5:new             #166 <Class HashMap>
	//    3    8:dup             
	//    4    9:invokespecial   #167 <Method void HashMap()>
	//    5   12:astore_3        
		((Map) (hashmap)).put("APISecret", ((Object) (MultipartFormFactory.createPartFromString(backboneapplication.getString(0x7f0801bf)))));
	//    6   13:aload_3         
	//    7   14:ldc1            #169 <String "APISecret">
	//    8   16:aload           4
	//    9   18:ldc1            #170 <Int 0x7f0801bf>
	//   10   20:invokevirtual   #174 <Method String BackboneApplication.getString(int)>
	//   11   23:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   12   26:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   13   31:pop             
		((Map) (hashmap)).put("studyId", ((Object) (MultipartFormFactory.createPartFromString(participant.getStudyId()))));
	//   14   32:aload_3         
	//   15   33:ldc1            #188 <String "studyId">
	//   16   35:aload_0         
	//   17   36:getfield        #34  <Field Participant participant>
	//   18   39:invokevirtual   #190 <Method String Participant.getStudyId()>
	//   19   42:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   20   45:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   21   50:pop             
		((Map) (hashmap)).put("firstName", ((Object) (MultipartFormFactory.createPartFromString(participant.getFirstName()))));
	//   22   51:aload_3         
	//   23   52:ldc1            #191 <String "firstName">
	//   24   54:aload_0         
	//   25   55:getfield        #34  <Field Participant participant>
	//   26   58:invokevirtual   #194 <Method String Participant.getFirstName()>
	//   27   61:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   28   64:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   29   69:pop             
		((Map) (hashmap)).put("lastName", ((Object) (MultipartFormFactory.createPartFromString(participant.getLastName()))));
	//   30   70:aload_3         
	//   31   71:ldc1            #195 <String "lastName">
	//   32   73:aload_0         
	//   33   74:getfield        #34  <Field Participant participant>
	//   34   77:invokevirtual   #198 <Method String Participant.getLastName()>
	//   35   80:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   36   83:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   37   88:pop             
		((Map) (hashmap)).put("age", ((Object) (MultipartFormFactory.createPartFromString(participant.getAge()))));
	//   38   89:aload_3         
	//   39   90:ldc1            #200 <String "age">
	//   40   92:aload_0         
	//   41   93:getfield        #34  <Field Participant participant>
	//   42   96:invokevirtual   #204 <Method Integer Participant.getAge()>
	//   43   99:invokestatic    #207 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(Integer)>
	//   44  102:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   45  107:pop             
		((Map) (hashmap)).put("race", ((Object) (MultipartFormFactory.createPartFromString(participant.getRace()))));
	//   46  108:aload_3         
	//   47  109:ldc1            #209 <String "race">
	//   48  111:aload_0         
	//   49  112:getfield        #34  <Field Participant participant>
	//   50  115:invokevirtual   #212 <Method String Participant.getRace()>
	//   51  118:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   52  121:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   53  126:pop             
		((Map) (hashmap)).put("email", ((Object) (MultipartFormFactory.createPartFromString(participant.getEmail()))));
	//   54  127:aload_3         
	//   55  128:ldc1            #213 <String "email">
	//   56  130:aload_0         
	//   57  131:getfield        #34  <Field Participant participant>
	//   58  134:invokevirtual   #216 <Method String Participant.getEmail()>
	//   59  137:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   60  140:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   61  145:pop             
		((Map) (hashmap)).put("password", ((Object) (MultipartFormFactory.createPartFromString(s))));
	//   62  146:aload_3         
	//   63  147:ldc1            #218 <String "password">
	//   64  149:aload_1         
	//   65  150:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   66  153:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   67  158:pop             
		((Map) (hashmap)).put("passwordConfirm", ((Object) (MultipartFormFactory.createPartFromString(s))));
	//   68  159:aload_3         
	//   69  160:ldc1            #220 <String "passwordConfirm">
	//   70  162:aload_1         
	//   71  163:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   72  166:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   73  171:pop             
		((Map) (hashmap)).put("telephone", ((Object) (MultipartFormFactory.createPartFromString(participant.getTelephone()))));
	//   74  172:aload_3         
	//   75  173:ldc1            #221 <String "telephone">
	//   76  175:aload_0         
	//   77  176:getfield        #34  <Field Participant participant>
	//   78  179:invokevirtual   #224 <Method String Participant.getTelephone()>
	//   79  182:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   80  185:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   81  190:pop             
		((Map) (hashmap)).put("optOut", ((Object) (MultipartFormFactory.createPartFromString(Boolean.valueOf(participant.isOptOut())))));
	//   82  191:aload_3         
	//   83  192:ldc1            #225 <String "optOut">
	//   84  194:aload_0         
	//   85  195:getfield        #34  <Field Participant participant>
	//   86  198:invokevirtual   #229 <Method boolean Participant.isOptOut()>
	//   87  201:invokestatic    #235 <Method Boolean Boolean.valueOf(boolean)>
	//   88  204:invokestatic    #238 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(Boolean)>
	//   89  207:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   90  212:pop             
		((Map) (hashmap)).put("appVersion", ((Object) (MultipartFormFactory.createPartFromString((new StringBuilder()).append("android-").append(VersionUtils.getVersionName()).toString()))));
	//   91  213:aload_3         
	//   92  214:ldc1            #240 <String "appVersion">
	//   93  216:new             #242 <Class StringBuilder>
	//   94  219:dup             
	//   95  220:invokespecial   #243 <Method void StringBuilder()>
	//   96  223:ldc1            #245 <String "android-">
	//   97  225:invokevirtual   #249 <Method StringBuilder StringBuilder.append(String)>
	//   98  228:invokestatic    #254 <Method String VersionUtils.getVersionName()>
	//   99  231:invokevirtual   #249 <Method StringBuilder StringBuilder.append(String)>
	//  100  234:invokevirtual   #257 <Method String StringBuilder.toString()>
	//  101  237:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//  102  240:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//  103  245:pop             
		s = ((String) (MultipartFormFactory.createPartFromPdf(new File(BackboneApplication.get().getFilesDir(), "general_consent.pdf"), "consentPDF", "general_consent.pdf")));
	//  104  246:new             #259 <Class File>
	//  105  249:dup             
	//  106  250:invokestatic    #40  <Method BackboneApplication BackboneApplication.get()>
	//  107  253:invokevirtual   #263 <Method File BackboneApplication.getFilesDir()>
	//  108  256:ldc2            #265 <String "general_consent.pdf">
	//  109  259:invokespecial   #268 <Method void File(File, String)>
	//  110  262:ldc2            #270 <String "consentPDF">
	//  111  265:ldc2            #265 <String "general_consent.pdf">
	//  112  268:invokestatic    #274 <Method okhttp3.MultipartBody$Part MultipartFormFactory.createPartFromPdf(File, String, String)>
	//  113  271:astore_1        
		api.registerParticipant(((Map) (hashmap)), ((okhttp3.MultipartBody.Part) (s))).enqueue(dtoCallbackAdapter(dtocallback));
	//  114  272:aload_0         
	//  115  273:getfield        #46  <Field ApiService api>
	//  116  276:aload_3         
	//  117  277:aload_1         
	//  118  278:invokeinterface #278 <Method Call ApiService.registerParticipant(Map, okhttp3.MultipartBody$Part)>
	//  119  283:aload_0         
	//  120  284:aload_2         
	//  121  285:invokespecial   #130 <Method Callback dtoCallbackAdapter(DtoCallback)>
	//  122  288:invokeinterface #136 <Method void Call.enqueue(Callback)>
	//  123  293:return          
	}

	public void registerDna(DtoCallback dtocallback)
	{
		Object obj = ((Object) (BackboneApplication.get()));
	//    0    0:invokestatic    #40  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:astore          4
		String s = ParticipantStorage.getAccessToken();
	//    2    5:invokestatic    #78  <Method String ParticipantStorage.getAccessToken()>
	//    3    8:astore_2        
		HashMap hashmap = new HashMap();
	//    4    9:new             #166 <Class HashMap>
	//    5   12:dup             
	//    6   13:invokespecial   #167 <Method void HashMap()>
	//    7   16:astore_3        
		((Map) (hashmap)).put("APISecret", ((Object) (MultipartFormFactory.createPartFromString(((BackboneApplication) (obj)).getString(0x7f0801bf)))));
	//    8   17:aload_3         
	//    9   18:ldc1            #169 <String "APISecret">
	//   10   20:aload           4
	//   11   22:ldc1            #170 <Int 0x7f0801bf>
	//   12   24:invokevirtual   #174 <Method String BackboneApplication.getString(int)>
	//   13   27:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   14   30:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   15   35:pop             
		((Map) (hashmap)).put("address1", ((Object) (MultipartFormFactory.createPartFromString(participant.getAddress1()))));
	//   16   36:aload_3         
	//   17   37:ldc2            #282 <String "address1">
	//   18   40:aload_0         
	//   19   41:getfield        #34  <Field Participant participant>
	//   20   44:invokevirtual   #285 <Method String Participant.getAddress1()>
	//   21   47:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   22   50:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   23   55:pop             
		((Map) (hashmap)).put("address2", ((Object) (MultipartFormFactory.createPartFromString(participant.getAddress2()))));
	//   24   56:aload_3         
	//   25   57:ldc2            #287 <String "address2">
	//   26   60:aload_0         
	//   27   61:getfield        #34  <Field Participant participant>
	//   28   64:invokevirtual   #290 <Method String Participant.getAddress2()>
	//   29   67:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   30   70:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   31   75:pop             
		((Map) (hashmap)).put("city", ((Object) (MultipartFormFactory.createPartFromString(participant.getCity()))));
	//   32   76:aload_3         
	//   33   77:ldc2            #292 <String "city">
	//   34   80:aload_0         
	//   35   81:getfield        #34  <Field Participant participant>
	//   36   84:invokevirtual   #295 <Method String Participant.getCity()>
	//   37   87:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   38   90:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   39   95:pop             
		((Map) (hashmap)).put("state", ((Object) (MultipartFormFactory.createPartFromString(participant.getState()))));
	//   40   96:aload_3         
	//   41   97:ldc2            #297 <String "state">
	//   42  100:aload_0         
	//   43  101:getfield        #34  <Field Participant participant>
	//   44  104:invokevirtual   #300 <Method String Participant.getState()>
	//   45  107:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   46  110:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   47  115:pop             
		((Map) (hashmap)).put("zip", ((Object) (MultipartFormFactory.createPartFromString(participant.getZip()))));
	//   48  116:aload_3         
	//   49  117:ldc2            #302 <String "zip">
	//   50  120:aload_0         
	//   51  121:getfield        #34  <Field Participant participant>
	//   52  124:invokevirtual   #305 <Method String Participant.getZip()>
	//   53  127:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   54  130:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   55  135:pop             
		((Map) (hashmap)).put("appVersion", ((Object) (MultipartFormFactory.createPartFromString((new StringBuilder()).append("android-").append(VersionUtils.getVersionName()).toString()))));
	//   56  136:aload_3         
	//   57  137:ldc1            #240 <String "appVersion">
	//   58  139:new             #242 <Class StringBuilder>
	//   59  142:dup             
	//   60  143:invokespecial   #243 <Method void StringBuilder()>
	//   61  146:ldc1            #245 <String "android-">
	//   62  148:invokevirtual   #249 <Method StringBuilder StringBuilder.append(String)>
	//   63  151:invokestatic    #254 <Method String VersionUtils.getVersionName()>
	//   64  154:invokevirtual   #249 <Method StringBuilder StringBuilder.append(String)>
	//   65  157:invokevirtual   #257 <Method String StringBuilder.toString()>
	//   66  160:invokestatic    #180 <Method okhttp3.RequestBody MultipartFormFactory.createPartFromString(String)>
	//   67  163:invokeinterface #186 <Method Object Map.put(Object, Object)>
	//   68  168:pop             
		obj = ((Object) (MultipartFormFactory.createPartFromPdf(new File(BackboneApplication.get().getFilesDir(), "dna_consent.pdf"), "consentPDF", "dna_consent.pdf")));
	//   69  169:new             #259 <Class File>
	//   70  172:dup             
	//   71  173:invokestatic    #40  <Method BackboneApplication BackboneApplication.get()>
	//   72  176:invokevirtual   #263 <Method File BackboneApplication.getFilesDir()>
	//   73  179:ldc2            #307 <String "dna_consent.pdf">
	//   74  182:invokespecial   #268 <Method void File(File, String)>
	//   75  185:ldc2            #270 <String "consentPDF">
	//   76  188:ldc2            #307 <String "dna_consent.pdf">
	//   77  191:invokestatic    #274 <Method okhttp3.MultipartBody$Part MultipartFormFactory.createPartFromPdf(File, String, String)>
	//   78  194:astore          4
		api.registerDna(s, ((Map) (hashmap)), ((okhttp3.MultipartBody.Part) (obj))).enqueue(dtoCallbackAdapter(dtocallback));
	//   79  196:aload_0         
	//   80  197:getfield        #46  <Field ApiService api>
	//   81  200:aload_2         
	//   82  201:aload_3         
	//   83  202:aload           4
	//   84  204:invokeinterface #310 <Method Call ApiService.registerDna(String, Map, okhttp3.MultipartBody$Part)>
	//   85  209:aload_0         
	//   86  210:aload_1         
	//   87  211:invokespecial   #130 <Method Callback dtoCallbackAdapter(DtoCallback)>
	//   88  214:invokeinterface #136 <Method void Call.enqueue(Callback)>
	//   89  219:return          
	}

	public void resetPassword(String s, Callback callback)
	{
		api.resetPassword(new ResetPasswordRequest(s)).enqueue(callback);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field ApiService api>
	//    2    4:new             #315 <Class ResetPasswordRequest>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #318 <Method void ResetPasswordRequest(String)>
	//    6   12:invokeinterface #321 <Method Call ApiService.resetPassword(ResetPasswordRequest)>
	//    7   17:aload_2         
	//    8   18:invokeinterface #136 <Method void Call.enqueue(Callback)>
	//    9   23:return          
	}

	public void updateProfileSynchronous()
		throws IOException
	{
		Participant participant1 = ParticipantStorage.getParticipant();
	//    0    0:invokestatic    #32  <Method Participant ParticipantStorage.getParticipant()>
	//    1    3:astore_1        
		participant1.save();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #158 <Method void Participant.save()>
		updateProfile(participant1).execute();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #160 <Method Call updateProfile(Participant)>
	//    7   13:invokeinterface #329 <Method Response Call.execute()>
	//    8   18:pop             
	//    9   19:return          
	}

	public void withdraw(SimpleCallback simplecallback)
	{
		String s = ParticipantStorage.getAccessToken();
	//    0    0:invokestatic    #78  <Method String ParticipantStorage.getAccessToken()>
	//    1    3:astore_2        
		api.withdrawParticipant(s).enqueue(simpleCallbackAdapter(simplecallback));
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field ApiService api>
	//    4    8:aload_2         
	//    5    9:invokeinterface #334 <Method Call ApiService.withdrawParticipant(String)>
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokespecial   #162 <Method Callback simpleCallbackAdapter(SimpleCallback)>
	//    9   19:invokeinterface #136 <Method void Call.enqueue(Callback)>
	//   10   24:return          
	}

	private static final String TAG = "ParticipantServerCommun";
	private final ApiService api = BackboneApplication.get().getApi();
	private final AuthorizedApiService authorizedApi = BackboneApplication.get().getAuthorizedApi();
	private Participant participant;
}
