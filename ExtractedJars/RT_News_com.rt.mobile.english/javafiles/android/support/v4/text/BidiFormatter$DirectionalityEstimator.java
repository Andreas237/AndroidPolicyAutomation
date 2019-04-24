// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;


// Referenced classes of package android.support.v4.text:
//			BidiFormatter

private static class BidiFormatter$DirectionalityEstimator
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
	//    5    9:ifle            139
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
	//   32   63:goto            139
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
	//   46   93:ifle            5
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
	//   67  133:icmpeq          5
		} while(true);
	//   68  136:goto            89
		charIndex = i;
	//   69  139:aload_0         
	//   70  140:iload_2         
	//   71  141:putfield        #54  <Field int charIndex>
		lastChar = '>';
	//   72  144:aload_0         
	//   73  145:bipush          62
	//   74  147:putfield        #60  <Field char lastChar>
		return 13;
	//   75  150:bipush          13
	//   76  152:ireturn         
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
	//*   7   13:icmpge          135
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
	//   45   89:icmpge          5
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
	//   66  129:icmpeq          5
		}
	//*  67  132:goto            81
		charIndex = i;
	//   68  135:aload_0         
	//   69  136:iload_2         
	//   70  137:putfield        #54  <Field int charIndex>
		lastChar = '<';
	//   71  140:aload_0         
	//   72  141:bipush          60
	//   73  143:putfield        #60  <Field char lastChar>
		return 13;
	//   74  146:bipush          13
	//   75  148:ireturn         
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
		int i;
		int j;
		int k;
		charIndex = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #54  <Field int charIndex>
		k = 0;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		j = k;
	//    5    7:iload_3         
	//    6    8:istore_2        
		i = j;
	//    7    9:iload_2         
	//    8   10:istore_1        
_L4:
		if(charIndex >= length || k != 0) goto _L2; else goto _L1
	//    9   11:aload_0         
	//   10   12:getfield        #54  <Field int charIndex>
	//   11   15:aload_0         
	//   12   16:getfield        #46  <Field int length>
	//   13   19:icmpge          151
	//   14   22:iload_3         
	//   15   23:ifne            151
_L1:
		byte byte0 = dirTypeForward();
	//   16   26:aload_0         
	//   17   27:invokevirtual   #96  <Method byte dirTypeForward()>
	//   18   30:istore          4
		if(byte0 == 9) goto _L4; else goto _L3
	//   19   32:iload           4
	//   20   34:bipush          9
	//   21   36:icmpeq          11
_L3:
		byte0;
	//   22   39:iload           4
		JVM INSTR tableswitch 0 2: default 68
	//	               0 140
	//	               1 134
	//	               2 134;
	//   23   41:tableswitch     0 2: default 68
	//	               0 140
	//	               1 134
	//	               2 134
		   goto _L5 _L6 _L7 _L7
_L5:
		switch(byte0)
	//*  24   68:iload           4
		{
	//*  25   70:tableswitch     14 18: default 104
	//	               14 125
	//	               15 125
	//	               16 116
	//	               17 116
	//	               18 107
		default:
			break; /* Loop/switch isn't completed */
	//   26  104:goto            146

		case 18: // '\022'
			i--;
	//   27  107:iload_1         
	//   28  108:iconst_1        
	//   29  109:isub            
	//   30  110:istore_1        
			j = 0;
	//   31  111:iconst_0        
	//   32  112:istore_2        
			break;

	//*  33  113:goto            11
		case 16: // '\020'
		case 17: // '\021'
			i++;
	//   34  116:iload_1         
	//   35  117:iconst_1        
	//   36  118:iadd            
	//   37  119:istore_1        
			j = 1;
	//   38  120:iconst_1        
	//   39  121:istore_2        
			break;

	//*  40  122:goto            11
		case 14: // '\016'
		case 15: // '\017'
			i++;
	//   41  125:iload_1         
	//   42  126:iconst_1        
	//   43  127:iadd            
	//   44  128:istore_1        
			j = -1;
	//   45  129:iconst_m1       
	//   46  130:istore_2        
			break;
		}
		  goto _L8
	//*  47  131:goto            11
_L7:
		if(i == 0)
	//*  48  134:iload_1         
	//*  49  135:ifne            146
			return 1;
	//   50  138:iconst_1        
	//   51  139:ireturn         
		break; /* Loop/switch isn't completed */
_L6:
		if(i == 0)
	//*  52  140:iload_1         
	//*  53  141:ifne            146
			return -1;
	//   54  144:iconst_m1       
	//   55  145:ireturn         
		k = i;
	//   56  146:iload_1         
	//   57  147:istore_3        
		  goto _L8
	//*  58  148:goto            11
_L2:
		if(k == 0)
	//*  59  151:iload_3         
	//*  60  152:ifne            157
			return 0;
	//   61  155:iconst_0        
	//   62  156:ireturn         
		if(j != 0)
	//*  63  157:iload_2         
	//*  64  158:ifeq            163
			return j;
	//   65  161:iload_2         
	//   66  162:ireturn         
		do
		{
			if(charIndex > 0)
	//*  67  163:aload_0         
	//*  68  164:getfield        #54  <Field int charIndex>
	//*  69  167:ifle            246
			{
				switch(dirTypeBackward())
	//*  70  170:aload_0         
	//*  71  171:invokevirtual   #98  <Method byte dirTypeBackward()>
				{
	//*  72  174:tableswitch     14 18: default 208
	//	               14 232
	//	               15 232
	//	               16 218
	//	               17 218
	//	               18 211
	//*  73  208:goto            163
				case 18: // '\022'
					i++;
	//   74  211:iload_1         
	//   75  212:iconst_1        
	//   76  213:iadd            
	//   77  214:istore_1        
					break;

	//*  78  215:goto            163
				case 16: // '\020'
				case 17: // '\021'
					if(k == i)
	//*  79  218:iload_3         
	//*  80  219:iload_1         
	//*  81  220:icmpne          225
						return 1;
	//   82  223:iconst_1        
	//   83  224:ireturn         
					i--;
	//   84  225:iload_1         
	//   85  226:iconst_1        
	//   86  227:isub            
	//   87  228:istore_1        
					break;

	//*  88  229:goto            163
				case 14: // '\016'
				case 15: // '\017'
					if(k == i)
	//*  89  232:iload_3         
	//*  90  233:iload_1         
	//*  91  234:icmpne          239
						return -1;
	//   92  237:iconst_m1       
	//   93  238:ireturn         
					i--;
	//   94  239:iload_1         
	//   95  240:iconst_1        
	//   96  241:isub            
	//   97  242:istore_1        
					break;
				}
				continue;
	//   98  243:goto            163
			}
			return 0;
	//   99  246:iconst_0        
	//  100  247:ireturn         
		} while(true);
_L8:
		if(true) goto _L4; else goto _L9
_L9:
	}

	int getExitDir()
	{
		charIndex = length;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field int length>
	//    3    5:putfield        #54  <Field int charIndex>
		int j = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		do
		{
			if(charIndex <= 0)
				break;
	//    8   12:aload_0         
	//    9   13:getfield        #54  <Field int charIndex>
	//   10   16:ifle            162
			byte byte0 = dirTypeBackward();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #98  <Method byte dirTypeBackward()>
	//   13   23:istore_3        
			if(byte0 == 9)
				continue;
	//   14   24:iload_3         
	//   15   25:bipush          9
	//   16   27:icmpeq          12
			switch(byte0)
	//*  17   30:iload_3         
			{
	//*  18   31:tableswitch     0 2: default 56
	//	               0 147
	//	               1 134
	//	               2 134
			default:
				switch(byte0)
	//*  19   56:iload_3         
				{
	//*  20   57:tableswitch     14 18: default 92
	//	               14 120
	//	               15 120
	//	               16 106
	//	               17 106
	//	               18 99
				default:
					if(j != 0)
	//*  21   92:iload_2         
	//*  22   93:ifne            12
						continue;
	//   23   96:goto            157
					break;

				case 18: // '\022'
					i++;
	//   24   99:iload_1         
	//   25  100:iconst_1        
	//   26  101:iadd            
	//   27  102:istore_1        
					continue;
	//   28  103:goto            12

				case 16: // '\020'
				case 17: // '\021'
					if(j == i)
	//*  29  106:iload_2         
	//*  30  107:iload_1         
	//*  31  108:icmpne          113
						return 1;
	//   32  111:iconst_1        
	//   33  112:ireturn         
					i--;
	//   34  113:iload_1         
	//   35  114:iconst_1        
	//   36  115:isub            
	//   37  116:istore_1        
					continue;
	//   38  117:goto            12

				case 14: // '\016'
				case 15: // '\017'
					if(j == i)
	//*  39  120:iload_2         
	//*  40  121:iload_1         
	//*  41  122:icmpne          127
						return -1;
	//   42  125:iconst_m1       
	//   43  126:ireturn         
					i--;
	//   44  127:iload_1         
	//   45  128:iconst_1        
	//   46  129:isub            
	//   47  130:istore_1        
					continue;
	//   48  131:goto            12
				}
				break;

			case 1: // '\001'
			case 2: // '\002'
				if(i == 0)
	//*  49  134:iload_1         
	//*  50  135:ifne            140
					return 1;
	//   51  138:iconst_1        
	//   52  139:ireturn         
				if(j == 0)
	//*  53  140:iload_2         
	//*  54  141:ifne            12
					break;
	//   55  144:goto            157
				continue;

			case 0: // '\0'
				if(i == 0)
	//*  56  147:iload_1         
	//*  57  148:ifne            153
					return -1;
	//   58  151:iconst_m1       
	//   59  152:ireturn         
				if(j != 0)
					continue;
	//   60  153:iload_2         
	//   61  154:ifne            12
				break;
			}
			j = i;
	//   62  157:iload_1         
	//   63  158:istore_2        
		} while(true);
	//   64  159:goto            12
		return 0;
	//   65  162:iconst_0        
	//   66  163:ireturn         
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
