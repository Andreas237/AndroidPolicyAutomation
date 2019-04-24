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

class PrintHelperKitkat
{
	public static interface OnPrintFinishCallback
	{

		public abstract void onFinish();
	}


	PrintHelperKitkat(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		mDecodeOptions = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #54  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
	//    5    9:aload_0         
	//    6   10:new             #4   <Class Object>
	//    7   13:dup             
	//    8   14:invokespecial   #52  <Method void Object()>
	//    9   17:putfield        #56  <Field Object mLock>
		mScaleMode = 2;
	//   10   20:aload_0         
	//   11   21:iconst_2        
	//   12   22:putfield        #58  <Field int mScaleMode>
		mColorMode = 2;
	//   13   25:aload_0         
	//   14   26:iconst_2        
	//   15   27:putfield        #60  <Field int mColorMode>
		mPrintActivityRespectsOrientation = true;
	//   16   30:aload_0         
	//   17   31:iconst_1        
	//   18   32:putfield        #62  <Field boolean mPrintActivityRespectsOrientation>
		mIsMinMarginsHandlingCorrect = true;
	//   19   35:aload_0         
	//   20   36:iconst_1        
	//   21   37:putfield        #64  <Field boolean mIsMinMarginsHandlingCorrect>
		mContext = context;
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:putfield        #66  <Field Context mContext>
	//   25   45:return          
	}

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
	//    6    8:invokevirtual   #107 <Method int Bitmap.getWidth()>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #110 <Method int Bitmap.getHeight()>
	//    9   15:getstatic       #116 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   10   18:invokestatic    #120 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   11   21:astore_3        
			Canvas canvas = new Canvas(bitmap1);
	//   12   22:new             #122 <Class Canvas>
	//   13   25:dup             
	//   14   26:aload_3         
	//   15   27:invokespecial   #125 <Method void Canvas(Bitmap)>
	//   16   30:astore          4
			Paint paint = new Paint();
	//   17   32:new             #127 <Class Paint>
	//   18   35:dup             
	//   19   36:invokespecial   #128 <Method void Paint()>
	//   20   39:astore          5
			ColorMatrix colormatrix = new ColorMatrix();
	//   21   41:new             #130 <Class ColorMatrix>
	//   22   44:dup             
	//   23   45:invokespecial   #131 <Method void ColorMatrix()>
	//   24   48:astore          6
			colormatrix.setSaturation(0.0F);
	//   25   50:aload           6
	//   26   52:fconst_0        
	//   27   53:invokevirtual   #135 <Method void ColorMatrix.setSaturation(float)>
			paint.setColorFilter(((android.graphics.ColorFilter) (new ColorMatrixColorFilter(colormatrix))));
	//   28   56:aload           5
	//   29   58:new             #137 <Class ColorMatrixColorFilter>
	//   30   61:dup             
	//   31   62:aload           6
	//   32   64:invokespecial   #140 <Method void ColorMatrixColorFilter(ColorMatrix)>
	//   33   67:invokevirtual   #144 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   34   70:pop             
			canvas.drawBitmap(bitmap, 0.0F, 0.0F, paint);
	//   35   71:aload           4
	//   36   73:aload_1         
	//   37   74:fconst_0        
	//   38   75:fconst_0        
	//   39   76:aload           5
	//   40   78:invokevirtual   #148 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
			canvas.setBitmap(((Bitmap) (null)));
	//   41   81:aload           4
	//   42   83:aconst_null     
	//   43   84:invokevirtual   #151 <Method void Canvas.setBitmap(Bitmap)>
			return bitmap1;
	//   44   87:aload_3         
	//   45   88:areturn         
		}
	}

	private Matrix getMatrix(int i, int j, RectF rectf, int k)
	{
		Matrix matrix = new Matrix();
	//    0    0:new             #153 <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #154 <Method void Matrix()>
	//    3    7:astore          6
		float f = rectf.width() / (float)i;
	//    4    9:aload_3         
	//    5   10:invokevirtual   #160 <Method float RectF.width()>
	//    6   13:iload_1         
	//    7   14:i2f             
	//    8   15:fdiv            
	//    9   16:fstore          5
		if(k == 2)
	//*  10   18:iload           4
	//*  11   20:iconst_2        
	//*  12   21:icmpne          41
			f = Math.max(f, rectf.height() / (float)j);
	//   13   24:fload           5
	//   14   26:aload_3         
	//   15   27:invokevirtual   #163 <Method float RectF.height()>
	//   16   30:iload_2         
	//   17   31:i2f             
	//   18   32:fdiv            
	//   19   33:invokestatic    #169 <Method float Math.max(float, float)>
	//   20   36:fstore          5
		else
	//*  21   38:goto            55
			f = Math.min(f, rectf.height() / (float)j);
	//   22   41:fload           5
	//   23   43:aload_3         
	//   24   44:invokevirtual   #163 <Method float RectF.height()>
	//   25   47:iload_2         
	//   26   48:i2f             
	//   27   49:fdiv            
	//   28   50:invokestatic    #172 <Method float Math.min(float, float)>
	//   29   53:fstore          5
		matrix.postScale(f, f);
	//   30   55:aload           6
	//   31   57:fload           5
	//   32   59:fload           5
	//   33   61:invokevirtual   #176 <Method boolean Matrix.postScale(float, float)>
	//   34   64:pop             
		matrix.postTranslate((rectf.width() - (float)i * f) / 2.0F, (rectf.height() - (float)j * f) / 2.0F);
	//   35   65:aload           6
	//   36   67:aload_3         
	//   37   68:invokevirtual   #160 <Method float RectF.width()>
	//   38   71:iload_1         
	//   39   72:i2f             
	//   40   73:fload           5
	//   41   75:fmul            
	//   42   76:fsub            
	//   43   77:fconst_2        
	//   44   78:fdiv            
	//   45   79:aload_3         
	//   46   80:invokevirtual   #163 <Method float RectF.height()>
	//   47   83:iload_2         
	//   48   84:i2f             
	//   49   85:fload           5
	//   50   87:fmul            
	//   51   88:fsub            
	//   52   89:fconst_2        
	//   53   90:fdiv            
	//   54   91:invokevirtual   #179 <Method boolean Matrix.postTranslate(float, float)>
	//   55   94:pop             
		return matrix;
	//   56   95:aload           6
	//   57   97:areturn         
	}

	private static boolean isPortrait(Bitmap bitmap)
	{
		return bitmap.getWidth() <= bitmap.getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method int Bitmap.getWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #110 <Method int Bitmap.getHeight()>
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
	//*   3    5:getfield        #66  <Field Context mContext>
	//*   4    8:ifnonnull       21
			throw new IllegalArgumentException("bad argument to loadBitmap");
	//    5   11:new             #185 <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc1            #187 <String "bad argument to loadBitmap">
	//    8   17:invokespecial   #190 <Method void IllegalArgumentException(String)>
	//    9   20:athrow          
		uri1 = null;
	//   10   21:aconst_null     
	//   11   22:astore_3        
		uri = ((Uri) (mContext.getContentResolver().openInputStream(uri)));
	//   12   23:aload_0         
	//   13   24:getfield        #66  <Field Context mContext>
	//   14   27:invokevirtual   #196 <Method ContentResolver Context.getContentResolver()>
	//   15   30:aload_1         
	//   16   31:invokevirtual   #202 <Method InputStream ContentResolver.openInputStream(Uri)>
	//   17   34:astore_1        
		uri1 = uri;
	//   18   35:aload_1         
	//   19   36:astore_3        
		options = ((android.graphics.BitmapFactory.Options) (BitmapFactory.decodeStream(((InputStream) (uri)), ((android.graphics.Rect) (null)), options)));
	//   20   37:aload_1         
	//   21   38:aconst_null     
	//   22   39:aload_2         
	//   23   40:invokestatic    #208 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   24   43:astore_2        
		if(uri == null)
			break MISSING_BLOCK_LABEL_64;
	//   25   44:aload_1         
	//   26   45:ifnull          64
		((InputStream) (uri)).close();
	//   27   48:aload_1         
	//   28   49:invokevirtual   #213 <Method void InputStream.close()>
		return ((Bitmap) (options));
	//   29   52:aload_2         
	//   30   53:areturn         
		uri;
	//   31   54:astore_1        
		Log.w("PrintHelperKitkat", "close fail ", ((Throwable) (uri)));
	//   32   55:ldc1            #29  <String "PrintHelperKitkat">
	//   33   57:ldc1            #215 <String "close fail ">
	//   34   59:aload_1         
	//   35   60:invokestatic    #221 <Method int Log.w(String, String, Throwable)>
	//   36   63:pop             
		return ((Bitmap) (options));
	//   37   64:aload_2         
	//   38   65:areturn         
		uri;
	//   39   66:astore_1        
		if(uri1 != null)
	//*  40   67:aload_3         
	//*  41   68:ifnull          88
			try
			{
				((InputStream) (uri1)).close();
	//   42   71:aload_3         
	//   43   72:invokevirtual   #213 <Method void InputStream.close()>
			}
	//*  44   75:goto            88
			// Misplaced declaration of an exception variable
			catch(android.graphics.BitmapFactory.Options options)
	//*  45   78:astore_2        
			{
				Log.w("PrintHelperKitkat", "close fail ", ((Throwable) (options)));
	//   46   79:ldc1            #29  <String "PrintHelperKitkat">
	//   47   81:ldc1            #215 <String "close fail ">
	//   48   83:aload_2         
	//   49   84:invokestatic    #221 <Method int Log.w(String, String, Throwable)>
	//   50   87:pop             
			}
		throw uri;
	//   51   88:aload_1         
	//   52   89:athrow          
	}

	private Bitmap loadConstrainedBitmap(Uri uri, int i)
		throws FileNotFoundException
	{
		int j;
		if(i <= 0 || uri == null || mContext == null)
	//*   0    0:iload_2         
	//*   1    1:ifle            15
	//*   2    4:aload_1         
	//*   3    5:ifnull          15
	//*   4    8:aload_0         
	//*   5    9:getfield        #66  <Field Context mContext>
	//*   6   12:ifnonnull       25
			throw new IllegalArgumentException("bad argument to getScaledBitmap");
	//    7   15:new             #185 <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:ldc1            #223 <String "bad argument to getScaledBitmap">
	//   10   21:invokespecial   #190 <Method void IllegalArgumentException(String)>
	//   11   24:athrow          
		android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
	//   12   25:new             #225 <Class android.graphics.BitmapFactory$Options>
	//   13   28:dup             
	//   14   29:invokespecial   #226 <Method void android.graphics.BitmapFactory$Options()>
	//   15   32:astore          7
		options.inJustDecodeBounds = true;
	//   16   34:aload           7
	//   17   36:iconst_1        
	//   18   37:putfield        #229 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		loadBitmap(uri, options);
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:aload           7
	//   22   44:invokespecial   #231 <Method Bitmap loadBitmap(Uri, android.graphics.BitmapFactory$Options)>
	//   23   47:pop             
		int l = options.outWidth;
	//   24   48:aload           7
	//   25   50:getfield        #234 <Field int android.graphics.BitmapFactory$Options.outWidth>
	//   26   53:istore          5
		int i1 = options.outHeight;
	//   27   55:aload           7
	//   28   57:getfield        #237 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//   29   60:istore          6
		if(l <= 0 || i1 <= 0)
	//*  30   62:iload           5
	//*  31   64:ifle            72
	//*  32   67:iload           6
	//*  33   69:ifgt            74
			return null;
	//   34   72:aconst_null     
	//   35   73:areturn         
		int k = Math.max(l, i1);
	//   36   74:iload           5
	//   37   76:iload           6
	//   38   78:invokestatic    #240 <Method int Math.max(int, int)>
	//   39   81:istore          4
		for(j = 1; k > i; j <<= 1)
	//*  40   83:iconst_1        
	//*  41   84:istore_3        
	//*  42   85:iload           4
	//*  43   87:iload_2         
	//*  44   88:icmple          104
			k >>>= 1;
	//   45   91:iload           4
	//   46   93:iconst_1        
	//   47   94:iushr           
	//   48   95:istore          4

	//   49   97:iload_3         
	//   50   98:iconst_1        
	//   51   99:ishl            
	//   52  100:istore_3        
	//*  53  101:goto            85
		if(j <= 0 || Math.min(l, i1) / j >= 0)
	//*  54  104:iload_3         
	//*  55  105:ifle            120
	//*  56  108:iload           5
	//*  57  110:iload           6
	//*  58  112:invokestatic    #242 <Method int Math.min(int, int)>
	//*  59  115:iload_3         
	//*  60  116:idiv            
	//*  61  117:iflt            122
			return null;
	//   62  120:aconst_null     
	//   63  121:areturn         
		Object obj = mLock;
	//   64  122:aload_0         
	//   65  123:getfield        #56  <Field Object mLock>
	//   66  126:astore          7
		obj;
	//   67  128:aload           7
		JVM INSTR monitorenter ;
	//   68  130:monitorenter    
		android.graphics.BitmapFactory.Options options1;
		mDecodeOptions = new android.graphics.BitmapFactory.Options();
	//   69  131:aload_0         
	//   70  132:new             #225 <Class android.graphics.BitmapFactory$Options>
	//   71  135:dup             
	//   72  136:invokespecial   #226 <Method void android.graphics.BitmapFactory$Options()>
	//   73  139:putfield        #54  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
		mDecodeOptions.inMutable = true;
	//   74  142:aload_0         
	//   75  143:getfield        #54  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
	//   76  146:iconst_1        
	//   77  147:putfield        #245 <Field boolean android.graphics.BitmapFactory$Options.inMutable>
		mDecodeOptions.inSampleSize = j;
	//   78  150:aload_0         
	//   79  151:getfield        #54  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
	//   80  154:iload_3         
	//   81  155:putfield        #248 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		options1 = mDecodeOptions;
	//   82  158:aload_0         
	//   83  159:getfield        #54  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
	//   84  162:astore          8
		obj;
	//   85  164:aload           7
		JVM INSTR monitorexit ;
	//   86  166:monitorexit     
		break MISSING_BLOCK_LABEL_176;
	//   87  167:goto            176
		uri;
	//   88  170:astore_1        
	//*  89  171:aload           7
		throw uri;
	//   90  173:monitorexit     
	//   91  174:aload_1         
	//   92  175:athrow          
		obj = ((Object) (loadBitmap(uri, options1)));
	//   93  176:aload_0         
	//   94  177:aload_1         
	//   95  178:aload           8
	//   96  180:invokespecial   #231 <Method Bitmap loadBitmap(Uri, android.graphics.BitmapFactory$Options)>
	//   97  183:astore          7
		uri = ((Uri) (mLock));
	//   98  185:aload_0         
	//   99  186:getfield        #56  <Field Object mLock>
	//  100  189:astore_1        
		uri;
	//  101  190:aload_1         
		JVM INSTR monitorenter ;
	//  102  191:monitorenter    
		mDecodeOptions = null;
	//  103  192:aload_0         
	//  104  193:aconst_null     
	//  105  194:putfield        #54  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
		uri;
	//  106  197:aload_1         
		JVM INSTR monitorexit ;
	//  107  198:monitorexit     
		return ((Bitmap) (obj));
	//  108  199:aload           7
	//  109  201:areturn         
		Exception exception;
		exception;
	//  110  202:astore          7
	//* 111  204:aload_1         
		throw exception;
	//  112  205:monitorexit     
	//  113  206:aload           7
	//  114  208:athrow          
		exception;
	//  115  209:astore          7
		uri = ((Uri) (mLock));
	//  116  211:aload_0         
	//  117  212:getfield        #56  <Field Object mLock>
	//  118  215:astore_1        
		uri;
	//  119  216:aload_1         
		JVM INSTR monitorenter ;
	//  120  217:monitorenter    
		mDecodeOptions = null;
	//  121  218:aload_0         
	//  122  219:aconst_null     
	//  123  220:putfield        #54  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
		uri;
	//  124  223:aload_1         
		JVM INSTR monitorexit ;
	//  125  224:monitorexit     
		  goto _L1
	//* 126  225:goto            235
		exception;
	//  127  228:astore          7
	//* 128  230:aload_1         
		throw exception;
	//  129  231:monitorexit     
	//  130  232:aload           7
	//  131  234:athrow          
_L1:
		throw exception;
	//  132  235:aload           7
	//  133  237:athrow          
	}

	private void writeBitmap(final PrintAttributes attributes, final int fittingMode, final Bitmap bitmap, final ParcelFileDescriptor fileDescriptor, final CancellationSignal cancellationSignal, final android.print.PrintDocumentAdapter.WriteResultCallback writeResultCallback)
	{
		final PrintAttributes pdfAttributes;
		if(mIsMinMarginsHandlingCorrect)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field boolean mIsMinMarginsHandlingCorrect>
	//*   2    4:ifeq            13
			pdfAttributes = attributes;
	//    3    7:aload_1         
	//    4    8:astore          7
		else
	//*   5   10:goto            37
			pdfAttributes = copyAttributes(attributes).setMinMargins(new android.print.PrintAttributes.Margins(0, 0, 0, 0)).build();
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #252 <Method android.print.PrintAttributes$Builder copyAttributes(PrintAttributes)>
	//    9   18:new             #254 <Class android.print.PrintAttributes$Margins>
	//   10   21:dup             
	//   11   22:iconst_0        
	//   12   23:iconst_0        
	//   13   24:iconst_0        
	//   14   25:iconst_0        
	//   15   26:invokespecial   #257 <Method void android.print.PrintAttributes$Margins(int, int, int, int)>
	//   16   29:invokevirtual   #263 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMinMargins(android.print.PrintAttributes$Margins)>
	//   17   32:invokevirtual   #267 <Method PrintAttributes android.print.PrintAttributes$Builder.build()>
	//   18   35:astore          7
		((_cls2) (new AsyncTask() {

			protected volatile Object doInBackground(Object aobj[])
			{
				return ((Object) (doInBackground((Void[])aobj)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #51  <Class Void[]>
			//    3    5:invokevirtual   #54  <Method Throwable doInBackground(Void[])>
			//    4    8:areturn         
			}

			protected transient Throwable doInBackground(Void avoid[])
			{
				boolean flag;
				Bitmap bitmap1;
				Object obj;
				IOException ioexception;
				android.graphics.pdf.PdfDocument.Page page;
				Object obj1;
				android.graphics.pdf.PdfDocument.Page page1;
				try
				{
					flag = cancellationSignal.isCanceled();
			//    0    0:aload_0         
			//    1    1:getfield        #31  <Field CancellationSignal val$cancellationSignal>
			//    2    4:invokevirtual   #64  <Method boolean CancellationSignal.isCanceled()>
			//    3    7:istore_2        
				}
			//*   4    8:iload_2         
			//*   5    9:ifeq            14
			//*   6   12:aconst_null     
			//*   7   13:areturn         
			//*   8   14:new             #66  <Class PrintedPdfDocument>
			//*   9   17:dup             
			//*  10   18:aload_0         
			//*  11   19:getfield        #29  <Field PrintHelperKitkat this$0>
			//*  12   22:getfield        #70  <Field Context PrintHelperKitkat.mContext>
			//*  13   25:aload_0         
			//*  14   26:getfield        #33  <Field PrintAttributes val$pdfAttributes>
			//*  15   29:invokespecial   #73  <Method void PrintedPdfDocument(Context, PrintAttributes)>
			//*  16   32:astore          4
			//*  17   34:aload_0         
			//*  18   35:getfield        #29  <Field PrintHelperKitkat this$0>
			//*  19   38:aload_0         
			//*  20   39:getfield        #35  <Field Bitmap val$bitmap>
			//*  21   42:aload_0         
			//*  22   43:getfield        #33  <Field PrintAttributes val$pdfAttributes>
			//*  23   46:invokevirtual   #79  <Method int PrintAttributes.getColorMode()>
			//*  24   49:invokestatic    #83  <Method Bitmap PrintHelperKitkat.access$100(PrintHelperKitkat, Bitmap, int)>
			//*  25   52:astore_3        
			//*  26   53:aload_0         
			//*  27   54:getfield        #31  <Field CancellationSignal val$cancellationSignal>
			//*  28   57:invokevirtual   #64  <Method boolean CancellationSignal.isCanceled()>
			//*  29   60:istore_2        
			//*  30   61:iload_2         
			//*  31   62:ifeq            67
			//*  32   65:aconst_null     
			//*  33   66:areturn         
			//*  34   67:aload           4
			//*  35   69:iconst_1        
			//*  36   70:invokevirtual   #87  <Method android.graphics.pdf.PdfDocument$Page PrintedPdfDocument.startPage(int)>
			//*  37   73:astore          5
			//*  38   75:aload_0         
			//*  39   76:getfield        #29  <Field PrintHelperKitkat this$0>
			//*  40   79:getfield        #91  <Field boolean PrintHelperKitkat.mIsMinMarginsHandlingCorrect>
			//*  41   82:ifeq            104
			//*  42   85:new             #93  <Class RectF>
			//*  43   88:dup             
			//*  44   89:aload           5
			//*  45   91:invokevirtual   #99  <Method android.graphics.pdf.PdfDocument$PageInfo android.graphics.pdf.PdfDocument$Page.getInfo()>
			//*  46   94:invokevirtual   #105 <Method android.graphics.Rect android.graphics.pdf.PdfDocument$PageInfo.getContentRect()>
			//*  47   97:invokespecial   #108 <Method void RectF(android.graphics.Rect)>
			//*  48  100:astore_1        
			//*  49  101:goto            160
			//*  50  104:new             #66  <Class PrintedPdfDocument>
			//*  51  107:dup             
			//*  52  108:aload_0         
			//*  53  109:getfield        #29  <Field PrintHelperKitkat this$0>
			//*  54  112:getfield        #70  <Field Context PrintHelperKitkat.mContext>
			//*  55  115:aload_0         
			//*  56  116:getfield        #37  <Field PrintAttributes val$attributes>
			//*  57  119:invokespecial   #73  <Method void PrintedPdfDocument(Context, PrintAttributes)>
			//*  58  122:astore          6
			//*  59  124:aload           6
			//*  60  126:iconst_1        
			//*  61  127:invokevirtual   #87  <Method android.graphics.pdf.PdfDocument$Page PrintedPdfDocument.startPage(int)>
			//*  62  130:astore          7
			//*  63  132:new             #93  <Class RectF>
			//*  64  135:dup             
			//*  65  136:aload           7
			//*  66  138:invokevirtual   #99  <Method android.graphics.pdf.PdfDocument$PageInfo android.graphics.pdf.PdfDocument$Page.getInfo()>
			//*  67  141:invokevirtual   #105 <Method android.graphics.Rect android.graphics.pdf.PdfDocument$PageInfo.getContentRect()>
			//*  68  144:invokespecial   #108 <Method void RectF(android.graphics.Rect)>
			//*  69  147:astore_1        
			//*  70  148:aload           6
			//*  71  150:aload           7
			//*  72  152:invokevirtual   #112 <Method void PrintedPdfDocument.finishPage(android.graphics.pdf.PdfDocument$Page)>
			//*  73  155:aload           6
			//*  74  157:invokevirtual   #115 <Method void PrintedPdfDocument.close()>
			//*  75  160:aload_0         
			//*  76  161:getfield        #29  <Field PrintHelperKitkat this$0>
			//*  77  164:aload_3         
			//*  78  165:invokevirtual   #120 <Method int Bitmap.getWidth()>
			//*  79  168:aload_3         
			//*  80  169:invokevirtual   #123 <Method int Bitmap.getHeight()>
			//*  81  172:aload_1         
			//*  82  173:aload_0         
			//*  83  174:getfield        #39  <Field int val$fittingMode>
			//*  84  177:invokestatic    #127 <Method Matrix PrintHelperKitkat.access$200(PrintHelperKitkat, int, int, RectF, int)>
			//*  85  180:astore          6
			//*  86  182:aload_0         
			//*  87  183:getfield        #29  <Field PrintHelperKitkat this$0>
			//*  88  186:getfield        #91  <Field boolean PrintHelperKitkat.mIsMinMarginsHandlingCorrect>
			//*  89  189:ifeq            195
			//*  90  192:goto            219
			//*  91  195:aload           6
			//*  92  197:aload_1         
			//*  93  198:getfield        #131 <Field float RectF.left>
			//*  94  201:aload_1         
			//*  95  202:getfield        #134 <Field float RectF.top>
			//*  96  205:invokevirtual   #140 <Method boolean Matrix.postTranslate(float, float)>
			//*  97  208:pop             
			//*  98  209:aload           5
			//*  99  211:invokevirtual   #144 <Method Canvas android.graphics.pdf.PdfDocument$Page.getCanvas()>
			//* 100  214:aload_1         
			//* 101  215:invokevirtual   #150 <Method boolean Canvas.clipRect(RectF)>
			//* 102  218:pop             
			//* 103  219:aload           5
			//* 104  221:invokevirtual   #144 <Method Canvas android.graphics.pdf.PdfDocument$Page.getCanvas()>
			//* 105  224:aload_3         
			//* 106  225:aload           6
			//* 107  227:aconst_null     
			//* 108  228:invokevirtual   #154 <Method void Canvas.drawBitmap(Bitmap, Matrix, Paint)>
			//* 109  231:aload           4
			//* 110  233:aload           5
			//* 111  235:invokevirtual   #112 <Method void PrintedPdfDocument.finishPage(android.graphics.pdf.PdfDocument$Page)>
			//* 112  238:aload_0         
			//* 113  239:getfield        #31  <Field CancellationSignal val$cancellationSignal>
			//* 114  242:invokevirtual   #64  <Method boolean CancellationSignal.isCanceled()>
			//* 115  245:istore_2        
			//* 116  246:iload_2         
			//* 117  247:ifeq            289
			//* 118  250:aload           4
			//* 119  252:invokevirtual   #115 <Method void PrintedPdfDocument.close()>
			//* 120  255:aload_0         
			//* 121  256:getfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 122  259:astore_1        
			//* 123  260:aload_1         
			//* 124  261:ifnull          275
			//* 125  264:aload_0         
			//* 126  265:getfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 127  268:invokevirtual   #157 <Method void ParcelFileDescriptor.close()>
			//* 128  271:goto            275
			//* 129  274:astore_1        
			//* 130  275:aload_3         
			//* 131  276:aload_0         
			//* 132  277:getfield        #35  <Field Bitmap val$bitmap>
			//* 133  280:if_acmpeq       287
			//* 134  283:aload_3         
			//* 135  284:invokevirtual   #160 <Method void Bitmap.recycle()>
			//* 136  287:aconst_null     
			//* 137  288:areturn         
			//* 138  289:aload           4
			//* 139  291:new             #162 <Class FileOutputStream>
			//* 140  294:dup             
			//* 141  295:aload_0         
			//* 142  296:getfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 143  299:invokevirtual   #166 <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
			//* 144  302:invokespecial   #169 <Method void FileOutputStream(java.io.FileDescriptor)>
			//* 145  305:invokevirtual   #173 <Method void PrintedPdfDocument.writeTo(java.io.OutputStream)>
			//* 146  308:aload           4
			//* 147  310:invokevirtual   #115 <Method void PrintedPdfDocument.close()>
			//* 148  313:aload_0         
			//* 149  314:getfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 150  317:astore_1        
			//* 151  318:aload_1         
			//* 152  319:ifnull          333
			//* 153  322:aload_0         
			//* 154  323:getfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 155  326:invokevirtual   #157 <Method void ParcelFileDescriptor.close()>
			//* 156  329:goto            333
			//* 157  332:astore_1        
			//* 158  333:aload_3         
			//* 159  334:aload_0         
			//* 160  335:getfield        #35  <Field Bitmap val$bitmap>
			//* 161  338:if_acmpeq       345
			//* 162  341:aload_3         
			//* 163  342:invokevirtual   #160 <Method void Bitmap.recycle()>
			//* 164  345:aconst_null     
			//* 165  346:areturn         
			//* 166  347:astore_1        
			//* 167  348:aload           4
			//* 168  350:invokevirtual   #115 <Method void PrintedPdfDocument.close()>
			//* 169  353:aload_0         
			//* 170  354:getfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 171  357:astore          4
			//* 172  359:aload           4
			//* 173  361:ifnull          376
			//* 174  364:aload_0         
			//* 175  365:getfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
			//* 176  368:invokevirtual   #157 <Method void ParcelFileDescriptor.close()>
			//* 177  371:goto            376
			//* 178  374:astore          4
			//* 179  376:aload_3         
			//* 180  377:aload_0         
			//* 181  378:getfield        #35  <Field Bitmap val$bitmap>
			//* 182  381:if_acmpeq       388
			//* 183  384:aload_3         
			//* 184  385:invokevirtual   #160 <Method void Bitmap.recycle()>
			//* 185  388:aload_1         
			//* 186  389:athrow          
				// Misplaced declaration of an exception variable
				catch(Void avoid[])
			//* 187  390:astore_1        
				{
					return ((Throwable) (avoid));
			//  188  391:aload_1         
			//  189  392:areturn         
				}
				if(flag)
					return null;
				obj = ((Object) (new PrintedPdfDocument(mContext, pdfAttributes)));
				bitmap1 = convertBitmapForColorMode(bitmap, pdfAttributes.getColorMode());
				flag = cancellationSignal.isCanceled();
				if(flag)
					return null;
				page = ((PrintedPdfDocument) (obj)).startPage(1);
				if(mIsMinMarginsHandlingCorrect)
				{
					avoid = ((Void []) (new RectF(page.getInfo().getContentRect())));
					break MISSING_BLOCK_LABEL_160;
				}
				obj1 = ((Object) (new PrintedPdfDocument(mContext, attributes)));
				page1 = ((PrintedPdfDocument) (obj1)).startPage(1);
				avoid = ((Void []) (new RectF(page1.getInfo().getContentRect())));
				((PrintedPdfDocument) (obj1)).finishPage(page1);
				((PrintedPdfDocument) (obj1)).close();
				obj1 = ((Object) (getMatrix(bitmap1.getWidth(), bitmap1.getHeight(), ((RectF) (avoid)), fittingMode)));
				if(mIsMinMarginsHandlingCorrect)
					break MISSING_BLOCK_LABEL_219;
				((Matrix) (obj1)).postTranslate(((RectF) (avoid)).left, ((RectF) (avoid)).top);
				page.getCanvas().clipRect(((RectF) (avoid)));
				page.getCanvas().drawBitmap(bitmap1, ((Matrix) (obj1)), ((Paint) (null)));
				((PrintedPdfDocument) (obj)).finishPage(page);
				flag = cancellationSignal.isCanceled();
				if(!flag)
					break MISSING_BLOCK_LABEL_289;
				((PrintedPdfDocument) (obj)).close();
				avoid = ((Void []) (fileDescriptor));
				if(avoid == null)
					break MISSING_BLOCK_LABEL_275;
				fileDescriptor.close();
				break MISSING_BLOCK_LABEL_275;
				avoid;
				if(bitmap1 != bitmap)
					bitmap1.recycle();
				return null;
				((PrintedPdfDocument) (obj)).writeTo(((java.io.OutputStream) (new FileOutputStream(fileDescriptor.getFileDescriptor()))));
				((PrintedPdfDocument) (obj)).close();
				avoid = ((Void []) (fileDescriptor));
				if(avoid == null)
					break MISSING_BLOCK_LABEL_333;
				fileDescriptor.close();
				break MISSING_BLOCK_LABEL_333;
				avoid;
				if(bitmap1 != bitmap)
					bitmap1.recycle();
				return null;
				avoid;
				((PrintedPdfDocument) (obj)).close();
				obj = ((Object) (fileDescriptor));
				if(obj == null)
					break MISSING_BLOCK_LABEL_376;
				fileDescriptor.close();
				break MISSING_BLOCK_LABEL_376;
				ioexception;
				if(bitmap1 != bitmap)
					bitmap1.recycle();
				throw avoid;
			}

			protected volatile void onPostExecute(Object obj)
			{
				onPostExecute((Throwable)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #56  <Class Throwable>
			//    3    5:invokevirtual   #178 <Method void onPostExecute(Throwable)>
			//    4    8:return          
			}

			protected void onPostExecute(Throwable throwable)
			{
				if(cancellationSignal.isCanceled())
			//*   0    0:aload_0         
			//*   1    1:getfield        #31  <Field CancellationSignal val$cancellationSignal>
			//*   2    4:invokevirtual   #64  <Method boolean CancellationSignal.isCanceled()>
			//*   3    7:ifeq            18
				{
					writeResultCallback.onWriteCancelled();
			//    4   10:aload_0         
			//    5   11:getfield        #43  <Field android.print.PrintDocumentAdapter$WriteResultCallback val$writeResultCallback>
			//    6   14:invokevirtual   #183 <Method void android.print.PrintDocumentAdapter$WriteResultCallback.onWriteCancelled()>
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
			//   11   23:getfield        #43  <Field android.print.PrintDocumentAdapter$WriteResultCallback val$writeResultCallback>
			//   12   26:iconst_1        
			//   13   27:anewarray       PageRange[]
			//   14   30:dup             
			//   15   31:iconst_0        
			//   16   32:getstatic       #189 <Field PageRange PageRange.ALL_PAGES>
			//   17   35:aastore         
			//   18   36:invokevirtual   #193 <Method void android.print.PrintDocumentAdapter$WriteResultCallback.onWriteFinished(PageRange[])>
					return;
			//   19   39:return          
				} else
				{
					Log.e("PrintHelperKitkat", "Error writing printed content", throwable);
			//   20   40:ldc1            #195 <String "PrintHelperKitkat">
			//   21   42:ldc1            #197 <String "Error writing printed content">
			//   22   44:aload_1         
			//   23   45:invokestatic    #203 <Method int Log.e(String, String, Throwable)>
			//   24   48:pop             
					writeResultCallback.onWriteFailed(((CharSequence) (null)));
			//   25   49:aload_0         
			//   26   50:getfield        #43  <Field android.print.PrintDocumentAdapter$WriteResultCallback val$writeResultCallback>
			//   27   53:aconst_null     
			//   28   54:invokevirtual   #207 <Method void android.print.PrintDocumentAdapter$WriteResultCallback.onWriteFailed(CharSequence)>
					return;
			//   29   57:return          
				}
			}

			final PrintHelperKitkat this$0;
			final PrintAttributes val$attributes;
			final Bitmap val$bitmap;
			final CancellationSignal val$cancellationSignal;
			final ParcelFileDescriptor val$fileDescriptor;
			final int val$fittingMode;
			final PrintAttributes val$pdfAttributes;
			final android.print.PrintDocumentAdapter.WriteResultCallback val$writeResultCallback;

			
			{
				this$0 = PrintHelperKitkat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #29  <Field PrintHelperKitkat this$0>
				cancellationSignal = cancellationsignal;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #31  <Field CancellationSignal val$cancellationSignal>
				pdfAttributes = printattributes;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #33  <Field PrintAttributes val$pdfAttributes>
				bitmap = bitmap1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #35  <Field Bitmap val$bitmap>
				attributes = printattributes1;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #37  <Field PrintAttributes val$attributes>
				fittingMode = i;
			//   15   27:aload_0         
			//   16   28:iload           6
			//   17   30:putfield        #39  <Field int val$fittingMode>
				fileDescriptor = parcelfiledescriptor;
			//   18   33:aload_0         
			//   19   34:aload           7
			//   20   36:putfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
				writeResultCallback = writeresultcallback;
			//   21   39:aload_0         
			//   22   40:aload           8
			//   23   42:putfield        #43  <Field android.print.PrintDocumentAdapter$WriteResultCallback val$writeResultCallback>
				super();
			//   24   45:aload_0         
			//   25   46:invokespecial   #46  <Method void AsyncTask()>
			//   26   49:return          
			}
		}
)).execute(((Object []) (new Void[0])));
	//   19   37:new             #8   <Class PrintHelperKitkat$2>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:aload           5
	//   23   44:aload           7
	//   24   46:aload_3         
	//   25   47:aload_1         
	//   26   48:iload_2         
	//   27   49:aload           4
	//   28   51:aload           6
	//   29   53:invokespecial   #270 <Method void PrintHelperKitkat$2(PrintHelperKitkat, CancellationSignal, PrintAttributes, Bitmap, PrintAttributes, int, ParcelFileDescriptor, android.print.PrintDocumentAdapter$WriteResultCallback)>
	//   30   56:iconst_0        
	//   31   57:anewarray       Void[]
	//   32   60:invokevirtual   #276 <Method AsyncTask PrintHelperKitkat$2.execute(Object[])>
	//   33   63:pop             
	//   34   64:return          
	}

	protected android.print.PrintAttributes.Builder copyAttributes(PrintAttributes printattributes)
	{
		android.print.PrintAttributes.Builder builder = (new android.print.PrintAttributes.Builder()).setMediaSize(printattributes.getMediaSize()).setResolution(printattributes.getResolution()).setMinMargins(printattributes.getMinMargins());
	//    0    0:new             #259 <Class android.print.PrintAttributes$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #277 <Method void android.print.PrintAttributes$Builder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #283 <Method android.print.PrintAttributes$MediaSize PrintAttributes.getMediaSize()>
	//    5   11:invokevirtual   #287 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #291 <Method android.print.PrintAttributes$Resolution PrintAttributes.getResolution()>
	//    8   18:invokevirtual   #295 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setResolution(android.print.PrintAttributes$Resolution)>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #299 <Method android.print.PrintAttributes$Margins PrintAttributes.getMinMargins()>
	//   11   25:invokevirtual   #263 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMinMargins(android.print.PrintAttributes$Margins)>
	//   12   28:astore_2        
		if(printattributes.getColorMode() != 0)
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #302 <Method int PrintAttributes.getColorMode()>
	//*  15   33:ifeq            45
			builder.setColorMode(printattributes.getColorMode());
	//   16   36:aload_2         
	//   17   37:aload_1         
	//   18   38:invokevirtual   #302 <Method int PrintAttributes.getColorMode()>
	//   19   41:invokevirtual   #306 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setColorMode(int)>
	//   20   44:pop             
		return builder;
	//   21   45:aload_2         
	//   22   46:areturn         
	}

	public int getColorMode()
	{
		return mColorMode;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int mColorMode>
	//    2    4:ireturn         
	}

	public int getOrientation()
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #309 <Field int mOrientation>
	//*   2    4:ifne            9
			return 1;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		else
			return mOrientation;
	//    5    9:aload_0         
	//    6   10:getfield        #309 <Field int mOrientation>
	//    7   13:ireturn         
	}

	public int getScaleMode()
	{
		return mScaleMode;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int mScaleMode>
	//    2    4:ireturn         
	}

	public void printBitmap(final String jobName, final Bitmap bitmap, final OnPrintFinishCallback callback)
	{
		if(bitmap == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		final int fittingMode = mScaleMode;
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field int mScaleMode>
	//    5    9:istore          4
		PrintManager printmanager = (PrintManager)mContext.getSystemService("print");
	//    6   11:aload_0         
	//    7   12:getfield        #66  <Field Context mContext>
	//    8   15:ldc2            #314 <String "print">
	//    9   18:invokevirtual   #318 <Method Object Context.getSystemService(String)>
	//   10   21:checkcast       #320 <Class PrintManager>
	//   11   24:astore          6
		Object obj;
		if(isPortrait(bitmap))
	//*  12   26:aload_2         
	//*  13   27:invokestatic    #99  <Method boolean isPortrait(Bitmap)>
	//*  14   30:ifeq            41
			obj = ((Object) (android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT));
	//   15   33:getstatic       #326 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_PORTRAIT>
	//   16   36:astore          5
		else
	//*  17   38:goto            46
			obj = ((Object) (android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE));
	//   18   41:getstatic       #329 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_LANDSCAPE>
	//   19   44:astore          5
		obj = ((Object) ((new android.print.PrintAttributes.Builder()).setMediaSize(((android.print.PrintAttributes.MediaSize) (obj))).setColorMode(mColorMode).build()));
	//   20   46:new             #259 <Class android.print.PrintAttributes$Builder>
	//   21   49:dup             
	//   22   50:invokespecial   #277 <Method void android.print.PrintAttributes$Builder()>
	//   23   53:aload           5
	//   24   55:invokevirtual   #287 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
	//   25   58:aload_0         
	//   26   59:getfield        #60  <Field int mColorMode>
	//   27   62:invokevirtual   #306 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setColorMode(int)>
	//   28   65:invokevirtual   #267 <Method PrintAttributes android.print.PrintAttributes$Builder.build()>
	//   29   68:astore          5
		printmanager.print(jobName, ((PrintDocumentAdapter) (new PrintDocumentAdapter() {

			public void onFinish()
			{
				if(callback != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #33  <Field PrintHelperKitkat$OnPrintFinishCallback val$callback>
			//*   2    4:ifnull          16
					callback.onFinish();
			//    3    7:aload_0         
			//    4    8:getfield        #33  <Field PrintHelperKitkat$OnPrintFinishCallback val$callback>
			//    5   11:invokeinterface #42  <Method void PrintHelperKitkat$OnPrintFinishCallback.onFinish()>
			//    6   16:return          
			}

			public void onLayout(PrintAttributes printattributes, PrintAttributes printattributes1, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.LayoutResultCallback layoutresultcallback, Bundle bundle)
			{
				mAttributes = printattributes1;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #46  <Field PrintAttributes mAttributes>
				cancellationsignal = ((CancellationSignal) ((new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build()));
			//    3    5:new             #48  <Class android.print.PrintDocumentInfo$Builder>
			//    4    8:dup             
			//    5    9:aload_0         
			//    6   10:getfield        #27  <Field String val$jobName>
			//    7   13:invokespecial   #51  <Method void android.print.PrintDocumentInfo$Builder(String)>
			//    8   16:iconst_1        
			//    9   17:invokevirtual   #55  <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
			//   10   20:iconst_1        
			//   11   21:invokevirtual   #58  <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
			//   12   24:invokevirtual   #62  <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
			//   13   27:astore_3        
				boolean flag;
				if(!printattributes1.equals(((Object) (printattributes))))
			//*  14   28:aload_2         
			//*  15   29:aload_1         
			//*  16   30:invokevirtual   #68  <Method boolean PrintAttributes.equals(Object)>
			//*  17   33:ifne            42
					flag = true;
			//   18   36:iconst_1        
			//   19   37:istore          6
				else
			//*  20   39:goto            45
					flag = false;
			//   21   42:iconst_0        
			//   22   43:istore          6
				layoutresultcallback.onLayoutFinished(((android.print.PrintDocumentInfo) (cancellationsignal)), flag);
			//   23   45:aload           4
			//   24   47:aload_3         
			//   25   48:iload           6
			//   26   50:invokevirtual   #74  <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
			//   27   53:return          
			}

			public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.WriteResultCallback writeresultcallback)
			{
				writeBitmap(mAttributes, fittingMode, bitmap, parcelfiledescriptor, cancellationsignal, writeresultcallback);
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field PrintHelperKitkat this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #46  <Field PrintAttributes mAttributes>
			//    4    8:aload_0         
			//    5    9:getfield        #29  <Field int val$fittingMode>
			//    6   12:aload_0         
			//    7   13:getfield        #31  <Field Bitmap val$bitmap>
			//    8   16:aload_2         
			//    9   17:aload_3         
			//   10   18:aload           4
			//   11   20:invokestatic    #80  <Method void PrintHelperKitkat.access$000(PrintHelperKitkat, PrintAttributes, int, Bitmap, ParcelFileDescriptor, CancellationSignal, android.print.PrintDocumentAdapter$WriteResultCallback)>
			//   12   23:return          
			}

			private PrintAttributes mAttributes;
			final PrintHelperKitkat this$0;
			final Bitmap val$bitmap;
			final OnPrintFinishCallback val$callback;
			final int val$fittingMode;
			final String val$jobName;

			
			{
				this$0 = PrintHelperKitkat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field PrintHelperKitkat this$0>
				jobName = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field String val$jobName>
				fittingMode = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #29  <Field int val$fittingMode>
				bitmap = bitmap1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field Bitmap val$bitmap>
				callback = onprintfinishcallback;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #33  <Field PrintHelperKitkat$OnPrintFinishCallback val$callback>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #36  <Method void PrintDocumentAdapter()>
			//   17   31:return          
			}
		}
)), ((PrintAttributes) (obj)));
	//   30   70:aload           6
	//   31   72:aload_1         
	//   32   73:new             #6   <Class PrintHelperKitkat$1>
	//   33   76:dup             
	//   34   77:aload_0         
	//   35   78:aload_1         
	//   36   79:iload           4
	//   37   81:aload_2         
	//   38   82:aload_3         
	//   39   83:invokespecial   #332 <Method void PrintHelperKitkat$1(PrintHelperKitkat, String, int, Bitmap, PrintHelperKitkat$OnPrintFinishCallback)>
	//   40   86:aload           5
	//   41   88:invokevirtual   #335 <Method android.print.PrintJob PrintManager.print(String, PrintDocumentAdapter, PrintAttributes)>
	//   42   91:pop             
	//   43   92:return          
	}

	public void printBitmap(final String jobName, final Uri imageFile, final OnPrintFinishCallback callback)
		throws FileNotFoundException
	{
		imageFile = ((Uri) (new PrintDocumentAdapter() {

			private void cancelLoad()
			{
				Object obj = mLock;
			//    0    0:aload_0         
			//    1    1:getfield        #34  <Field PrintHelperKitkat this$0>
			//    2    4:invokestatic    #61  <Method Object PrintHelperKitkat.access$700(PrintHelperKitkat)>
			//    3    7:astore_1        
				obj;
			//    4    8:aload_1         
				JVM INSTR monitorenter ;
			//    5    9:monitorenter    
				if(mDecodeOptions != null)
			//*   6   10:aload_0         
			//*   7   11:getfield        #34  <Field PrintHelperKitkat this$0>
			//*   8   14:getfield        #65  <Field android.graphics.BitmapFactory$Options PrintHelperKitkat.mDecodeOptions>
			//*   9   17:ifnull          38
				{
					mDecodeOptions.requestCancelDecode();
			//   10   20:aload_0         
			//   11   21:getfield        #34  <Field PrintHelperKitkat this$0>
			//   12   24:getfield        #65  <Field android.graphics.BitmapFactory$Options PrintHelperKitkat.mDecodeOptions>
			//   13   27:invokevirtual   #70  <Method void android.graphics.BitmapFactory$Options.requestCancelDecode()>
					mDecodeOptions = null;
			//   14   30:aload_0         
			//   15   31:getfield        #34  <Field PrintHelperKitkat this$0>
			//   16   34:aconst_null     
			//   17   35:putfield        #65  <Field android.graphics.BitmapFactory$Options PrintHelperKitkat.mDecodeOptions>
				}
				obj;
			//   18   38:aload_1         
				JVM INSTR monitorexit ;
			//   19   39:monitorexit     
				return;
			//   20   40:return          
				Exception exception;
				exception;
			//   21   41:astore_2        
			//*  22   42:aload_1         
				throw exception;
			//   23   43:monitorexit     
			//   24   44:aload_2         
			//   25   45:athrow          
			}

			public void onFinish()
			{
				super.onFinish();
			//    0    0:aload_0         
			//    1    1:invokespecial   #73  <Method void PrintDocumentAdapter.onFinish()>
				cancelLoad();
			//    2    4:aload_0         
			//    3    5:invokespecial   #53  <Method void cancelLoad()>
				if(mLoadBitmap != null)
			//*   4    8:aload_0         
			//*   5    9:getfield        #75  <Field AsyncTask mLoadBitmap>
			//*   6   12:ifnull          24
					mLoadBitmap.cancel(true);
			//    7   15:aload_0         
			//    8   16:getfield        #75  <Field AsyncTask mLoadBitmap>
			//    9   19:iconst_1        
			//   10   20:invokevirtual   #81  <Method boolean AsyncTask.cancel(boolean)>
			//   11   23:pop             
				if(callback != null)
			//*  12   24:aload_0         
			//*  13   25:getfield        #40  <Field PrintHelperKitkat$OnPrintFinishCallback val$callback>
			//*  14   28:ifnull          40
					callback.onFinish();
			//   15   31:aload_0         
			//   16   32:getfield        #40  <Field PrintHelperKitkat$OnPrintFinishCallback val$callback>
			//   17   35:invokeinterface #84  <Method void PrintHelperKitkat$OnPrintFinishCallback.onFinish()>
				if(mBitmap != null)
			//*  18   40:aload_0         
			//*  19   41:getfield        #47  <Field Bitmap mBitmap>
			//*  20   44:ifnull          59
				{
					mBitmap.recycle();
			//   21   47:aload_0         
			//   22   48:getfield        #47  <Field Bitmap mBitmap>
			//   23   51:invokevirtual   #89  <Method void Bitmap.recycle()>
					mBitmap = null;
			//   24   54:aload_0         
			//   25   55:aconst_null     
			//   26   56:putfield        #47  <Field Bitmap mBitmap>
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
			//    4    4:putfield        #57  <Field PrintAttributes mAttributes>
				this;
			//    5    7:aload_0         
				JVM INSTR monitorexit ;
			//    6    8:monitorexit     
				  goto _L1
			//*   7    9:goto            17
				oldPrintAttributes;
			//    8   12:astore_1        
			//*   9   13:aload_0         
				throw oldPrintAttributes;
			//   10   14:monitorexit     
			//   11   15:aload_1         
			//   12   16:athrow          
_L1:
				if(cancellationSignal.isCanceled())
			//*  13   17:aload_3         
			//*  14   18:invokevirtual   #97  <Method boolean CancellationSignal.isCanceled()>
			//*  15   21:ifeq            30
				{
					layoutresultcallback.onLayoutCancelled();
			//   16   24:aload           4
			//   17   26:invokevirtual   #102 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutCancelled()>
					return;
			//   18   29:return          
				}
				if(mBitmap != null)
			//*  19   30:aload_0         
			//*  20   31:getfield        #47  <Field Bitmap mBitmap>
			//*  21   34:ifnull          86
				{
					cancellationSignal = ((CancellationSignal) ((new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build()));
			//   22   37:new             #104 <Class android.print.PrintDocumentInfo$Builder>
			//   23   40:dup             
			//   24   41:aload_0         
			//   25   42:getfield        #36  <Field String val$jobName>
			//   26   45:invokespecial   #107 <Method void android.print.PrintDocumentInfo$Builder(String)>
			//   27   48:iconst_1        
			//   28   49:invokevirtual   #111 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
			//   29   52:iconst_1        
			//   30   53:invokevirtual   #114 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
			//   31   56:invokevirtual   #118 <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
			//   32   59:astore_3        
					boolean flag;
					if(!newPrintAttributes.equals(((Object) (oldPrintAttributes))))
			//*  33   60:aload_2         
			//*  34   61:aload_1         
			//*  35   62:invokevirtual   #124 <Method boolean PrintAttributes.equals(Object)>
			//*  36   65:ifne            74
						flag = true;
			//   37   68:iconst_1        
			//   38   69:istore          6
					else
			//*  39   71:goto            77
						flag = false;
			//   40   74:iconst_0        
			//   41   75:istore          6
					layoutresultcallback.onLayoutFinished(((android.print.PrintDocumentInfo) (cancellationSignal)), flag);
			//   42   77:aload           4
			//   43   79:aload_3         
			//   44   80:iload           6
			//   45   82:invokevirtual   #128 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
					return;
			//   46   85:return          
				} else
				{
					mLoadBitmap = ((_cls1) (((_cls1) (layoutresultcallback)). new AsyncTask() {

						protected transient Bitmap doInBackground(Uri auri[])
						{
							try
							{
								auri = ((Uri []) (loadConstrainedBitmap(imageFile, 3500)));
						//    0    0:aload_0         
						//    1    1:getfield        #25  <Field PrintHelperKitkat$3 this$1>
						//    2    4:getfield        #45  <Field PrintHelperKitkat PrintHelperKitkat$3.this$0>
						//    3    7:aload_0         
						//    4    8:getfield        #25  <Field PrintHelperKitkat$3 this$1>
						//    5   11:getfield        #49  <Field Uri PrintHelperKitkat$3.val$imageFile>
						//    6   14:sipush          3500
						//    7   17:invokestatic    #55  <Method Bitmap PrintHelperKitkat.access$400(PrintHelperKitkat, Uri, int)>
						//    8   20:astore_1        
							}
						//*   9   21:aload_1         
						//*  10   22:areturn         
							// Misplaced declaration of an exception variable
							catch(Uri auri[])
						//*  11   23:astore_1        
							{
								return null;
						//   12   24:aconst_null     
						//   13   25:areturn         
							}
							return ((Bitmap) (auri));
						}

						protected volatile Object doInBackground(Object aobj[])
						{
							return ((Object) (doInBackground((Uri[])aobj)));
						//    0    0:aload_0         
						//    1    1:aload_1         
						//    2    2:checkcast       #58  <Class Uri[]>
						//    3    5:invokevirtual   #60  <Method Bitmap doInBackground(Uri[])>
						//    4    8:areturn         
						}

						protected void onCancelled(Bitmap bitmap)
						{
							layoutResultCallback.onLayoutCancelled();
						//    0    0:aload_0         
						//    1    1:getfield        #33  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
						//    2    4:invokevirtual   #67  <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutCancelled()>
							mLoadBitmap = null;
						//    3    7:aload_0         
						//    4    8:getfield        #25  <Field PrintHelperKitkat$3 this$1>
						//    5   11:aconst_null     
						//    6   12:putfield        #71  <Field AsyncTask PrintHelperKitkat$3.mLoadBitmap>
						//    7   15:return          
						}

						protected volatile void onCancelled(Object obj)
						{
							onCancelled((Bitmap)obj);
						//    0    0:aload_0         
						//    1    1:aload_1         
						//    2    2:checkcast       #74  <Class Bitmap>
						//    3    5:invokevirtual   #76  <Method void onCancelled(Bitmap)>
						//    4    8:return          
						}

						protected void onPostExecute(Bitmap bitmap)
						{
							Object obj;
							super.onPostExecute(((Object) (bitmap)));
						//    0    0:aload_0         
						//    1    1:aload_1         
						//    2    2:invokespecial   #79  <Method void AsyncTask.onPostExecute(Object)>
							obj = ((Object) (bitmap));
						//    3    5:aload_1         
						//    4    6:astore_3        
							if(bitmap == null)
								break MISSING_BLOCK_LABEL_116;
						//    5    7:aload_1         
						//    6    8:ifnull          116
							if(mPrintActivityRespectsOrientation)
						//*   7   11:aload_0         
						//*   8   12:getfield        #25  <Field PrintHelperKitkat$3 this$1>
						//*   9   15:getfield        #45  <Field PrintHelperKitkat PrintHelperKitkat$3.this$0>
						//*  10   18:getfield        #83  <Field boolean PrintHelperKitkat.mPrintActivityRespectsOrientation>
						//*  11   21:ifeq            39
							{
								obj = ((Object) (bitmap));
						//   12   24:aload_1         
						//   13   25:astore_3        
								if(mOrientation != 0)
									break MISSING_BLOCK_LABEL_116;
						//   14   26:aload_0         
						//   15   27:getfield        #25  <Field PrintHelperKitkat$3 this$1>
						//   16   30:getfield        #45  <Field PrintHelperKitkat PrintHelperKitkat$3.this$0>
						//   17   33:getfield        #87  <Field int PrintHelperKitkat.mOrientation>
						//   18   36:ifne            116
							}
							this;
						//   19   39:aload_0         
							JVM INSTR monitorenter ;
						//   20   40:monitorenter    
							android.print.PrintAttributes.MediaSize mediasize = mAttributes.getMediaSize();
						//   21   41:aload_0         
						//   22   42:getfield        #25  <Field PrintHelperKitkat$3 this$1>
						//   23   45:invokestatic    #91  <Method PrintAttributes PrintHelperKitkat$3.access$500(PrintHelperKitkat$3)>
						//   24   48:invokevirtual   #97  <Method android.print.PrintAttributes$MediaSize PrintAttributes.getMediaSize()>
						//   25   51:astore          4
							this;
						//   26   53:aload_0         
							JVM INSTR monitorexit ;
						//   27   54:monitorexit     
							  goto _L1
						//*  28   55:goto            63
							bitmap;
						//   29   58:astore_1        
						//*  30   59:aload_0         
							throw bitmap;
						//   31   60:monitorexit     
						//   32   61:aload_1         
						//   33   62:athrow          
_L1:
							obj = ((Object) (bitmap));
						//   34   63:aload_1         
						//   35   64:astore_3        
							if(mediasize != null)
						//*  36   65:aload           4
						//*  37   67:ifnull          116
							{
								obj = ((Object) (bitmap));
						//   38   70:aload_1         
						//   39   71:astore_3        
								if(mediasize.isPortrait() != PrintHelperKitkat.isPortrait(bitmap))
						//*  40   72:aload           4
						//*  41   74:invokevirtual   #103 <Method boolean android.print.PrintAttributes$MediaSize.isPortrait()>
						//*  42   77:aload_1         
						//*  43   78:invokestatic    #107 <Method boolean PrintHelperKitkat.access$600(Bitmap)>
						//*  44   81:icmpeq          116
								{
									obj = ((Object) (new Matrix()));
						//   45   84:new             #109 <Class Matrix>
						//   46   87:dup             
						//   47   88:invokespecial   #110 <Method void Matrix()>
						//   48   91:astore_3        
									((Matrix) (obj)).postRotate(90F);
						//   49   92:aload_3         
						//   50   93:ldc1            #111 <Float 90F>
						//   51   95:invokevirtual   #115 <Method boolean Matrix.postRotate(float)>
						//   52   98:pop             
									obj = ((Object) (Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true)));
						//   53   99:aload_1         
						//   54  100:iconst_0        
						//   55  101:iconst_0        
						//   56  102:aload_1         
						//   57  103:invokevirtual   #119 <Method int Bitmap.getWidth()>
						//   58  106:aload_1         
						//   59  107:invokevirtual   #122 <Method int Bitmap.getHeight()>
						//   60  110:aload_3         
						//   61  111:iconst_1        
						//   62  112:invokestatic    #126 <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int, Matrix, boolean)>
						//   63  115:astore_3        
								}
							}
							mBitmap = ((Bitmap) (obj));
						//   64  116:aload_0         
						//   65  117:getfield        #25  <Field PrintHelperKitkat$3 this$1>
						//   66  120:aload_3         
						//   67  121:putfield        #130 <Field Bitmap PrintHelperKitkat$3.mBitmap>
							if(obj != null)
						//*  68  124:aload_3         
						//*  69  125:ifnull          187
							{
								bitmap = ((Bitmap) ((new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build()));
						//   70  128:new             #132 <Class android.print.PrintDocumentInfo$Builder>
						//   71  131:dup             
						//   72  132:aload_0         
						//   73  133:getfield        #25  <Field PrintHelperKitkat$3 this$1>
						//   74  136:getfield        #136 <Field String PrintHelperKitkat$3.val$jobName>
						//   75  139:invokespecial   #139 <Method void android.print.PrintDocumentInfo$Builder(String)>
						//   76  142:iconst_1        
						//   77  143:invokevirtual   #143 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
						//   78  146:iconst_1        
						//   79  147:invokevirtual   #146 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
						//   80  150:invokevirtual   #150 <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
						//   81  153:astore_1        
								boolean flag;
								if(!newPrintAttributes.equals(((Object) (oldPrintAttributes))))
						//*  82  154:aload_0         
						//*  83  155:getfield        #29  <Field PrintAttributes val$newPrintAttributes>
						//*  84  158:aload_0         
						//*  85  159:getfield        #31  <Field PrintAttributes val$oldPrintAttributes>
						//*  86  162:invokevirtual   #154 <Method boolean PrintAttributes.equals(Object)>
						//*  87  165:ifne            173
									flag = true;
						//   88  168:iconst_1        
						//   89  169:istore_2        
								else
						//*  90  170:goto            175
									flag = false;
						//   91  173:iconst_0        
						//   92  174:istore_2        
								layoutResultCallback.onLayoutFinished(((android.print.PrintDocumentInfo) (bitmap)), flag);
						//   93  175:aload_0         
						//   94  176:getfield        #33  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
						//   95  179:aload_1         
						//   96  180:iload_2         
						//   97  181:invokevirtual   #158 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
							} else
						//*  98  184:goto            195
							{
								layoutResultCallback.onLayoutFailed(((CharSequence) (null)));
						//   99  187:aload_0         
						//  100  188:getfield        #33  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
						//  101  191:aconst_null     
						//  102  192:invokevirtual   #162 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFailed(CharSequence)>
							}
							mLoadBitmap = null;
						//  103  195:aload_0         
						//  104  196:getfield        #25  <Field PrintHelperKitkat$3 this$1>
						//  105  199:aconst_null     
						//  106  200:putfield        #71  <Field AsyncTask PrintHelperKitkat$3.mLoadBitmap>
							return;
						//  107  203:return          
						}

						protected volatile void onPostExecute(Object obj)
						{
							onPostExecute((Bitmap)obj);
						//    0    0:aload_0         
						//    1    1:aload_1         
						//    2    2:checkcast       #74  <Class Bitmap>
						//    3    5:invokevirtual   #164 <Method void onPostExecute(Bitmap)>
						//    4    8:return          
						}

						protected void onPreExecute()
						{
							cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() {

								public void onCancel()
								{
									cancelLoad();
								//    0    0:aload_0         
								//    1    1:getfield        #19  <Field PrintHelperKitkat$3$1 this$2>
								//    2    4:getfield        #27  <Field PrintHelperKitkat$3 PrintHelperKitkat$3$1.this$1>
								//    3    7:invokestatic    #31  <Method void PrintHelperKitkat$3.access$300(PrintHelperKitkat$3)>
									cancel(false);
								//    4   10:aload_0         
								//    5   11:getfield        #19  <Field PrintHelperKitkat$3$1 this$2>
								//    6   14:iconst_0        
								//    7   15:invokevirtual   #35  <Method boolean PrintHelperKitkat$3$1.cancel(boolean)>
								//    8   18:pop             
								//    9   19:return          
								}

								final _cls1 this$2;

			
			{
				this$2 = _cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PrintHelperKitkat$3$1 this$2>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
							}
);
						//    0    0:aload_0         
						//    1    1:getfield        #27  <Field CancellationSignal val$cancellationSignal>
						//    2    4:new             #12  <Class PrintHelperKitkat$3$1$1>
						//    3    7:dup             
						//    4    8:aload_0         
						//    5    9:invokespecial   #168 <Method void PrintHelperKitkat$3$1$1(PrintHelperKitkat$3$1)>
						//    6   12:invokevirtual   #174 <Method void CancellationSignal.setOnCancelListener(android.os.CancellationSignal$OnCancelListener)>
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
			//    2    2:putfield        #25  <Field PrintHelperKitkat$3 this$1>
				cancellationSignal = cancellationsignal;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field CancellationSignal val$cancellationSignal>
				newPrintAttributes = printattributes;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field PrintAttributes val$newPrintAttributes>
				oldPrintAttributes = printattributes1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field PrintAttributes val$oldPrintAttributes>
				layoutResultCallback = android.print.PrintDocumentAdapter.LayoutResultCallback.this;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #33  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #36  <Method void AsyncTask()>
			//   17   31:return          
			}
					}
)).execute(((Object []) (new Uri[0])));
			//   47   86:aload_0         
			//   48   87:new             #11  <Class PrintHelperKitkat$3$1>
			//   49   90:dup             
			//   50   91:aload_0         
			//   51   92:aload_3         
			//   52   93:aload_2         
			//   53   94:aload_1         
			//   54   95:aload           4
			//   55   97:invokespecial   #131 <Method void PrintHelperKitkat$3$1(PrintHelperKitkat$3, CancellationSignal, PrintAttributes, PrintAttributes, android.print.PrintDocumentAdapter$LayoutResultCallback)>
			//   56  100:iconst_0        
			//   57  101:anewarray       Uri[]
			//   58  104:invokevirtual   #137 <Method AsyncTask PrintHelperKitkat$3$1.execute(Object[])>
			//   59  107:putfield        #75  <Field AsyncTask mLoadBitmap>
					return;
			//   60  110:return          
				}
			}

			public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.WriteResultCallback writeresultcallback)
			{
				writeBitmap(mAttributes, fittingMode, mBitmap, parcelfiledescriptor, cancellationsignal, writeresultcallback);
			//    0    0:aload_0         
			//    1    1:getfield        #34  <Field PrintHelperKitkat this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #57  <Field PrintAttributes mAttributes>
			//    4    8:aload_0         
			//    5    9:getfield        #42  <Field int val$fittingMode>
			//    6   12:aload_0         
			//    7   13:getfield        #47  <Field Bitmap mBitmap>
			//    8   16:aload_2         
			//    9   17:aload_3         
			//   10   18:aload           4
			//   11   20:invokestatic    #143 <Method void PrintHelperKitkat.access$000(PrintHelperKitkat, PrintAttributes, int, Bitmap, ParcelFileDescriptor, CancellationSignal, android.print.PrintDocumentAdapter$WriteResultCallback)>
			//   12   23:return          
			}

			private PrintAttributes mAttributes;
			Bitmap mBitmap;
			AsyncTask mLoadBitmap;
			final PrintHelperKitkat this$0;
			final OnPrintFinishCallback val$callback;
			final int val$fittingMode;
			final Uri val$imageFile;
			final String val$jobName;


/*
			static void access$300(_cls3 _pcls3)
			{
				_pcls3.cancelLoad();
			//    0    0:aload_0         
			//    1    1:invokespecial   #53  <Method void cancelLoad()>
				return;
			//    2    4:return          
			}

*/


/*
			static PrintAttributes access$500(_cls3 _pcls3)
			{
				return _pcls3.mAttributes;
			//    0    0:aload_0         
			//    1    1:getfield        #57  <Field PrintAttributes mAttributes>
			//    2    4:areturn         
			}

*/

			
			{
				this$0 = PrintHelperKitkat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #34  <Field PrintHelperKitkat this$0>
				jobName = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #36  <Field String val$jobName>
				imageFile = uri;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #38  <Field Uri val$imageFile>
				callback = onprintfinishcallback;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #40  <Field PrintHelperKitkat$OnPrintFinishCallback val$callback>
				fittingMode = i;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #42  <Field int val$fittingMode>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #45  <Method void PrintDocumentAdapter()>
				mBitmap = null;
			//   17   31:aload_0         
			//   18   32:aconst_null     
			//   19   33:putfield        #47  <Field Bitmap mBitmap>
			//   20   36:return          
			}
		}
));
	//    0    0:new             #10  <Class PrintHelperKitkat$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload_0         
	//    7    9:getfield        #58  <Field int mScaleMode>
	//    8   12:invokespecial   #339 <Method void PrintHelperKitkat$3(PrintHelperKitkat, String, Uri, PrintHelperKitkat$OnPrintFinishCallback, int)>
	//    9   15:astore_2        
		callback = ((OnPrintFinishCallback) ((PrintManager)mContext.getSystemService("print")));
	//   10   16:aload_0         
	//   11   17:getfield        #66  <Field Context mContext>
	//   12   20:ldc2            #314 <String "print">
	//   13   23:invokevirtual   #318 <Method Object Context.getSystemService(String)>
	//   14   26:checkcast       #320 <Class PrintManager>
	//   15   29:astore_3        
		android.print.PrintAttributes.Builder builder = new android.print.PrintAttributes.Builder();
	//   16   30:new             #259 <Class android.print.PrintAttributes$Builder>
	//   17   33:dup             
	//   18   34:invokespecial   #277 <Method void android.print.PrintAttributes$Builder()>
	//   19   37:astore          4
		builder.setColorMode(mColorMode);
	//   20   39:aload           4
	//   21   41:aload_0         
	//   22   42:getfield        #60  <Field int mColorMode>
	//   23   45:invokevirtual   #306 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setColorMode(int)>
	//   24   48:pop             
		if(mOrientation == 1 || mOrientation == 0)
	//*  25   49:aload_0         
	//*  26   50:getfield        #309 <Field int mOrientation>
	//*  27   53:iconst_1        
	//*  28   54:icmpeq          64
	//*  29   57:aload_0         
	//*  30   58:getfield        #309 <Field int mOrientation>
	//*  31   61:ifne            76
			builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
	//   32   64:aload           4
	//   33   66:getstatic       #329 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_LANDSCAPE>
	//   34   69:invokevirtual   #287 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
	//   35   72:pop             
		else
	//*  36   73:goto            93
		if(mOrientation == 2)
	//*  37   76:aload_0         
	//*  38   77:getfield        #309 <Field int mOrientation>
	//*  39   80:iconst_2        
	//*  40   81:icmpne          93
			builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
	//   41   84:aload           4
	//   42   86:getstatic       #326 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_PORTRAIT>
	//   43   89:invokevirtual   #287 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
	//   44   92:pop             
		((PrintManager) (callback)).print(jobName, ((PrintDocumentAdapter) (imageFile)), builder.build());
	//   45   93:aload_3         
	//   46   94:aload_1         
	//   47   95:aload_2         
	//   48   96:aload           4
	//   49   98:invokevirtual   #267 <Method PrintAttributes android.print.PrintAttributes$Builder.build()>
	//   50  101:invokevirtual   #335 <Method android.print.PrintJob PrintManager.print(String, PrintDocumentAdapter, PrintAttributes)>
	//   51  104:pop             
	//   52  105:return          
	}

	public void setColorMode(int i)
	{
		mColorMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field int mColorMode>
	//    3    5:return          
	}

	public void setOrientation(int i)
	{
		mOrientation = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #309 <Field int mOrientation>
	//    3    5:return          
	}

	public void setScaleMode(int i)
	{
		mScaleMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field int mScaleMode>
	//    3    5:return          
	}

	public static final int COLOR_MODE_COLOR = 2;
	public static final int COLOR_MODE_MONOCHROME = 1;
	private static final String LOG_TAG = "PrintHelperKitkat";
	private static final int MAX_PRINT_SIZE = 3500;
	public static final int ORIENTATION_LANDSCAPE = 1;
	public static final int ORIENTATION_PORTRAIT = 2;
	public static final int SCALE_MODE_FILL = 2;
	public static final int SCALE_MODE_FIT = 1;
	int mColorMode;
	final Context mContext;
	android.graphics.BitmapFactory.Options mDecodeOptions;
	protected boolean mIsMinMarginsHandlingCorrect;
	private final Object mLock = new Object();
	int mOrientation;
	protected boolean mPrintActivityRespectsOrientation;
	int mScaleMode;


/*
	static void access$000(PrintHelperKitkat printhelperkitkat, PrintAttributes printattributes, int i, Bitmap bitmap, ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.WriteResultCallback writeresultcallback)
	{
		printhelperkitkat.writeBitmap(printattributes, i, bitmap, parcelfiledescriptor, cancellationsignal, writeresultcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #73  <Method void writeBitmap(PrintAttributes, int, Bitmap, ParcelFileDescriptor, CancellationSignal, android.print.PrintDocumentAdapter$WriteResultCallback)>
		return;
	//    8   13:return          
	}

*/


/*
	static Bitmap access$100(PrintHelperKitkat printhelperkitkat, Bitmap bitmap, int i)
	{
		return printhelperkitkat.convertBitmapForColorMode(bitmap, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #79  <Method Bitmap convertBitmapForColorMode(Bitmap, int)>
	//    4    6:areturn         
	}

*/


/*
	static Matrix access$200(PrintHelperKitkat printhelperkitkat, int i, int j, RectF rectf, int k)
	{
		return printhelperkitkat.getMatrix(i, j, rectf, k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #85  <Method Matrix getMatrix(int, int, RectF, int)>
	//    6    9:areturn         
	}

*/


/*
	static Bitmap access$400(PrintHelperKitkat printhelperkitkat, Uri uri, int i)
		throws FileNotFoundException
	{
		return printhelperkitkat.loadConstrainedBitmap(uri, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #93  <Method Bitmap loadConstrainedBitmap(Uri, int)>
	//    4    6:areturn         
	}

*/


/*
	static boolean access$600(Bitmap bitmap)
	{
		return isPortrait(bitmap);
	//    0    0:aload_0         
	//    1    1:invokestatic    #99  <Method boolean isPortrait(Bitmap)>
	//    2    4:ireturn         
	}

*/


/*
	static Object access$700(PrintHelperKitkat printhelperkitkat)
	{
		return printhelperkitkat.mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Object mLock>
	//    2    4:areturn         
	}

*/
}
