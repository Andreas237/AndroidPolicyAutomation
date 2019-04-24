// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.measurement;

import com.comscore.analytics.Core;
import com.comscore.applications.AggregateMeasurement;
import com.comscore.metrics.Request;
import com.comscore.utils.*;
import com.comscore.utils.task.TaskExecutor;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.comscore.measurement:
//			Measurement, Label, a

public class MeasurementDispatcher
{

	public MeasurementDispatcher(Core core)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		h = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #38  <Field AggregateMeasurement h>
		g = new Object();
	//    5    9:aload_0         
	//    6   10:new             #4   <Class Object>
	//    7   13:dup             
	//    8   14:invokespecial   #36  <Method void Object()>
	//    9   17:putfield        #40  <Field Object g>
		c = new AtomicInteger(0);
	//   10   20:aload_0         
	//   11   21:new             #42  <Class AtomicInteger>
	//   12   24:dup             
	//   13   25:iconst_0        
	//   14   26:invokespecial   #45  <Method void AtomicInteger(int)>
	//   15   29:putfield        #47  <Field AtomicInteger c>
		b = new AtomicLong(-1L);
	//   16   32:aload_0         
	//   17   33:new             #49  <Class AtomicLong>
	//   18   36:dup             
	//   19   37:ldc2w           #50  <Long -1L>
	//   20   40:invokespecial   #54  <Method void AtomicLong(long)>
	//   21   43:putfield        #56  <Field AtomicLong b>
		d = new AtomicLong(-1L);
	//   22   46:aload_0         
	//   23   47:new             #49  <Class AtomicLong>
	//   24   50:dup             
	//   25   51:ldc2w           #50  <Long -1L>
	//   26   54:invokespecial   #54  <Method void AtomicLong(long)>
	//   27   57:putfield        #58  <Field AtomicLong d>
		e = new AtomicInteger(0);
	//   28   60:aload_0         
	//   29   61:new             #42  <Class AtomicInteger>
	//   30   64:dup             
	//   31   65:iconst_0        
	//   32   66:invokespecial   #45  <Method void AtomicInteger(int)>
	//   33   69:putfield        #60  <Field AtomicInteger e>
		f = new AtomicInteger(0);
	//   34   72:aload_0         
	//   35   73:new             #42  <Class AtomicInteger>
	//   36   76:dup             
	//   37   77:iconst_0        
	//   38   78:invokespecial   #45  <Method void AtomicInteger(int)>
	//   39   81:putfield        #62  <Field AtomicInteger f>
		a = core;
	//   40   84:aload_0         
	//   41   85:aload_1         
	//   42   86:putfield        #64  <Field Core a>
	//   43   89:return          
	}

	private void a(AggregateMeasurement aggregatemeasurement)
	{
		Object obj = g;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Object g>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(h == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #38  <Field AggregateMeasurement h>
	//*   7   11:ifnonnull       29
		{
			h = aggregatemeasurement;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #38  <Field AggregateMeasurement h>
			h.formatLists();
	//   11   19:aload_0         
	//   12   20:getfield        #38  <Field AggregateMeasurement h>
	//   13   23:invokevirtual   #71  <Method void AggregateMeasurement.formatLists()>
			break MISSING_BLOCK_LABEL_40;
	//   14   26:goto            40
		}
		h.aggregateLabels(aggregatemeasurement.getAggregateLabels());
	//   15   29:aload_0         
	//   16   30:getfield        #38  <Field AggregateMeasurement h>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #75  <Method List AggregateMeasurement.getAggregateLabels()>
	//   19   37:invokevirtual   #79  <Method void AggregateMeasurement.aggregateLabels(List)>
		obj;
	//   20   40:aload_2         
		JVM INSTR monitorexit ;
	//   21   41:monitorexit     
		return;
	//   22   42:return          
		aggregatemeasurement;
	//   23   43:astore_1        
		obj;
	//   24   44:aload_2         
		JVM INSTR monitorexit ;
	//   25   45:monitorexit     
		throw aggregatemeasurement;
	//   26   46:aload_1         
	//   27   47:athrow          
	}

	static void a(MeasurementDispatcher measurementdispatcher, Measurement measurement)
	{
		measurementdispatcher.b(measurement);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #83  <Method void b(Measurement)>
	//    3    5:return          
	}

	private boolean a()
	{
		long l;
		Storage storage;
		storage = a.getStorage();
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Core a>
	//    2    4:invokevirtual   #90  <Method Storage Core.getStorage()>
	//    3    7:astore_3        
		l = Date.unixTime();
	//    4    8:invokestatic    #96  <Method long Date.unixTime()>
	//    5   11:lstore_1        
		if(l >= b.get()) goto _L2; else goto _L1
	//    6   12:lload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field AtomicLong b>
	//    9   17:invokevirtual   #99  <Method long AtomicLong.get()>
	//   10   20:lcmp            
	//   11   21:ifge            95
_L1:
		c.set(0);
	//   12   24:aload_0         
	//   13   25:getfield        #47  <Field AtomicInteger c>
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #102 <Method void AtomicInteger.set(int)>
		b.set(l);
	//   16   32:aload_0         
	//   17   33:getfield        #56  <Field AtomicLong b>
	//   18   36:lload_1         
	//   19   37:invokevirtual   #104 <Method void AtomicLong.set(long)>
_L3:
		e.set(0);
	//   20   40:aload_0         
	//   21   41:getfield        #60  <Field AtomicInteger e>
	//   22   44:iconst_0        
	//   23   45:invokevirtual   #102 <Method void AtomicInteger.set(int)>
		d.set(l);
	//   24   48:aload_0         
	//   25   49:getfield        #58  <Field AtomicLong d>
	//   26   52:lload_1         
	//   27   53:invokevirtual   #104 <Method void AtomicLong.set(long)>
		storage.set("q_dcc", Integer.toString(e.get(), 10));
	//   28   56:aload_3         
	//   29   57:ldc1            #8   <String "q_dcc">
	//   30   59:aload_0         
	//   31   60:getfield        #60  <Field AtomicInteger e>
	//   32   63:invokevirtual   #107 <Method int AtomicInteger.get()>
	//   33   66:bipush          10
	//   34   68:invokestatic    #113 <Method String Integer.toString(int, int)>
	//   35   71:invokevirtual   #118 <Method void Storage.set(String, String)>
		storage.set("q_dcf", Long.toString(d.get(), 10));
	//   36   74:aload_3         
	//   37   75:ldc1            #11  <String "q_dcf">
	//   38   77:aload_0         
	//   39   78:getfield        #58  <Field AtomicLong d>
	//   40   81:invokevirtual   #99  <Method long AtomicLong.get()>
	//   41   84:bipush          10
	//   42   86:invokestatic    #123 <Method String Long.toString(long, int)>
	//   43   89:invokevirtual   #118 <Method void Storage.set(String, String)>
		break; /* Loop/switch isn't completed */
	//   44   92:goto            146
_L2:
		if(l - b.get() > 1000L)
	//*  45   95:lload_1         
	//*  46   96:aload_0         
	//*  47   97:getfield        #56  <Field AtomicLong b>
	//*  48  100:invokevirtual   #99  <Method long AtomicLong.get()>
	//*  49  103:lsub            
	//*  50  104:ldc2w           #17  <Long 1000L>
	//*  51  107:lcmp            
	//*  52  108:ifle            127
		{
			c.set(0);
	//   53  111:aload_0         
	//   54  112:getfield        #47  <Field AtomicInteger c>
	//   55  115:iconst_0        
	//   56  116:invokevirtual   #102 <Method void AtomicInteger.set(int)>
			b.set(l);
	//   57  119:aload_0         
	//   58  120:getfield        #56  <Field AtomicLong b>
	//   59  123:lload_1         
	//   60  124:invokevirtual   #104 <Method void AtomicLong.set(long)>
		}
		if(l - d.get() <= 0x5265c00L) goto _L4; else goto _L3
	//   61  127:lload_1         
	//   62  128:aload_0         
	//   63  129:getfield        #58  <Field AtomicLong d>
	//   64  132:invokevirtual   #99  <Method long AtomicLong.get()>
	//   65  135:lsub            
	//   66  136:ldc2w           #14  <Long 0x5265c00L>
	//   67  139:lcmp            
	//   68  140:ifle            146
	//*  69  143:goto            40
_L4:
		if(c.get() < 20 && e.get() < 6000)
	//*  70  146:aload_0         
	//*  71  147:getfield        #47  <Field AtomicInteger c>
	//*  72  150:invokevirtual   #107 <Method int AtomicInteger.get()>
	//*  73  153:bipush          20
	//*  74  155:icmpge          207
	//*  75  158:aload_0         
	//*  76  159:getfield        #60  <Field AtomicInteger e>
	//*  77  162:invokevirtual   #107 <Method int AtomicInteger.get()>
	//*  78  165:sipush          6000
	//*  79  168:icmpge          207
		{
			c.incrementAndGet();
	//   80  171:aload_0         
	//   81  172:getfield        #47  <Field AtomicInteger c>
	//   82  175:invokevirtual   #126 <Method int AtomicInteger.incrementAndGet()>
	//   83  178:pop             
			e.getAndIncrement();
	//   84  179:aload_0         
	//   85  180:getfield        #60  <Field AtomicInteger e>
	//   86  183:invokevirtual   #129 <Method int AtomicInteger.getAndIncrement()>
	//   87  186:pop             
			storage.set("q_dcc", Integer.toString(e.get(), 10));
	//   88  187:aload_3         
	//   89  188:ldc1            #8   <String "q_dcc">
	//   90  190:aload_0         
	//   91  191:getfield        #60  <Field AtomicInteger e>
	//   92  194:invokevirtual   #107 <Method int AtomicInteger.get()>
	//   93  197:bipush          10
	//   94  199:invokestatic    #113 <Method String Integer.toString(int, int)>
	//   95  202:invokevirtual   #118 <Method void Storage.set(String, String)>
			return true;
	//   96  205:iconst_1        
	//   97  206:ireturn         
		} else
		{
			return false;
	//   98  207:iconst_0        
	//   99  208:ireturn         
		}
	}

	private void b(Measurement measurement)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field Core a>
	//*   2    4:invokevirtual   #132 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #134 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #135 <Method void StringBuilder()>
	//    8   18:astore_2        
		stringbuilder.append("sendMeasurmement: ");
	//    9   19:aload_2         
	//   10   20:ldc1            #137 <String "sendMeasurmement: ">
	//   11   22:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		stringbuilder.append(measurement.retrieveLabelsAsString(a.getMeasurementLabelOrder()));
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #64  <Field Core a>
	//   17   32:invokevirtual   #145 <Method String[] Core.getMeasurementLabelOrder()>
	//   18   35:invokevirtual   #151 <Method String Measurement.retrieveLabelsAsString(String[])>
	//   19   38:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
		CSLog.d(((Object) (this)), stringbuilder.toString());
	//   21   42:aload_0         
	//   22   43:aload_2         
	//   23   44:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   24   47:invokestatic    #159 <Method void CSLog.d(Object, String)>
		addAggregateData(measurement);
	//   25   50:aload_0         
	//   26   51:aload_1         
	//   27   52:invokevirtual   #162 <Method void addAggregateData(Measurement)>
		if(!(measurement instanceof AggregateMeasurement))
	//*  28   55:aload_1         
	//*  29   56:instanceof      #68  <Class AggregateMeasurement>
	//*  30   59:ifne            88
		{
			addEventCounter(measurement);
	//   31   62:aload_0         
	//   32   63:aload_1         
	//   33   64:invokevirtual   #165 <Method void addEventCounter(Measurement)>
			a(measurement);
	//   34   67:aload_0         
	//   35   68:aload_1         
	//   36   69:invokevirtual   #167 <Method void a(Measurement)>
			(new Request(a, measurement)).send();
	//   37   72:new             #169 <Class Request>
	//   38   75:dup             
	//   39   76:aload_0         
	//   40   77:getfield        #64  <Field Core a>
	//   41   80:aload_1         
	//   42   81:invokespecial   #172 <Method void Request(Core, Measurement)>
	//   43   84:invokevirtual   #175 <Method boolean Request.send()>
	//   44   87:pop             
		}
	//   45   88:return          
	}

	protected void a(Measurement measurement)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field Core a>
	//*   2    4:invokevirtual   #132 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		measurement.setLabel(new Label("c12", a.getVisitorId(), Boolean.valueOf(false)));
	//    5   11:aload_1         
	//    6   12:new             #177 <Class Label>
	//    7   15:dup             
	//    8   16:ldc1            #179 <String "c12">
	//    9   18:aload_0         
	//   10   19:getfield        #64  <Field Core a>
	//   11   22:invokevirtual   #182 <Method String Core.getVisitorId()>
	//   12   25:iconst_0        
	//   13   26:invokestatic    #188 <Method Boolean Boolean.valueOf(boolean)>
	//   14   29:invokespecial   #191 <Method void Label(String, String, Boolean)>
	//   15   32:invokevirtual   #195 <Method void Measurement.setLabel(Label)>
		if(a.getCrossPublisherId() != null)
	//*  16   35:aload_0         
	//*  17   36:getfield        #64  <Field Core a>
	//*  18   39:invokevirtual   #198 <Method String Core.getCrossPublisherId()>
	//*  19   42:ifnull          69
			measurement.setLabel(new Label("ns_ak", a.getCrossPublisherId(), Boolean.valueOf(false)));
	//   20   45:aload_1         
	//   21   46:new             #177 <Class Label>
	//   22   49:dup             
	//   23   50:ldc1            #200 <String "ns_ak">
	//   24   52:aload_0         
	//   25   53:getfield        #64  <Field Core a>
	//   26   56:invokevirtual   #198 <Method String Core.getCrossPublisherId()>
	//   27   59:iconst_0        
	//   28   60:invokestatic    #188 <Method Boolean Boolean.valueOf(boolean)>
	//   29   63:invokespecial   #191 <Method void Label(String, String, Boolean)>
	//   30   66:invokevirtual   #195 <Method void Measurement.setLabel(Label)>
	//   31   69:return          
	}

	public void addAggregateData(Measurement measurement)
	{
label0:
		{
			if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field Core a>
	//*   2    4:invokevirtual   #132 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
				return;
	//    4   10:return          
			synchronized(g)
	//*   5   11:aload_0         
	//*   6   12:getfield        #40  <Field Object g>
	//*   7   15:astore_2        
	//*   8   16:aload_2         
	//*   9   17:monitorenter    
			{
				if(!(measurement instanceof AggregateMeasurement))
					break label0;
	//   10   18:aload_1         
	//   11   19:instanceof      #68  <Class AggregateMeasurement>
	//   12   22:ifeq            36
				a((AggregateMeasurement)measurement);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:checkcast       #68  <Class AggregateMeasurement>
	//   16   30:invokespecial   #202 <Method void a(AggregateMeasurement)>
			}
	//   17   33:aload_2         
	//   18   34:monitorexit     
			return;
	//   19   35:return          
		}
		if(h == null)
			break MISSING_BLOCK_LABEL_86;
	//   20   36:aload_0         
	//   21   37:getfield        #38  <Field AggregateMeasurement h>
	//   22   40:ifnull          86
		for(Iterator iterator = h.getAggregateLabels().iterator(); iterator.hasNext(); measurement.setLabel((Label)iterator.next()));
	//   23   43:aload_0         
	//   24   44:getfield        #38  <Field AggregateMeasurement h>
	//   25   47:invokevirtual   #75  <Method List AggregateMeasurement.getAggregateLabels()>
	//   26   50:invokeinterface #208 <Method Iterator List.iterator()>
	//   27   55:astore_3        
	//   28   56:aload_3         
	//   29   57:invokeinterface #213 <Method boolean Iterator.hasNext()>
	//   30   62:ifeq            81
	//   31   65:aload_1         
	//   32   66:aload_3         
	//   33   67:invokeinterface #217 <Method Object Iterator.next()>
	//   34   72:checkcast       #177 <Class Label>
	//   35   75:invokevirtual   #195 <Method void Measurement.setLabel(Label)>
	//*  36   78:goto            56
		h = null;
	//   37   81:aload_0         
	//   38   82:aconst_null     
	//   39   83:putfield        #38  <Field AggregateMeasurement h>
		obj;
	//   40   86:aload_2         
		JVM INSTR monitorexit ;
	//   41   87:monitorexit     
		return;
	//   42   88:return          
		measurement;
	//   43   89:astore_1        
		obj;
	//   44   90:aload_2         
		JVM INSTR monitorexit ;
	//   45   91:monitorexit     
		throw measurement;
	//   46   92:aload_1         
	//   47   93:athrow          
	}

	public void addEventCounter(Measurement measurement)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field Core a>
	//*   2    4:invokevirtual   #132 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			f.getAndIncrement();
	//    5   11:aload_0         
	//    6   12:getfield        #62  <Field AtomicInteger f>
	//    7   15:invokevirtual   #129 <Method int AtomicInteger.getAndIncrement()>
	//    8   18:pop             
			measurement.setLabel(new Label("ns_ap_ec", String.valueOf(((Object) (f))), Boolean.valueOf(false)));
	//    9   19:aload_1         
	//   10   20:new             #177 <Class Label>
	//   11   23:dup             
	//   12   24:ldc1            #219 <String "ns_ap_ec">
	//   13   26:aload_0         
	//   14   27:getfield        #62  <Field AtomicInteger f>
	//   15   30:invokestatic    #224 <Method String String.valueOf(Object)>
	//   16   33:iconst_0        
	//   17   34:invokestatic    #188 <Method Boolean Boolean.valueOf(boolean)>
	//   18   37:invokespecial   #191 <Method void Label(String, String, Boolean)>
	//   19   40:invokevirtual   #195 <Method void Measurement.setLabel(Label)>
			return;
	//   20   43:return          
		}
	}

	public void loadEventData()
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field Core a>
	//*   2    4:invokevirtual   #132 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		Storage storage = a.getStorage();
	//    5   11:aload_0         
	//    6   12:getfield        #64  <Field Core a>
	//    7   15:invokevirtual   #90  <Method Storage Core.getStorage()>
	//    8   18:astore          4
		if(storage.has("q_dcc").booleanValue() && storage.has("q_dcf").booleanValue())
	//*   9   20:aload           4
	//*  10   22:ldc1            #8   <String "q_dcc">
	//*  11   24:invokevirtual   #231 <Method Boolean Storage.has(String)>
	//*  12   27:invokevirtual   #234 <Method boolean Boolean.booleanValue()>
	//*  13   30:ifeq            119
	//*  14   33:aload           4
	//*  15   35:ldc1            #11  <String "q_dcf">
	//*  16   37:invokevirtual   #231 <Method Boolean Storage.has(String)>
	//*  17   40:invokevirtual   #234 <Method boolean Boolean.booleanValue()>
	//*  18   43:ifeq            119
			try
			{
				int i = Integer.parseInt(storage.get("q_dcc"), 10);
	//   19   46:aload           4
	//   20   48:ldc1            #8   <String "q_dcc">
	//   21   50:invokevirtual   #237 <Method String Storage.get(String)>
	//   22   53:bipush          10
	//   23   55:invokestatic    #241 <Method int Integer.parseInt(String, int)>
	//   24   58:istore_1        
				long l = Long.parseLong(storage.get("q_dcf"), 10);
	//   25   59:aload           4
	//   26   61:ldc1            #11  <String "q_dcf">
	//   27   63:invokevirtual   #237 <Method String Storage.get(String)>
	//   28   66:bipush          10
	//   29   68:invokestatic    #245 <Method long Long.parseLong(String, int)>
	//   30   71:lstore_2        
				if(Date.unixTime() >= l)
	//*  31   72:invokestatic    #96  <Method long Date.unixTime()>
	//*  32   75:lload_2         
	//*  33   76:lcmp            
	//*  34   77:iflt            119
				{
					e.set(i);
	//   35   80:aload_0         
	//   36   81:getfield        #60  <Field AtomicInteger e>
	//   37   84:iload_1         
	//   38   85:invokevirtual   #102 <Method void AtomicInteger.set(int)>
					d.set(l);
	//   39   88:aload_0         
	//   40   89:getfield        #58  <Field AtomicLong d>
	//   41   92:lload_2         
	//   42   93:invokevirtual   #104 <Method void AtomicLong.set(long)>
					return;
	//   43   96:return          
				}
			}
			catch(NumberFormatException numberformatexception)
	//*  44   97:astore          4
			{
				if(Constants.DEBUG)
	//*  45   99:getstatic       #251 <Field boolean Constants.DEBUG>
	//*  46  102:ifeq            119
				{
					CSLog.e(((Object) (this)), "Unexpected error parsing storage data: ");
	//   47  105:aload_0         
	//   48  106:ldc1            #253 <String "Unexpected error parsing storage data: ">
	//   49  108:invokestatic    #255 <Method void CSLog.e(Object, String)>
					CSLog.printStackTrace(((Exception) (numberformatexception)));
	//   50  111:aload           4
	//   51  113:invokestatic    #259 <Method void CSLog.printStackTrace(Exception)>
					throw numberformatexception;
	//   52  116:aload           4
	//   53  118:athrow          
				}
			}
	//   54  119:return          
	}

	public boolean sendMeasurmement(Measurement measurement, boolean flag)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field Core a>
	//*   2    4:invokevirtual   #132 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		if(measurement == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		if(!a() && a.getStorage() != null)
	//*  10   18:aload_0         
	//*  11   19:invokespecial   #263 <Method boolean a()>
	//*  12   22:ifne            44
	//*  13   25:aload_0         
	//*  14   26:getfield        #64  <Field Core a>
	//*  15   29:invokevirtual   #90  <Method Storage Core.getStorage()>
	//*  16   32:ifnull          44
		{
			CSLog.d(((Object) (this)), "Data not sent");
	//   17   35:aload_0         
	//   18   36:ldc2            #265 <String "Data not sent">
	//   19   39:invokestatic    #159 <Method void CSLog.d(Object, String)>
			return false;
	//   20   42:iconst_0        
	//   21   43:ireturn         
		} else
		{
			return a.getTaskExecutor().execute(((Runnable) (new a(this, measurement))), flag);
	//   22   44:aload_0         
	//   23   45:getfield        #64  <Field Core a>
	//   24   48:invokevirtual   #269 <Method TaskExecutor Core.getTaskExecutor()>
	//   25   51:new             #271 <Class a>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokespecial   #273 <Method void a(MeasurementDispatcher, Measurement)>
	//   30   60:iload_2         
	//   31   61:invokevirtual   #279 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   32   64:ireturn         
		}
	}

	public static final String DAY_CHECK_COUNTER = "q_dcc";
	public static final String DAY_CHECK_OFFSET = "q_dcf";
	public static final long MILLIS_PER_DAY = 0x5265c00L;
	public static final long MILLIS_PER_SECOND = 1000L;
	Core a;
	protected AtomicLong b;
	protected AtomicInteger c;
	protected AtomicLong d;
	protected AtomicInteger e;
	protected AtomicInteger f;
	protected Object g;
	private AggregateMeasurement h;
}
