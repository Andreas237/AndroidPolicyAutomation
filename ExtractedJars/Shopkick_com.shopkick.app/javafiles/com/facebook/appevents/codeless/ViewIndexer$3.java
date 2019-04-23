// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless;

import android.util.Log;
import com.facebook.*;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.appevents.codeless:
//			ViewIndexer

class ViewIndexer$3
	implements Runnable
{

	public void run()
	{
		String s;
		Object obj;
		obj = ((Object) (FacebookSdk.getApplicationId()));
	//    0    0:invokestatic    #34  <Method String FacebookSdk.getApplicationId()>
	//    1    3:astore_2        
		s = Utility.md5hash(val$tree);
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String val$tree>
	//    4    8:invokestatic    #40  <Method String Utility.md5hash(String)>
	//    5   11:astore_1        
		AccessToken accesstoken = AccessToken.getCurrentAccessToken();
	//    6   12:invokestatic    #46  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    7   15:astore_3        
		if(s != null && s.equals(((Object) (ViewIndexer.access$400(ViewIndexer.this)))))
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
		obj = ((Object) (ViewIndexer.buildAppIndexingRequest(val$tree, accesstoken, ((String) (obj)), "app_indexing")));
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
					Logger.log(LoggingBehavior.APP_EVENTS, ViewIndexer.access$100(), "Successfully send UI component tree to server");
	//   43   85:getstatic       #93  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   44   88:invokestatic    #96  <Method String ViewIndexer.access$100()>
	//   45   91:ldc1            #98  <String "Successfully send UI component tree to server">
	//   46   93:invokestatic    #104 <Method void Logger.log(LoggingBehavior, String, String)>
					ViewIndexer.access$402(ViewIndexer.this, s);
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
				Log.e(ViewIndexer.access$100(), "Error decoding server response.", ((Throwable) (jsonexception)));
	//   84  166:invokestatic    #96  <Method String ViewIndexer.access$100()>
	//   85  169:ldc1            #152 <String "Error decoding server response.">
	//   86  171:aload_1         
	//   87  172:invokestatic    #155 <Method int Log.e(String, String, Throwable)>
	//   88  175:pop             
			}
			break MISSING_BLOCK_LABEL_176;
		}
		s = ViewIndexer.access$100();
		obj1 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj1)).append("Error sending UI component tree to Facebook: ");
		((StringBuilder) (obj1)).append(((Object) (((GraphResponse) (obj)).getError())));
		Log.e(s, ((StringBuilder) (obj1)).toString());
		return;
	//   89  176:return          
	}

	final ViewIndexer this$0;
	final String val$tree;

	ViewIndexer$3()
	{
		this$0 = final_viewindexer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewIndexer this$0>
		val$tree = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$tree>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
