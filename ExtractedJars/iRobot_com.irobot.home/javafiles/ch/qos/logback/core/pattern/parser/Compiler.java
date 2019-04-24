// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.*;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Map;

// Referenced classes of package ch.qos.logback.core.pattern.parser:
//			Node, CompositeNode, SimpleKeywordNode

class Compiler extends ContextAwareBase
{

	Compiler(Node node, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ContextAwareBase()>
		top = node;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Node top>
		converterMap = map;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field Map converterMap>
	//    8   14:return          
	}

	private void addToList(Converter converter)
	{
		if(head == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Converter head>
	//*   2    4:ifnonnull       18
		{
			tail = converter;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #29  <Field Converter tail>
			head = converter;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #27  <Field Converter head>
			return;
	//    9   17:return          
		} else
		{
			tail.setNext(converter);
	//   10   18:aload_0         
	//   11   19:getfield        #29  <Field Converter tail>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #34  <Method void Converter.setNext(Converter)>
			tail = converter;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #29  <Field Converter tail>
			return;
	//   17   31:return          
		}
	}

	Converter compile()
	{
		tail = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #29  <Field Converter tail>
		head = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #27  <Field Converter head>
		Node node = top;
	//    6   10:aload_0         
	//    7   11:getfield        #20  <Field Node top>
	//    8   14:astore_2        
label0:
		do
		{
label1:
			{
label2:
				{
					if(node == null)
						break label0;
	//    9   15:aload_2         
	//   10   16:ifnull          365
					Object obj;
					switch(node.type)
	//*  11   19:aload_2         
	//*  12   20:getfield        #44  <Field int Node.type>
					{
	//*  13   23:tableswitch     0 2: default 48
	//	               0 339
	//	               1 202
	//	               2 51
					default:
						break label1;
	//   14   48:goto            357

					case 0: // '\0'
						break label2;

					case 2: // '\002'
						Object obj1 = ((Object) ((CompositeNode)node));
	//   15   51:aload_2         
	//   16   52:checkcast       #46  <Class CompositeNode>
	//   17   55:astore_3        
						obj = ((Object) (createCompositeConverter(((CompositeNode) (obj1)))));
	//   18   56:aload_0         
	//   19   57:aload_3         
	//   20   58:invokevirtual   #50  <Method CompositeConverter createCompositeConverter(CompositeNode)>
	//   21   61:astore_1        
						if(obj == null)
	//*  22   62:aload_1         
	//*  23   63:ifnonnull       151
						{
							obj = ((Object) (new StringBuilder()));
	//   24   66:new             #52  <Class StringBuilder>
	//   25   69:dup             
	//   26   70:invokespecial   #53  <Method void StringBuilder()>
	//   27   73:astore_1        
							((StringBuilder) (obj)).append("Failed to create converter for [%");
	//   28   74:aload_1         
	//   29   75:ldc1            #55  <String "Failed to create converter for [%">
	//   30   77:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   31   80:pop             
							((StringBuilder) (obj)).append(((CompositeNode) (obj1)).getValue());
	//   32   81:aload_1         
	//   33   82:aload_3         
	//   34   83:invokevirtual   #63  <Method Object CompositeNode.getValue()>
	//   35   86:invokevirtual   #66  <Method StringBuilder StringBuilder.append(Object)>
	//   36   89:pop             
							((StringBuilder) (obj)).append("] keyword");
	//   37   90:aload_1         
	//   38   91:ldc1            #68  <String "] keyword">
	//   39   93:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   40   96:pop             
							addError(((StringBuilder) (obj)).toString());
	//   41   97:aload_0         
	//   42   98:aload_1         
	//   43   99:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   44  102:invokevirtual   #76  <Method void addError(String)>
							obj = ((Object) (new StringBuilder()));
	//   45  105:new             #52  <Class StringBuilder>
	//   46  108:dup             
	//   47  109:invokespecial   #53  <Method void StringBuilder()>
	//   48  112:astore_1        
							((StringBuilder) (obj)).append("%PARSER_ERROR[");
	//   49  113:aload_1         
	//   50  114:ldc1            #78  <String "%PARSER_ERROR[">
	//   51  116:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   52  119:pop             
							((StringBuilder) (obj)).append(((CompositeNode) (obj1)).getValue());
	//   53  120:aload_1         
	//   54  121:aload_3         
	//   55  122:invokevirtual   #63  <Method Object CompositeNode.getValue()>
	//   56  125:invokevirtual   #66  <Method StringBuilder StringBuilder.append(Object)>
	//   57  128:pop             
							((StringBuilder) (obj)).append("]");
	//   58  129:aload_1         
	//   59  130:ldc1            #80  <String "]">
	//   60  132:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   61  135:pop             
							obj = ((Object) (new LiteralConverter(((StringBuilder) (obj)).toString())));
	//   62  136:new             #82  <Class LiteralConverter>
	//   63  139:dup             
	//   64  140:aload_1         
	//   65  141:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   66  144:invokespecial   #84  <Method void LiteralConverter(String)>
	//   67  147:astore_1        
						} else
	//*  68  148:goto            233
						{
							((CompositeConverter) (obj)).setFormattingInfo(((CompositeNode) (obj1)).getFormatInfo());
	//   69  151:aload_1         
	//   70  152:aload_3         
	//   71  153:invokevirtual   #88  <Method ch.qos.logback.core.pattern.FormatInfo CompositeNode.getFormatInfo()>
	//   72  156:invokevirtual   #94  <Method void CompositeConverter.setFormattingInfo(ch.qos.logback.core.pattern.FormatInfo)>
							((CompositeConverter) (obj)).setOptionList(((CompositeNode) (obj1)).getOptions());
	//   73  159:aload_1         
	//   74  160:aload_3         
	//   75  161:invokevirtual   #98  <Method java.util.List CompositeNode.getOptions()>
	//   76  164:invokevirtual   #102 <Method void CompositeConverter.setOptionList(java.util.List)>
							obj1 = ((Object) (new Compiler(((CompositeNode) (obj1)).getChildNode(), converterMap)));
	//   77  167:new             #2   <Class Compiler>
	//   78  170:dup             
	//   79  171:aload_3         
	//   80  172:invokevirtual   #106 <Method Node CompositeNode.getChildNode()>
	//   81  175:aload_0         
	//   82  176:getfield        #22  <Field Map converterMap>
	//   83  179:invokespecial   #108 <Method void Compiler(Node, Map)>
	//   84  182:astore_3        
							((Compiler) (obj1)).setContext(context);
	//   85  183:aload_3         
	//   86  184:aload_0         
	//   87  185:getfield        #112 <Field ch.qos.logback.core.Context context>
	//   88  188:invokevirtual   #116 <Method void setContext(ch.qos.logback.core.Context)>
							((CompositeConverter) (obj)).setChildConverter(((Compiler) (obj1)).compile());
	//   89  191:aload_1         
	//   90  192:aload_3         
	//   91  193:invokevirtual   #118 <Method Converter compile()>
	//   92  196:invokevirtual   #121 <Method void CompositeConverter.setChildConverter(Converter)>
						}
						break;
	//   93  199:goto            233

					case 1: // '\001'
						SimpleKeywordNode simplekeywordnode = (SimpleKeywordNode)node;
	//   94  202:aload_2         
	//   95  203:checkcast       #123 <Class SimpleKeywordNode>
	//   96  206:astore_3        
						obj = ((Object) (createConverter(simplekeywordnode)));
	//   97  207:aload_0         
	//   98  208:aload_3         
	//   99  209:invokevirtual   #127 <Method DynamicConverter createConverter(SimpleKeywordNode)>
	//  100  212:astore_1        
						if(obj != null)
	//* 101  213:aload_1         
	//* 102  214:ifnull          241
						{
							((DynamicConverter) (obj)).setFormattingInfo(simplekeywordnode.getFormatInfo());
	//  103  217:aload_1         
	//  104  218:aload_3         
	//  105  219:invokevirtual   #128 <Method ch.qos.logback.core.pattern.FormatInfo SimpleKeywordNode.getFormatInfo()>
	//  106  222:invokevirtual   #131 <Method void DynamicConverter.setFormattingInfo(ch.qos.logback.core.pattern.FormatInfo)>
							((DynamicConverter) (obj)).setOptionList(simplekeywordnode.getOptions());
	//  107  225:aload_1         
	//  108  226:aload_3         
	//  109  227:invokevirtual   #132 <Method java.util.List SimpleKeywordNode.getOptions()>
	//  110  230:invokevirtual   #133 <Method void DynamicConverter.setOptionList(java.util.List)>
						} else
	//* 111  233:aload_0         
	//* 112  234:aload_1         
	//* 113  235:invokespecial   #135 <Method void addToList(Converter)>
	//* 114  238:goto            357
						{
							obj = ((Object) (new StringBuilder()));
	//  115  241:new             #52  <Class StringBuilder>
	//  116  244:dup             
	//  117  245:invokespecial   #53  <Method void StringBuilder()>
	//  118  248:astore_1        
							((StringBuilder) (obj)).append("%PARSER_ERROR[");
	//  119  249:aload_1         
	//  120  250:ldc1            #78  <String "%PARSER_ERROR[">
	//  121  252:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  122  255:pop             
							((StringBuilder) (obj)).append(simplekeywordnode.getValue());
	//  123  256:aload_1         
	//  124  257:aload_3         
	//  125  258:invokevirtual   #136 <Method Object SimpleKeywordNode.getValue()>
	//  126  261:invokevirtual   #66  <Method StringBuilder StringBuilder.append(Object)>
	//  127  264:pop             
							((StringBuilder) (obj)).append("]");
	//  128  265:aload_1         
	//  129  266:ldc1            #80  <String "]">
	//  130  268:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  131  271:pop             
							obj = ((Object) (new LiteralConverter(((StringBuilder) (obj)).toString())));
	//  132  272:new             #82  <Class LiteralConverter>
	//  133  275:dup             
	//  134  276:aload_1         
	//  135  277:invokevirtual   #72  <Method String StringBuilder.toString()>
	//  136  280:invokespecial   #84  <Method void LiteralConverter(String)>
	//  137  283:astore_1        
							StringBuilder stringbuilder = new StringBuilder();
	//  138  284:new             #52  <Class StringBuilder>
	//  139  287:dup             
	//  140  288:invokespecial   #53  <Method void StringBuilder()>
	//  141  291:astore          4
							stringbuilder.append("[");
	//  142  293:aload           4
	//  143  295:ldc1            #138 <String "[">
	//  144  297:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  145  300:pop             
							stringbuilder.append(simplekeywordnode.getValue());
	//  146  301:aload           4
	//  147  303:aload_3         
	//  148  304:invokevirtual   #136 <Method Object SimpleKeywordNode.getValue()>
	//  149  307:invokevirtual   #66  <Method StringBuilder StringBuilder.append(Object)>
	//  150  310:pop             
							stringbuilder.append("] is not a valid conversion word");
	//  151  311:aload           4
	//  152  313:ldc1            #140 <String "] is not a valid conversion word">
	//  153  315:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  154  318:pop             
							addStatus(((ch.qos.logback.core.status.Status) (new ErrorStatus(stringbuilder.toString(), ((Object) (this))))));
	//  155  319:aload_0         
	//  156  320:new             #142 <Class ErrorStatus>
	//  157  323:dup             
	//  158  324:aload           4
	//  159  326:invokevirtual   #72  <Method String StringBuilder.toString()>
	//  160  329:aload_0         
	//  161  330:invokespecial   #145 <Method void ErrorStatus(String, Object)>
	//  162  333:invokevirtual   #149 <Method void addStatus(ch.qos.logback.core.status.Status)>
						}
						break;
					}
					addToList(((Converter) (obj)));
					break label1;
				}
	//* 163  336:goto            233
				addToList(((Converter) (new LiteralConverter((String)node.getValue()))));
	//  164  339:aload_0         
	//  165  340:new             #82  <Class LiteralConverter>
	//  166  343:dup             
	//  167  344:aload_2         
	//  168  345:invokevirtual   #150 <Method Object Node.getValue()>
	//  169  348:checkcast       #152 <Class String>
	//  170  351:invokespecial   #84  <Method void LiteralConverter(String)>
	//  171  354:invokespecial   #135 <Method void addToList(Converter)>
			}
			node = node.next;
	//  172  357:aload_2         
	//  173  358:getfield        #155 <Field Node Node.next>
	//  174  361:astore_2        
		} while(true);
	//  175  362:goto            15
		return head;
	//  176  365:aload_0         
	//  177  366:getfield        #27  <Field Converter head>
	//  178  369:areturn         
	}

	CompositeConverter createCompositeConverter(CompositeNode compositenode)
	{
		compositenode = ((CompositeNode) ((String)compositenode.getValue()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #63  <Method Object CompositeNode.getValue()>
	//    2    4:checkcast       #152 <Class String>
	//    3    7:astore_1        
		String s = (String)converterMap.get(((Object) (compositenode)));
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field Map converterMap>
	//    6   12:aload_1         
	//    7   13:invokeinterface #164 <Method Object Map.get(Object)>
	//    8   18:checkcast       #152 <Class String>
	//    9   21:astore_2        
		if(s != null)
	//*  10   22:aload_2         
	//*  11   23:ifnull          102
		{
			CompositeConverter compositeconverter;
			try
			{
				compositeconverter = (CompositeConverter)OptionHelper.instantiateByClassName(s, ch/qos/logback/core/pattern/CompositeConverter, context);
	//   12   26:aload_2         
	//   13   27:ldc1            #90  <Class CompositeConverter>
	//   14   29:aload_0         
	//   15   30:getfield        #112 <Field ch.qos.logback.core.Context context>
	//   16   33:invokestatic    #170 <Method Object OptionHelper.instantiateByClassName(String, Class, ch.qos.logback.core.Context)>
	//   17   36:checkcast       #90  <Class CompositeConverter>
	//   18   39:astore_3        
			}
	//*  19   40:aload_3         
	//*  20   41:areturn         
			catch(Exception exception)
	//*  21   42:astore_3        
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   22   43:new             #52  <Class StringBuilder>
	//   23   46:dup             
	//   24   47:invokespecial   #53  <Method void StringBuilder()>
	//   25   50:astore          4
				stringbuilder1.append("Failed to instantiate converter class [");
	//   26   52:aload           4
	//   27   54:ldc1            #172 <String "Failed to instantiate converter class [">
	//   28   56:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
				stringbuilder1.append(s);
	//   30   60:aload           4
	//   31   62:aload_2         
	//   32   63:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
				stringbuilder1.append("] as a composite converter for keyword [");
	//   34   67:aload           4
	//   35   69:ldc1            #174 <String "] as a composite converter for keyword [">
	//   36   71:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
				stringbuilder1.append(((String) (compositenode)));
	//   38   75:aload           4
	//   39   77:aload_1         
	//   40   78:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   41   81:pop             
				stringbuilder1.append("]");
	//   42   82:aload           4
	//   43   84:ldc1            #80  <String "]">
	//   44   86:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   45   89:pop             
				addError(stringbuilder1.toString(), ((Throwable) (exception)));
	//   46   90:aload_0         
	//   47   91:aload           4
	//   48   93:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   49   96:aload_3         
	//   50   97:invokevirtual   #177 <Method void addError(String, Throwable)>
				return null;
	//   51  100:aconst_null     
	//   52  101:areturn         
			}
			return compositeconverter;
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   53  102:new             #52  <Class StringBuilder>
	//   54  105:dup             
	//   55  106:invokespecial   #53  <Method void StringBuilder()>
	//   56  109:astore_2        
			stringbuilder.append("There is no conversion class registered for composite conversion word [");
	//   57  110:aload_2         
	//   58  111:ldc1            #179 <String "There is no conversion class registered for composite conversion word [">
	//   59  113:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   60  116:pop             
			stringbuilder.append(((String) (compositenode)));
	//   61  117:aload_2         
	//   62  118:aload_1         
	//   63  119:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   64  122:pop             
			stringbuilder.append("]");
	//   65  123:aload_2         
	//   66  124:ldc1            #80  <String "]">
	//   67  126:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   68  129:pop             
			addError(stringbuilder.toString());
	//   69  130:aload_0         
	//   70  131:aload_2         
	//   71  132:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   72  135:invokevirtual   #76  <Method void addError(String)>
			return null;
	//   73  138:aconst_null     
	//   74  139:areturn         
		}
	}

	DynamicConverter createConverter(SimpleKeywordNode simplekeywordnode)
	{
		simplekeywordnode = ((SimpleKeywordNode) ((String)simplekeywordnode.getValue()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #136 <Method Object SimpleKeywordNode.getValue()>
	//    2    4:checkcast       #152 <Class String>
	//    3    7:astore_1        
		String s = (String)converterMap.get(((Object) (simplekeywordnode)));
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field Map converterMap>
	//    6   12:aload_1         
	//    7   13:invokeinterface #164 <Method Object Map.get(Object)>
	//    8   18:checkcast       #152 <Class String>
	//    9   21:astore_2        
		if(s != null)
	//*  10   22:aload_2         
	//*  11   23:ifnull          102
		{
			DynamicConverter dynamicconverter;
			try
			{
				dynamicconverter = (DynamicConverter)OptionHelper.instantiateByClassName(s, ch/qos/logback/core/pattern/DynamicConverter, context);
	//   12   26:aload_2         
	//   13   27:ldc1            #130 <Class DynamicConverter>
	//   14   29:aload_0         
	//   15   30:getfield        #112 <Field ch.qos.logback.core.Context context>
	//   16   33:invokestatic    #170 <Method Object OptionHelper.instantiateByClassName(String, Class, ch.qos.logback.core.Context)>
	//   17   36:checkcast       #130 <Class DynamicConverter>
	//   18   39:astore_3        
			}
	//*  19   40:aload_3         
	//*  20   41:areturn         
			catch(Exception exception)
	//*  21   42:astore_3        
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   22   43:new             #52  <Class StringBuilder>
	//   23   46:dup             
	//   24   47:invokespecial   #53  <Method void StringBuilder()>
	//   25   50:astore          4
				stringbuilder1.append("Failed to instantiate converter class [");
	//   26   52:aload           4
	//   27   54:ldc1            #172 <String "Failed to instantiate converter class [">
	//   28   56:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
				stringbuilder1.append(s);
	//   30   60:aload           4
	//   31   62:aload_2         
	//   32   63:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
				stringbuilder1.append("] for keyword [");
	//   34   67:aload           4
	//   35   69:ldc1            #182 <String "] for keyword [">
	//   36   71:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
				stringbuilder1.append(((String) (simplekeywordnode)));
	//   38   75:aload           4
	//   39   77:aload_1         
	//   40   78:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   41   81:pop             
				stringbuilder1.append("]");
	//   42   82:aload           4
	//   43   84:ldc1            #80  <String "]">
	//   44   86:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   45   89:pop             
				addError(stringbuilder1.toString(), ((Throwable) (exception)));
	//   46   90:aload_0         
	//   47   91:aload           4
	//   48   93:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   49   96:aload_3         
	//   50   97:invokevirtual   #177 <Method void addError(String, Throwable)>
				return null;
	//   51  100:aconst_null     
	//   52  101:areturn         
			}
			return dynamicconverter;
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   53  102:new             #52  <Class StringBuilder>
	//   54  105:dup             
	//   55  106:invokespecial   #53  <Method void StringBuilder()>
	//   56  109:astore_2        
			stringbuilder.append("There is no conversion class registered for conversion word [");
	//   57  110:aload_2         
	//   58  111:ldc1            #184 <String "There is no conversion class registered for conversion word [">
	//   59  113:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   60  116:pop             
			stringbuilder.append(((String) (simplekeywordnode)));
	//   61  117:aload_2         
	//   62  118:aload_1         
	//   63  119:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   64  122:pop             
			stringbuilder.append("]");
	//   65  123:aload_2         
	//   66  124:ldc1            #80  <String "]">
	//   67  126:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   68  129:pop             
			addError(stringbuilder.toString());
	//   69  130:aload_0         
	//   70  131:aload_2         
	//   71  132:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   72  135:invokevirtual   #76  <Method void addError(String)>
			return null;
	//   73  138:aconst_null     
	//   74  139:areturn         
		}
	}

	final Map converterMap;
	Converter head;
	Converter tail;
	final Node top;
}
