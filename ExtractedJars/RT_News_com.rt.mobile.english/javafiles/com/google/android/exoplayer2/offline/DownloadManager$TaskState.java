// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadManager, DownloadAction

public static final class DownloadManager$TaskState
{
	public static interface State
		extends Annotation
	{
	}


	public static String getStateString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 4: default 36
	//	               0 56
	//	               1 53
	//	               2 50
	//	               3 47
	//	               4 44
		default:
			throw new IllegalStateException();
	//    2   36:new             #56  <Class IllegalStateException>
	//    3   39:dup             
	//    4   40:invokespecial   #57  <Method void IllegalStateException()>
	//    5   43:athrow          

		case 4: // '\004'
			return "FAILED";
	//    6   44:ldc1            #59  <String "FAILED">
	//    7   46:areturn         

		case 3: // '\003'
			return "CANCELED";
	//    8   47:ldc1            #61  <String "CANCELED">
	//    9   49:areturn         

		case 2: // '\002'
			return "COMPLETED";
	//   10   50:ldc1            #63  <String "COMPLETED">
	//   11   52:areturn         

		case 1: // '\001'
			return "STARTED";
	//   12   53:ldc1            #65  <String "STARTED">
	//   13   55:areturn         

		case 0: // '\0'
			return "QUEUED";
	//   14   56:ldc1            #67  <String "QUEUED">
	//   15   58:areturn         
		}
	}

	public static final int STATE_CANCELED = 3;
	public static final int STATE_COMPLETED = 2;
	public static final int STATE_FAILED = 4;
	public static final int STATE_QUEUED = 0;
	public static final int STATE_STARTED = 1;
	public final DownloadAction action;
	public final float downloadPercentage;
	public final long downloadedBytes;
	public final Throwable error;
	public final int state;
	public final int taskId;

	private DownloadManager$TaskState(int i, DownloadAction downloadaction, int j, float f, long l, Throwable throwable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		taskId = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #38  <Field int taskId>
		action = downloadaction;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field DownloadAction action>
		state = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #42  <Field int state>
		downloadPercentage = f;
	//   11   19:aload_0         
	//   12   20:fload           4
	//   13   22:putfield        #44  <Field float downloadPercentage>
		downloadedBytes = l;
	//   14   25:aload_0         
	//   15   26:lload           5
	//   16   28:putfield        #46  <Field long downloadedBytes>
		error = throwable;
	//   17   31:aload_0         
	//   18   32:aload           7
	//   19   34:putfield        #48  <Field Throwable error>
	//   20   37:return          
	}

	DownloadManager$TaskState(int i, DownloadAction downloadaction, int j, float f, long l, Throwable throwable, 
			DownloadManager._cls1 _pcls1)
	{
		this(i, downloadaction, j, f, l, throwable);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:fload           4
	//    5    6:lload           5
	//    6    8:aload           7
	//    7   10:invokespecial   #52  <Method void DownloadManager$TaskState(int, DownloadAction, int, float, long, Throwable)>
	//    8   13:return          
	}
}
