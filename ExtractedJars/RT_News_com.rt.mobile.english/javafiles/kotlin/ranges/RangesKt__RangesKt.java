// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.ranges:
//			RangesKt__RangesJVMKt, ClosedRange, ClosedDoubleRange, ClosedFloatingPointRange, 
//			ComparableRange

class RangesKt__RangesKt extends RangesKt__RangesJVMKt
{

	public RangesKt__RangesKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void RangesKt__RangesJVMKt()>
	//    2    4:return          
	}

	public static final void checkStepIsPositive(boolean flag, Number number)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (number)), "step");
	//    0    0:aload_1         
	//    1    1:ldc1            #42  <String "step">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!flag)
	//*   3    6:iload_0         
	//*   4    7:ifne            53
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   10:new             #50  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #51  <Method void StringBuilder()>
	//    8   17:astore_2        
			stringbuilder.append("Step must be positive, was: ");
	//    9   18:aload_2         
	//   10   19:ldc1            #53  <String "Step must be positive, was: ">
	//   11   21:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
			stringbuilder.append(((Object) (number)));
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   16   30:pop             
			stringbuilder.append('.');
	//   17   31:aload_2         
	//   18   32:bipush          46
	//   19   34:invokevirtual   #63  <Method StringBuilder StringBuilder.append(char)>
	//   20   37:pop             
			throw (Throwable)new IllegalArgumentException(stringbuilder.toString());
	//   21   38:new             #65  <Class IllegalArgumentException>
	//   22   41:dup             
	//   23   42:aload_2         
	//   24   43:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   25   46:invokespecial   #72  <Method void IllegalArgumentException(String)>
	//   26   49:checkcast       #74  <Class Throwable>
	//   27   52:athrow          
		} else
		{
			return;
	//   28   53:return          
		}
	}

	private static final boolean contains(Iterable iterable, Object obj)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (iterable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #81  <String "receiver$0">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return obj != null && ((ClosedRange)iterable).contains((Comparable)obj);
	//    3    6:aload_1         
	//    4    7:ifnull          28
	//    5   10:aload_0         
	//    6   11:checkcast       #83  <Class ClosedRange>
	//    7   14:aload_1         
	//    8   15:checkcast       #85  <Class Comparable>
	//    9   18:invokeinterface #88  <Method boolean ClosedRange.contains(Comparable)>
	//   10   23:ifeq            28
	//   11   26:iconst_1        
	//   12   27:ireturn         
	//   13   28:iconst_0        
	//   14   29:ireturn         
	}

	public static final ClosedFloatingPointRange rangeTo(double d, double d1)
	{
		return (ClosedFloatingPointRange)new ClosedDoubleRange(d, d1);
	//    0    0:new             #95  <Class ClosedDoubleRange>
	//    1    3:dup             
	//    2    4:dload_0         
	//    3    5:dload_2         
	//    4    6:invokespecial   #98  <Method void ClosedDoubleRange(double, double)>
	//    5    9:checkcast       #100 <Class ClosedFloatingPointRange>
	//    6   12:areturn         
	}

	public static final ClosedRange rangeTo(Comparable comparable, Comparable comparable1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (comparable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #81  <String "receiver$0">
	//    2    3:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (comparable1)), "that");
	//    3    6:aload_1         
	//    4    7:ldc1            #102 <String "that">
	//    5    9:invokestatic    #48  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return (ClosedRange)new ComparableRange(comparable, comparable1);
	//    6   12:new             #104 <Class ComparableRange>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #107 <Method void ComparableRange(Comparable, Comparable)>
	//   11   21:checkcast       #83  <Class ClosedRange>
	//   12   24:areturn         
	}
}
