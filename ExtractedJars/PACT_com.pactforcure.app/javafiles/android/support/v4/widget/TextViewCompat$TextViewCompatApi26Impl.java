// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//			TextViewCompat

static class TextViewCompat$TextViewCompatApi26Impl extends TextViewCompat$TextViewCompatApi23Impl
{

	public int getAutoSizeMaxTextSize(TextView textview)
	{
		return textview.getAutoSizeMaxTextSize();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method int TextView.getAutoSizeMaxTextSize()>
	//    2    4:ireturn         
	}

	public int getAutoSizeMinTextSize(TextView textview)
	{
		return textview.getAutoSizeMinTextSize();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method int TextView.getAutoSizeMinTextSize()>
	//    2    4:ireturn         
	}

	public int getAutoSizeStepGranularity(TextView textview)
	{
		return textview.getAutoSizeStepGranularity();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method int TextView.getAutoSizeStepGranularity()>
	//    2    4:ireturn         
	}

	public int[] getAutoSizeTextAvailableSizes(TextView textview)
	{
		return textview.getAutoSizeTextAvailableSizes();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method int[] TextView.getAutoSizeTextAvailableSizes()>
	//    2    4:areturn         
	}

	public int getAutoSizeTextType(TextView textview)
	{
		return textview.getAutoSizeTextType();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #36  <Method int TextView.getAutoSizeTextType()>
	//    2    4:ireturn         
	}

	public void setAutoSizeTextTypeUniformWithConfiguration(TextView textview, int i, int j, int k, int l)
		throws IllegalArgumentException
	{
		textview.setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #43  <Method void TextView.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
	//    6   10:return          
	}

	public void setAutoSizeTextTypeUniformWithPresetSizes(TextView textview, int ai[], int i)
		throws IllegalArgumentException
	{
		textview.setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #50  <Method void TextView.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
	//    4    6:return          
	}

	public void setAutoSizeTextTypeWithDefaults(TextView textview, int i)
	{
		textview.setAutoSizeTextTypeWithDefaults(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #56  <Method void TextView.setAutoSizeTextTypeWithDefaults(int)>
	//    3    5:return          
	}

	TextViewCompat$TextViewCompatApi26Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatApi23Impl()>
	//    2    4:return          
	}
}
