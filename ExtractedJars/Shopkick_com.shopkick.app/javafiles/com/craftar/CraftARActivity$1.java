// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftARActivity

class CraftARActivity$1
	implements eraClosedListener
{

	public void onCameraClosed()
	{
		onCameraReleased();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CraftARActivity this$0>
	//    2    4:invokevirtual   #25  <Method void CraftARActivity.onCameraReleased()>
	//    3    7:return          
	}

	final CraftARActivity this$0;

	CraftARActivity$1()
	{
		this$0 = CraftARActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CraftARActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
