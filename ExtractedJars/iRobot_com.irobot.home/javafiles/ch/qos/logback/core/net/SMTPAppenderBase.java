// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net;

import ch.qos.logback.core.*;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.helpers.CyclicBuffer;
import ch.qos.logback.core.pattern.PatternLayoutBase;
import ch.qos.logback.core.sift.DefaultDiscriminator;
import ch.qos.logback.core.sift.Discriminator;
import ch.qos.logback.core.spi.CyclicBufferTracker;
import ch.qos.logback.core.util.ContentTypeUtil;
import ch.qos.logback.core.util.OptionHelper;
import java.util.*;
import java.util.concurrent.ExecutorService;
import javax.mail.*;
import javax.mail.internet.*;

// Referenced classes of package ch.qos.logback.core.net:
//			LoginAuthenticator

public abstract class SMTPAppenderBase extends AppenderBase
{
	class SenderRunnable
		implements Runnable
	{

		public void run()
		{
			sendBuffer(cyclicBuffer, e);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field SMTPAppenderBase this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field CyclicBuffer cyclicBuffer>
		//    4    8:aload_0         
		//    5    9:getfield        #28  <Field Object e>
		//    6   12:invokevirtual   #36  <Method void SMTPAppenderBase.sendBuffer(CyclicBuffer, Object)>
		//    7   15:return          
		}

		final CyclicBuffer cyclicBuffer;
		final Object e;
		final SMTPAppenderBase this$0;

		SenderRunnable(CyclicBuffer cyclicbuffer, Object obj)
		{
			this$0 = SMTPAppenderBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field SMTPAppenderBase this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			cyclicBuffer = cyclicbuffer;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field CyclicBuffer cyclicBuffer>
			e = obj;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field Object e>
		//   11   19:return          
		}
	}


	public SMTPAppenderBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void AppenderBase()>
		lastTrackerStatusPrint = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #60  <Field long lastTrackerStatusPrint>
		delayBetweenStatusMessages = 0x493e0;
	//    5    9:aload_0         
	//    6   10:ldc1            #61  <Int 0x493e0>
	//    7   12:putfield        #63  <Field int delayBetweenStatusMessages>
		toPatternLayoutList = ((List) (new ArrayList()));
	//    8   15:aload_0         
	//    9   16:new             #65  <Class ArrayList>
	//   10   19:dup             
	//   11   20:invokespecial   #66  <Method void ArrayList()>
	//   12   23:putfield        #68  <Field List toPatternLayoutList>
		subjectStr = null;
	//   13   26:aload_0         
	//   14   27:aconst_null     
	//   15   28:putfield        #70  <Field String subjectStr>
		smtpPort = 25;
	//   16   31:aload_0         
	//   17   32:bipush          25
	//   18   34:putfield        #72  <Field int smtpPort>
		starttls = false;
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:putfield        #74  <Field boolean starttls>
		ssl = false;
	//   22   42:aload_0         
	//   23   43:iconst_0        
	//   24   44:putfield        #76  <Field boolean ssl>
		asynchronousSending = true;
	//   25   47:aload_0         
	//   26   48:iconst_1        
	//   27   49:putfield        #78  <Field boolean asynchronousSending>
		charsetEncoding = "UTF-8";
	//   28   52:aload_0         
	//   29   53:ldc1            #80  <String "UTF-8">
	//   30   55:putfield        #82  <Field String charsetEncoding>
		discriminator = ((Discriminator) (new DefaultDiscriminator()));
	//   31   58:aload_0         
	//   32   59:new             #84  <Class DefaultDiscriminator>
	//   33   62:dup             
	//   34   63:invokespecial   #85  <Method void DefaultDiscriminator()>
	//   35   66:putfield        #87  <Field Discriminator discriminator>
		errorCount = 0;
	//   36   69:aload_0         
	//   37   70:iconst_0        
	//   38   71:putfield        #89  <Field int errorCount>
	//   39   74:return          
	}

	private Session buildSessionFromProperties()
	{
		Properties properties = new Properties(OptionHelper.getSystemProperties());
	//    0    0:new             #93  <Class Properties>
	//    1    3:dup             
	//    2    4:invokestatic    #99  <Method Properties OptionHelper.getSystemProperties()>
	//    3    7:invokespecial   #102 <Method void Properties(Properties)>
	//    4   10:astore_2        
		if(smtpHost != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #104 <Field String smtpHost>
	//*   7   15:ifnull          29
			properties.put("mail.smtp.host", ((Object) (smtpHost)));
	//    8   18:aload_2         
	//    9   19:ldc1            #106 <String "mail.smtp.host">
	//   10   21:aload_0         
	//   11   22:getfield        #104 <Field String smtpHost>
	//   12   25:invokevirtual   #110 <Method Object Properties.put(Object, Object)>
	//   13   28:pop             
		properties.put("mail.smtp.port", ((Object) (Integer.toString(smtpPort))));
	//   14   29:aload_2         
	//   15   30:ldc1            #112 <String "mail.smtp.port">
	//   16   32:aload_0         
	//   17   33:getfield        #72  <Field int smtpPort>
	//   18   36:invokestatic    #118 <Method String Integer.toString(int)>
	//   19   39:invokevirtual   #110 <Method Object Properties.put(Object, Object)>
	//   20   42:pop             
		if(localhost != null)
	//*  21   43:aload_0         
	//*  22   44:getfield        #120 <Field String localhost>
	//*  23   47:ifnull          61
			properties.put("mail.smtp.localhost", ((Object) (localhost)));
	//   24   50:aload_2         
	//   25   51:ldc1            #122 <String "mail.smtp.localhost">
	//   26   53:aload_0         
	//   27   54:getfield        #120 <Field String localhost>
	//   28   57:invokevirtual   #110 <Method Object Properties.put(Object, Object)>
	//   29   60:pop             
		LoginAuthenticator loginauthenticator = null;
	//   30   61:aconst_null     
	//   31   62:astore_1        
		if(username != null)
	//*  32   63:aload_0         
	//*  33   64:getfield        #124 <Field String username>
	//*  34   67:ifnull          95
		{
			loginauthenticator = new LoginAuthenticator(username, password);
	//   35   70:new             #126 <Class LoginAuthenticator>
	//   36   73:dup             
	//   37   74:aload_0         
	//   38   75:getfield        #124 <Field String username>
	//   39   78:aload_0         
	//   40   79:getfield        #128 <Field String password>
	//   41   82:invokespecial   #131 <Method void LoginAuthenticator(String, String)>
	//   42   85:astore_1        
			properties.put("mail.smtp.auth", "true");
	//   43   86:aload_2         
	//   44   87:ldc1            #133 <String "mail.smtp.auth">
	//   45   89:ldc1            #135 <String "true">
	//   46   91:invokevirtual   #110 <Method Object Properties.put(Object, Object)>
	//   47   94:pop             
		}
		if(isSTARTTLS() && isSSL())
	//*  48   95:aload_0         
	//*  49   96:invokevirtual   #139 <Method boolean isSTARTTLS()>
	//*  50   99:ifeq            118
	//*  51  102:aload_0         
	//*  52  103:invokevirtual   #142 <Method boolean isSSL()>
	//*  53  106:ifeq            118
		{
			addError("Both SSL and StartTLS cannot be enabled simultaneously");
	//   54  109:aload_0         
	//   55  110:ldc1            #144 <String "Both SSL and StartTLS cannot be enabled simultaneously">
	//   56  112:invokevirtual   #148 <Method void addError(String)>
		} else
	//*  57  115:goto            173
		{
			if(isSTARTTLS())
	//*  58  118:aload_0         
	//*  59  119:invokevirtual   #139 <Method boolean isSTARTTLS()>
	//*  60  122:ifeq            134
				properties.put("mail.smtp.starttls.enable", "true");
	//   61  125:aload_2         
	//   62  126:ldc1            #150 <String "mail.smtp.starttls.enable">
	//   63  128:ldc1            #135 <String "true">
	//   64  130:invokevirtual   #110 <Method Object Properties.put(Object, Object)>
	//   65  133:pop             
			if(isSSL())
	//*  66  134:aload_0         
	//*  67  135:invokevirtual   #142 <Method boolean isSSL()>
	//*  68  138:ifeq            173
			{
				properties.put("mail.smtp.socketFactory.port", ((Object) (Integer.toString(smtpPort))));
	//   69  141:aload_2         
	//   70  142:ldc1            #152 <String "mail.smtp.socketFactory.port">
	//   71  144:aload_0         
	//   72  145:getfield        #72  <Field int smtpPort>
	//   73  148:invokestatic    #118 <Method String Integer.toString(int)>
	//   74  151:invokevirtual   #110 <Method Object Properties.put(Object, Object)>
	//   75  154:pop             
				properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	//   76  155:aload_2         
	//   77  156:ldc1            #154 <String "mail.smtp.socketFactory.class">
	//   78  158:ldc1            #156 <String "javax.net.ssl.SSLSocketFactory">
	//   79  160:invokevirtual   #110 <Method Object Properties.put(Object, Object)>
	//   80  163:pop             
				properties.put("mail.smtp.socketFactory.fallback", "true");
	//   81  164:aload_2         
	//   82  165:ldc1            #158 <String "mail.smtp.socketFactory.fallback">
	//   83  167:ldc1            #135 <String "true">
	//   84  169:invokevirtual   #110 <Method Object Properties.put(Object, Object)>
	//   85  172:pop             
			}
		}
		return Session.getInstance(properties, ((javax.mail.Authenticator) (loginauthenticator)));
	//   86  173:aload_2         
	//   87  174:aload_1         
	//   88  175:invokestatic    #164 <Method Session Session.getInstance(Properties, javax.mail.Authenticator)>
	//   89  178:areturn         
	}

	private List parseAddress(Object obj)
	{
		int i;
		int j;
		ArrayList arraylist;
		j = toPatternLayoutList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field List toPatternLayoutList>
	//    2    4:invokeinterface #174 <Method int List.size()>
	//    3    9:istore_3        
		arraylist = new ArrayList();
	//    4   10:new             #65  <Class ArrayList>
	//    5   13:dup             
	//    6   14:invokespecial   #66  <Method void ArrayList()>
	//    7   17:astore          4
		i = 0;
	//    8   19:iconst_0        
	//    9   20:istore_2        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   10   21:iload_2         
	//   11   22:iload_3         
	//   12   23:icmpge          154
		String s = ((PatternLayoutBase)toPatternLayoutList.get(i)).doLayout(obj);
	//   13   26:aload_0         
	//   14   27:getfield        #68  <Field List toPatternLayoutList>
	//   15   30:iload_2         
	//   16   31:invokeinterface #178 <Method Object List.get(int)>
	//   17   36:checkcast       #180 <Class PatternLayoutBase>
	//   18   39:aload_1         
	//   19   40:invokevirtual   #184 <Method String PatternLayoutBase.doLayout(Object)>
	//   20   43:astore          5
		if(s == null)
			break MISSING_BLOCK_LABEL_78;
	//   21   45:aload           5
	//   22   47:ifnull          78
		if(s.length() == 0)
	//*  23   50:aload           5
	//*  24   52:invokevirtual   #189 <Method int String.length()>
	//*  25   55:ifne            61
			break MISSING_BLOCK_LABEL_78;
	//   26   58:goto            78
		((List) (arraylist)).addAll(((java.util.Collection) (Arrays.asList(((Object []) (InternetAddress.parse(s, true)))))));
	//   27   61:aload           4
	//   28   63:aload           5
	//   29   65:iconst_1        
	//   30   66:invokestatic    #193 <Method InternetAddress[] InternetAddress.parse(String, boolean)>
	//   31   69:invokestatic    #199 <Method List Arrays.asList(Object[])>
	//   32   72:invokeinterface #203 <Method boolean List.addAll(java.util.Collection)>
	//   33   77:pop             
		i++;
	//   34   78:iload_2         
	//   35   79:iconst_1        
	//   36   80:iadd            
	//   37   81:istore_2        
		if(true) goto _L2; else goto _L1
	//   38   82:goto            21
		AddressException addressexception;
		addressexception;
	//   39   85:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   40   87:new             #205 <Class StringBuilder>
	//   41   90:dup             
	//   42   91:invokespecial   #206 <Method void StringBuilder()>
	//   43   94:astore          6
		stringbuilder.append("Could not parse email address for [");
	//   44   96:aload           6
	//   45   98:ldc1            #208 <String "Could not parse email address for [">
	//   46  100:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   47  103:pop             
		stringbuilder.append(toPatternLayoutList.get(i));
	//   48  104:aload           6
	//   49  106:aload_0         
	//   50  107:getfield        #68  <Field List toPatternLayoutList>
	//   51  110:iload_2         
	//   52  111:invokeinterface #178 <Method Object List.get(int)>
	//   53  116:invokevirtual   #215 <Method StringBuilder StringBuilder.append(Object)>
	//   54  119:pop             
		stringbuilder.append("] for event [");
	//   55  120:aload           6
	//   56  122:ldc1            #217 <String "] for event [">
	//   57  124:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   58  127:pop             
		stringbuilder.append(obj);
	//   59  128:aload           6
	//   60  130:aload_1         
	//   61  131:invokevirtual   #215 <Method StringBuilder StringBuilder.append(Object)>
	//   62  134:pop             
		stringbuilder.append("]");
	//   63  135:aload           6
	//   64  137:ldc1            #219 <String "]">
	//   65  139:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   66  142:pop             
		addError(stringbuilder.toString(), ((Throwable) (addressexception)));
	//   67  143:aload_0         
	//   68  144:aload           6
	//   69  146:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   70  149:aload           5
	//   71  151:invokevirtual   #225 <Method void addError(String, Throwable)>
_L1:
		return ((List) (arraylist));
	//   72  154:aload           4
	//   73  156:areturn         
	}

	public void addTo(String s)
	{
		if(s != null && s.length() != 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          47
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #189 <Method int String.length()>
	//*   4    8:ifne            14
	//*   5   11:goto            47
		{
			s = ((String) (makeNewToPatternLayout(s.trim())));
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #231 <Method String String.trim()>
	//    9   19:invokevirtual   #235 <Method PatternLayoutBase makeNewToPatternLayout(String)>
	//   10   22:astore_1        
			((PatternLayoutBase) (s)).setContext(context);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #239 <Field Context context>
	//   14   28:invokevirtual   #243 <Method void PatternLayoutBase.setContext(Context)>
			((PatternLayoutBase) (s)).start();
	//   15   31:aload_1         
	//   16   32:invokevirtual   #246 <Method void PatternLayoutBase.start()>
			toPatternLayoutList.add(((Object) (s)));
	//   17   35:aload_0         
	//   18   36:getfield        #68  <Field List toPatternLayoutList>
	//   19   39:aload_1         
	//   20   40:invokeinterface #250 <Method boolean List.add(Object)>
	//   21   45:pop             
			return;
	//   22   46:return          
		} else
		{
			throw new IllegalArgumentException("Null or empty <to> property");
	//   23   47:new             #252 <Class IllegalArgumentException>
	//   24   50:dup             
	//   25   51:ldc1            #254 <String "Null or empty <to> property">
	//   26   53:invokespecial   #256 <Method void IllegalArgumentException(String)>
	//   27   56:athrow          
		}
	}

	protected void append(Object obj)
	{
		long l;
		String s;
		CyclicBuffer cyclicbuffer;
		if(!checkEntryConditions())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #262 <Method boolean checkEntryConditions()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		s = discriminator.getDiscriminatingValue(obj);
	//    4    8:aload_0         
	//    5    9:getfield        #87  <Field Discriminator discriminator>
	//    6   12:aload_1         
	//    7   13:invokeinterface #267 <Method String Discriminator.getDiscriminatingValue(Object)>
	//    8   18:astore          4
		l = System.currentTimeMillis();
	//    9   20:invokestatic    #273 <Method long System.currentTimeMillis()>
	//   10   23:lstore_2        
		cyclicbuffer = (CyclicBuffer)cbTracker.getOrCreate(s, l);
	//   11   24:aload_0         
	//   12   25:getfield        #275 <Field CyclicBufferTracker cbTracker>
	//   13   28:aload           4
	//   14   30:lload_2         
	//   15   31:invokevirtual   #281 <Method Object CyclicBufferTracker.getOrCreate(String, long)>
	//   16   34:checkcast       #283 <Class CyclicBuffer>
	//   17   37:astore          5
		subAppend(cyclicbuffer, obj);
	//   18   39:aload_0         
	//   19   40:aload           5
	//   20   42:aload_1         
	//   21   43:invokevirtual   #287 <Method void subAppend(CyclicBuffer, Object)>
label0:
		{
			if(!eventEvaluator.evaluate(obj))
				break label0;
	//   22   46:aload_0         
	//   23   47:getfield        #289 <Field EventEvaluator eventEvaluator>
	//   24   50:aload_1         
	//   25   51:invokeinterface #294 <Method boolean EventEvaluator.evaluate(Object)>
	//   26   56:ifeq            153
			CyclicBuffer cyclicbuffer1 = new CyclicBuffer(cyclicbuffer);
	//   27   59:new             #283 <Class CyclicBuffer>
	//   28   62:dup             
	//   29   63:aload           5
	//   30   65:invokespecial   #297 <Method void CyclicBuffer(CyclicBuffer)>
	//   31   68:astore          6
			cyclicbuffer.clear();
	//   32   70:aload           5
	//   33   72:invokevirtual   #300 <Method void CyclicBuffer.clear()>
			if(asynchronousSending)
	//*  34   75:aload_0         
	//*  35   76:getfield        #78  <Field boolean asynchronousSending>
	//*  36   79:ifeq            114
			{
				SenderRunnable senderrunnable = new SenderRunnable(cyclicbuffer1, obj);
	//   37   82:new             #7   <Class SMTPAppenderBase$SenderRunnable>
	//   38   85:dup             
	//   39   86:aload_0         
	//   40   87:aload           6
	//   41   89:aload_1         
	//   42   90:invokespecial   #303 <Method void SMTPAppenderBase$SenderRunnable(SMTPAppenderBase, CyclicBuffer, Object)>
	//   43   93:astore          5
				context.getExecutorService().execute(((Runnable) (senderrunnable)));
	//   44   95:aload_0         
	//   45   96:getfield        #239 <Field Context context>
	//   46   99:invokeinterface #309 <Method ExecutorService Context.getExecutorService()>
	//   47  104:aload           5
	//   48  106:invokeinterface #315 <Method void ExecutorService.execute(Runnable)>
				break label0;
	//   49  111:goto            153
			}
			try
			{
				sendBuffer(cyclicbuffer1, obj);
	//   50  114:aload_0         
	//   51  115:aload           6
	//   52  117:aload_1         
	//   53  118:invokevirtual   #318 <Method void sendBuffer(CyclicBuffer, Object)>
			}
	//*  54  121:goto            153
			catch(EvaluationException evaluationexception)
	//*  55  124:astore          5
			{
				errorCount = errorCount + 1;
	//   56  126:aload_0         
	//   57  127:aload_0         
	//   58  128:getfield        #89  <Field int errorCount>
	//   59  131:iconst_1        
	//   60  132:iadd            
	//   61  133:putfield        #89  <Field int errorCount>
				if(errorCount < 4)
	//*  62  136:aload_0         
	//*  63  137:getfield        #89  <Field int errorCount>
	//*  64  140:iconst_4        
	//*  65  141:icmpge          153
					addError("SMTPAppender's EventEvaluator threw an Exception-", ((Throwable) (evaluationexception)));
	//   66  144:aload_0         
	//   67  145:ldc2            #320 <String "SMTPAppender's EventEvaluator threw an Exception-">
	//   68  148:aload           5
	//   69  150:invokevirtual   #225 <Method void addError(String, Throwable)>
			}
		}
		if(eventMarksEndOfLife(obj))
	//*  70  153:aload_0         
	//*  71  154:aload_1         
	//*  72  155:invokevirtual   #323 <Method boolean eventMarksEndOfLife(Object)>
	//*  73  158:ifeq            170
			cbTracker.endOfLife(s);
	//   74  161:aload_0         
	//   75  162:getfield        #275 <Field CyclicBufferTracker cbTracker>
	//   76  165:aload           4
	//   77  167:invokevirtual   #326 <Method void CyclicBufferTracker.endOfLife(String)>
		cbTracker.removeStaleComponents(l);
	//   78  170:aload_0         
	//   79  171:getfield        #275 <Field CyclicBufferTracker cbTracker>
	//   80  174:lload_2         
	//   81  175:invokevirtual   #330 <Method void CyclicBufferTracker.removeStaleComponents(long)>
		if(lastTrackerStatusPrint + (long)delayBetweenStatusMessages < l)
	//*  82  178:aload_0         
	//*  83  179:getfield        #60  <Field long lastTrackerStatusPrint>
	//*  84  182:aload_0         
	//*  85  183:getfield        #63  <Field int delayBetweenStatusMessages>
	//*  86  186:i2l             
	//*  87  187:ladd            
	//*  88  188:lload_2         
	//*  89  189:lcmp            
	//*  90  190:ifge            278
		{
			obj = ((Object) (new StringBuilder()));
	//   91  193:new             #205 <Class StringBuilder>
	//   92  196:dup             
	//   93  197:invokespecial   #206 <Method void StringBuilder()>
	//   94  200:astore_1        
			((StringBuilder) (obj)).append("SMTPAppender [");
	//   95  201:aload_1         
	//   96  202:ldc2            #332 <String "SMTPAppender [">
	//   97  205:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   98  208:pop             
			((StringBuilder) (obj)).append(name);
	//   99  209:aload_1         
	//  100  210:aload_0         
	//  101  211:getfield        #335 <Field String name>
	//  102  214:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  103  217:pop             
			((StringBuilder) (obj)).append("] is tracking [");
	//  104  218:aload_1         
	//  105  219:ldc2            #337 <String "] is tracking [">
	//  106  222:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  107  225:pop             
			((StringBuilder) (obj)).append(cbTracker.getComponentCount());
	//  108  226:aload_1         
	//  109  227:aload_0         
	//  110  228:getfield        #275 <Field CyclicBufferTracker cbTracker>
	//  111  231:invokevirtual   #340 <Method int CyclicBufferTracker.getComponentCount()>
	//  112  234:invokevirtual   #343 <Method StringBuilder StringBuilder.append(int)>
	//  113  237:pop             
			((StringBuilder) (obj)).append("] buffers");
	//  114  238:aload_1         
	//  115  239:ldc2            #345 <String "] buffers">
	//  116  242:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  117  245:pop             
			addInfo(((StringBuilder) (obj)).toString());
	//  118  246:aload_0         
	//  119  247:aload_1         
	//  120  248:invokevirtual   #222 <Method String StringBuilder.toString()>
	//  121  251:invokevirtual   #348 <Method void addInfo(String)>
			lastTrackerStatusPrint = l;
	//  122  254:aload_0         
	//  123  255:lload_2         
	//  124  256:putfield        #60  <Field long lastTrackerStatusPrint>
			if(delayBetweenStatusMessages < 0x493e0000)
	//* 125  259:aload_0         
	//* 126  260:getfield        #63  <Field int delayBetweenStatusMessages>
	//* 127  263:ldc1            #13  <Int 0x493e0000>
	//* 128  265:icmpge          278
				delayBetweenStatusMessages = delayBetweenStatusMessages * 4;
	//  129  268:aload_0         
	//  130  269:aload_0         
	//  131  270:getfield        #63  <Field int delayBetweenStatusMessages>
	//  132  273:iconst_4        
	//  133  274:imul            
	//  134  275:putfield        #63  <Field int delayBetweenStatusMessages>
		}
		return;
	//  135  278:return          
	}

	public boolean checkEntryConditions()
	{
		if(started) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #352 <Field boolean started>
	//    2    4:ifne            46
_L1:
		Object obj;
		String s;
		obj = ((Object) (new StringBuilder()));
	//    3    7:new             #205 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #206 <Method void StringBuilder()>
	//    6   14:astore_1        
		((StringBuilder) (obj)).append("Attempting to append to a non-started appender: ");
	//    7   15:aload_1         
	//    8   16:ldc2            #354 <String "Attempting to append to a non-started appender: ">
	//    9   19:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
		s = getName();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #357 <Method String getName()>
	//   13   27:astore_2        
_L6:
		((StringBuilder) (obj)).append(s);
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   18   34:aload_1         
	//   19   35:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   20   38:astore_1        
_L4:
		addError(((String) (obj)));
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:invokevirtual   #148 <Method void addError(String)>
		return false;
	//   24   44:iconst_0        
	//   25   45:ireturn         
_L2:
		if(mimeMsg != null)
			break; /* Loop/switch isn't completed */
	//   26   46:aload_0         
	//   27   47:getfield        #359 <Field MimeMessage mimeMsg>
	//   28   50:ifnonnull       60
		obj = "Message object not configured.";
	//   29   53:ldc2            #361 <String "Message object not configured.">
	//   30   56:astore_1        
		if(true) goto _L4; else goto _L3
	//   31   57:goto            39
_L3:
		if(eventEvaluator == null)
	//*  32   60:aload_0         
	//*  33   61:getfield        #289 <Field EventEvaluator eventEvaluator>
	//*  34   64:ifnonnull       99
		{
			obj = ((Object) (new StringBuilder()));
	//   35   67:new             #205 <Class StringBuilder>
	//   36   70:dup             
	//   37   71:invokespecial   #206 <Method void StringBuilder()>
	//   38   74:astore_1        
			((StringBuilder) (obj)).append("No EventEvaluator is set for appender [");
	//   39   75:aload_1         
	//   40   76:ldc2            #363 <String "No EventEvaluator is set for appender [">
	//   41   79:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   42   82:pop             
			((StringBuilder) (obj)).append(name);
	//   43   83:aload_1         
	//   44   84:aload_0         
	//   45   85:getfield        #335 <Field String name>
	//   46   88:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   47   91:pop             
			s = "].";
	//   48   92:ldc2            #365 <String "].">
	//   49   95:astore_2        
		} else
	//*  50   96:goto            28
		if(layout == null)
	//*  51   99:aload_0         
	//*  52  100:getfield        #367 <Field Layout layout>
	//*  53  103:ifnonnull       138
		{
			obj = ((Object) (new StringBuilder()));
	//   54  106:new             #205 <Class StringBuilder>
	//   55  109:dup             
	//   56  110:invokespecial   #206 <Method void StringBuilder()>
	//   57  113:astore_1        
			((StringBuilder) (obj)).append("No layout set for appender named [");
	//   58  114:aload_1         
	//   59  115:ldc2            #369 <String "No layout set for appender named [">
	//   60  118:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   61  121:pop             
			((StringBuilder) (obj)).append(name);
	//   62  122:aload_1         
	//   63  123:aload_0         
	//   64  124:getfield        #335 <Field String name>
	//   65  127:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   66  130:pop             
			s = "]. For more information, please visit http://logback.qos.ch/codes.html#smtp_no_layout";
	//   67  131:ldc2            #371 <String "]. For more information, please visit http://logback.qos.ch/codes.html#smtp_no_layout">
	//   68  134:astore_2        
		} else
	//*  69  135:goto            28
		{
			return true;
	//   70  138:iconst_1        
	//   71  139:ireturn         
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	protected abstract boolean eventMarksEndOfLife(Object obj);

	protected abstract void fillBuffer(CyclicBuffer cyclicbuffer, StringBuffer stringbuffer);

	InternetAddress getAddress(String s)
	{
		InternetAddress internetaddress;
		try
		{
			internetaddress = new InternetAddress(s);
	//    0    0:new             #52  <Class InternetAddress>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #376 <Method void InternetAddress(String)>
	//    4    8:astore_2        
		}
	//*   5    9:aload_2         
	//*   6   10:areturn         
		catch(AddressException addressexception)
	//*   7   11:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   12:new             #205 <Class StringBuilder>
	//    9   15:dup             
	//   10   16:invokespecial   #206 <Method void StringBuilder()>
	//   11   19:astore_3        
			stringbuilder.append("Could not parse address [");
	//   12   20:aload_3         
	//   13   21:ldc2            #378 <String "Could not parse address [">
	//   14   24:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
			stringbuilder.append(s);
	//   16   28:aload_3         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
			stringbuilder.append("].");
	//   20   34:aload_3         
	//   21   35:ldc2            #365 <String "].">
	//   22   38:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   23   41:pop             
			addError(stringbuilder.toString(), ((Throwable) (addressexception)));
	//   24   42:aload_0         
	//   25   43:aload_3         
	//   26   44:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   27   47:aload_2         
	//   28   48:invokevirtual   #225 <Method void addError(String, Throwable)>
			return null;
	//   29   51:aconst_null     
	//   30   52:areturn         
		}
		return internetaddress;
	}

	public String getCharsetEncoding()
	{
		return charsetEncoding;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field String charsetEncoding>
	//    2    4:areturn         
	}

	public CyclicBufferTracker getCyclicBufferTracker()
	{
		return cbTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #275 <Field CyclicBufferTracker cbTracker>
	//    2    4:areturn         
	}

	public Discriminator getDiscriminator()
	{
		return discriminator;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Discriminator discriminator>
	//    2    4:areturn         
	}

	public String getFrom()
	{
		return from;
	//    0    0:aload_0         
	//    1    1:getfield        #388 <Field String from>
	//    2    4:areturn         
	}

	public Layout getLayout()
	{
		return layout;
	//    0    0:aload_0         
	//    1    1:getfield        #367 <Field Layout layout>
	//    2    4:areturn         
	}

	public String getLocalhost()
	{
		return localhost;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field String localhost>
	//    2    4:areturn         
	}

	public Message getMessage()
	{
		return ((Message) (mimeMsg));
	//    0    0:aload_0         
	//    1    1:getfield        #359 <Field MimeMessage mimeMsg>
	//    2    4:areturn         
	}

	public String getPassword()
	{
		return password;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field String password>
	//    2    4:areturn         
	}

	public String getSMTPHost()
	{
		return getSmtpHost();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #399 <Method String getSmtpHost()>
	//    2    4:areturn         
	}

	public int getSMTPPort()
	{
		return getSmtpPort();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #403 <Method int getSmtpPort()>
	//    2    4:ireturn         
	}

	public String getSmtpHost()
	{
		return smtpHost;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field String smtpHost>
	//    2    4:areturn         
	}

	public int getSmtpPort()
	{
		return smtpPort;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int smtpPort>
	//    2    4:ireturn         
	}

	public String getSubject()
	{
		return subjectStr;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field String subjectStr>
	//    2    4:areturn         
	}

	public List getToAsListOfString()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #65  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void ArrayList()>
	//    3    7:astore_1        
		for(Iterator iterator = toPatternLayoutList.iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) (((PatternLayoutBase)iterator.next()).getPattern()))));
	//    4    8:aload_0         
	//    5    9:getfield        #68  <Field List toPatternLayoutList>
	//    6   12:invokeinterface #410 <Method Iterator List.iterator()>
	//    7   17:astore_2        
	//    8   18:aload_2         
	//    9   19:invokeinterface #415 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            49
	//   11   27:aload_1         
	//   12   28:aload_2         
	//   13   29:invokeinterface #419 <Method Object Iterator.next()>
	//   14   34:checkcast       #180 <Class PatternLayoutBase>
	//   15   37:invokevirtual   #422 <Method String PatternLayoutBase.getPattern()>
	//   16   40:invokeinterface #250 <Method boolean List.add(Object)>
	//   17   45:pop             
	//*  18   46:goto            18
		return ((List) (arraylist));
	//   19   49:aload_1         
	//   20   50:areturn         
	}

	public List getToList()
	{
		return toPatternLayoutList;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field List toPatternLayoutList>
	//    2    4:areturn         
	}

	public String getUsername()
	{
		return username;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field String username>
	//    2    4:areturn         
	}

	public boolean isAsynchronousSending()
	{
		return asynchronousSending;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean asynchronousSending>
	//    2    4:ireturn         
	}

	public boolean isSSL()
	{
		return ssl;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field boolean ssl>
	//    2    4:ireturn         
	}

	public boolean isSTARTTLS()
	{
		return starttls;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field boolean starttls>
	//    2    4:ireturn         
	}

	protected abstract PatternLayoutBase makeNewToPatternLayout(String s);

	protected abstract Layout makeSubjectLayout(String s);

	protected void sendBuffer(CyclicBuffer cyclicbuffer, Object obj)
	{
		int i;
		Object obj1;
		MimeBodyPart mimebodypart;
		StringBuffer stringbuffer;
		try
		{
			mimebodypart = new MimeBodyPart();
	//    0    0:new             #433 <Class MimeBodyPart>
	//    1    3:dup             
	//    2    4:invokespecial   #434 <Method void MimeBodyPart()>
	//    3    7:astore          5
			stringbuffer = new StringBuffer();
	//    4    9:new             #436 <Class StringBuffer>
	//    5   12:dup             
	//    6   13:invokespecial   #437 <Method void StringBuffer()>
	//    7   16:astore          6
			obj1 = ((Object) (layout.getFileHeader()));
	//    8   18:aload_0         
	//    9   19:getfield        #367 <Field Layout layout>
	//   10   22:invokeinterface #442 <Method String Layout.getFileHeader()>
	//   11   27:astore          4
		}
	//*  12   29:aload           4
	//*  13   31:ifnull          42
	//*  14   34:aload           6
	//*  15   36:aload           4
	//*  16   38:invokevirtual   #445 <Method StringBuffer StringBuffer.append(String)>
	//*  17   41:pop             
	//*  18   42:aload_0         
	//*  19   43:getfield        #367 <Field Layout layout>
	//*  20   46:invokeinterface #448 <Method String Layout.getPresentationHeader()>
	//*  21   51:astore          4
	//*  22   53:aload           4
	//*  23   55:ifnull          66
	//*  24   58:aload           6
	//*  25   60:aload           4
	//*  26   62:invokevirtual   #445 <Method StringBuffer StringBuffer.append(String)>
	//*  27   65:pop             
	//*  28   66:aload_0         
	//*  29   67:aload_1         
	//*  30   68:aload           6
	//*  31   70:invokevirtual   #450 <Method void fillBuffer(CyclicBuffer, StringBuffer)>
	//*  32   73:aload_0         
	//*  33   74:getfield        #367 <Field Layout layout>
	//*  34   77:invokeinterface #453 <Method String Layout.getPresentationFooter()>
	//*  35   82:astore_1        
	//*  36   83:aload_1         
	//*  37   84:ifnull          94
	//*  38   87:aload           6
	//*  39   89:aload_1         
	//*  40   90:invokevirtual   #445 <Method StringBuffer StringBuffer.append(String)>
	//*  41   93:pop             
	//*  42   94:aload_0         
	//*  43   95:getfield        #367 <Field Layout layout>
	//*  44   98:invokeinterface #456 <Method String Layout.getFileFooter()>
	//*  45  103:astore_1        
	//*  46  104:aload_1         
	//*  47  105:ifnull          115
	//*  48  108:aload           6
	//*  49  110:aload_1         
	//*  50  111:invokevirtual   #445 <Method StringBuffer StringBuffer.append(String)>
	//*  51  114:pop             
	//*  52  115:ldc2            #458 <String "Undefined subject">
	//*  53  118:astore_1        
	//*  54  119:aload_0         
	//*  55  120:getfield        #460 <Field Layout subjectLayout>
	//*  56  123:ifnull          170
	//*  57  126:aload_0         
	//*  58  127:getfield        #460 <Field Layout subjectLayout>
	//*  59  130:aload_2         
	//*  60  131:invokeinterface #461 <Method String Layout.doLayout(Object)>
	//*  61  136:astore          4
	//*  62  138:aload           4
	//*  63  140:ifnull          399
	//*  64  143:aload           4
	//*  65  145:bipush          10
	//*  66  147:invokevirtual   #465 <Method int String.indexOf(int)>
	//*  67  150:istore_3        
	//*  68  151:goto            154
	//*  69  154:aload           4
	//*  70  156:astore_1        
	//*  71  157:iload_3         
	//*  72  158:iconst_m1       
	//*  73  159:icmple          170
	//*  74  162:aload           4
	//*  75  164:iconst_0        
	//*  76  165:iload_3         
	//*  77  166:invokevirtual   #469 <Method String String.substring(int, int)>
	//*  78  169:astore_1        
	//*  79  170:aload_0         
	//*  80  171:getfield        #359 <Field MimeMessage mimeMsg>
	//*  81  174:aload_1         
	//*  82  175:aload_0         
	//*  83  176:getfield        #82  <Field String charsetEncoding>
	//*  84  179:invokevirtual   #474 <Method void MimeMessage.setSubject(String, String)>
	//*  85  182:aload_0         
	//*  86  183:aload_2         
	//*  87  184:invokespecial   #476 <Method List parseAddress(Object)>
	//*  88  187:astore_2        
	//*  89  188:aload_2         
	//*  90  189:invokeinterface #479 <Method boolean List.isEmpty()>
	//*  91  194:ifeq            205
	//*  92  197:aload_0         
	//*  93  198:ldc2            #481 <String "Empty destination address. Aborting email transmission">
	//*  94  201:invokevirtual   #348 <Method void addInfo(String)>
	//*  95  204:return          
	//*  96  205:aload_2         
	//*  97  206:getstatic       #54  <Field InternetAddress[] EMPTY_IA_ARRAY>
	//*  98  209:invokeinterface #485 <Method Object[] List.toArray(Object[])>
	//*  99  214:checkcast       #486 <Class InternetAddress[]>
	//* 100  217:astore_2        
	//* 101  218:aload_0         
	//* 102  219:getfield        #359 <Field MimeMessage mimeMsg>
	//* 103  222:getstatic       #492 <Field javax.mail.Message$RecipientType javax.mail.Message$RecipientType.TO>
	//* 104  225:aload_2         
	//* 105  226:invokevirtual   #496 <Method void MimeMessage.setRecipients(javax.mail.Message$RecipientType, javax.mail.Address[])>
	//* 106  229:aload_0         
	//* 107  230:getfield        #367 <Field Layout layout>
	//* 108  233:invokeinterface #499 <Method String Layout.getContentType()>
	//* 109  238:astore          4
	//* 110  240:aload           4
	//* 111  242:invokestatic    #505 <Method boolean ContentTypeUtil.isTextual(String)>
	//* 112  245:ifeq            270
	//* 113  248:aload           5
	//* 114  250:aload           6
	//* 115  252:invokevirtual   #506 <Method String StringBuffer.toString()>
	//* 116  255:aload_0         
	//* 117  256:getfield        #82  <Field String charsetEncoding>
	//* 118  259:aload           4
	//* 119  261:invokestatic    #510 <Method String ContentTypeUtil.getSubType(String)>
	//* 120  264:invokevirtual   #514 <Method void MimeBodyPart.setText(String, String, String)>
	//* 121  267:goto            289
	//* 122  270:aload           5
	//* 123  272:aload           6
	//* 124  274:invokevirtual   #506 <Method String StringBuffer.toString()>
	//* 125  277:aload_0         
	//* 126  278:getfield        #367 <Field Layout layout>
	//* 127  281:invokeinterface #499 <Method String Layout.getContentType()>
	//* 128  286:invokevirtual   #518 <Method void MimeBodyPart.setContent(Object, String)>
	//* 129  289:new             #520 <Class MimeMultipart>
	//* 130  292:dup             
	//* 131  293:invokespecial   #521 <Method void MimeMultipart()>
	//* 132  296:astore          4
	//* 133  298:aload           4
	//* 134  300:aload           5
	//* 135  302:invokevirtual   #527 <Method void Multipart.addBodyPart(javax.mail.BodyPart)>
	//* 136  305:aload_0         
	//* 137  306:getfield        #359 <Field MimeMessage mimeMsg>
	//* 138  309:aload           4
	//* 139  311:invokevirtual   #530 <Method void MimeMessage.setContent(Multipart)>
	//* 140  314:aload_0         
	//* 141  315:getfield        #359 <Field MimeMessage mimeMsg>
	//* 142  318:new             #532 <Class Date>
	//* 143  321:dup             
	//* 144  322:invokespecial   #533 <Method void Date()>
	//* 145  325:invokevirtual   #537 <Method void MimeMessage.setSentDate(Date)>
	//* 146  328:new             #205 <Class StringBuilder>
	//* 147  331:dup             
	//* 148  332:invokespecial   #206 <Method void StringBuilder()>
	//* 149  335:astore          4
	//* 150  337:aload           4
	//* 151  339:ldc2            #539 <String "About to send out SMTP message \"">
	//* 152  342:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//* 153  345:pop             
	//* 154  346:aload           4
	//* 155  348:aload_1         
	//* 156  349:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//* 157  352:pop             
	//* 158  353:aload           4
	//* 159  355:ldc2            #541 <String "\" to ">
	//* 160  358:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//* 161  361:pop             
	//* 162  362:aload           4
	//* 163  364:aload_2         
	//* 164  365:invokestatic    #544 <Method String Arrays.toString(Object[])>
	//* 165  368:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//* 166  371:pop             
	//* 167  372:aload_0         
	//* 168  373:aload           4
	//* 169  375:invokevirtual   #222 <Method String StringBuilder.toString()>
	//* 170  378:invokevirtual   #348 <Method void addInfo(String)>
	//* 171  381:aload_0         
	//* 172  382:getfield        #359 <Field MimeMessage mimeMsg>
	//* 173  385:invokestatic    #550 <Method void Transport.send(Message)>
	//* 174  388:return          
		// Misplaced declaration of an exception variable
		catch(CyclicBuffer cyclicbuffer)
	//* 175  389:astore_1        
		{
			addError("Error occurred while sending e-mail notification.", ((Throwable) (cyclicbuffer)));
	//  176  390:aload_0         
	//  177  391:ldc2            #552 <String "Error occurred while sending e-mail notification.">
	//  178  394:aload_1         
	//  179  395:invokevirtual   #225 <Method void addError(String, Throwable)>
			return;
	//  180  398:return          
		}
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_42;
		stringbuffer.append(((String) (obj1)));
		obj1 = ((Object) (layout.getPresentationHeader()));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_66;
		stringbuffer.append(((String) (obj1)));
		fillBuffer(cyclicbuffer, stringbuffer);
		cyclicbuffer = ((CyclicBuffer) (layout.getPresentationFooter()));
		if(cyclicbuffer == null)
			break MISSING_BLOCK_LABEL_94;
		stringbuffer.append(((String) (cyclicbuffer)));
		cyclicbuffer = ((CyclicBuffer) (layout.getFileFooter()));
		if(cyclicbuffer == null)
			break MISSING_BLOCK_LABEL_115;
		stringbuffer.append(((String) (cyclicbuffer)));
		cyclicbuffer = "Undefined subject";
		if(subjectLayout == null) goto _L2; else goto _L1
_L1:
		obj1 = ((Object) (subjectLayout.doLayout(obj)));
		if(obj1 == null) goto _L4; else goto _L3
_L3:
		i = ((String) (obj1)).indexOf('\n');
_L7:
		cyclicbuffer = ((CyclicBuffer) (obj1));
		if(i <= -1) goto _L2; else goto _L5
_L5:
		cyclicbuffer = ((CyclicBuffer) (((String) (obj1)).substring(0, i)));
_L2:
		mimeMsg.setSubject(((String) (cyclicbuffer)), charsetEncoding);
		obj = ((Object) (parseAddress(obj)));
		if(((List) (obj)).isEmpty())
		{
			addInfo("Empty destination address. Aborting email transmission");
			return;
		}
		obj = ((Object) ((InternetAddress[])((List) (obj)).toArray(((Object []) (EMPTY_IA_ARRAY)))));
		mimeMsg.setRecipients(javax.mail.Message.RecipientType.TO, ((javax.mail.Address []) (obj)));
		obj1 = ((Object) (layout.getContentType()));
		if(ContentTypeUtil.isTextual(((String) (obj1))))
		{
			mimebodypart.setText(stringbuffer.toString(), charsetEncoding, ContentTypeUtil.getSubType(((String) (obj1))));
			break MISSING_BLOCK_LABEL_289;
		}
		mimebodypart.setContent(((Object) (stringbuffer.toString())), layout.getContentType());
		obj1 = ((Object) (new MimeMultipart()));
		((Multipart) (obj1)).addBodyPart(((javax.mail.BodyPart) (mimebodypart)));
		mimeMsg.setContent(((Multipart) (obj1)));
		mimeMsg.setSentDate(new Date());
		obj1 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj1)).append("About to send out SMTP message \"");
		((StringBuilder) (obj1)).append(((String) (cyclicbuffer)));
		((StringBuilder) (obj1)).append("\" to ");
		((StringBuilder) (obj1)).append(Arrays.toString(((Object []) (obj))));
		addInfo(((StringBuilder) (obj1)).toString());
		Transport.send(((Message) (mimeMsg)));
		return;
_L4:
		i = -1;
	//  181  399:iconst_m1       
	//  182  400:istore_3        
		if(true) goto _L7; else goto _L6
	//  183  401:goto            154
_L6:
	}

	public void setAsynchronousSending(boolean flag)
	{
		asynchronousSending = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field boolean asynchronousSending>
	//    3    5:return          
	}

	public void setCharsetEncoding(String s)
	{
		charsetEncoding = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field String charsetEncoding>
	//    3    5:return          
	}

	public void setCyclicBufferTracker(CyclicBufferTracker cyclicbuffertracker)
	{
		cbTracker = cyclicbuffertracker;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #275 <Field CyclicBufferTracker cbTracker>
	//    3    5:return          
	}

	public void setDiscriminator(Discriminator discriminator1)
	{
		discriminator = discriminator1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #87  <Field Discriminator discriminator>
	//    3    5:return          
	}

	public void setEvaluator(EventEvaluator eventevaluator)
	{
		eventEvaluator = eventevaluator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #289 <Field EventEvaluator eventEvaluator>
	//    3    5:return          
	}

	public void setFrom(String s)
	{
		from = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #388 <Field String from>
	//    3    5:return          
	}

	public void setLayout(Layout layout1)
	{
		layout = layout1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #367 <Field Layout layout>
	//    3    5:return          
	}

	public void setLocalhost(String s)
	{
		localhost = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #120 <Field String localhost>
	//    3    5:return          
	}

	public void setMessage(MimeMessage mimemessage)
	{
		mimeMsg = mimemessage;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #359 <Field MimeMessage mimeMsg>
	//    3    5:return          
	}

	public void setPassword(String s)
	{
		password = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #128 <Field String password>
	//    3    5:return          
	}

	public void setSMTPHost(String s)
	{
		setSmtpHost(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #577 <Method void setSmtpHost(String)>
	//    3    5:return          
	}

	public void setSMTPPort(int i)
	{
		setSmtpPort(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #582 <Method void setSmtpPort(int)>
	//    3    5:return          
	}

	public void setSSL(boolean flag)
	{
		ssl = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #76  <Field boolean ssl>
	//    3    5:return          
	}

	public void setSTARTTLS(boolean flag)
	{
		starttls = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #74  <Field boolean starttls>
	//    3    5:return          
	}

	public void setSmtpHost(String s)
	{
		smtpHost = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #104 <Field String smtpHost>
	//    3    5:return          
	}

	public void setSmtpPort(int i)
	{
		smtpPort = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field int smtpPort>
	//    3    5:return          
	}

	public void setSubject(String s)
	{
		subjectStr = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field String subjectStr>
	//    3    5:return          
	}

	public void setUsername(String s)
	{
		username = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #124 <Field String username>
	//    3    5:return          
	}

	public void start()
	{
		if(cbTracker == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #275 <Field CyclicBufferTracker cbTracker>
	//*   2    4:ifnonnull       18
			cbTracker = new CyclicBufferTracker();
	//    3    7:aload_0         
	//    4    8:new             #277 <Class CyclicBufferTracker>
	//    5   11:dup             
	//    6   12:invokespecial   #588 <Method void CyclicBufferTracker()>
	//    7   15:putfield        #275 <Field CyclicBufferTracker cbTracker>
		Session session = buildSessionFromProperties();
	//    8   18:aload_0         
	//    9   19:invokespecial   #590 <Method Session buildSessionFromProperties()>
	//   10   22:astore_1        
		if(session == null)
	//*  11   23:aload_1         
	//*  12   24:ifnonnull       35
		{
			addError("Failed to obtain javax.mail.Session. Cannot start.");
	//   13   27:aload_0         
	//   14   28:ldc2            #592 <String "Failed to obtain javax.mail.Session. Cannot start.">
	//   15   31:invokevirtual   #148 <Method void addError(String)>
			return;
	//   16   34:return          
		}
		mimeMsg = new MimeMessage(session);
	//   17   35:aload_0         
	//   18   36:new             #471 <Class MimeMessage>
	//   19   39:dup             
	//   20   40:aload_1         
	//   21   41:invokespecial   #595 <Method void MimeMessage(Session)>
	//   22   44:putfield        #359 <Field MimeMessage mimeMsg>
		try
		{
			if(from != null)
	//*  23   47:aload_0         
	//*  24   48:getfield        #388 <Field String from>
	//*  25   51:ifnull          72
			{
				mimeMsg.setFrom(((javax.mail.Address) (getAddress(from))));
	//   26   54:aload_0         
	//   27   55:getfield        #359 <Field MimeMessage mimeMsg>
	//   28   58:aload_0         
	//   29   59:aload_0         
	//   30   60:getfield        #388 <Field String from>
	//   31   63:invokevirtual   #597 <Method InternetAddress getAddress(String)>
	//   32   66:invokevirtual   #600 <Method void MimeMessage.setFrom(javax.mail.Address)>
				break MISSING_BLOCK_LABEL_79;
	//   33   69:goto            79
			}
		}
	//*  34   72:aload_0         
	//*  35   73:getfield        #359 <Field MimeMessage mimeMsg>
	//*  36   76:invokevirtual   #602 <Method void MimeMessage.setFrom()>
	//*  37   79:aload_0         
	//*  38   80:aload_0         
	//*  39   81:aload_0         
	//*  40   82:getfield        #70  <Field String subjectStr>
	//*  41   85:invokevirtual   #604 <Method Layout makeSubjectLayout(String)>
	//*  42   88:putfield        #460 <Field Layout subjectLayout>
	//*  43   91:aload_0         
	//*  44   92:iconst_1        
	//*  45   93:putfield        #352 <Field boolean started>
	//*  46   96:return          
		catch(MessagingException messagingexception)
	//*  47   97:astore_1        
		{
			addError("Could not activate SMTPAppender options.", ((Throwable) (messagingexception)));
	//   48   98:aload_0         
	//   49   99:ldc2            #606 <String "Could not activate SMTPAppender options.">
	//   50  102:aload_1         
	//   51  103:invokevirtual   #225 <Method void addError(String, Throwable)>
			return;
	//   52  106:return          
		}
		mimeMsg.setFrom();
		subjectLayout = makeSubjectLayout(subjectStr);
		started = true;
		return;
	}

	public void stop()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		started = false;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #352 <Field boolean started>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		Exception exception;
		exception;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw exception;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	protected abstract void subAppend(CyclicBuffer cyclicbuffer, Object obj);

	static InternetAddress EMPTY_IA_ARRAY[] = new InternetAddress[0];
	static final int MAX_DELAY_BETWEEN_STATUS_MESSAGES = 0x493e0000;
	boolean asynchronousSending;
	protected CyclicBufferTracker cbTracker;
	private String charsetEncoding;
	int delayBetweenStatusMessages;
	protected Discriminator discriminator;
	private int errorCount;
	protected EventEvaluator eventEvaluator;
	private String from;
	long lastTrackerStatusPrint;
	protected Layout layout;
	String localhost;
	protected MimeMessage mimeMsg;
	String password;
	private String smtpHost;
	private int smtpPort;
	private boolean ssl;
	private boolean starttls;
	protected Layout subjectLayout;
	private String subjectStr;
	private List toPatternLayoutList;
	String username;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       InternetAddress[]
	//    2    4:putstatic       #54  <Field InternetAddress[] EMPTY_IA_ARRAY>
	//*   3    7:return          
	}
}
