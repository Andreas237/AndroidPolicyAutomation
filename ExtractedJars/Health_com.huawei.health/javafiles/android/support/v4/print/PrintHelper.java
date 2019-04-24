// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.FileNotFoundException;

// Referenced classes of package android.support.v4.print:
//			PrintHelperApi20, PrintHelperKitkat, PrintHelperApi23, PrintHelperApi24

public final class PrintHelper
{
	public static interface OnPrintFinishCallback
	{

		public abstract void onFinish();
	}

	static final class PrintHelperApi20Impl extends PrintHelperImpl
	{

		PrintHelperApi20Impl(Context context)
		{
			super(((PrintHelperKitkat) (new PrintHelperApi20(context))));
		//    0    0:aload_0         
		//    1    1:new             #12  <Class PrintHelperApi20>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #14  <Method void PrintHelperApi20(Context)>
		//    5    9:invokespecial   #17  <Method void PrintHelper$PrintHelperImpl(PrintHelperKitkat)>
		//    6   12:return          
		}
	}

	static final class PrintHelperApi23Impl extends PrintHelperImpl
	{

		PrintHelperApi23Impl(Context context)
		{
			super(((PrintHelperKitkat) (new PrintHelperApi23(context))));
		//    0    0:aload_0         
		//    1    1:new             #12  <Class PrintHelperApi23>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #14  <Method void PrintHelperApi23(Context)>
		//    5    9:invokespecial   #17  <Method void PrintHelper$PrintHelperImpl(PrintHelperKitkat)>
		//    6   12:return          
		}
	}

	static final class PrintHelperApi24Impl extends PrintHelperImpl
	{

		PrintHelperApi24Impl(Context context)
		{
			super(((PrintHelperKitkat) (new PrintHelperApi24(context))));
		//    0    0:aload_0         
		//    1    1:new             #12  <Class PrintHelperApi24>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #14  <Method void PrintHelperApi24(Context)>
		//    5    9:invokespecial   #17  <Method void PrintHelper$PrintHelperImpl(PrintHelperKitkat)>
		//    6   12:return          
		}
	}

	static class PrintHelperImpl
		implements PrintHelperVersionImpl
	{

		public int getColorMode()
		{
			return mPrintHelper.getColorMode();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field PrintHelperKitkat mPrintHelper>
		//    2    4:invokevirtual   #33  <Method int PrintHelperKitkat.getColorMode()>
		//    3    7:ireturn         
		}

		public int getOrientation()
		{
			return mPrintHelper.getOrientation();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field PrintHelperKitkat mPrintHelper>
		//    2    4:invokevirtual   #36  <Method int PrintHelperKitkat.getOrientation()>
		//    3    7:ireturn         
		}

		public int getScaleMode()
		{
			return mPrintHelper.getScaleMode();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field PrintHelperKitkat mPrintHelper>
		//    2    4:invokevirtual   #39  <Method int PrintHelperKitkat.getScaleMode()>
		//    3    7:ireturn         
		}

		public void printBitmap(String s, Bitmap bitmap, OnPrintFinishCallback onprintfinishcallback)
		{
			PrintHelperKitkat.OnPrintFinishCallback onprintfinishcallback1 = null;
		//    0    0:aconst_null     
		//    1    1:astore          4
			if(onprintfinishcallback != null)
		//*   2    3:aload_3         
		//*   3    4:ifnull          18
				onprintfinishcallback1 = ((_cls1) (onprintfinishcallback)). new PrintHelperKitkat.OnPrintFinishCallback() {

					public void onFinish()
					{
						callback.onFinish();
					//    0    0:aload_0         
					//    1    1:getfield        #24  <Field PrintHelper$OnPrintFinishCallback val$callback>
					//    2    4:invokeinterface #33  <Method void PrintHelper$OnPrintFinishCallback.onFinish()>
					//    3    9:return          
					}

					final PrintHelperImpl this$0;
					final OnPrintFinishCallback val$callback;

			
			{
				this$0 = final_printhelperimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field PrintHelper$PrintHelperImpl this$0>
				callback = OnPrintFinishCallback.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field PrintHelper$OnPrintFinishCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
				}
;
		//    4    7:new             #12  <Class PrintHelper$PrintHelperImpl$1>
		//    5   10:dup             
		//    6   11:aload_0         
		//    7   12:aload_3         
		//    8   13:invokespecial   #44  <Method void PrintHelper$PrintHelperImpl$1(PrintHelper$PrintHelperImpl, PrintHelper$OnPrintFinishCallback)>
		//    9   16:astore          4
			mPrintHelper.printBitmap(s, bitmap, onprintfinishcallback1);
		//   10   18:aload_0         
		//   11   19:getfield        #24  <Field PrintHelperKitkat mPrintHelper>
		//   12   22:aload_1         
		//   13   23:aload_2         
		//   14   24:aload           4
		//   15   26:invokevirtual   #47  <Method void PrintHelperKitkat.printBitmap(String, Bitmap, PrintHelperKitkat$OnPrintFinishCallback)>
		//   16   29:return          
		}

		public void printBitmap(String s, Uri uri, OnPrintFinishCallback onprintfinishcallback)
			throws FileNotFoundException
		{
			PrintHelperKitkat.OnPrintFinishCallback onprintfinishcallback1 = null;
		//    0    0:aconst_null     
		//    1    1:astore          4
			if(onprintfinishcallback != null)
		//*   2    3:aload_3         
		//*   3    4:ifnull          18
				onprintfinishcallback1 = ((_cls2) (onprintfinishcallback)). new PrintHelperKitkat.OnPrintFinishCallback() {

					public void onFinish()
					{
						callback.onFinish();
					//    0    0:aload_0         
					//    1    1:getfield        #24  <Field PrintHelper$OnPrintFinishCallback val$callback>
					//    2    4:invokeinterface #33  <Method void PrintHelper$OnPrintFinishCallback.onFinish()>
					//    3    9:return          
					}

					final PrintHelperImpl this$0;
					final OnPrintFinishCallback val$callback;

			
			{
				this$0 = final_printhelperimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field PrintHelper$PrintHelperImpl this$0>
				callback = OnPrintFinishCallback.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field PrintHelper$OnPrintFinishCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
				}
;
		//    4    7:new             #14  <Class PrintHelper$PrintHelperImpl$2>
		//    5   10:dup             
		//    6   11:aload_0         
		//    7   12:aload_3         
		//    8   13:invokespecial   #51  <Method void PrintHelper$PrintHelperImpl$2(PrintHelper$PrintHelperImpl, PrintHelper$OnPrintFinishCallback)>
		//    9   16:astore          4
			mPrintHelper.printBitmap(s, uri, onprintfinishcallback1);
		//   10   18:aload_0         
		//   11   19:getfield        #24  <Field PrintHelperKitkat mPrintHelper>
		//   12   22:aload_1         
		//   13   23:aload_2         
		//   14   24:aload           4
		//   15   26:invokevirtual   #54  <Method void PrintHelperKitkat.printBitmap(String, Uri, PrintHelperKitkat$OnPrintFinishCallback)>
		//   16   29:return          
		}

		public void setColorMode(int i)
		{
			mPrintHelper.setColorMode(i);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field PrintHelperKitkat mPrintHelper>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #59  <Method void PrintHelperKitkat.setColorMode(int)>
		//    4    8:return          
		}

		public void setOrientation(int i)
		{
			mPrintHelper.setOrientation(i);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field PrintHelperKitkat mPrintHelper>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #62  <Method void PrintHelperKitkat.setOrientation(int)>
		//    4    8:return          
		}

		public void setScaleMode(int i)
		{
			mPrintHelper.setScaleMode(i);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field PrintHelperKitkat mPrintHelper>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #65  <Method void PrintHelperKitkat.setScaleMode(int)>
		//    4    8:return          
		}

		private final PrintHelperKitkat mPrintHelper;

		protected PrintHelperImpl(PrintHelperKitkat printhelperkitkat)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			mPrintHelper = printhelperkitkat;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field PrintHelperKitkat mPrintHelper>
		//    5    9:return          
		}
	}

	static final class PrintHelperKitkatImpl extends PrintHelperImpl
	{

		PrintHelperKitkatImpl(Context context)
		{
			super(new PrintHelperKitkat(context));
		//    0    0:aload_0         
		//    1    1:new             #12  <Class PrintHelperKitkat>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #14  <Method void PrintHelperKitkat(Context)>
		//    5    9:invokespecial   #17  <Method void PrintHelper$PrintHelperImpl(PrintHelperKitkat)>
		//    6   12:return          
		}
	}

	static final class PrintHelperStubImpl
		implements PrintHelperVersionImpl
	{

		public int getColorMode()
		{
			return mColorMode;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field int mColorMode>
		//    2    4:ireturn         
		}

		public int getOrientation()
		{
			return mOrientation;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int mOrientation>
		//    2    4:ireturn         
		}

		public int getScaleMode()
		{
			return mScaleMode;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int mScaleMode>
		//    2    4:ireturn         
		}

		public void printBitmap(String s, Bitmap bitmap, OnPrintFinishCallback onprintfinishcallback)
		{
		//    0    0:return          
		}

		public void printBitmap(String s, Uri uri, OnPrintFinishCallback onprintfinishcallback)
		{
		//    0    0:return          
		}

		public void setColorMode(int i)
		{
			mColorMode = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #21  <Field int mColorMode>
		//    3    5:return          
		}

		public void setOrientation(int i)
		{
			mOrientation = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #23  <Field int mOrientation>
		//    3    5:return          
		}

		public void setScaleMode(int i)
		{
			mScaleMode = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #19  <Field int mScaleMode>
		//    3    5:return          
		}

		int mColorMode;
		int mOrientation;
		int mScaleMode;

		private PrintHelperStubImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mScaleMode = 2;
		//    2    4:aload_0         
		//    3    5:iconst_2        
		//    4    6:putfield        #19  <Field int mScaleMode>
			mColorMode = 2;
		//    5    9:aload_0         
		//    6   10:iconst_2        
		//    7   11:putfield        #21  <Field int mColorMode>
			mOrientation = 1;
		//    8   14:aload_0         
		//    9   15:iconst_1        
		//   10   16:putfield        #23  <Field int mOrientation>
		//   11   19:return          
		}

	}

	static interface PrintHelperVersionImpl
	{

		public abstract int getColorMode();

		public abstract int getOrientation();

		public abstract int getScaleMode();

		public abstract void printBitmap(String s, Bitmap bitmap, OnPrintFinishCallback onprintfinishcallback);

		public abstract void printBitmap(String s, Uri uri, OnPrintFinishCallback onprintfinishcallback)
			throws FileNotFoundException;

		public abstract void setColorMode(int i);

		public abstract void setOrientation(int i);

		public abstract void setScaleMode(int i);
	}


	public PrintHelper(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		if(systemSupportsPrint())
	//*   2    4:invokestatic    #54  <Method boolean systemSupportsPrint()>
	//*   3    7:ifeq            86
		{
			if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   4   10:getstatic       #59  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   13:bipush          24
	//*   6   15:icmplt          31
			{
				mImpl = ((PrintHelperVersionImpl) (new PrintHelperApi24Impl(context)));
	//    7   18:aload_0         
	//    8   19:new             #17  <Class PrintHelper$PrintHelperApi24Impl>
	//    9   22:dup             
	//   10   23:aload_1         
	//   11   24:invokespecial   #61  <Method void PrintHelper$PrintHelperApi24Impl(Context)>
	//   12   27:putfield        #63  <Field PrintHelper$PrintHelperVersionImpl mImpl>
				return;
	//   13   30:return          
			}
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  14   31:getstatic       #59  <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   34:bipush          23
	//*  16   36:icmplt          52
			{
				mImpl = ((PrintHelperVersionImpl) (new PrintHelperApi23Impl(context)));
	//   17   39:aload_0         
	//   18   40:new             #14  <Class PrintHelper$PrintHelperApi23Impl>
	//   19   43:dup             
	//   20   44:aload_1         
	//   21   45:invokespecial   #64  <Method void PrintHelper$PrintHelperApi23Impl(Context)>
	//   22   48:putfield        #63  <Field PrintHelper$PrintHelperVersionImpl mImpl>
				return;
	//   23   51:return          
			}
			if(android.os.Build.VERSION.SDK_INT >= 20)
	//*  24   52:getstatic       #59  <Field int android.os.Build$VERSION.SDK_INT>
	//*  25   55:bipush          20
	//*  26   57:icmplt          73
			{
				mImpl = ((PrintHelperVersionImpl) (new PrintHelperApi20Impl(context)));
	//   27   60:aload_0         
	//   28   61:new             #11  <Class PrintHelper$PrintHelperApi20Impl>
	//   29   64:dup             
	//   30   65:aload_1         
	//   31   66:invokespecial   #65  <Method void PrintHelper$PrintHelperApi20Impl(Context)>
	//   32   69:putfield        #63  <Field PrintHelper$PrintHelperVersionImpl mImpl>
				return;
	//   33   72:return          
			} else
			{
				mImpl = ((PrintHelperVersionImpl) (new PrintHelperKitkatImpl(context)));
	//   34   73:aload_0         
	//   35   74:new             #27  <Class PrintHelper$PrintHelperKitkatImpl>
	//   36   77:dup             
	//   37   78:aload_1         
	//   38   79:invokespecial   #66  <Method void PrintHelper$PrintHelperKitkatImpl(Context)>
	//   39   82:putfield        #63  <Field PrintHelper$PrintHelperVersionImpl mImpl>
				return;
	//   40   85:return          
			}
		} else
		{
			mImpl = ((PrintHelperVersionImpl) (new PrintHelperStubImpl()));
	//   41   86:aload_0         
	//   42   87:new             #30  <Class PrintHelper$PrintHelperStubImpl>
	//   43   90:dup             
	//   44   91:aconst_null     
	//   45   92:invokespecial   #69  <Method void PrintHelper$PrintHelperStubImpl(PrintHelper$1)>
	//   46   95:putfield        #63  <Field PrintHelper$PrintHelperVersionImpl mImpl>
			return;
	//   47   98:return          
		}
	}

	public static boolean systemSupportsPrint()
	{
		return android.os.Build.VERSION.SDK_INT >= 19;
	//    0    0:getstatic       #59  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          19
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public int getColorMode()
	{
		return mImpl.getColorMode();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field PrintHelper$PrintHelperVersionImpl mImpl>
	//    2    4:invokeinterface #74  <Method int PrintHelper$PrintHelperVersionImpl.getColorMode()>
	//    3    9:ireturn         
	}

	public int getOrientation()
	{
		return mImpl.getOrientation();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field PrintHelper$PrintHelperVersionImpl mImpl>
	//    2    4:invokeinterface #77  <Method int PrintHelper$PrintHelperVersionImpl.getOrientation()>
	//    3    9:ireturn         
	}

	public int getScaleMode()
	{
		return mImpl.getScaleMode();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field PrintHelper$PrintHelperVersionImpl mImpl>
	//    2    4:invokeinterface #80  <Method int PrintHelper$PrintHelperVersionImpl.getScaleMode()>
	//    3    9:ireturn         
	}

	public void printBitmap(String s, Bitmap bitmap)
	{
		mImpl.printBitmap(s, bitmap, ((OnPrintFinishCallback) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field PrintHelper$PrintHelperVersionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:invokeinterface #85  <Method void PrintHelper$PrintHelperVersionImpl.printBitmap(String, Bitmap, PrintHelper$OnPrintFinishCallback)>
	//    6   12:return          
	}

	public void printBitmap(String s, Bitmap bitmap, OnPrintFinishCallback onprintfinishcallback)
	{
		mImpl.printBitmap(s, bitmap, onprintfinishcallback);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field PrintHelper$PrintHelperVersionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #85  <Method void PrintHelper$PrintHelperVersionImpl.printBitmap(String, Bitmap, PrintHelper$OnPrintFinishCallback)>
	//    6   12:return          
	}

	public void printBitmap(String s, Uri uri)
		throws FileNotFoundException
	{
		mImpl.printBitmap(s, uri, ((OnPrintFinishCallback) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field PrintHelper$PrintHelperVersionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:invokeinterface #91  <Method void PrintHelper$PrintHelperVersionImpl.printBitmap(String, Uri, PrintHelper$OnPrintFinishCallback)>
	//    6   12:return          
	}

	public void printBitmap(String s, Uri uri, OnPrintFinishCallback onprintfinishcallback)
		throws FileNotFoundException
	{
		mImpl.printBitmap(s, uri, onprintfinishcallback);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field PrintHelper$PrintHelperVersionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #91  <Method void PrintHelper$PrintHelperVersionImpl.printBitmap(String, Uri, PrintHelper$OnPrintFinishCallback)>
	//    6   12:return          
	}

	public void setColorMode(int i)
	{
		mImpl.setColorMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field PrintHelper$PrintHelperVersionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #96  <Method void PrintHelper$PrintHelperVersionImpl.setColorMode(int)>
	//    4   10:return          
	}

	public void setOrientation(int i)
	{
		mImpl.setOrientation(i);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field PrintHelper$PrintHelperVersionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #99  <Method void PrintHelper$PrintHelperVersionImpl.setOrientation(int)>
	//    4   10:return          
	}

	public void setScaleMode(int i)
	{
		mImpl.setScaleMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field PrintHelper$PrintHelperVersionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #102 <Method void PrintHelper$PrintHelperVersionImpl.setScaleMode(int)>
	//    4   10:return          
	}

	public static final int COLOR_MODE_COLOR = 2;
	public static final int COLOR_MODE_MONOCHROME = 1;
	public static final int ORIENTATION_LANDSCAPE = 1;
	public static final int ORIENTATION_PORTRAIT = 2;
	public static final int SCALE_MODE_FILL = 2;
	public static final int SCALE_MODE_FIT = 1;
	PrintHelperVersionImpl mImpl;
}
