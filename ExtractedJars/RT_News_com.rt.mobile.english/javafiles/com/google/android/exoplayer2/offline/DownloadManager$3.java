// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.util.Log;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadManager, ActionFile, DownloadAction

class DownloadManager$3
	implements Runnable
{

	public void run()
	{
		try
		{
			DownloadManager.access$900(DownloadManager.this).store(val$actions);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field DownloadManager this$0>
	//    2    4:invokestatic    #31  <Method ActionFile DownloadManager.access$900(DownloadManager)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field DownloadAction[] val$actions>
	//    5   11:invokevirtual   #37  <Method void ActionFile.store(DownloadAction[])>
			DownloadManager.access$1000("Actions persisted.");
	//    6   14:ldc1            #39  <String "Actions persisted.">
	//    7   16:invokestatic    #43  <Method void DownloadManager.access$1000(String)>
			return;
	//    8   19:return          
		}
		catch(IOException ioexception)
	//*   9   20:astore_1        
		{
			Log.e("DownloadManager", "Persisting actions failed.", ((Throwable) (ioexception)));
	//   10   21:ldc1            #45  <String "DownloadManager">
	//   11   23:ldc1            #47  <String "Persisting actions failed.">
	//   12   25:aload_1         
	//   13   26:invokestatic    #53  <Method int Log.e(String, String, Throwable)>
	//   14   29:pop             
		}
	//   15   30:return          
	}

	final DownloadManager this$0;
	final DownloadAction val$actions[];

	DownloadManager$3()
	{
		this$0 = final_downloadmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DownloadManager this$0>
		val$actions = _5B_Lcom.google.android.exoplayer2.offline.DownloadAction_3B_.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field DownloadAction[] val$actions>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
