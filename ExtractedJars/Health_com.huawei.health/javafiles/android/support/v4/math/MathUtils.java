// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.math;


public class MathUtils
{

	public MathUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static double clamp(double d, double d1, double d2)
	{
		if(d < d1)
	//*   0    0:dload_0         
	//*   1    1:dload_2         
	//*   2    2:dcmpg           
	//*   3    3:ifge            8
			return d1;
	//    4    6:dload_2         
	//    5    7:dreturn         
		if(d > d2)
	//*   6    8:dload_0         
	//*   7    9:dload           4
	//*   8   11:dcmpl           
	//*   9   12:ifle            18
			return d2;
	//   10   15:dload           4
	//   11   17:dreturn         
		else
			return d;
	//   12   18:dload_0         
	//   13   19:dreturn         
	}

	public static float clamp(float f, int i, int j)
	{
		if(f < (float)i)
	//*   0    0:fload_0         
	//*   1    1:iload_1         
	//*   2    2:i2f             
	//*   3    3:fcmpg           
	//*   4    4:ifge            10
			return (float)i;
	//    5    7:iload_1         
	//    6    8:i2f             
	//    7    9:freturn         
		if(f > (float)j)
	//*   8   10:fload_0         
	//*   9   11:iload_2         
	//*  10   12:i2f             
	//*  11   13:fcmpl           
	//*  12   14:ifle            20
			return (float)j;
	//   13   17:iload_2         
	//   14   18:i2f             
	//   15   19:freturn         
		else
			return f;
	//   16   20:fload_0         
	//   17   21:freturn         
	}

	public static int clamp(int i, int j, int k)
	{
		if(i < j)
	//*   0    0:iload_0         
	//*   1    1:iload_1         
	//*   2    2:icmpge          7
			return j;
	//    3    5:iload_1         
	//    4    6:ireturn         
		if(i > k)
	//*   5    7:iload_0         
	//*   6    8:iload_2         
	//*   7    9:icmple          14
			return k;
	//    8   12:iload_2         
	//    9   13:ireturn         
		else
			return i;
	//   10   14:iload_0         
	//   11   15:ireturn         
	}
}
