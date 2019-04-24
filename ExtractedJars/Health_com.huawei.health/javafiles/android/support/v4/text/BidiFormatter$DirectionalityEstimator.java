// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;


// Referenced classes of package android.support.v4.text:
//			BidiFormatter

static class BidiFormatter$DirectionalityEstimator
{

	private static byte getCachedDirectionality(char c)
	{
		if(c < '\u0700')
	//*   0    0:iload_0         
	//*   1    1:sipush          1792
	//*   2    4:icmpge          13
			return DIR_TYPE_CACHE[c];
	//    3    7:getstatic       #24  <Field byte[] DIR_TYPE_CACHE>
	//    4   10:iload_0         
	//    5   11:baload          
	//    6   12:ireturn         
		else
			return Character.getDirectionality(c);
	//    7   13:iload_0         
	//    8   14:invokestatic    #50  <Method byte Character.getDirectionality(char)>
	//    9   17:ireturn         
	}

	private byte skipEntityBackward()
	{
		int i = charIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int charIndex>
	//    2    4:istore_1        
		do
		{
			if(charIndex <= 0)
				break;
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field int charIndex>
	//    5    9:ifle            61
			CharSequence charsequence = text;
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field CharSequence text>
	//    8   16:astore_3        
			int j = charIndex - 1;
	//    9   17:aload_0         
	//   10   18:getfield        #54  <Field int charIndex>
	//   11   21:iconst_1        
	//   12   22:isub            
	//   13   23:istore_2        
			charIndex = j;
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:putfield        #54  <Field int charIndex>
			lastChar = charsequence.charAt(j);
	//   17   29:aload_0         
	//   18   30:aload_3         
	//   19   31:iload_2         
	//   20   32:invokeinterface #58  <Method char CharSequence.charAt(int)>
	//   21   37:putfield        #60  <Field char lastChar>
			if(lastChar == '&')
	//*  22   40:aload_0         
	//*  23   41:getfield        #60  <Field char lastChar>
	//*  24   44:bipush          38
	//*  25   46:icmpne          52
				return 12;
	//   26   49:bipush          12
	//   27   51:ireturn         
		} while(lastChar != ';');
	//   28   52:aload_0         
	//   29   53:getfield        #60  <Field char lastChar>
	//   30   56:bipush          59
	//   31   58:icmpne          5
		charIndex = i;
	//   32   61:aload_0         
	//   33   62:iload_1         
	//   34   63:putfield        #54  <Field int charIndex>
		lastChar = ';';
	//   35   66:aload_0         
	//   36   67:bipush          59
	//   37   69:putfield        #60  <Field char lastChar>
		return 13;
	//   38   72:bipush          13
	//   39   74:ireturn         
	}

	private byte skipEntityForward()
	{
		char c;
		do
		{
			if(charIndex >= length)
				break;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int charIndex>
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field int length>
	//    4    8:icmpge          50
			CharSequence charsequence = text;
	//    5   11:aload_0         
	//    6   12:getfield        #37  <Field CharSequence text>
	//    7   15:astore_3        
			int i = charIndex;
	//    8   16:aload_0         
	//    9   17:getfield        #54  <Field int charIndex>
	//   10   20:istore_2        
			charIndex = i + 1;
	//   11   21:aload_0         
	//   12   22:iload_2         
	//   13   23:iconst_1        
	//   14   24:iadd            
	//   15   25:putfield        #54  <Field int charIndex>
			c = charsequence.charAt(i);
	//   16   28:aload_3         
	//   17   29:iload_2         
	//   18   30:invokeinterface #58  <Method char CharSequence.charAt(int)>
	//   19   35:istore_1        
			lastChar = c;
	//   20   36:aload_0         
	//   21   37:iload_1         
	//   22   38:putfield        #60  <Field char lastChar>
		} while(c != ';');
	//   23   41:iload_1         
	//   24   42:bipush          59
	//   25   44:icmpeq          50
	//*  26   47:goto            0
		return 12;
	//   27   50:bipush          12
	//   28   52:ireturn         
	}

	private byte skipTagBackward()
	{
		int i = charIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int charIndex>
	//    2    4:istore_2        
		do
		{
			if(charIndex <= 0)
				break;
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field int charIndex>
	//    5    9:ifle            142
			CharSequence charsequence = text;
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field CharSequence text>
	//    8   16:astore          5
			int j = charIndex - 1;
	//    9   18:aload_0         
	//   10   19:getfield        #54  <Field int charIndex>
	//   11   22:iconst_1        
	//   12   23:isub            
	//   13   24:istore_3        
			charIndex = j;
	//   14   25:aload_0         
	//   15   26:iload_3         
	//   16   27:putfield        #54  <Field int charIndex>
			lastChar = charsequence.charAt(j);
	//   17   30:aload_0         
	//   18   31:aload           5
	//   19   33:iload_3         
	//   20   34:invokeinterface #58  <Method char CharSequence.charAt(int)>
	//   21   39:putfield        #60  <Field char lastChar>
			if(lastChar == '<')
	//*  22   42:aload_0         
	//*  23   43:getfield        #60  <Field char lastChar>
	//*  24   46:bipush          60
	//*  25   48:icmpne          54
				return 12;
	//   26   51:bipush          12
	//   27   53:ireturn         
			if(lastChar == '>')
	//*  28   54:aload_0         
	//*  29   55:getfield        #60  <Field char lastChar>
	//*  30   58:bipush          62
	//*  31   60:icmpne          66
				break;
	//   32   63:goto            142
			if(lastChar != '"' && lastChar != '\'')
				break;
	//   33   66:aload_0         
	//   34   67:getfield        #60  <Field char lastChar>
	//   35   70:bipush          34
	//   36   72:icmpeq          84
	//   37   75:aload_0         
	//   38   76:getfield        #60  <Field char lastChar>
	//   39   79:bipush          39
	//   40   81:icmpne          5
			j = ((int) (lastChar));
	//   41   84:aload_0         
	//   42   85:getfield        #60  <Field char lastChar>
	//   43   88:istore_3        
			char c;
			do
			{
				if(charIndex <= 0)
					break;
	//   44   89:aload_0         
	//   45   90:getfield        #54  <Field int charIndex>
	//   46   93:ifle            139
				CharSequence charsequence1 = text;
	//   47   96:aload_0         
	//   48   97:getfield        #37  <Field CharSequence text>
	//   49  100:astore          5
				int k = charIndex - 1;
	//   50  102:aload_0         
	//   51  103:getfield        #54  <Field int charIndex>
	//   52  106:iconst_1        
	//   53  107:isub            
	//   54  108:istore          4
				charIndex = k;
	//   55  110:aload_0         
	//   56  111:iload           4
	//   57  113:putfield        #54  <Field int charIndex>
				c = charsequence1.charAt(k);
	//   58  116:aload           5
	//   59  118:iload           4
	//   60  120:invokeinterface #58  <Method char CharSequence.charAt(int)>
	//   61  125:istore_1        
				lastChar = c;
	//   62  126:aload_0         
	//   63  127:iload_1         
	//   64  128:putfield        #60  <Field char lastChar>
			} while(c != j);
	//   65  131:iload_1         
	//   66  132:iload_3         
	//   67  133:icmpeq          139
		} while(true);
	//   68  136:goto            89
	//*  69  139:goto            5
		charIndex = i;
	//   70  142:aload_0         
	//   71  143:iload_2         
	//   72  144:putfield        #54  <Field int charIndex>
		lastChar = '>';
	//   73  147:aload_0         
	//   74  148:bipush          62
	//   75  150:putfield        #60  <Field char lastChar>
		return 13;
	//   76  153:bipush          13
	//   77  155:ireturn         
	}

	private byte skipTagForward()
	{
		int i = charIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int charIndex>
	//    2    4:istore_2        
		while(charIndex < length) 
	//*   3    5:aload_0         
	//*   4    6:getfield        #54  <Field int charIndex>
	//*   5    9:aload_0         
	//*   6   10:getfield        #46  <Field int length>
	//*   7   13:icmpge          138
		{
			CharSequence charsequence = text;
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field CharSequence text>
	//   10   20:astore          5
			int j = charIndex;
	//   11   22:aload_0         
	//   12   23:getfield        #54  <Field int charIndex>
	//   13   26:istore_3        
			charIndex = j + 1;
	//   14   27:aload_0         
	//   15   28:iload_3         
	//   16   29:iconst_1        
	//   17   30:iadd            
	//   18   31:putfield        #54  <Field int charIndex>
			lastChar = charsequence.charAt(j);
	//   19   34:aload_0         
	//   20   35:aload           5
	//   21   37:iload_3         
	//   22   38:invokeinterface #58  <Method char CharSequence.charAt(int)>
	//   23   43:putfield        #60  <Field char lastChar>
			if(lastChar == '>')
	//*  24   46:aload_0         
	//*  25   47:getfield        #60  <Field char lastChar>
	//*  26   50:bipush          62
	//*  27   52:icmpne          58
				return 12;
	//   28   55:bipush          12
	//   29   57:ireturn         
			if(lastChar != '"' && lastChar != '\'')
				break;
	//   30   58:aload_0         
	//   31   59:getfield        #60  <Field char lastChar>
	//   32   62:bipush          34
	//   33   64:icmpeq          76
	//   34   67:aload_0         
	//   35   68:getfield        #60  <Field char lastChar>
	//   36   71:bipush          39
	//   37   73:icmpne          5
			j = ((int) (lastChar));
	//   38   76:aload_0         
	//   39   77:getfield        #60  <Field char lastChar>
	//   40   80:istore_3        
			char c;
			do
			{
				if(charIndex >= length)
					break;
	//   41   81:aload_0         
	//   42   82:getfield        #54  <Field int charIndex>
	//   43   85:aload_0         
	//   44   86:getfield        #46  <Field int length>
	//   45   89:icmpge          135
				CharSequence charsequence1 = text;
	//   46   92:aload_0         
	//   47   93:getfield        #37  <Field CharSequence text>
	//   48   96:astore          5
				int k = charIndex;
	//   49   98:aload_0         
	//   50   99:getfield        #54  <Field int charIndex>
	//   51  102:istore          4
				charIndex = k + 1;
	//   52  104:aload_0         
	//   53  105:iload           4
	//   54  107:iconst_1        
	//   55  108:iadd            
	//   56  109:putfield        #54  <Field int charIndex>
				c = charsequence1.charAt(k);
	//   57  112:aload           5
	//   58  114:iload           4
	//   59  116:invokeinterface #58  <Method char CharSequence.charAt(int)>
	//   60  121:istore_1        
				lastChar = c;
	//   61  122:aload_0         
	//   62  123:iload_1         
	//   63  124:putfield        #60  <Field char lastChar>
			} while(c != j);
	//   64  127:iload_1         
	//   65  128:iload_3         
	//   66  129:icmpeq          135
		}
	//*  67  132:goto            81
	//*  68  135:goto            5
		charIndex = i;
	//   69  138:aload_0         
	//   70  139:iload_2         
	//   71  140:putfield        #54  <Field int charIndex>
		lastChar = '<';
	//   72  143:aload_0         
	//   73  144:bipush          60
	//   74  146:putfield        #60  <Field char lastChar>
		return 13;
	//   75  149:bipush          13
	//   76  151:ireturn         
	}

	byte dirTypeBackward()
	{
		lastChar = text.charAt(charIndex - 1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #37  <Field CharSequence text>
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field int charIndex>
	//    5    9:iconst_1        
	//    6   10:isub            
	//    7   11:invokeinterface #58  <Method char CharSequence.charAt(int)>
	//    8   16:putfield        #60  <Field char lastChar>
		if(Character.isLowSurrogate(lastChar))
	//*   9   19:aload_0         
	//*  10   20:getfield        #60  <Field char lastChar>
	//*  11   23:invokestatic    #68  <Method boolean Character.isLowSurrogate(char)>
	//*  12   26:ifeq            59
		{
			int i = Character.codePointBefore(text, charIndex);
	//   13   29:aload_0         
	//   14   30:getfield        #37  <Field CharSequence text>
	//   15   33:aload_0         
	//   16   34:getfield        #54  <Field int charIndex>
	//   17   37:invokestatic    #72  <Method int Character.codePointBefore(CharSequence, int)>
	//   18   40:istore_3        
			charIndex = charIndex - Character.charCount(i);
	//   19   41:aload_0         
	//   20   42:aload_0         
	//   21   43:getfield        #54  <Field int charIndex>
	//   22   46:iload_3         
	//   23   47:invokestatic    #76  <Method int Character.charCount(int)>
	//   24   50:isub            
	//   25   51:putfield        #54  <Field int charIndex>
			return Character.getDirectionality(i);
	//   26   54:iload_3         
	//   27   55:invokestatic    #30  <Method byte Character.getDirectionality(int)>
	//   28   58:ireturn         
		}
		charIndex = charIndex - 1;
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #54  <Field int charIndex>
	//   32   64:iconst_1        
	//   33   65:isub            
	//   34   66:putfield        #54  <Field int charIndex>
		byte byte1 = getCachedDirectionality(lastChar);
	//   35   69:aload_0         
	//   36   70:getfield        #60  <Field char lastChar>
	//   37   73:invokestatic    #78  <Method byte getCachedDirectionality(char)>
	//   38   76:istore_2        
		byte byte0 = byte1;
	//   39   77:iload_2         
	//   40   78:istore_1        
		if(isHtml)
	//*  41   79:aload_0         
	//*  42   80:getfield        #39  <Field boolean isHtml>
	//*  43   83:ifeq            116
		{
			if(lastChar == '>')
	//*  44   86:aload_0         
	//*  45   87:getfield        #60  <Field char lastChar>
	//*  46   90:bipush          62
	//*  47   92:icmpne          100
				return skipTagBackward();
	//   48   95:aload_0         
	//   49   96:invokespecial   #80  <Method byte skipTagBackward()>
	//   50   99:ireturn         
			byte0 = byte1;
	//   51  100:iload_2         
	//   52  101:istore_1        
			if(lastChar == ';')
	//*  53  102:aload_0         
	//*  54  103:getfield        #60  <Field char lastChar>
	//*  55  106:bipush          59
	//*  56  108:icmpne          116
				byte0 = skipEntityBackward();
	//   57  111:aload_0         
	//   58  112:invokespecial   #82  <Method byte skipEntityBackward()>
	//   59  115:istore_1        
		}
		return byte0;
	//   60  116:iload_1         
	//   61  117:ireturn         
	}

	byte dirTypeForward()
	{
		lastChar = text.charAt(charIndex);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #37  <Field CharSequence text>
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field int charIndex>
	//    5    9:invokeinterface #58  <Method char CharSequence.charAt(int)>
	//    6   14:putfield        #60  <Field char lastChar>
		if(Character.isHighSurrogate(lastChar))
	//*   7   17:aload_0         
	//*   8   18:getfield        #60  <Field char lastChar>
	//*   9   21:invokestatic    #86  <Method boolean Character.isHighSurrogate(char)>
	//*  10   24:ifeq            57
		{
			int i = Character.codePointAt(text, charIndex);
	//   11   27:aload_0         
	//   12   28:getfield        #37  <Field CharSequence text>
	//   13   31:aload_0         
	//   14   32:getfield        #54  <Field int charIndex>
	//   15   35:invokestatic    #89  <Method int Character.codePointAt(CharSequence, int)>
	//   16   38:istore_3        
			charIndex = charIndex + Character.charCount(i);
	//   17   39:aload_0         
	//   18   40:aload_0         
	//   19   41:getfield        #54  <Field int charIndex>
	//   20   44:iload_3         
	//   21   45:invokestatic    #76  <Method int Character.charCount(int)>
	//   22   48:iadd            
	//   23   49:putfield        #54  <Field int charIndex>
			return Character.getDirectionality(i);
	//   24   52:iload_3         
	//   25   53:invokestatic    #30  <Method byte Character.getDirectionality(int)>
	//   26   56:ireturn         
		}
		charIndex = charIndex + 1;
	//   27   57:aload_0         
	//   28   58:aload_0         
	//   29   59:getfield        #54  <Field int charIndex>
	//   30   62:iconst_1        
	//   31   63:iadd            
	//   32   64:putfield        #54  <Field int charIndex>
		byte byte1 = getCachedDirectionality(lastChar);
	//   33   67:aload_0         
	//   34   68:getfield        #60  <Field char lastChar>
	//   35   71:invokestatic    #78  <Method byte getCachedDirectionality(char)>
	//   36   74:istore_2        
		byte byte0 = byte1;
	//   37   75:iload_2         
	//   38   76:istore_1        
		if(isHtml)
	//*  39   77:aload_0         
	//*  40   78:getfield        #39  <Field boolean isHtml>
	//*  41   81:ifeq            114
		{
			if(lastChar == '<')
	//*  42   84:aload_0         
	//*  43   85:getfield        #60  <Field char lastChar>
	//*  44   88:bipush          60
	//*  45   90:icmpne          98
				return skipTagForward();
	//   46   93:aload_0         
	//   47   94:invokespecial   #91  <Method byte skipTagForward()>
	//   48   97:ireturn         
			byte0 = byte1;
	//   49   98:iload_2         
	//   50   99:istore_1        
			if(lastChar == '&')
	//*  51  100:aload_0         
	//*  52  101:getfield        #60  <Field char lastChar>
	//*  53  104:bipush          38
	//*  54  106:icmpne          114
				byte0 = skipEntityForward();
	//   55  109:aload_0         
	//   56  110:invokespecial   #93  <Method byte skipEntityForward()>
	//   57  113:istore_1        
		}
		return byte0;
	//   58  114:iload_1         
	//   59  115:ireturn         
	}

	int getEntryDir()
	{
		charIndex = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #54  <Field int charIndex>
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		byte byte0 = 0;
	//    5    7:iconst_0        
	//    6    8:istore_3        
		int j = 0;
	//    7    9:iconst_0        
	//    8   10:istore_2        
		do
		{
			if(charIndex >= length || j != 0)
				break;
	//    9   11:aload_0         
	//   10   12:getfield        #54  <Field int charIndex>
	//   11   15:aload_0         
	//   12   16:getfield        #46  <Field int length>
	//   13   19:icmpge          180
	//   14   22:iload_2         
	//   15   23:ifne            180
			switch(dirTypeForward())
	//*  16   26:aload_0         
	//*  17   27:invokevirtual   #96  <Method byte dirTypeForward()>
			{
	//*  18   30:tableswitch     0 18: default 120
	//	               0 153
	//	               1 164
	//	               2 164
	//	               3 175
	//	               4 175
	//	               5 175
	//	               6 175
	//	               7 175
	//	               8 175
	//	               9 150
	//	               10 175
	//	               11 175
	//	               12 175
	//	               13 175
	//	               14 123
	//	               15 123
	//	               16 132
	//	               17 132
	//	               18 141
	//*  19  120:goto            175
			case 14: // '\016'
			case 15: // '\017'
				i++;
	//   20  123:iload_1         
	//   21  124:iconst_1        
	//   22  125:iadd            
	//   23  126:istore_1        
				byte0 = -1;
	//   24  127:iconst_m1       
	//   25  128:istore_3        
				break;

	//*  26  129:goto            11
			case 16: // '\020'
			case 17: // '\021'
				i++;
	//   27  132:iload_1         
	//   28  133:iconst_1        
	//   29  134:iadd            
	//   30  135:istore_1        
				byte0 = 1;
	//   31  136:iconst_1        
	//   32  137:istore_3        
				break;

	//*  33  138:goto            11
			case 18: // '\022'
				i--;
	//   34  141:iload_1         
	//   35  142:iconst_1        
	//   36  143:isub            
	//   37  144:istore_1        
				byte0 = 0;
	//   38  145:iconst_0        
	//   39  146:istore_3        
				break;

	//*  40  147:goto            11
	//*  41  150:goto            11
			case 0: // '\0'
				if(i == 0)
	//*  42  153:iload_1         
	//*  43  154:ifne            159
					return -1;
	//   44  157:iconst_m1       
	//   45  158:ireturn         
				j = i;
	//   46  159:iload_1         
	//   47  160:istore_2        
				break;

	//*  48  161:goto            11
			case 1: // '\001'
			case 2: // '\002'
				if(i == 0)
	//*  49  164:iload_1         
	//*  50  165:ifne            170
					return 1;
	//   51  168:iconst_1        
	//   52  169:ireturn         
				j = i;
	//   53  170:iload_1         
	//   54  171:istore_2        
				break;

	//*  55  172:goto            11
			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
			case 6: // '\006'
			case 7: // '\007'
			case 8: // '\b'
			case 10: // '\n'
			case 11: // '\013'
			case 12: // '\f'
			case 13: // '\r'
			default:
				j = i;
	//   56  175:iload_1         
	//   57  176:istore_2        
				break;

			case 9: // '\t'
				break;
			}
		} while(true);
	//*  58  177:goto            11
		if(j == 0)
	//*  59  180:iload_2         
	//*  60  181:ifne            186
			return 0;
	//   61  184:iconst_0        
	//   62  185:ireturn         
		if(byte0 != 0)
	//*  63  186:iload_3         
	//*  64  187:ifeq            192
			return ((int) (byte0));
	//   65  190:iload_3         
	//   66  191:ireturn         
		do
			if(charIndex > 0)
	//*  67  192:aload_0         
	//*  68  193:getfield        #54  <Field int charIndex>
	//*  69  196:ifle            274
				switch(dirTypeBackward())
	//*  70  199:aload_0         
	//*  71  200:invokevirtual   #98  <Method byte dirTypeBackward()>
				{
	//*  72  203:tableswitch     14 18: default 236
	//	               14 239
	//	               15 239
	//	               16 253
	//	               17 253
	//	               18 267
	//*  73  236:goto            271
				case 14: // '\016'
				case 15: // '\017'
					if(j == i)
	//*  74  239:iload_2         
	//*  75  240:iload_1         
	//*  76  241:icmpne          246
						return -1;
	//   77  244:iconst_m1       
	//   78  245:ireturn         
					i--;
	//   79  246:iload_1         
	//   80  247:iconst_1        
	//   81  248:isub            
	//   82  249:istore_1        
					break;

	//*  83  250:goto            271
				case 16: // '\020'
				case 17: // '\021'
					if(j == i)
	//*  84  253:iload_2         
	//*  85  254:iload_1         
	//*  86  255:icmpne          260
						return 1;
	//   87  258:iconst_1        
	//   88  259:ireturn         
					i--;
	//   89  260:iload_1         
	//   90  261:iconst_1        
	//   91  262:isub            
	//   92  263:istore_1        
					break;

	//*  93  264:goto            271
				case 18: // '\022'
					i++;
	//   94  267:iload_1         
	//   95  268:iconst_1        
	//   96  269:iadd            
	//   97  270:istore_1        
					break;
				}
			else
	//*  98  271:goto            192
				return 0;
	//   99  274:iconst_0        
	//  100  275:ireturn         
		while(true);
	}

	int getExitDir()
	{
		charIndex = length;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field int length>
	//    3    5:putfield        #54  <Field int charIndex>
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		int j = 0;
	//    6   10:iconst_0        
	//    7   11:istore_2        
		do
		{
			if(charIndex <= 0)
				break;
	//    8   12:aload_0         
	//    9   13:getfield        #54  <Field int charIndex>
	//   10   16:ifle            192
			switch(dirTypeBackward())
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #98  <Method byte dirTypeBackward()>
			{
	//*  13   23:tableswitch     0 18: default 112
	//	               0 115
	//	               1 144
	//	               2 144
	//	               3 183
	//	               4 183
	//	               5 183
	//	               6 183
	//	               7 183
	//	               8 183
	//	               9 180
	//	               10 183
	//	               11 183
	//	               12 183
	//	               13 183
	//	               14 130
	//	               15 130
	//	               16 159
	//	               17 159
	//	               18 173
	//*  14  112:goto            183
			case 0: // '\0'
				if(i == 0)
	//*  15  115:iload_1         
	//*  16  116:ifne            121
					return -1;
	//   17  119:iconst_m1       
	//   18  120:ireturn         
				if(j == 0)
	//*  19  121:iload_2         
	//*  20  122:ifne            12
					j = i;
	//   21  125:iload_1         
	//   22  126:istore_2        
				break;

	//*  23  127:goto            12
			case 14: // '\016'
			case 15: // '\017'
				if(j == i)
	//*  24  130:iload_2         
	//*  25  131:iload_1         
	//*  26  132:icmpne          137
					return -1;
	//   27  135:iconst_m1       
	//   28  136:ireturn         
				i--;
	//   29  137:iload_1         
	//   30  138:iconst_1        
	//   31  139:isub            
	//   32  140:istore_1        
				break;

	//*  33  141:goto            12
			case 1: // '\001'
			case 2: // '\002'
				if(i == 0)
	//*  34  144:iload_1         
	//*  35  145:ifne            150
					return 1;
	//   36  148:iconst_1        
	//   37  149:ireturn         
				if(j == 0)
	//*  38  150:iload_2         
	//*  39  151:ifne            12
					j = i;
	//   40  154:iload_1         
	//   41  155:istore_2        
				break;

	//*  42  156:goto            12
			case 16: // '\020'
			case 17: // '\021'
				if(j == i)
	//*  43  159:iload_2         
	//*  44  160:iload_1         
	//*  45  161:icmpne          166
					return 1;
	//   46  164:iconst_1        
	//   47  165:ireturn         
				i--;
	//   48  166:iload_1         
	//   49  167:iconst_1        
	//   50  168:isub            
	//   51  169:istore_1        
				break;

	//*  52  170:goto            12
			case 18: // '\022'
				i++;
	//   53  173:iload_1         
	//   54  174:iconst_1        
	//   55  175:iadd            
	//   56  176:istore_1        
				break;

	//*  57  177:goto            12
	//*  58  180:goto            12
			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
			case 6: // '\006'
			case 7: // '\007'
			case 8: // '\b'
			case 10: // '\n'
			case 11: // '\013'
			case 12: // '\f'
			case 13: // '\r'
			default:
				if(j == 0)
	//*  59  183:iload_2         
	//*  60  184:ifne            12
					j = i;
	//   61  187:iload_1         
	//   62  188:istore_2        
				break;

			case 9: // '\t'
				break;
			}
		} while(true);
	//   63  189:goto            12
		return 0;
	//   64  192:iconst_0        
	//   65  193:ireturn         
	}

	private static final byte DIR_TYPE_CACHE[];
	private static final int DIR_TYPE_CACHE_SIZE = 1792;
	private int charIndex;
	private final boolean isHtml;
	private char lastChar;
	private final int length;
	private final CharSequence text;

	static 
	{
		DIR_TYPE_CACHE = new byte[1792];
	//    0    0:sipush          1792
	//    1    3:newarray        byte[]
	//    2    5:putstatic       #24  <Field byte[] DIR_TYPE_CACHE>
		for(int i = 0; i < 1792; i++)
	//*   3    8:iconst_0        
	//*   4    9:istore_0        
	//*   5   10:iload_0         
	//*   6   11:sipush          1792
	//*   7   14:icmpge          33
			DIR_TYPE_CACHE[i] = Character.getDirectionality(i);
	//    8   17:getstatic       #24  <Field byte[] DIR_TYPE_CACHE>
	//    9   20:iload_0         
	//   10   21:iload_0         
	//   11   22:invokestatic    #30  <Method byte Character.getDirectionality(int)>
	//   12   25:bastore         

	//   13   26:iload_0         
	//   14   27:iconst_1        
	//   15   28:iadd            
	//   16   29:istore_0        
	//*  17   30:goto            10
	//*  18   33:return          
	}

	BidiFormatter$DirectionalityEstimator(CharSequence charsequence, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		text = charsequence;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field CharSequence text>
		isHtml = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #39  <Field boolean isHtml>
		length = charsequence.length();
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokeinterface #44  <Method int CharSequence.length()>
	//   11   21:putfield        #46  <Field int length>
	//   12   24:return          
	}
}
