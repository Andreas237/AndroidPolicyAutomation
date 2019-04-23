// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.*;
import android.widget.FrameLayout;

// Referenced classes of package com.craftar:
//			AppEventListener, AppEventForwarder, VideoCaptureConsumerHub, CLog, 
//			CameraThread, CraftARSDK, ImplCraftARCamera, CraftARActivity

public class CraftARCameraView extends FrameLayout
	implements android.view.ViewTreeObserver.OnGlobalLayoutListener, AppEventListener
{
	private class CraftARSurfaceView extends SurfaceView
		implements android.view.SurfaceHolder.Callback, VideoCaptureConsumerHub.NV21VideoCaptureConsumer, android.view.View.OnClickListener, android.view.View.OnTouchListener, AppEventListener
	{

		private void init(Context context)
		{
			mContext = context;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #91  <Field Context mContext>
			CLog.d("init() called!");
		//    3    5:ldc1            #97  <String "init() called!">
		//    4    7:invokestatic    #100 <Method void CLog.d(String)>
			mHolder = getHolder();
		//    5   10:aload_0         
		//    6   11:aload_0         
		//    7   12:invokevirtual   #104 <Method SurfaceHolder getHolder()>
		//    8   15:putfield        #106 <Field SurfaceHolder mHolder>
			mHolder.addCallback(((android.view.SurfaceHolder.Callback) (this)));
		//    9   18:aload_0         
		//   10   19:getfield        #106 <Field SurfaceHolder mHolder>
		//   11   22:aload_0         
		//   12   23:invokeinterface #112 <Method void SurfaceHolder.addCallback(android.view.SurfaceHolder$Callback)>
			mHolder.setType(3);
		//   13   28:aload_0         
		//   14   29:getfield        #106 <Field SurfaceHolder mHolder>
		//   15   32:iconst_3        
		//   16   33:invokeinterface #116 <Method void SurfaceHolder.setType(int)>
			setBackgroundColor(0xff0000);
		//   17   38:aload_0         
		//   18   39:ldc1            #117 <Int 0xff0000>
		//   19   41:invokevirtual   #120 <Method void setBackgroundColor(int)>
			setOnClickListener(((android.view.View.OnClickListener) (this)));
		//   20   44:aload_0         
		//   21   45:aload_0         
		//   22   46:invokevirtual   #124 <Method void setOnClickListener(android.view.View$OnClickListener)>
			setOnTouchListener(((android.view.View.OnTouchListener) (this)));
		//   23   49:aload_0         
		//   24   50:aload_0         
		//   25   51:invokevirtual   #128 <Method void setOnTouchListener(android.view.View$OnTouchListener)>
			if(mCameraThread == null)
		//*  26   54:aload_0         
		//*  27   55:getfield        #95  <Field CameraThread mCameraThread>
		//*  28   58:ifnonnull       72
				mCameraThread = CameraThread.Instance(mContext);
		//   29   61:aload_0         
		//   30   62:aload_0         
		//   31   63:getfield        #91  <Field Context mContext>
		//   32   66:invokestatic    #134 <Method CameraThread CameraThread.Instance(Context)>
		//   33   69:putfield        #95  <Field CameraThread mCameraThread>
			if(mCameraThread.isReadyToSetPreviewDisplay())
		//*  34   72:aload_0         
		//*  35   73:getfield        #95  <Field CameraThread mCameraThread>
		//*  36   76:invokevirtual   #138 <Method boolean CameraThread.isReadyToSetPreviewDisplay()>
		//*  37   79:ifeq            100
				onReadyToSetPreviewDisplay(mCameraThread.getLastWidth(), mCameraThread.getLastHeight());
		//   38   82:aload_0         
		//   39   83:aload_0         
		//   40   84:getfield        #95  <Field CameraThread mCameraThread>
		//   41   87:invokevirtual   #142 <Method int CameraThread.getLastWidth()>
		//   42   90:aload_0         
		//   43   91:getfield        #95  <Field CameraThread mCameraThread>
		//   44   94:invokevirtual   #145 <Method int CameraThread.getLastHeight()>
		//   45   97:invokevirtual   #149 <Method void onReadyToSetPreviewDisplay(int, int)>
			if(mOrientationListener == null)
		//*  46  100:aload_0         
		//*  47  101:getfield        #151 <Field CraftARCameraView$CraftARSurfaceView$OrientationListener mOrientationListener>
		//*  48  104:ifnonnull       128
			{
				CLog.d("Creating OrientationListener");
		//   49  107:ldc1            #153 <String "Creating OrientationListener">
		//   50  109:invokestatic    #100 <Method void CLog.d(String)>
				mOrientationListener = new OrientationListener(mContext);
		//   51  112:aload_0         
		//   52  113:new             #23  <Class CraftARCameraView$CraftARSurfaceView$OrientationListener>
		//   53  116:dup             
		//   54  117:aload_0         
		//   55  118:aload_0         
		//   56  119:getfield        #91  <Field Context mContext>
		//   57  122:invokespecial   #156 <Method void CraftARCameraView$CraftARSurfaceView$OrientationListener(CraftARCameraView$CraftARSurfaceView, Context)>
		//   58  125:putfield        #151 <Field CraftARCameraView$CraftARSurfaceView$OrientationListener mOrientationListener>
			}
		//   59  128:return          
		}

		public void onAppFinish()
		{
		//    0    0:return          
		}

		public void onAppPause()
		{
			mOrientationListener.disable();
		//    0    0:aload_0         
		//    1    1:getfield        #151 <Field CraftARCameraView$CraftARSurfaceView$OrientationListener mOrientationListener>
		//    2    4:invokevirtual   #162 <Method void CraftARCameraView$CraftARSurfaceView$OrientationListener.disable()>
			mPreviewUp = false;
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:putfield        #61  <Field boolean mPreviewUp>
			CLog.d("stopCapturing");
		//    6   12:ldc1            #164 <String "stopCapturing">
		//    7   14:invokestatic    #100 <Method void CLog.d(String)>
		//    8   17:return          
		}

		public void onAppResume()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #167 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #169 <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("onResume in CraftARSurfaceView ");
		//    4    8:aload_1         
		//    5    9:ldc1            #171 <String "onResume in CraftARSurfaceView ">
		//    6   11:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((Object) (this)));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokevirtual   #178 <Method StringBuilder StringBuilder.append(Object)>
		//   11   20:pop             
			CLog.d(stringbuilder.toString());
		//   12   21:aload_1         
		//   13   22:invokevirtual   #182 <Method String StringBuilder.toString()>
		//   14   25:invokestatic    #100 <Method void CLog.d(String)>
			mOrientationListener.resetOrientation();
		//   15   28:aload_0         
		//   16   29:getfield        #151 <Field CraftARCameraView$CraftARSurfaceView$OrientationListener mOrientationListener>
		//   17   32:invokevirtual   #185 <Method void CraftARCameraView$CraftARSurfaceView$OrientationListener.resetOrientation()>
		//   18   35:return          
		}

		public void onCameraOpenFailed()
		{
		//    0    0:return          
		}

		public void onClick(View view)
		{
			view = ((View) ((ImplCraftARCamera)CraftARSDK.Instance().getCamera()));
		//    0    0:invokestatic    #193 <Method CraftARSDK CraftARSDK.Instance()>
		//    1    3:invokevirtual   #197 <Method CraftARCamera CraftARSDK.getCamera()>
		//    2    6:checkcast       #199 <Class ImplCraftARCamera>
		//    3    9:astore_1        
			if(view != null && ((ImplCraftARCamera) (view)).focusesOnTouch())
		//*   4   10:aload_1         
		//*   5   11:ifnull          25
		//*   6   14:aload_1         
		//*   7   15:invokevirtual   #202 <Method boolean ImplCraftARCamera.focusesOnTouch()>
		//*   8   18:ifeq            25
				((ImplCraftARCamera) (view)).triggerAutoFocus();
		//    9   21:aload_1         
		//   10   22:invokevirtual   #205 <Method void ImplCraftARCamera.triggerAutoFocus()>
			if(mExternalClickListener != null)
		//*  11   25:aload_0         
		//*  12   26:getfield        #54  <Field CraftARCameraView this$0>
		//*  13   29:invokestatic    #209 <Method android.view.View$OnClickListener CraftARCameraView.access$000(CraftARCameraView)>
		//*  14   32:ifnull          51
				mExternalClickListener.onClick(((View) (mParentView)));
		//   15   35:aload_0         
		//   16   36:getfield        #54  <Field CraftARCameraView this$0>
		//   17   39:invokestatic    #209 <Method android.view.View$OnClickListener CraftARCameraView.access$000(CraftARCameraView)>
		//   18   42:aload_0         
		//   19   43:getfield        #211 <Field CraftARCameraView mParentView>
		//   20   46:invokeinterface #213 <Method void android.view.View$OnClickListener.onClick(View)>
		//   21   51:return          
		}

		protected void onMeasure(int i, int j)
		{
			super.onMeasure(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #216 <Method void SurfaceView.onMeasure(int, int)>
		//    4    6:return          
		}

		public void onPreviewNV21Frame(byte abyte0[])
		{
		//    0    0:return          
		}

		public void onPreviewStarted(int i, int j, int k)
		{
		//    0    0:return          
		}

		void onReadyToSetCameraPreviewDisplay()
		{
			CLog.d("onReadyToSetCamera");
		//    0    0:ldc1            #223 <String "onReadyToSetCamera">
		//    1    2:invokestatic    #100 <Method void CLog.d(String)>
			mOrientationListener.enable();
		//    2    5:aload_0         
		//    3    6:getfield        #151 <Field CraftARCameraView$CraftARSurfaceView$OrientationListener mOrientationListener>
		//    4    9:invokevirtual   #226 <Method void CraftARCameraView$CraftARSurfaceView$OrientationListener.enable()>
			Object obj = ((Object) (new StringBuilder()));
		//    5   12:new             #167 <Class StringBuilder>
		//    6   15:dup             
		//    7   16:invokespecial   #169 <Method void StringBuilder()>
		//    8   19:astore          13
			((StringBuilder) (obj)).append("Original preview width: ");
		//    9   21:aload           13
		//   10   23:ldc1            #228 <String "Original preview width: ">
		//   11   25:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//   12   28:pop             
			((StringBuilder) (obj)).append(mParentWidth);
		//   13   29:aload           13
		//   14   31:aload_0         
		//   15   32:getfield        #65  <Field int mParentWidth>
		//   16   35:invokevirtual   #231 <Method StringBuilder StringBuilder.append(int)>
		//   17   38:pop             
			((StringBuilder) (obj)).append(" and height: ");
		//   18   39:aload           13
		//   19   41:ldc1            #233 <String " and height: ">
		//   20   43:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//   21   46:pop             
			((StringBuilder) (obj)).append(mParentHeight);
		//   22   47:aload           13
		//   23   49:aload_0         
		//   24   50:getfield        #63  <Field int mParentHeight>
		//   25   53:invokevirtual   #231 <Method StringBuilder StringBuilder.append(int)>
		//   26   56:pop             
			CLog.d(((StringBuilder) (obj)).toString());
		//   27   57:aload           13
		//   28   59:invokevirtual   #182 <Method String StringBuilder.toString()>
		//   29   62:invokestatic    #100 <Method void CLog.d(String)>
			int i = getPaddingLeft();
		//   30   65:aload_0         
		//   31   66:invokevirtual   #236 <Method int getPaddingLeft()>
		//   32   69:istore          9
			int l = getPaddingRight();
		//   33   71:aload_0         
		//   34   72:invokevirtual   #239 <Method int getPaddingRight()>
		//   35   75:istore          10
			int i1 = getPaddingTop();
		//   36   77:aload_0         
		//   37   78:invokevirtual   #242 <Method int getPaddingTop()>
		//   38   81:istore          11
			int j1 = getPaddingBottom();
		//   39   83:aload_0         
		//   40   84:invokevirtual   #245 <Method int getPaddingBottom()>
		//   41   87:istore          12
			double d3 = i + l;
		//   42   89:iload           9
		//   43   91:iload           10
		//   44   93:iadd            
		//   45   94:i2d             
		//   46   95:dstore          7
			double d2 = i1 + j1;
		//   47   97:iload           11
		//   48   99:iload           12
		//   49  101:iadd            
		//   50  102:i2d             
		//   51  103:dstore          5
			obj = ((Object) (new StringBuilder()));
		//   52  105:new             #167 <Class StringBuilder>
		//   53  108:dup             
		//   54  109:invokespecial   #169 <Method void StringBuilder()>
		//   55  112:astore          13
			((StringBuilder) (obj)).append("aspects parentLayout width: ");
		//   56  114:aload           13
		//   57  116:ldc1            #247 <String "aspects parentLayout width: ">
		//   58  118:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//   59  121:pop             
			((StringBuilder) (obj)).append(mParentWidth);
		//   60  122:aload           13
		//   61  124:aload_0         
		//   62  125:getfield        #65  <Field int mParentWidth>
		//   63  128:invokevirtual   #231 <Method StringBuilder StringBuilder.append(int)>
		//   64  131:pop             
			((StringBuilder) (obj)).append(" height: ");
		//   65  132:aload           13
		//   66  134:ldc1            #249 <String " height: ">
		//   67  136:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//   68  139:pop             
			((StringBuilder) (obj)).append(mParentHeight);
		//   69  140:aload           13
		//   70  142:aload_0         
		//   71  143:getfield        #63  <Field int mParentHeight>
		//   72  146:invokevirtual   #231 <Method StringBuilder StringBuilder.append(int)>
		//   73  149:pop             
			CLog.d(((StringBuilder) (obj)).toString());
		//   74  150:aload           13
		//   75  152:invokevirtual   #182 <Method String StringBuilder.toString()>
		//   76  155:invokestatic    #100 <Method void CLog.d(String)>
			double d1 = (double)mParentWidth / (double)mParentHeight;
		//   77  158:aload_0         
		//   78  159:getfield        #65  <Field int mParentWidth>
		//   79  162:i2d             
		//   80  163:aload_0         
		//   81  164:getfield        #63  <Field int mParentHeight>
		//   82  167:i2d             
		//   83  168:ddiv            
		//   84  169:dstore_3        
			obj = ((Object) (new StringBuilder()));
		//   85  170:new             #167 <Class StringBuilder>
		//   86  173:dup             
		//   87  174:invokespecial   #169 <Method void StringBuilder()>
		//   88  177:astore          13
			((StringBuilder) (obj)).append("previewAspect: ");
		//   89  179:aload           13
		//   90  181:ldc1            #251 <String "previewAspect: ">
		//   91  183:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//   92  186:pop             
			((StringBuilder) (obj)).append(mAspectRatio);
		//   93  187:aload           13
		//   94  189:aload_0         
		//   95  190:getfield        #67  <Field double mAspectRatio>
		//   96  193:invokevirtual   #254 <Method StringBuilder StringBuilder.append(double)>
		//   97  196:pop             
			((StringBuilder) (obj)).append(" parentAspect: ");
		//   98  197:aload           13
		//   99  199:ldc2            #256 <String " parentAspect: ">
		//  100  202:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//  101  205:pop             
			((StringBuilder) (obj)).append(d1);
		//  102  206:aload           13
		//  103  208:dload_3         
		//  104  209:invokevirtual   #254 <Method StringBuilder StringBuilder.append(double)>
		//  105  212:pop             
			CLog.d(((StringBuilder) (obj)).toString());
		//  106  213:aload           13
		//  107  215:invokevirtual   #182 <Method String StringBuilder.toString()>
		//  108  218:invokestatic    #100 <Method void CLog.d(String)>
			double d = mAspectRatio;
		//  109  221:aload_0         
		//  110  222:getfield        #67  <Field double mAspectRatio>
		//  111  225:dstore_1        
			if(d1 > d)
		//* 112  226:dload_3         
		//* 113  227:dload_1         
		//* 114  228:dcmpl           
		//* 115  229:ifle            251
			{
				int j = mParentWidth;
		//  116  232:aload_0         
		//  117  233:getfield        #65  <Field int mParentWidth>
		//  118  236:istore          9
				d1 = j;
		//  119  238:iload           9
		//  120  240:i2d             
		//  121  241:dstore_3        
				d = (double)j / d;
		//  122  242:iload           9
		//  123  244:i2d             
		//  124  245:dload_1         
		//  125  246:ddiv            
		//  126  247:dstore_1        
			} else
		//* 127  248:goto            267
			{
				int k = mParentHeight;
		//  128  251:aload_0         
		//  129  252:getfield        #63  <Field int mParentHeight>
		//  130  255:istore          9
				d1 = (double)k * d;
		//  131  257:iload           9
		//  132  259:i2d             
		//  133  260:dload_1         
		//  134  261:dmul            
		//  135  262:dstore_3        
				d = k;
		//  136  263:iload           9
		//  137  265:i2d             
		//  138  266:dstore_1        
			}
			d1 += d3;
		//  139  267:dload_3         
		//  140  268:dload           7
		//  141  270:dadd            
		//  142  271:dstore_3        
			obj = ((Object) (getLayoutParams()));
		//  143  272:aload_0         
		//  144  273:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
		//  145  276:astore          13
			StringBuilder stringbuilder = new StringBuilder();
		//  146  278:new             #167 <Class StringBuilder>
		//  147  281:dup             
		//  148  282:invokespecial   #169 <Method void StringBuilder()>
		//  149  285:astore          14
			stringbuilder.append("onReadyCamera width: ");
		//  150  287:aload           14
		//  151  289:ldc2            #262 <String "onReadyCamera width: ">
		//  152  292:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//  153  295:pop             
			stringbuilder.append(d1);
		//  154  296:aload           14
		//  155  298:dload_3         
		//  156  299:invokevirtual   #254 <Method StringBuilder StringBuilder.append(double)>
		//  157  302:pop             
			CLog.d(stringbuilder.toString());
		//  158  303:aload           14
		//  159  305:invokevirtual   #182 <Method String StringBuilder.toString()>
		//  160  308:invokestatic    #100 <Method void CLog.d(String)>
			obj.width = (int)d1;
		//  161  311:aload           13
		//  162  313:dload_3         
		//  163  314:d2i             
		//  164  315:putfield        #267 <Field int android.view.ViewGroup$LayoutParams.width>
			obj.height = (int)(d + d2);
		//  165  318:aload           13
		//  166  320:dload_1         
		//  167  321:dload           5
		//  168  323:dadd            
		//  169  324:d2i             
		//  170  325:putfield        #270 <Field int android.view.ViewGroup$LayoutParams.height>
			setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
		//  171  328:aload_0         
		//  172  329:aload           13
		//  173  331:invokevirtual   #274 <Method void setLayoutParams(android.view.ViewGroup$LayoutParams)>
			obj = ((Object) (new StringBuilder()));
		//  174  334:new             #167 <Class StringBuilder>
		//  175  337:dup             
		//  176  338:invokespecial   #169 <Method void StringBuilder()>
		//  177  341:astore          13
			((StringBuilder) (obj)).append("setPreviewDisplay with holder :");
		//  178  343:aload           13
		//  179  345:ldc2            #276 <String "setPreviewDisplay with holder :">
		//  180  348:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//  181  351:pop             
			((StringBuilder) (obj)).append(((Object) (mHolder)));
		//  182  352:aload           13
		//  183  354:aload_0         
		//  184  355:getfield        #106 <Field SurfaceHolder mHolder>
		//  185  358:invokevirtual   #178 <Method StringBuilder StringBuilder.append(Object)>
		//  186  361:pop             
			CLog.d(((StringBuilder) (obj)).toString());
		//  187  362:aload           13
		//  188  364:invokevirtual   #182 <Method String StringBuilder.toString()>
		//  189  367:invokestatic    #100 <Method void CLog.d(String)>
			mCameraThread.setPreviewDisplay(mHolder);
		//  190  370:aload_0         
		//  191  371:getfield        #95  <Field CameraThread mCameraThread>
		//  192  374:aload_0         
		//  193  375:getfield        #106 <Field SurfaceHolder mHolder>
		//  194  378:invokevirtual   #280 <Method void CameraThread.setPreviewDisplay(SurfaceHolder)>
		//  195  381:return          
		}

		public void onReadyToSetPreviewDisplay(int i, int j)
		{
			CLog.d("onReadyToSetPreviewDisplay");
		//    0    0:ldc2            #281 <String "onReadyToSetPreviewDisplay">
		//    1    3:invokestatic    #100 <Method void CLog.d(String)>
			mFrameWidth = i;
		//    2    6:aload_0         
		//    3    7:iload_1         
		//    4    8:putfield        #283 <Field int mFrameWidth>
			mFrameHeight = j;
		//    5   11:aload_0         
		//    6   12:iload_2         
		//    7   13:putfield        #285 <Field int mFrameHeight>
			if(getResources().getConfiguration().orientation == 1)
		//*   8   16:aload_0         
		//*   9   17:invokevirtual   #289 <Method Resources getResources()>
		//*  10   20:invokevirtual   #295 <Method Configuration Resources.getConfiguration()>
		//*  11   23:getfield        #300 <Field int Configuration.orientation>
		//*  12   26:iconst_1        
		//*  13   27:icmpne          49
			{
				mWidth = mFrameHeight;
		//   14   30:aload_0         
		//   15   31:aload_0         
		//   16   32:getfield        #285 <Field int mFrameHeight>
		//   17   35:putfield        #302 <Field int mWidth>
				mHeight = mFrameWidth;
		//   18   38:aload_0         
		//   19   39:aload_0         
		//   20   40:getfield        #283 <Field int mFrameWidth>
		//   21   43:putfield        #304 <Field int mHeight>
			} else
		//*  22   46:goto            65
			{
				mWidth = mFrameWidth;
		//   23   49:aload_0         
		//   24   50:aload_0         
		//   25   51:getfield        #283 <Field int mFrameWidth>
		//   26   54:putfield        #302 <Field int mWidth>
				mHeight = mFrameHeight;
		//   27   57:aload_0         
		//   28   58:aload_0         
		//   29   59:getfield        #285 <Field int mFrameHeight>
		//   30   62:putfield        #304 <Field int mHeight>
			}
			mAspectRatio = (float)mWidth / (float)mHeight;
		//   31   65:aload_0         
		//   32   66:aload_0         
		//   33   67:getfield        #302 <Field int mWidth>
		//   34   70:i2f             
		//   35   71:aload_0         
		//   36   72:getfield        #304 <Field int mHeight>
		//   37   75:i2f             
		//   38   76:fdiv            
		//   39   77:f2d             
		//   40   78:putfield        #67  <Field double mAspectRatio>
			mCameraThread.setCameraDisplayOrientation(((CameraThread.DisplayOrientationCallback) (null)));
		//   41   81:aload_0         
		//   42   82:getfield        #95  <Field CameraThread mCameraThread>
		//   43   85:aconst_null     
		//   44   86:invokevirtual   #308 <Method void CameraThread.setCameraDisplayOrientation(CameraThread$DisplayOrientationCallback)>
			this;
		//   45   89:aload_0         
			JVM INSTR monitorenter ;
		//   46   90:monitorenter    
			mPreviewUp = true;
		//   47   91:aload_0         
		//   48   92:iconst_1        
		//   49   93:putfield        #61  <Field boolean mPreviewUp>
			if(mSurfaceUp)
		//*  50   96:aload_0         
		//*  51   97:getfield        #59  <Field boolean mSurfaceUp>
		//*  52  100:ifeq            123
			{
				CraftARSDK.Instance().getActivity().runOnUiThread(new Runnable() {

					public void run()
					{
						CLog.d("onReadyToSetCameraPreview  PreviewStarted");
					//    0    0:ldc1            #27  <String "onReadyToSetCameraPreview  PreviewStarted">
					//    1    2:invokestatic    #33  <Method void CLog.d(String)>
						onReadyToSetCameraPreviewDisplay();
					//    2    5:aload_0         
					//    3    6:getfield        #20  <Field CraftARCameraView$CraftARSurfaceView this$1>
					//    4    9:invokevirtual   #36  <Method void CraftARCameraView$CraftARSurfaceView.onReadyToSetCameraPreviewDisplay()>
					//    5   12:return          
					}

					final CraftARSurfaceView this$1;

			
			{
				this$1 = CraftARSurfaceView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CraftARCameraView$CraftARSurfaceView this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
				}
);
		//   53  103:invokestatic    #193 <Method CraftARSDK CraftARSDK.Instance()>
		//   54  106:invokevirtual   #312 <Method CraftARActivity CraftARSDK.getActivity()>
		//   55  109:new             #21  <Class CraftARCameraView$CraftARSurfaceView$2>
		//   56  112:dup             
		//   57  113:aload_0         
		//   58  114:invokespecial   #315 <Method void CraftARCameraView$CraftARSurfaceView$2(CraftARCameraView$CraftARSurfaceView)>
		//   59  117:invokevirtual   #321 <Method void CraftARActivity.runOnUiThread(Runnable)>
				break MISSING_BLOCK_LABEL_129;
		//   60  120:goto            129
			}
			CLog.d("Surface not up!");
		//   61  123:ldc2            #323 <String "Surface not up!">
		//   62  126:invokestatic    #100 <Method void CLog.d(String)>
			this;
		//   63  129:aload_0         
			JVM INSTR monitorexit ;
		//   64  130:monitorexit     
			return;
		//   65  131:return          
			Exception exception;
			exception;
		//   66  132:astore_3        
			this;
		//   67  133:aload_0         
			JVM INSTR monitorexit ;
		//   68  134:monitorexit     
			throw exception;
		//   69  135:aload_3         
		//   70  136:athrow          
		}

		public boolean onTouch(View view, MotionEvent motionevent)
		{
			if(mExternalTouchListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #54  <Field CraftARCameraView this$0>
		//*   2    4:invokestatic    #329 <Method android.view.View$OnTouchListener CraftARCameraView.access$400(CraftARCameraView)>
		//*   3    7:ifnull          28
				mExternalTouchListener.onTouch(((View) (mParentView)), motionevent);
		//    4   10:aload_0         
		//    5   11:getfield        #54  <Field CraftARCameraView this$0>
		//    6   14:invokestatic    #329 <Method android.view.View$OnTouchListener CraftARCameraView.access$400(CraftARCameraView)>
		//    7   17:aload_0         
		//    8   18:getfield        #211 <Field CraftARCameraView mParentView>
		//    9   21:aload_2         
		//   10   22:invokeinterface #331 <Method boolean android.view.View$OnTouchListener.onTouch(View, MotionEvent)>
		//   11   27:pop             
			return false;
		//   12   28:iconst_0        
		//   13   29:ireturn         
		}

		public void setParentMeasures(int i, int j)
		{
			mParentWidth = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #65  <Field int mParentWidth>
			mParentHeight = j;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #63  <Field int mParentHeight>
		//    6   10:return          
		}

		void setParentView(CraftARCameraView craftarcameraview)
		{
			mParentView = craftarcameraview;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #211 <Field CraftARCameraView mParentView>
			mParentView.removeAllViews();
		//    3    5:aload_0         
		//    4    6:getfield        #211 <Field CraftARCameraView mParentView>
		//    5    9:invokevirtual   #337 <Method void CraftARCameraView.removeAllViews()>
			mParentView.addView(((View) (this)));
		//    6   12:aload_0         
		//    7   13:getfield        #211 <Field CraftARCameraView mParentView>
		//    8   16:aload_0         
		//    9   17:invokevirtual   #340 <Method void CraftARCameraView.addView(View)>
		//   10   20:return          
		}

		public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
		{
			CLog.v("surfaceChanged");
		//    0    0:ldc2            #343 <String "surfaceChanged">
		//    1    3:invokestatic    #77  <Method void CLog.v(String)>
			if(mHolder.getSurface() == null)
		//*   2    6:aload_0         
		//*   3    7:getfield        #106 <Field SurfaceHolder mHolder>
		//*   4   10:invokeinterface #347 <Method android.view.Surface SurfaceHolder.getSurface()>
		//*   5   15:ifnonnull       25
			{
				CLog.e("Preview surface does not exist!");
		//    6   18:ldc2            #349 <String "Preview surface does not exist!">
		//    7   21:invokestatic    #352 <Method void CLog.e(String)>
				return;
		//    8   24:return          
			} else
			{
				return;
		//    9   25:return          
			}
		}

		public void surfaceCreated(SurfaceHolder surfaceholder)
		{
			CLog.d("surfaceCreated");
		//    0    0:ldc2            #354 <String "surfaceCreated">
		//    1    3:invokestatic    #100 <Method void CLog.d(String)>
			this;
		//    2    6:aload_0         
			JVM INSTR monitorenter ;
		//    3    7:monitorenter    
			mSurfaceUp = true;
		//    4    8:aload_0         
		//    5    9:iconst_1        
		//    6   10:putfield        #59  <Field boolean mSurfaceUp>
			if(mPreviewUp)
		//*   7   13:aload_0         
		//*   8   14:getfield        #61  <Field boolean mPreviewUp>
		//*   9   17:ifeq            40
			{
				CraftARSDK.Instance().getActivity().runOnUiThread(new Runnable() {

					public void run()
					{
						CLog.d("onReadyToSetCameraPreview  Surface");
					//    0    0:ldc1            #27  <String "onReadyToSetCameraPreview  Surface">
					//    1    2:invokestatic    #33  <Method void CLog.d(String)>
						onReadyToSetCameraPreviewDisplay();
					//    2    5:aload_0         
					//    3    6:getfield        #20  <Field CraftARCameraView$CraftARSurfaceView this$1>
					//    4    9:invokevirtual   #36  <Method void CraftARCameraView$CraftARSurfaceView.onReadyToSetCameraPreviewDisplay()>
					//    5   12:return          
					}

					final CraftARSurfaceView this$1;

			
			{
				this$1 = CraftARSurfaceView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CraftARCameraView$CraftARSurfaceView this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
				}
);
		//   10   20:invokestatic    #193 <Method CraftARSDK CraftARSDK.Instance()>
		//   11   23:invokevirtual   #312 <Method CraftARActivity CraftARSDK.getActivity()>
		//   12   26:new             #19  <Class CraftARCameraView$CraftARSurfaceView$1>
		//   13   29:dup             
		//   14   30:aload_0         
		//   15   31:invokespecial   #355 <Method void CraftARCameraView$CraftARSurfaceView$1(CraftARCameraView$CraftARSurfaceView)>
		//   16   34:invokevirtual   #321 <Method void CraftARActivity.runOnUiThread(Runnable)>
				break MISSING_BLOCK_LABEL_46;
		//   17   37:goto            46
			}
			CLog.d("Preview not up!");
		//   18   40:ldc2            #357 <String "Preview not up!">
		//   19   43:invokestatic    #100 <Method void CLog.d(String)>
			this;
		//   20   46:aload_0         
			JVM INSTR monitorexit ;
		//   21   47:monitorexit     
			return;
		//   22   48:return          
			surfaceholder;
		//   23   49:astore_1        
			this;
		//   24   50:aload_0         
			JVM INSTR monitorexit ;
		//   25   51:monitorexit     
			throw surfaceholder;
		//   26   52:aload_1         
		//   27   53:athrow          
		}

		public void surfaceDestroyed(SurfaceHolder surfaceholder)
		{
			CLog.v("surfaceDestroyed");
		//    0    0:ldc2            #359 <String "surfaceDestroyed">
		//    1    3:invokestatic    #77  <Method void CLog.v(String)>
			mSurfaceHasBeenDestroyed = true;
		//    2    6:aload_0         
		//    3    7:iconst_1        
		//    4    8:putfield        #69  <Field boolean mSurfaceHasBeenDestroyed>
			mOrientationListener.disable();
		//    5   11:aload_0         
		//    6   12:getfield        #151 <Field CraftARCameraView$CraftARSurfaceView$OrientationListener mOrientationListener>
		//    7   15:invokevirtual   #162 <Method void CraftARCameraView$CraftARSurfaceView$OrientationListener.disable()>
			mCameraThread.stopCapturing();
		//    8   18:aload_0         
		//    9   19:getfield        #95  <Field CameraThread mCameraThread>
		//   10   22:invokevirtual   #361 <Method void CameraThread.stopCapturing()>
			mHolder.removeCallback(((android.view.SurfaceHolder.Callback) (this)));
		//   11   25:aload_0         
		//   12   26:getfield        #106 <Field SurfaceHolder mHolder>
		//   13   29:aload_0         
		//   14   30:invokeinterface #364 <Method void SurfaceHolder.removeCallback(android.view.SurfaceHolder$Callback)>
			CLog.d("stopCapturing");
		//   15   35:ldc1            #164 <String "stopCapturing">
		//   16   37:invokestatic    #100 <Method void CLog.d(String)>
			VideoCaptureConsumerHub.Instance().requestNV21Frames(((VideoCaptureConsumerHub.NV21VideoCaptureConsumer) (this)), false);
		//   17   40:invokestatic    #369 <Method VideoCaptureConsumerHub VideoCaptureConsumerHub.Instance()>
		//   18   43:aload_0         
		//   19   44:iconst_0        
		//   20   45:invokevirtual   #373 <Method boolean VideoCaptureConsumerHub.requestNV21Frames(VideoCaptureConsumerHub$NV21VideoCaptureConsumer, boolean)>
		//   21   48:pop             
			AppEventForwarder.removeAppEventListener(((AppEventListener) (this)));
		//   22   49:aload_0         
		//   23   50:invokestatic    #379 <Method void AppEventForwarder.removeAppEventListener(AppEventListener)>
		//   24   53:return          
		}

		boolean surfaceHasBeenDestroyed()
		{
			return mSurfaceHasBeenDestroyed;
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field boolean mSurfaceHasBeenDestroyed>
		//    2    4:ireturn         
		}

		private double mAspectRatio;
		private CameraThread mCameraThread;
		private Context mContext;
		private int mFrameHeight;
		private int mFrameWidth;
		private int mHeight;
		private SurfaceHolder mHolder;
		private OrientationListener mOrientationListener;
		private int mParentHeight;
		CraftARCameraView mParentView;
		private int mParentWidth;
		private boolean mPreviewUp;
		private boolean mSurfaceHasBeenDestroyed;
		private boolean mSurfaceUp;
		private int mWidth;
		final CraftARCameraView this$0;


/*
		static Context access$100(CraftARSurfaceView craftarsurfaceview)
		{
			return craftarsurfaceview.mContext;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field Context mContext>
		//    2    4:areturn         
		}

*/


/*
		static CameraThread access$300(CraftARSurfaceView craftarsurfaceview)
		{
			return craftarsurfaceview.mCameraThread;
		//    0    0:aload_0         
		//    1    1:getfield        #95  <Field CameraThread mCameraThread>
		//    2    4:areturn         
		}

*/

		public CraftARSurfaceView(Context context)
		{
			this$0 = CraftARCameraView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #54  <Field CraftARCameraView this$0>
			super(context);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #57  <Method void SurfaceView(Context)>
			mSurfaceUp = false;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #59  <Field boolean mSurfaceUp>
			mPreviewUp = false;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #61  <Field boolean mPreviewUp>
			mParentHeight = 0;
		//   12   20:aload_0         
		//   13   21:iconst_0        
		//   14   22:putfield        #63  <Field int mParentHeight>
			mParentWidth = 0;
		//   15   25:aload_0         
		//   16   26:iconst_0        
		//   17   27:putfield        #65  <Field int mParentWidth>
			mAspectRatio = 0.0D;
		//   18   30:aload_0         
		//   19   31:dconst_0        
		//   20   32:putfield        #67  <Field double mAspectRatio>
			mSurfaceHasBeenDestroyed = false;
		//   21   35:aload_0         
		//   22   36:iconst_0        
		//   23   37:putfield        #69  <Field boolean mSurfaceHasBeenDestroyed>
			CLog.v("Called constructor 1!");
		//   24   40:ldc1            #71  <String "Called constructor 1!">
		//   25   42:invokestatic    #77  <Method void CLog.v(String)>
			init(context);
		//   26   45:aload_0         
		//   27   46:aload_2         
		//   28   47:invokespecial   #80  <Method void init(Context)>
		//   29   50:return          
		}

		public CraftARSurfaceView(Context context, AttributeSet attributeset)
		{
			this$0 = CraftARCameraView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #54  <Field CraftARCameraView this$0>
			super(context, attributeset);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:aload_3         
		//    6    8:invokespecial   #85  <Method void SurfaceView(Context, AttributeSet)>
			mSurfaceUp = false;
		//    7   11:aload_0         
		//    8   12:iconst_0        
		//    9   13:putfield        #59  <Field boolean mSurfaceUp>
			mPreviewUp = false;
		//   10   16:aload_0         
		//   11   17:iconst_0        
		//   12   18:putfield        #61  <Field boolean mPreviewUp>
			mParentHeight = 0;
		//   13   21:aload_0         
		//   14   22:iconst_0        
		//   15   23:putfield        #63  <Field int mParentHeight>
			mParentWidth = 0;
		//   16   26:aload_0         
		//   17   27:iconst_0        
		//   18   28:putfield        #65  <Field int mParentWidth>
			mAspectRatio = 0.0D;
		//   19   31:aload_0         
		//   20   32:dconst_0        
		//   21   33:putfield        #67  <Field double mAspectRatio>
			mSurfaceHasBeenDestroyed = false;
		//   22   36:aload_0         
		//   23   37:iconst_0        
		//   24   38:putfield        #69  <Field boolean mSurfaceHasBeenDestroyed>
			CLog.v("Called constructor 2!");
		//   25   41:ldc1            #87  <String "Called constructor 2!">
		//   26   43:invokestatic    #77  <Method void CLog.v(String)>
			init(context);
		//   27   46:aload_0         
		//   28   47:aload_2         
		//   29   48:invokespecial   #80  <Method void init(Context)>
		//   30   51:return          
		}
	}

	private class CraftARSurfaceView.OrientationListener extends OrientationEventListener
	{

		public void onOrientationChanged(int i)
		{
			currentOrientation = ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay().getRotation();
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #23  <Field CraftARCameraView$CraftARSurfaceView this$1>
		//    3    5:invokestatic    #39  <Method Context CraftARCameraView$CraftARSurfaceView.access$100(CraftARCameraView$CraftARSurfaceView)>
		//    4    8:ldc1            #41  <String "window">
		//    5   10:invokevirtual   #47  <Method Object Context.getSystemService(String)>
		//    6   13:checkcast       #49  <Class WindowManager>
		//    7   16:invokeinterface #53  <Method Display WindowManager.getDefaultDisplay()>
		//    8   21:invokevirtual   #59  <Method int Display.getRotation()>
		//    9   24:putfield        #61  <Field int currentOrientation>
			if(currentOrientation != lastOrientation)
		//*  10   27:aload_0         
		//*  11   28:getfield        #61  <Field int currentOrientation>
		//*  12   31:aload_0         
		//*  13   32:getfield        #33  <Field int lastOrientation>
		//*  14   35:icmpeq          115
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   15   38:new             #63  <Class StringBuilder>
		//   16   41:dup             
		//   17   42:invokespecial   #66  <Method void StringBuilder()>
		//   18   45:astore_2        
				stringbuilder.append("orientationListener current: ");
		//   19   46:aload_2         
		//   20   47:ldc1            #68  <String "orientationListener current: ">
		//   21   49:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   22   52:pop             
				stringbuilder.append(currentOrientation);
		//   23   53:aload_2         
		//   24   54:aload_0         
		//   25   55:getfield        #61  <Field int currentOrientation>
		//   26   58:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
		//   27   61:pop             
				stringbuilder.append(" last: ");
		//   28   62:aload_2         
		//   29   63:ldc1            #77  <String " last: ">
		//   30   65:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   31   68:pop             
				stringbuilder.append(lastOrientation);
		//   32   69:aload_2         
		//   33   70:aload_0         
		//   34   71:getfield        #33  <Field int lastOrientation>
		//   35   74:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
		//   36   77:pop             
				CLog.d(stringbuilder.toString());
		//   37   78:aload_2         
		//   38   79:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   39   82:invokestatic    #87  <Method void CLog.d(String)>
				if(executeOnce)
		//*  40   85:aload_0         
		//*  41   86:getfield        #28  <Field boolean executeOnce>
		//*  42   89:ifeq            115
				{
					executeOnce = false;
		//   43   92:aload_0         
		//   44   93:iconst_0        
		//   45   94:putfield        #28  <Field boolean executeOnce>
					mCameraThread.setCameraDisplayOrientation(new CameraThread.DisplayOrientationCallback() {

						public void onDisplayOrientationUpdated(int i)
						{
							lastOrientation = i;
						//    0    0:aload_0         
						//    1    1:getfield        #23  <Field CraftARCameraView$CraftARSurfaceView$OrientationListener this$2>
						//    2    4:iload_1         
						//    3    5:invokestatic    #32  <Method int CraftARCameraView$CraftARSurfaceView$OrientationListener.access$202(CraftARCameraView$CraftARSurfaceView$OrientationListener, int)>
						//    4    8:pop             
							executeOnce = true;
						//    5    9:aload_0         
						//    6   10:getfield        #23  <Field CraftARCameraView$CraftARSurfaceView$OrientationListener this$2>
						//    7   13:iconst_1        
						//    8   14:putfield        #36  <Field boolean CraftARCameraView$CraftARSurfaceView$OrientationListener.executeOnce>
						//    9   17:return          
						}

						final CraftARSurfaceView.OrientationListener this$2;

			
			{
				this$2 = CraftARSurfaceView.OrientationListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CraftARCameraView$CraftARSurfaceView$OrientationListener this$2>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #26  <Method void Object()>
			//    5    9:return          
			}
					}
);
		//   46   97:aload_0         
		//   47   98:getfield        #23  <Field CraftARCameraView$CraftARSurfaceView this$1>
		//   48  101:invokestatic    #91  <Method CameraThread CraftARCameraView$CraftARSurfaceView.access$300(CraftARCameraView$CraftARSurfaceView)>
		//   49  104:new             #12  <Class CraftARCameraView$CraftARSurfaceView$OrientationListener$1>
		//   50  107:dup             
		//   51  108:aload_0         
		//   52  109:invokespecial   #94  <Method void CraftARCameraView$CraftARSurfaceView$OrientationListener$1(CraftARCameraView$CraftARSurfaceView$OrientationListener)>
		//   53  112:invokevirtual   #100 <Method void CameraThread.setCameraDisplayOrientation(CameraThread$DisplayOrientationCallback)>
				}
			}
		//   54  115:return          
		}

		public void resetOrientation()
		{
			lastOrientation = -1;
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:putfield        #33  <Field int lastOrientation>
		//    3    5:return          
		}

		int currentOrientation;
		boolean executeOnce;
		private int lastOrientation;
		final CraftARSurfaceView this$1;


/*
		static int access$202(CraftARSurfaceView.OrientationListener orientationlistener, int i)
		{
			orientationlistener.lastOrientation = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #33  <Field int lastOrientation>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/

		public CraftARSurfaceView.OrientationListener(Context context)
		{
			this$1 = CraftARSurfaceView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field CraftARCameraView$CraftARSurfaceView this$1>
			super(context, 3);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:iconst_3        
		//    6    8:invokespecial   #26  <Method void OrientationEventListener(Context, int)>
			executeOnce = true;
		//    7   11:aload_0         
		//    8   12:iconst_1        
		//    9   13:putfield        #28  <Field boolean executeOnce>
		//   10   16:return          
		}
	}


	public CraftARCameraView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void FrameLayout(Context)>
	//    3    5:return          
	}

	public CraftARCameraView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method void FrameLayout(Context, AttributeSet)>
		if(isInEditMode())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #40  <Method boolean isInEditMode()>
	//*   6   10:ifeq            14
		{
			return;
	//    7   13:return          
		} else
		{
			mContext = context;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #42  <Field Context mContext>
			getViewTreeObserver().addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   11   19:aload_0         
	//   12   20:invokevirtual   #46  <Method ViewTreeObserver getViewTreeObserver()>
	//   13   23:aload_0         
	//   14   24:invokevirtual   #52  <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			AppEventForwarder.addAppEventListener(((AppEventListener) (this)));
	//   15   27:aload_0         
	//   16   28:invokestatic    #58  <Method void AppEventForwarder.addAppEventListener(AppEventListener)>
			return;
	//   17   31:return          
		}
	}

	private void createSurface()
	{
		mSurfaceView = new CraftARSurfaceView(mContext);
	//    0    0:aload_0         
	//    1    1:new             #10  <Class CraftARCameraView$CraftARSurfaceView>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #42  <Field Context mContext>
	//    6   10:invokespecial   #71  <Method void CraftARCameraView$CraftARSurfaceView(CraftARCameraView, Context)>
	//    7   13:putfield        #73  <Field CraftARCameraView$CraftARSurfaceView mSurfaceView>
		mSurfaceView.setParentView(this);
	//    8   16:aload_0         
	//    9   17:getfield        #73  <Field CraftARCameraView$CraftARSurfaceView mSurfaceView>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #77  <Method void CraftARCameraView$CraftARSurfaceView.setParentView(CraftARCameraView)>
		android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(getMeasuredWidth(), getMeasuredHeight());
	//   12   24:new             #79  <Class android.widget.FrameLayout$LayoutParams>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokevirtual   #83  <Method int getMeasuredWidth()>
	//   16   32:aload_0         
	//   17   33:invokevirtual   #86  <Method int getMeasuredHeight()>
	//   18   36:invokespecial   #89  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   19   39:astore_1        
		layoutparams.gravity = 17;
	//   20   40:aload_1         
	//   21   41:bipush          17
	//   22   43:putfield        #93  <Field int android.widget.FrameLayout$LayoutParams.gravity>
		mSurfaceView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   23   46:aload_0         
	//   24   47:getfield        #73  <Field CraftARCameraView$CraftARSurfaceView mSurfaceView>
	//   25   50:aload_1         
	//   26   51:invokevirtual   #97  <Method void CraftARCameraView$CraftARSurfaceView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		mSurfaceView.setParentMeasures(getMeasuredWidth(), getMeasuredHeight());
	//   27   54:aload_0         
	//   28   55:getfield        #73  <Field CraftARCameraView$CraftARSurfaceView mSurfaceView>
	//   29   58:aload_0         
	//   30   59:invokevirtual   #83  <Method int getMeasuredWidth()>
	//   31   62:aload_0         
	//   32   63:invokevirtual   #86  <Method int getMeasuredHeight()>
	//   33   66:invokevirtual   #100 <Method void CraftARCameraView$CraftARSurfaceView.setParentMeasures(int, int)>
		VideoCaptureConsumerHub.Instance().requestNV21Frames(((VideoCaptureConsumerHub.NV21VideoCaptureConsumer) (mSurfaceView)), true);
	//   34   69:invokestatic    #106 <Method VideoCaptureConsumerHub VideoCaptureConsumerHub.Instance()>
	//   35   72:aload_0         
	//   36   73:getfield        #73  <Field CraftARCameraView$CraftARSurfaceView mSurfaceView>
	//   37   76:iconst_1        
	//   38   77:invokevirtual   #110 <Method boolean VideoCaptureConsumerHub.requestNV21Frames(VideoCaptureConsumerHub$NV21VideoCaptureConsumer, boolean)>
	//   39   80:pop             
	//   40   81:return          
	}

	private void removeGlobalLayoutListener()
	{
		CLog.d("A:OnDetachedFromWIndow");
	//    0    0:ldc1            #116 <String "A:OnDetachedFromWIndow">
	//    1    2:invokestatic    #122 <Method void CLog.d(String)>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   2    5:getstatic       #127 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    8:bipush          16
	//*   4   10:icmplt          27
		{
			CLog.d("A:RemoveOnGlobalLayoutListener");
	//    5   13:ldc1            #129 <String "A:RemoveOnGlobalLayoutListener">
	//    6   15:invokestatic    #122 <Method void CLog.d(String)>
			getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//    7   18:aload_0         
	//    8   19:invokevirtual   #46  <Method ViewTreeObserver getViewTreeObserver()>
	//    9   22:aload_0         
	//   10   23:invokevirtual   #132 <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			return;
	//   11   26:return          
		} else
		{
			CLog.d("B:RemoveGlobalOnLayoutListener");
	//   12   27:ldc1            #134 <String "B:RemoveGlobalOnLayoutListener">
	//   13   29:invokestatic    #122 <Method void CLog.d(String)>
			getViewTreeObserver().removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   14   32:aload_0         
	//   15   33:invokevirtual   #46  <Method ViewTreeObserver getViewTreeObserver()>
	//   16   36:aload_0         
	//   17   37:invokevirtual   #137 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			return;
	//   18   40:return          
		}
	}

	public void onAppFinish()
	{
	//    0    0:return          
	}

	public void onAppPause()
	{
	//    0    0:return          
	}

	public void onAppResume()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #143 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #145 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("onAppResume in CraftARCameraView : ");
	//    4    8:aload_1         
	//    5    9:ldc1            #147 <String "onAppResume in CraftARCameraView : ">
	//    6   11:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(((Object) (this)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #154 <Method StringBuilder StringBuilder.append(Object)>
	//   11   20:pop             
		CLog.d(((StringBuilder) (obj)).toString());
	//   12   21:aload_1         
	//   13   22:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   14   25:invokestatic    #122 <Method void CLog.d(String)>
		obj = ((Object) (mSurfaceView));
	//   15   28:aload_0         
	//   16   29:getfield        #73  <Field CraftARCameraView$CraftARSurfaceView mSurfaceView>
	//   17   32:astore_1        
		if(obj != null && ((CraftARSurfaceView) (obj)).surfaceHasBeenDestroyed())
	//*  18   33:aload_1         
	//*  19   34:ifnull          53
	//*  20   37:aload_1         
	//*  21   38:invokevirtual   #161 <Method boolean CraftARCameraView$CraftARSurfaceView.surfaceHasBeenDestroyed()>
	//*  22   41:ifeq            53
		{
			mSurfaceView = null;
	//   23   44:aload_0         
	//   24   45:aconst_null     
	//   25   46:putfield        #73  <Field CraftARCameraView$CraftARSurfaceView mSurfaceView>
			createSurface();
	//   26   49:aload_0         
	//   27   50:invokespecial   #163 <Method void createSurface()>
		}
	//   28   53:return          
	}

	public void onDetachedFromWindow()
	{
		AppEventForwarder.removeAppEventListener(((AppEventListener) (mSurfaceView)));
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field CraftARCameraView$CraftARSurfaceView mSurfaceView>
	//    2    4:invokestatic    #167 <Method void AppEventForwarder.removeAppEventListener(AppEventListener)>
		AppEventForwarder.removeAppEventListener(((AppEventListener) (this)));
	//    3    7:aload_0         
	//    4    8:invokestatic    #167 <Method void AppEventForwarder.removeAppEventListener(AppEventListener)>
		super.onDetachedFromWindow();
	//    5   11:aload_0         
	//    6   12:invokespecial   #169 <Method void FrameLayout.onDetachedFromWindow()>
		removeGlobalLayoutListener();
	//    7   15:aload_0         
	//    8   16:invokespecial   #171 <Method void removeGlobalLayoutListener()>
	//    9   19:return          
	}

	public void onGlobalLayout()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #143 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #145 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("A: tree : width ");
	//    4    8:aload_1         
	//    5    9:ldc1            #174 <String "A: tree : width ">
	//    6   11:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getMeasuredWidth());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #83  <Method int getMeasuredWidth()>
	//   11   20:invokevirtual   #177 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(" height: ");
	//   13   24:aload_1         
	//   14   25:ldc1            #179 <String " height: ">
	//   15   27:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(getMeasuredHeight());
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:invokevirtual   #86  <Method int getMeasuredHeight()>
	//   20   36:invokevirtual   #177 <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		CLog.d(stringbuilder.toString());
	//   22   40:aload_1         
	//   23   41:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   24   44:invokestatic    #122 <Method void CLog.d(String)>
		if(getMeasuredHeight() > 0 && getMeasuredWidth() > 0)
	//*  25   47:aload_0         
	//*  26   48:invokevirtual   #86  <Method int getMeasuredHeight()>
	//*  27   51:ifle            76
	//*  28   54:aload_0         
	//*  29   55:invokevirtual   #83  <Method int getMeasuredWidth()>
	//*  30   58:ifle            76
		{
			removeGlobalLayoutListener();
	//   31   61:aload_0         
	//   32   62:invokespecial   #171 <Method void removeGlobalLayoutListener()>
			createSurface();
	//   33   65:aload_0         
	//   34   66:invokespecial   #163 <Method void createSurface()>
			AppEventForwarder.addAppEventListener(((AppEventListener) (mSurfaceView)));
	//   35   69:aload_0         
	//   36   70:getfield        #73  <Field CraftARCameraView$CraftARSurfaceView mSurfaceView>
	//   37   73:invokestatic    #58  <Method void AppEventForwarder.addAppEventListener(AppEventListener)>
		}
	//   38   76:return          
	}

	public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		super.setOnClickListener(onclicklistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #183 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
		mExternalClickListener = onclicklistener;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #62  <Field android.view.View$OnClickListener mExternalClickListener>
	//    6   10:return          
	}

	public void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
	{
		super.setOnTouchListener(ontouchlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #187 <Method void FrameLayout.setOnTouchListener(android.view.View$OnTouchListener)>
		mExternalTouchListener = ontouchlistener;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #66  <Field android.view.View$OnTouchListener mExternalTouchListener>
	//    6   10:return          
	}

	private Context mContext;
	private android.view.View.OnClickListener mExternalClickListener;
	private android.view.View.OnTouchListener mExternalTouchListener;
	private CraftARSurfaceView mSurfaceView;


/*
	static android.view.View.OnClickListener access$000(CraftARCameraView craftarcameraview)
	{
		return craftarcameraview.mExternalClickListener;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field android.view.View$OnClickListener mExternalClickListener>
	//    2    4:areturn         
	}

*/


/*
	static android.view.View.OnTouchListener access$400(CraftARCameraView craftarcameraview)
	{
		return craftarcameraview.mExternalTouchListener;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field android.view.View$OnTouchListener mExternalTouchListener>
	//    2    4:areturn         
	}

*/
}
