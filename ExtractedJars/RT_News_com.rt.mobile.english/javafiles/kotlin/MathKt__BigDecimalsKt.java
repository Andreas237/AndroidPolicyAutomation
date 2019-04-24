// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin;

import java.math.*;
import kotlin.jvm.internal.Intrinsics;

class MathKt__BigDecimalsKt
{

	public MathKt__BigDecimalsKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:return          
	}

	private static final BigDecimal dec(BigDecimal bigdecimal)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (bigdecimal)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		bigdecimal = bigdecimal.subtract(BigDecimal.ONE);
	//    3    6:aload_0         
	//    4    7:getstatic       #59  <Field BigDecimal BigDecimal.ONE>
	//    5   10:invokevirtual   #62  <Method BigDecimal BigDecimal.subtract(BigDecimal)>
	//    6   13:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (bigdecimal)), "this.subtract(BigDecimal.ONE)");
	//    7   14:aload_0         
	//    8   15:ldc1            #64  <String "this.subtract(BigDecimal.ONE)">
	//    9   17:invokestatic    #67  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return bigdecimal;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	private static final BigDecimal div(BigDecimal bigdecimal, BigDecimal bigdecimal1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (bigdecimal)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		bigdecimal = bigdecimal.divide(bigdecimal1, RoundingMode.HALF_EVEN);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:getstatic       #76  <Field RoundingMode RoundingMode.HALF_EVEN>
	//    6   11:invokevirtual   #80  <Method BigDecimal BigDecimal.divide(BigDecimal, RoundingMode)>
	//    7   14:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (bigdecimal)), "this.divide(other, RoundingMode.HALF_EVEN)");
	//    8   15:aload_0         
	//    9   16:ldc1            #82  <String "this.divide(other, RoundingMode.HALF_EVEN)">
	//   10   18:invokestatic    #67  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return bigdecimal;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	private static final BigDecimal inc(BigDecimal bigdecimal)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (bigdecimal)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		bigdecimal = bigdecimal.add(BigDecimal.ONE);
	//    3    6:aload_0         
	//    4    7:getstatic       #59  <Field BigDecimal BigDecimal.ONE>
	//    5   10:invokevirtual   #85  <Method BigDecimal BigDecimal.add(BigDecimal)>
	//    6   13:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (bigdecimal)), "this.add(BigDecimal.ONE)");
	//    7   14:aload_0         
	//    8   15:ldc1            #87  <String "this.add(BigDecimal.ONE)">
	//    9   17:invokestatic    #67  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return bigdecimal;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	private static final BigDecimal minus(BigDecimal bigdecimal, BigDecimal bigdecimal1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (bigdecimal)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		bigdecimal = bigdecimal.subtract(bigdecimal1);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #62  <Method BigDecimal BigDecimal.subtract(BigDecimal)>
	//    6   11:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (bigdecimal)), "this.subtract(other)");
	//    7   12:aload_0         
	//    8   13:ldc1            #89  <String "this.subtract(other)">
	//    9   15:invokestatic    #67  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return bigdecimal;
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	private static final BigDecimal mod(BigDecimal bigdecimal, BigDecimal bigdecimal1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (bigdecimal)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		bigdecimal = bigdecimal.remainder(bigdecimal1);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #103 <Method BigDecimal BigDecimal.remainder(BigDecimal)>
	//    6   11:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (bigdecimal)), "this.remainder(other)");
	//    7   12:aload_0         
	//    8   13:ldc1            #105 <String "this.remainder(other)">
	//    9   15:invokestatic    #67  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return bigdecimal;
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	private static final BigDecimal plus(BigDecimal bigdecimal, BigDecimal bigdecimal1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (bigdecimal)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		bigdecimal = bigdecimal.add(bigdecimal1);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #85  <Method BigDecimal BigDecimal.add(BigDecimal)>
	//    6   11:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (bigdecimal)), "this.add(other)");
	//    7   12:aload_0         
	//    8   13:ldc1            #108 <String "this.add(other)">
	//    9   15:invokestatic    #67  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return bigdecimal;
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	private static final BigDecimal rem(BigDecimal bigdecimal, BigDecimal bigdecimal1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (bigdecimal)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		bigdecimal = bigdecimal.remainder(bigdecimal1);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #103 <Method BigDecimal BigDecimal.remainder(BigDecimal)>
	//    6   11:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (bigdecimal)), "this.remainder(other)");
	//    7   12:aload_0         
	//    8   13:ldc1            #105 <String "this.remainder(other)">
	//    9   15:invokestatic    #67  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return bigdecimal;
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	private static final BigDecimal times(BigDecimal bigdecimal, BigDecimal bigdecimal1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (bigdecimal)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		bigdecimal = bigdecimal.multiply(bigdecimal1);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #111 <Method BigDecimal BigDecimal.multiply(BigDecimal)>
	//    6   11:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (bigdecimal)), "this.multiply(other)");
	//    7   12:aload_0         
	//    8   13:ldc1            #113 <String "this.multiply(other)">
	//    9   15:invokestatic    #67  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return bigdecimal;
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	private static final BigDecimal toBigDecimal(double d)
	{
		return new BigDecimal(String.valueOf(d));
	//    0    0:new             #56  <Class BigDecimal>
	//    1    3:dup             
	//    2    4:dload_0         
	//    3    5:invokestatic    #120 <Method String String.valueOf(double)>
	//    4    8:invokespecial   #123 <Method void BigDecimal(String)>
	//    5   11:areturn         
	}

	private static final BigDecimal toBigDecimal(double d, MathContext mathcontext)
	{
		return new BigDecimal(String.valueOf(d), mathcontext);
	//    0    0:new             #56  <Class BigDecimal>
	//    1    3:dup             
	//    2    4:dload_0         
	//    3    5:invokestatic    #120 <Method String String.valueOf(double)>
	//    4    8:aload_2         
	//    5    9:invokespecial   #127 <Method void BigDecimal(String, MathContext)>
	//    6   12:areturn         
	}

	private static final BigDecimal toBigDecimal(float f)
	{
		return new BigDecimal(String.valueOf(f));
	//    0    0:new             #56  <Class BigDecimal>
	//    1    3:dup             
	//    2    4:fload_0         
	//    3    5:invokestatic    #131 <Method String String.valueOf(float)>
	//    4    8:invokespecial   #123 <Method void BigDecimal(String)>
	//    5   11:areturn         
	}

	private static final BigDecimal toBigDecimal(float f, MathContext mathcontext)
	{
		return new BigDecimal(String.valueOf(f), mathcontext);
	//    0    0:new             #56  <Class BigDecimal>
	//    1    3:dup             
	//    2    4:fload_0         
	//    3    5:invokestatic    #131 <Method String String.valueOf(float)>
	//    4    8:aload_1         
	//    5    9:invokespecial   #127 <Method void BigDecimal(String, MathContext)>
	//    6   12:areturn         
	}

	private static final BigDecimal toBigDecimal(int i)
	{
		BigDecimal bigdecimal = BigDecimal.valueOf(i);
	//    0    0:iload_0         
	//    1    1:i2l             
	//    2    2:invokestatic    #136 <Method BigDecimal BigDecimal.valueOf(long)>
	//    3    5:astore_1        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (bigdecimal)), "BigDecimal.valueOf(this.toLong())");
	//    4    6:aload_1         
	//    5    7:ldc1            #138 <String "BigDecimal.valueOf(this.toLong())">
	//    6    9:invokestatic    #67  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return bigdecimal;
	//    7   12:aload_1         
	//    8   13:areturn         
	}

	private static final BigDecimal toBigDecimal(int i, MathContext mathcontext)
	{
		return new BigDecimal(i, mathcontext);
	//    0    0:new             #56  <Class BigDecimal>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #142 <Method void BigDecimal(int, MathContext)>
	//    5    9:areturn         
	}

	private static final BigDecimal toBigDecimal(long l)
	{
		BigDecimal bigdecimal = BigDecimal.valueOf(l);
	//    0    0:lload_0         
	//    1    1:invokestatic    #136 <Method BigDecimal BigDecimal.valueOf(long)>
	//    2    4:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (bigdecimal)), "BigDecimal.valueOf(this)");
	//    3    5:aload_2         
	//    4    6:ldc1            #144 <String "BigDecimal.valueOf(this)">
	//    5    8:invokestatic    #67  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return bigdecimal;
	//    6   11:aload_2         
	//    7   12:areturn         
	}

	private static final BigDecimal toBigDecimal(long l, MathContext mathcontext)
	{
		return new BigDecimal(l, mathcontext);
	//    0    0:new             #56  <Class BigDecimal>
	//    1    3:dup             
	//    2    4:lload_0         
	//    3    5:aload_2         
	//    4    6:invokespecial   #148 <Method void BigDecimal(long, MathContext)>
	//    5    9:areturn         
	}

	private static final BigDecimal unaryMinus(BigDecimal bigdecimal)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (bigdecimal)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		bigdecimal = bigdecimal.negate();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #152 <Method BigDecimal BigDecimal.negate()>
	//    5   10:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (bigdecimal)), "this.negate()");
	//    6   11:aload_0         
	//    7   12:ldc1            #154 <String "this.negate()">
	//    8   14:invokestatic    #67  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return bigdecimal;
	//    9   17:aload_0         
	//   10   18:areturn         
	}
}
