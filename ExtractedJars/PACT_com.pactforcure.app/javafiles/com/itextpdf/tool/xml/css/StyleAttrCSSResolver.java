// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.exceptions.CssResolverException;
import com.itextpdf.tool.xml.net.FileRetrieve;
import com.itextpdf.tool.xml.net.FileRetrieveImpl;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import java.io.*;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.css:
//			CssFilesImpl, CssUtils, DefaultCssInheritanceRules, CssInheritanceRules, 
//			CssFiles, CssFileProcessor, CssFile

public class StyleAttrCSSResolver
	implements CSSResolver
{

	public StyleAttrCSSResolver()
	{
		this(((CssFiles) (new CssFilesImpl())), CssUtils.getInstance());
	//    0    0:aload_0         
	//    1    1:new             #22  <Class CssFilesImpl>
	//    2    4:dup             
	//    3    5:invokespecial   #24  <Method void CssFilesImpl()>
	//    4    8:invokestatic    #30  <Method CssUtils CssUtils.getInstance()>
	//    5   11:invokespecial   #33  <Method void StyleAttrCSSResolver(CssFiles, CssUtils)>
	//    6   14:return          
	}

	public StyleAttrCSSResolver(CssFiles cssfiles)
	{
		this(cssfiles, CssUtils.getInstance());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #30  <Method CssUtils CssUtils.getInstance()>
	//    3    5:invokespecial   #33  <Method void StyleAttrCSSResolver(CssFiles, CssUtils)>
	//    4    8:return          
	}

	public StyleAttrCSSResolver(CssFiles cssfiles, CssUtils cssutils)
	{
		this(((CssInheritanceRules) (new DefaultCssInheritanceRules())), cssfiles, cssutils);
	//    0    0:aload_0         
	//    1    1:new             #37  <Class DefaultCssInheritanceRules>
	//    2    4:dup             
	//    3    5:invokespecial   #38  <Method void DefaultCssInheritanceRules()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #41  <Method void StyleAttrCSSResolver(CssInheritanceRules, CssFiles, CssUtils)>
	//    7   13:return          
	}

	public StyleAttrCSSResolver(CssFiles cssfiles, FileRetrieve fileretrieve)
	{
		this(((CssInheritanceRules) (new DefaultCssInheritanceRules())), cssfiles, CssUtils.getInstance(), fileretrieve);
	//    0    0:aload_0         
	//    1    1:new             #37  <Class DefaultCssInheritanceRules>
	//    2    4:dup             
	//    3    5:invokespecial   #38  <Method void DefaultCssInheritanceRules()>
	//    4    8:aload_1         
	//    5    9:invokestatic    #30  <Method CssUtils CssUtils.getInstance()>
	//    6   12:aload_2         
	//    7   13:invokespecial   #45  <Method void StyleAttrCSSResolver(CssInheritanceRules, CssFiles, CssUtils, FileRetrieve)>
	//    8   16:return          
	}

	public StyleAttrCSSResolver(CssInheritanceRules cssinheritancerules, CssFiles cssfiles, CssUtils cssutils)
	{
		this(cssinheritancerules, cssfiles, cssutils, ((FileRetrieve) (new FileRetrieveImpl())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #47  <Class FileRetrieveImpl>
	//    5    7:dup             
	//    6    8:invokespecial   #48  <Method void FileRetrieveImpl()>
	//    7   11:invokespecial   #45  <Method void StyleAttrCSSResolver(CssInheritanceRules, CssFiles, CssUtils, FileRetrieve)>
	//    8   14:return          
	}

	public StyleAttrCSSResolver(CssInheritanceRules cssinheritancerules, CssFiles cssfiles, CssUtils cssutils, FileRetrieve fileretrieve)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		utils = cssutils;
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:putfield        #51  <Field CssUtils utils>
		cssFiles = cssfiles;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #53  <Field CssFiles cssFiles>
		inherit = cssinheritancerules;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #55  <Field CssInheritanceRules inherit>
		retrieve = fileretrieve;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #57  <Field FileRetrieve retrieve>
	//   14   25:return          
	}

	private boolean canInherite(Tag tag, String s)
	{
		if(inherit != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field CssInheritanceRules inherit>
	//*   2    4:ifnull          19
			return inherit.inheritCssSelector(tag, s);
	//    3    7:aload_0         
	//    4    8:getfield        #55  <Field CssInheritanceRules inherit>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #64  <Method boolean CssInheritanceRules.inheritCssSelector(Tag, String)>
	//    8   18:ireturn         
		else
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	private String mergeTextDecorationRules(String s, String s1)
	{
		if("none".equals(((Object) (s1))))
	//*   0    0:ldc1            #68  <String "none">
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            11
			return s1;
	//    4    9:aload_2         
	//    5   10:areturn         
		TreeSet treeset = new TreeSet();
	//    6   11:new             #76  <Class TreeSet>
	//    7   14:dup             
	//    8   15:invokespecial   #77  <Method void TreeSet()>
	//    9   18:astore_3        
		if(s != null)
	//*  10   19:aload_1         
	//*  11   20:ifnull          34
			Collections.addAll(((java.util.Collection) (treeset)), ((Object []) (s.split("\\s+"))));
	//   12   23:aload_3         
	//   13   24:aload_1         
	//   14   25:ldc1            #79  <String "\\s+">
	//   15   27:invokevirtual   #83  <Method String[] String.split(String)>
	//   16   30:invokestatic    #89  <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   17   33:pop             
		if(s1 != null)
	//*  18   34:aload_2         
	//*  19   35:ifnull          49
			Collections.addAll(((java.util.Collection) (treeset)), ((Object []) (s1.split("\\s+"))));
	//   20   38:aload_3         
	//   21   39:aload_2         
	//   22   40:ldc1            #79  <String "\\s+">
	//   23   42:invokevirtual   #83  <Method String[] String.split(String)>
	//   24   45:invokestatic    #89  <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   25   48:pop             
		s = ((String) (new StringBuilder()));
	//   26   49:new             #91  <Class StringBuilder>
	//   27   52:dup             
	//   28   53:invokespecial   #92  <Method void StringBuilder()>
	//   29   56:astore_1        
		s1 = ((String) (treeset.iterator()));
	//   30   57:aload_3         
	//   31   58:invokevirtual   #96  <Method Iterator TreeSet.iterator()>
	//   32   61:astore_2        
		do
		{
			if(!((Iterator) (s1)).hasNext())
				break;
	//   33   62:aload_2         
	//   34   63:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//   35   68:ifeq            122
			String s2 = (String)((Iterator) (s1)).next();
	//   36   71:aload_2         
	//   37   72:invokeinterface #106 <Method Object Iterator.next()>
	//   38   77:checkcast       #70  <Class String>
	//   39   80:astore_3        
			if(!s2.equals("none") && !s2.equals("inherit"))
	//*  40   81:aload_3         
	//*  41   82:ldc1            #68  <String "none">
	//*  42   84:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  43   87:ifne            62
	//*  44   90:aload_3         
	//*  45   91:ldc1            #107 <String "inherit">
	//*  46   93:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  47   96:ifne            62
			{
				if(((StringBuilder) (s)).length() > 0)
	//*  48   99:aload_1         
	//*  49  100:invokevirtual   #111 <Method int StringBuilder.length()>
	//*  50  103:ifle            113
					((StringBuilder) (s)).append(' ');
	//   51  106:aload_1         
	//   52  107:bipush          32
	//   53  109:invokevirtual   #115 <Method StringBuilder StringBuilder.append(char)>
	//   54  112:pop             
				((StringBuilder) (s)).append(s2);
	//   55  113:aload_1         
	//   56  114:aload_3         
	//   57  115:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   58  118:pop             
			}
		} while(true);
	//   59  119:goto            62
		if(((StringBuilder) (s)).length() == 0)
	//*  60  122:aload_1         
	//*  61  123:invokevirtual   #111 <Method int StringBuilder.length()>
	//*  62  126:ifne            133
			s = null;
	//   63  129:aconst_null     
	//   64  130:astore_1        
		else
	//*  65  131:aload_1         
	//*  66  132:areturn         
			s = ((StringBuilder) (s)).toString();
	//   67  133:aload_1         
	//   68  134:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   69  137:astore_1        
		return s;
	//*  70  138:goto            131
	}

	private boolean mustInherit(String s)
	{
		if(inherit != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field CssInheritanceRules inherit>
	//*   2    4:ifnull          18
			return inherit.inheritCssTag(s);
	//    3    7:aload_0         
	//    4    8:getfield        #55  <Field CssInheritanceRules inherit>
	//    5   11:aload_1         
	//    6   12:invokeinterface #127 <Method boolean CssInheritanceRules.inheritCssTag(String)>
	//    7   17:ireturn         
		else
			return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         
	}

	private void splitRules(Map map, String s, String s1)
	{
		if("border".equalsIgnoreCase(s))
	//*   0    0:ldc1            #131 <String "border">
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//*   3    6:ifeq            24
		{
			map.putAll(utils.parseBorder(s1));
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:getfield        #51  <Field CssUtils utils>
	//    7   14:aload_3         
	//    8   15:invokevirtual   #138 <Method Map CssUtils.parseBorder(String)>
	//    9   18:invokeinterface #144 <Method void Map.putAll(Map)>
		} else
	//*  10   23:return          
		{
			if("border-top".equalsIgnoreCase(s))
	//*  11   24:ldc1            #146 <String "border-top">
	//*  12   26:aload_2         
	//*  13   27:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//*  14   30:ifeq            50
			{
				map.putAll(utils.parseBorder(s1, "border-top"));
	//   15   33:aload_1         
	//   16   34:aload_0         
	//   17   35:getfield        #51  <Field CssUtils utils>
	//   18   38:aload_3         
	//   19   39:ldc1            #146 <String "border-top">
	//   20   41:invokevirtual   #149 <Method Map CssUtils.parseBorder(String, String)>
	//   21   44:invokeinterface #144 <Method void Map.putAll(Map)>
				return;
	//   22   49:return          
			}
			if("border-bottom".equalsIgnoreCase(s))
	//*  23   50:ldc1            #151 <String "border-bottom">
	//*  24   52:aload_2         
	//*  25   53:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//*  26   56:ifeq            76
			{
				map.putAll(utils.parseBorder(s1, "border-bottom"));
	//   27   59:aload_1         
	//   28   60:aload_0         
	//   29   61:getfield        #51  <Field CssUtils utils>
	//   30   64:aload_3         
	//   31   65:ldc1            #151 <String "border-bottom">
	//   32   67:invokevirtual   #149 <Method Map CssUtils.parseBorder(String, String)>
	//   33   70:invokeinterface #144 <Method void Map.putAll(Map)>
				return;
	//   34   75:return          
			}
			if("border-left".equalsIgnoreCase(s))
	//*  35   76:ldc1            #153 <String "border-left">
	//*  36   78:aload_2         
	//*  37   79:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//*  38   82:ifeq            102
			{
				map.putAll(utils.parseBorder(s1, "border-left"));
	//   39   85:aload_1         
	//   40   86:aload_0         
	//   41   87:getfield        #51  <Field CssUtils utils>
	//   42   90:aload_3         
	//   43   91:ldc1            #153 <String "border-left">
	//   44   93:invokevirtual   #149 <Method Map CssUtils.parseBorder(String, String)>
	//   45   96:invokeinterface #144 <Method void Map.putAll(Map)>
				return;
	//   46  101:return          
			}
			if("border-right".equalsIgnoreCase(s))
	//*  47  102:ldc1            #155 <String "border-right">
	//*  48  104:aload_2         
	//*  49  105:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//*  50  108:ifeq            128
			{
				map.putAll(utils.parseBorder(s1, "border-right"));
	//   51  111:aload_1         
	//   52  112:aload_0         
	//   53  113:getfield        #51  <Field CssUtils utils>
	//   54  116:aload_3         
	//   55  117:ldc1            #155 <String "border-right">
	//   56  119:invokevirtual   #149 <Method Map CssUtils.parseBorder(String, String)>
	//   57  122:invokeinterface #144 <Method void Map.putAll(Map)>
				return;
	//   58  127:return          
			}
			if("margin".equalsIgnoreCase(s))
	//*  59  128:ldc1            #157 <String "margin">
	//*  60  130:aload_2         
	//*  61  131:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//*  62  134:ifeq            156
			{
				map.putAll(utils.parseBoxValues(s1, "margin-", ""));
	//   63  137:aload_1         
	//   64  138:aload_0         
	//   65  139:getfield        #51  <Field CssUtils utils>
	//   66  142:aload_3         
	//   67  143:ldc1            #159 <String "margin-">
	//   68  145:ldc1            #161 <String "">
	//   69  147:invokevirtual   #165 <Method Map CssUtils.parseBoxValues(String, String, String)>
	//   70  150:invokeinterface #144 <Method void Map.putAll(Map)>
				return;
	//   71  155:return          
			}
			if("border-width".equalsIgnoreCase(s))
	//*  72  156:ldc1            #167 <String "border-width">
	//*  73  158:aload_2         
	//*  74  159:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//*  75  162:ifeq            184
			{
				map.putAll(utils.parseBoxValues(s1, "border-", "-width"));
	//   76  165:aload_1         
	//   77  166:aload_0         
	//   78  167:getfield        #51  <Field CssUtils utils>
	//   79  170:aload_3         
	//   80  171:ldc1            #169 <String "border-">
	//   81  173:ldc1            #171 <String "-width">
	//   82  175:invokevirtual   #165 <Method Map CssUtils.parseBoxValues(String, String, String)>
	//   83  178:invokeinterface #144 <Method void Map.putAll(Map)>
				return;
	//   84  183:return          
			}
			if("border-style".equalsIgnoreCase(s))
	//*  85  184:ldc1            #173 <String "border-style">
	//*  86  186:aload_2         
	//*  87  187:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//*  88  190:ifeq            212
			{
				map.putAll(utils.parseBoxValues(s1, "border-", "-style"));
	//   89  193:aload_1         
	//   90  194:aload_0         
	//   91  195:getfield        #51  <Field CssUtils utils>
	//   92  198:aload_3         
	//   93  199:ldc1            #169 <String "border-">
	//   94  201:ldc1            #175 <String "-style">
	//   95  203:invokevirtual   #165 <Method Map CssUtils.parseBoxValues(String, String, String)>
	//   96  206:invokeinterface #144 <Method void Map.putAll(Map)>
				return;
	//   97  211:return          
			}
			if("border-color".equalsIgnoreCase(s))
	//*  98  212:ldc1            #177 <String "border-color">
	//*  99  214:aload_2         
	//* 100  215:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 101  218:ifeq            240
			{
				map.putAll(utils.parseBoxValues(s1, "border-", "-color"));
	//  102  221:aload_1         
	//  103  222:aload_0         
	//  104  223:getfield        #51  <Field CssUtils utils>
	//  105  226:aload_3         
	//  106  227:ldc1            #169 <String "border-">
	//  107  229:ldc1            #179 <String "-color">
	//  108  231:invokevirtual   #165 <Method Map CssUtils.parseBoxValues(String, String, String)>
	//  109  234:invokeinterface #144 <Method void Map.putAll(Map)>
				return;
	//  110  239:return          
			}
			if("padding".equalsIgnoreCase(s))
	//* 111  240:ldc1            #181 <String "padding">
	//* 112  242:aload_2         
	//* 113  243:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 114  246:ifeq            268
			{
				map.putAll(utils.parseBoxValues(s1, "padding-", ""));
	//  115  249:aload_1         
	//  116  250:aload_0         
	//  117  251:getfield        #51  <Field CssUtils utils>
	//  118  254:aload_3         
	//  119  255:ldc1            #183 <String "padding-">
	//  120  257:ldc1            #161 <String "">
	//  121  259:invokevirtual   #165 <Method Map CssUtils.parseBoxValues(String, String, String)>
	//  122  262:invokeinterface #144 <Method void Map.putAll(Map)>
				return;
	//  123  267:return          
			}
			if("font".equalsIgnoreCase(s))
	//* 124  268:ldc1            #185 <String "font">
	//* 125  270:aload_2         
	//* 126  271:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 127  274:ifeq            292
			{
				map.putAll(utils.processFont(s1));
	//  128  277:aload_1         
	//  129  278:aload_0         
	//  130  279:getfield        #51  <Field CssUtils utils>
	//  131  282:aload_3         
	//  132  283:invokevirtual   #188 <Method Map CssUtils.processFont(String)>
	//  133  286:invokeinterface #144 <Method void Map.putAll(Map)>
				return;
	//  134  291:return          
			}
			if("list-style".equalsIgnoreCase(s))
	//* 135  292:ldc1            #190 <String "list-style">
	//* 136  294:aload_2         
	//* 137  295:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 138  298:ifeq            316
			{
				map.putAll(utils.processListStyle(s1));
	//  139  301:aload_1         
	//  140  302:aload_0         
	//  141  303:getfield        #51  <Field CssUtils utils>
	//  142  306:aload_3         
	//  143  307:invokevirtual   #193 <Method Map CssUtils.processListStyle(String)>
	//  144  310:invokeinterface #144 <Method void Map.putAll(Map)>
				return;
	//  145  315:return          
			}
			if(s.toLowerCase().contains("background"))
	//* 146  316:aload_2         
	//* 147  317:invokevirtual   #196 <Method String String.toLowerCase()>
	//* 148  320:ldc1            #198 <String "background">
	//* 149  322:invokevirtual   #202 <Method boolean String.contains(CharSequence)>
	//* 150  325:ifeq            400
			{
				s = ((String) (utils.processBackground(s1)));
	//  151  328:aload_0         
	//  152  329:getfield        #51  <Field CssUtils utils>
	//  153  332:aload_3         
	//  154  333:invokevirtual   #205 <Method Map CssUtils.processBackground(String)>
	//  155  336:astore_2        
				s1 = ((String) (((Map) (s)).keySet().iterator()));
	//  156  337:aload_2         
	//  157  338:invokeinterface #209 <Method Set Map.keySet()>
	//  158  343:invokeinterface #212 <Method Iterator Set.iterator()>
	//  159  348:astore_3        
				while(((Iterator) (s1)).hasNext()) 
	//* 160  349:aload_3         
	//* 161  350:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//* 162  355:ifeq            23
				{
					String s2 = (String)((Iterator) (s1)).next();
	//  163  358:aload_3         
	//  164  359:invokeinterface #106 <Method Object Iterator.next()>
	//  165  364:checkcast       #70  <Class String>
	//  166  367:astore          4
					if(!map.containsKey(((Object) (s2))))
	//* 167  369:aload_1         
	//* 168  370:aload           4
	//* 169  372:invokeinterface #215 <Method boolean Map.containsKey(Object)>
	//* 170  377:ifne            349
						map.put(((Object) (s2)), ((Map) (s)).get(((Object) (s2))));
	//  171  380:aload_1         
	//  172  381:aload           4
	//  173  383:aload_2         
	//  174  384:aload           4
	//  175  386:invokeinterface #219 <Method Object Map.get(Object)>
	//  176  391:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  177  396:pop             
				}
			} else
	//* 178  397:goto            349
			{
				map.put(((Object) (s)), ((Object) (s1)));
	//  179  400:aload_1         
	//  180  401:aload_2         
	//  181  402:aload_3         
	//  182  403:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  183  408:pop             
				return;
	//  184  409:return          
			}
		}
	}

	public void addCss(CssFile cssfile)
	{
		cssFiles.add(cssfile);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field CssFiles cssFiles>
	//    2    4:aload_1         
	//    3    5:invokeinterface #232 <Method void CssFiles.add(CssFile)>
	//    4   10:return          
	}

	public void addCss(String s, String s1, boolean flag)
		throws CssResolverException
	{
		CssFileProcessor cssfileprocessor = new CssFileProcessor();
	//    0    0:new             #241 <Class CssFileProcessor>
	//    1    3:dup             
	//    2    4:invokespecial   #242 <Method void CssFileProcessor()>
	//    3    7:astore          4
		try
		{
			retrieve.processFromStream(((java.io.InputStream) (new ByteArrayInputStream(s.getBytes(s1)))), ((com.itextpdf.tool.xml.net.ReadingProcessor) (cssfileprocessor)));
	//    4    9:aload_0         
	//    5   10:getfield        #57  <Field FileRetrieve retrieve>
	//    6   13:new             #244 <Class ByteArrayInputStream>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:aload_2         
	//   10   19:invokevirtual   #248 <Method byte[] String.getBytes(String)>
	//   11   22:invokespecial   #251 <Method void ByteArrayInputStream(byte[])>
	//   12   25:aload           4
	//   13   27:invokeinterface #257 <Method void FileRetrieve.processFromStream(java.io.InputStream, com.itextpdf.tool.xml.net.ReadingProcessor)>
			s = ((String) (cssfileprocessor.getCss()));
	//   14   32:aload           4
	//   15   34:invokevirtual   #261 <Method CssFile CssFileProcessor.getCss()>
	//   16   37:astore_1        
			((CssFile) (s)).isPersistent(flag);
	//   17   38:aload_1         
	//   18   39:iload_3         
	//   19   40:invokeinterface #267 <Method void CssFile.isPersistent(boolean)>
			cssFiles.add(((CssFile) (s)));
	//   20   45:aload_0         
	//   21   46:getfield        #53  <Field CssFiles cssFiles>
	//   22   49:aload_1         
	//   23   50:invokeinterface #232 <Method void CssFiles.add(CssFile)>
			return;
	//   24   55:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  25   56:astore_1        
		{
			throw new CssResolverException(((Throwable) (s)));
	//   26   57:new             #235 <Class CssResolverException>
	//   27   60:dup             
	//   28   61:aload_1         
	//   29   62:invokespecial   #270 <Method void CssResolverException(Throwable)>
	//   30   65:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  31   66:astore_1        
		{
			throw new CssResolverException(((Throwable) (s)));
	//   32   67:new             #235 <Class CssResolverException>
	//   33   70:dup             
	//   34   71:aload_1         
	//   35   72:invokespecial   #270 <Method void CssResolverException(Throwable)>
	//   36   75:athrow          
		}
	}

	public void addCss(String s, boolean flag)
		throws CssResolverException
	{
		CssFileProcessor cssfileprocessor = new CssFileProcessor();
	//    0    0:new             #241 <Class CssFileProcessor>
	//    1    3:dup             
	//    2    4:invokespecial   #242 <Method void CssFileProcessor()>
	//    3    7:astore_3        
		FileRetrieveImpl fileretrieveimpl = new FileRetrieveImpl();
	//    4    8:new             #47  <Class FileRetrieveImpl>
	//    5   11:dup             
	//    6   12:invokespecial   #48  <Method void FileRetrieveImpl()>
	//    7   15:astore          4
		try
		{
			((FileRetrieve) (fileretrieveimpl)).processFromStream(((java.io.InputStream) (new ByteArrayInputStream(s.getBytes()))), ((com.itextpdf.tool.xml.net.ReadingProcessor) (cssfileprocessor)));
	//    8   17:aload           4
	//    9   19:new             #244 <Class ByteArrayInputStream>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokevirtual   #275 <Method byte[] String.getBytes()>
	//   13   27:invokespecial   #251 <Method void ByteArrayInputStream(byte[])>
	//   14   30:aload_3         
	//   15   31:invokeinterface #257 <Method void FileRetrieve.processFromStream(java.io.InputStream, com.itextpdf.tool.xml.net.ReadingProcessor)>
			s = ((String) (cssfileprocessor.getCss()));
	//   16   36:aload_3         
	//   17   37:invokevirtual   #261 <Method CssFile CssFileProcessor.getCss()>
	//   18   40:astore_1        
			((CssFile) (s)).isPersistent(flag);
	//   19   41:aload_1         
	//   20   42:iload_2         
	//   21   43:invokeinterface #267 <Method void CssFile.isPersistent(boolean)>
			cssFiles.add(((CssFile) (s)));
	//   22   48:aload_0         
	//   23   49:getfield        #53  <Field CssFiles cssFiles>
	//   24   52:aload_1         
	//   25   53:invokeinterface #232 <Method void CssFiles.add(CssFile)>
			return;
	//   26   58:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  27   59:astore_1        
		{
			throw new CssResolverException(((Throwable) (s)));
	//   28   60:new             #235 <Class CssResolverException>
	//   29   63:dup             
	//   30   64:aload_1         
	//   31   65:invokespecial   #270 <Method void CssResolverException(Throwable)>
	//   32   68:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  33   69:astore_1        
		{
			throw new CssResolverException(((Throwable) (s)));
	//   34   70:new             #235 <Class CssResolverException>
	//   35   73:dup             
	//   36   74:aload_1         
	//   37   75:invokespecial   #270 <Method void CssResolverException(Throwable)>
	//   38   78:athrow          
		}
	}

	public void addCssFile(String s, boolean flag)
		throws CssResolverException
	{
		CssFileProcessor cssfileprocessor = new CssFileProcessor();
	//    0    0:new             #241 <Class CssFileProcessor>
	//    1    3:dup             
	//    2    4:invokespecial   #242 <Method void CssFileProcessor()>
	//    3    7:astore_3        
		try
		{
			retrieve.processFromHref(s, ((com.itextpdf.tool.xml.net.ReadingProcessor) (cssfileprocessor)));
	//    4    8:aload_0         
	//    5    9:getfield        #57  <Field FileRetrieve retrieve>
	//    6   12:aload_1         
	//    7   13:aload_3         
	//    8   14:invokeinterface #280 <Method void FileRetrieve.processFromHref(String, com.itextpdf.tool.xml.net.ReadingProcessor)>
		}
	//*   9   19:aload_3         
	//*  10   20:invokevirtual   #261 <Method CssFile CssFileProcessor.getCss()>
	//*  11   23:astore_1        
	//*  12   24:aload_1         
	//*  13   25:iload_2         
	//*  14   26:invokeinterface #267 <Method void CssFile.isPersistent(boolean)>
	//*  15   31:aload_0         
	//*  16   32:getfield        #53  <Field CssFiles cssFiles>
	//*  17   35:aload_1         
	//*  18   36:invokeinterface #232 <Method void CssFiles.add(CssFile)>
	//*  19   41:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  20   42:astore_1        
		{
			throw new CssResolverException(((Throwable) (s)));
	//   21   43:new             #235 <Class CssResolverException>
	//   22   46:dup             
	//   23   47:aload_1         
	//   24   48:invokespecial   #270 <Method void CssResolverException(Throwable)>
	//   25   51:athrow          
		}
		s = ((String) (cssfileprocessor.getCss()));
		((CssFile) (s)).isPersistent(flag);
		cssFiles.add(((CssFile) (s)));
	}

	public CSSResolver clear()
		throws CssResolverException
	{
		cssFiles.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field CssFiles cssFiles>
	//    2    4:invokeinterface #284 <Method void CssFiles.clear()>
		return ((CSSResolver) (this));
	//    3    9:aload_0         
	//    4   10:areturn         
	}

	public void resolveStyles(Tag tag)
	{
		Object obj;
		Map map;
label0:
		{
			Object obj3 = ((Object) (new LinkedHashMap()));
	//    0    0:new             #288 <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #289 <Method void LinkedHashMap()>
	//    3    7:astore          7
			Object obj1 = null;
	//    4    9:aconst_null     
	//    5   10:astore          6
			map = ((Map) (obj1));
	//    6   12:aload           6
	//    7   14:astore          5
			obj = obj3;
	//    8   16:aload           7
	//    9   18:astore          4
			if(cssFiles == null)
				break label0;
	//   10   20:aload_0         
	//   11   21:getfield        #53  <Field CssFiles cssFiles>
	//   12   24:ifnull          118
			map = ((Map) (obj1));
	//   13   27:aload           6
	//   14   29:astore          5
			obj = obj3;
	//   15   31:aload           7
	//   16   33:astore          4
			if(!cssFiles.hasFiles())
				break label0;
	//   17   35:aload_0         
	//   18   36:getfield        #53  <Field CssFiles cssFiles>
	//   19   39:invokeinterface #292 <Method boolean CssFiles.hasFiles()>
	//   20   44:ifeq            118
			obj3 = ((Object) (cssFiles.getCSS(tag)));
	//   21   47:aload_0         
	//   22   48:getfield        #53  <Field CssFiles cssFiles>
	//   23   51:aload_1         
	//   24   52:invokeinterface #296 <Method Map CssFiles.getCSS(Tag)>
	//   25   57:astore          7
			if(!tag.getName().equalsIgnoreCase("p"))
	//*  26   59:aload_1         
	//*  27   60:invokevirtual   #301 <Method String Tag.getName()>
	//*  28   63:ldc2            #303 <String "p">
	//*  29   66:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//*  30   69:ifne            93
			{
				map = ((Map) (obj1));
	//   31   72:aload           6
	//   32   74:astore          5
				obj = obj3;
	//   33   76:aload           7
	//   34   78:astore          4
				if(!tag.getName().equalsIgnoreCase("td"))
					break label0;
	//   35   80:aload_1         
	//   36   81:invokevirtual   #301 <Method String Tag.getName()>
	//   37   84:ldc2            #305 <String "td">
	//   38   87:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//   39   90:ifeq            118
			}
			map = cssFiles.getCSS(new Tag("ul"));
	//   40   93:aload_0         
	//   41   94:getfield        #53  <Field CssFiles cssFiles>
	//   42   97:new             #298 <Class Tag>
	//   43  100:dup             
	//   44  101:ldc2            #307 <String "ul">
	//   45  104:invokespecial   #310 <Method void Tag(String)>
	//   46  107:invokeinterface #296 <Method Map CssFiles.getCSS(Tag)>
	//   47  112:astore          5
			obj = obj3;
	//   48  114:aload           7
	//   49  116:astore          4
		}
		if(tag.getAttributes() != null && !tag.getAttributes().isEmpty())
	//*  50  118:aload_1         
	//*  51  119:invokevirtual   #314 <Method Map Tag.getAttributes()>
	//*  52  122:ifnull          410
	//*  53  125:aload_1         
	//*  54  126:invokevirtual   #314 <Method Map Tag.getAttributes()>
	//*  55  129:invokeinterface #317 <Method boolean Map.isEmpty()>
	//*  56  134:ifne            410
		{
			if(tag.getAttributes().get("cellpadding") != null)
	//*  57  137:aload_1         
	//*  58  138:invokevirtual   #314 <Method Map Tag.getAttributes()>
	//*  59  141:ldc2            #319 <String "cellpadding">
	//*  60  144:invokeinterface #219 <Method Object Map.get(Object)>
	//*  61  149:ifnull          186
				((Map) (obj)).putAll(utils.parseBoxValues((String)tag.getAttributes().get("cellpadding"), "cellpadding-", ""));
	//   62  152:aload           4
	//   63  154:aload_0         
	//   64  155:getfield        #51  <Field CssUtils utils>
	//   65  158:aload_1         
	//   66  159:invokevirtual   #314 <Method Map Tag.getAttributes()>
	//   67  162:ldc2            #319 <String "cellpadding">
	//   68  165:invokeinterface #219 <Method Object Map.get(Object)>
	//   69  170:checkcast       #70  <Class String>
	//   70  173:ldc2            #321 <String "cellpadding-">
	//   71  176:ldc1            #161 <String "">
	//   72  178:invokevirtual   #165 <Method Map CssUtils.parseBoxValues(String, String, String)>
	//   73  181:invokeinterface #144 <Method void Map.putAll(Map)>
			if(tag.getAttributes().get("cellspacing") != null)
	//*  74  186:aload_1         
	//*  75  187:invokevirtual   #314 <Method Map Tag.getAttributes()>
	//*  76  190:ldc2            #323 <String "cellspacing">
	//*  77  193:invokeinterface #219 <Method Object Map.get(Object)>
	//*  78  198:ifnull          235
				((Map) (obj)).putAll(utils.parseBoxValues((String)tag.getAttributes().get("cellspacing"), "cellspacing-", ""));
	//   79  201:aload           4
	//   80  203:aload_0         
	//   81  204:getfield        #51  <Field CssUtils utils>
	//   82  207:aload_1         
	//   83  208:invokevirtual   #314 <Method Map Tag.getAttributes()>
	//   84  211:ldc2            #323 <String "cellspacing">
	//   85  214:invokeinterface #219 <Method Object Map.get(Object)>
	//   86  219:checkcast       #70  <Class String>
	//   87  222:ldc2            #325 <String "cellspacing-">
	//   88  225:ldc1            #161 <String "">
	//   89  227:invokevirtual   #165 <Method Map CssUtils.parseBoxValues(String, String, String)>
	//   90  230:invokeinterface #144 <Method void Map.putAll(Map)>
			String s1 = (String)tag.getAttributes().get("style");
	//   91  235:aload_1         
	//   92  236:invokevirtual   #314 <Method Map Tag.getAttributes()>
	//   93  239:ldc1            #10  <String "style">
	//   94  241:invokeinterface #219 <Method Object Map.get(Object)>
	//   95  246:checkcast       #70  <Class String>
	//   96  249:astore          7
			if(s1 != null && s1.length() > 0)
	//*  97  251:aload           7
	//*  98  253:ifnull          410
	//*  99  256:aload           7
	//* 100  258:invokevirtual   #326 <Method int String.length()>
	//* 101  261:ifle            410
			{
				Object obj2 = ((Object) (new LinkedHashMap()));
	//  102  264:new             #288 <Class LinkedHashMap>
	//  103  267:dup             
	//  104  268:invokespecial   #289 <Method void LinkedHashMap()>
	//  105  271:astore          6
				String as[] = s1.split(";");
	//  106  273:aload           7
	//  107  275:ldc2            #328 <String ";">
	//  108  278:invokevirtual   #83  <Method String[] String.split(String)>
	//  109  281:astore          7
				int j = as.length;
	//  110  283:aload           7
	//  111  285:arraylength     
	//  112  286:istore_3        
				for(int i = 0; i < j; i++)
	//* 113  287:iconst_0        
	//* 114  288:istore_2        
	//* 115  289:iload_2         
	//* 116  290:iload_3         
	//* 117  291:icmpge          349
				{
					String as1[] = as[i].split(":", 2);
	//  118  294:aload           7
	//  119  296:iload_2         
	//  120  297:aaload          
	//  121  298:ldc2            #330 <String ":">
	//  122  301:iconst_2        
	//  123  302:invokevirtual   #333 <Method String[] String.split(String, int)>
	//  124  305:astore          8
					if(as1.length == 2)
	//* 125  307:aload           8
	//* 126  309:arraylength     
	//* 127  310:iconst_2        
	//* 128  311:icmpne          342
						splitRules(((Map) (obj2)), utils.stripDoubleSpacesTrimAndToLowerCase(as1[0]), utils.stripDoubleSpacesAndTrim(as1[1]));
	//  129  314:aload_0         
	//  130  315:aload           6
	//  131  317:aload_0         
	//  132  318:getfield        #51  <Field CssUtils utils>
	//  133  321:aload           8
	//  134  323:iconst_0        
	//  135  324:aaload          
	//  136  325:invokevirtual   #337 <Method String CssUtils.stripDoubleSpacesTrimAndToLowerCase(String)>
	//  137  328:aload_0         
	//  138  329:getfield        #51  <Field CssUtils utils>
	//  139  332:aload           8
	//  140  334:iconst_1        
	//  141  335:aaload          
	//  142  336:invokevirtual   #340 <Method String CssUtils.stripDoubleSpacesAndTrim(String)>
	//  143  339:invokespecial   #342 <Method void splitRules(Map, String, String)>
				}

	//  144  342:iload_2         
	//  145  343:iconst_1        
	//  146  344:iadd            
	//  147  345:istore_2        
	//* 148  346:goto            289
				java.util.Map.Entry entry1;
				for(obj2 = ((Object) (((Map) (obj2)).entrySet().iterator())); ((Iterator) (obj2)).hasNext(); ((Map) (obj)).put(entry1.getKey(), entry1.getValue()))
	//* 149  349:aload           6
	//* 150  351:invokeinterface #345 <Method Set Map.entrySet()>
	//* 151  356:invokeinterface #212 <Method Iterator Set.iterator()>
	//* 152  361:astore          6
	//* 153  363:aload           6
	//* 154  365:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//* 155  370:ifeq            410
					entry1 = (java.util.Map.Entry)((Iterator) (obj2)).next();
	//  156  373:aload           6
	//  157  375:invokeinterface #106 <Method Object Iterator.next()>
	//  158  380:checkcast       #347 <Class java.util.Map$Entry>
	//  159  383:astore          7

	//  160  385:aload           4
	//  161  387:aload           7
	//  162  389:invokeinterface #350 <Method Object java.util.Map$Entry.getKey()>
	//  163  394:aload           7
	//  164  396:invokeinterface #353 <Method Object java.util.Map$Entry.getValue()>
	//  165  401:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  166  406:pop             
			}
		}
	//* 167  407:goto            363
		Map map1 = tag.getCSS();
	//  168  410:aload_1         
	//  169  411:invokevirtual   #355 <Method Map Tag.getCSS()>
	//  170  414:astore          6
		if(tag.getName() != null)
	//* 171  416:aload_1         
	//* 172  417:invokevirtual   #301 <Method String Tag.getName()>
	//* 173  420:ifnull          515
			if(tag.getName().equalsIgnoreCase("i") || tag.getName().equalsIgnoreCase("cite") || tag.getName().equalsIgnoreCase("em") || tag.getName().equalsIgnoreCase("var") || tag.getName().equalsIgnoreCase("dfn") || tag.getName().equalsIgnoreCase("address"))
	//* 174  423:aload_1         
	//* 175  424:invokevirtual   #301 <Method String Tag.getName()>
	//* 176  427:ldc2            #357 <String "i">
	//* 177  430:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 178  433:ifne            501
	//* 179  436:aload_1         
	//* 180  437:invokevirtual   #301 <Method String Tag.getName()>
	//* 181  440:ldc2            #359 <String "cite">
	//* 182  443:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 183  446:ifne            501
	//* 184  449:aload_1         
	//* 185  450:invokevirtual   #301 <Method String Tag.getName()>
	//* 186  453:ldc2            #361 <String "em">
	//* 187  456:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 188  459:ifne            501
	//* 189  462:aload_1         
	//* 190  463:invokevirtual   #301 <Method String Tag.getName()>
	//* 191  466:ldc2            #363 <String "var">
	//* 192  469:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 193  472:ifne            501
	//* 194  475:aload_1         
	//* 195  476:invokevirtual   #301 <Method String Tag.getName()>
	//* 196  479:ldc2            #365 <String "dfn">
	//* 197  482:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 198  485:ifne            501
	//* 199  488:aload_1         
	//* 200  489:invokevirtual   #301 <Method String Tag.getName()>
	//* 201  492:ldc2            #367 <String "address">
	//* 202  495:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 203  498:ifeq            746
				((Map) (obj)).put("font-style", "italic");
	//  204  501:aload           4
	//  205  503:ldc2            #369 <String "font-style">
	//  206  506:ldc2            #371 <String "italic">
	//  207  509:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  208  514:pop             
			else
	//* 209  515:aload           5
	//* 210  517:ifnull          554
	//* 211  520:aload           5
	//* 212  522:ldc2            #373 <String "list-style-type">
	//* 213  525:invokeinterface #215 <Method boolean Map.containsKey(Object)>
	//* 214  530:ifeq            554
	//* 215  533:aload           6
	//* 216  535:ldc2            #373 <String "list-style-type">
	//* 217  538:aload           5
	//* 218  540:ldc2            #373 <String "list-style-type">
	//* 219  543:invokeinterface #219 <Method Object Map.get(Object)>
	//* 220  548:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//* 221  553:pop             
	//* 222  554:aload_0         
	//* 223  555:aload_1         
	//* 224  556:invokevirtual   #301 <Method String Tag.getName()>
	//* 225  559:invokespecial   #375 <Method boolean mustInherit(String)>
	//* 226  562:ifeq            982
	//* 227  565:aload_1         
	//* 228  566:invokevirtual   #379 <Method Tag Tag.getParent()>
	//* 229  569:ifnull          982
	//* 230  572:aload_1         
	//* 231  573:invokevirtual   #379 <Method Tag Tag.getParent()>
	//* 232  576:invokevirtual   #355 <Method Map Tag.getCSS()>
	//* 233  579:ifnull          982
	//* 234  582:aload_0         
	//* 235  583:getfield        #55  <Field CssInheritanceRules inherit>
	//* 236  586:ifnull          968
	//* 237  589:aload_1         
	//* 238  590:invokevirtual   #379 <Method Tag Tag.getParent()>
	//* 239  593:invokevirtual   #355 <Method Map Tag.getCSS()>
	//* 240  596:invokeinterface #345 <Method Set Map.entrySet()>
	//* 241  601:invokeinterface #212 <Method Iterator Set.iterator()>
	//* 242  606:astore          5
	//* 243  608:aload           5
	//* 244  610:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//* 245  615:ifeq            982
	//* 246  618:aload           5
	//* 247  620:invokeinterface #106 <Method Object Iterator.next()>
	//* 248  625:checkcast       #347 <Class java.util.Map$Entry>
	//* 249  628:astore          7
	//* 250  630:aload           7
	//* 251  632:invokeinterface #350 <Method Object java.util.Map$Entry.getKey()>
	//* 252  637:checkcast       #70  <Class String>
	//* 253  640:astore          8
	//* 254  642:aload           4
	//* 255  644:aload           8
	//* 256  646:invokeinterface #215 <Method boolean Map.containsKey(Object)>
	//* 257  651:ifeq            671
	//* 258  654:ldc1            #107 <String "inherit">
	//* 259  656:aload           4
	//* 260  658:aload           8
	//* 261  660:invokeinterface #219 <Method Object Map.get(Object)>
	//* 262  665:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 263  668:ifne            681
	//* 264  671:aload_0         
	//* 265  672:aload_1         
	//* 266  673:aload           8
	//* 267  675:invokespecial   #381 <Method boolean canInherite(Tag, String)>
	//* 268  678:ifeq            608
	//* 269  681:aload           8
	//* 270  683:ldc2            #319 <String "cellpadding">
	//* 271  686:invokevirtual   #202 <Method boolean String.contains(CharSequence)>
	//* 272  689:ifeq            948
	//* 273  692:ldc2            #305 <String "td">
	//* 274  695:aload_1         
	//* 275  696:invokevirtual   #301 <Method String Tag.getName()>
	//* 276  699:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 277  702:ifne            718
	//* 278  705:ldc2            #383 <String "th">
	//* 279  708:aload_1         
	//* 280  709:invokevirtual   #301 <Method String Tag.getName()>
	//* 281  712:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 282  715:ifeq            948
	//* 283  718:aload           4
	//* 284  720:aload           8
	//* 285  722:ldc2            #319 <String "cellpadding">
	//* 286  725:ldc1            #181 <String "padding">
	//* 287  727:invokevirtual   #387 <Method String String.replace(CharSequence, CharSequence)>
	//* 288  730:aload           7
	//* 289  732:invokeinterface #353 <Method Object java.util.Map$Entry.getValue()>
	//* 290  737:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//* 291  742:pop             
	//* 292  743:goto            608
			if(tag.getName().equalsIgnoreCase("b") || tag.getName().equalsIgnoreCase("strong"))
	//* 293  746:aload_1         
	//* 294  747:invokevirtual   #301 <Method String Tag.getName()>
	//* 295  750:ldc2            #389 <String "b">
	//* 296  753:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 297  756:ifne            772
	//* 298  759:aload_1         
	//* 299  760:invokevirtual   #301 <Method String Tag.getName()>
	//* 300  763:ldc2            #391 <String "strong">
	//* 301  766:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 302  769:ifeq            789
				((Map) (obj)).put("font-weight", "bold");
	//  303  772:aload           4
	//  304  774:ldc2            #393 <String "font-weight">
	//  305  777:ldc2            #395 <String "bold">
	//  306  780:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  307  785:pop             
			else
	//* 308  786:goto            515
			if(tag.getName().equalsIgnoreCase("u") || tag.getName().equalsIgnoreCase("ins"))
	//* 309  789:aload_1         
	//* 310  790:invokevirtual   #301 <Method String Tag.getName()>
	//* 311  793:ldc2            #397 <String "u">
	//* 312  796:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 313  799:ifne            815
	//* 314  802:aload_1         
	//* 315  803:invokevirtual   #301 <Method String Tag.getName()>
	//* 316  806:ldc2            #399 <String "ins">
	//* 317  809:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 318  812:ifeq            832
				((Map) (obj)).put("text-decoration", "underline");
	//  319  815:aload           4
	//  320  817:ldc2            #401 <String "text-decoration">
	//  321  820:ldc2            #403 <String "underline">
	//  322  823:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  323  828:pop             
			else
	//* 324  829:goto            515
			if(tag.getName().equalsIgnoreCase("s") || tag.getName().equalsIgnoreCase("strike") || tag.getName().equalsIgnoreCase("del"))
	//* 325  832:aload_1         
	//* 326  833:invokevirtual   #301 <Method String Tag.getName()>
	//* 327  836:ldc2            #405 <String "s">
	//* 328  839:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 329  842:ifne            871
	//* 330  845:aload_1         
	//* 331  846:invokevirtual   #301 <Method String Tag.getName()>
	//* 332  849:ldc2            #407 <String "strike">
	//* 333  852:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 334  855:ifne            871
	//* 335  858:aload_1         
	//* 336  859:invokevirtual   #301 <Method String Tag.getName()>
	//* 337  862:ldc2            #409 <String "del">
	//* 338  865:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 339  868:ifeq            888
				((Map) (obj)).put("text-decoration", "line-through");
	//  340  871:aload           4
	//  341  873:ldc2            #401 <String "text-decoration">
	//  342  876:ldc2            #411 <String "line-through">
	//  343  879:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  344  884:pop             
			else
	//* 345  885:goto            515
			if(tag.getName().equalsIgnoreCase("big"))
	//* 346  888:aload_1         
	//* 347  889:invokevirtual   #301 <Method String Tag.getName()>
	//* 348  892:ldc2            #413 <String "big">
	//* 349  895:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 350  898:ifeq            918
				((Map) (obj)).put("font-size", "larger");
	//  351  901:aload           4
	//  352  903:ldc2            #415 <String "font-size">
	//  353  906:ldc2            #417 <String "larger">
	//  354  909:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  355  914:pop             
			else
	//* 356  915:goto            515
			if(tag.getName().equalsIgnoreCase("small"))
	//* 357  918:aload_1         
	//* 358  919:invokevirtual   #301 <Method String Tag.getName()>
	//* 359  922:ldc2            #419 <String "small">
	//* 360  925:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 361  928:ifeq            515
				((Map) (obj)).put("font-size", "smaller");
	//  362  931:aload           4
	//  363  933:ldc2            #415 <String "font-size">
	//  364  936:ldc2            #421 <String "smaller">
	//  365  939:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  366  944:pop             
		if(map != null && map.containsKey("list-style-type"))
			map1.put("list-style-type", map.get("list-style-type"));
		if(mustInherit(tag.getName()) && tag.getParent() != null && tag.getParent().getCSS() != null)
			if(inherit != null)
			{
				Iterator iterator = tag.getParent().getCSS().entrySet().iterator();
				do
				{
					if(!iterator.hasNext())
						break;
					java.util.Map.Entry entry2 = (java.util.Map.Entry)iterator.next();
					String s2 = (String)entry2.getKey();
					if(((Map) (obj)).containsKey(((Object) (s2))) && "inherit".equals(((Map) (obj)).get(((Object) (s2)))) || canInherite(tag, s2))
						if(s2.contains("cellpadding") && ("td".equals(((Object) (tag.getName()))) || "th".equals(((Object) (tag.getName())))))
							((Map) (obj)).put(((Object) (s2.replace("cellpadding", "padding"))), entry2.getValue());
						else
	//* 367  945:goto            515
							map1.put(((Object) (s2)), entry2.getValue());
	//  368  948:aload           6
	//  369  950:aload           8
	//  370  952:aload           7
	//  371  954:invokeinterface #353 <Method Object java.util.Map$Entry.getValue()>
	//  372  959:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  373  964:pop             
				} while(true);
	//  374  965:goto            608
			} else
			{
				map1.putAll(tag.getParent().getCSS());
	//  375  968:aload           6
	//  376  970:aload_1         
	//  377  971:invokevirtual   #379 <Method Tag Tag.getParent()>
	//  378  974:invokevirtual   #355 <Method Map Tag.getCSS()>
	//  379  977:invokeinterface #144 <Method void Map.putAll(Map)>
			}
		if(tag.getName() != null)
	//* 380  982:aload_1         
	//* 381  983:invokevirtual   #301 <Method String Tag.getName()>
	//* 382  986:ifnull          1115
			if(tag.getName().equals("font"))
	//* 383  989:aload_1         
	//* 384  990:invokevirtual   #301 <Method String Tag.getName()>
	//* 385  993:ldc1            #185 <String "font">
	//* 386  995:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 387  998:ifeq            1400
			{
				String s = (String)tag.getAttributes().get("face");
	//  388 1001:aload_1         
	//  389 1002:invokevirtual   #314 <Method Map Tag.getAttributes()>
	//  390 1005:ldc2            #423 <String "face">
	//  391 1008:invokeinterface #219 <Method Object Map.get(Object)>
	//  392 1013:checkcast       #70  <Class String>
	//  393 1016:astore          5
				if(s != null)
	//* 394 1018:aload           5
	//* 395 1020:ifnull          1036
					map1.put("font-family", ((Object) (s)));
	//  396 1023:aload           6
	//  397 1025:ldc2            #425 <String "font-family">
	//  398 1028:aload           5
	//  399 1030:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  400 1035:pop             
				s = (String)tag.getAttributes().get("color");
	//  401 1036:aload_1         
	//  402 1037:invokevirtual   #314 <Method Map Tag.getAttributes()>
	//  403 1040:ldc2            #427 <String "color">
	//  404 1043:invokeinterface #219 <Method Object Map.get(Object)>
	//  405 1048:checkcast       #70  <Class String>
	//  406 1051:astore          5
				if(s != null)
	//* 407 1053:aload           5
	//* 408 1055:ifnull          1071
					map1.put("color", ((Object) (s)));
	//  409 1058:aload           6
	//  410 1060:ldc2            #427 <String "color">
	//  411 1063:aload           5
	//  412 1065:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  413 1070:pop             
				tag = ((Tag) ((String)tag.getAttributes().get("size")));
	//  414 1071:aload_1         
	//  415 1072:invokevirtual   #314 <Method Map Tag.getAttributes()>
	//  416 1075:ldc2            #429 <String "size">
	//  417 1078:invokeinterface #219 <Method Object Map.get(Object)>
	//  418 1083:checkcast       #70  <Class String>
	//  419 1086:astore_1        
				if(tag != null)
	//* 420 1087:aload_1         
	//* 421 1088:ifnull          1115
					if(((String) (tag)).equals("1"))
	//* 422 1091:aload_1         
	//* 423 1092:ldc2            #431 <String "1">
	//* 424 1095:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 425 1098:ifeq            1238
						map1.put("font-size", "xx-small");
	//  426 1101:aload           6
	//  427 1103:ldc2            #415 <String "font-size">
	//  428 1106:ldc2            #433 <String "xx-small">
	//  429 1109:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  430 1114:pop             
					else
	//* 431 1115:aload           4
	//* 432 1117:invokeinterface #345 <Method Set Map.entrySet()>
	//* 433 1122:invokeinterface #212 <Method Iterator Set.iterator()>
	//* 434 1127:astore_1        
	//* 435 1128:aload_1         
	//* 436 1129:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//* 437 1134:ifeq            1469
	//* 438 1137:aload_1         
	//* 439 1138:invokeinterface #106 <Method Object Iterator.next()>
	//* 440 1143:checkcast       #347 <Class java.util.Map$Entry>
	//* 441 1146:astore          4
	//* 442 1148:ldc1            #107 <String "inherit">
	//* 443 1150:aload           4
	//* 444 1152:invokeinterface #353 <Method Object java.util.Map$Entry.getValue()>
	//* 445 1157:checkcast       #70  <Class String>
	//* 446 1160:invokevirtual   #134 <Method boolean String.equalsIgnoreCase(String)>
	//* 447 1163:ifne            1128
	//* 448 1166:aload           4
	//* 449 1168:invokeinterface #350 <Method Object java.util.Map$Entry.getKey()>
	//* 450 1173:checkcast       #70  <Class String>
	//* 451 1176:ldc2            #401 <String "text-decoration">
	//* 452 1179:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 453 1182:ifeq            1444
	//* 454 1185:aload           6
	//* 455 1187:aload           4
	//* 456 1189:invokeinterface #350 <Method Object java.util.Map$Entry.getKey()>
	//* 457 1194:invokeinterface #219 <Method Object Map.get(Object)>
	//* 458 1199:checkcast       #70  <Class String>
	//* 459 1202:astore          5
	//* 460 1204:aload           6
	//* 461 1206:aload           4
	//* 462 1208:invokeinterface #350 <Method Object java.util.Map$Entry.getKey()>
	//* 463 1213:aload_0         
	//* 464 1214:aload           5
	//* 465 1216:aload           4
	//* 466 1218:invokeinterface #353 <Method Object java.util.Map$Entry.getValue()>
	//* 467 1223:checkcast       #70  <Class String>
	//* 468 1226:invokespecial   #435 <Method String mergeTextDecorationRules(String, String)>
	//* 469 1229:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//* 470 1234:pop             
	//* 471 1235:goto            1128
					if(((String) (tag)).equals("2"))
	//* 472 1238:aload_1         
	//* 473 1239:ldc2            #437 <String "2">
	//* 474 1242:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 475 1245:ifeq            1265
						map1.put("font-size", "x-small");
	//  476 1248:aload           6
	//  477 1250:ldc2            #415 <String "font-size">
	//  478 1253:ldc2            #439 <String "x-small">
	//  479 1256:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  480 1261:pop             
					else
	//* 481 1262:goto            1115
					if(((String) (tag)).equals("3"))
	//* 482 1265:aload_1         
	//* 483 1266:ldc2            #441 <String "3">
	//* 484 1269:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 485 1272:ifeq            1292
						map1.put("font-size", "small");
	//  486 1275:aload           6
	//  487 1277:ldc2            #415 <String "font-size">
	//  488 1280:ldc2            #419 <String "small">
	//  489 1283:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  490 1288:pop             
					else
	//* 491 1289:goto            1115
					if(((String) (tag)).equals("4"))
	//* 492 1292:aload_1         
	//* 493 1293:ldc2            #443 <String "4">
	//* 494 1296:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 495 1299:ifeq            1319
						map1.put("font-size", "medium");
	//  496 1302:aload           6
	//  497 1304:ldc2            #415 <String "font-size">
	//  498 1307:ldc2            #445 <String "medium">
	//  499 1310:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  500 1315:pop             
					else
	//* 501 1316:goto            1115
					if(((String) (tag)).equals("5"))
	//* 502 1319:aload_1         
	//* 503 1320:ldc2            #447 <String "5">
	//* 504 1323:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 505 1326:ifeq            1346
						map1.put("font-size", "large");
	//  506 1329:aload           6
	//  507 1331:ldc2            #415 <String "font-size">
	//  508 1334:ldc2            #449 <String "large">
	//  509 1337:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  510 1342:pop             
					else
	//* 511 1343:goto            1115
					if(((String) (tag)).equals("6"))
	//* 512 1346:aload_1         
	//* 513 1347:ldc2            #451 <String "6">
	//* 514 1350:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 515 1353:ifeq            1373
						map1.put("font-size", "x-large");
	//  516 1356:aload           6
	//  517 1358:ldc2            #415 <String "font-size">
	//  518 1361:ldc2            #453 <String "x-large">
	//  519 1364:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  520 1369:pop             
					else
	//* 521 1370:goto            1115
					if(((String) (tag)).equals("7"))
	//* 522 1373:aload_1         
	//* 523 1374:ldc2            #455 <String "7">
	//* 524 1377:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 525 1380:ifeq            1115
						map1.put("font-size", "xx-large");
	//  526 1383:aload           6
	//  527 1385:ldc2            #415 <String "font-size">
	//  528 1388:ldc2            #457 <String "xx-large">
	//  529 1391:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  530 1396:pop             
			} else
	//* 531 1397:goto            1115
			if(tag.getName().equals("a"))
	//* 532 1400:aload_1         
	//* 533 1401:invokevirtual   #301 <Method String Tag.getName()>
	//* 534 1404:ldc2            #459 <String "a">
	//* 535 1407:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 536 1410:ifeq            1115
			{
				map1.put("text-decoration", "underline");
	//  537 1413:aload           6
	//  538 1415:ldc2            #401 <String "text-decoration">
	//  539 1418:ldc2            #403 <String "underline">
	//  540 1421:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  541 1426:pop             
				map1.put("color", "blue");
	//  542 1427:aload           6
	//  543 1429:ldc2            #427 <String "color">
	//  544 1432:ldc2            #461 <String "blue">
	//  545 1435:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  546 1440:pop             
			}
		tag = ((Tag) (((Map) (obj)).entrySet().iterator()));
		do
		{
			if(!((Iterator) (tag)).hasNext())
				break;
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (tag)).next();
			if(!"inherit".equalsIgnoreCase((String)entry.getValue()))
				if(((String)entry.getKey()).equals("text-decoration"))
				{
					s = (String)map1.get(entry.getKey());
					map1.put(entry.getKey(), ((Object) (mergeTextDecorationRules(s, (String)entry.getValue()))));
				} else
	//* 547 1441:goto            1115
				{
					map1.put(entry.getKey(), entry.getValue());
	//  548 1444:aload           6
	//  549 1446:aload           4
	//  550 1448:invokeinterface #350 <Method Object java.util.Map$Entry.getKey()>
	//  551 1453:aload           4
	//  552 1455:invokeinterface #353 <Method Object java.util.Map$Entry.getValue()>
	//  553 1460:invokeinterface #223 <Method Object Map.put(Object, Object)>
	//  554 1465:pop             
				}
		} while(true);
	//  555 1466:goto            1128
	//  556 1469:return          
	}

	public void setCssInheritance(CssInheritanceRules cssinheritancerules)
	{
		inherit = cssinheritancerules;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field CssInheritanceRules inherit>
	//    3    5:return          
	}

	public void setCssInheritanceRules(CssInheritanceRules cssinheritancerules)
	{
		inherit = cssinheritancerules;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field CssInheritanceRules inherit>
	//    3    5:return          
	}

	public void setFileRetrieve(FileRetrieve fileretrieve)
	{
		retrieve = fileretrieve;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field FileRetrieve retrieve>
	//    3    5:return          
	}

	public static final String STYLE = "style";
	private final CssFiles cssFiles;
	private CssInheritanceRules inherit;
	private FileRetrieve retrieve;
	private final CssUtils utils;
}
