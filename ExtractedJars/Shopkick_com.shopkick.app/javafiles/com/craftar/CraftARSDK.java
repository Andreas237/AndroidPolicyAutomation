// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftARGenericSDK, Build, ImplCraftARCamera, CraftARActivity, 
//			AppEventForwarder, CraftARCamera, SearchController

public class CraftARSDK extends CraftARGenericSDK
{

	public CraftARSDK()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CraftARGenericSDK()>
	//    2    4:return          
	}

	public static CraftARSDK Instance()
	{
		if(instance == null)
	//*   0    0:getstatic       #19  <Field CraftARSDK instance>
	//*   1    3:ifnonnull       25
		{
			Build.setup();
	//    2    6:invokestatic    #24  <Method void Build.setup()>
			instance = new CraftARSDK();
	//    3    9:new             #2   <Class CraftARSDK>
	//    4   12:dup             
	//    5   13:invokespecial   #25  <Method void CraftARSDK()>
	//    6   16:putstatic       #19  <Field CraftARSDK instance>
			genericInstance = ((CraftARGenericSDK) (instance));
	//    7   19:getstatic       #19  <Field CraftARSDK instance>
	//    8   22:putstatic       #29  <Field CraftARGenericSDK genericInstance>
		}
		return instance;
	//    9   25:getstatic       #19  <Field CraftARSDK instance>
	//   10   28:areturn         
	}

	CraftARActivity getActivity()
	{
		return mActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field CraftARActivity mActivity>
	//    2    4:areturn         
	}

	public CraftARCamera getCamera()
	{
		return ((CraftARCamera) (mCraftARCamera));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ImplCraftARCamera mCraftARCamera>
	//    2    4:areturn         
	}

	public void setSearchController(SearchController searchcontroller)
	{
		mSearchController = searchcontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field SearchController mSearchController>
		mCraftARCamera.setCameraHandler(((CraftARCamera.CraftARCameraCallbacks) (searchcontroller)));
	//    3    5:aload_0         
	//    4    6:getfield        #37  <Field ImplCraftARCamera mCraftARCamera>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #49  <Method void ImplCraftARCamera.setCameraHandler(CraftARCamera$CraftARCameraCallbacks)>
	//    7   13:return          
	}

	public void singleShotSearch()
	{
		mCraftARCamera.takePicture();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ImplCraftARCamera mCraftARCamera>
	//    2    4:invokevirtual   #53  <Method void ImplCraftARCamera.takePicture()>
	//    3    7:return          
	}

	public void startCapture(CraftARActivity craftaractivity)
	{
		mActivity = craftaractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field CraftARActivity mActivity>
		if(mCraftARCamera == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #37  <Field ImplCraftARCamera mCraftARCamera>
	//*   5    9:ifnonnull       37
		{
			mCraftARCamera = new ImplCraftARCamera(mActivity.getApplicationContext());
	//    6   12:aload_0         
	//    7   13:new             #45  <Class ImplCraftARCamera>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #33  <Field CraftARActivity mActivity>
	//   11   21:invokevirtual   #61  <Method android.content.Context CraftARActivity.getApplicationContext()>
	//   12   24:invokespecial   #64  <Method void ImplCraftARCamera(android.content.Context)>
	//   13   27:putfield        #37  <Field ImplCraftARCamera mCraftARCamera>
			AppEventForwarder.addAppEventListener(((AppEventListener) (mCraftARCamera)));
	//   14   30:aload_0         
	//   15   31:getfield        #37  <Field ImplCraftARCamera mCraftARCamera>
	//   16   34:invokestatic    #70  <Method void AppEventForwarder.addAppEventListener(AppEventListener)>
		}
		mCraftARCamera.startCapture();
	//   17   37:aload_0         
	//   18   38:getfield        #37  <Field ImplCraftARCamera mCraftARCamera>
	//   19   41:invokevirtual   #72  <Method void ImplCraftARCamera.startCapture()>
	//   20   44:return          
	}

	void updateItemsInfo()
	{
	//    0    0:return          
	}

	private static CraftARSDK instance;
	private CraftARActivity mActivity;
	ImplCraftARCamera mCraftARCamera;
}
