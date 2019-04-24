// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocListener;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.FontProvider;
import com.itextpdf.text.Image;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.TextElementArray;
import com.itextpdf.text.html.HtmlUtilities;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.text.xml.simpleparser.SimpleXMLDocHandler;
import com.itextpdf.text.xml.simpleparser.SimpleXMLParser;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			StyleSheet, ChainedProperties, ElementFactory, CellWrapper, 
//			ImageProvider, ImageStore, HTMLTagProcessor, ImageProcessor, 
//			LinkProcessor, TableWrapper, HTMLTagProcessors

public class HTMLWorker
	implements SimpleXMLDocHandler, DocListener
{

	public HTMLWorker(DocListener doclistener)
	{
		this(doclistener, ((Map) (null)), ((StyleSheet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #75  <Method void HTMLWorker(DocListener, Map, StyleSheet)>
	//    5    7:return          
	}

	public HTMLWorker(DocListener doclistener, Map map, StyleSheet stylesheet)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
		style = new StyleSheet();
	//    2    4:aload_0         
	//    3    5:new             #79  <Class StyleSheet>
	//    4    8:dup             
	//    5    9:invokespecial   #80  <Method void StyleSheet()>
	//    6   12:putfield        #82  <Field StyleSheet style>
		stack = new Stack();
	//    7   15:aload_0         
	//    8   16:new             #84  <Class Stack>
	//    9   19:dup             
	//   10   20:invokespecial   #85  <Method void Stack()>
	//   11   23:putfield        #87  <Field Stack stack>
		chain = new ChainedProperties();
	//   12   26:aload_0         
	//   13   27:new             #89  <Class ChainedProperties>
	//   14   30:dup             
	//   15   31:invokespecial   #90  <Method void ChainedProperties()>
	//   16   34:putfield        #92  <Field ChainedProperties chain>
		providers = ((Map) (new HashMap()));
	//   17   37:aload_0         
	//   18   38:new             #94  <Class HashMap>
	//   19   41:dup             
	//   20   42:invokespecial   #95  <Method void HashMap()>
	//   21   45:putfield        #97  <Field Map providers>
		factory = new ElementFactory();
	//   22   48:aload_0         
	//   23   49:new             #99  <Class ElementFactory>
	//   24   52:dup             
	//   25   53:invokespecial   #100 <Method void ElementFactory()>
	//   26   56:putfield        #102 <Field ElementFactory factory>
		tableState = new Stack();
	//   27   59:aload_0         
	//   28   60:new             #84  <Class Stack>
	//   29   63:dup             
	//   30   64:invokespecial   #85  <Method void Stack()>
	//   31   67:putfield        #104 <Field Stack tableState>
		pendingTR = false;
	//   32   70:aload_0         
	//   33   71:iconst_0        
	//   34   72:putfield        #106 <Field boolean pendingTR>
		pendingTD = false;
	//   35   75:aload_0         
	//   36   76:iconst_0        
	//   37   77:putfield        #108 <Field boolean pendingTD>
		pendingLI = false;
	//   38   80:aload_0         
	//   39   81:iconst_0        
	//   40   82:putfield        #110 <Field boolean pendingLI>
		insidePRE = false;
	//   41   85:aload_0         
	//   42   86:iconst_0        
	//   43   87:putfield        #112 <Field boolean insidePRE>
		skipText = false;
	//   44   90:aload_0         
	//   45   91:iconst_0        
	//   46   92:putfield        #114 <Field boolean skipText>
		document = doclistener;
	//   47   95:aload_0         
	//   48   96:aload_1         
	//   49   97:putfield        #116 <Field DocListener document>
		setSupportedTags(map);
	//   50  100:aload_0         
	//   51  101:aload_2         
	//   52  102:invokevirtual   #120 <Method void setSupportedTags(Map)>
		setStyleSheet(stylesheet);
	//   53  105:aload_0         
	//   54  106:aload_3         
	//   55  107:invokevirtual   #124 <Method void setStyleSheet(StyleSheet)>
	//   56  110:return          
	}

	public static List parseToList(Reader reader, StyleSheet stylesheet)
		throws IOException
	{
		return parseToList(reader, stylesheet, ((HashMap) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #133 <Method List parseToList(Reader, StyleSheet, HashMap)>
	//    4    6:areturn         
	}

	public static List parseToList(Reader reader, StyleSheet stylesheet, HashMap hashmap)
		throws IOException
	{
		return parseToList(reader, stylesheet, ((Map) (null)), hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokestatic    #138 <Method List parseToList(Reader, StyleSheet, Map, HashMap)>
	//    5    7:areturn         
	}

	public static List parseToList(Reader reader, StyleSheet stylesheet, Map map, HashMap hashmap)
		throws IOException
	{
		stylesheet = ((StyleSheet) (new HTMLWorker(((DocListener) (null)), map, stylesheet)));
	//    0    0:new             #2   <Class HTMLWorker>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokespecial   #75  <Method void HTMLWorker(DocListener, Map, StyleSheet)>
	//    6   10:astore_1        
		stylesheet.document = ((DocListener) (stylesheet));
	//    7   11:aload_1         
	//    8   12:aload_1         
	//    9   13:putfield        #116 <Field DocListener document>
		((HTMLWorker) (stylesheet)).setProviders(((Map) (hashmap)));
	//   10   16:aload_1         
	//   11   17:aload_3         
	//   12   18:invokevirtual   #142 <Method void setProviders(Map)>
		stylesheet.objectList = ((List) (new ArrayList()));
	//   13   21:aload_1         
	//   14   22:new             #144 <Class ArrayList>
	//   15   25:dup             
	//   16   26:invokespecial   #145 <Method void ArrayList()>
	//   17   29:putfield        #147 <Field List objectList>
		((HTMLWorker) (stylesheet)).parse(reader);
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:invokevirtual   #151 <Method void parse(Reader)>
		return ((HTMLWorker) (stylesheet)).objectList;
	//   21   37:aload_1         
	//   22   38:getfield        #147 <Field List objectList>
	//   23   41:areturn         
	}

	public boolean add(Element element)
		throws DocumentException
	{
		objectList.add(((Object) (element)));
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field List objectList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #161 <Method boolean List.add(Object)>
	//    4   10:pop             
		return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
	}

	public void carriageReturn()
		throws DocumentException
	{
		if(currentParagraph == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #164 <Field Paragraph currentParagraph>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(stack.empty())
	//*   4    8:aload_0         
	//*   5    9:getfield        #87  <Field Stack stack>
	//*   6   12:invokevirtual   #168 <Method boolean Stack.empty()>
	//*   7   15:ifeq            38
		{
			document.add(((Element) (currentParagraph)));
	//    8   18:aload_0         
	//    9   19:getfield        #116 <Field DocListener document>
	//   10   22:aload_0         
	//   11   23:getfield        #164 <Field Paragraph currentParagraph>
	//   12   26:invokeinterface #170 <Method boolean DocListener.add(Element)>
	//   13   31:pop             
		} else
	//*  14   32:aload_0         
	//*  15   33:aconst_null     
	//*  16   34:putfield        #164 <Field Paragraph currentParagraph>
	//*  17   37:return          
		{
			Element element = (Element)stack.pop();
	//   18   38:aload_0         
	//   19   39:getfield        #87  <Field Stack stack>
	//   20   42:invokevirtual   #174 <Method Object Stack.pop()>
	//   21   45:checkcast       #176 <Class Element>
	//   22   48:astore_1        
			if(element instanceof TextElementArray)
	//*  23   49:aload_1         
	//*  24   50:instanceof      #178 <Class TextElementArray>
	//*  25   53:ifeq            70
				((TextElementArray)element).add(((Element) (currentParagraph)));
	//   26   56:aload_1         
	//   27   57:checkcast       #178 <Class TextElementArray>
	//   28   60:aload_0         
	//   29   61:getfield        #164 <Field Paragraph currentParagraph>
	//   30   64:invokeinterface #179 <Method boolean TextElementArray.add(Element)>
	//   31   69:pop             
			stack.push(((Object) (element)));
	//   32   70:aload_0         
	//   33   71:getfield        #87  <Field Stack stack>
	//   34   74:aload_1         
	//   35   75:invokevirtual   #183 <Method Object Stack.push(Object)>
	//   36   78:pop             
		}
		currentParagraph = null;
	//*  37   79:goto            32
	}

	public void close()
	{
	//    0    0:return          
	}

	public CellWrapper createCell(String s)
	{
		return new CellWrapper(s, chain);
	//    0    0:new             #188 <Class CellWrapper>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #92  <Field ChainedProperties chain>
	//    5    9:invokespecial   #191 <Method void CellWrapper(String, ChainedProperties)>
	//    6   12:areturn         
	}

	public Chunk createChunk(String s)
	{
		return factory.createChunk(s, chain);
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field ElementFactory factory>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #92  <Field ChainedProperties chain>
	//    5    9:invokevirtual   #196 <Method Chunk ElementFactory.createChunk(String, ChainedProperties)>
	//    6   12:areturn         
	}

	public Image createImage(Map map)
		throws DocumentException, IOException
	{
		String s = (String)map.get("src");
	//    0    0:aload_1         
	//    1    1:ldc1            #200 <String "src">
	//    2    3:invokeinterface #205 <Method Object Map.get(Object)>
	//    3    8:checkcast       #207 <Class String>
	//    4   11:astore_2        
		if(s == null)
	//*   5   12:aload_2         
	//*   6   13:ifnonnull       18
			return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
		else
			return factory.createImage(s, map, chain, document, (ImageProvider)providers.get("img_provider"), ((HashMap) ((ImageStore)providers.get("img_static"))), (String)providers.get("img_baseurl"));
	//    9   18:aload_0         
	//   10   19:getfield        #102 <Field ElementFactory factory>
	//   11   22:aload_2         
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:getfield        #92  <Field ChainedProperties chain>
	//   15   28:aload_0         
	//   16   29:getfield        #116 <Field DocListener document>
	//   17   32:aload_0         
	//   18   33:getfield        #97  <Field Map providers>
	//   19   36:ldc1            #22  <String "img_provider">
	//   20   38:invokeinterface #205 <Method Object Map.get(Object)>
	//   21   43:checkcast       #209 <Class ImageProvider>
	//   22   46:aload_0         
	//   23   47:getfield        #97  <Field Map providers>
	//   24   50:ldc1            #25  <String "img_static">
	//   25   52:invokeinterface #205 <Method Object Map.get(Object)>
	//   26   57:checkcast       #211 <Class ImageStore>
	//   27   60:aload_0         
	//   28   61:getfield        #97  <Field Map providers>
	//   29   64:ldc1            #16  <String "img_baseurl">
	//   30   66:invokeinterface #205 <Method Object Map.get(Object)>
	//   31   71:checkcast       #207 <Class String>
	//   32   74:invokevirtual   #214 <Method Image ElementFactory.createImage(String, Map, ChainedProperties, DocListener, ImageProvider, HashMap, String)>
	//   33   77:areturn         
	}

	public LineSeparator createLineSeparator(Map map)
	{
		return factory.createLineSeparator(map, currentParagraph.getLeading() / 2.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field ElementFactory factory>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #164 <Field Paragraph currentParagraph>
	//    5    9:invokevirtual   #223 <Method float Paragraph.getLeading()>
	//    6   12:fconst_2        
	//    7   13:fdiv            
	//    8   14:invokevirtual   #226 <Method LineSeparator ElementFactory.createLineSeparator(Map, float)>
	//    9   17:areturn         
	}

	public com.itextpdf.text.List createList(String s)
	{
		return factory.createList(s, chain);
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field ElementFactory factory>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #92  <Field ChainedProperties chain>
	//    5    9:invokevirtual   #232 <Method com.itextpdf.text.List ElementFactory.createList(String, ChainedProperties)>
	//    6   12:areturn         
	}

	public ListItem createListItem()
	{
		return factory.createListItem(chain);
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field ElementFactory factory>
	//    2    4:aload_0         
	//    3    5:getfield        #92  <Field ChainedProperties chain>
	//    4    8:invokevirtual   #237 <Method ListItem ElementFactory.createListItem(ChainedProperties)>
	//    5   11:areturn         
	}

	public Paragraph createParagraph()
	{
		return factory.createParagraph(chain);
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field ElementFactory factory>
	//    2    4:aload_0         
	//    3    5:getfield        #92  <Field ChainedProperties chain>
	//    4    8:invokevirtual   #242 <Method Paragraph ElementFactory.createParagraph(ChainedProperties)>
	//    5   11:areturn         
	}

	public void endDocument()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		do
		{
			try
			{
				if(i >= stack.size())
					break;
	//    2    2:iload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #87  <Field Stack stack>
	//    5    7:invokevirtual   #249 <Method int Stack.size()>
	//    6   10:icmpge          41
				document.add((Element)stack.elementAt(i));
	//    7   13:aload_0         
	//    8   14:getfield        #116 <Field DocListener document>
	//    9   17:aload_0         
	//   10   18:getfield        #87  <Field Stack stack>
	//   11   21:iload_1         
	//   12   22:invokevirtual   #253 <Method Object Stack.elementAt(int)>
	//   13   25:checkcast       #176 <Class Element>
	//   14   28:invokeinterface #170 <Method boolean DocListener.add(Element)>
	//   15   33:pop             
			}
	//*  16   34:iload_1         
	//*  17   35:iconst_1        
	//*  18   36:iadd            
	//*  19   37:istore_1        
	//*  20   38:goto            2
	//*  21   41:aload_0         
	//*  22   42:getfield        #164 <Field Paragraph currentParagraph>
	//*  23   45:ifnull          62
	//*  24   48:aload_0         
	//*  25   49:getfield        #116 <Field DocListener document>
	//*  26   52:aload_0         
	//*  27   53:getfield        #164 <Field Paragraph currentParagraph>
	//*  28   56:invokeinterface #170 <Method boolean DocListener.add(Element)>
	//*  29   61:pop             
	//*  30   62:aload_0         
	//*  31   63:aconst_null     
	//*  32   64:putfield        #164 <Field Paragraph currentParagraph>
	//*  33   67:return          
			catch(Exception exception)
	//*  34   68:astore_2        
			{
				throw new ExceptionConverter(exception);
	//   35   69:new             #255 <Class ExceptionConverter>
	//   36   72:dup             
	//   37   73:aload_2         
	//   38   74:invokespecial   #258 <Method void ExceptionConverter(Exception)>
	//   39   77:athrow          
			}
			i++;
		} while(true);
		if(currentParagraph != null)
			document.add(((Element) (currentParagraph)));
		currentParagraph = null;
		return;
	}

	public void endElement(String s)
	{
		HTMLTagProcessor htmltagprocessor = (HTMLTagProcessor)tags.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field Map tags>
	//    2    4:aload_1         
	//    3    5:invokeinterface #205 <Method Object Map.get(Object)>
	//    4   10:checkcast       #264 <Class HTMLTagProcessor>
	//    5   13:astore_2        
		if(htmltagprocessor == null)
	//*   6   14:aload_2         
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		try
		{
			htmltagprocessor.endElement(this, s);
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokeinterface #267 <Method void HTMLTagProcessor.endElement(HTMLWorker, String)>
			return;
	//   13   27:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  14   28:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   15   29:new             #255 <Class ExceptionConverter>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:invokespecial   #258 <Method void ExceptionConverter(Exception)>
	//   19   37:athrow          
		}
	}

	public void flushContent()
	{
		pushToStack(((Element) (currentParagraph)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #164 <Field Paragraph currentParagraph>
	//    3    5:invokevirtual   #272 <Method void pushToStack(Element)>
		currentParagraph = new Paragraph();
	//    4    8:aload_0         
	//    5    9:new             #219 <Class Paragraph>
	//    6   12:dup             
	//    7   13:invokespecial   #273 <Method void Paragraph()>
	//    8   16:putfield        #164 <Field Paragraph currentParagraph>
	//    9   19:return          
	}

	public Map getInterfaceProps()
	{
		return providers;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Map providers>
	//    2    4:areturn         
	}

	public boolean isInsidePRE()
	{
		return insidePRE;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field boolean insidePRE>
	//    2    4:ireturn         
	}

	public boolean isPendingLI()
	{
		return pendingLI;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field boolean pendingLI>
	//    2    4:ireturn         
	}

	public boolean isPendingTD()
	{
		return pendingTD;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field boolean pendingTD>
	//    2    4:ireturn         
	}

	public boolean isPendingTR()
	{
		return pendingTR;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field boolean pendingTR>
	//    2    4:ireturn         
	}

	public boolean isSkipText()
	{
		return skipText;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field boolean skipText>
	//    2    4:ireturn         
	}

	public void newLine()
	{
		if(currentParagraph == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #164 <Field Paragraph currentParagraph>
	//*   2    4:ifnonnull       18
			currentParagraph = new Paragraph();
	//    3    7:aload_0         
	//    4    8:new             #219 <Class Paragraph>
	//    5   11:dup             
	//    6   12:invokespecial   #273 <Method void Paragraph()>
	//    7   15:putfield        #164 <Field Paragraph currentParagraph>
		currentParagraph.add(((Element) (createChunk("\n"))));
	//    8   18:aload_0         
	//    9   19:getfield        #164 <Field Paragraph currentParagraph>
	//   10   22:aload_0         
	//   11   23:ldc2            #285 <String "\n">
	//   12   26:invokevirtual   #287 <Method Chunk createChunk(String)>
	//   13   29:invokevirtual   #288 <Method boolean Paragraph.add(Element)>
	//   14   32:pop             
	//   15   33:return          
	}

	public boolean newPage()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void open()
	{
	//    0    0:return          
	}

	public void parse(Reader reader)
		throws IOException
	{
		LOGGER.info("Please note, there is a more extended version of the HTMLWorker available in the iText XMLWorker");
	//    0    0:getstatic       #69  <Field Logger LOGGER>
	//    1    3:ldc2            #292 <String "Please note, there is a more extended version of the HTMLWorker available in the iText XMLWorker">
	//    2    6:invokeinterface #297 <Method void Logger.info(String)>
		SimpleXMLParser.parse(((SimpleXMLDocHandler) (this)), ((com.itextpdf.text.xml.simpleparser.SimpleXMLDocHandlerComment) (null)), reader, true);
	//    3   11:aload_0         
	//    4   12:aconst_null     
	//    5   13:aload_1         
	//    6   14:iconst_1        
	//    7   15:invokestatic    #302 <Method void SimpleXMLParser.parse(SimpleXMLDocHandler, com.itextpdf.text.xml.simpleparser.SimpleXMLDocHandlerComment, Reader, boolean)>
	//    8   18:return          
	}

	public void popTableState()
	{
		boolean aflag[] = (boolean[])tableState.pop();
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Stack tableState>
	//    2    4:invokevirtual   #174 <Method Object Stack.pop()>
	//    3    7:checkcast       #305 <Class boolean[]>
	//    4   10:astore_1        
		pendingTR = aflag[0];
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:iconst_0        
	//    8   14:baload          
	//    9   15:putfield        #106 <Field boolean pendingTR>
		pendingTD = aflag[1];
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:iconst_1        
	//   13   21:baload          
	//   14   22:putfield        #108 <Field boolean pendingTD>
	//   15   25:return          
	}

	public void processImage(Image image, Map map)
		throws DocumentException
	{
		ImageProcessor imageprocessor = (ImageProcessor)providers.get("img_interface");
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Map providers>
	//    2    4:ldc1            #19  <String "img_interface">
	//    3    6:invokeinterface #205 <Method Object Map.get(Object)>
	//    4   11:checkcast       #309 <Class ImageProcessor>
	//    5   14:astore_3        
		if(imageprocessor == null || !imageprocessor.process(image, map, chain, document))
	//*   6   15:aload_3         
	//*   7   16:ifnull          38
	//*   8   19:aload_3         
	//*   9   20:aload_1         
	//*  10   21:aload_2         
	//*  11   22:aload_0         
	//*  12   23:getfield        #92  <Field ChainedProperties chain>
	//*  13   26:aload_0         
	//*  14   27:getfield        #116 <Field DocListener document>
	//*  15   30:invokeinterface #313 <Method boolean ImageProcessor.process(Image, Map, ChainedProperties, DocListener)>
	//*  16   35:ifne            112
		{
			map = ((Map) ((String)map.get("align")));
	//   17   38:aload_2         
	//   18   39:ldc2            #315 <String "align">
	//   19   42:invokeinterface #205 <Method Object Map.get(Object)>
	//   20   47:checkcast       #207 <Class String>
	//   21   50:astore_2        
			if(map != null)
	//*  22   51:aload_2         
	//*  23   52:ifnull          59
				carriageReturn();
	//   24   55:aload_0         
	//   25   56:invokevirtual   #317 <Method void carriageReturn()>
			if(currentParagraph == null)
	//*  26   59:aload_0         
	//*  27   60:getfield        #164 <Field Paragraph currentParagraph>
	//*  28   63:ifnonnull       74
				currentParagraph = createParagraph();
	//   29   66:aload_0         
	//   30   67:aload_0         
	//   31   68:invokevirtual   #319 <Method Paragraph createParagraph()>
	//   32   71:putfield        #164 <Field Paragraph currentParagraph>
			currentParagraph.add(((Element) (new Chunk(image, 0.0F, 0.0F, true))));
	//   33   74:aload_0         
	//   34   75:getfield        #164 <Field Paragraph currentParagraph>
	//   35   78:new             #321 <Class Chunk>
	//   36   81:dup             
	//   37   82:aload_1         
	//   38   83:fconst_0        
	//   39   84:fconst_0        
	//   40   85:iconst_1        
	//   41   86:invokespecial   #324 <Method void Chunk(Image, float, float, boolean)>
	//   42   89:invokevirtual   #288 <Method boolean Paragraph.add(Element)>
	//   43   92:pop             
			currentParagraph.setAlignment(HtmlUtilities.alignmentValue(((String) (map))));
	//   44   93:aload_0         
	//   45   94:getfield        #164 <Field Paragraph currentParagraph>
	//   46   97:aload_2         
	//   47   98:invokestatic    #330 <Method int HtmlUtilities.alignmentValue(String)>
	//   48  101:invokevirtual   #334 <Method void Paragraph.setAlignment(int)>
			if(map != null)
	//*  49  104:aload_2         
	//*  50  105:ifnull          112
				carriageReturn();
	//   51  108:aload_0         
	//   52  109:invokevirtual   #317 <Method void carriageReturn()>
		}
	//   53  112:return          
	}

	public void processLink()
	{
		if(currentParagraph == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #164 <Field Paragraph currentParagraph>
	//*   2    4:ifnonnull       18
			currentParagraph = new Paragraph();
	//    3    7:aload_0         
	//    4    8:new             #219 <Class Paragraph>
	//    5   11:dup             
	//    6   12:invokespecial   #273 <Method void Paragraph()>
	//    7   15:putfield        #164 <Field Paragraph currentParagraph>
		LinkProcessor linkprocessor = (LinkProcessor)providers.get("alink_interface");
	//    8   18:aload_0         
	//    9   19:getfield        #97  <Field Map providers>
	//   10   22:ldc1            #28  <String "alink_interface">
	//   11   24:invokeinterface #205 <Method Object Map.get(Object)>
	//   12   29:checkcast       #338 <Class LinkProcessor>
	//   13   32:astore_1        
		if(linkprocessor == null || !linkprocessor.process(currentParagraph, chain))
	//*  14   33:aload_1         
	//*  15   34:ifnull          54
	//*  16   37:aload_1         
	//*  17   38:aload_0         
	//*  18   39:getfield        #164 <Field Paragraph currentParagraph>
	//*  19   42:aload_0         
	//*  20   43:getfield        #92  <Field ChainedProperties chain>
	//*  21   46:invokeinterface #341 <Method boolean LinkProcessor.process(Paragraph, ChainedProperties)>
	//*  22   51:ifne            108
		{
			String s = chain.getProperty("href");
	//   23   54:aload_0         
	//   24   55:getfield        #92  <Field ChainedProperties chain>
	//   25   58:ldc2            #343 <String "href">
	//   26   61:invokevirtual   #347 <Method String ChainedProperties.getProperty(String)>
	//   27   64:astore_1        
			if(s != null)
	//*  28   65:aload_1         
	//*  29   66:ifnull          108
			{
				for(Iterator iterator = currentParagraph.getChunks().iterator(); iterator.hasNext(); ((Chunk)iterator.next()).setAnchor(s));
	//   30   69:aload_0         
	//   31   70:getfield        #164 <Field Paragraph currentParagraph>
	//   32   73:invokevirtual   #351 <Method List Paragraph.getChunks()>
	//   33   76:invokeinterface #355 <Method Iterator List.iterator()>
	//   34   81:astore_2        
	//   35   82:aload_2         
	//   36   83:invokeinterface #360 <Method boolean Iterator.hasNext()>
	//   37   88:ifeq            108
	//   38   91:aload_2         
	//   39   92:invokeinterface #363 <Method Object Iterator.next()>
	//   40   97:checkcast       #321 <Class Chunk>
	//   41  100:aload_1         
	//   42  101:invokevirtual   #366 <Method Chunk Chunk.setAnchor(String)>
	//   43  104:pop             
			}
		}
	//*  44  105:goto            82
		if(stack.isEmpty())
	//*  45  108:aload_0         
	//*  46  109:getfield        #87  <Field Stack stack>
	//*  47  112:invokevirtual   #369 <Method boolean Stack.isEmpty()>
	//*  48  115:ifeq            141
		{
			currentParagraph = new Paragraph(new Phrase(((Phrase) (currentParagraph))));
	//   49  118:aload_0         
	//   50  119:new             #219 <Class Paragraph>
	//   51  122:dup             
	//   52  123:new             #371 <Class Phrase>
	//   53  126:dup             
	//   54  127:aload_0         
	//   55  128:getfield        #164 <Field Paragraph currentParagraph>
	//   56  131:invokespecial   #374 <Method void Phrase(Phrase)>
	//   57  134:invokespecial   #375 <Method void Paragraph(Phrase)>
	//   58  137:putfield        #164 <Field Paragraph currentParagraph>
			return;
	//   59  140:return          
		} else
		{
			Paragraph paragraph = (Paragraph)stack.pop();
	//   60  141:aload_0         
	//   61  142:getfield        #87  <Field Stack stack>
	//   62  145:invokevirtual   #174 <Method Object Stack.pop()>
	//   63  148:checkcast       #219 <Class Paragraph>
	//   64  151:astore_1        
			paragraph.add(((Element) (new Phrase(((Phrase) (currentParagraph))))));
	//   65  152:aload_1         
	//   66  153:new             #371 <Class Phrase>
	//   67  156:dup             
	//   68  157:aload_0         
	//   69  158:getfield        #164 <Field Paragraph currentParagraph>
	//   70  161:invokespecial   #374 <Method void Phrase(Phrase)>
	//   71  164:invokevirtual   #288 <Method boolean Paragraph.add(Element)>
	//   72  167:pop             
			currentParagraph = paragraph;
	//   73  168:aload_0         
	//   74  169:aload_1         
	//   75  170:putfield        #164 <Field Paragraph currentParagraph>
			return;
	//   76  173:return          
		}
	}

	public void processList()
		throws DocumentException
	{
		if(stack.empty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field Stack stack>
	//*   2    4:invokevirtual   #168 <Method boolean Stack.empty()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		Element element = (Element)stack.pop();
	//    5   11:aload_0         
	//    6   12:getfield        #87  <Field Stack stack>
	//    7   15:invokevirtual   #174 <Method Object Stack.pop()>
	//    8   18:checkcast       #176 <Class Element>
	//    9   21:astore_1        
		if(!(element instanceof com.itextpdf.text.List))
	//*  10   22:aload_1         
	//*  11   23:instanceof      #378 <Class com.itextpdf.text.List>
	//*  12   26:ifne            39
		{
			stack.push(((Object) (element)));
	//   13   29:aload_0         
	//   14   30:getfield        #87  <Field Stack stack>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #183 <Method Object Stack.push(Object)>
	//   17   37:pop             
			return;
	//   18   38:return          
		}
		if(stack.empty())
	//*  19   39:aload_0         
	//*  20   40:getfield        #87  <Field Stack stack>
	//*  21   43:invokevirtual   #168 <Method boolean Stack.empty()>
	//*  22   46:ifeq            61
		{
			document.add(element);
	//   23   49:aload_0         
	//   24   50:getfield        #116 <Field DocListener document>
	//   25   53:aload_1         
	//   26   54:invokeinterface #170 <Method boolean DocListener.add(Element)>
	//   27   59:pop             
			return;
	//   28   60:return          
		} else
		{
			((TextElementArray)stack.peek()).add(element);
	//   29   61:aload_0         
	//   30   62:getfield        #87  <Field Stack stack>
	//   31   65:invokevirtual   #381 <Method Object Stack.peek()>
	//   32   68:checkcast       #178 <Class TextElementArray>
	//   33   71:aload_1         
	//   34   72:invokeinterface #179 <Method boolean TextElementArray.add(Element)>
	//   35   77:pop             
			return;
	//   36   78:return          
		}
	}

	public void processListItem()
		throws DocumentException
	{
		if(stack.empty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field Stack stack>
	//*   2    4:invokevirtual   #168 <Method boolean Stack.empty()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		Object obj = ((Object) ((Element)stack.pop()));
	//    5   11:aload_0         
	//    6   12:getfield        #87  <Field Stack stack>
	//    7   15:invokevirtual   #174 <Method Object Stack.pop()>
	//    8   18:checkcast       #176 <Class Element>
	//    9   21:astore_1        
		if(!(obj instanceof ListItem))
	//*  10   22:aload_1         
	//*  11   23:instanceof      #384 <Class ListItem>
	//*  12   26:ifne            39
		{
			stack.push(obj);
	//   13   29:aload_0         
	//   14   30:getfield        #87  <Field Stack stack>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #183 <Method Object Stack.push(Object)>
	//   17   37:pop             
			return;
	//   18   38:return          
		}
		if(stack.empty())
	//*  19   39:aload_0         
	//*  20   40:getfield        #87  <Field Stack stack>
	//*  21   43:invokevirtual   #168 <Method boolean Stack.empty()>
	//*  22   46:ifeq            61
		{
			document.add(((Element) (obj)));
	//   23   49:aload_0         
	//   24   50:getfield        #116 <Field DocListener document>
	//   25   53:aload_1         
	//   26   54:invokeinterface #170 <Method boolean DocListener.add(Element)>
	//   27   59:pop             
			return;
	//   28   60:return          
		}
		obj = ((Object) ((ListItem)obj));
	//   29   61:aload_1         
	//   30   62:checkcast       #384 <Class ListItem>
	//   31   65:astore_1        
		Element element = (Element)stack.pop();
	//   32   66:aload_0         
	//   33   67:getfield        #87  <Field Stack stack>
	//   34   70:invokevirtual   #174 <Method Object Stack.pop()>
	//   35   73:checkcast       #176 <Class Element>
	//   36   76:astore_2        
		if(!(element instanceof com.itextpdf.text.List))
	//*  37   77:aload_2         
	//*  38   78:instanceof      #378 <Class com.itextpdf.text.List>
	//*  39   81:ifne            94
		{
			stack.push(((Object) (element)));
	//   40   84:aload_0         
	//   41   85:getfield        #87  <Field Stack stack>
	//   42   88:aload_2         
	//   43   89:invokevirtual   #183 <Method Object Stack.push(Object)>
	//   44   92:pop             
			return;
	//   45   93:return          
		} else
		{
			((com.itextpdf.text.List)element).add(((Element) (obj)));
	//   46   94:aload_2         
	//   47   95:checkcast       #378 <Class com.itextpdf.text.List>
	//   48   98:aload_1         
	//   49   99:invokevirtual   #385 <Method boolean com.itextpdf.text.List.add(Element)>
	//   50  102:pop             
			((ListItem) (obj)).adjustListSymbolFont();
	//   51  103:aload_1         
	//   52  104:invokevirtual   #388 <Method void ListItem.adjustListSymbolFont()>
			stack.push(((Object) (element)));
	//   53  107:aload_0         
	//   54  108:getfield        #87  <Field Stack stack>
	//   55  111:aload_2         
	//   56  112:invokevirtual   #183 <Method Object Stack.push(Object)>
	//   57  115:pop             
			return;
	//   58  116:return          
		}
	}

	public void processRow()
	{
		int i;
		ArrayList arraylist1 = new ArrayList();
	//    0    0:new             #144 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #145 <Method void ArrayList()>
	//    3    7:astore          9
		ArrayList arraylist = new ArrayList();
	//    4    9:new             #144 <Class ArrayList>
	//    5   12:dup             
	//    6   13:invokespecial   #145 <Method void ArrayList()>
	//    7   16:astore          8
		boolean flag1 = false;
	//    8   18:iconst_0        
	//    9   19:istore          6
		float f = 0.0F;
	//   10   21:fconst_0        
	//   11   22:fstore_1        
		i = 0;
	//   12   23:iconst_0        
	//   13   24:istore_3        
		do
		{
			Object obj = ((Object) ((Element)stack.pop()));
	//   14   25:aload_0         
	//   15   26:getfield        #87  <Field Stack stack>
	//   16   29:invokevirtual   #174 <Method Object Stack.pop()>
	//   17   32:checkcast       #176 <Class Element>
	//   18   35:astore          10
			boolean flag = flag1;
	//   19   37:iload           6
	//   20   39:istore          5
			float f1 = f;
	//   21   41:fload_1         
	//   22   42:fstore_2        
			int j = i;
	//   23   43:iload_3         
	//   24   44:istore          4
			if(obj instanceof CellWrapper)
	//*  25   46:aload           10
	//*  26   48:instanceof      #188 <Class CellWrapper>
	//*  27   51:ifeq            117
			{
				CellWrapper cellwrapper = (CellWrapper)obj;
	//   28   54:aload           10
	//   29   56:checkcast       #188 <Class CellWrapper>
	//   30   59:astore          11
				f1 = cellwrapper.getWidth();
	//   31   61:aload           11
	//   32   63:invokevirtual   #392 <Method float CellWrapper.getWidth()>
	//   33   66:fstore_2        
				arraylist.add(((Object) (new Float(f1))));
	//   34   67:aload           8
	//   35   69:new             #394 <Class Float>
	//   36   72:dup             
	//   37   73:fload_2         
	//   38   74:invokespecial   #397 <Method void Float(float)>
	//   39   77:invokevirtual   #398 <Method boolean ArrayList.add(Object)>
	//   40   80:pop             
				flag = flag1 | cellwrapper.isPercentage();
	//   41   81:iload           6
	//   42   83:aload           11
	//   43   85:invokevirtual   #401 <Method boolean CellWrapper.isPercentage()>
	//   44   88:ior             
	//   45   89:istore          5
				boolean flag2;
				float af[];
				if(f1 == 0.0F)
	//*  46   91:fload_2         
	//*  47   92:fconst_0        
	//*  48   93:fcmpl           
	//*  49   94:ifne            269
					i++;
	//   50   97:iload_3         
	//   51   98:iconst_1        
	//   52   99:iadd            
	//   53  100:istore_3        
				else
	//*  54  101:aload           9
	//*  55  103:aload           11
	//*  56  105:invokevirtual   #405 <Method com.itextpdf.text.pdf.PdfPCell CellWrapper.getCell()>
	//*  57  108:invokevirtual   #398 <Method boolean ArrayList.add(Object)>
	//*  58  111:pop             
	//*  59  112:iload_3         
	//*  60  113:istore          4
	//*  61  115:fload_1         
	//*  62  116:fstore_2        
	//*  63  117:iload           5
	//*  64  119:istore          6
	//*  65  121:fload_2         
	//*  66  122:fstore_1        
	//*  67  123:iload           4
	//*  68  125:istore_3        
	//*  69  126:aload           10
	//*  70  128:instanceof      #407 <Class TableWrapper>
	//*  71  131:ifeq            25
	//*  72  134:aload           10
	//*  73  136:checkcast       #407 <Class TableWrapper>
	//*  74  139:astore          10
	//*  75  141:aload           10
	//*  76  143:aload           9
	//*  77  145:invokevirtual   #411 <Method void TableWrapper.addRow(List)>
	//*  78  148:aload           8
	//*  79  150:invokevirtual   #412 <Method int ArrayList.size()>
	//*  80  153:ifle            258
	//*  81  156:aload           8
	//*  82  158:invokestatic    #417 <Method void Collections.reverse(List)>
	//*  83  161:aload           8
	//*  84  163:invokevirtual   #412 <Method int ArrayList.size()>
	//*  85  166:newarray        float[]
	//*  86  168:astore          9
	//*  87  170:iconst_0        
	//*  88  171:istore          7
	//*  89  173:iconst_0        
	//*  90  174:istore_3        
	//*  91  175:iload           7
	//*  92  177:istore          6
	//*  93  179:iload_3         
	//*  94  180:aload           9
	//*  95  182:arraylength     
	//*  96  183:icmpge          246
	//*  97  186:aload           9
	//*  98  188:iload_3         
	//*  99  189:aload           8
	//* 100  191:iload_3         
	//* 101  192:invokevirtual   #419 <Method Object ArrayList.get(int)>
	//* 102  195:checkcast       #394 <Class Float>
	//* 103  198:invokevirtual   #422 <Method float Float.floatValue()>
	//* 104  201:fastore         
	//* 105  202:aload           9
	//* 106  204:iload_3         
	//* 107  205:faload          
	//* 108  206:fconst_0        
	//* 109  207:fcmpl           
	//* 110  208:ifne            234
	//* 111  211:iload           5
	//* 112  213:ifeq            234
	//* 113  216:iload           4
	//* 114  218:ifle            234
	//* 115  221:aload           9
	//* 116  223:iload_3         
	//* 117  224:ldc2            #423 <Float 100F>
	//* 118  227:fload_2         
	//* 119  228:fsub            
	//* 120  229:iload           4
	//* 121  231:i2f             
	//* 122  232:fdiv            
	//* 123  233:fastore         
	//* 124  234:aload           9
	//* 125  236:iload_3         
	//* 126  237:faload          
	//* 127  238:fconst_0        
	//* 128  239:fcmpl           
	//* 129  240:ifne            276
	//* 130  243:iconst_1        
	//* 131  244:istore          6
	//* 132  246:iload           6
	//* 133  248:ifne            258
	//* 134  251:aload           10
	//* 135  253:aload           9
	//* 136  255:invokevirtual   #427 <Method void TableWrapper.setColWidths(float[])>
	//* 137  258:aload_0         
	//* 138  259:getfield        #87  <Field Stack stack>
	//* 139  262:aload           10
	//* 140  264:invokevirtual   #183 <Method Object Stack.push(Object)>
	//* 141  267:pop             
	//* 142  268:return          
					f += f1;
	//  143  269:fload_1         
	//  144  270:fload_2         
	//  145  271:fadd            
	//  146  272:fstore_1        
				arraylist1.add(((Object) (cellwrapper.getCell())));
				j = i;
				f1 = f;
			}
			flag1 = flag;
			f = f1;
			i = j;
		} while(!(obj instanceof TableWrapper));
		obj = ((Object) ((TableWrapper)obj));
		((TableWrapper) (obj)).addRow(((List) (arraylist1)));
		if(arraylist.size() <= 0) goto _L2; else goto _L1
_L1:
		Collections.reverse(((List) (arraylist)));
		af = new float[arraylist.size()];
		flag2 = false;
		i = 0;
_L8:
		flag1 = flag2;
		if(i >= af.length) goto _L4; else goto _L3
_L3:
		af[i] = ((Float)arraylist.get(i)).floatValue();
		if(af[i] == 0.0F && flag && j > 0)
			af[i] = (100F - f1) / (float)j;
		if(af[i] != 0.0F) goto _L6; else goto _L5
_L5:
		flag1 = true;
_L4:
		if(!flag1)
			((TableWrapper) (obj)).setColWidths(af);
_L2:
		stack.push(obj);
		return;
	//* 147  273:goto            101
_L6:
		i++;
	//  148  276:iload_3         
	//  149  277:iconst_1        
	//  150  278:iadd            
	//  151  279:istore_3        
		if(true) goto _L8; else goto _L7
	//  152  280:goto            175
_L7:
	}

	public void processTable()
		throws DocumentException
	{
		PdfPTable pdfptable = ((TableWrapper)stack.pop()).createTable();
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Stack stack>
	//    2    4:invokevirtual   #174 <Method Object Stack.pop()>
	//    3    7:checkcast       #407 <Class TableWrapper>
	//    4   10:invokevirtual   #432 <Method PdfPTable TableWrapper.createTable()>
	//    5   13:astore_1        
		pdfptable.setSplitRows(true);
	//    6   14:aload_1         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #438 <Method void PdfPTable.setSplitRows(boolean)>
		if(stack.empty())
	//*   9   19:aload_0         
	//*  10   20:getfield        #87  <Field Stack stack>
	//*  11   23:invokevirtual   #168 <Method boolean Stack.empty()>
	//*  12   26:ifeq            41
		{
			document.add(((Element) (pdfptable)));
	//   13   29:aload_0         
	//   14   30:getfield        #116 <Field DocListener document>
	//   15   33:aload_1         
	//   16   34:invokeinterface #170 <Method boolean DocListener.add(Element)>
	//   17   39:pop             
			return;
	//   18   40:return          
		} else
		{
			((TextElementArray)stack.peek()).add(((Element) (pdfptable)));
	//   19   41:aload_0         
	//   20   42:getfield        #87  <Field Stack stack>
	//   21   45:invokevirtual   #381 <Method Object Stack.peek()>
	//   22   48:checkcast       #178 <Class TextElementArray>
	//   23   51:aload_1         
	//   24   52:invokeinterface #179 <Method boolean TextElementArray.add(Element)>
	//   25   57:pop             
			return;
	//   26   58:return          
		}
	}

	public void pushTableState()
	{
		tableState.push(((Object) (new boolean[] {
			pendingTR, pendingTD
		})));
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Stack tableState>
	//    2    4:iconst_2        
	//    3    5:newarray        boolean[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:getfield        #106 <Field boolean pendingTR>
	//    8   13:bastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:aload_0         
	//   12   17:getfield        #108 <Field boolean pendingTD>
	//   13   20:bastore         
	//   14   21:invokevirtual   #183 <Method Object Stack.push(Object)>
	//   15   24:pop             
	//   16   25:return          
	}

	public void pushToStack(Element element)
	{
		if(element != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			stack.push(((Object) (element)));
	//    2    4:aload_0         
	//    3    5:getfield        #87  <Field Stack stack>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #183 <Method Object Stack.push(Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void resetPageCount()
	{
	//    0    0:return          
	}

	public void setInsidePRE(boolean flag)
	{
		insidePRE = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #112 <Field boolean insidePRE>
	//    3    5:return          
	}

	public void setInterfaceProps(HashMap hashmap)
	{
		setProviders(((Map) (hashmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #142 <Method void setProviders(Map)>
	//    3    5:return          
	}

	public boolean setMarginMirroring(boolean flag)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean setMarginMirroringTopBottom(boolean flag)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean setMargins(float f, float f1, float f2, float f3)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void setPageCount(int i)
	{
	//    0    0:return          
	}

	public boolean setPageSize(Rectangle rectangle)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void setPendingLI(boolean flag)
	{
		pendingLI = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #110 <Field boolean pendingLI>
	//    3    5:return          
	}

	public void setPendingTD(boolean flag)
	{
		pendingTD = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #108 <Field boolean pendingTD>
	//    3    5:return          
	}

	public void setPendingTR(boolean flag)
	{
		pendingTR = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #106 <Field boolean pendingTR>
	//    3    5:return          
	}

	public void setProviders(Map map)
	{
		if(map != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
	//*   2    4:return          
		{
			providers = map;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #97  <Field Map providers>
			FontProvider fontprovider = null;
	//    6   10:aconst_null     
	//    7   11:astore_2        
			if(map != null)
	//*   8   12:aload_1         
	//*   9   13:ifnull          28
				fontprovider = (FontProvider)map.get("font_factory");
	//   10   16:aload_1         
	//   11   17:ldc1            #13  <String "font_factory">
	//   12   19:invokeinterface #205 <Method Object Map.get(Object)>
	//   13   24:checkcast       #457 <Class FontProvider>
	//   14   27:astore_2        
			if(fontprovider != null)
	//*  15   28:aload_2         
	//*  16   29:ifnull          4
			{
				factory.setFontProvider(fontprovider);
	//   17   32:aload_0         
	//   18   33:getfield        #102 <Field ElementFactory factory>
	//   19   36:aload_2         
	//   20   37:invokevirtual   #461 <Method void ElementFactory.setFontProvider(FontProvider)>
				return;
	//   21   40:return          
			}
		}
	}

	public void setSkipText(boolean flag)
	{
		skipText = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #114 <Field boolean skipText>
	//    3    5:return          
	}

	public void setStyleSheet(StyleSheet stylesheet)
	{
		StyleSheet stylesheet1 = stylesheet;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(stylesheet == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       14
			stylesheet1 = new StyleSheet();
	//    4    6:new             #79  <Class StyleSheet>
	//    5    9:dup             
	//    6   10:invokespecial   #80  <Method void StyleSheet()>
	//    7   13:astore_2        
		style = stylesheet1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #82  <Field StyleSheet style>
	//   11   19:return          
	}

	public void setSupportedTags(Map map)
	{
		Object obj = ((Object) (map));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(map == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       14
			obj = ((Object) (new HTMLTagProcessors()));
	//    4    6:new             #465 <Class HTMLTagProcessors>
	//    5    9:dup             
	//    6   10:invokespecial   #466 <Method void HTMLTagProcessors()>
	//    7   13:astore_2        
		tags = ((Map) (obj));
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #262 <Field Map tags>
	//   11   19:return          
	}

	public void startDocument()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #94  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #95  <Method void HashMap()>
	//    3    7:astore_1        
		style.applyStyle("body", ((Map) (hashmap)));
	//    4    8:aload_0         
	//    5    9:getfield        #82  <Field StyleSheet style>
	//    6   12:ldc2            #470 <String "body">
	//    7   15:aload_1         
	//    8   16:invokevirtual   #474 <Method void StyleSheet.applyStyle(String, Map)>
		chain.addToChain("body", ((Map) (hashmap)));
	//    9   19:aload_0         
	//   10   20:getfield        #92  <Field ChainedProperties chain>
	//   11   23:ldc2            #470 <String "body">
	//   12   26:aload_1         
	//   13   27:invokevirtual   #477 <Method void ChainedProperties.addToChain(String, Map)>
	//   14   30:return          
	}

	public void startElement(String s, Map map)
	{
		HTMLTagProcessor htmltagprocessor = (HTMLTagProcessor)tags.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field Map tags>
	//    2    4:aload_1         
	//    3    5:invokeinterface #205 <Method Object Map.get(Object)>
	//    4   10:checkcast       #264 <Class HTMLTagProcessor>
	//    5   13:astore_3        
		if(htmltagprocessor == null)
	//*   6   14:aload_3         
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		style.applyStyle(s, map);
	//    9   19:aload_0         
	//   10   20:getfield        #82  <Field StyleSheet style>
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #474 <Method void StyleSheet.applyStyle(String, Map)>
		StyleSheet.resolveStyleAttribute(map, chain);
	//   14   28:aload_2         
	//   15   29:aload_0         
	//   16   30:getfield        #92  <Field ChainedProperties chain>
	//   17   33:invokestatic    #482 <Method void StyleSheet.resolveStyleAttribute(Map, ChainedProperties)>
		try
		{
			htmltagprocessor.startElement(this, s, map);
	//   18   36:aload_3         
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:aload_2         
	//   22   40:invokeinterface #485 <Method void HTMLTagProcessor.startElement(HTMLWorker, String, Map)>
			return;
	//   23   45:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  24   46:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   25   47:new             #255 <Class ExceptionConverter>
	//   26   50:dup             
	//   27   51:aload_1         
	//   28   52:invokespecial   #258 <Method void ExceptionConverter(Exception)>
	//   29   55:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  30   56:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   31   57:new             #255 <Class ExceptionConverter>
	//   32   60:dup             
	//   33   61:aload_1         
	//   34   62:invokespecial   #258 <Method void ExceptionConverter(Exception)>
	//   35   65:athrow          
		}
	}

	public void text(String s)
	{
		if(!skipText) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field boolean skipText>
	//    2    4:ifeq            8
_L1:
		return;
	//    3    7:return          
_L2:
		String s1;
		if(currentParagraph == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #164 <Field Paragraph currentParagraph>
	//*   6   12:ifnonnull       23
			currentParagraph = createParagraph();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #319 <Method Paragraph createParagraph()>
	//   10   20:putfield        #164 <Field Paragraph currentParagraph>
		s1 = s;
	//   11   23:aload_1         
	//   12   24:astore_2        
		if(insidePRE)
			break; /* Loop/switch isn't completed */
	//   13   25:aload_0         
	//   14   26:getfield        #112 <Field boolean insidePRE>
	//   15   29:ifne            56
		if(s.trim().length() == 0 && s.indexOf(' ') < 0)
			continue; /* Loop/switch isn't completed */
	//   16   32:aload_1         
	//   17   33:invokevirtual   #491 <Method String String.trim()>
	//   18   36:invokevirtual   #494 <Method int String.length()>
	//   19   39:ifne            51
	//   20   42:aload_1         
	//   21   43:bipush          32
	//   22   45:invokevirtual   #498 <Method int String.indexOf(int)>
	//   23   48:iflt            7
		s1 = HtmlUtilities.eliminateWhiteSpace(s);
	//   24   51:aload_1         
	//   25   52:invokestatic    #501 <Method String HtmlUtilities.eliminateWhiteSpace(String)>
	//   26   55:astore_2        
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		s = ((String) (createChunk(s1)));
	//   27   56:aload_0         
	//   28   57:aload_2         
	//   29   58:invokevirtual   #287 <Method Chunk createChunk(String)>
	//   30   61:astore_1        
		currentParagraph.add(((Element) (s)));
	//   31   62:aload_0         
	//   32   63:getfield        #164 <Field Paragraph currentParagraph>
	//   33   66:aload_1         
	//   34   67:invokevirtual   #288 <Method boolean Paragraph.add(Element)>
	//   35   70:pop             
		return;
	//   36   71:return          
	}

	public void updateChain(String s)
	{
		chain.removeChain(s);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field ChainedProperties chain>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #505 <Method void ChainedProperties.removeChain(String)>
	//    4    8:return          
	}

	public void updateChain(String s, Map map)
	{
		chain.addToChain(s, map);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field ChainedProperties chain>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #477 <Method void ChainedProperties.addToChain(String, Map)>
	//    5    9:return          
	}

	public static final String FONT_PROVIDER = "font_factory";
	public static final String IMG_BASEURL = "img_baseurl";
	public static final String IMG_PROCESSOR = "img_interface";
	public static final String IMG_PROVIDER = "img_provider";
	public static final String IMG_STORE = "img_static";
	public static final String LINK_PROVIDER = "alink_interface";
	private static Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/text/html/simpleparser/HTMLWorker);
	private final ChainedProperties chain;
	protected Paragraph currentParagraph;
	protected DocListener document;
	private final ElementFactory factory;
	private boolean insidePRE;
	protected List objectList;
	private boolean pendingLI;
	private boolean pendingTD;
	private boolean pendingTR;
	private Map providers;
	protected boolean skipText;
	protected Stack stack;
	private StyleSheet style;
	private final Stack tableState;
	protected Map tags;

	static 
	{
	//    0    0:ldc1            #2   <Class HTMLWorker>
	//    1    2:invokestatic    #67  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #69  <Field Logger LOGGER>
	//*   3    8:return          
	}
}
