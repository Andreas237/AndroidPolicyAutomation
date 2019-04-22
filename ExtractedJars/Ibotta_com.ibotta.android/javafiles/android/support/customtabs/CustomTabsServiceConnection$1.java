// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.content.ComponentName;

// Referenced classes of package android.support.customtabs:
//			CustomTabsClient, CustomTabsServiceConnection, ICustomTabsService

class CustomTabsServiceConnection$1 extends CustomTabsClient
{

	final CustomTabsServiceConnection this$0;

	CustomTabsServiceConnection$1(ICustomTabsService icustomtabsservice, ComponentName componentname)
	{
		this$0 = CustomTabsServiceConnection.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CustomTabsServiceConnection this$0>
		super(icustomtabsservice, componentname);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #18  <Method void CustomTabsClient(ICustomTabsService, ComponentName)>
	//    7   11:return          
	}
}
