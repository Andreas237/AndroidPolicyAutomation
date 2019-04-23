// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.*;
import android.net.Uri;
import android.os.*;
import android.print.*;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import java.io.*;

public final class PrintHelper
{
	public static interface OnPrintFinishCallback
	{

		public abstract void onFinish();
	}

	private class PrintBitmapAdapter extends PrintDocumentAdapter
	{

		public void onFinish()
		{
			OnPrintFinishCallback onprintfinishcallback = mCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field PrintHelper$OnPrintFinishCallback mCallback>
		//    2    4:astore_1        
			if(onprintfinishcallback != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          15
				onprintfinishcallback.onFinish();
		//    5    9:aload_1         
		//    6   10:invokeinterface #43  <Method void PrintHelper$OnPrintFinishCallback.onFinish()>
		//    7   15:return          
		}

		public void onLayout(PrintAttributes printattributes, PrintAttributes printattributes1, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.LayoutResultCallback layoutresultcallback, Bundle bundle)
		{
			mAttributes = printattributes1;
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:putfield        #47  <Field PrintAttributes mAttributes>
			layoutresultcallback.onLayoutFinished((new android.print.PrintDocumentInfo.Builder(mJobName)).setContentType(1).setPageCount(1).build(), printattributes1.equals(((Object) (printattributes))) ^ true);
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

		public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.WriteResultCallback writeresultcallback)
		{
			writeBitmap(mAttributes, mFittingMode, mBitmap, parcelfiledescriptor, cancellationsignal, writeresultcallback);
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
		private final OnPrintFinishCallback mCallback;
		private final int mFittingMode;
		private final String mJobName;
		final PrintHelper this$0;

		PrintBitmapAdapter(String s, int i, Bitmap bitmap, OnPrintFinishCallback onprintfinishcallback)
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
			mCallback = onprintfinishcallback;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #37  <Field PrintHelper$OnPrintFinishCallback mCallback>
		//   17   31:return          
		}
	}

	private class PrintUriAdapter extends PrintDocumentAdapter
	{

		void cancelLoad()
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field PrintHelper this$0>
		//*   2    4:getfield        #54  <Field Object PrintHelper.mLock>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:monitorenter    
			{
				if(mDecodeOptions != null)
		//*   6   10:aload_0         
		//*   7   11:getfield        #35  <Field PrintHelper this$0>
		//*   8   14:getfield        #58  <Field android.graphics.BitmapFactory$Options PrintHelper.mDecodeOptions>
		//*   9   17:ifnull          46
				{
					if(android.os.Build.VERSION.SDK_INT < 24)
		//*  10   20:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
		//*  11   23:bipush          24
		//*  12   25:icmpge          38
						mDecodeOptions.requestCancelDecode();
		//   13   28:aload_0         
		//   14   29:getfield        #35  <Field PrintHelper this$0>
		//   15   32:getfield        #58  <Field android.graphics.BitmapFactory$Options PrintHelper.mDecodeOptions>
		//   16   35:invokevirtual   #68  <Method void android.graphics.BitmapFactory$Options.requestCancelDecode()>
					mDecodeOptions = null;
		//   17   38:aload_0         
		//   18   39:getfield        #35  <Field PrintHelper this$0>
		//   19   42:aconst_null     
		//   20   43:putfield        #58  <Field android.graphics.BitmapFactory$Options PrintHelper.mDecodeOptions>
				}
			}
		//   21   46:aload_1         
		//   22   47:monitorexit     
			return;
		//   23   48:return          
			exception;
		//   24   49:astore_2        
			obj;
		//   25   50:aload_1         
			JVM INSTR monitorexit ;
		//   26   51:monitorexit     
			throw exception;
		//   27   52:aload_2         
		//   28   53:athrow          
		}

		public void onFinish()
		{
			super.onFinish();
		//    0    0:aload_0         
		//    1    1:invokespecial   #71  <Method void PrintDocumentAdapter.onFinish()>
			cancelLoad();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #73  <Method void cancelLoad()>
			Object obj = ((Object) (mLoadBitmap));
		//    4    8:aload_0         
		//    5    9:getfield        #75  <Field AsyncTask mLoadBitmap>
		//    6   12:astore_1        
			if(obj != null)
		//*   7   13:aload_1         
		//*   8   14:ifnull          23
				((AsyncTask) (obj)).cancel(true);
		//    9   17:aload_1         
		//   10   18:iconst_1        
		//   11   19:invokevirtual   #81  <Method boolean AsyncTask.cancel(boolean)>
		//   12   22:pop             
			obj = ((Object) (mCallback));
		//   13   23:aload_0         
		//   14   24:getfield        #44  <Field PrintHelper$OnPrintFinishCallback mCallback>
		//   15   27:astore_1        
			if(obj != null)
		//*  16   28:aload_1         
		//*  17   29:ifnull          38
				((OnPrintFinishCallback) (obj)).onFinish();
		//   18   32:aload_1         
		//   19   33:invokeinterface #84  <Method void PrintHelper$OnPrintFinishCallback.onFinish()>
			obj = ((Object) (mBitmap));
		//   20   38:aload_0         
		//   21   39:getfield        #48  <Field Bitmap mBitmap>
		//   22   42:astore_1        
			if(obj != null)
		//*  23   43:aload_1         
		//*  24   44:ifnull          56
			{
				((Bitmap) (obj)).recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #89  <Method void Bitmap.recycle()>
				mBitmap = null;
		//   27   51:aload_0         
		//   28   52:aconst_null     
		//   29   53:putfield        #48  <Field Bitmap mBitmap>
			}
		//   30   56:return          
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
		//    4    4:putfield        #93  <Field PrintAttributes mAttributes>
			this;
		//    5    7:aload_0         
			JVM INSTR monitorexit ;
		//    6    8:monitorexit     
			if(cancellationSignal.isCanceled())
		//*   7    9:aload_3         
		//*   8   10:invokevirtual   #99  <Method boolean CancellationSignal.isCanceled()>
		//*   9   13:ifeq            22
			{
				layoutresultcallback.onLayoutCancelled();
		//   10   16:aload           4
		//   11   18:invokevirtual   #104 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutCancelled()>
				return;
		//   12   21:return          
			}
			if(mBitmap != null)
		//*  13   22:aload_0         
		//*  14   23:getfield        #48  <Field Bitmap mBitmap>
		//*  15   26:ifnull          64
			{
				layoutresultcallback.onLayoutFinished((new android.print.PrintDocumentInfo.Builder(mJobName)).setContentType(1).setPageCount(1).build(), newPrintAttributes.equals(((Object) (oldPrintAttributes))) ^ true);
		//   16   29:aload           4
		//   17   31:new             #106 <Class android.print.PrintDocumentInfo$Builder>
		//   18   34:dup             
		//   19   35:aload_0         
		//   20   36:getfield        #40  <Field String mJobName>
		//   21   39:invokespecial   #109 <Method void android.print.PrintDocumentInfo$Builder(String)>
		//   22   42:iconst_1        
		//   23   43:invokevirtual   #113 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
		//   24   46:iconst_1        
		//   25   47:invokevirtual   #116 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
		//   26   50:invokevirtual   #120 <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
		//   27   53:aload_2         
		//   28   54:aload_1         
		//   29   55:invokevirtual   #126 <Method boolean PrintAttributes.equals(Object)>
		//   30   58:iconst_1        
		//   31   59:ixor            
		//   32   60:invokevirtual   #130 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
				return;
		//   33   63:return          
			} else
			{
				mLoadBitmap = ((_cls1) (((_cls1) (layoutresultcallback)). new AsyncTask() {

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
						layoutResultCallback.onLayoutCancelled();
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
						bitmap = ((Bitmap) (PrintUriAdapter.this));
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
							bitmap = ((Bitmap) ((new android.print.PrintDocumentInfo.Builder(((PrintUriAdapter) (bitmap)).mJobName)).setContentType(1).setPageCount(1).build()));
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
							boolean flag = newPrintAttributes.equals(((Object) (oldPrintAttributes)));
					//   80  146:aload_0         
					//   81  147:getfield        #32  <Field PrintAttributes val$newPrintAttributes>
					//   82  150:aload_0         
					//   83  151:getfield        #34  <Field PrintAttributes val$oldPrintAttributes>
					//   84  154:invokevirtual   #153 <Method boolean PrintAttributes.equals(Object)>
					//   85  157:istore_2        
							layoutResultCallback.onLayoutFinished(((android.print.PrintDocumentInfo) (bitmap)), true ^ flag);
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
							layoutResultCallback.onLayoutFailed(((CharSequence) (null)));
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
						cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() {

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

							final PrintUriAdapter._cls1 this$2;

			
			{
				this$2 = PrintUriAdapter._cls1.this;
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

					final PrintUriAdapter this$1;
					final CancellationSignal val$cancellationSignal;
					final android.print.PrintDocumentAdapter.LayoutResultCallback val$layoutResultCallback;
					final PrintAttributes val$newPrintAttributes;
					final PrintAttributes val$oldPrintAttributes;

			
			{
				this$1 = final_printuriadapter;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field PrintHelper$PrintUriAdapter this$1>
				cancellationSignal = cancellationsignal;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #30  <Field CancellationSignal val$cancellationSignal>
				newPrintAttributes = printattributes;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #32  <Field PrintAttributes val$newPrintAttributes>
				oldPrintAttributes = printattributes1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #34  <Field PrintAttributes val$oldPrintAttributes>
				layoutResultCallback = android.print.PrintDocumentAdapter.LayoutResultCallback.this;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #36  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #39  <Method void AsyncTask()>
			//   17   31:return          
			}
				}
)).execute(((Object []) (new Uri[0])));
		//   34   64:aload_0         
		//   35   65:new             #9   <Class PrintHelper$PrintUriAdapter$1>
		//   36   68:dup             
		//   37   69:aload_0         
		//   38   70:aload_3         
		//   39   71:aload_2         
		//   40   72:aload_1         
		//   41   73:aload           4
		//   42   75:invokespecial   #133 <Method void PrintHelper$PrintUriAdapter$1(PrintHelper$PrintUriAdapter, CancellationSignal, PrintAttributes, PrintAttributes, android.print.PrintDocumentAdapter$LayoutResultCallback)>
		//   43   78:iconst_0        
		//   44   79:anewarray       Uri[]
		//   45   82:invokevirtual   #139 <Method AsyncTask PrintHelper$PrintUriAdapter$1.execute(Object[])>
		//   46   85:putfield        #75  <Field AsyncTask mLoadBitmap>
				return;
		//   47   88:return          
			}
			oldPrintAttributes;
		//   48   89:astore_1        
			this;
		//   49   90:aload_0         
			JVM INSTR monitorexit ;
		//   50   91:monitorexit     
			throw oldPrintAttributes;
		//   51   92:aload_1         
		//   52   93:athrow          
		}

		public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.WriteResultCallback writeresultcallback)
		{
			writeBitmap(mAttributes, mFittingMode, mBitmap, parcelfiledescriptor, cancellationsignal, writeresultcallback);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field PrintHelper this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #93  <Field PrintAttributes mAttributes>
		//    4    8:aload_0         
		//    5    9:getfield        #46  <Field int mFittingMode>
		//    6   12:aload_0         
		//    7   13:getfield        #48  <Field Bitmap mBitmap>
		//    8   16:aload_2         
		//    9   17:aload_3         
		//   10   18:aload           4
		//   11   20:invokevirtual   #145 <Method void PrintHelper.writeBitmap(PrintAttributes, int, Bitmap, ParcelFileDescriptor, CancellationSignal, android.print.PrintDocumentAdapter$WriteResultCallback)>
		//   12   23:return          
		}

		PrintAttributes mAttributes;
		Bitmap mBitmap;
		final OnPrintFinishCallback mCallback;
		final int mFittingMode;
		final Uri mImageFile;
		final String mJobName;
		AsyncTask mLoadBitmap;
		final PrintHelper this$0;

		PrintUriAdapter(String s, Uri uri, OnPrintFinishCallback onprintfinishcallback, int i)
		{
			this$0 = PrintHelper.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #35  <Field PrintHelper this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #38  <Method void PrintDocumentAdapter()>
			mJobName = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #40  <Field String mJobName>
			mImageFile = uri;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #42  <Field Uri mImageFile>
			mCallback = onprintfinishcallback;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #44  <Field PrintHelper$OnPrintFinishCallback mCallback>
			mFittingMode = i;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #46  <Field int mFittingMode>
			mBitmap = null;
		//   17   31:aload_0         
		//   18   32:aconst_null     
		//   19   33:putfield        #48  <Field Bitmap mBitmap>
		//   20   36:return          
		}
	}


	public PrintHelper(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
		mDecodeOptions = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #68  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
	//    5    9:aload_0         
	//    6   10:new             #4   <Class Object>
	//    7   13:dup             
	//    8   14:invokespecial   #66  <Method void Object()>
	//    9   17:putfield        #70  <Field Object mLock>
		mScaleMode = 2;
	//   10   20:aload_0         
	//   11   21:iconst_2        
	//   12   22:putfield        #72  <Field int mScaleMode>
		mColorMode = 2;
	//   13   25:aload_0         
	//   14   26:iconst_2        
	//   15   27:putfield        #74  <Field int mColorMode>
		mOrientation = 1;
	//   16   30:aload_0         
	//   17   31:iconst_1        
	//   18   32:putfield        #76  <Field int mOrientation>
		mContext = context;
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:putfield        #78  <Field Context mContext>
	//   22   40:return          
	}

	static Bitmap convertBitmapForColorMode(Bitmap bitmap, int i)
	{
		if(i != 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpeq          7
		{
			return bitmap;
	//    3    5:aload_0         
	//    4    6:areturn         
		} else
		{
			Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
	//    5    7:aload_0         
	//    6    8:invokevirtual   #87  <Method int Bitmap.getWidth()>
	//    7   11:aload_0         
	//    8   12:invokevirtual   #90  <Method int Bitmap.getHeight()>
	//    9   15:getstatic       #96  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   10   18:invokestatic    #100 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   11   21:astore_2        
			Canvas canvas = new Canvas(bitmap1);
	//   12   22:new             #102 <Class Canvas>
	//   13   25:dup             
	//   14   26:aload_2         
	//   15   27:invokespecial   #105 <Method void Canvas(Bitmap)>
	//   16   30:astore_3        
			Paint paint = new Paint();
	//   17   31:new             #107 <Class Paint>
	//   18   34:dup             
	//   19   35:invokespecial   #108 <Method void Paint()>
	//   20   38:astore          4
			ColorMatrix colormatrix = new ColorMatrix();
	//   21   40:new             #110 <Class ColorMatrix>
	//   22   43:dup             
	//   23   44:invokespecial   #111 <Method void ColorMatrix()>
	//   24   47:astore          5
			colormatrix.setSaturation(0.0F);
	//   25   49:aload           5
	//   26   51:fconst_0        
	//   27   52:invokevirtual   #115 <Method void ColorMatrix.setSaturation(float)>
			paint.setColorFilter(((android.graphics.ColorFilter) (new ColorMatrixColorFilter(colormatrix))));
	//   28   55:aload           4
	//   29   57:new             #117 <Class ColorMatrixColorFilter>
	//   30   60:dup             
	//   31   61:aload           5
	//   32   63:invokespecial   #120 <Method void ColorMatrixColorFilter(ColorMatrix)>
	//   33   66:invokevirtual   #124 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   34   69:pop             
			canvas.drawBitmap(bitmap, 0.0F, 0.0F, paint);
	//   35   70:aload_3         
	//   36   71:aload_0         
	//   37   72:fconst_0        
	//   38   73:fconst_0        
	//   39   74:aload           4
	//   40   76:invokevirtual   #128 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
			canvas.setBitmap(((Bitmap) (null)));
	//   41   79:aload_3         
	//   42   80:aconst_null     
	//   43   81:invokevirtual   #131 <Method void Canvas.setBitmap(Bitmap)>
			return bitmap1;
	//   44   84:aload_2         
	//   45   85:areturn         
		}
	}

	private static android.print.PrintAttributes.Builder copyAttributes(PrintAttributes printattributes)
	{
		android.print.PrintAttributes.Builder builder = (new android.print.PrintAttributes.Builder()).setMediaSize(printattributes.getMediaSize()).setResolution(printattributes.getResolution()).setMinMargins(printattributes.getMinMargins());
	//    0    0:new             #137 <Class android.print.PrintAttributes$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void android.print.PrintAttributes$Builder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #144 <Method android.print.PrintAttributes$MediaSize PrintAttributes.getMediaSize()>
	//    5   11:invokevirtual   #148 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #152 <Method android.print.PrintAttributes$Resolution PrintAttributes.getResolution()>
	//    8   18:invokevirtual   #156 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setResolution(android.print.PrintAttributes$Resolution)>
	//    9   21:aload_0         
	//   10   22:invokevirtual   #160 <Method android.print.PrintAttributes$Margins PrintAttributes.getMinMargins()>
	//   11   25:invokevirtual   #164 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMinMargins(android.print.PrintAttributes$Margins)>
	//   12   28:astore_1        
		if(printattributes.getColorMode() != 0)
	//*  13   29:aload_0         
	//*  14   30:invokevirtual   #167 <Method int PrintAttributes.getColorMode()>
	//*  15   33:ifeq            45
			builder.setColorMode(printattributes.getColorMode());
	//   16   36:aload_1         
	//   17   37:aload_0         
	//   18   38:invokevirtual   #167 <Method int PrintAttributes.getColorMode()>
	//   19   41:invokevirtual   #171 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setColorMode(int)>
	//   20   44:pop             
		if(android.os.Build.VERSION.SDK_INT >= 23 && printattributes.getDuplexMode() != 0)
	//*  21   45:getstatic       #56  <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   48:bipush          23
	//*  23   50:icmplt          69
	//*  24   53:aload_0         
	//*  25   54:invokevirtual   #174 <Method int PrintAttributes.getDuplexMode()>
	//*  26   57:ifeq            69
			builder.setDuplexMode(printattributes.getDuplexMode());
	//   27   60:aload_1         
	//   28   61:aload_0         
	//   29   62:invokevirtual   #174 <Method int PrintAttributes.getDuplexMode()>
	//   30   65:invokevirtual   #177 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setDuplexMode(int)>
	//   31   68:pop             
		return builder;
	//   32   69:aload_1         
	//   33   70:areturn         
	}

	static Matrix getMatrix(int i, int j, RectF rectf, int k)
	{
		Matrix matrix = new Matrix();
	//    0    0:new             #182 <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #183 <Method void Matrix()>
	//    3    7:astore          6
		float f = rectf.width();
	//    4    9:aload_2         
	//    5   10:invokevirtual   #189 <Method float RectF.width()>
	//    6   13:fstore          4
		float f1 = i;
	//    7   15:iload_0         
	//    8   16:i2f             
	//    9   17:fstore          5
		f /= f1;
	//   10   19:fload           4
	//   11   21:fload           5
	//   12   23:fdiv            
	//   13   24:fstore          4
		if(k == 2)
	//*  14   26:iload_3         
	//*  15   27:iconst_2        
	//*  16   28:icmpne          48
			f = Math.max(f, rectf.height() / (float)j);
	//   17   31:fload           4
	//   18   33:aload_2         
	//   19   34:invokevirtual   #192 <Method float RectF.height()>
	//   20   37:iload_1         
	//   21   38:i2f             
	//   22   39:fdiv            
	//   23   40:invokestatic    #198 <Method float Math.max(float, float)>
	//   24   43:fstore          4
		else
	//*  25   45:goto            62
			f = Math.min(f, rectf.height() / (float)j);
	//   26   48:fload           4
	//   27   50:aload_2         
	//   28   51:invokevirtual   #192 <Method float RectF.height()>
	//   29   54:iload_1         
	//   30   55:i2f             
	//   31   56:fdiv            
	//   32   57:invokestatic    #201 <Method float Math.min(float, float)>
	//   33   60:fstore          4
		matrix.postScale(f, f);
	//   34   62:aload           6
	//   35   64:fload           4
	//   36   66:fload           4
	//   37   68:invokevirtual   #205 <Method boolean Matrix.postScale(float, float)>
	//   38   71:pop             
		matrix.postTranslate((rectf.width() - f1 * f) / 2.0F, (rectf.height() - (float)j * f) / 2.0F);
	//   39   72:aload           6
	//   40   74:aload_2         
	//   41   75:invokevirtual   #189 <Method float RectF.width()>
	//   42   78:fload           5
	//   43   80:fload           4
	//   44   82:fmul            
	//   45   83:fsub            
	//   46   84:fconst_2        
	//   47   85:fdiv            
	//   48   86:aload_2         
	//   49   87:invokevirtual   #192 <Method float RectF.height()>
	//   50   90:iload_1         
	//   51   91:i2f             
	//   52   92:fload           4
	//   53   94:fmul            
	//   54   95:fsub            
	//   55   96:fconst_2        
	//   56   97:fdiv            
	//   57   98:invokevirtual   #208 <Method boolean Matrix.postTranslate(float, float)>
	//   58  101:pop             
		return matrix;
	//   59  102:aload           6
	//   60  104:areturn         
	}

	static boolean isPortrait(Bitmap bitmap)
	{
		return bitmap.getWidth() <= bitmap.getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method int Bitmap.getWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #90  <Method int Bitmap.getHeight()>
	//    4    8:icmpgt          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private Bitmap loadBitmap(Uri uri, android.graphics.BitmapFactory.Options options)
		throws FileNotFoundException
	{
		Exception exception;
		Context context;
		if(uri == null)
			break MISSING_BLOCK_LABEL_90;
	//    0    0:aload_1         
	//    1    1:ifnull          90
		context = mContext;
	//    2    4:aload_0         
	//    3    5:getfield        #78  <Field Context mContext>
	//    4    8:astore          4
		if(context == null)
			break MISSING_BLOCK_LABEL_90;
	//    5   10:aload           4
	//    6   12:ifnull          90
		exception = null;
	//    7   15:aconst_null     
	//    8   16:astore_3        
		uri = ((Uri) (context.getContentResolver().openInputStream(uri)));
	//    9   17:aload           4
	//   10   19:invokevirtual   #222 <Method ContentResolver Context.getContentResolver()>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #228 <Method InputStream ContentResolver.openInputStream(Uri)>
	//   13   26:astore_1        
		options = ((android.graphics.BitmapFactory.Options) (BitmapFactory.decodeStream(((InputStream) (uri)), ((android.graphics.Rect) (null)), options)));
	//   14   27:aload_1         
	//   15   28:aconst_null     
	//   16   29:aload_2         
	//   17   30:invokestatic    #234 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   18   33:astore_2        
		if(uri == null)
			break MISSING_BLOCK_LABEL_54;
	//   19   34:aload_1         
	//   20   35:ifnull          54
		((InputStream) (uri)).close();
	//   21   38:aload_1         
	//   22   39:invokevirtual   #239 <Method void InputStream.close()>
		return ((Bitmap) (options));
	//   23   42:aload_2         
	//   24   43:areturn         
		uri;
	//   25   44:astore_1        
		Log.w("PrintHelper", "close fail ", ((Throwable) (uri)));
	//   26   45:ldc1            #33  <String "PrintHelper">
	//   27   47:ldc1            #241 <String "close fail ">
	//   28   49:aload_1         
	//   29   50:invokestatic    #247 <Method int Log.w(String, String, Throwable)>
	//   30   53:pop             
		return ((Bitmap) (options));
	//   31   54:aload_2         
	//   32   55:areturn         
		exception;
	//   33   56:astore_3        
		options = ((android.graphics.BitmapFactory.Options) (uri));
	//   34   57:aload_1         
	//   35   58:astore_2        
		uri = ((Uri) (exception));
	//   36   59:aload_3         
	//   37   60:astore_1        
		break MISSING_BLOCK_LABEL_67;
	//   38   61:goto            67
		uri;
	//   39   64:astore_1        
		options = ((android.graphics.BitmapFactory.Options) (exception));
	//   40   65:aload_3         
	//   41   66:astore_2        
		if(options != null)
	//*  42   67:aload_2         
	//*  43   68:ifnull          88
			try
			{
				((InputStream) (options)).close();
	//   44   71:aload_2         
	//   45   72:invokevirtual   #239 <Method void InputStream.close()>
			}
	//*  46   75:goto            88
			// Misplaced declaration of an exception variable
			catch(android.graphics.BitmapFactory.Options options)
	//*  47   78:astore_2        
			{
				Log.w("PrintHelper", "close fail ", ((Throwable) (options)));
	//   48   79:ldc1            #33  <String "PrintHelper">
	//   49   81:ldc1            #241 <String "close fail ">
	//   50   83:aload_2         
	//   51   84:invokestatic    #247 <Method int Log.w(String, String, Throwable)>
	//   52   87:pop             
			}
		throw uri;
	//   53   88:aload_1         
	//   54   89:athrow          
		throw new IllegalArgumentException("bad argument to loadBitmap");
	//   55   90:new             #249 <Class IllegalArgumentException>
	//   56   93:dup             
	//   57   94:ldc1            #251 <String "bad argument to loadBitmap">
	//   58   96:invokespecial   #254 <Method void IllegalArgumentException(String)>
	//   59   99:athrow          
	}

	public static boolean systemSupportsPrint()
	{
		return android.os.Build.VERSION.SDK_INT >= 19;
	//    0    0:getstatic       #56  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          19
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public int getColorMode()
	{
		return mColorMode;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int mColorMode>
	//    2    4:ireturn         
	}

	public int getOrientation()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19 && mOrientation == 0)
	//*   0    0:getstatic       #56  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          17
	//*   3    8:aload_0         
	//*   4    9:getfield        #76  <Field int mOrientation>
	//*   5   12:ifne            17
			return 1;
	//    6   15:iconst_1        
	//    7   16:ireturn         
		else
			return mOrientation;
	//    8   17:aload_0         
	//    9   18:getfield        #76  <Field int mOrientation>
	//   10   21:ireturn         
	}

	public int getScaleMode()
	{
		return mScaleMode;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int mScaleMode>
	//    2    4:ireturn         
	}

	Bitmap loadConstrainedBitmap(Uri uri)
		throws FileNotFoundException
	{
		android.graphics.BitmapFactory.Options options1;
		if(uri == null || mContext == null)
			break MISSING_BLOCK_LABEL_220;
	//    0    0:aload_1         
	//    1    1:ifnull          220
	//    2    4:aload_0         
	//    3    5:getfield        #78  <Field Context mContext>
	//    4    8:ifnull          220
		android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
	//    5   11:new             #263 <Class android.graphics.BitmapFactory$Options>
	//    6   14:dup             
	//    7   15:invokespecial   #264 <Method void android.graphics.BitmapFactory$Options()>
	//    8   18:astore          6
		options.inJustDecodeBounds = true;
	//    9   20:aload           6
	//   10   22:iconst_1        
	//   11   23:putfield        #267 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		loadBitmap(uri, options);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload           6
	//   15   30:invokespecial   #269 <Method Bitmap loadBitmap(Uri, android.graphics.BitmapFactory$Options)>
	//   16   33:pop             
		int k = options.outWidth;
	//   17   34:aload           6
	//   18   36:getfield        #272 <Field int android.graphics.BitmapFactory$Options.outWidth>
	//   19   39:istore          4
		int l = options.outHeight;
	//   20   41:aload           6
	//   21   43:getfield        #275 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//   22   46:istore          5
		if(k <= 0)
			break MISSING_BLOCK_LABEL_218;
	//   23   48:iload           4
	//   24   50:ifle            218
		if(l <= 0)
	//*  25   53:iload           5
	//*  26   55:ifgt            60
			return null;
	//   27   58:aconst_null     
	//   28   59:areturn         
		int j = Math.max(k, l);
	//   29   60:iload           4
	//   30   62:iload           5
	//   31   64:invokestatic    #278 <Method int Math.max(int, int)>
	//   32   67:istore_3        
		int i;
		for(i = 1; j > 3500; i <<= 1)
	//*  33   68:iconst_1        
	//*  34   69:istore_2        
	//*  35   70:iload_3         
	//*  36   71:sipush          3500
	//*  37   74:icmple          88
			j >>>= 1;
	//   38   77:iload_3         
	//   39   78:iconst_1        
	//   40   79:iushr           
	//   41   80:istore_3        

	//   42   81:iload_2         
	//   43   82:iconst_1        
	//   44   83:ishl            
	//   45   84:istore_2        
	//*  46   85:goto            70
		if(i <= 0)
			break MISSING_BLOCK_LABEL_216;
	//   47   88:iload_2         
	//   48   89:ifle            216
		if(Math.min(k, l) / i <= 0)
	//*  49   92:iload           4
	//*  50   94:iload           5
	//*  51   96:invokestatic    #280 <Method int Math.min(int, int)>
	//*  52   99:iload_2         
	//*  53  100:idiv            
	//*  54  101:ifgt            106
			return null;
	//   55  104:aconst_null     
	//   56  105:areturn         
		synchronized(mLock)
	//*  57  106:aload_0         
	//*  58  107:getfield        #70  <Field Object mLock>
	//*  59  110:astore          6
	//*  60  112:aload           6
	//*  61  114:monitorenter    
		{
			mDecodeOptions = new android.graphics.BitmapFactory.Options();
	//   62  115:aload_0         
	//   63  116:new             #263 <Class android.graphics.BitmapFactory$Options>
	//   64  119:dup             
	//   65  120:invokespecial   #264 <Method void android.graphics.BitmapFactory$Options()>
	//   66  123:putfield        #68  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
			mDecodeOptions.inMutable = true;
	//   67  126:aload_0         
	//   68  127:getfield        #68  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
	//   69  130:iconst_1        
	//   70  131:putfield        #283 <Field boolean android.graphics.BitmapFactory$Options.inMutable>
			mDecodeOptions.inSampleSize = i;
	//   71  134:aload_0         
	//   72  135:getfield        #68  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
	//   73  138:iload_2         
	//   74  139:putfield        #286 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
			options1 = mDecodeOptions;
	//   75  142:aload_0         
	//   76  143:getfield        #68  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
	//   77  146:astore          7
		}
	//   78  148:aload           6
	//   79  150:monitorexit     
		obj = ((Object) (loadBitmap(uri, options1)));
	//   80  151:aload_0         
	//   81  152:aload_1         
	//   82  153:aload           7
	//   83  155:invokespecial   #269 <Method Bitmap loadBitmap(Uri, android.graphics.BitmapFactory$Options)>
	//   84  158:astore          6
		synchronized(mLock)
	//*  85  160:aload_0         
	//*  86  161:getfield        #70  <Field Object mLock>
	//*  87  164:astore_1        
	//*  88  165:aload_1         
	//*  89  166:monitorenter    
		{
			mDecodeOptions = null;
	//   90  167:aload_0         
	//   91  168:aconst_null     
	//   92  169:putfield        #68  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
		}
	//   93  172:aload_1         
	//   94  173:monitorexit     
		return ((Bitmap) (obj));
	//   95  174:aload           6
	//   96  176:areturn         
		obj;
	//   97  177:astore          6
		uri;
	//   98  179:aload_1         
		JVM INSTR monitorexit ;
	//   99  180:monitorexit     
		throw obj;
	//  100  181:aload           6
	//  101  183:athrow          
		obj;
	//  102  184:astore          6
		synchronized(mLock)
	//* 103  186:aload_0         
	//* 104  187:getfield        #70  <Field Object mLock>
	//* 105  190:astore_1        
	//* 106  191:aload_1         
	//* 107  192:monitorenter    
		{
			mDecodeOptions = null;
	//  108  193:aload_0         
	//  109  194:aconst_null     
	//  110  195:putfield        #68  <Field android.graphics.BitmapFactory$Options mDecodeOptions>
		}
	//  111  198:aload_1         
	//  112  199:monitorexit     
		throw obj;
	//  113  200:aload           6
	//  114  202:athrow          
		obj;
	//  115  203:astore          6
		uri;
	//  116  205:aload_1         
		JVM INSTR monitorexit ;
	//  117  206:monitorexit     
		throw obj;
	//  118  207:aload           6
	//  119  209:athrow          
		uri;
	//  120  210:astore_1        
		obj;
	//  121  211:aload           6
		JVM INSTR monitorexit ;
	//  122  213:monitorexit     
		throw uri;
	//  123  214:aload_1         
	//  124  215:athrow          
		return null;
	//  125  216:aconst_null     
	//  126  217:areturn         
		return null;
	//  127  218:aconst_null     
	//  128  219:areturn         
		throw new IllegalArgumentException("bad argument to getScaledBitmap");
	//  129  220:new             #249 <Class IllegalArgumentException>
	//  130  223:dup             
	//  131  224:ldc2            #288 <String "bad argument to getScaledBitmap">
	//  132  227:invokespecial   #254 <Method void IllegalArgumentException(String)>
	//  133  230:athrow          
	}

	public void printBitmap(String s, Bitmap bitmap)
	{
		printBitmap(s, bitmap, ((OnPrintFinishCallback) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #293 <Method void printBitmap(String, Bitmap, PrintHelper$OnPrintFinishCallback)>
	//    5    7:return          
	}

	public void printBitmap(String s, Bitmap bitmap, OnPrintFinishCallback onprintfinishcallback)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #56  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          97
		{
			if(bitmap == null)
	//*   3    8:aload_2         
	//*   4    9:ifnonnull       13
				return;
	//    5   12:return          
			PrintManager printmanager = (PrintManager)mContext.getSystemService("print");
	//    6   13:aload_0         
	//    7   14:getfield        #78  <Field Context mContext>
	//    8   17:ldc2            #296 <String "print">
	//    9   20:invokevirtual   #300 <Method Object Context.getSystemService(String)>
	//   10   23:checkcast       #302 <Class PrintManager>
	//   11   26:astore          5
			Object obj;
			if(isPortrait(bitmap))
	//*  12   28:aload_2         
	//*  13   29:invokestatic    #304 <Method boolean isPortrait(Bitmap)>
	//*  14   32:ifeq            43
				obj = ((Object) (android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT));
	//   15   35:getstatic       #310 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_PORTRAIT>
	//   16   38:astore          4
			else
	//*  17   40:goto            48
				obj = ((Object) (android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE));
	//   18   43:getstatic       #313 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_LANDSCAPE>
	//   19   46:astore          4
			obj = ((Object) ((new android.print.PrintAttributes.Builder()).setMediaSize(((android.print.PrintAttributes.MediaSize) (obj))).setColorMode(mColorMode).build()));
	//   20   48:new             #137 <Class android.print.PrintAttributes$Builder>
	//   21   51:dup             
	//   22   52:invokespecial   #138 <Method void android.print.PrintAttributes$Builder()>
	//   23   55:aload           4
	//   24   57:invokevirtual   #148 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
	//   25   60:aload_0         
	//   26   61:getfield        #74  <Field int mColorMode>
	//   27   64:invokevirtual   #171 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setColorMode(int)>
	//   28   67:invokevirtual   #317 <Method PrintAttributes android.print.PrintAttributes$Builder.build()>
	//   29   70:astore          4
			printmanager.print(s, ((PrintDocumentAdapter) (new PrintBitmapAdapter(s, mScaleMode, bitmap, onprintfinishcallback))), ((PrintAttributes) (obj)));
	//   30   72:aload           5
	//   31   74:aload_1         
	//   32   75:new             #11  <Class PrintHelper$PrintBitmapAdapter>
	//   33   78:dup             
	//   34   79:aload_0         
	//   35   80:aload_1         
	//   36   81:aload_0         
	//   37   82:getfield        #72  <Field int mScaleMode>
	//   38   85:aload_2         
	//   39   86:aload_3         
	//   40   87:invokespecial   #320 <Method void PrintHelper$PrintBitmapAdapter(PrintHelper, String, int, Bitmap, PrintHelper$OnPrintFinishCallback)>
	//   41   90:aload           4
	//   42   92:invokevirtual   #323 <Method android.print.PrintJob PrintManager.print(String, PrintDocumentAdapter, PrintAttributes)>
	//   43   95:pop             
			return;
	//   44   96:return          
		} else
		{
			return;
	//   45   97:return          
		}
	}

	public void printBitmap(String s, Uri uri)
		throws FileNotFoundException
	{
		printBitmap(s, uri, ((OnPrintFinishCallback) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #327 <Method void printBitmap(String, Uri, PrintHelper$OnPrintFinishCallback)>
	//    5    7:return          
	}

	public void printBitmap(String s, Uri uri, OnPrintFinishCallback onprintfinishcallback)
		throws FileNotFoundException
	{
		if(android.os.Build.VERSION.SDK_INT < 19)
	//*   0    0:getstatic       #56  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmpge          9
			return;
	//    3    8:return          
		uri = ((Uri) (new PrintUriAdapter(s, uri, onprintfinishcallback, mScaleMode)));
	//    4    9:new             #14  <Class PrintHelper$PrintUriAdapter>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:aload_3         
	//   10   17:aload_0         
	//   11   18:getfield        #72  <Field int mScaleMode>
	//   12   21:invokespecial   #330 <Method void PrintHelper$PrintUriAdapter(PrintHelper, String, Uri, PrintHelper$OnPrintFinishCallback, int)>
	//   13   24:astore_2        
		onprintfinishcallback = ((OnPrintFinishCallback) ((PrintManager)mContext.getSystemService("print")));
	//   14   25:aload_0         
	//   15   26:getfield        #78  <Field Context mContext>
	//   16   29:ldc2            #296 <String "print">
	//   17   32:invokevirtual   #300 <Method Object Context.getSystemService(String)>
	//   18   35:checkcast       #302 <Class PrintManager>
	//   19   38:astore_3        
		android.print.PrintAttributes.Builder builder = new android.print.PrintAttributes.Builder();
	//   20   39:new             #137 <Class android.print.PrintAttributes$Builder>
	//   21   42:dup             
	//   22   43:invokespecial   #138 <Method void android.print.PrintAttributes$Builder()>
	//   23   46:astore          5
		builder.setColorMode(mColorMode);
	//   24   48:aload           5
	//   25   50:aload_0         
	//   26   51:getfield        #74  <Field int mColorMode>
	//   27   54:invokevirtual   #171 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setColorMode(int)>
	//   28   57:pop             
		int i = mOrientation;
	//   29   58:aload_0         
	//   30   59:getfield        #76  <Field int mOrientation>
	//   31   62:istore          4
		if(i != 1 && i != 0)
	//*  32   64:iload           4
	//*  33   66:iconst_1        
	//*  34   67:icmpeq          96
	//*  35   70:iload           4
	//*  36   72:ifne            78
	//*  37   75:goto            96
		{
			if(i == 2)
	//*  38   78:iload           4
	//*  39   80:iconst_2        
	//*  40   81:icmpne          105
				builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
	//   41   84:aload           5
	//   42   86:getstatic       #310 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_PORTRAIT>
	//   43   89:invokevirtual   #148 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
	//   44   92:pop             
		} else
	//*  45   93:goto            105
		{
			builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
	//   46   96:aload           5
	//   47   98:getstatic       #313 <Field android.print.PrintAttributes$MediaSize android.print.PrintAttributes$MediaSize.UNKNOWN_LANDSCAPE>
	//   48  101:invokevirtual   #148 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMediaSize(android.print.PrintAttributes$MediaSize)>
	//   49  104:pop             
		}
		((PrintManager) (onprintfinishcallback)).print(s, ((PrintDocumentAdapter) (uri)), builder.build());
	//   50  105:aload_3         
	//   51  106:aload_1         
	//   52  107:aload_2         
	//   53  108:aload           5
	//   54  110:invokevirtual   #317 <Method PrintAttributes android.print.PrintAttributes$Builder.build()>
	//   55  113:invokevirtual   #323 <Method android.print.PrintJob PrintManager.print(String, PrintDocumentAdapter, PrintAttributes)>
	//   56  116:pop             
	//   57  117:return          
	}

	public void setColorMode(int i)
	{
		mColorMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #74  <Field int mColorMode>
	//    3    5:return          
	}

	public void setOrientation(int i)
	{
		mOrientation = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #76  <Field int mOrientation>
	//    3    5:return          
	}

	public void setScaleMode(int i)
	{
		mScaleMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field int mScaleMode>
	//    3    5:return          
	}

	void writeBitmap(final PrintAttributes attributes, final int fittingMode, final Bitmap bitmap, final ParcelFileDescriptor fileDescriptor, final CancellationSignal cancellationSignal, final android.print.PrintDocumentAdapter.WriteResultCallback writeResultCallback)
	{
		final PrintAttributes pdfAttributes;
		if(IS_MIN_MARGINS_HANDLING_CORRECT)
	//*   0    0:getstatic       #60  <Field boolean IS_MIN_MARGINS_HANDLING_CORRECT>
	//*   1    3:ifeq            12
			pdfAttributes = attributes;
	//    2    6:aload_1         
	//    3    7:astore          7
		else
	//*   4    9:goto            35
			pdfAttributes = copyAttributes(attributes).setMinMargins(new android.print.PrintAttributes.Margins(0, 0, 0, 0)).build();
	//    5   12:aload_1         
	//    6   13:invokestatic    #337 <Method android.print.PrintAttributes$Builder copyAttributes(PrintAttributes)>
	//    7   16:new             #339 <Class android.print.PrintAttributes$Margins>
	//    8   19:dup             
	//    9   20:iconst_0        
	//   10   21:iconst_0        
	//   11   22:iconst_0        
	//   12   23:iconst_0        
	//   13   24:invokespecial   #342 <Method void android.print.PrintAttributes$Margins(int, int, int, int)>
	//   14   27:invokevirtual   #164 <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setMinMargins(android.print.PrintAttributes$Margins)>
	//   15   30:invokevirtual   #317 <Method PrintAttributes android.print.PrintAttributes$Builder.build()>
	//   16   33:astore          7
		((_cls1) (new AsyncTask() {

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
				if(cancellationSignal.isCanceled())
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
				android.graphics.pdf.PdfDocument.Page page;
				Object obj1;
				android.graphics.pdf.PdfDocument.Page page1;
				try
				{
					obj = ((Object) (new PrintedPdfDocument(mContext, pdfAttributes)));
			//    6   12:new             #66  <Class PrintedPdfDocument>
			//    7   15:dup             
			//    8   16:aload_0         
			//    9   17:getfield        #29  <Field PrintHelper this$0>
			//   10   20:getfield        #70  <Field Context PrintHelper.mContext>
			//   11   23:aload_0         
			//   12   24:getfield        #33  <Field PrintAttributes val$pdfAttributes>
			//   13   27:invokespecial   #73  <Method void PrintedPdfDocument(Context, PrintAttributes)>
			//   14   30:astore          4
					bitmap1 = PrintHelper.convertBitmapForColorMode(bitmap, pdfAttributes.getColorMode());
			//   15   32:aload_0         
			//   16   33:getfield        #35  <Field Bitmap val$bitmap>
			//   17   36:aload_0         
			//   18   37:getfield        #33  <Field PrintAttributes val$pdfAttributes>
			//   19   40:invokevirtual   #79  <Method int PrintAttributes.getColorMode()>
			//   20   43:invokestatic    #83  <Method Bitmap PrintHelper.convertBitmapForColorMode(Bitmap, int)>
			//   21   46:astore_3        
					flag = cancellationSignal.isCanceled();
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
			//*  48  102:getfield        #70  <Field Context PrintHelper.mContext>
			//*  49  105:aload_0         
			//*  50  106:getfield        #37  <Field PrintAttributes val$attributes>
			//*  51  109:invokespecial   #73  <Method void PrintedPdfDocument(Context, PrintAttributes)>
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
			//*  98  210:invokevirtual   #154 <Method void Canvas.drawBitmap(Bitmap, Matrix, Paint)>
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
				page = ((PrintedPdfDocument) (obj)).startPage(1);
				if(PrintHelper.IS_MIN_MARGINS_HANDLING_CORRECT)
				{
					avoid = ((Void []) (new RectF(page.getInfo().getContentRect())));
					break MISSING_BLOCK_LABEL_150;
				}
				obj1 = ((Object) (new PrintedPdfDocument(mContext, attributes)));
				page1 = ((PrintedPdfDocument) (obj1)).startPage(1);
				avoid = ((Void []) (new RectF(page1.getInfo().getContentRect())));
				((PrintedPdfDocument) (obj1)).finishPage(page1);
				((PrintedPdfDocument) (obj1)).close();
				obj1 = ((Object) (PrintHelper.getMatrix(bitmap1.getWidth(), bitmap1.getHeight(), ((RectF) (avoid)), fittingMode)));
				if(PrintHelper.IS_MIN_MARGINS_HANDLING_CORRECT)
					break MISSING_BLOCK_LABEL_201;
				((Matrix) (obj1)).postTranslate(((RectF) (avoid)).left, ((RectF) (avoid)).top);
				page.getCanvas().clipRect(((RectF) (avoid)));
				page.getCanvas().drawBitmap(bitmap1, ((Matrix) (obj1)), ((Paint) (null)));
				((PrintedPdfDocument) (obj)).finishPage(page);
				flag = cancellationSignal.isCanceled();
				if(!flag)
					break MISSING_BLOCK_LABEL_267;
				((PrintedPdfDocument) (obj)).close();
				avoid = ((Void []) (fileDescriptor));
				if(avoid == null)
					break MISSING_BLOCK_LABEL_253;
				try
				{
					fileDescriptor.close();
				}
				// Misplaced declaration of an exception variable
				catch(Void avoid[]) { }
			//  174  362:astore_1        
				if(bitmap1 != bitmap)
					bitmap1.recycle();
				return null;
				((PrintedPdfDocument) (obj)).writeTo(((java.io.OutputStream) (new FileOutputStream(fileDescriptor.getFileDescriptor()))));
				((PrintedPdfDocument) (obj)).close();
				avoid = ((Void []) (fileDescriptor));
				if(avoid == null)
					break MISSING_BLOCK_LABEL_307;
				try
				{
					fileDescriptor.close();
				}
			//* 175  363:goto            253
				// Misplaced declaration of an exception variable
				catch(Void avoid[]) { }
			//  176  366:astore_1        
				if(bitmap1 == bitmap)
					break MISSING_BLOCK_LABEL_375;
				bitmap1.recycle();
				return null;
				avoid;
				((PrintedPdfDocument) (obj)).close();
				obj = ((Object) (fileDescriptor));
				if(obj == null)
					break MISSING_BLOCK_LABEL_345;
				try
				{
					fileDescriptor.close();
				}
			//* 177  367:goto            307
				catch(IOException ioexception) { }
			//  178  370:astore          4
				if(bitmap1 != bitmap)
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
				if(cancellationSignal.isCanceled())
			//*   0    0:aload_0         
			//*   1    1:getfield        #31  <Field CancellationSignal val$cancellationSignal>
			//*   2    4:invokevirtual   #64  <Method boolean CancellationSignal.isCanceled()>
			//*   3    7:ifeq            18
				{
					writeResultCallback.onWriteCancelled();
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
					writeResultCallback.onWriteFinished(new PageRange[] {
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
					writeResultCallback.onWriteFailed(((CharSequence) (null)));
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
			final android.print.PrintDocumentAdapter.WriteResultCallback val$writeResultCallback;

			
			{
				this$0 = PrintHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #29  <Field PrintHelper this$0>
				cancellationSignal = cancellationsignal;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #31  <Field CancellationSignal val$cancellationSignal>
				pdfAttributes = printattributes;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #33  <Field PrintAttributes val$pdfAttributes>
				bitmap = bitmap1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #35  <Field Bitmap val$bitmap>
				attributes = printattributes1;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #37  <Field PrintAttributes val$attributes>
				fittingMode = i;
			//   15   27:aload_0         
			//   16   28:iload           6
			//   17   30:putfield        #39  <Field int val$fittingMode>
				fileDescriptor = parcelfiledescriptor;
			//   18   33:aload_0         
			//   19   34:aload           7
			//   20   36:putfield        #41  <Field ParcelFileDescriptor val$fileDescriptor>
				writeResultCallback = writeresultcallback;
			//   21   39:aload_0         
			//   22   40:aload           8
			//   23   42:putfield        #43  <Field android.print.PrintDocumentAdapter$WriteResultCallback val$writeResultCallback>
				super();
			//   24   45:aload_0         
			//   25   46:invokespecial   #46  <Method void AsyncTask()>
			//   26   49:return          
			}
		}
)).execute(((Object []) (new Void[0])));
	//   17   35:new             #6   <Class PrintHelper$1>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:aload           5
	//   21   42:aload           7
	//   22   44:aload_3         
	//   23   45:aload_1         
	//   24   46:iload_2         
	//   25   47:aload           4
	//   26   49:aload           6
	//   27   51:invokespecial   #345 <Method void PrintHelper$1(PrintHelper, CancellationSignal, PrintAttributes, Bitmap, PrintAttributes, int, ParcelFileDescriptor, android.print.PrintDocumentAdapter$WriteResultCallback)>
	//   28   54:iconst_0        
	//   29   55:anewarray       Void[]
	//   30   58:invokevirtual   #351 <Method AsyncTask PrintHelper$1.execute(Object[])>
	//   31   61:pop             
	//   32   62:return          
	}

	public static final int COLOR_MODE_COLOR = 2;
	public static final int COLOR_MODE_MONOCHROME = 1;
	static final boolean IS_MIN_MARGINS_HANDLING_CORRECT;
	private static final String LOG_TAG = "PrintHelper";
	private static final int MAX_PRINT_SIZE = 3500;
	public static final int ORIENTATION_LANDSCAPE = 1;
	public static final int ORIENTATION_PORTRAIT = 2;
	static final boolean PRINT_ACTIVITY_RESPECTS_ORIENTATION;
	public static final int SCALE_MODE_FILL = 2;
	public static final int SCALE_MODE_FIT = 1;
	int mColorMode;
	final Context mContext;
	android.graphics.BitmapFactory.Options mDecodeOptions;
	final Object mLock = new Object();
	int mOrientation;
	int mScaleMode;

	static 
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #56  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_0        
		boolean flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		boolean flag;
		if(i >= 20 && android.os.Build.VERSION.SDK_INT <= 23)
	//*   4    6:iload_0         
	//*   5    7:bipush          20
	//*   6    9:icmplt          28
	//*   7   12:getstatic       #56  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   15:bipush          23
	//*   9   17:icmple          23
	//*  10   20:goto            28
			flag = false;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		else
	//*  13   25:goto            30
			flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_1        
		PRINT_ACTIVITY_RESPECTS_ORIENTATION = flag;
	//   16   30:iload_1         
	//   17   31:putstatic       #58  <Field boolean PRINT_ACTIVITY_RESPECTS_ORIENTATION>
		flag = flag1;
	//   18   34:iload_2         
	//   19   35:istore_1        
		if(android.os.Build.VERSION.SDK_INT != 23)
	//*  20   36:getstatic       #56  <Field int android.os.Build$VERSION.SDK_INT>
	//*  21   39:bipush          23
	//*  22   41:icmpeq          46
			flag = true;
	//   23   44:iconst_1        
	//   24   45:istore_1        
		IS_MIN_MARGINS_HANDLING_CORRECT = flag;
	//   25   46:iload_1         
	//   26   47:putstatic       #60  <Field boolean IS_MIN_MARGINS_HANDLING_CORRECT>
	//*  27   50:return          
	}
}
