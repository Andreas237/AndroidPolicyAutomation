// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.graphics.Bitmap;
import android.os.*;
import android.print.*;

// Referenced classes of package android.support.v4.print:
//			PrintHelper

class PrintHelper$PrintHelperApi19$1 extends PrintDocumentAdapter
{

	public void onFinish()
	{
		if(val$callback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field PrintHelper$OnPrintFinishCallback val$callback>
	//*   2    4:ifnull          16
			val$callback.onFinish();
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field PrintHelper$OnPrintFinishCallback val$callback>
	//    5   11:invokeinterface #45  <Method void PrintHelper$OnPrintFinishCallback.onFinish()>
	//    6   16:return          
	}

	public void onLayout(PrintAttributes printattributes, PrintAttributes printattributes1, CancellationSignal cancellationsignal, android.print.ltCallback ltcallback, Bundle bundle)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		mAttributes = printattributes1;
	//    2    3:aload_0         
	//    3    4:aload_2         
	//    4    5:putfield        #49  <Field PrintAttributes mAttributes>
		cancellationsignal = ((CancellationSignal) ((new android.print.PrintDocumentInfo.Builder(val$jobName)).setContentType(1).setPageCount(1).build()));
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
		ltcallback.onLayoutFinished(((android.print.PrintDocumentInfo) (cancellationsignal)), flag);
	//*  27   51:goto            39
	}

	public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.tCallback tcallback)
	{
		PrintHelper.PrintHelperApi19.access$000(PrintHelper.PrintHelperApi19.this, mAttributes, val$fittingMode, val$bitmap, parcelfiledescriptor, cancellationsignal, tcallback);
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
	final ck val$callback;
	final int val$fittingMode;
	final String val$jobName;

	PrintHelper$PrintHelperApi19$1()
	{
		this$0 = final_printhelperapi19;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field PrintHelper$PrintHelperApi19 this$0>
		val$jobName = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field String val$jobName>
		val$fittingMode = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #32  <Field int val$fittingMode>
		val$bitmap = bitmap1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #34  <Field Bitmap val$bitmap>
		val$callback = ck.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #36  <Field PrintHelper$OnPrintFinishCallback val$callback>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #39  <Method void PrintDocumentAdapter()>
	//   17   31:return          
	}
}
