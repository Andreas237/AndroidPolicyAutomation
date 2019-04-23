// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseAd, MadvertiseUtil

class MadvertiseImageView extends WebView
{

	public MadvertiseImageView(Context context, int i, int j, MadvertiseAd madvertisead, final Handler loadingCompletedHandler, MadvertiseView.AnimationEndListener animationendlistener)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void WebView(Context)>
		mAnimationListener = animationendlistener;
	//    3    5:aload_0         
	//    4    6:aload           6
	//    5    8:putfield        #17  <Field MadvertiseView$AnimationEndListener mAnimationListener>
		mImageAd = madvertisead;
	//    6   11:aload_0         
	//    7   12:aload           4
	//    8   14:putfield        #19  <Field MadvertiseAd mImageAd>
		setVerticalScrollBarEnabled(false);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #23  <Method void setVerticalScrollBarEnabled(boolean)>
		setHorizontalScrollBarEnabled(false);
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:invokevirtual   #26  <Method void setHorizontalScrollBarEnabled(boolean)>
		setScrollBarStyle(0x2000000);
	//   15   27:aload_0         
	//   16   28:ldc1            #27  <Int 0x2000000>
	//   17   30:invokevirtual   #31  <Method void setScrollBarStyle(int)>
		setBackgroundColor(0);
	//   18   33:aload_0         
	//   19   34:iconst_0        
	//   20   35:invokevirtual   #34  <Method void setBackgroundColor(int)>
		setWebViewClient(((WebViewClient) (new WebViewClient() {

			public void onPageFinished(WebView webview, String s)
			{
				webview = ((WebView) (loadingCompletedHandler));
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field Handler val$loadingCompletedHandler>
			//    2    4:astore_1        
				if(webview != null)
			//*   3    5:aload_1         
			//*   4    6:ifnull          15
					((Handler) (webview)).sendEmptyMessage(0);
			//    5    9:aload_1         
			//    6   10:iconst_0        
			//    7   11:invokevirtual   #30  <Method boolean Handler.sendEmptyMessage(int)>
			//    8   14:pop             
			//    9   15:return          
			}

			final MadvertiseImageView this$0;
			final Handler val$loadingCompletedHandler;

			
			{
				this$0 = MadvertiseImageView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MadvertiseImageView this$0>
				loadingCompletedHandler = handler;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #18  <Field Handler val$loadingCompletedHandler>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void WebViewClient()>
			//    8   14:return          
			}
		}
)));
	//   21   38:aload_0         
	//   22   39:new             #6   <Class MadvertiseImageView$1>
	//   23   42:dup             
	//   24   43:aload_0         
	//   25   44:aload           5
	//   26   46:invokespecial   #37  <Method void MadvertiseImageView$1(MadvertiseImageView, Handler)>
	//   27   49:invokevirtual   #41  <Method void setWebViewClient(WebViewClient)>
		context = ((Context) (new StringBuilder()));
	//   28   52:new             #43  <Class StringBuilder>
	//   29   55:dup             
	//   30   56:invokespecial   #46  <Method void StringBuilder()>
	//   31   59:astore_1        
		((StringBuilder) (context)).append("<html><head><style>* {margin:0;padding:0;}</style></head><body>");
	//   32   60:aload_1         
	//   33   61:ldc1            #48  <String "<html><head><style>* {margin:0;padding:0;}</style></head><body>">
	//   34   63:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
		madvertisead = ((MadvertiseAd) (new StringBuilder()));
	//   36   67:new             #43  <Class StringBuilder>
	//   37   70:dup             
	//   38   71:invokespecial   #46  <Method void StringBuilder()>
	//   39   74:astore          4
		((StringBuilder) (madvertisead)).append("<img src=\"");
	//   40   76:aload           4
	//   41   78:ldc1            #54  <String "<img src=\"">
	//   42   80:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
		((StringBuilder) (madvertisead)).append(mImageAd.getBannerUrl());
	//   44   84:aload           4
	//   45   86:aload_0         
	//   46   87:getfield        #19  <Field MadvertiseAd mImageAd>
	//   47   90:invokevirtual   #60  <Method String MadvertiseAd.getBannerUrl()>
	//   48   93:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   49   96:pop             
		((StringBuilder) (madvertisead)).append("\" height=\"");
	//   50   97:aload           4
	//   51   99:ldc1            #62  <String "\" height=\"">
	//   52  101:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   53  104:pop             
		((StringBuilder) (madvertisead)).append(j);
	//   54  105:aload           4
	//   55  107:iload_3         
	//   56  108:invokevirtual   #65  <Method StringBuilder StringBuilder.append(int)>
	//   57  111:pop             
		((StringBuilder) (madvertisead)).append("\" width=\"");
	//   58  112:aload           4
	//   59  114:ldc1            #67  <String "\" width=\"">
	//   60  116:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   61  119:pop             
		((StringBuilder) (madvertisead)).append(i);
	//   62  120:aload           4
	//   63  122:iload_2         
	//   64  123:invokevirtual   #65  <Method StringBuilder StringBuilder.append(int)>
	//   65  126:pop             
		((StringBuilder) (madvertisead)).append("\"/>");
	//   66  127:aload           4
	//   67  129:ldc1            #69  <String "\"/>">
	//   68  131:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   69  134:pop             
		((StringBuilder) (madvertisead)).append(getImpressionTrackingTag());
	//   70  135:aload           4
	//   71  137:aload_0         
	//   72  138:invokespecial   #72  <Method String getImpressionTrackingTag()>
	//   73  141:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   74  144:pop             
		((StringBuilder) (context)).append(((StringBuilder) (madvertisead)).toString());
	//   75  145:aload_1         
	//   76  146:aload           4
	//   77  148:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   78  151:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   79  154:pop             
		((StringBuilder) (context)).append("</body></html>");
	//   80  155:aload_1         
	//   81  156:ldc1            #77  <String "</body></html>">
	//   82  158:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   83  161:pop             
		madvertisead = ((MadvertiseAd) (new StringBuilder()));
	//   84  162:new             #43  <Class StringBuilder>
	//   85  165:dup             
	//   86  166:invokespecial   #46  <Method void StringBuilder()>
	//   87  169:astore          4
		((StringBuilder) (madvertisead)).append("Loading ad : ");
	//   88  171:aload           4
	//   89  173:ldc1            #79  <String "Loading ad : ">
	//   90  175:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   91  178:pop             
		((StringBuilder) (madvertisead)).append(((StringBuilder) (context)).toString());
	//   92  179:aload           4
	//   93  181:aload_1         
	//   94  182:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   95  185:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   96  188:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (madvertisead)).toString());
	//   97  189:aconst_null     
	//   98  190:iconst_3        
	//   99  191:aload           4
	//  100  193:invokevirtual   #75  <Method String StringBuilder.toString()>
	//  101  196:invokestatic    #85  <Method void MadvertiseUtil.logMessage(String, int, String)>
		loadDataWithBaseURL(((String) (null)), ((StringBuilder) (context)).toString(), "text/html", "UTF-8", ((String) (null)));
	//  102  199:aload_0         
	//  103  200:aconst_null     
	//  104  201:aload_1         
	//  105  202:invokevirtual   #75  <Method String StringBuilder.toString()>
	//  106  205:ldc1            #87  <String "text/html">
	//  107  207:ldc1            #89  <String "UTF-8">
	//  108  209:aconst_null     
	//  109  210:invokevirtual   #93  <Method void loadDataWithBaseURL(String, String, String, String, String)>
	//  110  213:return          
	}

	private String getImpressionTrackingTag()
	{
		Object obj = ((Object) (mImageAd));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MadvertiseAd mImageAd>
	//    2    4:astore_2        
		if(obj != null && ((MadvertiseAd) (obj)).getImpressionTrackingArray() != null && mImageAd.getImpressionTrackingArray().length() != 0) goto _L2; else goto _L1
	//    3    5:aload_2         
	//    4    6:ifnull          129
	//    5    9:aload_2         
	//    6   10:invokevirtual   #100 <Method JSONArray MadvertiseAd.getImpressionTrackingArray()>
	//    7   13:ifnull          129
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field MadvertiseAd mImageAd>
	//   10   20:invokevirtual   #100 <Method JSONArray MadvertiseAd.getImpressionTrackingArray()>
	//   11   23:invokevirtual   #106 <Method int JSONArray.length()>
	//   12   26:ifne            32
	//*  13   29:goto            129
_L2:
		int i;
		StringBuilder stringbuilder;
		stringbuilder = new StringBuilder("");
	//   14   32:new             #43  <Class StringBuilder>
	//   15   35:dup             
	//   16   36:ldc1            #108 <String "">
	//   17   38:invokespecial   #111 <Method void StringBuilder(String)>
	//   18   41:astore_3        
		i = 0;
	//   19   42:iconst_0        
	//   20   43:istore_1        
_L4:
		obj = ((Object) (stringbuilder));
	//   21   44:aload_3         
	//   22   45:astore_2        
		if(i >= mImageAd.getImpressionTrackingArray().length())
			break; /* Loop/switch isn't completed */
	//   23   46:iload_1         
	//   24   47:aload_0         
	//   25   48:getfield        #19  <Field MadvertiseAd mImageAd>
	//   26   51:invokevirtual   #100 <Method JSONArray MadvertiseAd.getImpressionTrackingArray()>
	//   27   54:invokevirtual   #106 <Method int JSONArray.length()>
	//   28   57:icmpge          124
		obj = ((Object) (new StringBuilder()));
	//   29   60:new             #43  <Class StringBuilder>
	//   30   63:dup             
	//   31   64:invokespecial   #46  <Method void StringBuilder()>
	//   32   67:astore_2        
		((StringBuilder) (obj)).append("<img src=\"");
	//   33   68:aload_2         
	//   34   69:ldc1            #54  <String "<img src=\"">
	//   35   71:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   36   74:pop             
		((StringBuilder) (obj)).append(mImageAd.getImpressionTrackingArray().get(i));
	//   37   75:aload_2         
	//   38   76:aload_0         
	//   39   77:getfield        #19  <Field MadvertiseAd mImageAd>
	//   40   80:invokevirtual   #100 <Method JSONArray MadvertiseAd.getImpressionTrackingArray()>
	//   41   83:iload_1         
	//   42   84:invokevirtual   #115 <Method Object JSONArray.get(int)>
	//   43   87:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//   44   90:pop             
		((StringBuilder) (obj)).append("\"/>");
	//   45   91:aload_2         
	//   46   92:ldc1            #69  <String "\"/>">
	//   47   94:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   48   97:pop             
		stringbuilder.append(((StringBuilder) (obj)).toString());
	//   49   98:aload_3         
	//   50   99:aload_2         
	//   51  100:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   52  103:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   53  106:pop             
		i++;
	//   54  107:iload_1         
	//   55  108:iconst_1        
	//   56  109:iadd            
	//   57  110:istore_1        
		if(true) goto _L4; else goto _L3
	//   58  111:goto            44
_L6:
		obj = ((Object) (new StringBuilder("")));
	//   59  114:new             #43  <Class StringBuilder>
	//   60  117:dup             
	//   61  118:ldc1            #108 <String "">
	//   62  120:invokespecial   #111 <Method void StringBuilder(String)>
	//   63  123:astore_2        
_L3:
		return ((StringBuilder) (obj)).toString();
	//   64  124:aload_2         
	//   65  125:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   66  128:areturn         
_L1:
		return "";
	//   67  129:ldc1            #108 <String "">
	//   68  131:areturn         
		JSONException jsonexception;
		jsonexception;
	//   69  132:astore_2        
		if(true) goto _L6; else goto _L5
_L5:
	//*  70  133:goto            114
	}

	public boolean dispatchTouchEvent(MotionEvent motionevent)
	{
		if(motionevent.getAction() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #125 <Method int MotionEvent.getAction()>
	//*   2    4:ifne            16
		{
			mImageAd.handleClick();
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field MadvertiseAd mImageAd>
	//    5   11:invokevirtual   #128 <Method void MadvertiseAd.handleClick()>
			return true;
	//    6   14:iconst_1        
	//    7   15:ireturn         
		} else
		{
			return super.dispatchTouchEvent(motionevent);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #130 <Method boolean WebView.dispatchTouchEvent(MotionEvent)>
	//   11   21:ireturn         
		}
	}

	protected void onAnimationEnd()
	{
		super.onAnimationEnd();
	//    0    0:aload_0         
	//    1    1:invokespecial   #133 <Method void WebView.onAnimationEnd()>
		MadvertiseView.AnimationEndListener animationendlistener = mAnimationListener;
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field MadvertiseView$AnimationEndListener mAnimationListener>
	//    4    8:astore_1        
		if(animationendlistener != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
			animationendlistener.onAnimationEnd();
	//    7   13:aload_1         
	//    8   14:invokeinterface #136 <Method void MadvertiseView$AnimationEndListener.onAnimationEnd()>
	//    9   19:return          
	}

	private MadvertiseView.AnimationEndListener mAnimationListener;
	private MadvertiseAd mImageAd;
}
