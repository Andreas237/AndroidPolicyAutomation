// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.browser.browseractions;

import android.support.v4.widget.TextViewCompat;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package androidx.browser.browseractions:
//			BrowserActionsFallbackMenuUi

class BrowserActionsFallbackMenuUi$2
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		if(TextViewCompat.getMaxLines(val$urlTextView) == 0x7fffffff)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field TextView val$urlTextView>
	//*   2    4:invokestatic    #33  <Method int TextViewCompat.getMaxLines(TextView)>
	//*   3    7:ldc1            #34  <Int 0x7fffffff>
	//*   4    9:icmpne          31
		{
			val$urlTextView.setMaxLines(1);
	//    5   12:aload_0         
	//    6   13:getfield        #21  <Field TextView val$urlTextView>
	//    7   16:iconst_1        
	//    8   17:invokevirtual   #40  <Method void TextView.setMaxLines(int)>
			val$urlTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//    9   20:aload_0         
	//   10   21:getfield        #21  <Field TextView val$urlTextView>
	//   11   24:getstatic       #46  <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//   12   27:invokevirtual   #50  <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
			return;
	//   13   30:return          
		} else
		{
			val$urlTextView.setMaxLines(0x7fffffff);
	//   14   31:aload_0         
	//   15   32:getfield        #21  <Field TextView val$urlTextView>
	//   16   35:ldc1            #34  <Int 0x7fffffff>
	//   17   37:invokevirtual   #40  <Method void TextView.setMaxLines(int)>
			val$urlTextView.setEllipsize(((android.text.TextUtils.TruncateAt) (null)));
	//   18   40:aload_0         
	//   19   41:getfield        #21  <Field TextView val$urlTextView>
	//   20   44:aconst_null     
	//   21   45:invokevirtual   #50  <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
			return;
	//   22   48:return          
		}
	}

	final BrowserActionsFallbackMenuUi this$0;
	final TextView val$urlTextView;

	BrowserActionsFallbackMenuUi$2()
	{
		this$0 = final_browseractionsfallbackmenuui;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BrowserActionsFallbackMenuUi this$0>
		val$urlTextView = TextView.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field TextView val$urlTextView>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
