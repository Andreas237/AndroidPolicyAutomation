// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf:
//			PRTokeniser, PdfObject, PdfArray, PdfDictionary, 
//			PdfName, PdfLiteral, PdfString, PdfNumber

public class PdfContentParser
{

	public PdfContentParser(PRTokeniser prtokeniser)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		tokeniser = prtokeniser;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field PRTokeniser tokeniser>
	//    5    9:return          
	}

	public PRTokeniser getTokeniser()
	{
		return tokeniser;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field PRTokeniser tokeniser>
	//    2    4:areturn         
	}

	public boolean nextValidToken()
		throws IOException
	{
		while(tokeniser.nextToken()) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field PRTokeniser tokeniser>
	//*   2    4:invokevirtual   #30  <Method boolean PRTokeniser.nextToken()>
	//*   3    7:ifeq            25
			if(tokeniser.getTokenType() != PRTokeniser.TokenType.COMMENT)
	//*   4   10:aload_0         
	//*   5   11:getfield        #18  <Field PRTokeniser tokeniser>
	//*   6   14:invokevirtual   #34  <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*   7   17:getstatic       #40  <Field PRTokeniser$TokenType PRTokeniser$TokenType.COMMENT>
	//*   8   20:if_acmpeq       0
				return true;
	//    9   23:iconst_1        
	//   10   24:ireturn         
		return false;
	//   11   25:iconst_0        
	//   12   26:ireturn         
	}

	public ArrayList parse(ArrayList arraylist)
		throws IOException
	{
		PdfObject pdfobject;
		if(arraylist == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       39
			arraylist = new ArrayList();
	//    2    4:new             #45  <Class ArrayList>
	//    3    7:dup             
	//    4    8:invokespecial   #46  <Method void ArrayList()>
	//    5   11:astore_1        
		else
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #50  <Method PdfObject readPRObject()>
	//*   8   16:astore_2        
	//*   9   17:aload_2         
	//*  10   18:ifnull          37
	//*  11   21:aload_1         
	//*  12   22:aload_2         
	//*  13   23:invokevirtual   #54  <Method boolean ArrayList.add(Object)>
	//*  14   26:pop             
	//*  15   27:aload_2         
	//*  16   28:invokevirtual   #60  <Method int PdfObject.type()>
	//*  17   31:sipush          200
	//*  18   34:icmpne          12
	//*  19   37:aload_1         
	//*  20   38:areturn         
			arraylist.clear();
	//   21   39:aload_1         
	//   22   40:invokevirtual   #63  <Method void ArrayList.clear()>
		do
		{
			pdfobject = readPRObject();
			if(pdfobject == null)
				break;
			arraylist.add(((Object) (pdfobject)));
		} while(pdfobject.type() != 200);
		return arraylist;
	//*  23   43:goto            12
	}

	public PdfArray readArray()
		throws IOException
	{
		PdfArray pdfarray = new PdfArray();
	//    0    0:new             #69  <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void PdfArray()>
	//    3    7:astore_2        
		do
		{
			PdfObject pdfobject = readPRObject();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #50  <Method PdfObject readPRObject()>
	//    6   12:astore_3        
			int i = pdfobject.type();
	//    7   13:aload_3         
	//    8   14:invokevirtual   #60  <Method int PdfObject.type()>
	//    9   17:istore_1        
			if(-i == PRTokeniser.TokenType.END_ARRAY.ordinal())
	//*  10   18:iload_1         
	//*  11   19:ineg            
	//*  12   20:getstatic       #73  <Field PRTokeniser$TokenType PRTokeniser$TokenType.END_ARRAY>
	//*  13   23:invokevirtual   #76  <Method int PRTokeniser$TokenType.ordinal()>
	//*  14   26:icmpne          31
				return pdfarray;
	//   15   29:aload_2         
	//   16   30:areturn         
			if(-i == PRTokeniser.TokenType.END_DIC.ordinal())
	//*  17   31:iload_1         
	//*  18   32:ineg            
	//*  19   33:getstatic       #79  <Field PRTokeniser$TokenType PRTokeniser$TokenType.END_DIC>
	//*  20   36:invokevirtual   #76  <Method int PRTokeniser$TokenType.ordinal()>
	//*  21   39:icmpne          59
				throw new IOException(MessageLocalization.getComposedMessage("unexpected.gt.gt", new Object[0]));
	//   22   42:new             #25  <Class IOException>
	//   23   45:dup             
	//   24   46:ldc1            #81  <String "unexpected.gt.gt">
	//   25   48:iconst_0        
	//   26   49:anewarray       Object[]
	//   27   52:invokestatic    #87  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   28   55:invokespecial   #90  <Method void IOException(String)>
	//   29   58:athrow          
			pdfarray.add(pdfobject);
	//   30   59:aload_2         
	//   31   60:aload_3         
	//   32   61:invokevirtual   #93  <Method boolean PdfArray.add(PdfObject)>
	//   33   64:pop             
		} while(true);
	//   34   65:goto            8
	}

	public PdfDictionary readDictionary()
		throws IOException
	{
		PdfDictionary pdfdictionary = new PdfDictionary();
	//    0    0:new             #97  <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void PdfDictionary()>
	//    3    7:astore_2        
		do
		{
			do
			{
				if(!nextValidToken())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #100 <Method boolean nextValidToken()>
	//*   6   12:ifne            32
					throw new IOException(MessageLocalization.getComposedMessage("unexpected.end.of.file", new Object[0]));
	//    7   15:new             #25  <Class IOException>
	//    8   18:dup             
	//    9   19:ldc1            #102 <String "unexpected.end.of.file">
	//   10   21:iconst_0        
	//   11   22:anewarray       Object[]
	//   12   25:invokestatic    #87  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   13   28:invokespecial   #90  <Method void IOException(String)>
	//   14   31:athrow          
				if(tokeniser.getTokenType() == PRTokeniser.TokenType.END_DIC)
	//*  15   32:aload_0         
	//*  16   33:getfield        #18  <Field PRTokeniser tokeniser>
	//*  17   36:invokevirtual   #34  <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  18   39:getstatic       #79  <Field PRTokeniser$TokenType PRTokeniser$TokenType.END_DIC>
	//*  19   42:if_acmpne       47
					return pdfdictionary;
	//   20   45:aload_2         
	//   21   46:areturn         
			} while(tokeniser.getTokenType() == PRTokeniser.TokenType.OTHER && "def".equals(((Object) (tokeniser.getStringValue()))));
	//   22   47:aload_0         
	//   23   48:getfield        #18  <Field PRTokeniser tokeniser>
	//   24   51:invokevirtual   #34  <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//   25   54:getstatic       #105 <Field PRTokeniser$TokenType PRTokeniser$TokenType.OTHER>
	//   26   57:if_acmpne       75
	//   27   60:ldc1            #107 <String "def">
	//   28   62:aload_0         
	//   29   63:getfield        #18  <Field PRTokeniser tokeniser>
	//   30   66:invokevirtual   #111 <Method String PRTokeniser.getStringValue()>
	//   31   69:invokevirtual   #116 <Method boolean String.equals(Object)>
	//   32   72:ifne            8
			if(tokeniser.getTokenType() != PRTokeniser.TokenType.NAME)
	//*  33   75:aload_0         
	//*  34   76:getfield        #18  <Field PRTokeniser tokeniser>
	//*  35   79:invokevirtual   #34  <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  36   82:getstatic       #119 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NAME>
	//*  37   85:if_acmpeq       115
				throw new IOException(MessageLocalization.getComposedMessage("dictionary.key.1.is.not.a.name", new Object[] {
					tokeniser.getStringValue()
				}));
	//   38   88:new             #25  <Class IOException>
	//   39   91:dup             
	//   40   92:ldc1            #121 <String "dictionary.key.1.is.not.a.name">
	//   41   94:iconst_1        
	//   42   95:anewarray       Object[]
	//   43   98:dup             
	//   44   99:iconst_0        
	//   45  100:aload_0         
	//   46  101:getfield        #18  <Field PRTokeniser tokeniser>
	//   47  104:invokevirtual   #111 <Method String PRTokeniser.getStringValue()>
	//   48  107:aastore         
	//   49  108:invokestatic    #87  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   50  111:invokespecial   #90  <Method void IOException(String)>
	//   51  114:athrow          
			PdfName pdfname = new PdfName(tokeniser.getStringValue(), false);
	//   52  115:new             #123 <Class PdfName>
	//   53  118:dup             
	//   54  119:aload_0         
	//   55  120:getfield        #18  <Field PRTokeniser tokeniser>
	//   56  123:invokevirtual   #111 <Method String PRTokeniser.getStringValue()>
	//   57  126:iconst_0        
	//   58  127:invokespecial   #126 <Method void PdfName(String, boolean)>
	//   59  130:astore_3        
			PdfObject pdfobject = readPRObject();
	//   60  131:aload_0         
	//   61  132:invokevirtual   #50  <Method PdfObject readPRObject()>
	//   62  135:astore          4
			int i = pdfobject.type();
	//   63  137:aload           4
	//   64  139:invokevirtual   #60  <Method int PdfObject.type()>
	//   65  142:istore_1        
			if(-i == PRTokeniser.TokenType.END_DIC.ordinal())
	//*  66  143:iload_1         
	//*  67  144:ineg            
	//*  68  145:getstatic       #79  <Field PRTokeniser$TokenType PRTokeniser$TokenType.END_DIC>
	//*  69  148:invokevirtual   #76  <Method int PRTokeniser$TokenType.ordinal()>
	//*  70  151:icmpne          171
				throw new IOException(MessageLocalization.getComposedMessage("unexpected.gt.gt", new Object[0]));
	//   71  154:new             #25  <Class IOException>
	//   72  157:dup             
	//   73  158:ldc1            #81  <String "unexpected.gt.gt">
	//   74  160:iconst_0        
	//   75  161:anewarray       Object[]
	//   76  164:invokestatic    #87  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   77  167:invokespecial   #90  <Method void IOException(String)>
	//   78  170:athrow          
			if(-i == PRTokeniser.TokenType.END_ARRAY.ordinal())
	//*  79  171:iload_1         
	//*  80  172:ineg            
	//*  81  173:getstatic       #73  <Field PRTokeniser$TokenType PRTokeniser$TokenType.END_ARRAY>
	//*  82  176:invokevirtual   #76  <Method int PRTokeniser$TokenType.ordinal()>
	//*  83  179:icmpne          199
				throw new IOException(MessageLocalization.getComposedMessage("unexpected.close.bracket", new Object[0]));
	//   84  182:new             #25  <Class IOException>
	//   85  185:dup             
	//   86  186:ldc1            #128 <String "unexpected.close.bracket">
	//   87  188:iconst_0        
	//   88  189:anewarray       Object[]
	//   89  192:invokestatic    #87  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   90  195:invokespecial   #90  <Method void IOException(String)>
	//   91  198:athrow          
			pdfdictionary.put(pdfname, pdfobject);
	//   92  199:aload_2         
	//   93  200:aload_3         
	//   94  201:aload           4
	//   95  203:invokevirtual   #132 <Method void PdfDictionary.put(PdfName, PdfObject)>
		} while(true);
	//   96  206:goto            8
	}

	public PdfObject readPRObject()
		throws IOException
	{
		if(!nextValidToken())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #100 <Method boolean nextValidToken()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		PRTokeniser.TokenType tokentype = tokeniser.getTokenType();
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field PRTokeniser tokeniser>
	//    7   13:invokevirtual   #34  <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//    8   16:astore_1        
		static class _cls1
		{

			static final int $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[];

			static 
			{
				$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType = new int[PRTokeniser.TokenType.values().length];
			//    0    0:invokestatic    #18  <Method PRTokeniser$TokenType[] PRTokeniser$TokenType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[PRTokeniser.TokenType.START_DIC.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
			//    5   12:getstatic       #24  <Field PRTokeniser$TokenType PRTokeniser$TokenType.START_DIC>
			//    6   15:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
			//*  10   23:getstatic       #31  <Field PRTokeniser$TokenType PRTokeniser$TokenType.START_ARRAY>
			//*  11   26:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
			//*  15   34:getstatic       #34  <Field PRTokeniser$TokenType PRTokeniser$TokenType.STRING>
			//*  16   37:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
			//*  20   45:getstatic       #37  <Field PRTokeniser$TokenType PRTokeniser$TokenType.NAME>
			//*  21   48:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
			//*  25   56:getstatic       #40  <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
			//*  26   59:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
			//*  30   67:getstatic       #43  <Field PRTokeniser$TokenType PRTokeniser$TokenType.OTHER>
			//*  31   70:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:return          
			//*  35   77:astore_0        
			//*  36   78:return          
			//*  37   79:astore_0        
			//*  38   80:goto            64
			//*  39   83:astore_0        
			//*  40   84:goto            53
			//*  41   87:astore_0        
			//*  42   88:goto            42
			//*  43   91:astore_0        
			//*  44   92:goto            31
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   45   95:astore_0        
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[PRTokeniser.TokenType.START_ARRAY.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror4) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[PRTokeniser.TokenType.STRING.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[PRTokeniser.TokenType.NAME.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[PRTokeniser.TokenType.NUMBER.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[PRTokeniser.TokenType.OTHER.ordinal()] = 6;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  46   96:goto            20
			}
		}

		switch(_cls1..SwitchMap.com.itextpdf.text.pdf.PRTokeniser.TokenType[tokentype.ordinal()])
	//*   9   17:getstatic       #136 <Field int[] PdfContentParser$1.$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #76  <Method int PRTokeniser$TokenType.ordinal()>
	//*  12   24:iaload          
		{
	//*  13   25:tableswitch     1 6: default 64
	//	               1 84
	//	               2 89
	//	               3 94
	//	               4 120
	//	               5 136
	//	               6 151
		default:
			return ((PdfObject) (new PdfLiteral(-tokentype.ordinal(), tokeniser.getStringValue())));
	//   14   64:new             #138 <Class PdfLiteral>
	//   15   67:dup             
	//   16   68:aload_1         
	//   17   69:invokevirtual   #76  <Method int PRTokeniser$TokenType.ordinal()>
	//   18   72:ineg            
	//   19   73:aload_0         
	//   20   74:getfield        #18  <Field PRTokeniser tokeniser>
	//   21   77:invokevirtual   #111 <Method String PRTokeniser.getStringValue()>
	//   22   80:invokespecial   #141 <Method void PdfLiteral(int, String)>
	//   23   83:areturn         

		case 1: // '\001'
			return ((PdfObject) (readDictionary()));
	//   24   84:aload_0         
	//   25   85:invokevirtual   #143 <Method PdfDictionary readDictionary()>
	//   26   88:areturn         

		case 2: // '\002'
			return ((PdfObject) (readArray()));
	//   27   89:aload_0         
	//   28   90:invokevirtual   #145 <Method PdfArray readArray()>
	//   29   93:areturn         

		case 3: // '\003'
			return ((PdfObject) ((new PdfString(tokeniser.getStringValue(), ((String) (null)))).setHexWriting(tokeniser.isHexString())));
	//   30   94:new             #147 <Class PdfString>
	//   31   97:dup             
	//   32   98:aload_0         
	//   33   99:getfield        #18  <Field PRTokeniser tokeniser>
	//   34  102:invokevirtual   #111 <Method String PRTokeniser.getStringValue()>
	//   35  105:aconst_null     
	//   36  106:invokespecial   #150 <Method void PdfString(String, String)>
	//   37  109:aload_0         
	//   38  110:getfield        #18  <Field PRTokeniser tokeniser>
	//   39  113:invokevirtual   #153 <Method boolean PRTokeniser.isHexString()>
	//   40  116:invokevirtual   #157 <Method PdfString PdfString.setHexWriting(boolean)>
	//   41  119:areturn         

		case 4: // '\004'
			return ((PdfObject) (new PdfName(tokeniser.getStringValue(), false)));
	//   42  120:new             #123 <Class PdfName>
	//   43  123:dup             
	//   44  124:aload_0         
	//   45  125:getfield        #18  <Field PRTokeniser tokeniser>
	//   46  128:invokevirtual   #111 <Method String PRTokeniser.getStringValue()>
	//   47  131:iconst_0        
	//   48  132:invokespecial   #126 <Method void PdfName(String, boolean)>
	//   49  135:areturn         

		case 5: // '\005'
			return ((PdfObject) (new PdfNumber(tokeniser.getStringValue())));
	//   50  136:new             #159 <Class PdfNumber>
	//   51  139:dup             
	//   52  140:aload_0         
	//   53  141:getfield        #18  <Field PRTokeniser tokeniser>
	//   54  144:invokevirtual   #111 <Method String PRTokeniser.getStringValue()>
	//   55  147:invokespecial   #160 <Method void PdfNumber(String)>
	//   56  150:areturn         

		case 6: // '\006'
			return ((PdfObject) (new PdfLiteral(200, tokeniser.getStringValue())));
	//   57  151:new             #138 <Class PdfLiteral>
	//   58  154:dup             
	//   59  155:sipush          200
	//   60  158:aload_0         
	//   61  159:getfield        #18  <Field PRTokeniser tokeniser>
	//   62  162:invokevirtual   #111 <Method String PRTokeniser.getStringValue()>
	//   63  165:invokespecial   #141 <Method void PdfLiteral(int, String)>
	//   64  168:areturn         
		}
	}

	public void setTokeniser(PRTokeniser prtokeniser)
	{
		tokeniser = prtokeniser;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field PRTokeniser tokeniser>
	//    3    5:return          
	}

	public static final int COMMAND_TYPE = 200;
	private PRTokeniser tokeniser;
}
