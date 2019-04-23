// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.Intent;

public final class IntentCompat
{

	private IntentCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static Intent makeMainSelectorActivity(String s, String s1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 15)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          15
	//*   2    5:icmplt          14
		{
			return Intent.makeMainSelectorActivity(s, s1);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokestatic    #32  <Method Intent Intent.makeMainSelectorActivity(String, String)>
	//    6   13:areturn         
		} else
		{
			s = ((String) (new Intent(s)));
	//    7   14:new             #30  <Class Intent>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #35  <Method void Intent(String)>
	//   11   22:astore_0        
			((Intent) (s)).addCategory(s1);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #39  <Method Intent Intent.addCategory(String)>
	//   15   28:pop             
			return ((Intent) (s));
	//   16   29:aload_0         
	//   17   30:areturn         
		}
	}

	public static final String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
	public static final String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
	public static final String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";
}
