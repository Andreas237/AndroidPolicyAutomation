// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.random;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.random:
//			Random

public static final class Random$Default extends Random
{

	public static void Companion$annotations()
	{
	//    0    0:return          
	}

	public int nextBits(int i)
	{
		return Random.access$getDefaultRandom$cp().nextBits(i);
	//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
	//    1    3:iload_1         
	//    2    4:invokevirtual   #59  <Method int Random.nextBits(int)>
	//    3    7:ireturn         
	}

	public boolean nextBoolean()
	{
		return Random.access$getDefaultRandom$cp().nextBoolean();
	//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
	//    1    3:invokevirtual   #62  <Method boolean Random.nextBoolean()>
	//    2    6:ireturn         
	}

	public byte[] nextBytes(int i)
	{
		return Random.access$getDefaultRandom$cp().nextBytes(i);
	//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
	//    1    3:iload_1         
	//    2    4:invokevirtual   #66  <Method byte[] Random.nextBytes(int)>
	//    3    7:areturn         
	}

	public byte[] nextBytes(byte abyte0[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (abyte0)), "array");
	//    0    0:aload_1         
	//    1    1:ldc1            #69  <String "array">
	//    2    3:invokestatic    #75  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Random.access$getDefaultRandom$cp().nextBytes(abyte0);
	//    3    6:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #77  <Method byte[] Random.nextBytes(byte[])>
	//    6   13:areturn         
	}

	public byte[] nextBytes(byte abyte0[], int i, int j)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (abyte0)), "array");
	//    0    0:aload_1         
	//    1    1:ldc1            #69  <String "array">
	//    2    3:invokestatic    #75  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Random.access$getDefaultRandom$cp().nextBytes(abyte0, i, j);
	//    3    6:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:invokevirtual   #81  <Method byte[] Random.nextBytes(byte[], int, int)>
	//    8   15:areturn         
	}

	public double nextDouble()
	{
		return Random.access$getDefaultRandom$cp().nextDouble();
	//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
	//    1    3:invokevirtual   #84  <Method double Random.nextDouble()>
	//    2    6:dreturn         
	}

	public double nextDouble(double d)
	{
		return Random.access$getDefaultRandom$cp().nextDouble(d);
	//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
	//    1    3:dload_1         
	//    2    4:invokevirtual   #87  <Method double Random.nextDouble(double)>
	//    3    7:dreturn         
	}

	public double nextDouble(double d, double d1)
	{
		return Random.access$getDefaultRandom$cp().nextDouble(d, d1);
	//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
	//    1    3:dload_1         
	//    2    4:dload_3         
	//    3    5:invokevirtual   #90  <Method double Random.nextDouble(double, double)>
	//    4    8:dreturn         
	}

	public float nextFloat()
	{
		return Random.access$getDefaultRandom$cp().nextFloat();
	//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
	//    1    3:invokevirtual   #93  <Method float Random.nextFloat()>
	//    2    6:freturn         
	}

	public int nextInt()
	{
		return Random.access$getDefaultRandom$cp().nextInt();
	//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
	//    1    3:invokevirtual   #96  <Method int Random.nextInt()>
	//    2    6:ireturn         
	}

	public int nextInt(int i)
	{
		return Random.access$getDefaultRandom$cp().nextInt(i);
	//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
	//    1    3:iload_1         
	//    2    4:invokevirtual   #98  <Method int Random.nextInt(int)>
	//    3    7:ireturn         
	}

	public int nextInt(int i, int j)
	{
		return Random.access$getDefaultRandom$cp().nextInt(i, j);
	//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
	//    1    3:iload_1         
	//    2    4:iload_2         
	//    3    5:invokevirtual   #101 <Method int Random.nextInt(int, int)>
	//    4    8:ireturn         
	}

	public long nextLong()
	{
		return Random.access$getDefaultRandom$cp().nextLong();
	//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
	//    1    3:invokevirtual   #104 <Method long Random.nextLong()>
	//    2    6:lreturn         
	}

	public long nextLong(long l)
	{
		return Random.access$getDefaultRandom$cp().nextLong(l);
	//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
	//    1    3:lload_1         
	//    2    4:invokevirtual   #107 <Method long Random.nextLong(long)>
	//    3    7:lreturn         
	}

	public long nextLong(long l, long l1)
	{
		return Random.access$getDefaultRandom$cp().nextLong(l, l1);
	//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
	//    1    3:lload_1         
	//    2    4:lload_3         
	//    3    5:invokevirtual   #110 <Method long Random.nextLong(long, long)>
	//    4    8:lreturn         
	}

	private Random$Default()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Random()>
	//    2    4:return          
	}

	public Random$Default(DefaultConstructorMarker defaultconstructormarker)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Random$Default()>
	//    2    4:return          
	}
}
