// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

class TextViewCompatJbMr2
{

	TextViewCompatJbMr2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Drawable[] getCompoundDrawablesRelative(TextView textview)
	{
		return textview.getCompoundDrawablesRelative();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Drawable[] TextView.getCompoundDrawablesRelative()>
	//    2    4:areturn         
	}

	public static void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		textview.setCompoundDrawablesRelative(drawable, drawable1, drawable2, drawable3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #27  <Method void TextView.setCompoundDrawablesRelative(Drawable, Drawable, Drawable, Drawable)>
	//    6    9:return          
	}

	public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
	{
		textview.setCompoundDrawablesRelativeWithIntrinsicBounds(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokevirtual   #33  <Method void TextView.setCompoundDrawablesRelativeWithIntrinsicBounds(int, int, int, int)>
	//    6    9:return          
	}

	public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		textview.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #35  <Method void TextView.setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
	//    6    9:return          
	}
}
