// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.EventPlayer;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.Interpreter;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.spi.RuleStore;
import ch.qos.logback.core.joran.spi.SimpleRuleStore;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.StatusUtil;
import java.io.*;
import java.net.*;
import java.util.List;
import org.xml.sax.InputSource;

public abstract class GenericConfigurator extends ContextAwareBase
{

	public GenericConfigurator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void ContextAwareBase()>
	//    2    4:return          
	}

	private final void doConfigure(InputSource inputsource)
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #19  <Method long System.currentTimeMillis()>
	//    1    3:lstore_2        
		if(!ConfigurationWatchListUtil.wasConfigurationWatchListReset(context))
	//*   2    4:aload_0         
	//*   3    5:getfield        #23  <Field Context context>
	//*   4    8:invokestatic    #29  <Method boolean ConfigurationWatchListUtil.wasConfigurationWatchListReset(Context)>
	//*   5   11:ifne            22
			informContextOfURLUsedForConfiguration(getContext(), ((URL) (null)));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #33  <Method Context getContext()>
	//    8   18:aconst_null     
	//    9   19:invokestatic    #37  <Method void informContextOfURLUsedForConfiguration(Context, URL)>
		SaxEventRecorder saxeventrecorder = new SaxEventRecorder(context);
	//   10   22:new             #39  <Class SaxEventRecorder>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:getfield        #23  <Field Context context>
	//   14   30:invokespecial   #42  <Method void SaxEventRecorder(Context)>
	//   15   33:astore          4
		saxeventrecorder.recordEvents(inputsource);
	//   16   35:aload           4
	//   17   37:aload_1         
	//   18   38:invokevirtual   #46  <Method List SaxEventRecorder.recordEvents(InputSource)>
	//   19   41:pop             
		doConfigure(saxeventrecorder.getSaxEventList());
	//   20   42:aload_0         
	//   21   43:aload           4
	//   22   45:invokevirtual   #50  <Method List SaxEventRecorder.getSaxEventList()>
	//   23   48:invokevirtual   #53  <Method void doConfigure(List)>
		if((new StatusUtil(context)).noXMLParsingErrorsOccurred(l))
	//*  24   51:new             #55  <Class StatusUtil>
	//*  25   54:dup             
	//*  26   55:aload_0         
	//*  27   56:getfield        #23  <Field Context context>
	//*  28   59:invokespecial   #56  <Method void StatusUtil(Context)>
	//*  29   62:lload_2         
	//*  30   63:invokevirtual   #60  <Method boolean StatusUtil.noXMLParsingErrorsOccurred(long)>
	//*  31   66:ifeq            79
		{
			addInfo("Registering current configuration as safe fallback point");
	//   32   69:aload_0         
	//   33   70:ldc1            #62  <String "Registering current configuration as safe fallback point">
	//   34   72:invokevirtual   #66  <Method void addInfo(String)>
			registerSafeConfiguration();
	//   35   75:aload_0         
	//   36   76:invokevirtual   #69  <Method void registerSafeConfiguration()>
		}
	//   37   79:return          
	}

	public static void informContextOfURLUsedForConfiguration(Context context, URL url)
	{
		ConfigurationWatchListUtil.setMainWatchURL(context, url);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #72  <Method void ConfigurationWatchListUtil.setMainWatchURL(Context, URL)>
	//    3    5:return          
	}

	protected void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry defaultnestedcomponentregistry)
	{
	//    0    0:return          
	}

	protected abstract void addImplicitRules(Interpreter interpreter1);

	protected abstract void addInstanceRules(RuleStore rulestore);

	protected void buildInterpreter()
	{
		Object obj = ((Object) (new SimpleRuleStore(context)));
	//    0    0:new             #81  <Class SimpleRuleStore>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Context context>
	//    4    8:invokespecial   #82  <Method void SimpleRuleStore(Context)>
	//    5   11:astore_1        
		addInstanceRules(((RuleStore) (obj)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #84  <Method void addInstanceRules(RuleStore)>
		interpreter = new Interpreter(context, ((RuleStore) (obj)), initialElementPath());
	//    9   17:aload_0         
	//   10   18:new             #86  <Class Interpreter>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #23  <Field Context context>
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #90  <Method ElementPath initialElementPath()>
	//   17   31:invokespecial   #93  <Method void Interpreter(Context, RuleStore, ElementPath)>
	//   18   34:putfield        #95  <Field Interpreter interpreter>
		obj = ((Object) (interpreter.getInterpretationContext()));
	//   19   37:aload_0         
	//   20   38:getfield        #95  <Field Interpreter interpreter>
	//   21   41:invokevirtual   #99  <Method InterpretationContext Interpreter.getInterpretationContext()>
	//   22   44:astore_1        
		((InterpretationContext) (obj)).setContext(context);
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:getfield        #23  <Field Context context>
	//   26   50:invokevirtual   #104 <Method void InterpretationContext.setContext(Context)>
		addImplicitRules(interpreter);
	//   27   53:aload_0         
	//   28   54:aload_0         
	//   29   55:getfield        #95  <Field Interpreter interpreter>
	//   30   58:invokevirtual   #106 <Method void addImplicitRules(Interpreter)>
		addDefaultNestedComponentRegistryRules(((InterpretationContext) (obj)).getDefaultNestedComponentRegistry());
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #110 <Method DefaultNestedComponentRegistry InterpretationContext.getDefaultNestedComponentRegistry()>
	//   34   66:invokevirtual   #112 <Method void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry)>
	//   35   69:return          
	}

	public final void doConfigure(File file)
	{
		try
		{
			informContextOfURLUsedForConfiguration(getContext(), file.toURI().toURL());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method Context getContext()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #121 <Method URI File.toURI()>
	//    4    8:invokevirtual   #127 <Method URL URI.toURL()>
	//    5   11:invokestatic    #37  <Method void informContextOfURLUsedForConfiguration(Context, URL)>
			doConfigure(((InputStream) (new FileInputStream(file))));
	//    6   14:aload_0         
	//    7   15:new             #129 <Class FileInputStream>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #131 <Method void FileInputStream(File)>
	//   11   23:invokevirtual   #134 <Method void doConfigure(InputStream)>
			return;
	//   12   26:return          
		}
		catch(IOException ioexception)
	//*  13   27:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   14   28:new             #136 <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #137 <Method void StringBuilder()>
	//   17   35:astore_3        
			stringbuilder.append("Could not open [");
	//   18   36:aload_3         
	//   19   37:ldc1            #139 <String "Could not open [">
	//   20   39:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
			stringbuilder.append(file.getPath());
	//   22   43:aload_3         
	//   23   44:aload_1         
	//   24   45:invokevirtual   #147 <Method String File.getPath()>
	//   25   48:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
			stringbuilder.append("].");
	//   27   52:aload_3         
	//   28   53:ldc1            #149 <String "].">
	//   29   55:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
			file = ((File) (stringbuilder.toString()));
	//   31   59:aload_3         
	//   32   60:invokevirtual   #152 <Method String StringBuilder.toString()>
	//   33   63:astore_1        
			addError(((String) (file)), ((Throwable) (ioexception)));
	//   34   64:aload_0         
	//   35   65:aload_1         
	//   36   66:aload_2         
	//   37   67:invokevirtual   #156 <Method void addError(String, Throwable)>
			throw new JoranException(((String) (file)), ((Throwable) (ioexception)));
	//   38   70:new             #158 <Class JoranException>
	//   39   73:dup             
	//   40   74:aload_1         
	//   41   75:aload_2         
	//   42   76:invokespecial   #160 <Method void JoranException(String, Throwable)>
	//   43   79:athrow          
		}
	}

	public final void doConfigure(InputStream inputstream)
	{
		doConfigure(new InputSource(inputstream));
	//    0    0:aload_0         
	//    1    1:new             #162 <Class InputSource>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #164 <Method void InputSource(InputStream)>
	//    5    9:invokespecial   #166 <Method void doConfigure(InputSource)>
		try
		{
			inputstream.close();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #171 <Method void InputStream.close()>
			return;
	//    8   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*   9   17:astore_1        
		{
			addError("Could not close the stream", ((Throwable) (inputstream)));
	//   10   18:aload_0         
	//   11   19:ldc1            #173 <String "Could not close the stream">
	//   12   21:aload_1         
	//   13   22:invokevirtual   #156 <Method void addError(String, Throwable)>
		}
		throw new JoranException("Could not close the stream", ((Throwable) (inputstream)));
	//   14   25:new             #158 <Class JoranException>
	//   15   28:dup             
	//   16   29:ldc1            #173 <String "Could not close the stream">
	//   17   31:aload_1         
	//   18   32:invokespecial   #160 <Method void JoranException(String, Throwable)>
	//   19   35:athrow          
		Exception exception;
		exception;
	//   20   36:astore_2        
		try
		{
			inputstream.close();
	//   21   37:aload_1         
	//   22   38:invokevirtual   #171 <Method void InputStream.close()>
		}
	//*  23   41:aload_2         
	//*  24   42:athrow          
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  25   43:astore_1        
		{
			addError("Could not close the stream", ((Throwable) (inputstream)));
	//   26   44:aload_0         
	//   27   45:ldc1            #173 <String "Could not close the stream">
	//   28   47:aload_1         
	//   29   48:invokevirtual   #156 <Method void addError(String, Throwable)>
			throw new JoranException("Could not close the stream", ((Throwable) (inputstream)));
	//   30   51:new             #158 <Class JoranException>
	//   31   54:dup             
	//   32   55:ldc1            #173 <String "Could not close the stream">
	//   33   57:aload_1         
	//   34   58:invokespecial   #160 <Method void JoranException(String, Throwable)>
	//   35   61:athrow          
		}
		throw exception;
	}

	public final void doConfigure(String s)
	{
		doConfigure(new File(s));
	//    0    0:aload_0         
	//    1    1:new             #117 <Class File>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #175 <Method void File(String)>
	//    5    9:invokevirtual   #177 <Method void doConfigure(File)>
	//    6   12:return          
	}

	public final void doConfigure(URL url)
	{
		try
		{
			informContextOfURLUsedForConfiguration(getContext(), url);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method Context getContext()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #37  <Method void informContextOfURLUsedForConfiguration(Context, URL)>
			URLConnection urlconnection = url.openConnection();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #184 <Method URLConnection URL.openConnection()>
	//    6   12:astore_2        
			urlconnection.setUseCaches(false);
	//    7   13:aload_2         
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #190 <Method void URLConnection.setUseCaches(boolean)>
			doConfigure(urlconnection.getInputStream());
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #194 <Method InputStream URLConnection.getInputStream()>
	//   13   23:invokevirtual   #134 <Method void doConfigure(InputStream)>
			return;
	//   14   26:return          
		}
		catch(IOException ioexception)
	//*  15   27:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   28:new             #136 <Class StringBuilder>
	//   17   31:dup             
	//   18   32:invokespecial   #137 <Method void StringBuilder()>
	//   19   35:astore_3        
			stringbuilder.append("Could not open URL [");
	//   20   36:aload_3         
	//   21   37:ldc1            #196 <String "Could not open URL [">
	//   22   39:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   23   42:pop             
			stringbuilder.append(((Object) (url)));
	//   24   43:aload_3         
	//   25   44:aload_1         
	//   26   45:invokevirtual   #199 <Method StringBuilder StringBuilder.append(Object)>
	//   27   48:pop             
			stringbuilder.append("].");
	//   28   49:aload_3         
	//   29   50:ldc1            #149 <String "].">
	//   30   52:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   31   55:pop             
			url = ((URL) (stringbuilder.toString()));
	//   32   56:aload_3         
	//   33   57:invokevirtual   #152 <Method String StringBuilder.toString()>
	//   34   60:astore_1        
			addError(((String) (url)), ((Throwable) (ioexception)));
	//   35   61:aload_0         
	//   36   62:aload_1         
	//   37   63:aload_2         
	//   38   64:invokevirtual   #156 <Method void addError(String, Throwable)>
			throw new JoranException(((String) (url)), ((Throwable) (ioexception)));
	//   39   67:new             #158 <Class JoranException>
	//   40   70:dup             
	//   41   71:aload_1         
	//   42   72:aload_2         
	//   43   73:invokespecial   #160 <Method void JoranException(String, Throwable)>
	//   44   76:athrow          
		}
	}

	public void doConfigure(List list)
	{
		buildInterpreter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #201 <Method void buildInterpreter()>
		synchronized(context.getConfigurationLock())
	//*   2    4:aload_0         
	//*   3    5:getfield        #23  <Field Context context>
	//*   4    8:invokeinterface #207 <Method Object Context.getConfigurationLock()>
	//*   5   13:astore_2        
	//*   6   14:aload_2         
	//*   7   15:monitorenter    
		{
			interpreter.getEventPlayer().play(list);
	//    8   16:aload_0         
	//    9   17:getfield        #95  <Field Interpreter interpreter>
	//   10   20:invokevirtual   #211 <Method EventPlayer Interpreter.getEventPlayer()>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #216 <Method void EventPlayer.play(List)>
		}
	//   13   27:aload_2         
	//   14   28:monitorexit     
		return;
	//   15   29:return          
		list;
	//   16   30:astore_1        
		obj;
	//   17   31:aload_2         
		JVM INSTR monitorexit ;
	//   18   32:monitorexit     
		throw list;
	//   19   33:aload_1         
	//   20   34:athrow          
	}

	protected ElementPath initialElementPath()
	{
		return new ElementPath();
	//    0    0:new             #220 <Class ElementPath>
	//    1    3:dup             
	//    2    4:invokespecial   #221 <Method void ElementPath()>
	//    3    7:areturn         
	}

	public List recallSafeConfiguration()
	{
		return (List)context.getObject("SAFE_JORAN_CONFIGURATION");
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Context context>
	//    2    4:ldc1            #224 <String "SAFE_JORAN_CONFIGURATION">
	//    3    6:invokeinterface #228 <Method Object Context.getObject(String)>
	//    4   11:checkcast       #230 <Class List>
	//    5   14:areturn         
	}

	public void registerSafeConfiguration()
	{
		context.putObject("SAFE_JORAN_CONFIGURATION", ((Object) (interpreter.getEventPlayer().getCopyOfPlayerEventList())));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Context context>
	//    2    4:ldc1            #224 <String "SAFE_JORAN_CONFIGURATION">
	//    3    6:aload_0         
	//    4    7:getfield        #95  <Field Interpreter interpreter>
	//    5   10:invokevirtual   #211 <Method EventPlayer Interpreter.getEventPlayer()>
	//    6   13:invokevirtual   #234 <Method List EventPlayer.getCopyOfPlayerEventList()>
	//    7   16:invokeinterface #238 <Method void Context.putObject(String, Object)>
	//    8   21:return          
	}

	protected Interpreter interpreter;
}
