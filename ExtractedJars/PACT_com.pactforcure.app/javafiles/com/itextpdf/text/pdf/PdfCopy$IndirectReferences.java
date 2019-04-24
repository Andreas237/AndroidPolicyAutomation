// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfCopy, PdfIndirectReference

static class PdfCopy$IndirectReferences
{

	boolean getCopied()
	{
		return hasCopied;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field boolean hasCopied>
	//    2    4:ireturn         
	}

	PdfIndirectReference getRef()
	{
		return theRef;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field PdfIndirectReference theRef>
	//    2    4:areturn         
	}

	void setCopied()
	{
		hasCopied = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #20  <Field boolean hasCopied>
	//    3    5:return          
	}

	void setNotCopied()
	{
		hasCopied = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #20  <Field boolean hasCopied>
	//    3    5:return          
	}

	public String toString()
	{
		String s = "";
	//    0    0:ldc1            #31  <String "">
	//    1    2:astore_1        
		if(hasCopied)
	//*   2    3:aload_0         
	//*   3    4:getfield        #20  <Field boolean hasCopied>
	//*   4    7:ifeq            31
			s = (new StringBuilder()).append("").append(" Copied").toString();
	//    5   10:new             #33  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #34  <Method void StringBuilder()>
	//    8   17:ldc1            #31  <String "">
	//    9   19:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:ldc1            #40  <String " Copied">
	//   11   24:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   13   30:astore_1        
		return (new StringBuilder()).append(((Object) (getRef()))).append(s).toString();
	//   14   31:new             #33  <Class StringBuilder>
	//   15   34:dup             
	//   16   35:invokespecial   #34  <Method void StringBuilder()>
	//   17   38:aload_0         
	//   18   39:invokevirtual   #44  <Method PdfIndirectReference getRef()>
	//   19   42:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
	//   20   45:aload_1         
	//   21   46:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   22   49:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   23   52:areturn         
	}

	boolean hasCopied;
	PdfIndirectReference theRef;

	PdfCopy$IndirectReferences(PdfIndirectReference pdfindirectreference)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		theRef = pdfindirectreference;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field PdfIndirectReference theRef>
		hasCopied = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #20  <Field boolean hasCopied>
	//    8   14:return          
	}
}
