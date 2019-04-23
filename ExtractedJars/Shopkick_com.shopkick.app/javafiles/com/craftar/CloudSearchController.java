// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.os.Handler;
import android.os.HandlerThread;

// Referenced classes of package com.craftar:
//			SearchController, CLog, CraftARCloudRecognition, CraftARQueryImage, 
//			NV21, CraftARError, CraftARSearchResponseHandler

public class CloudSearchController extends HandlerThread
	implements SearchController
{

	public CloudSearchController(CraftARCloudRecognition craftarcloudrecognition)
	{
		super("CloudSearchController");
	//    0    0:aload_0         
	//    1    1:ldc1            #28  <String "CloudSearchController">
	//    2    3:invokespecial   #31  <Method void HandlerThread(String)>
		mSearchCount = 0;
	//    3    6:aload_0         
	//    4    7:iconst_0        
	//    5    8:putfield        #33  <Field int mSearchCount>
		lastSearchTime = 0L;
	//    6   11:aload_0         
	//    7   12:lconst_0        
	//    8   13:putfield        #35  <Field long lastSearchTime>
		mSearchPeriod = 500L;
	//    9   16:aload_0         
	//   10   17:ldc2w           #13  <Long 500L>
	//   11   20:putfield        #37  <Field long mSearchPeriod>
		mIsFinding = false;
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:putfield        #39  <Field boolean mIsFinding>
		mCloudIR = craftarcloudrecognition;
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:putfield        #41  <Field CraftARCloudRecognition mCloudIR>
		start();
	//   18   33:aload_0         
	//   19   34:invokevirtual   #45  <Method void start()>
	//   20   37:return          
	}

	private void prepareHandler()
	{
		if(getLooper() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #51  <Method android.os.Looper getLooper()>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(mHandler == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #53  <Field Handler mHandler>
	//*   6   12:ifnonnull       30
			mHandler = new Handler(getLooper());
	//    7   15:aload_0         
	//    8   16:new             #55  <Class Handler>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokevirtual   #51  <Method android.os.Looper getLooper()>
	//   12   24:invokespecial   #58  <Method void Handler(android.os.Looper)>
	//   13   27:putfield        #53  <Field Handler mHandler>
	//   14   30:return          
	}

	public Handler getHandler()
	{
		return mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Handler mHandler>
	//    2    4:areturn         
	}

	public void onFinderActivated()
	{
		CLog.i("Finder activated");
	//    0    0:ldc1            #63  <String "Finder activated">
	//    1    2:invokestatic    #68  <Method void CLog.i(String)>
		mIsFinding = true;
	//    2    5:aload_0         
	//    3    6:iconst_1        
	//    4    7:putfield        #39  <Field boolean mIsFinding>
	//    5   10:return          
	}

	public void onFinderDeactivated()
	{
		CLog.i("Finder deactivated");
	//    0    0:ldc1            #71  <String "Finder deactivated">
	//    1    2:invokestatic    #68  <Method void CLog.i(String)>
		mIsFinding = false;
	//    2    5:aload_0         
	//    3    6:iconst_0        
	//    4    7:putfield        #39  <Field boolean mIsFinding>
		mCloudIR.cancelPendingSearches();
	//    5   10:aload_0         
	//    6   11:getfield        #41  <Field CraftARCloudRecognition mCloudIR>
	//    7   14:invokevirtual   #76  <Method void CraftARCloudRecognition.cancelPendingSearches()>
	//    8   17:return          
	}

	public void onLooperPrepared()
	{
		prepareHandler();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void prepareHandler()>
	//    2    4:return          
	}

	public void onPictureTaken(CraftARQueryImage craftarqueryimage)
	{
		mCloudIR.search(craftarqueryimage);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field CraftARCloudRecognition mCloudIR>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #84  <Method void CraftARCloudRecognition.search(CraftARQueryImage)>
	//    4    8:return          
	}

	public void onPreviewFrame(final CraftARQueryImage queryImage)
	{
		if(mIsFinding && mCloudIR.getPendingSearchRequestsCount() <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field boolean mIsFinding>
	//*   2    4:ifeq            115
	//*   3    7:aload_0         
	//*   4    8:getfield        #41  <Field CraftARCloudRecognition mCloudIR>
	//*   5   11:invokevirtual   #89  <Method int CraftARCloudRecognition.getPendingSearchRequestsCount()>
	//*   6   14:ifgt            115
		{
			long l = System.currentTimeMillis();
	//    7   17:invokestatic    #95  <Method long System.currentTimeMillis()>
	//    8   20:lstore_3        
			if(l - lastSearchTime > mSearchPeriod)
	//*   9   21:lload_3         
	//*  10   22:aload_0         
	//*  11   23:getfield        #35  <Field long lastSearchTime>
	//*  12   26:lsub            
	//*  13   27:aload_0         
	//*  14   28:getfield        #37  <Field long mSearchPeriod>
	//*  15   31:lcmp            
	//*  16   32:ifle            115
			{
				lastSearchTime = l;
	//   17   35:aload_0         
	//   18   36:lload_3         
	//   19   37:putfield        #35  <Field long lastSearchTime>
				mSearchCount = mSearchCount + 1;
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #33  <Field int mSearchCount>
	//   23   45:iconst_1        
	//   24   46:iadd            
	//   25   47:putfield        #33  <Field int mSearchCount>
				final int currentSearchCount = mSearchCount;
	//   26   50:aload_0         
	//   27   51:getfield        #33  <Field int mSearchCount>
	//   28   54:istore_2        
				queryImage = new CraftARQueryImage(new NV21((byte[])((byte []) (queryImage.dataNV21.data)).clone(), queryImage.dataNV21.width, queryImage.dataNV21.height));
	//   29   55:new             #97  <Class CraftARQueryImage>
	//   30   58:dup             
	//   31   59:new             #99  <Class NV21>
	//   32   62:dup             
	//   33   63:aload_1         
	//   34   64:getfield        #103 <Field NV21 CraftARQueryImage.dataNV21>
	//   35   67:getfield        #107 <Field byte[] NV21.data>
	//   36   70:invokevirtual   #112 <Method Object _5B_B.clone()>
	//   37   73:checkcast       #108 <Class byte[]>
	//   38   76:aload_1         
	//   39   77:getfield        #103 <Field NV21 CraftARQueryImage.dataNV21>
	//   40   80:getfield        #115 <Field int NV21.width>
	//   41   83:aload_1         
	//   42   84:getfield        #103 <Field NV21 CraftARQueryImage.dataNV21>
	//   43   87:getfield        #118 <Field int NV21.height>
	//   44   90:invokespecial   #121 <Method void NV21(byte[], int, int)>
	//   45   93:invokespecial   #124 <Method void CraftARQueryImage(NV21)>
	//   46   96:astore_1        
				mHandler.post(new Runnable() {

					public void run()
					{
						if(mIsFinding)
					//*   0    0:aload_0         
					//*   1    1:getfield        #21  <Field CloudSearchController this$0>
					//*   2    4:getfield        #34  <Field boolean CloudSearchController.mIsFinding>
					//*   3    7:ifeq            28
							mCloudIR.search(queryImage, currentSearchCount);
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

			
			{
				this$0 = CloudSearchController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CloudSearchController this$0>
				queryImage = craftarqueryimage;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field CraftARQueryImage val$queryImage>
				currentSearchCount = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int val$currentSearchCount>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
				}
);
	//   47   97:aload_0         
	//   48   98:getfield        #53  <Field Handler mHandler>
	//   49  101:new             #8   <Class CloudSearchController$1>
	//   50  104:dup             
	//   51  105:aload_0         
	//   52  106:aload_1         
	//   53  107:iload_2         
	//   54  108:invokespecial   #127 <Method void CloudSearchController$1(CloudSearchController, CraftARQueryImage, int)>
	//   55  111:invokevirtual   #131 <Method boolean Handler.post(Runnable)>
	//   56  114:pop             
			}
		}
	//   57  115:return          
	}

	public void onTakePictureFailed(final CraftARError error)
	{
		CLog.e("OnDevice : Take picture failed, unable to search!");
	//    0    0:ldc1            #135 <String "OnDevice : Take picture failed, unable to search!">
	//    1    2:invokestatic    #138 <Method void CLog.e(String)>
		mCloudIR.mResponseHandlerThread.post(new Runnable() {

			public void run()
			{
				CraftARSearchResponseHandler craftarsearchresponsehandler = mCloudIR.getCraftARSearchResponseHandler();
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CloudSearchController this$0>
			//    2    4:getfield        #30  <Field CraftARCloudRecognition CloudSearchController.mCloudIR>
			//    3    7:invokevirtual   #36  <Method CraftARSearchResponseHandler CraftARCloudRecognition.getCraftARSearchResponseHandler()>
			//    4   10:astore_1        
				if(craftarsearchresponsehandler != null)
			//*   5   11:aload_1         
			//*   6   12:ifnull          26
					craftarsearchresponsehandler.searchFailed(error, -1);
			//    7   15:aload_1         
			//    8   16:aload_0         
			//    9   17:getfield        #21  <Field CraftARError val$error>
			//   10   20:iconst_m1       
			//   11   21:invokeinterface #42  <Method void CraftARSearchResponseHandler.searchFailed(CraftARError, int)>
			//   12   26:return          
			}

			final CloudSearchController this$0;
			final CraftARError val$error;

			
			{
				this$0 = CloudSearchController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CloudSearchController this$0>
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
	//    2    5:aload_0         
	//    3    6:getfield        #41  <Field CraftARCloudRecognition mCloudIR>
	//    4    9:getfield        #141 <Field Handler CraftARCloudRecognition.mResponseHandlerThread>
	//    5   12:new             #10  <Class CloudSearchController$2>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:invokespecial   #144 <Method void CloudSearchController$2(CloudSearchController, CraftARError)>
	//   10   21:invokevirtual   #131 <Method boolean Handler.post(Runnable)>
	//   11   24:pop             
	//   12   25:return          
	}

	public boolean setSearchPeriod(long l)
	{
		if(l < 500L)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #13  <Long 500L>
	//*   2    4:lcmp            
	//*   3    5:ifge            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #148 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #150 <Method void StringBuilder()>
	//    7   15:astore_3        
			stringbuilder.append("Error: requesting searchPeriod ");
	//    8   16:aload_3         
	//    9   17:ldc1            #152 <String "Error: requesting searchPeriod ">
	//   10   19:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
			stringbuilder.append(l);
	//   12   23:aload_3         
	//   13   24:lload_1         
	//   14   25:invokevirtual   #159 <Method StringBuilder StringBuilder.append(long)>
	//   15   28:pop             
			CLog.e(stringbuilder.toString());
	//   16   29:aload_3         
	//   17   30:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #138 <Method void CLog.e(String)>
			return false;
	//   19   36:iconst_0        
	//   20   37:ireturn         
		} else
		{
			mSearchPeriod = l;
	//   21   38:aload_0         
	//   22   39:lload_1         
	//   23   40:putfield        #37  <Field long mSearchPeriod>
			return true;
	//   24   43:iconst_1        
	//   25   44:ireturn         
		}
	}

	public void start()
	{
		super.start();
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method void HandlerThread.start()>
		prepareHandler();
	//    2    4:aload_0         
	//    3    5:invokespecial   #79  <Method void prepareHandler()>
	//    4    8:return          
	}

	private static final long MIN_PERIOD_MS = 500L;
	long lastSearchTime;
	CraftARCloudRecognition mCloudIR;
	Handler mHandler;
	boolean mIsFinding;
	int mSearchCount;
	long mSearchPeriod;
}
