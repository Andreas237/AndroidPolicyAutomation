// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.*;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

public final class TransformationUtils
{
	static final class NoLock
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
	//    1    1:invokespecial   #93  <Method void Object()>
	//    2    4:return          
	}

	private static void applyMatrix(Bitmap bitmap, Bitmap bitmap1, Matrix matrix)
	{
		BITMAP_DRAWABLE_LOCK.lock();
	//    0    0:getstatic       #74  <Field Lock BITMAP_DRAWABLE_LOCK>
	//    1    3:invokeinterface #101 <Method void Lock.lock()>
		bitmap1 = ((Bitmap) (new Canvas(bitmap1)));
	//    2    8:new             #103 <Class Canvas>
	//    3   11:dup             
	//    4   12:aload_1         
	//    5   13:invokespecial   #106 <Method void Canvas(Bitmap)>
	//    6   16:astore_1        
		((Canvas) (bitmap1)).drawBitmap(bitmap, matrix, DEFAULT_PAINT);
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:aload_2         
	//   10   20:getstatic       #35  <Field Paint DEFAULT_PAINT>
	//   11   23:invokevirtual   #110 <Method void Canvas.drawBitmap(Bitmap, Matrix, Paint)>
		clear(((Canvas) (bitmap1)));
	//   12   26:aload_1         
	//   13   27:invokestatic    #114 <Method void clear(Canvas)>
		BITMAP_DRAWABLE_LOCK.unlock();
	//   14   30:getstatic       #74  <Field Lock BITMAP_DRAWABLE_LOCK>
	//   15   33:invokeinterface #117 <Method void Lock.unlock()>
		return;
	//   16   38:return          
		bitmap;
	//   17   39:astore_0        
		BITMAP_DRAWABLE_LOCK.unlock();
	//   18   40:getstatic       #74  <Field Lock BITMAP_DRAWABLE_LOCK>
	//   19   43:invokeinterface #117 <Method void Lock.unlock()>
		throw bitmap;
	//   20   48:aload_0         
	//   21   49:athrow          
	}

	public static Bitmap centerCrop(BitmapPool bitmappool, Bitmap bitmap, int i, int j)
	{
		if(bitmap.getWidth() == i && bitmap.getHeight() == j)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//*   2    4:iload_2         
	//*   3    5:icmpne          18
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//*   6   12:iload_3         
	//*   7   13:icmpne          18
			return bitmap;
	//    8   16:aload_1         
	//    9   17:areturn         
		float f1 = 0.0F;
	//   10   18:fconst_0        
	//   11   19:fstore          5
		float f2 = 0.0F;
	//   12   21:fconst_0        
	//   13   22:fstore          6
		Matrix matrix = new Matrix();
	//   14   24:new             #131 <Class Matrix>
	//   15   27:dup             
	//   16   28:invokespecial   #132 <Method void Matrix()>
	//   17   31:astore          7
		float f;
		if(bitmap.getWidth() * j > bitmap.getHeight() * i)
	//*  18   33:aload_1         
	//*  19   34:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//*  20   37:iload_3         
	//*  21   38:imul            
	//*  22   39:aload_1         
	//*  23   40:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//*  24   43:iload_2         
	//*  25   44:imul            
	//*  26   45:icmple          77
		{
			f = (float)j / (float)bitmap.getHeight();
	//   27   48:iload_3         
	//   28   49:i2f             
	//   29   50:aload_1         
	//   30   51:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//   31   54:i2f             
	//   32   55:fdiv            
	//   33   56:fstore          4
			f1 = ((float)i - (float)bitmap.getWidth() * f) * 0.5F;
	//   34   58:iload_2         
	//   35   59:i2f             
	//   36   60:aload_1         
	//   37   61:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//   38   64:i2f             
	//   39   65:fload           4
	//   40   67:fmul            
	//   41   68:fsub            
	//   42   69:ldc1            #133 <Float 0.5F>
	//   43   71:fmul            
	//   44   72:fstore          5
		} else
	//*  45   74:goto            103
		{
			f = (float)i / (float)bitmap.getWidth();
	//   46   77:iload_2         
	//   47   78:i2f             
	//   48   79:aload_1         
	//   49   80:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//   50   83:i2f             
	//   51   84:fdiv            
	//   52   85:fstore          4
			f2 = ((float)j - (float)bitmap.getHeight() * f) * 0.5F;
	//   53   87:iload_3         
	//   54   88:i2f             
	//   55   89:aload_1         
	//   56   90:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//   57   93:i2f             
	//   58   94:fload           4
	//   59   96:fmul            
	//   60   97:fsub            
	//   61   98:ldc1            #133 <Float 0.5F>
	//   62  100:fmul            
	//   63  101:fstore          6
		}
		matrix.setScale(f, f);
	//   64  103:aload           7
	//   65  105:fload           4
	//   66  107:fload           4
	//   67  109:invokevirtual   #137 <Method void Matrix.setScale(float, float)>
		matrix.postTranslate((int)(0.5F + f1), (int)(0.5F + f2));
	//   68  112:aload           7
	//   69  114:ldc1            #133 <Float 0.5F>
	//   70  116:fload           5
	//   71  118:fadd            
	//   72  119:f2i             
	//   73  120:i2f             
	//   74  121:ldc1            #133 <Float 0.5F>
	//   75  123:fload           6
	//   76  125:fadd            
	//   77  126:f2i             
	//   78  127:i2f             
	//   79  128:invokevirtual   #141 <Method boolean Matrix.postTranslate(float, float)>
	//   80  131:pop             
		bitmappool = ((BitmapPool) (bitmappool.get(i, j, getSafeConfig(bitmap))));
	//   81  132:aload_0         
	//   82  133:iload_2         
	//   83  134:iload_3         
	//   84  135:aload_1         
	//   85  136:invokestatic    #145 <Method android.graphics.Bitmap$Config getSafeConfig(Bitmap)>
	//   86  139:invokeinterface #151 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   87  144:astore_0        
		setAlpha(bitmap, ((Bitmap) (bitmappool)));
	//   88  145:aload_1         
	//   89  146:aload_0         
	//   90  147:invokestatic    #155 <Method void setAlpha(Bitmap, Bitmap)>
		applyMatrix(bitmap, ((Bitmap) (bitmappool)), matrix);
	//   91  150:aload_1         
	//   92  151:aload_0         
	//   93  152:aload           7
	//   94  154:invokestatic    #157 <Method void applyMatrix(Bitmap, Bitmap, Matrix)>
		return ((Bitmap) (bitmappool));
	//   95  157:aload_0         
	//   96  158:areturn         
	}

	public static Bitmap centerInside(BitmapPool bitmappool, Bitmap bitmap, int i, int j)
	{
		if(bitmap.getWidth() <= i && bitmap.getHeight() <= j)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//*   2    4:iload_2         
	//*   3    5:icmpgt          35
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//*   6   12:iload_3         
	//*   7   13:icmpgt          35
		{
			if(Log.isLoggable("TransformationUtils", 2))
	//*   8   16:ldc1            #25  <String "TransformationUtils">
	//*   9   18:iconst_2        
	//*  10   19:invokestatic    #164 <Method boolean Log.isLoggable(String, int)>
	//*  11   22:ifeq            33
				Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
	//   12   25:ldc1            #25  <String "TransformationUtils">
	//   13   27:ldc1            #166 <String "requested target size larger or equal to input, returning input">
	//   14   29:invokestatic    #170 <Method int Log.v(String, String)>
	//   15   32:pop             
			return bitmap;
	//   16   33:aload_1         
	//   17   34:areturn         
		}
		if(Log.isLoggable("TransformationUtils", 2))
	//*  18   35:ldc1            #25  <String "TransformationUtils">
	//*  19   37:iconst_2        
	//*  20   38:invokestatic    #164 <Method boolean Log.isLoggable(String, int)>
	//*  21   41:ifeq            52
			Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
	//   22   44:ldc1            #25  <String "TransformationUtils">
	//   23   46:ldc1            #172 <String "requested target size too big for input, fit centering instead">
	//   24   48:invokestatic    #170 <Method int Log.v(String, String)>
	//   25   51:pop             
		return fitCenter(bitmappool, bitmap, i, j);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:iload_2         
	//   29   55:iload_3         
	//   30   56:invokestatic    #175 <Method Bitmap fitCenter(BitmapPool, Bitmap, int, int)>
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
	//    2    2:invokestatic    #182 <Method int Math.min(int, int)>
	//    3    5:istore_2        
		f = (float)i / 2.0F;
	//    4    6:iload_2         
	//    5    7:i2f             
	//    6    8:fconst_2        
	//    7    9:fdiv            
	//    8   10:fstore          4
		j = bitmap.getWidth();
	//    9   12:aload_1         
	//   10   13:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//   11   16:istore_3        
		int k = bitmap.getHeight();
	//   12   17:aload_1         
	//   13   18:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//   14   21:istore          9
		float f2 = Math.max((float)i / (float)j, (float)i / (float)k);
	//   15   23:iload_2         
	//   16   24:i2f             
	//   17   25:iload_3         
	//   18   26:i2f             
	//   19   27:fdiv            
	//   20   28:iload_2         
	//   21   29:i2f             
	//   22   30:iload           9
	//   23   32:i2f             
	//   24   33:fdiv            
	//   25   34:invokestatic    #186 <Method float Math.max(float, float)>
	//   26   37:fstore          6
		float f1 = f2 * (float)j;
	//   27   39:fload           6
	//   28   41:iload_3         
	//   29   42:i2f             
	//   30   43:fmul            
	//   31   44:fstore          5
		f2 *= k;
	//   32   46:fload           6
	//   33   48:iload           9
	//   34   50:i2f             
	//   35   51:fmul            
	//   36   52:fstore          6
		float f3 = ((float)i - f1) / 2.0F;
	//   37   54:iload_2         
	//   38   55:i2f             
	//   39   56:fload           5
	//   40   58:fsub            
	//   41   59:fconst_2        
	//   42   60:fdiv            
	//   43   61:fstore          7
		float f4 = ((float)i - f2) / 2.0F;
	//   44   63:iload_2         
	//   45   64:i2f             
	//   46   65:fload           6
	//   47   67:fsub            
	//   48   68:fconst_2        
	//   49   69:fdiv            
	//   50   70:fstore          8
		rectf = new RectF(f3, f4, f3 + f1, f4 + f2);
	//   51   72:new             #188 <Class RectF>
	//   52   75:dup             
	//   53   76:fload           7
	//   54   78:fload           8
	//   55   80:fload           7
	//   56   82:fload           5
	//   57   84:fadd            
	//   58   85:fload           8
	//   59   87:fload           6
	//   60   89:fadd            
	//   61   90:invokespecial   #191 <Method void RectF(float, float, float, float)>
	//   62   93:astore          10
		bitmap1 = getAlphaSafeBitmap(bitmappool, bitmap);
	//   63   95:aload_0         
	//   64   96:aload_1         
	//   65   97:invokestatic    #195 <Method Bitmap getAlphaSafeBitmap(BitmapPool, Bitmap)>
	//   66  100:astore          11
		bitmap2 = bitmappool.get(i, i, android.graphics.Bitmap.Config.ARGB_8888);
	//   67  102:aload_0         
	//   68  103:iload_2         
	//   69  104:iload_2         
	//   70  105:getstatic       #201 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   71  108:invokeinterface #151 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   72  113:astore          12
		bitmap2.setHasAlpha(true);
	//   73  115:aload           12
	//   74  117:iconst_1        
	//   75  118:invokevirtual   #205 <Method void Bitmap.setHasAlpha(boolean)>
		BITMAP_DRAWABLE_LOCK.lock();
	//   76  121:getstatic       #74  <Field Lock BITMAP_DRAWABLE_LOCK>
	//   77  124:invokeinterface #101 <Method void Lock.lock()>
		Canvas canvas = new Canvas(bitmap2);
	//   78  129:new             #103 <Class Canvas>
	//   79  132:dup             
	//   80  133:aload           12
	//   81  135:invokespecial   #106 <Method void Canvas(Bitmap)>
	//   82  138:astore          13
		canvas.drawCircle(f, f, f, CIRCLE_CROP_SHAPE_PAINT);
	//   83  140:aload           13
	//   84  142:fload           4
	//   85  144:fload           4
	//   86  146:fload           4
	//   87  148:getstatic       #37  <Field Paint CIRCLE_CROP_SHAPE_PAINT>
	//   88  151:invokevirtual   #209 <Method void Canvas.drawCircle(float, float, float, Paint)>
		canvas.drawBitmap(bitmap1, ((android.graphics.Rect) (null)), rectf, CIRCLE_CROP_BITMAP_PAINT);
	//   89  154:aload           13
	//   90  156:aload           11
	//   91  158:aconst_null     
	//   92  159:aload           10
	//   93  161:getstatic       #76  <Field Paint CIRCLE_CROP_BITMAP_PAINT>
	//   94  164:invokevirtual   #212 <Method void Canvas.drawBitmap(Bitmap, android.graphics.Rect, RectF, Paint)>
		clear(canvas);
	//   95  167:aload           13
	//   96  169:invokestatic    #114 <Method void clear(Canvas)>
		BITMAP_DRAWABLE_LOCK.unlock();
	//   97  172:getstatic       #74  <Field Lock BITMAP_DRAWABLE_LOCK>
	//   98  175:invokeinterface #117 <Method void Lock.unlock()>
		break MISSING_BLOCK_LABEL_194;
	//   99  180:goto            194
		bitmappool;
	//  100  183:astore_0        
		BITMAP_DRAWABLE_LOCK.unlock();
	//  101  184:getstatic       #74  <Field Lock BITMAP_DRAWABLE_LOCK>
	//  102  187:invokeinterface #117 <Method void Lock.unlock()>
		throw bitmappool;
	//  103  192:aload_0         
	//  104  193:athrow          
		if(!((Object) (bitmap1)).equals(((Object) (bitmap))))
	//* 105  194:aload           11
	//* 106  196:aload_1         
	//* 107  197:invokevirtual   #215 <Method boolean Object.equals(Object)>
	//* 108  200:ifne            211
			bitmappool.put(bitmap1);
	//  109  203:aload_0         
	//  110  204:aload           11
	//  111  206:invokeinterface #218 <Method void BitmapPool.put(Bitmap)>
		return bitmap2;
	//  112  211:aload           12
	//  113  213:areturn         
	}

	private static void clear(Canvas canvas)
	{
		canvas.setBitmap(((Bitmap) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #221 <Method void Canvas.setBitmap(Bitmap)>
	//    3    5:return          
	}

	public static Bitmap fitCenter(BitmapPool bitmappool, Bitmap bitmap, int i, int j)
	{
		if(bitmap.getWidth() == i && bitmap.getHeight() == j)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//*   2    4:iload_2         
	//*   3    5:icmpne          35
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//*   6   12:iload_3         
	//*   7   13:icmpne          35
		{
			if(Log.isLoggable("TransformationUtils", 2))
	//*   8   16:ldc1            #25  <String "TransformationUtils">
	//*   9   18:iconst_2        
	//*  10   19:invokestatic    #164 <Method boolean Log.isLoggable(String, int)>
	//*  11   22:ifeq            33
				Log.v("TransformationUtils", "requested target size matches input, returning input");
	//   12   25:ldc1            #25  <String "TransformationUtils">
	//   13   27:ldc1            #223 <String "requested target size matches input, returning input">
	//   14   29:invokestatic    #170 <Method int Log.v(String, String)>
	//   15   32:pop             
			return bitmap;
	//   16   33:aload_1         
	//   17   34:areturn         
		}
		float f = Math.min((float)i / (float)bitmap.getWidth(), (float)j / (float)bitmap.getHeight());
	//   18   35:iload_2         
	//   19   36:i2f             
	//   20   37:aload_1         
	//   21   38:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//   22   41:i2f             
	//   23   42:fdiv            
	//   24   43:iload_3         
	//   25   44:i2f             
	//   26   45:aload_1         
	//   27   46:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//   28   49:i2f             
	//   29   50:fdiv            
	//   30   51:invokestatic    #225 <Method float Math.min(float, float)>
	//   31   54:fstore          4
		int k = (int)((float)bitmap.getWidth() * f);
	//   32   56:aload_1         
	//   33   57:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//   34   60:i2f             
	//   35   61:fload           4
	//   36   63:fmul            
	//   37   64:f2i             
	//   38   65:istore          5
		int l = (int)((float)bitmap.getHeight() * f);
	//   39   67:aload_1         
	//   40   68:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//   41   71:i2f             
	//   42   72:fload           4
	//   43   74:fmul            
	//   44   75:f2i             
	//   45   76:istore          6
		if(bitmap.getWidth() == k && bitmap.getHeight() == l)
	//*  46   78:aload_1         
	//*  47   79:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//*  48   82:iload           5
	//*  49   84:icmpne          115
	//*  50   87:aload_1         
	//*  51   88:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//*  52   91:iload           6
	//*  53   93:icmpne          115
		{
			if(Log.isLoggable("TransformationUtils", 2))
	//*  54   96:ldc1            #25  <String "TransformationUtils">
	//*  55   98:iconst_2        
	//*  56   99:invokestatic    #164 <Method boolean Log.isLoggable(String, int)>
	//*  57  102:ifeq            113
				Log.v("TransformationUtils", "adjusted target size matches input, returning input");
	//   58  105:ldc1            #25  <String "TransformationUtils">
	//   59  107:ldc1            #227 <String "adjusted target size matches input, returning input">
	//   60  109:invokestatic    #170 <Method int Log.v(String, String)>
	//   61  112:pop             
			return bitmap;
	//   62  113:aload_1         
	//   63  114:areturn         
		}
		bitmappool = ((BitmapPool) (bitmappool.get(k, l, getSafeConfig(bitmap))));
	//   64  115:aload_0         
	//   65  116:iload           5
	//   66  118:iload           6
	//   67  120:aload_1         
	//   68  121:invokestatic    #145 <Method android.graphics.Bitmap$Config getSafeConfig(Bitmap)>
	//   69  124:invokeinterface #151 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   70  129:astore_0        
		setAlpha(bitmap, ((Bitmap) (bitmappool)));
	//   71  130:aload_1         
	//   72  131:aload_0         
	//   73  132:invokestatic    #155 <Method void setAlpha(Bitmap, Bitmap)>
		if(Log.isLoggable("TransformationUtils", 2))
	//*  74  135:ldc1            #25  <String "TransformationUtils">
	//*  75  137:iconst_2        
	//*  76  138:invokestatic    #164 <Method boolean Log.isLoggable(String, int)>
	//*  77  141:ifeq            284
		{
			Log.v("TransformationUtils", (new StringBuilder()).append("request: ").append(i).append("x").append(j).toString());
	//   78  144:ldc1            #25  <String "TransformationUtils">
	//   79  146:new             #229 <Class StringBuilder>
	//   80  149:dup             
	//   81  150:invokespecial   #230 <Method void StringBuilder()>
	//   82  153:ldc1            #232 <String "request: ">
	//   83  155:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   84  158:iload_2         
	//   85  159:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//   86  162:ldc1            #241 <String "x">
	//   87  164:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   88  167:iload_3         
	//   89  168:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//   90  171:invokevirtual   #245 <Method String StringBuilder.toString()>
	//   91  174:invokestatic    #170 <Method int Log.v(String, String)>
	//   92  177:pop             
			Log.v("TransformationUtils", (new StringBuilder()).append("toFit:   ").append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).toString());
	//   93  178:ldc1            #25  <String "TransformationUtils">
	//   94  180:new             #229 <Class StringBuilder>
	//   95  183:dup             
	//   96  184:invokespecial   #230 <Method void StringBuilder()>
	//   97  187:ldc1            #247 <String "toFit:   ">
	//   98  189:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   99  192:aload_1         
	//  100  193:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//  101  196:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//  102  199:ldc1            #241 <String "x">
	//  103  201:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  104  204:aload_1         
	//  105  205:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//  106  208:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//  107  211:invokevirtual   #245 <Method String StringBuilder.toString()>
	//  108  214:invokestatic    #170 <Method int Log.v(String, String)>
	//  109  217:pop             
			Log.v("TransformationUtils", (new StringBuilder()).append("toReuse: ").append(((Bitmap) (bitmappool)).getWidth()).append("x").append(((Bitmap) (bitmappool)).getHeight()).toString());
	//  110  218:ldc1            #25  <String "TransformationUtils">
	//  111  220:new             #229 <Class StringBuilder>
	//  112  223:dup             
	//  113  224:invokespecial   #230 <Method void StringBuilder()>
	//  114  227:ldc1            #249 <String "toReuse: ">
	//  115  229:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  116  232:aload_0         
	//  117  233:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//  118  236:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//  119  239:ldc1            #241 <String "x">
	//  120  241:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  121  244:aload_0         
	//  122  245:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//  123  248:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//  124  251:invokevirtual   #245 <Method String StringBuilder.toString()>
	//  125  254:invokestatic    #170 <Method int Log.v(String, String)>
	//  126  257:pop             
			Log.v("TransformationUtils", (new StringBuilder()).append("minPct:   ").append(f).toString());
	//  127  258:ldc1            #25  <String "TransformationUtils">
	//  128  260:new             #229 <Class StringBuilder>
	//  129  263:dup             
	//  130  264:invokespecial   #230 <Method void StringBuilder()>
	//  131  267:ldc1            #251 <String "minPct:   ">
	//  132  269:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  133  272:fload           4
	//  134  274:invokevirtual   #254 <Method StringBuilder StringBuilder.append(float)>
	//  135  277:invokevirtual   #245 <Method String StringBuilder.toString()>
	//  136  280:invokestatic    #170 <Method int Log.v(String, String)>
	//  137  283:pop             
		}
		Matrix matrix = new Matrix();
	//  138  284:new             #131 <Class Matrix>
	//  139  287:dup             
	//  140  288:invokespecial   #132 <Method void Matrix()>
	//  141  291:astore          7
		matrix.setScale(f, f);
	//  142  293:aload           7
	//  143  295:fload           4
	//  144  297:fload           4
	//  145  299:invokevirtual   #137 <Method void Matrix.setScale(float, float)>
		applyMatrix(bitmap, ((Bitmap) (bitmappool)), matrix);
	//  146  302:aload_1         
	//  147  303:aload_0         
	//  148  304:aload           7
	//  149  306:invokestatic    #157 <Method void applyMatrix(Bitmap, Bitmap, Matrix)>
		return ((Bitmap) (bitmappool));
	//  150  309:aload_0         
	//  151  310:areturn         
	}

	private static Bitmap getAlphaSafeBitmap(BitmapPool bitmappool, Bitmap bitmap)
	{
		if(android.graphics.Bitmap.Config.ARGB_8888.equals(((Object) (bitmap.getConfig()))))
	//*   0    0:getstatic       #201 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #258 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//*   3    7:invokevirtual   #259 <Method boolean android.graphics.Bitmap$Config.equals(Object)>
	//*   4   10:ifeq            15
		{
			return bitmap;
	//    5   13:aload_1         
	//    6   14:areturn         
		} else
		{
			bitmappool = ((BitmapPool) (bitmappool.get(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//   12   24:getstatic       #201 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   13   27:invokeinterface #151 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   14   32:astore_0        
			(new Canvas(((Bitmap) (bitmappool)))).drawBitmap(bitmap, 0.0F, 0.0F, ((Paint) (null)));
	//   15   33:new             #103 <Class Canvas>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #106 <Method void Canvas(Bitmap)>
	//   19   41:aload_1         
	//   20   42:fconst_0        
	//   21   43:fconst_0        
	//   22   44:aconst_null     
	//   23   45:invokevirtual   #262 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
			return ((Bitmap) (bitmappool));
	//   24   48:aload_0         
	//   25   49:areturn         
		}
	}

	public static Lock getBitmapDrawableLock()
	{
		return BITMAP_DRAWABLE_LOCK;
	//    0    0:getstatic       #74  <Field Lock BITMAP_DRAWABLE_LOCK>
	//    1    3:areturn         
	}

	public static int getExifOrientationDegrees(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     3 8: default 40
	//	               3 46
	//	               4 46
	//	               5 43
	//	               6 43
	//	               7 50
	//	               8 50
	//*   2   40:goto            54
		case 5: // '\005'
		case 6: // '\006'
			return 90;
	//    3   43:bipush          90
	//    4   45:ireturn         

		case 3: // '\003'
		case 4: // '\004'
			return 180;
	//    5   46:sipush          180
	//    6   49:ireturn         

		case 7: // '\007'
		case 8: // '\b'
			return 270;
	//    7   50:sipush          270
	//    8   53:ireturn         
		}
		return 0;
	//    9   54:iconst_0        
	//   10   55:ireturn         
	}

	private static android.graphics.Bitmap.Config getSafeConfig(Bitmap bitmap)
	{
		if(bitmap.getConfig() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #258 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//*   2    4:ifnull          12
			return bitmap.getConfig();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #258 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//    5   11:areturn         
		else
			return android.graphics.Bitmap.Config.ARGB_8888;
	//    6   12:getstatic       #201 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//    7   15:areturn         
	}

	static void initializeMatrixForRotation(int i, Matrix matrix)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     2 8: default 44
	//	               2 45
	//	               3 54
	//	               4 62
	//	               5 79
	//	               6 96
	//	               7 104
	//	               8 121
		default:
			return;
	//    2   44:return          

		case 2: // '\002'
			matrix.setScale(-1F, 1.0F);
	//    3   45:aload_1         
	//    4   46:ldc2            #269 <Float -1F>
	//    5   49:fconst_1        
	//    6   50:invokevirtual   #137 <Method void Matrix.setScale(float, float)>
			return;
	//    7   53:return          

		case 3: // '\003'
			matrix.setRotate(180F);
	//    8   54:aload_1         
	//    9   55:ldc2            #270 <Float 180F>
	//   10   58:invokevirtual   #274 <Method void Matrix.setRotate(float)>
			return;
	//   11   61:return          

		case 4: // '\004'
			matrix.setRotate(180F);
	//   12   62:aload_1         
	//   13   63:ldc2            #270 <Float 180F>
	//   14   66:invokevirtual   #274 <Method void Matrix.setRotate(float)>
			matrix.postScale(-1F, 1.0F);
	//   15   69:aload_1         
	//   16   70:ldc2            #269 <Float -1F>
	//   17   73:fconst_1        
	//   18   74:invokevirtual   #277 <Method boolean Matrix.postScale(float, float)>
	//   19   77:pop             
			return;
	//   20   78:return          

		case 5: // '\005'
			matrix.setRotate(90F);
	//   21   79:aload_1         
	//   22   80:ldc2            #278 <Float 90F>
	//   23   83:invokevirtual   #274 <Method void Matrix.setRotate(float)>
			matrix.postScale(-1F, 1.0F);
	//   24   86:aload_1         
	//   25   87:ldc2            #269 <Float -1F>
	//   26   90:fconst_1        
	//   27   91:invokevirtual   #277 <Method boolean Matrix.postScale(float, float)>
	//   28   94:pop             
			return;
	//   29   95:return          

		case 6: // '\006'
			matrix.setRotate(90F);
	//   30   96:aload_1         
	//   31   97:ldc2            #278 <Float 90F>
	//   32  100:invokevirtual   #274 <Method void Matrix.setRotate(float)>
			return;
	//   33  103:return          

		case 7: // '\007'
			matrix.setRotate(-90F);
	//   34  104:aload_1         
	//   35  105:ldc2            #279 <Float -90F>
	//   36  108:invokevirtual   #274 <Method void Matrix.setRotate(float)>
			matrix.postScale(-1F, 1.0F);
	//   37  111:aload_1         
	//   38  112:ldc2            #269 <Float -1F>
	//   39  115:fconst_1        
	//   40  116:invokevirtual   #277 <Method boolean Matrix.postScale(float, float)>
	//   41  119:pop             
			return;
	//   42  120:return          

		case 8: // '\b'
			matrix.setRotate(-90F);
	//   43  121:aload_1         
	//   44  122:ldc2            #279 <Float -90F>
	//   45  125:invokevirtual   #274 <Method void Matrix.setRotate(float)>
			break;
		}
	//   46  128:return          
	}

	public static boolean isExifOrientationRequired(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     2 8: default 44
	//	               2 47
	//	               3 47
	//	               4 47
	//	               5 47
	//	               6 47
	//	               7 47
	//	               8 47
	//*   2   44:goto            49
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
			return true;
	//    3   47:iconst_1        
	//    4   48:ireturn         
		}
		return false;
	//    5   49:iconst_0        
	//    6   50:ireturn         
	}

	public static Bitmap rotateImage(Bitmap bitmap, int i)
	{
		Bitmap bitmap1 = bitmap;
	//    0    0:aload_0         
	//    1    1:astore_2        
		Object obj = ((Object) (bitmap1));
	//    2    2:aload_2         
	//    3    3:astore_3        
		if(i != 0)
	//*   4    4:iload_1         
	//*   5    5:ifeq            39
			try
			{
				obj = ((Object) (new Matrix()));
	//    6    8:new             #131 <Class Matrix>
	//    7   11:dup             
	//    8   12:invokespecial   #132 <Method void Matrix()>
	//    9   15:astore_3        
				((Matrix) (obj)).setRotate(i);
	//   10   16:aload_3         
	//   11   17:iload_1         
	//   12   18:i2f             
	//   13   19:invokevirtual   #274 <Method void Matrix.setRotate(float)>
				obj = ((Object) (Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true)));
	//   14   22:aload_0         
	//   15   23:iconst_0        
	//   16   24:iconst_0        
	//   17   25:aload_0         
	//   18   26:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//   19   29:aload_0         
	//   20   30:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//   21   33:aload_3         
	//   22   34:iconst_1        
	//   23   35:invokestatic    #289 <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int, Matrix, boolean)>
	//   24   38:astore_3        
			}
	//*  25   39:aload_3         
	//*  26   40:areturn         
			// Misplaced declaration of an exception variable
			catch(Bitmap bitmap)
	//*  27   41:astore_0        
			{
				if(Log.isLoggable("TransformationUtils", 6))
	//*  28   42:ldc1            #25  <String "TransformationUtils">
	//*  29   44:bipush          6
	//*  30   46:invokestatic    #164 <Method boolean Log.isLoggable(String, int)>
	//*  31   49:ifeq            62
					Log.e("TransformationUtils", "Exception when trying to orient image", ((Throwable) (bitmap)));
	//   32   52:ldc1            #25  <String "TransformationUtils">
	//   33   54:ldc2            #291 <String "Exception when trying to orient image">
	//   34   57:aload_0         
	//   35   58:invokestatic    #295 <Method int Log.e(String, String, Throwable)>
	//   36   61:pop             
				return bitmap1;
	//   37   62:aload_2         
	//   38   63:areturn         
			}
		return ((Bitmap) (obj));
	}

	public static Bitmap rotateImageExif(BitmapPool bitmappool, Bitmap bitmap, int i)
	{
		if(!isExifOrientationRequired(i))
	//*   0    0:iload_2         
	//*   1    1:invokestatic    #299 <Method boolean isExifOrientationRequired(int)>
	//*   2    4:ifne            9
		{
			return bitmap;
	//    3    7:aload_1         
	//    4    8:areturn         
		} else
		{
			Matrix matrix = new Matrix();
	//    5    9:new             #131 <Class Matrix>
	//    6   12:dup             
	//    7   13:invokespecial   #132 <Method void Matrix()>
	//    8   16:astore_3        
			initializeMatrixForRotation(i, matrix);
	//    9   17:iload_2         
	//   10   18:aload_3         
	//   11   19:invokestatic    #301 <Method void initializeMatrixForRotation(int, Matrix)>
			RectF rectf = new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight());
	//   12   22:new             #188 <Class RectF>
	//   13   25:dup             
	//   14   26:fconst_0        
	//   15   27:fconst_0        
	//   16   28:aload_1         
	//   17   29:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//   18   32:i2f             
	//   19   33:aload_1         
	//   20   34:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//   21   37:i2f             
	//   22   38:invokespecial   #191 <Method void RectF(float, float, float, float)>
	//   23   41:astore          4
			matrix.mapRect(rectf);
	//   24   43:aload_3         
	//   25   44:aload           4
	//   26   46:invokevirtual   #305 <Method boolean Matrix.mapRect(RectF)>
	//   27   49:pop             
			bitmappool = ((BitmapPool) (bitmappool.get(Math.round(rectf.width()), Math.round(rectf.height()), getSafeConfig(bitmap))));
	//   28   50:aload_0         
	//   29   51:aload           4
	//   30   53:invokevirtual   #309 <Method float RectF.width()>
	//   31   56:invokestatic    #313 <Method int Math.round(float)>
	//   32   59:aload           4
	//   33   61:invokevirtual   #316 <Method float RectF.height()>
	//   34   64:invokestatic    #313 <Method int Math.round(float)>
	//   35   67:aload_1         
	//   36   68:invokestatic    #145 <Method android.graphics.Bitmap$Config getSafeConfig(Bitmap)>
	//   37   71:invokeinterface #151 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   38   76:astore_0        
			matrix.postTranslate(-rectf.left, -rectf.top);
	//   39   77:aload_3         
	//   40   78:aload           4
	//   41   80:getfield        #320 <Field float RectF.left>
	//   42   83:fneg            
	//   43   84:aload           4
	//   44   86:getfield        #323 <Field float RectF.top>
	//   45   89:fneg            
	//   46   90:invokevirtual   #141 <Method boolean Matrix.postTranslate(float, float)>
	//   47   93:pop             
			applyMatrix(bitmap, ((Bitmap) (bitmappool)), matrix);
	//   48   94:aload_1         
	//   49   95:aload_0         
	//   50   96:aload_3         
	//   51   97:invokestatic    #157 <Method void applyMatrix(Bitmap, Bitmap, Matrix)>
			return ((Bitmap) (bitmappool));
	//   52  100:aload_0         
	//   53  101:areturn         
		}
	}

	public static Bitmap roundedCorners(BitmapPool bitmappool, Bitmap bitmap, int i, int j, int k)
	{
		Bitmap bitmap1;
		Bitmap bitmap2;
		Paint paint;
		Object obj;
		boolean flag;
		if(i > 0)
	//*   0    0:iload_2         
	//*   1    1:ifle            10
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore          5
		else
	//*   4    7:goto            13
			flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          5
		Preconditions.checkArgument(flag, "width must be greater than 0.");
	//    7   13:iload           5
	//    8   15:ldc2            #327 <String "width must be greater than 0.">
	//    9   18:invokestatic    #333 <Method void Preconditions.checkArgument(boolean, String)>
		if(j > 0)
	//*  10   21:iload_3         
	//*  11   22:ifle            31
			flag = true;
	//   12   25:iconst_1        
	//   13   26:istore          5
		else
	//*  14   28:goto            34
			flag = false;
	//   15   31:iconst_0        
	//   16   32:istore          5
		Preconditions.checkArgument(flag, "height must be greater than 0.");
	//   17   34:iload           5
	//   18   36:ldc2            #335 <String "height must be greater than 0.">
	//   19   39:invokestatic    #333 <Method void Preconditions.checkArgument(boolean, String)>
		if(k > 0)
	//*  20   42:iload           4
	//*  21   44:ifle            53
			flag = true;
	//   22   47:iconst_1        
	//   23   48:istore          5
		else
	//*  24   50:goto            56
			flag = false;
	//   25   53:iconst_0        
	//   26   54:istore          5
		Preconditions.checkArgument(flag, "roundingRadius must be greater than 0.");
	//   27   56:iload           5
	//   28   58:ldc2            #337 <String "roundingRadius must be greater than 0.">
	//   29   61:invokestatic    #333 <Method void Preconditions.checkArgument(boolean, String)>
		bitmap1 = getAlphaSafeBitmap(bitmappool, bitmap);
	//   30   64:aload_0         
	//   31   65:aload_1         
	//   32   66:invokestatic    #195 <Method Bitmap getAlphaSafeBitmap(BitmapPool, Bitmap)>
	//   33   69:astore          6
		bitmap2 = bitmappool.get(i, j, android.graphics.Bitmap.Config.ARGB_8888);
	//   34   71:aload_0         
	//   35   72:iload_2         
	//   36   73:iload_3         
	//   37   74:getstatic       #201 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   38   77:invokeinterface #151 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   39   82:astore          7
		bitmap2.setHasAlpha(true);
	//   40   84:aload           7
	//   41   86:iconst_1        
	//   42   87:invokevirtual   #205 <Method void Bitmap.setHasAlpha(boolean)>
		obj = ((Object) (new BitmapShader(bitmap1, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP)));
	//   43   90:new             #339 <Class BitmapShader>
	//   44   93:dup             
	//   45   94:aload           6
	//   46   96:getstatic       #345 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   47   99:getstatic       #345 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   48  102:invokespecial   #348 <Method void BitmapShader(Bitmap, android.graphics.Shader$TileMode, android.graphics.Shader$TileMode)>
	//   49  105:astore          9
		paint = new Paint();
	//   50  107:new             #29  <Class Paint>
	//   51  110:dup             
	//   52  111:invokespecial   #349 <Method void Paint()>
	//   53  114:astore          8
		paint.setAntiAlias(true);
	//   54  116:aload           8
	//   55  118:iconst_1        
	//   56  119:invokevirtual   #352 <Method void Paint.setAntiAlias(boolean)>
		paint.setShader(((android.graphics.Shader) (obj)));
	//   57  122:aload           8
	//   58  124:aload           9
	//   59  126:invokevirtual   #356 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//   60  129:pop             
		obj = ((Object) (new RectF(0.0F, 0.0F, bitmap2.getWidth(), bitmap2.getHeight())));
	//   61  130:new             #188 <Class RectF>
	//   62  133:dup             
	//   63  134:fconst_0        
	//   64  135:fconst_0        
	//   65  136:aload           7
	//   66  138:invokevirtual   #126 <Method int Bitmap.getWidth()>
	//   67  141:i2f             
	//   68  142:aload           7
	//   69  144:invokevirtual   #129 <Method int Bitmap.getHeight()>
	//   70  147:i2f             
	//   71  148:invokespecial   #191 <Method void RectF(float, float, float, float)>
	//   72  151:astore          9
		BITMAP_DRAWABLE_LOCK.lock();
	//   73  153:getstatic       #74  <Field Lock BITMAP_DRAWABLE_LOCK>
	//   74  156:invokeinterface #101 <Method void Lock.lock()>
		Canvas canvas = new Canvas(bitmap2);
	//   75  161:new             #103 <Class Canvas>
	//   76  164:dup             
	//   77  165:aload           7
	//   78  167:invokespecial   #106 <Method void Canvas(Bitmap)>
	//   79  170:astore          10
		canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
	//   80  172:aload           10
	//   81  174:iconst_0        
	//   82  175:getstatic       #359 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.CLEAR>
	//   83  178:invokevirtual   #363 <Method void Canvas.drawColor(int, android.graphics.PorterDuff$Mode)>
		canvas.drawRoundRect(((RectF) (obj)), k, k, paint);
	//   84  181:aload           10
	//   85  183:aload           9
	//   86  185:iload           4
	//   87  187:i2f             
	//   88  188:iload           4
	//   89  190:i2f             
	//   90  191:aload           8
	//   91  193:invokevirtual   #367 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
		clear(canvas);
	//   92  196:aload           10
	//   93  198:invokestatic    #114 <Method void clear(Canvas)>
		BITMAP_DRAWABLE_LOCK.unlock();
	//   94  201:getstatic       #74  <Field Lock BITMAP_DRAWABLE_LOCK>
	//   95  204:invokeinterface #117 <Method void Lock.unlock()>
		break MISSING_BLOCK_LABEL_223;
	//   96  209:goto            223
		bitmappool;
	//   97  212:astore_0        
		BITMAP_DRAWABLE_LOCK.unlock();
	//   98  213:getstatic       #74  <Field Lock BITMAP_DRAWABLE_LOCK>
	//   99  216:invokeinterface #117 <Method void Lock.unlock()>
		throw bitmappool;
	//  100  221:aload_0         
	//  101  222:athrow          
		if(!((Object) (bitmap1)).equals(((Object) (bitmap))))
	//* 102  223:aload           6
	//* 103  225:aload_1         
	//* 104  226:invokevirtual   #215 <Method boolean Object.equals(Object)>
	//* 105  229:ifne            240
			bitmappool.put(bitmap1);
	//  106  232:aload_0         
	//  107  233:aload           6
	//  108  235:invokeinterface #218 <Method void BitmapPool.put(Bitmap)>
		return bitmap2;
	//  109  240:aload           7
	//  110  242:areturn         
	}

	public static void setAlpha(Bitmap bitmap, Bitmap bitmap1)
	{
		bitmap1.setHasAlpha(bitmap.hasAlpha());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #371 <Method boolean Bitmap.hasAlpha()>
	//    3    5:invokevirtual   #205 <Method void Bitmap.setHasAlpha(boolean)>
	//    4    8:return          
	}

	private static final Lock BITMAP_DRAWABLE_LOCK;
	private static final Paint CIRCLE_CROP_BITMAP_PAINT;
	private static final int CIRCLE_CROP_PAINT_FLAGS = 7;
	private static final Paint CIRCLE_CROP_SHAPE_PAINT = new Paint(7);
	private static final Paint DEFAULT_PAINT = new Paint(6);
	private static final List MODELS_REQUIRING_BITMAP_LOCK;
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
		MODELS_REQUIRING_BITMAP_LOCK = Arrays.asList(((Object []) (new String[] {
			"XT1097", "XT1085"
		})));
	//   10   24:iconst_2        
	//   11   25:anewarray       String[]
	//   12   28:dup             
	//   13   29:iconst_0        
	//   14   30:ldc1            #41  <String "XT1097">
	//   15   32:aastore         
	//   16   33:dup             
	//   17   34:iconst_1        
	//   18   35:ldc1            #43  <String "XT1085">
	//   19   37:aastore         
	//   20   38:invokestatic    #49  <Method List Arrays.asList(Object[])>
	//   21   41:putstatic       #51  <Field List MODELS_REQUIRING_BITMAP_LOCK>
		Object obj;
		if(MODELS_REQUIRING_BITMAP_LOCK.contains(((Object) (Build.MODEL))) && android.os.Build.VERSION.SDK_INT == 22)
	//*  22   44:getstatic       #51  <Field List MODELS_REQUIRING_BITMAP_LOCK>
	//*  23   47:getstatic       #56  <Field String Build.MODEL>
	//*  24   50:invokeinterface #62  <Method boolean List.contains(Object)>
	//*  25   55:ifeq            77
	//*  26   58:getstatic       #67  <Field int android.os.Build$VERSION.SDK_INT>
	//*  27   61:bipush          22
	//*  28   63:icmpne          77
			obj = ((Object) (new ReentrantLock()));
	//   29   66:new             #69  <Class ReentrantLock>
	//   30   69:dup             
	//   31   70:invokespecial   #71  <Method void ReentrantLock()>
	//   32   73:astore_0        
		else
	//*  33   74:goto            85
			obj = ((Object) (new NoLock()));
	//   34   77:new             #6   <Class TransformationUtils$NoLock>
	//   35   80:dup             
	//   36   81:invokespecial   #72  <Method void TransformationUtils$NoLock()>
	//   37   84:astore_0        
		BITMAP_DRAWABLE_LOCK = ((Lock) (obj));
	//   38   85:aload_0         
	//   39   86:putstatic       #74  <Field Lock BITMAP_DRAWABLE_LOCK>
		CIRCLE_CROP_BITMAP_PAINT = new Paint(7);
	//   40   89:new             #29  <Class Paint>
	//   41   92:dup             
	//   42   93:bipush          7
	//   43   95:invokespecial   #33  <Method void Paint(int)>
	//   44   98:putstatic       #76  <Field Paint CIRCLE_CROP_BITMAP_PAINT>
		CIRCLE_CROP_BITMAP_PAINT.setXfermode(((android.graphics.Xfermode) (new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN))));
	//   45  101:getstatic       #76  <Field Paint CIRCLE_CROP_BITMAP_PAINT>
	//   46  104:new             #78  <Class PorterDuffXfermode>
	//   47  107:dup             
	//   48  108:getstatic       #84  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   49  111:invokespecial   #87  <Method void PorterDuffXfermode(android.graphics.PorterDuff$Mode)>
	//   50  114:invokevirtual   #91  <Method android.graphics.Xfermode Paint.setXfermode(android.graphics.Xfermode)>
	//   51  117:pop             
	//*  52  118:return          
	}
}
