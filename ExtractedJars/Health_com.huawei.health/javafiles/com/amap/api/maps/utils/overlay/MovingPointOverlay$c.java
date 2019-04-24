// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.utils.overlay;

import com.amap.api.maps.model.BasePointOverlay;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.amap.api.maps.utils.overlay:
//			MovingPointOverlay

class MovingPointOverlay$c
	implements Runnable
{

	public void run()
	{
		MovingPointOverlay.access$202(a, System.currentTimeMillis());
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field MovingPointOverlay a>
	//    2    4:invokestatic    #31  <Method long System.currentTimeMillis()>
	//    3    7:invokestatic    #35  <Method long MovingPointOverlay.access$202(MovingPointOverlay, long)>
	//    4   10:pop2            
		MovingPointOverlay.access$302(a, MovingPointOverlay$a.b);
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field MovingPointOverlay a>
	//    7   15:getstatic       #41  <Field MovingPointOverlay$a MovingPointOverlay$a.b>
	//    8   18:invokestatic    #45  <Method MovingPointOverlay$a MovingPointOverlay.access$302(MovingPointOverlay, MovingPointOverlay$a)>
	//    9   21:pop             
		a.exitFlag.set(false);
	//   10   22:aload_0         
	//   11   23:getfield        #15  <Field MovingPointOverlay a>
	//   12   26:getfield        #49  <Field AtomicBoolean MovingPointOverlay.exitFlag>
	//   13   29:iconst_0        
	//   14   30:invokevirtual   #55  <Method void AtomicBoolean.set(boolean)>
_L4:
		if(a.exitFlag.get() || MovingPointOverlay.access$400(a) > MovingPointOverlay.access$500(a).size() - 1) goto _L2; else goto _L1
	//   15   33:aload_0         
	//   16   34:getfield        #15  <Field MovingPointOverlay a>
	//   17   37:getfield        #49  <Field AtomicBoolean MovingPointOverlay.exitFlag>
	//   18   40:invokevirtual   #59  <Method boolean AtomicBoolean.get()>
	//   19   43:ifne            188
	//   20   46:aload_0         
	//   21   47:getfield        #15  <Field MovingPointOverlay a>
	//   22   50:invokestatic    #63  <Method int MovingPointOverlay.access$400(MovingPointOverlay)>
	//   23   53:aload_0         
	//   24   54:getfield        #15  <Field MovingPointOverlay a>
	//   25   57:invokestatic    #67  <Method LinkedList MovingPointOverlay.access$500(MovingPointOverlay)>
	//   26   60:invokevirtual   #73  <Method int LinkedList.size()>
	//   27   63:iconst_1        
	//   28   64:isub            
	//   29   65:icmpgt          188
_L1:
		Object obj = MovingPointOverlay.access$600(a);
	//   30   68:aload_0         
	//   31   69:getfield        #15  <Field MovingPointOverlay a>
	//   32   72:invokestatic    #77  <Method Object MovingPointOverlay.access$600(MovingPointOverlay)>
	//   33   75:astore          6
		obj;
	//   34   77:aload           6
		JVM INSTR monitorenter ;
	//   35   79:monitorenter    
		boolean flag = a.exitFlag.get();
	//   36   80:aload_0         
	//   37   81:getfield        #15  <Field MovingPointOverlay a>
	//   38   84:getfield        #49  <Field AtomicBoolean MovingPointOverlay.exitFlag>
	//   39   87:invokevirtual   #59  <Method boolean AtomicBoolean.get()>
	//   40   90:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_99;
	//   41   91:iload_1         
	//   42   92:ifeq            99
		obj;
	//   43   95:aload           6
		JVM INSTR monitorexit ;
	//   44   97:monitorexit     
		return;
	//   45   98:return          
		if(MovingPointOverlay.access$300(a) != MovingPointOverlay$a.d)
	//*  46   99:aload_0         
	//*  47  100:getfield        #15  <Field MovingPointOverlay a>
	//*  48  103:invokestatic    #81  <Method MovingPointOverlay$a MovingPointOverlay.access$300(MovingPointOverlay)>
	//*  49  106:getstatic       #84  <Field MovingPointOverlay$a MovingPointOverlay$a.d>
	//*  50  109:if_acmpeq       161
		{
			long l = System.currentTimeMillis();
	//   51  112:invokestatic    #31  <Method long System.currentTimeMillis()>
	//   52  115:lstore_2        
			long l1 = MovingPointOverlay.access$200(a);
	//   53  116:aload_0         
	//   54  117:getfield        #15  <Field MovingPointOverlay a>
	//   55  120:invokestatic    #88  <Method long MovingPointOverlay.access$200(MovingPointOverlay)>
	//   56  123:lstore          4
			com.autonavi.amap.mapcore.IPoint ipoint = MovingPointOverlay.access$700(a, l - l1);
	//   57  125:aload_0         
	//   58  126:getfield        #15  <Field MovingPointOverlay a>
	//   59  129:lload_2         
	//   60  130:lload           4
	//   61  132:lsub            
	//   62  133:invokestatic    #92  <Method com.autonavi.amap.mapcore.IPoint MovingPointOverlay.access$700(MovingPointOverlay, long)>
	//   63  136:astore          7
			MovingPointOverlay.access$800(a).setGeoPoint(ipoint);
	//   64  138:aload_0         
	//   65  139:getfield        #15  <Field MovingPointOverlay a>
	//   66  142:invokestatic    #96  <Method BasePointOverlay MovingPointOverlay.access$800(MovingPointOverlay)>
	//   67  145:aload           7
	//   68  147:invokevirtual   #102 <Method void BasePointOverlay.setGeoPoint(com.autonavi.amap.mapcore.IPoint)>
			MovingPointOverlay.access$302(a, MovingPointOverlay$a.c);
	//   69  150:aload_0         
	//   70  151:getfield        #15  <Field MovingPointOverlay a>
	//   71  154:getstatic       #104 <Field MovingPointOverlay$a MovingPointOverlay$a.c>
	//   72  157:invokestatic    #45  <Method MovingPointOverlay$a MovingPointOverlay.access$302(MovingPointOverlay, MovingPointOverlay$a)>
	//   73  160:pop             
		}
		obj;
	//   74  161:aload           6
		JVM INSTR monitorexit ;
	//   75  163:monitorexit     
		  goto _L3
	//*  76  164:goto            175
		Exception exception;
		exception;
	//   77  167:astore          7
	//*  78  169:aload           6
		throw exception;
	//   79  171:monitorexit     
	//   80  172:aload           7
	//   81  174:athrow          
_L3:
		Thread.sleep(MovingPointOverlay.access$900(a));
	//   82  175:aload_0         
	//   83  176:getfield        #15  <Field MovingPointOverlay a>
	//   84  179:invokestatic    #107 <Method long MovingPointOverlay.access$900(MovingPointOverlay)>
	//   85  182:invokestatic    #113 <Method void Thread.sleep(long)>
		  goto _L4
	//*  86  185:goto            33
_L2:
		try
		{
			MovingPointOverlay.access$302(a, MovingPointOverlay$a.e);
	//   87  188:aload_0         
	//   88  189:getfield        #15  <Field MovingPointOverlay a>
	//   89  192:getstatic       #116 <Field MovingPointOverlay$a MovingPointOverlay$a.e>
	//   90  195:invokestatic    #45  <Method MovingPointOverlay$a MovingPointOverlay.access$302(MovingPointOverlay, MovingPointOverlay$a)>
	//   91  198:pop             
			return;
	//   92  199:return          
		}
		catch(Throwable throwable)
	//*  93  200:astore          6
		{
			throwable.printStackTrace();
	//   94  202:aload           6
	//   95  204:invokevirtual   #119 <Method void Throwable.printStackTrace()>
		}
		return;
	//   96  207:return          
	}

	final MovingPointOverlay a;

	private MovingPointOverlay$c(MovingPointOverlay movingpointoverlay)
	{
		a = movingpointoverlay;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field MovingPointOverlay a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	MovingPointOverlay$c(MovingPointOverlay movingpointoverlay, MovingPointOverlay$1 movingpointoverlay$1)
	{
		this(movingpointoverlay);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void MovingPointOverlay$c(MovingPointOverlay)>
	//    3    5:return          
	}
}
