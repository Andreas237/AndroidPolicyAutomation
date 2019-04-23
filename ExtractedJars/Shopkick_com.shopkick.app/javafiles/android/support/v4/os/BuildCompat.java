// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;


public class BuildCompat
{

	private BuildCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean isAtLeastN()
	{
		return android.os.Build.VERSION.SDK_INT >= 24;
	//    0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          24
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastNMR1()
	{
		return android.os.Build.VERSION.SDK_INT >= 25;
	//    0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          25
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastO()
	{
		return android.os.Build.VERSION.SDK_INT >= 26;
	//    0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          26
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastOMR1()
	{
		return android.os.Build.VERSION.SDK_INT >= 27;
	//    0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          27
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastP()
	{
		return android.os.Build.VERSION.SDK_INT >= 28;
	//    0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          28
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastQ()
	{
		return android.os.Build.VERSION.CODENAME.length() == 1 && android.os.Build.VERSION.CODENAME.charAt(0) >= 'Q' && android.os.Build.VERSION.CODENAME.charAt(0) <= 'Z';
	//    0    0:getstatic       #28  <Field String android.os.Build$VERSION.CODENAME>
	//    1    3:invokevirtual   #34  <Method int String.length()>
	//    2    6:iconst_1        
	//    3    7:icmpne          36
	//    4   10:getstatic       #28  <Field String android.os.Build$VERSION.CODENAME>
	//    5   13:iconst_0        
	//    6   14:invokevirtual   #38  <Method char String.charAt(int)>
	//    7   17:bipush          81
	//    8   19:icmplt          36
	//    9   22:getstatic       #28  <Field String android.os.Build$VERSION.CODENAME>
	//   10   25:iconst_0        
	//   11   26:invokevirtual   #38  <Method char String.charAt(int)>
	//   12   29:bipush          90
	//   13   31:icmpgt          36
	//   14   34:iconst_1        
	//   15   35:ireturn         
	//   16   36:iconst_0        
	//   17   37:ireturn         
	}
}
