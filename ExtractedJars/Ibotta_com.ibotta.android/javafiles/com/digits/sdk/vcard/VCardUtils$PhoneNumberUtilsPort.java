// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.vcard;

import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;

// Referenced classes of package com.digits.sdk.vcard:
//			VCardUtils

public static class VCardUtils$PhoneNumberUtilsPort
{

	public static String formatNumber(String s, int i)
	{
		s = ((String) (new SpannableStringBuilder(((CharSequence) (s)))));
	//    0    0:new             #11  <Class SpannableStringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #15  <Method void SpannableStringBuilder(CharSequence)>
	//    4    8:astore_0        
		PhoneNumberUtils.formatNumber(((android.text.Editable) (s)), i);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokestatic    #20  <Method void PhoneNumberUtils.formatNumber(android.text.Editable, int)>
		return ((SpannableStringBuilder) (s)).toString();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #24  <Method String SpannableStringBuilder.toString()>
	//   10   18:areturn         
	}
}
