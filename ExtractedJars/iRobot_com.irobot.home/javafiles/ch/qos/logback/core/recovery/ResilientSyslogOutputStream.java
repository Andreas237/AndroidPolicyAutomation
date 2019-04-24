// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.recovery;

import ch.qos.logback.core.net.SyslogOutputStream;
import java.io.OutputStream;

// Referenced classes of package ch.qos.logback.core.recovery:
//			ResilientOutputStreamBase

public class ResilientSyslogOutputStream extends ResilientOutputStreamBase
{

	public ResilientSyslogOutputStream(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ResilientOutputStreamBase()>
		syslogHost = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String syslogHost>
		port = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #17  <Field int port>
		super.os = ((OutputStream) (new SyslogOutputStream(s, i)));
	//    8   14:aload_0         
	//    9   15:new             #19  <Class SyslogOutputStream>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:iload_2         
	//   13   21:invokespecial   #21  <Method void SyslogOutputStream(String, int)>
	//   14   24:putfield        #25  <Field OutputStream ResilientOutputStreamBase.os>
		presumedClean = true;
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:putfield        #29  <Field boolean presumedClean>
	//   18   32:return          
	}

	String getDescription()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("syslog [");
	//    4    8:aload_1         
	//    5    9:ldc1            #37  <String "syslog [">
	//    6   11:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(syslogHost);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #15  <Field String syslogHost>
	//   11   20:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(":");
	//   13   24:aload_1         
	//   14   25:ldc1            #43  <String ":">
	//   15   27:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(port);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #17  <Field int port>
	//   20   36:invokevirtual   #46  <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append("]");
	//   22   40:aload_1         
	//   23   41:ldc1            #48  <String "]">
	//   24   43:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	OutputStream openNewOutputStream()
	{
		return ((OutputStream) (new SyslogOutputStream(syslogHost, port)));
	//    0    0:new             #19  <Class SyslogOutputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field String syslogHost>
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field int port>
	//    6   12:invokespecial   #21  <Method void SyslogOutputStream(String, int)>
	//    7   15:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("c.q.l.c.recovery.ResilientSyslogOutputStream@");
	//    4    8:aload_1         
	//    5    9:ldc1            #55  <String "c.q.l.c.recovery.ResilientSyslogOutputStream@">
	//    6   11:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(System.identityHashCode(((Object) (this))));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokestatic    #61  <Method int System.identityHashCode(Object)>
	//   11   20:invokevirtual   #46  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		return stringbuilder.toString();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   15   28:areturn         
	}

	int port;
	String syslogHost;
}
