// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.awt.geom.AffineTransform;
import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfName, PdfRectangle, PdfBorderArray, 
//			PdfColor, PdfWriter, PdfString, PdfFileSpecification, 
//			PdfArray, PdfNumber, PdfDestination, PdfBoolean, 
//			PdfAction, PdfIndirectObject, ExtendedColor, GrayColor, 
//			CMYKColor, PdfObject, PdfTemplate, PdfContentByte, 
//			ByteBuffer, PdfOCG, PdfIndirectReference, PdfBorderDictionary, 
//			PRIndirectReference, PdfReader

public class PdfAnnotation extends PdfDictionary
	implements IAccessibleElement
{
	public static class PdfImportedLink
	{

		private void appendDictionary(StringBuffer stringbuffer, HashMap hashmap)
		{
			stringbuffer.append(" <<");
		//    0    0:aload_1         
		//    1    1:ldc1            #102 <String " <<">
		//    2    3:invokevirtual   #108 <Method StringBuffer StringBuffer.append(String)>
		//    3    6:pop             
			hashmap = ((HashMap) (hashmap.entrySet().iterator()));
		//    4    7:aload_2         
		//    5    8:invokevirtual   #112 <Method Set HashMap.entrySet()>
		//    6   11:invokeinterface #118 <Method Iterator Set.iterator()>
		//    7   16:astore_2        
			while(((Iterator) (hashmap)).hasNext()) 
		//*   8   17:aload_2         
		//*   9   18:invokeinterface #124 <Method boolean Iterator.hasNext()>
		//*  10   23:ifeq            107
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (hashmap)).next();
		//   11   26:aload_2         
		//   12   27:invokeinterface #128 <Method Object Iterator.next()>
		//   13   32:checkcast       #130 <Class java.util.Map$Entry>
		//   14   35:astore_3        
				stringbuffer.append(entry.getKey());
		//   15   36:aload_1         
		//   16   37:aload_3         
		//   17   38:invokeinterface #133 <Method Object java.util.Map$Entry.getKey()>
		//   18   43:invokevirtual   #136 <Method StringBuffer StringBuffer.append(Object)>
		//   19   46:pop             
				stringbuffer.append(":");
		//   20   47:aload_1         
		//   21   48:ldc1            #138 <String ":">
		//   22   50:invokevirtual   #108 <Method StringBuffer StringBuffer.append(String)>
		//   23   53:pop             
				if(entry.getValue() instanceof PdfDictionary)
		//*  24   54:aload_3         
		//*  25   55:invokeinterface #141 <Method Object java.util.Map$Entry.getValue()>
		//*  26   60:instanceof      #38  <Class PdfDictionary>
		//*  27   63:ifeq            93
					appendDictionary(stringbuffer, ((HashMap) (((PdfDictionary)entry.getValue()).hashMap)));
		//   28   66:aload_0         
		//   29   67:aload_1         
		//   30   68:aload_3         
		//   31   69:invokeinterface #141 <Method Object java.util.Map$Entry.getValue()>
		//   32   74:checkcast       #38  <Class PdfDictionary>
		//   33   77:getfield        #42  <Field LinkedHashMap PdfDictionary.hashMap>
		//   34   80:invokespecial   #143 <Method void appendDictionary(StringBuffer, HashMap)>
				else
		//*  35   83:aload_1         
		//*  36   84:ldc1            #145 <String " ">
		//*  37   86:invokevirtual   #108 <Method StringBuffer StringBuffer.append(String)>
		//*  38   89:pop             
		//*  39   90:goto            17
					stringbuffer.append(entry.getValue());
		//   40   93:aload_1         
		//   41   94:aload_3         
		//   42   95:invokeinterface #141 <Method Object java.util.Map$Entry.getValue()>
		//   43  100:invokevirtual   #136 <Method StringBuffer StringBuffer.append(Object)>
		//   44  103:pop             
				stringbuffer.append(" ");
			}
		//*  45  104:goto            83
			stringbuffer.append(">> ");
		//   46  107:aload_1         
		//   47  108:ldc1            #147 <String ">> ">
		//   48  110:invokevirtual   #108 <Method StringBuffer StringBuffer.append(String)>
		//   49  113:pop             
		//   50  114:return          
		}

		public PdfAnnotation createAnnotation(PdfWriter pdfwriter)
		{
			PdfAnnotation pdfannotation = pdfwriter.createAnnotation(new Rectangle(llx, lly, urx, ury), ((PdfName) (null)));
		//    0    0:aload_1         
		//    1    1:new             #153 <Class Rectangle>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:getfield        #76  <Field float llx>
		//    5    9:aload_0         
		//    6   10:getfield        #78  <Field float lly>
		//    7   13:aload_0         
		//    8   14:getfield        #80  <Field float urx>
		//    9   17:aload_0         
		//   10   18:getfield        #82  <Field float ury>
		//   11   21:invokespecial   #156 <Method void Rectangle(float, float, float, float)>
		//   12   24:aconst_null     
		//   13   25:invokevirtual   #161 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
		//   14   28:astore_2        
			if(newPage != 0)
		//*  15   29:aload_0         
		//*  16   30:getfield        #36  <Field int newPage>
		//*  17   33:ifeq            55
			{
				pdfwriter = ((PdfWriter) (pdfwriter.getPageReference(newPage)));
		//   18   36:aload_1         
		//   19   37:aload_0         
		//   20   38:getfield        #36  <Field int newPage>
		//   21   41:invokevirtual   #165 <Method PdfIndirectReference PdfWriter.getPageReference(int)>
		//   22   44:astore_1        
				destination.set(0, ((PdfObject) (pdfwriter)));
		//   23   45:aload_0         
		//   24   46:getfield        #34  <Field PdfArray destination>
		//   25   49:iconst_0        
		//   26   50:aload_1         
		//   27   51:invokevirtual   #169 <Method PdfObject PdfArray.set(int, PdfObject)>
		//   28   54:pop             
			}
			if(destination != null)
		//*  29   55:aload_0         
		//*  30   56:getfield        #34  <Field PdfArray destination>
		//*  31   59:ifnull          73
				pdfannotation.put(PdfName.DEST, ((PdfObject) (destination)));
		//   32   62:aload_2         
		//   33   63:getstatic       #52  <Field PdfName PdfName.DEST>
		//   34   66:aload_0         
		//   35   67:getfield        #34  <Field PdfArray destination>
		//   36   70:invokevirtual   #173 <Method void PdfAnnotation.put(PdfName, PdfObject)>
			pdfannotation.hashMap.putAll(((Map) (parameters)));
		//   37   73:aload_2         
		//   38   74:getfield        #174 <Field LinkedHashMap PdfAnnotation.hashMap>
		//   39   77:aload_0         
		//   40   78:getfield        #32  <Field HashMap parameters>
		//   41   81:invokevirtual   #177 <Method void LinkedHashMap.putAll(Map)>
			return pdfannotation;
		//   42   84:aload_2         
		//   43   85:areturn         
		}

		public int getDestinationPage()
		{
			if(isInternal()) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:invokevirtual   #182 <Method boolean isInternal()>
		//    2    4:ifne            11
_L1:
			int j = 0;
		//    3    7:iconst_0        
		//    4    8:istore_2        
_L6:
			return j;
		//    5    9:iload_2         
		//    6   10:ireturn         
_L2:
			int i;
			PRIndirectReference prindirectreference;
			PdfReader pdfreader;
			prindirectreference = (PRIndirectReference)destination.getAsIndirectObject(0);
		//    7   11:aload_0         
		//    8   12:getfield        #34  <Field PdfArray destination>
		//    9   15:iconst_0        
		//   10   16:invokevirtual   #185 <Method PdfIndirectReference PdfArray.getAsIndirectObject(int)>
		//   11   19:checkcast       #187 <Class PRIndirectReference>
		//   12   22:astore_3        
			pdfreader = prindirectreference.getReader();
		//   13   23:aload_3         
		//   14   24:invokevirtual   #191 <Method PdfReader PRIndirectReference.getReader()>
		//   15   27:astore          4
			i = 1;
		//   16   29:iconst_1        
		//   17   30:istore_1        
_L7:
			if(i > pdfreader.getNumberOfPages()) goto _L4; else goto _L3
		//   18   31:iload_1         
		//   19   32:aload           4
		//   20   34:invokevirtual   #196 <Method int PdfReader.getNumberOfPages()>
		//   21   37:icmpgt          81
_L3:
			PRIndirectReference prindirectreference1;
			prindirectreference1 = pdfreader.getPageOrigRef(i);
		//   22   40:aload           4
		//   23   42:iload_1         
		//   24   43:invokevirtual   #200 <Method PRIndirectReference PdfReader.getPageOrigRef(int)>
		//   25   46:astore          5
			if(prindirectreference1.getGeneration() != prindirectreference.getGeneration())
				continue; /* Loop/switch isn't completed */
		//   26   48:aload           5
		//   27   50:invokevirtual   #203 <Method int PRIndirectReference.getGeneration()>
		//   28   53:aload_3         
		//   29   54:invokevirtual   #203 <Method int PRIndirectReference.getGeneration()>
		//   30   57:icmpne          74
			j = i;
		//   31   60:iload_1         
		//   32   61:istore_2        
			if(prindirectreference1.getNumber() == prindirectreference.getNumber()) goto _L6; else goto _L5
		//   33   62:aload           5
		//   34   64:invokevirtual   #206 <Method int PRIndirectReference.getNumber()>
		//   35   67:aload_3         
		//   36   68:invokevirtual   #206 <Method int PRIndirectReference.getNumber()>
		//   37   71:icmpeq          9
_L5:
			i++;
		//   38   74:iload_1         
		//   39   75:iconst_1        
		//   40   76:iadd            
		//   41   77:istore_1        
			  goto _L7
		//*  42   78:goto            31
_L4:
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("page.not.found", new Object[0]));
		//   43   81:new             #86  <Class IllegalArgumentException>
		//   44   84:dup             
		//   45   85:ldc1            #208 <String "page.not.found">
		//   46   87:iconst_0        
		//   47   88:anewarray       Object[]
		//   48   91:invokestatic    #94  <Method String MessageLocalization.getComposedMessage(String, Object[])>
		//   49   94:invokespecial   #97  <Method void IllegalArgumentException(String)>
		//   50   97:athrow          
		}

		public Map getParameters()
		{
			return ((Map) (new HashMap(((Map) (parameters)))));
		//    0    0:new             #29  <Class HashMap>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field HashMap parameters>
		//    4    8:invokespecial   #212 <Method void HashMap(Map)>
		//    5   11:areturn         
		}

		public PdfArray getRect()
		{
			return new PdfArray(rect);
		//    0    0:new             #58  <Class PdfArray>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #84  <Field PdfArray rect>
		//    4    8:invokespecial   #61  <Method void PdfArray(PdfArray)>
		//    5   11:areturn         
		}

		public boolean isInternal()
		{
			return destination != null;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field PdfArray destination>
		//    2    4:ifnull          9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public void setDestinationPage(int i)
		{
			if(!isInternal())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #182 <Method boolean isInternal()>
		//*   2    4:ifne            24
			{
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("cannot.change.destination.of.external.link", new Object[0]));
		//    3    7:new             #86  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #219 <String "cannot.change.destination.of.external.link">
		//    6   13:iconst_0        
		//    7   14:anewarray       Object[]
		//    8   17:invokestatic    #94  <Method String MessageLocalization.getComposedMessage(String, Object[])>
		//    9   20:invokespecial   #97  <Method void IllegalArgumentException(String)>
		//   10   23:athrow          
			} else
			{
				newPage = i;
		//   11   24:aload_0         
		//   12   25:iload_1         
		//   13   26:putfield        #36  <Field int newPage>
				return;
		//   14   29:return          
			}
		}

		public String toString()
		{
			StringBuffer stringbuffer = new StringBuffer("Imported link: location [");
		//    0    0:new             #104 <Class StringBuffer>
		//    1    3:dup             
		//    2    4:ldc1            #223 <String "Imported link: location [">
		//    3    6:invokespecial   #224 <Method void StringBuffer(String)>
		//    4    9:astore_1        
			stringbuffer.append(llx);
		//    5   10:aload_1         
		//    6   11:aload_0         
		//    7   12:getfield        #76  <Field float llx>
		//    8   15:invokevirtual   #227 <Method StringBuffer StringBuffer.append(float)>
		//    9   18:pop             
			stringbuffer.append(' ');
		//   10   19:aload_1         
		//   11   20:bipush          32
		//   12   22:invokevirtual   #230 <Method StringBuffer StringBuffer.append(char)>
		//   13   25:pop             
			stringbuffer.append(lly);
		//   14   26:aload_1         
		//   15   27:aload_0         
		//   16   28:getfield        #78  <Field float lly>
		//   17   31:invokevirtual   #227 <Method StringBuffer StringBuffer.append(float)>
		//   18   34:pop             
			stringbuffer.append(' ');
		//   19   35:aload_1         
		//   20   36:bipush          32
		//   21   38:invokevirtual   #230 <Method StringBuffer StringBuffer.append(char)>
		//   22   41:pop             
			stringbuffer.append(urx);
		//   23   42:aload_1         
		//   24   43:aload_0         
		//   25   44:getfield        #80  <Field float urx>
		//   26   47:invokevirtual   #227 <Method StringBuffer StringBuffer.append(float)>
		//   27   50:pop             
			stringbuffer.append(' ');
		//   28   51:aload_1         
		//   29   52:bipush          32
		//   30   54:invokevirtual   #230 <Method StringBuffer StringBuffer.append(char)>
		//   31   57:pop             
			stringbuffer.append(ury);
		//   32   58:aload_1         
		//   33   59:aload_0         
		//   34   60:getfield        #82  <Field float ury>
		//   35   63:invokevirtual   #227 <Method StringBuffer StringBuffer.append(float)>
		//   36   66:pop             
			stringbuffer.append("] destination ");
		//   37   67:aload_1         
		//   38   68:ldc1            #232 <String "] destination ">
		//   39   70:invokevirtual   #108 <Method StringBuffer StringBuffer.append(String)>
		//   40   73:pop             
			stringbuffer.append(((Object) (destination)));
		//   41   74:aload_1         
		//   42   75:aload_0         
		//   43   76:getfield        #34  <Field PdfArray destination>
		//   44   79:invokevirtual   #136 <Method StringBuffer StringBuffer.append(Object)>
		//   45   82:pop             
			stringbuffer.append(" parameters ");
		//   46   83:aload_1         
		//   47   84:ldc1            #234 <String " parameters ">
		//   48   86:invokevirtual   #108 <Method StringBuffer StringBuffer.append(String)>
		//   49   89:pop             
			stringbuffer.append(((Object) (parameters)));
		//   50   90:aload_1         
		//   51   91:aload_0         
		//   52   92:getfield        #32  <Field HashMap parameters>
		//   53   95:invokevirtual   #136 <Method StringBuffer StringBuffer.append(Object)>
		//   54   98:pop             
			if(parameters != null)
		//*  55   99:aload_0         
		//*  56  100:getfield        #32  <Field HashMap parameters>
		//*  57  103:ifnull          115
				appendDictionary(stringbuffer, parameters);
		//   58  106:aload_0         
		//   59  107:aload_1         
		//   60  108:aload_0         
		//   61  109:getfield        #32  <Field HashMap parameters>
		//   62  112:invokespecial   #143 <Method void appendDictionary(StringBuffer, HashMap)>
			return stringbuffer.toString();
		//   63  115:aload_1         
		//   64  116:invokevirtual   #236 <Method String StringBuffer.toString()>
		//   65  119:areturn         
		}

		public void transformDestination(float f, float f1, float f2, float f3, float f4, float f5)
		{
			if(!isInternal())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #182 <Method boolean isInternal()>
		//*   2    4:ifne            24
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("cannot.change.destination.of.external.link", new Object[0]));
		//    3    7:new             #86  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #219 <String "cannot.change.destination.of.external.link">
		//    6   13:iconst_0        
		//    7   14:anewarray       Object[]
		//    8   17:invokestatic    #94  <Method String MessageLocalization.getComposedMessage(String, Object[])>
		//    9   20:invokespecial   #97  <Method void IllegalArgumentException(String)>
		//   10   23:athrow          
			if(destination.getAsName(1).equals(((Object) (PdfName.XYZ))))
		//*  11   24:aload_0         
		//*  12   25:getfield        #34  <Field PdfArray destination>
		//*  13   28:iconst_1        
		//*  14   29:invokevirtual   #242 <Method PdfName PdfArray.getAsName(int)>
		//*  15   32:getstatic       #245 <Field PdfName PdfName.XYZ>
		//*  16   35:invokevirtual   #249 <Method boolean PdfName.equals(Object)>
		//*  17   38:ifeq            124
			{
				float f6 = destination.getAsNumber(2).floatValue();
		//   18   41:aload_0         
		//   19   42:getfield        #34  <Field PdfArray destination>
		//   20   45:iconst_2        
		//   21   46:invokevirtual   #68  <Method PdfNumber PdfArray.getAsNumber(int)>
		//   22   49:invokevirtual   #74  <Method float PdfNumber.floatValue()>
		//   23   52:fstore          7
				float f7 = destination.getAsNumber(3).floatValue();
		//   24   54:aload_0         
		//   25   55:getfield        #34  <Field PdfArray destination>
		//   26   58:iconst_3        
		//   27   59:invokevirtual   #68  <Method PdfNumber PdfArray.getAsNumber(int)>
		//   28   62:invokevirtual   #74  <Method float PdfNumber.floatValue()>
		//   29   65:fstore          8
				destination.set(2, ((PdfObject) (new PdfNumber(f6 * f + f7 * f2 + f4))));
		//   30   67:aload_0         
		//   31   68:getfield        #34  <Field PdfArray destination>
		//   32   71:iconst_2        
		//   33   72:new             #70  <Class PdfNumber>
		//   34   75:dup             
		//   35   76:fload           7
		//   36   78:fload_1         
		//   37   79:fmul            
		//   38   80:fload           8
		//   39   82:fload_3         
		//   40   83:fmul            
		//   41   84:fadd            
		//   42   85:fload           5
		//   43   87:fadd            
		//   44   88:invokespecial   #252 <Method void PdfNumber(float)>
		//   45   91:invokevirtual   #169 <Method PdfObject PdfArray.set(int, PdfObject)>
		//   46   94:pop             
				destination.set(3, ((PdfObject) (new PdfNumber(f6 * f1 + f7 * f3 + f5))));
		//   47   95:aload_0         
		//   48   96:getfield        #34  <Field PdfArray destination>
		//   49   99:iconst_3        
		//   50  100:new             #70  <Class PdfNumber>
		//   51  103:dup             
		//   52  104:fload           7
		//   53  106:fload_2         
		//   54  107:fmul            
		//   55  108:fload           8
		//   56  110:fload           4
		//   57  112:fmul            
		//   58  113:fadd            
		//   59  114:fload           6
		//   60  116:fadd            
		//   61  117:invokespecial   #252 <Method void PdfNumber(float)>
		//   62  120:invokevirtual   #169 <Method PdfObject PdfArray.set(int, PdfObject)>
		//   63  123:pop             
			}
		//   64  124:return          
		}

		public void transformRect(float f, float f1, float f2, float f3, float f4, float f5)
		{
			float f6 = llx;
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field float llx>
		//    2    4:fstore          7
			float f7 = lly;
		//    3    6:aload_0         
		//    4    7:getfield        #78  <Field float lly>
		//    5   10:fstore          8
			float f8 = llx;
		//    6   12:aload_0         
		//    7   13:getfield        #76  <Field float llx>
		//    8   16:fstore          9
			float f9 = lly;
		//    9   18:aload_0         
		//   10   19:getfield        #78  <Field float lly>
		//   11   22:fstore          10
			llx = f6 * f + f7 * f2 + f4;
		//   12   24:aload_0         
		//   13   25:fload           7
		//   14   27:fload_1         
		//   15   28:fmul            
		//   16   29:fload           8
		//   17   31:fload_3         
		//   18   32:fmul            
		//   19   33:fadd            
		//   20   34:fload           5
		//   21   36:fadd            
		//   22   37:putfield        #76  <Field float llx>
			lly = f8 * f1 + f9 * f3 + f5;
		//   23   40:aload_0         
		//   24   41:fload           9
		//   25   43:fload_2         
		//   26   44:fmul            
		//   27   45:fload           10
		//   28   47:fload           4
		//   29   49:fmul            
		//   30   50:fadd            
		//   31   51:fload           6
		//   32   53:fadd            
		//   33   54:putfield        #78  <Field float lly>
			f6 = urx;
		//   34   57:aload_0         
		//   35   58:getfield        #80  <Field float urx>
		//   36   61:fstore          7
			f7 = ury;
		//   37   63:aload_0         
		//   38   64:getfield        #82  <Field float ury>
		//   39   67:fstore          8
			f8 = urx;
		//   40   69:aload_0         
		//   41   70:getfield        #80  <Field float urx>
		//   42   73:fstore          9
			f9 = ury;
		//   43   75:aload_0         
		//   44   76:getfield        #82  <Field float ury>
		//   45   79:fstore          10
			urx = f6 * f + f7 * f2 + f4;
		//   46   81:aload_0         
		//   47   82:fload           7
		//   48   84:fload_1         
		//   49   85:fmul            
		//   50   86:fload           8
		//   51   88:fload_3         
		//   52   89:fmul            
		//   53   90:fadd            
		//   54   91:fload           5
		//   55   93:fadd            
		//   56   94:putfield        #80  <Field float urx>
			ury = f8 * f1 + f9 * f3 + f5;
		//   57   97:aload_0         
		//   58   98:fload           9
		//   59  100:fload_2         
		//   60  101:fmul            
		//   61  102:fload           10
		//   62  104:fload           4
		//   63  106:fmul            
		//   64  107:fadd            
		//   65  108:fload           6
		//   66  110:fadd            
		//   67  111:putfield        #82  <Field float ury>
		//   68  114:return          
		}

		PdfArray destination;
		float llx;
		float lly;
		int newPage;
		HashMap parameters;
		PdfArray rect;
		float urx;
		float ury;

		PdfImportedLink(PdfDictionary pdfdictionary)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
			parameters = new HashMap();
		//    2    4:aload_0         
		//    3    5:new             #29  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #30  <Method void HashMap()>
		//    6   12:putfield        #32  <Field HashMap parameters>
			destination = null;
		//    7   15:aload_0         
		//    8   16:aconst_null     
		//    9   17:putfield        #34  <Field PdfArray destination>
			newPage = 0;
		//   10   20:aload_0         
		//   11   21:iconst_0        
		//   12   22:putfield        #36  <Field int newPage>
			parameters.putAll(((Map) (pdfdictionary.hashMap)));
		//   13   25:aload_0         
		//   14   26:getfield        #32  <Field HashMap parameters>
		//   15   29:aload_1         
		//   16   30:getfield        #42  <Field LinkedHashMap PdfDictionary.hashMap>
		//   17   33:invokevirtual   #46  <Method void HashMap.putAll(Map)>
			try
			{
				destination = (PdfArray)parameters.remove(((Object) (PdfName.DEST)));
		//   18   36:aload_0         
		//   19   37:aload_0         
		//   20   38:getfield        #32  <Field HashMap parameters>
		//   21   41:getstatic       #52  <Field PdfName PdfName.DEST>
		//   22   44:invokevirtual   #56  <Method Object HashMap.remove(Object)>
		//   23   47:checkcast       #58  <Class PdfArray>
		//   24   50:putfield        #34  <Field PdfArray destination>
			}
		//*  25   53:aload_0         
		//*  26   54:getfield        #34  <Field PdfArray destination>
		//*  27   57:ifnull          75
		//*  28   60:aload_0         
		//*  29   61:new             #58  <Class PdfArray>
		//*  30   64:dup             
		//*  31   65:aload_0         
		//*  32   66:getfield        #34  <Field PdfArray destination>
		//*  33   69:invokespecial   #61  <Method void PdfArray(PdfArray)>
		//*  34   72:putfield        #34  <Field PdfArray destination>
		//*  35   75:aload_0         
		//*  36   76:getfield        #32  <Field HashMap parameters>
		//*  37   79:getstatic       #64  <Field PdfName PdfName.RECT>
		//*  38   82:invokevirtual   #56  <Method Object HashMap.remove(Object)>
		//*  39   85:checkcast       #58  <Class PdfArray>
		//*  40   88:astore_1        
		//*  41   89:aload_0         
		//*  42   90:aload_1         
		//*  43   91:iconst_0        
		//*  44   92:invokevirtual   #68  <Method PdfNumber PdfArray.getAsNumber(int)>
		//*  45   95:invokevirtual   #74  <Method float PdfNumber.floatValue()>
		//*  46   98:putfield        #76  <Field float llx>
		//*  47  101:aload_0         
		//*  48  102:aload_1         
		//*  49  103:iconst_1        
		//*  50  104:invokevirtual   #68  <Method PdfNumber PdfArray.getAsNumber(int)>
		//*  51  107:invokevirtual   #74  <Method float PdfNumber.floatValue()>
		//*  52  110:putfield        #78  <Field float lly>
		//*  53  113:aload_0         
		//*  54  114:aload_1         
		//*  55  115:iconst_2        
		//*  56  116:invokevirtual   #68  <Method PdfNumber PdfArray.getAsNumber(int)>
		//*  57  119:invokevirtual   #74  <Method float PdfNumber.floatValue()>
		//*  58  122:putfield        #80  <Field float urx>
		//*  59  125:aload_0         
		//*  60  126:aload_1         
		//*  61  127:iconst_3        
		//*  62  128:invokevirtual   #68  <Method PdfNumber PdfArray.getAsNumber(int)>
		//*  63  131:invokevirtual   #74  <Method float PdfNumber.floatValue()>
		//*  64  134:putfield        #82  <Field float ury>
		//*  65  137:aload_0         
		//*  66  138:new             #58  <Class PdfArray>
		//*  67  141:dup             
		//*  68  142:aload_1         
		//*  69  143:invokespecial   #61  <Method void PdfArray(PdfArray)>
		//*  70  146:putfield        #84  <Field PdfArray rect>
		//*  71  149:return          
			// Misplaced declaration of an exception variable
			catch(PdfDictionary pdfdictionary)
		//*  72  150:astore_1        
			{
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("you.have.to.consolidate.the.named.destinations.of.your.reader", new Object[0]));
		//   73  151:new             #86  <Class IllegalArgumentException>
		//   74  154:dup             
		//   75  155:ldc1            #88  <String "you.have.to.consolidate.the.named.destinations.of.your.reader">
		//   76  157:iconst_0        
		//   77  158:anewarray       Object[]
		//   78  161:invokestatic    #94  <Method String MessageLocalization.getComposedMessage(String, Object[])>
		//   79  164:invokespecial   #97  <Method void IllegalArgumentException(String)>
		//   80  167:athrow          
			}
			if(destination != null)
				destination = new PdfArray(destination);
			pdfdictionary = ((PdfDictionary) ((PdfArray)parameters.remove(((Object) (PdfName.RECT)))));
			llx = ((PdfArray) (pdfdictionary)).getAsNumber(0).floatValue();
			lly = ((PdfArray) (pdfdictionary)).getAsNumber(1).floatValue();
			urx = ((PdfArray) (pdfdictionary)).getAsNumber(2).floatValue();
			ury = ((PdfArray) (pdfdictionary)).getAsNumber(3).floatValue();
			rect = new PdfArray(((PdfArray) (pdfdictionary)));
		}
	}


	public PdfAnnotation(PdfWriter pdfwriter, float f, float f1, float f2, float f3, PdfAction pdfaction)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #165 <Method void PdfDictionary()>
		form = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #167 <Field boolean form>
		annotation = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #169 <Field boolean annotation>
		used = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #171 <Field boolean used>
		placeInPage = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #173 <Field int placeInPage>
		role = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #175 <Field PdfName role>
		accessibleAttributes = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #177 <Field HashMap accessibleAttributes>
		id = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #179 <Field AccessibleElementId id>
		writer = pdfwriter;
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:putfield        #181 <Field PdfWriter writer>
		put(PdfName.SUBTYPE, ((PdfObject) (PdfName.LINK)));
	//   26   44:aload_0         
	//   27   45:getstatic       #184 <Field PdfName PdfName.SUBTYPE>
	//   28   48:getstatic       #187 <Field PdfName PdfName.LINK>
	//   29   51:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		put(PdfName.RECT, ((PdfObject) (new PdfRectangle(f, f1, f2, f3))));
	//   30   54:aload_0         
	//   31   55:getstatic       #194 <Field PdfName PdfName.RECT>
	//   32   58:new             #196 <Class PdfRectangle>
	//   33   61:dup             
	//   34   62:fload_2         
	//   35   63:fload_3         
	//   36   64:fload           4
	//   37   66:fload           5
	//   38   68:invokespecial   #199 <Method void PdfRectangle(float, float, float, float)>
	//   39   71:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		put(PdfName.A, ((PdfObject) (pdfaction)));
	//   40   74:aload_0         
	//   41   75:getstatic       #202 <Field PdfName PdfName.A>
	//   42   78:aload           6
	//   43   80:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		put(PdfName.BORDER, ((PdfObject) (new PdfBorderArray(0.0F, 0.0F, 0.0F))));
	//   44   83:aload_0         
	//   45   84:getstatic       #205 <Field PdfName PdfName.BORDER>
	//   46   87:new             #207 <Class PdfBorderArray>
	//   47   90:dup             
	//   48   91:fconst_0        
	//   49   92:fconst_0        
	//   50   93:fconst_0        
	//   51   94:invokespecial   #210 <Method void PdfBorderArray(float, float, float)>
	//   52   97:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		put(PdfName.C, ((PdfObject) (new PdfColor(0, 0, 255))));
	//   53  100:aload_0         
	//   54  101:getstatic       #158 <Field PdfName PdfName.C>
	//   55  104:new             #212 <Class PdfColor>
	//   56  107:dup             
	//   57  108:iconst_0        
	//   58  109:iconst_0        
	//   59  110:sipush          255
	//   60  113:invokespecial   #215 <Method void PdfColor(int, int, int)>
	//   61  116:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//   62  119:return          
	}

	public PdfAnnotation(PdfWriter pdfwriter, float f, float f1, float f2, float f3, PdfString pdfstring, PdfString pdfstring1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #165 <Method void PdfDictionary()>
		form = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #167 <Field boolean form>
		annotation = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #169 <Field boolean annotation>
		used = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #171 <Field boolean used>
		placeInPage = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #173 <Field int placeInPage>
		role = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #175 <Field PdfName role>
		accessibleAttributes = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #177 <Field HashMap accessibleAttributes>
		id = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #179 <Field AccessibleElementId id>
		writer = pdfwriter;
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:putfield        #181 <Field PdfWriter writer>
		put(PdfName.SUBTYPE, ((PdfObject) (PdfName.TEXT)));
	//   26   44:aload_0         
	//   27   45:getstatic       #184 <Field PdfName PdfName.SUBTYPE>
	//   28   48:getstatic       #219 <Field PdfName PdfName.TEXT>
	//   29   51:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		put(PdfName.T, ((PdfObject) (pdfstring)));
	//   30   54:aload_0         
	//   31   55:getstatic       #99  <Field PdfName PdfName.T>
	//   32   58:aload           6
	//   33   60:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		put(PdfName.RECT, ((PdfObject) (new PdfRectangle(f, f1, f2, f3))));
	//   34   63:aload_0         
	//   35   64:getstatic       #194 <Field PdfName PdfName.RECT>
	//   36   67:new             #196 <Class PdfRectangle>
	//   37   70:dup             
	//   38   71:fload_2         
	//   39   72:fload_3         
	//   40   73:fload           4
	//   41   75:fload           5
	//   42   77:invokespecial   #199 <Method void PdfRectangle(float, float, float, float)>
	//   43   80:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		put(PdfName.CONTENTS, ((PdfObject) (pdfstring1)));
	//   44   83:aload_0         
	//   45   84:getstatic       #222 <Field PdfName PdfName.CONTENTS>
	//   46   87:aload           7
	//   47   89:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//   48   92:return          
	}

	public PdfAnnotation(PdfWriter pdfwriter, Rectangle rectangle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #165 <Method void PdfDictionary()>
		form = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #167 <Field boolean form>
		annotation = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #169 <Field boolean annotation>
		used = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #171 <Field boolean used>
		placeInPage = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #173 <Field int placeInPage>
		role = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #175 <Field PdfName role>
		accessibleAttributes = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #177 <Field HashMap accessibleAttributes>
		id = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #179 <Field AccessibleElementId id>
		writer = pdfwriter;
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:putfield        #181 <Field PdfWriter writer>
		if(rectangle != null)
	//*  26   44:aload_2         
	//*  27   45:ifnull          63
			put(PdfName.RECT, ((PdfObject) (new PdfRectangle(rectangle))));
	//   28   48:aload_0         
	//   29   49:getstatic       #194 <Field PdfName PdfName.RECT>
	//   30   52:new             #196 <Class PdfRectangle>
	//   31   55:dup             
	//   32   56:aload_2         
	//   33   57:invokespecial   #226 <Method void PdfRectangle(Rectangle)>
	//   34   60:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//   35   63:return          
	}

	public static PdfAnnotation createFileAttachment(PdfWriter pdfwriter, Rectangle rectangle, String s, PdfFileSpecification pdffilespecification)
		throws IOException
	{
		pdfwriter = ((PdfWriter) (pdfwriter.createAnnotation(rectangle, PdfName.FILEATTACHMENT)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #233 <Field PdfName PdfName.FILEATTACHMENT>
	//    3    5:invokevirtual   #239 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
	//    4    8:astore_0        
		if(s != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          30
			((PdfAnnotation) (pdfwriter)).put(PdfName.CONTENTS, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    7   13:aload_0         
	//    8   14:getstatic       #222 <Field PdfName PdfName.CONTENTS>
	//    9   17:new             #241 <Class PdfString>
	//   10   20:dup             
	//   11   21:aload_2         
	//   12   22:ldc1            #243 <String "UnicodeBig">
	//   13   24:invokespecial   #246 <Method void PdfString(String, String)>
	//   14   27:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		((PdfAnnotation) (pdfwriter)).put(PdfName.FS, ((PdfObject) (pdffilespecification.getReference())));
	//   15   30:aload_0         
	//   16   31:getstatic       #249 <Field PdfName PdfName.FS>
	//   17   34:aload_3         
	//   18   35:invokevirtual   #255 <Method PdfIndirectReference PdfFileSpecification.getReference()>
	//   19   38:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		return ((PdfAnnotation) (pdfwriter));
	//   20   41:aload_0         
	//   21   42:areturn         
	}

	public static PdfAnnotation createFileAttachment(PdfWriter pdfwriter, Rectangle rectangle, String s, byte abyte0[], String s1, String s2)
		throws IOException
	{
		return createFileAttachment(pdfwriter, rectangle, s, PdfFileSpecification.fileEmbedded(pdfwriter, s1, s2, abyte0));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload_3         
	//    7    9:invokestatic    #261 <Method PdfFileSpecification PdfFileSpecification.fileEmbedded(PdfWriter, String, String, byte[])>
	//    8   12:invokestatic    #263 <Method PdfAnnotation createFileAttachment(PdfWriter, Rectangle, String, PdfFileSpecification)>
	//    9   15:areturn         
	}

	public static PdfAnnotation createFreeText(PdfWriter pdfwriter, Rectangle rectangle, String s, PdfContentByte pdfcontentbyte)
	{
		pdfwriter = ((PdfWriter) (pdfwriter.createAnnotation(rectangle, PdfName.FREETEXT)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #268 <Field PdfName PdfName.FREETEXT>
	//    3    5:invokevirtual   #239 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
	//    4    8:astore_0        
		((PdfAnnotation) (pdfwriter)).put(PdfName.CONTENTS, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    5    9:aload_0         
	//    6   10:getstatic       #222 <Field PdfName PdfName.CONTENTS>
	//    7   13:new             #241 <Class PdfString>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:ldc1            #243 <String "UnicodeBig">
	//   11   20:invokespecial   #246 <Method void PdfString(String, String)>
	//   12   23:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		((PdfAnnotation) (pdfwriter)).setDefaultAppearanceString(pdfcontentbyte);
	//   13   26:aload_0         
	//   14   27:aload_3         
	//   15   28:invokevirtual   #272 <Method void setDefaultAppearanceString(PdfContentByte)>
		return ((PdfAnnotation) (pdfwriter));
	//   16   31:aload_0         
	//   17   32:areturn         
	}

	public static PdfAnnotation createInk(PdfWriter pdfwriter, Rectangle rectangle, String s, float af[][])
	{
		pdfwriter = ((PdfWriter) (pdfwriter.createAnnotation(rectangle, PdfName.INK)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #277 <Field PdfName PdfName.INK>
	//    3    5:invokevirtual   #239 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
	//    4    8:astore_0        
		((PdfAnnotation) (pdfwriter)).put(PdfName.CONTENTS, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    5    9:aload_0         
	//    6   10:getstatic       #222 <Field PdfName PdfName.CONTENTS>
	//    7   13:new             #241 <Class PdfString>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:ldc1            #243 <String "UnicodeBig">
	//   11   20:invokespecial   #246 <Method void PdfString(String, String)>
	//   12   23:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		rectangle = ((Rectangle) (new PdfArray()));
	//   13   26:new             #279 <Class PdfArray>
	//   14   29:dup             
	//   15   30:invokespecial   #280 <Method void PdfArray()>
	//   16   33:astore_1        
		for(int i = 0; i < af.length; i++)
	//*  17   34:iconst_0        
	//*  18   35:istore          4
	//*  19   37:iload           4
	//*  20   39:aload_3         
	//*  21   40:arraylength     
	//*  22   41:icmpge          110
		{
			s = ((String) (new PdfArray()));
	//   23   44:new             #279 <Class PdfArray>
	//   24   47:dup             
	//   25   48:invokespecial   #280 <Method void PdfArray()>
	//   26   51:astore_2        
			float af1[] = af[i];
	//   27   52:aload_3         
	//   28   53:iload           4
	//   29   55:aaload          
	//   30   56:astore          6
			for(int j = 0; j < af1.length; j++)
	//*  31   58:iconst_0        
	//*  32   59:istore          5
	//*  33   61:iload           5
	//*  34   63:aload           6
	//*  35   65:arraylength     
	//*  36   66:icmpge          95
				((PdfArray) (s)).add(((PdfObject) (new PdfNumber(af1[j]))));
	//   37   69:aload_2         
	//   38   70:new             #282 <Class PdfNumber>
	//   39   73:dup             
	//   40   74:aload           6
	//   41   76:iload           5
	//   42   78:faload          
	//   43   79:invokespecial   #285 <Method void PdfNumber(float)>
	//   44   82:invokevirtual   #289 <Method boolean PdfArray.add(PdfObject)>
	//   45   85:pop             

	//   46   86:iload           5
	//   47   88:iconst_1        
	//   48   89:iadd            
	//   49   90:istore          5
	//*  50   92:goto            61
			((PdfArray) (rectangle)).add(((PdfObject) (s)));
	//   51   95:aload_1         
	//   52   96:aload_2         
	//   53   97:invokevirtual   #289 <Method boolean PdfArray.add(PdfObject)>
	//   54  100:pop             
		}

	//   55  101:iload           4
	//   56  103:iconst_1        
	//   57  104:iadd            
	//   58  105:istore          4
	//*  59  107:goto            37
		((PdfAnnotation) (pdfwriter)).put(PdfName.INKLIST, ((PdfObject) (rectangle)));
	//   60  110:aload_0         
	//   61  111:getstatic       #292 <Field PdfName PdfName.INKLIST>
	//   62  114:aload_1         
	//   63  115:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		return ((PdfAnnotation) (pdfwriter));
	//   64  118:aload_0         
	//   65  119:areturn         
	}

	public static PdfAnnotation createLine(PdfWriter pdfwriter, Rectangle rectangle, String s, float f, float f1, float f2, float f3)
	{
		pdfwriter = ((PdfWriter) (pdfwriter.createAnnotation(rectangle, PdfName.LINE)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #297 <Field PdfName PdfName.LINE>
	//    3    5:invokevirtual   #239 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
	//    4    8:astore_0        
		((PdfAnnotation) (pdfwriter)).put(PdfName.CONTENTS, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    5    9:aload_0         
	//    6   10:getstatic       #222 <Field PdfName PdfName.CONTENTS>
	//    7   13:new             #241 <Class PdfString>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:ldc1            #243 <String "UnicodeBig">
	//   11   20:invokespecial   #246 <Method void PdfString(String, String)>
	//   12   23:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		rectangle = ((Rectangle) (new PdfArray(((PdfObject) (new PdfNumber(f))))));
	//   13   26:new             #279 <Class PdfArray>
	//   14   29:dup             
	//   15   30:new             #282 <Class PdfNumber>
	//   16   33:dup             
	//   17   34:fload_3         
	//   18   35:invokespecial   #285 <Method void PdfNumber(float)>
	//   19   38:invokespecial   #300 <Method void PdfArray(PdfObject)>
	//   20   41:astore_1        
		((PdfArray) (rectangle)).add(((PdfObject) (new PdfNumber(f1))));
	//   21   42:aload_1         
	//   22   43:new             #282 <Class PdfNumber>
	//   23   46:dup             
	//   24   47:fload           4
	//   25   49:invokespecial   #285 <Method void PdfNumber(float)>
	//   26   52:invokevirtual   #289 <Method boolean PdfArray.add(PdfObject)>
	//   27   55:pop             
		((PdfArray) (rectangle)).add(((PdfObject) (new PdfNumber(f2))));
	//   28   56:aload_1         
	//   29   57:new             #282 <Class PdfNumber>
	//   30   60:dup             
	//   31   61:fload           5
	//   32   63:invokespecial   #285 <Method void PdfNumber(float)>
	//   33   66:invokevirtual   #289 <Method boolean PdfArray.add(PdfObject)>
	//   34   69:pop             
		((PdfArray) (rectangle)).add(((PdfObject) (new PdfNumber(f3))));
	//   35   70:aload_1         
	//   36   71:new             #282 <Class PdfNumber>
	//   37   74:dup             
	//   38   75:fload           6
	//   39   77:invokespecial   #285 <Method void PdfNumber(float)>
	//   40   80:invokevirtual   #289 <Method boolean PdfArray.add(PdfObject)>
	//   41   83:pop             
		((PdfAnnotation) (pdfwriter)).put(PdfName.L, ((PdfObject) (rectangle)));
	//   42   84:aload_0         
	//   43   85:getstatic       #303 <Field PdfName PdfName.L>
	//   44   88:aload_1         
	//   45   89:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		return ((PdfAnnotation) (pdfwriter));
	//   46   92:aload_0         
	//   47   93:areturn         
	}

	protected static PdfAnnotation createLink(PdfWriter pdfwriter, Rectangle rectangle, PdfName pdfname)
	{
		pdfwriter = ((PdfWriter) (pdfwriter.createAnnotation(rectangle, PdfName.LINK)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #187 <Field PdfName PdfName.LINK>
	//    3    5:invokevirtual   #239 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
	//    4    8:astore_0        
		if(!pdfname.equals(((Object) (HIGHLIGHT_INVERT))))
	//*   5    9:aload_2         
	//*   6   10:getstatic       #86  <Field PdfName HIGHLIGHT_INVERT>
	//*   7   13:invokevirtual   #309 <Method boolean PdfName.equals(Object)>
	//*   8   16:ifne            27
			((PdfAnnotation) (pdfwriter)).put(PdfName.H, ((PdfObject) (pdfname)));
	//    9   19:aload_0         
	//   10   20:getstatic       #312 <Field PdfName PdfName.H>
	//   11   23:aload_2         
	//   12   24:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		return ((PdfAnnotation) (pdfwriter));
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public static PdfAnnotation createLink(PdfWriter pdfwriter, Rectangle rectangle, PdfName pdfname, int i, PdfDestination pdfdestination)
	{
		rectangle = ((Rectangle) (createLink(pdfwriter, rectangle, pdfname)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #315 <Method PdfAnnotation createLink(PdfWriter, Rectangle, PdfName)>
	//    4    6:astore_1        
		pdfwriter = ((PdfWriter) (pdfwriter.getPageReference(i)));
	//    5    7:aload_0         
	//    6    8:iload_3         
	//    7    9:invokevirtual   #319 <Method PdfIndirectReference PdfWriter.getPageReference(int)>
	//    8   12:astore_0        
		pdfname = ((PdfName) (new PdfDestination(pdfdestination)));
	//    9   13:new             #321 <Class PdfDestination>
	//   10   16:dup             
	//   11   17:aload           4
	//   12   19:invokespecial   #324 <Method void PdfDestination(PdfDestination)>
	//   13   22:astore_2        
		((PdfDestination) (pdfname)).addPage(((PdfIndirectReference) (pdfwriter)));
	//   14   23:aload_2         
	//   15   24:aload_0         
	//   16   25:invokevirtual   #328 <Method boolean PdfDestination.addPage(PdfIndirectReference)>
	//   17   28:pop             
		((PdfAnnotation) (rectangle)).put(PdfName.DEST, ((PdfObject) (pdfname)));
	//   18   29:aload_1         
	//   19   30:getstatic       #331 <Field PdfName PdfName.DEST>
	//   20   33:aload_2         
	//   21   34:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		return ((PdfAnnotation) (rectangle));
	//   22   37:aload_1         
	//   23   38:areturn         
	}

	public static PdfAnnotation createLink(PdfWriter pdfwriter, Rectangle rectangle, PdfName pdfname, PdfAction pdfaction)
	{
		pdfwriter = ((PdfWriter) (createLink(pdfwriter, rectangle, pdfname)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #315 <Method PdfAnnotation createLink(PdfWriter, Rectangle, PdfName)>
	//    4    6:astore_0        
		((PdfAnnotation) (pdfwriter)).putEx(PdfName.A, ((PdfObject) (pdfaction)));
	//    5    7:aload_0         
	//    6    8:getstatic       #202 <Field PdfName PdfName.A>
	//    7   11:aload_3         
	//    8   12:invokevirtual   #335 <Method void putEx(PdfName, PdfObject)>
		return ((PdfAnnotation) (pdfwriter));
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public static PdfAnnotation createLink(PdfWriter pdfwriter, Rectangle rectangle, PdfName pdfname, String s)
	{
		pdfwriter = ((PdfWriter) (createLink(pdfwriter, rectangle, pdfname)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #315 <Method PdfAnnotation createLink(PdfWriter, Rectangle, PdfName)>
	//    4    6:astore_0        
		((PdfAnnotation) (pdfwriter)).put(PdfName.DEST, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    5    7:aload_0         
	//    6    8:getstatic       #331 <Field PdfName PdfName.DEST>
	//    7   11:new             #241 <Class PdfString>
	//    8   14:dup             
	//    9   15:aload_3         
	//   10   16:ldc1            #243 <String "UnicodeBig">
	//   11   18:invokespecial   #246 <Method void PdfString(String, String)>
	//   12   21:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		return ((PdfAnnotation) (pdfwriter));
	//   13   24:aload_0         
	//   14   25:areturn         
	}

	public static PdfAnnotation createMarkup(PdfWriter pdfwriter, Rectangle rectangle, String s, int i, float af[])
	{
		PdfName pdfname = PdfName.HIGHLIGHT;
	//    0    0:getstatic       #341 <Field PdfName PdfName.HIGHLIGHT>
	//    1    3:astore          5
		i;
	//    2    5:iload_3         
		JVM INSTR tableswitch 1 3: default 32
	//	               1 97
	//	               2 105
	//	               3 113;
	//    3    6:tableswitch     1 3: default 32
	//	               1 97
	//	               2 105
	//	               3 113
		   goto _L1 _L2 _L3 _L4
_L1:
		pdfwriter = ((PdfWriter) (pdfwriter.createAnnotation(rectangle, pdfname)));
	//    4   32:aload_0         
	//    5   33:aload_1         
	//    6   34:aload           5
	//    7   36:invokevirtual   #239 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
	//    8   39:astore_0        
		((PdfAnnotation) (pdfwriter)).put(PdfName.CONTENTS, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    9   40:aload_0         
	//   10   41:getstatic       #222 <Field PdfName PdfName.CONTENTS>
	//   11   44:new             #241 <Class PdfString>
	//   12   47:dup             
	//   13   48:aload_2         
	//   14   49:ldc1            #243 <String "UnicodeBig">
	//   15   51:invokespecial   #246 <Method void PdfString(String, String)>
	//   16   54:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		rectangle = ((Rectangle) (new PdfArray()));
	//   17   57:new             #279 <Class PdfArray>
	//   18   60:dup             
	//   19   61:invokespecial   #280 <Method void PdfArray()>
	//   20   64:astore_1        
		for(i = 0; i < af.length; i++)
	//*  21   65:iconst_0        
	//*  22   66:istore_3        
	//*  23   67:iload_3         
	//*  24   68:aload           4
	//*  25   70:arraylength     
	//*  26   71:icmpge          121
			((PdfArray) (rectangle)).add(((PdfObject) (new PdfNumber(af[i]))));
	//   27   74:aload_1         
	//   28   75:new             #282 <Class PdfNumber>
	//   29   78:dup             
	//   30   79:aload           4
	//   31   81:iload_3         
	//   32   82:faload          
	//   33   83:invokespecial   #285 <Method void PdfNumber(float)>
	//   34   86:invokevirtual   #289 <Method boolean PdfArray.add(PdfObject)>
	//   35   89:pop             

	//   36   90:iload_3         
	//   37   91:iconst_1        
	//   38   92:iadd            
	//   39   93:istore_3        
		break; /* Loop/switch isn't completed */
	//   40   94:goto            67
_L2:
		pdfname = PdfName.UNDERLINE;
	//   41   97:getstatic       #344 <Field PdfName PdfName.UNDERLINE>
	//   42  100:astore          5
		continue; /* Loop/switch isn't completed */
	//   43  102:goto            32
_L3:
		pdfname = PdfName.STRIKEOUT;
	//   44  105:getstatic       #347 <Field PdfName PdfName.STRIKEOUT>
	//   45  108:astore          5
		continue; /* Loop/switch isn't completed */
	//   46  110:goto            32
_L4:
		pdfname = PdfName.SQUIGGLY;
	//   47  113:getstatic       #350 <Field PdfName PdfName.SQUIGGLY>
	//   48  116:astore          5
		if(true) goto _L1; else goto _L5
	//   49  118:goto            32
_L5:
		((PdfAnnotation) (pdfwriter)).put(PdfName.QUADPOINTS, ((PdfObject) (rectangle)));
	//   50  121:aload_0         
	//   51  122:getstatic       #353 <Field PdfName PdfName.QUADPOINTS>
	//   52  125:aload_1         
	//   53  126:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		return ((PdfAnnotation) (pdfwriter));
	//   54  129:aload_0         
	//   55  130:areturn         
	}

	public static PdfAnnotation createPolygonPolyline(PdfWriter pdfwriter, Rectangle rectangle, String s, boolean flag, PdfArray pdfarray)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            48
			pdfwriter = ((PdfWriter) (pdfwriter.createAnnotation(rectangle, PdfName.POLYGON)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getstatic       #358 <Field PdfName PdfName.POLYGON>
	//    5    9:invokevirtual   #239 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
	//    6   12:astore_0        
		else
	//*   7   13:aload_0         
	//*   8   14:getstatic       #222 <Field PdfName PdfName.CONTENTS>
	//*   9   17:new             #241 <Class PdfString>
	//*  10   20:dup             
	//*  11   21:aload_2         
	//*  12   22:ldc1            #243 <String "UnicodeBig">
	//*  13   24:invokespecial   #246 <Method void PdfString(String, String)>
	//*  14   27:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//*  15   30:aload_0         
	//*  16   31:getstatic       #361 <Field PdfName PdfName.VERTICES>
	//*  17   34:new             #279 <Class PdfArray>
	//*  18   37:dup             
	//*  19   38:aload           4
	//*  20   40:invokespecial   #364 <Method void PdfArray(PdfArray)>
	//*  21   43:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//*  22   46:aload_0         
	//*  23   47:areturn         
			pdfwriter = ((PdfWriter) (pdfwriter.createAnnotation(rectangle, PdfName.POLYLINE)));
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getstatic       #367 <Field PdfName PdfName.POLYLINE>
	//   27   53:invokevirtual   #239 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
	//   28   56:astore_0        
		((PdfAnnotation) (pdfwriter)).put(PdfName.CONTENTS, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
		((PdfAnnotation) (pdfwriter)).put(PdfName.VERTICES, ((PdfObject) (new PdfArray(pdfarray))));
		return ((PdfAnnotation) (pdfwriter));
	//*  29   57:goto            13
	}

	public static PdfAnnotation createPopup(PdfWriter pdfwriter, Rectangle rectangle, String s, boolean flag)
	{
		pdfwriter = ((PdfWriter) (pdfwriter.createAnnotation(rectangle, PdfName.POPUP)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #372 <Field PdfName PdfName.POPUP>
	//    3    5:invokevirtual   #239 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
	//    4    8:astore_0        
		if(s != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          30
			((PdfAnnotation) (pdfwriter)).put(PdfName.CONTENTS, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    7   13:aload_0         
	//    8   14:getstatic       #222 <Field PdfName PdfName.CONTENTS>
	//    9   17:new             #241 <Class PdfString>
	//   10   20:dup             
	//   11   21:aload_2         
	//   12   22:ldc1            #243 <String "UnicodeBig">
	//   13   24:invokespecial   #246 <Method void PdfString(String, String)>
	//   14   27:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		if(flag)
	//*  15   30:iload_3         
	//*  16   31:ifeq            44
			((PdfAnnotation) (pdfwriter)).put(PdfName.OPEN, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   17   34:aload_0         
	//   18   35:getstatic       #375 <Field PdfName PdfName.OPEN>
	//   19   38:getstatic       #381 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   20   41:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		return ((PdfAnnotation) (pdfwriter));
	//   21   44:aload_0         
	//   22   45:areturn         
	}

	public static PdfAnnotation createScreen(PdfWriter pdfwriter, Rectangle rectangle, String s, PdfFileSpecification pdffilespecification, String s1, boolean flag)
		throws IOException
	{
		rectangle = ((Rectangle) (pdfwriter.createAnnotation(rectangle, PdfName.SCREEN)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #386 <Field PdfName PdfName.SCREEN>
	//    3    5:invokevirtual   #239 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
	//    4    8:astore_1        
		((PdfAnnotation) (rectangle)).put(PdfName.F, ((PdfObject) (new PdfNumber(4))));
	//    5    9:aload_1         
	//    6   10:getstatic       #148 <Field PdfName PdfName.F>
	//    7   13:new             #282 <Class PdfNumber>
	//    8   16:dup             
	//    9   17:iconst_4        
	//   10   18:invokespecial   #389 <Method void PdfNumber(int)>
	//   11   21:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		((PdfAnnotation) (rectangle)).put(PdfName.TYPE, ((PdfObject) (PdfName.ANNOT)));
	//   12   24:aload_1         
	//   13   25:getstatic       #392 <Field PdfName PdfName.TYPE>
	//   14   28:getstatic       #395 <Field PdfName PdfName.ANNOT>
	//   15   31:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		((PdfAnnotation) (rectangle)).setPage();
	//   16   34:aload_1         
	//   17   35:invokevirtual   #398 <Method void setPage()>
		pdfwriter = ((PdfWriter) (pdfwriter.addToBody(((PdfObject) (PdfAction.rendition(s, pdffilespecification, s1, ((PdfAnnotation) (rectangle)).getIndirectReference())))).getIndirectReference()));
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:aload           4
	//   22   43:aload_1         
	//   23   44:invokevirtual   #401 <Method PdfIndirectReference getIndirectReference()>
	//   24   47:invokestatic    #407 <Method PdfAction PdfAction.rendition(String, PdfFileSpecification, String, PdfIndirectReference)>
	//   25   50:invokevirtual   #411 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   26   53:invokevirtual   #414 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   27   56:astore_0        
		if(flag)
	//*  28   57:iload           5
	//*  29   59:ifeq            93
		{
			s = ((String) (new PdfDictionary()));
	//   30   62:new             #4   <Class PdfDictionary>
	//   31   65:dup             
	//   32   66:invokespecial   #165 <Method void PdfDictionary()>
	//   33   69:astore_2        
			((PdfDictionary) (s)).put(new PdfName("PV"), ((PdfObject) (pdfwriter)));
	//   34   70:aload_2         
	//   35   71:new             #77  <Class PdfName>
	//   36   74:dup             
	//   37   75:ldc2            #416 <String "PV">
	//   38   78:invokespecial   #419 <Method void PdfName(String)>
	//   39   81:aload_0         
	//   40   82:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
			((PdfAnnotation) (rectangle)).put(PdfName.AA, ((PdfObject) (s)));
	//   41   85:aload_1         
	//   42   86:getstatic       #423 <Field PdfName PdfName.AA>
	//   43   89:aload_2         
	//   44   90:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		}
		((PdfAnnotation) (rectangle)).put(PdfName.A, ((PdfObject) (pdfwriter)));
	//   45   93:aload_1         
	//   46   94:getstatic       #202 <Field PdfName PdfName.A>
	//   47   97:aload_0         
	//   48   98:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		return ((PdfAnnotation) (rectangle));
	//   49  101:aload_1         
	//   50  102:areturn         
	}

	public static PdfAnnotation createSquareCircle(PdfWriter pdfwriter, Rectangle rectangle, String s, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            32
			pdfwriter = ((PdfWriter) (pdfwriter.createAnnotation(rectangle, PdfName.SQUARE)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getstatic       #427 <Field PdfName PdfName.SQUARE>
	//    5    9:invokevirtual   #239 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
	//    6   12:astore_0        
		else
	//*   7   13:aload_0         
	//*   8   14:getstatic       #222 <Field PdfName PdfName.CONTENTS>
	//*   9   17:new             #241 <Class PdfString>
	//*  10   20:dup             
	//*  11   21:aload_2         
	//*  12   22:ldc1            #243 <String "UnicodeBig">
	//*  13   24:invokespecial   #246 <Method void PdfString(String, String)>
	//*  14   27:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//*  15   30:aload_0         
	//*  16   31:areturn         
			pdfwriter = ((PdfWriter) (pdfwriter.createAnnotation(rectangle, PdfName.CIRCLE)));
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:getstatic       #430 <Field PdfName PdfName.CIRCLE>
	//   20   37:invokevirtual   #239 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
	//   21   40:astore_0        
		((PdfAnnotation) (pdfwriter)).put(PdfName.CONTENTS, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
		return ((PdfAnnotation) (pdfwriter));
	//*  22   41:goto            13
	}

	public static PdfAnnotation createStamp(PdfWriter pdfwriter, Rectangle rectangle, String s, String s1)
	{
		pdfwriter = ((PdfWriter) (pdfwriter.createAnnotation(rectangle, PdfName.STAMP)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #435 <Field PdfName PdfName.STAMP>
	//    3    5:invokevirtual   #239 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
	//    4    8:astore_0        
		((PdfAnnotation) (pdfwriter)).put(PdfName.CONTENTS, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    5    9:aload_0         
	//    6   10:getstatic       #222 <Field PdfName PdfName.CONTENTS>
	//    7   13:new             #241 <Class PdfString>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:ldc1            #243 <String "UnicodeBig">
	//   11   20:invokespecial   #246 <Method void PdfString(String, String)>
	//   12   23:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		((PdfAnnotation) (pdfwriter)).put(PdfName.NAME, ((PdfObject) (new PdfName(s1))));
	//   13   26:aload_0         
	//   14   27:getstatic       #438 <Field PdfName PdfName.NAME>
	//   15   30:new             #77  <Class PdfName>
	//   16   33:dup             
	//   17   34:aload_3         
	//   18   35:invokespecial   #419 <Method void PdfName(String)>
	//   19   38:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		return ((PdfAnnotation) (pdfwriter));
	//   20   41:aload_0         
	//   21   42:areturn         
	}

	public static PdfAnnotation createText(PdfWriter pdfwriter, Rectangle rectangle, String s, String s1, boolean flag, String s2)
	{
		pdfwriter = ((PdfWriter) (pdfwriter.createAnnotation(rectangle, PdfName.TEXT)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #219 <Field PdfName PdfName.TEXT>
	//    3    5:invokevirtual   #239 <Method PdfAnnotation PdfWriter.createAnnotation(Rectangle, PdfName)>
	//    4    8:astore_0        
		if(s != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          30
			((PdfAnnotation) (pdfwriter)).put(PdfName.T, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    7   13:aload_0         
	//    8   14:getstatic       #99  <Field PdfName PdfName.T>
	//    9   17:new             #241 <Class PdfString>
	//   10   20:dup             
	//   11   21:aload_2         
	//   12   22:ldc1            #243 <String "UnicodeBig">
	//   13   24:invokespecial   #246 <Method void PdfString(String, String)>
	//   14   27:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		if(s1 != null)
	//*  15   30:aload_3         
	//*  16   31:ifnull          51
			((PdfAnnotation) (pdfwriter)).put(PdfName.CONTENTS, ((PdfObject) (new PdfString(s1, "UnicodeBig"))));
	//   17   34:aload_0         
	//   18   35:getstatic       #222 <Field PdfName PdfName.CONTENTS>
	//   19   38:new             #241 <Class PdfString>
	//   20   41:dup             
	//   21   42:aload_3         
	//   22   43:ldc1            #243 <String "UnicodeBig">
	//   23   45:invokespecial   #246 <Method void PdfString(String, String)>
	//   24   48:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		if(flag)
	//*  25   51:iload           4
	//*  26   53:ifeq            66
			((PdfAnnotation) (pdfwriter)).put(PdfName.OPEN, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   27   56:aload_0         
	//   28   57:getstatic       #375 <Field PdfName PdfName.OPEN>
	//   29   60:getstatic       #381 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   30   63:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		if(s2 != null)
	//*  31   66:aload           5
	//*  32   68:ifnull          87
			((PdfAnnotation) (pdfwriter)).put(PdfName.NAME, ((PdfObject) (new PdfName(s2))));
	//   33   71:aload_0         
	//   34   72:getstatic       #438 <Field PdfName PdfName.NAME>
	//   35   75:new             #77  <Class PdfName>
	//   36   78:dup             
	//   37   79:aload           5
	//   38   81:invokespecial   #419 <Method void PdfName(String)>
	//   39   84:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		return ((PdfAnnotation) (pdfwriter));
	//   40   87:aload_0         
	//   41   88:areturn         
	}

	public static PdfArray getMKColor(BaseColor basecolor)
	{
		PdfArray pdfarray = new PdfArray();
	//    0    0:new             #279 <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #280 <Method void PdfArray()>
	//    3    7:astore_1        
		switch(ExtendedColor.getType(basecolor))
	//*   4    8:aload_0         
	//*   5    9:invokestatic    #448 <Method int ExtendedColor.getType(BaseColor)>
		{
	//*   6   12:tableswitch     1 5: default 48
	//	               1 113
	//	               2 134
	//	               3 205
	//	               4 205
	//	               5 205
		default:
			pdfarray.add(((PdfObject) (new PdfNumber((float)basecolor.getRed() / 255F))));
	//    7   48:aload_1         
	//    8   49:new             #282 <Class PdfNumber>
	//    9   52:dup             
	//   10   53:aload_0         
	//   11   54:invokevirtual   #454 <Method int BaseColor.getRed()>
	//   12   57:i2f             
	//   13   58:ldc2            #455 <Float 255F>
	//   14   61:fdiv            
	//   15   62:invokespecial   #285 <Method void PdfNumber(float)>
	//   16   65:invokevirtual   #289 <Method boolean PdfArray.add(PdfObject)>
	//   17   68:pop             
			pdfarray.add(((PdfObject) (new PdfNumber((float)basecolor.getGreen() / 255F))));
	//   18   69:aload_1         
	//   19   70:new             #282 <Class PdfNumber>
	//   20   73:dup             
	//   21   74:aload_0         
	//   22   75:invokevirtual   #458 <Method int BaseColor.getGreen()>
	//   23   78:i2f             
	//   24   79:ldc2            #455 <Float 255F>
	//   25   82:fdiv            
	//   26   83:invokespecial   #285 <Method void PdfNumber(float)>
	//   27   86:invokevirtual   #289 <Method boolean PdfArray.add(PdfObject)>
	//   28   89:pop             
			pdfarray.add(((PdfObject) (new PdfNumber((float)basecolor.getBlue() / 255F))));
	//   29   90:aload_1         
	//   30   91:new             #282 <Class PdfNumber>
	//   31   94:dup             
	//   32   95:aload_0         
	//   33   96:invokevirtual   #461 <Method int BaseColor.getBlue()>
	//   34   99:i2f             
	//   35  100:ldc2            #455 <Float 255F>
	//   36  103:fdiv            
	//   37  104:invokespecial   #285 <Method void PdfNumber(float)>
	//   38  107:invokevirtual   #289 <Method boolean PdfArray.add(PdfObject)>
	//   39  110:pop             
			return pdfarray;
	//   40  111:aload_1         
	//   41  112:areturn         

		case 1: // '\001'
			pdfarray.add(((PdfObject) (new PdfNumber(((GrayColor)basecolor).getGray()))));
	//   42  113:aload_1         
	//   43  114:new             #282 <Class PdfNumber>
	//   44  117:dup             
	//   45  118:aload_0         
	//   46  119:checkcast       #463 <Class GrayColor>
	//   47  122:invokevirtual   #467 <Method float GrayColor.getGray()>
	//   48  125:invokespecial   #285 <Method void PdfNumber(float)>
	//   49  128:invokevirtual   #289 <Method boolean PdfArray.add(PdfObject)>
	//   50  131:pop             
			return pdfarray;
	//   51  132:aload_1         
	//   52  133:areturn         

		case 2: // '\002'
			basecolor = ((BaseColor) ((CMYKColor)basecolor));
	//   53  134:aload_0         
	//   54  135:checkcast       #469 <Class CMYKColor>
	//   55  138:astore_0        
			pdfarray.add(((PdfObject) (new PdfNumber(((CMYKColor) (basecolor)).getCyan()))));
	//   56  139:aload_1         
	//   57  140:new             #282 <Class PdfNumber>
	//   58  143:dup             
	//   59  144:aload_0         
	//   60  145:invokevirtual   #472 <Method float CMYKColor.getCyan()>
	//   61  148:invokespecial   #285 <Method void PdfNumber(float)>
	//   62  151:invokevirtual   #289 <Method boolean PdfArray.add(PdfObject)>
	//   63  154:pop             
			pdfarray.add(((PdfObject) (new PdfNumber(((CMYKColor) (basecolor)).getMagenta()))));
	//   64  155:aload_1         
	//   65  156:new             #282 <Class PdfNumber>
	//   66  159:dup             
	//   67  160:aload_0         
	//   68  161:invokevirtual   #475 <Method float CMYKColor.getMagenta()>
	//   69  164:invokespecial   #285 <Method void PdfNumber(float)>
	//   70  167:invokevirtual   #289 <Method boolean PdfArray.add(PdfObject)>
	//   71  170:pop             
			pdfarray.add(((PdfObject) (new PdfNumber(((CMYKColor) (basecolor)).getYellow()))));
	//   72  171:aload_1         
	//   73  172:new             #282 <Class PdfNumber>
	//   74  175:dup             
	//   75  176:aload_0         
	//   76  177:invokevirtual   #478 <Method float CMYKColor.getYellow()>
	//   77  180:invokespecial   #285 <Method void PdfNumber(float)>
	//   78  183:invokevirtual   #289 <Method boolean PdfArray.add(PdfObject)>
	//   79  186:pop             
			pdfarray.add(((PdfObject) (new PdfNumber(((CMYKColor) (basecolor)).getBlack()))));
	//   80  187:aload_1         
	//   81  188:new             #282 <Class PdfNumber>
	//   82  191:dup             
	//   83  192:aload_0         
	//   84  193:invokevirtual   #481 <Method float CMYKColor.getBlack()>
	//   85  196:invokespecial   #285 <Method void PdfNumber(float)>
	//   86  199:invokevirtual   #289 <Method boolean PdfArray.add(PdfObject)>
	//   87  202:pop             
			return pdfarray;
	//   88  203:aload_1         
	//   89  204:areturn         

		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
			throw new RuntimeException(MessageLocalization.getComposedMessage("separations.patterns.and.shadings.are.not.allowed.in.mk.dictionary", new Object[0]));
	//   90  205:new             #483 <Class RuntimeException>
	//   91  208:dup             
	//   92  209:ldc2            #485 <String "separations.patterns.and.shadings.are.not.allowed.in.mk.dictionary">
	//   93  212:iconst_0        
	//   94  213:anewarray       Object[]
	//   95  216:invokestatic    #493 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   96  219:invokespecial   #494 <Method void RuntimeException(String)>
	//   97  222:athrow          
		}
	}

	public void applyCTM(AffineTransform affinetransform)
	{
		Object obj = ((Object) (getAsArray(PdfName.RECT)));
	//    0    0:aload_0         
	//    1    1:getstatic       #194 <Field PdfName PdfName.RECT>
	//    2    4:invokevirtual   #500 <Method PdfArray getAsArray(PdfName)>
	//    3    7:astore_2        
		if(obj != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          72
		{
			if(((PdfArray) (obj)).size() == 4)
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #503 <Method int PdfArray.size()>
	//*   8   16:iconst_4        
	//*   9   17:icmpne          73
				obj = ((Object) (new PdfRectangle(((PdfArray) (obj)).getAsNumber(0).floatValue(), ((PdfArray) (obj)).getAsNumber(1).floatValue(), ((PdfArray) (obj)).getAsNumber(2).floatValue(), ((PdfArray) (obj)).getAsNumber(3).floatValue())));
	//   10   20:new             #196 <Class PdfRectangle>
	//   11   23:dup             
	//   12   24:aload_2         
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #507 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   15   29:invokevirtual   #510 <Method float PdfNumber.floatValue()>
	//   16   32:aload_2         
	//   17   33:iconst_1        
	//   18   34:invokevirtual   #507 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   19   37:invokevirtual   #510 <Method float PdfNumber.floatValue()>
	//   20   40:aload_2         
	//   21   41:iconst_2        
	//   22   42:invokevirtual   #507 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   23   45:invokevirtual   #510 <Method float PdfNumber.floatValue()>
	//   24   48:aload_2         
	//   25   49:iconst_3        
	//   26   50:invokevirtual   #507 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   27   53:invokevirtual   #510 <Method float PdfNumber.floatValue()>
	//   28   56:invokespecial   #199 <Method void PdfRectangle(float, float, float, float)>
	//   29   59:astore_2        
			else
	//*  30   60:aload_0         
	//*  31   61:getstatic       #194 <Field PdfName PdfName.RECT>
	//*  32   64:aload_2         
	//*  33   65:aload_1         
	//*  34   66:invokevirtual   #514 <Method PdfRectangle PdfRectangle.transform(AffineTransform)>
	//*  35   69:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//*  36   72:return          
				obj = ((Object) (new PdfRectangle(((PdfArray) (obj)).getAsNumber(0).floatValue(), ((PdfArray) (obj)).getAsNumber(1).floatValue())));
	//   37   73:new             #196 <Class PdfRectangle>
	//   38   76:dup             
	//   39   77:aload_2         
	//   40   78:iconst_0        
	//   41   79:invokevirtual   #507 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   42   82:invokevirtual   #510 <Method float PdfNumber.floatValue()>
	//   43   85:aload_2         
	//   44   86:iconst_1        
	//   45   87:invokevirtual   #507 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   46   90:invokevirtual   #510 <Method float PdfNumber.floatValue()>
	//   47   93:invokespecial   #517 <Method void PdfRectangle(float, float)>
	//   48   96:astore_2        
			put(PdfName.RECT, ((PdfObject) (((PdfRectangle) (obj)).transform(affinetransform))));
		}
	//*  49   97:goto            60
	}

	public PdfObject getAccessibleAttribute(PdfName pdfname)
	{
		if(accessibleAttributes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #177 <Field HashMap accessibleAttributes>
	//*   2    4:ifnull          19
			return (PdfObject)accessibleAttributes.get(((Object) (pdfname)));
	//    3    7:aload_0         
	//    4    8:getfield        #177 <Field HashMap accessibleAttributes>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #525 <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #527 <Class PdfObject>
	//    8   18:areturn         
		else
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
	}

	public HashMap getAccessibleAttributes()
	{
		return accessibleAttributes;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field HashMap accessibleAttributes>
	//    2    4:areturn         
	}

	public AccessibleElementId getId()
	{
		if(id == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field AccessibleElementId id>
	//*   2    4:ifnonnull       18
			id = new AccessibleElementId();
	//    3    7:aload_0         
	//    4    8:new             #535 <Class AccessibleElementId>
	//    5   11:dup             
	//    6   12:invokespecial   #536 <Method void AccessibleElementId()>
	//    7   15:putfield        #179 <Field AccessibleElementId id>
		return id;
	//    8   18:aload_0         
	//    9   19:getfield        #179 <Field AccessibleElementId id>
	//   10   22:areturn         
	}

	public PdfIndirectReference getIndirectReference()
	{
		if(reference == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #538 <Field PdfIndirectReference reference>
	//*   2    4:ifnonnull       18
			reference = writer.getPdfIndirectReference();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #181 <Field PdfWriter writer>
	//    6   12:invokevirtual   #541 <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//    7   15:putfield        #538 <Field PdfIndirectReference reference>
		return reference;
	//    8   18:aload_0         
	//    9   19:getfield        #538 <Field PdfIndirectReference reference>
	//   10   22:areturn         
	}

	PdfDictionary getMK()
	{
		PdfDictionary pdfdictionary1 = (PdfDictionary)get(PdfName.MK);
	//    0    0:aload_0         
	//    1    1:getstatic       #546 <Field PdfName PdfName.MK>
	//    2    4:invokevirtual   #548 <Method PdfObject get(PdfName)>
	//    3    7:checkcast       #4   <Class PdfDictionary>
	//    4   10:astore_2        
		PdfDictionary pdfdictionary = pdfdictionary1;
	//    5   11:aload_2         
	//    6   12:astore_1        
		if(pdfdictionary1 == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       33
		{
			pdfdictionary = new PdfDictionary();
	//    9   17:new             #4   <Class PdfDictionary>
	//   10   20:dup             
	//   11   21:invokespecial   #165 <Method void PdfDictionary()>
	//   12   24:astore_1        
			put(PdfName.MK, ((PdfObject) (pdfdictionary)));
	//   13   25:aload_0         
	//   14   26:getstatic       #546 <Field PdfName PdfName.MK>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		}
		return pdfdictionary;
	//   17   33:aload_1         
	//   18   34:areturn         
	}

	public int getPlaceInPage()
	{
		return placeInPage;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field int placeInPage>
	//    2    4:ireturn         
	}

	public PdfName getRole()
	{
		return role;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field PdfName role>
	//    2    4:areturn         
	}

	public HashSet getTemplates()
	{
		return templates;
	//    0    0:aload_0         
	//    1    1:getfield        #555 <Field HashSet templates>
	//    2    4:areturn         
	}

	public boolean isAnnotation()
	{
		return annotation;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field boolean annotation>
	//    2    4:ireturn         
	}

	public boolean isForm()
	{
		return form;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field boolean form>
	//    2    4:ireturn         
	}

	public boolean isInline()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isUsed()
	{
		return used;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field boolean used>
	//    2    4:ireturn         
	}

	public void setAccessibleAttribute(PdfName pdfname, PdfObject pdfobject)
	{
		if(accessibleAttributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #177 <Field HashMap accessibleAttributes>
	//*   2    4:ifnonnull       18
			accessibleAttributes = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #521 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #563 <Method void HashMap()>
	//    7   15:putfield        #177 <Field HashMap accessibleAttributes>
		accessibleAttributes.put(((Object) (pdfname)), ((Object) (pdfobject)));
	//    8   18:aload_0         
	//    9   19:getfield        #177 <Field HashMap accessibleAttributes>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #566 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public void setAction(PdfAction pdfaction)
	{
		put(PdfName.A, ((PdfObject) (pdfaction)));
	//    0    0:aload_0         
	//    1    1:getstatic       #202 <Field PdfName PdfName.A>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//    4    8:return          
	}

	public void setAdditionalActions(PdfName pdfname, PdfAction pdfaction)
	{
		Object obj = ((Object) (get(PdfName.AA)));
	//    0    0:aload_0         
	//    1    1:getstatic       #423 <Field PdfName PdfName.AA>
	//    2    4:invokevirtual   #548 <Method PdfObject get(PdfName)>
	//    3    7:astore_3        
		if(obj != null && ((PdfObject) (obj)).isDictionary())
	//*   4    8:aload_3         
	//*   5    9:ifnull          39
	//*   6   12:aload_3         
	//*   7   13:invokevirtual   #573 <Method boolean PdfObject.isDictionary()>
	//*   8   16:ifeq            39
			obj = ((Object) ((PdfDictionary)obj));
	//    9   19:aload_3         
	//   10   20:checkcast       #4   <Class PdfDictionary>
	//   11   23:astore_3        
		else
	//*  12   24:aload_3         
	//*  13   25:aload_1         
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  16   30:aload_0         
	//*  17   31:getstatic       #423 <Field PdfName PdfName.AA>
	//*  18   34:aload_3         
	//*  19   35:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//*  20   38:return          
			obj = ((Object) (new PdfDictionary()));
	//   21   39:new             #4   <Class PdfDictionary>
	//   22   42:dup             
	//   23   43:invokespecial   #165 <Method void PdfDictionary()>
	//   24   46:astore_3        
		((PdfDictionary) (obj)).put(pdfname, ((PdfObject) (pdfaction)));
		put(PdfName.AA, ((PdfObject) (obj)));
	//*  25   47:goto            24
	}

	public void setAppearance(PdfName pdfname, PdfTemplate pdftemplate)
	{
		PdfDictionary pdfdictionary1 = (PdfDictionary)get(PdfName.AP);
	//    0    0:aload_0         
	//    1    1:getstatic       #578 <Field PdfName PdfName.AP>
	//    2    4:invokevirtual   #548 <Method PdfObject get(PdfName)>
	//    3    7:checkcast       #4   <Class PdfDictionary>
	//    4   10:astore          4
		PdfDictionary pdfdictionary = pdfdictionary1;
	//    5   12:aload           4
	//    6   14:astore_3        
		if(pdfdictionary1 == null)
	//*   7   15:aload           4
	//*   8   17:ifnonnull       28
			pdfdictionary = new PdfDictionary();
	//    9   20:new             #4   <Class PdfDictionary>
	//   10   23:dup             
	//   11   24:invokespecial   #165 <Method void PdfDictionary()>
	//   12   27:astore_3        
		pdfdictionary.put(pdfname, ((PdfObject) (pdftemplate.getIndirectReference())));
	//   13   28:aload_3         
	//   14   29:aload_1         
	//   15   30:aload_2         
	//   16   31:invokevirtual   #581 <Method PdfIndirectReference PdfTemplate.getIndirectReference()>
	//   17   34:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
		put(PdfName.AP, ((PdfObject) (pdfdictionary)));
	//   18   37:aload_0         
	//   19   38:getstatic       #578 <Field PdfName PdfName.AP>
	//   20   41:aload_3         
	//   21   42:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		if(!form)
	//*  22   45:aload_0         
	//*  23   46:getfield        #167 <Field boolean form>
	//*  24   49:ifne            53
			return;
	//   25   52:return          
		if(templates == null)
	//*  26   53:aload_0         
	//*  27   54:getfield        #555 <Field HashSet templates>
	//*  28   57:ifnonnull       71
			templates = new HashSet();
	//   29   60:aload_0         
	//   30   61:new             #583 <Class HashSet>
	//   31   64:dup             
	//   32   65:invokespecial   #584 <Method void HashSet()>
	//   33   68:putfield        #555 <Field HashSet templates>
		templates.add(((Object) (pdftemplate)));
	//   34   71:aload_0         
	//   35   72:getfield        #555 <Field HashSet templates>
	//   36   75:aload_2         
	//   37   76:invokevirtual   #586 <Method boolean HashSet.add(Object)>
	//   38   79:pop             
	//   39   80:return          
	}

	public void setAppearance(PdfName pdfname, String s, PdfTemplate pdftemplate)
	{
		Object obj = ((Object) ((PdfDictionary)get(PdfName.AP)));
	//    0    0:aload_0         
	//    1    1:getstatic       #578 <Field PdfName PdfName.AP>
	//    2    4:invokevirtual   #548 <Method PdfObject get(PdfName)>
	//    3    7:checkcast       #4   <Class PdfDictionary>
	//    4   10:astore          5
		PdfDictionary pdfdictionary = ((PdfDictionary) (obj));
	//    5   12:aload           5
	//    6   14:astore          4
		if(obj == null)
	//*   7   16:aload           5
	//*   8   18:ifnonnull       30
			pdfdictionary = new PdfDictionary();
	//    9   21:new             #4   <Class PdfDictionary>
	//   10   24:dup             
	//   11   25:invokespecial   #165 <Method void PdfDictionary()>
	//   12   28:astore          4
		obj = ((Object) (pdfdictionary.get(pdfname)));
	//   13   30:aload           4
	//   14   32:aload_1         
	//   15   33:invokevirtual   #588 <Method PdfObject PdfDictionary.get(PdfName)>
	//   16   36:astore          5
		if(obj != null && ((PdfObject) (obj)).isDictionary())
	//*  17   38:aload           5
	//*  18   40:ifnull          100
	//*  19   43:aload           5
	//*  20   45:invokevirtual   #573 <Method boolean PdfObject.isDictionary()>
	//*  21   48:ifeq            100
			obj = ((Object) ((PdfDictionary)obj));
	//   22   51:aload           5
	//   23   53:checkcast       #4   <Class PdfDictionary>
	//   24   56:astore          5
		else
	//*  25   58:aload           5
	//*  26   60:new             #77  <Class PdfName>
	//*  27   63:dup             
	//*  28   64:aload_2         
	//*  29   65:invokespecial   #419 <Method void PdfName(String)>
	//*  30   68:aload_3         
	//*  31   69:invokevirtual   #581 <Method PdfIndirectReference PdfTemplate.getIndirectReference()>
	//*  32   72:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  33   75:aload           4
	//*  34   77:aload_1         
	//*  35   78:aload           5
	//*  36   80:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  37   83:aload_0         
	//*  38   84:getstatic       #578 <Field PdfName PdfName.AP>
	//*  39   87:aload           4
	//*  40   89:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//*  41   92:aload_0         
	//*  42   93:getfield        #167 <Field boolean form>
	//*  43   96:ifne            112
	//*  44   99:return          
			obj = ((Object) (new PdfDictionary()));
	//   45  100:new             #4   <Class PdfDictionary>
	//   46  103:dup             
	//   47  104:invokespecial   #165 <Method void PdfDictionary()>
	//   48  107:astore          5
		((PdfDictionary) (obj)).put(new PdfName(s), ((PdfObject) (pdftemplate.getIndirectReference())));
		pdfdictionary.put(pdfname, ((PdfObject) (obj)));
		put(PdfName.AP, ((PdfObject) (pdfdictionary)));
		if(!form)
			return;
	//*  49  109:goto            58
		if(templates == null)
	//*  50  112:aload_0         
	//*  51  113:getfield        #555 <Field HashSet templates>
	//*  52  116:ifnonnull       130
			templates = new HashSet();
	//   53  119:aload_0         
	//   54  120:new             #583 <Class HashSet>
	//   55  123:dup             
	//   56  124:invokespecial   #584 <Method void HashSet()>
	//   57  127:putfield        #555 <Field HashSet templates>
		templates.add(((Object) (pdftemplate)));
	//   58  130:aload_0         
	//   59  131:getfield        #555 <Field HashSet templates>
	//   60  134:aload_3         
	//   61  135:invokevirtual   #586 <Method boolean HashSet.add(Object)>
	//   62  138:pop             
	//   63  139:return          
	}

	public void setAppearanceState(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			remove(PdfName.AS);
	//    2    4:aload_0         
	//    3    5:getstatic       #592 <Field PdfName PdfName.AS>
	//    4    8:invokevirtual   #596 <Method void remove(PdfName)>
			return;
	//    5   11:return          
		} else
		{
			put(PdfName.AS, ((PdfObject) (new PdfName(s))));
	//    6   12:aload_0         
	//    7   13:getstatic       #592 <Field PdfName PdfName.AS>
	//    8   16:new             #77  <Class PdfName>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokespecial   #419 <Method void PdfName(String)>
	//   12   24:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
			return;
	//   13   27:return          
		}
	}

	public void setBorder(PdfBorderArray pdfborderarray)
	{
		put(PdfName.BORDER, ((PdfObject) (pdfborderarray)));
	//    0    0:aload_0         
	//    1    1:getstatic       #205 <Field PdfName PdfName.BORDER>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//    4    8:return          
	}

	public void setBorderStyle(PdfBorderDictionary pdfborderdictionary)
	{
		put(PdfName.BS, ((PdfObject) (pdfborderdictionary)));
	//    0    0:aload_0         
	//    1    1:getstatic       #603 <Field PdfName PdfName.BS>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//    4    8:return          
	}

	public void setColor(BaseColor basecolor)
	{
		put(PdfName.C, ((PdfObject) (new PdfColor(basecolor))));
	//    0    0:aload_0         
	//    1    1:getstatic       #158 <Field PdfName PdfName.C>
	//    2    4:new             #212 <Class PdfColor>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #607 <Method void PdfColor(BaseColor)>
	//    6   12:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void setDefaultAppearanceString(PdfContentByte pdfcontentbyte)
	{
		pdfcontentbyte = ((PdfContentByte) (pdfcontentbyte.getInternalBuffer().toByteArray()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #613 <Method ByteBuffer PdfContentByte.getInternalBuffer()>
	//    2    4:invokevirtual   #619 <Method byte[] ByteBuffer.toByteArray()>
	//    3    7:astore_1        
		int j = pdfcontentbyte.length;
	//    4    8:aload_1         
	//    5    9:arraylength     
	//    6   10:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   11:iconst_0        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:iload_3         
	//*  11   15:icmpge          38
			if(pdfcontentbyte[i] == 10)
	//*  12   18:aload_1         
	//*  13   19:iload_2         
	//*  14   20:baload          
	//*  15   21:bipush          10
	//*  16   23:icmpne          31
				pdfcontentbyte[i] = 32;
	//   17   26:aload_1         
	//   18   27:iload_2         
	//   19   28:bipush          32
	//   20   30:bastore         

	//   21   31:iload_2         
	//   22   32:iconst_1        
	//   23   33:iadd            
	//   24   34:istore_2        
	//*  25   35:goto            13
		put(PdfName.DA, ((PdfObject) (new PdfString(((byte []) (pdfcontentbyte))))));
	//   26   38:aload_0         
	//   27   39:getstatic       #622 <Field PdfName PdfName.DA>
	//   28   42:new             #241 <Class PdfString>
	//   29   45:dup             
	//   30   46:aload_1         
	//   31   47:invokespecial   #625 <Method void PdfString(byte[])>
	//   32   50:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//   33   53:return          
	}

	public void setFlags(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            12
		{
			remove(PdfName.F);
	//    2    4:aload_0         
	//    3    5:getstatic       #148 <Field PdfName PdfName.F>
	//    4    8:invokevirtual   #596 <Method void remove(PdfName)>
			return;
	//    5   11:return          
		} else
		{
			put(PdfName.F, ((PdfObject) (new PdfNumber(i))));
	//    6   12:aload_0         
	//    7   13:getstatic       #148 <Field PdfName PdfName.F>
	//    8   16:new             #282 <Class PdfNumber>
	//    9   19:dup             
	//   10   20:iload_1         
	//   11   21:invokespecial   #389 <Method void PdfNumber(int)>
	//   12   24:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
			return;
	//   13   27:return          
		}
	}

	public void setHighlighting(PdfName pdfname)
	{
		if(pdfname.equals(((Object) (HIGHLIGHT_INVERT))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #86  <Field PdfName HIGHLIGHT_INVERT>
	//*   2    4:invokevirtual   #309 <Method boolean PdfName.equals(Object)>
	//*   3    7:ifeq            18
		{
			remove(PdfName.H);
	//    4   10:aload_0         
	//    5   11:getstatic       #312 <Field PdfName PdfName.H>
	//    6   14:invokevirtual   #596 <Method void remove(PdfName)>
			return;
	//    7   17:return          
		} else
		{
			put(PdfName.H, ((PdfObject) (pdfname)));
	//    8   18:aload_0         
	//    9   19:getstatic       #312 <Field PdfName PdfName.H>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
			return;
	//   12   26:return          
		}
	}

	public void setId(AccessibleElementId accessibleelementid)
	{
		id = accessibleelementid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #179 <Field AccessibleElementId id>
	//    3    5:return          
	}

	public void setLayer(PdfOCG pdfocg)
	{
		put(PdfName.OC, ((PdfObject) (pdfocg.getRef())));
	//    0    0:aload_0         
	//    1    1:getstatic       #634 <Field PdfName PdfName.OC>
	//    2    4:aload_1         
	//    3    5:invokeinterface #639 <Method PdfIndirectReference PdfOCG.getRef()>
	//    4   10:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//    5   13:return          
	}

	public void setMKAlternateCaption(String s)
	{
		getMK().put(PdfName.AC, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #642 <Method PdfDictionary getMK()>
	//    2    4:getstatic       #645 <Field PdfName PdfName.AC>
	//    3    7:new             #241 <Class PdfString>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:ldc1            #243 <String "UnicodeBig">
	//    7   14:invokespecial   #246 <Method void PdfString(String, String)>
	//    8   17:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//    9   20:return          
	}

	public void setMKAlternateIcon(PdfTemplate pdftemplate)
	{
		getMK().put(PdfName.IX, ((PdfObject) (pdftemplate.getIndirectReference())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #642 <Method PdfDictionary getMK()>
	//    2    4:getstatic       #650 <Field PdfName PdfName.IX>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #581 <Method PdfIndirectReference PdfTemplate.getIndirectReference()>
	//    5   11:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//    6   14:return          
	}

	public void setMKBackgroundColor(BaseColor basecolor)
	{
		if(basecolor == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			getMK().remove(PdfName.BG);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #642 <Method PdfDictionary getMK()>
	//    4    8:getstatic       #654 <Field PdfName PdfName.BG>
	//    5   11:invokevirtual   #655 <Method void PdfDictionary.remove(PdfName)>
			return;
	//    6   14:return          
		} else
		{
			getMK().put(PdfName.BG, ((PdfObject) (getMKColor(basecolor))));
	//    7   15:aload_0         
	//    8   16:invokevirtual   #642 <Method PdfDictionary getMK()>
	//    9   19:getstatic       #654 <Field PdfName PdfName.BG>
	//   10   22:aload_1         
	//   11   23:invokestatic    #657 <Method PdfArray getMKColor(BaseColor)>
	//   12   26:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//   13   29:return          
		}
	}

	public void setMKBorderColor(BaseColor basecolor)
	{
		if(basecolor == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			getMK().remove(PdfName.BC);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #642 <Method PdfDictionary getMK()>
	//    4    8:getstatic       #661 <Field PdfName PdfName.BC>
	//    5   11:invokevirtual   #655 <Method void PdfDictionary.remove(PdfName)>
			return;
	//    6   14:return          
		} else
		{
			getMK().put(PdfName.BC, ((PdfObject) (getMKColor(basecolor))));
	//    7   15:aload_0         
	//    8   16:invokevirtual   #642 <Method PdfDictionary getMK()>
	//    9   19:getstatic       #661 <Field PdfName PdfName.BC>
	//   10   22:aload_1         
	//   11   23:invokestatic    #657 <Method PdfArray getMKColor(BaseColor)>
	//   12   26:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//   13   29:return          
		}
	}

	public void setMKIconFit(PdfName pdfname, PdfName pdfname1, float f, float f1, boolean flag)
	{
		PdfDictionary pdfdictionary = new PdfDictionary();
	//    0    0:new             #4   <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:invokespecial   #165 <Method void PdfDictionary()>
	//    3    7:astore          6
		if(!pdfname.equals(((Object) (PdfName.A))))
	//*   4    9:aload_1         
	//*   5   10:getstatic       #202 <Field PdfName PdfName.A>
	//*   6   13:invokevirtual   #309 <Method boolean PdfName.equals(Object)>
	//*   7   16:ifne            28
			pdfdictionary.put(PdfName.SW, ((PdfObject) (pdfname)));
	//    8   19:aload           6
	//    9   21:getstatic       #666 <Field PdfName PdfName.SW>
	//   10   24:aload_1         
	//   11   25:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(!pdfname1.equals(((Object) (PdfName.P))))
	//*  12   28:aload_2         
	//*  13   29:getstatic       #94  <Field PdfName PdfName.P>
	//*  14   32:invokevirtual   #309 <Method boolean PdfName.equals(Object)>
	//*  15   35:ifne            47
			pdfdictionary.put(PdfName.S, ((PdfObject) (pdfname1)));
	//   16   38:aload           6
	//   17   40:getstatic       #669 <Field PdfName PdfName.S>
	//   18   43:aload_2         
	//   19   44:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(f != 0.5F || f1 != 0.5F)
	//*  20   47:fload_3         
	//*  21   48:ldc2            #670 <Float 0.5F>
	//*  22   51:fcmpl           
	//*  23   52:ifne            64
	//*  24   55:fload           4
	//*  25   57:ldc2            #670 <Float 0.5F>
	//*  26   60:fcmpl           
	//*  27   61:ifeq            103
		{
			pdfname = ((PdfName) (new PdfArray(((PdfObject) (new PdfNumber(f))))));
	//   28   64:new             #279 <Class PdfArray>
	//   29   67:dup             
	//   30   68:new             #282 <Class PdfNumber>
	//   31   71:dup             
	//   32   72:fload_3         
	//   33   73:invokespecial   #285 <Method void PdfNumber(float)>
	//   34   76:invokespecial   #300 <Method void PdfArray(PdfObject)>
	//   35   79:astore_1        
			((PdfArray) (pdfname)).add(((PdfObject) (new PdfNumber(f1))));
	//   36   80:aload_1         
	//   37   81:new             #282 <Class PdfNumber>
	//   38   84:dup             
	//   39   85:fload           4
	//   40   87:invokespecial   #285 <Method void PdfNumber(float)>
	//   41   90:invokevirtual   #289 <Method boolean PdfArray.add(PdfObject)>
	//   42   93:pop             
			pdfdictionary.put(PdfName.A, ((PdfObject) (pdfname)));
	//   43   94:aload           6
	//   44   96:getstatic       #202 <Field PdfName PdfName.A>
	//   45   99:aload_1         
	//   46  100:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		if(flag)
	//*  47  103:iload           5
	//*  48  105:ifeq            119
			pdfdictionary.put(PdfName.FB, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   49  108:aload           6
	//   50  110:getstatic       #673 <Field PdfName PdfName.FB>
	//   51  113:getstatic       #381 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   52  116:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
		getMK().put(PdfName.IF, ((PdfObject) (pdfdictionary)));
	//   53  119:aload_0         
	//   54  120:invokevirtual   #642 <Method PdfDictionary getMK()>
	//   55  123:getstatic       #676 <Field PdfName PdfName.IF>
	//   56  126:aload           6
	//   57  128:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//   58  131:return          
	}

	public void setMKNormalCaption(String s)
	{
		getMK().put(PdfName.CA, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #642 <Method PdfDictionary getMK()>
	//    2    4:getstatic       #680 <Field PdfName PdfName.CA>
	//    3    7:new             #241 <Class PdfString>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:ldc1            #243 <String "UnicodeBig">
	//    7   14:invokespecial   #246 <Method void PdfString(String, String)>
	//    8   17:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//    9   20:return          
	}

	public void setMKNormalIcon(PdfTemplate pdftemplate)
	{
		getMK().put(PdfName.I, ((PdfObject) (pdftemplate.getIndirectReference())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #642 <Method PdfDictionary getMK()>
	//    2    4:getstatic       #84  <Field PdfName PdfName.I>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #581 <Method PdfIndirectReference PdfTemplate.getIndirectReference()>
	//    5   11:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//    6   14:return          
	}

	public void setMKRolloverCaption(String s)
	{
		getMK().put(PdfName.RC, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #642 <Method PdfDictionary getMK()>
	//    2    4:getstatic       #685 <Field PdfName PdfName.RC>
	//    3    7:new             #241 <Class PdfString>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:ldc1            #243 <String "UnicodeBig">
	//    7   14:invokespecial   #246 <Method void PdfString(String, String)>
	//    8   17:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//    9   20:return          
	}

	public void setMKRolloverIcon(PdfTemplate pdftemplate)
	{
		getMK().put(PdfName.RI, ((PdfObject) (pdftemplate.getIndirectReference())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #642 <Method PdfDictionary getMK()>
	//    2    4:getstatic       #689 <Field PdfName PdfName.RI>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #581 <Method PdfIndirectReference PdfTemplate.getIndirectReference()>
	//    5   11:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//    6   14:return          
	}

	public void setMKRotation(int i)
	{
		getMK().put(PdfName.R, ((PdfObject) (new PdfNumber(i))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #642 <Method PdfDictionary getMK()>
	//    2    4:getstatic       #106 <Field PdfName PdfName.R>
	//    3    7:new             #282 <Class PdfNumber>
	//    4   10:dup             
	//    5   11:iload_1         
	//    6   12:invokespecial   #389 <Method void PdfNumber(int)>
	//    7   15:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//    8   18:return          
	}

	public void setMKTextPosition(int i)
	{
		getMK().put(PdfName.TP, ((PdfObject) (new PdfNumber(i))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #642 <Method PdfDictionary getMK()>
	//    2    4:getstatic       #694 <Field PdfName PdfName.TP>
	//    3    7:new             #282 <Class PdfNumber>
	//    4   10:dup             
	//    5   11:iload_1         
	//    6   12:invokespecial   #389 <Method void PdfNumber(int)>
	//    7   15:invokevirtual   #420 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//    8   18:return          
	}

	public void setName(String s)
	{
		put(PdfName.NM, ((PdfObject) (new PdfString(s))));
	//    0    0:aload_0         
	//    1    1:getstatic       #698 <Field PdfName PdfName.NM>
	//    2    4:new             #241 <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #699 <Method void PdfString(String)>
	//    6   12:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void setPage()
	{
		put(PdfName.P, ((PdfObject) (writer.getCurrentPage())));
	//    0    0:aload_0         
	//    1    1:getstatic       #94  <Field PdfName PdfName.P>
	//    2    4:aload_0         
	//    3    5:getfield        #181 <Field PdfWriter writer>
	//    4    8:invokevirtual   #702 <Method PdfIndirectReference PdfWriter.getCurrentPage()>
	//    5   11:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//    6   14:return          
	}

	public void setPage(int i)
	{
		put(PdfName.P, ((PdfObject) (writer.getPageReference(i))));
	//    0    0:aload_0         
	//    1    1:getstatic       #94  <Field PdfName PdfName.P>
	//    2    4:aload_0         
	//    3    5:getfield        #181 <Field PdfWriter writer>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #319 <Method PdfIndirectReference PdfWriter.getPageReference(int)>
	//    6   12:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void setPlaceInPage(int i)
	{
		placeInPage = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #173 <Field int placeInPage>
	//    3    5:return          
	}

	public void setPopup(PdfAnnotation pdfannotation)
	{
		put(PdfName.POPUP, ((PdfObject) (pdfannotation.getIndirectReference())));
	//    0    0:aload_0         
	//    1    1:getstatic       #372 <Field PdfName PdfName.POPUP>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #401 <Method PdfIndirectReference getIndirectReference()>
	//    4    8:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
		pdfannotation.put(PdfName.PARENT, ((PdfObject) (getIndirectReference())));
	//    5   11:aload_1         
	//    6   12:getstatic       #708 <Field PdfName PdfName.PARENT>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #401 <Method PdfIndirectReference getIndirectReference()>
	//    9   19:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//   10   22:return          
	}

	public void setRole(PdfName pdfname)
	{
		role = pdfname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #175 <Field PdfName role>
	//    3    5:return          
	}

	public void setRotate(int i)
	{
		put(PdfName.ROTATE, ((PdfObject) (new PdfNumber(i))));
	//    0    0:aload_0         
	//    1    1:getstatic       #713 <Field PdfName PdfName.ROTATE>
	//    2    4:new             #282 <Class PdfNumber>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokespecial   #389 <Method void PdfNumber(int)>
	//    6   12:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void setTitle(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			remove(PdfName.T);
	//    2    4:aload_0         
	//    3    5:getstatic       #99  <Field PdfName PdfName.T>
	//    4    8:invokevirtual   #596 <Method void remove(PdfName)>
			return;
	//    5   11:return          
		} else
		{
			put(PdfName.T, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    6   12:aload_0         
	//    7   13:getstatic       #99  <Field PdfName PdfName.T>
	//    8   16:new             #241 <Class PdfString>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:ldc1            #243 <String "UnicodeBig">
	//   12   23:invokespecial   #246 <Method void PdfString(String, String)>
	//   13   26:invokevirtual   #191 <Method void put(PdfName, PdfObject)>
			return;
	//   14   29:return          
		}
	}

	public void setUsed()
	{
		used = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #171 <Field boolean used>
	//    3    5:return          
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		PdfWriter.checkPdfIsoConformance(pdfwriter, 13, ((Object) (this)));
	//    0    0:aload_1         
	//    1    1:bipush          13
	//    2    3:aload_0         
	//    3    4:invokestatic    #721 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		super.toPdf(pdfwriter, outputstream);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:invokespecial   #723 <Method void PdfDictionary.toPdf(PdfWriter, OutputStream)>
	//    8   13:return          
	}

	public static final PdfName AA_BLUR;
	public static final PdfName AA_DOWN;
	public static final PdfName AA_ENTER;
	public static final PdfName AA_EXIT;
	public static final PdfName AA_FOCUS;
	public static final PdfName AA_JS_CHANGE;
	public static final PdfName AA_JS_FORMAT;
	public static final PdfName AA_JS_KEY;
	public static final PdfName AA_JS_OTHER_CHANGE;
	public static final PdfName AA_UP;
	public static final PdfName APPEARANCE_DOWN;
	public static final PdfName APPEARANCE_NORMAL;
	public static final PdfName APPEARANCE_ROLLOVER;
	public static final int FLAGS_HIDDEN = 2;
	public static final int FLAGS_INVISIBLE = 1;
	public static final int FLAGS_LOCKED = 128;
	public static final int FLAGS_LOCKEDCONTENTS = 512;
	public static final int FLAGS_NOROTATE = 16;
	public static final int FLAGS_NOVIEW = 32;
	public static final int FLAGS_NOZOOM = 8;
	public static final int FLAGS_PRINT = 4;
	public static final int FLAGS_READONLY = 64;
	public static final int FLAGS_TOGGLENOVIEW = 256;
	public static final PdfName HIGHLIGHT_INVERT;
	public static final PdfName HIGHLIGHT_NONE;
	public static final PdfName HIGHLIGHT_OUTLINE;
	public static final PdfName HIGHLIGHT_PUSH;
	public static final PdfName HIGHLIGHT_TOGGLE;
	public static final int MARKUP_HIGHLIGHT = 0;
	public static final int MARKUP_SQUIGGLY = 3;
	public static final int MARKUP_STRIKEOUT = 2;
	public static final int MARKUP_UNDERLINE = 1;
	protected HashMap accessibleAttributes;
	protected boolean annotation;
	protected boolean form;
	private AccessibleElementId id;
	private int placeInPage;
	protected PdfIndirectReference reference;
	protected PdfName role;
	protected HashSet templates;
	protected boolean used;
	protected PdfWriter writer;

	static 
	{
		HIGHLIGHT_NONE = PdfName.N;
	//    0    0:getstatic       #80  <Field PdfName PdfName.N>
	//    1    3:putstatic       #82  <Field PdfName HIGHLIGHT_NONE>
		HIGHLIGHT_INVERT = PdfName.I;
	//    2    6:getstatic       #84  <Field PdfName PdfName.I>
	//    3    9:putstatic       #86  <Field PdfName HIGHLIGHT_INVERT>
		HIGHLIGHT_OUTLINE = PdfName.O;
	//    4   12:getstatic       #89  <Field PdfName PdfName.O>
	//    5   15:putstatic       #91  <Field PdfName HIGHLIGHT_OUTLINE>
		HIGHLIGHT_PUSH = PdfName.P;
	//    6   18:getstatic       #94  <Field PdfName PdfName.P>
	//    7   21:putstatic       #96  <Field PdfName HIGHLIGHT_PUSH>
		HIGHLIGHT_TOGGLE = PdfName.T;
	//    8   24:getstatic       #99  <Field PdfName PdfName.T>
	//    9   27:putstatic       #101 <Field PdfName HIGHLIGHT_TOGGLE>
		APPEARANCE_NORMAL = PdfName.N;
	//   10   30:getstatic       #80  <Field PdfName PdfName.N>
	//   11   33:putstatic       #103 <Field PdfName APPEARANCE_NORMAL>
		APPEARANCE_ROLLOVER = PdfName.R;
	//   12   36:getstatic       #106 <Field PdfName PdfName.R>
	//   13   39:putstatic       #108 <Field PdfName APPEARANCE_ROLLOVER>
		APPEARANCE_DOWN = PdfName.D;
	//   14   42:getstatic       #111 <Field PdfName PdfName.D>
	//   15   45:putstatic       #113 <Field PdfName APPEARANCE_DOWN>
		AA_ENTER = PdfName.E;
	//   16   48:getstatic       #116 <Field PdfName PdfName.E>
	//   17   51:putstatic       #118 <Field PdfName AA_ENTER>
		AA_EXIT = PdfName.X;
	//   18   54:getstatic       #121 <Field PdfName PdfName.X>
	//   19   57:putstatic       #123 <Field PdfName AA_EXIT>
		AA_DOWN = PdfName.D;
	//   20   60:getstatic       #111 <Field PdfName PdfName.D>
	//   21   63:putstatic       #125 <Field PdfName AA_DOWN>
		AA_UP = PdfName.U;
	//   22   66:getstatic       #128 <Field PdfName PdfName.U>
	//   23   69:putstatic       #130 <Field PdfName AA_UP>
		AA_FOCUS = PdfName.FO;
	//   24   72:getstatic       #133 <Field PdfName PdfName.FO>
	//   25   75:putstatic       #135 <Field PdfName AA_FOCUS>
		AA_BLUR = PdfName.BL;
	//   26   78:getstatic       #138 <Field PdfName PdfName.BL>
	//   27   81:putstatic       #140 <Field PdfName AA_BLUR>
		AA_JS_KEY = PdfName.K;
	//   28   84:getstatic       #143 <Field PdfName PdfName.K>
	//   29   87:putstatic       #145 <Field PdfName AA_JS_KEY>
		AA_JS_FORMAT = PdfName.F;
	//   30   90:getstatic       #148 <Field PdfName PdfName.F>
	//   31   93:putstatic       #150 <Field PdfName AA_JS_FORMAT>
		AA_JS_CHANGE = PdfName.V;
	//   32   96:getstatic       #153 <Field PdfName PdfName.V>
	//   33   99:putstatic       #155 <Field PdfName AA_JS_CHANGE>
		AA_JS_OTHER_CHANGE = PdfName.C;
	//   34  102:getstatic       #158 <Field PdfName PdfName.C>
	//   35  105:putstatic       #160 <Field PdfName AA_JS_OTHER_CHANGE>
	//*  36  108:return          
	}
}
