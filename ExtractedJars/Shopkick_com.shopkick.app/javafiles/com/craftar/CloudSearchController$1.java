// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CloudSearchController, CraftARCloudRecognition, CraftARQueryImage

class CloudSearchController$1
	implements Runnable
{

	public void run()
	{
		if(mIsFinding)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field CloudSearchController this$0>
	//*   2    4:getfield        #34  <Field boolean CloudSearchController.mIsFinding>
	//*   3    7:ifeq            28
			mCloudIR.search(val$queryImage, val$currentSearchCount);
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field CloudSearchController this$0>
	//    6   14:getfield        #38  <Field CraftARCloudRecognition CloudSearchController.mCloudIR>
	//    7   17:aload_0         
	//    8   18:getfield        #23  <Field CraftARQueryImage val$queryImage>
	//    9   21:aload_0         
	//   10   22:getfield        #25  <Field int val$currentSearchCount>
	//   11   25:invokevirtual   #44  <Method void CraftARCloudRecognition.search(CraftARQueryImage, int)>
	//   12   28:return          
	}

	final CloudSearchController this$0;
	final int val$currentSearchCount;
	final CraftARQueryImage val$queryImage;

	CloudSearchController$1()
	{
		this$0 = final_cloudsearchcontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CloudSearchController this$0>
		val$queryImage = craftarqueryimage;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field CraftARQueryImage val$queryImage>
		val$currentSearchCount = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field int val$currentSearchCount>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
