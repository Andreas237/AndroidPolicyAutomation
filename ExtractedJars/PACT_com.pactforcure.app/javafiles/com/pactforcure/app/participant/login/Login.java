// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.participant.login;

import com.pactforcure.app.api.dto.DtoCallbackV2;
import com.pactforcure.app.participant.ParticipantServerAgent;
import java.util.ArrayList;
import java.util.List;
import org.researchstack.backbone.utils.TextUtils;

// Referenced classes of package com.pactforcure.app.participant.login:
//			CredentialsValidationError

public class Login
{

	public Login(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		email = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String email>
		password = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field String password>
	//    8   14:return          
	}

	public void authenticate(DtoCallbackV2 dtocallbackv2)
	{
		(new ParticipantServerAgent()).login(email, password, dtocallbackv2);
	//    0    0:new             #23  <Class ParticipantServerAgent>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ParticipantServerAgent()>
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field String email>
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field String password>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #28  <Method void ParticipantServerAgent.login(String, String, DtoCallbackV2)>
	//    9   19:return          
	}

	public List validate()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #34  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void ArrayList()>
	//    3    7:astore_1        
		if(!TextUtils.isValidEmail(((CharSequence) (email))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #15  <Field String email>
	//*   6   12:invokestatic    #41  <Method boolean TextUtils.isValidEmail(CharSequence)>
	//*   7   15:ifne            28
			((List) (arraylist)).add(((Object) (CredentialsValidationError.INVALID_EMAIL)));
	//    8   18:aload_1         
	//    9   19:getstatic       #47  <Field CredentialsValidationError CredentialsValidationError.INVALID_EMAIL>
	//   10   22:invokeinterface #53  <Method boolean List.add(Object)>
	//   11   27:pop             
		if(email.isEmpty())
	//*  12   28:aload_0         
	//*  13   29:getfield        #15  <Field String email>
	//*  14   32:invokevirtual   #59  <Method boolean String.isEmpty()>
	//*  15   35:ifeq            48
			((List) (arraylist)).add(((Object) (CredentialsValidationError.EMPTY_EMAIL)));
	//   16   38:aload_1         
	//   17   39:getstatic       #62  <Field CredentialsValidationError CredentialsValidationError.EMPTY_EMAIL>
	//   18   42:invokeinterface #53  <Method boolean List.add(Object)>
	//   19   47:pop             
		if(password.isEmpty())
	//*  20   48:aload_0         
	//*  21   49:getfield        #17  <Field String password>
	//*  22   52:invokevirtual   #59  <Method boolean String.isEmpty()>
	//*  23   55:ifeq            68
			((List) (arraylist)).add(((Object) (CredentialsValidationError.EMPTY_PASSWORD)));
	//   24   58:aload_1         
	//   25   59:getstatic       #65  <Field CredentialsValidationError CredentialsValidationError.EMPTY_PASSWORD>
	//   26   62:invokeinterface #53  <Method boolean List.add(Object)>
	//   27   67:pop             
		return ((List) (arraylist));
	//   28   68:aload_1         
	//   29   69:areturn         
	}

	private String email;
	private String password;
}
