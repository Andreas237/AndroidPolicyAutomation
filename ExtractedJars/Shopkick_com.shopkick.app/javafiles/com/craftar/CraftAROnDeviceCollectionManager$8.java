// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceCollectionManager

class CraftAROnDeviceCollectionManager$8
	implements Runnable
{

	public void run()
	{
		CraftAROnDeviceCollectionManager.access$400(CraftAROnDeviceCollectionManager.this, val$token, val$tag, val$listener);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field CraftAROnDeviceCollectionManager this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field String val$token>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field String val$tag>
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
	//    8   16:invokestatic    #36  <Method void CraftAROnDeviceCollectionManager.access$400(CraftAROnDeviceCollectionManager, String, String, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//    9   19:return          
	}

	final CraftAROnDeviceCollectionManager this$0;
	final dCollectionListener val$listener;
	final String val$tag;
	final String val$token;

	CraftAROnDeviceCollectionManager$8()
	{
		this$0 = final_craftarondevicecollectionmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field CraftAROnDeviceCollectionManager this$0>
		val$token = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field String val$token>
		val$tag = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field String val$tag>
		val$listener = dCollectionListener.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
