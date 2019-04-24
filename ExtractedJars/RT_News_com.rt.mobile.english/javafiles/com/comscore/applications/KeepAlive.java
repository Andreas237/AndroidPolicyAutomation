// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.applications;

import android.util.Log;
import com.comscore.analytics.Core;
import com.comscore.utils.OfflineMeasurementsCache;
import com.comscore.utils.Storage;
import com.comscore.utils.task.TaskExecutor;
import java.util.HashMap;

// Referenced classes of package com.comscore.applications:
//			EventType

public class KeepAlive
	implements Runnable
{

	public KeepAlive(Core core, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		b = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #21  <Long -1L>
	//    4    8:putfield        #24  <Field long b>
		e = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #26  <Field boolean e>
		f = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #28  <Field boolean f>
		a = l;
	//   11   21:aload_0         
	//   12   22:lload_2         
	//   13   23:putfield        #30  <Field long a>
		c = a;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #30  <Field long a>
	//   17   31:putfield        #32  <Field long c>
		d = core;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:putfield        #34  <Field Core d>
	//   21   39:return          
	}

	private long a(Storage storage)
	{
		storage = ((Storage) (storage.get("lastMeasurementProcessedTimestamp")));
	//    0    0:aload_1         
	//    1    1:ldc1            #40  <String "lastMeasurementProcessedTimestamp">
	//    2    3:invokevirtual   #46  <Method String Storage.get(String)>
	//    3    6:astore_1        
		if(storage == null || ((String) (storage)).length() <= 0)
			break MISSING_BLOCK_LABEL_25;
	//    4    7:aload_1         
	//    5    8:ifnull          25
	//    6   11:aload_1         
	//    7   12:invokevirtual   #52  <Method int String.length()>
	//    8   15:ifle            25
		long l = Long.parseLong(((String) (storage)));
	//    9   18:aload_1         
	//   10   19:invokestatic    #58  <Method long Long.parseLong(String)>
	//   11   22:lstore_2        
		return l;
	//   12   23:lload_2         
	//   13   24:lreturn         
_L2:
		return 0L;
	//   14   25:lconst_0        
	//   15   26:lreturn         
		storage;
	//   16   27:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  17   28:goto            25
	}

	protected void a()
	{
		if(!d.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Core d>
	//*   2    4:invokevirtual   #64  <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			d.getTaskExecutor().execute(((Runnable) (this)), b - System.currentTimeMillis(), true, a);
	//    5   11:aload_0         
	//    6   12:getfield        #34  <Field Core d>
	//    7   15:invokevirtual   #68  <Method TaskExecutor Core.getTaskExecutor()>
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #24  <Field long b>
	//   11   23:invokestatic    #74  <Method long System.currentTimeMillis()>
	//   12   26:lsub            
	//   13   27:iconst_1        
	//   14   28:aload_0         
	//   15   29:getfield        #30  <Field long a>
	//   16   32:invokevirtual   #80  <Method boolean TaskExecutor.execute(Runnable, long, boolean, long)>
	//   17   35:pop             
			f = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #28  <Field boolean f>
			return;
	//   21   41:return          
		}
	}

	public void cancel()
	{
		Log.d("KeepAlive", "cancel()");
	//    0    0:ldc1            #83  <String "KeepAlive">
	//    1    2:ldc1            #85  <String "cancel()">
	//    2    4:invokestatic    #90  <Method int Log.d(String, String)>
	//    3    7:pop             
		d.getTaskExecutor().removeEnqueuedTask(((Runnable) (this)));
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field Core d>
	//    6   12:invokevirtual   #68  <Method TaskExecutor Core.getTaskExecutor()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #94  <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
		f = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #28  <Field boolean f>
	//   12   24:return          
	}

	public void processKeepAlive(boolean flag)
	{
		if(!d.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Core d>
	//*   2    4:invokevirtual   #64  <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(d.isKeepAliveEnabled())
	//*   5   11:aload_0         
	//*   6   12:getfield        #34  <Field Core d>
	//*   7   15:invokevirtual   #99  <Method boolean Core.isKeepAliveEnabled()>
	//*   8   18:ifeq            203
		{
			OfflineMeasurementsCache offlinemeasurementscache = d.getOfflineCache();
	//    9   21:aload_0         
	//   10   22:getfield        #34  <Field Core d>
	//   11   25:invokevirtual   #103 <Method OfflineMeasurementsCache Core.getOfflineCache()>
	//   12   28:astore          6
			long l = a(d.getStorage());
	//   13   30:aload_0         
	//   14   31:aload_0         
	//   15   32:getfield        #34  <Field Core d>
	//   16   35:invokevirtual   #107 <Method Storage Core.getStorage()>
	//   17   38:invokespecial   #109 <Method long a(Storage)>
	//   18   41:lstore_2        
			long l1 = System.currentTimeMillis() - l;
	//   19   42:invokestatic    #74  <Method long System.currentTimeMillis()>
	//   20   45:lload_2         
	//   21   46:lsub            
	//   22   47:lstore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   23   49:new             #111 <Class StringBuilder>
	//   24   52:dup             
	//   25   53:invokespecial   #112 <Method void StringBuilder()>
	//   26   56:astore          7
			stringbuilder.append("processKeepAlive(");
	//   27   58:aload           7
	//   28   60:ldc1            #114 <String "processKeepAlive(">
	//   29   62:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   30   65:pop             
			stringbuilder.append(flag);
	//   31   66:aload           7
	//   32   68:iload_1         
	//   33   69:invokevirtual   #121 <Method StringBuilder StringBuilder.append(boolean)>
	//   34   72:pop             
			stringbuilder.append(") timeSinceLastTransmission=");
	//   35   73:aload           7
	//   36   75:ldc1            #123 <String ") timeSinceLastTransmission=">
	//   37   77:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   38   80:pop             
			stringbuilder.append(System.currentTimeMillis() - l1);
	//   39   81:aload           7
	//   40   83:invokestatic    #74  <Method long System.currentTimeMillis()>
	//   41   86:lload           4
	//   42   88:lsub            
	//   43   89:invokevirtual   #126 <Method StringBuilder StringBuilder.append(long)>
	//   44   92:pop             
			stringbuilder.append(" currentTimeout=");
	//   45   93:aload           7
	//   46   95:ldc1            #128 <String " currentTimeout=">
	//   47   97:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   48  100:pop             
			stringbuilder.append(c);
	//   49  101:aload           7
	//   50  103:aload_0         
	//   51  104:getfield        #32  <Field long c>
	//   52  107:invokevirtual   #126 <Method StringBuilder StringBuilder.append(long)>
	//   53  110:pop             
			Log.d("KeepAlive", stringbuilder.toString());
	//   54  111:ldc1            #83  <String "KeepAlive">
	//   55  113:aload           7
	//   56  115:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   57  118:invokestatic    #90  <Method int Log.d(String, String)>
	//   58  121:pop             
			if(l != 0L && l1 > c - 1000L)
	//*  59  122:lload_2         
	//*  60  123:lconst_0        
	//*  61  124:lcmp            
	//*  62  125:ifeq            203
	//*  63  128:lload           4
	//*  64  130:aload_0         
	//*  65  131:getfield        #32  <Field long c>
	//*  66  134:ldc2w           #133 <Long 1000L>
	//*  67  137:lsub            
	//*  68  138:lcmp            
	//*  69  139:ifle            203
			{
				Log.d("KeepAlive", "Sending Keep-alive");
	//   70  142:ldc1            #83  <String "KeepAlive">
	//   71  144:ldc1            #136 <String "Sending Keep-alive">
	//   72  146:invokestatic    #90  <Method int Log.d(String, String)>
	//   73  149:pop             
				if(!flag)
	//*  74  150:iload_1         
	//*  75  151:ifne            175
					d.notify(EventType.KEEPALIVE, new HashMap(), true);
	//   76  154:aload_0         
	//   77  155:getfield        #34  <Field Core d>
	//   78  158:getstatic       #142 <Field EventType EventType.KEEPALIVE>
	//   79  161:new             #144 <Class HashMap>
	//   80  164:dup             
	//   81  165:invokespecial   #145 <Method void HashMap()>
	//   82  168:iconst_1        
	//   83  169:invokevirtual   #149 <Method void Core.notify(EventType, HashMap, boolean)>
				else
	//*  84  172:goto            185
					offlinemeasurementscache.saveApplicationMeasurement(EventType.KEEPALIVE, ((HashMap) (null)), true);
	//   85  175:aload           6
	//   86  177:getstatic       #142 <Field EventType EventType.KEEPALIVE>
	//   87  180:aconst_null     
	//   88  181:iconst_1        
	//   89  182:invokevirtual   #154 <Method void OfflineMeasurementsCache.saveApplicationMeasurement(EventType, HashMap, boolean)>
				d.getStorage().set("lastMeasurementProcessedTimestamp", String.valueOf(System.currentTimeMillis()));
	//   90  185:aload_0         
	//   91  186:getfield        #34  <Field Core d>
	//   92  189:invokevirtual   #107 <Method Storage Core.getStorage()>
	//   93  192:ldc1            #40  <String "lastMeasurementProcessedTimestamp">
	//   94  194:invokestatic    #74  <Method long System.currentTimeMillis()>
	//   95  197:invokestatic    #158 <Method String String.valueOf(long)>
	//   96  200:invokevirtual   #162 <Method void Storage.set(String, String)>
			}
		}
	//   97  203:return          
	}

	public void reset()
	{
		reset(a);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field long a>
	//    3    5:invokevirtual   #166 <Method void reset(long)>
	//    4    8:return          
	}

	public void reset(long l)
	{
		if(!d.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Core d>
	//*   2    4:invokevirtual   #64  <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		cancel();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #168 <Method void cancel()>
		StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #111 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #112 <Method void StringBuilder()>
	//   10   22:astore_3        
		stringbuilder.append("reset:");
	//   11   23:aload_3         
	//   12   24:ldc1            #170 <String "reset:">
	//   13   26:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		stringbuilder.append(l);
	//   15   30:aload_3         
	//   16   31:lload_1         
	//   17   32:invokevirtual   #126 <Method StringBuilder StringBuilder.append(long)>
	//   18   35:pop             
		Log.d("KeepAlive", stringbuilder.toString());
	//   19   36:ldc1            #83  <String "KeepAlive">
	//   20   38:aload_3         
	//   21   39:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   22   42:invokestatic    #90  <Method int Log.d(String, String)>
	//   23   45:pop             
		b = System.currentTimeMillis() + l;
	//   24   46:aload_0         
	//   25   47:invokestatic    #74  <Method long System.currentTimeMillis()>
	//   26   50:lload_1         
	//   27   51:ladd            
	//   28   52:putfield        #24  <Field long b>
		c = l;
	//   29   55:aload_0         
	//   30   56:lload_1         
	//   31   57:putfield        #32  <Field long c>
		if(e)
	//*  32   60:aload_0         
	//*  33   61:getfield        #26  <Field boolean e>
	//*  34   64:ifeq            72
			start(0);
	//   35   67:aload_0         
	//   36   68:iconst_0        
	//   37   69:invokevirtual   #174 <Method void start(int)>
	//   38   72:return          
	}

	public void run()
	{
		if(!d.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Core d>
	//*   2    4:invokevirtual   #64  <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(f)
	//*   5   11:aload_0         
	//*   6   12:getfield        #28  <Field boolean f>
	//*   7   15:ifeq            30
		{
			Log.d("KeepAlive", "run()");
	//    8   18:ldc1            #83  <String "KeepAlive">
	//    9   20:ldc1            #177 <String "run()">
	//   10   22:invokestatic    #90  <Method int Log.d(String, String)>
	//   11   25:pop             
			sendKeepAlive();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #180 <Method void sendKeepAlive()>
		}
	//   14   30:return          
	}

	public void sendKeepAlive()
	{
		processKeepAlive(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #182 <Method void processKeepAlive(boolean)>
	//    3    5:return          
	}

	public void start(int i)
	{
		if(!d.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Core d>
	//*   2    4:invokevirtual   #64  <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		cancel();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #168 <Method void cancel()>
		e = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #26  <Field boolean e>
		StringBuilder stringbuilder = new StringBuilder();
	//   10   20:new             #111 <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #112 <Method void StringBuilder()>
	//   13   27:astore          4
		stringbuilder.append("start(");
	//   14   29:aload           4
	//   15   31:ldc1            #184 <String "start(">
	//   16   33:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
		stringbuilder.append(i);
	//   18   37:aload           4
	//   19   39:iload_1         
	//   20   40:invokevirtual   #187 <Method StringBuilder StringBuilder.append(int)>
	//   21   43:pop             
		stringbuilder.append(")");
	//   22   44:aload           4
	//   23   46:ldc1            #189 <String ")">
	//   24   48:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		Log.d("KeepAlive", stringbuilder.toString());
	//   26   52:ldc1            #83  <String "KeepAlive">
	//   27   54:aload           4
	//   28   56:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   29   59:invokestatic    #90  <Method int Log.d(String, String)>
	//   30   62:pop             
		if(d.isKeepAliveEnabled())
	//*  31   63:aload_0         
	//*  32   64:getfield        #34  <Field Core d>
	//*  33   67:invokevirtual   #99  <Method boolean Core.isKeepAliveEnabled()>
	//*  34   70:ifeq            98
		{
			long l = System.currentTimeMillis();
	//   35   73:invokestatic    #74  <Method long System.currentTimeMillis()>
	//   36   76:lstore_2        
			if(b < l)
	//*  37   77:aload_0         
	//*  38   78:getfield        #24  <Field long b>
	//*  39   81:lload_2         
	//*  40   82:lcmp            
	//*  41   83:ifge            94
				b = l + (long)i;
	//   42   86:aload_0         
	//   43   87:lload_2         
	//   44   88:iload_1         
	//   45   89:i2l             
	//   46   90:ladd            
	//   47   91:putfield        #24  <Field long b>
			a();
	//   48   94:aload_0         
	//   49   95:invokevirtual   #191 <Method void a()>
		}
	//   50   98:return          
	}

	public void stop()
	{
		Log.d("KeepAlive", "stop");
	//    0    0:ldc1            #83  <String "KeepAlive">
	//    1    2:ldc1            #193 <String "stop">
	//    2    4:invokestatic    #90  <Method int Log.d(String, String)>
	//    3    7:pop             
		e = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #26  <Field boolean e>
		cancel();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #168 <Method void cancel()>
		processKeepAlive(true);
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #182 <Method void processKeepAlive(boolean)>
	//   12   22:return          
	}

	protected final long a;
	protected long b;
	protected long c;
	private Core d;
	private boolean e;
	private boolean f;
}
