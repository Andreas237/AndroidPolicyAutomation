// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;


// Referenced classes of package com.digits.sdk.android:
//			ActivityClassManager, ConfirmationCodeActivity, ContactsActivity, FailureActivity, 
//			LoginCodeActivity, PhoneNumberActivity, PinCodeActivity

class ActivityClassManagerImp
	implements ActivityClassManager
{

	ActivityClassManagerImp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public Class getConfirmationActivity()
	{
		return com/digits/sdk/android/ConfirmationCodeActivity;
	//    0    0:ldc1            #15  <Class ConfirmationCodeActivity>
	//    1    2:areturn         
	}

	public Class getContactsActivity()
	{
		return com/digits/sdk/android/ContactsActivity;
	//    0    0:ldc1            #20  <Class ContactsActivity>
	//    1    2:areturn         
	}

	public Class getFailureActivity()
	{
		return com/digits/sdk/android/FailureActivity;
	//    0    0:ldc1            #23  <Class FailureActivity>
	//    1    2:areturn         
	}

	public Class getLoginCodeActivity()
	{
		return com/digits/sdk/android/LoginCodeActivity;
	//    0    0:ldc1            #26  <Class LoginCodeActivity>
	//    1    2:areturn         
	}

	public Class getPhoneNumberActivity()
	{
		return com/digits/sdk/android/PhoneNumberActivity;
	//    0    0:ldc1            #29  <Class PhoneNumberActivity>
	//    1    2:areturn         
	}

	public Class getPinCodeActivity()
	{
		return com/digits/sdk/android/PinCodeActivity;
	//    0    0:ldc1            #32  <Class PinCodeActivity>
	//    1    2:areturn         
	}
}
