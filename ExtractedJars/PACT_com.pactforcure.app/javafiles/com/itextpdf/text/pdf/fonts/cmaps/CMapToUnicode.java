// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.cmaps;

import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Utilities;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.PdfObject;
import com.itextpdf.text.pdf.PdfString;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.fonts.cmaps:
//			AbstractCMap

public class CMapToUnicode extends AbstractCMap
{

	public CMapToUnicode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void AbstractCMap()>
		singleByteMappings = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #14  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void HashMap()>
	//    6   12:putfield        #17  <Field Map singleByteMappings>
		doubleByteMappings = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #14  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #15  <Method void HashMap()>
	//   11   23:putfield        #19  <Field Map doubleByteMappings>
	//   12   26:return          
	}

	private int convertToInt(String s)
		throws IOException
	{
		s = ((String) (s.getBytes("UTF-16BE")));
	//    0    0:aload_1         
	//    1    1:ldc1            #26  <String "UTF-16BE">
	//    2    3:invokevirtual   #32  <Method byte[] String.getBytes(String)>
	//    3    6:astore_1        
		int j = 0;
	//    4    7:iconst_0        
	//    5    8:istore_3        
		for(int i = 0; i < s.length - 1; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_2        
	//*   8   11:iload_2         
	//*   9   12:aload_1         
	//*  10   13:arraylength     
	//*  11   14:iconst_1        
	//*  12   15:isub            
	//*  13   16:icmpge          39
			j = j + (s[i] & 0xff) << 8;
	//   14   19:iload_3         
	//   15   20:aload_1         
	//   16   21:iload_2         
	//   17   22:baload          
	//   18   23:sipush          255
	//   19   26:iand            
	//   20   27:iadd            
	//   21   28:bipush          8
	//   22   30:ishl            
	//   23   31:istore_3        

	//   24   32:iload_2         
	//   25   33:iconst_1        
	//   26   34:iadd            
	//   27   35:istore_2        
	//*  28   36:goto            11
		return j + (s[s.length - 1] & 0xff);
	//   29   39:iload_3         
	//   30   40:aload_1         
	//   31   41:aload_1         
	//   32   42:arraylength     
	//   33   43:iconst_1        
	//   34   44:isub            
	//   35   45:baload          
	//   36   46:sipush          255
	//   37   49:iand            
	//   38   50:iadd            
	//   39   51:ireturn         
	}

	private String createStringFromBytes(byte abyte0[])
		throws IOException
	{
		if(abyte0.length == 1)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:iconst_1        
	//*   3    3:icmpne          15
			return new String(abyte0);
	//    4    6:new             #28  <Class String>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #38  <Method void String(byte[])>
	//    8   14:areturn         
		else
			return new String(abyte0, "UTF-16BE");
	//    9   15:new             #28  <Class String>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:ldc1            #26  <String "UTF-16BE">
	//   13   22:invokespecial   #41  <Method void String(byte[], String)>
	//   14   25:areturn         
	}

	public static CMapToUnicode getIdentity()
	{
		CMapToUnicode cmaptounicode = new CMapToUnicode();
	//    0    0:new             #2   <Class CMapToUnicode>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void CMapToUnicode()>
	//    3    7:astore_1        
		for(int i = 0; i < 0x10001; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_0        
	//*   6   10:iload_0         
	//*   7   11:ldc1            #45  <Int 0x10001>
	//*   8   13:icmpge          32
			cmaptounicode.addChar(i, Utilities.convertFromUtf32(i));
	//    9   16:aload_1         
	//   10   17:iload_0         
	//   11   18:iload_0         
	//   12   19:invokestatic    #51  <Method String Utilities.convertFromUtf32(int)>
	//   13   22:invokevirtual   #55  <Method void addChar(int, String)>

	//   14   25:iload_0         
	//   15   26:iconst_1        
	//   16   27:iadd            
	//   17   28:istore_0        
	//*  18   29:goto            10
		return cmaptounicode;
	//   19   32:aload_1         
	//   20   33:areturn         
	}

	void addChar(int i, String s)
	{
		doubleByteMappings.put(((Object) (Integer.valueOf(i))), ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map doubleByteMappings>
	//    2    4:iload_1         
	//    3    5:invokestatic    #61  <Method Integer Integer.valueOf(int)>
	//    4    8:aload_2         
	//    5    9:invokeinterface #67  <Method Object Map.put(Object, Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	void addChar(PdfString pdfstring, PdfObject pdfobject)
	{
		byte byte0;
		byte byte1;
		try
		{
			pdfstring = ((PdfString) (pdfstring.getBytes()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #75  <Method byte[] PdfString.getBytes()>
	//    2    4:astore_1        
			pdfobject = ((PdfObject) (createStringFromBytes(pdfobject.getBytes())));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #78  <Method byte[] PdfObject.getBytes()>
	//    6   10:invokespecial   #80  <Method String createStringFromBytes(byte[])>
	//    7   13:astore_2        
			if(pdfstring.length == 1)
	//*   8   14:aload_1         
	//*   9   15:arraylength     
	//*  10   16:iconst_1        
	//*  11   17:icmpne          42
			{
				singleByteMappings.put(((Object) (Integer.valueOf(pdfstring[0] & 0xff))), ((Object) (pdfobject)));
	//   12   20:aload_0         
	//   13   21:getfield        #17  <Field Map singleByteMappings>
	//   14   24:aload_1         
	//   15   25:iconst_0        
	//   16   26:baload          
	//   17   27:sipush          255
	//   18   30:iand            
	//   19   31:invokestatic    #61  <Method Integer Integer.valueOf(int)>
	//   20   34:aload_2         
	//   21   35:invokeinterface #67  <Method Object Map.put(Object, Object)>
	//   22   40:pop             
				return;
	//   23   41:return          
			}
		}
	//*  24   42:aload_1         
	//*  25   43:arraylength     
	//*  26   44:iconst_2        
	//*  27   45:icmpne          97
	//*  28   48:aload_1         
	//*  29   49:iconst_0        
	//*  30   50:baload          
	//*  31   51:istore_3        
	//*  32   52:aload_1         
	//*  33   53:iconst_1        
	//*  34   54:baload          
	//*  35   55:istore          4
	//*  36   57:aload_0         
	//*  37   58:getfield        #19  <Field Map doubleByteMappings>
	//*  38   61:iload_3         
	//*  39   62:sipush          255
	//*  40   65:iand            
	//*  41   66:bipush          8
	//*  42   68:ishl            
	//*  43   69:iload           4
	//*  44   71:sipush          255
	//*  45   74:iand            
	//*  46   75:ior             
	//*  47   76:invokestatic    #61  <Method Integer Integer.valueOf(int)>
	//*  48   79:aload_2         
	//*  49   80:invokeinterface #67  <Method Object Map.put(Object, Object)>
	//*  50   85:pop             
	//*  51   86:return          
		// Misplaced declaration of an exception variable
		catch(PdfString pdfstring)
	//*  52   87:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfstring)));
	//   53   88:new             #82  <Class ExceptionConverter>
	//   54   91:dup             
	//   55   92:aload_1         
	//   56   93:invokespecial   #85  <Method void ExceptionConverter(Exception)>
	//   57   96:athrow          
		}
		if(pdfstring.length != 2)
			break MISSING_BLOCK_LABEL_97;
		byte0 = pdfstring[0];
		byte1 = pdfstring[1];
		doubleByteMappings.put(((Object) (Integer.valueOf((byte0 & 0xff) << 8 | byte1 & 0xff))), ((Object) (pdfobject)));
		return;
		throw new IOException(MessageLocalization.getComposedMessage("mapping.code.should.be.1.or.two.bytes.and.not.1", pdfstring.length));
	//   58   97:new             #24  <Class IOException>
	//   59  100:dup             
	//   60  101:ldc1            #87  <String "mapping.code.should.be.1.or.two.bytes.and.not.1">
	//   61  103:aload_1         
	//   62  104:arraylength     
	//   63  105:invokestatic    #93  <Method String MessageLocalization.getComposedMessage(String, int)>
	//   64  108:invokespecial   #96  <Method void IOException(String)>
	//   65  111:athrow          
	}

	public Map createDirectMapping()
		throws IOException
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #14  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void HashMap()>
	//    3    7:astore_1        
		java.util.Map.Entry entry;
		for(Iterator iterator = singleByteMappings.entrySet().iterator(); iterator.hasNext(); ((Map) (hashmap)).put(entry.getKey(), ((Object) (Integer.valueOf(convertToInt((String)entry.getValue()))))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #17  <Field Map singleByteMappings>
	//*   6   12:invokeinterface #102 <Method Set Map.entrySet()>
	//*   7   17:invokeinterface #108 <Method Iterator Set.iterator()>
	//*   8   22:astore_2        
	//*   9   23:aload_2         
	//*  10   24:invokeinterface #114 <Method boolean Iterator.hasNext()>
	//*  11   29:ifeq            74
			entry = (java.util.Map.Entry)iterator.next();
	//   12   32:aload_2         
	//   13   33:invokeinterface #118 <Method Object Iterator.next()>
	//   14   38:checkcast       #120 <Class java.util.Map$Entry>
	//   15   41:astore_3        

	//   16   42:aload_1         
	//   17   43:aload_3         
	//   18   44:invokeinterface #123 <Method Object java.util.Map$Entry.getKey()>
	//   19   49:aload_0         
	//   20   50:aload_3         
	//   21   51:invokeinterface #126 <Method Object java.util.Map$Entry.getValue()>
	//   22   56:checkcast       #28  <Class String>
	//   23   59:invokespecial   #128 <Method int convertToInt(String)>
	//   24   62:invokestatic    #61  <Method Integer Integer.valueOf(int)>
	//   25   65:invokeinterface #67  <Method Object Map.put(Object, Object)>
	//   26   70:pop             
	//*  27   71:goto            23
		java.util.Map.Entry entry1;
		for(Iterator iterator1 = doubleByteMappings.entrySet().iterator(); iterator1.hasNext(); ((Map) (hashmap)).put(entry1.getKey(), ((Object) (Integer.valueOf(convertToInt((String)entry1.getValue()))))))
	//*  28   74:aload_0         
	//*  29   75:getfield        #19  <Field Map doubleByteMappings>
	//*  30   78:invokeinterface #102 <Method Set Map.entrySet()>
	//*  31   83:invokeinterface #108 <Method Iterator Set.iterator()>
	//*  32   88:astore_2        
	//*  33   89:aload_2         
	//*  34   90:invokeinterface #114 <Method boolean Iterator.hasNext()>
	//*  35   95:ifeq            140
			entry1 = (java.util.Map.Entry)iterator1.next();
	//   36   98:aload_2         
	//   37   99:invokeinterface #118 <Method Object Iterator.next()>
	//   38  104:checkcast       #120 <Class java.util.Map$Entry>
	//   39  107:astore_3        

	//   40  108:aload_1         
	//   41  109:aload_3         
	//   42  110:invokeinterface #123 <Method Object java.util.Map$Entry.getKey()>
	//   43  115:aload_0         
	//   44  116:aload_3         
	//   45  117:invokeinterface #126 <Method Object java.util.Map$Entry.getValue()>
	//   46  122:checkcast       #28  <Class String>
	//   47  125:invokespecial   #128 <Method int convertToInt(String)>
	//   48  128:invokestatic    #61  <Method Integer Integer.valueOf(int)>
	//   49  131:invokeinterface #67  <Method Object Map.put(Object, Object)>
	//   50  136:pop             
	//*  51  137:goto            89
		return ((Map) (hashmap));
	//   52  140:aload_1         
	//   53  141:areturn         
	}

	public Map createReverseMapping()
		throws IOException
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #14  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void HashMap()>
	//    3    7:astore_1        
		java.util.Map.Entry entry;
		for(Iterator iterator = singleByteMappings.entrySet().iterator(); iterator.hasNext(); ((Map) (hashmap)).put(((Object) (Integer.valueOf(convertToInt((String)entry.getValue())))), entry.getKey()))
	//*   4    8:aload_0         
	//*   5    9:getfield        #17  <Field Map singleByteMappings>
	//*   6   12:invokeinterface #102 <Method Set Map.entrySet()>
	//*   7   17:invokeinterface #108 <Method Iterator Set.iterator()>
	//*   8   22:astore_2        
	//*   9   23:aload_2         
	//*  10   24:invokeinterface #114 <Method boolean Iterator.hasNext()>
	//*  11   29:ifeq            74
			entry = (java.util.Map.Entry)iterator.next();
	//   12   32:aload_2         
	//   13   33:invokeinterface #118 <Method Object Iterator.next()>
	//   14   38:checkcast       #120 <Class java.util.Map$Entry>
	//   15   41:astore_3        

	//   16   42:aload_1         
	//   17   43:aload_0         
	//   18   44:aload_3         
	//   19   45:invokeinterface #126 <Method Object java.util.Map$Entry.getValue()>
	//   20   50:checkcast       #28  <Class String>
	//   21   53:invokespecial   #128 <Method int convertToInt(String)>
	//   22   56:invokestatic    #61  <Method Integer Integer.valueOf(int)>
	//   23   59:aload_3         
	//   24   60:invokeinterface #123 <Method Object java.util.Map$Entry.getKey()>
	//   25   65:invokeinterface #67  <Method Object Map.put(Object, Object)>
	//   26   70:pop             
	//*  27   71:goto            23
		java.util.Map.Entry entry1;
		for(Iterator iterator1 = doubleByteMappings.entrySet().iterator(); iterator1.hasNext(); ((Map) (hashmap)).put(((Object) (Integer.valueOf(convertToInt((String)entry1.getValue())))), entry1.getKey()))
	//*  28   74:aload_0         
	//*  29   75:getfield        #19  <Field Map doubleByteMappings>
	//*  30   78:invokeinterface #102 <Method Set Map.entrySet()>
	//*  31   83:invokeinterface #108 <Method Iterator Set.iterator()>
	//*  32   88:astore_2        
	//*  33   89:aload_2         
	//*  34   90:invokeinterface #114 <Method boolean Iterator.hasNext()>
	//*  35   95:ifeq            140
			entry1 = (java.util.Map.Entry)iterator1.next();
	//   36   98:aload_2         
	//   37   99:invokeinterface #118 <Method Object Iterator.next()>
	//   38  104:checkcast       #120 <Class java.util.Map$Entry>
	//   39  107:astore_3        

	//   40  108:aload_1         
	//   41  109:aload_0         
	//   42  110:aload_3         
	//   43  111:invokeinterface #126 <Method Object java.util.Map$Entry.getValue()>
	//   44  116:checkcast       #28  <Class String>
	//   45  119:invokespecial   #128 <Method int convertToInt(String)>
	//   46  122:invokestatic    #61  <Method Integer Integer.valueOf(int)>
	//   47  125:aload_3         
	//   48  126:invokeinterface #123 <Method Object java.util.Map$Entry.getKey()>
	//   49  131:invokeinterface #67  <Method Object Map.put(Object, Object)>
	//   50  136:pop             
	//*  51  137:goto            89
		return ((Map) (hashmap));
	//   52  140:aload_1         
	//   53  141:areturn         
	}

	public boolean hasOneByteMappings()
	{
		return !singleByteMappings.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Map singleByteMappings>
	//    2    4:invokeinterface #135 <Method boolean Map.isEmpty()>
	//    3    9:ifne            14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	public boolean hasTwoByteMappings()
	{
		return !doubleByteMappings.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map doubleByteMappings>
	//    2    4:invokeinterface #135 <Method boolean Map.isEmpty()>
	//    3    9:ifne            14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	public String lookup(byte abyte0[], int i, int j)
	{
		String s = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		if(j == 1)
	//*   2    3:iload_3         
	//*   3    4:iconst_1        
	//*   4    5:icmpne          37
		{
			i = ((int) (abyte0[i]));
	//    5    8:aload_1         
	//    6    9:iload_2         
	//    7   10:baload          
	//    8   11:istore_2        
			s = (String)singleByteMappings.get(((Object) (Integer.valueOf(i & 0xff))));
	//    9   12:aload_0         
	//   10   13:getfield        #17  <Field Map singleByteMappings>
	//   11   16:iload_2         
	//   12   17:sipush          255
	//   13   20:iand            
	//   14   21:invokestatic    #61  <Method Integer Integer.valueOf(int)>
	//   15   24:invokeinterface #142 <Method Object Map.get(Object)>
	//   16   29:checkcast       #28  <Class String>
	//   17   32:astore          4
		} else
	//*  18   34:aload           4
	//*  19   36:areturn         
		if(j == 2)
	//*  20   37:iload_3         
	//*  21   38:iconst_2        
	//*  22   39:icmpne          34
		{
			j = ((int) (abyte0[i]));
	//   23   42:aload_1         
	//   24   43:iload_2         
	//   25   44:baload          
	//   26   45:istore_3        
			i = ((int) (abyte0[i + 1]));
	//   27   46:aload_1         
	//   28   47:iload_2         
	//   29   48:iconst_1        
	//   30   49:iadd            
	//   31   50:baload          
	//   32   51:istore_2        
			return (String)doubleByteMappings.get(((Object) (Integer.valueOf(((j & 0xff) << 8) + (i & 0xff)))));
	//   33   52:aload_0         
	//   34   53:getfield        #19  <Field Map doubleByteMappings>
	//   35   56:iload_3         
	//   36   57:sipush          255
	//   37   60:iand            
	//   38   61:bipush          8
	//   39   63:ishl            
	//   40   64:iload_2         
	//   41   65:sipush          255
	//   42   68:iand            
	//   43   69:iadd            
	//   44   70:invokestatic    #61  <Method Integer Integer.valueOf(int)>
	//   45   73:invokeinterface #142 <Method Object Map.get(Object)>
	//   46   78:checkcast       #28  <Class String>
	//   47   81:areturn         
		}
		return s;
	}

	private Map doubleByteMappings;
	private Map singleByteMappings;
}
