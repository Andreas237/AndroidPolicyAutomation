// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.participant.password;

import com.pactforcure.app.participant.ParticipantServerAgent;
import com.pactforcure.app.participant.login.CredentialsValidationError;
import java.util.ArrayList;
import java.util.List;
import org.researchstack.backbone.utils.TextUtils;
import retrofit2.Callback;

public class ResetPassword
{

	public ResetPassword(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		email = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field String email>
	//    5    9:return          
	}

	public void startResetProcess(Callback callback)
	{
		(new ParticipantServerAgent()).resetPassword(email, callback);
	//    0    0:new             #18  <Class ParticipantServerAgent>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void ParticipantServerAgent()>
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field String email>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #23  <Method void ParticipantServerAgent.resetPassword(String, Callback)>
	//    7   15:return          
	}

	public List validate()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #29  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void ArrayList()>
	//    3    7:astore_1        
		if(!TextUtils.isValidEmail(((CharSequence) (email))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #13  <Field String email>
	//*   6   12:invokestatic    #36  <Method boolean TextUtils.isValidEmail(CharSequence)>
	//*   7   15:ifne            28
			((List) (arraylist)).add(((Object) (CredentialsValidationError.INVALID_EMAIL)));
	//    8   18:aload_1         
	//    9   19:getstatic       #42  <Field CredentialsValidationError CredentialsValidationError.INVALID_EMAIL>
	//   10   22:invokeinterface #48  <Method boolean List.add(Object)>
	//   11   27:pop             
		if(email.isEmpty())
	//*  12   28:aload_0         
	//*  13   29:getfield        #13  <Field String email>
	//*  14   32:invokevirtual   #54  <Method boolean String.isEmpty()>
	//*  15   35:ifeq            48
			((List) (arraylist)).add(((Object) (CredentialsValidationError.EMPTY_EMAIL)));
	//   16   38:aload_1         
	//   17   39:getstatic       #57  <Field CredentialsValidationError CredentialsValidationError.EMPTY_EMAIL>
	//   18   42:invokeinterface #48  <Method boolean List.add(Object)>
	//   19   47:pop             
		return ((List) (arraylist));
	//   20   48:aload_1         
	//   21   49:areturn         
	}

	private String email;
}
