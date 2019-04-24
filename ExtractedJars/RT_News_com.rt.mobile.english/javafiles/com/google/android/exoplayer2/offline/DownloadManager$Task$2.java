// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;


// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadManager

class DownloadManager$Task$2
	implements Runnable
{

	public void run()
	{
		DownloadManager.Task task = DownloadManager.Task.this;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field DownloadManager$Task this$0>
	//    2    4:astore_2        
		byte byte0;
		if(val$finalError != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #24  <Field Throwable val$finalError>
	//*   5    9:ifnull          17
			byte0 = 4;
	//    6   12:iconst_4        
	//    7   13:istore_1        
		else
	//*   8   14:goto            19
			byte0 = 2;
	//    9   17:iconst_2        
	//   10   18:istore_1        
		if(!DownloadManager.Task.access$2500(task, 1, ((int) (byte0)), val$finalError) && !DownloadManager.Task.access$2100(DownloadManager.Task.this, 6, 3))
	//*  11   19:aload_2         
	//*  12   20:iconst_1        
	//*  13   21:iload_1         
	//*  14   22:aload_0         
	//*  15   23:getfield        #24  <Field Throwable val$finalError>
	//*  16   26:invokestatic    #31  <Method boolean DownloadManager$Task.access$2500(DownloadManager$Task, int, int, Throwable)>
	//*  17   29:ifne            67
	//*  18   32:aload_0         
	//*  19   33:getfield        #22  <Field DownloadManager$Task this$0>
	//*  20   36:bipush          6
	//*  21   38:iconst_3        
	//*  22   39:invokestatic    #35  <Method boolean DownloadManager$Task.access$2100(DownloadManager$Task, int, int)>
	//*  23   42:ifne            67
		{
			if(DownloadManager.Task.access$2100(DownloadManager.Task.this, 7, 0))
	//*  24   45:aload_0         
	//*  25   46:getfield        #22  <Field DownloadManager$Task this$0>
	//*  26   49:bipush          7
	//*  27   51:iconst_0        
	//*  28   52:invokestatic    #35  <Method boolean DownloadManager$Task.access$2100(DownloadManager$Task, int, int)>
	//*  29   55:ifeq            59
				return;
	//   30   58:return          
			else
				throw new IllegalStateException();
	//   31   59:new             #37  <Class IllegalStateException>
	//   32   62:dup             
	//   33   63:invokespecial   #38  <Method void IllegalStateException()>
	//   34   66:athrow          
		} else
		{
			return;
	//   35   67:return          
		}
	}

	final DownloadManager.Task this$0;
	final Throwable val$finalError;

	DownloadManager$Task$2()
	{
		this$0 = final_task;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field DownloadManager$Task this$0>
		val$finalError = Throwable.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Throwable val$finalError>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
