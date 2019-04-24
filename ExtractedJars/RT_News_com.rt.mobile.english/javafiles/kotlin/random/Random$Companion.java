// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.random;


// Referenced classes of package kotlin.random:
//			Random

public static final class Random$Companion extends Random
{

	public int nextBits(int i)
	{
		return Random.Default.nextBits(i);
	//    0    0:getstatic       #43  <Field Random$Default Random.Default>
	//    1    3:iload_1         
	//    2    4:invokevirtual   #47  <Method int Random$Default.nextBits(int)>
	//    3    7:ireturn         
	}

	public static final Random$Companion INSTANCE = new Random$Companion();

	static 
	{
	//    0    0:new             #2   <Class Random$Companion>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void Random$Companion()>
	//    3    7:putstatic       #36  <Field Random$Companion INSTANCE>
	//*   4   10:return          
	}

	private Random$Companion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Random()>
	//    2    4:return          
	}
}
