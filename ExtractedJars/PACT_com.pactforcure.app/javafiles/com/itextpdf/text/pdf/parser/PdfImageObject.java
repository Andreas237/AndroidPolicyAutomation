// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.Version;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.exceptions.UnsupportedPdfException;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.codec.PngWriter;
import com.itextpdf.text.pdf.codec.TiffWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PdfImageObject
{
	public static final class ImageBytesType extends Enum
	{

		public static ImageBytesType valueOf(String s)
		{
			return (ImageBytesType)Enum.valueOf(com/itextpdf/text/pdf/parser/PdfImageObject$ImageBytesType, s);
		//    0    0:ldc1            #2   <Class PdfImageObject$ImageBytesType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #64  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PdfImageObject$ImageBytesType>
		//    4    9:areturn         
		}

		public static ImageBytesType[] values()
		{
			return (ImageBytesType[])((ImageBytesType []) ($VALUES)).clone();
		//    0    0:getstatic       #51  <Field PdfImageObject$ImageBytesType[] $VALUES>
		//    1    3:invokevirtual   #71  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.PdfImageObject$ImageBytesType_3B_.clone()>
		//    2    6:checkcast       #67  <Class PdfImageObject$ImageBytesType[]>
		//    3    9:areturn         
		}

		public String getFileExtension()
		{
			return fileExtension;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field String fileExtension>
		//    2    4:areturn         
		}

		private static final ImageBytesType $VALUES[];
		public static final ImageBytesType CCITT;
		public static final ImageBytesType JBIG2;
		public static final ImageBytesType JP2;
		public static final ImageBytesType JPG;
		public static final ImageBytesType PNG;
		private final String fileExtension;

		static 
		{
			PNG = new ImageBytesType("PNG", 0, "png");
		//    0    0:new             #2   <Class PdfImageObject$ImageBytesType>
		//    1    3:dup             
		//    2    4:ldc1            #21  <String "PNG">
		//    3    6:iconst_0        
		//    4    7:ldc1            #23  <String "png">
		//    5    9:invokespecial   #27  <Method void PdfImageObject$ImageBytesType(String, int, String)>
		//    6   12:putstatic       #29  <Field PdfImageObject$ImageBytesType PNG>
			JPG = new ImageBytesType("JPG", 1, "jpg");
		//    7   15:new             #2   <Class PdfImageObject$ImageBytesType>
		//    8   18:dup             
		//    9   19:ldc1            #30  <String "JPG">
		//   10   21:iconst_1        
		//   11   22:ldc1            #32  <String "jpg">
		//   12   24:invokespecial   #27  <Method void PdfImageObject$ImageBytesType(String, int, String)>
		//   13   27:putstatic       #34  <Field PdfImageObject$ImageBytesType JPG>
			JP2 = new ImageBytesType("JP2", 2, "jp2");
		//   14   30:new             #2   <Class PdfImageObject$ImageBytesType>
		//   15   33:dup             
		//   16   34:ldc1            #35  <String "JP2">
		//   17   36:iconst_2        
		//   18   37:ldc1            #37  <String "jp2">
		//   19   39:invokespecial   #27  <Method void PdfImageObject$ImageBytesType(String, int, String)>
		//   20   42:putstatic       #39  <Field PdfImageObject$ImageBytesType JP2>
			CCITT = new ImageBytesType("CCITT", 3, "tif");
		//   21   45:new             #2   <Class PdfImageObject$ImageBytesType>
		//   22   48:dup             
		//   23   49:ldc1            #40  <String "CCITT">
		//   24   51:iconst_3        
		//   25   52:ldc1            #42  <String "tif">
		//   26   54:invokespecial   #27  <Method void PdfImageObject$ImageBytesType(String, int, String)>
		//   27   57:putstatic       #44  <Field PdfImageObject$ImageBytesType CCITT>
			JBIG2 = new ImageBytesType("JBIG2", 4, "jbig2");
		//   28   60:new             #2   <Class PdfImageObject$ImageBytesType>
		//   29   63:dup             
		//   30   64:ldc1            #45  <String "JBIG2">
		//   31   66:iconst_4        
		//   32   67:ldc1            #47  <String "jbig2">
		//   33   69:invokespecial   #27  <Method void PdfImageObject$ImageBytesType(String, int, String)>
		//   34   72:putstatic       #49  <Field PdfImageObject$ImageBytesType JBIG2>
			$VALUES = (new ImageBytesType[] {
				PNG, JPG, JP2, CCITT, JBIG2
			});
		//   35   75:iconst_5        
		//   36   76:anewarray       ImageBytesType[]
		//   37   79:dup             
		//   38   80:iconst_0        
		//   39   81:getstatic       #29  <Field PdfImageObject$ImageBytesType PNG>
		//   40   84:aastore         
		//   41   85:dup             
		//   42   86:iconst_1        
		//   43   87:getstatic       #34  <Field PdfImageObject$ImageBytesType JPG>
		//   44   90:aastore         
		//   45   91:dup             
		//   46   92:iconst_2        
		//   47   93:getstatic       #39  <Field PdfImageObject$ImageBytesType JP2>
		//   48   96:aastore         
		//   49   97:dup             
		//   50   98:iconst_3        
		//   51   99:getstatic       #44  <Field PdfImageObject$ImageBytesType CCITT>
		//   52  102:aastore         
		//   53  103:dup             
		//   54  104:iconst_4        
		//   55  105:getstatic       #49  <Field PdfImageObject$ImageBytesType JBIG2>
		//   56  108:aastore         
		//   57  109:putstatic       #51  <Field PdfImageObject$ImageBytesType[] $VALUES>
		//*  58  112:return          
		}

		private ImageBytesType(String s, int i, String s1)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #55  <Method void Enum(String, int)>
			fileExtension = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #57  <Field String fileExtension>
		//    7   11:return          
		}
	}

	private static class TrackingFilter
		implements com.itextpdf.text.pdf.FilterHandlers.FilterHandler
	{

		public byte[] decode(byte abyte0[], PdfName pdfname, PdfObject pdfobject, PdfDictionary pdfdictionary)
			throws IOException
		{
			lastFilterName = pdfname;
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:putfield        #17  <Field PdfName lastFilterName>
			return abyte0;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

		public PdfName lastFilterName;

		private TrackingFilter()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			lastFilterName = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #17  <Field PdfName lastFilterName>
		//    5    9:return          
		}

	}


	public PdfImageObject(PRStream prstream)
		throws IOException
	{
		this(((PdfDictionary) (prstream)), PdfReader.getStreamBytesRaw(prstream), ((PdfDictionary) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokestatic    #38  <Method byte[] PdfReader.getStreamBytesRaw(PRStream)>
	//    4    6:aconst_null     
	//    5    7:invokespecial   #41  <Method void PdfImageObject(PdfDictionary, byte[], PdfDictionary)>
	//    6   10:return          
	}

	public PdfImageObject(PRStream prstream, PdfDictionary pdfdictionary)
		throws IOException
	{
		this(((PdfDictionary) (prstream)), PdfReader.getStreamBytesRaw(prstream), pdfdictionary);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokestatic    #38  <Method byte[] PdfReader.getStreamBytesRaw(PRStream)>
	//    4    6:aload_2         
	//    5    7:invokespecial   #41  <Method void PdfImageObject(PdfDictionary, byte[], PdfDictionary)>
	//    6   10:return          
	}

	protected PdfImageObject(PdfDictionary pdfdictionary, byte abyte0[], PdfDictionary pdfdictionary1)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		pngColorType = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #49  <Field int pngColorType>
		streamContentType = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #51  <Field PdfImageObject$ImageBytesType streamContentType>
		dictionary = pdfdictionary;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #53  <Field PdfDictionary dictionary>
		colorSpaceDic = pdfdictionary1;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #55  <Field PdfDictionary colorSpaceDic>
		pdfdictionary1 = ((PdfDictionary) (new TrackingFilter()));
	//   14   24:new             #11  <Class PdfImageObject$TrackingFilter>
	//   15   27:dup             
	//   16   28:aconst_null     
	//   17   29:invokespecial   #58  <Method void PdfImageObject$TrackingFilter(PdfImageObject$1)>
	//   18   32:astore_3        
		HashMap hashmap = new HashMap(FilterHandlers.getDefaultFilterHandlers());
	//   19   33:new             #60  <Class HashMap>
	//   20   36:dup             
	//   21   37:invokestatic    #66  <Method Map FilterHandlers.getDefaultFilterHandlers()>
	//   22   40:invokespecial   #69  <Method void HashMap(Map)>
	//   23   43:astore          4
		((Map) (hashmap)).put(((Object) (PdfName.JBIG2DECODE)), ((Object) (pdfdictionary1)));
	//   24   45:aload           4
	//   25   47:getstatic       #75  <Field PdfName PdfName.JBIG2DECODE>
	//   26   50:aload_3         
	//   27   51:invokeinterface #81  <Method Object Map.put(Object, Object)>
	//   28   56:pop             
		((Map) (hashmap)).put(((Object) (PdfName.DCTDECODE)), ((Object) (pdfdictionary1)));
	//   29   57:aload           4
	//   30   59:getstatic       #84  <Field PdfName PdfName.DCTDECODE>
	//   31   62:aload_3         
	//   32   63:invokeinterface #81  <Method Object Map.put(Object, Object)>
	//   33   68:pop             
		((Map) (hashmap)).put(((Object) (PdfName.JPXDECODE)), ((Object) (pdfdictionary1)));
	//   34   69:aload           4
	//   35   71:getstatic       #87  <Field PdfName PdfName.JPXDECODE>
	//   36   74:aload_3         
	//   37   75:invokeinterface #81  <Method Object Map.put(Object, Object)>
	//   38   80:pop             
		imageBytes = PdfReader.decodeBytes(abyte0, pdfdictionary, ((Map) (hashmap)));
	//   39   81:aload_0         
	//   40   82:aload_2         
	//   41   83:aload_1         
	//   42   84:aload           4
	//   43   86:invokestatic    #91  <Method byte[] PdfReader.decodeBytes(byte[], PdfDictionary, Map)>
	//   44   89:putfield        #93  <Field byte[] imageBytes>
		if(((TrackingFilter) (pdfdictionary1)).lastFilterName == null)
			break MISSING_BLOCK_LABEL_162;
	//   45   92:aload_3         
	//   46   93:getfield        #96  <Field PdfName PdfImageObject$TrackingFilter.lastFilterName>
	//   47   96:ifnull          162
		if(!PdfName.JBIG2DECODE.equals(((Object) (((TrackingFilter) (pdfdictionary1)).lastFilterName)))) goto _L2; else goto _L1
	//   48   99:getstatic       #75  <Field PdfName PdfName.JBIG2DECODE>
	//   49  102:aload_3         
	//   50  103:getfield        #96  <Field PdfName PdfImageObject$TrackingFilter.lastFilterName>
	//   51  106:invokevirtual   #100 <Method boolean PdfName.equals(Object)>
	//   52  109:ifeq            120
_L1:
		streamContentType = ImageBytesType.JBIG2;
	//   53  112:aload_0         
	//   54  113:getstatic       #103 <Field PdfImageObject$ImageBytesType PdfImageObject$ImageBytesType.JBIG2>
	//   55  116:putfield        #51  <Field PdfImageObject$ImageBytesType streamContentType>
_L4:
		return;
	//   56  119:return          
_L2:
		if(PdfName.DCTDECODE.equals(((Object) (((TrackingFilter) (pdfdictionary1)).lastFilterName))))
	//*  57  120:getstatic       #84  <Field PdfName PdfName.DCTDECODE>
	//*  58  123:aload_3         
	//*  59  124:getfield        #96  <Field PdfName PdfImageObject$TrackingFilter.lastFilterName>
	//*  60  127:invokevirtual   #100 <Method boolean PdfName.equals(Object)>
	//*  61  130:ifeq            141
		{
			streamContentType = ImageBytesType.JPG;
	//   62  133:aload_0         
	//   63  134:getstatic       #106 <Field PdfImageObject$ImageBytesType PdfImageObject$ImageBytesType.JPG>
	//   64  137:putfield        #51  <Field PdfImageObject$ImageBytesType streamContentType>
			return;
	//   65  140:return          
		}
		if(!PdfName.JPXDECODE.equals(((Object) (((TrackingFilter) (pdfdictionary1)).lastFilterName)))) goto _L4; else goto _L3
	//   66  141:getstatic       #87  <Field PdfName PdfName.JPXDECODE>
	//   67  144:aload_3         
	//   68  145:getfield        #96  <Field PdfName PdfImageObject$TrackingFilter.lastFilterName>
	//   69  148:invokevirtual   #100 <Method boolean PdfName.equals(Object)>
	//   70  151:ifeq            119
_L3:
		streamContentType = ImageBytesType.JP2;
	//   71  154:aload_0         
	//   72  155:getstatic       #109 <Field PdfImageObject$ImageBytesType PdfImageObject$ImageBytesType.JP2>
	//   73  158:putfield        #51  <Field PdfImageObject$ImageBytesType streamContentType>
		return;
	//   74  161:return          
		decodeImageBytes();
	//   75  162:aload_0         
	//   76  163:invokespecial   #112 <Method void decodeImageBytes()>
		return;
	//   77  166:return          
	}

	private void decodeImageBytes()
		throws IOException
	{
		if(streamContentType != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field PdfImageObject$ImageBytesType streamContentType>
	//*   2    4:ifnull          31
			throw new IllegalStateException(MessageLocalization.getComposedMessage("Decoding.can't.happen.on.this.type.of.stream.(.1.)", new Object[] {
				streamContentType
			}));
	//    3    7:new             #114 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #116 <String "Decoding.can't.happen.on.this.type.of.stream.(.1.)">
	//    6   13:iconst_1        
	//    7   14:anewarray       Object[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:aload_0         
	//   11   20:getfield        #51  <Field PdfImageObject$ImageBytesType streamContentType>
	//   12   23:aastore         
	//   13   24:invokestatic    #122 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   14   27:invokespecial   #125 <Method void IllegalStateException(String)>
	//   15   30:athrow          
		pngColorType = -1;
	//   16   31:aload_0         
	//   17   32:iconst_m1       
	//   18   33:putfield        #49  <Field int pngColorType>
		Object obj2 = ((Object) (dictionary.getAsArray(PdfName.DECODE)));
	//   19   36:aload_0         
	//   20   37:getfield        #53  <Field PdfDictionary dictionary>
	//   21   40:getstatic       #128 <Field PdfName PdfName.DECODE>
	//   22   43:invokevirtual   #134 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   23   46:astore          6
		width = dictionary.getAsNumber(PdfName.WIDTH).intValue();
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:getfield        #53  <Field PdfDictionary dictionary>
	//   27   53:getstatic       #137 <Field PdfName PdfName.WIDTH>
	//   28   56:invokevirtual   #141 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   29   59:invokevirtual   #147 <Method int PdfNumber.intValue()>
	//   30   62:putfield        #149 <Field int width>
		height = dictionary.getAsNumber(PdfName.HEIGHT).intValue();
	//   31   65:aload_0         
	//   32   66:aload_0         
	//   33   67:getfield        #53  <Field PdfDictionary dictionary>
	//   34   70:getstatic       #152 <Field PdfName PdfName.HEIGHT>
	//   35   73:invokevirtual   #141 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   36   76:invokevirtual   #147 <Method int PdfNumber.intValue()>
	//   37   79:putfield        #154 <Field int height>
		bpc = dictionary.getAsNumber(PdfName.BITSPERCOMPONENT).intValue();
	//   38   82:aload_0         
	//   39   83:aload_0         
	//   40   84:getfield        #53  <Field PdfDictionary dictionary>
	//   41   87:getstatic       #157 <Field PdfName PdfName.BITSPERCOMPONENT>
	//   42   90:invokevirtual   #141 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   43   93:invokevirtual   #147 <Method int PdfNumber.intValue()>
	//   44   96:putfield        #159 <Field int bpc>
		pngBitDepth = bpc;
	//   45   99:aload_0         
	//   46  100:aload_0         
	//   47  101:getfield        #159 <Field int bpc>
	//   48  104:putfield        #161 <Field int pngBitDepth>
		Object obj1 = ((Object) (dictionary.getDirectObject(PdfName.COLORSPACE)));
	//   49  107:aload_0         
	//   50  108:getfield        #53  <Field PdfDictionary dictionary>
	//   51  111:getstatic       #164 <Field PdfName PdfName.COLORSPACE>
	//   52  114:invokevirtual   #168 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//   53  117:astore          4
		Object obj = obj1;
	//   54  119:aload           4
	//   55  121:astore_3        
		if(obj1 instanceof PdfName)
	//*  56  122:aload           4
	//*  57  124:instanceof      #71  <Class PdfName>
	//*  58  127:ifeq            165
		{
			obj = obj1;
	//   59  130:aload           4
	//   60  132:astore_3        
			if(colorSpaceDic != null)
	//*  61  133:aload_0         
	//*  62  134:getfield        #55  <Field PdfDictionary colorSpaceDic>
	//*  63  137:ifnull          165
			{
				PdfObject pdfobject = colorSpaceDic.getDirectObject((PdfName)obj1);
	//   64  140:aload_0         
	//   65  141:getfield        #55  <Field PdfDictionary colorSpaceDic>
	//   66  144:aload           4
	//   67  146:checkcast       #71  <Class PdfName>
	//   68  149:invokevirtual   #168 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//   69  152:astore          5
				obj = obj1;
	//   70  154:aload           4
	//   71  156:astore_3        
				if(pdfobject != null)
	//*  72  157:aload           5
	//*  73  159:ifnull          165
					obj = ((Object) (pdfobject));
	//   74  162:aload           5
	//   75  164:astore_3        
			}
		}
		palette = null;
	//   76  165:aload_0         
	//   77  166:aconst_null     
	//   78  167:putfield        #170 <Field byte[] palette>
		icc = null;
	//   79  170:aload_0         
	//   80  171:aconst_null     
	//   81  172:putfield        #172 <Field byte[] icc>
		stride = 0;
	//   82  175:aload_0         
	//   83  176:iconst_0        
	//   84  177:putfield        #174 <Field int stride>
		findColorspace(((PdfObject) (obj)), true);
	//   85  180:aload_0         
	//   86  181:aload_3         
	//   87  182:iconst_1        
	//   88  183:invokespecial   #178 <Method void findColorspace(PdfObject, boolean)>
		obj1 = ((Object) (new ByteArrayOutputStream()));
	//   89  186:new             #180 <Class ByteArrayOutputStream>
	//   90  189:dup             
	//   91  190:invokespecial   #181 <Method void ByteArrayOutputStream()>
	//   92  193:astore          4
		if(pngColorType < 0)
	//*  93  195:aload_0         
	//*  94  196:getfield        #49  <Field int pngColorType>
	//*  95  199:ifge            736
		{
			if(bpc != 8)
	//*  96  202:aload_0         
	//*  97  203:getfield        #159 <Field int bpc>
	//*  98  206:bipush          8
	//*  99  208:icmpeq          228
				throw new UnsupportedPdfException(MessageLocalization.getComposedMessage("the.color.depth.1.is.not.supported", bpc));
	//  100  211:new             #183 <Class UnsupportedPdfException>
	//  101  214:dup             
	//  102  215:ldc1            #185 <String "the.color.depth.1.is.not.supported">
	//  103  217:aload_0         
	//  104  218:getfield        #159 <Field int bpc>
	//  105  221:invokestatic    #188 <Method String MessageLocalization.getComposedMessage(String, int)>
	//  106  224:invokespecial   #189 <Method void UnsupportedPdfException(String)>
	//  107  227:athrow          
			ByteArrayOutputStream bytearrayoutputstream;
			byte abyte0[];
			if(!PdfName.DEVICECMYK.equals(obj))
	//* 108  228:getstatic       #192 <Field PdfName PdfName.DEVICECMYK>
	//* 109  231:aload_3         
	//* 110  232:invokevirtual   #100 <Method boolean PdfName.equals(Object)>
	//* 111  235:ifeq            608
	//* 112  238:aload_0         
	//* 113  239:aload_0         
	//* 114  240:getfield        #149 <Field int width>
	//* 115  243:iconst_4        
	//* 116  244:imul            
	//* 117  245:putfield        #174 <Field int stride>
	//* 118  248:new             #194 <Class TiffWriter>
	//* 119  251:dup             
	//* 120  252:invokespecial   #195 <Method void TiffWriter()>
	//* 121  255:astore_3        
	//* 122  256:aload_3         
	//* 123  257:new             #197 <Class com.itextpdf.text.pdf.codec.TiffWriter$FieldShort>
	//* 124  260:dup             
	//* 125  261:sipush          277
	//* 126  264:iconst_4        
	//* 127  265:invokespecial   #200 <Method void com.itextpdf.text.pdf.codec.TiffWriter$FieldShort(int, int)>
	//* 128  268:invokevirtual   #204 <Method void TiffWriter.addField(com.itextpdf.text.pdf.codec.TiffWriter$FieldBase)>
	//* 129  271:aload_3         
	//* 130  272:new             #197 <Class com.itextpdf.text.pdf.codec.TiffWriter$FieldShort>
	//* 131  275:dup             
	//* 132  276:sipush          258
	//* 133  279:iconst_4        
	//* 134  280:newarray        int[]
	//* 135  282:dup             
	//* 136  283:iconst_0        
	//* 137  284:bipush          8
	//* 138  286:iastore         
	//* 139  287:dup             
	//* 140  288:iconst_1        
	//* 141  289:bipush          8
	//* 142  291:iastore         
	//* 143  292:dup             
	//* 144  293:iconst_2        
	//* 145  294:bipush          8
	//* 146  296:iastore         
	//* 147  297:dup             
	//* 148  298:iconst_3        
	//* 149  299:bipush          8
	//* 150  301:iastore         
	//* 151  302:invokespecial   #207 <Method void com.itextpdf.text.pdf.codec.TiffWriter$FieldShort(int, int[])>
	//* 152  305:invokevirtual   #204 <Method void TiffWriter.addField(com.itextpdf.text.pdf.codec.TiffWriter$FieldBase)>
	//* 153  308:aload_3         
	//* 154  309:new             #197 <Class com.itextpdf.text.pdf.codec.TiffWriter$FieldShort>
	//* 155  312:dup             
	//* 156  313:sipush          262
	//* 157  316:iconst_5        
	//* 158  317:invokespecial   #200 <Method void com.itextpdf.text.pdf.codec.TiffWriter$FieldShort(int, int)>
	//* 159  320:invokevirtual   #204 <Method void TiffWriter.addField(com.itextpdf.text.pdf.codec.TiffWriter$FieldBase)>
	//* 160  323:aload_3         
	//* 161  324:new             #209 <Class com.itextpdf.text.pdf.codec.TiffWriter$FieldLong>
	//* 162  327:dup             
	//* 163  328:sipush          256
	//* 164  331:aload_0         
	//* 165  332:getfield        #149 <Field int width>
	//* 166  335:invokespecial   #210 <Method void com.itextpdf.text.pdf.codec.TiffWriter$FieldLong(int, int)>
	//* 167  338:invokevirtual   #204 <Method void TiffWriter.addField(com.itextpdf.text.pdf.codec.TiffWriter$FieldBase)>
	//* 168  341:aload_3         
	//* 169  342:new             #209 <Class com.itextpdf.text.pdf.codec.TiffWriter$FieldLong>
	//* 170  345:dup             
	//* 171  346:sipush          257
	//* 172  349:aload_0         
	//* 173  350:getfield        #154 <Field int height>
	//* 174  353:invokespecial   #210 <Method void com.itextpdf.text.pdf.codec.TiffWriter$FieldLong(int, int)>
	//* 175  356:invokevirtual   #204 <Method void TiffWriter.addField(com.itextpdf.text.pdf.codec.TiffWriter$FieldBase)>
	//* 176  359:aload_3         
	//* 177  360:new             #197 <Class com.itextpdf.text.pdf.codec.TiffWriter$FieldShort>
	//* 178  363:dup             
	//* 179  364:sipush          259
	//* 180  367:iconst_5        
	//* 181  368:invokespecial   #200 <Method void com.itextpdf.text.pdf.codec.TiffWriter$FieldShort(int, int)>
	//* 182  371:invokevirtual   #204 <Method void TiffWriter.addField(com.itextpdf.text.pdf.codec.TiffWriter$FieldBase)>
	//* 183  374:aload_3         
	//* 184  375:new             #197 <Class com.itextpdf.text.pdf.codec.TiffWriter$FieldShort>
	//* 185  378:dup             
	//* 186  379:sipush          317
	//* 187  382:iconst_2        
	//* 188  383:invokespecial   #200 <Method void com.itextpdf.text.pdf.codec.TiffWriter$FieldShort(int, int)>
	//* 189  386:invokevirtual   #204 <Method void TiffWriter.addField(com.itextpdf.text.pdf.codec.TiffWriter$FieldBase)>
	//* 190  389:aload_3         
	//* 191  390:new             #209 <Class com.itextpdf.text.pdf.codec.TiffWriter$FieldLong>
	//* 192  393:dup             
	//* 193  394:sipush          278
	//* 194  397:aload_0         
	//* 195  398:getfield        #154 <Field int height>
	//* 196  401:invokespecial   #210 <Method void com.itextpdf.text.pdf.codec.TiffWriter$FieldLong(int, int)>
	//* 197  404:invokevirtual   #204 <Method void TiffWriter.addField(com.itextpdf.text.pdf.codec.TiffWriter$FieldBase)>
	//* 198  407:aload_3         
	//* 199  408:new             #212 <Class com.itextpdf.text.pdf.codec.TiffWriter$FieldRational>
	//* 200  411:dup             
	//* 201  412:sipush          282
	//* 202  415:iconst_2        
	//* 203  416:newarray        int[]
	//* 204  418:dup             
	//* 205  419:iconst_0        
	//* 206  420:sipush          300
	//* 207  423:iastore         
	//* 208  424:dup             
	//* 209  425:iconst_1        
	//* 210  426:iconst_1        
	//* 211  427:iastore         
	//* 212  428:invokespecial   #213 <Method void com.itextpdf.text.pdf.codec.TiffWriter$FieldRational(int, int[])>
	//* 213  431:invokevirtual   #204 <Method void TiffWriter.addField(com.itextpdf.text.pdf.codec.TiffWriter$FieldBase)>
	//* 214  434:aload_3         
	//* 215  435:new             #212 <Class com.itextpdf.text.pdf.codec.TiffWriter$FieldRational>
	//* 216  438:dup             
	//* 217  439:sipush          283
	//* 218  442:iconst_2        
	//* 219  443:newarray        int[]
	//* 220  445:dup             
	//* 221  446:iconst_0        
	//* 222  447:sipush          300
	//* 223  450:iastore         
	//* 224  451:dup             
	//* 225  452:iconst_1        
	//* 226  453:iconst_1        
	//* 227  454:iastore         
	//* 228  455:invokespecial   #213 <Method void com.itextpdf.text.pdf.codec.TiffWriter$FieldRational(int, int[])>
	//* 229  458:invokevirtual   #204 <Method void TiffWriter.addField(com.itextpdf.text.pdf.codec.TiffWriter$FieldBase)>
	//* 230  461:aload_3         
	//* 231  462:new             #197 <Class com.itextpdf.text.pdf.codec.TiffWriter$FieldShort>
	//* 232  465:dup             
	//* 233  466:sipush          296
	//* 234  469:iconst_2        
	//* 235  470:invokespecial   #200 <Method void com.itextpdf.text.pdf.codec.TiffWriter$FieldShort(int, int)>
	//* 236  473:invokevirtual   #204 <Method void TiffWriter.addField(com.itextpdf.text.pdf.codec.TiffWriter$FieldBase)>
	//* 237  476:aload_3         
	//* 238  477:new             #215 <Class com.itextpdf.text.pdf.codec.TiffWriter$FieldAscii>
	//* 239  480:dup             
	//* 240  481:sipush          305
	//* 241  484:invokestatic    #221 <Method Version Version.getInstance()>
	//* 242  487:invokevirtual   #225 <Method String Version.getVersion()>
	//* 243  490:invokespecial   #228 <Method void com.itextpdf.text.pdf.codec.TiffWriter$FieldAscii(int, String)>
	//* 244  493:invokevirtual   #204 <Method void TiffWriter.addField(com.itextpdf.text.pdf.codec.TiffWriter$FieldBase)>
	//* 245  496:new             #180 <Class ByteArrayOutputStream>
	//* 246  499:dup             
	//* 247  500:invokespecial   #181 <Method void ByteArrayOutputStream()>
	//* 248  503:astore          5
	//* 249  505:aload           5
	//* 250  507:iconst_2        
	//* 251  508:aload_0         
	//* 252  509:getfield        #93  <Field byte[] imageBytes>
	//* 253  512:aload_0         
	//* 254  513:getfield        #154 <Field int height>
	//* 255  516:iconst_4        
	//* 256  517:aload_0         
	//* 257  518:getfield        #174 <Field int stride>
	//* 258  521:invokestatic    #232 <Method void TiffWriter.compressLZW(java.io.OutputStream, int, byte[], int, int, int)>
	//* 259  524:aload           5
	//* 260  526:invokevirtual   #236 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 261  529:astore          5
	//* 262  531:aload_3         
	//* 263  532:new             #238 <Class com.itextpdf.text.pdf.codec.TiffWriter$FieldImage>
	//* 264  535:dup             
	//* 265  536:aload           5
	//* 266  538:invokespecial   #241 <Method void com.itextpdf.text.pdf.codec.TiffWriter$FieldImage(byte[])>
	//* 267  541:invokevirtual   #204 <Method void TiffWriter.addField(com.itextpdf.text.pdf.codec.TiffWriter$FieldBase)>
	//* 268  544:aload_3         
	//* 269  545:new             #209 <Class com.itextpdf.text.pdf.codec.TiffWriter$FieldLong>
	//* 270  548:dup             
	//* 271  549:sipush          279
	//* 272  552:aload           5
	//* 273  554:arraylength     
	//* 274  555:invokespecial   #210 <Method void com.itextpdf.text.pdf.codec.TiffWriter$FieldLong(int, int)>
	//* 275  558:invokevirtual   #204 <Method void TiffWriter.addField(com.itextpdf.text.pdf.codec.TiffWriter$FieldBase)>
	//* 276  561:aload_0         
	//* 277  562:getfield        #172 <Field byte[] icc>
	//* 278  565:ifnull          585
	//* 279  568:aload_3         
	//* 280  569:new             #243 <Class com.itextpdf.text.pdf.codec.TiffWriter$FieldUndefined>
	//* 281  572:dup             
	//* 282  573:ldc1            #244 <Int 34675>
	//* 283  575:aload_0         
	//* 284  576:getfield        #172 <Field byte[] icc>
	//* 285  579:invokespecial   #247 <Method void com.itextpdf.text.pdf.codec.TiffWriter$FieldUndefined(int, byte[])>
	//* 286  582:invokevirtual   #204 <Method void TiffWriter.addField(com.itextpdf.text.pdf.codec.TiffWriter$FieldBase)>
	//* 287  585:aload_3         
	//* 288  586:aload           4
	//* 289  588:invokevirtual   #251 <Method void TiffWriter.writeFile(java.io.OutputStream)>
	//* 290  591:aload_0         
	//* 291  592:getstatic       #254 <Field PdfImageObject$ImageBytesType PdfImageObject$ImageBytesType.CCITT>
	//* 292  595:putfield        #51  <Field PdfImageObject$ImageBytesType streamContentType>
	//* 293  598:aload_0         
	//* 294  599:aload           4
	//* 295  601:invokevirtual   #236 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 296  604:putfield        #93  <Field byte[] imageBytes>
	//* 297  607:return          
				if(obj instanceof PdfArray)
	//* 298  608:aload_3         
	//* 299  609:instanceof      #256 <Class PdfArray>
	//* 300  612:ifeq            714
				{
					PdfArray pdfarray = (PdfArray)obj;
	//  301  615:aload_3         
	//  302  616:checkcast       #256 <Class PdfArray>
	//  303  619:astore          5
					obj2 = ((Object) (pdfarray.getDirectObject(0)));
	//  304  621:aload           5
	//  305  623:iconst_0        
	//  306  624:invokevirtual   #259 <Method PdfObject PdfArray.getDirectObject(int)>
	//  307  627:astore          6
					if(!PdfName.ICCBASED.equals(obj2))
	//* 308  629:getstatic       #262 <Field PdfName PdfName.ICCBASED>
	//* 309  632:aload           6
	//* 310  634:invokevirtual   #100 <Method boolean PdfName.equals(Object)>
	//* 311  637:ifne            662
						throw new UnsupportedPdfException(MessageLocalization.getComposedMessage("the.color.space.1.is.not.supported", new Object[] {
							obj
						}));
	//  312  640:new             #183 <Class UnsupportedPdfException>
	//  313  643:dup             
	//  314  644:ldc2            #264 <String "the.color.space.1.is.not.supported">
	//  315  647:iconst_1        
	//  316  648:anewarray       Object[]
	//  317  651:dup             
	//  318  652:iconst_0        
	//  319  653:aload_3         
	//  320  654:aastore         
	//  321  655:invokestatic    #122 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  322  658:invokespecial   #189 <Method void UnsupportedPdfException(String)>
	//  323  661:athrow          
					obj = ((Object) ((PRStream)pdfarray.getDirectObject(1)));
	//  324  662:aload           5
	//  325  664:iconst_1        
	//  326  665:invokevirtual   #259 <Method PdfObject PdfArray.getDirectObject(int)>
	//  327  668:checkcast       #266 <Class PRStream>
	//  328  671:astore_3        
					int i = ((PRStream) (obj)).getAsNumber(PdfName.N).intValue();
	//  329  672:aload_3         
	//  330  673:getstatic       #269 <Field PdfName PdfName.N>
	//  331  676:invokevirtual   #270 <Method PdfNumber PRStream.getAsNumber(PdfName)>
	//  332  679:invokevirtual   #147 <Method int PdfNumber.intValue()>
	//  333  682:istore_1        
					if(i != 4)
	//* 334  683:iload_1         
	//* 335  684:iconst_4        
	//* 336  685:icmpeq          703
						throw new UnsupportedPdfException(MessageLocalization.getComposedMessage("N.value.1.is.not.supported", i));
	//  337  688:new             #183 <Class UnsupportedPdfException>
	//  338  691:dup             
	//  339  692:ldc2            #272 <String "N.value.1.is.not.supported">
	//  340  695:iload_1         
	//  341  696:invokestatic    #188 <Method String MessageLocalization.getComposedMessage(String, int)>
	//  342  699:invokespecial   #189 <Method void UnsupportedPdfException(String)>
	//  343  702:athrow          
					icc = PdfReader.getStreamBytes(((PRStream) (obj)));
	//  344  703:aload_0         
	//  345  704:aload_3         
	//  346  705:invokestatic    #275 <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//  347  708:putfield        #172 <Field byte[] icc>
				} else
	//* 348  711:goto            238
				{
					throw new UnsupportedPdfException(MessageLocalization.getComposedMessage("the.color.space.1.is.not.supported", new Object[] {
						obj
					}));
	//  349  714:new             #183 <Class UnsupportedPdfException>
	//  350  717:dup             
	//  351  718:ldc2            #264 <String "the.color.space.1.is.not.supported">
	//  352  721:iconst_1        
	//  353  722:anewarray       Object[]
	//  354  725:dup             
	//  355  726:iconst_0        
	//  356  727:aload_3         
	//  357  728:aastore         
	//  358  729:invokestatic    #122 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  359  732:invokespecial   #189 <Method void UnsupportedPdfException(String)>
	//  360  735:athrow          
				}
			stride = width * 4;
			obj = ((Object) (new TiffWriter()));
			((TiffWriter) (obj)).addField(((com.itextpdf.text.pdf.codec.TiffWriter.FieldBase) (new com.itextpdf.text.pdf.codec.TiffWriter.FieldShort(277, 4))));
			((TiffWriter) (obj)).addField(((com.itextpdf.text.pdf.codec.TiffWriter.FieldBase) (new com.itextpdf.text.pdf.codec.TiffWriter.FieldShort(258, new int[] {
				8, 8, 8, 8
			}))));
			((TiffWriter) (obj)).addField(((com.itextpdf.text.pdf.codec.TiffWriter.FieldBase) (new com.itextpdf.text.pdf.codec.TiffWriter.FieldShort(262, 5))));
			((TiffWriter) (obj)).addField(((com.itextpdf.text.pdf.codec.TiffWriter.FieldBase) (new com.itextpdf.text.pdf.codec.TiffWriter.FieldLong(256, width))));
			((TiffWriter) (obj)).addField(((com.itextpdf.text.pdf.codec.TiffWriter.FieldBase) (new com.itextpdf.text.pdf.codec.TiffWriter.FieldLong(257, height))));
			((TiffWriter) (obj)).addField(((com.itextpdf.text.pdf.codec.TiffWriter.FieldBase) (new com.itextpdf.text.pdf.codec.TiffWriter.FieldShort(259, 5))));
			((TiffWriter) (obj)).addField(((com.itextpdf.text.pdf.codec.TiffWriter.FieldBase) (new com.itextpdf.text.pdf.codec.TiffWriter.FieldShort(317, 2))));
			((TiffWriter) (obj)).addField(((com.itextpdf.text.pdf.codec.TiffWriter.FieldBase) (new com.itextpdf.text.pdf.codec.TiffWriter.FieldLong(278, height))));
			((TiffWriter) (obj)).addField(((com.itextpdf.text.pdf.codec.TiffWriter.FieldBase) (new com.itextpdf.text.pdf.codec.TiffWriter.FieldRational(282, new int[] {
				300, 1
			}))));
			((TiffWriter) (obj)).addField(((com.itextpdf.text.pdf.codec.TiffWriter.FieldBase) (new com.itextpdf.text.pdf.codec.TiffWriter.FieldRational(283, new int[] {
				300, 1
			}))));
			((TiffWriter) (obj)).addField(((com.itextpdf.text.pdf.codec.TiffWriter.FieldBase) (new com.itextpdf.text.pdf.codec.TiffWriter.FieldShort(296, 2))));
			((TiffWriter) (obj)).addField(((com.itextpdf.text.pdf.codec.TiffWriter.FieldBase) (new com.itextpdf.text.pdf.codec.TiffWriter.FieldAscii(305, Version.getInstance().getVersion()))));
			bytearrayoutputstream = new ByteArrayOutputStream();
			TiffWriter.compressLZW(((java.io.OutputStream) (bytearrayoutputstream)), 2, imageBytes, height, 4, stride);
			abyte0 = bytearrayoutputstream.toByteArray();
			((TiffWriter) (obj)).addField(((com.itextpdf.text.pdf.codec.TiffWriter.FieldBase) (new com.itextpdf.text.pdf.codec.TiffWriter.FieldImage(abyte0))));
			((TiffWriter) (obj)).addField(((com.itextpdf.text.pdf.codec.TiffWriter.FieldBase) (new com.itextpdf.text.pdf.codec.TiffWriter.FieldLong(279, abyte0.length))));
			if(icc != null)
				((TiffWriter) (obj)).addField(((com.itextpdf.text.pdf.codec.TiffWriter.FieldBase) (new com.itextpdf.text.pdf.codec.TiffWriter.FieldUndefined(34675, icc))));
			((TiffWriter) (obj)).writeFile(((java.io.OutputStream) (obj1)));
			streamContentType = ImageBytesType.CCITT;
			imageBytes = ((ByteArrayOutputStream) (obj1)).toByteArray();
			return;
		}
		obj = ((Object) (new PngWriter(((java.io.OutputStream) (obj1)))));
	//  361  736:new             #277 <Class PngWriter>
	//  362  739:dup             
	//  363  740:aload           4
	//  364  742:invokespecial   #279 <Method void PngWriter(java.io.OutputStream)>
	//  365  745:astore_3        
		if(obj2 != null && pngBitDepth == 1 && ((PdfArray) (obj2)).getAsNumber(0).intValue() == 1 && ((PdfArray) (obj2)).getAsNumber(1).intValue() == 0)
	//* 366  746:aload           6
	//* 367  748:ifnull          823
	//* 368  751:aload_0         
	//* 369  752:getfield        #161 <Field int pngBitDepth>
	//* 370  755:iconst_1        
	//* 371  756:icmpne          823
	//* 372  759:aload           6
	//* 373  761:iconst_0        
	//* 374  762:invokevirtual   #282 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 375  765:invokevirtual   #147 <Method int PdfNumber.intValue()>
	//* 376  768:iconst_1        
	//* 377  769:icmpne          823
	//* 378  772:aload           6
	//* 379  774:iconst_1        
	//* 380  775:invokevirtual   #282 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 381  778:invokevirtual   #147 <Method int PdfNumber.intValue()>
	//* 382  781:ifne            823
		{
			int k = imageBytes.length;
	//  383  784:aload_0         
	//  384  785:getfield        #93  <Field byte[] imageBytes>
	//  385  788:arraylength     
	//  386  789:istore_2        
			for(int j = 0; j < k; j++)
	//* 387  790:iconst_0        
	//* 388  791:istore_1        
	//* 389  792:iload_1         
	//* 390  793:iload_2         
	//* 391  794:icmpge          823
			{
				byte abyte1[] = imageBytes;
	//  392  797:aload_0         
	//  393  798:getfield        #93  <Field byte[] imageBytes>
	//  394  801:astore          5
				abyte1[j] = (byte)(abyte1[j] ^ 0xff);
	//  395  803:aload           5
	//  396  805:iload_1         
	//  397  806:aload           5
	//  398  808:iload_1         
	//  399  809:baload          
	//  400  810:sipush          255
	//  401  813:ixor            
	//  402  814:int2byte        
	//  403  815:bastore         
			}

	//  404  816:iload_1         
	//  405  817:iconst_1        
	//  406  818:iadd            
	//  407  819:istore_1        
		}
	//* 408  820:goto            792
		((PngWriter) (obj)).writeHeader(width, height, pngBitDepth, pngColorType);
	//  409  823:aload_3         
	//  410  824:aload_0         
	//  411  825:getfield        #149 <Field int width>
	//  412  828:aload_0         
	//  413  829:getfield        #154 <Field int height>
	//  414  832:aload_0         
	//  415  833:getfield        #161 <Field int pngBitDepth>
	//  416  836:aload_0         
	//  417  837:getfield        #49  <Field int pngColorType>
	//  418  840:invokevirtual   #286 <Method void PngWriter.writeHeader(int, int, int, int)>
		if(icc != null)
	//* 419  843:aload_0         
	//* 420  844:getfield        #172 <Field byte[] icc>
	//* 421  847:ifnull          858
			((PngWriter) (obj)).writeIccProfile(icc);
	//  422  850:aload_3         
	//  423  851:aload_0         
	//  424  852:getfield        #172 <Field byte[] icc>
	//  425  855:invokevirtual   #289 <Method void PngWriter.writeIccProfile(byte[])>
		if(palette != null)
	//* 426  858:aload_0         
	//* 427  859:getfield        #170 <Field byte[] palette>
	//* 428  862:ifnull          873
			((PngWriter) (obj)).writePalette(palette);
	//  429  865:aload_3         
	//  430  866:aload_0         
	//  431  867:getfield        #170 <Field byte[] palette>
	//  432  870:invokevirtual   #292 <Method void PngWriter.writePalette(byte[])>
		((PngWriter) (obj)).writeData(imageBytes, stride);
	//  433  873:aload_3         
	//  434  874:aload_0         
	//  435  875:getfield        #93  <Field byte[] imageBytes>
	//  436  878:aload_0         
	//  437  879:getfield        #174 <Field int stride>
	//  438  882:invokevirtual   #296 <Method void PngWriter.writeData(byte[], int)>
		((PngWriter) (obj)).writeEnd();
	//  439  885:aload_3         
	//  440  886:invokevirtual   #299 <Method void PngWriter.writeEnd()>
		streamContentType = ImageBytesType.PNG;
	//  441  889:aload_0         
	//  442  890:getstatic       #302 <Field PdfImageObject$ImageBytesType PdfImageObject$ImageBytesType.PNG>
	//  443  893:putfield        #51  <Field PdfImageObject$ImageBytesType streamContentType>
		imageBytes = ((ByteArrayOutputStream) (obj1)).toByteArray();
	//  444  896:aload_0         
	//  445  897:aload           4
	//  446  899:invokevirtual   #236 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//  447  902:putfield        #93  <Field byte[] imageBytes>
	//  448  905:return          
	}

	private void findColorspace(PdfObject pdfobject, boolean flag)
		throws IOException
	{
		if(pdfobject != null || bpc != 1) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       37
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field int bpc>
	//    4    8:iconst_1        
	//    5    9:icmpne          37
_L1:
		stride = (width * bpc + 7) / 8;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #149 <Field int width>
	//    9   17:aload_0         
	//   10   18:getfield        #159 <Field int bpc>
	//   11   21:imul            
	//   12   22:bipush          7
	//   13   24:iadd            
	//   14   25:bipush          8
	//   15   27:idiv            
	//   16   28:putfield        #174 <Field int stride>
		pngColorType = 0;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #49  <Field int pngColorType>
_L4:
		return;
	//   20   36:return          
_L2:
		if(PdfName.DEVICEGRAY.equals(((Object) (pdfobject))))
	//*  21   37:getstatic       #305 <Field PdfName PdfName.DEVICEGRAY>
	//*  22   40:aload_1         
	//*  23   41:invokevirtual   #100 <Method boolean PdfName.equals(Object)>
	//*  24   44:ifeq            72
		{
			stride = (width * bpc + 7) / 8;
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #149 <Field int width>
	//   28   52:aload_0         
	//   29   53:getfield        #159 <Field int bpc>
	//   30   56:imul            
	//   31   57:bipush          7
	//   32   59:iadd            
	//   33   60:bipush          8
	//   34   62:idiv            
	//   35   63:putfield        #174 <Field int stride>
			pngColorType = 0;
	//   36   66:aload_0         
	//   37   67:iconst_0        
	//   38   68:putfield        #49  <Field int pngColorType>
			return;
	//   39   71:return          
		}
		if(!PdfName.DEVICERGB.equals(((Object) (pdfobject))))
			continue; /* Loop/switch isn't completed */
	//   40   72:getstatic       #308 <Field PdfName PdfName.DEVICERGB>
	//   41   75:aload_1         
	//   42   76:invokevirtual   #100 <Method boolean PdfName.equals(Object)>
	//   43   79:ifeq            127
		if(bpc == 8 || bpc == 16)
	//*  44   82:aload_0         
	//*  45   83:getfield        #159 <Field int bpc>
	//*  46   86:bipush          8
	//*  47   88:icmpeq          100
	//*  48   91:aload_0         
	//*  49   92:getfield        #159 <Field int bpc>
	//*  50   95:bipush          16
	//*  51   97:icmpne          36
		{
			stride = (width * bpc * 3 + 7) / 8;
	//   52  100:aload_0         
	//   53  101:aload_0         
	//   54  102:getfield        #149 <Field int width>
	//   55  105:aload_0         
	//   56  106:getfield        #159 <Field int bpc>
	//   57  109:imul            
	//   58  110:iconst_3        
	//   59  111:imul            
	//   60  112:bipush          7
	//   61  114:iadd            
	//   62  115:bipush          8
	//   63  117:idiv            
	//   64  118:putfield        #174 <Field int stride>
			pngColorType = 2;
	//   65  121:aload_0         
	//   66  122:iconst_2        
	//   67  123:putfield        #49  <Field int pngColorType>
			return;
	//   68  126:return          
		}
		continue; /* Loop/switch isn't completed */
		if(!(pdfobject instanceof PdfArray)) goto _L4; else goto _L3
	//   69  127:aload_1         
	//   70  128:instanceof      #256 <Class PdfArray>
	//   71  131:ifeq            36
_L3:
		PdfObject pdfobject1;
		pdfobject = ((PdfObject) ((PdfArray)pdfobject));
	//   72  134:aload_1         
	//   73  135:checkcast       #256 <Class PdfArray>
	//   74  138:astore_1        
		pdfobject1 = ((PdfArray) (pdfobject)).getDirectObject(0);
	//   75  139:aload_1         
	//   76  140:iconst_0        
	//   77  141:invokevirtual   #259 <Method PdfObject PdfArray.getDirectObject(int)>
	//   78  144:astore          4
		if(PdfName.CALGRAY.equals(((Object) (pdfobject1))))
	//*  79  146:getstatic       #311 <Field PdfName PdfName.CALGRAY>
	//*  80  149:aload           4
	//*  81  151:invokevirtual   #100 <Method boolean PdfName.equals(Object)>
	//*  82  154:ifeq            182
		{
			stride = (width * bpc + 7) / 8;
	//   83  157:aload_0         
	//   84  158:aload_0         
	//   85  159:getfield        #149 <Field int width>
	//   86  162:aload_0         
	//   87  163:getfield        #159 <Field int bpc>
	//   88  166:imul            
	//   89  167:bipush          7
	//   90  169:iadd            
	//   91  170:bipush          8
	//   92  172:idiv            
	//   93  173:putfield        #174 <Field int stride>
			pngColorType = 0;
	//   94  176:aload_0         
	//   95  177:iconst_0        
	//   96  178:putfield        #49  <Field int pngColorType>
			return;
	//   97  181:return          
		}
		if(!PdfName.CALRGB.equals(((Object) (pdfobject1))))
			break; /* Loop/switch isn't completed */
	//   98  182:getstatic       #314 <Field PdfName PdfName.CALRGB>
	//   99  185:aload           4
	//  100  187:invokevirtual   #100 <Method boolean PdfName.equals(Object)>
	//  101  190:ifeq            238
		if(bpc == 8 || bpc == 16)
	//* 102  193:aload_0         
	//* 103  194:getfield        #159 <Field int bpc>
	//* 104  197:bipush          8
	//* 105  199:icmpeq          211
	//* 106  202:aload_0         
	//* 107  203:getfield        #159 <Field int bpc>
	//* 108  206:bipush          16
	//* 109  208:icmpne          36
		{
			stride = (width * bpc * 3 + 7) / 8;
	//  110  211:aload_0         
	//  111  212:aload_0         
	//  112  213:getfield        #149 <Field int width>
	//  113  216:aload_0         
	//  114  217:getfield        #159 <Field int bpc>
	//  115  220:imul            
	//  116  221:iconst_3        
	//  117  222:imul            
	//  118  223:bipush          7
	//  119  225:iadd            
	//  120  226:bipush          8
	//  121  228:idiv            
	//  122  229:putfield        #174 <Field int stride>
			pngColorType = 2;
	//  123  232:aload_0         
	//  124  233:iconst_2        
	//  125  234:putfield        #49  <Field int pngColorType>
			return;
	//  126  237:return          
		}
		if(true) goto _L4; else goto _L5
_L5:
		int i;
		if(!PdfName.ICCBASED.equals(((Object) (pdfobject1))))
			continue; /* Loop/switch isn't completed */
	//  127  238:getstatic       #262 <Field PdfName PdfName.ICCBASED>
	//  128  241:aload           4
	//  129  243:invokevirtual   #100 <Method boolean PdfName.equals(Object)>
	//  130  246:ifeq            347
		pdfobject = ((PdfObject) ((PRStream)((PdfArray) (pdfobject)).getDirectObject(1)));
	//  131  249:aload_1         
	//  132  250:iconst_1        
	//  133  251:invokevirtual   #259 <Method PdfObject PdfArray.getDirectObject(int)>
	//  134  254:checkcast       #266 <Class PRStream>
	//  135  257:astore_1        
		i = ((PRStream) (pdfobject)).getAsNumber(PdfName.N).intValue();
	//  136  258:aload_1         
	//  137  259:getstatic       #269 <Field PdfName PdfName.N>
	//  138  262:invokevirtual   #270 <Method PdfNumber PRStream.getAsNumber(PdfName)>
	//  139  265:invokevirtual   #147 <Method int PdfNumber.intValue()>
	//  140  268:istore_3        
		if(i == 1)
	//* 141  269:iload_3         
	//* 142  270:iconst_1        
	//* 143  271:icmpne          307
		{
			stride = (width * bpc + 7) / 8;
	//  144  274:aload_0         
	//  145  275:aload_0         
	//  146  276:getfield        #149 <Field int width>
	//  147  279:aload_0         
	//  148  280:getfield        #159 <Field int bpc>
	//  149  283:imul            
	//  150  284:bipush          7
	//  151  286:iadd            
	//  152  287:bipush          8
	//  153  289:idiv            
	//  154  290:putfield        #174 <Field int stride>
			pngColorType = 0;
	//  155  293:aload_0         
	//  156  294:iconst_0        
	//  157  295:putfield        #49  <Field int pngColorType>
			icc = PdfReader.getStreamBytes(((PRStream) (pdfobject)));
	//  158  298:aload_0         
	//  159  299:aload_1         
	//  160  300:invokestatic    #275 <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//  161  303:putfield        #172 <Field byte[] icc>
			return;
	//  162  306:return          
		}
		if(i != 3) goto _L4; else goto _L6
	//  163  307:iload_3         
	//  164  308:iconst_3        
	//  165  309:icmpne          36
_L6:
		stride = (width * bpc * 3 + 7) / 8;
	//  166  312:aload_0         
	//  167  313:aload_0         
	//  168  314:getfield        #149 <Field int width>
	//  169  317:aload_0         
	//  170  318:getfield        #159 <Field int bpc>
	//  171  321:imul            
	//  172  322:iconst_3        
	//  173  323:imul            
	//  174  324:bipush          7
	//  175  326:iadd            
	//  176  327:bipush          8
	//  177  329:idiv            
	//  178  330:putfield        #174 <Field int stride>
		pngColorType = 2;
	//  179  333:aload_0         
	//  180  334:iconst_2        
	//  181  335:putfield        #49  <Field int pngColorType>
		icc = PdfReader.getStreamBytes(((PRStream) (pdfobject)));
	//  182  338:aload_0         
	//  183  339:aload_1         
	//  184  340:invokestatic    #275 <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//  185  343:putfield        #172 <Field byte[] icc>
		return;
	//  186  346:return          
		if(!flag || !PdfName.INDEXED.equals(((Object) (pdfobject1)))) goto _L4; else goto _L7
	//  187  347:iload_2         
	//  188  348:ifeq            36
	//  189  351:getstatic       #317 <Field PdfName PdfName.INDEXED>
	//  190  354:aload           4
	//  191  356:invokevirtual   #100 <Method boolean PdfName.equals(Object)>
	//  192  359:ifeq            36
_L7:
		findColorspace(((PdfArray) (pdfobject)).getDirectObject(1), false);
	//  193  362:aload_0         
	//  194  363:aload_1         
	//  195  364:iconst_1        
	//  196  365:invokevirtual   #259 <Method PdfObject PdfArray.getDirectObject(int)>
	//  197  368:iconst_0        
	//  198  369:invokespecial   #178 <Method void findColorspace(PdfObject, boolean)>
		if(pngColorType != 2) goto _L4; else goto _L8
	//  199  372:aload_0         
	//  200  373:getfield        #49  <Field int pngColorType>
	//  201  376:iconst_2        
	//  202  377:icmpne          36
_L8:
		pdfobject = ((PdfArray) (pdfobject)).getDirectObject(3);
	//  203  380:aload_1         
	//  204  381:iconst_3        
	//  205  382:invokevirtual   #259 <Method PdfObject PdfArray.getDirectObject(int)>
	//  206  385:astore_1        
		if(!(pdfobject instanceof PdfString)) goto _L10; else goto _L9
	//  207  386:aload_1         
	//  208  387:instanceof      #319 <Class PdfString>
	//  209  390:ifeq            429
_L9:
		palette = ((PdfString)pdfobject).getBytes();
	//  210  393:aload_0         
	//  211  394:aload_1         
	//  212  395:checkcast       #319 <Class PdfString>
	//  213  398:invokevirtual   #322 <Method byte[] PdfString.getBytes()>
	//  214  401:putfield        #170 <Field byte[] palette>
_L12:
		stride = (width * bpc + 7) / 8;
	//  215  404:aload_0         
	//  216  405:aload_0         
	//  217  406:getfield        #149 <Field int width>
	//  218  409:aload_0         
	//  219  410:getfield        #159 <Field int bpc>
	//  220  413:imul            
	//  221  414:bipush          7
	//  222  416:iadd            
	//  223  417:bipush          8
	//  224  419:idiv            
	//  225  420:putfield        #174 <Field int stride>
		pngColorType = 3;
	//  226  423:aload_0         
	//  227  424:iconst_3        
	//  228  425:putfield        #49  <Field int pngColorType>
		return;
	//  229  428:return          
_L10:
		if(pdfobject instanceof PRStream)
	//* 230  429:aload_1         
	//* 231  430:instanceof      #266 <Class PRStream>
	//* 232  433:ifeq            404
			palette = PdfReader.getStreamBytes((PRStream)pdfobject);
	//  233  436:aload_0         
	//  234  437:aload_1         
	//  235  438:checkcast       #266 <Class PRStream>
	//  236  441:invokestatic    #275 <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//  237  444:putfield        #170 <Field byte[] palette>
		if(true) goto _L12; else goto _L11
	//  238  447:goto            404
_L11:
	}

	public PdfObject get(PdfName pdfname)
	{
		return dictionary.get(pdfname);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field PdfDictionary dictionary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #325 <Method PdfObject PdfDictionary.get(PdfName)>
	//    4    8:areturn         
	}

	public PdfDictionary getDictionary()
	{
		return dictionary;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field PdfDictionary dictionary>
	//    2    4:areturn         
	}

	public String getFileType()
	{
		return streamContentType.getFileExtension();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field PdfImageObject$ImageBytesType streamContentType>
	//    2    4:invokevirtual   #331 <Method String PdfImageObject$ImageBytesType.getFileExtension()>
	//    3    7:areturn         
	}

	public byte[] getImageAsBytes()
	{
		return imageBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field byte[] imageBytes>
	//    2    4:areturn         
	}

	public ImageBytesType getImageBytesType()
	{
		return streamContentType;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field PdfImageObject$ImageBytesType streamContentType>
	//    2    4:areturn         
	}

	private int bpc;
	private PdfDictionary colorSpaceDic;
	private PdfDictionary dictionary;
	private int height;
	private byte icc[];
	private byte imageBytes[];
	private byte palette[];
	private int pngBitDepth;
	private int pngColorType;
	private ImageBytesType streamContentType;
	private int stride;
	private int width;
}
