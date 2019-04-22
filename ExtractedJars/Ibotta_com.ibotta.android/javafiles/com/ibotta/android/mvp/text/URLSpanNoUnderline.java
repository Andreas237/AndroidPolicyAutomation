// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.text;

import android.os.Parcel;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

public class URLSpanNoUnderline extends URLSpan
{
	public static interface SpanClickListener
	{

		public abstract void onSpanClicked(String s);
	}


	public URLSpanNoUnderline(Parcel parcel, SpanClickListener spanclicklistener)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void URLSpan(Parcel)>
		spanClickListener = spanclicklistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field URLSpanNoUnderline$SpanClickListener spanClickListener>
	//    6   10:return          
	}

	public URLSpanNoUnderline(String s, SpanClickListener spanclicklistener)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void URLSpan(String)>
		spanClickListener = spanclicklistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field URLSpanNoUnderline$SpanClickListener spanClickListener>
	//    6   10:return          
	}

	public void onClick(View view)
	{
		spanClickListener.onSpanClicked(getURL());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field URLSpanNoUnderline$SpanClickListener spanClickListener>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #30  <Method String getURL()>
	//    4    8:invokeinterface #33  <Method void URLSpanNoUnderline$SpanClickListener.onSpanClicked(String)>
	//    5   13:return          
	}

	public void updateDrawState(TextPaint textpaint)
	{
		super.updateDrawState(textpaint);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #37  <Method void URLSpan.updateDrawState(TextPaint)>
		textpaint.setUnderlineText(false);
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #43  <Method void TextPaint.setUnderlineText(boolean)>
	//    6   10:return          
	}

	private final SpanClickListener spanClickListener;
}
