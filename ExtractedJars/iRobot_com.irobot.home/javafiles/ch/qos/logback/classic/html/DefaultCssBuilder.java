// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.html;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.html.CssBuilder;

public class DefaultCssBuilder
	implements CssBuilder
{

	public DefaultCssBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void addCss(StringBuilder stringbuilder)
	{
		stringbuilder.append("<style  type=\"text/css\">");
	//    0    0:aload_1         
	//    1    1:ldc1            #15  <String "<style  type=\"text/css\">">
	//    2    3:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//    4    7:aload_1         
	//    5    8:getstatic       #27  <Field String CoreConstants.LINE_SEPARATOR>
	//    6   11:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("table { margin-left: 2em; margin-right: 2em; border-left: 2px solid #AAA; }");
	//    8   15:aload_1         
	//    9   16:ldc1            #29  <String "table { margin-left: 2em; margin-right: 2em; border-left: 2px solid #AAA; }">
	//   10   18:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   12   22:aload_1         
	//   13   23:getstatic       #27  <Field String CoreConstants.LINE_SEPARATOR>
	//   14   26:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append("TR.even { background: #FFFFFF; }");
	//   16   30:aload_1         
	//   17   31:ldc1            #31  <String "TR.even { background: #FFFFFF; }">
	//   18   33:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   20   37:aload_1         
	//   21   38:getstatic       #27  <Field String CoreConstants.LINE_SEPARATOR>
	//   22   41:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
		stringbuilder.append("TR.odd { background: #EAEAEA; }");
	//   24   45:aload_1         
	//   25   46:ldc1            #33  <String "TR.odd { background: #EAEAEA; }">
	//   26   48:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   28   52:aload_1         
	//   29   53:getstatic       #27  <Field String CoreConstants.LINE_SEPARATOR>
	//   30   56:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
		stringbuilder.append("TR.warn TD.Level, TR.error TD.Level, TR.fatal TD.Level {font-weight: bold; color: #FF4040 }");
	//   32   60:aload_1         
	//   33   61:ldc1            #35  <String "TR.warn TD.Level, TR.error TD.Level, TR.fatal TD.Level {font-weight: bold; color: #FF4040 }">
	//   34   63:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   36   67:aload_1         
	//   37   68:getstatic       #27  <Field String CoreConstants.LINE_SEPARATOR>
	//   38   71:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   39   74:pop             
		stringbuilder.append("TD { padding-right: 1ex; padding-left: 1ex; border-right: 2px solid #AAA; }");
	//   40   75:aload_1         
	//   41   76:ldc1            #37  <String "TD { padding-right: 1ex; padding-left: 1ex; border-right: 2px solid #AAA; }">
	//   42   78:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   43   81:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   44   82:aload_1         
	//   45   83:getstatic       #27  <Field String CoreConstants.LINE_SEPARATOR>
	//   46   86:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   47   89:pop             
		stringbuilder.append("TD.Time, TD.Date { text-align: right; font-family: courier, monospace; font-size: smaller; }");
	//   48   90:aload_1         
	//   49   91:ldc1            #39  <String "TD.Time, TD.Date { text-align: right; font-family: courier, monospace; font-size: smaller; }">
	//   50   93:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   51   96:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   52   97:aload_1         
	//   53   98:getstatic       #27  <Field String CoreConstants.LINE_SEPARATOR>
	//   54  101:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   55  104:pop             
		stringbuilder.append("TD.Thread { text-align: left; }");
	//   56  105:aload_1         
	//   57  106:ldc1            #41  <String "TD.Thread { text-align: left; }">
	//   58  108:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   59  111:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   60  112:aload_1         
	//   61  113:getstatic       #27  <Field String CoreConstants.LINE_SEPARATOR>
	//   62  116:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   63  119:pop             
		stringbuilder.append("TD.Level { text-align: right; }");
	//   64  120:aload_1         
	//   65  121:ldc1            #43  <String "TD.Level { text-align: right; }">
	//   66  123:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   67  126:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   68  127:aload_1         
	//   69  128:getstatic       #27  <Field String CoreConstants.LINE_SEPARATOR>
	//   70  131:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   71  134:pop             
		stringbuilder.append("TD.Logger { text-align: left; }");
	//   72  135:aload_1         
	//   73  136:ldc1            #45  <String "TD.Logger { text-align: left; }">
	//   74  138:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   75  141:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   76  142:aload_1         
	//   77  143:getstatic       #27  <Field String CoreConstants.LINE_SEPARATOR>
	//   78  146:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   79  149:pop             
		stringbuilder.append("TR.header { background: #596ED5; color: #FFF; font-weight: bold; font-size: larger; }");
	//   80  150:aload_1         
	//   81  151:ldc1            #47  <String "TR.header { background: #596ED5; color: #FFF; font-weight: bold; font-size: larger; }">
	//   82  153:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   83  156:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   84  157:aload_1         
	//   85  158:getstatic       #27  <Field String CoreConstants.LINE_SEPARATOR>
	//   86  161:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   87  164:pop             
		stringbuilder.append("TD.Exception { background: #A2AEE8; font-family: courier, monospace;}");
	//   88  165:aload_1         
	//   89  166:ldc1            #49  <String "TD.Exception { background: #A2AEE8; font-family: courier, monospace;}">
	//   90  168:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   91  171:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   92  172:aload_1         
	//   93  173:getstatic       #27  <Field String CoreConstants.LINE_SEPARATOR>
	//   94  176:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   95  179:pop             
		stringbuilder.append("</style>");
	//   96  180:aload_1         
	//   97  181:ldc1            #51  <String "</style>">
	//   98  183:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   99  186:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//  100  187:aload_1         
	//  101  188:getstatic       #27  <Field String CoreConstants.LINE_SEPARATOR>
	//  102  191:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//  103  194:pop             
	//  104  195:return          
	}
}
