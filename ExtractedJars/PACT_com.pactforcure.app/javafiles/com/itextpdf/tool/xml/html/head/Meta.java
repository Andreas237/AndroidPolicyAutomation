// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.head;

import com.itextpdf.text.log.*;
import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.html.AbstractTagProcessor;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.nio.charset.Charset;
import java.util.*;

public class Meta extends AbstractTagProcessor
{

	public Meta()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	public List start(WorkerContext workercontext, Tag tag)
	{
		if(tag.getAttributes().get("http-equiv") == null || !"Content-Type".equalsIgnoreCase((String)tag.getAttributes().get("http-equiv"))) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:invokevirtual   #30  <Method Map Tag.getAttributes()>
	//    2    4:ldc1            #32  <String "http-equiv">
	//    3    6:invokeinterface #38  <Method Object Map.get(Object)>
	//    4   11:ifnull          246
	//    5   14:ldc1            #40  <String "Content-Type">
	//    6   16:aload_2         
	//    7   17:invokevirtual   #30  <Method Map Tag.getAttributes()>
	//    8   20:ldc1            #32  <String "http-equiv">
	//    9   22:invokeinterface #38  <Method Object Map.get(Object)>
	//   10   27:checkcast       #42  <Class String>
	//   11   30:invokevirtual   #46  <Method boolean String.equalsIgnoreCase(String)>
	//   12   33:ifeq            246
_L1:
		tag = ((Tag) ((String)tag.getAttributes().get("content")));
	//   13   36:aload_2         
	//   14   37:invokevirtual   #30  <Method Map Tag.getAttributes()>
	//   15   40:ldc1            #48  <String "content">
	//   16   42:invokeinterface #38  <Method Object Map.get(Object)>
	//   17   47:checkcast       #42  <Class String>
	//   18   50:astore_2        
		if(tag == null) goto _L2; else goto _L3
	//   19   51:aload_2         
	//   20   52:ifnull          246
_L3:
		int i;
		int j;
		tag = ((Tag) (((String) (tag)).split(";")));
	//   21   55:aload_2         
	//   22   56:ldc1            #50  <String ";">
	//   23   58:invokevirtual   #54  <Method String[] String.split(String)>
	//   24   61:astore_2        
		j = tag.length;
	//   25   62:aload_2         
	//   26   63:arraylength     
	//   27   64:istore          4
		i = 0;
	//   28   66:iconst_0        
	//   29   67:istore_3        
_L11:
		if(i >= j) goto _L2; else goto _L4
	//   30   68:iload_3         
	//   31   69:iload           4
	//   32   71:icmpge          246
_L4:
		String s = ((String) (tag[i]));
	//   33   74:aload_2         
	//   34   75:iload_3         
	//   35   76:aaload          
	//   36   77:astore          5
		if(!s.contains("charset")) goto _L6; else goto _L5
	//   37   79:aload           5
	//   38   81:ldc1            #56  <String "charset">
	//   39   83:invokevirtual   #60  <Method boolean String.contains(CharSequence)>
	//   40   86:ifeq            255
_L5:
		String as[] = s.split("=");
	//   41   89:aload           5
	//   42   91:ldc1            #62  <String "=">
	//   43   93:invokevirtual   #54  <Method String[] String.split(String)>
	//   44   96:astore          5
		if(as.length <= 1) goto _L6; else goto _L7
	//   45   98:aload           5
	//   46  100:arraylength     
	//   47  101:iconst_1        
	//   48  102:icmple          255
_L7:
		as = ((String []) (as[1]));
	//   49  105:aload           5
	//   50  107:iconst_1        
	//   51  108:aaload          
	//   52  109:astore          5
		if(!Charset.isSupported(((String) (as)))) goto _L9; else goto _L8
	//   53  111:aload           5
	//   54  113:invokestatic    #67  <Method boolean Charset.isSupported(String)>
	//   55  116:ifeq            178
_L8:
		getHtmlPipelineContext(workercontext).charSet(Charset.forName(((String) (as))));
	//   56  119:aload_0         
	//   57  120:aload_1         
	//   58  121:invokevirtual   #71  <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   59  124:aload           5
	//   60  126:invokestatic    #75  <Method Charset Charset.forName(String)>
	//   61  129:invokevirtual   #81  <Method HtmlPipelineContext HtmlPipelineContext.charSet(Charset)>
	//   62  132:pop             
		if(LOGGER.isLogging(Level.DEBUG))
	//*  63  133:getstatic       #16  <Field Logger LOGGER>
	//*  64  136:getstatic       #87  <Field Level Level.DEBUG>
	//*  65  139:invokeinterface #93  <Method boolean Logger.isLogging(Level)>
	//*  66  144:ifeq            255
			LOGGER.debug(String.format(LocaleMessages.getInstance().getMessage("html.tag.meta.cc"), new Object[] {
				as
			}));
	//   67  147:getstatic       #16  <Field Logger LOGGER>
	//   68  150:invokestatic    #99  <Method LocaleMessages LocaleMessages.getInstance()>
	//   69  153:ldc1            #101 <String "html.tag.meta.cc">
	//   70  155:invokevirtual   #105 <Method String LocaleMessages.getMessage(String)>
	//   71  158:iconst_1        
	//   72  159:anewarray       Object[]
	//   73  162:dup             
	//   74  163:iconst_0        
	//   75  164:aload           5
	//   76  166:aastore         
	//   77  167:invokestatic    #111 <Method String String.format(String, Object[])>
	//   78  170:invokeinterface #115 <Method void Logger.debug(String)>
		  goto _L6
	//*  79  175:goto            255
_L9:
		try
		{
			if(LOGGER.isLogging(Level.DEBUG))
	//*  80  178:getstatic       #16  <Field Logger LOGGER>
	//*  81  181:getstatic       #87  <Field Level Level.DEBUG>
	//*  82  184:invokeinterface #93  <Method boolean Logger.isLogging(Level)>
	//*  83  189:ifeq            255
				LOGGER.debug(String.format(LocaleMessages.getInstance().getMessage("html.tag.meta.404"), new Object[] {
					getHtmlPipelineContext(workercontext).charSet()
				}));
	//   84  192:getstatic       #16  <Field Logger LOGGER>
	//   85  195:invokestatic    #99  <Method LocaleMessages LocaleMessages.getInstance()>
	//   86  198:ldc1            #117 <String "html.tag.meta.404">
	//   87  200:invokevirtual   #105 <Method String LocaleMessages.getMessage(String)>
	//   88  203:iconst_1        
	//   89  204:anewarray       Object[]
	//   90  207:dup             
	//   91  208:iconst_0        
	//   92  209:aload_0         
	//   93  210:aload_1         
	//   94  211:invokevirtual   #71  <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   95  214:invokevirtual   #120 <Method Charset HtmlPipelineContext.charSet()>
	//   96  217:aastore         
	//   97  218:invokestatic    #111 <Method String String.format(String, Object[])>
	//   98  221:invokeinterface #115 <Method void Logger.debug(String)>
		}
	//*  99  226:goto            255
		catch(NoCustomContextException nocustomcontextexception)
	//* 100  229:astore          5
		{
			LOGGER.error("", ((Exception) (nocustomcontextexception)));
	//  101  231:getstatic       #16  <Field Logger LOGGER>
	//  102  234:ldc1            #122 <String "">
	//  103  236:aload           5
	//  104  238:invokeinterface #126 <Method void Logger.error(String, Exception)>
		}
		  goto _L6
	//* 105  243:goto            255
_L2:
		return ((List) (new ArrayList(0)));
	//  106  246:new             #128 <Class ArrayList>
	//  107  249:dup             
	//  108  250:iconst_0        
	//  109  251:invokespecial   #131 <Method void ArrayList(int)>
	//  110  254:areturn         
_L6:
		i++;
	//  111  255:iload_3         
	//  112  256:iconst_1        
	//  113  257:iadd            
	//  114  258:istore_3        
		if(true) goto _L11; else goto _L10
	//  115  259:goto            68
_L10:
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/tool/xml/html/head/Meta);

	static 
	{
	//    0    0:ldc1            #2   <Class Meta>
	//    1    2:invokestatic    #14  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #16  <Field Logger LOGGER>
	//*   3    8:return          
	}
}
