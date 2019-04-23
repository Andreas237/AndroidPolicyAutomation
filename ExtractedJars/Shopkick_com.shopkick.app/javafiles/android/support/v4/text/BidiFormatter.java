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
		//    2    4:getstatic       #39  <Field BidiFormatter BidiFormatter.DEFAULT_RTL_INSTANCE>
		//    3    7:areturn         
			else
				return BidiFormatter.DEFAULT_LTR_INSTANCE;
		//    4    8:getstatic       #42  <Field BidiFormatter BidiFormatter.DEFAULT_LTR_INSTANCE>
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
		//    4    6:getstatic       #47  <Field TextDirectionHeuristicCompat BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC>
		//    5    9:putfield        #49  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
			mFlags = 2;
		//    6   12:aload_0         
		//    7   13:iconst_2        
		//    8   14:putfield        #51  <Field int mFlags>
		//    9   17:return          
		}

		public BidiFormatter build()
		{
			if(mFlags == 2 && mTextDirectionHeuristicCompat == BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field int mFlags>
		//*   2    4:iconst_2        
		//*   3    5:icmpne          26
		//*   4    8:aload_0         
		//*   5    9:getfield        #49  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
		//*   6   12:getstatic       #47  <Field TextDirectionHeuristicCompat BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC>
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
		//   17   35:getfield        #51  <Field int mFlags>
		//   18   38:aload_0         
		//   19   39:getfield        #49  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
		//   20   42:invokespecial   #58  <Method void BidiFormatter(boolean, int, TextDirectionHeuristicCompat)>
		//   21   45:areturn         
		}

		public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat textdirectionheuristiccompat)
		{
			mTextDirectionHeuristicCompat = textdirectionheuristiccompat;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #49  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
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
		//    4    6:getfield        #51  <Field int mFlags>
		//    5    9:iconst_2        
		//    6   10:ior             
		//    7   11:putfield        #51  <Field int mFlags>
				return this;
		//    8   14:aload_0         
		//    9   15:areturn         
			} else
			{
				mFlags = mFlags & -3;
		//   10   16:aload_0         
		//   11   17:aload_0         
		//   12   18:getfield        #51  <Field int mFlags>
		//   13   21:bipush          -3
		//   14   23:iand            
		//   15   24:putfield        #51  <Field int mFlags>
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
		//    4    8:invokestatic    #27  <Method boolean BidiFormatter.isRtlLocale(Locale)>
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
		//    4    6:invokestatic    #27  <Method boolean BidiFormatter.isRtlLocale(Locale)>
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
			int j;
			do
			{
				j = charIndex;
		//    3    5:aload_0         
		//    4    6:getfield        #54  <Field int charIndex>
		//    5    9:istore_2        
				if(j <= 0)
					break;
		//    6   10:iload_2         
		//    7   11:ifle            59
				CharSequence charsequence = text;
		//    8   14:aload_0         
		//    9   15:getfield        #37  <Field CharSequence text>
		//   10   18:astore_3        
				j--;
		//   11   19:iload_2         
		//   12   20:iconst_1        
		//   13   21:isub            
		//   14   22:istore_2        
				charIndex = j;
		//   15   23:aload_0         
		//   16   24:iload_2         
		//   17   25:putfield        #54  <Field int charIndex>
				lastChar = charsequence.charAt(j);
		//   18   28:aload_0         
		//   19   29:aload_3         
		//   20   30:iload_2         
		//   21   31:invokeinterface #58  <Method char CharSequence.charAt(int)>
		//   22   36:putfield        #60  <Field char lastChar>
				j = ((int) (lastChar));
		//   23   39:aload_0         
		//   24   40:getfield        #60  <Field char lastChar>
		//   25   43:istore_2        
				if(j == '&')
		//*  26   44:iload_2         
		//*  27   45:bipush          38
		//*  28   47:icmpne          53
					return 12;
		//   29   50:bipush          12
		//   30   52:ireturn         
			} while(j != ';');
		//   31   53:iload_2         
		//   32   54:bipush          59
		//   33   56:icmpne          5
			charIndex = i;
		//   34   59:aload_0         
		//   35   60:iload_1         
		//   36   61:putfield        #54  <Field int charIndex>
			lastChar = ';';
		//   37   64:aload_0         
		//   38   65:bipush          59
		//   39   67:putfield        #60  <Field char lastChar>
			return 13;
		//   40   70:bipush          13
		//   41   72:ireturn         
		}

		private byte skipEntityForward()
		{
			char c;
			do
			{
				int i = charIndex;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field int charIndex>
		//    2    4:istore_2        
				if(i >= length)
					break;
		//    3    5:iload_2         
		//    4    6:aload_0         
		//    5    7:getfield        #46  <Field int length>
		//    6   10:icmpge          47
				CharSequence charsequence = text;
		//    7   13:aload_0         
		//    8   14:getfield        #37  <Field CharSequence text>
		//    9   17:astore_3        
				charIndex = i + 1;
		//   10   18:aload_0         
		//   11   19:iload_2         
		//   12   20:iconst_1        
		//   13   21:iadd            
		//   14   22:putfield        #54  <Field int charIndex>
				c = charsequence.charAt(i);
		//   15   25:aload_3         
		//   16   26:iload_2         
		//   17   27:invokeinterface #58  <Method char CharSequence.charAt(int)>
		//   18   32:istore_1        
				lastChar = c;
		//   19   33:aload_0         
		//   20   34:iload_1         
		//   21   35:putfield        #60  <Field char lastChar>
			} while(c != ';');
		//   22   38:iload_1         
		//   23   39:bipush          59
		//   24   41:icmpeq          47
		//*  25   44:goto            0
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
				int j = charIndex;
		//    3    5:aload_0         
		//    4    6:getfield        #54  <Field int charIndex>
		//    5    9:istore_3        
				if(j <= 0)
					break;
		//    6   10:iload_3         
		//    7   11:ifle            133
				CharSequence charsequence = text;
		//    8   14:aload_0         
		//    9   15:getfield        #37  <Field CharSequence text>
		//   10   18:astore          5
				j--;
		//   11   20:iload_3         
		//   12   21:iconst_1        
		//   13   22:isub            
		//   14   23:istore_3        
				charIndex = j;
		//   15   24:aload_0         
		//   16   25:iload_3         
		//   17   26:putfield        #54  <Field int charIndex>
				lastChar = charsequence.charAt(j);
		//   18   29:aload_0         
		//   19   30:aload           5
		//   20   32:iload_3         
		//   21   33:invokeinterface #58  <Method char CharSequence.charAt(int)>
		//   22   38:putfield        #60  <Field char lastChar>
				j = ((int) (lastChar));
		//   23   41:aload_0         
		//   24   42:getfield        #60  <Field char lastChar>
		//   25   45:istore_3        
				if(j == '<')
		//*  26   46:iload_3         
		//*  27   47:bipush          60
		//*  28   49:icmpne          55
					return 12;
		//   29   52:bipush          12
		//   30   54:ireturn         
				if(j == '>')
		//*  31   55:iload_3         
		//*  32   56:bipush          62
		//*  33   58:icmpne          64
					break;
		//   34   61:goto            133
				if(j == '"' || j == '\'')
		//*  35   64:iload_3         
		//*  36   65:bipush          34
		//*  37   67:icmpeq          76
		//*  38   70:iload_3         
		//*  39   71:bipush          39
		//*  40   73:icmpne          5
				{
					char c1 = lastChar;
		//   41   76:aload_0         
		//   42   77:getfield        #60  <Field char lastChar>
		//   43   80:istore_3        
					char c;
					do
					{
						int k = charIndex;
		//   44   81:aload_0         
		//   45   82:getfield        #54  <Field int charIndex>
		//   46   85:istore          4
						if(k <= 0)
							break;
		//   47   87:iload           4
		//   48   89:ifle            5
						CharSequence charsequence1 = text;
		//   49   92:aload_0         
		//   50   93:getfield        #37  <Field CharSequence text>
		//   51   96:astore          5
						k--;
		//   52   98:iload           4
		//   53  100:iconst_1        
		//   54  101:isub            
		//   55  102:istore          4
						charIndex = k;
		//   56  104:aload_0         
		//   57  105:iload           4
		//   58  107:putfield        #54  <Field int charIndex>
						c = charsequence1.charAt(k);
		//   59  110:aload           5
		//   60  112:iload           4
		//   61  114:invokeinterface #58  <Method char CharSequence.charAt(int)>
		//   62  119:istore_1        
						lastChar = c;
		//   63  120:aload_0         
		//   64  121:iload_1         
		//   65  122:putfield        #60  <Field char lastChar>
					} while(c != c1);
		//   66  125:iload_1         
		//   67  126:iload_3         
		//   68  127:icmpeq          5
				}
			} while(true);
		//   69  130:goto            81
			charIndex = i;
		//   70  133:aload_0         
		//   71  134:iload_2         
		//   72  135:putfield        #54  <Field int charIndex>
			lastChar = '>';
		//   73  138:aload_0         
		//   74  139:bipush          62
		//   75  141:putfield        #60  <Field char lastChar>
			return 13;
		//   76  144:bipush          13
		//   77  146:ireturn         
		}

		private byte skipTagForward()
		{
			int i = charIndex;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field int charIndex>
		//    2    4:istore_2        
			do
			{
				int j = charIndex;
		//    3    5:aload_0         
		//    4    6:getfield        #54  <Field int charIndex>
		//    5    9:istore_3        
				if(j >= length)
					break;
		//    6   10:iload_3         
		//    7   11:aload_0         
		//    8   12:getfield        #46  <Field int length>
		//    9   15:icmpge          126
				CharSequence charsequence = text;
		//   10   18:aload_0         
		//   11   19:getfield        #37  <Field CharSequence text>
		//   12   22:astore          5
				charIndex = j + 1;
		//   13   24:aload_0         
		//   14   25:iload_3         
		//   15   26:iconst_1        
		//   16   27:iadd            
		//   17   28:putfield        #54  <Field int charIndex>
				lastChar = charsequence.charAt(j);
		//   18   31:aload_0         
		//   19   32:aload           5
		//   20   34:iload_3         
		//   21   35:invokeinterface #58  <Method char CharSequence.charAt(int)>
		//   22   40:putfield        #60  <Field char lastChar>
				j = ((int) (lastChar));
		//   23   43:aload_0         
		//   24   44:getfield        #60  <Field char lastChar>
		//   25   47:istore_3        
				if(j == '>')
		//*  26   48:iload_3         
		//*  27   49:bipush          62
		//*  28   51:icmpne          57
					return 12;
		//   29   54:bipush          12
		//   30   56:ireturn         
				if(j == '"' || j == '\'')
		//*  31   57:iload_3         
		//*  32   58:bipush          34
		//*  33   60:icmpeq          69
		//*  34   63:iload_3         
		//*  35   64:bipush          39
		//*  36   66:icmpne          5
				{
					char c1 = lastChar;
		//   37   69:aload_0         
		//   38   70:getfield        #60  <Field char lastChar>
		//   39   73:istore_3        
					char c;
					do
					{
						int k = charIndex;
		//   40   74:aload_0         
		//   41   75:getfield        #54  <Field int charIndex>
		//   42   78:istore          4
						if(k >= length)
							break;
		//   43   80:iload           4
		//   44   82:aload_0         
		//   45   83:getfield        #46  <Field int length>
		//   46   86:icmpge          5
						CharSequence charsequence1 = text;
		//   47   89:aload_0         
		//   48   90:getfield        #37  <Field CharSequence text>
		//   49   93:astore          5
						charIndex = k + 1;
		//   50   95:aload_0         
		//   51   96:iload           4
		//   52   98:iconst_1        
		//   53   99:iadd            
		//   54  100:putfield        #54  <Field int charIndex>
						c = charsequence1.charAt(k);
		//   55  103:aload           5
		//   56  105:iload           4
		//   57  107:invokeinterface #58  <Method char CharSequence.charAt(int)>
		//   58  112:istore_1        
						lastChar = c;
		//   59  113:aload_0         
		//   60  114:iload_1         
		//   61  115:putfield        #60  <Field char lastChar>
					} while(c != c1);
		//   62  118:iload_1         
		//   63  119:iload_3         
		//   64  120:icmpeq          5
				}
			} while(true);
		//   65  123:goto            74
			charIndex = i;
		//   66  126:aload_0         
		//   67  127:iload_2         
		//   68  128:putfield        #54  <Field int charIndex>
			lastChar = '<';
		//   69  131:aload_0         
		//   70  132:bipush          60
		//   71  134:putfield        #60  <Field char lastChar>
			return 13;
		//   72  137:bipush          13
		//   73  139:ireturn         
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
		//*  43   83:ifeq            115
			{
				char c = lastChar;
		//   44   86:aload_0         
		//   45   87:getfield        #60  <Field char lastChar>
		//   46   90:istore_3        
				if(c == '>')
		//*  47   91:iload_3         
		//*  48   92:bipush          62
		//*  49   94:icmpne          102
					return skipTagBackward();
		//   50   97:aload_0         
		//   51   98:invokespecial   #80  <Method byte skipTagBackward()>
		//   52  101:ireturn         
				byte0 = byte1;
		//   53  102:iload_2         
		//   54  103:istore_1        
				if(c == ';')
		//*  55  104:iload_3         
		//*  56  105:bipush          59
		//*  57  107:icmpne          115
					byte0 = skipEntityBackward();
		//   58  110:aload_0         
		//   59  111:invokespecial   #82  <Method byte skipEntityBackward()>
		//   60  114:istore_1        
			}
			return byte0;
		//   61  115:iload_1         
		//   62  116:ireturn         
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
		//*  41   81:ifeq            113
			{
				char c = lastChar;
		//   42   84:aload_0         
		//   43   85:getfield        #60  <Field char lastChar>
		//   44   88:istore_3        
				if(c == '<')
		//*  45   89:iload_3         
		//*  46   90:bipush          60
		//*  47   92:icmpne          100
					return skipTagForward();
		//   48   95:aload_0         
		//   49   96:invokespecial   #91  <Method byte skipTagForward()>
		//   50   99:ireturn         
				byte0 = byte1;
		//   51  100:iload_2         
		//   52  101:istore_1        
				if(c == '&')
		//*  53  102:iload_3         
		//*  54  103:bipush          38
		//*  55  105:icmpne          113
					byte0 = skipEntityForward();
		//   56  108:aload_0         
		//   57  109:invokespecial   #93  <Method byte skipEntityForward()>
		//   58  112:istore_1        
			}
			return byte0;
		//   59  113:iload_1         
		//   60  114:ireturn         
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
		//		               0 140
		//		               1 134
		//		               2 134;
		//   23   41:tableswitch     0 2: default 68
		//		               0 140
		//		               1 134
		//		               2 134
			   goto _L5 _L6 _L7 _L7
_L5:
			switch(byte0)
		//*  24   68:iload           4
			{
		//*  25   70:tableswitch     14 18: default 104
		//		               14 125
		//		               15 125
		//		               16 116
		//		               17 116
		//		               18 107
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
		//		               14 232
		//		               15 232
		//		               16 218
		//		               17 218
		//		               18 211
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
		//		               0 147
		//		               1 134
		//		               2 134
				default:
					switch(byte0)
		//*  19   56:iload_3         
					{
		//*  20   57:tableswitch     14 18: default 92
		//		               14 120
		//		               15 120
		//		               16 106
		//		               17 106
		//		               18 99
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


	BidiFormatter(boolean flag, int i, TextDirectionHeuristicCompat textdirectionheuristiccompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void Object()>
		mIsRtlContext = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #78  <Field boolean mIsRtlContext>
		mFlags = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #80  <Field int mFlags>
		mDefaultTextDirectionHeuristicCompat = textdirectionheuristiccompat;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #82  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
	//   11   19:return          
	}

	private static int getEntryDir(CharSequence charsequence)
	{
		return (new DirectionalityEstimator(charsequence, false)).getEntryDir();
	//    0    0:new             #9   <Class BidiFormatter$DirectionalityEstimator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #87  <Method void BidiFormatter$DirectionalityEstimator(CharSequence, boolean)>
	//    5    9:invokevirtual   #90  <Method int BidiFormatter$DirectionalityEstimator.getEntryDir()>
	//    6   12:ireturn         
	}

	private static int getExitDir(CharSequence charsequence)
	{
		return (new DirectionalityEstimator(charsequence, false)).getExitDir();
	//    0    0:new             #9   <Class BidiFormatter$DirectionalityEstimator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #87  <Method void BidiFormatter$DirectionalityEstimator(CharSequence, boolean)>
	//    5    9:invokevirtual   #93  <Method int BidiFormatter$DirectionalityEstimator.getExitDir()>
	//    6   12:ireturn         
	}

	public static BidiFormatter getInstance()
	{
		return (new Builder()).build();
	//    0    0:new             #6   <Class BidiFormatter$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void BidiFormatter$Builder()>
	//    3    7:invokevirtual   #99  <Method BidiFormatter BidiFormatter$Builder.build()>
	//    4   10:areturn         
	}

	public static BidiFormatter getInstance(Locale locale)
	{
		return (new Builder(locale)).build();
	//    0    0:new             #6   <Class BidiFormatter$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #103 <Method void BidiFormatter$Builder(Locale)>
	//    4    8:invokevirtual   #99  <Method BidiFormatter BidiFormatter$Builder.build()>
	//    5   11:areturn         
	}

	public static BidiFormatter getInstance(boolean flag)
	{
		return (new Builder(flag)).build();
	//    0    0:new             #6   <Class BidiFormatter$Builder>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #107 <Method void BidiFormatter$Builder(boolean)>
	//    4    8:invokevirtual   #99  <Method BidiFormatter BidiFormatter$Builder.build()>
	//    5   11:areturn         
	}

	static boolean isRtlLocale(Locale locale)
	{
		return TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1;
	//    0    0:aload_0         
	//    1    1:invokestatic    #115 <Method int TextUtilsCompat.getLayoutDirectionFromLocale(Locale)>
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
	//    4    4:invokeinterface #122 <Method int CharSequence.length()>
	//    5    9:invokeinterface #128 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
	//    6   14:istore_3        
		if(!mIsRtlContext && (flag || getExitDir(charsequence) == 1))
	//*   7   15:aload_0         
	//*   8   16:getfield        #78  <Field boolean mIsRtlContext>
	//*   9   19:ifne            38
	//*  10   22:iload_3         
	//*  11   23:ifne            34
	//*  12   26:aload_1         
	//*  13   27:invokestatic    #130 <Method int getExitDir(CharSequence)>
	//*  14   30:iconst_1        
	//*  15   31:icmpne          38
			return LRM_STRING;
	//   16   34:getstatic       #63  <Field String LRM_STRING>
	//   17   37:areturn         
		if(mIsRtlContext && (!flag || getExitDir(charsequence) == -1))
	//*  18   38:aload_0         
	//*  19   39:getfield        #78  <Field boolean mIsRtlContext>
	//*  20   42:ifeq            61
	//*  21   45:iload_3         
	//*  22   46:ifeq            57
	//*  23   49:aload_1         
	//*  24   50:invokestatic    #130 <Method int getExitDir(CharSequence)>
	//*  25   53:iconst_m1       
	//*  26   54:icmpne          61
			return RLM_STRING;
	//   27   57:getstatic       #65  <Field String RLM_STRING>
	//   28   60:areturn         
		else
			return "";
	//   29   61:ldc1            #28  <String "">
	//   30   63:areturn         
	}

	private String markBefore(CharSequence charsequence, TextDirectionHeuristicCompat textdirectionheuristiccompat)
	{
		boolean flag = textdirectionheuristiccompat.isRtl(charsequence, 0, charsequence.length());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:invokeinterface #122 <Method int CharSequence.length()>
	//    5    9:invokeinterface #128 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
	//    6   14:istore_3        
		if(!mIsRtlContext && (flag || getEntryDir(charsequence) == 1))
	//*   7   15:aload_0         
	//*   8   16:getfield        #78  <Field boolean mIsRtlContext>
	//*   9   19:ifne            38
	//*  10   22:iload_3         
	//*  11   23:ifne            34
	//*  12   26:aload_1         
	//*  13   27:invokestatic    #133 <Method int getEntryDir(CharSequence)>
	//*  14   30:iconst_1        
	//*  15   31:icmpne          38
			return LRM_STRING;
	//   16   34:getstatic       #63  <Field String LRM_STRING>
	//   17   37:areturn         
		if(mIsRtlContext && (!flag || getEntryDir(charsequence) == -1))
	//*  18   38:aload_0         
	//*  19   39:getfield        #78  <Field boolean mIsRtlContext>
	//*  20   42:ifeq            61
	//*  21   45:iload_3         
	//*  22   46:ifeq            57
	//*  23   49:aload_1         
	//*  24   50:invokestatic    #133 <Method int getEntryDir(CharSequence)>
	//*  25   53:iconst_m1       
	//*  26   54:icmpne          61
			return RLM_STRING;
	//   27   57:getstatic       #65  <Field String RLM_STRING>
	//   28   60:areturn         
		else
			return "";
	//   29   61:ldc1            #28  <String "">
	//   30   63:areturn         
	}

	public boolean getStereoReset()
	{
		return (mFlags & 2) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int mFlags>
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
	//    1    1:getfield        #82  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:aload_1         
	//    5    7:invokeinterface #122 <Method int CharSequence.length()>
	//    6   12:invokeinterface #128 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
	//    7   17:ireturn         
	}

	public boolean isRtl(String s)
	{
		return isRtl(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #139 <Method boolean isRtl(CharSequence)>
	//    3    5:ireturn         
	}

	public boolean isRtlContext()
	{
		return mIsRtlContext;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean mIsRtlContext>
	//    2    4:ireturn         
	}

	public CharSequence unicodeWrap(CharSequence charsequence)
	{
		return unicodeWrap(charsequence, mDefaultTextDirectionHeuristicCompat, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #82  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #145 <Method CharSequence unicodeWrap(CharSequence, TextDirectionHeuristicCompat, boolean)>
	//    6   10:areturn         
	}

	public CharSequence unicodeWrap(CharSequence charsequence, TextDirectionHeuristicCompat textdirectionheuristiccompat)
	{
		return unicodeWrap(charsequence, textdirectionheuristiccompat, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #145 <Method CharSequence unicodeWrap(CharSequence, TextDirectionHeuristicCompat, boolean)>
	//    5    7:areturn         
	}

	public CharSequence unicodeWrap(CharSequence charsequence, TextDirectionHeuristicCompat textdirectionheuristiccompat, boolean flag)
	{
		if(charsequence == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		boolean flag1 = textdirectionheuristiccompat.isRtl(charsequence, 0, charsequence.length());
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:aload_1         
	//    8   10:invokeinterface #122 <Method int CharSequence.length()>
	//    9   15:invokeinterface #128 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
	//   10   20:istore          5
		SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
	//   11   22:new             #148 <Class SpannableStringBuilder>
	//   12   25:dup             
	//   13   26:invokespecial   #149 <Method void SpannableStringBuilder()>
	//   14   29:astore          6
		if(getStereoReset() && flag)
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #151 <Method boolean getStereoReset()>
	//*  17   35:ifeq            70
	//*  18   38:iload_3         
	//*  19   39:ifeq            70
		{
			if(flag1)
	//*  20   42:iload           5
	//*  21   44:ifeq            54
				textdirectionheuristiccompat = TextDirectionHeuristicsCompat.RTL;
	//   22   47:getstatic       #154 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.RTL>
	//   23   50:astore_2        
			else
	//*  24   51:goto            58
				textdirectionheuristiccompat = TextDirectionHeuristicsCompat.LTR;
	//   25   54:getstatic       #157 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.LTR>
	//   26   57:astore_2        
			spannablestringbuilder.append(((CharSequence) (markBefore(charsequence, textdirectionheuristiccompat))));
	//   27   58:aload           6
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:aload_2         
	//   31   63:invokespecial   #159 <Method String markBefore(CharSequence, TextDirectionHeuristicCompat)>
	//   32   66:invokevirtual   #163 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   33   69:pop             
		}
		if(flag1 != mIsRtlContext)
	//*  34   70:iload           5
	//*  35   72:aload_0         
	//*  36   73:getfield        #78  <Field boolean mIsRtlContext>
	//*  37   76:icmpeq          124
		{
			char c;
			if(flag1)
	//*  38   79:iload           5
	//*  39   81:ifeq            92
				c = '\u202B';
	//   40   84:sipush          8235
	//   41   87:istore          4
			else
	//*  42   89:goto            97
				c = '\u202A';
	//   43   92:sipush          8234
	//   44   95:istore          4
			spannablestringbuilder.append(c);
	//   45   97:aload           6
	//   46   99:iload           4
	//   47  101:invokevirtual   #166 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//   48  104:pop             
			spannablestringbuilder.append(charsequence);
	//   49  105:aload           6
	//   50  107:aload_1         
	//   51  108:invokevirtual   #163 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   52  111:pop             
			spannablestringbuilder.append('\u202C');
	//   53  112:aload           6
	//   54  114:sipush          8236
	//   55  117:invokevirtual   #166 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//   56  120:pop             
		} else
	//*  57  121:goto            131
		{
			spannablestringbuilder.append(charsequence);
	//   58  124:aload           6
	//   59  126:aload_1         
	//   60  127:invokevirtual   #163 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   61  130:pop             
		}
		if(flag)
	//*  62  131:iload_3         
	//*  63  132:ifeq            163
		{
			if(flag1)
	//*  64  135:iload           5
	//*  65  137:ifeq            147
				textdirectionheuristiccompat = TextDirectionHeuristicsCompat.RTL;
	//   66  140:getstatic       #154 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.RTL>
	//   67  143:astore_2        
			else
	//*  68  144:goto            151
				textdirectionheuristiccompat = TextDirectionHeuristicsCompat.LTR;
	//   69  147:getstatic       #157 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.LTR>
	//   70  150:astore_2        
			spannablestringbuilder.append(((CharSequence) (markAfter(charsequence, textdirectionheuristiccompat))));
	//   71  151:aload           6
	//   72  153:aload_0         
	//   73  154:aload_1         
	//   74  155:aload_2         
	//   75  156:invokespecial   #168 <Method String markAfter(CharSequence, TextDirectionHeuristicCompat)>
	//   76  159:invokevirtual   #163 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   77  162:pop             
		}
		return ((CharSequence) (spannablestringbuilder));
	//   78  163:aload           6
	//   79  165:areturn         
	}

	public CharSequence unicodeWrap(CharSequence charsequence, boolean flag)
	{
		return unicodeWrap(charsequence, mDefaultTextDirectionHeuristicCompat, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #82  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
	//    4    6:iload_2         
	//    5    7:invokevirtual   #145 <Method CharSequence unicodeWrap(CharSequence, TextDirectionHeuristicCompat, boolean)>
	//    6   10:areturn         
	}

	public String unicodeWrap(String s)
	{
		return unicodeWrap(s, mDefaultTextDirectionHeuristicCompat, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #82  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #173 <Method String unicodeWrap(String, TextDirectionHeuristicCompat, boolean)>
	//    6   10:areturn         
	}

	public String unicodeWrap(String s, TextDirectionHeuristicCompat textdirectionheuristiccompat)
	{
		return unicodeWrap(s, textdirectionheuristiccompat, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #173 <Method String unicodeWrap(String, TextDirectionHeuristicCompat, boolean)>
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
	//    8   10:invokevirtual   #145 <Method CharSequence unicodeWrap(CharSequence, TextDirectionHeuristicCompat, boolean)>
	//    9   13:invokeinterface #177 <Method String CharSequence.toString()>
	//   10   18:areturn         
	}

	public String unicodeWrap(String s, boolean flag)
	{
		return unicodeWrap(s, mDefaultTextDirectionHeuristicCompat, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #82  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
	//    4    6:iload_2         
	//    5    7:invokevirtual   #173 <Method String unicodeWrap(String, TextDirectionHeuristicCompat, boolean)>
	//    6   10:areturn         
	}

	private static final int DEFAULT_FLAGS = 2;
	static final BidiFormatter DEFAULT_LTR_INSTANCE;
	static final BidiFormatter DEFAULT_RTL_INSTANCE;
	static final TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC;
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
	//    0    0:getstatic       #53  <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR>
	//    1    3:putstatic       #55  <Field TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC>
	//    2    6:sipush          8206
	//    3    9:invokestatic    #61  <Method String Character.toString(char)>
	//    4   12:putstatic       #63  <Field String LRM_STRING>
	//    5   15:sipush          8207
	//    6   18:invokestatic    #61  <Method String Character.toString(char)>
	//    7   21:putstatic       #65  <Field String RLM_STRING>
		DEFAULT_LTR_INSTANCE = new BidiFormatter(false, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);
	//    8   24:new             #2   <Class BidiFormatter>
	//    9   27:dup             
	//   10   28:iconst_0        
	//   11   29:iconst_2        
	//   12   30:getstatic       #55  <Field TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC>
	//   13   33:invokespecial   #69  <Method void BidiFormatter(boolean, int, TextDirectionHeuristicCompat)>
	//   14   36:putstatic       #71  <Field BidiFormatter DEFAULT_LTR_INSTANCE>
		DEFAULT_RTL_INSTANCE = new BidiFormatter(true, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);
	//   15   39:new             #2   <Class BidiFormatter>
	//   16   42:dup             
	//   17   43:iconst_1        
	//   18   44:iconst_2        
	//   19   45:getstatic       #55  <Field TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC>
	//   20   48:invokespecial   #69  <Method void BidiFormatter(boolean, int, TextDirectionHeuristicCompat)>
	//   21   51:putstatic       #73  <Field BidiFormatter DEFAULT_RTL_INSTANCE>
	//*  22   54:return          
	}
}
