// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.View;

// Referenced classes of package com.pactforcure.app.ui:
//			ContactUsResourceActivity

final class ContactUsResourceActivity$$Lambda$1
	implements android.view.View.OnClickListener
{

	public static android.view.View.OnClickListener lambdaFactory$(ContactUsResourceActivity contactusresourceactivity)
	{
		return ((android.view.View.OnClickListener) (new ContactUsResourceActivity$$Lambda$1(contactusresourceactivity)));
	//    0    0:new             #2   <Class ContactUsResourceActivity$$Lambda$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void ContactUsResourceActivity$$Lambda$1(ContactUsResourceActivity)>
	//    4    8:areturn         
	}

	public void onClick(View view)
	{
		ContactUsResourceActivity.lambda$onCreate$7(arg$1, view);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ContactUsResourceActivity arg$1>
	//    2    4:aload_1         
	//    3    5:invokestatic    #28  <Method void ContactUsResourceActivity.lambda$onCreate$7(ContactUsResourceActivity, View)>
	//    4    8:return          
	}

	private final ContactUsResourceActivity arg$1;

	private ContactUsResourceActivity$$Lambda$1(ContactUsResourceActivity contactusresourceactivity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		arg$1 = contactusresourceactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ContactUsResourceActivity arg$1>
	//    5    9:return          
	}
}
