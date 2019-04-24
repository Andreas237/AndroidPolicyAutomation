// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.telephony.*;
import java.util.List;

// Referenced classes of package o:
//			jf, ke

class jf$3 extends PhoneStateListener
{

	public void onCellLocationChanged(CellLocation celllocation)
	{
		if(celllocation == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		boolean flag = jf.a(b);
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field jf b>
	//    5    9:invokestatic    #26  <Method boolean jf.a(jf)>
	//    6   12:istore_2        
		if(flag)
	//*   7   13:iload_2         
	//*   8   14:ifeq            18
			return;
	//    9   17:return          
		try
		{
			jf.a(b, celllocation);
	//   10   18:aload_0         
	//   11   19:getfield        #15  <Field jf b>
	//   12   22:aload_1         
	//   13   23:invokestatic    #29  <Method CellLocation jf.a(jf, CellLocation)>
	//   14   26:pop             
			jf.a(b, ke.b());
	//   15   27:aload_0         
	//   16   28:getfield        #15  <Field jf b>
	//   17   31:invokestatic    #34  <Method long ke.b()>
	//   18   34:invokestatic    #37  <Method long jf.a(jf, long)>
	//   19   37:pop2            
			jf.e(b, ke.b());
	//   20   38:aload_0         
	//   21   39:getfield        #15  <Field jf b>
	//   22   42:invokestatic    #34  <Method long ke.b()>
	//   23   45:invokestatic    #40  <Method long jf.e(jf, long)>
	//   24   48:pop2            
			return;
	//   25   49:return          
		}
		// Misplaced declaration of an exception variable
		catch(CellLocation celllocation)
	//*  26   50:astore_1        
		{
			((Throwable) (celllocation)).printStackTrace();
	//   27   51:aload_1         
	//   28   52:invokevirtual   #43  <Method void Throwable.printStackTrace()>
		}
		return;
	//   29   55:return          
	}

	public void onServiceStateChanged(ServiceState servicestate)
	{
		try
		{
			switch(servicestate.getState())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #51  <Method int ServiceState.getState()>
			{
	//*   2    4:lookupswitch    1: default 53
	//	               1: 24
			case 1: // '\001'
				jf.b(b).clear();
	//    3   24:aload_0         
	//    4   25:getfield        #15  <Field jf b>
	//    5   28:invokestatic    #54  <Method List jf.b(jf)>
	//    6   31:invokeinterface #59  <Method void List.clear()>
				jf.c(b, -113);
	//    7   36:aload_0         
	//    8   37:getfield        #15  <Field jf b>
	//    9   40:bipush          -113
	//   10   42:invokestatic    #63  <Method int jf.c(jf, int)>
	//   11   45:pop             
				return;
	//   12   46:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(ServiceState servicestate)
	//*  13   47:astore_1        
		{
			((Throwable) (servicestate)).printStackTrace();
	//   14   48:aload_1         
	//   15   49:invokevirtual   #43  <Method void Throwable.printStackTrace()>
			return;
	//   16   52:return          
		}
	//   17   53:return          
	}

	public void onSignalStrengthChanged(int i)
	{
		byte byte0 = -113;
	//    0    0:bipush          -113
	//    1    2:istore_2        
		jf.e(b);
	//    2    3:aload_0         
	//    3    4:getfield        #15  <Field jf b>
	//    4    7:invokestatic    #68  <Method int jf.e(jf)>
		JVM INSTR lookupswitch 2: default 64
	//	               1: 36
	//	               2: 44;
	//    5   10:lookupswitch    2: default 64
	//	               1: 36
	//	               2: 44
		   goto _L1 _L2 _L3
_L1:
		break MISSING_BLOCK_LABEL_64;
_L2:
		i = ke.b(i);
	//    6   36:iload_1         
	//    7   37:invokestatic    #71  <Method int ke.b(int)>
	//    8   40:istore_1        
		break; /* Loop/switch isn't completed */
	//    9   41:goto            49
_L3:
		i = ke.b(i);
	//   10   44:iload_1         
	//   11   45:invokestatic    #71  <Method int ke.b(int)>
	//   12   48:istore_1        
_L4:
		jf.b(b, i);
	//   13   49:aload_0         
	//   14   50:getfield        #15  <Field jf b>
	//   15   53:iload_1         
	//   16   54:invokestatic    #74  <Method void jf.b(jf, int)>
		return;
	//   17   57:return          
		Throwable throwable;
		throwable;
	//   18   58:astore_3        
		throwable.printStackTrace();
	//   19   59:aload_3         
	//   20   60:invokevirtual   #43  <Method void Throwable.printStackTrace()>
		return;
	//   21   63:return          
		i = ((int) (byte0));
	//   22   64:iload_2         
	//   23   65:istore_1        
		  goto _L4
	//*  24   66:goto            49
	}

	public void onSignalStrengthsChanged(SignalStrength signalstrength)
	{
		int i = -113;
	//    0    0:bipush          -113
	//    1    2:istore_2        
		jf.e(b);
	//    2    3:aload_0         
	//    3    4:getfield        #15  <Field jf b>
	//    4    7:invokestatic    #68  <Method int jf.e(jf)>
		JVM INSTR lookupswitch 2: default 67
	//	               1: 36
	//	               2: 47;
	//    5   10:lookupswitch    2: default 67
	//	               1: 36
	//	               2: 47
		   goto _L1 _L2 _L3
_L1:
		break; /* Loop/switch isn't completed */
_L2:
		i = ke.b(signalstrength.getGsmSignalStrength());
	//    6   36:aload_1         
	//    7   37:invokevirtual   #81  <Method int SignalStrength.getGsmSignalStrength()>
	//    8   40:invokestatic    #71  <Method int ke.b(int)>
	//    9   43:istore_2        
		break; /* Loop/switch isn't completed */
	//   10   44:goto            52
_L3:
		i = signalstrength.getCdmaDbm();
	//   11   47:aload_1         
	//   12   48:invokevirtual   #84  <Method int SignalStrength.getCdmaDbm()>
	//   13   51:istore_2        
		jf.b(b, i);
	//   14   52:aload_0         
	//   15   53:getfield        #15  <Field jf b>
	//   16   56:iload_2         
	//   17   57:invokestatic    #74  <Method void jf.b(jf, int)>
		return;
	//   18   60:return          
		signalstrength;
	//   19   61:astore_1        
		((Throwable) (signalstrength)).printStackTrace();
	//   20   62:aload_1         
	//   21   63:invokevirtual   #43  <Method void Throwable.printStackTrace()>
		return;
	//   22   66:return          
	//*  23   67:goto            52
	}

	final jf b;

	jf$3(jf jf1)
	{
		b = jf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field jf b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void PhoneStateListener()>
	//    5    9:return          
	}
}
