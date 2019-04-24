// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.os.SystemClock;
import com.irobot.awsservices.c.c;
import com.irobot.core.NtpTimeCallback;
import java.net.InetAddress;
import java.util.Date;

// Referenced classes of package com.irobot.home.util:
//			aa, y, o

class aa$1
	implements Runnable
{

	public void run()
	{
		Exception exception;
		String s;
		StringBuilder stringbuilder;
		try
		{
			InetAddress inetaddress = InetAddress.getByName(a);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String a>
	//    2    4:invokestatic    #45  <Method InetAddress InetAddress.getByName(String)>
	//    3    7:astore_2        
			if(aa.a(e).a(inetaddress, b, c))
	//*   4    8:aload_0         
	//*   5    9:getfield        #24  <Field aa e>
	//*   6   12:invokestatic    #48  <Method y aa.a(aa)>
	//*   7   15:aload_2         
	//*   8   16:aload_0         
	//*   9   17:getfield        #28  <Field int b>
	//*  10   20:aload_0         
	//*  11   21:getfield        #30  <Field int c>
	//*  12   24:invokevirtual   #53  <Method boolean y.a(InetAddress, int, int)>
	//*  13   27:ifeq            136
			{
				Date date = new Date((aa.a(e).a() + SystemClock.elapsedRealtime()) - aa.a(e).b());
	//   14   30:new             #55  <Class Date>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:getfield        #24  <Field aa e>
	//   18   38:invokestatic    #48  <Method y aa.a(aa)>
	//   19   41:invokevirtual   #58  <Method long y.a()>
	//   20   44:invokestatic    #63  <Method long SystemClock.elapsedRealtime()>
	//   21   47:ladd            
	//   22   48:aload_0         
	//   23   49:getfield        #24  <Field aa e>
	//   24   52:invokestatic    #48  <Method y aa.a(aa)>
	//   25   55:invokevirtual   #65  <Method long y.b()>
	//   26   58:lsub            
	//   27   59:invokespecial   #68  <Method void Date(long)>
	//   28   62:astore_2        
				d.onNtpTimeReceived(date);
	//   29   63:aload_0         
	//   30   64:getfield        #32  <Field NtpTimeCallback d>
	//   31   67:aload_2         
	//   32   68:invokevirtual   #74  <Method void NtpTimeCallback.onNtpTimeReceived(Date)>
				int i = (int)(((new Date()).getTime() - date.getTime()) / 1000L);
	//   33   71:new             #55  <Class Date>
	//   34   74:dup             
	//   35   75:invokespecial   #75  <Method void Date()>
	//   36   78:invokevirtual   #78  <Method long Date.getTime()>
	//   37   81:aload_2         
	//   38   82:invokevirtual   #78  <Method long Date.getTime()>
	//   39   85:lsub            
	//   40   86:ldc2w           #79  <Long 1000L>
	//   41   89:ldiv            
	//   42   90:l2i             
	//   43   91:istore_1        
				com.irobot.awsservices.c.c.a().a(i);
	//   44   92:invokestatic    #85  <Method c c.a()>
	//   45   95:iload_1         
	//   46   96:invokevirtual   #88  <Method void c.a(int)>
				return;
	//   47   99:return          
			}
		}
	//*  48  100:invokestatic    #91  <Method String aa.a()>
	//*  49  103:astore_2        
	//*  50  104:new             #93  <Class StringBuilder>
	//*  51  107:dup             
	//*  52  108:invokespecial   #94  <Method void StringBuilder()>
	//*  53  111:astore_3        
	//*  54  112:aload_3         
	//*  55  113:ldc1            #96  <String "Failed to get InetAddress for ">
	//*  56  115:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//*  57  118:pop             
	//*  58  119:aload_3         
	//*  59  120:aload_0         
	//*  60  121:getfield        #26  <Field String a>
	//*  61  124:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//*  62  127:pop             
	//*  63  128:aload_2         
	//*  64  129:aload_3         
	//*  65  130:invokevirtual   #103 <Method String StringBuilder.toString()>
	//*  66  133:invokestatic    #108 <Method void o.e(String, String)>
	//*  67  136:aload_0         
	//*  68  137:getfield        #32  <Field NtpTimeCallback d>
	//*  69  140:invokevirtual   #111 <Method void NtpTimeCallback.onNtpTimeError()>
	//*  70  143:return          
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			s = aa.a();
			stringbuilder = new StringBuilder();
			stringbuilder.append("Failed to get InetAddress for ");
			stringbuilder.append(a);
			o.e(s, stringbuilder.toString());
		}
		d.onNtpTimeError();
	//*  71  144:astore_2        
	//*  72  145:goto            100
	}

	final String a;
	final int b;
	final int c;
	final NtpTimeCallback d;
	final aa e;

	aa$1(aa aa1, String s, int i, int j, NtpTimeCallback ntptimecallback)
	{
		e = aa1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field aa e>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field String a>
		b = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #28  <Field int b>
		c = j;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #30  <Field int c>
		d = ntptimecallback;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #32  <Field NtpTimeCallback d>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #35  <Method void Object()>
	//   17   31:return          
	}
}
