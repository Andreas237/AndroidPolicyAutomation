// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//			TextViewCompat

static class TextViewCompat$TextViewCompatApi16Impl extends TextViewCompat.TextViewCompatBaseImpl
{

	public int getMaxLines(TextView textview)
	{
		return textview.getMaxLines();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method int TextView.getMaxLines()>
	//    2    4:ireturn         
	}

	public int getMinLines(TextView textview)
	{
		return textview.getMinLines();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method int TextView.getMinLines()>
	//    2    4:ireturn         
	}

	TextViewCompat$TextViewCompatApi16Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatBaseImpl()>
	//    2    4:return          
	}
}
