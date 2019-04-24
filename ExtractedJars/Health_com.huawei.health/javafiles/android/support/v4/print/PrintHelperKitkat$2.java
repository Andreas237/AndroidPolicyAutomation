// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.graphics.*;
import android.os.*;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package android.support.v4.print:
//			PrintHelperKitkat

class PrintHelperKitkat$2 extends AsyncTask
{

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
			flag = val$cancellationSignal.isCanceled();
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
	//*  12   22:getfield        #70  <Field android.content.Context PrintHelperKitkat.mContext>
	//*  13   25:aload_0         
	//*  14   26:getfield        #33  <Field PrintAttributes val$pdfAttributes>
	//*  15   29:invokespecial   #73  <Method void PrintedPdfDocument(android.content.Context, PrintAttributes)>
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
	//*  54  112:getfield        #70  <Field android.content.Context PrintHelperKitkat.mContext>
	//*  55  115:aload_0         
	//*  56  116:getfield        #37  <Field PrintAttributes val$attributes>
	//*  57  119:invokespecial   #73  <Method void PrintedPdfDocument(android.content.Context, PrintAttributes)>
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
	//* 108  228:invokevirtual   #154 <Method void Canvas.drawBitmap(Bitmap, Matrix, android.graphics.Paint)>
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
		obj = ((Object) (new PrintedPdfDocument(mContext, val$pdfAttributes)));
		bitmap1 = PrintHelperKitkat.access$100(PrintHelperKitkat.this, val$bitmap, val$pdfAttributes.getColorMode());
		flag = val$cancellationSignal.isCanceled();
		if(flag)
			return null;
		page = ((PrintedPdfDocument) (obj)).startPage(1);
		if(mIsMinMarginsHandlingCorrect)
		{
			avoid = ((Void []) (new RectF(page.getInfo().getContentRect())));
			break MISSING_BLOCK_LABEL_160;
		}
		obj1 = ((Object) (new PrintedPdfDocument(mContext, val$attributes)));
		page1 = ((PrintedPdfDocument) (obj1)).startPage(1);
		avoid = ((Void []) (new RectF(page1.getInfo().getContentRect())));
		((PrintedPdfDocument) (obj1)).finishPage(page1);
		((PrintedPdfDocument) (obj1)).close();
		obj1 = ((Object) (PrintHelperKitkat.access$200(PrintHelperKitkat.this, bitmap1.getWidth(), bitmap1.getHeight(), ((RectF) (avoid)), val$fittingMode)));
		if(mIsMinMarginsHandlingCorrect)
			break MISSING_BLOCK_LABEL_219;
		((Matrix) (obj1)).postTranslate(((RectF) (avoid)).left, ((RectF) (avoid)).top);
		page.getCanvas().clipRect(((RectF) (avoid)));
		page.getCanvas().drawBitmap(bitmap1, ((Matrix) (obj1)), ((android.graphics.Paint) (null)));
		((PrintedPdfDocument) (obj)).finishPage(page);
		flag = val$cancellationSignal.isCanceled();
		if(!flag)
			break MISSING_BLOCK_LABEL_289;
		((PrintedPdfDocument) (obj)).close();
		avoid = ((Void []) (val$fileDescriptor));
		if(avoid == null)
			break MISSING_BLOCK_LABEL_275;
		val$fileDescriptor.close();
		break MISSING_BLOCK_LABEL_275;
		avoid;
		if(bitmap1 != val$bitmap)
			bitmap1.recycle();
		return null;
		((PrintedPdfDocument) (obj)).writeTo(((java.io.OutputStream) (new FileOutputStream(val$fileDescriptor.getFileDescriptor()))));
		((PrintedPdfDocument) (obj)).close();
		avoid = ((Void []) (val$fileDescriptor));
		if(avoid == null)
			break MISSING_BLOCK_LABEL_333;
		val$fileDescriptor.close();
		break MISSING_BLOCK_LABEL_333;
		avoid;
		if(bitmap1 != val$bitmap)
			bitmap1.recycle();
		return null;
		avoid;
		((PrintedPdfDocument) (obj)).close();
		obj = ((Object) (val$fileDescriptor));
		if(obj == null)
			break MISSING_BLOCK_LABEL_376;
		val$fileDescriptor.close();
		break MISSING_BLOCK_LABEL_376;
		ioexception;
		if(bitmap1 != val$bitmap)
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
		if(val$cancellationSignal.isCanceled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field CancellationSignal val$cancellationSignal>
	//*   2    4:invokevirtual   #64  <Method boolean CancellationSignal.isCanceled()>
	//*   3    7:ifeq            18
		{
			val$writeResultCallback.onWriteCancelled();
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
			val$writeResultCallback.onWriteFinished(new PageRange[] {
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
			val$writeResultCallback.onWriteFailed(((CharSequence) (null)));
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
	final android.print..WriteResultCallback val$writeResultCallback;

	PrintHelperKitkat$2()
	{
		this$0 = final_printhelperkitkat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field PrintHelperKitkat this$0>
		val$cancellationSignal = cancellationsignal;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #31  <Field CancellationSignal val$cancellationSignal>
		val$pdfAttributes = printattributes;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #33  <Field PrintAttributes val$pdfAttributes>
		val$bitmap = bitmap1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #35  <Field Bitmap val$bitmap>
		val$attributes = printattributes1;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #37  <Field PrintAttributes val$attributes>
		val$fittingMode = i;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #39  <Field int val$fittingMode>
		val$fileDescriptor = parcelfiledescriptor;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
		val$writeResultCallback = android.print..WriteResultCallback.this;
	//   21   39:aload_0         
	//   22   40:aload           8
	//   23   42:putfield        #43  <Field android.print.PrintDocumentAdapter$WriteResultCallback val$writeResultCallback>
		super();
	//   24   45:aload_0         
	//   25   46:invokespecial   #46  <Method void AsyncTask()>
	//   26   49:return          
	}
}
