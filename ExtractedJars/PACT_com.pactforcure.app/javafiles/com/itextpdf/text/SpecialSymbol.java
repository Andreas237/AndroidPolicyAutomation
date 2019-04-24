// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;


// Referenced classes of package com.itextpdf.text:
//			Chunk, Font

public class SpecialSymbol
{

	public SpecialSymbol()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Chunk get(char c, Font font)
	{
		char c1 = getCorrespondingSymbol(c);
	//    0    0:iload_0         
	//    1    1:invokestatic    #15  <Method char getCorrespondingSymbol(char)>
	//    2    4:istore_2        
		if(c1 == ' ')
	//*   3    5:iload_2         
	//*   4    6:bipush          32
	//*   5    8:icmpne          24
			return new Chunk(String.valueOf(c), font);
	//    6   11:new             #17  <Class Chunk>
	//    7   14:dup             
	//    8   15:iload_0         
	//    9   16:invokestatic    #23  <Method String String.valueOf(char)>
	//   10   19:aload_1         
	//   11   20:invokespecial   #26  <Method void Chunk(String, Font)>
	//   12   23:areturn         
		else
			return new Chunk(String.valueOf(c1), new Font(Font.FontFamily.SYMBOL, font.getSize(), font.getStyle(), font.getColor()));
	//   13   24:new             #17  <Class Chunk>
	//   14   27:dup             
	//   15   28:iload_2         
	//   16   29:invokestatic    #23  <Method String String.valueOf(char)>
	//   17   32:new             #28  <Class Font>
	//   18   35:dup             
	//   19   36:getstatic       #34  <Field Font$FontFamily Font$FontFamily.SYMBOL>
	//   20   39:aload_1         
	//   21   40:invokevirtual   #38  <Method float Font.getSize()>
	//   22   43:aload_1         
	//   23   44:invokevirtual   #42  <Method int Font.getStyle()>
	//   24   47:aload_1         
	//   25   48:invokevirtual   #46  <Method BaseColor Font.getColor()>
	//   26   51:invokespecial   #49  <Method void Font(Font$FontFamily, float, int, BaseColor)>
	//   27   54:invokespecial   #26  <Method void Chunk(String, Font)>
	//   28   57:areturn         
	}

	public static char getCorrespondingSymbol(char c)
	{
		switch(c)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     913 969: default 244
	//	               913 247
	//	               914 250
	//	               915 253
	//	               916 256
	//	               917 259
	//	               918 262
	//	               919 265
	//	               920 268
	//	               921 271
	//	               922 274
	//	               923 277
	//	               924 280
	//	               925 283
	//	               926 286
	//	               927 289
	//	               928 292
	//	               929 295
	//	               930 244
	//	               931 298
	//	               932 301
	//	               933 304
	//	               934 307
	//	               935 310
	//	               936 313
	//	               937 316
	//	               938 244
	//	               939 244
	//	               940 244
	//	               941 244
	//	               942 244
	//	               943 244
	//	               944 244
	//	               945 319
	//	               946 322
	//	               947 325
	//	               948 328
	//	               949 331
	//	               950 334
	//	               951 337
	//	               952 340
	//	               953 343
	//	               954 346
	//	               955 349
	//	               956 352
	//	               957 355
	//	               958 358
	//	               959 361
	//	               960 364
	//	               961 367
	//	               962 370
	//	               963 373
	//	               964 376
	//	               965 379
	//	               966 382
	//	               967 385
	//	               968 388
	//	               969 391
		case 930: 
		case 938: 
		case 939: 
		case 940: 
		case 941: 
		case 942: 
		case 943: 
		case 944: 
		default:
			return ' ';
	//    2  244:bipush          32
	//    3  246:ireturn         

		case 913: 
			return 'A';
	//    4  247:bipush          65
	//    5  249:ireturn         

		case 914: 
			return 'B';
	//    6  250:bipush          66
	//    7  252:ireturn         

		case 915: 
			return 'G';
	//    8  253:bipush          71
	//    9  255:ireturn         

		case 916: 
			return 'D';
	//   10  256:bipush          68
	//   11  258:ireturn         

		case 917: 
			return 'E';
	//   12  259:bipush          69
	//   13  261:ireturn         

		case 918: 
			return 'Z';
	//   14  262:bipush          90
	//   15  264:ireturn         

		case 919: 
			return 'H';
	//   16  265:bipush          72
	//   17  267:ireturn         

		case 920: 
			return 'Q';
	//   18  268:bipush          81
	//   19  270:ireturn         

		case 921: 
			return 'I';
	//   20  271:bipush          73
	//   21  273:ireturn         

		case 922: 
			return 'K';
	//   22  274:bipush          75
	//   23  276:ireturn         

		case 923: 
			return 'L';
	//   24  277:bipush          76
	//   25  279:ireturn         

		case 924: 
			return 'M';
	//   26  280:bipush          77
	//   27  282:ireturn         

		case 925: 
			return 'N';
	//   28  283:bipush          78
	//   29  285:ireturn         

		case 926: 
			return 'X';
	//   30  286:bipush          88
	//   31  288:ireturn         

		case 927: 
			return 'O';
	//   32  289:bipush          79
	//   33  291:ireturn         

		case 928: 
			return 'P';
	//   34  292:bipush          80
	//   35  294:ireturn         

		case 929: 
			return 'R';
	//   36  295:bipush          82
	//   37  297:ireturn         

		case 931: 
			return 'S';
	//   38  298:bipush          83
	//   39  300:ireturn         

		case 932: 
			return 'T';
	//   40  301:bipush          84
	//   41  303:ireturn         

		case 933: 
			return 'U';
	//   42  304:bipush          85
	//   43  306:ireturn         

		case 934: 
			return 'F';
	//   44  307:bipush          70
	//   45  309:ireturn         

		case 935: 
			return 'C';
	//   46  310:bipush          67
	//   47  312:ireturn         

		case 936: 
			return 'Y';
	//   48  313:bipush          89
	//   49  315:ireturn         

		case 937: 
			return 'W';
	//   50  316:bipush          87
	//   51  318:ireturn         

		case 945: 
			return 'a';
	//   52  319:bipush          97
	//   53  321:ireturn         

		case 946: 
			return 'b';
	//   54  322:bipush          98
	//   55  324:ireturn         

		case 947: 
			return 'g';
	//   56  325:bipush          103
	//   57  327:ireturn         

		case 948: 
			return 'd';
	//   58  328:bipush          100
	//   59  330:ireturn         

		case 949: 
			return 'e';
	//   60  331:bipush          101
	//   61  333:ireturn         

		case 950: 
			return 'z';
	//   62  334:bipush          122
	//   63  336:ireturn         

		case 951: 
			return 'h';
	//   64  337:bipush          104
	//   65  339:ireturn         

		case 952: 
			return 'q';
	//   66  340:bipush          113
	//   67  342:ireturn         

		case 953: 
			return 'i';
	//   68  343:bipush          105
	//   69  345:ireturn         

		case 954: 
			return 'k';
	//   70  346:bipush          107
	//   71  348:ireturn         

		case 955: 
			return 'l';
	//   72  349:bipush          108
	//   73  351:ireturn         

		case 956: 
			return 'm';
	//   74  352:bipush          109
	//   75  354:ireturn         

		case 957: 
			return 'n';
	//   76  355:bipush          110
	//   77  357:ireturn         

		case 958: 
			return 'x';
	//   78  358:bipush          120
	//   79  360:ireturn         

		case 959: 
			return 'o';
	//   80  361:bipush          111
	//   81  363:ireturn         

		case 960: 
			return 'p';
	//   82  364:bipush          112
	//   83  366:ireturn         

		case 961: 
			return 'r';
	//   84  367:bipush          114
	//   85  369:ireturn         

		case 962: 
			return 'V';
	//   86  370:bipush          86
	//   87  372:ireturn         

		case 963: 
			return 's';
	//   88  373:bipush          115
	//   89  375:ireturn         

		case 964: 
			return 't';
	//   90  376:bipush          116
	//   91  378:ireturn         

		case 965: 
			return 'u';
	//   92  379:bipush          117
	//   93  381:ireturn         

		case 966: 
			return 'f';
	//   94  382:bipush          102
	//   95  384:ireturn         

		case 967: 
			return 'c';
	//   96  385:bipush          99
	//   97  387:ireturn         

		case 968: 
			return 'y';
	//   98  388:bipush          121
	//   99  390:ireturn         

		case 969: 
			return 'w';
	//  100  391:bipush          119
	//  101  393:ireturn         
		}
	}

	public static int index(String s)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method int String.length()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          34
			if(getCorrespondingSymbol(s.charAt(i)) != ' ')
	//*   8   12:aload_0         
	//*   9   13:iload_1         
	//*  10   14:invokevirtual   #58  <Method char String.charAt(int)>
	//*  11   17:invokestatic    #15  <Method char getCorrespondingSymbol(char)>
	//*  12   20:bipush          32
	//*  13   22:icmpeq          27
				return i;
	//   14   25:iload_1         
	//   15   26:ireturn         

	//   16   27:iload_1         
	//   17   28:iconst_1        
	//   18   29:iadd            
	//   19   30:istore_1        
	//*  20   31:goto            7
		return -1;
	//   21   34:iconst_m1       
	//   22   35:ireturn         
	}
}
