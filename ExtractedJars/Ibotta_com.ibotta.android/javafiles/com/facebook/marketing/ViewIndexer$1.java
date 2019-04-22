// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.marketing;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.TimerTask;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.*;

// Referenced classes of package com.facebook.marketing:
//			ViewIndexer, CodelessActivityLifecycleTracker

class ViewIndexer$1 extends TimerTask
{

	public void run()
	{
		Object obj;
		View view;
		JSONObject jsonobject;
		try
		{
			view = ViewIndexer.access$000(ViewIndexer.this).getWindow().getDecorView().getRootView();
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
	//*  16   36:invokespecial   #65  <Method void FutureTask(java.util.concurrent.Callable)>
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
			Log.e(ViewIndexer.access$200(), "UI Component tree indexing failure!", ((Throwable) (exception)));
	//   90  178:invokestatic    #91  <Method String ViewIndexer.access$200()>
	//   91  181:ldc1            #144 <String "UI Component tree indexing failure!">
	//   92  183:aload_1         
	//   93  184:invokestatic    #99  <Method int Log.e(String, String, Throwable)>
	//   94  187:pop             
			return;
	//   95  188:return          
		}
		obj = ((Object) (new FutureTask(((java.util.concurrent.Callable) (new reenshotTaker(view))))));
		ViewIndexer.access$100(ViewIndexer.this).post(((Runnable) (obj)));
		try
		{
			obj = ((Object) ((String)((FutureTask) (obj)).get(1L, TimeUnit.SECONDS)));
			break MISSING_BLOCK_LABEL_81;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		Log.e(ViewIndexer.access$200(), "Failed to take screenshot.", ((Throwable) (obj)));
		obj = "";
		jsonobject = new JSONObject();
		jsonobject.put("screenname", ((Object) (val$activityName)));
		jsonobject.put("screenshot", obj);
		obj = ((Object) (new JSONArray()));
		((JSONArray) (obj)).put(((Object) (ViewHierarchy.getDictionaryOfView(view))));
		jsonobject.put("view", obj);
		  goto _L1
_L6:
		Log.e(ViewIndexer.access$200(), "Failed to create JSONObject");
_L1:
		if(jsonobject instanceof JSONObject) goto _L3; else goto _L2
_L2:
		obj = ((Object) (jsonobject.toString()));
		  goto _L4
_L3:
		obj = ((Object) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
_L4:
		ViewIndexer.access$300(ViewIndexer.this, ((String) (obj)));
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

	ViewIndexer$1()
	{
		this$0 = final_viewindexer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ViewIndexer this$0>
		val$activityName = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field String val$activityName>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void TimerTask()>
	//    8   14:return          
	}
}
