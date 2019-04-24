// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.*;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.status.StatusUtil;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.slf4j.Marker;

// Referenced classes of package ch.qos.logback.classic.turbo:
//			TurboFilter

public class ReconfigureOnChangeFilter extends TurboFilter
{
	class ReconfiguringThread
		implements Runnable
	{

		private void fallbackConfiguration(LoggerContext loggercontext, List list, URL url)
		{
			JoranConfigurator joranconfigurator = new JoranConfigurator();
		//    0    0:new             #25  <Class JoranConfigurator>
		//    1    3:dup             
		//    2    4:invokespecial   #26  <Method void JoranConfigurator()>
		//    3    7:astore          4
			joranconfigurator.setContext(doConfigure);
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
					JoranConfigurator.informContextOfURLUsedForConfiguration(doConfigure, url);
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
			joranconfigurator.setContext(doConfigure);
		//    4    9:aload           6
		//    5   11:aload_0         
		//    6   12:getfield        #15  <Field ReconfigureOnChangeFilter this$0>
		//    7   15:invokestatic    #79  <Method Context ReconfigureOnChangeFilter.access$200(ReconfigureOnChangeFilter)>
		//    8   18:invokevirtual   #34  <Method void JoranConfigurator.setContext(Context)>
			StatusUtil statusutil = new StatusUtil(doConfigure);
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
			URL url = ConfigurationWatchListUtil.getMainWatchURL(doConfigure);
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
			LoggerContext loggercontext = (LoggerContext)doConfigure;
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
			stringbuilder.append(doConfigure.getName());
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

		ReconfiguringThread()
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


	public ReconfigureOnChangeFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void TurboFilter()>
		refreshPeriod = 60000L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #10  <Long 60000L>
	//    4    8:putfield        #35  <Field long refreshPeriod>
		invocationCounter = 0L;
	//    5   11:aload_0         
	//    6   12:lconst_0        
	//    7   13:putfield        #37  <Field long invocationCounter>
		mask = 15L;
	//    8   16:aload_0         
	//    9   17:ldc2w           #38  <Long 15L>
	//   10   20:putfield        #41  <Field long mask>
		lastMaskCheck = System.currentTimeMillis();
	//   11   23:aload_0         
	//   12   24:invokestatic    #47  <Method long System.currentTimeMillis()>
	//   13   27:putfield        #49  <Field long lastMaskCheck>
	//   14   30:return          
	}

	private void updateMaskIfNecessary(long l)
	{
		long l1 = l - lastMaskCheck;
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field long lastMaskCheck>
	//    3    5:lsub            
	//    4    6:lstore_3        
		lastMaskCheck = l;
	//    5    7:aload_0         
	//    6    8:lload_1         
	//    7    9:putfield        #49  <Field long lastMaskCheck>
		if(l1 < 100L && mask < 65535L)
	//*   8   12:lload_3         
	//*   9   13:ldc2w           #16  <Long 100L>
	//*  10   16:lcmp            
	//*  11   17:ifge            46
	//*  12   20:aload_0         
	//*  13   21:getfield        #41  <Field long mask>
	//*  14   24:ldc2w           #65  <Long 65535L>
	//*  15   27:lcmp            
	//*  16   28:ifge            46
			l = mask << 1 | 1L;
	//   17   31:aload_0         
	//   18   32:getfield        #41  <Field long mask>
	//   19   35:iconst_1        
	//   20   36:lshl            
	//   21   37:lconst_1        
	//   22   38:lor             
	//   23   39:lstore_1        
		else
	//*  24   40:aload_0         
	//*  25   41:lload_1         
	//*  26   42:putfield        #41  <Field long mask>
	//*  27   45:return          
		if(l1 > 800L)
	//*  28   46:lload_3         
	//*  29   47:ldc2w           #13  <Long 800L>
	//*  30   50:lcmp            
	//*  31   51:ifle            64
			l = mask >>> 2;
	//   32   54:aload_0         
	//   33   55:getfield        #41  <Field long mask>
	//   34   58:iconst_2        
	//   35   59:lushr           
	//   36   60:lstore_1        
		else
	//*  37   61:goto            40
			return;
	//   38   64:return          
		mask = l;
	}

	protected boolean changeDetected(long l)
	{
		if(l >= nextCheck)
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #70  <Field long nextCheck>
	//*   3    5:lcmp            
	//*   4    6:iflt            22
		{
			updateNextCheck(l);
	//    5    9:aload_0         
	//    6   10:lload_1         
	//    7   11:invokevirtual   #73  <Method void updateNextCheck(long)>
			return configurationWatchList.changeDetected();
	//    8   14:aload_0         
	//    9   15:getfield        #75  <Field ConfigurationWatchList configurationWatchList>
	//   10   18:invokevirtual   #80  <Method boolean ConfigurationWatchList.changeDetected()>
	//   11   21:ireturn         
		} else
		{
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		}
	}

	public FilterReply decide(Marker marker, Logger logger, Level level, String s, Object aobj[], Throwable throwable)
	{
		if(!isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #85  <Method boolean isStarted()>
	//*   2    4:ifne            11
			return FilterReply.NEUTRAL;
	//    3    7:getstatic       #91  <Field FilterReply FilterReply.NEUTRAL>
	//    4   10:areturn         
		long l = invocationCounter;
	//    5   11:aload_0         
	//    6   12:getfield        #37  <Field long invocationCounter>
	//    7   15:lstore          7
		invocationCounter = 1L + l;
	//    8   17:aload_0         
	//    9   18:lconst_1        
	//   10   19:lload           7
	//   11   21:ladd            
	//   12   22:putfield        #37  <Field long invocationCounter>
		if((l & mask) != mask)
	//*  13   25:lload           7
	//*  14   27:aload_0         
	//*  15   28:getfield        #41  <Field long mask>
	//*  16   31:land            
	//*  17   32:aload_0         
	//*  18   33:getfield        #41  <Field long mask>
	//*  19   36:lcmp            
	//*  20   37:ifeq            44
			return FilterReply.NEUTRAL;
	//   21   40:getstatic       #91  <Field FilterReply FilterReply.NEUTRAL>
	//   22   43:areturn         
		l = System.currentTimeMillis();
	//   23   44:invokestatic    #47  <Method long System.currentTimeMillis()>
	//   24   47:lstore          7
		synchronized(configurationWatchList)
	//*  25   49:aload_0         
	//*  26   50:getfield        #75  <Field ConfigurationWatchList configurationWatchList>
	//*  27   53:astore_1        
	//*  28   54:aload_1         
	//*  29   55:monitorenter    
		{
			updateMaskIfNecessary(l);
	//   30   56:aload_0         
	//   31   57:lload           7
	//   32   59:invokespecial   #93  <Method void updateMaskIfNecessary(long)>
			if(changeDetected(l))
	//*  33   62:aload_0         
	//*  34   63:lload           7
	//*  35   65:invokevirtual   #95  <Method boolean changeDetected(long)>
	//*  36   68:ifeq            79
			{
				disableSubsequentReconfiguration();
	//   37   71:aload_0         
	//   38   72:invokevirtual   #98  <Method void disableSubsequentReconfiguration()>
				detachReconfigurationToNewThread();
	//   39   75:aload_0         
	//   40   76:invokevirtual   #101 <Method void detachReconfigurationToNewThread()>
			}
		}
	//   41   79:aload_1         
	//   42   80:monitorexit     
		return FilterReply.NEUTRAL;
	//   43   81:getstatic       #91  <Field FilterReply FilterReply.NEUTRAL>
	//   44   84:areturn         
		logger;
	//   45   85:astore_2        
		marker;
	//   46   86:aload_1         
		JVM INSTR monitorexit ;
	//   47   87:monitorexit     
		throw logger;
	//   48   88:aload_2         
	//   49   89:athrow          
	}

	void detachReconfigurationToNewThread()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #103 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #104 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Detected change in [");
	//    4    8:aload_1         
	//    5    9:ldc1            #106 <String "Detected change in [">
	//    6   11:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (configurationWatchList.getCopyOfFileWatchList())));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #75  <Field ConfigurationWatchList configurationWatchList>
	//   11   20:invokevirtual   #114 <Method List ConfigurationWatchList.getCopyOfFileWatchList()>
	//   12   23:invokevirtual   #117 <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
		stringbuilder.append("]");
	//   14   27:aload_1         
	//   15   28:ldc1            #119 <String "]">
	//   16   30:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		addInfo(stringbuilder.toString());
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   21   39:invokevirtual   #127 <Method void addInfo(String)>
		context.getExecutorService().submit(((Runnable) (new ReconfiguringThread())));
	//   22   42:aload_0         
	//   23   43:getfield        #56  <Field Context context>
	//   24   46:invokeinterface #133 <Method ExecutorService Context.getExecutorService()>
	//   25   51:new             #6   <Class ReconfigureOnChangeFilter$ReconfiguringThread>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:invokespecial   #136 <Method void ReconfigureOnChangeFilter$ReconfiguringThread(ReconfigureOnChangeFilter)>
	//   29   59:invokeinterface #142 <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//   30   64:pop             
	//   31   65:return          
	}

	void disableSubsequentReconfiguration()
	{
		nextCheck = 0xffffffffL;
	//    0    0:aload_0         
	//    1    1:ldc2w           #143 <Long 0xffffffffL>
	//    2    4:putfield        #70  <Field long nextCheck>
	//    3    7:return          
	}

	public long getRefreshPeriod()
	{
		return refreshPeriod;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field long refreshPeriod>
	//    2    4:lreturn         
	}

	public void setRefreshPeriod(long l)
	{
		refreshPeriod = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #35  <Field long refreshPeriod>
	//    3    5:return          
	}

	public void start()
	{
		configurationWatchList = ConfigurationWatchListUtil.getConfigurationWatchList(context);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #56  <Field Context context>
	//    3    5:invokestatic    #153 <Method ConfigurationWatchList ConfigurationWatchListUtil.getConfigurationWatchList(Context)>
	//    4    8:putfield        #75  <Field ConfigurationWatchList configurationWatchList>
		if(configurationWatchList != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #75  <Field ConfigurationWatchList configurationWatchList>
	//*   7   15:ifnull          144
		{
			mainConfigurationURL = configurationWatchList.getMainURL();
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #75  <Field ConfigurationWatchList configurationWatchList>
	//   11   23:invokevirtual   #157 <Method URL ConfigurationWatchList.getMainURL()>
	//   12   26:putfield        #159 <Field URL mainConfigurationURL>
			if(mainConfigurationURL == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #159 <Field URL mainConfigurationURL>
	//*  15   33:ifnonnull       43
			{
				addWarn("Due to missing top level configuration file, automatic reconfiguration is impossible.");
	//   16   36:aload_0         
	//   17   37:ldc1            #161 <String "Due to missing top level configuration file, automatic reconfiguration is impossible.">
	//   18   39:invokevirtual   #164 <Method void addWarn(String)>
				return;
	//   19   42:return          
			}
			List list = configurationWatchList.getCopyOfFileWatchList();
	//   20   43:aload_0         
	//   21   44:getfield        #75  <Field ConfigurationWatchList configurationWatchList>
	//   22   47:invokevirtual   #114 <Method List ConfigurationWatchList.getCopyOfFileWatchList()>
	//   23   50:astore_3        
			long l = refreshPeriod / 1000L;
	//   24   51:aload_0         
	//   25   52:getfield        #35  <Field long refreshPeriod>
	//   26   55:ldc2w           #165 <Long 1000L>
	//   27   58:ldiv            
	//   28   59:lstore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   29   60:new             #103 <Class StringBuilder>
	//   30   63:dup             
	//   31   64:invokespecial   #104 <Method void StringBuilder()>
	//   32   67:astore          4
			stringbuilder.append("Will scan for changes in [");
	//   33   69:aload           4
	//   34   71:ldc1            #168 <String "Will scan for changes in [">
	//   35   73:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   36   76:pop             
			stringbuilder.append(((Object) (list)));
	//   37   77:aload           4
	//   38   79:aload_3         
	//   39   80:invokevirtual   #117 <Method StringBuilder StringBuilder.append(Object)>
	//   40   83:pop             
			stringbuilder.append("] every ");
	//   41   84:aload           4
	//   42   86:ldc1            #170 <String "] every ">
	//   43   88:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   44   91:pop             
			stringbuilder.append(l);
	//   45   92:aload           4
	//   46   94:lload_1         
	//   47   95:invokevirtual   #173 <Method StringBuilder StringBuilder.append(long)>
	//   48   98:pop             
			stringbuilder.append(" seconds. ");
	//   49   99:aload           4
	//   50  101:ldc1            #175 <String " seconds. ">
	//   51  103:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   52  106:pop             
			addInfo(stringbuilder.toString());
	//   53  107:aload_0         
	//   54  108:aload           4
	//   55  110:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   56  113:invokevirtual   #127 <Method void addInfo(String)>
			synchronized(configurationWatchList)
	//*  57  116:aload_0         
	//*  58  117:getfield        #75  <Field ConfigurationWatchList configurationWatchList>
	//*  59  120:astore_3        
	//*  60  121:aload_3         
	//*  61  122:monitorenter    
			{
				updateNextCheck(System.currentTimeMillis());
	//   62  123:aload_0         
	//   63  124:invokestatic    #47  <Method long System.currentTimeMillis()>
	//   64  127:invokevirtual   #73  <Method void updateNextCheck(long)>
			}
	//   65  130:aload_3         
	//   66  131:monitorexit     
			super.start();
	//   67  132:aload_0         
	//   68  133:invokespecial   #177 <Method void TurboFilter.start()>
			return;
	//   69  136:return          
		} else
	//*  70  137:astore          4
	//*  71  139:aload_3         
	//*  72  140:monitorexit     
	//*  73  141:aload           4
	//*  74  143:athrow          
		{
			addWarn("Empty ConfigurationWatchList in context");
	//   75  144:aload_0         
	//   76  145:ldc1            #179 <String "Empty ConfigurationWatchList in context">
	//   77  147:invokevirtual   #164 <Method void addWarn(String)>
			return;
	//   78  150:return          
		}
		exception;
		configurationwatchlist;
		JVM INSTR monitorexit ;
		throw exception;
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #103 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #104 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ReconfigureOnChangeFilter{invocationCounter=");
	//    4    8:aload_1         
	//    5    9:ldc1            #181 <String "ReconfigureOnChangeFilter{invocationCounter=">
	//    6   11:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(invocationCounter);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #37  <Field long invocationCounter>
	//   11   20:invokevirtual   #173 <Method StringBuilder StringBuilder.append(long)>
	//   12   23:pop             
		stringbuilder.append('}');
	//   13   24:aload_1         
	//   14   25:bipush          125
	//   15   27:invokevirtual   #184 <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	void updateNextCheck(long l)
	{
		nextCheck = l + refreshPeriod;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #35  <Field long refreshPeriod>
	//    4    6:ladd            
	//    5    7:putfield        #70  <Field long nextCheck>
	//    6   10:return          
	}

	public static final long DEFAULT_REFRESH_PERIOD = 60000L;
	private static final long MASK_DECREASE_THRESHOLD = 800L;
	private static final long MASK_INCREASE_THRESHOLD = 100L;
	private static final int MAX_MASK = 65535;
	ConfigurationWatchList configurationWatchList;
	private long invocationCounter;
	private volatile long lastMaskCheck;
	URL mainConfigurationURL;
	private volatile long mask;
	protected volatile long nextCheck;
	long refreshPeriod;


/*
	static Context access$000(ReconfigureOnChangeFilter reconfigureonchangefilter)
	{
		return reconfigureonchangefilter.context;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Context context>
	//    2    4:areturn         
	}

*/


/*
	static Context access$100(ReconfigureOnChangeFilter reconfigureonchangefilter)
	{
		return reconfigureonchangefilter.context;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Context context>
	//    2    4:areturn         
	}

*/


/*
	static Context access$200(ReconfigureOnChangeFilter reconfigureonchangefilter)
	{
		return reconfigureonchangefilter.context;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Context context>
	//    2    4:areturn         
	}

*/


/*
	static Context access$300(ReconfigureOnChangeFilter reconfigureonchangefilter)
	{
		return reconfigureonchangefilter.context;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Context context>
	//    2    4:areturn         
	}

*/


/*
	static Context access$400(ReconfigureOnChangeFilter reconfigureonchangefilter)
	{
		return reconfigureonchangefilter.context;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Context context>
	//    2    4:areturn         
	}

*/


/*
	static Context access$500(ReconfigureOnChangeFilter reconfigureonchangefilter)
	{
		return reconfigureonchangefilter.context;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Context context>
	//    2    4:areturn         
	}

*/


/*
	static Context access$600(ReconfigureOnChangeFilter reconfigureonchangefilter)
	{
		return reconfigureonchangefilter.context;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Context context>
	//    2    4:areturn         
	}

*/
}
