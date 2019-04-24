// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfArray, PdfName, PdfLayer, PdfObject

public class PdfVisibilityExpression extends PdfArray
{

	public PdfVisibilityExpression(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfArray()>
		switch(i)
	//*   2    4:iload_1         
		{
	//*   3    5:tableswitch     -1 1: default 32
	//	               -1 67
	//	               0 49
	//	               1 58
		default:
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("illegal.ve.value", new Object[0]));
	//    4   32:new             #18  <Class IllegalArgumentException>
	//    5   35:dup             
	//    6   36:ldc1            #20  <String "illegal.ve.value">
	//    7   38:iconst_0        
	//    8   39:anewarray       Object[]
	//    9   42:invokestatic    #28  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   45:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   11   48:athrow          

		case 0: // '\0'
			super.add(((PdfObject) (PdfName.OR)));
	//   12   49:aload_0         
	//   13   50:getstatic       #36  <Field PdfName PdfName.OR>
	//   14   53:invokespecial   #40  <Method boolean PdfArray.add(PdfObject)>
	//   15   56:pop             
			return;
	//   16   57:return          

		case 1: // '\001'
			super.add(((PdfObject) (PdfName.AND)));
	//   17   58:aload_0         
	//   18   59:getstatic       #42  <Field PdfName PdfName.AND>
	//   19   62:invokespecial   #40  <Method boolean PdfArray.add(PdfObject)>
	//   20   65:pop             
			return;
	//   21   66:return          

		case -1: 
			super.add(((PdfObject) (PdfName.NOT)));
	//   22   67:aload_0         
	//   23   68:getstatic       #44  <Field PdfName PdfName.NOT>
	//   24   71:invokespecial   #40  <Method boolean PdfArray.add(PdfObject)>
	//   25   74:pop             
			return;
	//   26   75:return          
		}
	}

	public void add(int i, PdfObject pdfobject)
	{
		throw new IllegalArgumentException(MessageLocalization.getComposedMessage("illegal.ve.value", new Object[0]));
	//    0    0:new             #18  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "illegal.ve.value">
	//    3    6:iconst_0        
	//    4    7:anewarray       Object[]
	//    5   10:invokestatic    #28  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   13:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
	}

	public boolean add(PdfObject pdfobject)
	{
		if(pdfobject instanceof PdfLayer)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #48  <Class PdfLayer>
	//*   2    4:ifeq            19
			return super.add(((PdfObject) (((PdfLayer)pdfobject).getRef())));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #48  <Class PdfLayer>
	//    6   12:invokevirtual   #52  <Method PdfIndirectReference PdfLayer.getRef()>
	//    7   15:invokespecial   #40  <Method boolean PdfArray.add(PdfObject)>
	//    8   18:ireturn         
		if(pdfobject instanceof PdfVisibilityExpression)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #2   <Class PdfVisibilityExpression>
	//*  11   23:ifeq            32
			return super.add(pdfobject);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokespecial   #40  <Method boolean PdfArray.add(PdfObject)>
	//   15   31:ireturn         
		else
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("illegal.ve.value", new Object[0]));
	//   16   32:new             #18  <Class IllegalArgumentException>
	//   17   35:dup             
	//   18   36:ldc1            #20  <String "illegal.ve.value">
	//   19   38:iconst_0        
	//   20   39:anewarray       Object[]
	//   21   42:invokestatic    #28  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   22   45:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   23   48:athrow          
	}

	public boolean add(float af[])
	{
		throw new IllegalArgumentException(MessageLocalization.getComposedMessage("illegal.ve.value", new Object[0]));
	//    0    0:new             #18  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "illegal.ve.value">
	//    3    6:iconst_0        
	//    4    7:anewarray       Object[]
	//    5   10:invokestatic    #28  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   13:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
	}

	public boolean add(int ai[])
	{
		throw new IllegalArgumentException(MessageLocalization.getComposedMessage("illegal.ve.value", new Object[0]));
	//    0    0:new             #18  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "illegal.ve.value">
	//    3    6:iconst_0        
	//    4    7:anewarray       Object[]
	//    5   10:invokestatic    #28  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   13:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
	}

	public void addFirst(PdfObject pdfobject)
	{
		throw new IllegalArgumentException(MessageLocalization.getComposedMessage("illegal.ve.value", new Object[0]));
	//    0    0:new             #18  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "illegal.ve.value">
	//    3    6:iconst_0        
	//    4    7:anewarray       Object[]
	//    5   10:invokestatic    #28  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   13:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
	}

	public static final int AND = 1;
	public static final int NOT = -1;
	public static final int OR = 0;
}
