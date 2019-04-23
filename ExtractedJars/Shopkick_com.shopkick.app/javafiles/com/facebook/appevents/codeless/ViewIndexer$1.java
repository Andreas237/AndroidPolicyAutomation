// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.facebook.appevents.codeless.internal.UnityReflection;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.internal.InternalSettings;
import java.util.TimerTask;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.*;

// Referenced classes of package com.facebook.appevents.codeless:
//			ViewIndexer

class ViewIndexer$1 extends TimerTask
{

	public void run()
	{
		Object obj;
		View view;
		JSONObject jsonobject;
		try
		{
			view = val$activity.getWindow().getDecorView().getRootView();
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
	//*  19   43:invokespecial   #74  <Method void FutureTask(java.util.concurrent.Callable)>
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
			Log.e(ViewIndexer.access$100(), "UI Component tree indexing failure!", ((Throwable) (exception)));
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
		obj = ((Object) (new FutureTask(((java.util.concurrent.Callable) (new reenshotTaker(view))))));
		ViewIndexer.access$000(ViewIndexer.this).post(((Runnable) (obj)));
		try
		{
			obj = ((Object) ((String)((FutureTask) (obj)).get(1L, TimeUnit.SECONDS)));
			break MISSING_BLOCK_LABEL_88;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		Log.e(ViewIndexer.access$100(), "Failed to take screenshot.", ((Throwable) (obj)));
		obj = "";
		jsonobject = new JSONObject();
		jsonobject.put("screenname", ((Object) (val$activityName)));
		jsonobject.put("screenshot", obj);
		obj = ((Object) (new JSONArray()));
		((JSONArray) (obj)).put(((Object) (ViewHierarchy.getDictionaryOfView(view))));
		jsonobject.put("view", obj);
		  goto _L1
_L3:
		Log.e(ViewIndexer.access$100(), "Failed to create JSONObject");
_L1:
		String s = jsonobject.toString();
		ViewIndexer.access$200(ViewIndexer.this, s, val$activityName);
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

	ViewIndexer$1()
	{
		this$0 = final_viewindexer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewIndexer this$0>
		val$activity = activity1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Activity val$activity>
		val$activityName = String.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field String val$activityName>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #25  <Method void TimerTask()>
	//   11   19:return          
	}
}
