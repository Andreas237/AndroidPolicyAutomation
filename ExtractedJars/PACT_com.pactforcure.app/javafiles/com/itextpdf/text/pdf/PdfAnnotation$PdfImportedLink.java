// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.Rectangle;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfAnnotation, PdfDictionary, PdfName, PdfArray, 
//			PdfNumber, PdfWriter, PRIndirectReference, PdfReader

public static class PdfAnnotation$PdfImportedLink
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

	PdfAnnotation$PdfImportedLink(PdfDictionary pdfdictionary)
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
