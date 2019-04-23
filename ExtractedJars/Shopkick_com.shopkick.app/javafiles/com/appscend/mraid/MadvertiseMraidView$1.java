// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseMraidView, MadvertiseUtil, MadvertiseActivity

class MadvertiseMraidView$1 extends WebViewClient
{

	public void onPageFinished(WebView webview, String s)
	{
		super.onPageFinished(webview, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void WebViewClient.onPageFinished(WebView, String)>
		if(!s.endsWith("mraid.js") && !mError)
	//*   4    6:aload_2         
	//*   5    7:ldc1            #30  <String "mraid.js">
	//*   6    9:invokevirtual   #36  <Method boolean String.endsWith(String)>
	//*   7   12:ifne            80
	//*   8   15:aload_0         
	//*   9   16:getfield        #23  <Field boolean mError>
	//*  10   19:ifne            80
		{
			MadvertiseUtil.logMessage(((String) (null)), 3, "Setting mraid to default");
	//   11   22:aconst_null     
	//   12   23:iconst_3        
	//   13   24:ldc1            #38  <String "Setting mraid to default">
	//   14   26:invokestatic    #44  <Method void MadvertiseUtil.logMessage(String, int, String)>
			MadvertiseMraidView.access$100(MadvertiseMraidView.this);
	//   15   29:aload_0         
	//   16   30:getfield        #18  <Field MadvertiseMraidView this$0>
	//   17   33:invokestatic    #47  <Method void MadvertiseMraidView.access$100(MadvertiseMraidView)>
			if(MadvertiseMraidView.access$200(MadvertiseMraidView.this) == 1)
	//*  18   36:aload_0         
	//*  19   37:getfield        #18  <Field MadvertiseMraidView this$0>
	//*  20   40:invokestatic    #51  <Method int MadvertiseMraidView.access$200(MadvertiseMraidView)>
	//*  21   43:iconst_1        
	//*  22   44:icmpne          80
			{
				webview = ((WebView) (MadvertiseMraidView.this));
	//   23   47:aload_0         
	//   24   48:getfield        #18  <Field MadvertiseMraidView this$0>
	//   25   51:astore_1        
				MadvertiseMraidView.access$302(((MadvertiseMraidView) (webview)), MadvertiseMraidView.access$400(((MadvertiseMraidView) (webview)), (ViewGroup)((MadvertiseMraidView) (webview)).getParent()));
	//   26   52:aload_1         
	//   27   53:aload_1         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #55  <Method android.view.ViewParent MadvertiseMraidView.getParent()>
	//   30   58:checkcast       #57  <Class ViewGroup>
	//   31   61:invokestatic    #61  <Method ImageButton MadvertiseMraidView.access$400(MadvertiseMraidView, ViewGroup)>
	//   32   64:invokestatic    #65  <Method ImageButton MadvertiseMraidView.access$302(MadvertiseMraidView, ImageButton)>
	//   33   67:pop             
				MadvertiseMraidView.access$300(MadvertiseMraidView.this).setImageResource(0x1080038);
	//   34   68:aload_0         
	//   35   69:getfield        #18  <Field MadvertiseMraidView this$0>
	//   36   72:invokestatic    #69  <Method ImageButton MadvertiseMraidView.access$300(MadvertiseMraidView)>
	//   37   75:ldc1            #70  <Int 0x1080038>
	//   38   77:invokevirtual   #76  <Method void ImageButton.setImageResource(int)>
			}
		}
	//   39   80:return          
	}

	public void onReceivedError(WebView webview, int i, String s, String s1)
	{
		super.onReceivedError(webview, i, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #80  <Method void WebViewClient.onReceivedError(WebView, int, String, String)>
		mError = true;
	//    6    9:aload_0         
	//    7   10:iconst_1        
	//    8   11:putfield        #23  <Field boolean mError>
	//    9   14:return          
	}

	public boolean shouldOverrideUrlLoading(WebView webview, final String url)
	{
		post(new Runnable() {

			public void run()
			{
				if(MadvertiseMraidView.access$000(this$0) != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field MadvertiseMraidView$1 this$1>
			//*   2    4:getfield        #30  <Field MadvertiseMraidView MadvertiseMraidView$1.this$0>
			//*   3    7:invokestatic    #36  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseMraidView.access$000(MadvertiseMraidView)>
			//*   4   10:ifnull          28
					MadvertiseMraidView.access$000(this$0).onAdClicked();
			//    5   13:aload_0         
			//    6   14:getfield        #19  <Field MadvertiseMraidView$1 this$1>
			//    7   17:getfield        #30  <Field MadvertiseMraidView MadvertiseMraidView$1.this$0>
			//    8   20:invokestatic    #36  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseMraidView.access$000(MadvertiseMraidView)>
			//    9   23:invokeinterface #41  <Method void MadvertiseView$MadvertiseViewCallbackListener.onAdClicked()>
				Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url), getContext().getApplicationContext(), com/appscend/mraid/MadvertiseActivity);
			//   10   28:new             #43  <Class Intent>
			//   11   31:dup             
			//   12   32:ldc1            #45  <String "android.intent.action.VIEW">
			//   13   34:aload_0         
			//   14   35:getfield        #21  <Field String val$url>
			//   15   38:invokestatic    #51  <Method Uri Uri.parse(String)>
			//   16   41:aload_0         
			//   17   42:getfield        #19  <Field MadvertiseMraidView$1 this$1>
			//   18   45:getfield        #30  <Field MadvertiseMraidView MadvertiseMraidView$1.this$0>
			//   19   48:invokevirtual   #55  <Method Context MadvertiseMraidView.getContext()>
			//   20   51:invokevirtual   #60  <Method Context Context.getApplicationContext()>
			//   21   54:ldc1            #62  <Class MadvertiseActivity>
			//   22   56:invokespecial   #65  <Method void Intent(String, Uri, Context, Class)>
			//   23   59:astore_1        
				intent.setFlags(0x10000000);
			//   24   60:aload_1         
			//   25   61:ldc1            #66  <Int 0x10000000>
			//   26   63:invokevirtual   #70  <Method Intent Intent.setFlags(int)>
			//   27   66:pop             
				getContext().startActivity(intent);
			//   28   67:aload_0         
			//   29   68:getfield        #19  <Field MadvertiseMraidView$1 this$1>
			//   30   71:getfield        #30  <Field MadvertiseMraidView MadvertiseMraidView$1.this$0>
			//   31   74:invokevirtual   #55  <Method Context MadvertiseMraidView.getContext()>
			//   32   77:aload_1         
			//   33   78:invokevirtual   #74  <Method void Context.startActivity(Intent)>
			//   34   81:return          
			}

			final MadvertiseMraidView._cls1 this$1;
			final String val$url;

			
			{
				this$1 = MadvertiseMraidView._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MadvertiseMraidView$1 this$1>
				url = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$url>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MadvertiseMraidView this$0>
	//    2    4:new             #11  <Class MadvertiseMraidView$1$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokespecial   #85  <Method void MadvertiseMraidView$1$1(MadvertiseMraidView$1, String)>
	//    7   13:invokevirtual   #89  <Method boolean MadvertiseMraidView.post(Runnable)>
	//    8   16:pop             
		return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
	}

	private boolean mError;
	final MadvertiseMraidView this$0;

	MadvertiseMraidView$1()
	{
		this$0 = MadvertiseMraidView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MadvertiseMraidView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void WebViewClient()>
		mError = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #23  <Field boolean mError>
	//    8   14:return          
	}
}
