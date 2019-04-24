// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.exceptions.InvalidPdfException;
import com.itextpdf.text.io.RandomAccessSourceFactory;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf:
//			RandomAccessFileOrArray

public class PRTokeniser
{
	public static final class TokenType extends Enum
	{

		public static TokenType valueOf(String s)
		{
			return (TokenType)Enum.valueOf(com/itextpdf/text/pdf/PRTokeniser$TokenType, s);
		//    0    0:ldc1            #2   <Class PRTokeniser$TokenType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #71  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PRTokeniser$TokenType>
		//    4    9:areturn         
		}

		public static TokenType[] values()
		{
			return (TokenType[])((TokenType []) ($VALUES)).clone();
		//    0    0:getstatic       #63  <Field PRTokeniser$TokenType[] $VALUES>
		//    1    3:invokevirtual   #78  <Method Object _5B_Lcom.itextpdf.text.pdf.PRTokeniser$TokenType_3B_.clone()>
		//    2    6:checkcast       #74  <Class PRTokeniser$TokenType[]>
		//    3    9:areturn         
		}

		private static final TokenType $VALUES[];
		public static final TokenType COMMENT;
		public static final TokenType ENDOFFILE;
		public static final TokenType END_ARRAY;
		public static final TokenType END_DIC;
		public static final TokenType NAME;
		public static final TokenType NUMBER;
		public static final TokenType OTHER;
		public static final TokenType REF;
		public static final TokenType START_ARRAY;
		public static final TokenType START_DIC;
		public static final TokenType STRING;

		static 
		{
			NUMBER = new TokenType("NUMBER", 0);
		//    0    0:new             #2   <Class PRTokeniser$TokenType>
		//    1    3:dup             
		//    2    4:ldc1            #25  <String "NUMBER">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
		//    5   10:putstatic       #31  <Field PRTokeniser$TokenType NUMBER>
			STRING = new TokenType("STRING", 1);
		//    6   13:new             #2   <Class PRTokeniser$TokenType>
		//    7   16:dup             
		//    8   17:ldc1            #32  <String "STRING">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
		//   11   23:putstatic       #34  <Field PRTokeniser$TokenType STRING>
			NAME = new TokenType("NAME", 2);
		//   12   26:new             #2   <Class PRTokeniser$TokenType>
		//   13   29:dup             
		//   14   30:ldc1            #35  <String "NAME">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
		//   17   36:putstatic       #37  <Field PRTokeniser$TokenType NAME>
			COMMENT = new TokenType("COMMENT", 3);
		//   18   39:new             #2   <Class PRTokeniser$TokenType>
		//   19   42:dup             
		//   20   43:ldc1            #38  <String "COMMENT">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
		//   23   49:putstatic       #40  <Field PRTokeniser$TokenType COMMENT>
			START_ARRAY = new TokenType("START_ARRAY", 4);
		//   24   52:new             #2   <Class PRTokeniser$TokenType>
		//   25   55:dup             
		//   26   56:ldc1            #41  <String "START_ARRAY">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
		//   29   62:putstatic       #43  <Field PRTokeniser$TokenType START_ARRAY>
			END_ARRAY = new TokenType("END_ARRAY", 5);
		//   30   65:new             #2   <Class PRTokeniser$TokenType>
		//   31   68:dup             
		//   32   69:ldc1            #44  <String "END_ARRAY">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
		//   35   75:putstatic       #46  <Field PRTokeniser$TokenType END_ARRAY>
			START_DIC = new TokenType("START_DIC", 6);
		//   36   78:new             #2   <Class PRTokeniser$TokenType>
		//   37   81:dup             
		//   38   82:ldc1            #47  <String "START_DIC">
		//   39   84:bipush          6
		//   40   86:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
		//   41   89:putstatic       #49  <Field PRTokeniser$TokenType START_DIC>
			END_DIC = new TokenType("END_DIC", 7);
		//   42   92:new             #2   <Class PRTokeniser$TokenType>
		//   43   95:dup             
		//   44   96:ldc1            #50  <String "END_DIC">
		//   45   98:bipush          7
		//   46  100:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
		//   47  103:putstatic       #52  <Field PRTokeniser$TokenType END_DIC>
			REF = new TokenType("REF", 8);
		//   48  106:new             #2   <Class PRTokeniser$TokenType>
		//   49  109:dup             
		//   50  110:ldc1            #53  <String "REF">
		//   51  112:bipush          8
		//   52  114:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
		//   53  117:putstatic       #55  <Field PRTokeniser$TokenType REF>
			OTHER = new TokenType("OTHER", 9);
		//   54  120:new             #2   <Class PRTokeniser$TokenType>
		//   55  123:dup             
		//   56  124:ldc1            #56  <String "OTHER">
		//   57  126:bipush          9
		//   58  128:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
		//   59  131:putstatic       #58  <Field PRTokeniser$TokenType OTHER>
			ENDOFFILE = new TokenType("ENDOFFILE", 10);
		//   60  134:new             #2   <Class PRTokeniser$TokenType>
		//   61  137:dup             
		//   62  138:ldc1            #59  <String "ENDOFFILE">
		//   63  140:bipush          10
		//   64  142:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
		//   65  145:putstatic       #61  <Field PRTokeniser$TokenType ENDOFFILE>
			$VALUES = (new TokenType[] {
				NUMBER, STRING, NAME, COMMENT, START_ARRAY, END_ARRAY, START_DIC, END_DIC, REF, OTHER, 
				ENDOFFILE
			});
		//   66  148:bipush          11
		//   67  150:anewarray       TokenType[]
		//   68  153:dup             
		//   69  154:iconst_0        
		//   70  155:getstatic       #31  <Field PRTokeniser$TokenType NUMBER>
		//   71  158:aastore         
		//   72  159:dup             
		//   73  160:iconst_1        
		//   74  161:getstatic       #34  <Field PRTokeniser$TokenType STRING>
		//   75  164:aastore         
		//   76  165:dup             
		//   77  166:iconst_2        
		//   78  167:getstatic       #37  <Field PRTokeniser$TokenType NAME>
		//   79  170:aastore         
		//   80  171:dup             
		//   81  172:iconst_3        
		//   82  173:getstatic       #40  <Field PRTokeniser$TokenType COMMENT>
		//   83  176:aastore         
		//   84  177:dup             
		//   85  178:iconst_4        
		//   86  179:getstatic       #43  <Field PRTokeniser$TokenType START_ARRAY>
		//   87  182:aastore         
		//   88  183:dup             
		//   89  184:iconst_5        
		//   90  185:getstatic       #46  <Field PRTokeniser$TokenType END_ARRAY>
		//   91  188:aastore         
		//   92  189:dup             
		//   93  190:bipush          6
		//   94  192:getstatic       #49  <Field PRTokeniser$TokenType START_DIC>
		//   95  195:aastore         
		//   96  196:dup             
		//   97  197:bipush          7
		//   98  199:getstatic       #52  <Field PRTokeniser$TokenType END_DIC>
		//   99  202:aastore         
		//  100  203:dup             
		//  101  204:bipush          8
		//  102  206:getstatic       #55  <Field PRTokeniser$TokenType REF>
		//  103  209:aastore         
		//  104  210:dup             
		//  105  211:bipush          9
		//  106  213:getstatic       #58  <Field PRTokeniser$TokenType OTHER>
		//  107  216:aastore         
		//  108  217:dup             
		//  109  218:bipush          10
		//  110  220:getstatic       #61  <Field PRTokeniser$TokenType ENDOFFILE>
		//  111  223:aastore         
		//  112  224:putstatic       #63  <Field PRTokeniser$TokenType[] $VALUES>
		//* 113  227:return          
		}

		private TokenType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #65  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public PRTokeniser(RandomAccessFileOrArray randomaccessfileorarray)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #38  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void StringBuilder()>
	//    6   12:putfield        #41  <Field StringBuilder outBuf>
		file = randomaccessfileorarray;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #43  <Field RandomAccessFileOrArray file>
	//   10   20:return          
	}

	public static long[] checkObjectStart(byte abyte0[])
	{
		abyte0 = ((byte []) (new PRTokeniser(new RandomAccessFileOrArray((new RandomAccessSourceFactory()).createSource(abyte0)))));
	//    0    0:new             #2   <Class PRTokeniser>
	//    1    3:dup             
	//    2    4:new             #49  <Class RandomAccessFileOrArray>
	//    3    7:dup             
	//    4    8:new             #51  <Class RandomAccessSourceFactory>
	//    5   11:dup             
	//    6   12:invokespecial   #52  <Method void RandomAccessSourceFactory()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #56  <Method com.itextpdf.text.io.RandomAccessSource RandomAccessSourceFactory.createSource(byte[])>
	//    9   19:invokespecial   #59  <Method void RandomAccessFileOrArray(com.itextpdf.text.io.RandomAccessSource)>
	//   10   22:invokespecial   #61  <Method void PRTokeniser(RandomAccessFileOrArray)>
	//   11   25:astore_0        
		if(!((PRTokeniser) (abyte0)).nextToken())
			break MISSING_BLOCK_LABEL_112;
	//   12   26:aload_0         
	//   13   27:invokevirtual   #65  <Method boolean nextToken()>
	//   14   30:ifeq            112
		if(((PRTokeniser) (abyte0)).getTokenType() != TokenType.NUMBER)
	//*  15   33:aload_0         
	//*  16   34:invokevirtual   #69  <Method PRTokeniser$TokenType getTokenType()>
	//*  17   37:getstatic       #72  <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//*  18   40:if_acmpeq       45
			return null;
	//   19   43:aconst_null     
	//   20   44:areturn         
		int i;
		int j;
		i = ((PRTokeniser) (abyte0)).intValue();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #76  <Method int intValue()>
	//   23   49:istore_1        
		if(!((PRTokeniser) (abyte0)).nextToken() || ((PRTokeniser) (abyte0)).getTokenType() != TokenType.NUMBER)
			break MISSING_BLOCK_LABEL_112;
	//   24   50:aload_0         
	//   25   51:invokevirtual   #65  <Method boolean nextToken()>
	//   26   54:ifeq            112
	//   27   57:aload_0         
	//   28   58:invokevirtual   #69  <Method PRTokeniser$TokenType getTokenType()>
	//   29   61:getstatic       #72  <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//   30   64:if_acmpne       112
		j = ((PRTokeniser) (abyte0)).intValue();
	//   31   67:aload_0         
	//   32   68:invokevirtual   #76  <Method int intValue()>
	//   33   71:istore_2        
		if(((PRTokeniser) (abyte0)).nextToken() && ((PRTokeniser) (abyte0)).getStringValue().equals("obj"))
	//*  34   72:aload_0         
	//*  35   73:invokevirtual   #65  <Method boolean nextToken()>
	//*  36   76:ifeq            112
	//*  37   79:aload_0         
	//*  38   80:invokevirtual   #80  <Method String getStringValue()>
	//*  39   83:ldc1            #82  <String "obj">
	//*  40   85:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  41   88:ifeq            112
		{
			long l = i;
	//   42   91:iload_1         
	//   43   92:i2l             
	//   44   93:lstore_3        
			long l1 = j;
	//   45   94:iload_2         
	//   46   95:i2l             
	//   47   96:lstore          5
			return (new long[] {
				l, l1
			});
	//   48   98:iconst_2        
	//   49   99:newarray        long[]
	//   50  101:dup             
	//   51  102:iconst_0        
	//   52  103:lload_3         
	//   53  104:lastore         
	//   54  105:dup             
	//   55  106:iconst_1        
	//   56  107:lload           5
	//   57  109:lastore         
	//   58  110:areturn         
		}
		break MISSING_BLOCK_LABEL_112;
		abyte0;
	//   59  111:astore_0        
		return null;
	//   60  112:aconst_null     
	//   61  113:areturn         
	}

	public static int getHex(int i)
	{
		if(i >= 48 && i <= 57)
	//*   0    0:iload_0         
	//*   1    1:bipush          48
	//*   2    3:icmplt          17
	//*   3    6:iload_0         
	//*   4    7:bipush          57
	//*   5    9:icmpgt          17
			return i - 48;
	//    6   12:iload_0         
	//    7   13:bipush          48
	//    8   15:isub            
	//    9   16:ireturn         
		if(i >= 65 && i <= 70)
	//*  10   17:iload_0         
	//*  11   18:bipush          65
	//*  12   20:icmplt          37
	//*  13   23:iload_0         
	//*  14   24:bipush          70
	//*  15   26:icmpgt          37
			return (i - 65) + 10;
	//   16   29:iload_0         
	//   17   30:bipush          65
	//   18   32:isub            
	//   19   33:bipush          10
	//   20   35:iadd            
	//   21   36:ireturn         
		if(i >= 97 && i <= 102)
	//*  22   37:iload_0         
	//*  23   38:bipush          97
	//*  24   40:icmplt          57
	//*  25   43:iload_0         
	//*  26   44:bipush          102
	//*  27   46:icmpgt          57
			return (i - 97) + 10;
	//   28   49:iload_0         
	//   29   50:bipush          97
	//   30   52:isub            
	//   31   53:bipush          10
	//   32   55:iadd            
	//   33   56:ireturn         
		else
			return -1;
	//   34   57:iconst_m1       
	//   35   58:ireturn         
	}

	public static final boolean isDelimiter(int i)
	{
		return i == 40 || i == 41 || i == 60 || i == 62 || i == 91 || i == 93 || i == 47 || i == 37;
	//    0    0:iload_0         
	//    1    1:bipush          40
	//    2    3:icmpeq          48
	//    3    6:iload_0         
	//    4    7:bipush          41
	//    5    9:icmpeq          48
	//    6   12:iload_0         
	//    7   13:bipush          60
	//    8   15:icmpeq          48
	//    9   18:iload_0         
	//   10   19:bipush          62
	//   11   21:icmpeq          48
	//   12   24:iload_0         
	//   13   25:bipush          91
	//   14   27:icmpeq          48
	//   15   30:iload_0         
	//   16   31:bipush          93
	//   17   33:icmpeq          48
	//   18   36:iload_0         
	//   19   37:bipush          47
	//   20   39:icmpeq          48
	//   21   42:iload_0         
	//   22   43:bipush          37
	//   23   45:icmpne          50
	//   24   48:iconst_1        
	//   25   49:ireturn         
	//   26   50:iconst_0        
	//   27   51:ireturn         
	}

	public static final boolean isDelimiterWhitespace(int i)
	{
		return delims[i + 1];
	//    0    0:getstatic       #31  <Field boolean[] delims>
	//    1    3:iload_0         
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:baload          
	//    5    7:ireturn         
	}

	public static final boolean isWhitespace(int i)
	{
		return isWhitespace(i, true);
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #97  <Method boolean isWhitespace(int, boolean)>
	//    3    5:ireturn         
	}

	public static final boolean isWhitespace(int i, boolean flag)
	{
		return flag && i == 0 || i == 9 || i == 10 || i == 12 || i == 13 || i == 32;
	//    0    0:iload_1         
	//    1    1:ifeq            8
	//    2    4:iload_0         
	//    3    5:ifeq            38
	//    4    8:iload_0         
	//    5    9:bipush          9
	//    6   11:icmpeq          38
	//    7   14:iload_0         
	//    8   15:bipush          10
	//    9   17:icmpeq          38
	//   10   20:iload_0         
	//   11   21:bipush          12
	//   12   23:icmpeq          38
	//   13   26:iload_0         
	//   14   27:bipush          13
	//   15   29:icmpeq          38
	//   16   32:iload_0         
	//   17   33:bipush          32
	//   18   35:icmpne          40
	//   19   38:iconst_1        
	//   20   39:ireturn         
	//   21   40:iconst_0        
	//   22   41:ireturn         
	}

	public void backOnePosition(int i)
	{
		if(i != -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpeq          14
			file.pushBack((byte)i);
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field RandomAccessFileOrArray file>
	//    5    9:iload_1         
	//    6   10:int2byte        
	//    7   11:invokevirtual   #103 <Method void RandomAccessFileOrArray.pushBack(byte)>
	//    8   14:return          
	}

	public void checkFdfHeader()
		throws IOException
	{
		file.seek(0L);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field RandomAccessFileOrArray file>
	//    2    4:lconst_0        
	//    3    5:invokevirtual   #110 <Method void RandomAccessFileOrArray.seek(long)>
		if(readString(1024).indexOf("%FDF-") != 0)
	//*   4    8:aload_0         
	//*   5    9:sipush          1024
	//*   6   12:invokevirtual   #114 <Method String readString(int)>
	//*   7   15:ldc1            #116 <String "%FDF-">
	//*   8   17:invokevirtual   #120 <Method int String.indexOf(String)>
	//*   9   20:ifeq            40
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("fdf.header.not.found", new Object[0]));
	//   10   23:new             #122 <Class InvalidPdfException>
	//   11   26:dup             
	//   12   27:ldc1            #124 <String "fdf.header.not.found">
	//   13   29:iconst_0        
	//   14   30:anewarray       Object[]
	//   15   33:invokestatic    #130 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   16   36:invokespecial   #133 <Method void InvalidPdfException(String)>
	//   17   39:athrow          
		else
			return;
	//   18   40:return          
	}

	public char checkPdfHeader()
		throws IOException
	{
		file.seek(0L);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field RandomAccessFileOrArray file>
	//    2    4:lconst_0        
	//    3    5:invokevirtual   #110 <Method void RandomAccessFileOrArray.seek(long)>
		String s = readString(1024);
	//    4    8:aload_0         
	//    5    9:sipush          1024
	//    6   12:invokevirtual   #114 <Method String readString(int)>
	//    7   15:astore_1        
		if(s.indexOf("%PDF-") != 0)
	//*   8   16:aload_1         
	//*   9   17:ldc1            #138 <String "%PDF-">
	//*  10   19:invokevirtual   #120 <Method int String.indexOf(String)>
	//*  11   22:ifeq            42
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("pdf.header.not.found", new Object[0]));
	//   12   25:new             #122 <Class InvalidPdfException>
	//   13   28:dup             
	//   14   29:ldc1            #140 <String "pdf.header.not.found">
	//   15   31:iconst_0        
	//   16   32:anewarray       Object[]
	//   17   35:invokestatic    #130 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   18   38:invokespecial   #133 <Method void InvalidPdfException(String)>
	//   19   41:athrow          
		else
			return s.charAt(7);
	//   20   42:aload_1         
	//   21   43:bipush          7
	//   22   45:invokevirtual   #144 <Method char String.charAt(int)>
	//   23   48:ireturn         
	}

	public void close()
		throws IOException
	{
		file.close();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field RandomAccessFileOrArray file>
	//    2    4:invokevirtual   #147 <Method void RandomAccessFileOrArray.close()>
	//    3    7:return          
	}

	public RandomAccessFileOrArray getFile()
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field RandomAccessFileOrArray file>
	//    2    4:areturn         
	}

	public long getFilePointer()
		throws IOException
	{
		return file.getFilePointer();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field RandomAccessFileOrArray file>
	//    2    4:invokevirtual   #153 <Method long RandomAccessFileOrArray.getFilePointer()>
	//    3    7:lreturn         
	}

	public int getGeneration()
	{
		return generation;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field int generation>
	//    2    4:ireturn         
	}

	public int getHeaderOffset()
		throws IOException
	{
		String s = readString(1024);
	//    0    0:aload_0         
	//    1    1:sipush          1024
	//    2    4:invokevirtual   #114 <Method String readString(int)>
	//    3    7:astore_3        
		int j = s.indexOf("%PDF-");
	//    4    8:aload_3         
	//    5    9:ldc1            #138 <String "%PDF-">
	//    6   11:invokevirtual   #120 <Method int String.indexOf(String)>
	//    7   14:istore_2        
		int i = j;
	//    8   15:iload_2         
	//    9   16:istore_1        
		if(j < 0)
	//*  10   17:iload_2         
	//*  11   18:ifge            51
		{
			int k = s.indexOf("%FDF-");
	//   12   21:aload_3         
	//   13   22:ldc1            #116 <String "%FDF-">
	//   14   24:invokevirtual   #120 <Method int String.indexOf(String)>
	//   15   27:istore_2        
			i = k;
	//   16   28:iload_2         
	//   17   29:istore_1        
			if(k < 0)
	//*  18   30:iload_2         
	//*  19   31:ifge            51
				throw new InvalidPdfException(MessageLocalization.getComposedMessage("pdf.header.not.found", new Object[0]));
	//   20   34:new             #122 <Class InvalidPdfException>
	//   21   37:dup             
	//   22   38:ldc1            #140 <String "pdf.header.not.found">
	//   23   40:iconst_0        
	//   24   41:anewarray       Object[]
	//   25   44:invokestatic    #130 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   26   47:invokespecial   #133 <Method void InvalidPdfException(String)>
	//   27   50:athrow          
		}
		return i;
	//   28   51:iload_1         
	//   29   52:ireturn         
	}

	public int getReference()
	{
		return reference;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field int reference>
	//    2    4:ireturn         
	}

	public RandomAccessFileOrArray getSafeFile()
	{
		return new RandomAccessFileOrArray(file);
	//    0    0:new             #49  <Class RandomAccessFileOrArray>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field RandomAccessFileOrArray file>
	//    4    8:invokespecial   #162 <Method void RandomAccessFileOrArray(RandomAccessFileOrArray)>
	//    5   11:areturn         
	}

	public long getStartxref()
		throws IOException
	{
		long l1 = file.length() - (long)1024;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field RandomAccessFileOrArray file>
	//    2    4:invokevirtual   #166 <Method long RandomAccessFileOrArray.length()>
	//    3    7:sipush          1024
	//    4   10:i2l             
	//    5   11:lsub            
	//    6   12:lstore          4
		long l = l1;
	//    7   14:lload           4
	//    8   16:lstore_2        
		if(l1 < 1L)
	//*   9   17:lload           4
	//*  10   19:lconst_1        
	//*  11   20:lcmp            
	//*  12   21:ifge            26
			l = 1L;
	//   13   24:lconst_1        
	//   14   25:lstore_2        
		for(; l > 0L; l = (l - (long)1024) + 9L)
	//*  15   26:lload_2         
	//*  16   27:lconst_0        
	//*  17   28:lcmp            
	//*  18   29:ifle            76
		{
			file.seek(l);
	//   19   32:aload_0         
	//   20   33:getfield        #43  <Field RandomAccessFileOrArray file>
	//   21   36:lload_2         
	//   22   37:invokevirtual   #110 <Method void RandomAccessFileOrArray.seek(long)>
			int i = readString(1024).lastIndexOf("startxref");
	//   23   40:aload_0         
	//   24   41:sipush          1024
	//   25   44:invokevirtual   #114 <Method String readString(int)>
	//   26   47:ldc1            #168 <String "startxref">
	//   27   49:invokevirtual   #171 <Method int String.lastIndexOf(String)>
	//   28   52:istore_1        
			if(i >= 0)
	//*  29   53:iload_1         
	//*  30   54:iflt            62
				return (long)i + l;
	//   31   57:iload_1         
	//   32   58:i2l             
	//   33   59:lload_2         
	//   34   60:ladd            
	//   35   61:lreturn         
		}

	//   36   62:lload_2         
	//   37   63:sipush          1024
	//   38   66:i2l             
	//   39   67:lsub            
	//   40   68:ldc2w           #172 <Long 9L>
	//   41   71:ladd            
	//   42   72:lstore_2        
	//*  43   73:goto            26
		throw new InvalidPdfException(MessageLocalization.getComposedMessage("pdf.startxref.not.found", new Object[0]));
	//   44   76:new             #122 <Class InvalidPdfException>
	//   45   79:dup             
	//   46   80:ldc1            #175 <String "pdf.startxref.not.found">
	//   47   82:iconst_0        
	//   48   83:anewarray       Object[]
	//   49   86:invokestatic    #130 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   50   89:invokespecial   #133 <Method void InvalidPdfException(String)>
	//   51   92:athrow          
	}

	public String getStringValue()
	{
		return stringValue;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field String stringValue>
	//    2    4:areturn         
	}

	public TokenType getTokenType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field PRTokeniser$TokenType type>
	//    2    4:areturn         
	}

	public int intValue()
	{
		return Integer.parseInt(stringValue);
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field String stringValue>
	//    2    4:invokestatic    #184 <Method int Integer.parseInt(String)>
	//    3    7:ireturn         
	}

	public boolean isHexString()
	{
		return hexString;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field boolean hexString>
	//    2    4:ireturn         
	}

	public long length()
		throws IOException
	{
		return file.length();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field RandomAccessFileOrArray file>
	//    2    4:invokevirtual   #166 <Method long RandomAccessFileOrArray.length()>
	//    3    7:lreturn         
	}

	public long longValue()
	{
		return Long.parseLong(stringValue);
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field String stringValue>
	//    2    4:invokestatic    #194 <Method long Long.parseLong(String)>
	//    3    7:lreturn         
	}

	public boolean nextToken()
		throws IOException
	{
		int i;
		do
			i = file.read();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field RandomAccessFileOrArray file>
	//    2    4:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//    3    7:istore_1        
		while(i != -1 && isWhitespace(i));
	//    4    8:iload_1         
	//    5    9:iconst_m1       
	//    6   10:icmpeq          20
	//    7   13:iload_1         
	//    8   14:invokestatic    #199 <Method boolean isWhitespace(int)>
	//    9   17:ifne            0
		if(i == -1)
	//*  10   20:iload_1         
	//*  11   21:iconst_m1       
	//*  12   22:icmpne          34
		{
			type = TokenType.ENDOFFILE;
	//   13   25:aload_0         
	//   14   26:getstatic       #202 <Field PRTokeniser$TokenType PRTokeniser$TokenType.ENDOFFILE>
	//   15   29:putfield        #179 <Field PRTokeniser$TokenType type>
			return false;
	//   16   32:iconst_0        
	//   17   33:ireturn         
		}
		outBuf.setLength(0);
	//   18   34:aload_0         
	//   19   35:getfield        #41  <Field StringBuilder outBuf>
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #205 <Method void StringBuilder.setLength(int)>
		stringValue = "";
	//   22   42:aload_0         
	//   23   43:ldc1            #11  <String "">
	//   24   45:putfield        #177 <Field String stringValue>
		i;
	//   25   48:iload_1         
		JVM INSTR lookupswitch 7: default 116
	//	               37: 623
	//	               40: 658
	//	               47: 301
	//	               60: 422
	//	               62: 387
	//	               91: 264
	//	               93: 291;
	//   26   49:lookupswitch    7: default 116
	//	               37: 623
	//	               40: 658
	//	               47: 301
	//	               60: 422
	//	               62: 387
	//	               91: 264
	//	               93: 291
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		outBuf.setLength(0);
	//   27  116:aload_0         
	//   28  117:getfield        #41  <Field StringBuilder outBuf>
	//   29  120:iconst_0        
	//   30  121:invokevirtual   #205 <Method void StringBuilder.setLength(int)>
		int l;
		if(i != 45 && i != 43 && i != 46 && (i < 48 || i > 57)) goto _L10; else goto _L9
	//   31  124:iload_1         
	//   32  125:bipush          45
	//   33  127:icmpeq          154
	//   34  130:iload_1         
	//   35  131:bipush          43
	//   36  133:icmpeq          154
	//   37  136:iload_1         
	//   38  137:bipush          46
	//   39  139:icmpeq          154
	//   40  142:iload_1         
	//   41  143:bipush          48
	//   42  145:icmplt          1226
	//   43  148:iload_1         
	//   44  149:bipush          57
	//   45  151:icmpgt          1226
	//*  46  154:aload_0         
	//*  47  155:getstatic       #72  <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//*  48  158:putfield        #179 <Field PRTokeniser$TokenType type>
	//*  49  161:iconst_0        
	//*  50  162:istore_3        
	//*  51  163:iconst_0        
	//*  52  164:istore_2        
	//*  53  165:iconst_0        
	//*  54  166:istore          4
	//*  55  168:iload_1         
	//*  56  169:bipush          45
	//*  57  171:icmpne          1154
	//*  58  174:iload           4
	//*  59  176:istore_1        
	//*  60  177:iload_1         
	//*  61  178:iconst_1        
	//*  62  179:iadd            
	//*  63  180:istore_2        
	//*  64  181:aload_0         
	//*  65  182:getfield        #43  <Field RandomAccessFileOrArray file>
	//*  66  185:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//*  67  188:istore          4
	//*  68  190:iload_2         
	//*  69  191:istore_1        
	//*  70  192:iload           4
	//*  71  194:bipush          45
	//*  72  196:icmpeq          177
	//*  73  199:aload_0         
	//*  74  200:getfield        #41  <Field StringBuilder outBuf>
	//*  75  203:bipush          45
	//*  76  205:invokevirtual   #209 <Method StringBuilder StringBuilder.append(char)>
	//*  77  208:pop             
	//*  78  209:iload           4
	//*  79  211:istore_1        
	//*  80  212:iload_1         
	//*  81  213:iconst_m1       
	//*  82  214:icmpeq          1175
	//*  83  217:iload_1         
	//*  84  218:bipush          48
	//*  85  220:icmplt          229
	//*  86  223:iload_1         
	//*  87  224:bipush          57
	//*  88  226:icmple          235
	//*  89  229:iload_1         
	//*  90  230:bipush          46
	//*  91  232:icmpne          1175
	//*  92  235:iload_1         
	//*  93  236:bipush          46
	//*  94  238:icmpne          243
	//*  95  241:iconst_1        
	//*  96  242:istore_3        
	//*  97  243:aload_0         
	//*  98  244:getfield        #41  <Field StringBuilder outBuf>
	//*  99  247:iload_1         
	//* 100  248:int2char        
	//* 101  249:invokevirtual   #209 <Method StringBuilder StringBuilder.append(char)>
	//* 102  252:pop             
	//* 103  253:aload_0         
	//* 104  254:getfield        #43  <Field RandomAccessFileOrArray file>
	//* 105  257:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//* 106  260:istore_1        
	//* 107  261:goto            212
_L7:
		type = TokenType.START_ARRAY;
	//  108  264:aload_0         
	//  109  265:getstatic       #212 <Field PRTokeniser$TokenType PRTokeniser$TokenType.START_ARRAY>
	//  110  268:putfield        #179 <Field PRTokeniser$TokenType type>
_L35:
		if(outBuf != null)
	//* 111  271:aload_0         
	//* 112  272:getfield        #41  <Field StringBuilder outBuf>
	//* 113  275:ifnull          289
			stringValue = outBuf.toString();
	//  114  278:aload_0         
	//  115  279:aload_0         
	//  116  280:getfield        #41  <Field StringBuilder outBuf>
	//  117  283:invokevirtual   #215 <Method String StringBuilder.toString()>
	//  118  286:putfield        #177 <Field String stringValue>
		return true;
	//  119  289:iconst_1        
	//  120  290:ireturn         
_L8:
		type = TokenType.END_ARRAY;
	//  121  291:aload_0         
	//  122  292:getstatic       #218 <Field PRTokeniser$TokenType PRTokeniser$TokenType.END_ARRAY>
	//  123  295:putfield        #179 <Field PRTokeniser$TokenType type>
		continue; /* Loop/switch isn't completed */
	//  124  298:goto            271
_L4:
		outBuf.setLength(0);
	//  125  301:aload_0         
	//  126  302:getfield        #41  <Field StringBuilder outBuf>
	//  127  305:iconst_0        
	//  128  306:invokevirtual   #205 <Method void StringBuilder.setLength(int)>
		type = TokenType.NAME;
	//  129  309:aload_0         
	//  130  310:getstatic       #221 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NAME>
	//  131  313:putfield        #179 <Field PRTokeniser$TokenType type>
		do
		{
			j = file.read();
	//  132  316:aload_0         
	//  133  317:getfield        #43  <Field RandomAccessFileOrArray file>
	//  134  320:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  135  323:istore_2        
			if(delims[j + 1])
	//* 136  324:getstatic       #31  <Field boolean[] delims>
	//* 137  327:iload_2         
	//* 138  328:iconst_1        
	//* 139  329:iadd            
	//* 140  330:baload          
	//* 141  331:ifeq            342
			{
				backOnePosition(j);
	//  142  334:aload_0         
	//  143  335:iload_2         
	//  144  336:invokevirtual   #223 <Method void backOnePosition(int)>
				continue; /* Loop/switch isn't completed */
	//  145  339:goto            271
			}
			i = j;
	//  146  342:iload_2         
	//  147  343:istore_1        
			if(j == 35)
	//* 148  344:iload_2         
	//* 149  345:bipush          35
	//* 150  347:icmpne          374
				i = (getHex(file.read()) << 4) + getHex(file.read());
	//  151  350:aload_0         
	//  152  351:getfield        #43  <Field RandomAccessFileOrArray file>
	//  153  354:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  154  357:invokestatic    #225 <Method int getHex(int)>
	//  155  360:iconst_4        
	//  156  361:ishl            
	//  157  362:aload_0         
	//  158  363:getfield        #43  <Field RandomAccessFileOrArray file>
	//  159  366:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  160  369:invokestatic    #225 <Method int getHex(int)>
	//  161  372:iadd            
	//  162  373:istore_1        
			outBuf.append((char)i);
	//  163  374:aload_0         
	//  164  375:getfield        #41  <Field StringBuilder outBuf>
	//  165  378:iload_1         
	//  166  379:int2char        
	//  167  380:invokevirtual   #209 <Method StringBuilder StringBuilder.append(char)>
	//  168  383:pop             
		} while(true);
	//  169  384:goto            316
_L6:
		if(file.read() != 62)
	//* 170  387:aload_0         
	//* 171  388:getfield        #43  <Field RandomAccessFileOrArray file>
	//* 172  391:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//* 173  394:bipush          62
	//* 174  396:icmpeq          412
			throwError(MessageLocalization.getComposedMessage("greaterthan.not.expected", new Object[0]));
	//  175  399:aload_0         
	//  176  400:ldc1            #227 <String "greaterthan.not.expected">
	//  177  402:iconst_0        
	//  178  403:anewarray       Object[]
	//  179  406:invokestatic    #130 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  180  409:invokevirtual   #230 <Method void throwError(String)>
		type = TokenType.END_DIC;
	//  181  412:aload_0         
	//  182  413:getstatic       #233 <Field PRTokeniser$TokenType PRTokeniser$TokenType.END_DIC>
	//  183  416:putfield        #179 <Field PRTokeniser$TokenType type>
		continue; /* Loop/switch isn't completed */
	//  184  419:goto            271
_L5:
		i = file.read();
	//  185  422:aload_0         
	//  186  423:getfield        #43  <Field RandomAccessFileOrArray file>
	//  187  426:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  188  429:istore_1        
		if(i == 60)
	//* 189  430:iload_1         
	//* 190  431:bipush          60
	//* 191  433:icmpne          446
		{
			type = TokenType.START_DIC;
	//  192  436:aload_0         
	//  193  437:getstatic       #236 <Field PRTokeniser$TokenType PRTokeniser$TokenType.START_DIC>
	//  194  440:putfield        #179 <Field PRTokeniser$TokenType type>
			continue; /* Loop/switch isn't completed */
	//  195  443:goto            271
		}
		outBuf.setLength(0);
	//  196  446:aload_0         
	//  197  447:getfield        #41  <Field StringBuilder outBuf>
	//  198  450:iconst_0        
	//  199  451:invokevirtual   #205 <Method void StringBuilder.setLength(int)>
		type = TokenType.STRING;
	//  200  454:aload_0         
	//  201  455:getstatic       #239 <Field PRTokeniser$TokenType PRTokeniser$TokenType.STRING>
	//  202  458:putfield        #179 <Field PRTokeniser$TokenType type>
		hexString = true;
	//  203  461:aload_0         
	//  204  462:iconst_1        
	//  205  463:putfield        #187 <Field boolean hexString>
		j = 0;
	//  206  466:iconst_0        
	//  207  467:istore_2        
_L15:
		for(; isWhitespace(i); i = file.read());
	//  208  468:iload_1         
	//  209  469:invokestatic    #199 <Method boolean isWhitespace(int)>
	//  210  472:ifeq            486
	//  211  475:aload_0         
	//  212  476:getfield        #43  <Field RandomAccessFileOrArray file>
	//  213  479:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  214  482:istore_1        
	//* 215  483:goto            468
		if(i != 62) goto _L12; else goto _L11
	//  216  486:iload_1         
	//  217  487:bipush          62
	//  218  489:icmpne          516
_L11:
		if(i < 0 || j < 0)
	//* 219  492:iload_1         
	//* 220  493:iflt            500
	//* 221  496:iload_2         
	//* 222  497:ifge            271
			throwError(MessageLocalization.getComposedMessage("error.reading.string", new Object[0]));
	//  223  500:aload_0         
	//  224  501:ldc1            #241 <String "error.reading.string">
	//  225  503:iconst_0        
	//  226  504:anewarray       Object[]
	//  227  507:invokestatic    #130 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  228  510:invokevirtual   #230 <Method void throwError(String)>
		continue; /* Loop/switch isn't completed */
	//  229  513:goto            271
_L12:
		l = getHex(i);
	//  230  516:iload_1         
	//  231  517:invokestatic    #225 <Method int getHex(int)>
	//  232  520:istore          4
		i = l;
	//  233  522:iload           4
	//  234  524:istore_1        
		if(l < 0)
			continue; /* Loop/switch isn't completed */
	//  235  525:iload           4
	//  236  527:iflt            492
		for(j = file.read(); isWhitespace(j); j = file.read());
	//  237  530:aload_0         
	//  238  531:getfield        #43  <Field RandomAccessFileOrArray file>
	//  239  534:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  240  537:istore_2        
	//  241  538:iload_2         
	//  242  539:invokestatic    #199 <Method boolean isWhitespace(int)>
	//  243  542:ifeq            556
	//  244  545:aload_0         
	//  245  546:getfield        #43  <Field RandomAccessFileOrArray file>
	//  246  549:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  247  552:istore_2        
	//* 248  553:goto            538
		if(j != 62)
			break; /* Loop/switch isn't completed */
	//  249  556:iload_2         
	//  250  557:bipush          62
	//  251  559:icmpne          581
		outBuf.append((char)(l << 4));
	//  252  562:aload_0         
	//  253  563:getfield        #41  <Field StringBuilder outBuf>
	//  254  566:iload           4
	//  255  568:iconst_4        
	//  256  569:ishl            
	//  257  570:int2char        
	//  258  571:invokevirtual   #209 <Method StringBuilder StringBuilder.append(char)>
	//  259  574:pop             
		i = l;
	//  260  575:iload           4
	//  261  577:istore_1        
		if(true) goto _L11; else goto _L13
	//  262  578:goto            492
_L13:
		k = getHex(j);
	//  263  581:iload_2         
	//  264  582:invokestatic    #225 <Method int getHex(int)>
	//  265  585:istore_3        
		i = l;
	//  266  586:iload           4
	//  267  588:istore_1        
		j = k;
	//  268  589:iload_3         
	//  269  590:istore_2        
		if(k < 0) goto _L11; else goto _L14
	//  270  591:iload_3         
	//  271  592:iflt            492
_L14:
		outBuf.append((char)((l << 4) + k));
	//  272  595:aload_0         
	//  273  596:getfield        #41  <Field StringBuilder outBuf>
	//  274  599:iload           4
	//  275  601:iconst_4        
	//  276  602:ishl            
	//  277  603:iload_3         
	//  278  604:iadd            
	//  279  605:int2char        
	//  280  606:invokevirtual   #209 <Method StringBuilder StringBuilder.append(char)>
	//  281  609:pop             
		i = file.read();
	//  282  610:aload_0         
	//  283  611:getfield        #43  <Field RandomAccessFileOrArray file>
	//  284  614:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  285  617:istore_1        
		j = k;
	//  286  618:iload_3         
	//  287  619:istore_2        
		if(true) goto _L15; else goto _L2
	//  288  620:goto            468
_L2:
		type = TokenType.COMMENT;
	//  289  623:aload_0         
	//  290  624:getstatic       #244 <Field PRTokeniser$TokenType PRTokeniser$TokenType.COMMENT>
	//  291  627:putfield        #179 <Field PRTokeniser$TokenType type>
		do
			i = file.read();
	//  292  630:aload_0         
	//  293  631:getfield        #43  <Field RandomAccessFileOrArray file>
	//  294  634:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  295  637:istore_1        
		while(i != -1 && i != 13 && i != 10);
	//  296  638:iload_1         
	//  297  639:iconst_m1       
	//  298  640:icmpeq          271
	//  299  643:iload_1         
	//  300  644:bipush          13
	//  301  646:icmpeq          271
	//  302  649:iload_1         
	//  303  650:bipush          10
	//  304  652:icmpne          630
		continue; /* Loop/switch isn't completed */
	//  305  655:goto            271
_L3:
		outBuf.setLength(0);
	//  306  658:aload_0         
	//  307  659:getfield        #41  <Field StringBuilder outBuf>
	//  308  662:iconst_0        
	//  309  663:invokevirtual   #205 <Method void StringBuilder.setLength(int)>
		type = TokenType.STRING;
	//  310  666:aload_0         
	//  311  667:getstatic       #239 <Field PRTokeniser$TokenType PRTokeniser$TokenType.STRING>
	//  312  670:putfield        #179 <Field PRTokeniser$TokenType type>
		hexString = false;
	//  313  673:aload_0         
	//  314  674:iconst_0        
	//  315  675:putfield        #187 <Field boolean hexString>
		l = 0;
	//  316  678:iconst_0        
	//  317  679:istore          4
_L19:
		i = file.read();
	//  318  681:aload_0         
	//  319  682:getfield        #43  <Field RandomAccessFileOrArray file>
	//  320  685:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  321  688:istore_1        
		if(i != -1) goto _L17; else goto _L16
	//  322  689:iload_1         
	//  323  690:iconst_m1       
	//  324  691:icmpne          715
_L16:
		if(i == -1)
	//* 325  694:iload_1         
	//* 326  695:iconst_m1       
	//* 327  696:icmpne          271
			throwError(MessageLocalization.getComposedMessage("error.reading.string", new Object[0]));
	//  328  699:aload_0         
	//  329  700:ldc1            #241 <String "error.reading.string">
	//  330  702:iconst_0        
	//  331  703:anewarray       Object[]
	//  332  706:invokestatic    #130 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  333  709:invokevirtual   #230 <Method void throwError(String)>
		continue; /* Loop/switch isn't completed */
	//  334  712:goto            271
_L17:
		if(i == 40)
	//* 335  715:iload_1         
	//* 336  716:bipush          40
	//* 337  718:icmpne          751
		{
			k = l + 1;
	//  338  721:iload           4
	//  339  723:iconst_1        
	//  340  724:iadd            
	//  341  725:istore_3        
			j = i;
	//  342  726:iload_1         
	//  343  727:istore_2        
		} else
	//* 344  728:iload_2         
	//* 345  729:istore_1        
	//* 346  730:iload_3         
	//* 347  731:iconst_m1       
	//* 348  732:icmpeq          694
	//* 349  735:aload_0         
	//* 350  736:getfield        #41  <Field StringBuilder outBuf>
	//* 351  739:iload_2         
	//* 352  740:int2char        
	//* 353  741:invokevirtual   #209 <Method StringBuilder StringBuilder.append(char)>
	//* 354  744:pop             
	//* 355  745:iload_3         
	//* 356  746:istore          4
	//* 357  748:goto            681
		{
label0:
			{
				if(i != 41)
					break label0;
	//  358  751:iload_1         
	//  359  752:bipush          41
	//  360  754:icmpne          767
				k = l - 1;
	//  361  757:iload           4
	//  362  759:iconst_1        
	//  363  760:isub            
	//  364  761:istore_3        
				j = i;
	//  365  762:iload_1         
	//  366  763:istore_2        
			}
		}
_L32:
		i = j;
		if(k == -1) goto _L16; else goto _L18
_L18:
		outBuf.append((char)j);
		l = k;
		  goto _L19
	//* 367  764:goto            728
		if(i != 92) goto _L21; else goto _L20
	//  368  767:iload_1         
	//  369  768:bipush          92
	//  370  770:icmpne          1098
_L20:
		k = 0;
	//  371  773:iconst_0        
	//  372  774:istore_3        
		i1 = file.read();
	//  373  775:aload_0         
	//  374  776:getfield        #43  <Field RandomAccessFileOrArray file>
	//  375  779:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  376  782:istore          5
		i = i1;
	//  377  784:iload           5
	//  378  786:istore_1        
		j = k;
	//  379  787:iload_3         
	//  380  788:istore_2        
		i1;
	//  381  789:iload           5
		JVM INSTR lookupswitch 10: default 880
	//	               10: 997
	//	               13: 960
	//	               40: 904
	//	               41: 904
	//	               92: 904
	//	               98: 944
	//	               102: 952
	//	               110: 920
	//	               114: 928
	//	               116: 936;
	//  382  791:lookupswitch    10: default 880
	//	               10: 997
	//	               13: 960
	//	               40: 904
	//	               41: 904
	//	               92: 904
	//	               98: 944
	//	               102: 952
	//	               110: 920
	//	               114: 928
	//	               116: 936
		   goto _L22 _L23 _L24 _L25 _L25 _L25 _L26 _L27 _L28 _L29 _L30
_L22:
		i = i1;
	//  383  880:iload           5
	//  384  882:istore_1        
		j = k;
	//  385  883:iload_3         
	//  386  884:istore_2        
		if(i1 >= 48)
	//* 387  885:iload           5
	//* 388  887:bipush          48
	//* 389  889:icmplt          904
			if(i1 > 55)
	//* 390  892:iload           5
	//* 391  894:bipush          55
	//* 392  896:icmple          1005
			{
				j = k;
	//  393  899:iload_3         
	//  394  900:istore_2        
				i = i1;
	//  395  901:iload           5
	//  396  903:istore_1        
			} else
	//* 397  904:iload_2         
	//* 398  905:ifne            681
	//* 399  908:iload_1         
	//* 400  909:istore_2        
	//* 401  910:iload           4
	//* 402  912:istore_3        
	//* 403  913:iload_1         
	//* 404  914:ifge            728
	//* 405  917:goto            694
	//* 406  920:bipush          10
	//* 407  922:istore_1        
	//* 408  923:iload_3         
	//* 409  924:istore_2        
	//* 410  925:goto            904
	//* 411  928:bipush          13
	//* 412  930:istore_1        
	//* 413  931:iload_3         
	//* 414  932:istore_2        
	//* 415  933:goto            904
	//* 416  936:bipush          9
	//* 417  938:istore_1        
	//* 418  939:iload_3         
	//* 419  940:istore_2        
	//* 420  941:goto            904
	//* 421  944:bipush          8
	//* 422  946:istore_1        
	//* 423  947:iload_3         
	//* 424  948:istore_2        
	//* 425  949:goto            904
	//* 426  952:bipush          12
	//* 427  954:istore_1        
	//* 428  955:iload_3         
	//* 429  956:istore_2        
	//* 430  957:goto            904
	//* 431  960:iconst_1        
	//* 432  961:istore_3        
	//* 433  962:aload_0         
	//* 434  963:getfield        #43  <Field RandomAccessFileOrArray file>
	//* 435  966:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//* 436  969:istore          5
	//* 437  971:iload           5
	//* 438  973:istore_1        
	//* 439  974:iload_3         
	//* 440  975:istore_2        
	//* 441  976:iload           5
	//* 442  978:bipush          10
	//* 443  980:icmpeq          904
	//* 444  983:aload_0         
	//* 445  984:iload           5
	//* 446  986:invokevirtual   #223 <Method void backOnePosition(int)>
	//* 447  989:iload           5
	//* 448  991:istore_1        
	//* 449  992:iload_3         
	//* 450  993:istore_2        
	//* 451  994:goto            904
	//* 452  997:iconst_1        
	//* 453  998:istore_2        
	//* 454  999:iload           5
	//* 455 1001:istore_1        
	//* 456 1002:goto            904
			{
				i = i1 - 48;
	//  457 1005:iload           5
	//  458 1007:bipush          48
	//  459 1009:isub            
	//  460 1010:istore_1        
				j = file.read();
	//  461 1011:aload_0         
	//  462 1012:getfield        #43  <Field RandomAccessFileOrArray file>
	//  463 1015:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  464 1018:istore_2        
				if(j < 48 || j > 55)
	//* 465 1019:iload_2         
	//* 466 1020:bipush          48
	//* 467 1022:icmplt          1031
	//* 468 1025:iload_2         
	//* 469 1026:bipush          55
	//* 470 1028:icmple          1041
				{
					backOnePosition(j);
	//  471 1031:aload_0         
	//  472 1032:iload_2         
	//  473 1033:invokevirtual   #223 <Method void backOnePosition(int)>
					j = k;
	//  474 1036:iload_3         
	//  475 1037:istore_2        
				} else
	//* 476 1038:goto            904
				{
					i = ((i << 3) + j) - 48;
	//  477 1041:iload_1         
	//  478 1042:iconst_3        
	//  479 1043:ishl            
	//  480 1044:iload_2         
	//  481 1045:iadd            
	//  482 1046:bipush          48
	//  483 1048:isub            
	//  484 1049:istore_1        
					j = file.read();
	//  485 1050:aload_0         
	//  486 1051:getfield        #43  <Field RandomAccessFileOrArray file>
	//  487 1054:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  488 1057:istore_2        
					if(j < 48 || j > 55)
	//* 489 1058:iload_2         
	//* 490 1059:bipush          48
	//* 491 1061:icmplt          1070
	//* 492 1064:iload_2         
	//* 493 1065:bipush          55
	//* 494 1067:icmple          1080
					{
						backOnePosition(j);
	//  495 1070:aload_0         
	//  496 1071:iload_2         
	//  497 1072:invokevirtual   #223 <Method void backOnePosition(int)>
						j = k;
	//  498 1075:iload_3         
	//  499 1076:istore_2        
					} else
	//* 500 1077:goto            904
					{
						i = ((i << 3) + j) - 48 & 0xff;
	//  501 1080:iload_1         
	//  502 1081:iconst_3        
	//  503 1082:ishl            
	//  504 1083:iload_2         
	//  505 1084:iadd            
	//  506 1085:bipush          48
	//  507 1087:isub            
	//  508 1088:sipush          255
	//  509 1091:iand            
	//  510 1092:istore_1        
						j = k;
	//  511 1093:iload_3         
	//  512 1094:istore_2        
					}
				}
			}
_L25:
		if(j != 0) goto _L19; else goto _L31
_L31:
		j = i;
		k = l;
		if(i >= 0) goto _L32; else goto _L16
_L28:
		i = 10;
		j = k;
		  goto _L25
_L29:
		i = 13;
		j = k;
		  goto _L25
_L30:
		i = 9;
		j = k;
		  goto _L25
_L26:
		i = 8;
		j = k;
		  goto _L25
_L27:
		i = 12;
		j = k;
		  goto _L25
_L24:
		k = 1;
		i1 = file.read();
		i = i1;
		j = k;
		if(i1 != 10)
		{
			backOnePosition(i1);
			i = i1;
			j = k;
		}
		  goto _L25
_L23:
		j = 1;
		i = i1;
		  goto _L25
	//* 513 1095:goto            904
_L21:
		j = i;
	//  514 1098:iload_1         
	//  515 1099:istore_2        
		k = l;
	//  516 1100:iload           4
	//  517 1102:istore_3        
		if(i != 13) goto _L32; else goto _L33
	//  518 1103:iload_1         
	//  519 1104:bipush          13
	//  520 1106:icmpne          728
_L33:
		i1 = file.read();
	//  521 1109:aload_0         
	//  522 1110:getfield        #43  <Field RandomAccessFileOrArray file>
	//  523 1113:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  524 1116:istore          5
		i = i1;
	//  525 1118:iload           5
	//  526 1120:istore_1        
		if(i1 < 0) goto _L16; else goto _L34
	//  527 1121:iload           5
	//  528 1123:iflt            694
_L34:
		j = i1;
	//  529 1126:iload           5
	//  530 1128:istore_2        
		k = l;
	//  531 1129:iload           4
	//  532 1131:istore_3        
		if(i1 != 10)
	//* 533 1132:iload           5
	//* 534 1134:bipush          10
	//* 535 1136:icmpeq          728
		{
			backOnePosition(i1);
	//  536 1139:aload_0         
	//  537 1140:iload           5
	//  538 1142:invokevirtual   #223 <Method void backOnePosition(int)>
			j = 10;
	//  539 1145:bipush          10
	//  540 1147:istore_2        
			k = l;
	//  541 1148:iload           4
	//  542 1150:istore_3        
		}
		  goto _L32
_L9:
		type = TokenType.NUMBER;
		int k = 0;
		int j = 0;
		l = 0;
		int i1;
		if(i == 45)
		{
			i = l;
			do
			{
				j = i + 1;
				l = file.read();
				i = j;
			} while(l == 45);
			outBuf.append('-');
			i = l;
		} else
	//* 543 1151:goto            728
		{
			outBuf.append((char)i);
	//  544 1154:aload_0         
	//  545 1155:getfield        #41  <Field StringBuilder outBuf>
	//  546 1158:iload_1         
	//  547 1159:int2char        
	//  548 1160:invokevirtual   #209 <Method StringBuilder StringBuilder.append(char)>
	//  549 1163:pop             
			i = file.read();
	//  550 1164:aload_0         
	//  551 1165:getfield        #43  <Field RandomAccessFileOrArray file>
	//  552 1168:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  553 1171:istore_1        
		}
		for(; i != -1 && (i >= 48 && i <= 57 || i == 46); i = file.read())
		{
			if(i == 46)
				k = 1;
			outBuf.append((char)i);
		}

	//* 554 1172:goto            212
		l = i;
	//  555 1175:iload_1         
	//  556 1176:istore          4
		if(j > 1)
	//* 557 1178:iload_2         
	//* 558 1179:iconst_1        
	//* 559 1180:icmple          1211
		{
			l = i;
	//  560 1183:iload_1         
	//  561 1184:istore          4
			if(k == 0)
	//* 562 1186:iload_3         
	//* 563 1187:ifne            1211
			{
				outBuf.setLength(0);
	//  564 1190:aload_0         
	//  565 1191:getfield        #41  <Field StringBuilder outBuf>
	//  566 1194:iconst_0        
	//  567 1195:invokevirtual   #205 <Method void StringBuilder.setLength(int)>
				outBuf.append('0');
	//  568 1198:aload_0         
	//  569 1199:getfield        #41  <Field StringBuilder outBuf>
	//  570 1202:bipush          48
	//  571 1204:invokevirtual   #209 <Method StringBuilder StringBuilder.append(char)>
	//  572 1207:pop             
				l = i;
	//  573 1208:iload_1         
	//  574 1209:istore          4
			}
		}
_L36:
		if(l != -1)
	//* 575 1211:iload           4
	//* 576 1213:iconst_m1       
	//* 577 1214:icmpeq          271
			backOnePosition(l);
	//  578 1217:aload_0         
	//  579 1218:iload           4
	//  580 1220:invokevirtual   #223 <Method void backOnePosition(int)>
		if(true) goto _L35; else goto _L10
	//  581 1223:goto            271
_L10:
		type = TokenType.OTHER;
	//  582 1226:aload_0         
	//  583 1227:getstatic       #247 <Field PRTokeniser$TokenType PRTokeniser$TokenType.OTHER>
	//  584 1230:putfield        #179 <Field PRTokeniser$TokenType type>
		do
		{
			outBuf.append((char)i);
	//  585 1233:aload_0         
	//  586 1234:getfield        #41  <Field StringBuilder outBuf>
	//  587 1237:iload_1         
	//  588 1238:int2char        
	//  589 1239:invokevirtual   #209 <Method StringBuilder StringBuilder.append(char)>
	//  590 1242:pop             
			l = file.read();
	//  591 1243:aload_0         
	//  592 1244:getfield        #43  <Field RandomAccessFileOrArray file>
	//  593 1247:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//  594 1250:istore          4
			i = l;
	//  595 1252:iload           4
	//  596 1254:istore_1        
		} while(!delims[l + 1]);
	//  597 1255:getstatic       #31  <Field boolean[] delims>
	//  598 1258:iload           4
	//  599 1260:iconst_1        
	//  600 1261:iadd            
	//  601 1262:baload          
	//  602 1263:ifeq            1233
		  goto _L36
	//* 603 1266:goto            1211
	}

	public void nextValidToken()
		throws IOException
	{
		int i;
		long l;
		String s;
		String s1;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		s1 = null;
	//    2    2:aconst_null     
	//    3    3:astore          5
		s = null;
	//    4    5:aconst_null     
	//    5    6:astore          4
		l = 0L;
	//    6    8:lconst_0        
	//    7    9:lstore_2        
_L12:
		if(!nextToken()) goto _L2; else goto _L1
	//    8   10:aload_0         
	//    9   11:invokevirtual   #65  <Method boolean nextToken()>
	//   10   14:ifeq            198
_L1:
		if(type == TokenType.COMMENT)
			continue; /* Loop/switch isn't completed */
	//   11   17:aload_0         
	//   12   18:getfield        #179 <Field PRTokeniser$TokenType type>
	//   13   21:getstatic       #244 <Field PRTokeniser$TokenType PRTokeniser$TokenType.COMMENT>
	//   14   24:if_acmpeq       10
		i;
	//   15   27:iload_1         
		JVM INSTR tableswitch 0 1: default 52
	//	               0 96
	//	               1 127;
	//   16   28:tableswitch     0 1: default 52
	//	               0 96
	//	               1 127
		   goto _L3 _L4 _L5
_L3:
		if(type == TokenType.OTHER && stringValue.equals("R")) goto _L7; else goto _L6
	//   17   52:aload_0         
	//   18   53:getfield        #179 <Field PRTokeniser$TokenType type>
	//   19   56:getstatic       #247 <Field PRTokeniser$TokenType PRTokeniser$TokenType.OTHER>
	//   20   59:if_acmpne       74
	//   21   62:aload_0         
	//   22   63:getfield        #177 <Field String stringValue>
	//   23   66:ldc1            #250 <String "R">
	//   24   68:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   25   71:ifne            172
_L6:
		file.seek(l);
	//   26   74:aload_0         
	//   27   75:getfield        #43  <Field RandomAccessFileOrArray file>
	//   28   78:lload_2         
	//   29   79:invokevirtual   #110 <Method void RandomAccessFileOrArray.seek(long)>
		type = TokenType.NUMBER;
	//   30   82:aload_0         
	//   31   83:getstatic       #72  <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//   32   86:putfield        #179 <Field PRTokeniser$TokenType type>
		stringValue = s1;
	//   33   89:aload_0         
	//   34   90:aload           5
	//   35   92:putfield        #177 <Field String stringValue>
_L9:
		return;
	//   36   95:return          
_L4:
		if(type != TokenType.NUMBER) goto _L9; else goto _L8
	//   37   96:aload_0         
	//   38   97:getfield        #179 <Field PRTokeniser$TokenType type>
	//   39  100:getstatic       #72  <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//   40  103:if_acmpne       95
_L8:
		l = file.getFilePointer();
	//   41  106:aload_0         
	//   42  107:getfield        #43  <Field RandomAccessFileOrArray file>
	//   43  110:invokevirtual   #153 <Method long RandomAccessFileOrArray.getFilePointer()>
	//   44  113:lstore_2        
		s1 = stringValue;
	//   45  114:aload_0         
	//   46  115:getfield        #177 <Field String stringValue>
	//   47  118:astore          5
		i++;
	//   48  120:iload_1         
	//   49  121:iconst_1        
	//   50  122:iadd            
	//   51  123:istore_1        
		continue; /* Loop/switch isn't completed */
	//   52  124:goto            10
_L5:
		if(type != TokenType.NUMBER)
	//*  53  127:aload_0         
	//*  54  128:getfield        #179 <Field PRTokeniser$TokenType type>
	//*  55  131:getstatic       #72  <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//*  56  134:if_acmpeq       159
		{
			file.seek(l);
	//   57  137:aload_0         
	//   58  138:getfield        #43  <Field RandomAccessFileOrArray file>
	//   59  141:lload_2         
	//   60  142:invokevirtual   #110 <Method void RandomAccessFileOrArray.seek(long)>
			type = TokenType.NUMBER;
	//   61  145:aload_0         
	//   62  146:getstatic       #72  <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//   63  149:putfield        #179 <Field PRTokeniser$TokenType type>
			stringValue = s1;
	//   64  152:aload_0         
	//   65  153:aload           5
	//   66  155:putfield        #177 <Field String stringValue>
			return;
	//   67  158:return          
		}
		s = stringValue;
	//   68  159:aload_0         
	//   69  160:getfield        #177 <Field String stringValue>
	//   70  163:astore          4
		i++;
	//   71  165:iload_1         
	//   72  166:iconst_1        
	//   73  167:iadd            
	//   74  168:istore_1        
		continue; /* Loop/switch isn't completed */
	//   75  169:goto            10
_L7:
		type = TokenType.REF;
	//   76  172:aload_0         
	//   77  173:getstatic       #253 <Field PRTokeniser$TokenType PRTokeniser$TokenType.REF>
	//   78  176:putfield        #179 <Field PRTokeniser$TokenType type>
		reference = Integer.parseInt(s1);
	//   79  179:aload_0         
	//   80  180:aload           5
	//   81  182:invokestatic    #184 <Method int Integer.parseInt(String)>
	//   82  185:putfield        #160 <Field int reference>
		generation = Integer.parseInt(s);
	//   83  188:aload_0         
	//   84  189:aload           4
	//   85  191:invokestatic    #184 <Method int Integer.parseInt(String)>
	//   86  194:putfield        #156 <Field int generation>
		return;
	//   87  197:return          
_L2:
		if(i != 1) goto _L9; else goto _L10
	//   88  198:iload_1         
	//   89  199:iconst_1        
	//   90  200:icmpne          95
_L10:
		type = TokenType.NUMBER;
	//   91  203:aload_0         
	//   92  204:getstatic       #72  <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//   93  207:putfield        #179 <Field PRTokeniser$TokenType type>
		return;
	//   94  210:return          
		if(true) goto _L12; else goto _L11
_L11:
	}

	public int read()
		throws IOException
	{
		return file.read();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field RandomAccessFileOrArray file>
	//    2    4:invokevirtual   #197 <Method int RandomAccessFileOrArray.read()>
	//    3    7:ireturn         
	}

	public boolean readLineSegment(byte abyte0[])
		throws IOException
	{
		return readLineSegment(abyte0, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #258 <Method boolean readLineSegment(byte[], boolean)>
	//    4    6:ireturn         
	}

	public boolean readLineSegment(byte abyte0[], boolean flag)
		throws IOException
	{
		int i;
		int j;
		int l;
		int i1;
		j = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          4
		l = 0;
	//    2    3:iconst_0        
	//    3    4:istore          6
		i1 = abyte0.length;
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:istore          8
		if(i1 < 0)
	//*   7   10:iload           8
	//*   8   12:ifge            30
			do
				j = read();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #259 <Method int read()>
	//   11   19:istore          4
			while(isWhitespace(j, flag));
	//   12   21:iload           4
	//   13   23:iload_2         
	//   14   24:invokestatic    #97  <Method boolean isWhitespace(int, boolean)>
	//   15   27:ifne            15
		i = 0;
	//   16   30:iconst_0        
	//   17   31:istore_3        
_L21:
		int k = i;
	//   18   32:iload_3         
	//   19   33:istore          5
		if(l != 0) goto _L2; else goto _L1
	//   20   35:iload           6
	//   21   37:ifne            116
_L1:
		k = i;
	//   22   40:iload_3         
	//   23   41:istore          5
		if(i >= i1) goto _L2; else goto _L3
	//   24   43:iload_3         
	//   25   44:iload           8
	//   26   46:icmpge          116
_L3:
		j;
	//   27   49:iload           4
		JVM INSTR lookupswitch 3: default 84
	//	               -1: 196
	//	               10: 196
	//	               13: 202;
	//   28   51:lookupswitch    3: default 84
	//	               -1: 196
	//	               10: 196
	//	               13: 202
		   goto _L4 _L5 _L5 _L6
_L4:
		k = i + 1;
	//   29   84:iload_3         
	//   30   85:iconst_1        
	//   31   86:iadd            
	//   32   87:istore          5
		abyte0[i] = (byte)j;
	//   33   89:aload_1         
	//   34   90:iload_3         
	//   35   91:iload           4
	//   36   93:int2byte        
	//   37   94:bastore         
		i = k;
	//   38   95:iload           5
	//   39   97:istore_3        
		k = l;
	//   40   98:iload           6
	//   41  100:istore          5
_L20:
		if(k != 0) goto _L8; else goto _L7
	//   42  102:iload           5
	//   43  104:ifne            324
_L7:
		if(i1 > i) goto _L10; else goto _L9
	//   44  107:iload           8
	//   45  109:iload_3         
	//   46  110:icmpgt          229
_L9:
		k = i;
	//   47  113:iload_3         
	//   48  114:istore          5
_L2:
		l = j;
	//   49  116:iload           4
	//   50  118:istore          6
		if(k < i1) goto _L12; else goto _L11
	//   51  120:iload           5
	//   52  122:iload           8
	//   53  124:icmplt          283
_L11:
		i = 0;
	//   54  127:iconst_0        
	//   55  128:istore_3        
_L19:
		l = j;
	//   56  129:iload           4
	//   57  131:istore          6
		if(i != 0) goto _L12; else goto _L13
	//   58  133:iload_3         
	//   59  134:ifne            283
_L13:
		l = read();
	//   60  137:aload_0         
	//   61  138:invokevirtual   #259 <Method int read()>
	//   62  141:istore          6
		l;
	//   63  143:iload           6
		JVM INSTR lookupswitch 3: default 180
	//	               -1: 187
	//	               10: 187
	//	               13: 242;
	//   64  145:lookupswitch    3: default 180
	//	               -1: 187
	//	               10: 187
	//	               13: 242
		   goto _L14 _L15 _L15 _L16
_L14:
		j = l;
	//   65  180:iload           6
	//   66  182:istore          4
		  goto _L17
	//*  67  184:goto            129
_L15:
		i = 1;
	//   68  187:iconst_1        
	//   69  188:istore_3        
		j = l;
	//   70  189:iload           6
	//   71  191:istore          4
_L17:
		if(true) goto _L19; else goto _L18
_L18:
	//*  72  193:goto            129
_L5:
		k = 1;
	//   73  196:iconst_1        
	//   74  197:istore          5
		  goto _L20
	//*  75  199:goto            102
_L6:
		k = 1;
	//   76  202:iconst_1        
	//   77  203:istore          5
		long l1 = getFilePointer();
	//   78  205:aload_0         
	//   79  206:invokevirtual   #260 <Method long getFilePointer()>
	//   80  209:lstore          9
		if(read() != 10)
	//*  81  211:aload_0         
	//*  82  212:invokevirtual   #259 <Method int read()>
	//*  83  215:bipush          10
	//*  84  217:icmpeq          330
			seek(l1);
	//   85  220:aload_0         
	//   86  221:lload           9
	//   87  223:invokevirtual   #261 <Method void seek(long)>
		  goto _L20
	//*  88  226:goto            102
_L10:
		j = read();
	//   89  229:aload_0         
	//   90  230:invokevirtual   #259 <Method int read()>
	//   91  233:istore          4
		l = k;
	//   92  235:iload           5
	//   93  237:istore          6
		  goto _L21
	//*  94  239:goto            32
_L16:
		boolean flag1 = true;
	//   95  242:iconst_1        
	//   96  243:istore          7
		long l2 = getFilePointer();
	//   97  245:aload_0         
	//   98  246:invokevirtual   #260 <Method long getFilePointer()>
	//   99  249:lstore          9
		j = l;
	//  100  251:iload           6
	//  101  253:istore          4
		i = ((int) (flag1));
	//  102  255:iload           7
	//  103  257:istore_3        
		if(read() != 10)
	//* 104  258:aload_0         
	//* 105  259:invokevirtual   #259 <Method int read()>
	//* 106  262:bipush          10
	//* 107  264:icmpeq          129
		{
			seek(l2);
	//  108  267:aload_0         
	//  109  268:lload           9
	//  110  270:invokevirtual   #261 <Method void seek(long)>
			j = l;
	//  111  273:iload           6
	//  112  275:istore          4
			i = ((int) (flag1));
	//  113  277:iload           7
	//  114  279:istore_3        
		}
		  goto _L19
	//* 115  280:goto            129
_L12:
		if(l == -1 && k == 0)
	//* 116  283:iload           6
	//* 117  285:iconst_m1       
	//* 118  286:icmpne          296
	//* 119  289:iload           5
	//* 120  291:ifne            296
			return false;
	//  121  294:iconst_0        
	//  122  295:ireturn         
		if(k + 2 <= i1)
	//* 123  296:iload           5
	//* 124  298:iconst_2        
	//* 125  299:iadd            
	//* 126  300:iload           8
	//* 127  302:icmpgt          321
		{
			abyte0[k] = 32;
	//  128  305:aload_1         
	//  129  306:iload           5
	//  130  308:bipush          32
	//  131  310:bastore         
			abyte0[k + 1] = 88;
	//  132  311:aload_1         
	//  133  312:iload           5
	//  134  314:iconst_1        
	//  135  315:iadd            
	//  136  316:bipush          88
	//  137  318:bastore         
		}
		return true;
	//  138  319:iconst_1        
	//  139  320:ireturn         
	//* 140  321:goto            319
_L8:
		k = i;
	//  141  324:iload_3         
	//  142  325:istore          5
		  goto _L2
	//* 143  327:goto            116
	//* 144  330:goto            102
	}

	public String readString(int i)
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void StringBuilder()>
	//    3    7:astore_3        
		do
		{
			int j;
label0:
			{
				if(i > 0)
	//*   4    8:iload_1         
	//*   5    9:ifle            22
				{
					j = read();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #259 <Method int read()>
	//    8   16:istore_2        
					if(j != -1)
						break label0;
	//    9   17:iload_2         
	//   10   18:iconst_m1       
	//   11   19:icmpne          27
				}
				return stringbuilder.toString();
	//   12   22:aload_3         
	//   13   23:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   14   26:areturn         
			}
			stringbuilder.append((char)j);
	//   15   27:aload_3         
	//   16   28:iload_2         
	//   17   29:int2char        
	//   18   30:invokevirtual   #209 <Method StringBuilder StringBuilder.append(char)>
	//   19   33:pop             
			i--;
	//   20   34:iload_1         
	//   21   35:iconst_1        
	//   22   36:isub            
	//   23   37:istore_1        
		} while(true);
	//   24   38:goto            8
	}

	public void seek(long l)
		throws IOException
	{
		file.seek(l);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field RandomAccessFileOrArray file>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #110 <Method void RandomAccessFileOrArray.seek(long)>
	//    4    8:return          
	}

	public void throwError(String s)
		throws IOException
	{
		throw new InvalidPdfException(MessageLocalization.getComposedMessage("1.at.file.pointer.2", new Object[] {
			s, String.valueOf(file.getFilePointer())
		}));
	//    0    0:new             #122 <Class InvalidPdfException>
	//    1    3:dup             
	//    2    4:ldc2            #263 <String "1.at.file.pointer.2">
	//    3    7:iconst_2        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_1         
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:aload_0         
	//   12   18:getfield        #43  <Field RandomAccessFileOrArray file>
	//   13   21:invokevirtual   #153 <Method long RandomAccessFileOrArray.getFilePointer()>
	//   14   24:invokestatic    #267 <Method String String.valueOf(long)>
	//   15   27:aastore         
	//   16   28:invokestatic    #130 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   17   31:invokespecial   #133 <Method void InvalidPdfException(String)>
	//   18   34:athrow          
	}

	static final String EMPTY = "";
	public static final boolean delims[] = {
		1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 
		1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 
		0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0
	};
	private final RandomAccessFileOrArray file;
	protected int generation;
	protected boolean hexString;
	private final StringBuilder outBuf = new StringBuilder();
	protected int reference;
	protected String stringValue;
	protected TokenType type;

	static 
	{
	//    0    0:sipush          257
	//    1    3:newarray        boolean[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #28  <Int 1>
	//    5    9:bastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #28  <Int 1>
	//    9   14:bastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #29  <Int 0>
	//   13   19:bastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #29  <Int 0>
	//   17   24:bastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #29  <Int 0>
	//   21   29:bastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #29  <Int 0>
	//   25   34:bastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #29  <Int 0>
	//   29   40:bastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #29  <Int 0>
	//   33   46:bastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #29  <Int 0>
	//   37   52:bastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #29  <Int 0>
	//   41   58:bastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #28  <Int 1>
	//   45   64:bastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #28  <Int 1>
	//   49   70:bastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #29  <Int 0>
	//   53   76:bastore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:ldc1            #28  <Int 1>
	//   57   82:bastore         
	//   58   83:dup             
	//   59   84:bipush          14
	//   60   86:ldc1            #28  <Int 1>
	//   61   88:bastore         
	//   62   89:dup             
	//   63   90:bipush          15
	//   64   92:ldc1            #29  <Int 0>
	//   65   94:bastore         
	//   66   95:dup             
	//   67   96:bipush          16
	//   68   98:ldc1            #29  <Int 0>
	//   69  100:bastore         
	//   70  101:dup             
	//   71  102:bipush          17
	//   72  104:ldc1            #29  <Int 0>
	//   73  106:bastore         
	//   74  107:dup             
	//   75  108:bipush          18
	//   76  110:ldc1            #29  <Int 0>
	//   77  112:bastore         
	//   78  113:dup             
	//   79  114:bipush          19
	//   80  116:ldc1            #29  <Int 0>
	//   81  118:bastore         
	//   82  119:dup             
	//   83  120:bipush          20
	//   84  122:ldc1            #29  <Int 0>
	//   85  124:bastore         
	//   86  125:dup             
	//   87  126:bipush          21
	//   88  128:ldc1            #29  <Int 0>
	//   89  130:bastore         
	//   90  131:dup             
	//   91  132:bipush          22
	//   92  134:ldc1            #29  <Int 0>
	//   93  136:bastore         
	//   94  137:dup             
	//   95  138:bipush          23
	//   96  140:ldc1            #29  <Int 0>
	//   97  142:bastore         
	//   98  143:dup             
	//   99  144:bipush          24
	//  100  146:ldc1            #29  <Int 0>
	//  101  148:bastore         
	//  102  149:dup             
	//  103  150:bipush          25
	//  104  152:ldc1            #29  <Int 0>
	//  105  154:bastore         
	//  106  155:dup             
	//  107  156:bipush          26
	//  108  158:ldc1            #29  <Int 0>
	//  109  160:bastore         
	//  110  161:dup             
	//  111  162:bipush          27
	//  112  164:ldc1            #29  <Int 0>
	//  113  166:bastore         
	//  114  167:dup             
	//  115  168:bipush          28
	//  116  170:ldc1            #29  <Int 0>
	//  117  172:bastore         
	//  118  173:dup             
	//  119  174:bipush          29
	//  120  176:ldc1            #29  <Int 0>
	//  121  178:bastore         
	//  122  179:dup             
	//  123  180:bipush          30
	//  124  182:ldc1            #29  <Int 0>
	//  125  184:bastore         
	//  126  185:dup             
	//  127  186:bipush          31
	//  128  188:ldc1            #29  <Int 0>
	//  129  190:bastore         
	//  130  191:dup             
	//  131  192:bipush          32
	//  132  194:ldc1            #29  <Int 0>
	//  133  196:bastore         
	//  134  197:dup             
	//  135  198:bipush          33
	//  136  200:ldc1            #28  <Int 1>
	//  137  202:bastore         
	//  138  203:dup             
	//  139  204:bipush          34
	//  140  206:ldc1            #29  <Int 0>
	//  141  208:bastore         
	//  142  209:dup             
	//  143  210:bipush          35
	//  144  212:ldc1            #29  <Int 0>
	//  145  214:bastore         
	//  146  215:dup             
	//  147  216:bipush          36
	//  148  218:ldc1            #29  <Int 0>
	//  149  220:bastore         
	//  150  221:dup             
	//  151  222:bipush          37
	//  152  224:ldc1            #29  <Int 0>
	//  153  226:bastore         
	//  154  227:dup             
	//  155  228:bipush          38
	//  156  230:ldc1            #28  <Int 1>
	//  157  232:bastore         
	//  158  233:dup             
	//  159  234:bipush          39
	//  160  236:ldc1            #29  <Int 0>
	//  161  238:bastore         
	//  162  239:dup             
	//  163  240:bipush          40
	//  164  242:ldc1            #29  <Int 0>
	//  165  244:bastore         
	//  166  245:dup             
	//  167  246:bipush          41
	//  168  248:ldc1            #28  <Int 1>
	//  169  250:bastore         
	//  170  251:dup             
	//  171  252:bipush          42
	//  172  254:ldc1            #28  <Int 1>
	//  173  256:bastore         
	//  174  257:dup             
	//  175  258:bipush          43
	//  176  260:ldc1            #29  <Int 0>
	//  177  262:bastore         
	//  178  263:dup             
	//  179  264:bipush          44
	//  180  266:ldc1            #29  <Int 0>
	//  181  268:bastore         
	//  182  269:dup             
	//  183  270:bipush          45
	//  184  272:ldc1            #29  <Int 0>
	//  185  274:bastore         
	//  186  275:dup             
	//  187  276:bipush          46
	//  188  278:ldc1            #29  <Int 0>
	//  189  280:bastore         
	//  190  281:dup             
	//  191  282:bipush          47
	//  192  284:ldc1            #29  <Int 0>
	//  193  286:bastore         
	//  194  287:dup             
	//  195  288:bipush          48
	//  196  290:ldc1            #28  <Int 1>
	//  197  292:bastore         
	//  198  293:dup             
	//  199  294:bipush          49
	//  200  296:ldc1            #29  <Int 0>
	//  201  298:bastore         
	//  202  299:dup             
	//  203  300:bipush          50
	//  204  302:ldc1            #29  <Int 0>
	//  205  304:bastore         
	//  206  305:dup             
	//  207  306:bipush          51
	//  208  308:ldc1            #29  <Int 0>
	//  209  310:bastore         
	//  210  311:dup             
	//  211  312:bipush          52
	//  212  314:ldc1            #29  <Int 0>
	//  213  316:bastore         
	//  214  317:dup             
	//  215  318:bipush          53
	//  216  320:ldc1            #29  <Int 0>
	//  217  322:bastore         
	//  218  323:dup             
	//  219  324:bipush          54
	//  220  326:ldc1            #29  <Int 0>
	//  221  328:bastore         
	//  222  329:dup             
	//  223  330:bipush          55
	//  224  332:ldc1            #29  <Int 0>
	//  225  334:bastore         
	//  226  335:dup             
	//  227  336:bipush          56
	//  228  338:ldc1            #29  <Int 0>
	//  229  340:bastore         
	//  230  341:dup             
	//  231  342:bipush          57
	//  232  344:ldc1            #29  <Int 0>
	//  233  346:bastore         
	//  234  347:dup             
	//  235  348:bipush          58
	//  236  350:ldc1            #29  <Int 0>
	//  237  352:bastore         
	//  238  353:dup             
	//  239  354:bipush          59
	//  240  356:ldc1            #29  <Int 0>
	//  241  358:bastore         
	//  242  359:dup             
	//  243  360:bipush          60
	//  244  362:ldc1            #29  <Int 0>
	//  245  364:bastore         
	//  246  365:dup             
	//  247  366:bipush          61
	//  248  368:ldc1            #28  <Int 1>
	//  249  370:bastore         
	//  250  371:dup             
	//  251  372:bipush          62
	//  252  374:ldc1            #29  <Int 0>
	//  253  376:bastore         
	//  254  377:dup             
	//  255  378:bipush          63
	//  256  380:ldc1            #28  <Int 1>
	//  257  382:bastore         
	//  258  383:dup             
	//  259  384:bipush          64
	//  260  386:ldc1            #29  <Int 0>
	//  261  388:bastore         
	//  262  389:dup             
	//  263  390:bipush          65
	//  264  392:ldc1            #29  <Int 0>
	//  265  394:bastore         
	//  266  395:dup             
	//  267  396:bipush          66
	//  268  398:ldc1            #29  <Int 0>
	//  269  400:bastore         
	//  270  401:dup             
	//  271  402:bipush          67
	//  272  404:ldc1            #29  <Int 0>
	//  273  406:bastore         
	//  274  407:dup             
	//  275  408:bipush          68
	//  276  410:ldc1            #29  <Int 0>
	//  277  412:bastore         
	//  278  413:dup             
	//  279  414:bipush          69
	//  280  416:ldc1            #29  <Int 0>
	//  281  418:bastore         
	//  282  419:dup             
	//  283  420:bipush          70
	//  284  422:ldc1            #29  <Int 0>
	//  285  424:bastore         
	//  286  425:dup             
	//  287  426:bipush          71
	//  288  428:ldc1            #29  <Int 0>
	//  289  430:bastore         
	//  290  431:dup             
	//  291  432:bipush          72
	//  292  434:ldc1            #29  <Int 0>
	//  293  436:bastore         
	//  294  437:dup             
	//  295  438:bipush          73
	//  296  440:ldc1            #29  <Int 0>
	//  297  442:bastore         
	//  298  443:dup             
	//  299  444:bipush          74
	//  300  446:ldc1            #29  <Int 0>
	//  301  448:bastore         
	//  302  449:dup             
	//  303  450:bipush          75
	//  304  452:ldc1            #29  <Int 0>
	//  305  454:bastore         
	//  306  455:dup             
	//  307  456:bipush          76
	//  308  458:ldc1            #29  <Int 0>
	//  309  460:bastore         
	//  310  461:dup             
	//  311  462:bipush          77
	//  312  464:ldc1            #29  <Int 0>
	//  313  466:bastore         
	//  314  467:dup             
	//  315  468:bipush          78
	//  316  470:ldc1            #29  <Int 0>
	//  317  472:bastore         
	//  318  473:dup             
	//  319  474:bipush          79
	//  320  476:ldc1            #29  <Int 0>
	//  321  478:bastore         
	//  322  479:dup             
	//  323  480:bipush          80
	//  324  482:ldc1            #29  <Int 0>
	//  325  484:bastore         
	//  326  485:dup             
	//  327  486:bipush          81
	//  328  488:ldc1            #29  <Int 0>
	//  329  490:bastore         
	//  330  491:dup             
	//  331  492:bipush          82
	//  332  494:ldc1            #29  <Int 0>
	//  333  496:bastore         
	//  334  497:dup             
	//  335  498:bipush          83
	//  336  500:ldc1            #29  <Int 0>
	//  337  502:bastore         
	//  338  503:dup             
	//  339  504:bipush          84
	//  340  506:ldc1            #29  <Int 0>
	//  341  508:bastore         
	//  342  509:dup             
	//  343  510:bipush          85
	//  344  512:ldc1            #29  <Int 0>
	//  345  514:bastore         
	//  346  515:dup             
	//  347  516:bipush          86
	//  348  518:ldc1            #29  <Int 0>
	//  349  520:bastore         
	//  350  521:dup             
	//  351  522:bipush          87
	//  352  524:ldc1            #29  <Int 0>
	//  353  526:bastore         
	//  354  527:dup             
	//  355  528:bipush          88
	//  356  530:ldc1            #29  <Int 0>
	//  357  532:bastore         
	//  358  533:dup             
	//  359  534:bipush          89
	//  360  536:ldc1            #29  <Int 0>
	//  361  538:bastore         
	//  362  539:dup             
	//  363  540:bipush          90
	//  364  542:ldc1            #29  <Int 0>
	//  365  544:bastore         
	//  366  545:dup             
	//  367  546:bipush          91
	//  368  548:ldc1            #29  <Int 0>
	//  369  550:bastore         
	//  370  551:dup             
	//  371  552:bipush          92
	//  372  554:ldc1            #28  <Int 1>
	//  373  556:bastore         
	//  374  557:dup             
	//  375  558:bipush          93
	//  376  560:ldc1            #29  <Int 0>
	//  377  562:bastore         
	//  378  563:dup             
	//  379  564:bipush          94
	//  380  566:ldc1            #28  <Int 1>
	//  381  568:bastore         
	//  382  569:dup             
	//  383  570:bipush          95
	//  384  572:ldc1            #29  <Int 0>
	//  385  574:bastore         
	//  386  575:dup             
	//  387  576:bipush          96
	//  388  578:ldc1            #29  <Int 0>
	//  389  580:bastore         
	//  390  581:dup             
	//  391  582:bipush          97
	//  392  584:ldc1            #29  <Int 0>
	//  393  586:bastore         
	//  394  587:dup             
	//  395  588:bipush          98
	//  396  590:ldc1            #29  <Int 0>
	//  397  592:bastore         
	//  398  593:dup             
	//  399  594:bipush          99
	//  400  596:ldc1            #29  <Int 0>
	//  401  598:bastore         
	//  402  599:dup             
	//  403  600:bipush          100
	//  404  602:ldc1            #29  <Int 0>
	//  405  604:bastore         
	//  406  605:dup             
	//  407  606:bipush          101
	//  408  608:ldc1            #29  <Int 0>
	//  409  610:bastore         
	//  410  611:dup             
	//  411  612:bipush          102
	//  412  614:ldc1            #29  <Int 0>
	//  413  616:bastore         
	//  414  617:dup             
	//  415  618:bipush          103
	//  416  620:ldc1            #29  <Int 0>
	//  417  622:bastore         
	//  418  623:dup             
	//  419  624:bipush          104
	//  420  626:ldc1            #29  <Int 0>
	//  421  628:bastore         
	//  422  629:dup             
	//  423  630:bipush          105
	//  424  632:ldc1            #29  <Int 0>
	//  425  634:bastore         
	//  426  635:dup             
	//  427  636:bipush          106
	//  428  638:ldc1            #29  <Int 0>
	//  429  640:bastore         
	//  430  641:dup             
	//  431  642:bipush          107
	//  432  644:ldc1            #29  <Int 0>
	//  433  646:bastore         
	//  434  647:dup             
	//  435  648:bipush          108
	//  436  650:ldc1            #29  <Int 0>
	//  437  652:bastore         
	//  438  653:dup             
	//  439  654:bipush          109
	//  440  656:ldc1            #29  <Int 0>
	//  441  658:bastore         
	//  442  659:dup             
	//  443  660:bipush          110
	//  444  662:ldc1            #29  <Int 0>
	//  445  664:bastore         
	//  446  665:dup             
	//  447  666:bipush          111
	//  448  668:ldc1            #29  <Int 0>
	//  449  670:bastore         
	//  450  671:dup             
	//  451  672:bipush          112
	//  452  674:ldc1            #29  <Int 0>
	//  453  676:bastore         
	//  454  677:dup             
	//  455  678:bipush          113
	//  456  680:ldc1            #29  <Int 0>
	//  457  682:bastore         
	//  458  683:dup             
	//  459  684:bipush          114
	//  460  686:ldc1            #29  <Int 0>
	//  461  688:bastore         
	//  462  689:dup             
	//  463  690:bipush          115
	//  464  692:ldc1            #29  <Int 0>
	//  465  694:bastore         
	//  466  695:dup             
	//  467  696:bipush          116
	//  468  698:ldc1            #29  <Int 0>
	//  469  700:bastore         
	//  470  701:dup             
	//  471  702:bipush          117
	//  472  704:ldc1            #29  <Int 0>
	//  473  706:bastore         
	//  474  707:dup             
	//  475  708:bipush          118
	//  476  710:ldc1            #29  <Int 0>
	//  477  712:bastore         
	//  478  713:dup             
	//  479  714:bipush          119
	//  480  716:ldc1            #29  <Int 0>
	//  481  718:bastore         
	//  482  719:dup             
	//  483  720:bipush          120
	//  484  722:ldc1            #29  <Int 0>
	//  485  724:bastore         
	//  486  725:dup             
	//  487  726:bipush          121
	//  488  728:ldc1            #29  <Int 0>
	//  489  730:bastore         
	//  490  731:dup             
	//  491  732:bipush          122
	//  492  734:ldc1            #29  <Int 0>
	//  493  736:bastore         
	//  494  737:dup             
	//  495  738:bipush          123
	//  496  740:ldc1            #29  <Int 0>
	//  497  742:bastore         
	//  498  743:dup             
	//  499  744:bipush          124
	//  500  746:ldc1            #29  <Int 0>
	//  501  748:bastore         
	//  502  749:dup             
	//  503  750:bipush          125
	//  504  752:ldc1            #29  <Int 0>
	//  505  754:bastore         
	//  506  755:dup             
	//  507  756:bipush          126
	//  508  758:ldc1            #29  <Int 0>
	//  509  760:bastore         
	//  510  761:dup             
	//  511  762:bipush          127
	//  512  764:ldc1            #29  <Int 0>
	//  513  766:bastore         
	//  514  767:dup             
	//  515  768:sipush          128
	//  516  771:ldc1            #29  <Int 0>
	//  517  773:bastore         
	//  518  774:dup             
	//  519  775:sipush          129
	//  520  778:ldc1            #29  <Int 0>
	//  521  780:bastore         
	//  522  781:dup             
	//  523  782:sipush          130
	//  524  785:ldc1            #29  <Int 0>
	//  525  787:bastore         
	//  526  788:dup             
	//  527  789:sipush          131
	//  528  792:ldc1            #29  <Int 0>
	//  529  794:bastore         
	//  530  795:dup             
	//  531  796:sipush          132
	//  532  799:ldc1            #29  <Int 0>
	//  533  801:bastore         
	//  534  802:dup             
	//  535  803:sipush          133
	//  536  806:ldc1            #29  <Int 0>
	//  537  808:bastore         
	//  538  809:dup             
	//  539  810:sipush          134
	//  540  813:ldc1            #29  <Int 0>
	//  541  815:bastore         
	//  542  816:dup             
	//  543  817:sipush          135
	//  544  820:ldc1            #29  <Int 0>
	//  545  822:bastore         
	//  546  823:dup             
	//  547  824:sipush          136
	//  548  827:ldc1            #29  <Int 0>
	//  549  829:bastore         
	//  550  830:dup             
	//  551  831:sipush          137
	//  552  834:ldc1            #29  <Int 0>
	//  553  836:bastore         
	//  554  837:dup             
	//  555  838:sipush          138
	//  556  841:ldc1            #29  <Int 0>
	//  557  843:bastore         
	//  558  844:dup             
	//  559  845:sipush          139
	//  560  848:ldc1            #29  <Int 0>
	//  561  850:bastore         
	//  562  851:dup             
	//  563  852:sipush          140
	//  564  855:ldc1            #29  <Int 0>
	//  565  857:bastore         
	//  566  858:dup             
	//  567  859:sipush          141
	//  568  862:ldc1            #29  <Int 0>
	//  569  864:bastore         
	//  570  865:dup             
	//  571  866:sipush          142
	//  572  869:ldc1            #29  <Int 0>
	//  573  871:bastore         
	//  574  872:dup             
	//  575  873:sipush          143
	//  576  876:ldc1            #29  <Int 0>
	//  577  878:bastore         
	//  578  879:dup             
	//  579  880:sipush          144
	//  580  883:ldc1            #29  <Int 0>
	//  581  885:bastore         
	//  582  886:dup             
	//  583  887:sipush          145
	//  584  890:ldc1            #29  <Int 0>
	//  585  892:bastore         
	//  586  893:dup             
	//  587  894:sipush          146
	//  588  897:ldc1            #29  <Int 0>
	//  589  899:bastore         
	//  590  900:dup             
	//  591  901:sipush          147
	//  592  904:ldc1            #29  <Int 0>
	//  593  906:bastore         
	//  594  907:dup             
	//  595  908:sipush          148
	//  596  911:ldc1            #29  <Int 0>
	//  597  913:bastore         
	//  598  914:dup             
	//  599  915:sipush          149
	//  600  918:ldc1            #29  <Int 0>
	//  601  920:bastore         
	//  602  921:dup             
	//  603  922:sipush          150
	//  604  925:ldc1            #29  <Int 0>
	//  605  927:bastore         
	//  606  928:dup             
	//  607  929:sipush          151
	//  608  932:ldc1            #29  <Int 0>
	//  609  934:bastore         
	//  610  935:dup             
	//  611  936:sipush          152
	//  612  939:ldc1            #29  <Int 0>
	//  613  941:bastore         
	//  614  942:dup             
	//  615  943:sipush          153
	//  616  946:ldc1            #29  <Int 0>
	//  617  948:bastore         
	//  618  949:dup             
	//  619  950:sipush          154
	//  620  953:ldc1            #29  <Int 0>
	//  621  955:bastore         
	//  622  956:dup             
	//  623  957:sipush          155
	//  624  960:ldc1            #29  <Int 0>
	//  625  962:bastore         
	//  626  963:dup             
	//  627  964:sipush          156
	//  628  967:ldc1            #29  <Int 0>
	//  629  969:bastore         
	//  630  970:dup             
	//  631  971:sipush          157
	//  632  974:ldc1            #29  <Int 0>
	//  633  976:bastore         
	//  634  977:dup             
	//  635  978:sipush          158
	//  636  981:ldc1            #29  <Int 0>
	//  637  983:bastore         
	//  638  984:dup             
	//  639  985:sipush          159
	//  640  988:ldc1            #29  <Int 0>
	//  641  990:bastore         
	//  642  991:dup             
	//  643  992:sipush          160
	//  644  995:ldc1            #29  <Int 0>
	//  645  997:bastore         
	//  646  998:dup             
	//  647  999:sipush          161
	//  648 1002:ldc1            #29  <Int 0>
	//  649 1004:bastore         
	//  650 1005:dup             
	//  651 1006:sipush          162
	//  652 1009:ldc1            #29  <Int 0>
	//  653 1011:bastore         
	//  654 1012:dup             
	//  655 1013:sipush          163
	//  656 1016:ldc1            #29  <Int 0>
	//  657 1018:bastore         
	//  658 1019:dup             
	//  659 1020:sipush          164
	//  660 1023:ldc1            #29  <Int 0>
	//  661 1025:bastore         
	//  662 1026:dup             
	//  663 1027:sipush          165
	//  664 1030:ldc1            #29  <Int 0>
	//  665 1032:bastore         
	//  666 1033:dup             
	//  667 1034:sipush          166
	//  668 1037:ldc1            #29  <Int 0>
	//  669 1039:bastore         
	//  670 1040:dup             
	//  671 1041:sipush          167
	//  672 1044:ldc1            #29  <Int 0>
	//  673 1046:bastore         
	//  674 1047:dup             
	//  675 1048:sipush          168
	//  676 1051:ldc1            #29  <Int 0>
	//  677 1053:bastore         
	//  678 1054:dup             
	//  679 1055:sipush          169
	//  680 1058:ldc1            #29  <Int 0>
	//  681 1060:bastore         
	//  682 1061:dup             
	//  683 1062:sipush          170
	//  684 1065:ldc1            #29  <Int 0>
	//  685 1067:bastore         
	//  686 1068:dup             
	//  687 1069:sipush          171
	//  688 1072:ldc1            #29  <Int 0>
	//  689 1074:bastore         
	//  690 1075:dup             
	//  691 1076:sipush          172
	//  692 1079:ldc1            #29  <Int 0>
	//  693 1081:bastore         
	//  694 1082:dup             
	//  695 1083:sipush          173
	//  696 1086:ldc1            #29  <Int 0>
	//  697 1088:bastore         
	//  698 1089:dup             
	//  699 1090:sipush          174
	//  700 1093:ldc1            #29  <Int 0>
	//  701 1095:bastore         
	//  702 1096:dup             
	//  703 1097:sipush          175
	//  704 1100:ldc1            #29  <Int 0>
	//  705 1102:bastore         
	//  706 1103:dup             
	//  707 1104:sipush          176
	//  708 1107:ldc1            #29  <Int 0>
	//  709 1109:bastore         
	//  710 1110:dup             
	//  711 1111:sipush          177
	//  712 1114:ldc1            #29  <Int 0>
	//  713 1116:bastore         
	//  714 1117:dup             
	//  715 1118:sipush          178
	//  716 1121:ldc1            #29  <Int 0>
	//  717 1123:bastore         
	//  718 1124:dup             
	//  719 1125:sipush          179
	//  720 1128:ldc1            #29  <Int 0>
	//  721 1130:bastore         
	//  722 1131:dup             
	//  723 1132:sipush          180
	//  724 1135:ldc1            #29  <Int 0>
	//  725 1137:bastore         
	//  726 1138:dup             
	//  727 1139:sipush          181
	//  728 1142:ldc1            #29  <Int 0>
	//  729 1144:bastore         
	//  730 1145:dup             
	//  731 1146:sipush          182
	//  732 1149:ldc1            #29  <Int 0>
	//  733 1151:bastore         
	//  734 1152:dup             
	//  735 1153:sipush          183
	//  736 1156:ldc1            #29  <Int 0>
	//  737 1158:bastore         
	//  738 1159:dup             
	//  739 1160:sipush          184
	//  740 1163:ldc1            #29  <Int 0>
	//  741 1165:bastore         
	//  742 1166:dup             
	//  743 1167:sipush          185
	//  744 1170:ldc1            #29  <Int 0>
	//  745 1172:bastore         
	//  746 1173:dup             
	//  747 1174:sipush          186
	//  748 1177:ldc1            #29  <Int 0>
	//  749 1179:bastore         
	//  750 1180:dup             
	//  751 1181:sipush          187
	//  752 1184:ldc1            #29  <Int 0>
	//  753 1186:bastore         
	//  754 1187:dup             
	//  755 1188:sipush          188
	//  756 1191:ldc1            #29  <Int 0>
	//  757 1193:bastore         
	//  758 1194:dup             
	//  759 1195:sipush          189
	//  760 1198:ldc1            #29  <Int 0>
	//  761 1200:bastore         
	//  762 1201:dup             
	//  763 1202:sipush          190
	//  764 1205:ldc1            #29  <Int 0>
	//  765 1207:bastore         
	//  766 1208:dup             
	//  767 1209:sipush          191
	//  768 1212:ldc1            #29  <Int 0>
	//  769 1214:bastore         
	//  770 1215:dup             
	//  771 1216:sipush          192
	//  772 1219:ldc1            #29  <Int 0>
	//  773 1221:bastore         
	//  774 1222:dup             
	//  775 1223:sipush          193
	//  776 1226:ldc1            #29  <Int 0>
	//  777 1228:bastore         
	//  778 1229:dup             
	//  779 1230:sipush          194
	//  780 1233:ldc1            #29  <Int 0>
	//  781 1235:bastore         
	//  782 1236:dup             
	//  783 1237:sipush          195
	//  784 1240:ldc1            #29  <Int 0>
	//  785 1242:bastore         
	//  786 1243:dup             
	//  787 1244:sipush          196
	//  788 1247:ldc1            #29  <Int 0>
	//  789 1249:bastore         
	//  790 1250:dup             
	//  791 1251:sipush          197
	//  792 1254:ldc1            #29  <Int 0>
	//  793 1256:bastore         
	//  794 1257:dup             
	//  795 1258:sipush          198
	//  796 1261:ldc1            #29  <Int 0>
	//  797 1263:bastore         
	//  798 1264:dup             
	//  799 1265:sipush          199
	//  800 1268:ldc1            #29  <Int 0>
	//  801 1270:bastore         
	//  802 1271:dup             
	//  803 1272:sipush          200
	//  804 1275:ldc1            #29  <Int 0>
	//  805 1277:bastore         
	//  806 1278:dup             
	//  807 1279:sipush          201
	//  808 1282:ldc1            #29  <Int 0>
	//  809 1284:bastore         
	//  810 1285:dup             
	//  811 1286:sipush          202
	//  812 1289:ldc1            #29  <Int 0>
	//  813 1291:bastore         
	//  814 1292:dup             
	//  815 1293:sipush          203
	//  816 1296:ldc1            #29  <Int 0>
	//  817 1298:bastore         
	//  818 1299:dup             
	//  819 1300:sipush          204
	//  820 1303:ldc1            #29  <Int 0>
	//  821 1305:bastore         
	//  822 1306:dup             
	//  823 1307:sipush          205
	//  824 1310:ldc1            #29  <Int 0>
	//  825 1312:bastore         
	//  826 1313:dup             
	//  827 1314:sipush          206
	//  828 1317:ldc1            #29  <Int 0>
	//  829 1319:bastore         
	//  830 1320:dup             
	//  831 1321:sipush          207
	//  832 1324:ldc1            #29  <Int 0>
	//  833 1326:bastore         
	//  834 1327:dup             
	//  835 1328:sipush          208
	//  836 1331:ldc1            #29  <Int 0>
	//  837 1333:bastore         
	//  838 1334:dup             
	//  839 1335:sipush          209
	//  840 1338:ldc1            #29  <Int 0>
	//  841 1340:bastore         
	//  842 1341:dup             
	//  843 1342:sipush          210
	//  844 1345:ldc1            #29  <Int 0>
	//  845 1347:bastore         
	//  846 1348:dup             
	//  847 1349:sipush          211
	//  848 1352:ldc1            #29  <Int 0>
	//  849 1354:bastore         
	//  850 1355:dup             
	//  851 1356:sipush          212
	//  852 1359:ldc1            #29  <Int 0>
	//  853 1361:bastore         
	//  854 1362:dup             
	//  855 1363:sipush          213
	//  856 1366:ldc1            #29  <Int 0>
	//  857 1368:bastore         
	//  858 1369:dup             
	//  859 1370:sipush          214
	//  860 1373:ldc1            #29  <Int 0>
	//  861 1375:bastore         
	//  862 1376:dup             
	//  863 1377:sipush          215
	//  864 1380:ldc1            #29  <Int 0>
	//  865 1382:bastore         
	//  866 1383:dup             
	//  867 1384:sipush          216
	//  868 1387:ldc1            #29  <Int 0>
	//  869 1389:bastore         
	//  870 1390:dup             
	//  871 1391:sipush          217
	//  872 1394:ldc1            #29  <Int 0>
	//  873 1396:bastore         
	//  874 1397:dup             
	//  875 1398:sipush          218
	//  876 1401:ldc1            #29  <Int 0>
	//  877 1403:bastore         
	//  878 1404:dup             
	//  879 1405:sipush          219
	//  880 1408:ldc1            #29  <Int 0>
	//  881 1410:bastore         
	//  882 1411:dup             
	//  883 1412:sipush          220
	//  884 1415:ldc1            #29  <Int 0>
	//  885 1417:bastore         
	//  886 1418:dup             
	//  887 1419:sipush          221
	//  888 1422:ldc1            #29  <Int 0>
	//  889 1424:bastore         
	//  890 1425:dup             
	//  891 1426:sipush          222
	//  892 1429:ldc1            #29  <Int 0>
	//  893 1431:bastore         
	//  894 1432:dup             
	//  895 1433:sipush          223
	//  896 1436:ldc1            #29  <Int 0>
	//  897 1438:bastore         
	//  898 1439:dup             
	//  899 1440:sipush          224
	//  900 1443:ldc1            #29  <Int 0>
	//  901 1445:bastore         
	//  902 1446:dup             
	//  903 1447:sipush          225
	//  904 1450:ldc1            #29  <Int 0>
	//  905 1452:bastore         
	//  906 1453:dup             
	//  907 1454:sipush          226
	//  908 1457:ldc1            #29  <Int 0>
	//  909 1459:bastore         
	//  910 1460:dup             
	//  911 1461:sipush          227
	//  912 1464:ldc1            #29  <Int 0>
	//  913 1466:bastore         
	//  914 1467:dup             
	//  915 1468:sipush          228
	//  916 1471:ldc1            #29  <Int 0>
	//  917 1473:bastore         
	//  918 1474:dup             
	//  919 1475:sipush          229
	//  920 1478:ldc1            #29  <Int 0>
	//  921 1480:bastore         
	//  922 1481:dup             
	//  923 1482:sipush          230
	//  924 1485:ldc1            #29  <Int 0>
	//  925 1487:bastore         
	//  926 1488:dup             
	//  927 1489:sipush          231
	//  928 1492:ldc1            #29  <Int 0>
	//  929 1494:bastore         
	//  930 1495:dup             
	//  931 1496:sipush          232
	//  932 1499:ldc1            #29  <Int 0>
	//  933 1501:bastore         
	//  934 1502:dup             
	//  935 1503:sipush          233
	//  936 1506:ldc1            #29  <Int 0>
	//  937 1508:bastore         
	//  938 1509:dup             
	//  939 1510:sipush          234
	//  940 1513:ldc1            #29  <Int 0>
	//  941 1515:bastore         
	//  942 1516:dup             
	//  943 1517:sipush          235
	//  944 1520:ldc1            #29  <Int 0>
	//  945 1522:bastore         
	//  946 1523:dup             
	//  947 1524:sipush          236
	//  948 1527:ldc1            #29  <Int 0>
	//  949 1529:bastore         
	//  950 1530:dup             
	//  951 1531:sipush          237
	//  952 1534:ldc1            #29  <Int 0>
	//  953 1536:bastore         
	//  954 1537:dup             
	//  955 1538:sipush          238
	//  956 1541:ldc1            #29  <Int 0>
	//  957 1543:bastore         
	//  958 1544:dup             
	//  959 1545:sipush          239
	//  960 1548:ldc1            #29  <Int 0>
	//  961 1550:bastore         
	//  962 1551:dup             
	//  963 1552:sipush          240
	//  964 1555:ldc1            #29  <Int 0>
	//  965 1557:bastore         
	//  966 1558:dup             
	//  967 1559:sipush          241
	//  968 1562:ldc1            #29  <Int 0>
	//  969 1564:bastore         
	//  970 1565:dup             
	//  971 1566:sipush          242
	//  972 1569:ldc1            #29  <Int 0>
	//  973 1571:bastore         
	//  974 1572:dup             
	//  975 1573:sipush          243
	//  976 1576:ldc1            #29  <Int 0>
	//  977 1578:bastore         
	//  978 1579:dup             
	//  979 1580:sipush          244
	//  980 1583:ldc1            #29  <Int 0>
	//  981 1585:bastore         
	//  982 1586:dup             
	//  983 1587:sipush          245
	//  984 1590:ldc1            #29  <Int 0>
	//  985 1592:bastore         
	//  986 1593:dup             
	//  987 1594:sipush          246
	//  988 1597:ldc1            #29  <Int 0>
	//  989 1599:bastore         
	//  990 1600:dup             
	//  991 1601:sipush          247
	//  992 1604:ldc1            #29  <Int 0>
	//  993 1606:bastore         
	//  994 1607:dup             
	//  995 1608:sipush          248
	//  996 1611:ldc1            #29  <Int 0>
	//  997 1613:bastore         
	//  998 1614:dup             
	//  999 1615:sipush          249
	// 1000 1618:ldc1            #29  <Int 0>
	// 1001 1620:bastore         
	// 1002 1621:dup             
	// 1003 1622:sipush          250
	// 1004 1625:ldc1            #29  <Int 0>
	// 1005 1627:bastore         
	// 1006 1628:dup             
	// 1007 1629:sipush          251
	// 1008 1632:ldc1            #29  <Int 0>
	// 1009 1634:bastore         
	// 1010 1635:dup             
	// 1011 1636:sipush          252
	// 1012 1639:ldc1            #29  <Int 0>
	// 1013 1641:bastore         
	// 1014 1642:dup             
	// 1015 1643:sipush          253
	// 1016 1646:ldc1            #29  <Int 0>
	// 1017 1648:bastore         
	// 1018 1649:dup             
	// 1019 1650:sipush          254
	// 1020 1653:ldc1            #29  <Int 0>
	// 1021 1655:bastore         
	// 1022 1656:dup             
	// 1023 1657:sipush          255
	// 1024 1660:ldc1            #29  <Int 0>
	// 1025 1662:bastore         
	// 1026 1663:dup             
	// 1027 1664:sipush          256
	// 1028 1667:ldc1            #29  <Int 0>
	// 1029 1669:bastore         
	// 1030 1670:putstatic       #31  <Field boolean[] delims>
	//*1031 1673:return          
	}
}
