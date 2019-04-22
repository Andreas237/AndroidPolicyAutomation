// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;


// Referenced classes of package com.digits.sdk.android:
//			ActivityClassManager, ConfirmationCodeActionBarActivity, ContactsActionBarActivity, FailureActionBarActivity, 
//			LoginCodeActionBarActivity, PhoneNumberActionBarActivity, PinCodeActionBarActivity

class AppCompatClassManagerImp
	implements ActivityClassManager
{

	AppCompatClassManagerImp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public Class getConfirmationActivity()
	{
		return com/digits/sdk/android/ConfirmationCodeActionBarActivity;
	//    0    0:ldc1            #15  <Class ConfirmationCodeActionBarActivity>
	//    1    2:areturn         
	}

	public Class getContactsActivity()
	{
		return com/digits/sdk/android/ContactsActionBarActivity;
	//    0    0:ldc1            #20  <Class ContactsActionBarActivity>
	//    1    2:areturn         
	}

	public Class getFailureActivity()
	{
		return com/digits/sdk/android/FailureActionBarActivity;
	//    0    0:ldc1            #23  <Class FailureActionBarActivity>
	//    1    2:areturn         
	}

	public Class getLoginCodeActivity()
	{
		return com/digits/sdk/android/LoginCodeActionBarActivity;
	//    0    0:ldc1            #26  <Class LoginCodeActionBarActivity>
	//    1    2:areturn         
	}

	public Class getPhoneNumberActivity()
	{
		return com/digits/sdk/android/PhoneNumberActionBarActivity;
	//    0    0:ldc1            #29  <Class PhoneNumberActionBarActivity>
	//    1    2:areturn         
	}

	public Class getPinCodeActivity()
	{
		return com/digits/sdk/android/PinCodeActionBarActivity;
	//    0    0:ldc1            #32  <Class PinCodeActionBarActivity>
	//    1    2:areturn         
	}
}
