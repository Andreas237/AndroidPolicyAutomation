// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.*;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

public final class TransformationUtils
{
	private static final class NoLock
		implements Lock
	{

		public void lock()
		{
		//    0    0:return          
		}

		public void lockInterruptibly()
			throws InterruptedException
		{
		//    0    0:return          
		}

		public Condition newCondition()
		{
			throw new UnsupportedOperationException("Should not be called");
		//    0    0:new             #24  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #26  <String "Should not be called">
		//    3    6:invokespecial   #29  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public boolean tryLock()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean tryLock(long l, TimeUnit timeunit)
			throws InterruptedException
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public void unlock()
		{
		//    0    0:return          
		}

		NoLock()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	private TransformationUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method void Object()>
	//    2    4:return          
	}

	private static void applyMatrix(Bitmap bitmap, Bitmap bitmap1, Matrix matrix)
	{
		BITMAP_DRAWABLE_LOCK.lock();
	//    0    0:getstatic       #128 <Field Lock BITMAP_DRAWABLE_LOCK>
	//    1    3:invokeinterface #155 <Method void Lock.lock()>
		bitmap1 = ((Bitmap) (new Canvas(bitmap1)));
	//    2    8:new             #157 <Class Canvas>
	//    3   11:dup             
	//    4   12:aload_1         
	//    5   13:invokespecial   #160 <Method void Canvas(Bitmap)>
	//    6   16:astore_1        
		((Canvas) (bitmap1)).drawBitmap(bitmap, matrix, DEFAULT_PAINT);
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:aload_2         
	//   10   20:getstatic       #35  <Field Paint DEFAULT_PAINT>
	//   11   23:invokevirtual   #164 <Method void Canvas.drawBitmap(Bitmap, Matrix, Paint)>
		clear(((Canvas) (bitmap1)));
	//   12   26:aload_1         
	//   13   27:invokestatic    #168 <Method void clear(Canvas)>
		BITMAP_DRAWABLE_LOCK.unlock();
	//   14   30:getstatic       #128 <Field Lock BITMAP_DRAWABLE_LOCK>
	//   15   33:invokeinterface #171 <Method void Lock.unlock()>
		return;
	//   16   38:return          
		bitmap;
	//   17   39:astore_0        
		BITMAP_DRAWABLE_LOCK.unlock();
	//   18   40:getstatic       #128 <Field Lock BITMAP_DRAWABLE_LOCK>
	//   19   43:invokeinterface #171 <Method void Lock.unlock()>
		throw bitmap;
	//   20   48:aload_0         
	//   21   49:athrow          
	}

	public static Bitmap centerCrop(BitmapPool bitmappool, Bitmap bitmap, int i, int j)
	{
		if(bitmap.getWidth() == i && bitmap.getHeight() == j)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//*   2    4:iload_2         
	//*   3    5:icmpne          18
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//*   6   12:iload_3         
	//*   7   13:icmpne          18
			return bitmap;
	//    8   16:aload_1         
	//    9   17:areturn         
		Matrix matrix = new Matrix();
	//   10   18:new             #185 <Class Matrix>
	//   11   21:dup             
	//   12   22:invokespecial   #186 <Method void Matrix()>
	//   13   25:astore          9
		int k = bitmap.getWidth();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//   16   31:istore          7
		int l = bitmap.getHeight();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//   19   37:istore          8
		float f2 = 0.0F;
	//   20   39:fconst_0        
	//   21   40:fstore          6
		float f;
		float f1;
		if(k * j > l * i)
	//*  22   42:iload           7
	//*  23   44:iload_3         
	//*  24   45:imul            
	//*  25   46:iload           8
	//*  26   48:iload_2         
	//*  27   49:imul            
	//*  28   50:icmple          82
		{
			f = (float)j / (float)bitmap.getHeight();
	//   29   53:iload_3         
	//   30   54:i2f             
	//   31   55:aload_1         
	//   32   56:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//   33   59:i2f             
	//   34   60:fdiv            
	//   35   61:fstore          4
			f1 = ((float)i - (float)bitmap.getWidth() * f) * 0.5F;
	//   36   63:iload_2         
	//   37   64:i2f             
	//   38   65:aload_1         
	//   39   66:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//   40   69:i2f             
	//   41   70:fload           4
	//   42   72:fmul            
	//   43   73:fsub            
	//   44   74:ldc1            #187 <Float 0.5F>
	//   45   76:fmul            
	//   46   77:fstore          5
		} else
	//*  47   79:goto            111
		{
			f = (float)i / (float)bitmap.getWidth();
	//   48   82:iload_2         
	//   49   83:i2f             
	//   50   84:aload_1         
	//   51   85:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//   52   88:i2f             
	//   53   89:fdiv            
	//   54   90:fstore          4
			f2 = ((float)j - (float)bitmap.getHeight() * f) * 0.5F;
	//   55   92:iload_3         
	//   56   93:i2f             
	//   57   94:aload_1         
	//   58   95:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//   59   98:i2f             
	//   60   99:fload           4
	//   61  101:fmul            
	//   62  102:fsub            
	//   63  103:ldc1            #187 <Float 0.5F>
	//   64  105:fmul            
	//   65  106:fstore          6
			f1 = 0.0F;
	//   66  108:fconst_0        
	//   67  109:fstore          5
		}
		matrix.setScale(f, f);
	//   68  111:aload           9
	//   69  113:fload           4
	//   70  115:fload           4
	//   71  117:invokevirtual   #191 <Method void Matrix.setScale(float, float)>
		matrix.postTranslate((int)(f1 + 0.5F), (int)(f2 + 0.5F));
	//   72  120:aload           9
	//   73  122:fload           5
	//   74  124:ldc1            #187 <Float 0.5F>
	//   75  126:fadd            
	//   76  127:f2i             
	//   77  128:i2f             
	//   78  129:fload           6
	//   79  131:ldc1            #187 <Float 0.5F>
	//   80  133:fadd            
	//   81  134:f2i             
	//   82  135:i2f             
	//   83  136:invokevirtual   #195 <Method boolean Matrix.postTranslate(float, float)>
	//   84  139:pop             
		bitmappool = ((BitmapPool) (bitmappool.get(i, j, getNonNullConfig(bitmap))));
	//   85  140:aload_0         
	//   86  141:iload_2         
	//   87  142:iload_3         
	//   88  143:aload_1         
	//   89  144:invokestatic    #199 <Method android.graphics.Bitmap$Config getNonNullConfig(Bitmap)>
	//   90  147:invokeinterface #205 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   91  152:astore_0        
		setAlpha(bitmap, ((Bitmap) (bitmappool)));
	//   92  153:aload_1         
	//   93  154:aload_0         
	//   94  155:invokestatic    #209 <Method void setAlpha(Bitmap, Bitmap)>
		applyMatrix(bitmap, ((Bitmap) (bitmappool)), matrix);
	//   95  158:aload_1         
	//   96  159:aload_0         
	//   97  160:aload           9
	//   98  162:invokestatic    #211 <Method void applyMatrix(Bitmap, Bitmap, Matrix)>
		return ((Bitmap) (bitmappool));
	//   99  165:aload_0         
	//  100  166:areturn         
	}

	public static Bitmap centerInside(BitmapPool bitmappool, Bitmap bitmap, int i, int j)
	{
		if(bitmap.getWidth() <= i && bitmap.getHeight() <= j)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//*   2    4:iload_2         
	//*   3    5:icmpgt          35
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//*   6   12:iload_3         
	//*   7   13:icmpgt          35
		{
			if(Log.isLoggable("TransformationUtils", 2))
	//*   8   16:ldc1            #25  <String "TransformationUtils">
	//*   9   18:iconst_2        
	//*  10   19:invokestatic    #218 <Method boolean Log.isLoggable(String, int)>
	//*  11   22:ifeq            33
				Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
	//   12   25:ldc1            #25  <String "TransformationUtils">
	//   13   27:ldc1            #220 <String "requested target size larger or equal to input, returning input">
	//   14   29:invokestatic    #224 <Method int Log.v(String, String)>
	//   15   32:pop             
			return bitmap;
	//   16   33:aload_1         
	//   17   34:areturn         
		}
		if(Log.isLoggable("TransformationUtils", 2))
	//*  18   35:ldc1            #25  <String "TransformationUtils">
	//*  19   37:iconst_2        
	//*  20   38:invokestatic    #218 <Method boolean Log.isLoggable(String, int)>
	//*  21   41:ifeq            52
			Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
	//   22   44:ldc1            #25  <String "TransformationUtils">
	//   23   46:ldc1            #226 <String "requested target size too big for input, fit centering instead">
	//   24   48:invokestatic    #224 <Method int Log.v(String, String)>
	//   25   51:pop             
		return fitCenter(bitmappool, bitmap, i, j);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:iload_2         
	//   29   55:iload_3         
	//   30   56:invokestatic    #229 <Method Bitmap fitCenter(BitmapPool, Bitmap, int, int)>
	//   31   59:areturn         
	}

	public static Bitmap circleCrop(BitmapPool bitmappool, Bitmap bitmap, int i, int j)
	{
		float f;
		RectF rectf;
		Bitmap bitmap1;
		Bitmap bitmap2;
		i = Math.min(i, j);
	//    0    0:iload_2         
	//    1    1:iload_3         
	//    2    2:invokestatic    #236 <Method int Math.min(int, int)>
	//    3    5:istore_2        
		float f1 = i;
	//    4    6:iload_2         
	//    5    7:i2f             
	//    6    8:fstore          5
		f = f1 / 2.0F;
	//    7   10:fload           5
	//    8   12:fconst_2        
	//    9   13:fdiv            
	//   10   14:fstore          4
		j = bitmap.getWidth();
	//   11   16:aload_1         
	//   12   17:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//   13   20:istore_3        
		int k = bitmap.getHeight();
	//   14   21:aload_1         
	//   15   22:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//   16   25:istore          9
		float f2 = j;
	//   17   27:iload_3         
	//   18   28:i2f             
	//   19   29:fstore          6
		float f4 = f1 / f2;
	//   20   31:fload           5
	//   21   33:fload           6
	//   22   35:fdiv            
	//   23   36:fstore          8
		float f3 = k;
	//   24   38:iload           9
	//   25   40:i2f             
	//   26   41:fstore          7
		f4 = Math.max(f4, f1 / f3);
	//   27   43:fload           8
	//   28   45:fload           5
	//   29   47:fload           7
	//   30   49:fdiv            
	//   31   50:invokestatic    #240 <Method float Math.max(float, float)>
	//   32   53:fstore          8
		f2 *= f4;
	//   33   55:fload           6
	//   34   57:fload           8
	//   35   59:fmul            
	//   36   60:fstore          6
		f3 = f4 * f3;
	//   37   62:fload           8
	//   38   64:fload           7
	//   39   66:fmul            
	//   40   67:fstore          7
		f4 = (f1 - f2) / 2.0F;
	//   41   69:fload           5
	//   42   71:fload           6
	//   43   73:fsub            
	//   44   74:fconst_2        
	//   45   75:fdiv            
	//   46   76:fstore          8
		f1 = (f1 - f3) / 2.0F;
	//   47   78:fload           5
	//   48   80:fload           7
	//   49   82:fsub            
	//   50   83:fconst_2        
	//   51   84:fdiv            
	//   52   85:fstore          5
		rectf = new RectF(f4, f1, f2 + f4, f3 + f1);
	//   53   87:new             #242 <Class RectF>
	//   54   90:dup             
	//   55   91:fload           8
	//   56   93:fload           5
	//   57   95:fload           6
	//   58   97:fload           8
	//   59   99:fadd            
	//   60  100:fload           7
	//   61  102:fload           5
	//   62  104:fadd            
	//   63  105:invokespecial   #245 <Method void RectF(float, float, float, float)>
	//   64  108:astore          10
		bitmap1 = getAlphaSafeBitmap(bitmappool, bitmap);
	//   65  110:aload_0         
	//   66  111:aload_1         
	//   67  112:invokestatic    #249 <Method Bitmap getAlphaSafeBitmap(BitmapPool, Bitmap)>
	//   68  115:astore          11
		bitmap2 = bitmappool.get(i, i, getAlphaSafeConfig(bitmap));
	//   69  117:aload_0         
	//   70  118:iload_2         
	//   71  119:iload_2         
	//   72  120:aload_1         
	//   73  121:invokestatic    #252 <Method android.graphics.Bitmap$Config getAlphaSafeConfig(Bitmap)>
	//   74  124:invokeinterface #205 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   75  129:astore          12
		bitmap2.setHasAlpha(true);
	//   76  131:aload           12
	//   77  133:iconst_1        
	//   78  134:invokevirtual   #256 <Method void Bitmap.setHasAlpha(boolean)>
		BITMAP_DRAWABLE_LOCK.lock();
	//   79  137:getstatic       #128 <Field Lock BITMAP_DRAWABLE_LOCK>
	//   80  140:invokeinterface #155 <Method void Lock.lock()>
		Canvas canvas = new Canvas(bitmap2);
	//   81  145:new             #157 <Class Canvas>
	//   82  148:dup             
	//   83  149:aload           12
	//   84  151:invokespecial   #160 <Method void Canvas(Bitmap)>
	//   85  154:astore          13
		canvas.drawCircle(f, f, f, CIRCLE_CROP_SHAPE_PAINT);
	//   86  156:aload           13
	//   87  158:fload           4
	//   88  160:fload           4
	//   89  162:fload           4
	//   90  164:getstatic       #37  <Field Paint CIRCLE_CROP_SHAPE_PAINT>
	//   91  167:invokevirtual   #260 <Method void Canvas.drawCircle(float, float, float, Paint)>
		canvas.drawBitmap(bitmap1, ((android.graphics.Rect) (null)), rectf, CIRCLE_CROP_BITMAP_PAINT);
	//   92  170:aload           13
	//   93  172:aload           11
	//   94  174:aconst_null     
	//   95  175:aload           10
	//   96  177:getstatic       #130 <Field Paint CIRCLE_CROP_BITMAP_PAINT>
	//   97  180:invokevirtual   #263 <Method void Canvas.drawBitmap(Bitmap, android.graphics.Rect, RectF, Paint)>
		clear(canvas);
	//   98  183:aload           13
	//   99  185:invokestatic    #168 <Method void clear(Canvas)>
		BITMAP_DRAWABLE_LOCK.unlock();
	//  100  188:getstatic       #128 <Field Lock BITMAP_DRAWABLE_LOCK>
	//  101  191:invokeinterface #171 <Method void Lock.unlock()>
		if(!((Object) (bitmap1)).equals(((Object) (bitmap))))
	//* 102  196:aload           11
	//* 103  198:aload_1         
	//* 104  199:invokevirtual   #266 <Method boolean Object.equals(Object)>
	//* 105  202:ifne            213
			bitmappool.put(bitmap1);
	//  106  205:aload_0         
	//  107  206:aload           11
	//  108  208:invokeinterface #269 <Method void BitmapPool.put(Bitmap)>
		return bitmap2;
	//  109  213:aload           12
	//  110  215:areturn         
		bitmappool;
	//  111  216:astore_0        
		BITMAP_DRAWABLE_LOCK.unlock();
	//  112  217:getstatic       #128 <Field Lock BITMAP_DRAWABLE_LOCK>
	//  113  220:invokeinterface #171 <Method void Lock.unlock()>
		throw bitmappool;
	//  114  225:aload_0         
	//  115  226:athrow          
	}

	private static void clear(Canvas canvas)
	{
		canvas.setBitmap(((Bitmap) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #272 <Method void Canvas.setBitmap(Bitmap)>
	//    3    5:return          
	}

	public static Bitmap fitCenter(BitmapPool bitmappool, Bitmap bitmap, int i, int j)
	{
		if(bitmap.getWidth() == i && bitmap.getHeight() == j)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//*   2    4:iload_2         
	//*   3    5:icmpne          36
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//*   6   12:iload_3         
	//*   7   13:icmpne          36
		{
			if(Log.isLoggable("TransformationUtils", 2))
	//*   8   16:ldc1            #25  <String "TransformationUtils">
	//*   9   18:iconst_2        
	//*  10   19:invokestatic    #218 <Method boolean Log.isLoggable(String, int)>
	//*  11   22:ifeq            34
				Log.v("TransformationUtils", "requested target size matches input, returning input");
	//   12   25:ldc1            #25  <String "TransformationUtils">
	//   13   27:ldc2            #274 <String "requested target size matches input, returning input">
	//   14   30:invokestatic    #224 <Method int Log.v(String, String)>
	//   15   33:pop             
			return bitmap;
	//   16   34:aload_1         
	//   17   35:areturn         
		}
		float f = Math.min((float)i / (float)bitmap.getWidth(), (float)j / (float)bitmap.getHeight());
	//   18   36:iload_2         
	//   19   37:i2f             
	//   20   38:aload_1         
	//   21   39:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//   22   42:i2f             
	//   23   43:fdiv            
	//   24   44:iload_3         
	//   25   45:i2f             
	//   26   46:aload_1         
	//   27   47:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//   28   50:i2f             
	//   29   51:fdiv            
	//   30   52:invokestatic    #276 <Method float Math.min(float, float)>
	//   31   55:fstore          4
		int k = Math.round((float)bitmap.getWidth() * f);
	//   32   57:aload_1         
	//   33   58:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//   34   61:i2f             
	//   35   62:fload           4
	//   36   64:fmul            
	//   37   65:invokestatic    #280 <Method int Math.round(float)>
	//   38   68:istore          5
		int l = Math.round((float)bitmap.getHeight() * f);
	//   39   70:aload_1         
	//   40   71:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//   41   74:i2f             
	//   42   75:fload           4
	//   43   77:fmul            
	//   44   78:invokestatic    #280 <Method int Math.round(float)>
	//   45   81:istore          6
		if(bitmap.getWidth() == k && bitmap.getHeight() == l)
	//*  46   83:aload_1         
	//*  47   84:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//*  48   87:iload           5
	//*  49   89:icmpne          121
	//*  50   92:aload_1         
	//*  51   93:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//*  52   96:iload           6
	//*  53   98:icmpne          121
		{
			if(Log.isLoggable("TransformationUtils", 2))
	//*  54  101:ldc1            #25  <String "TransformationUtils">
	//*  55  103:iconst_2        
	//*  56  104:invokestatic    #218 <Method boolean Log.isLoggable(String, int)>
	//*  57  107:ifeq            119
				Log.v("TransformationUtils", "adjusted target size matches input, returning input");
	//   58  110:ldc1            #25  <String "TransformationUtils">
	//   59  112:ldc2            #282 <String "adjusted target size matches input, returning input">
	//   60  115:invokestatic    #224 <Method int Log.v(String, String)>
	//   61  118:pop             
			return bitmap;
	//   62  119:aload_1         
	//   63  120:areturn         
		}
		bitmappool = ((BitmapPool) (bitmappool.get((int)((float)bitmap.getWidth() * f), (int)((float)bitmap.getHeight() * f), getNonNullConfig(bitmap))));
	//   64  121:aload_0         
	//   65  122:aload_1         
	//   66  123:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//   67  126:i2f             
	//   68  127:fload           4
	//   69  129:fmul            
	//   70  130:f2i             
	//   71  131:aload_1         
	//   72  132:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//   73  135:i2f             
	//   74  136:fload           4
	//   75  138:fmul            
	//   76  139:f2i             
	//   77  140:aload_1         
	//   78  141:invokestatic    #199 <Method android.graphics.Bitmap$Config getNonNullConfig(Bitmap)>
	//   79  144:invokeinterface #205 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   80  149:astore_0        
		setAlpha(bitmap, ((Bitmap) (bitmappool)));
	//   81  150:aload_1         
	//   82  151:aload_0         
	//   83  152:invokestatic    #209 <Method void setAlpha(Bitmap, Bitmap)>
		if(Log.isLoggable("TransformationUtils", 2))
	//*  84  155:ldc1            #25  <String "TransformationUtils">
	//*  85  157:iconst_2        
	//*  86  158:invokestatic    #218 <Method boolean Log.isLoggable(String, int)>
	//*  87  161:ifeq            369
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   88  164:new             #284 <Class StringBuilder>
	//   89  167:dup             
	//   90  168:invokespecial   #285 <Method void StringBuilder()>
	//   91  171:astore          7
			stringbuilder.append("request: ");
	//   92  173:aload           7
	//   93  175:ldc2            #287 <String "request: ">
	//   94  178:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//   95  181:pop             
			stringbuilder.append(i);
	//   96  182:aload           7
	//   97  184:iload_2         
	//   98  185:invokevirtual   #294 <Method StringBuilder StringBuilder.append(int)>
	//   99  188:pop             
			stringbuilder.append("x");
	//  100  189:aload           7
	//  101  191:ldc2            #296 <String "x">
	//  102  194:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//  103  197:pop             
			stringbuilder.append(j);
	//  104  198:aload           7
	//  105  200:iload_3         
	//  106  201:invokevirtual   #294 <Method StringBuilder StringBuilder.append(int)>
	//  107  204:pop             
			Log.v("TransformationUtils", stringbuilder.toString());
	//  108  205:ldc1            #25  <String "TransformationUtils">
	//  109  207:aload           7
	//  110  209:invokevirtual   #300 <Method String StringBuilder.toString()>
	//  111  212:invokestatic    #224 <Method int Log.v(String, String)>
	//  112  215:pop             
			stringbuilder = new StringBuilder();
	//  113  216:new             #284 <Class StringBuilder>
	//  114  219:dup             
	//  115  220:invokespecial   #285 <Method void StringBuilder()>
	//  116  223:astore          7
			stringbuilder.append("toFit:   ");
	//  117  225:aload           7
	//  118  227:ldc2            #302 <String "toFit:   ">
	//  119  230:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//  120  233:pop             
			stringbuilder.append(bitmap.getWidth());
	//  121  234:aload           7
	//  122  236:aload_1         
	//  123  237:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//  124  240:invokevirtual   #294 <Method StringBuilder StringBuilder.append(int)>
	//  125  243:pop             
			stringbuilder.append("x");
	//  126  244:aload           7
	//  127  246:ldc2            #296 <String "x">
	//  128  249:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//  129  252:pop             
			stringbuilder.append(bitmap.getHeight());
	//  130  253:aload           7
	//  131  255:aload_1         
	//  132  256:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//  133  259:invokevirtual   #294 <Method StringBuilder StringBuilder.append(int)>
	//  134  262:pop             
			Log.v("TransformationUtils", stringbuilder.toString());
	//  135  263:ldc1            #25  <String "TransformationUtils">
	//  136  265:aload           7
	//  137  267:invokevirtual   #300 <Method String StringBuilder.toString()>
	//  138  270:invokestatic    #224 <Method int Log.v(String, String)>
	//  139  273:pop             
			stringbuilder = new StringBuilder();
	//  140  274:new             #284 <Class StringBuilder>
	//  141  277:dup             
	//  142  278:invokespecial   #285 <Method void StringBuilder()>
	//  143  281:astore          7
			stringbuilder.append("toReuse: ");
	//  144  283:aload           7
	//  145  285:ldc2            #304 <String "toReuse: ">
	//  146  288:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//  147  291:pop             
			stringbuilder.append(((Bitmap) (bitmappool)).getWidth());
	//  148  292:aload           7
	//  149  294:aload_0         
	//  150  295:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//  151  298:invokevirtual   #294 <Method StringBuilder StringBuilder.append(int)>
	//  152  301:pop             
			stringbuilder.append("x");
	//  153  302:aload           7
	//  154  304:ldc2            #296 <String "x">
	//  155  307:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//  156  310:pop             
			stringbuilder.append(((Bitmap) (bitmappool)).getHeight());
	//  157  311:aload           7
	//  158  313:aload_0         
	//  159  314:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//  160  317:invokevirtual   #294 <Method StringBuilder StringBuilder.append(int)>
	//  161  320:pop             
			Log.v("TransformationUtils", stringbuilder.toString());
	//  162  321:ldc1            #25  <String "TransformationUtils">
	//  163  323:aload           7
	//  164  325:invokevirtual   #300 <Method String StringBuilder.toString()>
	//  165  328:invokestatic    #224 <Method int Log.v(String, String)>
	//  166  331:pop             
			stringbuilder = new StringBuilder();
	//  167  332:new             #284 <Class StringBuilder>
	//  168  335:dup             
	//  169  336:invokespecial   #285 <Method void StringBuilder()>
	//  170  339:astore          7
			stringbuilder.append("minPct:   ");
	//  171  341:aload           7
	//  172  343:ldc2            #306 <String "minPct:   ">
	//  173  346:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//  174  349:pop             
			stringbuilder.append(f);
	//  175  350:aload           7
	//  176  352:fload           4
	//  177  354:invokevirtual   #309 <Method StringBuilder StringBuilder.append(float)>
	//  178  357:pop             
			Log.v("TransformationUtils", stringbuilder.toString());
	//  179  358:ldc1            #25  <String "TransformationUtils">
	//  180  360:aload           7
	//  181  362:invokevirtual   #300 <Method String StringBuilder.toString()>
	//  182  365:invokestatic    #224 <Method int Log.v(String, String)>
	//  183  368:pop             
		}
		Matrix matrix = new Matrix();
	//  184  369:new             #185 <Class Matrix>
	//  185  372:dup             
	//  186  373:invokespecial   #186 <Method void Matrix()>
	//  187  376:astore          7
		matrix.setScale(f, f);
	//  188  378:aload           7
	//  189  380:fload           4
	//  190  382:fload           4
	//  191  384:invokevirtual   #191 <Method void Matrix.setScale(float, float)>
		applyMatrix(bitmap, ((Bitmap) (bitmappool)), matrix);
	//  192  387:aload_1         
	//  193  388:aload_0         
	//  194  389:aload           7
	//  195  391:invokestatic    #211 <Method void applyMatrix(Bitmap, Bitmap, Matrix)>
		return ((Bitmap) (bitmappool));
	//  196  394:aload_0         
	//  197  395:areturn         
	}

	private static Bitmap getAlphaSafeBitmap(BitmapPool bitmappool, Bitmap bitmap)
	{
		android.graphics.Bitmap.Config config = getAlphaSafeConfig(bitmap);
	//    0    0:aload_1         
	//    1    1:invokestatic    #252 <Method android.graphics.Bitmap$Config getAlphaSafeConfig(Bitmap)>
	//    2    4:astore_2        
		if(config.equals(((Object) (bitmap.getConfig()))))
	//*   3    5:aload_2         
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #313 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//*   6   10:invokevirtual   #316 <Method boolean android.graphics.Bitmap$Config.equals(Object)>
	//*   7   13:ifeq            18
		{
			return bitmap;
	//    8   16:aload_1         
	//    9   17:areturn         
		} else
		{
			bitmappool = ((BitmapPool) (bitmappool.get(bitmap.getWidth(), bitmap.getHeight(), config)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//   15   27:aload_2         
	//   16   28:invokeinterface #205 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   17   33:astore_0        
			(new Canvas(((Bitmap) (bitmappool)))).drawBitmap(bitmap, 0.0F, 0.0F, ((Paint) (null)));
	//   18   34:new             #157 <Class Canvas>
	//   19   37:dup             
	//   20   38:aload_0         
	//   21   39:invokespecial   #160 <Method void Canvas(Bitmap)>
	//   22   42:aload_1         
	//   23   43:fconst_0        
	//   24   44:fconst_0        
	//   25   45:aconst_null     
	//   26   46:invokevirtual   #319 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
			return ((Bitmap) (bitmappool));
	//   27   49:aload_0         
	//   28   50:areturn         
		}
	}

	private static android.graphics.Bitmap.Config getAlphaSafeConfig(Bitmap bitmap)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26 && android.graphics.Bitmap.Config.RGBA_F16.equals(((Object) (bitmap.getConfig()))))
	//*   0    0:getstatic       #324 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          25
	//*   3    8:getstatic       #328 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGBA_F16>
	//*   4   11:aload_0         
	//*   5   12:invokevirtual   #313 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//*   6   15:invokevirtual   #316 <Method boolean android.graphics.Bitmap$Config.equals(Object)>
	//*   7   18:ifeq            25
			return android.graphics.Bitmap.Config.RGBA_F16;
	//    8   21:getstatic       #328 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGBA_F16>
	//    9   24:areturn         
		else
			return android.graphics.Bitmap.Config.ARGB_8888;
	//   10   25:getstatic       #331 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   11   28:areturn         
	}

	public static Lock getBitmapDrawableLock()
	{
		return BITMAP_DRAWABLE_LOCK;
	//    0    0:getstatic       #128 <Field Lock BITMAP_DRAWABLE_LOCK>
	//    1    3:areturn         
	}

	public static int getExifOrientationDegrees(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     3 8: default 40
	//	               3 49
	//	               4 49
	//	               5 46
	//	               6 46
	//	               7 42
	//	               8 42
		default:
			return 0;
	//    2   40:iconst_0        
	//    3   41:ireturn         

		case 7: // '\007'
		case 8: // '\b'
			return 270;
	//    4   42:sipush          270
	//    5   45:ireturn         

		case 5: // '\005'
		case 6: // '\006'
			return 90;
	//    6   46:bipush          90
	//    7   48:ireturn         

		case 3: // '\003'
		case 4: // '\004'
			return 180;
	//    8   49:sipush          180
	//    9   52:ireturn         
		}
	}

	private static android.graphics.Bitmap.Config getNonNullConfig(Bitmap bitmap)
	{
		if(bitmap.getConfig() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #313 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//*   2    4:ifnull          12
			return bitmap.getConfig();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #313 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//    5   11:areturn         
		else
			return android.graphics.Bitmap.Config.ARGB_8888;
	//    6   12:getstatic       #331 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//    7   15:areturn         
	}

	static void initializeMatrixForRotation(int i, Matrix matrix)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     2 8: default 44
	//	               2 120
	//	               3 112
	//	               4 95
	//	               5 78
	//	               6 70
	//	               7 53
	//	               8 45
		default:
			return;
	//    2   44:return          

		case 8: // '\b'
			matrix.setRotate(-90F);
	//    3   45:aload_1         
	//    4   46:ldc2            #340 <Float -90F>
	//    5   49:invokevirtual   #344 <Method void Matrix.setRotate(float)>
			return;
	//    6   52:return          

		case 7: // '\007'
			matrix.setRotate(-90F);
	//    7   53:aload_1         
	//    8   54:ldc2            #340 <Float -90F>
	//    9   57:invokevirtual   #344 <Method void Matrix.setRotate(float)>
			matrix.postScale(-1F, 1.0F);
	//   10   60:aload_1         
	//   11   61:ldc2            #345 <Float -1F>
	//   12   64:fconst_1        
	//   13   65:invokevirtual   #348 <Method boolean Matrix.postScale(float, float)>
	//   14   68:pop             
			return;
	//   15   69:return          

		case 6: // '\006'
			matrix.setRotate(90F);
	//   16   70:aload_1         
	//   17   71:ldc2            #349 <Float 90F>
	//   18   74:invokevirtual   #344 <Method void Matrix.setRotate(float)>
			return;
	//   19   77:return          

		case 5: // '\005'
			matrix.setRotate(90F);
	//   20   78:aload_1         
	//   21   79:ldc2            #349 <Float 90F>
	//   22   82:invokevirtual   #344 <Method void Matrix.setRotate(float)>
			matrix.postScale(-1F, 1.0F);
	//   23   85:aload_1         
	//   24   86:ldc2            #345 <Float -1F>
	//   25   89:fconst_1        
	//   26   90:invokevirtual   #348 <Method boolean Matrix.postScale(float, float)>
	//   27   93:pop             
			return;
	//   28   94:return          

		case 4: // '\004'
			matrix.setRotate(180F);
	//   29   95:aload_1         
	//   30   96:ldc2            #350 <Float 180F>
	//   31   99:invokevirtual   #344 <Method void Matrix.setRotate(float)>
			matrix.postScale(-1F, 1.0F);
	//   32  102:aload_1         
	//   33  103:ldc2            #345 <Float -1F>
	//   34  106:fconst_1        
	//   35  107:invokevirtual   #348 <Method boolean Matrix.postScale(float, float)>
	//   36  110:pop             
			return;
	//   37  111:return          

		case 3: // '\003'
			matrix.setRotate(180F);
	//   38  112:aload_1         
	//   39  113:ldc2            #350 <Float 180F>
	//   40  116:invokevirtual   #344 <Method void Matrix.setRotate(float)>
			return;
	//   41  119:return          

		case 2: // '\002'
			matrix.setScale(-1F, 1.0F);
	//   42  120:aload_1         
	//   43  121:ldc2            #345 <Float -1F>
	//   44  124:fconst_1        
	//   45  125:invokevirtual   #191 <Method void Matrix.setScale(float, float)>
			return;
	//   46  128:return          
		}
	}

	public static boolean isExifOrientationRequired(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     2 8: default 44
	//	               2 46
	//	               3 46
	//	               4 46
	//	               5 46
	//	               6 46
	//	               7 46
	//	               8 46
		default:
			return false;
	//    2   44:iconst_0        
	//    3   45:ireturn         

		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
			return true;
	//    4   46:iconst_1        
	//    5   47:ireturn         
		}
	}

	public static Bitmap rotateImage(Bitmap bitmap, int i)
	{
		if(i == 0)
			break MISSING_BLOCK_LABEL_58;
	//    0    0:iload_1         
	//    1    1:ifeq            58
		Object obj;
		obj = ((Object) (new Matrix()));
	//    2    4:new             #185 <Class Matrix>
	//    3    7:dup             
	//    4    8:invokespecial   #186 <Method void Matrix()>
	//    5   11:astore_2        
		((Matrix) (obj)).setRotate(i);
	//    6   12:aload_2         
	//    7   13:iload_1         
	//    8   14:i2f             
	//    9   15:invokevirtual   #344 <Method void Matrix.setRotate(float)>
		obj = ((Object) (Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true)));
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:iconst_0        
	//   13   21:aload_0         
	//   14   22:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//   15   25:aload_0         
	//   16   26:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//   17   29:aload_2         
	//   18   30:iconst_1        
	//   19   31:invokestatic    #360 <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int, Matrix, boolean)>
	//   20   34:astore_2        
		return ((Bitmap) (obj));
	//   21   35:aload_2         
	//   22   36:areturn         
		Exception exception;
		exception;
	//   23   37:astore_2        
		if(Log.isLoggable("TransformationUtils", 6))
	//*  24   38:ldc1            #25  <String "TransformationUtils">
	//*  25   40:bipush          6
	//*  26   42:invokestatic    #218 <Method boolean Log.isLoggable(String, int)>
	//*  27   45:ifeq            58
			Log.e("TransformationUtils", "Exception when trying to orient image", ((Throwable) (exception)));
	//   28   48:ldc1            #25  <String "TransformationUtils">
	//   29   50:ldc2            #362 <String "Exception when trying to orient image">
	//   30   53:aload_2         
	//   31   54:invokestatic    #366 <Method int Log.e(String, String, Throwable)>
	//   32   57:pop             
		return bitmap;
	//   33   58:aload_0         
	//   34   59:areturn         
	}

	public static Bitmap rotateImageExif(BitmapPool bitmappool, Bitmap bitmap, int i)
	{
		if(!isExifOrientationRequired(i))
	//*   0    0:iload_2         
	//*   1    1:invokestatic    #370 <Method boolean isExifOrientationRequired(int)>
	//*   2    4:ifne            9
		{
			return bitmap;
	//    3    7:aload_1         
	//    4    8:areturn         
		} else
		{
			Matrix matrix = new Matrix();
	//    5    9:new             #185 <Class Matrix>
	//    6   12:dup             
	//    7   13:invokespecial   #186 <Method void Matrix()>
	//    8   16:astore_3        
			initializeMatrixForRotation(i, matrix);
	//    9   17:iload_2         
	//   10   18:aload_3         
	//   11   19:invokestatic    #372 <Method void initializeMatrixForRotation(int, Matrix)>
			RectF rectf = new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight());
	//   12   22:new             #242 <Class RectF>
	//   13   25:dup             
	//   14   26:fconst_0        
	//   15   27:fconst_0        
	//   16   28:aload_1         
	//   17   29:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//   18   32:i2f             
	//   19   33:aload_1         
	//   20   34:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//   21   37:i2f             
	//   22   38:invokespecial   #245 <Method void RectF(float, float, float, float)>
	//   23   41:astore          4
			matrix.mapRect(rectf);
	//   24   43:aload_3         
	//   25   44:aload           4
	//   26   46:invokevirtual   #376 <Method boolean Matrix.mapRect(RectF)>
	//   27   49:pop             
			bitmappool = ((BitmapPool) (bitmappool.get(Math.round(rectf.width()), Math.round(rectf.height()), getNonNullConfig(bitmap))));
	//   28   50:aload_0         
	//   29   51:aload           4
	//   30   53:invokevirtual   #380 <Method float RectF.width()>
	//   31   56:invokestatic    #280 <Method int Math.round(float)>
	//   32   59:aload           4
	//   33   61:invokevirtual   #383 <Method float RectF.height()>
	//   34   64:invokestatic    #280 <Method int Math.round(float)>
	//   35   67:aload_1         
	//   36   68:invokestatic    #199 <Method android.graphics.Bitmap$Config getNonNullConfig(Bitmap)>
	//   37   71:invokeinterface #205 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   38   76:astore_0        
			matrix.postTranslate(-rectf.left, -rectf.top);
	//   39   77:aload_3         
	//   40   78:aload           4
	//   41   80:getfield        #387 <Field float RectF.left>
	//   42   83:fneg            
	//   43   84:aload           4
	//   44   86:getfield        #390 <Field float RectF.top>
	//   45   89:fneg            
	//   46   90:invokevirtual   #195 <Method boolean Matrix.postTranslate(float, float)>
	//   47   93:pop             
			applyMatrix(bitmap, ((Bitmap) (bitmappool)), matrix);
	//   48   94:aload_1         
	//   49   95:aload_0         
	//   50   96:aload_3         
	//   51   97:invokestatic    #211 <Method void applyMatrix(Bitmap, Bitmap, Matrix)>
			return ((Bitmap) (bitmappool));
	//   52  100:aload_0         
	//   53  101:areturn         
		}
	}

	public static Bitmap roundedCorners(BitmapPool bitmappool, Bitmap bitmap, int i)
	{
		Bitmap bitmap1;
		Object obj;
		Paint paint;
		Object obj1;
		boolean flag;
		if(i > 0)
	//*   0    0:iload_2         
	//*   1    1:ifle            10
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:goto            13
			flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          4
		Preconditions.checkArgument(flag, "roundingRadius must be greater than 0.");
	//    7   13:iload           4
	//    8   15:ldc2            #393 <String "roundingRadius must be greater than 0.">
	//    9   18:invokestatic    #399 <Method void Preconditions.checkArgument(boolean, String)>
		obj = ((Object) (getAlphaSafeConfig(bitmap)));
	//   10   21:aload_1         
	//   11   22:invokestatic    #252 <Method android.graphics.Bitmap$Config getAlphaSafeConfig(Bitmap)>
	//   12   25:astore          6
		bitmap1 = getAlphaSafeBitmap(bitmappool, bitmap);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokestatic    #249 <Method Bitmap getAlphaSafeBitmap(BitmapPool, Bitmap)>
	//   16   32:astore          5
		obj = ((Object) (bitmappool.get(bitmap1.getWidth(), bitmap1.getHeight(), ((android.graphics.Bitmap.Config) (obj)))));
	//   17   34:aload_0         
	//   18   35:aload           5
	//   19   37:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//   20   40:aload           5
	//   21   42:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//   22   45:aload           6
	//   23   47:invokeinterface #205 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   24   52:astore          6
		((Bitmap) (obj)).setHasAlpha(true);
	//   25   54:aload           6
	//   26   56:iconst_1        
	//   27   57:invokevirtual   #256 <Method void Bitmap.setHasAlpha(boolean)>
		obj1 = ((Object) (new BitmapShader(bitmap1, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP)));
	//   28   60:new             #401 <Class BitmapShader>
	//   29   63:dup             
	//   30   64:aload           5
	//   31   66:getstatic       #407 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   32   69:getstatic       #407 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   33   72:invokespecial   #410 <Method void BitmapShader(Bitmap, android.graphics.Shader$TileMode, android.graphics.Shader$TileMode)>
	//   34   75:astore          8
		paint = new Paint();
	//   35   77:new             #29  <Class Paint>
	//   36   80:dup             
	//   37   81:invokespecial   #411 <Method void Paint()>
	//   38   84:astore          7
		paint.setAntiAlias(true);
	//   39   86:aload           7
	//   40   88:iconst_1        
	//   41   89:invokevirtual   #414 <Method void Paint.setAntiAlias(boolean)>
		paint.setShader(((android.graphics.Shader) (obj1)));
	//   42   92:aload           7
	//   43   94:aload           8
	//   44   96:invokevirtual   #418 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//   45   99:pop             
		obj1 = ((Object) (new RectF(0.0F, 0.0F, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight())));
	//   46  100:new             #242 <Class RectF>
	//   47  103:dup             
	//   48  104:fconst_0        
	//   49  105:fconst_0        
	//   50  106:aload           6
	//   51  108:invokevirtual   #180 <Method int Bitmap.getWidth()>
	//   52  111:i2f             
	//   53  112:aload           6
	//   54  114:invokevirtual   #183 <Method int Bitmap.getHeight()>
	//   55  117:i2f             
	//   56  118:invokespecial   #245 <Method void RectF(float, float, float, float)>
	//   57  121:astore          8
		BITMAP_DRAWABLE_LOCK.lock();
	//   58  123:getstatic       #128 <Field Lock BITMAP_DRAWABLE_LOCK>
	//   59  126:invokeinterface #155 <Method void Lock.lock()>
		Canvas canvas;
		canvas = new Canvas(((Bitmap) (obj)));
	//   60  131:new             #157 <Class Canvas>
	//   61  134:dup             
	//   62  135:aload           6
	//   63  137:invokespecial   #160 <Method void Canvas(Bitmap)>
	//   64  140:astore          9
		canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
	//   65  142:aload           9
	//   66  144:iconst_0        
	//   67  145:getstatic       #421 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.CLEAR>
	//   68  148:invokevirtual   #425 <Method void Canvas.drawColor(int, android.graphics.PorterDuff$Mode)>
		float f = i;
	//   69  151:iload_2         
	//   70  152:i2f             
	//   71  153:fstore_3        
		canvas.drawRoundRect(((RectF) (obj1)), f, f, paint);
	//   72  154:aload           9
	//   73  156:aload           8
	//   74  158:fload_3         
	//   75  159:fload_3         
	//   76  160:aload           7
	//   77  162:invokevirtual   #429 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
		clear(canvas);
	//   78  165:aload           9
	//   79  167:invokestatic    #168 <Method void clear(Canvas)>
		BITMAP_DRAWABLE_LOCK.unlock();
	//   80  170:getstatic       #128 <Field Lock BITMAP_DRAWABLE_LOCK>
	//   81  173:invokeinterface #171 <Method void Lock.unlock()>
		if(!((Object) (bitmap1)).equals(((Object) (bitmap))))
	//*  82  178:aload           5
	//*  83  180:aload_1         
	//*  84  181:invokevirtual   #266 <Method boolean Object.equals(Object)>
	//*  85  184:ifne            195
			bitmappool.put(bitmap1);
	//   86  187:aload_0         
	//   87  188:aload           5
	//   88  190:invokeinterface #269 <Method void BitmapPool.put(Bitmap)>
		return ((Bitmap) (obj));
	//   89  195:aload           6
	//   90  197:areturn         
		bitmappool;
	//   91  198:astore_0        
		BITMAP_DRAWABLE_LOCK.unlock();
	//   92  199:getstatic       #128 <Field Lock BITMAP_DRAWABLE_LOCK>
	//   93  202:invokeinterface #171 <Method void Lock.unlock()>
		throw bitmappool;
	//   94  207:aload_0         
	//   95  208:athrow          
	}

	public static Bitmap roundedCorners(BitmapPool bitmappool, Bitmap bitmap, int i, int j, int k)
	{
		return roundedCorners(bitmappool, bitmap, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload           4
	//    3    4:invokestatic    #433 <Method Bitmap roundedCorners(BitmapPool, Bitmap, int)>
	//    4    7:areturn         
	}

	public static void setAlpha(Bitmap bitmap, Bitmap bitmap1)
	{
		bitmap1.setHasAlpha(bitmap.hasAlpha());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #438 <Method boolean Bitmap.hasAlpha()>
	//    3    5:invokevirtual   #256 <Method void Bitmap.setHasAlpha(boolean)>
	//    4    8:return          
	}

	private static final Lock BITMAP_DRAWABLE_LOCK;
	private static final Paint CIRCLE_CROP_BITMAP_PAINT;
	private static final int CIRCLE_CROP_PAINT_FLAGS = 7;
	private static final Paint CIRCLE_CROP_SHAPE_PAINT = new Paint(7);
	private static final Paint DEFAULT_PAINT = new Paint(6);
	private static final Set MODELS_REQUIRING_BITMAP_LOCK;
	public static final int PAINT_FLAGS = 6;
	private static final String TAG = "TransformationUtils";

	static 
	{
	//    0    0:new             #29  <Class Paint>
	//    1    3:dup             
	//    2    4:bipush          6
	//    3    6:invokespecial   #33  <Method void Paint(int)>
	//    4    9:putstatic       #35  <Field Paint DEFAULT_PAINT>
	//    5   12:new             #29  <Class Paint>
	//    6   15:dup             
	//    7   16:bipush          7
	//    8   18:invokespecial   #33  <Method void Paint(int)>
	//    9   21:putstatic       #37  <Field Paint CIRCLE_CROP_SHAPE_PAINT>
		MODELS_REQUIRING_BITMAP_LOCK = ((Set) (new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
			"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", 
			"XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", 
			"XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"
		}))))))));
	//   10   24:new             #39  <Class HashSet>
	//   11   27:dup             
	//   12   28:bipush          29
	//   13   30:anewarray       String[]
	//   14   33:dup             
	//   15   34:iconst_0        
	//   16   35:ldc1            #43  <String "XT1085">
	//   17   37:aastore         
	//   18   38:dup             
	//   19   39:iconst_1        
	//   20   40:ldc1            #45  <String "XT1092">
	//   21   42:aastore         
	//   22   43:dup             
	//   23   44:iconst_2        
	//   24   45:ldc1            #47  <String "XT1093">
	//   25   47:aastore         
	//   26   48:dup             
	//   27   49:iconst_3        
	//   28   50:ldc1            #49  <String "XT1094">
	//   29   52:aastore         
	//   30   53:dup             
	//   31   54:iconst_4        
	//   32   55:ldc1            #51  <String "XT1095">
	//   33   57:aastore         
	//   34   58:dup             
	//   35   59:iconst_5        
	//   36   60:ldc1            #53  <String "XT1096">
	//   37   62:aastore         
	//   38   63:dup             
	//   39   64:bipush          6
	//   40   66:ldc1            #55  <String "XT1097">
	//   41   68:aastore         
	//   42   69:dup             
	//   43   70:bipush          7
	//   44   72:ldc1            #57  <String "XT1098">
	//   45   74:aastore         
	//   46   75:dup             
	//   47   76:bipush          8
	//   48   78:ldc1            #59  <String "XT1031">
	//   49   80:aastore         
	//   50   81:dup             
	//   51   82:bipush          9
	//   52   84:ldc1            #61  <String "XT1028">
	//   53   86:aastore         
	//   54   87:dup             
	//   55   88:bipush          10
	//   56   90:ldc1            #63  <String "XT937C">
	//   57   92:aastore         
	//   58   93:dup             
	//   59   94:bipush          11
	//   60   96:ldc1            #65  <String "XT1032">
	//   61   98:aastore         
	//   62   99:dup             
	//   63  100:bipush          12
	//   64  102:ldc1            #67  <String "XT1008">
	//   65  104:aastore         
	//   66  105:dup             
	//   67  106:bipush          13
	//   68  108:ldc1            #69  <String "XT1033">
	//   69  110:aastore         
	//   70  111:dup             
	//   71  112:bipush          14
	//   72  114:ldc1            #71  <String "XT1035">
	//   73  116:aastore         
	//   74  117:dup             
	//   75  118:bipush          15
	//   76  120:ldc1            #73  <String "XT1034">
	//   77  122:aastore         
	//   78  123:dup             
	//   79  124:bipush          16
	//   80  126:ldc1            #75  <String "XT939G">
	//   81  128:aastore         
	//   82  129:dup             
	//   83  130:bipush          17
	//   84  132:ldc1            #77  <String "XT1039">
	//   85  134:aastore         
	//   86  135:dup             
	//   87  136:bipush          18
	//   88  138:ldc1            #79  <String "XT1040">
	//   89  140:aastore         
	//   90  141:dup             
	//   91  142:bipush          19
	//   92  144:ldc1            #81  <String "XT1042">
	//   93  146:aastore         
	//   94  147:dup             
	//   95  148:bipush          20
	//   96  150:ldc1            #83  <String "XT1045">
	//   97  152:aastore         
	//   98  153:dup             
	//   99  154:bipush          21
	//  100  156:ldc1            #85  <String "XT1063">
	//  101  158:aastore         
	//  102  159:dup             
	//  103  160:bipush          22
	//  104  162:ldc1            #87  <String "XT1064">
	//  105  164:aastore         
	//  106  165:dup             
	//  107  166:bipush          23
	//  108  168:ldc1            #89  <String "XT1068">
	//  109  170:aastore         
	//  110  171:dup             
	//  111  172:bipush          24
	//  112  174:ldc1            #91  <String "XT1069">
	//  113  176:aastore         
	//  114  177:dup             
	//  115  178:bipush          25
	//  116  180:ldc1            #93  <String "XT1072">
	//  117  182:aastore         
	//  118  183:dup             
	//  119  184:bipush          26
	//  120  186:ldc1            #95  <String "XT1077">
	//  121  188:aastore         
	//  122  189:dup             
	//  123  190:bipush          27
	//  124  192:ldc1            #97  <String "XT1078">
	//  125  194:aastore         
	//  126  195:dup             
	//  127  196:bipush          28
	//  128  198:ldc1            #99  <String "XT1079">
	//  129  200:aastore         
	//  130  201:invokestatic    #105 <Method java.util.List Arrays.asList(Object[])>
	//  131  204:invokespecial   #108 <Method void HashSet(java.util.Collection)>
	//  132  207:putstatic       #110 <Field Set MODELS_REQUIRING_BITMAP_LOCK>
		Object obj;
		if(MODELS_REQUIRING_BITMAP_LOCK.contains(((Object) (Build.MODEL))))
	//* 133  210:getstatic       #110 <Field Set MODELS_REQUIRING_BITMAP_LOCK>
	//* 134  213:getstatic       #115 <Field String Build.MODEL>
	//* 135  216:invokeinterface #121 <Method boolean Set.contains(Object)>
	//* 136  221:ifeq            235
			obj = ((Object) (new ReentrantLock()));
	//  137  224:new             #123 <Class ReentrantLock>
	//  138  227:dup             
	//  139  228:invokespecial   #125 <Method void ReentrantLock()>
	//  140  231:astore_0        
		else
	//* 141  232:goto            243
			obj = ((Object) (new NoLock()));
	//  142  235:new             #6   <Class TransformationUtils$NoLock>
	//  143  238:dup             
	//  144  239:invokespecial   #126 <Method void TransformationUtils$NoLock()>
	//  145  242:astore_0        
		BITMAP_DRAWABLE_LOCK = ((Lock) (obj));
	//  146  243:aload_0         
	//  147  244:putstatic       #128 <Field Lock BITMAP_DRAWABLE_LOCK>
		CIRCLE_CROP_BITMAP_PAINT = new Paint(7);
	//  148  247:new             #29  <Class Paint>
	//  149  250:dup             
	//  150  251:bipush          7
	//  151  253:invokespecial   #33  <Method void Paint(int)>
	//  152  256:putstatic       #130 <Field Paint CIRCLE_CROP_BITMAP_PAINT>
		CIRCLE_CROP_BITMAP_PAINT.setXfermode(((android.graphics.Xfermode) (new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN))));
	//  153  259:getstatic       #130 <Field Paint CIRCLE_CROP_BITMAP_PAINT>
	//  154  262:new             #132 <Class PorterDuffXfermode>
	//  155  265:dup             
	//  156  266:getstatic       #138 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//  157  269:invokespecial   #141 <Method void PorterDuffXfermode(android.graphics.PorterDuff$Mode)>
	//  158  272:invokevirtual   #145 <Method android.graphics.Xfermode Paint.setXfermode(android.graphics.Xfermode)>
	//  159  275:pop             
	//* 160  276:return          
	}
}
