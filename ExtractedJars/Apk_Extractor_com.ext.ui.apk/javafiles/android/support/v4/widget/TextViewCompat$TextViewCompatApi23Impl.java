// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//			TextViewCompat

static class TextViewCompat$TextViewCompatApi23Impl extends TextViewCompat$TextViewCompatApi18Impl
{

	public void setTextAppearance(TextView textview, int i)
	{
		textview.setTextAppearance(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #24  <Method void TextView.setTextAppearance(int)>
	//    3    5:return          
	}

	TextViewCompat$TextViewCompatApi23Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatApi18Impl()>
	//    2    4:return          
	}
}
