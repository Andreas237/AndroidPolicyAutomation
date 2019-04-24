// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.MDC;
import org.slf4j.Marker;

// Referenced classes of package ch.qos.logback.classic.turbo:
//			TurboFilter, MDCValueLevelPair

public class DynamicThresholdFilter extends TurboFilter
{

	public DynamicThresholdFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void TurboFilter()>
		valueLevelMap = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void HashMap()>
	//    6   12:putfield        #23  <Field Map valueLevelMap>
		defaultThreshold = Level.ERROR;
	//    7   15:aload_0         
	//    8   16:getstatic       #28  <Field Level Level.ERROR>
	//    9   19:putfield        #30  <Field Level defaultThreshold>
		onHigherOrEqual = FilterReply.NEUTRAL;
	//   10   22:aload_0         
	//   11   23:getstatic       #35  <Field FilterReply FilterReply.NEUTRAL>
	//   12   26:putfield        #37  <Field FilterReply onHigherOrEqual>
		onLower = FilterReply.DENY;
	//   13   29:aload_0         
	//   14   30:getstatic       #40  <Field FilterReply FilterReply.DENY>
	//   15   33:putfield        #42  <Field FilterReply onLower>
	//   16   36:return          
	}

	public void addMDCValueLevelPair(MDCValueLevelPair mdcvaluelevelpair)
	{
		if(valueLevelMap.containsKey(((Object) (mdcvaluelevelpair.getValue()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Map valueLevelMap>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #51  <Method String MDCValueLevelPair.getValue()>
	//*   4    8:invokeinterface #57  <Method boolean Map.containsKey(Object)>
	//*   5   13:ifeq            49
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   16:new             #59  <Class StringBuilder>
	//    7   19:dup             
	//    8   20:invokespecial   #60  <Method void StringBuilder()>
	//    9   23:astore_2        
			stringbuilder.append(mdcvaluelevelpair.getValue());
	//   10   24:aload_2         
	//   11   25:aload_1         
	//   12   26:invokevirtual   #51  <Method String MDCValueLevelPair.getValue()>
	//   13   29:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   14   32:pop             
			stringbuilder.append(" has been already set");
	//   15   33:aload_2         
	//   16   34:ldc1            #66  <String " has been already set">
	//   17   36:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   18   39:pop             
			addError(stringbuilder.toString());
	//   19   40:aload_0         
	//   20   41:aload_2         
	//   21   42:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   22   45:invokevirtual   #73  <Method void addError(String)>
			return;
	//   23   48:return          
		} else
		{
			valueLevelMap.put(((Object) (mdcvaluelevelpair.getValue())), ((Object) (mdcvaluelevelpair.getLevel())));
	//   24   49:aload_0         
	//   25   50:getfield        #23  <Field Map valueLevelMap>
	//   26   53:aload_1         
	//   27   54:invokevirtual   #51  <Method String MDCValueLevelPair.getValue()>
	//   28   57:aload_1         
	//   29   58:invokevirtual   #77  <Method Level MDCValueLevelPair.getLevel()>
	//   30   61:invokeinterface #81  <Method Object Map.put(Object, Object)>
	//   31   66:pop             
			return;
	//   32   67:return          
		}
	}

	public FilterReply decide(Marker marker, Logger logger, Level level, String s, Object aobj[], Throwable throwable)
	{
		logger = ((Logger) (MDC.get(key)));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field String key>
	//    2    4:invokestatic    #91  <Method String MDC.get(String)>
	//    3    7:astore_2        
		if(!isStarted())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #95  <Method boolean isStarted()>
	//*   6   12:ifne            19
			return FilterReply.NEUTRAL;
	//    7   15:getstatic       #35  <Field FilterReply FilterReply.NEUTRAL>
	//    8   18:areturn         
		marker = null;
	//    9   19:aconst_null     
	//   10   20:astore_1        
		if(logger != null)
	//*  11   21:aload_2         
	//*  12   22:ifnull          39
			marker = ((Marker) ((Level)valueLevelMap.get(((Object) (logger)))));
	//   13   25:aload_0         
	//   14   26:getfield        #23  <Field Map valueLevelMap>
	//   15   29:aload_2         
	//   16   30:invokeinterface #98  <Method Object Map.get(Object)>
	//   17   35:checkcast       #25  <Class Level>
	//   18   38:astore_1        
		logger = ((Logger) (marker));
	//   19   39:aload_1         
	//   20   40:astore_2        
		if(marker == null)
	//*  21   41:aload_1         
	//*  22   42:ifnonnull       50
			logger = ((Logger) (defaultThreshold));
	//   23   45:aload_0         
	//   24   46:getfield        #30  <Field Level defaultThreshold>
	//   25   49:astore_2        
		if(level.isGreaterOrEqual(((Level) (logger))))
	//*  26   50:aload_3         
	//*  27   51:aload_2         
	//*  28   52:invokevirtual   #102 <Method boolean Level.isGreaterOrEqual(Level)>
	//*  29   55:ifeq            63
			return onHigherOrEqual;
	//   30   58:aload_0         
	//   31   59:getfield        #37  <Field FilterReply onHigherOrEqual>
	//   32   62:areturn         
		else
			return onLower;
	//   33   63:aload_0         
	//   34   64:getfield        #42  <Field FilterReply onLower>
	//   35   67:areturn         
	}

	public Level getDefaultThreshold()
	{
		return defaultThreshold;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Level defaultThreshold>
	//    2    4:areturn         
	}

	public String getKey()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field String key>
	//    2    4:areturn         
	}

	public FilterReply getOnHigherOrEqual()
	{
		return onHigherOrEqual;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field FilterReply onHigherOrEqual>
	//    2    4:areturn         
	}

	public FilterReply getOnLower()
	{
		return onLower;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field FilterReply onLower>
	//    2    4:areturn         
	}

	public void setDefaultThreshold(Level level)
	{
		defaultThreshold = level;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field Level defaultThreshold>
	//    3    5:return          
	}

	public void setKey(String s)
	{
		key = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field String key>
	//    3    5:return          
	}

	public void setOnHigherOrEqual(FilterReply filterreply)
	{
		onHigherOrEqual = filterreply;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field FilterReply onHigherOrEqual>
	//    3    5:return          
	}

	public void setOnLower(FilterReply filterreply)
	{
		onLower = filterreply;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field FilterReply onLower>
	//    3    5:return          
	}

	public void start()
	{
		if(key == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field String key>
	//*   2    4:ifnonnull       13
			addError("No key name was specified");
	//    3    7:aload_0         
	//    4    8:ldc1            #116 <String "No key name was specified">
	//    5   10:invokevirtual   #73  <Method void addError(String)>
		super.start();
	//    6   13:aload_0         
	//    7   14:invokespecial   #118 <Method void TurboFilter.start()>
	//    8   17:return          
	}

	private Level defaultThreshold;
	private String key;
	private FilterReply onHigherOrEqual;
	private FilterReply onLower;
	private Map valueLevelMap;
}
