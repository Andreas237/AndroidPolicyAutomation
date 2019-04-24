// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.status.StatusUtil;
import java.net.URL;
import java.util.List;

// Referenced classes of package ch.qos.logback.classic.turbo:
//			ReconfigureOnChangeFilter

class ReconfigureOnChangeFilter$ReconfiguringThread
	implements Runnable
{

	private void fallbackConfiguration(LoggerContext loggercontext, List list, URL url)
	{
		JoranConfigurator joranconfigurator = new JoranConfigurator();
	//    0    0:new             #25  <Class JoranConfigurator>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void JoranConfigurator()>
	//    3    7:astore          4
		joranconfigurator.setContext(ReconfigureOnChangeFilter.access$500(ReconfigureOnChangeFilter.this));
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//    7   15:invokestatic    #30  <Method Context ReconfigureOnChangeFilter.access$500(ReconfigureOnChangeFilter)>
	//    8   18:invokevirtual   #34  <Method void JoranConfigurator.setContext(Context)>
		if(list != null)
	//*   9   21:aload_2         
	//*  10   22:ifnull          82
		{
			addWarn("Falling back to previously registered safe configuration.");
	//   11   25:aload_0         
	//   12   26:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//   13   29:ldc1            #36  <String "Falling back to previously registered safe configuration.">
	//   14   31:invokevirtual   #40  <Method void ReconfigureOnChangeFilter.addWarn(String)>
			try
			{
				loggercontext.reset();
	//   15   34:aload_1         
	//   16   35:invokevirtual   #45  <Method void LoggerContext.reset()>
				JoranConfigurator.informContextOfURLUsedForConfiguration(ReconfigureOnChangeFilter.access$600(ReconfigureOnChangeFilter.this), url);
	//   17   38:aload_0         
	//   18   39:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//   19   42:invokestatic    #48  <Method Context ReconfigureOnChangeFilter.access$600(ReconfigureOnChangeFilter)>
	//   20   45:aload_3         
	//   21   46:invokestatic    #52  <Method void JoranConfigurator.informContextOfURLUsedForConfiguration(Context, URL)>
				joranconfigurator.doConfigure(list);
	//   22   49:aload           4
	//   23   51:aload_2         
	//   24   52:invokevirtual   #56  <Method void JoranConfigurator.doConfigure(List)>
				addInfo("Re-registering previous fallback configuration once more as a fallback configuration point");
	//   25   55:aload_0         
	//   26   56:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//   27   59:ldc1            #58  <String "Re-registering previous fallback configuration once more as a fallback configuration point">
	//   28   61:invokevirtual   #61  <Method void ReconfigureOnChangeFilter.addInfo(String)>
				joranconfigurator.registerSafeConfiguration();
	//   29   64:aload           4
	//   30   66:invokevirtual   #64  <Method void JoranConfigurator.registerSafeConfiguration()>
				return;
	//   31   69:return          
			}
			// Misplaced declaration of an exception variable
			catch(LoggerContext loggercontext)
	//*  32   70:astore_1        
			{
				addError("Unexpected exception thrown by a configuration considered safe.", ((Throwable) (loggercontext)));
	//   33   71:aload_0         
	//   34   72:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//   35   75:ldc1            #66  <String "Unexpected exception thrown by a configuration considered safe.">
	//   36   77:aload_1         
	//   37   78:invokevirtual   #70  <Method void ReconfigureOnChangeFilter.addError(String, Throwable)>
			}
			return;
	//   38   81:return          
		} else
		{
			addWarn("No previous configuration to fall back on.");
	//   39   82:aload_0         
	//   40   83:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//   41   86:ldc1            #72  <String "No previous configuration to fall back on.">
	//   42   88:invokevirtual   #40  <Method void ReconfigureOnChangeFilter.addWarn(String)>
			return;
	//   43   91:return          
		}
	}

	private void performXMLConfiguration(LoggerContext loggercontext)
	{
		JoranException joranexception;
		JoranConfigurator joranconfigurator = new JoranConfigurator();
	//    0    0:new             #25  <Class JoranConfigurator>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void JoranConfigurator()>
	//    3    7:astore          6
		joranconfigurator.setContext(ReconfigureOnChangeFilter.access$200(ReconfigureOnChangeFilter.this));
	//    4    9:aload           6
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//    7   15:invokestatic    #79  <Method Context ReconfigureOnChangeFilter.access$200(ReconfigureOnChangeFilter)>
	//    8   18:invokevirtual   #34  <Method void JoranConfigurator.setContext(Context)>
		StatusUtil statusutil = new StatusUtil(ReconfigureOnChangeFilter.access$300(ReconfigureOnChangeFilter.this));
	//    9   21:new             #81  <Class StatusUtil>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//   13   29:invokestatic    #84  <Method Context ReconfigureOnChangeFilter.access$300(ReconfigureOnChangeFilter)>
	//   14   32:invokespecial   #86  <Method void StatusUtil(Context)>
	//   15   35:astore          7
		List list = joranconfigurator.recallSafeConfiguration();
	//   16   37:aload           6
	//   17   39:invokevirtual   #90  <Method List JoranConfigurator.recallSafeConfiguration()>
	//   18   42:astore          4
		URL url = ConfigurationWatchListUtil.getMainWatchURL(ReconfigureOnChangeFilter.access$400(ReconfigureOnChangeFilter.this));
	//   19   44:aload_0         
	//   20   45:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//   21   48:invokestatic    #93  <Method Context ReconfigureOnChangeFilter.access$400(ReconfigureOnChangeFilter)>
	//   22   51:invokestatic    #99  <Method URL ConfigurationWatchListUtil.getMainWatchURL(Context)>
	//   23   54:astore          5
		loggercontext.reset();
	//   24   56:aload_1         
	//   25   57:invokevirtual   #45  <Method void LoggerContext.reset()>
		long l = System.currentTimeMillis();
	//   26   60:invokestatic    #105 <Method long System.currentTimeMillis()>
	//   27   63:lstore_2        
		try
		{
			joranconfigurator.doConfigure(mainConfigurationURL);
	//   28   64:aload           6
	//   29   66:aload_0         
	//   30   67:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//   31   70:getfield        #109 <Field URL ReconfigureOnChangeFilter.mainConfigurationURL>
	//   32   73:invokevirtual   #112 <Method void JoranConfigurator.doConfigure(URL)>
			if(statusutil.hasXMLParsingErrors(l))
	//*  33   76:aload           7
	//*  34   78:lload_2         
	//*  35   79:invokevirtual   #116 <Method boolean StatusUtil.hasXMLParsingErrors(long)>
	//*  36   82:ifeq            104
			{
				fallbackConfiguration(loggercontext, list, url);
	//   37   85:aload_0         
	//   38   86:aload_1         
	//   39   87:aload           4
	//   40   89:aload           5
	//   41   91:invokespecial   #118 <Method void fallbackConfiguration(LoggerContext, List, URL)>
				return;
	//   42   94:return          
			}
		}
	//*  43   95:aload_0         
	//*  44   96:aload_1         
	//*  45   97:aload           4
	//*  46   99:aload           5
	//*  47  101:invokespecial   #118 <Method void fallbackConfiguration(LoggerContext, List, URL)>
	//*  48  104:return          
		// Misplaced declaration of an exception variable
		catch(JoranException joranexception)
		{
			fallbackConfiguration(loggercontext, list, url);
		}
	//*  49  105:astore          6
	//*  50  107:goto            95
	}

	public void run()
	{
		if(mainConfigurationURL == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//*   2    4:getfield        #109 <Field URL ReconfigureOnChangeFilter.mainConfigurationURL>
	//*   3    7:ifnonnull       20
		{
			addInfo("Due to missing top level configuration file, skipping reconfiguration");
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//    6   14:ldc1            #121 <String "Due to missing top level configuration file, skipping reconfiguration">
	//    7   16:invokevirtual   #61  <Method void ReconfigureOnChangeFilter.addInfo(String)>
			return;
	//    8   19:return          
		}
		LoggerContext loggercontext = (LoggerContext)ReconfigureOnChangeFilter.access$000(ReconfigureOnChangeFilter.this);
	//    9   20:aload_0         
	//   10   21:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//   11   24:invokestatic    #124 <Method Context ReconfigureOnChangeFilter.access$000(ReconfigureOnChangeFilter)>
	//   12   27:checkcast       #42  <Class LoggerContext>
	//   13   30:astore_1        
		ReconfigureOnChangeFilter reconfigureonchangefilter = ReconfigureOnChangeFilter.this;
	//   14   31:aload_0         
	//   15   32:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//   16   35:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   17   36:new             #126 <Class StringBuilder>
	//   18   39:dup             
	//   19   40:invokespecial   #127 <Method void StringBuilder()>
	//   20   43:astore_3        
		stringbuilder.append("Will reset and reconfigure context named [");
	//   21   44:aload_3         
	//   22   45:ldc1            #129 <String "Will reset and reconfigure context named [">
	//   23   47:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
		stringbuilder.append(ReconfigureOnChangeFilter.access$100(ReconfigureOnChangeFilter.this).getName());
	//   25   51:aload_3         
	//   26   52:aload_0         
	//   27   53:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//   28   56:invokestatic    #136 <Method Context ReconfigureOnChangeFilter.access$100(ReconfigureOnChangeFilter)>
	//   29   59:invokeinterface #142 <Method String Context.getName()>
	//   30   64:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   31   67:pop             
		stringbuilder.append("]");
	//   32   68:aload_3         
	//   33   69:ldc1            #144 <String "]">
	//   34   71:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   35   74:pop             
		reconfigureonchangefilter.addInfo(stringbuilder.toString());
	//   36   75:aload_2         
	//   37   76:aload_3         
	//   38   77:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   39   80:invokevirtual   #61  <Method void ReconfigureOnChangeFilter.addInfo(String)>
		if(mainConfigurationURL.toString().endsWith("xml"))
	//*  40   83:aload_0         
	//*  41   84:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
	//*  42   87:getfield        #109 <Field URL ReconfigureOnChangeFilter.mainConfigurationURL>
	//*  43   90:invokevirtual   #150 <Method String URL.toString()>
	//*  44   93:ldc1            #152 <String "xml">
	//*  45   95:invokevirtual   #158 <Method boolean String.endsWith(String)>
	//*  46   98:ifeq            106
			performXMLConfiguration(loggercontext);
	//   47  101:aload_0         
	//   48  102:aload_1         
	//   49  103:invokespecial   #160 <Method void performXMLConfiguration(LoggerContext)>
	//   50  106:return          
	}

	final ReconfigureOnChangeFilter this$0;

	ReconfigureOnChangeFilter$ReconfiguringThread()
	{
		this$0 = ReconfigureOnChangeFilter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ReconfigureOnChangeFilter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
