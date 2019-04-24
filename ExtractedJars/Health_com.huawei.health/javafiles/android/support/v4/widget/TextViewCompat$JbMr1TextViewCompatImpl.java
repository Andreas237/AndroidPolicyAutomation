// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//			TextViewCompat, TextViewCompatJbMr1

static class TextViewCompat$JbMr1TextViewCompatImpl extends TextViewCompat.JbTextViewCompatImpl
{

	public Drawable[] getCompoundDrawablesRelative(TextView textview)
	{
		return TextViewCompatJbMr1.getCompoundDrawablesRelative(textview);
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method Drawable[] TextViewCompatJbMr1.getCompoundDrawablesRelative(TextView)>
	//    2    4:areturn         
	}

	public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		TextViewCompatJbMr1.setCompoundDrawablesRelative(textview, drawable, drawable1, drawable2, drawable3);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokestatic    #25  <Method void TextViewCompatJbMr1.setCompoundDrawablesRelative(TextView, Drawable, Drawable, Drawable, Drawable)>
	//    6   10:return          
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
	{
		TextViewCompatJbMr1.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, i, j, k, l);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokestatic    #30  <Method void TextViewCompatJbMr1.setCompoundDrawablesRelativeWithIntrinsicBounds(TextView, int, int, int, int)>
	//    6   10:return          
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		TextViewCompatJbMr1.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, drawable, drawable1, drawable2, drawable3);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokestatic    #32  <Method void TextViewCompatJbMr1.setCompoundDrawablesRelativeWithIntrinsicBounds(TextView, Drawable, Drawable, Drawable, Drawable)>
	//    6   10:return          
	}

	TextViewCompat$JbMr1TextViewCompatImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TextViewCompat$JbTextViewCompatImpl()>
	//    2    4:return          
	}
}
