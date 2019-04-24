// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.text;

import java.util.regex.Pattern;

// Referenced classes of package kotlin.text:
//			StringsKt__IndentKt, Regex

class StringsKt__RegexExtensionsJVMKt extends StringsKt__IndentKt
{

	public StringsKt__RegexExtensionsJVMKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void StringsKt__IndentKt()>
	//    2    4:return          
	}

	private static final Regex toRegex(Pattern pattern)
	{
		return new Regex(pattern);
	//    0    0:new             #33  <Class Regex>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void Regex(Pattern)>
	//    4    8:areturn         
	}
}
