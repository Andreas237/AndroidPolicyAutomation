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
	//    3    7:astore          7
		float f = rectf.width();
	//    4    9:aload_3         
	//    5   10:invokevirtual   #153 <Method float RectF.width()>
	//    6   13:fstore          5
		float f1 = i;
	//    7   15:iload_1         
	//    8   16:i2f             
	//    9   17:fstore          6
		f /= f1;
	//   10   19:fload           5
	//   11   21:fload           6
	//   12   23:fdiv            
	//   13   24:fstore          5
		if(k == 2)
	//*  14   26:iload           4
	//*  15   28:iconst_2        
	//*  16   29:icmpne          49
			f = Math.max(f, rectf.height() / (float)j);
	//   17   32:fload           5
	//   18   34:aload_3         
	//   19   35:invokevirtual   #156 <Method float RectF.height()>
	//   20   38:iload_2         
	//   21   39:i2f             
	//   22   40:fdiv            
	//   23   41:invokestatic    #162 <Method float Math.max(float, float)>
	//   24   44:fstore          5
		else
	//*  25   46:goto            63
			f = Math.min(f, rectf.height() / (float)j);
	//   26   49:fload           5
	//   27   51:aload_3         
	//   28   52:invokevirtual   #156 <Method float RectF.height()>
	//   29   55:iload_2         
	//   30   56:i2f             
	//   31   57:fdiv            
	//   32   58:invokestatic    #165 <Method float Math.min(float, float)>
	//   33   61:fstore          5
		matrix.postScale(f, f);
	//   34   63:aload           7
	//   35   65:fload           5
	//   36   67:fload           5
	//   37   69:invokevirtual   #169 <Method boolean Matrix.postScale(float, float)>
	//   38   72:pop             
		matrix.postTranslate((rectf.width() - f1 * f) / 2.0F, (rectf.height() - (float)j * f) / 2.0F);
	//   39   73:aload           7
	//   40   75:aload_3         
	//   41   76:invokevirtual   #153 <Method float RectF.width()>
	//   42   79:fload           6
	//   43   81:fload           5
	//   44   83:fmul            
	//   45   84:fsub            
	//   46   85:fconst_2        
	//   47   86:fdiv            
	//   48   87:aload_3         
	//   49   88:invokevirtual   #156 <Method float RectF.height()>
	//   50   91:iload_2         
	//   51   92:i2f             
	//   52   93:fload           5
	//   53   95:fmul            
	//   54   96:fsub            
	//   55   97:fconst_2        
	//   56   98:fdiv            
	//   57   99:invokevirtual   #172 <Method boolean Matrix.postTranslate(float, float)>
	//   58  102:pop             
		return matrix;
	//   59  103:aload           7
	//   60  105:areturn         
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
		Exception exception;
		if(uri == null || mContext == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          91
	//*   2    4:aload_0         
	//*   3    5:getfield        #59  <Field Context mContext>
	//*   4    8:ifnonnull       14
			break MISSING_BLOCK_LABEL_91;
	//    5   11:goto            91
		exception = null;
	//    6   14:aconst_null     
	//    7   15:astore_3        
		uri = ((Uri) (mContext.getContentResolver().openInputStream(uri)));
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field Context mContext>
	//   10   20:invokevirtual   #182 <Method ContentResolver Context.getContentResolver()>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #188 <Method InputStream ContentResolver.openInputStream(Uri)>
	//   13   27:astore_1        
		options = ((android.graphics.BitmapFactory.Options) (BitmapFactory.decodeStream(((InputStream) (uri)), ((android.graphics.Rect) (null)), options)));
	//   14   28:aload_1         
	//   15   29:aconst_null     
	//   16   30:aload_2         
	//   17   31:invokestatic    #194 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   18   34:astore_2        
		if(uri == null)
			break MISSING_BLOCK_LABEL_55;
	//   19   35:aload_1         
	//   20   36:ifnull          55
		((InputStream) (uri)).close();
	//   21   39:aload_1         
	//   22   40:invokevirtual   #199 <Method void InputStream.close()>
		return ((Bitmap) (options));
	//   23   43:aload_2         
	//   24   44:areturn         
		uri;
	//   25   45:astore_1        
		Log.w("PrintHelperApi19", "close fail ", ((Throwable) (uri)));
	//   26   46:ldc1            #25  <String "PrintHelperApi19">
	//   27   48:ldc1            #201 <String "close fail ">
	//   28   50:aload_1         
	//   29   51:invokestatic    #207 <Method int Log.w(String, String, Throwable)>
	//   30   54:pop             
		return ((Bitmap) (options));
	//   31   55:aload_2         
	//   32   56:areturn         
		exception;
	//   33   57:astore_3        
		options = ((android.graphics.BitmapFactory.Options) (uri));
	//   34   58:aload_1         
	//   35   59:astore_2        
		uri = ((Uri) (exception));
	//   36   60:aload_3         
	//   37   61:astore_1        
		break MISSING_BLOCK_LABEL_68;
	//   38   62:goto            68
		uri;
	//   39   65:astore_1        
		options = ((android.graphics.BitmapFactory.Options) (exception));
	//   40   66:aload_3         
	//   41   67:astore_2        
		if(options != null)
	//*  42   68:aload_2         
	//*  43   69:ifnull          89
			try
			{
				((InputStream) (options)).close();
	//   44   72:aload_2         
	//   45   73:invokevirtual   #199 <Method void InputStream.close()>
			}
	//*  46   76:goto            89
			// Misplaced declaration of an exception variable
			catch(android.graphics.BitmapFactory.Options options)
	//*  47   79:astore_2        
			{
				Log.w("PrintHelperApi19", "close fail ", ((Throwable) (options)));
	//   48   80:ldc1            #25  <String "PrintHelperApi19">
	//   49   82:ldc1            #201 <String "close fail ">
	//   50   84:aload_2         
	//   51   85:invokestatic    #207 <Method int Log.w(String, String, Throwable)>
	//   52   88:pop             
			}
		throw uri;
	//   53   89:aload_1         
	//   54   90:athrow          
		throw new IllegalArgumentException("bad argument to loadBitmap");
	//   55   91:new             #209 <Class IllegalArgumentException>
	//   56   94:dup             
	//   57   95:ldc1            #211 <String "bad argument to loadBitmap">
	//   58   97:invokespecial   #214 <Method void IllegalArgumentException(String)>
	//   59  100:athrow          
	}

	private Bitmap loadConstrainedBitmap(Uri uri)
		throws FileNotFoundException
	{
		android.graphics.BitmapFactory.Options options1;
		if(uri == null || mContext == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          223
	//*   2    4:aload_0         
	//*   3    5:getfield        #59  <Field Context mContext>
	//*   4    8:ifnonnull       14
			break MISSING_BLOCK_LABEL_223;
	//    5   11:goto            223
		android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
	//    6   14:new             #216 <Class android.graphics.BitmapFactory$Options>
	//    7   17:dup             
	//    8   18:invokespecial   #217 <Method void android.graphics.BitmapFactory$Options()>
	//    9   21:astore          6
		options.inJustDecodeBounds = true;
	//   10   23:aload           6
	//   11   25:iconst_1        
	//   12   26:putfield        #220 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		loadBitmap(uri, options);
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:aload           6
	//   16   33:invokespecial   #222 <Method Bitmap loadBitmap(Uri, android.graphics.BitmapFactory$Options)>
	//   17   36:pop             
		int k = options.outWidth;
	//   18   37:aload           6
	//   19   39:getfield        #225 <Field int android.graphics.BitmapFactory$Options.outWidth>
	//   20   42:istore          4
		int l = options.outHeight;
	//   21   44:aload           6
	//   22   46:getfield        #228 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//   23   49:istore          5
		if(k <= 0)
			break MISSING_BLOCK_LABEL_221;
	//   24   51:iload           4
	//   25   53:ifle            221
		if(l <= 0)
	//*  26   56:iload           5
	//*  27   58:ifgt            63
			return null;
	//   28   61:aconst_null     
	//   29   62:areturn         
		int j = Math.max(k, l);
	//   30   63:iload           4
	//   31   65:iload           5
	//   32   67:invokestatic    #231 <Method int Math.max(int, int)>
	//   33   70:istore_3        
		int i;
		for(i = 1; j > 3500; i <<= 1)
	//*  34   71:iconst_1        
	//*  35   72:istore_2        
	//*  36   73:iload_3         
	//*  37   74:sipush          3500
	//*  38   77:icmple          91
			j >>>= 1;
	//   39   80:iload_3         
	//   40   81:iconst_1        
	//   41   82:iushr           
	//   42   83:istore_3        

	//   43   84:iload_2         
	//   44   85:iconst_1        
	//   45   86:ishl            
	//   46   87:istore_2        
	//*  47   88:goto            73
		if(i <= 0)
			break MISSING_BLOCK_LABEL_219;
	//   48   91:iload_2         
	//   49   92:ifle            219
		if(Math.min(k, l) / i <= 0)
	//*  50   95:iload           4
	//*  51   97:iload           5
	//*  52   99:invokestatic    #233 <Method int Math.min(int, int)>
	//*  53  102:iload_2         
	//*  54  103:idiv            
	//*  55  104:ifgt            109
			return null;
	//   56  107:aconst_null     
	//   57  108:areturn         
		synchronized(mLock)
	//*  58  109:aload_0         
	//*  59  110:getfield        #49  <Field Object mLock>
	//*  60  113:astore          6
	//*  61  115:aload           6
	//*  62  117:monitorenter    
		{
			mDecodeOptions = new android.graphics.BitmapFactory.Options();
	//   63  118:aload_0         
	//   64  119:new             #216 <Class android.graphics.BitmapFactory$Options>
	//   65  122:dup             
	//   66  123:invokespecial   #217 <Method void android.graphics.BitmapFactory$Options()>
	//   67  126:putfield        #47  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
			mDecodeOptions.inMutable = true;
	//   68  129:aload_0         
	//   69  130:getfield        #47  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
	//   70  133:iconst_1        
	//   71  134:putfield        #236 <Field boolean android.graphics.BitmapFactory$Options.inMutable>
			mDecodeOptions.inSampleSize = i;
	//   72  137:aload_0         
	//   73  138:getfield        #47  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
	//   74  141:iload_2         
	//   75  142:putfield        #239 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
			options1 = mDecodeOptions;
	//   76  145:aload_0         
	//   77  146:getfield        #47  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
	//   78  149:astore          7
		}
	//   79  151:aload           6
	//   80  153:monitorexit     
		obj = ((Object) (loadBitmap(uri, options1)));
	//   81  154:aload_0         
	//   82  155:aload_1         
	//   83  156:aload           7
	//   84  158:invokespecial   #222 <Method Bitmap loadBitmap(Uri, android.graphics.BitmapFactory$Options)>
	//   85  161:astore          6
		synchronized(mLock)
	//*  86  163:aload_0         
	//*  87  164:getfield        #49  <Field Object mLock>
	//*  88  167:astore_1        
	//*  89  168:aload_1         
	//*  90  169:monitorenter    
		{
			mDecodeOptions = null;
	//   91  170:aload_0         
	//   92  171:aconst_null     
	//   93  172:putfield        #47  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
		}
	//   94  175:aload_1         
	//   95  176:monitorexit     
		return ((Bitmap) (obj));
	//   96  177:aload           6
	//   97  179:areturn         
		obj;
	//   98  180:astore          6
		uri;
	//   99  182:aload_1         
		JVM INSTR monitorexit ;
	//  100  183:monitorexit     
		throw obj;
	//  101  184:aload           6
	//  102  186:athrow          
		obj;
	//  103  187:astore          6
		synchronized(mLock)
	//* 104  189:aload_0         
	//* 105  190:getfield        #49  <Field Object mLock>
	//* 106  193:astore_1        
	//* 107  194:aload_1         
	//* 108  195:monitorenter    
		{
			mDecodeOptions = null;
	//  109  196:aload_0         
	//  110  197:aconst_null     
	//  111  198:putfield        #47  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
		}
	//  112  201:aload_1         
	//  113  202:monitorexit     
		throw obj;
	//  114  203:aload           6
	//  115  205:athrow          
		obj;
	//  116  206:astore          6
		uri;
	//  117  208:aload_1         
		JVM INSTR monitorexit ;
	//  118  209:monitorexit     
		throw obj;
	//  119  210:aload           6
	//  120  212:athrow          
		uri;
	//  121  213:astore_1        
		obj;
	//  122  214:aload           6
		JVM INSTR monitorexit ;
	//  123  216:monitorexit     
		throw uri;
	//  124  217:aload_1         
	//  125  218:athrow          
		return null;
	//  126  219:aconst_null     
	//  127  220:areturn         
		return null;
	//  128  221:aconst_null     
	//  129  222:areturn         
		throw new IllegalArgumentException("bad argument to getScaledBitmap");
	//  130  223:new             #209 <Class IllegalArgumentException>
	//  131  226:dup             
	//  132  227:ldc1            #241 <String "bad argument to getScaledBitmap">
	//  133  229:invokespecial   #214 <Method void IllegalArgumentException(String)>
	//  134  232:athrow          
	}

	private void writeBitmap(final PrintAttributes attributes, final int fittingMode, final Bitmap bitmap, final ParcelFileDescriptor fileDescriptor, final CancellationSignal cancellationSignal, final android.print.ultCallback writeResultCallback)
	{
		final PrintAttributes pdfAttributes;
		if(mIsMinMarginsHandlingCorrect)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field boolean mIsMinMarginsHandlingCorrect>
	//*   2    4:ifeq            13
			pdfAttributes = attributes;
	//    3    7:aload_1         
	//    4    8:astore          7
		else
	//*   5   10:goto            37
			pdfAttributes = copyAttributes(attributes).setMinMargins(new android.print.PrintAttributes.Margins(0, 0, 0, 0)).build();
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #245 <Method android.print.PrintAttributes$Builder copyAttributes(PrintAttributes)>
	//    9   18:new             #247 <Class android.print.PrintAttributes$Margins>
	//   10   21:dup             
	//   11   22:iconst_0        
	//   12   23:iconst_0        
	//   13   24:iconst_0        
	//   14   25:iconst_0        
	//   15   26:invokespecial   #250 <Method void android.print.PrintAttributes$Margins(int, int, int, int)>
	//   16   29:invokevirtual   #256 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMinMargins(android.print.PrintAttributes$Margins)>
	//   17   32:invokevirtual   #260 <Method PrintAttributes android.print.PrintAttributes$Builder.build()>
	//   18   35:astore          7
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
				if(cancellationSignal.isCanceled())
			//*   0    0:aload_0         
			//*   1    1:getfield        #34  <Field CancellationSignal val$cancellationSignal>
			//*   2    4:invokevirtual   #67  <Method boolean CancellationSignal.isCanceled()>
			//*   3    7:ifeq            12
					return null;
			//    4   10:aconst_null     
			//    5   11:areturn         
				boolean flag;
				Bitmap bitmap1;
				Object obj;
				android.graphics.pdf.PdfDocument.Page page;
				Object obj1;
				android.graphics.pdf.PdfDocument.Page page1;
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
			//*  29   60:ifeq            65
			//*  30   63:aconst_null     
			//*  31   64:areturn         
			//*  32   65:aload           4
			//*  33   67:iconst_1        
			//*  34   68:invokevirtual   #90  <Method android.graphics.pdf.PdfDocument$Page PrintedPdfDocument.startPage(int)>
			//*  35   71:astore          5
			//*  36   73:aload_0         
			//*  37   74:getfield        #32  <Field PrintHelper$PrintHelperApi19 this$0>
			//*  38   77:getfield        #94  <Field boolean PrintHelper$PrintHelperApi19.mIsMinMarginsHandlingCorrect>
			//*  39   80:ifeq            102
			//*  40   83:new             #96  <Class RectF>
			//*  41   86:dup             
			//*  42   87:aload           5
			//*  43   89:invokevirtual   #102 <Method android.graphics.pdf.PdfDocument$PageInfo android.graphics.pdf.PdfDocument$Page.getInfo()>
			//*  44   92:invokevirtual   #108 <Method android.graphics.Rect android.graphics.pdf.PdfDocument$PageInfo.getContentRect()>
			//*  45   95:invokespecial   #111 <Method void RectF(android.graphics.Rect)>
			//*  46   98:astore_1        
			//*  47   99:goto            158
			//*  48  102:new             #69  <Class PrintedPdfDocument>
			//*  49  105:dup             
			//*  50  106:aload_0         
			//*  51  107:getfield        #32  <Field PrintHelper$PrintHelperApi19 this$0>
			//*  52  110:getfield        #73  <Field Context PrintHelper$PrintHelperApi19.mContext>
			//*  53  113:aload_0         
			//*  54  114:getfield        #40  <Field PrintAttributes val$attributes>
			//*  55  117:invokespecial   #76  <Method void PrintedPdfDocument(Context, PrintAttributes)>
			//*  56  120:astore          6
			//*  57  122:aload           6
			//*  58  124:iconst_1        
			//*  59  125:invokevirtual   #90  <Method android.graphics.pdf.PdfDocument$Page PrintedPdfDocument.startPage(int)>
			//*  60  128:astore          7
			//*  61  130:new             #96  <Class RectF>
			//*  62  133:dup             
			//*  63  134:aload           7
			//*  64  136:invokevirtual   #102 <Method android.graphics.pdf.PdfDocument$PageInfo android.graphics.pdf.PdfDocument$Page.getInfo()>
			//*  65  139:invokevirtual   #108 <Method android.graphics.Rect android.graphics.pdf.PdfDocument$PageInfo.getContentRect()>
			//*  66  142:invokespecial   #111 <Method void RectF(android.graphics.Rect)>
			//*  67  145:astore_1        
			//*  68  146:aload           6
			//*  69  148:aload           7
			//*  70  150:invokevirtual   #115 <Method void PrintedPdfDocument.finishPage(android.graphics.pdf.PdfDocument$Page)>
			//*  71  153:aload           6
			//*  72  155:invokevirtual   #118 <Method void PrintedPdfDocument.close()>
			//*  73  158:aload_0         
			//*  74  159:getfield        #32  <Field PrintHelper$PrintHelperApi19 this$0>
			//*  75  162:aload_3         
			//*  76  163:invokevirtual   #123 <Method int Bitmap.getWidth()>
			//*  77  166:aload_3         
			//*  78  167:invokevirtual   #126 <Method int Bitmap.getHeight()>
			//*  79  170:aload_1         
			//*  80  171:aload_0         
			//*  81  172:getfield        #42  <Field int val$fittingMode>
			//*  82  175:invokestatic    #130 <Method Matrix PrintHelper$PrintHelperApi19.access$200(PrintHelper$PrintHelperApi19, int, int, RectF, int)>
			//*  83  178:astore          6
			//*  84  180:aload_0         
			//*  85  181:getfield        #32  <Field PrintHelper$PrintHelperApi19 this$0>
			//*  86  184:getfield        #94  <Field boolean PrintHelper$PrintHelperApi19.mIsMinMarginsHandlingCorrect>
			//*  87  187:ifeq            193
			//*  88  190:goto            217
			//*  89  193:aload           6
			//*  90  195:aload_1         
			//*  91  196:getfield        #134 <Field float RectF.left>
			//*  92  199:aload_1         
			//*  93  200:getfield        #137 <Field float RectF.top>
			//*  94  203:invokevirtual   #143 <Method boolean Matrix.postTranslate(float, float)>
			//*  95  206:pop             
			//*  96  207:aload           5
			//*  97  209:invokevirtual   #147 <Method Canvas android.graphics.pdf.PdfDocument$Page.getCanvas()>
			//*  98  212:aload_1         
			//*  99  213:invokevirtual   #153 <Method boolean Canvas.clipRect(RectF)>
			//* 100  216:pop             
			//* 101  217:aload           5
			//* 102  219:invokevirtual   #147 <Method Canvas android.graphics.pdf.PdfDocument$Page.getCanvas()>
			//* 103  222:aload_3         
			//* 104  223:aload           6
			//* 105  225:aconst_null     
			//* 106  226:invokevirtual   #157 <Method void Canvas.drawBitmap(Bitmap, Matrix, Paint)>
			//* 107  229:aload           4
			//* 108  231:aload           5
			//* 109  233:invokevirtual   #115 <Method void PrintedPdfDocument.finishPage(android.graphics.pdf.PdfDocument$Page)>
			//* 110  236:aload_0         
			//* 111  237:getfield        #34  <Field CancellationSignal val$cancellationSignal>
			//* 112  240:invokevirtual   #67  <Method boolean CancellationSignal.isCanceled()>
			//* 113  243:istore_2        
			//* 114  244:iload_2         
			//* 115  245:ifeq            283
			//* 116  248:aload           4
			//* 117  250:invokevirtual   #118 <Method void PrintedPdfDocument.close()>
			//* 118  253:aload_0         
			//* 119  254:getfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 120  257:astore_1        
			//* 121  258:aload_1         
			//* 122  259:ifnull          269
			//* 123  262:aload_0         
			//* 124  263:getfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 125  266:invokevirtual   #160 <Method void ParcelFileDescriptor.close()>
			//* 126  269:aload_3         
			//* 127  270:aload_0         
			//* 128  271:getfield        #38  <Field Bitmap val$bitmap>
			//* 129  274:if_acmpeq       281
			//* 130  277:aload_3         
			//* 131  278:invokevirtual   #163 <Method void Bitmap.recycle()>
			//* 132  281:aconst_null     
			//* 133  282:areturn         
			//* 134  283:aload           4
			//* 135  285:new             #165 <Class FileOutputStream>
			//* 136  288:dup             
			//* 137  289:aload_0         
			//* 138  290:getfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 139  293:invokevirtual   #169 <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
			//* 140  296:invokespecial   #172 <Method void FileOutputStream(java.io.FileDescriptor)>
			//* 141  299:invokevirtual   #176 <Method void PrintedPdfDocument.writeTo(java.io.OutputStream)>
			//* 142  302:aload           4
			//* 143  304:invokevirtual   #118 <Method void PrintedPdfDocument.close()>
			//* 144  307:aload_0         
			//* 145  308:getfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 146  311:astore_1        
			//* 147  312:aload_1         
			//* 148  313:ifnull          323
			//* 149  316:aload_0         
			//* 150  317:getfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 151  320:invokevirtual   #160 <Method void ParcelFileDescriptor.close()>
			//* 152  323:aload_3         
			//* 153  324:aload_0         
			//* 154  325:getfield        #38  <Field Bitmap val$bitmap>
			//* 155  328:if_acmpeq       391
			//* 156  331:aload_3         
			//* 157  332:invokevirtual   #163 <Method void Bitmap.recycle()>
			//* 158  335:aconst_null     
			//* 159  336:areturn         
			//* 160  337:astore_1        
			//* 161  338:aload           4
			//* 162  340:invokevirtual   #118 <Method void PrintedPdfDocument.close()>
			//* 163  343:aload_0         
			//* 164  344:getfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 165  347:astore          4
			//* 166  349:aload           4
			//* 167  351:ifnull          361
			//* 168  354:aload_0         
			//* 169  355:getfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 170  358:invokevirtual   #160 <Method void ParcelFileDescriptor.close()>
			//* 171  361:aload_3         
			//* 172  362:aload_0         
			//* 173  363:getfield        #38  <Field Bitmap val$bitmap>
			//* 174  366:if_acmpeq       373
			//* 175  369:aload_3         
			//* 176  370:invokevirtual   #163 <Method void Bitmap.recycle()>
			//* 177  373:aload_1         
			//* 178  374:athrow          
				// Misplaced declaration of an exception variable
				catch(Void avoid[])
			//* 179  375:astore_1        
				{
					return ((Throwable) (avoid));
			//  180  376:aload_1         
			//  181  377:areturn         
				}
				if(flag)
					return null;
				page = ((PrintedPdfDocument) (obj)).startPage(1);
				if(mIsMinMarginsHandlingCorrect)
				{
					avoid = ((Void []) (new RectF(page.getInfo().getContentRect())));
					break MISSING_BLOCK_LABEL_158;
				}
				obj1 = ((Object) (new PrintedPdfDocument(mContext, attributes)));
				page1 = ((PrintedPdfDocument) (obj1)).startPage(1);
				avoid = ((Void []) (new RectF(page1.getInfo().getContentRect())));
				((PrintedPdfDocument) (obj1)).finishPage(page1);
				((PrintedPdfDocument) (obj1)).close();
				obj1 = ((Object) (getMatrix(bitmap1.getWidth(), bitmap1.getHeight(), ((RectF) (avoid)), fittingMode)));
				if(mIsMinMarginsHandlingCorrect)
					break MISSING_BLOCK_LABEL_217;
				((Matrix) (obj1)).postTranslate(((RectF) (avoid)).left, ((RectF) (avoid)).top);
				page.getCanvas().clipRect(((RectF) (avoid)));
				page.getCanvas().drawBitmap(bitmap1, ((Matrix) (obj1)), ((Paint) (null)));
				((PrintedPdfDocument) (obj)).finishPage(page);
				flag = cancellationSignal.isCanceled();
				if(!flag)
					break MISSING_BLOCK_LABEL_283;
				((PrintedPdfDocument) (obj)).close();
				avoid = ((Void []) (fileDescriptor));
				if(avoid == null)
					break MISSING_BLOCK_LABEL_269;
				try
				{
					fileDescriptor.close();
				}
				// Misplaced declaration of an exception variable
				catch(Void avoid[]) { }
			//  182  378:astore_1        
				if(bitmap1 != bitmap)
					bitmap1.recycle();
				return null;
				((PrintedPdfDocument) (obj)).writeTo(((java.io.OutputStream) (new FileOutputStream(fileDescriptor.getFileDescriptor()))));
				((PrintedPdfDocument) (obj)).close();
				avoid = ((Void []) (fileDescriptor));
				if(avoid == null)
					break MISSING_BLOCK_LABEL_323;
				try
				{
					fileDescriptor.close();
				}
			//* 183  379:goto            269
				// Misplaced declaration of an exception variable
				catch(Void avoid[]) { }
			//  184  382:astore_1        
				if(bitmap1 == bitmap)
					break MISSING_BLOCK_LABEL_391;
				bitmap1.recycle();
				return null;
				avoid;
				((PrintedPdfDocument) (obj)).close();
				obj = ((Object) (fileDescriptor));
				if(obj == null)
					break MISSING_BLOCK_LABEL_361;
				try
				{
					fileDescriptor.close();
				}
			//* 185  383:goto            323
				catch(IOException ioexception) { }
			//  186  386:astore          4
				if(bitmap1 != bitmap)
					bitmap1.recycle();
				throw avoid;
			//* 187  388:goto            361
				return null;
			//  188  391:aconst_null     
			//  189  392:areturn         
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
	//   19   37:new             #13  <Class PrintHelper$PrintHelperApi19$2>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:aload           5
	//   23   44:aload           7
	//   24   46:aload_3         
	//   25   47:aload_1         
	//   26   48:iload_2         
	//   27   49:aload           4
	//   28   51:aload           6
	//   29   53:invokespecial   #263 <Method void PrintHelper$PrintHelperApi19$2(PrintHelper$PrintHelperApi19, CancellationSignal, PrintAttributes, Bitmap, PrintAttributes, int, ParcelFileDescriptor, android.print.PrintDocumentAdapter$WriteResultCallback)>
	//   30   56:iconst_0        
	//   31   57:anewarray       Void[]
	//   32   60:invokevirtual   #269 <Method AsyncTask PrintHelper$PrintHelperApi19$2.execute(Object[])>
	//   33   63:pop             
	//   34   64:return          
	}

	protected android.print.PrintAttributes.Builder copyAttributes(PrintAttributes printattributes)
	{
		android.print.PrintAttributes.Builder builder = (new android.print.PrintAttributes.Builder()).setMediaSize(printattributes.getMediaSize()).setResolution(printattributes.getResolution()).setMinMargins(printattributes.getMinMargins());
	//    0    0:new             #252 <Class android.print.PrintAttributes$Builder>
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
	//   11   25:invokevirtual   #256 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMinMargins(android.print.PrintAttributes$Margins)>
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
	//*  14   30:ifeq            41
			obj = ((Object) (android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT));
	//   15   33:getstatic       #319 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_PORTRAIT>
	//   16   36:astore          5
		else
	//*  17   38:goto            46
			obj = ((Object) (android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE));
	//   18   41:getstatic       #322 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_LANDSCAPE>
	//   19   44:astore          5
		obj = ((Object) ((new android.print.PrintAttributes.Builder()).setMediaSize(((android.print.PrintAttributes.MediaSize) (obj))).setColorMode(mColorMode).build()));
	//   20   46:new             #252 <Class android.print.PrintAttributes$Builder>
	//   21   49:dup             
	//   22   50:invokespecial   #270 <Method void android.print.PrintAttributes$Builder()>
	//   23   53:aload           5
	//   24   55:invokevirtual   #280 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
	//   25   58:aload_0         
	//   26   59:getfield        #53  <Field int mColorMode>
	//   27   62:invokevirtual   #299 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setColorMode(int)>
	//   28   65:invokevirtual   #260 <Method PrintAttributes android.print.PrintAttributes$Builder.build()>
	//   29   68:astore          5
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
				mAttributes = printattributes1;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #49  <Field PrintAttributes mAttributes>
				layoutresultcallback.onLayoutFinished((new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build(), printattributes1.equals(((Object) (printattributes))) ^ true);
			//    3    5:aload           4
			//    4    7:new             #51  <Class android.print.PrintDocumentInfo$Builder>
			//    5   10:dup             
			//    6   11:aload_0         
			//    7   12:getfield        #30  <Field String val$jobName>
			//    8   15:invokespecial   #54  <Method void android.print.PrintDocumentInfo$Builder(String)>
			//    9   18:iconst_1        
			//   10   19:invokevirtual   #58  <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
			//   11   22:iconst_1        
			//   12   23:invokevirtual   #61  <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
			//   13   26:invokevirtual   #65  <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
			//   14   29:aload_2         
			//   15   30:aload_1         
			//   16   31:invokevirtual   #71  <Method boolean PrintAttributes.equals(Object)>
			//   17   34:iconst_1        
			//   18   35:ixor            
			//   19   36:invokevirtual   #77  <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
			//   20   39:return          
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
	//   30   70:aload           6
	//   31   72:aload_1         
	//   32   73:new             #11  <Class PrintHelper$PrintHelperApi19$1>
	//   33   76:dup             
	//   34   77:aload_0         
	//   35   78:aload_1         
	//   36   79:iload           4
	//   37   81:aload_2         
	//   38   82:aload_3         
	//   39   83:invokespecial   #325 <Method void PrintHelper$PrintHelperApi19$1(PrintHelper$PrintHelperApi19, String, int, Bitmap, PrintHelper$OnPrintFinishCallback)>
	//   40   86:aload           5
	//   41   88:invokevirtual   #328 <Method android.print.PrintJob PrintManager.print(String, PrintDocumentAdapter, PrintAttributes)>
	//   42   91:pop             
	//   43   92:return          
	}

	public void printBitmap(final String jobName, final Uri imageFile, final back callback)
		throws FileNotFoundException
	{
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
				this;
			//    0    0:aload_0         
				JVM INSTR monitorenter ;
			//    1    1:monitorenter    
				mAttributes = newPrintAttributes;
			//    2    2:aload_0         
			//    3    3:aload_2         
			//    4    4:putfield        #60  <Field PrintAttributes mAttributes>
				this;
			//    5    7:aload_0         
				JVM INSTR monitorexit ;
			//    6    8:monitorexit     
				if(cancellationSignal.isCanceled())
			//*   7    9:aload_3         
			//*   8   10:invokevirtual   #100 <Method boolean CancellationSignal.isCanceled()>
			//*   9   13:ifeq            22
				{
					layoutresultcallback.onLayoutCancelled();
			//   10   16:aload           4
			//   11   18:invokevirtual   #105 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutCancelled()>
					return;
			//   12   21:return          
				}
				if(mBitmap != null)
			//*  13   22:aload_0         
			//*  14   23:getfield        #50  <Field Bitmap mBitmap>
			//*  15   26:ifnull          64
				{
					layoutresultcallback.onLayoutFinished((new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build(), newPrintAttributes.equals(((Object) (oldPrintAttributes))) ^ true);
			//   16   29:aload           4
			//   17   31:new             #107 <Class android.print.PrintDocumentInfo$Builder>
			//   18   34:dup             
			//   19   35:aload_0         
			//   20   36:getfield        #39  <Field String val$jobName>
			//   21   39:invokespecial   #110 <Method void android.print.PrintDocumentInfo$Builder(String)>
			//   22   42:iconst_1        
			//   23   43:invokevirtual   #114 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
			//   24   46:iconst_1        
			//   25   47:invokevirtual   #117 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
			//   26   50:invokevirtual   #121 <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
			//   27   53:aload_2         
			//   28   54:aload_1         
			//   29   55:invokevirtual   #127 <Method boolean PrintAttributes.equals(Object)>
			//   30   58:iconst_1        
			//   31   59:ixor            
			//   32   60:invokevirtual   #131 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
					return;
			//   33   63:return          
				} else
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
						//*  10   20:aconst_null     
						//*  11   21:areturn         
							// Misplaced declaration of an exception variable
							catch(Uri auri[])
							{
								return null;
							}
							return ((Bitmap) (auri));
						//*  12   22:astore_1        
						//*  13   23:goto            20
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
								break MISSING_BLOCK_LABEL_116;
						//    5    7:aload_1         
						//    6    8:ifnull          116
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
									break MISSING_BLOCK_LABEL_116;
						//   14   26:aload_0         
						//   15   27:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
						//   16   30:getfield        #50  <Field PrintHelper$PrintHelperApi19 PrintHelper$PrintHelperApi19$3.this$0>
						//   17   33:getfield        #90  <Field int PrintHelper$PrintHelperApi19.mOrientation>
						//   18   36:ifne            116
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
						//*  31   59:ifnull          116
							{
								obj = ((Object) (bitmap));
						//   32   62:aload_1         
						//   33   63:astore_3        
								if(mediasize.isPortrait() != PrintHelper.PrintHelperApi19.isPortrait(bitmap))
						//*  34   64:aload           4
						//*  35   66:invokevirtual   #106 <Method boolean android.print.PrintAttributes$MediaSize.isPortrait()>
						//*  36   69:aload_1         
						//*  37   70:invokestatic    #110 <Method boolean PrintHelper$PrintHelperApi19.access$600(Bitmap)>
						//*  38   73:icmpeq          116
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
							break MISSING_BLOCK_LABEL_116;
						//   58  108:goto            116
							bitmap;
						//   59  111:astore_1        
							this;
						//   60  112:aload_0         
							JVM INSTR monitorexit ;
						//   61  113:monitorexit     
							throw bitmap;
						//   62  114:aload_1         
						//   63  115:athrow          
							mBitmap = ((Bitmap) (obj));
						//   64  116:aload_0         
						//   65  117:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
						//   66  120:aload_3         
						//   67  121:putfield        #133 <Field Bitmap PrintHelper$PrintHelperApi19$3.mBitmap>
							if(obj != null)
						//*  68  124:aload_3         
						//*  69  125:ifnull          180
							{
								bitmap = ((Bitmap) ((new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build()));
						//   70  128:new             #135 <Class android.print.PrintDocumentInfo$Builder>
						//   71  131:dup             
						//   72  132:aload_0         
						//   73  133:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
						//   74  136:getfield        #139 <Field String PrintHelper$PrintHelperApi19$3.val$jobName>
						//   75  139:invokespecial   #142 <Method void android.print.PrintDocumentInfo$Builder(String)>
						//   76  142:iconst_1        
						//   77  143:invokevirtual   #146 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
						//   78  146:iconst_1        
						//   79  147:invokevirtual   #149 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
						//   80  150:invokevirtual   #153 <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
						//   81  153:astore_1        
								boolean flag = newPrintAttributes.equals(((Object) (oldPrintAttributes)));
						//   82  154:aload_0         
						//   83  155:getfield        #34  <Field PrintAttributes val$newPrintAttributes>
						//   84  158:aload_0         
						//   85  159:getfield        #36  <Field PrintAttributes val$oldPrintAttributes>
						//   86  162:invokevirtual   #157 <Method boolean PrintAttributes.equals(Object)>
						//   87  165:istore_2        
								layoutResultCallback.onLayoutFinished(((android.print.PrintDocumentInfo) (bitmap)), true ^ flag);
						//   88  166:aload_0         
						//   89  167:getfield        #38  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
						//   90  170:aload_1         
						//   91  171:iconst_1        
						//   92  172:iload_2         
						//   93  173:ixor            
						//   94  174:invokevirtual   #161 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
							} else
						//*  95  177:goto            188
							{
								layoutResultCallback.onLayoutFailed(((CharSequence) (null)));
						//   96  180:aload_0         
						//   97  181:getfield        #38  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
						//   98  184:aconst_null     
						//   99  185:invokevirtual   #165 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFailed(CharSequence)>
							}
							mLoadBitmap = null;
						//  100  188:aload_0         
						//  101  189:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
						//  102  192:aconst_null     
						//  103  193:putfield        #74  <Field AsyncTask PrintHelper$PrintHelperApi19$3.mLoadBitmap>
							return;
						//  104  196:return          
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
			//   34   64:aload_0         
			//   35   65:new             #14  <Class PrintHelper$PrintHelperApi19$3$1>
			//   36   68:dup             
			//   37   69:aload_0         
			//   38   70:aload_3         
			//   39   71:aload_2         
			//   40   72:aload_1         
			//   41   73:aload           4
			//   42   75:invokespecial   #134 <Method void PrintHelper$PrintHelperApi19$3$1(PrintHelper$PrintHelperApi19$3, CancellationSignal, PrintAttributes, PrintAttributes, android.print.PrintDocumentAdapter$LayoutResultCallback)>
			//   43   78:iconst_0        
			//   44   79:anewarray       Uri[]
			//   45   82:invokevirtual   #140 <Method AsyncTask PrintHelper$PrintHelperApi19$3$1.execute(Object[])>
			//   46   85:putfield        #78  <Field AsyncTask mLoadBitmap>
					return;
			//   47   88:return          
				}
				oldPrintAttributes;
			//   48   89:astore_1        
				this;
			//   49   90:aload_0         
				JVM INSTR monitorexit ;
			//   50   91:monitorexit     
				throw oldPrintAttributes;
			//   51   92:aload_1         
			//   52   93:athrow          
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
		android.print.PrintAttributes.Builder builder = new android.print.PrintAttributes.Builder();
	//   16   30:new             #252 <Class android.print.PrintAttributes$Builder>
	//   17   33:dup             
	//   18   34:invokespecial   #270 <Method void android.print.PrintAttributes$Builder()>
	//   19   37:astore          4
		builder.setColorMode(mColorMode);
	//   20   39:aload           4
	//   21   41:aload_0         
	//   22   42:getfield        #53  <Field int mColorMode>
	//   23   45:invokevirtual   #299 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setColorMode(int)>
	//   24   48:pop             
		if(mOrientation != 1 && mOrientation != 0)
	//*  25   49:aload_0         
	//*  26   50:getfield        #302 <Field int mOrientation>
	//*  27   53:iconst_1        
	//*  28   54:icmpeq          87
	//*  29   57:aload_0         
	//*  30   58:getfield        #302 <Field int mOrientation>
	//*  31   61:ifne            67
	//*  32   64:goto            87
		{
			if(mOrientation == 2)
	//*  33   67:aload_0         
	//*  34   68:getfield        #302 <Field int mOrientation>
	//*  35   71:iconst_2        
	//*  36   72:icmpne          96
				builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
	//   37   75:aload           4
	//   38   77:getstatic       #319 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_PORTRAIT>
	//   39   80:invokevirtual   #280 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
	//   40   83:pop             
		} else
	//*  41   84:goto            96
		{
			builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
	//   42   87:aload           4
	//   43   89:getstatic       #322 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_LANDSCAPE>
	//   44   92:invokevirtual   #280 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
	//   45   95:pop             
		}
		((PrintManager) (callback)).print(jobName, ((PrintDocumentAdapter) (imageFile)), builder.build());
	//   46   96:aload_3         
	//   47   97:aload_1         
	//   48   98:aload_2         
	//   49   99:aload           4
	//   50  101:invokevirtual   #260 <Method PrintAttributes android.print.PrintAttributes$Builder.build()>
	//   51  104:invokevirtual   #328 <Method android.print.PrintJob PrintManager.print(String, PrintDocumentAdapter, PrintAttributes)>
	//   52  107:pop             
	//   53  108:return          
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
