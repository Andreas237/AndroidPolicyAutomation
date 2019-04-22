// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;

// Referenced classes of package com.digits.sdk.android:
//			DigitsScribeService

class DigitsScribeServiceImp
	implements DigitsScribeService
{

	public DigitsScribeServiceImp(DefaultScribeClient defaultscribeclient)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		if(defaultscribeclient != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          14
		{
			scribeClient = defaultscribeclient;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #15  <Field DefaultScribeClient scribeClient>
			return;
	//    7   13:return          
		} else
		{
			throw new NullPointerException("scribeClient must not be null");
	//    8   14:new             #17  <Class NullPointerException>
	//    9   17:dup             
	//   10   18:ldc1            #19  <String "scribeClient must not be null">
	//   11   20:invokespecial   #22  <Method void NullPointerException(String)>
	//   12   23:athrow          
		}
	}

	private void scribe(EventNamespace eventnamespace)
	{
		scribeClient.scribeSyndicatedSdkImpressionEvents(new EventNamespace[] {
			eventnamespace
		});
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DefaultScribeClient scribeClient>
	//    2    4:iconst_1        
	//    3    5:anewarray       EventNamespace[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:invokevirtual   #33  <Method void DefaultScribeClient.scribeSyndicatedSdkImpressionEvents(EventNamespace[])>
	//    9   15:return          
	}

	public void dailyPing()
	{
		scribe((new com.twitter.sdk.android.core.internal.scribe.EventNamespace.Builder()).setClient("android").setPage("digits").setSection("").setComponent("").setElement("").setAction("impression").builder());
	//    0    0:aload_0         
	//    1    1:new             #36  <Class com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder>
	//    2    4:dup             
	//    3    5:invokespecial   #37  <Method void com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder()>
	//    4    8:ldc1            #39  <String "android">
	//    5   10:invokevirtual   #43  <Method com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder.setClient(String)>
	//    6   13:ldc1            #45  <String "digits">
	//    7   15:invokevirtual   #48  <Method com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder.setPage(String)>
	//    8   18:ldc1            #50  <String "">
	//    9   20:invokevirtual   #53  <Method com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder.setSection(String)>
	//   10   23:ldc1            #50  <String "">
	//   11   25:invokevirtual   #56  <Method com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder.setComponent(String)>
	//   12   28:ldc1            #50  <String "">
	//   13   30:invokevirtual   #59  <Method com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder.setElement(String)>
	//   14   33:ldc1            #61  <String "impression">
	//   15   35:invokevirtual   #64  <Method com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder.setAction(String)>
	//   16   38:invokevirtual   #68  <Method EventNamespace com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder.builder()>
	//   17   41:invokespecial   #70  <Method void scribe(EventNamespace)>
	//   18   44:return          
	}

	private final DefaultScribeClient scribeClient;
}
