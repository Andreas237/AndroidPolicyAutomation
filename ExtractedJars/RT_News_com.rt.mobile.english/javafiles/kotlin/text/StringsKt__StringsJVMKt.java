// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.text;

import java.nio.charset.Charset;
import java.util.*;
import java.util.regex.Pattern;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.sequences.SequencesKt;

// Referenced classes of package kotlin.text:
//			StringsKt__StringNumberConversionsKt, Charsets, StringsKt, CharsKt

class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt
{

	public StringsKt__StringsJVMKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void StringsKt__StringNumberConversionsKt()>
	//    2    4:return          
	}

	private static final String String(StringBuffer stringbuffer)
	{
		return new String(stringbuffer);
	//    0    0:new             #107 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #110 <Method void String(StringBuffer)>
	//    4    8:areturn         
	}

	private static final String String(StringBuilder stringbuilder)
	{
		return new String(stringbuilder);
	//    0    0:new             #107 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #115 <Method void String(StringBuilder)>
	//    4    8:areturn         
	}

	private static final String String(byte abyte0[])
	{
		return new String(abyte0, Charsets.UTF_8);
	//    0    0:new             #107 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #121 <Field Charset Charsets.UTF_8>
	//    4    8:invokespecial   #124 <Method void String(byte[], Charset)>
	//    5   11:areturn         
	}

	private static final String String(byte abyte0[], int i, int j)
	{
		return new String(abyte0, i, j, Charsets.UTF_8);
	//    0    0:new             #107 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:getstatic       #121 <Field Charset Charsets.UTF_8>
	//    6   10:invokespecial   #128 <Method void String(byte[], int, int, Charset)>
	//    7   13:areturn         
	}

	private static final String String(byte abyte0[], int i, int j, Charset charset)
	{
		return new String(abyte0, i, j, charset);
	//    0    0:new             #107 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #128 <Method void String(byte[], int, int, Charset)>
	//    7   11:areturn         
	}

	private static final String String(byte abyte0[], Charset charset)
	{
		return new String(abyte0, charset);
	//    0    0:new             #107 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #124 <Method void String(byte[], Charset)>
	//    5    9:areturn         
	}

	private static final String String(char ac[])
	{
		return new String(ac);
	//    0    0:new             #107 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #134 <Method void String(char[])>
	//    4    8:areturn         
	}

	private static final String String(char ac[], int i, int j)
	{
		return new String(ac, i, j);
	//    0    0:new             #107 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #138 <Method void String(char[], int, int)>
	//    6   10:areturn         
	}

	private static final String String(int ai[], int i, int j)
	{
		return new String(ai, i, j);
	//    0    0:new             #107 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #142 <Method void String(int[], int, int)>
	//    6   10:areturn         
	}

	public static final String capitalize(String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		boolean flag;
		if(((CharSequence)s).length() > 0)
	//*   3    6:aload_0         
	//*   4    7:checkcast       #154 <Class CharSequence>
	//*   5   10:invokeinterface #157 <Method int CharSequence.length()>
	//*   6   15:ifle            23
			flag = true;
	//    7   18:iconst_1        
	//    8   19:istore_1        
		else
	//*   9   20:goto            25
			flag = false;
	//   10   23:iconst_0        
	//   11   24:istore_1        
		Object obj = ((Object) (s));
	//   12   25:aload_0         
	//   13   26:astore_2        
		if(flag)
	//*  14   27:iload_1         
	//*  15   28:ifeq            119
		{
			obj = ((Object) (s));
	//   16   31:aload_0         
	//   17   32:astore_2        
			if(Character.isLowerCase(s.charAt(0)))
	//*  18   33:aload_0         
	//*  19   34:iconst_0        
	//*  20   35:invokevirtual   #161 <Method char String.charAt(int)>
	//*  21   38:invokestatic    #167 <Method boolean Character.isLowerCase(char)>
	//*  22   41:ifeq            119
			{
				obj = ((Object) (new StringBuilder()));
	//   23   44:new             #169 <Class StringBuilder>
	//   24   47:dup             
	//   25   48:invokespecial   #170 <Method void StringBuilder()>
	//   26   51:astore_2        
				String s1 = s.substring(0, 1);
	//   27   52:aload_0         
	//   28   53:iconst_0        
	//   29   54:iconst_1        
	//   30   55:invokevirtual   #173 <Method String String.substring(int, int)>
	//   31   58:astore_3        
				Intrinsics.checkExpressionValueIsNotNull(((Object) (s1)), "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
	//   32   59:aload_3         
	//   33   60:ldc1            #175 <String "(this as java.lang.Strin\u2026ing(startIndex, endIndex)">
	//   34   62:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
				if(s1 == null)
	//*  35   65:aload_3         
	//*  36   66:ifnonnull       79
					throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//   37   69:new             #180 <Class TypeCastException>
	//   38   72:dup             
	//   39   73:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//   40   75:invokespecial   #185 <Method void TypeCastException(String)>
	//   41   78:athrow          
				s1 = s1.toUpperCase();
	//   42   79:aload_3         
	//   43   80:invokevirtual   #188 <Method String String.toUpperCase()>
	//   44   83:astore_3        
				Intrinsics.checkExpressionValueIsNotNull(((Object) (s1)), "(this as java.lang.String).toUpperCase()");
	//   45   84:aload_3         
	//   46   85:ldc1            #190 <String "(this as java.lang.String).toUpperCase()">
	//   47   87:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
				((StringBuilder) (obj)).append(s1);
	//   48   90:aload_2         
	//   49   91:aload_3         
	//   50   92:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   51   95:pop             
				s = s.substring(1);
	//   52   96:aload_0         
	//   53   97:iconst_1        
	//   54   98:invokevirtual   #197 <Method String String.substring(int)>
	//   55  101:astore_0        
				Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.String).substring(startIndex)");
	//   56  102:aload_0         
	//   57  103:ldc1            #199 <String "(this as java.lang.String).substring(startIndex)">
	//   58  105:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
				((StringBuilder) (obj)).append(s);
	//   59  108:aload_2         
	//   60  109:aload_0         
	//   61  110:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   62  113:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   63  114:aload_2         
	//   64  115:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   65  118:astore_2        
			}
		}
		return ((String) (obj));
	//   66  119:aload_2         
	//   67  120:areturn         
	}

	private static final int codePointAt(String s, int i)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		else
			return s.codePointAt(i);
	//    7   14:aload_0         
	//    8   15:iload_1         
	//    9   16:invokevirtual   #207 <Method int String.codePointAt(int)>
	//   10   19:ireturn         
	}

	private static final int codePointBefore(String s, int i)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		else
			return s.codePointBefore(i);
	//    7   14:aload_0         
	//    8   15:iload_1         
	//    9   16:invokevirtual   #209 <Method int String.codePointBefore(int)>
	//   10   19:ireturn         
	}

	private static final int codePointCount(String s, int i, int j)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		else
			return s.codePointCount(i, j);
	//    7   14:aload_0         
	//    8   15:iload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #213 <Method int String.codePointCount(int, int)>
	//   11   20:ireturn         
	}

	public static final int compareTo(String s, String s1, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "other");
	//    3    6:aload_1         
	//    4    7:ldc1            #215 <String "other">
	//    5    9:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(flag)
	//*   6   12:iload_2         
	//*   7   13:ifeq            22
			return s.compareToIgnoreCase(s1);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #219 <Method int String.compareToIgnoreCase(String)>
	//   11   21:ireturn         
		else
			return s.compareTo(s1);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #221 <Method int String.compareTo(String)>
	//   15   27:ireturn         
	}

	public static int compareTo$default(String s, String s1, boolean flag, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		return StringsKt.compareTo(s, s1, flag);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:iload_2         
	//    9   11:invokestatic    #226 <Method int StringsKt.compareTo(String, String, boolean)>
	//   10   14:ireturn         
	}

	private static final boolean contentEquals(String s, CharSequence charsequence)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		else
			return s.contentEquals(charsequence);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #230 <Method boolean String.contentEquals(CharSequence)>
	//   10   19:ireturn         
	}

	private static final boolean contentEquals(String s, StringBuffer stringbuffer)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		else
			return s.contentEquals(stringbuffer);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #234 <Method boolean String.contentEquals(StringBuffer)>
	//   10   19:ireturn         
	}

	public static final String decapitalize(String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		boolean flag;
		if(((CharSequence)s).length() > 0)
	//*   3    6:aload_0         
	//*   4    7:checkcast       #154 <Class CharSequence>
	//*   5   10:invokeinterface #157 <Method int CharSequence.length()>
	//*   6   15:ifle            23
			flag = true;
	//    7   18:iconst_1        
	//    8   19:istore_1        
		else
	//*   9   20:goto            25
			flag = false;
	//   10   23:iconst_0        
	//   11   24:istore_1        
		Object obj = ((Object) (s));
	//   12   25:aload_0         
	//   13   26:astore_2        
		if(flag)
	//*  14   27:iload_1         
	//*  15   28:ifeq            119
		{
			obj = ((Object) (s));
	//   16   31:aload_0         
	//   17   32:astore_2        
			if(Character.isUpperCase(s.charAt(0)))
	//*  18   33:aload_0         
	//*  19   34:iconst_0        
	//*  20   35:invokevirtual   #161 <Method char String.charAt(int)>
	//*  21   38:invokestatic    #237 <Method boolean Character.isUpperCase(char)>
	//*  22   41:ifeq            119
			{
				obj = ((Object) (new StringBuilder()));
	//   23   44:new             #169 <Class StringBuilder>
	//   24   47:dup             
	//   25   48:invokespecial   #170 <Method void StringBuilder()>
	//   26   51:astore_2        
				String s1 = s.substring(0, 1);
	//   27   52:aload_0         
	//   28   53:iconst_0        
	//   29   54:iconst_1        
	//   30   55:invokevirtual   #173 <Method String String.substring(int, int)>
	//   31   58:astore_3        
				Intrinsics.checkExpressionValueIsNotNull(((Object) (s1)), "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
	//   32   59:aload_3         
	//   33   60:ldc1            #175 <String "(this as java.lang.Strin\u2026ing(startIndex, endIndex)">
	//   34   62:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
				if(s1 == null)
	//*  35   65:aload_3         
	//*  36   66:ifnonnull       79
					throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//   37   69:new             #180 <Class TypeCastException>
	//   38   72:dup             
	//   39   73:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//   40   75:invokespecial   #185 <Method void TypeCastException(String)>
	//   41   78:athrow          
				s1 = s1.toLowerCase();
	//   42   79:aload_3         
	//   43   80:invokevirtual   #239 <Method String String.toLowerCase()>
	//   44   83:astore_3        
				Intrinsics.checkExpressionValueIsNotNull(((Object) (s1)), "(this as java.lang.String).toLowerCase()");
	//   45   84:aload_3         
	//   46   85:ldc1            #241 <String "(this as java.lang.String).toLowerCase()">
	//   47   87:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
				((StringBuilder) (obj)).append(s1);
	//   48   90:aload_2         
	//   49   91:aload_3         
	//   50   92:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   51   95:pop             
				s = s.substring(1);
	//   52   96:aload_0         
	//   53   97:iconst_1        
	//   54   98:invokevirtual   #197 <Method String String.substring(int)>
	//   55  101:astore_0        
				Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.String).substring(startIndex)");
	//   56  102:aload_0         
	//   57  103:ldc1            #199 <String "(this as java.lang.String).substring(startIndex)">
	//   58  105:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
				((StringBuilder) (obj)).append(s);
	//   59  108:aload_2         
	//   60  109:aload_0         
	//   61  110:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   62  113:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   63  114:aload_2         
	//   64  115:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   65  118:astore_2        
			}
		}
		return ((String) (obj));
	//   66  119:aload_2         
	//   67  120:areturn         
	}

	public static final boolean endsWith(String s, String s1, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "suffix");
	//    3    6:aload_1         
	//    4    7:ldc1            #243 <String "suffix">
	//    5    9:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!flag)
	//*   6   12:iload_2         
	//*   7   13:ifne            22
			return s.endsWith(s1);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #246 <Method boolean String.endsWith(String)>
	//   11   21:ireturn         
		else
			return StringsKt.regionMatches(s, s.length() - s1.length(), s1, 0, s1.length(), true);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #247 <Method int String.length()>
	//   15   27:aload_1         
	//   16   28:invokevirtual   #247 <Method int String.length()>
	//   17   31:isub            
	//   18   32:aload_1         
	//   19   33:iconst_0        
	//   20   34:aload_1         
	//   21   35:invokevirtual   #247 <Method int String.length()>
	//   22   38:iconst_1        
	//   23   39:invokestatic    #250 <Method boolean StringsKt.regionMatches(String, int, String, int, int, boolean)>
	//   24   42:ireturn         
	}

	public static boolean endsWith$default(String s, String s1, boolean flag, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		return StringsKt.endsWith(s, s1, flag);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:iload_2         
	//    9   11:invokestatic    #254 <Method boolean StringsKt.endsWith(String, String, boolean)>
	//   10   14:ireturn         
	}

	public static final boolean equals(String s, String s1, boolean flag)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			return s1 == null;
	//    2    4:aload_1         
	//    3    5:ifnonnull       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
		if(!flag)
	//*   8   12:iload_2         
	//*   9   13:ifne            22
			return s.equals(((Object) (s1)));
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:invokevirtual   #258 <Method boolean String.equals(Object)>
	//   13   21:ireturn         
		else
			return s.equalsIgnoreCase(s1);
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:invokevirtual   #261 <Method boolean String.equalsIgnoreCase(String)>
	//   17   27:ireturn         
	}

	public static boolean equals$default(String s, String s1, boolean flag, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		return StringsKt.equals(s, s1, flag);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:iload_2         
	//    9   11:invokestatic    #264 <Method boolean StringsKt.equals(String, String, boolean)>
	//   10   14:ireturn         
	}

	private static final transient String format(String s, Locale locale, Object aobj[])
	{
		s = java.lang.String.format(locale, s, Arrays.copyOf(aobj, aobj.length));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:aload_2         
	//    4    4:arraylength     
	//    5    5:invokestatic    #270 <Method Object[] Arrays.copyOf(Object[], int)>
	//    6    8:invokestatic    #273 <Method String String.format(Locale, String, Object[])>
	//    7   11:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "java.lang.String.format(locale, this, *args)");
	//    8   12:aload_0         
	//    9   13:ldc2            #275 <String "java.lang.String.format(locale, this, *args)">
	//   10   16:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return s;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	private static final transient String format(String s, Object aobj[])
	{
		s = java.lang.String.format(s, Arrays.copyOf(aobj, aobj.length));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:arraylength     
	//    4    4:invokestatic    #270 <Method Object[] Arrays.copyOf(Object[], int)>
	//    5    7:invokestatic    #277 <Method String String.format(String, Object[])>
	//    6   10:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "java.lang.String.format(this, *args)");
	//    7   11:aload_0         
	//    8   12:ldc2            #279 <String "java.lang.String.format(this, *args)">
	//    9   15:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return s;
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	private static final transient String format(StringCompanionObject stringcompanionobject, String s, Object aobj[])
	{
		stringcompanionobject = ((StringCompanionObject) (java.lang.String.format(s, Arrays.copyOf(aobj, aobj.length))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_2         
	//    3    3:arraylength     
	//    4    4:invokestatic    #270 <Method Object[] Arrays.copyOf(Object[], int)>
	//    5    7:invokestatic    #277 <Method String String.format(String, Object[])>
	//    6   10:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringcompanionobject)), "java.lang.String.format(format, *args)");
	//    7   11:aload_0         
	//    8   12:ldc2            #281 <String "java.lang.String.format(format, *args)">
	//    9   15:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((String) (stringcompanionobject));
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	private static final transient String format(StringCompanionObject stringcompanionobject, Locale locale, String s, Object aobj[])
	{
		stringcompanionobject = ((StringCompanionObject) (java.lang.String.format(locale, s, Arrays.copyOf(aobj, aobj.length))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload_3         
	//    4    4:arraylength     
	//    5    5:invokestatic    #270 <Method Object[] Arrays.copyOf(Object[], int)>
	//    6    8:invokestatic    #273 <Method String String.format(Locale, String, Object[])>
	//    7   11:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringcompanionobject)), "java.lang.String.format(locale, format, *args)");
	//    8   12:aload_0         
	//    9   13:ldc2            #283 <String "java.lang.String.format(locale, format, *args)">
	//   10   16:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((String) (stringcompanionobject));
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public static final Comparator getCASE_INSENSITIVE_ORDER(StringCompanionObject stringcompanionobject)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (stringcompanionobject)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		stringcompanionobject = ((StringCompanionObject) (String.CASE_INSENSITIVE_ORDER));
	//    3    6:getstatic       #285 <Field Comparator String.CASE_INSENSITIVE_ORDER>
	//    4    9:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (stringcompanionobject)), "java.lang.String.CASE_INSENSITIVE_ORDER");
	//    5   10:aload_0         
	//    6   11:ldc2            #287 <String "java.lang.String.CASE_INSENSITIVE_ORDER">
	//    7   14:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((Comparator) (stringcompanionobject));
	//    8   17:aload_0         
	//    9   18:areturn         
	}

	private static final String intern(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		} else
		{
			s = s.intern();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #291 <Method String String.intern()>
	//    9   18:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.String).intern()");
	//   10   19:aload_0         
	//   11   20:ldc2            #293 <String "(this as java.lang.String).intern()">
	//   12   23:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   13   26:aload_0         
	//   14   27:areturn         
		}
	}

	public static final boolean isBlank(CharSequence charsequence)
	{
		boolean flag1;
		Object obj;
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = charsequence.length();
	//    3    6:aload_0         
	//    4    7:invokeinterface #157 <Method int CharSequence.length()>
	//    5   12:istore_1        
		flag1 = false;
	//    6   13:iconst_0        
	//    7   14:istore_2        
		if(i == 0)
			break MISSING_BLOCK_LABEL_92;
	//    8   15:iload_1         
	//    9   16:ifeq            92
		obj = ((Object) ((Iterable)StringsKt.getIndices(charsequence)));
	//   10   19:aload_0         
	//   11   20:invokestatic    #297 <Method kotlin.ranges.IntRange StringsKt.getIndices(CharSequence)>
	//   12   23:checkcast       #299 <Class Iterable>
	//   13   26:astore_3        
		if(!(obj instanceof Collection) || !((Collection)obj).isEmpty()) goto _L2; else goto _L1
	//   14   27:aload_3         
	//   15   28:instanceof      #301 <Class Collection>
	//   16   31:ifeq            51
	//   17   34:aload_3         
	//   18   35:checkcast       #301 <Class Collection>
	//   19   38:invokeinterface #305 <Method boolean Collection.isEmpty()>
	//   20   43:ifeq            51
_L1:
		boolean flag;
		flag = true;
	//   21   46:iconst_1        
	//   22   47:istore_1        
		break MISSING_BLOCK_LABEL_88;
	//   23   48:goto            88
_L2:
		obj = ((Object) (((Iterable) (obj)).iterator()));
	//   24   51:aload_3         
	//   25   52:invokeinterface #309 <Method Iterator Iterable.iterator()>
	//   26   57:astore_3        
_L5:
		if(!((Iterator) (obj)).hasNext()) goto _L1; else goto _L3
	//   27   58:aload_3         
	//   28   59:invokeinterface #314 <Method boolean Iterator.hasNext()>
	//   29   64:ifeq            46
_L3:
		if(CharsKt.isWhitespace(charsequence.charAt(((IntIterator)obj).nextInt()))) goto _L5; else goto _L4
	//   30   67:aload_0         
	//   31   68:aload_3         
	//   32   69:checkcast       #316 <Class IntIterator>
	//   33   72:invokevirtual   #319 <Method int IntIterator.nextInt()>
	//   34   75:invokeinterface #320 <Method char CharSequence.charAt(int)>
	//   35   80:invokestatic    #325 <Method boolean CharsKt.isWhitespace(char)>
	//   36   83:ifne            58
_L4:
		flag = false;
	//   37   86:iconst_0        
	//   38   87:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_94;
	//   39   88:iload_1         
	//   40   89:ifeq            94
		flag1 = true;
	//   41   92:iconst_1        
	//   42   93:istore_2        
		return flag1;
	//   43   94:iload_2         
	//   44   95:ireturn         
	}

	private static final int nativeIndexOf(String s, char c, int i)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		else
			return s.indexOf(((int) (c)), i);
	//    7   14:aload_0         
	//    8   15:iload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #329 <Method int String.indexOf(int, int)>
	//   11   20:ireturn         
	}

	private static final int nativeIndexOf(String s, String s1, int i)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		else
			return s.indexOf(s1, i);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #332 <Method int String.indexOf(String, int)>
	//   11   20:ireturn         
	}

	private static final int nativeLastIndexOf(String s, char c, int i)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		else
			return s.lastIndexOf(((int) (c)), i);
	//    7   14:aload_0         
	//    8   15:iload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #335 <Method int String.lastIndexOf(int, int)>
	//   11   20:ireturn         
	}

	private static final int nativeLastIndexOf(String s, String s1, int i)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		else
			return s.lastIndexOf(s1, i);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #337 <Method int String.lastIndexOf(String, int)>
	//   11   20:ireturn         
	}

	private static final int offsetByCodePoints(String s, int i, int j)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		else
			return s.offsetByCodePoints(i, j);
	//    7   14:aload_0         
	//    8   15:iload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #339 <Method int String.offsetByCodePoints(int, int)>
	//   11   20:ireturn         
	}

	public static final boolean regionMatches(CharSequence charsequence, int i, CharSequence charsequence1, int j, int k, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence1)), "other");
	//    3    6:aload_2         
	//    4    7:ldc1            #215 <String "other">
	//    5    9:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if((charsequence instanceof String) && (charsequence1 instanceof String))
	//*   6   12:aload_0         
	//*   7   13:instanceof      #107 <Class String>
	//*   8   16:ifeq            44
	//*   9   19:aload_2         
	//*  10   20:instanceof      #107 <Class String>
	//*  11   23:ifeq            44
			return StringsKt.regionMatches((String)charsequence, i, (String)charsequence1, j, k, flag);
	//   12   26:aload_0         
	//   13   27:checkcast       #107 <Class String>
	//   14   30:iload_1         
	//   15   31:aload_2         
	//   16   32:checkcast       #107 <Class String>
	//   17   35:iload_3         
	//   18   36:iload           4
	//   19   38:iload           5
	//   20   40:invokestatic    #250 <Method boolean StringsKt.regionMatches(String, int, String, int, int, boolean)>
	//   21   43:ireturn         
		else
			return StringsKt.regionMatchesImpl(charsequence, i, charsequence1, j, k, flag);
	//   22   44:aload_0         
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:iload_3         
	//   26   48:iload           4
	//   27   50:iload           5
	//   28   52:invokestatic    #343 <Method boolean StringsKt.regionMatchesImpl(CharSequence, int, CharSequence, int, int, boolean)>
	//   29   55:ireturn         
	}

	public static final boolean regionMatches(String s, int i, String s1, int j, int k, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "other");
	//    3    6:aload_2         
	//    4    7:ldc1            #215 <String "other">
	//    5    9:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!flag)
	//*   6   12:iload           5
	//*   7   14:ifne            27
			return s.regionMatches(i, s1, j, k);
	//    8   17:aload_0         
	//    9   18:iload_1         
	//   10   19:aload_2         
	//   11   20:iload_3         
	//   12   21:iload           4
	//   13   23:invokevirtual   #346 <Method boolean String.regionMatches(int, String, int, int)>
	//   14   26:ireturn         
		else
			return s.regionMatches(flag, i, s1, j, k);
	//   15   27:aload_0         
	//   16   28:iload           5
	//   17   30:iload_1         
	//   18   31:aload_2         
	//   19   32:iload_3         
	//   20   33:iload           4
	//   21   35:invokevirtual   #349 <Method boolean String.regionMatches(boolean, int, String, int, int)>
	//   22   38:ireturn         
	}

	public static boolean regionMatches$default(CharSequence charsequence, int i, CharSequence charsequence1, int j, int k, boolean flag, int l, Object obj)
	{
		if((l & 0x10) != 0)
	//*   0    0:iload           6
	//*   1    2:bipush          16
	//*   2    4:iand            
	//*   3    5:ifeq            11
			flag = false;
	//    4    8:iconst_0        
	//    5    9:istore          5
		return StringsKt.regionMatches(charsequence, i, charsequence1, j, k, flag);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:aload_2         
	//    9   14:iload_3         
	//   10   15:iload           4
	//   11   17:iload           5
	//   12   19:invokestatic    #353 <Method boolean StringsKt.regionMatches(CharSequence, int, CharSequence, int, int, boolean)>
	//   13   22:ireturn         
	}

	public static boolean regionMatches$default(String s, int i, String s1, int j, int k, boolean flag, int l, Object obj)
	{
		if((l & 0x10) != 0)
	//*   0    0:iload           6
	//*   1    2:bipush          16
	//*   2    4:iand            
	//*   3    5:ifeq            11
			flag = false;
	//    4    8:iconst_0        
	//    5    9:istore          5
		return StringsKt.regionMatches(s, i, s1, j, k, flag);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:aload_2         
	//    9   14:iload_3         
	//   10   15:iload           4
	//   11   17:iload           5
	//   12   19:invokestatic    #250 <Method boolean StringsKt.regionMatches(String, int, String, int, int, boolean)>
	//   13   22:ireturn         
	}

	public static final String repeat(CharSequence charsequence, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
		boolean flag2 = true;
	//    5    9:iconst_1        
	//    6   10:istore          5
		boolean flag;
		if(i >= 0)
	//*   7   12:iload_1         
	//*   8   13:iflt            21
			flag = true;
	//    9   16:iconst_1        
	//   10   17:istore_3        
		else
	//*  11   18:goto            23
			flag = false;
	//   12   21:iconst_0        
	//   13   22:istore_3        
		if(!flag)
	//*  14   23:iload_3         
	//*  15   24:ifne            74
		{
			charsequence = ((CharSequence) (new StringBuilder()));
	//   16   27:new             #169 <Class StringBuilder>
	//   17   30:dup             
	//   18   31:invokespecial   #170 <Method void StringBuilder()>
	//   19   34:astore_0        
			((StringBuilder) (charsequence)).append("Count 'n' must be non-negative, but was ");
	//   20   35:aload_0         
	//   21   36:ldc2            #357 <String "Count 'n' must be non-negative, but was ">
	//   22   39:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   23   42:pop             
			((StringBuilder) (charsequence)).append(i);
	//   24   43:aload_0         
	//   25   44:iload_1         
	//   26   45:invokevirtual   #360 <Method StringBuilder StringBuilder.append(int)>
	//   27   48:pop             
			((StringBuilder) (charsequence)).append('.');
	//   28   49:aload_0         
	//   29   50:bipush          46
	//   30   52:invokevirtual   #363 <Method StringBuilder StringBuilder.append(char)>
	//   31   55:pop             
			throw (Throwable)new IllegalArgumentException(((Object) (((StringBuilder) (charsequence)).toString())).toString());
	//   32   56:new             #365 <Class IllegalArgumentException>
	//   33   59:dup             
	//   34   60:aload_0         
	//   35   61:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   36   64:invokevirtual   #368 <Method String Object.toString()>
	//   37   67:invokespecial   #369 <Method void IllegalArgumentException(String)>
	//   38   70:checkcast       #371 <Class Throwable>
	//   39   73:athrow          
		}
		switch(i)
	//*  40   74:iload_1         
		{
	//*  41   75:tableswitch     0 1: default 96
	//	               0 157
	//	               1 152
		default:
			switch(charsequence.length())
	//*  42   96:aload_0         
	//*  43   97:invokeinterface #157 <Method int CharSequence.length()>
			{
	//*  44  102:tableswitch     0 1: default 124
	//	               0 204
	//	               1 161
			default:
				StringBuilder stringbuilder = new StringBuilder(charsequence.length() * i);
	//   45  124:new             #169 <Class StringBuilder>
	//   46  127:dup             
	//   47  128:aload_0         
	//   48  129:invokeinterface #157 <Method int CharSequence.length()>
	//   49  134:iload_1         
	//   50  135:imul            
	//   51  136:invokespecial   #374 <Method void StringBuilder(int)>
	//   52  139:astore          6
				if(1 <= i)
	//*  53  141:iconst_1        
	//*  54  142:iload_1         
	//*  55  143:icmpgt          227
				{
					char c;
					int j = ((int) (flag2));
	//   56  146:iload           5
	//   57  148:istore_3        
	//*  58  149:goto            208
	//*  59  152:aload_0         
	//*  60  153:invokevirtual   #368 <Method String Object.toString()>
	//*  61  156:areturn         
	//*  62  157:ldc2            #375 <String "">
	//*  63  160:areturn         
	//*  64  161:aload_0         
	//*  65  162:iconst_0        
	//*  66  163:invokeinterface #320 <Method char CharSequence.charAt(int)>
	//*  67  168:istore_2        
	//*  68  169:iload_1         
	//*  69  170:newarray        char[]
	//*  70  172:astore_0        
	//*  71  173:aload_0         
	//*  72  174:arraylength     
	//*  73  175:istore_3        
	//*  74  176:iload           4
	//*  75  178:istore_1        
	//*  76  179:iload_1         
	//*  77  180:iload_3         
	//*  78  181:icmpge          195
	//*  79  184:aload_0         
	//*  80  185:iload_1         
	//*  81  186:iload_2         
	//*  82  187:castore         
	//*  83  188:iload_1         
	//*  84  189:iconst_1        
	//*  85  190:iadd            
	//*  86  191:istore_1        
	//*  87  192:goto            179
	//*  88  195:new             #107 <Class String>
	//*  89  198:dup             
	//*  90  199:aload_0         
	//*  91  200:invokespecial   #134 <Method void String(char[])>
	//*  92  203:areturn         
	//*  93  204:ldc2            #375 <String "">
	//*  94  207:areturn         
					do
					{
						stringbuilder.append(charsequence);
	//   95  208:aload           6
	//   96  210:aload_0         
	//   97  211:invokevirtual   #378 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   98  214:pop             
						if(j == i)
							break;
	//   99  215:iload_3         
	//  100  216:iload_1         
	//  101  217:icmpeq          227
						j++;
	//  102  220:iload_3         
	//  103  221:iconst_1        
	//  104  222:iadd            
	//  105  223:istore_3        
					} while(true);
	//  106  224:goto            208
				}
				charsequence = ((CharSequence) (stringbuilder.toString()));
	//  107  227:aload           6
	//  108  229:invokevirtual   #202 <Method String StringBuilder.toString()>
	//  109  232:astore_0        
				Intrinsics.checkExpressionValueIsNotNull(((Object) (charsequence)), "sb.toString()");
	//  110  233:aload_0         
	//  111  234:ldc2            #380 <String "sb.toString()">
	//  112  237:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
				return ((String) (charsequence));
	//  113  240:aload_0         
	//  114  241:areturn         

			case 1: // '\001'
				c = charsequence.charAt(0);
				charsequence = ((CharSequence) (new char[i]));
				j = charsequence.length;
				for(i = ((int) (flag1)); i < j; i++)
					charsequence[i] = c;

				return new String(((char []) (charsequence)));

			case 0: // '\0'
				return "";
			}

		case 1: // '\001'
			return ((Object) (charsequence)).toString();

		case 0: // '\0'
			return "";
		}
	}

	public static final String replace(String s, char c, char c1, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!flag)
	//*   3    6:iload_3         
	//*   4    7:ifne            26
		{
			s = s.replace(c, c1);
	//    5   10:aload_0         
	//    6   11:iload_1         
	//    7   12:iload_2         
	//    8   13:invokevirtual   #384 <Method String String.replace(char, char)>
	//    9   16:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.Strin\u2026replace(oldChar, newChar)");
	//   10   17:aload_0         
	//   11   18:ldc2            #386 <String "(this as java.lang.Strin\u2026replace(oldChar, newChar)">
	//   12   21:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   13   24:aload_0         
	//   14   25:areturn         
		} else
		{
			return SequencesKt.joinToString$default(StringsKt.splitToSequence$default((CharSequence)s, new char[] {
				c
			}, flag, 0, 4, ((Object) (null))), (CharSequence)java.lang.String.valueOf(c1), ((CharSequence) (null)), ((CharSequence) (null)), 0, ((CharSequence) (null)), ((kotlin.jvm.functions.Function1) (null)), 62, ((Object) (null)));
	//   15   26:aload_0         
	//   16   27:checkcast       #154 <Class CharSequence>
	//   17   30:iconst_1        
	//   18   31:newarray        char[]
	//   19   33:dup             
	//   20   34:iconst_0        
	//   21   35:iload_1         
	//   22   36:castore         
	//   23   37:iload_3         
	//   24   38:iconst_0        
	//   25   39:iconst_4        
	//   26   40:aconst_null     
	//   27   41:invokestatic    #390 <Method kotlin.sequences.Sequence StringsKt.splitToSequence$default(CharSequence, char[], boolean, int, int, Object)>
	//   28   44:iload_2         
	//   29   45:invokestatic    #394 <Method String String.valueOf(char)>
	//   30   48:checkcast       #154 <Class CharSequence>
	//   31   51:aconst_null     
	//   32   52:aconst_null     
	//   33   53:iconst_0        
	//   34   54:aconst_null     
	//   35   55:aconst_null     
	//   36   56:bipush          62
	//   37   58:aconst_null     
	//   38   59:invokestatic    #400 <Method String SequencesKt.joinToString$default(kotlin.sequences.Sequence, CharSequence, CharSequence, CharSequence, int, CharSequence, kotlin.jvm.functions.Function1, int, Object)>
	//   39   62:areturn         
		}
	}

	public static final String replace(String s, String s1, String s2, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "oldValue");
	//    3    6:aload_1         
	//    4    7:ldc2            #402 <String "oldValue">
	//    5   10:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s2)), "newValue");
	//    6   13:aload_2         
	//    7   14:ldc2            #403 <String "newValue">
	//    8   17:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return SequencesKt.joinToString$default(StringsKt.splitToSequence$default((CharSequence)s, new String[] {
			s1
		}, flag, 0, 4, ((Object) (null))), (CharSequence)s2, ((CharSequence) (null)), ((CharSequence) (null)), 0, ((CharSequence) (null)), ((kotlin.jvm.functions.Function1) (null)), 62, ((Object) (null)));
	//    9   20:aload_0         
	//   10   21:checkcast       #154 <Class CharSequence>
	//   11   24:iconst_1        
	//   12   25:anewarray       String[]
	//   13   28:dup             
	//   14   29:iconst_0        
	//   15   30:aload_1         
	//   16   31:aastore         
	//   17   32:iload_3         
	//   18   33:iconst_0        
	//   19   34:iconst_4        
	//   20   35:aconst_null     
	//   21   36:invokestatic    #406 <Method kotlin.sequences.Sequence StringsKt.splitToSequence$default(CharSequence, String[], boolean, int, int, Object)>
	//   22   39:aload_2         
	//   23   40:checkcast       #154 <Class CharSequence>
	//   24   43:aconst_null     
	//   25   44:aconst_null     
	//   26   45:iconst_0        
	//   27   46:aconst_null     
	//   28   47:aconst_null     
	//   29   48:bipush          62
	//   30   50:aconst_null     
	//   31   51:invokestatic    #400 <Method String SequencesKt.joinToString$default(kotlin.sequences.Sequence, CharSequence, CharSequence, CharSequence, int, CharSequence, kotlin.jvm.functions.Function1, int, Object)>
	//   32   54:areturn         
	}

	public static String replace$default(String s, char c, char c1, boolean flag, int i, Object obj)
	{
		if((i & 4) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			flag = false;
	//    4    7:iconst_0        
	//    5    8:istore_3        
		return StringsKt.replace(s, c, c1, flag);
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:iload_2         
	//    9   12:iload_3         
	//   10   13:invokestatic    #410 <Method String StringsKt.replace(String, char, char, boolean)>
	//   11   16:areturn         
	}

	public static String replace$default(String s, String s1, String s2, boolean flag, int i, Object obj)
	{
		if((i & 4) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			flag = false;
	//    4    7:iconst_0        
	//    5    8:istore_3        
		return StringsKt.replace(s, s1, s2, flag);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:aload_2         
	//    9   12:iload_3         
	//   10   13:invokestatic    #413 <Method String StringsKt.replace(String, String, String, boolean)>
	//   11   16:areturn         
	}

	public static final String replaceFirst(String s, char c, char c1, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		CharSequence charsequence = (CharSequence)s;
	//    3    6:aload_0         
	//    4    7:checkcast       #154 <Class CharSequence>
	//    5   10:astore          5
		int i = StringsKt.indexOf$default(charsequence, c, 0, flag, 2, ((Object) (null)));
	//    6   12:aload           5
	//    7   14:iload_1         
	//    8   15:iconst_0        
	//    9   16:iload_3         
	//   10   17:iconst_2        
	//   11   18:aconst_null     
	//   12   19:invokestatic    #417 <Method int StringsKt.indexOf$default(CharSequence, char, int, boolean, int, Object)>
	//   13   22:istore          4
		if(i < 0)
	//*  14   24:iload           4
	//*  15   26:ifge            31
			return s;
	//   16   29:aload_0         
	//   17   30:areturn         
		else
			return ((Object) (StringsKt.replaceRange(charsequence, i, i + 1, (CharSequence)java.lang.String.valueOf(c1)))).toString();
	//   18   31:aload           5
	//   19   33:iload           4
	//   20   35:iload           4
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:iload_2         
	//   24   40:invokestatic    #394 <Method String String.valueOf(char)>
	//   25   43:checkcast       #154 <Class CharSequence>
	//   26   46:invokestatic    #421 <Method CharSequence StringsKt.replaceRange(CharSequence, int, int, CharSequence)>
	//   27   49:invokevirtual   #368 <Method String Object.toString()>
	//   28   52:areturn         
	}

	public static final String replaceFirst(String s, String s1, String s2, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "oldValue");
	//    3    6:aload_1         
	//    4    7:ldc2            #402 <String "oldValue">
	//    5   10:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s2)), "newValue");
	//    6   13:aload_2         
	//    7   14:ldc2            #403 <String "newValue">
	//    8   17:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		CharSequence charsequence = (CharSequence)s;
	//    9   20:aload_0         
	//   10   21:checkcast       #154 <Class CharSequence>
	//   11   24:astore          5
		int i = StringsKt.indexOf$default(charsequence, s1, 0, flag, 2, ((Object) (null)));
	//   12   26:aload           5
	//   13   28:aload_1         
	//   14   29:iconst_0        
	//   15   30:iload_3         
	//   16   31:iconst_2        
	//   17   32:aconst_null     
	//   18   33:invokestatic    #424 <Method int StringsKt.indexOf$default(CharSequence, String, int, boolean, int, Object)>
	//   19   36:istore          4
		if(i < 0)
	//*  20   38:iload           4
	//*  21   40:ifge            45
			return s;
	//   22   43:aload_0         
	//   23   44:areturn         
		else
			return ((Object) (StringsKt.replaceRange(charsequence, i, s1.length() + i, (CharSequence)s2))).toString();
	//   24   45:aload           5
	//   25   47:iload           4
	//   26   49:aload_1         
	//   27   50:invokevirtual   #247 <Method int String.length()>
	//   28   53:iload           4
	//   29   55:iadd            
	//   30   56:aload_2         
	//   31   57:checkcast       #154 <Class CharSequence>
	//   32   60:invokestatic    #421 <Method CharSequence StringsKt.replaceRange(CharSequence, int, int, CharSequence)>
	//   33   63:invokevirtual   #368 <Method String Object.toString()>
	//   34   66:areturn         
	}

	public static String replaceFirst$default(String s, char c, char c1, boolean flag, int i, Object obj)
	{
		if((i & 4) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			flag = false;
	//    4    7:iconst_0        
	//    5    8:istore_3        
		return StringsKt.replaceFirst(s, c, c1, flag);
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:iload_2         
	//    9   12:iload_3         
	//   10   13:invokestatic    #427 <Method String StringsKt.replaceFirst(String, char, char, boolean)>
	//   11   16:areturn         
	}

	public static String replaceFirst$default(String s, String s1, String s2, boolean flag, int i, Object obj)
	{
		if((i & 4) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			flag = false;
	//    4    7:iconst_0        
	//    5    8:istore_3        
		return StringsKt.replaceFirst(s, s1, s2, flag);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:aload_2         
	//    9   12:iload_3         
	//   10   13:invokestatic    #429 <Method String StringsKt.replaceFirst(String, String, String, boolean)>
	//   11   16:areturn         
	}

	public static final List split(CharSequence charsequence, Pattern pattern, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (pattern)), "regex");
	//    3    6:aload_1         
	//    4    7:ldc2            #431 <String "regex">
	//    5   10:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		boolean flag;
		if(i >= 0)
	//*   6   13:iload_2         
	//*   7   14:iflt            22
			flag = true;
	//    8   17:iconst_1        
	//    9   18:istore_3        
		else
	//*  10   19:goto            24
			flag = false;
	//   11   22:iconst_0        
	//   12   23:istore_3        
		if(!flag)
	//*  13   24:iload_3         
	//*  14   25:ifne            75
		{
			charsequence = ((CharSequence) (new StringBuilder()));
	//   15   28:new             #169 <Class StringBuilder>
	//   16   31:dup             
	//   17   32:invokespecial   #170 <Method void StringBuilder()>
	//   18   35:astore_0        
			((StringBuilder) (charsequence)).append("Limit must be non-negative, but was ");
	//   19   36:aload_0         
	//   20   37:ldc2            #433 <String "Limit must be non-negative, but was ">
	//   21   40:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			((StringBuilder) (charsequence)).append(i);
	//   23   44:aload_0         
	//   24   45:iload_2         
	//   25   46:invokevirtual   #360 <Method StringBuilder StringBuilder.append(int)>
	//   26   49:pop             
			((StringBuilder) (charsequence)).append('.');
	//   27   50:aload_0         
	//   28   51:bipush          46
	//   29   53:invokevirtual   #363 <Method StringBuilder StringBuilder.append(char)>
	//   30   56:pop             
			throw (Throwable)new IllegalArgumentException(((Object) (((StringBuilder) (charsequence)).toString())).toString());
	//   31   57:new             #365 <Class IllegalArgumentException>
	//   32   60:dup             
	//   33   61:aload_0         
	//   34   62:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   35   65:invokevirtual   #368 <Method String Object.toString()>
	//   36   68:invokespecial   #369 <Method void IllegalArgumentException(String)>
	//   37   71:checkcast       #371 <Class Throwable>
	//   38   74:athrow          
		}
		int j = i;
	//   39   75:iload_2         
	//   40   76:istore_3        
		if(i == 0)
	//*  41   77:iload_2         
	//*  42   78:ifne            83
			j = -1;
	//   43   81:iconst_m1       
	//   44   82:istore_3        
		charsequence = ((CharSequence) (pattern.split(charsequence, j)));
	//   45   83:aload_1         
	//   46   84:aload_0         
	//   47   85:iload_3         
	//   48   86:invokevirtual   #438 <Method String[] Pattern.split(CharSequence, int)>
	//   49   89:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (charsequence)), "regex.split(this, if (limit == 0) -1 else limit)");
	//   50   90:aload_0         
	//   51   91:ldc2            #440 <String "regex.split(this, if (limit == 0) -1 else limit)">
	//   52   94:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ArraysKt.asList(((Object []) (charsequence)));
	//   53   97:aload_0         
	//   54   98:invokestatic    #446 <Method List ArraysKt.asList(Object[])>
	//   55  101:areturn         
	}

	public static List split$default(CharSequence charsequence, Pattern pattern, int i, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			i = 0;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		return StringsKt.split(charsequence, pattern, i);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:iload_2         
	//    9   11:invokestatic    #451 <Method List StringsKt.split(CharSequence, Pattern, int)>
	//   10   14:areturn         
	}

	public static final boolean startsWith(String s, String s1, int i, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "prefix");
	//    3    6:aload_1         
	//    4    7:ldc2            #453 <String "prefix">
	//    5   10:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!flag)
	//*   6   13:iload_3         
	//*   7   14:ifne            24
			return s.startsWith(s1, i);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:iload_2         
	//   11   20:invokevirtual   #456 <Method boolean String.startsWith(String, int)>
	//   12   23:ireturn         
		else
			return StringsKt.regionMatches(s, i, s1, 0, s1.length(), flag);
	//   13   24:aload_0         
	//   14   25:iload_2         
	//   15   26:aload_1         
	//   16   27:iconst_0        
	//   17   28:aload_1         
	//   18   29:invokevirtual   #247 <Method int String.length()>
	//   19   32:iload_3         
	//   20   33:invokestatic    #250 <Method boolean StringsKt.regionMatches(String, int, String, int, int, boolean)>
	//   21   36:ireturn         
	}

	public static final boolean startsWith(String s, String s1, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #146 <String "receiver$0">
	//    2    3:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "prefix");
	//    3    6:aload_1         
	//    4    7:ldc2            #453 <String "prefix">
	//    5   10:invokestatic    #152 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!flag)
	//*   6   13:iload_2         
	//*   7   14:ifne            23
			return s.startsWith(s1);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokevirtual   #458 <Method boolean String.startsWith(String)>
	//   11   22:ireturn         
		else
			return StringsKt.regionMatches(s, 0, s1, 0, s1.length(), flag);
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:aload_1         
	//   15   26:iconst_0        
	//   16   27:aload_1         
	//   17   28:invokevirtual   #247 <Method int String.length()>
	//   18   31:iload_2         
	//   19   32:invokestatic    #250 <Method boolean StringsKt.regionMatches(String, int, String, int, int, boolean)>
	//   20   35:ireturn         
	}

	public static boolean startsWith$default(String s, String s1, int i, boolean flag, int j, Object obj)
	{
		if((j & 4) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			flag = false;
	//    4    7:iconst_0        
	//    5    8:istore_3        
		return StringsKt.startsWith(s, s1, i, flag);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:iload_2         
	//    9   12:iload_3         
	//   10   13:invokestatic    #462 <Method boolean StringsKt.startsWith(String, String, int, boolean)>
	//   11   16:ireturn         
	}

	public static boolean startsWith$default(String s, String s1, boolean flag, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		return StringsKt.startsWith(s, s1, flag);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:iload_2         
	//    9   11:invokestatic    #464 <Method boolean StringsKt.startsWith(String, String, boolean)>
	//   10   14:ireturn         
	}

	private static final String substring(String s, int i)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		} else
		{
			s = s.substring(i);
	//    7   14:aload_0         
	//    8   15:iload_1         
	//    9   16:invokevirtual   #197 <Method String String.substring(int)>
	//   10   19:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.String).substring(startIndex)");
	//   11   20:aload_0         
	//   12   21:ldc1            #199 <String "(this as java.lang.String).substring(startIndex)">
	//   13   23:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   14   26:aload_0         
	//   15   27:areturn         
		}
	}

	private static final String substring(String s, int i, int j)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		} else
		{
			s = s.substring(i, j);
	//    7   14:aload_0         
	//    8   15:iload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #173 <Method String String.substring(int, int)>
	//   11   20:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
	//   12   21:aload_0         
	//   13   22:ldc1            #175 <String "(this as java.lang.Strin\u2026ing(startIndex, endIndex)">
	//   14   24:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   15   27:aload_0         
	//   16   28:areturn         
		}
	}

	private static final byte[] toByteArray(String s, Charset charset)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		} else
		{
			s = ((String) (s.getBytes(charset)));
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #471 <Method byte[] String.getBytes(Charset)>
	//   10   19:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.String).getBytes(charset)");
	//   11   20:aload_0         
	//   12   21:ldc2            #473 <String "(this as java.lang.String).getBytes(charset)">
	//   13   24:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return ((byte []) (s));
	//   14   27:aload_0         
	//   15   28:areturn         
		}
	}

	static byte[] toByteArray$default(String s, Charset charset, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            10
			charset = Charsets.UTF_8;
	//    4    6:getstatic       #121 <Field Charset Charsets.UTF_8>
	//    5    9:astore_1        
		if(s == null)
	//*   6   10:aload_0         
	//*   7   11:ifnonnull       24
		{
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    8   14:new             #180 <Class TypeCastException>
	//    9   17:dup             
	//   10   18:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//   11   20:invokespecial   #185 <Method void TypeCastException(String)>
	//   12   23:athrow          
		} else
		{
			s = ((String) (s.getBytes(charset)));
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #471 <Method byte[] String.getBytes(Charset)>
	//   16   29:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.String).getBytes(charset)");
	//   17   30:aload_0         
	//   18   31:ldc2            #473 <String "(this as java.lang.String).getBytes(charset)">
	//   19   34:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return ((byte []) (s));
	//   20   37:aload_0         
	//   21   38:areturn         
		}
	}

	private static final char[] toCharArray(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		} else
		{
			s = ((String) (s.toCharArray()));
	//    7   14:aload_0         
	//    8   15:invokevirtual   #479 <Method char[] String.toCharArray()>
	//    9   18:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.String).toCharArray()");
	//   10   19:aload_0         
	//   11   20:ldc2            #481 <String "(this as java.lang.String).toCharArray()">
	//   12   23:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return ((char []) (s));
	//   13   26:aload_0         
	//   14   27:areturn         
		}
	}

	private static final char[] toCharArray(String s, char ac[], int i, int j, int k)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		} else
		{
			s.getChars(j, k, ac, i);
	//    7   14:aload_0         
	//    8   15:iload_3         
	//    9   16:iload           4
	//   10   18:aload_1         
	//   11   19:iload_2         
	//   12   20:invokevirtual   #486 <Method void String.getChars(int, int, char[], int)>
			return ac;
	//   13   23:aload_1         
	//   14   24:areturn         
		}
	}

	static char[] toCharArray$default(String s, char ac[], int i, int j, int k, int l, Object obj)
	{
		if((l & 2) != 0)
	//*   0    0:iload           5
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if((l & 4) != 0)
	//*   6    9:iload           5
	//*   7   11:iconst_4        
	//*   8   12:iand            
	//*   9   13:ifeq            18
			j = 0;
	//   10   16:iconst_0        
	//   11   17:istore_3        
		if((l & 8) != 0)
	//*  12   18:iload           5
	//*  13   20:bipush          8
	//*  14   22:iand            
	//*  15   23:ifeq            32
			k = s.length();
	//   16   26:aload_0         
	//   17   27:invokevirtual   #247 <Method int String.length()>
	//   18   30:istore          4
		if(s == null)
	//*  19   32:aload_0         
	//*  20   33:ifnonnull       46
		{
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//   21   36:new             #180 <Class TypeCastException>
	//   22   39:dup             
	//   23   40:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//   24   42:invokespecial   #185 <Method void TypeCastException(String)>
	//   25   45:athrow          
		} else
		{
			s.getChars(j, k, ac, i);
	//   26   46:aload_0         
	//   27   47:iload_3         
	//   28   48:iload           4
	//   29   50:aload_1         
	//   30   51:iload_2         
	//   31   52:invokevirtual   #486 <Method void String.getChars(int, int, char[], int)>
			return ac;
	//   32   55:aload_1         
	//   33   56:areturn         
		}
	}

	private static final String toLowerCase(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		} else
		{
			s = s.toLowerCase();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #239 <Method String String.toLowerCase()>
	//    9   18:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.String).toLowerCase()");
	//   10   19:aload_0         
	//   11   20:ldc1            #241 <String "(this as java.lang.String).toLowerCase()">
	//   12   22:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   13   25:aload_0         
	//   14   26:areturn         
		}
	}

	private static final String toLowerCase(String s, Locale locale)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		} else
		{
			s = s.toLowerCase(locale);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #492 <Method String String.toLowerCase(Locale)>
	//   10   19:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.String).toLowerCase(locale)");
	//   11   20:aload_0         
	//   12   21:ldc2            #494 <String "(this as java.lang.String).toLowerCase(locale)">
	//   13   24:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   14   27:aload_0         
	//   15   28:areturn         
		}
	}

	private static final Pattern toPattern(String s, int i)
	{
		s = ((String) (Pattern.compile(s, i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #498 <Method Pattern Pattern.compile(String, int)>
	//    3    5:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "java.util.regex.Pattern.compile(this, flags)");
	//    4    6:aload_0         
	//    5    7:ldc2            #500 <String "java.util.regex.Pattern.compile(this, flags)">
	//    6   10:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((Pattern) (s));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	static Pattern toPattern$default(String s, int i, int j, Object obj)
	{
		if((j & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			i = 0;
	//    4    6:iconst_0        
	//    5    7:istore_1        
		s = ((String) (Pattern.compile(s, i)));
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:invokestatic    #498 <Method Pattern Pattern.compile(String, int)>
	//    9   13:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "java.util.regex.Pattern.compile(this, flags)");
	//   10   14:aload_0         
	//   11   15:ldc2            #500 <String "java.util.regex.Pattern.compile(this, flags)">
	//   12   18:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((Pattern) (s));
	//   13   21:aload_0         
	//   14   22:areturn         
	}

	private static final String toUpperCase(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		} else
		{
			s = s.toUpperCase();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #188 <Method String String.toUpperCase()>
	//    9   18:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.String).toUpperCase()");
	//   10   19:aload_0         
	//   11   20:ldc1            #190 <String "(this as java.lang.String).toUpperCase()">
	//   12   22:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   13   25:aload_0         
	//   14   26:areturn         
		}
	}

	private static final String toUpperCase(String s, Locale locale)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #180 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #182 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #185 <Method void TypeCastException(String)>
	//    6   13:athrow          
		} else
		{
			s = s.toUpperCase(locale);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #504 <Method String String.toUpperCase(Locale)>
	//   10   19:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.String).toUpperCase(locale)");
	//   11   20:aload_0         
	//   12   21:ldc2            #506 <String "(this as java.lang.String).toUpperCase(locale)">
	//   13   24:invokestatic    #178 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   14   27:aload_0         
	//   15   28:areturn         
		}
	}
}
