// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;

import android.os.SystemClock;
import java.util.*;

// Referenced classes of package com.android.volley:
//			VolleyLog

static class VolleyLog$MarkerLog
{
	static class Marker
	{

		public final String name;
		public final long thread;
		public final long time;

		public Marker(String s, long l, long l1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			name = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field String name>
			thread = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #24  <Field long thread>
			time = l1;
		//    8   14:aload_0         
		//    9   15:lload           4
		//   10   17:putfield        #26  <Field long time>
		//   11   20:return          
		}
	}


	private long getTotalDuration()
	{
		if(mMarkers.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field List mMarkers>
	//*   2    4:invokeinterface #46  <Method int List.size()>
	//*   3    9:ifne            14
		{
			return 0L;
	//    4   12:lconst_0        
	//    5   13:lreturn         
		} else
		{
			long l = ((Marker)mMarkers.get(0)).time;
	//    6   14:aload_0         
	//    7   15:getfield        #36  <Field List mMarkers>
	//    8   18:iconst_0        
	//    9   19:invokeinterface #50  <Method Object List.get(int)>
	//   10   24:checkcast       #9   <Class VolleyLog$MarkerLog$Marker>
	//   11   27:getfield        #53  <Field long VolleyLog$MarkerLog$Marker.time>
	//   12   30:lstore_1        
			return ((Marker)mMarkers.get(mMarkers.size() - 1)).time - l;
	//   13   31:aload_0         
	//   14   32:getfield        #36  <Field List mMarkers>
	//   15   35:aload_0         
	//   16   36:getfield        #36  <Field List mMarkers>
	//   17   39:invokeinterface #46  <Method int List.size()>
	//   18   44:iconst_1        
	//   19   45:isub            
	//   20   46:invokeinterface #50  <Method Object List.get(int)>
	//   21   51:checkcast       #9   <Class VolleyLog$MarkerLog$Marker>
	//   22   54:getfield        #53  <Field long VolleyLog$MarkerLog$Marker.time>
	//   23   57:lload_1         
	//   24   58:lsub            
	//   25   59:lreturn         
		}
	}

	public void add(String s, long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mFinished)
	//*   2    2:aload_0         
	//*   3    3:getfield        #38  <Field boolean mFinished>
	//*   4    6:ifeq            19
			throw new IllegalStateException("Marker added to finished log");
	//    5    9:new             #57  <Class IllegalStateException>
	//    6   12:dup             
	//    7   13:ldc1            #59  <String "Marker added to finished log">
	//    8   15:invokespecial   #62  <Method void IllegalStateException(String)>
	//    9   18:athrow          
		mMarkers.add(((Object) (new Marker(s, l, SystemClock.elapsedRealtime()))));
	//   10   19:aload_0         
	//   11   20:getfield        #36  <Field List mMarkers>
	//   12   23:new             #9   <Class VolleyLog$MarkerLog$Marker>
	//   13   26:dup             
	//   14   27:aload_1         
	//   15   28:lload_2         
	//   16   29:invokestatic    #67  <Method long SystemClock.elapsedRealtime()>
	//   17   32:invokespecial   #70  <Method void VolleyLog$MarkerLog$Marker(String, long, long)>
	//   18   35:invokeinterface #73  <Method boolean List.add(Object)>
	//   19   40:pop             
		this;
	//   20   41:aload_0         
		JVM INSTR monitorexit ;
	//   21   42:monitorexit     
		return;
	//   22   43:return          
		s;
	//   23   44:astore_1        
	//*  24   45:aload_0         
		throw s;
	//   25   46:monitorexit     
	//   26   47:aload_1         
	//   27   48:athrow          
	}

	protected void finalize()
		throws Throwable
	{
		if(!mFinished)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field boolean mFinished>
	//*   2    4:ifne            22
		{
			finish("Request on the loose");
	//    3    7:aload_0         
	//    4    8:ldc1            #78  <String "Request on the loose">
	//    5   10:invokevirtual   #81  <Method void finish(String)>
			VolleyLog.e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
	//    6   13:ldc1            #83  <String "Marker log finalized without finish() - uncaught exit point for request">
	//    7   15:iconst_0        
	//    8   16:anewarray       Object[]
	//    9   19:invokestatic    #87  <Method void VolleyLog.e(String, Object[])>
		}
	//   10   22:return          
	}

	public void finish(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l1;
		mFinished = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #38  <Field boolean mFinished>
		l1 = getTotalDuration();
	//    5    7:aload_0         
	//    6    8:invokespecial   #90  <Method long getTotalDuration()>
	//    7   11:lstore          4
		if(l1 > 0L)
			break MISSING_BLOCK_LABEL_23;
	//    8   13:lload           4
	//    9   15:lconst_0        
	//   10   16:lcmp            
	//   11   17:ifgt            23
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return;
	//   14   22:return          
		long l;
		l = ((Marker)mMarkers.get(0)).time;
	//   15   23:aload_0         
	//   16   24:getfield        #36  <Field List mMarkers>
	//   17   27:iconst_0        
	//   18   28:invokeinterface #50  <Method Object List.get(int)>
	//   19   33:checkcast       #9   <Class VolleyLog$MarkerLog$Marker>
	//   20   36:getfield        #53  <Field long VolleyLog$MarkerLog$Marker.time>
	//   21   39:lstore_2        
		VolleyLog.d("(%-4d ms) %s", new Object[] {
			Long.valueOf(l1), s
		});
	//   22   40:ldc1            #92  <String "(%-4d ms) %s">
	//   23   42:iconst_2        
	//   24   43:anewarray       Object[]
	//   25   46:dup             
	//   26   47:iconst_0        
	//   27   48:lload           4
	//   28   50:invokestatic    #98  <Method Long Long.valueOf(long)>
	//   29   53:aastore         
	//   30   54:dup             
	//   31   55:iconst_1        
	//   32   56:aload_1         
	//   33   57:aastore         
	//   34   58:invokestatic    #101 <Method void VolleyLog.d(String, Object[])>
		s = ((String) (mMarkers.iterator()));
	//   35   61:aload_0         
	//   36   62:getfield        #36  <Field List mMarkers>
	//   37   65:invokeinterface #105 <Method Iterator List.iterator()>
	//   38   70:astore_1        
_L1:
		if(!((Iterator) (s)).hasNext())
			break MISSING_BLOCK_LABEL_142;
	//   39   71:aload_1         
	//   40   72:invokeinterface #111 <Method boolean Iterator.hasNext()>
	//   41   77:ifeq            142
		Marker marker = (Marker)((Iterator) (s)).next();
	//   42   80:aload_1         
	//   43   81:invokeinterface #115 <Method Object Iterator.next()>
	//   44   86:checkcast       #9   <Class VolleyLog$MarkerLog$Marker>
	//   45   89:astore          6
		l1 = marker.time;
	//   46   91:aload           6
	//   47   93:getfield        #53  <Field long VolleyLog$MarkerLog$Marker.time>
	//   48   96:lstore          4
		VolleyLog.d("(+%-4d) [%2d] %s", new Object[] {
			Long.valueOf(l1 - l), Long.valueOf(marker.thread), marker.name
		});
	//   49   98:ldc1            #117 <String "(+%-4d) [%2d] %s">
	//   50  100:iconst_3        
	//   51  101:anewarray       Object[]
	//   52  104:dup             
	//   53  105:iconst_0        
	//   54  106:lload           4
	//   55  108:lload_2         
	//   56  109:lsub            
	//   57  110:invokestatic    #98  <Method Long Long.valueOf(long)>
	//   58  113:aastore         
	//   59  114:dup             
	//   60  115:iconst_1        
	//   61  116:aload           6
	//   62  118:getfield        #120 <Field long VolleyLog$MarkerLog$Marker.thread>
	//   63  121:invokestatic    #98  <Method Long Long.valueOf(long)>
	//   64  124:aastore         
	//   65  125:dup             
	//   66  126:iconst_2        
	//   67  127:aload           6
	//   68  129:getfield        #124 <Field String VolleyLog$MarkerLog$Marker.name>
	//   69  132:aastore         
	//   70  133:invokestatic    #101 <Method void VolleyLog.d(String, Object[])>
		l = l1;
	//   71  136:lload           4
	//   72  138:lstore_2        
		  goto _L1
	//*  73  139:goto            71
		this;
	//   74  142:aload_0         
		JVM INSTR monitorexit ;
	//   75  143:monitorexit     
		return;
	//   76  144:return          
		s;
	//   77  145:astore_1        
	//*  78  146:aload_0         
		throw s;
	//   79  147:monitorexit     
	//   80  148:aload_1         
	//   81  149:athrow          
	}

	public static final boolean ENABLED;
	private static final long MIN_DURATION_FOR_LOGGING_MS = 0L;
	private boolean mFinished;
	private final List mMarkers = new ArrayList();

	static 
	{
		ENABLED = VolleyLog.DEBUG;
	//    0    0:getstatic       #25  <Field boolean VolleyLog.DEBUG>
	//    1    3:putstatic       #27  <Field boolean ENABLED>
	//*   2    6:return          
	}

	VolleyLog$MarkerLog()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #33  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void ArrayList()>
	//    6   12:putfield        #36  <Field List mMarkers>
		mFinished = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #38  <Field boolean mFinished>
	//   10   20:return          
	}
}
