// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.log.Level;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfString;
import com.itextpdf.text.xml.XMLUtil;
import com.itextpdf.tool.xml.NoCustomContextException;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.WorkerContext;
import com.itextpdf.tool.xml.css.CssUtils;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;
import com.itextpdf.tool.xml.net.ImageRetrieve;
import com.itextpdf.tool.xml.net.exc.NoImageException;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			AbstractTagProcessor, CssAppliers

public class Image extends AbstractTagProcessor
{

	public Image()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractTagProcessor()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #28  <Method CssUtils CssUtils.getInstance()>
	//    4    8:putfield        #30  <Field CssUtils utils>
	//    5   11:return          
	}

	public List end(WorkerContext workercontext, Tag tag, List list)
	{
		Map map = tag.getAttributes();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #42  <Method Map Tag.getAttributes()>
	//    2    4:astore          6
		list = ((List) ((String)map.get("src")));
	//    3    6:aload           6
	//    4    8:ldc1            #44  <String "src">
	//    5   10:invokeinterface #50  <Method Object Map.get(Object)>
	//    6   15:checkcast       #52  <Class String>
	//    7   18:astore_3        
		Object obj = null;
	//    8   19:aconst_null     
	//    9   20:astore          4
		ArrayList arraylist = new ArrayList(1);
	//   10   22:new             #54  <Class ArrayList>
	//   11   25:dup             
	//   12   26:iconst_1        
	//   13   27:invokespecial   #57  <Method void ArrayList(int)>
	//   14   30:astore          5
		if(list != null && ((String) (list)).length() > 0)
	//*  15   32:aload_3         
	//*  16   33:ifnull          213
	//*  17   36:aload_3         
	//*  18   37:invokevirtual   #61  <Method int String.length()>
	//*  19   40:ifle            213
		{
			String s = XMLUtil.unescapeXML(((String) (list))).trim();
	//   20   43:aload_3         
	//   21   44:invokestatic    #67  <Method String XMLUtil.unescapeXML(String)>
	//   22   47:invokevirtual   #71  <Method String String.trim()>
	//   23   50:astore          7
			try
			{
				if(logger.isLogging(Level.TRACE))
	//*  24   52:getstatic       #18  <Field Logger logger>
	//*  25   55:getstatic       #77  <Field Level Level.TRACE>
	//*  26   58:invokeinterface #83  <Method boolean Logger.isLogging(Level)>
	//*  27   63:ifeq            94
					logger.trace(String.format(LocaleMessages.getInstance().getMessage("html.tag.img.try"), new Object[] {
						s
					}));
	//   28   66:getstatic       #18  <Field Logger logger>
	//   29   69:invokestatic    #88  <Method LocaleMessages LocaleMessages.getInstance()>
	//   30   72:ldc1            #90  <String "html.tag.img.try">
	//   31   74:invokevirtual   #93  <Method String LocaleMessages.getMessage(String)>
	//   32   77:iconst_1        
	//   33   78:anewarray       Object[]
	//   34   81:dup             
	//   35   82:iconst_0        
	//   36   83:aload           7
	//   37   85:aastore         
	//   38   86:invokestatic    #99  <Method String String.format(String, Object[])>
	//   39   89:invokeinterface #103 <Method void Logger.trace(String)>
				list = ((List) (getHtmlPipelineContext(workercontext)));
	//   40   94:aload_0         
	//   41   95:aload_1         
	//   42   96:invokevirtual   #107 <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   43   99:astore_3        
				list = ((List) ((new ImageRetrieve(((HtmlPipelineContext) (list)).getResourcesRootPath(), ((HtmlPipelineContext) (list)).getImageProvider())).retrieveImage(s)));
	//   44  100:new             #109 <Class ImageRetrieve>
	//   45  103:dup             
	//   46  104:aload_3         
	//   47  105:invokevirtual   #114 <Method String HtmlPipelineContext.getResourcesRootPath()>
	//   48  108:aload_3         
	//   49  109:invokevirtual   #118 <Method com.itextpdf.tool.xml.pipeline.html.ImageProvider HtmlPipelineContext.getImageProvider()>
	//   50  112:invokespecial   #121 <Method void ImageRetrieve(String, com.itextpdf.tool.xml.pipeline.html.ImageProvider)>
	//   51  115:aload           7
	//   52  117:invokevirtual   #125 <Method com.itextpdf.text.Image ImageRetrieve.retrieveImage(String)>
	//   53  120:astore_3        
			}
	//*  54  121:aload_3         
	//*  55  122:ifnull          213
	//*  56  125:aload           6
	//*  57  127:ldc1            #127 <String "alt">
	//*  58  129:invokeinterface #50  <Method Object Map.get(Object)>
	//*  59  134:ifnull          163
	//*  60  137:aload_3         
	//*  61  138:getstatic       #133 <Field PdfName PdfName.ALT>
	//*  62  141:new             #135 <Class PdfString>
	//*  63  144:dup             
	//*  64  145:aload           6
	//*  65  147:ldc1            #127 <String "alt">
	//*  66  149:invokeinterface #50  <Method Object Map.get(Object)>
	//*  67  154:checkcast       #52  <Class String>
	//*  68  157:invokespecial   #137 <Method void PdfString(String)>
	//*  69  160:invokevirtual   #143 <Method void com.itextpdf.text.Image.setAccessibleAttribute(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//*  70  163:aload_0         
	//*  71  164:aload_1         
	//*  72  165:invokevirtual   #107 <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//*  73  168:astore_1        
	//*  74  169:aload           5
	//*  75  171:aload_0         
	//*  76  172:invokevirtual   #147 <Method CssAppliers getCssAppliers()>
	//*  77  175:new             #149 <Class Chunk>
	//*  78  178:dup             
	//*  79  179:aload_0         
	//*  80  180:invokevirtual   #147 <Method CssAppliers getCssAppliers()>
	//*  81  183:aload_3         
	//*  82  184:aload_2         
	//*  83  185:aload_1         
	//*  84  186:invokeinterface #155 <Method com.itextpdf.text.Element CssAppliers.apply(com.itextpdf.text.Element, Tag, HtmlPipelineContext)>
	//*  85  191:checkcast       #139 <Class com.itextpdf.text.Image>
	//*  86  194:fconst_0        
	//*  87  195:fconst_0        
	//*  88  196:iconst_1        
	//*  89  197:invokespecial   #158 <Method void Chunk(com.itextpdf.text.Image, float, float, boolean)>
	//*  90  200:aload_2         
	//*  91  201:aload_1         
	//*  92  202:invokeinterface #155 <Method com.itextpdf.text.Element CssAppliers.apply(com.itextpdf.text.Element, Tag, HtmlPipelineContext)>
	//*  93  207:invokeinterface #164 <Method boolean List.add(Object)>
	//*  94  212:pop             
	//*  95  213:aload           5
	//*  96  215:areturn         
			catch(NoImageException noimageexception)
	//*  97  216:astore          8
			{
				list = ((List) (obj));
	//   98  218:aload           4
	//   99  220:astore_3        
				if(logger.isLogging(Level.ERROR))
	//* 100  221:getstatic       #18  <Field Logger logger>
	//* 101  224:getstatic       #167 <Field Level Level.ERROR>
	//* 102  227:invokeinterface #83  <Method boolean Logger.isLogging(Level)>
	//* 103  232:ifeq            121
				{
					logger.error(String.format(LocaleMessages.getInstance().getMessage("html.tag.img.failedretrieve"), new Object[] {
						s
					}), ((Exception) (noimageexception)));
	//  104  235:getstatic       #18  <Field Logger logger>
	//  105  238:invokestatic    #88  <Method LocaleMessages LocaleMessages.getInstance()>
	//  106  241:ldc1            #169 <String "html.tag.img.failedretrieve">
	//  107  243:invokevirtual   #93  <Method String LocaleMessages.getMessage(String)>
	//  108  246:iconst_1        
	//  109  247:anewarray       Object[]
	//  110  250:dup             
	//  111  251:iconst_0        
	//  112  252:aload           7
	//  113  254:aastore         
	//  114  255:invokestatic    #99  <Method String String.format(String, Object[])>
	//  115  258:aload           8
	//  116  260:invokeinterface #173 <Method void Logger.error(String, Exception)>
					list = ((List) (obj));
	//  117  265:aload           4
	//  118  267:astore_3        
				}
			}
	//* 119  268:goto            121
			// Misplaced declaration of an exception variable
			catch(WorkerContext workercontext)
	//* 120  271:astore_1        
			{
				throw new RuntimeWorkerException(LocaleMessages.getInstance().getMessage("customcontext.404"), ((Throwable) (workercontext)));
	//  121  272:new             #175 <Class RuntimeWorkerException>
	//  122  275:dup             
	//  123  276:invokestatic    #88  <Method LocaleMessages LocaleMessages.getInstance()>
	//  124  279:ldc1            #177 <String "customcontext.404">
	//  125  281:invokevirtual   #93  <Method String LocaleMessages.getMessage(String)>
	//  126  284:aload_1         
	//  127  285:invokespecial   #180 <Method void RuntimeWorkerException(String, Throwable)>
	//  128  288:athrow          
			}
			if(list != null)
				try
				{
					if(map.get("alt") != null)
						((com.itextpdf.text.Image) (list)).setAccessibleAttribute(PdfName.ALT, ((com.itextpdf.text.pdf.PdfObject) (new PdfString((String)map.get("alt")))));
					workercontext = ((WorkerContext) (getHtmlPipelineContext(workercontext)));
					((List) (arraylist)).add(((Object) (getCssAppliers().apply(((com.itextpdf.text.Element) (new Chunk((com.itextpdf.text.Image)getCssAppliers().apply(((com.itextpdf.text.Element) (list)), tag, ((HtmlPipelineContext) (workercontext))), 0.0F, 0.0F, true))), tag, ((HtmlPipelineContext) (workercontext))))));
				}
				// Misplaced declaration of an exception variable
				catch(WorkerContext workercontext)
	//* 129  289:astore_1        
				{
					throw new RuntimeWorkerException(((Throwable) (workercontext)));
	//  130  290:new             #175 <Class RuntimeWorkerException>
	//  131  293:dup             
	//  132  294:aload_1         
	//  133  295:invokespecial   #183 <Method void RuntimeWorkerException(Throwable)>
	//  134  298:athrow          
				}
		}
		return ((List) (arraylist));
	}

	public boolean isStackOwner()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static final Logger logger = LoggerFactory.getLogger(com/itextpdf/tool/xml/html/Image);
	private final CssUtils utils = CssUtils.getInstance();

	static 
	{
	//    0    0:ldc1            #2   <Class Image>
	//    1    2:invokestatic    #16  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #18  <Field Logger logger>
	//*   3    8:return          
	}
}
