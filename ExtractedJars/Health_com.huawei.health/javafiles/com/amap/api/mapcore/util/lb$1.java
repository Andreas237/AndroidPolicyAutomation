// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.telephony.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			lb, lk

final class lb$1 extends PhoneStateListener
{

	public final void onCellLocationChanged(CellLocation celllocation)
	{
		boolean flag;
		try
		{
			flag = a.a(celllocation);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field lb a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #25  <Method boolean lb.a(CellLocation)>
	//    4    8:istore_2        
		}
	//*   5    9:iload_2         
	//*   6   10:ifne            14
	//*   7   13:return          
	//*   8   14:aload_0         
	//*   9   15:getfield        #15  <Field lb a>
	//*  10   18:aload_1         
	//*  11   19:putfield        #29  <Field CellLocation lb.e>
	//*  12   22:aload_0         
	//*  13   23:getfield        #15  <Field lb a>
	//*  14   26:iconst_1        
	//*  15   27:putfield        #33  <Field boolean lb.f>
	//*  16   30:aload_0         
	//*  17   31:getfield        #15  <Field lb a>
	//*  18   34:invokestatic    #39  <Method long lk.b()>
	//*  19   37:invokestatic    #42  <Method long lb.a(lb, long)>
	//*  20   40:pop2            
	//*  21   41:return          
		// Misplaced declaration of an exception variable
		catch(CellLocation celllocation)
	//*  22   42:astore_1        
		{
			return;
	//   23   43:return          
		}
		if(!flag)
			return;
		a.e = celllocation;
		a.f = true;
		lb.a(a, lk.b());
		return;
	}

	public final void onServiceStateChanged(ServiceState servicestate)
	{
		servicestate.getState();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #50  <Method int ServiceState.getState()>
		JVM INSTR lookupswitch 2: default 50
	//	               0: 40
	//	               1: 32;
	//    2    4:lookupswitch    2: default 50
	//	               0: 40
	//	               1: 32
		   goto _L1 _L2 _L3
_L3:
		a.h();
	//    3   32:aload_0         
	//    4   33:getfield        #15  <Field lb a>
	//    5   36:invokevirtual   #53  <Method void lb.h()>
		return;
	//    6   39:return          
_L2:
		try
		{
			a.f();
	//    7   40:aload_0         
	//    8   41:getfield        #15  <Field lb a>
	//    9   44:invokevirtual   #55  <Method void lb.f()>
			return;
	//   10   47:return          
		}
		// Misplaced declaration of an exception variable
		catch(ServiceState servicestate)
	//*  11   48:astore_1        
		{
			return;
	//   12   49:return          
		}
_L1:
	//   13   50:return          
	}

	public final void onSignalStrengthChanged(int i)
	{
		byte byte0 = -113;
	//    0    0:bipush          -113
	//    1    2:istore_2        
		a.a;
	//    2    3:aload_0         
	//    3    4:getfield        #15  <Field lb a>
	//    4    7:getfield        #60  <Field int lb.a>
		JVM INSTR lookupswitch 2: default 60
	//	               1: 36
	//	               2: 44;
	//    5   10:lookupswitch    2: default 60
	//	               1: 36
	//	               2: 44
		   goto _L1 _L2 _L3
_L1:
		break MISSING_BLOCK_LABEL_60;
_L2:
		i = lk.a(i);
	//    6   36:iload_1         
	//    7   37:invokestatic    #63  <Method int lk.a(int)>
	//    8   40:istore_1        
		break; /* Loop/switch isn't completed */
	//    9   41:goto            49
_L3:
		i = lk.a(i);
	//   10   44:iload_1         
	//   11   45:invokestatic    #63  <Method int lk.a(int)>
	//   12   48:istore_1        
_L4:
		lb.a(a, i);
	//   13   49:aload_0         
	//   14   50:getfield        #15  <Field lb a>
	//   15   53:iload_1         
	//   16   54:invokestatic    #66  <Method void lb.a(lb, int)>
		return;
	//   17   57:return          
		Throwable throwable;
		throwable;
	//   18   58:astore_3        
		return;
	//   19   59:return          
		i = ((int) (byte0));
	//   20   60:iload_2         
	//   21   61:istore_1        
		  goto _L4
	//*  22   62:goto            49
	}

	public final void onSignalStrengthsChanged(SignalStrength signalstrength)
	{
		int i;
		if(signalstrength == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		i = -113;
	//    3    5:bipush          -113
	//    4    7:istore_2        
		a.a;
	//    5    8:aload_0         
	//    6    9:getfield        #15  <Field lb a>
	//    7   12:getfield        #60  <Field int lb.a>
		JVM INSTR lookupswitch 2: default 67
	//	               1: 40
	//	               2: 51;
	//    8   15:lookupswitch    2: default 67
	//	               1: 40
	//	               2: 51
		   goto _L1 _L2 _L3
_L1:
		break; /* Loop/switch isn't completed */
_L2:
		i = lk.a(signalstrength.getGsmSignalStrength());
	//    9   40:aload_1         
	//   10   41:invokevirtual   #73  <Method int SignalStrength.getGsmSignalStrength()>
	//   11   44:invokestatic    #63  <Method int lk.a(int)>
	//   12   47:istore_2        
		break; /* Loop/switch isn't completed */
	//   13   48:goto            56
_L3:
		i = signalstrength.getCdmaDbm();
	//   14   51:aload_1         
	//   15   52:invokevirtual   #76  <Method int SignalStrength.getCdmaDbm()>
	//   16   55:istore_2        
		lb.a(a, i);
	//   17   56:aload_0         
	//   18   57:getfield        #15  <Field lb a>
	//   19   60:iload_2         
	//   20   61:invokestatic    #66  <Method void lb.a(lb, int)>
		return;
	//   21   64:return          
		signalstrength;
	//   22   65:astore_1        
	//   23   66:return          
	//*  24   67:goto            56
	}

	final lb a;

	lb$1(lb lb1)
	{
		a = lb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field lb a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void PhoneStateListener()>
	//    5    9:return          
	}
}
