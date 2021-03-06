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
		return android.os.Build.VERSION.CODENAME.startsWith("OMR") || isAtLeastP();
	//    0    0:getstatic       #26  <Field String android.os.Build$VERSION.CODENAME>
	//    1    3:ldc1            #28  <String "OMR">
	//    2    5:invokevirtual   #34  <Method boolean String.startsWith(String)>
	//    3    8:ifne            17
	//    4   11:invokestatic    #37  <Method boolean isAtLeastP()>
	//    5   14:ifeq            19
	//    6   17:iconst_1        
	//    7   18:ireturn         
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public static boolean isAtLeastP()
	{
		return android.os.Build.VERSION.CODENAME.equals("P");
	//    0    0:getstatic       #26  <Field String android.os.Build$VERSION.CODENAME>
	//    1    3:ldc1            #39  <String "P">
	//    2    5:invokevirtual   #43  <Method boolean String.equals(Object)>
	//    3    8:ireturn         
	}
}
