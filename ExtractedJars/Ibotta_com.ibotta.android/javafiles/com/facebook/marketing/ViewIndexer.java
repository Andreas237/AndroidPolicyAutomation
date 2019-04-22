// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.marketing;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.*;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.facebook.*;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.marketing.internal.MarketingLogger;
import com.facebook.marketing.internal.MarketingUtils;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.*;
import org.json.*;

// Referenced classes of package com.facebook.marketing:
//			CodelessActivityLifecycleTracker

public class ViewIndexer
{
	private static class ScreenshotTaker
		implements Callable
	{

		public volatile Object call()
			throws Exception
		{
			return ((Object) (call()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #33  <Method String call()>
		//    2    4:areturn         
		}

		public String call()
			throws Exception
		{
			Object obj = ((Object) ((View)rootView.get()));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference rootView>
		//    2    4:invokevirtual   #37  <Method Object WeakReference.get()>
		//    3    7:checkcast       #39  <Class View>
		//    4   10:astore_2        
			if(obj != null && ((View) (obj)).getWidth() != 0 && ((View) (obj)).getHeight() != 0)
		//*   5   11:aload_2         
		//*   6   12:ifnull          87
		//*   7   15:aload_2         
		//*   8   16:invokevirtual   #43  <Method int View.getWidth()>
		//*   9   19:ifeq            87
		//*  10   22:aload_2         
		//*  11   23:invokevirtual   #46  <Method int View.getHeight()>
		//*  12   26:ifne            32
		//*  13   29:goto            87
			{
				Bitmap bitmap = Bitmap.createBitmap(((View) (obj)).getWidth(), ((View) (obj)).getHeight(), android.graphics.Bitmap.Config.RGB_565);
		//   14   32:aload_2         
		//   15   33:invokevirtual   #43  <Method int View.getWidth()>
		//   16   36:aload_2         
		//   17   37:invokevirtual   #46  <Method int View.getHeight()>
		//   18   40:getstatic       #52  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
		//   19   43:invokestatic    #58  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
		//   20   46:astore_1        
				((View) (obj)).draw(new Canvas(bitmap));
		//   21   47:aload_2         
		//   22   48:new             #60  <Class Canvas>
		//   23   51:dup             
		//   24   52:aload_1         
		//   25   53:invokespecial   #63  <Method void Canvas(Bitmap)>
		//   26   56:invokevirtual   #67  <Method void View.draw(Canvas)>
				obj = ((Object) (new ByteArrayOutputStream()));
		//   27   59:new             #69  <Class ByteArrayOutputStream>
		//   28   62:dup             
		//   29   63:invokespecial   #70  <Method void ByteArrayOutputStream()>
		//   30   66:astore_2        
				bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 10, ((java.io.OutputStream) (obj)));
		//   31   67:aload_1         
		//   32   68:getstatic       #76  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.JPEG>
		//   33   71:bipush          10
		//   34   73:aload_2         
		//   35   74:invokevirtual   #80  <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
		//   36   77:pop             
				return Base64.encodeToString(((ByteArrayOutputStream) (obj)).toByteArray(), 2);
		//   37   78:aload_2         
		//   38   79:invokevirtual   #84  <Method byte[] ByteArrayOutputStream.toByteArray()>
		//   39   82:iconst_2        
		//   40   83:invokestatic    #90  <Method String Base64.encodeToString(byte[], int)>
		//   41   86:areturn         
			} else
			{
				return "";
		//   42   87:ldc1            #92  <String "">
		//   43   89:areturn         
			}
		}

		private WeakReference rootView;

		public ScreenshotTaker(View view)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			rootView = new WeakReference(((Object) (view)));
		//    2    4:aload_0         
		//    3    5:new             #20  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #23  <Method void WeakReference(Object)>
		//    7   13:putfield        #25  <Field WeakReference rootView>
		//    8   16:return          
		}
	}


	public ViewIndexer(Activity activity1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		activity = activity1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #43  <Field Activity activity>
		previousDigest = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #45  <Field String previousDigest>
	//    8   14:aload_0         
	//    9   15:new             #47  <Class Handler>
	//   10   18:dup             
	//   11   19:invokestatic    #53  <Method Looper Looper.getMainLooper()>
	//   12   22:invokespecial   #56  <Method void Handler(Looper)>
	//   13   25:putfield        #58  <Field Handler uiThreadHandler>
	//   14   28:aload_0         
	//   15   29:new             #60  <Class MarketingLogger>
	//   16   32:dup             
	//   17   33:invokestatic    #66  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   18   36:invokestatic    #69  <Method String FacebookSdk.getApplicationId()>
	//   19   39:invokespecial   #72  <Method void MarketingLogger(android.content.Context, String)>
	//   20   42:putfield        #74  <Field MarketingLogger logger>
	//   21   45:return          
	}

	private static GraphRequest buildAppIndexingRequest(String s, AccessToken accesstoken, String s1)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		GraphRequest graphrequest = GraphRequest.newPostRequest(accesstoken, String.format(Locale.US, "%s/app_indexing", new Object[] {
			s1
		}), ((JSONObject) (null)), ((com.facebook.GraphRequest.Callback) (null)));
	//    4    6:aload_1         
	//    5    7:getstatic       #109 <Field Locale Locale.US>
	//    6   10:ldc1            #111 <String "%s/app_indexing">
	//    7   12:iconst_1        
	//    8   13:anewarray       Object[]
	//    9   16:dup             
	//   10   17:iconst_0        
	//   11   18:aload_2         
	//   12   19:aastore         
	//   13   20:invokestatic    #117 <Method String String.format(Locale, String, Object[])>
	//   14   23:aconst_null     
	//   15   24:aconst_null     
	//   16   25:invokestatic    #123 <Method GraphRequest GraphRequest.newPostRequest(AccessToken, String, JSONObject, com.facebook.GraphRequest$Callback)>
	//   17   28:astore_3        
		s1 = ((String) (graphrequest.getParameters()));
	//   18   29:aload_3         
	//   19   30:invokevirtual   #127 <Method Bundle GraphRequest.getParameters()>
	//   20   33:astore_2        
		accesstoken = ((AccessToken) (s1));
	//   21   34:aload_2         
	//   22   35:astore_1        
		if(s1 == null)
	//*  23   36:aload_2         
	//*  24   37:ifnonnull       48
			accesstoken = ((AccessToken) (new Bundle()));
	//   25   40:new             #129 <Class Bundle>
	//   26   43:dup             
	//   27   44:invokespecial   #130 <Method void Bundle()>
	//   28   47:astore_1        
		((Bundle) (accesstoken)).putString("tree", s);
	//   29   48:aload_1         
	//   30   49:ldc1            #132 <String "tree">
	//   31   51:aload_0         
	//   32   52:invokevirtual   #136 <Method void Bundle.putString(String, String)>
		((Bundle) (accesstoken)).putString("app_version", MarketingUtils.getAppVersion());
	//   33   55:aload_1         
	//   34   56:ldc1            #138 <String "app_version">
	//   35   58:invokestatic    #143 <Method String MarketingUtils.getAppVersion()>
	//   36   61:invokevirtual   #136 <Method void Bundle.putString(String, String)>
		((Bundle) (accesstoken)).putString("platform", "android");
	//   37   64:aload_1         
	//   38   65:ldc1            #145 <String "platform">
	//   39   67:ldc1            #147 <String "android">
	//   40   69:invokevirtual   #136 <Method void Bundle.putString(String, String)>
		((Bundle) (accesstoken)).putString("device_session_id", CodelessActivityLifecycleTracker.getCurrentDeviceSessionID());
	//   41   72:aload_1         
	//   42   73:ldc1            #149 <String "device_session_id">
	//   43   75:invokestatic    #154 <Method String CodelessActivityLifecycleTracker.getCurrentDeviceSessionID()>
	//   44   78:invokevirtual   #136 <Method void Bundle.putString(String, String)>
		graphrequest.setParameters(((Bundle) (accesstoken)));
	//   45   81:aload_3         
	//   46   82:aload_1         
	//   47   83:invokevirtual   #158 <Method void GraphRequest.setParameters(Bundle)>
		graphrequest.setCallback(new com.facebook.GraphRequest.Callback() {

			public void onCompleted(GraphResponse graphresponse)
			{
				Logger.log(LoggingBehavior.APP_EVENTS, ViewIndexer.TAG, "App index sent to FB!");
			//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
			//    1    3:invokestatic    #28  <Method String ViewIndexer.access$200()>
			//    2    6:ldc1            #30  <String "App index sent to FB!">
			//    3    8:invokestatic    #36  <Method void Logger.log(LoggingBehavior, String, String)>
			//    4   11:return          
			}

		}
);
	//   48   86:aload_3         
	//   49   87:new             #12  <Class ViewIndexer$4>
	//   50   90:dup             
	//   51   91:invokespecial   #159 <Method void ViewIndexer$4()>
	//   52   94:invokevirtual   #163 <Method void GraphRequest.setCallback(com.facebook.GraphRequest$Callback)>
		return graphrequest;
	//   53   97:aload_3         
	//   54   98:areturn         
	}

	private void sendToServer(final String tree)
	{
		FacebookSdk.getExecutor().execute(new Runnable() {

			public void run()
			{
				String s;
				Object obj;
				Object obj1;
				obj1 = ((Object) (FacebookSdk.getApplicationId()));
			//    0    0:invokestatic    #34  <Method String FacebookSdk.getApplicationId()>
			//    1    3:astore_3        
				s = ((Object) (activity)).getClass().getCanonicalName();
			//    2    4:aload_0         
			//    3    5:getfield        #19  <Field ViewIndexer this$0>
			//    4    8:invokestatic    #38  <Method Activity ViewIndexer.access$000(ViewIndexer)>
			//    5   11:invokevirtual   #42  <Method Class Object.getClass()>
			//    6   14:invokevirtual   #47  <Method String Class.getCanonicalName()>
			//    7   17:astore_1        
				obj = ((Object) (Utility.md5hash(tree)));
			//    8   18:aload_0         
			//    9   19:getfield        #21  <Field String val$tree>
			//   10   22:invokestatic    #53  <Method String Utility.md5hash(String)>
			//   11   25:astore_2        
				AccessToken accesstoken = AccessToken.getCurrentAccessToken();
			//   12   26:invokestatic    #59  <Method AccessToken AccessToken.getCurrentAccessToken()>
			//   13   29:astore          4
				if(obj != null && ((String) (obj)).equals(((Object) (previousDigest))))
			//*  14   31:aload_2         
			//*  15   32:ifnull          50
			//*  16   35:aload_2         
			//*  17   36:aload_0         
			//*  18   37:getfield        #19  <Field ViewIndexer this$0>
			//*  19   40:invokestatic    #63  <Method String ViewIndexer.access$500(ViewIndexer)>
			//*  20   43:invokevirtual   #69  <Method boolean String.equals(Object)>
			//*  21   46:ifeq            50
					return;
			//   22   49:return          
				logger.logIndexingStart(s);
			//   23   50:aload_0         
			//   24   51:getfield        #19  <Field ViewIndexer this$0>
			//   25   54:invokestatic    #73  <Method MarketingLogger ViewIndexer.access$600(ViewIndexer)>
			//   26   57:aload_1         
			//   27   58:invokevirtual   #78  <Method void MarketingLogger.logIndexingStart(String)>
				obj1 = ((Object) (ViewIndexer.buildAppIndexingRequest(tree, accesstoken, ((String) (obj1)))));
			//   28   61:aload_0         
			//   29   62:getfield        #21  <Field String val$tree>
			//   30   65:aload           4
			//   31   67:aload_3         
			//   32   68:invokestatic    #82  <Method GraphRequest ViewIndexer.access$700(String, AccessToken, String)>
			//   33   71:astore_3        
				if(obj1 == null)
					break MISSING_BLOCK_LABEL_218;
			//   34   72:aload_3         
			//   35   73:ifnull          218
				obj1 = ((Object) (((GraphRequest) (obj1)).executeAndWait()));
			//   36   76:aload_3         
			//   37   77:invokevirtual   #88  <Method GraphResponse GraphRequest.executeAndWait()>
			//   38   80:astore_3        
				JSONObject jsonobject = ((GraphResponse) (obj1)).getJSONObject();
			//   39   81:aload_3         
			//   40   82:invokevirtual   #94  <Method JSONObject GraphResponse.getJSONObject()>
			//   41   85:astore          4
				if(jsonobject != null)
			//*  42   87:aload           4
			//*  43   89:ifnull          169
				{
					try
					{
						if(jsonobject.has("success") && jsonobject.getString("success") == "true")
			//*  44   92:aload           4
			//*  45   94:ldc1            #96  <String "success">
			//*  46   96:invokevirtual   #102 <Method boolean JSONObject.has(String)>
			//*  47   99:ifeq            145
			//*  48  102:aload           4
			//*  49  104:ldc1            #96  <String "success">
			//*  50  106:invokevirtual   #105 <Method String JSONObject.getString(String)>
			//*  51  109:ldc1            #107 <String "true">
			//*  52  111:if_acmpne       145
						{
							Logger.log(LoggingBehavior.APP_EVENTS, ViewIndexer.TAG, "Successfully send UI component tree to server");
			//   53  114:getstatic       #113 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
			//   54  117:invokestatic    #116 <Method String ViewIndexer.access$200()>
			//   55  120:ldc1            #118 <String "Successfully send UI component tree to server">
			//   56  122:invokestatic    #124 <Method void Logger.log(LoggingBehavior, String, String)>
							previousDigest = ((String) (obj));
			//   57  125:aload_0         
			//   58  126:getfield        #19  <Field ViewIndexer this$0>
			//   59  129:aload_2         
			//   60  130:invokestatic    #128 <Method String ViewIndexer.access$502(ViewIndexer, String)>
			//   61  133:pop             
							logger.logIndexingComplete(s);
			//   62  134:aload_0         
			//   63  135:getfield        #19  <Field ViewIndexer this$0>
			//   64  138:invokestatic    #73  <Method MarketingLogger ViewIndexer.access$600(ViewIndexer)>
			//   65  141:aload_1         
			//   66  142:invokevirtual   #131 <Method void MarketingLogger.logIndexingComplete(String)>
						}
						if(jsonobject.has("is_app_indexing_enabled"))
			//*  67  145:aload           4
			//*  68  147:ldc1            #133 <String "is_app_indexing_enabled">
			//*  69  149:invokevirtual   #102 <Method boolean JSONObject.has(String)>
			//*  70  152:ifeq            218
						{
							CodelessActivityLifecycleTracker.updateAppIndexing(Boolean.valueOf(jsonobject.getBoolean("is_app_indexing_enabled")));
			//   71  155:aload           4
			//   72  157:ldc1            #133 <String "is_app_indexing_enabled">
			//   73  159:invokevirtual   #136 <Method boolean JSONObject.getBoolean(String)>
			//   74  162:invokestatic    #142 <Method Boolean Boolean.valueOf(boolean)>
			//   75  165:invokestatic    #148 <Method void CodelessActivityLifecycleTracker.updateAppIndexing(Boolean)>
							return;
			//   76  168:return          
						}
					}
			//*  77  169:invokestatic    #116 <Method String ViewIndexer.access$200()>
			//*  78  172:astore_1        
			//*  79  173:new             #150 <Class StringBuilder>
			//*  80  176:dup             
			//*  81  177:invokespecial   #151 <Method void StringBuilder()>
			//*  82  180:astore_2        
			//*  83  181:aload_2         
			//*  84  182:ldc1            #153 <String "Error sending UI component tree to Facebook: ">
			//*  85  184:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
			//*  86  187:pop             
			//*  87  188:aload_2         
			//*  88  189:aload_3         
			//*  89  190:invokevirtual   #161 <Method com.facebook.FacebookRequestError GraphResponse.getError()>
			//*  90  193:invokevirtual   #164 <Method StringBuilder StringBuilder.append(Object)>
			//*  91  196:pop             
			//*  92  197:aload_1         
			//*  93  198:aload_2         
			//*  94  199:invokevirtual   #167 <Method String StringBuilder.toString()>
			//*  95  202:invokestatic    #173 <Method int Log.e(String, String)>
			//*  96  205:pop             
			//*  97  206:return          
					catch(JSONException jsonexception)
			//*  98  207:astore_1        
					{
						Log.e(ViewIndexer.TAG, "Error decoding server response.", ((Throwable) (jsonexception)));
			//   99  208:invokestatic    #116 <Method String ViewIndexer.access$200()>
			//  100  211:ldc1            #175 <String "Error decoding server response.">
			//  101  213:aload_1         
			//  102  214:invokestatic    #178 <Method int Log.e(String, String, Throwable)>
			//  103  217:pop             
					}
					break MISSING_BLOCK_LABEL_218;
				}
				s = ViewIndexer.TAG;
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("Error sending UI component tree to Facebook: ");
				((StringBuilder) (obj)).append(((Object) (((GraphResponse) (obj1)).getError())));
				Log.e(s, ((StringBuilder) (obj)).toString());
				return;
			//  104  218:return          
			}

			final ViewIndexer this$0;
			final String val$tree;

			
			{
				this$0 = ViewIndexer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewIndexer this$0>
				tree = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$tree>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:invokestatic    #168 <Method Executor FacebookSdk.getExecutor()>
	//    1    3:new             #10  <Class ViewIndexer$3>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #170 <Method void ViewIndexer$3(ViewIndexer, String)>
	//    6   12:invokeinterface #176 <Method void Executor.execute(Runnable)>
	//    7   17:return          
	}

	public void schedule()
	{
		final String activityName = ((Object) (activity)).getClass().getSimpleName();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Activity activity>
	//    2    4:invokevirtual   #181 <Method Class Object.getClass()>
	//    3    7:invokevirtual   #184 <Method String Class.getSimpleName()>
	//    4   10:astore_1        
		FacebookSdk.getApplicationId();
	//    5   11:invokestatic    #69  <Method String FacebookSdk.getApplicationId()>
	//    6   14:pop             
		final TimerTask indexingTask = new TimerTask() {

			public void run()
			{
				Object obj;
				View view;
				JSONObject jsonobject;
				try
				{
					view = activity.getWindow().getDecorView().getRootView();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field ViewIndexer this$0>
			//    2    4:invokestatic    #32  <Method Activity ViewIndexer.access$000(ViewIndexer)>
			//    3    7:invokevirtual   #38  <Method Window Activity.getWindow()>
			//    4   10:invokevirtual   #44  <Method View Window.getDecorView()>
			//    5   13:invokevirtual   #49  <Method View View.getRootView()>
			//    6   16:astore_2        
					if(!CodelessActivityLifecycleTracker.getIsAppIndexingEnabled())
			//*   7   17:invokestatic    #55  <Method boolean CodelessActivityLifecycleTracker.getIsAppIndexingEnabled()>
			//*   8   20:ifne            24
						return;
			//    9   23:return          
				}
			//*  10   24:new             #57  <Class FutureTask>
			//*  11   27:dup             
			//*  12   28:new             #59  <Class ViewIndexer$ScreenshotTaker>
			//*  13   31:dup             
			//*  14   32:aload_2         
			//*  15   33:invokespecial   #62  <Method void ViewIndexer$ScreenshotTaker(View)>
			//*  16   36:invokespecial   #65  <Method void FutureTask(Callable)>
			//*  17   39:astore_1        
			//*  18   40:aload_0         
			//*  19   41:getfield        #18  <Field ViewIndexer this$0>
			//*  20   44:invokestatic    #69  <Method Handler ViewIndexer.access$100(ViewIndexer)>
			//*  21   47:aload_1         
			//*  22   48:invokevirtual   #75  <Method boolean Handler.post(Runnable)>
			//*  23   51:pop             
			//*  24   52:aload_1         
			//*  25   53:lconst_1        
			//*  26   54:getstatic       #81  <Field TimeUnit TimeUnit.SECONDS>
			//*  27   57:invokevirtual   #85  <Method Object FutureTask.get(long, TimeUnit)>
			//*  28   60:checkcast       #87  <Class String>
			//*  29   63:astore_1        
			//*  30   64:goto            81
			//*  31   67:astore_1        
			//*  32   68:invokestatic    #91  <Method String ViewIndexer.access$200()>
			//*  33   71:ldc1            #93  <String "Failed to take screenshot.">
			//*  34   73:aload_1         
			//*  35   74:invokestatic    #99  <Method int Log.e(String, String, Throwable)>
			//*  36   77:pop             
			//*  37   78:ldc1            #101 <String "">
			//*  38   80:astore_1        
			//*  39   81:new             #103 <Class JSONObject>
			//*  40   84:dup             
			//*  41   85:invokespecial   #104 <Method void JSONObject()>
			//*  42   88:astore_3        
			//*  43   89:aload_3         
			//*  44   90:ldc1            #106 <String "screenname">
			//*  45   92:aload_0         
			//*  46   93:getfield        #20  <Field String val$activityName>
			//*  47   96:invokevirtual   #110 <Method JSONObject JSONObject.put(String, Object)>
			//*  48   99:pop             
			//*  49  100:aload_3         
			//*  50  101:ldc1            #112 <String "screenshot">
			//*  51  103:aload_1         
			//*  52  104:invokevirtual   #110 <Method JSONObject JSONObject.put(String, Object)>
			//*  53  107:pop             
			//*  54  108:new             #114 <Class JSONArray>
			//*  55  111:dup             
			//*  56  112:invokespecial   #115 <Method void JSONArray()>
			//*  57  115:astore_1        
			//*  58  116:aload_1         
			//*  59  117:aload_2         
			//*  60  118:invokestatic    #121 <Method JSONObject ViewHierarchy.getDictionaryOfView(View)>
			//*  61  121:invokevirtual   #124 <Method JSONArray JSONArray.put(Object)>
			//*  62  124:pop             
			//*  63  125:aload_3         
			//*  64  126:ldc1            #126 <String "view">
			//*  65  128:aload_1         
			//*  66  129:invokevirtual   #110 <Method JSONObject JSONObject.put(String, Object)>
			//*  67  132:pop             
			//*  68  133:goto            145
			//*  69  136:invokestatic    #91  <Method String ViewIndexer.access$200()>
			//*  70  139:ldc1            #128 <String "Failed to create JSONObject">
			//*  71  141:invokestatic    #131 <Method int Log.e(String, String)>
			//*  72  144:pop             
			//*  73  145:aload_3         
			//*  74  146:instanceof      #103 <Class JSONObject>
			//*  75  149:ifne            160
			//*  76  152:aload_3         
			//*  77  153:invokevirtual   #134 <Method String JSONObject.toString()>
			//*  78  156:astore_1        
			//*  79  157:goto            168
			//*  80  160:aload_3         
			//*  81  161:checkcast       #103 <Class JSONObject>
			//*  82  164:invokestatic    #139 <Method String JSONObjectInstrumentation.toString(JSONObject)>
			//*  83  167:astore_1        
			//*  84  168:aload_0         
			//*  85  169:getfield        #18  <Field ViewIndexer this$0>
			//*  86  172:aload_1         
			//*  87  173:invokestatic    #142 <Method void ViewIndexer.access$300(ViewIndexer, String)>
			//*  88  176:return          
				catch(Exception exception)
			//*  89  177:astore_1        
				{
					Log.e(ViewIndexer.TAG, "UI Component tree indexing failure!", ((Throwable) (exception)));
			//   90  178:invokestatic    #91  <Method String ViewIndexer.access$200()>
			//   91  181:ldc1            #144 <String "UI Component tree indexing failure!">
			//   92  183:aload_1         
			//   93  184:invokestatic    #99  <Method int Log.e(String, String, Throwable)>
			//   94  187:pop             
					return;
			//   95  188:return          
				}
				obj = ((Object) (new FutureTask(((Callable) (new ScreenshotTaker(view))))));
				uiThreadHandler.post(((Runnable) (obj)));
				try
				{
					obj = ((Object) ((String)((FutureTask) (obj)).get(1L, TimeUnit.SECONDS)));
					break MISSING_BLOCK_LABEL_81;
				}
				// Misplaced declaration of an exception variable
				catch(Object obj) { }
				Log.e(ViewIndexer.TAG, "Failed to take screenshot.", ((Throwable) (obj)));
				obj = "";
				jsonobject = new JSONObject();
				jsonobject.put("screenname", ((Object) (activityName)));
				jsonobject.put("screenshot", obj);
				obj = ((Object) (new JSONArray()));
				((JSONArray) (obj)).put(((Object) (ViewHierarchy.getDictionaryOfView(view))));
				jsonobject.put("view", obj);
				  goto _L1
_L6:
				Log.e(ViewIndexer.TAG, "Failed to create JSONObject");
_L1:
				if(jsonobject instanceof JSONObject) goto _L3; else goto _L2
_L2:
				obj = ((Object) (jsonobject.toString()));
				  goto _L4
_L3:
				obj = ((Object) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
_L4:
				sendToServer(((String) (obj)));
				return;
				JSONException jsonexception;
				jsonexception;
			//   96  189:astore_1        
				if(true) goto _L6; else goto _L5
_L5:
			//*  97  190:goto            136
			}

			final ViewIndexer this$0;
			final String val$activityName;

			
			{
				this$0 = ViewIndexer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ViewIndexer this$0>
				activityName = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String val$activityName>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void TimerTask()>
			//    8   14:return          
			}
		}
;
	//    7   15:new             #6   <Class ViewIndexer$1>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #185 <Method void ViewIndexer$1(ViewIndexer, String)>
	//   12   24:astore_1        
		FacebookSdk.getExecutor().execute(new Runnable() {

			public void run()
			{
				try
				{
					if(indexingTimer != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field ViewIndexer this$0>
			//*   2    4:invokestatic    #31  <Method Timer ViewIndexer.access$400(ViewIndexer)>
			//*   3    7:ifnull          20
						indexingTimer.cancel();
			//    4   10:aload_0         
			//    5   11:getfield        #19  <Field ViewIndexer this$0>
			//    6   14:invokestatic    #31  <Method Timer ViewIndexer.access$400(ViewIndexer)>
			//    7   17:invokevirtual   #36  <Method void Timer.cancel()>
					previousDigest = null;
			//    8   20:aload_0         
			//    9   21:getfield        #19  <Field ViewIndexer this$0>
			//   10   24:aconst_null     
			//   11   25:invokestatic    #40  <Method String ViewIndexer.access$502(ViewIndexer, String)>
			//   12   28:pop             
					indexingTimer = new Timer();
			//   13   29:aload_0         
			//   14   30:getfield        #19  <Field ViewIndexer this$0>
			//   15   33:new             #33  <Class Timer>
			//   16   36:dup             
			//   17   37:invokespecial   #41  <Method void Timer()>
			//   18   40:invokestatic    #45  <Method Timer ViewIndexer.access$402(ViewIndexer, Timer)>
			//   19   43:pop             
					indexingTimer.scheduleAtFixedRate(indexingTask, 0L, 1000L);
			//   20   44:aload_0         
			//   21   45:getfield        #19  <Field ViewIndexer this$0>
			//   22   48:invokestatic    #31  <Method Timer ViewIndexer.access$400(ViewIndexer)>
			//   23   51:aload_0         
			//   24   52:getfield        #21  <Field TimerTask val$indexingTask>
			//   25   55:lconst_0        
			//   26   56:ldc2w           #46  <Long 1000L>
			//   27   59:invokevirtual   #51  <Method void Timer.scheduleAtFixedRate(TimerTask, long, long)>
					return;
			//   28   62:return          
				}
				catch(Exception exception)
			//*  29   63:astore_1        
				{
					Log.e(ViewIndexer.TAG, "Error scheduling indexing job", ((Throwable) (exception)));
			//   30   64:invokestatic    #55  <Method String ViewIndexer.access$200()>
			//   31   67:ldc1            #57  <String "Error scheduling indexing job">
			//   32   69:aload_1         
			//   33   70:invokestatic    #63  <Method int Log.e(String, String, Throwable)>
			//   34   73:pop             
				}
			//   35   74:return          
			}

			final ViewIndexer this$0;
			final TimerTask val$indexingTask;

			
			{
				this$0 = ViewIndexer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewIndexer this$0>
				indexingTask = timertask;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field TimerTask val$indexingTask>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   13   25:invokestatic    #168 <Method Executor FacebookSdk.getExecutor()>
	//   14   28:new             #8   <Class ViewIndexer$2>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokespecial   #188 <Method void ViewIndexer$2(ViewIndexer, TimerTask)>
	//   19   37:invokeinterface #176 <Method void Executor.execute(Runnable)>
	//   20   42:return          
	}

	public void unschedule()
	{
		Timer timer = indexingTimer;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Timer indexingTimer>
	//    2    4:astore_1        
		if(timer != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          53
			try
			{
				timer.cancel();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #196 <Method void Timer.cancel()>
				indexingTimer = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #89  <Field Timer indexingTimer>
				if(CodelessActivityLifecycleTracker.getIsAppIndexingEnabled())
	//*  10   18:invokestatic    #200 <Method boolean CodelessActivityLifecycleTracker.getIsAppIndexingEnabled()>
	//*  11   21:ifeq            53
				{
					logger.logIndexingCancelled(((Object) (activity)).getClass().getCanonicalName());
	//   12   24:aload_0         
	//   13   25:getfield        #74  <Field MarketingLogger logger>
	//   14   28:aload_0         
	//   15   29:getfield        #43  <Field Activity activity>
	//   16   32:invokevirtual   #181 <Method Class Object.getClass()>
	//   17   35:invokevirtual   #34  <Method String Class.getCanonicalName()>
	//   18   38:invokevirtual   #203 <Method void MarketingLogger.logIndexingCancelled(String)>
					return;
	//   19   41:return          
				}
			}
			catch(Exception exception)
	//*  20   42:astore_1        
			{
				Log.e(TAG, "Error unscheduling indexing job", ((Throwable) (exception)));
	//   21   43:getstatic       #36  <Field String TAG>
	//   22   46:ldc1            #205 <String "Error unscheduling indexing job">
	//   23   48:aload_1         
	//   24   49:invokestatic    #211 <Method int Log.e(String, String, Throwable)>
	//   25   52:pop             
			}
	//   26   53:return          
	}

	private static final String TAG = ((Class) (com/facebook/marketing/ViewIndexer)).getCanonicalName();
	private Activity activity;
	private Timer indexingTimer;
	private final MarketingLogger logger = new MarketingLogger(FacebookSdk.getApplicationContext(), FacebookSdk.getApplicationId());
	private String previousDigest;
	private final Handler uiThreadHandler = new Handler(Looper.getMainLooper());

	static 
	{
	//    0    0:ldc1            #2   <Class ViewIndexer>
	//    1    2:invokevirtual   #34  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #36  <Field String TAG>
	//*   3    8:return          
	}


/*
	static Activity access$000(ViewIndexer viewindexer)
	{
		return viewindexer.activity;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Activity activity>
	//    2    4:areturn         
	}

*/


/*
	static Handler access$100(ViewIndexer viewindexer)
	{
		return viewindexer.uiThreadHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Handler uiThreadHandler>
	//    2    4:areturn         
	}

*/


/*
	static String access$200()
	{
		return TAG;
	//    0    0:getstatic       #36  <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static void access$300(ViewIndexer viewindexer, String s)
	{
		viewindexer.sendToServer(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method void sendToServer(String)>
		return;
	//    3    5:return          
	}

*/


/*
	static Timer access$400(ViewIndexer viewindexer)
	{
		return viewindexer.indexingTimer;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Timer indexingTimer>
	//    2    4:areturn         
	}

*/


/*
	static Timer access$402(ViewIndexer viewindexer, Timer timer)
	{
		viewindexer.indexingTimer = timer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #89  <Field Timer indexingTimer>
		return timer;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static String access$500(ViewIndexer viewindexer)
	{
		return viewindexer.previousDigest;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String previousDigest>
	//    2    4:areturn         
	}

*/


/*
	static String access$502(ViewIndexer viewindexer, String s)
	{
		viewindexer.previousDigest = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field String previousDigest>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static MarketingLogger access$600(ViewIndexer viewindexer)
	{
		return viewindexer.logger;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field MarketingLogger logger>
	//    2    4:areturn         
	}

*/


/*
	static GraphRequest access$700(String s, AccessToken accesstoken, String s1)
	{
		return buildAppIndexingRequest(s, accesstoken, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #102 <Method GraphRequest buildAppIndexingRequest(String, AccessToken, String)>
	//    4    6:areturn         
	}

*/
}
