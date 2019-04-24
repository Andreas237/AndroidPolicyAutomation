// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.pdfelement;

import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.tool.xml.html.table.TableStyleValues;

public class HtmlCell extends PdfPCell
{

	public HtmlCell()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void PdfPCell()>
		values = new TableStyleValues();
	//    2    4:aload_0         
	//    3    5:new             #14  <Class TableStyleValues>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void TableStyleValues()>
	//    6   12:putfield        #17  <Field TableStyleValues values>
		fixedWidth = 0.0F;
	//    7   15:aload_0         
	//    8   16:fconst_0        
	//    9   17:putfield        #19  <Field float fixedWidth>
		setPaddingLeft(0.0F);
	//   10   20:aload_0         
	//   11   21:fconst_0        
	//   12   22:invokevirtual   #23  <Method void setPaddingLeft(float)>
		setPaddingRight(0.0F);
	//   13   25:aload_0         
	//   14   26:fconst_0        
	//   15   27:invokevirtual   #26  <Method void setPaddingRight(float)>
		setPaddingTop(0.0F);
	//   16   30:aload_0         
	//   17   31:fconst_0        
	//   18   32:invokevirtual   #29  <Method void setPaddingTop(float)>
		setPaddingBottom(0.0F);
	//   19   35:aload_0         
	//   20   36:fconst_0        
	//   21   37:invokevirtual   #32  <Method void setPaddingBottom(float)>
		setUseAscender(true);
	//   22   40:aload_0         
	//   23   41:iconst_1        
	//   24   42:invokevirtual   #36  <Method void setUseAscender(boolean)>
		setUseDescender(true);
	//   25   45:aload_0         
	//   26   46:iconst_1        
	//   27   47:invokevirtual   #39  <Method void setUseDescender(boolean)>
	//   28   50:return          
	}

	public HtmlCell(PdfPCell pdfpcell)
	{
		super(pdfpcell);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #43  <Method void PdfPCell(PdfPCell)>
		values = new TableStyleValues();
	//    3    5:aload_0         
	//    4    6:new             #14  <Class TableStyleValues>
	//    5    9:dup             
	//    6   10:invokespecial   #15  <Method void TableStyleValues()>
	//    7   13:putfield        #17  <Field TableStyleValues values>
	//    8   16:return          
	}

	public HtmlCell(PdfPCell pdfpcell, boolean flag)
	{
		this(pdfpcell);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method void HtmlCell(PdfPCell)>
		values.setLastInRow(flag);
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field TableStyleValues values>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #48  <Method void TableStyleValues.setLastInRow(boolean)>
	//    7   13:return          
	}

	public TableStyleValues getCellValues()
	{
		return values;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TableStyleValues values>
	//    2    4:areturn         
	}

	public float getFixedWidth()
	{
		return fixedWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field float fixedWidth>
	//    2    4:freturn         
	}

	public void setCellValues(TableStyleValues tablestylevalues)
	{
		values = tablestylevalues;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TableStyleValues values>
	//    3    5:return          
	}

	public void setFixedWidth(float f)
	{
		fixedWidth = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #19  <Field float fixedWidth>
	//    3    5:return          
	}

	private float fixedWidth;
	private TableStyleValues values;
}
