// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.Looper;
import java.util.Timer;

// Referenced classes of package o:
//			iq, ir, iy

final class it extends Thread
{

	it(iq iq1, String s)
	{
		c = iq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field iq c>
		super(s);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void Thread(String)>
	//    6   10:return          
	}

	public final void run()
	{
		try
		{
			Looper.prepare();
	//    0    0:invokestatic    #23  <Method void Looper.prepare()>
			iq.d(c, Looper.myLooper());
	//    1    3:aload_0         
	//    2    4:getfield        #10  <Field iq c>
	//    3    7:invokestatic    #27  <Method Looper Looper.myLooper()>
	//    4   10:invokestatic    #33  <Method Looper iq.d(iq, Looper)>
	//    5   13:pop             
			iq.a(c, new Timer());
	//    6   14:aload_0         
	//    7   15:getfield        #10  <Field iq c>
	//    8   18:new             #35  <Class Timer>
	//    9   21:dup             
	//   10   22:invokespecial   #37  <Method void Timer()>
	//   11   25:invokestatic    #41  <Method Timer iq.a(iq, Timer)>
	//   12   28:pop             
			iq.a(c, new ir(c, (byte)0));
	//   13   29:aload_0         
	//   14   30:getfield        #10  <Field iq c>
	//   15   33:new             #43  <Class ir>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:getfield        #10  <Field iq c>
	//   19   41:iconst_0        
	//   20   42:invokespecial   #46  <Method void ir(iq, byte)>
	//   21   45:invokestatic    #49  <Method ir iq.a(iq, ir)>
	//   22   48:pop             
			iq.a(c, ((android.telephony.PhoneStateListener) (iq.e(c))));
	//   23   49:aload_0         
	//   24   50:getfield        #10  <Field iq c>
	//   25   53:aload_0         
	//   26   54:getfield        #10  <Field iq c>
	//   27   57:invokestatic    #53  <Method ir iq.e(iq)>
	//   28   60:invokestatic    #56  <Method void iq.a(iq, android.telephony.PhoneStateListener)>
			iq.c(c, new iy(c, (byte)0));
	//   29   63:aload_0         
	//   30   64:getfield        #10  <Field iq c>
	//   31   67:new             #58  <Class iy>
	//   32   70:dup             
	//   33   71:aload_0         
	//   34   72:getfield        #10  <Field iq c>
	//   35   75:iconst_0        
	//   36   76:invokespecial   #59  <Method void iy(iq, byte)>
	//   37   79:invokestatic    #62  <Method iy iq.c(iq, iy)>
	//   38   82:pop             
		}
	//*  39   83:aload_0         
	//*  40   84:getfield        #10  <Field iq c>
	//*  41   87:aload_0         
	//*  42   88:getfield        #10  <Field iq c>
	//*  43   91:invokestatic    #66  <Method iy iq.b(iq)>
	//*  44   94:invokestatic    #69  <Method void iq.d(iq, android.location.GpsStatus$NmeaListener)>
	//*  45   97:invokestatic    #72  <Method void Looper.loop()>
	//*  46  100:return          
		catch(Exception exception)
	//*  47  101:astore_1        
		{
			return;
	//   48  102:return          
		}
		try
		{
			iq.d(c, ((android.location.GpsStatus.NmeaListener) (iq.b(c))));
		}
		catch(Exception exception1) { }
	//   49  103:astore_1        
		Looper.loop();
		return;
	//*  50  104:goto            97
	}

	private iq c;
}
