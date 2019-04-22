// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.marketing.internal;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.marketing.CodelessActivityLifecycleTracker;

// Referenced classes of package com.facebook.marketing.internal:
//			MarketingLogger

public final class MarketingInitProvider extends ContentProvider
{

	public MarketingInitProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void ContentProvider()>
	//    2    4:return          
	}

	private void setupCodeless()
	{
		CodelessActivityLifecycleTracker.startTracking((Application)FacebookSdk.getApplicationContext(), FacebookSdk.getApplicationId());
	//    0    0:invokestatic    #27  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:checkcast       #29  <Class Application>
	//    2    6:invokestatic    #33  <Method String FacebookSdk.getApplicationId()>
	//    3    9:invokestatic    #39  <Method void CodelessActivityLifecycleTracker.startTracking(Application, String)>
		(new MarketingLogger(((android.content.Context) ((Application)FacebookSdk.getApplicationContext())), FacebookSdk.getApplicationId())).logCodelessInitialized();
	//    4   12:new             #41  <Class MarketingLogger>
	//    5   15:dup             
	//    6   16:invokestatic    #27  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    7   19:checkcast       #29  <Class Application>
	//    8   22:invokestatic    #33  <Method String FacebookSdk.getApplicationId()>
	//    9   25:invokespecial   #44  <Method void MarketingLogger(android.content.Context, String)>
	//   10   28:invokevirtual   #47  <Method void MarketingLogger.logCodelessInitialized()>
	//   11   31:return          
	}

	public int delete(Uri uri, String s, String as[])
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getType(Uri uri)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Uri insert(Uri uri, ContentValues contentvalues)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean onCreate()
	{
label0:
		{
			if(!FacebookSdk.isInitialized())
	//*   0    0:invokestatic    #60  <Method boolean FacebookSdk.isInitialized()>
	//*   1    3:ifne            24
			{
				FacebookSdk.sdkInitialize(getContext(), new com.facebook.FacebookSdk.InitializeCallback() {

					public void onInitialized()
					{
						setupCodeless();
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field MarketingInitProvider this$0>
					//    2    4:invokestatic    #25  <Method void MarketingInitProvider.access$000(MarketingInitProvider)>
					//    3    7:return          
					}

					final MarketingInitProvider this$0;

			
			{
				this$0 = MarketingInitProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MarketingInitProvider this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//    2    6:aload_0         
	//    3    7:invokevirtual   #63  <Method android.content.Context getContext()>
	//    4   10:new             #6   <Class MarketingInitProvider$1>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #65  <Method void MarketingInitProvider$1(MarketingInitProvider)>
	//    8   18:invokestatic    #69  <Method void FacebookSdk.sdkInitialize(android.content.Context, com.facebook.FacebookSdk$InitializeCallback)>
				break label0;
	//    9   21:goto            42
			}
			try
			{
				setupCodeless();
	//   10   24:aload_0         
	//   11   25:invokespecial   #21  <Method void setupCodeless()>
			}
	//*  12   28:goto            42
			catch(Exception exception)
	//*  13   31:astore_1        
			{
				Log.i(TAG, "Failed to auto initialize the Marketing SDK", ((Throwable) (exception)));
	//   14   32:getstatic       #71  <Field String TAG>
	//   15   35:ldc1            #73  <String "Failed to auto initialize the Marketing SDK">
	//   16   37:aload_1         
	//   17   38:invokestatic    #79  <Method int Log.i(String, String, Throwable)>
	//   18   41:pop             
			}
		}
		return false;
	//   19   42:iconst_0        
	//   20   43:ireturn         
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static final String TAG = "MarketingInitProvider";

	static 
	{
	//    0    0:return          
	}


/*
	static void access$000(MarketingInitProvider marketinginitprovider)
	{
		marketinginitprovider.setupCodeless();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void setupCodeless()>
		return;
	//    2    4:return          
	}

*/
}
