// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceIR, SetOnDeviceCollectionListener, CraftARError, CLog

class CraftAROnDeviceIR$1
	implements Runnable
{

	public void run()
	{
		SetOnDeviceCollectionListener setondevicecollectionlistener = val$listener;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SetOnDeviceCollectionListener val$listener>
	//    2    4:astore_1        
		if(setondevicecollectionlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
		{
			setondevicecollectionlistener.setCollectionFailed(val$error);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #25  <Field CraftARError val$error>
	//    8   14:invokeinterface #36  <Method void SetOnDeviceCollectionListener.setCollectionFailed(CraftARError)>
			return;
	//    9   19:return          
		} else
		{
			CLog.e(val$error.getErrorMessage());
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field CraftARError val$error>
	//   12   24:invokevirtual   #42  <Method String CraftARError.getErrorMessage()>
	//   13   27:invokestatic    #48  <Method void CLog.e(String)>
			return;
	//   14   30:return          
		}
	}

	final CraftAROnDeviceIR this$0;
	final CraftARError val$error;
	final SetOnDeviceCollectionListener val$listener;

	CraftAROnDeviceIR$1()
	{
		this$0 = final_craftarondeviceir;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CraftAROnDeviceIR this$0>
		val$listener = setondevicecollectionlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field SetOnDeviceCollectionListener val$listener>
		val$error = CraftARError.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field CraftARError val$error>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
