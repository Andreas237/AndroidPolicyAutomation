// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.head;

import com.itextpdf.text.log.*;
import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;
import com.itextpdf.tool.xml.html.AbstractTagProcessor;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.nio.charset.Charset;
import java.util.*;

public class XML extends AbstractTagProcessor
{

	public XML()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	public List start(WorkerContext workercontext, Tag tag)
	{
		tag = ((Tag) ((String)tag.getAttributes().get("encoding")));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #30  <Method Map Tag.getAttributes()>
	//    2    4:ldc1            #32  <String "encoding">
	//    3    6:invokeinterface #38  <Method Object Map.get(Object)>
	//    4   11:checkcast       #40  <Class String>
	//    5   14:astore_2        
		if(tag == null) goto _L2; else goto _L1
	//    6   15:aload_2         
	//    7   16:ifnull          80
_L1:
		if(!Charset.isSupported(((String) (tag)))) goto _L4; else goto _L3
	//    8   19:aload_2         
	//    9   20:invokestatic    #46  <Method boolean Charset.isSupported(String)>
	//   10   23:ifeq            89
_L3:
		getHtmlPipelineContext(workercontext).charSet(Charset.forName(((String) (tag))));
	//   11   26:aload_0         
	//   12   27:aload_1         
	//   13   28:invokevirtual   #50  <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   14   31:aload_2         
	//   15   32:invokestatic    #54  <Method Charset Charset.forName(String)>
	//   16   35:invokevirtual   #60  <Method HtmlPipelineContext HtmlPipelineContext.charSet(Charset)>
	//   17   38:pop             
		if(LOGGER.isLogging(Level.DEBUG))
	//*  18   39:getstatic       #16  <Field Logger LOGGER>
	//*  19   42:getstatic       #66  <Field Level Level.DEBUG>
	//*  20   45:invokeinterface #72  <Method boolean Logger.isLogging(Level)>
	//*  21   50:ifeq            80
			LOGGER.debug(String.format(LocaleMessages.getInstance().getMessage("html.tag.meta.cc"), new Object[] {
				tag
			}));
	//   22   53:getstatic       #16  <Field Logger LOGGER>
	//   23   56:invokestatic    #78  <Method LocaleMessages LocaleMessages.getInstance()>
	//   24   59:ldc1            #80  <String "html.tag.meta.cc">
	//   25   61:invokevirtual   #84  <Method String LocaleMessages.getMessage(String)>
	//   26   64:iconst_1        
	//   27   65:anewarray       Object[]
	//   28   68:dup             
	//   29   69:iconst_0        
	//   30   70:aload_2         
	//   31   71:aastore         
	//   32   72:invokestatic    #90  <Method String String.format(String, Object[])>
	//   33   75:invokeinterface #94  <Method void Logger.debug(String)>
_L2:
		return ((List) (new ArrayList(0)));
	//   34   80:new             #96  <Class ArrayList>
	//   35   83:dup             
	//   36   84:iconst_0        
	//   37   85:invokespecial   #99  <Method void ArrayList(int)>
	//   38   88:areturn         
_L4:
		if(!LOGGER.isLogging(Level.DEBUG)) goto _L2; else goto _L5
	//   39   89:getstatic       #16  <Field Logger LOGGER>
	//   40   92:getstatic       #66  <Field Level Level.DEBUG>
	//   41   95:invokeinterface #72  <Method boolean Logger.isLogging(Level)>
	//   42  100:ifeq            80
_L5:
		LOGGER.debug(String.format(LocaleMessages.getInstance().getMessage("html.tag.meta.404"), new Object[] {
			getHtmlPipelineContext(workercontext).charSet()
		}));
	//   43  103:getstatic       #16  <Field Logger LOGGER>
	//   44  106:invokestatic    #78  <Method LocaleMessages LocaleMessages.getInstance()>
	//   45  109:ldc1            #101 <String "html.tag.meta.404">
	//   46  111:invokevirtual   #84  <Method String LocaleMessages.getMessage(String)>
	//   47  114:iconst_1        
	//   48  115:anewarray       Object[]
	//   49  118:dup             
	//   50  119:iconst_0        
	//   51  120:aload_0         
	//   52  121:aload_1         
	//   53  122:invokevirtual   #50  <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   54  125:invokevirtual   #104 <Method Charset HtmlPipelineContext.charSet()>
	//   55  128:aastore         
	//   56  129:invokestatic    #90  <Method String String.format(String, Object[])>
	//   57  132:invokeinterface #94  <Method void Logger.debug(String)>
		  goto _L2
	//*  58  137:goto            80
		workercontext;
	//   59  140:astore_1        
		throw new RuntimeWorkerException(LocaleMessages.getInstance().getMessage("customcontext.404"));
	//   60  141:new             #106 <Class RuntimeWorkerException>
	//   61  144:dup             
	//   62  145:invokestatic    #78  <Method LocaleMessages LocaleMessages.getInstance()>
	//   63  148:ldc1            #108 <String "customcontext.404">
	//   64  150:invokevirtual   #84  <Method String LocaleMessages.getMessage(String)>
	//   65  153:invokespecial   #110 <Method void RuntimeWorkerException(String)>
	//   66  156:athrow          
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/tool/xml/html/head/XML);

	static 
	{
	//    0    0:ldc1            #2   <Class XML>
	//    1    2:invokestatic    #14  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #16  <Field Logger LOGGER>
	//*   3    8:return          
	}
}
