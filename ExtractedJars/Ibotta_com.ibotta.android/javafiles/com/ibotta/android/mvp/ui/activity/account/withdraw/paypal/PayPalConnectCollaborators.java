// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal;

import com.google.code.regexp.Matcher;
import com.google.code.regexp.Pattern;

public class PayPalConnectCollaborators
{

	public PayPalConnectCollaborators()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public Matcher provideMatcher(String s, String s1)
	{
		return Pattern.compile(s).matcher(((CharSequence) (s1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #17  <Method Pattern Pattern.compile(String)>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #21  <Method Matcher Pattern.matcher(CharSequence)>
	//    4    8:areturn         
	}
}
