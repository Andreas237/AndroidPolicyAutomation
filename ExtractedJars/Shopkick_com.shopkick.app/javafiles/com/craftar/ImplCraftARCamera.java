// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.craftar:
//			CraftARCamera, AppEventListener, CameraThread, CLog, 
//			CraftARError, ConfCamera, UtilsImage, CraftARQueryImage, 
//			NV21, VideoCaptureConsumerHub

class ImplCraftARCamera extends CraftARCamera
	implements VideoCaptureConsumerHub.NV21VideoCaptureConsumer, VideoCaptureConsumerHub.TakePictureConsumer, AppEventListener
{

	ImplCraftARCamera(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void CraftARCamera()>
		mFocusOnTouch = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #41  <Field boolean mFocusOnTouch>
		mSupportsFocus = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #43  <Field boolean mSupportsFocus>
		mCameraThread = CameraThread.Instance(context);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokestatic    #49  <Method CameraThread CameraThread.Instance(Context)>
	//   11   19:putfield        #51  <Field CameraThread mCameraThread>
		CLog.v("Creating craftar camera");
	//   12   22:ldc1            #53  <String "Creating craftar camera">
	//   13   24:invokestatic    #59  <Method void CLog.v(String)>
		mContext = context;
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:putfield        #61  <Field Context mContext>
		if(Build.DEVICE.contains("glass"))
	//*  17   32:getstatic       #67  <Field String Build.DEVICE>
	//*  18   35:ldc1            #69  <String "glass">
	//*  19   37:invokevirtual   #75  <Method boolean String.contains(CharSequence)>
	//*  20   40:ifeq            48
			mSupportsFocus = false;
	//   21   43:aload_0         
	//   22   44:iconst_0        
	//   23   45:putfield        #43  <Field boolean mSupportsFocus>
	//   24   48:return          
	}

	private void propagateError(CraftARError craftarerror)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #92  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("Error (");
	//    4    8:aload_2         
	//    5    9:ldc1            #95  <String "Error (">
	//    6   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(((Object) (craftarerror.getErrorCode())));
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #105 <Method CraftARError$ERROR_CODES CraftARError.getErrorCode()>
	//   11   20:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		((StringBuilder) (obj)).append(") ");
	//   13   24:aload_2         
	//   14   25:ldc1            #110 <String ") ">
	//   15   27:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		((StringBuilder) (obj)).append(craftarerror.getErrorMessage());
	//   17   31:aload_2         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #114 <Method String CraftARError.getErrorMessage()>
	//   20   36:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		CLog.e(((StringBuilder) (obj)).toString());
	//   22   40:aload_2         
	//   23   41:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   24   44:invokestatic    #120 <Method void CLog.e(String)>
		obj = ((Object) (mCameraCallbacksHandler));
	//   25   47:aload_0         
	//   26   48:getfield        #122 <Field CraftARCamera$CraftARCameraCallbacks mCameraCallbacksHandler>
	//   27   51:astore_2        
		if(obj != null)
	//*  28   52:aload_2         
	//*  29   53:ifnull          63
			((CraftARCamera.CraftARCameraCallbacks) (obj)).onTakePictureFailed(craftarerror);
	//   30   56:aload_2         
	//   31   57:aload_1         
	//   32   58:invokeinterface #127 <Method void CraftARCamera$CraftARCameraCallbacks.onTakePictureFailed(CraftARError)>
	//   33   63:return          
	}

	private void setCraftARCameraParams()
	{
		CameraThread camerathread = mCameraThread;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field CameraThread mCameraThread>
	//    2    4:astore_1        
		if(camerathread == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       15
		{
			CLog.e("Error getting camera");
	//    5    9:ldc1            #130 <String "Error getting camera">
	//    6   11:invokestatic    #120 <Method void CLog.e(String)>
			return;
	//    7   14:return          
		} else
		{
			camerathread.updateCameraParams(new CameraThread.CameraParamsTask() {

				public void onDone()
				{
					if(mSupportsFocus && !requestedFocus[0].equals("continuous-picture") && !requestedFocus[0].equals("continuous-video"))
				//*   0    0:aload_0         
				//*   1    1:getfield        #19  <Field ImplCraftARCamera this$0>
				//*   2    4:invokestatic    #29  <Method boolean ImplCraftARCamera.access$200(ImplCraftARCamera)>
				//*   3    7:ifeq            64
				//*   4   10:aload_0         
				//*   5   11:getfield        #21  <Field String[] val$requestedFocus>
				//*   6   14:iconst_0        
				//*   7   15:aaload          
				//*   8   16:ldc1            #31  <String "continuous-picture">
				//*   9   18:invokevirtual   #37  <Method boolean String.equals(Object)>
				//*  10   21:ifne            64
				//*  11   24:aload_0         
				//*  12   25:getfield        #21  <Field String[] val$requestedFocus>
				//*  13   28:iconst_0        
				//*  14   29:aaload          
				//*  15   30:ldc1            #39  <String "continuous-video">
				//*  16   32:invokevirtual   #37  <Method boolean String.equals(Object)>
				//*  17   35:ifne            64
					{
						CLog.d("startFocusing");
				//   18   38:ldc1            #41  <String "startFocusing">
				//   19   40:invokestatic    #47  <Method void CLog.d(String)>
						mCameraThread.setAutoFocus(true, 3000);
				//   20   43:aload_0         
				//   21   44:getfield        #19  <Field ImplCraftARCamera this$0>
				//   22   47:invokestatic    #51  <Method CameraThread ImplCraftARCamera.access$300(ImplCraftARCamera)>
				//   23   50:iconst_1        
				//   24   51:sipush          3000
				//   25   54:invokevirtual   #57  <Method void CameraThread.setAutoFocus(boolean, int)>
						triggerAutoFocus();
				//   26   57:aload_0         
				//   27   58:getfield        #19  <Field ImplCraftARCamera this$0>
				//   28   61:invokevirtual   #60  <Method void ImplCraftARCamera.triggerAutoFocus()>
					}
				//   29   64:return          
				}

				public void updateCameraParams(android.hardware.Camera.Parameters parameters)
				{
					if(mSupportedFlashModes == null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #19  <Field ImplCraftARCamera this$0>
				//*   2    4:getfield        #68  <Field List ImplCraftARCamera.mSupportedFlashModes>
				//*   3    7:ifnonnull       21
						mSupportedFlashModes = parameters.getSupportedFlashModes();
				//    4   10:aload_0         
				//    5   11:getfield        #19  <Field ImplCraftARCamera this$0>
				//    6   14:aload_1         
				//    7   15:invokevirtual   #74  <Method List android.hardware.Camera$Parameters.getSupportedFlashModes()>
				//    8   18:putfield        #68  <Field List ImplCraftARCamera.mSupportedFlashModes>
					mSupportedPictureSizes = parameters.getSupportedPictureSizes();
				//    9   21:aload_0         
				//   10   22:getfield        #19  <Field ImplCraftARCamera this$0>
				//   11   25:aload_1         
				//   12   26:invokevirtual   #77  <Method List android.hardware.Camera$Parameters.getSupportedPictureSizes()>
				//   13   29:invokestatic    #81  <Method List ImplCraftARCamera.access$002(ImplCraftARCamera, List)>
				//   14   32:pop             
					android.hardware.Camera.Size size = (android.hardware.Camera.Size)mSupportedPictureSizes.get(0);
				//   15   33:aload_0         
				//   16   34:getfield        #19  <Field ImplCraftARCamera this$0>
				//   17   37:invokestatic    #85  <Method List ImplCraftARCamera.access$000(ImplCraftARCamera)>
				//   18   40:iconst_0        
				//   19   41:invokeinterface #91  <Method Object List.get(int)>
				//   20   46:checkcast       #93  <Class android.hardware.Camera$Size>
				//   21   49:astore_3        
					Iterator iterator = mSupportedPictureSizes.iterator();
				//   22   50:aload_0         
				//   23   51:getfield        #19  <Field ImplCraftARCamera this$0>
				//   24   54:invokestatic    #85  <Method List ImplCraftARCamera.access$000(ImplCraftARCamera)>
				//   25   57:invokeinterface #97  <Method Iterator List.iterator()>
				//   26   62:astore          5
					android.hardware.Camera.Size size1;
					do
					{
						size1 = size;
				//   27   64:aload_3         
				//   28   65:astore          4
						if(!iterator.hasNext())
							break;
				//   29   67:aload           5
				//   30   69:invokeinterface #103 <Method boolean Iterator.hasNext()>
				//   31   74:ifeq            126
						size1 = (android.hardware.Camera.Size)iterator.next();
				//   32   77:aload           5
				//   33   79:invokeinterface #107 <Method Object Iterator.next()>
				//   34   84:checkcast       #93  <Class android.hardware.Camera$Size>
				//   35   87:astore          4
						if(size1.width == 320)
				//*  36   89:aload           4
				//*  37   91:getfield        #111 <Field int android.hardware.Camera$Size.width>
				//*  38   94:sipush          320
				//*  39   97:icmpne          103
							break;
				//   40  100:goto            126
						if(size1.width < 320)
				//*  41  103:aload           4
				//*  42  105:getfield        #111 <Field int android.hardware.Camera$Size.width>
				//*  43  108:sipush          320
				//*  44  111:icmpge          120
						{
							size1 = size;
				//   45  114:aload_3         
				//   46  115:astore          4
							break;
				//   47  117:goto            126
						}
						size = size1;
				//   48  120:aload           4
				//   49  122:astore_3        
					} while(true);
				//   50  123:goto            64
					if(size1.width == 320)
				//*  51  126:aload           4
				//*  52  128:getfield        #111 <Field int android.hardware.Camera$Size.width>
				//*  53  131:sipush          320
				//*  54  134:icmpne          146
						parameters.setJpegQuality(75);
				//   55  137:aload_1         
				//   56  138:bipush          75
				//   57  140:invokevirtual   #115 <Method void android.hardware.Camera$Parameters.setJpegQuality(int)>
					else
				//*  58  143:goto            152
						parameters.setJpegQuality(95);
				//   59  146:aload_1         
				//   60  147:bipush          95
				//   61  149:invokevirtual   #115 <Method void android.hardware.Camera$Parameters.setJpegQuality(int)>
					parameters.setPictureSize(size1.width, size1.height);
				//   62  152:aload_1         
				//   63  153:aload           4
				//   64  155:getfield        #111 <Field int android.hardware.Camera$Size.width>
				//   65  158:aload           4
				//   66  160:getfield        #118 <Field int android.hardware.Camera$Size.height>
				//   67  163:invokevirtual   #122 <Method void android.hardware.Camera$Parameters.setPictureSize(int, int)>
					if(Build.MODEL.matches("Nexus 5"))
				//*  68  166:getstatic       #128 <Field String Build.MODEL>
				//*  69  169:ldc1            #130 <String "Nexus 5">
				//*  70  171:invokevirtual   #134 <Method boolean String.matches(String)>
				//*  71  174:ifeq            183
					{
						CLog.d("Ignoring set autofocus mode for this model.");
				//   72  177:ldc1            #136 <String "Ignoring set autofocus mode for this model.">
				//   73  179:invokestatic    #47  <Method void CLog.d(String)>
						return;
				//   74  182:return          
					}
					if(Build.MANUFACTURER.matches("LGE") && (Build.MODEL.matches("Nexus 5X") || Build.MODEL.matches("Nexus 6P")))
				//*  75  183:getstatic       #139 <Field String Build.MANUFACTURER>
				//*  76  186:ldc1            #141 <String "LGE">
				//*  77  188:invokevirtual   #134 <Method boolean String.matches(String)>
				//*  78  191:ifeq            253
				//*  79  194:getstatic       #128 <Field String Build.MODEL>
				//*  80  197:ldc1            #143 <String "Nexus 5X">
				//*  81  199:invokevirtual   #134 <Method boolean String.matches(String)>
				//*  82  202:ifne            216
				//*  83  205:getstatic       #128 <Field String Build.MODEL>
				//*  84  208:ldc1            #145 <String "Nexus 6P">
				//*  85  210:invokevirtual   #134 <Method boolean String.matches(String)>
				//*  86  213:ifeq            253
					{
						StringBuilder stringbuilder = new StringBuilder();
				//   87  216:new             #147 <Class StringBuilder>
				//   88  219:dup             
				//   89  220:invokespecial   #148 <Method void StringBuilder()>
				//   90  223:astore_3        
						stringbuilder.append("Using FOCUS_MODE_AUTO for ");
				//   91  224:aload_3         
				//   92  225:ldc1            #150 <String "Using FOCUS_MODE_AUTO for ">
				//   93  227:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
				//   94  230:pop             
						stringbuilder.append(Build.MODEL);
				//   95  231:aload_3         
				//   96  232:getstatic       #128 <Field String Build.MODEL>
				//   97  235:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
				//   98  238:pop             
						CLog.d(stringbuilder.toString());
				//   99  239:aload_3         
				//  100  240:invokevirtual   #158 <Method String StringBuilder.toString()>
				//  101  243:invokestatic    #47  <Method void CLog.d(String)>
						parameters.setFocusMode("auto");
				//  102  246:aload_1         
				//  103  247:ldc1            #160 <String "auto">
				//  104  249:invokevirtual   #163 <Method void android.hardware.Camera$Parameters.setFocusMode(String)>
						return;
				//  105  252:return          
					}
					parameters.setFocusMode("fixed");
				//  106  253:aload_1         
				//  107  254:ldc1            #165 <String "fixed">
				//  108  256:invokevirtual   #163 <Method void android.hardware.Camera$Parameters.setFocusMode(String)>
					if(mContext.getPackageManager().hasSystemFeature("android.hardware.camera.autofocus"))
				//* 109  259:aload_0         
				//* 110  260:getfield        #19  <Field ImplCraftARCamera this$0>
				//* 111  263:invokestatic    #169 <Method Context ImplCraftARCamera.access$100(ImplCraftARCamera)>
				//* 112  266:invokevirtual   #175 <Method PackageManager Context.getPackageManager()>
				//* 113  269:ldc1            #177 <String "android.hardware.camera.autofocus">
				//* 114  271:invokevirtual   #182 <Method boolean PackageManager.hasSystemFeature(String)>
				//* 115  274:ifeq            386
					{
						List list = parameters.getSupportedFocusModes();
				//  116  277:aload_1         
				//  117  278:invokevirtual   #185 <Method List android.hardware.Camera$Parameters.getSupportedFocusModes()>
				//  118  281:astore          5
						Object obj1 = null;
				//  119  283:aconst_null     
				//  120  284:astore          4
						int i = 0;
				//  121  286:iconst_0        
				//  122  287:istore_2        
						Object obj;
						do
						{
							obj = ((Object) (obj1));
				//  123  288:aload           4
				//  124  290:astore_3        
							if(i >= ConfCamera.autoFocusModes.length)
								break;
				//  125  291:iload_2         
				//  126  292:getstatic       #190 <Field String[] ConfCamera.autoFocusModes>
				//  127  295:arraylength     
				//  128  296:icmpge          330
							if(list.contains(((Object) (ConfCamera.autoFocusModes[i]))))
				//* 129  299:aload           5
				//* 130  301:getstatic       #190 <Field String[] ConfCamera.autoFocusModes>
				//* 131  304:iload_2         
				//* 132  305:aaload          
				//* 133  306:invokeinterface #193 <Method boolean List.contains(Object)>
				//* 134  311:ifeq            323
							{
								obj = ((Object) (ConfCamera.autoFocusModes[i]));
				//  135  314:getstatic       #190 <Field String[] ConfCamera.autoFocusModes>
				//  136  317:iload_2         
				//  137  318:aaload          
				//  138  319:astore_3        
								break;
				//  139  320:goto            330
							}
							i++;
				//  140  323:iload_2         
				//  141  324:iconst_1        
				//  142  325:iadd            
				//  143  326:istore_2        
						} while(true);
				//  144  327:goto            288
						if(obj != null)
				//* 145  330:aload_3         
				//* 146  331:ifnull          386
						{
							try
							{
								parameters.setFocusMode(((String) (obj)));
				//  147  334:aload_1         
				//  148  335:aload_3         
				//  149  336:invokevirtual   #163 <Method void android.hardware.Camera$Parameters.setFocusMode(String)>
								requestedFocus[0] = parameters.getFocusMode();
				//  150  339:aload_0         
				//  151  340:getfield        #21  <Field String[] val$requestedFocus>
				//  152  343:iconst_0        
				//  153  344:aload_1         
				//  154  345:invokevirtual   #196 <Method String android.hardware.Camera$Parameters.getFocusMode()>
				//  155  348:aastore         
								return;
				//  156  349:return          
							}
							// Misplaced declaration of an exception variable
							catch(android.hardware.Camera.Parameters parameters)
				//* 157  350:astore_1        
							{
								obj = ((Object) (new StringBuilder()));
				//  158  351:new             #147 <Class StringBuilder>
				//  159  354:dup             
				//  160  355:invokespecial   #148 <Method void StringBuilder()>
				//  161  358:astore_3        
							}
							((StringBuilder) (obj)).append("Exception ocurred changing focus mode:");
				//  162  359:aload_3         
				//  163  360:ldc1            #198 <String "Exception ocurred changing focus mode:">
				//  164  362:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
				//  165  365:pop             
							((StringBuilder) (obj)).append(((Exception) (parameters)).getMessage());
				//  166  366:aload_3         
				//  167  367:aload_1         
				//  168  368:invokevirtual   #201 <Method String Exception.getMessage()>
				//  169  371:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
				//  170  374:pop             
							CLog.e(((StringBuilder) (obj)).toString());
				//  171  375:aload_3         
				//  172  376:invokevirtual   #158 <Method String StringBuilder.toString()>
				//  173  379:invokestatic    #204 <Method void CLog.e(String)>
							((Exception) (parameters)).printStackTrace();
				//  174  382:aload_1         
				//  175  383:invokevirtual   #207 <Method void Exception.printStackTrace()>
						}
					}
				//  176  386:return          
				}

				final ImplCraftARCamera this$0;
				final String val$requestedFocus[];

			
			{
				this$0 = ImplCraftARCamera.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ImplCraftARCamera this$0>
				requestedFocus = as;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String[] val$requestedFocus>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   15:aload_1         
	//    9   16:new             #12  <Class ImplCraftARCamera$1>
	//   10   19:dup             
	//   11   20:aload_0         
	//   12   21:iconst_1        
	//   13   22:anewarray       String[]
	//   14   25:dup             
	//   15   26:iconst_0        
	//   16   27:ldc1            #132 <String "">
	//   17   29:aastore         
	//   18   30:invokespecial   #135 <Method void ImplCraftARCamera$1(ImplCraftARCamera, String[])>
	//   19   33:invokevirtual   #139 <Method void CameraThread.updateCameraParams(CameraThread$CameraParamsTask)>
			return;
	//   20   36:return          
		}
	}

	boolean focusesOnTouch()
	{
		return mFocusOnTouch;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field boolean mFocusOnTouch>
	//    2    4:ireturn         
	}

	public CraftARCamera.CraftARCameraCallbacks getCameraHandler()
	{
		return mCameraCallbacksHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field CraftARCamera$CraftARCameraCallbacks mCameraCallbacksHandler>
	//    2    4:areturn         
	}

	public List getSupportedFlashModes()
	{
		return mSupportedFlashModes;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field List mSupportedFlashModes>
	//    2    4:areturn         
	}

	public List getSupportedPictureSizes()
	{
		return mSupportedPictureSizes;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field List mSupportedPictureSizes>
	//    2    4:areturn         
	}

	public void onAppFinish()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #92  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("onAppFinish in ");
	//    4    8:aload_1         
	//    5    9:ldc1            #154 <String "onAppFinish in ">
	//    6   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (this)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   11   20:pop             
		CLog.d(stringbuilder.toString());
	//   12   21:aload_1         
	//   13   22:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   14   25:invokestatic    #157 <Method void CLog.d(String)>
	//   15   28:return          
	}

	public void onAppPause()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #92  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("onAppPause in ImplCraftARCamera : ");
	//    4    8:aload_1         
	//    5    9:ldc1            #160 <String "onAppPause in ImplCraftARCamera : ">
	//    6   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (this)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   11   20:pop             
		CLog.d(stringbuilder.toString());
	//   12   21:aload_1         
	//   13   22:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   14   25:invokestatic    #157 <Method void CLog.d(String)>
		if(!mIsCameraFrozen)
	//*  15   28:aload_0         
	//*  16   29:getfield        #162 <Field boolean mIsCameraFrozen>
	//*  17   32:ifne            86
		{
			CameraThread camerathread = mCameraThread;
	//   18   35:aload_0         
	//   19   36:getfield        #51  <Field CameraThread mCameraThread>
	//   20   39:astore_1        
			if(camerathread != null && camerathread.isAlive())
	//*  21   40:aload_1         
	//*  22   41:ifnull          86
	//*  23   44:aload_1         
	//*  24   45:invokevirtual   #165 <Method boolean CameraThread.isAlive()>
	//*  25   48:ifeq            86
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   26   51:new             #92  <Class StringBuilder>
	//   27   54:dup             
	//   28   55:invokespecial   #93  <Method void StringBuilder()>
	//   29   58:astore_1        
				stringbuilder1.append("stopCapturing in ImplCraftARCamera : ");
	//   30   59:aload_1         
	//   31   60:ldc1            #167 <String "stopCapturing in ImplCraftARCamera : ">
	//   32   62:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
				stringbuilder1.append(((Object) (this)));
	//   34   66:aload_1         
	//   35   67:aload_0         
	//   36   68:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   37   71:pop             
				CLog.d(stringbuilder1.toString());
	//   38   72:aload_1         
	//   39   73:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   40   76:invokestatic    #157 <Method void CLog.d(String)>
				mCameraThread.stopCapturing();
	//   41   79:aload_0         
	//   42   80:getfield        #51  <Field CameraThread mCameraThread>
	//   43   83:invokevirtual   #170 <Method void CameraThread.stopCapturing()>
			}
		}
	//   44   86:return          
	}

	public void onAppResume()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #92  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("onAppResume in ImplCraftARCamera : ");
	//    4    8:aload_1         
	//    5    9:ldc1            #173 <String "onAppResume in ImplCraftARCamera : ">
	//    6   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (this)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   11   20:pop             
		CLog.d(stringbuilder.toString());
	//   12   21:aload_1         
	//   13   22:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   14   25:invokestatic    #157 <Method void CLog.d(String)>
		if(!mIsCameraFrozen)
	//*  15   28:aload_0         
	//*  16   29:getfield        #162 <Field boolean mIsCameraFrozen>
	//*  17   32:ifne            87
		{
			CameraThread camerathread = mCameraThread;
	//   18   35:aload_0         
	//   19   36:getfield        #51  <Field CameraThread mCameraThread>
	//   20   39:astore_1        
			if(camerathread != null && camerathread.isAlive())
	//*  21   40:aload_1         
	//*  22   41:ifnull          87
	//*  23   44:aload_1         
	//*  24   45:invokevirtual   #165 <Method boolean CameraThread.isAlive()>
	//*  25   48:ifeq            87
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   26   51:new             #92  <Class StringBuilder>
	//   27   54:dup             
	//   28   55:invokespecial   #93  <Method void StringBuilder()>
	//   29   58:astore_1        
				stringbuilder1.append("startCapturing in ImplCraftARCamera : ");
	//   30   59:aload_1         
	//   31   60:ldc1            #175 <String "startCapturing in ImplCraftARCamera : ">
	//   32   62:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
				stringbuilder1.append(((Object) (this)));
	//   34   66:aload_1         
	//   35   67:aload_0         
	//   36   68:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   37   71:pop             
				CLog.d(stringbuilder1.toString());
	//   38   72:aload_1         
	//   39   73:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   40   76:invokestatic    #157 <Method void CLog.d(String)>
				mCameraThread.startCapturing(((Object) (this)));
	//   41   79:aload_0         
	//   42   80:getfield        #51  <Field CameraThread mCameraThread>
	//   43   83:aload_0         
	//   44   84:invokevirtual   #179 <Method void CameraThread.startCapturing(Object)>
			}
		}
	//   45   87:return          
	}

	public void onCameraOpenFailed()
	{
	//    0    0:return          
	}

	public void onPictureTaken(byte abyte0[], int i, int j, int k)
	{
		if(k != 256)
	//*   0    0:iload           4
	//*   1    2:sipush          256
	//*   2    5:icmpeq          25
		{
			propagateError(new CraftARError(CraftARError.ERROR_CODES.ERROR_UNKNOWN, "Camera picture format not supported"));
	//    3    8:aload_0         
	//    4    9:new             #101 <Class CraftARError>
	//    5   12:dup             
	//    6   13:getstatic       #190 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_UNKNOWN>
	//    7   16:ldc1            #192 <String "Camera picture format not supported">
	//    8   18:invokespecial   #195 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//    9   21:invokespecial   #197 <Method void propagateError(CraftARError)>
			return;
	//   10   24:return          
		}
		j = Math.min(i, j);
	//   11   25:iload_2         
	//   12   26:iload_3         
	//   13   27:invokestatic    #203 <Method int Math.min(int, int)>
	//   14   30:istore_3        
		i = 0;
	//   15   31:iconst_0        
	//   16   32:istore_2        
		if(j != 240)
			break MISSING_BLOCK_LABEL_136;
	//   17   33:iload_3         
	//   18   34:sipush          240
	//   19   37:icmpne          136
		if(ConfCamera.removeExifData)
	//*  20   40:getstatic       #208 <Field boolean ConfCamera.removeExifData>
	//*  21   43:ifeq            57
		{
			abyte0 = ((byte []) (UtilsImage.Instance().removeEXIFfromJpegByteArray(abyte0)));
	//   22   46:invokestatic    #213 <Method UtilsImage UtilsImage.Instance()>
	//   23   49:aload_1         
	//   24   50:invokevirtual   #217 <Method ByteArrayOutputStream UtilsImage.removeEXIFfromJpegByteArray(byte[])>
	//   25   53:astore_1        
			break MISSING_BLOCK_LABEL_107;
	//   26   54:goto            107
		}
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//   27   57:new             #219 <Class ByteArrayOutputStream>
	//   28   60:dup             
	//   29   61:invokespecial   #220 <Method void ByteArrayOutputStream()>
	//   30   64:astore          5
		do
		{
			j = i + 1024;
	//   31   66:iload_2         
	//   32   67:sipush          1024
	//   33   70:iadd            
	//   34   71:istore_3        
			try
			{
				if(j >= abyte0.length)
					break;
	//   35   72:iload_3         
	//   36   73:aload_1         
	//   37   74:arraylength     
	//   38   75:icmpge          93
				bytearrayoutputstream.write(abyte0, i, 1024);
	//   39   78:aload           5
	//   40   80:aload_1         
	//   41   81:iload_2         
	//   42   82:sipush          1024
	//   43   85:invokevirtual   #224 <Method void ByteArrayOutputStream.write(byte[], int, int)>
			}
	//*  44   88:iload_3         
	//*  45   89:istore_2        
	//*  46   90:goto            66
	//*  47   93:aload           5
	//*  48   95:aload_1         
	//*  49   96:iload_2         
	//*  50   97:aload_1         
	//*  51   98:arraylength     
	//*  52   99:iload_2         
	//*  53  100:isub            
	//*  54  101:invokevirtual   #224 <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//*  55  104:aload           5
	//*  56  106:astore_1        
	//*  57  107:new             #226 <Class CraftARQueryImage>
	//*  58  110:dup             
	//*  59  111:aload_1         
	//*  60  112:invokespecial   #229 <Method void CraftARQueryImage(ByteArrayOutputStream)>
	//*  61  115:astore_1        
	//*  62  116:goto            151
	//*  63  119:aload_0         
	//*  64  120:new             #101 <Class CraftARError>
	//*  65  123:dup             
	//*  66  124:getstatic       #190 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_UNKNOWN>
	//*  67  127:ldc1            #231 <String "Error returning the image">
	//*  68  129:invokespecial   #195 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//*  69  132:invokespecial   #197 <Method void propagateError(CraftARError)>
	//*  70  135:return          
	//*  71  136:new             #226 <Class CraftARQueryImage>
	//*  72  139:dup             
	//*  73  140:aload_1         
	//*  74  141:iconst_0        
	//*  75  142:aload_1         
	//*  76  143:arraylength     
	//*  77  144:invokestatic    #237 <Method android.graphics.Bitmap BitmapFactory.decodeByteArray(byte[], int, int)>
	//*  78  147:invokespecial   #240 <Method void CraftARQueryImage(android.graphics.Bitmap)>
	//*  79  150:astore_1        
	//*  80  151:aload_0         
	//*  81  152:getfield        #122 <Field CraftARCamera$CraftARCameraCallbacks mCameraCallbacksHandler>
	//*  82  155:astore          5
	//*  83  157:aload           5
	//*  84  159:ifnull          171
	//*  85  162:aload           5
	//*  86  164:aload_1         
	//*  87  165:invokeinterface #243 <Method void CraftARCamera$CraftARCameraCallbacks.onPictureTaken(CraftARQueryImage)>
	//*  88  170:return          
	//*  89  171:ldc1            #245 <String "OnPictureTaken: No CallbacksHandler set!!">
	//*  90  173:invokestatic    #248 <Method void CLog.w(String)>
	//*  91  176:return          
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
			{
				propagateError(new CraftARError(CraftARError.ERROR_CODES.ERROR_UNKNOWN, "Error returning the image"));
				return;
			}
			i = j;
		} while(true);
		bytearrayoutputstream.write(abyte0, i, abyte0.length - i);
		abyte0 = ((byte []) (bytearrayoutputstream));
		abyte0 = ((byte []) (new CraftARQueryImage(((ByteArrayOutputStream) (abyte0)))));
		break MISSING_BLOCK_LABEL_151;
		abyte0 = ((byte []) (new CraftARQueryImage(BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length))));
		CraftARCamera.CraftARCameraCallbacks craftarcameracallbacks = mCameraCallbacksHandler;
		if(craftarcameracallbacks != null)
		{
			craftarcameracallbacks.onPictureTaken(((CraftARQueryImage) (abyte0)));
			return;
		} else
		{
			CLog.w("OnPictureTaken: No CallbacksHandler set!!");
			return;
		}
	//*  92  177:astore_1        
	//*  93  178:goto            119
	}

	public void onPreviewNV21Frame(byte abyte0[])
	{
		if(mCameraCallbacksHandler != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #122 <Field CraftARCamera$CraftARCameraCallbacks mCameraCallbacksHandler>
	//*   2    4:ifnull          42
		{
			abyte0 = ((byte []) (new CraftARQueryImage(new NV21(abyte0, mFrameWidth, mFrameHeight))));
	//    3    7:new             #226 <Class CraftARQueryImage>
	//    4   10:dup             
	//    5   11:new             #252 <Class NV21>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #254 <Field int mFrameWidth>
	//   10   20:aload_0         
	//   11   21:getfield        #256 <Field int mFrameHeight>
	//   12   24:invokespecial   #258 <Method void NV21(byte[], int, int)>
	//   13   27:invokespecial   #261 <Method void CraftARQueryImage(NV21)>
	//   14   30:astore_1        
			mCameraCallbacksHandler.onPreviewFrame(((CraftARQueryImage) (abyte0)));
	//   15   31:aload_0         
	//   16   32:getfield        #122 <Field CraftARCamera$CraftARCameraCallbacks mCameraCallbacksHandler>
	//   17   35:aload_1         
	//   18   36:invokeinterface #264 <Method void CraftARCamera$CraftARCameraCallbacks.onPreviewFrame(CraftARQueryImage)>
			return;
	//   19   41:return          
		} else
		{
			CLog.v("No CallbacksHandler set!!");
	//   20   42:ldc2            #266 <String "No CallbacksHandler set!!">
	//   21   45:invokestatic    #59  <Method void CLog.v(String)>
			return;
	//   22   48:return          
		}
	}

	public void onPreviewStarted(int i, int j, int k)
	{
		mFrameWidth = j;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #254 <Field int mFrameWidth>
		mFrameHeight = k;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:putfield        #256 <Field int mFrameHeight>
	//    6   10:return          
	}

	public void onReadyToSetPreviewDisplay(int i, int j)
	{
	//    0    0:return          
	}

	public void restartCapture()
	{
		CLog.d("restartCapture");
	//    0    0:ldc2            #272 <String "restartCapture">
	//    1    3:invokestatic    #157 <Method void CLog.d(String)>
		CameraThread camerathread = mCameraThread;
	//    2    6:aload_0         
	//    3    7:getfield        #51  <Field CameraThread mCameraThread>
	//    4   10:astore_1        
		if(camerathread == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       33
		{
			propagateError(new CraftARError(CraftARError.ERROR_CODES.ERROR_UNKNOWN, "restartCameraPreview() failed. CameraThread not initialized yet."));
	//    7   15:aload_0         
	//    8   16:new             #101 <Class CraftARError>
	//    9   19:dup             
	//   10   20:getstatic       #190 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_UNKNOWN>
	//   11   23:ldc2            #274 <String "restartCameraPreview() failed. CameraThread not initialized yet.">
	//   12   26:invokespecial   #195 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   13   29:invokespecial   #197 <Method void propagateError(CraftARError)>
			return;
	//   14   32:return          
		}
		camerathread.stopCapturing();
	//   15   33:aload_1         
	//   16   34:invokevirtual   #170 <Method void CameraThread.stopCapturing()>
		mCameraThread.startCapturing(((Object) (this)));
	//   17   37:aload_0         
	//   18   38:getfield        #51  <Field CameraThread mCameraThread>
	//   19   41:aload_0         
	//   20   42:invokevirtual   #179 <Method void CameraThread.startCapturing(Object)>
		if(Build.MANUFACTURER.matches("Google") && Build.MODEL.matches("Glass 1"))
	//*  21   45:getstatic       #277 <Field String Build.MANUFACTURER>
	//*  22   48:ldc2            #279 <String "Google">
	//*  23   51:invokevirtual   #283 <Method boolean String.matches(String)>
	//*  24   54:ifeq            84
	//*  25   57:getstatic       #286 <Field String Build.MODEL>
	//*  26   60:ldc2            #288 <String "Glass 1">
	//*  27   63:invokevirtual   #283 <Method boolean String.matches(String)>
	//*  28   66:ifeq            84
		{
			mCameraThread.stopCapturing();
	//   29   69:aload_0         
	//   30   70:getfield        #51  <Field CameraThread mCameraThread>
	//   31   73:invokevirtual   #170 <Method void CameraThread.stopCapturing()>
			mCameraThread.startCapturing(((Object) (this)));
	//   32   76:aload_0         
	//   33   77:getfield        #51  <Field CameraThread mCameraThread>
	//   34   80:aload_0         
	//   35   81:invokevirtual   #179 <Method void CameraThread.startCapturing(Object)>
		}
		mIsCameraFrozen = false;
	//   36   84:aload_0         
	//   37   85:iconst_0        
	//   38   86:putfield        #162 <Field boolean mIsCameraFrozen>
		setCraftARCameraParams();
	//   39   89:aload_0         
	//   40   90:invokespecial   #290 <Method void setCraftARCameraParams()>
	//   41   93:return          
	}

	public void setAutoFocusOnTouch(boolean flag)
	{
		mFocusOnTouch = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field boolean mFocusOnTouch>
	//    3    5:return          
	}

	public void setCameraHandler(CraftARCamera.CraftARCameraCallbacks craftarcameracallbacks)
	{
		mCameraCallbacksHandler = craftarcameracallbacks;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #122 <Field CraftARCamera$CraftARCameraCallbacks mCameraCallbacksHandler>
	//    3    5:return          
	}

	public boolean setFlashMode(final String mode)
	{
		boolean flag;
label0:
		{
			if(!mContext.getPackageManager().hasSystemFeature("android.hardware.camera.flash"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field Context mContext>
	//*   2    4:invokevirtual   #301 <Method PackageManager Context.getPackageManager()>
	//*   3    7:ldc2            #303 <String "android.hardware.camera.flash">
	//*   4   10:invokevirtual   #308 <Method boolean PackageManager.hasSystemFeature(String)>
	//*   5   13:ifne            18
				return false;
	//    6   16:iconst_0        
	//    7   17:ireturn         
			Object obj = ((Object) (mSupportedFlashModes));
	//    8   18:aload_0         
	//    9   19:getfield        #147 <Field List mSupportedFlashModes>
	//   10   22:astore_3        
			if(obj == null)
	//*  11   23:aload_3         
	//*  12   24:ifnonnull       35
			{
				CLog.e("Camera not yet initialized");
	//   13   27:ldc2            #310 <String "Camera not yet initialized">
	//   14   30:invokestatic    #120 <Method void CLog.e(String)>
				return false;
	//   15   33:iconst_0        
	//   16   34:ireturn         
			}
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  17   35:aload_3         
	//*  18   36:invokeinterface #316 <Method Iterator List.iterator()>
	//*  19   41:astore_3        
	//*  20   42:aload_3         
	//*  21   43:invokeinterface #321 <Method boolean Iterator.hasNext()>
	//*  22   48:ifeq            72
				if(((String)((Iterator) (obj)).next()).matches(mode))
	//*  23   51:aload_3         
	//*  24   52:invokeinterface #325 <Method Object Iterator.next()>
	//*  25   57:checkcast       #71  <Class String>
	//*  26   60:aload_1         
	//*  27   61:invokevirtual   #283 <Method boolean String.matches(String)>
	//*  28   64:ifeq            42
				{
					flag = true;
	//   29   67:iconst_1        
	//   30   68:istore_2        
					break label0;
	//   31   69:goto            74
				}

			flag = false;
	//   32   72:iconst_0        
	//   33   73:istore_2        
		}
		if(!flag)
	//*  34   74:iload_2         
	//*  35   75:ifne            86
		{
			CLog.e("Invalid flash mode. Check the available flash modes using getSupportedFlashModes()");
	//   36   78:ldc2            #327 <String "Invalid flash mode. Check the available flash modes using getSupportedFlashModes()">
	//   37   81:invokestatic    #120 <Method void CLog.e(String)>
			return false;
	//   38   84:iconst_0        
	//   39   85:ireturn         
		} else
		{
			mCameraThread.updateCameraParams(new CameraThread.CameraParamsTask() {

				public void onDone()
				{
				//    0    0:return          
				}

				public void updateCameraParams(android.hardware.Camera.Parameters parameters)
				{
					parameters.setFlashMode(mode);
				//    0    0:aload_1         
				//    1    1:aload_0         
				//    2    2:getfield        #21  <Field String val$mode>
				//    3    5:invokevirtual   #33  <Method void android.hardware.Camera$Parameters.setFlashMode(String)>
				//    4    8:return          
				}

				final ImplCraftARCamera this$0;
				final String val$mode;

			
			{
				this$0 = ImplCraftARCamera.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ImplCraftARCamera this$0>
				mode = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$mode>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   40   86:aload_0         
	//   41   87:getfield        #51  <Field CameraThread mCameraThread>
	//   42   90:new             #16  <Class ImplCraftARCamera$3>
	//   43   93:dup             
	//   44   94:aload_0         
	//   45   95:aload_1         
	//   46   96:invokespecial   #330 <Method void ImplCraftARCamera$3(ImplCraftARCamera, String)>
	//   47   99:invokevirtual   #139 <Method void CameraThread.updateCameraParams(CameraThread$CameraParamsTask)>
			return true;
	//   48  102:iconst_1        
	//   49  103:ireturn         
		}
	}

	public void setPictureSize(final android.hardware.Camera.Size cameraSize)
	{
		mCameraThread.updateCameraParams(new CameraThread.CameraParamsTask() {

			public void onDone()
			{
			//    0    0:return          
			}

			public void updateCameraParams(android.hardware.Camera.Parameters parameters)
			{
				if(cameraSize.width == 320)
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field android.hardware.Camera$Size val$cameraSize>
			//*   2    4:getfield        #34  <Field int android.hardware.Camera$Size.width>
			//*   3    7:sipush          320
			//*   4   10:icmpne          22
					parameters.setJpegQuality(75);
			//    5   13:aload_1         
			//    6   14:bipush          75
			//    7   16:invokevirtual   #40  <Method void android.hardware.Camera$Parameters.setJpegQuality(int)>
				else
			//*   8   19:goto            28
					parameters.setJpegQuality(95);
			//    9   22:aload_1         
			//   10   23:bipush          95
			//   11   25:invokevirtual   #40  <Method void android.hardware.Camera$Parameters.setJpegQuality(int)>
				parameters.setPictureSize(cameraSize.width, cameraSize.height);
			//   12   28:aload_1         
			//   13   29:aload_0         
			//   14   30:getfield        #21  <Field android.hardware.Camera$Size val$cameraSize>
			//   15   33:getfield        #34  <Field int android.hardware.Camera$Size.width>
			//   16   36:aload_0         
			//   17   37:getfield        #21  <Field android.hardware.Camera$Size val$cameraSize>
			//   18   40:getfield        #43  <Field int android.hardware.Camera$Size.height>
			//   19   43:invokevirtual   #46  <Method void android.hardware.Camera$Parameters.setPictureSize(int, int)>
			//   20   46:return          
			}

			final ImplCraftARCamera this$0;
			final android.hardware.Camera.Size val$cameraSize;

			
			{
				this$0 = ImplCraftARCamera.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ImplCraftARCamera this$0>
				cameraSize = size;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field android.hardware.Camera$Size val$cameraSize>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field CameraThread mCameraThread>
	//    2    4:new             #14  <Class ImplCraftARCamera$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #335 <Method void ImplCraftARCamera$2(ImplCraftARCamera, android.hardware.Camera$Size)>
	//    7   13:invokevirtual   #139 <Method void CameraThread.updateCameraParams(CameraThread$CameraParamsTask)>
	//    8   16:return          
	}

	public void startCapture()
	{
		if(!mCameraThread.isAlive())
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field CameraThread mCameraThread>
	//*   2    4:invokevirtual   #165 <Method boolean CameraThread.isAlive()>
	//*   3    7:ifne            17
		{
			CLog.e("CameraThread not yet started!");
	//    4   10:ldc2            #338 <String "CameraThread not yet started!">
	//    5   13:invokestatic    #120 <Method void CLog.e(String)>
			return;
	//    6   16:return          
		}
		VideoCaptureConsumerHub.Instance().requestNV21Frames(((VideoCaptureConsumerHub.NV21VideoCaptureConsumer) (this)), true);
	//    7   17:invokestatic    #343 <Method VideoCaptureConsumerHub VideoCaptureConsumerHub.Instance()>
	//    8   20:aload_0         
	//    9   21:iconst_1        
	//   10   22:invokevirtual   #347 <Method boolean VideoCaptureConsumerHub.requestNV21Frames(VideoCaptureConsumerHub$NV21VideoCaptureConsumer, boolean)>
	//   11   25:pop             
		VideoCaptureConsumerHub.Instance().requestTakePictureCallbacks(((VideoCaptureConsumerHub.TakePictureConsumer) (this)), true);
	//   12   26:invokestatic    #343 <Method VideoCaptureConsumerHub VideoCaptureConsumerHub.Instance()>
	//   13   29:aload_0         
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #351 <Method boolean VideoCaptureConsumerHub.requestTakePictureCallbacks(VideoCaptureConsumerHub$TakePictureConsumer, boolean)>
	//   16   34:pop             
		boolean flag = mIsCameraFrozen;
	//   17   35:aload_0         
	//   18   36:getfield        #162 <Field boolean mIsCameraFrozen>
	//   19   39:istore_1        
		if(flag)
	//*  20   40:iload_1         
	//*  21   41:ifeq            51
		{
			CLog.d("Do not start camera, user requested to stop the preview");
	//   22   44:ldc2            #353 <String "Do not start camera, user requested to stop the preview">
	//   23   47:invokestatic    #157 <Method void CLog.d(String)>
			return;
	//   24   50:return          
		}
		if(!flag)
	//*  25   51:iload_1         
	//*  26   52:ifne            69
		{
			CameraThread camerathread = mCameraThread;
	//   27   55:aload_0         
	//   28   56:getfield        #51  <Field CameraThread mCameraThread>
	//   29   59:astore_2        
			if(camerathread != null)
	//*  30   60:aload_2         
	//*  31   61:ifnull          69
				camerathread.startCapturing(((Object) (this)));
	//   32   64:aload_2         
	//   33   65:aload_0         
	//   34   66:invokevirtual   #179 <Method void CameraThread.startCapturing(Object)>
		}
		setCraftARCameraParams();
	//   35   69:aload_0         
	//   36   70:invokespecial   #290 <Method void setCraftARCameraParams()>
	//   37   73:return          
	}

	public void stopCapture()
	{
		CLog.d("freezePreview");
	//    0    0:ldc2            #356 <String "freezePreview">
	//    1    3:invokestatic    #157 <Method void CLog.d(String)>
		CameraThread camerathread = mCameraThread;
	//    2    6:aload_0         
	//    3    7:getfield        #51  <Field CameraThread mCameraThread>
	//    4   10:astore_1        
		if(camerathread == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       33
		{
			propagateError(new CraftARError(CraftARError.ERROR_CODES.ERROR_UNKNOWN, "freezePreview() failed. CameraThread not initialized yet."));
	//    7   15:aload_0         
	//    8   16:new             #101 <Class CraftARError>
	//    9   19:dup             
	//   10   20:getstatic       #190 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_UNKNOWN>
	//   11   23:ldc2            #358 <String "freezePreview() failed. CameraThread not initialized yet.">
	//   12   26:invokespecial   #195 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   13   29:invokespecial   #197 <Method void propagateError(CraftARError)>
			return;
	//   14   32:return          
		} else
		{
			camerathread.stopCapturing();
	//   15   33:aload_1         
	//   16   34:invokevirtual   #170 <Method void CameraThread.stopCapturing()>
			mIsCameraFrozen = true;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #162 <Field boolean mIsCameraFrozen>
			return;
	//   20   42:return          
		}
	}

	public void takePicture()
	{
		CLog.d("takePicture implCamera");
	//    0    0:ldc2            #361 <String "takePicture implCamera">
	//    1    3:invokestatic    #157 <Method void CLog.d(String)>
		if(mCameraThread == null)
	//*   2    6:aload_0         
	//*   3    7:getfield        #51  <Field CameraThread mCameraThread>
	//*   4   10:ifnonnull       30
			propagateError(new CraftARError(CraftARError.ERROR_CODES.ERROR_UNKNOWN, "takePicture() failed. CameraThread not initialized yet."));
	//    5   13:aload_0         
	//    6   14:new             #101 <Class CraftARError>
	//    7   17:dup             
	//    8   18:getstatic       #190 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_UNKNOWN>
	//    9   21:ldc2            #363 <String "takePicture() failed. CameraThread not initialized yet.">
	//   10   24:invokespecial   #195 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   11   27:invokespecial   #197 <Method void propagateError(CraftARError)>
		mCameraThread.takePicture();
	//   12   30:aload_0         
	//   13   31:getfield        #51  <Field CameraThread mCameraThread>
	//   14   34:invokevirtual   #365 <Method void CameraThread.takePicture()>
	//   15   37:return          
	}

	public void takePictureFailed(CraftARError craftarerror)
	{
		propagateError(craftarerror);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #197 <Method void propagateError(CraftARError)>
	//    3    5:return          
	}

	public void triggerAutoFocus()
	{
		if(mSupportsFocus)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field boolean mSupportsFocus>
	//*   2    4:ifeq            20
		{
			CameraThread camerathread = mCameraThread;
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field CameraThread mCameraThread>
	//    5   11:astore_1        
			if(camerathread != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          20
				camerathread.triggerFocus();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #370 <Method void CameraThread.triggerFocus()>
		}
	//   10   20:return          
	}

	private CraftARCamera.CraftARCameraCallbacks mCameraCallbacksHandler;
	private CameraThread mCameraThread;
	private Context mContext;
	private boolean mFocusOnTouch;
	private int mFrameHeight;
	private int mFrameWidth;
	private boolean mIsCameraFrozen;
	List mSupportedFlashModes;
	private List mSupportedPictureSizes;
	private boolean mSupportsFocus;


/*
	static List access$000(ImplCraftARCamera implcraftarcamera)
	{
		return implcraftarcamera.mSupportedPictureSizes;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field List mSupportedPictureSizes>
	//    2    4:areturn         
	}

*/


/*
	static List access$002(ImplCraftARCamera implcraftarcamera, List list)
	{
		implcraftarcamera.mSupportedPictureSizes = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field List mSupportedPictureSizes>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Context access$100(ImplCraftARCamera implcraftarcamera)
	{
		return implcraftarcamera.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Context mContext>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$200(ImplCraftARCamera implcraftarcamera)
	{
		return implcraftarcamera.mSupportsFocus;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean mSupportsFocus>
	//    2    4:ireturn         
	}

*/


/*
	static CameraThread access$300(ImplCraftARCamera implcraftarcamera)
	{
		return implcraftarcamera.mCameraThread;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field CameraThread mCameraThread>
	//    2    4:areturn         
	}

*/
}
