// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.turbo.ReconfigureOnChangeFilter;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.util.*;
import org.xml.sax.Attributes;

public class ConfigurationAction extends Action
{

	public ConfigurationAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Action()>
	//    2    4:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		String s1 = OptionHelper.getSystemProperty("logback.debug");
	//    0    0:ldc1            #8   <String "logback.debug">
	//    1    2:invokestatic    #30  <Method String OptionHelper.getSystemProperty(String)>
	//    2    5:astore          4
		s = s1;
	//    3    7:aload           4
	//    4    9:astore_2        
		if(s1 == null)
	//*   5   10:aload           4
	//*   6   12:ifnonnull       28
			s = interpretationcontext.subst(attributes.getValue("debug"));
	//    7   15:aload_1         
	//    8   16:aload_3         
	//    9   17:ldc1            #11  <String "debug">
	//   10   19:invokeinterface #35  <Method String Attributes.getValue(String)>
	//   11   24:invokevirtual   #40  <Method String InterpretationContext.subst(String)>
	//   12   27:astore_2        
		if(!OptionHelper.isEmpty(s) && !s.equalsIgnoreCase("false") && !s.equalsIgnoreCase("null"))
	//*  13   28:aload_2         
	//*  14   29:invokestatic    #44  <Method boolean OptionHelper.isEmpty(String)>
	//*  15   32:ifne            66
	//*  16   35:aload_2         
	//*  17   36:ldc1            #46  <String "false">
	//*  18   38:invokevirtual   #51  <Method boolean String.equalsIgnoreCase(String)>
	//*  19   41:ifne            66
	//*  20   44:aload_2         
	//*  21   45:ldc1            #53  <String "null">
	//*  22   47:invokevirtual   #51  <Method boolean String.equalsIgnoreCase(String)>
	//*  23   50:ifeq            56
	//*  24   53:goto            66
			OnConsoleStatusListener.addNewInstanceToContext(context);
	//   25   56:aload_0         
	//   26   57:getfield        #57  <Field ch.qos.logback.core.Context context>
	//   27   60:invokestatic    #63  <Method void OnConsoleStatusListener.addNewInstanceToContext(ch.qos.logback.core.Context)>
		else
	//*  28   63:goto            72
			addInfo("debug attribute not set");
	//   29   66:aload_0         
	//   30   67:ldc1            #65  <String "debug attribute not set">
	//   31   69:invokevirtual   #69  <Method void addInfo(String)>
		processScanAttrib(interpretationcontext, attributes);
	//   32   72:aload_0         
	//   33   73:aload_1         
	//   34   74:aload_3         
	//   35   75:invokevirtual   #73  <Method void processScanAttrib(InterpretationContext, Attributes)>
		(new ContextUtil(context)).addHostNameAsProperty();
	//   36   78:new             #75  <Class ContextUtil>
	//   37   81:dup             
	//   38   82:aload_0         
	//   39   83:getfield        #57  <Field ch.qos.logback.core.Context context>
	//   40   86:invokespecial   #77  <Method void ContextUtil(ch.qos.logback.core.Context)>
	//   41   89:invokevirtual   #80  <Method void ContextUtil.addHostNameAsProperty()>
		interpretationcontext.pushObject(((Object) (getContext())));
	//   42   92:aload_1         
	//   43   93:aload_0         
	//   44   94:invokevirtual   #84  <Method ch.qos.logback.core.Context getContext()>
	//   45   97:invokevirtual   #88  <Method void InterpretationContext.pushObject(Object)>
	//   46  100:return          
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
		addInfo("End of configuration.");
	//    0    0:aload_0         
	//    1    1:ldc1            #92  <String "End of configuration.">
	//    2    3:invokevirtual   #69  <Method void addInfo(String)>
		interpretationcontext.popObject();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #96  <Method Object InterpretationContext.popObject()>
	//    5   10:pop             
	//    6   11:return          
	}

	String getSystemProperty(String s)
	{
		try
		{
			s = System.getProperty(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #103 <Method String System.getProperty(String)>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
	//*   5    7:aconst_null     
	//*   6    8:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return s;
	//*   7    9:astore_1        
	//*   8   10:goto            7
	}

	void processScanAttrib(InterpretationContext interpretationcontext, Attributes attributes)
	{
		String s = interpretationcontext.subst(attributes.getValue("scan"));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:ldc1            #14  <String "scan">
	//    3    4:invokeinterface #35  <Method String Attributes.getValue(String)>
	//    4    9:invokevirtual   #40  <Method String InterpretationContext.subst(String)>
	//    5   12:astore          4
		if(!OptionHelper.isEmpty(s) && !"false".equalsIgnoreCase(s))
	//*   6   14:aload           4
	//*   7   16:invokestatic    #44  <Method boolean OptionHelper.isEmpty(String)>
	//*   8   19:ifne            175
	//*   9   22:ldc1            #46  <String "false">
	//*  10   24:aload           4
	//*  11   26:invokevirtual   #51  <Method boolean String.equalsIgnoreCase(String)>
	//*  12   29:ifne            175
		{
			ReconfigureOnChangeFilter reconfigureonchangefilter = new ReconfigureOnChangeFilter();
	//   13   32:new             #107 <Class ReconfigureOnChangeFilter>
	//   14   35:dup             
	//   15   36:invokespecial   #108 <Method void ReconfigureOnChangeFilter()>
	//   16   39:astore_3        
			reconfigureonchangefilter.setContext(context);
	//   17   40:aload_3         
	//   18   41:aload_0         
	//   19   42:getfield        #57  <Field ch.qos.logback.core.Context context>
	//   20   45:invokevirtual   #111 <Method void ReconfigureOnChangeFilter.setContext(ch.qos.logback.core.Context)>
			interpretationcontext = ((InterpretationContext) (interpretationcontext.subst(attributes.getValue("scanPeriod"))));
	//   21   48:aload_1         
	//   22   49:aload_2         
	//   23   50:ldc1            #17  <String "scanPeriod">
	//   24   52:invokeinterface #35  <Method String Attributes.getValue(String)>
	//   25   57:invokevirtual   #40  <Method String InterpretationContext.subst(String)>
	//   26   60:astore_1        
			if(!OptionHelper.isEmpty(((String) (interpretationcontext))))
	//*  27   61:aload_1         
	//*  28   62:invokestatic    #44  <Method boolean OptionHelper.isEmpty(String)>
	//*  29   65:ifne            152
				try
				{
					interpretationcontext = ((InterpretationContext) (Duration.valueOf(((String) (interpretationcontext)))));
	//   30   68:aload_1         
	//   31   69:invokestatic    #117 <Method Duration Duration.valueOf(String)>
	//   32   72:astore_1        
					reconfigureonchangefilter.setRefreshPeriod(((Duration) (interpretationcontext)).getMilliseconds());
	//   33   73:aload_3         
	//   34   74:aload_1         
	//   35   75:invokevirtual   #121 <Method long Duration.getMilliseconds()>
	//   36   78:invokevirtual   #125 <Method void ReconfigureOnChangeFilter.setRefreshPeriod(long)>
					attributes = ((Attributes) (new StringBuilder()));
	//   37   81:new             #127 <Class StringBuilder>
	//   38   84:dup             
	//   39   85:invokespecial   #128 <Method void StringBuilder()>
	//   40   88:astore_2        
					((StringBuilder) (attributes)).append("Setting ReconfigureOnChangeFilter scanning period to ");
	//   41   89:aload_2         
	//   42   90:ldc1            #130 <String "Setting ReconfigureOnChangeFilter scanning period to ">
	//   43   92:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   44   95:pop             
					((StringBuilder) (attributes)).append(((Object) (interpretationcontext)));
	//   45   96:aload_2         
	//   46   97:aload_1         
	//   47   98:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
	//   48  101:pop             
					addInfo(((StringBuilder) (attributes)).toString());
	//   49  102:aload_0         
	//   50  103:aload_2         
	//   51  104:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   52  107:invokevirtual   #69  <Method void addInfo(String)>
				}
	//*  53  110:goto            152
				// Misplaced declaration of an exception variable
				catch(InterpretationContext interpretationcontext)
	//*  54  113:astore_1        
				{
					attributes = ((Attributes) (new StringBuilder()));
	//   55  114:new             #127 <Class StringBuilder>
	//   56  117:dup             
	//   57  118:invokespecial   #128 <Method void StringBuilder()>
	//   58  121:astore_2        
					((StringBuilder) (attributes)).append("Error while converting [");
	//   59  122:aload_2         
	//   60  123:ldc1            #143 <String "Error while converting [">
	//   61  125:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   62  128:pop             
					((StringBuilder) (attributes)).append(s);
	//   63  129:aload_2         
	//   64  130:aload           4
	//   65  132:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   66  135:pop             
					((StringBuilder) (attributes)).append("] to long");
	//   67  136:aload_2         
	//   68  137:ldc1            #145 <String "] to long">
	//   69  139:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   70  142:pop             
					addError(((StringBuilder) (attributes)).toString(), ((Throwable) (interpretationcontext)));
	//   71  143:aload_0         
	//   72  144:aload_2         
	//   73  145:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   74  148:aload_1         
	//   75  149:invokevirtual   #149 <Method void addError(String, Throwable)>
				}
			reconfigureonchangefilter.start();
	//   76  152:aload_3         
	//   77  153:invokevirtual   #152 <Method void ReconfigureOnChangeFilter.start()>
			interpretationcontext = ((InterpretationContext) ((LoggerContext)context));
	//   78  156:aload_0         
	//   79  157:getfield        #57  <Field ch.qos.logback.core.Context context>
	//   80  160:checkcast       #154 <Class LoggerContext>
	//   81  163:astore_1        
			addInfo("Adding ReconfigureOnChangeFilter as a turbo filter");
	//   82  164:aload_0         
	//   83  165:ldc1            #156 <String "Adding ReconfigureOnChangeFilter as a turbo filter">
	//   84  167:invokevirtual   #69  <Method void addInfo(String)>
			((LoggerContext) (interpretationcontext)).addTurboFilter(((ch.qos.logback.classic.turbo.TurboFilter) (reconfigureonchangefilter)));
	//   85  170:aload_1         
	//   86  171:aload_3         
	//   87  172:invokevirtual   #160 <Method void LoggerContext.addTurboFilter(ch.qos.logback.classic.turbo.TurboFilter)>
		}
	//   88  175:return          
	}

	static final String DEBUG_SYSTEM_PROPERTY_KEY = "logback.debug";
	static final String INTERNAL_DEBUG_ATTR = "debug";
	static final String SCAN_ATTR = "scan";
	static final String SCAN_PERIOD_ATTR = "scanPeriod";
}
