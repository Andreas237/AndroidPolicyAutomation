// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfDiv;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.apply.*;
import com.itextpdf.tool.xml.html.pdfelement.HtmlCell;
import com.itextpdf.tool.xml.html.pdfelement.NoNewLineParagraph;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			CssAppliers, CssApplier

public class CssAppliersImpl
	implements CssAppliers
{

	public CssAppliersImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		map = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void HashMap()>
	//    6   12:putfield        #18  <Field Map map>
		map.put(com/itextpdf/text/Chunk, ((Object) (new ChunkCssApplier(((FontProvider) (null))))));
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field Map map>
	//    9   19:ldc1            #20  <Class Chunk>
	//   10   21:new             #22  <Class ChunkCssApplier>
	//   11   24:dup             
	//   12   25:aconst_null     
	//   13   26:invokespecial   #25  <Method void ChunkCssApplier(FontProvider)>
	//   14   29:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   15   34:pop             
		map.put(com/itextpdf/text/Paragraph, ((Object) (new ParagraphCssApplier(((CssAppliers) (this))))));
	//   16   35:aload_0         
	//   17   36:getfield        #18  <Field Map map>
	//   18   39:ldc1            #33  <Class Paragraph>
	//   19   41:new             #35  <Class ParagraphCssApplier>
	//   20   44:dup             
	//   21   45:aload_0         
	//   22   46:invokespecial   #38  <Method void ParagraphCssApplier(CssAppliers)>
	//   23   49:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   24   54:pop             
		map.put(com/itextpdf/tool/xml/html/pdfelement/NoNewLineParagraph, ((Object) (new NoNewLineParagraphCssApplier())));
	//   25   55:aload_0         
	//   26   56:getfield        #18  <Field Map map>
	//   27   59:ldc1            #40  <Class NoNewLineParagraph>
	//   28   61:new             #42  <Class NoNewLineParagraphCssApplier>
	//   29   64:dup             
	//   30   65:invokespecial   #43  <Method void NoNewLineParagraphCssApplier()>
	//   31   68:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   32   73:pop             
		map.put(com/itextpdf/tool/xml/html/pdfelement/HtmlCell, ((Object) (new HtmlCellCssApplier())));
	//   33   74:aload_0         
	//   34   75:getfield        #18  <Field Map map>
	//   35   78:ldc1            #45  <Class HtmlCell>
	//   36   80:new             #47  <Class HtmlCellCssApplier>
	//   37   83:dup             
	//   38   84:invokespecial   #48  <Method void HtmlCellCssApplier()>
	//   39   87:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   40   92:pop             
		map.put(com/itextpdf/text/List, ((Object) (new ListStyleTypeCssApplier())));
	//   41   93:aload_0         
	//   42   94:getfield        #18  <Field Map map>
	//   43   97:ldc1            #50  <Class List>
	//   44   99:new             #52  <Class ListStyleTypeCssApplier>
	//   45  102:dup             
	//   46  103:invokespecial   #53  <Method void ListStyleTypeCssApplier()>
	//   47  106:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   48  111:pop             
		map.put(com/itextpdf/text/pdf/draw/LineSeparator, ((Object) (new LineSeparatorCssApplier())));
	//   49  112:aload_0         
	//   50  113:getfield        #18  <Field Map map>
	//   51  116:ldc1            #55  <Class LineSeparator>
	//   52  118:new             #57  <Class LineSeparatorCssApplier>
	//   53  121:dup             
	//   54  122:invokespecial   #58  <Method void LineSeparatorCssApplier()>
	//   55  125:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   56  130:pop             
		map.put(com/itextpdf/text/Image, ((Object) (new ImageCssApplier())));
	//   57  131:aload_0         
	//   58  132:getfield        #18  <Field Map map>
	//   59  135:ldc1            #60  <Class Image>
	//   60  137:new             #62  <Class ImageCssApplier>
	//   61  140:dup             
	//   62  141:invokespecial   #63  <Method void ImageCssApplier()>
	//   63  144:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   64  149:pop             
		map.put(com/itextpdf/text/pdf/PdfDiv, ((Object) (new DivCssApplier())));
	//   65  150:aload_0         
	//   66  151:getfield        #18  <Field Map map>
	//   67  154:ldc1            #65  <Class PdfDiv>
	//   68  156:new             #67  <Class DivCssApplier>
	//   69  159:dup             
	//   70  160:invokespecial   #68  <Method void DivCssApplier()>
	//   71  163:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   72  168:pop             
	//   73  169:return          
	}

	public CssAppliersImpl(FontProvider fontprovider)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void CssAppliersImpl()>
		((ChunkCssApplier)map.get(com/itextpdf/text/Chunk)).setFontProvider(fontprovider);
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Map map>
	//    4    8:ldc1            #20  <Class Chunk>
	//    5   10:invokeinterface #74  <Method Object Map.get(Object)>
	//    6   15:checkcast       #22  <Class ChunkCssApplier>
	//    7   18:aload_1         
	//    8   19:invokevirtual   #77  <Method void ChunkCssApplier.setFontProvider(FontProvider)>
	//    9   22:return          
	}

	public Element apply(Element element, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		Iterator iterator = map.entrySet().iterator();
	//    2    3:aload_0         
	//    3    4:getfield        #18  <Field Map map>
	//    4    7:invokeinterface #83  <Method Set Map.entrySet()>
	//    5   12:invokeinterface #89  <Method Iterator Set.iterator()>
	//    6   17:astore          8
		Object obj;
		do
		{
			obj = ((Object) (obj1));
	//    7   19:aload           7
	//    8   21:astore          6
			if(!iterator.hasNext())
				break;
	//    9   23:aload           8
	//   10   25:invokeinterface #95  <Method boolean Iterator.hasNext()>
	//   11   30:ifeq            74
			obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   12   33:aload           8
	//   13   35:invokeinterface #99  <Method Object Iterator.next()>
	//   14   40:checkcast       #101 <Class java.util.Map$Entry>
	//   15   43:astore          6
			if(!((Class)((java.util.Map.Entry) (obj)).getKey()).isInstance(((Object) (element))))
				continue;
	//   16   45:aload           6
	//   17   47:invokeinterface #104 <Method Object java.util.Map$Entry.getKey()>
	//   18   52:checkcast       #106 <Class Class>
	//   19   55:aload_1         
	//   20   56:invokevirtual   #110 <Method boolean Class.isInstance(Object)>
	//   21   59:ifeq            19
			obj = ((Object) ((CssApplier)((java.util.Map.Entry) (obj)).getValue()));
	//   22   62:aload           6
	//   23   64:invokeinterface #113 <Method Object java.util.Map$Entry.getValue()>
	//   24   69:checkcast       #115 <Class CssApplier>
	//   25   72:astore          6
			break;
		} while(true);
		if(obj == null)
	//*  26   74:aload           6
	//*  27   76:ifnonnull       87
			throw new RuntimeException();
	//   28   79:new             #117 <Class RuntimeException>
	//   29   82:dup             
	//   30   83:invokespecial   #118 <Method void RuntimeException()>
	//   31   86:athrow          
		else
			return ((CssApplier) (obj)).apply(element, tag, marginmemory, pagesizecontainable, htmlpipelinecontext);
	//   32   87:aload           6
	//   33   89:aload_1         
	//   34   90:aload_2         
	//   35   91:aload_3         
	//   36   92:aload           4
	//   37   94:aload           5
	//   38   96:invokeinterface #120 <Method Element CssApplier.apply(Element, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//   39  101:areturn         
	}

	public Element apply(Element element, Tag tag, HtmlPipelineContext htmlpipelinecontext)
	{
		return apply(element, tag, ((MarginMemory) (htmlpipelinecontext)), ((PageSizeContainable) (htmlpipelinecontext)), htmlpipelinecontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload_3         
	//    5    5:aload_3         
	//    6    6:invokevirtual   #122 <Method Element apply(Element, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    7    9:areturn         
	}

	public CssAppliers clone()
	{
		CssAppliersImpl cssappliersimpl = getClonedObject();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #128 <Method CssAppliersImpl getClonedObject()>
	//    2    4:astore_1        
		cssappliersimpl.map = ((Map) (new HashMap(map)));
	//    3    5:aload_1         
	//    4    6:new             #15  <Class HashMap>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:getfield        #18  <Field Map map>
	//    8   14:invokespecial   #131 <Method void HashMap(Map)>
	//    9   17:putfield        #18  <Field Map map>
		return ((CssAppliers) (cssappliersimpl));
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method CssAppliers clone()>
	//    2    4:areturn         
	}

	public ChunkCssApplier getChunkCssAplier()
	{
		return (ChunkCssApplier)map.get(com/itextpdf/text/Chunk);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map map>
	//    2    4:ldc1            #20  <Class Chunk>
	//    3    6:invokeinterface #74  <Method Object Map.get(Object)>
	//    4   11:checkcast       #22  <Class ChunkCssApplier>
	//    5   14:areturn         
	}

	protected CssAppliersImpl getClonedObject()
	{
		return new CssAppliersImpl();
	//    0    0:new             #2   <Class CssAppliersImpl>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void CssAppliersImpl()>
	//    3    7:areturn         
	}

	public CssApplier getCssApplier(Class class1)
	{
		return (CssApplier)map.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map map>
	//    2    4:aload_1         
	//    3    5:invokeinterface #74  <Method Object Map.get(Object)>
	//    4   10:checkcast       #115 <Class CssApplier>
	//    5   13:areturn         
	}

	public void putCssApplier(Class class1, CssApplier cssapplier)
	{
		map.put(((Object) (class1)), ((Object) (cssapplier)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map map>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void setChunkCssAplier(ChunkCssApplier chunkcssapplier)
	{
		map.put(com/itextpdf/text/Chunk, ((Object) (chunkcssapplier)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map map>
	//    2    4:ldc1            #20  <Class Chunk>
	//    3    6:aload_1         
	//    4    7:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//    5   12:pop             
	//    6   13:return          
	}

	private Map map;
}
