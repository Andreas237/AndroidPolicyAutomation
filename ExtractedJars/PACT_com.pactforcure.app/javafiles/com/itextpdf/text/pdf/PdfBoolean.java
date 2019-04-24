// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfObject, BadPdfFormatException

public class PdfBoolean extends PdfObject
{

	public PdfBoolean(String s)
		throws BadPdfFormatException
	{
		super(1, s);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:invokespecial   #33  <Method void PdfObject(int, String)>
		if(s.equals("true"))
	//*   4    6:aload_1         
	//*   5    7:ldc1            #14  <String "true">
	//*   6    9:invokevirtual   #39  <Method boolean String.equals(Object)>
	//*   7   12:ifeq            21
		{
			value = true;
	//    8   15:aload_0         
	//    9   16:iconst_1        
	//   10   17:putfield        #41  <Field boolean value>
			return;
	//   11   20:return          
		}
		if(s.equals("false"))
	//*  12   21:aload_1         
	//*  13   22:ldc1            #8   <String "false">
	//*  14   24:invokevirtual   #39  <Method boolean String.equals(Object)>
	//*  15   27:ifeq            36
		{
			value = false;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #41  <Field boolean value>
			return;
	//   19   35:return          
		} else
		{
			throw new BadPdfFormatException(MessageLocalization.getComposedMessage("the.value.has.to.be.true.of.false.instead.of.1", new Object[] {
				s
			}));
	//   20   36:new             #30  <Class BadPdfFormatException>
	//   21   39:dup             
	//   22   40:ldc1            #43  <String "the.value.has.to.be.true.of.false.instead.of.1">
	//   23   42:iconst_1        
	//   24   43:anewarray       Object[]
	//   25   46:dup             
	//   26   47:iconst_0        
	//   27   48:aload_1         
	//   28   49:aastore         
	//   29   50:invokestatic    #51  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   30   53:invokespecial   #53  <Method void BadPdfFormatException(String)>
	//   31   56:athrow          
		}
	}

	public PdfBoolean(boolean flag)
	{
		super(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #57  <Method void PdfObject(int)>
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            21
			setContent("true");
	//    5    9:aload_0         
	//    6   10:ldc1            #14  <String "true">
	//    7   12:invokevirtual   #60  <Method void setContent(String)>
		else
	//*   8   15:aload_0         
	//*   9   16:iload_1         
	//*  10   17:putfield        #41  <Field boolean value>
	//*  11   20:return          
			setContent("false");
	//   12   21:aload_0         
	//   13   22:ldc1            #8   <String "false">
	//   14   24:invokevirtual   #60  <Method void setContent(String)>
		value = flag;
	//*  15   27:goto            15
	}

	public boolean booleanValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field boolean value>
	//    2    4:ireturn         
	}

	public String toString()
	{
		if(value)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field boolean value>
	//*   2    4:ifeq            10
			return "true";
	//    3    7:ldc1            #14  <String "true">
	//    4    9:areturn         
		else
			return "false";
	//    5   10:ldc1            #8   <String "false">
	//    6   12:areturn         
	}

	public static final String FALSE = "false";
	public static final PdfBoolean PDFFALSE = new PdfBoolean(false);
	public static final PdfBoolean PDFTRUE = new PdfBoolean(true);
	public static final String TRUE = "true";
	private boolean value;

	static 
	{
	//    0    0:new             #2   <Class PdfBoolean>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #22  <Method void PdfBoolean(boolean)>
	//    4    8:putstatic       #24  <Field PdfBoolean PDFTRUE>
	//    5   11:new             #2   <Class PdfBoolean>
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:invokespecial   #22  <Method void PdfBoolean(boolean)>
	//    9   19:putstatic       #26  <Field PdfBoolean PDFFALSE>
	//*  10   22:return          
	}
}
