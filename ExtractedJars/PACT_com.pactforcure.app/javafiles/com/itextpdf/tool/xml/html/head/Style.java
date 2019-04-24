// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.head;

import com.itextpdf.text.log.*;
import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.exceptions.CssResolverException;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.html.AbstractTagProcessor;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import java.util.ArrayList;
import java.util.List;

public class Style extends AbstractTagProcessor
{

	public Style()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	public List content(WorkerContext workercontext, Tag tag, String s)
	{
		getCSSResolver(workercontext).addCss(s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #30  <Method CSSResolver getCSSResolver(WorkerContext)>
	//    3    5:aload_3         
	//    4    6:iconst_0        
	//    5    7:invokeinterface #36  <Method void CSSResolver.addCss(String, boolean)>
_L2:
		return ((List) (new ArrayList(0)));
	//    6   12:new             #38  <Class ArrayList>
	//    7   15:dup             
	//    8   16:iconst_0        
	//    9   17:invokespecial   #41  <Method void ArrayList(int)>
	//   10   20:areturn         
		workercontext;
	//   11   21:astore_1        
		LOG.error(LocaleMessages.getInstance().getMessage("html.tag.style.notparsed"), ((Exception) (workercontext)));
	//   12   22:getstatic       #16  <Field Logger LOG>
	//   13   25:invokestatic    #47  <Method LocaleMessages LocaleMessages.getInstance()>
	//   14   28:ldc1            #49  <String "html.tag.style.notparsed">
	//   15   30:invokevirtual   #53  <Method String LocaleMessages.getMessage(String)>
	//   16   33:aload_1         
	//   17   34:invokeinterface #59  <Method void Logger.error(String, Exception)>
		if(LOG.isLogging(Level.TRACE))
	//*  18   39:getstatic       #16  <Field Logger LOG>
	//*  19   42:getstatic       #65  <Field Level Level.TRACE>
	//*  20   45:invokeinterface #69  <Method boolean Logger.isLogging(Level)>
	//*  21   50:ifeq            12
			LOG.trace(s);
	//   22   53:getstatic       #16  <Field Logger LOG>
	//   23   56:aload_3         
	//   24   57:invokeinterface #73  <Method void Logger.trace(String)>
		continue; /* Loop/switch isn't completed */
	//   25   62:goto            12
		workercontext;
	//   26   65:astore_1        
		LOG.warn(String.format(LocaleMessages.getInstance().getMessage("customcontext.404.continue"), new Object[] {
			((Class) (com/itextpdf/tool/xml/pipeline/css/CssResolverPipeline)).getName()
		}));
	//   27   66:getstatic       #16  <Field Logger LOG>
	//   28   69:invokestatic    #47  <Method LocaleMessages LocaleMessages.getInstance()>
	//   29   72:ldc1            #75  <String "customcontext.404.continue">
	//   30   74:invokevirtual   #53  <Method String LocaleMessages.getMessage(String)>
	//   31   77:iconst_1        
	//   32   78:anewarray       Object[]
	//   33   81:dup             
	//   34   82:iconst_0        
	//   35   83:ldc1            #79  <Class CssResolverPipeline>
	//   36   85:invokevirtual   #85  <Method String Class.getName()>
	//   37   88:aastore         
	//   38   89:invokestatic    #91  <Method String String.format(String, Object[])>
	//   39   92:invokeinterface #94  <Method void Logger.warn(String)>
		if(true) goto _L2; else goto _L1
	//   40   97:goto            12
_L1:
	}

	private static final Logger LOG = LoggerFactory.getLogger(com/itextpdf/tool/xml/html/head/Style);

	static 
	{
	//    0    0:ldc1            #2   <Class Style>
	//    1    2:invokestatic    #14  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #16  <Field Logger LOG>
	//*   3    8:return          
	}
}
