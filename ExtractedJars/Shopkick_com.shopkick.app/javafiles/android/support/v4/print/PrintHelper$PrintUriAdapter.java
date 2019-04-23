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

private class PrintHelper$PrintUriAdapter extends PrintDocumentAdapter
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
			((lback) (obj)).onFinish();
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

	public void onLayout(final PrintAttributes oldPrintAttributes, final PrintAttributes newPrintAttributes, final CancellationSignal cancellationSignal, final android.print.esultCallback layoutResultCallback, Bundle bundle)
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
			layoutResultCallback.onLayoutCancelled();
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
			layoutResultCallback.onLayoutFinished((new android.print.PrintDocumentInfo.Builder(mJobName)).setContentType(1).setPageCount(1).build(), newPrintAttributes.equals(((Object) (oldPrintAttributes))) ^ true);
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
			mLoadBitmap = ((_cls1) (new AsyncTask() {

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

						final _cls1 this$2;

			
			{
				this$2 = _cls1.this;
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
				final android.print.PrintDocumentAdapter.LayoutResultCallback val$layoutResultCallback;
				final PrintAttributes val$newPrintAttributes;
				final PrintAttributes val$oldPrintAttributes;

			
			{
				this$1 = PrintHelper.PrintUriAdapter.this;
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
				layoutResultCallback = layoutresultcallback;
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

	public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.sultCallback sultcallback)
	{
		writeBitmap(mAttributes, mFittingMode, mBitmap, parcelfiledescriptor, cancellationsignal, sultcallback);
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
	final lback mCallback;
	final int mFittingMode;
	final Uri mImageFile;
	final String mJobName;
	AsyncTask mLoadBitmap;
	final PrintHelper this$0;

	PrintHelper$PrintUriAdapter(String s, Uri uri, lback lback, int i)
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
		mCallback = lback;
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
