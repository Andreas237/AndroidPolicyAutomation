// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.log.Level;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.BaseFont;
import java.io.File;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text:
//			FontProvider, DocumentException, Font, ExceptionConverter, 
//			BaseColor

public class FontFactoryImp
	implements FontProvider
{

	public FontFactoryImp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #47  <Class Hashtable>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void Hashtable()>
	//    6   12:putfield        #50  <Field Hashtable trueTypeFonts>
	//    7   15:aload_0         
	//    8   16:new             #47  <Class Hashtable>
	//    9   19:dup             
	//   10   20:invokespecial   #48  <Method void Hashtable()>
	//   11   23:putfield        #52  <Field Hashtable fontFamilies>
		defaultEncoding = "Cp1252";
	//   12   26:aload_0         
	//   13   27:ldc1            #54  <String "Cp1252">
	//   14   29:putfield        #56  <Field String defaultEncoding>
		defaultEmbedding = false;
	//   15   32:aload_0         
	//   16   33:iconst_0        
	//   17   34:putfield        #58  <Field boolean defaultEmbedding>
		trueTypeFonts.put(((Object) ("Courier".toLowerCase())), "Courier");
	//   18   37:aload_0         
	//   19   38:getfield        #50  <Field Hashtable trueTypeFonts>
	//   20   41:ldc1            #60  <String "Courier">
	//   21   43:invokevirtual   #64  <Method String String.toLowerCase()>
	//   22   46:ldc1            #60  <String "Courier">
	//   23   48:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   24   51:pop             
		trueTypeFonts.put(((Object) ("Courier-Bold".toLowerCase())), "Courier-Bold");
	//   25   52:aload_0         
	//   26   53:getfield        #50  <Field Hashtable trueTypeFonts>
	//   27   56:ldc1            #70  <String "Courier-Bold">
	//   28   58:invokevirtual   #64  <Method String String.toLowerCase()>
	//   29   61:ldc1            #70  <String "Courier-Bold">
	//   30   63:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   31   66:pop             
		trueTypeFonts.put(((Object) ("Courier-Oblique".toLowerCase())), "Courier-Oblique");
	//   32   67:aload_0         
	//   33   68:getfield        #50  <Field Hashtable trueTypeFonts>
	//   34   71:ldc1            #72  <String "Courier-Oblique">
	//   35   73:invokevirtual   #64  <Method String String.toLowerCase()>
	//   36   76:ldc1            #72  <String "Courier-Oblique">
	//   37   78:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   38   81:pop             
		trueTypeFonts.put(((Object) ("Courier-BoldOblique".toLowerCase())), "Courier-BoldOblique");
	//   39   82:aload_0         
	//   40   83:getfield        #50  <Field Hashtable trueTypeFonts>
	//   41   86:ldc1            #74  <String "Courier-BoldOblique">
	//   42   88:invokevirtual   #64  <Method String String.toLowerCase()>
	//   43   91:ldc1            #74  <String "Courier-BoldOblique">
	//   44   93:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   45   96:pop             
		trueTypeFonts.put(((Object) ("Helvetica".toLowerCase())), "Helvetica");
	//   46   97:aload_0         
	//   47   98:getfield        #50  <Field Hashtable trueTypeFonts>
	//   48  101:ldc1            #76  <String "Helvetica">
	//   49  103:invokevirtual   #64  <Method String String.toLowerCase()>
	//   50  106:ldc1            #76  <String "Helvetica">
	//   51  108:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   52  111:pop             
		trueTypeFonts.put(((Object) ("Helvetica-Bold".toLowerCase())), "Helvetica-Bold");
	//   53  112:aload_0         
	//   54  113:getfield        #50  <Field Hashtable trueTypeFonts>
	//   55  116:ldc1            #78  <String "Helvetica-Bold">
	//   56  118:invokevirtual   #64  <Method String String.toLowerCase()>
	//   57  121:ldc1            #78  <String "Helvetica-Bold">
	//   58  123:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   59  126:pop             
		trueTypeFonts.put(((Object) ("Helvetica-Oblique".toLowerCase())), "Helvetica-Oblique");
	//   60  127:aload_0         
	//   61  128:getfield        #50  <Field Hashtable trueTypeFonts>
	//   62  131:ldc1            #80  <String "Helvetica-Oblique">
	//   63  133:invokevirtual   #64  <Method String String.toLowerCase()>
	//   64  136:ldc1            #80  <String "Helvetica-Oblique">
	//   65  138:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   66  141:pop             
		trueTypeFonts.put(((Object) ("Helvetica-BoldOblique".toLowerCase())), "Helvetica-BoldOblique");
	//   67  142:aload_0         
	//   68  143:getfield        #50  <Field Hashtable trueTypeFonts>
	//   69  146:ldc1            #82  <String "Helvetica-BoldOblique">
	//   70  148:invokevirtual   #64  <Method String String.toLowerCase()>
	//   71  151:ldc1            #82  <String "Helvetica-BoldOblique">
	//   72  153:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   73  156:pop             
		trueTypeFonts.put(((Object) ("Symbol".toLowerCase())), "Symbol");
	//   74  157:aload_0         
	//   75  158:getfield        #50  <Field Hashtable trueTypeFonts>
	//   76  161:ldc1            #84  <String "Symbol">
	//   77  163:invokevirtual   #64  <Method String String.toLowerCase()>
	//   78  166:ldc1            #84  <String "Symbol">
	//   79  168:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   80  171:pop             
		trueTypeFonts.put(((Object) ("Times-Roman".toLowerCase())), "Times-Roman");
	//   81  172:aload_0         
	//   82  173:getfield        #50  <Field Hashtable trueTypeFonts>
	//   83  176:ldc1            #86  <String "Times-Roman">
	//   84  178:invokevirtual   #64  <Method String String.toLowerCase()>
	//   85  181:ldc1            #86  <String "Times-Roman">
	//   86  183:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   87  186:pop             
		trueTypeFonts.put(((Object) ("Times-Bold".toLowerCase())), "Times-Bold");
	//   88  187:aload_0         
	//   89  188:getfield        #50  <Field Hashtable trueTypeFonts>
	//   90  191:ldc1            #88  <String "Times-Bold">
	//   91  193:invokevirtual   #64  <Method String String.toLowerCase()>
	//   92  196:ldc1            #88  <String "Times-Bold">
	//   93  198:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   94  201:pop             
		trueTypeFonts.put(((Object) ("Times-Italic".toLowerCase())), "Times-Italic");
	//   95  202:aload_0         
	//   96  203:getfield        #50  <Field Hashtable trueTypeFonts>
	//   97  206:ldc1            #90  <String "Times-Italic">
	//   98  208:invokevirtual   #64  <Method String String.toLowerCase()>
	//   99  211:ldc1            #90  <String "Times-Italic">
	//  100  213:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//  101  216:pop             
		trueTypeFonts.put(((Object) ("Times-BoldItalic".toLowerCase())), "Times-BoldItalic");
	//  102  217:aload_0         
	//  103  218:getfield        #50  <Field Hashtable trueTypeFonts>
	//  104  221:ldc1            #92  <String "Times-BoldItalic">
	//  105  223:invokevirtual   #64  <Method String String.toLowerCase()>
	//  106  226:ldc1            #92  <String "Times-BoldItalic">
	//  107  228:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//  108  231:pop             
		trueTypeFonts.put(((Object) ("ZapfDingbats".toLowerCase())), "ZapfDingbats");
	//  109  232:aload_0         
	//  110  233:getfield        #50  <Field Hashtable trueTypeFonts>
	//  111  236:ldc1            #94  <String "ZapfDingbats">
	//  112  238:invokevirtual   #64  <Method String String.toLowerCase()>
	//  113  241:ldc1            #94  <String "ZapfDingbats">
	//  114  243:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//  115  246:pop             
		ArrayList arraylist = new ArrayList();
	//  116  247:new             #96  <Class ArrayList>
	//  117  250:dup             
	//  118  251:invokespecial   #97  <Method void ArrayList()>
	//  119  254:astore_1        
		arraylist.add("Courier");
	//  120  255:aload_1         
	//  121  256:ldc1            #60  <String "Courier">
	//  122  258:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//  123  261:pop             
		arraylist.add("Courier-Bold");
	//  124  262:aload_1         
	//  125  263:ldc1            #70  <String "Courier-Bold">
	//  126  265:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//  127  268:pop             
		arraylist.add("Courier-Oblique");
	//  128  269:aload_1         
	//  129  270:ldc1            #72  <String "Courier-Oblique">
	//  130  272:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//  131  275:pop             
		arraylist.add("Courier-BoldOblique");
	//  132  276:aload_1         
	//  133  277:ldc1            #74  <String "Courier-BoldOblique">
	//  134  279:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//  135  282:pop             
		fontFamilies.put(((Object) ("Courier".toLowerCase())), ((Object) (arraylist)));
	//  136  283:aload_0         
	//  137  284:getfield        #52  <Field Hashtable fontFamilies>
	//  138  287:ldc1            #60  <String "Courier">
	//  139  289:invokevirtual   #64  <Method String String.toLowerCase()>
	//  140  292:aload_1         
	//  141  293:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//  142  296:pop             
		arraylist = new ArrayList();
	//  143  297:new             #96  <Class ArrayList>
	//  144  300:dup             
	//  145  301:invokespecial   #97  <Method void ArrayList()>
	//  146  304:astore_1        
		arraylist.add("Helvetica");
	//  147  305:aload_1         
	//  148  306:ldc1            #76  <String "Helvetica">
	//  149  308:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//  150  311:pop             
		arraylist.add("Helvetica-Bold");
	//  151  312:aload_1         
	//  152  313:ldc1            #78  <String "Helvetica-Bold">
	//  153  315:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//  154  318:pop             
		arraylist.add("Helvetica-Oblique");
	//  155  319:aload_1         
	//  156  320:ldc1            #80  <String "Helvetica-Oblique">
	//  157  322:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//  158  325:pop             
		arraylist.add("Helvetica-BoldOblique");
	//  159  326:aload_1         
	//  160  327:ldc1            #82  <String "Helvetica-BoldOblique">
	//  161  329:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//  162  332:pop             
		fontFamilies.put(((Object) ("Helvetica".toLowerCase())), ((Object) (arraylist)));
	//  163  333:aload_0         
	//  164  334:getfield        #52  <Field Hashtable fontFamilies>
	//  165  337:ldc1            #76  <String "Helvetica">
	//  166  339:invokevirtual   #64  <Method String String.toLowerCase()>
	//  167  342:aload_1         
	//  168  343:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//  169  346:pop             
		arraylist = new ArrayList();
	//  170  347:new             #96  <Class ArrayList>
	//  171  350:dup             
	//  172  351:invokespecial   #97  <Method void ArrayList()>
	//  173  354:astore_1        
		arraylist.add("Symbol");
	//  174  355:aload_1         
	//  175  356:ldc1            #84  <String "Symbol">
	//  176  358:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//  177  361:pop             
		fontFamilies.put(((Object) ("Symbol".toLowerCase())), ((Object) (arraylist)));
	//  178  362:aload_0         
	//  179  363:getfield        #52  <Field Hashtable fontFamilies>
	//  180  366:ldc1            #84  <String "Symbol">
	//  181  368:invokevirtual   #64  <Method String String.toLowerCase()>
	//  182  371:aload_1         
	//  183  372:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//  184  375:pop             
		arraylist = new ArrayList();
	//  185  376:new             #96  <Class ArrayList>
	//  186  379:dup             
	//  187  380:invokespecial   #97  <Method void ArrayList()>
	//  188  383:astore_1        
		arraylist.add("Times-Roman");
	//  189  384:aload_1         
	//  190  385:ldc1            #86  <String "Times-Roman">
	//  191  387:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//  192  390:pop             
		arraylist.add("Times-Bold");
	//  193  391:aload_1         
	//  194  392:ldc1            #88  <String "Times-Bold">
	//  195  394:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//  196  397:pop             
		arraylist.add("Times-Italic");
	//  197  398:aload_1         
	//  198  399:ldc1            #90  <String "Times-Italic">
	//  199  401:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//  200  404:pop             
		arraylist.add("Times-BoldItalic");
	//  201  405:aload_1         
	//  202  406:ldc1            #92  <String "Times-BoldItalic">
	//  203  408:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//  204  411:pop             
		fontFamilies.put(((Object) ("Times".toLowerCase())), ((Object) (arraylist)));
	//  205  412:aload_0         
	//  206  413:getfield        #52  <Field Hashtable fontFamilies>
	//  207  416:ldc1            #103 <String "Times">
	//  208  418:invokevirtual   #64  <Method String String.toLowerCase()>
	//  209  421:aload_1         
	//  210  422:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//  211  425:pop             
		fontFamilies.put(((Object) ("Times-Roman".toLowerCase())), ((Object) (arraylist)));
	//  212  426:aload_0         
	//  213  427:getfield        #52  <Field Hashtable fontFamilies>
	//  214  430:ldc1            #86  <String "Times-Roman">
	//  215  432:invokevirtual   #64  <Method String String.toLowerCase()>
	//  216  435:aload_1         
	//  217  436:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//  218  439:pop             
		arraylist = new ArrayList();
	//  219  440:new             #96  <Class ArrayList>
	//  220  443:dup             
	//  221  444:invokespecial   #97  <Method void ArrayList()>
	//  222  447:astore_1        
		arraylist.add("ZapfDingbats");
	//  223  448:aload_1         
	//  224  449:ldc1            #94  <String "ZapfDingbats">
	//  225  451:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//  226  454:pop             
		fontFamilies.put(((Object) ("ZapfDingbats".toLowerCase())), ((Object) (arraylist)));
	//  227  455:aload_0         
	//  228  456:getfield        #52  <Field Hashtable fontFamilies>
	//  229  459:ldc1            #94  <String "ZapfDingbats">
	//  230  461:invokevirtual   #64  <Method String String.toLowerCase()>
	//  231  464:aload_1         
	//  232  465:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//  233  468:pop             
	//  234  469:return          
	}

	protected BaseFont getBaseFont(String s, String s1, boolean flag, boolean flag1)
		throws IOException, DocumentException
	{
		BaseFont basefont = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		BaseFont basefont1 = BaseFont.createFont(s, s1, flag, flag1, ((byte []) (null)), ((byte []) (null)), true);
	//    2    3:aload_1         
	//    3    4:aload_2         
	//    4    5:iload_3         
	//    5    6:iload           4
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:iconst_1        
	//    9   11:invokestatic    #115 <Method BaseFont BaseFont.createFont(String, String, boolean, boolean, byte[], byte[], boolean)>
	//   10   14:astore          6
		basefont = basefont1;
	//   11   16:aload           6
	//   12   18:astore          5
_L2:
		BaseFont basefont2 = basefont;
	//   13   20:aload           5
	//   14   22:astore          6
		if(basefont == null)
	//*  15   24:aload           5
	//*  16   26:ifnonnull       64
		{
			s = (String)trueTypeFonts.get(((Object) (s.toLowerCase())));
	//   17   29:aload_0         
	//   18   30:getfield        #50  <Field Hashtable trueTypeFonts>
	//   19   33:aload_1         
	//   20   34:invokevirtual   #64  <Method String String.toLowerCase()>
	//   21   37:invokevirtual   #119 <Method Object Hashtable.get(Object)>
	//   22   40:checkcast       #31  <Class String>
	//   23   43:astore_1        
			basefont2 = basefont;
	//   24   44:aload           5
	//   25   46:astore          6
			if(s != null)
	//*  26   48:aload_1         
	//*  27   49:ifnull          64
				basefont2 = BaseFont.createFont(s, s1, flag, flag1, ((byte []) (null)), ((byte []) (null)));
	//   28   52:aload_1         
	//   29   53:aload_2         
	//   30   54:iload_3         
	//   31   55:iload           4
	//   32   57:aconst_null     
	//   33   58:aconst_null     
	//   34   59:invokestatic    #122 <Method BaseFont BaseFont.createFont(String, String, boolean, boolean, byte[], byte[])>
	//   35   62:astore          6
		}
		return basefont2;
	//   36   64:aload           6
	//   37   66:areturn         
		DocumentException documentexception;
		documentexception;
	//   38   67:astore          6
		if(true) goto _L2; else goto _L1
	//   39   69:goto            20
_L1:
	}

	public Font getFont(String s)
	{
		return getFont(s, defaultEncoding, defaultEmbedding, -1F, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #56  <Field String defaultEncoding>
	//    4    6:aload_0         
	//    5    7:getfield        #58  <Field boolean defaultEmbedding>
	//    6   10:ldc1            #126 <Float -1F>
	//    7   12:iconst_m1       
	//    8   13:aconst_null     
	//    9   14:invokevirtual   #129 <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//   10   17:areturn         
	}

	public Font getFont(String s, float f)
	{
		return getFont(s, defaultEncoding, defaultEmbedding, f, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #56  <Field String defaultEncoding>
	//    4    6:aload_0         
	//    5    7:getfield        #58  <Field boolean defaultEmbedding>
	//    6   10:fload_2         
	//    7   11:iconst_m1       
	//    8   12:aconst_null     
	//    9   13:invokevirtual   #129 <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//   10   16:areturn         
	}

	public Font getFont(String s, float f, int i)
	{
		return getFont(s, defaultEncoding, defaultEmbedding, f, i, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #56  <Field String defaultEncoding>
	//    4    6:aload_0         
	//    5    7:getfield        #58  <Field boolean defaultEmbedding>
	//    6   10:fload_2         
	//    7   11:iload_3         
	//    8   12:aconst_null     
	//    9   13:invokevirtual   #129 <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//   10   16:areturn         
	}

	public Font getFont(String s, float f, int i, BaseColor basecolor)
	{
		return getFont(s, defaultEncoding, defaultEmbedding, f, i, basecolor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #56  <Field String defaultEncoding>
	//    4    6:aload_0         
	//    5    7:getfield        #58  <Field boolean defaultEmbedding>
	//    6   10:fload_2         
	//    7   11:iload_3         
	//    8   12:aload           4
	//    9   14:invokevirtual   #129 <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//   10   17:areturn         
	}

	public Font getFont(String s, float f, BaseColor basecolor)
	{
		return getFont(s, defaultEncoding, defaultEmbedding, f, -1, basecolor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #56  <Field String defaultEncoding>
	//    4    6:aload_0         
	//    5    7:getfield        #58  <Field boolean defaultEmbedding>
	//    6   10:fload_2         
	//    7   11:iconst_m1       
	//    8   12:aload_3         
	//    9   13:invokevirtual   #129 <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//   10   16:areturn         
	}

	public Font getFont(String s, String s1)
	{
		return getFont(s, s1, defaultEmbedding, -1F, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #58  <Field boolean defaultEmbedding>
	//    5    7:ldc1            #126 <Float -1F>
	//    6    9:iconst_m1       
	//    7   10:aconst_null     
	//    8   11:invokevirtual   #129 <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    9   14:areturn         
	}

	public Font getFont(String s, String s1, float f)
	{
		return getFont(s, s1, defaultEmbedding, f, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #58  <Field boolean defaultEmbedding>
	//    5    7:fload_3         
	//    6    8:iconst_m1       
	//    7    9:aconst_null     
	//    8   10:invokevirtual   #129 <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    9   13:areturn         
	}

	public Font getFont(String s, String s1, float f, int i)
	{
		return getFont(s, s1, defaultEmbedding, f, i, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #58  <Field boolean defaultEmbedding>
	//    5    7:fload_3         
	//    6    8:iload           4
	//    7   10:aconst_null     
	//    8   11:invokevirtual   #129 <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    9   14:areturn         
	}

	public Font getFont(String s, String s1, float f, int i, BaseColor basecolor)
	{
		return getFont(s, s1, defaultEmbedding, f, i, basecolor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #58  <Field boolean defaultEmbedding>
	//    5    7:fload_3         
	//    6    8:iload           4
	//    7   10:aload           5
	//    8   12:invokevirtual   #129 <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    9   15:areturn         
	}

	public Font getFont(String s, String s1, boolean flag)
	{
		return getFont(s, s1, flag, -1F, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:ldc1            #126 <Float -1F>
	//    5    6:iconst_m1       
	//    6    7:aconst_null     
	//    7    8:invokevirtual   #129 <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    8   11:areturn         
	}

	public Font getFont(String s, String s1, boolean flag, float f)
	{
		return getFont(s, s1, flag, f, -1, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:fload           4
	//    5    6:iconst_m1       
	//    6    7:aconst_null     
	//    7    8:invokevirtual   #129 <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    8   11:areturn         
	}

	public Font getFont(String s, String s1, boolean flag, float f, int i)
	{
		return getFont(s, s1, flag, f, i, ((BaseColor) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:fload           4
	//    5    6:iload           5
	//    6    8:aconst_null     
	//    7    9:invokevirtual   #129 <Method Font getFont(String, String, boolean, float, int, BaseColor)>
	//    8   12:areturn         
	}

	public Font getFont(String s, String s1, boolean flag, float f, int i, BaseColor basecolor)
	{
		return getFont(s, s1, flag, f, i, basecolor, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:fload           4
	//    5    6:iload           5
	//    6    8:aload           6
	//    7   10:iconst_1        
	//    8   11:invokevirtual   #143 <Method Font getFont(String, String, boolean, float, int, BaseColor, boolean)>
	//    9   14:areturn         
	}

	public Font getFont(String s, String s1, boolean flag, float f, int i, BaseColor basecolor, boolean flag1)
	{
		int j;
		String s2;
		ArrayList arraylist;
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       21
			return new Font(Font.FontFamily.UNDEFINED, f, i, basecolor);
	//    2    4:new             #147 <Class Font>
	//    3    7:dup             
	//    4    8:getstatic       #153 <Field Font$FontFamily Font$FontFamily.UNDEFINED>
	//    5   11:fload           4
	//    6   13:iload           5
	//    7   15:aload           6
	//    8   17:invokespecial   #156 <Method void Font(Font$FontFamily, float, int, BaseColor)>
	//    9   20:areturn         
		s2 = s.toLowerCase();
	//   10   21:aload_1         
	//   11   22:invokevirtual   #64  <Method String String.toLowerCase()>
	//   12   25:astore          13
		arraylist = (ArrayList)fontFamilies.get(((Object) (s2)));
	//   13   27:aload_0         
	//   14   28:getfield        #52  <Field Hashtable fontFamilies>
	//   15   31:aload           13
	//   16   33:invokevirtual   #119 <Method Object Hashtable.get(Object)>
	//   17   36:checkcast       #96  <Class ArrayList>
	//   18   39:astore          14
		s2 = s;
	//   19   41:aload_1         
	//   20   42:astore          13
		j = i;
	//   21   44:iload           5
	//   22   46:istore          8
		if(arraylist == null) goto _L2; else goto _L1
	//   23   48:aload           14
	//   24   50:ifnull          165
_L1:
		arraylist;
	//   25   53:aload           14
		JVM INSTR monitorenter ;
	//   26   55:monitorenter    
		int k;
		int l;
		boolean flag2;
		boolean flag3;
		Iterator iterator;
		String s3;
		if(i == -1)
	//*  27   56:iload           5
	//*  28   58:iconst_m1       
	//*  29   59:icmpne          209
			l = 0;
	//   30   62:iconst_0        
	//   31   63:istore          10
		else
	//*  32   65:iconst_0        
	//*  33   66:istore          9
	//*  34   68:iconst_0        
	//*  35   69:istore          12
	//*  36   71:aload           14
	//*  37   73:invokevirtual   #160 <Method Iterator ArrayList.iterator()>
	//*  38   76:astore          15
	//*  39   78:iload           12
	//*  40   80:istore          11
	//*  41   82:aload_1         
	//*  42   83:astore          13
	//*  43   85:aload           15
	//*  44   87:invokeinterface #166 <Method boolean Iterator.hasNext()>
	//*  45   92:ifeq            299
	//*  46   95:aload           15
	//*  47   97:invokeinterface #170 <Method Object Iterator.next()>
	//*  48  102:checkcast       #31  <Class String>
	//*  49  105:astore          13
	//*  50  107:aload           13
	//*  51  109:invokevirtual   #64  <Method String String.toLowerCase()>
	//*  52  112:astore          16
	//*  53  114:iconst_0        
	//*  54  115:istore          9
	//*  55  117:aload           16
	//*  56  119:ldc1            #172 <String "bold">
	//*  57  121:invokevirtual   #176 <Method int String.indexOf(String)>
	//*  58  124:iconst_m1       
	//*  59  125:icmpeq          133
	//*  60  128:iconst_0        
	//*  61  129:iconst_1        
	//*  62  130:ior             
	//*  63  131:istore          9
	//*  64  133:aload           16
	//*  65  135:ldc1            #178 <String "italic">
	//*  66  137:invokevirtual   #176 <Method int String.indexOf(String)>
	//*  67  140:iconst_m1       
	//*  68  141:icmpne          273
	//*  69  144:iload           9
	//*  70  146:istore          8
	//*  71  148:aload           16
	//*  72  150:ldc1            #180 <String "oblique">
	//*  73  152:invokevirtual   #176 <Method int String.indexOf(String)>
	//*  74  155:iconst_m1       
	//*  75  156:icmpeq          279
	//*  76  159:goto            273
	//*  77  162:aload           14
	//*  78  164:monitorexit     
	//*  79  165:aload_0         
	//*  80  166:aload           13
	//*  81  168:aload_2         
	//*  82  169:iload_3         
	//*  83  170:iload           7
	//*  84  172:invokevirtual   #182 <Method BaseFont getBaseFont(String, String, boolean, boolean)>
	//*  85  175:astore_1        
	//*  86  176:aload_1         
	//*  87  177:ifnonnull       258
	//*  88  180:new             #147 <Class Font>
	//*  89  183:dup             
	//*  90  184:getstatic       #153 <Field Font$FontFamily Font$FontFamily.UNDEFINED>
	//*  91  187:fload           4
	//*  92  189:iload           8
	//*  93  191:aload           6
	//*  94  193:invokespecial   #156 <Method void Font(Font$FontFamily, float, int, BaseColor)>
	//*  95  196:astore_1        
	//*  96  197:aload_1         
	//*  97  198:areturn         
	//*  98  199:astore_1        
	//*  99  200:new             #184 <Class ExceptionConverter>
	//* 100  203:dup             
	//* 101  204:aload_1         
	//* 102  205:invokespecial   #187 <Method void ExceptionConverter(Exception)>
	//* 103  208:athrow          
			l = i;
	//  104  209:iload           5
	//  105  211:istore          10
		k = 0;
		flag3 = false;
		iterator = arraylist.iterator();
_L7:
		flag2 = flag3;
		s2 = s;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_299;
		s2 = (String)iterator.next();
		s3 = s2.toLowerCase();
		k = 0;
		if(s3.indexOf("bold") != -1)
			k = ((int) (false | true));
		if(s3.indexOf("italic") != -1) goto _L4; else goto _L3
_L3:
		j = k;
		if(s3.indexOf("oblique") == -1) goto _L5; else goto _L4
_L8:
		arraylist;
		JVM INSTR monitorexit ;
_L2:
		try
		{
			s = ((String) (getBaseFont(s2, s1, flag, flag1)));
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new ExceptionConverter(((Exception) (s)));
		}
	//* 106  213:goto            65
	//* 107  216:astore_1        
	//* 108  217:aload           14
	//* 109  219:monitorexit     
	//* 110  220:aload_1         
	//* 111  221:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 112  222:astore_1        
		{
			return new Font(Font.FontFamily.UNDEFINED, f, j, basecolor);
	//  113  223:new             #147 <Class Font>
	//  114  226:dup             
	//  115  227:getstatic       #153 <Field Font$FontFamily Font$FontFamily.UNDEFINED>
	//  116  230:fload           4
	//  117  232:iload           8
	//  118  234:aload           6
	//  119  236:invokespecial   #156 <Method void Font(Font$FontFamily, float, int, BaseColor)>
	//  120  239:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 121  240:astore_1        
		{
			return new Font(Font.FontFamily.UNDEFINED, f, j, basecolor);
	//  122  241:new             #147 <Class Font>
	//  123  244:dup             
	//  124  245:getstatic       #153 <Field Font$FontFamily Font$FontFamily.UNDEFINED>
	//  125  248:fload           4
	//  126  250:iload           8
	//  127  252:aload           6
	//  128  254:invokespecial   #156 <Method void Font(Font$FontFamily, float, int, BaseColor)>
	//  129  257:areturn         
		}
		if(s != null)
			break MISSING_BLOCK_LABEL_258;
		s = ((String) (new Font(Font.FontFamily.UNDEFINED, f, j, basecolor)));
		return ((Font) (s));
		s;
		arraylist;
		JVM INSTR monitorexit ;
		throw s;
		return new Font(((BaseFont) (s)), f, j, basecolor);
	//  130  258:new             #147 <Class Font>
	//  131  261:dup             
	//  132  262:aload_1         
	//  133  263:fload           4
	//  134  265:iload           8
	//  135  267:aload           6
	//  136  269:invokespecial   #190 <Method void Font(BaseFont, float, int, BaseColor)>
	//  137  272:areturn         
_L4:
		j = k | 2;
	//  138  273:iload           9
	//  139  275:iconst_2        
	//  140  276:ior             
	//  141  277:istore          8
_L5:
		k = j;
	//  142  279:iload           8
	//  143  281:istore          9
		if((l & 3) != j) goto _L7; else goto _L6
	//  144  283:iload           10
	//  145  285:iconst_3        
	//  146  286:iand            
	//  147  287:iload           8
	//  148  289:icmpne          78
_L6:
		flag2 = true;
	//  149  292:iconst_1        
	//  150  293:istore          11
		k = j;
	//  151  295:iload           8
	//  152  297:istore          9
		j = i;
	//  153  299:iload           5
	//  154  301:istore          8
		if(i != -1)
	//* 155  303:iload           5
	//* 156  305:iconst_m1       
	//* 157  306:icmpeq          162
		{
			j = i;
	//  158  309:iload           5
	//  159  311:istore          8
			if(flag2)
	//* 160  313:iload           11
	//* 161  315:ifeq            162
				j = i & ~k;
	//  162  318:iload           5
	//  163  320:iload           9
	//  164  322:iconst_m1       
	//  165  323:ixor            
	//  166  324:iand            
	//  167  325:istore          8
		}
		  goto _L8
	//* 168  327:goto            162
	}

	public Set getRegisteredFamilies()
	{
		return fontFamilies.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Hashtable fontFamilies>
	//    2    4:invokevirtual   #195 <Method Set Hashtable.keySet()>
	//    3    7:areturn         
	}

	public Set getRegisteredFonts()
	{
		return trueTypeFonts.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Hashtable trueTypeFonts>
	//    2    4:invokevirtual   #195 <Method Set Hashtable.keySet()>
	//    3    7:areturn         
	}

	public boolean isRegistered(String s)
	{
		return trueTypeFonts.containsKey(((Object) (s.toLowerCase())));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Hashtable trueTypeFonts>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #64  <Method String String.toLowerCase()>
	//    4    8:invokevirtual   #203 <Method boolean Hashtable.containsKey(Object)>
	//    5   11:ireturn         
	}

	public void register(String s)
	{
		register(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #208 <Method void register(String, String)>
	//    4    6:return          
	}

	public void register(String s, String s1)
	{
		if(!s.toLowerCase().endsWith(".ttf") && !s.toLowerCase().endsWith(".otf") && s.toLowerCase().indexOf(".ttc,") <= 0) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #64  <Method String String.toLowerCase()>
	//    2    4:ldc1            #210 <String ".ttf">
	//    3    6:invokevirtual   #213 <Method boolean String.endsWith(String)>
	//    4    9:ifne            36
	//    5   12:aload_1         
	//    6   13:invokevirtual   #64  <Method String String.toLowerCase()>
	//    7   16:ldc1            #215 <String ".otf">
	//    8   18:invokevirtual   #213 <Method boolean String.endsWith(String)>
	//    9   21:ifne            36
	//   10   24:aload_1         
	//   11   25:invokevirtual   #64  <Method String String.toLowerCase()>
	//   12   28:ldc1            #217 <String ".ttc,">
	//   13   30:invokevirtual   #176 <Method int String.indexOf(String)>
	//   14   33:ifle            412
_L1:
		Object aobj[];
		aobj = BaseFont.getAllFontNames(s, "Cp1252", ((byte []) (null)));
	//   15   36:aload_1         
	//   16   37:ldc1            #54  <String "Cp1252">
	//   17   39:aconst_null     
	//   18   40:invokestatic    #221 <Method Object[] BaseFont.getAllFontNames(String, String, byte[])>
	//   19   43:astore          8
		trueTypeFonts.put(((Object) (((String)aobj[0]).toLowerCase())), ((Object) (s)));
	//   20   45:aload_0         
	//   21   46:getfield        #50  <Field Hashtable trueTypeFonts>
	//   22   49:aload           8
	//   23   51:iconst_0        
	//   24   52:aaload          
	//   25   53:checkcast       #31  <Class String>
	//   26   56:invokevirtual   #64  <Method String String.toLowerCase()>
	//   27   59:aload_1         
	//   28   60:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   29   63:pop             
		if(s1 == null)
			break MISSING_BLOCK_LABEL_99;
	//   30   64:aload_2         
	//   31   65:ifnull          99
		s1 = s1.toLowerCase();
	//   32   68:aload_2         
	//   33   69:invokevirtual   #64  <Method String String.toLowerCase()>
	//   34   72:astore_2        
		trueTypeFonts.put(((Object) (s1)), ((Object) (s)));
	//   35   73:aload_0         
	//   36   74:getfield        #50  <Field Hashtable trueTypeFonts>
	//   37   77:aload_2         
	//   38   78:aload_1         
	//   39   79:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   40   82:pop             
		if(s1.endsWith("regular"))
	//*  41   83:aload_2         
	//*  42   84:ldc1            #223 <String "regular">
	//*  43   86:invokevirtual   #213 <Method boolean String.endsWith(String)>
	//*  44   89:ifeq            99
			saveCopyOfRegularFont(s1, s);
	//   45   92:aload_0         
	//   46   93:aload_2         
	//   47   94:aload_1         
	//   48   95:invokevirtual   #227 <Method boolean saveCopyOfRegularFont(String, String)>
	//   49   98:pop             
		int j;
		s1 = ((String) ((String[][])(String[][])aobj[2]));
	//   50   99:aload           8
	//   51  101:iconst_2        
	//   52  102:aaload          
	//   53  103:checkcast       #229 <Class String[][]>
	//   54  106:checkcast       #229 <Class String[][]>
	//   55  109:astore_2        
		j = s1.length;
	//   56  110:aload_2         
	//   57  111:arraylength     
	//   58  112:istore          4
		int i;
		int k;
		Object obj;
		Object obj1;
		String as1[][];
		String as2[];
		for(i = 0; i < j; i++)
	//*  59  114:iconst_0        
	//*  60  115:istore_3        
	//*  61  116:iload_3         
	//*  62  117:iload           4
	//*  63  119:icmpge          164
		{
			int l;
			String as[][];
			String s3;
			try
			{
				String s2 = ((String) (s1[i][3])).toLowerCase();
	//   64  122:aload_2         
	//   65  123:iload_3         
	//   66  124:aaload          
	//   67  125:iconst_3        
	//   68  126:aaload          
	//   69  127:invokevirtual   #64  <Method String String.toLowerCase()>
	//   70  130:astore          7
				trueTypeFonts.put(((Object) (s2)), ((Object) (s)));
	//   71  132:aload_0         
	//   72  133:getfield        #50  <Field Hashtable trueTypeFonts>
	//   73  136:aload           7
	//   74  138:aload_1         
	//   75  139:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   76  142:pop             
				if(s2.endsWith("regular"))
	//*  77  143:aload           7
	//*  78  145:ldc1            #223 <String "regular">
	//*  79  147:invokevirtual   #213 <Method boolean String.endsWith(String)>
	//*  80  150:ifeq            644
					saveCopyOfRegularFont(s2, s);
	//   81  153:aload_0         
	//   82  154:aload           7
	//   83  156:aload_1         
	//   84  157:invokevirtual   #227 <Method boolean saveCopyOfRegularFont(String, String)>
	//   85  160:pop             
			}
	//*  86  161:goto            644
	//*  87  164:aconst_null     
	//*  88  165:astore_2        
	//*  89  166:aload           8
	//*  90  168:iconst_1        
	//*  91  169:aaload          
	//*  92  170:checkcast       #229 <Class String[][]>
	//*  93  173:checkcast       #229 <Class String[][]>
	//*  94  176:astore          9
	//*  95  178:iconst_0        
	//*  96  179:istore_3        
	//*  97  180:iload_3         
	//*  98  181:getstatic       #41  <Field String[] TTFamilyOrder>
	//*  99  184:arraylength     
	//* 100  185:icmpge          283
	//* 101  188:aload           9
	//* 102  190:arraylength     
	//* 103  191:istore          6
	//* 104  193:iconst_0        
	//* 105  194:istore          4
	//* 106  196:aload_2         
	//* 107  197:astore          7
	//* 108  199:iload_3         
	//* 109  200:istore          5
	//* 110  202:iload           4
	//* 111  204:iload           6
	//* 112  206:icmpge          651
	//* 113  209:aload           9
	//* 114  211:iload           4
	//* 115  213:aaload          
	//* 116  214:astore          7
	//* 117  216:getstatic       #41  <Field String[] TTFamilyOrder>
	//* 118  219:iload_3         
	//* 119  220:aaload          
	//* 120  221:aload           7
	//* 121  223:iconst_0        
	//* 122  224:aaload          
	//* 123  225:invokevirtual   #232 <Method boolean String.equals(Object)>
	//* 124  228:ifeq            662
	//* 125  231:getstatic       #41  <Field String[] TTFamilyOrder>
	//* 126  234:iload_3         
	//* 127  235:iconst_1        
	//* 128  236:iadd            
	//* 129  237:aaload          
	//* 130  238:aload           7
	//* 131  240:iconst_1        
	//* 132  241:aaload          
	//* 133  242:invokevirtual   #232 <Method boolean String.equals(Object)>
	//* 134  245:ifeq            662
	//* 135  248:getstatic       #41  <Field String[] TTFamilyOrder>
	//* 136  251:iload_3         
	//* 137  252:iconst_2        
	//* 138  253:iadd            
	//* 139  254:aaload          
	//* 140  255:aload           7
	//* 141  257:iconst_2        
	//* 142  258:aaload          
	//* 143  259:invokevirtual   #232 <Method boolean String.equals(Object)>
	//* 144  262:ifeq            662
	//* 145  265:aload           7
	//* 146  267:iconst_3        
	//* 147  268:aaload          
	//* 148  269:invokevirtual   #64  <Method String String.toLowerCase()>
	//* 149  272:astore          7
	//* 150  274:getstatic       #41  <Field String[] TTFamilyOrder>
	//* 151  277:arraylength     
	//* 152  278:istore          5
	//* 153  280:goto            651
	//* 154  283:aload_2         
	//* 155  284:ifnull          587
	//* 156  287:ldc1            #234 <String "">
	//* 157  289:astore          7
	//* 158  291:aload           8
	//* 159  293:iconst_2        
	//* 160  294:aaload          
	//* 161  295:checkcast       #229 <Class String[][]>
	//* 162  298:checkcast       #229 <Class String[][]>
	//* 163  301:astore          10
	//* 164  303:aload           10
	//* 165  305:arraylength     
	//* 166  306:istore          5
	//* 167  308:iconst_0        
	//* 168  309:istore_3        
	//* 169  310:goto            671
	//* 170  313:aload           7
	//* 171  315:astore          8
	//* 172  317:iload           4
	//* 173  319:getstatic       #41  <Field String[] TTFamilyOrder>
	//* 174  322:arraylength     
	//* 175  323:icmpge          698
	//* 176  326:getstatic       #41  <Field String[] TTFamilyOrder>
	//* 177  329:iload           4
	//* 178  331:aaload          
	//* 179  332:aload           11
	//* 180  334:iconst_0        
	//* 181  335:aaload          
	//* 182  336:invokevirtual   #232 <Method boolean String.equals(Object)>
	//* 183  339:ifeq            689
	//* 184  342:getstatic       #41  <Field String[] TTFamilyOrder>
	//* 185  345:iload           4
	//* 186  347:iconst_1        
	//* 187  348:iadd            
	//* 188  349:aaload          
	//* 189  350:aload           11
	//* 190  352:iconst_1        
	//* 191  353:aaload          
	//* 192  354:invokevirtual   #232 <Method boolean String.equals(Object)>
	//* 193  357:ifeq            689
	//* 194  360:getstatic       #41  <Field String[] TTFamilyOrder>
	//* 195  363:iload           4
	//* 196  365:iconst_2        
	//* 197  366:iadd            
	//* 198  367:aaload          
	//* 199  368:aload           11
	//* 200  370:iconst_2        
	//* 201  371:aaload          
	//* 202  372:invokevirtual   #232 <Method boolean String.equals(Object)>
	//* 203  375:ifeq            689
	//* 204  378:aload           11
	//* 205  380:iconst_3        
	//* 206  381:aaload          
	//* 207  382:astore          9
	//* 208  384:aload           9
	//* 209  386:aload           7
	//* 210  388:invokevirtual   #232 <Method boolean String.equals(Object)>
	//* 211  391:ifeq            397
	//* 212  394:goto            689
	//* 213  397:aload           9
	//* 214  399:astore          8
	//* 215  401:aload_0         
	//* 216  402:aload_2         
	//* 217  403:aload           9
	//* 218  405:aconst_null     
	//* 219  406:invokevirtual   #238 <Method void registerFamily(String, String, String)>
	//* 220  409:goto            698
	//* 221  412:aload_1         
	//* 222  413:invokevirtual   #64  <Method String String.toLowerCase()>
	//* 223  416:ldc1            #240 <String ".ttc">
	//* 224  418:invokevirtual   #213 <Method boolean String.endsWith(String)>
	//* 225  421:ifeq            486
	//* 226  424:aload_2         
	//* 227  425:ifnull          438
	//* 228  428:getstatic       #29  <Field Logger LOGGER>
	//* 229  431:ldc1            #242 <String "You can't define an alias for a true type collection.">
	//* 230  433:invokeinterface #247 <Method void Logger.error(String)>
	//* 231  438:aload_1         
	//* 232  439:invokestatic    #251 <Method String[] BaseFont.enumerateTTCNames(String)>
	//* 233  442:astore_2        
	//* 234  443:iconst_0        
	//* 235  444:istore_3        
	//* 236  445:iload_3         
	//* 237  446:aload_2         
	//* 238  447:arraylength     
	//* 239  448:icmpge          587
	//* 240  451:aload_0         
	//* 241  452:new             #253 <Class StringBuilder>
	//* 242  455:dup             
	//* 243  456:invokespecial   #254 <Method void StringBuilder()>
	//* 244  459:aload_1         
	//* 245  460:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//* 246  463:ldc2            #260 <String ",">
	//* 247  466:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//* 248  469:iload_3         
	//* 249  470:invokevirtual   #263 <Method StringBuilder StringBuilder.append(int)>
	//* 250  473:invokevirtual   #266 <Method String StringBuilder.toString()>
	//* 251  476:invokevirtual   #268 <Method void register(String)>
	//* 252  479:iload_3         
	//* 253  480:iconst_1        
	//* 254  481:iadd            
	//* 255  482:istore_3        
	//* 256  483:goto            445
	//* 257  486:aload_1         
	//* 258  487:invokevirtual   #64  <Method String String.toLowerCase()>
	//* 259  490:ldc2            #270 <String ".afm">
	//* 260  493:invokevirtual   #213 <Method boolean String.endsWith(String)>
	//* 261  496:ifne            512
	//* 262  499:aload_1         
	//* 263  500:invokevirtual   #64  <Method String String.toLowerCase()>
	//* 264  503:ldc2            #272 <String ".pfm">
	//* 265  506:invokevirtual   #213 <Method boolean String.endsWith(String)>
	//* 266  509:ifeq            587
	//* 267  512:aload_1         
	//* 268  513:ldc1            #54  <String "Cp1252">
	//* 269  515:iconst_0        
	//* 270  516:invokestatic    #275 <Method BaseFont BaseFont.createFont(String, String, boolean)>
	//* 271  519:astore          8
	//* 272  521:aload           8
	//* 273  523:invokevirtual   #279 <Method String[][] BaseFont.getFullFontName()>
	//* 274  526:iconst_0        
	//* 275  527:aaload          
	//* 276  528:iconst_3        
	//* 277  529:aaload          
	//* 278  530:invokevirtual   #64  <Method String String.toLowerCase()>
	//* 279  533:astore_2        
	//* 280  534:aload           8
	//* 281  536:invokevirtual   #282 <Method String[][] BaseFont.getFamilyFontName()>
	//* 282  539:iconst_0        
	//* 283  540:aaload          
	//* 284  541:iconst_3        
	//* 285  542:aaload          
	//* 286  543:invokevirtual   #64  <Method String String.toLowerCase()>
	//* 287  546:astore          7
	//* 288  548:aload           8
	//* 289  550:invokevirtual   #285 <Method String BaseFont.getPostscriptFontName()>
	//* 290  553:invokevirtual   #64  <Method String String.toLowerCase()>
	//* 291  556:astore          8
	//* 292  558:aload_0         
	//* 293  559:aload           7
	//* 294  561:aload_2         
	//* 295  562:aconst_null     
	//* 296  563:invokevirtual   #238 <Method void registerFamily(String, String, String)>
	//* 297  566:aload_0         
	//* 298  567:getfield        #50  <Field Hashtable trueTypeFonts>
	//* 299  570:aload           8
	//* 300  572:aload_1         
	//* 301  573:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//* 302  576:pop             
	//* 303  577:aload_0         
	//* 304  578:getfield        #50  <Field Hashtable trueTypeFonts>
	//* 305  581:aload_2         
	//* 306  582:aload_1         
	//* 307  583:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//* 308  586:pop             
	//* 309  587:getstatic       #29  <Field Logger LOGGER>
	//* 310  590:getstatic       #291 <Field Level Level.TRACE>
	//* 311  593:invokeinterface #295 <Method boolean Logger.isLogging(Level)>
	//* 312  598:ifeq            623
	//* 313  601:getstatic       #29  <Field Logger LOGGER>
	//* 314  604:ldc2            #297 <String "Registered %s">
	//* 315  607:iconst_1        
	//* 316  608:anewarray       Object[]
	//* 317  611:dup             
	//* 318  612:iconst_0        
	//* 319  613:aload_1         
	//* 320  614:aastore         
	//* 321  615:invokestatic    #301 <Method String String.format(String, Object[])>
	//* 322  618:invokeinterface #304 <Method void Logger.trace(String)>
	//* 323  623:return          
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 324  624:astore_1        
			{
				throw new ExceptionConverter(((Exception) (s)));
	//  325  625:new             #184 <Class ExceptionConverter>
	//  326  628:dup             
	//  327  629:aload_1         
	//  328  630:invokespecial   #187 <Method void ExceptionConverter(Exception)>
	//  329  633:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 330  634:astore_1        
			{
				throw new ExceptionConverter(((Exception) (s)));
	//  331  635:new             #184 <Class ExceptionConverter>
	//  332  638:dup             
	//  333  639:aload_1         
	//  334  640:invokespecial   #187 <Method void ExceptionConverter(Exception)>
	//  335  643:athrow          
			}
		}

	//  336  644:iload_3         
	//  337  645:iconst_1        
	//  338  646:iadd            
	//  339  647:istore_3        
		s1 = null;
		as = (String[][])(String[][])aobj[1];
		i = 0;
_L18:
		if(i >= TTFamilyOrder.length) goto _L4; else goto _L3
_L3:
		l = as.length;
		j = 0;
_L19:
		obj = ((Object) (s1));
		k = i;
		if(j >= l) goto _L6; else goto _L5
_L5:
		obj = ((Object) (as[j]));
		if(!TTFamilyOrder[i].equals(((Object) (obj[0]))) || !TTFamilyOrder[i + 1].equals(((Object) (obj[1]))) || !TTFamilyOrder[i + 2].equals(((Object) (obj[2])))) goto _L8; else goto _L7
_L7:
		obj = ((Object) (((String) (obj[3])).toLowerCase()));
		k = TTFamilyOrder.length;
		  goto _L6
_L4:
		if(s1 == null) goto _L10; else goto _L9
_L9:
		obj = "";
		as1 = (String[][])(String[][])aobj[2];
		k = as1.length;
		i = 0;
		  goto _L11
_L21:
		obj1 = obj;
		if(j >= TTFamilyOrder.length)
			break MISSING_BLOCK_LABEL_698;
		if(!TTFamilyOrder[j].equals(((Object) (as2[0]))) || !TTFamilyOrder[j + 1].equals(((Object) (as2[1]))) || !TTFamilyOrder[j + 2].equals(((Object) (as2[2])))) goto _L13; else goto _L12
_L12:
		s3 = as2[3];
		if(!s3.equals(obj)) goto _L14; else goto _L13
_L14:
		obj1 = ((Object) (s3));
		registerFamily(s1, s3, ((String) (null)));
		break MISSING_BLOCK_LABEL_698;
_L2:
		if(!s.toLowerCase().endsWith(".ttc")) goto _L16; else goto _L15
_L15:
		if(s1 == null)
			break MISSING_BLOCK_LABEL_438;
		LOGGER.error("You can't define an alias for a true type collection.");
		s1 = ((String) (BaseFont.enumerateTTCNames(s)));
		i = 0;
_L17:
		if(i >= s1.length)
			break; /* Loop/switch isn't completed */
		register((new StringBuilder()).append(s).append(",").append(i).toString());
		i++;
		if(true) goto _L17; else goto _L10
_L16:
		if(s.toLowerCase().endsWith(".afm") || s.toLowerCase().endsWith(".pfm"))
		{
			obj1 = ((Object) (BaseFont.createFont(s, "Cp1252", false)));
			s1 = ((BaseFont) (obj1)).getFullFontName()[0][3].toLowerCase();
			obj = ((Object) (((BaseFont) (obj1)).getFamilyFontName()[0][3].toLowerCase()));
			obj1 = ((Object) (((BaseFont) (obj1)).getPostscriptFontName().toLowerCase()));
			registerFamily(((String) (obj)), s1, ((String) (null)));
			trueTypeFonts.put(obj1, ((Object) (s)));
			trueTypeFonts.put(((Object) (s1)), ((Object) (s)));
		}
_L10:
		if(LOGGER.isLogging(Level.TRACE))
			LOGGER.trace(String.format("Registered %s", new Object[] {
				s
			}));
		return;
	//* 340  648:goto            116
_L6:
		i = k + 3;
	//  341  651:iload           5
	//  342  653:iconst_3        
	//  343  654:iadd            
	//  344  655:istore_3        
		s1 = ((String) (obj));
	//  345  656:aload           7
	//  346  658:astore_2        
		  goto _L18
	//* 347  659:goto            180
_L8:
		j++;
	//  348  662:iload           4
	//  349  664:iconst_1        
	//  350  665:iadd            
	//  351  666:istore          4
		  goto _L19
	//* 352  668:goto            196
_L11:
		if(i >= k) goto _L10; else goto _L20
	//  353  671:iload_3         
	//  354  672:iload           5
	//  355  674:icmpge          587
_L20:
		as2 = as1[i];
	//  356  677:aload           10
	//  357  679:iload_3         
	//  358  680:aaload          
	//  359  681:astore          11
		j = 0;
	//  360  683:iconst_0        
	//  361  684:istore          4
		  goto _L21
	//* 362  686:goto            313
_L13:
		j += 3;
	//  363  689:iload           4
	//  364  691:iconst_3        
	//  365  692:iadd            
	//  366  693:istore          4
		  goto _L21
	//* 367  695:goto            313
		i++;
	//  368  698:iload_3         
	//  369  699:iconst_1        
	//  370  700:iadd            
	//  371  701:istore_3        
		obj = obj1;
	//  372  702:aload           8
	//  373  704:astore          7
		  goto _L11
	//* 374  706:goto            671
	}

	public int registerDirectories()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		String s = System.getenv("windir");
	//    2    2:ldc2            #308 <String "windir">
	//    3    5:invokestatic    #314 <Method String System.getenv(String)>
	//    4    8:astore_3        
		String s1 = System.getProperty("file.separator");
	//    5    9:ldc2            #316 <String "file.separator">
	//    6   12:invokestatic    #319 <Method String System.getProperty(String)>
	//    7   15:astore          4
		int i = ((int) (flag));
	//    8   17:iload_2         
	//    9   18:istore_1        
		if(s != null)
	//*  10   19:aload_3         
	//*  11   20:ifnull          62
		{
			i = ((int) (flag));
	//   12   23:iload_2         
	//   13   24:istore_1        
			if(s1 != null)
	//*  14   25:aload           4
	//*  15   27:ifnull          62
				i = 0 + registerDirectory((new StringBuilder()).append(s).append(s1).append("fonts").toString());
	//   16   30:iconst_0        
	//   17   31:aload_0         
	//   18   32:new             #253 <Class StringBuilder>
	//   19   35:dup             
	//   20   36:invokespecial   #254 <Method void StringBuilder()>
	//   21   39:aload_3         
	//   22   40:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:aload           4
	//   24   45:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//   25   48:ldc2            #321 <String "fonts">
	//   26   51:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//   27   54:invokevirtual   #266 <Method String StringBuilder.toString()>
	//   28   57:invokevirtual   #324 <Method int registerDirectory(String)>
	//   29   60:iadd            
	//   30   61:istore_1        
		}
		return i + registerDirectory("/usr/share/X11/fonts", true) + registerDirectory("/usr/X/lib/X11/fonts", true) + registerDirectory("/usr/openwin/lib/X11/fonts", true) + registerDirectory("/usr/share/fonts", true) + registerDirectory("/usr/X11R6/lib/X11/fonts", true) + registerDirectory("/Library/Fonts") + registerDirectory("/System/Library/Fonts");
	//   31   62:iload_1         
	//   32   63:aload_0         
	//   33   64:ldc2            #326 <String "/usr/share/X11/fonts">
	//   34   67:iconst_1        
	//   35   68:invokevirtual   #329 <Method int registerDirectory(String, boolean)>
	//   36   71:iadd            
	//   37   72:aload_0         
	//   38   73:ldc2            #331 <String "/usr/X/lib/X11/fonts">
	//   39   76:iconst_1        
	//   40   77:invokevirtual   #329 <Method int registerDirectory(String, boolean)>
	//   41   80:iadd            
	//   42   81:aload_0         
	//   43   82:ldc2            #333 <String "/usr/openwin/lib/X11/fonts">
	//   44   85:iconst_1        
	//   45   86:invokevirtual   #329 <Method int registerDirectory(String, boolean)>
	//   46   89:iadd            
	//   47   90:aload_0         
	//   48   91:ldc2            #335 <String "/usr/share/fonts">
	//   49   94:iconst_1        
	//   50   95:invokevirtual   #329 <Method int registerDirectory(String, boolean)>
	//   51   98:iadd            
	//   52   99:aload_0         
	//   53  100:ldc2            #337 <String "/usr/X11R6/lib/X11/fonts">
	//   54  103:iconst_1        
	//   55  104:invokevirtual   #329 <Method int registerDirectory(String, boolean)>
	//   56  107:iadd            
	//   57  108:aload_0         
	//   58  109:ldc2            #339 <String "/Library/Fonts">
	//   59  112:invokevirtual   #324 <Method int registerDirectory(String)>
	//   60  115:iadd            
	//   61  116:aload_0         
	//   62  117:ldc2            #341 <String "/System/Library/Fonts">
	//   63  120:invokevirtual   #324 <Method int registerDirectory(String)>
	//   64  123:iadd            
	//   65  124:ireturn         
	}

	public int registerDirectory(String s)
	{
		return registerDirectory(s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #329 <Method int registerDirectory(String, boolean)>
	//    4    6:ireturn         
	}

	public int registerDirectory(String s, boolean flag)
	{
		int i;
		int j;
		int k;
		if(LOGGER.isLogging(Level.DEBUG))
	//*   0    0:getstatic       #29  <Field Logger LOGGER>
	//*   1    3:getstatic       #346 <Field Level Level.DEBUG>
	//*   2    6:invokeinterface #295 <Method boolean Logger.isLogging(Level)>
	//*   3   11:ifeq            36
			LOGGER.debug(String.format("Registering directory %s, looking for fonts", new Object[] {
				s
			}));
	//    4   14:getstatic       #29  <Field Logger LOGGER>
	//    5   17:ldc2            #348 <String "Registering directory %s, looking for fonts">
	//    6   20:iconst_1        
	//    7   21:anewarray       Object[]
	//    8   24:dup             
	//    9   25:iconst_0        
	//   10   26:aload_1         
	//   11   27:aastore         
	//   12   28:invokestatic    #301 <Method String String.format(String, Object[])>
	//   13   31:invokeinterface #351 <Method void Logger.debug(String)>
		k = 0;
	//   14   36:iconst_0        
	//   15   37:istore          5
		i = 0;
	//   16   39:iconst_0        
	//   17   40:istore_3        
		j = k;
	//   18   41:iload           5
	//   19   43:istore          4
		File file = new File(s);
	//   20   45:new             #353 <Class File>
	//   21   48:dup             
	//   22   49:aload_1         
	//   23   50:invokespecial   #355 <Method void File(String)>
	//   24   53:astore          7
		j = k;
	//   25   55:iload           5
	//   26   57:istore          4
		if(!file.exists()) goto _L2; else goto _L1
	//   27   59:aload           7
	//   28   61:invokevirtual   #358 <Method boolean File.exists()>
	//   29   64:ifeq            385
_L1:
		j = k;
	//   30   67:iload           5
	//   31   69:istore          4
		if(!file.isDirectory())
	//*  32   71:aload           7
	//*  33   73:invokevirtual   #361 <Method boolean File.isDirectory()>
	//*  34   76:ifne            81
			return 0;
	//   35   79:iconst_0        
	//   36   80:ireturn         
		j = k;
	//   37   81:iload           5
	//   38   83:istore          4
		String as[] = file.list();
	//   39   85:aload           7
	//   40   87:invokevirtual   #365 <Method String[] File.list()>
	//   41   90:astore          10
		if(as == null) goto _L2; else goto _L3
	//   42   92:aload           10
	//   43   94:ifnull          385
_L3:
		k = 0;
	//   44   97:iconst_0        
	//   45   98:istore          5
_L19:
		j = i;
	//   46  100:iload_3         
	//   47  101:istore          4
		int l = as.length;
	//   48  103:aload           10
	//   49  105:arraylength     
	//   50  106:istore          6
		j = i;
	//   51  108:iload_3         
	//   52  109:istore          4
		if(k >= l) goto _L5; else goto _L4
	//   53  111:iload           5
	//   54  113:iload           6
	//   55  115:icmpge          362
_L4:
		File file6 = new File(s, as[k]);
	//   56  118:new             #353 <Class File>
	//   57  121:dup             
	//   58  122:aload_1         
	//   59  123:aload           10
	//   60  125:iload           5
	//   61  127:aaload          
	//   62  128:invokespecial   #367 <Method void File(String, String)>
	//   63  131:astore          9
		if(!file6.isDirectory()) goto _L7; else goto _L6
	//   64  133:aload           9
	//   65  135:invokevirtual   #361 <Method boolean File.isDirectory()>
	//   66  138:ifeq            173
_L6:
		j = i;
	//   67  141:iload_3         
	//   68  142:istore          4
		file = file6;
	//   69  144:aload           9
	//   70  146:astore          7
		if(!flag) goto _L9; else goto _L8
	//   71  148:iload_2         
	//   72  149:ifeq            387
_L8:
		j = i + registerDirectory(file6.getAbsolutePath(), true);
	//   73  152:iload_3         
	//   74  153:aload_0         
	//   75  154:aload           9
	//   76  156:invokevirtual   #370 <Method String File.getAbsolutePath()>
	//   77  159:iconst_1        
	//   78  160:invokevirtual   #329 <Method int registerDirectory(String, boolean)>
	//   79  163:iadd            
	//   80  164:istore          4
		file = file6;
	//   81  166:aload           9
	//   82  168:astore          7
		  goto _L9
	//*  83  170:goto            387
_L7:
		String s2 = file6.getPath();
	//   84  173:aload           9
	//   85  175:invokevirtual   #373 <Method String File.getPath()>
	//   86  178:astore          11
		if(s2.length() >= 4) goto _L11; else goto _L10
	//   87  180:aload           11
	//   88  182:invokevirtual   #376 <Method int String.length()>
	//   89  185:iconst_4        
	//   90  186:icmpge          285
_L10:
		String s1 = null;
	//   91  189:aconst_null     
	//   92  190:astore          8
_L15:
		if(!".afm".equals(((Object) (s1))) && !".pfm".equals(((Object) (s1)))) goto _L13; else goto _L12
	//   93  192:ldc2            #270 <String ".afm">
	//   94  195:aload           8
	//   95  197:invokevirtual   #232 <Method boolean String.equals(Object)>
	//   96  200:ifne            214
	//   97  203:ldc2            #272 <String ".pfm">
	//   98  206:aload           8
	//   99  208:invokevirtual   #232 <Method boolean String.equals(Object)>
	//  100  211:ifeq            305
_L12:
		j = i;
	//  101  214:iload_3         
	//  102  215:istore          4
		File file1 = file6;
	//  103  217:aload           9
	//  104  219:astore          7
		if(!(new File((new StringBuilder()).append(s2.substring(0, s2.length() - 4)).append(".pfb").toString())).exists()) goto _L9; else goto _L14
	//  105  221:new             #353 <Class File>
	//  106  224:dup             
	//  107  225:new             #253 <Class StringBuilder>
	//  108  228:dup             
	//  109  229:invokespecial   #254 <Method void StringBuilder()>
	//  110  232:aload           11
	//  111  234:iconst_0        
	//  112  235:aload           11
	//  113  237:invokevirtual   #376 <Method int String.length()>
	//  114  240:iconst_4        
	//  115  241:isub            
	//  116  242:invokevirtual   #380 <Method String String.substring(int, int)>
	//  117  245:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//  118  248:ldc2            #382 <String ".pfb">
	//  119  251:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//  120  254:invokevirtual   #266 <Method String StringBuilder.toString()>
	//  121  257:invokespecial   #355 <Method void File(String)>
	//  122  260:invokevirtual   #358 <Method boolean File.exists()>
	//  123  263:ifeq            387
_L14:
		register(s2, ((String) (null)));
	//  124  266:aload_0         
	//  125  267:aload           11
	//  126  269:aconst_null     
	//  127  270:invokevirtual   #208 <Method void register(String, String)>
		j = i + 1;
	//  128  273:iload_3         
	//  129  274:iconst_1        
	//  130  275:iadd            
	//  131  276:istore          4
		File file2 = file6;
	//  132  278:aload           9
	//  133  280:astore          7
		  goto _L9
	//* 134  282:goto            387
_L11:
		s1 = s2.substring(s2.length() - 4).toLowerCase();
	//  135  285:aload           11
	//  136  287:aload           11
	//  137  289:invokevirtual   #376 <Method int String.length()>
	//  138  292:iconst_4        
	//  139  293:isub            
	//  140  294:invokevirtual   #385 <Method String String.substring(int)>
	//  141  297:invokevirtual   #64  <Method String String.toLowerCase()>
	//  142  300:astore          8
		  goto _L15
	//* 143  302:goto            192
_L13:
		if(".ttf".equals(((Object) (s1))) || ".otf".equals(((Object) (s1)))) goto _L17; else goto _L16
	//  144  305:ldc1            #210 <String ".ttf">
	//  145  307:aload           8
	//  146  309:invokevirtual   #232 <Method boolean String.equals(Object)>
	//  147  312:ifne            342
	//  148  315:ldc1            #215 <String ".otf">
	//  149  317:aload           8
	//  150  319:invokevirtual   #232 <Method boolean String.equals(Object)>
	//  151  322:ifne            342
_L16:
		j = i;
	//  152  325:iload_3         
	//  153  326:istore          4
		File file3 = file6;
	//  154  328:aload           9
	//  155  330:astore          7
		if(!".ttc".equals(((Object) (s1)))) goto _L9; else goto _L17
	//  156  332:ldc1            #240 <String ".ttc">
	//  157  334:aload           8
	//  158  336:invokevirtual   #232 <Method boolean String.equals(Object)>
	//  159  339:ifeq            387
_L17:
		register(s2, ((String) (null)));
	//  160  342:aload_0         
	//  161  343:aload           11
	//  162  345:aconst_null     
	//  163  346:invokevirtual   #208 <Method void register(String, String)>
		j = i + 1;
	//  164  349:iload_3         
	//  165  350:iconst_1        
	//  166  351:iadd            
	//  167  352:istore          4
		File file4 = file6;
	//  168  354:aload           9
	//  169  356:astore          7
		  goto _L9
	//* 170  358:goto            387
		s;
	//  171  361:astore_1        
_L5:
		return j;
	//  172  362:iload           4
	//  173  364:ireturn         
		Exception exception1;
		exception1;
	//  174  365:astore          8
		j = i;
	//  175  367:iload_3         
	//  176  368:istore          4
		  goto _L9
	//* 177  370:goto            387
		Exception exception;
		exception;
	//  178  373:astore          7
		j = i;
	//  179  375:iload_3         
	//  180  376:istore          4
		File file5 = file6;
	//  181  378:aload           9
	//  182  380:astore          7
		  goto _L9
	//* 183  382:goto            387
_L2:
		return 0;
	//  184  385:iconst_0        
	//  185  386:ireturn         
_L9:
		k++;
	//  186  387:iload           5
	//  187  389:iconst_1        
	//  188  390:iadd            
	//  189  391:istore          5
		i = j;
	//  190  393:iload           4
	//  191  395:istore_3        
		if(true) goto _L19; else goto _L18
	//  192  396:goto            100
_L18:
	}

	public void registerFamily(String s, String s1, String s2)
	{
		if(s2 != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          14
			trueTypeFonts.put(((Object) (s1)), ((Object) (s2)));
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field Hashtable trueTypeFonts>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//    7   13:pop             
		Hashtable hashtable = fontFamilies;
	//    8   14:aload_0         
	//    9   15:getfield        #52  <Field Hashtable fontFamilies>
	//   10   18:astore          9
		hashtable;
	//   11   20:aload           9
		JVM INSTR monitorenter ;
	//   12   22:monitorenter    
		ArrayList arraylist = (ArrayList)fontFamilies.get(((Object) (s)));
	//   13   23:aload_0         
	//   14   24:getfield        #52  <Field Hashtable fontFamilies>
	//   15   27:aload_1         
	//   16   28:invokevirtual   #119 <Method Object Hashtable.get(Object)>
	//   17   31:checkcast       #96  <Class ArrayList>
	//   18   34:astore          8
		s2 = ((String) (arraylist));
	//   19   36:aload           8
	//   20   38:astore_3        
		if(arraylist != null)
			break MISSING_BLOCK_LABEL_62;
	//   21   39:aload           8
	//   22   41:ifnonnull       62
		s2 = ((String) (new ArrayList()));
	//   23   44:new             #96  <Class ArrayList>
	//   24   47:dup             
	//   25   48:invokespecial   #97  <Method void ArrayList()>
	//   26   51:astore_3        
		fontFamilies.put(((Object) (s)), ((Object) (s2)));
	//   27   52:aload_0         
	//   28   53:getfield        #52  <Field Hashtable fontFamilies>
	//   29   56:aload_1         
	//   30   57:aload_3         
	//   31   58:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   32   61:pop             
		hashtable;
	//   33   62:aload           9
		JVM INSTR monitorexit ;
	//   34   64:monitorexit     
		s2;
	//   35   65:aload_3         
		JVM INSTR monitorenter ;
	//   36   66:monitorenter    
		if(((ArrayList) (s2)).contains(((Object) (s1)))) goto _L2; else goto _L1
	//   37   67:aload_3         
	//   38   68:aload_2         
	//   39   69:invokevirtual   #388 <Method boolean ArrayList.contains(Object)>
	//   40   72:ifne            180
_L1:
		int j = s1.length();
	//   41   75:aload_2         
	//   42   76:invokevirtual   #376 <Method int String.length()>
	//   43   79:istore          7
		int i;
		boolean flag1;
		flag1 = false;
	//   44   81:iconst_0        
	//   45   82:istore          6
		i = 0;
	//   46   84:iconst_0        
	//   47   85:istore          4
_L9:
		boolean flag = flag1;
	//   48   87:iload           6
	//   49   89:istore          5
		if(i >= ((ArrayList) (s2)).size()) goto _L4; else goto _L3
	//   50   91:iload           4
	//   51   93:aload_3         
	//   52   94:invokevirtual   #391 <Method int ArrayList.size()>
	//   53   97:icmpge          127
_L3:
		if(((String)((ArrayList) (s2)).get(i)).length() < j) goto _L6; else goto _L5
	//   54  100:aload_3         
	//   55  101:iload           4
	//   56  103:invokevirtual   #394 <Method Object ArrayList.get(int)>
	//   57  106:checkcast       #31  <Class String>
	//   58  109:invokevirtual   #376 <Method int String.length()>
	//   59  112:iload           7
	//   60  114:icmplt          189
_L5:
		((ArrayList) (s2)).add(i, ((Object) (s1)));
	//   61  117:aload_3         
	//   62  118:iload           4
	//   63  120:aload_2         
	//   64  121:invokevirtual   #397 <Method void ArrayList.add(int, Object)>
		flag = true;
	//   65  124:iconst_1        
	//   66  125:istore          5
_L4:
		if(flag) goto _L2; else goto _L7
	//   67  127:iload           5
	//   68  129:ifne            180
_L7:
		((ArrayList) (s2)).add(((Object) (s1)));
	//   69  132:aload_3         
	//   70  133:aload_2         
	//   71  134:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//   72  137:pop             
		s = s1.toLowerCase();
	//   73  138:aload_2         
	//   74  139:invokevirtual   #64  <Method String String.toLowerCase()>
	//   75  142:astore_1        
		if(s.endsWith("regular"))
	//*  76  143:aload_1         
	//*  77  144:ldc1            #223 <String "regular">
	//*  78  146:invokevirtual   #213 <Method boolean String.endsWith(String)>
	//*  79  149:ifeq            180
			((ArrayList) (s2)).add(0, ((Object) (s1.substring(0, s.substring(0, s.length() - 7).trim().length()))));
	//   80  152:aload_3         
	//   81  153:iconst_0        
	//   82  154:aload_2         
	//   83  155:iconst_0        
	//   84  156:aload_1         
	//   85  157:iconst_0        
	//   86  158:aload_1         
	//   87  159:invokevirtual   #376 <Method int String.length()>
	//   88  162:bipush          7
	//   89  164:isub            
	//   90  165:invokevirtual   #380 <Method String String.substring(int, int)>
	//   91  168:invokevirtual   #400 <Method String String.trim()>
	//   92  171:invokevirtual   #376 <Method int String.length()>
	//   93  174:invokevirtual   #380 <Method String String.substring(int, int)>
	//   94  177:invokevirtual   #397 <Method void ArrayList.add(int, Object)>
_L2:
		s2;
	//   95  180:aload_3         
		JVM INSTR monitorexit ;
	//   96  181:monitorexit     
		return;
	//   97  182:return          
		s;
	//   98  183:astore_1        
		hashtable;
	//   99  184:aload           9
		JVM INSTR monitorexit ;
	//  100  186:monitorexit     
		throw s;
	//  101  187:aload_1         
	//  102  188:athrow          
_L6:
		i++;
	//  103  189:iload           4
	//  104  191:iconst_1        
	//  105  192:iadd            
	//  106  193:istore          4
		if(true) goto _L9; else goto _L8
	//  107  195:goto            87
_L8:
		s;
	//  108  198:astore_1        
		s2;
	//  109  199:aload_3         
		JVM INSTR monitorexit ;
	//  110  200:monitorexit     
		throw s;
	//  111  201:aload_1         
	//  112  202:athrow          
	}

	protected boolean saveCopyOfRegularFont(String s, String s1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		s = s.substring(0, s.length() - 7).trim();
	//    2    2:aload_1         
	//    3    3:iconst_0        
	//    4    4:aload_1         
	//    5    5:invokevirtual   #376 <Method int String.length()>
	//    6    8:bipush          7
	//    7   10:isub            
	//    8   11:invokevirtual   #380 <Method String String.substring(int, int)>
	//    9   14:invokevirtual   #400 <Method String String.trim()>
	//   10   17:astore_1        
		if(!trueTypeFonts.containsKey(((Object) (s))))
	//*  11   18:aload_0         
	//*  12   19:getfield        #50  <Field Hashtable trueTypeFonts>
	//*  13   22:aload_1         
	//*  14   23:invokevirtual   #203 <Method boolean Hashtable.containsKey(Object)>
	//*  15   26:ifne            41
		{
			trueTypeFonts.put(((Object) (s)), ((Object) (s1)));
	//   16   29:aload_0         
	//   17   30:getfield        #50  <Field Hashtable trueTypeFonts>
	//   18   33:aload_1         
	//   19   34:aload_2         
	//   20   35:invokevirtual   #68  <Method Object Hashtable.put(Object, Object)>
	//   21   38:pop             
			flag = true;
	//   22   39:iconst_1        
	//   23   40:istore_3        
		}
		return flag;
	//   24   41:iload_3         
	//   25   42:ireturn         
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/text/FontFactoryImp);
	private static String TTFamilyOrder[] = {
		"3", "1", "1033", "3", "0", "1033", "1", "0", "0", "0", 
		"3", "0"
	};
	public boolean defaultEmbedding;
	public String defaultEncoding;
	private final Hashtable fontFamilies = new Hashtable();
	private final Hashtable trueTypeFonts = new Hashtable();

	static 
	{
	//    0    0:ldc1            #2   <Class FontFactoryImp>
	//    1    2:invokestatic    #27  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #29  <Field Logger LOGGER>
	//    3    8:bipush          12
	//    4   10:anewarray       String[]
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:ldc1            #33  <String "3">
	//    8   17:aastore         
	//    9   18:dup             
	//   10   19:iconst_1        
	//   11   20:ldc1            #35  <String "1">
	//   12   22:aastore         
	//   13   23:dup             
	//   14   24:iconst_2        
	//   15   25:ldc1            #37  <String "1033">
	//   16   27:aastore         
	//   17   28:dup             
	//   18   29:iconst_3        
	//   19   30:ldc1            #33  <String "3">
	//   20   32:aastore         
	//   21   33:dup             
	//   22   34:iconst_4        
	//   23   35:ldc1            #39  <String "0">
	//   24   37:aastore         
	//   25   38:dup             
	//   26   39:iconst_5        
	//   27   40:ldc1            #37  <String "1033">
	//   28   42:aastore         
	//   29   43:dup             
	//   30   44:bipush          6
	//   31   46:ldc1            #35  <String "1">
	//   32   48:aastore         
	//   33   49:dup             
	//   34   50:bipush          7
	//   35   52:ldc1            #39  <String "0">
	//   36   54:aastore         
	//   37   55:dup             
	//   38   56:bipush          8
	//   39   58:ldc1            #39  <String "0">
	//   40   60:aastore         
	//   41   61:dup             
	//   42   62:bipush          9
	//   43   64:ldc1            #39  <String "0">
	//   44   66:aastore         
	//   45   67:dup             
	//   46   68:bipush          10
	//   47   70:ldc1            #33  <String "3">
	//   48   72:aastore         
	//   49   73:dup             
	//   50   74:bipush          11
	//   51   76:ldc1            #39  <String "0">
	//   52   78:aastore         
	//   53   79:putstatic       #41  <Field String[] TTFamilyOrder>
	//*  54   82:return          
	}
}
