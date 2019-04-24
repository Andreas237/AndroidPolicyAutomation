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
	private static class AnyStrong
		implements TextDirectionAlgorithm
	{

		public int checkRtl(CharSequence charsequence, int i, int j)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #33  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #35  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #40  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		static final AnyStrong INSTANCE_LTR = new AnyStrong(false);
		static final AnyStrong INSTANCE_RTL = new AnyStrong(true);
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

	private static class FirstStrong
		implements TextDirectionAlgorithm
	{

		public int checkRtl(CharSequence charsequence, int i, int j)
		{
			int l = 2;
		//    0    0:iconst_2        
		//    1    1:istore          5
			for(int k = i; k < j + i && l == 2; k++)
		//*   2    3:iload_2         
		//*   3    4:istore          4
		//*   4    6:iload           4
		//*   5    8:iload_3         
		//*   6    9:iload_2         
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

		static final FirstStrong INSTANCE = new FirstStrong();

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

	private static interface TextDirectionAlgorithm
	{

		public abstract int checkRtl(CharSequence charsequence, int i, int j);
	}

	private static abstract class TextDirectionHeuristicImpl
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
		//*   6   12:tableswitch     0 1: default 36
		//		               0 43
		//		               1 41
			default:
				return defaultIsRtl();
		//    7   36:aload_0         
		//    8   37:invokevirtual   #31  <Method boolean defaultIsRtl()>
		//    9   40:ireturn         

			case 1: // '\001'
				return false;
		//   10   41:iconst_0        
		//   11   42:ireturn         

			case 0: // '\0'
				return true;
		//   12   43:iconst_1        
		//   13   44:ireturn         
			}
		}

		protected abstract boolean defaultIsRtl();

		public boolean isRtl(CharSequence charsequence, int i, int j)
		{
			if(charsequence != null && i >= 0 && j >= 0 && charsequence.length() - j >= i)
		//*   0    0:aload_1         
		//*   1    1:ifnull          47
		//*   2    4:iload_2         
		//*   3    5:iflt            47
		//*   4    8:iload_3         
		//*   5    9:iflt            47
		//*   6   12:aload_1         
		//*   7   13:invokeinterface #38  <Method int CharSequence.length()>
		//*   8   18:iload_3         
		//*   9   19:isub            
		//*  10   20:iload_2         
		//*  11   21:icmpge          27
		//*  12   24:goto            47
			{
				if(mAlgorithm == null)
		//*  13   27:aload_0         
		//*  14   28:getfield        #18  <Field TextDirectionHeuristicsCompat$TextDirectionAlgorithm mAlgorithm>
		//*  15   31:ifnonnull       39
					return defaultIsRtl();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #31  <Method boolean defaultIsRtl()>
		//   18   38:ireturn         
				else
					return doCheck(charsequence, i, j);
		//   19   39:aload_0         
		//   20   40:aload_1         
		//   21   41:iload_2         
		//   22   42:iload_3         
		//   23   43:invokespecial   #40  <Method boolean doCheck(CharSequence, int, int)>
		//   24   46:ireturn         
			} else
			{
				throw new IllegalArgumentException();
		//   25   47:new             #42  <Class IllegalArgumentException>
		//   26   50:dup             
		//   27   51:invokespecial   #43  <Method void IllegalArgumentException()>
		//   28   54:athrow          
			}
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

		TextDirectionHeuristicImpl(TextDirectionAlgorithm textdirectionalgorithm)
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

	private static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl
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

	private static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl
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

		static final TextDirectionHeuristicLocale INSTANCE = new TextDirectionHeuristicLocale();

		static 
		{
		//    0    0:new             #2   <Class TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale>
		//    1    3:dup             
		//    2    4:invokespecial   #14  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale()>
		//    3    7:putstatic       #16  <Field TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale INSTANCE>
		//*   4   10:return          
		}

		TextDirectionHeuristicLocale()
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
	//	               0 32
	//	               1 30
	//	               2 30
		default:
			return 2;
	//    2   28:iconst_2        
	//    3   29:ireturn         

		case 1: // '\001'
		case 2: // '\002'
			return 0;
	//    4   30:iconst_0        
	//    5   31:ireturn         

		case 0: // '\0'
			return 1;
	//    6   32:iconst_1        
	//    7   33:ireturn         
		}
	}

	static int isRtlTextOrFormat(int i)
	{
		i;
	//    0    0:iload_0         
		JVM INSTR tableswitch 0 2: default 28
	//	               0 64
	//	               1 62
	//	               2 62;
	//    1    1:tableswitch     0 2: default 28
	//	               0 64
	//	               1 62
	//	               2 62
		   goto _L1 _L2 _L3 _L3
_L1:
		i;
	//    2   28:iload_0         
		JVM INSTR tableswitch 14 17: default 60
	//	               14 64
	//	               15 64
	//	               16 62
	//	               17 62;
	//    3   29:tableswitch     14 17: default 60
	//	               14 64
	//	               15 64
	//	               16 62
	//	               17 62
		   goto _L4 _L2 _L2 _L3 _L3
_L4:
		return 2;
	//    4   60:iconst_2        
	//    5   61:ireturn         
_L3:
		return 0;
	//    6   62:iconst_0        
	//    7   63:ireturn         
_L2:
		return 1;
	//    8   64:iconst_1        
	//    9   65:ireturn         
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
