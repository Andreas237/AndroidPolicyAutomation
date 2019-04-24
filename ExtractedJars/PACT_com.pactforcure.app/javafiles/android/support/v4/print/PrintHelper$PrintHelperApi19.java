// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.*;
import android.net.Uri;
import android.os.*;
import android.print.*;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import java.io.*;

// Referenced classes of package android.support.v4.print:
//			PrintHelper

private static class PrintHelper$PrintHelperApi19
	implements nImpl
{

	private Bitmap convertBitmapForColorMode(Bitmap bitmap, int i)
	{
		if(i != 1)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:icmpeq          7
		{
			return bitmap;
	//    3    5:aload_1         
	//    4    6:areturn         
		} else
		{
			Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
	//    5    7:aload_1         
	//    6    8:invokevirtual   #100 <Method int Bitmap.getWidth()>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #103 <Method int Bitmap.getHeight()>
	//    9   15:getstatic       #109 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   10   18:invokestatic    #113 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   11   21:astore_3        
			Canvas canvas = new Canvas(bitmap1);
	//   12   22:new             #115 <Class Canvas>
	//   13   25:dup             
	//   14   26:aload_3         
	//   15   27:invokespecial   #118 <Method void Canvas(Bitmap)>
	//   16   30:astore          4
			Paint paint = new Paint();
	//   17   32:new             #120 <Class Paint>
	//   18   35:dup             
	//   19   36:invokespecial   #121 <Method void Paint()>
	//   20   39:astore          5
			ColorMatrix colormatrix = new ColorMatrix();
	//   21   41:new             #123 <Class ColorMatrix>
	//   22   44:dup             
	//   23   45:invokespecial   #124 <Method void ColorMatrix()>
	//   24   48:astore          6
			colormatrix.setSaturation(0.0F);
	//   25   50:aload           6
	//   26   52:fconst_0        
	//   27   53:invokevirtual   #128 <Method void ColorMatrix.setSaturation(float)>
			paint.setColorFilter(((android.graphics.ColorFilter) (new ColorMatrixColorFilter(colormatrix))));
	//   28   56:aload           5
	//   29   58:new             #130 <Class ColorMatrixColorFilter>
	//   30   61:dup             
	//   31   62:aload           6
	//   32   64:invokespecial   #133 <Method void ColorMatrixColorFilter(ColorMatrix)>
	//   33   67:invokevirtual   #137 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   34   70:pop             
			canvas.drawBitmap(bitmap, 0.0F, 0.0F, paint);
	//   35   71:aload           4
	//   36   73:aload_1         
	//   37   74:fconst_0        
	//   38   75:fconst_0        
	//   39   76:aload           5
	//   40   78:invokevirtual   #141 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
			canvas.setBitmap(((Bitmap) (null)));
	//   41   81:aload           4
	//   42   83:aconst_null     
	//   43   84:invokevirtual   #144 <Method void Canvas.setBitmap(Bitmap)>
			return bitmap1;
	//   44   87:aload_3         
	//   45   88:areturn         
		}
	}

	private Matrix getMatrix(int i, int j, RectF rectf, int k)
	{
		Matrix matrix = new Matrix();
	//    0    0:new             #146 <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #147 <Method void Matrix()>
	//    3    7:astore          6
		float f = rectf.width() / (float)i;
	//    4    9:aload_3         
	//    5   10:invokevirtual   #153 <Method float RectF.width()>
	//    6   13:iload_1         
	//    7   14:i2f             
	//    8   15:fdiv            
	//    9   16:fstore          5
		if(k == 2)
	//*  10   18:iload           4
	//*  11   20:iconst_2        
	//*  12   21:icmpne          81
			f = Math.max(f, rectf.height() / (float)j);
	//   13   24:fload           5
	//   14   26:aload_3         
	//   15   27:invokevirtual   #156 <Method float RectF.height()>
	//   16   30:iload_2         
	//   17   31:i2f             
	//   18   32:fdiv            
	//   19   33:invokestatic    #162 <Method float Math.max(float, float)>
	//   20   36:fstore          5
		else
	//*  21   38:aload           6
	//*  22   40:fload           5
	//*  23   42:fload           5
	//*  24   44:invokevirtual   #166 <Method boolean Matrix.postScale(float, float)>
	//*  25   47:pop             
	//*  26   48:aload           6
	//*  27   50:aload_3         
	//*  28   51:invokevirtual   #153 <Method float RectF.width()>
	//*  29   54:iload_1         
	//*  30   55:i2f             
	//*  31   56:fload           5
	//*  32   58:fmul            
	//*  33   59:fsub            
	//*  34   60:fconst_2        
	//*  35   61:fdiv            
	//*  36   62:aload_3         
	//*  37   63:invokevirtual   #156 <Method float RectF.height()>
	//*  38   66:iload_2         
	//*  39   67:i2f             
	//*  40   68:fload           5
	//*  41   70:fmul            
	//*  42   71:fsub            
	//*  43   72:fconst_2        
	//*  44   73:fdiv            
	//*  45   74:invokevirtual   #169 <Method boolean Matrix.postTranslate(float, float)>
	//*  46   77:pop             
	//*  47   78:aload           6
	//*  48   80:areturn         
			f = Math.min(f, rectf.height() / (float)j);
	//   49   81:fload           5
	//   50   83:aload_3         
	//   51   84:invokevirtual   #156 <Method float RectF.height()>
	//   52   87:iload_2         
	//   53   88:i2f             
	//   54   89:fdiv            
	//   55   90:invokestatic    #172 <Method float Math.min(float, float)>
	//   56   93:fstore          5
		matrix.postScale(f, f);
		matrix.postTranslate((rectf.width() - (float)i * f) / 2.0F, (rectf.height() - (float)j * f) / 2.0F);
		return matrix;
	//*  57   95:goto            38
	}

	private static boolean isPortrait(Bitmap bitmap)
	{
		return bitmap.getWidth() <= bitmap.getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method int Bitmap.getWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #103 <Method int Bitmap.getHeight()>
	//    4    8:icmpgt          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private Bitmap loadBitmap(Uri uri, android.graphics.BitmapFactory.Options options)
		throws FileNotFoundException
	{
		Uri uri1;
		if(uri == null || mContext == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:getfield        #59  <Field Context mContext>
	//*   4    8:ifnonnull       21
			throw new IllegalArgumentException("bad argument to loadBitmap");
	//    5   11:new             #178 <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc1            #180 <String "bad argument to loadBitmap">
	//    8   17:invokespecial   #183 <Method void IllegalArgumentException(String)>
	//    9   20:athrow          
		uri1 = null;
	//   10   21:aconst_null     
	//   11   22:astore_3        
		uri = ((Uri) (mContext.getContentResolver().openInputStream(uri)));
	//   12   23:aload_0         
	//   13   24:getfield        #59  <Field Context mContext>
	//   14   27:invokevirtual   #189 <Method ContentResolver Context.getContentResolver()>
	//   15   30:aload_1         
	//   16   31:invokevirtual   #195 <Method InputStream ContentResolver.openInputStream(Uri)>
	//   17   34:astore_1        
		uri1 = uri;
	//   18   35:aload_1         
	//   19   36:astore_3        
		options = ((android.graphics.BitmapFactory.Options) (BitmapFactory.decodeStream(((InputStream) (uri)), ((android.graphics.Rect) (null)), options)));
	//   20   37:aload_1         
	//   21   38:aconst_null     
	//   22   39:aload_2         
	//   23   40:invokestatic    #201 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   24   43:astore_2        
		if(uri != null)
	//*  25   44:aload_1         
	//*  26   45:ifnull          52
			try
			{
				((InputStream) (uri)).close();
	//   27   48:aload_1         
	//   28   49:invokevirtual   #206 <Method void InputStream.close()>
			}
	//*  29   52:aload_2         
	//*  30   53:areturn         
			// Misplaced declaration of an exception variable
			catch(Uri uri)
	//*  31   54:astore_1        
			{
				Log.w("PrintHelperApi19", "close fail ", ((Throwable) (uri)));
	//   32   55:ldc1            #25  <String "PrintHelperApi19">
	//   33   57:ldc1            #208 <String "close fail ">
	//   34   59:aload_1         
	//   35   60:invokestatic    #214 <Method int Log.w(String, String, Throwable)>
	//   36   63:pop             
				return ((Bitmap) (options));
	//   37   64:aload_2         
	//   38   65:areturn         
			}
		return ((Bitmap) (options));
		uri;
	//   39   66:astore_1        
		if(uri1 != null)
	//*  40   67:aload_3         
	//*  41   68:ifnull          75
			try
			{
				((InputStream) (uri1)).close();
	//   42   71:aload_3         
	//   43   72:invokevirtual   #206 <Method void InputStream.close()>
			}
	//*  44   75:aload_1         
	//*  45   76:athrow          
			// Misplaced declaration of an exception variable
			catch(android.graphics.BitmapFactory.Options options)
	//*  46   77:astore_2        
			{
				Log.w("PrintHelperApi19", "close fail ", ((Throwable) (options)));
	//   47   78:ldc1            #25  <String "PrintHelperApi19">
	//   48   80:ldc1            #208 <String "close fail ">
	//   49   82:aload_2         
	//   50   83:invokestatic    #214 <Method int Log.w(String, String, Throwable)>
	//   51   86:pop             
			}
		throw uri;
	//*  52   87:goto            75
	}

	private Bitmap loadConstrainedBitmap(Uri uri)
		throws FileNotFoundException
	{
		int k;
		int l;
		if(uri == null || mContext == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:getfield        #59  <Field Context mContext>
	//*   4    8:ifnonnull       21
			throw new IllegalArgumentException("bad argument to getScaledBitmap");
	//    5   11:new             #178 <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc1            #216 <String "bad argument to getScaledBitmap">
	//    8   17:invokespecial   #183 <Method void IllegalArgumentException(String)>
	//    9   20:athrow          
		android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
	//   10   21:new             #218 <Class android.graphics.BitmapFactory$Options>
	//   11   24:dup             
	//   12   25:invokespecial   #219 <Method void android.graphics.BitmapFactory$Options()>
	//   13   28:astore          6
		options.inJustDecodeBounds = true;
	//   14   30:aload           6
	//   15   32:iconst_1        
	//   16   33:putfield        #222 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		loadBitmap(uri, options);
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:aload           6
	//   20   40:invokespecial   #224 <Method Bitmap loadBitmap(Uri, android.graphics.BitmapFactory$Options)>
	//   21   43:pop             
		k = options.outWidth;
	//   22   44:aload           6
	//   23   46:getfield        #227 <Field int android.graphics.BitmapFactory$Options.outWidth>
	//   24   49:istore          4
		l = options.outHeight;
	//   25   51:aload           6
	//   26   53:getfield        #230 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//   27   56:istore          5
		if(k > 0 && l > 0) goto _L2; else goto _L1
	//   28   58:iload           4
	//   29   60:ifle            68
	//   30   63:iload           5
	//   31   65:ifgt            70
_L1:
		return null;
	//   32   68:aconst_null     
	//   33   69:areturn         
_L2:
		int i;
		int j = Math.max(k, l);
	//   34   70:iload           4
	//   35   72:iload           5
	//   36   74:invokestatic    #233 <Method int Math.max(int, int)>
	//   37   77:istore_3        
		for(i = 1; j > 3500; i <<= 1)
	//*  38   78:iconst_1        
	//*  39   79:istore_2        
	//*  40   80:iload_3         
	//*  41   81:sipush          3500
	//*  42   84:icmple          98
			j >>>= 1;
	//   43   87:iload_3         
	//   44   88:iconst_1        
	//   45   89:iushr           
	//   46   90:istore_3        

	//   47   91:iload_2         
	//   48   92:iconst_1        
	//   49   93:ishl            
	//   50   94:istore_2        
	//*  51   95:goto            80
		if(i <= 0 || Math.min(k, l) / i <= 0) goto _L1; else goto _L3
	//   52   98:iload_2         
	//   53   99:ifle            68
	//   54  102:iload           4
	//   55  104:iload           5
	//   56  106:invokestatic    #235 <Method int Math.min(int, int)>
	//   57  109:iload_2         
	//   58  110:idiv            
	//   59  111:ifle            68
_L3:
		android.graphics.BitmapFactory.Options options1;
		synchronized(mLock)
	//*  60  114:aload_0         
	//*  61  115:getfield        #49  <Field Object mLock>
	//*  62  118:astore          6
	//*  63  120:aload           6
	//*  64  122:monitorenter    
		{
			mDecodeOptions = new android.graphics.BitmapFactory.Options();
	//   65  123:aload_0         
	//   66  124:new             #218 <Class android.graphics.BitmapFactory$Options>
	//   67  127:dup             
	//   68  128:invokespecial   #219 <Method void android.graphics.BitmapFactory$Options()>
	//   69  131:putfield        #47  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
			mDecodeOptions.inMutable = true;
	//   70  134:aload_0         
	//   71  135:getfield        #47  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
	//   72  138:iconst_1        
	//   73  139:putfield        #238 <Field boolean android.graphics.BitmapFactory$Options.inMutable>
			mDecodeOptions.inSampleSize = i;
	//   74  142:aload_0         
	//   75  143:getfield        #47  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
	//   76  146:iload_2         
	//   77  147:putfield        #241 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
			options1 = mDecodeOptions;
	//   78  150:aload_0         
	//   79  151:getfield        #47  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
	//   80  154:astore          7
		}
	//   81  156:aload           6
	//   82  158:monitorexit     
		obj = ((Object) (loadBitmap(uri, options1)));
	//   83  159:aload_0         
	//   84  160:aload_1         
	//   85  161:aload           7
	//   86  163:invokespecial   #224 <Method Bitmap loadBitmap(Uri, android.graphics.BitmapFactory$Options)>
	//   87  166:astore          6
		synchronized(mLock)
	//*  88  168:aload_0         
	//*  89  169:getfield        #49  <Field Object mLock>
	//*  90  172:astore_1        
	//*  91  173:aload_1         
	//*  92  174:monitorenter    
		{
			mDecodeOptions = null;
	//   93  175:aload_0         
	//   94  176:aconst_null     
	//   95  177:putfield        #47  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
		}
	//   96  180:aload_1         
	//   97  181:monitorexit     
		return ((Bitmap) (obj));
	//   98  182:aload           6
	//   99  184:areturn         
		obj;
	//  100  185:astore          6
		uri;
	//  101  187:aload_1         
		JVM INSTR monitorexit ;
	//  102  188:monitorexit     
		throw obj;
	//  103  189:aload           6
	//  104  191:athrow          
		uri;
	//  105  192:astore_1        
		obj;
	//  106  193:aload           6
		JVM INSTR monitorexit ;
	//  107  195:monitorexit     
		throw uri;
	//  108  196:aload_1         
	//  109  197:athrow          
		Exception exception;
		exception;
	//  110  198:astore          6
		synchronized(mLock)
	//* 111  200:aload_0         
	//* 112  201:getfield        #49  <Field Object mLock>
	//* 113  204:astore_1        
	//* 114  205:aload_1         
	//* 115  206:monitorenter    
		{
			mDecodeOptions = null;
	//  116  207:aload_0         
	//  117  208:aconst_null     
	//  118  209:putfield        #47  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
		}
	//  119  212:aload_1         
	//  120  213:monitorexit     
		throw exception;
	//  121  214:aload           6
	//  122  216:athrow          
		exception1;
	//  123  217:astore          6
		uri;
	//  124  219:aload_1         
		JVM INSTR monitorexit ;
	//  125  220:monitorexit     
		throw exception1;
	//  126  221:aload           6
	//  127  223:athrow          
	}

	private void writeBitmap(final PrintAttributes attributes, final int fittingMode, final Bitmap bitmap, final ParcelFileDescriptor fileDescriptor, final CancellationSignal cancellationSignal, final android.print.ultCallback writeResultCallback)
	{
		final PrintAttributes pdfAttributes;
		if(mIsMinMarginsHandlingCorrect)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field boolean mIsMinMarginsHandlingCorrect>
	//*   2    4:ifeq            38
			pdfAttributes = attributes;
	//    3    7:aload_1         
	//    4    8:astore          7
		else
	//*   5   10:new             #13  <Class PrintHelper$PrintHelperApi19$2>
	//*   6   13:dup             
	//*   7   14:aload_0         
	//*   8   15:aload           5
	//*   9   17:aload           7
	//*  10   19:aload_3         
	//*  11   20:aload_1         
	//*  12   21:iload_2         
	//*  13   22:aload           4
	//*  14   24:aload           6
	//*  15   26:invokespecial   #244 <Method void PrintHelper$PrintHelperApi19$2(PrintHelper$PrintHelperApi19, CancellationSignal, PrintAttributes, Bitmap, PrintAttributes, int, ParcelFileDescriptor, android.print.PrintDocumentAdapter$WriteResultCallback)>
	//*  16   29:iconst_0        
	//*  17   30:anewarray       Void[]
	//*  18   33:invokevirtual   #250 <Method AsyncTask PrintHelper$PrintHelperApi19$2.execute(Object[])>
	//*  19   36:pop             
	//*  20   37:return          
			pdfAttributes = copyAttributes(attributes).setMinMargins(new android.print.PrintAttributes.Margins(0, 0, 0, 0)).build();
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #254 <Method android.print.PrintAttributes$Builder copyAttributes(PrintAttributes)>
	//   24   43:new             #256 <Class android.print.PrintAttributes$Margins>
	//   25   46:dup             
	//   26   47:iconst_0        
	//   27   48:iconst_0        
	//   28   49:iconst_0        
	//   29   50:iconst_0        
	//   30   51:invokespecial   #259 <Method void android.print.PrintAttributes$Margins(int, int, int, int)>
	//   31   54:invokevirtual   #265 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMinMargins(android.print.PrintAttributes$Margins)>
	//   32   57:invokevirtual   #269 <Method PrintAttributes android.print.PrintAttributes$Builder.build()>
	//   33   60:astore          7
		((_cls2) (new AsyncTask() {

			protected volatile Object doInBackground(Object aobj[])
			{
				return ((Object) (doInBackground((Void[])aobj)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #54  <Class Void[]>
			//    3    5:invokevirtual   #57  <Method Throwable doInBackground(Void[])>
			//    4    8:areturn         
			}

			protected transient Throwable doInBackground(Void avoid[])
			{
				Bitmap bitmap1;
				Object obj;
				android.graphics.pdf.PdfDocument.Page page;
				Object obj1;
				if(cancellationSignal.isCanceled())
			//*   0    0:aload_0         
			//*   1    1:getfield        #34  <Field CancellationSignal val$cancellationSignal>
			//*   2    4:invokevirtual   #67  <Method boolean CancellationSignal.isCanceled()>
			//*   3    7:ifeq            12
					return null;
			//    4   10:aconst_null     
			//    5   11:areturn         
				boolean flag;
				try
				{
					obj = ((Object) (new PrintedPdfDocument(mContext, pdfAttributes)));
			//    6   12:new             #69  <Class PrintedPdfDocument>
			//    7   15:dup             
			//    8   16:aload_0         
			//    9   17:getfield        #32  <Field PrintHelper$PrintHelperApi19 this$0>
			//   10   20:getfield        #73  <Field Context PrintHelper$PrintHelperApi19.mContext>
			//   11   23:aload_0         
			//   12   24:getfield        #36  <Field PrintAttributes val$pdfAttributes>
			//   13   27:invokespecial   #76  <Method void PrintedPdfDocument(Context, PrintAttributes)>
			//   14   30:astore          4
					bitmap1 = convertBitmapForColorMode(bitmap, pdfAttributes.getColorMode());
			//   15   32:aload_0         
			//   16   33:getfield        #32  <Field PrintHelper$PrintHelperApi19 this$0>
			//   17   36:aload_0         
			//   18   37:getfield        #38  <Field Bitmap val$bitmap>
			//   19   40:aload_0         
			//   20   41:getfield        #36  <Field PrintAttributes val$pdfAttributes>
			//   21   44:invokevirtual   #82  <Method int PrintAttributes.getColorMode()>
			//   22   47:invokestatic    #86  <Method Bitmap PrintHelper$PrintHelperApi19.access$100(PrintHelper$PrintHelperApi19, Bitmap, int)>
			//   23   50:astore_3        
					flag = cancellationSignal.isCanceled();
			//   24   51:aload_0         
			//   25   52:getfield        #34  <Field CancellationSignal val$cancellationSignal>
			//   26   55:invokevirtual   #67  <Method boolean CancellationSignal.isCanceled()>
			//   27   58:istore_2        
				}
			//*  28   59:iload_2         
			//*  29   60:ifne            389
			//*  30   63:aload           4
			//*  31   65:iconst_1        
			//*  32   66:invokevirtual   #90  <Method android.graphics.pdf.PdfDocument$Page PrintedPdfDocument.startPage(int)>
			//*  33   69:astore          5
			//*  34   71:aload_0         
			//*  35   72:getfield        #32  <Field PrintHelper$PrintHelperApi19 this$0>
			//*  36   75:getfield        #94  <Field boolean PrintHelper$PrintHelperApi19.mIsMinMarginsHandlingCorrect>
			//*  37   78:ifeq            198
			//*  38   81:new             #96  <Class RectF>
			//*  39   84:dup             
			//*  40   85:aload           5
			//*  41   87:invokevirtual   #102 <Method android.graphics.pdf.PdfDocument$PageInfo android.graphics.pdf.PdfDocument$Page.getInfo()>
			//*  42   90:invokevirtual   #108 <Method android.graphics.Rect android.graphics.pdf.PdfDocument$PageInfo.getContentRect()>
			//*  43   93:invokespecial   #111 <Method void RectF(android.graphics.Rect)>
			//*  44   96:astore_1        
			//*  45   97:aload_0         
			//*  46   98:getfield        #32  <Field PrintHelper$PrintHelperApi19 this$0>
			//*  47  101:aload_3         
			//*  48  102:invokevirtual   #116 <Method int Bitmap.getWidth()>
			//*  49  105:aload_3         
			//*  50  106:invokevirtual   #119 <Method int Bitmap.getHeight()>
			//*  51  109:aload_1         
			//*  52  110:aload_0         
			//*  53  111:getfield        #42  <Field int val$fittingMode>
			//*  54  114:invokestatic    #123 <Method Matrix PrintHelper$PrintHelperApi19.access$200(PrintHelper$PrintHelperApi19, int, int, RectF, int)>
			//*  55  117:astore          6
			//*  56  119:aload_0         
			//*  57  120:getfield        #32  <Field PrintHelper$PrintHelperApi19 this$0>
			//*  58  123:getfield        #94  <Field boolean PrintHelper$PrintHelperApi19.mIsMinMarginsHandlingCorrect>
			//*  59  126:ifeq            295
			//*  60  129:aload           5
			//*  61  131:invokevirtual   #127 <Method Canvas android.graphics.pdf.PdfDocument$Page.getCanvas()>
			//*  62  134:aload_3         
			//*  63  135:aload           6
			//*  64  137:aconst_null     
			//*  65  138:invokevirtual   #133 <Method void Canvas.drawBitmap(Bitmap, Matrix, Paint)>
			//*  66  141:aload           4
			//*  67  143:aload           5
			//*  68  145:invokevirtual   #137 <Method void PrintedPdfDocument.finishPage(android.graphics.pdf.PdfDocument$Page)>
			//*  69  148:aload_0         
			//*  70  149:getfield        #34  <Field CancellationSignal val$cancellationSignal>
			//*  71  152:invokevirtual   #67  <Method boolean CancellationSignal.isCanceled()>
			//*  72  155:istore_2        
			//*  73  156:iload_2         
			//*  74  157:ifeq            322
			//*  75  160:aload           4
			//*  76  162:invokevirtual   #140 <Method void PrintedPdfDocument.close()>
			//*  77  165:aload_0         
			//*  78  166:getfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
			//*  79  169:astore_1        
			//*  80  170:aload_1         
			//*  81  171:ifnull          181
			//*  82  174:aload_0         
			//*  83  175:getfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
			//*  84  178:invokevirtual   #143 <Method void ParcelFileDescriptor.close()>
			//*  85  181:aload_3         
			//*  86  182:aload_0         
			//*  87  183:getfield        #38  <Field Bitmap val$bitmap>
			//*  88  186:if_acmpeq       389
			//*  89  189:aload_3         
			//*  90  190:invokevirtual   #146 <Method void Bitmap.recycle()>
			//*  91  193:aconst_null     
			//*  92  194:areturn         
				// Misplaced declaration of an exception variable
				catch(Void avoid[])
			//*  93  195:astore_1        
				{
					return ((Throwable) (avoid));
			//   94  196:aload_1         
			//   95  197:areturn         
				}
				if(flag) goto _L2; else goto _L1
_L1:
				page = ((PrintedPdfDocument) (obj)).startPage(1);
				if(!mIsMinMarginsHandlingCorrect) goto _L4; else goto _L3
_L3:
				avoid = ((Void []) (new RectF(page.getInfo().getContentRect())));
_L12:
				obj1 = ((Object) (getMatrix(bitmap1.getWidth(), bitmap1.getHeight(), ((RectF) (avoid)), fittingMode)));
				if(!mIsMinMarginsHandlingCorrect) goto _L6; else goto _L5
_L5:
				page.getCanvas().drawBitmap(bitmap1, ((Matrix) (obj1)), ((Paint) (null)));
				((PrintedPdfDocument) (obj)).finishPage(page);
				flag = cancellationSignal.isCanceled();
				if(!flag) goto _L8; else goto _L7
_L7:
				((PrintedPdfDocument) (obj)).close();
				avoid = ((Void []) (fileDescriptor));
				if(avoid == null)
					break MISSING_BLOCK_LABEL_181;
				try
				{
					fileDescriptor.close();
				}
			//*  96  198:new             #69  <Class PrintedPdfDocument>
			//*  97  201:dup             
			//*  98  202:aload_0         
			//*  99  203:getfield        #32  <Field PrintHelper$PrintHelperApi19 this$0>
			//* 100  206:getfield        #73  <Field Context PrintHelper$PrintHelperApi19.mContext>
			//* 101  209:aload_0         
			//* 102  210:getfield        #40  <Field PrintAttributes val$attributes>
			//* 103  213:invokespecial   #76  <Method void PrintedPdfDocument(Context, PrintAttributes)>
			//* 104  216:astore          6
			//* 105  218:aload           6
			//* 106  220:iconst_1        
			//* 107  221:invokevirtual   #90  <Method android.graphics.pdf.PdfDocument$Page PrintedPdfDocument.startPage(int)>
			//* 108  224:astore          7
			//* 109  226:new             #96  <Class RectF>
			//* 110  229:dup             
			//* 111  230:aload           7
			//* 112  232:invokevirtual   #102 <Method android.graphics.pdf.PdfDocument$PageInfo android.graphics.pdf.PdfDocument$Page.getInfo()>
			//* 113  235:invokevirtual   #108 <Method android.graphics.Rect android.graphics.pdf.PdfDocument$PageInfo.getContentRect()>
			//* 114  238:invokespecial   #111 <Method void RectF(android.graphics.Rect)>
			//* 115  241:astore_1        
			//* 116  242:aload           6
			//* 117  244:aload           7
			//* 118  246:invokevirtual   #137 <Method void PrintedPdfDocument.finishPage(android.graphics.pdf.PdfDocument$Page)>
			//* 119  249:aload           6
			//* 120  251:invokevirtual   #140 <Method void PrintedPdfDocument.close()>
			//* 121  254:goto            97
			//* 122  257:astore_1        
			//* 123  258:aload           4
			//* 124  260:invokevirtual   #140 <Method void PrintedPdfDocument.close()>
			//* 125  263:aload_0         
			//* 126  264:getfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 127  267:astore          4
			//* 128  269:aload           4
			//* 129  271:ifnull          281
			//* 130  274:aload_0         
			//* 131  275:getfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 132  278:invokevirtual   #143 <Method void ParcelFileDescriptor.close()>
			//* 133  281:aload_3         
			//* 134  282:aload_0         
			//* 135  283:getfield        #38  <Field Bitmap val$bitmap>
			//* 136  286:if_acmpeq       293
			//* 137  289:aload_3         
			//* 138  290:invokevirtual   #146 <Method void Bitmap.recycle()>
			//* 139  293:aload_1         
			//* 140  294:athrow          
			//* 141  295:aload           6
			//* 142  297:aload_1         
			//* 143  298:getfield        #150 <Field float RectF.left>
			//* 144  301:aload_1         
			//* 145  302:getfield        #153 <Field float RectF.top>
			//* 146  305:invokevirtual   #159 <Method boolean Matrix.postTranslate(float, float)>
			//* 147  308:pop             
			//* 148  309:aload           5
			//* 149  311:invokevirtual   #127 <Method Canvas android.graphics.pdf.PdfDocument$Page.getCanvas()>
			//* 150  314:aload_1         
			//* 151  315:invokevirtual   #163 <Method boolean Canvas.clipRect(RectF)>
			//* 152  318:pop             
			//* 153  319:goto            129
			//* 154  322:aload           4
			//* 155  324:new             #165 <Class FileOutputStream>
			//* 156  327:dup             
			//* 157  328:aload_0         
			//* 158  329:getfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 159  332:invokevirtual   #169 <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
			//* 160  335:invokespecial   #172 <Method void FileOutputStream(java.io.FileDescriptor)>
			//* 161  338:invokevirtual   #176 <Method void PrintedPdfDocument.writeTo(java.io.OutputStream)>
			//* 162  341:aload           4
			//* 163  343:invokevirtual   #140 <Method void PrintedPdfDocument.close()>
			//* 164  346:aload_0         
			//* 165  347:getfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 166  350:astore_1        
			//* 167  351:aload_1         
			//* 168  352:ifnull          362
			//* 169  355:aload_0         
			//* 170  356:getfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 171  359:invokevirtual   #143 <Method void ParcelFileDescriptor.close()>
			//* 172  362:aload_3         
			//* 173  363:aload_0         
			//* 174  364:getfield        #38  <Field Bitmap val$bitmap>
			//* 175  367:if_acmpeq       389
			//* 176  370:aload_3         
			//* 177  371:invokevirtual   #146 <Method void Bitmap.recycle()>
			//* 178  374:aconst_null     
			//* 179  375:areturn         
			//* 180  376:astore          4
			//* 181  378:goto            281
			//* 182  381:astore_1        
			//* 183  382:goto            362
				// Misplaced declaration of an exception variable
				catch(Void avoid[]) { }
			//  184  385:astore_1        
				if(bitmap1 == bitmap) goto _L2; else goto _L9
_L9:
				bitmap1.recycle();
				return null;
_L4:
				obj1 = ((Object) (new PrintedPdfDocument(mContext, attributes)));
				android.graphics.pdf.PdfDocument.Page page1 = ((PrintedPdfDocument) (obj1)).startPage(1);
				avoid = ((Void []) (new RectF(page1.getInfo().getContentRect())));
				((PrintedPdfDocument) (obj1)).finishPage(page1);
				((PrintedPdfDocument) (obj1)).close();
				continue; /* Loop/switch isn't completed */
				avoid;
				((PrintedPdfDocument) (obj)).close();
				obj = ((Object) (fileDescriptor));
				if(obj == null)
					break MISSING_BLOCK_LABEL_281;
				try
				{
					fileDescriptor.close();
				}
				catch(IOException ioexception) { }
				if(bitmap1 != bitmap)
					bitmap1.recycle();
				throw avoid;
_L6:
				((Matrix) (obj1)).postTranslate(((RectF) (avoid)).left, ((RectF) (avoid)).top);
				page.getCanvas().clipRect(((RectF) (avoid)));
				  goto _L5
_L8:
				((PrintedPdfDocument) (obj)).writeTo(((java.io.OutputStream) (new FileOutputStream(fileDescriptor.getFileDescriptor()))));
				((PrintedPdfDocument) (obj)).close();
				avoid = ((Void []) (fileDescriptor));
				if(avoid == null)
					break MISSING_BLOCK_LABEL_362;
				try
				{
					fileDescriptor.close();
				}
				// Misplaced declaration of an exception variable
				catch(Void avoid[]) { }
				if(bitmap1 == bitmap) goto _L2; else goto _L10
_L10:
				bitmap1.recycle();
				return null;
			//* 185  386:goto            181
_L2:
				return null;
			//  186  389:aconst_null     
			//  187  390:areturn         
				if(true) goto _L12; else goto _L11
_L11:
			}

			protected volatile void onPostExecute(Object obj)
			{
				onPostExecute((Throwable)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #59  <Class Throwable>
			//    3    5:invokevirtual   #181 <Method void onPostExecute(Throwable)>
			//    4    8:return          
			}

			protected void onPostExecute(Throwable throwable)
			{
				if(cancellationSignal.isCanceled())
			//*   0    0:aload_0         
			//*   1    1:getfield        #34  <Field CancellationSignal val$cancellationSignal>
			//*   2    4:invokevirtual   #67  <Method boolean CancellationSignal.isCanceled()>
			//*   3    7:ifeq            18
				{
					writeResultCallback.onWriteCancelled();
			//    4   10:aload_0         
			//    5   11:getfield        #46  <Field android.print.PrintDocumentAdapter$WriteResultCallback val$writeResultCallback>
			//    6   14:invokevirtual   #186 <Method void android.print.PrintDocumentAdapter$WriteResultCallback.onWriteCancelled()>
					return;
			//    7   17:return          
				}
				if(throwable == null)
			//*   8   18:aload_1         
			//*   9   19:ifnonnull       40
				{
					writeResultCallback.onWriteFinished(new PageRange[] {
						PageRange.ALL_PAGES
					});
			//   10   22:aload_0         
			//   11   23:getfield        #46  <Field android.print.PrintDocumentAdapter$WriteResultCallback val$writeResultCallback>
			//   12   26:iconst_1        
			//   13   27:anewarray       PageRange[]
			//   14   30:dup             
			//   15   31:iconst_0        
			//   16   32:getstatic       #192 <Field PageRange PageRange.ALL_PAGES>
			//   17   35:aastore         
			//   18   36:invokevirtual   #196 <Method void android.print.PrintDocumentAdapter$WriteResultCallback.onWriteFinished(PageRange[])>
					return;
			//   19   39:return          
				} else
				{
					Log.e("PrintHelperApi19", "Error writing printed content", throwable);
			//   20   40:ldc1            #197 <String "PrintHelperApi19">
			//   21   42:ldc1            #199 <String "Error writing printed content">
			//   22   44:aload_1         
			//   23   45:invokestatic    #205 <Method int Log.e(String, String, Throwable)>
			//   24   48:pop             
					writeResultCallback.onWriteFailed(((CharSequence) (null)));
			//   25   49:aload_0         
			//   26   50:getfield        #46  <Field android.print.PrintDocumentAdapter$WriteResultCallback val$writeResultCallback>
			//   27   53:aconst_null     
			//   28   54:invokevirtual   #209 <Method void android.print.PrintDocumentAdapter$WriteResultCallback.onWriteFailed(CharSequence)>
					return;
			//   29   57:return          
				}
			}

			final PrintHelper.PrintHelperApi19 this$0;
			final PrintAttributes val$attributes;
			final Bitmap val$bitmap;
			final CancellationSignal val$cancellationSignal;
			final ParcelFileDescriptor val$fileDescriptor;
			final int val$fittingMode;
			final PrintAttributes val$pdfAttributes;
			final android.print.PrintDocumentAdapter.WriteResultCallback val$writeResultCallback;

			
			{
				this$0 = PrintHelper.PrintHelperApi19.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #32  <Field PrintHelper$PrintHelperApi19 this$0>
				cancellationSignal = cancellationsignal;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #34  <Field CancellationSignal val$cancellationSignal>
				pdfAttributes = printattributes;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #36  <Field PrintAttributes val$pdfAttributes>
				bitmap = bitmap1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #38  <Field Bitmap val$bitmap>
				attributes = printattributes1;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #40  <Field PrintAttributes val$attributes>
				fittingMode = i;
			//   15   27:aload_0         
			//   16   28:iload           6
			//   17   30:putfield        #42  <Field int val$fittingMode>
				fileDescriptor = parcelfiledescriptor;
			//   18   33:aload_0         
			//   19   34:aload           7
			//   20   36:putfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
				writeResultCallback = writeresultcallback;
			//   21   39:aload_0         
			//   22   40:aload           8
			//   23   42:putfield        #46  <Field android.print.PrintDocumentAdapter$WriteResultCallback val$writeResultCallback>
				super();
			//   24   45:aload_0         
			//   25   46:invokespecial   #49  <Method void AsyncTask()>
			//   26   49:return          
			}
		}
)).execute(((Object []) (new Void[0])));
	//*  34   62:goto            10
	}

	protected android.print.PrintAttributes.Builder copyAttributes(PrintAttributes printattributes)
	{
		android.print.PrintAttributes.Builder builder = (new android.print.PrintAttributes.Builder()).setMediaSize(printattributes.getMediaSize()).setResolution(printattributes.getResolution()).setMinMargins(printattributes.getMinMargins());
	//    0    0:new             #261 <Class android.print.PrintAttributes$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #270 <Method void android.print.PrintAttributes$Builder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #276 <Method android.print.PrintAttributes$MediaSize PrintAttributes.getMediaSize()>
	//    5   11:invokevirtual   #280 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #284 <Method android.print.PrintAttributes$Resolution PrintAttributes.getResolution()>
	//    8   18:invokevirtual   #288 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setResolution(android.print.PrintAttributes$Resolution)>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #292 <Method android.print.PrintAttributes$Margins PrintAttributes.getMinMargins()>
	//   11   25:invokevirtual   #265 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMinMargins(android.print.PrintAttributes$Margins)>
	//   12   28:astore_2        
		if(printattributes.getColorMode() != 0)
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #295 <Method int PrintAttributes.getColorMode()>
	//*  15   33:ifeq            45
			builder.setColorMode(printattributes.getColorMode());
	//   16   36:aload_2         
	//   17   37:aload_1         
	//   18   38:invokevirtual   #295 <Method int PrintAttributes.getColorMode()>
	//   19   41:invokevirtual   #299 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setColorMode(int)>
	//   20   44:pop             
		return builder;
	//   21   45:aload_2         
	//   22   46:areturn         
	}

	public int getColorMode()
	{
		return mColorMode;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int mColorMode>
	//    2    4:ireturn         
	}

	public int getOrientation()
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #302 <Field int mOrientation>
	//*   2    4:ifne            9
			return 1;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		else
			return mOrientation;
	//    5    9:aload_0         
	//    6   10:getfield        #302 <Field int mOrientation>
	//    7   13:ireturn         
	}

	public int getScaleMode()
	{
		return mScaleMode;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int mScaleMode>
	//    2    4:ireturn         
	}

	public void printBitmap(final String jobName, final Bitmap bitmap, final back callback)
	{
		if(bitmap == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		final int fittingMode = mScaleMode;
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field int mScaleMode>
	//    5    9:istore          4
		PrintManager printmanager = (PrintManager)mContext.getSystemService("print");
	//    6   11:aload_0         
	//    7   12:getfield        #59  <Field Context mContext>
	//    8   15:ldc2            #307 <String "print">
	//    9   18:invokevirtual   #311 <Method Object Context.getSystemService(String)>
	//   10   21:checkcast       #313 <Class PrintManager>
	//   11   24:astore          6
		Object obj;
		if(isPortrait(bitmap))
	//*  12   26:aload_2         
	//*  13   27:invokestatic    #92  <Method boolean isPortrait(Bitmap)>
	//*  14   30:ifeq            85
			obj = ((Object) (android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT));
	//   15   33:getstatic       #319 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_PORTRAIT>
	//   16   36:astore          5
		else
	//*  17   38:new             #261 <Class android.print.PrintAttributes$Builder>
	//*  18   41:dup             
	//*  19   42:invokespecial   #270 <Method void android.print.PrintAttributes$Builder()>
	//*  20   45:aload           5
	//*  21   47:invokevirtual   #280 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
	//*  22   50:aload_0         
	//*  23   51:getfield        #53  <Field int mColorMode>
	//*  24   54:invokevirtual   #299 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setColorMode(int)>
	//*  25   57:invokevirtual   #269 <Method PrintAttributes android.print.PrintAttributes$Builder.build()>
	//*  26   60:astore          5
	//*  27   62:aload           6
	//*  28   64:aload_1         
	//*  29   65:new             #11  <Class PrintHelper$PrintHelperApi19$1>
	//*  30   68:dup             
	//*  31   69:aload_0         
	//*  32   70:aload_1         
	//*  33   71:iload           4
	//*  34   73:aload_2         
	//*  35   74:aload_3         
	//*  36   75:invokespecial   #322 <Method void PrintHelper$PrintHelperApi19$1(PrintHelper$PrintHelperApi19, String, int, Bitmap, PrintHelper$OnPrintFinishCallback)>
	//*  37   78:aload           5
	//*  38   80:invokevirtual   #325 <Method android.print.PrintJob PrintManager.print(String, PrintDocumentAdapter, PrintAttributes)>
	//*  39   83:pop             
	//*  40   84:return          
			obj = ((Object) (android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE));
	//   41   85:getstatic       #328 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_LANDSCAPE>
	//   42   88:astore          5
		obj = ((Object) ((new android.print.PrintAttributes.Builder()).setMediaSize(((android.print.PrintAttributes.MediaSize) (obj))).setColorMode(mColorMode).build()));
		printmanager.print(jobName, ((PrintDocumentAdapter) (new PrintDocumentAdapter() {

			public void onFinish()
			{
				if(callback != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #36  <Field PrintHelper$OnPrintFinishCallback val$callback>
			//*   2    4:ifnull          16
					callback.onFinish();
			//    3    7:aload_0         
			//    4    8:getfield        #36  <Field PrintHelper$OnPrintFinishCallback val$callback>
			//    5   11:invokeinterface #45  <Method void PrintHelper$OnPrintFinishCallback.onFinish()>
			//    6   16:return          
			}

			public void onLayout(PrintAttributes printattributes, PrintAttributes printattributes1, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.LayoutResultCallback layoutresultcallback, Bundle bundle)
			{
				boolean flag = true;
			//    0    0:iconst_1        
			//    1    1:istore          6
				mAttributes = printattributes1;
			//    2    3:aload_0         
			//    3    4:aload_2         
			//    4    5:putfield        #49  <Field PrintAttributes mAttributes>
				cancellationsignal = ((CancellationSignal) ((new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build()));
			//    5    8:new             #51  <Class android.print.PrintDocumentInfo$Builder>
			//    6   11:dup             
			//    7   12:aload_0         
			//    8   13:getfield        #30  <Field String val$jobName>
			//    9   16:invokespecial   #54  <Method void android.print.PrintDocumentInfo$Builder(String)>
			//   10   19:iconst_1        
			//   11   20:invokevirtual   #58  <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
			//   12   23:iconst_1        
			//   13   24:invokevirtual   #61  <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
			//   14   27:invokevirtual   #65  <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
			//   15   30:astore_3        
				if(printattributes1.equals(((Object) (printattributes))))
			//*  16   31:aload_2         
			//*  17   32:aload_1         
			//*  18   33:invokevirtual   #71  <Method boolean PrintAttributes.equals(Object)>
			//*  19   36:ifne            48
			//*  20   39:aload           4
			//*  21   41:aload_3         
			//*  22   42:iload           6
			//*  23   44:invokevirtual   #77  <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
			//*  24   47:return          
					flag = false;
			//   25   48:iconst_0        
			//   26   49:istore          6
				layoutresultcallback.onLayoutFinished(((android.print.PrintDocumentInfo) (cancellationsignal)), flag);
			//*  27   51:goto            39
			}

			public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.WriteResultCallback writeresultcallback)
			{
				writeBitmap(mAttributes, fittingMode, bitmap, parcelfiledescriptor, cancellationsignal, writeresultcallback);
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field PrintHelper$PrintHelperApi19 this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #49  <Field PrintAttributes mAttributes>
			//    4    8:aload_0         
			//    5    9:getfield        #32  <Field int val$fittingMode>
			//    6   12:aload_0         
			//    7   13:getfield        #34  <Field Bitmap val$bitmap>
			//    8   16:aload_2         
			//    9   17:aload_3         
			//   10   18:aload           4
			//   11   20:invokestatic    #83  <Method void PrintHelper$PrintHelperApi19.access$000(PrintHelper$PrintHelperApi19, PrintAttributes, int, Bitmap, ParcelFileDescriptor, CancellationSignal, android.print.PrintDocumentAdapter$WriteResultCallback)>
			//   12   23:return          
			}

			private PrintAttributes mAttributes;
			final PrintHelper.PrintHelperApi19 this$0;
			final Bitmap val$bitmap;
			final PrintHelper.OnPrintFinishCallback val$callback;
			final int val$fittingMode;
			final String val$jobName;

			
			{
				this$0 = PrintHelper.PrintHelperApi19.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field PrintHelper$PrintHelperApi19 this$0>
				jobName = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #30  <Field String val$jobName>
				fittingMode = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #32  <Field int val$fittingMode>
				bitmap = bitmap1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #34  <Field Bitmap val$bitmap>
				callback = onprintfinishcallback;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #36  <Field PrintHelper$OnPrintFinishCallback val$callback>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #39  <Method void PrintDocumentAdapter()>
			//   17   31:return          
			}
		}
)), ((PrintAttributes) (obj)));
	//*  43   90:goto            38
	}

	public void printBitmap(final String jobName, final Uri imageFile, final back callback)
		throws FileNotFoundException
	{
		android.print.PrintAttributes.Builder builder;
		imageFile = ((Uri) (new PrintDocumentAdapter() {

			private void cancelLoad()
			{
				synchronized(mLock)
			//*   0    0:aload_0         
			//*   1    1:getfield        #37  <Field PrintHelper$PrintHelperApi19 this$0>
			//*   2    4:invokestatic    #64  <Method Object PrintHelper$PrintHelperApi19.access$700(PrintHelper$PrintHelperApi19)>
			//*   3    7:astore_1        
			//*   4    8:aload_1         
			//*   5    9:monitorenter    
				{
					if(mDecodeOptions != null)
			//*   6   10:aload_0         
			//*   7   11:getfield        #37  <Field PrintHelper$PrintHelperApi19 this$0>
			//*   8   14:getfield        #68  <Field android.graphics.BitmapFactory$Options PrintHelper$PrintHelperApi19.mDecodeOptions>
			//*   9   17:ifnull          38
					{
						mDecodeOptions.requestCancelDecode();
			//   10   20:aload_0         
			//   11   21:getfield        #37  <Field PrintHelper$PrintHelperApi19 this$0>
			//   12   24:getfield        #68  <Field android.graphics.BitmapFactory$Options PrintHelper$PrintHelperApi19.mDecodeOptions>
			//   13   27:invokevirtual   #73  <Method void android.graphics.BitmapFactory$Options.requestCancelDecode()>
						mDecodeOptions = null;
			//   14   30:aload_0         
			//   15   31:getfield        #37  <Field PrintHelper$PrintHelperApi19 this$0>
			//   16   34:aconst_null     
			//   17   35:putfield        #68  <Field android.graphics.BitmapFactory$Options PrintHelper$PrintHelperApi19.mDecodeOptions>
					}
				}
			//   18   38:aload_1         
			//   19   39:monitorexit     
				return;
			//   20   40:return          
				exception;
			//   21   41:astore_2        
				obj;
			//   22   42:aload_1         
				JVM INSTR monitorexit ;
			//   23   43:monitorexit     
				throw exception;
			//   24   44:aload_2         
			//   25   45:athrow          
			}

			public void onFinish()
			{
				super.onFinish();
			//    0    0:aload_0         
			//    1    1:invokespecial   #76  <Method void PrintDocumentAdapter.onFinish()>
				cancelLoad();
			//    2    4:aload_0         
			//    3    5:invokespecial   #56  <Method void cancelLoad()>
				if(mLoadBitmap != null)
			//*   4    8:aload_0         
			//*   5    9:getfield        #78  <Field AsyncTask mLoadBitmap>
			//*   6   12:ifnull          24
					mLoadBitmap.cancel(true);
			//    7   15:aload_0         
			//    8   16:getfield        #78  <Field AsyncTask mLoadBitmap>
			//    9   19:iconst_1        
			//   10   20:invokevirtual   #84  <Method boolean AsyncTask.cancel(boolean)>
			//   11   23:pop             
				if(callback != null)
			//*  12   24:aload_0         
			//*  13   25:getfield        #43  <Field PrintHelper$OnPrintFinishCallback val$callback>
			//*  14   28:ifnull          40
					callback.onFinish();
			//   15   31:aload_0         
			//   16   32:getfield        #43  <Field PrintHelper$OnPrintFinishCallback val$callback>
			//   17   35:invokeinterface #87  <Method void PrintHelper$OnPrintFinishCallback.onFinish()>
				if(mBitmap != null)
			//*  18   40:aload_0         
			//*  19   41:getfield        #50  <Field Bitmap mBitmap>
			//*  20   44:ifnull          59
				{
					mBitmap.recycle();
			//   21   47:aload_0         
			//   22   48:getfield        #50  <Field Bitmap mBitmap>
			//   23   51:invokevirtual   #92  <Method void Bitmap.recycle()>
					mBitmap = null;
			//   24   54:aload_0         
			//   25   55:aconst_null     
			//   26   56:putfield        #50  <Field Bitmap mBitmap>
				}
			//   27   59:return          
			}

			public void onLayout(final PrintAttributes oldPrintAttributes, final PrintAttributes newPrintAttributes, final CancellationSignal cancellationSignal, android.print.PrintDocumentAdapter.LayoutResultCallback layoutresultcallback, Bundle bundle)
			{
				boolean flag = true;
			//    0    0:iconst_1        
			//    1    1:istore          6
				this;
			//    2    3:aload_0         
				JVM INSTR monitorenter ;
			//    3    4:monitorenter    
				mAttributes = newPrintAttributes;
			//    4    5:aload_0         
			//    5    6:aload_2         
			//    6    7:putfield        #60  <Field PrintAttributes mAttributes>
				this;
			//    7   10:aload_0         
				JVM INSTR monitorexit ;
			//    8   11:monitorexit     
				if(cancellationSignal.isCanceled())
			//*   9   12:aload_3         
			//*  10   13:invokevirtual   #100 <Method boolean CancellationSignal.isCanceled()>
			//*  11   16:ifeq            30
				{
					layoutresultcallback.onLayoutCancelled();
			//   12   19:aload           4
			//   13   21:invokevirtual   #105 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutCancelled()>
					return;
			//   14   24:return          
				}
				break MISSING_BLOCK_LABEL_30;
				oldPrintAttributes;
			//   15   25:astore_1        
				this;
			//   16   26:aload_0         
				JVM INSTR monitorexit ;
			//   17   27:monitorexit     
				throw oldPrintAttributes;
			//   18   28:aload_1         
			//   19   29:athrow          
				if(mBitmap != null)
			//*  20   30:aload_0         
			//*  21   31:getfield        #50  <Field Bitmap mBitmap>
			//*  22   34:ifnull          83
				{
					cancellationSignal = ((CancellationSignal) ((new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build()));
			//   23   37:new             #107 <Class android.print.PrintDocumentInfo$Builder>
			//   24   40:dup             
			//   25   41:aload_0         
			//   26   42:getfield        #39  <Field String val$jobName>
			//   27   45:invokespecial   #110 <Method void android.print.PrintDocumentInfo$Builder(String)>
			//   28   48:iconst_1        
			//   29   49:invokevirtual   #114 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
			//   30   52:iconst_1        
			//   31   53:invokevirtual   #117 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
			//   32   56:invokevirtual   #121 <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
			//   33   59:astore_3        
					if(newPrintAttributes.equals(((Object) (oldPrintAttributes))))
			//*  34   60:aload_2         
			//*  35   61:aload_1         
			//*  36   62:invokevirtual   #127 <Method boolean PrintAttributes.equals(Object)>
			//*  37   65:ifne            77
			//*  38   68:aload           4
			//*  39   70:aload_3         
			//*  40   71:iload           6
			//*  41   73:invokevirtual   #131 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
			//*  42   76:return          
						flag = false;
			//   43   77:iconst_0        
			//   44   78:istore          6
					layoutresultcallback.onLayoutFinished(((android.print.PrintDocumentInfo) (cancellationSignal)), flag);
					return;
				} else
			//*  45   80:goto            68
				{
					mLoadBitmap = ((_cls1) (((_cls1) (layoutresultcallback)). new AsyncTask() {

						protected transient Bitmap doInBackground(Uri auri[])
						{
							try
							{
								auri = ((Uri []) (loadConstrainedBitmap(imageFile)));
						//    0    0:aload_0         
						//    1    1:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
						//    2    4:getfield        #50  <Field PrintHelper$PrintHelperApi19 PrintHelper$PrintHelperApi19$3.this$0>
						//    3    7:aload_0         
						//    4    8:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
						//    5   11:getfield        #54  <Field Uri PrintHelper$PrintHelperApi19$3.val$imageFile>
						//    6   14:invokestatic    #58  <Method Bitmap PrintHelper$PrintHelperApi19.access$400(PrintHelper$PrintHelperApi19, Uri)>
						//    7   17:astore_1        
							}
						//*   8   18:aload_1         
						//*   9   19:areturn         
							// Misplaced declaration of an exception variable
							catch(Uri auri[])
						//*  10   20:astore_1        
							{
								return null;
						//   11   21:aconst_null     
						//   12   22:areturn         
							}
							return ((Bitmap) (auri));
						}

						protected volatile Object doInBackground(Object aobj[])
						{
							return ((Object) (doInBackground((Uri[])aobj)));
						//    0    0:aload_0         
						//    1    1:aload_1         
						//    2    2:checkcast       #61  <Class Uri[]>
						//    3    5:invokevirtual   #63  <Method Bitmap doInBackground(Uri[])>
						//    4    8:areturn         
						}

						protected void onCancelled(Bitmap bitmap)
						{
							layoutResultCallback.onLayoutCancelled();
						//    0    0:aload_0         
						//    1    1:getfield        #38  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
						//    2    4:invokevirtual   #70  <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutCancelled()>
							mLoadBitmap = null;
						//    3    7:aload_0         
						//    4    8:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
						//    5   11:aconst_null     
						//    6   12:putfield        #74  <Field AsyncTask PrintHelper$PrintHelperApi19$3.mLoadBitmap>
						//    7   15:return          
						}

						protected volatile void onCancelled(Object obj)
						{
							onCancelled((Bitmap)obj);
						//    0    0:aload_0         
						//    1    1:aload_1         
						//    2    2:checkcast       #77  <Class Bitmap>
						//    3    5:invokevirtual   #79  <Method void onCancelled(Bitmap)>
						//    4    8:return          
						}

						protected void onPostExecute(Bitmap bitmap)
						{
							Object obj;
							super.onPostExecute(((Object) (bitmap)));
						//    0    0:aload_0         
						//    1    1:aload_1         
						//    2    2:invokespecial   #82  <Method void AsyncTask.onPostExecute(Object)>
							obj = ((Object) (bitmap));
						//    3    5:aload_1         
						//    4    6:astore_3        
							if(bitmap == null)
								break MISSING_BLOCK_LABEL_108;
						//    5    7:aload_1         
						//    6    8:ifnull          108
							if(mPrintActivityRespectsOrientation)
						//*   7   11:aload_0         
						//*   8   12:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
						//*   9   15:getfield        #50  <Field PrintHelper$PrintHelperApi19 PrintHelper$PrintHelperApi19$3.this$0>
						//*  10   18:getfield        #86  <Field boolean PrintHelper$PrintHelperApi19.mPrintActivityRespectsOrientation>
						//*  11   21:ifeq            39
							{
								obj = ((Object) (bitmap));
						//   12   24:aload_1         
						//   13   25:astore_3        
								if(mOrientation != 0)
									break MISSING_BLOCK_LABEL_108;
						//   14   26:aload_0         
						//   15   27:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
						//   16   30:getfield        #50  <Field PrintHelper$PrintHelperApi19 PrintHelper$PrintHelperApi19$3.this$0>
						//   17   33:getfield        #90  <Field int PrintHelper$PrintHelperApi19.mOrientation>
						//   18   36:ifne            108
							}
							this;
						//   19   39:aload_0         
							JVM INSTR monitorenter ;
						//   20   40:monitorenter    
							android.print.PrintAttributes.MediaSize mediasize = mAttributes.getMediaSize();
						//   21   41:aload_0         
						//   22   42:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
						//   23   45:invokestatic    #94  <Method PrintAttributes PrintHelper$PrintHelperApi19$3.access$500(PrintHelper$PrintHelperApi19$3)>
						//   24   48:invokevirtual   #100 <Method android.print.PrintAttributes$MediaSize PrintAttributes.getMediaSize()>
						//   25   51:astore          4
							this;
						//   26   53:aload_0         
							JVM INSTR monitorexit ;
						//   27   54:monitorexit     
							obj = ((Object) (bitmap));
						//   28   55:aload_1         
						//   29   56:astore_3        
							if(mediasize != null)
						//*  30   57:aload           4
						//*  31   59:ifnull          108
							{
								obj = ((Object) (bitmap));
						//   32   62:aload_1         
						//   33   63:astore_3        
								if(mediasize.isPortrait() != PrintHelper.PrintHelperApi19.isPortrait(bitmap))
						//*  34   64:aload           4
						//*  35   66:invokevirtual   #106 <Method boolean android.print.PrintAttributes$MediaSize.isPortrait()>
						//*  36   69:aload_1         
						//*  37   70:invokestatic    #110 <Method boolean PrintHelper$PrintHelperApi19.access$600(Bitmap)>
						//*  38   73:icmpeq          108
								{
									obj = ((Object) (new Matrix()));
						//   39   76:new             #112 <Class Matrix>
						//   40   79:dup             
						//   41   80:invokespecial   #113 <Method void Matrix()>
						//   42   83:astore_3        
									((Matrix) (obj)).postRotate(90F);
						//   43   84:aload_3         
						//   44   85:ldc1            #114 <Float 90F>
						//   45   87:invokevirtual   #118 <Method boolean Matrix.postRotate(float)>
						//   46   90:pop             
									obj = ((Object) (Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true)));
						//   47   91:aload_1         
						//   48   92:iconst_0        
						//   49   93:iconst_0        
						//   50   94:aload_1         
						//   51   95:invokevirtual   #122 <Method int Bitmap.getWidth()>
						//   52   98:aload_1         
						//   53   99:invokevirtual   #125 <Method int Bitmap.getHeight()>
						//   54  102:aload_3         
						//   55  103:iconst_1        
						//   56  104:invokestatic    #129 <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int, Matrix, boolean)>
						//   57  107:astore_3        
								}
							}
							mBitmap = ((Bitmap) (obj));
						//   58  108:aload_0         
						//   59  109:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
						//   60  112:aload_3         
						//   61  113:putfield        #133 <Field Bitmap PrintHelper$PrintHelperApi19$3.mBitmap>
							if(obj != null)
						//*  62  116:aload_3         
						//*  63  117:ifnull          190
							{
								bitmap = ((Bitmap) ((new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build()));
						//   64  120:new             #135 <Class android.print.PrintDocumentInfo$Builder>
						//   65  123:dup             
						//   66  124:aload_0         
						//   67  125:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
						//   68  128:getfield        #139 <Field String PrintHelper$PrintHelperApi19$3.val$jobName>
						//   69  131:invokespecial   #142 <Method void android.print.PrintDocumentInfo$Builder(String)>
						//   70  134:iconst_1        
						//   71  135:invokevirtual   #146 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
						//   72  138:iconst_1        
						//   73  139:invokevirtual   #149 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
						//   74  142:invokevirtual   #153 <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
						//   75  145:astore_1        
								boolean flag;
								if(!newPrintAttributes.equals(((Object) (oldPrintAttributes))))
						//*  76  146:aload_0         
						//*  77  147:getfield        #34  <Field PrintAttributes val$newPrintAttributes>
						//*  78  150:aload_0         
						//*  79  151:getfield        #36  <Field PrintAttributes val$oldPrintAttributes>
						//*  80  154:invokevirtual   #157 <Method boolean PrintAttributes.equals(Object)>
						//*  81  157:ifne            185
									flag = true;
						//   82  160:iconst_1        
						//   83  161:istore_2        
								else
						//*  84  162:aload_0         
						//*  85  163:getfield        #38  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
						//*  86  166:aload_1         
						//*  87  167:iload_2         
						//*  88  168:invokevirtual   #161 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
						//*  89  171:aload_0         
						//*  90  172:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
						//*  91  175:aconst_null     
						//*  92  176:putfield        #74  <Field AsyncTask PrintHelper$PrintHelperApi19$3.mLoadBitmap>
						//*  93  179:return          
						//*  94  180:astore_1        
						//*  95  181:aload_0         
						//*  96  182:monitorexit     
						//*  97  183:aload_1         
						//*  98  184:athrow          
									flag = false;
						//   99  185:iconst_0        
						//  100  186:istore_2        
								layoutResultCallback.onLayoutFinished(((android.print.PrintDocumentInfo) (bitmap)), flag);
							} else
						//* 101  187:goto            162
							{
								layoutResultCallback.onLayoutFailed(((CharSequence) (null)));
						//  102  190:aload_0         
						//  103  191:getfield        #38  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
						//  104  194:aconst_null     
						//  105  195:invokevirtual   #165 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFailed(CharSequence)>
							}
							mLoadBitmap = null;
							return;
							bitmap;
							this;
							JVM INSTR monitorexit ;
							throw bitmap;
						//* 106  198:goto            171
						}

						protected volatile void onPostExecute(Object obj)
						{
							onPostExecute((Bitmap)obj);
						//    0    0:aload_0         
						//    1    1:aload_1         
						//    2    2:checkcast       #77  <Class Bitmap>
						//    3    5:invokevirtual   #167 <Method void onPostExecute(Bitmap)>
						//    4    8:return          
						}

						protected void onPreExecute()
						{
							cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() {

								public void onCancel()
								{
									cancelLoad();
								//    0    0:aload_0         
								//    1    1:getfield        #24  <Field PrintHelper$PrintHelperApi19$3$1 this$2>
								//    2    4:getfield        #32  <Field PrintHelper$PrintHelperApi19$3 PrintHelper$PrintHelperApi19$3$1.this$1>
								//    3    7:invokestatic    #36  <Method void PrintHelper$PrintHelperApi19$3.access$300(PrintHelper$PrintHelperApi19$3)>
									cancel(false);
								//    4   10:aload_0         
								//    5   11:getfield        #24  <Field PrintHelper$PrintHelperApi19$3$1 this$2>
								//    6   14:iconst_0        
								//    7   15:invokevirtual   #40  <Method boolean PrintHelper$PrintHelperApi19$3$1.cancel(boolean)>
								//    8   18:pop             
								//    9   19:return          
								}

								final _cls1 this$2;

			
			{
				this$2 = _cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field PrintHelper$PrintHelperApi19$3$1 this$2>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #26  <Method void Object()>
			//    5    9:return          
			}
							}
);
						//    0    0:aload_0         
						//    1    1:getfield        #32  <Field CancellationSignal val$cancellationSignal>
						//    2    4:new             #17  <Class PrintHelper$PrintHelperApi19$3$1$1>
						//    3    7:dup             
						//    4    8:aload_0         
						//    5    9:invokespecial   #171 <Method void PrintHelper$PrintHelperApi19$3$1$1(PrintHelper$PrintHelperApi19$3$1)>
						//    6   12:invokevirtual   #177 <Method void CancellationSignal.setOnCancelListener(android.os.CancellationSignal$OnCancelListener)>
						//    7   15:return          
						}

						final _cls3 this$1;
						final CancellationSignal val$cancellationSignal;
						final android.print.PrintDocumentAdapter.LayoutResultCallback val$layoutResultCallback;
						final PrintAttributes val$newPrintAttributes;
						final PrintAttributes val$oldPrintAttributes;

			
			{
				this$1 = final__pcls3;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
				cancellationSignal = cancellationsignal;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #32  <Field CancellationSignal val$cancellationSignal>
				newPrintAttributes = printattributes;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #34  <Field PrintAttributes val$newPrintAttributes>
				oldPrintAttributes = printattributes1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #36  <Field PrintAttributes val$oldPrintAttributes>
				layoutResultCallback = android.print.PrintDocumentAdapter.LayoutResultCallback.this;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #38  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #41  <Method void AsyncTask()>
			//   17   31:return          
			}
					}
)).execute(((Object []) (new Uri[0])));
			//   46   83:aload_0         
			//   47   84:new             #14  <Class PrintHelper$PrintHelperApi19$3$1>
			//   48   87:dup             
			//   49   88:aload_0         
			//   50   89:aload_3         
			//   51   90:aload_2         
			//   52   91:aload_1         
			//   53   92:aload           4
			//   54   94:invokespecial   #134 <Method void PrintHelper$PrintHelperApi19$3$1(PrintHelper$PrintHelperApi19$3, CancellationSignal, PrintAttributes, PrintAttributes, android.print.PrintDocumentAdapter$LayoutResultCallback)>
			//   55   97:iconst_0        
			//   56   98:anewarray       Uri[]
			//   57  101:invokevirtual   #140 <Method AsyncTask PrintHelper$PrintHelperApi19$3$1.execute(Object[])>
			//   58  104:putfield        #78  <Field AsyncTask mLoadBitmap>
					return;
			//   59  107:return          
				}
			}

			public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.WriteResultCallback writeresultcallback)
			{
				writeBitmap(mAttributes, fittingMode, mBitmap, parcelfiledescriptor, cancellationsignal, writeresultcallback);
			//    0    0:aload_0         
			//    1    1:getfield        #37  <Field PrintHelper$PrintHelperApi19 this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #60  <Field PrintAttributes mAttributes>
			//    4    8:aload_0         
			//    5    9:getfield        #45  <Field int val$fittingMode>
			//    6   12:aload_0         
			//    7   13:getfield        #50  <Field Bitmap mBitmap>
			//    8   16:aload_2         
			//    9   17:aload_3         
			//   10   18:aload           4
			//   11   20:invokestatic    #146 <Method void PrintHelper$PrintHelperApi19.access$000(PrintHelper$PrintHelperApi19, PrintAttributes, int, Bitmap, ParcelFileDescriptor, CancellationSignal, android.print.PrintDocumentAdapter$WriteResultCallback)>
			//   12   23:return          
			}

			private PrintAttributes mAttributes;
			Bitmap mBitmap;
			AsyncTask mLoadBitmap;
			final PrintHelper.PrintHelperApi19 this$0;
			final PrintHelper.OnPrintFinishCallback val$callback;
			final int val$fittingMode;
			final Uri val$imageFile;
			final String val$jobName;


/*
			static void access$300(_cls3 _pcls3)
			{
				_pcls3.cancelLoad();
			//    0    0:aload_0         
			//    1    1:invokespecial   #56  <Method void cancelLoad()>
				return;
			//    2    4:return          
			}

*/


/*
			static PrintAttributes access$500(_cls3 _pcls3)
			{
				return _pcls3.mAttributes;
			//    0    0:aload_0         
			//    1    1:getfield        #60  <Field PrintAttributes mAttributes>
			//    2    4:areturn         
			}

*/

			
			{
				this$0 = PrintHelper.PrintHelperApi19.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #37  <Field PrintHelper$PrintHelperApi19 this$0>
				jobName = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #39  <Field String val$jobName>
				imageFile = uri;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #41  <Field Uri val$imageFile>
				callback = onprintfinishcallback;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #43  <Field PrintHelper$OnPrintFinishCallback val$callback>
				fittingMode = i;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #45  <Field int val$fittingMode>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #48  <Method void PrintDocumentAdapter()>
				mBitmap = null;
			//   17   31:aload_0         
			//   18   32:aconst_null     
			//   19   33:putfield        #50  <Field Bitmap mBitmap>
			//   20   36:return          
			}
		}
));
	//    0    0:new             #15  <Class PrintHelper$PrintHelperApi19$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload_0         
	//    7    9:getfield        #51  <Field int mScaleMode>
	//    8   12:invokespecial   #332 <Method void PrintHelper$PrintHelperApi19$3(PrintHelper$PrintHelperApi19, String, Uri, PrintHelper$OnPrintFinishCallback, int)>
	//    9   15:astore_2        
		callback = ((back) ((PrintManager)mContext.getSystemService("print")));
	//   10   16:aload_0         
	//   11   17:getfield        #59  <Field Context mContext>
	//   12   20:ldc2            #307 <String "print">
	//   13   23:invokevirtual   #311 <Method Object Context.getSystemService(String)>
	//   14   26:checkcast       #313 <Class PrintManager>
	//   15   29:astore_3        
		builder = new android.print.PrintAttributes.Builder();
	//   16   30:new             #261 <Class android.print.PrintAttributes$Builder>
	//   17   33:dup             
	//   18   34:invokespecial   #270 <Method void android.print.PrintAttributes$Builder()>
	//   19   37:astore          4
		builder.setColorMode(mColorMode);
	//   20   39:aload           4
	//   21   41:aload_0         
	//   22   42:getfield        #53  <Field int mColorMode>
	//   23   45:invokevirtual   #299 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setColorMode(int)>
	//   24   48:pop             
		if(mOrientation != 1 && mOrientation != 0) goto _L2; else goto _L1
	//   25   49:aload_0         
	//   26   50:getfield        #302 <Field int mOrientation>
	//   27   53:iconst_1        
	//   28   54:icmpeq          64
	//   29   57:aload_0         
	//   30   58:getfield        #302 <Field int mOrientation>
	//   31   61:ifne            86
_L1:
		builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
	//   32   64:aload           4
	//   33   66:getstatic       #328 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_LANDSCAPE>
	//   34   69:invokevirtual   #280 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
	//   35   72:pop             
_L4:
		((PrintManager) (callback)).print(jobName, ((PrintDocumentAdapter) (imageFile)), builder.build());
	//   36   73:aload_3         
	//   37   74:aload_1         
	//   38   75:aload_2         
	//   39   76:aload           4
	//   40   78:invokevirtual   #269 <Method PrintAttributes android.print.PrintAttributes$Builder.build()>
	//   41   81:invokevirtual   #325 <Method android.print.PrintJob PrintManager.print(String, PrintDocumentAdapter, PrintAttributes)>
	//   42   84:pop             
		return;
	//   43   85:return          
_L2:
		if(mOrientation == 2)
	//*  44   86:aload_0         
	//*  45   87:getfield        #302 <Field int mOrientation>
	//*  46   90:iconst_2        
	//*  47   91:icmpne          73
			builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
	//   48   94:aload           4
	//   49   96:getstatic       #319 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_PORTRAIT>
	//   50   99:invokevirtual   #280 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
	//   51  102:pop             
		if(true) goto _L4; else goto _L3
	//   52  103:goto            73
_L3:
	}

	public void setColorMode(int i)
	{
		mColorMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field int mColorMode>
	//    3    5:return          
	}

	public void setOrientation(int i)
	{
		mOrientation = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #302 <Field int mOrientation>
	//    3    5:return          
	}

	public void setScaleMode(int i)
	{
		mScaleMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #51  <Field int mScaleMode>
	//    3    5:return          
	}

	private static final String LOG_TAG = "PrintHelperApi19";
	private static final int MAX_PRINT_SIZE = 3500;
	int mColorMode;
	final Context mContext;
	android.graphics.BitmapFactory.Options mDecodeOptions;
	protected boolean mIsMinMarginsHandlingCorrect;
	private final Object mLock = new Object();
	int mOrientation;
	protected boolean mPrintActivityRespectsOrientation;
	int mScaleMode;


/*
	static void access$000(PrintHelper$PrintHelperApi19 printhelper$printhelperapi19, PrintAttributes printattributes, int i, Bitmap bitmap, ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.ultCallback ultcallback)
	{
		printhelper$printhelperapi19.writeBitmap(printattributes, i, bitmap, parcelfiledescriptor, cancellationsignal, ultcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #66  <Method void writeBitmap(PrintAttributes, int, Bitmap, ParcelFileDescriptor, CancellationSignal, android.print.PrintDocumentAdapter$WriteResultCallback)>
		return;
	//    8   13:return          
	}

*/


/*
	static Bitmap access$100(PrintHelper$PrintHelperApi19 printhelper$printhelperapi19, Bitmap bitmap, int i)
	{
		return printhelper$printhelperapi19.convertBitmapForColorMode(bitmap, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #72  <Method Bitmap convertBitmapForColorMode(Bitmap, int)>
	//    4    6:areturn         
	}

*/


/*
	static Matrix access$200(PrintHelper$PrintHelperApi19 printhelper$printhelperapi19, int i, int j, RectF rectf, int k)
	{
		return printhelper$printhelperapi19.getMatrix(i, j, rectf, k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #78  <Method Matrix getMatrix(int, int, RectF, int)>
	//    6    9:areturn         
	}

*/


/*
	static Bitmap access$400(PrintHelper$PrintHelperApi19 printhelper$printhelperapi19, Uri uri)
		throws FileNotFoundException
	{
		return printhelper$printhelperapi19.loadConstrainedBitmap(uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #86  <Method Bitmap loadConstrainedBitmap(Uri)>
	//    3    5:areturn         
	}

*/


/*
	static boolean access$600(Bitmap bitmap)
	{
		return isPortrait(bitmap);
	//    0    0:aload_0         
	//    1    1:invokestatic    #92  <Method boolean isPortrait(Bitmap)>
	//    2    4:ireturn         
	}

*/


/*
	static Object access$700(PrintHelper$PrintHelperApi19 printhelper$printhelperapi19)
	{
		return printhelper$printhelperapi19.mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Object mLock>
	//    2    4:areturn         
	}

*/

	PrintHelper$PrintHelperApi19(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		mDecodeOptions = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #47  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
	//    5    9:aload_0         
	//    6   10:new             #4   <Class Object>
	//    7   13:dup             
	//    8   14:invokespecial   #45  <Method void Object()>
	//    9   17:putfield        #49  <Field Object mLock>
		mScaleMode = 2;
	//   10   20:aload_0         
	//   11   21:iconst_2        
	//   12   22:putfield        #51  <Field int mScaleMode>
		mColorMode = 2;
	//   13   25:aload_0         
	//   14   26:iconst_2        
	//   15   27:putfield        #53  <Field int mColorMode>
		mPrintActivityRespectsOrientation = true;
	//   16   30:aload_0         
	//   17   31:iconst_1        
	//   18   32:putfield        #55  <Field boolean mPrintActivityRespectsOrientation>
		mIsMinMarginsHandlingCorrect = true;
	//   19   35:aload_0         
	//   20   36:iconst_1        
	//   21   37:putfield        #57  <Field boolean mIsMinMarginsHandlingCorrect>
		mContext = context;
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:putfield        #59  <Field Context mContext>
	//   25   45:return          
	}
}
