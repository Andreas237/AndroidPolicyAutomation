// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.*;
import android.widget.*;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseUtil, MadvertiseView, MadvertiseAd, MadvertiseActivity

public class MadvertiseMraidView extends WebView
{
	public class ExpandProperties
	{

		private void checkSizeParams()
		{
			if(width > mMaxWidth || height > mMaxHeight)
		//*   0    0:aload_0         
		//*   1    1:getfield        #56  <Field int width>
		//*   2    4:aload_0         
		//*   3    5:getfield        #60  <Field int mMaxWidth>
		//*   4    8:icmpgt          22
		//*   5   11:aload_0         
		//*   6   12:getfield        #58  <Field int height>
		//*   7   15:aload_0         
		//*   8   16:getfield        #62  <Field int mMaxHeight>
		//*   9   19:icmple          112
			{
				int i = height;
		//   10   22:aload_0         
		//   11   23:getfield        #58  <Field int height>
		//   12   26:istore_2        
				float f = i;
		//   13   27:iload_2         
		//   14   28:i2f             
		//   15   29:fstore_1        
				int k = width;
		//   16   30:aload_0         
		//   17   31:getfield        #56  <Field int width>
		//   18   34:istore          4
				f /= k;
		//   19   36:fload_1         
		//   20   37:iload           4
		//   21   39:i2f             
		//   22   40:fdiv            
		//   23   41:fstore_1        
				int j = mMaxWidth;
		//   24   42:aload_0         
		//   25   43:getfield        #60  <Field int mMaxWidth>
		//   26   46:istore_3        
				k = (int)((float)(k - j) * f);
		//   27   47:iload           4
		//   28   49:iload_3         
		//   29   50:isub            
		//   30   51:i2f             
		//   31   52:fload_1         
		//   32   53:fmul            
		//   33   54:f2i             
		//   34   55:istore          4
				int l = mMaxHeight;
		//   35   57:aload_0         
		//   36   58:getfield        #62  <Field int mMaxHeight>
		//   37   61:istore          5
				if(k > (int)((float)(i - l) * f))
		//*  38   63:iload           4
		//*  39   65:iload_2         
		//*  40   66:iload           5
		//*  41   68:isub            
		//*  42   69:i2f             
		//*  43   70:fload_1         
		//*  44   71:fmul            
		//*  45   72:f2i             
		//*  46   73:icmple          94
				{
					width = j;
		//   47   76:aload_0         
		//   48   77:iload_3         
		//   49   78:putfield        #56  <Field int width>
					height = (int)((float)width * f);
		//   50   81:aload_0         
		//   51   82:aload_0         
		//   52   83:getfield        #56  <Field int width>
		//   53   86:i2f             
		//   54   87:fload_1         
		//   55   88:fmul            
		//   56   89:f2i             
		//   57   90:putfield        #58  <Field int height>
					return;
		//   58   93:return          
				}
				height = l;
		//   59   94:aload_0         
		//   60   95:iload           5
		//   61   97:putfield        #58  <Field int height>
				width = (int)((float)height / f);
		//   62  100:aload_0         
		//   63  101:aload_0         
		//   64  102:getfield        #58  <Field int height>
		//   65  105:i2f             
		//   66  106:fload_1         
		//   67  107:fdiv            
		//   68  108:f2i             
		//   69  109:putfield        #56  <Field int width>
			}
		//   70  112:return          
		}

		public void readJson(String s)
		{
			try
			{
				s = ((String) (new JSONObject(s)));
		//    0    0:new             #70  <Class JSONObject>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #72  <Method void JSONObject(String)>
		//    4    8:astore_1        
				if(((JSONObject) (s)).has("height"))
		//*   5    9:aload_1         
		//*   6   10:ldc1            #13  <String "height">
		//*   7   12:invokevirtual   #76  <Method boolean JSONObject.has(String)>
		//*   8   15:ifeq            35
					width = (int)((float)((JSONObject) (s)).getInt("width") * mScale);
		//    9   18:aload_0         
		//   10   19:aload_1         
		//   11   20:ldc1            #22  <String "width">
		//   12   22:invokevirtual   #80  <Method int JSONObject.getInt(String)>
		//   13   25:i2f             
		//   14   26:aload_0         
		//   15   27:getfield        #54  <Field float mScale>
		//   16   30:fmul            
		//   17   31:f2i             
		//   18   32:putfield        #56  <Field int width>
				if(((JSONObject) (s)).has("width"))
		//*  19   35:aload_1         
		//*  20   36:ldc1            #22  <String "width">
		//*  21   38:invokevirtual   #76  <Method boolean JSONObject.has(String)>
		//*  22   41:ifeq            61
					height = (int)((float)((JSONObject) (s)).getInt("height") * mScale);
		//   23   44:aload_0         
		//   24   45:aload_1         
		//   25   46:ldc1            #13  <String "height">
		//   26   48:invokevirtual   #80  <Method int JSONObject.getInt(String)>
		//   27   51:i2f             
		//   28   52:aload_0         
		//   29   53:getfield        #54  <Field float mScale>
		//   30   56:fmul            
		//   31   57:f2i             
		//   32   58:putfield        #58  <Field int height>
				if(((JSONObject) (s)).has("useCustomClose"))
		//*  33   61:aload_1         
		//*  34   62:ldc1            #19  <String "useCustomClose">
		//*  35   64:invokevirtual   #76  <Method boolean JSONObject.has(String)>
		//*  36   67:ifeq            121
				{
					useCustomClose = ((JSONObject) (s)).getBoolean("useCustomClose");
		//   37   70:aload_0         
		//   38   71:aload_1         
		//   39   72:ldc1            #19  <String "useCustomClose">
		//   40   74:invokevirtual   #83  <Method boolean JSONObject.getBoolean(String)>
		//   41   77:putfield        #85  <Field boolean useCustomClose>
					if(useCustomClose && mCloseButton != null)
		//*  42   80:aload_0         
		//*  43   81:getfield        #85  <Field boolean useCustomClose>
		//*  44   84:ifeq            121
		//*  45   87:aload_0         
		//*  46   88:getfield        #34  <Field MadvertiseMraidView this$0>
		//*  47   91:invokestatic    #89  <Method ImageButton MadvertiseMraidView.access$300(MadvertiseMraidView)>
		//*  48   94:ifnull          121
						post(new Runnable() {

							public void run()
							{
								mCloseButton.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
							//    0    0:aload_0         
							//    1    1:getfield        #20  <Field MadvertiseMraidView$ExpandProperties this$1>
							//    2    4:getfield        #29  <Field MadvertiseMraidView MadvertiseMraidView$ExpandProperties.this$0>
							//    3    7:invokestatic    #33  <Method ImageButton MadvertiseMraidView.access$300(MadvertiseMraidView)>
							//    4   10:aconst_null     
							//    5   11:invokevirtual   #39  <Method void ImageButton.setImageDrawable(android.graphics.drawable.Drawable)>
							//    6   14:return          
							}

							final ExpandProperties this$1;

			
			{
				this$1 = ExpandProperties.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MadvertiseMraidView$ExpandProperties this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
						}
);
		//   49   97:aload_0         
		//   50   98:getfield        #34  <Field MadvertiseMraidView this$0>
		//   51  101:new             #9   <Class MadvertiseMraidView$ExpandProperties$1>
		//   52  104:dup             
		//   53  105:aload_0         
		//   54  106:invokespecial   #92  <Method void MadvertiseMraidView$ExpandProperties$1(MadvertiseMraidView$ExpandProperties)>
		//   55  109:invokevirtual   #96  <Method boolean MadvertiseMraidView.post(Runnable)>
		//   56  112:pop             
				}
			}
		//*  57  113:goto            121
			// Misplaced declaration of an exception variable
			catch(String s)
		//*  58  116:astore_1        
			{
				((JSONException) (s)).printStackTrace();
		//   59  117:aload_1         
		//   60  118:invokevirtual   #99  <Method void JSONException.printStackTrace()>
			}
			checkSizeParams();
		//   61  121:aload_0         
		//   62  122:invokespecial   #101 <Method void checkSizeParams()>
		//   63  125:return          
		}

		public String toJson()
		{
			JSONObject jsonobject = new JSONObject();
		//    0    0:new             #70  <Class JSONObject>
		//    1    3:dup             
		//    2    4:invokespecial   #104 <Method void JSONObject()>
		//    3    7:astore_1        
			try
			{
				jsonobject.put("width", width);
		//    4    8:aload_1         
		//    5    9:ldc1            #22  <String "width">
		//    6   11:aload_0         
		//    7   12:getfield        #56  <Field int width>
		//    8   15:invokevirtual   #108 <Method JSONObject JSONObject.put(String, int)>
		//    9   18:pop             
				jsonobject.put("height", height);
		//   10   19:aload_1         
		//   11   20:ldc1            #13  <String "height">
		//   12   22:aload_0         
		//   13   23:getfield        #58  <Field int height>
		//   14   26:invokevirtual   #108 <Method JSONObject JSONObject.put(String, int)>
		//   15   29:pop             
				jsonobject.put("useCustomClose", useCustomClose);
		//   16   30:aload_1         
		//   17   31:ldc1            #19  <String "useCustomClose">
		//   18   33:aload_0         
		//   19   34:getfield        #85  <Field boolean useCustomClose>
		//   20   37:invokevirtual   #111 <Method JSONObject JSONObject.put(String, boolean)>
		//   21   40:pop             
				jsonobject.put("isModal", isModal);
		//   22   41:aload_1         
		//   23   42:ldc1            #16  <String "isModal">
		//   24   44:aload_0         
		//   25   45:getfield        #113 <Field boolean isModal>
		//   26   48:invokevirtual   #111 <Method JSONObject JSONObject.put(String, boolean)>
		//   27   51:pop             
			}
		//*  28   52:goto            60
			catch(JSONException jsonexception)
		//*  29   55:astore_2        
			{
				jsonexception.printStackTrace();
		//   30   56:aload_2         
		//   31   57:invokevirtual   #99  <Method void JSONException.printStackTrace()>
			}
			return jsonobject.toString();
		//   32   60:aload_1         
		//   33   61:invokevirtual   #116 <Method String JSONObject.toString()>
		//   34   64:areturn         
		}

		private static final String HEIGHT = "height";
		private static final String IS_MODAL = "isModal";
		private static final String USE_CUSTOM_CLOSE = "useCustomClose";
		private static final String WIDTH = "width";
		public int height;
		public boolean isModal;
		private int mMaxHeight;
		private int mMaxWidth;
		private float mScale;
		final MadvertiseMraidView this$0;
		public boolean useCustomClose;
		public int width;

		public ExpandProperties(int i, int j)
		{
			this$0 = MadvertiseMraidView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #34  <Field MadvertiseMraidView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #37  <Method void Object()>
			mScale = getResources().getDisplayMetrics().density;
		//    5    9:aload_0         
		//    6   10:aload_0         
		//    7   11:getfield        #34  <Field MadvertiseMraidView this$0>
		//    8   14:invokevirtual   #41  <Method Resources MadvertiseMraidView.getResources()>
		//    9   17:invokevirtual   #47  <Method DisplayMetrics Resources.getDisplayMetrics()>
		//   10   20:getfield        #52  <Field float DisplayMetrics.density>
		//   11   23:putfield        #54  <Field float mScale>
			width = i;
		//   12   26:aload_0         
		//   13   27:iload_2         
		//   14   28:putfield        #56  <Field int width>
			height = j;
		//   15   31:aload_0         
		//   16   32:iload_3         
		//   17   33:putfield        #58  <Field int height>
			mMaxWidth = i;
		//   18   36:aload_0         
		//   19   37:iload_2         
		//   20   38:putfield        #60  <Field int mMaxWidth>
			mMaxHeight = j;
		//   21   41:aload_0         
		//   22   42:iload_3         
		//   23   43:putfield        #62  <Field int mMaxHeight>
		//   24   46:return          
		}
	}


	public MadvertiseMraidView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void WebView(Context)>
	//    3    5:aload_0         
	//    4    6:new             #16  <Class MadvertiseMraidView$3>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #79  <Method void MadvertiseMraidView$3(MadvertiseMraidView)>
	//    8   14:putfield        #81  <Field Object mBridge>
		setVerticalScrollBarEnabled(false);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #85  <Method void setVerticalScrollBarEnabled(boolean)>
		setHorizontalScrollBarEnabled(false);
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:invokevirtual   #88  <Method void setHorizontalScrollBarEnabled(boolean)>
		setScrollBarStyle(0x2000000);
	//   15   27:aload_0         
	//   16   28:ldc1            #89  <Int 0x2000000>
	//   17   30:invokevirtual   #93  <Method void setScrollBarStyle(int)>
		setBackgroundColor(0);
	//   18   33:aload_0         
	//   19   34:iconst_0        
	//   20   35:invokevirtual   #96  <Method void setBackgroundColor(int)>
		context = ((Context) (getSettings()));
	//   21   38:aload_0         
	//   22   39:invokevirtual   #100 <Method WebSettings getSettings()>
	//   23   42:astore_1        
		((WebSettings) (context)).setCacheMode(1);
	//   24   43:aload_1         
	//   25   44:iconst_1        
	//   26   45:invokevirtual   #105 <Method void WebSettings.setCacheMode(int)>
		((WebSettings) (context)).setJavaScriptEnabled(true);
	//   27   48:aload_1         
	//   28   49:iconst_1        
	//   29   50:invokevirtual   #108 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		context = ((Context) (getContext().getResources().getDisplayMetrics()));
	//   30   53:aload_0         
	//   31   54:invokevirtual   #112 <Method Context getContext()>
	//   32   57:invokevirtual   #118 <Method Resources Context.getResources()>
	//   33   60:invokevirtual   #124 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   34   63:astore_1        
		mExpandProperties = new ExpandProperties(((DisplayMetrics) (context)).widthPixels, ((DisplayMetrics) (context)).heightPixels);
	//   35   64:aload_0         
	//   36   65:new             #30  <Class MadvertiseMraidView$ExpandProperties>
	//   37   68:dup             
	//   38   69:aload_0         
	//   39   70:aload_1         
	//   40   71:getfield        #129 <Field int DisplayMetrics.widthPixels>
	//   41   74:aload_1         
	//   42   75:getfield        #132 <Field int DisplayMetrics.heightPixels>
	//   43   78:invokespecial   #135 <Method void MadvertiseMraidView$ExpandProperties(MadvertiseMraidView, int, int)>
	//   44   81:putfield        #137 <Field MadvertiseMraidView$ExpandProperties mExpandProperties>
		context = ((Context) (new StringBuilder()));
	//   45   84:new             #139 <Class StringBuilder>
	//   46   87:dup             
	//   47   88:invokespecial   #142 <Method void StringBuilder()>
	//   48   91:astore_1        
		((StringBuilder) (context)).append("Setting default expandProperties : ");
	//   49   92:aload_1         
	//   50   93:ldc1            #144 <String "Setting default expandProperties : ">
	//   51   95:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   52   98:pop             
		((StringBuilder) (context)).append(mExpandProperties.toJson().toString());
	//   53   99:aload_1         
	//   54  100:aload_0         
	//   55  101:getfield        #137 <Field MadvertiseMraidView$ExpandProperties mExpandProperties>
	//   56  104:invokevirtual   #152 <Method String MadvertiseMraidView$ExpandProperties.toJson()>
	//   57  107:invokevirtual   #157 <Method String String.toString()>
	//   58  110:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   59  113:pop             
		MadvertiseUtil.logMessage(((String) (null)), 4, ((StringBuilder) (context)).toString());
	//   60  114:aconst_null     
	//   61  115:iconst_4        
	//   62  116:aload_1         
	//   63  117:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   64  120:invokestatic    #164 <Method void MadvertiseUtil.logMessage(String, int, String)>
		addJavascriptInterface(mBridge, "mraid_bridge");
	//   65  123:aload_0         
	//   66  124:aload_0         
	//   67  125:getfield        #81  <Field Object mBridge>
	//   68  128:ldc1            #166 <String "mraid_bridge">
	//   69  130:invokevirtual   #170 <Method void addJavascriptInterface(Object, String)>
		setWebViewClient(((WebViewClient) (new WebViewClient() {

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
					checkReady();
			//   15   29:aload_0         
			//   16   30:getfield        #18  <Field MadvertiseMraidView this$0>
			//   17   33:invokestatic    #47  <Method void MadvertiseMraidView.access$100(MadvertiseMraidView)>
					if(mPlacementType == 1)
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
						webview.mCloseButton = ((MadvertiseMraidView) (webview)).addCloseButtonToViewGroup((ViewGroup)((MadvertiseMraidView) (webview)).getParent());
			//   26   52:aload_1         
			//   27   53:aload_1         
			//   28   54:aload_1         
			//   29   55:invokevirtual   #55  <Method android.view.ViewParent MadvertiseMraidView.getParent()>
			//   30   58:checkcast       #57  <Class ViewGroup>
			//   31   61:invokestatic    #61  <Method ImageButton MadvertiseMraidView.access$400(MadvertiseMraidView, ViewGroup)>
			//   32   64:invokestatic    #65  <Method ImageButton MadvertiseMraidView.access$302(MadvertiseMraidView, ImageButton)>
			//   33   67:pop             
						mCloseButton.setImageResource(0x1080038);
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

			public boolean shouldOverrideUrlLoading(WebView webview, String s)
			{
				post(((_cls1) (s)). new Runnable() {

					public void run()
					{
						if(mListener != null)
					//*   0    0:aload_0         
					//*   1    1:getfield        #19  <Field MadvertiseMraidView$1 this$1>
					//*   2    4:getfield        #30  <Field MadvertiseMraidView MadvertiseMraidView$1.this$0>
					//*   3    7:invokestatic    #36  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseMraidView.access$000(MadvertiseMraidView)>
					//*   4   10:ifnull          28
							mListener.onAdClicked();
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

					final _cls1 this$1;
					final String val$url;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MadvertiseMraidView$1 this$1>
				url = String.this;
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
)));
	//   70  133:aload_0         
	//   71  134:new             #6   <Class MadvertiseMraidView$1>
	//   72  137:dup             
	//   73  138:aload_0         
	//   74  139:invokespecial   #171 <Method void MadvertiseMraidView$1(MadvertiseMraidView)>
	//   75  142:invokevirtual   #175 <Method void setWebViewClient(WebViewClient)>
		setWebChromeClient(((WebChromeClient) (new WebChromeClient() {

			public void onHideCustomView()
			{
				if(mVideo != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #18  <Field MadvertiseMraidView this$0>
			//*   2    4:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
			//*   3    7:ifnull          53
				{
					((ViewGroup)getParent()).removeView(((View) (mVideo)));
			//    4   10:aload_0         
			//    5   11:getfield        #18  <Field MadvertiseMraidView this$0>
			//    6   14:invokevirtual   #31  <Method android.view.ViewParent MadvertiseMraidView.getParent()>
			//    7   17:checkcast       #33  <Class ViewGroup>
			//    8   20:aload_0         
			//    9   21:getfield        #18  <Field MadvertiseMraidView this$0>
			//   10   24:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
			//   11   27:invokevirtual   #37  <Method void ViewGroup.removeView(View)>
					if(mVideo.isPlaying())
			//*  12   30:aload_0         
			//*  13   31:getfield        #18  <Field MadvertiseMraidView this$0>
			//*  14   34:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
			//*  15   37:invokevirtual   #43  <Method boolean VideoView.isPlaying()>
			//*  16   40:ifeq            53
						mVideo.stopPlayback();
			//   17   43:aload_0         
			//   18   44:getfield        #18  <Field MadvertiseMraidView this$0>
			//   19   47:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
			//   20   50:invokevirtual   #46  <Method void VideoView.stopPlayback()>
				}
			//   21   53:return          
			}

			public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
			{
				MadvertiseUtil.logMessage(((String) (null)), 4, "showing VideoView");
			//    0    0:aconst_null     
			//    1    1:iconst_4        
			//    2    2:ldc1            #50  <String "showing VideoView">
			//    3    4:invokestatic    #56  <Method void MadvertiseUtil.logMessage(String, int, String)>
				super.onShowCustomView(view, customviewcallback);
			//    4    7:aload_0         
			//    5    8:aload_1         
			//    6    9:aload_2         
			//    7   10:invokespecial   #58  <Method void WebChromeClient.onShowCustomView(View, android.webkit.WebChromeClient$CustomViewCallback)>
				if(view instanceof FrameLayout)
			//*   8   13:aload_1         
			//*   9   14:instanceof      #60  <Class FrameLayout>
			//*  10   17:ifeq            127
				{
					view = ((View) ((FrameLayout)view));
			//   11   20:aload_1         
			//   12   21:checkcast       #60  <Class FrameLayout>
			//   13   24:astore_1        
					if(((FrameLayout) (view)).getFocusedChild() instanceof VideoView)
			//*  14   25:aload_1         
			//*  15   26:invokevirtual   #64  <Method View FrameLayout.getFocusedChild()>
			//*  16   29:instanceof      #39  <Class VideoView>
			//*  17   32:ifeq            127
					{
						mVideo = (VideoView)((FrameLayout) (view)).getFocusedChild();
			//   18   35:aload_0         
			//   19   36:getfield        #18  <Field MadvertiseMraidView this$0>
			//   20   39:aload_1         
			//   21   40:invokevirtual   #64  <Method View FrameLayout.getFocusedChild()>
			//   22   43:checkcast       #39  <Class VideoView>
			//   23   46:invokestatic    #68  <Method VideoView MadvertiseMraidView.access$502(MadvertiseMraidView, VideoView)>
			//   24   49:pop             
						((FrameLayout) (view)).removeView(((View) (mVideo)));
			//   25   50:aload_1         
			//   26   51:aload_0         
			//   27   52:getfield        #18  <Field MadvertiseMraidView this$0>
			//   28   55:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
			//   29   58:invokevirtual   #69  <Method void FrameLayout.removeView(View)>
						((ViewGroup)getParent()).addView(((View) (mVideo)));
			//   30   61:aload_0         
			//   31   62:getfield        #18  <Field MadvertiseMraidView this$0>
			//   32   65:invokevirtual   #31  <Method android.view.ViewParent MadvertiseMraidView.getParent()>
			//   33   68:checkcast       #33  <Class ViewGroup>
			//   34   71:aload_0         
			//   35   72:getfield        #18  <Field MadvertiseMraidView this$0>
			//   36   75:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
			//   37   78:invokevirtual   #72  <Method void ViewGroup.addView(View)>
						mVideo.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

							public void onCompletion(MediaPlayer mediaplayer)
							{
								mediaplayer.stop();
							//    0    0:aload_1         
							//    1    1:invokevirtual   #28  <Method void MediaPlayer.stop()>
							//    2    4:return          
							}

							final _cls2 this$1;

			
			{
				this$1 = _cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MadvertiseMraidView$2 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
						}
);
			//   38   81:aload_0         
			//   39   82:getfield        #18  <Field MadvertiseMraidView this$0>
			//   40   85:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
			//   41   88:new             #11  <Class MadvertiseMraidView$2$1>
			//   42   91:dup             
			//   43   92:aload_0         
			//   44   93:invokespecial   #75  <Method void MadvertiseMraidView$2$1(MadvertiseMraidView$2)>
			//   45   96:invokevirtual   #79  <Method void VideoView.setOnCompletionListener(android.media.MediaPlayer$OnCompletionListener)>
						mVideo.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() {

							public boolean onError(MediaPlayer mediaplayer, int i, int j)
							{
								MadvertiseUtil.logMessage(((String) (null)), 5, "Error while playing video");
							//    0    0:aconst_null     
							//    1    1:iconst_5        
							//    2    2:ldc1            #25  <String "Error while playing video">
							//    3    4:invokestatic    #31  <Method void MadvertiseUtil.logMessage(String, int, String)>
								if(mListener != null)
							//*   4    7:aload_0         
							//*   5    8:getfield        #17  <Field MadvertiseMraidView$2 this$1>
							//*   6   11:getfield        #35  <Field MadvertiseMraidView MadvertiseMraidView$2.this$0>
							//*   7   14:invokestatic    #41  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseMraidView.access$000(MadvertiseMraidView)>
							//*   8   17:ifnull          44
									mListener.onError(((Exception) (new IOException("Error while playing video"))));
							//    9   20:aload_0         
							//   10   21:getfield        #17  <Field MadvertiseMraidView$2 this$1>
							//   11   24:getfield        #35  <Field MadvertiseMraidView MadvertiseMraidView$2.this$0>
							//   12   27:invokestatic    #41  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseMraidView.access$000(MadvertiseMraidView)>
							//   13   30:new             #43  <Class IOException>
							//   14   33:dup             
							//   15   34:ldc1            #25  <String "Error while playing video">
							//   16   36:invokespecial   #46  <Method void IOException(String)>
							//   17   39:invokeinterface #51  <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
								return false;
							//   18   44:iconst_0        
							//   19   45:ireturn         
							}

							final _cls2 this$1;

			
			{
				this$1 = _cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MadvertiseMraidView$2 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
						}
);
			//   46   99:aload_0         
			//   47  100:getfield        #18  <Field MadvertiseMraidView this$0>
			//   48  103:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
			//   49  106:new             #13  <Class MadvertiseMraidView$2$2>
			//   50  109:dup             
			//   51  110:aload_0         
			//   52  111:invokespecial   #80  <Method void MadvertiseMraidView$2$2(MadvertiseMraidView$2)>
			//   53  114:invokevirtual   #84  <Method void VideoView.setOnErrorListener(android.media.MediaPlayer$OnErrorListener)>
						mVideo.start();
			//   54  117:aload_0         
			//   55  118:getfield        #18  <Field MadvertiseMraidView this$0>
			//   56  121:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
			//   57  124:invokevirtual   #87  <Method void VideoView.start()>
					}
				}
			//   58  127:return          
			}

			final MadvertiseMraidView this$0;

			
			{
				this$0 = MadvertiseMraidView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MadvertiseMraidView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void WebChromeClient()>
			//    5    9:return          
			}
		}
)));
	//   76  145:aload_0         
	//   77  146:new             #10  <Class MadvertiseMraidView$2>
	//   78  149:dup             
	//   79  150:aload_0         
	//   80  151:invokespecial   #176 <Method void MadvertiseMraidView$2(MadvertiseMraidView)>
	//   81  154:invokevirtual   #180 <Method void setWebChromeClient(WebChromeClient)>
	//   82  157:return          
	}

	public MadvertiseMraidView(Context context, MadvertiseView.MadvertiseViewCallbackListener madvertiseviewcallbacklistener, MadvertiseView.AnimationEndListener animationendlistener, Handler handler, MadvertiseView madvertiseview)
	{
		this(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #183 <Method void MadvertiseMraidView(Context)>
		mLoadingCompletedHandler = handler;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #185 <Field Handler mLoadingCompletedHandler>
		mAnimationEndListener = animationendlistener;
	//    6   11:aload_0         
	//    7   12:aload_3         
	//    8   13:putfield        #187 <Field MadvertiseView$AnimationEndListener mAnimationEndListener>
		mListener = madvertiseviewcallbacklistener;
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:putfield        #189 <Field MadvertiseView$MadvertiseViewCallbackListener mListener>
		mMadView = madvertiseview;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #191 <Field MadvertiseView mMadView>
	//   15   27:return          
	}

	private ImageButton addCloseButtonToViewGroup(ViewGroup viewgroup)
	{
		ImageButton imagebutton = new ImageButton(getContext());
	//    0    0:new             #234 <Class ImageButton>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #112 <Method Context getContext()>
	//    4    8:invokespecial   #235 <Method void ImageButton(Context)>
	//    5   11:astore_2        
		android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(50, 50);
	//    6   12:new             #237 <Class android.widget.FrameLayout$LayoutParams>
	//    7   15:dup             
	//    8   16:bipush          50
	//    9   18:bipush          50
	//   10   20:invokespecial   #239 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   11   23:astore_3        
		layoutparams.gravity = 5;
	//   12   24:aload_3         
	//   13   25:iconst_5        
	//   14   26:putfield        #242 <Field int android.widget.FrameLayout$LayoutParams.gravity>
		imagebutton.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:invokevirtual   #246 <Method void ImageButton.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		imagebutton.setBackgroundColor(0);
	//   18   34:aload_2         
	//   19   35:iconst_0        
	//   20   36:invokevirtual   #247 <Method void ImageButton.setBackgroundColor(int)>
		imagebutton.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				close();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MadvertiseMraidView this$0>
			//    2    4:invokestatic    #26  <Method void MadvertiseMraidView.access$900(MadvertiseMraidView)>
			//    3    7:return          
			}

			final MadvertiseMraidView this$0;

			
			{
				this$0 = MadvertiseMraidView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MadvertiseMraidView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   21   39:aload_2         
	//   22   40:new             #28  <Class MadvertiseMraidView$5>
	//   23   43:dup             
	//   24   44:aload_0         
	//   25   45:invokespecial   #248 <Method void MadvertiseMraidView$5(MadvertiseMraidView)>
	//   26   48:invokevirtual   #252 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		viewgroup.addView(((View) (imagebutton)));
	//   27   51:aload_1         
	//   28   52:aload_2         
	//   29   53:invokevirtual   #258 <Method void ViewGroup.addView(View)>
		return imagebutton;
	//   30   56:aload_2         
	//   31   57:areturn         
	}

	private void checkReady()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #139 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #142 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("mraid.setExpandProperties(");
	//    4    8:aload_1         
	//    5    9:ldc2            #260 <String "mraid.setExpandProperties(">
	//    6   12:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(mExpandProperties.toJson());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #137 <Field MadvertiseMraidView$ExpandProperties mExpandProperties>
	//   11   21:invokevirtual   #152 <Method String MadvertiseMraidView$ExpandProperties.toJson()>
	//   12   24:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		((StringBuilder) (obj)).append(");");
	//   14   28:aload_1         
	//   15   29:ldc2            #262 <String ");">
	//   16   32:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		injectJs(((StringBuilder) (obj)).toString());
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   21   41:invokevirtual   #266 <Method void injectJs(String)>
		setState(2);
	//   22   44:aload_0         
	//   23   45:iconst_2        
	//   24   46:invokevirtual   #269 <Method void setState(int)>
		fireEvent("ready");
	//   25   49:aload_0         
	//   26   50:ldc2            #271 <String "ready">
	//   27   53:invokevirtual   #274 <Method void fireEvent(String)>
		checkViewable();
	//   28   56:aload_0         
	//   29   57:invokespecial   #277 <Method void checkViewable()>
		obj = ((Object) (mLoadingCompletedHandler));
	//   30   60:aload_0         
	//   31   61:getfield        #185 <Field Handler mLoadingCompletedHandler>
	//   32   64:astore_1        
		if(obj != null)
	//*  33   65:aload_1         
	//*  34   66:ifnull          75
			((Handler) (obj)).sendEmptyMessage(0);
	//   35   69:aload_1         
	//   36   70:iconst_0        
	//   37   71:invokevirtual   #283 <Method boolean Handler.sendEmptyMessage(int)>
	//   38   74:pop             
	//   39   75:return          
	}

	private void checkViewable()
	{
		boolean flag;
		if(mOnScreen && getVisibility() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #285 <Field boolean mOnScreen>
	//*   2    4:ifeq            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #289 <Method int getVisibility()>
	//*   5   11:ifne            19
			flag = true;
	//    6   14:iconst_1        
	//    7   15:istore_1        
		else
	//*   8   16:goto            21
			flag = false;
	//    9   19:iconst_0        
	//   10   20:istore_1        
		if(flag != mViewable && mState == 2)
	//*  11   21:iload_1         
	//*  12   22:aload_0         
	//*  13   23:getfield        #291 <Field boolean mViewable>
	//*  14   26:icmpeq          83
	//*  15   29:aload_0         
	//*  16   30:getfield        #293 <Field int mState>
	//*  17   33:iconst_2        
	//*  18   34:icmpne          83
		{
			mViewable = flag;
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:putfield        #291 <Field boolean mViewable>
			StringBuilder stringbuilder = new StringBuilder();
	//   22   42:new             #139 <Class StringBuilder>
	//   23   45:dup             
	//   24   46:invokespecial   #142 <Method void StringBuilder()>
	//   25   49:astore_2        
			stringbuilder.append("mraid.setViewable(");
	//   26   50:aload_2         
	//   27   51:ldc2            #295 <String "mraid.setViewable(">
	//   28   54:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
			stringbuilder.append(mViewable);
	//   30   58:aload_2         
	//   31   59:aload_0         
	//   32   60:getfield        #291 <Field boolean mViewable>
	//   33   63:invokevirtual   #298 <Method StringBuilder StringBuilder.append(boolean)>
	//   34   66:pop             
			stringbuilder.append(");");
	//   35   67:aload_2         
	//   36   68:ldc2            #262 <String ");">
	//   37   71:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   38   74:pop             
			injectJs(stringbuilder.toString());
	//   39   75:aload_0         
	//   40   76:aload_2         
	//   41   77:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   42   80:invokevirtual   #266 <Method void injectJs(String)>
		}
	//   43   83:return          
	}

	private void close()
	{
		switch(mState)
	//*   0    0:aload_0         
	//*   1    1:getfield        #293 <Field int mState>
		{
	//*   2    4:tableswitch     2 3: default 28
	//	               2 151
	//	               3 29
		default:
			return;
	//    3   28:return          

		case 3: // '\003'
			Object obj = ((Object) (mExpandLayout));
	//    4   29:aload_0         
	//    5   30:getfield        #300 <Field FrameLayout mExpandLayout>
	//    6   33:astore_1        
			if(obj != null && mOriginalParent != null)
	//*   7   34:aload_1         
	//*   8   35:ifnull          116
	//*   9   38:aload_0         
	//*  10   39:getfield        #302 <Field ViewGroup mOriginalParent>
	//*  11   42:ifnull          116
			{
				((ViewGroup)((FrameLayout) (obj)).getParent()).removeView(((View) (mExpandLayout)));
	//   12   45:aload_1         
	//   13   46:invokevirtual   #308 <Method android.view.ViewParent FrameLayout.getParent()>
	//   14   49:checkcast       #254 <Class ViewGroup>
	//   15   52:aload_0         
	//   16   53:getfield        #300 <Field FrameLayout mExpandLayout>
	//   17   56:invokevirtual   #311 <Method void ViewGroup.removeView(View)>
				mExpandLayout.removeView(((View) (this)));
	//   18   59:aload_0         
	//   19   60:getfield        #300 <Field FrameLayout mExpandLayout>
	//   20   63:aload_0         
	//   21   64:invokevirtual   #312 <Method void FrameLayout.removeView(View)>
				setLayoutParams(mOriginalParent.getChildAt(mIndex).getLayoutParams());
	//   22   67:aload_0         
	//   23   68:aload_0         
	//   24   69:getfield        #302 <Field ViewGroup mOriginalParent>
	//   25   72:aload_0         
	//   26   73:getfield        #314 <Field int mIndex>
	//   27   76:invokevirtual   #318 <Method View ViewGroup.getChildAt(int)>
	//   28   79:invokevirtual   #324 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   29   82:invokevirtual   #325 <Method void setLayoutParams(android.view.ViewGroup$LayoutParams)>
				mOriginalParent.removeViewAt(mIndex);
	//   30   85:aload_0         
	//   31   86:getfield        #302 <Field ViewGroup mOriginalParent>
	//   32   89:aload_0         
	//   33   90:getfield        #314 <Field int mIndex>
	//   34   93:invokevirtual   #328 <Method void ViewGroup.removeViewAt(int)>
				mOriginalParent.addView(((View) (this)), mIndex);
	//   35   96:aload_0         
	//   36   97:getfield        #302 <Field ViewGroup mOriginalParent>
	//   37  100:aload_0         
	//   38  101:aload_0         
	//   39  102:getfield        #314 <Field int mIndex>
	//   40  105:invokevirtual   #331 <Method void ViewGroup.addView(View, int)>
				mOriginalParent.setVisibility(0);
	//   41  108:aload_0         
	//   42  109:getfield        #302 <Field ViewGroup mOriginalParent>
	//   43  112:iconst_0        
	//   44  113:invokevirtual   #334 <Method void ViewGroup.setVisibility(int)>
			}
			setState(2);
	//   45  116:aload_0         
	//   46  117:iconst_2        
	//   47  118:invokevirtual   #269 <Method void setState(int)>
			obj = ((Object) (mListener));
	//   48  121:aload_0         
	//   49  122:getfield        #189 <Field MadvertiseView$MadvertiseViewCallbackListener mListener>
	//   50  125:astore_1        
			if(obj != null)
	//*  51  126:aload_1         
	//*  52  127:ifnull          136
				((MadvertiseView.MadvertiseViewCallbackListener) (obj)).onApplicationResume();
	//   53  130:aload_1         
	//   54  131:invokeinterface #339 <Method void MadvertiseView$MadvertiseViewCallbackListener.onApplicationResume()>
			obj = ((Object) (mMadView));
	//   55  136:aload_0         
	//   56  137:getfield        #191 <Field MadvertiseView mMadView>
	//   57  140:astore_1        
			if(obj != null)
	//*  58  141:aload_1         
	//*  59  142:ifnull          182
			{
				((MadvertiseView) (obj)).setFetchingAdsEnabled(true);
	//   60  145:aload_1         
	//   61  146:iconst_1        
	//   62  147:invokevirtual   #344 <Method void MadvertiseView.setFetchingAdsEnabled(boolean)>
				return;
	//   63  150:return          
			}
			break;

		case 2: // '\002'
			((ViewGroup)getParent()).setVisibility(8);
	//   64  151:aload_0         
	//   65  152:invokevirtual   #345 <Method android.view.ViewParent getParent()>
	//   66  155:checkcast       #254 <Class ViewGroup>
	//   67  158:bipush          8
	//   68  160:invokevirtual   #334 <Method void ViewGroup.setVisibility(int)>
			setState(1);
	//   69  163:aload_0         
	//   70  164:iconst_1        
	//   71  165:invokevirtual   #269 <Method void setState(int)>
			MadvertiseView madvertiseview = mMadView;
	//   72  168:aload_0         
	//   73  169:getfield        #191 <Field MadvertiseView mMadView>
	//   74  172:astore_1        
			if(madvertiseview != null)
	//*  75  173:aload_1         
	//*  76  174:ifnull          182
				madvertiseview.setFetchingAdsEnabled(false);
	//   77  177:aload_1         
	//   78  178:iconst_0        
	//   79  179:invokevirtual   #344 <Method void MadvertiseView.setFetchingAdsEnabled(boolean)>
			break;
		}
	//   80  182:return          
	}

	private void resize(int i, int j)
	{
		FrameLayout framelayout = (FrameLayout)getRootView().findViewById(0x1020002);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #349 <Method View getRootView()>
	//    2    4:ldc2            #350 <Int 0x1020002>
	//    3    7:invokevirtual   #353 <Method View View.findViewById(int)>
	//    4   10:checkcast       #304 <Class FrameLayout>
	//    5   13:astore_3        
		android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(i, j);
	//    6   14:new             #237 <Class android.widget.FrameLayout$LayoutParams>
	//    7   17:dup             
	//    8   18:iload_1         
	//    9   19:iload_2         
	//   10   20:invokespecial   #239 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   11   23:astore          4
		View view = new View(getContext());
	//   12   25:new             #320 <Class View>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:invokevirtual   #112 <Method Context getContext()>
	//   16   33:invokespecial   #354 <Method void View(Context)>
	//   17   36:astore          5
		view.setLayoutParams(getLayoutParams());
	//   18   38:aload           5
	//   19   40:aload_0         
	//   20   41:invokevirtual   #355 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   21   44:invokevirtual   #356 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		mExpandLayout = new FrameLayout(getContext());
	//   22   47:aload_0         
	//   23   48:new             #304 <Class FrameLayout>
	//   24   51:dup             
	//   25   52:aload_0         
	//   26   53:invokevirtual   #112 <Method Context getContext()>
	//   27   56:invokespecial   #357 <Method void FrameLayout(Context)>
	//   28   59:putfield        #300 <Field FrameLayout mExpandLayout>
		Object obj = ((Object) (new android.widget.FrameLayout.LayoutParams(-2, -2)));
	//   29   62:new             #237 <Class android.widget.FrameLayout$LayoutParams>
	//   30   65:dup             
	//   31   66:bipush          -2
	//   32   68:bipush          -2
	//   33   70:invokespecial   #239 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   34   73:astore          6
		obj.gravity = 17;
	//   35   75:aload           6
	//   36   77:bipush          17
	//   37   79:putfield        #242 <Field int android.widget.FrameLayout$LayoutParams.gravity>
		mExpandLayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   38   82:aload_0         
	//   39   83:getfield        #300 <Field FrameLayout mExpandLayout>
	//   40   86:aload           6
	//   41   88:invokevirtual   #358 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		mOriginalParent = (ViewGroup)getParent();
	//   42   91:aload_0         
	//   43   92:aload_0         
	//   44   93:invokevirtual   #345 <Method android.view.ViewParent getParent()>
	//   45   96:checkcast       #254 <Class ViewGroup>
	//   46   99:putfield        #302 <Field ViewGroup mOriginalParent>
		obj = ((Object) (mOriginalParent));
	//   47  102:aload_0         
	//   48  103:getfield        #302 <Field ViewGroup mOriginalParent>
	//   49  106:astore          6
		if(obj != null)
	//*  50  108:aload           6
	//*  51  110:ifnull          254
		{
			j = ((ViewGroup) (obj)).getChildCount();
	//   52  113:aload           6
	//   53  115:invokevirtual   #361 <Method int ViewGroup.getChildCount()>
	//   54  118:istore_2        
			for(i = 0; i < j && mOriginalParent.getChildAt(i) != this; i++);
	//   55  119:iconst_0        
	//   56  120:istore_1        
	//   57  121:iload_1         
	//   58  122:iload_2         
	//   59  123:icmpge          148
	//   60  126:aload_0         
	//   61  127:getfield        #302 <Field ViewGroup mOriginalParent>
	//   62  130:iload_1         
	//   63  131:invokevirtual   #318 <Method View ViewGroup.getChildAt(int)>
	//   64  134:aload_0         
	//   65  135:if_acmpne       141
	//   66  138:goto            148
	//   67  141:iload_1         
	//   68  142:iconst_1        
	//   69  143:iadd            
	//   70  144:istore_1        
	//*  71  145:goto            121
			mIndex = i;
	//   72  148:aload_0         
	//   73  149:iload_1         
	//   74  150:putfield        #314 <Field int mIndex>
			setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   75  153:aload_0         
	//   76  154:aload           4
	//   77  156:invokevirtual   #325 <Method void setLayoutParams(android.view.ViewGroup$LayoutParams)>
			mOriginalParent.removeView(((View) (this)));
	//   78  159:aload_0         
	//   79  160:getfield        #302 <Field ViewGroup mOriginalParent>
	//   80  163:aload_0         
	//   81  164:invokevirtual   #311 <Method void ViewGroup.removeView(View)>
			mExpandLayout.addView(((View) (this)));
	//   82  167:aload_0         
	//   83  168:getfield        #300 <Field FrameLayout mExpandLayout>
	//   84  171:aload_0         
	//   85  172:invokevirtual   #362 <Method void FrameLayout.addView(View)>
			mCloseButton = addCloseButtonToViewGroup((ViewGroup)getParent());
	//   86  175:aload_0         
	//   87  176:aload_0         
	//   88  177:aload_0         
	//   89  178:invokevirtual   #345 <Method android.view.ViewParent getParent()>
	//   90  181:checkcast       #254 <Class ViewGroup>
	//   91  184:invokespecial   #213 <Method ImageButton addCloseButtonToViewGroup(ViewGroup)>
	//   92  187:putfield        #205 <Field ImageButton mCloseButton>
			mCloseButton.setId(43);
	//   93  190:aload_0         
	//   94  191:getfield        #205 <Field ImageButton mCloseButton>
	//   95  194:bipush          43
	//   96  196:invokevirtual   #365 <Method void ImageButton.setId(int)>
			if(!mExpandProperties.useCustomClose)
	//*  97  199:aload_0         
	//*  98  200:getfield        #137 <Field MadvertiseMraidView$ExpandProperties mExpandProperties>
	//*  99  203:getfield        #368 <Field boolean MadvertiseMraidView$ExpandProperties.useCustomClose>
	//* 100  206:ifne            219
				mCloseButton.setImageResource(0x1080038);
	//  101  209:aload_0         
	//  102  210:getfield        #205 <Field ImageButton mCloseButton>
	//  103  213:ldc2            #369 <Int 0x1080038>
	//  104  216:invokevirtual   #372 <Method void ImageButton.setImageResource(int)>
			framelayout.addView(((View) (mExpandLayout)));
	//  105  219:aload_3         
	//  106  220:aload_0         
	//  107  221:getfield        #300 <Field FrameLayout mExpandLayout>
	//  108  224:invokevirtual   #362 <Method void FrameLayout.addView(View)>
			mOriginalParent.addView(view, mIndex);
	//  109  227:aload_0         
	//  110  228:getfield        #302 <Field ViewGroup mOriginalParent>
	//  111  231:aload           5
	//  112  233:aload_0         
	//  113  234:getfield        #314 <Field int mIndex>
	//  114  237:invokevirtual   #331 <Method void ViewGroup.addView(View, int)>
			mOriginalParent.setVisibility(8);
	//  115  240:aload_0         
	//  116  241:getfield        #302 <Field ViewGroup mOriginalParent>
	//  117  244:bipush          8
	//  118  246:invokevirtual   #334 <Method void ViewGroup.setVisibility(int)>
			mState = 3;
	//  119  249:aload_0         
	//  120  250:iconst_3        
	//  121  251:putfield        #293 <Field int mState>
		}
	//  122  254:return          
	}

	protected void fireErrorEvent(String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #139 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #142 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("mraid.fireErrorEvent('");
	//    4    8:aload_3         
	//    5    9:ldc2            #376 <String "mraid.fireErrorEvent('">
	//    6   12:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(s);
	//    8   16:aload_3         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append("', '");
	//   12   22:aload_3         
	//   13   23:ldc2            #378 <String "', '">
	//   14   26:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append(s1);
	//   16   30:aload_3         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		stringbuilder.append("');");
	//   20   36:aload_3         
	//   21   37:ldc2            #380 <String "');">
	//   22   40:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		injectJs(stringbuilder.toString());
	//   24   44:aload_0         
	//   25   45:aload_3         
	//   26   46:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   27   49:invokevirtual   #266 <Method void injectJs(String)>
	//   28   52:return          
	}

	protected void fireEvent(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #139 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #142 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("mraid.fireEvent('");
	//    4    8:aload_2         
	//    5    9:ldc2            #382 <String "mraid.fireEvent('">
	//    6   12:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(s);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append("');");
	//   12   22:aload_2         
	//   13   23:ldc2            #380 <String "');">
	//   14   26:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		injectJs(stringbuilder.toString());
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   19   35:invokevirtual   #266 <Method void injectJs(String)>
	//   20   38:return          
	}

	protected ExpandProperties getExpandProperties()
	{
		return mExpandProperties;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field MadvertiseMraidView$ExpandProperties mExpandProperties>
	//    2    4:areturn         
	}

	public int getPlacementType()
	{
		return mPlacementType;
	//    0    0:aload_0         
	//    1    1:getfield        #201 <Field int mPlacementType>
	//    2    4:ireturn         
	}

	protected void injectJs(final String jsCode)
	{
		post(new Runnable() {

			public void run()
			{
				MadvertiseMraidView madvertisemraidview = MadvertiseMraidView.this;
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field MadvertiseMraidView this$0>
			//    2    4:astore_1        
				StringBuilder stringbuilder = new StringBuilder();
			//    3    5:new             #28  <Class StringBuilder>
			//    4    8:dup             
			//    5    9:invokespecial   #29  <Method void StringBuilder()>
			//    6   12:astore_2        
				stringbuilder.append("javascript:");
			//    7   13:aload_2         
			//    8   14:ldc1            #31  <String "javascript:">
			//    9   16:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
			//   10   19:pop             
				stringbuilder.append(jsCode);
			//   11   20:aload_2         
			//   12   21:aload_0         
			//   13   22:getfield        #21  <Field String val$jsCode>
			//   14   25:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
			//   15   28:pop             
				madvertisemraidview.loadUrl(stringbuilder.toString());
			//   16   29:aload_1         
			//   17   30:aload_2         
			//   18   31:invokevirtual   #39  <Method String StringBuilder.toString()>
			//   19   34:invokevirtual   #42  <Method void MadvertiseMraidView.loadUrl(String)>
			//   20   37:return          
			}

			final MadvertiseMraidView this$0;
			final String val$jsCode;

			
			{
				this$0 = MadvertiseMraidView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MadvertiseMraidView this$0>
				jsCode = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$jsCode>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #26  <Class MadvertiseMraidView$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #388 <Method void MadvertiseMraidView$4(MadvertiseMraidView, String)>
	//    6   10:invokevirtual   #392 <Method boolean post(Runnable)>
	//    7   13:pop             
	//    8   14:return          
	}

	protected void loadAd(MadvertiseAd madvertisead)
	{
		if(mraidJS == null)
	//*   0    0:getstatic       #396 <Field String mraidJS>
	//*   1    3:ifnonnull       25
			mraidJS = MadvertiseUtil.convertStreamToString(getContext().getResources().openRawResource(com.appscend.vastplayer.R.raw.mraid));
	//    2    6:aload_0         
	//    3    7:invokevirtual   #112 <Method Context getContext()>
	//    4   10:invokevirtual   #118 <Method Resources Context.getResources()>
	//    5   13:getstatic       #401 <Field int com.appscend.vastplayer.R$raw.mraid>
	//    6   16:invokevirtual   #405 <Method java.io.InputStream Resources.openRawResource(int)>
	//    7   19:invokestatic    #409 <Method String MadvertiseUtil.convertStreamToString(java.io.InputStream)>
	//    8   22:putstatic       #396 <Field String mraidJS>
		Object obj = ((Object) (new StringBuilder()));
	//    9   25:new             #139 <Class StringBuilder>
	//   10   28:dup             
	//   11   29:invokespecial   #142 <Method void StringBuilder()>
	//   12   32:astore_3        
		((StringBuilder) (obj)).append("javascript:");
	//   13   33:aload_3         
	//   14   34:ldc2            #411 <String "javascript:">
	//   15   37:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   16   40:pop             
		((StringBuilder) (obj)).append(mraidJS);
	//   17   41:aload_3         
	//   18   42:getstatic       #396 <Field String mraidJS>
	//   19   45:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:pop             
		loadUrl(((StringBuilder) (obj)).toString());
	//   21   49:aload_0         
	//   22   50:aload_3         
	//   23   51:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   24   54:invokevirtual   #414 <Method void loadUrl(String)>
		if(madvertisead.isLoaddableViaMarkup())
	//*  25   57:aload_1         
	//*  26   58:invokevirtual   #420 <Method boolean MadvertiseAd.isLoaddableViaMarkup()>
	//*  27   61:ifeq            91
		{
			MadvertiseUtil.logMessage(((String) (null)), 4, "loading html Ad via markup");
	//   28   64:aconst_null     
	//   29   65:iconst_4        
	//   30   66:ldc2            #422 <String "loading html Ad via markup">
	//   31   69:invokestatic    #164 <Method void MadvertiseUtil.logMessage(String, int, String)>
			loadDataWithBaseURL("http://www.madvertise.com", madvertisead.getMarkup(), "text/html", "utf-8", ((String) (null)));
	//   32   72:aload_0         
	//   33   73:ldc2            #424 <String "http://www.madvertise.com">
	//   34   76:aload_1         
	//   35   77:invokevirtual   #427 <Method String MadvertiseAd.getMarkup()>
	//   36   80:ldc2            #429 <String "text/html">
	//   37   83:ldc2            #431 <String "utf-8">
	//   38   86:aconst_null     
	//   39   87:invokevirtual   #435 <Method void loadDataWithBaseURL(String, String, String, String, String)>
			return;
	//   40   90:return          
		}
		obj = ((Object) (madvertisead.getBannerUrl()));
	//   41   91:aload_1         
	//   42   92:invokevirtual   #438 <Method String MadvertiseAd.getBannerUrl()>
	//   43   95:astore_3        
		madvertisead = ((MadvertiseAd) (new StringBuilder()));
	//   44   96:new             #139 <Class StringBuilder>
	//   45   99:dup             
	//   46  100:invokespecial   #142 <Method void StringBuilder()>
	//   47  103:astore_1        
		((StringBuilder) (madvertisead)).append("loading html Ad: ");
	//   48  104:aload_1         
	//   49  105:ldc2            #440 <String "loading html Ad: ">
	//   50  108:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   51  111:pop             
		((StringBuilder) (madvertisead)).append(((String) (obj)));
	//   52  112:aload_1         
	//   53  113:aload_3         
	//   54  114:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   55  117:pop             
		MadvertiseUtil.logMessage(((String) (null)), 4, ((StringBuilder) (madvertisead)).toString());
	//   56  118:aconst_null     
	//   57  119:iconst_4        
	//   58  120:aload_1         
	//   59  121:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   60  124:invokestatic    #164 <Method void MadvertiseUtil.logMessage(String, int, String)>
		if(((String) (obj)).endsWith(".js"))
	//*  61  127:aload_3         
	//*  62  128:ldc2            #442 <String ".js">
	//*  63  131:invokevirtual   #446 <Method boolean String.endsWith(String)>
	//*  64  134:ifeq            218
		{
			int i = ((String) (obj)).lastIndexOf("/");
	//   65  137:aload_3         
	//   66  138:ldc2            #448 <String "/">
	//   67  141:invokevirtual   #452 <Method int String.lastIndexOf(String)>
	//   68  144:istore_2        
			madvertisead = ((MadvertiseAd) (((String) (obj)).substring(i, ((String) (obj)).length() - 1)));
	//   69  145:aload_3         
	//   70  146:iload_2         
	//   71  147:aload_3         
	//   72  148:invokevirtual   #455 <Method int String.length()>
	//   73  151:iconst_1        
	//   74  152:isub            
	//   75  153:invokevirtual   #459 <Method String String.substring(int, int)>
	//   76  156:astore_1        
			obj = ((Object) (((String) (obj)).substring(0, i - 1)));
	//   77  157:aload_3         
	//   78  158:iconst_0        
	//   79  159:iload_2         
	//   80  160:iconst_1        
	//   81  161:isub            
	//   82  162:invokevirtual   #459 <Method String String.substring(int, int)>
	//   83  165:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   84  166:new             #139 <Class StringBuilder>
	//   85  169:dup             
	//   86  170:invokespecial   #142 <Method void StringBuilder()>
	//   87  173:astore          4
			stringbuilder.append("<html><head><script type=\"text/javascript\" src=\"");
	//   88  175:aload           4
	//   89  177:ldc2            #461 <String "<html><head><script type=\"text/javascript\" src=\"">
	//   90  180:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   91  183:pop             
			stringbuilder.append(((String) (madvertisead)));
	//   92  184:aload           4
	//   93  186:aload_1         
	//   94  187:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   95  190:pop             
			stringbuilder.append("\"/></head><body>MRAID Ad</body></html>");
	//   96  191:aload           4
	//   97  193:ldc2            #463 <String "\"/></head><body>MRAID Ad</body></html>">
	//   98  196:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   99  199:pop             
			loadDataWithBaseURL(((String) (obj)), stringbuilder.toString(), "text/html", "utf-8", ((String) (null)));
	//  100  200:aload_0         
	//  101  201:aload_3         
	//  102  202:aload           4
	//  103  204:invokevirtual   #158 <Method String StringBuilder.toString()>
	//  104  207:ldc2            #429 <String "text/html">
	//  105  210:ldc2            #431 <String "utf-8">
	//  106  213:aconst_null     
	//  107  214:invokevirtual   #435 <Method void loadDataWithBaseURL(String, String, String, String, String)>
			return;
	//  108  217:return          
		} else
		{
			loadUrl(((String) (obj)));
	//  109  218:aload_0         
	//  110  219:aload_3         
	//  111  220:invokevirtual   #414 <Method void loadUrl(String)>
			return;
	//  112  223:return          
		}
	}

	public void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #139 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #142 <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append("Loading url now: ");
	//    4    9:aload           6
	//    5   11:ldc2            #465 <String "Loading url now: ">
	//    6   14:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:pop             
		stringbuilder.append(s);
	//    8   18:aload           6
	//    9   20:aload_1         
	//   10   21:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		stringbuilder.append(" with data: ");
	//   12   25:aload           6
	//   13   27:ldc2            #467 <String " with data: ">
	//   14   30:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
		stringbuilder.append(s1);
	//   16   34:aload           6
	//   17   36:aload_2         
	//   18   37:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
		MadvertiseUtil.logMessage(((String) (null)), 4, stringbuilder.toString());
	//   20   41:aconst_null     
	//   21   42:iconst_4        
	//   22   43:aload           6
	//   23   45:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   24   48:invokestatic    #164 <Method void MadvertiseUtil.logMessage(String, int, String)>
		super.loadDataWithBaseURL(s, s1, s2, s3, s4);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:aload_2         
	//   28   54:aload_3         
	//   29   55:aload           4
	//   30   57:aload           5
	//   31   59:invokespecial   #468 <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
	//   32   62:return          
	}

	public void loadUrl(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #139 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #142 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Loading url now: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #465 <String "Loading url now: ">
	//    6   12:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(s);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		MadvertiseUtil.logMessage(((String) (null)), 4, stringbuilder.toString());
	//   12   22:aconst_null     
	//   13   23:iconst_4        
	//   14   24:aload_2         
	//   15   25:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   16   28:invokestatic    #164 <Method void MadvertiseUtil.logMessage(String, int, String)>
		super.loadUrl(s);
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokespecial   #469 <Method void WebView.loadUrl(String)>
	//   20   36:return          
	}

	protected void onAnimationEnd()
	{
		super.onAnimationEnd();
	//    0    0:aload_0         
	//    1    1:invokespecial   #472 <Method void WebView.onAnimationEnd()>
		MadvertiseView.AnimationEndListener animationendlistener = mAnimationEndListener;
	//    2    4:aload_0         
	//    3    5:getfield        #187 <Field MadvertiseView$AnimationEndListener mAnimationEndListener>
	//    4    8:astore_1        
		if(animationendlistener != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
			animationendlistener.onAnimationEnd();
	//    7   13:aload_1         
	//    8   14:invokeinterface #475 <Method void MadvertiseView$AnimationEndListener.onAnimationEnd()>
	//    9   19:return          
	}

	protected void onAttachedToWindow()
	{
		mOnScreen = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #285 <Field boolean mOnScreen>
		checkViewable();
	//    3    5:aload_0         
	//    4    6:invokespecial   #277 <Method void checkViewable()>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		mOnScreen = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #285 <Field boolean mOnScreen>
		checkViewable();
	//    3    5:aload_0         
	//    4    6:invokespecial   #277 <Method void checkViewable()>
	//    5    9:return          
	}

	public void setPlacementType(int i)
	{
		if(i != 1 && i != 0)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpeq          18
	//*   3    5:iload_1         
	//*   4    6:ifeq            18
		{
			MadvertiseUtil.logMessage(((String) (null)), 5, "Placement type must be one of MadvertiseUtil.PLACEMENT_TYPE_INLINE or MadvertiseUtil.PLACEMENT_TYPE_INTERSTITIAL");
	//    5    9:aconst_null     
	//    6   10:iconst_5        
	//    7   11:ldc2            #480 <String "Placement type must be one of MadvertiseUtil.PLACEMENT_TYPE_INLINE or MadvertiseUtil.PLACEMENT_TYPE_INTERSTITIAL">
	//    8   14:invokestatic    #164 <Method void MadvertiseUtil.logMessage(String, int, String)>
			return;
	//    9   17:return          
		} else
		{
			mPlacementType = i;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:putfield        #201 <Field int mPlacementType>
			StringBuilder stringbuilder = new StringBuilder();
	//   13   23:new             #139 <Class StringBuilder>
	//   14   26:dup             
	//   15   27:invokespecial   #142 <Method void StringBuilder()>
	//   16   30:astore_2        
			stringbuilder.append("mraid.setPlacementType(");
	//   17   31:aload_2         
	//   18   32:ldc2            #482 <String "mraid.setPlacementType(">
	//   19   35:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			stringbuilder.append(mPlacementType);
	//   21   39:aload_2         
	//   22   40:aload_0         
	//   23   41:getfield        #201 <Field int mPlacementType>
	//   24   44:invokevirtual   #485 <Method StringBuilder StringBuilder.append(int)>
	//   25   47:pop             
			stringbuilder.append(");");
	//   26   48:aload_2         
	//   27   49:ldc2            #262 <String ");">
	//   28   52:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   29   55:pop             
			injectJs(stringbuilder.toString());
	//   30   56:aload_0         
	//   31   57:aload_2         
	//   32   58:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   33   61:invokevirtual   #266 <Method void injectJs(String)>
			return;
	//   34   64:return          
		}
	}

	protected void setState(int i)
	{
		mState = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #293 <Field int mState>
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #139 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #142 <Method void StringBuilder()>
	//    6   12:astore_2        
		stringbuilder.append("mraid.setState(");
	//    7   13:aload_2         
	//    8   14:ldc2            #487 <String "mraid.setState(">
	//    9   17:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append(i);
	//   11   21:aload_2         
	//   12   22:iload_1         
	//   13   23:invokevirtual   #485 <Method StringBuilder StringBuilder.append(int)>
	//   14   26:pop             
		stringbuilder.append(");");
	//   15   27:aload_2         
	//   16   28:ldc2            #262 <String ");">
	//   17   31:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		injectJs(stringbuilder.toString());
	//   19   35:aload_0         
	//   20   36:aload_2         
	//   21   37:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   22   40:invokevirtual   #266 <Method void injectJs(String)>
	//   23   43:return          
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #488 <Method void WebView.setVisibility(int)>
		checkViewable();
	//    3    5:aload_0         
	//    4    6:invokespecial   #277 <Method void checkViewable()>
	//    5    9:return          
	}

	private static final int CLOSE_BUTTON_SIZE = 50;
	protected static final int STATE_DEFAULT = 2;
	protected static final int STATE_EXPANDED = 3;
	protected static final int STATE_HIDDEN = 1;
	protected static final int STATE_LOADING = 0;
	private static String mraidJS;
	private MadvertiseView.AnimationEndListener mAnimationEndListener;
	Object mBridge = new Object() {

		public void close()
		{
			MadvertiseUtil.logMessage(((String) (null)), 4, "Called close from Ad with.");
		//    0    0:aconst_null     
		//    1    1:iconst_4        
		//    2    2:ldc1            #27  <String "Called close from Ad with.">
		//    3    4:invokestatic    #33  <Method void MadvertiseUtil.logMessage(String, int, String)>
			post(new Runnable() {

				public void run()
				{
					close();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MadvertiseMraidView$3 this$1>
				//    2    4:getfield        #25  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
				//    3    7:invokestatic    #31  <Method void MadvertiseMraidView.access$900(MadvertiseMraidView)>
				//    4   10:return          
				}

				final _cls3 this$1;

			
			{
				this$1 = _cls3.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MadvertiseMraidView$3 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
		//    4    7:aload_0         
		//    5    8:getfield        #20  <Field MadvertiseMraidView this$0>
		//    6   11:new             #12  <Class MadvertiseMraidView$3$3>
		//    7   14:dup             
		//    8   15:aload_0         
		//    9   16:invokespecial   #36  <Method void MadvertiseMraidView$3$3(MadvertiseMraidView$3)>
		//   10   19:invokevirtual   #40  <Method boolean MadvertiseMraidView.post(Runnable)>
		//   11   22:pop             
		//   12   23:return          
		}

		public void expand()
		{
			MadvertiseUtil.logMessage(((String) (null)), 4, "Called expand from Ad or Java.");
		//    0    0:aconst_null     
		//    1    1:iconst_4        
		//    2    2:ldc1            #43  <String "Called expand from Ad or Java.">
		//    3    4:invokestatic    #33  <Method void MadvertiseUtil.logMessage(String, int, String)>
			post(new Runnable() {

				public void run()
				{
					resize(mExpandProperties.width, mExpandProperties.height);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MadvertiseMraidView$3 this$1>
				//    2    4:getfield        #25  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
				//    3    7:aload_0         
				//    4    8:getfield        #17  <Field MadvertiseMraidView$3 this$1>
				//    5   11:getfield        #25  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
				//    6   14:invokestatic    #31  <Method MadvertiseMraidView$ExpandProperties MadvertiseMraidView.access$600(MadvertiseMraidView)>
				//    7   17:getfield        #37  <Field int MadvertiseMraidView$ExpandProperties.width>
				//    8   20:aload_0         
				//    9   21:getfield        #17  <Field MadvertiseMraidView$3 this$1>
				//   10   24:getfield        #25  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
				//   11   27:invokestatic    #31  <Method MadvertiseMraidView$ExpandProperties MadvertiseMraidView.access$600(MadvertiseMraidView)>
				//   12   30:getfield        #40  <Field int MadvertiseMraidView$ExpandProperties.height>
				//   13   33:invokestatic    #44  <Method void MadvertiseMraidView.access$700(MadvertiseMraidView, int, int)>
				//   14   36:return          
				}

				final _cls3 this$1;

			
			{
				this$1 = _cls3.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MadvertiseMraidView$3 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
		//    4    7:aload_0         
		//    5    8:getfield        #20  <Field MadvertiseMraidView this$0>
		//    6   11:new             #8   <Class MadvertiseMraidView$3$1>
		//    7   14:dup             
		//    8   15:aload_0         
		//    9   16:invokespecial   #44  <Method void MadvertiseMraidView$3$1(MadvertiseMraidView$3)>
		//   10   19:invokevirtual   #40  <Method boolean MadvertiseMraidView.post(Runnable)>
		//   11   22:pop             
			setState(3);
		//   12   23:aload_0         
		//   13   24:getfield        #20  <Field MadvertiseMraidView this$0>
		//   14   27:iconst_3        
		//   15   28:invokevirtual   #48  <Method void MadvertiseMraidView.setState(int)>
			if(mListener != null)
		//*  16   31:aload_0         
		//*  17   32:getfield        #20  <Field MadvertiseMraidView this$0>
		//*  18   35:invokestatic    #52  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseMraidView.access$000(MadvertiseMraidView)>
		//*  19   38:ifnull          53
				mListener.onApplicationPause();
		//   20   41:aload_0         
		//   21   42:getfield        #20  <Field MadvertiseMraidView this$0>
		//   22   45:invokestatic    #52  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseMraidView.access$000(MadvertiseMraidView)>
		//   23   48:invokeinterface #57  <Method void MadvertiseView$MadvertiseViewCallbackListener.onApplicationPause()>
			if(mMadView != null)
		//*  24   53:aload_0         
		//*  25   54:getfield        #20  <Field MadvertiseMraidView this$0>
		//*  26   57:invokestatic    #61  <Method MadvertiseView MadvertiseMraidView.access$800(MadvertiseMraidView)>
		//*  27   60:ifnull          74
				mMadView.setFetchingAdsEnabled(false);
		//   28   63:aload_0         
		//   29   64:getfield        #20  <Field MadvertiseMraidView this$0>
		//   30   67:invokestatic    #61  <Method MadvertiseView MadvertiseMraidView.access$800(MadvertiseMraidView)>
		//   31   70:iconst_0        
		//   32   71:invokevirtual   #67  <Method void MadvertiseView.setFetchingAdsEnabled(boolean)>
		//   33   74:return          
		}

		public void expand(String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #70  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #71  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Called expand from Ad with : ");
		//    4    8:aload_2         
		//    5    9:ldc1            #73  <String "Called expand from Ad with : ">
		//    6   11:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(s);
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			MadvertiseUtil.logMessage(((String) (null)), 4, stringbuilder.toString());
		//   12   21:aconst_null     
		//   13   22:iconst_4        
		//   14   23:aload_2         
		//   15   24:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   16   27:invokestatic    #33  <Method void MadvertiseUtil.logMessage(String, int, String)>
			expand();
		//   17   30:aload_0         
		//   18   31:invokevirtual   #83  <Method void expand()>
			post(((_cls2) (s)). new Runnable() {

				public void run()
				{
					loadUrl(url);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field MadvertiseMraidView$3 this$1>
				//    2    4:getfield        #30  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field String val$url>
				//    5   11:invokevirtual   #35  <Method void MadvertiseMraidView.loadUrl(String)>
				//    6   14:return          
				}

				final _cls3 this$1;
				final String val$url;

			
			{
				this$1 = final__pcls3;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MadvertiseMraidView$3 this$1>
				url = String.this;
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
		//   19   34:aload_0         
		//   20   35:getfield        #20  <Field MadvertiseMraidView this$0>
		//   21   38:new             #10  <Class MadvertiseMraidView$3$2>
		//   22   41:dup             
		//   23   42:aload_0         
		//   24   43:aload_1         
		//   25   44:invokespecial   #86  <Method void MadvertiseMraidView$3$2(MadvertiseMraidView$3, String)>
		//   26   47:invokevirtual   #40  <Method boolean MadvertiseMraidView.post(Runnable)>
		//   27   50:pop             
		//   28   51:return          
		}

		public void logMessage(String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #70  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #71  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Called logMessage from Ad with : ");
		//    4    8:aload_2         
		//    5    9:ldc1            #88  <String "Called logMessage from Ad with : ">
		//    6   11:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(s);
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			MadvertiseUtil.logMessage(((String) (null)), 4, stringbuilder.toString());
		//   12   21:aconst_null     
		//   13   22:iconst_4        
		//   14   23:aload_2         
		//   15   24:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   16   27:invokestatic    #33  <Method void MadvertiseUtil.logMessage(String, int, String)>
		//   17   30:return          
		}

		public void open(String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #70  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #71  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Called open from Ad with : ");
		//    4    8:aload_2         
		//    5    9:ldc1            #91  <String "Called open from Ad with : ">
		//    6   11:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(s);
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			MadvertiseUtil.logMessage(((String) (null)), 4, stringbuilder.toString());
		//   12   21:aconst_null     
		//   13   22:iconst_4        
		//   14   23:aload_2         
		//   15   24:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   16   27:invokestatic    #33  <Method void MadvertiseUtil.logMessage(String, int, String)>
			post(((_cls4) (s)). new Runnable() {

				public void run()
				{
					if(mListener != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #19  <Field MadvertiseMraidView$3 this$1>
				//*   2    4:getfield        #30  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
				//*   3    7:invokestatic    #36  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseMraidView.access$000(MadvertiseMraidView)>
				//*   4   10:ifnull          28
						mListener.onAdClicked();
				//    5   13:aload_0         
				//    6   14:getfield        #19  <Field MadvertiseMraidView$3 this$1>
				//    7   17:getfield        #30  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
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
				//   17   42:getfield        #19  <Field MadvertiseMraidView$3 this$1>
				//   18   45:getfield        #30  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
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
				//   29   68:getfield        #19  <Field MadvertiseMraidView$3 this$1>
				//   30   71:getfield        #30  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
				//   31   74:invokevirtual   #55  <Method Context MadvertiseMraidView.getContext()>
				//   32   77:aload_1         
				//   33   78:invokevirtual   #74  <Method void Context.startActivity(Intent)>
				//   34   81:return          
				}

				final _cls3 this$1;
				final String val$url;

			
			{
				this$1 = final__pcls3;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MadvertiseMraidView$3 this$1>
				url = String.this;
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
		//   17   30:aload_0         
		//   18   31:getfield        #20  <Field MadvertiseMraidView this$0>
		//   19   34:new             #14  <Class MadvertiseMraidView$3$4>
		//   20   37:dup             
		//   21   38:aload_0         
		//   22   39:aload_1         
		//   23   40:invokespecial   #92  <Method void MadvertiseMraidView$3$4(MadvertiseMraidView$3, String)>
		//   24   43:invokevirtual   #40  <Method boolean MadvertiseMraidView.post(Runnable)>
		//   25   46:pop             
		//   26   47:return          
		}

		public void setExpandProperties(String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #70  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #71  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Called setExpandProperties from Ad with : ");
		//    4    8:aload_2         
		//    5    9:ldc1            #95  <String "Called setExpandProperties from Ad with : ">
		//    6   11:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(s);
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			MadvertiseUtil.logMessage(((String) (null)), 4, stringbuilder.toString());
		//   12   21:aconst_null     
		//   13   22:iconst_4        
		//   14   23:aload_2         
		//   15   24:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   16   27:invokestatic    #33  <Method void MadvertiseUtil.logMessage(String, int, String)>
			mExpandProperties.readJson(s);
		//   17   30:aload_0         
		//   18   31:getfield        #20  <Field MadvertiseMraidView this$0>
		//   19   34:invokestatic    #99  <Method MadvertiseMraidView$ExpandProperties MadvertiseMraidView.access$600(MadvertiseMraidView)>
		//   20   37:aload_1         
		//   21   38:invokevirtual   #104 <Method void MadvertiseMraidView$ExpandProperties.readJson(String)>
		//   22   41:return          
		}

		final MadvertiseMraidView this$0;

			
			{
				this$0 = MadvertiseMraidView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MadvertiseMraidView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private ImageButton mCloseButton;
	private FrameLayout mExpandLayout;
	private ExpandProperties mExpandProperties;
	private int mIndex;
	private MadvertiseView.MadvertiseViewCallbackListener mListener;
	private Handler mLoadingCompletedHandler;
	private MadvertiseView mMadView;
	private boolean mOnScreen;
	private ViewGroup mOriginalParent;
	private int mPlacementType;
	private int mState;
	private VideoView mVideo;
	private boolean mViewable;


/*
	static MadvertiseView.MadvertiseViewCallbackListener access$000(MadvertiseMraidView madvertisemraidview)
	{
		return madvertisemraidview.mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field MadvertiseView$MadvertiseViewCallbackListener mListener>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(MadvertiseMraidView madvertisemraidview)
	{
		madvertisemraidview.checkReady();
	//    0    0:aload_0         
	//    1    1:invokespecial   #197 <Method void checkReady()>
		return;
	//    2    4:return          
	}

*/


/*
	static int access$200(MadvertiseMraidView madvertisemraidview)
	{
		return madvertisemraidview.mPlacementType;
	//    0    0:aload_0         
	//    1    1:getfield        #201 <Field int mPlacementType>
	//    2    4:ireturn         
	}

*/


/*
	static ImageButton access$300(MadvertiseMraidView madvertisemraidview)
	{
		return madvertisemraidview.mCloseButton;
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field ImageButton mCloseButton>
	//    2    4:areturn         
	}

*/


/*
	static ImageButton access$302(MadvertiseMraidView madvertisemraidview, ImageButton imagebutton)
	{
		madvertisemraidview.mCloseButton = imagebutton;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #205 <Field ImageButton mCloseButton>
		return imagebutton;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static ImageButton access$400(MadvertiseMraidView madvertisemraidview, ViewGroup viewgroup)
	{
		return madvertisemraidview.addCloseButtonToViewGroup(viewgroup);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #213 <Method ImageButton addCloseButtonToViewGroup(ViewGroup)>
	//    3    5:areturn         
	}

*/


/*
	static VideoView access$500(MadvertiseMraidView madvertisemraidview)
	{
		return madvertisemraidview.mVideo;
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field VideoView mVideo>
	//    2    4:areturn         
	}

*/


/*
	static VideoView access$502(MadvertiseMraidView madvertisemraidview, VideoView videoview)
	{
		madvertisemraidview.mVideo = videoview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #217 <Field VideoView mVideo>
		return videoview;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static ExpandProperties access$600(MadvertiseMraidView madvertisemraidview)
	{
		return madvertisemraidview.mExpandProperties;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field MadvertiseMraidView$ExpandProperties mExpandProperties>
	//    2    4:areturn         
	}

*/


/*
	static void access$700(MadvertiseMraidView madvertisemraidview, int i, int j)
	{
		madvertisemraidview.resize(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #226 <Method void resize(int, int)>
		return;
	//    4    6:return          
	}

*/


/*
	static MadvertiseView access$800(MadvertiseMraidView madvertisemraidview)
	{
		return madvertisemraidview.mMadView;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field MadvertiseView mMadView>
	//    2    4:areturn         
	}

*/


/*
	static void access$900(MadvertiseMraidView madvertisemraidview)
	{
		madvertisemraidview.close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #232 <Method void close()>
		return;
	//    2    4:return          
	}

*/
}
