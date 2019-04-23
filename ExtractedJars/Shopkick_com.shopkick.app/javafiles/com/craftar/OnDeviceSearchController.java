// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.os.Handler;

// Referenced classes of package com.craftar:
//			SearchController, CLog, CraftAROnDeviceIR, CraftARQueryImage, 
//			CraftARError, CraftARSearchResponseHandler

public class OnDeviceSearchController
	implements SearchController
{

	public OnDeviceSearchController(CraftAROnDeviceIR craftarondeviceir)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mIsFinding = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field boolean mIsFinding>
		mOnDeviceIR = craftarondeviceir;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #21  <Field CraftAROnDeviceIR mOnDeviceIR>
	//    8   14:return          
	}

	public void onFinderActivated()
	{
		CLog.i("Finder activated");
	//    0    0:ldc1            #25  <String "Finder activated">
	//    1    2:invokestatic    #31  <Method void CLog.i(String)>
		mIsFinding = true;
	//    2    5:aload_0         
	//    3    6:iconst_1        
	//    4    7:putfield        #19  <Field boolean mIsFinding>
	//    5   10:return          
	}

	public void onFinderDeactivated()
	{
		CLog.i("Finder deactivated");
	//    0    0:ldc1            #34  <String "Finder deactivated">
	//    1    2:invokestatic    #31  <Method void CLog.i(String)>
		mIsFinding = false;
	//    2    5:aload_0         
	//    3    6:iconst_0        
	//    4    7:putfield        #19  <Field boolean mIsFinding>
	//    5   10:return          
	}

	public void onPictureTaken(CraftARQueryImage craftarqueryimage)
	{
		mOnDeviceIR.search(craftarqueryimage);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field CraftAROnDeviceIR mOnDeviceIR>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #41  <Method void CraftAROnDeviceIR.search(CraftARQueryImage)>
	//    4    8:return          
	}

	public void onPreviewFrame(CraftARQueryImage craftarqueryimage)
	{
		if(mIsFinding && mOnDeviceIR.getPendingSearchRequestsCount() <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field boolean mIsFinding>
	//*   2    4:ifeq            30
	//*   3    7:aload_0         
	//*   4    8:getfield        #21  <Field CraftAROnDeviceIR mOnDeviceIR>
	//*   5   11:invokevirtual   #46  <Method int CraftAROnDeviceIR.getPendingSearchRequestsCount()>
	//*   6   14:ifgt            30
		{
			CLog.i("OnDeviceSearchController: Finder search");
	//    7   17:ldc1            #48  <String "OnDeviceSearchController: Finder search">
	//    8   19:invokestatic    #31  <Method void CLog.i(String)>
			mOnDeviceIR.search(craftarqueryimage);
	//    9   22:aload_0         
	//   10   23:getfield        #21  <Field CraftAROnDeviceIR mOnDeviceIR>
	//   11   26:aload_1         
	//   12   27:invokevirtual   #41  <Method void CraftAROnDeviceIR.search(CraftARQueryImage)>
		}
	//   13   30:return          
	}

	public void onTakePictureFailed(final CraftARError error)
	{
		CLog.e("OnDevice : Take picture failed, unable to search!");
	//    0    0:ldc1            #52  <String "OnDevice : Take picture failed, unable to search!">
	//    1    2:invokestatic    #55  <Method void CLog.e(String)>
		CraftAROnDeviceIR.mResponseHandlerThread.post(new Runnable() {

			public void run()
			{
				CraftARSearchResponseHandler craftarsearchresponsehandler = mOnDeviceIR.getCraftARSearchResponseHandler();
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field OnDeviceSearchController this$0>
			//    2    4:getfield        #30  <Field CraftAROnDeviceIR OnDeviceSearchController.mOnDeviceIR>
			//    3    7:invokevirtual   #36  <Method CraftARSearchResponseHandler CraftAROnDeviceIR.getCraftARSearchResponseHandler()>
			//    4   10:astore_1        
				if(craftarsearchresponsehandler != null)
			//*   5   11:aload_1         
			//*   6   12:ifnull          27
				{
					craftarsearchresponsehandler.searchFailed(error, -1);
			//    7   15:aload_1         
			//    8   16:aload_0         
			//    9   17:getfield        #21  <Field CraftARError val$error>
			//   10   20:iconst_m1       
			//   11   21:invokeinterface #42  <Method void CraftARSearchResponseHandler.searchFailed(CraftARError, int)>
					return;
			//   12   26:return          
				} else
				{
					CLog.e(error.getErrorMessage());
			//   13   27:aload_0         
			//   14   28:getfield        #21  <Field CraftARError val$error>
			//   15   31:invokevirtual   #48  <Method String CraftARError.getErrorMessage()>
			//   16   34:invokestatic    #54  <Method void CLog.e(String)>
					return;
			//   17   37:return          
				}
			}

			final OnDeviceSearchController this$0;
			final CraftARError val$error;

			
			{
				this$0 = OnDeviceSearchController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field OnDeviceSearchController this$0>
				error = craftarerror;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CraftARError val$error>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    2    5:getstatic       #59  <Field Handler CraftAROnDeviceIR.mResponseHandlerThread>
	//    3    8:new             #8   <Class OnDeviceSearchController$1>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:invokespecial   #62  <Method void OnDeviceSearchController$1(OnDeviceSearchController, CraftARError)>
	//    8   17:invokevirtual   #68  <Method boolean Handler.post(Runnable)>
	//    9   20:pop             
	//   10   21:return          
	}

	boolean mIsFinding;
	CraftAROnDeviceIR mOnDeviceIR;
}
