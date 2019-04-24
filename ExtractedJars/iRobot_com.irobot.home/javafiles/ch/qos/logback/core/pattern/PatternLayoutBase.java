// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.StatusManager;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package ch.qos.logback.core.pattern:
//			ConverterUtil, PostCompileProcessor, Converter

public abstract class PatternLayoutBase extends LayoutBase
{

	public PatternLayoutBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void LayoutBase()>
		instanceConverterMap = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #24  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void HashMap()>
	//    6   12:putfield        #27  <Field Map instanceConverterMap>
		outputPatternAsHeader = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #29  <Field boolean outputPatternAsHeader>
	//   10   20:return          
	}

	public abstract Map getDefaultConverterMap();

	public Map getEffectiveConverterMap()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #24  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void HashMap()>
	//    3    7:astore_1        
		Object obj = ((Object) (getDefaultConverterMap()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #35  <Method Map getDefaultConverterMap()>
	//    6   12:astore_2        
		if(obj != null)
	//*   7   13:aload_2         
	//*   8   14:ifnull          24
			((Map) (hashmap)).putAll(((Map) (obj)));
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokeinterface #41  <Method void Map.putAll(Map)>
		obj = ((Object) (getContext()));
	//   12   24:aload_0         
	//   13   25:invokevirtual   #45  <Method Context getContext()>
	//   14   28:astore_2        
		if(obj != null)
	//*  15   29:aload_2         
	//*  16   30:ifnull          56
		{
			obj = ((Object) ((Map)((Context) (obj)).getObject("PATTERN_RULE_REGISTRY")));
	//   17   33:aload_2         
	//   18   34:ldc1            #47  <String "PATTERN_RULE_REGISTRY">
	//   19   36:invokeinterface #53  <Method Object Context.getObject(String)>
	//   20   41:checkcast       #37  <Class Map>
	//   21   44:astore_2        
			if(obj != null)
	//*  22   45:aload_2         
	//*  23   46:ifnull          56
				((Map) (hashmap)).putAll(((Map) (obj)));
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:invokeinterface #41  <Method void Map.putAll(Map)>
		}
		((Map) (hashmap)).putAll(instanceConverterMap);
	//   27   56:aload_1         
	//   28   57:aload_0         
	//   29   58:getfield        #27  <Field Map instanceConverterMap>
	//   30   61:invokeinterface #41  <Method void Map.putAll(Map)>
		return ((Map) (hashmap));
	//   31   66:aload_1         
	//   32   67:areturn         
	}

	public Map getInstanceConverterMap()
	{
		return instanceConverterMap;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Map instanceConverterMap>
	//    2    4:areturn         
	}

	public String getPattern()
	{
		return pattern;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String pattern>
	//    2    4:areturn         
	}

	public String getPresentationHeader()
	{
		if(outputPatternAsHeader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean outputPatternAsHeader>
	//*   2    4:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #63  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #64  <Method void StringBuilder()>
	//    6   14:astore_1        
			stringbuilder.append(getPresentationHeaderPrefix());
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #67  <Method String getPresentationHeaderPrefix()>
	//   10   20:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(pattern);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #60  <Field String pattern>
	//   15   29:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			return stringbuilder.toString();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   19   37:areturn         
		} else
		{
			return super.getPresentationHeader();
	//   20   38:aload_0         
	//   21   39:invokespecial   #76  <Method String LayoutBase.getPresentationHeader()>
	//   22   42:areturn         
		}
	}

	protected String getPresentationHeaderPrefix()
	{
		return "";
	//    0    0:ldc1            #78  <String "">
	//    1    2:areturn         
	}

	public boolean isOutputPatternAsHeader()
	{
		return outputPatternAsHeader;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean outputPatternAsHeader>
	//    2    4:ireturn         
	}

	protected void setContextForConverters(Converter converter)
	{
		ConverterUtil.setContextForConverters(getContext(), converter);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method Context getContext()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #87  <Method void ConverterUtil.setContextForConverters(Context, Converter)>
	//    4    8:return          
	}

	public void setOutputPatternAsHeader(boolean flag)
	{
		outputPatternAsHeader = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field boolean outputPatternAsHeader>
	//    3    5:return          
	}

	public void setPattern(String s)
	{
		pattern = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field String pattern>
	//    3    5:return          
	}

	public void setPostCompileProcessor(PostCompileProcessor postcompileprocessor)
	{
		postCompileProcessor = postcompileprocessor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #96  <Field PostCompileProcessor postCompileProcessor>
	//    3    5:return          
	}

	public void start()
	{
		if(pattern != null && pattern.length() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field String pattern>
	//*   2    4:ifnull          168
	//*   3    7:aload_0         
	//*   4    8:getfield        #60  <Field String pattern>
	//*   5   11:invokevirtual   #106 <Method int String.length()>
	//*   6   14:ifne            20
	//*   7   17:goto            168
		{
			try
			{
				Parser parser = new Parser(pattern);
	//    8   20:new             #108 <Class Parser>
	//    9   23:dup             
	//   10   24:aload_0         
	//   11   25:getfield        #60  <Field String pattern>
	//   12   28:invokespecial   #110 <Method void Parser(String)>
	//   13   31:astore_1        
				if(getContext() != null)
	//*  14   32:aload_0         
	//*  15   33:invokevirtual   #45  <Method Context getContext()>
	//*  16   36:ifnull          47
					parser.setContext(getContext());
	//   17   39:aload_1         
	//   18   40:aload_0         
	//   19   41:invokevirtual   #45  <Method Context getContext()>
	//   20   44:invokevirtual   #114 <Method void Parser.setContext(Context)>
				head = parser.compile(parser.parse(), getEffectiveConverterMap());
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:aload_1         
	//   24   50:invokevirtual   #118 <Method ch.qos.logback.core.pattern.parser.Node Parser.parse()>
	//   25   53:aload_0         
	//   26   54:invokevirtual   #120 <Method Map getEffectiveConverterMap()>
	//   27   57:invokevirtual   #124 <Method Converter Parser.compile(ch.qos.logback.core.pattern.parser.Node, Map)>
	//   28   60:putfield        #126 <Field Converter head>
				if(postCompileProcessor != null)
	//*  29   63:aload_0         
	//*  30   64:getfield        #96  <Field PostCompileProcessor postCompileProcessor>
	//*  31   67:ifnull          83
					postCompileProcessor.process(head);
	//   32   70:aload_0         
	//   33   71:getfield        #96  <Field PostCompileProcessor postCompileProcessor>
	//   34   74:aload_0         
	//   35   75:getfield        #126 <Field Converter head>
	//   36   78:invokeinterface #131 <Method void PostCompileProcessor.process(Converter)>
				ConverterUtil.setContextForConverters(getContext(), head);
	//   37   83:aload_0         
	//   38   84:invokevirtual   #45  <Method Context getContext()>
	//   39   87:aload_0         
	//   40   88:getfield        #126 <Field Converter head>
	//   41   91:invokestatic    #87  <Method void ConverterUtil.setContextForConverters(Context, Converter)>
				ConverterUtil.startConverters(head);
	//   42   94:aload_0         
	//   43   95:getfield        #126 <Field Converter head>
	//   44   98:invokestatic    #134 <Method void ConverterUtil.startConverters(Converter)>
				super.start();
	//   45  101:aload_0         
	//   46  102:invokespecial   #136 <Method void LayoutBase.start()>
				return;
	//   47  105:return          
			}
			catch(ScanException scanexception)
	//*  48  106:astore_1        
			{
				StatusManager statusmanager = getContext().getStatusManager();
	//   49  107:aload_0         
	//   50  108:invokevirtual   #45  <Method Context getContext()>
	//   51  111:invokeinterface #140 <Method StatusManager Context.getStatusManager()>
	//   52  116:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   53  117:new             #63  <Class StringBuilder>
	//   54  120:dup             
	//   55  121:invokespecial   #64  <Method void StringBuilder()>
	//   56  124:astore_3        
				stringbuilder.append("Failed to parse pattern \"");
	//   57  125:aload_3         
	//   58  126:ldc1            #142 <String "Failed to parse pattern \"">
	//   59  128:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   60  131:pop             
				stringbuilder.append(getPattern());
	//   61  132:aload_3         
	//   62  133:aload_0         
	//   63  134:invokevirtual   #144 <Method String getPattern()>
	//   64  137:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   65  140:pop             
				stringbuilder.append("\".");
	//   66  141:aload_3         
	//   67  142:ldc1            #146 <String "\".">
	//   68  144:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   69  147:pop             
				statusmanager.add(((ch.qos.logback.core.status.Status) (new ErrorStatus(stringbuilder.toString(), ((Object) (this)), ((Throwable) (scanexception))))));
	//   70  148:aload_2         
	//   71  149:new             #148 <Class ErrorStatus>
	//   72  152:dup             
	//   73  153:aload_3         
	//   74  154:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   75  157:aload_0         
	//   76  158:aload_1         
	//   77  159:invokespecial   #151 <Method void ErrorStatus(String, Object, Throwable)>
	//   78  162:invokeinterface #157 <Method void StatusManager.add(ch.qos.logback.core.status.Status)>
				return;
	//   79  167:return          
			}
		} else
		{
			addError("Empty or null pattern.");
	//   80  168:aload_0         
	//   81  169:ldc1            #159 <String "Empty or null pattern.">
	//   82  171:invokevirtual   #162 <Method void addError(String)>
			return;
	//   83  174:return          
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #63  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object)this).getClass().getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #168 <Method Class Object.getClass()>
	//    7   13:invokevirtual   #173 <Method String Class.getName()>
	//    8   16:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append("(\"");
	//   10   20:aload_1         
	//   11   21:ldc1            #175 <String "(\"">
	//   12   23:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(getPattern());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #144 <Method String getPattern()>
	//   17   32:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		stringbuilder.append("\")");
	//   19   36:aload_1         
	//   20   37:ldc1            #177 <String "\")">
	//   21   39:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		return stringbuilder.toString();
	//   23   43:aload_1         
	//   24   44:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   25   47:areturn         
	}

	protected String writeLoopOnConverters(Object obj)
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #63  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #182 <Method void StringBuilder(int)>
	//    4   10:astore_3        
		for(Converter converter = head; converter != null; converter = converter.getNext())
	//*   5   11:aload_0         
	//*   6   12:getfield        #126 <Field Converter head>
	//*   7   15:astore_2        
	//*   8   16:aload_2         
	//*   9   17:ifnull          34
			converter.write(stringbuilder, obj);
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #188 <Method void Converter.write(StringBuilder, Object)>

	//   14   26:aload_2         
	//   15   27:invokevirtual   #192 <Method Converter Converter.getNext()>
	//   16   30:astore_2        
	//*  17   31:goto            16
		return stringbuilder.toString();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   20   38:areturn         
	}

	Converter head;
	Map instanceConverterMap;
	protected boolean outputPatternAsHeader;
	String pattern;
	protected PostCompileProcessor postCompileProcessor;
}
