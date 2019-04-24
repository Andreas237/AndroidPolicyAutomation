// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//			TextViewCompat, TextViewCompatJb

static class TextViewCompat$JbTextViewCompatImpl extends l
{

	public int getMaxLines(TextView textview)
	{
		return TextViewCompatJb.getMaxLines(textview);
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method int TextViewCompatJb.getMaxLines(TextView)>
	//    2    4:ireturn         
	}

	public int getMinLines(TextView textview)
	{
		return TextViewCompatJb.getMinLines(textview);
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method int TextViewCompatJb.getMinLines(TextView)>
	//    2    4:ireturn         
	}

	TextViewCompat$JbTextViewCompatImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TextViewCompat$BaseTextViewCompatImpl()>
	//    2    4:return          
	}
}
