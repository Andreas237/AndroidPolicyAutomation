// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.log.Counter;
import com.itextpdf.text.log.CounterFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfReader, PdfDictionary, PdfName, PRIndirectReference, 
//			PdfIndirectReference, PRStream, PdfObject, PdfString, 
//			PdfArray, PRTokeniser

public class FdfReader extends PdfReader
{

	public FdfReader(InputStream inputstream)
		throws IOException
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void PdfReader(InputStream)>
	//    3    5:return          
	}

	public FdfReader(String s)
		throws IOException
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void PdfReader(String)>
	//    3    5:return          
	}

	public FdfReader(URL url)
		throws IOException
	{
		super(url);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #37  <Method void PdfReader(URL)>
	//    3    5:return          
	}

	public FdfReader(byte abyte0[])
		throws IOException
	{
		super(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void PdfReader(byte[])>
	//    3    5:return          
	}

	public byte[] getAttachedFile(String s)
		throws IOException
	{
		s = ((String) ((PdfDictionary)fields.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field HashMap fields>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #52  <Class PdfDictionary>
	//    5   11:astore_1        
		if(s != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          65
			return getStreamBytes((PRStream)getPdfObject(((PdfIndirectReference) ((PRIndirectReference)((PdfDictionary)getPdfObject(((PdfIndirectReference) ((PRIndirectReference)((PdfDictionary) (s)).get(PdfName.V))).getNumber())).getAsDict(PdfName.EF).get(PdfName.F))).getNumber()));
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getstatic       #57  <Field PdfName PdfName.V>
	//   12   22:invokevirtual   #60  <Method PdfObject PdfDictionary.get(PdfName)>
	//   13   25:checkcast       #62  <Class PRIndirectReference>
	//   14   28:invokevirtual   #68  <Method int PdfIndirectReference.getNumber()>
	//   15   31:invokevirtual   #72  <Method PdfObject getPdfObject(int)>
	//   16   34:checkcast       #52  <Class PdfDictionary>
	//   17   37:getstatic       #75  <Field PdfName PdfName.EF>
	//   18   40:invokevirtual   #79  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   19   43:getstatic       #82  <Field PdfName PdfName.F>
	//   20   46:invokevirtual   #60  <Method PdfObject PdfDictionary.get(PdfName)>
	//   21   49:checkcast       #62  <Class PRIndirectReference>
	//   22   52:invokevirtual   #68  <Method int PdfIndirectReference.getNumber()>
	//   23   55:invokevirtual   #72  <Method PdfObject getPdfObject(int)>
	//   24   58:checkcast       #84  <Class PRStream>
	//   25   61:invokestatic    #88  <Method byte[] getStreamBytes(PRStream)>
	//   26   64:areturn         
		else
			return new byte[0];
	//   27   65:iconst_0        
	//   28   66:newarray        byte[]
	//   29   68:areturn         
	}

	protected Counter getCounter()
	{
		return COUNTER;
	//    0    0:getstatic       #23  <Field Counter COUNTER>
	//    1    3:areturn         
	}

	public PdfDictionary getField(String s)
	{
		return (PdfDictionary)fields.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field HashMap fields>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #52  <Class PdfDictionary>
	//    5   11:areturn         
	}

	public String getFieldValue(String s)
	{
		s = ((String) ((PdfDictionary)fields.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field HashMap fields>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #52  <Class PdfDictionary>
	//    5   11:astore_1        
		if(s != null) goto _L2; else goto _L1
	//    6   12:aload_1         
	//    7   13:ifnonnull       18
_L1:
		return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	//*  10   18:aload_1         
	//*  11   19:getstatic       #57  <Field PdfName PdfName.V>
	//*  12   22:invokevirtual   #60  <Method PdfObject PdfDictionary.get(PdfName)>
	//*  13   25:invokestatic    #98  <Method PdfObject getPdfObject(PdfObject)>
	//*  14   28:astore_1        
_L2:
		if((s = ((String) (getPdfObject(((PdfDictionary) (s)).get(PdfName.V))))) == null) goto _L1; else goto _L3
	//   15   29:aload_1         
	//   16   30:ifnull          16
_L3:
		if(((PdfObject) (s)).isName())
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #104 <Method boolean PdfObject.isName()>
	//*  19   37:ifeq            51
			return PdfName.decodeName(((PdfName)s).toString());
	//   20   40:aload_1         
	//   21   41:checkcast       #54  <Class PdfName>
	//   22   44:invokevirtual   #108 <Method String PdfName.toString()>
	//   23   47:invokestatic    #111 <Method String PdfName.decodeName(String)>
	//   24   50:areturn         
		if(!((PdfObject) (s)).isString()) goto _L1; else goto _L4
	//   25   51:aload_1         
	//   26   52:invokevirtual   #114 <Method boolean PdfObject.isString()>
	//   27   55:ifeq            16
_L4:
		Object obj;
		s = ((String) ((PdfString)s));
	//   28   58:aload_1         
	//   29   59:checkcast       #116 <Class PdfString>
	//   30   62:astore_1        
		if(encoding == null || ((PdfString) (s)).getEncoding() != null)
	//*  31   63:aload_0         
	//*  32   64:getfield        #118 <Field PdfName encoding>
	//*  33   67:ifnull          77
	//*  34   70:aload_1         
	//*  35   71:invokevirtual   #121 <Method String PdfString.getEncoding()>
	//*  36   74:ifnull          82
			return ((PdfString) (s)).toUnicodeString();
	//   37   77:aload_1         
	//   38   78:invokevirtual   #124 <Method String PdfString.toUnicodeString()>
	//   39   81:areturn         
		obj = ((Object) (((PdfString) (s)).getBytes()));
	//   40   82:aload_1         
	//   41   83:invokevirtual   #128 <Method byte[] PdfString.getBytes()>
	//   42   86:astore_2        
		if(obj.length >= 2 && obj[0] == -2 && obj[1] == -1)
	//*  43   87:aload_2         
	//*  44   88:arraylength     
	//*  45   89:iconst_2        
	//*  46   90:icmplt          113
	//*  47   93:aload_2         
	//*  48   94:iconst_0        
	//*  49   95:baload          
	//*  50   96:bipush          -2
	//*  51   98:icmpne          113
	//*  52  101:aload_2         
	//*  53  102:iconst_1        
	//*  54  103:baload          
	//*  55  104:iconst_m1       
	//*  56  105:icmpne          113
			return ((PdfString) (s)).toUnicodeString();
	//   57  108:aload_1         
	//   58  109:invokevirtual   #124 <Method String PdfString.toUnicodeString()>
	//   59  112:areturn         
		if(!encoding.equals(((Object) (PdfName.SHIFT_JIS)))) goto _L6; else goto _L5
	//   60  113:aload_0         
	//   61  114:getfield        #118 <Field PdfName encoding>
	//   62  117:getstatic       #131 <Field PdfName PdfName.SHIFT_JIS>
	//   63  120:invokevirtual   #135 <Method boolean PdfName.equals(Object)>
	//   64  123:ifeq            145
_L5:
		obj = ((Object) (new String(((byte []) (obj)), "SJIS")));
	//   65  126:new             #137 <Class String>
	//   66  129:dup             
	//   67  130:aload_2         
	//   68  131:ldc1            #139 <String "SJIS">
	//   69  133:invokespecial   #142 <Method void String(byte[], String)>
	//   70  136:astore_2        
		return ((String) (obj));
	//   71  137:aload_2         
	//   72  138:areturn         
		obj;
	//   73  139:astore_2        
_L8:
		return ((PdfString) (s)).toUnicodeString();
	//   74  140:aload_1         
	//   75  141:invokevirtual   #124 <Method String PdfString.toUnicodeString()>
	//   76  144:areturn         
_L6:
		if(encoding.equals(((Object) (PdfName.UHC))))
	//*  77  145:aload_0         
	//*  78  146:getfield        #118 <Field PdfName encoding>
	//*  79  149:getstatic       #145 <Field PdfName PdfName.UHC>
	//*  80  152:invokevirtual   #135 <Method boolean PdfName.equals(Object)>
	//*  81  155:ifeq            169
			return new String(((byte []) (obj)), "MS949");
	//   82  158:new             #137 <Class String>
	//   83  161:dup             
	//   84  162:aload_2         
	//   85  163:ldc1            #147 <String "MS949">
	//   86  165:invokespecial   #142 <Method void String(byte[], String)>
	//   87  168:areturn         
		if(encoding.equals(((Object) (PdfName.GBK))))
	//*  88  169:aload_0         
	//*  89  170:getfield        #118 <Field PdfName encoding>
	//*  90  173:getstatic       #150 <Field PdfName PdfName.GBK>
	//*  91  176:invokevirtual   #135 <Method boolean PdfName.equals(Object)>
	//*  92  179:ifeq            193
			return new String(((byte []) (obj)), "GBK");
	//   93  182:new             #137 <Class String>
	//   94  185:dup             
	//   95  186:aload_2         
	//   96  187:ldc1            #151 <String "GBK">
	//   97  189:invokespecial   #142 <Method void String(byte[], String)>
	//   98  192:areturn         
		if(encoding.equals(((Object) (PdfName.BIGFIVE))))
	//*  99  193:aload_0         
	//* 100  194:getfield        #118 <Field PdfName encoding>
	//* 101  197:getstatic       #154 <Field PdfName PdfName.BIGFIVE>
	//* 102  200:invokevirtual   #135 <Method boolean PdfName.equals(Object)>
	//* 103  203:ifeq            217
			return new String(((byte []) (obj)), "Big5");
	//  104  206:new             #137 <Class String>
	//  105  209:dup             
	//  106  210:aload_2         
	//  107  211:ldc1            #156 <String "Big5">
	//  108  213:invokespecial   #142 <Method void String(byte[], String)>
	//  109  216:areturn         
		if(!encoding.equals(((Object) (PdfName.UTF_8)))) goto _L8; else goto _L7
	//  110  217:aload_0         
	//  111  218:getfield        #118 <Field PdfName encoding>
	//  112  221:getstatic       #159 <Field PdfName PdfName.UTF_8>
	//  113  224:invokevirtual   #135 <Method boolean PdfName.equals(Object)>
	//  114  227:ifeq            140
_L7:
		obj = ((Object) (new String(((byte []) (obj)), "UTF8")));
	//  115  230:new             #137 <Class String>
	//  116  233:dup             
	//  117  234:aload_2         
	//  118  235:ldc1            #161 <String "UTF8">
	//  119  237:invokespecial   #142 <Method void String(byte[], String)>
	//  120  240:astore_2        
		return ((String) (obj));
	//  121  241:aload_2         
	//  122  242:areturn         
	}

	public HashMap getFields()
	{
		return fields;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field HashMap fields>
	//    2    4:areturn         
	}

	public String getFileSpec()
	{
		return fileSpec;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field String fileSpec>
	//    2    4:areturn         
	}

	protected void kidNode(PdfDictionary pdfdictionary, String s)
	{
		PdfArray pdfarray = pdfdictionary.getAsArray(PdfName.KIDS);
	//    0    0:aload_1         
	//    1    1:getstatic       #173 <Field PdfName PdfName.KIDS>
	//    2    4:invokevirtual   #177 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//    3    7:astore          6
		if(pdfarray == null || pdfarray.isEmpty())
	//*   4    9:aload           6
	//*   5   11:ifnull          22
	//*   6   14:aload           6
	//*   7   16:invokevirtual   #182 <Method boolean PdfArray.isEmpty()>
	//*   8   19:ifeq            51
		{
			String s1 = s;
	//    9   22:aload_2         
	//   10   23:astore          4
			if(s.length() > 0)
	//*  11   25:aload_2         
	//*  12   26:invokevirtual   #185 <Method int String.length()>
	//*  13   29:ifle            39
				s1 = s.substring(1);
	//   14   32:aload_2         
	//   15   33:iconst_1        
	//   16   34:invokevirtual   #189 <Method String String.substring(int)>
	//   17   37:astore          4
			fields.put(((Object) (s1)), ((Object) (pdfdictionary)));
	//   18   39:aload_0         
	//   19   40:getfield        #44  <Field HashMap fields>
	//   20   43:aload           4
	//   21   45:aload_1         
	//   22   46:invokevirtual   #193 <Method Object HashMap.put(Object, Object)>
	//   23   49:pop             
		} else
	//*  24   50:return          
		{
			pdfdictionary.remove(PdfName.KIDS);
	//   25   51:aload_1         
	//   26   52:getstatic       #173 <Field PdfName PdfName.KIDS>
	//   27   55:invokevirtual   #197 <Method void PdfDictionary.remove(PdfName)>
			int i = 0;
	//   28   58:iconst_0        
	//   29   59:istore_3        
			while(i < pdfarray.size()) 
	//*  30   60:iload_3         
	//*  31   61:aload           6
	//*  32   63:invokevirtual   #200 <Method int PdfArray.size()>
	//*  33   66:icmpge          50
			{
				PdfDictionary pdfdictionary1 = new PdfDictionary();
	//   34   69:new             #52  <Class PdfDictionary>
	//   35   72:dup             
	//   36   73:invokespecial   #202 <Method void PdfDictionary()>
	//   37   76:astore          7
				pdfdictionary1.merge(pdfdictionary);
	//   38   78:aload           7
	//   39   80:aload_1         
	//   40   81:invokevirtual   #206 <Method void PdfDictionary.merge(PdfDictionary)>
				PdfDictionary pdfdictionary2 = pdfarray.getAsDict(i);
	//   41   84:aload           6
	//   42   86:iload_3         
	//   43   87:invokevirtual   #209 <Method PdfDictionary PdfArray.getAsDict(int)>
	//   44   90:astore          8
				PdfString pdfstring = pdfdictionary2.getAsString(PdfName.T);
	//   45   92:aload           8
	//   46   94:getstatic       #212 <Field PdfName PdfName.T>
	//   47   97:invokevirtual   #216 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//   48  100:astore          9
				String s2 = s;
	//   49  102:aload_2         
	//   50  103:astore          4
				String s3 = s2;
	//   51  105:aload           4
	//   52  107:astore          5
				if(pdfstring != null)
	//*  53  109:aload           9
	//*  54  111:ifnull          144
					s3 = (new StringBuilder()).append(s2).append(".").append(pdfstring.toUnicodeString()).toString();
	//   55  114:new             #218 <Class StringBuilder>
	//   56  117:dup             
	//   57  118:invokespecial   #219 <Method void StringBuilder()>
	//   58  121:aload           4
	//   59  123:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   60  126:ldc1            #225 <String ".">
	//   61  128:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   62  131:aload           9
	//   63  133:invokevirtual   #124 <Method String PdfString.toUnicodeString()>
	//   64  136:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   65  139:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   66  142:astore          5
				pdfdictionary1.merge(pdfdictionary2);
	//   67  144:aload           7
	//   68  146:aload           8
	//   69  148:invokevirtual   #206 <Method void PdfDictionary.merge(PdfDictionary)>
				pdfdictionary1.remove(PdfName.T);
	//   70  151:aload           7
	//   71  153:getstatic       #212 <Field PdfName PdfName.T>
	//   72  156:invokevirtual   #197 <Method void PdfDictionary.remove(PdfName)>
				kidNode(pdfdictionary1, s3);
	//   73  159:aload_0         
	//   74  160:aload           7
	//   75  162:aload           5
	//   76  164:invokevirtual   #228 <Method void kidNode(PdfDictionary, String)>
				i++;
	//   77  167:iload_3         
	//   78  168:iconst_1        
	//   79  169:iadd            
	//   80  170:istore_3        
			}
		}
	//*  81  171:goto            60
	}

	protected void readFields()
	{
		catalog = trailer.getAsDict(PdfName.ROOT);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #233 <Field PdfDictionary trailer>
	//    3    5:getstatic       #236 <Field PdfName PdfName.ROOT>
	//    4    8:invokevirtual   #79  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//    5   11:putfield        #239 <Field PdfDictionary catalog>
		PdfDictionary pdfdictionary = catalog.getAsDict(PdfName.FDF);
	//    6   14:aload_0         
	//    7   15:getfield        #239 <Field PdfDictionary catalog>
	//    8   18:getstatic       #242 <Field PdfName PdfName.FDF>
	//    9   21:invokevirtual   #79  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   10   24:astore_1        
		if(pdfdictionary != null)
	//*  11   25:aload_1         
	//*  12   26:ifnonnull       30
	//*  13   29:return          
		{
			Object obj = ((Object) (pdfdictionary.getAsString(PdfName.F)));
	//   14   30:aload_1         
	//   15   31:getstatic       #82  <Field PdfName PdfName.F>
	//   16   34:invokevirtual   #216 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//   17   37:astore_2        
			if(obj != null)
	//*  18   38:aload_2         
	//*  19   39:ifnull          50
				fileSpec = ((PdfString) (obj)).toUnicodeString();
	//   20   42:aload_0         
	//   21   43:aload_2         
	//   22   44:invokevirtual   #124 <Method String PdfString.toUnicodeString()>
	//   23   47:putfield        #168 <Field String fileSpec>
			obj = ((Object) (pdfdictionary.getAsArray(PdfName.FIELDS)));
	//   24   50:aload_1         
	//   25   51:getstatic       #245 <Field PdfName PdfName.FIELDS>
	//   26   54:invokevirtual   #177 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   27   57:astore_2        
			if(obj != null)
	//*  28   58:aload_2         
	//*  29   59:ifnull          29
			{
				encoding = pdfdictionary.getAsName(PdfName.ENCODING);
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:getstatic       #248 <Field PdfName PdfName.ENCODING>
	//   33   67:invokevirtual   #252 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   34   70:putfield        #118 <Field PdfName encoding>
				pdfdictionary = new PdfDictionary();
	//   35   73:new             #52  <Class PdfDictionary>
	//   36   76:dup             
	//   37   77:invokespecial   #202 <Method void PdfDictionary()>
	//   38   80:astore_1        
				pdfdictionary.put(PdfName.KIDS, ((PdfObject) (obj)));
	//   39   81:aload_1         
	//   40   82:getstatic       #173 <Field PdfName PdfName.KIDS>
	//   41   85:aload_2         
	//   42   86:invokevirtual   #255 <Method void PdfDictionary.put(PdfName, PdfObject)>
				kidNode(pdfdictionary, "");
	//   43   89:aload_0         
	//   44   90:aload_1         
	//   45   91:ldc2            #257 <String "">
	//   46   94:invokevirtual   #228 <Method void kidNode(PdfDictionary, String)>
				return;
	//   47   97:return          
			}
		}
	}

	protected void readPdf()
		throws IOException
	{
		fields = new HashMap();
	//    0    0:aload_0         
	//    1    1:new             #46  <Class HashMap>
	//    2    4:dup             
	//    3    5:invokespecial   #259 <Method void HashMap()>
	//    4    8:putfield        #44  <Field HashMap fields>
		tokens.checkFdfHeader();
	//    5   11:aload_0         
	//    6   12:getfield        #263 <Field PRTokeniser tokens>
	//    7   15:invokevirtual   #268 <Method void PRTokeniser.checkFdfHeader()>
		rebuildXref();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #271 <Method void rebuildXref()>
		readDocObj();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #274 <Method void readDocObj()>
		readFields();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #276 <Method void readFields()>
	//   14   30:return          
	}

	protected static Counter COUNTER = CounterFactory.getCounter(com/itextpdf/text/pdf/FdfReader);
	PdfName encoding;
	HashMap fields;
	String fileSpec;

	static 
	{
	//    0    0:ldc1            #2   <Class FdfReader>
	//    1    2:invokestatic    #21  <Method Counter CounterFactory.getCounter(Class)>
	//    2    5:putstatic       #23  <Field Counter COUNTER>
	//*   3    8:return          
	}
}
