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

class PrintHelper$1 extends AsyncTask
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
		if(val$cancellationSignal.isCanceled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field CancellationSignal val$cancellationSignal>
	//*   2    4:invokevirtual   #64  <Method boolean CancellationSignal.isCanceled()>
	//*   3    7:ifeq            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		boolean flag;
		Bitmap bitmap1;
		Object obj;
		android.graphics.pdf.ge ge;
		Object obj1;
		android.graphics.pdf.ge ge1;
		try
		{
			obj = ((Object) (new PrintedPdfDocument(mContext, val$pdfAttributes)));
	//    6   12:new             #66  <Class PrintedPdfDocument>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #29  <Field PrintHelper this$0>
	//   10   20:getfield        #70  <Field android.content.Context PrintHelper.mContext>
	//   11   23:aload_0         
	//   12   24:getfield        #33  <Field PrintAttributes val$pdfAttributes>
	//   13   27:invokespecial   #73  <Method void PrintedPdfDocument(android.content.Context, PrintAttributes)>
	//   14   30:astore          4
			bitmap1 = PrintHelper.convertBitmapForColorMode(val$bitmap, val$pdfAttributes.getColorMode());
	//   15   32:aload_0         
	//   16   33:getfield        #35  <Field Bitmap val$bitmap>
	//   17   36:aload_0         
	//   18   37:getfield        #33  <Field PrintAttributes val$pdfAttributes>
	//   19   40:invokevirtual   #79  <Method int PrintAttributes.getColorMode()>
	//   20   43:invokestatic    #83  <Method Bitmap PrintHelper.convertBitmapForColorMode(Bitmap, int)>
	//   21   46:astore_3        
			flag = val$cancellationSignal.isCanceled();
	//   22   47:aload_0         
	//   23   48:getfield        #31  <Field CancellationSignal val$cancellationSignal>
	//   24   51:invokevirtual   #64  <Method boolean CancellationSignal.isCanceled()>
	//   25   54:istore_2        
		}
	//*  26   55:iload_2         
	//*  27   56:ifeq            61
	//*  28   59:aconst_null     
	//*  29   60:areturn         
	//*  30   61:aload           4
	//*  31   63:iconst_1        
	//*  32   64:invokevirtual   #87  <Method android.graphics.pdf.PdfDocument$Page PrintedPdfDocument.startPage(int)>
	//*  33   67:astore          5
	//*  34   69:getstatic       #91  <Field boolean PrintHelper.IS_MIN_MARGINS_HANDLING_CORRECT>
	//*  35   72:ifeq            94
	//*  36   75:new             #93  <Class RectF>
	//*  37   78:dup             
	//*  38   79:aload           5
	//*  39   81:invokevirtual   #99  <Method android.graphics.pdf.PdfDocument$PageInfo android.graphics.pdf.PdfDocument$Page.getInfo()>
	//*  40   84:invokevirtual   #105 <Method android.graphics.Rect android.graphics.pdf.PdfDocument$PageInfo.getContentRect()>
	//*  41   87:invokespecial   #108 <Method void RectF(android.graphics.Rect)>
	//*  42   90:astore_1        
	//*  43   91:goto            150
	//*  44   94:new             #66  <Class PrintedPdfDocument>
	//*  45   97:dup             
	//*  46   98:aload_0         
	//*  47   99:getfield        #29  <Field PrintHelper this$0>
	//*  48  102:getfield        #70  <Field android.content.Context PrintHelper.mContext>
	//*  49  105:aload_0         
	//*  50  106:getfield        #37  <Field PrintAttributes val$attributes>
	//*  51  109:invokespecial   #73  <Method void PrintedPdfDocument(android.content.Context, PrintAttributes)>
	//*  52  112:astore          6
	//*  53  114:aload           6
	//*  54  116:iconst_1        
	//*  55  117:invokevirtual   #87  <Method android.graphics.pdf.PdfDocument$Page PrintedPdfDocument.startPage(int)>
	//*  56  120:astore          7
	//*  57  122:new             #93  <Class RectF>
	//*  58  125:dup             
	//*  59  126:aload           7
	//*  60  128:invokevirtual   #99  <Method android.graphics.pdf.PdfDocument$PageInfo android.graphics.pdf.PdfDocument$Page.getInfo()>
	//*  61  131:invokevirtual   #105 <Method android.graphics.Rect android.graphics.pdf.PdfDocument$PageInfo.getContentRect()>
	//*  62  134:invokespecial   #108 <Method void RectF(android.graphics.Rect)>
	//*  63  137:astore_1        
	//*  64  138:aload           6
	//*  65  140:aload           7
	//*  66  142:invokevirtual   #112 <Method void PrintedPdfDocument.finishPage(android.graphics.pdf.PdfDocument$Page)>
	//*  67  145:aload           6
	//*  68  147:invokevirtual   #115 <Method void PrintedPdfDocument.close()>
	//*  69  150:aload_3         
	//*  70  151:invokevirtual   #120 <Method int Bitmap.getWidth()>
	//*  71  154:aload_3         
	//*  72  155:invokevirtual   #123 <Method int Bitmap.getHeight()>
	//*  73  158:aload_1         
	//*  74  159:aload_0         
	//*  75  160:getfield        #39  <Field int val$fittingMode>
	//*  76  163:invokestatic    #127 <Method Matrix PrintHelper.getMatrix(int, int, RectF, int)>
	//*  77  166:astore          6
	//*  78  168:getstatic       #91  <Field boolean PrintHelper.IS_MIN_MARGINS_HANDLING_CORRECT>
	//*  79  171:ifeq            177
	//*  80  174:goto            201
	//*  81  177:aload           6
	//*  82  179:aload_1         
	//*  83  180:getfield        #131 <Field float RectF.left>
	//*  84  183:aload_1         
	//*  85  184:getfield        #134 <Field float RectF.top>
	//*  86  187:invokevirtual   #140 <Method boolean Matrix.postTranslate(float, float)>
	//*  87  190:pop             
	//*  88  191:aload           5
	//*  89  193:invokevirtual   #144 <Method Canvas android.graphics.pdf.PdfDocument$Page.getCanvas()>
	//*  90  196:aload_1         
	//*  91  197:invokevirtual   #150 <Method boolean Canvas.clipRect(RectF)>
	//*  92  200:pop             
	//*  93  201:aload           5
	//*  94  203:invokevirtual   #144 <Method Canvas android.graphics.pdf.PdfDocument$Page.getCanvas()>
	//*  95  206:aload_3         
	//*  96  207:aload           6
	//*  97  209:aconst_null     
	//*  98  210:invokevirtual   #154 <Method void Canvas.drawBitmap(Bitmap, Matrix, android.graphics.Paint)>
	//*  99  213:aload           4
	//* 100  215:aload           5
	//* 101  217:invokevirtual   #112 <Method void PrintedPdfDocument.finishPage(android.graphics.pdf.PdfDocument$Page)>
	//* 102  220:aload_0         
	//* 103  221:getfield        #31  <Field CancellationSignal val$cancellationSignal>
	//* 104  224:invokevirtual   #64  <Method boolean CancellationSignal.isCanceled()>
	//* 105  227:istore_2        
	//* 106  228:iload_2         
	//* 107  229:ifeq            267
	//* 108  232:aload           4
	//* 109  234:invokevirtual   #115 <Method void PrintedPdfDocument.close()>
	//* 110  237:aload_0         
	//* 111  238:getfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
	//* 112  241:astore_1        
	//* 113  242:aload_1         
	//* 114  243:ifnull          253
	//* 115  246:aload_0         
	//* 116  247:getfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
	//* 117  250:invokevirtual   #157 <Method void ParcelFileDescriptor.close()>
	//* 118  253:aload_3         
	//* 119  254:aload_0         
	//* 120  255:getfield        #35  <Field Bitmap val$bitmap>
	//* 121  258:if_acmpeq       265
	//* 122  261:aload_3         
	//* 123  262:invokevirtual   #160 <Method void Bitmap.recycle()>
	//* 124  265:aconst_null     
	//* 125  266:areturn         
	//* 126  267:aload           4
	//* 127  269:new             #162 <Class FileOutputStream>
	//* 128  272:dup             
	//* 129  273:aload_0         
	//* 130  274:getfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
	//* 131  277:invokevirtual   #166 <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//* 132  280:invokespecial   #169 <Method void FileOutputStream(java.io.FileDescriptor)>
	//* 133  283:invokevirtual   #173 <Method void PrintedPdfDocument.writeTo(java.io.OutputStream)>
	//* 134  286:aload           4
	//* 135  288:invokevirtual   #115 <Method void PrintedPdfDocument.close()>
	//* 136  291:aload_0         
	//* 137  292:getfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
	//* 138  295:astore_1        
	//* 139  296:aload_1         
	//* 140  297:ifnull          307
	//* 141  300:aload_0         
	//* 142  301:getfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
	//* 143  304:invokevirtual   #157 <Method void ParcelFileDescriptor.close()>
	//* 144  307:aload_3         
	//* 145  308:aload_0         
	//* 146  309:getfield        #35  <Field Bitmap val$bitmap>
	//* 147  312:if_acmpeq       375
	//* 148  315:aload_3         
	//* 149  316:invokevirtual   #160 <Method void Bitmap.recycle()>
	//* 150  319:aconst_null     
	//* 151  320:areturn         
	//* 152  321:astore_1        
	//* 153  322:aload           4
	//* 154  324:invokevirtual   #115 <Method void PrintedPdfDocument.close()>
	//* 155  327:aload_0         
	//* 156  328:getfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
	//* 157  331:astore          4
	//* 158  333:aload           4
	//* 159  335:ifnull          345
	//* 160  338:aload_0         
	//* 161  339:getfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
	//* 162  342:invokevirtual   #157 <Method void ParcelFileDescriptor.close()>
	//* 163  345:aload_3         
	//* 164  346:aload_0         
	//* 165  347:getfield        #35  <Field Bitmap val$bitmap>
	//* 166  350:if_acmpeq       357
	//* 167  353:aload_3         
	//* 168  354:invokevirtual   #160 <Method void Bitmap.recycle()>
	//* 169  357:aload_1         
	//* 170  358:athrow          
		// Misplaced declaration of an exception variable
		catch(Void avoid[])
	//* 171  359:astore_1        
		{
			return ((Throwable) (avoid));
	//  172  360:aload_1         
	//  173  361:areturn         
		}
		if(flag)
			return null;
		ge = ((PrintedPdfDocument) (obj)).startPage(1);
		if(PrintHelper.IS_MIN_MARGINS_HANDLING_CORRECT)
		{
			avoid = ((Void []) (new RectF(ge.getInfo().getContentRect())));
			break MISSING_BLOCK_LABEL_150;
		}
		obj1 = ((Object) (new PrintedPdfDocument(mContext, val$attributes)));
		ge1 = ((PrintedPdfDocument) (obj1)).startPage(1);
		avoid = ((Void []) (new RectF(ge1.getInfo().getContentRect())));
		((PrintedPdfDocument) (obj1)).finishPage(ge1);
		((PrintedPdfDocument) (obj1)).close();
		obj1 = ((Object) (PrintHelper.getMatrix(bitmap1.getWidth(), bitmap1.getHeight(), ((RectF) (avoid)), val$fittingMode)));
		if(PrintHelper.IS_MIN_MARGINS_HANDLING_CORRECT)
			break MISSING_BLOCK_LABEL_201;
		((Matrix) (obj1)).postTranslate(((RectF) (avoid)).left, ((RectF) (avoid)).top);
		ge.getCanvas().clipRect(((RectF) (avoid)));
		ge.getCanvas().drawBitmap(bitmap1, ((Matrix) (obj1)), ((android.graphics.Paint) (null)));
		((PrintedPdfDocument) (obj)).finishPage(ge);
		flag = val$cancellationSignal.isCanceled();
		if(!flag)
			break MISSING_BLOCK_LABEL_267;
		((PrintedPdfDocument) (obj)).close();
		avoid = ((Void []) (val$fileDescriptor));
		if(avoid == null)
			break MISSING_BLOCK_LABEL_253;
		try
		{
			val$fileDescriptor.close();
		}
		// Misplaced declaration of an exception variable
		catch(Void avoid[]) { }
	//  174  362:astore_1        
		if(bitmap1 != val$bitmap)
			bitmap1.recycle();
		return null;
		((PrintedPdfDocument) (obj)).writeTo(((java.io.OutputStream) (new FileOutputStream(val$fileDescriptor.getFileDescriptor()))));
		((PrintedPdfDocument) (obj)).close();
		avoid = ((Void []) (val$fileDescriptor));
		if(avoid == null)
			break MISSING_BLOCK_LABEL_307;
		try
		{
			val$fileDescriptor.close();
		}
	//* 175  363:goto            253
		// Misplaced declaration of an exception variable
		catch(Void avoid[]) { }
	//  176  366:astore_1        
		if(bitmap1 == val$bitmap)
			break MISSING_BLOCK_LABEL_375;
		bitmap1.recycle();
		return null;
		avoid;
		((PrintedPdfDocument) (obj)).close();
		obj = ((Object) (val$fileDescriptor));
		if(obj == null)
			break MISSING_BLOCK_LABEL_345;
		try
		{
			val$fileDescriptor.close();
		}
	//* 177  367:goto            307
		catch(IOException ioexception) { }
	//  178  370:astore          4
		if(bitmap1 != val$bitmap)
			bitmap1.recycle();
		throw avoid;
	//* 179  372:goto            345
		return null;
	//  180  375:aconst_null     
	//  181  376:areturn         
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
			Log.e("PrintHelper", "Error writing printed content", throwable);
	//   20   40:ldc1            #195 <String "PrintHelper">
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

	final PrintHelper this$0;
	final PrintAttributes val$attributes;
	final Bitmap val$bitmap;
	final CancellationSignal val$cancellationSignal;
	final ParcelFileDescriptor val$fileDescriptor;
	final int val$fittingMode;
	final PrintAttributes val$pdfAttributes;
	final android.print.dapter.WriteResultCallback val$writeResultCallback;

	PrintHelper$1()
	{
		this$0 = final_printhelper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field PrintHelper this$0>
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
		val$writeResultCallback = android.print.dapter.WriteResultCallback.this;
	//   21   39:aload_0         
	//   22   40:aload           8
	//   23   42:putfield        #43  <Field android.print.PrintDocumentAdapter$WriteResultCallback val$writeResultCallback>
		super();
	//   24   45:aload_0         
	//   25   46:invokespecial   #46  <Method void AsyncTask()>
	//   26   49:return          
	}
}
