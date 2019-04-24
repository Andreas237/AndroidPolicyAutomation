// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.amap.api.mapcore.util:
//			gk

class gk$b
	implements TraceListener
{

	private void a(int i, List list)
	{
		List list1 = gk.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field gk a>
	//    2    4:invokestatic    #31  <Method List gk.a(gk)>
	//    3    7:astore_3        
		list1;
	//    4    8:aload_3         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		gk.a(a).clear();
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field gk a>
	//    8   14:invokestatic    #31  <Method List gk.a(gk)>
	//    9   17:invokeinterface #36  <Method void List.clear()>
		gk.a(a).addAll(((java.util.Collection) (list)));
	//   10   22:aload_0         
	//   11   23:getfield        #17  <Field gk a>
	//   12   26:invokestatic    #31  <Method List gk.a(gk)>
	//   13   29:aload_2         
	//   14   30:invokeinterface #40  <Method boolean List.addAll(java.util.Collection)>
	//   15   35:pop             
		list1;
	//   16   36:aload_3         
		JVM INSTR monitorexit ;
	//   17   37:monitorexit     
		  goto _L1
	//*  18   38:goto            46
		list;
	//   19   41:astore_2        
	//*  20   42:aload_3         
		throw list;
	//   21   43:monitorexit     
	//   22   44:aload_2         
	//   23   45:athrow          
_L1:
		gk.c(a).clear();
	//   24   46:aload_0         
	//   25   47:getfield        #17  <Field gk a>
	//   26   50:invokestatic    #43  <Method List gk.c(gk)>
	//   27   53:invokeinterface #36  <Method void List.clear()>
		if(i == 0)
	//*  28   58:iload_1         
	//*  29   59:ifne            85
		{
			try
			{
				gk.c(a).addAll(((java.util.Collection) (gk.a(a))));
	//   30   62:aload_0         
	//   31   63:getfield        #17  <Field gk a>
	//   32   66:invokestatic    #43  <Method List gk.c(gk)>
	//   33   69:aload_0         
	//   34   70:getfield        #17  <Field gk a>
	//   35   73:invokestatic    #31  <Method List gk.a(gk)>
	//   36   76:invokeinterface #40  <Method boolean List.addAll(java.util.Collection)>
	//   37   81:pop             
			}
	//*  38   82:goto            125
	//*  39   85:aload_0         
	//*  40   86:getfield        #17  <Field gk a>
	//*  41   89:invokestatic    #43  <Method List gk.c(gk)>
	//*  42   92:aload_0         
	//*  43   93:getfield        #17  <Field gk a>
	//*  44   96:invokestatic    #46  <Method List gk.d(gk)>
	//*  45   99:invokeinterface #40  <Method boolean List.addAll(java.util.Collection)>
	//*  46  104:pop             
	//*  47  105:aload_0         
	//*  48  106:getfield        #17  <Field gk a>
	//*  49  109:invokestatic    #43  <Method List gk.c(gk)>
	//*  50  112:aload_0         
	//*  51  113:getfield        #17  <Field gk a>
	//*  52  116:invokestatic    #31  <Method List gk.a(gk)>
	//*  53  119:invokeinterface #40  <Method boolean List.addAll(java.util.Collection)>
	//*  54  124:pop             
	//*  55  125:aload_0         
	//*  56  126:getfield        #17  <Field gk a>
	//*  57  129:invokestatic    #50  <Method TraceStatusListener gk.f(gk)>
	//*  58  132:aload_0         
	//*  59  133:getfield        #17  <Field gk a>
	//*  60  136:invokestatic    #53  <Method List gk.e(gk)>
	//*  61  139:aload_0         
	//*  62  140:getfield        #17  <Field gk a>
	//*  63  143:invokestatic    #43  <Method List gk.c(gk)>
	//*  64  146:ldc1            #55  <String "\u7EA0\u504F\u6210\u529F">
	//*  65  148:invokeinterface #61  <Method void TraceStatusListener.onTraceStatus(List, List, String)>
	//*  66  153:return          
			// Misplaced declaration of an exception variable
			catch(List list)
	//*  67  154:astore_2        
			{
				((Throwable) (list)).printStackTrace();
	//   68  155:aload_2         
	//   69  156:invokevirtual   #64  <Method void Throwable.printStackTrace()>
				return;
	//   70  159:return          
			}
			break MISSING_BLOCK_LABEL_125;
		}
		gk.c(a).addAll(((java.util.Collection) (gk.d(a))));
		gk.c(a).addAll(((java.util.Collection) (gk.a(a))));
		gk.f(a).onTraceStatus(gk.e(a), gk.c(a), "\u7EA0\u504F\u6210\u529F");
		return;
	}

	public void onFinished(int i, List list, int j, int k)
	{
		a(i, list);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #69  <Method void a(int, List)>
	//    4    6:return          
	}

	public void onRequestFailed(int i, String s)
	{
		s = ((String) (new ArrayList()));
	//    0    0:new             #74  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void ArrayList()>
	//    3    7:astore_2        
		if(gk.a(a) != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #17  <Field gk a>
	//*   6   12:invokestatic    #31  <Method List gk.a(gk)>
	//*   7   15:ifnull          32
			((List) (s)).addAll(((java.util.Collection) (gk.a(a))));
	//    8   18:aload_2         
	//    9   19:aload_0         
	//   10   20:getfield        #17  <Field gk a>
	//   11   23:invokestatic    #31  <Method List gk.a(gk)>
	//   12   26:invokeinterface #40  <Method boolean List.addAll(java.util.Collection)>
	//   13   31:pop             
		if(b != null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #22  <Field List b>
	//*  16   36:ifnull          137
		{
			int k = b.size();
	//   17   39:aload_0         
	//   18   40:getfield        #22  <Field List b>
	//   19   43:invokeinterface #79  <Method int List.size()>
	//   20   48:istore          4
			if(b.size() > gk.b(a))
	//*  21   50:aload_0         
	//*  22   51:getfield        #22  <Field List b>
	//*  23   54:invokeinterface #79  <Method int List.size()>
	//*  24   59:aload_0         
	//*  25   60:getfield        #17  <Field gk a>
	//*  26   63:invokestatic    #82  <Method int gk.b(gk)>
	//*  27   66:icmple          137
			{
				for(int j = k - gk.b(a); j < k; j++)
	//*  28   69:iload           4
	//*  29   71:aload_0         
	//*  30   72:getfield        #17  <Field gk a>
	//*  31   75:invokestatic    #82  <Method int gk.b(gk)>
	//*  32   78:isub            
	//*  33   79:istore_3        
	//*  34   80:iload_3         
	//*  35   81:iload           4
	//*  36   83:icmpge          137
				{
					TraceLocation tracelocation = (TraceLocation)b.get(j);
	//   37   86:aload_0         
	//   38   87:getfield        #22  <Field List b>
	//   39   90:iload_3         
	//   40   91:invokeinterface #86  <Method Object List.get(int)>
	//   41   96:checkcast       #88  <Class TraceLocation>
	//   42   99:astore          5
					if(tracelocation != null)
	//*  43  101:aload           5
	//*  44  103:ifnull          130
						((List) (s)).add(((Object) (new LatLng(tracelocation.getLatitude(), tracelocation.getLongitude()))));
	//   45  106:aload_2         
	//   46  107:new             #90  <Class LatLng>
	//   47  110:dup             
	//   48  111:aload           5
	//   49  113:invokevirtual   #94  <Method double TraceLocation.getLatitude()>
	//   50  116:aload           5
	//   51  118:invokevirtual   #97  <Method double TraceLocation.getLongitude()>
	//   52  121:invokespecial   #100 <Method void LatLng(double, double)>
	//   53  124:invokeinterface #104 <Method boolean List.add(Object)>
	//   54  129:pop             
				}

	//   55  130:iload_3         
	//   56  131:iconst_1        
	//   57  132:iadd            
	//   58  133:istore_3        
			}
		}
	//*  59  134:goto            80
		a(i, ((List) (s)));
	//   60  137:aload_0         
	//   61  138:iload_1         
	//   62  139:aload_2         
	//   63  140:invokespecial   #69  <Method void a(int, List)>
	//   64  143:return          
	}

	public void onTraceProcessing(int i, int j, List list)
	{
	//    0    0:return          
	}

	final gk a;
	private final List b;

	public gk$b(gk gk1, List list)
	{
		a = gk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field gk a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		b = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field List b>
	//    8   14:return          
	}
}
