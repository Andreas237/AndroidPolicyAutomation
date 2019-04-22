// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.marketing;

import android.util.Log;
import com.facebook.*;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.marketing.internal.MarketingLogger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.marketing:
//			ViewIndexer, CodelessActivityLifecycleTracker

class ViewIndexer$3
	implements Runnable
{

	public void run()
	{
		String s;
		Object obj;
		Object obj1;
		obj1 = ((Object) (FacebookSdk.getApplicationId()));
	//    0    0:invokestatic    #34  <Method String FacebookSdk.getApplicationId()>
	//    1    3:astore_3        
		s = ((Object) (ViewIndexer.access$000(ViewIndexer.this))).getClass().getCanonicalName();
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field ViewIndexer this$0>
	//    4    8:invokestatic    #38  <Method android.app.Activity ViewIndexer.access$000(ViewIndexer)>
	//    5   11:invokevirtual   #42  <Method Class Object.getClass()>
	//    6   14:invokevirtual   #47  <Method String Class.getCanonicalName()>
	//    7   17:astore_1        
		obj = ((Object) (Utility.md5hash(val$tree)));
	//    8   18:aload_0         
	//    9   19:getfield        #21  <Field String val$tree>
	//   10   22:invokestatic    #53  <Method String Utility.md5hash(String)>
	//   11   25:astore_2        
		AccessToken accesstoken = AccessToken.getCurrentAccessToken();
	//   12   26:invokestatic    #59  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   13   29:astore          4
		if(obj != null && ((String) (obj)).equals(((Object) (ViewIndexer.access$500(ViewIndexer.this)))))
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
		ViewIndexer.access$600(ViewIndexer.this).logIndexingStart(s);
	//   23   50:aload_0         
	//   24   51:getfield        #19  <Field ViewIndexer this$0>
	//   25   54:invokestatic    #73  <Method MarketingLogger ViewIndexer.access$600(ViewIndexer)>
	//   26   57:aload_1         
	//   27   58:invokevirtual   #78  <Method void MarketingLogger.logIndexingStart(String)>
		obj1 = ((Object) (ViewIndexer.access$700(val$tree, accesstoken, ((String) (obj1)))));
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
					Logger.log(LoggingBehavior.APP_EVENTS, ViewIndexer.access$200(), "Successfully send UI component tree to server");
	//   53  114:getstatic       #113 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   54  117:invokestatic    #116 <Method String ViewIndexer.access$200()>
	//   55  120:ldc1            #118 <String "Successfully send UI component tree to server">
	//   56  122:invokestatic    #124 <Method void Logger.log(LoggingBehavior, String, String)>
					ViewIndexer.access$502(ViewIndexer.this, ((String) (obj)));
	//   57  125:aload_0         
	//   58  126:getfield        #19  <Field ViewIndexer this$0>
	//   59  129:aload_2         
	//   60  130:invokestatic    #128 <Method String ViewIndexer.access$502(ViewIndexer, String)>
	//   61  133:pop             
					ViewIndexer.access$600(ViewIndexer.this).logIndexingComplete(s);
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
				Log.e(ViewIndexer.access$200(), "Error decoding server response.", ((Throwable) (jsonexception)));
	//   99  208:invokestatic    #116 <Method String ViewIndexer.access$200()>
	//  100  211:ldc1            #175 <String "Error decoding server response.">
	//  101  213:aload_1         
	//  102  214:invokestatic    #178 <Method int Log.e(String, String, Throwable)>
	//  103  217:pop             
			}
			break MISSING_BLOCK_LABEL_218;
		}
		s = ViewIndexer.access$200();
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Error sending UI component tree to Facebook: ");
		((StringBuilder) (obj)).append(((Object) (((GraphResponse) (obj1)).getError())));
		Log.e(s, ((StringBuilder) (obj)).toString());
		return;
	//  104  218:return          
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
