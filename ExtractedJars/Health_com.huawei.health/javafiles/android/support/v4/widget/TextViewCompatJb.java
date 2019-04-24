// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.widget.TextView;

class TextViewCompatJb
{

	TextViewCompatJb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static int getMaxLines(TextView textview)
	{
		return textview.getMaxLines();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method int TextView.getMaxLines()>
	//    2    4:ireturn         
	}

	static int getMinLines(TextView textview)
	{
		return textview.getMinLines();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method int TextView.getMinLines()>
	//    2    4:ireturn         
	}
}
