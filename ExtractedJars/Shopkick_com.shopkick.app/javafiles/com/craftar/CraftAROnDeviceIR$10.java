// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceIR, SetOnDeviceCollectionListener, SetCollectionListener

class CraftAROnDeviceIR$10
	implements Runnable
{

	public void run()
	{
		SetCollectionListener setcollectionlistener = val$setCollectionListener;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SetCollectionListener val$setCollectionListener>
	//    2    4:astore_1        
		if(setcollectionlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
			((SetOnDeviceCollectionListener)setcollectionlistener).setCollectionProgress(val$progress);
	//    5    9:aload_1         
	//    6   10:checkcast       #32  <Class SetOnDeviceCollectionListener>
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field float val$progress>
	//    9   17:f2d             
	//   10   18:invokeinterface #36  <Method void SetOnDeviceCollectionListener.setCollectionProgress(double)>
	//   11   23:return          
	}

	final CraftAROnDeviceIR this$0;
	final float val$progress;
	final SetCollectionListener val$setCollectionListener;

	CraftAROnDeviceIR$10()
	{
		this$0 = final_craftarondeviceir;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CraftAROnDeviceIR this$0>
		val$setCollectionListener = setcollectionlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field SetCollectionListener val$setCollectionListener>
		val$progress = F.this;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #25  <Field float val$progress>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
