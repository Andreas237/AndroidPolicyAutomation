// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.head;

import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.exceptions.CssResolverException;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.html.AbstractTagProcessor;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import java.util.*;

public class Link extends AbstractTagProcessor
{

	public Link()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	public List start(WorkerContext workercontext, Tag tag)
	{
		if("text/css".equalsIgnoreCase((String)tag.getAttributes().get("type")))
	//*   0    0:ldc1            #28  <String "text/css">
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #34  <Method Map Tag.getAttributes()>
	//*   3    6:ldc1            #36  <String "type">
	//*   4    8:invokeinterface #42  <Method Object Map.get(Object)>
	//*   5   13:checkcast       #44  <Class String>
	//*   6   16:invokevirtual   #48  <Method boolean String.equalsIgnoreCase(String)>
	//*   7   19:ifeq            53
		{
			tag = ((Tag) ((String)tag.getAttributes().get("href")));
	//    8   22:aload_2         
	//    9   23:invokevirtual   #34  <Method Map Tag.getAttributes()>
	//   10   26:ldc1            #50  <String "href">
	//   11   28:invokeinterface #42  <Method Object Map.get(Object)>
	//   12   33:checkcast       #44  <Class String>
	//   13   36:astore_2        
			if(tag != null)
	//*  14   37:aload_2         
	//*  15   38:ifnull          53
				try
				{
					getCSSResolver(workercontext).addCssFile(((String) (tag)), false);
	//   16   41:aload_0         
	//   17   42:aload_1         
	//   18   43:invokevirtual   #54  <Method CSSResolver getCSSResolver(WorkerContext)>
	//   19   46:aload_2         
	//   20   47:iconst_0        
	//   21   48:invokeinterface #60  <Method void CSSResolver.addCssFile(String, boolean)>
				}
	//*  22   53:new             #62  <Class ArrayList>
	//*  23   56:dup             
	//*  24   57:iconst_0        
	//*  25   58:invokespecial   #65  <Method void ArrayList(int)>
	//*  26   61:areturn         
				// Misplaced declaration of an exception variable
				catch(WorkerContext workercontext)
	//*  27   62:astore_1        
				{
					LOG.error(String.format(LocaleMessages.getInstance().getMessage("html.tag.link.404"), new Object[] {
						tag
					}), ((Exception) (workercontext)));
	//   28   63:getstatic       #16  <Field Logger LOG>
	//   29   66:invokestatic    #71  <Method LocaleMessages LocaleMessages.getInstance()>
	//   30   69:ldc1            #73  <String "html.tag.link.404">
	//   31   71:invokevirtual   #77  <Method String LocaleMessages.getMessage(String)>
	//   32   74:iconst_1        
	//   33   75:anewarray       Object[]
	//   34   78:dup             
	//   35   79:iconst_0        
	//   36   80:aload_2         
	//   37   81:aastore         
	//   38   82:invokestatic    #83  <Method String String.format(String, Object[])>
	//   39   85:aload_1         
	//   40   86:invokeinterface #89  <Method void Logger.error(String, Exception)>
				}
	//*  41   91:goto            53
				// Misplaced declaration of an exception variable
				catch(WorkerContext workercontext)
	//*  42   94:astore_1        
				{
					LOG.warn(String.format(LocaleMessages.getInstance().getMessage("customcontext.404.continue"), new Object[] {
						((Class) (com/itextpdf/tool/xml/pipeline/css/CssResolverPipeline)).getName()
					}));
	//   43   95:getstatic       #16  <Field Logger LOG>
	//   44   98:invokestatic    #71  <Method LocaleMessages LocaleMessages.getInstance()>
	//   45  101:ldc1            #91  <String "customcontext.404.continue">
	//   46  103:invokevirtual   #77  <Method String LocaleMessages.getMessage(String)>
	//   47  106:iconst_1        
	//   48  107:anewarray       Object[]
	//   49  110:dup             
	//   50  111:iconst_0        
	//   51  112:ldc1            #93  <Class CssResolverPipeline>
	//   52  114:invokevirtual   #99  <Method String Class.getName()>
	//   53  117:aastore         
	//   54  118:invokestatic    #83  <Method String String.format(String, Object[])>
	//   55  121:invokeinterface #103 <Method void Logger.warn(String)>
				}
		}
		return ((List) (new ArrayList(0)));
	//*  56  126:goto            53
	}

	private static final Logger LOG = LoggerFactory.getLogger(com/itextpdf/tool/xml/html/head/Link);

	static 
	{
	//    0    0:ldc1            #2   <Class Link>
	//    1    2:invokestatic    #14  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #16  <Field Logger LOG>
	//*   3    8:return          
	}
}
