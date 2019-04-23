// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.cast.framework.p;
import com.google.android.gms.internal.cast.bi;

public class HelpTextView extends LinearLayout
{

	public HelpTextView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void LinearLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	private static void zza(TextView textview, CharSequence charsequence)
	{
		textview.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #22  <Method void TextView.setText(CharSequence)>
		byte byte0;
		if(TextUtils.isEmpty(charsequence))
	//*   3    5:aload_1         
	//*   4    6:invokestatic    #28  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifeq            18
			byte0 = 8;
	//    6   12:bipush          8
	//    7   14:istore_2        
		else
	//*   8   15:goto            20
			byte0 = 0;
	//    9   18:iconst_0        
	//   10   19:istore_2        
		textview.setVisibility(((int) (byte0)));
	//   11   20:aload_0         
	//   12   21:iload_2         
	//   13   22:invokevirtual   #32  <Method void TextView.setVisibility(int)>
	//   14   25:return          
	}

	public View asView()
	{
		return ((View) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	protected void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void LinearLayout.onFinishInflate()>
		zzkq = (TextView)bi.a(((Object) ((TextView)findViewById(p.cast_featurehighlight_help_text_header_view))));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getstatic       #44  <Field int p.cast_featurehighlight_help_text_header_view>
	//    5    9:invokevirtual   #48  <Method View findViewById(int)>
	//    6   12:checkcast       #18  <Class TextView>
	//    7   15:invokestatic    #54  <Method Object bi.a(Object)>
	//    8   18:checkcast       #18  <Class TextView>
	//    9   21:putfield        #56  <Field TextView zzkq>
		zzkr = (TextView)bi.a(((Object) ((TextView)findViewById(p.cast_featurehighlight_help_text_body_view))));
	//   10   24:aload_0         
	//   11   25:aload_0         
	//   12   26:getstatic       #59  <Field int p.cast_featurehighlight_help_text_body_view>
	//   13   29:invokevirtual   #48  <Method View findViewById(int)>
	//   14   32:checkcast       #18  <Class TextView>
	//   15   35:invokestatic    #54  <Method Object bi.a(Object)>
	//   16   38:checkcast       #18  <Class TextView>
	//   17   41:putfield        #61  <Field TextView zzkr>
	//   18   44:return          
	}

	public void setText(CharSequence charsequence, CharSequence charsequence1)
	{
		zza(zzkq, charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field TextView zzkq>
	//    2    4:aload_1         
	//    3    5:invokestatic    #64  <Method void zza(TextView, CharSequence)>
		zza(zzkr, charsequence1);
	//    4    8:aload_0         
	//    5    9:getfield        #61  <Field TextView zzkr>
	//    6   12:aload_2         
	//    7   13:invokestatic    #64  <Method void zza(TextView, CharSequence)>
	//    8   16:return          
	}

	private TextView zzkq;
	private TextView zzkr;
}
