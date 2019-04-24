// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.net.wifi.WifiManager;
import java.util.TimerTask;

// Referenced classes of package o:
//			jo, iz, iq

final class iw extends TimerTask
{

	iw(iz iz1)
	{
		d = iz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field iz d>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void TimerTask()>
	//    5    9:return          
	}

	public final void run()
	{
		try
		{
			if(jo.a && iq.c(d.e) != null)
	//*   0    0:getstatic       #23  <Field boolean jo.a>
	//*   1    3:ifeq            33
	//*   2    6:aload_0         
	//*   3    7:getfield        #10  <Field iz d>
	//*   4   10:getfield        #29  <Field iq iz.e>
	//*   5   13:invokestatic    #35  <Method WifiManager iq.c(iq)>
	//*   6   16:ifnull          33
				iq.c(d.e).startScan();
	//    7   19:aload_0         
	//    8   20:getfield        #10  <Field iz d>
	//    9   23:getfield        #29  <Field iq iz.e>
	//   10   26:invokestatic    #35  <Method WifiManager iq.c(iq)>
	//   11   29:invokevirtual   #41  <Method boolean WifiManager.startScan()>
	//   12   32:pop             
			return;
	//   13   33:return          
		}
		catch(Exception exception)
	//*  14   34:astore_1        
		{
			return;
	//   15   35:return          
		}
	}

	private iz d;
}
