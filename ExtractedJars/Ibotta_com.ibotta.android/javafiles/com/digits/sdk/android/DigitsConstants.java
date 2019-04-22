// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.net.Uri;

class DigitsConstants
{

	public static final Uri DIGITS_TOS = Uri.parse("https://www.digits.com");
	public static final Uri TWITTER_TOS = Uri.parse("https://twitter.com/tos");

	static 
	{
	//    0    0:ldc1            #11  <String "https://twitter.com/tos">
	//    1    2:invokestatic    #17  <Method Uri Uri.parse(String)>
	//    2    5:putstatic       #19  <Field Uri TWITTER_TOS>
	//    3    8:ldc1            #21  <String "https://www.digits.com">
	//    4   10:invokestatic    #17  <Method Uri Uri.parse(String)>
	//    5   13:putstatic       #23  <Field Uri DIGITS_TOS>
	//*   6   16:return          
	}
}
