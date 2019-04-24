// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;


// Referenced classes of package android.support.v4.text:
//			TextDirectionHeuristicsCompat

static class TextDirectionHeuristicsCompat$AnyStrong
	implements ionAlgorithm
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
	//	               0: 59
	//	               1: 74
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
