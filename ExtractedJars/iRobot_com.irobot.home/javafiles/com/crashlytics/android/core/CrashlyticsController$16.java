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
	{
		TreeSet treeset = val$ndkData.timestampedDirectories;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field CrashlyticsNdkData val$ndkData>
	//    2    4:getfield        #34  <Field TreeSet CrashlyticsNdkData.timestampedDirectories>
	//    3    7:astore_1        
		String s = CrashlyticsController.access$1600(CrashlyticsController.this);
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field CrashlyticsController this$0>
	//    6   12:invokestatic    #38  <Method String CrashlyticsController.access$1600(CrashlyticsController)>
	//    7   15:astore_2        
		if(s != null && !treeset.isEmpty())
	//*   8   16:aload_2         
	//*   9   17:ifnull          58
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #44  <Method boolean TreeSet.isEmpty()>
	//*  12   24:ifne            58
		{
			File file = (File)treeset.first();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #48  <Method Object TreeSet.first()>
	//   15   31:checkcast       #50  <Class File>
	//   16   34:astore_3        
			if(file != null)
	//*  17   35:aload_3         
	//*  18   36:ifnull          58
				CrashlyticsController.access$1700(CrashlyticsController.this, CrashlyticsController.access$400(CrashlyticsController.this).getContext(), file, s);
	//   19   39:aload_0         
	//   20   40:getfield        #20  <Field CrashlyticsController this$0>
	//   21   43:aload_0         
	//   22   44:getfield        #20  <Field CrashlyticsController this$0>
	//   23   47:invokestatic    #54  <Method CrashlyticsCore CrashlyticsController.access$400(CrashlyticsController)>
	//   24   50:invokevirtual   #60  <Method android.content.Context CrashlyticsCore.getContext()>
	//   25   53:aload_3         
	//   26   54:aload_2         
	//   27   55:invokestatic    #64  <Method void CrashlyticsController.access$1700(CrashlyticsController, android.content.Context, File, String)>
		}
		CrashlyticsController.access$1800(CrashlyticsController.this, ((java.util.Set) (treeset)));
	//   28   58:aload_0         
	//   29   59:getfield        #20  <Field CrashlyticsController this$0>
	//   30   62:aload_1         
	//   31   63:invokestatic    #68  <Method void CrashlyticsController.access$1800(CrashlyticsController, java.util.Set)>
		return Boolean.TRUE;
	//   32   66:getstatic       #74  <Field Boolean Boolean.TRUE>
	//   33   69:areturn         
	}

	public volatile Object call()
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #76  <Method Boolean call()>
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
