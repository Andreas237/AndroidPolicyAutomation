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
}
