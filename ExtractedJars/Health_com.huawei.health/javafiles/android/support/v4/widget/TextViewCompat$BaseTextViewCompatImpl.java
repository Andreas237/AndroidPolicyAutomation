// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//			TextViewCompat, TextViewCompatGingerbread

static class TextViewCompat$BaseTextViewCompatImpl
	implements TextViewCompat.TextViewCompatImpl
{

	public Drawable[] getCompoundDrawablesRelative(TextView textview)
	{
		return TextViewCompatGingerbread.getCompoundDrawablesRelative(textview);
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method Drawable[] TextViewCompatGingerbread.getCompoundDrawablesRelative(TextView)>
	//    2    4:areturn         
	}

	public int getMaxLines(TextView textview)
	{
		return TextViewCompatGingerbread.getMaxLines(textview);
	//    0    0:aload_1         
	//    1    1:invokestatic    #26  <Method int TextViewCompatGingerbread.getMaxLines(TextView)>
	//    2    4:ireturn         
	}

	public int getMinLines(TextView textview)
	{
		return TextViewCompatGingerbread.getMinLines(textview);
	//    0    0:aload_1         
	//    1    1:invokestatic    #29  <Method int TextViewCompatGingerbread.getMinLines(TextView)>
	//    2    4:ireturn         
	}

	public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		textview.setCompoundDrawables(drawable, drawable1, drawable2, drawable3);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokevirtual   #38  <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//    6   10:return          
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
	{
		textview.setCompoundDrawablesWithIntrinsicBounds(i, j, k, l);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #45  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
	//    6   10:return          
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		textview.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokevirtual   #47  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
	//    6   10:return          
	}

	public void setTextAppearance(TextView textview, int i)
	{
		TextViewCompatGingerbread.setTextAppearance(textview, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #52  <Method void TextViewCompatGingerbread.setTextAppearance(TextView, int)>
	//    3    5:return          
	}

	TextViewCompat$BaseTextViewCompatImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
