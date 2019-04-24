// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import java.nio.CharBuffer;
import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//			TextDirectionHeuristicCompat, TextUtilsCompat

public final class TextDirectionHeuristicsCompat
{
	static class AnyStrong
		implements TextDirectionAlgorithm
	{

		public int checkRtl(CharSequence charsequence, int i, int j)
		{
			boolean flag = false;
		//    0    0:iconst_0        
		//    1    1:istore          4
			for(int k = i; k < i + j; k++)
		//*   2    3:iload_2         
		//*   3    4:istore          5
		//*   4    6:iload           5
		//*   5    8:iload_2         
		//*   6    9:iload_3         
		//*   7   10:iadd            
		//*   8   11:icmpge          95
				switch(TextDirectionHeuristicsCompat.isRtlText(((int) (Character.getDirectionality(charsequence.charAt(k))))))
		//*   9   14:aload_1         
		//*  10   15:iload           5
		//*  11   17:invokeinterface #37  <Method char CharSequence.charAt(int)>
		//*  12   22:invokestatic    #43  <Method byte Character.getDirectionality(char)>
		//*  13   25:invokestatic    #47  <Method int TextDirectionHeuristicsCompat.isRtlText(int)>
				{
				default:
					break;

		//*  14   28:lookupswitch    2: default 56
		//		               0: 59
		//		               1: 74
		//*  15   56:goto            86
				case 0: // '\0'
					if(mLookForRtl)
		//*  16   59:aload_0         
		//*  17   60:getfield        #29  <Field boolean mLookForRtl>
		//*  18   63:ifeq            68
						return 0;
		//   19   66:iconst_0        
		//   20   67:ireturn         
					flag = true;
		//   21   68:iconst_1        
		//   22   69:istore          4
					break;
		//   23   71:goto            86

				case 1: // '\001'
					if(!mLookForRtl)
		//*  24   74:aload_0         
		//*  25   75:getfield        #29  <Field boolean mLookForRtl>
		//*  26   78:ifne            83
						return 1;
		//   27   81:iconst_1        
		//   28   82:ireturn         
					flag = true;
		//   29   83:iconst_1        
		//   30   84:istore          4
					break;
				}

		//   31   86:iload           5
		//   32   88:iconst_1        
		//   33   89:iadd            
		//   34   90:istore          5
		//*  35   92:goto            6
			if(flag)
		//*  36   95:iload           4
		//*  37   97:ifeq            111
				return !mLookForRtl ? 0 : 1;
		//   38  100:aload_0         
		//   39  101:getfield        #29  <Field boolean mLookForRtl>
		//   40  104:ifeq            109
		//   41  107:iconst_1        
		//   42  108:ireturn         
		//   43  109:iconst_0        
		//   44  110:ireturn         
			else
				return 2;
		//   45  111:iconst_2        
		//   46  112:ireturn         
		}

		public static final AnyStrong INSTANCE_LTR = new AnyStrong(false);
		public static final AnyStrong INSTANCE_RTL = new AnyStrong(true);
		private final boolean mLookForRtl;

		static 
		{
		//    0    0:new             #2   <Class TextDirectionHeuristicsCompat$AnyStrong>
		//    1    3:dup             
		//    2    4:iconst_1        
		//    3    5:invokespecial   #20  <Method void TextDirectionHeuristicsCompat$AnyStrong(boolean)>
		//    4    8:putstatic       #22  <Field TextDirectionHeuristicsCompat$AnyStrong INSTANCE_RTL>
		//    5   11:new             #2   <Class TextDirectionHeuristicsCompat$AnyStrong>
		//    6   14:dup             
		//    7   15:iconst_0        
		//    8   16:invokespecial   #20  <Method void TextDirectionHeuristicsCompat$AnyStrong(boolean)>
		//    9   19:putstatic       #24  <Field TextDirectionHeuristicsCompat$AnyStrong INSTANCE_LTR>
		//*  10   22:return          
		}

		private AnyStrong(boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
			mLookForRtl = flag;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #29  <Field boolean mLookForRtl>
		//    5    9:return          
		}
	}

	static class FirstStrong
		implements TextDirectionAlgorithm
	{

		public int checkRtl(CharSequence charsequence, int i, int j)
		{
			int l = 2;
		//    0    0:iconst_2        
		//    1    1:istore          5
			for(int k = i; k < i + j && l == 2; k++)
		//*   2    3:iload_2         
		//*   3    4:istore          4
		//*   4    6:iload           4
		//*   5    8:iload_2         
		//*   6    9:iload_3         
		//*   7   10:iadd            
		//*   8   11:icmpge          45
		//*   9   14:iload           5
		//*  10   16:iconst_2        
		//*  11   17:icmpne          45
				l = TextDirectionHeuristicsCompat.isRtlTextOrFormat(((int) (Character.getDirectionality(charsequence.charAt(k)))));
		//   12   20:aload_1         
		//   13   21:iload           4
		//   14   23:invokeinterface #28  <Method char CharSequence.charAt(int)>
		//   15   28:invokestatic    #34  <Method byte Character.getDirectionality(char)>
		//   16   31:invokestatic    #38  <Method int TextDirectionHeuristicsCompat.isRtlTextOrFormat(int)>
		//   17   34:istore          5

		//   18   36:iload           4
		//   19   38:iconst_1        
		//   20   39:iadd            
		//   21   40:istore          4
		//*  22   42:goto            6
			return l;
		//   23   45:iload           5
		//   24   47:ireturn         
		}

		public static final FirstStrong INSTANCE = new FirstStrong();

		static 
		{
		//    0    0:new             #2   <Class TextDirectionHeuristicsCompat$FirstStrong>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void TextDirectionHeuristicsCompat$FirstStrong()>
		//    3    7:putstatic       #18  <Field TextDirectionHeuristicsCompat$FirstStrong INSTANCE>
		//*   4   10:return          
		}

		private FirstStrong()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface TextDirectionAlgorithm
	{

		public abstract int checkRtl(CharSequence charsequence, int i, int j);
	}

	static abstract class TextDirectionHeuristicImpl
		implements TextDirectionHeuristicCompat
	{

		private boolean doCheck(CharSequence charsequence, int i, int j)
		{
			switch(mAlgorithm.checkRtl(charsequence, i, j))
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field TextDirectionHeuristicsCompat$TextDirectionAlgorithm mAlgorithm>
		//*   2    4:aload_1         
		//*   3    5:iload_2         
		//*   4    6:iload_3         
		//*   5    7:invokeinterface #27  <Method int TextDirectionHeuristicsCompat$TextDirectionAlgorithm.checkRtl(CharSequence, int, int)>
			{
		//*   6   12:lookupswitch    2: default 40
		//		               0: 43
		//		               1: 45
		//*   7   40:goto            47
			case 0: // '\0'
				return true;
		//    8   43:iconst_1        
		//    9   44:ireturn         

			case 1: // '\001'
				return false;
		//   10   45:iconst_0        
		//   11   46:ireturn         
			}
			return defaultIsRtl();
		//   12   47:aload_0         
		//   13   48:invokevirtual   #31  <Method boolean defaultIsRtl()>
		//   14   51:ireturn         
		}

		protected abstract boolean defaultIsRtl();

		public boolean isRtl(CharSequence charsequence, int i, int j)
		{
			if(charsequence == null || i < 0 || j < 0 || charsequence.length() - j < i)
		//*   0    0:aload_1         
		//*   1    1:ifnull          24
		//*   2    4:iload_2         
		//*   3    5:iflt            24
		//*   4    8:iload_3         
		//*   5    9:iflt            24
		//*   6   12:aload_1         
		//*   7   13:invokeinterface #38  <Method int CharSequence.length()>
		//*   8   18:iload_3         
		//*   9   19:isub            
		//*  10   20:iload_2         
		//*  11   21:icmpge          32
				throw new IllegalArgumentException();
		//   12   24:new             #40  <Class IllegalArgumentException>
		//   13   27:dup             
		//   14   28:invokespecial   #41  <Method void IllegalArgumentException()>
		//   15   31:athrow          
			if(mAlgorithm == null)
		//*  16   32:aload_0         
		//*  17   33:getfield        #18  <Field TextDirectionHeuristicsCompat$TextDirectionAlgorithm mAlgorithm>
		//*  18   36:ifnonnull       44
				return defaultIsRtl();
		//   19   39:aload_0         
		//   20   40:invokevirtual   #31  <Method boolean defaultIsRtl()>
		//   21   43:ireturn         
			else
				return doCheck(charsequence, i, j);
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:iload_2         
		//   25   47:iload_3         
		//   26   48:invokespecial   #43  <Method boolean doCheck(CharSequence, int, int)>
		//   27   51:ireturn         
		}

		public boolean isRtl(char ac[], int i, int j)
		{
			return isRtl(((CharSequence) (CharBuffer.wrap(ac))), i, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #50  <Method CharBuffer CharBuffer.wrap(char[])>
		//    3    5:iload_2         
		//    4    6:iload_3         
		//    5    7:invokevirtual   #52  <Method boolean isRtl(CharSequence, int, int)>
		//    6   10:ireturn         
		}

		private final TextDirectionAlgorithm mAlgorithm;

		public TextDirectionHeuristicImpl(TextDirectionAlgorithm textdirectionalgorithm)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mAlgorithm = textdirectionalgorithm;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field TextDirectionHeuristicsCompat$TextDirectionAlgorithm mAlgorithm>
		//    5    9:return          
		}
	}

	static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl
	{

		protected boolean defaultIsRtl()
		{
			return mDefaultIsRtl;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field boolean mDefaultIsRtl>
		//    2    4:ireturn         
		}

		private final boolean mDefaultIsRtl;

		TextDirectionHeuristicInternal(TextDirectionAlgorithm textdirectionalgorithm, boolean flag)
		{
			super(textdirectionalgorithm);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl(TextDirectionHeuristicsCompat$TextDirectionAlgorithm)>
			mDefaultIsRtl = flag;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #16  <Field boolean mDefaultIsRtl>
		//    6   10:return          
		}
	}

	static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl
	{

		protected boolean defaultIsRtl()
		{
			return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
		//    0    0:invokestatic    #28  <Method Locale Locale.getDefault()>
		//    1    3:invokestatic    #34  <Method int TextUtilsCompat.getLayoutDirectionFromLocale(Locale)>
		//    2    6:iconst_1        
		//    3    7:icmpne          12
		//    4   10:iconst_1        
		//    5   11:ireturn         
		//    6   12:iconst_0        
		//    7   13:ireturn         
		}

		public static final TextDirectionHeuristicLocale INSTANCE = new TextDirectionHeuristicLocale();

		static 
		{
		//    0    0:new             #2   <Class TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale>
		//    1    3:dup             
		//    2    4:invokespecial   #14  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale()>
		//    3    7:putstatic       #16  <Field TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale INSTANCE>
		//*   4   10:return          
		}

		public TextDirectionHeuristicLocale()
		{
			super(((TextDirectionAlgorithm) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #20  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl(TextDirectionHeuristicsCompat$TextDirectionAlgorithm)>
		//    3    5:return          
		}
	}


	private TextDirectionHeuristicsCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void Object()>
	//    2    4:return          
	}

	static int isRtlText(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 31
	//	               1 33
	//	               2 33
	//*   2   28:goto            35
		case 0: // '\0'
			return 1;
	//    3   31:iconst_1        
	//    4   32:ireturn         

		case 1: // '\001'
		case 2: // '\002'
			return 0;
	//    5   33:iconst_0        
	//    6   34:ireturn         
		}
		return 2;
	//    7   35:iconst_2        
	//    8   36:ireturn         
	}

	static int isRtlTextOrFormat(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 17: default 88
	//	               0 91
	//	               1 93
	//	               2 93
	//	               3 95
	//	               4 95
	//	               5 95
	//	               6 95
	//	               7 95
	//	               8 95
	//	               9 95
	//	               10 95
	//	               11 95
	//	               12 95
	//	               13 95
	//	               14 91
	//	               15 91
	//	               16 93
	//	               17 93
	//*   2   88:goto            95
		case 0: // '\0'
		case 14: // '\016'
		case 15: // '\017'
			return 1;
	//    3   91:iconst_1        
	//    4   92:ireturn         

		case 1: // '\001'
		case 2: // '\002'
		case 16: // '\020'
		case 17: // '\021'
			return 0;
	//    5   93:iconst_0        
	//    6   94:ireturn         
		}
		return 2;
	//    7   95:iconst_2        
	//    8   96:ireturn         
	}

	public static final TextDirectionHeuristicCompat ANYRTL_LTR;
	public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR;
	public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL;
	public static final TextDirectionHeuristicCompat LOCALE;
	public static final TextDirectionHeuristicCompat LTR = new TextDirectionHeuristicInternal(((TextDirectionAlgorithm) (null)), false);
	public static final TextDirectionHeuristicCompat RTL = new TextDirectionHeuristicInternal(((TextDirectionAlgorithm) (null)), true);
	private static final int STATE_FALSE = 1;
	private static final int STATE_TRUE = 0;
	private static final int STATE_UNKNOWN = 2;

	static 
	{
	//    0    0:new             #18  <Class TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:iconst_0        
	//    4    6:invokespecial   #42  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal(TextDirectionHeuristicsCompat$TextDirectionAlgorithm, boolean)>
	//    5    9:putstatic       #44  <Field TextDirectionHeuristicCompat LTR>
	//    6   12:new             #18  <Class TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal>
	//    7   15:dup             
	//    8   16:aconst_null     
	//    9   17:iconst_1        
	//   10   18:invokespecial   #42  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal(TextDirectionHeuristicsCompat$TextDirectionAlgorithm, boolean)>
	//   11   21:putstatic       #46  <Field TextDirectionHeuristicCompat RTL>
		FIRSTSTRONG_LTR = ((TextDirectionHeuristicCompat) (new TextDirectionHeuristicInternal(((TextDirectionAlgorithm) (FirstStrong.INSTANCE)), false)));
	//   12   24:new             #18  <Class TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal>
	//   13   27:dup             
	//   14   28:getstatic       #50  <Field TextDirectionHeuristicsCompat$FirstStrong TextDirectionHeuristicsCompat$FirstStrong.INSTANCE>
	//   15   31:iconst_0        
	//   16   32:invokespecial   #42  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal(TextDirectionHeuristicsCompat$TextDirectionAlgorithm, boolean)>
	//   17   35:putstatic       #52  <Field TextDirectionHeuristicCompat FIRSTSTRONG_LTR>
		FIRSTSTRONG_RTL = ((TextDirectionHeuristicCompat) (new TextDirectionHeuristicInternal(((TextDirectionAlgorithm) (FirstStrong.INSTANCE)), true)));
	//   18   38:new             #18  <Class TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal>
	//   19   41:dup             
	//   20   42:getstatic       #50  <Field TextDirectionHeuristicsCompat$FirstStrong TextDirectionHeuristicsCompat$FirstStrong.INSTANCE>
	//   21   45:iconst_1        
	//   22   46:invokespecial   #42  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal(TextDirectionHeuristicsCompat$TextDirectionAlgorithm, boolean)>
	//   23   49:putstatic       #54  <Field TextDirectionHeuristicCompat FIRSTSTRONG_RTL>
		ANYRTL_LTR = ((TextDirectionHeuristicCompat) (new TextDirectionHeuristicInternal(((TextDirectionAlgorithm) (AnyStrong.INSTANCE_RTL)), false)));
	//   24   52:new             #18  <Class TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal>
	//   25   55:dup             
	//   26   56:getstatic       #58  <Field TextDirectionHeuristicsCompat$AnyStrong TextDirectionHeuristicsCompat$AnyStrong.INSTANCE_RTL>
	//   27   59:iconst_0        
	//   28   60:invokespecial   #42  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal(TextDirectionHeuristicsCompat$TextDirectionAlgorithm, boolean)>
	//   29   63:putstatic       #60  <Field TextDirectionHeuristicCompat ANYRTL_LTR>
		LOCALE = ((TextDirectionHeuristicCompat) (TextDirectionHeuristicLocale.INSTANCE));
	//   30   66:getstatic       #63  <Field TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale.INSTANCE>
	//   31   69:putstatic       #65  <Field TextDirectionHeuristicCompat LOCALE>
	//*  32   72:return          
	}
}
