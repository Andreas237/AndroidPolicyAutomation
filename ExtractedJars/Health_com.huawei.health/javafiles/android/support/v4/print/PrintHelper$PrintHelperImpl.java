// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.FileNotFoundException;

// Referenced classes of package android.support.v4.print:
//			PrintHelper, PrintHelperKitkat

static class PrintHelper$PrintHelperImpl
	implements onImpl
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

	public void printBitmap(String s, Bitmap bitmap, final lback callback)
	{
		ishCallback ishcallback = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		if(callback != null)
	//*   2    3:aload_3         
	//*   3    4:ifnull          18
			ishcallback = new PrintHelperKitkat.OnPrintFinishCallback() {

				public void onFinish()
				{
					callback.onFinish();
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field PrintHelper$OnPrintFinishCallback val$callback>
				//    2    4:invokeinterface #33  <Method void PrintHelper$OnPrintFinishCallback.onFinish()>
				//    3    9:return          
				}

				final PrintHelper.PrintHelperImpl this$0;
				final PrintHelper.OnPrintFinishCallback val$callback;

			
			{
				this$0 = PrintHelper.PrintHelperImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field PrintHelper$PrintHelperImpl this$0>
				callback = onprintfinishcallback;
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
		mPrintHelper.printBitmap(s, bitmap, ishcallback);
	//   10   18:aload_0         
	//   11   19:getfield        #24  <Field PrintHelperKitkat mPrintHelper>
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:aload           4
	//   15   26:invokevirtual   #47  <Method void PrintHelperKitkat.printBitmap(String, Bitmap, PrintHelperKitkat$OnPrintFinishCallback)>
	//   16   29:return          
	}

	public void printBitmap(String s, Uri uri, final lback callback)
		throws FileNotFoundException
	{
		ishCallback ishcallback = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		if(callback != null)
	//*   2    3:aload_3         
	//*   3    4:ifnull          18
			ishcallback = new PrintHelperKitkat.OnPrintFinishCallback() {

				public void onFinish()
				{
					callback.onFinish();
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field PrintHelper$OnPrintFinishCallback val$callback>
				//    2    4:invokeinterface #33  <Method void PrintHelper$OnPrintFinishCallback.onFinish()>
				//    3    9:return          
				}

				final PrintHelper.PrintHelperImpl this$0;
				final PrintHelper.OnPrintFinishCallback val$callback;

			
			{
				this$0 = PrintHelper.PrintHelperImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field PrintHelper$PrintHelperImpl this$0>
				callback = onprintfinishcallback;
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
		mPrintHelper.printBitmap(s, uri, ishcallback);
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

	protected PrintHelper$PrintHelperImpl(PrintHelperKitkat printhelperkitkat)
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
