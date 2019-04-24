// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfObject

public class PdfNull extends PdfObject
{

	public PdfNull()
	{
		super(8, "null");
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:ldc1            #8   <String "null">
	//    3    5:invokespecial   #21  <Method void PdfObject(int, String)>
	//    4    8:return          
	}

	public String toString()
	{
		return "null";
	//    0    0:ldc1            #8   <String "null">
	//    1    2:areturn         
	}

	private static final String CONTENT = "null";
	public static final PdfNull PDFNULL = new PdfNull();

	static 
	{
	//    0    0:new             #2   <Class PdfNull>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void PdfNull()>
	//    3    7:putstatic       #17  <Field PdfNull PDFNULL>
	//*   4   10:return          
	}
}
