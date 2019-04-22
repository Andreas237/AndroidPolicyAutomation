// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.*;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
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


	private static void applyMatrix(Bitmap bitmap, Bitmap bitmap1, Matrix matrix)
	{
		BITMAP_DRAWABLE_LOCK.lock();
	//    0    0:getstatic       #120 <Field Lock BITMAP_DRAWABLE_LOCK>
	//    1    3:invokeinterface #146 <Method void Lock.lock()>
		bitmap1 = ((Bitmap) (new Canvas(bitmap1)));
	//    2    8:new             #148 <Class Canvas>
	//    3   11:dup             
	//    4   12:aload_1         
	//    5   13:invokespecial   #151 <Method void Canvas(Bitmap)>
	//    6   16:astore_1        
		((Canvas) (bitmap1)).drawBitmap(bitmap, matrix, DEFAULT_PAINT);
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:aload_2         
	//   10   20:getstatic       #26  <Field Paint DEFAULT_PAINT>
	//   11   23:invokevirtual   #155 <Method void Canvas.drawBitmap(Bitmap, Matrix, Paint)>
		clear(((Canvas) (bitmap1)));
	//   12   26:aload_1         
	//   13   27:invokestatic    #159 <Method void clear(Canvas)>
		BITMAP_DRAWABLE_LOCK.unlock();
	//   14   30:getstatic       #120 <Field Lock BITMAP_DRAWABLE_LOCK>
	//   15   33:invokeinterface #162 <Method void Lock.unlock()>
		return;
	//   16   38:return          
		bitmap;
	//   17   39:astore_0        
		BITMAP_DRAWABLE_LOCK.unlock();
	//   18   40:getstatic       #120 <Field Lock BITMAP_DRAWABLE_LOCK>
	//   19   43:invokeinterface #162 <Method void Lock.unlock()>
		throw bitmap;
	//   20   48:aload_0         
	//   21   49:athrow          
	}

	public static Bitmap centerCrop(BitmapPool bitmappool, Bitmap bitmap, int i, int j)
	{
		if(bitmap.getWidth() == i && bitmap.getHeight() == j)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #171 <Method int Bitmap.getWidth()>
	//*   2    4:iload_2         
	//*   3    5:icmpne          18
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #174 <Method int Bitmap.getHeight()>
	//*   6   12:iload_3         
	//*   7   13:icmpne          18
			return bitmap;
	//    8   16:aload_1         
	//    9   17:areturn         
		Matrix matrix = new Matrix();
	//   10   18:new             #176 <Class Matrix>
	//   11   21:dup             
	//   12   22:invokespecial   #177 <Method void Matrix()>
	//   13   25:astore          9
		int k = bitmap.getWidth();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #171 <Method int Bitmap.getWidth()>
	//   16   31:istore          7
		int l = bitmap.getHeight();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #174 <Method int Bitmap.getHeight()>
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
	//   32   56:invokevirtual   #174 <Method int Bitmap.getHeight()>
	//   33   59:i2f             
	//   34   60:fdiv            
	//   35   61:fstore          4
			f1 = ((float)i - (float)bitmap.getWidth() * f) * 0.5F;
	//   36   63:iload_2         
	//   37   64:i2f             
	//   38   65:aload_1         
	//   39   66:invokevirtual   #171 <Method int Bitmap.getWidth()>
	//   40   69:i2f             
	//   41   70:fload           4
	//   42   72:fmul            
	//   43   73:fsub            
	//   44   74:ldc1            #178 <Float 0.5F>
	//   45   76:fmul            
	//   46   77:fstore          5
		} else
	//*  47   79:goto            111
		{
			f = (float)i / (float)bitmap.getWidth();
	//   48   82:iload_2         
	//   49   83:i2f             
	//   50   84:aload_1         
	//   51   85:invokevirtual   #171 <Method int Bitmap.getWidth()>
	//   52   88:i2f             
	//   53   89:fdiv            
	//   54   90:fstore          4
			f2 = ((float)j - (float)bitmap.getHeight() * f) * 0.5F;
	//   55   92:iload_3         
	//   56   93:i2f             
	//   57   94:aload_1         
	//   58   95:invokevirtual   #174 <Method int Bitmap.getHeight()>
	//   59   98:i2f             
	//   60   99:fload           4
	//   61  101:fmul            
	//   62  102:fsub            
	//   63  103:ldc1            #178 <Float 0.5F>
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
	//   71  117:invokevirtual   #182 <Method void Matrix.setScale(float, float)>
		matrix.postTranslate((int)(f1 + 0.5F), (int)(f2 + 0.5F));
	//   72  120:aload           9
	//   73  122:fload           5
	//   74  124:ldc1            #178 <Float 0.5F>
	//   75  126:fadd            
	//   76  127:f2i             
	//   77  128:i2f             
	//   78  129:fload           6
	//   79  131:ldc1            #178 <Float 0.5F>
	//   80  133:fadd            
	//   81  134:f2i             
	//   82  135:i2f             
	//   83  136:invokevirtual   #186 <Method boolean Matrix.postTranslate(float, float)>
	//   84  139:pop             
		bitmappool = ((BitmapPool) (bitmappool.get(i, j, getNonNullConfig(bitmap))));
	//   85  140:aload_0         
	//   86  141:iload_2         
	//   87  142:iload_3         
	//   88  143:aload_1         
	//   89  144:invokestatic    #190 <Method android.graphics.Bitmap$Config getNonNullConfig(Bitmap)>
	//   90  147:invokeinterface #196 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   91  152:astore_0        
		setAlpha(bitmap, ((Bitmap) (bitmappool)));
	//   92  153:aload_1         
	//   93  154:aload_0         
	//   94  155:invokestatic    #200 <Method void setAlpha(Bitmap, Bitmap)>
		applyMatrix(bitmap, ((Bitmap) (bitmappool)), matrix);
	//   95  158:aload_1         
	//   96  159:aload_0         
	//   97  160:aload           9
	//   98  162:invokestatic    #202 <Method void applyMatrix(Bitmap, Bitmap, Matrix)>
		return ((Bitmap) (bitmappool));
	//   99  165:aload_0         
	//  100  166:areturn         
	}

	public static Bitmap centerInside(BitmapPool bitmappool, Bitmap bitmap, int i, int j)
	{
		if(bitmap.getWidth() <= i && bitmap.getHeight() <= j)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #171 <Method int Bitmap.getWidth()>
	//*   2    4:iload_2         
	//*   3    5:icmpgt          35
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #174 <Method int Bitmap.getHeight()>
	//*   6   12:iload_3         
	//*   7   13:icmpgt          35
		{
			if(Log.isLoggable("TransformationUtils", 2))
	//*   8   16:ldc1            #205 <String "TransformationUtils">
	//*   9   18:iconst_2        
	//*  10   19:invokestatic    #211 <Method boolean Log.isLoggable(String, int)>
	//*  11   22:ifeq            33
				Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
	//   12   25:ldc1            #205 <String "TransformationUtils">
	//   13   27:ldc1            #213 <String "requested target size larger or equal to input, returning input">
	//   14   29:invokestatic    #217 <Method int Log.v(String, String)>
	//   15   32:pop             
			return bitmap;
	//   16   33:aload_1         
	//   17   34:areturn         
		}
		if(Log.isLoggable("TransformationUtils", 2))
	//*  18   35:ldc1            #205 <String "TransformationUtils">
	//*  19   37:iconst_2        
	//*  20   38:invokestatic    #211 <Method boolean Log.isLoggable(String, int)>
	//*  21   41:ifeq            52
			Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
	//   22   44:ldc1            #205 <String "TransformationUtils">
	//   23   46:ldc1            #219 <String "requested target size too big for input, fit centering instead">
	//   24   48:invokestatic    #217 <Method int Log.v(String, String)>
	//   25   51:pop             
		return fitCenter(bitmappool, bitmap, i, j);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:iload_2         
	//   29   55:iload_3         
	//   30   56:invokestatic    #222 <Method Bitmap fitCenter(BitmapPool, Bitmap, int, int)>
	//   31   59:areturn         
	}

	private static void clear(Canvas canvas)
	{
		canvas.setBitmap(((Bitmap) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #225 <Method void Canvas.setBitmap(Bitmap)>
	//    3    5:return          
	}

	public static Bitmap fitCenter(BitmapPool bitmappool, Bitmap bitmap, int i, int j)
	{
		if(bitmap.getWidth() == i && bitmap.getHeight() == j)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #171 <Method int Bitmap.getWidth()>
	//*   2    4:iload_2         
	//*   3    5:icmpne          35
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #174 <Method int Bitmap.getHeight()>
	//*   6   12:iload_3         
	//*   7   13:icmpne          35
		{
			if(Log.isLoggable("TransformationUtils", 2))
	//*   8   16:ldc1            #205 <String "TransformationUtils">
	//*   9   18:iconst_2        
	//*  10   19:invokestatic    #211 <Method boolean Log.isLoggable(String, int)>
	//*  11   22:ifeq            33
				Log.v("TransformationUtils", "requested target size matches input, returning input");
	//   12   25:ldc1            #205 <String "TransformationUtils">
	//   13   27:ldc1            #227 <String "requested target size matches input, returning input">
	//   14   29:invokestatic    #217 <Method int Log.v(String, String)>
	//   15   32:pop             
			return bitmap;
	//   16   33:aload_1         
	//   17   34:areturn         
		}
		float f = Math.min((float)i / (float)bitmap.getWidth(), (float)j / (float)bitmap.getHeight());
	//   18   35:iload_2         
	//   19   36:i2f             
	//   20   37:aload_1         
	//   21   38:invokevirtual   #171 <Method int Bitmap.getWidth()>
	//   22   41:i2f             
	//   23   42:fdiv            
	//   24   43:iload_3         
	//   25   44:i2f             
	//   26   45:aload_1         
	//   27   46:invokevirtual   #174 <Method int Bitmap.getHeight()>
	//   28   49:i2f             
	//   29   50:fdiv            
	//   30   51:invokestatic    #233 <Method float Math.min(float, float)>
	//   31   54:fstore          4
		int k = Math.round((float)bitmap.getWidth() * f);
	//   32   56:aload_1         
	//   33   57:invokevirtual   #171 <Method int Bitmap.getWidth()>
	//   34   60:i2f             
	//   35   61:fload           4
	//   36   63:fmul            
	//   37   64:invokestatic    #237 <Method int Math.round(float)>
	//   38   67:istore          5
		int l = Math.round((float)bitmap.getHeight() * f);
	//   39   69:aload_1         
	//   40   70:invokevirtual   #174 <Method int Bitmap.getHeight()>
	//   41   73:i2f             
	//   42   74:fload           4
	//   43   76:fmul            
	//   44   77:invokestatic    #237 <Method int Math.round(float)>
	//   45   80:istore          6
		if(bitmap.getWidth() == k && bitmap.getHeight() == l)
	//*  46   82:aload_1         
	//*  47   83:invokevirtual   #171 <Method int Bitmap.getWidth()>
	//*  48   86:iload           5
	//*  49   88:icmpne          119
	//*  50   91:aload_1         
	//*  51   92:invokevirtual   #174 <Method int Bitmap.getHeight()>
	//*  52   95:iload           6
	//*  53   97:icmpne          119
		{
			if(Log.isLoggable("TransformationUtils", 2))
	//*  54  100:ldc1            #205 <String "TransformationUtils">
	//*  55  102:iconst_2        
	//*  56  103:invokestatic    #211 <Method boolean Log.isLoggable(String, int)>
	//*  57  106:ifeq            117
				Log.v("TransformationUtils", "adjusted target size matches input, returning input");
	//   58  109:ldc1            #205 <String "TransformationUtils">
	//   59  111:ldc1            #239 <String "adjusted target size matches input, returning input">
	//   60  113:invokestatic    #217 <Method int Log.v(String, String)>
	//   61  116:pop             
			return bitmap;
	//   62  117:aload_1         
	//   63  118:areturn         
		}
		bitmappool = ((BitmapPool) (bitmappool.get((int)((float)bitmap.getWidth() * f), (int)((float)bitmap.getHeight() * f), getNonNullConfig(bitmap))));
	//   64  119:aload_0         
	//   65  120:aload_1         
	//   66  121:invokevirtual   #171 <Method int Bitmap.getWidth()>
	//   67  124:i2f             
	//   68  125:fload           4
	//   69  127:fmul            
	//   70  128:f2i             
	//   71  129:aload_1         
	//   72  130:invokevirtual   #174 <Method int Bitmap.getHeight()>
	//   73  133:i2f             
	//   74  134:fload           4
	//   75  136:fmul            
	//   76  137:f2i             
	//   77  138:aload_1         
	//   78  139:invokestatic    #190 <Method android.graphics.Bitmap$Config getNonNullConfig(Bitmap)>
	//   79  142:invokeinterface #196 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   80  147:astore_0        
		setAlpha(bitmap, ((Bitmap) (bitmappool)));
	//   81  148:aload_1         
	//   82  149:aload_0         
	//   83  150:invokestatic    #200 <Method void setAlpha(Bitmap, Bitmap)>
		if(Log.isLoggable("TransformationUtils", 2))
	//*  84  153:ldc1            #205 <String "TransformationUtils">
	//*  85  155:iconst_2        
	//*  86  156:invokestatic    #211 <Method boolean Log.isLoggable(String, int)>
	//*  87  159:ifeq            363
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   88  162:new             #241 <Class StringBuilder>
	//   89  165:dup             
	//   90  166:invokespecial   #242 <Method void StringBuilder()>
	//   91  169:astore          7
			stringbuilder.append("request: ");
	//   92  171:aload           7
	//   93  173:ldc1            #244 <String "request: ">
	//   94  175:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   95  178:pop             
			stringbuilder.append(i);
	//   96  179:aload           7
	//   97  181:iload_2         
	//   98  182:invokevirtual   #251 <Method StringBuilder StringBuilder.append(int)>
	//   99  185:pop             
			stringbuilder.append("x");
	//  100  186:aload           7
	//  101  188:ldc1            #253 <String "x">
	//  102  190:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  103  193:pop             
			stringbuilder.append(j);
	//  104  194:aload           7
	//  105  196:iload_3         
	//  106  197:invokevirtual   #251 <Method StringBuilder StringBuilder.append(int)>
	//  107  200:pop             
			Log.v("TransformationUtils", stringbuilder.toString());
	//  108  201:ldc1            #205 <String "TransformationUtils">
	//  109  203:aload           7
	//  110  205:invokevirtual   #257 <Method String StringBuilder.toString()>
	//  111  208:invokestatic    #217 <Method int Log.v(String, String)>
	//  112  211:pop             
			stringbuilder = new StringBuilder();
	//  113  212:new             #241 <Class StringBuilder>
	//  114  215:dup             
	//  115  216:invokespecial   #242 <Method void StringBuilder()>
	//  116  219:astore          7
			stringbuilder.append("toFit:   ");
	//  117  221:aload           7
	//  118  223:ldc2            #259 <String "toFit:   ">
	//  119  226:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  120  229:pop             
			stringbuilder.append(bitmap.getWidth());
	//  121  230:aload           7
	//  122  232:aload_1         
	//  123  233:invokevirtual   #171 <Method int Bitmap.getWidth()>
	//  124  236:invokevirtual   #251 <Method StringBuilder StringBuilder.append(int)>
	//  125  239:pop             
			stringbuilder.append("x");
	//  126  240:aload           7
	//  127  242:ldc1            #253 <String "x">
	//  128  244:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  129  247:pop             
			stringbuilder.append(bitmap.getHeight());
	//  130  248:aload           7
	//  131  250:aload_1         
	//  132  251:invokevirtual   #174 <Method int Bitmap.getHeight()>
	//  133  254:invokevirtual   #251 <Method StringBuilder StringBuilder.append(int)>
	//  134  257:pop             
			Log.v("TransformationUtils", stringbuilder.toString());
	//  135  258:ldc1            #205 <String "TransformationUtils">
	//  136  260:aload           7
	//  137  262:invokevirtual   #257 <Method String StringBuilder.toString()>
	//  138  265:invokestatic    #217 <Method int Log.v(String, String)>
	//  139  268:pop             
			stringbuilder = new StringBuilder();
	//  140  269:new             #241 <Class StringBuilder>
	//  141  272:dup             
	//  142  273:invokespecial   #242 <Method void StringBuilder()>
	//  143  276:astore          7
			stringbuilder.append("toReuse: ");
	//  144  278:aload           7
	//  145  280:ldc2            #261 <String "toReuse: ">
	//  146  283:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  147  286:pop             
			stringbuilder.append(((Bitmap) (bitmappool)).getWidth());
	//  148  287:aload           7
	//  149  289:aload_0         
	//  150  290:invokevirtual   #171 <Method int Bitmap.getWidth()>
	//  151  293:invokevirtual   #251 <Method StringBuilder StringBuilder.append(int)>
	//  152  296:pop             
			stringbuilder.append("x");
	//  153  297:aload           7
	//  154  299:ldc1            #253 <String "x">
	//  155  301:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  156  304:pop             
			stringbuilder.append(((Bitmap) (bitmappool)).getHeight());
	//  157  305:aload           7
	//  158  307:aload_0         
	//  159  308:invokevirtual   #174 <Method int Bitmap.getHeight()>
	//  160  311:invokevirtual   #251 <Method StringBuilder StringBuilder.append(int)>
	//  161  314:pop             
			Log.v("TransformationUtils", stringbuilder.toString());
	//  162  315:ldc1            #205 <String "TransformationUtils">
	//  163  317:aload           7
	//  164  319:invokevirtual   #257 <Method String StringBuilder.toString()>
	//  165  322:invokestatic    #217 <Method int Log.v(String, String)>
	//  166  325:pop             
			stringbuilder = new StringBuilder();
	//  167  326:new             #241 <Class StringBuilder>
	//  168  329:dup             
	//  169  330:invokespecial   #242 <Method void StringBuilder()>
	//  170  333:astore          7
			stringbuilder.append("minPct:   ");
	//  171  335:aload           7
	//  172  337:ldc2            #263 <String "minPct:   ">
	//  173  340:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  174  343:pop             
			stringbuilder.append(f);
	//  175  344:aload           7
	//  176  346:fload           4
	//  177  348:invokevirtual   #266 <Method StringBuilder StringBuilder.append(float)>
	//  178  351:pop             
			Log.v("TransformationUtils", stringbuilder.toString());
	//  179  352:ldc1            #205 <String "TransformationUtils">
	//  180  354:aload           7
	//  181  356:invokevirtual   #257 <Method String StringBuilder.toString()>
	//  182  359:invokestatic    #217 <Method int Log.v(String, String)>
	//  183  362:pop             
		}
		Matrix matrix = new Matrix();
	//  184  363:new             #176 <Class Matrix>
	//  185  366:dup             
	//  186  367:invokespecial   #177 <Method void Matrix()>
	//  187  370:astore          7
		matrix.setScale(f, f);
	//  188  372:aload           7
	//  189  374:fload           4
	//  190  376:fload           4
	//  191  378:invokevirtual   #182 <Method void Matrix.setScale(float, float)>
		applyMatrix(bitmap, ((Bitmap) (bitmappool)), matrix);
	//  192  381:aload_1         
	//  193  382:aload_0         
	//  194  383:aload           7
	//  195  385:invokestatic    #202 <Method void applyMatrix(Bitmap, Bitmap, Matrix)>
		return ((Bitmap) (bitmappool));
	//  196  388:aload_0         
	//  197  389:areturn         
	}

	public static Lock getBitmapDrawableLock()
	{
		return BITMAP_DRAWABLE_LOCK;
	//    0    0:getstatic       #120 <Field Lock BITMAP_DRAWABLE_LOCK>
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
	//*   1    1:invokevirtual   #274 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//*   2    4:ifnull          12
			return bitmap.getConfig();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #274 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//    5   11:areturn         
		else
			return android.graphics.Bitmap.Config.ARGB_8888;
	//    6   12:getstatic       #280 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
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
	//    4   46:ldc2            #285 <Float -90F>
	//    5   49:invokevirtual   #289 <Method void Matrix.setRotate(float)>
			return;
	//    6   52:return          

		case 7: // '\007'
			matrix.setRotate(-90F);
	//    7   53:aload_1         
	//    8   54:ldc2            #285 <Float -90F>
	//    9   57:invokevirtual   #289 <Method void Matrix.setRotate(float)>
			matrix.postScale(-1F, 1.0F);
	//   10   60:aload_1         
	//   11   61:ldc2            #290 <Float -1F>
	//   12   64:fconst_1        
	//   13   65:invokevirtual   #293 <Method boolean Matrix.postScale(float, float)>
	//   14   68:pop             
			return;
	//   15   69:return          

		case 6: // '\006'
			matrix.setRotate(90F);
	//   16   70:aload_1         
	//   17   71:ldc2            #294 <Float 90F>
	//   18   74:invokevirtual   #289 <Method void Matrix.setRotate(float)>
			return;
	//   19   77:return          

		case 5: // '\005'
			matrix.setRotate(90F);
	//   20   78:aload_1         
	//   21   79:ldc2            #294 <Float 90F>
	//   22   82:invokevirtual   #289 <Method void Matrix.setRotate(float)>
			matrix.postScale(-1F, 1.0F);
	//   23   85:aload_1         
	//   24   86:ldc2            #290 <Float -1F>
	//   25   89:fconst_1        
	//   26   90:invokevirtual   #293 <Method boolean Matrix.postScale(float, float)>
	//   27   93:pop             
			return;
	//   28   94:return          

		case 4: // '\004'
			matrix.setRotate(180F);
	//   29   95:aload_1         
	//   30   96:ldc2            #295 <Float 180F>
	//   31   99:invokevirtual   #289 <Method void Matrix.setRotate(float)>
			matrix.postScale(-1F, 1.0F);
	//   32  102:aload_1         
	//   33  103:ldc2            #290 <Float -1F>
	//   34  106:fconst_1        
	//   35  107:invokevirtual   #293 <Method boolean Matrix.postScale(float, float)>
	//   36  110:pop             
			return;
	//   37  111:return          

		case 3: // '\003'
			matrix.setRotate(180F);
	//   38  112:aload_1         
	//   39  113:ldc2            #295 <Float 180F>
	//   40  116:invokevirtual   #289 <Method void Matrix.setRotate(float)>
			return;
	//   41  119:return          

		case 2: // '\002'
			matrix.setScale(-1F, 1.0F);
	//   42  120:aload_1         
	//   43  121:ldc2            #290 <Float -1F>
	//   44  124:fconst_1        
	//   45  125:invokevirtual   #182 <Method void Matrix.setScale(float, float)>
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

	public static Bitmap rotateImageExif(BitmapPool bitmappool, Bitmap bitmap, int i)
	{
		if(!isExifOrientationRequired(i))
	//*   0    0:iload_2         
	//*   1    1:invokestatic    #301 <Method boolean isExifOrientationRequired(int)>
	//*   2    4:ifne            9
		{
			return bitmap;
	//    3    7:aload_1         
	//    4    8:areturn         
		} else
		{
			Matrix matrix = new Matrix();
	//    5    9:new             #176 <Class Matrix>
	//    6   12:dup             
	//    7   13:invokespecial   #177 <Method void Matrix()>
	//    8   16:astore_3        
			initializeMatrixForRotation(i, matrix);
	//    9   17:iload_2         
	//   10   18:aload_3         
	//   11   19:invokestatic    #303 <Method void initializeMatrixForRotation(int, Matrix)>
			RectF rectf = new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight());
	//   12   22:new             #305 <Class RectF>
	//   13   25:dup             
	//   14   26:fconst_0        
	//   15   27:fconst_0        
	//   16   28:aload_1         
	//   17   29:invokevirtual   #171 <Method int Bitmap.getWidth()>
	//   18   32:i2f             
	//   19   33:aload_1         
	//   20   34:invokevirtual   #174 <Method int Bitmap.getHeight()>
	//   21   37:i2f             
	//   22   38:invokespecial   #308 <Method void RectF(float, float, float, float)>
	//   23   41:astore          4
			matrix.mapRect(rectf);
	//   24   43:aload_3         
	//   25   44:aload           4
	//   26   46:invokevirtual   #312 <Method boolean Matrix.mapRect(RectF)>
	//   27   49:pop             
			bitmappool = ((BitmapPool) (bitmappool.get(Math.round(rectf.width()), Math.round(rectf.height()), getNonNullConfig(bitmap))));
	//   28   50:aload_0         
	//   29   51:aload           4
	//   30   53:invokevirtual   #316 <Method float RectF.width()>
	//   31   56:invokestatic    #237 <Method int Math.round(float)>
	//   32   59:aload           4
	//   33   61:invokevirtual   #319 <Method float RectF.height()>
	//   34   64:invokestatic    #237 <Method int Math.round(float)>
	//   35   67:aload_1         
	//   36   68:invokestatic    #190 <Method android.graphics.Bitmap$Config getNonNullConfig(Bitmap)>
	//   37   71:invokeinterface #196 <Method Bitmap BitmapPool.get(int, int, android.graphics.Bitmap$Config)>
	//   38   76:astore_0        
			matrix.postTranslate(-rectf.left, -rectf.top);
	//   39   77:aload_3         
	//   40   78:aload           4
	//   41   80:getfield        #323 <Field float RectF.left>
	//   42   83:fneg            
	//   43   84:aload           4
	//   44   86:getfield        #326 <Field float RectF.top>
	//   45   89:fneg            
	//   46   90:invokevirtual   #186 <Method boolean Matrix.postTranslate(float, float)>
	//   47   93:pop             
			((Bitmap) (bitmappool)).setHasAlpha(bitmap.hasAlpha());
	//   48   94:aload_0         
	//   49   95:aload_1         
	//   50   96:invokevirtual   #330 <Method boolean Bitmap.hasAlpha()>
	//   51   99:invokevirtual   #334 <Method void Bitmap.setHasAlpha(boolean)>
			applyMatrix(bitmap, ((Bitmap) (bitmappool)), matrix);
	//   52  102:aload_1         
	//   53  103:aload_0         
	//   54  104:aload_3         
	//   55  105:invokestatic    #202 <Method void applyMatrix(Bitmap, Bitmap, Matrix)>
			return ((Bitmap) (bitmappool));
	//   56  108:aload_0         
	//   57  109:areturn         
		}
	}

	public static void setAlpha(Bitmap bitmap, Bitmap bitmap1)
	{
		bitmap1.setHasAlpha(bitmap.hasAlpha());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #330 <Method boolean Bitmap.hasAlpha()>
	//    3    5:invokevirtual   #334 <Method void Bitmap.setHasAlpha(boolean)>
	//    4    8:return          
	}

	private static final Lock BITMAP_DRAWABLE_LOCK;
	private static final Paint CIRCLE_CROP_BITMAP_PAINT;
	private static final Paint CIRCLE_CROP_SHAPE_PAINT = new Paint(7);
	private static final Paint DEFAULT_PAINT = new Paint(6);
	private static final Set MODELS_REQUIRING_BITMAP_LOCK;

	static 
	{
	//    0    0:new             #20  <Class Paint>
	//    1    3:dup             
	//    2    4:bipush          6
	//    3    6:invokespecial   #24  <Method void Paint(int)>
	//    4    9:putstatic       #26  <Field Paint DEFAULT_PAINT>
	//    5   12:new             #20  <Class Paint>
	//    6   15:dup             
	//    7   16:bipush          7
	//    8   18:invokespecial   #24  <Method void Paint(int)>
	//    9   21:putstatic       #28  <Field Paint CIRCLE_CROP_SHAPE_PAINT>
		MODELS_REQUIRING_BITMAP_LOCK = ((Set) (new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
			"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", 
			"XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", 
			"XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"
		}))))))));
	//   10   24:new             #30  <Class HashSet>
	//   11   27:dup             
	//   12   28:bipush          29
	//   13   30:anewarray       String[]
	//   14   33:dup             
	//   15   34:iconst_0        
	//   16   35:ldc1            #34  <String "XT1085">
	//   17   37:aastore         
	//   18   38:dup             
	//   19   39:iconst_1        
	//   20   40:ldc1            #36  <String "XT1092">
	//   21   42:aastore         
	//   22   43:dup             
	//   23   44:iconst_2        
	//   24   45:ldc1            #38  <String "XT1093">
	//   25   47:aastore         
	//   26   48:dup             
	//   27   49:iconst_3        
	//   28   50:ldc1            #40  <String "XT1094">
	//   29   52:aastore         
	//   30   53:dup             
	//   31   54:iconst_4        
	//   32   55:ldc1            #42  <String "XT1095">
	//   33   57:aastore         
	//   34   58:dup             
	//   35   59:iconst_5        
	//   36   60:ldc1            #44  <String "XT1096">
	//   37   62:aastore         
	//   38   63:dup             
	//   39   64:bipush          6
	//   40   66:ldc1            #46  <String "XT1097">
	//   41   68:aastore         
	//   42   69:dup             
	//   43   70:bipush          7
	//   44   72:ldc1            #48  <String "XT1098">
	//   45   74:aastore         
	//   46   75:dup             
	//   47   76:bipush          8
	//   48   78:ldc1            #50  <String "XT1031">
	//   49   80:aastore         
	//   50   81:dup             
	//   51   82:bipush          9
	//   52   84:ldc1            #52  <String "XT1028">
	//   53   86:aastore         
	//   54   87:dup             
	//   55   88:bipush          10
	//   56   90:ldc1            #54  <String "XT937C">
	//   57   92:aastore         
	//   58   93:dup             
	//   59   94:bipush          11
	//   60   96:ldc1            #56  <String "XT1032">
	//   61   98:aastore         
	//   62   99:dup             
	//   63  100:bipush          12
	//   64  102:ldc1            #58  <String "XT1008">
	//   65  104:aastore         
	//   66  105:dup             
	//   67  106:bipush          13
	//   68  108:ldc1            #60  <String "XT1033">
	//   69  110:aastore         
	//   70  111:dup             
	//   71  112:bipush          14
	//   72  114:ldc1            #62  <String "XT1035">
	//   73  116:aastore         
	//   74  117:dup             
	//   75  118:bipush          15
	//   76  120:ldc1            #64  <String "XT1034">
	//   77  122:aastore         
	//   78  123:dup             
	//   79  124:bipush          16
	//   80  126:ldc1            #66  <String "XT939G">
	//   81  128:aastore         
	//   82  129:dup             
	//   83  130:bipush          17
	//   84  132:ldc1            #68  <String "XT1039">
	//   85  134:aastore         
	//   86  135:dup             
	//   87  136:bipush          18
	//   88  138:ldc1            #70  <String "XT1040">
	//   89  140:aastore         
	//   90  141:dup             
	//   91  142:bipush          19
	//   92  144:ldc1            #72  <String "XT1042">
	//   93  146:aastore         
	//   94  147:dup             
	//   95  148:bipush          20
	//   96  150:ldc1            #74  <String "XT1045">
	//   97  152:aastore         
	//   98  153:dup             
	//   99  154:bipush          21
	//  100  156:ldc1            #76  <String "XT1063">
	//  101  158:aastore         
	//  102  159:dup             
	//  103  160:bipush          22
	//  104  162:ldc1            #78  <String "XT1064">
	//  105  164:aastore         
	//  106  165:dup             
	//  107  166:bipush          23
	//  108  168:ldc1            #80  <String "XT1068">
	//  109  170:aastore         
	//  110  171:dup             
	//  111  172:bipush          24
	//  112  174:ldc1            #82  <String "XT1069">
	//  113  176:aastore         
	//  114  177:dup             
	//  115  178:bipush          25
	//  116  180:ldc1            #84  <String "XT1072">
	//  117  182:aastore         
	//  118  183:dup             
	//  119  184:bipush          26
	//  120  186:ldc1            #86  <String "XT1077">
	//  121  188:aastore         
	//  122  189:dup             
	//  123  190:bipush          27
	//  124  192:ldc1            #88  <String "XT1078">
	//  125  194:aastore         
	//  126  195:dup             
	//  127  196:bipush          28
	//  128  198:ldc1            #90  <String "XT1079">
	//  129  200:aastore         
	//  130  201:invokestatic    #96  <Method java.util.List Arrays.asList(Object[])>
	//  131  204:invokespecial   #99  <Method void HashSet(java.util.Collection)>
	//  132  207:putstatic       #101 <Field Set MODELS_REQUIRING_BITMAP_LOCK>
		Object obj;
		if(MODELS_REQUIRING_BITMAP_LOCK.contains(((Object) (Build.MODEL))))
	//* 133  210:getstatic       #101 <Field Set MODELS_REQUIRING_BITMAP_LOCK>
	//* 134  213:getstatic       #107 <Field String Build.MODEL>
	//* 135  216:invokeinterface #113 <Method boolean Set.contains(Object)>
	//* 136  221:ifeq            235
			obj = ((Object) (new ReentrantLock()));
	//  137  224:new             #115 <Class ReentrantLock>
	//  138  227:dup             
	//  139  228:invokespecial   #117 <Method void ReentrantLock()>
	//  140  231:astore_0        
		else
	//* 141  232:goto            243
			obj = ((Object) (new NoLock()));
	//  142  235:new             #6   <Class TransformationUtils$NoLock>
	//  143  238:dup             
	//  144  239:invokespecial   #118 <Method void TransformationUtils$NoLock()>
	//  145  242:astore_0        
		BITMAP_DRAWABLE_LOCK = ((Lock) (obj));
	//  146  243:aload_0         
	//  147  244:putstatic       #120 <Field Lock BITMAP_DRAWABLE_LOCK>
		CIRCLE_CROP_BITMAP_PAINT = new Paint(7);
	//  148  247:new             #20  <Class Paint>
	//  149  250:dup             
	//  150  251:bipush          7
	//  151  253:invokespecial   #24  <Method void Paint(int)>
	//  152  256:putstatic       #122 <Field Paint CIRCLE_CROP_BITMAP_PAINT>
		CIRCLE_CROP_BITMAP_PAINT.setXfermode(((android.graphics.Xfermode) (new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN))));
	//  153  259:getstatic       #122 <Field Paint CIRCLE_CROP_BITMAP_PAINT>
	//  154  262:new             #124 <Class PorterDuffXfermode>
	//  155  265:dup             
	//  156  266:getstatic       #130 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//  157  269:invokespecial   #133 <Method void PorterDuffXfermode(android.graphics.PorterDuff$Mode)>
	//  158  272:invokevirtual   #137 <Method android.graphics.Xfermode Paint.setXfermode(android.graphics.Xfermode)>
	//  159  275:pop             
	//* 160  276:return          
	}
}
