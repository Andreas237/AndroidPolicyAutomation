// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.widget.TextView;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseTextView

class MadvertiseTextView$1
	implements android.view.obalLayoutListener
{

	public void onGlobalLayout()
	{
		MadvertiseTextView.access$002(MadvertiseTextView.this, val$adTextView.getWidth());
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MadvertiseTextView this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field TextView val$adTextView>
	//    4    8:invokevirtual   #41  <Method int TextView.getWidth()>
	//    5   11:invokestatic    #45  <Method int MadvertiseTextView.access$002(MadvertiseTextView, int)>
	//    6   14:pop             
		android.widget.Params params = new android.widget.Params(-2, -2);
	//    7   15:new             #47  <Class android.widget.RelativeLayout$LayoutParams>
	//    8   18:dup             
	//    9   19:bipush          -2
	//   10   21:bipush          -2
	//   11   23:invokespecial   #50  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   12   26:astore_1        
		params.topMargin = val$bannerHeight / 2 - MadvertiseTextView.access$100(MadvertiseTextView.this) * val$textSize;
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #26  <Field int val$bannerHeight>
	//   16   32:iconst_2        
	//   17   33:idiv            
	//   18   34:aload_0         
	//   19   35:getfield        #22  <Field MadvertiseTextView this$0>
	//   20   38:invokestatic    #54  <Method int MadvertiseTextView.access$100(MadvertiseTextView)>
	//   21   41:aload_0         
	//   22   42:getfield        #28  <Field int val$textSize>
	//   23   45:imul            
	//   24   46:isub            
	//   25   47:putfield        #57  <Field int android.widget.RelativeLayout$LayoutParams.topMargin>
		params.leftMargin = val$bannerWidth / 2 - MadvertiseTextView.access$000(MadvertiseTextView.this) / 2;
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #30  <Field int val$bannerWidth>
	//   29   55:iconst_2        
	//   30   56:idiv            
	//   31   57:aload_0         
	//   32   58:getfield        #22  <Field MadvertiseTextView this$0>
	//   33   61:invokestatic    #60  <Method int MadvertiseTextView.access$000(MadvertiseTextView)>
	//   34   64:iconst_2        
	//   35   65:idiv            
	//   36   66:isub            
	//   37   67:putfield        #63  <Field int android.widget.RelativeLayout$LayoutParams.leftMargin>
		val$adTextView.setLayoutParams(((android.view.s) (params)));
	//   38   70:aload_0         
	//   39   71:getfield        #24  <Field TextView val$adTextView>
	//   40   74:aload_1         
	//   41   75:invokevirtual   #67  <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   42   78:return          
	}

	final MadvertiseTextView this$0;
	final TextView val$adTextView;
	final int val$bannerHeight;
	final int val$bannerWidth;
	final int val$textSize;

	MadvertiseTextView$1()
	{
		this$0 = final_madvertisetextview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field MadvertiseTextView this$0>
		val$adTextView = textview;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field TextView val$adTextView>
		val$bannerHeight = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #26  <Field int val$bannerHeight>
		val$textSize = j;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #28  <Field int val$textSize>
		val$bannerWidth = I.this;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #30  <Field int val$bannerWidth>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #33  <Method void Object()>
	//   17   31:return          
	}
}
