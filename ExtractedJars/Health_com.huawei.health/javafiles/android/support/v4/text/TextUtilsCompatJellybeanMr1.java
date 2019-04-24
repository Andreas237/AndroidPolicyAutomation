// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import android.text.TextUtils;
import java.util.Locale;

class TextUtilsCompatJellybeanMr1
{

	TextUtilsCompatJellybeanMr1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static int getLayoutDirectionFromLocale(Locale locale)
	{
		return TextUtils.getLayoutDirectionFromLocale(locale);
	//    0    0:aload_0         
	//    1    1:invokestatic    #19  <Method int TextUtils.getLayoutDirectionFromLocale(Locale)>
	//    2    4:ireturn         
	}

	public static String htmlEncode(String s)
	{
		return TextUtils.htmlEncode(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #25  <Method String TextUtils.htmlEncode(String)>
	//    2    4:areturn         
	}
}
