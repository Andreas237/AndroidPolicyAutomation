// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.os.Handler;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadManager, Downloader, DownloadAction

private static final class DownloadManager$Task
	implements Runnable
{
	public static interface InternalState
		extends Annotation
	{
	}


	private boolean canStart()
	{
		return currentState == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int currentState>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private void cancel()
	{
		if(changeStateAndNotify(0, 5))
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:iconst_5        
	//*   3    3:invokespecial   #69  <Method boolean changeStateAndNotify(int, int)>
	//*   4    6:ifeq            29
		{
			DownloadManager.access$1900(downloadManager).post(new Runnable() {

				public void run()
				{
					changeStateAndNotify(5, 3);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field DownloadManager$Task this$0>
				//    2    4:iconst_5        
				//    3    5:iconst_3        
				//    4    6:invokestatic    #28  <Method boolean DownloadManager$Task.access$2100(DownloadManager$Task, int, int)>
				//    5    9:pop             
				//    6   10:return          
				}

				final DownloadManager.Task this$0;

			
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
);
	//    5    9:aload_0         
	//    6   10:getfield        #45  <Field DownloadManager downloadManager>
	//    7   13:invokestatic    #94  <Method Handler DownloadManager.access$1900(DownloadManager)>
	//    8   16:new             #11  <Class DownloadManager$Task$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #96  <Method void DownloadManager$Task$1(DownloadManager$Task)>
	//   12   24:invokevirtual   #102 <Method boolean Handler.post(Runnable)>
	//   13   27:pop             
			return;
	//   14   28:return          
		}
		if(changeStateAndNotify(1, 6))
	//*  15   29:aload_0         
	//*  16   30:iconst_1        
	//*  17   31:bipush          6
	//*  18   33:invokespecial   #69  <Method boolean changeStateAndNotify(int, int)>
	//*  19   36:ifeq            43
			cancelDownload();
	//   20   39:aload_0         
	//   21   40:invokespecial   #105 <Method void cancelDownload()>
	//   22   43:return          
	}

	private void cancelDownload()
	{
		if(downloader != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field Downloader downloader>
	//*   2    4:ifnull          16
			downloader.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #107 <Field Downloader downloader>
	//    5   11:invokeinterface #110 <Method void Downloader.cancel()>
		thread.interrupt();
	//    6   16:aload_0         
	//    7   17:getfield        #112 <Field Thread thread>
	//    8   20:invokevirtual   #117 <Method void Thread.interrupt()>
	//    9   23:return          
	}

	private boolean changeStateAndNotify(int i, int j)
	{
		return changeStateAndNotify(i, j, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #74  <Method boolean changeStateAndNotify(int, int, Throwable)>
	//    5    7:ireturn         
	}

	private boolean changeStateAndNotify(int i, int j, Throwable throwable)
	{
		int k = currentState;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int currentState>
	//    2    4:istore          5
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
		if(k != i)
	//*   5    9:iload           5
	//*   6   11:iload_1         
	//*   7   12:icmpeq          17
			return false;
	//    8   15:iconst_0        
	//    9   16:ireturn         
		currentState = j;
	//   10   17:aload_0         
	//   11   18:iload_2         
	//   12   19:putfield        #49  <Field int currentState>
		error = throwable;
	//   13   22:aload_0         
	//   14   23:aload_3         
	//   15   24:putfield        #119 <Field Throwable error>
		i = ((int) (flag));
	//   16   27:iload           4
	//   17   29:istore_1        
		if(currentState != getExternalState())
	//*  18   30:aload_0         
	//*  19   31:getfield        #49  <Field int currentState>
	//*  20   34:aload_0         
	//*  21   35:invokespecial   #123 <Method int getExternalState()>
	//*  22   38:icmpeq          43
			i = 1;
	//   23   41:iconst_1        
	//   24   42:istore_1        
		if(i == 0)
	//*  25   43:iload_1         
	//*  26   44:ifne            55
			DownloadManager.access$2300(downloadManager, this);
	//   27   47:aload_0         
	//   28   48:getfield        #45  <Field DownloadManager downloadManager>
	//   29   51:aload_0         
	//   30   52:invokestatic    #127 <Method void DownloadManager.access$2300(DownloadManager, DownloadManager$Task)>
		return true;
	//   31   55:iconst_1        
	//   32   56:ireturn         
	}

	private int getExternalState()
	{
		switch(currentState)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field int currentState>
		{
	//*   2    4:tableswitch     5 7: default 32
	//	               5 39
	//	               6 37
	//	               7 37
		default:
			return currentState;
	//    3   32:aload_0         
	//    4   33:getfield        #49  <Field int currentState>
	//    5   36:ireturn         

		case 6: // '\006'
		case 7: // '\007'
			return 1;
	//    6   37:iconst_1        
	//    7   38:ireturn         

		case 5: // '\005'
			return 0;
	//    8   39:iconst_0        
	//    9   40:ireturn         
		}
	}

	private int getRetryDelayMillis(int i)
	{
		return Math.min((i - 1) * 1000, 5000);
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:isub            
	//    3    3:sipush          1000
	//    4    6:imul            
	//    5    7:sipush          5000
	//    6   10:invokestatic    #135 <Method int Math.min(int, int)>
	//    7   13:ireturn         
	}

	private String getStateString()
	{
		switch(currentState)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field int currentState>
		{
	//*   2    4:tableswitch     5 7: default 32
	//	               5 43
	//	               6 43
	//	               7 40
		default:
			return tate.getStateString(currentState);
	//    3   32:aload_0         
	//    4   33:getfield        #49  <Field int currentState>
	//    5   36:invokestatic    #142 <Method String DownloadManager$TaskState.getStateString(int)>
	//    6   39:areturn         

		case 7: // '\007'
			return "STOPPING";
	//    7   40:ldc1            #144 <String "STOPPING">
	//    8   42:areturn         

		case 5: // '\005'
		case 6: // '\006'
			return "CANCELING";
	//    9   43:ldc1            #146 <String "CANCELING">
	//   10   45:areturn         
		}
	}

	private void start()
	{
		if(changeStateAndNotify(0, 1))
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:iconst_1        
	//*   3    3:invokespecial   #69  <Method boolean changeStateAndNotify(int, int)>
	//*   4    6:ifeq            28
		{
			thread = new Thread(((Runnable) (this)));
	//    5    9:aload_0         
	//    6   10:new             #114 <Class Thread>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #149 <Method void Thread(Runnable)>
	//   10   18:putfield        #112 <Field Thread thread>
			thread.start();
	//   11   21:aload_0         
	//   12   22:getfield        #112 <Field Thread thread>
	//   13   25:invokevirtual   #150 <Method void Thread.start()>
		}
	//   14   28:return          
	}

	private void stop()
	{
		if(changeStateAndNotify(1, 7))
	//*   0    0:aload_0         
	//*   1    1:iconst_1        
	//*   2    2:bipush          7
	//*   3    4:invokespecial   #69  <Method boolean changeStateAndNotify(int, int)>
	//*   4    7:ifeq            23
		{
			DownloadManager.access$2200("Stopping", this);
	//    5   10:ldc1            #152 <String "Stopping">
	//    6   12:aload_0         
	//    7   13:invokestatic    #156 <Method void DownloadManager.access$2200(String, DownloadManager$Task)>
			thread.interrupt();
	//    8   16:aload_0         
	//    9   17:getfield        #112 <Field Thread thread>
	//   10   20:invokevirtual   #117 <Method void Thread.interrupt()>
		}
	//   11   23:return          
	}

	private static String toString(byte abyte0[])
	{
		if(abyte0.length > 100)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:bipush          100
	//*   3    4:icmple          10
		{
			return "<data is too long>";
	//    4    7:ldc1            #160 <String "<data is too long>">
	//    5    9:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   10:new             #162 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #163 <Method void StringBuilder()>
	//    9   17:astore_1        
			stringbuilder.append('\'');
	//   10   18:aload_1         
	//   11   19:bipush          39
	//   12   21:invokevirtual   #167 <Method StringBuilder StringBuilder.append(char)>
	//   13   24:pop             
			stringbuilder.append(Util.fromUtf8Bytes(abyte0));
	//   14   25:aload_1         
	//   15   26:aload_0         
	//   16   27:invokestatic    #172 <Method String Util.fromUtf8Bytes(byte[])>
	//   17   30:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			stringbuilder.append('\'');
	//   19   34:aload_1         
	//   20   35:bipush          39
	//   21   37:invokevirtual   #167 <Method StringBuilder StringBuilder.append(char)>
	//   22   40:pop             
			return stringbuilder.toString();
	//   23   41:aload_1         
	//   24   42:invokevirtual   #177 <Method String StringBuilder.toString()>
	//   25   45:areturn         
		}
	}

	public float getDownloadPercentage()
	{
		if(downloader != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field Downloader downloader>
	//*   2    4:ifnull          17
			return downloader.getDownloadPercentage();
	//    3    7:aload_0         
	//    4    8:getfield        #107 <Field Downloader downloader>
	//    5   11:invokeinterface #181 <Method float Downloader.getDownloadPercentage()>
	//    6   16:freturn         
		else
			return -1F;
	//    7   17:ldc1            #182 <Float -1F>
	//    8   19:freturn         
	}

	public tate getDownloadState()
	{
		int i = getExternalState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #123 <Method int getExternalState()>
	//    2    4:istore_1        
		return new tate(id, action, i, getDownloadPercentage(), getDownloadedBytes(), error, ((DownloadManager._cls1) (null)));
	//    3    5:new             #139 <Class DownloadManager$TaskState>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field int id>
	//    7   13:aload_0         
	//    8   14:getfield        #47  <Field DownloadAction action>
	//    9   17:iload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #185 <Method float getDownloadPercentage()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #189 <Method long getDownloadedBytes()>
	//   14   26:aload_0         
	//   15   27:getfield        #119 <Field Throwable error>
	//   16   30:aconst_null     
	//   17   31:invokespecial   #192 <Method void DownloadManager$TaskState(int, DownloadAction, int, float, long, Throwable, DownloadManager$1)>
	//   18   34:areturn         
	}

	public long getDownloadedBytes()
	{
		if(downloader != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field Downloader downloader>
	//*   2    4:ifnull          17
			return downloader.getDownloadedBytes();
	//    3    7:aload_0         
	//    4    8:getfield        #107 <Field Downloader downloader>
	//    5   11:invokeinterface #193 <Method long Downloader.getDownloadedBytes()>
	//    6   16:lreturn         
		else
			return 0L;
	//    7   17:lconst_0        
	//    8   18:lreturn         
	}

	public boolean isActive()
	{
		int i = currentState;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int currentState>
	//    2    4:istore_1        
		boolean flag1 = true;
	//    3    5:iconst_1        
	//    4    6:istore_3        
		boolean flag = flag1;
	//    5    7:iload_3         
	//    6    8:istore_2        
		if(i != 5)
	//*   7    9:iload_1         
	//*   8   10:iconst_5        
	//*   9   11:icmpeq          48
		{
			flag = flag1;
	//   10   14:iload_3         
	//   11   15:istore_2        
			if(currentState != 1)
	//*  12   16:aload_0         
	//*  13   17:getfield        #49  <Field int currentState>
	//*  14   20:iconst_1        
	//*  15   21:icmpeq          48
			{
				flag = flag1;
	//   16   24:iload_3         
	//   17   25:istore_2        
				if(currentState != 7)
	//*  18   26:aload_0         
	//*  19   27:getfield        #49  <Field int currentState>
	//*  20   30:bipush          7
	//*  21   32:icmpeq          48
				{
					if(currentState == 6)
	//*  22   35:aload_0         
	//*  23   36:getfield        #49  <Field int currentState>
	//*  24   39:bipush          6
	//*  25   41:icmpne          46
						return true;
	//   26   44:iconst_1        
	//   27   45:ireturn         
					flag = false;
	//   28   46:iconst_0        
	//   29   47:istore_2        
				}
			}
		}
		return flag;
	//   30   48:iload_2         
	//   31   49:ireturn         
	}

	public boolean isFinished()
	{
		return currentState == 4 || currentState == 2 || currentState == 3;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int currentState>
	//    2    4:iconst_4        
	//    3    5:icmpeq          29
	//    4    8:aload_0         
	//    5    9:getfield        #49  <Field int currentState>
	//    6   12:iconst_2        
	//    7   13:icmpeq          29
	//    8   16:aload_0         
	//    9   17:getfield        #49  <Field int currentState>
	//   10   20:iconst_3        
	//   11   21:icmpne          27
	//   12   24:goto            29
	//   13   27:iconst_0        
	//   14   28:ireturn         
	//   15   29:iconst_1        
	//   16   30:ireturn         
	}

	public void run()
	{
		DownloadManager.access$2200("Task is started", this);
	//    0    0:ldc1            #202 <String "Task is started">
	//    1    2:aload_0         
	//    2    3:invokestatic    #156 <Method void DownloadManager.access$2200(String, DownloadManager$Task)>
		downloader = action.createDownloader(DownloadManager.access$2400(downloadManager));
	//    3    6:aload_0         
	//    4    7:aload_0         
	//    5    8:getfield        #47  <Field DownloadAction action>
	//    6   11:aload_0         
	//    7   12:getfield        #45  <Field DownloadManager downloadManager>
	//    8   15:invokestatic    #206 <Method DownloaderConstructorHelper DownloadManager.access$2400(DownloadManager)>
	//    9   18:invokevirtual   #212 <Method Downloader DownloadAction.createDownloader(DownloaderConstructorHelper)>
	//   10   21:putfield        #107 <Field Downloader downloader>
		if(!action.isRemoveAction) goto _L2; else goto _L1
	//   11   24:aload_0         
	//   12   25:getfield        #47  <Field DownloadAction action>
	//   13   28:getfield        #216 <Field boolean DownloadAction.isRemoveAction>
	//   14   31:ifeq            235
_L1:
		downloader.remove();
	//   15   34:aload_0         
	//   16   35:getfield        #107 <Field Downloader downloader>
	//   17   38:invokeinterface #219 <Method void Downloader.remove()>
		  goto _L3
	//*  18   43:goto            205
_L7:
		boolean flag = Thread.interrupted();
	//   19   46:invokestatic    #222 <Method boolean Thread.interrupted()>
	//   20   49:istore          8
		if(flag) goto _L3; else goto _L4
	//   21   51:iload           8
	//   22   53:ifne            205
_L4:
		downloader.download();
	//   23   56:aload_0         
	//   24   57:getfield        #107 <Field Downloader downloader>
	//   25   60:invokeinterface #225 <Method void Downloader.download()>
		  goto _L3
	//*  26   65:goto            205
		Object obj;
		obj;
	//   27   68:astore          9
		long l2 = downloader.getDownloadedBytes();
	//   28   70:aload_0         
	//   29   71:getfield        #107 <Field Downloader downloader>
	//   30   74:invokeinterface #193 <Method long Downloader.getDownloadedBytes()>
	//   31   79:lstore          6
		long l;
		long l1;
		l1 = l;
	//   32   81:lload_2         
	//   33   82:lstore          4
		if(l2 == l)
			break MISSING_BLOCK_LABEL_131;
	//   34   84:lload           6
	//   35   86:lload_2         
	//   36   87:lcmp            
	//   37   88:ifeq            131
		StringBuilder stringbuilder = new StringBuilder();
	//   38   91:new             #162 <Class StringBuilder>
	//   39   94:dup             
	//   40   95:invokespecial   #163 <Method void StringBuilder()>
	//   41   98:astore          10
		stringbuilder.append("Reset error count. downloadedBytes = ");
	//   42  100:aload           10
	//   43  102:ldc1            #227 <String "Reset error count. downloadedBytes = ">
	//   44  104:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   45  107:pop             
		stringbuilder.append(l2);
	//   46  108:aload           10
	//   47  110:lload           6
	//   48  112:invokevirtual   #230 <Method StringBuilder StringBuilder.append(long)>
	//   49  115:pop             
		DownloadManager.access$2200(stringbuilder.toString(), this);
	//   50  116:aload           10
	//   51  118:invokevirtual   #177 <Method String StringBuilder.toString()>
	//   52  121:aload_0         
	//   53  122:invokestatic    #156 <Method void DownloadManager.access$2200(String, DownloadManager$Task)>
		int i;
		i = 0;
	//   54  125:iconst_0        
	//   55  126:istore_1        
		l1 = l2;
	//   56  127:lload           6
	//   57  129:lstore          4
		if(currentState != 1)
			break MISSING_BLOCK_LABEL_202;
	//   58  131:aload_0         
	//   59  132:getfield        #49  <Field int currentState>
	//   60  135:iconst_1        
	//   61  136:icmpne          202
		i++;
	//   62  139:iload_1         
	//   63  140:iconst_1        
	//   64  141:iadd            
	//   65  142:istore_1        
		if(i > minRetryCount)
	//*  66  143:iload_1         
	//*  67  144:aload_0         
	//*  68  145:getfield        #51  <Field int minRetryCount>
	//*  69  148:icmple          154
			break MISSING_BLOCK_LABEL_202;
	//   70  151:goto            202
		obj = ((Object) (new StringBuilder()));
	//   71  154:new             #162 <Class StringBuilder>
	//   72  157:dup             
	//   73  158:invokespecial   #163 <Method void StringBuilder()>
	//   74  161:astore          9
		((StringBuilder) (obj)).append("Download error. Retry ");
	//   75  163:aload           9
	//   76  165:ldc1            #232 <String "Download error. Retry ">
	//   77  167:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   78  170:pop             
		((StringBuilder) (obj)).append(i);
	//   79  171:aload           9
	//   80  173:iload_1         
	//   81  174:invokevirtual   #235 <Method StringBuilder StringBuilder.append(int)>
	//   82  177:pop             
		DownloadManager.access$2200(((StringBuilder) (obj)).toString(), this);
	//   83  178:aload           9
	//   84  180:invokevirtual   #177 <Method String StringBuilder.toString()>
	//   85  183:aload_0         
	//   86  184:invokestatic    #156 <Method void DownloadManager.access$2200(String, DownloadManager$Task)>
		Thread.sleep(getRetryDelayMillis(i));
	//   87  187:aload_0         
	//   88  188:iload_1         
	//   89  189:invokespecial   #237 <Method int getRetryDelayMillis(int)>
	//   90  192:i2l             
	//   91  193:invokestatic    #241 <Method void Thread.sleep(long)>
		l = l1;
	//   92  196:lload           4
	//   93  198:lstore_2        
		continue; /* Loop/switch isn't completed */
	//   94  199:goto            46
		final Throwable finalError;
		try
		{
			throw obj;
	//   95  202:aload           9
	//   96  204:athrow          
		}
	//*  97  205:aconst_null     
	//*  98  206:astore          9
	//*  99  208:goto            213
		// Misplaced declaration of an exception variable
		catch(final Throwable finalError) { }
	//  100  211:astore          9
		  goto _L5
_L3:
		finalError = null;
_L5:
		DownloadManager.access$1900(downloadManager).post(new Runnable() {

			public void run()
			{
				DownloadManager.Task task = DownloadManager.Task.this;
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field DownloadManager$Task this$0>
			//    2    4:astore_2        
				byte byte0;
				if(finalError != null)
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
				if(!task.changeStateAndNotify(1, ((int) (byte0)), finalError) && !changeStateAndNotify(6, 3))
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
					if(changeStateAndNotify(7, 0))
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

			
			{
				this$0 = DownloadManager.Task.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field DownloadManager$Task this$0>
				finalError = throwable;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Throwable val$finalError>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//  101  213:aload_0         
	//  102  214:getfield        #45  <Field DownloadManager downloadManager>
	//  103  217:invokestatic    #94  <Method Handler DownloadManager.access$1900(DownloadManager)>
	//  104  220:new             #13  <Class DownloadManager$Task$2>
	//  105  223:dup             
	//  106  224:aload_0         
	//  107  225:aload           9
	//  108  227:invokespecial   #244 <Method void DownloadManager$Task$2(DownloadManager$Task, Throwable)>
	//  109  230:invokevirtual   #102 <Method boolean Handler.post(Runnable)>
	//  110  233:pop             
		return;
	//  111  234:return          
_L2:
		l = -1L;
	//  112  235:ldc2w           #245 <Long -1L>
	//  113  238:lstore_2        
		i = 0;
	//  114  239:iconst_0        
	//  115  240:istore_1        
		if(true) goto _L7; else goto _L6
	//  116  241:goto            46
_L6:
	}

	public String toString()
	{
		return super.toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #247 <Method String Object.toString()>
	//    2    4:areturn         
	}

	public static final int STATE_QUEUED_CANCELING = 5;
	public static final int STATE_STARTED_CANCELING = 6;
	public static final int STATE_STARTED_STOPPING = 7;
	private final DownloadAction action;
	private volatile int currentState;
	private final DownloadManager downloadManager;
	private volatile Downloader downloader;
	private Throwable error;
	private final int id;
	private final int minRetryCount;
	private Thread thread;


/*
	static void access$000(DownloadManager$Task downloadmanager$task)
	{
		downloadmanager$task.stop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void stop()>
		return;
	//    2    4:return          
	}

*/


/*
	static int access$100(DownloadManager$Task downloadmanager$task)
	{
		return downloadmanager$task.currentState;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int currentState>
	//    2    4:ireturn         
	}

*/


/*
	static int access$200(DownloadManager$Task downloadmanager$task)
	{
		return downloadmanager$task.id;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int id>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$2100(DownloadManager$Task downloadmanager$task, int i, int j)
	{
		return downloadmanager$task.changeStateAndNotify(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #69  <Method boolean changeStateAndNotify(int, int)>
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$2500(DownloadManager$Task downloadmanager$task, int i, int j, Throwable throwable)
	{
		return downloadmanager$task.changeStateAndNotify(i, j, throwable);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #74  <Method boolean changeStateAndNotify(int, int, Throwable)>
	//    5    7:ireturn         
	}

*/


/*
	static DownloadAction access$300(DownloadManager$Task downloadmanager$task)
	{
		return downloadmanager$task.action;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field DownloadAction action>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$500(DownloadManager$Task downloadmanager$task)
	{
		return downloadmanager$task.canStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method boolean canStart()>
	//    2    4:ireturn         
	}

*/


/*
	static void access$600(DownloadManager$Task downloadmanager$task)
	{
		downloadmanager$task.cancel();
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void cancel()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$700(DownloadManager$Task downloadmanager$task)
	{
		downloadmanager$task.start();
	//    0    0:aload_0         
	//    1    1:invokespecial   #90  <Method void start()>
		return;
	//    2    4:return          
	}

*/

	private DownloadManager$Task(int i, DownloadManager downloadmanager, DownloadAction downloadaction, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		id = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #43  <Field int id>
		downloadManager = downloadmanager;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #45  <Field DownloadManager downloadManager>
		action = downloadaction;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #47  <Field DownloadAction action>
		currentState = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #49  <Field int currentState>
		minRetryCount = j;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #51  <Field int minRetryCount>
	//   17   30:return          
	}

	DownloadManager$Task(int i, DownloadManager downloadmanager, DownloadAction downloadaction, int j, DownloadManager._cls1 _pcls1)
	{
		this(i, downloadmanager, downloadaction, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #55  <Method void DownloadManager$Task(int, DownloadManager, DownloadAction, int)>
	//    6    9:return          
	}
}
