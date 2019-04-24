// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.os.*;
import android.util.Log;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.TraceUtil;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			Loader

private final class Loader$LoadTask extends Handler
	implements Runnable
{

	private void execute()
	{
		currentError = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #69  <Field IOException currentError>
		Loader.access$200(Loader.this).execute(((Runnable) (Loader.access$000(Loader.this))));
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field Loader this$0>
	//    5    9:invokestatic    #73  <Method ExecutorService Loader.access$200(Loader)>
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field Loader this$0>
	//    8   16:invokestatic    #77  <Method Loader$LoadTask Loader.access$000(Loader)>
	//    9   19:invokeinterface #82  <Method void ExecutorService.execute(Runnable)>
	//   10   24:return          
	}

	private void finish()
	{
		Loader.access$002(Loader.this, ((Loader$LoadTask) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Loader this$0>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #87  <Method Loader$LoadTask Loader.access$002(Loader, Loader$LoadTask)>
	//    4    8:pop             
	//    5    9:return          
	}

	private long getRetryDelayMillis()
	{
		return (long)Math.min((errorCount - 1) * 1000, 5000);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int errorCount>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:sipush          1000
	//    5    9:imul            
	//    6   10:sipush          5000
	//    7   13:invokestatic    #97  <Method int Math.min(int, int)>
	//    8   16:i2l             
	//    9   17:lreturn         
	}

	public void cancel(boolean flag)
	{
		released = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #101 <Field boolean released>
		currentError = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #69  <Field IOException currentError>
		if(hasMessages(0))
	//*   6   10:aload_0         
	//*   7   11:iconst_0        
	//*   8   12:invokevirtual   #105 <Method boolean hasMessages(int)>
	//*   9   15:ifeq            36
		{
			removeMessages(0);
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #109 <Method void removeMessages(int)>
			if(!flag)
	//*  13   23:iload_1         
	//*  14   24:ifne            64
				sendEmptyMessage(1);
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:invokevirtual   #112 <Method boolean sendEmptyMessage(int)>
	//   18   32:pop             
		} else
	//*  19   33:goto            64
		{
			canceled = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #114 <Field boolean canceled>
			loadable.cancelLoad();
	//   23   41:aload_0         
	//   24   42:getfield        #56  <Field Loader$Loadable loadable>
	//   25   45:invokeinterface #119 <Method void Loader$Loadable.cancelLoad()>
			if(executorThread != null)
	//*  26   50:aload_0         
	//*  27   51:getfield        #121 <Field Thread executorThread>
	//*  28   54:ifnull          64
				executorThread.interrupt();
	//   29   57:aload_0         
	//   30   58:getfield        #121 <Field Thread executorThread>
	//   31   61:invokevirtual   #126 <Method void Thread.interrupt()>
		}
		if(flag)
	//*  32   64:iload_1         
	//*  33   65:ifeq            102
		{
			finish();
	//   34   68:aload_0         
	//   35   69:invokespecial   #128 <Method void finish()>
			long l = SystemClock.elapsedRealtime();
	//   36   72:invokestatic    #133 <Method long SystemClock.elapsedRealtime()>
	//   37   75:lstore_2        
			callback.onLoadCanceled(loadable, l, l - startTimeMs, true);
	//   38   76:aload_0         
	//   39   77:getfield        #58  <Field Loader$Callback callback>
	//   40   80:aload_0         
	//   41   81:getfield        #56  <Field Loader$Loadable loadable>
	//   42   84:lload_2         
	//   43   85:lload_2         
	//   44   86:aload_0         
	//   45   87:getfield        #62  <Field long startTimeMs>
	//   46   90:lsub            
	//   47   91:iconst_1        
	//   48   92:invokeinterface #139 <Method void Loader$Callback.onLoadCanceled(Loader$Loadable, long, long, boolean)>
			callback = null;
	//   49   97:aload_0         
	//   50   98:aconst_null     
	//   51   99:putfield        #58  <Field Loader$Callback callback>
		}
	//   52  102:return          
	}

	public void handleMessage(Message message)
	{
		if(released)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field boolean released>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(message.what == 0)
	//*   4    8:aload_1         
	//*   5    9:getfield        #148 <Field int Message.what>
	//*   6   12:ifne            20
		{
			execute();
	//    7   15:aload_0         
	//    8   16:invokespecial   #150 <Method void execute()>
			return;
	//    9   19:return          
		}
		if(message.what == 4)
	//*  10   20:aload_1         
	//*  11   21:getfield        #148 <Field int Message.what>
	//*  12   24:iconst_4        
	//*  13   25:icmpne          36
			throw (Error)message.obj;
	//   14   28:aload_1         
	//   15   29:getfield        #154 <Field Object Message.obj>
	//   16   32:checkcast       #156 <Class Error>
	//   17   35:athrow          
		finish();
	//   18   36:aload_0         
	//   19   37:invokespecial   #128 <Method void finish()>
		long l = SystemClock.elapsedRealtime();
	//   20   40:invokestatic    #133 <Method long SystemClock.elapsedRealtime()>
	//   21   43:lstore          4
		long l1 = l - startTimeMs;
	//   22   45:lload           4
	//   23   47:aload_0         
	//   24   48:getfield        #62  <Field long startTimeMs>
	//   25   51:lsub            
	//   26   52:lstore          6
		if(canceled)
	//*  27   54:aload_0         
	//*  28   55:getfield        #114 <Field boolean canceled>
	//*  29   58:ifeq            80
		{
			callback.onLoadCanceled(loadable, l, l1, false);
	//   30   61:aload_0         
	//   31   62:getfield        #58  <Field Loader$Callback callback>
	//   32   65:aload_0         
	//   33   66:getfield        #56  <Field Loader$Loadable loadable>
	//   34   69:lload           4
	//   35   71:lload           6
	//   36   73:iconst_0        
	//   37   74:invokeinterface #139 <Method void Loader$Callback.onLoadCanceled(Loader$Loadable, long, long, boolean)>
			return;
	//   38   79:return          
		}
		switch(message.what)
	//*  39   80:aload_1         
	//*  40   81:getfield        #148 <Field int Message.what>
		{
	//*  41   84:tableswitch     1 3: default 112
	//	               1 245
	//	               2 200
	//	               3 113
		default:
			return;
	//   42  112:return          

		case 3: // '\003'
			currentError = (IOException)message.obj;
	//   43  113:aload_0         
	//   44  114:aload_1         
	//   45  115:getfield        #154 <Field Object Message.obj>
	//   46  118:checkcast       #158 <Class IOException>
	//   47  121:putfield        #69  <Field IOException currentError>
			int j = callback.onLoadError(loadable, l, l1, currentError);
	//   48  124:aload_0         
	//   49  125:getfield        #58  <Field Loader$Callback callback>
	//   50  128:aload_0         
	//   51  129:getfield        #56  <Field Loader$Loadable loadable>
	//   52  132:lload           4
	//   53  134:lload           6
	//   54  136:aload_0         
	//   55  137:getfield        #69  <Field IOException currentError>
	//   56  140:invokeinterface #162 <Method int Loader$Callback.onLoadError(Loader$Loadable, long, long, IOException)>
	//   57  145:istore_3        
			if(j == 3)
	//*  58  146:iload_3         
	//*  59  147:iconst_3        
	//*  60  148:icmpne          164
			{
				Loader.access$102(Loader.this, currentError);
	//   61  151:aload_0         
	//   62  152:getfield        #51  <Field Loader this$0>
	//   63  155:aload_0         
	//   64  156:getfield        #69  <Field IOException currentError>
	//   65  159:invokestatic    #166 <Method IOException Loader.access$102(Loader, IOException)>
	//   66  162:pop             
				return;
	//   67  163:return          
			}
			if(j != 2)
	//*  68  164:iload_3         
	//*  69  165:iconst_2        
	//*  70  166:icmpeq          263
			{
				int i = 1;
	//   71  169:iconst_1        
	//   72  170:istore_2        
				if(j != 1)
	//*  73  171:iload_3         
	//*  74  172:iconst_1        
	//*  75  173:icmpne          179
	//*  76  176:goto            186
					i = 1 + errorCount;
	//   77  179:iconst_1        
	//   78  180:aload_0         
	//   79  181:getfield        #91  <Field int errorCount>
	//   80  184:iadd            
	//   81  185:istore_2        
				errorCount = i;
	//   82  186:aload_0         
	//   83  187:iload_2         
	//   84  188:putfield        #91  <Field int errorCount>
				start(getRetryDelayMillis());
	//   85  191:aload_0         
	//   86  192:aload_0         
	//   87  193:invokespecial   #168 <Method long getRetryDelayMillis()>
	//   88  196:invokevirtual   #172 <Method void start(long)>
				return;
	//   89  199:return          
			}
			break;

		case 2: // '\002'
			try
			{
				callback.onLoadCompleted(loadable, l, l1);
	//   90  200:aload_0         
	//   91  201:getfield        #58  <Field Loader$Callback callback>
	//   92  204:aload_0         
	//   93  205:getfield        #56  <Field Loader$Loadable loadable>
	//   94  208:lload           4
	//   95  210:lload           6
	//   96  212:invokeinterface #176 <Method void Loader$Callback.onLoadCompleted(Loader$Loadable, long, long)>
				return;
	//   97  217:return          
			}
			// Misplaced declaration of an exception variable
			catch(Message message)
	//*  98  218:astore_1        
			{
				Log.e("LoadTask", "Unexpected exception handling load completed", ((Throwable) (message)));
	//   99  219:ldc1            #27  <String "LoadTask">
	//  100  221:ldc1            #178 <String "Unexpected exception handling load completed">
	//  101  223:aload_1         
	//  102  224:invokestatic    #184 <Method int Log.e(String, String, Throwable)>
	//  103  227:pop             
			}
			Loader.access$102(Loader.this, ((IOException) (new dLoaderException(((Throwable) (message))))));
	//  104  228:aload_0         
	//  105  229:getfield        #51  <Field Loader this$0>
	//  106  232:new             #186 <Class Loader$UnexpectedLoaderException>
	//  107  235:dup             
	//  108  236:aload_1         
	//  109  237:invokespecial   #189 <Method void Loader$UnexpectedLoaderException(Throwable)>
	//  110  240:invokestatic    #166 <Method IOException Loader.access$102(Loader, IOException)>
	//  111  243:pop             
			return;
	//  112  244:return          

		case 1: // '\001'
			callback.onLoadCanceled(loadable, l, l1, false);
	//  113  245:aload_0         
	//  114  246:getfield        #58  <Field Loader$Callback callback>
	//  115  249:aload_0         
	//  116  250:getfield        #56  <Field Loader$Loadable loadable>
	//  117  253:lload           4
	//  118  255:lload           6
	//  119  257:iconst_0        
	//  120  258:invokeinterface #139 <Method void Loader$Callback.onLoadCanceled(Loader$Loadable, long, long, boolean)>
			break;
		}
	//  121  263:return          
	}

	public void maybeThrowError(int i)
		throws IOException
	{
		if(currentError != null && errorCount > i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field IOException currentError>
	//*   2    4:ifnull          20
	//*   3    7:aload_0         
	//*   4    8:getfield        #91  <Field int errorCount>
	//*   5   11:iload_1         
	//*   6   12:icmple          20
			throw currentError;
	//    7   15:aload_0         
	//    8   16:getfield        #69  <Field IOException currentError>
	//    9   19:athrow          
		else
			return;
	//   10   20:return          
	}

	public void run()
	{
		executorThread = Thread.currentThread();
	//    0    0:aload_0         
	//    1    1:invokestatic    #202 <Method Thread Thread.currentThread()>
	//    2    4:putfield        #121 <Field Thread executorThread>
		if(canceled)
			break MISSING_BLOCK_LABEL_72;
	//    3    7:aload_0         
	//    4    8:getfield        #114 <Field boolean canceled>
	//    5   11:ifne            72
		StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #204 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #206 <Method void StringBuilder()>
	//    9   21:astore_1        
		stringbuilder.append("load:");
	//   10   22:aload_1         
	//   11   23:ldc1            #208 <String "load:">
	//   12   25:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
		stringbuilder.append(((Object) (loadable)).getClass().getSimpleName());
	//   14   29:aload_1         
	//   15   30:aload_0         
	//   16   31:getfield        #56  <Field Loader$Loadable loadable>
	//   17   34:invokevirtual   #218 <Method Class Object.getClass()>
	//   18   37:invokevirtual   #224 <Method String Class.getSimpleName()>
	//   19   40:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   20   43:pop             
		TraceUtil.beginSection(stringbuilder.toString());
	//   21   44:aload_1         
	//   22   45:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   23   48:invokestatic    #233 <Method void TraceUtil.beginSection(String)>
		loadable.load();
	//   24   51:aload_0         
	//   25   52:getfield        #56  <Field Loader$Loadable loadable>
	//   26   55:invokeinterface #236 <Method void Loader$Loadable.load()>
		Exception exception;
		try
		{
			TraceUtil.endSection();
	//   27   60:invokestatic    #239 <Method void TraceUtil.endSection()>
			break MISSING_BLOCK_LABEL_72;
	//   28   63:goto            72
		}
	//*  29   66:astore_1        
	//*  30   67:invokestatic    #239 <Method void TraceUtil.endSection()>
	//*  31   70:aload_1         
	//*  32   71:athrow          
	//*  33   72:aload_0         
	//*  34   73:getfield        #101 <Field boolean released>
	//*  35   76:ifne            220
	//*  36   79:aload_0         
	//*  37   80:iconst_2        
	//*  38   81:invokevirtual   #112 <Method boolean sendEmptyMessage(int)>
	//*  39   84:pop             
	//*  40   85:return          
	//*  41   86:astore_1        
	//*  42   87:ldc1            #27  <String "LoadTask">
	//*  43   89:ldc1            #241 <String "Unexpected error loading stream">
	//*  44   91:aload_1         
	//*  45   92:invokestatic    #184 <Method int Log.e(String, String, Throwable)>
	//*  46   95:pop             
	//*  47   96:aload_0         
	//*  48   97:getfield        #101 <Field boolean released>
	//*  49  100:ifne            112
	//*  50  103:aload_0         
	//*  51  104:iconst_4        
	//*  52  105:aload_1         
	//*  53  106:invokevirtual   #245 <Method Message obtainMessage(int, Object)>
	//*  54  109:invokevirtual   #248 <Method void Message.sendToTarget()>
	//*  55  112:aload_1         
	//*  56  113:athrow          
	//*  57  114:astore_1        
	//*  58  115:ldc1            #27  <String "LoadTask">
	//*  59  117:ldc1            #250 <String "OutOfMemory error loading stream">
	//*  60  119:aload_1         
	//*  61  120:invokestatic    #184 <Method int Log.e(String, String, Throwable)>
	//*  62  123:pop             
	//*  63  124:aload_0         
	//*  64  125:getfield        #101 <Field boolean released>
	//*  65  128:ifne            220
	//*  66  131:aload_0         
	//*  67  132:iconst_3        
	//*  68  133:new             #186 <Class Loader$UnexpectedLoaderException>
	//*  69  136:dup             
	//*  70  137:aload_1         
	//*  71  138:invokespecial   #189 <Method void Loader$UnexpectedLoaderException(Throwable)>
	//*  72  141:invokevirtual   #245 <Method Message obtainMessage(int, Object)>
	//*  73  144:invokevirtual   #248 <Method void Message.sendToTarget()>
	//*  74  147:return          
	//*  75  148:astore_1        
	//*  76  149:ldc1            #27  <String "LoadTask">
	//*  77  151:ldc1            #252 <String "Unexpected exception loading stream">
	//*  78  153:aload_1         
	//*  79  154:invokestatic    #184 <Method int Log.e(String, String, Throwable)>
	//*  80  157:pop             
	//*  81  158:aload_0         
	//*  82  159:getfield        #101 <Field boolean released>
	//*  83  162:ifne            220
	//*  84  165:aload_0         
	//*  85  166:iconst_3        
	//*  86  167:new             #186 <Class Loader$UnexpectedLoaderException>
	//*  87  170:dup             
	//*  88  171:aload_1         
	//*  89  172:invokespecial   #189 <Method void Loader$UnexpectedLoaderException(Throwable)>
	//*  90  175:invokevirtual   #245 <Method Message obtainMessage(int, Object)>
	//*  91  178:invokevirtual   #248 <Method void Message.sendToTarget()>
	//*  92  181:return          
	//*  93  182:aload_0         
	//*  94  183:getfield        #114 <Field boolean canceled>
	//*  95  186:invokestatic    #257 <Method void Assertions.checkState(boolean)>
	//*  96  189:aload_0         
	//*  97  190:getfield        #101 <Field boolean released>
	//*  98  193:ifne            220
	//*  99  196:aload_0         
	//* 100  197:iconst_2        
	//* 101  198:invokevirtual   #112 <Method boolean sendEmptyMessage(int)>
	//* 102  201:pop             
	//* 103  202:return          
		catch(IOException ioexception)
	//* 104  203:astore_1        
		{
			if(!released)
	//* 105  204:aload_0         
	//* 106  205:getfield        #101 <Field boolean released>
	//* 107  208:ifne            220
				obtainMessage(3, ((Object) (ioexception))).sendToTarget();
	//  108  211:aload_0         
	//  109  212:iconst_3        
	//  110  213:aload_1         
	//  111  214:invokevirtual   #245 <Method Message obtainMessage(int, Object)>
	//  112  217:invokevirtual   #248 <Method void Message.sendToTarget()>
		}
	//* 113  220:return          
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			Assertions.checkState(canceled);
			if(!released)
			{
				sendEmptyMessage(2);
				return;
			}
		}
		catch(Exception exception1)
		{
			Log.e("LoadTask", "Unexpected exception loading stream", ((Throwable) (exception1)));
			if(!released)
			{
				obtainMessage(3, ((Object) (new dLoaderException(((Throwable) (exception1)))))).sendToTarget();
				return;
			}
		}
		catch(OutOfMemoryError outofmemoryerror)
		{
			Log.e("LoadTask", "OutOfMemory error loading stream", ((Throwable) (outofmemoryerror)));
			if(!released)
			{
				obtainMessage(3, ((Object) (new dLoaderException(((Throwable) (outofmemoryerror)))))).sendToTarget();
				return;
			}
		}
		catch(Error error)
		{
			Log.e("LoadTask", "Unexpected error loading stream", ((Throwable) (error)));
			if(!released)
				obtainMessage(4, ((Object) (error))).sendToTarget();
			throw error;
		}
		break MISSING_BLOCK_LABEL_220;
		exception;
		TraceUtil.endSection();
		throw exception;
		if(!released)
		{
			sendEmptyMessage(2);
			return;
		}
		InterruptedException interruptedexception;
	//* 114  221:astore_1        
	//* 115  222:goto            182
	}

	public void start(long l)
	{
		boolean flag;
		if(Loader.access$000(Loader.this) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field Loader this$0>
	//*   2    4:invokestatic    #77  <Method Loader$LoadTask Loader.access$000(Loader)>
	//*   3    7:ifnonnull       15
			flag = true;
	//    4   10:iconst_1        
	//    5   11:istore_3        
		else
	//*   6   12:goto            17
			flag = false;
	//    7   15:iconst_0        
	//    8   16:istore_3        
		Assertions.checkState(flag);
	//    9   17:iload_3         
	//   10   18:invokestatic    #257 <Method void Assertions.checkState(boolean)>
		Loader.access$002(Loader.this, this);
	//   11   21:aload_0         
	//   12   22:getfield        #51  <Field Loader this$0>
	//   13   25:aload_0         
	//   14   26:invokestatic    #87  <Method Loader$LoadTask Loader.access$002(Loader, Loader$LoadTask)>
	//   15   29:pop             
		if(l > 0L)
	//*  16   30:lload_1         
	//*  17   31:lconst_0        
	//*  18   32:lcmp            
	//*  19   33:ifle            44
		{
			sendEmptyMessageDelayed(0, l);
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:lload_1         
	//   23   39:invokevirtual   #261 <Method boolean sendEmptyMessageDelayed(int, long)>
	//   24   42:pop             
			return;
	//   25   43:return          
		} else
		{
			execute();
	//   26   44:aload_0         
	//   27   45:invokespecial   #150 <Method void execute()>
			return;
	//   28   48:return          
		}
	}

	private static final int MSG_CANCEL = 1;
	private static final int MSG_END_OF_SOURCE = 2;
	private static final int MSG_FATAL_ERROR = 4;
	private static final int MSG_IO_EXCEPTION = 3;
	private static final int MSG_START = 0;
	private static final String TAG = "LoadTask";
	private Loader$Callback callback;
	private volatile boolean canceled;
	private IOException currentError;
	public final int defaultMinRetryCount;
	private int errorCount;
	private volatile Thread executorThread;
	private final Loader$Loadable loadable;
	private volatile boolean released;
	private final long startTimeMs;
	final Loader this$0;

	public Loader$LoadTask(Looper looper, Loader$Loadable loader$loadable, Loader$Callback loader$callback, int i, long l)
	{
		this$0 = Loader.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field Loader this$0>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #54  <Method void Handler(Looper)>
		loadable = loader$loadable;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #56  <Field Loader$Loadable loadable>
		callback = loader$callback;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #58  <Field Loader$Callback callback>
		defaultMinRetryCount = i;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #60  <Field int defaultMinRetryCount>
		startTimeMs = l;
	//   15   27:aload_0         
	//   16   28:lload           6
	//   17   30:putfield        #62  <Field long startTimeMs>
	//   18   33:return          
	}
}
