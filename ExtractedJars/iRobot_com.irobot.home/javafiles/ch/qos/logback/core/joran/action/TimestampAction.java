// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.CachingDateFormatter;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.core.joran.action:
//			Action, ActionUtil

public class TimestampAction extends Action
{

	public TimestampAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Action()>
		inError = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #24  <Field boolean inError>
	//    5    9:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		s = attributes.getValue("key");
	//    0    0:aload_3         
	//    1    1:ldc1            #28  <String "key">
	//    2    3:invokeinterface #34  <Method String Attributes.getValue(String)>
	//    3    8:astore_2        
		if(OptionHelper.isEmpty(s))
	//*   4    9:aload_2         
	//*   5   10:invokestatic    #40  <Method boolean OptionHelper.isEmpty(String)>
	//*   6   13:ifeq            27
		{
			addError("Attribute named [key] cannot be empty");
	//    7   16:aload_0         
	//    8   17:ldc1            #42  <String "Attribute named [key] cannot be empty">
	//    9   19:invokevirtual   #46  <Method void addError(String)>
			inError = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #24  <Field boolean inError>
		}
		String s1 = attributes.getValue(DATE_PATTERN_ATTRIBUTE);
	//   13   27:aload_3         
	//   14   28:getstatic       #48  <Field String DATE_PATTERN_ATTRIBUTE>
	//   15   31:invokeinterface #34  <Method String Attributes.getValue(String)>
	//   16   36:astore          6
		if(OptionHelper.isEmpty(s1))
	//*  17   38:aload           6
	//*  18   40:invokestatic    #40  <Method boolean OptionHelper.isEmpty(String)>
	//*  19   43:ifeq            94
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   20   46:new             #50  <Class StringBuilder>
	//   21   49:dup             
	//   22   50:invokespecial   #51  <Method void StringBuilder()>
	//   23   53:astore          7
			stringbuilder.append("Attribute named [");
	//   24   55:aload           7
	//   25   57:ldc1            #53  <String "Attribute named [">
	//   26   59:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   27   62:pop             
			stringbuilder.append(DATE_PATTERN_ATTRIBUTE);
	//   28   63:aload           7
	//   29   65:getstatic       #48  <Field String DATE_PATTERN_ATTRIBUTE>
	//   30   68:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   31   71:pop             
			stringbuilder.append("] cannot be empty");
	//   32   72:aload           7
	//   33   74:ldc1            #59  <String "] cannot be empty">
	//   34   76:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   35   79:pop             
			addError(stringbuilder.toString());
	//   36   80:aload_0         
	//   37   81:aload           7
	//   38   83:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   39   86:invokevirtual   #46  <Method void addError(String)>
			inError = true;
	//   40   89:aload_0         
	//   41   90:iconst_1        
	//   42   91:putfield        #24  <Field boolean inError>
		}
		String s2 = attributes.getValue(TIME_REFERENCE_ATTRIBUTE);
	//   43   94:aload_3         
	//   44   95:getstatic       #65  <Field String TIME_REFERENCE_ATTRIBUTE>
	//   45   98:invokeinterface #34  <Method String Attributes.getValue(String)>
	//   46  103:astore          7
		long l;
		if(CONTEXT_BIRTH.equalsIgnoreCase(s2))
	//*  47  105:getstatic       #67  <Field String CONTEXT_BIRTH>
	//*  48  108:aload           7
	//*  49  110:invokevirtual   #72  <Method boolean String.equalsIgnoreCase(String)>
	//*  50  113:ifeq            136
		{
			addInfo("Using context birth as time reference.");
	//   51  116:aload_0         
	//   52  117:ldc1            #74  <String "Using context birth as time reference.">
	//   53  119:invokevirtual   #77  <Method void addInfo(String)>
			l = context.getBirthTime();
	//   54  122:aload_0         
	//   55  123:getfield        #81  <Field Context context>
	//   56  126:invokeinterface #87  <Method long Context.getBirthTime()>
	//   57  131:lstore          4
		} else
	//*  58  133:goto            147
		{
			l = System.currentTimeMillis();
	//   59  136:invokestatic    #92  <Method long System.currentTimeMillis()>
	//   60  139:lstore          4
			addInfo("Using current interpretation time, i.e. now, as time reference.");
	//   61  141:aload_0         
	//   62  142:ldc1            #94  <String "Using current interpretation time, i.e. now, as time reference.">
	//   63  144:invokevirtual   #77  <Method void addInfo(String)>
		}
		if(inError)
	//*  64  147:aload_0         
	//*  65  148:getfield        #24  <Field boolean inError>
	//*  66  151:ifeq            155
		{
			return;
	//   67  154:return          
		} else
		{
			attributes = ((Attributes) (ActionUtil.stringToScope(attributes.getValue("scope"))));
	//   68  155:aload_3         
	//   69  156:ldc1            #96  <String "scope">
	//   70  158:invokeinterface #34  <Method String Attributes.getValue(String)>
	//   71  163:invokestatic    #102 <Method ActionUtil$Scope ActionUtil.stringToScope(String)>
	//   72  166:astore_3        
			s1 = (new CachingDateFormatter(s1)).format(l);
	//   73  167:new             #104 <Class CachingDateFormatter>
	//   74  170:dup             
	//   75  171:aload           6
	//   76  173:invokespecial   #106 <Method void CachingDateFormatter(String)>
	//   77  176:lload           4
	//   78  178:invokevirtual   #110 <Method String CachingDateFormatter.format(long)>
	//   79  181:astore          6
			StringBuilder stringbuilder1 = new StringBuilder();
	//   80  183:new             #50  <Class StringBuilder>
	//   81  186:dup             
	//   82  187:invokespecial   #51  <Method void StringBuilder()>
	//   83  190:astore          7
			stringbuilder1.append("Adding property to the context with key=\"");
	//   84  192:aload           7
	//   85  194:ldc1            #112 <String "Adding property to the context with key=\"">
	//   86  196:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   87  199:pop             
			stringbuilder1.append(s);
	//   88  200:aload           7
	//   89  202:aload_2         
	//   90  203:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   91  206:pop             
			stringbuilder1.append("\" and value=\"");
	//   92  207:aload           7
	//   93  209:ldc1            #114 <String "\" and value=\"">
	//   94  211:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   95  214:pop             
			stringbuilder1.append(s1);
	//   96  215:aload           7
	//   97  217:aload           6
	//   98  219:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   99  222:pop             
			stringbuilder1.append("\" to the ");
	//  100  223:aload           7
	//  101  225:ldc1            #116 <String "\" to the ">
	//  102  227:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  103  230:pop             
			stringbuilder1.append(((Object) (attributes)));
	//  104  231:aload           7
	//  105  233:aload_3         
	//  106  234:invokevirtual   #119 <Method StringBuilder StringBuilder.append(Object)>
	//  107  237:pop             
			stringbuilder1.append(" scope");
	//  108  238:aload           7
	//  109  240:ldc1            #121 <String " scope">
	//  110  242:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  111  245:pop             
			addInfo(stringbuilder1.toString());
	//  112  246:aload_0         
	//  113  247:aload           7
	//  114  249:invokevirtual   #63  <Method String StringBuilder.toString()>
	//  115  252:invokevirtual   #77  <Method void addInfo(String)>
			ActionUtil.setProperty(interpretationcontext, s, s1, ((ActionUtil.Scope) (attributes)));
	//  116  255:aload_1         
	//  117  256:aload_2         
	//  118  257:aload           6
	//  119  259:aload_3         
	//  120  260:invokestatic    #125 <Method void ActionUtil.setProperty(InterpretationContext, String, String, ActionUtil$Scope)>
			return;
	//  121  263:return          
		}
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
	//    0    0:return          
	}

	static String CONTEXT_BIRTH = "contextBirth";
	static String DATE_PATTERN_ATTRIBUTE = "datePattern";
	static String TIME_REFERENCE_ATTRIBUTE = "timeReference";
	boolean inError;

	static 
	{
	//    0    0:return          
	}
}
