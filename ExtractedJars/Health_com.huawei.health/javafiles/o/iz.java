// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.*;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import java.util.List;
import java.util.Timer;

// Referenced classes of package o:
//			iq, iw

final class iz extends BroadcastReceiver
{

	private iz(iq iq1)
	{
		e = iq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field iq e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void BroadcastReceiver()>
	//    5    9:return          
	}

	iz(iq iq1, byte byte0)
	{
		this(iq1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void iz(iq)>
	//    3    5:return          
	}

	public final void onReceive(Context context, Intent intent)
	{
		if(context == null || intent == null)
			break MISSING_BLOCK_LABEL_238;
	//    0    0:aload_1         
	//    1    1:ifnull          238
	//    2    4:aload_2         
	//    3    5:ifnull          238
		if(iq.c(e) == null || iq.a(e) == null || iq.d(e) == null || intent.getAction() == null || !"android.net.wifi.SCAN_RESULTS".equals(((Object) (intent.getAction()))))
			break MISSING_BLOCK_LABEL_238;
	//    4    8:aload_0         
	//    5    9:getfield        #10  <Field iq e>
	//    6   12:invokestatic    #27  <Method WifiManager iq.c(iq)>
	//    7   15:ifnull          238
	//    8   18:aload_0         
	//    9   19:getfield        #10  <Field iq e>
	//   10   22:invokestatic    #31  <Method Timer iq.a(iq)>
	//   11   25:ifnull          238
	//   12   28:aload_0         
	//   13   29:getfield        #10  <Field iq e>
	//   14   32:invokestatic    #35  <Method List iq.d(iq)>
	//   15   35:ifnull          238
	//   16   38:aload_2         
	//   17   39:invokevirtual   #41  <Method String Intent.getAction()>
	//   18   42:ifnull          238
	//   19   45:ldc1            #43  <String "android.net.wifi.SCAN_RESULTS">
	//   20   47:aload_2         
	//   21   48:invokevirtual   #41  <Method String Intent.getAction()>
	//   22   51:invokevirtual   #49  <Method boolean String.equals(Object)>
	//   23   54:ifeq            238
		context = ((Context) (iq.c(e).getScanResults()));
	//   24   57:aload_0         
	//   25   58:getfield        #10  <Field iq e>
	//   26   61:invokestatic    #27  <Method WifiManager iq.c(iq)>
	//   27   64:invokevirtual   #55  <Method List WifiManager.getScanResults()>
	//   28   67:astore_1        
		this;
	//   29   68:aload_0         
		JVM INSTR monitorenter ;
	//   30   69:monitorenter    
		iq.d(e).clear();
	//   31   70:aload_0         
	//   32   71:getfield        #10  <Field iq e>
	//   33   74:invokestatic    #35  <Method List iq.d(iq)>
	//   34   77:invokeinterface #60  <Method void List.clear()>
		iq.e(e, System.currentTimeMillis());
	//   35   82:aload_0         
	//   36   83:getfield        #10  <Field iq e>
	//   37   86:invokestatic    #66  <Method long System.currentTimeMillis()>
	//   38   89:invokestatic    #69  <Method long iq.e(iq, long)>
	//   39   92:pop2            
		if(context == null) goto _L2; else goto _L1
	//   40   93:aload_1         
	//   41   94:ifnull          150
_L1:
		if(((List) (context)).size() <= 0) goto _L2; else goto _L3
	//   42   97:aload_1         
	//   43   98:invokeinterface #73  <Method int List.size()>
	//   44  103:ifle            150
_L3:
		int i = 0;
	//   45  106:iconst_0        
	//   46  107:istore_3        
_L4:
		if(i >= ((List) (context)).size())
			break; /* Loop/switch isn't completed */
	//   47  108:iload_3         
	//   48  109:aload_1         
	//   49  110:invokeinterface #73  <Method int List.size()>
	//   50  115:icmpge          150
		intent = ((Intent) ((ScanResult)((List) (context)).get(i)));
	//   51  118:aload_1         
	//   52  119:iload_3         
	//   53  120:invokeinterface #77  <Method Object List.get(int)>
	//   54  125:checkcast       #79  <Class ScanResult>
	//   55  128:astore_2        
		iq.d(e).add(((Object) (intent)));
	//   56  129:aload_0         
	//   57  130:getfield        #10  <Field iq e>
	//   58  133:invokestatic    #35  <Method List iq.d(iq)>
	//   59  136:aload_2         
	//   60  137:invokeinterface #82  <Method boolean List.add(Object)>
	//   61  142:pop             
		i++;
	//   62  143:iload_3         
	//   63  144:iconst_1        
	//   64  145:iadd            
	//   65  146:istore_3        
		if(true) goto _L4; else goto _L2
	//   66  147:goto            108
_L2:
		this;
	//   67  150:aload_0         
		JVM INSTR monitorexit ;
	//   68  151:monitorexit     
		  goto _L5
	//*  69  152:goto            160
		context;
	//   70  155:astore_1        
	//*  71  156:aload_0         
		throw context;
	//   72  157:monitorexit     
	//   73  158:aload_1         
	//   74  159:athrow          
_L5:
		context = ((Context) (new iw(this)));
	//   75  160:new             #84  <Class iw>
	//   76  163:dup             
	//   77  164:aload_0         
	//   78  165:invokespecial   #87  <Method void iw(iz)>
	//   79  168:astore_1        
		this;
	//   80  169:aload_0         
		JVM INSTR monitorenter ;
	//   81  170:monitorenter    
		if(iq.a(e) != null)
	//*  82  171:aload_0         
	//*  83  172:getfield        #10  <Field iq e>
	//*  84  175:invokestatic    #31  <Method Timer iq.a(iq)>
	//*  85  178:ifnull          200
		{
			iq.a(e).cancel();
	//   86  181:aload_0         
	//   87  182:getfield        #10  <Field iq e>
	//   88  185:invokestatic    #31  <Method Timer iq.a(iq)>
	//   89  188:invokevirtual   #92  <Method void Timer.cancel()>
			iq.a(e, ((Timer) (null)));
	//   90  191:aload_0         
	//   91  192:getfield        #10  <Field iq e>
	//   92  195:aconst_null     
	//   93  196:invokestatic    #95  <Method Timer iq.a(iq, Timer)>
	//   94  199:pop             
		}
		iq.a(e, new Timer());
	//   95  200:aload_0         
	//   96  201:getfield        #10  <Field iq e>
	//   97  204:new             #89  <Class Timer>
	//   98  207:dup             
	//   99  208:invokespecial   #96  <Method void Timer()>
	//  100  211:invokestatic    #95  <Method Timer iq.a(iq, Timer)>
	//  101  214:pop             
		iq.a(e).schedule(((java.util.TimerTask) (context)), iq.A());
	//  102  215:aload_0         
	//  103  216:getfield        #10  <Field iq e>
	//  104  219:invokestatic    #31  <Method Timer iq.a(iq)>
	//  105  222:aload_1         
	//  106  223:invokestatic    #99  <Method int iq.A()>
	//  107  226:i2l             
	//  108  227:invokevirtual   #103 <Method void Timer.schedule(java.util.TimerTask, long)>
		this;
	//  109  230:aload_0         
		JVM INSTR monitorexit ;
	//  110  231:monitorexit     
		return;
	//  111  232:return          
		context;
	//  112  233:astore_1        
	//* 113  234:aload_0         
		throw context;
	//  114  235:monitorexit     
	//  115  236:aload_1         
	//  116  237:athrow          
		return;
	//  117  238:return          
		context;
	//  118  239:astore_1        
	//  119  240:return          
	}

	final iq e;
}
