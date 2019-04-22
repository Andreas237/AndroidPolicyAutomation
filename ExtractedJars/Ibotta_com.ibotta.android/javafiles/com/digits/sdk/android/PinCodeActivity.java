// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;


// Referenced classes of package com.digits.sdk.android:
//			DigitsActivity, PinCodeActivityDelegate, DigitsActivityDelegate

public class PinCodeActivity extends DigitsActivity
{

	public PinCodeActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void DigitsActivity()>
	//    2    4:return          
	}

	DigitsActivityDelegate getActivityDelegate()
	{
		return ((DigitsActivityDelegate) (new PinCodeActivityDelegate()));
	//    0    0:new             #13  <Class PinCodeActivityDelegate>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void PinCodeActivityDelegate()>
	//    3    7:areturn         
	}
}
