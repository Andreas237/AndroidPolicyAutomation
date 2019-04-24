// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import android.content.Context;
import android.os.*;
import android.widget.Toast;
import com.squareup.leakcanary.internal.FutureResult;
import java.io.File;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.leakcanary:
//			HeapDumper, LeakDirectoryProvider, CanaryLog

public final class AndroidHeapDumper
	implements HeapDumper
{

	public AndroidHeapDumper(Context context1, LeakDirectoryProvider leakdirectoryprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		leakDirectoryProvider = leakdirectoryprovider;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #19  <Field LeakDirectoryProvider leakDirectoryProvider>
		context = context1.getApplicationContext();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #25  <Method Context Context.getApplicationContext()>
	//    8   14:putfield        #27  <Field Context context>
	//    9   17:aload_0         
	//   10   18:new             #29  <Class Handler>
	//   11   21:dup             
	//   12   22:invokestatic    #35  <Method Looper Looper.getMainLooper()>
	//   13   25:invokespecial   #38  <Method void Handler(Looper)>
	//   14   28:putfield        #40  <Field Handler mainHandler>
	//   15   31:return          
	}

	private void cancelToast(Toast toast)
	{
		mainHandler.post(((Runnable) (new _cls2(toast))));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Handler mainHandler>
	//    2    4:new             #45  <Class AndroidHeapDumper$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #48  <Method void AndroidHeapDumper$2(AndroidHeapDumper, Toast)>
	//    7   13:invokevirtual   #52  <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	private void showToast(FutureResult futureresult)
	{
		mainHandler.post(((Runnable) (new _cls1(futureresult))));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Handler mainHandler>
	//    2    4:new             #56  <Class AndroidHeapDumper$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #59  <Method void AndroidHeapDumper$1(AndroidHeapDumper, FutureResult)>
	//    7   13:invokevirtual   #52  <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	public File dumpHeap()
	{
		File file = leakDirectoryProvider.newHeapDumpFile();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field LeakDirectoryProvider leakDirectoryProvider>
	//    2    4:invokeinterface #70  <Method File LeakDirectoryProvider.newHeapDumpFile()>
	//    3    9:astore_1        
		if(file == RETRY_LATER)
	//*   4   10:aload_1         
	//*   5   11:getstatic       #74  <Field File RETRY_LATER>
	//*   6   14:if_acmpne       21
			return RETRY_LATER;
	//    7   17:getstatic       #74  <Field File RETRY_LATER>
	//    8   20:areturn         
		Object obj = ((Object) (new FutureResult()));
	//    9   21:new             #76  <Class FutureResult>
	//   10   24:dup             
	//   11   25:invokespecial   #77  <Method void FutureResult()>
	//   12   28:astore_2        
		showToast(((FutureResult) (obj)));
	//   13   29:aload_0         
	//   14   30:aload_2         
	//   15   31:invokespecial   #79  <Method void showToast(FutureResult)>
		if(!((FutureResult) (obj)).wait(5L, TimeUnit.SECONDS))
	//*  16   34:aload_2         
	//*  17   35:ldc2w           #80  <Long 5L>
	//*  18   38:getstatic       #87  <Field TimeUnit TimeUnit.SECONDS>
	//*  19   41:invokevirtual   #91  <Method boolean FutureResult.wait(long, TimeUnit)>
	//*  20   44:ifne            60
		{
			CanaryLog.d("Did not dump heap, too much time waiting for Toast.", new Object[0]);
	//   21   47:ldc1            #93  <String "Did not dump heap, too much time waiting for Toast.">
	//   22   49:iconst_0        
	//   23   50:anewarray       Object[]
	//   24   53:invokestatic    #99  <Method void CanaryLog.d(String, Object[])>
			return RETRY_LATER;
	//   25   56:getstatic       #74  <Field File RETRY_LATER>
	//   26   59:areturn         
		}
		obj = ((Object) ((Toast)((FutureResult) (obj)).get()));
	//   27   60:aload_2         
	//   28   61:invokevirtual   #103 <Method Object FutureResult.get()>
	//   29   64:checkcast       #105 <Class Toast>
	//   30   67:astore_2        
		try
		{
			Debug.dumpHprofData(file.getAbsolutePath());
	//   31   68:aload_1         
	//   32   69:invokevirtual   #111 <Method String File.getAbsolutePath()>
	//   33   72:invokestatic    #117 <Method void Debug.dumpHprofData(String)>
			cancelToast(((Toast) (obj)));
	//   34   75:aload_0         
	//   35   76:aload_2         
	//   36   77:invokespecial   #119 <Method void cancelToast(Toast)>
		}
	//*  37   80:aload_1         
	//*  38   81:areturn         
		catch(Exception exception)
	//*  39   82:astore_1        
		{
			CanaryLog.d(((Throwable) (exception)), "Could not dump heap", new Object[0]);
	//   40   83:aload_1         
	//   41   84:ldc1            #121 <String "Could not dump heap">
	//   42   86:iconst_0        
	//   43   87:anewarray       Object[]
	//   44   90:invokestatic    #124 <Method void CanaryLog.d(Throwable, String, Object[])>
			return RETRY_LATER;
	//   45   93:getstatic       #74  <Field File RETRY_LATER>
	//   46   96:areturn         
		}
		return file;
	}

	final Context context;
	private final LeakDirectoryProvider leakDirectoryProvider;
	private final Handler mainHandler = new Handler(Looper.getMainLooper());

	/* member class not found */
	class _cls2 {}


	/* member class not found */
	class _cls1 {}

}
