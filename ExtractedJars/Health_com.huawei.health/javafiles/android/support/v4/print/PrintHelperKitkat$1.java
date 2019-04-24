// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.graphics.Bitmap;
import android.os.*;
import android.print.*;

// Referenced classes of package android.support.v4.print:
//			PrintHelperKitkat

class PrintHelperKitkat$1 extends PrintDocumentAdapter
{

	public void onFinish()
	{
		if(val$callback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field PrintHelperKitkat$OnPrintFinishCallback val$callback>
	//*   2    4:ifnull          16
			val$callback.onFinish();
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field PrintHelperKitkat$OnPrintFinishCallback val$callback>
	//    5   11:invokeinterface #42  <Method void PrintHelperKitkat$OnPrintFinishCallback.onFinish()>
	//    6   16:return          
	}

	public void onLayout(PrintAttributes printattributes, PrintAttributes printattributes1, CancellationSignal cancellationsignal, android.print..LayoutResultCallback layoutresultcallback, Bundle bundle)
	{
		mAttributes = printattributes1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #46  <Field PrintAttributes mAttributes>
		cancellationsignal = ((CancellationSignal) ((new android.print.ilder(val$jobName)).setContentType(1).setPageCount(1).build()));
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

	public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print..WriteResultCallback writeresultcallback)
	{
		PrintHelperKitkat.access$000(PrintHelperKitkat.this, mAttributes, val$fittingMode, val$bitmap, parcelfiledescriptor, cancellationsignal, writeresultcallback);
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
	final PrintFinishCallback val$callback;
	final int val$fittingMode;
	final String val$jobName;

	PrintHelperKitkat$1()
	{
		this$0 = final_printhelperkitkat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field PrintHelperKitkat this$0>
		val$jobName = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field String val$jobName>
		val$fittingMode = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #29  <Field int val$fittingMode>
		val$bitmap = bitmap1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #31  <Field Bitmap val$bitmap>
		val$callback = PrintFinishCallback.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #33  <Field PrintHelperKitkat$OnPrintFinishCallback val$callback>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #36  <Method void PrintDocumentAdapter()>
	//   17   31:return          
	}
}
