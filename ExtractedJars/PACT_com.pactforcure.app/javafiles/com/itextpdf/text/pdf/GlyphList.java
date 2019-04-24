// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.io.StreamUtil;
import com.itextpdf.text.pdf.fonts.FontsResourceAnchor;
import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfEncodings

public class GlyphList
{

	public GlyphList()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #144 <Method void Object()>
	//    2    4:return          
	}

	public static int[] nameToUnicode(String s)
	{
		int ai1[] = (int[])names2unicode.get(((Object) (s)));
	//    0    0:getstatic       #22  <Field HashMap names2unicode>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #150 <Method Object HashMap.get(Object)>
	//    3    7:checkcast       #152 <Class int[]>
	//    4   10:astore_3        
		int ai[] = ai1;
	//    5   11:aload_3         
	//    6   12:astore_2        
		if(ai1 == null)
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       61
		{
			ai = ai1;
	//    9   17:aload_3         
	//   10   18:astore_2        
			if(s.length() == 7)
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #155 <Method int String.length()>
	//*  13   23:bipush          7
	//*  14   25:icmpne          61
			{
				ai = ai1;
	//   15   28:aload_3         
	//   16   29:astore_2        
				if(s.toLowerCase().startsWith("uni"))
	//*  17   30:aload_0         
	//*  18   31:invokevirtual   #158 <Method String String.toLowerCase()>
	//*  19   34:ldc1            #160 <String "uni">
	//*  20   36:invokevirtual   #119 <Method boolean String.startsWith(String)>
	//*  21   39:ifeq            61
				{
					int i;
					try
					{
						i = Integer.parseInt(s.substring(3), 16);
	//   22   42:aload_0         
	//   23   43:iconst_3        
	//   24   44:invokevirtual   #164 <Method String String.substring(int)>
	//   25   47:bipush          16
	//   26   49:invokestatic    #168 <Method int Integer.parseInt(String, int)>
	//   27   52:istore_1        
					}
	//*  28   53:iconst_1        
	//*  29   54:newarray        int[]
	//*  30   56:dup             
	//*  31   57:iconst_0        
	//*  32   58:iload_1         
	//*  33   59:iastore         
	//*  34   60:astore_2        
	//*  35   61:aload_2         
	//*  36   62:areturn         
					// Misplaced declaration of an exception variable
					catch(String s)
	//*  37   63:astore_0        
					{
						return ai1;
	//   38   64:aload_3         
	//   39   65:areturn         
					}
					ai = (new int[] {
						i
					});
				}
			}
		}
		return ai;
	}

	public static String unicodeToName(int i)
	{
		return (String)unicode2names.get(((Object) (Integer.valueOf(i))));
	//    0    0:getstatic       #20  <Field HashMap unicode2names>
	//    1    3:iload_0         
	//    2    4:invokestatic    #172 <Method Integer Integer.valueOf(int)>
	//    3    7:invokevirtual   #150 <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #115 <Class String>
	//    5   13:areturn         
	}

	private static HashMap names2unicode;
	private static HashMap unicode2names;

	static 
	{
		Object obj;
		Object obj1;
		unicode2names = new HashMap();
	//    0    0:new             #15  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void HashMap()>
	//    3    7:putstatic       #20  <Field HashMap unicode2names>
		names2unicode = new HashMap();
	//    4   10:new             #15  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #18  <Method void HashMap()>
	//    7   17:putstatic       #22  <Field HashMap names2unicode>
		obj = null;
	//    8   20:aconst_null     
	//    9   21:astore_1        
		obj1 = null;
	//   10   22:aconst_null     
	//   11   23:astore_2        
		Object obj2 = ((Object) (StreamUtil.getResourceStream("com/itextpdf/text/pdf/fonts/glyphlist.txt", ((Object) (new FontsResourceAnchor())).getClass().getClassLoader())));
	//   12   24:ldc1            #24  <String "com/itextpdf/text/pdf/fonts/glyphlist.txt">
	//   13   26:new             #26  <Class FontsResourceAnchor>
	//   14   29:dup             
	//   15   30:invokespecial   #27  <Method void FontsResourceAnchor()>
	//   16   33:invokevirtual   #31  <Method Class Object.getClass()>
	//   17   36:invokevirtual   #37  <Method ClassLoader Class.getClassLoader()>
	//   18   39:invokestatic    #43  <Method InputStream StreamUtil.getResourceStream(String, ClassLoader)>
	//   19   42:astore_3        
		if(obj2 != null) goto _L2; else goto _L1
	//   20   43:aload_3         
	//   21   44:ifnonnull       101
_L1:
		obj1 = obj2;
	//   22   47:aload_3         
	//   23   48:astore_2        
		obj = obj2;
	//   24   49:aload_3         
	//   25   50:astore_1        
		try
		{
			throw new Exception("glyphlist.txt not found as resource. (It must exist as resource in the package com.itextpdf.text.pdf.fonts)");
	//   26   51:new             #13  <Class Exception>
	//   27   54:dup             
	//   28   55:ldc1            #45  <String "glyphlist.txt not found as resource. (It must exist as resource in the package com.itextpdf.text.pdf.fonts)">
	//   29   57:invokespecial   #48  <Method void Exception(String)>
	//   30   60:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj2)
	//*  31   61:astore_3        
		{
			obj = obj1;
	//   32   62:aload_2         
	//   33   63:astore_1        
		}
		System.err.println((new StringBuilder()).append("glyphlist.txt loading error: ").append(((Exception) (obj2)).getMessage()).toString());
	//   34   64:getstatic       #54  <Field PrintStream System.err>
	//   35   67:new             #56  <Class StringBuilder>
	//   36   70:dup             
	//   37   71:invokespecial   #57  <Method void StringBuilder()>
	//   38   74:ldc1            #59  <String "glyphlist.txt loading error: ">
	//   39   76:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   40   79:aload_3         
	//   41   80:invokevirtual   #67  <Method String Exception.getMessage()>
	//   42   83:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   43   86:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   44   89:invokevirtual   #75  <Method void PrintStream.println(String)>
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_100;
	//   45   92:aload_2         
	//   46   93:ifnull          100
		((InputStream) (obj1)).close();
	//   47   96:aload_2         
	//   48   97:invokevirtual   #80  <Method void InputStream.close()>
_L10:
		return;
	//   49  100:return          
_L2:
		obj1 = obj2;
	//   50  101:aload_3         
	//   51  102:astore_2        
		obj = obj2;
	//   52  103:aload_3         
	//   53  104:astore_1        
		byte abyte0[] = new byte[1024];
	//   54  105:sipush          1024
	//   55  108:newarray        byte[]
	//   56  110:astore          4
		obj1 = obj2;
	//   57  112:aload_3         
	//   58  113:astore_2        
		obj = obj2;
	//   59  114:aload_3         
	//   60  115:astore_1        
		Object obj3 = ((Object) (new ByteArrayOutputStream()));
	//   61  116:new             #82  <Class ByteArrayOutputStream>
	//   62  119:dup             
	//   63  120:invokespecial   #83  <Method void ByteArrayOutputStream()>
	//   64  123:astore          5
_L8:
		obj1 = obj2;
	//   65  125:aload_3         
	//   66  126:astore_2        
		obj = obj2;
	//   67  127:aload_3         
	//   68  128:astore_1        
		int i = ((InputStream) (obj2)).read(abyte0);
	//   69  129:aload_3         
	//   70  130:aload           4
	//   71  132:invokevirtual   #87  <Method int InputStream.read(byte[])>
	//   72  135:istore_0        
		if(i >= 0)
			break MISSING_BLOCK_LABEL_346;
	//   73  136:iload_0         
	//   74  137:ifge            346
		obj1 = obj2;
	//   75  140:aload_3         
	//   76  141:astore_2        
		obj = obj2;
	//   77  142:aload_3         
	//   78  143:astore_1        
		((InputStream) (obj2)).close();
	//   79  144:aload_3         
	//   80  145:invokevirtual   #80  <Method void InputStream.close()>
		abyte0 = null;
	//   81  148:aconst_null     
	//   82  149:astore          4
		obj2 = null;
	//   83  151:aconst_null     
	//   84  152:astore_3        
		obj1 = obj2;
	//   85  153:aload_3         
	//   86  154:astore_2        
		obj = ((Object) (abyte0));
	//   87  155:aload           4
	//   88  157:astore_1        
		obj3 = ((Object) (new StringTokenizer(PdfEncodings.convertToString(((ByteArrayOutputStream) (obj3)).toByteArray(), ((String) (null))), "\r\n")));
	//   89  158:new             #89  <Class StringTokenizer>
	//   90  161:dup             
	//   91  162:aload           5
	//   92  164:invokevirtual   #93  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   93  167:aconst_null     
	//   94  168:invokestatic    #99  <Method String PdfEncodings.convertToString(byte[], String)>
	//   95  171:ldc1            #101 <String "\r\n">
	//   96  173:invokespecial   #104 <Method void StringTokenizer(String, String)>
	//   97  176:astore          5
_L4:
		obj1 = obj2;
	//   98  178:aload_3         
	//   99  179:astore_2        
		obj = ((Object) (abyte0));
	//  100  180:aload           4
	//  101  182:astore_1        
		if(!((StringTokenizer) (obj3)).hasMoreTokens())
			break; /* Loop/switch isn't completed */
	//  102  183:aload           5
	//  103  185:invokevirtual   #108 <Method boolean StringTokenizer.hasMoreTokens()>
	//  104  188:ifeq            362
		obj1 = obj2;
	//  105  191:aload_3         
	//  106  192:astore_2        
		obj = ((Object) (abyte0));
	//  107  193:aload           4
	//  108  195:astore_1        
		String s = ((StringTokenizer) (obj3)).nextToken();
	//  109  196:aload           5
	//  110  198:invokevirtual   #111 <Method String StringTokenizer.nextToken()>
	//  111  201:astore          6
		obj1 = obj2;
	//  112  203:aload_3         
	//  113  204:astore_2        
		obj = ((Object) (abyte0));
	//  114  205:aload           4
	//  115  207:astore_1        
		if(s.startsWith("#")) goto _L4; else goto _L3
	//  116  208:aload           6
	//  117  210:ldc1            #113 <String "#">
	//  118  212:invokevirtual   #119 <Method boolean String.startsWith(String)>
	//  119  215:ifne            178
_L3:
		obj1 = obj2;
	//  120  218:aload_3         
	//  121  219:astore_2        
		obj = ((Object) (abyte0));
	//  122  220:aload           4
	//  123  222:astore_1        
		Object obj4 = ((Object) (new StringTokenizer(s, " ;\r\n\t\f")));
	//  124  223:new             #89  <Class StringTokenizer>
	//  125  226:dup             
	//  126  227:aload           6
	//  127  229:ldc1            #121 <String " ;\r\n\t\f">
	//  128  231:invokespecial   #104 <Method void StringTokenizer(String, String)>
	//  129  234:astore          7
		obj1 = obj2;
	//  130  236:aload_3         
	//  131  237:astore_2        
		obj = ((Object) (abyte0));
	//  132  238:aload           4
	//  133  240:astore_1        
		if(!((StringTokenizer) (obj4)).hasMoreTokens()) goto _L4; else goto _L5
	//  134  241:aload           7
	//  135  243:invokevirtual   #108 <Method boolean StringTokenizer.hasMoreTokens()>
	//  136  246:ifeq            178
_L5:
		obj1 = obj2;
	//  137  249:aload_3         
	//  138  250:astore_2        
		obj = ((Object) (abyte0));
	//  139  251:aload           4
	//  140  253:astore_1        
		s = ((StringTokenizer) (obj4)).nextToken();
	//  141  254:aload           7
	//  142  256:invokevirtual   #111 <Method String StringTokenizer.nextToken()>
	//  143  259:astore          6
		obj1 = obj2;
	//  144  261:aload_3         
	//  145  262:astore_2        
		obj = ((Object) (abyte0));
	//  146  263:aload           4
	//  147  265:astore_1        
		if(!((StringTokenizer) (obj4)).hasMoreTokens()) goto _L4; else goto _L6
	//  148  266:aload           7
	//  149  268:invokevirtual   #108 <Method boolean StringTokenizer.hasMoreTokens()>
	//  150  271:ifeq            178
_L6:
		obj1 = obj2;
	//  151  274:aload_3         
	//  152  275:astore_2        
		obj = ((Object) (abyte0));
	//  153  276:aload           4
	//  154  278:astore_1        
		obj4 = ((Object) (Integer.valueOf(((StringTokenizer) (obj4)).nextToken(), 16)));
	//  155  279:aload           7
	//  156  281:invokevirtual   #111 <Method String StringTokenizer.nextToken()>
	//  157  284:bipush          16
	//  158  286:invokestatic    #127 <Method Integer Integer.valueOf(String, int)>
	//  159  289:astore          7
		obj1 = obj2;
	//  160  291:aload_3         
	//  161  292:astore_2        
		obj = ((Object) (abyte0));
	//  162  293:aload           4
	//  163  295:astore_1        
		unicode2names.put(obj4, ((Object) (s)));
	//  164  296:getstatic       #20  <Field HashMap unicode2names>
	//  165  299:aload           7
	//  166  301:aload           6
	//  167  303:invokevirtual   #131 <Method Object HashMap.put(Object, Object)>
	//  168  306:pop             
		obj1 = obj2;
	//  169  307:aload_3         
	//  170  308:astore_2        
		obj = ((Object) (abyte0));
	//  171  309:aload           4
	//  172  311:astore_1        
		names2unicode.put(((Object) (s)), ((Object) (new int[] {
			((Integer) (obj4)).intValue()
		})));
	//  173  312:getstatic       #22  <Field HashMap names2unicode>
	//  174  315:aload           6
	//  175  317:iconst_1        
	//  176  318:newarray        int[]
	//  177  320:dup             
	//  178  321:iconst_0        
	//  179  322:aload           7
	//  180  324:invokevirtual   #135 <Method int Integer.intValue()>
	//  181  327:iastore         
	//  182  328:invokevirtual   #131 <Method Object HashMap.put(Object, Object)>
	//  183  331:pop             
		  goto _L4
	//* 184  332:goto            178
		obj1;
	//  185  335:astore_2        
		Exception exception;
		if(obj != null)
	//* 186  336:aload_1         
	//* 187  337:ifnull          344
			try
			{
				((InputStream) (obj)).close();
	//  188  340:aload_1         
	//  189  341:invokevirtual   #80  <Method void InputStream.close()>
			}
	//* 190  344:aload_2         
	//* 191  345:athrow          
	//* 192  346:aload_3         
	//* 193  347:astore_2        
	//* 194  348:aload_3         
	//* 195  349:astore_1        
	//* 196  350:aload           5
	//* 197  352:aload           4
	//* 198  354:iconst_0        
	//* 199  355:iload_0         
	//* 200  356:invokevirtual   #139 <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//* 201  359:goto            125
	//* 202  362:iconst_0        
	//* 203  363:ifeq            100
	//* 204  366:new             #141 <Class NullPointerException>
	//* 205  369:dup             
	//* 206  370:invokespecial   #142 <Method void NullPointerException()>
	//* 207  373:athrow          
	//* 208  374:astore_1        
	//* 209  375:return          
	//* 210  376:astore_1        
	//* 211  377:return          
			catch(Exception exception1) { }
	//  212  378:astore_1        
		throw obj1;
		obj1 = obj2;
		obj = obj2;
		((ByteArrayOutputStream) (obj3)).write(abyte0, 0, i);
		if(true) goto _L8; else goto _L7
_L7:
		if(true) goto _L10; else goto _L9
_L9:
		try
		{
			throw new NullPointerException();
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return;
		}
		exception;
	//* 213  379:goto            344
	}
}
