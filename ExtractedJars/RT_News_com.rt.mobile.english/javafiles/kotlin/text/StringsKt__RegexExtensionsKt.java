// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.text;

import java.util.Set;

// Referenced classes of package kotlin.text:
//			StringsKt__RegexExtensionsJVMKt, Regex, RegexOption

class StringsKt__RegexExtensionsKt extends StringsKt__RegexExtensionsJVMKt
{

	public StringsKt__RegexExtensionsKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void StringsKt__RegexExtensionsJVMKt()>
	//    2    4:return          
	}

	private static final Regex toRegex(String s)
	{
		return new Regex(s);
	//    0    0:new             #36  <Class Regex>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method void Regex(String)>
	//    4    8:areturn         
	}

	private static final Regex toRegex(String s, Set set)
	{
		return new Regex(s, set);
	//    0    0:new             #36  <Class Regex>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #45  <Method void Regex(String, Set)>
	//    5    9:areturn         
	}

	private static final Regex toRegex(String s, RegexOption regexoption)
	{
		return new Regex(s, regexoption);
	//    0    0:new             #36  <Class Regex>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #51  <Method void Regex(String, RegexOption)>
	//    5    9:areturn         
	}
}
