// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.screencast;

import android.app.Activity;
import android.graphics.*;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.inspector.elements.android.ActivityTracker;

// Referenced classes of package com.facebook.stetho.inspector.screencast:
//			ScreencastDispatcher

private class ScreencastDispatcher$BitmapFetchRunnable
	implements Runnable
{

	private void updateScreenBitmap()
	{
		Object obj;
		if(!ScreencastDispatcher.access$600(ScreencastDispatcher.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field ScreencastDispatcher this$0>
	//*   2    4:invokestatic    #29  <Method boolean ScreencastDispatcher.access$600(ScreencastDispatcher)>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		obj = ((Object) (ScreencastDispatcher.access$700(ScreencastDispatcher.this).tryGetTopActivity()));
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
		if(ScreencastDispatcher.access$800(ScreencastDispatcher.this) != null)
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
		f1 = ScreencastDispatcher.access$900(ScreencastDispatcher.this).maxWidth;
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
			f3 = ScreencastDispatcher.access$900(ScreencastDispatcher.this).maxHeight;
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
		ScreencastDispatcher.access$802(ScreencastDispatcher.this, Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.RGB_565));
		ScreencastDispatcher.access$1002(ScreencastDispatcher.this, new Canvas(ScreencastDispatcher.access$800(ScreencastDispatcher.this)));
		matrix = new Matrix();
		ScreencastDispatcher.access$1100(ScreencastDispatcher.this).set(0.0F, 0.0F, f, f1);
		ScreencastDispatcher.access$1200(ScreencastDispatcher.this).set(0.0F, 0.0F, i, j);
		matrix.setRectToRect(ScreencastDispatcher.access$1100(ScreencastDispatcher.this), ScreencastDispatcher.access$1200(ScreencastDispatcher.this), android.graphics.Matrix.ScaleToFit.CENTER);
		ScreencastDispatcher.access$1000(ScreencastDispatcher.this).setMatrix(matrix);
		OutOfMemoryError outofmemoryerror;
		((View) (obj)).draw(ScreencastDispatcher.access$1000(ScreencastDispatcher.this));
		return;
	//* 129  256:astore          7
	//* 130  258:goto            250
	}

	public void run()
	{
		updateScreenBitmap();
	//    0    0:aload_0         
	//    1    1:invokespecial   #157 <Method void updateScreenBitmap()>
		ScreencastDispatcher.access$500(ScreencastDispatcher.this).post(((Runnable) (e.access._mth400(ScreencastDispatcher.access$300(ScreencastDispatcher.this), ((Runnable) (this))))));
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

	private ScreencastDispatcher$BitmapFetchRunnable()
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

	ScreencastDispatcher$BitmapFetchRunnable(ScreencastDispatcher._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void ScreencastDispatcher$BitmapFetchRunnable(ScreencastDispatcher)>
	//    3    5:return          
	}
}
