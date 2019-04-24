// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.*;
import com.itextpdf.text.html.HtmlUtilities;
import com.itextpdf.text.pdf.PdfPCell;
import java.util.List;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			ChainedProperties

public class CellWrapper
	implements TextElementArray
{

	public CellWrapper(String s, ChainedProperties chainedproperties)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		cell = createPdfPCell(s, chainedproperties);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #22  <Method PdfPCell createPdfPCell(String, ChainedProperties)>
	//    7   11:putfield        #24  <Field PdfPCell cell>
		s = chainedproperties.getProperty("width");
	//    8   14:aload_2         
	//    9   15:ldc1            #25  <String "width">
	//   10   17:invokevirtual   #31  <Method String ChainedProperties.getProperty(String)>
	//   11   20:astore_1        
		if(s != null)
	//*  12   21:aload_1         
	//*  13   22:ifnull          66
		{
			chainedproperties = ((ChainedProperties) (s.trim()));
	//   14   25:aload_1         
	//   15   26:invokevirtual   #37  <Method String String.trim()>
	//   16   29:astore_2        
			s = ((String) (chainedproperties));
	//   17   30:aload_2         
	//   18   31:astore_1        
			if(((String) (chainedproperties)).endsWith("%"))
	//*  19   32:aload_2         
	//*  20   33:ldc1            #39  <String "%">
	//*  21   35:invokevirtual   #43  <Method boolean String.endsWith(String)>
	//*  22   38:ifeq            58
			{
				percentage = true;
	//   23   41:aload_0         
	//   24   42:iconst_1        
	//   25   43:putfield        #45  <Field boolean percentage>
				s = ((String) (chainedproperties)).substring(0, ((String) (chainedproperties)).length() - 1);
	//   26   46:aload_2         
	//   27   47:iconst_0        
	//   28   48:aload_2         
	//   29   49:invokevirtual   #49  <Method int String.length()>
	//   30   52:iconst_1        
	//   31   53:isub            
	//   32   54:invokevirtual   #53  <Method String String.substring(int, int)>
	//   33   57:astore_1        
			}
			width = Float.parseFloat(s);
	//   34   58:aload_0         
	//   35   59:aload_1         
	//   36   60:invokestatic    #59  <Method float Float.parseFloat(String)>
	//   37   63:putfield        #61  <Field float width>
		}
	//   38   66:return          
	}

	public boolean add(Element element)
	{
		cell.addElement(element);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfPCell cell>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #70  <Method void PdfPCell.addElement(Element)>
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	public PdfPCell createPdfPCell(String s, ChainedProperties chainedproperties)
	{
		PdfPCell pdfpcell = new PdfPCell((Phrase)null);
	//    0    0:new             #66  <Class PdfPCell>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:checkcast       #72  <Class Phrase>
	//    4    8:invokespecial   #75  <Method void PdfPCell(Phrase)>
	//    5   11:astore          4
		String s1 = chainedproperties.getProperty("colspan");
	//    6   13:aload_2         
	//    7   14:ldc1            #77  <String "colspan">
	//    8   16:invokevirtual   #31  <Method String ChainedProperties.getProperty(String)>
	//    9   19:astore          5
		if(s1 != null)
	//*  10   21:aload           5
	//*  11   23:ifnull          36
			pdfpcell.setColspan(Integer.parseInt(s1));
	//   12   26:aload           4
	//   13   28:aload           5
	//   14   30:invokestatic    #83  <Method int Integer.parseInt(String)>
	//   15   33:invokevirtual   #87  <Method void PdfPCell.setColspan(int)>
		s1 = chainedproperties.getProperty("rowspan");
	//   16   36:aload_2         
	//   17   37:ldc1            #89  <String "rowspan">
	//   18   39:invokevirtual   #31  <Method String ChainedProperties.getProperty(String)>
	//   19   42:astore          5
		if(s1 != null)
	//*  20   44:aload           5
	//*  21   46:ifnull          59
			pdfpcell.setRowspan(Integer.parseInt(s1));
	//   22   49:aload           4
	//   23   51:aload           5
	//   24   53:invokestatic    #83  <Method int Integer.parseInt(String)>
	//   25   56:invokevirtual   #92  <Method void PdfPCell.setRowspan(int)>
		if(s.equals("th"))
	//*  26   59:aload_1         
	//*  27   60:ldc1            #94  <String "th">
	//*  28   62:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  29   65:ifeq            74
			pdfpcell.setHorizontalAlignment(1);
	//   30   68:aload           4
	//   31   70:iconst_1        
	//   32   71:invokevirtual   #101 <Method void PdfPCell.setHorizontalAlignment(int)>
		s = chainedproperties.getProperty("align");
	//   33   74:aload_2         
	//   34   75:ldc1            #103 <String "align">
	//   35   77:invokevirtual   #31  <Method String ChainedProperties.getProperty(String)>
	//   36   80:astore_1        
		if(s != null)
	//*  37   81:aload_1         
	//*  38   82:ifnull          94
			pdfpcell.setHorizontalAlignment(HtmlUtilities.alignmentValue(s));
	//   39   85:aload           4
	//   40   87:aload_1         
	//   41   88:invokestatic    #108 <Method int HtmlUtilities.alignmentValue(String)>
	//   42   91:invokevirtual   #101 <Method void PdfPCell.setHorizontalAlignment(int)>
		s = chainedproperties.getProperty("valign");
	//   43   94:aload_2         
	//   44   95:ldc1            #110 <String "valign">
	//   45   97:invokevirtual   #31  <Method String ChainedProperties.getProperty(String)>
	//   46  100:astore_1        
		pdfpcell.setVerticalAlignment(5);
	//   47  101:aload           4
	//   48  103:iconst_5        
	//   49  104:invokevirtual   #113 <Method void PdfPCell.setVerticalAlignment(int)>
		if(s != null)
	//*  50  107:aload_1         
	//*  51  108:ifnull          120
			pdfpcell.setVerticalAlignment(HtmlUtilities.alignmentValue(s));
	//   52  111:aload           4
	//   53  113:aload_1         
	//   54  114:invokestatic    #108 <Method int HtmlUtilities.alignmentValue(String)>
	//   55  117:invokevirtual   #113 <Method void PdfPCell.setVerticalAlignment(int)>
		s = chainedproperties.getProperty("border");
	//   56  120:aload_2         
	//   57  121:ldc1            #115 <String "border">
	//   58  123:invokevirtual   #31  <Method String ChainedProperties.getProperty(String)>
	//   59  126:astore_1        
		float f = 0.0F;
	//   60  127:fconst_0        
	//   61  128:fstore_3        
		if(s != null)
	//*  62  129:aload_1         
	//*  63  130:ifnull          138
			f = Float.parseFloat(s);
	//   64  133:aload_1         
	//   65  134:invokestatic    #59  <Method float Float.parseFloat(String)>
	//   66  137:fstore_3        
		pdfpcell.setBorderWidth(f);
	//   67  138:aload           4
	//   68  140:fload_3         
	//   69  141:invokevirtual   #119 <Method void PdfPCell.setBorderWidth(float)>
		s = chainedproperties.getProperty("cellpadding");
	//   70  144:aload_2         
	//   71  145:ldc1            #121 <String "cellpadding">
	//   72  147:invokevirtual   #31  <Method String ChainedProperties.getProperty(String)>
	//   73  150:astore_1        
		if(s != null)
	//*  74  151:aload_1         
	//*  75  152:ifnull          164
			pdfpcell.setPadding(Float.parseFloat(s));
	//   76  155:aload           4
	//   77  157:aload_1         
	//   78  158:invokestatic    #59  <Method float Float.parseFloat(String)>
	//   79  161:invokevirtual   #124 <Method void PdfPCell.setPadding(float)>
		pdfpcell.setUseDescender(true);
	//   80  164:aload           4
	//   81  166:iconst_1        
	//   82  167:invokevirtual   #128 <Method void PdfPCell.setUseDescender(boolean)>
		pdfpcell.setBackgroundColor(HtmlUtilities.decodeColor(chainedproperties.getProperty("bgcolor")));
	//   83  170:aload           4
	//   84  172:aload_2         
	//   85  173:ldc1            #130 <String "bgcolor">
	//   86  175:invokevirtual   #31  <Method String ChainedProperties.getProperty(String)>
	//   87  178:invokestatic    #134 <Method com.itextpdf.text.BaseColor HtmlUtilities.decodeColor(String)>
	//   88  181:invokevirtual   #138 <Method void PdfPCell.setBackgroundColor(com.itextpdf.text.BaseColor)>
		return pdfpcell;
	//   89  184:aload           4
	//   90  186:areturn         
	}

	public PdfPCell getCell()
	{
		return cell;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfPCell cell>
	//    2    4:areturn         
	}

	public List getChunks()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public float getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field float width>
	//    2    4:freturn         
	}

	public boolean isContent()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isNestable()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isPercentage()
	{
		return percentage;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean percentage>
	//    2    4:ireturn         
	}

	public boolean process(ElementListener elementlistener)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int type()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private final PdfPCell cell;
	private boolean percentage;
	private float width;
}
