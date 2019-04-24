// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.io.*;
import com.itextpdf.text.pdf.internal.PdfVersionImp;
import com.itextpdf.text.pdf.security.CertificateInfo;
import java.io.*;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfTemplate, PdfDictionary, PdfName, PdfNumber, 
//			PdfStamperImp, PdfString, PdfArray, PdfReader, 
//			ByteBuffer, PdfLiteral, PdfObject, ColumnText, 
//			AcroFields, PdfStamper, PdfIndirectObject, PdfFormField, 
//			PdfAnnotation, PdfSigLockDictionary, PdfDeveloperExtension

public class PdfSignatureAppearance
{
	public static final class RenderingMode extends Enum
	{

		public static RenderingMode valueOf(String s)
		{
			return (RenderingMode)Enum.valueOf(com/itextpdf/text/pdf/PdfSignatureAppearance$RenderingMode, s);
		//    0    0:ldc1            #2   <Class PdfSignatureAppearance$RenderingMode>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PdfSignatureAppearance$RenderingMode>
		//    4    9:areturn         
		}

		public static RenderingMode[] values()
		{
			return (RenderingMode[])((RenderingMode []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field PdfSignatureAppearance$RenderingMode[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.pdf.PdfSignatureAppearance$RenderingMode_3B_.clone()>
		//    2    6:checkcast       #46  <Class PdfSignatureAppearance$RenderingMode[]>
		//    3    9:areturn         
		}

		private static final RenderingMode $VALUES[];
		public static final RenderingMode DESCRIPTION;
		public static final RenderingMode GRAPHIC;
		public static final RenderingMode GRAPHIC_AND_DESCRIPTION;
		public static final RenderingMode NAME_AND_DESCRIPTION;

		static 
		{
			DESCRIPTION = new RenderingMode("DESCRIPTION", 0);
		//    0    0:new             #2   <Class PdfSignatureAppearance$RenderingMode>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "DESCRIPTION">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void PdfSignatureAppearance$RenderingMode(String, int)>
		//    5   10:putstatic       #24  <Field PdfSignatureAppearance$RenderingMode DESCRIPTION>
			NAME_AND_DESCRIPTION = new RenderingMode("NAME_AND_DESCRIPTION", 1);
		//    6   13:new             #2   <Class PdfSignatureAppearance$RenderingMode>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "NAME_AND_DESCRIPTION">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void PdfSignatureAppearance$RenderingMode(String, int)>
		//   11   23:putstatic       #27  <Field PdfSignatureAppearance$RenderingMode NAME_AND_DESCRIPTION>
			GRAPHIC_AND_DESCRIPTION = new RenderingMode("GRAPHIC_AND_DESCRIPTION", 2);
		//   12   26:new             #2   <Class PdfSignatureAppearance$RenderingMode>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "GRAPHIC_AND_DESCRIPTION">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void PdfSignatureAppearance$RenderingMode(String, int)>
		//   17   36:putstatic       #30  <Field PdfSignatureAppearance$RenderingMode GRAPHIC_AND_DESCRIPTION>
			GRAPHIC = new RenderingMode("GRAPHIC", 3);
		//   18   39:new             #2   <Class PdfSignatureAppearance$RenderingMode>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "GRAPHIC">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void PdfSignatureAppearance$RenderingMode(String, int)>
		//   23   49:putstatic       #33  <Field PdfSignatureAppearance$RenderingMode GRAPHIC>
			$VALUES = (new RenderingMode[] {
				DESCRIPTION, NAME_AND_DESCRIPTION, GRAPHIC_AND_DESCRIPTION, GRAPHIC
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       RenderingMode[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field PdfSignatureAppearance$RenderingMode DESCRIPTION>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field PdfSignatureAppearance$RenderingMode NAME_AND_DESCRIPTION>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field PdfSignatureAppearance$RenderingMode GRAPHIC_AND_DESCRIPTION>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field PdfSignatureAppearance$RenderingMode GRAPHIC>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field PdfSignatureAppearance$RenderingMode[] $VALUES>
		//*  43   83:return          
		}

		private RenderingMode(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static interface SignatureEvent
	{

		public abstract void getSignatureDictionary(PdfDictionary pdfdictionary);
	}


	PdfSignatureAppearance(PdfStamperImp pdfstamperimp)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void Object()>
		certificationLevel = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #98  <Field int certificationLevel>
		reasonCaption = "Reason: ";
	//    5    9:aload_0         
	//    6   10:ldc1            #100 <String "Reason: ">
	//    7   12:putfield        #102 <Field String reasonCaption>
		locationCaption = "Location: ";
	//    8   15:aload_0         
	//    9   16:ldc1            #104 <String "Location: ">
	//   10   18:putfield        #106 <Field String locationCaption>
		page = 1;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #108 <Field int page>
		renderingMode = RenderingMode.DESCRIPTION;
	//   14   26:aload_0         
	//   15   27:getstatic       #111 <Field PdfSignatureAppearance$RenderingMode PdfSignatureAppearance$RenderingMode.DESCRIPTION>
	//   16   30:putfield        #113 <Field PdfSignatureAppearance$RenderingMode renderingMode>
		signatureGraphic = null;
	//   17   33:aload_0         
	//   18   34:aconst_null     
	//   19   35:putfield        #115 <Field Image signatureGraphic>
		acro6Layers = true;
	//   20   38:aload_0         
	//   21   39:iconst_1        
	//   22   40:putfield        #117 <Field boolean acro6Layers>
		app = new PdfTemplate[5];
	//   23   43:aload_0         
	//   24   44:iconst_5        
	//   25   45:anewarray       PdfTemplate[]
	//   26   48:putfield        #121 <Field PdfTemplate[] app>
		reuseAppearance = false;
	//   27   51:aload_0         
	//   28   52:iconst_0        
	//   29   53:putfield        #123 <Field boolean reuseAppearance>
		runDirection = 1;
	//   30   56:aload_0         
	//   31   57:iconst_1        
	//   32   58:putfield        #125 <Field int runDirection>
		preClosed = false;
	//   33   61:aload_0         
	//   34   62:iconst_0        
	//   35   63:putfield        #127 <Field boolean preClosed>
		writer = pdfstamperimp;
	//   36   66:aload_0         
	//   37   67:aload_1         
	//   38   68:putfield        #129 <Field PdfStamperImp writer>
		signDate = ((Calendar) (new GregorianCalendar()));
	//   39   71:aload_0         
	//   40   72:new             #131 <Class GregorianCalendar>
	//   41   75:dup             
	//   42   76:invokespecial   #132 <Method void GregorianCalendar()>
	//   43   79:putfield        #134 <Field Calendar signDate>
		fieldName = getNewSigName();
	//   44   82:aload_0         
	//   45   83:aload_0         
	//   46   84:invokevirtual   #138 <Method String getNewSigName()>
	//   47   87:putfield        #140 <Field String fieldName>
		signatureCreator = Version.getInstance().getVersion();
	//   48   90:aload_0         
	//   49   91:invokestatic    #146 <Method Version Version.getInstance()>
	//   50   94:invokevirtual   #149 <Method String Version.getVersion()>
	//   51   97:putfield        #151 <Field String signatureCreator>
	//   52  100:return          
	}

	private void addDocMDP(PdfDictionary pdfdictionary)
	{
		PdfDictionary pdfdictionary1 = new PdfDictionary();
	//    0    0:new             #156 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:invokespecial   #157 <Method void PdfDictionary()>
	//    3    7:astore_2        
		Object obj = ((Object) (new PdfDictionary()));
	//    4    8:new             #156 <Class PdfDictionary>
	//    5   11:dup             
	//    6   12:invokespecial   #157 <Method void PdfDictionary()>
	//    7   15:astore_3        
		((PdfDictionary) (obj)).put(PdfName.P, ((PdfObject) (new PdfNumber(certificationLevel))));
	//    8   16:aload_3         
	//    9   17:getstatic       #163 <Field PdfName PdfName.P>
	//   10   20:new             #165 <Class PdfNumber>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:getfield        #98  <Field int certificationLevel>
	//   14   28:invokespecial   #168 <Method void PdfNumber(int)>
	//   15   31:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfDictionary) (obj)).put(PdfName.V, ((PdfObject) (new PdfName("1.2"))));
	//   16   34:aload_3         
	//   17   35:getstatic       #175 <Field PdfName PdfName.V>
	//   18   38:new             #159 <Class PdfName>
	//   19   41:dup             
	//   20   42:ldc1            #177 <String "1.2">
	//   21   44:invokespecial   #180 <Method void PdfName(String)>
	//   22   47:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfDictionary) (obj)).put(PdfName.TYPE, ((PdfObject) (PdfName.TRANSFORMPARAMS)));
	//   23   50:aload_3         
	//   24   51:getstatic       #183 <Field PdfName PdfName.TYPE>
	//   25   54:getstatic       #186 <Field PdfName PdfName.TRANSFORMPARAMS>
	//   26   57:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary1.put(PdfName.TRANSFORMMETHOD, ((PdfObject) (PdfName.DOCMDP)));
	//   27   60:aload_2         
	//   28   61:getstatic       #189 <Field PdfName PdfName.TRANSFORMMETHOD>
	//   29   64:getstatic       #192 <Field PdfName PdfName.DOCMDP>
	//   30   67:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary1.put(PdfName.TYPE, ((PdfObject) (PdfName.SIGREF)));
	//   31   70:aload_2         
	//   32   71:getstatic       #183 <Field PdfName PdfName.TYPE>
	//   33   74:getstatic       #195 <Field PdfName PdfName.SIGREF>
	//   34   77:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary1.put(PdfName.TRANSFORMPARAMS, ((PdfObject) (obj)));
	//   35   80:aload_2         
	//   36   81:getstatic       #186 <Field PdfName PdfName.TRANSFORMPARAMS>
	//   37   84:aload_3         
	//   38   85:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(writer.getPdfVersion().getVersion() < '6')
	//*  39   88:aload_0         
	//*  40   89:getfield        #129 <Field PdfStamperImp writer>
	//*  41   92:invokevirtual   #201 <Method PdfVersionImp PdfStamperImp.getPdfVersion()>
	//*  42   95:invokevirtual   #206 <Method char PdfVersionImp.getVersion()>
	//*  43   98:bipush          54
	//*  44  100:icmpge          195
		{
			pdfdictionary1.put(new PdfName("DigestValue"), ((PdfObject) (new PdfString("aa"))));
	//   45  103:aload_2         
	//   46  104:new             #159 <Class PdfName>
	//   47  107:dup             
	//   48  108:ldc1            #208 <String "DigestValue">
	//   49  110:invokespecial   #180 <Method void PdfName(String)>
	//   50  113:new             #210 <Class PdfString>
	//   51  116:dup             
	//   52  117:ldc1            #212 <String "aa">
	//   53  119:invokespecial   #213 <Method void PdfString(String)>
	//   54  122:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
			obj = ((Object) (new PdfArray()));
	//   55  125:new             #215 <Class PdfArray>
	//   56  128:dup             
	//   57  129:invokespecial   #216 <Method void PdfArray()>
	//   58  132:astore_3        
			((PdfArray) (obj)).add(((PdfObject) (new PdfNumber(0))));
	//   59  133:aload_3         
	//   60  134:new             #165 <Class PdfNumber>
	//   61  137:dup             
	//   62  138:iconst_0        
	//   63  139:invokespecial   #168 <Method void PdfNumber(int)>
	//   64  142:invokevirtual   #220 <Method boolean PdfArray.add(PdfObject)>
	//   65  145:pop             
			((PdfArray) (obj)).add(((PdfObject) (new PdfNumber(0))));
	//   66  146:aload_3         
	//   67  147:new             #165 <Class PdfNumber>
	//   68  150:dup             
	//   69  151:iconst_0        
	//   70  152:invokespecial   #168 <Method void PdfNumber(int)>
	//   71  155:invokevirtual   #220 <Method boolean PdfArray.add(PdfObject)>
	//   72  158:pop             
			pdfdictionary1.put(new PdfName("DigestLocation"), ((PdfObject) (obj)));
	//   73  159:aload_2         
	//   74  160:new             #159 <Class PdfName>
	//   75  163:dup             
	//   76  164:ldc1            #222 <String "DigestLocation">
	//   77  166:invokespecial   #180 <Method void PdfName(String)>
	//   78  169:aload_3         
	//   79  170:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary1.put(new PdfName("DigestMethod"), ((PdfObject) (new PdfName("MD5"))));
	//   80  173:aload_2         
	//   81  174:new             #159 <Class PdfName>
	//   82  177:dup             
	//   83  178:ldc1            #224 <String "DigestMethod">
	//   84  180:invokespecial   #180 <Method void PdfName(String)>
	//   85  183:new             #159 <Class PdfName>
	//   86  186:dup             
	//   87  187:ldc1            #226 <String "MD5">
	//   88  189:invokespecial   #180 <Method void PdfName(String)>
	//   89  192:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		pdfdictionary1.put(PdfName.DATA, writer.reader.getTrailer().get(PdfName.ROOT));
	//   90  195:aload_2         
	//   91  196:getstatic       #229 <Field PdfName PdfName.DATA>
	//   92  199:aload_0         
	//   93  200:getfield        #129 <Field PdfStamperImp writer>
	//   94  203:getfield        #233 <Field PdfReader PdfStamperImp.reader>
	//   95  206:invokevirtual   #239 <Method PdfDictionary PdfReader.getTrailer()>
	//   96  209:getstatic       #242 <Field PdfName PdfName.ROOT>
	//   97  212:invokevirtual   #246 <Method PdfObject PdfDictionary.get(PdfName)>
	//   98  215:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		obj = ((Object) (new PdfArray()));
	//   99  218:new             #215 <Class PdfArray>
	//  100  221:dup             
	//  101  222:invokespecial   #216 <Method void PdfArray()>
	//  102  225:astore_3        
		((PdfArray) (obj)).add(((PdfObject) (pdfdictionary1)));
	//  103  226:aload_3         
	//  104  227:aload_2         
	//  105  228:invokevirtual   #220 <Method boolean PdfArray.add(PdfObject)>
	//  106  231:pop             
		pdfdictionary.put(PdfName.REFERENCE, ((PdfObject) (obj)));
	//  107  232:aload_1         
	//  108  233:getstatic       #249 <Field PdfName PdfName.REFERENCE>
	//  109  236:aload_3         
	//  110  237:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//  111  240:return          
	}

	private void addFieldMDP(PdfDictionary pdfdictionary, PdfDictionary pdfdictionary1)
	{
		PdfDictionary pdfdictionary2 = new PdfDictionary();
	//    0    0:new             #156 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:invokespecial   #157 <Method void PdfDictionary()>
	//    3    7:astore          4
		Object obj = ((Object) (new PdfDictionary()));
	//    4    9:new             #156 <Class PdfDictionary>
	//    5   12:dup             
	//    6   13:invokespecial   #157 <Method void PdfDictionary()>
	//    7   16:astore_3        
		((PdfDictionary) (obj)).putAll(pdfdictionary1);
	//    8   17:aload_3         
	//    9   18:aload_2         
	//   10   19:invokevirtual   #254 <Method void PdfDictionary.putAll(PdfDictionary)>
		((PdfDictionary) (obj)).put(PdfName.TYPE, ((PdfObject) (PdfName.TRANSFORMPARAMS)));
	//   11   22:aload_3         
	//   12   23:getstatic       #183 <Field PdfName PdfName.TYPE>
	//   13   26:getstatic       #186 <Field PdfName PdfName.TRANSFORMPARAMS>
	//   14   29:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfDictionary) (obj)).put(PdfName.V, ((PdfObject) (new PdfName("1.2"))));
	//   15   32:aload_3         
	//   16   33:getstatic       #175 <Field PdfName PdfName.V>
	//   17   36:new             #159 <Class PdfName>
	//   18   39:dup             
	//   19   40:ldc1            #177 <String "1.2">
	//   20   42:invokespecial   #180 <Method void PdfName(String)>
	//   21   45:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(PdfName.TRANSFORMMETHOD, ((PdfObject) (PdfName.FIELDMDP)));
	//   22   48:aload           4
	//   23   50:getstatic       #189 <Field PdfName PdfName.TRANSFORMMETHOD>
	//   24   53:getstatic       #257 <Field PdfName PdfName.FIELDMDP>
	//   25   56:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(PdfName.TYPE, ((PdfObject) (PdfName.SIGREF)));
	//   26   59:aload           4
	//   27   61:getstatic       #183 <Field PdfName PdfName.TYPE>
	//   28   64:getstatic       #195 <Field PdfName PdfName.SIGREF>
	//   29   67:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(PdfName.TRANSFORMPARAMS, ((PdfObject) (obj)));
	//   30   70:aload           4
	//   31   72:getstatic       #186 <Field PdfName PdfName.TRANSFORMPARAMS>
	//   32   75:aload_3         
	//   33   76:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(new PdfName("DigestValue"), ((PdfObject) (new PdfString("aa"))));
	//   34   79:aload           4
	//   35   81:new             #159 <Class PdfName>
	//   36   84:dup             
	//   37   85:ldc1            #208 <String "DigestValue">
	//   38   87:invokespecial   #180 <Method void PdfName(String)>
	//   39   90:new             #210 <Class PdfString>
	//   40   93:dup             
	//   41   94:ldc1            #212 <String "aa">
	//   42   96:invokespecial   #213 <Method void PdfString(String)>
	//   43   99:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary1 = ((PdfDictionary) (new PdfArray()));
	//   44  102:new             #215 <Class PdfArray>
	//   45  105:dup             
	//   46  106:invokespecial   #216 <Method void PdfArray()>
	//   47  109:astore_2        
		((PdfArray) (pdfdictionary1)).add(((PdfObject) (new PdfNumber(0))));
	//   48  110:aload_2         
	//   49  111:new             #165 <Class PdfNumber>
	//   50  114:dup             
	//   51  115:iconst_0        
	//   52  116:invokespecial   #168 <Method void PdfNumber(int)>
	//   53  119:invokevirtual   #220 <Method boolean PdfArray.add(PdfObject)>
	//   54  122:pop             
		((PdfArray) (pdfdictionary1)).add(((PdfObject) (new PdfNumber(0))));
	//   55  123:aload_2         
	//   56  124:new             #165 <Class PdfNumber>
	//   57  127:dup             
	//   58  128:iconst_0        
	//   59  129:invokespecial   #168 <Method void PdfNumber(int)>
	//   60  132:invokevirtual   #220 <Method boolean PdfArray.add(PdfObject)>
	//   61  135:pop             
		pdfdictionary2.put(new PdfName("DigestLocation"), ((PdfObject) (pdfdictionary1)));
	//   62  136:aload           4
	//   63  138:new             #159 <Class PdfName>
	//   64  141:dup             
	//   65  142:ldc1            #222 <String "DigestLocation">
	//   66  144:invokespecial   #180 <Method void PdfName(String)>
	//   67  147:aload_2         
	//   68  148:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(new PdfName("DigestMethod"), ((PdfObject) (new PdfName("MD5"))));
	//   69  151:aload           4
	//   70  153:new             #159 <Class PdfName>
	//   71  156:dup             
	//   72  157:ldc1            #224 <String "DigestMethod">
	//   73  159:invokespecial   #180 <Method void PdfName(String)>
	//   74  162:new             #159 <Class PdfName>
	//   75  165:dup             
	//   76  166:ldc1            #226 <String "MD5">
	//   77  168:invokespecial   #180 <Method void PdfName(String)>
	//   78  171:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(PdfName.DATA, writer.reader.getTrailer().get(PdfName.ROOT));
	//   79  174:aload           4
	//   80  176:getstatic       #229 <Field PdfName PdfName.DATA>
	//   81  179:aload_0         
	//   82  180:getfield        #129 <Field PdfStamperImp writer>
	//   83  183:getfield        #233 <Field PdfReader PdfStamperImp.reader>
	//   84  186:invokevirtual   #239 <Method PdfDictionary PdfReader.getTrailer()>
	//   85  189:getstatic       #242 <Field PdfName PdfName.ROOT>
	//   86  192:invokevirtual   #246 <Method PdfObject PdfDictionary.get(PdfName)>
	//   87  195:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		obj = ((Object) (pdfdictionary.getAsArray(PdfName.REFERENCE)));
	//   88  198:aload_1         
	//   89  199:getstatic       #249 <Field PdfName PdfName.REFERENCE>
	//   90  202:invokevirtual   #261 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   91  205:astore_3        
		pdfdictionary1 = ((PdfDictionary) (obj));
	//   92  206:aload_3         
	//   93  207:astore_2        
		if(obj == null)
	//*  94  208:aload_3         
	//*  95  209:ifnonnull       220
			pdfdictionary1 = ((PdfDictionary) (new PdfArray()));
	//   96  212:new             #215 <Class PdfArray>
	//   97  215:dup             
	//   98  216:invokespecial   #216 <Method void PdfArray()>
	//   99  219:astore_2        
		((PdfArray) (pdfdictionary1)).add(((PdfObject) (pdfdictionary2)));
	//  100  220:aload_2         
	//  101  221:aload           4
	//  102  223:invokevirtual   #220 <Method boolean PdfArray.add(PdfObject)>
	//  103  226:pop             
		pdfdictionary.put(PdfName.REFERENCE, ((PdfObject) (pdfdictionary1)));
	//  104  227:aload_1         
	//  105  228:getstatic       #249 <Field PdfName PdfName.REFERENCE>
	//  106  231:aload_2         
	//  107  232:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//  108  235:return          
	}

	private void createBlankN0()
	{
		PdfTemplate apdftemplate[] = app;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field PdfTemplate[] app>
	//    2    4:astore_1        
		PdfTemplate pdftemplate = new PdfTemplate(((PdfWriter) (writer)));
	//    3    5:new             #119 <Class PdfTemplate>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #129 <Field PdfStamperImp writer>
	//    7   13:invokespecial   #265 <Method void PdfTemplate(PdfWriter)>
	//    8   16:astore_2        
		apdftemplate[0] = pdftemplate;
	//    9   17:aload_1         
	//   10   18:iconst_0        
	//   11   19:aload_2         
	//   12   20:aastore         
		pdftemplate.setBoundingBox(new Rectangle(100F, 100F));
	//   13   21:aload_2         
	//   14   22:new             #267 <Class Rectangle>
	//   15   25:dup             
	//   16   26:ldc2            #268 <Float 100F>
	//   17   29:ldc2            #268 <Float 100F>
	//   18   32:invokespecial   #271 <Method void Rectangle(float, float)>
	//   19   35:invokevirtual   #275 <Method void PdfTemplate.setBoundingBox(Rectangle)>
		writer.addDirectTemplateSimple(pdftemplate, new PdfName("n0"));
	//   20   38:aload_0         
	//   21   39:getfield        #129 <Field PdfStamperImp writer>
	//   22   42:aload_2         
	//   23   43:new             #159 <Class PdfName>
	//   24   46:dup             
	//   25   47:ldc2            #277 <String "n0">
	//   26   50:invokespecial   #180 <Method void PdfName(String)>
	//   27   53:invokevirtual   #281 <Method PdfName PdfStamperImp.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//   28   56:pop             
		pdftemplate.setLiteral("% DSBlank\n");
	//   29   57:aload_2         
	//   30   58:ldc2            #283 <String "% DSBlank\n">
	//   31   61:invokevirtual   #286 <Method void PdfTemplate.setLiteral(String)>
	//   32   64:return          
	}

	private RandomAccessSource getUnderlyingSource()
		throws IOException
	{
		RandomAccessSourceFactory randomaccesssourcefactory = new RandomAccessSourceFactory();
	//    0    0:new             #292 <Class RandomAccessSourceFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #293 <Method void RandomAccessSourceFactory()>
	//    3    7:astore_1        
		if(raf == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #295 <Field RandomAccessFile raf>
	//*   6   12:ifnonnull       24
			return randomaccesssourcefactory.createSource(bout);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #297 <Field byte[] bout>
	//   10   20:invokevirtual   #301 <Method RandomAccessSource RandomAccessSourceFactory.createSource(byte[])>
	//   11   23:areturn         
		else
			return randomaccesssourcefactory.createSource(raf);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #295 <Field RandomAccessFile raf>
	//   15   29:invokevirtual   #304 <Method RandomAccessSource RandomAccessSourceFactory.createSource(RandomAccessFile)>
	//   16   32:areturn         
	}

	public void addDeveloperExtension(PdfDeveloperExtension pdfdeveloperextension)
	{
		writer.addDeveloperExtension(pdfdeveloperextension);
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field PdfStamperImp writer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #309 <Method void PdfStamperImp.addDeveloperExtension(PdfDeveloperExtension)>
	//    4    8:return          
	}

	public void close(PdfDictionary pdfdictionary)
		throws IOException, DocumentException
	{
		if(!preClosed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field boolean preClosed>
	//*   2    4:ifne            81
			throw new DocumentException(MessageLocalization.getComposedMessage("preclose.must.be.called.first", new Object[0]));
	//    3    7:new             #312 <Class DocumentException>
	//    4   10:dup             
	//    5   11:ldc2            #316 <String "preclose.must.be.called.first">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #322 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #323 <Method void DocumentException(String)>
	//   10   24:athrow          
		break MISSING_BLOCK_LABEL_81;
		pdfdictionary;
	//   11   25:astore_1        
		writer.reader.close();
	//   12   26:aload_0         
	//   13   27:getfield        #129 <Field PdfStamperImp writer>
	//   14   30:getfield        #233 <Field PdfReader PdfStamperImp.reader>
	//   15   33:invokevirtual   #325 <Method void PdfReader.close()>
		if(tempFile != null)
	//*  16   36:aload_0         
	//*  17   37:getfield        #327 <Field File tempFile>
	//*  18   40:ifnull          65
		{
			int i;
			long l;
			ByteBuffer bytebuffer;
			Exception exception;
			Iterator iterator;
			PdfName pdfname;
			PdfObject pdfobject;
			PdfLiteral pdfliteral;
			try
			{
				raf.close();
	//   19   43:aload_0         
	//   20   44:getfield        #295 <Field RandomAccessFile raf>
	//   21   47:invokevirtual   #330 <Method void RandomAccessFile.close()>
			}
	//*  22   50:aload_0         
	//*  23   51:getfield        #332 <Field OutputStream originalout>
	//*  24   54:ifnull          65
	//*  25   57:aload_0         
	//*  26   58:getfield        #327 <Field File tempFile>
	//*  27   61:invokevirtual   #338 <Method boolean File.delete()>
	//*  28   64:pop             
	//*  29   65:aload_0         
	//*  30   66:getfield        #332 <Field OutputStream originalout>
	//*  31   69:ifnull          79
	//*  32   72:aload_0         
	//*  33   73:getfield        #332 <Field OutputStream originalout>
	//*  34   76:invokevirtual   #341 <Method void OutputStream.close()>
	//*  35   79:aload_1         
	//*  36   80:athrow          
	//*  37   81:new             #343 <Class ByteBuffer>
	//*  38   84:dup             
	//*  39   85:invokespecial   #344 <Method void ByteBuffer()>
	//*  40   88:astore          5
	//*  41   90:aload_1         
	//*  42   91:invokevirtual   #348 <Method Set PdfDictionary.getKeys()>
	//*  43   94:invokeinterface #354 <Method Iterator Set.iterator()>
	//*  44   99:astore          6
	//*  45  101:aload           6
	//*  46  103:invokeinterface #359 <Method boolean Iterator.hasNext()>
	//*  47  108:ifeq            317
	//*  48  111:aload           6
	//*  49  113:invokeinterface #363 <Method Object Iterator.next()>
	//*  50  118:checkcast       #159 <Class PdfName>
	//*  51  121:astore          7
	//*  52  123:aload_1         
	//*  53  124:aload           7
	//*  54  126:invokevirtual   #246 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  55  129:astore          8
	//*  56  131:aload_0         
	//*  57  132:getfield        #365 <Field HashMap exclusionLocations>
	//*  58  135:aload           7
	//*  59  137:invokevirtual   #370 <Method Object HashMap.get(Object)>
	//*  60  140:checkcast       #372 <Class PdfLiteral>
	//*  61  143:astore          9
	//*  62  145:aload           9
	//*  63  147:ifnonnull       176
	//*  64  150:new             #374 <Class IllegalArgumentException>
	//*  65  153:dup             
	//*  66  154:ldc2            #376 <String "the.key.1.didn.t.reserve.space.in.preclose">
	//*  67  157:iconst_1        
	//*  68  158:anewarray       Object[]
	//*  69  161:dup             
	//*  70  162:iconst_0        
	//*  71  163:aload           7
	//*  72  165:invokevirtual   #379 <Method String PdfName.toString()>
	//*  73  168:aastore         
	//*  74  169:invokestatic    #322 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  75  172:invokespecial   #380 <Method void IllegalArgumentException(String)>
	//*  76  175:athrow          
	//*  77  176:aload           5
	//*  78  178:invokevirtual   #383 <Method void ByteBuffer.reset()>
	//*  79  181:aload           8
	//*  80  183:aconst_null     
	//*  81  184:aload           5
	//*  82  186:invokevirtual   #389 <Method void PdfObject.toPdf(PdfWriter, OutputStream)>
	//*  83  189:aload           5
	//*  84  191:invokevirtual   #393 <Method int ByteBuffer.size()>
	//*  85  194:aload           9
	//*  86  196:invokevirtual   #396 <Method int PdfLiteral.getPosLength()>
	//*  87  199:icmple          250
	//*  88  202:new             #374 <Class IllegalArgumentException>
	//*  89  205:dup             
	//*  90  206:ldc2            #398 <String "the.key.1.is.too.big.is.2.reserved.3">
	//*  91  209:iconst_3        
	//*  92  210:anewarray       Object[]
	//*  93  213:dup             
	//*  94  214:iconst_0        
	//*  95  215:aload           7
	//*  96  217:invokevirtual   #379 <Method String PdfName.toString()>
	//*  97  220:aastore         
	//*  98  221:dup             
	//*  99  222:iconst_1        
	//* 100  223:aload           5
	//* 101  225:invokevirtual   #393 <Method int ByteBuffer.size()>
	//* 102  228:invokestatic    #404 <Method String String.valueOf(int)>
	//* 103  231:aastore         
	//* 104  232:dup             
	//* 105  233:iconst_2        
	//* 106  234:aload           9
	//* 107  236:invokevirtual   #396 <Method int PdfLiteral.getPosLength()>
	//* 108  239:invokestatic    #404 <Method String String.valueOf(int)>
	//* 109  242:aastore         
	//* 110  243:invokestatic    #322 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 111  246:invokespecial   #380 <Method void IllegalArgumentException(String)>
	//* 112  249:athrow          
	//* 113  250:aload_0         
	//* 114  251:getfield        #327 <Field File tempFile>
	//* 115  254:ifnonnull       284
	//* 116  257:aload           5
	//* 117  259:invokevirtual   #408 <Method byte[] ByteBuffer.getBuffer()>
	//* 118  262:iconst_0        
	//* 119  263:aload_0         
	//* 120  264:getfield        #297 <Field byte[] bout>
	//* 121  267:aload           9
	//* 122  269:invokevirtual   #412 <Method long PdfLiteral.getPosition()>
	//* 123  272:l2i             
	//* 124  273:aload           5
	//* 125  275:invokevirtual   #393 <Method int ByteBuffer.size()>
	//* 126  278:invokestatic    #418 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 127  281:goto            101
	//* 128  284:aload_0         
	//* 129  285:getfield        #295 <Field RandomAccessFile raf>
	//* 130  288:aload           9
	//* 131  290:invokevirtual   #412 <Method long PdfLiteral.getPosition()>
	//* 132  293:invokevirtual   #422 <Method void RandomAccessFile.seek(long)>
	//* 133  296:aload_0         
	//* 134  297:getfield        #295 <Field RandomAccessFile raf>
	//* 135  300:aload           5
	//* 136  302:invokevirtual   #408 <Method byte[] ByteBuffer.getBuffer()>
	//* 137  305:iconst_0        
	//* 138  306:aload           5
	//* 139  308:invokevirtual   #393 <Method int ByteBuffer.size()>
	//* 140  311:invokevirtual   #426 <Method void RandomAccessFile.write(byte[], int, int)>
	//* 141  314:goto            101
	//* 142  317:aload_1         
	//* 143  318:invokevirtual   #427 <Method int PdfDictionary.size()>
	//* 144  321:aload_0         
	//* 145  322:getfield        #365 <Field HashMap exclusionLocations>
	//* 146  325:invokevirtual   #428 <Method int HashMap.size()>
	//* 147  328:icmpeq          349
	//* 148  331:new             #374 <Class IllegalArgumentException>
	//* 149  334:dup             
	//* 150  335:ldc2            #430 <String "the.update.dictionary.has.less.keys.than.required">
	//* 151  338:iconst_0        
	//* 152  339:anewarray       Object[]
	//* 153  342:invokestatic    #322 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 154  345:invokespecial   #380 <Method void IllegalArgumentException(String)>
	//* 155  348:athrow          
	//* 156  349:aload_0         
	//* 157  350:getfield        #327 <Field File tempFile>
	//* 158  353:ifnonnull       426
	//* 159  356:aload_0         
	//* 160  357:getfield        #332 <Field OutputStream originalout>
	//* 161  360:aload_0         
	//* 162  361:getfield        #297 <Field byte[] bout>
	//* 163  364:iconst_0        
	//* 164  365:aload_0         
	//* 165  366:getfield        #432 <Field int boutLen>
	//* 166  369:invokevirtual   #433 <Method void OutputStream.write(byte[], int, int)>
	//* 167  372:aload_0         
	//* 168  373:getfield        #129 <Field PdfStamperImp writer>
	//* 169  376:getfield        #233 <Field PdfReader PdfStamperImp.reader>
	//* 170  379:invokevirtual   #325 <Method void PdfReader.close()>
	//* 171  382:aload_0         
	//* 172  383:getfield        #327 <Field File tempFile>
	//* 173  386:ifnull          411
	//* 174  389:aload_0         
	//* 175  390:getfield        #295 <Field RandomAccessFile raf>
	//* 176  393:invokevirtual   #330 <Method void RandomAccessFile.close()>
	//* 177  396:aload_0         
	//* 178  397:getfield        #332 <Field OutputStream originalout>
	//* 179  400:ifnull          411
	//* 180  403:aload_0         
	//* 181  404:getfield        #327 <Field File tempFile>
	//* 182  407:invokevirtual   #338 <Method boolean File.delete()>
	//* 183  410:pop             
	//* 184  411:aload_0         
	//* 185  412:getfield        #332 <Field OutputStream originalout>
	//* 186  415:ifnull          425
	//* 187  418:aload_0         
	//* 188  419:getfield        #332 <Field OutputStream originalout>
	//* 189  422:invokevirtual   #341 <Method void OutputStream.close()>
	//* 190  425:return          
	//* 191  426:aload_0         
	//* 192  427:getfield        #332 <Field OutputStream originalout>
	//* 193  430:ifnull          372
	//* 194  433:aload_0         
	//* 195  434:getfield        #295 <Field RandomAccessFile raf>
	//* 196  437:lconst_0        
	//* 197  438:invokevirtual   #422 <Method void RandomAccessFile.seek(long)>
	//* 198  441:aload_0         
	//* 199  442:getfield        #295 <Field RandomAccessFile raf>
	//* 200  445:invokevirtual   #436 <Method long RandomAccessFile.length()>
	//* 201  448:lstore_3        
	//* 202  449:sipush          8192
	//* 203  452:newarray        byte[]
	//* 204  454:astore_1        
	//* 205  455:lload_3         
	//* 206  456:lconst_0        
	//* 207  457:lcmp            
	//* 208  458:ifle            372
	//* 209  461:aload_0         
	//* 210  462:getfield        #295 <Field RandomAccessFile raf>
	//* 211  465:aload_1         
	//* 212  466:iconst_0        
	//* 213  467:aload_1         
	//* 214  468:arraylength     
	//* 215  469:i2l             
	//* 216  470:lload_3         
	//* 217  471:invokestatic    #442 <Method long Math.min(long, long)>
	//* 218  474:l2i             
	//* 219  475:invokevirtual   #446 <Method int RandomAccessFile.read(byte[], int, int)>
	//* 220  478:istore_2        
	//* 221  479:iload_2         
	//* 222  480:ifge            501
	//* 223  483:new             #448 <Class EOFException>
	//* 224  486:dup             
	//* 225  487:ldc2            #450 <String "unexpected.eof">
	//* 226  490:iconst_0        
	//* 227  491:anewarray       Object[]
	//* 228  494:invokestatic    #322 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 229  497:invokespecial   #451 <Method void EOFException(String)>
	//* 230  500:athrow          
	//* 231  501:aload_0         
	//* 232  502:getfield        #332 <Field OutputStream originalout>
	//* 233  505:aload_1         
	//* 234  506:iconst_0        
	//* 235  507:iload_2         
	//* 236  508:invokevirtual   #433 <Method void OutputStream.write(byte[], int, int)>
	//* 237  511:lload_3         
	//* 238  512:iload_2         
	//* 239  513:i2l             
	//* 240  514:lsub            
	//* 241  515:lstore_3        
	//* 242  516:goto            455
	//* 243  519:astore          5
	//* 244  521:goto            79
	//* 245  524:astore          5
	//* 246  526:goto            65
			catch(Exception exception2) { }
	//  247  529:astore          5
			if(originalout != null)
				try
				{
					tempFile.delete();
				}
				catch(Exception exception1) { }
		}
		if(originalout != null)
			try
			{
				originalout.close();
			}
			// Misplaced declaration of an exception variable
			catch(Exception exception) { }
		throw pdfdictionary;
		bytebuffer = new ByteBuffer();
		iterator = pdfdictionary.getKeys().iterator();
_L1:
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_317;
		pdfname = (PdfName)iterator.next();
		pdfobject = pdfdictionary.get(pdfname);
		pdfliteral = (PdfLiteral)exclusionLocations.get(((Object) (pdfname)));
		if(pdfliteral != null)
			break MISSING_BLOCK_LABEL_176;
		throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.key.1.didn.t.reserve.space.in.preclose", new Object[] {
			pdfname.toString()
		}));
		bytebuffer.reset();
		pdfobject.toPdf(((PdfWriter) (null)), ((OutputStream) (bytebuffer)));
		if(bytebuffer.size() > pdfliteral.getPosLength())
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.key.1.is.too.big.is.2.reserved.3", new Object[] {
				pdfname.toString(), String.valueOf(bytebuffer.size()), String.valueOf(pdfliteral.getPosLength())
			}));
		if(tempFile != null)
			break MISSING_BLOCK_LABEL_284;
		System.arraycopy(((Object) (bytebuffer.getBuffer())), 0, ((Object) (bout)), (int)pdfliteral.getPosition(), bytebuffer.size());
		  goto _L1
		raf.seek(pdfliteral.getPosition());
		raf.write(bytebuffer.getBuffer(), 0, bytebuffer.size());
		  goto _L1
		if(pdfdictionary.size() != exclusionLocations.size())
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.update.dictionary.has.less.keys.than.required", new Object[0]));
		if(tempFile != null) goto _L3; else goto _L2
_L2:
		originalout.write(bout, 0, boutLen);
_L5:
		writer.reader.close();
		if(tempFile != null)
		{
			try
			{
				raf.close();
			}
	//* 248  531:goto            50
	//* 249  534:astore_1        
	//* 250  535:return          
	//* 251  536:astore_1        
	//* 252  537:goto            411
			// Misplaced declaration of an exception variable
			catch(PdfDictionary pdfdictionary) { }
	//  253  540:astore_1        
			if(originalout != null)
				try
				{
					tempFile.delete();
				}
				// Misplaced declaration of an exception variable
				catch(PdfDictionary pdfdictionary) { }
		}
		if(originalout == null)
			break MISSING_BLOCK_LABEL_425;
		originalout.close();
		return;
_L3:
		if(originalout == null) goto _L5; else goto _L4
_L4:
		raf.seek(0L);
		l = raf.length();
		pdfdictionary = ((PdfDictionary) (new byte[8192]));
_L7:
		if(l <= 0L) goto _L5; else goto _L6
_L6:
		i = raf.read(((byte []) (pdfdictionary)), 0, (int)Math.min(pdfdictionary.length, l));
		if(i >= 0)
			break MISSING_BLOCK_LABEL_501;
		throw new EOFException(MessageLocalization.getComposedMessage("unexpected.eof", new Object[0]));
		originalout.write(((byte []) (pdfdictionary)), 0, i);
		l -= i;
		  goto _L7
		  goto _L5
		pdfdictionary;
	//* 254  541:goto            396
	}

	public PdfTemplate getAppearance()
		throws DocumentException
	{
		if(isInvisible())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #456 <Method boolean isInvisible()>
	//*   2    4:ifeq            48
		{
			PdfTemplate pdftemplate = new PdfTemplate(((PdfWriter) (writer)));
	//    3    7:new             #119 <Class PdfTemplate>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #129 <Field PdfStamperImp writer>
	//    7   15:invokespecial   #265 <Method void PdfTemplate(PdfWriter)>
	//    8   18:astore          7
			pdftemplate.setBoundingBox(new Rectangle(0.0F, 0.0F));
	//    9   20:aload           7
	//   10   22:new             #267 <Class Rectangle>
	//   11   25:dup             
	//   12   26:fconst_0        
	//   13   27:fconst_0        
	//   14   28:invokespecial   #271 <Method void Rectangle(float, float)>
	//   15   31:invokevirtual   #275 <Method void PdfTemplate.setBoundingBox(Rectangle)>
			writer.addDirectTemplateSimple(pdftemplate, ((PdfName) (null)));
	//   16   34:aload_0         
	//   17   35:getfield        #129 <Field PdfStamperImp writer>
	//   18   38:aload           7
	//   19   40:aconst_null     
	//   20   41:invokevirtual   #281 <Method PdfName PdfStamperImp.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//   21   44:pop             
			return pdftemplate;
	//   22   45:aload           7
	//   23   47:areturn         
		}
		if(app[0] == null && !reuseAppearance)
	//*  24   48:aload_0         
	//*  25   49:getfield        #121 <Field PdfTemplate[] app>
	//*  26   52:iconst_0        
	//*  27   53:aaload          
	//*  28   54:ifnonnull       68
	//*  29   57:aload_0         
	//*  30   58:getfield        #123 <Field boolean reuseAppearance>
	//*  31   61:ifne            68
			createBlankN0();
	//   32   64:aload_0         
	//   33   65:invokespecial   #458 <Method void createBlankN0()>
		if(app[1] == null && !acro6Layers)
	//*  34   68:aload_0         
	//*  35   69:getfield        #121 <Field PdfTemplate[] app>
	//*  36   72:iconst_1        
	//*  37   73:aaload          
	//*  38   74:ifnonnull       154
	//*  39   77:aload_0         
	//*  40   78:getfield        #117 <Field boolean acro6Layers>
	//*  41   81:ifne            154
		{
			PdfTemplate apdftemplate[] = app;
	//   42   84:aload_0         
	//   43   85:getfield        #121 <Field PdfTemplate[] app>
	//   44   88:astore          7
			PdfTemplate pdftemplate1 = new PdfTemplate(((PdfWriter) (writer)));
	//   45   90:new             #119 <Class PdfTemplate>
	//   46   93:dup             
	//   47   94:aload_0         
	//   48   95:getfield        #129 <Field PdfStamperImp writer>
	//   49   98:invokespecial   #265 <Method void PdfTemplate(PdfWriter)>
	//   50  101:astore          8
			apdftemplate[1] = pdftemplate1;
	//   51  103:aload           7
	//   52  105:iconst_1        
	//   53  106:aload           8
	//   54  108:aastore         
			pdftemplate1.setBoundingBox(new Rectangle(100F, 100F));
	//   55  109:aload           8
	//   56  111:new             #267 <Class Rectangle>
	//   57  114:dup             
	//   58  115:ldc2            #268 <Float 100F>
	//   59  118:ldc2            #268 <Float 100F>
	//   60  121:invokespecial   #271 <Method void Rectangle(float, float)>
	//   61  124:invokevirtual   #275 <Method void PdfTemplate.setBoundingBox(Rectangle)>
			writer.addDirectTemplateSimple(pdftemplate1, new PdfName("n1"));
	//   62  127:aload_0         
	//   63  128:getfield        #129 <Field PdfStamperImp writer>
	//   64  131:aload           8
	//   65  133:new             #159 <Class PdfName>
	//   66  136:dup             
	//   67  137:ldc2            #460 <String "n1">
	//   68  140:invokespecial   #180 <Method void PdfName(String)>
	//   69  143:invokevirtual   #281 <Method PdfName PdfStamperImp.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//   70  146:pop             
			pdftemplate1.setLiteral("% DSUnknown\nq\n1 G\n1 g\n0.1 0 0 0.1 9 0 cm\n0 J 0 j 4 M []0 d\n1 i \n0 g\n313 292 m\n313 404 325 453 432 529 c\n478 561 504 597 504 645 c\n504 736 440 760 391 760 c\n286 760 271 681 265 626 c\n265 625 l\n100 625 l\n100 828 253 898 381 898 c\n451 898 679 878 679 650 c\n679 555 628 499 538 435 c\n488 399 467 376 467 292 c\n313 292 l\nh\n308 214 170 -164 re\nf\n0.44 G\n1.2 w\n1 1 0.4 rg\n287 318 m\n287 430 299 479 406 555 c\n451 587 478 623 478 671 c\n478 762 414 786 365 786 c\n260 786 245 707 239 652 c\n239 651 l\n74 651 l\n74 854 227 924 355 924 c\n425 924 653 904 653 676 c\n653 581 602 525 512 461 c\n462 425 441 402 441 318 c\n287 318 l\nh\n282 240 170 -164 re\nB\nQ\n");
	//   71  147:aload           8
	//   72  149:ldc1            #30  <String "% DSUnknown\nq\n1 G\n1 g\n0.1 0 0 0.1 9 0 cm\n0 J 0 j 4 M []0 d\n1 i \n0 g\n313 292 m\n313 404 325 453 432 529 c\n478 561 504 597 504 645 c\n504 736 440 760 391 760 c\n286 760 271 681 265 626 c\n265 625 l\n100 625 l\n100 828 253 898 381 898 c\n451 898 679 878 679 650 c\n679 555 628 499 538 435 c\n488 399 467 376 467 292 c\n313 292 l\nh\n308 214 170 -164 re\nf\n0.44 G\n1.2 w\n1 1 0.4 rg\n287 318 m\n287 430 299 479 406 555 c\n451 587 478 623 478 671 c\n478 762 414 786 365 786 c\n260 786 245 707 239 652 c\n239 651 l\n74 651 l\n74 854 227 924 355 924 c\n425 924 653 904 653 676 c\n653 581 602 525 512 461 c\n462 425 441 402 441 318 c\n287 318 l\nh\n282 240 170 -164 re\nB\nQ\n">
	//   73  151:invokevirtual   #286 <Method void PdfTemplate.setLiteral(String)>
		}
		if(app[2] != null) goto _L2; else goto _L1
	//   74  154:aload_0         
	//   75  155:getfield        #121 <Field PdfTemplate[] app>
	//   76  158:iconst_2        
	//   77  159:aaload          
	//   78  160:ifnonnull       820
_L1:
		int j;
		Object obj1;
		Object obj2;
		Font font;
		PdfTemplate pdftemplate2;
		static class _cls1
		{

			static final int $SwitchMap$com$itextpdf$text$pdf$PdfSignatureAppearance$RenderingMode[];

			static 
			{
				$SwitchMap$com$itextpdf$text$pdf$PdfSignatureAppearance$RenderingMode = new int[RenderingMode.values().length];
			//    0    0:invokestatic    #18  <Method PdfSignatureAppearance$RenderingMode[] PdfSignatureAppearance$RenderingMode.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PdfSignatureAppearance$RenderingMode>
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PdfSignatureAppearance$RenderingMode[RenderingMode.NAME_AND_DESCRIPTION.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PdfSignatureAppearance$RenderingMode>
			//    5   12:getstatic       #24  <Field PdfSignatureAppearance$RenderingMode PdfSignatureAppearance$RenderingMode.NAME_AND_DESCRIPTION>
			//    6   15:invokevirtual   #28  <Method int PdfSignatureAppearance$RenderingMode.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PdfSignatureAppearance$RenderingMode>
			//*  10   23:getstatic       #31  <Field PdfSignatureAppearance$RenderingMode PdfSignatureAppearance$RenderingMode.GRAPHIC_AND_DESCRIPTION>
			//*  11   26:invokevirtual   #28  <Method int PdfSignatureAppearance$RenderingMode.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PdfSignatureAppearance$RenderingMode>
			//*  15   34:getstatic       #34  <Field PdfSignatureAppearance$RenderingMode PdfSignatureAppearance$RenderingMode.GRAPHIC>
			//*  16   37:invokevirtual   #28  <Method int PdfSignatureAppearance$RenderingMode.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
			//*  20   43:astore_0        
			//*  21   44:return          
			//*  22   45:astore_0        
			//*  23   46:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   49:astore_0        
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PdfSignatureAppearance$RenderingMode[RenderingMode.GRAPHIC_AND_DESCRIPTION.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PdfSignatureAppearance$RenderingMode[RenderingMode.GRAPHIC.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  25   50:goto            20
			}
		}

		float f;
		int i;
		PdfTemplate apdftemplate1[];
		Object obj4;
		Object obj6;
		if(layer2Text == null)
	//*  79  163:aload_0         
	//*  80  164:getfield        #462 <Field String layer2Text>
	//*  81  167:ifnonnull       1206
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   82  170:new             #464 <Class StringBuilder>
	//   83  173:dup             
	//   84  174:invokespecial   #465 <Method void StringBuilder()>
	//   85  177:astore          9
			stringbuilder.append("Digitally signed by ");
	//   86  179:aload           9
	//   87  181:ldc2            #467 <String "Digitally signed by ">
	//   88  184:invokevirtual   #471 <Method StringBuilder StringBuilder.append(String)>
	//   89  187:pop             
			Object obj = null;
	//   90  188:aconst_null     
	//   91  189:astore          7
			obj6 = ((Object) (CertificateInfo.getSubjectFields((X509Certificate)signCertificate)));
	//   92  191:aload_0         
	//   93  192:getfield        #473 <Field Certificate signCertificate>
	//   94  195:checkcast       #475 <Class X509Certificate>
	//   95  198:invokestatic    #481 <Method com.itextpdf.text.pdf.security.CertificateInfo$X500Name CertificateInfo.getSubjectFields(X509Certificate)>
	//   96  201:astore          10
			if(obj6 != null)
	//*  97  203:aload           10
	//*  98  205:ifnull          237
			{
				String s = ((com.itextpdf.text.pdf.security.CertificateInfo.X500Name) (obj6)).getField("CN");
	//   99  208:aload           10
	//  100  210:ldc2            #483 <String "CN">
	//  101  213:invokevirtual   #489 <Method String com.itextpdf.text.pdf.security.CertificateInfo$X500Name.getField(String)>
	//  102  216:astore          8
				obj = ((Object) (s));
	//  103  218:aload           8
	//  104  220:astore          7
				if(s == null)
	//* 105  222:aload           8
	//* 106  224:ifnonnull       237
					obj = ((Object) (((com.itextpdf.text.pdf.security.CertificateInfo.X500Name) (obj6)).getField("E")));
	//  107  227:aload           10
	//  108  229:ldc2            #491 <String "E">
	//  109  232:invokevirtual   #489 <Method String com.itextpdf.text.pdf.security.CertificateInfo$X500Name.getField(String)>
	//  110  235:astore          7
			}
			String s1 = ((String) (obj));
	//  111  237:aload           7
	//  112  239:astore          8
			if(obj == null)
	//* 113  241:aload           7
	//* 114  243:ifnonnull       251
				s1 = "";
	//  115  246:ldc2            #493 <String "">
	//  116  249:astore          8
			stringbuilder.append(s1).append('\n');
	//  117  251:aload           9
	//  118  253:aload           8
	//  119  255:invokevirtual   #471 <Method StringBuilder StringBuilder.append(String)>
	//  120  258:bipush          10
	//  121  260:invokevirtual   #496 <Method StringBuilder StringBuilder.append(char)>
	//  122  263:pop             
			obj = ((Object) (new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z")));
	//  123  264:new             #498 <Class SimpleDateFormat>
	//  124  267:dup             
	//  125  268:ldc2            #500 <String "yyyy.MM.dd HH:mm:ss z">
	//  126  271:invokespecial   #501 <Method void SimpleDateFormat(String)>
	//  127  274:astore          7
			stringbuilder.append("Date: ").append(((SimpleDateFormat) (obj)).format(signDate.getTime()));
	//  128  276:aload           9
	//  129  278:ldc2            #503 <String "Date: ">
	//  130  281:invokevirtual   #471 <Method StringBuilder StringBuilder.append(String)>
	//  131  284:aload           7
	//  132  286:aload_0         
	//  133  287:getfield        #134 <Field Calendar signDate>
	//  134  290:invokevirtual   #509 <Method java.util.Date Calendar.getTime()>
	//  135  293:invokevirtual   #513 <Method String SimpleDateFormat.format(java.util.Date)>
	//  136  296:invokevirtual   #471 <Method StringBuilder StringBuilder.append(String)>
	//  137  299:pop             
			if(reason != null)
	//* 138  300:aload_0         
	//* 139  301:getfield        #515 <Field String reason>
	//* 140  304:ifnull          329
				stringbuilder.append('\n').append(reasonCaption).append(reason);
	//  141  307:aload           9
	//  142  309:bipush          10
	//  143  311:invokevirtual   #496 <Method StringBuilder StringBuilder.append(char)>
	//  144  314:aload_0         
	//  145  315:getfield        #102 <Field String reasonCaption>
	//  146  318:invokevirtual   #471 <Method StringBuilder StringBuilder.append(String)>
	//  147  321:aload_0         
	//  148  322:getfield        #515 <Field String reason>
	//  149  325:invokevirtual   #471 <Method StringBuilder StringBuilder.append(String)>
	//  150  328:pop             
			if(location != null)
	//* 151  329:aload_0         
	//* 152  330:getfield        #517 <Field String location>
	//* 153  333:ifnull          358
				stringbuilder.append('\n').append(locationCaption).append(location);
	//  154  336:aload           9
	//  155  338:bipush          10
	//  156  340:invokevirtual   #496 <Method StringBuilder StringBuilder.append(char)>
	//  157  343:aload_0         
	//  158  344:getfield        #106 <Field String locationCaption>
	//  159  347:invokevirtual   #471 <Method StringBuilder StringBuilder.append(String)>
	//  160  350:aload_0         
	//  161  351:getfield        #517 <Field String location>
	//  162  354:invokevirtual   #471 <Method StringBuilder StringBuilder.append(String)>
	//  163  357:pop             
			obj6 = ((Object) (stringbuilder.toString()));
	//  164  358:aload           9
	//  165  360:invokevirtual   #518 <Method String StringBuilder.toString()>
	//  166  363:astore          10
		} else
	//* 167  365:aload_0         
	//* 168  366:getfield        #121 <Field PdfTemplate[] app>
	//* 169  369:astore          7
	//* 170  371:new             #119 <Class PdfTemplate>
	//* 171  374:dup             
	//* 172  375:aload_0         
	//* 173  376:getfield        #129 <Field PdfStamperImp writer>
	//* 174  379:invokespecial   #265 <Method void PdfTemplate(PdfWriter)>
	//* 175  382:astore          13
	//* 176  384:aload           7
	//* 177  386:iconst_2        
	//* 178  387:aload           13
	//* 179  389:aastore         
	//* 180  390:aload           13
	//* 181  392:aload_0         
	//* 182  393:getfield        #520 <Field Rectangle rect>
	//* 183  396:invokevirtual   #275 <Method void PdfTemplate.setBoundingBox(Rectangle)>
	//* 184  399:aload_0         
	//* 185  400:getfield        #129 <Field PdfStamperImp writer>
	//* 186  403:aload           13
	//* 187  405:new             #159 <Class PdfName>
	//* 188  408:dup             
	//* 189  409:ldc2            #522 <String "n2">
	//* 190  412:invokespecial   #180 <Method void PdfName(String)>
	//* 191  415:invokevirtual   #281 <Method PdfName PdfStamperImp.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//* 192  418:pop             
	//* 193  419:aload_0         
	//* 194  420:getfield        #524 <Field Image image>
	//* 195  423:ifnull          462
	//* 196  426:aload_0         
	//* 197  427:getfield        #526 <Field float imageScale>
	//* 198  430:fconst_0        
	//* 199  431:fcmpl           
	//* 200  432:ifne            1215
	//* 201  435:aload           13
	//* 202  437:aload_0         
	//* 203  438:getfield        #524 <Field Image image>
	//* 204  441:aload_0         
	//* 205  442:getfield        #520 <Field Rectangle rect>
	//* 206  445:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 207  448:fconst_0        
	//* 208  449:fconst_0        
	//* 209  450:aload_0         
	//* 210  451:getfield        #520 <Field Rectangle rect>
	//* 211  454:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 212  457:fconst_0        
	//* 213  458:fconst_0        
	//* 214  459:invokevirtual   #537 <Method void PdfTemplate.addImage(Image, float, float, float, float, float, float)>
	//* 215  462:aload_0         
	//* 216  463:getfield        #539 <Field Font layer2Font>
	//* 217  466:ifnonnull       1327
	//* 218  469:new             #541 <Class Font>
	//* 219  472:dup             
	//* 220  473:invokespecial   #542 <Method void Font()>
	//* 221  476:astore          11
	//* 222  478:aload           11
	//* 223  480:invokevirtual   #545 <Method float Font.getSize()>
	//* 224  483:fstore_1        
	//* 225  484:aconst_null     
	//* 226  485:astore          7
	//* 227  487:aconst_null     
	//* 228  488:astore          8
	//* 229  490:aload_0         
	//* 230  491:getfield        #113 <Field PdfSignatureAppearance$RenderingMode renderingMode>
	//* 231  494:getstatic       #548 <Field PdfSignatureAppearance$RenderingMode PdfSignatureAppearance$RenderingMode.NAME_AND_DESCRIPTION>
	//* 232  497:if_acmpeq       517
	//* 233  500:aload_0         
	//* 234  501:getfield        #113 <Field PdfSignatureAppearance$RenderingMode renderingMode>
	//* 235  504:getstatic       #551 <Field PdfSignatureAppearance$RenderingMode PdfSignatureAppearance$RenderingMode.GRAPHIC_AND_DESCRIPTION>
	//* 236  507:if_acmpne       1343
	//* 237  510:aload_0         
	//* 238  511:getfield        #115 <Field Image signatureGraphic>
	//* 239  514:ifnull          1343
	//* 240  517:new             #267 <Class Rectangle>
	//* 241  520:dup             
	//* 242  521:fconst_2        
	//* 243  522:fconst_2        
	//* 244  523:aload_0         
	//* 245  524:getfield        #520 <Field Rectangle rect>
	//* 246  527:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 247  530:fconst_2        
	//* 248  531:fdiv            
	//* 249  532:fconst_2        
	//* 250  533:fsub            
	//* 251  534:aload_0         
	//* 252  535:getfield        #520 <Field Rectangle rect>
	//* 253  538:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 254  541:fconst_2        
	//* 255  542:fsub            
	//* 256  543:invokespecial   #554 <Method void Rectangle(float, float, float, float)>
	//* 257  546:astore          8
	//* 258  548:new             #267 <Class Rectangle>
	//* 259  551:dup             
	//* 260  552:aload_0         
	//* 261  553:getfield        #520 <Field Rectangle rect>
	//* 262  556:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 263  559:fconst_2        
	//* 264  560:fdiv            
	//* 265  561:fconst_1        
	//* 266  562:fadd            
	//* 267  563:fconst_2        
	//* 268  564:aload_0         
	//* 269  565:getfield        #520 <Field Rectangle rect>
	//* 270  568:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 271  571:fconst_1        
	//* 272  572:fsub            
	//* 273  573:aload_0         
	//* 274  574:getfield        #520 <Field Rectangle rect>
	//* 275  577:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 276  580:fconst_2        
	//* 277  581:fsub            
	//* 278  582:invokespecial   #554 <Method void Rectangle(float, float, float, float)>
	//* 279  585:astore          7
	//* 280  587:aload_0         
	//* 281  588:getfield        #520 <Field Rectangle rect>
	//* 282  591:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 283  594:aload_0         
	//* 284  595:getfield        #520 <Field Rectangle rect>
	//* 285  598:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 286  601:fcmpl           
	//* 287  602:ifle            671
	//* 288  605:new             #267 <Class Rectangle>
	//* 289  608:dup             
	//* 290  609:fconst_2        
	//* 291  610:aload_0         
	//* 292  611:getfield        #520 <Field Rectangle rect>
	//* 293  614:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 294  617:fconst_2        
	//* 295  618:fdiv            
	//* 296  619:aload_0         
	//* 297  620:getfield        #520 <Field Rectangle rect>
	//* 298  623:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 299  626:fconst_2        
	//* 300  627:fsub            
	//* 301  628:aload_0         
	//* 302  629:getfield        #520 <Field Rectangle rect>
	//* 303  632:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 304  635:invokespecial   #554 <Method void Rectangle(float, float, float, float)>
	//* 305  638:astore          8
	//* 306  640:new             #267 <Class Rectangle>
	//* 307  643:dup             
	//* 308  644:fconst_2        
	//* 309  645:fconst_2        
	//* 310  646:aload_0         
	//* 311  647:getfield        #520 <Field Rectangle rect>
	//* 312  650:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 313  653:fconst_2        
	//* 314  654:fsub            
	//* 315  655:aload_0         
	//* 316  656:getfield        #520 <Field Rectangle rect>
	//* 317  659:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 318  662:fconst_2        
	//* 319  663:fdiv            
	//* 320  664:fconst_2        
	//* 321  665:fsub            
	//* 322  666:invokespecial   #554 <Method void Rectangle(float, float, float, float)>
	//* 323  669:astore          7
	//* 324  671:getstatic       #558 <Field int[] PdfSignatureAppearance$1.$SwitchMap$com$itextpdf$text$pdf$PdfSignatureAppearance$RenderingMode>
	//* 325  674:aload_0         
	//* 326  675:getfield        #113 <Field PdfSignatureAppearance$RenderingMode renderingMode>
	//* 327  678:invokevirtual   #561 <Method int PdfSignatureAppearance$RenderingMode.ordinal()>
	//* 328  681:iaload          
	//* 329  682:tableswitch     1 3: default 708
	//	               1 1446
	//	               2 1608
	//	               3 1806
	//* 330  708:aload_0         
	//* 331  709:getfield        #113 <Field PdfSignatureAppearance$RenderingMode renderingMode>
	//* 332  712:getstatic       #564 <Field PdfSignatureAppearance$RenderingMode PdfSignatureAppearance$RenderingMode.GRAPHIC>
	//* 333  715:if_acmpeq       820
	//* 334  718:fload_1         
	//* 335  719:fconst_0        
	//* 336  720:fcmpg           
	//* 337  721:ifgt            2393
	//* 338  724:aload           11
	//* 339  726:aload           10
	//* 340  728:new             #267 <Class Rectangle>
	//* 341  731:dup             
	//* 342  732:aload           7
	//* 343  734:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 344  737:aload           7
	//* 345  739:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 346  742:invokespecial   #271 <Method void Rectangle(float, float)>
	//* 347  745:ldc2            #565 <Float 12F>
	//* 348  748:aload_0         
	//* 349  749:getfield        #125 <Field int runDirection>
	//* 350  752:invokestatic    #571 <Method float ColumnText.fitText(Font, String, Rectangle, float, int)>
	//* 351  755:fstore_1        
	//* 352  756:new             #567 <Class ColumnText>
	//* 353  759:dup             
	//* 354  760:aload           13
	//* 355  762:invokespecial   #574 <Method void ColumnText(PdfContentByte)>
	//* 356  765:astore          8
	//* 357  767:aload           8
	//* 358  769:aload_0         
	//* 359  770:getfield        #125 <Field int runDirection>
	//* 360  773:invokevirtual   #577 <Method void ColumnText.setRunDirection(int)>
	//* 361  776:aload           8
	//* 362  778:new             #579 <Class Phrase>
	//* 363  781:dup             
	//* 364  782:aload           10
	//* 365  784:aload           11
	//* 366  786:invokespecial   #582 <Method void Phrase(String, Font)>
	//* 367  789:aload           7
	//* 368  791:invokevirtual   #585 <Method float Rectangle.getLeft()>
	//* 369  794:aload           7
	//* 370  796:invokevirtual   #588 <Method float Rectangle.getBottom()>
	//* 371  799:aload           7
	//* 372  801:invokevirtual   #591 <Method float Rectangle.getRight()>
	//* 373  804:aload           7
	//* 374  806:invokevirtual   #594 <Method float Rectangle.getTop()>
	//* 375  809:fload_1         
	//* 376  810:iconst_0        
	//* 377  811:invokevirtual   #598 <Method void ColumnText.setSimpleColumn(Phrase, float, float, float, float, float, int)>
	//* 378  814:aload           8
	//* 379  816:invokevirtual   #601 <Method int ColumnText.go()>
	//* 380  819:pop             
	//* 381  820:aload_0         
	//* 382  821:getfield        #121 <Field PdfTemplate[] app>
	//* 383  824:iconst_3        
	//* 384  825:aaload          
	//* 385  826:ifnonnull       907
	//* 386  829:aload_0         
	//* 387  830:getfield        #117 <Field boolean acro6Layers>
	//* 388  833:ifne            907
	//* 389  836:aload_0         
	//* 390  837:getfield        #121 <Field PdfTemplate[] app>
	//* 391  840:astore          7
	//* 392  842:new             #119 <Class PdfTemplate>
	//* 393  845:dup             
	//* 394  846:aload_0         
	//* 395  847:getfield        #129 <Field PdfStamperImp writer>
	//* 396  850:invokespecial   #265 <Method void PdfTemplate(PdfWriter)>
	//* 397  853:astore          8
	//* 398  855:aload           7
	//* 399  857:iconst_3        
	//* 400  858:aload           8
	//* 401  860:aastore         
	//* 402  861:aload           8
	//* 403  863:new             #267 <Class Rectangle>
	//* 404  866:dup             
	//* 405  867:ldc2            #268 <Float 100F>
	//* 406  870:ldc2            #268 <Float 100F>
	//* 407  873:invokespecial   #271 <Method void Rectangle(float, float)>
	//* 408  876:invokevirtual   #275 <Method void PdfTemplate.setBoundingBox(Rectangle)>
	//* 409  879:aload_0         
	//* 410  880:getfield        #129 <Field PdfStamperImp writer>
	//* 411  883:aload           8
	//* 412  885:new             #159 <Class PdfName>
	//* 413  888:dup             
	//* 414  889:ldc2            #603 <String "n3">
	//* 415  892:invokespecial   #180 <Method void PdfName(String)>
	//* 416  895:invokevirtual   #281 <Method PdfName PdfStamperImp.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//* 417  898:pop             
	//* 418  899:aload           8
	//* 419  901:ldc2            #283 <String "% DSBlank\n">
	//* 420  904:invokevirtual   #286 <Method void PdfTemplate.setLiteral(String)>
	//* 421  907:aload_0         
	//* 422  908:getfield        #121 <Field PdfTemplate[] app>
	//* 423  911:iconst_4        
	//* 424  912:aaload          
	//* 425  913:ifnonnull       1151
	//* 426  916:aload_0         
	//* 427  917:getfield        #117 <Field boolean acro6Layers>
	//* 428  920:ifne            1151
	//* 429  923:aload_0         
	//* 430  924:getfield        #121 <Field PdfTemplate[] app>
	//* 431  927:astore          7
	//* 432  929:new             #119 <Class PdfTemplate>
	//* 433  932:dup             
	//* 434  933:aload_0         
	//* 435  934:getfield        #129 <Field PdfStamperImp writer>
	//* 436  937:invokespecial   #265 <Method void PdfTemplate(PdfWriter)>
	//* 437  940:astore          9
	//* 438  942:aload           7
	//* 439  944:iconst_4        
	//* 440  945:aload           9
	//* 441  947:aastore         
	//* 442  948:aload           9
	//* 443  950:new             #267 <Class Rectangle>
	//* 444  953:dup             
	//* 445  954:fconst_0        
	//* 446  955:aload_0         
	//* 447  956:getfield        #520 <Field Rectangle rect>
	//* 448  959:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 449  962:ldc2            #604 <Float 0.7F>
	//* 450  965:fmul            
	//* 451  966:aload_0         
	//* 452  967:getfield        #520 <Field Rectangle rect>
	//* 453  970:invokevirtual   #591 <Method float Rectangle.getRight()>
	//* 454  973:aload_0         
	//* 455  974:getfield        #520 <Field Rectangle rect>
	//* 456  977:invokevirtual   #594 <Method float Rectangle.getTop()>
	//* 457  980:invokespecial   #554 <Method void Rectangle(float, float, float, float)>
	//* 458  983:invokevirtual   #275 <Method void PdfTemplate.setBoundingBox(Rectangle)>
	//* 459  986:aload_0         
	//* 460  987:getfield        #129 <Field PdfStamperImp writer>
	//* 461  990:aload           9
	//* 462  992:new             #159 <Class PdfName>
	//* 463  995:dup             
	//* 464  996:ldc2            #606 <String "n4">
	//* 465  999:invokespecial   #180 <Method void PdfName(String)>
	//* 466 1002:invokevirtual   #281 <Method PdfName PdfStamperImp.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//* 467 1005:pop             
	//* 468 1006:aload_0         
	//* 469 1007:getfield        #539 <Field Font layer2Font>
	//* 470 1010:ifnonnull       1949
	//* 471 1013:new             #541 <Class Font>
	//* 472 1016:dup             
	//* 473 1017:invokespecial   #542 <Method void Font()>
	//* 474 1020:astore          7
	//* 475 1022:ldc2            #608 <String "Signature Not Verified">
	//* 476 1025:astore          8
	//* 477 1027:aload_0         
	//* 478 1028:getfield        #610 <Field String layer4Text>
	//* 479 1031:ifnull          1040
	//* 480 1034:aload_0         
	//* 481 1035:getfield        #610 <Field String layer4Text>
	//* 482 1038:astore          8
	//* 483 1040:aload           7
	//* 484 1042:aload           8
	//* 485 1044:new             #267 <Class Rectangle>
	//* 486 1047:dup             
	//* 487 1048:aload_0         
	//* 488 1049:getfield        #520 <Field Rectangle rect>
	//* 489 1052:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 490 1055:ldc2            #611 <Float 4F>
	//* 491 1058:fsub            
	//* 492 1059:aload_0         
	//* 493 1060:getfield        #520 <Field Rectangle rect>
	//* 494 1063:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 495 1066:ldc1            #26  <Float 0.3F>
	//* 496 1068:fmul            
	//* 497 1069:ldc2            #611 <Float 4F>
	//* 498 1072:fsub            
	//* 499 1073:invokespecial   #271 <Method void Rectangle(float, float)>
	//* 500 1076:ldc2            #612 <Float 15F>
	//* 501 1079:aload_0         
	//* 502 1080:getfield        #125 <Field int runDirection>
	//* 503 1083:invokestatic    #571 <Method float ColumnText.fitText(Font, String, Rectangle, float, int)>
	//* 504 1086:fstore_1        
	//* 505 1087:new             #567 <Class ColumnText>
	//* 506 1090:dup             
	//* 507 1091:aload           9
	//* 508 1093:invokespecial   #574 <Method void ColumnText(PdfContentByte)>
	//* 509 1096:astore          9
	//* 510 1098:aload           9
	//* 511 1100:aload_0         
	//* 512 1101:getfield        #125 <Field int runDirection>
	//* 513 1104:invokevirtual   #577 <Method void ColumnText.setRunDirection(int)>
	//* 514 1107:aload           9
	//* 515 1109:new             #579 <Class Phrase>
	//* 516 1112:dup             
	//* 517 1113:aload           8
	//* 518 1115:aload           7
	//* 519 1117:invokespecial   #582 <Method void Phrase(String, Font)>
	//* 520 1120:fconst_2        
	//* 521 1121:fconst_0        
	//* 522 1122:aload_0         
	//* 523 1123:getfield        #520 <Field Rectangle rect>
	//* 524 1126:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 525 1129:fconst_2        
	//* 526 1130:fsub            
	//* 527 1131:aload_0         
	//* 528 1132:getfield        #520 <Field Rectangle rect>
	//* 529 1135:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 530 1138:fconst_2        
	//* 531 1139:fsub            
	//* 532 1140:fload_1         
	//* 533 1141:iconst_0        
	//* 534 1142:invokevirtual   #598 <Method void ColumnText.setSimpleColumn(Phrase, float, float, float, float, float, int)>
	//* 535 1145:aload           9
	//* 536 1147:invokevirtual   #601 <Method int ColumnText.go()>
	//* 537 1150:pop             
	//* 538 1151:aload_0         
	//* 539 1152:getfield        #129 <Field PdfStamperImp writer>
	//* 540 1155:getfield        #233 <Field PdfReader PdfStamperImp.reader>
	//* 541 1158:aload_0         
	//* 542 1159:getfield        #108 <Field int page>
	//* 543 1162:invokevirtual   #616 <Method int PdfReader.getPageRotation(int)>
	//* 544 1165:istore          6
	//* 545 1167:new             #267 <Class Rectangle>
	//* 546 1170:dup             
	//* 547 1171:aload_0         
	//* 548 1172:getfield        #520 <Field Rectangle rect>
	//* 549 1175:invokespecial   #618 <Method void Rectangle(Rectangle)>
	//* 550 1178:astore          7
	//* 551 1180:iload           6
	//* 552 1182:istore          5
	//* 553 1184:iload           5
	//* 554 1186:ifle            1965
	//* 555 1189:aload           7
	//* 556 1191:invokevirtual   #622 <Method Rectangle Rectangle.rotate()>
	//* 557 1194:astore          7
	//* 558 1196:iload           5
	//* 559 1198:bipush          90
	//* 560 1200:isub            
	//* 561 1201:istore          5
	//* 562 1203:goto            1184
		{
			obj6 = ((Object) (layer2Text));
	//  563 1206:aload_0         
	//  564 1207:getfield        #462 <Field String layer2Text>
	//  565 1210:astore          10
		}
		apdftemplate1 = app;
		pdftemplate2 = new PdfTemplate(((PdfWriter) (writer)));
		apdftemplate1[2] = pdftemplate2;
		pdftemplate2.setBoundingBox(rect);
		writer.addDirectTemplateSimple(pdftemplate2, new PdfName("n2"));
		if(image != null)
			if(imageScale == 0.0F)
			{
				pdftemplate2.addImage(image, rect.getWidth(), 0.0F, 0.0F, rect.getHeight(), 0.0F, 0.0F);
			} else
	//* 566 1212:goto            365
			{
				float f1 = imageScale;
	//  567 1215:aload_0         
	//  568 1216:getfield        #526 <Field float imageScale>
	//  569 1219:fstore_1        
				if(imageScale < 0.0F)
	//* 570 1220:aload_0         
	//* 571 1221:getfield        #526 <Field float imageScale>
	//* 572 1224:fconst_0        
	//* 573 1225:fcmpg           
	//* 574 1226:ifge            1263
					f1 = Math.min(rect.getWidth() / image.getWidth(), rect.getHeight() / image.getHeight());
	//  575 1229:aload_0         
	//  576 1230:getfield        #520 <Field Rectangle rect>
	//  577 1233:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//  578 1236:aload_0         
	//  579 1237:getfield        #524 <Field Image image>
	//  580 1240:invokevirtual   #625 <Method float Image.getWidth()>
	//  581 1243:fdiv            
	//  582 1244:aload_0         
	//  583 1245:getfield        #520 <Field Rectangle rect>
	//  584 1248:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//  585 1251:aload_0         
	//  586 1252:getfield        #524 <Field Image image>
	//  587 1255:invokevirtual   #626 <Method float Image.getHeight()>
	//  588 1258:fdiv            
	//  589 1259:invokestatic    #629 <Method float Math.min(float, float)>
	//  590 1262:fstore_1        
				float f3 = image.getWidth() * f1;
	//  591 1263:aload_0         
	//  592 1264:getfield        #524 <Field Image image>
	//  593 1267:invokevirtual   #625 <Method float Image.getWidth()>
	//  594 1270:fload_1         
	//  595 1271:fmul            
	//  596 1272:fstore_2        
				f1 = image.getHeight() * f1;
	//  597 1273:aload_0         
	//  598 1274:getfield        #524 <Field Image image>
	//  599 1277:invokevirtual   #626 <Method float Image.getHeight()>
	//  600 1280:fload_1         
	//  601 1281:fmul            
	//  602 1282:fstore_1        
				float f6 = (rect.getWidth() - f3) / 2.0F;
	//  603 1283:aload_0         
	//  604 1284:getfield        #520 <Field Rectangle rect>
	//  605 1287:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//  606 1290:fload_2         
	//  607 1291:fsub            
	//  608 1292:fconst_2        
	//  609 1293:fdiv            
	//  610 1294:fstore_3        
				float f9 = (rect.getHeight() - f1) / 2.0F;
	//  611 1295:aload_0         
	//  612 1296:getfield        #520 <Field Rectangle rect>
	//  613 1299:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//  614 1302:fload_1         
	//  615 1303:fsub            
	//  616 1304:fconst_2        
	//  617 1305:fdiv            
	//  618 1306:fstore          4
				pdftemplate2.addImage(image, f3, 0.0F, 0.0F, f1, f6, f9);
	//  619 1308:aload           13
	//  620 1310:aload_0         
	//  621 1311:getfield        #524 <Field Image image>
	//  622 1314:fload_2         
	//  623 1315:fconst_0        
	//  624 1316:fconst_0        
	//  625 1317:fload_1         
	//  626 1318:fload_3         
	//  627 1319:fload           4
	//  628 1321:invokevirtual   #537 <Method void PdfTemplate.addImage(Image, float, float, float, float, float, float)>
			}
		if(layer2Font == null)
			font = new Font();
		else
	//* 629 1324:goto            462
			font = new Font(layer2Font);
	//  630 1327:new             #541 <Class Font>
	//  631 1330:dup             
	//  632 1331:aload_0         
	//  633 1332:getfield        #539 <Field Font layer2Font>
	//  634 1335:invokespecial   #632 <Method void Font(Font)>
	//  635 1338:astore          11
		f = font.getSize();
		obj1 = null;
		obj2 = null;
		if(renderingMode == RenderingMode.NAME_AND_DESCRIPTION || renderingMode == RenderingMode.GRAPHIC_AND_DESCRIPTION && signatureGraphic != null)
		{
			obj2 = ((Object) (new Rectangle(2.0F, 2.0F, rect.getWidth() / 2.0F - 2.0F, rect.getHeight() - 2.0F)));
			obj1 = ((Object) (new Rectangle(rect.getWidth() / 2.0F + 1.0F, 2.0F, rect.getWidth() - 1.0F, rect.getHeight() - 2.0F)));
			if(rect.getHeight() > rect.getWidth())
			{
				obj2 = ((Object) (new Rectangle(2.0F, rect.getHeight() / 2.0F, rect.getWidth() - 2.0F, rect.getHeight())));
				obj1 = ((Object) (new Rectangle(2.0F, 2.0F, rect.getWidth() - 2.0F, rect.getHeight() / 2.0F - 2.0F)));
			}
		} else
	//* 636 1340:goto            478
		if(renderingMode == RenderingMode.GRAPHIC)
	//* 637 1343:aload_0         
	//* 638 1344:getfield        #113 <Field PdfSignatureAppearance$RenderingMode renderingMode>
	//* 639 1347:getstatic       #564 <Field PdfSignatureAppearance$RenderingMode PdfSignatureAppearance$RenderingMode.GRAPHIC>
	//* 640 1350:if_acmpne       1410
		{
			if(signatureGraphic == null)
	//* 641 1353:aload_0         
	//* 642 1354:getfield        #115 <Field Image signatureGraphic>
	//* 643 1357:ifnonnull       1378
				throw new IllegalStateException(MessageLocalization.getComposedMessage("a.signature.image.should.be.present.when.rendering.mode.is.graphic.only", new Object[0]));
	//  644 1360:new             #634 <Class IllegalStateException>
	//  645 1363:dup             
	//  646 1364:ldc2            #636 <String "a.signature.image.should.be.present.when.rendering.mode.is.graphic.only">
	//  647 1367:iconst_0        
	//  648 1368:anewarray       Object[]
	//  649 1371:invokestatic    #322 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  650 1374:invokespecial   #637 <Method void IllegalStateException(String)>
	//  651 1377:athrow          
			obj2 = ((Object) (new Rectangle(2.0F, 2.0F, rect.getWidth() - 2.0F, rect.getHeight() - 2.0F)));
	//  652 1378:new             #267 <Class Rectangle>
	//  653 1381:dup             
	//  654 1382:fconst_2        
	//  655 1383:fconst_2        
	//  656 1384:aload_0         
	//  657 1385:getfield        #520 <Field Rectangle rect>
	//  658 1388:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//  659 1391:fconst_2        
	//  660 1392:fsub            
	//  661 1393:aload_0         
	//  662 1394:getfield        #520 <Field Rectangle rect>
	//  663 1397:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//  664 1400:fconst_2        
	//  665 1401:fsub            
	//  666 1402:invokespecial   #554 <Method void Rectangle(float, float, float, float)>
	//  667 1405:astore          8
		} else
	//* 668 1407:goto            671
		{
			obj1 = ((Object) (new Rectangle(2.0F, 2.0F, rect.getWidth() - 2.0F, rect.getHeight() * 0.7F - 2.0F)));
	//  669 1410:new             #267 <Class Rectangle>
	//  670 1413:dup             
	//  671 1414:fconst_2        
	//  672 1415:fconst_2        
	//  673 1416:aload_0         
	//  674 1417:getfield        #520 <Field Rectangle rect>
	//  675 1420:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//  676 1423:fconst_2        
	//  677 1424:fsub            
	//  678 1425:aload_0         
	//  679 1426:getfield        #520 <Field Rectangle rect>
	//  680 1429:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//  681 1432:ldc2            #604 <Float 0.7F>
	//  682 1435:fmul            
	//  683 1436:fconst_2        
	//  684 1437:fsub            
	//  685 1438:invokespecial   #554 <Method void Rectangle(float, float, float, float)>
	//  686 1441:astore          7
		}
		_cls1..SwitchMap.com.itextpdf.text.pdf.PdfSignatureAppearance.RenderingMode[renderingMode.ordinal()];
		JVM INSTR tableswitch 1 3: default 708
	//	               1 1446
	//	               2 1608
	//	               3 1806;
		   goto _L3 _L4 _L5 _L6
_L3:
		if(renderingMode != RenderingMode.GRAPHIC)
		{
			if(f <= 0.0F)
				f = ColumnText.fitText(font, ((String) (obj6)), new Rectangle(((Rectangle) (obj1)).getWidth(), ((Rectangle) (obj1)).getHeight()), 12F, runDirection);
			obj2 = ((Object) (new ColumnText(((PdfContentByte) (pdftemplate2)))));
			((ColumnText) (obj2)).setRunDirection(runDirection);
			((ColumnText) (obj2)).setSimpleColumn(new Phrase(((String) (obj6)), font), ((Rectangle) (obj1)).getLeft(), ((Rectangle) (obj1)).getBottom(), ((Rectangle) (obj1)).getRight(), ((Rectangle) (obj1)).getTop(), f, 0);
			((ColumnText) (obj2)).go();
		}
_L2:
		if(app[3] == null && !acro6Layers)
		{
			obj1 = ((Object) (app));
			obj2 = ((Object) (new PdfTemplate(((PdfWriter) (writer)))));
			obj1[3] = ((PdfTemplate) (obj2));
			((PdfTemplate) (obj2)).setBoundingBox(new Rectangle(100F, 100F));
			writer.addDirectTemplateSimple(((PdfTemplate) (obj2)), new PdfName("n3"));
			((PdfTemplate) (obj2)).setLiteral("% DSBlank\n");
		}
		if(app[4] == null && !acro6Layers)
		{
			obj1 = ((Object) (app));
			obj4 = ((Object) (new PdfTemplate(((PdfWriter) (writer)))));
			obj1[4] = ((PdfTemplate) (obj4));
			((PdfTemplate) (obj4)).setBoundingBox(new Rectangle(0.0F, rect.getHeight() * 0.7F, rect.getRight(), rect.getTop()));
			writer.addDirectTemplateSimple(((PdfTemplate) (obj4)), new PdfName("n4"));
			float f4;
			float f7;
			float f10;
			Object obj5;
			Object obj7;
			Paragraph paragraph;
			if(layer2Font == null)
				obj1 = ((Object) (new Font()));
			else
	//* 687 1443:goto            671
	//* 688 1446:aload_0         
	//* 689 1447:getfield        #473 <Field Certificate signCertificate>
	//* 690 1450:checkcast       #475 <Class X509Certificate>
	//* 691 1453:invokestatic    #481 <Method com.itextpdf.text.pdf.security.CertificateInfo$X500Name CertificateInfo.getSubjectFields(X509Certificate)>
	//* 692 1456:ldc2            #483 <String "CN">
	//* 693 1459:invokevirtual   #489 <Method String com.itextpdf.text.pdf.security.CertificateInfo$X500Name.getField(String)>
	//* 694 1462:astore          12
	//* 695 1464:aload           12
	//* 696 1466:astore          9
	//* 697 1468:aload           12
	//* 698 1470:ifnonnull       1491
	//* 699 1473:aload_0         
	//* 700 1474:getfield        #473 <Field Certificate signCertificate>
	//* 701 1477:checkcast       #475 <Class X509Certificate>
	//* 702 1480:invokestatic    #481 <Method com.itextpdf.text.pdf.security.CertificateInfo$X500Name CertificateInfo.getSubjectFields(X509Certificate)>
	//* 703 1483:ldc2            #491 <String "E">
	//* 704 1486:invokevirtual   #489 <Method String com.itextpdf.text.pdf.security.CertificateInfo$X500Name.getField(String)>
	//* 705 1489:astore          9
	//* 706 1491:aload           9
	//* 707 1493:astore          12
	//* 708 1495:aload           9
	//* 709 1497:ifnonnull       1505
	//* 710 1500:ldc2            #493 <String "">
	//* 711 1503:astore          12
	//* 712 1505:aload           11
	//* 713 1507:aload           12
	//* 714 1509:new             #267 <Class Rectangle>
	//* 715 1512:dup             
	//* 716 1513:aload           8
	//* 717 1515:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 718 1518:fconst_2        
	//* 719 1519:fsub            
	//* 720 1520:aload           8
	//* 721 1522:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 722 1525:fconst_2        
	//* 723 1526:fsub            
	//* 724 1527:invokespecial   #271 <Method void Rectangle(float, float)>
	//* 725 1530:ldc2            #638 <Float -1F>
	//* 726 1533:aload_0         
	//* 727 1534:getfield        #125 <Field int runDirection>
	//* 728 1537:invokestatic    #571 <Method float ColumnText.fitText(Font, String, Rectangle, float, int)>
	//* 729 1540:fstore_2        
	//* 730 1541:new             #567 <Class ColumnText>
	//* 731 1544:dup             
	//* 732 1545:aload           13
	//* 733 1547:invokespecial   #574 <Method void ColumnText(PdfContentByte)>
	//* 734 1550:astore          9
	//* 735 1552:aload           9
	//* 736 1554:aload_0         
	//* 737 1555:getfield        #125 <Field int runDirection>
	//* 738 1558:invokevirtual   #577 <Method void ColumnText.setRunDirection(int)>
	//* 739 1561:aload           9
	//* 740 1563:new             #579 <Class Phrase>
	//* 741 1566:dup             
	//* 742 1567:aload           12
	//* 743 1569:aload           11
	//* 744 1571:invokespecial   #582 <Method void Phrase(String, Font)>
	//* 745 1574:aload           8
	//* 746 1576:invokevirtual   #585 <Method float Rectangle.getLeft()>
	//* 747 1579:aload           8
	//* 748 1581:invokevirtual   #588 <Method float Rectangle.getBottom()>
	//* 749 1584:aload           8
	//* 750 1586:invokevirtual   #591 <Method float Rectangle.getRight()>
	//* 751 1589:aload           8
	//* 752 1591:invokevirtual   #594 <Method float Rectangle.getTop()>
	//* 753 1594:fload_2         
	//* 754 1595:iconst_0        
	//* 755 1596:invokevirtual   #598 <Method void ColumnText.setSimpleColumn(Phrase, float, float, float, float, float, int)>
	//* 756 1599:aload           9
	//* 757 1601:invokevirtual   #601 <Method int ColumnText.go()>
	//* 758 1604:pop             
	//* 759 1605:goto            708
	//* 760 1608:aload_0         
	//* 761 1609:getfield        #115 <Field Image signatureGraphic>
	//* 762 1612:ifnonnull       1633
	//* 763 1615:new             #634 <Class IllegalStateException>
	//* 764 1618:dup             
	//* 765 1619:ldc2            #640 <String "a.signature.image.should.be.present.when.rendering.mode.is.graphic.and.description">
	//* 766 1622:iconst_0        
	//* 767 1623:anewarray       Object[]
	//* 768 1626:invokestatic    #322 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 769 1629:invokespecial   #637 <Method void IllegalStateException(String)>
	//* 770 1632:athrow          
	//* 771 1633:new             #567 <Class ColumnText>
	//* 772 1636:dup             
	//* 773 1637:aload           13
	//* 774 1639:invokespecial   #574 <Method void ColumnText(PdfContentByte)>
	//* 775 1642:astore          9
	//* 776 1644:aload           9
	//* 777 1646:aload_0         
	//* 778 1647:getfield        #125 <Field int runDirection>
	//* 779 1650:invokevirtual   #577 <Method void ColumnText.setRunDirection(int)>
	//* 780 1653:aload           9
	//* 781 1655:aload           8
	//* 782 1657:invokevirtual   #585 <Method float Rectangle.getLeft()>
	//* 783 1660:aload           8
	//* 784 1662:invokevirtual   #588 <Method float Rectangle.getBottom()>
	//* 785 1665:aload           8
	//* 786 1667:invokevirtual   #591 <Method float Rectangle.getRight()>
	//* 787 1670:aload           8
	//* 788 1672:invokevirtual   #594 <Method float Rectangle.getTop()>
	//* 789 1675:fconst_0        
	//* 790 1676:iconst_2        
	//* 791 1677:invokevirtual   #643 <Method void ColumnText.setSimpleColumn(float, float, float, float, float, int)>
	//* 792 1680:aload_0         
	//* 793 1681:getfield        #115 <Field Image signatureGraphic>
	//* 794 1684:invokestatic    #646 <Method Image Image.getInstance(Image)>
	//* 795 1687:astore          12
	//* 796 1689:aload           12
	//* 797 1691:aload           8
	//* 798 1693:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 799 1696:aload           8
	//* 800 1698:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 801 1701:invokevirtual   #649 <Method void Image.scaleToFit(float, float)>
	//* 802 1704:new             #651 <Class Paragraph>
	//* 803 1707:dup             
	//* 804 1708:invokespecial   #652 <Method void Paragraph()>
	//* 805 1711:astore          14
	//* 806 1713:aload           12
	//* 807 1715:invokevirtual   #655 <Method float Image.getScaledHeight()>
	//* 808 1718:fneg            
	//* 809 1719:fstore_2        
	//* 810 1720:aload           8
	//* 811 1722:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 812 1725:aload           12
	//* 813 1727:invokevirtual   #658 <Method float Image.getScaledWidth()>
	//* 814 1730:fsub            
	//* 815 1731:fconst_2        
	//* 816 1732:fdiv            
	//* 817 1733:fstore_3        
	//* 818 1734:aload           8
	//* 819 1736:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 820 1739:aload           12
	//* 821 1741:invokevirtual   #655 <Method float Image.getScaledHeight()>
	//* 822 1744:fsub            
	//* 823 1745:fconst_2        
	//* 824 1746:fdiv            
	//* 825 1747:fstore          4
	//* 826 1749:aload           14
	//* 827 1751:new             #660 <Class Chunk>
	//* 828 1754:dup             
	//* 829 1755:aload           12
	//* 830 1757:aload           8
	//* 831 1759:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 832 1762:aload           12
	//* 833 1764:invokevirtual   #658 <Method float Image.getScaledWidth()>
	//* 834 1767:fsub            
	//* 835 1768:fconst_2        
	//* 836 1769:fdiv            
	//* 837 1770:fconst_0        
	//* 838 1771:fload_3         
	//* 839 1772:fadd            
	//* 840 1773:fadd            
	//* 841 1774:fload_2         
	//* 842 1775:ldc2            #612 <Float 15F>
	//* 843 1778:fadd            
	//* 844 1779:fload           4
	//* 845 1781:fsub            
	//* 846 1782:iconst_0        
	//* 847 1783:invokespecial   #663 <Method void Chunk(Image, float, float, boolean)>
	//* 848 1786:invokevirtual   #666 <Method boolean Paragraph.add(com.itextpdf.text.Element)>
	//* 849 1789:pop             
	//* 850 1790:aload           9
	//* 851 1792:aload           14
	//* 852 1794:invokevirtual   #670 <Method void ColumnText.addElement(com.itextpdf.text.Element)>
	//* 853 1797:aload           9
	//* 854 1799:invokevirtual   #601 <Method int ColumnText.go()>
	//* 855 1802:pop             
	//* 856 1803:goto            708
	//* 857 1806:new             #567 <Class ColumnText>
	//* 858 1809:dup             
	//* 859 1810:aload           13
	//* 860 1812:invokespecial   #574 <Method void ColumnText(PdfContentByte)>
	//* 861 1815:astore          9
	//* 862 1817:aload           9
	//* 863 1819:aload_0         
	//* 864 1820:getfield        #125 <Field int runDirection>
	//* 865 1823:invokevirtual   #577 <Method void ColumnText.setRunDirection(int)>
	//* 866 1826:aload           9
	//* 867 1828:aload           8
	//* 868 1830:invokevirtual   #585 <Method float Rectangle.getLeft()>
	//* 869 1833:aload           8
	//* 870 1835:invokevirtual   #588 <Method float Rectangle.getBottom()>
	//* 871 1838:aload           8
	//* 872 1840:invokevirtual   #591 <Method float Rectangle.getRight()>
	//* 873 1843:aload           8
	//* 874 1845:invokevirtual   #594 <Method float Rectangle.getTop()>
	//* 875 1848:fconst_0        
	//* 876 1849:iconst_2        
	//* 877 1850:invokevirtual   #643 <Method void ColumnText.setSimpleColumn(float, float, float, float, float, int)>
	//* 878 1853:aload_0         
	//* 879 1854:getfield        #115 <Field Image signatureGraphic>
	//* 880 1857:invokestatic    #646 <Method Image Image.getInstance(Image)>
	//* 881 1860:astore          12
	//* 882 1862:aload           12
	//* 883 1864:aload           8
	//* 884 1866:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 885 1869:aload           8
	//* 886 1871:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 887 1874:invokevirtual   #649 <Method void Image.scaleToFit(float, float)>
	//* 888 1877:new             #651 <Class Paragraph>
	//* 889 1880:dup             
	//* 890 1881:aload           8
	//* 891 1883:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 892 1886:invokespecial   #673 <Method void Paragraph(float)>
	//* 893 1889:astore          14
	//* 894 1891:aload           14
	//* 895 1893:new             #660 <Class Chunk>
	//* 896 1896:dup             
	//* 897 1897:aload           12
	//* 898 1899:aload           8
	//* 899 1901:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//* 900 1904:aload           12
	//* 901 1906:invokevirtual   #658 <Method float Image.getScaledWidth()>
	//* 902 1909:fsub            
	//* 903 1910:fconst_2        
	//* 904 1911:fdiv            
	//* 905 1912:aload           8
	//* 906 1914:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//* 907 1917:aload           12
	//* 908 1919:invokevirtual   #655 <Method float Image.getScaledHeight()>
	//* 909 1922:fsub            
	//* 910 1923:fconst_2        
	//* 911 1924:fdiv            
	//* 912 1925:iconst_0        
	//* 913 1926:invokespecial   #663 <Method void Chunk(Image, float, float, boolean)>
	//* 914 1929:invokevirtual   #666 <Method boolean Paragraph.add(com.itextpdf.text.Element)>
	//* 915 1932:pop             
	//* 916 1933:aload           9
	//* 917 1935:aload           14
	//* 918 1937:invokevirtual   #670 <Method void ColumnText.addElement(com.itextpdf.text.Element)>
	//* 919 1940:aload           9
	//* 920 1942:invokevirtual   #601 <Method int ColumnText.go()>
	//* 921 1945:pop             
	//* 922 1946:goto            708
				obj1 = ((Object) (new Font(layer2Font)));
	//  923 1949:new             #541 <Class Font>
	//  924 1952:dup             
	//  925 1953:aload_0         
	//  926 1954:getfield        #539 <Field Font layer2Font>
	//  927 1957:invokespecial   #632 <Method void Font(Font)>
	//  928 1960:astore          7
			obj2 = "Signature Not Verified";
			if(layer4Text != null)
				obj2 = ((Object) (layer4Text));
			f = ColumnText.fitText(((Font) (obj1)), ((String) (obj2)), new Rectangle(rect.getWidth() - 4F, rect.getHeight() * 0.3F - 4F), 15F, runDirection);
			obj4 = ((Object) (new ColumnText(((PdfContentByte) (obj4)))));
			((ColumnText) (obj4)).setRunDirection(runDirection);
			((ColumnText) (obj4)).setSimpleColumn(new Phrase(((String) (obj2)), ((Font) (obj1))), 2.0F, 0.0F, rect.getWidth() - 2.0F, rect.getHeight() - 2.0F, f, 0);
			((ColumnText) (obj4)).go();
		}
		j = writer.reader.getPageRotation(page);
		obj1 = ((Object) (new Rectangle(rect)));
		for(i = j; i > 0; i -= 90)
			obj1 = ((Object) (((Rectangle) (obj1)).rotate()));

		break; /* Loop/switch isn't completed */
	//  929 1962:goto            1022
_L4:
		obj7 = ((Object) (CertificateInfo.getSubjectFields((X509Certificate)signCertificate).getField("CN")));
		obj5 = obj7;
		if(obj7 == null)
			obj5 = ((Object) (CertificateInfo.getSubjectFields((X509Certificate)signCertificate).getField("E")));
		obj7 = obj5;
		if(obj5 == null)
			obj7 = "";
		f4 = ColumnText.fitText(font, ((String) (obj7)), new Rectangle(((Rectangle) (obj2)).getWidth() - 2.0F, ((Rectangle) (obj2)).getHeight() - 2.0F), -1F, runDirection);
		obj5 = ((Object) (new ColumnText(((PdfContentByte) (pdftemplate2)))));
		((ColumnText) (obj5)).setRunDirection(runDirection);
		((ColumnText) (obj5)).setSimpleColumn(new Phrase(((String) (obj7)), font), ((Rectangle) (obj2)).getLeft(), ((Rectangle) (obj2)).getBottom(), ((Rectangle) (obj2)).getRight(), ((Rectangle) (obj2)).getTop(), f4, 0);
		((ColumnText) (obj5)).go();
		continue; /* Loop/switch isn't completed */
_L5:
		if(signatureGraphic == null)
			throw new IllegalStateException(MessageLocalization.getComposedMessage("a.signature.image.should.be.present.when.rendering.mode.is.graphic.and.description", new Object[0]));
		obj5 = ((Object) (new ColumnText(((PdfContentByte) (pdftemplate2)))));
		((ColumnText) (obj5)).setRunDirection(runDirection);
		((ColumnText) (obj5)).setSimpleColumn(((Rectangle) (obj2)).getLeft(), ((Rectangle) (obj2)).getBottom(), ((Rectangle) (obj2)).getRight(), ((Rectangle) (obj2)).getTop(), 0.0F, 2);
		obj7 = ((Object) (Image.getInstance(signatureGraphic)));
		((Image) (obj7)).scaleToFit(((Rectangle) (obj2)).getWidth(), ((Rectangle) (obj2)).getHeight());
		paragraph = new Paragraph();
		f4 = -((Image) (obj7)).getScaledHeight();
		f7 = (((Rectangle) (obj2)).getWidth() - ((Image) (obj7)).getScaledWidth()) / 2.0F;
		f10 = (((Rectangle) (obj2)).getHeight() - ((Image) (obj7)).getScaledHeight()) / 2.0F;
		paragraph.add(((com.itextpdf.text.Element) (new Chunk(((Image) (obj7)), (((Rectangle) (obj2)).getWidth() - ((Image) (obj7)).getScaledWidth()) / 2.0F + (0.0F + f7), (f4 + 15F) - f10, false))));
		((ColumnText) (obj5)).addElement(((com.itextpdf.text.Element) (paragraph)));
		((ColumnText) (obj5)).go();
		continue; /* Loop/switch isn't completed */
_L6:
		obj5 = ((Object) (new ColumnText(((PdfContentByte) (pdftemplate2)))));
		((ColumnText) (obj5)).setRunDirection(runDirection);
		((ColumnText) (obj5)).setSimpleColumn(((Rectangle) (obj2)).getLeft(), ((Rectangle) (obj2)).getBottom(), ((Rectangle) (obj2)).getRight(), ((Rectangle) (obj2)).getTop(), 0.0F, 2);
		obj7 = ((Object) (Image.getInstance(signatureGraphic)));
		((Image) (obj7)).scaleToFit(((Rectangle) (obj2)).getWidth(), ((Rectangle) (obj2)).getHeight());
		paragraph = new Paragraph(((Rectangle) (obj2)).getHeight());
		paragraph.add(((com.itextpdf.text.Element) (new Chunk(((Image) (obj7)), (((Rectangle) (obj2)).getWidth() - ((Image) (obj7)).getScaledWidth()) / 2.0F, (((Rectangle) (obj2)).getHeight() - ((Image) (obj7)).getScaledHeight()) / 2.0F, false))));
		((ColumnText) (obj5)).addElement(((com.itextpdf.text.Element) (paragraph)));
		((ColumnText) (obj5)).go();
		if(true) goto _L3; else goto _L7
_L7:
		if(frm == null)
	//* 930 1965:aload_0         
	//* 931 1966:getfield        #675 <Field PdfTemplate frm>
	//* 932 1969:ifnonnull       2255
		{
			frm = new PdfTemplate(((PdfWriter) (writer)));
	//  933 1972:aload_0         
	//  934 1973:new             #119 <Class PdfTemplate>
	//  935 1976:dup             
	//  936 1977:aload_0         
	//  937 1978:getfield        #129 <Field PdfStamperImp writer>
	//  938 1981:invokespecial   #265 <Method void PdfTemplate(PdfWriter)>
	//  939 1984:putfield        #675 <Field PdfTemplate frm>
			frm.setBoundingBox(((Rectangle) (obj1)));
	//  940 1987:aload_0         
	//  941 1988:getfield        #675 <Field PdfTemplate frm>
	//  942 1991:aload           7
	//  943 1993:invokevirtual   #275 <Method void PdfTemplate.setBoundingBox(Rectangle)>
			writer.addDirectTemplateSimple(frm, new PdfName("FRM"));
	//  944 1996:aload_0         
	//  945 1997:getfield        #129 <Field PdfStamperImp writer>
	//  946 2000:aload_0         
	//  947 2001:getfield        #675 <Field PdfTemplate frm>
	//  948 2004:new             #159 <Class PdfName>
	//  949 2007:dup             
	//  950 2008:ldc2            #677 <String "FRM">
	//  951 2011:invokespecial   #180 <Method void PdfName(String)>
	//  952 2014:invokevirtual   #281 <Method PdfName PdfStamperImp.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//  953 2017:pop             
			float f8 = Math.min(rect.getWidth(), rect.getHeight()) * 0.9F;
	//  954 2018:aload_0         
	//  955 2019:getfield        #520 <Field Rectangle rect>
	//  956 2022:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//  957 2025:aload_0         
	//  958 2026:getfield        #520 <Field Rectangle rect>
	//  959 2029:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//  960 2032:invokestatic    #629 <Method float Math.min(float, float)>
	//  961 2035:ldc2            #678 <Float 0.9F>
	//  962 2038:fmul            
	//  963 2039:fstore_3        
			float f2 = (rect.getWidth() - f8) / 2.0F;
	//  964 2040:aload_0         
	//  965 2041:getfield        #520 <Field Rectangle rect>
	//  966 2044:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//  967 2047:fload_3         
	//  968 2048:fsub            
	//  969 2049:fconst_2        
	//  970 2050:fdiv            
	//  971 2051:fstore_1        
			float f5 = (rect.getHeight() - f8) / 2.0F;
	//  972 2052:aload_0         
	//  973 2053:getfield        #520 <Field Rectangle rect>
	//  974 2056:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//  975 2059:fload_3         
	//  976 2060:fsub            
	//  977 2061:fconst_2        
	//  978 2062:fdiv            
	//  979 2063:fstore_2        
			f8 /= 100F;
	//  980 2064:fload_3         
	//  981 2065:ldc2            #268 <Float 100F>
	//  982 2068:fdiv            
	//  983 2069:fstore_3        
			if(j == 90)
	//* 984 2070:iload           6
	//* 985 2072:bipush          90
	//* 986 2074:icmpne          2300
				frm.concatCTM(0.0F, 1.0F, -1F, 0.0F, rect.getHeight(), 0.0F);
	//  987 2077:aload_0         
	//  988 2078:getfield        #675 <Field PdfTemplate frm>
	//  989 2081:fconst_0        
	//  990 2082:fconst_1        
	//  991 2083:ldc2            #638 <Float -1F>
	//  992 2086:fconst_0        
	//  993 2087:aload_0         
	//  994 2088:getfield        #520 <Field Rectangle rect>
	//  995 2091:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//  996 2094:fconst_0        
	//  997 2095:invokevirtual   #682 <Method void PdfTemplate.concatCTM(float, float, float, float, float, float)>
			else
	//* 998 2098:aload_0         
	//* 999 2099:getfield        #123 <Field boolean reuseAppearance>
	//*1000 2102:ifeq            2151
	//*1001 2105:aload_0         
	//*1002 2106:getfield        #129 <Field PdfStamperImp writer>
	//*1003 2109:invokevirtual   #686 <Method AcroFields PdfStamperImp.getAcroFields()>
	//*1004 2112:aload_0         
	//*1005 2113:invokevirtual   #689 <Method String getFieldName()>
	//*1006 2116:invokevirtual   #695 <Method PdfIndirectReference AcroFields.getNormalAppearance(String)>
	//*1007 2119:astore          8
	//*1008 2121:aload           8
	//*1009 2123:ifnull          2372
	//*1010 2126:aload_0         
	//*1011 2127:getfield        #675 <Field PdfTemplate frm>
	//*1012 2130:aload           8
	//*1013 2132:new             #159 <Class PdfName>
	//*1014 2135:dup             
	//*1015 2136:ldc2            #277 <String "n0">
	//*1016 2139:invokespecial   #180 <Method void PdfName(String)>
	//*1017 2142:fconst_1        
	//*1018 2143:fconst_0        
	//*1019 2144:fconst_0        
	//*1020 2145:fconst_1        
	//*1021 2146:fconst_0        
	//*1022 2147:fconst_0        
	//*1023 2148:invokevirtual   #699 <Method void PdfTemplate.addTemplateReference(PdfIndirectReference, PdfName, float, float, float, float, float, float)>
	//*1024 2151:aload_0         
	//*1025 2152:getfield        #123 <Field boolean reuseAppearance>
	//*1026 2155:ifne            2173
	//*1027 2158:aload_0         
	//*1028 2159:getfield        #675 <Field PdfTemplate frm>
	//*1029 2162:aload_0         
	//*1030 2163:getfield        #121 <Field PdfTemplate[] app>
	//*1031 2166:iconst_0        
	//*1032 2167:aaload          
	//*1033 2168:fconst_0        
	//*1034 2169:fconst_0        
	//*1035 2170:invokevirtual   #703 <Method void PdfTemplate.addTemplate(PdfTemplate, float, float)>
	//*1036 2173:aload_0         
	//*1037 2174:getfield        #117 <Field boolean acro6Layers>
	//*1038 2177:ifne            2199
	//*1039 2180:aload_0         
	//*1040 2181:getfield        #675 <Field PdfTemplate frm>
	//*1041 2184:aload_0         
	//*1042 2185:getfield        #121 <Field PdfTemplate[] app>
	//*1043 2188:iconst_1        
	//*1044 2189:aaload          
	//*1045 2190:fload_3         
	//*1046 2191:fconst_0        
	//*1047 2192:fconst_0        
	//*1048 2193:fload_3         
	//*1049 2194:fload_1         
	//*1050 2195:fload_2         
	//*1051 2196:invokevirtual   #706 <Method void PdfTemplate.addTemplate(PdfTemplate, float, float, float, float, float, float)>
	//*1052 2199:aload_0         
	//*1053 2200:getfield        #675 <Field PdfTemplate frm>
	//*1054 2203:aload_0         
	//*1055 2204:getfield        #121 <Field PdfTemplate[] app>
	//*1056 2207:iconst_2        
	//*1057 2208:aaload          
	//*1058 2209:fconst_0        
	//*1059 2210:fconst_0        
	//*1060 2211:invokevirtual   #703 <Method void PdfTemplate.addTemplate(PdfTemplate, float, float)>
	//*1061 2214:aload_0         
	//*1062 2215:getfield        #117 <Field boolean acro6Layers>
	//*1063 2218:ifne            2255
	//*1064 2221:aload_0         
	//*1065 2222:getfield        #675 <Field PdfTemplate frm>
	//*1066 2225:aload_0         
	//*1067 2226:getfield        #121 <Field PdfTemplate[] app>
	//*1068 2229:iconst_3        
	//*1069 2230:aaload          
	//*1070 2231:fload_3         
	//*1071 2232:fconst_0        
	//*1072 2233:fconst_0        
	//*1073 2234:fload_3         
	//*1074 2235:fload_1         
	//*1075 2236:fload_2         
	//*1076 2237:invokevirtual   #706 <Method void PdfTemplate.addTemplate(PdfTemplate, float, float, float, float, float, float)>
	//*1077 2240:aload_0         
	//*1078 2241:getfield        #675 <Field PdfTemplate frm>
	//*1079 2244:aload_0         
	//*1080 2245:getfield        #121 <Field PdfTemplate[] app>
	//*1081 2248:iconst_4        
	//*1082 2249:aaload          
	//*1083 2250:fconst_0        
	//*1084 2251:fconst_0        
	//*1085 2252:invokevirtual   #703 <Method void PdfTemplate.addTemplate(PdfTemplate, float, float)>
	//*1086 2255:new             #119 <Class PdfTemplate>
	//*1087 2258:dup             
	//*1088 2259:aload_0         
	//*1089 2260:getfield        #129 <Field PdfStamperImp writer>
	//*1090 2263:invokespecial   #265 <Method void PdfTemplate(PdfWriter)>
	//*1091 2266:astore          8
	//*1092 2268:aload           8
	//*1093 2270:aload           7
	//*1094 2272:invokevirtual   #275 <Method void PdfTemplate.setBoundingBox(Rectangle)>
	//*1095 2275:aload_0         
	//*1096 2276:getfield        #129 <Field PdfStamperImp writer>
	//*1097 2279:aload           8
	//*1098 2281:aconst_null     
	//*1099 2282:invokevirtual   #281 <Method PdfName PdfStamperImp.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//*1100 2285:pop             
	//*1101 2286:aload           8
	//*1102 2288:aload_0         
	//*1103 2289:getfield        #675 <Field PdfTemplate frm>
	//*1104 2292:fconst_0        
	//*1105 2293:fconst_0        
	//*1106 2294:invokevirtual   #703 <Method void PdfTemplate.addTemplate(PdfTemplate, float, float)>
	//*1107 2297:aload           8
	//*1108 2299:areturn         
			if(j == 180)
	//*1109 2300:iload           6
	//*1110 2302:sipush          180
	//*1111 2305:icmpne          2340
				frm.concatCTM(-1F, 0.0F, 0.0F, -1F, rect.getWidth(), rect.getHeight());
	// 1112 2308:aload_0         
	// 1113 2309:getfield        #675 <Field PdfTemplate frm>
	// 1114 2312:ldc2            #638 <Float -1F>
	// 1115 2315:fconst_0        
	// 1116 2316:fconst_0        
	// 1117 2317:ldc2            #638 <Float -1F>
	// 1118 2320:aload_0         
	// 1119 2321:getfield        #520 <Field Rectangle rect>
	// 1120 2324:invokevirtual   #530 <Method float Rectangle.getWidth()>
	// 1121 2327:aload_0         
	// 1122 2328:getfield        #520 <Field Rectangle rect>
	// 1123 2331:invokevirtual   #533 <Method float Rectangle.getHeight()>
	// 1124 2334:invokevirtual   #682 <Method void PdfTemplate.concatCTM(float, float, float, float, float, float)>
			else
	//*1125 2337:goto            2098
			if(j == 270)
	//*1126 2340:iload           6
	//*1127 2342:sipush          270
	//*1128 2345:icmpne          2098
				frm.concatCTM(0.0F, -1F, 1.0F, 0.0F, 0.0F, rect.getWidth());
	// 1129 2348:aload_0         
	// 1130 2349:getfield        #675 <Field PdfTemplate frm>
	// 1131 2352:fconst_0        
	// 1132 2353:ldc2            #638 <Float -1F>
	// 1133 2356:fconst_1        
	// 1134 2357:fconst_0        
	// 1135 2358:fconst_0        
	// 1136 2359:aload_0         
	// 1137 2360:getfield        #520 <Field Rectangle rect>
	// 1138 2363:invokevirtual   #530 <Method float Rectangle.getWidth()>
	// 1139 2366:invokevirtual   #682 <Method void PdfTemplate.concatCTM(float, float, float, float, float, float)>
			if(reuseAppearance)
			{
				Object obj3 = ((Object) (writer.getAcroFields().getNormalAppearance(getFieldName())));
				if(obj3 != null)
				{
					frm.addTemplateReference(((PdfIndirectReference) (obj3)), new PdfName("n0"), 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				} else
	//*1140 2369:goto            2098
				{
					reuseAppearance = false;
	// 1141 2372:aload_0         
	// 1142 2373:iconst_0        
	// 1143 2374:putfield        #123 <Field boolean reuseAppearance>
					if(app[0] == null)
	//*1144 2377:aload_0         
	//*1145 2378:getfield        #121 <Field PdfTemplate[] app>
	//*1146 2381:iconst_0        
	//*1147 2382:aaload          
	//*1148 2383:ifnonnull       2151
						createBlankN0();
	// 1149 2386:aload_0         
	// 1150 2387:invokespecial   #458 <Method void createBlankN0()>
				}
			}
			if(!reuseAppearance)
				frm.addTemplate(app[0], 0.0F, 0.0F);
			if(!acro6Layers)
				frm.addTemplate(app[1], f8, 0.0F, 0.0F, f8, f2, f5);
			frm.addTemplate(app[2], 0.0F, 0.0F);
			if(!acro6Layers)
			{
				frm.addTemplate(app[3], f8, 0.0F, 0.0F, f8, f2, f5);
				frm.addTemplate(app[4], 0.0F, 0.0F);
			}
		}
		obj3 = ((Object) (new PdfTemplate(((PdfWriter) (writer)))));
		((PdfTemplate) (obj3)).setBoundingBox(((Rectangle) (obj1)));
		writer.addDirectTemplateSimple(((PdfTemplate) (obj3)), ((PdfName) (null)));
		((PdfTemplate) (obj3)).addTemplate(frm, 0.0F, 0.0F);
		return ((PdfTemplate) (obj3));
	//*1151 2390:goto            2151
	//*1152 2393:goto            756
	}

	public Certificate getCertificate()
	{
		return signCertificate;
	//    0    0:aload_0         
	//    1    1:getfield        #473 <Field Certificate signCertificate>
	//    2    4:areturn         
	}

	public int getCertificationLevel()
	{
		return certificationLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field int certificationLevel>
	//    2    4:ireturn         
	}

	public String getContact()
	{
		return contact;
	//    0    0:aload_0         
	//    1    1:getfield        #712 <Field String contact>
	//    2    4:areturn         
	}

	public PdfDictionary getCryptoDictionary()
	{
		return cryptoDictionary;
	//    0    0:aload_0         
	//    1    1:getfield        #715 <Field PdfDictionary cryptoDictionary>
	//    2    4:areturn         
	}

	public PdfSigLockDictionary getFieldLockDict()
	{
		return fieldLock;
	//    0    0:aload_0         
	//    1    1:getfield        #719 <Field PdfSigLockDictionary fieldLock>
	//    2    4:areturn         
	}

	public String getFieldName()
	{
		return fieldName;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field String fieldName>
	//    2    4:areturn         
	}

	public Image getImage()
	{
		return image;
	//    0    0:aload_0         
	//    1    1:getfield        #524 <Field Image image>
	//    2    4:areturn         
	}

	public float getImageScale()
	{
		return imageScale;
	//    0    0:aload_0         
	//    1    1:getfield        #526 <Field float imageScale>
	//    2    4:freturn         
	}

	public PdfTemplate getLayer(int i)
	{
		PdfTemplate pdftemplate;
		if(i < 0 || i >= app.length)
	//*   0    0:iload_1         
	//*   1    1:iflt            13
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #121 <Field PdfTemplate[] app>
	//*   5    9:arraylength     
	//*   6   10:icmplt          17
		{
			pdftemplate = null;
	//    7   13:aconst_null     
	//    8   14:astore_2        
		} else
	//*   9   15:aload_2         
	//*  10   16:areturn         
		{
			PdfTemplate pdftemplate1 = app[i];
	//   11   17:aload_0         
	//   12   18:getfield        #121 <Field PdfTemplate[] app>
	//   13   21:iload_1         
	//   14   22:aaload          
	//   15   23:astore_3        
			pdftemplate = pdftemplate1;
	//   16   24:aload_3         
	//   17   25:astore_2        
			if(pdftemplate1 == null)
	//*  18   26:aload_3         
	//*  19   27:ifnonnull       15
			{
				PdfTemplate apdftemplate[] = app;
	//   20   30:aload_0         
	//   21   31:getfield        #121 <Field PdfTemplate[] app>
	//   22   34:astore_2        
				PdfTemplate pdftemplate2 = new PdfTemplate(((PdfWriter) (writer)));
	//   23   35:new             #119 <Class PdfTemplate>
	//   24   38:dup             
	//   25   39:aload_0         
	//   26   40:getfield        #129 <Field PdfStamperImp writer>
	//   27   43:invokespecial   #265 <Method void PdfTemplate(PdfWriter)>
	//   28   46:astore_3        
				apdftemplate[i] = pdftemplate2;
	//   29   47:aload_2         
	//   30   48:iload_1         
	//   31   49:aload_3         
	//   32   50:aastore         
				pdftemplate2.setBoundingBox(rect);
	//   33   51:aload_3         
	//   34   52:aload_0         
	//   35   53:getfield        #520 <Field Rectangle rect>
	//   36   56:invokevirtual   #275 <Method void PdfTemplate.setBoundingBox(Rectangle)>
				writer.addDirectTemplateSimple(pdftemplate2, new PdfName((new StringBuilder()).append("n").append(i).toString()));
	//   37   59:aload_0         
	//   38   60:getfield        #129 <Field PdfStamperImp writer>
	//   39   63:aload_3         
	//   40   64:new             #159 <Class PdfName>
	//   41   67:dup             
	//   42   68:new             #464 <Class StringBuilder>
	//   43   71:dup             
	//   44   72:invokespecial   #465 <Method void StringBuilder()>
	//   45   75:ldc2            #726 <String "n">
	//   46   78:invokevirtual   #471 <Method StringBuilder StringBuilder.append(String)>
	//   47   81:iload_1         
	//   48   82:invokevirtual   #729 <Method StringBuilder StringBuilder.append(int)>
	//   49   85:invokevirtual   #518 <Method String StringBuilder.toString()>
	//   50   88:invokespecial   #180 <Method void PdfName(String)>
	//   51   91:invokevirtual   #281 <Method PdfName PdfStamperImp.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//   52   94:pop             
				return pdftemplate2;
	//   53   95:aload_3         
	//   54   96:areturn         
			}
		}
		return pdftemplate;
	}

	public Font getLayer2Font()
	{
		return layer2Font;
	//    0    0:aload_0         
	//    1    1:getfield        #539 <Field Font layer2Font>
	//    2    4:areturn         
	}

	public String getLayer2Text()
	{
		return layer2Text;
	//    0    0:aload_0         
	//    1    1:getfield        #462 <Field String layer2Text>
	//    2    4:areturn         
	}

	public String getLayer4Text()
	{
		return layer4Text;
	//    0    0:aload_0         
	//    1    1:getfield        #610 <Field String layer4Text>
	//    2    4:areturn         
	}

	public String getLocation()
	{
		return location;
	//    0    0:aload_0         
	//    1    1:getfield        #517 <Field String location>
	//    2    4:areturn         
	}

	public String getNewSigName()
	{
		AcroFields acrofields = writer.getAcroFields();
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field PdfStamperImp writer>
	//    2    4:invokevirtual   #686 <Method AcroFields PdfStamperImp.getAcroFields()>
	//    3    7:astore          5
		int i = 0;
	//    4    9:iconst_0        
	//    5   10:istore_2        
		boolean flag = false;
	//    6   11:iconst_0        
	//    7   12:istore_1        
label0:
		do
		{
			if(flag)
				break;
	//    8   13:iload_1         
	//    9   14:ifne            138
			int j = i + 1;
	//   10   17:iload_2         
	//   11   18:iconst_1        
	//   12   19:iadd            
	//   13   20:istore_3        
			String s = (new StringBuilder()).append("Signature").append(j).toString();
	//   14   21:new             #464 <Class StringBuilder>
	//   15   24:dup             
	//   16   25:invokespecial   #465 <Method void StringBuilder()>
	//   17   28:ldc2            #736 <String "Signature">
	//   18   31:invokevirtual   #471 <Method StringBuilder StringBuilder.append(String)>
	//   19   34:iload_3         
	//   20   35:invokevirtual   #729 <Method StringBuilder StringBuilder.append(int)>
	//   21   38:invokevirtual   #518 <Method String StringBuilder.toString()>
	//   22   41:astore          6
			i = j;
	//   23   43:iload_3         
	//   24   44:istore_2        
			if(acrofields.getFieldItem(s) != null)
				continue;
	//   25   45:aload           5
	//   26   47:aload           6
	//   27   49:invokevirtual   #740 <Method AcroFields$Item AcroFields.getFieldItem(String)>
	//   28   52:ifnonnull       13
			s = (new StringBuilder()).append(s).append(".").toString();
	//   29   55:new             #464 <Class StringBuilder>
	//   30   58:dup             
	//   31   59:invokespecial   #465 <Method void StringBuilder()>
	//   32   62:aload           6
	//   33   64:invokevirtual   #471 <Method StringBuilder StringBuilder.append(String)>
	//   34   67:ldc2            #742 <String ".">
	//   35   70:invokevirtual   #471 <Method StringBuilder StringBuilder.append(String)>
	//   36   73:invokevirtual   #518 <Method String StringBuilder.toString()>
	//   37   76:astore          6
			boolean flag1 = true;
	//   38   78:iconst_1        
	//   39   79:istore          4
			Iterator iterator = acrofields.getFields().keySet().iterator();
	//   40   81:aload           5
	//   41   83:invokevirtual   #746 <Method Map AcroFields.getFields()>
	//   42   86:invokeinterface #751 <Method Set Map.keySet()>
	//   43   91:invokeinterface #354 <Method Iterator Set.iterator()>
	//   44   96:astore          7
			do
			{
				flag = flag1;
	//   45   98:iload           4
	//   46  100:istore_1        
				i = j;
	//   47  101:iload_3         
	//   48  102:istore_2        
				if(!iterator.hasNext())
					continue label0;
	//   49  103:aload           7
	//   50  105:invokeinterface #359 <Method boolean Iterator.hasNext()>
	//   51  110:ifeq            13
			} while(!((String)iterator.next()).startsWith(s));
	//   52  113:aload           7
	//   53  115:invokeinterface #363 <Method Object Iterator.next()>
	//   54  120:checkcast       #400 <Class String>
	//   55  123:aload           6
	//   56  125:invokevirtual   #755 <Method boolean String.startsWith(String)>
	//   57  128:ifeq            98
			flag = false;
	//   58  131:iconst_0        
	//   59  132:istore_1        
			i = j;
	//   60  133:iload_3         
	//   61  134:istore_2        
		} while(true);
	//   62  135:goto            13
		return (new StringBuilder()).append("Signature").append(i).toString();
	//   63  138:new             #464 <Class StringBuilder>
	//   64  141:dup             
	//   65  142:invokespecial   #465 <Method void StringBuilder()>
	//   66  145:ldc2            #736 <String "Signature">
	//   67  148:invokevirtual   #471 <Method StringBuilder StringBuilder.append(String)>
	//   68  151:iload_2         
	//   69  152:invokevirtual   #729 <Method StringBuilder StringBuilder.append(int)>
	//   70  155:invokevirtual   #518 <Method String StringBuilder.toString()>
	//   71  158:areturn         
	}

	OutputStream getOriginalout()
	{
		return originalout;
	//    0    0:aload_0         
	//    1    1:getfield        #332 <Field OutputStream originalout>
	//    2    4:areturn         
	}

	public int getPage()
	{
		return page;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field int page>
	//    2    4:ireturn         
	}

	public Rectangle getPageRect()
	{
		return pageRect;
	//    0    0:aload_0         
	//    1    1:getfield        #761 <Field Rectangle pageRect>
	//    2    4:areturn         
	}

	public InputStream getRangeStream()
		throws IOException
	{
		return ((InputStream) (new RASInputStream((new RandomAccessSourceFactory()).createRanged(getUnderlyingSource(), range))));
	//    0    0:new             #765 <Class RASInputStream>
	//    1    3:dup             
	//    2    4:new             #292 <Class RandomAccessSourceFactory>
	//    3    7:dup             
	//    4    8:invokespecial   #293 <Method void RandomAccessSourceFactory()>
	//    5   11:aload_0         
	//    6   12:invokespecial   #767 <Method RandomAccessSource getUnderlyingSource()>
	//    7   15:aload_0         
	//    8   16:getfield        #769 <Field long[] range>
	//    9   19:invokevirtual   #773 <Method RandomAccessSource RandomAccessSourceFactory.createRanged(RandomAccessSource, long[])>
	//   10   22:invokespecial   #776 <Method void RASInputStream(RandomAccessSource)>
	//   11   25:areturn         
	}

	public String getReason()
	{
		return reason;
	//    0    0:aload_0         
	//    1    1:getfield        #515 <Field String reason>
	//    2    4:areturn         
	}

	public Rectangle getRect()
	{
		return rect;
	//    0    0:aload_0         
	//    1    1:getfield        #520 <Field Rectangle rect>
	//    2    4:areturn         
	}

	public RenderingMode getRenderingMode()
	{
		return renderingMode;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field PdfSignatureAppearance$RenderingMode renderingMode>
	//    2    4:areturn         
	}

	public int getRunDirection()
	{
		return runDirection;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field int runDirection>
	//    2    4:ireturn         
	}

	public Calendar getSignDate()
	{
		return signDate;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field Calendar signDate>
	//    2    4:areturn         
	}

	public String getSignatureCreator()
	{
		return signatureCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field String signatureCreator>
	//    2    4:areturn         
	}

	public SignatureEvent getSignatureEvent()
	{
		return signatureEvent;
	//    0    0:aload_0         
	//    1    1:getfield        #788 <Field PdfSignatureAppearance$SignatureEvent signatureEvent>
	//    2    4:areturn         
	}

	public Image getSignatureGraphic()
	{
		return signatureGraphic;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Image signatureGraphic>
	//    2    4:areturn         
	}

	ByteBuffer getSigout()
	{
		return sigout;
	//    0    0:aload_0         
	//    1    1:getfield        #793 <Field ByteBuffer sigout>
	//    2    4:areturn         
	}

	public PdfStamper getStamper()
	{
		return stamper;
	//    0    0:aload_0         
	//    1    1:getfield        #797 <Field PdfStamper stamper>
	//    2    4:areturn         
	}

	public File getTempFile()
	{
		return tempFile;
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field File tempFile>
	//    2    4:areturn         
	}

	public PdfTemplate getTopLayer()
	{
		if(frm == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #675 <Field PdfTemplate frm>
	//*   2    4:ifnonnull       55
		{
			frm = new PdfTemplate(((PdfWriter) (writer)));
	//    3    7:aload_0         
	//    4    8:new             #119 <Class PdfTemplate>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #129 <Field PdfStamperImp writer>
	//    8   16:invokespecial   #265 <Method void PdfTemplate(PdfWriter)>
	//    9   19:putfield        #675 <Field PdfTemplate frm>
			frm.setBoundingBox(rect);
	//   10   22:aload_0         
	//   11   23:getfield        #675 <Field PdfTemplate frm>
	//   12   26:aload_0         
	//   13   27:getfield        #520 <Field Rectangle rect>
	//   14   30:invokevirtual   #275 <Method void PdfTemplate.setBoundingBox(Rectangle)>
			writer.addDirectTemplateSimple(frm, new PdfName("FRM"));
	//   15   33:aload_0         
	//   16   34:getfield        #129 <Field PdfStamperImp writer>
	//   17   37:aload_0         
	//   18   38:getfield        #675 <Field PdfTemplate frm>
	//   19   41:new             #159 <Class PdfName>
	//   20   44:dup             
	//   21   45:ldc2            #677 <String "FRM">
	//   22   48:invokespecial   #180 <Method void PdfName(String)>
	//   23   51:invokevirtual   #281 <Method PdfName PdfStamperImp.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//   24   54:pop             
		}
		return frm;
	//   25   55:aload_0         
	//   26   56:getfield        #675 <Field PdfTemplate frm>
	//   27   59:areturn         
	}

	public boolean isAcro6Layers()
	{
		return acro6Layers;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field boolean acro6Layers>
	//    2    4:ireturn         
	}

	public boolean isInvisible()
	{
		return rect == null || rect.getWidth() == 0.0F || rect.getHeight() == 0.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #520 <Field Rectangle rect>
	//    2    4:ifnull          31
	//    3    7:aload_0         
	//    4    8:getfield        #520 <Field Rectangle rect>
	//    5   11:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//    6   14:fconst_0        
	//    7   15:fcmpl           
	//    8   16:ifeq            31
	//    9   19:aload_0         
	//   10   20:getfield        #520 <Field Rectangle rect>
	//   11   23:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//   12   26:fconst_0        
	//   13   27:fcmpl           
	//   14   28:ifne            33
	//   15   31:iconst_1        
	//   16   32:ireturn         
	//   17   33:iconst_0        
	//   18   34:ireturn         
	}

	public boolean isPreClosed()
	{
		return preClosed;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field boolean preClosed>
	//    2    4:ireturn         
	}

	public void preClose(HashMap hashmap)
		throws IOException, DocumentException
	{
		long l1;
		if(preClosed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field boolean preClosed>
	//*   2    4:ifeq            25
			throw new DocumentException(MessageLocalization.getComposedMessage("document.already.pre.closed", new Object[0]));
	//    3    7:new             #312 <Class DocumentException>
	//    4   10:dup             
	//    5   11:ldc2            #806 <String "document.already.pre.closed">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #322 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #323 <Method void DocumentException(String)>
	//   10   24:athrow          
		stamper.mergeVerification();
	//   11   25:aload_0         
	//   12   26:getfield        #797 <Field PdfStamper stamper>
	//   13   29:invokevirtual   #811 <Method void PdfStamper.mergeVerification()>
		preClosed = true;
	//   14   32:aload_0         
	//   15   33:iconst_1        
	//   16   34:putfield        #127 <Field boolean preClosed>
		Object obj1 = ((Object) (writer.getAcroFields()));
	//   17   37:aload_0         
	//   18   38:getfield        #129 <Field PdfStamperImp writer>
	//   19   41:invokevirtual   #686 <Method AcroFields PdfStamperImp.getAcroFields()>
	//   20   44:astore          10
		Object obj2 = ((Object) (getFieldName()));
	//   21   46:aload_0         
	//   22   47:invokevirtual   #689 <Method String getFieldName()>
	//   23   50:astore          12
		boolean flag1 = ((AcroFields) (obj1)).doesSignatureFieldExist(((String) (obj2)));
	//   24   52:aload           10
	//   25   54:aload           12
	//   26   56:invokevirtual   #814 <Method boolean AcroFields.doesSignatureFieldExist(String)>
	//   27   59:istore          4
		PdfIndirectReference pdfindirectreference = writer.getPdfIndirectReference();
	//   28   61:aload_0         
	//   29   62:getfield        #129 <Field PdfStamperImp writer>
	//   30   65:invokevirtual   #818 <Method PdfIndirectReference PdfStamperImp.getPdfIndirectReference()>
	//   31   68:astore          11
		writer.setSigFlags(3);
	//   32   70:aload_0         
	//   33   71:getfield        #129 <Field PdfStamperImp writer>
	//   34   74:iconst_3        
	//   35   75:invokevirtual   #821 <Method void PdfStamperImp.setSigFlags(int)>
		Object obj = null;
	//   36   78:aconst_null     
	//   37   79:astore          9
		if(flag1)
	//*  38   81:iload           4
	//*  39   83:ifeq            319
		{
			obj2 = ((Object) (((AcroFields) (obj1)).getFieldItem(((String) (obj2))).getWidget(0)));
	//   40   86:aload           10
	//   41   88:aload           12
	//   42   90:invokevirtual   #740 <Method AcroFields$Item AcroFields.getFieldItem(String)>
	//   43   93:iconst_0        
	//   44   94:invokevirtual   #827 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//   45   97:astore          12
			writer.markUsed(((PdfObject) (obj2)));
	//   46   99:aload_0         
	//   47  100:getfield        #129 <Field PdfStamperImp writer>
	//   48  103:aload           12
	//   49  105:invokevirtual   #831 <Method void PdfStamperImp.markUsed(PdfObject)>
			obj1 = ((Object) (((PdfDictionary) (obj2)).getAsDict(PdfName.LOCK)));
	//   50  108:aload           12
	//   51  110:getstatic       #834 <Field PdfName PdfName.LOCK>
	//   52  113:invokevirtual   #838 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   53  116:astore          10
			obj = obj1;
	//   54  118:aload           10
	//   55  120:astore          9
			if(obj1 == null)
	//*  56  122:aload           10
	//*  57  124:ifnonnull       166
			{
				obj = obj1;
	//   58  127:aload           10
	//   59  129:astore          9
				if(fieldLock != null)
	//*  60  131:aload_0         
	//*  61  132:getfield        #719 <Field PdfSigLockDictionary fieldLock>
	//*  62  135:ifnull          166
				{
					((PdfDictionary) (obj2)).put(PdfName.LOCK, ((PdfObject) (writer.addToBody(((PdfObject) (fieldLock))).getIndirectReference())));
	//   63  138:aload           12
	//   64  140:getstatic       #834 <Field PdfName PdfName.LOCK>
	//   65  143:aload_0         
	//   66  144:getfield        #129 <Field PdfStamperImp writer>
	//   67  147:aload_0         
	//   68  148:getfield        #719 <Field PdfSigLockDictionary fieldLock>
	//   69  151:invokevirtual   #842 <Method PdfIndirectObject PdfStamperImp.addToBody(PdfObject)>
	//   70  154:invokevirtual   #847 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   71  157:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
					obj = ((Object) (fieldLock));
	//   72  160:aload_0         
	//   73  161:getfield        #719 <Field PdfSigLockDictionary fieldLock>
	//   74  164:astore          9
				}
			}
			((PdfDictionary) (obj2)).put(PdfName.P, ((PdfObject) (writer.getPageReference(getPage()))));
	//   75  166:aload           12
	//   76  168:getstatic       #163 <Field PdfName PdfName.P>
	//   77  171:aload_0         
	//   78  172:getfield        #129 <Field PdfStamperImp writer>
	//   79  175:aload_0         
	//   80  176:invokevirtual   #849 <Method int getPage()>
	//   81  179:invokevirtual   #853 <Method PdfIndirectReference PdfStamperImp.getPageReference(int)>
	//   82  182:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
			((PdfDictionary) (obj2)).put(PdfName.V, ((PdfObject) (pdfindirectreference)));
	//   83  185:aload           12
	//   84  187:getstatic       #175 <Field PdfName PdfName.V>
	//   85  190:aload           11
	//   86  192:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
			obj1 = ((Object) (PdfReader.getPdfObjectRelease(((PdfDictionary) (obj2)).get(PdfName.F))));
	//   87  195:aload           12
	//   88  197:getstatic       #855 <Field PdfName PdfName.F>
	//   89  200:invokevirtual   #246 <Method PdfObject PdfDictionary.get(PdfName)>
	//   90  203:invokestatic    #859 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   91  206:astore          10
			boolean flag = false;
	//   92  208:iconst_0        
	//   93  209:istore_3        
			int i = ((int) (flag));
	//   94  210:iload_3         
	//   95  211:istore_2        
			if(obj1 != null)
	//*  96  212:aload           10
	//*  97  214:ifnull          236
			{
				i = ((int) (flag));
	//   98  217:iload_3         
	//   99  218:istore_2        
				if(((PdfObject) (obj1)).isNumber())
	//* 100  219:aload           10
	//* 101  221:invokevirtual   #862 <Method boolean PdfObject.isNumber()>
	//* 102  224:ifeq            236
					i = ((PdfNumber)obj1).intValue();
	//  103  227:aload           10
	//  104  229:checkcast       #165 <Class PdfNumber>
	//  105  232:invokevirtual   #865 <Method int PdfNumber.intValue()>
	//  106  235:istore_2        
			}
			((PdfDictionary) (obj2)).put(PdfName.F, ((PdfObject) (new PdfNumber(i | 0x80))));
	//  107  236:aload           12
	//  108  238:getstatic       #855 <Field PdfName PdfName.F>
	//  109  241:new             #165 <Class PdfNumber>
	//  110  244:dup             
	//  111  245:iload_2         
	//  112  246:sipush          128
	//  113  249:ior             
	//  114  250:invokespecial   #168 <Method void PdfNumber(int)>
	//  115  253:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
			obj1 = ((Object) (new PdfDictionary()));
	//  116  256:new             #156 <Class PdfDictionary>
	//  117  259:dup             
	//  118  260:invokespecial   #157 <Method void PdfDictionary()>
	//  119  263:astore          10
			((PdfDictionary) (obj1)).put(PdfName.N, ((PdfObject) (getAppearance().getIndirectReference())));
	//  120  265:aload           10
	//  121  267:getstatic       #868 <Field PdfName PdfName.N>
	//  122  270:aload_0         
	//  123  271:invokevirtual   #870 <Method PdfTemplate getAppearance()>
	//  124  274:invokevirtual   #871 <Method PdfIndirectReference PdfTemplate.getIndirectReference()>
	//  125  277:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
			((PdfDictionary) (obj2)).put(PdfName.AP, ((PdfObject) (obj1)));
	//  126  280:aload           12
	//  127  282:getstatic       #874 <Field PdfName PdfName.AP>
	//  128  285:aload           10
	//  129  287:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		} else
	//* 130  290:aload_0         
	//* 131  291:new             #367 <Class HashMap>
	//* 132  294:dup             
	//* 133  295:invokespecial   #875 <Method void HashMap()>
	//* 134  298:putfield        #365 <Field HashMap exclusionLocations>
	//* 135  301:aload_0         
	//* 136  302:getfield        #715 <Field PdfDictionary cryptoDictionary>
	//* 137  305:ifnonnull       459
	//* 138  308:new             #312 <Class DocumentException>
	//* 139  311:dup             
	//* 140  312:ldc2            #877 <String "No crypto dictionary defined.">
	//* 141  315:invokespecial   #323 <Method void DocumentException(String)>
	//* 142  318:athrow          
		{
			obj1 = ((Object) (PdfFormField.createSignature(((PdfWriter) (writer)))));
	//  143  319:aload_0         
	//  144  320:getfield        #129 <Field PdfStamperImp writer>
	//  145  323:invokestatic    #883 <Method PdfFormField PdfFormField.createSignature(PdfWriter)>
	//  146  326:astore          10
			((PdfFormField) (obj1)).setFieldName(((String) (obj2)));
	//  147  328:aload           10
	//  148  330:aload           12
	//  149  332:invokevirtual   #886 <Method void PdfFormField.setFieldName(String)>
			((PdfFormField) (obj1)).put(PdfName.V, ((PdfObject) (pdfindirectreference)));
	//  150  335:aload           10
	//  151  337:getstatic       #175 <Field PdfName PdfName.V>
	//  152  340:aload           11
	//  153  342:invokevirtual   #887 <Method void PdfFormField.put(PdfName, PdfObject)>
			((PdfFormField) (obj1)).setFlags(132);
	//  154  345:aload           10
	//  155  347:sipush          132
	//  156  350:invokevirtual   #890 <Method void PdfFormField.setFlags(int)>
			if(fieldLock != null)
	//* 157  353:aload_0         
	//* 158  354:getfield        #719 <Field PdfSigLockDictionary fieldLock>
	//* 159  357:ifnull          388
			{
				((PdfFormField) (obj1)).put(PdfName.LOCK, ((PdfObject) (writer.addToBody(((PdfObject) (fieldLock))).getIndirectReference())));
	//  160  360:aload           10
	//  161  362:getstatic       #834 <Field PdfName PdfName.LOCK>
	//  162  365:aload_0         
	//  163  366:getfield        #129 <Field PdfStamperImp writer>
	//  164  369:aload_0         
	//  165  370:getfield        #719 <Field PdfSigLockDictionary fieldLock>
	//  166  373:invokevirtual   #842 <Method PdfIndirectObject PdfStamperImp.addToBody(PdfObject)>
	//  167  376:invokevirtual   #847 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  168  379:invokevirtual   #887 <Method void PdfFormField.put(PdfName, PdfObject)>
				obj = ((Object) (fieldLock));
	//  169  382:aload_0         
	//  170  383:getfield        #719 <Field PdfSigLockDictionary fieldLock>
	//  171  386:astore          9
			}
			int j = getPage();
	//  172  388:aload_0         
	//  173  389:invokevirtual   #849 <Method int getPage()>
	//  174  392:istore_2        
			if(!isInvisible())
	//* 175  393:aload_0         
	//* 176  394:invokevirtual   #456 <Method boolean isInvisible()>
	//* 177  397:ifne            441
				((PdfFormField) (obj1)).setWidget(getPageRect(), ((PdfName) (null)));
	//  178  400:aload           10
	//  179  402:aload_0         
	//  180  403:invokevirtual   #892 <Method Rectangle getPageRect()>
	//  181  406:aconst_null     
	//  182  407:invokevirtual   #896 <Method void PdfFormField.setWidget(Rectangle, PdfName)>
			else
	//* 183  410:aload           10
	//* 184  412:getstatic       #901 <Field PdfName PdfAnnotation.APPEARANCE_NORMAL>
	//* 185  415:aload_0         
	//* 186  416:invokevirtual   #870 <Method PdfTemplate getAppearance()>
	//* 187  419:invokevirtual   #905 <Method void PdfFormField.setAppearance(PdfName, PdfTemplate)>
	//* 188  422:aload           10
	//* 189  424:iload_2         
	//* 190  425:invokevirtual   #908 <Method void PdfFormField.setPage(int)>
	//* 191  428:aload_0         
	//* 192  429:getfield        #129 <Field PdfStamperImp writer>
	//* 193  432:aload           10
	//* 194  434:iload_2         
	//* 195  435:invokevirtual   #912 <Method void PdfStamperImp.addAnnotation(PdfAnnotation, int)>
	//* 196  438:goto            290
				((PdfFormField) (obj1)).setWidget(new Rectangle(0.0F, 0.0F), ((PdfName) (null)));
	//  197  441:aload           10
	//  198  443:new             #267 <Class Rectangle>
	//  199  446:dup             
	//  200  447:fconst_0        
	//  201  448:fconst_0        
	//  202  449:invokespecial   #271 <Method void Rectangle(float, float)>
	//  203  452:aconst_null     
	//  204  453:invokevirtual   #896 <Method void PdfFormField.setWidget(Rectangle, PdfName)>
			((PdfFormField) (obj1)).setAppearance(PdfAnnotation.APPEARANCE_NORMAL, getAppearance());
			((PdfFormField) (obj1)).setPage(j);
			writer.addAnnotation(((PdfAnnotation) (obj1)), j);
		}
		exclusionLocations = new HashMap();
		if(cryptoDictionary == null)
			throw new DocumentException("No crypto dictionary defined.");
	//* 205  456:goto            410
		obj1 = ((Object) (new PdfLiteral(80)));
	//  206  459:new             #372 <Class PdfLiteral>
	//  207  462:dup             
	//  208  463:bipush          80
	//  209  465:invokespecial   #913 <Method void PdfLiteral(int)>
	//  210  468:astore          10
		exclusionLocations.put(((Object) (PdfName.BYTERANGE)), obj1);
	//  211  470:aload_0         
	//  212  471:getfield        #365 <Field HashMap exclusionLocations>
	//  213  474:getstatic       #916 <Field PdfName PdfName.BYTERANGE>
	//  214  477:aload           10
	//  215  479:invokevirtual   #919 <Method Object HashMap.put(Object, Object)>
	//  216  482:pop             
		cryptoDictionary.put(PdfName.BYTERANGE, ((PdfObject) (obj1)));
	//  217  483:aload_0         
	//  218  484:getfield        #715 <Field PdfDictionary cryptoDictionary>
	//  219  487:getstatic       #916 <Field PdfName PdfName.BYTERANGE>
	//  220  490:aload           10
	//  221  492:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		PdfName pdfname;
		Object obj3;
		for(hashmap = ((HashMap) (hashmap.entrySet().iterator())); ((Iterator) (hashmap)).hasNext(); cryptoDictionary.put(pdfname, ((PdfObject) (obj3))))
	//* 222  495:aload_1         
	//* 223  496:invokevirtual   #922 <Method Set HashMap.entrySet()>
	//* 224  499:invokeinterface #354 <Method Iterator Set.iterator()>
	//* 225  504:astore_1        
	//* 226  505:aload_1         
	//* 227  506:invokeinterface #359 <Method boolean Iterator.hasNext()>
	//* 228  511:ifeq            585
		{
			obj3 = ((Object) ((java.util.Map.Entry)((Iterator) (hashmap)).next()));
	//  229  514:aload_1         
	//  230  515:invokeinterface #363 <Method Object Iterator.next()>
	//  231  520:checkcast       #924 <Class java.util.Map$Entry>
	//  232  523:astore          12
			pdfname = (PdfName)((java.util.Map.Entry) (obj3)).getKey();
	//  233  525:aload           12
	//  234  527:invokeinterface #927 <Method Object java.util.Map$Entry.getKey()>
	//  235  532:checkcast       #159 <Class PdfName>
	//  236  535:astore          10
			obj3 = ((Object) (new PdfLiteral(((Integer)((java.util.Map.Entry) (obj3)).getValue()).intValue())));
	//  237  537:new             #372 <Class PdfLiteral>
	//  238  540:dup             
	//  239  541:aload           12
	//  240  543:invokeinterface #930 <Method Object java.util.Map$Entry.getValue()>
	//  241  548:checkcast       #932 <Class Integer>
	//  242  551:invokevirtual   #933 <Method int Integer.intValue()>
	//  243  554:invokespecial   #913 <Method void PdfLiteral(int)>
	//  244  557:astore          12
			exclusionLocations.put(((Object) (pdfname)), obj3);
	//  245  559:aload_0         
	//  246  560:getfield        #365 <Field HashMap exclusionLocations>
	//  247  563:aload           10
	//  248  565:aload           12
	//  249  567:invokevirtual   #919 <Method Object HashMap.put(Object, Object)>
	//  250  570:pop             
		}

	//  251  571:aload_0         
	//  252  572:getfield        #715 <Field PdfDictionary cryptoDictionary>
	//  253  575:aload           10
	//  254  577:aload           12
	//  255  579:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 256  582:goto            505
		if(certificationLevel > 0)
	//* 257  585:aload_0         
	//* 258  586:getfield        #98  <Field int certificationLevel>
	//* 259  589:ifle            600
			addDocMDP(cryptoDictionary);
	//  260  592:aload_0         
	//  261  593:aload_0         
	//  262  594:getfield        #715 <Field PdfDictionary cryptoDictionary>
	//  263  597:invokespecial   #935 <Method void addDocMDP(PdfDictionary)>
		if(obj != null)
	//* 264  600:aload           9
	//* 265  602:ifnull          615
			addFieldMDP(cryptoDictionary, ((PdfDictionary) (obj)));
	//  266  605:aload_0         
	//  267  606:aload_0         
	//  268  607:getfield        #715 <Field PdfDictionary cryptoDictionary>
	//  269  610:aload           9
	//  270  612:invokespecial   #937 <Method void addFieldMDP(PdfDictionary, PdfDictionary)>
		if(signatureEvent != null)
	//* 271  615:aload_0         
	//* 272  616:getfield        #788 <Field PdfSignatureAppearance$SignatureEvent signatureEvent>
	//* 273  619:ifnull          635
			signatureEvent.getSignatureDictionary(cryptoDictionary);
	//  274  622:aload_0         
	//  275  623:getfield        #788 <Field PdfSignatureAppearance$SignatureEvent signatureEvent>
	//  276  626:aload_0         
	//  277  627:getfield        #715 <Field PdfDictionary cryptoDictionary>
	//  278  630:invokeinterface #940 <Method void PdfSignatureAppearance$SignatureEvent.getSignatureDictionary(PdfDictionary)>
		writer.addToBody(((PdfObject) (cryptoDictionary)), pdfindirectreference, false);
	//  279  635:aload_0         
	//  280  636:getfield        #129 <Field PdfStamperImp writer>
	//  281  639:aload_0         
	//  282  640:getfield        #715 <Field PdfDictionary cryptoDictionary>
	//  283  643:aload           11
	//  284  645:iconst_0        
	//  285  646:invokevirtual   #943 <Method PdfIndirectObject PdfStamperImp.addToBody(PdfObject, PdfIndirectReference, boolean)>
	//  286  649:pop             
		if(certificationLevel > 0)
	//* 287  650:aload_0         
	//* 288  651:getfield        #98  <Field int certificationLevel>
	//* 289  654:ifle            705
		{
			hashmap = ((HashMap) (new PdfDictionary()));
	//  290  657:new             #156 <Class PdfDictionary>
	//  291  660:dup             
	//  292  661:invokespecial   #157 <Method void PdfDictionary()>
	//  293  664:astore_1        
			((PdfDictionary) (hashmap)).put(new PdfName("DocMDP"), ((PdfObject) (pdfindirectreference)));
	//  294  665:aload_1         
	//  295  666:new             #159 <Class PdfName>
	//  296  669:dup             
	//  297  670:ldc2            #945 <String "DocMDP">
	//  298  673:invokespecial   #180 <Method void PdfName(String)>
	//  299  676:aload           11
	//  300  678:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
			writer.reader.getCatalog().put(new PdfName("Perms"), ((PdfObject) (hashmap)));
	//  301  681:aload_0         
	//  302  682:getfield        #129 <Field PdfStamperImp writer>
	//  303  685:getfield        #233 <Field PdfReader PdfStamperImp.reader>
	//  304  688:invokevirtual   #948 <Method PdfDictionary PdfReader.getCatalog()>
	//  305  691:new             #159 <Class PdfName>
	//  306  694:dup             
	//  307  695:ldc2            #950 <String "Perms">
	//  308  698:invokespecial   #180 <Method void PdfName(String)>
	//  309  701:aload_1         
	//  310  702:invokevirtual   #172 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		writer.close(stamper.getMoreInfo());
	//  311  705:aload_0         
	//  312  706:getfield        #129 <Field PdfStamperImp writer>
	//  313  709:aload_0         
	//  314  710:getfield        #797 <Field PdfStamper stamper>
	//  315  713:invokevirtual   #953 <Method Map PdfStamper.getMoreInfo()>
	//  316  716:invokevirtual   #956 <Method void PdfStamperImp.close(Map)>
		range = new long[exclusionLocations.size() * 2];
	//  317  719:aload_0         
	//  318  720:aload_0         
	//  319  721:getfield        #365 <Field HashMap exclusionLocations>
	//  320  724:invokevirtual   #428 <Method int HashMap.size()>
	//  321  727:iconst_2        
	//  322  728:imul            
	//  323  729:newarray        long[]
	//  324  731:putfield        #769 <Field long[] range>
		l1 = ((PdfLiteral)exclusionLocations.get(((Object) (PdfName.BYTERANGE)))).getPosition();
	//  325  734:aload_0         
	//  326  735:getfield        #365 <Field HashMap exclusionLocations>
	//  327  738:getstatic       #916 <Field PdfName PdfName.BYTERANGE>
	//  328  741:invokevirtual   #370 <Method Object HashMap.get(Object)>
	//  329  744:checkcast       #372 <Class PdfLiteral>
	//  330  747:invokevirtual   #412 <Method long PdfLiteral.getPosition()>
	//  331  750:lstore          5
		exclusionLocations.remove(((Object) (PdfName.BYTERANGE)));
	//  332  752:aload_0         
	//  333  753:getfield        #365 <Field HashMap exclusionLocations>
	//  334  756:getstatic       #916 <Field PdfName PdfName.BYTERANGE>
	//  335  759:invokevirtual   #959 <Method Object HashMap.remove(Object)>
	//  336  762:pop             
		int k = 1;
	//  337  763:iconst_1        
	//  338  764:istore_2        
		for(hashmap = ((HashMap) (exclusionLocations.values().iterator())); ((Iterator) (hashmap)).hasNext();)
	//* 339  765:aload_0         
	//* 340  766:getfield        #365 <Field HashMap exclusionLocations>
	//* 341  769:invokevirtual   #963 <Method Collection HashMap.values()>
	//* 342  772:invokeinterface #966 <Method Iterator Collection.iterator()>
	//* 343  777:astore_1        
	//* 344  778:aload_1         
	//* 345  779:invokeinterface #359 <Method boolean Iterator.hasNext()>
	//* 346  784:ifeq            847
		{
			PdfLiteral pdfliteral = (PdfLiteral)((Iterator) (hashmap)).next();
	//  347  787:aload_1         
	//  348  788:invokeinterface #363 <Method Object Iterator.next()>
	//  349  793:checkcast       #372 <Class PdfLiteral>
	//  350  796:astore          9
			long l2 = pdfliteral.getPosition();
	//  351  798:aload           9
	//  352  800:invokevirtual   #412 <Method long PdfLiteral.getPosition()>
	//  353  803:lstore          7
			long al[] = range;
	//  354  805:aload_0         
	//  355  806:getfield        #769 <Field long[] range>
	//  356  809:astore          10
			int k1 = k + 1;
	//  357  811:iload_2         
	//  358  812:iconst_1        
	//  359  813:iadd            
	//  360  814:istore_3        
			al[k] = l2;
	//  361  815:aload           10
	//  362  817:iload_2         
	//  363  818:lload           7
	//  364  820:lastore         
			al = range;
	//  365  821:aload_0         
	//  366  822:getfield        #769 <Field long[] range>
	//  367  825:astore          10
			k = k1 + 1;
	//  368  827:iload_3         
	//  369  828:iconst_1        
	//  370  829:iadd            
	//  371  830:istore_2        
			al[k1] = (long)pdfliteral.getPosLength() + l2;
	//  372  831:aload           10
	//  373  833:iload_3         
	//  374  834:aload           9
	//  375  836:invokevirtual   #396 <Method int PdfLiteral.getPosLength()>
	//  376  839:i2l             
	//  377  840:lload           7
	//  378  842:ladd            
	//  379  843:lastore         
		}

	//* 380  844:goto            778
		Arrays.sort(range, 1, range.length - 1);
	//  381  847:aload_0         
	//  382  848:getfield        #769 <Field long[] range>
	//  383  851:iconst_1        
	//  384  852:aload_0         
	//  385  853:getfield        #769 <Field long[] range>
	//  386  856:arraylength     
	//  387  857:iconst_1        
	//  388  858:isub            
	//  389  859:invokestatic    #972 <Method void Arrays.sort(long[], int, int)>
		for(int l = 3; l < range.length - 2; l += 2)
	//* 390  862:iconst_3        
	//* 391  863:istore_2        
	//* 392  864:iload_2         
	//* 393  865:aload_0         
	//* 394  866:getfield        #769 <Field long[] range>
	//* 395  869:arraylength     
	//* 396  870:iconst_2        
	//* 397  871:isub            
	//* 398  872:icmpge          902
		{
			hashmap = ((HashMap) (range));
	//  399  875:aload_0         
	//  400  876:getfield        #769 <Field long[] range>
	//  401  879:astore_1        
			hashmap[l] = hashmap[l] - range[l - 1];
	//  402  880:aload_1         
	//  403  881:iload_2         
	//  404  882:aload_1         
	//  405  883:iload_2         
	//  406  884:laload          
	//  407  885:aload_0         
	//  408  886:getfield        #769 <Field long[] range>
	//  409  889:iload_2         
	//  410  890:iconst_1        
	//  411  891:isub            
	//  412  892:laload          
	//  413  893:lsub            
	//  414  894:lastore         
		}

	//  415  895:iload_2         
	//  416  896:iconst_2        
	//  417  897:iadd            
	//  418  898:istore_2        
	//* 419  899:goto            864
		if(tempFile == null)
	//* 420  902:aload_0         
	//* 421  903:getfield        #327 <Field File tempFile>
	//* 422  906:ifnonnull       1037
		{
			bout = sigout.getBuffer();
	//  423  909:aload_0         
	//  424  910:aload_0         
	//  425  911:getfield        #793 <Field ByteBuffer sigout>
	//  426  914:invokevirtual   #408 <Method byte[] ByteBuffer.getBuffer()>
	//  427  917:putfield        #297 <Field byte[] bout>
			boutLen = sigout.size();
	//  428  920:aload_0         
	//  429  921:aload_0         
	//  430  922:getfield        #793 <Field ByteBuffer sigout>
	//  431  925:invokevirtual   #393 <Method int ByteBuffer.size()>
	//  432  928:putfield        #432 <Field int boutLen>
			range[range.length - 1] = (long)boutLen - range[range.length - 2];
	//  433  931:aload_0         
	//  434  932:getfield        #769 <Field long[] range>
	//  435  935:aload_0         
	//  436  936:getfield        #769 <Field long[] range>
	//  437  939:arraylength     
	//  438  940:iconst_1        
	//  439  941:isub            
	//  440  942:aload_0         
	//  441  943:getfield        #432 <Field int boutLen>
	//  442  946:i2l             
	//  443  947:aload_0         
	//  444  948:getfield        #769 <Field long[] range>
	//  445  951:aload_0         
	//  446  952:getfield        #769 <Field long[] range>
	//  447  955:arraylength     
	//  448  956:iconst_2        
	//  449  957:isub            
	//  450  958:laload          
	//  451  959:lsub            
	//  452  960:lastore         
			hashmap = ((HashMap) (new ByteBuffer()));
	//  453  961:new             #343 <Class ByteBuffer>
	//  454  964:dup             
	//  455  965:invokespecial   #344 <Method void ByteBuffer()>
	//  456  968:astore_1        
			((ByteBuffer) (hashmap)).append('[');
	//  457  969:aload_1         
	//  458  970:bipush          91
	//  459  972:invokevirtual   #975 <Method ByteBuffer ByteBuffer.append(char)>
	//  460  975:pop             
			for(int i1 = 0; i1 < range.length; i1++)
	//* 461  976:iconst_0        
	//* 462  977:istore_2        
	//* 463  978:iload_2         
	//* 464  979:aload_0         
	//* 465  980:getfield        #769 <Field long[] range>
	//* 466  983:arraylength     
	//* 467  984:icmpge          1010
				((ByteBuffer) (hashmap)).append(range[i1]).append(' ');
	//  468  987:aload_1         
	//  469  988:aload_0         
	//  470  989:getfield        #769 <Field long[] range>
	//  471  992:iload_2         
	//  472  993:laload          
	//  473  994:invokevirtual   #978 <Method ByteBuffer ByteBuffer.append(long)>
	//  474  997:bipush          32
	//  475  999:invokevirtual   #975 <Method ByteBuffer ByteBuffer.append(char)>
	//  476 1002:pop             

	//  477 1003:iload_2         
	//  478 1004:iconst_1        
	//  479 1005:iadd            
	//  480 1006:istore_2        
	//* 481 1007:goto            978
			((ByteBuffer) (hashmap)).append(']');
	//  482 1010:aload_1         
	//  483 1011:bipush          93
	//  484 1013:invokevirtual   #975 <Method ByteBuffer ByteBuffer.append(char)>
	//  485 1016:pop             
			System.arraycopy(((Object) (((ByteBuffer) (hashmap)).getBuffer())), 0, ((Object) (bout)), (int)l1, ((ByteBuffer) (hashmap)).size());
	//  486 1017:aload_1         
	//  487 1018:invokevirtual   #408 <Method byte[] ByteBuffer.getBuffer()>
	//  488 1021:iconst_0        
	//  489 1022:aload_0         
	//  490 1023:getfield        #297 <Field byte[] bout>
	//  491 1026:lload           5
	//  492 1028:l2i             
	//  493 1029:aload_1         
	//  494 1030:invokevirtual   #393 <Method int ByteBuffer.size()>
	//  495 1033:invokestatic    #418 <Method void System.arraycopy(Object, int, Object, int, int)>
			return;
	//  496 1036:return          
		}
		raf = new RandomAccessFile(tempFile, "rw");
	//  497 1037:aload_0         
	//  498 1038:new             #329 <Class RandomAccessFile>
	//  499 1041:dup             
	//  500 1042:aload_0         
	//  501 1043:getfield        #327 <Field File tempFile>
	//  502 1046:ldc2            #980 <String "rw">
	//  503 1049:invokespecial   #983 <Method void RandomAccessFile(File, String)>
	//  504 1052:putfield        #295 <Field RandomAccessFile raf>
		long l3 = raf.length();
	//  505 1055:aload_0         
	//  506 1056:getfield        #295 <Field RandomAccessFile raf>
	//  507 1059:invokevirtual   #436 <Method long RandomAccessFile.length()>
	//  508 1062:lstore          7
		range[range.length - 1] = l3 - range[range.length - 2];
	//  509 1064:aload_0         
	//  510 1065:getfield        #769 <Field long[] range>
	//  511 1068:aload_0         
	//  512 1069:getfield        #769 <Field long[] range>
	//  513 1072:arraylength     
	//  514 1073:iconst_1        
	//  515 1074:isub            
	//  516 1075:lload           7
	//  517 1077:aload_0         
	//  518 1078:getfield        #769 <Field long[] range>
	//  519 1081:aload_0         
	//  520 1082:getfield        #769 <Field long[] range>
	//  521 1085:arraylength     
	//  522 1086:iconst_2        
	//  523 1087:isub            
	//  524 1088:laload          
	//  525 1089:lsub            
	//  526 1090:lastore         
		hashmap = ((HashMap) (new ByteBuffer()));
	//  527 1091:new             #343 <Class ByteBuffer>
	//  528 1094:dup             
	//  529 1095:invokespecial   #344 <Method void ByteBuffer()>
	//  530 1098:astore_1        
		((ByteBuffer) (hashmap)).append('[');
	//  531 1099:aload_1         
	//  532 1100:bipush          91
	//  533 1102:invokevirtual   #975 <Method ByteBuffer ByteBuffer.append(char)>
	//  534 1105:pop             
		int j1 = 0;
	//  535 1106:iconst_0        
	//  536 1107:istore_2        
_L2:
		if(j1 >= range.length)
			break; /* Loop/switch isn't completed */
	//  537 1108:iload_2         
	//  538 1109:aload_0         
	//  539 1110:getfield        #769 <Field long[] range>
	//  540 1113:arraylength     
	//  541 1114:icmpge          1140
		((ByteBuffer) (hashmap)).append(range[j1]).append(' ');
	//  542 1117:aload_1         
	//  543 1118:aload_0         
	//  544 1119:getfield        #769 <Field long[] range>
	//  545 1122:iload_2         
	//  546 1123:laload          
	//  547 1124:invokevirtual   #978 <Method ByteBuffer ByteBuffer.append(long)>
	//  548 1127:bipush          32
	//  549 1129:invokevirtual   #975 <Method ByteBuffer ByteBuffer.append(char)>
	//  550 1132:pop             
		j1++;
	//  551 1133:iload_2         
	//  552 1134:iconst_1        
	//  553 1135:iadd            
	//  554 1136:istore_2        
		if(true) goto _L2; else goto _L1
	//  555 1137:goto            1108
_L1:
		try
		{
			((ByteBuffer) (hashmap)).append(']');
	//  556 1140:aload_1         
	//  557 1141:bipush          93
	//  558 1143:invokevirtual   #975 <Method ByteBuffer ByteBuffer.append(char)>
	//  559 1146:pop             
			raf.seek(l1);
	//  560 1147:aload_0         
	//  561 1148:getfield        #295 <Field RandomAccessFile raf>
	//  562 1151:lload           5
	//  563 1153:invokevirtual   #422 <Method void RandomAccessFile.seek(long)>
			raf.write(((ByteBuffer) (hashmap)).getBuffer(), 0, ((ByteBuffer) (hashmap)).size());
	//  564 1156:aload_0         
	//  565 1157:getfield        #295 <Field RandomAccessFile raf>
	//  566 1160:aload_1         
	//  567 1161:invokevirtual   #408 <Method byte[] ByteBuffer.getBuffer()>
	//  568 1164:iconst_0        
	//  569 1165:aload_1         
	//  570 1166:invokevirtual   #393 <Method int ByteBuffer.size()>
	//  571 1169:invokevirtual   #426 <Method void RandomAccessFile.write(byte[], int, int)>
			return;
	//  572 1172:return          
		}
		// Misplaced declaration of an exception variable
		catch(HashMap hashmap) { }
	//  573 1173:astore_1        
		try
		{
			raf.close();
	//  574 1174:aload_0         
	//  575 1175:getfield        #295 <Field RandomAccessFile raf>
	//  576 1178:invokevirtual   #330 <Method void RandomAccessFile.close()>
		}
	//* 577 1181:aload_0         
	//* 578 1182:getfield        #327 <Field File tempFile>
	//* 579 1185:invokevirtual   #338 <Method boolean File.delete()>
	//* 580 1188:pop             
	//* 581 1189:aload_1         
	//* 582 1190:athrow          
	//* 583 1191:astore          9
	//* 584 1193:goto            1189
		catch(Exception exception1) { }
	//  585 1196:astore          9
		try
		{
			tempFile.delete();
		}
		catch(Exception exception) { }
		throw hashmap;
	//* 586 1198:goto            1181
	}

	public void setAcro6Layers(boolean flag)
	{
		acro6Layers = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #117 <Field boolean acro6Layers>
	//    3    5:return          
	}

	public void setCertificate(Certificate certificate)
	{
		signCertificate = certificate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #473 <Field Certificate signCertificate>
	//    3    5:return          
	}

	public void setCertificationLevel(int i)
	{
		certificationLevel = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #98  <Field int certificationLevel>
	//    3    5:return          
	}

	public void setContact(String s)
	{
		contact = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #712 <Field String contact>
	//    3    5:return          
	}

	public void setCryptoDictionary(PdfDictionary pdfdictionary)
	{
		cryptoDictionary = pdfdictionary;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #715 <Field PdfDictionary cryptoDictionary>
	//    3    5:return          
	}

	public void setFieldLockDict(PdfSigLockDictionary pdfsiglockdictionary)
	{
		fieldLock = pdfsiglockdictionary;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #719 <Field PdfSigLockDictionary fieldLock>
	//    3    5:return          
	}

	public void setImage(Image image1)
	{
		image = image1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #524 <Field Image image>
	//    3    5:return          
	}

	public void setImageScale(float f)
	{
		imageScale = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #526 <Field float imageScale>
	//    3    5:return          
	}

	public void setLayer2Font(Font font)
	{
		layer2Font = font;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #539 <Field Font layer2Font>
	//    3    5:return          
	}

	public void setLayer2Text(String s)
	{
		layer2Text = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #462 <Field String layer2Text>
	//    3    5:return          
	}

	public void setLayer4Text(String s)
	{
		layer4Text = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #610 <Field String layer4Text>
	//    3    5:return          
	}

	public void setLocation(String s)
	{
		location = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #517 <Field String location>
	//    3    5:return          
	}

	public void setLocationCaption(String s)
	{
		locationCaption = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field String locationCaption>
	//    3    5:return          
	}

	void setOriginalout(OutputStream outputstream)
	{
		originalout = outputstream;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #332 <Field OutputStream originalout>
	//    3    5:return          
	}

	public void setReason(String s)
	{
		reason = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #515 <Field String reason>
	//    3    5:return          
	}

	public void setReasonCaption(String s)
	{
		reasonCaption = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #102 <Field String reasonCaption>
	//    3    5:return          
	}

	public void setRenderingMode(RenderingMode renderingmode)
	{
		renderingMode = renderingmode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field PdfSignatureAppearance$RenderingMode renderingMode>
	//    3    5:return          
	}

	public void setReuseAppearance(boolean flag)
	{
		reuseAppearance = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #123 <Field boolean reuseAppearance>
	//    3    5:return          
	}

	public void setRunDirection(int i)
	{
		if(i < 0 || i > 3)
	//*   0    0:iload_1         
	//*   1    1:iflt            9
	//*   2    4:iload_1         
	//*   3    5:iconst_3        
	//*   4    6:icmple          24
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("invalid.run.direction.1", i));
	//    5    9:new             #1010 <Class RuntimeException>
	//    6   12:dup             
	//    7   13:ldc2            #1012 <String "invalid.run.direction.1">
	//    8   16:iload_1         
	//    9   17:invokestatic    #1015 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   10   20:invokespecial   #1016 <Method void RuntimeException(String)>
	//   11   23:athrow          
		} else
		{
			runDirection = i;
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:putfield        #125 <Field int runDirection>
			return;
	//   15   29:return          
		}
	}

	public void setSignDate(Calendar calendar)
	{
		signDate = calendar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #134 <Field Calendar signDate>
	//    3    5:return          
	}

	public void setSignatureCreator(String s)
	{
		signatureCreator = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #151 <Field String signatureCreator>
	//    3    5:return          
	}

	public void setSignatureEvent(SignatureEvent signatureevent)
	{
		signatureEvent = signatureevent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #788 <Field PdfSignatureAppearance$SignatureEvent signatureEvent>
	//    3    5:return          
	}

	public void setSignatureGraphic(Image image1)
	{
		signatureGraphic = image1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field Image signatureGraphic>
	//    3    5:return          
	}

	void setSigout(ByteBuffer bytebuffer)
	{
		sigout = bytebuffer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #793 <Field ByteBuffer sigout>
	//    3    5:return          
	}

	void setStamper(PdfStamper pdfstamper)
	{
		stamper = pdfstamper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #797 <Field PdfStamper stamper>
	//    3    5:return          
	}

	void setTempFile(File file)
	{
		tempFile = file;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #327 <Field File tempFile>
	//    3    5:return          
	}

	public void setVisibleSignature(Rectangle rectangle, int i, String s)
	{
		if(s != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          72
		{
			if(s.indexOf('.') >= 0)
	//*   2    4:aload_3         
	//*   3    5:bipush          46
	//*   4    7:invokevirtual   #1033 <Method int String.indexOf(int)>
	//*   5   10:iflt            31
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("field.names.cannot.contain.a.dot", new Object[0]));
	//    6   13:new             #374 <Class IllegalArgumentException>
	//    7   16:dup             
	//    8   17:ldc2            #1035 <String "field.names.cannot.contain.a.dot">
	//    9   20:iconst_0        
	//   10   21:anewarray       Object[]
	//   11   24:invokestatic    #322 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   12   27:invokespecial   #380 <Method void IllegalArgumentException(String)>
	//   13   30:athrow          
			if(writer.getAcroFields().getFieldItem(s) != null)
	//*  14   31:aload_0         
	//*  15   32:getfield        #129 <Field PdfStamperImp writer>
	//*  16   35:invokevirtual   #686 <Method AcroFields PdfStamperImp.getAcroFields()>
	//*  17   38:aload_3         
	//*  18   39:invokevirtual   #740 <Method AcroFields$Item AcroFields.getFieldItem(String)>
	//*  19   42:ifnull          67
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.field.1.already.exists", new Object[] {
					s
				}));
	//   20   45:new             #374 <Class IllegalArgumentException>
	//   21   48:dup             
	//   22   49:ldc2            #1037 <String "the.field.1.already.exists">
	//   23   52:iconst_1        
	//   24   53:anewarray       Object[]
	//   25   56:dup             
	//   26   57:iconst_0        
	//   27   58:aload_3         
	//   28   59:aastore         
	//   29   60:invokestatic    #322 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   30   63:invokespecial   #380 <Method void IllegalArgumentException(String)>
	//   31   66:athrow          
			fieldName = s;
	//   32   67:aload_0         
	//   33   68:aload_3         
	//   34   69:putfield        #140 <Field String fieldName>
		}
		if(i < 1 || i > writer.reader.getNumberOfPages())
	//*  35   72:iload_2         
	//*  36   73:iconst_1        
	//*  37   74:icmplt          91
	//*  38   77:iload_2         
	//*  39   78:aload_0         
	//*  40   79:getfield        #129 <Field PdfStamperImp writer>
	//*  41   82:getfield        #233 <Field PdfReader PdfStamperImp.reader>
	//*  42   85:invokevirtual   #1040 <Method int PdfReader.getNumberOfPages()>
	//*  43   88:icmple          106
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("invalid.page.number.1", i));
	//   44   91:new             #374 <Class IllegalArgumentException>
	//   45   94:dup             
	//   46   95:ldc2            #1042 <String "invalid.page.number.1">
	//   47   98:iload_2         
	//   48   99:invokestatic    #1015 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   49  102:invokespecial   #380 <Method void IllegalArgumentException(String)>
	//   50  105:athrow          
		} else
		{
			pageRect = new Rectangle(rectangle);
	//   51  106:aload_0         
	//   52  107:new             #267 <Class Rectangle>
	//   53  110:dup             
	//   54  111:aload_1         
	//   55  112:invokespecial   #618 <Method void Rectangle(Rectangle)>
	//   56  115:putfield        #761 <Field Rectangle pageRect>
			pageRect.normalize();
	//   57  118:aload_0         
	//   58  119:getfield        #761 <Field Rectangle pageRect>
	//   59  122:invokevirtual   #1045 <Method void Rectangle.normalize()>
			rect = new Rectangle(pageRect.getWidth(), pageRect.getHeight());
	//   60  125:aload_0         
	//   61  126:new             #267 <Class Rectangle>
	//   62  129:dup             
	//   63  130:aload_0         
	//   64  131:getfield        #761 <Field Rectangle pageRect>
	//   65  134:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//   66  137:aload_0         
	//   67  138:getfield        #761 <Field Rectangle pageRect>
	//   68  141:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//   69  144:invokespecial   #271 <Method void Rectangle(float, float)>
	//   70  147:putfield        #520 <Field Rectangle rect>
			page = i;
	//   71  150:aload_0         
	//   72  151:iload_2         
	//   73  152:putfield        #108 <Field int page>
			return;
	//   74  155:return          
		}
	}

	public void setVisibleSignature(String s)
	{
		int i;
		AcroFields.Item item = writer.getAcroFields().getFieldItem(s);
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field PdfStamperImp writer>
	//    2    4:invokevirtual   #686 <Method AcroFields PdfStamperImp.getAcroFields()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #740 <Method AcroFields$Item AcroFields.getFieldItem(String)>
	//    5   11:astore_3        
		if(item == null)
	//*   6   12:aload_3         
	//*   7   13:ifnonnull       38
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.field.1.does.not.exist", new Object[] {
				s
			}));
	//    8   16:new             #374 <Class IllegalArgumentException>
	//    9   19:dup             
	//   10   20:ldc2            #1047 <String "the.field.1.does.not.exist">
	//   11   23:iconst_1        
	//   12   24:anewarray       Object[]
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:aload_1         
	//   16   30:aastore         
	//   17   31:invokestatic    #322 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   18   34:invokespecial   #380 <Method void IllegalArgumentException(String)>
	//   19   37:athrow          
		PdfDictionary pdfdictionary = item.getMerged(0);
	//   20   38:aload_3         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #1050 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   23   43:astore          4
		if(!PdfName.SIG.equals(((Object) (PdfReader.getPdfObject(pdfdictionary.get(PdfName.FT))))))
	//*  24   45:getstatic       #1053 <Field PdfName PdfName.SIG>
	//*  25   48:aload           4
	//*  26   50:getstatic       #1056 <Field PdfName PdfName.FT>
	//*  27   53:invokevirtual   #246 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  28   56:invokestatic    #1059 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//*  29   59:invokevirtual   #1063 <Method boolean PdfName.equals(Object)>
	//*  30   62:ifne            87
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.field.1.is.not.a.signature.field", new Object[] {
				s
			}));
	//   31   65:new             #374 <Class IllegalArgumentException>
	//   32   68:dup             
	//   33   69:ldc2            #1065 <String "the.field.1.is.not.a.signature.field">
	//   34   72:iconst_1        
	//   35   73:anewarray       Object[]
	//   36   76:dup             
	//   37   77:iconst_0        
	//   38   78:aload_1         
	//   39   79:aastore         
	//   40   80:invokestatic    #322 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   41   83:invokespecial   #380 <Method void IllegalArgumentException(String)>
	//   42   86:athrow          
		fieldName = s;
	//   43   87:aload_0         
	//   44   88:aload_1         
	//   45   89:putfield        #140 <Field String fieldName>
		s = ((String) (pdfdictionary.getAsArray(PdfName.RECT)));
	//   46   92:aload           4
	//   47   94:getstatic       #1068 <Field PdfName PdfName.RECT>
	//   48   97:invokevirtual   #261 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   49  100:astore_1        
		pageRect = new Rectangle(((PdfArray) (s)).getAsNumber(0).floatValue(), ((PdfArray) (s)).getAsNumber(1).floatValue(), ((PdfArray) (s)).getAsNumber(2).floatValue(), ((PdfArray) (s)).getAsNumber(3).floatValue());
	//   50  101:aload_0         
	//   51  102:new             #267 <Class Rectangle>
	//   52  105:dup             
	//   53  106:aload_1         
	//   54  107:iconst_0        
	//   55  108:invokevirtual   #1072 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   56  111:invokevirtual   #1075 <Method float PdfNumber.floatValue()>
	//   57  114:aload_1         
	//   58  115:iconst_1        
	//   59  116:invokevirtual   #1072 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   60  119:invokevirtual   #1075 <Method float PdfNumber.floatValue()>
	//   61  122:aload_1         
	//   62  123:iconst_2        
	//   63  124:invokevirtual   #1072 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   64  127:invokevirtual   #1075 <Method float PdfNumber.floatValue()>
	//   65  130:aload_1         
	//   66  131:iconst_3        
	//   67  132:invokevirtual   #1072 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   68  135:invokevirtual   #1075 <Method float PdfNumber.floatValue()>
	//   69  138:invokespecial   #554 <Method void Rectangle(float, float, float, float)>
	//   70  141:putfield        #761 <Field Rectangle pageRect>
		pageRect.normalize();
	//   71  144:aload_0         
	//   72  145:getfield        #761 <Field Rectangle pageRect>
	//   73  148:invokevirtual   #1045 <Method void Rectangle.normalize()>
		page = item.getPage(0).intValue();
	//   74  151:aload_0         
	//   75  152:aload_3         
	//   76  153:iconst_0        
	//   77  154:invokevirtual   #1078 <Method Integer AcroFields$Item.getPage(int)>
	//   78  157:invokevirtual   #933 <Method int Integer.intValue()>
	//   79  160:putfield        #108 <Field int page>
		i = writer.reader.getPageRotation(page);
	//   80  163:aload_0         
	//   81  164:getfield        #129 <Field PdfStamperImp writer>
	//   82  167:getfield        #233 <Field PdfReader PdfStamperImp.reader>
	//   83  170:aload_0         
	//   84  171:getfield        #108 <Field int page>
	//   85  174:invokevirtual   #616 <Method int PdfReader.getPageRotation(int)>
	//   86  177:istore_2        
		s = ((String) (writer.reader.getPageSizeWithRotation(page)));
	//   87  178:aload_0         
	//   88  179:getfield        #129 <Field PdfStamperImp writer>
	//   89  182:getfield        #233 <Field PdfReader PdfStamperImp.reader>
	//   90  185:aload_0         
	//   91  186:getfield        #108 <Field int page>
	//   92  189:invokevirtual   #1082 <Method Rectangle PdfReader.getPageSizeWithRotation(int)>
	//   93  192:astore_1        
		i;
	//   94  193:iload_2         
		JVM INSTR lookupswitch 3: default 228
	//	               90: 265
	//	               180: 317
	//	               270: 379;
	//   95  194:lookupswitch    3: default 228
	//	               90: 265
	//	               180: 317
	//	               270: 379
		   goto _L1 _L2 _L3 _L4
_L1:
		if(i != 0)
	//*  96  228:iload_2         
	//*  97  229:ifeq            239
			pageRect.normalize();
	//   98  232:aload_0         
	//   99  233:getfield        #761 <Field Rectangle pageRect>
	//  100  236:invokevirtual   #1045 <Method void Rectangle.normalize()>
		rect = new Rectangle(pageRect.getWidth(), pageRect.getHeight());
	//  101  239:aload_0         
	//  102  240:new             #267 <Class Rectangle>
	//  103  243:dup             
	//  104  244:aload_0         
	//  105  245:getfield        #761 <Field Rectangle pageRect>
	//  106  248:invokevirtual   #530 <Method float Rectangle.getWidth()>
	//  107  251:aload_0         
	//  108  252:getfield        #761 <Field Rectangle pageRect>
	//  109  255:invokevirtual   #533 <Method float Rectangle.getHeight()>
	//  110  258:invokespecial   #271 <Method void Rectangle(float, float)>
	//  111  261:putfield        #520 <Field Rectangle rect>
		return;
	//  112  264:return          
_L2:
		pageRect = new Rectangle(pageRect.getBottom(), ((Rectangle) (s)).getTop() - pageRect.getLeft(), pageRect.getTop(), ((Rectangle) (s)).getTop() - pageRect.getRight());
	//  113  265:aload_0         
	//  114  266:new             #267 <Class Rectangle>
	//  115  269:dup             
	//  116  270:aload_0         
	//  117  271:getfield        #761 <Field Rectangle pageRect>
	//  118  274:invokevirtual   #588 <Method float Rectangle.getBottom()>
	//  119  277:aload_1         
	//  120  278:invokevirtual   #594 <Method float Rectangle.getTop()>
	//  121  281:aload_0         
	//  122  282:getfield        #761 <Field Rectangle pageRect>
	//  123  285:invokevirtual   #585 <Method float Rectangle.getLeft()>
	//  124  288:fsub            
	//  125  289:aload_0         
	//  126  290:getfield        #761 <Field Rectangle pageRect>
	//  127  293:invokevirtual   #594 <Method float Rectangle.getTop()>
	//  128  296:aload_1         
	//  129  297:invokevirtual   #594 <Method float Rectangle.getTop()>
	//  130  300:aload_0         
	//  131  301:getfield        #761 <Field Rectangle pageRect>
	//  132  304:invokevirtual   #591 <Method float Rectangle.getRight()>
	//  133  307:fsub            
	//  134  308:invokespecial   #554 <Method void Rectangle(float, float, float, float)>
	//  135  311:putfield        #761 <Field Rectangle pageRect>
		continue; /* Loop/switch isn't completed */
	//  136  314:goto            228
_L3:
		pageRect = new Rectangle(((Rectangle) (s)).getRight() - pageRect.getLeft(), ((Rectangle) (s)).getTop() - pageRect.getBottom(), ((Rectangle) (s)).getRight() - pageRect.getRight(), ((Rectangle) (s)).getTop() - pageRect.getTop());
	//  137  317:aload_0         
	//  138  318:new             #267 <Class Rectangle>
	//  139  321:dup             
	//  140  322:aload_1         
	//  141  323:invokevirtual   #591 <Method float Rectangle.getRight()>
	//  142  326:aload_0         
	//  143  327:getfield        #761 <Field Rectangle pageRect>
	//  144  330:invokevirtual   #585 <Method float Rectangle.getLeft()>
	//  145  333:fsub            
	//  146  334:aload_1         
	//  147  335:invokevirtual   #594 <Method float Rectangle.getTop()>
	//  148  338:aload_0         
	//  149  339:getfield        #761 <Field Rectangle pageRect>
	//  150  342:invokevirtual   #588 <Method float Rectangle.getBottom()>
	//  151  345:fsub            
	//  152  346:aload_1         
	//  153  347:invokevirtual   #591 <Method float Rectangle.getRight()>
	//  154  350:aload_0         
	//  155  351:getfield        #761 <Field Rectangle pageRect>
	//  156  354:invokevirtual   #591 <Method float Rectangle.getRight()>
	//  157  357:fsub            
	//  158  358:aload_1         
	//  159  359:invokevirtual   #594 <Method float Rectangle.getTop()>
	//  160  362:aload_0         
	//  161  363:getfield        #761 <Field Rectangle pageRect>
	//  162  366:invokevirtual   #594 <Method float Rectangle.getTop()>
	//  163  369:fsub            
	//  164  370:invokespecial   #554 <Method void Rectangle(float, float, float, float)>
	//  165  373:putfield        #761 <Field Rectangle pageRect>
		continue; /* Loop/switch isn't completed */
	//  166  376:goto            228
_L4:
		pageRect = new Rectangle(((Rectangle) (s)).getRight() - pageRect.getBottom(), pageRect.getLeft(), ((Rectangle) (s)).getRight() - pageRect.getTop(), pageRect.getRight());
	//  167  379:aload_0         
	//  168  380:new             #267 <Class Rectangle>
	//  169  383:dup             
	//  170  384:aload_1         
	//  171  385:invokevirtual   #591 <Method float Rectangle.getRight()>
	//  172  388:aload_0         
	//  173  389:getfield        #761 <Field Rectangle pageRect>
	//  174  392:invokevirtual   #588 <Method float Rectangle.getBottom()>
	//  175  395:fsub            
	//  176  396:aload_0         
	//  177  397:getfield        #761 <Field Rectangle pageRect>
	//  178  400:invokevirtual   #585 <Method float Rectangle.getLeft()>
	//  179  403:aload_1         
	//  180  404:invokevirtual   #591 <Method float Rectangle.getRight()>
	//  181  407:aload_0         
	//  182  408:getfield        #761 <Field Rectangle pageRect>
	//  183  411:invokevirtual   #594 <Method float Rectangle.getTop()>
	//  184  414:fsub            
	//  185  415:aload_0         
	//  186  416:getfield        #761 <Field Rectangle pageRect>
	//  187  419:invokevirtual   #591 <Method float Rectangle.getRight()>
	//  188  422:invokespecial   #554 <Method void Rectangle(float, float, float, float)>
	//  189  425:putfield        #761 <Field Rectangle pageRect>
		if(true) goto _L1; else goto _L5
	//  190  428:goto            228
_L5:
	}

	public static final int CERTIFIED_FORM_FILLING = 2;
	public static final int CERTIFIED_FORM_FILLING_AND_ANNOTATIONS = 3;
	public static final int CERTIFIED_NO_CHANGES_ALLOWED = 1;
	private static final float MARGIN = 2F;
	public static final int NOT_CERTIFIED = 0;
	private static final float TOP_SECTION = 0.3F;
	public static final String questionMark = "% DSUnknown\nq\n1 G\n1 g\n0.1 0 0 0.1 9 0 cm\n0 J 0 j 4 M []0 d\n1 i \n0 g\n313 292 m\n313 404 325 453 432 529 c\n478 561 504 597 504 645 c\n504 736 440 760 391 760 c\n286 760 271 681 265 626 c\n265 625 l\n100 625 l\n100 828 253 898 381 898 c\n451 898 679 878 679 650 c\n679 555 628 499 538 435 c\n488 399 467 376 467 292 c\n313 292 l\nh\n308 214 170 -164 re\nf\n0.44 G\n1.2 w\n1 1 0.4 rg\n287 318 m\n287 430 299 479 406 555 c\n451 587 478 623 478 671 c\n478 762 414 786 365 786 c\n260 786 245 707 239 652 c\n239 651 l\n74 651 l\n74 854 227 924 355 924 c\n425 924 653 904 653 676 c\n653 581 602 525 512 461 c\n462 425 441 402 441 318 c\n287 318 l\nh\n282 240 170 -164 re\nB\nQ\n";
	private boolean acro6Layers;
	private PdfTemplate app[];
	private byte bout[];
	private int boutLen;
	private int certificationLevel;
	private String contact;
	private PdfDictionary cryptoDictionary;
	private HashMap exclusionLocations;
	private PdfSigLockDictionary fieldLock;
	private String fieldName;
	private PdfTemplate frm;
	private Image image;
	private float imageScale;
	private Font layer2Font;
	private String layer2Text;
	private String layer4Text;
	private String location;
	private String locationCaption;
	private OutputStream originalout;
	private int page;
	private Rectangle pageRect;
	private boolean preClosed;
	private RandomAccessFile raf;
	private long range[];
	private String reason;
	private String reasonCaption;
	private Rectangle rect;
	private RenderingMode renderingMode;
	private boolean reuseAppearance;
	private int runDirection;
	private Certificate signCertificate;
	private Calendar signDate;
	private String signatureCreator;
	private SignatureEvent signatureEvent;
	private Image signatureGraphic;
	private ByteBuffer sigout;
	private PdfStamper stamper;
	private File tempFile;
	private PdfStamperImp writer;
}
