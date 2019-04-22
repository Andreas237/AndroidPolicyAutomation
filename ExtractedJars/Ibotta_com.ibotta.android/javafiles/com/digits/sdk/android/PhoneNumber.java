// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.text.TextUtils;

public class PhoneNumber
{

	public PhoneNumber(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		phoneNumber = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String phoneNumber>
		countryIso = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String countryIso>
		countryCode = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field String countryCode>
	//   11   19:return          
	}

	public static PhoneNumber emptyPhone()
	{
		return EMPTY_PHONE_NUMBER;
	//    0    0:getstatic       #20  <Field PhoneNumber EMPTY_PHONE_NUMBER>
	//    1    3:areturn         
	}

	protected static boolean isCountryValid(PhoneNumber phonenumber)
	{
		return phonenumber != null && !((Object) (EMPTY_PHONE_NUMBER)).equals(((Object) (phonenumber))) && !TextUtils.isEmpty(((CharSequence) (phonenumber.getCountryCode()))) && !TextUtils.isEmpty(((CharSequence) (phonenumber.getCountryIso())));
	//    0    0:aload_0         
	//    1    1:ifnull          36
	//    2    4:getstatic       #20  <Field PhoneNumber EMPTY_PHONE_NUMBER>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//    5   11:ifne            36
	//    6   14:aload_0         
	//    7   15:invokevirtual   #41  <Method String getCountryCode()>
	//    8   18:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    9   21:ifne            36
	//   10   24:aload_0         
	//   11   25:invokevirtual   #50  <Method String getCountryIso()>
	//   12   28:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   13   31:ifne            36
	//   14   34:iconst_1        
	//   15   35:ireturn         
	//   16   36:iconst_0        
	//   17   37:ireturn         
	}

	protected static boolean isValid(PhoneNumber phonenumber)
	{
		return phonenumber != null && !((Object) (EMPTY_PHONE_NUMBER)).equals(((Object) (phonenumber))) && !TextUtils.isEmpty(((CharSequence) (phonenumber.getPhoneNumber()))) && !TextUtils.isEmpty(((CharSequence) (phonenumber.getCountryCode()))) && !TextUtils.isEmpty(((CharSequence) (phonenumber.getCountryIso())));
	//    0    0:aload_0         
	//    1    1:ifnull          46
	//    2    4:getstatic       #20  <Field PhoneNumber EMPTY_PHONE_NUMBER>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//    5   11:ifne            46
	//    6   14:aload_0         
	//    7   15:invokevirtual   #54  <Method String getPhoneNumber()>
	//    8   18:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    9   21:ifne            46
	//   10   24:aload_0         
	//   11   25:invokevirtual   #41  <Method String getCountryCode()>
	//   12   28:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   13   31:ifne            46
	//   14   34:aload_0         
	//   15   35:invokevirtual   #50  <Method String getCountryIso()>
	//   16   38:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   17   41:ifne            46
	//   18   44:iconst_1        
	//   19   45:ireturn         
	//   20   46:iconst_0        
	//   21   47:ireturn         
	}

	public String getCountryCode()
	{
		return countryCode;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String countryCode>
	//    2    4:areturn         
	}

	public String getCountryIso()
	{
		return countryIso;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String countryIso>
	//    2    4:areturn         
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String phoneNumber>
	//    2    4:areturn         
	}

	private static final PhoneNumber EMPTY_PHONE_NUMBER = new PhoneNumber("", "", "");
	private final String countryCode;
	private final String countryIso;
	private final String phoneNumber;

	static 
	{
	//    0    0:new             #2   <Class PhoneNumber>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "">
	//    3    6:ldc1            #14  <String "">
	//    4    8:ldc1            #14  <String "">
	//    5   10:invokespecial   #18  <Method void PhoneNumber(String, String, String)>
	//    6   13:putstatic       #20  <Field PhoneNumber EMPTY_PHONE_NUMBER>
	//*   7   16:return          
	}
}
