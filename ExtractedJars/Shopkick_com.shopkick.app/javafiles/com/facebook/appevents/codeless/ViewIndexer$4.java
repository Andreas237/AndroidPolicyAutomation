// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless;

import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;

// Referenced classes of package com.facebook.appevents.codeless:
//			ViewIndexer

static final class ViewIndexer$4
	implements com.facebook.allback
{

	public void onCompleted(GraphResponse graphresponse)
	{
		Logger.log(LoggingBehavior.APP_EVENTS, ViewIndexer.access$100(), "App index sent to FB!");
	//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//    1    3:invokestatic    #28  <Method String ViewIndexer.access$100()>
	//    2    6:ldc1            #30  <String "App index sent to FB!">
	//    3    8:invokestatic    #36  <Method void Logger.log(LoggingBehavior, String, String)>
	//    4   11:return          
	}

	ViewIndexer$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
