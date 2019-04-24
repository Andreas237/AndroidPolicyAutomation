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
		boolean flag;
		boolean flag1;
		flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		flag = false;
	//    2    3:iconst_0        
	//    3    4:istore          5
		k = i;
	//    4    6:iload_2         
	//    5    7:istore          4
_L6:
		int l = k;
	//    6    9:iload           4
	//    7   11:istore          7
		if(l >= i + j) goto _L2; else goto _L1
	//    8   13:iload           7
	//    9   15:iload_2         
	//   10   16:iload_3         
	//   11   17:iadd            
	//   12   18:icmpge          113
_L1:
		TextDirectionHeuristicsCompat.isRtlText(((int) (Character.getDirectionality(charsequence.charAt(l)))));
	//   13   21:aload_1         
	//   14   22:iload           7
	//   15   24:invokeinterface #37  <Method char CharSequence.charAt(int)>
	//   16   29:invokestatic    #43  <Method byte Character.getDirectionality(char)>
	//   17   32:invokestatic    #47  <Method int TextDirectionHeuristicsCompat.isRtlText(int)>
		JVM INSTR tableswitch 0 1: default 56
	//	               0 77
	//	               1 96;
	//   18   35:tableswitch     0 1: default 56
	//	               0 77
	//	               1 96
		   goto _L3 _L4 _L5
_L3:
		k = ((int) (flag));
	//   19   56:iload           5
	//   20   58:istore          4
_L9:
		l++;
	//   21   60:iload           7
	//   22   62:iconst_1        
	//   23   63:iadd            
	//   24   64:istore          7
		flag = ((boolean) (k));
	//   25   66:iload           4
	//   26   68:istore          5
		k = l;
	//   27   70:iload           7
	//   28   72:istore          4
		  goto _L6
	//*  29   74:goto            9
_L4:
		if(!mLookForRtl) goto _L8; else goto _L7
	//   30   77:aload_0         
	//   31   78:getfield        #29  <Field boolean mLookForRtl>
	//   32   81:ifeq            90
_L7:
		k = 0;
	//   33   84:iconst_0        
	//   34   85:istore          4
_L11:
		return k;
	//   35   87:iload           4
	//   36   89:ireturn         
_L8:
		k = 1;
	//   37   90:iconst_1        
	//   38   91:istore          4
		  goto _L9
	//*  39   93:goto            60
_L5:
		k = ((int) (flag1));
	//   40   96:iload           6
	//   41   98:istore          4
		if(!mLookForRtl) goto _L11; else goto _L10
	//   42  100:aload_0         
	//   43  101:getfield        #29  <Field boolean mLookForRtl>
	//   44  104:ifeq            87
_L10:
		k = 1;
	//   45  107:iconst_1        
	//   46  108:istore          4
		  goto _L9
	//*  47  110:goto            60
_L2:
		if(!flag) goto _L13; else goto _L12
	//   48  113:iload           5
	//   49  115:ifeq            131
_L12:
		k = ((int) (flag1));
	//   50  118:iload           6
	//   51  120:istore          4
		if(!mLookForRtl)
	//*  52  122:aload_0         
	//*  53  123:getfield        #29  <Field boolean mLookForRtl>
	//*  54  126:ifne            87
			return 0;
	//   55  129:iconst_0        
	//   56  130:ireturn         
		  goto _L11
_L13:
		return 2;
	//   57  131:iconst_2        
	//   58  132:ireturn         
		  goto _L9
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
