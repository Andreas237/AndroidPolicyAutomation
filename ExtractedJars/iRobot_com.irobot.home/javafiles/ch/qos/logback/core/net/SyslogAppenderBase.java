// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.Layout;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import java.net.UnknownHostException;

// Referenced classes of package ch.qos.logback.core.net:
//			SyslogOutputStream

public abstract class SyslogAppenderBase extends AppenderBase
{

	public SyslogAppenderBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void AppenderBase()>
		port = 514;
	//    2    4:aload_0         
	//    3    5:sipush          514
	//    4    8:putfield        #31  <Field int port>
		initialized = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #33  <Field boolean initialized>
		lazyInit = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #35  <Field boolean lazyInit>
	//   11   21:return          
	}

	private boolean connect()
	{
label0:
		{
			sos = new SyslogOutputStream(syslogHost, port);
	//    0    0:aload_0         
	//    1    1:new             #44  <Class SyslogOutputStream>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #46  <Field String syslogHost>
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field int port>
	//    7   13:invokespecial   #49  <Method void SyslogOutputStream(String, int)>
	//    8   16:putfield        #51  <Field SyslogOutputStream sos>
			int i = sos.getSendBufferSize();
	//    9   19:aload_0         
	//   10   20:getfield        #51  <Field SyslogOutputStream sos>
	//   11   23:invokevirtual   #55  <Method int SyslogOutputStream.getSendBufferSize()>
	//   12   26:istore_1        
			if(maxMessageSize == 0)
	//*  13   27:aload_0         
	//*  14   28:getfield        #57  <Field int maxMessageSize>
	//*  15   31:ifne            86
			{
				maxMessageSize = Math.min(i, 65000);
	//   16   34:aload_0         
	//   17   35:iload_1         
	//   18   36:ldc1            #8   <Int 65000>
	//   19   38:invokestatic    #63  <Method int Math.min(int, int)>
	//   20   41:putfield        #57  <Field int maxMessageSize>
				StringBuilder stringbuilder = new StringBuilder();
	//   21   44:new             #65  <Class StringBuilder>
	//   22   47:dup             
	//   23   48:invokespecial   #66  <Method void StringBuilder()>
	//   24   51:astore_2        
				stringbuilder.append("Defaulting maxMessageSize to [");
	//   25   52:aload_2         
	//   26   53:ldc1            #68  <String "Defaulting maxMessageSize to [">
	//   27   55:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
				stringbuilder.append(maxMessageSize);
	//   29   59:aload_2         
	//   30   60:aload_0         
	//   31   61:getfield        #57  <Field int maxMessageSize>
	//   32   64:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   33   67:pop             
				stringbuilder.append("]");
	//   34   68:aload_2         
	//   35   69:ldc1            #77  <String "]">
	//   36   71:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
				addInfo(stringbuilder.toString());
	//   38   75:aload_0         
	//   39   76:aload_2         
	//   40   77:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   41   80:invokevirtual   #85  <Method void addInfo(String)>
				break label0;
	//   42   83:goto            174
			}
			try
			{
				if(maxMessageSize > i)
	//*  43   86:aload_0         
	//*  44   87:getfield        #57  <Field int maxMessageSize>
	//*  45   90:iload_1         
	//*  46   91:icmple          174
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//   47   94:new             #65  <Class StringBuilder>
	//   48   97:dup             
	//   49   98:invokespecial   #66  <Method void StringBuilder()>
	//   50  101:astore_2        
					stringbuilder1.append("maxMessageSize of [");
	//   51  102:aload_2         
	//   52  103:ldc1            #87  <String "maxMessageSize of [">
	//   53  105:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   54  108:pop             
					stringbuilder1.append(maxMessageSize);
	//   55  109:aload_2         
	//   56  110:aload_0         
	//   57  111:getfield        #57  <Field int maxMessageSize>
	//   58  114:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   59  117:pop             
					stringbuilder1.append("] is larger than the system defined datagram size of [");
	//   60  118:aload_2         
	//   61  119:ldc1            #89  <String "] is larger than the system defined datagram size of [">
	//   62  121:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   63  124:pop             
					stringbuilder1.append(i);
	//   64  125:aload_2         
	//   65  126:iload_1         
	//   66  127:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   67  130:pop             
					stringbuilder1.append("].");
	//   68  131:aload_2         
	//   69  132:ldc1            #91  <String "].">
	//   70  134:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   71  137:pop             
					addWarn(stringbuilder1.toString());
	//   72  138:aload_0         
	//   73  139:aload_2         
	//   74  140:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   75  143:invokevirtual   #94  <Method void addWarn(String)>
					addWarn("This may result in dropped logs.");
	//   76  146:aload_0         
	//   77  147:ldc1            #96  <String "This may result in dropped logs.">
	//   78  149:invokevirtual   #94  <Method void addWarn(String)>
				}
			}
	//*  79  152:goto            174
	//*  80  155:astore_2        
	//*  81  156:aload_0         
	//*  82  157:ldc1            #98  <String "Failed to bind to a random datagram socket. Will try to reconnect later.">
	//*  83  159:aload_2         
	//*  84  160:invokevirtual   #101 <Method void addWarn(String, Throwable)>
	//*  85  163:goto            174
			catch(UnknownHostException unknownhostexception)
	//*  86  166:astore_2        
			{
				addError("Could not create SyslogWriter", ((Throwable) (unknownhostexception)));
	//   87  167:aload_0         
	//   88  168:ldc1            #103 <String "Could not create SyslogWriter">
	//   89  170:aload_2         
	//   90  171:invokevirtual   #106 <Method void addError(String, Throwable)>
			}
			catch(SocketException socketexception)
			{
				addWarn("Failed to bind to a random datagram socket. Will try to reconnect later.", ((Throwable) (socketexception)));
			}
		}
		return sos != null;
	//   91  174:aload_0         
	//   92  175:getfield        #51  <Field SyslogOutputStream sos>
	//   93  178:ifnull          183
	//   94  181:iconst_1        
	//   95  182:ireturn         
	//   96  183:iconst_0        
	//   97  184:ireturn         
	}

	public static int facilityStringToint(String s)
	{
		if("KERN".equalsIgnoreCase(s))
	//*   0    0:ldc1            #110 <String "KERN">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*   3    6:ifeq            11
			return 0;
	//    4    9:iconst_0        
	//    5   10:ireturn         
		if("USER".equalsIgnoreCase(s))
	//*   6   11:ldc1            #118 <String "USER">
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*   9   17:ifeq            23
			return 8;
	//   10   20:bipush          8
	//   11   22:ireturn         
		if("MAIL".equalsIgnoreCase(s))
	//*  12   23:ldc1            #120 <String "MAIL">
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*  15   29:ifeq            35
			return 16;
	//   16   32:bipush          16
	//   17   34:ireturn         
		if("DAEMON".equalsIgnoreCase(s))
	//*  18   35:ldc1            #122 <String "DAEMON">
	//*  19   37:aload_0         
	//*  20   38:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*  21   41:ifeq            47
			return 24;
	//   22   44:bipush          24
	//   23   46:ireturn         
		if("AUTH".equalsIgnoreCase(s))
	//*  24   47:ldc1            #124 <String "AUTH">
	//*  25   49:aload_0         
	//*  26   50:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*  27   53:ifeq            59
			return 32;
	//   28   56:bipush          32
	//   29   58:ireturn         
		if("SYSLOG".equalsIgnoreCase(s))
	//*  30   59:ldc1            #126 <String "SYSLOG">
	//*  31   61:aload_0         
	//*  32   62:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*  33   65:ifeq            71
			return 40;
	//   34   68:bipush          40
	//   35   70:ireturn         
		if("LPR".equalsIgnoreCase(s))
	//*  36   71:ldc1            #128 <String "LPR">
	//*  37   73:aload_0         
	//*  38   74:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*  39   77:ifeq            83
			return 48;
	//   40   80:bipush          48
	//   41   82:ireturn         
		if("NEWS".equalsIgnoreCase(s))
	//*  42   83:ldc1            #130 <String "NEWS">
	//*  43   85:aload_0         
	//*  44   86:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*  45   89:ifeq            95
			return 56;
	//   46   92:bipush          56
	//   47   94:ireturn         
		if("UUCP".equalsIgnoreCase(s))
	//*  48   95:ldc1            #132 <String "UUCP">
	//*  49   97:aload_0         
	//*  50   98:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*  51  101:ifeq            107
			return 64;
	//   52  104:bipush          64
	//   53  106:ireturn         
		if("CRON".equalsIgnoreCase(s))
	//*  54  107:ldc1            #134 <String "CRON">
	//*  55  109:aload_0         
	//*  56  110:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*  57  113:ifeq            119
			return 72;
	//   58  116:bipush          72
	//   59  118:ireturn         
		if("AUTHPRIV".equalsIgnoreCase(s))
	//*  60  119:ldc1            #136 <String "AUTHPRIV">
	//*  61  121:aload_0         
	//*  62  122:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*  63  125:ifeq            131
			return 80;
	//   64  128:bipush          80
	//   65  130:ireturn         
		if("FTP".equalsIgnoreCase(s))
	//*  66  131:ldc1            #138 <String "FTP">
	//*  67  133:aload_0         
	//*  68  134:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*  69  137:ifeq            143
			return 88;
	//   70  140:bipush          88
	//   71  142:ireturn         
		if("NTP".equalsIgnoreCase(s))
	//*  72  143:ldc1            #140 <String "NTP">
	//*  73  145:aload_0         
	//*  74  146:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*  75  149:ifeq            155
			return 96;
	//   76  152:bipush          96
	//   77  154:ireturn         
		if("AUDIT".equalsIgnoreCase(s))
	//*  78  155:ldc1            #142 <String "AUDIT">
	//*  79  157:aload_0         
	//*  80  158:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*  81  161:ifeq            167
			return 104;
	//   82  164:bipush          104
	//   83  166:ireturn         
		if("ALERT".equalsIgnoreCase(s))
	//*  84  167:ldc1            #144 <String "ALERT">
	//*  85  169:aload_0         
	//*  86  170:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*  87  173:ifeq            179
			return 112;
	//   88  176:bipush          112
	//   89  178:ireturn         
		if("CLOCK".equalsIgnoreCase(s))
	//*  90  179:ldc1            #146 <String "CLOCK">
	//*  91  181:aload_0         
	//*  92  182:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*  93  185:ifeq            191
			return 120;
	//   94  188:bipush          120
	//   95  190:ireturn         
		if("LOCAL0".equalsIgnoreCase(s))
	//*  96  191:ldc1            #148 <String "LOCAL0">
	//*  97  193:aload_0         
	//*  98  194:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//*  99  197:ifeq            204
			return 128;
	//  100  200:sipush          128
	//  101  203:ireturn         
		if("LOCAL1".equalsIgnoreCase(s))
	//* 102  204:ldc1            #150 <String "LOCAL1">
	//* 103  206:aload_0         
	//* 104  207:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//* 105  210:ifeq            217
			return 136;
	//  106  213:sipush          136
	//  107  216:ireturn         
		if("LOCAL2".equalsIgnoreCase(s))
	//* 108  217:ldc1            #152 <String "LOCAL2">
	//* 109  219:aload_0         
	//* 110  220:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//* 111  223:ifeq            230
			return 144;
	//  112  226:sipush          144
	//  113  229:ireturn         
		if("LOCAL3".equalsIgnoreCase(s))
	//* 114  230:ldc1            #154 <String "LOCAL3">
	//* 115  232:aload_0         
	//* 116  233:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//* 117  236:ifeq            243
			return 152;
	//  118  239:sipush          152
	//  119  242:ireturn         
		if("LOCAL4".equalsIgnoreCase(s))
	//* 120  243:ldc1            #156 <String "LOCAL4">
	//* 121  245:aload_0         
	//* 122  246:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//* 123  249:ifeq            256
			return 160;
	//  124  252:sipush          160
	//  125  255:ireturn         
		if("LOCAL5".equalsIgnoreCase(s))
	//* 126  256:ldc1            #158 <String "LOCAL5">
	//* 127  258:aload_0         
	//* 128  259:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//* 129  262:ifeq            269
			return 168;
	//  130  265:sipush          168
	//  131  268:ireturn         
		if("LOCAL6".equalsIgnoreCase(s))
	//* 132  269:ldc1            #160 <String "LOCAL6">
	//* 133  271:aload_0         
	//* 134  272:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//* 135  275:ifeq            282
			return 176;
	//  136  278:sipush          176
	//  137  281:ireturn         
		if("LOCAL7".equalsIgnoreCase(s))
	//* 138  282:ldc1            #162 <String "LOCAL7">
	//* 139  284:aload_0         
	//* 140  285:invokevirtual   #116 <Method boolean String.equalsIgnoreCase(String)>
	//* 141  288:ifeq            295
		{
			return 184;
	//  142  291:sipush          184
	//  143  294:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  144  295:new             #65  <Class StringBuilder>
	//  145  298:dup             
	//  146  299:invokespecial   #66  <Method void StringBuilder()>
	//  147  302:astore_1        
			stringbuilder.append(s);
	//  148  303:aload_1         
	//  149  304:aload_0         
	//  150  305:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//  151  308:pop             
			stringbuilder.append(" is not a valid syslog facility string");
	//  152  309:aload_1         
	//  153  310:ldc1            #164 <String " is not a valid syslog facility string">
	//  154  312:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//  155  315:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//  156  316:new             #166 <Class IllegalArgumentException>
	//  157  319:dup             
	//  158  320:aload_1         
	//  159  321:invokevirtual   #81  <Method String StringBuilder.toString()>
	//  160  324:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//  161  327:athrow          
		}
	}

	protected void append(Object obj)
	{
		if(!isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #174 <Method boolean isStarted()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(!initialized && lazyInit)
	//*   4    8:aload_0         
	//*   5    9:getfield        #33  <Field boolean initialized>
	//*   6   12:ifne            32
	//*   7   15:aload_0         
	//*   8   16:getfield        #35  <Field boolean lazyInit>
	//*   9   19:ifeq            32
		{
			initialized = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #33  <Field boolean initialized>
			connect();
	//   13   27:aload_0         
	//   14   28:invokespecial   #176 <Method boolean connect()>
	//   15   31:pop             
		}
		if(sos == null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #51  <Field SyslogOutputStream sos>
	//*  18   36:ifnonnull       40
			return;
	//   19   39:return          
		String s = layout.doLayout(obj);
	//   20   40:aload_0         
	//   21   41:getfield        #178 <Field Layout layout>
	//   22   44:aload_1         
	//   23   45:invokeinterface #184 <Method String Layout.doLayout(Object)>
	//   24   50:astore_3        
		if(s == null)
	//*  25   51:aload_3         
	//*  26   52:ifnonnull       56
			return;
	//   27   55:return          
		Object obj1 = ((Object) (s));
	//   28   56:aload_3         
	//   29   57:astore_2        
		try
		{
			if(s.length() > maxMessageSize)
	//*  30   58:aload_3         
	//*  31   59:invokevirtual   #187 <Method int String.length()>
	//*  32   62:aload_0         
	//*  33   63:getfield        #57  <Field int maxMessageSize>
	//*  34   66:icmple          79
				obj1 = ((Object) (s.substring(0, maxMessageSize)));
	//   35   69:aload_3         
	//   36   70:iconst_0        
	//   37   71:aload_0         
	//   38   72:getfield        #57  <Field int maxMessageSize>
	//   39   75:invokevirtual   #191 <Method String String.substring(int, int)>
	//   40   78:astore_2        
			sos.write(((String) (obj1)).getBytes());
	//   41   79:aload_0         
	//   42   80:getfield        #51  <Field SyslogOutputStream sos>
	//   43   83:aload_2         
	//   44   84:invokevirtual   #195 <Method byte[] String.getBytes()>
	//   45   87:invokevirtual   #199 <Method void SyslogOutputStream.write(byte[])>
			sos.flush();
	//   46   90:aload_0         
	//   47   91:getfield        #51  <Field SyslogOutputStream sos>
	//   48   94:invokevirtual   #202 <Method void SyslogOutputStream.flush()>
			postProcess(obj, ((OutputStream) (sos)));
	//   49   97:aload_0         
	//   50   98:aload_1         
	//   51   99:aload_0         
	//   52  100:getfield        #51  <Field SyslogOutputStream sos>
	//   53  103:invokevirtual   #206 <Method void postProcess(Object, OutputStream)>
			return;
	//   54  106:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  55  107:astore_1        
		{
			obj1 = ((Object) (new StringBuilder()));
	//   56  108:new             #65  <Class StringBuilder>
	//   57  111:dup             
	//   58  112:invokespecial   #66  <Method void StringBuilder()>
	//   59  115:astore_2        
		}
		((StringBuilder) (obj1)).append("Failed to send diagram to ");
	//   60  116:aload_2         
	//   61  117:ldc1            #208 <String "Failed to send diagram to ">
	//   62  119:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   63  122:pop             
		((StringBuilder) (obj1)).append(syslogHost);
	//   64  123:aload_2         
	//   65  124:aload_0         
	//   66  125:getfield        #46  <Field String syslogHost>
	//   67  128:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   68  131:pop             
		addError(((StringBuilder) (obj1)).toString(), ((Throwable) (obj)));
	//   69  132:aload_0         
	//   70  133:aload_2         
	//   71  134:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   72  137:aload_1         
	//   73  138:invokevirtual   #106 <Method void addError(String, Throwable)>
		return;
	//   74  141:return          
	}

	public abstract Layout buildLayout();

	public String getFacility()
	{
		return facilityStr;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field String facilityStr>
	//    2    4:areturn         
	}

	public Layout getLayout()
	{
		return layout;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field Layout layout>
	//    2    4:areturn         
	}

	public boolean getLazy()
	{
		return lazyInit;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean lazyInit>
	//    2    4:ireturn         
	}

	public int getMaxMessageSize()
	{
		return maxMessageSize;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int maxMessageSize>
	//    2    4:ireturn         
	}

	public int getPort()
	{
		return port;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int port>
	//    2    4:ireturn         
	}

	public abstract int getSeverityForEvent(Object obj);

	public String getSuffixPattern()
	{
		return suffixPattern;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field String suffixPattern>
	//    2    4:areturn         
	}

	public String getSyslogHost()
	{
		return syslogHost;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String syslogHost>
	//    2    4:areturn         
	}

	protected void postProcess(Object obj, OutputStream outputstream)
	{
	//    0    0:return          
	}

	public void setFacility(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(s != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          11
			s1 = s.trim();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #230 <Method String String.trim()>
	//    6   10:astore_2        
		facilityStr = s1;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #215 <Field String facilityStr>
	//   10   16:return          
	}

	public void setLayout(Layout layout1)
	{
		addWarn("The layout of a SyslogAppender cannot be set directly. See also http://logback.qos.ch/codes.html#syslog_layout");
	//    0    0:aload_0         
	//    1    1:ldc1            #234 <String "The layout of a SyslogAppender cannot be set directly. See also http://logback.qos.ch/codes.html#syslog_layout">
	//    2    3:invokevirtual   #94  <Method void addWarn(String)>
	//    3    6:return          
	}

	public void setLazy(boolean flag)
	{
		lazyInit = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field boolean lazyInit>
	//    3    5:return          
	}

	public void setMaxMessageSize(int i)
	{
		maxMessageSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field int maxMessageSize>
	//    3    5:return          
	}

	public void setPort(int i)
	{
		port = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int port>
	//    3    5:return          
	}

	public void setSuffixPattern(String s)
	{
		suffixPattern = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #225 <Field String suffixPattern>
	//    3    5:return          
	}

	public void setSyslogHost(String s)
	{
		syslogHost = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field String syslogHost>
	//    3    5:return          
	}

	public void start()
	{
		int i;
		if(facilityStr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #215 <Field String facilityStr>
	//*   2    4:ifnonnull       18
		{
			addError("The Facility option is mandatory");
	//    3    7:aload_0         
	//    4    8:ldc1            #245 <String "The Facility option is mandatory">
	//    5   10:invokevirtual   #247 <Method void addError(String)>
			i = 1;
	//    6   13:iconst_1        
	//    7   14:istore_1        
		} else
	//*   8   15:goto            20
		{
			i = 0;
	//    9   18:iconst_0        
	//   10   19:istore_1        
		}
		int j = i;
	//   11   20:iload_1         
	//   12   21:istore_2        
		if(!lazyInit)
	//*  13   22:aload_0         
	//*  14   23:getfield        #35  <Field boolean lazyInit>
	//*  15   26:ifne            42
		{
			j = i;
	//   16   29:iload_1         
	//   17   30:istore_2        
			if(!connect())
	//*  18   31:aload_0         
	//*  19   32:invokespecial   #176 <Method boolean connect()>
	//*  20   35:ifne            42
				j = i + 1;
	//   21   38:iload_1         
	//   22   39:iconst_1        
	//   23   40:iadd            
	//   24   41:istore_2        
		}
		if(layout == null)
	//*  25   42:aload_0         
	//*  26   43:getfield        #178 <Field Layout layout>
	//*  27   46:ifnonnull       57
			layout = buildLayout();
	//   28   49:aload_0         
	//   29   50:aload_0         
	//   30   51:invokevirtual   #249 <Method Layout buildLayout()>
	//   31   54:putfield        #178 <Field Layout layout>
		if(j == 0)
	//*  32   57:iload_2         
	//*  33   58:ifne            65
			super.start();
	//   34   61:aload_0         
	//   35   62:invokespecial   #251 <Method void AppenderBase.start()>
	//   36   65:return          
	}

	public void stop()
	{
		sos.close();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field SyslogOutputStream sos>
	//    2    4:invokevirtual   #255 <Method void SyslogOutputStream.close()>
		super.stop();
	//    3    7:aload_0         
	//    4    8:invokespecial   #257 <Method void AppenderBase.stop()>
	//    5   11:return          
	}

	static final int MAX_MESSAGE_SIZE_LIMIT = 65000;
	static final String SYSLOG_LAYOUT_URL = "http://logback.qos.ch/codes.html#syslog_layout";
	String facilityStr;
	boolean initialized;
	Layout layout;
	private boolean lazyInit;
	int maxMessageSize;
	int port;
	protected SyslogOutputStream sos;
	protected String suffixPattern;
	String syslogHost;
}
