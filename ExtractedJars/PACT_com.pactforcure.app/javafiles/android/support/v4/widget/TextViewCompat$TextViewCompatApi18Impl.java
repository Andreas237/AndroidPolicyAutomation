// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//			TextViewCompat

static class TextViewCompat$TextViewCompatApi18Impl extends TextViewCompat$TextViewCompatApi17Impl
{

	public Drawable[] getCompoundDrawablesRelative(TextView textview)
	{
		return textview.getCompoundDrawablesRelative();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #23  <Method Drawable[] TextView.getCompoundDrawablesRelative()>
	//    2    4:areturn         
	}

	public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		textview.setCompoundDrawablesRelative(drawable, drawable1, drawable2, drawable3);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokevirtual   #30  <Method void TextView.setCompoundDrawablesRelative(Drawable, Drawable, Drawable, Drawable)>
	//    6   10:return          
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
	{
		textview.setCompoundDrawablesRelativeWithIntrinsicBounds(i, j, k, l);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #36  <Method void TextView.setCompoundDrawablesRelativeWithIntrinsicBounds(int, int, int, int)>
	//    6   10:return          
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		textview.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokevirtual   #38  <Method void TextView.setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
	//    6   10:return          
	}

	TextViewCompat$TextViewCompatApi18Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatApi17Impl()>
	//    2    4:return          
	}
}
