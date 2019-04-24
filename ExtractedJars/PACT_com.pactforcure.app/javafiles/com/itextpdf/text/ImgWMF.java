// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.codec.wmf.InputMeta;
import com.itextpdf.text.pdf.codec.wmf.MetaDo;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.itextpdf.text:
//			Image, BadElementException, Utilities, DocumentException

public class ImgWMF extends Image
{

	ImgWMF(Image image)
	{
		super(image);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void Image(Image)>
	//    3    5:return          
	}

	public ImgWMF(String s)
		throws BadElementException, MalformedURLException, IOException
	{
		this(Utilities.toURL(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #22  <Method URL Utilities.toURL(String)>
	//    3    5:invokespecial   #25  <Method void ImgWMF(URL)>
	//    4    8:return          
	}

	public ImgWMF(URL url)
		throws BadElementException, IOException
	{
		super(url);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void Image(URL)>
		processParameters();
	//    3    5:aload_0         
	//    4    6:invokespecial   #31  <Method void processParameters()>
	//    5    9:return          
	}

	public ImgWMF(byte abyte0[])
		throws BadElementException, IOException
	{
		super((URL)null);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #34  <Class URL>
	//    3    5:invokespecial   #27  <Method void Image(URL)>
		rawData = abyte0;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #38  <Field byte[] rawData>
		originalData = abyte0;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #41  <Field byte[] originalData>
		processParameters();
	//   10   18:aload_0         
	//   11   19:invokespecial   #31  <Method void processParameters()>
	//   12   22:return          
	}

	private void processParameters()
		throws BadElementException, IOException
	{
		Object obj;
		Object obj1;
		type = 35;
	//    0    0:aload_0         
	//    1    1:bipush          35
	//    2    3:putfield        #45  <Field int type>
		originalType = 6;
	//    3    6:aload_0         
	//    4    7:bipush          6
	//    5    9:putfield        #48  <Field int originalType>
		obj1 = null;
	//    6   12:aconst_null     
	//    7   13:astore          7
		obj = obj1;
	//    8   15:aload           7
	//    9   17:astore          6
		if(rawData != null) goto _L2; else goto _L1
	//   10   19:aload_0         
	//   11   20:getfield        #38  <Field byte[] rawData>
	//   12   23:ifnonnull       138
_L1:
		obj = obj1;
	//   13   26:aload           7
	//   14   28:astore          6
		obj1 = ((Object) (url.openStream()));
	//   15   30:aload_0         
	//   16   31:getfield        #52  <Field URL url>
	//   17   34:invokevirtual   #56  <Method InputStream URL.openStream()>
	//   18   37:astore          7
		obj = obj1;
	//   19   39:aload           7
	//   20   41:astore          6
		String s = url.toString();
	//   21   43:aload_0         
	//   22   44:getfield        #52  <Field URL url>
	//   23   47:invokevirtual   #60  <Method String URL.toString()>
	//   24   50:astore          8
_L4:
		obj = obj1;
	//   25   52:aload           7
	//   26   54:astore          6
		InputMeta inputmeta = new InputMeta(((InputStream) (obj1)));
	//   27   56:new             #62  <Class InputMeta>
	//   28   59:dup             
	//   29   60:aload           7
	//   30   62:invokespecial   #65  <Method void InputMeta(InputStream)>
	//   31   65:astore          9
		obj = obj1;
	//   32   67:aload           7
	//   33   69:astore          6
		if(inputmeta.readInt() == 0x9ac6cdd7)
			break; /* Loop/switch isn't completed */
	//   34   71:aload           9
	//   35   73:invokevirtual   #69  <Method int InputMeta.readInt()>
	//   36   76:ldc1            #70  <Int 0x9ac6cdd7>
	//   37   78:icmpeq          162
		obj = obj1;
	//   38   81:aload           7
	//   39   83:astore          6
		throw new BadElementException(MessageLocalization.getComposedMessage("1.is.not.a.valid.placeable.windows.metafile", new Object[] {
			s
		}));
	//   40   85:new             #12  <Class BadElementException>
	//   41   88:dup             
	//   42   89:ldc1            #72  <String "1.is.not.a.valid.placeable.windows.metafile">
	//   43   91:iconst_1        
	//   44   92:anewarray       Object[]
	//   45   95:dup             
	//   46   96:iconst_0        
	//   47   97:aload           8
	//   48   99:aastore         
	//   49  100:invokestatic    #80  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   50  103:invokespecial   #82  <Method void BadElementException(String)>
	//   51  106:athrow          
		obj1;
	//   52  107:astore          7
		if(obj != null)
	//*  53  109:aload           6
	//*  54  111:ifnull          119
			((InputStream) (obj)).close();
	//   55  114:aload           6
	//   56  116:invokevirtual   #87  <Method void InputStream.close()>
		plainWidth = getWidth();
	//   57  119:aload_0         
	//   58  120:aload_0         
	//   59  121:invokevirtual   #91  <Method float getWidth()>
	//   60  124:putfield        #95  <Field float plainWidth>
		plainHeight = getHeight();
	//   61  127:aload_0         
	//   62  128:aload_0         
	//   63  129:invokevirtual   #98  <Method float getHeight()>
	//   64  132:putfield        #101 <Field float plainHeight>
		throw obj1;
	//   65  135:aload           7
	//   66  137:athrow          
_L2:
		obj = obj1;
	//   67  138:aload           7
	//   68  140:astore          6
		obj1 = ((Object) (new ByteArrayInputStream(rawData)));
	//   69  142:new             #103 <Class ByteArrayInputStream>
	//   70  145:dup             
	//   71  146:aload_0         
	//   72  147:getfield        #38  <Field byte[] rawData>
	//   73  150:invokespecial   #105 <Method void ByteArrayInputStream(byte[])>
	//   74  153:astore          7
		s = "Byte array";
	//   75  155:ldc1            #107 <String "Byte array">
	//   76  157:astore          8
		if(true) goto _L4; else goto _L3
	//   77  159:goto            52
_L3:
		obj = obj1;
	//   78  162:aload           7
	//   79  164:astore          6
		inputmeta.readWord();
	//   80  166:aload           9
	//   81  168:invokevirtual   #110 <Method int InputMeta.readWord()>
	//   82  171:pop             
		obj = obj1;
	//   83  172:aload           7
	//   84  174:astore          6
		int i = inputmeta.readShort();
	//   85  176:aload           9
	//   86  178:invokevirtual   #113 <Method int InputMeta.readShort()>
	//   87  181:istore_1        
		obj = obj1;
	//   88  182:aload           7
	//   89  184:astore          6
		int j = inputmeta.readShort();
	//   90  186:aload           9
	//   91  188:invokevirtual   #113 <Method int InputMeta.readShort()>
	//   92  191:istore_2        
		obj = obj1;
	//   93  192:aload           7
	//   94  194:astore          6
		int k = inputmeta.readShort();
	//   95  196:aload           9
	//   96  198:invokevirtual   #113 <Method int InputMeta.readShort()>
	//   97  201:istore_3        
		obj = obj1;
	//   98  202:aload           7
	//   99  204:astore          6
		int l = inputmeta.readShort();
	//  100  206:aload           9
	//  101  208:invokevirtual   #113 <Method int InputMeta.readShort()>
	//  102  211:istore          4
		obj = obj1;
	//  103  213:aload           7
	//  104  215:astore          6
		int i1 = inputmeta.readWord();
	//  105  217:aload           9
	//  106  219:invokevirtual   #110 <Method int InputMeta.readWord()>
	//  107  222:istore          5
		obj = obj1;
	//  108  224:aload           7
	//  109  226:astore          6
		dpiX = 72;
	//  110  228:aload_0         
	//  111  229:bipush          72
	//  112  231:putfield        #116 <Field int dpiX>
		obj = obj1;
	//  113  234:aload           7
	//  114  236:astore          6
		dpiY = 72;
	//  115  238:aload_0         
	//  116  239:bipush          72
	//  117  241:putfield        #119 <Field int dpiY>
		obj = obj1;
	//  118  244:aload           7
	//  119  246:astore          6
		scaledHeight = ((float)(l - j) / (float)i1) * 72F;
	//  120  248:aload_0         
	//  121  249:iload           4
	//  122  251:iload_2         
	//  123  252:isub            
	//  124  253:i2f             
	//  125  254:iload           5
	//  126  256:i2f             
	//  127  257:fdiv            
	//  128  258:ldc1            #120 <Float 72F>
	//  129  260:fmul            
	//  130  261:putfield        #123 <Field float scaledHeight>
		obj = obj1;
	//  131  264:aload           7
	//  132  266:astore          6
		setTop(scaledHeight);
	//  133  268:aload_0         
	//  134  269:aload_0         
	//  135  270:getfield        #123 <Field float scaledHeight>
	//  136  273:invokevirtual   #127 <Method void setTop(float)>
		obj = obj1;
	//  137  276:aload           7
	//  138  278:astore          6
		scaledWidth = ((float)(k - i) / (float)i1) * 72F;
	//  139  280:aload_0         
	//  140  281:iload_3         
	//  141  282:iload_1         
	//  142  283:isub            
	//  143  284:i2f             
	//  144  285:iload           5
	//  145  287:i2f             
	//  146  288:fdiv            
	//  147  289:ldc1            #120 <Float 72F>
	//  148  291:fmul            
	//  149  292:putfield        #130 <Field float scaledWidth>
		obj = obj1;
	//  150  295:aload           7
	//  151  297:astore          6
		setRight(scaledWidth);
	//  152  299:aload_0         
	//  153  300:aload_0         
	//  154  301:getfield        #130 <Field float scaledWidth>
	//  155  304:invokevirtual   #133 <Method void setRight(float)>
		if(obj1 != null)
	//* 156  307:aload           7
	//* 157  309:ifnull          317
			((InputStream) (obj1)).close();
	//  158  312:aload           7
	//  159  314:invokevirtual   #87  <Method void InputStream.close()>
		plainWidth = getWidth();
	//  160  317:aload_0         
	//  161  318:aload_0         
	//  162  319:invokevirtual   #91  <Method float getWidth()>
	//  163  322:putfield        #95  <Field float plainWidth>
		plainHeight = getHeight();
	//  164  325:aload_0         
	//  165  326:aload_0         
	//  166  327:invokevirtual   #98  <Method float getHeight()>
	//  167  330:putfield        #101 <Field float plainHeight>
		return;
	//  168  333:return          
	}

	public void readWMF(PdfTemplate pdftemplate)
		throws IOException, DocumentException
	{
		Object obj;
		Object obj1;
		setTemplateData(pdftemplate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #140 <Method void setTemplateData(PdfTemplate)>
		pdftemplate.setWidth(getWidth());
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #91  <Method float getWidth()>
	//    6   10:invokevirtual   #145 <Method void PdfTemplate.setWidth(float)>
		pdftemplate.setHeight(getHeight());
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #98  <Method float getHeight()>
	//   10   18:invokevirtual   #148 <Method void PdfTemplate.setHeight(float)>
		obj = null;
	//   11   21:aconst_null     
	//   12   22:astore_2        
		obj1 = obj;
	//   13   23:aload_2         
	//   14   24:astore_3        
		if(rawData != null) goto _L2; else goto _L1
	//   15   25:aload_0         
	//   16   26:getfield        #38  <Field byte[] rawData>
	//   17   29:ifnonnull       65
_L1:
		obj1 = obj;
	//   18   32:aload_2         
	//   19   33:astore_3        
		obj = ((Object) (url.openStream()));
	//   20   34:aload_0         
	//   21   35:getfield        #52  <Field URL url>
	//   22   38:invokevirtual   #56  <Method InputStream URL.openStream()>
	//   23   41:astore_2        
_L4:
		obj1 = obj;
	//   24   42:aload_2         
	//   25   43:astore_3        
		(new MetaDo(((InputStream) (obj)), ((com.itextpdf.text.pdf.PdfContentByte) (pdftemplate)))).readAll();
	//   26   44:new             #150 <Class MetaDo>
	//   27   47:dup             
	//   28   48:aload_2         
	//   29   49:aload_1         
	//   30   50:invokespecial   #153 <Method void MetaDo(InputStream, com.itextpdf.text.pdf.PdfContentByte)>
	//   31   53:invokevirtual   #156 <Method void MetaDo.readAll()>
		if(obj != null)
	//*  32   56:aload_2         
	//*  33   57:ifnull          64
			((InputStream) (obj)).close();
	//   34   60:aload_2         
	//   35   61:invokevirtual   #87  <Method void InputStream.close()>
		return;
	//   36   64:return          
_L2:
		obj1 = obj;
	//   37   65:aload_2         
	//   38   66:astore_3        
		obj = ((Object) (new ByteArrayInputStream(rawData)));
	//   39   67:new             #103 <Class ByteArrayInputStream>
	//   40   70:dup             
	//   41   71:aload_0         
	//   42   72:getfield        #38  <Field byte[] rawData>
	//   43   75:invokespecial   #105 <Method void ByteArrayInputStream(byte[])>
	//   44   78:astore_2        
		if(true) goto _L4; else goto _L3
	//   45   79:goto            42
_L3:
		pdftemplate;
	//   46   82:astore_1        
		if(obj1 != null)
	//*  47   83:aload_3         
	//*  48   84:ifnull          91
			((InputStream) (obj1)).close();
	//   49   87:aload_3         
	//   50   88:invokevirtual   #87  <Method void InputStream.close()>
		throw pdftemplate;
	//   51   91:aload_1         
	//   52   92:athrow          
	}
}
