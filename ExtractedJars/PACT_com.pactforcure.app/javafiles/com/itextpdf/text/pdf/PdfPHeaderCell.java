// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfPCell, PdfName

public class PdfPHeaderCell extends PdfPCell
{

	public PdfPHeaderCell()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void PdfPCell()>
		scope = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field int scope>
		name = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #24  <Field String name>
		role = PdfName.TH;
	//    8   14:aload_0         
	//    9   15:getstatic       #30  <Field PdfName PdfName.TH>
	//   10   18:putfield        #33  <Field PdfName role>
	//   11   21:return          
	}

	public PdfPHeaderCell(PdfPHeaderCell pdfpheadercell)
	{
		super(((PdfPCell) (pdfpheadercell)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void PdfPCell(PdfPCell)>
		scope = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #22  <Field int scope>
		name = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #24  <Field String name>
		role = pdfpheadercell.role;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getfield        #33  <Field PdfName role>
	//   12   20:putfield        #33  <Field PdfName role>
		scope = pdfpheadercell.scope;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:getfield        #22  <Field int scope>
	//   16   28:putfield        #22  <Field int scope>
		name = pdfpheadercell.getName();
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #42  <Method String getName()>
	//   20   36:putfield        #24  <Field String name>
	//   21   39:return          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String name>
	//    2    4:areturn         
	}

	public PdfName getRole()
	{
		return role;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field PdfName role>
	//    2    4:areturn         
	}

	public int getScope()
	{
		return scope;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int scope>
	//    2    4:ireturn         
	}

	public void setName(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field String name>
	//    3    5:return          
	}

	public void setRole(PdfName pdfname)
	{
		role = pdfname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field PdfName role>
	//    3    5:return          
	}

	public void setScope(int i)
	{
		scope = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field int scope>
	//    3    5:return          
	}

	public static final int BOTH = 3;
	public static final int COLUMN = 2;
	public static final int NONE = 0;
	public static final int ROW = 1;
	protected String name;
	protected int scope;
}
