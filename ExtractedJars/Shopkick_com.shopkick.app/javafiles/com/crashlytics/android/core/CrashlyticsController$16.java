// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.util.TreeSet;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, CrashlyticsNdkData, CrashlyticsCore

class CrashlyticsController$16
	implements Callable
{

	public Boolean call()
		throws Exception
	{
		TreeSet treeset = val$ndkData.timestampedDirectories;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field CrashlyticsNdkData val$ndkData>
	//    2    4:getfield        #36  <Field TreeSet CrashlyticsNdkData.timestampedDirectories>
	//    3    7:astore_1        
		String s = CrashlyticsController.access$1600(CrashlyticsController.this);
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field CrashlyticsController this$0>
	//    6   12:invokestatic    #40  <Method String CrashlyticsController.access$1600(CrashlyticsController)>
	//    7   15:astore_2        
		if(s != null && !treeset.isEmpty())
	//*   8   16:aload_2         
	//*   9   17:ifnull          60
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #46  <Method boolean TreeSet.isEmpty()>
	//*  12   24:ifne            60
		{
			File file = (File)treeset.first();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #50  <Method Object TreeSet.first()>
	//   15   31:checkcast       #52  <Class File>
	//   16   34:astore_3        
			if(file != null)
	//*  17   35:aload_3         
	//*  18   36:ifnull          60
			{
				CrashlyticsController crashlyticscontroller = CrashlyticsController.this;
	//   19   39:aload_0         
	//   20   40:getfield        #20  <Field CrashlyticsController this$0>
	//   21   43:astore          4
				CrashlyticsController.access$1700(crashlyticscontroller, CrashlyticsController.access$400(crashlyticscontroller).getContext(), file, s);
	//   22   45:aload           4
	//   23   47:aload           4
	//   24   49:invokestatic    #56  <Method CrashlyticsCore CrashlyticsController.access$400(CrashlyticsController)>
	//   25   52:invokevirtual   #62  <Method android.content.Context CrashlyticsCore.getContext()>
	//   26   55:aload_3         
	//   27   56:aload_2         
	//   28   57:invokestatic    #66  <Method void CrashlyticsController.access$1700(CrashlyticsController, android.content.Context, File, String)>
			}
		}
		CrashlyticsController.access$1800(CrashlyticsController.this, ((java.util.Set) (treeset)));
	//   29   60:aload_0         
	//   30   61:getfield        #20  <Field CrashlyticsController this$0>
	//   31   64:aload_1         
	//   32   65:invokestatic    #70  <Method void CrashlyticsController.access$1800(CrashlyticsController, java.util.Set)>
		return Boolean.TRUE;
	//   33   68:getstatic       #76  <Field Boolean Boolean.TRUE>
	//   34   71:areturn         
	}

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method Boolean call()>
	//    2    4:areturn         
	}

	final CrashlyticsController this$0;
	final CrashlyticsNdkData val$ndkData;

	CrashlyticsController$16()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CrashlyticsController this$0>
		val$ndkData = CrashlyticsNdkData.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field CrashlyticsNdkData val$ndkData>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
