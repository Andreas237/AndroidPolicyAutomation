// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.text.Html;

class ShareCompatJB
{

	ShareCompatJB()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static String escapeHtml(CharSequence charsequence)
	{
		return Html.escapeHtml(charsequence);
	//    0    0:aload_0         
	//    1    1:invokestatic    #18  <Method String Html.escapeHtml(CharSequence)>
	//    2    4:areturn         
	}
}
