// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.resources;


public class TextAppearanceConfig
{

	public TextAppearanceConfig()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static void setShouldLoadFontSynchronously(boolean flag)
	{
		shouldLoadFontSynchronously = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #15  <Field boolean shouldLoadFontSynchronously>
	//    2    4:return          
	}

	public static boolean shouldLoadFontSynchronously()
	{
		return shouldLoadFontSynchronously;
	//    0    0:getstatic       #15  <Field boolean shouldLoadFontSynchronously>
	//    1    3:ireturn         
	}

	private static boolean shouldLoadFontSynchronously;
}
