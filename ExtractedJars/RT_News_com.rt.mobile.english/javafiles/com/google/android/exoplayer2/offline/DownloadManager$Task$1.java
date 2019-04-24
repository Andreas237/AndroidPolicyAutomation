// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;


// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadManager

class DownloadManager$Task$1
	implements Runnable
{

	public void run()
	{
		DownloadManager.Task.access$2100(DownloadManager.Task.this, 5, 3);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field DownloadManager$Task this$0>
	//    2    4:iconst_5        
	//    3    5:iconst_3        
	//    4    6:invokestatic    #28  <Method boolean DownloadManager$Task.access$2100(DownloadManager$Task, int, int)>
	//    5    9:pop             
	//    6   10:return          
	}

	final DownloadManager.Task this$0;

	DownloadManager$Task$1()
	{
		this$0 = DownloadManager.Task.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field DownloadManager$Task this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
