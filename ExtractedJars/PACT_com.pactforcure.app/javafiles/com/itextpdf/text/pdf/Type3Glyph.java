// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.error_messages.MessageLocalization;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfContentByte, ByteBuffer, PageResources, PdfWriter

public final class Type3Glyph extends PdfContentByte
{

	private Type3Glyph()
	{
		super(((PdfWriter) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #13  <Method void PdfContentByte(PdfWriter)>
	//    3    5:return          
	}

	Type3Glyph(PdfWriter pdfwriter, PageResources pageresources, float f, float f1, float f2, float f3, float f4, 
			boolean flag)
	{
		super(pdfwriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void PdfContentByte(PdfWriter)>
		pageResources = pageresources;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field PageResources pageResources>
		colorized = flag;
	//    6   10:aload_0         
	//    7   11:iload           8
	//    8   13:putfield        #19  <Field boolean colorized>
		if(flag)
	//*   9   16:iload           8
	//*  10   18:ifeq            36
		{
			content.append(f).append(" 0 d0\n");
	//   11   21:aload_0         
	//   12   22:getfield        #23  <Field ByteBuffer content>
	//   13   25:fload_3         
	//   14   26:invokevirtual   #29  <Method ByteBuffer ByteBuffer.append(float)>
	//   15   29:ldc1            #31  <String " 0 d0\n">
	//   16   31:invokevirtual   #34  <Method ByteBuffer ByteBuffer.append(String)>
	//   17   34:pop             
			return;
	//   18   35:return          
		} else
		{
			content.append(f).append(" 0 ").append(f1).append(' ').append(f2).append(' ').append(f3).append(' ').append(f4).append(" d1\n");
	//   19   36:aload_0         
	//   20   37:getfield        #23  <Field ByteBuffer content>
	//   21   40:fload_3         
	//   22   41:invokevirtual   #29  <Method ByteBuffer ByteBuffer.append(float)>
	//   23   44:ldc1            #36  <String " 0 ">
	//   24   46:invokevirtual   #34  <Method ByteBuffer ByteBuffer.append(String)>
	//   25   49:fload           4
	//   26   51:invokevirtual   #29  <Method ByteBuffer ByteBuffer.append(float)>
	//   27   54:bipush          32
	//   28   56:invokevirtual   #39  <Method ByteBuffer ByteBuffer.append(char)>
	//   29   59:fload           5
	//   30   61:invokevirtual   #29  <Method ByteBuffer ByteBuffer.append(float)>
	//   31   64:bipush          32
	//   32   66:invokevirtual   #39  <Method ByteBuffer ByteBuffer.append(char)>
	//   33   69:fload           6
	//   34   71:invokevirtual   #29  <Method ByteBuffer ByteBuffer.append(float)>
	//   35   74:bipush          32
	//   36   76:invokevirtual   #39  <Method ByteBuffer ByteBuffer.append(char)>
	//   37   79:fload           7
	//   38   81:invokevirtual   #29  <Method ByteBuffer ByteBuffer.append(float)>
	//   39   84:ldc1            #41  <String " d1\n">
	//   40   86:invokevirtual   #34  <Method ByteBuffer ByteBuffer.append(String)>
	//   41   89:pop             
			return;
	//   42   90:return          
		}
	}

	public void addImage(Image image, float f, float f1, float f2, float f3, float f4, float f5, 
			boolean flag)
		throws DocumentException
	{
		if(!colorized && (!image.isMask() || image.getBpc() != 1 && image.getBpc() <= 255))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field boolean colorized>
	//*   2    4:ifne            49
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #51  <Method boolean Image.isMask()>
	//*   5   11:ifeq            32
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #55  <Method int Image.getBpc()>
	//*   8   18:iconst_1        
	//*   9   19:icmpeq          49
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #55  <Method int Image.getBpc()>
	//*  12   26:sipush          255
	//*  13   29:icmpgt          49
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("not.colorized.typed3.fonts.only.accept.mask.images", new Object[0]));
	//   14   32:new             #45  <Class DocumentException>
	//   15   35:dup             
	//   16   36:ldc1            #57  <String "not.colorized.typed3.fonts.only.accept.mask.images">
	//   17   38:iconst_0        
	//   18   39:anewarray       Object[]
	//   19   42:invokestatic    #65  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   20   45:invokespecial   #68  <Method void DocumentException(String)>
	//   21   48:athrow          
		} else
		{
			super.addImage(image, f, f1, f2, f3, f4, f5, flag);
	//   22   49:aload_0         
	//   23   50:aload_1         
	//   24   51:fload_2         
	//   25   52:fload_3         
	//   26   53:fload           4
	//   27   55:fload           5
	//   28   57:fload           6
	//   29   59:fload           7
	//   30   61:iload           8
	//   31   63:invokespecial   #70  <Method void PdfContentByte.addImage(Image, float, float, float, float, float, float, boolean)>
			return;
	//   32   66:return          
		}
	}

	public PdfContentByte getDuplicate()
	{
		Type3Glyph type3glyph = new Type3Glyph();
	//    0    0:new             #2   <Class Type3Glyph>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void Type3Glyph()>
	//    3    7:astore_1        
		type3glyph.writer = writer;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #79  <Field PdfWriter writer>
	//    7   13:putfield        #79  <Field PdfWriter writer>
		type3glyph.pdf = pdf;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #83  <Field PdfDocument pdf>
	//   11   21:putfield        #83  <Field PdfDocument pdf>
		type3glyph.pageResources = pageResources;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #17  <Field PageResources pageResources>
	//   15   29:putfield        #17  <Field PageResources pageResources>
		type3glyph.colorized = colorized;
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #19  <Field boolean colorized>
	//   19   37:putfield        #19  <Field boolean colorized>
		return ((PdfContentByte) (type3glyph));
	//   20   40:aload_1         
	//   21   41:areturn         
	}

	PageResources getPageResources()
	{
		return pageResources;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PageResources pageResources>
	//    2    4:areturn         
	}

	private boolean colorized;
	private PageResources pageResources;
}
