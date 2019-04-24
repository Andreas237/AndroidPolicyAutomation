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

class PrintHelper$PrintHelperApi19$3 extends PrintDocumentAdapter
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
		if(val$callback != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #43  <Field PrintHelper$OnPrintFinishCallback val$callback>
	//*  14   28:ifnull          40
			val$callback.onFinish();
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

	public void onLayout(final PrintAttributes oldPrintAttributes, final PrintAttributes newPrintAttributes, final CancellationSignal cancellationSignal, final android.print.ltCallback layoutResultCallback, Bundle bundle)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mAttributes = newPrintAttributes;
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:putfield        #60  <Field PrintAttributes mAttributes>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		if(cancellationSignal.isCanceled())
	//*   7    9:aload_3         
	//*   8   10:invokevirtual   #100 <Method boolean CancellationSignal.isCanceled()>
	//*   9   13:ifeq            22
		{
			layoutResultCallback.onLayoutCancelled();
	//   10   16:aload           4
	//   11   18:invokevirtual   #105 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutCancelled()>
			return;
	//   12   21:return          
		}
		if(mBitmap != null)
	//*  13   22:aload_0         
	//*  14   23:getfield        #50  <Field Bitmap mBitmap>
	//*  15   26:ifnull          64
		{
			layoutResultCallback.onLayoutFinished((new android.print.PrintDocumentInfo.Builder(val$jobName)).setContentType(1).setPageCount(1).build(), newPrintAttributes.equals(((Object) (oldPrintAttributes))) ^ true);
	//   16   29:aload           4
	//   17   31:new             #107 <Class android.print.PrintDocumentInfo$Builder>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:getfield        #39  <Field String val$jobName>
	//   21   39:invokespecial   #110 <Method void android.print.PrintDocumentInfo$Builder(String)>
	//   22   42:iconst_1        
	//   23   43:invokevirtual   #114 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
	//   24   46:iconst_1        
	//   25   47:invokevirtual   #117 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
	//   26   50:invokevirtual   #121 <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
	//   27   53:aload_2         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #127 <Method boolean PrintAttributes.equals(Object)>
	//   30   58:iconst_1        
	//   31   59:ixor            
	//   32   60:invokevirtual   #131 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
			return;
	//   33   63:return          
		} else
		{
			mLoadBitmap = ((_cls1) (new AsyncTask() {

				protected transient Bitmap doInBackground(Uri auri[])
				{
					try
					{
						auri = ((Uri []) (PrintHelper.PrintHelperApi19.access$400(this$0, imageFile)));
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
				//    2    2:checkcast       #61  <Class Uri[]>
				//    3    5:invokevirtual   #63  <Method Bitmap doInBackground(Uri[])>
				//    4    8:areturn         
				}

				protected void onCancelled(Bitmap bitmap)
				{
					layoutResultCallback.onLayoutCancelled();
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
					Object obj;
					super.onPostExecute(((Object) (bitmap)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokespecial   #82  <Method void AsyncTask.onPostExecute(Object)>
					obj = ((Object) (bitmap));
				//    3    5:aload_1         
				//    4    6:astore_3        
					if(bitmap == null)
						break MISSING_BLOCK_LABEL_116;
				//    5    7:aload_1         
				//    6    8:ifnull          116
					if(mPrintActivityRespectsOrientation)
				//*   7   11:aload_0         
				//*   8   12:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
				//*   9   15:getfield        #50  <Field PrintHelper$PrintHelperApi19 PrintHelper$PrintHelperApi19$3.this$0>
				//*  10   18:getfield        #86  <Field boolean PrintHelper$PrintHelperApi19.mPrintActivityRespectsOrientation>
				//*  11   21:ifeq            39
					{
						obj = ((Object) (bitmap));
				//   12   24:aload_1         
				//   13   25:astore_3        
						if(mOrientation != 0)
							break MISSING_BLOCK_LABEL_116;
				//   14   26:aload_0         
				//   15   27:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
				//   16   30:getfield        #50  <Field PrintHelper$PrintHelperApi19 PrintHelper$PrintHelperApi19$3.this$0>
				//   17   33:getfield        #90  <Field int PrintHelper$PrintHelperApi19.mOrientation>
				//   18   36:ifne            116
					}
					this;
				//   19   39:aload_0         
					JVM INSTR monitorenter ;
				//   20   40:monitorenter    
					android.print.PrintAttributes.MediaSize mediasize = mAttributes.getMediaSize();
				//   21   41:aload_0         
				//   22   42:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
				//   23   45:invokestatic    #94  <Method PrintAttributes PrintHelper$PrintHelperApi19$3.access$500(PrintHelper$PrintHelperApi19$3)>
				//   24   48:invokevirtual   #100 <Method android.print.PrintAttributes$MediaSize PrintAttributes.getMediaSize()>
				//   25   51:astore          4
					this;
				//   26   53:aload_0         
					JVM INSTR monitorexit ;
				//   27   54:monitorexit     
					obj = ((Object) (bitmap));
				//   28   55:aload_1         
				//   29   56:astore_3        
					if(mediasize != null)
				//*  30   57:aload           4
				//*  31   59:ifnull          116
					{
						obj = ((Object) (bitmap));
				//   32   62:aload_1         
				//   33   63:astore_3        
						if(mediasize.isPortrait() != PrintHelper.PrintHelperApi19.access$600(bitmap))
				//*  34   64:aload           4
				//*  35   66:invokevirtual   #106 <Method boolean android.print.PrintAttributes$MediaSize.isPortrait()>
				//*  36   69:aload_1         
				//*  37   70:invokestatic    #110 <Method boolean PrintHelper$PrintHelperApi19.access$600(Bitmap)>
				//*  38   73:icmpeq          116
						{
							obj = ((Object) (new Matrix()));
				//   39   76:new             #112 <Class Matrix>
				//   40   79:dup             
				//   41   80:invokespecial   #113 <Method void Matrix()>
				//   42   83:astore_3        
							((Matrix) (obj)).postRotate(90F);
				//   43   84:aload_3         
				//   44   85:ldc1            #114 <Float 90F>
				//   45   87:invokevirtual   #118 <Method boolean Matrix.postRotate(float)>
				//   46   90:pop             
							obj = ((Object) (Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true)));
				//   47   91:aload_1         
				//   48   92:iconst_0        
				//   49   93:iconst_0        
				//   50   94:aload_1         
				//   51   95:invokevirtual   #122 <Method int Bitmap.getWidth()>
				//   52   98:aload_1         
				//   53   99:invokevirtual   #125 <Method int Bitmap.getHeight()>
				//   54  102:aload_3         
				//   55  103:iconst_1        
				//   56  104:invokestatic    #129 <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int, Matrix, boolean)>
				//   57  107:astore_3        
						}
					}
					break MISSING_BLOCK_LABEL_116;
				//   58  108:goto            116
					bitmap;
				//   59  111:astore_1        
					this;
				//   60  112:aload_0         
					JVM INSTR monitorexit ;
				//   61  113:monitorexit     
					throw bitmap;
				//   62  114:aload_1         
				//   63  115:athrow          
					mBitmap = ((Bitmap) (obj));
				//   64  116:aload_0         
				//   65  117:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
				//   66  120:aload_3         
				//   67  121:putfield        #133 <Field Bitmap PrintHelper$PrintHelperApi19$3.mBitmap>
					if(obj != null)
				//*  68  124:aload_3         
				//*  69  125:ifnull          180
					{
						bitmap = ((Bitmap) ((new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build()));
				//   70  128:new             #135 <Class android.print.PrintDocumentInfo$Builder>
				//   71  131:dup             
				//   72  132:aload_0         
				//   73  133:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
				//   74  136:getfield        #139 <Field String PrintHelper$PrintHelperApi19$3.val$jobName>
				//   75  139:invokespecial   #142 <Method void android.print.PrintDocumentInfo$Builder(String)>
				//   76  142:iconst_1        
				//   77  143:invokevirtual   #146 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
				//   78  146:iconst_1        
				//   79  147:invokevirtual   #149 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
				//   80  150:invokevirtual   #153 <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
				//   81  153:astore_1        
						boolean flag = newPrintAttributes.equals(((Object) (oldPrintAttributes)));
				//   82  154:aload_0         
				//   83  155:getfield        #34  <Field PrintAttributes val$newPrintAttributes>
				//   84  158:aload_0         
				//   85  159:getfield        #36  <Field PrintAttributes val$oldPrintAttributes>
				//   86  162:invokevirtual   #157 <Method boolean PrintAttributes.equals(Object)>
				//   87  165:istore_2        
						layoutResultCallback.onLayoutFinished(((android.print.PrintDocumentInfo) (bitmap)), true ^ flag);
				//   88  166:aload_0         
				//   89  167:getfield        #38  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
				//   90  170:aload_1         
				//   91  171:iconst_1        
				//   92  172:iload_2         
				//   93  173:ixor            
				//   94  174:invokevirtual   #161 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFinished(android.print.PrintDocumentInfo, boolean)>
					} else
				//*  95  177:goto            188
					{
						layoutResultCallback.onLayoutFailed(((CharSequence) (null)));
				//   96  180:aload_0         
				//   97  181:getfield        #38  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
				//   98  184:aconst_null     
				//   99  185:invokevirtual   #165 <Method void android.print.PrintDocumentAdapter$LayoutResultCallback.onLayoutFailed(CharSequence)>
					}
					mLoadBitmap = null;
				//  100  188:aload_0         
				//  101  189:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
				//  102  192:aconst_null     
				//  103  193:putfield        #74  <Field AsyncTask PrintHelper$PrintHelperApi19$3.mLoadBitmap>
					return;
				//  104  196:return          
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
					cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() {

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

						final _cls1 this$2;

			
			{
				this$2 = _cls1.this;
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
				final android.print.PrintDocumentAdapter.LayoutResultCallback val$layoutResultCallback;
				final PrintAttributes val$newPrintAttributes;
				final PrintAttributes val$oldPrintAttributes;

			
			{
				this$1 = PrintHelper.PrintHelperApi19._cls3.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
				cancellationSignal = cancellationsignal;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #32  <Field CancellationSignal val$cancellationSignal>
				newPrintAttributes = printattributes;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #34  <Field PrintAttributes val$newPrintAttributes>
				oldPrintAttributes = printattributes1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #36  <Field PrintAttributes val$oldPrintAttributes>
				layoutResultCallback = layoutresultcallback;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #38  <Field android.print.PrintDocumentAdapter$LayoutResultCallback val$layoutResultCallback>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #41  <Method void AsyncTask()>
			//   17   31:return          
			}
			}
)).execute(((Object []) (new Uri[0])));
	//   34   64:aload_0         
	//   35   65:new             #14  <Class PrintHelper$PrintHelperApi19$3$1>
	//   36   68:dup             
	//   37   69:aload_0         
	//   38   70:aload_3         
	//   39   71:aload_2         
	//   40   72:aload_1         
	//   41   73:aload           4
	//   42   75:invokespecial   #134 <Method void PrintHelper$PrintHelperApi19$3$1(PrintHelper$PrintHelperApi19$3, CancellationSignal, PrintAttributes, PrintAttributes, android.print.PrintDocumentAdapter$LayoutResultCallback)>
	//   43   78:iconst_0        
	//   44   79:anewarray       Uri[]
	//   45   82:invokevirtual   #140 <Method AsyncTask PrintHelper$PrintHelperApi19$3$1.execute(Object[])>
	//   46   85:putfield        #78  <Field AsyncTask mLoadBitmap>
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

	public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.tCallback tcallback)
	{
		PrintHelper.PrintHelperApi19.access$000(PrintHelper.PrintHelperApi19.this, mAttributes, val$fittingMode, mBitmap, parcelfiledescriptor, cancellationsignal, tcallback);
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
	final ck val$callback;
	final int val$fittingMode;
	final Uri val$imageFile;
	final String val$jobName;


/*
	static void access$300(PrintHelper$PrintHelperApi19$3 printhelper$printhelperapi19$3)
	{
		printhelper$printhelperapi19$3.cancelLoad();
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void cancelLoad()>
		return;
	//    2    4:return          
	}

*/


/*
	static PrintAttributes access$500(PrintHelper$PrintHelperApi19$3 printhelper$printhelperapi19$3)
	{
		return printhelper$printhelperapi19$3.mAttributes;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field PrintAttributes mAttributes>
	//    2    4:areturn         
	}

*/

	PrintHelper$PrintHelperApi19$3()
	{
		this$0 = final_printhelperapi19;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field PrintHelper$PrintHelperApi19 this$0>
		val$jobName = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #39  <Field String val$jobName>
		val$imageFile = uri;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #41  <Field Uri val$imageFile>
		val$callback = ck;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #43  <Field PrintHelper$OnPrintFinishCallback val$callback>
		val$fittingMode = I.this;
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
