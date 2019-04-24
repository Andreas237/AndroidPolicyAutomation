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
	//    0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
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
	//    0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          25
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public static boolean isAtLeastO()
	{
		return !"REL".equals(((Object) (android.os.Build.VERSION.CODENAME))) && ("O".equals(((Object) (android.os.Build.VERSION.CODENAME))) || android.os.Build.VERSION.CODENAME.startsWith("OMR"));
	//    0    0:ldc1            #21  <String "REL">
	//    1    2:getstatic       #25  <Field String android.os.Build$VERSION.CODENAME>
	//    2    5:invokevirtual   #31  <Method boolean String.equals(Object)>
	//    3    8:ifne            35
	//    4   11:ldc1            #33  <String "O">
	//    5   13:getstatic       #25  <Field String android.os.Build$VERSION.CODENAME>
	//    6   16:invokevirtual   #31  <Method boolean String.equals(Object)>
	//    7   19:ifne            33
	//    8   22:getstatic       #25  <Field String android.os.Build$VERSION.CODENAME>
	//    9   25:ldc1            #35  <String "OMR">
	//   10   27:invokevirtual   #39  <Method boolean String.startsWith(String)>
	//   11   30:ifeq            35
	//   12   33:iconst_1        
	//   13   34:ireturn         
	//   14   35:iconst_0        
	//   15   36:ireturn         
	}
}
