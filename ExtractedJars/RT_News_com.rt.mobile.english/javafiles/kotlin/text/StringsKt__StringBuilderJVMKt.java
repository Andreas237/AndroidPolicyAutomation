// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.text:
//			StringsKt__RegexExtensionsKt, SystemProperties, StringsKt

class StringsKt__StringBuilderJVMKt extends StringsKt__RegexExtensionsKt
{

	public StringsKt__StringBuilderJVMKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void StringsKt__RegexExtensionsKt()>
	//    2    4:return          
	}

	public static final Appendable appendln(Appendable appendable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (appendable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #40  <String "receiver$0">
	//    2    3:invokestatic    #46  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		appendable = appendable.append((CharSequence)SystemProperties.LINE_SEPARATOR);
	//    3    6:aload_0         
	//    4    7:getstatic       #52  <Field String SystemProperties.LINE_SEPARATOR>
	//    5   10:checkcast       #54  <Class CharSequence>
	//    6   13:invokeinterface #60  <Method Appendable Appendable.append(CharSequence)>
	//    7   18:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (appendable)), "append(SystemProperties.LINE_SEPARATOR)");
	//    8   19:aload_0         
	//    9   20:ldc1            #62  <String "append(SystemProperties.LINE_SEPARATOR)">
	//   10   22:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return appendable;
	//   11   25:aload_0         
	//   12   26:areturn         
	}

	private static final Appendable appendln(Appendable appendable, char c)
	{
		appendable = appendable.append(c);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokeinterface #72  <Method Appendable Appendable.append(char)>
	//    3    7:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (appendable)), "append(value)");
	//    4    8:aload_0         
	//    5    9:ldc1            #74  <String "append(value)">
	//    6   11:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(appendable);
	//    7   14:aload_0         
	//    8   15:invokestatic    #77  <Method Appendable StringsKt.appendln(Appendable)>
	//    9   18:areturn         
	}

	private static final Appendable appendln(Appendable appendable, CharSequence charsequence)
	{
		appendable = appendable.append(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #60  <Method Appendable Appendable.append(CharSequence)>
	//    3    7:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (appendable)), "append(value)");
	//    4    8:aload_0         
	//    5    9:ldc1            #74  <String "append(value)">
	//    6   11:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(appendable);
	//    7   14:aload_0         
	//    8   15:invokestatic    #77  <Method Appendable StringsKt.appendln(Appendable)>
	//    9   18:areturn         
	}

	public static final StringBuilder appendln(StringBuilder stringbuilder)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (stringbuilder)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #40  <String "receiver$0">
	//    2    3:invokestatic    #46  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		stringbuilder.append(SystemProperties.LINE_SEPARATOR);
	//    3    6:aload_0         
	//    4    7:getstatic       #52  <Field String SystemProperties.LINE_SEPARATOR>
	//    5   10:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//    6   13:pop             
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringbuilder)), "append(SystemProperties.LINE_SEPARATOR)");
	//    7   14:aload_0         
	//    8   15:ldc1            #62  <String "append(SystemProperties.LINE_SEPARATOR)">
	//    9   17:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return stringbuilder;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	private static final StringBuilder appendln(StringBuilder stringbuilder, byte byte0)
	{
		stringbuilder.append(((int) (byte0)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//    3    5:pop             
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringbuilder)), "append(value.toInt())");
	//    4    6:aload_0         
	//    5    7:ldc1            #90  <String "append(value.toInt())">
	//    6    9:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(stringbuilder);
	//    7   12:aload_0         
	//    8   13:invokestatic    #92  <Method StringBuilder StringsKt.appendln(StringBuilder)>
	//    9   16:areturn         
	}

	private static final StringBuilder appendln(StringBuilder stringbuilder, char c)
	{
		stringbuilder.append(c);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #96  <Method StringBuilder StringBuilder.append(char)>
	//    3    5:pop             
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringbuilder)), "append(value)");
	//    4    6:aload_0         
	//    5    7:ldc1            #74  <String "append(value)">
	//    6    9:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(stringbuilder);
	//    7   12:aload_0         
	//    8   13:invokestatic    #92  <Method StringBuilder StringsKt.appendln(StringBuilder)>
	//    9   16:areturn         
	}

	private static final StringBuilder appendln(StringBuilder stringbuilder, double d)
	{
		stringbuilder.append(d);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokevirtual   #100 <Method StringBuilder StringBuilder.append(double)>
	//    3    5:pop             
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringbuilder)), "append(value)");
	//    4    6:aload_0         
	//    5    7:ldc1            #74  <String "append(value)">
	//    6    9:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(stringbuilder);
	//    7   12:aload_0         
	//    8   13:invokestatic    #92  <Method StringBuilder StringsKt.appendln(StringBuilder)>
	//    9   16:areturn         
	}

	private static final StringBuilder appendln(StringBuilder stringbuilder, float f)
	{
		stringbuilder.append(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #104 <Method StringBuilder StringBuilder.append(float)>
	//    3    5:pop             
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringbuilder)), "append(value)");
	//    4    6:aload_0         
	//    5    7:ldc1            #74  <String "append(value)">
	//    6    9:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(stringbuilder);
	//    7   12:aload_0         
	//    8   13:invokestatic    #92  <Method StringBuilder StringsKt.appendln(StringBuilder)>
	//    9   16:areturn         
	}

	private static final StringBuilder appendln(StringBuilder stringbuilder, int i)
	{
		stringbuilder.append(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//    3    5:pop             
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringbuilder)), "append(value)");
	//    4    6:aload_0         
	//    5    7:ldc1            #74  <String "append(value)">
	//    6    9:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(stringbuilder);
	//    7   12:aload_0         
	//    8   13:invokestatic    #92  <Method StringBuilder StringsKt.appendln(StringBuilder)>
	//    9   16:areturn         
	}

	private static final StringBuilder appendln(StringBuilder stringbuilder, long l)
	{
		stringbuilder.append(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #109 <Method StringBuilder StringBuilder.append(long)>
	//    3    5:pop             
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringbuilder)), "append(value)");
	//    4    6:aload_0         
	//    5    7:ldc1            #74  <String "append(value)">
	//    6    9:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(stringbuilder);
	//    7   12:aload_0         
	//    8   13:invokestatic    #92  <Method StringBuilder StringsKt.appendln(StringBuilder)>
	//    9   16:areturn         
	}

	private static final StringBuilder appendln(StringBuilder stringbuilder, CharSequence charsequence)
	{
		stringbuilder.append(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #113 <Method StringBuilder StringBuilder.append(CharSequence)>
	//    3    5:pop             
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringbuilder)), "append(value)");
	//    4    6:aload_0         
	//    5    7:ldc1            #74  <String "append(value)">
	//    6    9:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(stringbuilder);
	//    7   12:aload_0         
	//    8   13:invokestatic    #92  <Method StringBuilder StringsKt.appendln(StringBuilder)>
	//    9   16:areturn         
	}

	private static final StringBuilder appendln(StringBuilder stringbuilder, Object obj)
	{
		stringbuilder.append(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #117 <Method StringBuilder StringBuilder.append(Object)>
	//    3    5:pop             
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringbuilder)), "append(value)");
	//    4    6:aload_0         
	//    5    7:ldc1            #74  <String "append(value)">
	//    6    9:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(stringbuilder);
	//    7   12:aload_0         
	//    8   13:invokestatic    #92  <Method StringBuilder StringsKt.appendln(StringBuilder)>
	//    9   16:areturn         
	}

	private static final StringBuilder appendln(StringBuilder stringbuilder, String s)
	{
		stringbuilder.append(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//    3    5:pop             
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringbuilder)), "append(value)");
	//    4    6:aload_0         
	//    5    7:ldc1            #74  <String "append(value)">
	//    6    9:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(stringbuilder);
	//    7   12:aload_0         
	//    8   13:invokestatic    #92  <Method StringBuilder StringsKt.appendln(StringBuilder)>
	//    9   16:areturn         
	}

	private static final StringBuilder appendln(StringBuilder stringbuilder, StringBuffer stringbuffer)
	{
		stringbuilder.append(stringbuffer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #122 <Method StringBuilder StringBuilder.append(StringBuffer)>
	//    3    5:pop             
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringbuilder)), "append(value)");
	//    4    6:aload_0         
	//    5    7:ldc1            #74  <String "append(value)">
	//    6    9:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(stringbuilder);
	//    7   12:aload_0         
	//    8   13:invokestatic    #92  <Method StringBuilder StringsKt.appendln(StringBuilder)>
	//    9   16:areturn         
	}

	private static final StringBuilder appendln(StringBuilder stringbuilder, StringBuilder stringbuilder1)
	{
		stringbuilder.append((CharSequence)stringbuilder1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #54  <Class CharSequence>
	//    3    5:invokevirtual   #113 <Method StringBuilder StringBuilder.append(CharSequence)>
	//    4    8:pop             
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringbuilder)), "append(value)");
	//    5    9:aload_0         
	//    6   10:ldc1            #74  <String "append(value)">
	//    7   12:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(stringbuilder);
	//    8   15:aload_0         
	//    9   16:invokestatic    #92  <Method StringBuilder StringsKt.appendln(StringBuilder)>
	//   10   19:areturn         
	}

	private static final StringBuilder appendln(StringBuilder stringbuilder, short word0)
	{
		stringbuilder.append(((int) (word0)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//    3    5:pop             
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringbuilder)), "append(value.toInt())");
	//    4    6:aload_0         
	//    5    7:ldc1            #90  <String "append(value.toInt())">
	//    6    9:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(stringbuilder);
	//    7   12:aload_0         
	//    8   13:invokestatic    #92  <Method StringBuilder StringsKt.appendln(StringBuilder)>
	//    9   16:areturn         
	}

	private static final StringBuilder appendln(StringBuilder stringbuilder, boolean flag)
	{
		stringbuilder.append(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #128 <Method StringBuilder StringBuilder.append(boolean)>
	//    3    5:pop             
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringbuilder)), "append(value)");
	//    4    6:aload_0         
	//    5    7:ldc1            #74  <String "append(value)">
	//    6    9:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(stringbuilder);
	//    7   12:aload_0         
	//    8   13:invokestatic    #92  <Method StringBuilder StringsKt.appendln(StringBuilder)>
	//    9   16:areturn         
	}

	private static final StringBuilder appendln(StringBuilder stringbuilder, char ac[])
	{
		stringbuilder.append(ac);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char[])>
	//    3    5:pop             
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringbuilder)), "append(value)");
	//    4    6:aload_0         
	//    5    7:ldc1            #74  <String "append(value)">
	//    6    9:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return StringsKt.appendln(stringbuilder);
	//    7   12:aload_0         
	//    8   13:invokestatic    #92  <Method StringBuilder StringsKt.appendln(StringBuilder)>
	//    9   16:areturn         
	}

	public static final StringBuilder clear(StringBuilder stringbuilder)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (stringbuilder)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #40  <String "receiver$0">
	//    2    3:invokestatic    #46  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		stringbuilder.setLength(0);
	//    3    6:aload_0         
	//    4    7:iconst_0        
	//    5    8:invokevirtual   #139 <Method void StringBuilder.setLength(int)>
		return stringbuilder;
	//    6   11:aload_0         
	//    7   12:areturn         
	}

	private static final void set(StringBuilder stringbuilder, int i, char c)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (stringbuilder)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #40  <String "receiver$0">
	//    2    3:invokestatic    #46  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		stringbuilder.setCharAt(i, c);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iload_2         
	//    6    9:invokevirtual   #144 <Method void StringBuilder.setCharAt(int, char)>
	//    7   12:return          
	}
}
