// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.text;

import java.math.*;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.text:
//			StringsKt__StringBuilderKt, ScreenFloatValueRegEx, Regex, CharsKt, 
//			StringsKt

class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt
{

	public StringsKt__StringNumberConversionsJVMKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void StringsKt__StringBuilderKt()>
	//    2    4:return          
	}

	private static final Object screenFloatValue$StringsKt__StringNumberConversionsJVMKt(String s, Function1 function1)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		try
		{
			if(ScreenFloatValueRegEx.value.matches((CharSequence)s))
	//*   2    2:getstatic       #62  <Field Regex ScreenFloatValueRegEx.value>
	//*   3    5:aload_0         
	//*   4    6:checkcast       #64  <Class CharSequence>
	//*   5    9:invokevirtual   #70  <Method boolean Regex.matches(CharSequence)>
	//*   6   12:ifeq            23
				obj = function1.invoke(((Object) (s)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokeinterface #76  <Method Object Function1.invoke(Object)>
	//   10   22:astore_2        
		}
	//*  11   23:aload_2         
	//*  12   24:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   25:astore_0        
		{
			return ((Object) (null));
	//   14   26:aconst_null     
	//   15   27:areturn         
		}
		return obj;
	}

	private static final BigDecimal toBigDecimal(String s)
	{
		return new BigDecimal(s);
	//    0    0:new             #86  <Class BigDecimal>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #89  <Method void BigDecimal(String)>
	//    4    8:areturn         
	}

	private static final BigDecimal toBigDecimal(String s, MathContext mathcontext)
	{
		return new BigDecimal(s, mathcontext);
	//    0    0:new             #86  <Class BigDecimal>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #95  <Method void BigDecimal(String, MathContext)>
	//    5    9:areturn         
	}

	public static final BigDecimal toBigDecimalOrNull(String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #98  <String "receiver$0">
	//    2    3:invokestatic    #104 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		BigDecimal bigdecimal = null;
	//    3    6:aconst_null     
	//    4    7:astore_1        
		try
		{
			if(ScreenFloatValueRegEx.value.matches((CharSequence)s))
	//*   5    8:getstatic       #62  <Field Regex ScreenFloatValueRegEx.value>
	//*   6   11:aload_0         
	//*   7   12:checkcast       #64  <Class CharSequence>
	//*   8   15:invokevirtual   #70  <Method boolean Regex.matches(CharSequence)>
	//*   9   18:ifeq            30
				bigdecimal = new BigDecimal(s);
	//   10   21:new             #86  <Class BigDecimal>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:invokespecial   #89  <Method void BigDecimal(String)>
	//   14   29:astore_1        
		}
	//*  15   30:aload_1         
	//*  16   31:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  17   32:astore_0        
		{
			return null;
	//   18   33:aconst_null     
	//   19   34:areturn         
		}
		return bigdecimal;
	}

	public static final BigDecimal toBigDecimalOrNull(String s, MathContext mathcontext)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #98  <String "receiver$0">
	//    2    3:invokestatic    #104 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (mathcontext)), "mathContext");
	//    3    6:aload_1         
	//    4    7:ldc1            #105 <String "mathContext">
	//    5    9:invokestatic    #104 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		BigDecimal bigdecimal = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
		try
		{
			if(ScreenFloatValueRegEx.value.matches((CharSequence)s))
	//*   8   14:getstatic       #62  <Field Regex ScreenFloatValueRegEx.value>
	//*   9   17:aload_0         
	//*  10   18:checkcast       #64  <Class CharSequence>
	//*  11   21:invokevirtual   #70  <Method boolean Regex.matches(CharSequence)>
	//*  12   24:ifeq            37
				bigdecimal = new BigDecimal(s, mathcontext);
	//   13   27:new             #86  <Class BigDecimal>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #95  <Method void BigDecimal(String, MathContext)>
	//   18   36:astore_2        
		}
	//*  19   37:aload_2         
	//*  20   38:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  21   39:astore_0        
		{
			return null;
	//   22   40:aconst_null     
	//   23   41:areturn         
		}
		return bigdecimal;
	}

	private static final BigInteger toBigInteger(String s)
	{
		return new BigInteger(s);
	//    0    0:new             #108 <Class BigInteger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #109 <Method void BigInteger(String)>
	//    4    8:areturn         
	}

	private static final BigInteger toBigInteger(String s, int i)
	{
		return new BigInteger(s, CharsKt.checkRadix(i));
	//    0    0:new             #108 <Class BigInteger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokestatic    #116 <Method int CharsKt.checkRadix(int)>
	//    5    9:invokespecial   #119 <Method void BigInteger(String, int)>
	//    6   12:areturn         
	}

	public static final BigInteger toBigIntegerOrNull(String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #98  <String "receiver$0">
	//    2    3:invokestatic    #104 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return StringsKt.toBigIntegerOrNull(s, 10);
	//    3    6:aload_0         
	//    4    7:bipush          10
	//    5    9:invokestatic    #122 <Method BigInteger StringsKt.toBigIntegerOrNull(String, int)>
	//    6   12:areturn         
	}

	public static final BigInteger toBigIntegerOrNull(String s, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #98  <String "receiver$0">
	//    2    3:invokestatic    #104 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		CharsKt.checkRadix(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #116 <Method int CharsKt.checkRadix(int)>
	//    5   10:pop             
		int k = s.length();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #128 <Method int String.length()>
	//    8   15:istore_3        
		int j = 0;
	//    9   16:iconst_0        
	//   10   17:istore_2        
label0:
		switch(k)
	//*  11   18:iload_3         
		{
	//*  12   19:tableswitch     0 1: default 40
	//	               0 69
	//	               1 55
		default:
			if(s.charAt(0) == '-')
	//*  13   40:aload_0         
	//*  14   41:iconst_0        
	//*  15   42:invokevirtual   #132 <Method char String.charAt(int)>
	//*  16   45:bipush          45
	//*  17   47:icmpne          71
				j = 1;
	//   18   50:iconst_1        
	//   19   51:istore_2        
	//*  20   52:goto            71
	//*  21   55:aload_0         
	//*  22   56:iconst_0        
	//*  23   57:invokevirtual   #132 <Method char String.charAt(int)>
	//*  24   60:iload_1         
	//*  25   61:invokestatic    #136 <Method int CharsKt.digitOf(char, int)>
	//*  26   64:ifge            97
	//*  27   67:aconst_null     
	//*  28   68:areturn         
	//*  29   69:aconst_null     
	//*  30   70:areturn         
			do
			{
				if(j >= k)
					break label0;
	//   31   71:iload_2         
	//   32   72:iload_3         
	//   33   73:icmpge          97
				if(CharsKt.digitOf(s.charAt(j), i) < 0)
	//*  34   76:aload_0         
	//*  35   77:iload_2         
	//*  36   78:invokevirtual   #132 <Method char String.charAt(int)>
	//*  37   81:iload_1         
	//*  38   82:invokestatic    #136 <Method int CharsKt.digitOf(char, int)>
	//*  39   85:ifge            90
					return null;
	//   40   88:aconst_null     
	//   41   89:areturn         
				j++;
	//   42   90:iload_2         
	//   43   91:iconst_1        
	//   44   92:iadd            
	//   45   93:istore_2        
			} while(true);
	//   46   94:goto            71

		case 1: // '\001'
			if(CharsKt.digitOf(s.charAt(0), i) < 0)
				return null;
			break;

		case 0: // '\0'
			return null;
		}
		return new BigInteger(s, CharsKt.checkRadix(i));
	//   47   97:new             #108 <Class BigInteger>
	//   48  100:dup             
	//   49  101:aload_0         
	//   50  102:iload_1         
	//   51  103:invokestatic    #116 <Method int CharsKt.checkRadix(int)>
	//   52  106:invokespecial   #119 <Method void BigInteger(String, int)>
	//   53  109:areturn         
	}

	private static final boolean toBoolean(String s)
	{
		return Boolean.parseBoolean(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #142 <Method boolean Boolean.parseBoolean(String)>
	//    2    4:ireturn         
	}

	private static final byte toByte(String s)
	{
		return Byte.parseByte(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #148 <Method byte Byte.parseByte(String)>
	//    2    4:ireturn         
	}

	private static final byte toByte(String s, int i)
	{
		return Byte.parseByte(s, CharsKt.checkRadix(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #116 <Method int CharsKt.checkRadix(int)>
	//    3    5:invokestatic    #152 <Method byte Byte.parseByte(String, int)>
	//    4    8:ireturn         
	}

	private static final double toDouble(String s)
	{
		return Double.parseDouble(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #158 <Method double Double.parseDouble(String)>
	//    2    4:dreturn         
	}

	public static final Double toDoubleOrNull(String s)
	{
label0:
		{
			Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #98  <String "receiver$0">
	//    2    3:invokestatic    #104 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Double double1 = null;
	//    3    6:aconst_null     
	//    4    7:astore_3        
			double d;
			try
			{
				if(!ScreenFloatValueRegEx.value.matches((CharSequence)s))
					break label0;
	//    5    8:getstatic       #62  <Field Regex ScreenFloatValueRegEx.value>
	//    6   11:aload_0         
	//    7   12:checkcast       #64  <Class CharSequence>
	//    8   15:invokevirtual   #70  <Method boolean Regex.matches(CharSequence)>
	//    9   18:ifeq            31
				d = Double.parseDouble(s);
	//   10   21:aload_0         
	//   11   22:invokestatic    #158 <Method double Double.parseDouble(String)>
	//   12   25:dstore_1        
			}
	//*  13   26:dload_1         
	//*  14   27:invokestatic    #162 <Method Double Double.valueOf(double)>
	//*  15   30:astore_3        
	//*  16   31:aload_3         
	//*  17   32:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  18   33:astore_0        
			{
				return null;
	//   19   34:aconst_null     
	//   20   35:areturn         
			}
			double1 = Double.valueOf(d);
		}
		return double1;
	}

	private static final float toFloat(String s)
	{
		return Float.parseFloat(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #168 <Method float Float.parseFloat(String)>
	//    2    4:freturn         
	}

	public static final Float toFloatOrNull(String s)
	{
label0:
		{
			Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #98  <String "receiver$0">
	//    2    3:invokestatic    #104 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Float float1 = null;
	//    3    6:aconst_null     
	//    4    7:astore_2        
			float f;
			try
			{
				if(!ScreenFloatValueRegEx.value.matches((CharSequence)s))
					break label0;
	//    5    8:getstatic       #62  <Field Regex ScreenFloatValueRegEx.value>
	//    6   11:aload_0         
	//    7   12:checkcast       #64  <Class CharSequence>
	//    8   15:invokevirtual   #70  <Method boolean Regex.matches(CharSequence)>
	//    9   18:ifeq            31
				f = Float.parseFloat(s);
	//   10   21:aload_0         
	//   11   22:invokestatic    #168 <Method float Float.parseFloat(String)>
	//   12   25:fstore_1        
			}
	//*  13   26:fload_1         
	//*  14   27:invokestatic    #171 <Method Float Float.valueOf(float)>
	//*  15   30:astore_2        
	//*  16   31:aload_2         
	//*  17   32:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  18   33:astore_0        
			{
				return null;
	//   19   34:aconst_null     
	//   20   35:areturn         
			}
			float1 = Float.valueOf(f);
		}
		return float1;
	}

	private static final int toInt(String s)
	{
		return Integer.parseInt(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #177 <Method int Integer.parseInt(String)>
	//    2    4:ireturn         
	}

	private static final int toInt(String s, int i)
	{
		return Integer.parseInt(s, CharsKt.checkRadix(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #116 <Method int CharsKt.checkRadix(int)>
	//    3    5:invokestatic    #180 <Method int Integer.parseInt(String, int)>
	//    4    8:ireturn         
	}

	private static final long toLong(String s)
	{
		return Long.parseLong(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #186 <Method long Long.parseLong(String)>
	//    2    4:lreturn         
	}

	private static final long toLong(String s, int i)
	{
		return Long.parseLong(s, CharsKt.checkRadix(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #116 <Method int CharsKt.checkRadix(int)>
	//    3    5:invokestatic    #189 <Method long Long.parseLong(String, int)>
	//    4    8:lreturn         
	}

	private static final short toShort(String s)
	{
		return Short.parseShort(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #195 <Method short Short.parseShort(String)>
	//    2    4:ireturn         
	}

	private static final short toShort(String s, int i)
	{
		return Short.parseShort(s, CharsKt.checkRadix(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #116 <Method int CharsKt.checkRadix(int)>
	//    3    5:invokestatic    #198 <Method short Short.parseShort(String, int)>
	//    4    8:ireturn         
	}

	private static final String toString(byte byte0, int i)
	{
		String s = Integer.toString(((int) (byte0)), CharsKt.checkRadix(CharsKt.checkRadix(i)));
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #116 <Method int CharsKt.checkRadix(int)>
	//    3    5:invokestatic    #116 <Method int CharsKt.checkRadix(int)>
	//    4    8:invokestatic    #202 <Method String Integer.toString(int, int)>
	//    5   11:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
	//    6   12:aload_2         
	//    7   13:ldc1            #204 <String "java.lang.Integer.toStri\u2026(this, checkRadix(radix))">
	//    8   15:invokestatic    #207 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return s;
	//    9   18:aload_2         
	//   10   19:areturn         
	}

	private static final String toString(int i, int j)
	{
		String s = Integer.toString(i, CharsKt.checkRadix(j));
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #116 <Method int CharsKt.checkRadix(int)>
	//    3    5:invokestatic    #202 <Method String Integer.toString(int, int)>
	//    4    8:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
	//    5    9:aload_2         
	//    6   10:ldc1            #204 <String "java.lang.Integer.toStri\u2026(this, checkRadix(radix))">
	//    7   12:invokestatic    #207 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return s;
	//    8   15:aload_2         
	//    9   16:areturn         
	}

	private static final String toString(long l, int i)
	{
		String s = Long.toString(l, CharsKt.checkRadix(i));
	//    0    0:lload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #116 <Method int CharsKt.checkRadix(int)>
	//    3    5:invokestatic    #210 <Method String Long.toString(long, int)>
	//    4    8:astore_3        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "java.lang.Long.toString(this, checkRadix(radix))");
	//    5    9:aload_3         
	//    6   10:ldc1            #212 <String "java.lang.Long.toString(this, checkRadix(radix))">
	//    7   12:invokestatic    #207 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return s;
	//    8   15:aload_3         
	//    9   16:areturn         
	}

	private static final String toString(short word0, int i)
	{
		String s = Integer.toString(((int) (word0)), CharsKt.checkRadix(CharsKt.checkRadix(i)));
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #116 <Method int CharsKt.checkRadix(int)>
	//    3    5:invokestatic    #116 <Method int CharsKt.checkRadix(int)>
	//    4    8:invokestatic    #202 <Method String Integer.toString(int, int)>
	//    5   11:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
	//    6   12:aload_2         
	//    7   13:ldc1            #204 <String "java.lang.Integer.toStri\u2026(this, checkRadix(radix))">
	//    8   15:invokestatic    #207 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return s;
	//    9   18:aload_2         
	//   10   19:areturn         
	}
}
