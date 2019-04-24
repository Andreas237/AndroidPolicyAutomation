// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;


// Referenced classes of package android.support.v4.text:
//			TextDirectionHeuristicsCompat

private static class TextDirectionHeuristicsCompat$AnyStrong
	implements ionAlgorithm
{

	public int checkRtl(CharSequence charsequence, int i, int j)
	{
		int k;
		int l;
		boolean flag;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		k = 0;
	//    2    3:iconst_0        
	//    3    4:istore          4
		l = i;
	//    4    6:iload_2         
	//    5    7:istore          5
_L6:
		if(l >= i + j) goto _L2; else goto _L1
	//    6    9:iload           5
	//    7   11:iload_2         
	//    8   12:iload_3         
	//    9   13:iadd            
	//   10   14:icmpge          97
_L1:
		TextDirectionHeuristicsCompat.isRtlText(((int) (Character.getDirectionality(charsequence.charAt(l)))));
	//   11   17:aload_1         
	//   12   18:iload           5
	//   13   20:invokeinterface #37  <Method char CharSequence.charAt(int)>
	//   14   25:invokestatic    #43  <Method byte Character.getDirectionality(char)>
	//   15   28:invokestatic    #47  <Method int TextDirectionHeuristicsCompat.isRtlText(int)>
		JVM INSTR tableswitch 0 1: default 52
	//	               0 61
	//	               1 80;
	//   16   31:tableswitch     0 1: default 52
	//	               0 61
	//	               1 80
		   goto _L3 _L4 _L5
_L3:
		l++;
	//   17   52:iload           5
	//   18   54:iconst_1        
	//   19   55:iadd            
	//   20   56:istore          5
		  goto _L6
	//*  21   58:goto            9
_L4:
		if(!mLookForRtl) goto _L8; else goto _L7
	//   22   61:aload_0         
	//   23   62:getfield        #29  <Field boolean mLookForRtl>
	//   24   65:ifeq            74
_L7:
		k = 0;
	//   25   68:iconst_0        
	//   26   69:istore          4
_L10:
		return k;
	//   27   71:iload           4
	//   28   73:ireturn         
_L8:
		k = 1;
	//   29   74:iconst_1        
	//   30   75:istore          4
		  goto _L3
	//*  31   77:goto            52
_L5:
		k = ((int) (flag));
	//   32   80:iload           6
	//   33   82:istore          4
		if(!mLookForRtl) goto _L10; else goto _L9
	//   34   84:aload_0         
	//   35   85:getfield        #29  <Field boolean mLookForRtl>
	//   36   88:ifeq            71
_L9:
		k = 1;
	//   37   91:iconst_1        
	//   38   92:istore          4
		  goto _L3
	//*  39   94:goto            52
_L2:
		if(k == 0) goto _L12; else goto _L11
	//   40   97:iload           4
	//   41   99:ifeq            115
_L11:
		k = ((int) (flag));
	//   42  102:iload           6
	//   43  104:istore          4
		if(!mLookForRtl)
	//*  44  106:aload_0         
	//*  45  107:getfield        #29  <Field boolean mLookForRtl>
	//*  46  110:ifne            71
			return 0;
	//   47  113:iconst_0        
	//   48  114:ireturn         
		  goto _L10
_L12:
		return 2;
	//   49  115:iconst_2        
	//   50  116:ireturn         
		  goto _L3
	}

	public static final TextDirectionHeuristicsCompat$AnyStrong INSTANCE_LTR = new TextDirectionHeuristicsCompat$AnyStrong(false);
	public static final TextDirectionHeuristicsCompat$AnyStrong INSTANCE_RTL = new TextDirectionHeuristicsCompat$AnyStrong(true);
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

	private TextDirectionHeuristicsCompat$AnyStrong(boolean flag)
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
