// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.screencast;

import android.app.Activity;
import android.graphics.*;
import android.os.*;
import android.util.Base64OutputStream;
import android.view.View;
import android.view.Window;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.inspector.elements.android.ActivityTracker;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.io.ByteArrayOutputStream;

public final class ScreencastDispatcher
{
	private class BitmapFetchRunnable
		implements Runnable
	{

		private void updateScreenBitmap()
		{
			Object obj;
			if(!mIsRunning)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field ScreencastDispatcher this$0>
		//*   2    4:invokestatic    #29  <Method boolean ScreencastDispatcher.access$600(ScreencastDispatcher)>
		//*   3    7:ifne            11
				return;
		//    4   10:return          
			obj = ((Object) (mActivityTracker.tryGetTopActivity()));
		//    5   11:aload_0         
		//    6   12:getfield        #15  <Field ScreencastDispatcher this$0>
		//    7   15:invokestatic    #33  <Method ActivityTracker ScreencastDispatcher.access$700(ScreencastDispatcher)>
		//    8   18:invokevirtual   #39  <Method Activity ActivityTracker.tryGetTopActivity()>
		//    9   21:astore          7
			if(obj == null)
		//*  10   23:aload           7
		//*  11   25:ifnonnull       29
				return;
		//   12   28:return          
			obj = ((Object) (((Activity) (obj)).getWindow().getDecorView()));
		//   13   29:aload           7
		//   14   31:invokevirtual   #45  <Method Window Activity.getWindow()>
		//   15   34:invokevirtual   #51  <Method View Window.getDecorView()>
		//   16   37:astore          7
			float f1;
			int i;
			int j;
			if(mBitmap != null)
				break MISSING_BLOCK_LABEL_237;
		//   17   39:aload_0         
		//   18   40:getfield        #15  <Field ScreencastDispatcher this$0>
		//   19   43:invokestatic    #55  <Method Bitmap ScreencastDispatcher.access$800(ScreencastDispatcher)>
		//   20   46:ifnonnull       237
			i = ((View) (obj)).getWidth();
		//   21   49:aload           7
		//   22   51:invokevirtual   #61  <Method int View.getWidth()>
		//   23   54:istore          5
			j = ((View) (obj)).getHeight();
		//   24   56:aload           7
		//   25   58:invokevirtual   #64  <Method int View.getHeight()>
		//   26   61:istore          6
			f1 = mRequest.maxWidth;
		//   27   63:aload_0         
		//   28   64:getfield        #15  <Field ScreencastDispatcher this$0>
		//   29   67:invokestatic    #68  <Method com.facebook.stetho.inspector.protocol.module.Page$StartScreencastRequest ScreencastDispatcher.access$900(ScreencastDispatcher)>
		//   30   70:getfield        #74  <Field int com.facebook.stetho.inspector.protocol.module.Page$StartScreencastRequest.maxWidth>
		//   31   73:i2f             
		//   32   74:fstore_2        
			float f = i;
		//   33   75:iload           5
		//   34   77:i2f             
		//   35   78:fstore_1        
			float f2;
			float f3;
			Matrix matrix;
			try
			{
				f2 = f1 / f;
		//   36   79:fload_2         
		//   37   80:fload_1         
		//   38   81:fdiv            
		//   39   82:fstore_3        
				f3 = mRequest.maxHeight;
		//   40   83:aload_0         
		//   41   84:getfield        #15  <Field ScreencastDispatcher this$0>
		//   42   87:invokestatic    #68  <Method com.facebook.stetho.inspector.protocol.module.Page$StartScreencastRequest ScreencastDispatcher.access$900(ScreencastDispatcher)>
		//   43   90:getfield        #77  <Field int com.facebook.stetho.inspector.protocol.module.Page$StartScreencastRequest.maxHeight>
		//   44   93:i2f             
		//   45   94:fstore          4
			}
		//*  46   96:iload           6
		//*  47   98:i2f             
		//*  48   99:fstore_2        
		//*  49  100:fload_3         
		//*  50  101:fload           4
		//*  51  103:fload_2         
		//*  52  104:fdiv            
		//*  53  105:invokestatic    #83  <Method float Math.min(float, float)>
		//*  54  108:fstore_3        
		//*  55  109:fload_1         
		//*  56  110:fload_3         
		//*  57  111:fmul            
		//*  58  112:f2i             
		//*  59  113:istore          5
		//*  60  115:fload_3         
		//*  61  116:fload_2         
		//*  62  117:fmul            
		//*  63  118:f2i             
		//*  64  119:istore          6
		//*  65  121:aload_0         
		//*  66  122:getfield        #15  <Field ScreencastDispatcher this$0>
		//*  67  125:iload           5
		//*  68  127:iload           6
		//*  69  129:getstatic       #89  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
		//*  70  132:invokestatic    #95  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
		//*  71  135:invokestatic    #99  <Method Bitmap ScreencastDispatcher.access$802(ScreencastDispatcher, Bitmap)>
		//*  72  138:pop             
		//*  73  139:aload_0         
		//*  74  140:getfield        #15  <Field ScreencastDispatcher this$0>
		//*  75  143:new             #101 <Class Canvas>
		//*  76  146:dup             
		//*  77  147:aload_0         
		//*  78  148:getfield        #15  <Field ScreencastDispatcher this$0>
		//*  79  151:invokestatic    #55  <Method Bitmap ScreencastDispatcher.access$800(ScreencastDispatcher)>
		//*  80  154:invokespecial   #104 <Method void Canvas(Bitmap)>
		//*  81  157:invokestatic    #108 <Method Canvas ScreencastDispatcher.access$1002(ScreencastDispatcher, Canvas)>
		//*  82  160:pop             
		//*  83  161:new             #110 <Class Matrix>
		//*  84  164:dup             
		//*  85  165:invokespecial   #111 <Method void Matrix()>
		//*  86  168:astore          8
		//*  87  170:aload_0         
		//*  88  171:getfield        #15  <Field ScreencastDispatcher this$0>
		//*  89  174:invokestatic    #115 <Method RectF ScreencastDispatcher.access$1100(ScreencastDispatcher)>
		//*  90  177:fconst_0        
		//*  91  178:fconst_0        
		//*  92  179:fload_1         
		//*  93  180:fload_2         
		//*  94  181:invokevirtual   #121 <Method void RectF.set(float, float, float, float)>
		//*  95  184:aload_0         
		//*  96  185:getfield        #15  <Field ScreencastDispatcher this$0>
		//*  97  188:invokestatic    #124 <Method RectF ScreencastDispatcher.access$1200(ScreencastDispatcher)>
		//*  98  191:fconst_0        
		//*  99  192:fconst_0        
		//* 100  193:iload           5
		//* 101  195:i2f             
		//* 102  196:iload           6
		//* 103  198:i2f             
		//* 104  199:invokevirtual   #121 <Method void RectF.set(float, float, float, float)>
		//* 105  202:aload           8
		//* 106  204:aload_0         
		//* 107  205:getfield        #15  <Field ScreencastDispatcher this$0>
		//* 108  208:invokestatic    #115 <Method RectF ScreencastDispatcher.access$1100(ScreencastDispatcher)>
		//* 109  211:aload_0         
		//* 110  212:getfield        #15  <Field ScreencastDispatcher this$0>
		//* 111  215:invokestatic    #124 <Method RectF ScreencastDispatcher.access$1200(ScreencastDispatcher)>
		//* 112  218:getstatic       #130 <Field android.graphics.Matrix$ScaleToFit android.graphics.Matrix$ScaleToFit.CENTER>
		//* 113  221:invokevirtual   #134 <Method boolean Matrix.setRectToRect(RectF, RectF, android.graphics.Matrix$ScaleToFit)>
		//* 114  224:pop             
		//* 115  225:aload_0         
		//* 116  226:getfield        #15  <Field ScreencastDispatcher this$0>
		//* 117  229:invokestatic    #138 <Method Canvas ScreencastDispatcher.access$1000(ScreencastDispatcher)>
		//* 118  232:aload           8
		//* 119  234:invokevirtual   #142 <Method void Canvas.setMatrix(Matrix)>
		//* 120  237:aload           7
		//* 121  239:aload_0         
		//* 122  240:getfield        #15  <Field ScreencastDispatcher this$0>
		//* 123  243:invokestatic    #138 <Method Canvas ScreencastDispatcher.access$1000(ScreencastDispatcher)>
		//* 124  246:invokevirtual   #146 <Method void View.draw(Canvas)>
		//* 125  249:return          
		//* 126  250:ldc1            #148 <String "Out of memory trying to allocate screencast Bitmap.">
		//* 127  252:invokestatic    #154 <Method void LogUtil.w(String)>
		//* 128  255:return          
			// Misplaced declaration of an exception variable
			catch(OutOfMemoryError outofmemoryerror)
			{
				LogUtil.w("Out of memory trying to allocate screencast Bitmap.");
				return;
			}
			f1 = j;
			f2 = Math.min(f2, f3 / f1);
			i = (int)(f * f2);
			j = (int)(f2 * f1);
			mBitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.RGB_565);
			mCanvas = new Canvas(mBitmap);
			matrix = new Matrix();
			mTempSrc.set(0.0F, 0.0F, f, f1);
			mTempDst.set(0.0F, 0.0F, i, j);
			matrix.setRectToRect(mTempSrc, mTempDst, android.graphics.Matrix.ScaleToFit.CENTER);
			mCanvas.setMatrix(matrix);
			OutOfMemoryError outofmemoryerror;
			((View) (obj)).draw(mCanvas);
			return;
		//* 129  256:astore          7
		//* 130  258:goto            250
		}

		public void run()
		{
			updateScreenBitmap();
		//    0    0:aload_0         
		//    1    1:invokespecial   #157 <Method void updateScreenBitmap()>
			mBackgroundHandler.post(((Runnable) (mEventDispatchRunnable.withEndAction(((Runnable) (this))))));
		//    2    4:aload_0         
		//    3    5:getfield        #15  <Field ScreencastDispatcher this$0>
		//    4    8:invokestatic    #161 <Method Handler ScreencastDispatcher.access$500(ScreencastDispatcher)>
		//    5   11:aload_0         
		//    6   12:getfield        #15  <Field ScreencastDispatcher this$0>
		//    7   15:invokestatic    #165 <Method ScreencastDispatcher$EventDispatchRunnable ScreencastDispatcher.access$300(ScreencastDispatcher)>
		//    8   18:aload_0         
		//    9   19:invokestatic    #171 <Method ScreencastDispatcher$EventDispatchRunnable ScreencastDispatcher$EventDispatchRunnable.access$400(ScreencastDispatcher$EventDispatchRunnable, Runnable)>
		//   10   22:invokevirtual   #177 <Method boolean Handler.post(Runnable)>
		//   11   25:pop             
		//   12   26:return          
		}

		final ScreencastDispatcher this$0;

		private BitmapFetchRunnable()
		{
			this$0 = ScreencastDispatcher.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ScreencastDispatcher this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	private class CancellationRunnable
		implements Runnable
	{

		public void run()
		{
			mHandlerThread.interrupt();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field ScreencastDispatcher this$0>
		//    2    4:invokestatic    #27  <Method HandlerThread ScreencastDispatcher.access$1800(ScreencastDispatcher)>
		//    3    7:invokevirtual   #32  <Method void HandlerThread.interrupt()>
			mMainHandler.removeCallbacks(((Runnable) (mBitmapFetchRunnable)));
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field ScreencastDispatcher this$0>
		//    6   14:invokestatic    #36  <Method Handler ScreencastDispatcher.access$1700(ScreencastDispatcher)>
		//    7   17:aload_0         
		//    8   18:getfield        #15  <Field ScreencastDispatcher this$0>
		//    9   21:invokestatic    #40  <Method ScreencastDispatcher$BitmapFetchRunnable ScreencastDispatcher.access$1900(ScreencastDispatcher)>
		//   10   24:invokevirtual   #46  <Method void Handler.removeCallbacks(Runnable)>
			mBackgroundHandler.removeCallbacks(((Runnable) (mEventDispatchRunnable)));
		//   11   27:aload_0         
		//   12   28:getfield        #15  <Field ScreencastDispatcher this$0>
		//   13   31:invokestatic    #49  <Method Handler ScreencastDispatcher.access$500(ScreencastDispatcher)>
		//   14   34:aload_0         
		//   15   35:getfield        #15  <Field ScreencastDispatcher this$0>
		//   16   38:invokestatic    #53  <Method ScreencastDispatcher$EventDispatchRunnable ScreencastDispatcher.access$300(ScreencastDispatcher)>
		//   17   41:invokevirtual   #46  <Method void Handler.removeCallbacks(Runnable)>
			mIsRunning = false;
		//   18   44:aload_0         
		//   19   45:getfield        #15  <Field ScreencastDispatcher this$0>
		//   20   48:iconst_0        
		//   21   49:invokestatic    #57  <Method boolean ScreencastDispatcher.access$602(ScreencastDispatcher, boolean)>
		//   22   52:pop             
			mHandlerThread = null;
		//   23   53:aload_0         
		//   24   54:getfield        #15  <Field ScreencastDispatcher this$0>
		//   25   57:aconst_null     
		//   26   58:invokestatic    #61  <Method HandlerThread ScreencastDispatcher.access$1802(ScreencastDispatcher, HandlerThread)>
		//   27   61:pop             
			mBitmap = null;
		//   28   62:aload_0         
		//   29   63:getfield        #15  <Field ScreencastDispatcher this$0>
		//   30   66:aconst_null     
		//   31   67:invokestatic    #65  <Method Bitmap ScreencastDispatcher.access$802(ScreencastDispatcher, Bitmap)>
		//   32   70:pop             
			mCanvas = null;
		//   33   71:aload_0         
		//   34   72:getfield        #15  <Field ScreencastDispatcher this$0>
		//   35   75:aconst_null     
		//   36   76:invokestatic    #69  <Method Canvas ScreencastDispatcher.access$1002(ScreencastDispatcher, Canvas)>
		//   37   79:pop             
			mStream = null;
		//   38   80:aload_0         
		//   39   81:getfield        #15  <Field ScreencastDispatcher this$0>
		//   40   84:aconst_null     
		//   41   85:invokestatic    #73  <Method ByteArrayOutputStream ScreencastDispatcher.access$1302(ScreencastDispatcher, ByteArrayOutputStream)>
		//   42   88:pop             
		//   43   89:return          
		}

		final ScreencastDispatcher this$0;

		private CancellationRunnable()
		{
			this$0 = ScreencastDispatcher.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ScreencastDispatcher this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	private class EventDispatchRunnable
		implements Runnable
	{

		private EventDispatchRunnable withEndAction(Runnable runnable)
		{
			mEndAction = runnable;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #32  <Field Runnable mEndAction>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public void run()
		{
			if(mIsRunning)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field ScreencastDispatcher this$0>
		//*   2    4:invokestatic    #37  <Method boolean ScreencastDispatcher.access$600(ScreencastDispatcher)>
		//*   3    7:ifeq            220
			{
				if(mBitmap == null)
		//*   4   10:aload_0         
		//*   5   11:getfield        #17  <Field ScreencastDispatcher this$0>
		//*   6   14:invokestatic    #41  <Method Bitmap ScreencastDispatcher.access$800(ScreencastDispatcher)>
		//*   7   17:ifnonnull       21
				{
					return;
		//    8   20:return          
				} else
				{
					int i = mBitmap.getWidth();
		//    9   21:aload_0         
		//   10   22:getfield        #17  <Field ScreencastDispatcher this$0>
		//   11   25:invokestatic    #41  <Method Bitmap ScreencastDispatcher.access$800(ScreencastDispatcher)>
		//   12   28:invokevirtual   #47  <Method int Bitmap.getWidth()>
		//   13   31:istore_1        
					int j = mBitmap.getHeight();
		//   14   32:aload_0         
		//   15   33:getfield        #17  <Field ScreencastDispatcher this$0>
		//   16   36:invokestatic    #41  <Method Bitmap ScreencastDispatcher.access$800(ScreencastDispatcher)>
		//   17   39:invokevirtual   #50  <Method int Bitmap.getHeight()>
		//   18   42:istore_2        
					mStream.reset();
		//   19   43:aload_0         
		//   20   44:getfield        #17  <Field ScreencastDispatcher this$0>
		//   21   47:invokestatic    #54  <Method ByteArrayOutputStream ScreencastDispatcher.access$1300(ScreencastDispatcher)>
		//   22   50:invokevirtual   #59  <Method void ByteArrayOutputStream.reset()>
					Base64OutputStream base64outputstream = new Base64OutputStream(((java.io.OutputStream) (mStream)), 0);
		//   23   53:new             #61  <Class Base64OutputStream>
		//   24   56:dup             
		//   25   57:aload_0         
		//   26   58:getfield        #17  <Field ScreencastDispatcher this$0>
		//   27   61:invokestatic    #54  <Method ByteArrayOutputStream ScreencastDispatcher.access$1300(ScreencastDispatcher)>
		//   28   64:iconst_0        
		//   29   65:invokespecial   #64  <Method void Base64OutputStream(java.io.OutputStream, int)>
		//   30   68:astore_3        
					android.graphics.Bitmap.CompressFormat compressformat = android.graphics.Bitmap.CompressFormat.valueOf(mRequest.format.toUpperCase());
		//   31   69:aload_0         
		//   32   70:getfield        #17  <Field ScreencastDispatcher this$0>
		//   33   73:invokestatic    #68  <Method com.facebook.stetho.inspector.protocol.module.Page$StartScreencastRequest ScreencastDispatcher.access$900(ScreencastDispatcher)>
		//   34   76:getfield        #74  <Field String com.facebook.stetho.inspector.protocol.module.Page$StartScreencastRequest.format>
		//   35   79:invokevirtual   #80  <Method String String.toUpperCase()>
		//   36   82:invokestatic    #86  <Method android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.valueOf(String)>
		//   37   85:astore          4
					mBitmap.compress(compressformat, mRequest.quality, ((java.io.OutputStream) (base64outputstream)));
		//   38   87:aload_0         
		//   39   88:getfield        #17  <Field ScreencastDispatcher this$0>
		//   40   91:invokestatic    #41  <Method Bitmap ScreencastDispatcher.access$800(ScreencastDispatcher)>
		//   41   94:aload           4
		//   42   96:aload_0         
		//   43   97:getfield        #17  <Field ScreencastDispatcher this$0>
		//   44  100:invokestatic    #68  <Method com.facebook.stetho.inspector.protocol.module.Page$StartScreencastRequest ScreencastDispatcher.access$900(ScreencastDispatcher)>
		//   45  103:getfield        #90  <Field int com.facebook.stetho.inspector.protocol.module.Page$StartScreencastRequest.quality>
		//   46  106:aload_3         
		//   47  107:invokevirtual   #94  <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
		//   48  110:pop             
					mEvent.data = mStream.toString();
		//   49  111:aload_0         
		//   50  112:getfield        #17  <Field ScreencastDispatcher this$0>
		//   51  115:invokestatic    #98  <Method com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEvent ScreencastDispatcher.access$1400(ScreencastDispatcher)>
		//   52  118:aload_0         
		//   53  119:getfield        #17  <Field ScreencastDispatcher this$0>
		//   54  122:invokestatic    #54  <Method ByteArrayOutputStream ScreencastDispatcher.access$1300(ScreencastDispatcher)>
		//   55  125:invokevirtual   #101 <Method String ByteArrayOutputStream.toString()>
		//   56  128:putfield        #106 <Field String com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEvent.data>
					mMetadata.pageScaleFactor = 1;
		//   57  131:aload_0         
		//   58  132:getfield        #17  <Field ScreencastDispatcher this$0>
		//   59  135:invokestatic    #110 <Method com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata ScreencastDispatcher.access$1500(ScreencastDispatcher)>
		//   60  138:iconst_1        
		//   61  139:putfield        #115 <Field int com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata.pageScaleFactor>
					mMetadata.deviceWidth = i;
		//   62  142:aload_0         
		//   63  143:getfield        #17  <Field ScreencastDispatcher this$0>
		//   64  146:invokestatic    #110 <Method com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata ScreencastDispatcher.access$1500(ScreencastDispatcher)>
		//   65  149:iload_1         
		//   66  150:putfield        #118 <Field int com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata.deviceWidth>
					mMetadata.deviceHeight = j;
		//   67  153:aload_0         
		//   68  154:getfield        #17  <Field ScreencastDispatcher this$0>
		//   69  157:invokestatic    #110 <Method com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata ScreencastDispatcher.access$1500(ScreencastDispatcher)>
		//   70  160:iload_2         
		//   71  161:putfield        #121 <Field int com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata.deviceHeight>
					mEvent.metadata = mMetadata;
		//   72  164:aload_0         
		//   73  165:getfield        #17  <Field ScreencastDispatcher this$0>
		//   74  168:invokestatic    #98  <Method com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEvent ScreencastDispatcher.access$1400(ScreencastDispatcher)>
		//   75  171:aload_0         
		//   76  172:getfield        #17  <Field ScreencastDispatcher this$0>
		//   77  175:invokestatic    #110 <Method com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata ScreencastDispatcher.access$1500(ScreencastDispatcher)>
		//   78  178:putfield        #125 <Field com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEvent.metadata>
					mPeer.invokeMethod("Page.screencastFrame", ((Object) (mEvent)), ((com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback) (null)));
		//   79  181:aload_0         
		//   80  182:getfield        #17  <Field ScreencastDispatcher this$0>
		//   81  185:invokestatic    #129 <Method JsonRpcPeer ScreencastDispatcher.access$1600(ScreencastDispatcher)>
		//   82  188:ldc1            #131 <String "Page.screencastFrame">
		//   83  190:aload_0         
		//   84  191:getfield        #17  <Field ScreencastDispatcher this$0>
		//   85  194:invokestatic    #98  <Method com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEvent ScreencastDispatcher.access$1400(ScreencastDispatcher)>
		//   86  197:aconst_null     
		//   87  198:invokevirtual   #137 <Method void JsonRpcPeer.invokeMethod(String, Object, com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback)>
					mMainHandler.postDelayed(mEndAction, 200L);
		//   88  201:aload_0         
		//   89  202:getfield        #17  <Field ScreencastDispatcher this$0>
		//   90  205:invokestatic    #141 <Method Handler ScreencastDispatcher.access$1700(ScreencastDispatcher)>
		//   91  208:aload_0         
		//   92  209:getfield        #32  <Field Runnable mEndAction>
		//   93  212:ldc2w           #142 <Long 200L>
		//   94  215:invokevirtual   #149 <Method boolean Handler.postDelayed(Runnable, long)>
		//   95  218:pop             
					return;
		//   96  219:return          
				}
			} else
			{
				return;
		//   97  220:return          
			}
		}

		private Runnable mEndAction;
		final ScreencastDispatcher this$0;


/*
		static EventDispatchRunnable access$400(EventDispatchRunnable eventdispatchrunnable, Runnable runnable)
		{
			return eventdispatchrunnable.withEndAction(runnable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #30  <Method ScreencastDispatcher$EventDispatchRunnable withEndAction(Runnable)>
		//    3    5:areturn         
		}

*/

		private EventDispatchRunnable()
		{
			this$0 = ScreencastDispatcher.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ScreencastDispatcher this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}

	}


	public ScreencastDispatcher()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #55  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #61  <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #64  <Method void Handler(Looper)>
	//    7   15:putfield        #66  <Field Handler mMainHandler>
	//    8   18:aload_0         
	//    9   19:new             #8   <Class ScreencastDispatcher$BitmapFetchRunnable>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:invokespecial   #69  <Method void ScreencastDispatcher$BitmapFetchRunnable(ScreencastDispatcher, ScreencastDispatcher$1)>
	//   14   28:putfield        #71  <Field ScreencastDispatcher$BitmapFetchRunnable mBitmapFetchRunnable>
	//   15   31:aload_0         
	//   16   32:invokestatic    #77  <Method ActivityTracker ActivityTracker.get()>
	//   17   35:putfield        #79  <Field ActivityTracker mActivityTracker>
	//   18   38:aload_0         
	//   19   39:new             #14  <Class ScreencastDispatcher$EventDispatchRunnable>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:invokespecial   #80  <Method void ScreencastDispatcher$EventDispatchRunnable(ScreencastDispatcher, ScreencastDispatcher$1)>
	//   24   48:putfield        #82  <Field ScreencastDispatcher$EventDispatchRunnable mEventDispatchRunnable>
	//   25   51:aload_0         
	//   26   52:new             #84  <Class RectF>
	//   27   55:dup             
	//   28   56:invokespecial   #85  <Method void RectF()>
	//   29   59:putfield        #87  <Field RectF mTempSrc>
	//   30   62:aload_0         
	//   31   63:new             #84  <Class RectF>
	//   32   66:dup             
	//   33   67:invokespecial   #85  <Method void RectF()>
	//   34   70:putfield        #89  <Field RectF mTempDst>
		mEvent = new com.facebook.stetho.inspector.protocol.module.Page.ScreencastFrameEvent();
	//   35   73:aload_0         
	//   36   74:new             #91  <Class com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEvent>
	//   37   77:dup             
	//   38   78:invokespecial   #92  <Method void com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEvent()>
	//   39   81:putfield        #94  <Field com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEvent mEvent>
		mMetadata = new com.facebook.stetho.inspector.protocol.module.Page.ScreencastFrameEventMetadata();
	//   40   84:aload_0         
	//   41   85:new             #96  <Class com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata>
	//   42   88:dup             
	//   43   89:invokespecial   #97  <Method void com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata()>
	//   44   92:putfield        #99  <Field com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata mMetadata>
	//   45   95:return          
	}

	public void startScreencast(JsonRpcPeer jsonrpcpeer, com.facebook.stetho.inspector.protocol.module.Page.StartScreencastRequest startscreencastrequest)
	{
		LogUtil.d("Starting screencast");
	//    0    0:ldc1            #160 <String "Starting screencast">
	//    1    2:invokestatic    #166 <Method void LogUtil.d(String)>
		mRequest = startscreencastrequest;
	//    2    5:aload_0         
	//    3    6:aload_2         
	//    4    7:putfield        #156 <Field com.facebook.stetho.inspector.protocol.module.Page$StartScreencastRequest mRequest>
		mHandlerThread = new HandlerThread("Screencast Thread");
	//    5   10:aload_0         
	//    6   11:new             #168 <Class HandlerThread>
	//    7   14:dup             
	//    8   15:ldc1            #170 <String "Screencast Thread">
	//    9   17:invokespecial   #172 <Method void HandlerThread(String)>
	//   10   20:putfield        #129 <Field HandlerThread mHandlerThread>
		mHandlerThread.start();
	//   11   23:aload_0         
	//   12   24:getfield        #129 <Field HandlerThread mHandlerThread>
	//   13   27:invokevirtual   #175 <Method void HandlerThread.start()>
		mPeer = jsonrpcpeer;
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:putfield        #123 <Field JsonRpcPeer mPeer>
		mIsRunning = true;
	//   17   35:aload_0         
	//   18   36:iconst_1        
	//   19   37:putfield        #142 <Field boolean mIsRunning>
		mStream = new ByteArrayOutputStream();
	//   20   40:aload_0         
	//   21   41:new             #177 <Class ByteArrayOutputStream>
	//   22   44:dup             
	//   23   45:invokespecial   #178 <Method void ByteArrayOutputStream()>
	//   24   48:putfield        #113 <Field ByteArrayOutputStream mStream>
		mBackgroundHandler = new Handler(mHandlerThread.getLooper());
	//   25   51:aload_0         
	//   26   52:new             #55  <Class Handler>
	//   27   55:dup             
	//   28   56:aload_0         
	//   29   57:getfield        #129 <Field HandlerThread mHandlerThread>
	//   30   60:invokevirtual   #181 <Method Looper HandlerThread.getLooper()>
	//   31   63:invokespecial   #64  <Method void Handler(Looper)>
	//   32   66:putfield        #138 <Field Handler mBackgroundHandler>
		mMainHandler.postDelayed(((Runnable) (mBitmapFetchRunnable)), 200L);
	//   33   69:aload_0         
	//   34   70:getfield        #66  <Field Handler mMainHandler>
	//   35   73:aload_0         
	//   36   74:getfield        #71  <Field ScreencastDispatcher$BitmapFetchRunnable mBitmapFetchRunnable>
	//   37   77:ldc2w           #18  <Long 200L>
	//   38   80:invokevirtual   #185 <Method boolean Handler.postDelayed(Runnable, long)>
	//   39   83:pop             
	//   40   84:return          
	}

	public void stopScreencast()
	{
		LogUtil.d("Stopping screencast");
	//    0    0:ldc1            #188 <String "Stopping screencast">
	//    1    2:invokestatic    #166 <Method void LogUtil.d(String)>
		mBackgroundHandler.post(((Runnable) (new CancellationRunnable())));
	//    2    5:aload_0         
	//    3    6:getfield        #138 <Field Handler mBackgroundHandler>
	//    4    9:new             #11  <Class ScreencastDispatcher$CancellationRunnable>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:aconst_null     
	//    8   15:invokespecial   #189 <Method void ScreencastDispatcher$CancellationRunnable(ScreencastDispatcher, ScreencastDispatcher$1)>
	//    9   18:invokevirtual   #193 <Method boolean Handler.post(Runnable)>
	//   10   21:pop             
	//   11   22:return          
	}

	private static final long FRAME_DELAY = 200L;
	private final ActivityTracker mActivityTracker = ActivityTracker.get();
	private Handler mBackgroundHandler;
	private Bitmap mBitmap;
	private final BitmapFetchRunnable mBitmapFetchRunnable = new BitmapFetchRunnable();
	private Canvas mCanvas;
	private com.facebook.stetho.inspector.protocol.module.Page.ScreencastFrameEvent mEvent;
	private final EventDispatchRunnable mEventDispatchRunnable = new EventDispatchRunnable();
	private HandlerThread mHandlerThread;
	private boolean mIsRunning;
	private final Handler mMainHandler = new Handler(Looper.getMainLooper());
	private com.facebook.stetho.inspector.protocol.module.Page.ScreencastFrameEventMetadata mMetadata;
	private JsonRpcPeer mPeer;
	private com.facebook.stetho.inspector.protocol.module.Page.StartScreencastRequest mRequest;
	private ByteArrayOutputStream mStream;
	private final RectF mTempDst = new RectF();
	private final RectF mTempSrc = new RectF();


/*
	static Canvas access$1000(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mCanvas;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Canvas mCanvas>
	//    2    4:areturn         
	}

*/


/*
	static Canvas access$1002(ScreencastDispatcher screencastdispatcher, Canvas canvas)
	{
		screencastdispatcher.mCanvas = canvas;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #104 <Field Canvas mCanvas>
		return canvas;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static RectF access$1100(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mTempSrc;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field RectF mTempSrc>
	//    2    4:areturn         
	}

*/


/*
	static RectF access$1200(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mTempDst;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RectF mTempDst>
	//    2    4:areturn         
	}

*/


/*
	static ByteArrayOutputStream access$1300(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mStream;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field ByteArrayOutputStream mStream>
	//    2    4:areturn         
	}

*/


/*
	static ByteArrayOutputStream access$1302(ScreencastDispatcher screencastdispatcher, ByteArrayOutputStream bytearrayoutputstream)
	{
		screencastdispatcher.mStream = bytearrayoutputstream;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field ByteArrayOutputStream mStream>
		return bytearrayoutputstream;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static com.facebook.stetho.inspector.protocol.module.Page.ScreencastFrameEvent access$1400(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mEvent;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEvent mEvent>
	//    2    4:areturn         
	}

*/


/*
	static com.facebook.stetho.inspector.protocol.module.Page.ScreencastFrameEventMetadata access$1500(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mMetadata;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata mMetadata>
	//    2    4:areturn         
	}

*/


/*
	static JsonRpcPeer access$1600(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mPeer;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field JsonRpcPeer mPeer>
	//    2    4:areturn         
	}

*/


/*
	static Handler access$1700(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mMainHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Handler mMainHandler>
	//    2    4:areturn         
	}

*/


/*
	static HandlerThread access$1800(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mHandlerThread;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field HandlerThread mHandlerThread>
	//    2    4:areturn         
	}

*/


/*
	static HandlerThread access$1802(ScreencastDispatcher screencastdispatcher, HandlerThread handlerthread)
	{
		screencastdispatcher.mHandlerThread = handlerthread;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #129 <Field HandlerThread mHandlerThread>
		return handlerthread;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static BitmapFetchRunnable access$1900(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mBitmapFetchRunnable;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ScreencastDispatcher$BitmapFetchRunnable mBitmapFetchRunnable>
	//    2    4:areturn         
	}

*/


/*
	static EventDispatchRunnable access$300(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mEventDispatchRunnable;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field ScreencastDispatcher$EventDispatchRunnable mEventDispatchRunnable>
	//    2    4:areturn         
	}

*/


/*
	static Handler access$500(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mBackgroundHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field Handler mBackgroundHandler>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$600(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mIsRunning;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field boolean mIsRunning>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$602(ScreencastDispatcher screencastdispatcher, boolean flag)
	{
		screencastdispatcher.mIsRunning = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #142 <Field boolean mIsRunning>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static ActivityTracker access$700(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mActivityTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field ActivityTracker mActivityTracker>
	//    2    4:areturn         
	}

*/


/*
	static Bitmap access$800(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mBitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field Bitmap mBitmap>
	//    2    4:areturn         
	}

*/


/*
	static Bitmap access$802(ScreencastDispatcher screencastdispatcher, Bitmap bitmap)
	{
		screencastdispatcher.mBitmap = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #150 <Field Bitmap mBitmap>
		return bitmap;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static com.facebook.stetho.inspector.protocol.module.Page.StartScreencastRequest access$900(ScreencastDispatcher screencastdispatcher)
	{
		return screencastdispatcher.mRequest;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field com.facebook.stetho.inspector.protocol.module.Page$StartScreencastRequest mRequest>
	//    2    4:areturn         
	}

*/
}
