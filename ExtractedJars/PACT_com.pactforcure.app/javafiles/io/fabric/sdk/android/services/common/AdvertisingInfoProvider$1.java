// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			BackgroundPriorityRunnable, AdvertisingInfoProvider, AdvertisingInfo

class AdvertisingInfoProvider$1 extends BackgroundPriorityRunnable
{

	public void onRun()
	{
		AdvertisingInfo advertisinginfo = AdvertisingInfoProvider.access$000(AdvertisingInfoProvider.this);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AdvertisingInfoProvider this$0>
	//    2    4:invokestatic    #28  <Method AdvertisingInfo AdvertisingInfoProvider.access$000(AdvertisingInfoProvider)>
	//    3    7:astore_1        
		if(!val$advertisingInfo.equals(((Object) (advertisinginfo))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #19  <Field AdvertisingInfo val$advertisingInfo>
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #34  <Method boolean AdvertisingInfo.equals(Object)>
	//*   8   16:ifne            39
		{
			Fabric.getLogger().d("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
	//    9   19:invokestatic    #40  <Method Logger Fabric.getLogger()>
	//   10   22:ldc1            #42  <String "Fabric">
	//   11   24:ldc1            #44  <String "Asychronously getting Advertising Info and storing it to preferences">
	//   12   26:invokeinterface #50  <Method void Logger.d(String, String)>
			AdvertisingInfoProvider.access$100(AdvertisingInfoProvider.this, advertisinginfo);
	//   13   31:aload_0         
	//   14   32:getfield        #17  <Field AdvertisingInfoProvider this$0>
	//   15   35:aload_1         
	//   16   36:invokestatic    #53  <Method void AdvertisingInfoProvider.access$100(AdvertisingInfoProvider, AdvertisingInfo)>
		}
	//   17   39:return          
	}

	final AdvertisingInfoProvider this$0;
	final AdvertisingInfo val$advertisingInfo;

	AdvertisingInfoProvider$1()
	{
		this$0 = final_advertisinginfoprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AdvertisingInfoProvider this$0>
		val$advertisingInfo = AdvertisingInfo.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field AdvertisingInfo val$advertisingInfo>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void BackgroundPriorityRunnable()>
	//    8   14:return          
	}
}
