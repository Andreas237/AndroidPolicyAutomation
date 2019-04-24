// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.PdfTemplate;
import java.net.URL;

// Referenced classes of package com.itextpdf.text:
//			Image, BadElementException

public class ImgTemplate extends Image
{

	ImgTemplate(Image image)
	{
		super(image);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void Image(Image)>
	//    3    5:return          
	}

	public ImgTemplate(PdfTemplate pdftemplate)
		throws BadElementException
	{
		super((URL)null);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #14  <Class URL>
	//    3    5:invokespecial   #17  <Method void Image(URL)>
		if(pdftemplate == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       29
			throw new BadElementException(MessageLocalization.getComposedMessage("the.template.can.not.be.null", new Object[0]));
	//    6   12:new             #12  <Class BadElementException>
	//    7   15:dup             
	//    8   16:ldc1            #19  <String "the.template.can.not.be.null">
	//    9   18:iconst_0        
	//   10   19:anewarray       Object[]
	//   11   22:invokestatic    #27  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   12   25:invokespecial   #30  <Method void BadElementException(String)>
	//   13   28:athrow          
		if(pdftemplate.getType() == 3)
	//*  14   29:aload_1         
	//*  15   30:invokevirtual   #36  <Method int PdfTemplate.getType()>
	//*  16   33:iconst_3        
	//*  17   34:icmpne          54
		{
			throw new BadElementException(MessageLocalization.getComposedMessage("a.pattern.can.not.be.used.as.a.template.to.create.an.image", new Object[0]));
	//   18   37:new             #12  <Class BadElementException>
	//   19   40:dup             
	//   20   41:ldc1            #38  <String "a.pattern.can.not.be.used.as.a.template.to.create.an.image">
	//   21   43:iconst_0        
	//   22   44:anewarray       Object[]
	//   23   47:invokestatic    #27  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   24   50:invokespecial   #30  <Method void BadElementException(String)>
	//   25   53:athrow          
		} else
		{
			type = 35;
	//   26   54:aload_0         
	//   27   55:bipush          35
	//   28   57:putfield        #42  <Field int type>
			scaledHeight = pdftemplate.getHeight();
	//   29   60:aload_0         
	//   30   61:aload_1         
	//   31   62:invokevirtual   #46  <Method float PdfTemplate.getHeight()>
	//   32   65:putfield        #50  <Field float scaledHeight>
			setTop(scaledHeight);
	//   33   68:aload_0         
	//   34   69:aload_0         
	//   35   70:getfield        #50  <Field float scaledHeight>
	//   36   73:invokevirtual   #54  <Method void setTop(float)>
			scaledWidth = pdftemplate.getWidth();
	//   37   76:aload_0         
	//   38   77:aload_1         
	//   39   78:invokevirtual   #57  <Method float PdfTemplate.getWidth()>
	//   40   81:putfield        #60  <Field float scaledWidth>
			setRight(scaledWidth);
	//   41   84:aload_0         
	//   42   85:aload_0         
	//   43   86:getfield        #60  <Field float scaledWidth>
	//   44   89:invokevirtual   #63  <Method void setRight(float)>
			setTemplateData(pdftemplate);
	//   45   92:aload_0         
	//   46   93:aload_1         
	//   47   94:invokevirtual   #66  <Method void setTemplateData(PdfTemplate)>
			plainWidth = getWidth();
	//   48   97:aload_0         
	//   49   98:aload_0         
	//   50   99:invokevirtual   #67  <Method float getWidth()>
	//   51  102:putfield        #70  <Field float plainWidth>
			plainHeight = getHeight();
	//   52  105:aload_0         
	//   53  106:aload_0         
	//   54  107:invokevirtual   #71  <Method float getHeight()>
	//   55  110:putfield        #74  <Field float plainHeight>
			return;
	//   56  113:return          
		}
	}
}
