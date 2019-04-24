// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;

// Referenced classes of package com.gigya.socialize.android:
//			GSPluginFragment

class GSPluginFragment$4
	implements android.view.GlobalLayoutListener
{

	public void onGlobalLayout()
	{
		if(getView() != null && getView().getWidth() > 0 && !GSPluginFragment.access$1100(GSPluginFragment.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field GSPluginFragment this$0>
	//*   2    4:invokevirtual   #26  <Method View GSPluginFragment.getView()>
	//*   3    7:ifnull          82
	//*   4   10:aload_0         
	//*   5   11:getfield        #17  <Field GSPluginFragment this$0>
	//*   6   14:invokevirtual   #26  <Method View GSPluginFragment.getView()>
	//*   7   17:invokevirtual   #32  <Method int View.getWidth()>
	//*   8   20:ifle            82
	//*   9   23:aload_0         
	//*  10   24:getfield        #17  <Field GSPluginFragment this$0>
	//*  11   27:invokestatic    #36  <Method boolean GSPluginFragment.access$1100(GSPluginFragment)>
	//*  12   30:ifne            82
		{
			String s = GSPluginFragment.access$1200(GSPluginFragment.this);
	//   13   33:aload_0         
	//   14   34:getfield        #17  <Field GSPluginFragment this$0>
	//   15   37:invokestatic    #40  <Method String GSPluginFragment.access$1200(GSPluginFragment)>
	//   16   40:astore_1        
			GSPluginFragment.access$1300(GSPluginFragment.this).loadDataWithBaseURL("http://www.gigya.com", s, "text/html", "utf-8", ((String) (null)));
	//   17   41:aload_0         
	//   18   42:getfield        #17  <Field GSPluginFragment this$0>
	//   19   45:invokestatic    #44  <Method WebView GSPluginFragment.access$1300(GSPluginFragment)>
	//   20   48:ldc1            #46  <String "http://www.gigya.com">
	//   21   50:aload_1         
	//   22   51:ldc1            #48  <String "text/html">
	//   23   53:ldc1            #50  <String "utf-8">
	//   24   55:aconst_null     
	//   25   56:invokevirtual   #56  <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
			GSPluginFragment.access$1102(GSPluginFragment.this, true);
	//   26   59:aload_0         
	//   27   60:getfield        #17  <Field GSPluginFragment this$0>
	//   28   63:iconst_1        
	//   29   64:invokestatic    #60  <Method boolean GSPluginFragment.access$1102(GSPluginFragment, boolean)>
	//   30   67:pop             
			getView().getViewTreeObserver().removeGlobalOnLayoutListener(((android.view.GlobalLayoutListener) (this)));
	//   31   68:aload_0         
	//   32   69:getfield        #17  <Field GSPluginFragment this$0>
	//   33   72:invokevirtual   #26  <Method View GSPluginFragment.getView()>
	//   34   75:invokevirtual   #64  <Method ViewTreeObserver View.getViewTreeObserver()>
	//   35   78:aload_0         
	//   36   79:invokevirtual   #70  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		}
	//   37   82:return          
	}

	final GSPluginFragment this$0;

	GSPluginFragment$4()
	{
		this$0 = GSPluginFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GSPluginFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
