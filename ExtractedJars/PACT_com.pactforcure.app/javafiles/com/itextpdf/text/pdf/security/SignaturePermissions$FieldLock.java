// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.pdf.PdfArray;
import com.itextpdf.text.pdf.PdfName;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			SignaturePermissions

public class SignaturePermissions$FieldLock
{

	public PdfName getAction()
	{
		return action;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field PdfName action>
	//    2    4:areturn         
	}

	public PdfArray getFields()
	{
		return fields;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfArray fields>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = (new StringBuilder()).append(action.toString());
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field PdfName action>
	//    5   11:invokevirtual   #38  <Method String PdfName.toString()>
	//    6   14:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:astore_2        
		String s;
		if(fields == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #24  <Field PdfArray fields>
	//*  10   22:ifnonnull       37
			s = "";
	//   11   25:ldc1            #44  <String "">
	//   12   27:astore_1        
		else
	//*  13   28:aload_2         
	//*  14   29:aload_1         
	//*  15   30:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*  16   33:invokevirtual   #45  <Method String StringBuilder.toString()>
	//*  17   36:areturn         
			s = fields.toString();
	//   18   37:aload_0         
	//   19   38:getfield        #24  <Field PdfArray fields>
	//   20   41:invokevirtual   #48  <Method String PdfArray.toString()>
	//   21   44:astore_1        
		return stringbuilder.append(s).toString();
	//*  22   45:goto            28
	}

	PdfName action;
	PdfArray fields;
	final SignaturePermissions this$0;

	public SignaturePermissions$FieldLock(PdfName pdfname, PdfArray pdfarray)
	{
		this$0 = SignaturePermissions.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SignaturePermissions this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		action = pdfname;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field PdfName action>
		fields = pdfarray;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field PdfArray fields>
	//   11   19:return          
	}
}
