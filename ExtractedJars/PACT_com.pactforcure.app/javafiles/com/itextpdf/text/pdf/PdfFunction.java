// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfStream, PdfWriter, PdfName, PdfNumber, 
//			PdfDictionary, PdfArray, PdfIndirectObject, PdfIndirectReference

public class PdfFunction
{

	protected PdfFunction(PdfWriter pdfwriter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		writer = pdfwriter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field PdfWriter writer>
	//    5    9:return          
	}

	public static PdfFunction type0(PdfWriter pdfwriter, float af[], float af1[], int ai[], int i, int j, float af2[], float af3[], 
			byte abyte0[])
	{
		PdfFunction pdffunction = new PdfFunction(pdfwriter);
	//    0    0:new             #2   <Class PdfFunction>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #22  <Method void PdfFunction(PdfWriter)>
	//    4    8:astore          9
		pdffunction.dictionary = ((PdfDictionary) (new PdfStream(abyte0)));
	//    5   10:aload           9
	//    6   12:new             #24  <Class PdfStream>
	//    7   15:dup             
	//    8   16:aload           8
	//    9   18:invokespecial   #27  <Method void PdfStream(byte[])>
	//   10   21:putfield        #29  <Field PdfDictionary dictionary>
		((PdfStream)pdffunction.dictionary).flateCompress(pdfwriter.getCompressionLevel());
	//   11   24:aload           9
	//   12   26:getfield        #29  <Field PdfDictionary dictionary>
	//   13   29:checkcast       #24  <Class PdfStream>
	//   14   32:aload_0         
	//   15   33:invokevirtual   #35  <Method int PdfWriter.getCompressionLevel()>
	//   16   36:invokevirtual   #39  <Method void PdfStream.flateCompress(int)>
		pdffunction.dictionary.put(PdfName.FUNCTIONTYPE, ((PdfObject) (new PdfNumber(0))));
	//   17   39:aload           9
	//   18   41:getfield        #29  <Field PdfDictionary dictionary>
	//   19   44:getstatic       #45  <Field PdfName PdfName.FUNCTIONTYPE>
	//   20   47:new             #47  <Class PdfNumber>
	//   21   50:dup             
	//   22   51:iconst_0        
	//   23   52:invokespecial   #49  <Method void PdfNumber(int)>
	//   24   55:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdffunction.dictionary.put(PdfName.DOMAIN, ((PdfObject) (new PdfArray(af))));
	//   25   58:aload           9
	//   26   60:getfield        #29  <Field PdfDictionary dictionary>
	//   27   63:getstatic       #58  <Field PdfName PdfName.DOMAIN>
	//   28   66:new             #60  <Class PdfArray>
	//   29   69:dup             
	//   30   70:aload_1         
	//   31   71:invokespecial   #63  <Method void PdfArray(float[])>
	//   32   74:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdffunction.dictionary.put(PdfName.RANGE, ((PdfObject) (new PdfArray(af1))));
	//   33   77:aload           9
	//   34   79:getfield        #29  <Field PdfDictionary dictionary>
	//   35   82:getstatic       #66  <Field PdfName PdfName.RANGE>
	//   36   85:new             #60  <Class PdfArray>
	//   37   88:dup             
	//   38   89:aload_2         
	//   39   90:invokespecial   #63  <Method void PdfArray(float[])>
	//   40   93:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdffunction.dictionary.put(PdfName.SIZE, ((PdfObject) (new PdfArray(ai))));
	//   41   96:aload           9
	//   42   98:getfield        #29  <Field PdfDictionary dictionary>
	//   43  101:getstatic       #69  <Field PdfName PdfName.SIZE>
	//   44  104:new             #60  <Class PdfArray>
	//   45  107:dup             
	//   46  108:aload_3         
	//   47  109:invokespecial   #72  <Method void PdfArray(int[])>
	//   48  112:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdffunction.dictionary.put(PdfName.BITSPERSAMPLE, ((PdfObject) (new PdfNumber(i))));
	//   49  115:aload           9
	//   50  117:getfield        #29  <Field PdfDictionary dictionary>
	//   51  120:getstatic       #75  <Field PdfName PdfName.BITSPERSAMPLE>
	//   52  123:new             #47  <Class PdfNumber>
	//   53  126:dup             
	//   54  127:iload           4
	//   55  129:invokespecial   #49  <Method void PdfNumber(int)>
	//   56  132:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(j != 1)
	//*  57  135:iload           5
	//*  58  137:iconst_1        
	//*  59  138:icmpeq          161
			pdffunction.dictionary.put(PdfName.ORDER, ((PdfObject) (new PdfNumber(j))));
	//   60  141:aload           9
	//   61  143:getfield        #29  <Field PdfDictionary dictionary>
	//   62  146:getstatic       #78  <Field PdfName PdfName.ORDER>
	//   63  149:new             #47  <Class PdfNumber>
	//   64  152:dup             
	//   65  153:iload           5
	//   66  155:invokespecial   #49  <Method void PdfNumber(int)>
	//   67  158:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(af2 != null)
	//*  68  161:aload           6
	//*  69  163:ifnull          186
			pdffunction.dictionary.put(PdfName.ENCODE, ((PdfObject) (new PdfArray(af2))));
	//   70  166:aload           9
	//   71  168:getfield        #29  <Field PdfDictionary dictionary>
	//   72  171:getstatic       #81  <Field PdfName PdfName.ENCODE>
	//   73  174:new             #60  <Class PdfArray>
	//   74  177:dup             
	//   75  178:aload           6
	//   76  180:invokespecial   #63  <Method void PdfArray(float[])>
	//   77  183:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(af3 != null)
	//*  78  186:aload           7
	//*  79  188:ifnull          211
			pdffunction.dictionary.put(PdfName.DECODE, ((PdfObject) (new PdfArray(af3))));
	//   80  191:aload           9
	//   81  193:getfield        #29  <Field PdfDictionary dictionary>
	//   82  196:getstatic       #84  <Field PdfName PdfName.DECODE>
	//   83  199:new             #60  <Class PdfArray>
	//   84  202:dup             
	//   85  203:aload           7
	//   86  205:invokespecial   #63  <Method void PdfArray(float[])>
	//   87  208:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		return pdffunction;
	//   88  211:aload           9
	//   89  213:areturn         
	}

	public static PdfFunction type2(PdfWriter pdfwriter, float af[], float af1[], float af2[], float af3[], float f)
	{
		pdfwriter = ((PdfWriter) (new PdfFunction(pdfwriter)));
	//    0    0:new             #2   <Class PdfFunction>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #22  <Method void PdfFunction(PdfWriter)>
	//    4    8:astore_0        
		pdfwriter.dictionary = new PdfDictionary();
	//    5    9:aload_0         
	//    6   10:new             #51  <Class PdfDictionary>
	//    7   13:dup             
	//    8   14:invokespecial   #87  <Method void PdfDictionary()>
	//    9   17:putfield        #29  <Field PdfDictionary dictionary>
		((PdfFunction) (pdfwriter)).dictionary.put(PdfName.FUNCTIONTYPE, ((PdfObject) (new PdfNumber(2))));
	//   10   20:aload_0         
	//   11   21:getfield        #29  <Field PdfDictionary dictionary>
	//   12   24:getstatic       #45  <Field PdfName PdfName.FUNCTIONTYPE>
	//   13   27:new             #47  <Class PdfNumber>
	//   14   30:dup             
	//   15   31:iconst_2        
	//   16   32:invokespecial   #49  <Method void PdfNumber(int)>
	//   17   35:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfFunction) (pdfwriter)).dictionary.put(PdfName.DOMAIN, ((PdfObject) (new PdfArray(af))));
	//   18   38:aload_0         
	//   19   39:getfield        #29  <Field PdfDictionary dictionary>
	//   20   42:getstatic       #58  <Field PdfName PdfName.DOMAIN>
	//   21   45:new             #60  <Class PdfArray>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:invokespecial   #63  <Method void PdfArray(float[])>
	//   25   53:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(af1 != null)
	//*  26   56:aload_2         
	//*  27   57:ifnull          78
			((PdfFunction) (pdfwriter)).dictionary.put(PdfName.RANGE, ((PdfObject) (new PdfArray(af1))));
	//   28   60:aload_0         
	//   29   61:getfield        #29  <Field PdfDictionary dictionary>
	//   30   64:getstatic       #66  <Field PdfName PdfName.RANGE>
	//   31   67:new             #60  <Class PdfArray>
	//   32   70:dup             
	//   33   71:aload_2         
	//   34   72:invokespecial   #63  <Method void PdfArray(float[])>
	//   35   75:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(af2 != null)
	//*  36   78:aload_3         
	//*  37   79:ifnull          100
			((PdfFunction) (pdfwriter)).dictionary.put(PdfName.C0, ((PdfObject) (new PdfArray(af2))));
	//   38   82:aload_0         
	//   39   83:getfield        #29  <Field PdfDictionary dictionary>
	//   40   86:getstatic       #90  <Field PdfName PdfName.C0>
	//   41   89:new             #60  <Class PdfArray>
	//   42   92:dup             
	//   43   93:aload_3         
	//   44   94:invokespecial   #63  <Method void PdfArray(float[])>
	//   45   97:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(af3 != null)
	//*  46  100:aload           4
	//*  47  102:ifnull          124
			((PdfFunction) (pdfwriter)).dictionary.put(PdfName.C1, ((PdfObject) (new PdfArray(af3))));
	//   48  105:aload_0         
	//   49  106:getfield        #29  <Field PdfDictionary dictionary>
	//   50  109:getstatic       #93  <Field PdfName PdfName.C1>
	//   51  112:new             #60  <Class PdfArray>
	//   52  115:dup             
	//   53  116:aload           4
	//   54  118:invokespecial   #63  <Method void PdfArray(float[])>
	//   55  121:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfFunction) (pdfwriter)).dictionary.put(PdfName.N, ((PdfObject) (new PdfNumber(f))));
	//   56  124:aload_0         
	//   57  125:getfield        #29  <Field PdfDictionary dictionary>
	//   58  128:getstatic       #96  <Field PdfName PdfName.N>
	//   59  131:new             #47  <Class PdfNumber>
	//   60  134:dup             
	//   61  135:fload           5
	//   62  137:invokespecial   #99  <Method void PdfNumber(float)>
	//   63  140:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		return ((PdfFunction) (pdfwriter));
	//   64  143:aload_0         
	//   65  144:areturn         
	}

	public static PdfFunction type3(PdfWriter pdfwriter, float af[], float af1[], PdfFunction apdffunction[], float af2[], float af3[])
	{
		pdfwriter = ((PdfWriter) (new PdfFunction(pdfwriter)));
	//    0    0:new             #2   <Class PdfFunction>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #22  <Method void PdfFunction(PdfWriter)>
	//    4    8:astore_0        
		pdfwriter.dictionary = new PdfDictionary();
	//    5    9:aload_0         
	//    6   10:new             #51  <Class PdfDictionary>
	//    7   13:dup             
	//    8   14:invokespecial   #87  <Method void PdfDictionary()>
	//    9   17:putfield        #29  <Field PdfDictionary dictionary>
		((PdfFunction) (pdfwriter)).dictionary.put(PdfName.FUNCTIONTYPE, ((PdfObject) (new PdfNumber(3))));
	//   10   20:aload_0         
	//   11   21:getfield        #29  <Field PdfDictionary dictionary>
	//   12   24:getstatic       #45  <Field PdfName PdfName.FUNCTIONTYPE>
	//   13   27:new             #47  <Class PdfNumber>
	//   14   30:dup             
	//   15   31:iconst_3        
	//   16   32:invokespecial   #49  <Method void PdfNumber(int)>
	//   17   35:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfFunction) (pdfwriter)).dictionary.put(PdfName.DOMAIN, ((PdfObject) (new PdfArray(af))));
	//   18   38:aload_0         
	//   19   39:getfield        #29  <Field PdfDictionary dictionary>
	//   20   42:getstatic       #58  <Field PdfName PdfName.DOMAIN>
	//   21   45:new             #60  <Class PdfArray>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:invokespecial   #63  <Method void PdfArray(float[])>
	//   25   53:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(af1 != null)
	//*  26   56:aload_2         
	//*  27   57:ifnull          78
			((PdfFunction) (pdfwriter)).dictionary.put(PdfName.RANGE, ((PdfObject) (new PdfArray(af1))));
	//   28   60:aload_0         
	//   29   61:getfield        #29  <Field PdfDictionary dictionary>
	//   30   64:getstatic       #66  <Field PdfName PdfName.RANGE>
	//   31   67:new             #60  <Class PdfArray>
	//   32   70:dup             
	//   33   71:aload_2         
	//   34   72:invokespecial   #63  <Method void PdfArray(float[])>
	//   35   75:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		af = ((float []) (new PdfArray()));
	//   36   78:new             #60  <Class PdfArray>
	//   37   81:dup             
	//   38   82:invokespecial   #102 <Method void PdfArray()>
	//   39   85:astore_1        
		for(int i = 0; i < apdffunction.length; i++)
	//*  40   86:iconst_0        
	//*  41   87:istore          6
	//*  42   89:iload           6
	//*  43   91:aload_3         
	//*  44   92:arraylength     
	//*  45   93:icmpge          117
			((PdfArray) (af)).add(((PdfObject) (apdffunction[i].getReference())));
	//   46   96:aload_1         
	//   47   97:aload_3         
	//   48   98:iload           6
	//   49  100:aaload          
	//   50  101:invokevirtual   #106 <Method PdfIndirectReference getReference()>
	//   51  104:invokevirtual   #110 <Method boolean PdfArray.add(PdfObject)>
	//   52  107:pop             

	//   53  108:iload           6
	//   54  110:iconst_1        
	//   55  111:iadd            
	//   56  112:istore          6
	//*  57  114:goto            89
		((PdfFunction) (pdfwriter)).dictionary.put(PdfName.FUNCTIONS, ((PdfObject) (af)));
	//   58  117:aload_0         
	//   59  118:getfield        #29  <Field PdfDictionary dictionary>
	//   60  121:getstatic       #113 <Field PdfName PdfName.FUNCTIONS>
	//   61  124:aload_1         
	//   62  125:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfFunction) (pdfwriter)).dictionary.put(PdfName.BOUNDS, ((PdfObject) (new PdfArray(af2))));
	//   63  128:aload_0         
	//   64  129:getfield        #29  <Field PdfDictionary dictionary>
	//   65  132:getstatic       #116 <Field PdfName PdfName.BOUNDS>
	//   66  135:new             #60  <Class PdfArray>
	//   67  138:dup             
	//   68  139:aload           4
	//   69  141:invokespecial   #63  <Method void PdfArray(float[])>
	//   70  144:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfFunction) (pdfwriter)).dictionary.put(PdfName.ENCODE, ((PdfObject) (new PdfArray(af3))));
	//   71  147:aload_0         
	//   72  148:getfield        #29  <Field PdfDictionary dictionary>
	//   73  151:getstatic       #81  <Field PdfName PdfName.ENCODE>
	//   74  154:new             #60  <Class PdfArray>
	//   75  157:dup             
	//   76  158:aload           5
	//   77  160:invokespecial   #63  <Method void PdfArray(float[])>
	//   78  163:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		return ((PdfFunction) (pdfwriter));
	//   79  166:aload_0         
	//   80  167:areturn         
	}

	public static PdfFunction type4(PdfWriter pdfwriter, float af[], float af1[], String s)
	{
		byte abyte0[] = new byte[s.length()];
	//    0    0:aload_3         
	//    1    1:invokevirtual   #123 <Method int String.length()>
	//    2    4:newarray        byte[]
	//    3    6:astore          5
		for(int i = 0; i < abyte0.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore          4
	//*   6   11:iload           4
	//*   7   13:aload           5
	//*   8   15:arraylength     
	//*   9   16:icmpge          40
			abyte0[i] = (byte)s.charAt(i);
	//   10   19:aload           5
	//   11   21:iload           4
	//   12   23:aload_3         
	//   13   24:iload           4
	//   14   26:invokevirtual   #127 <Method char String.charAt(int)>
	//   15   29:int2byte        
	//   16   30:bastore         

	//   17   31:iload           4
	//   18   33:iconst_1        
	//   19   34:iadd            
	//   20   35:istore          4
	//*  21   37:goto            11
		s = ((String) (new PdfFunction(pdfwriter)));
	//   22   40:new             #2   <Class PdfFunction>
	//   23   43:dup             
	//   24   44:aload_0         
	//   25   45:invokespecial   #22  <Method void PdfFunction(PdfWriter)>
	//   26   48:astore_3        
		s.dictionary = ((PdfDictionary) (new PdfStream(abyte0)));
	//   27   49:aload_3         
	//   28   50:new             #24  <Class PdfStream>
	//   29   53:dup             
	//   30   54:aload           5
	//   31   56:invokespecial   #27  <Method void PdfStream(byte[])>
	//   32   59:putfield        #29  <Field PdfDictionary dictionary>
		((PdfStream)((PdfFunction) (s)).dictionary).flateCompress(pdfwriter.getCompressionLevel());
	//   33   62:aload_3         
	//   34   63:getfield        #29  <Field PdfDictionary dictionary>
	//   35   66:checkcast       #24  <Class PdfStream>
	//   36   69:aload_0         
	//   37   70:invokevirtual   #35  <Method int PdfWriter.getCompressionLevel()>
	//   38   73:invokevirtual   #39  <Method void PdfStream.flateCompress(int)>
		((PdfFunction) (s)).dictionary.put(PdfName.FUNCTIONTYPE, ((PdfObject) (new PdfNumber(4))));
	//   39   76:aload_3         
	//   40   77:getfield        #29  <Field PdfDictionary dictionary>
	//   41   80:getstatic       #45  <Field PdfName PdfName.FUNCTIONTYPE>
	//   42   83:new             #47  <Class PdfNumber>
	//   43   86:dup             
	//   44   87:iconst_4        
	//   45   88:invokespecial   #49  <Method void PdfNumber(int)>
	//   46   91:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfFunction) (s)).dictionary.put(PdfName.DOMAIN, ((PdfObject) (new PdfArray(af))));
	//   47   94:aload_3         
	//   48   95:getfield        #29  <Field PdfDictionary dictionary>
	//   49   98:getstatic       #58  <Field PdfName PdfName.DOMAIN>
	//   50  101:new             #60  <Class PdfArray>
	//   51  104:dup             
	//   52  105:aload_1         
	//   53  106:invokespecial   #63  <Method void PdfArray(float[])>
	//   54  109:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfFunction) (s)).dictionary.put(PdfName.RANGE, ((PdfObject) (new PdfArray(af1))));
	//   55  112:aload_3         
	//   56  113:getfield        #29  <Field PdfDictionary dictionary>
	//   57  116:getstatic       #66  <Field PdfName PdfName.RANGE>
	//   58  119:new             #60  <Class PdfArray>
	//   59  122:dup             
	//   60  123:aload_2         
	//   61  124:invokespecial   #63  <Method void PdfArray(float[])>
	//   62  127:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		return ((PdfFunction) (s));
	//   63  130:aload_3         
	//   64  131:areturn         
	}

	PdfIndirectReference getReference()
	{
		try
		{
			if(reference == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field PdfIndirectReference reference>
	//*   2    4:ifnonnull       25
				reference = writer.addToBody(((PdfObject) (dictionary))).getIndirectReference();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field PdfWriter writer>
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field PdfDictionary dictionary>
	//    8   16:invokevirtual   #135 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//    9   19:invokevirtual   #140 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   10   22:putfield        #131 <Field PdfIndirectReference reference>
		}
	//*  11   25:aload_0         
	//*  12   26:getfield        #131 <Field PdfIndirectReference reference>
	//*  13   29:areturn         
		catch(IOException ioexception)
	//*  14   30:astore_1        
		{
			throw new ExceptionConverter(((Exception) (ioexception)));
	//   15   31:new             #142 <Class ExceptionConverter>
	//   16   34:dup             
	//   17   35:aload_1         
	//   18   36:invokespecial   #145 <Method void ExceptionConverter(Exception)>
	//   19   39:athrow          
		}
		return reference;
	}

	protected PdfDictionary dictionary;
	protected PdfIndirectReference reference;
	protected PdfWriter writer;
}
