// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.*;
import android.util.Log;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			BitmapResource, TransformationUtils

final class DrawableToBitmapConverter
{

	private DrawableToBitmapConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	static Resource convert(BitmapPool bitmappool, Drawable drawable, int i, int j)
	{
		drawable = drawable.getCurrent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #30  <Method Drawable Drawable.getCurrent()>
	//    2    4:astore_1        
		boolean flag1 = drawable instanceof BitmapDrawable;
	//    3    5:aload_1         
	//    4    6:instanceof      #32  <Class BitmapDrawable>
	//    5    9:istore          5
		boolean flag = false;
	//    6   11:iconst_0        
	//    7   12:istore          4
		if(flag1)
	//*   8   14:iload           5
	//*   9   16:ifeq            33
		{
			drawable = ((Drawable) (((BitmapDrawable)drawable).getBitmap()));
	//   10   19:aload_1         
	//   11   20:checkcast       #32  <Class BitmapDrawable>
	//   12   23:invokevirtual   #36  <Method Bitmap BitmapDrawable.getBitmap()>
	//   13   26:astore_1        
			i = ((int) (flag));
	//   14   27:iload           4
	//   15   29:istore_2        
		} else
	//*  16   30:goto            58
		if(!(drawable instanceof Animatable))
	//*  17   33:aload_1         
	//*  18   34:instanceof      #38  <Class Animatable>
	//*  19   37:ifne            53
		{
			drawable = ((Drawable) (drawToBitmap(bitmappool, drawable, i, j)));
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:iload_2         
	//   23   43:iload_3         
	//   24   44:invokestatic    #42  <Method Bitmap drawToBitmap(BitmapPool, Drawable, int, int)>
	//   25   47:astore_1        
			i = 1;
	//   26   48:iconst_1        
	//   27   49:istore_2        
		} else
	//*  28   50:goto            58
		{
			drawable = null;
	//   29   53:aconst_null     
	//   30   54:astore_1        
			i = ((int) (flag));
	//   31   55:iload           4
	//   32   57:istore_2        
		}
		if(i == 0)
	//*  33   58:iload_2         
	//*  34   59:ifeq            65
	//*  35   62:goto            69
			bitmappool = NO_RECYCLE_BITMAP_POOL;
	//   36   65:getstatic       #19  <Field BitmapPool NO_RECYCLE_BITMAP_POOL>
	//   37   68:astore_0        
		return ((Resource) (BitmapResource.obtain(((Bitmap) (drawable)), bitmappool)));
	//   38   69:aload_1         
	//   39   70:aload_0         
	//   40   71:invokestatic    #48  <Method BitmapResource BitmapResource.obtain(Bitmap, BitmapPool)>
	//   41   74:areturn         
	}

	private static Bitmap drawToBitmap(BitmapPool bitmappool, Drawable drawable, int i, int j)
	{
		Lock lock;
		if(i == 0x80000000 && drawable.getIntrinsicWidth() <= 0)
	//*   0    0:iload_2         
	//*   1    1:ldc1            #52  <Int 0x80000000>
	//*   2    3:icmpne          62
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #56  <Method int Drawable.getIntrinsicWidth()>
	//*   5   10:ifgt            62
		{
			if(Log.isLoggable("DrawableToBitmap", 5))
	//*   6   13:ldc1            #12  <String "DrawableToBitmap">
	//*   7   15:iconst_5        
	//*   8   16:invokestatic    #62  <Method boolean Log.isLoggable(String, int)>
	//*   9   19:ifeq            60
			{
				bitmappool = ((BitmapPool) (new StringBuilder()));
	//   10   22:new             #64  <Class StringBuilder>
	//   11   25:dup             
	//   12   26:invokespecial   #65  <Method void StringBuilder()>
	//   13   29:astore_0        
				((StringBuilder) (bitmappool)).append("Unable to draw ");
	//   14   30:aload_0         
	//   15   31:ldc1            #67  <String "Unable to draw ">
	//   16   33:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
				((StringBuilder) (bitmappool)).append(((Object) (drawable)));
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   21   42:pop             
				((StringBuilder) (bitmappool)).append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
	//   22   43:aload_0         
	//   23   44:ldc1            #76  <String " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width">
	//   24   46:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
				Log.w("DrawableToBitmap", ((StringBuilder) (bitmappool)).toString());
	//   26   50:ldc1            #12  <String "DrawableToBitmap">
	//   27   52:aload_0         
	//   28   53:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   29   56:invokestatic    #84  <Method int Log.w(String, String)>
	//   30   59:pop             
			}
			return null;
	//   31   60:aconst_null     
	//   32   61:areturn         
		}
		if(j == 0x80000000 && drawable.getIntrinsicHeight() <= 0)
	//*  33   62:iload_3         
	//*  34   63:ldc1            #52  <Int 0x80000000>
	//*  35   65:icmpne          124
	//*  36   68:aload_1         
	//*  37   69:invokevirtual   #87  <Method int Drawable.getIntrinsicHeight()>
	//*  38   72:ifgt            124
		{
			if(Log.isLoggable("DrawableToBitmap", 5))
	//*  39   75:ldc1            #12  <String "DrawableToBitmap">
	//*  40   77:iconst_5        
	//*  41   78:invokestatic    #62  <Method boolean Log.isLoggable(String, int)>
	//*  42   81:ifeq            122
			{
				bitmappool = ((BitmapPool) (new StringBuilder()));
	//   43   84:new             #64  <Class StringBuilder>
	//   44   87:dup             
	//   45   88:invokespecial   #65  <Method void StringBuilder()>
	//   46   91:astore_0        
				((StringBuilder) (bitmappool)).append("Unable to draw ");
	//   47   92:aload_0         
	//   48   93:ldc1            #67  <String "Unable to draw ">
	//   49   95:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   50   98:pop             
				((StringBuilder) (bitmappool)).append(((Object) (drawable)));
	//   51   99:aload_0         
	//   52  100:aload_1         
	//   53  101:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   54  104:pop             
				((StringBuilder) (bitmappool)).append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
	//   55  105:aload_0         
	//   56  106:ldc1            #89  <String " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height">
	//   57  108:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   58  111:pop             
				Log.w("DrawableToBitmap", ((StringBuilder) (bitmappool)).toString());
	//   59  112:ldc1            #12  <String "DrawableToBitmap">
	//   60  114:aload_0         
	//   61  115:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   62  118:invokestatic    #84  <Method int Log.w(String, String)>
	//   63  121:pop             
			}
			return null;
	//   64  122:aconst_null     
	//   65  123:areturn         
		}
		if(drawable.getIntrinsicWidth() > 0)
	//*  66  124:aload_1         
	//*  67  125:invokevirtual   #56  <Method int Drawable.getIntrinsicWidth()>
	//*  68  128:ifle            136
			i = drawable.getIntrinsicWidth();
	//   69  131:aload_1         
	//   70  132:invokevirtual   #56  <Method int Drawable.getIntrinsicWidth()>
	//   71  135:istore_2        
		if(drawable.getIntrinsicHeight() > 0)
	//*  72  136:aload_1         
	//*  73  137:invokevirtual   #87  <Method int Drawable.getIntrinsicHeight()>
	//*  74  140:ifle            148
			j = drawable.getIntrinsicHeight();
	//   75  143:aload_1         
	//   76  144:invokevirtual   #87  <Method int Drawable.getIntrinsicHeight()>
	//   77  147:istore_3        
		lock = TransformationUtils.getBitmapDrawableLock();
	//   78  148:invokestatic    #95  <Method Lock TransformationUtils.getBitmapDrawableLock()>
	//   79  151:astore          4
		lock.lock();
	//   80  153:aload           4
	//   81  155:invokeinterface #100 <Method void Lock.lock()>
		bitmappool = ((BitmapPool) (bitmappool.get(i, j, android.graphics.Bitmap.Config.ARGB_8888)));
	//   82  160:aload_0         
	//   83  161:iload_2         
	//   84  162:iload_3         
	//   85  163:getstatic       #106 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   86  166:invokeinterface #112 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   87  171:astore_0        
		Canvas canvas = new Canvas(((Bitmap) (bitmappool)));
	//   88  172:new             #114 <Class Canvas>
	//   89  175:dup             
	//   90  176:aload_0         
	//   91  177:invokespecial   #117 <Method void Canvas(Bitmap)>
	//   92  180:astore          5
		drawable.setBounds(0, 0, i, j);
	//   93  182:aload_1         
	//   94  183:iconst_0        
	//   95  184:iconst_0        
	//   96  185:iload_2         
	//   97  186:iload_3         
	//   98  187:invokevirtual   #121 <Method void Drawable.setBounds(int, int, int, int)>
		drawable.draw(canvas);
	//   99  190:aload_1         
	//  100  191:aload           5
	//  101  193:invokevirtual   #125 <Method void Drawable.draw(Canvas)>
		canvas.setBitmap(((Bitmap) (null)));
	//  102  196:aload           5
	//  103  198:aconst_null     
	//  104  199:invokevirtual   #128 <Method void Canvas.setBitmap(Bitmap)>
		lock.unlock();
	//  105  202:aload           4
	//  106  204:invokeinterface #131 <Method void Lock.unlock()>
		return ((Bitmap) (bitmappool));
	//  107  209:aload_0         
	//  108  210:areturn         
		bitmappool;
	//  109  211:astore_0        
		lock.unlock();
	//  110  212:aload           4
	//  111  214:invokeinterface #131 <Method void Lock.unlock()>
		throw bitmappool;
	//  112  219:aload_0         
	//  113  220:athrow          
	}

	private static final BitmapPool NO_RECYCLE_BITMAP_POOL = new BitmapPoolAdapter() {

		public void put(Bitmap bitmap)
		{
		//    0    0:return          
		}

	}
;
	private static final String TAG = "DrawableToBitmap";

	static 
	{
	//    0    0:new             #6   <Class DrawableToBitmapConverter$1>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void DrawableToBitmapConverter$1()>
	//    3    7:putstatic       #19  <Field BitmapPool NO_RECYCLE_BITMAP_POOL>
	//*   4   10:return          
	}
}
