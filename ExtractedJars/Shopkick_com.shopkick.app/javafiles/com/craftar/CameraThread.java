// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.*;
import android.view.*;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.craftar:
//			MyHandlerThread, MySynchronizedPool, CLog, VideoCaptureConsumerHub, 
//			ConfCamera, CraftARError

class CameraThread extends MyHandlerThread
	implements android.hardware.Camera.PreviewCallback
{
	private class AutoFocusCB
		implements android.hardware.Camera.AutoFocusCallback
	{

		public void onAutoFocus(boolean flag, Camera camera)
		{
			android.hardware.Camera.Parameters parameters1 = camera.getParameters();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #33  <Method android.hardware.Camera$Parameters Camera.getParameters()>
		//    2    4:astore          4
			android.hardware.Camera.Parameters parameters = parameters1;
		//    3    6:aload           4
		//    4    8:astore_3        
			if(android.os.Build.VERSION.SDK_INT >= 14)
		//*   5    9:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
		//*   6   12:bipush          14
		//*   7   14:icmplt          55
			{
				parameters = parameters1;
		//    8   17:aload           4
		//    9   19:astore_3        
				if(parameters1.isAutoExposureLockSupported())
		//*  10   20:aload           4
		//*  11   22:invokevirtual   #45  <Method boolean android.hardware.Camera$Parameters.isAutoExposureLockSupported()>
		//*  12   25:ifeq            55
				{
					parameters1.setAutoExposureLock(true);
		//   13   28:aload           4
		//   14   30:iconst_1        
		//   15   31:invokevirtual   #49  <Method void android.hardware.Camera$Parameters.setAutoExposureLock(boolean)>
					camera.setParameters(parameters1);
		//   16   34:aload_2         
		//   17   35:aload           4
		//   18   37:invokevirtual   #53  <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
					parameters = camera.getParameters();
		//   19   40:aload_2         
		//   20   41:invokevirtual   #33  <Method android.hardware.Camera$Parameters Camera.getParameters()>
		//   21   44:astore_3        
					parameters.setAutoExposureLock(false);
		//   22   45:aload_3         
		//   23   46:iconst_0        
		//   24   47:invokevirtual   #49  <Method void android.hardware.Camera$Parameters.setAutoExposureLock(boolean)>
					camera.setParameters(parameters);
		//   25   50:aload_2         
		//   26   51:aload_3         
		//   27   52:invokevirtual   #53  <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
				}
			}
			if(mRequestedFocusMode != null)
		//*  28   55:aload_0         
		//*  29   56:getfield        #15  <Field CameraThread this$0>
		//*  30   59:invokestatic    #57  <Method String CameraThread.access$1800(CameraThread)>
		//*  31   62:ifnull          90
			{
				parameters.setFocusMode(mRequestedFocusMode);
		//   32   65:aload_3         
		//   33   66:aload_0         
		//   34   67:getfield        #15  <Field CameraThread this$0>
		//   35   70:invokestatic    #57  <Method String CameraThread.access$1800(CameraThread)>
		//   36   73:invokevirtual   #61  <Method void android.hardware.Camera$Parameters.setFocusMode(String)>
				mCamera.setParameters(parameters);
		//   37   76:aload_0         
		//   38   77:getfield        #15  <Field CameraThread this$0>
		//   39   80:invokestatic    #65  <Method Camera CameraThread.access$000(CameraThread)>
		//   40   83:aload_3         
		//   41   84:invokevirtual   #53  <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
			} else
		//*  42   87:goto            95
			{
				CLog.e("Focus mode not set");
		//   43   90:ldc1            #67  <String "Focus mode not set">
		//   44   92:invokestatic    #72  <Method void CLog.e(String)>
			}
			CLog.v("focused!");
		//   45   95:ldc1            #74  <String "focused!">
		//   46   97:invokestatic    #77  <Method void CLog.v(String)>
		//   47  100:return          
		}

		final CameraThread this$0;

		private AutoFocusCB()
		{
			this$0 = CameraThread.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field CameraThread this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	private class AutoFocusPeriodicTask
		implements Runnable
	{

		public void run()
		{
			if(mCapturing && !mIsStopping)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field CameraThread this$0>
		//*   2    4:invokestatic    #30  <Method boolean CameraThread.access$1500(CameraThread)>
		//*   3    7:ifeq            75
		//*   4   10:aload_0         
		//*   5   11:getfield        #17  <Field CameraThread this$0>
		//*   6   14:invokestatic    #33  <Method boolean CameraThread.access$400(CameraThread)>
		//*   7   17:ifeq            23
		//*   8   20:goto            75
			{
				CLog.v("AutoFocusPeriodicTask(): focus!");
		//    9   23:ldc1            #35  <String "AutoFocusPeriodicTask(): focus!">
		//   10   25:invokestatic    #41  <Method void CLog.v(String)>
				try
				{
					mCamera.autoFocus(((android.hardware.Camera.AutoFocusCallback) (autoFocusCB)));
		//   11   28:aload_0         
		//   12   29:getfield        #17  <Field CameraThread this$0>
		//   13   32:invokestatic    #45  <Method Camera CameraThread.access$000(CameraThread)>
		//   14   35:aload_0         
		//   15   36:getfield        #17  <Field CameraThread this$0>
		//   16   39:invokestatic    #49  <Method CameraThread$AutoFocusCB CameraThread.access$1600(CameraThread)>
		//   17   42:invokevirtual   #55  <Method void Camera.autoFocus(android.hardware.Camera$AutoFocusCallback)>
				}
		//*  18   45:goto            58
				catch(RuntimeException runtimeexception)
		//*  19   48:astore_1        
				{
					CLog.e("Autofocus failed");
		//   20   49:ldc1            #57  <String "Autofocus failed">
		//   21   51:invokestatic    #60  <Method void CLog.e(String)>
					runtimeexception.printStackTrace();
		//   22   54:aload_1         
		//   23   55:invokevirtual   #63  <Method void RuntimeException.printStackTrace()>
				}
				mHandler.postDelayed(((Runnable) (this)), mFocusPeriodMS);
		//   24   58:aload_0         
		//   25   59:getfield        #17  <Field CameraThread this$0>
		//   26   62:getfield        #67  <Field Handler CameraThread.mHandler>
		//   27   65:aload_0         
		//   28   66:aload_0         
		//   29   67:getfield        #22  <Field long mFocusPeriodMS>
		//   30   70:invokevirtual   #73  <Method boolean Handler.postDelayed(Runnable, long)>
		//   31   73:pop             
				return;
		//   32   74:return          
			} else
			{
				CLog.i("Capture finished, not focusing anymore");
		//   33   75:ldc1            #75  <String "Capture finished, not focusing anymore">
		//   34   77:invokestatic    #78  <Method void CLog.i(String)>
				return;
		//   35   80:return          
			}
		}

		private long mFocusPeriodMS;
		final CameraThread this$0;

		public AutoFocusPeriodicTask(int i)
		{
			this$0 = CameraThread.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field CameraThread this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			mFocusPeriodMS = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:i2l             
		//    8   12:putfield        #22  <Field long mFocusPeriodMS>
		//    9   15:return          
		}
	}

	public static interface CameraParamsTask
	{

		public abstract void onDone();

		public abstract void updateCameraParams(android.hardware.Camera.Parameters parameters);
	}

	static interface CameraThreadEventHandler
	{

		public abstract void onCameraOpenFailed();

		public abstract void onCameraOpenStuck();

		public abstract void onPictureTaken(byte abyte0[], int i, int j, int k);

		public abstract void onPreviewStarted(int i, int j, int k);

		public abstract void onReadyToSetPreviewDisplay(int i, int j);

		public abstract void takePictureFailed(CraftARError craftarerror);
	}

	public static interface DisplayOrientationCallback
	{

		public abstract void onDisplayOrientationUpdated(int i);
	}

	static interface OnCameraClosedListener
	{

		public abstract void onCameraClosed();
	}


	private CameraThread()
	{
		super("CameraThread");
	//    0    0:aload_0         
	//    1    1:ldc1            #103 <String "CameraThread">
	//    2    3:invokespecial   #106 <Method void MyHandlerThread(String)>
		mBufferPool = new MySynchronizedPool(5);
	//    3    6:aload_0         
	//    4    7:new             #108 <Class MySynchronizedPool>
	//    5   10:dup             
	//    6   11:iconst_5        
	//    7   12:invokespecial   #111 <Method void MySynchronizedPool(int)>
	//    8   15:putfield        #113 <Field MySynchronizedPool mBufferPool>
		mLastWidth = 0;
	//    9   18:aload_0         
	//   10   19:iconst_0        
	//   11   20:putfield        #115 <Field int mLastWidth>
		mLastHeight = 0;
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:putfield        #117 <Field int mLastHeight>
		mLastBufferSize = 0;
	//   15   28:aload_0         
	//   16   29:iconst_0        
	//   17   30:putfield        #119 <Field int mLastBufferSize>
		mIsPreviewStarted = false;
	//   18   33:aload_0         
	//   19   34:iconst_0        
	//   20   35:putfield        #121 <Field boolean mIsPreviewStarted>
		mRequestedFocusMode = null;
	//   21   38:aload_0         
	//   22   39:aconst_null     
	//   23   40:putfield        #123 <Field String mRequestedFocusMode>
		mOpeningCamera = false;
	//   24   43:aload_0         
	//   25   44:iconst_0        
	//   26   45:putfield        #125 <Field boolean mOpeningCamera>
		mReadyToSetPreviewDisplay = false;
	//   27   48:aload_0         
	//   28   49:iconst_0        
	//   29   50:putfield        #127 <Field boolean mReadyToSetPreviewDisplay>
		framesLastSec = 0L;
	//   30   53:aload_0         
	//   31   54:lconst_0        
	//   32   55:putfield        #129 <Field long framesLastSec>
		lastComputedTimestamp = 0L;
	//   33   58:aload_0         
	//   34   59:lconst_0        
	//   35   60:putfield        #131 <Field long lastComputedTimestamp>
		autoFocusCB = new AutoFocusCB();
	//   36   63:aload_0         
	//   37   64:new             #36  <Class CameraThread$AutoFocusCB>
	//   38   67:dup             
	//   39   68:aload_0         
	//   40   69:aconst_null     
	//   41   70:invokespecial   #134 <Method void CameraThread$AutoFocusCB(CameraThread, CameraThread$1)>
	//   42   73:putfield        #136 <Field CameraThread$AutoFocusCB autoFocusCB>
		CLog.v("CameraThread() constructor");
	//   43   76:ldc1            #138 <String "CameraThread() constructor">
	//   44   78:invokestatic    #143 <Method void CLog.v(String)>
	//   45   81:return          
	}

	static CameraThread Instance(Context context)
	{
		if(self == null)
	//*   0    0:getstatic       #148 <Field CameraThread self>
	//*   1    3:ifnonnull       30
		{
			self = new CameraThread();
	//    2    6:new             #2   <Class CameraThread>
	//    3    9:dup             
	//    4   10:invokespecial   #150 <Method void CameraThread()>
	//    5   13:putstatic       #148 <Field CameraThread self>
			CameraThread camerathread = self;
	//    6   16:getstatic       #148 <Field CameraThread self>
	//    7   19:astore_1        
			camerathread.mContext = context;
	//    8   20:aload_1         
	//    9   21:aload_0         
	//   10   22:putfield        #152 <Field Context mContext>
			camerathread.mCapturing = false;
	//   11   25:aload_1         
	//   12   26:iconst_0        
	//   13   27:putfield        #154 <Field boolean mCapturing>
		}
		return self;
	//   14   30:getstatic       #148 <Field CameraThread self>
	//   15   33:areturn         
	}

	private android.hardware.Camera.Size getBestPreviewSize(android.hardware.Camera.Parameters parameters, int i, int j)
	{
		boolean flag;
		Object obj;
		Object obj1;
label0:
		{
label1:
			{
				boolean flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          10
				boolean flag1 = false;
	//    2    3:iconst_0        
	//    3    4:istore          9
				if(i >= 0 && j >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            23
	//*   6   10:iload_3         
	//*   7   11:ifge            17
	//*   8   14:goto            23
					flag = false;
	//    9   17:iconst_0        
	//   10   18:istore          8
				else
	//*  11   20:goto            26
					flag = true;
	//   12   23:iconst_1        
	//   13   24:istore          8
				obj1 = ((Object) (parameters.getPreviewSize()));
	//   14   26:aload_1         
	//   15   27:invokevirtual   #244 <Method android.hardware.Camera$Size android.hardware.Camera$Parameters.getPreviewSize()>
	//   16   30:astore          12
				obj = ((Object) (parameters.get("video-size-values")));
	//   17   32:aload_1         
	//   18   33:ldc1            #246 <String "video-size-values">
	//   19   35:invokevirtual   #250 <Method String android.hardware.Camera$Parameters.get(String)>
	//   20   38:astore          11
				if(obj == null)
	//*  21   40:aload           11
	//*  22   42:ifnonnull       51
					obj = null;
	//   23   45:aconst_null     
	//   24   46:astore          11
				else
	//*  25   48:goto            63
					obj = ((Object) (Arrays.asList(((Object []) (((String) (obj)).split(","))))));
	//   26   51:aload           11
	//   27   53:ldc1            #252 <String ",">
	//   28   55:invokevirtual   #258 <Method String[] String.split(String)>
	//   29   58:invokestatic    #264 <Method List Arrays.asList(Object[])>
	//   30   61:astore          11
				if(flag)
	//*  31   63:iload           8
	//*  32   65:ifeq            613
				{
					i = parameters.getPreviewSize().width;
	//   33   68:aload_1         
	//   34   69:invokevirtual   #244 <Method android.hardware.Camera$Size android.hardware.Camera$Parameters.getPreviewSize()>
	//   35   72:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//   36   75:istore_2        
					j = parameters.getPreviewSize().height;
	//   37   76:aload_1         
	//   38   77:invokevirtual   #244 <Method android.hardware.Camera$Size android.hardware.Camera$Parameters.getPreviewSize()>
	//   39   80:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//   40   83:istore_3        
					double d = (double)i / (double)j;
	//   41   84:iload_2         
	//   42   85:i2d             
	//   43   86:iload_3         
	//   44   87:i2d             
	//   45   88:ddiv            
	//   46   89:dstore          4
					CLog.d("Default size:");
	//   47   91:ldc2            #274 <String "Default size:">
	//   48   94:invokestatic    #277 <Method void CLog.d(String)>
					Object obj2 = ((Object) (new StringBuilder()));
	//   49   97:new             #279 <Class StringBuilder>
	//   50  100:dup             
	//   51  101:invokespecial   #280 <Method void StringBuilder()>
	//   52  104:astore          13
					((StringBuilder) (obj2)).append("\t ");
	//   53  106:aload           13
	//   54  108:ldc2            #282 <String "\t ">
	//   55  111:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   56  114:pop             
					((StringBuilder) (obj2)).append(i);
	//   57  115:aload           13
	//   58  117:iload_2         
	//   59  118:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//   60  121:pop             
					((StringBuilder) (obj2)).append("x");
	//   61  122:aload           13
	//   62  124:ldc2            #291 <String "x">
	//   63  127:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   64  130:pop             
					((StringBuilder) (obj2)).append(j);
	//   65  131:aload           13
	//   66  133:iload_3         
	//   67  134:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//   68  137:pop             
					((StringBuilder) (obj2)).append("(");
	//   69  138:aload           13
	//   70  140:ldc2            #293 <String "(">
	//   71  143:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   72  146:pop             
					((StringBuilder) (obj2)).append(d);
	//   73  147:aload           13
	//   74  149:dload           4
	//   75  151:invokevirtual   #296 <Method StringBuilder StringBuilder.append(double)>
	//   76  154:pop             
					((StringBuilder) (obj2)).append(")");
	//   77  155:aload           13
	//   78  157:ldc2            #298 <String ")">
	//   79  160:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   80  163:pop             
					CLog.d(((StringBuilder) (obj2)).toString());
	//   81  164:aload           13
	//   82  166:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   83  169:invokestatic    #277 <Method void CLog.d(String)>
					obj2 = ((Object) (new StringBuilder()));
	//   84  172:new             #279 <Class StringBuilder>
	//   85  175:dup             
	//   86  176:invokespecial   #280 <Method void StringBuilder()>
	//   87  179:astore          13
					((StringBuilder) (obj2)).append("VGALength:");
	//   88  181:aload           13
	//   89  183:ldc2            #304 <String "VGALength:">
	//   90  186:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   91  189:pop             
					((StringBuilder) (obj2)).append(0x4b000);
	//   92  190:aload           13
	//   93  192:ldc2            #305 <Int 0x4b000>
	//   94  195:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//   95  198:pop             
					CLog.d(((StringBuilder) (obj2)).toString());
	//   96  199:aload           13
	//   97  201:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   98  204:invokestatic    #277 <Method void CLog.d(String)>
					obj2 = ((Object) (new StringBuilder()));
	//   99  207:new             #279 <Class StringBuilder>
	//  100  210:dup             
	//  101  211:invokespecial   #280 <Method void StringBuilder()>
	//  102  214:astore          13
					((StringBuilder) (obj2)).append("HDLength:");
	//  103  216:aload           13
	//  104  218:ldc2            #307 <String "HDLength:">
	//  105  221:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  106  224:pop             
					((StringBuilder) (obj2)).append(0xe1000);
	//  107  225:aload           13
	//  108  227:ldc2            #308 <Int 0xe1000>
	//  109  230:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  110  233:pop             
					CLog.d(((StringBuilder) (obj2)).toString());
	//  111  234:aload           13
	//  112  236:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  113  239:invokestatic    #277 <Method void CLog.d(String)>
					parameters = ((android.hardware.Camera.Parameters) (parameters.getSupportedPreviewSizes()));
	//  114  242:aload_1         
	//  115  243:invokevirtual   #312 <Method List android.hardware.Camera$Parameters.getSupportedPreviewSizes()>
	//  116  246:astore_1        
					CLog.d("Sizes matching default aspect:");
	//  117  247:ldc2            #314 <String "Sizes matching default aspect:">
	//  118  250:invokestatic    #277 <Method void CLog.d(String)>
					obj2 = ((Object) (((List) (parameters)).iterator()));
	//  119  253:aload_1         
	//  120  254:invokeinterface #320 <Method Iterator List.iterator()>
	//  121  259:astore          13
					i = ((int) (flag1));
	//  122  261:iload           9
	//  123  263:istore_2        
					do
					{
						if(!((Iterator) (obj2)).hasNext())
							break;
	//  124  264:aload           13
	//  125  266:invokeinterface #326 <Method boolean Iterator.hasNext()>
	//  126  271:ifeq            553
						parameters = ((android.hardware.Camera.Parameters) ((android.hardware.Camera.Size)((Iterator) (obj2)).next()));
	//  127  274:aload           13
	//  128  276:invokeinterface #330 <Method Object Iterator.next()>
	//  129  281:checkcast       #266 <Class android.hardware.Camera$Size>
	//  130  284:astore_1        
						j = ((android.hardware.Camera.Size) (parameters)).width * ((android.hardware.Camera.Size) (parameters)).height;
	//  131  285:aload_1         
	//  132  286:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  133  289:aload_1         
	//  134  290:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  135  293:imul            
	//  136  294:istore_3        
						if(j < 0x4b000 || j > 0xe1000)
	//* 137  295:iload_3         
	//* 138  296:ldc2            #305 <Int 0x4b000>
	//* 139  299:icmplt          264
	//* 140  302:iload_3         
	//* 141  303:ldc2            #308 <Int 0xe1000>
	//* 142  306:icmple          312
							continue;
	//  143  309:goto            264
						if(obj != null)
	//* 144  312:aload           11
	//* 145  314:ifnull          415
						{
							StringBuilder stringbuilder = new StringBuilder();
	//  146  317:new             #279 <Class StringBuilder>
	//  147  320:dup             
	//  148  321:invokespecial   #280 <Method void StringBuilder()>
	//  149  324:astore          14
							stringbuilder.append(((android.hardware.Camera.Size) (parameters)).width);
	//  150  326:aload           14
	//  151  328:aload_1         
	//  152  329:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  153  332:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  154  335:pop             
							stringbuilder.append("x");
	//  155  336:aload           14
	//  156  338:ldc2            #291 <String "x">
	//  157  341:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  158  344:pop             
							stringbuilder.append(((android.hardware.Camera.Size) (parameters)).height);
	//  159  345:aload           14
	//  160  347:aload_1         
	//  161  348:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  162  351:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  163  354:pop             
							if(!((List) (obj)).contains(((Object) (stringbuilder.toString()))))
	//* 164  355:aload           11
	//* 165  357:aload           14
	//* 166  359:invokevirtual   #302 <Method String StringBuilder.toString()>
	//* 167  362:invokeinterface #334 <Method boolean List.contains(Object)>
	//* 168  367:ifne            415
							{
								StringBuilder stringbuilder1 = new StringBuilder();
	//  169  370:new             #279 <Class StringBuilder>
	//  170  373:dup             
	//  171  374:invokespecial   #280 <Method void StringBuilder()>
	//  172  377:astore          14
								stringbuilder1.append("Video size: ");
	//  173  379:aload           14
	//  174  381:ldc2            #336 <String "Video size: ">
	//  175  384:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  176  387:pop             
								stringbuilder1.append(((Object) (parameters)));
	//  177  388:aload           14
	//  178  390:aload_1         
	//  179  391:invokevirtual   #339 <Method StringBuilder StringBuilder.append(Object)>
	//  180  394:pop             
								stringbuilder1.append(" supported as preview but not present in video-size-values");
	//  181  395:aload           14
	//  182  397:ldc2            #341 <String " supported as preview but not present in video-size-values">
	//  183  400:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  184  403:pop             
								CLog.w(stringbuilder1.toString());
	//  185  404:aload           14
	//  186  406:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  187  409:invokestatic    #344 <Method void CLog.w(String)>
								continue;
	//  188  412:goto            264
							}
						}
						double d1 = (double)((android.hardware.Camera.Size) (parameters)).width / (double)((android.hardware.Camera.Size) (parameters)).height;
	//  189  415:aload_1         
	//  190  416:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  191  419:i2d             
	//  192  420:aload_1         
	//  193  421:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  194  424:i2d             
	//  195  425:ddiv            
	//  196  426:dstore          6
						if(Math.abs(d - d1) < 0.05000000074505806D)
	//* 197  428:dload           4
	//* 198  430:dload           6
	//* 199  432:dsub            
	//* 200  433:invokestatic    #350 <Method double Math.abs(double)>
	//* 201  436:ldc2w           #351 <Double 0.05000000074505806D>
	//* 202  439:dcmpg           
	//* 203  440:ifge            264
						{
							StringBuilder stringbuilder2 = new StringBuilder();
	//  204  443:new             #279 <Class StringBuilder>
	//  205  446:dup             
	//  206  447:invokespecial   #280 <Method void StringBuilder()>
	//  207  450:astore          14
							stringbuilder2.append("\t");
	//  208  452:aload           14
	//  209  454:ldc2            #354 <String "\t">
	//  210  457:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  211  460:pop             
							stringbuilder2.append(((android.hardware.Camera.Size) (parameters)).width);
	//  212  461:aload           14
	//  213  463:aload_1         
	//  214  464:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  215  467:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  216  470:pop             
							stringbuilder2.append("x");
	//  217  471:aload           14
	//  218  473:ldc2            #291 <String "x">
	//  219  476:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  220  479:pop             
							stringbuilder2.append(((android.hardware.Camera.Size) (parameters)).height);
	//  221  480:aload           14
	//  222  482:aload_1         
	//  223  483:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  224  486:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  225  489:pop             
							stringbuilder2.append("=");
	//  226  490:aload           14
	//  227  492:ldc2            #356 <String "=">
	//  228  495:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  229  498:pop             
							stringbuilder2.append(j);
	//  230  499:aload           14
	//  231  501:iload_3         
	//  232  502:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  233  505:pop             
							stringbuilder2.append(": (");
	//  234  506:aload           14
	//  235  508:ldc2            #358 <String ": (">
	//  236  511:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  237  514:pop             
							stringbuilder2.append(d1);
	//  238  515:aload           14
	//  239  517:dload           6
	//  240  519:invokevirtual   #296 <Method StringBuilder StringBuilder.append(double)>
	//  241  522:pop             
							stringbuilder2.append(")");
	//  242  523:aload           14
	//  243  525:ldc2            #298 <String ")">
	//  244  528:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  245  531:pop             
							CLog.d(stringbuilder2.toString());
	//  246  532:aload           14
	//  247  534:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  248  537:invokestatic    #277 <Method void CLog.d(String)>
							if(j > i)
	//* 249  540:iload_3         
	//* 250  541:iload_2         
	//* 251  542:icmple          264
							{
								obj1 = ((Object) (parameters));
	//  252  545:aload_1         
	//  253  546:astore          12
								i = j;
	//  254  548:iload_3         
	//  255  549:istore_2        
							}
						}
					} while(true);
	//  256  550:goto            264
					CLog.d("Best size: ");
	//  257  553:ldc2            #360 <String "Best size: ">
	//  258  556:invokestatic    #277 <Method void CLog.d(String)>
					parameters = ((android.hardware.Camera.Parameters) (new StringBuilder()));
	//  259  559:new             #279 <Class StringBuilder>
	//  260  562:dup             
	//  261  563:invokespecial   #280 <Method void StringBuilder()>
	//  262  566:astore_1        
					((StringBuilder) (parameters)).append("\t");
	//  263  567:aload_1         
	//  264  568:ldc2            #354 <String "\t">
	//  265  571:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  266  574:pop             
					((StringBuilder) (parameters)).append(((android.hardware.Camera.Size) (obj1)).width);
	//  267  575:aload_1         
	//  268  576:aload           12
	//  269  578:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  270  581:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  271  584:pop             
					((StringBuilder) (parameters)).append("x");
	//  272  585:aload_1         
	//  273  586:ldc2            #291 <String "x">
	//  274  589:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  275  592:pop             
					((StringBuilder) (parameters)).append(((android.hardware.Camera.Size) (obj1)).height);
	//  276  593:aload_1         
	//  277  594:aload           12
	//  278  596:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  279  599:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  280  602:pop             
					CLog.d(((StringBuilder) (parameters)).toString());
	//  281  603:aload_1         
	//  282  604:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  283  607:invokestatic    #277 <Method void CLog.d(String)>
					return ((android.hardware.Camera.Size) (obj1));
	//  284  610:aload           12
	//  285  612:areturn         
				}
				parameters = ((android.hardware.Camera.Parameters) (parameters.getSupportedPreviewSizes()));
	//  286  613:aload_1         
	//  287  614:invokevirtual   #312 <Method List android.hardware.Camera$Parameters.getSupportedPreviewSizes()>
	//  288  617:astore_1        
				android.hardware.Camera.Size size;
label2:
				do
				{
					StringBuilder stringbuilder6;
					for(Iterator iterator = ((List) (parameters)).iterator(); iterator.hasNext(); CLog.w(stringbuilder6.toString()))
	//* 289  618:aload_1         
	//* 290  619:invokeinterface #320 <Method Iterator List.iterator()>
	//* 291  624:astore          13
	//* 292  626:aload           13
	//* 293  628:invokeinterface #326 <Method boolean Iterator.hasNext()>
	//* 294  633:ifeq            799
					{
						size = (android.hardware.Camera.Size)iterator.next();
	//  295  636:aload           13
	//  296  638:invokeinterface #330 <Method Object Iterator.next()>
	//  297  643:checkcast       #266 <Class android.hardware.Camera$Size>
	//  298  646:astore          14
						if(obj == null)
							continue label2;
	//  299  648:aload           11
	//  300  650:ifnull          754
						stringbuilder6 = new StringBuilder();
	//  301  653:new             #279 <Class StringBuilder>
	//  302  656:dup             
	//  303  657:invokespecial   #280 <Method void StringBuilder()>
	//  304  660:astore          15
						stringbuilder6.append(size.width);
	//  305  662:aload           15
	//  306  664:aload           14
	//  307  666:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  308  669:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  309  672:pop             
						stringbuilder6.append("x");
	//  310  673:aload           15
	//  311  675:ldc2            #291 <String "x">
	//  312  678:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  313  681:pop             
						stringbuilder6.append(size.height);
	//  314  682:aload           15
	//  315  684:aload           14
	//  316  686:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  317  689:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  318  692:pop             
						if(((List) (obj)).contains(((Object) (stringbuilder6.toString()))))
							continue label2;
	//  319  693:aload           11
	//  320  695:aload           15
	//  321  697:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  322  700:invokeinterface #334 <Method boolean List.contains(Object)>
	//  323  705:ifne            754
						stringbuilder6 = new StringBuilder();
	//  324  708:new             #279 <Class StringBuilder>
	//  325  711:dup             
	//  326  712:invokespecial   #280 <Method void StringBuilder()>
	//  327  715:astore          15
						stringbuilder6.append("Video size: ");
	//  328  717:aload           15
	//  329  719:ldc2            #336 <String "Video size: ">
	//  330  722:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  331  725:pop             
						stringbuilder6.append(((Object) (size)));
	//  332  726:aload           15
	//  333  728:aload           14
	//  334  730:invokevirtual   #339 <Method StringBuilder StringBuilder.append(Object)>
	//  335  733:pop             
						stringbuilder6.append(" supported as preview but not present in video-size-values");
	//  336  734:aload           15
	//  337  736:ldc2            #341 <String " supported as preview but not present in video-size-values">
	//  338  739:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  339  742:pop             
					}

	//  340  743:aload           15
	//  341  745:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  342  748:invokestatic    #344 <Method void CLog.w(String)>
					break label1;
	//  343  751:goto            626
				} while(size.width != i || size.height != j);
	//  344  754:aload           14
	//  345  756:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  346  759:iload_2         
	//  347  760:icmpne          626
	//  348  763:aload           14
	//  349  765:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  350  768:iload_3         
	//  351  769:icmpne          626
				obj1.width = size.width;
	//  352  772:aload           12
	//  353  774:aload           14
	//  354  776:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  355  779:putfield        #269 <Field int android.hardware.Camera$Size.width>
				obj1.height = size.height;
	//  356  782:aload           12
	//  357  784:aload           14
	//  358  786:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  359  789:putfield        #272 <Field int android.hardware.Camera$Size.height>
				flag = flag2;
	//  360  792:iload           10
	//  361  794:istore          8
				break label0;
	//  362  796:goto            802
			}
			flag = false;
	//  363  799:iconst_0        
	//  364  800:istore          8
		}
		if(!flag)
	//* 365  802:iload           8
	//* 366  804:ifne            1128
		{
			CLog.i("Requested preview size not available!");
	//  367  807:ldc2            #362 <String "Requested preview size not available!">
	//  368  810:invokestatic    #365 <Method void CLog.i(String)>
			int k = 0x7fffffff;
	//  369  813:ldc2            #366 <Int 0x7fffffff>
	//  370  816:istore          8
			CLog.i("Available preview sizes:");
	//  371  818:ldc2            #368 <String "Available preview sizes:">
	//  372  821:invokestatic    #365 <Method void CLog.i(String)>
			Iterator iterator1 = ((List) (parameters)).iterator();
	//  373  824:aload_1         
	//  374  825:invokeinterface #320 <Method Iterator List.iterator()>
	//  375  830:astore          13
			do
			{
				if(!iterator1.hasNext())
					break;
	//  376  832:aload           13
	//  377  834:invokeinterface #326 <Method boolean Iterator.hasNext()>
	//  378  839:ifeq            1046
				parameters = ((android.hardware.Camera.Parameters) ((android.hardware.Camera.Size)iterator1.next()));
	//  379  842:aload           13
	//  380  844:invokeinterface #330 <Method Object Iterator.next()>
	//  381  849:checkcast       #266 <Class android.hardware.Camera$Size>
	//  382  852:astore_1        
				StringBuilder stringbuilder3 = new StringBuilder();
	//  383  853:new             #279 <Class StringBuilder>
	//  384  856:dup             
	//  385  857:invokespecial   #280 <Method void StringBuilder()>
	//  386  860:astore          14
				stringbuilder3.append("\t width: ");
	//  387  862:aload           14
	//  388  864:ldc2            #370 <String "\t width: ">
	//  389  867:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  390  870:pop             
				stringbuilder3.append(((android.hardware.Camera.Size) (parameters)).width);
	//  391  871:aload           14
	//  392  873:aload_1         
	//  393  874:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  394  877:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  395  880:pop             
				stringbuilder3.append(", height:");
	//  396  881:aload           14
	//  397  883:ldc2            #372 <String ", height:">
	//  398  886:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  399  889:pop             
				stringbuilder3.append(((android.hardware.Camera.Size) (parameters)).height);
	//  400  890:aload           14
	//  401  892:aload_1         
	//  402  893:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  403  896:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  404  899:pop             
				CLog.i(stringbuilder3.toString());
	//  405  900:aload           14
	//  406  902:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  407  905:invokestatic    #365 <Method void CLog.i(String)>
				if(obj != null)
	//* 408  908:aload           11
	//* 409  910:ifnull          1011
				{
					StringBuilder stringbuilder4 = new StringBuilder();
	//  410  913:new             #279 <Class StringBuilder>
	//  411  916:dup             
	//  412  917:invokespecial   #280 <Method void StringBuilder()>
	//  413  920:astore          14
					stringbuilder4.append(((android.hardware.Camera.Size) (parameters)).width);
	//  414  922:aload           14
	//  415  924:aload_1         
	//  416  925:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  417  928:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  418  931:pop             
					stringbuilder4.append("x");
	//  419  932:aload           14
	//  420  934:ldc2            #291 <String "x">
	//  421  937:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  422  940:pop             
					stringbuilder4.append(((android.hardware.Camera.Size) (parameters)).height);
	//  423  941:aload           14
	//  424  943:aload_1         
	//  425  944:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  426  947:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  427  950:pop             
					if(!((List) (obj)).contains(((Object) (stringbuilder4.toString()))))
	//* 428  951:aload           11
	//* 429  953:aload           14
	//* 430  955:invokevirtual   #302 <Method String StringBuilder.toString()>
	//* 431  958:invokeinterface #334 <Method boolean List.contains(Object)>
	//* 432  963:ifne            1011
					{
						StringBuilder stringbuilder5 = new StringBuilder();
	//  433  966:new             #279 <Class StringBuilder>
	//  434  969:dup             
	//  435  970:invokespecial   #280 <Method void StringBuilder()>
	//  436  973:astore          14
						stringbuilder5.append("Video size: ");
	//  437  975:aload           14
	//  438  977:ldc2            #336 <String "Video size: ">
	//  439  980:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  440  983:pop             
						stringbuilder5.append(((Object) (parameters)));
	//  441  984:aload           14
	//  442  986:aload_1         
	//  443  987:invokevirtual   #339 <Method StringBuilder StringBuilder.append(Object)>
	//  444  990:pop             
						stringbuilder5.append(" supported as preview but not present in video-size-values");
	//  445  991:aload           14
	//  446  993:ldc2            #341 <String " supported as preview but not present in video-size-values">
	//  447  996:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  448  999:pop             
						CLog.w(stringbuilder5.toString());
	//  449 1000:aload           14
	//  450 1002:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  451 1005:invokestatic    #344 <Method void CLog.w(String)>
						continue;
	//  452 1008:goto            832
					}
				}
				int l = Math.abs(((android.hardware.Camera.Size) (parameters)).width * ((android.hardware.Camera.Size) (parameters)).height - i * j);
	//  453 1011:aload_1         
	//  454 1012:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  455 1015:aload_1         
	//  456 1016:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  457 1019:imul            
	//  458 1020:iload_2         
	//  459 1021:iload_3         
	//  460 1022:imul            
	//  461 1023:isub            
	//  462 1024:invokestatic    #375 <Method int Math.abs(int)>
	//  463 1027:istore          9
				if(l < k)
	//* 464 1029:iload           9
	//* 465 1031:iload           8
	//* 466 1033:icmpge          832
				{
					obj1 = ((Object) (parameters));
	//  467 1036:aload_1         
	//  468 1037:astore          12
					k = l;
	//  469 1039:iload           9
	//  470 1041:istore          8
				}
			} while(true);
	//  471 1043:goto            832
			parameters = ((android.hardware.Camera.Parameters) (new StringBuilder()));
	//  472 1046:new             #279 <Class StringBuilder>
	//  473 1049:dup             
	//  474 1050:invokespecial   #280 <Method void StringBuilder()>
	//  475 1053:astore_1        
			((StringBuilder) (parameters)).append("Most similar size to requested size (");
	//  476 1054:aload_1         
	//  477 1055:ldc2            #377 <String "Most similar size to requested size (">
	//  478 1058:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  479 1061:pop             
			((StringBuilder) (parameters)).append(i);
	//  480 1062:aload_1         
	//  481 1063:iload_2         
	//  482 1064:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  483 1067:pop             
			((StringBuilder) (parameters)).append("x");
	//  484 1068:aload_1         
	//  485 1069:ldc2            #291 <String "x">
	//  486 1072:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  487 1075:pop             
			((StringBuilder) (parameters)).append(j);
	//  488 1076:aload_1         
	//  489 1077:iload_3         
	//  490 1078:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  491 1081:pop             
			((StringBuilder) (parameters)).append(") is ");
	//  492 1082:aload_1         
	//  493 1083:ldc2            #379 <String ") is ">
	//  494 1086:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  495 1089:pop             
			((StringBuilder) (parameters)).append(((android.hardware.Camera.Size) (obj1)).width);
	//  496 1090:aload_1         
	//  497 1091:aload           12
	//  498 1093:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  499 1096:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  500 1099:pop             
			((StringBuilder) (parameters)).append(" x ");
	//  501 1100:aload_1         
	//  502 1101:ldc2            #381 <String " x ">
	//  503 1104:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  504 1107:pop             
			((StringBuilder) (parameters)).append(((android.hardware.Camera.Size) (obj1)).height);
	//  505 1108:aload_1         
	//  506 1109:aload           12
	//  507 1111:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  508 1114:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  509 1117:pop             
			CLog.i(((StringBuilder) (parameters)).toString());
	//  510 1118:aload_1         
	//  511 1119:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  512 1122:invokestatic    #365 <Method void CLog.i(String)>
			return ((android.hardware.Camera.Size) (obj1));
	//  513 1125:aload           12
	//  514 1127:areturn         
		} else
		{
			parameters = ((android.hardware.Camera.Parameters) (new StringBuilder()));
	//  515 1128:new             #279 <Class StringBuilder>
	//  516 1131:dup             
	//  517 1132:invokespecial   #280 <Method void StringBuilder()>
	//  518 1135:astore_1        
			((StringBuilder) (parameters)).append("Using requested size (");
	//  519 1136:aload_1         
	//  520 1137:ldc2            #383 <String "Using requested size (">
	//  521 1140:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  522 1143:pop             
			((StringBuilder) (parameters)).append(i);
	//  523 1144:aload_1         
	//  524 1145:iload_2         
	//  525 1146:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  526 1149:pop             
			((StringBuilder) (parameters)).append("x");
	//  527 1150:aload_1         
	//  528 1151:ldc2            #291 <String "x">
	//  529 1154:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  530 1157:pop             
			((StringBuilder) (parameters)).append(j);
	//  531 1158:aload_1         
	//  532 1159:iload_3         
	//  533 1160:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  534 1163:pop             
			((StringBuilder) (parameters)).append(")");
	//  535 1164:aload_1         
	//  536 1165:ldc2            #298 <String ")">
	//  537 1168:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  538 1171:pop             
			CLog.i(((StringBuilder) (parameters)).toString());
	//  539 1172:aload_1         
	//  540 1173:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  541 1176:invokestatic    #365 <Method void CLog.i(String)>
			return ((android.hardware.Camera.Size) (obj1));
	//  542 1179:aload           12
	//  543 1181:areturn         
		}
	}

	private void setAutofocusInternal(final boolean finalAutofocus, final int finalFocusPeriodMS)
	{
		CLog.v("setAutofocusInternal");
	//    0    0:ldc2            #386 <String "setAutofocusInternal">
	//    1    3:invokestatic    #143 <Method void CLog.v(String)>
		if(mRequestedFocusMode.equals("continuous-picture"))
	//*   2    6:aload_0         
	//*   3    7:getfield        #123 <Field String mRequestedFocusMode>
	//*   4   10:ldc2            #388 <String "continuous-picture">
	//*   5   13:invokevirtual   #391 <Method boolean String.equals(Object)>
	//*   6   16:ifeq            20
			return;
	//    7   19:return          
		if(!mCapturing || mIsStopping)
			break MISSING_BLOCK_LABEL_323;
	//    8   20:aload_0         
	//    9   21:getfield        #154 <Field boolean mCapturing>
	//   10   24:ifeq            323
	//   11   27:aload_0         
	//   12   28:getfield        #209 <Field boolean mIsStopping>
	//   13   31:ifne            323
		if(!finalAutofocus)
			break MISSING_BLOCK_LABEL_208;
	//   14   34:iload_1         
	//   15   35:ifeq            208
		String s;
		s = mCamera.getParameters().getFocusMode();
	//   16   38:aload_0         
	//   17   39:getfield        #158 <Field Camera mCamera>
	//   18   42:invokevirtual   #397 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//   19   45:invokevirtual   #400 <Method String android.hardware.Camera$Parameters.getFocusMode()>
	//   20   48:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   21   49:new             #279 <Class StringBuilder>
	//   22   52:dup             
	//   23   53:invokespecial   #280 <Method void StringBuilder()>
	//   24   56:astore          4
		stringbuilder.append("setAutofocusInternal(): current Mode:");
	//   25   58:aload           4
	//   26   60:ldc2            #402 <String "setAutofocusInternal(): current Mode:">
	//   27   63:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   28   66:pop             
		stringbuilder.append(s);
	//   29   67:aload           4
	//   30   69:aload_3         
	//   31   70:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   32   73:pop             
		CLog.v(stringbuilder.toString());
	//   33   74:aload           4
	//   34   76:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   35   79:invokestatic    #143 <Method void CLog.v(String)>
		if(finalFocusPeriodMS == 0)
			break MISSING_BLOCK_LABEL_150;
	//   36   82:iload_2         
	//   37   83:ifeq            150
		if(s.equals("macro") || s.equals("auto"))
	//*  38   86:aload_3         
	//*  39   87:ldc2            #404 <String "macro">
	//*  40   90:invokevirtual   #391 <Method boolean String.equals(Object)>
	//*  41   93:ifne            106
	//*  42   96:aload_3         
	//*  43   97:ldc2            #406 <String "auto">
	//*  44  100:invokevirtual   #391 <Method boolean String.equals(Object)>
	//*  45  103:ifeq            150
		{
			if(mAutoFocusPeriodicTask != null)
	//*  46  106:aload_0         
	//*  47  107:getfield        #408 <Field CameraThread$AutoFocusPeriodicTask mAutoFocusPeriodicTask>
	//*  48  110:ifnull          124
				mHandler.removeCallbacks(((Runnable) (mAutoFocusPeriodicTask)));
	//   49  113:aload_0         
	//   50  114:getfield        #412 <Field Handler mHandler>
	//   51  117:aload_0         
	//   52  118:getfield        #408 <Field CameraThread$AutoFocusPeriodicTask mAutoFocusPeriodicTask>
	//   53  121:invokevirtual   #418 <Method void Handler.removeCallbacks(Runnable)>
			mAutoFocusPeriodicTask = new AutoFocusPeriodicTask(finalFocusPeriodMS);
	//   54  124:aload_0         
	//   55  125:new             #39  <Class CameraThread$AutoFocusPeriodicTask>
	//   56  128:dup             
	//   57  129:aload_0         
	//   58  130:iload_2         
	//   59  131:invokespecial   #420 <Method void CameraThread$AutoFocusPeriodicTask(CameraThread, int)>
	//   60  134:putfield        #408 <Field CameraThread$AutoFocusPeriodicTask mAutoFocusPeriodicTask>
			mHandler.post(((Runnable) (mAutoFocusPeriodicTask)));
	//   61  137:aload_0         
	//   62  138:getfield        #412 <Field Handler mHandler>
	//   63  141:aload_0         
	//   64  142:getfield        #408 <Field CameraThread$AutoFocusPeriodicTask mAutoFocusPeriodicTask>
	//   65  145:invokevirtual   #424 <Method boolean Handler.post(Runnable)>
	//   66  148:pop             
			return;
	//   67  149:return          
		}
		Object obj;
		Exception exception;
		try
		{
			mCamera.autoFocus(((android.hardware.Camera.AutoFocusCallback) (autoFocusCB)));
	//   68  150:aload_0         
	//   69  151:getfield        #158 <Field Camera mCamera>
	//   70  154:aload_0         
	//   71  155:getfield        #136 <Field CameraThread$AutoFocusCB autoFocusCB>
	//   72  158:invokevirtual   #428 <Method void Camera.autoFocus(android.hardware.Camera$AutoFocusCallback)>
			return;
	//   73  161:return          
		}
	//*  74  162:aload_0         
	//*  75  163:aload_0         
	//*  76  164:getfield        #430 <Field int countFocusing>
	//*  77  167:iconst_1        
	//*  78  168:iadd            
	//*  79  169:putfield        #430 <Field int countFocusing>
	//*  80  172:aload_0         
	//*  81  173:getfield        #430 <Field int countFocusing>
	//*  82  176:iconst_3        
	//*  83  177:icmpgt          323
	//*  84  180:ldc2            #432 <String "couldn't activate autofocus, retry in 1 second">
	//*  85  183:invokestatic    #365 <Method void CLog.i(String)>
	//*  86  186:aload_0         
	//*  87  187:getfield        #412 <Field Handler mHandler>
	//*  88  190:new             #18  <Class CameraThread$14>
	//*  89  193:dup             
	//*  90  194:aload_0         
	//*  91  195:iload_1         
	//*  92  196:iload_2         
	//*  93  197:invokespecial   #434 <Method void CameraThread$14(CameraThread, boolean, int)>
	//*  94  200:ldc2w           #435 <Long 1000L>
	//*  95  203:invokevirtual   #440 <Method boolean Handler.postDelayed(Runnable, long)>
	//*  96  206:pop             
	//*  97  207:return          
	//*  98  208:new             #279 <Class StringBuilder>
	//*  99  211:dup             
	//* 100  212:invokespecial   #280 <Method void StringBuilder()>
	//* 101  215:astore_3        
	//* 102  216:aload_3         
	//* 103  217:ldc2            #442 <String "setAutofocusInternal(): have task:">
	//* 104  220:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 105  223:pop             
	//* 106  224:aload_3         
	//* 107  225:aload_0         
	//* 108  226:getfield        #408 <Field CameraThread$AutoFocusPeriodicTask mAutoFocusPeriodicTask>
	//* 109  229:invokevirtual   #339 <Method StringBuilder StringBuilder.append(Object)>
	//* 110  232:pop             
	//* 111  233:aload_3         
	//* 112  234:invokevirtual   #302 <Method String StringBuilder.toString()>
	//* 113  237:invokestatic    #143 <Method void CLog.v(String)>
	//* 114  240:aload_0         
	//* 115  241:getfield        #408 <Field CameraThread$AutoFocusPeriodicTask mAutoFocusPeriodicTask>
	//* 116  244:astore_3        
	//* 117  245:aload_3         
	//* 118  246:ifnonnull       269
	//* 119  249:aload_0         
	//* 120  250:getfield        #158 <Field Camera mCamera>
	//* 121  253:invokevirtual   #445 <Method void Camera.cancelAutoFocus()>
	//* 122  256:return          
	//* 123  257:astore_3        
	//* 124  258:ldc2            #447 <String "Cancel autofocus failed">
	//* 125  261:invokestatic    #344 <Method void CLog.w(String)>
	//* 126  264:aload_3         
	//* 127  265:invokevirtual   #450 <Method void Exception.printStackTrace()>
	//* 128  268:return          
	//* 129  269:aload_0         
	//* 130  270:getfield        #412 <Field Handler mHandler>
	//* 131  273:aload_0         
	//* 132  274:getfield        #408 <Field CameraThread$AutoFocusPeriodicTask mAutoFocusPeriodicTask>
	//* 133  277:invokevirtual   #418 <Method void Handler.removeCallbacks(Runnable)>
	//* 134  280:aload_0         
	//* 135  281:aconst_null     
	//* 136  282:putfield        #408 <Field CameraThread$AutoFocusPeriodicTask mAutoFocusPeriodicTask>
	//* 137  285:return          
	//* 138  286:astore_3        
	//* 139  287:new             #279 <Class StringBuilder>
	//* 140  290:dup             
	//* 141  291:invokespecial   #280 <Method void StringBuilder()>
	//* 142  294:astore          4
	//* 143  296:aload           4
	//* 144  298:ldc2            #452 <String "couldn't (de)activate autofocus:">
	//* 145  301:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 146  304:pop             
	//* 147  305:aload           4
	//* 148  307:aload_3         
	//* 149  308:invokevirtual   #455 <Method String Exception.getMessage()>
	//* 150  311:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 151  314:pop             
	//* 152  315:aload           4
	//* 153  317:invokevirtual   #302 <Method String StringBuilder.toString()>
	//* 154  320:invokestatic    #458 <Method void CLog.e(String)>
	//* 155  323:return          
		catch(Exception exception2) { }
	//  156  324:astore_3        
		try
		{
			countFocusing = countFocusing + 1;
			if(countFocusing <= 3)
			{
				CLog.i("couldn't activate autofocus, retry in 1 second");
				mHandler.postDelayed(new Runnable() {

					public void run()
					{
						setAutoFocus(finalAutofocus, finalFocusPeriodMS);
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field CameraThread this$0>
					//    2    4:aload_0         
					//    3    5:getfield        #23  <Field boolean val$finalAutofocus>
					//    4    8:aload_0         
					//    5    9:getfield        #25  <Field int val$finalFocusPeriodMS>
					//    6   12:invokevirtual   #33  <Method void CameraThread.setAutoFocus(boolean, int)>
					//    7   15:return          
					}

					final CameraThread this$0;
					final boolean val$finalAutofocus;
					final int val$finalFocusPeriodMS;

			
			{
				this$0 = CameraThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CameraThread this$0>
				finalAutofocus = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field boolean val$finalAutofocus>
				finalFocusPeriodMS = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int val$finalFocusPeriodMS>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
				}
, 1000L);
				return;
			}
		}
		catch(Exception exception1)
		{
			StringBuilder stringbuilder1 = new StringBuilder();
			stringbuilder1.append("couldn't (de)activate autofocus:");
			stringbuilder1.append(exception1.getMessage());
			CLog.e(stringbuilder1.toString());
		}
		break MISSING_BLOCK_LABEL_323;
	//  157  325:goto            162
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("setAutofocusInternal(): have task:");
		((StringBuilder) (obj)).append(((Object) (mAutoFocusPeriodicTask)));
		CLog.v(((StringBuilder) (obj)).toString());
		obj = ((Object) (mAutoFocusPeriodicTask));
		if(obj != null)
			break MISSING_BLOCK_LABEL_269;
		mCamera.cancelAutoFocus();
		return;
		exception;
		CLog.w("Cancel autofocus failed");
		exception.printStackTrace();
		return;
		mHandler.removeCallbacks(((Runnable) (mAutoFocusPeriodicTask)));
		mAutoFocusPeriodicTask = null;
		return;
	}

	private void setCameraDisplayOrientationInternal(DisplayOrientationCallback displayorientationcallback)
	{
		CLog.v("setCameraDisplayOrientationInternal");
	//    0    0:ldc2            #459 <String "setCameraDisplayOrientationInternal">
	//    1    3:invokestatic    #143 <Method void CLog.v(String)>
		if(mCamera != null && mCapturing && !mIsStopping)
	//*   2    6:aload_0         
	//*   3    7:getfield        #158 <Field Camera mCamera>
	//*   4   10:ifnull          271
	//*   5   13:aload_0         
	//*   6   14:getfield        #154 <Field boolean mCapturing>
	//*   7   17:ifeq            271
	//*   8   20:aload_0         
	//*   9   21:getfield        #209 <Field boolean mIsStopping>
	//*  10   24:ifeq            30
	//*  11   27:goto            271
		{
			Object obj = ((Object) (new android.hardware.Camera.CameraInfo()));
	//   12   30:new             #461 <Class android.hardware.Camera$CameraInfo>
	//   13   33:dup             
	//   14   34:invokespecial   #462 <Method void android.hardware.Camera$CameraInfo()>
	//   15   37:astore          5
			boolean flag = false;
	//   16   39:iconst_0        
	//   17   40:istore_3        
			Camera.getCameraInfo(0, ((android.hardware.Camera.CameraInfo) (obj)));
	//   18   41:iconst_0        
	//   19   42:aload           5
	//   20   44:invokestatic    #466 <Method void Camera.getCameraInfo(int, android.hardware.Camera$CameraInfo)>
			int j = ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay().getRotation();
	//   21   47:aload_0         
	//   22   48:getfield        #152 <Field Context mContext>
	//   23   51:ldc2            #468 <String "window">
	//   24   54:invokevirtual   #474 <Method Object Context.getSystemService(String)>
	//   25   57:checkcast       #476 <Class WindowManager>
	//   26   60:invokeinterface #480 <Method Display WindowManager.getDefaultDisplay()>
	//   27   65:invokevirtual   #486 <Method int Display.getRotation()>
	//   28   68:istore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   29   70:new             #279 <Class StringBuilder>
	//   30   73:dup             
	//   31   74:invokespecial   #280 <Method void StringBuilder()>
	//   32   77:astore          6
			stringbuilder.append("setCameraDisplayOrientation rotation: ");
	//   33   79:aload           6
	//   34   81:ldc2            #488 <String "setCameraDisplayOrientation rotation: ">
	//   35   84:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   36   87:pop             
			stringbuilder.append(j);
	//   37   88:aload           6
	//   38   90:iload           4
	//   39   92:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//   40   95:pop             
			CLog.d(stringbuilder.toString());
	//   41   96:aload           6
	//   42   98:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   43  101:invokestatic    #277 <Method void CLog.d(String)>
			int i = ((int) (flag));
	//   44  104:iload_3         
	//   45  105:istore_2        
			switch(j)
	//*  46  106:iload           4
			{
	//*  47  108:tableswitch     0 3: default 140
	//	               0 162
	//	               1 159
	//	               2 152
	//	               3 145
			default:
				i = ((int) (flag));
	//   48  140:iload_3         
	//   49  141:istore_2        
				break;

	//*  50  142:goto            162
			case 3: // '\003'
				i = 270;
	//   51  145:sipush          270
	//   52  148:istore_2        
				break;

	//*  53  149:goto            162
			case 2: // '\002'
				i = 180;
	//   54  152:sipush          180
	//   55  155:istore_2        
				break;

	//*  56  156:goto            162
			case 1: // '\001'
				i = 90;
	//   57  159:bipush          90
	//   58  161:istore_2        
				break;

			case 0: // '\0'
				break;
			}
			i = ((((android.hardware.Camera.CameraInfo) (obj)).orientation - i) + 360) % 360;
	//   59  162:aload           5
	//   60  164:getfield        #491 <Field int android.hardware.Camera$CameraInfo.orientation>
	//   61  167:iload_2         
	//   62  168:isub            
	//   63  169:sipush          360
	//   64  172:iadd            
	//   65  173:sipush          360
	//   66  176:irem            
	//   67  177:istore_2        
			obj = ((Object) (new StringBuilder()));
	//   68  178:new             #279 <Class StringBuilder>
	//   69  181:dup             
	//   70  182:invokespecial   #280 <Method void StringBuilder()>
	//   71  185:astore          5
			((StringBuilder) (obj)).append("setCameradisplayOrientation result: ");
	//   72  187:aload           5
	//   73  189:ldc2            #493 <String "setCameradisplayOrientation result: ">
	//   74  192:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   75  195:pop             
			((StringBuilder) (obj)).append(i);
	//   76  196:aload           5
	//   77  198:iload_2         
	//   78  199:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//   79  202:pop             
			CLog.d(((StringBuilder) (obj)).toString());
	//   80  203:aload           5
	//   81  205:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   82  208:invokestatic    #277 <Method void CLog.d(String)>
			try
			{
				mCamera.stopPreview();
	//   83  211:aload_0         
	//   84  212:getfield        #158 <Field Camera mCamera>
	//   85  215:invokevirtual   #496 <Method void Camera.stopPreview()>
				mCamera.setDisplayOrientation(i);
	//   86  218:aload_0         
	//   87  219:getfield        #158 <Field Camera mCamera>
	//   88  222:iload_2         
	//   89  223:invokevirtual   #499 <Method void Camera.setDisplayOrientation(int)>
				mCamera.startPreview();
	//   90  226:aload_0         
	//   91  227:getfield        #158 <Field Camera mCamera>
	//   92  230:invokevirtual   #502 <Method void Camera.startPreview()>
				mCamera.setPreviewCallbackWithBuffer(((android.hardware.Camera.PreviewCallback) (this)));
	//   93  233:aload_0         
	//   94  234:getfield        #158 <Field Camera mCamera>
	//   95  237:aload_0         
	//   96  238:invokevirtual   #505 <Method void Camera.setPreviewCallbackWithBuffer(android.hardware.Camera$PreviewCallback)>
			}
	//*  97  241:goto            257
			catch(Exception exception)
	//*  98  244:astore          5
			{
				CLog.w("Could not set display orientation, probably surface has been destroyed");
	//   99  246:ldc2            #507 <String "Could not set display orientation, probably surface has been destroyed">
	//  100  249:invokestatic    #344 <Method void CLog.w(String)>
				exception.printStackTrace();
	//  101  252:aload           5
	//  102  254:invokevirtual   #450 <Method void Exception.printStackTrace()>
			}
			if(displayorientationcallback == null)
	//* 103  257:aload_1         
	//* 104  258:ifnonnull       262
			{
				return;
	//  105  261:return          
			} else
			{
				displayorientationcallback.onDisplayOrientationUpdated(j);
	//  106  262:aload_1         
	//  107  263:iload           4
	//  108  265:invokeinterface #510 <Method void CameraThread$DisplayOrientationCallback.onDisplayOrientationUpdated(int)>
				return;
	//  109  270:return          
			}
		} else
		{
			CLog.v("setCameraDisplayOrientation - camera null or capture not running");
	//  110  271:ldc2            #512 <String "setCameraDisplayOrientation - camera null or capture not running">
	//  111  274:invokestatic    #143 <Method void CLog.v(String)>
			return;
	//  112  277:return          
		}
	}

	private byte[] setLastFrame(byte abyte0[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		if(mLastFrame != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #516 <Field byte[] mLastFrame>
	//*   4    6:ifnull          26
		{
			mBufferPool.release(((Object) (mLastFrame)));
	//    5    9:aload_0         
	//    6   10:getfield        #113 <Field MySynchronizedPool mBufferPool>
	//    7   13:aload_0         
	//    8   14:getfield        #516 <Field byte[] mLastFrame>
	//    9   17:invokevirtual   #519 <Method boolean MySynchronizedPool.release(Object)>
	//   10   20:pop             
			mLastFrame = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #516 <Field byte[] mLastFrame>
		}
		flag = mIsPreviewStarted;
	//   14   26:aload_0         
	//   15   27:getfield        #121 <Field boolean mIsPreviewStarted>
	//   16   30:istore_2        
		if(flag)
			break MISSING_BLOCK_LABEL_39;
	//   17   31:iload_2         
	//   18   32:ifne            39
		this;
	//   19   35:aload_0         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return abyte0;
	//   21   37:aload_1         
	//   22   38:areturn         
		if(mBufferPool.getObjectCount() == 0)
	//*  23   39:aload_0         
	//*  24   40:getfield        #113 <Field MySynchronizedPool mBufferPool>
	//*  25   43:invokevirtual   #522 <Method int MySynchronizedPool.getObjectCount()>
	//*  26   46:ifne            65
		{
			byte abyte1[] = new byte[mLastBufferSize];
	//   27   49:aload_0         
	//   28   50:getfield        #119 <Field int mLastBufferSize>
	//   29   53:newarray        byte[]
	//   30   55:astore_3        
			mBufferPool.release(((Object) (abyte1)));
	//   31   56:aload_0         
	//   32   57:getfield        #113 <Field MySynchronizedPool mBufferPool>
	//   33   60:aload_3         
	//   34   61:invokevirtual   #519 <Method boolean MySynchronizedPool.release(Object)>
	//   35   64:pop             
		}
		mLastFrame = abyte0;
	//   36   65:aload_0         
	//   37   66:aload_1         
	//   38   67:putfield        #516 <Field byte[] mLastFrame>
		abyte0 = (byte[])mBufferPool.acquire();
	//   39   70:aload_0         
	//   40   71:getfield        #113 <Field MySynchronizedPool mBufferPool>
	//   41   74:invokevirtual   #525 <Method Object MySynchronizedPool.acquire()>
	//   42   77:checkcast       #526 <Class byte[]>
	//   43   80:astore_1        
		this;
	//   44   81:aload_0         
		JVM INSTR monitorexit ;
	//   45   82:monitorexit     
		return abyte0;
	//   46   83:aload_1         
	//   47   84:areturn         
		abyte0;
	//   48   85:astore_1        
	//*  49   86:aload_0         
		throw abyte0;
	//   50   87:monitorexit     
	//   51   88:aload_1         
	//   52   89:athrow          
	}

	private void setPreviewCallbackWithBufferInternal(android.hardware.Camera.PreviewCallback previewcallback)
	{
		CLog.v("setPreviewCallbackWithBufferInternal");
	//    0    0:ldc2            #527 <String "setPreviewCallbackWithBufferInternal">
	//    1    3:invokestatic    #143 <Method void CLog.v(String)>
		mCamera.setPreviewCallbackWithBuffer(previewcallback);
	//    2    6:aload_0         
	//    3    7:getfield        #158 <Field Camera mCamera>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #505 <Method void Camera.setPreviewCallbackWithBuffer(android.hardware.Camera$PreviewCallback)>
	//    6   14:return          
	}

	private void setPreviewDisplayInternal(SurfaceHolder surfaceholder)
	{
		if(mCamera == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field Camera mCamera>
	//*   2    4:ifnonnull       14
		{
			CLog.e("setPreviewDisplayInternal failed: Camera is not open");
	//    3    7:ldc2            #529 <String "setPreviewDisplayInternal failed: Camera is not open">
	//    4   10:invokestatic    #458 <Method void CLog.e(String)>
			return;
	//    5   13:return          
		}
		CLog.v("setPreviewDisplayInternal");
	//    6   14:ldc2            #530 <String "setPreviewDisplayInternal">
	//    7   17:invokestatic    #143 <Method void CLog.v(String)>
		try
		{
			mCamera.setPreviewDisplay(surfaceholder);
	//    8   20:aload_0         
	//    9   21:getfield        #158 <Field Camera mCamera>
	//   10   24:aload_1         
	//   11   25:invokevirtual   #533 <Method void Camera.setPreviewDisplay(SurfaceHolder)>
			surfaceholder = ((SurfaceHolder) (new StringBuilder()));
	//   12   28:new             #279 <Class StringBuilder>
	//   13   31:dup             
	//   14   32:invokespecial   #280 <Method void StringBuilder()>
	//   15   35:astore_1        
			((StringBuilder) (surfaceholder)).append("Recover autofocus task: ");
	//   16   36:aload_1         
	//   17   37:ldc2            #535 <String "Recover autofocus task: ">
	//   18   40:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   19   43:pop             
			((StringBuilder) (surfaceholder)).append(((Object) (mAutoFocusPeriodicTask)));
	//   20   44:aload_1         
	//   21   45:aload_0         
	//   22   46:getfield        #408 <Field CameraThread$AutoFocusPeriodicTask mAutoFocusPeriodicTask>
	//   23   49:invokevirtual   #339 <Method StringBuilder StringBuilder.append(Object)>
	//   24   52:pop             
			CLog.v(((StringBuilder) (surfaceholder)).toString());
	//   25   53:aload_1         
	//   26   54:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   27   57:invokestatic    #143 <Method void CLog.v(String)>
			if(mAutoFocusPeriodicTask != null)
	//*  28   60:aload_0         
	//*  29   61:getfield        #408 <Field CameraThread$AutoFocusPeriodicTask mAutoFocusPeriodicTask>
	//*  30   64:ifnull          79
				mHandler.post(((Runnable) (mAutoFocusPeriodicTask)));
	//   31   67:aload_0         
	//   32   68:getfield        #412 <Field Handler mHandler>
	//   33   71:aload_0         
	//   34   72:getfield        #408 <Field CameraThread$AutoFocusPeriodicTask mAutoFocusPeriodicTask>
	//   35   75:invokevirtual   #424 <Method boolean Handler.post(Runnable)>
	//   36   78:pop             
			surfaceholder = ((SurfaceHolder) (new StringBuilder()));
	//   37   79:new             #279 <Class StringBuilder>
	//   38   82:dup             
	//   39   83:invokespecial   #280 <Method void StringBuilder()>
	//   40   86:astore_1        
			((StringBuilder) (surfaceholder)).append("PreviewStarted with w: ");
	//   41   87:aload_1         
	//   42   88:ldc2            #537 <String "PreviewStarted with w: ">
	//   43   91:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   44   94:pop             
			((StringBuilder) (surfaceholder)).append(mLastWidth);
	//   45   95:aload_1         
	//   46   96:aload_0         
	//   47   97:getfield        #115 <Field int mLastWidth>
	//   48  100:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//   49  103:pop             
			((StringBuilder) (surfaceholder)).append(", h:");
	//   50  104:aload_1         
	//   51  105:ldc2            #539 <String ", h:">
	//   52  108:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   53  111:pop             
			((StringBuilder) (surfaceholder)).append(mLastHeight);
	//   54  112:aload_1         
	//   55  113:aload_0         
	//   56  114:getfield        #117 <Field int mLastHeight>
	//   57  117:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//   58  120:pop             
			CLog.v(((StringBuilder) (surfaceholder)).toString());
	//   59  121:aload_1         
	//   60  122:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   61  125:invokestatic    #143 <Method void CLog.v(String)>
			mIsPreviewStarted = true;
	//   62  128:aload_0         
	//   63  129:iconst_1        
	//   64  130:putfield        #121 <Field boolean mIsPreviewStarted>
			mVideoCaptureConsumer.onPreviewStarted(mLastBufferSize, mLastWidth, mLastHeight);
	//   65  133:aload_0         
	//   66  134:getfield        #191 <Field VideoCaptureConsumerHub mVideoCaptureConsumer>
	//   67  137:aload_0         
	//   68  138:getfield        #119 <Field int mLastBufferSize>
	//   69  141:aload_0         
	//   70  142:getfield        #115 <Field int mLastWidth>
	//   71  145:aload_0         
	//   72  146:getfield        #117 <Field int mLastHeight>
	//   73  149:invokevirtual   #545 <Method void VideoCaptureConsumerHub.onPreviewStarted(int, int, int)>
			return;
	//   74  152:return          
		}
		// Misplaced declaration of an exception variable
		catch(SurfaceHolder surfaceholder)
	//*  75  153:astore_1        
		{
			((Exception) (surfaceholder)).printStackTrace();
	//   76  154:aload_1         
	//   77  155:invokevirtual   #450 <Method void Exception.printStackTrace()>
		}
	//   78  158:return          
	}

	private void setPreviewTextureInternal(int i)
	{
		if(mCamera == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field Camera mCamera>
	//*   2    4:ifnonnull       14
		{
			CLog.e("setPreviewTexture failed: Camera is not open");
	//    3    7:ldc2            #550 <String "setPreviewTexture failed: Camera is not open">
	//    4   10:invokestatic    #458 <Method void CLog.e(String)>
			return;
	//    5   13:return          
		}
		CLog.v("setPreviewTextureInternal");
	//    6   14:ldc2            #551 <String "setPreviewTextureInternal">
	//    7   17:invokestatic    #143 <Method void CLog.v(String)>
		try
		{
			mCameraTexture = new SurfaceTexture(i);
	//    8   20:aload_0         
	//    9   21:new             #553 <Class SurfaceTexture>
	//   10   24:dup             
	//   11   25:iload_1         
	//   12   26:invokespecial   #554 <Method void SurfaceTexture(int)>
	//   13   29:putfield        #556 <Field SurfaceTexture mCameraTexture>
			mCamera.setPreviewTexture(mCameraTexture);
	//   14   32:aload_0         
	//   15   33:getfield        #158 <Field Camera mCamera>
	//   16   36:aload_0         
	//   17   37:getfield        #556 <Field SurfaceTexture mCameraTexture>
	//   18   40:invokevirtual   #560 <Method void Camera.setPreviewTexture(SurfaceTexture)>
			StringBuilder stringbuilder = new StringBuilder();
	//   19   43:new             #279 <Class StringBuilder>
	//   20   46:dup             
	//   21   47:invokespecial   #280 <Method void StringBuilder()>
	//   22   50:astore_2        
			stringbuilder.append("Recover autofocus task: ");
	//   23   51:aload_2         
	//   24   52:ldc2            #535 <String "Recover autofocus task: ">
	//   25   55:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   26   58:pop             
			stringbuilder.append(((Object) (mAutoFocusPeriodicTask)));
	//   27   59:aload_2         
	//   28   60:aload_0         
	//   29   61:getfield        #408 <Field CameraThread$AutoFocusPeriodicTask mAutoFocusPeriodicTask>
	//   30   64:invokevirtual   #339 <Method StringBuilder StringBuilder.append(Object)>
	//   31   67:pop             
			CLog.v(stringbuilder.toString());
	//   32   68:aload_2         
	//   33   69:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   34   72:invokestatic    #143 <Method void CLog.v(String)>
			if(mAutoFocusPeriodicTask != null)
	//*  35   75:aload_0         
	//*  36   76:getfield        #408 <Field CameraThread$AutoFocusPeriodicTask mAutoFocusPeriodicTask>
	//*  37   79:ifnull          94
				mHandler.post(((Runnable) (mAutoFocusPeriodicTask)));
	//   38   82:aload_0         
	//   39   83:getfield        #412 <Field Handler mHandler>
	//   40   86:aload_0         
	//   41   87:getfield        #408 <Field CameraThread$AutoFocusPeriodicTask mAutoFocusPeriodicTask>
	//   42   90:invokevirtual   #424 <Method boolean Handler.post(Runnable)>
	//   43   93:pop             
			stringbuilder = new StringBuilder();
	//   44   94:new             #279 <Class StringBuilder>
	//   45   97:dup             
	//   46   98:invokespecial   #280 <Method void StringBuilder()>
	//   47  101:astore_2        
			stringbuilder.append("PreviewStarted with w: ");
	//   48  102:aload_2         
	//   49  103:ldc2            #537 <String "PreviewStarted with w: ">
	//   50  106:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   51  109:pop             
			stringbuilder.append(mLastWidth);
	//   52  110:aload_2         
	//   53  111:aload_0         
	//   54  112:getfield        #115 <Field int mLastWidth>
	//   55  115:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//   56  118:pop             
			stringbuilder.append(", h:");
	//   57  119:aload_2         
	//   58  120:ldc2            #539 <String ", h:">
	//   59  123:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   60  126:pop             
			stringbuilder.append(mLastHeight);
	//   61  127:aload_2         
	//   62  128:aload_0         
	//   63  129:getfield        #117 <Field int mLastHeight>
	//   64  132:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//   65  135:pop             
			CLog.v(stringbuilder.toString());
	//   66  136:aload_2         
	//   67  137:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   68  140:invokestatic    #143 <Method void CLog.v(String)>
			mIsPreviewStarted = true;
	//   69  143:aload_0         
	//   70  144:iconst_1        
	//   71  145:putfield        #121 <Field boolean mIsPreviewStarted>
			mVideoCaptureConsumer.onPreviewStarted(mLastBufferSize, mLastWidth, mLastHeight);
	//   72  148:aload_0         
	//   73  149:getfield        #191 <Field VideoCaptureConsumerHub mVideoCaptureConsumer>
	//   74  152:aload_0         
	//   75  153:getfield        #119 <Field int mLastBufferSize>
	//   76  156:aload_0         
	//   77  157:getfield        #115 <Field int mLastWidth>
	//   78  160:aload_0         
	//   79  161:getfield        #117 <Field int mLastHeight>
	//   80  164:invokevirtual   #545 <Method void VideoCaptureConsumerHub.onPreviewStarted(int, int, int)>
			return;
	//   81  167:return          
		}
		catch(Exception exception)
	//*  82  168:astore_2        
		{
			exception.printStackTrace();
	//   83  169:aload_2         
	//   84  170:invokevirtual   #450 <Method void Exception.printStackTrace()>
		}
	//   85  173:return          
	}

	private void startCaptureInternal(int i, int j)
	{
		Exception exception6;
		CLog.v("startCaptureInternal");
	//    0    0:ldc2            #564 <String "startCaptureInternal">
	//    1    3:invokestatic    #143 <Method void CLog.v(String)>
		if(mCapturing)
	//*   2    6:aload_0         
	//*   3    7:getfield        #154 <Field boolean mCapturing>
	//*   4   10:ifeq            20
		{
			CLog.d("already capturing....");
	//    5   13:ldc2            #566 <String "already capturing....">
	//    6   16:invokestatic    #277 <Method void CLog.d(String)>
			return;
	//    7   19:return          
		}
		Object obj = ((Object) (mCamera));
	//    8   20:aload_0         
	//    9   21:getfield        #158 <Field Camera mCamera>
	//   10   24:astore          10
		if(obj == null)
	//*  11   26:aload           10
	//*  12   28:ifnonnull       39
		{
			mVideoCaptureConsumer.onCameraOpenFailed();
	//   13   31:aload_0         
	//   14   32:getfield        #191 <Field VideoCaptureConsumerHub mVideoCaptureConsumer>
	//   15   35:invokevirtual   #569 <Method void VideoCaptureConsumerHub.onCameraOpenFailed()>
			return;
	//   16   38:return          
		}
		((Camera) (obj)).getParameters();
	//   17   39:aload           10
	//   18   41:invokevirtual   #397 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//   19   44:pop             
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*  20   45:getstatic       #574 <Field int android.os.Build$VERSION.SDK_INT>
	//*  21   48:bipush          14
	//*  22   50:icmplt          121
		{
			obj = ((Object) (mCamera.getParameters()));
	//   23   53:aload_0         
	//   24   54:getfield        #158 <Field Camera mCamera>
	//   25   57:invokevirtual   #397 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//   26   60:astore          10
			try
			{
				((android.hardware.Camera.Parameters) (obj)).setRecordingHint(ConfCamera.setRecordingHint);
	//   27   62:aload           10
	//   28   64:getstatic       #579 <Field boolean ConfCamera.setRecordingHint>
	//   29   67:invokevirtual   #582 <Method void android.hardware.Camera$Parameters.setRecordingHint(boolean)>
				mCamera.setParameters(((android.hardware.Camera.Parameters) (obj)));
	//   30   70:aload_0         
	//   31   71:getfield        #158 <Field Camera mCamera>
	//   32   74:aload           10
	//   33   76:invokevirtual   #586 <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
			}
	//*  34   79:goto            121
			catch(Exception exception)
	//*  35   82:astore          10
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   36   84:new             #279 <Class StringBuilder>
	//   37   87:dup             
	//   38   88:invokespecial   #280 <Method void StringBuilder()>
	//   39   91:astore          11
				stringbuilder.append("couldn't init camera: ");
	//   40   93:aload           11
	//   41   95:ldc2            #588 <String "couldn't init camera: ">
	//   42   98:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   43  101:pop             
				stringbuilder.append(exception.getMessage());
	//   44  102:aload           11
	//   45  104:aload           10
	//   46  106:invokevirtual   #455 <Method String Exception.getMessage()>
	//   47  109:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   48  112:pop             
				CLog.e(stringbuilder.toString());
	//   49  113:aload           11
	//   50  115:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   51  118:invokestatic    #458 <Method void CLog.e(String)>
			}
		}
		exception = ((Exception) (mCamera.getParameters()));
	//   52  121:aload_0         
	//   53  122:getfield        #158 <Field Camera mCamera>
	//   54  125:invokevirtual   #397 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//   55  128:astore          10
		CLog.d("Camera supported sizes");
	//   56  130:ldc2            #590 <String "Camera supported sizes">
	//   57  133:invokestatic    #277 <Method void CLog.d(String)>
		exception = ((Exception) (((android.hardware.Camera.Parameters) (exception)).getSupportedPreviewSizes()));
	//   58  136:aload           10
	//   59  138:invokevirtual   #312 <Method List android.hardware.Camera$Parameters.getSupportedPreviewSizes()>
	//   60  141:astore          10
		for(int k = ((List) (exception)).size() - 1; k >= 0; k--)
	//*  61  143:aload           10
	//*  62  145:invokeinterface #593 <Method int List.size()>
	//*  63  150:iconst_1        
	//*  64  151:isub            
	//*  65  152:istore          4
	//*  66  154:iload           4
	//*  67  156:iflt            284
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   68  159:new             #279 <Class StringBuilder>
	//   69  162:dup             
	//   70  163:invokespecial   #280 <Method void StringBuilder()>
	//   71  166:astore          11
			stringbuilder1.append(((android.hardware.Camera.Size)((List) (exception)).get(k)).width);
	//   72  168:aload           11
	//   73  170:aload           10
	//   74  172:iload           4
	//   75  174:invokeinterface #596 <Method Object List.get(int)>
	//   76  179:checkcast       #266 <Class android.hardware.Camera$Size>
	//   77  182:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//   78  185:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//   79  188:pop             
			stringbuilder1.append(" ");
	//   80  189:aload           11
	//   81  191:ldc2            #598 <String " ">
	//   82  194:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   83  197:pop             
			stringbuilder1.append(((android.hardware.Camera.Size)((List) (exception)).get(k)).height);
	//   84  198:aload           11
	//   85  200:aload           10
	//   86  202:iload           4
	//   87  204:invokeinterface #596 <Method Object List.get(int)>
	//   88  209:checkcast       #266 <Class android.hardware.Camera$Size>
	//   89  212:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//   90  215:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//   91  218:pop             
			stringbuilder1.append(" aspect ratio: ");
	//   92  219:aload           11
	//   93  221:ldc2            #600 <String " aspect ratio: ">
	//   94  224:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   95  227:pop             
			stringbuilder1.append((double)((android.hardware.Camera.Size)((List) (exception)).get(k)).width / (double)((android.hardware.Camera.Size)((List) (exception)).get(k)).height);
	//   96  228:aload           11
	//   97  230:aload           10
	//   98  232:iload           4
	//   99  234:invokeinterface #596 <Method Object List.get(int)>
	//  100  239:checkcast       #266 <Class android.hardware.Camera$Size>
	//  101  242:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  102  245:i2d             
	//  103  246:aload           10
	//  104  248:iload           4
	//  105  250:invokeinterface #596 <Method Object List.get(int)>
	//  106  255:checkcast       #266 <Class android.hardware.Camera$Size>
	//  107  258:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  108  261:i2d             
	//  109  262:ddiv            
	//  110  263:invokevirtual   #296 <Method StringBuilder StringBuilder.append(double)>
	//  111  266:pop             
			CLog.d(stringbuilder1.toString());
	//  112  267:aload           11
	//  113  269:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  114  272:invokestatic    #277 <Method void CLog.d(String)>
		}

	//  115  275:iload           4
	//  116  277:iconst_1        
	//  117  278:isub            
	//  118  279:istore          4
	//* 119  281:goto            154
		exception = ((Exception) (mCamera.getParameters()));
	//  120  284:aload_0         
	//  121  285:getfield        #158 <Field Camera mCamera>
	//  122  288:invokevirtual   #397 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//  123  291:astore          10
		Object obj1 = ((Object) (new StringBuilder()));
	//  124  293:new             #279 <Class StringBuilder>
	//  125  296:dup             
	//  126  297:invokespecial   #280 <Method void StringBuilder()>
	//  127  300:astore          11
		((StringBuilder) (obj1)).append("Default preview size: ");
	//  128  302:aload           11
	//  129  304:ldc2            #602 <String "Default preview size: ">
	//  130  307:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  131  310:pop             
		((StringBuilder) (obj1)).append(((android.hardware.Camera.Parameters) (exception)).getPreviewSize().width);
	//  132  311:aload           11
	//  133  313:aload           10
	//  134  315:invokevirtual   #244 <Method android.hardware.Camera$Size android.hardware.Camera$Parameters.getPreviewSize()>
	//  135  318:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  136  321:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  137  324:pop             
		((StringBuilder) (obj1)).append(",");
	//  138  325:aload           11
	//  139  327:ldc1            #252 <String ",">
	//  140  329:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  141  332:pop             
		((StringBuilder) (obj1)).append(((android.hardware.Camera.Parameters) (exception)).getPreviewSize().height);
	//  142  333:aload           11
	//  143  335:aload           10
	//  144  337:invokevirtual   #244 <Method android.hardware.Camera$Size android.hardware.Camera$Parameters.getPreviewSize()>
	//  145  340:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  146  343:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  147  346:pop             
		CLog.d(((StringBuilder) (obj1)).toString());
	//  148  347:aload           11
	//  149  349:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  150  352:invokestatic    #277 <Method void CLog.d(String)>
		obj1 = ((Object) (getBestPreviewSize(((android.hardware.Camera.Parameters) (exception)), i, j)));
	//  151  355:aload_0         
	//  152  356:aload           10
	//  153  358:iload_1         
	//  154  359:iload_2         
	//  155  360:invokespecial   #604 <Method android.hardware.Camera$Size getBestPreviewSize(android.hardware.Camera$Parameters, int, int)>
	//  156  363:astore          11
		int i2 = ((android.hardware.Camera.Size) (obj1)).width;
	//  157  365:aload           11
	//  158  367:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  159  370:istore          8
		int j2 = ((android.hardware.Camera.Size) (obj1)).height;
	//  160  372:aload           11
	//  161  374:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  162  377:istore          9
		obj1 = ((Object) (new StringBuilder()));
	//  163  379:new             #279 <Class StringBuilder>
	//  164  382:dup             
	//  165  383:invokespecial   #280 <Method void StringBuilder()>
	//  166  386:astore          11
		((StringBuilder) (obj1)).append("Requesting preview size: ");
	//  167  388:aload           11
	//  168  390:ldc2            #606 <String "Requesting preview size: ">
	//  169  393:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  170  396:pop             
		((StringBuilder) (obj1)).append(i2);
	//  171  397:aload           11
	//  172  399:iload           8
	//  173  401:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  174  404:pop             
		((StringBuilder) (obj1)).append(",");
	//  175  405:aload           11
	//  176  407:ldc1            #252 <String ",">
	//  177  409:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  178  412:pop             
		((StringBuilder) (obj1)).append(j2);
	//  179  413:aload           11
	//  180  415:iload           9
	//  181  417:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  182  420:pop             
		CLog.d(((StringBuilder) (obj1)).toString());
	//  183  421:aload           11
	//  184  423:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  185  426:invokestatic    #277 <Method void CLog.d(String)>
		((android.hardware.Camera.Parameters) (exception)).setPreviewSize(i2, j2);
	//  186  429:aload           10
	//  187  431:iload           8
	//  188  433:iload           9
	//  189  435:invokevirtual   #609 <Method void android.hardware.Camera$Parameters.setPreviewSize(int, int)>
		obj1 = ((Object) (new StringBuilder()));
	//  190  438:new             #279 <Class StringBuilder>
	//  191  441:dup             
	//  192  442:invokespecial   #280 <Method void StringBuilder()>
	//  193  445:astore          11
		((StringBuilder) (obj1)).append("");
	//  194  447:aload           11
	//  195  449:ldc2            #611 <String "">
	//  196  452:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  197  455:pop             
		((StringBuilder) (obj1)).append(i2);
	//  198  456:aload           11
	//  199  458:iload           8
	//  200  460:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  201  463:pop             
		((StringBuilder) (obj1)).append("x");
	//  202  464:aload           11
	//  203  466:ldc2            #291 <String "x">
	//  204  469:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  205  472:pop             
		((StringBuilder) (obj1)).append(j2);
	//  206  473:aload           11
	//  207  475:iload           9
	//  208  477:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  209  480:pop             
		((android.hardware.Camera.Parameters) (exception)).set("video-size", ((StringBuilder) (obj1)).toString());
	//  210  481:aload           10
	//  211  483:ldc2            #613 <String "video-size">
	//  212  486:aload           11
	//  213  488:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  214  491:invokevirtual   #617 <Method void android.hardware.Camera$Parameters.set(String, String)>
		try
		{
			mCamera.setParameters(((android.hardware.Camera.Parameters) (exception)));
	//  215  494:aload_0         
	//  216  495:getfield        #158 <Field Camera mCamera>
	//  217  498:aload           10
	//  218  500:invokevirtual   #586 <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
		}
	//* 219  503:goto            550
		catch(Exception exception1)
	//* 220  506:astore          10
		{
			exception1.printStackTrace();
	//  221  508:aload           10
	//  222  510:invokevirtual   #450 <Method void Exception.printStackTrace()>
			obj1 = ((Object) (new StringBuilder()));
	//  223  513:new             #279 <Class StringBuilder>
	//  224  516:dup             
	//  225  517:invokespecial   #280 <Method void StringBuilder()>
	//  226  520:astore          11
			((StringBuilder) (obj1)).append("Error in camera setPreviewSize : ");
	//  227  522:aload           11
	//  228  524:ldc2            #619 <String "Error in camera setPreviewSize : ">
	//  229  527:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  230  530:pop             
			((StringBuilder) (obj1)).append(exception1.getMessage());
	//  231  531:aload           11
	//  232  533:aload           10
	//  233  535:invokevirtual   #455 <Method String Exception.getMessage()>
	//  234  538:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  235  541:pop             
			CLog.e(((StringBuilder) (obj1)).toString());
	//  236  542:aload           11
	//  237  544:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  238  547:invokestatic    #458 <Method void CLog.e(String)>
		}
		exception1 = ((Exception) (mCamera.getParameters()));
	//  239  550:aload_0         
	//  240  551:getfield        #158 <Field Camera mCamera>
	//  241  554:invokevirtual   #397 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//  242  557:astore          10
		obj1 = ((Object) (new StringBuilder()));
	//  243  559:new             #279 <Class StringBuilder>
	//  244  562:dup             
	//  245  563:invokespecial   #280 <Method void StringBuilder()>
	//  246  566:astore          11
		((StringBuilder) (obj1)).append("Preview size after request:");
	//  247  568:aload           11
	//  248  570:ldc2            #621 <String "Preview size after request:">
	//  249  573:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  250  576:pop             
		((StringBuilder) (obj1)).append(((android.hardware.Camera.Parameters) (exception1)).getPreviewSize().width);
	//  251  577:aload           11
	//  252  579:aload           10
	//  253  581:invokevirtual   #244 <Method android.hardware.Camera$Size android.hardware.Camera$Parameters.getPreviewSize()>
	//  254  584:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//  255  587:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  256  590:pop             
		((StringBuilder) (obj1)).append(",");
	//  257  591:aload           11
	//  258  593:ldc1            #252 <String ",">
	//  259  595:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  260  598:pop             
		((StringBuilder) (obj1)).append(((android.hardware.Camera.Parameters) (exception1)).getPreviewSize().height);
	//  261  599:aload           11
	//  262  601:aload           10
	//  263  603:invokevirtual   #244 <Method android.hardware.Camera$Size android.hardware.Camera$Parameters.getPreviewSize()>
	//  264  606:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//  265  609:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  266  612:pop             
		CLog.d(((StringBuilder) (obj1)).toString());
	//  267  613:aload           11
	//  268  615:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  269  618:invokestatic    #277 <Method void CLog.d(String)>
		exception1 = ((Exception) (mCamera.getParameters()));
	//  270  621:aload_0         
	//  271  622:getfield        #158 <Field Camera mCamera>
	//  272  625:invokevirtual   #397 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//  273  628:astore          10
		CLog.d("Grabber supported formats");
	//  274  630:ldc2            #623 <String "Grabber supported formats">
	//  275  633:invokestatic    #277 <Method void CLog.d(String)>
		StringBuilder stringbuilder10;
		for(obj1 = ((Object) (((android.hardware.Camera.Parameters) (exception1)).getSupportedPreviewFormats().iterator())); ((Iterator) (obj1)).hasNext(); CLog.d(stringbuilder10.toString()))
	//* 276  636:aload           10
	//* 277  638:invokevirtual   #626 <Method List android.hardware.Camera$Parameters.getSupportedPreviewFormats()>
	//* 278  641:invokeinterface #320 <Method Iterator List.iterator()>
	//* 279  646:astore          11
	//* 280  648:aload           11
	//* 281  650:invokeinterface #326 <Method boolean Iterator.hasNext()>
	//* 282  655:ifeq            719
		{
			Integer integer = (Integer)((Iterator) (obj1)).next();
	//  283  658:aload           11
	//  284  660:invokeinterface #330 <Method Object Iterator.next()>
	//  285  665:checkcast       #628 <Class Integer>
	//  286  668:astore          12
			stringbuilder10 = new StringBuilder();
	//  287  670:new             #279 <Class StringBuilder>
	//  288  673:dup             
	//  289  674:invokespecial   #280 <Method void StringBuilder()>
	//  290  677:astore          13
			stringbuilder10.append("Format: '");
	//  291  679:aload           13
	//  292  681:ldc2            #630 <String "Format: '">
	//  293  684:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  294  687:pop             
			stringbuilder10.append(integer.toString());
	//  295  688:aload           13
	//  296  690:aload           12
	//  297  692:invokevirtual   #631 <Method String Integer.toString()>
	//  298  695:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  299  698:pop             
			stringbuilder10.append("'");
	//  300  699:aload           13
	//  301  701:ldc2            #633 <String "'">
	//  302  704:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  303  707:pop             
		}

	//  304  708:aload           13
	//  305  710:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  306  713:invokestatic    #277 <Method void CLog.d(String)>
	//* 307  716:goto            648
		((android.hardware.Camera.Parameters) (exception1)).setPreviewFormat(17);
	//  308  719:aload           10
	//  309  721:bipush          17
	//  310  723:invokevirtual   #636 <Method void android.hardware.Camera$Parameters.setPreviewFormat(int)>
		obj1 = ((Object) (new StringBuilder()));
	//  311  726:new             #279 <Class StringBuilder>
	//  312  729:dup             
	//  313  730:invokespecial   #280 <Method void StringBuilder()>
	//  314  733:astore          11
		((StringBuilder) (obj1)).append("Grabber default format: ");
	//  315  735:aload           11
	//  316  737:ldc2            #638 <String "Grabber default format: ">
	//  317  740:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  318  743:pop             
		((StringBuilder) (obj1)).append(((android.hardware.Camera.Parameters) (exception1)).getPreviewFormat());
	//  319  744:aload           11
	//  320  746:aload           10
	//  321  748:invokevirtual   #641 <Method int android.hardware.Camera$Parameters.getPreviewFormat()>
	//  322  751:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  323  754:pop             
		CLog.d(((StringBuilder) (obj1)).toString());
	//  324  755:aload           11
	//  325  757:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  326  760:invokestatic    #277 <Method void CLog.d(String)>
		CLog.d("Trying to set format : 17");
	//  327  763:ldc2            #643 <String "Trying to set format : 17">
	//  328  766:invokestatic    #277 <Method void CLog.d(String)>
		try
		{
			mCamera.setParameters(((android.hardware.Camera.Parameters) (exception1)));
	//  329  769:aload_0         
	//  330  770:getfield        #158 <Field Camera mCamera>
	//  331  773:aload           10
	//  332  775:invokevirtual   #586 <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
			exception1 = ((Exception) (mCamera.getParameters()));
	//  333  778:aload_0         
	//  334  779:getfield        #158 <Field Camera mCamera>
	//  335  782:invokevirtual   #397 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//  336  785:astore          10
			StringBuilder stringbuilder2 = new StringBuilder();
	//  337  787:new             #279 <Class StringBuilder>
	//  338  790:dup             
	//  339  791:invokespecial   #280 <Method void StringBuilder()>
	//  340  794:astore          11
			stringbuilder2.append("Current format: '");
	//  341  796:aload           11
	//  342  798:ldc2            #645 <String "Current format: '">
	//  343  801:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  344  804:pop             
			stringbuilder2.append(((android.hardware.Camera.Parameters) (exception1)).getPreviewFormat());
	//  345  805:aload           11
	//  346  807:aload           10
	//  347  809:invokevirtual   #641 <Method int android.hardware.Camera$Parameters.getPreviewFormat()>
	//  348  812:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  349  815:pop             
			stringbuilder2.append("'");
	//  350  816:aload           11
	//  351  818:ldc2            #633 <String "'">
	//  352  821:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  353  824:pop             
			CLog.d(stringbuilder2.toString());
	//  354  825:aload           11
	//  355  827:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  356  830:invokestatic    #277 <Method void CLog.d(String)>
		}
	//* 357  833:goto            875
		catch(Exception exception2)
	//* 358  836:astore          10
		{
			StringBuilder stringbuilder3 = new StringBuilder();
	//  359  838:new             #279 <Class StringBuilder>
	//  360  841:dup             
	//  361  842:invokespecial   #280 <Method void StringBuilder()>
	//  362  845:astore          11
			stringbuilder3.append("Error in camera camera init");
	//  363  847:aload           11
	//  364  849:ldc2            #647 <String "Error in camera camera init">
	//  365  852:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  366  855:pop             
			stringbuilder3.append(exception2.getMessage());
	//  367  856:aload           11
	//  368  858:aload           10
	//  369  860:invokevirtual   #455 <Method String Exception.getMessage()>
	//  370  863:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  371  866:pop             
			CLog.e(stringbuilder3.toString());
	//  372  867:aload           11
	//  373  869:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  374  872:invokestatic    #458 <Method void CLog.e(String)>
		}
		if(!Build.MODEL.equals("SM-G350"))
	//* 375  875:getstatic       #652 <Field String Build.MODEL>
	//* 376  878:ldc2            #654 <String "SM-G350">
	//* 377  881:invokevirtual   #391 <Method boolean String.equals(Object)>
	//* 378  884:ifne            1387
		{
			exception2 = ((Exception) (mCamera.getParameters()));
	//  379  887:aload_0         
	//  380  888:getfield        #158 <Field Camera mCamera>
	//  381  891:invokevirtual   #397 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//  382  894:astore          10
			Object obj2 = ((Object) (((android.hardware.Camera.Parameters) (exception2)).getSupportedPreviewFpsRange()));
	//  383  896:aload           10
	//  384  898:invokevirtual   #657 <Method List android.hardware.Camera$Parameters.getSupportedPreviewFpsRange()>
	//  385  901:astore          11
			boolean flag = false;
	//  386  903:iconst_0        
	//  387  904:istore          6
			i = ((int) (flag));
	//  388  906:iload           6
	//  389  908:istore_1        
			int l = i;
	//  390  909:iload_1         
	//  391  910:istore          4
			j = l;
	//  392  912:iload           4
	//  393  914:istore_2        
			int l1 = l;
	//  394  915:iload           4
	//  395  917:istore          7
			int j1 = i;
	//  396  919:iload_1         
	//  397  920:istore          5
			for(i = ((int) (flag)); i < ((List) (obj2)).size();)
	//* 398  922:iload           6
	//* 399  924:istore_1        
	//* 400  925:iload_1         
	//* 401  926:aload           11
	//* 402  928:invokeinterface #593 <Method int List.size()>
	//* 403  933:icmpge          1160
			{
				StringBuilder stringbuilder8 = new StringBuilder();
	//  404  936:new             #279 <Class StringBuilder>
	//  405  939:dup             
	//  406  940:invokespecial   #280 <Method void StringBuilder()>
	//  407  943:astore          12
				stringbuilder8.append("fps range: ");
	//  408  945:aload           12
	//  409  947:ldc2            #659 <String "fps range: ">
	//  410  950:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  411  953:pop             
				stringbuilder8.append(((int[])((List) (obj2)).get(i))[0]);
	//  412  954:aload           12
	//  413  956:aload           11
	//  414  958:iload_1         
	//  415  959:invokeinterface #596 <Method Object List.get(int)>
	//  416  964:checkcast       #661 <Class int[]>
	//  417  967:iconst_0        
	//  418  968:iaload          
	//  419  969:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  420  972:pop             
				stringbuilder8.append(" - ");
	//  421  973:aload           12
	//  422  975:ldc2            #663 <String " - ">
	//  423  978:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  424  981:pop             
				stringbuilder8.append(((int[])((List) (obj2)).get(i))[1]);
	//  425  982:aload           12
	//  426  984:aload           11
	//  427  986:iload_1         
	//  428  987:invokeinterface #596 <Method Object List.get(int)>
	//  429  992:checkcast       #661 <Class int[]>
	//  430  995:iconst_1        
	//  431  996:iaload          
	//  432  997:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  433 1000:pop             
				CLog.d(stringbuilder8.toString());
	//  434 1001:aload           12
	//  435 1003:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  436 1006:invokestatic    #277 <Method void CLog.d(String)>
				int k1 = l1;
	//  437 1009:iload           7
	//  438 1011:istore          6
				int i1 = j;
	//  439 1013:iload_2         
	//  440 1014:istore          4
				if(l1 < ((int[])((List) (obj2)).get(i))[0])
	//* 441 1016:iload           7
	//* 442 1018:aload           11
	//* 443 1020:iload_1         
	//* 444 1021:invokeinterface #596 <Method Object List.get(int)>
	//* 445 1026:checkcast       #661 <Class int[]>
	//* 446 1029:iconst_0        
	//* 447 1030:iaload          
	//* 448 1031:icmpge          1052
				{
					k1 = ((int[])((List) (obj2)).get(i))[0];
	//  449 1034:aload           11
	//  450 1036:iload_1         
	//  451 1037:invokeinterface #596 <Method Object List.get(int)>
	//  452 1042:checkcast       #661 <Class int[]>
	//  453 1045:iconst_0        
	//  454 1046:iaload          
	//  455 1047:istore          6
					i1 = i;
	//  456 1049:iload_1         
	//  457 1050:istore          4
				}
				j = i1;
	//  458 1052:iload           4
	//  459 1054:istore_2        
				if(k1 == ((int[])((List) (obj2)).get(i))[0])
	//* 460 1055:iload           6
	//* 461 1057:aload           11
	//* 462 1059:iload_1         
	//* 463 1060:invokeinterface #596 <Method Object List.get(int)>
	//* 464 1065:checkcast       #661 <Class int[]>
	//* 465 1068:iconst_0        
	//* 466 1069:iaload          
	//* 467 1070:icmpne          1108
				{
					j = i1;
	//  468 1073:iload           4
	//  469 1075:istore_2        
					if(((int[])((List) (obj2)).get(i))[1] > ((int[])((List) (obj2)).get(i1))[1])
	//* 470 1076:aload           11
	//* 471 1078:iload_1         
	//* 472 1079:invokeinterface #596 <Method Object List.get(int)>
	//* 473 1084:checkcast       #661 <Class int[]>
	//* 474 1087:iconst_1        
	//* 475 1088:iaload          
	//* 476 1089:aload           11
	//* 477 1091:iload           4
	//* 478 1093:invokeinterface #596 <Method Object List.get(int)>
	//* 479 1098:checkcast       #661 <Class int[]>
	//* 480 1101:iconst_1        
	//* 481 1102:iaload          
	//* 482 1103:icmple          1108
						j = i;
	//  483 1106:iload_1         
	//  484 1107:istore_2        
				}
				i1 = j1;
	//  485 1108:iload           5
	//  486 1110:istore          4
				if(j1 < ((int[])((List) (obj2)).get(i))[1])
	//* 487 1112:iload           5
	//* 488 1114:aload           11
	//* 489 1116:iload_1         
	//* 490 1117:invokeinterface #596 <Method Object List.get(int)>
	//* 491 1122:checkcast       #661 <Class int[]>
	//* 492 1125:iconst_1        
	//* 493 1126:iaload          
	//* 494 1127:icmpge          1145
					i1 = ((int[])((List) (obj2)).get(i))[1];
	//  495 1130:aload           11
	//  496 1132:iload_1         
	//  497 1133:invokeinterface #596 <Method Object List.get(int)>
	//  498 1138:checkcast       #661 <Class int[]>
	//  499 1141:iconst_1        
	//  500 1142:iaload          
	//  501 1143:istore          4
				i++;
	//  502 1145:iload_1         
	//  503 1146:iconst_1        
	//  504 1147:iadd            
	//  505 1148:istore_1        
				j1 = i1;
	//  506 1149:iload           4
	//  507 1151:istore          5
				l1 = k1;
	//  508 1153:iload           6
	//  509 1155:istore          7
			}

	//* 510 1157:goto            925
			StringBuilder stringbuilder9 = new StringBuilder();
	//  511 1160:new             #279 <Class StringBuilder>
	//  512 1163:dup             
	//  513 1164:invokespecial   #280 <Method void StringBuilder()>
	//  514 1167:astore          12
			stringbuilder9.append("Chose highest  fps: ");
	//  515 1169:aload           12
	//  516 1171:ldc2            #665 <String "Chose highest  fps: ">
	//  517 1174:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  518 1177:pop             
			stringbuilder9.append(j1);
	//  519 1178:aload           12
	//  520 1180:iload           5
	//  521 1182:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  522 1185:pop             
			stringbuilder9.append(" - ");
	//  523 1186:aload           12
	//  524 1188:ldc2            #663 <String " - ">
	//  525 1191:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//  526 1194:pop             
			stringbuilder9.append(j1);
	//  527 1195:aload           12
	//  528 1197:iload           5
	//  529 1199:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//  530 1202:pop             
			CLog.d(stringbuilder9.toString());
	//  531 1203:aload           12
	//  532 1205:invokevirtual   #302 <Method String StringBuilder.toString()>
	//  533 1208:invokestatic    #277 <Method void CLog.d(String)>
			((android.hardware.Camera.Parameters) (exception2)).setPreviewFpsRange(j1, j1);
	//  534 1211:aload           10
	//  535 1213:iload           5
	//  536 1215:iload           5
	//  537 1217:invokevirtual   #668 <Method void android.hardware.Camera$Parameters.setPreviewFpsRange(int, int)>
			Exception exception3;
			try
			{
				mCamera.setParameters(((android.hardware.Camera.Parameters) (exception2)));
	//  538 1220:aload_0         
	//  539 1221:getfield        #158 <Field Camera mCamera>
	//  540 1224:aload           10
	//  541 1226:invokevirtual   #586 <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
			}
	//* 542 1229:goto            1387
	//* 543 1232:new             #279 <Class StringBuilder>
	//* 544 1235:dup             
	//* 545 1236:invokespecial   #280 <Method void StringBuilder()>
	//* 546 1239:astore          12
	//* 547 1241:aload           12
	//* 548 1243:ldc2            #670 <String "Chose highest min fps range: ">
	//* 549 1246:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 550 1249:pop             
	//* 551 1250:aload           12
	//* 552 1252:aload           11
	//* 553 1254:iload_2         
	//* 554 1255:invokeinterface #596 <Method Object List.get(int)>
	//* 555 1260:checkcast       #661 <Class int[]>
	//* 556 1263:iconst_0        
	//* 557 1264:iaload          
	//* 558 1265:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//* 559 1268:pop             
	//* 560 1269:aload           12
	//* 561 1271:ldc2            #663 <String " - ">
	//* 562 1274:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 563 1277:pop             
	//* 564 1278:aload           12
	//* 565 1280:aload           11
	//* 566 1282:iload_2         
	//* 567 1283:invokeinterface #596 <Method Object List.get(int)>
	//* 568 1288:checkcast       #661 <Class int[]>
	//* 569 1291:iconst_1        
	//* 570 1292:iaload          
	//* 571 1293:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//* 572 1296:pop             
	//* 573 1297:aload           12
	//* 574 1299:invokevirtual   #302 <Method String StringBuilder.toString()>
	//* 575 1302:invokestatic    #365 <Method void CLog.i(String)>
	//* 576 1305:aload           10
	//* 577 1307:aload           11
	//* 578 1309:iload_2         
	//* 579 1310:invokeinterface #596 <Method Object List.get(int)>
	//* 580 1315:checkcast       #661 <Class int[]>
	//* 581 1318:iconst_0        
	//* 582 1319:iaload          
	//* 583 1320:aload           11
	//* 584 1322:iload_2         
	//* 585 1323:invokeinterface #596 <Method Object List.get(int)>
	//* 586 1328:checkcast       #661 <Class int[]>
	//* 587 1331:iconst_1        
	//* 588 1332:iaload          
	//* 589 1333:invokevirtual   #668 <Method void android.hardware.Camera$Parameters.setPreviewFpsRange(int, int)>
	//* 590 1336:aload_0         
	//* 591 1337:getfield        #158 <Field Camera mCamera>
	//* 592 1340:aload           10
	//* 593 1342:invokevirtual   #586 <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
	//* 594 1345:goto            1387
	//* 595 1348:astore          10
	//* 596 1350:new             #279 <Class StringBuilder>
	//* 597 1353:dup             
	//* 598 1354:invokespecial   #280 <Method void StringBuilder()>
	//* 599 1357:astore          11
	//* 600 1359:aload           11
	//* 601 1361:ldc2            #647 <String "Error in camera camera init">
	//* 602 1364:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 603 1367:pop             
	//* 604 1368:aload           11
	//* 605 1370:aload           10
	//* 606 1372:invokevirtual   #455 <Method String Exception.getMessage()>
	//* 607 1375:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 608 1378:pop             
	//* 609 1379:aload           11
	//* 610 1381:invokevirtual   #302 <Method String StringBuilder.toString()>
	//* 611 1384:invokestatic    #458 <Method void CLog.e(String)>
	//* 612 1387:aload_0         
	//* 613 1388:getfield        #158 <Field Camera mCamera>
	//* 614 1391:invokevirtual   #397 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//* 615 1394:astore          10
	//* 616 1396:aload_0         
	//* 617 1397:aload           10
	//* 618 1399:invokevirtual   #244 <Method android.hardware.Camera$Size android.hardware.Camera$Parameters.getPreviewSize()>
	//* 619 1402:getfield        #269 <Field int android.hardware.Camera$Size.width>
	//* 620 1405:putfield        #115 <Field int mLastWidth>
	//* 621 1408:aload_0         
	//* 622 1409:aload           10
	//* 623 1411:invokevirtual   #244 <Method android.hardware.Camera$Size android.hardware.Camera$Parameters.getPreviewSize()>
	//* 624 1414:getfield        #272 <Field int android.hardware.Camera$Size.height>
	//* 625 1417:putfield        #117 <Field int mLastHeight>
	//* 626 1420:iload           8
	//* 627 1422:aload_0         
	//* 628 1423:getfield        #115 <Field int mLastWidth>
	//* 629 1426:icmpne          1450
	//* 630 1429:iload           9
	//* 631 1431:aload_0         
	//* 632 1432:getfield        #117 <Field int mLastHeight>
	//* 633 1435:icmpeq          1441
	//* 634 1438:goto            1450
	//* 635 1441:ldc2            #672 <String "Camera preview size configured correctly">
	//* 636 1444:invokestatic    #277 <Method void CLog.d(String)>
	//* 637 1447:goto            1574
	//* 638 1450:new             #279 <Class StringBuilder>
	//* 639 1453:dup             
	//* 640 1454:invokespecial   #280 <Method void StringBuilder()>
	//* 641 1457:astore          11
	//* 642 1459:aload           11
	//* 643 1461:ldc2            #674 <String "WARNING: Camera not using requested preview size (">
	//* 644 1464:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 645 1467:pop             
	//* 646 1468:aload           11
	//* 647 1470:iload           8
	//* 648 1472:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//* 649 1475:pop             
	//* 650 1476:aload           11
	//* 651 1478:ldc2            #291 <String "x">
	//* 652 1481:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 653 1484:pop             
	//* 654 1485:aload           11
	//* 655 1487:iload           9
	//* 656 1489:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//* 657 1492:pop             
	//* 658 1493:aload           11
	//* 659 1495:ldc2            #676 <String ").">
	//* 660 1498:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 661 1501:pop             
	//* 662 1502:aload           11
	//* 663 1504:invokevirtual   #302 <Method String StringBuilder.toString()>
	//* 664 1507:invokestatic    #344 <Method void CLog.w(String)>
	//* 665 1510:new             #279 <Class StringBuilder>
	//* 666 1513:dup             
	//* 667 1514:invokespecial   #280 <Method void StringBuilder()>
	//* 668 1517:astore          11
	//* 669 1519:aload           11
	//* 670 1521:ldc2            #678 <String "WARNING: Using preview size (">
	//* 671 1524:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 672 1527:pop             
	//* 673 1528:aload           11
	//* 674 1530:aload_0         
	//* 675 1531:getfield        #115 <Field int mLastWidth>
	//* 676 1534:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//* 677 1537:pop             
	//* 678 1538:aload           11
	//* 679 1540:ldc2            #291 <String "x">
	//* 680 1543:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 681 1546:pop             
	//* 682 1547:aload           11
	//* 683 1549:aload_0         
	//* 684 1550:getfield        #117 <Field int mLastHeight>
	//* 685 1553:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//* 686 1556:pop             
	//* 687 1557:aload           11
	//* 688 1559:ldc2            #676 <String ").">
	//* 689 1562:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 690 1565:pop             
	//* 691 1566:aload           11
	//* 692 1568:invokevirtual   #302 <Method String StringBuilder.toString()>
	//* 693 1571:invokestatic    #344 <Method void CLog.w(String)>
	//* 694 1574:aload           10
	//* 695 1576:invokevirtual   #641 <Method int android.hardware.Camera$Parameters.getPreviewFormat()>
	//* 696 1579:istore_1        
	//* 697 1580:iload_1         
	//* 698 1581:invokestatic    #683 <Method int ImageFormat.getBitsPerPixel(int)>
	//* 699 1584:i2f             
	//* 700 1585:ldc2            #684 <Float 8F>
	//* 701 1588:fdiv            
	//* 702 1589:fstore_3        
	//* 703 1590:new             #279 <Class StringBuilder>
	//* 704 1593:dup             
	//* 705 1594:invokespecial   #280 <Method void StringBuilder()>
	//* 706 1597:astore          10
	//* 707 1599:aload           10
	//* 708 1601:ldc2            #686 <String "Preview width ">
	//* 709 1604:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 710 1607:pop             
	//* 711 1608:aload           10
	//* 712 1610:aload_0         
	//* 713 1611:getfield        #115 <Field int mLastWidth>
	//* 714 1614:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//* 715 1617:pop             
	//* 716 1618:aload           10
	//* 717 1620:ldc2            #688 <String ", height">
	//* 718 1623:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 719 1626:pop             
	//* 720 1627:aload           10
	//* 721 1629:aload_0         
	//* 722 1630:getfield        #117 <Field int mLastHeight>
	//* 723 1633:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//* 724 1636:pop             
	//* 725 1637:aload           10
	//* 726 1639:ldc2            #690 <String ", bytesPerPixel ">
	//* 727 1642:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 728 1645:pop             
	//* 729 1646:aload           10
	//* 730 1648:fload_3         
	//* 731 1649:invokevirtual   #693 <Method StringBuilder StringBuilder.append(float)>
	//* 732 1652:pop             
	//* 733 1653:aload           10
	//* 734 1655:ldc2            #695 <String ", previewFormat = ">
	//* 735 1658:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 736 1661:pop             
	//* 737 1662:aload           10
	//* 738 1664:iload_1         
	//* 739 1665:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//* 740 1668:pop             
	//* 741 1669:aload           10
	//* 742 1671:invokevirtual   #302 <Method String StringBuilder.toString()>
	//* 743 1674:invokestatic    #277 <Method void CLog.d(String)>
	//* 744 1677:aload_0         
	//* 745 1678:aload_0         
	//* 746 1679:getfield        #115 <Field int mLastWidth>
	//* 747 1682:aload_0         
	//* 748 1683:getfield        #117 <Field int mLastHeight>
	//* 749 1686:imul            
	//* 750 1687:i2f             
	//* 751 1688:fload_3         
	//* 752 1689:fmul            
	//* 753 1690:f2i             
	//* 754 1691:putfield        #119 <Field int mLastBufferSize>
	//* 755 1694:new             #279 <Class StringBuilder>
	//* 756 1697:dup             
	//* 757 1698:invokespecial   #280 <Method void StringBuilder()>
	//* 758 1701:astore          10
	//* 759 1703:aload           10
	//* 760 1705:ldc2            #697 <String "buffer size: ">
	//* 761 1708:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 762 1711:pop             
	//* 763 1712:aload           10
	//* 764 1714:aload_0         
	//* 765 1715:getfield        #119 <Field int mLastBufferSize>
	//* 766 1718:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//* 767 1721:pop             
	//* 768 1722:aload           10
	//* 769 1724:invokevirtual   #302 <Method String StringBuilder.toString()>
	//* 770 1727:invokestatic    #277 <Method void CLog.d(String)>
	//* 771 1730:aload_0         
	//* 772 1731:getfield        #113 <Field MySynchronizedPool mBufferPool>
	//* 773 1734:invokevirtual   #522 <Method int MySynchronizedPool.getObjectCount()>
	//* 774 1737:iconst_3        
	//* 775 1738:icmpge          1758
	//* 776 1741:aload_0         
	//* 777 1742:getfield        #113 <Field MySynchronizedPool mBufferPool>
	//* 778 1745:aload_0         
	//* 779 1746:getfield        #119 <Field int mLastBufferSize>
	//* 780 1749:newarray        byte[]
	//* 781 1751:invokevirtual   #519 <Method boolean MySynchronizedPool.release(Object)>
	//* 782 1754:pop             
	//* 783 1755:goto            1730
	//* 784 1758:ldc2            #699 <String "setting camera callback with buffer">
	//* 785 1761:invokestatic    #365 <Method void CLog.i(String)>
	//* 786 1764:aload_0         
	//* 787 1765:getfield        #158 <Field Camera mCamera>
	//* 788 1768:aload_0         
	//* 789 1769:getfield        #113 <Field MySynchronizedPool mBufferPool>
	//* 790 1772:invokevirtual   #525 <Method Object MySynchronizedPool.acquire()>
	//* 791 1775:checkcast       #526 <Class byte[]>
	//* 792 1778:invokevirtual   #703 <Method void Camera.addCallbackBuffer(byte[])>
	//* 793 1781:aload_0         
	//* 794 1782:getfield        #158 <Field Camera mCamera>
	//* 795 1785:aload_0         
	//* 796 1786:invokevirtual   #505 <Method void Camera.setPreviewCallbackWithBuffer(android.hardware.Camera$PreviewCallback)>
	//* 797 1789:goto            1873
	//* 798 1792:astore          10
	//* 799 1794:new             #279 <Class StringBuilder>
	//* 800 1797:dup             
	//* 801 1798:invokespecial   #280 <Method void StringBuilder()>
	//* 802 1801:astore          11
	//* 803 1803:aload           11
	//* 804 1805:ldc2            #705 <String "error adding callback :">
	//* 805 1808:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 806 1811:pop             
	//* 807 1812:aload           11
	//* 808 1814:aload           10
	//* 809 1816:invokevirtual   #455 <Method String Exception.getMessage()>
	//* 810 1819:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 811 1822:pop             
	//* 812 1823:aload           11
	//* 813 1825:invokevirtual   #302 <Method String StringBuilder.toString()>
	//* 814 1828:invokestatic    #458 <Method void CLog.e(String)>
	//* 815 1831:goto            1873
	//* 816 1834:astore          10
	//* 817 1836:new             #279 <Class StringBuilder>
	//* 818 1839:dup             
	//* 819 1840:invokespecial   #280 <Method void StringBuilder()>
	//* 820 1843:astore          11
	//* 821 1845:aload           11
	//* 822 1847:ldc2            #707 <String "security exception, check permissions in your AndroidManifest to acces to the camera: ">
	//* 823 1850:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 824 1853:pop             
	//* 825 1854:aload           11
	//* 826 1856:aload           10
	//* 827 1858:invokevirtual   #708 <Method String SecurityException.getMessage()>
	//* 828 1861:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 829 1864:pop             
	//* 830 1865:aload           11
	//* 831 1867:invokevirtual   #302 <Method String StringBuilder.toString()>
	//* 832 1870:invokestatic    #458 <Method void CLog.e(String)>
	//* 833 1873:ldc2            #710 <String "Camera.startPreview()">
	//* 834 1876:invokestatic    #143 <Method void CLog.v(String)>
	//* 835 1879:aload_0         
	//* 836 1880:getfield        #158 <Field Camera mCamera>
	//* 837 1883:invokevirtual   #502 <Method void Camera.startPreview()>
	//* 838 1886:aload_0         
	//* 839 1887:iconst_1        
	//* 840 1888:putfield        #154 <Field boolean mCapturing>
	//* 841 1891:goto            1938
	//* 842 1894:astore          10
	//* 843 1896:new             #279 <Class StringBuilder>
	//* 844 1899:dup             
	//* 845 1900:invokespecial   #280 <Method void StringBuilder()>
	//* 846 1903:astore          11
	//* 847 1905:aload           11
	//* 848 1907:ldc2            #712 <String "Error starting preview:">
	//* 849 1910:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 850 1913:pop             
	//* 851 1914:aload           11
	//* 852 1916:aload           10
	//* 853 1918:invokevirtual   #715 <Method String Exception.getLocalizedMessage()>
	//* 854 1921:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//* 855 1924:pop             
	//* 856 1925:aload           11
	//* 857 1927:invokevirtual   #302 <Method String StringBuilder.toString()>
	//* 858 1930:invokestatic    #344 <Method void CLog.w(String)>
	//* 859 1933:aload           10
	//* 860 1935:invokevirtual   #450 <Method void Exception.printStackTrace()>
	//* 861 1938:aload_0         
	//* 862 1939:iconst_0        
	//* 863 1940:putfield        #430 <Field int countFocusing>
	//* 864 1943:aload_0         
	//* 865 1944:getfield        #187 <Field CameraThread$CameraParamsTask mUserPresetParamsTask>
	//* 866 1947:ifnull          1972
	//* 867 1950:ldc2            #717 <String "Recover user presets">
	//* 868 1953:invokestatic    #143 <Method void CLog.v(String)>
	//* 869 1956:aload_0         
	//* 870 1957:getfield        #412 <Field Handler mHandler>
	//* 871 1960:new             #14  <Class CameraThread$12>
	//* 872 1963:dup             
	//* 873 1964:aload_0         
	//* 874 1965:invokespecial   #719 <Method void CameraThread$12(CameraThread)>
	//* 875 1968:invokevirtual   #424 <Method boolean Handler.post(Runnable)>
	//* 876 1971:pop             
	//* 877 1972:aload_0         
	//* 878 1973:aconst_null     
	//* 879 1974:invokespecial   #183 <Method void setCameraDisplayOrientationInternal(CameraThread$DisplayOrientationCallback)>
	//* 880 1977:ldc2            #721 <String "init finalized, waiting for setPreviewDisplay or setPreviewTexture">
	//* 881 1980:invokestatic    #277 <Method void CLog.d(String)>
	//* 882 1983:aload_0         
	//* 883 1984:iconst_1        
	//* 884 1985:putfield        #127 <Field boolean mReadyToSetPreviewDisplay>
	//* 885 1988:aload_0         
	//* 886 1989:getfield        #191 <Field VideoCaptureConsumerHub mVideoCaptureConsumer>
	//* 887 1992:aload_0         
	//* 888 1993:getfield        #115 <Field int mLastWidth>
	//* 889 1996:aload_0         
	//* 890 1997:getfield        #117 <Field int mLastHeight>
	//* 891 2000:invokevirtual   #724 <Method void VideoCaptureConsumerHub.onReadyToSetPreviewDisplay(int, int)>
	//* 892 2003:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception6)
			{
				stringbuilder9 = new StringBuilder();
				stringbuilder9.append("Chose highest min fps range: ");
				stringbuilder9.append(((int[])((List) (obj2)).get(j))[0]);
				stringbuilder9.append(" - ");
				stringbuilder9.append(((int[])((List) (obj2)).get(j))[1]);
				CLog.i(stringbuilder9.toString());
				((android.hardware.Camera.Parameters) (exception2)).setPreviewFpsRange(((int[])((List) (obj2)).get(j))[0], ((int[])((List) (obj2)).get(j))[1]);
				try
				{
					mCamera.setParameters(((android.hardware.Camera.Parameters) (exception2)));
				}
				// Misplaced declaration of an exception variable
				catch(Exception exception3)
				{
					obj2 = ((Object) (new StringBuilder()));
					((StringBuilder) (obj2)).append("Error in camera camera init");
					((StringBuilder) (obj2)).append(exception3.getMessage());
					CLog.e(((StringBuilder) (obj2)).toString());
				}
			}
		}
		exception3 = ((Exception) (mCamera.getParameters()));
		mLastWidth = ((android.hardware.Camera.Parameters) (exception3)).getPreviewSize().width;
		mLastHeight = ((android.hardware.Camera.Parameters) (exception3)).getPreviewSize().height;
		if(i2 == mLastWidth && j2 == mLastHeight)
		{
			CLog.d("Camera preview size configured correctly");
		} else
		{
			StringBuilder stringbuilder4 = new StringBuilder();
			stringbuilder4.append("WARNING: Camera not using requested preview size (");
			stringbuilder4.append(i2);
			stringbuilder4.append("x");
			stringbuilder4.append(j2);
			stringbuilder4.append(").");
			CLog.w(stringbuilder4.toString());
			stringbuilder4 = new StringBuilder();
			stringbuilder4.append("WARNING: Using preview size (");
			stringbuilder4.append(mLastWidth);
			stringbuilder4.append("x");
			stringbuilder4.append(mLastHeight);
			stringbuilder4.append(").");
			CLog.w(stringbuilder4.toString());
		}
		i = ((android.hardware.Camera.Parameters) (exception3)).getPreviewFormat();
		float f = (float)ImageFormat.getBitsPerPixel(i) / 8F;
		exception3 = ((Exception) (new StringBuilder()));
		((StringBuilder) (exception3)).append("Preview width ");
		((StringBuilder) (exception3)).append(mLastWidth);
		((StringBuilder) (exception3)).append(", height");
		((StringBuilder) (exception3)).append(mLastHeight);
		((StringBuilder) (exception3)).append(", bytesPerPixel ");
		((StringBuilder) (exception3)).append(f);
		((StringBuilder) (exception3)).append(", previewFormat = ");
		((StringBuilder) (exception3)).append(i);
		CLog.d(((StringBuilder) (exception3)).toString());
		mLastBufferSize = (int)((float)(mLastWidth * mLastHeight) * f);
		exception3 = ((Exception) (new StringBuilder()));
		((StringBuilder) (exception3)).append("buffer size: ");
		((StringBuilder) (exception3)).append(mLastBufferSize);
		CLog.d(((StringBuilder) (exception3)).toString());
		for(; mBufferPool.getObjectCount() < 3; mBufferPool.release(((Object) (new byte[mLastBufferSize]))));
		try
		{
			CLog.i("setting camera callback with buffer");
			mCamera.addCallbackBuffer((byte[])mBufferPool.acquire());
			mCamera.setPreviewCallbackWithBuffer(((android.hardware.Camera.PreviewCallback) (this)));
		}
		catch(SecurityException securityexception)
		{
			StringBuilder stringbuilder6 = new StringBuilder();
			stringbuilder6.append("security exception, check permissions in your AndroidManifest to acces to the camera: ");
			stringbuilder6.append(securityexception.getMessage());
			CLog.e(stringbuilder6.toString());
		}
		catch(Exception exception4)
		{
			StringBuilder stringbuilder5 = new StringBuilder();
			stringbuilder5.append("error adding callback :");
			stringbuilder5.append(exception4.getMessage());
			CLog.e(stringbuilder5.toString());
		}
		try
		{
			CLog.v("Camera.startPreview()");
			mCamera.startPreview();
			mCapturing = true;
		}
		catch(Exception exception5)
		{
			StringBuilder stringbuilder7 = new StringBuilder();
			stringbuilder7.append("Error starting preview:");
			stringbuilder7.append(exception5.getLocalizedMessage());
			CLog.w(stringbuilder7.toString());
			exception5.printStackTrace();
		}
		countFocusing = 0;
		if(mUserPresetParamsTask != null)
		{
			CLog.v("Recover user presets");
			mHandler.post(new Runnable() {

				public void run()
				{
					CameraThread camerathread = CameraThread.this;
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field CameraThread this$0>
				//    2    4:astore_1        
					camerathread.updateCameraParamsInternal(camerathread.mUserPresetParamsTask);
				//    3    5:aload_1         
				//    4    6:aload_1         
				//    5    7:invokestatic    #26  <Method CameraThread$CameraParamsTask CameraThread.access$1300(CameraThread)>
				//    6   10:invokestatic    #30  <Method void CameraThread.access$800(CameraThread, CameraThread$CameraParamsTask)>
				//    7   13:return          
				}

				final CameraThread this$0;

			
			{
				this$0 = CameraThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CameraThread this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
		}
		setCameraDisplayOrientationInternal(((DisplayOrientationCallback) (null)));
		CLog.d("init finalized, waiting for setPreviewDisplay or setPreviewTexture");
		mReadyToSetPreviewDisplay = true;
		mVideoCaptureConsumer.onReadyToSetPreviewDisplay(mLastWidth, mLastHeight);
	//* 893 2004:astore          12
	//* 894 2006:goto            1232
	}

	private void stopCaptureInternal()
	{
		CLog.v("stopCaptureInternal");
	//    0    0:ldc2            #727 <String "stopCaptureInternal">
	//    1    3:invokestatic    #143 <Method void CLog.v(String)>
		if(!mCapturing)
	//*   2    6:aload_0         
	//*   3    7:getfield        #154 <Field boolean mCapturing>
	//*   4   10:ifne            20
		{
			CLog.w("Stop capture called, but camera was not capturing.");
	//    5   13:ldc2            #729 <String "Stop capture called, but camera was not capturing.">
	//    6   16:invokestatic    #344 <Method void CLog.w(String)>
			return;
	//    7   19:return          
		}
		mCamera.stopPreview();
	//    8   20:aload_0         
	//    9   21:getfield        #158 <Field Camera mCamera>
	//   10   24:invokevirtual   #496 <Method void Camera.stopPreview()>
		try
		{
			mCamera.cancelAutoFocus();
	//   11   27:aload_0         
	//   12   28:getfield        #158 <Field Camera mCamera>
	//   13   31:invokevirtual   #445 <Method void Camera.cancelAutoFocus()>
		}
	//*  14   34:goto            48
		catch(Exception exception)
	//*  15   37:astore_1        
		{
			CLog.w("Cancel autofocus failed");
	//   16   38:ldc2            #447 <String "Cancel autofocus failed">
	//   17   41:invokestatic    #344 <Method void CLog.w(String)>
			exception.printStackTrace();
	//   18   44:aload_1         
	//   19   45:invokevirtual   #450 <Method void Exception.printStackTrace()>
		}
		mCamera.setPreviewCallback(((android.hardware.Camera.PreviewCallback) (null)));
	//   20   48:aload_0         
	//   21   49:getfield        #158 <Field Camera mCamera>
	//   22   52:aconst_null     
	//   23   53:invokevirtual   #732 <Method void Camera.setPreviewCallback(android.hardware.Camera$PreviewCallback)>
		mCamera.setPreviewCallbackWithBuffer(((android.hardware.Camera.PreviewCallback) (null)));
	//   24   56:aload_0         
	//   25   57:getfield        #158 <Field Camera mCamera>
	//   26   60:aconst_null     
	//   27   61:invokevirtual   #505 <Method void Camera.setPreviewCallbackWithBuffer(android.hardware.Camera$PreviewCallback)>
		try
		{
			if(android.os.Build.VERSION.SDK_INT >= 11)
	//*  28   64:getstatic       #574 <Field int android.os.Build$VERSION.SDK_INT>
	//*  29   67:bipush          11
	//*  30   69:icmplt          88
				mCamera.setPreviewTexture(((SurfaceTexture) (null)));
	//   31   72:aload_0         
	//   32   73:getfield        #158 <Field Camera mCamera>
	//   33   76:aconst_null     
	//   34   77:invokevirtual   #560 <Method void Camera.setPreviewTexture(SurfaceTexture)>
		}
	//*  35   80:goto            88
		catch(IOException ioexception)
	//*  36   83:astore_1        
		{
			ioexception.printStackTrace();
	//   37   84:aload_1         
	//   38   85:invokevirtual   #733 <Method void IOException.printStackTrace()>
		}
		mCamera.release();
	//   39   88:aload_0         
	//   40   89:getfield        #158 <Field Camera mCamera>
	//   41   92:invokevirtual   #735 <Method void Camera.release()>
		mHandler.removeCallbacksAndMessages(((Object) (null)));
	//   42   95:aload_0         
	//   43   96:getfield        #412 <Field Handler mHandler>
	//   44   99:aconst_null     
	//   45  100:invokevirtual   #739 <Method void Handler.removeCallbacksAndMessages(Object)>
		mCamera = null;
	//   46  103:aload_0         
	//   47  104:aconst_null     
	//   48  105:putfield        #158 <Field Camera mCamera>
		mCapturing = false;
	//   49  108:aload_0         
	//   50  109:iconst_0        
	//   51  110:putfield        #154 <Field boolean mCapturing>
		mIsPreviewStarted = false;
	//   52  113:aload_0         
	//   53  114:iconst_0        
	//   54  115:putfield        #121 <Field boolean mIsPreviewStarted>
		CLog.i("Camera Stopped");
	//   55  118:ldc2            #741 <String "Camera Stopped">
	//   56  121:invokestatic    #365 <Method void CLog.i(String)>
		OnCameraClosedListener oncameraclosedlistener = mOnCameraClosedListener;
	//   57  124:aload_0         
	//   58  125:getfield        #743 <Field CameraThread$OnCameraClosedListener mOnCameraClosedListener>
	//   59  128:astore_1        
		if(oncameraclosedlistener != null)
	//*  60  129:aload_1         
	//*  61  130:ifnull          139
			oncameraclosedlistener.onCameraClosed();
	//   62  133:aload_1         
	//   63  134:invokeinterface #746 <Method void CameraThread$OnCameraClosedListener.onCameraClosed()>
	//   64  139:return          
	}

	private void takePictureInternal()
	{
		CLog.v("takePictureInternal");
	//    0    0:ldc2            #747 <String "takePictureInternal">
	//    1    3:invokestatic    #143 <Method void CLog.v(String)>
		if(mCamera == null)
	//*   2    6:aload_0         
	//*   3    7:getfield        #158 <Field Camera mCamera>
	//*   4   10:ifnonnull       42
		{
			CraftARError.ERROR_CODES error_codes = CraftARError.ERROR_CODES.ERROR_CAMERA_NOT_OPEN;
	//    5   13:getstatic       #753 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_CAMERA_NOT_OPEN>
	//    6   16:astore_1        
			CLog.e("TakePicture failed: Camera is not open");
	//    7   17:ldc2            #755 <String "TakePicture failed: Camera is not open">
	//    8   20:invokestatic    #458 <Method void CLog.e(String)>
			mVideoCaptureConsumer.takePictureFailed(new CraftARError(error_codes, "TakePicture failed: Camera is not open"));
	//    9   23:aload_0         
	//   10   24:getfield        #191 <Field VideoCaptureConsumerHub mVideoCaptureConsumer>
	//   11   27:new             #757 <Class CraftARError>
	//   12   30:dup             
	//   13   31:aload_1         
	//   14   32:ldc2            #755 <String "TakePicture failed: Camera is not open">
	//   15   35:invokespecial   #760 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   16   38:invokevirtual   #764 <Method void VideoCaptureConsumerHub.takePictureFailed(CraftARError)>
			return;
	//   17   41:return          
		}
		android.hardware.Camera.PictureCallback picturecallback = new android.hardware.Camera.PictureCallback() {

			public void onPictureTaken(byte abyte0[], Camera camera)
			{
				CLog.d("Picture taken callback!");
			//    0    0:ldc1            #24  <String "Picture taken callback!">
			//    1    2:invokestatic    #30  <Method void CLog.d(String)>
				android.hardware.Camera.Size size = camera.getParameters().getPictureSize();
			//    2    5:aload_2         
			//    3    6:invokevirtual   #36  <Method android.hardware.Camera$Parameters Camera.getParameters()>
			//    4    9:invokevirtual   #42  <Method android.hardware.Camera$Size android.hardware.Camera$Parameters.getPictureSize()>
			//    5   12:astore          4
				int i = camera.getParameters().getPictureFormat();
			//    6   14:aload_2         
			//    7   15:invokevirtual   #36  <Method android.hardware.Camera$Parameters Camera.getParameters()>
			//    8   18:invokevirtual   #46  <Method int android.hardware.Camera$Parameters.getPictureFormat()>
			//    9   21:istore_3        
				stopCaptureInternal();
			//   10   22:aload_0         
			//   11   23:getfield        #17  <Field CameraThread this$0>
			//   12   26:invokestatic    #49  <Method void CameraThread.access$300(CameraThread)>
				mVideoCaptureConsumer.onPictureTaken(abyte0, size.width, size.height, i);
			//   13   29:aload_0         
			//   14   30:getfield        #17  <Field CameraThread this$0>
			//   15   33:invokestatic    #53  <Method VideoCaptureConsumerHub CameraThread.access$1400(CameraThread)>
			//   16   36:aload_1         
			//   17   37:aload           4
			//   18   39:getfield        #59  <Field int android.hardware.Camera$Size.width>
			//   19   42:aload           4
			//   20   44:getfield        #62  <Field int android.hardware.Camera$Size.height>
			//   21   47:iload_3         
			//   22   48:invokevirtual   #67  <Method void VideoCaptureConsumerHub.onPictureTaken(byte[], int, int, int)>
			//   23   51:return          
			}

			final CameraThread this$0;

			
			{
				this$0 = CameraThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CameraThread this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   18   42:new             #16  <Class CameraThread$13>
	//   19   45:dup             
	//   20   46:aload_0         
	//   21   47:invokespecial   #765 <Method void CameraThread$13(CameraThread)>
	//   22   50:astore_1        
		try
		{
			mCamera.takePicture(((android.hardware.Camera.ShutterCallback) (null)), ((android.hardware.Camera.PictureCallback) (null)), picturecallback);
	//   23   51:aload_0         
	//   24   52:getfield        #158 <Field Camera mCamera>
	//   25   55:aconst_null     
	//   26   56:aconst_null     
	//   27   57:aload_1         
	//   28   58:invokevirtual   #769 <Method void Camera.takePicture(android.hardware.Camera$ShutterCallback, android.hardware.Camera$PictureCallback, android.hardware.Camera$PictureCallback)>
			return;
	//   29   61:return          
		}
		catch(Exception exception)
	//*  30   62:astore_1        
		{
			exception.printStackTrace();
	//   31   63:aload_1         
	//   32   64:invokevirtual   #450 <Method void Exception.printStackTrace()>
			mVideoCaptureConsumer.takePictureFailed(new CraftARError(CraftARError.ERROR_CODES.ERROR_TAKING_PICTURE, exception.getMessage()));
	//   33   67:aload_0         
	//   34   68:getfield        #191 <Field VideoCaptureConsumerHub mVideoCaptureConsumer>
	//   35   71:new             #757 <Class CraftARError>
	//   36   74:dup             
	//   37   75:getstatic       #772 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_TAKING_PICTURE>
	//   38   78:aload_1         
	//   39   79:invokevirtual   #455 <Method String Exception.getMessage()>
	//   40   82:invokespecial   #760 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   41   85:invokevirtual   #764 <Method void VideoCaptureConsumerHub.takePictureFailed(CraftARError)>
			return;
	//   42   88:return          
		}
	}

	private void triggerFocusInternal()
	{
		if(!mCapturing || mIsStopping)
	//*   0    0:aload_0         
	//*   1    1:getfield        #154 <Field boolean mCapturing>
	//*   2    4:ifeq            176
	//*   3    7:aload_0         
	//*   4    8:getfield        #209 <Field boolean mIsStopping>
	//*   5   11:ifeq            17
			break MISSING_BLOCK_LABEL_176;
	//    6   14:goto            176
		try
		{
			android.hardware.Camera.Parameters parameters = mCamera.getParameters();
	//    7   17:aload_0         
	//    8   18:getfield        #158 <Field Camera mCamera>
	//    9   21:invokevirtual   #397 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//   10   24:astore_1        
			if(parameters.getFocusMode() != "auto")
	//*  11   25:aload_1         
	//*  12   26:invokevirtual   #400 <Method String android.hardware.Camera$Parameters.getFocusMode()>
	//*  13   29:ldc2            #406 <String "auto">
	//*  14   32:if_acmpeq       62
			{
				parameters.setFocusMode("auto");
	//   15   35:aload_1         
	//   16   36:ldc2            #406 <String "auto">
	//   17   39:invokevirtual   #775 <Method void android.hardware.Camera$Parameters.setFocusMode(String)>
				mCamera.setParameters(parameters);
	//   18   42:aload_0         
	//   19   43:getfield        #158 <Field Camera mCamera>
	//   20   46:aload_1         
	//   21   47:invokevirtual   #586 <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
				mCamera.autoFocus(((android.hardware.Camera.AutoFocusCallback) (autoFocusCB)));
	//   22   50:aload_0         
	//   23   51:getfield        #158 <Field Camera mCamera>
	//   24   54:aload_0         
	//   25   55:getfield        #136 <Field CameraThread$AutoFocusCB autoFocusCB>
	//   26   58:invokevirtual   #428 <Method void Camera.autoFocus(android.hardware.Camera$AutoFocusCallback)>
				return;
	//   27   61:return          
			}
		}
	//*  28   62:aload_0         
	//*  29   63:getfield        #158 <Field Camera mCamera>
	//*  30   66:aload_0         
	//*  31   67:getfield        #136 <Field CameraThread$AutoFocusCB autoFocusCB>
	//*  32   70:invokevirtual   #428 <Method void Camera.autoFocus(android.hardware.Camera$AutoFocusCallback)>
	//*  33   73:return          
		catch(Exception exception)
	//*  34   74:astore_1        
		{
			try
			{
				android.hardware.Camera.Parameters parameters1 = mCamera.getParameters();
	//   35   75:aload_0         
	//   36   76:getfield        #158 <Field Camera mCamera>
	//   37   79:invokevirtual   #397 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//   38   82:astore_2        
				parameters1.setFocusMode(mRequestedFocusMode);
	//   39   83:aload_2         
	//   40   84:aload_0         
	//   41   85:getfield        #123 <Field String mRequestedFocusMode>
	//   42   88:invokevirtual   #775 <Method void android.hardware.Camera$Parameters.setFocusMode(String)>
				mCamera.setParameters(parameters1);
	//   43   91:aload_0         
	//   44   92:getfield        #158 <Field Camera mCamera>
	//   45   95:aload_2         
	//   46   96:invokevirtual   #586 <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
			}
	//*  47   99:goto            139
			catch(Exception exception1)
	//*  48  102:astore_2        
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   49  103:new             #279 <Class StringBuilder>
	//   50  106:dup             
	//   51  107:invokespecial   #280 <Method void StringBuilder()>
	//   52  110:astore_3        
				stringbuilder1.append("Double exception");
	//   53  111:aload_3         
	//   54  112:ldc2            #777 <String "Double exception">
	//   55  115:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   56  118:pop             
				stringbuilder1.append(exception1.getLocalizedMessage());
	//   57  119:aload_3         
	//   58  120:aload_2         
	//   59  121:invokevirtual   #715 <Method String Exception.getLocalizedMessage()>
	//   60  124:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   61  127:pop             
				CLog.e(stringbuilder1.toString());
	//   62  128:aload_3         
	//   63  129:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   64  132:invokestatic    #458 <Method void CLog.e(String)>
				exception1.printStackTrace();
	//   65  135:aload_2         
	//   66  136:invokevirtual   #450 <Method void Exception.printStackTrace()>
			}
			StringBuilder stringbuilder = new StringBuilder();
	//   67  139:new             #279 <Class StringBuilder>
	//   68  142:dup             
	//   69  143:invokespecial   #280 <Method void StringBuilder()>
	//   70  146:astore_2        
			stringbuilder.append("Error triggering focus");
	//   71  147:aload_2         
	//   72  148:ldc2            #779 <String "Error triggering focus">
	//   73  151:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   74  154:pop             
			stringbuilder.append(exception.getLocalizedMessage());
	//   75  155:aload_2         
	//   76  156:aload_1         
	//   77  157:invokevirtual   #715 <Method String Exception.getLocalizedMessage()>
	//   78  160:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   79  163:pop             
			CLog.e(stringbuilder.toString());
	//   80  164:aload_2         
	//   81  165:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   82  168:invokestatic    #458 <Method void CLog.e(String)>
			exception.printStackTrace();
	//   83  171:aload_1         
	//   84  172:invokevirtual   #450 <Method void Exception.printStackTrace()>
			return;
	//   85  175:return          
		}
		mCamera.autoFocus(((android.hardware.Camera.AutoFocusCallback) (autoFocusCB)));
		return;
		CLog.w("Camera focus can only be triggered when capture is running.");
	//   86  176:ldc2            #781 <String "Camera focus can only be triggered when capture is running.">
	//   87  179:invokestatic    #344 <Method void CLog.w(String)>
		return;
	//   88  182:return          
	}

	private void updateCameraParamsInternal(CameraParamsTask cameraparamstask)
	{
		CLog.v("updateCameraParamsInternal");
	//    0    0:ldc2            #782 <String "updateCameraParamsInternal">
	//    1    3:invokestatic    #143 <Method void CLog.v(String)>
		if(mCapturing && !mIsStopping)
	//*   2    6:aload_0         
	//*   3    7:getfield        #154 <Field boolean mCapturing>
	//*   4   10:ifeq            94
	//*   5   13:aload_0         
	//*   6   14:getfield        #209 <Field boolean mIsStopping>
	//*   7   17:ifeq            23
	//*   8   20:goto            94
		{
			try
			{
				android.hardware.Camera.Parameters parameters = mCamera.getParameters();
	//    9   23:aload_0         
	//   10   24:getfield        #158 <Field Camera mCamera>
	//   11   27:invokevirtual   #397 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//   12   30:astore_2        
				cameraparamstask.updateCameraParams(parameters);
	//   13   31:aload_1         
	//   14   32:aload_2         
	//   15   33:invokeinterface #785 <Method void CameraThread$CameraParamsTask.updateCameraParams(android.hardware.Camera$Parameters)>
				mRequestedFocusMode = parameters.getFocusMode();
	//   16   38:aload_0         
	//   17   39:aload_2         
	//   18   40:invokevirtual   #400 <Method String android.hardware.Camera$Parameters.getFocusMode()>
	//   19   43:putfield        #123 <Field String mRequestedFocusMode>
				mCamera.setParameters(parameters);
	//   20   46:aload_0         
	//   21   47:getfield        #158 <Field Camera mCamera>
	//   22   50:aload_2         
	//   23   51:invokevirtual   #586 <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
			}
	//*  24   54:goto            87
			catch(Exception exception)
	//*  25   57:astore_2        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   26   58:new             #279 <Class StringBuilder>
	//   27   61:dup             
	//   28   62:invokespecial   #280 <Method void StringBuilder()>
	//   29   65:astore_3        
				stringbuilder.append("Could not set params: ");
	//   30   66:aload_3         
	//   31   67:ldc2            #787 <String "Could not set params: ">
	//   32   70:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   33   73:pop             
				stringbuilder.append(((Object) (exception)));
	//   34   74:aload_3         
	//   35   75:aload_2         
	//   36   76:invokevirtual   #339 <Method StringBuilder StringBuilder.append(Object)>
	//   37   79:pop             
				CLog.e(stringbuilder.toString());
	//   38   80:aload_3         
	//   39   81:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   40   84:invokestatic    #458 <Method void CLog.e(String)>
			}
			cameraparamstask.onDone();
	//   41   87:aload_1         
	//   42   88:invokeinterface #790 <Method void CameraThread$CameraParamsTask.onDone()>
			return;
	//   43   93:return          
		} else
		{
			CLog.e("Camera params can only be set when capture is running.");
	//   44   94:ldc2            #792 <String "Camera params can only be set when capture is running.">
	//   45   97:invokestatic    #458 <Method void CLog.e(String)>
			return;
	//   46  100:return          
		}
	}

	void getCameraInstance()
	{
	//    0    0:return          
	}

	int getLastBufferSize()
	{
		return mLastBufferSize;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field int mLastBufferSize>
	//    2    4:ireturn         
	}

	public byte[] getLastFrame(byte abyte0[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_15;
	//    2    2:aload_1         
	//    3    3:ifnull          15
		mBufferPool.release(((Object) (abyte0)));
	//    4    6:aload_0         
	//    5    7:getfield        #113 <Field MySynchronizedPool mBufferPool>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #519 <Method boolean MySynchronizedPool.release(Object)>
	//    8   14:pop             
		abyte0 = mLastFrame;
	//    9   15:aload_0         
	//   10   16:getfield        #516 <Field byte[] mLastFrame>
	//   11   19:astore_1        
		mLastFrame = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #516 <Field byte[] mLastFrame>
		this;
	//   15   25:aload_0         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		return abyte0;
	//   17   27:aload_1         
	//   18   28:areturn         
		abyte0;
	//   19   29:astore_1        
	//*  20   30:aload_0         
		throw abyte0;
	//   21   31:monitorexit     
	//   22   32:aload_1         
	//   23   33:athrow          
	}

	int getLastHeight()
	{
		return mLastHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int mLastHeight>
	//    2    4:ireturn         
	}

	int getLastWidth()
	{
		return mLastWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field int mLastWidth>
	//    2    4:ireturn         
	}

	public boolean isCaptureRunning()
	{
		return mCapturing;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field boolean mCapturing>
	//    2    4:ireturn         
	}

	boolean isPreviewStarted()
	{
		return mIsPreviewStarted;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field boolean mIsPreviewStarted>
	//    2    4:ireturn         
	}

	boolean isReadyToSetPreviewDisplay()
	{
		return mReadyToSetPreviewDisplay;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field boolean mReadyToSetPreviewDisplay>
	//    2    4:ireturn         
	}

	public void onPreviewFrame(byte abyte0[], Camera camera)
	{
		abyte0 = setLastFrame(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #804 <Method byte[] setLastFrame(byte[])>
	//    3    5:astore_1        
		mCamera.addCallbackBuffer(abyte0);
	//    4    6:aload_0         
	//    5    7:getfield        #158 <Field Camera mCamera>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #703 <Method void Camera.addCallbackBuffer(byte[])>
	//    8   14:return          
	}

	public void run()
	{
		CLog.d("CameraThread run()");
	//    0    0:ldc2            #807 <String "CameraThread run()">
	//    1    3:invokestatic    #277 <Method void CLog.d(String)>
		Process.setThreadPriority(-1);
	//    2    6:iconst_m1       
	//    3    7:invokestatic    #812 <Method void Process.setThreadPriority(int)>
		super.run();
	//    4   10:aload_0         
	//    5   11:invokespecial   #814 <Method void MyHandlerThread.run()>
	//    6   14:return          
	}

	public void setAutoFocus(final boolean autofocus, final int focusPeriodMS)
	{
		CLog.v("setAutoFocus");
	//    0    0:ldc2            #816 <String "setAutoFocus">
	//    1    3:invokestatic    #143 <Method void CLog.v(String)>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #279 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #280 <Method void StringBuilder()>
	//    5   13:astore_3        
		stringbuilder.append("Build.MANUFACTURER: ");
	//    6   14:aload_3         
	//    7   15:ldc2            #818 <String "Build.MANUFACTURER: ">
	//    8   18:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		stringbuilder.append(Build.MANUFACTURER);
	//   10   22:aload_3         
	//   11   23:getstatic       #821 <Field String Build.MANUFACTURER>
	//   12   26:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
		stringbuilder.append(" , Build.MODEL:");
	//   14   30:aload_3         
	//   15   31:ldc2            #823 <String " , Build.MODEL:">
	//   16   34:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
		stringbuilder.append(Build.MODEL);
	//   18   38:aload_3         
	//   19   39:getstatic       #652 <Field String Build.MODEL>
	//   20   42:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
		CLog.i(stringbuilder.toString());
	//   22   46:aload_3         
	//   23   47:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   24   50:invokestatic    #365 <Method void CLog.i(String)>
		mHandler.post(new Runnable() {

			public void run()
			{
				CLog.d("run focusInternal");
			//    0    0:ldc1            #32  <String "run focusInternal">
			//    1    2:invokestatic    #38  <Method void CLog.d(String)>
				setAutofocusInternal(autofocus, focusPeriodMS);
			//    2    5:aload_0         
			//    3    6:getfield        #21  <Field CameraThread this$0>
			//    4    9:aload_0         
			//    5   10:getfield        #23  <Field boolean val$autofocus>
			//    6   13:aload_0         
			//    7   14:getfield        #25  <Field int val$focusPeriodMS>
			//    8   17:invokestatic    #41  <Method void CameraThread.access$600(CameraThread, boolean, int)>
			//    9   20:return          
			}

			final CameraThread this$0;
			final boolean val$autofocus;
			final int val$focusPeriodMS;

			
			{
				this$0 = CameraThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CameraThread this$0>
				autofocus = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field boolean val$autofocus>
				focusPeriodMS = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int val$focusPeriodMS>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   25   53:aload_0         
	//   26   54:getfield        #412 <Field Handler mHandler>
	//   27   57:new             #26  <Class CameraThread$5>
	//   28   60:dup             
	//   29   61:aload_0         
	//   30   62:iload_1         
	//   31   63:iload_2         
	//   32   64:invokespecial   #824 <Method void CameraThread$5(CameraThread, boolean, int)>
	//   33   67:invokevirtual   #424 <Method boolean Handler.post(Runnable)>
	//   34   70:pop             
	//   35   71:return          
	}

	public void setCameraDisplayOrientation(final DisplayOrientationCallback callback)
	{
		CLog.v("setCameraDisplayOrientation");
	//    0    0:ldc2            #826 <String "setCameraDisplayOrientation">
	//    1    3:invokestatic    #143 <Method void CLog.v(String)>
		mHandler.post(new Runnable() {

			public void run()
			{
				setCameraDisplayOrientationInternal(callback);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CameraThread this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field CameraThread$DisplayOrientationCallback val$callback>
			//    4    8:invokestatic    #29  <Method void CameraThread.access$1200(CameraThread, CameraThread$DisplayOrientationCallback)>
			//    5   11:return          
			}

			final CameraThread this$0;
			final DisplayOrientationCallback val$callback;

			
			{
				this$0 = CameraThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CameraThread this$0>
				callback = displayorientationcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CameraThread$DisplayOrientationCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    2    6:aload_0         
	//    3    7:getfield        #412 <Field Handler mHandler>
	//    4   10:new             #12  <Class CameraThread$11>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokespecial   #828 <Method void CameraThread$11(CameraThread, CameraThread$DisplayOrientationCallback)>
	//    9   19:invokevirtual   #424 <Method boolean Handler.post(Runnable)>
	//   10   22:pop             
	//   11   23:return          
	}

	void setOnCameraClosedListener(OnCameraClosedListener oncameraclosedlistener)
	{
		mOnCameraClosedListener = oncameraclosedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #743 <Field CameraThread$OnCameraClosedListener mOnCameraClosedListener>
	//    3    5:return          
	}

	public void setPreviewCallbackWithBuffer(final android.hardware.Camera.PreviewCallback previewCallback)
	{
		CLog.v("setPreviewCallbackWithBuffer");
	//    0    0:ldc2            #831 <String "setPreviewCallbackWithBuffer">
	//    1    3:invokestatic    #143 <Method void CLog.v(String)>
		mHandler.post(new Runnable() {

			public void run()
			{
				setPreviewCallbackWithBufferInternal(previewCallback);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CameraThread this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field android.hardware.Camera$PreviewCallback val$previewCallback>
			//    4    8:invokestatic    #29  <Method void CameraThread.access$1100(CameraThread, android.hardware.Camera$PreviewCallback)>
			//    5   11:return          
			}

			final CameraThread this$0;
			final android.hardware.Camera.PreviewCallback val$previewCallback;

			
			{
				this$0 = CameraThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CameraThread this$0>
				previewCallback = previewcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field android.hardware.Camera$PreviewCallback val$previewCallback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    2    6:aload_0         
	//    3    7:getfield        #412 <Field Handler mHandler>
	//    4   10:new             #10  <Class CameraThread$10>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokespecial   #833 <Method void CameraThread$10(CameraThread, android.hardware.Camera$PreviewCallback)>
	//    9   19:invokevirtual   #424 <Method boolean Handler.post(Runnable)>
	//   10   22:pop             
	//   11   23:return          
	}

	public void setPreviewDisplay(final SurfaceHolder holder)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #279 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #280 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("setPreviewDisplay with holder: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #835 <String "setPreviewDisplay with holder: ">
	//    6   12:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(((Object) (holder)));
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #339 <Method StringBuilder StringBuilder.append(Object)>
	//   11   21:pop             
		CLog.v(stringbuilder.toString());
	//   12   22:aload_2         
	//   13   23:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   14   26:invokestatic    #143 <Method void CLog.v(String)>
		mHandler.post(new Runnable() {

			public void run()
			{
				setPreviewDisplayInternal(holder);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CameraThread this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field SurfaceHolder val$holder>
			//    4    8:invokestatic    #29  <Method void CameraThread.access$900(CameraThread, SurfaceHolder)>
			//    5   11:return          
			}

			final CameraThread this$0;
			final SurfaceHolder val$holder;

			
			{
				this$0 = CameraThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CameraThread this$0>
				holder = surfaceholder;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field SurfaceHolder val$holder>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   15   29:aload_0         
	//   16   30:getfield        #412 <Field Handler mHandler>
	//   17   33:new             #32  <Class CameraThread$8>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokespecial   #837 <Method void CameraThread$8(CameraThread, SurfaceHolder)>
	//   22   42:invokevirtual   #424 <Method boolean Handler.post(Runnable)>
	//   23   45:pop             
	//   24   46:return          
	}

	public void setPreviewTexture(final int texID)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #279 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #280 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("setPreviewTexture with texID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #839 <String "setPreviewTexture with texID: ">
	//    6   12:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(texID);
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:invokevirtual   #289 <Method StringBuilder StringBuilder.append(int)>
	//   11   21:pop             
		CLog.v(stringbuilder.toString());
	//   12   22:aload_2         
	//   13   23:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   14   26:invokestatic    #143 <Method void CLog.v(String)>
		mHandler.post(new Runnable() {

			public void run()
			{
				setPreviewTextureInternal(texID);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CameraThread this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int val$texID>
			//    4    8:invokestatic    #29  <Method void CameraThread.access$1000(CameraThread, int)>
			//    5   11:return          
			}

			final CameraThread this$0;
			final int val$texID;

			
			{
				this$0 = CameraThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CameraThread this$0>
				texID = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int val$texID>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   15   29:aload_0         
	//   16   30:getfield        #412 <Field Handler mHandler>
	//   17   33:new             #34  <Class CameraThread$9>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:invokespecial   #840 <Method void CameraThread$9(CameraThread, int)>
	//   22   42:invokevirtual   #424 <Method boolean Handler.post(Runnable)>
	//   23   45:pop             
	//   24   46:return          
	}

	void setVideoCaptureConsumer(VideoCaptureConsumerHub videocaptureconsumerhub)
	{
		mVideoCaptureConsumer = videocaptureconsumerhub;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #191 <Field VideoCaptureConsumerHub mVideoCaptureConsumer>
	//    3    5:return          
	}

	public void start()
	{
		CLog.d("CameraThread start()");
	//    0    0:ldc2            #845 <String "CameraThread start()">
	//    1    3:invokestatic    #277 <Method void CLog.d(String)>
		super.start();
	//    2    6:aload_0         
	//    3    7:invokespecial   #847 <Method void MyHandlerThread.start()>
	//    4   10:return          
	}

	public void startCapturing(Object obj)
	{
		startCapturing(obj, -1, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:iconst_m1       
	//    4    4:invokevirtual   #851 <Method void startCapturing(Object, int, int)>
	//    5    7:return          
	}

	public void startCapturing(Object obj, final int width, final int height)
	{
		if(!mIsStopping)
			break MISSING_BLOCK_LABEL_44;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field boolean mIsStopping>
	//    2    4:ifeq            44
_L1:
		if(!mIsStopping)
			break MISSING_BLOCK_LABEL_44;
	//    3    7:aload_0         
	//    4    8:getfield        #209 <Field boolean mIsStopping>
	//    5   11:ifeq            44
		CLog.d("isStopping, wait!");
	//    6   14:ldc2            #855 <String "isStopping, wait!">
	//    7   17:invokestatic    #277 <Method void CLog.d(String)>
		this;
	//    8   20:aload_0         
		JVM INSTR monitorenter ;
	//    9   21:monitorenter    
		((Object)this).wait(50L);
	//   10   22:aload_0         
	//   11   23:ldc2w           #856 <Long 50L>
	//   12   26:invokevirtual   #863 <Method void Object.wait(long)>
		this;
	//   13   29:aload_0         
		JVM INSTR monitorexit ;
	//   14   30:monitorexit     
		  goto _L1
	//*  15   31:goto            7
		obj;
	//   16   34:astore_1        
		this;
	//   17   35:aload_0         
		JVM INSTR monitorexit ;
	//   18   36:monitorexit     
		try
		{
			throw obj;
	//   19   37:aload_1         
	//   20   38:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  21   39:astore_1        
		{
			((InterruptedException) (obj)).printStackTrace();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #864 <Method void InterruptedException.printStackTrace()>
		}
		if(isCaptureRunning())
	//*  24   44:aload_0         
	//*  25   45:invokevirtual   #866 <Method boolean isCaptureRunning()>
	//*  26   48:ifeq            58
		{
			CLog.v("Already capturing!");
	//   27   51:ldc2            #868 <String "Already capturing!">
	//   28   54:invokestatic    #143 <Method void CLog.v(String)>
			return;
	//   29   57:return          
		}
		if(mIsStarting)
	//*  30   58:aload_0         
	//*  31   59:getfield        #201 <Field boolean mIsStarting>
	//*  32   62:ifeq            72
		{
			CLog.v("Previous startCapturing not yet completed!");
	//   33   65:ldc2            #870 <String "Previous startCapturing not yet completed!">
	//   34   68:invokestatic    #143 <Method void CLog.v(String)>
			return;
	//   35   71:return          
		}
		obj = ((Object) (new Runnable() {

			public void run()
			{
				CLog.d("OPENING CAMERA!!!!");
			//    0    0:ldc1            #26  <String "OPENING CAMERA!!!!">
			//    1    2:invokestatic    #32  <Method void CLog.d(String)>
				try
				{
					mCamera = Camera.open();
			//    2    5:aload_0         
			//    3    6:getfield        #17  <Field CameraThread this$0>
			//    4    9:invokestatic    #38  <Method Camera Camera.open()>
			//    5   12:invokestatic    #42  <Method Camera CameraThread.access$002(CameraThread, Camera)>
			//    6   15:pop             
				}
			//*   7   16:goto            24
				catch(Exception exception)
			//*   8   19:astore_1        
				{
					exception.printStackTrace();
			//    9   20:aload_1         
			//   10   21:invokevirtual   #45  <Method void Exception.printStackTrace()>
				}
				mOpeningCamera = false;
			//   11   24:aload_0         
			//   12   25:getfield        #17  <Field CameraThread this$0>
			//   13   28:iconst_0        
			//   14   29:putfield        #49  <Field boolean CameraThread.mOpeningCamera>
			//   15   32:return          
			}

			final CameraThread this$0;

			
			{
				this$0 = CameraThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CameraThread this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
));
	//   36   72:new             #8   <Class CameraThread$1>
	//   37   75:dup             
	//   38   76:aload_0         
	//   39   77:invokespecial   #871 <Method void CameraThread$1(CameraThread)>
	//   40   80:astore_1        
		mOpeningCamera = true;
	//   41   81:aload_0         
	//   42   82:iconst_1        
	//   43   83:putfield        #125 <Field boolean mOpeningCamera>
		mIsStarting = true;
	//   44   86:aload_0         
	//   45   87:iconst_1        
	//   46   88:putfield        #201 <Field boolean mIsStarting>
		mHandler.post(((Runnable) (obj)));
	//   47   91:aload_0         
	//   48   92:getfield        #412 <Field Handler mHandler>
	//   49   95:aload_1         
	//   50   96:invokevirtual   #424 <Method boolean Handler.post(Runnable)>
	//   51   99:pop             
		for(long l = System.currentTimeMillis(); mCamera == null && mOpeningCamera && System.currentTimeMillis() - l <= 5000L;)
	//*  52  100:invokestatic    #877 <Method long System.currentTimeMillis()>
	//*  53  103:lstore          4
	//*  54  105:aload_0         
	//*  55  106:getfield        #158 <Field Camera mCamera>
	//*  56  109:ifnonnull       163
	//*  57  112:aload_0         
	//*  58  113:getfield        #125 <Field boolean mOpeningCamera>
	//*  59  116:ifne            122
	//*  60  119:goto            163
	//*  61  122:invokestatic    #877 <Method long System.currentTimeMillis()>
	//*  62  125:lload           4
	//*  63  127:lsub            
	//*  64  128:ldc2w           #878 <Long 5000L>
	//*  65  131:lcmp            
	//*  66  132:ifle            138
	//*  67  135:goto            163
			try
			{
				CLog.d("Waiting for camera.open to complete....");
	//   68  138:ldc2            #881 <String "Waiting for camera.open to complete....">
	//   69  141:invokestatic    #277 <Method void CLog.d(String)>
				Thread.sleep(100L);
	//   70  144:ldc2w           #882 <Long 100L>
	//   71  147:invokestatic    #888 <Method void Thread.sleep(long)>
			}
	//*  72  150:goto            105
			catch(InterruptedException interruptedexception)
	//*  73  153:astore          6
			{
				interruptedexception.printStackTrace();
	//   74  155:aload           6
	//   75  157:invokevirtual   #864 <Method void InterruptedException.printStackTrace()>
			}

	//*  76  160:goto            105
		if(!mOpeningCamera)
	//*  77  163:aload_0         
	//*  78  164:getfield        #125 <Field boolean mOpeningCamera>
	//*  79  167:ifne            215
		{
			if(mCamera != null)
	//*  80  170:aload_0         
	//*  81  171:getfield        #158 <Field Camera mCamera>
	//*  82  174:ifnull          202
			{
				CLog.d("posting startCaptureInternal");
	//   83  177:ldc2            #890 <String "posting startCaptureInternal">
	//   84  180:invokestatic    #277 <Method void CLog.d(String)>
				mHandler.post(new Runnable() {

					public void run()
					{
						CLog.d("running startCaptureInternal");
					//    0    0:ldc1            #31  <String "running startCaptureInternal">
					//    1    2:invokestatic    #37  <Method void CLog.d(String)>
						startCaptureInternal(width, height);
					//    2    5:aload_0         
					//    3    6:getfield        #20  <Field CameraThread this$0>
					//    4    9:aload_0         
					//    5   10:getfield        #22  <Field int val$width>
					//    6   13:aload_0         
					//    7   14:getfield        #24  <Field int val$height>
					//    8   17:invokestatic    #40  <Method void CameraThread.access$100(CameraThread, int, int)>
						mIsStarting = false;
					//    9   20:aload_0         
					//   10   21:getfield        #20  <Field CameraThread this$0>
					//   11   24:iconst_0        
					//   12   25:invokestatic    #44  <Method boolean CameraThread.access$202(CameraThread, boolean)>
					//   13   28:pop             
					//   14   29:return          
					}

					final CameraThread this$0;
					final int val$height;
					final int val$width;

			
			{
				this$0 = CameraThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CameraThread this$0>
				width = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int val$width>
				height = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #24  <Field int val$height>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
				}
);
	//   85  183:aload_0         
	//   86  184:getfield        #412 <Field Handler mHandler>
	//   87  187:new             #20  <Class CameraThread$2>
	//   88  190:dup             
	//   89  191:aload_0         
	//   90  192:iload_2         
	//   91  193:iload_3         
	//   92  194:invokespecial   #892 <Method void CameraThread$2(CameraThread, int, int)>
	//   93  197:invokevirtual   #424 <Method boolean Handler.post(Runnable)>
	//   94  200:pop             
				return;
	//   95  201:return          
			} else
			{
				mVideoCaptureConsumer.onCameraOpenFailed();
	//   96  202:aload_0         
	//   97  203:getfield        #191 <Field VideoCaptureConsumerHub mVideoCaptureConsumer>
	//   98  206:invokevirtual   #569 <Method void VideoCaptureConsumerHub.onCameraOpenFailed()>
				mIsStarting = false;
	//   99  209:aload_0         
	//  100  210:iconst_0        
	//  101  211:putfield        #201 <Field boolean mIsStarting>
				return;
	//  102  214:return          
			}
		} else
		{
			mHandler.removeCallbacks(((Runnable) (obj)));
	//  103  215:aload_0         
	//  104  216:getfield        #412 <Field Handler mHandler>
	//  105  219:aload_1         
	//  106  220:invokevirtual   #418 <Method void Handler.removeCallbacks(Runnable)>
			mOpeningCamera = false;
	//  107  223:aload_0         
	//  108  224:iconst_0        
	//  109  225:putfield        #125 <Field boolean mOpeningCamera>
			mIsStarting = false;
	//  110  228:aload_0         
	//  111  229:iconst_0        
	//  112  230:putfield        #201 <Field boolean mIsStarting>
			mVideoCaptureConsumer.onCameraOpenStuck();
	//  113  233:aload_0         
	//  114  234:getfield        #191 <Field VideoCaptureConsumerHub mVideoCaptureConsumer>
	//  115  237:invokevirtual   #895 <Method void VideoCaptureConsumerHub.onCameraOpenStuck()>
			return;
	//  116  240:return          
		}
	}

	public void stopCapturing()
	{
		CLog.v("stopCapturing()");
	//    0    0:ldc2            #898 <String "stopCapturing()">
	//    1    3:invokestatic    #143 <Method void CLog.v(String)>
		if(mIsStopping)
	//*   2    6:aload_0         
	//*   3    7:getfield        #209 <Field boolean mIsStopping>
	//*   4   10:ifeq            20
		{
			CLog.v("Already stopping");
	//    5   13:ldc2            #900 <String "Already stopping">
	//    6   16:invokestatic    #143 <Method void CLog.v(String)>
			return;
	//    7   19:return          
		} else
		{
			mIsStopping = true;
	//    8   20:aload_0         
	//    9   21:iconst_1        
	//   10   22:putfield        #209 <Field boolean mIsStopping>
			mHandler.post(new Runnable() {

				public void run()
				{
					stopCaptureInternal();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field CameraThread this$0>
				//    2    4:invokestatic    #24  <Method void CameraThread.access$300(CameraThread)>
					mIsStopping = false;
				//    3    7:aload_0         
				//    4    8:getfield        #17  <Field CameraThread this$0>
				//    5   11:iconst_0        
				//    6   12:invokestatic    #28  <Method boolean CameraThread.access$402(CameraThread, boolean)>
				//    7   15:pop             
				//    8   16:return          
				}

				final CameraThread this$0;

			
			{
				this$0 = CameraThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CameraThread this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   11   25:aload_0         
	//   12   26:getfield        #412 <Field Handler mHandler>
	//   13   29:new             #22  <Class CameraThread$3>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:invokespecial   #901 <Method void CameraThread$3(CameraThread)>
	//   17   37:invokevirtual   #424 <Method boolean Handler.post(Runnable)>
	//   18   40:pop             
			return;
	//   19   41:return          
		}
	}

	public void takePicture()
	{
		CLog.v("takePicture()");
	//    0    0:ldc2            #903 <String "takePicture()">
	//    1    3:invokestatic    #143 <Method void CLog.v(String)>
		mHandler.post(new Runnable() {

			public void run()
			{
				takePictureInternal();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CameraThread this$0>
			//    2    4:invokestatic    #24  <Method void CameraThread.access$500(CameraThread)>
			//    3    7:return          
			}

			final CameraThread this$0;

			
			{
				this$0 = CameraThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CameraThread this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    2    6:aload_0         
	//    3    7:getfield        #412 <Field Handler mHandler>
	//    4   10:new             #24  <Class CameraThread$4>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #904 <Method void CameraThread$4(CameraThread)>
	//    8   18:invokevirtual   #424 <Method boolean Handler.post(Runnable)>
	//    9   21:pop             
	//   10   22:return          
	}

	public void triggerFocus()
	{
		CLog.v("triggerFocus");
	//    0    0:ldc2            #906 <String "triggerFocus">
	//    1    3:invokestatic    #143 <Method void CLog.v(String)>
		mHandler.post(new Runnable() {

			public void run()
			{
				triggerFocusInternal();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CameraThread this$0>
			//    2    4:invokestatic    #24  <Method void CameraThread.access$700(CameraThread)>
			//    3    7:return          
			}

			final CameraThread this$0;

			
			{
				this$0 = CameraThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CameraThread this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    2    6:aload_0         
	//    3    7:getfield        #412 <Field Handler mHandler>
	//    4   10:new             #28  <Class CameraThread$6>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #907 <Method void CameraThread$6(CameraThread)>
	//    8   18:invokevirtual   #424 <Method boolean Handler.post(Runnable)>
	//    9   21:pop             
	//   10   22:return          
	}

	public void updateCameraParams(final CameraParamsTask task)
	{
		CLog.v("updateCameraParams");
	//    0    0:ldc2            #908 <String "updateCameraParams">
	//    1    3:invokestatic    #143 <Method void CLog.v(String)>
		mUserPresetParamsTask = task;
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:putfield        #187 <Field CameraThread$CameraParamsTask mUserPresetParamsTask>
		mHandler.post(new Runnable() {

			public void run()
			{
				updateCameraParamsInternal(task);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CameraThread this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field CameraThread$CameraParamsTask val$task>
			//    4    8:invokestatic    #29  <Method void CameraThread.access$800(CameraThread, CameraThread$CameraParamsTask)>
			//    5   11:return          
			}

			final CameraThread this$0;
			final CameraParamsTask val$task;

			
			{
				this$0 = CameraThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CameraThread this$0>
				task = cameraparamstask;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CameraThread$CameraParamsTask val$task>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    5   11:aload_0         
	//    6   12:getfield        #412 <Field Handler mHandler>
	//    7   15:new             #30  <Class CameraThread$7>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #910 <Method void CameraThread$7(CameraThread, CameraThread$CameraParamsTask)>
	//   12   24:invokevirtual   #424 <Method boolean Handler.post(Runnable)>
	//   13   27:pop             
	//   14   28:return          
	}

	private static final int CAMERA_OPEN_TIMEOUT = 5000;
	private static final int MAX_POOL_SIZE = 5;
	private static final int POOL_DEFAULT_SIZE = 3;
	static CameraThread self;
	private AutoFocusCB autoFocusCB;
	private int countFocusing;
	long framesLastSec;
	long lastComputedTimestamp;
	private AutoFocusPeriodicTask mAutoFocusPeriodicTask;
	MySynchronizedPool mBufferPool;
	private Camera mCamera;
	private SurfaceTexture mCameraTexture;
	private boolean mCapturing;
	private Context mContext;
	private boolean mIsPreviewStarted;
	private boolean mIsStarting;
	private boolean mIsStopping;
	private int mLastBufferSize;
	byte mLastFrame[];
	private int mLastHeight;
	private int mLastWidth;
	OnCameraClosedListener mOnCameraClosedListener;
	boolean mOpeningCamera;
	boolean mReadyToSetPreviewDisplay;
	private String mRequestedFocusMode;
	private int mTexID;
	private CameraParamsTask mUserPresetParamsTask;
	private VideoCaptureConsumerHub mVideoCaptureConsumer;


/*
	static Camera access$000(CameraThread camerathread)
	{
		return camerathread.mCamera;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field Camera mCamera>
	//    2    4:areturn         
	}

*/


/*
	static Camera access$002(CameraThread camerathread, Camera camera)
	{
		camerathread.mCamera = camera;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #158 <Field Camera mCamera>
		return camera;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static void access$100(CameraThread camerathread, int i, int j)
	{
		camerathread.startCaptureInternal(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #166 <Method void startCaptureInternal(int, int)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$1000(CameraThread camerathread, int i)
	{
		camerathread.setPreviewTextureInternal(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #171 <Method void setPreviewTextureInternal(int)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$1100(CameraThread camerathread, android.hardware.Camera.PreviewCallback previewcallback)
	{
		camerathread.setPreviewCallbackWithBufferInternal(previewcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #177 <Method void setPreviewCallbackWithBufferInternal(android.hardware.Camera$PreviewCallback)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$1200(CameraThread camerathread, DisplayOrientationCallback displayorientationcallback)
	{
		camerathread.setCameraDisplayOrientationInternal(displayorientationcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #183 <Method void setCameraDisplayOrientationInternal(CameraThread$DisplayOrientationCallback)>
		return;
	//    3    5:return          
	}

*/


/*
	static CameraParamsTask access$1300(CameraThread camerathread)
	{
		return camerathread.mUserPresetParamsTask;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field CameraThread$CameraParamsTask mUserPresetParamsTask>
	//    2    4:areturn         
	}

*/


/*
	static VideoCaptureConsumerHub access$1400(CameraThread camerathread)
	{
		return camerathread.mVideoCaptureConsumer;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field VideoCaptureConsumerHub mVideoCaptureConsumer>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$1500(CameraThread camerathread)
	{
		return camerathread.mCapturing;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field boolean mCapturing>
	//    2    4:ireturn         
	}

*/


/*
	static AutoFocusCB access$1600(CameraThread camerathread)
	{
		return camerathread.autoFocusCB;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field CameraThread$AutoFocusCB autoFocusCB>
	//    2    4:areturn         
	}

*/


/*
	static String access$1800(CameraThread camerathread)
	{
		return camerathread.mRequestedFocusMode;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field String mRequestedFocusMode>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$202(CameraThread camerathread, boolean flag)
	{
		camerathread.mIsStarting = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #201 <Field boolean mIsStarting>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$300(CameraThread camerathread)
	{
		camerathread.stopCaptureInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void stopCaptureInternal()>
		return;
	//    2    4:return          
	}

*/


/*
	static boolean access$400(CameraThread camerathread)
	{
		return camerathread.mIsStopping;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field boolean mIsStopping>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$402(CameraThread camerathread, boolean flag)
	{
		camerathread.mIsStopping = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #209 <Field boolean mIsStopping>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$500(CameraThread camerathread)
	{
		camerathread.takePictureInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #214 <Method void takePictureInternal()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$600(CameraThread camerathread, boolean flag, int i)
	{
		camerathread.setAutofocusInternal(flag, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #220 <Method void setAutofocusInternal(boolean, int)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$700(CameraThread camerathread)
	{
		camerathread.triggerFocusInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #224 <Method void triggerFocusInternal()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$800(CameraThread camerathread, CameraParamsTask cameraparamstask)
	{
		camerathread.updateCameraParamsInternal(cameraparamstask);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #230 <Method void updateCameraParamsInternal(CameraThread$CameraParamsTask)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$900(CameraThread camerathread, SurfaceHolder surfaceholder)
	{
		camerathread.setPreviewDisplayInternal(surfaceholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #236 <Method void setPreviewDisplayInternal(SurfaceHolder)>
		return;
	//    3    5:return          
	}

*/
}
