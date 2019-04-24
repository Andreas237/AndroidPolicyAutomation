// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.support.v4.os.BuildCompat;

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

	public static final boolean PLATFORM_SUPPORTS_AUTOSIZE = BuildCompat.isAtLeastOMR1();

	/* static  */
	/* { */
	//    0    0:invokestatic    #18  <Method boolean BuildCompat.isAtLeastOMR1()>
	//    1    3:putstatic       #20  <Field boolean PLATFORM_SUPPORTS_AUTOSIZE>
	//*   2    6:return          
	/* } */
}
