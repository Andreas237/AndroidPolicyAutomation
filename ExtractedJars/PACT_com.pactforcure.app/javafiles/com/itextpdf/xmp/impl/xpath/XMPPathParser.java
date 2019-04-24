// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl.xpath;

import com.itextpdf.xmp.*;
import com.itextpdf.xmp.impl.Utils;
import com.itextpdf.xmp.options.AliasOptions;
import com.itextpdf.xmp.properties.XMPAliasInfo;

// Referenced classes of package com.itextpdf.xmp.impl.xpath:
//			XMPPath, PathPosition, XMPPathSegment

public final class XMPPathParser
{

	private XMPPathParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static XMPPath expandXPath(String s, String s1)
		throws XMPException
	{
		if(s == null || s1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       19
			throw new XMPException("Parameter must not be null", 4);
	//    4    8:new             #13  <Class XMPException>
	//    5   11:dup             
	//    6   12:ldc1            #15  <String "Parameter must not be null">
	//    7   14:iconst_4        
	//    8   15:invokespecial   #18  <Method void XMPException(String, int)>
	//    9   18:athrow          
		XMPPath xmppath = new XMPPath();
	//   10   19:new             #20  <Class XMPPath>
	//   11   22:dup             
	//   12   23:invokespecial   #21  <Method void XMPPath()>
	//   13   26:astore_2        
		PathPosition pathposition = new PathPosition();
	//   14   27:new             #23  <Class PathPosition>
	//   15   30:dup             
	//   16   31:invokespecial   #24  <Method void PathPosition()>
	//   17   34:astore_3        
		pathposition.path = s1;
	//   18   35:aload_3         
	//   19   36:aload_1         
	//   20   37:putfield        #28  <Field String PathPosition.path>
		parseRootNode(s, pathposition, xmppath);
	//   21   40:aload_0         
	//   22   41:aload_3         
	//   23   42:aload_2         
	//   24   43:invokestatic    #32  <Method void parseRootNode(String, PathPosition, XMPPath)>
		while(pathposition.stepEnd < s1.length()) 
	//*  25   46:aload_3         
	//*  26   47:getfield        #36  <Field int PathPosition.stepEnd>
	//*  27   50:aload_1         
	//*  28   51:invokevirtual   #42  <Method int String.length()>
	//*  29   54:icmpge          358
		{
			pathposition.stepBegin = pathposition.stepEnd;
	//   30   57:aload_3         
	//   31   58:aload_3         
	//   32   59:getfield        #36  <Field int PathPosition.stepEnd>
	//   33   62:putfield        #45  <Field int PathPosition.stepBegin>
			skipPathDelimiter(s1, pathposition);
	//   34   65:aload_1         
	//   35   66:aload_3         
	//   36   67:invokestatic    #49  <Method void skipPathDelimiter(String, PathPosition)>
			pathposition.stepEnd = pathposition.stepBegin;
	//   37   70:aload_3         
	//   38   71:aload_3         
	//   39   72:getfield        #45  <Field int PathPosition.stepBegin>
	//   40   75:putfield        #36  <Field int PathPosition.stepEnd>
			if(s1.charAt(pathposition.stepBegin) != '[')
	//*  41   78:aload_1         
	//*  42   79:aload_3         
	//*  43   80:getfield        #45  <Field int PathPosition.stepBegin>
	//*  44   83:invokevirtual   #53  <Method char String.charAt(int)>
	//*  45   86:bipush          91
	//*  46   88:icmpeq          171
				s = ((String) (parseStructSegment(pathposition)));
	//   47   91:aload_3         
	//   48   92:invokestatic    #57  <Method XMPPathSegment parseStructSegment(PathPosition)>
	//   49   95:astore_0        
			else
	//*  50   96:aload_0         
	//*  51   97:invokevirtual   #62  <Method int XMPPathSegment.getKind()>
	//*  52  100:iconst_1        
	//*  53  101:icmpne          233
	//*  54  104:aload_0         
	//*  55  105:invokevirtual   #66  <Method String XMPPathSegment.getName()>
	//*  56  108:iconst_0        
	//*  57  109:invokevirtual   #53  <Method char String.charAt(int)>
	//*  58  112:bipush          64
	//*  59  114:icmpne          179
	//*  60  117:aload_0         
	//*  61  118:new             #68  <Class StringBuilder>
	//*  62  121:dup             
	//*  63  122:invokespecial   #69  <Method void StringBuilder()>
	//*  64  125:ldc1            #71  <String "?">
	//*  65  127:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  66  130:aload_0         
	//*  67  131:invokevirtual   #66  <Method String XMPPathSegment.getName()>
	//*  68  134:iconst_1        
	//*  69  135:invokevirtual   #79  <Method String String.substring(int)>
	//*  70  138:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  71  141:invokevirtual   #82  <Method String StringBuilder.toString()>
	//*  72  144:invokevirtual   #86  <Method void XMPPathSegment.setName(String)>
	//*  73  147:ldc1            #88  <String "?xml:lang">
	//*  74  149:aload_0         
	//*  75  150:invokevirtual   #66  <Method String XMPPathSegment.getName()>
	//*  76  153:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  77  156:ifne            179
	//*  78  159:new             #13  <Class XMPException>
	//*  79  162:dup             
	//*  80  163:ldc1            #94  <String "Only xml:lang allowed with '@'">
	//*  81  165:bipush          102
	//*  82  167:invokespecial   #18  <Method void XMPException(String, int)>
	//*  83  170:athrow          
				s = ((String) (parseIndexSegment(pathposition)));
	//   84  171:aload_3         
	//   85  172:invokestatic    #97  <Method XMPPathSegment parseIndexSegment(PathPosition)>
	//   86  175:astore_0        
			if(((XMPPathSegment) (s)).getKind() == 1)
			{
				if(((XMPPathSegment) (s)).getName().charAt(0) == '@')
				{
					((XMPPathSegment) (s)).setName((new StringBuilder()).append("?").append(((XMPPathSegment) (s)).getName().substring(1)).toString());
					if(!"?xml:lang".equals(((Object) (((XMPPathSegment) (s)).getName()))))
						throw new XMPException("Only xml:lang allowed with '@'", 102);
				}
	//*  87  176:goto            96
				if(((XMPPathSegment) (s)).getName().charAt(0) == '?')
	//*  88  179:aload_0         
	//*  89  180:invokevirtual   #66  <Method String XMPPathSegment.getName()>
	//*  90  183:iconst_0        
	//*  91  184:invokevirtual   #53  <Method char String.charAt(int)>
	//*  92  187:bipush          63
	//*  93  189:icmpne          207
				{
					pathposition.nameStart = pathposition.nameStart + 1;
	//   94  192:aload_3         
	//   95  193:aload_3         
	//   96  194:getfield        #100 <Field int PathPosition.nameStart>
	//   97  197:iconst_1        
	//   98  198:iadd            
	//   99  199:putfield        #100 <Field int PathPosition.nameStart>
					((XMPPathSegment) (s)).setKind(2);
	//  100  202:aload_0         
	//  101  203:iconst_2        
	//  102  204:invokevirtual   #104 <Method void XMPPathSegment.setKind(int)>
				}
				verifyQualName(pathposition.path.substring(pathposition.nameStart, pathposition.nameEnd));
	//  103  207:aload_3         
	//  104  208:getfield        #28  <Field String PathPosition.path>
	//  105  211:aload_3         
	//  106  212:getfield        #100 <Field int PathPosition.nameStart>
	//  107  215:aload_3         
	//  108  216:getfield        #107 <Field int PathPosition.nameEnd>
	//  109  219:invokevirtual   #110 <Method String String.substring(int, int)>
	//  110  222:invokestatic    #113 <Method void verifyQualName(String)>
			} else
	//* 111  225:aload_2         
	//* 112  226:aload_0         
	//* 113  227:invokevirtual   #117 <Method void XMPPath.add(XMPPathSegment)>
	//* 114  230:goto            46
			if(((XMPPathSegment) (s)).getKind() == 6)
	//* 115  233:aload_0         
	//* 116  234:invokevirtual   #62  <Method int XMPPathSegment.getKind()>
	//* 117  237:bipush          6
	//* 118  239:icmpne          225
			{
				if(((XMPPathSegment) (s)).getName().charAt(1) == '@')
	//* 119  242:aload_0         
	//* 120  243:invokevirtual   #66  <Method String XMPPathSegment.getName()>
	//* 121  246:iconst_1        
	//* 122  247:invokevirtual   #53  <Method char String.charAt(int)>
	//* 123  250:bipush          64
	//* 124  252:icmpne          309
				{
					((XMPPathSegment) (s)).setName((new StringBuilder()).append("[?").append(((XMPPathSegment) (s)).getName().substring(2)).toString());
	//  125  255:aload_0         
	//  126  256:new             #68  <Class StringBuilder>
	//  127  259:dup             
	//  128  260:invokespecial   #69  <Method void StringBuilder()>
	//  129  263:ldc1            #119 <String "[?">
	//  130  265:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  131  268:aload_0         
	//  132  269:invokevirtual   #66  <Method String XMPPathSegment.getName()>
	//  133  272:iconst_2        
	//  134  273:invokevirtual   #79  <Method String String.substring(int)>
	//  135  276:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  136  279:invokevirtual   #82  <Method String StringBuilder.toString()>
	//  137  282:invokevirtual   #86  <Method void XMPPathSegment.setName(String)>
					if(!((XMPPathSegment) (s)).getName().startsWith("[?xml:lang="))
	//* 138  285:aload_0         
	//* 139  286:invokevirtual   #66  <Method String XMPPathSegment.getName()>
	//* 140  289:ldc1            #121 <String "[?xml:lang=">
	//* 141  291:invokevirtual   #125 <Method boolean String.startsWith(String)>
	//* 142  294:ifne            309
						throw new XMPException("Only xml:lang allowed with '@'", 102);
	//  143  297:new             #13  <Class XMPException>
	//  144  300:dup             
	//  145  301:ldc1            #94  <String "Only xml:lang allowed with '@'">
	//  146  303:bipush          102
	//  147  305:invokespecial   #18  <Method void XMPException(String, int)>
	//  148  308:athrow          
				}
				if(((XMPPathSegment) (s)).getName().charAt(1) == '?')
	//* 149  309:aload_0         
	//* 150  310:invokevirtual   #66  <Method String XMPPathSegment.getName()>
	//* 151  313:iconst_1        
	//* 152  314:invokevirtual   #53  <Method char String.charAt(int)>
	//* 153  317:bipush          63
	//* 154  319:icmpne          225
				{
					pathposition.nameStart = pathposition.nameStart + 1;
	//  155  322:aload_3         
	//  156  323:aload_3         
	//  157  324:getfield        #100 <Field int PathPosition.nameStart>
	//  158  327:iconst_1        
	//  159  328:iadd            
	//  160  329:putfield        #100 <Field int PathPosition.nameStart>
					((XMPPathSegment) (s)).setKind(5);
	//  161  332:aload_0         
	//  162  333:iconst_5        
	//  163  334:invokevirtual   #104 <Method void XMPPathSegment.setKind(int)>
					verifyQualName(pathposition.path.substring(pathposition.nameStart, pathposition.nameEnd));
	//  164  337:aload_3         
	//  165  338:getfield        #28  <Field String PathPosition.path>
	//  166  341:aload_3         
	//  167  342:getfield        #100 <Field int PathPosition.nameStart>
	//  168  345:aload_3         
	//  169  346:getfield        #107 <Field int PathPosition.nameEnd>
	//  170  349:invokevirtual   #110 <Method String String.substring(int, int)>
	//  171  352:invokestatic    #113 <Method void verifyQualName(String)>
				}
			}
			xmppath.add(((XMPPathSegment) (s)));
		}
	//* 172  355:goto            225
		return xmppath;
	//  173  358:aload_2         
	//  174  359:areturn         
	}

	private static XMPPathSegment parseIndexSegment(PathPosition pathposition)
		throws XMPException
	{
		pathposition.stepEnd = pathposition.stepEnd + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field int PathPosition.stepEnd>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #36  <Field int PathPosition.stepEnd>
		XMPPathSegment xmppathsegment;
		if('0' <= pathposition.path.charAt(pathposition.stepEnd) && pathposition.path.charAt(pathposition.stepEnd) <= '9')
	//*   6   10:bipush          48
	//*   7   12:aload_0         
	//*   8   13:getfield        #28  <Field String PathPosition.path>
	//*   9   16:aload_0         
	//*  10   17:getfield        #36  <Field int PathPosition.stepEnd>
	//*  11   20:invokevirtual   #53  <Method char String.charAt(int)>
	//*  12   23:icmpgt          153
	//*  13   26:aload_0         
	//*  14   27:getfield        #28  <Field String PathPosition.path>
	//*  15   30:aload_0         
	//*  16   31:getfield        #36  <Field int PathPosition.stepEnd>
	//*  17   34:invokevirtual   #53  <Method char String.charAt(int)>
	//*  18   37:bipush          57
	//*  19   39:icmpgt          153
		{
			for(; pathposition.stepEnd < pathposition.path.length() && '0' <= pathposition.path.charAt(pathposition.stepEnd) && pathposition.path.charAt(pathposition.stepEnd) <= '9'; pathposition.stepEnd = pathposition.stepEnd + 1);
	//   20   42:aload_0         
	//   21   43:getfield        #36  <Field int PathPosition.stepEnd>
	//   22   46:aload_0         
	//   23   47:getfield        #28  <Field String PathPosition.path>
	//   24   50:invokevirtual   #42  <Method int String.length()>
	//   25   53:icmpge          101
	//   26   56:bipush          48
	//   27   58:aload_0         
	//   28   59:getfield        #28  <Field String PathPosition.path>
	//   29   62:aload_0         
	//   30   63:getfield        #36  <Field int PathPosition.stepEnd>
	//   31   66:invokevirtual   #53  <Method char String.charAt(int)>
	//   32   69:icmpgt          101
	//   33   72:aload_0         
	//   34   73:getfield        #28  <Field String PathPosition.path>
	//   35   76:aload_0         
	//   36   77:getfield        #36  <Field int PathPosition.stepEnd>
	//   37   80:invokevirtual   #53  <Method char String.charAt(int)>
	//   38   83:bipush          57
	//   39   85:icmpgt          101
	//   40   88:aload_0         
	//   41   89:aload_0         
	//   42   90:getfield        #36  <Field int PathPosition.stepEnd>
	//   43   93:iconst_1        
	//   44   94:iadd            
	//   45   95:putfield        #36  <Field int PathPosition.stepEnd>
	//*  46   98:goto            42
			xmppathsegment = new XMPPathSegment(((String) (null)), 3);
	//   47  101:new             #59  <Class XMPPathSegment>
	//   48  104:dup             
	//   49  105:aconst_null     
	//   50  106:iconst_3        
	//   51  107:invokespecial   #127 <Method void XMPPathSegment(String, int)>
	//   52  110:astore_2        
		} else
	//*  53  111:aload_0         
	//*  54  112:getfield        #36  <Field int PathPosition.stepEnd>
	//*  55  115:aload_0         
	//*  56  116:getfield        #28  <Field String PathPosition.path>
	//*  57  119:invokevirtual   #42  <Method int String.length()>
	//*  58  122:icmpge          141
	//*  59  125:aload_0         
	//*  60  126:getfield        #28  <Field String PathPosition.path>
	//*  61  129:aload_0         
	//*  62  130:getfield        #36  <Field int PathPosition.stepEnd>
	//*  63  133:invokevirtual   #53  <Method char String.charAt(int)>
	//*  64  136:bipush          93
	//*  65  138:icmpeq          511
	//*  66  141:new             #13  <Class XMPException>
	//*  67  144:dup             
	//*  68  145:ldc1            #129 <String "Missing ']' for array index">
	//*  69  147:bipush          102
	//*  70  149:invokespecial   #18  <Method void XMPException(String, int)>
	//*  71  152:athrow          
		{
			for(; pathposition.stepEnd < pathposition.path.length() && pathposition.path.charAt(pathposition.stepEnd) != ']' && pathposition.path.charAt(pathposition.stepEnd) != '='; pathposition.stepEnd = pathposition.stepEnd + 1);
	//   72  153:aload_0         
	//   73  154:getfield        #36  <Field int PathPosition.stepEnd>
	//   74  157:aload_0         
	//   75  158:getfield        #28  <Field String PathPosition.path>
	//   76  161:invokevirtual   #42  <Method int String.length()>
	//   77  164:icmpge          212
	//   78  167:aload_0         
	//   79  168:getfield        #28  <Field String PathPosition.path>
	//   80  171:aload_0         
	//   81  172:getfield        #36  <Field int PathPosition.stepEnd>
	//   82  175:invokevirtual   #53  <Method char String.charAt(int)>
	//   83  178:bipush          93
	//   84  180:icmpeq          212
	//   85  183:aload_0         
	//   86  184:getfield        #28  <Field String PathPosition.path>
	//   87  187:aload_0         
	//   88  188:getfield        #36  <Field int PathPosition.stepEnd>
	//   89  191:invokevirtual   #53  <Method char String.charAt(int)>
	//   90  194:bipush          61
	//   91  196:icmpeq          212
	//   92  199:aload_0         
	//   93  200:aload_0         
	//   94  201:getfield        #36  <Field int PathPosition.stepEnd>
	//   95  204:iconst_1        
	//   96  205:iadd            
	//   97  206:putfield        #36  <Field int PathPosition.stepEnd>
	//*  98  209:goto            153
			if(pathposition.stepEnd >= pathposition.path.length())
	//*  99  212:aload_0         
	//* 100  213:getfield        #36  <Field int PathPosition.stepEnd>
	//* 101  216:aload_0         
	//* 102  217:getfield        #28  <Field String PathPosition.path>
	//* 103  220:invokevirtual   #42  <Method int String.length()>
	//* 104  223:icmplt          238
				throw new XMPException("Missing ']' or '=' for array index", 102);
	//  105  226:new             #13  <Class XMPException>
	//  106  229:dup             
	//  107  230:ldc1            #131 <String "Missing ']' or '=' for array index">
	//  108  232:bipush          102
	//  109  234:invokespecial   #18  <Method void XMPException(String, int)>
	//  110  237:athrow          
			if(pathposition.path.charAt(pathposition.stepEnd) == ']')
	//* 111  238:aload_0         
	//* 112  239:getfield        #28  <Field String PathPosition.path>
	//* 113  242:aload_0         
	//* 114  243:getfield        #36  <Field int PathPosition.stepEnd>
	//* 115  246:invokevirtual   #53  <Method char String.charAt(int)>
	//* 116  249:bipush          93
	//* 117  251:icmpne          302
			{
				if(!"[last()".equals(((Object) (pathposition.path.substring(pathposition.stepBegin, pathposition.stepEnd)))))
	//* 118  254:ldc1            #133 <String "[last()">
	//* 119  256:aload_0         
	//* 120  257:getfield        #28  <Field String PathPosition.path>
	//* 121  260:aload_0         
	//* 122  261:getfield        #45  <Field int PathPosition.stepBegin>
	//* 123  264:aload_0         
	//* 124  265:getfield        #36  <Field int PathPosition.stepEnd>
	//* 125  268:invokevirtual   #110 <Method String String.substring(int, int)>
	//* 126  271:invokevirtual   #92  <Method boolean String.equals(Object)>
	//* 127  274:ifne            289
					throw new XMPException("Invalid non-numeric array index", 102);
	//  128  277:new             #13  <Class XMPException>
	//  129  280:dup             
	//  130  281:ldc1            #135 <String "Invalid non-numeric array index">
	//  131  283:bipush          102
	//  132  285:invokespecial   #18  <Method void XMPException(String, int)>
	//  133  288:athrow          
				xmppathsegment = new XMPPathSegment(((String) (null)), 4);
	//  134  289:new             #59  <Class XMPPathSegment>
	//  135  292:dup             
	//  136  293:aconst_null     
	//  137  294:iconst_4        
	//  138  295:invokespecial   #127 <Method void XMPPathSegment(String, int)>
	//  139  298:astore_2        
			} else
	//* 140  299:goto            111
			{
				pathposition.nameStart = pathposition.stepBegin + 1;
	//  141  302:aload_0         
	//  142  303:aload_0         
	//  143  304:getfield        #45  <Field int PathPosition.stepBegin>
	//  144  307:iconst_1        
	//  145  308:iadd            
	//  146  309:putfield        #100 <Field int PathPosition.nameStart>
				pathposition.nameEnd = pathposition.stepEnd;
	//  147  312:aload_0         
	//  148  313:aload_0         
	//  149  314:getfield        #36  <Field int PathPosition.stepEnd>
	//  150  317:putfield        #107 <Field int PathPosition.nameEnd>
				pathposition.stepEnd = pathposition.stepEnd + 1;
	//  151  320:aload_0         
	//  152  321:aload_0         
	//  153  322:getfield        #36  <Field int PathPosition.stepEnd>
	//  154  325:iconst_1        
	//  155  326:iadd            
	//  156  327:putfield        #36  <Field int PathPosition.stepEnd>
				char c = pathposition.path.charAt(pathposition.stepEnd);
	//  157  330:aload_0         
	//  158  331:getfield        #28  <Field String PathPosition.path>
	//  159  334:aload_0         
	//  160  335:getfield        #36  <Field int PathPosition.stepEnd>
	//  161  338:invokevirtual   #53  <Method char String.charAt(int)>
	//  162  341:istore_1        
				if(c != '\'' && c != '"')
	//* 163  342:iload_1         
	//* 164  343:bipush          39
	//* 165  345:icmpeq          366
	//* 166  348:iload_1         
	//* 167  349:bipush          34
	//* 168  351:icmpeq          366
					throw new XMPException("Invalid quote in array selector", 102);
	//  169  354:new             #13  <Class XMPException>
	//  170  357:dup             
	//  171  358:ldc1            #137 <String "Invalid quote in array selector">
	//  172  360:bipush          102
	//  173  362:invokespecial   #18  <Method void XMPException(String, int)>
	//  174  365:athrow          
				pathposition.stepEnd = pathposition.stepEnd + 1;
	//  175  366:aload_0         
	//  176  367:aload_0         
	//  177  368:getfield        #36  <Field int PathPosition.stepEnd>
	//  178  371:iconst_1        
	//  179  372:iadd            
	//  180  373:putfield        #36  <Field int PathPosition.stepEnd>
label0:
				do
				{
label1:
					{
label2:
						{
							if(pathposition.stepEnd < pathposition.path.length())
	//* 181  376:aload_0         
	//* 182  377:getfield        #36  <Field int PathPosition.stepEnd>
	//* 183  380:aload_0         
	//* 184  381:getfield        #28  <Field String PathPosition.path>
	//* 185  384:invokevirtual   #42  <Method int String.length()>
	//* 186  387:icmpge          438
							{
								if(pathposition.path.charAt(pathposition.stepEnd) != c)
									break label1;
	//  187  390:aload_0         
	//  188  391:getfield        #28  <Field String PathPosition.path>
	//  189  394:aload_0         
	//  190  395:getfield        #36  <Field int PathPosition.stepEnd>
	//  191  398:invokevirtual   #53  <Method char String.charAt(int)>
	//  192  401:iload_1         
	//  193  402:icmpne          474
								if(pathposition.stepEnd + 1 < pathposition.path.length() && pathposition.path.charAt(pathposition.stepEnd + 1) == c)
									break label2;
	//  194  405:aload_0         
	//  195  406:getfield        #36  <Field int PathPosition.stepEnd>
	//  196  409:iconst_1        
	//  197  410:iadd            
	//  198  411:aload_0         
	//  199  412:getfield        #28  <Field String PathPosition.path>
	//  200  415:invokevirtual   #42  <Method int String.length()>
	//  201  418:icmpge          438
	//  202  421:aload_0         
	//  203  422:getfield        #28  <Field String PathPosition.path>
	//  204  425:aload_0         
	//  205  426:getfield        #36  <Field int PathPosition.stepEnd>
	//  206  429:iconst_1        
	//  207  430:iadd            
	//  208  431:invokevirtual   #53  <Method char String.charAt(int)>
	//  209  434:iload_1         
	//  210  435:icmpeq          464
							}
							if(pathposition.stepEnd >= pathposition.path.length())
	//* 211  438:aload_0         
	//* 212  439:getfield        #36  <Field int PathPosition.stepEnd>
	//* 213  442:aload_0         
	//* 214  443:getfield        #28  <Field String PathPosition.path>
	//* 215  446:invokevirtual   #42  <Method int String.length()>
	//* 216  449:icmplt          487
								throw new XMPException("No terminating quote for array selector", 102);
	//  217  452:new             #13  <Class XMPException>
	//  218  455:dup             
	//  219  456:ldc1            #139 <String "No terminating quote for array selector">
	//  220  458:bipush          102
	//  221  460:invokespecial   #18  <Method void XMPException(String, int)>
	//  222  463:athrow          
							break label0;
						}
						pathposition.stepEnd = pathposition.stepEnd + 1;
	//  223  464:aload_0         
	//  224  465:aload_0         
	//  225  466:getfield        #36  <Field int PathPosition.stepEnd>
	//  226  469:iconst_1        
	//  227  470:iadd            
	//  228  471:putfield        #36  <Field int PathPosition.stepEnd>
					}
					pathposition.stepEnd = pathposition.stepEnd + 1;
	//  229  474:aload_0         
	//  230  475:aload_0         
	//  231  476:getfield        #36  <Field int PathPosition.stepEnd>
	//  232  479:iconst_1        
	//  233  480:iadd            
	//  234  481:putfield        #36  <Field int PathPosition.stepEnd>
				} while(true);
	//  235  484:goto            376
				pathposition.stepEnd = pathposition.stepEnd + 1;
	//  236  487:aload_0         
	//  237  488:aload_0         
	//  238  489:getfield        #36  <Field int PathPosition.stepEnd>
	//  239  492:iconst_1        
	//  240  493:iadd            
	//  241  494:putfield        #36  <Field int PathPosition.stepEnd>
				xmppathsegment = new XMPPathSegment(((String) (null)), 6);
	//  242  497:new             #59  <Class XMPPathSegment>
	//  243  500:dup             
	//  244  501:aconst_null     
	//  245  502:bipush          6
	//  246  504:invokespecial   #127 <Method void XMPPathSegment(String, int)>
	//  247  507:astore_2        
			}
		}
		if(pathposition.stepEnd >= pathposition.path.length() || pathposition.path.charAt(pathposition.stepEnd) != ']')
		{
			throw new XMPException("Missing ']' for array index", 102);
		} else
	//* 248  508:goto            111
		{
			pathposition.stepEnd = pathposition.stepEnd + 1;
	//  249  511:aload_0         
	//  250  512:aload_0         
	//  251  513:getfield        #36  <Field int PathPosition.stepEnd>
	//  252  516:iconst_1        
	//  253  517:iadd            
	//  254  518:putfield        #36  <Field int PathPosition.stepEnd>
			xmppathsegment.setName(pathposition.path.substring(pathposition.stepBegin, pathposition.stepEnd));
	//  255  521:aload_2         
	//  256  522:aload_0         
	//  257  523:getfield        #28  <Field String PathPosition.path>
	//  258  526:aload_0         
	//  259  527:getfield        #45  <Field int PathPosition.stepBegin>
	//  260  530:aload_0         
	//  261  531:getfield        #36  <Field int PathPosition.stepEnd>
	//  262  534:invokevirtual   #110 <Method String String.substring(int, int)>
	//  263  537:invokevirtual   #86  <Method void XMPPathSegment.setName(String)>
			return xmppathsegment;
	//  264  540:aload_2         
	//  265  541:areturn         
		}
	}

	private static void parseRootNode(String s, PathPosition pathposition, XMPPath xmppath)
		throws XMPException
	{
		for(; pathposition.stepEnd < pathposition.path.length() && "/[*".indexOf(((int) (pathposition.path.charAt(pathposition.stepEnd)))) < 0; pathposition.stepEnd = pathposition.stepEnd + 1);
	//    0    0:aload_1         
	//    1    1:getfield        #36  <Field int PathPosition.stepEnd>
	//    2    4:aload_1         
	//    3    5:getfield        #28  <Field String PathPosition.path>
	//    4    8:invokevirtual   #42  <Method int String.length()>
	//    5   11:icmpge          46
	//    6   14:ldc1            #141 <String "/[*">
	//    7   16:aload_1         
	//    8   17:getfield        #28  <Field String PathPosition.path>
	//    9   20:aload_1         
	//   10   21:getfield        #36  <Field int PathPosition.stepEnd>
	//   11   24:invokevirtual   #53  <Method char String.charAt(int)>
	//   12   27:invokevirtual   #145 <Method int String.indexOf(int)>
	//   13   30:ifge            46
	//   14   33:aload_1         
	//   15   34:aload_1         
	//   16   35:getfield        #36  <Field int PathPosition.stepEnd>
	//   17   38:iconst_1        
	//   18   39:iadd            
	//   19   40:putfield        #36  <Field int PathPosition.stepEnd>
	//*  20   43:goto            0
		if(pathposition.stepEnd == pathposition.stepBegin)
	//*  21   46:aload_1         
	//*  22   47:getfield        #36  <Field int PathPosition.stepEnd>
	//*  23   50:aload_1         
	//*  24   51:getfield        #45  <Field int PathPosition.stepBegin>
	//*  25   54:icmpne          69
			throw new XMPException("Empty initial XMPPath step", 102);
	//   26   57:new             #13  <Class XMPException>
	//   27   60:dup             
	//   28   61:ldc1            #147 <String "Empty initial XMPPath step">
	//   29   63:bipush          102
	//   30   65:invokespecial   #18  <Method void XMPException(String, int)>
	//   31   68:athrow          
		String s1 = verifyXPathRoot(s, pathposition.path.substring(pathposition.stepBegin, pathposition.stepEnd));
	//   32   69:aload_0         
	//   33   70:aload_1         
	//   34   71:getfield        #28  <Field String PathPosition.path>
	//   35   74:aload_1         
	//   36   75:getfield        #45  <Field int PathPosition.stepBegin>
	//   37   78:aload_1         
	//   38   79:getfield        #36  <Field int PathPosition.stepEnd>
	//   39   82:invokevirtual   #110 <Method String String.substring(int, int)>
	//   40   85:invokestatic    #151 <Method String verifyXPathRoot(String, String)>
	//   41   88:astore_3        
		pathposition = ((PathPosition) (XMPMetaFactory.getSchemaRegistry().findAlias(s1)));
	//   42   89:invokestatic    #157 <Method XMPSchemaRegistry XMPMetaFactory.getSchemaRegistry()>
	//   43   92:aload_3         
	//   44   93:invokeinterface #163 <Method XMPAliasInfo XMPSchemaRegistry.findAlias(String)>
	//   45   98:astore_1        
		if(pathposition == null)
	//*  46   99:aload_1         
	//*  47  100:ifnonnull       131
		{
			xmppath.add(new XMPPathSegment(s, 0x80000000));
	//   48  103:aload_2         
	//   49  104:new             #59  <Class XMPPathSegment>
	//   50  107:dup             
	//   51  108:aload_0         
	//   52  109:ldc1            #164 <Int 0x80000000>
	//   53  111:invokespecial   #127 <Method void XMPPathSegment(String, int)>
	//   54  114:invokevirtual   #117 <Method void XMPPath.add(XMPPathSegment)>
			xmppath.add(new XMPPathSegment(s1, 1));
	//   55  117:aload_2         
	//   56  118:new             #59  <Class XMPPathSegment>
	//   57  121:dup             
	//   58  122:aload_3         
	//   59  123:iconst_1        
	//   60  124:invokespecial   #127 <Method void XMPPathSegment(String, int)>
	//   61  127:invokevirtual   #117 <Method void XMPPath.add(XMPPathSegment)>
		} else
	//*  62  130:return          
		{
			xmppath.add(new XMPPathSegment(((XMPAliasInfo) (pathposition)).getNamespace(), 0x80000000));
	//   63  131:aload_2         
	//   64  132:new             #59  <Class XMPPathSegment>
	//   65  135:dup             
	//   66  136:aload_1         
	//   67  137:invokeinterface #169 <Method String XMPAliasInfo.getNamespace()>
	//   68  142:ldc1            #164 <Int 0x80000000>
	//   69  144:invokespecial   #127 <Method void XMPPathSegment(String, int)>
	//   70  147:invokevirtual   #117 <Method void XMPPath.add(XMPPathSegment)>
			s = ((String) (new XMPPathSegment(verifyXPathRoot(((XMPAliasInfo) (pathposition)).getNamespace(), ((XMPAliasInfo) (pathposition)).getPropName()), 1)));
	//   71  150:new             #59  <Class XMPPathSegment>
	//   72  153:dup             
	//   73  154:aload_1         
	//   74  155:invokeinterface #169 <Method String XMPAliasInfo.getNamespace()>
	//   75  160:aload_1         
	//   76  161:invokeinterface #172 <Method String XMPAliasInfo.getPropName()>
	//   77  166:invokestatic    #151 <Method String verifyXPathRoot(String, String)>
	//   78  169:iconst_1        
	//   79  170:invokespecial   #127 <Method void XMPPathSegment(String, int)>
	//   80  173:astore_0        
			((XMPPathSegment) (s)).setAlias(true);
	//   81  174:aload_0         
	//   82  175:iconst_1        
	//   83  176:invokevirtual   #176 <Method void XMPPathSegment.setAlias(boolean)>
			((XMPPathSegment) (s)).setAliasForm(((XMPAliasInfo) (pathposition)).getAliasForm().getOptions());
	//   84  179:aload_0         
	//   85  180:aload_1         
	//   86  181:invokeinterface #180 <Method AliasOptions XMPAliasInfo.getAliasForm()>
	//   87  186:invokevirtual   #185 <Method int AliasOptions.getOptions()>
	//   88  189:invokevirtual   #188 <Method void XMPPathSegment.setAliasForm(int)>
			xmppath.add(((XMPPathSegment) (s)));
	//   89  192:aload_2         
	//   90  193:aload_0         
	//   91  194:invokevirtual   #117 <Method void XMPPath.add(XMPPathSegment)>
			if(((XMPAliasInfo) (pathposition)).getAliasForm().isArrayAltText())
	//*  92  197:aload_1         
	//*  93  198:invokeinterface #180 <Method AliasOptions XMPAliasInfo.getAliasForm()>
	//*  94  203:invokevirtual   #192 <Method boolean AliasOptions.isArrayAltText()>
	//*  95  206:ifeq            244
			{
				s = ((String) (new XMPPathSegment("[?xml:lang='x-default']", 5)));
	//   96  209:new             #59  <Class XMPPathSegment>
	//   97  212:dup             
	//   98  213:ldc1            #194 <String "[?xml:lang='x-default']">
	//   99  215:iconst_5        
	//  100  216:invokespecial   #127 <Method void XMPPathSegment(String, int)>
	//  101  219:astore_0        
				((XMPPathSegment) (s)).setAlias(true);
	//  102  220:aload_0         
	//  103  221:iconst_1        
	//  104  222:invokevirtual   #176 <Method void XMPPathSegment.setAlias(boolean)>
				((XMPPathSegment) (s)).setAliasForm(((XMPAliasInfo) (pathposition)).getAliasForm().getOptions());
	//  105  225:aload_0         
	//  106  226:aload_1         
	//  107  227:invokeinterface #180 <Method AliasOptions XMPAliasInfo.getAliasForm()>
	//  108  232:invokevirtual   #185 <Method int AliasOptions.getOptions()>
	//  109  235:invokevirtual   #188 <Method void XMPPathSegment.setAliasForm(int)>
				xmppath.add(((XMPPathSegment) (s)));
	//  110  238:aload_2         
	//  111  239:aload_0         
	//  112  240:invokevirtual   #117 <Method void XMPPath.add(XMPPathSegment)>
				return;
	//  113  243:return          
			}
			if(((XMPAliasInfo) (pathposition)).getAliasForm().isArray())
	//* 114  244:aload_1         
	//* 115  245:invokeinterface #180 <Method AliasOptions XMPAliasInfo.getAliasForm()>
	//* 116  250:invokevirtual   #197 <Method boolean AliasOptions.isArray()>
	//* 117  253:ifeq            130
			{
				s = ((String) (new XMPPathSegment("[1]", 3)));
	//  118  256:new             #59  <Class XMPPathSegment>
	//  119  259:dup             
	//  120  260:ldc1            #199 <String "[1]">
	//  121  262:iconst_3        
	//  122  263:invokespecial   #127 <Method void XMPPathSegment(String, int)>
	//  123  266:astore_0        
				((XMPPathSegment) (s)).setAlias(true);
	//  124  267:aload_0         
	//  125  268:iconst_1        
	//  126  269:invokevirtual   #176 <Method void XMPPathSegment.setAlias(boolean)>
				((XMPPathSegment) (s)).setAliasForm(((XMPAliasInfo) (pathposition)).getAliasForm().getOptions());
	//  127  272:aload_0         
	//  128  273:aload_1         
	//  129  274:invokeinterface #180 <Method AliasOptions XMPAliasInfo.getAliasForm()>
	//  130  279:invokevirtual   #185 <Method int AliasOptions.getOptions()>
	//  131  282:invokevirtual   #188 <Method void XMPPathSegment.setAliasForm(int)>
				xmppath.add(((XMPPathSegment) (s)));
	//  132  285:aload_2         
	//  133  286:aload_0         
	//  134  287:invokevirtual   #117 <Method void XMPPath.add(XMPPathSegment)>
				return;
	//  135  290:return          
			}
		}
	}

	private static XMPPathSegment parseStructSegment(PathPosition pathposition)
		throws XMPException
	{
		pathposition.nameStart = pathposition.stepBegin;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field int PathPosition.stepBegin>
	//    3    5:putfield        #100 <Field int PathPosition.nameStart>
		for(; pathposition.stepEnd < pathposition.path.length() && "/[*".indexOf(((int) (pathposition.path.charAt(pathposition.stepEnd)))) < 0; pathposition.stepEnd = pathposition.stepEnd + 1);
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field int PathPosition.stepEnd>
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field String PathPosition.path>
	//    8   16:invokevirtual   #42  <Method int String.length()>
	//    9   19:icmpge          54
	//   10   22:ldc1            #141 <String "/[*">
	//   11   24:aload_0         
	//   12   25:getfield        #28  <Field String PathPosition.path>
	//   13   28:aload_0         
	//   14   29:getfield        #36  <Field int PathPosition.stepEnd>
	//   15   32:invokevirtual   #53  <Method char String.charAt(int)>
	//   16   35:invokevirtual   #145 <Method int String.indexOf(int)>
	//   17   38:ifge            54
	//   18   41:aload_0         
	//   19   42:aload_0         
	//   20   43:getfield        #36  <Field int PathPosition.stepEnd>
	//   21   46:iconst_1        
	//   22   47:iadd            
	//   23   48:putfield        #36  <Field int PathPosition.stepEnd>
	//*  24   51:goto            8
		pathposition.nameEnd = pathposition.stepEnd;
	//   25   54:aload_0         
	//   26   55:aload_0         
	//   27   56:getfield        #36  <Field int PathPosition.stepEnd>
	//   28   59:putfield        #107 <Field int PathPosition.nameEnd>
		if(pathposition.stepEnd == pathposition.stepBegin)
	//*  29   62:aload_0         
	//*  30   63:getfield        #36  <Field int PathPosition.stepEnd>
	//*  31   66:aload_0         
	//*  32   67:getfield        #45  <Field int PathPosition.stepBegin>
	//*  33   70:icmpne          85
			throw new XMPException("Empty XMPPath segment", 102);
	//   34   73:new             #13  <Class XMPException>
	//   35   76:dup             
	//   36   77:ldc1            #201 <String "Empty XMPPath segment">
	//   37   79:bipush          102
	//   38   81:invokespecial   #18  <Method void XMPException(String, int)>
	//   39   84:athrow          
		else
			return new XMPPathSegment(pathposition.path.substring(pathposition.stepBegin, pathposition.stepEnd), 1);
	//   40   85:new             #59  <Class XMPPathSegment>
	//   41   88:dup             
	//   42   89:aload_0         
	//   43   90:getfield        #28  <Field String PathPosition.path>
	//   44   93:aload_0         
	//   45   94:getfield        #45  <Field int PathPosition.stepBegin>
	//   46   97:aload_0         
	//   47   98:getfield        #36  <Field int PathPosition.stepEnd>
	//   48  101:invokevirtual   #110 <Method String String.substring(int, int)>
	//   49  104:iconst_1        
	//   50  105:invokespecial   #127 <Method void XMPPathSegment(String, int)>
	//   51  108:areturn         
	}

	private static void skipPathDelimiter(String s, PathPosition pathposition)
		throws XMPException
	{
		if(s.charAt(pathposition.stepBegin) == '/')
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:getfield        #45  <Field int PathPosition.stepBegin>
	//*   3    5:invokevirtual   #53  <Method char String.charAt(int)>
	//*   4    8:bipush          47
	//*   5   10:icmpne          46
		{
			pathposition.stepBegin = pathposition.stepBegin + 1;
	//    6   13:aload_1         
	//    7   14:aload_1         
	//    8   15:getfield        #45  <Field int PathPosition.stepBegin>
	//    9   18:iconst_1        
	//   10   19:iadd            
	//   11   20:putfield        #45  <Field int PathPosition.stepBegin>
			if(pathposition.stepBegin >= s.length())
	//*  12   23:aload_1         
	//*  13   24:getfield        #45  <Field int PathPosition.stepBegin>
	//*  14   27:aload_0         
	//*  15   28:invokevirtual   #42  <Method int String.length()>
	//*  16   31:icmplt          46
				throw new XMPException("Empty XMPPath segment", 102);
	//   17   34:new             #13  <Class XMPException>
	//   18   37:dup             
	//   19   38:ldc1            #201 <String "Empty XMPPath segment">
	//   20   40:bipush          102
	//   21   42:invokespecial   #18  <Method void XMPException(String, int)>
	//   22   45:athrow          
		}
		if(s.charAt(pathposition.stepBegin) == '*')
	//*  23   46:aload_0         
	//*  24   47:aload_1         
	//*  25   48:getfield        #45  <Field int PathPosition.stepBegin>
	//*  26   51:invokevirtual   #53  <Method char String.charAt(int)>
	//*  27   54:bipush          42
	//*  28   56:icmpne          105
		{
			pathposition.stepBegin = pathposition.stepBegin + 1;
	//   29   59:aload_1         
	//   30   60:aload_1         
	//   31   61:getfield        #45  <Field int PathPosition.stepBegin>
	//   32   64:iconst_1        
	//   33   65:iadd            
	//   34   66:putfield        #45  <Field int PathPosition.stepBegin>
			if(pathposition.stepBegin >= s.length() || s.charAt(pathposition.stepBegin) != '[')
	//*  35   69:aload_1         
	//*  36   70:getfield        #45  <Field int PathPosition.stepBegin>
	//*  37   73:aload_0         
	//*  38   74:invokevirtual   #42  <Method int String.length()>
	//*  39   77:icmpge          93
	//*  40   80:aload_0         
	//*  41   81:aload_1         
	//*  42   82:getfield        #45  <Field int PathPosition.stepBegin>
	//*  43   85:invokevirtual   #53  <Method char String.charAt(int)>
	//*  44   88:bipush          91
	//*  45   90:icmpeq          105
				throw new XMPException("Missing '[' after '*'", 102);
	//   46   93:new             #13  <Class XMPException>
	//   47   96:dup             
	//   48   97:ldc1            #203 <String "Missing '[' after '*'">
	//   49   99:bipush          102
	//   50  101:invokespecial   #18  <Method void XMPException(String, int)>
	//   51  104:athrow          
		}
	//   52  105:return          
	}

	private static void verifyQualName(String s)
		throws XMPException
	{
		int i = s.indexOf(':');
	//    0    0:aload_0         
	//    1    1:bipush          58
	//    2    3:invokevirtual   #145 <Method int String.indexOf(int)>
	//    3    6:istore_1        
		if(i > 0)
	//*   4    7:iload_1         
	//*   5    8:ifle            50
		{
			s = s.substring(0, i);
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:iload_1         
	//    9   14:invokevirtual   #110 <Method String String.substring(int, int)>
	//   10   17:astore_0        
			if(Utils.isXMLNameNS(s))
	//*  11   18:aload_0         
	//*  12   19:invokestatic    #208 <Method boolean Utils.isXMLNameNS(String)>
	//*  13   22:ifeq            50
				if(XMPMetaFactory.getSchemaRegistry().getNamespaceURI(s) != null)
	//*  14   25:invokestatic    #157 <Method XMPSchemaRegistry XMPMetaFactory.getSchemaRegistry()>
	//*  15   28:aload_0         
	//*  16   29:invokeinterface #212 <Method String XMPSchemaRegistry.getNamespaceURI(String)>
	//*  17   34:ifnull          38
					return;
	//   18   37:return          
				else
					throw new XMPException("Unknown namespace prefix for qualified name", 102);
	//   19   38:new             #13  <Class XMPException>
	//   20   41:dup             
	//   21   42:ldc1            #214 <String "Unknown namespace prefix for qualified name">
	//   22   44:bipush          102
	//   23   46:invokespecial   #18  <Method void XMPException(String, int)>
	//   24   49:athrow          
		}
		throw new XMPException("Ill-formed qualified name", 102);
	//   25   50:new             #13  <Class XMPException>
	//   26   53:dup             
	//   27   54:ldc1            #216 <String "Ill-formed qualified name">
	//   28   56:bipush          102
	//   29   58:invokespecial   #18  <Method void XMPException(String, int)>
	//   30   61:athrow          
	}

	private static void verifySimpleXMLName(String s)
		throws XMPException
	{
		if(!Utils.isXMLName(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #220 <Method boolean Utils.isXMLName(String)>
	//*   2    4:ifne            19
			throw new XMPException("Bad XML name", 102);
	//    3    7:new             #13  <Class XMPException>
	//    4   10:dup             
	//    5   11:ldc1            #222 <String "Bad XML name">
	//    6   13:bipush          102
	//    7   15:invokespecial   #18  <Method void XMPException(String, int)>
	//    8   18:athrow          
		else
			return;
	//    9   19:return          
	}

	private static String verifyXPathRoot(String s, String s1)
		throws XMPException
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #42  <Method int String.length()>
	//*   4    8:ifne            23
			throw new XMPException("Schema namespace URI is required", 101);
	//    5   11:new             #13  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #224 <String "Schema namespace URI is required">
	//    8   17:bipush          101
	//    9   19:invokespecial   #18  <Method void XMPException(String, int)>
	//   10   22:athrow          
		if(s1.charAt(0) == '?' || s1.charAt(0) == '@')
	//*  11   23:aload_1         
	//*  12   24:iconst_0        
	//*  13   25:invokevirtual   #53  <Method char String.charAt(int)>
	//*  14   28:bipush          63
	//*  15   30:icmpeq          43
	//*  16   33:aload_1         
	//*  17   34:iconst_0        
	//*  18   35:invokevirtual   #53  <Method char String.charAt(int)>
	//*  19   38:bipush          64
	//*  20   40:icmpne          55
			throw new XMPException("Top level name must not be a qualifier", 102);
	//   21   43:new             #13  <Class XMPException>
	//   22   46:dup             
	//   23   47:ldc1            #226 <String "Top level name must not be a qualifier">
	//   24   49:bipush          102
	//   25   51:invokespecial   #18  <Method void XMPException(String, int)>
	//   26   54:athrow          
		if(s1.indexOf('/') >= 0 || s1.indexOf('[') >= 0)
	//*  27   55:aload_1         
	//*  28   56:bipush          47
	//*  29   58:invokevirtual   #145 <Method int String.indexOf(int)>
	//*  30   61:ifge            73
	//*  31   64:aload_1         
	//*  32   65:bipush          91
	//*  33   67:invokevirtual   #145 <Method int String.indexOf(int)>
	//*  34   70:iflt            85
			throw new XMPException("Top level name must be simple", 102);
	//   35   73:new             #13  <Class XMPException>
	//   36   76:dup             
	//   37   77:ldc1            #228 <String "Top level name must be simple">
	//   38   79:bipush          102
	//   39   81:invokespecial   #18  <Method void XMPException(String, int)>
	//   40   84:athrow          
		String s2 = XMPMetaFactory.getSchemaRegistry().getNamespacePrefix(s);
	//   41   85:invokestatic    #157 <Method XMPSchemaRegistry XMPMetaFactory.getSchemaRegistry()>
	//   42   88:aload_0         
	//   43   89:invokeinterface #231 <Method String XMPSchemaRegistry.getNamespacePrefix(String)>
	//   44   94:astore_3        
		if(s2 == null)
	//*  45   95:aload_3         
	//*  46   96:ifnonnull       111
			throw new XMPException("Unregistered schema namespace URI", 101);
	//   47   99:new             #13  <Class XMPException>
	//   48  102:dup             
	//   49  103:ldc1            #233 <String "Unregistered schema namespace URI">
	//   50  105:bipush          101
	//   51  107:invokespecial   #18  <Method void XMPException(String, int)>
	//   52  110:athrow          
		int i = s1.indexOf(':');
	//   53  111:aload_1         
	//   54  112:bipush          58
	//   55  114:invokevirtual   #145 <Method int String.indexOf(int)>
	//   56  117:istore_2        
		if(i < 0)
	//*  57  118:iload_2         
	//*  58  119:ifge            147
		{
			verifySimpleXMLName(s1);
	//   59  122:aload_1         
	//   60  123:invokestatic    #235 <Method void verifySimpleXMLName(String)>
			s1 = (new StringBuilder()).append(s2).append(s1).toString();
	//   61  126:new             #68  <Class StringBuilder>
	//   62  129:dup             
	//   63  130:invokespecial   #69  <Method void StringBuilder()>
	//   64  133:aload_3         
	//   65  134:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   66  137:aload_1         
	//   67  138:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   68  141:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   69  144:astore_1        
		} else
	//*  70  145:aload_1         
	//*  71  146:areturn         
		{
			verifySimpleXMLName(s1.substring(0, i));
	//   72  147:aload_1         
	//   73  148:iconst_0        
	//   74  149:iload_2         
	//   75  150:invokevirtual   #110 <Method String String.substring(int, int)>
	//   76  153:invokestatic    #235 <Method void verifySimpleXMLName(String)>
			verifySimpleXMLName(s1.substring(i));
	//   77  156:aload_1         
	//   78  157:iload_2         
	//   79  158:invokevirtual   #79  <Method String String.substring(int)>
	//   80  161:invokestatic    #235 <Method void verifySimpleXMLName(String)>
			String s3 = s1.substring(0, i + 1);
	//   81  164:aload_1         
	//   82  165:iconst_0        
	//   83  166:iload_2         
	//   84  167:iconst_1        
	//   85  168:iadd            
	//   86  169:invokevirtual   #110 <Method String String.substring(int, int)>
	//   87  172:astore_3        
			s = XMPMetaFactory.getSchemaRegistry().getNamespacePrefix(s);
	//   88  173:invokestatic    #157 <Method XMPSchemaRegistry XMPMetaFactory.getSchemaRegistry()>
	//   89  176:aload_0         
	//   90  177:invokeinterface #231 <Method String XMPSchemaRegistry.getNamespacePrefix(String)>
	//   91  182:astore_0        
			if(s == null)
	//*  92  183:aload_0         
	//*  93  184:ifnonnull       199
				throw new XMPException("Unknown schema namespace prefix", 101);
	//   94  187:new             #13  <Class XMPException>
	//   95  190:dup             
	//   96  191:ldc1            #237 <String "Unknown schema namespace prefix">
	//   97  193:bipush          101
	//   98  195:invokespecial   #18  <Method void XMPException(String, int)>
	//   99  198:athrow          
			if(!s3.equals(((Object) (s))))
	//* 100  199:aload_3         
	//* 101  200:aload_0         
	//* 102  201:invokevirtual   #92  <Method boolean String.equals(Object)>
	//* 103  204:ifne            145
				throw new XMPException("Schema namespace URI and prefix mismatch", 101);
	//  104  207:new             #13  <Class XMPException>
	//  105  210:dup             
	//  106  211:ldc1            #239 <String "Schema namespace URI and prefix mismatch">
	//  107  213:bipush          101
	//  108  215:invokespecial   #18  <Method void XMPException(String, int)>
	//  109  218:athrow          
		}
		return s1;
	}
}
