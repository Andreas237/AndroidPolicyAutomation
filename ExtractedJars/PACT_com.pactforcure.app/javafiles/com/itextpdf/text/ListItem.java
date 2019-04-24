// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.pdf.PdfName;
import java.util.List;

// Referenced classes of package com.itextpdf.text:
//			Paragraph, Chunk, ListBody, ListLabel, 
//			Font, Phrase

public class ListItem extends Paragraph
{

	public ListItem()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Paragraph()>
		listBody = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field ListBody listBody>
		listLabel = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #22  <Field ListLabel listLabel>
		setRole(PdfName.LI);
	//    8   14:aload_0         
	//    9   15:getstatic       #28  <Field PdfName PdfName.LI>
	//   10   18:invokevirtual   #32  <Method void setRole(PdfName)>
	//   11   21:return          
	}

	public ListItem(float f)
	{
		super(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #36  <Method void Paragraph(float)>
		listBody = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #20  <Field ListBody listBody>
		listLabel = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #22  <Field ListLabel listLabel>
		setRole(PdfName.LI);
	//    9   15:aload_0         
	//   10   16:getstatic       #28  <Field PdfName PdfName.LI>
	//   11   19:invokevirtual   #32  <Method void setRole(PdfName)>
	//   12   22:return          
	}

	public ListItem(float f, Chunk chunk)
	{
		super(f, chunk);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #39  <Method void Paragraph(float, Chunk)>
		listBody = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #20  <Field ListBody listBody>
		listLabel = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #22  <Field ListLabel listLabel>
		setRole(PdfName.LI);
	//   10   16:aload_0         
	//   11   17:getstatic       #28  <Field PdfName PdfName.LI>
	//   12   20:invokevirtual   #32  <Method void setRole(PdfName)>
	//   13   23:return          
	}

	public ListItem(float f, String s)
	{
		super(f, s);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #42  <Method void Paragraph(float, String)>
		listBody = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #20  <Field ListBody listBody>
		listLabel = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #22  <Field ListLabel listLabel>
		setRole(PdfName.LI);
	//   10   16:aload_0         
	//   11   17:getstatic       #28  <Field PdfName PdfName.LI>
	//   12   20:invokevirtual   #32  <Method void setRole(PdfName)>
	//   13   23:return          
	}

	public ListItem(float f, String s, Font font)
	{
		super(f, s, font);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #45  <Method void Paragraph(float, String, Font)>
		listBody = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #20  <Field ListBody listBody>
		listLabel = null;
	//    8   12:aload_0         
	//    9   13:aconst_null     
	//   10   14:putfield        #22  <Field ListLabel listLabel>
		setRole(PdfName.LI);
	//   11   17:aload_0         
	//   12   18:getstatic       #28  <Field PdfName PdfName.LI>
	//   13   21:invokevirtual   #32  <Method void setRole(PdfName)>
	//   14   24:return          
	}

	public ListItem(Chunk chunk)
	{
		super(chunk);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void Paragraph(Chunk)>
		listBody = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #20  <Field ListBody listBody>
		listLabel = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #22  <Field ListLabel listLabel>
		setRole(PdfName.LI);
	//    9   15:aload_0         
	//   10   16:getstatic       #28  <Field PdfName PdfName.LI>
	//   11   19:invokevirtual   #32  <Method void setRole(PdfName)>
	//   12   22:return          
	}

	public ListItem(Phrase phrase)
	{
		super(phrase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method void Paragraph(Phrase)>
		listBody = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #20  <Field ListBody listBody>
		listLabel = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #22  <Field ListLabel listLabel>
		setRole(PdfName.LI);
	//    9   15:aload_0         
	//   10   16:getstatic       #28  <Field PdfName PdfName.LI>
	//   11   19:invokevirtual   #32  <Method void setRole(PdfName)>
	//   12   22:return          
	}

	public ListItem(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void Paragraph(String)>
		listBody = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #20  <Field ListBody listBody>
		listLabel = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #22  <Field ListLabel listLabel>
		setRole(PdfName.LI);
	//    9   15:aload_0         
	//   10   16:getstatic       #28  <Field PdfName PdfName.LI>
	//   11   19:invokevirtual   #32  <Method void setRole(PdfName)>
	//   12   22:return          
	}

	public ListItem(String s, Font font)
	{
		super(s, font);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #57  <Method void Paragraph(String, Font)>
		listBody = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #20  <Field ListBody listBody>
		listLabel = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #22  <Field ListLabel listLabel>
		setRole(PdfName.LI);
	//   10   16:aload_0         
	//   11   17:getstatic       #28  <Field PdfName PdfName.LI>
	//   12   20:invokevirtual   #32  <Method void setRole(PdfName)>
	//   13   23:return          
	}

	public void adjustListSymbolFont()
	{
		List list = getChunks();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method List getChunks()>
	//    2    4:astore_1        
		if(!list.isEmpty() && symbol != null)
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #68  <Method boolean List.isEmpty()>
	//*   5   11:ifne            41
	//*   6   14:aload_0         
	//*   7   15:getfield        #70  <Field Chunk symbol>
	//*   8   18:ifnull          41
			symbol.setFont(((Chunk)list.get(0)).getFont());
	//    9   21:aload_0         
	//   10   22:getfield        #70  <Field Chunk symbol>
	//   11   25:aload_1         
	//   12   26:iconst_0        
	//   13   27:invokeinterface #74  <Method Object List.get(int)>
	//   14   32:checkcast       #76  <Class Chunk>
	//   15   35:invokevirtual   #80  <Method Font Chunk.getFont()>
	//   16   38:invokevirtual   #84  <Method void Chunk.setFont(Font)>
	//   17   41:return          
	}

	public Paragraph cloneShallow(boolean flag)
	{
		ListItem listitem = new ListItem();
	//    0    0:new             #2   <Class ListItem>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void ListItem()>
	//    3    7:astore_2        
		populateProperties(((Paragraph) (listitem)), flag);
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #91  <Method void populateProperties(Paragraph, boolean)>
		return ((Paragraph) (listitem));
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	public ListBody getListBody()
	{
		if(listBody == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field ListBody listBody>
	//*   2    4:ifnonnull       19
			listBody = new ListBody(this);
	//    3    7:aload_0         
	//    4    8:new             #95  <Class ListBody>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #98  <Method void ListBody(ListItem)>
	//    8   16:putfield        #20  <Field ListBody listBody>
		return listBody;
	//    9   19:aload_0         
	//   10   20:getfield        #20  <Field ListBody listBody>
	//   11   23:areturn         
	}

	public ListLabel getListLabel()
	{
		if(listLabel == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field ListLabel listLabel>
	//*   2    4:ifnonnull       19
			listLabel = new ListLabel(this);
	//    3    7:aload_0         
	//    4    8:new             #102 <Class ListLabel>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #103 <Method void ListLabel(ListItem)>
	//    8   16:putfield        #22  <Field ListLabel listLabel>
		return listLabel;
	//    9   19:aload_0         
	//   10   20:getfield        #22  <Field ListLabel listLabel>
	//   11   23:areturn         
	}

	public Chunk getListSymbol()
	{
		return symbol;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Chunk symbol>
	//    2    4:areturn         
	}

	public void setIndentationLeft(float f, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            16
		{
			setIndentationLeft(getListSymbol().getWidthPoint());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #109 <Method Chunk getListSymbol()>
	//    5    9:invokevirtual   #113 <Method float Chunk.getWidthPoint()>
	//    6   12:invokevirtual   #115 <Method void setIndentationLeft(float)>
			return;
	//    7   15:return          
		} else
		{
			setIndentationLeft(f);
	//    8   16:aload_0         
	//    9   17:fload_1         
	//   10   18:invokevirtual   #115 <Method void setIndentationLeft(float)>
			return;
	//   11   21:return          
		}
	}

	public void setListSymbol(Chunk chunk)
	{
		if(symbol == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Chunk symbol>
	//*   2    4:ifnonnull       36
		{
			symbol = chunk;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #70  <Field Chunk symbol>
			if(symbol.getFont().isStandardFont())
	//*   6   12:aload_0         
	//*   7   13:getfield        #70  <Field Chunk symbol>
	//*   8   16:invokevirtual   #80  <Method Font Chunk.getFont()>
	//*   9   19:invokevirtual   #121 <Method boolean Font.isStandardFont()>
	//*  10   22:ifeq            36
				symbol.setFont(font);
	//   11   25:aload_0         
	//   12   26:getfield        #70  <Field Chunk symbol>
	//   13   29:aload_0         
	//   14   30:getfield        #125 <Field Font font>
	//   15   33:invokevirtual   #84  <Method void Chunk.setFont(Font)>
		}
	//   16   36:return          
	}

	public int type()
	{
		return 15;
	//    0    0:bipush          15
	//    1    2:ireturn         
	}

	private static final long serialVersionUID = 0xce779f6eL;
	private ListBody listBody;
	private ListLabel listLabel;
	protected Chunk symbol;
}
