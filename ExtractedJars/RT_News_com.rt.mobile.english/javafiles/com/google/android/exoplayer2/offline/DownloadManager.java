// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.os.*;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.*;
import java.lang.annotation.Annotation;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			ActionFile, DownloaderConstructorHelper, DownloadAction, Downloader

public final class DownloadManager
{
	public static interface Listener
	{

		public abstract void onIdle(DownloadManager downloadmanager);

		public abstract void onInitialized(DownloadManager downloadmanager);

		public abstract void onTaskStateChanged(DownloadManager downloadmanager, TaskState taskstate);
	}

	private static final class Task
		implements Runnable
	{

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
				downloadManager.handler.post(new Runnable() {

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

					final Task this$0;

			
			{
				this$0 = Task.this;
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
				downloadManager.onTaskStateChange(this);
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
		//		               5 39
		//		               6 37
		//		               7 37
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
		//		               5 43
		//		               6 43
		//		               7 40
			default:
				return TaskState.getStateString(currentState);
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
				DownloadManager.logd("Stopping", this);
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

		public TaskState getDownloadState()
		{
			int i = getExternalState();
		//    0    0:aload_0         
		//    1    1:invokespecial   #123 <Method int getExternalState()>
		//    2    4:istore_1        
			return new TaskState(id, action, i, getDownloadPercentage(), getDownloadedBytes(), error);
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
			DownloadManager.logd("Task is started", this);
		//    0    0:ldc1            #202 <String "Task is started">
		//    1    2:aload_0         
		//    2    3:invokestatic    #156 <Method void DownloadManager.access$2200(String, DownloadManager$Task)>
			downloader = action.createDownloader(downloadManager.downloaderConstructorHelper);
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
			DownloadManager.logd(stringbuilder.toString(), this);
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
			DownloadManager.logd(((StringBuilder) (obj)).toString(), this);
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
			Throwable throwable;
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
			catch(Throwable throwable) { }
		//  100  211:astore          9
			  goto _L5
_L3:
			throwable = null;
_L5:
			downloadManager.handler.post(((_cls2) (throwable)). new Runnable() {

				public void run()
				{
					Task task = Task.this;
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

				final Task this$0;
				final Throwable val$finalError;

			
			{
				this$0 = final_task;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field DownloadManager$Task this$0>
				finalError = Throwable.this;
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
		static void access$000(Task task)
		{
			task.stop();
		//    0    0:aload_0         
		//    1    1:invokespecial   #60  <Method void stop()>
			return;
		//    2    4:return          
		}

*/


/*
		static int access$100(Task task)
		{
			return task.currentState;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field int currentState>
		//    2    4:ireturn         
		}

*/


/*
		static int access$200(Task task)
		{
			return task.id;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field int id>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$2100(Task task, int i, int j)
		{
			return task.changeStateAndNotify(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #69  <Method boolean changeStateAndNotify(int, int)>
		//    4    6:ireturn         
		}

*/


/*
		static boolean access$2500(Task task, int i, int j, Throwable throwable)
		{
			return task.changeStateAndNotify(i, j, throwable);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #74  <Method boolean changeStateAndNotify(int, int, Throwable)>
		//    5    7:ireturn         
		}

*/


/*
		static DownloadAction access$300(Task task)
		{
			return task.action;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field DownloadAction action>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$500(Task task)
		{
			return task.canStart();
		//    0    0:aload_0         
		//    1    1:invokespecial   #82  <Method boolean canStart()>
		//    2    4:ireturn         
		}

*/


/*
		static void access$600(Task task)
		{
			task.cancel();
		//    0    0:aload_0         
		//    1    1:invokespecial   #86  <Method void cancel()>
			return;
		//    2    4:return          
		}

*/


/*
		static void access$700(Task task)
		{
			task.start();
		//    0    0:aload_0         
		//    1    1:invokespecial   #90  <Method void start()>
			return;
		//    2    4:return          
		}

*/

		private Task(int i, DownloadManager downloadmanager, DownloadAction downloadaction, int j)
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

	}

	public static interface Task.InternalState
		extends Annotation
	{
	}

	public static final class TaskState
	{

		public static String getStateString(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     0 4: default 36
		//		               0 56
		//		               1 53
		//		               2 50
		//		               3 47
		//		               4 44
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

		private TaskState(int i, DownloadAction downloadaction, int j, float f, long l, Throwable throwable)
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

		TaskState(int i, DownloadAction downloadaction, int j, float f, long l, Throwable throwable, 
				_cls1 _pcls1)
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

	public static interface TaskState.State
		extends Annotation
	{
	}


	public transient DownloadManager(DownloaderConstructorHelper downloaderconstructorhelper, int i, int j, File file, DownloadAction.Deserializer adeserializer[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void Object()>
		boolean flag;
		if(adeserializer.length > 0)
	//*   2    4:aload           5
	//*   3    6:arraylength     
	//*   4    7:ifle            16
			flag = true;
	//    5   10:iconst_1        
	//    6   11:istore          6
		else
	//*   7   13:goto            19
			flag = false;
	//    8   16:iconst_0        
	//    9   17:istore          6
		Assertions.checkArgument(flag, "At least one Deserializer is required.");
	//   10   19:iload           6
	//   11   21:ldc1            #74  <String "At least one Deserializer is required.">
	//   12   23:invokestatic    #80  <Method void Assertions.checkArgument(boolean, Object)>
		downloaderConstructorHelper = downloaderconstructorhelper;
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:putfield        #82  <Field DownloaderConstructorHelper downloaderConstructorHelper>
		maxActiveDownloadTasks = i;
	//   16   31:aload_0         
	//   17   32:iload_2         
	//   18   33:putfield        #84  <Field int maxActiveDownloadTasks>
		minRetryCount = j;
	//   19   36:aload_0         
	//   20   37:iload_3         
	//   21   38:putfield        #86  <Field int minRetryCount>
		actionFile = new ActionFile(file);
	//   22   41:aload_0         
	//   23   42:new             #88  <Class ActionFile>
	//   24   45:dup             
	//   25   46:aload           4
	//   26   48:invokespecial   #91  <Method void ActionFile(File)>
	//   27   51:putfield        #93  <Field ActionFile actionFile>
		deserializers = adeserializer;
	//   28   54:aload_0         
	//   29   55:aload           5
	//   30   57:putfield        #95  <Field DownloadAction$Deserializer[] deserializers>
		downloadsStopped = true;
	//   31   60:aload_0         
	//   32   61:iconst_1        
	//   33   62:putfield        #97  <Field boolean downloadsStopped>
		tasks = new ArrayList();
	//   34   65:aload_0         
	//   35   66:new             #99  <Class ArrayList>
	//   36   69:dup             
	//   37   70:invokespecial   #100 <Method void ArrayList()>
	//   38   73:putfield        #102 <Field ArrayList tasks>
		activeDownloadTasks = new ArrayList();
	//   39   76:aload_0         
	//   40   77:new             #99  <Class ArrayList>
	//   41   80:dup             
	//   42   81:invokespecial   #100 <Method void ArrayList()>
	//   43   84:putfield        #104 <Field ArrayList activeDownloadTasks>
		file = ((File) (Looper.myLooper()));
	//   44   87:invokestatic    #110 <Method Looper Looper.myLooper()>
	//   45   90:astore          4
		downloaderconstructorhelper = ((DownloaderConstructorHelper) (file));
	//   46   92:aload           4
	//   47   94:astore_1        
		if(file == null)
	//*  48   95:aload           4
	//*  49   97:ifnonnull       104
			downloaderconstructorhelper = ((DownloaderConstructorHelper) (Looper.getMainLooper()));
	//   50  100:invokestatic    #113 <Method Looper Looper.getMainLooper()>
	//   51  103:astore_1        
		handler = new Handler(((Looper) (downloaderconstructorhelper)));
	//   52  104:aload_0         
	//   53  105:new             #115 <Class Handler>
	//   54  108:dup             
	//   55  109:aload_1         
	//   56  110:invokespecial   #118 <Method void Handler(Looper)>
	//   57  113:putfield        #120 <Field Handler handler>
		fileIOThread = new HandlerThread("DownloadManager file i/o");
	//   58  116:aload_0         
	//   59  117:new             #122 <Class HandlerThread>
	//   60  120:dup             
	//   61  121:ldc1            #124 <String "DownloadManager file i/o">
	//   62  123:invokespecial   #127 <Method void HandlerThread(String)>
	//   63  126:putfield        #129 <Field HandlerThread fileIOThread>
		fileIOThread.start();
	//   64  129:aload_0         
	//   65  130:getfield        #129 <Field HandlerThread fileIOThread>
	//   66  133:invokevirtual   #132 <Method void HandlerThread.start()>
		fileIOHandler = new Handler(fileIOThread.getLooper());
	//   67  136:aload_0         
	//   68  137:new             #115 <Class Handler>
	//   69  140:dup             
	//   70  141:aload_0         
	//   71  142:getfield        #129 <Field HandlerThread fileIOThread>
	//   72  145:invokevirtual   #135 <Method Looper HandlerThread.getLooper()>
	//   73  148:invokespecial   #118 <Method void Handler(Looper)>
	//   74  151:putfield        #137 <Field Handler fileIOHandler>
		listeners = new CopyOnWriteArraySet();
	//   75  154:aload_0         
	//   76  155:new             #139 <Class CopyOnWriteArraySet>
	//   77  158:dup             
	//   78  159:invokespecial   #140 <Method void CopyOnWriteArraySet()>
	//   79  162:putfield        #142 <Field CopyOnWriteArraySet listeners>
		loadActions();
	//   80  165:aload_0         
	//   81  166:invokespecial   #145 <Method void loadActions()>
		logd("Created");
	//   82  169:ldc1            #147 <String "Created">
	//   83  171:invokestatic    #150 <Method void logd(String)>
	//   84  174:return          
	}

	public transient DownloadManager(DownloaderConstructorHelper downloaderconstructorhelper, File file, DownloadAction.Deserializer adeserializer[])
	{
		this(downloaderconstructorhelper, 1, 5, file, adeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:iconst_5        
	//    4    4:aload_2         
	//    5    5:aload_3         
	//    6    6:invokespecial   #154 <Method void DownloadManager(DownloaderConstructorHelper, int, int, File, DownloadAction$Deserializer[])>
	//    7    9:return          
	}

	public transient DownloadManager(Cache cache, com.google.android.exoplayer2.upstream.DataSource.Factory factory, File file, DownloadAction.Deserializer adeserializer[])
	{
		this(new DownloaderConstructorHelper(cache, factory), file, adeserializer);
	//    0    0:aload_0         
	//    1    1:new             #157 <Class DownloaderConstructorHelper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #160 <Method void DownloaderConstructorHelper(Cache, com.google.android.exoplayer2.upstream.DataSource$Factory)>
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #162 <Method void DownloadManager(DownloaderConstructorHelper, File, DownloadAction$Deserializer[])>
	//    9   16:return          
	}

	private Task addTaskForAction(DownloadAction downloadaction)
	{
		int i = nextTaskId;
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field int nextTaskId>
	//    2    4:istore_2        
		nextTaskId = i + 1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #214 <Field int nextTaskId>
		downloadaction = ((DownloadAction) (new Task(i, this, downloadaction, minRetryCount)));
	//    8   12:new             #17  <Class DownloadManager$Task>
	//    9   15:dup             
	//   10   16:iload_2         
	//   11   17:aload_0         
	//   12   18:aload_1         
	//   13   19:aload_0         
	//   14   20:getfield        #86  <Field int minRetryCount>
	//   15   23:aconst_null     
	//   16   24:invokespecial   #217 <Method void DownloadManager$Task(int, DownloadManager, DownloadAction, int, DownloadManager$1)>
	//   17   27:astore_1        
		tasks.add(((Object) (downloadaction)));
	//   18   28:aload_0         
	//   19   29:getfield        #102 <Field ArrayList tasks>
	//   20   32:aload_1         
	//   21   33:invokevirtual   #221 <Method boolean ArrayList.add(Object)>
	//   22   36:pop             
		logd("Task is added", ((Task) (downloadaction)));
	//   23   37:ldc1            #223 <String "Task is added">
	//   24   39:aload_1         
	//   25   40:invokestatic    #202 <Method void logd(String, DownloadManager$Task)>
		return ((Task) (downloadaction));
	//   26   43:aload_1         
	//   27   44:areturn         
	}

	private void loadActions()
	{
		fileIOHandler.post(new Runnable() {

			public void run()
			{
				Object obj;
				try
				{
					obj = ((Object) (actionFile.load(deserializers)));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field DownloadManager this$0>
			//    2    4:invokestatic    #29  <Method ActionFile DownloadManager.access$900(DownloadManager)>
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field DownloadManager this$0>
			//    5   11:invokestatic    #33  <Method DownloadAction$Deserializer[] DownloadManager.access$800(DownloadManager)>
			//    6   14:invokevirtual   #39  <Method DownloadAction[] ActionFile.load(DownloadAction$Deserializer[])>
			//    7   17:astore_1        
					DownloadManager.logd("Action file is loaded.");
			//    8   18:ldc1            #41  <String "Action file is loaded.">
			//    9   20:invokestatic    #45  <Method void DownloadManager.access$1000(String)>
				}
			//*  10   23:goto            41
				// Misplaced declaration of an exception variable
				catch(Object obj)
			//*  11   26:astore_1        
				{
					Log.e("DownloadManager", "Action file loading failed.", ((Throwable) (obj)));
			//   12   27:ldc1            #47  <String "DownloadManager">
			//   13   29:ldc1            #49  <String "Action file loading failed.">
			//   14   31:aload_1         
			//   15   32:invokestatic    #55  <Method int Log.e(String, String, Throwable)>
			//   16   35:pop             
					obj = ((Object) (new DownloadAction[0]));
			//   17   36:iconst_0        
			//   18   37:anewarray       DownloadAction[]
			//   19   40:astore_1        
				}
				handler.post(((_cls1) (obj)). new Runnable() {

					public void run()
					{
						if(released)
					//*   0    0:aload_0         
					//*   1    1:getfield        #19  <Field DownloadManager$2 this$1>
					//*   2    4:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
					//*   3    7:invokestatic    #34  <Method boolean DownloadManager.access$1100(DownloadManager)>
					//*   4   10:ifeq            14
							return;
					//    5   13:return          
						ArrayList arraylist = new ArrayList(((java.util.Collection) (tasks)));
					//    6   14:new             #36  <Class ArrayList>
					//    7   17:dup             
					//    8   18:aload_0         
					//    9   19:getfield        #19  <Field DownloadManager$2 this$1>
					//   10   22:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
					//   11   25:invokestatic    #40  <Method ArrayList DownloadManager.access$1200(DownloadManager)>
					//   12   28:invokespecial   #43  <Method void ArrayList(java.util.Collection)>
					//   13   31:astore          4
						tasks.clear();
					//   14   33:aload_0         
					//   15   34:getfield        #19  <Field DownloadManager$2 this$1>
					//   16   37:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
					//   17   40:invokestatic    #40  <Method ArrayList DownloadManager.access$1200(DownloadManager)>
					//   18   43:invokevirtual   #46  <Method void ArrayList.clear()>
						DownloadAction adownloadaction[] = actions;
					//   19   46:aload_0         
					//   20   47:getfield        #21  <Field DownloadAction[] val$actions>
					//   21   50:astore          5
						boolean flag = false;
					//   22   52:iconst_0        
					//   23   53:istore_2        
						int k = adownloadaction.length;
					//   24   54:aload           5
					//   25   56:arraylength     
					//   26   57:istore_3        
						for(int i = 0; i < k; i++)
					//*  27   58:iconst_0        
					//*  28   59:istore_1        
					//*  29   60:iload_1         
					//*  30   61:iload_3         
					//*  31   62:icmpge          91
						{
							DownloadAction downloadaction = adownloadaction[i];
					//   32   65:aload           5
					//   33   67:iload_1         
					//   34   68:aaload          
					//   35   69:astore          6
							addTaskForAction(downloadaction);
					//   36   71:aload_0         
					//   37   72:getfield        #19  <Field DownloadManager$2 this$1>
					//   38   75:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
					//   39   78:aload           6
					//   40   80:invokestatic    #50  <Method DownloadManager$Task DownloadManager.access$1300(DownloadManager, DownloadAction)>
					//   41   83:pop             
						}

					//   42   84:iload_1         
					//   43   85:iconst_1        
					//   44   86:iadd            
					//   45   87:istore_1        
					//*  46   88:goto            60
						DownloadManager.logd("Tasks are created.");
					//   47   91:ldc1            #52  <String "Tasks are created.">
					//   48   93:invokestatic    #56  <Method void DownloadManager.access$1000(String)>
						initialized = true;
					//   49   96:aload_0         
					//   50   97:getfield        #19  <Field DownloadManager$2 this$1>
					//   51  100:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
					//   52  103:iconst_1        
					//   53  104:invokestatic    #60  <Method boolean DownloadManager.access$1402(DownloadManager, boolean)>
					//   54  107:pop             
						for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onInitialized(_fld0));
					//   55  108:aload_0         
					//   56  109:getfield        #19  <Field DownloadManager$2 this$1>
					//   57  112:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
					//   58  115:invokestatic    #64  <Method CopyOnWriteArraySet DownloadManager.access$1500(DownloadManager)>
					//   59  118:invokevirtual   #70  <Method Iterator CopyOnWriteArraySet.iterator()>
					//   60  121:astore          5
					//   61  123:aload           5
					//   62  125:invokeinterface #76  <Method boolean Iterator.hasNext()>
					//   63  130:ifeq            158
					//   64  133:aload           5
					//   65  135:invokeinterface #80  <Method Object Iterator.next()>
					//   66  140:checkcast       #82  <Class DownloadManager$Listener>
					//   67  143:aload_0         
					//   68  144:getfield        #19  <Field DownloadManager$2 this$1>
					//   69  147:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
					//   70  150:invokeinterface #86  <Method void DownloadManager$Listener.onInitialized(DownloadManager)>
					//*  71  155:goto            123
						if(!((List) (arraylist)).isEmpty())
					//*  72  158:aload           4
					//*  73  160:invokeinterface #91  <Method boolean List.isEmpty()>
					//*  74  165:ifne            194
						{
							tasks.addAll(((java.util.Collection) (arraylist)));
					//   75  168:aload_0         
					//   76  169:getfield        #19  <Field DownloadManager$2 this$1>
					//   77  172:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
					//   78  175:invokestatic    #40  <Method ArrayList DownloadManager.access$1200(DownloadManager)>
					//   79  178:aload           4
					//   80  180:invokevirtual   #95  <Method boolean ArrayList.addAll(java.util.Collection)>
					//   81  183:pop             
							saveActions();
					//   82  184:aload_0         
					//   83  185:getfield        #19  <Field DownloadManager$2 this$1>
					//   84  188:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
					//   85  191:invokestatic    #98  <Method void DownloadManager.access$1600(DownloadManager)>
						}
						maybeStartTasks();
					//   86  194:aload_0         
					//   87  195:getfield        #19  <Field DownloadManager$2 this$1>
					//   88  198:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
					//   89  201:invokestatic    #101 <Method void DownloadManager.access$1700(DownloadManager)>
						for(int j = ((int) (flag)); j < tasks.size(); j++)
					//*  90  204:iload_2         
					//*  91  205:istore_1        
					//*  92  206:iload_1         
					//*  93  207:aload_0         
					//*  94  208:getfield        #19  <Field DownloadManager$2 this$1>
					//*  95  211:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
					//*  96  214:invokestatic    #40  <Method ArrayList DownloadManager.access$1200(DownloadManager)>
					//*  97  217:invokevirtual   #105 <Method int ArrayList.size()>
					//*  98  220:icmpge          269
						{
							Task task = (Task)tasks.get(j);
					//   99  223:aload_0         
					//  100  224:getfield        #19  <Field DownloadManager$2 this$1>
					//  101  227:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
					//  102  230:invokestatic    #40  <Method ArrayList DownloadManager.access$1200(DownloadManager)>
					//  103  233:iload_1         
					//  104  234:invokevirtual   #109 <Method Object ArrayList.get(int)>
					//  105  237:checkcast       #111 <Class DownloadManager$Task>
					//  106  240:astore          4
							if(task.currentState == 0)
					//* 107  242:aload           4
					//* 108  244:invokestatic    #115 <Method int DownloadManager$Task.access$100(DownloadManager$Task)>
					//* 109  247:ifne            262
								notifyListenersTaskStateChange(task);
					//  110  250:aload_0         
					//  111  251:getfield        #19  <Field DownloadManager$2 this$1>
					//  112  254:getfield        #28  <Field DownloadManager DownloadManager$2.this$0>
					//  113  257:aload           4
					//  114  259:invokestatic    #119 <Method void DownloadManager.access$1800(DownloadManager, DownloadManager$Task)>
						}

					//  115  262:iload_1         
					//  116  263:iconst_1        
					//  117  264:iadd            
					//  118  265:istore_1        
					//* 119  266:goto            206
					//  120  269:return          
					}

					final _cls2 this$1;
					final DownloadAction val$actions[];

			
			{
				this$1 = final__pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DownloadManager$2 this$1>
				actions = _5B_Lcom.google.android.exoplayer2.offline.DownloadAction_3B_.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field DownloadAction[] val$actions>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
				}
);
			//   20   41:aload_0         
			//   21   42:getfield        #19  <Field DownloadManager this$0>
			//   22   45:invokestatic    #61  <Method Handler DownloadManager.access$1900(DownloadManager)>
			//   23   48:new             #13  <Class DownloadManager$2$1>
			//   24   51:dup             
			//   25   52:aload_0         
			//   26   53:aload_1         
			//   27   54:invokespecial   #64  <Method void DownloadManager$2$1(DownloadManager$2, DownloadAction[])>
			//   28   57:invokevirtual   #70  <Method boolean Handler.post(Runnable)>
			//   29   60:pop             
			//   30   61:return          
			}

			final DownloadManager this$0;

			
			{
				this$0 = DownloadManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DownloadManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field Handler fileIOHandler>
	//    2    4:new             #8   <Class DownloadManager$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #225 <Method void DownloadManager$2(DownloadManager)>
	//    6   12:invokevirtual   #229 <Method boolean Handler.post(Runnable)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static void logd(String s)
	{
	//    0    0:return          
	}

	private static void logd(String s, Task task)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #231 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #232 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(s);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append(": ");
	//    8   14:aload_2         
	//    9   15:ldc1            #238 <String ": ">
	//   10   17:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(((Object) (task)));
	//   12   21:aload_2         
	//   13   22:aload_1         
	//   14   23:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   15   26:pop             
		logd(stringbuilder.toString());
	//   16   27:aload_2         
	//   17   28:invokevirtual   #245 <Method String StringBuilder.toString()>
	//   18   31:invokestatic    #150 <Method void logd(String)>
	//   19   34:return          
	}

	private void maybeNotifyListenersIdle()
	{
		if(!isIdle())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #250 <Method boolean isIdle()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		logd("Notify idle state");
	//    4    8:ldc1            #252 <String "Notify idle state">
	//    5   10:invokestatic    #150 <Method void logd(String)>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onIdle(this));
	//    6   13:aload_0         
	//    7   14:getfield        #142 <Field CopyOnWriteArraySet listeners>
	//    8   17:invokevirtual   #256 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    9   20:astore_1        
	//   10   21:aload_1         
	//   11   22:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//   12   27:ifeq            48
	//   13   30:aload_1         
	//   14   31:invokeinterface #265 <Method Object Iterator.next()>
	//   15   36:checkcast       #14  <Class DownloadManager$Listener>
	//   16   39:aload_0         
	//   17   40:invokeinterface #268 <Method void DownloadManager$Listener.onIdle(DownloadManager)>
	//*  18   45:goto            21
	//   19   48:return          
	}

	private void maybeStartTasks()
	{
		if(initialized)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field boolean initialized>
	//*   2    4:ifeq            307
		{
			if(released)
	//*   3    7:aload_0         
	//*   4    8:getfield        #167 <Field boolean released>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			boolean flag;
			if(!downloadsStopped && activeDownloadTasks.size() != maxActiveDownloadTasks)
	//*   7   15:aload_0         
	//*   8   16:getfield        #97  <Field boolean downloadsStopped>
	//*   9   19:ifne            44
	//*  10   22:aload_0         
	//*  11   23:getfield        #104 <Field ArrayList activeDownloadTasks>
	//*  12   26:invokevirtual   #272 <Method int ArrayList.size()>
	//*  13   29:aload_0         
	//*  14   30:getfield        #84  <Field int maxActiveDownloadTasks>
	//*  15   33:icmpne          39
	//*  16   36:goto            44
				flag = false;
	//   17   39:iconst_0        
	//   18   40:istore_1        
			else
	//*  19   41:goto            46
				flag = true;
	//   20   44:iconst_1        
	//   21   45:istore_1        
			for(int i = 0; i < tasks.size(); i++)
	//*  22   46:iconst_0        
	//*  23   47:istore          4
	//*  24   49:iload           4
	//*  25   51:aload_0         
	//*  26   52:getfield        #102 <Field ArrayList tasks>
	//*  27   55:invokevirtual   #272 <Method int ArrayList.size()>
	//*  28   58:icmpge          306
			{
				Task task = (Task)tasks.get(i);
	//   29   61:aload_0         
	//   30   62:getfield        #102 <Field ArrayList tasks>
	//   31   65:iload           4
	//   32   67:invokevirtual   #276 <Method Object ArrayList.get(int)>
	//   33   70:checkcast       #17  <Class DownloadManager$Task>
	//   34   73:astore          8
				if(!task.canStart())
	//*  35   75:aload           8
	//*  36   77:invokestatic    #280 <Method boolean DownloadManager$Task.access$500(DownloadManager$Task)>
	//*  37   80:ifne            86
					continue;
	//   38   83:goto            297
				DownloadAction downloadaction = task.action;
	//   39   86:aload           8
	//   40   88:invokestatic    #284 <Method DownloadAction DownloadManager$Task.access$300(DownloadManager$Task)>
	//   41   91:astore          9
				boolean flag4 = downloadaction.isRemoveAction;
	//   42   93:aload           9
	//   43   95:getfield        #289 <Field boolean DownloadAction.isRemoveAction>
	//   44   98:istore          7
				if(!flag4 && flag)
	//*  45  100:iload           7
	//*  46  102:ifne            112
	//*  47  105:iload_1         
	//*  48  106:ifeq            112
					continue;
	//   49  109:goto            297
				boolean flag1 = true;
	//   50  112:iconst_1        
	//   51  113:istore_2        
				int j = 0;
	//   52  114:iconst_0        
	//   53  115:istore          5
				boolean flag2;
				boolean flag3;
				do
				{
					flag2 = flag;
	//   54  117:iload_1         
	//   55  118:istore_3        
					flag3 = flag1;
	//   56  119:iload_2         
	//   57  120:istore          6
					if(j >= i)
						break;
	//   58  122:iload           5
	//   59  124:iload           4
	//   60  126:icmpge          247
					Task task1 = (Task)tasks.get(j);
	//   61  129:aload_0         
	//   62  130:getfield        #102 <Field ArrayList tasks>
	//   63  133:iload           5
	//   64  135:invokevirtual   #276 <Method Object ArrayList.get(int)>
	//   65  138:checkcast       #17  <Class DownloadManager$Task>
	//   66  141:astore          10
					flag2 = flag1;
	//   67  143:iload_2         
	//   68  144:istore_3        
					if(task1.action.isSameMedia(downloadaction))
	//*  69  145:aload           10
	//*  70  147:invokestatic    #284 <Method DownloadAction DownloadManager$Task.access$300(DownloadManager$Task)>
	//*  71  150:aload           9
	//*  72  152:invokevirtual   #293 <Method boolean DownloadAction.isSameMedia(DownloadAction)>
	//*  73  155:ifeq            236
						if(flag4)
	//*  74  158:iload           7
	//*  75  160:ifeq            215
						{
							StringBuilder stringbuilder = new StringBuilder();
	//   76  163:new             #231 <Class StringBuilder>
	//   77  166:dup             
	//   78  167:invokespecial   #232 <Method void StringBuilder()>
	//   79  170:astore          11
							stringbuilder.append(((Object) (task)));
	//   80  172:aload           11
	//   81  174:aload           8
	//   82  176:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   83  179:pop             
							stringbuilder.append(" clashes with ");
	//   84  180:aload           11
	//   85  182:ldc2            #295 <String " clashes with ">
	//   86  185:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   87  188:pop             
							stringbuilder.append(((Object) (task1)));
	//   88  189:aload           11
	//   89  191:aload           10
	//   90  193:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   91  196:pop             
							logd(stringbuilder.toString());
	//   92  197:aload           11
	//   93  199:invokevirtual   #245 <Method String StringBuilder.toString()>
	//   94  202:invokestatic    #150 <Method void logd(String)>
							task1.cancel();
	//   95  205:aload           10
	//   96  207:invokestatic    #298 <Method void DownloadManager$Task.access$600(DownloadManager$Task)>
							flag2 = false;
	//   97  210:iconst_0        
	//   98  211:istore_3        
						} else
	//*  99  212:goto            236
						{
							flag2 = flag1;
	//  100  215:iload_2         
	//  101  216:istore_3        
							if(task1.action.isRemoveAction)
	//* 102  217:aload           10
	//* 103  219:invokestatic    #284 <Method DownloadAction DownloadManager$Task.access$300(DownloadManager$Task)>
	//* 104  222:getfield        #289 <Field boolean DownloadAction.isRemoveAction>
	//* 105  225:ifeq            236
							{
								flag2 = true;
	//  106  228:iconst_1        
	//  107  229:istore_3        
								flag3 = false;
	//  108  230:iconst_0        
	//  109  231:istore          6
								break;
	//  110  233:goto            247
							}
						}
					j++;
	//  111  236:iload           5
	//  112  238:iconst_1        
	//  113  239:iadd            
	//  114  240:istore          5
					flag1 = flag2;
	//  115  242:iload_3         
	//  116  243:istore_2        
				} while(true);
	//  117  244:goto            117
				flag = flag2;
	//  118  247:iload_3         
	//  119  248:istore_1        
				if(!flag3)
					continue;
	//  120  249:iload           6
	//  121  251:ifeq            297
				task.start();
	//  122  254:aload           8
	//  123  256:invokestatic    #301 <Method void DownloadManager$Task.access$700(DownloadManager$Task)>
				flag = flag2;
	//  124  259:iload_3         
	//  125  260:istore_1        
				if(flag4)
					continue;
	//  126  261:iload           7
	//  127  263:ifne            297
				activeDownloadTasks.add(((Object) (task)));
	//  128  266:aload_0         
	//  129  267:getfield        #104 <Field ArrayList activeDownloadTasks>
	//  130  270:aload           8
	//  131  272:invokevirtual   #221 <Method boolean ArrayList.add(Object)>
	//  132  275:pop             
				if(activeDownloadTasks.size() == maxActiveDownloadTasks)
	//* 133  276:aload_0         
	//* 134  277:getfield        #104 <Field ArrayList activeDownloadTasks>
	//* 135  280:invokevirtual   #272 <Method int ArrayList.size()>
	//* 136  283:aload_0         
	//* 137  284:getfield        #84  <Field int maxActiveDownloadTasks>
	//* 138  287:icmpne          295
					flag = true;
	//  139  290:iconst_1        
	//  140  291:istore_1        
				else
	//* 141  292:goto            297
					flag = false;
	//  142  295:iconst_0        
	//  143  296:istore_1        
			}

	//  144  297:iload           4
	//  145  299:iconst_1        
	//  146  300:iadd            
	//  147  301:istore          4
	//* 148  303:goto            49
			return;
	//  149  306:return          
		} else
		{
			return;
	//  150  307:return          
		}
	}

	private void notifyListenersTaskStateChange(Task task)
	{
		logd("Task state is changed", task);
	//    0    0:ldc2            #303 <String "Task state is changed">
	//    1    3:aload_1         
	//    2    4:invokestatic    #202 <Method void logd(String, DownloadManager$Task)>
		task = ((Task) (task.getDownloadState()));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #307 <Method DownloadManager$TaskState DownloadManager$Task.getDownloadState()>
	//    5   11:astore_1        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onTaskStateChanged(this, ((TaskState) (task))));
	//    6   12:aload_0         
	//    7   13:getfield        #142 <Field CopyOnWriteArraySet listeners>
	//    8   16:invokevirtual   #256 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    9   19:astore_2        
	//   10   20:aload_2         
	//   11   21:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            48
	//   13   29:aload_2         
	//   14   30:invokeinterface #265 <Method Object Iterator.next()>
	//   15   35:checkcast       #14  <Class DownloadManager$Listener>
	//   16   38:aload_0         
	//   17   39:aload_1         
	//   18   40:invokeinterface #311 <Method void DownloadManager$Listener.onTaskStateChanged(DownloadManager, DownloadManager$TaskState)>
	//*  19   45:goto            20
	//   20   48:return          
	}

	private void onTaskStateChange(Task task)
	{
		if(released)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field boolean released>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		boolean flag = task.isActive() ^ true;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #314 <Method boolean DownloadManager$Task.isActive()>
	//    6   12:iconst_1        
	//    7   13:ixor            
	//    8   14:istore_2        
		if(flag)
	//*   9   15:iload_2         
	//*  10   16:ifeq            28
			activeDownloadTasks.remove(((Object) (task)));
	//   11   19:aload_0         
	//   12   20:getfield        #104 <Field ArrayList activeDownloadTasks>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #317 <Method boolean ArrayList.remove(Object)>
	//   15   27:pop             
		notifyListenersTaskStateChange(task);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokespecial   #196 <Method void notifyListenersTaskStateChange(DownloadManager$Task)>
		if(task.isFinished())
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #320 <Method boolean DownloadManager$Task.isFinished()>
	//*  21   37:ifeq            53
		{
			tasks.remove(((Object) (task)));
	//   22   40:aload_0         
	//   23   41:getfield        #102 <Field ArrayList tasks>
	//   24   44:aload_1         
	//   25   45:invokevirtual   #317 <Method boolean ArrayList.remove(Object)>
	//   26   48:pop             
			saveActions();
	//   27   49:aload_0         
	//   28   50:invokespecial   #186 <Method void saveActions()>
		}
		if(flag)
	//*  29   53:iload_2         
	//*  30   54:ifeq            65
		{
			maybeStartTasks();
	//   31   57:aload_0         
	//   32   58:invokespecial   #190 <Method void maybeStartTasks()>
			maybeNotifyListenersIdle();
	//   33   61:aload_0         
	//   34   62:invokespecial   #322 <Method void maybeNotifyListenersIdle()>
		}
	//   35   65:return          
	}

	private void saveActions()
	{
		if(released)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field boolean released>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		final DownloadAction actions[] = new DownloadAction[tasks.size()];
	//    4    8:aload_0         
	//    5    9:getfield        #102 <Field ArrayList tasks>
	//    6   12:invokevirtual   #272 <Method int ArrayList.size()>
	//    7   15:anewarray       DownloadAction[]
	//    8   18:astore_2        
		for(int i = 0; i < tasks.size(); i++)
	//*   9   19:iconst_0        
	//*  10   20:istore_1        
	//*  11   21:iload_1         
	//*  12   22:aload_0         
	//*  13   23:getfield        #102 <Field ArrayList tasks>
	//*  14   26:invokevirtual   #272 <Method int ArrayList.size()>
	//*  15   29:icmpge          56
			actions[i] = ((Task)tasks.get(i)).action;
	//   16   32:aload_2         
	//   17   33:iload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #102 <Field ArrayList tasks>
	//   20   38:iload_1         
	//   21   39:invokevirtual   #276 <Method Object ArrayList.get(int)>
	//   22   42:checkcast       #17  <Class DownloadManager$Task>
	//   23   45:invokestatic    #284 <Method DownloadAction DownloadManager$Task.access$300(DownloadManager$Task)>
	//   24   48:aastore         

	//   25   49:iload_1         
	//   26   50:iconst_1        
	//   27   51:iadd            
	//   28   52:istore_1        
	//*  29   53:goto            21
		fileIOHandler.post(new Runnable() {

			public void run()
			{
				try
				{
					actionFile.store(actions);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field DownloadManager this$0>
			//    2    4:invokestatic    #31  <Method ActionFile DownloadManager.access$900(DownloadManager)>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field DownloadAction[] val$actions>
			//    5   11:invokevirtual   #37  <Method void ActionFile.store(DownloadAction[])>
					DownloadManager.logd("Actions persisted.");
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

			
			{
				this$0 = DownloadManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DownloadManager this$0>
				actions = adownloadaction;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field DownloadAction[] val$actions>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   30   56:aload_0         
	//   31   57:getfield        #137 <Field Handler fileIOHandler>
	//   32   60:new             #12  <Class DownloadManager$3>
	//   33   63:dup             
	//   34   64:aload_0         
	//   35   65:aload_2         
	//   36   66:invokespecial   #325 <Method void DownloadManager$3(DownloadManager, DownloadAction[])>
	//   37   69:invokevirtual   #229 <Method boolean Handler.post(Runnable)>
	//   38   72:pop             
	//   39   73:return          
	}

	public void addListener(Listener listener)
	{
		listeners.add(((Object) (listener)));
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field CopyOnWriteArraySet listeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #328 <Method boolean CopyOnWriteArraySet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public TaskState[] getAllTaskStates()
	{
		Assertions.checkState(released ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field boolean released>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #334 <Method void Assertions.checkState(boolean)>
		TaskState ataskstate[] = new TaskState[tasks.size()];
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field ArrayList tasks>
	//    7   13:invokevirtual   #272 <Method int ArrayList.size()>
	//    8   16:anewarray       TaskState[]
	//    9   19:astore_2        
		for(int i = 0; i < ataskstate.length; i++)
	//*  10   20:iconst_0        
	//*  11   21:istore_1        
	//*  12   22:iload_1         
	//*  13   23:aload_2         
	//*  14   24:arraylength     
	//*  15   25:icmpge          52
			ataskstate[i] = ((Task)tasks.get(i)).getDownloadState();
	//   16   28:aload_2         
	//   17   29:iload_1         
	//   18   30:aload_0         
	//   19   31:getfield        #102 <Field ArrayList tasks>
	//   20   34:iload_1         
	//   21   35:invokevirtual   #276 <Method Object ArrayList.get(int)>
	//   22   38:checkcast       #17  <Class DownloadManager$Task>
	//   23   41:invokevirtual   #307 <Method DownloadManager$TaskState DownloadManager$Task.getDownloadState()>
	//   24   44:aastore         

	//   25   45:iload_1         
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:istore_1        
	//*  29   49:goto            22
		return ataskstate;
	//   30   52:aload_2         
	//   31   53:areturn         
	}

	public int getDownloadCount()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		int j;
		int k;
		for(j = 0; i < tasks.size(); j = k)
	//*   2    2:iconst_0        
	//*   3    3:istore_2        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:getfield        #102 <Field ArrayList tasks>
	//*   7    9:invokevirtual   #272 <Method int ArrayList.size()>
	//*   8   12:icmpge          50
		{
			k = j;
	//    9   15:iload_2         
	//   10   16:istore_3        
			if(!((Task)tasks.get(i)).action.isRemoveAction)
	//*  11   17:aload_0         
	//*  12   18:getfield        #102 <Field ArrayList tasks>
	//*  13   21:iload_1         
	//*  14   22:invokevirtual   #276 <Method Object ArrayList.get(int)>
	//*  15   25:checkcast       #17  <Class DownloadManager$Task>
	//*  16   28:invokestatic    #284 <Method DownloadAction DownloadManager$Task.access$300(DownloadManager$Task)>
	//*  17   31:getfield        #289 <Field boolean DownloadAction.isRemoveAction>
	//*  18   34:ifne            41
				k = j + 1;
	//   19   37:iload_2         
	//   20   38:iconst_1        
	//   21   39:iadd            
	//   22   40:istore_3        
			i++;
	//   23   41:iload_1         
	//   24   42:iconst_1        
	//   25   43:iadd            
	//   26   44:istore_1        
		}

	//   27   45:iload_3         
	//   28   46:istore_2        
	//*  29   47:goto            4
		return j;
	//   30   50:iload_2         
	//   31   51:ireturn         
	}

	public int getTaskCount()
	{
		Assertions.checkState(released ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field boolean released>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #334 <Method void Assertions.checkState(boolean)>
		return tasks.size();
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field ArrayList tasks>
	//    7   13:invokevirtual   #272 <Method int ArrayList.size()>
	//    8   16:ireturn         
	}

	public TaskState getTaskState(int i)
	{
		Assertions.checkState(released ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field boolean released>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #334 <Method void Assertions.checkState(boolean)>
		for(int j = 0; j < tasks.size(); j++)
	//*   5    9:iconst_0        
	//*   6   10:istore_2        
	//*   7   11:iload_2         
	//*   8   12:aload_0         
	//*   9   13:getfield        #102 <Field ArrayList tasks>
	//*  10   16:invokevirtual   #272 <Method int ArrayList.size()>
	//*  11   19:icmpge          54
		{
			Task task = (Task)tasks.get(j);
	//   12   22:aload_0         
	//   13   23:getfield        #102 <Field ArrayList tasks>
	//   14   26:iload_2         
	//   15   27:invokevirtual   #276 <Method Object ArrayList.get(int)>
	//   16   30:checkcast       #17  <Class DownloadManager$Task>
	//   17   33:astore_3        
			if(task.id == i)
	//*  18   34:aload_3         
	//*  19   35:invokestatic    #343 <Method int DownloadManager$Task.access$200(DownloadManager$Task)>
	//*  20   38:iload_1         
	//*  21   39:icmpne          47
				return task.getDownloadState();
	//   22   42:aload_3         
	//   23   43:invokevirtual   #307 <Method DownloadManager$TaskState DownloadManager$Task.getDownloadState()>
	//   24   46:areturn         
		}

	//   25   47:iload_2         
	//   26   48:iconst_1        
	//   27   49:iadd            
	//   28   50:istore_2        
	//*  29   51:goto            11
		return null;
	//   30   54:aconst_null     
	//   31   55:areturn         
	}

	public int handleAction(DownloadAction downloadaction)
	{
		Assertions.checkState(released ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field boolean released>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #334 <Method void Assertions.checkState(boolean)>
		downloadaction = ((DownloadAction) (addTaskForAction(downloadaction)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #175 <Method DownloadManager$Task addTaskForAction(DownloadAction)>
	//    8   14:astore_1        
		if(initialized)
	//*   9   15:aload_0         
	//*  10   16:getfield        #179 <Field boolean initialized>
	//*  11   19:ifeq            42
		{
			saveActions();
	//   12   22:aload_0         
	//   13   23:invokespecial   #186 <Method void saveActions()>
			maybeStartTasks();
	//   14   26:aload_0         
	//   15   27:invokespecial   #190 <Method void maybeStartTasks()>
			if(((Task) (downloadaction)).currentState == 0)
	//*  16   30:aload_1         
	//*  17   31:invokestatic    #349 <Method int DownloadManager$Task.access$100(DownloadManager$Task)>
	//*  18   34:ifne            42
				notifyListenersTaskStateChange(((Task) (downloadaction)));
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokespecial   #196 <Method void notifyListenersTaskStateChange(DownloadManager$Task)>
		}
		return ((Task) (downloadaction)).id;
	//   22   42:aload_1         
	//   23   43:invokestatic    #343 <Method int DownloadManager$Task.access$200(DownloadManager$Task)>
	//   24   46:ireturn         
	}

	public int handleAction(byte abyte0[])
		throws IOException
	{
		Assertions.checkState(released ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field boolean released>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #334 <Method void Assertions.checkState(boolean)>
		abyte0 = ((byte []) (new ByteArrayInputStream(abyte0)));
	//    5    9:new             #354 <Class ByteArrayInputStream>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #357 <Method void ByteArrayInputStream(byte[])>
	//    9   17:astore_1        
		return handleAction(DownloadAction.deserializeFromStream(deserializers, ((java.io.InputStream) (abyte0))));
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #95  <Field DownloadAction$Deserializer[] deserializers>
	//   13   23:aload_1         
	//   14   24:invokestatic    #361 <Method DownloadAction DownloadAction.deserializeFromStream(DownloadAction$Deserializer[], java.io.InputStream)>
	//   15   27:invokevirtual   #363 <Method int handleAction(DownloadAction)>
	//   16   30:ireturn         
	}

	public boolean isIdle()
	{
		Assertions.checkState(released ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field boolean released>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #334 <Method void Assertions.checkState(boolean)>
		if(!initialized)
	//*   5    9:aload_0         
	//*   6   10:getfield        #179 <Field boolean initialized>
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		for(int i = 0; i < tasks.size(); i++)
	//*  10   18:iconst_0        
	//*  11   19:istore_1        
	//*  12   20:iload_1         
	//*  13   21:aload_0         
	//*  14   22:getfield        #102 <Field ArrayList tasks>
	//*  15   25:invokevirtual   #272 <Method int ArrayList.size()>
	//*  16   28:icmpge          57
			if(((Task)tasks.get(i)).isActive())
	//*  17   31:aload_0         
	//*  18   32:getfield        #102 <Field ArrayList tasks>
	//*  19   35:iload_1         
	//*  20   36:invokevirtual   #276 <Method Object ArrayList.get(int)>
	//*  21   39:checkcast       #17  <Class DownloadManager$Task>
	//*  22   42:invokevirtual   #314 <Method boolean DownloadManager$Task.isActive()>
	//*  23   45:ifeq            50
				return false;
	//   24   48:iconst_0        
	//   25   49:ireturn         

	//   26   50:iload_1         
	//   27   51:iconst_1        
	//   28   52:iadd            
	//   29   53:istore_1        
	//*  30   54:goto            20
		return true;
	//   31   57:iconst_1        
	//   32   58:ireturn         
	}

	public boolean isInitialized()
	{
		Assertions.checkState(released ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field boolean released>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #334 <Method void Assertions.checkState(boolean)>
		return initialized;
	//    5    9:aload_0         
	//    6   10:getfield        #179 <Field boolean initialized>
	//    7   13:ireturn         
	}

	public void release()
	{
		if(released)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field boolean released>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		released = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #167 <Field boolean released>
		for(int i = 0; i < tasks.size(); i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_1        
	//*   9   15:iload_1         
	//*  10   16:aload_0         
	//*  11   17:getfield        #102 <Field ArrayList tasks>
	//*  12   20:invokevirtual   #272 <Method int ArrayList.size()>
	//*  13   23:icmpge          47
			((Task)tasks.get(i)).stop();
	//   14   26:aload_0         
	//   15   27:getfield        #102 <Field ArrayList tasks>
	//   16   30:iload_1         
	//   17   31:invokevirtual   #276 <Method Object ArrayList.get(int)>
	//   18   34:checkcast       #17  <Class DownloadManager$Task>
	//   19   37:invokestatic    #369 <Method void DownloadManager$Task.access$000(DownloadManager$Task)>

	//   20   40:iload_1         
	//   21   41:iconst_1        
	//   22   42:iadd            
	//   23   43:istore_1        
	//*  24   44:goto            15
		final ConditionVariable fileIOFinishedCondition = new ConditionVariable();
	//   25   47:new             #371 <Class ConditionVariable>
	//   26   50:dup             
	//   27   51:invokespecial   #372 <Method void ConditionVariable()>
	//   28   54:astore_2        
		fileIOHandler.post(new Runnable() {

			public void run()
			{
				fileIOFinishedCondition.open();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field ConditionVariable val$fileIOFinishedCondition>
			//    2    4:invokevirtual   #30  <Method void ConditionVariable.open()>
			//    3    7:return          
			}

			final DownloadManager this$0;
			final ConditionVariable val$fileIOFinishedCondition;

			
			{
				this$0 = DownloadManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DownloadManager this$0>
				fileIOFinishedCondition = conditionvariable;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ConditionVariable val$fileIOFinishedCondition>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   29   55:aload_0         
	//   30   56:getfield        #137 <Field Handler fileIOHandler>
	//   31   59:new             #6   <Class DownloadManager$1>
	//   32   62:dup             
	//   33   63:aload_0         
	//   34   64:aload_2         
	//   35   65:invokespecial   #375 <Method void DownloadManager$1(DownloadManager, ConditionVariable)>
	//   36   68:invokevirtual   #229 <Method boolean Handler.post(Runnable)>
	//   37   71:pop             
		fileIOFinishedCondition.block();
	//   38   72:aload_2         
	//   39   73:invokevirtual   #378 <Method void ConditionVariable.block()>
		fileIOThread.quit();
	//   40   76:aload_0         
	//   41   77:getfield        #129 <Field HandlerThread fileIOThread>
	//   42   80:invokevirtual   #381 <Method boolean HandlerThread.quit()>
	//   43   83:pop             
		logd("Released");
	//   44   84:ldc2            #383 <String "Released">
	//   45   87:invokestatic    #150 <Method void logd(String)>
	//   46   90:return          
	}

	public void removeListener(Listener listener)
	{
		listeners.remove(((Object) (listener)));
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field CopyOnWriteArraySet listeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #385 <Method boolean CopyOnWriteArraySet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void startDownloads()
	{
		Assertions.checkState(released ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field boolean released>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #334 <Method void Assertions.checkState(boolean)>
		if(downloadsStopped)
	//*   5    9:aload_0         
	//*   6   10:getfield        #97  <Field boolean downloadsStopped>
	//*   7   13:ifeq            31
		{
			downloadsStopped = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #97  <Field boolean downloadsStopped>
			maybeStartTasks();
	//   11   21:aload_0         
	//   12   22:invokespecial   #190 <Method void maybeStartTasks()>
			logd("Downloads are started");
	//   13   25:ldc2            #388 <String "Downloads are started">
	//   14   28:invokestatic    #150 <Method void logd(String)>
		}
	//   15   31:return          
	}

	public void stopDownloads()
	{
		Assertions.checkState(released ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field boolean released>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #334 <Method void Assertions.checkState(boolean)>
		if(!downloadsStopped)
	//*   5    9:aload_0         
	//*   6   10:getfield        #97  <Field boolean downloadsStopped>
	//*   7   13:ifne            61
		{
			downloadsStopped = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #97  <Field boolean downloadsStopped>
			for(int i = 0; i < activeDownloadTasks.size(); i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:aload_0         
	//*  15   25:getfield        #104 <Field ArrayList activeDownloadTasks>
	//*  16   28:invokevirtual   #272 <Method int ArrayList.size()>
	//*  17   31:icmpge          55
				((Task)activeDownloadTasks.get(i)).stop();
	//   18   34:aload_0         
	//   19   35:getfield        #104 <Field ArrayList activeDownloadTasks>
	//   20   38:iload_1         
	//   21   39:invokevirtual   #276 <Method Object ArrayList.get(int)>
	//   22   42:checkcast       #17  <Class DownloadManager$Task>
	//   23   45:invokestatic    #369 <Method void DownloadManager$Task.access$000(DownloadManager$Task)>

	//   24   48:iload_1         
	//   25   49:iconst_1        
	//   26   50:iadd            
	//   27   51:istore_1        
	//*  28   52:goto            23
			logd("Downloads are stopping");
	//   29   55:ldc2            #391 <String "Downloads are stopping">
	//   30   58:invokestatic    #150 <Method void logd(String)>
		}
	//   31   61:return          
	}

	private static final boolean DEBUG = false;
	public static final int DEFAULT_MAX_SIMULTANEOUS_DOWNLOADS = 1;
	public static final int DEFAULT_MIN_RETRY_COUNT = 5;
	private static final String TAG = "DownloadManager";
	private final ActionFile actionFile;
	private final ArrayList activeDownloadTasks;
	private final DownloadAction.Deserializer deserializers[];
	private final DownloaderConstructorHelper downloaderConstructorHelper;
	private boolean downloadsStopped;
	private final Handler fileIOHandler;
	private final HandlerThread fileIOThread;
	private final Handler handler;
	private boolean initialized;
	private final CopyOnWriteArraySet listeners;
	private final int maxActiveDownloadTasks;
	private final int minRetryCount;
	private int nextTaskId;
	private boolean released;
	private final ArrayList tasks;


/*
	static void access$1000(String s)
	{
		logd(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #150 <Method void logd(String)>
		return;
	//    2    4:return          
	}

*/


/*
	static boolean access$1100(DownloadManager downloadmanager)
	{
		return downloadmanager.released;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field boolean released>
	//    2    4:ireturn         
	}

*/


/*
	static ArrayList access$1200(DownloadManager downloadmanager)
	{
		return downloadmanager.tasks;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field ArrayList tasks>
	//    2    4:areturn         
	}

*/


/*
	static Task access$1300(DownloadManager downloadmanager, DownloadAction downloadaction)
	{
		return downloadmanager.addTaskForAction(downloadaction);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #175 <Method DownloadManager$Task addTaskForAction(DownloadAction)>
	//    3    5:areturn         
	}

*/


/*
	static boolean access$1402(DownloadManager downloadmanager, boolean flag)
	{
		downloadmanager.initialized = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #179 <Field boolean initialized>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static CopyOnWriteArraySet access$1500(DownloadManager downloadmanager)
	{
		return downloadmanager.listeners;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field CopyOnWriteArraySet listeners>
	//    2    4:areturn         
	}

*/


/*
	static void access$1600(DownloadManager downloadmanager)
	{
		downloadmanager.saveActions();
	//    0    0:aload_0         
	//    1    1:invokespecial   #186 <Method void saveActions()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$1700(DownloadManager downloadmanager)
	{
		downloadmanager.maybeStartTasks();
	//    0    0:aload_0         
	//    1    1:invokespecial   #190 <Method void maybeStartTasks()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$1800(DownloadManager downloadmanager, Task task)
	{
		downloadmanager.notifyListenersTaskStateChange(task);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #196 <Method void notifyListenersTaskStateChange(DownloadManager$Task)>
		return;
	//    3    5:return          
	}

*/


/*
	static Handler access$1900(DownloadManager downloadmanager)
	{
		return downloadmanager.handler;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field Handler handler>
	//    2    4:areturn         
	}

*/


/*
	static void access$2200(String s, Task task)
	{
		logd(s, task);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #202 <Method void logd(String, DownloadManager$Task)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$2300(DownloadManager downloadmanager, Task task)
	{
		downloadmanager.onTaskStateChange(task);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #206 <Method void onTaskStateChange(DownloadManager$Task)>
		return;
	//    3    5:return          
	}

*/


/*
	static DownloaderConstructorHelper access$2400(DownloadManager downloadmanager)
	{
		return downloadmanager.downloaderConstructorHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field DownloaderConstructorHelper downloaderConstructorHelper>
	//    2    4:areturn         
	}

*/


/*
	static DownloadAction.Deserializer[] access$800(DownloadManager downloadmanager)
	{
		return downloadmanager.deserializers;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field DownloadAction$Deserializer[] deserializers>
	//    2    4:areturn         
	}

*/


/*
	static ActionFile access$900(DownloadManager downloadmanager)
	{
		return downloadmanager.actionFile;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ActionFile actionFile>
	//    2    4:areturn         
	}

*/
}
