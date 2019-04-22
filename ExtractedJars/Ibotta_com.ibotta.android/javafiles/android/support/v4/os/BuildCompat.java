// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;


public class BuildCompat
{

	public static boolean isAtLeastP()
	{
		return android.os.Build.VERSION.SDK_INT >= 28;
	//    0    0:getstatic       #13  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          28
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}
}
