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
	//    4    8:icmpge          47
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
	//   25   44:icmpne          0
		return 12;
	//   26   47:bipush          12
	//   27   49:ireturn         
	}

	private byte skipTagBackward()
	{
		int i = charIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int charIndex>
	//    2    4:istore_2        
		do
		{
			do
			{
				if(charIndex > 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #54  <Field int charIndex>
	//*   5    9:ifle            63
				{
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
					if(lastChar != '>')
						continue;
	//   28   54:aload_0         
	//   29   55:getfield        #60  <Field char lastChar>
	//   30   58:bipush          62
	//   31   60:icmpne          77
				}
				charIndex = i;
	//   32   63:aload_0         
	//   33   64:iload_2         
	//   34   65:putfield        #54  <Field int charIndex>
				lastChar = '>';
	//   35   68:aload_0         
	//   36   69:bipush          62
	//   37   71:putfield        #60  <Field char lastChar>
				return 13;
	//   38   74:bipush          13
	//   39   76:ireturn         
			} while(lastChar != '"' && lastChar != '\'');
	//   40   77:aload_0         
	//   41   78:getfield        #60  <Field char lastChar>
	//   42   81:bipush          34
	//   43   83:icmpeq          95
	//   44   86:aload_0         
	//   45   87:getfield        #60  <Field char lastChar>
	//   46   90:bipush          39
	//   47   92:icmpne          5
			char c1 = lastChar;
	//   48   95:aload_0         
	//   49   96:getfield        #60  <Field char lastChar>
	//   50   99:istore_3        
			char c;
			do
			{
				if(charIndex <= 0)
					break;
	//   51  100:aload_0         
	//   52  101:getfield        #54  <Field int charIndex>
	//   53  104:ifle            5
				CharSequence charsequence1 = text;
	//   54  107:aload_0         
	//   55  108:getfield        #37  <Field CharSequence text>
	//   56  111:astore          5
				int k = charIndex - 1;
	//   57  113:aload_0         
	//   58  114:getfield        #54  <Field int charIndex>
	//   59  117:iconst_1        
	//   60  118:isub            
	//   61  119:istore          4
				charIndex = k;
	//   62  121:aload_0         
	//   63  122:iload           4
	//   64  124:putfield        #54  <Field int charIndex>
				c = charsequence1.charAt(k);
	//   65  127:aload           5
	//   66  129:iload           4
	//   67  131:invokeinterface #58  <Method char CharSequence.charAt(int)>
	//   68  136:istore_1        
				lastChar = c;
	//   69  137:aload_0         
	//   70  138:iload_1         
	//   71  139:putfield        #60  <Field char lastChar>
			} while(c != c1);
	//   72  142:iload_1         
	//   73  143:iload_3         
	//   74  144:icmpeq          5
		} while(true);
	//   75  147:goto            100
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
		byte byte0;
		if(Character.isLowSurrogate(lastChar))
	//*   9   19:aload_0         
	//*  10   20:getfield        #60  <Field char lastChar>
	//*  11   23:invokestatic    #68  <Method boolean Character.isLowSurrogate(char)>
	//*  12   26:ifeq            61
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
			byte0 = Character.getDirectionality(i);
	//   26   54:iload_3         
	//   27   55:invokestatic    #30  <Method byte Character.getDirectionality(int)>
	//   28   58:istore_1        
		} else
	//*  29   59:iload_1         
	//*  30   60:ireturn         
		{
			charIndex = charIndex - 1;
	//   31   61:aload_0         
	//   32   62:aload_0         
	//   33   63:getfield        #54  <Field int charIndex>
	//   34   66:iconst_1        
	//   35   67:isub            
	//   36   68:putfield        #54  <Field int charIndex>
			byte byte1 = getCachedDirectionality(lastChar);
	//   37   71:aload_0         
	//   38   72:getfield        #60  <Field char lastChar>
	//   39   75:invokestatic    #78  <Method byte getCachedDirectionality(char)>
	//   40   78:istore_2        
			byte0 = byte1;
	//   41   79:iload_2         
	//   42   80:istore_1        
			if(isHtml)
	//*  43   81:aload_0         
	//*  44   82:getfield        #39  <Field boolean isHtml>
	//*  45   85:ifeq            59
			{
				if(lastChar == '>')
	//*  46   88:aload_0         
	//*  47   89:getfield        #60  <Field char lastChar>
	//*  48   92:bipush          62
	//*  49   94:icmpne          102
					return skipTagBackward();
	//   50   97:aload_0         
	//   51   98:invokespecial   #80  <Method byte skipTagBackward()>
	//   52  101:ireturn         
				byte0 = byte1;
	//   53  102:iload_2         
	//   54  103:istore_1        
				if(lastChar == ';')
	//*  55  104:aload_0         
	//*  56  105:getfield        #60  <Field char lastChar>
	//*  57  108:bipush          59
	//*  58  110:icmpne          59
					return skipEntityBackward();
	//   59  113:aload_0         
	//   60  114:invokespecial   #82  <Method byte skipEntityBackward()>
	//   61  117:ireturn         
			}
		}
		return byte0;
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
		byte byte0;
		if(Character.isHighSurrogate(lastChar))
	//*   7   17:aload_0         
	//*   8   18:getfield        #60  <Field char lastChar>
	//*   9   21:invokestatic    #86  <Method boolean Character.isHighSurrogate(char)>
	//*  10   24:ifeq            59
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
			byte0 = Character.getDirectionality(i);
	//   24   52:iload_3         
	//   25   53:invokestatic    #30  <Method byte Character.getDirectionality(int)>
	//   26   56:istore_1        
		} else
	//*  27   57:iload_1         
	//*  28   58:ireturn         
		{
			charIndex = charIndex + 1;
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #54  <Field int charIndex>
	//   32   64:iconst_1        
	//   33   65:iadd            
	//   34   66:putfield        #54  <Field int charIndex>
			byte byte1 = getCachedDirectionality(lastChar);
	//   35   69:aload_0         
	//   36   70:getfield        #60  <Field char lastChar>
	//   37   73:invokestatic    #78  <Method byte getCachedDirectionality(char)>
	//   38   76:istore_2        
			byte0 = byte1;
	//   39   77:iload_2         
	//   40   78:istore_1        
			if(isHtml)
	//*  41   79:aload_0         
	//*  42   80:getfield        #39  <Field boolean isHtml>
	//*  43   83:ifeq            57
			{
				if(lastChar == '<')
	//*  44   86:aload_0         
	//*  45   87:getfield        #60  <Field char lastChar>
	//*  46   90:bipush          60
	//*  47   92:icmpne          100
					return skipTagForward();
	//   48   95:aload_0         
	//   49   96:invokespecial   #91  <Method byte skipTagForward()>
	//   50   99:ireturn         
				byte0 = byte1;
	//   51  100:iload_2         
	//   52  101:istore_1        
				if(lastChar == '&')
	//*  53  102:aload_0         
	//*  54  103:getfield        #60  <Field char lastChar>
	//*  55  106:bipush          38
	//*  56  108:icmpne          57
					return skipEntityForward();
	//   57  111:aload_0         
	//   58  112:invokespecial   #93  <Method byte skipEntityForward()>
	//   59  115:ireturn         
			}
		}
		return byte0;
	}

	int getEntryDir()
	{
		int i;
		int j;
		byte byte0;
		charIndex = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #54  <Field int charIndex>
		j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		byte0 = 0;
	//    5    7:iconst_0        
	//    6    8:istore_3        
		i = 0;
	//    7    9:iconst_0        
	//    8   10:istore_1        
_L6:
		if(charIndex >= length || j != 0) goto _L2; else goto _L1
	//    9   11:aload_0         
	//   10   12:getfield        #54  <Field int charIndex>
	//   11   15:aload_0         
	//   12   16:getfield        #46  <Field int length>
	//   13   19:icmpge          174
	//   14   22:iload_2         
	//   15   23:ifne            174
_L1:
		dirTypeForward();
	//   16   26:aload_0         
	//   17   27:invokevirtual   #96  <Method byte dirTypeForward()>
		JVM INSTR tableswitch 0 18: default 120
	//	               0 152
	//	               1 163
	//	               2 163
	//	               3 120
	//	               4 120
	//	               5 120
	//	               6 120
	//	               7 120
	//	               8 120
	//	               9 11
	//	               10 120
	//	               11 120
	//	               12 120
	//	               13 120
	//	               14 125
	//	               15 125
	//	               16 134
	//	               17 134
	//	               18 143;
	//   18   30:tableswitch     0 18: default 120
	//	               0 152
	//	               1 163
	//	               2 163
	//	               3 120
	//	               4 120
	//	               5 120
	//	               6 120
	//	               7 120
	//	               8 120
	//	               9 11
	//	               10 120
	//	               11 120
	//	               12 120
	//	               13 120
	//	               14 125
	//	               15 125
	//	               16 134
	//	               17 134
	//	               18 143
		   goto _L3 _L4 _L5 _L5 _L3 _L3 _L3 _L3 _L3 _L3 _L6 _L3 _L3 _L3 _L3 _L7 _L7 _L8 _L8 _L9
_L3:
		j = i;
	//   19  120:iload_1         
	//   20  121:istore_2        
		  goto _L6
	//*  21  122:goto            11
_L7:
		i++;
	//   22  125:iload_1         
	//   23  126:iconst_1        
	//   24  127:iadd            
	//   25  128:istore_1        
		byte0 = -1;
	//   26  129:iconst_m1       
	//   27  130:istore_3        
		  goto _L6
	//*  28  131:goto            11
_L8:
		i++;
	//   29  134:iload_1         
	//   30  135:iconst_1        
	//   31  136:iadd            
	//   32  137:istore_1        
		byte0 = 1;
	//   33  138:iconst_1        
	//   34  139:istore_3        
		  goto _L6
	//*  35  140:goto            11
_L9:
		i--;
	//   36  143:iload_1         
	//   37  144:iconst_1        
	//   38  145:isub            
	//   39  146:istore_1        
		byte0 = 0;
	//   40  147:iconst_0        
	//   41  148:istore_3        
		  goto _L6
	//*  42  149:goto            11
_L4:
		if(i != 0) goto _L11; else goto _L10
	//   43  152:iload_1         
	//   44  153:ifne            158
_L10:
		return -1;
	//   45  156:iconst_m1       
	//   46  157:ireturn         
_L11:
		j = i;
	//   47  158:iload_1         
	//   48  159:istore_2        
		  goto _L6
	//*  49  160:goto            11
_L5:
		if(i == 0)
	//*  50  163:iload_1         
	//*  51  164:ifne            169
			return 1;
	//   52  167:iconst_1        
	//   53  168:ireturn         
		j = i;
	//   54  169:iload_1         
	//   55  170:istore_2        
		  goto _L6
	//*  56  171:goto            11
_L2:
		if(j == 0)
	//*  57  174:iload_2         
	//*  58  175:ifne            180
			return 0;
	//   59  178:iconst_0        
	//   60  179:ireturn         
		if(byte0 != 0)
	//*  61  180:iload_3         
	//*  62  181:ifeq            186
			return ((int) (byte0));
	//   63  184:iload_3         
	//   64  185:ireturn         
_L14:
		if(charIndex <= 0) goto _L13; else goto _L12
	//   65  186:aload_0         
	//   66  187:getfield        #54  <Field int charIndex>
	//   67  190:ifle            268
_L12:
		dirTypeBackward();
	//   68  193:aload_0         
	//   69  194:invokevirtual   #98  <Method byte dirTypeBackward()>
		JVM INSTR tableswitch 14 18: default 232
	//	               14 235
	//	               15 235
	//	               16 247
	//	               17 247
	//	               18 261;
	//   70  197:tableswitch     14 18: default 232
	//	               14 235
	//	               15 235
	//	               16 247
	//	               17 247
	//	               18 261
		   goto _L14 _L15 _L15 _L16 _L16 _L17
	//*  71  232:goto            186
_L15:
		if(j == i) goto _L10; else goto _L18
	//   72  235:iload_2         
	//   73  236:iload_1         
	//   74  237:icmpeq          156
_L18:
		i--;
	//   75  240:iload_1         
	//   76  241:iconst_1        
	//   77  242:isub            
	//   78  243:istore_1        
		  goto _L14
	//*  79  244:goto            186
_L16:
		if(j == i)
	//*  80  247:iload_2         
	//*  81  248:iload_1         
	//*  82  249:icmpne          254
			return 1;
	//   83  252:iconst_1        
	//   84  253:ireturn         
		i--;
	//   85  254:iload_1         
	//   86  255:iconst_1        
	//   87  256:isub            
	//   88  257:istore_1        
		  goto _L14
	//*  89  258:goto            186
_L17:
		i++;
	//   90  261:iload_1         
	//   91  262:iconst_1        
	//   92  263:iadd            
	//   93  264:istore_1        
		  goto _L14
	//*  94  265:goto            186
_L13:
		return 0;
	//   95  268:iconst_0        
	//   96  269:ireturn         
	}

	int getExitDir()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		charIndex = length;
	//    2    3:aload_0         
	//    3    4:aload_0         
	//    4    5:getfield        #46  <Field int length>
	//    5    8:putfield        #54  <Field int charIndex>
		int j = 0;
	//    6   11:iconst_0        
	//    7   12:istore_2        
		int i = 0;
	//    8   13:iconst_0        
	//    9   14:istore_1        
		do
		{
label0:
			{
label1:
				{
label2:
					{
label3:
						{
label4:
							{
								byte byte0 = ((byte) (flag));
	//   10   15:iload           4
	//   11   17:istore_3        
								if(charIndex > 0)
	//*  12   18:aload_0         
	//*  13   19:getfield        #54  <Field int charIndex>
	//*  14   22:ifle            135
								{
									switch(dirTypeBackward())
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #98  <Method byte dirTypeBackward()>
									{
	//*  17   29:tableswitch     0 18: default 120
	//	               0 129
	//	               1 160
	//	               2 160
	//	               3 120
	//	               4 120
	//	               5 120
	//	               6 120
	//	               7 120
	//	               8 120
	//	               9 15
	//	               10 120
	//	               11 120
	//	               12 120
	//	               13 120
	//	               14 146
	//	               15 146
	//	               16 175
	//	               17 175
	//	               18 189
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
	//*  18  120:iload_2         
	//*  19  121:ifne            15
											j = i;
	//   20  124:iload_1         
	//   21  125:istore_2        
										continue;
	//   22  126:goto            15

									case 1: // '\001'
									case 2: // '\002'
										break label2;

									case 9: // '\t'
										continue;

									case 14: // '\016'
									case 15: // '\017'
										break label3;

									case 16: // '\020'
									case 17: // '\021'
										break label1;

									case 18: // '\022'
										break label0;

									case 0: // '\0'
										break;
									}
									if(i != 0)
										break label4;
	//   23  129:iload_1         
	//   24  130:ifne            137
									byte0 = -1;
	//   25  133:iconst_m1       
	//   26  134:istore_3        
								}
								return ((int) (byte0));
	//   27  135:iload_3         
	//   28  136:ireturn         
							}
							if(j == 0)
	//*  29  137:iload_2         
	//*  30  138:ifne            15
								j = i;
	//   31  141:iload_1         
	//   32  142:istore_2        
							continue;
	//   33  143:goto            15
						}
						if(j == i)
	//*  34  146:iload_2         
	//*  35  147:iload_1         
	//*  36  148:icmpne          153
							return -1;
	//   37  151:iconst_m1       
	//   38  152:ireturn         
						i--;
	//   39  153:iload_1         
	//   40  154:iconst_1        
	//   41  155:isub            
	//   42  156:istore_1        
						continue;
	//   43  157:goto            15
					}
					if(i == 0)
	//*  44  160:iload_1         
	//*  45  161:ifne            166
						return 1;
	//   46  164:iconst_1        
	//   47  165:ireturn         
					if(j == 0)
	//*  48  166:iload_2         
	//*  49  167:ifne            15
						j = i;
	//   50  170:iload_1         
	//   51  171:istore_2        
					continue;
	//   52  172:goto            15
				}
				if(j == i)
	//*  53  175:iload_2         
	//*  54  176:iload_1         
	//*  55  177:icmpne          182
					return 1;
	//   56  180:iconst_1        
	//   57  181:ireturn         
				i--;
	//   58  182:iload_1         
	//   59  183:iconst_1        
	//   60  184:isub            
	//   61  185:istore_1        
				continue;
	//   62  186:goto            15
			}
			i++;
	//   63  189:iload_1         
	//   64  190:iconst_1        
	//   65  191:iadd            
	//   66  192:istore_1        
		} while(true);
	//   67  193:goto            15
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
