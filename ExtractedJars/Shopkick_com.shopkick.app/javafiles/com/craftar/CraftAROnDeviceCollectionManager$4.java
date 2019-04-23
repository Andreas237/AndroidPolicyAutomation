// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.os.Handler;

// Referenced classes of package com.craftar:
//			CraftAROnDeviceCollectionManager, CraftAROnDeviceCollection

class CraftAROnDeviceCollectionManager$4
	implements Runnable
{

	public void run()
	{
		CraftAROnDeviceCollectionManager.access$100(CraftAROnDeviceCollectionManager.this, val$collection.getUUID());
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CraftAROnDeviceCollectionManager this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field CraftAROnDeviceCollection val$collection>
	//    4    8:invokevirtual   #38  <Method String CraftAROnDeviceCollection.getUUID()>
	//    5   11:invokestatic    #42  <Method void CraftAROnDeviceCollectionManager.access$100(CraftAROnDeviceCollectionManager, String)>
		if(val$listener != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #27  <Field CraftAROnDeviceCollectionManager$DeleteCollectionListener val$listener>
	//*   8   18:ifnull          40
			mResponseHandlerThread.post(new Runnable() {

				public void run()
				{
					listener.collectionDeleted();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field CraftAROnDeviceCollectionManager$4 this$1>
				//    2    4:getfield        #24  <Field CraftAROnDeviceCollectionManager$DeleteCollectionListener CraftAROnDeviceCollectionManager$4.val$listener>
				//    3    7:invokeinterface #29  <Method void CraftAROnDeviceCollectionManager$DeleteCollectionListener.collectionDeleted()>
				//    4   12:return          
				}

				final CraftAROnDeviceCollectionManager._cls4 this$1;

			
			{
				this$1 = CraftAROnDeviceCollectionManager._cls4.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CraftAROnDeviceCollectionManager$4 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    9   21:aload_0         
	//   10   22:getfield        #23  <Field CraftAROnDeviceCollectionManager this$0>
	//   11   25:getfield        #46  <Field Handler CraftAROnDeviceCollectionManager.mResponseHandlerThread>
	//   12   28:new             #13  <Class CraftAROnDeviceCollectionManager$4$1>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:invokespecial   #49  <Method void CraftAROnDeviceCollectionManager$4$1(CraftAROnDeviceCollectionManager$4)>
	//   16   36:invokevirtual   #55  <Method boolean Handler.post(Runnable)>
	//   17   39:pop             
	//   18   40:return          
	}

	final CraftAROnDeviceCollectionManager this$0;
	final CraftAROnDeviceCollection val$collection;
	final leteCollectionListener val$listener;

	CraftAROnDeviceCollectionManager$4()
	{
		this$0 = final_craftarondevicecollectionmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field CraftAROnDeviceCollectionManager this$0>
		val$collection = craftarondevicecollection;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field CraftAROnDeviceCollection val$collection>
		val$listener = leteCollectionListener.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field CraftAROnDeviceCollectionManager$DeleteCollectionListener val$listener>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #30  <Method void Object()>
	//   11   19:return          
	}
}
