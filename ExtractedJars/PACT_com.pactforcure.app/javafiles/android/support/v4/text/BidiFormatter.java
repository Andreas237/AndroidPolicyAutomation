// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//			TextDirectionHeuristicsCompat, TextUtilsCompat, TextDirectionHeuristicCompat

public final class BidiFormatter
{
	public static final class Builder
	{

		private static BidiFormatter getDefaultInstanceFromContext(boolean flag)
		{
			if(flag)
		//*   0    0:iload_0         
		//*   1    1:ifeq            8
				return BidiFormatter.DEFAULT_RTL_INSTANCE;
		//    2    4:invokestatic    #39  <Method BidiFormatter BidiFormatter.access$200()>
		//    3    7:areturn         
			else
				return BidiFormatter.DEFAULT_LTR_INSTANCE;
		//    4    8:invokestatic    #42  <Method BidiFormatter BidiFormatter.access$300()>
		//    5   11:areturn         
		}

		private void initialize(boolean flag)
		{
			mIsRtlContext = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #44  <Field boolean mIsRtlContext>
			mTextDirectionHeuristicCompat = BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC;
		//    3    5:aload_0         
		//    4    6:invokestatic    #48  <Method TextDirectionHeuristicCompat BidiFormatter.access$100()>
		//    5    9:putfield        #50  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
			mFlags = 2;
		//    6   12:aload_0         
		//    7   13:iconst_2        
		//    8   14:putfield        #52  <Field int mFlags>
		//    9   17:return          
		}

		public BidiFormatter build()
		{
			if(mFlags == 2 && mTextDirectionHeuristicCompat == BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC)
		//*   0    0:aload_0         
		//*   1    1:getfield        #52  <Field int mFlags>
		//*   2    4:iconst_2        
		//*   3    5:icmpne          26
		//*   4    8:aload_0         
		//*   5    9:getfield        #50  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
		//*   6   12:invokestatic    #48  <Method TextDirectionHeuristicCompat BidiFormatter.access$100()>
		//*   7   15:if_acmpne       26
				return getDefaultInstanceFromContext(mIsRtlContext);
		//    8   18:aload_0         
		//    9   19:getfield        #44  <Field boolean mIsRtlContext>
		//   10   22:invokestatic    #55  <Method BidiFormatter getDefaultInstanceFromContext(boolean)>
		//   11   25:areturn         
			else
				return new BidiFormatter(mIsRtlContext, mFlags, mTextDirectionHeuristicCompat);
		//   12   26:new             #6   <Class BidiFormatter>
		//   13   29:dup             
		//   14   30:aload_0         
		//   15   31:getfield        #44  <Field boolean mIsRtlContext>
		//   16   34:aload_0         
		//   17   35:getfield        #52  <Field int mFlags>
		//   18   38:aload_0         
		//   19   39:getfield        #50  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
		//   20   42:aconst_null     
		//   21   43:invokespecial   #58  <Method void BidiFormatter(boolean, int, TextDirectionHeuristicCompat, BidiFormatter$1)>
		//   22   46:areturn         
		}

		public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat textdirectionheuristiccompat)
		{
			mTextDirectionHeuristicCompat = textdirectionheuristiccompat;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #50  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder stereoReset(boolean flag)
		{
			if(flag)
		//*   0    0:iload_1         
		//*   1    1:ifeq            16
			{
				mFlags = mFlags | 2;
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:getfield        #52  <Field int mFlags>
		//    5    9:iconst_2        
		//    6   10:ior             
		//    7   11:putfield        #52  <Field int mFlags>
				return this;
		//    8   14:aload_0         
		//    9   15:areturn         
			} else
			{
				mFlags = mFlags & -3;
		//   10   16:aload_0         
		//   11   17:aload_0         
		//   12   18:getfield        #52  <Field int mFlags>
		//   13   21:bipush          -3
		//   14   23:iand            
		//   15   24:putfield        #52  <Field int mFlags>
				return this;
		//   16   27:aload_0         
		//   17   28:areturn         
			}
		}

		private int mFlags;
		private boolean mIsRtlContext;
		private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			initialize(BidiFormatter.isRtlLocale(Locale.getDefault()));
		//    2    4:aload_0         
		//    3    5:invokestatic    #23  <Method Locale Locale.getDefault()>
		//    4    8:invokestatic    #27  <Method boolean BidiFormatter.access$000(Locale)>
		//    5   11:invokespecial   #31  <Method void initialize(boolean)>
		//    6   14:return          
		}

		public Builder(Locale locale)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			initialize(BidiFormatter.isRtlLocale(locale));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #27  <Method boolean BidiFormatter.access$000(Locale)>
		//    5    9:invokespecial   #31  <Method void initialize(boolean)>
		//    6   12:return          
		}

		public Builder(boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			initialize(flag);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokespecial   #31  <Method void initialize(boolean)>
		//    5    9:return          
		}
	}

	private static class DirectionalityEstimator
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
			byte byte0;
			int j;
			charIndex = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #54  <Field int charIndex>
			i = 0;
		//    3    5:iconst_0        
		//    4    6:istore_1        
			byte0 = 0;
		//    5    7:iconst_0        
		//    6    8:istore_2        
			j = 0;
		//    7    9:iconst_0        
		//    8   10:istore_3        
_L6:
			if(charIndex >= length || j != 0) goto _L2; else goto _L1
		//    9   11:aload_0         
		//   10   12:getfield        #54  <Field int charIndex>
		//   11   15:aload_0         
		//   12   16:getfield        #46  <Field int length>
		//   13   19:icmpge          178
		//   14   22:iload_3         
		//   15   23:ifne            178
_L1:
			dirTypeForward();
		//   16   26:aload_0         
		//   17   27:invokevirtual   #96  <Method byte dirTypeForward()>
			JVM INSTR tableswitch 0 18: default 120
		//		               0 152
		//		               1 167
		//		               2 167
		//		               3 120
		//		               4 120
		//		               5 120
		//		               6 120
		//		               7 120
		//		               8 120
		//		               9 11
		//		               10 120
		//		               11 120
		//		               12 120
		//		               13 120
		//		               14 125
		//		               15 125
		//		               16 134
		//		               17 134
		//		               18 143;
		//   18   30:tableswitch     0 18: default 120
		//		               0 152
		//		               1 167
		//		               2 167
		//		               3 120
		//		               4 120
		//		               5 120
		//		               6 120
		//		               7 120
		//		               8 120
		//		               9 11
		//		               10 120
		//		               11 120
		//		               12 120
		//		               13 120
		//		               14 125
		//		               15 125
		//		               16 134
		//		               17 134
		//		               18 143
			   goto _L3 _L4 _L5 _L5 _L3 _L3 _L3 _L3 _L3 _L3 _L6 _L3 _L3 _L3 _L3 _L7 _L7 _L8 _L8 _L9
_L3:
			j = i;
		//   19  120:iload_1         
		//   20  121:istore_3        
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
		//   27  130:istore_2        
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
		//   34  139:istore_2        
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
		//   41  148:istore_2        
			  goto _L6
		//*  42  149:goto            11
_L4:
			if(i != 0) goto _L11; else goto _L10
		//   43  152:iload_1         
		//   44  153:ifne            162
_L10:
			byte byte1 = -1;
		//   45  156:iconst_m1       
		//   46  157:istore          4
_L12:
			return ((int) (byte1));
		//   47  159:iload           4
		//   48  161:ireturn         
_L11:
			j = i;
		//   49  162:iload_1         
		//   50  163:istore_3        
			  goto _L6
		//*  51  164:goto            11
_L5:
			if(i == 0)
		//*  52  167:iload_1         
		//*  53  168:ifne            173
				return 1;
		//   54  171:iconst_1        
		//   55  172:ireturn         
			j = i;
		//   56  173:iload_1         
		//   57  174:istore_3        
			  goto _L6
		//*  58  175:goto            11
_L2:
			if(j == 0)
		//*  59  178:iload_3         
		//*  60  179:ifne            184
				return 0;
		//   61  182:iconst_0        
		//   62  183:ireturn         
			byte1 = byte0;
		//   63  184:iload_2         
		//   64  185:istore          4
			if(byte0 == 0)
		//*  65  187:iload_2         
		//*  66  188:ifne            159
			{
				do
					if(charIndex > 0)
		//*  67  191:aload_0         
		//*  68  192:getfield        #54  <Field int charIndex>
		//*  69  195:ifle            274
						switch(dirTypeBackward())
		//*  70  198:aload_0         
		//*  71  199:invokevirtual   #98  <Method byte dirTypeBackward()>
						{
		//*  72  202:tableswitch     14 18: default 236
		//		               14 239
		//		               15 239
		//		               16 253
		//		               17 253
		//		               18 267
		//*  73  236:goto            191
						case 14: // '\016'
						case 15: // '\017'
							if(j == i)
		//*  74  239:iload_3         
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

		//*  83  250:goto            191
						case 16: // '\020'
						case 17: // '\021'
							if(j == i)
		//*  84  253:iload_3         
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

		//*  93  264:goto            191
						case 18: // '\022'
							i++;
		//   94  267:iload_1         
		//   95  268:iconst_1        
		//   96  269:iadd            
		//   97  270:istore_1        
							break;
						}
					else
		//*  98  271:goto            191
						return 0;
		//   99  274:iconst_0        
		//  100  275:ireturn         
				while(true);
			}
			  goto _L12
		}

		int getExitDir()
		{
			int i;
			int j;
			charIndex = length;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #46  <Field int length>
		//    3    5:putfield        #54  <Field int charIndex>
			i = 0;
		//    4    8:iconst_0        
		//    5    9:istore_1        
			j = 0;
		//    6   10:iconst_0        
		//    7   11:istore_2        
_L12:
			if(charIndex <= 0)
				break; /* Loop/switch isn't completed */
		//    8   12:aload_0         
		//    9   13:getfield        #54  <Field int charIndex>
		//   10   16:ifle            184
			dirTypeBackward();
		//   11   19:aload_0         
		//   12   20:invokevirtual   #98  <Method byte dirTypeBackward()>
			JVM INSTR tableswitch 0 18: default 112
		//		               0 121
		//		               1 148
		//		               2 148
		//		               3 112
		//		               4 112
		//		               5 112
		//		               6 112
		//		               7 112
		//		               8 112
		//		               9 12
		//		               10 112
		//		               11 112
		//		               12 112
		//		               13 112
		//		               14 136
		//		               15 136
		//		               16 163
		//		               17 163
		//		               18 177;
		//   13   23:tableswitch     0 18: default 112
		//		               0 121
		//		               1 148
		//		               2 148
		//		               3 112
		//		               4 112
		//		               5 112
		//		               6 112
		//		               7 112
		//		               8 112
		//		               9 12
		//		               10 112
		//		               11 112
		//		               12 112
		//		               13 112
		//		               14 136
		//		               15 136
		//		               16 163
		//		               17 163
		//		               18 177
			   goto _L1 _L2 _L3 _L3 _L1 _L1 _L1 _L1 _L1 _L1 _L4 _L1 _L1 _L1 _L1 _L5 _L5 _L6 _L6 _L7
_L4:
			continue; /* Loop/switch isn't completed */
_L1:
			if(j == 0)
		//*  14  112:iload_2         
		//*  15  113:ifne            12
				j = i;
		//   16  116:iload_1         
		//   17  117:istore_2        
			continue; /* Loop/switch isn't completed */
		//   18  118:goto            12
_L2:
			if(i != 0) goto _L9; else goto _L8
		//   19  121:iload_1         
		//   20  122:ifne            127
_L8:
			return -1;
		//   21  125:iconst_m1       
		//   22  126:ireturn         
_L9:
			if(j == 0)
		//*  23  127:iload_2         
		//*  24  128:ifne            12
				j = i;
		//   25  131:iload_1         
		//   26  132:istore_2        
			continue; /* Loop/switch isn't completed */
		//   27  133:goto            12
_L5:
			if(j == i) goto _L8; else goto _L10
		//   28  136:iload_2         
		//   29  137:iload_1         
		//   30  138:icmpeq          125
_L10:
			i--;
		//   31  141:iload_1         
		//   32  142:iconst_1        
		//   33  143:isub            
		//   34  144:istore_1        
			continue; /* Loop/switch isn't completed */
		//   35  145:goto            12
_L3:
			if(i == 0)
		//*  36  148:iload_1         
		//*  37  149:ifne            154
				return 1;
		//   38  152:iconst_1        
		//   39  153:ireturn         
			if(j == 0)
		//*  40  154:iload_2         
		//*  41  155:ifne            12
				j = i;
		//   42  158:iload_1         
		//   43  159:istore_2        
			continue; /* Loop/switch isn't completed */
		//   44  160:goto            12
_L6:
			if(j == i)
		//*  45  163:iload_2         
		//*  46  164:iload_1         
		//*  47  165:icmpne          170
				return 1;
		//   48  168:iconst_1        
		//   49  169:ireturn         
			i--;
		//   50  170:iload_1         
		//   51  171:iconst_1        
		//   52  172:isub            
		//   53  173:istore_1        
			continue; /* Loop/switch isn't completed */
		//   54  174:goto            12
_L7:
			i++;
		//   55  177:iload_1         
		//   56  178:iconst_1        
		//   57  179:iadd            
		//   58  180:istore_1        
			if(true) goto _L12; else goto _L11
		//   59  181:goto            12
_L11:
			return 0;
		//   60  184:iconst_0        
		//   61  185:ireturn         
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

		DirectionalityEstimator(CharSequence charsequence, boolean flag)
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


	private BidiFormatter(boolean flag, int i, TextDirectionHeuristicCompat textdirectionheuristiccompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void Object()>
		mIsRtlContext = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #80  <Field boolean mIsRtlContext>
		mFlags = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #82  <Field int mFlags>
		mDefaultTextDirectionHeuristicCompat = textdirectionheuristiccompat;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #84  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
	//   11   19:return          
	}


	private static int getEntryDir(CharSequence charsequence)
	{
		return (new DirectionalityEstimator(charsequence, false)).getEntryDir();
	//    0    0:new             #11  <Class BidiFormatter$DirectionalityEstimator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #100 <Method void BidiFormatter$DirectionalityEstimator(CharSequence, boolean)>
	//    5    9:invokevirtual   #103 <Method int BidiFormatter$DirectionalityEstimator.getEntryDir()>
	//    6   12:ireturn         
	}

	private static int getExitDir(CharSequence charsequence)
	{
		return (new DirectionalityEstimator(charsequence, false)).getExitDir();
	//    0    0:new             #11  <Class BidiFormatter$DirectionalityEstimator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #100 <Method void BidiFormatter$DirectionalityEstimator(CharSequence, boolean)>
	//    5    9:invokevirtual   #106 <Method int BidiFormatter$DirectionalityEstimator.getExitDir()>
	//    6   12:ireturn         
	}

	public static BidiFormatter getInstance()
	{
		return (new Builder()).build();
	//    0    0:new             #8   <Class BidiFormatter$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #108 <Method void BidiFormatter$Builder()>
	//    3    7:invokevirtual   #111 <Method BidiFormatter BidiFormatter$Builder.build()>
	//    4   10:areturn         
	}

	public static BidiFormatter getInstance(Locale locale)
	{
		return (new Builder(locale)).build();
	//    0    0:new             #8   <Class BidiFormatter$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #115 <Method void BidiFormatter$Builder(Locale)>
	//    4    8:invokevirtual   #111 <Method BidiFormatter BidiFormatter$Builder.build()>
	//    5   11:areturn         
	}

	public static BidiFormatter getInstance(boolean flag)
	{
		return (new Builder(flag)).build();
	//    0    0:new             #8   <Class BidiFormatter$Builder>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #119 <Method void BidiFormatter$Builder(boolean)>
	//    4    8:invokevirtual   #111 <Method BidiFormatter BidiFormatter$Builder.build()>
	//    5   11:areturn         
	}

	private static boolean isRtlLocale(Locale locale)
	{
		return TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1;
	//    0    0:aload_0         
	//    1    1:invokestatic    #125 <Method int TextUtilsCompat.getLayoutDirectionFromLocale(Locale)>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private String markAfter(CharSequence charsequence, TextDirectionHeuristicCompat textdirectionheuristiccompat)
	{
		boolean flag = textdirectionheuristiccompat.isRtl(charsequence, 0, charsequence.length());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:invokeinterface #132 <Method int CharSequence.length()>
	//    5    9:invokeinterface #138 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
	//    6   14:istore_3        
		if(!mIsRtlContext && (flag || getExitDir(charsequence) == 1))
	//*   7   15:aload_0         
	//*   8   16:getfield        #80  <Field boolean mIsRtlContext>
	//*   9   19:ifne            38
	//*  10   22:iload_3         
	//*  11   23:ifne            34
	//*  12   26:aload_1         
	//*  13   27:invokestatic    #140 <Method int getExitDir(CharSequence)>
	//*  14   30:iconst_1        
	//*  15   31:icmpne          38
			return LRM_STRING;
	//   16   34:getstatic       #65  <Field String LRM_STRING>
	//   17   37:areturn         
		if(mIsRtlContext && (!flag || getExitDir(charsequence) == -1))
	//*  18   38:aload_0         
	//*  19   39:getfield        #80  <Field boolean mIsRtlContext>
	//*  20   42:ifeq            61
	//*  21   45:iload_3         
	//*  22   46:ifeq            57
	//*  23   49:aload_1         
	//*  24   50:invokestatic    #140 <Method int getExitDir(CharSequence)>
	//*  25   53:iconst_m1       
	//*  26   54:icmpne          61
			return RLM_STRING;
	//   27   57:getstatic       #67  <Field String RLM_STRING>
	//   28   60:areturn         
		else
			return "";
	//   29   61:ldc1            #30  <String "">
	//   30   63:areturn         
	}

	private String markBefore(CharSequence charsequence, TextDirectionHeuristicCompat textdirectionheuristiccompat)
	{
		boolean flag = textdirectionheuristiccompat.isRtl(charsequence, 0, charsequence.length());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:invokeinterface #132 <Method int CharSequence.length()>
	//    5    9:invokeinterface #138 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
	//    6   14:istore_3        
		if(!mIsRtlContext && (flag || getEntryDir(charsequence) == 1))
	//*   7   15:aload_0         
	//*   8   16:getfield        #80  <Field boolean mIsRtlContext>
	//*   9   19:ifne            38
	//*  10   22:iload_3         
	//*  11   23:ifne            34
	//*  12   26:aload_1         
	//*  13   27:invokestatic    #143 <Method int getEntryDir(CharSequence)>
	//*  14   30:iconst_1        
	//*  15   31:icmpne          38
			return LRM_STRING;
	//   16   34:getstatic       #65  <Field String LRM_STRING>
	//   17   37:areturn         
		if(mIsRtlContext && (!flag || getEntryDir(charsequence) == -1))
	//*  18   38:aload_0         
	//*  19   39:getfield        #80  <Field boolean mIsRtlContext>
	//*  20   42:ifeq            61
	//*  21   45:iload_3         
	//*  22   46:ifeq            57
	//*  23   49:aload_1         
	//*  24   50:invokestatic    #143 <Method int getEntryDir(CharSequence)>
	//*  25   53:iconst_m1       
	//*  26   54:icmpne          61
			return RLM_STRING;
	//   27   57:getstatic       #67  <Field String RLM_STRING>
	//   28   60:areturn         
		else
			return "";
	//   29   61:ldc1            #30  <String "">
	//   30   63:areturn         
	}

	public boolean getStereoReset()
	{
		return (mFlags & 2) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int mFlags>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean isRtl(CharSequence charsequence)
	{
		return mDefaultTextDirectionHeuristicCompat.isRtl(charsequence, 0, charsequence.length());
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:aload_1         
	//    5    7:invokeinterface #132 <Method int CharSequence.length()>
	//    6   12:invokeinterface #138 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
	//    7   17:ireturn         
	}

	public boolean isRtl(String s)
	{
		return isRtl(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #149 <Method boolean isRtl(CharSequence)>
	//    3    5:ireturn         
	}

	public boolean isRtlContext()
	{
		return mIsRtlContext;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field boolean mIsRtlContext>
	//    2    4:ireturn         
	}

	public CharSequence unicodeWrap(CharSequence charsequence)
	{
		return unicodeWrap(charsequence, mDefaultTextDirectionHeuristicCompat, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #84  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #155 <Method CharSequence unicodeWrap(CharSequence, TextDirectionHeuristicCompat, boolean)>
	//    6   10:areturn         
	}

	public CharSequence unicodeWrap(CharSequence charsequence, TextDirectionHeuristicCompat textdirectionheuristiccompat)
	{
		return unicodeWrap(charsequence, textdirectionheuristiccompat, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #155 <Method CharSequence unicodeWrap(CharSequence, TextDirectionHeuristicCompat, boolean)>
	//    5    7:areturn         
	}

	public CharSequence unicodeWrap(CharSequence charsequence, TextDirectionHeuristicCompat textdirectionheuristiccompat, boolean flag)
	{
		if(charsequence == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
		{
			textdirectionheuristiccompat = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		} else
	//*   4    6:aload_2         
	//*   5    7:areturn         
		{
			boolean flag1 = textdirectionheuristiccompat.isRtl(charsequence, 0, charsequence.length());
	//    6    8:aload_2         
	//    7    9:aload_1         
	//    8   10:iconst_0        
	//    9   11:aload_1         
	//   10   12:invokeinterface #132 <Method int CharSequence.length()>
	//   11   17:invokeinterface #138 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
	//   12   22:istore          5
			SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
	//   13   24:new             #158 <Class SpannableStringBuilder>
	//   14   27:dup             
	//   15   28:invokespecial   #159 <Method void SpannableStringBuilder()>
	//   16   31:astore          6
			if(getStereoReset() && flag)
	//*  17   33:aload_0         
	//*  18   34:invokevirtual   #161 <Method boolean getStereoReset()>
	//*  19   37:ifeq            65
	//*  20   40:iload_3         
	//*  21   41:ifeq            65
			{
				if(flag1)
	//*  22   44:iload           5
	//*  23   46:ifeq            139
					textdirectionheuristiccompat = TextDirectionHeuristicsCompat.RTL;
	//   24   49:getstatic       #164 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.RTL>
	//   25   52:astore_2        
				else
	//*  26   53:aload           6
	//*  27   55:aload_0         
	//*  28   56:aload_1         
	//*  29   57:aload_2         
	//*  30   58:invokespecial   #166 <Method String markBefore(CharSequence, TextDirectionHeuristicCompat)>
	//*  31   61:invokevirtual   #170 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//*  32   64:pop             
	//*  33   65:iload           5
	//*  34   67:aload_0         
	//*  35   68:getfield        #80  <Field boolean mIsRtlContext>
	//*  36   71:icmpeq          154
	//*  37   74:iload           5
	//*  38   76:ifeq            146
	//*  39   79:sipush          8235
	//*  40   82:istore          4
	//*  41   84:aload           6
	//*  42   86:iload           4
	//*  43   88:invokevirtual   #173 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//*  44   91:pop             
	//*  45   92:aload           6
	//*  46   94:aload_1         
	//*  47   95:invokevirtual   #170 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//*  48   98:pop             
	//*  49   99:aload           6
	//*  50  101:sipush          8236
	//*  51  104:invokevirtual   #173 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//*  52  107:pop             
	//*  53  108:aload           6
	//*  54  110:astore_2        
	//*  55  111:iload_3         
	//*  56  112:ifeq            6
	//*  57  115:iload           5
	//*  58  117:ifeq            164
	//*  59  120:getstatic       #164 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.RTL>
	//*  60  123:astore_2        
	//*  61  124:aload           6
	//*  62  126:aload_0         
	//*  63  127:aload_1         
	//*  64  128:aload_2         
	//*  65  129:invokespecial   #175 <Method String markAfter(CharSequence, TextDirectionHeuristicCompat)>
	//*  66  132:invokevirtual   #170 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//*  67  135:pop             
	//*  68  136:aload           6
	//*  69  138:areturn         
					textdirectionheuristiccompat = TextDirectionHeuristicsCompat.LTR;
	//   70  139:getstatic       #178 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.LTR>
	//   71  142:astore_2        
				spannablestringbuilder.append(((CharSequence) (markBefore(charsequence, textdirectionheuristiccompat))));
			}
			if(flag1 != mIsRtlContext)
			{
				char c;
				if(flag1)
					c = '\u202B';
				else
	//*  72  143:goto            53
					c = '\u202A';
	//   73  146:sipush          8234
	//   74  149:istore          4
				spannablestringbuilder.append(c);
				spannablestringbuilder.append(charsequence);
				spannablestringbuilder.append('\u202C');
			} else
	//*  75  151:goto            84
			{
				spannablestringbuilder.append(charsequence);
	//   76  154:aload           6
	//   77  156:aload_1         
	//   78  157:invokevirtual   #170 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   79  160:pop             
			}
			textdirectionheuristiccompat = ((TextDirectionHeuristicCompat) (spannablestringbuilder));
			if(flag)
			{
				if(flag1)
					textdirectionheuristiccompat = TextDirectionHeuristicsCompat.RTL;
				else
	//*  80  161:goto            108
					textdirectionheuristiccompat = TextDirectionHeuristicsCompat.LTR;
	//   81  164:getstatic       #178 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.LTR>
	//   82  167:astore_2        
				spannablestringbuilder.append(((CharSequence) (markAfter(charsequence, textdirectionheuristiccompat))));
				return ((CharSequence) (spannablestringbuilder));
			}
		}
		return ((CharSequence) (textdirectionheuristiccompat));
	//*  83  168:goto            124
	}

	public CharSequence unicodeWrap(CharSequence charsequence, boolean flag)
	{
		return unicodeWrap(charsequence, mDefaultTextDirectionHeuristicCompat, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #84  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
	//    4    6:iload_2         
	//    5    7:invokevirtual   #155 <Method CharSequence unicodeWrap(CharSequence, TextDirectionHeuristicCompat, boolean)>
	//    6   10:areturn         
	}

	public String unicodeWrap(String s)
	{
		return unicodeWrap(s, mDefaultTextDirectionHeuristicCompat, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #84  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #183 <Method String unicodeWrap(String, TextDirectionHeuristicCompat, boolean)>
	//    6   10:areturn         
	}

	public String unicodeWrap(String s, TextDirectionHeuristicCompat textdirectionheuristiccompat)
	{
		return unicodeWrap(s, textdirectionheuristiccompat, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #183 <Method String unicodeWrap(String, TextDirectionHeuristicCompat, boolean)>
	//    5    7:areturn         
	}

	public String unicodeWrap(String s, TextDirectionHeuristicCompat textdirectionheuristiccompat, boolean flag)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return unicodeWrap(((CharSequence) (s)), textdirectionheuristiccompat, flag).toString();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:iload_3         
	//    8   10:invokevirtual   #155 <Method CharSequence unicodeWrap(CharSequence, TextDirectionHeuristicCompat, boolean)>
	//    9   13:invokeinterface #187 <Method String CharSequence.toString()>
	//   10   18:areturn         
	}

	public String unicodeWrap(String s, boolean flag)
	{
		return unicodeWrap(s, mDefaultTextDirectionHeuristicCompat, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #84  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
	//    4    6:iload_2         
	//    5    7:invokevirtual   #183 <Method String unicodeWrap(String, TextDirectionHeuristicCompat, boolean)>
	//    6   10:areturn         
	}

	private static final int DEFAULT_FLAGS = 2;
	private static final BidiFormatter DEFAULT_LTR_INSTANCE;
	private static final BidiFormatter DEFAULT_RTL_INSTANCE;
	private static TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC;
	private static final int DIR_LTR = -1;
	private static final int DIR_RTL = 1;
	private static final int DIR_UNKNOWN = 0;
	private static final String EMPTY_STRING = "";
	private static final int FLAG_STEREO_RESET = 2;
	private static final char LRE = 8234;
	private static final char LRM = 8206;
	private static final String LRM_STRING = Character.toString('\u200E');
	private static final char PDF = 8236;
	private static final char RLE = 8235;
	private static final char RLM = 8207;
	private static final String RLM_STRING = Character.toString('\u200F');
	private final TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
	private final int mFlags;
	private final boolean mIsRtlContext;

	static 
	{
		DEFAULT_TEXT_DIRECTION_HEURISTIC = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
	//    0    0:getstatic       #55  <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR>
	//    1    3:putstatic       #57  <Field TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC>
	//    2    6:sipush          8206
	//    3    9:invokestatic    #63  <Method String Character.toString(char)>
	//    4   12:putstatic       #65  <Field String LRM_STRING>
	//    5   15:sipush          8207
	//    6   18:invokestatic    #63  <Method String Character.toString(char)>
	//    7   21:putstatic       #67  <Field String RLM_STRING>
		DEFAULT_LTR_INSTANCE = new BidiFormatter(false, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);
	//    8   24:new             #2   <Class BidiFormatter>
	//    9   27:dup             
	//   10   28:iconst_0        
	//   11   29:iconst_2        
	//   12   30:getstatic       #57  <Field TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC>
	//   13   33:invokespecial   #71  <Method void BidiFormatter(boolean, int, TextDirectionHeuristicCompat)>
	//   14   36:putstatic       #73  <Field BidiFormatter DEFAULT_LTR_INSTANCE>
		DEFAULT_RTL_INSTANCE = new BidiFormatter(true, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);
	//   15   39:new             #2   <Class BidiFormatter>
	//   16   42:dup             
	//   17   43:iconst_1        
	//   18   44:iconst_2        
	//   19   45:getstatic       #57  <Field TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC>
	//   20   48:invokespecial   #71  <Method void BidiFormatter(boolean, int, TextDirectionHeuristicCompat)>
	//   21   51:putstatic       #75  <Field BidiFormatter DEFAULT_RTL_INSTANCE>
	//*  22   54:return          
	}


/*
	static boolean access$000(Locale locale)
	{
		return isRtlLocale(locale);
	//    0    0:aload_0         
	//    1    1:invokestatic    #90  <Method boolean isRtlLocale(Locale)>
	//    2    4:ireturn         
	}

*/


/*
	static TextDirectionHeuristicCompat access$100()
	{
		return DEFAULT_TEXT_DIRECTION_HEURISTIC;
	//    0    0:getstatic       #57  <Field TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC>
	//    1    3:areturn         
	}

*/


/*
	static BidiFormatter access$200()
	{
		return DEFAULT_RTL_INSTANCE;
	//    0    0:getstatic       #75  <Field BidiFormatter DEFAULT_RTL_INSTANCE>
	//    1    3:areturn         
	}

*/


/*
	static BidiFormatter access$300()
	{
		return DEFAULT_LTR_INSTANCE;
	//    0    0:getstatic       #73  <Field BidiFormatter DEFAULT_LTR_INSTANCE>
	//    1    3:areturn         
	}

*/
}
