// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import com.irobot.core.WebServiceFirmwareDataCallback;

// Referenced classes of package com.irobot.home.util:
//			d, o

class d$a$1
	implements Runnable
{

	public void run()
	{
		if(a != null && a.length != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field byte[] a>
	//*   2    4:ifnull          41
	//*   3    7:aload_0         
	//*   4    8:getfield        #22  <Field byte[] a>
	//*   5   11:arraylength     
	//*   6   12:ifne            18
	//*   7   15:goto            41
		{
			o.b(d.a(), "Download successful.");
	//    8   18:invokestatic    #30  <Method String d.a()>
	//    9   21:ldc1            #32  <String "Download successful.">
	//   10   23:invokestatic    #37  <Method void o.b(String, String)>
			d.a.a(b).onFirmwareDataReceived(a);
	//   11   26:aload_0         
	//   12   27:getfield        #20  <Field d$a b>
	//   13   30:invokestatic    #40  <Method WebServiceFirmwareDataCallback d$a.a(d$a)>
	//   14   33:aload_0         
	//   15   34:getfield        #22  <Field byte[] a>
	//   16   37:invokevirtual   #45  <Method void WebServiceFirmwareDataCallback.onFirmwareDataReceived(byte[])>
			return;
	//   17   40:return          
		} else
		{
			o.b(d.a(), "Download failed.");
	//   18   41:invokestatic    #30  <Method String d.a()>
	//   19   44:ldc1            #47  <String "Download failed.">
	//   20   46:invokestatic    #37  <Method void o.b(String, String)>
			d.a.a(b).onFirmwareDataFailure();
	//   21   49:aload_0         
	//   22   50:getfield        #20  <Field d$a b>
	//   23   53:invokestatic    #40  <Method WebServiceFirmwareDataCallback d$a.a(d$a)>
	//   24   56:invokevirtual   #50  <Method void WebServiceFirmwareDataCallback.onFirmwareDataFailure()>
			return;
	//   25   59:return          
		}
	}

	final byte a[];
	final d.a b;

	d$a$1(d.a a1, byte abyte0[])
	{
		b = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field d$a b>
		a = abyte0;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field byte[] a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
