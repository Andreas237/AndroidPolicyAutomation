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
		Bitmap bitmap1;
		Object obj;
		android.graphics.pdf.PdfDocument.Page page;
		Object obj1;
		if(val$cancellationSignal.isCanceled())
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
	//*  65  138:invokevirtual   #133 <Method void Canvas.drawBitmap(Bitmap, Matrix, android.graphics.Paint)>
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
		obj1 = ((Object) (PrintHelper.PrintHelperApi19.access$200(PrintHelper.PrintHelperApi19.this, bitmap1.getWidth(), bitmap1.getHeight(), ((RectF) (avoid)), val$fittingMode)));
		if(!mIsMinMarginsHandlingCorrect) goto _L6; else goto _L5
_L5:
		page.getCanvas().drawBitmap(bitmap1, ((Matrix) (obj1)), ((android.graphics.Paint) (null)));
		((PrintedPdfDocument) (obj)).finishPage(page);
		flag = val$cancellationSignal.isCanceled();
		if(!flag) goto _L8; else goto _L7
_L7:
		((PrintedPdfDocument) (obj)).close();
		avoid = ((Void []) (val$fileDescriptor));
		if(avoid == null)
			break MISSING_BLOCK_LABEL_181;
		try
		{
			val$fileDescriptor.close();
		}
	//*  96  198:new             #69  <Class PrintedPdfDocument>
	//*  97  201:dup             
	//*  98  202:aload_0         
	//*  99  203:getfield        #32  <Field PrintHelper$PrintHelperApi19 this$0>
	//* 100  206:getfield        #73  <Field android.content.Context PrintHelper$PrintHelperApi19.mContext>
	//* 101  209:aload_0         
	//* 102  210:getfield        #40  <Field PrintAttributes val$attributes>
	//* 103  213:invokespecial   #76  <Method void PrintedPdfDocument(android.content.Context, PrintAttributes)>
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
		if(bitmap1 == val$bitmap) goto _L2; else goto _L9
_L9:
		bitmap1.recycle();
		return null;
_L4:
		obj1 = ((Object) (new PrintedPdfDocument(mContext, val$attributes)));
		android.graphics.pdf.PdfDocument.Page page1 = ((PrintedPdfDocument) (obj1)).startPage(1);
		avoid = ((Void []) (new RectF(page1.getInfo().getContentRect())));
		((PrintedPdfDocument) (obj1)).finishPage(page1);
		((PrintedPdfDocument) (obj1)).close();
		continue; /* Loop/switch isn't completed */
		avoid;
		((PrintedPdfDocument) (obj)).close();
		obj = ((Object) (val$fileDescriptor));
		if(obj == null)
			break MISSING_BLOCK_LABEL_281;
		try
		{
			val$fileDescriptor.close();
		}
		catch(IOException ioexception) { }
		if(bitmap1 != val$bitmap)
			bitmap1.recycle();
		throw avoid;
_L6:
		((Matrix) (obj1)).postTranslate(((RectF) (avoid)).left, ((RectF) (avoid)).top);
		page.getCanvas().clipRect(((RectF) (avoid)));
		  goto _L5
_L8:
		((PrintedPdfDocument) (obj)).writeTo(((java.io.OutputStream) (new FileOutputStream(val$fileDescriptor.getFileDescriptor()))));
		((PrintedPdfDocument) (obj)).close();
		avoid = ((Void []) (val$fileDescriptor));
		if(avoid == null)
			break MISSING_BLOCK_LABEL_362;
		try
		{
			val$fileDescriptor.close();
		}
		// Misplaced declaration of an exception variable
		catch(Void avoid[]) { }
		if(bitmap1 == val$bitmap) goto _L2; else goto _L10
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
