// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceCollectionManager

class CraftAROnDeviceCollectionManager$7
	implements Runnable
{

	public void run()
	{
		CraftAROnDeviceCollectionManager.access$400(CraftAROnDeviceCollectionManager.this, val$token, ((String) (null)), val$listener);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field String val$token>
	//    4    8:aconst_null     
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
	//    7   13:invokestatic    #34  <Method void CraftAROnDeviceCollectionManager.access$400(CraftAROnDeviceCollectionManager, String, String, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//    8   16:return          
	}

	final CraftAROnDeviceCollectionManager this$0;
	final dCollectionListener val$listener;
	final String val$token;

	CraftAROnDeviceCollectionManager$7()
	{
		this$0 = final_craftarondevicecollectionmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
		val$token = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String val$token>
		val$listener = dCollectionListener.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
