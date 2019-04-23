// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.print.PrintAttributes;
import java.io.FileNotFoundException;

// Referenced classes of package android.support.v4.print:
//			PrintHelper

class PrintHelper$PrintUriAdapter$1 extends AsyncTask
{

	protected transient Bitmap doInBackground(Uri auri[])
	{
		try
		{
			auri = ((Uri []) (loadConstrainedBitmap(mImageFile)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field PrintHelper$PrintUriAdapter this$1>
	//    2    4:getfield        #48  <Field PrintHelper PrintHelper$PrintUriAdapter.this$0>
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field PrintHelper$PrintUriAdapter this$1>
	//    5   11:getfield        #52  <Field Uri PrintHelper$PrintUriAdapter.mImageFile>
	//    6   14:invokevirtual   #56  <Method Bitmap PrintHelper.loadConstrainedBitmap(Uri)>
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
	//    2    2:checkcast       #59  <Class Uri[]>
	//    3    5:invokevirtual   #61  <Method Bitmap doInBackground(Uri[])>
	//    4    8:areturn         
	}

	protected void onCancelled(Bitmap bitmap)
	{
		val$layoutResultCallback.onLayoutCancelled();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
	//    2    4:invokevirtual   #68  <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutCancelled()>
		mLoadBitmap = null;
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field PrintHelper$PrintUriAdapter this$1>
	//    5   11:aconst_null     
	//    6   12:putfield        #72  <Field AsyncTask PrintHelper$PrintUriAdapter.mLoadBitmap>
	//    7   15:return          
	}

	protected volatile void onCancelled(Object obj)
	{
		onCancelled((Bitmap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #75  <Class Bitmap>
	//    3    5:invokevirtual   #77  <Method void onCancelled(Bitmap)>
	//    4    8:return          
	}

	protected void onPostExecute(Bitmap bitmap)
	{
		Object obj;
		super.onPostExecute(((Object) (bitmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #80  <Method void AsyncTask.onPostExecute(Object)>
		obj = ((Object) (bitmap));
	//    3    5:aload_1         
	//    4    6:astore_3        
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_109;
	//    5    7:aload_1         
	//    6    8:ifnull          109
		if(PrintHelper.PRINT_ACTIVITY_RESPECTS_ORIENTATION)
	//*   7   11:getstatic       #84  <Field boolean PrintHelper.PRINT_ACTIVITY_RESPECTS_ORIENTATION>
	//*   8   14:ifeq            32
		{
			obj = ((Object) (bitmap));
	//    9   17:aload_1         
	//   10   18:astore_3        
			if(mOrientation != 0)
				break MISSING_BLOCK_LABEL_109;
	//   11   19:aload_0         
	//   12   20:getfield        #28  <Field PrintHelper$PrintUriAdapter this$1>
	//   13   23:getfield        #48  <Field PrintHelper PrintHelper$PrintUriAdapter.this$0>
	//   14   26:getfield        #88  <Field int PrintHelper.mOrientation>
	//   15   29:ifne            109
		}
		this;
	//   16   32:aload_0         
		JVM INSTR monitorenter ;
	//   17   33:monitorenter    
		android.print.PrintAttributes.MediaSize mediasize = mAttributes.getMediaSize();
	//   18   34:aload_0         
	//   19   35:getfield        #28  <Field PrintHelper$PrintUriAdapter this$1>
	//   20   38:getfield        #91  <Field PrintAttributes PrintHelper$PrintUriAdapter.mAttributes>
	//   21   41:invokevirtual   #97  <Method android.print.PrintAttributes$MediaSize PrintAttributes.getMediaSize()>
	//   22   44:astore          4
		this;
	//   23   46:aload_0         
		JVM INSTR monitorexit ;
	//   24   47:monitorexit     
		obj = ((Object) (bitmap));
	//   25   48:aload_1         
	//   26   49:astore_3        
		if(mediasize != null)
	//*  27   50:aload           4
	//*  28   52:ifnull          109
		{
			obj = ((Object) (bitmap));
	//   29   55:aload_1         
	//   30   56:astore_3        
			if(mediasize.isPortrait() != PrintHelper.isPortrait(bitmap))
	//*  31   57:aload           4
	//*  32   59:invokevirtual   #103 <Method boolean android.print.PrintAttributes$MediaSize.isPortrait()>
	//*  33   62:aload_1         
	//*  34   63:invokestatic    #106 <Method boolean PrintHelper.isPortrait(Bitmap)>
	//*  35   66:icmpeq          109
			{
				obj = ((Object) (new Matrix()));
	//   36   69:new             #108 <Class Matrix>
	//   37   72:dup             
	//   38   73:invokespecial   #109 <Method void Matrix()>
	//   39   76:astore_3        
				((Matrix) (obj)).postRotate(90F);
	//   40   77:aload_3         
	//   41   78:ldc1            #110 <Float 90F>
	//   42   80:invokevirtual   #114 <Method boolean Matrix.postRotate(float)>
	//   43   83:pop             
				obj = ((Object) (Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true)));
	//   44   84:aload_1         
	//   45   85:iconst_0        
	//   46   86:iconst_0        
	//   47   87:aload_1         
	//   48   88:invokevirtual   #118 <Method int Bitmap.getWidth()>
	//   49   91:aload_1         
	//   50   92:invokevirtual   #121 <Method int Bitmap.getHeight()>
	//   51   95:aload_3         
	//   52   96:iconst_1        
	//   53   97:invokestatic    #125 <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int, Matrix, boolean)>
	//   54  100:astore_3        
			}
		}
		break MISSING_BLOCK_LABEL_109;
	//   55  101:goto            109
		bitmap;
	//   56  104:astore_1        
		this;
	//   57  105:aload_0         
		JVM INSTR monitorexit ;
	//   58  106:monitorexit     
		throw bitmap;
	//   59  107:aload_1         
	//   60  108:athrow          
		bitmap = ((Bitmap) (PrintHelper.PrintUriAdapter.this));
	//   61  109:aload_0         
	//   62  110:getfield        #28  <Field PrintHelper$PrintUriAdapter this$1>
	//   63  113:astore_1        
		bitmap.mBitmap = ((Bitmap) (obj));
	//   64  114:aload_1         
	//   65  115:aload_3         
	//   66  116:putfield        #129 <Field Bitmap PrintHelper$PrintUriAdapter.mBitmap>
		if(obj != null)
	//*  67  119:aload_3         
	//*  68  120:ifnull          172
		{
			bitmap = ((Bitmap) ((new android.print.PrintDocumentInfo.Builder(((PrintHelper.PrintUriAdapter) (bitmap)).mJobName)).setContentType(1).setPageCount(1).build()));
	//   69  123:new             #131 <Class android.print.PrintDocumentInfo$Builder>
	//   70  126:dup             
	//   71  127:aload_1         
	//   72  128:getfield        #135 <Field String PrintHelper$PrintUriAdapter.mJobName>
	//   73  131:invokespecial   #138 <Method void android.print.PrintDocumentInfo$Builder(String)>
	//   74  134:iconst_1        
	//   75  135:invokevirtual   #142 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
	//   76  138:iconst_1        
	//   77  139:invokevirtual   #145 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
	//   78  142:invokevirtual   #149 <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
	//   79  145:astore_1        
			boolean flag = val$newPrintAttributes.equals(((Object) (val$oldPrintAttributes)));
	//   80  146:aload_0         
	//   81  147:getfield        #32  <Field PrintAttributes val$newPrintAttributes>
	//   82  150:aload_0         
	//   83  151:getfield        #34  <Field PrintAttributes val$oldPrintAttributes>
	//   84  154:invokevirtual   #153 <Method boolean PrintAttributes.equals(Object)>
	//   85  157:istore_2        
			val$layoutResultCallback.onLayoutFinished(((android.print.PrintDocumentInfo) (bitmap)), true ^ flag);
	//   86  158:aload_0         
	//   87  159:getfield        #36  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
	//   88  162:aload_1         
	//   89  163:iconst_1        
	//   90  164:iload_2         
	//   91  165:ixor            
	//   92  166:invokevirtual   #157 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
		} else
	//*  93  169:goto            180
		{
			val$layoutResultCallback.onLayoutFailed(((CharSequence) (null)));
	//   94  172:aload_0         
	//   95  173:getfield        #36  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
	//   96  176:aconst_null     
	//   97  177:invokevirtual   #161 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFailed(CharSequence)>
		}
		mLoadBitmap = null;
	//   98  180:aload_0         
	//   99  181:getfield        #28  <Field PrintHelper$PrintUriAdapter this$1>
	//  100  184:aconst_null     
	//  101  185:putfield        #72  <Field AsyncTask PrintHelper$PrintUriAdapter.mLoadBitmap>
		return;
	//  102  188:return          
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((Bitmap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #75  <Class Bitmap>
	//    3    5:invokevirtual   #163 <Method void onPostExecute(Bitmap)>
	//    4    8:return          
	}

	protected void onPreExecute()
	{
		val$cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() {

			public void onCancel()
			{
				cancelLoad();
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field PrintHelper$PrintUriAdapter$1 this$2>
			//    2    4:getfield        #30  <Field PrintHelper$PrintUriAdapter PrintHelper$PrintUriAdapter$1.this$1>
			//    3    7:invokevirtual   #33  <Method void PrintHelper$PrintUriAdapter.cancelLoad()>
				cancel(false);
			//    4   10:aload_0         
			//    5   11:getfield        #22  <Field PrintHelper$PrintUriAdapter$1 this$2>
			//    6   14:iconst_0        
			//    7   15:invokevirtual   #37  <Method boolean PrintHelper$PrintUriAdapter$1.cancel(boolean)>
			//    8   18:pop             
			//    9   19:return          
			}

			final PrintHelper.PrintUriAdapter._cls1 this$2;

			
			{
				this$2 = PrintHelper.PrintUriAdapter._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field PrintHelper$PrintUriAdapter$1 this$2>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #24  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field CancellationSignal val$cancellationSignal>
	//    2    4:new             #15  <Class PrintHelper$PrintUriAdapter$1$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #167 <Method void PrintHelper$PrintUriAdapter$1$1(PrintHelper$PrintUriAdapter$1)>
	//    6   12:invokevirtual   #173 <Method void CancellationSignal.setOnCancelListener(android.os.CancellationSignal$OnCancelListener)>
	//    7   15:return          
	}

	final PrintHelper.PrintUriAdapter this$1;
	final CancellationSignal val$cancellationSignal;
	final android.print.ultCallback val$layoutResultCallback;
	final PrintAttributes val$newPrintAttributes;
	final PrintAttributes val$oldPrintAttributes;

	PrintHelper$PrintUriAdapter$1()
	{
		this$1 = final_printuriadapter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field PrintHelper$PrintUriAdapter this$1>
		val$cancellationSignal = cancellationsignal;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field CancellationSignal val$cancellationSignal>
		val$newPrintAttributes = printattributes;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #32  <Field PrintAttributes val$newPrintAttributes>
		val$oldPrintAttributes = printattributes1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #34  <Field PrintAttributes val$oldPrintAttributes>
		val$layoutResultCallback = android.print.ultCallback.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #36  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #39  <Method void AsyncTask()>
	//   17   31:return          
	}
}
