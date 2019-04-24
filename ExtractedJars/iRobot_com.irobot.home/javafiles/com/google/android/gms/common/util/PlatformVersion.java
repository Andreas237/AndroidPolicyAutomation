// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;


public final class PlatformVersion
{

	private PlatformVersion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static boolean isAtLeastHoneycomb()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static boolean isAtLeastHoneycombMR1()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static boolean isAtLeastIceCreamSandwich()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static boolean isAtLeastIceCreamSandwichMR1()
	{
		return android.os.Build.VERSION.SDK_INT >= 15;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          15
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastJellyBean()
	{
		return android.os.Build.VERSION.SDK_INT >= 16;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          16
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastJellyBeanMR1()
	{
		return android.os.Build.VERSION.SDK_INT >= 17;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          17
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastJellyBeanMR2()
	{
		return android.os.Build.VERSION.SDK_INT >= 18;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          18
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastKitKat()
	{
		return android.os.Build.VERSION.SDK_INT >= 19;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          19
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastKitKatWatch()
	{
		return android.os.Build.VERSION.SDK_INT >= 20;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          20
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastLollipop()
	{
		return android.os.Build.VERSION.SDK_INT >= 21;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          21
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastLollipopMR1()
	{
		return android.os.Build.VERSION.SDK_INT >= 22;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          22
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastM()
	{
		return android.os.Build.VERSION.SDK_INT >= 23;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          23
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastN()
	{
		return android.os.Build.VERSION.SDK_INT >= 24;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          24
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastO()
	{
		return android.os.Build.VERSION.SDK_INT >= 26;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          26
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastP()
	{
		return android.os.Build.VERSION.SDK_INT >= 28;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          28
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}
}
