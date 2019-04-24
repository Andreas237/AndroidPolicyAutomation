// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.*;
import android.print.*;
import java.io.FileNotFoundException;

// Referenced classes of package android.support.v4.print:
//			PrintHelper

class PrintHelper$PrintHelperApi19$3$1 extends AsyncTask
{

	protected transient Bitmap doInBackground(Uri auri[])
	{
		try
		{
			auri = ((Uri []) (PrintHelper.PrintHelperApi19.access$400(this$0, val$imageFile)));
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
		// Misplaced declaration of an exception variable
		catch(Uri auri[])
	//*  10   20:astore_1        
		{
			return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
		}
		return ((Bitmap) (auri));
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
		val$layoutResultCallback.onLayoutCancelled();
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
		boolean flag;
		Object obj;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		super.onPostExecute(((Object) (bitmap)));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #82  <Method void AsyncTask.onPostExecute(Object)>
		obj = ((Object) (bitmap));
	//    5    7:aload_1         
	//    6    8:astore_3        
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_110;
	//    7    9:aload_1         
	//    8   10:ifnull          110
		if(mPrintActivityRespectsOrientation)
	//*   9   13:aload_0         
	//*  10   14:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
	//*  11   17:getfield        #50  <Field PrintHelper$PrintHelperApi19 PrintHelper$PrintHelperApi19$3.this$0>
	//*  12   20:getfield        #86  <Field boolean PrintHelper$PrintHelperApi19.mPrintActivityRespectsOrientation>
	//*  13   23:ifeq            41
		{
			obj = ((Object) (bitmap));
	//   14   26:aload_1         
	//   15   27:astore_3        
			if(mOrientation != 0)
				break MISSING_BLOCK_LABEL_110;
	//   16   28:aload_0         
	//   17   29:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
	//   18   32:getfield        #50  <Field PrintHelper$PrintHelperApi19 PrintHelper$PrintHelperApi19$3.this$0>
	//   19   35:getfield        #90  <Field int PrintHelper$PrintHelperApi19.mOrientation>
	//   20   38:ifne            110
		}
		this;
	//   21   41:aload_0         
		JVM INSTR monitorenter ;
	//   22   42:monitorenter    
		android.print.PrintAttributes.MediaSize mediasize = mAttributes.getMediaSize();
	//   23   43:aload_0         
	//   24   44:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
	//   25   47:invokestatic    #94  <Method PrintAttributes PrintHelper$PrintHelperApi19$3.access$500(PrintHelper$PrintHelperApi19$3)>
	//   26   50:invokevirtual   #100 <Method android.print.PrintAttributes$MediaSize PrintAttributes.getMediaSize()>
	//   27   53:astore          4
		this;
	//   28   55:aload_0         
		JVM INSTR monitorexit ;
	//   29   56:monitorexit     
		obj = ((Object) (bitmap));
	//   30   57:aload_1         
	//   31   58:astore_3        
		if(mediasize != null)
	//*  32   59:aload           4
	//*  33   61:ifnull          110
		{
			obj = ((Object) (bitmap));
	//   34   64:aload_1         
	//   35   65:astore_3        
			if(mediasize.isPortrait() != PrintHelper.PrintHelperApi19.access$600(bitmap))
	//*  36   66:aload           4
	//*  37   68:invokevirtual   #106 <Method boolean android.print.PrintAttributes$MediaSize.isPortrait()>
	//*  38   71:aload_1         
	//*  39   72:invokestatic    #110 <Method boolean PrintHelper$PrintHelperApi19.access$600(Bitmap)>
	//*  40   75:icmpeq          110
			{
				obj = ((Object) (new Matrix()));
	//   41   78:new             #112 <Class Matrix>
	//   42   81:dup             
	//   43   82:invokespecial   #113 <Method void Matrix()>
	//   44   85:astore_3        
				((Matrix) (obj)).postRotate(90F);
	//   45   86:aload_3         
	//   46   87:ldc1            #114 <Float 90F>
	//   47   89:invokevirtual   #118 <Method boolean Matrix.postRotate(float)>
	//   48   92:pop             
				obj = ((Object) (Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true)));
	//   49   93:aload_1         
	//   50   94:iconst_0        
	//   51   95:iconst_0        
	//   52   96:aload_1         
	//   53   97:invokevirtual   #122 <Method int Bitmap.getWidth()>
	//   54  100:aload_1         
	//   55  101:invokevirtual   #125 <Method int Bitmap.getHeight()>
	//   56  104:aload_3         
	//   57  105:iconst_1        
	//   58  106:invokestatic    #129 <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int, Matrix, boolean)>
	//   59  109:astore_3        
			}
		}
		mBitmap = ((Bitmap) (obj));
	//   60  110:aload_0         
	//   61  111:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
	//   62  114:aload_3         
	//   63  115:putfield        #133 <Field Bitmap PrintHelper$PrintHelperApi19$3.mBitmap>
		if(obj != null)
	//*  64  118:aload_3         
	//*  65  119:ifnull          190
		{
			bitmap = ((Bitmap) ((new android.print.PrintDocumentInfo.Builder(val$jobName)).setContentType(1).setPageCount(1).build()));
	//   66  122:new             #135 <Class android.print.PrintDocumentInfo$Builder>
	//   67  125:dup             
	//   68  126:aload_0         
	//   69  127:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
	//   70  130:getfield        #139 <Field String PrintHelper$PrintHelperApi19$3.val$jobName>
	//   71  133:invokespecial   #142 <Method void android.print.PrintDocumentInfo$Builder(String)>
	//   72  136:iconst_1        
	//   73  137:invokevirtual   #146 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
	//   74  140:iconst_1        
	//   75  141:invokevirtual   #149 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
	//   76  144:invokevirtual   #153 <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
	//   77  147:astore_1        
			if(val$newPrintAttributes.equals(((Object) (val$oldPrintAttributes))))
	//*  78  148:aload_0         
	//*  79  149:getfield        #34  <Field PrintAttributes val$newPrintAttributes>
	//*  80  152:aload_0         
	//*  81  153:getfield        #36  <Field PrintAttributes val$oldPrintAttributes>
	//*  82  156:invokevirtual   #157 <Method boolean PrintAttributes.equals(Object)>
	//*  83  159:ifne            185
	//*  84  162:aload_0         
	//*  85  163:getfield        #38  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
	//*  86  166:aload_1         
	//*  87  167:iload_2         
	//*  88  168:invokevirtual   #161 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
	//*  89  171:aload_0         
	//*  90  172:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
	//*  91  175:aconst_null     
	//*  92  176:putfield        #74  <Field AsyncTask PrintHelper$PrintHelperApi19$3.mLoadBitmap>
	//*  93  179:return          
	//*  94  180:astore_1        
	//*  95  181:aload_0         
	//*  96  182:monitorexit     
	//*  97  183:aload_1         
	//*  98  184:athrow          
				flag = false;
	//   99  185:iconst_0        
	//  100  186:istore_2        
			val$layoutResultCallback.onLayoutFinished(((android.print.PrintDocumentInfo) (bitmap)), flag);
		} else
	//* 101  187:goto            162
		{
			val$layoutResultCallback.onLayoutFailed(((CharSequence) (null)));
	//  102  190:aload_0         
	//  103  191:getfield        #38  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
	//  104  194:aconst_null     
	//  105  195:invokevirtual   #165 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFailed(CharSequence)>
		}
		mLoadBitmap = null;
		return;
		bitmap;
		this;
		JVM INSTR monitorexit ;
		throw bitmap;
	//* 106  198:goto            171
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
		val$cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() {

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

			final PrintHelper.PrintHelperApi19._cls3._cls1 this$2;

			
			{
				this$2 = PrintHelper.PrintHelperApi19._cls3._cls1.this;
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

	final PrintHelper.PrintHelperApi19._cls3 this$1;
	final CancellationSignal val$cancellationSignal;
	final android.print.Callback val$layoutResultCallback;
	final PrintAttributes val$newPrintAttributes;
	final PrintAttributes val$oldPrintAttributes;

	PrintHelper$PrintHelperApi19$3$1()
	{
		this$1 = final__pcls3;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
		val$cancellationSignal = cancellationsignal;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #32  <Field CancellationSignal val$cancellationSignal>
		val$newPrintAttributes = printattributes;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #34  <Field PrintAttributes val$newPrintAttributes>
		val$oldPrintAttributes = printattributes1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #36  <Field PrintAttributes val$oldPrintAttributes>
		val$layoutResultCallback = android.print.Callback.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #38  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #41  <Method void AsyncTask()>
	//   17   31:return          
	}

	// Unreferenced inner class android/support/v4/print/PrintHelper$PrintHelperApi19$3

/* anonymous class */
	class PrintHelper.PrintHelperApi19._cls3 extends PrintDocumentAdapter
	{

		private void cancelLoad()
		{
			synchronized(PrintHelper.PrintHelperApi19.access$700(PrintHelper.PrintHelperApi19.this))
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
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore          6
			this;
		//    2    3:aload_0         
			JVM INSTR monitorenter ;
		//    3    4:monitorenter    
			mAttributes = newPrintAttributes;
		//    4    5:aload_0         
		//    5    6:aload_2         
		//    6    7:putfield        #60  <Field PrintAttributes mAttributes>
			this;
		//    7   10:aload_0         
			JVM INSTR monitorexit ;
		//    8   11:monitorexit     
			if(cancellationSignal.isCanceled())
		//*   9   12:aload_3         
		//*  10   13:invokevirtual   #100 <Method boolean CancellationSignal.isCanceled()>
		//*  11   16:ifeq            30
			{
				layoutresultcallback.onLayoutCancelled();
		//   12   19:aload           4
		//   13   21:invokevirtual   #105 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutCancelled()>
				return;
		//   14   24:return          
			}
			break MISSING_BLOCK_LABEL_30;
			oldPrintAttributes;
		//   15   25:astore_1        
			this;
		//   16   26:aload_0         
			JVM INSTR monitorexit ;
		//   17   27:monitorexit     
			throw oldPrintAttributes;
		//   18   28:aload_1         
		//   19   29:athrow          
			if(mBitmap != null)
		//*  20   30:aload_0         
		//*  21   31:getfield        #50  <Field Bitmap mBitmap>
		//*  22   34:ifnull          83
			{
				cancellationSignal = ((CancellationSignal) ((new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build()));
		//   23   37:new             #107 <Class android.print.PrintDocumentInfo$Builder>
		//   24   40:dup             
		//   25   41:aload_0         
		//   26   42:getfield        #39  <Field String val$jobName>
		//   27   45:invokespecial   #110 <Method void android.print.PrintDocumentInfo$Builder(String)>
		//   28   48:iconst_1        
		//   29   49:invokevirtual   #114 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
		//   30   52:iconst_1        
		//   31   53:invokevirtual   #117 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
		//   32   56:invokevirtual   #121 <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
		//   33   59:astore_3        
				if(newPrintAttributes.equals(((Object) (oldPrintAttributes))))
		//*  34   60:aload_2         
		//*  35   61:aload_1         
		//*  36   62:invokevirtual   #127 <Method boolean PrintAttributes.equals(Object)>
		//*  37   65:ifne            77
		//*  38   68:aload           4
		//*  39   70:aload_3         
		//*  40   71:iload           6
		//*  41   73:invokevirtual   #131 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
		//*  42   76:return          
					flag = false;
		//   43   77:iconst_0        
		//   44   78:istore          6
				layoutresultcallback.onLayoutFinished(((android.print.PrintDocumentInfo) (cancellationSignal)), flag);
				return;
			} else
		//*  45   80:goto            68
			{
				mLoadBitmap = (((PrintHelper.PrintHelperApi19._cls3._cls1) (layoutresultcallback)). new PrintHelper.PrintHelperApi19._cls3._cls1()).execute(((Object []) (new Uri[0])));
		//   46   83:aload_0         
		//   47   84:new             #14  <Class PrintHelper$PrintHelperApi19$3$1>
		//   48   87:dup             
		//   49   88:aload_0         
		//   50   89:aload_3         
		//   51   90:aload_2         
		//   52   91:aload_1         
		//   53   92:aload           4
		//   54   94:invokespecial   #134 <Method void PrintHelper$PrintHelperApi19$3$1(PrintHelper$PrintHelperApi19$3, CancellationSignal, PrintAttributes, PrintAttributes, android.print.PrintDocumentAdapter$LayoutResultCallback)>
		//   55   97:iconst_0        
		//   56   98:anewarray       Uri[]
		//   57  101:invokevirtual   #140 <Method AsyncTask PrintHelper$PrintHelperApi19$3$1.execute(Object[])>
		//   58  104:putfield        #78  <Field AsyncTask mLoadBitmap>
				return;
		//   59  107:return          
			}
		}

		public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.WriteResultCallback writeresultcallback)
		{
			PrintHelper.PrintHelperApi19.access$000(PrintHelper.PrintHelperApi19.this, mAttributes, fittingMode, mBitmap, parcelfiledescriptor, cancellationsignal, writeresultcallback);
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
			static void access$300(PrintHelper.PrintHelperApi19._cls3 _pcls3)
			{
				_pcls3.cancelLoad();
			//    0    0:aload_0         
			//    1    1:invokespecial   #56  <Method void cancelLoad()>
				return;
			//    2    4:return          
			}

*/


/*
			static PrintAttributes access$500(PrintHelper.PrintHelperApi19._cls3 _pcls3)
			{
				return _pcls3.mAttributes;
			//    0    0:aload_0         
			//    1    1:getfield        #60  <Field PrintAttributes mAttributes>
			//    2    4:areturn         
			}

*/

			
			{
				this$0 = final_printhelperapi19;
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
				fittingMode = I.this;
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

}
