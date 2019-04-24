// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Rectangle;

// Referenced classes of package com.itextpdf.text.pdf:
//			Barcode, BaseFont, PdfContentByte

public class BarcodeEANSUPP extends Barcode
{

	public BarcodeEANSUPP(Barcode barcode, Barcode barcode1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Barcode()>
		n = 8F;
	//    2    4:aload_0         
	//    3    5:ldc1            #13  <Float 8F>
	//    4    7:putfield        #17  <Field float n>
		ean = barcode;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #19  <Field Barcode ean>
		supp = barcode1;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #21  <Field Barcode supp>
	//   11   20:return          
	}

	public Rectangle getBarcodeSize()
	{
		Rectangle rectangle = ean.getBarcodeSize();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Barcode ean>
	//    2    4:invokevirtual   #26  <Method Rectangle Barcode.getBarcodeSize()>
	//    3    7:astore_1        
		rectangle.setRight(rectangle.getWidth() + supp.getBarcodeSize().getWidth() + n);
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #32  <Method float Rectangle.getWidth()>
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field Barcode supp>
	//    9   17:invokevirtual   #26  <Method Rectangle Barcode.getBarcodeSize()>
	//   10   20:invokevirtual   #32  <Method float Rectangle.getWidth()>
	//   11   23:fadd            
	//   12   24:aload_0         
	//   13   25:getfield        #17  <Field float n>
	//   14   28:fadd            
	//   15   29:invokevirtual   #36  <Method void Rectangle.setRight(float)>
		return rectangle;
	//   16   32:aload_1         
	//   17   33:areturn         
	}

	public Rectangle placeBarcode(PdfContentByte pdfcontentbyte, BaseColor basecolor, BaseColor basecolor1)
	{
		Rectangle rectangle;
		if(supp.getFont() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Barcode supp>
	//*   2    4:invokevirtual   #42  <Method BaseFont Barcode.getFont()>
	//*   3    7:ifnull          134
			supp.setBarHeight((ean.getBarHeight() + supp.getBaseline()) - supp.getFont().getFontDescriptor(2, supp.getSize()));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Barcode supp>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field Barcode ean>
	//    8   18:invokevirtual   #45  <Method float Barcode.getBarHeight()>
	//    9   21:aload_0         
	//   10   22:getfield        #21  <Field Barcode supp>
	//   11   25:invokevirtual   #48  <Method float Barcode.getBaseline()>
	//   12   28:fadd            
	//   13   29:aload_0         
	//   14   30:getfield        #21  <Field Barcode supp>
	//   15   33:invokevirtual   #42  <Method BaseFont Barcode.getFont()>
	//   16   36:iconst_2        
	//   17   37:aload_0         
	//   18   38:getfield        #21  <Field Barcode supp>
	//   19   41:invokevirtual   #51  <Method float Barcode.getSize()>
	//   20   44:invokevirtual   #57  <Method float BaseFont.getFontDescriptor(int, float)>
	//   21   47:fsub            
	//   22   48:invokevirtual   #60  <Method void Barcode.setBarHeight(float)>
		else
	//*  23   51:aload_0         
	//*  24   52:getfield        #19  <Field Barcode ean>
	//*  25   55:invokevirtual   #26  <Method Rectangle Barcode.getBarcodeSize()>
	//*  26   58:astore          4
	//*  27   60:aload_1         
	//*  28   61:invokevirtual   #65  <Method void PdfContentByte.saveState()>
	//*  29   64:aload_0         
	//*  30   65:getfield        #19  <Field Barcode ean>
	//*  31   68:aload_1         
	//*  32   69:aload_2         
	//*  33   70:aload_3         
	//*  34   71:invokevirtual   #67  <Method Rectangle Barcode.placeBarcode(PdfContentByte, BaseColor, BaseColor)>
	//*  35   74:pop             
	//*  36   75:aload_1         
	//*  37   76:invokevirtual   #70  <Method void PdfContentByte.restoreState()>
	//*  38   79:aload_1         
	//*  39   80:invokevirtual   #65  <Method void PdfContentByte.saveState()>
	//*  40   83:aload_1         
	//*  41   84:fconst_1        
	//*  42   85:fconst_0        
	//*  43   86:fconst_0        
	//*  44   87:fconst_1        
	//*  45   88:aload           4
	//*  46   90:invokevirtual   #32  <Method float Rectangle.getWidth()>
	//*  47   93:aload_0         
	//*  48   94:getfield        #17  <Field float n>
	//*  49   97:fadd            
	//*  50   98:aload           4
	//*  51  100:invokevirtual   #73  <Method float Rectangle.getHeight()>
	//*  52  103:aload_0         
	//*  53  104:getfield        #19  <Field Barcode ean>
	//*  54  107:invokevirtual   #45  <Method float Barcode.getBarHeight()>
	//*  55  110:fsub            
	//*  56  111:invokevirtual   #77  <Method void PdfContentByte.concatCTM(float, float, float, float, float, float)>
	//*  57  114:aload_0         
	//*  58  115:getfield        #21  <Field Barcode supp>
	//*  59  118:aload_1         
	//*  60  119:aload_2         
	//*  61  120:aload_3         
	//*  62  121:invokevirtual   #67  <Method Rectangle Barcode.placeBarcode(PdfContentByte, BaseColor, BaseColor)>
	//*  63  124:pop             
	//*  64  125:aload_1         
	//*  65  126:invokevirtual   #70  <Method void PdfContentByte.restoreState()>
	//*  66  129:aload_0         
	//*  67  130:invokevirtual   #78  <Method Rectangle getBarcodeSize()>
	//*  68  133:areturn         
			supp.setBarHeight(ean.getBarHeight());
	//   69  134:aload_0         
	//   70  135:getfield        #21  <Field Barcode supp>
	//   71  138:aload_0         
	//   72  139:getfield        #19  <Field Barcode ean>
	//   73  142:invokevirtual   #45  <Method float Barcode.getBarHeight()>
	//   74  145:invokevirtual   #60  <Method void Barcode.setBarHeight(float)>
		rectangle = ean.getBarcodeSize();
		pdfcontentbyte.saveState();
		ean.placeBarcode(pdfcontentbyte, basecolor, basecolor1);
		pdfcontentbyte.restoreState();
		pdfcontentbyte.saveState();
		pdfcontentbyte.concatCTM(1.0F, 0.0F, 0.0F, 1.0F, rectangle.getWidth() + n, rectangle.getHeight() - ean.getBarHeight());
		supp.placeBarcode(pdfcontentbyte, basecolor, basecolor1);
		pdfcontentbyte.restoreState();
		return getBarcodeSize();
	//*  75  148:goto            51
	}

	protected Barcode ean;
	protected Barcode supp;
}
