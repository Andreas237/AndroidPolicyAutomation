// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.os.ConditionVariable;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadManager

class DownloadManager$1
	implements Runnable
{

	public void run()
	{
		val$fileIOFinishedCondition.open();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ConditionVariable val$fileIOFinishedCondition>
	//    2    4:invokevirtual   #30  <Method void ConditionVariable.open()>
	//    3    7:return          
	}

	final DownloadManager this$0;
	final ConditionVariable val$fileIOFinishedCondition;

	DownloadManager$1()
	{
		this$0 = final_downloadmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DownloadManager this$0>
		val$fileIOFinishedCondition = ConditionVariable.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ConditionVariable val$fileIOFinishedCondition>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
