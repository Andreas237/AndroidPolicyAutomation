// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.View;

// Referenced classes of package com.pactforcure.app.ui:
//			ParticipantAddressFormActivity

final class ParticipantAddressFormActivity$$Lambda$1
	implements android.view.View.OnClickListener
{

	public static android.view.View.OnClickListener lambdaFactory$(ParticipantAddressFormActivity participantaddressformactivity)
	{
		return ((android.view.View.OnClickListener) (new ParticipantAddressFormActivity$$Lambda$1(participantaddressformactivity)));
	//    0    0:new             #2   <Class ParticipantAddressFormActivity$$Lambda$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void ParticipantAddressFormActivity$$Lambda$1(ParticipantAddressFormActivity)>
	//    4    8:areturn         
	}

	public void onClick(View view)
	{
		ParticipantAddressFormActivity.lambda$onCreate$22(arg$1, view);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ParticipantAddressFormActivity arg$1>
	//    2    4:aload_1         
	//    3    5:invokestatic    #28  <Method void ParticipantAddressFormActivity.lambda$onCreate$22(ParticipantAddressFormActivity, View)>
	//    4    8:return          
	}

	private final ParticipantAddressFormActivity arg$1;

	private ParticipantAddressFormActivity$$Lambda$1(ParticipantAddressFormActivity participantaddressformactivity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		arg$1 = participantaddressformactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ParticipantAddressFormActivity arg$1>
	//    5    9:return          
	}
}
