// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package afu.org.checkerframework.checker.units;


public class UnitsTools
{

	public UnitsTools()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	public static int fromCelsiusToKelvin(int i)
	{
		return i + 273;
	//    0    0:iload_0         
	//    1    1:sipush          273
	//    2    4:iadd            
	//    3    5:ireturn         
	}

	public static int fromGramToKiloGram(int i)
	{
		return i / 1000;
	//    0    0:iload_0         
	//    1    1:sipush          1000
	//    2    4:idiv            
	//    3    5:ireturn         
	}

	public static int fromHourToMinute(int i)
	{
		return i * 60;
	//    0    0:iload_0         
	//    1    1:bipush          60
	//    2    3:imul            
	//    3    4:ireturn         
	}

	public static int fromKelvinToCelsius(int i)
	{
		return i - 273;
	//    0    0:iload_0         
	//    1    1:sipush          273
	//    2    4:isub            
	//    3    5:ireturn         
	}

	public static int fromKiloGramToGram(int i)
	{
		return i * 1000;
	//    0    0:iload_0         
	//    1    1:sipush          1000
	//    2    4:imul            
	//    3    5:ireturn         
	}

	public static double fromKiloMeterPerHourToMeterPerSecond(double d)
	{
		return d / 3.6000000000000001D;
	//    0    0:dload_0         
	//    1    1:ldc2w           #44  <Double 3.6000000000000001D>
	//    2    4:ddiv            
	//    3    5:dreturn         
	}

	public static int fromKiloMeterToMeter(int i)
	{
		return i * 1000;
	//    0    0:iload_0         
	//    1    1:sipush          1000
	//    2    4:imul            
	//    3    5:ireturn         
	}

	public static double fromMeterPerSecondToKiloMeterPerHour(double d)
	{
		return d * 3.6000000000000001D;
	//    0    0:dload_0         
	//    1    1:ldc2w           #44  <Double 3.6000000000000001D>
	//    2    4:dmul            
	//    3    5:dreturn         
	}

	public static int fromMeterToKiloMeter(int i)
	{
		return i / 1000;
	//    0    0:iload_0         
	//    1    1:sipush          1000
	//    2    4:idiv            
	//    3    5:ireturn         
	}

	public static int fromMeterToMilliMeter(int i)
	{
		return i * 1000;
	//    0    0:iload_0         
	//    1    1:sipush          1000
	//    2    4:imul            
	//    3    5:ireturn         
	}

	public static int fromMilliMeterToMeter(int i)
	{
		return i / 1000;
	//    0    0:iload_0         
	//    1    1:sipush          1000
	//    2    4:idiv            
	//    3    5:ireturn         
	}

	public static int fromMinuteToHour(int i)
	{
		return i / 60;
	//    0    0:iload_0         
	//    1    1:bipush          60
	//    2    3:idiv            
	//    3    4:ireturn         
	}

	public static int fromMinuteToSecond(int i)
	{
		return i * 60;
	//    0    0:iload_0         
	//    1    1:bipush          60
	//    2    3:imul            
	//    3    4:ireturn         
	}

	public static int fromSecondToMinute(int i)
	{
		return i / 60;
	//    0    0:iload_0         
	//    1    1:bipush          60
	//    2    3:idiv            
	//    3    4:ireturn         
	}

	public static double toDegrees(double d)
	{
		return Math.toDegrees(d);
	//    0    0:dload_0         
	//    1    1:invokestatic    #58  <Method double Math.toDegrees(double)>
	//    2    4:dreturn         
	}

	public static double toRadians(double d)
	{
		return Math.toRadians(d);
	//    0    0:dload_0         
	//    1    1:invokestatic    #61  <Method double Math.toRadians(double)>
	//    2    4:dreturn         
	}

	public static final int A = 1;
	public static final int C = 1;
	public static final int K = 1;
	public static final int cd = 1;
	public static final double deg = 1D;
	public static final int g = 1;
	public static final int h = 1;
	public static final int kg = 1;
	public static final int km = 1;
	public static final int km2 = 1;
	public static final int kmPERh = 1;
	public static final int m = 1;
	public static final int m2 = 1;
	public static final int mPERs = 1;
	public static final int mPERs2 = 1;
	public static final int min = 1;
	public static final int mm = 1;
	public static final int mm2 = 1;
	public static final int mol = 1;
	public static final double rad = 1D;
	public static final int s = 1;
}
