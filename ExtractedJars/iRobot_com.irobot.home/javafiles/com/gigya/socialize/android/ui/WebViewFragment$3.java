// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.ui;

import android.view.Display;
import android.webkit.WebView;

// Referenced classes of package com.gigya.socialize.android.ui:
//			WebViewFragment

class WebViewFragment$3
	implements android.view.nPreDrawListener
{

	public boolean onPreDraw()
	{
		if(WebViewFragment.access$400(WebViewFragment.this).getMeasuredHeight() < 10)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field WebViewFragment this$0>
	//*   2    4:invokestatic    #27  <Method WebView WebViewFragment.access$400(WebViewFragment)>
	//*   3    7:invokevirtual   #33  <Method int WebView.getMeasuredHeight()>
	//*   4   10:bipush          10
	//*   5   12:icmpge          79
		{
			Display display = WebViewFragment.access$500(WebViewFragment.this);
	//    6   15:aload_0         
	//    7   16:getfield        #17  <Field WebViewFragment this$0>
	//    8   19:invokestatic    #37  <Method Display WebViewFragment.access$500(WebViewFragment)>
	//    9   22:astore_3        
			if(display != null)
	//*  10   23:aload_3         
	//*  11   24:ifnull          79
			{
				int i = (Math.min(display.getWidth(), display.getHeight()) * 9) / 10;
	//   12   27:aload_3         
	//   13   28:invokevirtual   #42  <Method int Display.getWidth()>
	//   14   31:aload_3         
	//   15   32:invokevirtual   #45  <Method int Display.getHeight()>
	//   16   35:invokestatic    #51  <Method int Math.min(int, int)>
	//   17   38:bipush          9
	//   18   40:imul            
	//   19   41:bipush          10
	//   20   43:idiv            
	//   21   44:istore_1        
				int j = WebViewFragment.access$400(WebViewFragment.this).getContentHeight();
	//   22   45:aload_0         
	//   23   46:getfield        #17  <Field WebViewFragment this$0>
	//   24   49:invokestatic    #27  <Method WebView WebViewFragment.access$400(WebViewFragment)>
	//   25   52:invokevirtual   #54  <Method int WebView.getContentHeight()>
	//   26   55:istore_2        
				if(j > 0)
	//*  27   56:iload_2         
	//*  28   57:ifle            79
					WebViewFragment.access$400(WebViewFragment.this).setLayoutParams(((android.view.rams) (new android.widget.Params(i, j))));
	//   29   60:aload_0         
	//   30   61:getfield        #17  <Field WebViewFragment this$0>
	//   31   64:invokestatic    #27  <Method WebView WebViewFragment.access$400(WebViewFragment)>
	//   32   67:new             #56  <Class android.widget.FrameLayout$LayoutParams>
	//   33   70:dup             
	//   34   71:iload_1         
	//   35   72:iload_2         
	//   36   73:invokespecial   #59  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   37   76:invokevirtual   #63  <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			}
		}
		return true;
	//   38   79:iconst_1        
	//   39   80:ireturn         
	}

	final WebViewFragment this$0;

	WebViewFragment$3()
	{
		this$0 = WebViewFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field WebViewFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
