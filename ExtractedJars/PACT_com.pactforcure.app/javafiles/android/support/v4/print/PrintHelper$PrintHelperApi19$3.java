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
			layoutResultCallback.onLayoutCancelled();
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
			cancellationSignal = ((CancellationSignal) ((new android.print.PrintDocumentInfo.Builder(val$jobName)).setContentType(1).setPageCount(1).build()));
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
			layoutResultCallback.onLayoutFinished(((android.print.PrintDocumentInfo) (cancellationSignal)), flag);
			return;
		} else
	//*  45   80:goto            68
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
						break MISSING_BLOCK_LABEL_108;
				//    5    7:aload_1         
				//    6    8:ifnull          108
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
							break MISSING_BLOCK_LABEL_108;
				//   14   26:aload_0         
				//   15   27:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
				//   16   30:getfield        #50  <Field PrintHelper$PrintHelperApi19 PrintHelper$PrintHelperApi19$3.this$0>
				//   17   33:getfield        #90  <Field int PrintHelper$PrintHelperApi19.mOrientation>
				//   18   36:ifne            108
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
				//*  31   59:ifnull          108
					{
						obj = ((Object) (bitmap));
				//   32   62:aload_1         
				//   33   63:astore_3        
						if(mediasize.isPortrait() != PrintHelper.PrintHelperApi19.access$600(bitmap))
				//*  34   64:aload           4
				//*  35   66:invokevirtual   #106 <Method boolean android.print.PrintAttributes$MediaSize.isPortrait()>
				//*  36   69:aload_1         
				//*  37   70:invokestatic    #110 <Method boolean PrintHelper$PrintHelperApi19.access$600(Bitmap)>
				//*  38   73:icmpeq          108
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
					mBitmap = ((Bitmap) (obj));
				//   58  108:aload_0         
				//   59  109:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
				//   60  112:aload_3         
				//   61  113:putfield        #133 <Field Bitmap PrintHelper$PrintHelperApi19$3.mBitmap>
					if(obj != null)
				//*  62  116:aload_3         
				//*  63  117:ifnull          190
					{
						bitmap = ((Bitmap) ((new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build()));
				//   64  120:new             #135 <Class android.print.PrintDocumentInfo$Builder>
				//   65  123:dup             
				//   66  124:aload_0         
				//   67  125:getfield        #30  <Field PrintHelper$PrintHelperApi19$3 this$1>
				//   68  128:getfield        #139 <Field String PrintHelper$PrintHelperApi19$3.val$jobName>
				//   69  131:invokespecial   #142 <Method void android.print.PrintDocumentInfo$Builder(String)>
				//   70  134:iconst_1        
				//   71  135:invokevirtual   #146 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setContentType(int)>
				//   72  138:iconst_1        
				//   73  139:invokevirtual   #149 <Method android.print.PrintDocumentInfo$Builder android.print.PrintDocumentInfo$Builder.setPageCount(int)>
				//   74  142:invokevirtual   #153 <Method android.print.PrintDocumentInfo android.print.PrintDocumentInfo$Builder.build()>
				//   75  145:astore_1        
						boolean flag1;
						if(!newPrintAttributes.equals(((Object) (oldPrintAttributes))))
				//*  76  146:aload_0         
				//*  77  147:getfield        #34  <Field PrintAttributes val$newPrintAttributes>
				//*  78  150:aload_0         
				//*  79  151:getfield        #36  <Field PrintAttributes val$oldPrintAttributes>
				//*  80  154:invokevirtual   #157 <Method boolean PrintAttributes.equals(Object)>
				//*  81  157:ifne            185
							flag1 = true;
				//   82  160:iconst_1        
				//   83  161:istore_2        
						else
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
							flag1 = false;
				//   99  185:iconst_0        
				//  100  186:istore_2        
						layoutResultCallback.onLayoutFinished(((android.print.PrintDocumentInfo) (bitmap)), flag1);
					} else
				//* 101  187:goto            162
					{
						layoutResultCallback.onLayoutFailed(((CharSequence) (null)));
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
