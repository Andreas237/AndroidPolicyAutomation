// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;


// Referenced classes of package ch.qos.logback.core.util:
//			CharSequenceState

class CharSequenceToRegexMapper
{

	CharSequenceToRegexMapper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private String number(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("\\d{");
	//    4    8:aload_2         
	//    5    9:ldc1            #16  <String "\\d{">
	//    6   11:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(i);
	//    8   15:aload_2         
	//    9   16:iload_1         
	//   10   17:invokevirtual   #23  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		stringbuilder.append("}");
	//   12   21:aload_2         
	//   13   22:ldc1            #25  <String "}">
	//   14   24:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		return stringbuilder.toString();
	//   16   28:aload_2         
	//   17   29:invokevirtual   #29  <Method String StringBuilder.toString()>
	//   18   32:areturn         
	}

	String toRegex(CharSequenceState charsequencestate)
	{
		int i = charsequencestate.occurrences;
	//    0    0:aload_1         
	//    1    1:getfield        #37  <Field int CharSequenceState.occurrences>
	//    2    4:istore_3        
		char c = charsequencestate.c;
	//    3    5:aload_1         
	//    4    6:getfield        #41  <Field char CharSequenceState.c>
	//    5    9:istore_2        
		switch(charsequencestate.c)
	//*   6   10:aload_1         
	//*   7   11:getfield        #41  <Field char CharSequenceState.c>
		{
	//*   8   14:lookupswitch    22: default 200
	//	               39: 276
	//	               46: 273
	//	               68: 267
	//	               69: 264
	//	               70: 267
	//	               71: 261
	//	               72: 267
	//	               75: 267
	//	               77: 247
	//	               83: 267
	//	               87: 267
	//	               90: 244
	//	               92: 234
	//	               97: 231
	//	               100: 267
	//	               104: 267
	//	               107: 267
	//	               109: 267
	//	               115: 267
	//	               119: 267
	//	               121: 267
	//	               122: 261
		default:
			if(i == 1)
	//*   9  200:iload_3         
	//*  10  201:iconst_1        
	//*  11  202:icmpne          294
			{
				charsequencestate = ((CharSequenceState) (new StringBuilder()));
	//   12  205:new             #13  <Class StringBuilder>
	//   13  208:dup             
	//   14  209:invokespecial   #14  <Method void StringBuilder()>
	//   15  212:astore_1        
				((StringBuilder) (charsequencestate)).append("");
	//   16  213:aload_1         
	//   17  214:ldc1            #43  <String "">
	//   18  216:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   19  219:pop             
				((StringBuilder) (charsequencestate)).append(c);
	//   20  220:aload_1         
	//   21  221:iload_2         
	//   22  222:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   23  225:pop             
			} else
	//*  24  226:aload_1         
	//*  25  227:invokevirtual   #29  <Method String StringBuilder.toString()>
	//*  26  230:areturn         
	//*  27  231:ldc1            #48  <String ".{2}">
	//*  28  233:areturn         
	//*  29  234:new             #50  <Class IllegalStateException>
	//*  30  237:dup             
	//*  31  238:ldc1            #52  <String "Forward slashes are not allowed">
	//*  32  240:invokespecial   #55  <Method void IllegalStateException(String)>
	//*  33  243:athrow          
	//*  34  244:ldc1            #57  <String "(\\+|-)\\d{4}">
	//*  35  246:areturn         
	//*  36  247:iload_3         
	//*  37  248:iconst_3        
	//*  38  249:icmplt          255
	//*  39  252:ldc1            #59  <String ".{3,12}">
	//*  40  254:areturn         
	//*  41  255:aload_0         
	//*  42  256:iload_3         
	//*  43  257:invokespecial   #61  <Method String number(int)>
	//*  44  260:areturn         
	//*  45  261:ldc1            #63  <String ".*">
	//*  46  263:areturn         
	//*  47  264:ldc1            #65  <String ".{2,12}">
	//*  48  266:areturn         
	//*  49  267:aload_0         
	//*  50  268:iload_3         
	//*  51  269:invokespecial   #61  <Method String number(int)>
	//*  52  272:areturn         
	//*  53  273:ldc1            #67  <String "\\.">
	//*  54  275:areturn         
	//*  55  276:iload_3         
	//*  56  277:iconst_1        
	//*  57  278:icmpne          284
	//*  58  281:ldc1            #43  <String "">
	//*  59  283:areturn         
	//*  60  284:new             #50  <Class IllegalStateException>
	//*  61  287:dup             
	//*  62  288:ldc1            #69  <String "Too many single quotes">
	//*  63  290:invokespecial   #55  <Method void IllegalStateException(String)>
	//*  64  293:athrow          
			{
				charsequencestate = ((CharSequenceState) (new StringBuilder()));
	//   65  294:new             #13  <Class StringBuilder>
	//   66  297:dup             
	//   67  298:invokespecial   #14  <Method void StringBuilder()>
	//   68  301:astore_1        
				((StringBuilder) (charsequencestate)).append(c);
	//   69  302:aload_1         
	//   70  303:iload_2         
	//   71  304:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   72  307:pop             
				((StringBuilder) (charsequencestate)).append("{");
	//   73  308:aload_1         
	//   74  309:ldc1            #71  <String "{">
	//   75  311:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   76  314:pop             
				((StringBuilder) (charsequencestate)).append(i);
	//   77  315:aload_1         
	//   78  316:iload_3         
	//   79  317:invokevirtual   #23  <Method StringBuilder StringBuilder.append(int)>
	//   80  320:pop             
				((StringBuilder) (charsequencestate)).append("}");
	//   81  321:aload_1         
	//   82  322:ldc1            #25  <String "}">
	//   83  324:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   84  327:pop             
			}
			return ((StringBuilder) (charsequencestate)).toString();

		case 97: // 'a'
			return ".{2}";

		case 92: // '\\'
			throw new IllegalStateException("Forward slashes are not allowed");

		case 90: // 'Z'
			return "(\\+|-)\\d{4}";

		case 77: // 'M'
			if(i >= 3)
				return ".{3,12}";
			else
				return number(i);

		case 71: // 'G'
		case 122: // 'z'
			return ".*";

		case 69: // 'E'
			return ".{2,12}";

		case 68: // 'D'
		case 70: // 'F'
		case 72: // 'H'
		case 75: // 'K'
		case 83: // 'S'
		case 87: // 'W'
		case 100: // 'd'
		case 104: // 'h'
		case 107: // 'k'
		case 109: // 'm'
		case 115: // 's'
		case 119: // 'w'
		case 121: // 'y'
			return number(i);

		case 46: // '.'
			return "\\.";

		case 39: // '\''
			break;
		}
		if(i == 1)
			return "";
		else
			throw new IllegalStateException("Too many single quotes");
	//*  85  328:goto            226
	}
}
