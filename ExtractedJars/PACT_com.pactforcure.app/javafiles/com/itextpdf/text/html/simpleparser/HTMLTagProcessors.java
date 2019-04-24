// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			HTMLTagProcessor, HTMLWorker, TableWrapper

public class HTMLTagProcessors extends HashMap
{

	public HTMLTagProcessors()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method void HashMap()>
		put("a", ((Object) (A)));
	//    2    4:aload_0         
	//    3    5:ldc1            #103 <String "a">
	//    4    7:getstatic       #63  <Field HTMLTagProcessor A>
	//    5   10:invokevirtual   #107 <Method Object put(Object, Object)>
	//    6   13:pop             
		put("b", ((Object) (EM_STRONG_STRIKE_SUP_SUP)));
	//    7   14:aload_0         
	//    8   15:ldc1            #109 <String "b">
	//    9   17:getstatic       #60  <Field HTMLTagProcessor EM_STRONG_STRIKE_SUP_SUP>
	//   10   20:invokevirtual   #107 <Method Object put(Object, Object)>
	//   11   23:pop             
		put("body", ((Object) (DIV)));
	//   12   24:aload_0         
	//   13   25:ldc1            #111 <String "body">
	//   14   27:getstatic       #87  <Field HTMLTagProcessor DIV>
	//   15   30:invokevirtual   #107 <Method Object put(Object, Object)>
	//   16   33:pop             
		put("br", ((Object) (BR)));
	//   17   34:aload_0         
	//   18   35:ldc1            #113 <String "br">
	//   19   37:getstatic       #66  <Field HTMLTagProcessor BR>
	//   20   40:invokevirtual   #107 <Method Object put(Object, Object)>
	//   21   43:pop             
		put("div", ((Object) (DIV)));
	//   22   44:aload_0         
	//   23   45:ldc1            #115 <String "div">
	//   24   47:getstatic       #87  <Field HTMLTagProcessor DIV>
	//   25   50:invokevirtual   #107 <Method Object put(Object, Object)>
	//   26   53:pop             
		put("em", ((Object) (EM_STRONG_STRIKE_SUP_SUP)));
	//   27   54:aload_0         
	//   28   55:ldc1            #117 <String "em">
	//   29   57:getstatic       #60  <Field HTMLTagProcessor EM_STRONG_STRIKE_SUP_SUP>
	//   30   60:invokevirtual   #107 <Method Object put(Object, Object)>
	//   31   63:pop             
		put("font", ((Object) (SPAN)));
	//   32   64:aload_0         
	//   33   65:ldc1            #119 <String "font">
	//   34   67:getstatic       #75  <Field HTMLTagProcessor SPAN>
	//   35   70:invokevirtual   #107 <Method Object put(Object, Object)>
	//   36   73:pop             
		put("h1", ((Object) (H)));
	//   37   74:aload_0         
	//   38   75:ldc1            #121 <String "h1">
	//   39   77:getstatic       #78  <Field HTMLTagProcessor H>
	//   40   80:invokevirtual   #107 <Method Object put(Object, Object)>
	//   41   83:pop             
		put("h2", ((Object) (H)));
	//   42   84:aload_0         
	//   43   85:ldc1            #123 <String "h2">
	//   44   87:getstatic       #78  <Field HTMLTagProcessor H>
	//   45   90:invokevirtual   #107 <Method Object put(Object, Object)>
	//   46   93:pop             
		put("h3", ((Object) (H)));
	//   47   94:aload_0         
	//   48   95:ldc1            #125 <String "h3">
	//   49   97:getstatic       #78  <Field HTMLTagProcessor H>
	//   50  100:invokevirtual   #107 <Method Object put(Object, Object)>
	//   51  103:pop             
		put("h4", ((Object) (H)));
	//   52  104:aload_0         
	//   53  105:ldc1            #127 <String "h4">
	//   54  107:getstatic       #78  <Field HTMLTagProcessor H>
	//   55  110:invokevirtual   #107 <Method Object put(Object, Object)>
	//   56  113:pop             
		put("h5", ((Object) (H)));
	//   57  114:aload_0         
	//   58  115:ldc1            #129 <String "h5">
	//   59  117:getstatic       #78  <Field HTMLTagProcessor H>
	//   60  120:invokevirtual   #107 <Method Object put(Object, Object)>
	//   61  123:pop             
		put("h6", ((Object) (H)));
	//   62  124:aload_0         
	//   63  125:ldc1            #131 <String "h6">
	//   64  127:getstatic       #78  <Field HTMLTagProcessor H>
	//   65  130:invokevirtual   #107 <Method Object put(Object, Object)>
	//   66  133:pop             
		put("hr", ((Object) (HR)));
	//   67  134:aload_0         
	//   68  135:ldc1            #133 <String "hr">
	//   69  137:getstatic       #72  <Field HTMLTagProcessor HR>
	//   70  140:invokevirtual   #107 <Method Object put(Object, Object)>
	//   71  143:pop             
		put("i", ((Object) (EM_STRONG_STRIKE_SUP_SUP)));
	//   72  144:aload_0         
	//   73  145:ldc1            #135 <String "i">
	//   74  147:getstatic       #60  <Field HTMLTagProcessor EM_STRONG_STRIKE_SUP_SUP>
	//   75  150:invokevirtual   #107 <Method Object put(Object, Object)>
	//   76  153:pop             
		put("img", ((Object) (IMG)));
	//   77  154:aload_0         
	//   78  155:ldc1            #137 <String "img">
	//   79  157:getstatic       #99  <Field HTMLTagProcessor IMG>
	//   80  160:invokevirtual   #107 <Method Object put(Object, Object)>
	//   81  163:pop             
		put("li", ((Object) (LI)));
	//   82  164:aload_0         
	//   83  165:ldc1            #139 <String "li">
	//   84  167:getstatic       #81  <Field HTMLTagProcessor LI>
	//   85  170:invokevirtual   #107 <Method Object put(Object, Object)>
	//   86  173:pop             
		put("ol", ((Object) (UL_OL)));
	//   87  174:aload_0         
	//   88  175:ldc1            #141 <String "ol">
	//   89  177:getstatic       #69  <Field HTMLTagProcessor UL_OL>
	//   90  180:invokevirtual   #107 <Method Object put(Object, Object)>
	//   91  183:pop             
		put("p", ((Object) (DIV)));
	//   92  184:aload_0         
	//   93  185:ldc1            #143 <String "p">
	//   94  187:getstatic       #87  <Field HTMLTagProcessor DIV>
	//   95  190:invokevirtual   #107 <Method Object put(Object, Object)>
	//   96  193:pop             
		put("pre", ((Object) (PRE)));
	//   97  194:aload_0         
	//   98  195:ldc1            #145 <String "pre">
	//   99  197:getstatic       #84  <Field HTMLTagProcessor PRE>
	//  100  200:invokevirtual   #107 <Method Object put(Object, Object)>
	//  101  203:pop             
		put("s", ((Object) (EM_STRONG_STRIKE_SUP_SUP)));
	//  102  204:aload_0         
	//  103  205:ldc1            #147 <String "s">
	//  104  207:getstatic       #60  <Field HTMLTagProcessor EM_STRONG_STRIKE_SUP_SUP>
	//  105  210:invokevirtual   #107 <Method Object put(Object, Object)>
	//  106  213:pop             
		put("span", ((Object) (SPAN)));
	//  107  214:aload_0         
	//  108  215:ldc1            #149 <String "span">
	//  109  217:getstatic       #75  <Field HTMLTagProcessor SPAN>
	//  110  220:invokevirtual   #107 <Method Object put(Object, Object)>
	//  111  223:pop             
		put("strike", ((Object) (EM_STRONG_STRIKE_SUP_SUP)));
	//  112  224:aload_0         
	//  113  225:ldc1            #151 <String "strike">
	//  114  227:getstatic       #60  <Field HTMLTagProcessor EM_STRONG_STRIKE_SUP_SUP>
	//  115  230:invokevirtual   #107 <Method Object put(Object, Object)>
	//  116  233:pop             
		put("strong", ((Object) (EM_STRONG_STRIKE_SUP_SUP)));
	//  117  234:aload_0         
	//  118  235:ldc1            #153 <String "strong">
	//  119  237:getstatic       #60  <Field HTMLTagProcessor EM_STRONG_STRIKE_SUP_SUP>
	//  120  240:invokevirtual   #107 <Method Object put(Object, Object)>
	//  121  243:pop             
		put("sub", ((Object) (EM_STRONG_STRIKE_SUP_SUP)));
	//  122  244:aload_0         
	//  123  245:ldc1            #155 <String "sub">
	//  124  247:getstatic       #60  <Field HTMLTagProcessor EM_STRONG_STRIKE_SUP_SUP>
	//  125  250:invokevirtual   #107 <Method Object put(Object, Object)>
	//  126  253:pop             
		put("sup", ((Object) (EM_STRONG_STRIKE_SUP_SUP)));
	//  127  254:aload_0         
	//  128  255:ldc1            #157 <String "sup">
	//  129  257:getstatic       #60  <Field HTMLTagProcessor EM_STRONG_STRIKE_SUP_SUP>
	//  130  260:invokevirtual   #107 <Method Object put(Object, Object)>
	//  131  263:pop             
		put("table", ((Object) (TABLE)));
	//  132  264:aload_0         
	//  133  265:ldc1            #159 <String "table">
	//  134  267:getstatic       #90  <Field HTMLTagProcessor TABLE>
	//  135  270:invokevirtual   #107 <Method Object put(Object, Object)>
	//  136  273:pop             
		put("td", ((Object) (TD)));
	//  137  274:aload_0         
	//  138  275:ldc1            #161 <String "td">
	//  139  277:getstatic       #96  <Field HTMLTagProcessor TD>
	//  140  280:invokevirtual   #107 <Method Object put(Object, Object)>
	//  141  283:pop             
		put("th", ((Object) (TD)));
	//  142  284:aload_0         
	//  143  285:ldc1            #163 <String "th">
	//  144  287:getstatic       #96  <Field HTMLTagProcessor TD>
	//  145  290:invokevirtual   #107 <Method Object put(Object, Object)>
	//  146  293:pop             
		put("tr", ((Object) (TR)));
	//  147  294:aload_0         
	//  148  295:ldc1            #165 <String "tr">
	//  149  297:getstatic       #93  <Field HTMLTagProcessor TR>
	//  150  300:invokevirtual   #107 <Method Object put(Object, Object)>
	//  151  303:pop             
		put("u", ((Object) (EM_STRONG_STRIKE_SUP_SUP)));
	//  152  304:aload_0         
	//  153  305:ldc1            #167 <String "u">
	//  154  307:getstatic       #60  <Field HTMLTagProcessor EM_STRONG_STRIKE_SUP_SUP>
	//  155  310:invokevirtual   #107 <Method Object put(Object, Object)>
	//  156  313:pop             
		put("ul", ((Object) (UL_OL)));
	//  157  314:aload_0         
	//  158  315:ldc1            #169 <String "ul">
	//  159  317:getstatic       #69  <Field HTMLTagProcessor UL_OL>
	//  160  320:invokevirtual   #107 <Method Object put(Object, Object)>
	//  161  323:pop             
	//  162  324:return          
	}

	public static final HTMLTagProcessor A = new HTMLTagProcessor() {

		public void endElement(HTMLWorker htmlworker, String s)
		{
			htmlworker.processLink();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #20  <Method void HTMLWorker.processLink()>
			htmlworker.updateChain(s);
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #24  <Method void HTMLWorker.updateChain(String)>
		//    5    9:return          
		}

		public void startElement(HTMLWorker htmlworker, String s, Map map)
		{
			htmlworker.updateChain(s, map);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokevirtual   #29  <Method void HTMLWorker.updateChain(String, Map)>
			htmlworker.flushContent();
		//    4    6:aload_1         
		//    5    7:invokevirtual   #32  <Method void HTMLWorker.flushContent()>
		//    6   10:return          
		}

	}
;
	public static final HTMLTagProcessor BR = new HTMLTagProcessor() {

		public void endElement(HTMLWorker htmlworker, String s)
		{
		//    0    0:return          
		}

		public void startElement(HTMLWorker htmlworker, String s, Map map)
		{
			htmlworker.newLine();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.newLine()>
		//    2    4:return          
		}

	}
;
	public static final HTMLTagProcessor DIV = new HTMLTagProcessor() {

		public void endElement(HTMLWorker htmlworker, String s)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			htmlworker.updateChain(s);
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #26  <Method void HTMLWorker.updateChain(String)>
		//    5    9:return          
		}

		public void startElement(HTMLWorker htmlworker, String s, Map map)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			htmlworker.updateChain(s, map);
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #32  <Method void HTMLWorker.updateChain(String, Map)>
		//    6   10:return          
		}

	}
;
	public static final HTMLTagProcessor EM_STRONG_STRIKE_SUP_SUP = new HTMLTagProcessor() {

		private String mapTag(String s)
		{
			String s1;
			if("em".equalsIgnoreCase(s))
		//*   0    0:ldc1            #17  <String "em">
		//*   1    2:aload_1         
		//*   2    3:invokevirtual   #23  <Method boolean String.equalsIgnoreCase(String)>
		//*   3    6:ifeq            14
			{
				s1 = "i";
		//    4    9:ldc1            #25  <String "i">
		//    5   11:astore_2        
			} else
		//*   6   12:aload_2         
		//*   7   13:areturn         
			{
				if("strong".equalsIgnoreCase(s))
		//*   8   14:ldc1            #27  <String "strong">
		//*   9   16:aload_1         
		//*  10   17:invokevirtual   #23  <Method boolean String.equalsIgnoreCase(String)>
		//*  11   20:ifeq            26
					return "b";
		//   12   23:ldc1            #29  <String "b">
		//   13   25:areturn         
				s1 = s;
		//   14   26:aload_1         
		//   15   27:astore_2        
				if("strike".equalsIgnoreCase(s))
		//*  16   28:ldc1            #31  <String "strike">
		//*  17   30:aload_1         
		//*  18   31:invokevirtual   #23  <Method boolean String.equalsIgnoreCase(String)>
		//*  19   34:ifeq            12
					return "s";
		//   20   37:ldc1            #33  <String "s">
		//   21   39:areturn         
			}
			return s1;
		}

		public void endElement(HTMLWorker htmlworker, String s)
		{
			htmlworker.updateChain(mapTag(s));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:aload_2         
		//    3    3:invokespecial   #37  <Method String mapTag(String)>
		//    4    6:invokevirtual   #43  <Method void HTMLWorker.updateChain(String)>
		//    5    9:return          
		}

		public void startElement(HTMLWorker htmlworker, String s, Map map)
		{
			s = mapTag(s);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:invokespecial   #37  <Method String mapTag(String)>
		//    3    5:astore_2        
			map.put(((Object) (s)), ((Object) (null)));
		//    4    6:aload_3         
		//    5    7:aload_2         
		//    6    8:aconst_null     
		//    7    9:invokeinterface #51  <Method Object Map.put(Object, Object)>
		//    8   14:pop             
			htmlworker.updateChain(s, map);
		//    9   15:aload_1         
		//   10   16:aload_2         
		//   11   17:aload_3         
		//   12   18:invokevirtual   #54  <Method void HTMLWorker.updateChain(String, Map)>
		//   13   21:return          
		}

	}
;
	public static final HTMLTagProcessor H = new HTMLTagProcessor() {

		public void endElement(HTMLWorker htmlworker, String s)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			htmlworker.updateChain(s);
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #26  <Method void HTMLWorker.updateChain(String)>
		//    5    9:return          
		}

		public void startElement(HTMLWorker htmlworker, String s, Map map)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			if(!map.containsKey("size"))
		//*   2    4:aload_3         
		//*   3    5:ldc1            #31  <String "size">
		//*   4    7:invokeinterface #37  <Method boolean Map.containsKey(Object)>
		//*   5   12:ifne            38
				map.put("size", ((Object) (Integer.toString(7 - Integer.parseInt(s.substring(1))))));
		//    6   15:aload_3         
		//    7   16:ldc1            #31  <String "size">
		//    8   18:bipush          7
		//    9   20:aload_2         
		//   10   21:iconst_1        
		//   11   22:invokevirtual   #43  <Method String String.substring(int)>
		//   12   25:invokestatic    #49  <Method int Integer.parseInt(String)>
		//   13   28:isub            
		//   14   29:invokestatic    #52  <Method String Integer.toString(int)>
		//   15   32:invokeinterface #56  <Method Object Map.put(Object, Object)>
		//   16   37:pop             
			htmlworker.updateChain(s, map);
		//   17   38:aload_1         
		//   18   39:aload_2         
		//   19   40:aload_3         
		//   20   41:invokevirtual   #59  <Method void HTMLWorker.updateChain(String, Map)>
		//   21   44:return          
		}

	}
;
	public static final HTMLTagProcessor HR = new HTMLTagProcessor() {

		public void endElement(HTMLWorker htmlworker, String s)
		{
		//    0    0:return          
		}

		public void startElement(HTMLWorker htmlworker, String s, Map map)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #24  <Method void HTMLWorker.carriageReturn()>
			htmlworker.pushToStack(((com.itextpdf.text.Element) (htmlworker.createLineSeparator(map))));
		//    2    4:aload_1         
		//    3    5:aload_1         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #28  <Method com.itextpdf.text.pdf.draw.LineSeparator HTMLWorker.createLineSeparator(Map)>
		//    6   10:invokevirtual   #32  <Method void HTMLWorker.pushToStack(com.itextpdf.text.Element)>
		//    7   13:return          
		}

	}
;
	public static final HTMLTagProcessor IMG = new HTMLTagProcessor() {

		public void endElement(HTMLWorker htmlworker, String s)
		{
		//    0    0:return          
		}

		public void startElement(HTMLWorker htmlworker, String s, Map map)
			throws DocumentException, IOException
		{
			htmlworker.updateChain(s, map);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokevirtual   #27  <Method void HTMLWorker.updateChain(String, Map)>
			htmlworker.processImage(htmlworker.createImage(map), map);
		//    4    6:aload_1         
		//    5    7:aload_1         
		//    6    8:aload_3         
		//    7    9:invokevirtual   #31  <Method com.itextpdf.text.Image HTMLWorker.createImage(Map)>
		//    8   12:aload_3         
		//    9   13:invokevirtual   #35  <Method void HTMLWorker.processImage(com.itextpdf.text.Image, Map)>
			htmlworker.updateChain(s);
		//   10   16:aload_1         
		//   11   17:aload_2         
		//   12   18:invokevirtual   #38  <Method void HTMLWorker.updateChain(String)>
		//   13   21:return          
		}

	}
;
	public static final HTMLTagProcessor LI = new HTMLTagProcessor() {

		public void endElement(HTMLWorker htmlworker, String s)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			htmlworker.setPendingLI(false);
		//    2    4:aload_1         
		//    3    5:iconst_0        
		//    4    6:invokevirtual   #26  <Method void HTMLWorker.setPendingLI(boolean)>
			htmlworker.setSkipText(true);
		//    5    9:aload_1         
		//    6   10:iconst_1        
		//    7   11:invokevirtual   #29  <Method void HTMLWorker.setSkipText(boolean)>
			htmlworker.updateChain(s);
		//    8   14:aload_1         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #33  <Method void HTMLWorker.updateChain(String)>
			htmlworker.processListItem();
		//   11   19:aload_1         
		//   12   20:invokevirtual   #36  <Method void HTMLWorker.processListItem()>
		//   13   23:return          
		}

		public void startElement(HTMLWorker htmlworker, String s, Map map)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			if(htmlworker.isPendingLI())
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #43  <Method boolean HTMLWorker.isPendingLI()>
		//*   4    8:ifeq            16
				htmlworker.endElement(s);
		//    5   11:aload_1         
		//    6   12:aload_2         
		//    7   13:invokevirtual   #45  <Method void HTMLWorker.endElement(String)>
			htmlworker.setSkipText(false);
		//    8   16:aload_1         
		//    9   17:iconst_0        
		//   10   18:invokevirtual   #29  <Method void HTMLWorker.setSkipText(boolean)>
			htmlworker.setPendingLI(true);
		//   11   21:aload_1         
		//   12   22:iconst_1        
		//   13   23:invokevirtual   #26  <Method void HTMLWorker.setPendingLI(boolean)>
			htmlworker.updateChain(s, map);
		//   14   26:aload_1         
		//   15   27:aload_2         
		//   16   28:aload_3         
		//   17   29:invokevirtual   #48  <Method void HTMLWorker.updateChain(String, Map)>
			htmlworker.pushToStack(((com.itextpdf.text.Element) (htmlworker.createListItem())));
		//   18   32:aload_1         
		//   19   33:aload_1         
		//   20   34:invokevirtual   #52  <Method com.itextpdf.text.ListItem HTMLWorker.createListItem()>
		//   21   37:invokevirtual   #56  <Method void HTMLWorker.pushToStack(com.itextpdf.text.Element)>
		//   22   40:return          
		}

	}
;
	public static final HTMLTagProcessor PRE = new HTMLTagProcessor() {

		public void endElement(HTMLWorker htmlworker, String s)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			htmlworker.updateChain(s);
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #26  <Method void HTMLWorker.updateChain(String)>
			htmlworker.setInsidePRE(false);
		//    5    9:aload_1         
		//    6   10:iconst_0        
		//    7   11:invokevirtual   #30  <Method void HTMLWorker.setInsidePRE(boolean)>
		//    8   14:return          
		}

		public void startElement(HTMLWorker htmlworker, String s, Map map)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			if(!map.containsKey("face"))
		//*   2    4:aload_3         
		//*   3    5:ldc1            #35  <String "face">
		//*   4    7:invokeinterface #41  <Method boolean Map.containsKey(Object)>
		//*   5   12:ifne            26
				map.put("face", "Courier");
		//    6   15:aload_3         
		//    7   16:ldc1            #35  <String "face">
		//    8   18:ldc1            #43  <String "Courier">
		//    9   20:invokeinterface #47  <Method Object Map.put(Object, Object)>
		//   10   25:pop             
			htmlworker.updateChain(s, map);
		//   11   26:aload_1         
		//   12   27:aload_2         
		//   13   28:aload_3         
		//   14   29:invokevirtual   #50  <Method void HTMLWorker.updateChain(String, Map)>
			htmlworker.setInsidePRE(true);
		//   15   32:aload_1         
		//   16   33:iconst_1        
		//   17   34:invokevirtual   #30  <Method void HTMLWorker.setInsidePRE(boolean)>
		//   18   37:return          
		}

	}
;
	public static final HTMLTagProcessor SPAN = new HTMLTagProcessor() {

		public void endElement(HTMLWorker htmlworker, String s)
		{
			htmlworker.updateChain(s);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #21  <Method void HTMLWorker.updateChain(String)>
		//    3    5:return          
		}

		public void startElement(HTMLWorker htmlworker, String s, Map map)
		{
			htmlworker.updateChain(s, map);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokevirtual   #26  <Method void HTMLWorker.updateChain(String, Map)>
		//    4    6:return          
		}

	}
;
	public static final HTMLTagProcessor TABLE = new HTMLTagProcessor() {

		public void endElement(HTMLWorker htmlworker, String s)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			if(htmlworker.isPendingTR())
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #26  <Method boolean HTMLWorker.isPendingTR()>
		//*   4    8:ifeq            17
				htmlworker.endElement("tr");
		//    5   11:aload_1         
		//    6   12:ldc1            #28  <String "tr">
		//    7   14:invokevirtual   #31  <Method void HTMLWorker.endElement(String)>
			htmlworker.updateChain(s);
		//    8   17:aload_1         
		//    9   18:aload_2         
		//   10   19:invokevirtual   #34  <Method void HTMLWorker.updateChain(String)>
			htmlworker.processTable();
		//   11   22:aload_1         
		//   12   23:invokevirtual   #37  <Method void HTMLWorker.processTable()>
			htmlworker.popTableState();
		//   13   26:aload_1         
		//   14   27:invokevirtual   #40  <Method void HTMLWorker.popTableState()>
			htmlworker.setSkipText(false);
		//   15   30:aload_1         
		//   16   31:iconst_0        
		//   17   32:invokevirtual   #44  <Method void HTMLWorker.setSkipText(boolean)>
		//   18   35:return          
		}

		public void startElement(HTMLWorker htmlworker, String s, Map map)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			htmlworker.pushToStack(((com.itextpdf.text.Element) (new TableWrapper(map))));
		//    2    4:aload_1         
		//    3    5:new             #49  <Class TableWrapper>
		//    4    8:dup             
		//    5    9:aload_3         
		//    6   10:invokespecial   #52  <Method void TableWrapper(Map)>
		//    7   13:invokevirtual   #56  <Method void HTMLWorker.pushToStack(com.itextpdf.text.Element)>
			htmlworker.pushTableState();
		//    8   16:aload_1         
		//    9   17:invokevirtual   #59  <Method void HTMLWorker.pushTableState()>
			htmlworker.setPendingTD(false);
		//   10   20:aload_1         
		//   11   21:iconst_0        
		//   12   22:invokevirtual   #62  <Method void HTMLWorker.setPendingTD(boolean)>
			htmlworker.setPendingTR(false);
		//   13   25:aload_1         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #65  <Method void HTMLWorker.setPendingTR(boolean)>
			htmlworker.setSkipText(true);
		//   16   30:aload_1         
		//   17   31:iconst_1        
		//   18   32:invokevirtual   #44  <Method void HTMLWorker.setSkipText(boolean)>
			map.remove("align");
		//   19   35:aload_3         
		//   20   36:ldc1            #67  <String "align">
		//   21   38:invokeinterface #73  <Method Object Map.remove(Object)>
		//   22   43:pop             
			map.put("colspan", "1");
		//   23   44:aload_3         
		//   24   45:ldc1            #75  <String "colspan">
		//   25   47:ldc1            #77  <String "1">
		//   26   49:invokeinterface #81  <Method Object Map.put(Object, Object)>
		//   27   54:pop             
			map.put("rowspan", "1");
		//   28   55:aload_3         
		//   29   56:ldc1            #83  <String "rowspan">
		//   30   58:ldc1            #77  <String "1">
		//   31   60:invokeinterface #81  <Method Object Map.put(Object, Object)>
		//   32   65:pop             
			htmlworker.updateChain(s, map);
		//   33   66:aload_1         
		//   34   67:aload_2         
		//   35   68:aload_3         
		//   36   69:invokevirtual   #86  <Method void HTMLWorker.updateChain(String, Map)>
		//   37   72:return          
		}

	}
;
	public static final HTMLTagProcessor TD = new HTMLTagProcessor() {

		public void endElement(HTMLWorker htmlworker, String s)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			htmlworker.setPendingTD(false);
		//    2    4:aload_1         
		//    3    5:iconst_0        
		//    4    6:invokevirtual   #26  <Method void HTMLWorker.setPendingTD(boolean)>
			htmlworker.updateChain("td");
		//    5    9:aload_1         
		//    6   10:ldc1            #28  <String "td">
		//    7   12:invokevirtual   #32  <Method void HTMLWorker.updateChain(String)>
			htmlworker.setSkipText(true);
		//    8   15:aload_1         
		//    9   16:iconst_1        
		//   10   17:invokevirtual   #35  <Method void HTMLWorker.setSkipText(boolean)>
		//   11   20:return          
		}

		public void startElement(HTMLWorker htmlworker, String s, Map map)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			if(htmlworker.isPendingTD())
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #42  <Method boolean HTMLWorker.isPendingTD()>
		//*   4    8:ifeq            16
				htmlworker.endElement(s);
		//    5   11:aload_1         
		//    6   12:aload_2         
		//    7   13:invokevirtual   #44  <Method void HTMLWorker.endElement(String)>
			htmlworker.setSkipText(false);
		//    8   16:aload_1         
		//    9   17:iconst_0        
		//   10   18:invokevirtual   #35  <Method void HTMLWorker.setSkipText(boolean)>
			htmlworker.setPendingTD(true);
		//   11   21:aload_1         
		//   12   22:iconst_1        
		//   13   23:invokevirtual   #26  <Method void HTMLWorker.setPendingTD(boolean)>
			htmlworker.updateChain("td", map);
		//   14   26:aload_1         
		//   15   27:ldc1            #28  <String "td">
		//   16   29:aload_3         
		//   17   30:invokevirtual   #47  <Method void HTMLWorker.updateChain(String, Map)>
			htmlworker.pushToStack(((com.itextpdf.text.Element) (htmlworker.createCell(s))));
		//   18   33:aload_1         
		//   19   34:aload_1         
		//   20   35:aload_2         
		//   21   36:invokevirtual   #51  <Method CellWrapper HTMLWorker.createCell(String)>
		//   22   39:invokevirtual   #55  <Method void HTMLWorker.pushToStack(com.itextpdf.text.Element)>
		//   23   42:return          
		}

	}
;
	public static final HTMLTagProcessor TR = new HTMLTagProcessor() {

		public void endElement(HTMLWorker htmlworker, String s)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			if(htmlworker.isPendingTD())
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #26  <Method boolean HTMLWorker.isPendingTD()>
		//*   4    8:ifeq            17
				htmlworker.endElement("td");
		//    5   11:aload_1         
		//    6   12:ldc1            #28  <String "td">
		//    7   14:invokevirtual   #31  <Method void HTMLWorker.endElement(String)>
			htmlworker.setPendingTR(false);
		//    8   17:aload_1         
		//    9   18:iconst_0        
		//   10   19:invokevirtual   #35  <Method void HTMLWorker.setPendingTR(boolean)>
			htmlworker.updateChain(s);
		//   11   22:aload_1         
		//   12   23:aload_2         
		//   13   24:invokevirtual   #38  <Method void HTMLWorker.updateChain(String)>
			htmlworker.processRow();
		//   14   27:aload_1         
		//   15   28:invokevirtual   #41  <Method void HTMLWorker.processRow()>
			htmlworker.setSkipText(true);
		//   16   31:aload_1         
		//   17   32:iconst_1        
		//   18   33:invokevirtual   #44  <Method void HTMLWorker.setSkipText(boolean)>
		//   19   36:return          
		}

		public void startElement(HTMLWorker htmlworker, String s, Map map)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			if(htmlworker.isPendingTR())
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #50  <Method boolean HTMLWorker.isPendingTR()>
		//*   4    8:ifeq            16
				htmlworker.endElement(s);
		//    5   11:aload_1         
		//    6   12:aload_2         
		//    7   13:invokevirtual   #31  <Method void HTMLWorker.endElement(String)>
			htmlworker.setSkipText(true);
		//    8   16:aload_1         
		//    9   17:iconst_1        
		//   10   18:invokevirtual   #44  <Method void HTMLWorker.setSkipText(boolean)>
			htmlworker.setPendingTR(true);
		//   11   21:aload_1         
		//   12   22:iconst_1        
		//   13   23:invokevirtual   #35  <Method void HTMLWorker.setPendingTR(boolean)>
			htmlworker.updateChain(s, map);
		//   14   26:aload_1         
		//   15   27:aload_2         
		//   16   28:aload_3         
		//   17   29:invokevirtual   #53  <Method void HTMLWorker.updateChain(String, Map)>
		//   18   32:return          
		}

	}
;
	public static final HTMLTagProcessor UL_OL = new HTMLTagProcessor() {

		public void endElement(HTMLWorker htmlworker, String s)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			if(htmlworker.isPendingLI())
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #26  <Method boolean HTMLWorker.isPendingLI()>
		//*   4    8:ifeq            17
				htmlworker.endElement("li");
		//    5   11:aload_1         
		//    6   12:ldc1            #28  <String "li">
		//    7   14:invokevirtual   #31  <Method void HTMLWorker.endElement(String)>
			htmlworker.setSkipText(false);
		//    8   17:aload_1         
		//    9   18:iconst_0        
		//   10   19:invokevirtual   #35  <Method void HTMLWorker.setSkipText(boolean)>
			htmlworker.updateChain(s);
		//   11   22:aload_1         
		//   12   23:aload_2         
		//   13   24:invokevirtual   #38  <Method void HTMLWorker.updateChain(String)>
			htmlworker.processList();
		//   14   27:aload_1         
		//   15   28:invokevirtual   #41  <Method void HTMLWorker.processList()>
		//   16   31:return          
		}

		public void startElement(HTMLWorker htmlworker, String s, Map map)
			throws DocumentException
		{
			htmlworker.carriageReturn();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
			if(htmlworker.isPendingLI())
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #26  <Method boolean HTMLWorker.isPendingLI()>
		//*   4    8:ifeq            17
				htmlworker.endElement("li");
		//    5   11:aload_1         
		//    6   12:ldc1            #28  <String "li">
		//    7   14:invokevirtual   #31  <Method void HTMLWorker.endElement(String)>
			htmlworker.setSkipText(true);
		//    8   17:aload_1         
		//    9   18:iconst_1        
		//   10   19:invokevirtual   #35  <Method void HTMLWorker.setSkipText(boolean)>
			htmlworker.updateChain(s, map);
		//   11   22:aload_1         
		//   12   23:aload_2         
		//   13   24:aload_3         
		//   14   25:invokevirtual   #47  <Method void HTMLWorker.updateChain(String, Map)>
			htmlworker.pushToStack(((com.itextpdf.text.Element) (htmlworker.createList(s))));
		//   15   28:aload_1         
		//   16   29:aload_1         
		//   17   30:aload_2         
		//   18   31:invokevirtual   #51  <Method com.itextpdf.text.List HTMLWorker.createList(String)>
		//   19   34:invokevirtual   #55  <Method void HTMLWorker.pushToStack(com.itextpdf.text.Element)>
		//   20   37:return          
		}

	}
;
	private static final long serialVersionUID = 0xb8193958L;

	static 
	{
	//    0    0:new             #7   <Class HTMLTagProcessors$1>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void HTMLTagProcessors$1()>
	//    3    7:putstatic       #60  <Field HTMLTagProcessor EM_STRONG_STRIKE_SUP_SUP>
	//    4   10:new             #19  <Class HTMLTagProcessors$2>
	//    5   13:dup             
	//    6   14:invokespecial   #61  <Method void HTMLTagProcessors$2()>
	//    7   17:putstatic       #63  <Field HTMLTagProcessor A>
	//    8   20:new             #21  <Class HTMLTagProcessors$3>
	//    9   23:dup             
	//   10   24:invokespecial   #64  <Method void HTMLTagProcessors$3()>
	//   11   27:putstatic       #66  <Field HTMLTagProcessor BR>
	//   12   30:new             #23  <Class HTMLTagProcessors$4>
	//   13   33:dup             
	//   14   34:invokespecial   #67  <Method void HTMLTagProcessors$4()>
	//   15   37:putstatic       #69  <Field HTMLTagProcessor UL_OL>
	//   16   40:new             #25  <Class HTMLTagProcessors$5>
	//   17   43:dup             
	//   18   44:invokespecial   #70  <Method void HTMLTagProcessors$5()>
	//   19   47:putstatic       #72  <Field HTMLTagProcessor HR>
	//   20   50:new             #27  <Class HTMLTagProcessors$6>
	//   21   53:dup             
	//   22   54:invokespecial   #73  <Method void HTMLTagProcessors$6()>
	//   23   57:putstatic       #75  <Field HTMLTagProcessor SPAN>
	//   24   60:new             #29  <Class HTMLTagProcessors$7>
	//   25   63:dup             
	//   26   64:invokespecial   #76  <Method void HTMLTagProcessors$7()>
	//   27   67:putstatic       #78  <Field HTMLTagProcessor H>
	//   28   70:new             #31  <Class HTMLTagProcessors$8>
	//   29   73:dup             
	//   30   74:invokespecial   #79  <Method void HTMLTagProcessors$8()>
	//   31   77:putstatic       #81  <Field HTMLTagProcessor LI>
	//   32   80:new             #33  <Class HTMLTagProcessors$9>
	//   33   83:dup             
	//   34   84:invokespecial   #82  <Method void HTMLTagProcessors$9()>
	//   35   87:putstatic       #84  <Field HTMLTagProcessor PRE>
	//   36   90:new             #9   <Class HTMLTagProcessors$10>
	//   37   93:dup             
	//   38   94:invokespecial   #85  <Method void HTMLTagProcessors$10()>
	//   39   97:putstatic       #87  <Field HTMLTagProcessor DIV>
	//   40  100:new             #11  <Class HTMLTagProcessors$11>
	//   41  103:dup             
	//   42  104:invokespecial   #88  <Method void HTMLTagProcessors$11()>
	//   43  107:putstatic       #90  <Field HTMLTagProcessor TABLE>
	//   44  110:new             #13  <Class HTMLTagProcessors$12>
	//   45  113:dup             
	//   46  114:invokespecial   #91  <Method void HTMLTagProcessors$12()>
	//   47  117:putstatic       #93  <Field HTMLTagProcessor TR>
	//   48  120:new             #15  <Class HTMLTagProcessors$13>
	//   49  123:dup             
	//   50  124:invokespecial   #94  <Method void HTMLTagProcessors$13()>
	//   51  127:putstatic       #96  <Field HTMLTagProcessor TD>
	//   52  130:new             #17  <Class HTMLTagProcessors$14>
	//   53  133:dup             
	//   54  134:invokespecial   #97  <Method void HTMLTagProcessors$14()>
	//   55  137:putstatic       #99  <Field HTMLTagProcessor IMG>
	//*  56  140:return          
	}
}
