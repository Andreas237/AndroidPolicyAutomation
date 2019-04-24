// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.ranges;


// Referenced classes of package kotlin.ranges:
//			ClosedFloatRange, ClosedFloatingPointRange

class RangesKt__RangesJVMKt
{

	public RangesKt__RangesJVMKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	public static final ClosedFloatingPointRange rangeTo(float f, float f1)
	{
		return (ClosedFloatingPointRange)new ClosedFloatRange(f, f1);
	//    0    0:new             #36  <Class ClosedFloatRange>
	//    1    3:dup             
	//    2    4:fload_0         
	//    3    5:fload_1         
	//    4    6:invokespecial   #39  <Method void ClosedFloatRange(float, float)>
	//    5    9:checkcast       #41  <Class ClosedFloatingPointRange>
	//    6   12:areturn         
	}
}
