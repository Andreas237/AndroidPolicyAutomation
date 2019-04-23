// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.*;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.facebook.*;
import com.facebook.appevents.codeless.internal.UnityReflection;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.*;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.*;
import org.json.*;

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


	public ViewIndexer(Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		activityReference = new WeakReference(((Object) (activity)));
	//    2    4:aload_0         
	//    3    5:new             #59  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #62  <Method void WeakReference(Object)>
	//    7   13:putfield        #64  <Field WeakReference activityReference>
		previousDigest = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #66  <Field String previousDigest>
	//   11   21:aload_0         
	//   12   22:new             #68  <Class Handler>
	//   13   25:dup             
	//   14   26:invokestatic    #74  <Method Looper Looper.getMainLooper()>
	//   15   29:invokespecial   #77  <Method void Handler(Looper)>
	//   16   32:putfield        #79  <Field Handler uiThreadHandler>
		instance = this;
	//   17   35:aload_0         
	//   18   36:putstatic       #81  <Field ViewIndexer instance>
	//   19   39:return          
	}

	public static GraphRequest buildAppIndexingRequest(String s, AccessToken accesstoken, String s1, String s2)
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
	//   17   28:astore          4
		s1 = ((String) (graphrequest.getParameters()));
	//   18   30:aload           4
	//   19   32:invokevirtual   #127 <Method Bundle GraphRequest.getParameters()>
	//   20   35:astore_2        
		accesstoken = ((AccessToken) (s1));
	//   21   36:aload_2         
	//   22   37:astore_1        
		if(s1 == null)
	//*  23   38:aload_2         
	//*  24   39:ifnonnull       50
			accesstoken = ((AccessToken) (new Bundle()));
	//   25   42:new             #129 <Class Bundle>
	//   26   45:dup             
	//   27   46:invokespecial   #130 <Method void Bundle()>
	//   28   49:astore_1        
		((Bundle) (accesstoken)).putString("tree", s);
	//   29   50:aload_1         
	//   30   51:ldc1            #32  <String "tree">
	//   31   53:aload_0         
	//   32   54:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		((Bundle) (accesstoken)).putString("app_version", AppEventUtility.getAppVersion());
	//   33   57:aload_1         
	//   34   58:ldc1            #19  <String "app_version">
	//   35   60:invokestatic    #138 <Method String AppEventUtility.getAppVersion()>
	//   36   63:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		((Bundle) (accesstoken)).putString("platform", "android");
	//   37   66:aload_1         
	//   38   67:ldc1            #22  <String "platform">
	//   39   69:ldc1            #140 <String "android">
	//   40   71:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		((Bundle) (accesstoken)).putString("request_type", s2);
	//   41   74:aload_1         
	//   42   75:ldc1            #25  <String "request_type">
	//   43   77:aload_3         
	//   44   78:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		if(s2.equals("app_indexing"))
	//*  45   81:aload_3         
	//*  46   82:ldc1            #142 <String "app_indexing">
	//*  47   84:invokevirtual   #146 <Method boolean String.equals(Object)>
	//*  48   87:ifeq            99
			((Bundle) (accesstoken)).putString("device_session_id", ActivityLifecycleTracker.getCurrentDeviceSessionID());
	//   49   90:aload_1         
	//   50   91:ldc1            #148 <String "device_session_id">
	//   51   93:invokestatic    #153 <Method String ActivityLifecycleTracker.getCurrentDeviceSessionID()>
	//   52   96:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		graphrequest.setParameters(((Bundle) (accesstoken)));
	//   53   99:aload           4
	//   54  101:aload_1         
	//   55  102:invokevirtual   #157 <Method void GraphRequest.setParameters(Bundle)>
		graphrequest.setCallback(new com.facebook.GraphRequest.Callback() {

			public void onCompleted(GraphResponse graphresponse)
			{
				Logger.log(LoggingBehavior.APP_EVENTS, ViewIndexer.TAG, "App index sent to FB!");
			//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
			//    1    3:invokestatic    #28  <Method String ViewIndexer.access$100()>
			//    2    6:ldc1            #30  <String "App index sent to FB!">
			//    3    8:invokestatic    #36  <Method void Logger.log(LoggingBehavior, String, String)>
			//    4   11:return          
			}

		}
);
	//   56  105:aload           4
	//   57  107:new             #12  <Class ViewIndexer$4>
	//   58  110:dup             
	//   59  111:invokespecial   #158 <Method void ViewIndexer$4()>
	//   60  114:invokevirtual   #162 <Method void GraphRequest.setCallback(com.facebook.GraphRequest$Callback)>
		return graphrequest;
	//   61  117:aload           4
	//   62  119:areturn         
	}

	private void sendToServer(final String tree, String s)
	{
		FacebookSdk.getExecutor().execute(new Runnable() {

			public void run()
			{
				String s1;
				Object obj;
				obj = ((Object) (FacebookSdk.getApplicationId()));
			//    0    0:invokestatic    #34  <Method String FacebookSdk.getApplicationId()>
			//    1    3:astore_2        
				s1 = Utility.md5hash(tree);
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field String val$tree>
			//    4    8:invokestatic    #40  <Method String Utility.md5hash(String)>
			//    5   11:astore_1        
				AccessToken accesstoken = AccessToken.getCurrentAccessToken();
			//    6   12:invokestatic    #46  <Method AccessToken AccessToken.getCurrentAccessToken()>
			//    7   15:astore_3        
				if(s1 != null && s1.equals(((Object) (previousDigest))))
			//*   8   16:aload_1         
			//*   9   17:ifnull          35
			//*  10   20:aload_1         
			//*  11   21:aload_0         
			//*  12   22:getfield        #19  <Field ViewIndexer this$0>
			//*  13   25:invokestatic    #50  <Method String ViewIndexer.access$400(ViewIndexer)>
			//*  14   28:invokevirtual   #56  <Method boolean String.equals(Object)>
			//*  15   31:ifeq            35
					return;
			//   16   34:return          
				obj = ((Object) (ViewIndexer.buildAppIndexingRequest(tree, accesstoken, ((String) (obj)), "app_indexing")));
			//   17   35:aload_0         
			//   18   36:getfield        #21  <Field String val$tree>
			//   19   39:aload_3         
			//   20   40:aload_2         
			//   21   41:ldc1            #58  <String "app_indexing">
			//   22   43:invokestatic    #62  <Method GraphRequest ViewIndexer.buildAppIndexingRequest(String, AccessToken, String, String)>
			//   23   46:astore_2        
				if(obj == null)
					break MISSING_BLOCK_LABEL_176;
			//   24   47:aload_2         
			//   25   48:ifnull          176
				obj = ((Object) (((GraphRequest) (obj)).executeAndWait()));
			//   26   51:aload_2         
			//   27   52:invokevirtual   #68  <Method GraphResponse GraphRequest.executeAndWait()>
			//   28   55:astore_2        
				Object obj1 = ((Object) (((GraphResponse) (obj)).getJSONObject()));
			//   29   56:aload_2         
			//   30   57:invokevirtual   #74  <Method JSONObject GraphResponse.getJSONObject()>
			//   31   60:astore_3        
				if(obj1 != null)
			//*  32   61:aload_3         
			//*  33   62:ifnull          127
				{
					try
					{
						if(((JSONObject) (obj1)).has("success") && ((JSONObject) (obj1)).getString("success") == "true")
			//*  34   65:aload_3         
			//*  35   66:ldc1            #76  <String "success">
			//*  36   68:invokevirtual   #82  <Method boolean JSONObject.has(String)>
			//*  37   71:ifeq            105
			//*  38   74:aload_3         
			//*  39   75:ldc1            #76  <String "success">
			//*  40   77:invokevirtual   #85  <Method String JSONObject.getString(String)>
			//*  41   80:ldc1            #87  <String "true">
			//*  42   82:if_acmpne       105
						{
							Logger.log(LoggingBehavior.APP_EVENTS, ViewIndexer.TAG, "Successfully send UI component tree to server");
			//   43   85:getstatic       #93  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
			//   44   88:invokestatic    #96  <Method String ViewIndexer.access$100()>
			//   45   91:ldc1            #98  <String "Successfully send UI component tree to server">
			//   46   93:invokestatic    #104 <Method void Logger.log(LoggingBehavior, String, String)>
							previousDigest = s1;
			//   47   96:aload_0         
			//   48   97:getfield        #19  <Field ViewIndexer this$0>
			//   49  100:aload_1         
			//   50  101:invokestatic    #108 <Method String ViewIndexer.access$402(ViewIndexer, String)>
			//   51  104:pop             
						}
						if(((JSONObject) (obj1)).has("is_app_indexing_enabled"))
			//*  52  105:aload_3         
			//*  53  106:ldc1            #110 <String "is_app_indexing_enabled">
			//*  54  108:invokevirtual   #82  <Method boolean JSONObject.has(String)>
			//*  55  111:ifeq            176
						{
							ActivityLifecycleTracker.updateAppIndexing(Boolean.valueOf(((JSONObject) (obj1)).getBoolean("is_app_indexing_enabled")));
			//   56  114:aload_3         
			//   57  115:ldc1            #110 <String "is_app_indexing_enabled">
			//   58  117:invokevirtual   #113 <Method boolean JSONObject.getBoolean(String)>
			//   59  120:invokestatic    #119 <Method Boolean Boolean.valueOf(boolean)>
			//   60  123:invokestatic    #125 <Method void ActivityLifecycleTracker.updateAppIndexing(Boolean)>
							return;
			//   61  126:return          
						}
					}
			//*  62  127:invokestatic    #96  <Method String ViewIndexer.access$100()>
			//*  63  130:astore_1        
			//*  64  131:new             #127 <Class StringBuilder>
			//*  65  134:dup             
			//*  66  135:invokespecial   #128 <Method void StringBuilder()>
			//*  67  138:astore_3        
			//*  68  139:aload_3         
			//*  69  140:ldc1            #130 <String "Error sending UI component tree to Facebook: ">
			//*  70  142:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
			//*  71  145:pop             
			//*  72  146:aload_3         
			//*  73  147:aload_2         
			//*  74  148:invokevirtual   #138 <Method com.facebook.FacebookRequestError GraphResponse.getError()>
			//*  75  151:invokevirtual   #141 <Method StringBuilder StringBuilder.append(Object)>
			//*  76  154:pop             
			//*  77  155:aload_1         
			//*  78  156:aload_3         
			//*  79  157:invokevirtual   #144 <Method String StringBuilder.toString()>
			//*  80  160:invokestatic    #150 <Method int Log.e(String, String)>
			//*  81  163:pop             
			//*  82  164:return          
					catch(JSONException jsonexception)
			//*  83  165:astore_1        
					{
						Log.e(ViewIndexer.TAG, "Error decoding server response.", ((Throwable) (jsonexception)));
			//   84  166:invokestatic    #96  <Method String ViewIndexer.access$100()>
			//   85  169:ldc1            #152 <String "Error decoding server response.">
			//   86  171:aload_1         
			//   87  172:invokestatic    #155 <Method int Log.e(String, String, Throwable)>
			//   88  175:pop             
					}
					break MISSING_BLOCK_LABEL_176;
				}
				s1 = ViewIndexer.TAG;
				obj1 = ((Object) (new StringBuilder()));
				((StringBuilder) (obj1)).append("Error sending UI component tree to Facebook: ");
				((StringBuilder) (obj1)).append(((Object) (((GraphResponse) (obj)).getError())));
				Log.e(s1, ((StringBuilder) (obj1)).toString());
				return;
			//   89  176:return          
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
	//    0    0:invokestatic    #169 <Method Executor FacebookSdk.getExecutor()>
	//    1    3:new             #10  <Class ViewIndexer$3>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #172 <Method void ViewIndexer$3(ViewIndexer, String)>
	//    6   12:invokeinterface #178 <Method void Executor.execute(Runnable)>
	//    7   17:return          
	}

	public static void sendToServerUnityInstance(String s)
	{
		ViewIndexer viewindexer = instance;
	//    0    0:getstatic       #81  <Field ViewIndexer instance>
	//    1    3:astore_1        
		if(viewindexer == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       9
		{
			return;
	//    4    8:return          
		} else
		{
			viewindexer.sendToServerUnity(s);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #183 <Method void sendToServerUnity(String)>
			return;
	//    8   14:return          
		}
	}

	public void schedule()
	{
		final Activity activity = (Activity)activityReference.get();
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field WeakReference activityReference>
	//    2    4:invokevirtual   #188 <Method Object WeakReference.get()>
	//    3    7:checkcast       #190 <Class Activity>
	//    4   10:astore_1        
		if(activity == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			final String activityName = ((Object) (activity)).getClass().getSimpleName();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #194 <Method Class Object.getClass()>
	//   10   20:invokevirtual   #197 <Method String Class.getSimpleName()>
	//   11   23:astore_2        
			FacebookSdk.getApplicationId();
	//   12   24:invokestatic    #200 <Method String FacebookSdk.getApplicationId()>
	//   13   27:pop             
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
				//    1    1:getfield        #21  <Field Activity val$activity>
				//    2    4:invokevirtual   #37  <Method Window Activity.getWindow()>
				//    3    7:invokevirtual   #43  <Method View Window.getDecorView()>
				//    4   10:invokevirtual   #48  <Method View View.getRootView()>
				//    5   13:astore_2        
						if(!ActivityLifecycleTracker.getIsAppIndexingEnabled())
				//*   6   14:invokestatic    #54  <Method boolean ActivityLifecycleTracker.getIsAppIndexingEnabled()>
				//*   7   17:ifne            21
							return;
				//    8   20:return          
					}
				//*   9   21:invokestatic    #59  <Method boolean InternalSettings.isUnityApp()>
				//*  10   24:ifeq            31
				//*  11   27:invokestatic    #64  <Method void UnityReflection.captureViewHierarchy()>
				//*  12   30:return          
				//*  13   31:new             #66  <Class FutureTask>
				//*  14   34:dup             
				//*  15   35:new             #68  <Class ViewIndexer$ScreenshotTaker>
				//*  16   38:dup             
				//*  17   39:aload_2         
				//*  18   40:invokespecial   #71  <Method void ViewIndexer$ScreenshotTaker(View)>
				//*  19   43:invokespecial   #74  <Method void FutureTask(Callable)>
				//*  20   46:astore_1        
				//*  21   47:aload_0         
				//*  22   48:getfield        #19  <Field ViewIndexer this$0>
				//*  23   51:invokestatic    #78  <Method Handler ViewIndexer.access$000(ViewIndexer)>
				//*  24   54:aload_1         
				//*  25   55:invokevirtual   #84  <Method boolean Handler.post(Runnable)>
				//*  26   58:pop             
				//*  27   59:aload_1         
				//*  28   60:lconst_1        
				//*  29   61:getstatic       #90  <Field TimeUnit TimeUnit.SECONDS>
				//*  30   64:invokevirtual   #94  <Method Object FutureTask.get(long, TimeUnit)>
				//*  31   67:checkcast       #96  <Class String>
				//*  32   70:astore_1        
				//*  33   71:goto            88
				//*  34   74:astore_1        
				//*  35   75:invokestatic    #100 <Method String ViewIndexer.access$100()>
				//*  36   78:ldc1            #102 <String "Failed to take screenshot.">
				//*  37   80:aload_1         
				//*  38   81:invokestatic    #108 <Method int Log.e(String, String, Throwable)>
				//*  39   84:pop             
				//*  40   85:ldc1            #110 <String "">
				//*  41   87:astore_1        
				//*  42   88:new             #112 <Class JSONObject>
				//*  43   91:dup             
				//*  44   92:invokespecial   #113 <Method void JSONObject()>
				//*  45   95:astore_3        
				//*  46   96:aload_3         
				//*  47   97:ldc1            #115 <String "screenname">
				//*  48   99:aload_0         
				//*  49  100:getfield        #23  <Field String val$activityName>
				//*  50  103:invokevirtual   #119 <Method JSONObject JSONObject.put(String, Object)>
				//*  51  106:pop             
				//*  52  107:aload_3         
				//*  53  108:ldc1            #121 <String "screenshot">
				//*  54  110:aload_1         
				//*  55  111:invokevirtual   #119 <Method JSONObject JSONObject.put(String, Object)>
				//*  56  114:pop             
				//*  57  115:new             #123 <Class JSONArray>
				//*  58  118:dup             
				//*  59  119:invokespecial   #124 <Method void JSONArray()>
				//*  60  122:astore_1        
				//*  61  123:aload_1         
				//*  62  124:aload_2         
				//*  63  125:invokestatic    #130 <Method JSONObject ViewHierarchy.getDictionaryOfView(View)>
				//*  64  128:invokevirtual   #133 <Method JSONArray JSONArray.put(Object)>
				//*  65  131:pop             
				//*  66  132:aload_3         
				//*  67  133:ldc1            #135 <String "view">
				//*  68  135:aload_1         
				//*  69  136:invokevirtual   #119 <Method JSONObject JSONObject.put(String, Object)>
				//*  70  139:pop             
				//*  71  140:goto            152
				//*  72  143:invokestatic    #100 <Method String ViewIndexer.access$100()>
				//*  73  146:ldc1            #137 <String "Failed to create JSONObject">
				//*  74  148:invokestatic    #140 <Method int Log.e(String, String)>
				//*  75  151:pop             
				//*  76  152:aload_3         
				//*  77  153:invokevirtual   #143 <Method String JSONObject.toString()>
				//*  78  156:astore_1        
				//*  79  157:aload_0         
				//*  80  158:getfield        #19  <Field ViewIndexer this$0>
				//*  81  161:aload_1         
				//*  82  162:aload_0         
				//*  83  163:getfield        #23  <Field String val$activityName>
				//*  84  166:invokestatic    #147 <Method void ViewIndexer.access$200(ViewIndexer, String, String)>
				//*  85  169:return          
					catch(Exception exception)
				//*  86  170:astore_1        
					{
						Log.e(ViewIndexer.TAG, "UI Component tree indexing failure!", ((Throwable) (exception)));
				//   87  171:invokestatic    #100 <Method String ViewIndexer.access$100()>
				//   88  174:ldc1            #149 <String "UI Component tree indexing failure!">
				//   89  176:aload_1         
				//   90  177:invokestatic    #108 <Method int Log.e(String, String, Throwable)>
				//   91  180:pop             
						return;
				//   92  181:return          
					}
					if(InternalSettings.isUnityApp())
					{
						UnityReflection.captureViewHierarchy();
						return;
					}
					obj = ((Object) (new FutureTask(((Callable) (new ScreenshotTaker(view))))));
					uiThreadHandler.post(((Runnable) (obj)));
					try
					{
						obj = ((Object) ((String)((FutureTask) (obj)).get(1L, TimeUnit.SECONDS)));
						break MISSING_BLOCK_LABEL_88;
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
_L3:
					Log.e(ViewIndexer.TAG, "Failed to create JSONObject");
_L1:
					String s = jsonobject.toString();
					sendToServer(s, activityName);
					return;
					JSONException jsonexception;
					jsonexception;
				//   93  182:astore_1        
					if(true) goto _L3; else goto _L2
_L2:
				//*  94  183:goto            143
				}

				final ViewIndexer this$0;
				final Activity val$activity;
				final String val$activityName;

			
			{
				this$0 = ViewIndexer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewIndexer this$0>
				activity = activity1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Activity val$activity>
				activityName = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field String val$activityName>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #25  <Method void TimerTask()>
			//   11   19:return          
			}
			}
;
	//   14   28:new             #6   <Class ViewIndexer$1>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:aload_2         
	//   19   35:invokespecial   #203 <Method void ViewIndexer$1(ViewIndexer, Activity, String)>
	//   20   38:astore_1        
			FacebookSdk.getExecutor().execute(new Runnable() {

				public void run()
				{
					try
					{
						if(indexingTimer != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #19  <Field ViewIndexer this$0>
				//*   2    4:invokestatic    #31  <Method Timer ViewIndexer.access$300(ViewIndexer)>
				//*   3    7:ifnull          20
							indexingTimer.cancel();
				//    4   10:aload_0         
				//    5   11:getfield        #19  <Field ViewIndexer this$0>
				//    6   14:invokestatic    #31  <Method Timer ViewIndexer.access$300(ViewIndexer)>
				//    7   17:invokevirtual   #36  <Method void Timer.cancel()>
						previousDigest = null;
				//    8   20:aload_0         
				//    9   21:getfield        #19  <Field ViewIndexer this$0>
				//   10   24:aconst_null     
				//   11   25:invokestatic    #40  <Method String ViewIndexer.access$402(ViewIndexer, String)>
				//   12   28:pop             
						indexingTimer = new Timer();
				//   13   29:aload_0         
				//   14   30:getfield        #19  <Field ViewIndexer this$0>
				//   15   33:new             #33  <Class Timer>
				//   16   36:dup             
				//   17   37:invokespecial   #41  <Method void Timer()>
				//   18   40:invokestatic    #45  <Method Timer ViewIndexer.access$302(ViewIndexer, Timer)>
				//   19   43:pop             
						indexingTimer.scheduleAtFixedRate(indexingTask, 0L, 1000L);
				//   20   44:aload_0         
				//   21   45:getfield        #19  <Field ViewIndexer this$0>
				//   22   48:invokestatic    #31  <Method Timer ViewIndexer.access$300(ViewIndexer)>
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
				//   30   64:invokestatic    #55  <Method String ViewIndexer.access$100()>
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
	//   21   39:invokestatic    #169 <Method Executor FacebookSdk.getExecutor()>
	//   22   42:new             #8   <Class ViewIndexer$2>
	//   23   45:dup             
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokespecial   #206 <Method void ViewIndexer$2(ViewIndexer, TimerTask)>
	//   27   51:invokeinterface #178 <Method void Executor.execute(Runnable)>
			return;
	//   28   56:return          
		}
	}

	public void sendToServerUnity(String s)
	{
		Activity activity = (Activity)activityReference.get();
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field WeakReference activityReference>
	//    2    4:invokevirtual   #188 <Method Object WeakReference.get()>
	//    3    7:checkcast       #190 <Class Activity>
	//    4   10:astore_3        
		String s1 = "";
	//    5   11:ldc1            #209 <String "">
	//    6   13:astore_2        
		if(activity != null)
	//*   7   14:aload_3         
	//*   8   15:ifnull          26
			s1 = ((Object) (activity)).getClass().getSimpleName();
	//    9   18:aload_3         
	//   10   19:invokevirtual   #194 <Method Class Object.getClass()>
	//   11   22:invokevirtual   #197 <Method String Class.getSimpleName()>
	//   12   25:astore_2        
		instance.sendToServer(s, s1);
	//   13   26:getstatic       #81  <Field ViewIndexer instance>
	//   14   29:aload_1         
	//   15   30:aload_2         
	//   16   31:invokespecial   #90  <Method void sendToServer(String, String)>
	//   17   34:return          
	}

	public void unschedule()
	{
		if((Activity)activityReference.get() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field WeakReference activityReference>
	//*   2    4:invokevirtual   #188 <Method Object WeakReference.get()>
	//*   3    7:checkcast       #190 <Class Activity>
	//*   4   10:ifnonnull       14
			return;
	//    5   13:return          
		Timer timer = indexingTimer;
	//    6   14:aload_0         
	//    7   15:getfield        #94  <Field Timer indexingTimer>
	//    8   18:astore_1        
		if(timer != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          44
			try
			{
				timer.cancel();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #218 <Method void Timer.cancel()>
				indexingTimer = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #94  <Field Timer indexingTimer>
				return;
	//   16   32:return          
			}
			catch(Exception exception)
	//*  17   33:astore_1        
			{
				Log.e(TAG, "Error unscheduling indexing job", ((Throwable) (exception)));
	//   18   34:getstatic       #52  <Field String TAG>
	//   19   37:ldc1            #220 <String "Error unscheduling indexing job">
	//   20   39:aload_1         
	//   21   40:invokestatic    #226 <Method int Log.e(String, String, Throwable)>
	//   22   43:pop             
			}
	//   23   44:return          
	}

	private static final String APP_VERSION_PARAM = "app_version";
	private static final String PLATFORM_PARAM = "platform";
	private static final String REQUEST_TYPE = "request_type";
	private static final String SUCCESS = "success";
	private static final String TAG = ((Class) (com/facebook/appevents/codeless/ViewIndexer)).getCanonicalName();
	private static final String TREE_PARAM = "tree";
	private static ViewIndexer instance;
	private WeakReference activityReference;
	private Timer indexingTimer;
	private String previousDigest;
	private final Handler uiThreadHandler = new Handler(Looper.getMainLooper());

	static 
	{
	//    0    0:ldc1            #2   <Class ViewIndexer>
	//    1    2:invokevirtual   #50  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #52  <Field String TAG>
	//*   3    8:return          
	}


/*
	static Handler access$000(ViewIndexer viewindexer)
	{
		return viewindexer.uiThreadHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Handler uiThreadHandler>
	//    2    4:areturn         
	}

*/


/*
	static String access$100()
	{
		return TAG;
	//    0    0:getstatic       #52  <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static void access$200(ViewIndexer viewindexer, String s, String s1)
	{
		viewindexer.sendToServer(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #90  <Method void sendToServer(String, String)>
		return;
	//    4    6:return          
	}

*/


/*
	static Timer access$300(ViewIndexer viewindexer)
	{
		return viewindexer.indexingTimer;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Timer indexingTimer>
	//    2    4:areturn         
	}

*/


/*
	static Timer access$302(ViewIndexer viewindexer, Timer timer)
	{
		viewindexer.indexingTimer = timer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field Timer indexingTimer>
		return timer;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static String access$400(ViewIndexer viewindexer)
	{
		return viewindexer.previousDigest;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String previousDigest>
	//    2    4:areturn         
	}

*/


/*
	static String access$402(ViewIndexer viewindexer, String s)
	{
		viewindexer.previousDigest = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field String previousDigest>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
