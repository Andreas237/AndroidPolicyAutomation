// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfName, PdfNumber, PdfRectangle, 
//			PdfObject, PdfIndirectReference

public class PdfPage extends PdfDictionary
{

	PdfPage(PdfRectangle pdfrectangle, HashMap hashmap, PdfDictionary pdfdictionary)
		throws DocumentException
	{
		this(pdfrectangle, hashmap, pdfdictionary, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #67  <Method void PdfPage(PdfRectangle, HashMap, PdfDictionary, int)>
	//    6    8:return          
	}

	PdfPage(PdfRectangle pdfrectangle, HashMap hashmap, PdfDictionary pdfdictionary, int i)
		throws DocumentException
	{
		super(PAGE);
	//    0    0:aload_0         
	//    1    1:getstatic       #73  <Field PdfName PAGE>
	//    2    4:invokespecial   #76  <Method void PdfDictionary(PdfName)>
		mediaBox = pdfrectangle;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #78  <Field PdfRectangle mediaBox>
		if(pdfrectangle != null && (pdfrectangle.width() > 14400F || pdfrectangle.height() > 14400F))
	//*   6   12:aload_1         
	//*   7   13:ifnull          73
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #84  <Method float PdfRectangle.width()>
	//*  10   20:ldc1            #85  <Float 14400F>
	//*  11   22:fcmpl           
	//*  12   23:ifgt            36
	//*  13   26:aload_1         
	//*  14   27:invokevirtual   #88  <Method float PdfRectangle.height()>
	//*  15   30:ldc1            #85  <Float 14400F>
	//*  16   32:fcmpl           
	//*  17   33:ifle            73
			throw new DocumentException(MessageLocalization.getComposedMessage("the.page.size.must.be.smaller.than.14400.by.14400.its.1.by.2", new Object[] {
				Float.valueOf(pdfrectangle.width()), Float.valueOf(pdfrectangle.height())
			}));
	//   18   36:new             #64  <Class DocumentException>
	//   19   39:dup             
	//   20   40:ldc1            #90  <String "the.page.size.must.be.smaller.than.14400.by.14400.its.1.by.2">
	//   21   42:iconst_2        
	//   22   43:anewarray       Object[]
	//   23   46:dup             
	//   24   47:iconst_0        
	//   25   48:aload_1         
	//   26   49:invokevirtual   #84  <Method float PdfRectangle.width()>
	//   27   52:invokestatic    #98  <Method Float Float.valueOf(float)>
	//   28   55:aastore         
	//   29   56:dup             
	//   30   57:iconst_1        
	//   31   58:aload_1         
	//   32   59:invokevirtual   #88  <Method float PdfRectangle.height()>
	//   33   62:invokestatic    #98  <Method Float Float.valueOf(float)>
	//   34   65:aastore         
	//   35   66:invokestatic    #104 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   36   69:invokespecial   #107 <Method void DocumentException(String)>
	//   37   72:athrow          
		put(PdfName.MEDIABOX, ((PdfObject) (pdfrectangle)));
	//   38   73:aload_0         
	//   39   74:getstatic       #110 <Field PdfName PdfName.MEDIABOX>
	//   40   77:aload_1         
	//   41   78:invokevirtual   #114 <Method void put(PdfName, PdfObject)>
		put(PdfName.RESOURCES, ((PdfObject) (pdfdictionary)));
	//   42   81:aload_0         
	//   43   82:getstatic       #117 <Field PdfName PdfName.RESOURCES>
	//   44   85:aload_3         
	//   45   86:invokevirtual   #114 <Method void put(PdfName, PdfObject)>
		if(i != 0)
	//*  46   89:iload           4
	//*  47   91:ifeq            110
			put(PdfName.ROTATE, ((PdfObject) (new PdfNumber(i))));
	//   48   94:aload_0         
	//   49   95:getstatic       #120 <Field PdfName PdfName.ROTATE>
	//   50   98:new             #48  <Class PdfNumber>
	//   51  101:dup             
	//   52  102:iload           4
	//   53  104:invokespecial   #52  <Method void PdfNumber(int)>
	//   54  107:invokevirtual   #114 <Method void put(PdfName, PdfObject)>
		for(i = 0; i < boxStrings.length; i++)
	//*  55  110:iconst_0        
	//*  56  111:istore          4
	//*  57  113:iload           4
	//*  58  115:getstatic       #29  <Field String[] boxStrings>
	//*  59  118:arraylength     
	//*  60  119:icmpge          160
		{
			pdfrectangle = ((PdfRectangle) ((PdfObject)hashmap.get(((Object) (boxStrings[i])))));
	//   61  122:aload_2         
	//   62  123:getstatic       #29  <Field String[] boxStrings>
	//   63  126:iload           4
	//   64  128:aaload          
	//   65  129:invokevirtual   #126 <Method Object HashMap.get(Object)>
	//   66  132:checkcast       #128 <Class PdfObject>
	//   67  135:astore_1        
			if(pdfrectangle != null)
	//*  68  136:aload_1         
	//*  69  137:ifnull          151
				put(boxNames[i], ((PdfObject) (pdfrectangle)));
	//   70  140:aload_0         
	//   71  141:getstatic       #46  <Field PdfName[] boxNames>
	//   72  144:iload           4
	//   73  146:aaload          
	//   74  147:aload_1         
	//   75  148:invokevirtual   #114 <Method void put(PdfName, PdfObject)>
		}

	//   76  151:iload           4
	//   77  153:iconst_1        
	//   78  154:iadd            
	//   79  155:istore          4
	//*  80  157:goto            113
	//   81  160:return          
	}

	void add(PdfIndirectReference pdfindirectreference)
	{
		put(PdfName.CONTENTS, ((PdfObject) (pdfindirectreference)));
	//    0    0:aload_0         
	//    1    1:getstatic       #134 <Field PdfName PdfName.CONTENTS>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #114 <Method void put(PdfName, PdfObject)>
	//    4    8:return          
	}

	PdfRectangle getMediaBox()
	{
		return mediaBox;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field PdfRectangle mediaBox>
	//    2    4:areturn         
	}

	public boolean isParent()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	PdfRectangle rotateMediaBox()
	{
		mediaBox = mediaBox.rotate();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #78  <Field PdfRectangle mediaBox>
	//    3    5:invokevirtual   #142 <Method PdfRectangle PdfRectangle.rotate()>
	//    4    8:putfield        #78  <Field PdfRectangle mediaBox>
		put(PdfName.MEDIABOX, ((PdfObject) (mediaBox)));
	//    5   11:aload_0         
	//    6   12:getstatic       #110 <Field PdfName PdfName.MEDIABOX>
	//    7   15:aload_0         
	//    8   16:getfield        #78  <Field PdfRectangle mediaBox>
	//    9   19:invokevirtual   #114 <Method void put(PdfName, PdfObject)>
		return mediaBox;
	//   10   22:aload_0         
	//   11   23:getfield        #78  <Field PdfRectangle mediaBox>
	//   12   26:areturn         
	}

	public static final PdfNumber INVERTEDPORTRAIT = new PdfNumber(180);
	public static final PdfNumber LANDSCAPE = new PdfNumber(90);
	public static final PdfNumber PORTRAIT = new PdfNumber(0);
	public static final PdfNumber SEASCAPE = new PdfNumber(270);
	private static final PdfName boxNames[];
	private static final String boxStrings[] = {
		"crop", "trim", "art", "bleed"
	};
	PdfRectangle mediaBox;

	static 
	{
	//    0    0:iconst_4        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #21  <String "crop">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #23  <String "trim">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #25  <String "art">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #27  <String "bleed">
	//   17   23:aastore         
	//   18   24:putstatic       #29  <Field String[] boxStrings>
		boxNames = (new PdfName[] {
			PdfName.CROPBOX, PdfName.TRIMBOX, PdfName.ARTBOX, PdfName.BLEEDBOX
		});
	//   19   27:iconst_4        
	//   20   28:anewarray       PdfName[]
	//   21   31:dup             
	//   22   32:iconst_0        
	//   23   33:getstatic       #35  <Field PdfName PdfName.CROPBOX>
	//   24   36:aastore         
	//   25   37:dup             
	//   26   38:iconst_1        
	//   27   39:getstatic       #38  <Field PdfName PdfName.TRIMBOX>
	//   28   42:aastore         
	//   29   43:dup             
	//   30   44:iconst_2        
	//   31   45:getstatic       #41  <Field PdfName PdfName.ARTBOX>
	//   32   48:aastore         
	//   33   49:dup             
	//   34   50:iconst_3        
	//   35   51:getstatic       #44  <Field PdfName PdfName.BLEEDBOX>
	//   36   54:aastore         
	//   37   55:putstatic       #46  <Field PdfName[] boxNames>
	//   38   58:new             #48  <Class PdfNumber>
	//   39   61:dup             
	//   40   62:iconst_0        
	//   41   63:invokespecial   #52  <Method void PdfNumber(int)>
	//   42   66:putstatic       #54  <Field PdfNumber PORTRAIT>
	//   43   69:new             #48  <Class PdfNumber>
	//   44   72:dup             
	//   45   73:bipush          90
	//   46   75:invokespecial   #52  <Method void PdfNumber(int)>
	//   47   78:putstatic       #56  <Field PdfNumber LANDSCAPE>
	//   48   81:new             #48  <Class PdfNumber>
	//   49   84:dup             
	//   50   85:sipush          180
	//   51   88:invokespecial   #52  <Method void PdfNumber(int)>
	//   52   91:putstatic       #58  <Field PdfNumber INVERTEDPORTRAIT>
	//   53   94:new             #48  <Class PdfNumber>
	//   54   97:dup             
	//   55   98:sipush          270
	//   56  101:invokespecial   #52  <Method void PdfNumber(int)>
	//   57  104:putstatic       #60  <Field PdfNumber SEASCAPE>
	//*  58  107:return          
	}
}
