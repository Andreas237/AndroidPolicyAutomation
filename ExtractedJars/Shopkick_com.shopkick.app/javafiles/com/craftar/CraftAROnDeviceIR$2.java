// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceIR, CraftAROnDeviceCollection, SetOnDeviceCollectionListener

class CraftAROnDeviceIR$2
	implements Runnable
{

	public void run()
	{
		CraftAROnDeviceIR.access$000(CraftAROnDeviceIR.this, val$listener, val$collection, val$setAsActiveCollection);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CraftAROnDeviceIR this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field SetOnDeviceCollectionListener val$listener>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field CraftAROnDeviceCollection val$collection>
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field boolean val$setAsActiveCollection>
	//    8   16:invokestatic    #37  <Method void CraftAROnDeviceIR.access$000(CraftAROnDeviceIR, SetOnDeviceCollectionListener, CraftAROnDeviceCollection, boolean)>
	//    9   19:return          
	}

	final CraftAROnDeviceIR this$0;
	final CraftAROnDeviceCollection val$collection;
	final SetOnDeviceCollectionListener val$listener;
	final boolean val$setAsActiveCollection;

	CraftAROnDeviceIR$2()
	{
		this$0 = final_craftarondeviceir;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field CraftAROnDeviceIR this$0>
		val$listener = setondevicecollectionlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field SetOnDeviceCollectionListener val$listener>
		val$collection = craftarondevicecollection;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field CraftAROnDeviceCollection val$collection>
		val$setAsActiveCollection = Z.this;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #29  <Field boolean val$setAsActiveCollection>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
