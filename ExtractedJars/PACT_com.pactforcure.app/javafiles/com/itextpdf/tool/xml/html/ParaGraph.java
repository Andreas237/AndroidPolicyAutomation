// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;
import com.itextpdf.tool.xml.NoCustomContextException;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.WorkerContext;
import com.itextpdf.tool.xml.css.CssUtils;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;
import com.itextpdf.tool.xml.html.pdfelement.TabbedChunk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			AbstractTagProcessor, CssAppliers, HTMLUtils

public class ParaGraph extends AbstractTagProcessor
{

	public ParaGraph()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	private void addTabIntervalContent(WorkerContext workercontext, Tag tag, List list, Paragraph paragraph, String s)
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          6
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   2    3:aload_3         
	//*   3    4:invokeinterface #19  <Method Iterator List.iterator()>
	//*   4    9:astore_3        
	//*   5   10:aload_3         
	//*   6   11:invokeinterface #25  <Method boolean Iterator.hasNext()>
	//*   7   16:ifeq            187
		{
			Element element = (Element)((Iterator) (list)).next();
	//    8   19:aload_3         
	//    9   20:invokeinterface #29  <Method Object Iterator.next()>
	//   10   25:checkcast       #31  <Class Element>
	//   11   28:astore          7
			if(element instanceof TabbedChunk)
	//*  12   30:aload           7
	//*  13   32:instanceof      #33  <Class TabbedChunk>
	//*  14   35:ifeq            112
			{
				f += (float)((TabbedChunk)element).getTabCount() * CssUtils.getInstance().parsePxInCmMmPcToPt(s);
	//   15   38:fload           6
	//   16   40:aload           7
	//   17   42:checkcast       #33  <Class TabbedChunk>
	//   18   45:invokevirtual   #37  <Method int TabbedChunk.getTabCount()>
	//   19   48:i2f             
	//   20   49:invokestatic    #43  <Method CssUtils CssUtils.getInstance()>
	//   21   52:aload           5
	//   22   54:invokevirtual   #47  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//   23   57:fmul            
	//   24   58:fadd            
	//   25   59:fstore          6
				paragraph.add(((Element) (new Chunk(((Chunk) (new TabbedChunk(new VerticalPositionMark(), f, false)))))));
	//   26   61:aload           4
	//   27   63:new             #49  <Class Chunk>
	//   28   66:dup             
	//   29   67:new             #33  <Class TabbedChunk>
	//   30   70:dup             
	//   31   71:new             #51  <Class VerticalPositionMark>
	//   32   74:dup             
	//   33   75:invokespecial   #52  <Method void VerticalPositionMark()>
	//   34   78:fload           6
	//   35   80:iconst_0        
	//   36   81:invokespecial   #55  <Method void TabbedChunk(VerticalPositionMark, float, boolean)>
	//   37   84:invokespecial   #58  <Method void Chunk(Chunk)>
	//   38   87:invokevirtual   #64  <Method boolean Paragraph.add(Element)>
	//   39   90:pop             
				paragraph.add(((Element) (new Chunk(((Chunk) ((TabbedChunk)element))))));
	//   40   91:aload           4
	//   41   93:new             #49  <Class Chunk>
	//   42   96:dup             
	//   43   97:aload           7
	//   44   99:checkcast       #33  <Class TabbedChunk>
	//   45  102:invokespecial   #58  <Method void Chunk(Chunk)>
	//   46  105:invokevirtual   #64  <Method boolean Paragraph.add(Element)>
	//   47  108:pop             
			} else
	//*  48  109:goto            10
			{
				if(element instanceof LineSeparator)
	//*  49  112:aload           7
	//*  50  114:instanceof      #66  <Class LineSeparator>
	//*  51  117:ifeq            158
					try
					{
						com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext htmlpipelinecontext = getHtmlPipelineContext(workercontext);
	//   52  120:aload_0         
	//   53  121:aload_1         
	//   54  122:invokevirtual   #70  <Method com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   55  125:astore          8
						paragraph.add(((Element) ((Chunk)getCssAppliers().apply(((Element) (new Chunk(Chunk.NEWLINE))), tag, htmlpipelinecontext))));
	//   56  127:aload           4
	//   57  129:aload_0         
	//   58  130:invokevirtual   #74  <Method CssAppliers getCssAppliers()>
	//   59  133:new             #49  <Class Chunk>
	//   60  136:dup             
	//   61  137:getstatic       #78  <Field Chunk Chunk.NEWLINE>
	//   62  140:invokespecial   #58  <Method void Chunk(Chunk)>
	//   63  143:aload_2         
	//   64  144:aload           8
	//   65  146:invokeinterface #84  <Method Element CssAppliers.apply(Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//   66  151:checkcast       #49  <Class Chunk>
	//   67  154:invokevirtual   #64  <Method boolean Paragraph.add(Element)>
	//   68  157:pop             
					}
	//*  69  158:aload           4
	//*  70  160:aload           7
	//*  71  162:invokevirtual   #64  <Method boolean Paragraph.add(Element)>
	//*  72  165:pop             
	//*  73  166:goto            10
					// Misplaced declaration of an exception variable
					catch(WorkerContext workercontext)
	//*  74  169:astore_1        
					{
						throw new RuntimeWorkerException(LocaleMessages.getInstance().getMessage("customcontext.404"), ((Throwable) (workercontext)));
	//   75  170:new             #86  <Class RuntimeWorkerException>
	//   76  173:dup             
	//   77  174:invokestatic    #91  <Method LocaleMessages LocaleMessages.getInstance()>
	//   78  177:ldc1            #93  <String "customcontext.404">
	//   79  179:invokevirtual   #97  <Method String LocaleMessages.getMessage(String)>
	//   80  182:aload_1         
	//   81  183:invokespecial   #100 <Method void RuntimeWorkerException(String, Throwable)>
	//   82  186:athrow          
					}
				paragraph.add(element);
			}
		}

	//   83  187:return          
	}

	private void addTabStopsContent(List list, Paragraph paragraph, String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #106 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void ArrayList()>
	//    3    7:astore          8
		s = ((String) (s.split(" ")));
	//    4    9:aload_3         
	//    5   10:ldc1            #109 <String " ">
	//    6   12:invokevirtual   #115 <Method String[] String.split(String)>
	//    7   15:astore_3        
		float f = 0.0F;
	//    8   16:fconst_0        
	//    9   17:fstore          4
		int k = 0;
	//   10   19:iconst_0        
	//   11   20:istore          6
		for(int i = 1; i < s.length; i += 2)
	//*  12   22:iconst_1        
	//*  13   23:istore          5
	//*  14   25:iload           5
	//*  15   27:aload_3         
	//*  16   28:arraylength     
	//*  17   29:icmpge          91
		{
			f += CssUtils.getInstance().parsePxInCmMmPcToPt(((String) (s[i])));
	//   18   32:fload           4
	//   19   34:invokestatic    #43  <Method CssUtils CssUtils.getInstance()>
	//   20   37:aload_3         
	//   21   38:iload           5
	//   22   40:aaload          
	//   23   41:invokevirtual   #47  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//   24   44:fadd            
	//   25   45:fstore          4
			((List) (arraylist)).add(((Object) (new TabbedChunk(new VerticalPositionMark(), f, true, ((String) (s[k]))))));
	//   26   47:aload           8
	//   27   49:new             #33  <Class TabbedChunk>
	//   28   52:dup             
	//   29   53:new             #51  <Class VerticalPositionMark>
	//   30   56:dup             
	//   31   57:invokespecial   #52  <Method void VerticalPositionMark()>
	//   32   60:fload           4
	//   33   62:iconst_1        
	//   34   63:aload_3         
	//   35   64:iload           6
	//   36   66:aaload          
	//   37   67:invokespecial   #118 <Method void TabbedChunk(VerticalPositionMark, float, boolean, String)>
	//   38   70:invokeinterface #121 <Method boolean List.add(Object)>
	//   39   75:pop             
			k += 2;
	//   40   76:iload           6
	//   41   78:iconst_2        
	//   42   79:iadd            
	//   43   80:istore          6
		}

	//   44   82:iload           5
	//   45   84:iconst_2        
	//   46   85:iadd            
	//   47   86:istore          5
	//*  48   88:goto            25
		int i1 = ((List) (arraylist)).size();
	//   49   91:aload           8
	//   50   93:invokeinterface #124 <Method int List.size()>
	//   51   98:istore          7
		int j = 0;
	//   52  100:iconst_0        
	//   53  101:istore          5
		list = ((List) (list.iterator()));
	//   54  103:aload_1         
	//   55  104:invokeinterface #19  <Method Iterator List.iterator()>
	//   56  109:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   57  110:aload_1         
	//   58  111:invokeinterface #25  <Method boolean Iterator.hasNext()>
	//   59  116:ifeq            222
			s = ((String) ((Element)((Iterator) (list)).next()));
	//   60  119:aload_1         
	//   61  120:invokeinterface #29  <Method Object Iterator.next()>
	//   62  125:checkcast       #31  <Class Element>
	//   63  128:astore_3        
			if(s instanceof TabbedChunk)
	//*  64  129:aload_3         
	//*  65  130:instanceof      #33  <Class TabbedChunk>
	//*  66  133:ifeq            213
			{
				int l = j;
	//   67  136:iload           5
	//   68  138:istore          6
				if(j == i1)
	//*  69  140:iload           5
	//*  70  142:iload           7
	//*  71  144:icmpne          150
					l = 0;
	//   72  147:iconst_0        
	//   73  148:istore          6
				j = l;
	//   74  150:iload           6
	//   75  152:istore          5
				if(((TabbedChunk)s).getTabCount() != 0)
	//*  76  154:aload_3         
	//*  77  155:checkcast       #33  <Class TabbedChunk>
	//*  78  158:invokevirtual   #37  <Method int TabbedChunk.getTabCount()>
	//*  79  161:ifeq            110
				{
					paragraph.add(((Element) (new Chunk((Chunk)((List) (arraylist)).get(l)))));
	//   80  164:aload_2         
	//   81  165:new             #49  <Class Chunk>
	//   82  168:dup             
	//   83  169:aload           8
	//   84  171:iload           6
	//   85  173:invokeinterface #128 <Method Object List.get(int)>
	//   86  178:checkcast       #49  <Class Chunk>
	//   87  181:invokespecial   #58  <Method void Chunk(Chunk)>
	//   88  184:invokevirtual   #64  <Method boolean Paragraph.add(Element)>
	//   89  187:pop             
					paragraph.add(((Element) (new Chunk(((Chunk) ((TabbedChunk)s))))));
	//   90  188:aload_2         
	//   91  189:new             #49  <Class Chunk>
	//   92  192:dup             
	//   93  193:aload_3         
	//   94  194:checkcast       #33  <Class TabbedChunk>
	//   95  197:invokespecial   #58  <Method void Chunk(Chunk)>
	//   96  200:invokevirtual   #64  <Method boolean Paragraph.add(Element)>
	//   97  203:pop             
					j = l + 1;
	//   98  204:iload           6
	//   99  206:iconst_1        
	//  100  207:iadd            
	//  101  208:istore          5
				}
			} else
	//* 102  210:goto            110
			{
				paragraph.add(((Element) (s)));
	//  103  213:aload_2         
	//  104  214:aload_3         
	//  105  215:invokevirtual   #64  <Method boolean Paragraph.add(Element)>
	//  106  218:pop             
			}
		} while(true);
	//  107  219:goto            110
	//  108  222:return          
	}

	private Tag getLastChild(Tag tag)
	{
		if(tag.getChildren().size() != 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #137 <Method List Tag.getChildren()>
	//*   2    4:invokeinterface #124 <Method int List.size()>
	//*   3    9:ifeq            36
			return (Tag)tag.getChildren().get(tag.getChildren().size() - 1);
	//    4   12:aload_1         
	//    5   13:invokevirtual   #137 <Method List Tag.getChildren()>
	//    6   16:aload_1         
	//    7   17:invokevirtual   #137 <Method List Tag.getChildren()>
	//    8   20:invokeinterface #124 <Method int List.size()>
	//    9   25:iconst_1        
	//   10   26:isub            
	//   11   27:invokeinterface #128 <Method Object List.get(int)>
	//   12   32:checkcast       #133 <Class Tag>
	//   13   35:areturn         
		else
			return null;
	//   14   36:aconst_null     
	//   15   37:areturn         
	}

	public List content(WorkerContext workercontext, Tag tag, String s)
	{
		Object obj = ((Object) (HTMLUtils.sanitize(s, false)));
	//    0    0:aload_3         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #145 <Method List HTMLUtils.sanitize(String, boolean)>
	//    3    5:astore          4
		s = ((String) (new ArrayList(1)));
	//    4    7:new             #106 <Class ArrayList>
	//    5   10:dup             
	//    6   11:iconst_1        
	//    7   12:invokespecial   #148 <Method void ArrayList(int)>
	//    8   15:astore_3        
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*   9   16:aload           4
	//*  10   18:invokeinterface #19  <Method Iterator List.iterator()>
	//*  11   23:astore          4
	//*  12   25:aload           4
	//*  13   27:invokeinterface #25  <Method boolean Iterator.hasNext()>
	//*  14   32:ifeq            282
		{
			Object obj1 = ((Object) ((Chunk)((Iterator) (obj)).next()));
	//   15   35:aload           4
	//   16   37:invokeinterface #29  <Method Object Iterator.next()>
	//   17   42:checkcast       #49  <Class Chunk>
	//   18   45:astore          6
			com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext htmlpipelinecontext;
			try
			{
				htmlpipelinecontext = getHtmlPipelineContext(workercontext);
	//   19   47:aload_0         
	//   20   48:aload_1         
	//   21   49:invokevirtual   #70  <Method com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   22   52:astore          5
			}
	//*  23   54:aload_2         
	//*  24   55:invokevirtual   #152 <Method Map Tag.getCSS()>
	//*  25   58:ldc1            #154 <String "tab-interval">
	//*  26   60:invokeinterface #159 <Method Object Map.get(Object)>
	//*  27   65:ifnull          168
	//*  28   68:new             #33  <Class TabbedChunk>
	//*  29   71:dup             
	//*  30   72:aload           6
	//*  31   74:invokevirtual   #163 <Method String Chunk.getContent()>
	//*  32   77:invokespecial   #166 <Method void TabbedChunk(String)>
	//*  33   80:astore          6
	//*  34   82:aload_0         
	//*  35   83:aload_2         
	//*  36   84:invokespecial   #168 <Method Tag getLastChild(Tag)>
	//*  37   87:ifnull          134
	//*  38   90:aload_0         
	//*  39   91:aload_2         
	//*  40   92:invokespecial   #168 <Method Tag getLastChild(Tag)>
	//*  41   95:invokevirtual   #152 <Method Map Tag.getCSS()>
	//*  42   98:ldc1            #170 <String "xfa-tab-count">
	//*  43  100:invokeinterface #159 <Method Object Map.get(Object)>
	//*  44  105:ifnull          134
	//*  45  108:aload           6
	//*  46  110:aload_0         
	//*  47  111:aload_2         
	//*  48  112:invokespecial   #168 <Method Tag getLastChild(Tag)>
	//*  49  115:invokevirtual   #152 <Method Map Tag.getCSS()>
	//*  50  118:ldc1            #170 <String "xfa-tab-count">
	//*  51  120:invokeinterface #159 <Method Object Map.get(Object)>
	//*  52  125:checkcast       #111 <Class String>
	//*  53  128:invokestatic    #176 <Method int Integer.parseInt(String)>
	//*  54  131:invokevirtual   #179 <Method void TabbedChunk.setTabCount(int)>
	//*  55  134:aload_3         
	//*  56  135:aload_0         
	//*  57  136:invokevirtual   #74  <Method CssAppliers getCssAppliers()>
	//*  58  139:aload           6
	//*  59  141:aload_2         
	//*  60  142:aload           5
	//*  61  144:invokeinterface #84  <Method Element CssAppliers.apply(Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//*  62  149:invokeinterface #121 <Method boolean List.add(Object)>
	//*  63  154:pop             
	//*  64  155:goto            25
			// Misplaced declaration of an exception variable
			catch(WorkerContext workercontext)
	//*  65  158:astore_1        
			{
				throw new RuntimeWorkerException(((Throwable) (workercontext)));
	//   66  159:new             #86  <Class RuntimeWorkerException>
	//   67  162:dup             
	//   68  163:aload_1         
	//   69  164:invokespecial   #182 <Method void RuntimeWorkerException(Throwable)>
	//   70  167:athrow          
			}
			if(tag.getCSS().get("tab-interval") != null)
			{
				obj1 = ((Object) (new TabbedChunk(((Chunk) (obj1)).getContent())));
				if(getLastChild(tag) != null && getLastChild(tag).getCSS().get("xfa-tab-count") != null)
					((TabbedChunk) (obj1)).setTabCount(Integer.parseInt((String)getLastChild(tag).getCSS().get("xfa-tab-count")));
				((List) (s)).add(((Object) (getCssAppliers().apply(((Element) (obj1)), tag, htmlpipelinecontext))));
			} else
			if(getLastChild(tag) != null && getLastChild(tag).getCSS().get("xfa-tab-count") != null)
	//*  71  168:aload_0         
	//*  72  169:aload_2         
	//*  73  170:invokespecial   #168 <Method Tag getLastChild(Tag)>
	//*  74  173:ifnull          258
	//*  75  176:aload_0         
	//*  76  177:aload_2         
	//*  77  178:invokespecial   #168 <Method Tag getLastChild(Tag)>
	//*  78  181:invokevirtual   #152 <Method Map Tag.getCSS()>
	//*  79  184:ldc1            #170 <String "xfa-tab-count">
	//*  80  186:invokeinterface #159 <Method Object Map.get(Object)>
	//*  81  191:ifnull          258
			{
				obj1 = ((Object) (new TabbedChunk(((Chunk) (obj1)).getContent())));
	//   82  194:new             #33  <Class TabbedChunk>
	//   83  197:dup             
	//   84  198:aload           6
	//   85  200:invokevirtual   #163 <Method String Chunk.getContent()>
	//   86  203:invokespecial   #166 <Method void TabbedChunk(String)>
	//   87  206:astore          6
				((TabbedChunk) (obj1)).setTabCount(Integer.parseInt((String)getLastChild(tag).getCSS().get("xfa-tab-count")));
	//   88  208:aload           6
	//   89  210:aload_0         
	//   90  211:aload_2         
	//   91  212:invokespecial   #168 <Method Tag getLastChild(Tag)>
	//   92  215:invokevirtual   #152 <Method Map Tag.getCSS()>
	//   93  218:ldc1            #170 <String "xfa-tab-count">
	//   94  220:invokeinterface #159 <Method Object Map.get(Object)>
	//   95  225:checkcast       #111 <Class String>
	//   96  228:invokestatic    #176 <Method int Integer.parseInt(String)>
	//   97  231:invokevirtual   #179 <Method void TabbedChunk.setTabCount(int)>
				((List) (s)).add(((Object) (getCssAppliers().apply(((Element) (obj1)), tag, htmlpipelinecontext))));
	//   98  234:aload_3         
	//   99  235:aload_0         
	//  100  236:invokevirtual   #74  <Method CssAppliers getCssAppliers()>
	//  101  239:aload           6
	//  102  241:aload_2         
	//  103  242:aload           5
	//  104  244:invokeinterface #84  <Method Element CssAppliers.apply(Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//  105  249:invokeinterface #121 <Method boolean List.add(Object)>
	//  106  254:pop             
			} else
	//* 107  255:goto            25
			{
				((List) (s)).add(((Object) (getCssAppliers().apply(((Element) (obj1)), tag, htmlpipelinecontext))));
	//  108  258:aload_3         
	//  109  259:aload_0         
	//  110  260:invokevirtual   #74  <Method CssAppliers getCssAppliers()>
	//  111  263:aload           6
	//  112  265:aload_2         
	//  113  266:aload           5
	//  114  268:invokeinterface #84  <Method Element CssAppliers.apply(Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//  115  273:invokeinterface #121 <Method boolean List.add(Object)>
	//  116  278:pop             
			}
		}

	//* 117  279:goto            25
		return ((List) (s));
	//  118  282:aload_3         
	//  119  283:areturn         
	}

	public List end(WorkerContext workercontext, Tag tag, List list)
	{
		ArrayList arraylist = new ArrayList(1);
	//    0    0:new             #106 <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #148 <Method void ArrayList(int)>
	//    4    8:astore          4
		if(list.size() > 0)
	//*   5   10:aload_3         
	//*   6   11:invokeinterface #124 <Method int List.size()>
	//*   7   16:ifle            182
		{
			ArrayList arraylist1 = new ArrayList();
	//    8   19:new             #106 <Class ArrayList>
	//    9   22:dup             
	//   10   23:invokespecial   #107 <Method void ArrayList()>
	//   11   26:astore          5
			ArrayList arraylist2 = new ArrayList();
	//   12   28:new             #106 <Class ArrayList>
	//   13   31:dup             
	//   14   32:invokespecial   #107 <Method void ArrayList()>
	//   15   35:astore          6
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*  16   37:aload_3         
	//*  17   38:invokeinterface #19  <Method Iterator List.iterator()>
	//*  18   43:astore_3        
	//*  19   44:aload_3         
	//*  20   45:invokeinterface #25  <Method boolean Iterator.hasNext()>
	//*  21   50:ifeq            155
			{
				Element element = (Element)((Iterator) (list)).next();
	//   22   53:aload_3         
	//   23   54:invokeinterface #29  <Method Object Iterator.next()>
	//   24   59:checkcast       #31  <Class Element>
	//   25   62:astore          7
				if(element instanceof ListItem)
	//*  26   64:aload           7
	//*  27   66:instanceof      #187 <Class ListItem>
	//*  28   69:ifeq            115
				{
					if(!((List) (arraylist1)).isEmpty())
	//*  29   72:aload           5
	//*  30   74:invokeinterface #190 <Method boolean List.isEmpty()>
	//*  31   79:ifne            99
					{
						processParagraphItems(workercontext, tag, ((List) (arraylist1)), ((List) (arraylist)));
	//   32   82:aload_0         
	//   33   83:aload_1         
	//   34   84:aload_2         
	//   35   85:aload           5
	//   36   87:aload           4
	//   37   89:invokevirtual   #194 <Method void processParagraphItems(WorkerContext, Tag, List, List)>
						((List) (arraylist1)).clear();
	//   38   92:aload           5
	//   39   94:invokeinterface #197 <Method void List.clear()>
					}
					((List) (arraylist2)).add(((Object) ((ListItem)element)));
	//   40   99:aload           6
	//   41  101:aload           7
	//   42  103:checkcast       #187 <Class ListItem>
	//   43  106:invokeinterface #121 <Method boolean List.add(Object)>
	//   44  111:pop             
				} else
	//*  45  112:goto            44
				{
					if(!((List) (arraylist2)).isEmpty())
	//*  46  115:aload           6
	//*  47  117:invokeinterface #190 <Method boolean List.isEmpty()>
	//*  48  122:ifne            142
					{
						processListItems(workercontext, tag, ((List) (arraylist2)), ((List) (arraylist)));
	//   49  125:aload_0         
	//   50  126:aload_1         
	//   51  127:aload_2         
	//   52  128:aload           6
	//   53  130:aload           4
	//   54  132:invokevirtual   #200 <Method void processListItems(WorkerContext, Tag, List, List)>
						((List) (arraylist2)).clear();
	//   55  135:aload           6
	//   56  137:invokeinterface #197 <Method void List.clear()>
					}
					((List) (arraylist1)).add(((Object) (element)));
	//   57  142:aload           5
	//   58  144:aload           7
	//   59  146:invokeinterface #121 <Method boolean List.add(Object)>
	//   60  151:pop             
				}
			}

	//*  61  152:goto            44
			if(!((List) (arraylist1)).isEmpty())
	//*  62  155:aload           5
	//*  63  157:invokeinterface #190 <Method boolean List.isEmpty()>
	//*  64  162:ifne            185
			{
				processParagraphItems(workercontext, tag, ((List) (arraylist1)), ((List) (arraylist)));
	//   65  165:aload_0         
	//   66  166:aload_1         
	//   67  167:aload_2         
	//   68  168:aload           5
	//   69  170:aload           4
	//   70  172:invokevirtual   #194 <Method void processParagraphItems(WorkerContext, Tag, List, List)>
				((List) (arraylist1)).clear();
	//   71  175:aload           5
	//   72  177:invokeinterface #197 <Method void List.clear()>
			} else
	//*  73  182:aload           4
	//*  74  184:areturn         
			if(!((List) (arraylist2)).isEmpty())
	//*  75  185:aload           6
	//*  76  187:invokeinterface #190 <Method boolean List.isEmpty()>
	//*  77  192:ifne            182
			{
				processListItems(workercontext, tag, ((List) (arraylist2)), ((List) (arraylist)));
	//   78  195:aload_0         
	//   79  196:aload_1         
	//   80  197:aload_2         
	//   81  198:aload           6
	//   82  200:aload           4
	//   83  202:invokevirtual   #200 <Method void processListItems(WorkerContext, Tag, List, List)>
				((List) (arraylist2)).clear();
	//   84  205:aload           6
	//   85  207:invokeinterface #197 <Method void List.clear()>
				return ((List) (arraylist));
	//   86  212:aload           4
	//   87  214:areturn         
			}
		}
		return ((List) (arraylist));
	}

	public boolean isStackOwner()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected void processListItems(WorkerContext workercontext, Tag tag, List list, List list1)
	{
		com.itextpdf.text.List list2;
		int i;
		Iterator iterator;
		ListItem listitem;
		try
		{
			list2 = new com.itextpdf.text.List();
	//    0    0:new             #204 <Class com.itextpdf.text.List>
	//    1    3:dup             
	//    2    4:invokespecial   #205 <Method void com.itextpdf.text.List()>
	//    3    7:astore          6
			list2.setAlignindent(false);
	//    4    9:aload           6
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #209 <Method void com.itextpdf.text.List.setAlignindent(boolean)>
			list2 = (com.itextpdf.text.List)getCssAppliers().apply(((Element) (list2)), tag, getHtmlPipelineContext(workercontext));
	//    7   15:aload_0         
	//    8   16:invokevirtual   #74  <Method CssAppliers getCssAppliers()>
	//    9   19:aload           6
	//   10   21:aload_2         
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #70  <Method com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   14   27:invokeinterface #84  <Method Element CssAppliers.apply(Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//   15   32:checkcast       #204 <Class com.itextpdf.text.List>
	//   16   35:astore          6
			list2.setIndentationLeft(0.0F);
	//   17   37:aload           6
	//   18   39:fconst_0        
	//   19   40:invokevirtual   #213 <Method void com.itextpdf.text.List.setIndentationLeft(float)>
		}
	//*  20   43:iconst_0        
	//*  21   44:istore          5
	//*  22   46:aload_3         
	//*  23   47:invokeinterface #19  <Method Iterator List.iterator()>
	//*  24   52:astore          7
	//*  25   54:aload           7
	//*  26   56:invokeinterface #25  <Method boolean Iterator.hasNext()>
	//*  27   61:ifeq            170
	//*  28   64:aload           7
	//*  29   66:invokeinterface #29  <Method Object Iterator.next()>
	//*  30   71:checkcast       #187 <Class ListItem>
	//*  31   74:astore          8
	//*  32   76:aload_0         
	//*  33   77:invokevirtual   #74  <Method CssAppliers getCssAppliers()>
	//*  34   80:aload           8
	//*  35   82:aload_2         
	//*  36   83:aload_0         
	//*  37   84:aload_1         
	//*  38   85:invokevirtual   #70  <Method com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//*  39   88:invokeinterface #84  <Method Element CssAppliers.apply(Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//*  40   93:checkcast       #187 <Class ListItem>
	//*  41   96:astore          8
	//*  42   98:iload           5
	//*  43  100:aload_3         
	//*  44  101:invokeinterface #124 <Method int List.size()>
	//*  45  106:iconst_1        
	//*  46  107:isub            
	//*  47  108:icmpeq          117
	//*  48  111:aload           8
	//*  49  113:fconst_0        
	//*  50  114:invokevirtual   #216 <Method void ListItem.setSpacingAfter(float)>
	//*  51  117:iload           5
	//*  52  119:ifeq            128
	//*  53  122:aload           8
	//*  54  124:fconst_0        
	//*  55  125:invokevirtual   #219 <Method void ListItem.setSpacingBefore(float)>
	//*  56  128:iload           5
	//*  57  130:iconst_1        
	//*  58  131:iadd            
	//*  59  132:istore          5
	//*  60  134:aload           8
	//*  61  136:ldc1            #220 <Float 1.2F>
	//*  62  138:invokevirtual   #223 <Method void ListItem.setMultipliedLeading(float)>
	//*  63  141:aload           6
	//*  64  143:aload           8
	//*  65  145:invokevirtual   #224 <Method boolean com.itextpdf.text.List.add(Element)>
	//*  66  148:pop             
	//*  67  149:goto            54
		// Misplaced declaration of an exception variable
		catch(WorkerContext workercontext)
	//*  68  152:astore_1        
		{
			throw new RuntimeWorkerException(LocaleMessages.getInstance().getMessage("customcontext.404"), ((Throwable) (workercontext)));
	//   69  153:new             #86  <Class RuntimeWorkerException>
	//   70  156:dup             
	//   71  157:invokestatic    #91  <Method LocaleMessages LocaleMessages.getInstance()>
	//   72  160:ldc1            #93  <String "customcontext.404">
	//   73  162:invokevirtual   #97  <Method String LocaleMessages.getMessage(String)>
	//   74  165:aload_1         
	//   75  166:invokespecial   #100 <Method void RuntimeWorkerException(String, Throwable)>
	//   76  169:athrow          
		}
		i = 0;
		iterator = list.iterator();
_L1:
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_170;
		listitem = (ListItem)iterator.next();
		listitem = (ListItem)getCssAppliers().apply(((Element) (listitem)), tag, getHtmlPipelineContext(workercontext));
		if(i != list.size() - 1)
			listitem.setSpacingAfter(0.0F);
		if(i == 0)
			break MISSING_BLOCK_LABEL_128;
		listitem.setSpacingBefore(0.0F);
		i++;
		listitem.setMultipliedLeading(1.2F);
		list2.add(((Element) (listitem)));
		  goto _L1
		if(!list1.isEmpty())
	//*  77  170:aload           4
	//*  78  172:invokeinterface #190 <Method boolean List.isEmpty()>
	//*  79  177:ifne            215
		{
			workercontext = ((WorkerContext) ((Element)list1.get(list1.size() - 1)));
	//   80  180:aload           4
	//   81  182:aload           4
	//   82  184:invokeinterface #124 <Method int List.size()>
	//   83  189:iconst_1        
	//   84  190:isub            
	//   85  191:invokeinterface #128 <Method Object List.get(int)>
	//   86  196:checkcast       #31  <Class Element>
	//   87  199:astore_1        
			if(workercontext instanceof Paragraph)
	//*  88  200:aload_1         
	//*  89  201:instanceof      #60  <Class Paragraph>
	//*  90  204:ifeq            215
				((Paragraph)workercontext).setSpacingAfter(0.0F);
	//   91  207:aload_1         
	//   92  208:checkcast       #60  <Class Paragraph>
	//   93  211:fconst_0        
	//   94  212:invokevirtual   #225 <Method void Paragraph.setSpacingAfter(float)>
		}
		list1.add(((Object) (list2)));
	//   95  215:aload           4
	//   96  217:aload           6
	//   97  219:invokeinterface #121 <Method boolean List.add(Object)>
	//   98  224:pop             
		return;
	//   99  225:return          
	}

	protected void processParagraphItems(WorkerContext workercontext, Tag tag, List list, List list1)
	{
		Paragraph paragraph = new Paragraph();
	//    0    0:new             #60  <Class Paragraph>
	//    1    3:dup             
	//    2    4:invokespecial   #227 <Method void Paragraph()>
	//    3    7:astore          5
		paragraph.setMultipliedLeading(1.2F);
	//    4    9:aload           5
	//    5   11:ldc1            #220 <Float 1.2F>
	//    6   13:invokevirtual   #228 <Method void Paragraph.setMultipliedLeading(float)>
		Map map = tag.getCSS();
	//    7   16:aload_2         
	//    8   17:invokevirtual   #152 <Method Map Tag.getCSS()>
	//    9   20:astore          6
		if(map.get("tab-interval") != null)
	//*  10   22:aload           6
	//*  11   24:ldc1            #154 <String "tab-interval">
	//*  12   26:invokeinterface #159 <Method Object Map.get(Object)>
	//*  13   31:ifnull          66
		{
			addTabIntervalContent(workercontext, tag, list, paragraph, (String)map.get("tab-interval"));
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:aload_2         
	//   17   37:aload_3         
	//   18   38:aload           5
	//   19   40:aload           6
	//   20   42:ldc1            #154 <String "tab-interval">
	//   21   44:invokeinterface #159 <Method Object Map.get(Object)>
	//   22   49:checkcast       #111 <Class String>
	//   23   52:invokespecial   #230 <Method void addTabIntervalContent(WorkerContext, Tag, List, Paragraph, String)>
			list1.add(((Object) (paragraph)));
	//   24   55:aload           4
	//   25   57:aload           5
	//   26   59:invokeinterface #121 <Method boolean List.add(Object)>
	//   27   64:pop             
		} else
	//*  28   65:return          
		{
			if(map.get("tab-stops") != null)
	//*  29   66:aload           6
	//*  30   68:ldc1            #232 <String "tab-stops">
	//*  31   70:invokeinterface #159 <Method Object Map.get(Object)>
	//*  32   75:ifnull          108
			{
				addTabStopsContent(list, paragraph, (String)map.get("tab-stops"));
	//   33   78:aload_0         
	//   34   79:aload_3         
	//   35   80:aload           5
	//   36   82:aload           6
	//   37   84:ldc1            #232 <String "tab-stops">
	//   38   86:invokeinterface #159 <Method Object Map.get(Object)>
	//   39   91:checkcast       #111 <Class String>
	//   40   94:invokespecial   #234 <Method void addTabStopsContent(List, Paragraph, String)>
				list1.add(((Object) (paragraph)));
	//   41   97:aload           4
	//   42   99:aload           5
	//   43  101:invokeinterface #121 <Method boolean List.add(Object)>
	//   44  106:pop             
				return;
	//   45  107:return          
			}
			if(map.get("xfa-tab-stops") != null)
	//*  46  108:aload           6
	//*  47  110:ldc1            #236 <String "xfa-tab-stops">
	//*  48  112:invokeinterface #159 <Method Object Map.get(Object)>
	//*  49  117:ifnull          150
			{
				addTabStopsContent(list, paragraph, (String)map.get("xfa-tab-stops"));
	//   50  120:aload_0         
	//   51  121:aload_3         
	//   52  122:aload           5
	//   53  124:aload           6
	//   54  126:ldc1            #236 <String "xfa-tab-stops">
	//   55  128:invokeinterface #159 <Method Object Map.get(Object)>
	//   56  133:checkcast       #111 <Class String>
	//   57  136:invokespecial   #234 <Method void addTabStopsContent(List, Paragraph, String)>
				list1.add(((Object) (paragraph)));
	//   58  139:aload           4
	//   59  141:aload           5
	//   60  143:invokeinterface #121 <Method boolean List.add(Object)>
	//   61  148:pop             
				return;
	//   62  149:return          
			}
			workercontext = ((WorkerContext) (currentContentToParagraph(list, true, true, tag, workercontext)));
	//   63  150:aload_0         
	//   64  151:aload_3         
	//   65  152:iconst_1        
	//   66  153:iconst_1        
	//   67  154:aload_2         
	//   68  155:aload_1         
	//   69  156:invokevirtual   #240 <Method List currentContentToParagraph(List, boolean, boolean, Tag, WorkerContext)>
	//   70  159:astore_1        
			if(!list1.isEmpty() && !((List) (workercontext)).isEmpty())
	//*  71  160:aload           4
	//*  72  162:invokeinterface #190 <Method boolean List.isEmpty()>
	//*  73  167:ifne            205
	//*  74  170:aload_1         
	//*  75  171:invokeinterface #190 <Method boolean List.isEmpty()>
	//*  76  176:ifne            205
			{
				tag = ((Tag) ((Element)((List) (workercontext)).get(0)));
	//   77  179:aload_1         
	//   78  180:iconst_0        
	//   79  181:invokeinterface #128 <Method Object List.get(int)>
	//   80  186:checkcast       #31  <Class Element>
	//   81  189:astore_2        
				if(tag instanceof Paragraph)
	//*  82  190:aload_2         
	//*  83  191:instanceof      #60  <Class Paragraph>
	//*  84  194:ifeq            205
					((Paragraph)tag).setSpacingBefore(0.0F);
	//   85  197:aload_2         
	//   86  198:checkcast       #60  <Class Paragraph>
	//   87  201:fconst_0        
	//   88  202:invokevirtual   #241 <Method void Paragraph.setSpacingBefore(float)>
			}
			workercontext = ((WorkerContext) (((List) (workercontext)).iterator()));
	//   89  205:aload_1         
	//   90  206:invokeinterface #19  <Method Iterator List.iterator()>
	//   91  211:astore_1        
			while(((Iterator) (workercontext)).hasNext()) 
	//*  92  212:aload_1         
	//*  93  213:invokeinterface #25  <Method boolean Iterator.hasNext()>
	//*  94  218:ifeq            65
				list1.add(((Object) ((Element)((Iterator) (workercontext)).next())));
	//   95  221:aload           4
	//   96  223:aload_1         
	//   97  224:invokeinterface #29  <Method Object Iterator.next()>
	//   98  229:checkcast       #31  <Class Element>
	//   99  232:invokeinterface #121 <Method boolean List.add(Object)>
	//  100  237:pop             
		}
	//* 101  238:goto            212
	}
}
