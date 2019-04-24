// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package io.fabric.sdk.android.services.events:
//			FileRollOverManager

public class TimeBasedFileRollOverRunnable
	implements Runnable
{

	public TimeBasedFileRollOverRunnable(Context context1, FileRollOverManager filerollovermanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Context context>
		fileRollOverManager = filerollovermanager;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field FileRollOverManager fileRollOverManager>
	//    8   14:return          
	}

	public void run()
	{
		try
		{
			CommonUtils.logControlled(context, "Performing time based file roll over.");
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Context context>
	//    2    4:ldc1            #25  <String "Performing time based file roll over.">
	//    3    6:invokestatic    #31  <Method void CommonUtils.logControlled(Context, String)>
			if(!fileRollOverManager.rollFileOver())
	//*   4    9:aload_0         
	//*   5   10:getfield        #19  <Field FileRollOverManager fileRollOverManager>
	//*   6   13:invokeinterface #37  <Method boolean FileRollOverManager.rollFileOver()>
	//*   7   18:ifne            30
				fileRollOverManager.cancelTimeBasedFileRollOver();
	//    8   21:aload_0         
	//    9   22:getfield        #19  <Field FileRollOverManager fileRollOverManager>
	//   10   25:invokeinterface #40  <Method void FileRollOverManager.cancelTimeBasedFileRollOver()>
			return;
	//   11   30:return          
		}
		catch(Exception exception)
	//*  12   31:astore_1        
		{
			CommonUtils.logControlledError(context, "Failed to roll over file", ((Throwable) (exception)));
	//   13   32:aload_0         
	//   14   33:getfield        #17  <Field Context context>
	//   15   36:ldc1            #42  <String "Failed to roll over file">
	//   16   38:aload_1         
	//   17   39:invokestatic    #46  <Method void CommonUtils.logControlledError(Context, String, Throwable)>
		}
	//   18   42:return          
	}

	private final Context context;
	private final FileRollOverManager fileRollOverManager;
}
