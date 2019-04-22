// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;


public interface AutoSizeableTextView
{

	public abstract int getAutoSizeMaxTextSize();

	public abstract int getAutoSizeMinTextSize();

	public abstract int getAutoSizeStepGranularity();

	public abstract int[] getAutoSizeTextAvailableSizes();

	public abstract int getAutoSizeTextType();

	public abstract void setAutoSizeTextTypeUniformWithConfiguration(int i, int j, int k, int l)
		throws IllegalArgumentException;

	public abstract void setAutoSizeTextTypeUniformWithPresetSizes(int ai[], int i)
		throws IllegalArgumentException;

	public abstract void setAutoSizeTextTypeWithDefaults(int i);

	public static final boolean PLATFORM_SUPPORTS_AUTOSIZE = flag;

	/* static  */
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 27)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          27
	//*   2    5:icmplt          13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_0        
	//    8   15:iload_0         
	//    9   16:putstatic       #20  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*  10   19:return          
	}
}
