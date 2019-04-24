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
//			PrintHelperKitkat

class PrintHelperKitkat$3$1$1
	implements android.os.celListener
{

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

	final PrintHelperKitkat._cls3._cls1 this$2;

	PrintHelperKitkat$3$1$1()
	{
		this$2 = PrintHelperKitkat._cls3._cls1.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field PrintHelperKitkat$3$1 this$2>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class android/support/v4/print/PrintHelperKitkat$3

/* anonymous class */
	class PrintHelperKitkat._cls3 extends PrintDocumentAdapter
	{

		private void cancelLoad()
		{
			Object obj = PrintHelperKitkat.access$700(PrintHelperKitkat.this);
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
				mLoadBitmap = ((PrintHelperKitkat._cls3._cls1) (((PrintHelperKitkat._cls3._cls1) (layoutresultcallback)). new PrintHelperKitkat._cls3._cls1())).execute(((Object []) (new Uri[0])));
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
			PrintHelperKitkat.access$000(PrintHelperKitkat.this, mAttributes, fittingMode, mBitmap, parcelfiledescriptor, cancellationsignal, writeresultcallback);
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
		final PrintHelperKitkat.OnPrintFinishCallback val$callback;
		final int val$fittingMode;
		final Uri val$imageFile;
		final String val$jobName;


/*
			static void access$300(PrintHelperKitkat._cls3 _pcls3)
			{
				_pcls3.cancelLoad();
			//    0    0:aload_0         
			//    1    1:invokespecial   #53  <Method void cancelLoad()>
				return;
			//    2    4:return          
			}

*/


/*
			static PrintAttributes access$500(PrintHelperKitkat._cls3 _pcls3)
			{
				return _pcls3.mAttributes;
			//    0    0:aload_0         
			//    1    1:getfield        #57  <Field PrintAttributes mAttributes>
			//    2    4:areturn         
			}

*/

			
			{
				this$0 = final_printhelperkitkat;
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
				fittingMode = I.this;
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


	// Unreferenced inner class android/support/v4/print/PrintHelperKitkat$3$1

/* anonymous class */
	class PrintHelperKitkat._cls3._cls1 extends AsyncTask
	{

		protected transient Bitmap doInBackground(Uri auri[])
		{
			try
			{
				auri = ((Uri []) (PrintHelperKitkat.access$400(this$0, imageFile, 3500)));
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
				if(mediasize.isPortrait() != PrintHelperKitkat.access$600(bitmap))
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
			cancellationSignal.setOnCancelListener(((android.os.CancellationSignal.OnCancelListener) (new PrintHelperKitkat._cls3._cls1._cls1())));
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field CancellationSignal val$cancellationSignal>
		//    2    4:new             #12  <Class PrintHelperKitkat$3$1$1>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:invokespecial   #168 <Method void PrintHelperKitkat$3$1$1(PrintHelperKitkat$3$1)>
		//    6   12:invokevirtual   #174 <Method void CancellationSignal.setOnCancelListener(android.os.CancellationSignal$OnCancelListener)>
		//    7   15:return          
		}

		final PrintHelperKitkat._cls3 this$1;
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

}
