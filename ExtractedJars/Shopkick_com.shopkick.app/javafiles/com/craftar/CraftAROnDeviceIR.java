// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.*;
import java.util.*;
import java.util.zip.ZipFile;

// Referenced classes of package com.craftar:
//			ImageRecognition, OnDeviceSearchController, CraftARGenericSDK, Build, 
//			CraftARError, CRE, CLog, CraftAROnDeviceCollectionManager, 
//			CREResult, SetOnDeviceCollectionListener, CraftARSearchResponseHandler, CraftARQueryImage, 
//			NV21, CraftAROnDeviceCollection, CraftARImage, CraftARResult, 
//			CraftARItem, FileUtil, SetCollectionListener, SearchController

public class CraftAROnDeviceIR extends ImageRecognition
{
	class OnDeviceCollectionStatus
	{

		public boolean loaded;
		public HashSet loadedImages;
		final CraftAROnDeviceIR this$0;

		public OnDeviceCollectionStatus()
		{
			this$0 = CraftAROnDeviceIR.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field CraftAROnDeviceIR this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			loaded = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #23  <Field boolean loaded>
			loadedImages = new HashSet();
		//    8   14:aload_0         
		//    9   15:new             #25  <Class HashSet>
		//   10   18:dup             
		//   11   19:invokespecial   #26  <Method void HashSet()>
		//   12   22:putfield        #28  <Field HashSet loadedImages>
		//   13   25:return          
		}
	}

	class OnDeviceHandlerThread extends HandlerThread
	{

		public void start()
		{
			super.start();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void HandlerThread.start()>
			mHandler = new Handler(getLooper());
		//    2    4:aload_0         
		//    3    5:getfield        #15  <Field CraftAROnDeviceIR this$0>
		//    4    8:new             #25  <Class Handler>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:invokevirtual   #29  <Method android.os.Looper getLooper()>
		//    8   16:invokespecial   #32  <Method void Handler(android.os.Looper)>
		//    9   19:putfield        #36  <Field Handler CraftAROnDeviceIR.mHandler>
			mHandler.post(new Runnable() {

				public void run()
				{
					initInternal();
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field CraftAROnDeviceIR$OnDeviceHandlerThread this$1>
				//    2    4:getfield        #28  <Field CraftAROnDeviceIR CraftAROnDeviceIR$OnDeviceHandlerThread.this$0>
				//    3    7:invokestatic    #32  <Method void CraftAROnDeviceIR.access$400(CraftAROnDeviceIR)>
				//    4   10:return          
				}

				final OnDeviceHandlerThread this$1;

			
			{
				this$1 = OnDeviceHandlerThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CraftAROnDeviceIR$OnDeviceHandlerThread this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
			}
);
		//   10   22:aload_0         
		//   11   23:getfield        #15  <Field CraftAROnDeviceIR this$0>
		//   12   26:getfield        #36  <Field Handler CraftAROnDeviceIR.mHandler>
		//   13   29:new             #9   <Class CraftAROnDeviceIR$OnDeviceHandlerThread$1>
		//   14   32:dup             
		//   15   33:aload_0         
		//   16   34:invokespecial   #39  <Method void CraftAROnDeviceIR$OnDeviceHandlerThread$1(CraftAROnDeviceIR$OnDeviceHandlerThread)>
		//   17   37:invokevirtual   #43  <Method boolean Handler.post(Runnable)>
		//   18   40:pop             
		//   19   41:return          
		}

		final CraftAROnDeviceIR this$0;

		public OnDeviceHandlerThread(String s)
		{
			this$0 = CraftAROnDeviceIR.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field CraftAROnDeviceIR this$0>
			super(s);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #18  <Method void HandlerThread(String)>
		//    6   10:return          
		}
	}

	class OnDeviceInternalCollectionEventsHandler
		implements CraftARInternalInterfaces.CollectionEventsHandler
	{

		public void onCollectionAdded(CraftAROnDeviceCollection craftarondevicecollection)
		{
			mHandler.post(new Runnable() {

				public void run()
				{
					CraftAROnDeviceIR.updateAvailableCollectionsInternal();
				//    0    0:invokestatic    #28  <Method void CraftAROnDeviceIR.access$500()>
				//    1    3:return          
				}

				final OnDeviceInternalCollectionEventsHandler this$1;

			
			{
				this$1 = OnDeviceInternalCollectionEventsHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CraftAROnDeviceIR$OnDeviceInternalCollectionEventsHandler this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field CraftAROnDeviceIR this$0>
		//    2    4:getfield        #27  <Field Handler CraftAROnDeviceIR.mHandler>
		//    3    7:new             #11  <Class CraftAROnDeviceIR$OnDeviceInternalCollectionEventsHandler$1>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:invokespecial   #30  <Method void CraftAROnDeviceIR$OnDeviceInternalCollectionEventsHandler$1(CraftAROnDeviceIR$OnDeviceInternalCollectionEventsHandler)>
		//    7   15:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
		//    8   18:pop             
		//    9   19:return          
		}

		public void onCollectionDeleted(String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #40  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #41  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Collection with uuid ");
		//    4    8:aload_2         
		//    5    9:ldc1            #43  <String "Collection with uuid ">
		//    6   11:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(s);
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			stringbuilder.append(" has been deleted!");
		//   12   21:aload_2         
		//   13   22:ldc1            #49  <String " has been deleted!">
		//   14   24:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   15   27:pop             
			CLog.d(stringbuilder.toString());
		//   16   28:aload_2         
		//   17   29:invokevirtual   #53  <Method String StringBuilder.toString()>
		//   18   32:invokestatic    #58  <Method void CLog.d(String)>
			unloadCollection(s);
		//   19   35:aload_0         
		//   20   36:getfield        #17  <Field CraftAROnDeviceIR this$0>
		//   21   39:aload_1         
		//   22   40:invokevirtual   #61  <Method void CraftAROnDeviceIR.unloadCollection(String)>
		//   23   43:return          
		}

		public void onCollectionModified(CraftAROnDeviceCollection craftarondevicecollection)
		{
		//    0    0:return          
		}

		final CraftAROnDeviceIR this$0;

		OnDeviceInternalCollectionEventsHandler()
		{
			this$0 = CraftAROnDeviceIR.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field CraftAROnDeviceIR this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}
	}


	CraftAROnDeviceIR(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void ImageRecognition()>
		mHandler = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #82  <Field Handler mHandler>
		queryIdentifier = 0L;
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:putfield        #84  <Field long queryIdentifier>
		numQueries = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #86  <Field int numQueries>
		mContext = context;
	//   11   19:aload_1         
	//   12   20:putstatic       #88  <Field Context mContext>
		mOnDeviceSearchController = new OnDeviceSearchController(this);
	//   13   23:aload_0         
	//   14   24:new             #90  <Class OnDeviceSearchController>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:invokespecial   #93  <Method void OnDeviceSearchController(CraftAROnDeviceIR)>
	//   18   32:putfield        #95  <Field OnDeviceSearchController mOnDeviceSearchController>
		context = ((Context) (new StringBuilder()));
	//   19   35:new             #97  <Class StringBuilder>
	//   20   38:dup             
	//   21   39:invokespecial   #98  <Method void StringBuilder()>
	//   22   42:astore_1        
		((StringBuilder) (context)).append(((Object) (mContext.getFilesDir())));
	//   23   43:aload_1         
	//   24   44:getstatic       #88  <Field Context mContext>
	//   25   47:invokevirtual   #104 <Method File Context.getFilesDir()>
	//   26   50:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   27   53:pop             
		((StringBuilder) (context)).append("/CraftARSDKConfig");
	//   28   54:aload_1         
	//   29   55:ldc1            #110 <String "/CraftARSDKConfig">
	//   30   57:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
		CONFIG_PATH = ((StringBuilder) (context)).toString();
	//   32   61:aload_0         
	//   33   62:aload_1         
	//   34   63:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   35   66:putfield        #119 <Field String CONFIG_PATH>
		mNumPendingSearchRequests = 0;
	//   36   69:aload_0         
	//   37   70:iconst_0        
	//   38   71:putfield        #121 <Field int mNumPendingSearchRequests>
	//   39   74:return          
	}

	public static CraftAROnDeviceIR Instance()
	{
		if(self == null && CraftARGenericSDK.context != null)
	//*   0    0:getstatic       #125 <Field CraftAROnDeviceIR self>
	//*   1    3:ifnonnull       76
	//*   2    6:getstatic       #130 <Field Context CraftARGenericSDK.context>
	//*   3    9:ifnull          76
		{
			Build.setup();
	//    4   12:invokestatic    #135 <Method void Build.setup()>
			self = new CraftAROnDeviceIR(CraftARGenericSDK.context);
	//    5   15:new             #2   <Class CraftAROnDeviceIR>
	//    6   18:dup             
	//    7   19:getstatic       #130 <Field Context CraftARGenericSDK.context>
	//    8   22:invokespecial   #137 <Method void CraftAROnDeviceIR(Context)>
	//    9   25:putstatic       #125 <Field CraftAROnDeviceIR self>
			CraftAROnDeviceIR craftarondeviceir = self;
	//   10   28:getstatic       #125 <Field CraftAROnDeviceIR self>
	//   11   31:astore_0        
			((Object) (craftarondeviceir)).getClass();
	//   12   32:aload_0         
	//   13   33:invokevirtual   #143 <Method Class Object.getClass()>
	//   14   36:pop             
			mHandlerThread = ((HandlerThread) (((OnDeviceHandlerThread) (craftarondeviceir)). new OnDeviceHandlerThread("OnDeviceHandlerThread")));
	//   15   37:new             #33  <Class CraftAROnDeviceIR$OnDeviceHandlerThread>
	//   16   40:dup             
	//   17   41:aload_0         
	//   18   42:ldc1            #144 <String "OnDeviceHandlerThread">
	//   19   44:invokespecial   #147 <Method void CraftAROnDeviceIR$OnDeviceHandlerThread(CraftAROnDeviceIR, String)>
	//   20   47:putstatic       #149 <Field HandlerThread mHandlerThread>
			craftarondeviceir = self;
	//   21   50:getstatic       #125 <Field CraftAROnDeviceIR self>
	//   22   53:astore_0        
			((Object) (craftarondeviceir)).getClass();
	//   23   54:aload_0         
	//   24   55:invokevirtual   #143 <Method Class Object.getClass()>
	//   25   58:pop             
			mOnDeviceInternalCollectionEventsHandler = ((CraftARInternalInterfaces.CollectionEventsHandler) (((OnDeviceInternalCollectionEventsHandler) (craftarondeviceir)). new OnDeviceInternalCollectionEventsHandler()));
	//   26   59:new             #38  <Class CraftAROnDeviceIR$OnDeviceInternalCollectionEventsHandler>
	//   27   62:dup             
	//   28   63:aload_0         
	//   29   64:invokespecial   #150 <Method void CraftAROnDeviceIR$OnDeviceInternalCollectionEventsHandler(CraftAROnDeviceIR)>
	//   30   67:putstatic       #152 <Field CraftARInternalInterfaces$CollectionEventsHandler mOnDeviceInternalCollectionEventsHandler>
			mHandlerThread.start();
	//   31   70:getstatic       #149 <Field HandlerThread mHandlerThread>
	//   32   73:invokevirtual   #157 <Method void HandlerThread.start()>
		}
		return self;
	//   33   76:getstatic       #125 <Field CraftAROnDeviceIR self>
	//   34   79:areturn         
	}

	private static CraftARError getCraftARError(int i)
	{
		if(i != 0xfffe7896)
	//*   0    0:iload_0         
	//*   1    1:ldc1            #188 <Int 0xfffe7896>
	//*   2    3:icmpeq          121
			if(i != -413)
	//*   3    6:iload_0         
	//*   4    7:sipush          -413
	//*   5   10:icmpeq          108
			{
				if(i != -304 && i != -300)
	//*   6   13:iload_0         
	//*   7   14:sipush          -304
	//*   8   17:icmpeq          95
	//*   9   20:iload_0         
	//*  10   21:sipush          -300
	//*  11   24:icmpeq          95
				{
					if(i != -200)
	//*  12   27:iload_0         
	//*  13   28:sipush          -200
	//*  14   31:icmpeq          82
						switch(i)
	//*  15   34:iload_0         
						{
	//*  16   35:tableswitch     -203 -202: default 56
	//	               -203 69
	//	               -202 121
						default:
							return new CraftARError(CraftARError.ERROR_CODES.ERROR_UNKNOWN, "Some error has been produced");
	//   17   56:new             #190 <Class CraftARError>
	//   18   59:dup             
	//   19   60:getstatic       #196 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_UNKNOWN>
	//   20   63:ldc1            #198 <String "Some error has been produced">
	//   21   65:invokespecial   #201 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   22   68:areturn         

						case -203: 
							return new CraftARError(CraftARError.ERROR_CODES.ERROR_IMAGE_HAS_TRANSPARENCY, "Transparent images are not supported");
	//   23   69:new             #190 <Class CraftARError>
	//   24   72:dup             
	//   25   73:getstatic       #204 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_IMAGE_HAS_TRANSPARENCY>
	//   26   76:ldc1            #206 <String "Transparent images are not supported">
	//   27   78:invokespecial   #201 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   28   81:areturn         

						case -202: 
							break;
						}
					else
						return new CraftARError(CraftARError.ERROR_CODES.ERROR_IMAGE_HAS_TRANSPARENCY, "Error loading image");
	//   29   82:new             #190 <Class CraftARError>
	//   30   85:dup             
	//   31   86:getstatic       #204 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_IMAGE_HAS_TRANSPARENCY>
	//   32   89:ldc1            #208 <String "Error loading image">
	//   33   91:invokespecial   #201 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   34   94:areturn         
				} else
				{
					return new CraftARError(CraftARError.ERROR_CODES.ERROR_READING_FILE, "File could not be opened");
	//   35   95:new             #190 <Class CraftARError>
	//   36   98:dup             
	//   37   99:getstatic       #211 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_READING_FILE>
	//   38  102:ldc1            #213 <String "File could not be opened">
	//   39  104:invokespecial   #201 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   40  107:areturn         
				}
			} else
			{
				return new CraftARError(CraftARError.ERROR_CODES.ERROR_IMAGE_TOO_SMALL, "Image is too small");
	//   41  108:new             #190 <Class CraftARError>
	//   42  111:dup             
	//   43  112:getstatic       #216 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_IMAGE_TOO_SMALL>
	//   44  115:ldc1            #218 <String "Image is too small">
	//   45  117:invokespecial   #201 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   46  120:areturn         
			}
		return new CraftARError(CraftARError.ERROR_CODES.ERROR_IMAGE_NO_DETAILS, "Image has no details");
	//   47  121:new             #190 <Class CraftARError>
	//   48  124:dup             
	//   49  125:getstatic       #221 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_IMAGE_NO_DETAILS>
	//   50  128:ldc1            #223 <String "Image has no details">
	//   51  130:invokespecial   #201 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   52  133:areturn         
	}

	private void initInternal()
	{
		if(mContext != null)
	//*   0    0:getstatic       #88  <Field Context mContext>
	//*   1    3:ifnull          151
		{
			mCRE = new CRE();
	//    2    6:new             #227 <Class CRE>
	//    3    9:dup             
	//    4   10:invokespecial   #228 <Method void CRE()>
	//    5   13:putstatic       #230 <Field CRE mCRE>
			CLog.d("Creating engine...");
	//    6   16:ldc1            #232 <String "Creating engine...">
	//    7   18:invokestatic    #237 <Method void CLog.d(String)>
			mCRE.create();
	//    8   21:getstatic       #230 <Field CRE mCRE>
	//    9   24:invokevirtual   #241 <Method int CRE.create()>
	//   10   27:pop             
			CLog.d("Initing engine with CraftARSDKConfig...");
	//   11   28:ldc1            #243 <String "Initing engine with CraftARSDKConfig...">
	//   12   30:invokestatic    #237 <Method void CLog.d(String)>
			if(!(new File(CONFIG_PATH)).isFile())
	//*  13   33:new             #245 <Class File>
	//*  14   36:dup             
	//*  15   37:aload_0         
	//*  16   38:getfield        #119 <Field String CONFIG_PATH>
	//*  17   41:invokespecial   #247 <Method void File(String)>
	//*  18   44:invokevirtual   #251 <Method boolean File.isFile()>
	//*  19   47:ifne            76
				try
				{
					CLog.i("CraftARSDKConfig not found. Extracting it from assets...");
	//   20   50:ldc1            #253 <String "CraftARSDKConfig not found. Extracting it from assets...">
	//   21   52:invokestatic    #256 <Method void CLog.i(String)>
					takeConfigFileFromUserAssets();
	//   22   55:aload_0         
	//   23   56:invokespecial   #259 <Method void takeConfigFileFromUserAssets()>
				}
	//*  24   59:goto            82
				catch(Exception exception)
	//*  25   62:astore_1        
				{
					CLog.e("CraftARSDKConfig file could not be extracted from assets! Please, ensure you have the CraftARSDKConfig file in your application assets folder");
	//   26   63:ldc2            #261 <String "CraftARSDKConfig file could not be extracted from assets! Please, ensure you have the CraftARSDKConfig file in your application assets folder">
	//   27   66:invokestatic    #264 <Method void CLog.e(String)>
					exception.printStackTrace();
	//   28   69:aload_1         
	//   29   70:invokevirtual   #267 <Method void Exception.printStackTrace()>
				}
			else
	//*  30   73:goto            82
				CLog.d("CraftARSDKConfig found!");
	//   31   76:ldc2            #269 <String "CraftARSDKConfig found!">
	//   32   79:invokestatic    #237 <Method void CLog.d(String)>
			mCRE.init(CONFIG_PATH);
	//   33   82:getstatic       #230 <Field CRE mCRE>
	//   34   85:aload_0         
	//   35   86:getfield        #119 <Field String CONFIG_PATH>
	//   36   89:invokevirtual   #273 <Method int CRE.init(String)>
	//   37   92:pop             
			CLog.d("Init finished...!");
	//   38   93:ldc2            #275 <String "Init finished...!">
	//   39   96:invokestatic    #237 <Method void CLog.d(String)>
			mResponseHandlerThread = new Handler(mContext.getMainLooper());
	//   40   99:new             #277 <Class Handler>
	//   41  102:dup             
	//   42  103:getstatic       #88  <Field Context mContext>
	//   43  106:invokevirtual   #281 <Method android.os.Looper Context.getMainLooper()>
	//   44  109:invokespecial   #284 <Method void Handler(android.os.Looper)>
	//   45  112:putstatic       #286 <Field Handler mResponseHandlerThread>
			if(CraftAROnDeviceCollectionManager.Instance() != null)
	//*  46  115:invokestatic    #291 <Method CraftAROnDeviceCollectionManager CraftAROnDeviceCollectionManager.Instance()>
	//*  47  118:ifnull          144
			{
				CraftAROnDeviceCollectionManager.Instance().setInternalCollectionEventsHandler(mOnDeviceInternalCollectionEventsHandler);
	//   48  121:invokestatic    #291 <Method CraftAROnDeviceCollectionManager CraftAROnDeviceCollectionManager.Instance()>
	//   49  124:getstatic       #152 <Field CraftARInternalInterfaces$CollectionEventsHandler mOnDeviceInternalCollectionEventsHandler>
	//   50  127:invokevirtual   #295 <Method void CraftAROnDeviceCollectionManager.setInternalCollectionEventsHandler(CraftARInternalInterfaces$CollectionEventsHandler)>
				mCollectionUUIDsList = new HashMap();
	//   51  130:new             #297 <Class HashMap>
	//   52  133:dup             
	//   53  134:invokespecial   #298 <Method void HashMap()>
	//   54  137:putstatic       #300 <Field HashMap mCollectionUUIDsList>
				updateAvailableCollectionsInternal();
	//   55  140:invokestatic    #187 <Method void updateAvailableCollectionsInternal()>
				return;
	//   56  143:return          
			} else
			{
				CLog.e("Internal error: CraftAROnDeviceCollectionManger instance not yet available");
	//   57  144:ldc2            #302 <String "Internal error: CraftAROnDeviceCollectionManger instance not yet available">
	//   58  147:invokestatic    #264 <Method void CLog.e(String)>
				return;
	//   59  150:return          
			}
		} else
		{
			throw new NullPointerException("context can't be null!");
	//   60  151:new             #304 <Class NullPointerException>
	//   61  154:dup             
	//   62  155:ldc2            #306 <String "context can't be null!">
	//   63  158:invokespecial   #307 <Method void NullPointerException(String)>
	//   64  161:athrow          
		}
	}

	private void logInvalidItemError(CREResult creresult)
	{
		Object obj = ((Object) (CraftARError.ERROR_CODES.COLLECTION_INVALID_ITEM));
	//    0    0:getstatic       #312 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_INVALID_ITEM>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #97  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #98  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Found item with id ");
	//    6   12:aload_3         
	//    7   13:ldc2            #314 <String "Found item with id ">
	//    8   16:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(creresult.id);
	//   10   20:aload_3         
	//   11   21:aload_1         
	//   12   22:getfield        #319 <Field String CREResult.id>
	//   13   25:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		stringbuilder.append(", but there was an error creating the item. This item is not being returned in the results");
	//   15   29:aload_3         
	//   16   30:ldc2            #321 <String ", but there was an error creating the item. This item is not being returned in the results">
	//   17   33:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		creresult = ((CREResult) (new CraftARError(((CraftARError.ERROR_CODES) (obj)), stringbuilder.toString())));
	//   19   37:new             #190 <Class CraftARError>
	//   20   40:dup             
	//   21   41:aload_2         
	//   22   42:aload_3         
	//   23   43:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #201 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   25   49:astore_1        
		obj = ((Object) (new StringBuilder()));
	//   26   50:new             #97  <Class StringBuilder>
	//   27   53:dup             
	//   28   54:invokespecial   #98  <Method void StringBuilder()>
	//   29   57:astore_2        
		((StringBuilder) (obj)).append("Error( ");
	//   30   58:aload_2         
	//   31   59:ldc2            #323 <String "Error( ">
	//   32   62:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
		((StringBuilder) (obj)).append(((Object) (((CraftARError) (creresult)).getErrorCode())));
	//   34   66:aload_2         
	//   35   67:aload_1         
	//   36   68:invokevirtual   #327 <Method CraftARError$ERROR_CODES CraftARError.getErrorCode()>
	//   37   71:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   38   74:pop             
		((StringBuilder) (obj)).append("): ");
	//   39   75:aload_2         
	//   40   76:ldc2            #329 <String "): ">
	//   41   79:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   42   82:pop             
		((StringBuilder) (obj)).append(((CraftARError) (creresult)).getErrorMessage());
	//   43   83:aload_2         
	//   44   84:aload_1         
	//   45   85:invokevirtual   #332 <Method String CraftARError.getErrorMessage()>
	//   46   88:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   47   91:pop             
		CLog.w(((StringBuilder) (obj)).toString());
	//   48   92:aload_2         
	//   49   93:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   50   96:invokestatic    #335 <Method void CLog.w(String)>
	//   51   99:return          
	}

	private void makeLoadProgress(final SetCollectionListener setCollectionListener, final float progress)
	{
		if(setCollectionListener != null && (setCollectionListener instanceof SetOnDeviceCollectionListener))
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
	//*   2    4:aload_1         
	//*   3    5:instanceof      #339 <Class SetOnDeviceCollectionListener>
	//*   4    8:ifeq            28
			mResponseHandlerThread.post(new Runnable() {

				public void run()
				{
					SetCollectionListener setcollectionlistener = setCollectionListener;
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field SetCollectionListener val$setCollectionListener>
				//    2    4:astore_1        
					if(setcollectionlistener != null)
				//*   3    5:aload_1         
				//*   4    6:ifnull          23
						((SetOnDeviceCollectionListener)setcollectionlistener).setCollectionProgress(progress);
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

			
			{
				this$0 = CraftAROnDeviceIR.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CraftAROnDeviceIR this$0>
				setCollectionListener = setcollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field SetCollectionListener val$setCollectionListener>
				progress = f;
			//    6   10:aload_0         
			//    7   11:fload_3         
			//    8   12:putfield        #25  <Field float val$progress>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    5   11:getstatic       #286 <Field Handler mResponseHandlerThread>
	//    6   14:new             #8   <Class CraftAROnDeviceIR$10>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:fload_2         
	//   11   21:invokespecial   #342 <Method void CraftAROnDeviceIR$10(CraftAROnDeviceIR, SetCollectionListener, float)>
	//   12   24:invokevirtual   #346 <Method boolean Handler.post(Runnable)>
	//   13   27:pop             
	//   14   28:return          
	}

	private void searchInternal(CraftARQueryImage craftarqueryimage, final int requestCode)
	{
		final long ellapsedTime;
		ellapsedTime = System.currentTimeMillis();
	//    0    0:invokestatic    #352 <Method long System.currentTimeMillis()>
	//    1    3:lstore          6
		if(currentCollection == null)
	//*   2    5:getstatic       #354 <Field CraftAROnDeviceCollection currentCollection>
	//*   3    8:ifnonnull       58
		{
			CLog.e("No collection set!");
	//    4   11:ldc2            #356 <String "No collection set!">
	//    5   14:invokestatic    #264 <Method void CLog.e(String)>
			craftarqueryimage = ((CraftARQueryImage) (new CraftARError(CraftARError.ERROR_CODES.ON_DEVICE_IR_NO_ACTIVE_COLLECTION, "No collection set")));
	//    6   17:new             #190 <Class CraftARError>
	//    7   20:dup             
	//    8   21:getstatic       #359 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ON_DEVICE_IR_NO_ACTIVE_COLLECTION>
	//    9   24:ldc2            #361 <String "No collection set">
	//   10   27:invokespecial   #201 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   11   30:astore_1        
			if(mResponseHandler != null)
	//*  12   31:aload_0         
	//*  13   32:getfield        #365 <Field CraftARSearchResponseHandler mResponseHandler>
	//*  14   35:ifnull          50
			{
				mResponseHandler.searchFailed(((CraftARError) (craftarqueryimage)), requestCode);
	//   15   38:aload_0         
	//   16   39:getfield        #365 <Field CraftARSearchResponseHandler mResponseHandler>
	//   17   42:aload_1         
	//   18   43:iload_2         
	//   19   44:invokeinterface #371 <Method void CraftARSearchResponseHandler.searchFailed(CraftARError, int)>
				return;
	//   20   49:return          
			} else
			{
				CLog.e(((CraftARError) (craftarqueryimage)).getErrorMessage());
	//   21   50:aload_1         
	//   22   51:invokevirtual   #332 <Method String CraftARError.getErrorMessage()>
	//   23   54:invokestatic    #264 <Method void CLog.e(String)>
				return;
	//   24   57:return          
			}
		}
		mNumPendingSearchRequests = mNumPendingSearchRequests + 1;
	//   25   58:aload_0         
	//   26   59:aload_0         
	//   27   60:getfield        #121 <Field int mNumPendingSearchRequests>
	//   28   63:iconst_1        
	//   29   64:iadd            
	//   30   65:putfield        #121 <Field int mNumPendingSearchRequests>
		craftarqueryimage.getType();
	//   31   68:aload_1         
	//   32   69:invokevirtual   #376 <Method int CraftARQueryImage.getType()>
		JVM INSTR tableswitch 1 5: default 108
	//	               1 227
	//	               2 196
	//	               3 157
	//	               4 143
	//	               5 227;
	//   33   72:tableswitch     1 5: default 108
	//	               1 227
	//	               2 196
	//	               3 157
	//	               4 143
	//	               5 227
		   goto _L1 _L2 _L3 _L4 _L5 _L2
_L1:
		craftarqueryimage = ((CraftARQueryImage) (new CraftARError(CraftARError.ERROR_CODES.ERROR_OPENING_IMAGE, "Invalid image data")));
	//   34  108:new             #190 <Class CraftARError>
	//   35  111:dup             
	//   36  112:getstatic       #379 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_OPENING_IMAGE>
	//   37  115:ldc2            #381 <String "Invalid image data">
	//   38  118:invokespecial   #201 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   39  121:astore_1        
		ByteArrayOutputStream bytearrayoutputstream;
		if(mResponseHandler != null)
	//*  40  122:aload_0         
	//*  41  123:getfield        #365 <Field CraftARSearchResponseHandler mResponseHandler>
	//*  42  126:ifnull          244
		{
			mResponseHandler.searchFailed(((CraftARError) (craftarqueryimage)), requestCode);
	//   43  129:aload_0         
	//   44  130:getfield        #365 <Field CraftARSearchResponseHandler mResponseHandler>
	//   45  133:aload_1         
	//   46  134:iload_2         
	//   47  135:invokeinterface #371 <Method void CraftARSearchResponseHandler.searchFailed(CraftARError, int)>
		} else
	//*  48  140:goto            280
	//*  49  143:getstatic       #230 <Field CRE mCRE>
	//*  50  146:aload_1         
	//*  51  147:getfield        #384 <Field String CraftARQueryImage.dataPath>
	//*  52  150:invokevirtual   #388 <Method ArrayList CRE.search(String)>
	//*  53  153:astore_1        
	//*  54  154:goto            282
	//*  55  157:new             #390 <Class ByteArrayOutputStream>
	//*  56  160:dup             
	//*  57  161:invokespecial   #391 <Method void ByteArrayOutputStream()>
	//*  58  164:astore          8
	//*  59  166:aload_1         
	//*  60  167:getfield        #395 <Field Bitmap CraftARQueryImage.dataBmp>
	//*  61  170:getstatic       #401 <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.JPEG>
	//*  62  173:bipush          85
	//*  63  175:aload           8
	//*  64  177:invokevirtual   #407 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//*  65  180:pop             
	//*  66  181:getstatic       #230 <Field CRE mCRE>
	//*  67  184:aload           8
	//*  68  186:invokevirtual   #411 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  69  189:invokevirtual   #415 <Method ArrayList CRE.searchJPEG(byte[])>
	//*  70  192:astore_1        
	//*  71  193:goto            282
	//*  72  196:getstatic       #230 <Field CRE mCRE>
	//*  73  199:aload_1         
	//*  74  200:getfield        #419 <Field NV21 CraftARQueryImage.dataNV21>
	//*  75  203:getfield        #425 <Field byte[] NV21.data>
	//*  76  206:aload_1         
	//*  77  207:getfield        #419 <Field NV21 CraftARQueryImage.dataNV21>
	//*  78  210:getfield        #428 <Field int NV21.width>
	//*  79  213:aload_1         
	//*  80  214:getfield        #419 <Field NV21 CraftARQueryImage.dataNV21>
	//*  81  217:getfield        #431 <Field int NV21.height>
	//*  82  220:invokevirtual   #435 <Method ArrayList CRE.searchNV21(byte[], int, int)>
	//*  83  223:astore_1        
	//*  84  224:goto            282
	//*  85  227:getstatic       #230 <Field CRE mCRE>
	//*  86  230:aload_1         
	//*  87  231:getfield        #439 <Field ByteArrayOutputStream CraftARQueryImage.dataBuffer>
	//*  88  234:invokevirtual   #411 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  89  237:invokevirtual   #415 <Method ArrayList CRE.searchJPEG(byte[])>
	//*  90  240:astore_1        
	//*  91  241:goto            282
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   92  244:new             #97  <Class StringBuilder>
	//   93  247:dup             
	//   94  248:invokespecial   #98  <Method void StringBuilder()>
	//   95  251:astore          8
			stringbuilder.append("Error: ");
	//   96  253:aload           8
	//   97  255:ldc2            #441 <String "Error: ">
	//   98  258:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   99  261:pop             
			stringbuilder.append(((CraftARError) (craftarqueryimage)).mErrorMessage);
	//  100  262:aload           8
	//  101  264:aload_1         
	//  102  265:getfield        #444 <Field String CraftARError.mErrorMessage>
	//  103  268:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  104  271:pop             
			CLog.e(stringbuilder.toString());
	//  105  272:aload           8
	//  106  274:invokevirtual   #117 <Method String StringBuilder.toString()>
	//  107  277:invokestatic    #264 <Method void CLog.e(String)>
		}
		break; /* Loop/switch isn't completed */
_L4:
		bytearrayoutputstream = new ByteArrayOutputStream();
		craftarqueryimage.dataBmp.compress(android.graphics.Bitmap.CompressFormat.JPEG, 85, ((java.io.OutputStream) (bytearrayoutputstream)));
		craftarqueryimage = ((CraftARQueryImage) (mCRE.searchJPEG(bytearrayoutputstream.toByteArray())));
		  goto _L5
_L3:
		craftarqueryimage = ((CraftARQueryImage) (mCRE.searchNV21(craftarqueryimage.dataNV21.data, craftarqueryimage.dataNV21.width, craftarqueryimage.dataNV21.height)));
		  goto _L5
_L2:
		craftarqueryimage = ((CraftARQueryImage) (mCRE.searchJPEG(craftarqueryimage.dataBuffer.toByteArray())));
_L5:
label0:
		{
			final ArrayList searchResults;
label1:
			{
				for(craftarqueryimage = ((CraftARQueryImage) (mCRE.search(craftarqueryimage.dataPath))); craftarqueryimage == null; craftarqueryimage = null)
					break label0;

	//  108  280:aconst_null     
	//  109  281:astore_1        
	//  110  282:aload_1         
	//  111  283:ifnull          875
				searchResults = new ArrayList();
	//  112  286:new             #446 <Class ArrayList>
	//  113  289:dup             
	//  114  290:invokespecial   #447 <Method void ArrayList()>
	//  115  293:astore          10
				Iterator iterator = ((ArrayList) (craftarqueryimage)).iterator();
	//  116  295:aload_1         
	//  117  296:invokevirtual   #451 <Method Iterator ArrayList.iterator()>
	//  118  299:astore          8
				final int errorCode;
label2:
				do
				{
					boolean flag;
					Object obj;
					String s;
					Object obj1;
					String s1;
					CraftARItem craftaritem;
					CraftARImage craftarimage;
label3:
					{
						if(!iterator.hasNext())
							break label1;
	//  119  301:aload           8
	//  120  303:invokeinterface #456 <Method boolean Iterator.hasNext()>
	//  121  308:ifeq            810
						obj1 = ((Object) ((CREResult)iterator.next()));
	//  122  311:aload           8
	//  123  313:invokeinterface #460 <Method Object Iterator.next()>
	//  124  318:checkcast       #316 <Class CREResult>
	//  125  321:astore          12
						errorCode = ((CREResult)((ArrayList) (craftarqueryimage)).get(0)).errorCode;
	//  126  323:aload_1         
	//  127  324:iconst_0        
	//  128  325:invokevirtual   #464 <Method Object ArrayList.get(int)>
	//  129  328:checkcast       #316 <Class CREResult>
	//  130  331:getfield        #467 <Field int CREResult.errorCode>
	//  131  334:istore_3        
						if(errorCode != 0)
							break label2;
	//  132  335:iload_3         
	//  133  336:ifne            775
						String as[] = ((CREResult) (obj1)).id.split("_");
	//  134  339:aload           12
	//  135  341:getfield        #319 <Field String CREResult.id>
	//  136  344:ldc2            #469 <String "_">
	//  137  347:invokevirtual   #475 <Method String[] String.split(String)>
	//  138  350:astore          9
						if(as.length != 2)
	//* 139  352:aload           9
	//* 140  354:arraylength     
	//* 141  355:iconst_2        
	//* 142  356:icmpeq          368
						{
							logInvalidItemError(((CREResult) (obj1)));
	//  143  359:aload_0         
	//  144  360:aload           12
	//  145  362:invokespecial   #477 <Method void logInvalidItemError(CREResult)>
							continue;
	//  146  365:goto            772
						}
						s = as[0];
	//  147  368:aload           9
	//  148  370:iconst_0        
	//  149  371:aaload          
	//  150  372:astore          11
						s1 = as[1];
	//  151  374:aload           9
	//  152  376:iconst_1        
	//  153  377:aaload          
	//  154  378:astore          13
						craftaritem = currentCollection.getItem(s);
	//  155  380:getstatic       #354 <Field CraftAROnDeviceCollection currentCollection>
	//  156  383:aload           11
	//  157  385:invokevirtual   #483 <Method CraftARItem CraftAROnDeviceCollection.getItem(String)>
	//  158  388:astore          14
						if(craftaritem == null)
	//* 159  390:aload           14
	//* 160  392:ifnonnull       404
						{
							logInvalidItemError(((CREResult) (obj1)));
	//  161  395:aload_0         
	//  162  396:aload           12
	//  163  398:invokespecial   #477 <Method void logInvalidItemError(CREResult)>
							continue;
	//  164  401:goto            772
						}
						craftarimage = new CraftARImage(currentCollection.getImageFieldTemplate(), currentCollection.getUUID(), s, s1);
	//  165  404:new             #485 <Class CraftARImage>
	//  166  407:dup             
	//  167  408:getstatic       #354 <Field CraftAROnDeviceCollection currentCollection>
	//  168  411:invokevirtual   #488 <Method String CraftAROnDeviceCollection.getImageFieldTemplate()>
	//  169  414:getstatic       #354 <Field CraftAROnDeviceCollection currentCollection>
	//  170  417:invokevirtual   #491 <Method String CraftAROnDeviceCollection.getUUID()>
	//  171  420:aload           11
	//  172  422:aload           13
	//  173  424:invokespecial   #494 <Method void CraftARImage(String, String, String, String)>
	//  174  427:astore          15
						for(Iterator iterator1 = searchResults.iterator(); iterator1.hasNext();)
	//* 175  429:aload           10
	//* 176  431:invokevirtual   #451 <Method Iterator ArrayList.iterator()>
	//* 177  434:astore          16
	//* 178  436:aload           16
	//* 179  438:invokeinterface #456 <Method boolean Iterator.hasNext()>
	//* 180  443:ifeq            511
						{
							obj = ((Object) ((CraftARResult)iterator1.next()));
	//  181  446:aload           16
	//  182  448:invokeinterface #460 <Method Object Iterator.next()>
	//  183  453:checkcast       #496 <Class CraftARResult>
	//  184  456:astore          9
							if(((CraftARResult) (obj)).getItem().getItemId().matches(s))
	//* 185  458:aload           9
	//* 186  460:invokevirtual   #499 <Method CraftARItem CraftARResult.getItem()>
	//* 187  463:invokevirtual   #504 <Method String CraftARItem.getItemId()>
	//* 188  466:aload           11
	//* 189  468:invokevirtual   #508 <Method boolean String.matches(String)>
	//* 190  471:ifeq            508
							{
								if((double)((CraftARResult) (obj)).getScore() < ((CREResult) (obj1)).score)
	//* 191  474:aload           9
	//* 192  476:invokevirtual   #511 <Method int CraftARResult.getScore()>
	//* 193  479:i2d             
	//* 194  480:aload           12
	//* 195  482:getfield        #515 <Field double CREResult.score>
	//* 196  485:dcmpg           
	//* 197  486:ifge            497
								{
									errorCode = 1;
	//  198  489:iconst_1        
	//  199  490:istore_3        
									flag = false;
	//  200  491:iconst_0        
	//  201  492:istore          4
								} else
	//* 202  494:goto            519
								{
									errorCode = 0;
	//  203  497:iconst_0        
	//  204  498:istore_3        
									flag = true;
	//  205  499:iconst_1        
	//  206  500:istore          4
									obj = null;
	//  207  502:aconst_null     
	//  208  503:astore          9
								}
								break label3;
	//  209  505:goto            519
							}
						}

	//* 210  508:goto            436
						errorCode = 0;
	//  211  511:iconst_0        
	//  212  512:istore_3        
						flag = false;
	//  213  513:iconst_0        
	//  214  514:istore          4
						obj = null;
	//  215  516:aconst_null     
	//  216  517:astore          9
					}
					int i = (int)Math.round(((CREResult) (obj1)).score);
	//  217  519:aload           12
	//  218  521:getfield        #515 <Field double CREResult.score>
	//  219  524:invokestatic    #521 <Method long Math.round(double)>
	//  220  527:l2i             
	//  221  528:istore          5
					if(obj == null)
	//* 222  530:aload           9
	//* 223  532:ifnonnull       630
					{
						if(flag)
	//* 224  535:iload           4
	//* 225  537:ifeq            603
						{
							obj = ((Object) (new StringBuilder()));
	//  226  540:new             #97  <Class StringBuilder>
	//  227  543:dup             
	//  228  544:invokespecial   #98  <Method void StringBuilder()>
	//  229  547:astore          9
							((StringBuilder) (obj)).append("Ignoring result for item ");
	//  230  549:aload           9
	//  231  551:ldc2            #523 <String "Ignoring result for item ">
	//  232  554:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  233  557:pop             
							((StringBuilder) (obj)).append(s);
	//  234  558:aload           9
	//  235  560:aload           11
	//  236  562:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  237  565:pop             
							((StringBuilder) (obj)).append(" with image ");
	//  238  566:aload           9
	//  239  568:ldc2            #525 <String " with image ">
	//  240  571:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  241  574:pop             
							((StringBuilder) (obj)).append(s1);
	//  242  575:aload           9
	//  243  577:aload           13
	//  244  579:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  245  582:pop             
							((StringBuilder) (obj)).append(" because another image with the same item id has been found with higher score.");
	//  246  583:aload           9
	//  247  585:ldc2            #527 <String " because another image with the same item id has been found with higher score.">
	//  248  588:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  249  591:pop             
							CLog.d(((StringBuilder) (obj)).toString());
	//  250  592:aload           9
	//  251  594:invokevirtual   #117 <Method String StringBuilder.toString()>
	//  252  597:invokestatic    #237 <Method void CLog.d(String)>
						} else
	//* 253  600:goto            301
						{
							searchResults.add(((Object) (new CraftARResult(craftaritem, craftarimage, i, ((CREResult) (obj1)).bb))));
	//  254  603:aload           10
	//  255  605:new             #496 <Class CraftARResult>
	//  256  608:dup             
	//  257  609:aload           14
	//  258  611:aload           15
	//  259  613:iload           5
	//  260  615:aload           12
	//  261  617:getfield        #531 <Field CraftARBoundingBox CREResult.bb>
	//  262  620:invokespecial   #534 <Method void CraftARResult(CraftARItem, CraftARImage, int, CraftARBoundingBox)>
	//  263  623:invokevirtual   #538 <Method boolean ArrayList.add(Object)>
	//  264  626:pop             
						}
					} else
	//* 265  627:goto            772
					if(errorCode != 0)
	//* 266  630:iload_3         
	//* 267  631:ifeq            772
					{
						CraftARResult craftarresult = new CraftARResult(craftaritem, craftarimage, i, ((CREResult) (obj1)).bb);
	//  268  634:new             #496 <Class CraftARResult>
	//  269  637:dup             
	//  270  638:aload           14
	//  271  640:aload           15
	//  272  642:iload           5
	//  273  644:aload           12
	//  274  646:getfield        #531 <Field CraftARBoundingBox CREResult.bb>
	//  275  649:invokespecial   #534 <Method void CraftARResult(CraftARItem, CraftARImage, int, CraftARBoundingBox)>
	//  276  652:astore          11
						obj1 = ((Object) (new StringBuilder()));
	//  277  654:new             #97  <Class StringBuilder>
	//  278  657:dup             
	//  279  658:invokespecial   #98  <Method void StringBuilder()>
	//  280  661:astore          12
						((StringBuilder) (obj1)).append("Replacing match with id ");
	//  281  663:aload           12
	//  282  665:ldc2            #540 <String "Replacing match with id ">
	//  283  668:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  284  671:pop             
						((StringBuilder) (obj1)).append(((CraftARResult) (obj)).getMatchedImage().getUUID());
	//  285  672:aload           12
	//  286  674:aload           9
	//  287  676:invokevirtual   #544 <Method CraftARImage CraftARResult.getMatchedImage()>
	//  288  679:invokevirtual   #545 <Method String CraftARImage.getUUID()>
	//  289  682:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  290  685:pop             
						((StringBuilder) (obj1)).append(" and score ");
	//  291  686:aload           12
	//  292  688:ldc2            #547 <String " and score ">
	//  293  691:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  294  694:pop             
						((StringBuilder) (obj1)).append(((CraftARResult) (obj)).getScore());
	//  295  695:aload           12
	//  296  697:aload           9
	//  297  699:invokevirtual   #511 <Method int CraftARResult.getScore()>
	//  298  702:invokevirtual   #550 <Method StringBuilder StringBuilder.append(int)>
	//  299  705:pop             
						((StringBuilder) (obj1)).append(" with match with id ");
	//  300  706:aload           12
	//  301  708:ldc2            #552 <String " with match with id ">
	//  302  711:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  303  714:pop             
						((StringBuilder) (obj1)).append(craftarresult.getMatchedImage().getUUID());
	//  304  715:aload           12
	//  305  717:aload           11
	//  306  719:invokevirtual   #544 <Method CraftARImage CraftARResult.getMatchedImage()>
	//  307  722:invokevirtual   #545 <Method String CraftARImage.getUUID()>
	//  308  725:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  309  728:pop             
						((StringBuilder) (obj1)).append(" and score ");
	//  310  729:aload           12
	//  311  731:ldc2            #547 <String " and score ">
	//  312  734:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  313  737:pop             
						((StringBuilder) (obj1)).append(craftarresult.getScore());
	//  314  738:aload           12
	//  315  740:aload           11
	//  316  742:invokevirtual   #511 <Method int CraftARResult.getScore()>
	//  317  745:invokevirtual   #550 <Method StringBuilder StringBuilder.append(int)>
	//  318  748:pop             
						CLog.d(((StringBuilder) (obj1)).toString());
	//  319  749:aload           12
	//  320  751:invokevirtual   #117 <Method String StringBuilder.toString()>
	//  321  754:invokestatic    #237 <Method void CLog.d(String)>
						searchResults.set(searchResults.indexOf(obj), ((Object) (craftarresult)));
	//  322  757:aload           10
	//  323  759:aload           10
	//  324  761:aload           9
	//  325  763:invokevirtual   #556 <Method int ArrayList.indexOf(Object)>
	//  326  766:aload           11
	//  327  768:invokevirtual   #560 <Method Object ArrayList.set(int, Object)>
	//  328  771:pop             
					}
				} while(true);
	//  329  772:goto            301
				if(mResponseHandler != null)
	//* 330  775:aload_0         
	//* 331  776:getfield        #365 <Field CraftARSearchResponseHandler mResponseHandler>
	//* 332  779:ifnull          799
					mResponseHandlerThread.post(new Runnable() {

						public void run()
						{
							if(mResponseHandler != null)
						//*   0    0:aload_0         
						//*   1    1:getfield        #20  <Field CraftAROnDeviceIR this$0>
						//*   2    4:getfield        #33  <Field CraftARSearchResponseHandler CraftAROnDeviceIR.mResponseHandler>
						//*   3    7:ifnull          34
							{
								mResponseHandler.searchFailed(CraftAROnDeviceIR.getCraftARError(errorCode), requestCode);
						//    4   10:aload_0         
						//    5   11:getfield        #20  <Field CraftAROnDeviceIR this$0>
						//    6   14:getfield        #33  <Field CraftARSearchResponseHandler CraftAROnDeviceIR.mResponseHandler>
						//    7   17:aload_0         
						//    8   18:getfield        #22  <Field int val$errorCode>
						//    9   21:invokestatic    #37  <Method CraftARError CraftAROnDeviceIR.access$300(int)>
						//   10   24:aload_0         
						//   11   25:getfield        #24  <Field int val$requestCode>
						//   12   28:invokeinterface #43  <Method void CraftARSearchResponseHandler.searchFailed(CraftARError, int)>
								return;
						//   13   33:return          
							} else
							{
								StringBuilder stringbuilder1 = new StringBuilder();
						//   14   34:new             #45  <Class StringBuilder>
						//   15   37:dup             
						//   16   38:invokespecial   #46  <Method void StringBuilder()>
						//   17   41:astore_1        
								stringbuilder1.append("Search failed with error: ");
						//   18   42:aload_1         
						//   19   43:ldc1            #48  <String "Search failed with error: ">
						//   20   45:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
						//   21   48:pop             
								stringbuilder1.append(errorCode);
						//   22   49:aload_1         
						//   23   50:aload_0         
						//   24   51:getfield        #22  <Field int val$errorCode>
						//   25   54:invokevirtual   #55  <Method StringBuilder StringBuilder.append(int)>
						//   26   57:pop             
								CLog.e(stringbuilder1.toString());
						//   27   58:aload_1         
						//   28   59:invokevirtual   #59  <Method String StringBuilder.toString()>
						//   29   62:invokestatic    #65  <Method void CLog.e(String)>
								return;
						//   30   65:return          
							}
						}

						final CraftAROnDeviceIR this$0;
						final int val$errorCode;
						final int val$requestCode;

			
			{
				this$0 = CraftAROnDeviceIR.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CraftAROnDeviceIR this$0>
				errorCode = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int val$errorCode>
				requestCode = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #24  <Field int val$requestCode>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
					}
);
	//  333  782:getstatic       #286 <Field Handler mResponseHandlerThread>
	//  334  785:new             #10  <Class CraftAROnDeviceIR$11>
	//  335  788:dup             
	//  336  789:aload_0         
	//  337  790:iload_3         
	//  338  791:iload_2         
	//  339  792:invokespecial   #563 <Method void CraftAROnDeviceIR$11(CraftAROnDeviceIR, int, int)>
	//  340  795:invokevirtual   #346 <Method boolean Handler.post(Runnable)>
	//  341  798:pop             
				mNumPendingSearchRequests = mNumPendingSearchRequests - 1;
	//  342  799:aload_0         
	//  343  800:aload_0         
	//  344  801:getfield        #121 <Field int mNumPendingSearchRequests>
	//  345  804:iconst_1        
	//  346  805:isub            
	//  347  806:putfield        #121 <Field int mNumPendingSearchRequests>
				return;
	//  348  809:return          
			}
			ellapsedTime = System.currentTimeMillis() - ellapsedTime;
	//  349  810:invokestatic    #352 <Method long System.currentTimeMillis()>
	//  350  813:lload           6
	//  351  815:lsub            
	//  352  816:lstore          6
			craftarqueryimage = ((CraftARQueryImage) (new StringBuilder()));
	//  353  818:new             #97  <Class StringBuilder>
	//  354  821:dup             
	//  355  822:invokespecial   #98  <Method void StringBuilder()>
	//  356  825:astore_1        
			((StringBuilder) (craftarqueryimage)).append("Search time: ");
	//  357  826:aload_1         
	//  358  827:ldc2            #565 <String "Search time: ">
	//  359  830:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  360  833:pop             
			((StringBuilder) (craftarqueryimage)).append(ellapsedTime);
	//  361  834:aload_1         
	//  362  835:lload           6
	//  363  837:invokevirtual   #568 <Method StringBuilder StringBuilder.append(long)>
	//  364  840:pop             
			CLog.d(((StringBuilder) (craftarqueryimage)).toString());
	//  365  841:aload_1         
	//  366  842:invokevirtual   #117 <Method String StringBuilder.toString()>
	//  367  845:invokestatic    #237 <Method void CLog.d(String)>
			if(mResponseHandler != null)
	//* 368  848:aload_0         
	//* 369  849:getfield        #365 <Field CraftARSearchResponseHandler mResponseHandler>
	//* 370  852:ifnull          875
				mResponseHandlerThread.post(new Runnable() {

					public void run()
					{
						if(mResponseHandler != null)
					//*   0    0:aload_0         
					//*   1    1:getfield        #23  <Field CraftAROnDeviceIR this$0>
					//*   2    4:getfield        #38  <Field CraftARSearchResponseHandler CraftAROnDeviceIR.mResponseHandler>
					//*   3    7:ifnull          35
						{
							mResponseHandler.searchResults(searchResults, ellapsedTime, requestCode);
					//    4   10:aload_0         
					//    5   11:getfield        #23  <Field CraftAROnDeviceIR this$0>
					//    6   14:getfield        #38  <Field CraftARSearchResponseHandler CraftAROnDeviceIR.mResponseHandler>
					//    7   17:aload_0         
					//    8   18:getfield        #25  <Field ArrayList val$searchResults>
					//    9   21:aload_0         
					//   10   22:getfield        #27  <Field long val$ellapsedTime>
					//   11   25:aload_0         
					//   12   26:getfield        #29  <Field int val$requestCode>
					//   13   29:invokeinterface #44  <Method void CraftARSearchResponseHandler.searchResults(ArrayList, long, int)>
							return;
					//   14   34:return          
						} else
						{
							CLog.w("Search results came back but there is no handler to receive them");
					//   15   35:ldc1            #46  <String "Search results came back but there is no handler to receive them">
					//   16   37:invokestatic    #52  <Method void CLog.w(String)>
							return;
					//   17   40:return          
						}
					}

					final CraftAROnDeviceIR this$0;
					final long val$ellapsedTime;
					final int val$requestCode;
					final ArrayList val$searchResults;

			
			{
				this$0 = CraftAROnDeviceIR.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CraftAROnDeviceIR this$0>
				searchResults = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field ArrayList val$searchResults>
				ellapsedTime = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #27  <Field long val$ellapsedTime>
				requestCode = i;
			//    9   15:aload_0         
			//   10   16:iload           5
			//   11   18:putfield        #29  <Field int val$requestCode>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
				}
);
	//  371  855:getstatic       #286 <Field Handler mResponseHandlerThread>
	//  372  858:new             #12  <Class CraftAROnDeviceIR$12>
	//  373  861:dup             
	//  374  862:aload_0         
	//  375  863:aload           10
	//  376  865:lload           6
	//  377  867:iload_2         
	//  378  868:invokespecial   #571 <Method void CraftAROnDeviceIR$12(CraftAROnDeviceIR, ArrayList, long, int)>
	//  379  871:invokevirtual   #346 <Method boolean Handler.post(Runnable)>
	//  380  874:pop             
		}
		mNumPendingSearchRequests = mNumPendingSearchRequests - 1;
	//  381  875:aload_0         
	//  382  876:aload_0         
	//  383  877:getfield        #121 <Field int mNumPendingSearchRequests>
	//  384  880:iconst_1        
	//  385  881:isub            
	//  386  882:putfield        #121 <Field int mNumPendingSearchRequests>
		return;
	//  387  885:return          
	}

	private void setActiveCollectionInternal(CraftAROnDeviceCollection craftarondevicecollection)
	{
		mCRE.setGroup(craftarondevicecollection.getUUID());
	//    0    0:getstatic       #230 <Field CRE mCRE>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #491 <Method String CraftAROnDeviceCollection.getUUID()>
	//    3    7:invokevirtual   #576 <Method void CRE.setGroup(String)>
		currentCollection = craftarondevicecollection;
	//    4   10:aload_1         
	//    5   11:putstatic       #354 <Field CraftAROnDeviceCollection currentCollection>
	//    6   14:return          
	}

	private void setCollectionInternal(final SetOnDeviceCollectionListener setCollectionListener, CraftAROnDeviceCollection craftarondevicecollection, boolean flag)
	{
		if(craftarondevicecollection == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       31
		{
			CLog.e("Collection is null");
	//    2    4:ldc2            #578 <String "Collection is null">
	//    3    7:invokestatic    #264 <Method void CLog.e(String)>
			if(setCollectionListener != null)
	//*   4   10:aload_1         
	//*   5   11:ifnull          30
				mResponseHandlerThread.post(new Runnable() {

					public void run()
					{
						CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.COLLECTION_INVALID, "Collection is null");
					//    0    0:new             #28  <Class CraftARError>
					//    1    3:dup             
					//    2    4:getstatic       #34  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_INVALID>
					//    3    7:ldc1            #36  <String "Collection is null">
					//    4    9:invokespecial   #39  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
					//    5   12:astore_1        
						SetOnDeviceCollectionListener setondevicecollectionlistener = setCollectionListener;
					//    6   13:aload_0         
					//    7   14:getfield        #21  <Field SetOnDeviceCollectionListener val$setCollectionListener>
					//    8   17:astore_2        
						if(setondevicecollectionlistener != null)
					//*   9   18:aload_2         
					//*  10   19:ifnull          30
						{
							setondevicecollectionlistener.setCollectionFailed(craftarerror);
					//   11   22:aload_2         
					//   12   23:aload_1         
					//   13   24:invokeinterface #45  <Method void SetOnDeviceCollectionListener.setCollectionFailed(CraftARError)>
							return;
					//   14   29:return          
						} else
						{
							CLog.e(craftarerror.getErrorMessage());
					//   15   30:aload_1         
					//   16   31:invokevirtual   #49  <Method String CraftARError.getErrorMessage()>
					//   17   34:invokestatic    #55  <Method void CLog.e(String)>
							return;
					//   18   37:return          
						}
					}

					final CraftAROnDeviceIR this$0;
					final SetOnDeviceCollectionListener val$setCollectionListener;

			
			{
				this$0 = CraftAROnDeviceIR.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CraftAROnDeviceIR this$0>
				setCollectionListener = setondevicecollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field SetOnDeviceCollectionListener val$setCollectionListener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//    6   14:getstatic       #286 <Field Handler mResponseHandlerThread>
	//    7   17:new             #22  <Class CraftAROnDeviceIR$6>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:invokespecial   #581 <Method void CraftAROnDeviceIR$6(CraftAROnDeviceIR, SetOnDeviceCollectionListener)>
	//   12   26:invokevirtual   #346 <Method boolean Handler.post(Runnable)>
	//   13   29:pop             
			return;
	//   14   30:return          
		}
		OnDeviceCollectionStatus ondevicecollectionstatus = (OnDeviceCollectionStatus)mCollectionUUIDsList.get(((Object) (craftarondevicecollection.getUUID())));
	//   15   31:getstatic       #300 <Field HashMap mCollectionUUIDsList>
	//   16   34:aload_2         
	//   17   35:invokevirtual   #491 <Method String CraftAROnDeviceCollection.getUUID()>
	//   18   38:invokevirtual   #584 <Method Object HashMap.get(Object)>
	//   19   41:checkcast       #30  <Class CraftAROnDeviceIR$OnDeviceCollectionStatus>
	//   20   44:astore          6
		HashSet hashset = craftarondevicecollection.getListOfImages();
	//   21   46:aload_2         
	//   22   47:invokevirtual   #588 <Method HashSet CraftAROnDeviceCollection.getListOfImages()>
	//   23   50:astore          8
		if(hashset == null)
	//*  24   52:aload           8
	//*  25   54:ifnonnull       78
		{
			if(setCollectionListener != null)
	//*  26   57:aload_1         
	//*  27   58:ifnull          77
				mResponseHandlerThread.post(new Runnable() {

					public void run()
					{
						CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.COLLECTION_MISSING_FILES, "Collection can't be loaded due to missing files");
					//    0    0:new             #28  <Class CraftARError>
					//    1    3:dup             
					//    2    4:getstatic       #34  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_MISSING_FILES>
					//    3    7:ldc1            #36  <String "Collection can't be loaded due to missing files">
					//    4    9:invokespecial   #39  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
					//    5   12:astore_1        
						SetOnDeviceCollectionListener setondevicecollectionlistener = setCollectionListener;
					//    6   13:aload_0         
					//    7   14:getfield        #21  <Field SetOnDeviceCollectionListener val$setCollectionListener>
					//    8   17:astore_2        
						if(setondevicecollectionlistener != null)
					//*   9   18:aload_2         
					//*  10   19:ifnull          30
						{
							setondevicecollectionlistener.setCollectionFailed(craftarerror);
					//   11   22:aload_2         
					//   12   23:aload_1         
					//   13   24:invokeinterface #45  <Method void SetOnDeviceCollectionListener.setCollectionFailed(CraftARError)>
							return;
					//   14   29:return          
						} else
						{
							CLog.e(craftarerror.getErrorMessage());
					//   15   30:aload_1         
					//   16   31:invokevirtual   #49  <Method String CraftARError.getErrorMessage()>
					//   17   34:invokestatic    #55  <Method void CLog.e(String)>
							return;
					//   18   37:return          
						}
					}

					final CraftAROnDeviceIR this$0;
					final SetOnDeviceCollectionListener val$setCollectionListener;

			
			{
				this$0 = CraftAROnDeviceIR.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CraftAROnDeviceIR this$0>
				setCollectionListener = setondevicecollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field SetOnDeviceCollectionListener val$setCollectionListener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//   28   61:getstatic       #286 <Field Handler mResponseHandlerThread>
	//   29   64:new             #24  <Class CraftAROnDeviceIR$7>
	//   30   67:dup             
	//   31   68:aload_0         
	//   32   69:aload_1         
	//   33   70:invokespecial   #589 <Method void CraftAROnDeviceIR$7(CraftAROnDeviceIR, SetOnDeviceCollectionListener)>
	//   34   73:invokevirtual   #346 <Method boolean Handler.post(Runnable)>
	//   35   76:pop             
			return;
	//   36   77:return          
		}
		Object obj = ((Object) (new HashSet()));
	//   37   78:new             #591 <Class HashSet>
	//   38   81:dup             
	//   39   82:invokespecial   #592 <Method void HashSet()>
	//   40   85:astore          7
		if(ondevicecollectionstatus != null)
	//*  41   87:aload           6
	//*  42   89:ifnull          108
			obj = ((Object) ((HashSet)ondevicecollectionstatus.loadedImages.clone()));
	//   43   92:aload           6
	//   44   94:getfield        #596 <Field HashSet CraftAROnDeviceIR$OnDeviceCollectionStatus.loadedImages>
	//   45   97:invokevirtual   #599 <Method Object HashSet.clone()>
	//   46  100:checkcast       #591 <Class HashSet>
	//   47  103:astore          7
		else
	//*  48  105:goto            118
			ondevicecollectionstatus = new OnDeviceCollectionStatus();
	//   49  108:new             #30  <Class CraftAROnDeviceIR$OnDeviceCollectionStatus>
	//   50  111:dup             
	//   51  112:aload_0         
	//   52  113:invokespecial   #600 <Method void CraftAROnDeviceIR$OnDeviceCollectionStatus(CraftAROnDeviceIR)>
	//   53  116:astore          6
		((HashSet) (obj)).removeAll(((java.util.Collection) (hashset)));
	//   54  118:aload           7
	//   55  120:aload           8
	//   56  122:invokevirtual   #604 <Method boolean HashSet.removeAll(java.util.Collection)>
	//   57  125:pop             
		hashset.removeAll(((java.util.Collection) (ondevicecollectionstatus.loadedImages)));
	//   58  126:aload           8
	//   59  128:aload           6
	//   60  130:getfield        #596 <Field HashSet CraftAROnDeviceIR$OnDeviceCollectionStatus.loadedImages>
	//   61  133:invokevirtual   #604 <Method boolean HashSet.removeAll(java.util.Collection)>
	//   62  136:pop             
		if(flag)
	//*  63  137:iload_3         
	//*  64  138:ifeq            146
			setActiveCollectionInternal(craftarondevicecollection);
	//   65  141:aload_0         
	//   66  142:aload_2         
	//   67  143:invokespecial   #606 <Method void setActiveCollectionInternal(CraftAROnDeviceCollection)>
		String s1 = craftarondevicecollection.getUUID();
	//   68  146:aload_2         
	//   69  147:invokevirtual   #491 <Method String CraftAROnDeviceCollection.getUUID()>
	//   70  150:astore          9
		String s2 = craftarondevicecollection.getLocalPath();
	//   71  152:aload_2         
	//   72  153:invokevirtual   #609 <Method String CraftAROnDeviceCollection.getLocalPath()>
	//   73  156:astore          10
		if(!ondevicecollectionstatus.loaded)
	//*  74  158:aload           6
	//*  75  160:getfield        #613 <Field boolean CraftAROnDeviceIR$OnDeviceCollectionStatus.loaded>
	//*  76  163:ifne            269
		{
			Object obj1 = ((Object) (new StringBuilder()));
	//   77  166:new             #97  <Class StringBuilder>
	//   78  169:dup             
	//   79  170:invokespecial   #98  <Method void StringBuilder()>
	//   80  173:astore          11
			((StringBuilder) (obj1)).append(s2);
	//   81  175:aload           11
	//   82  177:aload           10
	//   83  179:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   84  182:pop             
			((StringBuilder) (obj1)).append("/.tmpList.txt");
	//   85  183:aload           11
	//   86  185:ldc2            #615 <String "/.tmpList.txt">
	//   87  188:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   88  191:pop             
			obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   89  192:aload           11
	//   90  194:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   91  197:astore          11
			try
			{
				FileUtil.writeToFile("".getBytes(), ((String) (obj1)));
	//   92  199:ldc2            #617 <String "">
	//   93  202:invokevirtual   #620 <Method byte[] String.getBytes()>
	//   94  205:aload           11
	//   95  207:invokestatic    #626 <Method void FileUtil.writeToFile(byte[], String)>
				mCRE.loadGroup(s1, s2, ((String) (obj1)), craftarondevicecollection.mPublicKey);
	//   96  210:getstatic       #230 <Field CRE mCRE>
	//   97  213:aload           9
	//   98  215:aload           10
	//   99  217:aload           11
	//  100  219:aload_2         
	//  101  220:getfield        #629 <Field String CraftAROnDeviceCollection.mPublicKey>
	//  102  223:invokevirtual   #633 <Method boolean CRE.loadGroup(String, String, String, String)>
	//  103  226:pop             
				(new File(((String) (obj1)))).delete();
	//  104  227:new             #245 <Class File>
	//  105  230:dup             
	//  106  231:aload           11
	//  107  233:invokespecial   #247 <Method void File(String)>
	//  108  236:invokevirtual   #636 <Method boolean File.delete()>
	//  109  239:pop             
			}
	//* 110  240:goto            269
			// Misplaced declaration of an exception variable
			catch(CraftAROnDeviceCollection craftarondevicecollection)
	//* 111  243:astore_2        
			{
				((Exception) (craftarondevicecollection)).printStackTrace();
	//  112  244:aload_2         
	//  113  245:invokevirtual   #267 <Method void Exception.printStackTrace()>
				if(setCollectionListener != null)
	//* 114  248:aload_1         
	//* 115  249:ifnull          268
					mResponseHandlerThread.post(new Runnable() {

						public void run()
						{
							CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.ON_DEVICE_IR_INTERNAL_ERROR_LOADING_COLLECTION, "Can't write to collection directory");
						//    0    0:new             #28  <Class CraftARError>
						//    1    3:dup             
						//    2    4:getstatic       #34  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ON_DEVICE_IR_INTERNAL_ERROR_LOADING_COLLECTION>
						//    3    7:ldc1            #36  <String "Can't write to collection directory">
						//    4    9:invokespecial   #39  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
						//    5   12:astore_1        
							SetOnDeviceCollectionListener setondevicecollectionlistener = setCollectionListener;
						//    6   13:aload_0         
						//    7   14:getfield        #21  <Field SetOnDeviceCollectionListener val$setCollectionListener>
						//    8   17:astore_2        
							if(setondevicecollectionlistener != null)
						//*   9   18:aload_2         
						//*  10   19:ifnull          30
							{
								setondevicecollectionlistener.setCollectionFailed(craftarerror);
						//   11   22:aload_2         
						//   12   23:aload_1         
						//   13   24:invokeinterface #45  <Method void SetOnDeviceCollectionListener.setCollectionFailed(CraftARError)>
								return;
						//   14   29:return          
							} else
							{
								CLog.e(craftarerror.getErrorMessage());
						//   15   30:aload_1         
						//   16   31:invokevirtual   #49  <Method String CraftARError.getErrorMessage()>
						//   17   34:invokestatic    #55  <Method void CLog.e(String)>
								return;
						//   18   37:return          
							}
						}

						final CraftAROnDeviceIR this$0;
						final SetOnDeviceCollectionListener val$setCollectionListener;

			
			{
				this$0 = CraftAROnDeviceIR.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CraftAROnDeviceIR this$0>
				setCollectionListener = setondevicecollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field SetOnDeviceCollectionListener val$setCollectionListener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
					}
);
	//  116  252:getstatic       #286 <Field Handler mResponseHandlerThread>
	//  117  255:new             #26  <Class CraftAROnDeviceIR$8>
	//  118  258:dup             
	//  119  259:aload_0         
	//  120  260:aload_1         
	//  121  261:invokespecial   #637 <Method void CraftAROnDeviceIR$8(CraftAROnDeviceIR, SetOnDeviceCollectionListener)>
	//  122  264:invokevirtual   #346 <Method boolean Handler.post(Runnable)>
	//  123  267:pop             
				return;
	//  124  268:return          
			}
		}
		makeLoadProgress(((SetCollectionListener) (setCollectionListener)), 0.05F);
	//  125  269:aload_0         
	//  126  270:aload_1         
	//  127  271:ldc2            #638 <Float 0.05F>
	//  128  274:invokespecial   #640 <Method void makeLoadProgress(SetCollectionListener, float)>
		int j = ((HashSet) (obj)).size() + hashset.size();
	//  129  277:aload           7
	//  130  279:invokevirtual   #643 <Method int HashSet.size()>
	//  131  282:aload           8
	//  132  284:invokevirtual   #643 <Method int HashSet.size()>
	//  133  287:iadd            
	//  134  288:istore          5
		int i = 0;
	//  135  290:iconst_0        
	//  136  291:istore          4
		for(obj = ((Object) (((HashSet) (obj)).iterator())); ((Iterator) (obj)).hasNext(); makeLoadProgress(((SetCollectionListener) (setCollectionListener)), ((float)i / (float)j) * 0.9F))
	//* 137  293:aload           7
	//* 138  295:invokevirtual   #644 <Method Iterator HashSet.iterator()>
	//* 139  298:astore          7
	//* 140  300:aload           7
	//* 141  302:invokeinterface #456 <Method boolean Iterator.hasNext()>
	//* 142  307:ifeq            449
		{
			String s3 = (String)((Iterator) (obj)).next();
	//  143  310:aload           7
	//  144  312:invokeinterface #460 <Method Object Iterator.next()>
	//  145  317:checkcast       #471 <Class String>
	//  146  320:astore          10
			if(!mCRE.unloadImage(s1, s3))
	//* 147  322:getstatic       #230 <Field CRE mCRE>
	//* 148  325:aload           9
	//* 149  327:aload           10
	//* 150  329:invokevirtual   #648 <Method boolean CRE.unloadImage(String, String)>
	//* 151  332:ifne            381
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//  152  335:new             #97  <Class StringBuilder>
	//  153  338:dup             
	//  154  339:invokespecial   #98  <Method void StringBuilder()>
	//  155  342:astore          11
				stringbuilder2.append("Image '");
	//  156  344:aload           11
	//  157  346:ldc2            #650 <String "Image '">
	//  158  349:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  159  352:pop             
				stringbuilder2.append(s3);
	//  160  353:aload           11
	//  161  355:aload           10
	//  162  357:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  163  360:pop             
				stringbuilder2.append("' could not be unloaded from on-device Image Recognition.");
	//  164  361:aload           11
	//  165  363:ldc2            #652 <String "' could not be unloaded from on-device Image Recognition.">
	//  166  366:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  167  369:pop             
				CLog.w(stringbuilder2.toString());
	//  168  370:aload           11
	//  169  372:invokevirtual   #117 <Method String StringBuilder.toString()>
	//  170  375:invokestatic    #335 <Method void CLog.w(String)>
			} else
	//* 171  378:goto            424
			{
				StringBuilder stringbuilder3 = new StringBuilder();
	//  172  381:new             #97  <Class StringBuilder>
	//  173  384:dup             
	//  174  385:invokespecial   #98  <Method void StringBuilder()>
	//  175  388:astore          11
				stringbuilder3.append("Image: '");
	//  176  390:aload           11
	//  177  392:ldc2            #654 <String "Image: '">
	//  178  395:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  179  398:pop             
				stringbuilder3.append(s3);
	//  180  399:aload           11
	//  181  401:aload           10
	//  182  403:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  183  406:pop             
				stringbuilder3.append("' unloaded");
	//  184  407:aload           11
	//  185  409:ldc2            #656 <String "' unloaded">
	//  186  412:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  187  415:pop             
				CLog.d(stringbuilder3.toString());
	//  188  416:aload           11
	//  189  418:invokevirtual   #117 <Method String StringBuilder.toString()>
	//  190  421:invokestatic    #237 <Method void CLog.d(String)>
			}
			i++;
	//  191  424:iload           4
	//  192  426:iconst_1        
	//  193  427:iadd            
	//  194  428:istore          4
		}

	//  195  430:aload_0         
	//  196  431:aload_1         
	//  197  432:iload           4
	//  198  434:i2f             
	//  199  435:iload           5
	//  200  437:i2f             
	//  201  438:fdiv            
	//  202  439:ldc2            #657 <Float 0.9F>
	//  203  442:fmul            
	//  204  443:invokespecial   #640 <Method void makeLoadProgress(SetCollectionListener, float)>
	//* 205  446:goto            300
		for(Iterator iterator = hashset.iterator(); iterator.hasNext(); makeLoadProgress(((SetCollectionListener) (setCollectionListener)), ((float)i / (float)j) * 0.9F))
	//* 206  449:aload           8
	//* 207  451:invokevirtual   #644 <Method Iterator HashSet.iterator()>
	//* 208  454:astore          7
	//* 209  456:aload           7
	//* 210  458:invokeinterface #456 <Method boolean Iterator.hasNext()>
	//* 211  463:ifeq            605
		{
			String s = (String)iterator.next();
	//  212  466:aload           7
	//  213  468:invokeinterface #460 <Method Object Iterator.next()>
	//  214  473:checkcast       #471 <Class String>
	//  215  476:astore          8
			if(!mCRE.loadImage(s1, s))
	//* 216  478:getstatic       #230 <Field CRE mCRE>
	//* 217  481:aload           9
	//* 218  483:aload           8
	//* 219  485:invokevirtual   #660 <Method boolean CRE.loadImage(String, String)>
	//* 220  488:ifne            537
			{
				StringBuilder stringbuilder = new StringBuilder();
	//  221  491:new             #97  <Class StringBuilder>
	//  222  494:dup             
	//  223  495:invokespecial   #98  <Method void StringBuilder()>
	//  224  498:astore          10
				stringbuilder.append("Image '");
	//  225  500:aload           10
	//  226  502:ldc2            #650 <String "Image '">
	//  227  505:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  228  508:pop             
				stringbuilder.append(s);
	//  229  509:aload           10
	//  230  511:aload           8
	//  231  513:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  232  516:pop             
				stringbuilder.append("' could not be loaded for on-device Image Recognition.");
	//  233  517:aload           10
	//  234  519:ldc2            #662 <String "' could not be loaded for on-device Image Recognition.">
	//  235  522:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  236  525:pop             
				CLog.w(stringbuilder.toString());
	//  237  526:aload           10
	//  238  528:invokevirtual   #117 <Method String StringBuilder.toString()>
	//  239  531:invokestatic    #335 <Method void CLog.w(String)>
			} else
	//* 240  534:goto            580
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//  241  537:new             #97  <Class StringBuilder>
	//  242  540:dup             
	//  243  541:invokespecial   #98  <Method void StringBuilder()>
	//  244  544:astore          10
				stringbuilder1.append("Image: '");
	//  245  546:aload           10
	//  246  548:ldc2            #654 <String "Image: '">
	//  247  551:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  248  554:pop             
				stringbuilder1.append(s);
	//  249  555:aload           10
	//  250  557:aload           8
	//  251  559:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  252  562:pop             
				stringbuilder1.append("' loaded");
	//  253  563:aload           10
	//  254  565:ldc2            #664 <String "' loaded">
	//  255  568:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  256  571:pop             
				CLog.d(stringbuilder1.toString());
	//  257  572:aload           10
	//  258  574:invokevirtual   #117 <Method String StringBuilder.toString()>
	//  259  577:invokestatic    #237 <Method void CLog.d(String)>
			}
			i++;
	//  260  580:iload           4
	//  261  582:iconst_1        
	//  262  583:iadd            
	//  263  584:istore          4
		}

	//  264  586:aload_0         
	//  265  587:aload_1         
	//  266  588:iload           4
	//  267  590:i2f             
	//  268  591:iload           5
	//  269  593:i2f             
	//  270  594:fdiv            
	//  271  595:ldc2            #657 <Float 0.9F>
	//  272  598:fmul            
	//  273  599:invokespecial   #640 <Method void makeLoadProgress(SetCollectionListener, float)>
	//* 274  602:goto            456
		makeLoadProgress(((SetCollectionListener) (setCollectionListener)), 0.95F);
	//  275  605:aload_0         
	//  276  606:aload_1         
	//  277  607:ldc2            #665 <Float 0.95F>
	//  278  610:invokespecial   #640 <Method void makeLoadProgress(SetCollectionListener, float)>
		ondevicecollectionstatus.loaded = true;
	//  279  613:aload           6
	//  280  615:iconst_1        
	//  281  616:putfield        #613 <Field boolean CraftAROnDeviceIR$OnDeviceCollectionStatus.loaded>
		ondevicecollectionstatus.loadedImages = craftarondevicecollection.getListOfImages();
	//  282  619:aload           6
	//  283  621:aload_2         
	//  284  622:invokevirtual   #588 <Method HashSet CraftAROnDeviceCollection.getListOfImages()>
	//  285  625:putfield        #596 <Field HashSet CraftAROnDeviceIR$OnDeviceCollectionStatus.loadedImages>
		mCollectionUUIDsList.put(((Object) (craftarondevicecollection.getUUID())), ((Object) (ondevicecollectionstatus)));
	//  286  628:getstatic       #300 <Field HashMap mCollectionUUIDsList>
	//  287  631:aload_2         
	//  288  632:invokevirtual   #491 <Method String CraftAROnDeviceCollection.getUUID()>
	//  289  635:aload           6
	//  290  637:invokevirtual   #669 <Method Object HashMap.put(Object, Object)>
	//  291  640:pop             
		if(flag)
	//* 292  641:iload_3         
	//* 293  642:ifeq            650
			setActiveCollectionInternal(craftarondevicecollection);
	//  294  645:aload_0         
	//  295  646:aload_2         
	//  296  647:invokespecial   #606 <Method void setActiveCollectionInternal(CraftAROnDeviceCollection)>
		makeLoadProgress(((SetCollectionListener) (setCollectionListener)), 1.0F);
	//  297  650:aload_0         
	//  298  651:aload_1         
	//  299  652:fconst_1        
	//  300  653:invokespecial   #640 <Method void makeLoadProgress(SetCollectionListener, float)>
		if(setCollectionListener != null)
	//* 301  656:aload_1         
	//* 302  657:ifnull          676
			mResponseHandlerThread.post(new Runnable() {

				public void run()
				{
					SetOnDeviceCollectionListener setondevicecollectionlistener = setCollectionListener;
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field SetOnDeviceCollectionListener val$setCollectionListener>
				//    2    4:astore_1        
					if(setondevicecollectionlistener != null)
				//*   3    5:aload_1         
				//*   4    6:ifnull          16
						setondevicecollectionlistener.collectionReady(((java.util.List) (null)));
				//    5    9:aload_1         
				//    6   10:aconst_null     
				//    7   11:invokeinterface #32  <Method void SetOnDeviceCollectionListener.collectionReady(java.util.List)>
				//    8   16:return          
				}

				final CraftAROnDeviceIR this$0;
				final SetOnDeviceCollectionListener val$setCollectionListener;

			
			{
				this$0 = CraftAROnDeviceIR.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CraftAROnDeviceIR this$0>
				setCollectionListener = setondevicecollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field SetOnDeviceCollectionListener val$setCollectionListener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//  303  660:getstatic       #286 <Field Handler mResponseHandlerThread>
	//  304  663:new             #28  <Class CraftAROnDeviceIR$9>
	//  305  666:dup             
	//  306  667:aload_0         
	//  307  668:aload_1         
	//  308  669:invokespecial   #670 <Method void CraftAROnDeviceIR$9(CraftAROnDeviceIR, SetOnDeviceCollectionListener)>
	//  309  672:invokevirtual   #346 <Method boolean Handler.post(Runnable)>
	//  310  675:pop             
	//  311  676:return          
	}

	private void takeConfigFileFromUserAssets()
		throws IOException, android.content.pm.PackageManager.NameNotFoundException
	{
		ZipFile zipfile = new ZipFile(mContext.getPackageManager().getApplicationInfo(mContext.getPackageName(), 0).sourceDir);
	//    0    0:new             #676 <Class ZipFile>
	//    1    3:dup             
	//    2    4:getstatic       #88  <Field Context mContext>
	//    3    7:invokevirtual   #680 <Method PackageManager Context.getPackageManager()>
	//    4   10:getstatic       #88  <Field Context mContext>
	//    5   13:invokevirtual   #683 <Method String Context.getPackageName()>
	//    6   16:iconst_0        
	//    7   17:invokevirtual   #689 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    8   20:getfield        #694 <Field String ApplicationInfo.sourceDir>
	//    9   23:invokespecial   #695 <Method void ZipFile(String)>
	//   10   26:astore_2        
		Object obj = ((Object) (zipfile.getEntry("assets/CraftARSDKConfig")));
	//   11   27:aload_2         
	//   12   28:ldc1            #45  <String "assets/CraftARSDKConfig">
	//   13   30:invokevirtual   #699 <Method java.util.zip.ZipEntry ZipFile.getEntry(String)>
	//   14   33:astore_3        
		if(obj == null)
	//*  15   34:aload_3         
	//*  16   35:ifnonnull       47
		{
			CLog.e("assets/CraftARSDKConfig not found");
	//   17   38:ldc2            #701 <String "assets/CraftARSDKConfig not found">
	//   18   41:invokestatic    #264 <Method void CLog.e(String)>
		} else
	//*  19   44:goto            121
		{
			obj = ((Object) (zipfile.getInputStream(((java.util.zip.ZipEntry) (obj)))));
	//   20   47:aload_2         
	//   21   48:aload_3         
	//   22   49:invokevirtual   #705 <Method InputStream ZipFile.getInputStream(java.util.zip.ZipEntry)>
	//   23   52:astore_3        
			byte abyte0[] = new byte[1024];
	//   24   53:sipush          1024
	//   25   56:newarray        byte[]
	//   26   58:astore          4
			FileOutputStream fileoutputstream = new FileOutputStream(CONFIG_PATH);
	//   27   60:new             #707 <Class FileOutputStream>
	//   28   63:dup             
	//   29   64:aload_0         
	//   30   65:getfield        #119 <Field String CONFIG_PATH>
	//   31   68:invokespecial   #708 <Method void FileOutputStream(String)>
	//   32   71:astore          5
			BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(((java.io.OutputStream) (fileoutputstream)));
	//   33   73:new             #710 <Class BufferedOutputStream>
	//   34   76:dup             
	//   35   77:aload           5
	//   36   79:invokespecial   #713 <Method void BufferedOutputStream(java.io.OutputStream)>
	//   37   82:astore          6
			do
			{
				int i = ((InputStream) (obj)).read(abyte0);
	//   38   84:aload_3         
	//   39   85:aload           4
	//   40   87:invokevirtual   #719 <Method int InputStream.read(byte[])>
	//   41   90:istore_1        
				if(i <= 0)
					break;
	//   42   91:iload_1         
	//   43   92:ifle            107
				bufferedoutputstream.write(abyte0, 0, i);
	//   44   95:aload           6
	//   45   97:aload           4
	//   46   99:iconst_0        
	//   47  100:iload_1         
	//   48  101:invokevirtual   #723 <Method void BufferedOutputStream.write(byte[], int, int)>
			} while(true);
	//   49  104:goto            84
			((InputStream) (obj)).close();
	//   50  107:aload_3         
	//   51  108:invokevirtual   #726 <Method void InputStream.close()>
			bufferedoutputstream.close();
	//   52  111:aload           6
	//   53  113:invokevirtual   #727 <Method void BufferedOutputStream.close()>
			fileoutputstream.close();
	//   54  116:aload           5
	//   55  118:invokevirtual   #728 <Method void FileOutputStream.close()>
		}
		zipfile.close();
	//   56  121:aload_2         
	//   57  122:invokevirtual   #729 <Method void ZipFile.close()>
	//   58  125:return          
	}

	private void unloadCollectionInternal(String s)
	{
		if(mCollectionUUIDsList.get(((Object) (s))) == null)
	//*   0    0:getstatic       #300 <Field HashMap mCollectionUUIDsList>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #584 <Method Object HashMap.get(Object)>
	//*   3    7:ifnonnull       11
			return;
	//    4   10:return          
		mCRE.unloadGroup(s);
	//    5   11:getstatic       #230 <Field CRE mCRE>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #733 <Method boolean CRE.unloadGroup(String)>
	//    8   18:pop             
		CraftAROnDeviceCollection craftarondevicecollection = currentCollection;
	//    9   19:getstatic       #354 <Field CraftAROnDeviceCollection currentCollection>
	//   10   22:astore_2        
		if(craftarondevicecollection != null && s.equals(((Object) (craftarondevicecollection.getUUID()))))
	//*  11   23:aload_2         
	//*  12   24:ifnull          42
	//*  13   27:aload_1         
	//*  14   28:aload_2         
	//*  15   29:invokevirtual   #491 <Method String CraftAROnDeviceCollection.getUUID()>
	//*  16   32:invokevirtual   #736 <Method boolean String.equals(Object)>
	//*  17   35:ifeq            42
			currentCollection = null;
	//   18   38:aconst_null     
	//   19   39:putstatic       #354 <Field CraftAROnDeviceCollection currentCollection>
		((OnDeviceCollectionStatus)mCollectionUUIDsList.get(((Object) (s)))).loaded = false;
	//   20   42:getstatic       #300 <Field HashMap mCollectionUUIDsList>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #584 <Method Object HashMap.get(Object)>
	//   23   49:checkcast       #30  <Class CraftAROnDeviceIR$OnDeviceCollectionStatus>
	//   24   52:iconst_0        
	//   25   53:putfield        #613 <Field boolean CraftAROnDeviceIR$OnDeviceCollectionStatus.loaded>
		((OnDeviceCollectionStatus)mCollectionUUIDsList.get(((Object) (s)))).loadedImages.clear();
	//   26   56:getstatic       #300 <Field HashMap mCollectionUUIDsList>
	//   27   59:aload_1         
	//   28   60:invokevirtual   #584 <Method Object HashMap.get(Object)>
	//   29   63:checkcast       #30  <Class CraftAROnDeviceIR$OnDeviceCollectionStatus>
	//   30   66:getfield        #596 <Field HashSet CraftAROnDeviceIR$OnDeviceCollectionStatus.loadedImages>
	//   31   69:invokevirtual   #739 <Method void HashSet.clear()>
	//   32   72:return          
	}

	private static void updateAvailableCollectionsInternal()
	{
		CraftAROnDeviceIR craftarondeviceir = Instance();
	//    0    0:invokestatic    #741 <Method CraftAROnDeviceIR Instance()>
	//    1    3:astore_0        
		Iterator iterator = CraftAROnDeviceCollectionManager.Instance().listCollections().iterator();
	//    2    4:invokestatic    #291 <Method CraftAROnDeviceCollectionManager CraftAROnDeviceCollectionManager.Instance()>
	//    3    7:invokevirtual   #745 <Method Set CraftAROnDeviceCollectionManager.listCollections()>
	//    4   10:invokeinterface #748 <Method Iterator Set.iterator()>
	//    5   15:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   16:aload_1         
	//    7   17:invokeinterface #456 <Method boolean Iterator.hasNext()>
	//    8   22:ifeq            71
			String s = (String)iterator.next();
	//    9   25:aload_1         
	//   10   26:invokeinterface #460 <Method Object Iterator.next()>
	//   11   31:checkcast       #471 <Class String>
	//   12   34:astore_2        
			if(!mCollectionUUIDsList.containsKey(((Object) (s))))
	//*  13   35:getstatic       #300 <Field HashMap mCollectionUUIDsList>
	//*  14   38:aload_2         
	//*  15   39:invokevirtual   #751 <Method boolean HashMap.containsKey(Object)>
	//*  16   42:ifne            16
			{
				HashMap hashmap = mCollectionUUIDsList;
	//   17   45:getstatic       #300 <Field HashMap mCollectionUUIDsList>
	//   18   48:astore_3        
				((Object) (craftarondeviceir)).getClass();
	//   19   49:aload_0         
	//   20   50:invokevirtual   #143 <Method Class Object.getClass()>
	//   21   53:pop             
				hashmap.put(((Object) (s)), ((Object) (((OnDeviceCollectionStatus) (craftarondeviceir)). new OnDeviceCollectionStatus())));
	//   22   54:aload_3         
	//   23   55:aload_2         
	//   24   56:new             #30  <Class CraftAROnDeviceIR$OnDeviceCollectionStatus>
	//   25   59:dup             
	//   26   60:aload_0         
	//   27   61:invokespecial   #600 <Method void CraftAROnDeviceIR$OnDeviceCollectionStatus(CraftAROnDeviceIR)>
	//   28   64:invokevirtual   #669 <Method Object HashMap.put(Object, Object)>
	//   29   67:pop             
			}
		} while(true);
	//   30   68:goto            16
	//   31   71:return          
	}

	public int getPendingSearchRequestsCount()
	{
		return mNumPendingSearchRequests;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field int mNumPendingSearchRequests>
	//    2    4:ireturn         
	}

	public SearchController getSearchController()
	{
		return ((SearchController) (mOnDeviceSearchController));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field OnDeviceSearchController mOnDeviceSearchController>
	//    2    4:areturn         
	}

	public void search(final CraftARQueryImage image)
	{
		mHandler.post(new Runnable() {

			public void run()
			{
				searchInternal(image, -1);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CraftAROnDeviceIR this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field CraftARQueryImage val$image>
			//    4    8:iconst_m1       
			//    5    9:invokestatic    #30  <Method void CraftAROnDeviceIR.access$200(CraftAROnDeviceIR, CraftARQueryImage, int)>
				CraftAROnDeviceIR craftarondeviceir = CraftAROnDeviceIR.this;
			//    6   12:aload_0         
			//    7   13:getfield        #19  <Field CraftAROnDeviceIR this$0>
			//    8   16:astore_1        
				craftarondeviceir.queryIdentifier = craftarondeviceir.queryIdentifier + 1L;
			//    9   17:aload_1         
			//   10   18:aload_1         
			//   11   19:getfield        #34  <Field long CraftAROnDeviceIR.queryIdentifier>
			//   12   22:lconst_1        
			//   13   23:ladd            
			//   14   24:putfield        #34  <Field long CraftAROnDeviceIR.queryIdentifier>
			//   15   27:return          
			}

			final CraftAROnDeviceIR this$0;
			final CraftARQueryImage val$image;

			
			{
				this$0 = CraftAROnDeviceIR.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CraftAROnDeviceIR this$0>
				image = craftarqueryimage;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CraftARQueryImage val$image>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Handler mHandler>
	//    2    4:new             #20  <Class CraftAROnDeviceIR$5>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #758 <Method void CraftAROnDeviceIR$5(CraftAROnDeviceIR, CraftARQueryImage)>
	//    7   13:invokevirtual   #346 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	public void search(final CraftARQueryImage image, final int requestCode)
	{
		mHandler.post(new Runnable() {

			public void run()
			{
				searchInternal(image, requestCode);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field CraftAROnDeviceIR this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field CraftARQueryImage val$image>
			//    4    8:aload_0         
			//    5    9:getfield        #25  <Field int val$requestCode>
			//    6   12:invokestatic    #33  <Method void CraftAROnDeviceIR.access$200(CraftAROnDeviceIR, CraftARQueryImage, int)>
			//    7   15:return          
			}

			final CraftAROnDeviceIR this$0;
			final CraftARQueryImage val$image;
			final int val$requestCode;

			
			{
				this$0 = CraftAROnDeviceIR.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CraftAROnDeviceIR this$0>
				image = craftarqueryimage;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field CraftARQueryImage val$image>
				requestCode = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int val$requestCode>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Handler mHandler>
	//    2    4:new             #18  <Class CraftAROnDeviceIR$4>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokespecial   #760 <Method void CraftAROnDeviceIR$4(CraftAROnDeviceIR, CraftARQueryImage, int)>
	//    8   14:invokevirtual   #346 <Method boolean Handler.post(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void setCollection(CraftAROnDeviceCollection craftarondevicecollection, SetOnDeviceCollectionListener setondevicecollectionlistener)
	{
		setCollection(craftarondevicecollection, true, setondevicecollectionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:aload_2         
	//    4    4:invokevirtual   #765 <Method void setCollection(CraftAROnDeviceCollection, boolean, SetOnDeviceCollectionListener)>
	//    5    7:return          
	}

	public void setCollection(final CraftAROnDeviceCollection collection, final boolean setAsActiveCollection, final SetOnDeviceCollectionListener listener)
	{
		mHandler.post(new Runnable() {

			public void run()
			{
				setCollectionInternal(listener, collection, setAsActiveCollection);
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

			
			{
				this$0 = CraftAROnDeviceIR.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CraftAROnDeviceIR this$0>
				listener = setondevicecollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field SetOnDeviceCollectionListener val$listener>
				collection = craftarondevicecollection;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field CraftAROnDeviceCollection val$collection>
				setAsActiveCollection = flag;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #29  <Field boolean val$setAsActiveCollection>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Handler mHandler>
	//    2    4:new             #14  <Class CraftAROnDeviceIR$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokespecial   #767 <Method void CraftAROnDeviceIR$2(CraftAROnDeviceIR, SetOnDeviceCollectionListener, CraftAROnDeviceCollection, boolean)>
	//    9   15:invokevirtual   #346 <Method boolean Handler.post(Runnable)>
	//   10   18:pop             
	//   11   19:return          
	}

	public void setCollection(String s, SetOnDeviceCollectionListener setondevicecollectionlistener)
	{
		setCollection(s, true, setondevicecollectionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:aload_2         
	//    4    4:invokevirtual   #771 <Method void setCollection(String, boolean, SetOnDeviceCollectionListener)>
	//    5    7:return          
	}

	public void setCollection(final String error, boolean flag, final SetOnDeviceCollectionListener listener)
	{
		CraftAROnDeviceCollection craftarondevicecollection = CraftAROnDeviceCollectionManager.Instance().get(error);
	//    0    0:invokestatic    #291 <Method CraftAROnDeviceCollectionManager CraftAROnDeviceCollectionManager.Instance()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #774 <Method CraftAROnDeviceCollection CraftAROnDeviceCollectionManager.get(String)>
	//    3    7:astore          4
		if(craftarondevicecollection != null)
	//*   4    9:aload           4
	//*   5   11:ifnull          23
		{
			setCollection(craftarondevicecollection, flag, listener);
	//    6   14:aload_0         
	//    7   15:aload           4
	//    8   17:iload_2         
	//    9   18:aload_3         
	//   10   19:invokevirtual   #765 <Method void setCollection(CraftAROnDeviceCollection, boolean, SetOnDeviceCollectionListener)>
			return;
	//   11   22:return          
		}
		if(listener != null)
	//*  12   23:aload_3         
	//*  13   24:ifnull          98
		{
			CraftARError.ERROR_CODES error_codes = CraftARError.ERROR_CODES.ON_DEVICE_IR_COLLECTION_NOT_FOUND;
	//   14   27:getstatic       #777 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ON_DEVICE_IR_COLLECTION_NOT_FOUND>
	//   15   30:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   16   32:new             #97  <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #98  <Method void StringBuilder()>
	//   19   39:astore          5
			stringbuilder.append("No collection with token ");
	//   20   41:aload           5
	//   21   43:ldc2            #779 <String "No collection with token ">
	//   22   46:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
			stringbuilder.append(error);
	//   24   50:aload           5
	//   25   52:aload_1         
	//   26   53:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
			stringbuilder.append(" was found");
	//   28   57:aload           5
	//   29   59:ldc2            #781 <String " was found">
	//   30   62:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   31   65:pop             
			error = ((String) (new CraftARError(error_codes, stringbuilder.toString())));
	//   32   66:new             #190 <Class CraftARError>
	//   33   69:dup             
	//   34   70:aload           4
	//   35   72:aload           5
	//   36   74:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   37   77:invokespecial   #201 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   38   80:astore_1        
			mResponseHandlerThread.post(new Runnable() {

				public void run()
				{
					SetOnDeviceCollectionListener setondevicecollectionlistener = listener;
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field SetOnDeviceCollectionListener val$listener>
				//    2    4:astore_1        
					if(setondevicecollectionlistener != null)
				//*   3    5:aload_1         
				//*   4    6:ifnull          20
					{
						setondevicecollectionlistener.setCollectionFailed(error);
				//    5    9:aload_1         
				//    6   10:aload_0         
				//    7   11:getfield        #25  <Field CraftARError val$error>
				//    8   14:invokeinterface #36  <Method void SetOnDeviceCollectionListener.setCollectionFailed(CraftARError)>
						return;
				//    9   19:return          
					} else
					{
						CLog.e(error.getErrorMessage());
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

			
			{
				this$0 = CraftAROnDeviceIR.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CraftAROnDeviceIR this$0>
				listener = setondevicecollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field SetOnDeviceCollectionListener val$listener>
				error = craftarerror;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field CraftARError val$error>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   39   81:getstatic       #286 <Field Handler mResponseHandlerThread>
	//   40   84:new             #6   <Class CraftAROnDeviceIR$1>
	//   41   87:dup             
	//   42   88:aload_0         
	//   43   89:aload_3         
	//   44   90:aload_1         
	//   45   91:invokespecial   #784 <Method void CraftAROnDeviceIR$1(CraftAROnDeviceIR, SetOnDeviceCollectionListener, CraftARError)>
	//   46   94:invokevirtual   #346 <Method boolean Handler.post(Runnable)>
	//   47   97:pop             
		}
	//   48   98:return          
	}

	public void unloadCollection(CraftAROnDeviceCollection craftarondevicecollection)
	{
		unloadCollection(craftarondevicecollection.getUUID());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #491 <Method String CraftAROnDeviceCollection.getUUID()>
	//    3    5:invokevirtual   #787 <Method void unloadCollection(String)>
	//    4    8:return          
	}

	public void unloadCollection(final String collectionUUID)
	{
		mHandler.post(new Runnable() {

			public void run()
			{
				unloadCollectionInternal(collectionUUID);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CraftAROnDeviceIR this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field String val$collectionUUID>
			//    4    8:invokestatic    #29  <Method void CraftAROnDeviceIR.access$100(CraftAROnDeviceIR, String)>
			//    5   11:return          
			}

			final CraftAROnDeviceIR this$0;
			final String val$collectionUUID;

			
			{
				this$0 = CraftAROnDeviceIR.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CraftAROnDeviceIR this$0>
				collectionUUID = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$collectionUUID>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Handler mHandler>
	//    2    4:new             #16  <Class CraftAROnDeviceIR$3>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #788 <Method void CraftAROnDeviceIR$3(CraftAROnDeviceIR, String)>
	//    7   13:invokevirtual   #346 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	private static final String CONFIG_IN_ASSETS = "assets/CraftARSDKConfig";
	static final int NO_REQUEST_CODE = -1;
	static CraftAROnDeviceCollection currentCollection;
	static CRE mCRE;
	static HashMap mCollectionUUIDsList;
	static Context mContext;
	static HandlerThread mHandlerThread;
	private static CraftARInternalInterfaces.CollectionEventsHandler mOnDeviceInternalCollectionEventsHandler;
	static Handler mResponseHandlerThread;
	static CraftAROnDeviceIR self;
	private final String CONFIG_PATH;
	Handler mHandler;
	int mNumPendingSearchRequests;
	private OnDeviceSearchController mOnDeviceSearchController;
	int numQueries;
	long queryIdentifier;

	static 
	{
	//    0    0:return          
	}


/*
	static void access$000(CraftAROnDeviceIR craftarondeviceir, SetOnDeviceCollectionListener setondevicecollectionlistener, CraftAROnDeviceCollection craftarondevicecollection, boolean flag)
	{
		craftarondeviceir.setCollectionInternal(setondevicecollectionlistener, craftarondevicecollection, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #163 <Method void setCollectionInternal(SetOnDeviceCollectionListener, CraftAROnDeviceCollection, boolean)>
		return;
	//    5    7:return          
	}

*/


/*
	static void access$100(CraftAROnDeviceIR craftarondeviceir, String s)
	{
		craftarondeviceir.unloadCollectionInternal(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #168 <Method void unloadCollectionInternal(String)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$200(CraftAROnDeviceIR craftarondeviceir, CraftARQueryImage craftarqueryimage, int i)
	{
		craftarondeviceir.searchInternal(craftarqueryimage, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #174 <Method void searchInternal(CraftARQueryImage, int)>
		return;
	//    4    6:return          
	}

*/


/*
	static CraftARError access$300(int i)
	{
		return getCraftARError(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #179 <Method CraftARError getCraftARError(int)>
	//    2    4:areturn         
	}

*/


/*
	static void access$400(CraftAROnDeviceIR craftarondeviceir)
	{
		craftarondeviceir.initInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #183 <Method void initInternal()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$500()
	{
		updateAvailableCollectionsInternal();
	//    0    0:invokestatic    #187 <Method void updateAvailableCollectionsInternal()>
		return;
	//    1    3:return          
	}

*/
}
