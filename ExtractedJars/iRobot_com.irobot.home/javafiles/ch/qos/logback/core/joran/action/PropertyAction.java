// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.io.*;
import java.net.URL;
import java.util.Properties;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.core.joran.action:
//			Action, ActionUtil

public class PropertyAction extends Action
{

	public PropertyAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Action()>
	//    2    4:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		Object obj;
		String s1;
		if("substitutionProperty".equals(((Object) (s))))
	//*   0    0:ldc1            #25  <String "substitutionProperty">
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            15
			addWarn("[substitutionProperty] element has been deprecated. Please use the [property] element instead.");
	//    4    9:aload_0         
	//    5   10:ldc1            #33  <String "[substitutionProperty] element has been deprecated. Please use the [property] element instead.">
	//    6   12:invokevirtual   #37  <Method void addWarn(String)>
		s = attributes.getValue("name");
	//    7   15:aload_3         
	//    8   16:ldc1            #39  <String "name">
	//    9   18:invokeinterface #45  <Method String Attributes.getValue(String)>
	//   10   23:astore_2        
		s1 = attributes.getValue("value");
	//   11   24:aload_3         
	//   12   25:ldc1            #47  <String "value">
	//   13   27:invokeinterface #45  <Method String Attributes.getValue(String)>
	//   14   32:astore          5
		obj = ((Object) (ActionUtil.stringToScope(attributes.getValue("scope"))));
	//   15   34:aload_3         
	//   16   35:ldc1            #49  <String "scope">
	//   17   37:invokeinterface #45  <Method String Attributes.getValue(String)>
	//   18   42:invokestatic    #55  <Method ActionUtil$Scope ActionUtil.stringToScope(String)>
	//   19   45:astore          4
		if(!checkFileAttributeSanity(attributes)) goto _L2; else goto _L1
	//   20   47:aload_0         
	//   21   48:aload_3         
	//   22   49:invokevirtual   #59  <Method boolean checkFileAttributeSanity(Attributes)>
	//   23   52:ifeq            168
_L1:
		s = interpretationcontext.subst(attributes.getValue("file"));
	//   24   55:aload_1         
	//   25   56:aload_3         
	//   26   57:ldc1            #61  <String "file">
	//   27   59:invokeinterface #45  <Method String Attributes.getValue(String)>
	//   28   64:invokevirtual   #66  <Method String InterpretationContext.subst(String)>
	//   29   67:astore_2        
		loadAndSetProperties(interpretationcontext, ((InputStream) (new FileInputStream(s))), ((ActionUtil.Scope) (obj)));
	//   30   68:aload_0         
	//   31   69:aload_1         
	//   32   70:new             #68  <Class FileInputStream>
	//   33   73:dup             
	//   34   74:aload_2         
	//   35   75:invokespecial   #70  <Method void FileInputStream(String)>
	//   36   78:aload           4
	//   37   80:invokevirtual   #74  <Method void loadAndSetProperties(InterpretationContext, InputStream, ActionUtil$Scope)>
		return;
	//   38   83:return          
		attributes;
	//   39   84:astore_3        
		obj = ((Object) (new StringBuilder()));
	//   40   85:new             #76  <Class StringBuilder>
	//   41   88:dup             
	//   42   89:invokespecial   #77  <Method void StringBuilder()>
	//   43   92:astore          4
		interpretationcontext = "Could not read properties file [";
	//   44   94:ldc1            #79  <String "Could not read properties file [">
	//   45   96:astore_1        
_L6:
		((StringBuilder) (obj)).append(((String) (interpretationcontext)));
	//   46   97:aload           4
	//   47   99:aload_1         
	//   48  100:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   49  103:pop             
		((StringBuilder) (obj)).append(s);
	//   50  104:aload           4
	//   51  106:aload_2         
	//   52  107:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   53  110:pop             
		((StringBuilder) (obj)).append("].");
	//   54  111:aload           4
	//   55  113:ldc1            #85  <String "].">
	//   56  115:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   57  118:pop             
		addError(((StringBuilder) (obj)).toString(), ((Throwable) (attributes)));
	//   58  119:aload_0         
	//   59  120:aload           4
	//   60  122:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   61  125:aload_3         
	//   62  126:invokevirtual   #93  <Method void addError(String, Throwable)>
		return;
	//   63  129:return          
_L7:
		interpretationcontext = ((InterpretationContext) (new StringBuilder()));
	//   64  130:new             #76  <Class StringBuilder>
	//   65  133:dup             
	//   66  134:invokespecial   #77  <Method void StringBuilder()>
	//   67  137:astore_1        
		attributes = "Could not find properties file [";
	//   68  138:ldc1            #95  <String "Could not find properties file [">
	//   69  140:astore_3        
_L5:
		((StringBuilder) (interpretationcontext)).append(((String) (attributes)));
	//   70  141:aload_1         
	//   71  142:aload_3         
	//   72  143:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   73  146:pop             
		((StringBuilder) (interpretationcontext)).append(s);
	//   74  147:aload_1         
	//   75  148:aload_2         
	//   76  149:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   77  152:pop             
		((StringBuilder) (interpretationcontext)).append("].");
	//   78  153:aload_1         
	//   79  154:ldc1            #85  <String "].">
	//   80  156:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   81  159:pop             
		interpretationcontext = ((InterpretationContext) (((StringBuilder) (interpretationcontext)).toString()));
	//   82  160:aload_1         
	//   83  161:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   84  164:astore_1        
		  goto _L3
	//*  85  165:goto            272
_L2:
		if(!checkResourceAttributeSanity(attributes))
			break MISSING_BLOCK_LABEL_240;
	//   86  168:aload_0         
	//   87  169:aload_3         
	//   88  170:invokevirtual   #98  <Method boolean checkResourceAttributeSanity(Attributes)>
	//   89  173:ifeq            240
		s = interpretationcontext.subst(attributes.getValue("resource"));
	//   90  176:aload_1         
	//   91  177:aload_3         
	//   92  178:ldc1            #11  <String "resource">
	//   93  180:invokeinterface #45  <Method String Attributes.getValue(String)>
	//   94  185:invokevirtual   #66  <Method String InterpretationContext.subst(String)>
	//   95  188:astore_2        
		attributes = ((Attributes) (Loader.getResourceBySelfClassLoader(s)));
	//   96  189:aload_2         
	//   97  190:invokestatic    #104 <Method URL Loader.getResourceBySelfClassLoader(String)>
	//   98  193:astore_3        
		if(attributes != null)
			break; /* Loop/switch isn't completed */
	//   99  194:aload_3         
	//  100  195:ifnonnull       212
		interpretationcontext = ((InterpretationContext) (new StringBuilder()));
	//  101  198:new             #76  <Class StringBuilder>
	//  102  201:dup             
	//  103  202:invokespecial   #77  <Method void StringBuilder()>
	//  104  205:astore_1        
		attributes = "Could not find resource [";
	//  105  206:ldc1            #106 <String "Could not find resource [">
	//  106  208:astore_3        
		if(true) goto _L5; else goto _L4
	//  107  209:goto            141
_L4:
		try
		{
			loadAndSetProperties(interpretationcontext, ((URL) (attributes)).openStream(), ((ActionUtil.Scope) (obj)));
	//  108  212:aload_0         
	//  109  213:aload_1         
	//  110  214:aload_3         
	//  111  215:invokevirtual   #112 <Method InputStream URL.openStream()>
	//  112  218:aload           4
	//  113  220:invokevirtual   #74  <Method void loadAndSetProperties(InterpretationContext, InputStream, ActionUtil$Scope)>
			return;
	//  114  223:return          
		}
		// Misplaced declaration of an exception variable
		catch(Attributes attributes)
	//* 115  224:astore_3        
		{
			obj = ((Object) (new StringBuilder()));
	//  116  225:new             #76  <Class StringBuilder>
	//  117  228:dup             
	//  118  229:invokespecial   #77  <Method void StringBuilder()>
	//  119  232:astore          4
		}
		interpretationcontext = "Could not read resource file [";
	//  120  234:ldc1            #114 <String "Could not read resource file [">
	//  121  236:astore_1        
		  goto _L6
	//* 122  237:goto            97
		if(checkValueNameAttributesSanity(attributes))
	//* 123  240:aload_0         
	//* 124  241:aload_3         
	//* 125  242:invokevirtual   #117 <Method boolean checkValueNameAttributesSanity(Attributes)>
	//* 126  245:ifeq            268
		{
			ActionUtil.setProperty(interpretationcontext, s, interpretationcontext.subst(RegularEscapeUtil.basicEscape(s1).trim()), ((ActionUtil.Scope) (obj)));
	//  127  248:aload_1         
	//  128  249:aload_2         
	//  129  250:aload_1         
	//  130  251:aload           5
	//  131  253:invokestatic    #122 <Method String RegularEscapeUtil.basicEscape(String)>
	//  132  256:invokevirtual   #125 <Method String String.trim()>
	//  133  259:invokevirtual   #66  <Method String InterpretationContext.subst(String)>
	//  134  262:aload           4
	//  135  264:invokestatic    #129 <Method void ActionUtil.setProperty(InterpretationContext, String, String, ActionUtil$Scope)>
			return;
	//  136  267:return          
		}
		interpretationcontext = ((InterpretationContext) (INVALID_ATTRIBUTES));
	//  137  268:getstatic       #131 <Field String INVALID_ATTRIBUTES>
	//  138  271:astore_1        
_L3:
		addError(((String) (interpretationcontext)));
	//  139  272:aload_0         
	//  140  273:aload_1         
	//  141  274:invokevirtual   #133 <Method void addError(String)>
		return;
	//  142  277:return          
		interpretationcontext;
	//  143  278:astore_1        
		  goto _L7
	//* 144  279:goto            130
	}

	boolean checkFileAttributeSanity(Attributes attributes)
	{
		String s = attributes.getValue("file");
	//    0    0:aload_1         
	//    1    1:ldc1            #61  <String "file">
	//    2    3:invokeinterface #45  <Method String Attributes.getValue(String)>
	//    3    8:astore_2        
		String s1 = attributes.getValue("name");
	//    4    9:aload_1         
	//    5   10:ldc1            #39  <String "name">
	//    6   12:invokeinterface #45  <Method String Attributes.getValue(String)>
	//    7   17:astore_3        
		String s2 = attributes.getValue("value");
	//    8   18:aload_1         
	//    9   19:ldc1            #47  <String "value">
	//   10   21:invokeinterface #45  <Method String Attributes.getValue(String)>
	//   11   26:astore          4
		attributes = ((Attributes) (attributes.getValue("resource")));
	//   12   28:aload_1         
	//   13   29:ldc1            #11  <String "resource">
	//   14   31:invokeinterface #45  <Method String Attributes.getValue(String)>
	//   15   36:astore_1        
		return !OptionHelper.isEmpty(s) && OptionHelper.isEmpty(s1) && OptionHelper.isEmpty(s2) && OptionHelper.isEmpty(((String) (attributes)));
	//   16   37:aload_2         
	//   17   38:invokestatic    #139 <Method boolean OptionHelper.isEmpty(String)>
	//   18   41:ifne            68
	//   19   44:aload_3         
	//   20   45:invokestatic    #139 <Method boolean OptionHelper.isEmpty(String)>
	//   21   48:ifeq            68
	//   22   51:aload           4
	//   23   53:invokestatic    #139 <Method boolean OptionHelper.isEmpty(String)>
	//   24   56:ifeq            68
	//   25   59:aload_1         
	//   26   60:invokestatic    #139 <Method boolean OptionHelper.isEmpty(String)>
	//   27   63:ifeq            68
	//   28   66:iconst_1        
	//   29   67:ireturn         
	//   30   68:iconst_0        
	//   31   69:ireturn         
	}

	boolean checkResourceAttributeSanity(Attributes attributes)
	{
		String s = attributes.getValue("file");
	//    0    0:aload_1         
	//    1    1:ldc1            #61  <String "file">
	//    2    3:invokeinterface #45  <Method String Attributes.getValue(String)>
	//    3    8:astore_2        
		String s1 = attributes.getValue("name");
	//    4    9:aload_1         
	//    5   10:ldc1            #39  <String "name">
	//    6   12:invokeinterface #45  <Method String Attributes.getValue(String)>
	//    7   17:astore_3        
		String s2 = attributes.getValue("value");
	//    8   18:aload_1         
	//    9   19:ldc1            #47  <String "value">
	//   10   21:invokeinterface #45  <Method String Attributes.getValue(String)>
	//   11   26:astore          4
		return !OptionHelper.isEmpty(attributes.getValue("resource")) && OptionHelper.isEmpty(s1) && OptionHelper.isEmpty(s2) && OptionHelper.isEmpty(s);
	//   12   28:aload_1         
	//   13   29:ldc1            #11  <String "resource">
	//   14   31:invokeinterface #45  <Method String Attributes.getValue(String)>
	//   15   36:invokestatic    #139 <Method boolean OptionHelper.isEmpty(String)>
	//   16   39:ifne            66
	//   17   42:aload_3         
	//   18   43:invokestatic    #139 <Method boolean OptionHelper.isEmpty(String)>
	//   19   46:ifeq            66
	//   20   49:aload           4
	//   21   51:invokestatic    #139 <Method boolean OptionHelper.isEmpty(String)>
	//   22   54:ifeq            66
	//   23   57:aload_2         
	//   24   58:invokestatic    #139 <Method boolean OptionHelper.isEmpty(String)>
	//   25   61:ifeq            66
	//   26   64:iconst_1        
	//   27   65:ireturn         
	//   28   66:iconst_0        
	//   29   67:ireturn         
	}

	boolean checkValueNameAttributesSanity(Attributes attributes)
	{
		String s = attributes.getValue("file");
	//    0    0:aload_1         
	//    1    1:ldc1            #61  <String "file">
	//    2    3:invokeinterface #45  <Method String Attributes.getValue(String)>
	//    3    8:astore_2        
		String s1 = attributes.getValue("name");
	//    4    9:aload_1         
	//    5   10:ldc1            #39  <String "name">
	//    6   12:invokeinterface #45  <Method String Attributes.getValue(String)>
	//    7   17:astore_3        
		String s2 = attributes.getValue("value");
	//    8   18:aload_1         
	//    9   19:ldc1            #47  <String "value">
	//   10   21:invokeinterface #45  <Method String Attributes.getValue(String)>
	//   11   26:astore          4
		attributes = ((Attributes) (attributes.getValue("resource")));
	//   12   28:aload_1         
	//   13   29:ldc1            #11  <String "resource">
	//   14   31:invokeinterface #45  <Method String Attributes.getValue(String)>
	//   15   36:astore_1        
		return !OptionHelper.isEmpty(s1) && !OptionHelper.isEmpty(s2) && OptionHelper.isEmpty(s) && OptionHelper.isEmpty(((String) (attributes)));
	//   16   37:aload_3         
	//   17   38:invokestatic    #139 <Method boolean OptionHelper.isEmpty(String)>
	//   18   41:ifne            68
	//   19   44:aload           4
	//   20   46:invokestatic    #139 <Method boolean OptionHelper.isEmpty(String)>
	//   21   49:ifne            68
	//   22   52:aload_2         
	//   23   53:invokestatic    #139 <Method boolean OptionHelper.isEmpty(String)>
	//   24   56:ifeq            68
	//   25   59:aload_1         
	//   26   60:invokestatic    #139 <Method boolean OptionHelper.isEmpty(String)>
	//   27   63:ifeq            68
	//   28   66:iconst_1        
	//   29   67:ireturn         
	//   30   68:iconst_0        
	//   31   69:ireturn         
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
	//    0    0:return          
	}

	public void finish(InterpretationContext interpretationcontext)
	{
	//    0    0:return          
	}

	void loadAndSetProperties(InterpretationContext interpretationcontext, InputStream inputstream, ActionUtil.Scope scope)
	{
		Properties properties = new Properties();
	//    0    0:new             #145 <Class Properties>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void Properties()>
	//    3    7:astore          4
		properties.load(inputstream);
	//    4    9:aload           4
	//    5   11:aload_2         
	//    6   12:invokevirtual   #150 <Method void Properties.load(InputStream)>
		inputstream.close();
	//    7   15:aload_2         
	//    8   16:invokevirtual   #155 <Method void InputStream.close()>
		ActionUtil.setProperties(interpretationcontext, properties, scope);
	//    9   19:aload_1         
	//   10   20:aload           4
	//   11   22:aload_3         
	//   12   23:invokestatic    #159 <Method void ActionUtil.setProperties(InterpretationContext, Properties, ActionUtil$Scope)>
	//   13   26:return          
	}

	static String INVALID_ATTRIBUTES = "In <property> element, either the \"file\" attribute alone, or the \"resource\" element alone, or both the \"name\" and \"value\" attributes must be set.";
	static final String RESOURCE_ATTRIBUTE = "resource";

	static 
	{
	//    0    0:return          
	}
}
