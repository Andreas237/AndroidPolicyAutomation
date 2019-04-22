// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.text;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

public class NoSelectionLinkMovementMethod extends LinkMovementMethod
{

	public NoSelectionLinkMovementMethod()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void LinkMovementMethod()>
	//    2    4:return          
	}

	public boolean onTouchEvent(TextView textview, Spannable spannable, MotionEvent motionevent)
	{
		boolean flag = super.onTouchEvent(textview, spannable, motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #13  <Method boolean LinkMovementMethod.onTouchEvent(TextView, Spannable, MotionEvent)>
	//    5    7:istore          4
		Selection.removeSelection(spannable);
	//    6    9:aload_2         
	//    7   10:invokestatic    #19  <Method void Selection.removeSelection(Spannable)>
		return flag;
	//    8   13:iload           4
	//    9   15:ireturn         
	}
}
