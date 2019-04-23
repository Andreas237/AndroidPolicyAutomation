// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.graphics.Bitmap;
import android.os.*;
import android.print.*;

// Referenced classes of package android.support.v4.print:
//			PrintHelper

private class PrintHelper$PrintBitmapAdapter extends PrintDocumentAdapter
{

	public void onFinish()
	{
		ck ck = mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field PrintHelper$OnPrintFinishCallback mCallback>
	//    2    4:astore_1        
		if(ck != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			ck.onFinish();
	//    5    9:aload_1         
	//    6   10:invokeinterface #43  <Method void PrintHelper$OnPrintFinishCallback.onFinish()>
	//    7   15:return          
	}

	public void onLayout(PrintAttributes printattributes, PrintAttributes printattributes1, CancellationSignal cancellationsignal, android.print.ltCallback ltcallback, Bundle bundle)
	{
		mAttributes = printattributes1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #47  <Field PrintAttributes mAttributes>
		ltcallback.onLayoutFinished((new android.print.PrintDocumentInfo.Builder(mJobName)).setContentType(1).setPageCount(1).build(), printattributes1.equals(((Object) (printattributes))) ^ true);
	//    3    5:aload           4
	//    4    7:new             #49  <Class android.print.PrintDocumentInfo$Builder>
	//    5   10:dup             
	//    6   11:aload_0         
	//    7   12:getfield        #31  <Field String mJobName>
	//    8   15:invokespecial   #52  <Method void android.print.PrintDocumentInfo$Builder(String)>
	//    9   18:iconst_1        
	//   10   19:invokevirtual   #56  <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
	//   11   22:iconst_1        
	//   12   23:invokevirtual   #59  <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
	//   13   26:invokevirtual   #63  <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
	//   14   29:aload_2         
	//   15   30:aload_1         
	//   16   31:invokevirtual   #69  <Method boolean PrintAttributes.equals(Object)>
	//   17   34:iconst_1        
	//   18   35:ixor            
	//   19   36:invokevirtual   #75  <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
	//   20   39:return          
	}

	public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.tCallback tcallback)
	{
		writeBitmap(mAttributes, mFittingMode, mBitmap, parcelfiledescriptor, cancellationsignal, tcallback);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field PrintHelper this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field PrintAttributes mAttributes>
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field int mFittingMode>
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field Bitmap mBitmap>
	//    8   16:aload_2         
	//    9   17:aload_3         
	//   10   18:aload           4
	//   11   20:invokevirtual   #81  <Method void PrintHelper.writeBitmap(PrintAttributes, int, Bitmap, ParcelFileDescriptor, CancellationSignal, android.print.PrintDocumentAdapter$WriteResultCallback)>
	//   12   23:return          
	}

	private PrintAttributes mAttributes;
	private final Bitmap mBitmap;
	private final ck mCallback;
	private final int mFittingMode;
	private final String mJobName;
	final PrintHelper this$0;

	PrintHelper$PrintBitmapAdapter(String s, int i, Bitmap bitmap, ck ck)
	{
		this$0 = PrintHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field PrintHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #29  <Method void PrintDocumentAdapter()>
		mJobName = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field String mJobName>
		mFittingMode = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #33  <Field int mFittingMode>
		mBitmap = bitmap;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field Bitmap mBitmap>
		mCallback = ck;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #37  <Field PrintHelper$OnPrintFinishCallback mCallback>
	//   17   31:return          
	}
}
