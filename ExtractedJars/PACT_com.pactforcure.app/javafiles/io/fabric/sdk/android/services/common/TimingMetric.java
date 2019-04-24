// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import android.os.SystemClock;
import android.util.Log;

public class TimingMetric
{

	public TimingMetric(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		eventName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String eventName>
		tag = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field String tag>
		boolean flag;
		if(!Log.isLoggable(s1, 2))
	//*   8   14:aload_2         
	//*   9   15:iconst_2        
	//*  10   16:invokestatic    #27  <Method boolean Log.isLoggable(String, int)>
	//*  11   19:ifne            30
			flag = true;
	//   12   22:iconst_1        
	//   13   23:istore_3        
		else
	//*  14   24:aload_0         
	//*  15   25:iload_3         
	//*  16   26:putfield        #29  <Field boolean disabled>
	//*  17   29:return          
			flag = false;
	//   18   30:iconst_0        
	//   19   31:istore_3        
		disabled = flag;
	//*  20   32:goto            24
	}

	private void reportToLog()
	{
		Log.v(tag, (new StringBuilder()).append(eventName).append(": ").append(duration).append("ms").toString());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String tag>
	//    2    4:new             #33  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #34  <Method void StringBuilder()>
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field String eventName>
	//    7   15:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:ldc1            #40  <String ": ">
	//    9   20:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:getfield        #42  <Field long duration>
	//   12   27:invokevirtual   #45  <Method StringBuilder StringBuilder.append(long)>
	//   13   30:ldc1            #47  <String "ms">
	//   14   32:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   16   38:invokestatic    #55  <Method int Log.v(String, String)>
	//   17   41:pop             
	//   18   42:return          
	}

	public long getDuration()
	{
		return duration;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field long duration>
	//    2    4:lreturn         
	}

	public void startMeasuring()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = disabled;
	//    2    2:aload_0         
	//    3    3:getfield        #29  <Field boolean disabled>
	//    4    6:istore_1        
		if(!flag) goto _L2; else goto _L1
	//    5    7:iload_1         
	//    6    8:ifeq            14
_L1:
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
_L2:
		start = SystemClock.elapsedRealtime();
	//   10   14:aload_0         
	//   11   15:invokestatic    #63  <Method long SystemClock.elapsedRealtime()>
	//   12   18:putfield        #65  <Field long start>
		duration = 0L;
	//   13   21:aload_0         
	//   14   22:lconst_0        
	//   15   23:putfield        #42  <Field long duration>
		if(true) goto _L1; else goto _L3
	//   16   26:goto            11
_L3:
		Exception exception;
		exception;
	//   17   29:astore_2        
	//*  18   30:aload_0         
		throw exception;
	//   19   31:monitorexit     
	//   20   32:aload_2         
	//   21   33:athrow          
	}

	public void stopMeasuring()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = disabled;
	//    2    2:aload_0         
	//    3    3:getfield        #29  <Field boolean disabled>
	//    4    6:istore_1        
		if(!flag) goto _L2; else goto _L1
	//    5    7:iload_1         
	//    6    8:ifeq            14
_L1:
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
_L2:
		if(duration == 0L)
	//*  10   14:aload_0         
	//*  11   15:getfield        #42  <Field long duration>
	//*  12   18:lconst_0        
	//*  13   19:lcmp            
	//*  14   20:ifne            11
		{
			duration = SystemClock.elapsedRealtime() - start;
	//   15   23:aload_0         
	//   16   24:invokestatic    #63  <Method long SystemClock.elapsedRealtime()>
	//   17   27:aload_0         
	//   18   28:getfield        #65  <Field long start>
	//   19   31:lsub            
	//   20   32:putfield        #42  <Field long duration>
			reportToLog();
	//   21   35:aload_0         
	//   22   36:invokespecial   #68  <Method void reportToLog()>
		}
		if(true) goto _L1; else goto _L3
	//   23   39:goto            11
_L3:
		Exception exception;
		exception;
	//   24   42:astore_2        
	//*  25   43:aload_0         
		throw exception;
	//   26   44:monitorexit     
	//   27   45:aload_2         
	//   28   46:athrow          
	}

	private final boolean disabled;
	private long duration;
	private final String eventName;
	private long start;
	private final String tag;
}
