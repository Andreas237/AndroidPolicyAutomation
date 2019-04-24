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
//			PrintHelper

class PrintHelper$PrintHelperApi19$2 extends AsyncTask
{

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
		if(val$cancellationSignal.isCanceled())
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
			obj = ((Object) (new PrintedPdfDocument(mContext, val$pdfAttributes)));
	//    6   12:new             #69  <Class PrintedPdfDocument>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #32  <Field PrintHelper$PrintHelperApi19 this$0>
	//   10   20:getfield        #73  <Field android.content.Context PrintHelper$PrintHelperApi19.mContext>
	//   11   23:aload_0         
	//   12   24:getfield        #36  <Field PrintAttributes val$pdfAttributes>
	//   13   27:invokespecial   #76  <Method void PrintedPdfDocument(android.content.Context, PrintAttributes)>
	//   14   30:astore          4
			bitmap1 = PrintHelper.PrintHelperApi19.access$100(PrintHelper.PrintHelperApi19.this, val$bitmap, val$pdfAttributes.getColorMode());
	//   15   32:aload_0         
	//   16   33:getfield        #32  <Field PrintHelper$PrintHelperApi19 this$0>
	//   17   36:aload_0         
	//   18   37:getfield        #38  <Field Bitmap val$bitmap>
	//   19   40:aload_0         
	//   20   41:getfield        #36  <Field PrintAttributes val$pdfAttributes>
	//   21   44:invokevirtual   #82  <Method int PrintAttributes.getColorMode()>
	//   22   47:invokestatic    #86  <Method Bitmap PrintHelper$PrintHelperApi19.access$100(PrintHelper$PrintHelperApi19, Bitmap, int)>
	//   23   50:astore_3        
			flag = val$cancellationSignal.isCanceled();
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
	//*  52  110:getfield        #73  <Field android.content.Context PrintHelper$PrintHelperApi19.mContext>
	//*  53  113:aload_0         
	//*  54  114:getfield        #40  <Field PrintAttributes val$attributes>
	//*  55  117:invokespecial   #76  <Method void PrintedPdfDocument(android.content.Context, PrintAttributes)>
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
	//* 106  226:invokevirtual   #157 <Method void Canvas.drawBitmap(Bitmap, Matrix, android.graphics.Paint)>
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
		obj1 = ((Object) (new PrintedPdfDocument(mContext, val$attributes)));
		page1 = ((PrintedPdfDocument) (obj1)).startPage(1);
		avoid = ((Void []) (new RectF(page1.getInfo().getContentRect())));
		((PrintedPdfDocument) (obj1)).finishPage(page1);
		((PrintedPdfDocument) (obj1)).close();
		obj1 = ((Object) (PrintHelper.PrintHelperApi19.access$200(PrintHelper.PrintHelperApi19.this, bitmap1.getWidth(), bitmap1.getHeight(), ((RectF) (avoid)), val$fittingMode)));
		if(mIsMinMarginsHandlingCorrect)
			break MISSING_BLOCK_LABEL_217;
		((Matrix) (obj1)).postTranslate(((RectF) (avoid)).left, ((RectF) (avoid)).top);
		page.getCanvas().clipRect(((RectF) (avoid)));
		page.getCanvas().drawBitmap(bitmap1, ((Matrix) (obj1)), ((android.graphics.Paint) (null)));
		((PrintedPdfDocument) (obj)).finishPage(page);
		flag = val$cancellationSignal.isCanceled();
		if(!flag)
			break MISSING_BLOCK_LABEL_283;
		((PrintedPdfDocument) (obj)).close();
		avoid = ((Void []) (val$fileDescriptor));
		if(avoid == null)
			break MISSING_BLOCK_LABEL_269;
		try
		{
			val$fileDescriptor.close();
		}
		// Misplaced declaration of an exception variable
		catch(Void avoid[]) { }
	//  182  378:astore_1        
		if(bitmap1 != val$bitmap)
			bitmap1.recycle();
		return null;
		((PrintedPdfDocument) (obj)).writeTo(((java.io.OutputStream) (new FileOutputStream(val$fileDescriptor.getFileDescriptor()))));
		((PrintedPdfDocument) (obj)).close();
		avoid = ((Void []) (val$fileDescriptor));
		if(avoid == null)
			break MISSING_BLOCK_LABEL_323;
		try
		{
			val$fileDescriptor.close();
		}
	//* 183  379:goto            269
		// Misplaced declaration of an exception variable
		catch(Void avoid[]) { }
	//  184  382:astore_1        
		if(bitmap1 == val$bitmap)
			break MISSING_BLOCK_LABEL_391;
		bitmap1.recycle();
		return null;
		avoid;
		((PrintedPdfDocument) (obj)).close();
		obj = ((Object) (val$fileDescriptor));
		if(obj == null)
			break MISSING_BLOCK_LABEL_361;
		try
		{
			val$fileDescriptor.close();
		}
	//* 185  383:goto            323
		catch(IOException ioexception) { }
	//  186  386:astore          4
		if(bitmap1 != val$bitmap)
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
		if(val$cancellationSignal.isCanceled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field CancellationSignal val$cancellationSignal>
	//*   2    4:invokevirtual   #67  <Method boolean CancellationSignal.isCanceled()>
	//*   3    7:ifeq            18
		{
			val$writeResultCallback.onWriteCancelled();
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
			val$writeResultCallback.onWriteFinished(new PageRange[] {
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
			val$writeResultCallback.onWriteFailed(((CharSequence) (null)));
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
	final android.print.tCallback val$writeResultCallback;

	PrintHelper$PrintHelperApi19$2()
	{
		this$0 = final_printhelperapi19;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field PrintHelper$PrintHelperApi19 this$0>
		val$cancellationSignal = cancellationsignal;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #34  <Field CancellationSignal val$cancellationSignal>
		val$pdfAttributes = printattributes;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #36  <Field PrintAttributes val$pdfAttributes>
		val$bitmap = bitmap1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #38  <Field Bitmap val$bitmap>
		val$attributes = printattributes1;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #40  <Field PrintAttributes val$attributes>
		val$fittingMode = i;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #42  <Field int val$fittingMode>
		val$fileDescriptor = parcelfiledescriptor;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #44  <Field ParcelFileDescriptor val$fileDescriptor>
		val$writeResultCallback = android.print.tCallback.this;
	//   21   39:aload_0         
	//   22   40:aload           8
	//   23   42:putfield        #46  <Field android.print.PrintDocumentAdapter$WriteResultCallback val$writeResultCallback>
		super();
	//   24   45:aload_0         
	//   25   46:invokespecial   #49  <Method void AsyncTask()>
	//   26   49:return          
	}
}
