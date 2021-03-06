// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


class RtlSpacingHelper
{

	RtlSpacingHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mLeft = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field int mLeft>
		mRight = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #24  <Field int mRight>
		mStart = 0x80000000;
	//    8   14:aload_0         
	//    9   15:ldc1            #7   <Int 0x80000000>
	//   10   17:putfield        #26  <Field int mStart>
		mEnd = 0x80000000;
	//   11   20:aload_0         
	//   12   21:ldc1            #7   <Int 0x80000000>
	//   13   23:putfield        #28  <Field int mEnd>
		mExplicitLeft = 0;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #30  <Field int mExplicitLeft>
		mExplicitRight = 0;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #32  <Field int mExplicitRight>
		mIsRtl = false;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #34  <Field boolean mIsRtl>
		mIsRelative = false;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #36  <Field boolean mIsRelative>
	//   26   46:return          
	}

	public int getEnd()
	{
		if(mIsRtl)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean mIsRtl>
	//*   2    4:ifeq            12
			return mLeft;
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field int mLeft>
	//    5   11:ireturn         
		else
			return mRight;
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field int mRight>
	//    8   16:ireturn         
	}

	public int getLeft()
	{
		return mLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int mLeft>
	//    2    4:ireturn         
	}

	public int getRight()
	{
		return mRight;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int mRight>
	//    2    4:ireturn         
	}

	public int getStart()
	{
		if(mIsRtl)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean mIsRtl>
	//*   2    4:ifeq            12
			return mRight;
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field int mRight>
	//    5   11:ireturn         
		else
			return mLeft;
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field int mLeft>
	//    8   16:ireturn         
	}

	public void setAbsolute(int i, int j)
	{
		mIsRelative = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #36  <Field boolean mIsRelative>
		if(i != 0x80000000)
	//*   3    5:iload_1         
	//*   4    6:ldc1            #7   <Int 0x80000000>
	//*   5    8:icmpeq          21
		{
			mExplicitLeft = i;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #30  <Field int mExplicitLeft>
			mLeft = i;
	//    9   16:aload_0         
	//   10   17:iload_1         
	//   11   18:putfield        #22  <Field int mLeft>
		}
		if(j != 0x80000000)
	//*  12   21:iload_2         
	//*  13   22:ldc1            #7   <Int 0x80000000>
	//*  14   24:icmpeq          37
		{
			mExplicitRight = j;
	//   15   27:aload_0         
	//   16   28:iload_2         
	//   17   29:putfield        #32  <Field int mExplicitRight>
			mRight = j;
	//   18   32:aload_0         
	//   19   33:iload_2         
	//   20   34:putfield        #24  <Field int mRight>
		}
	//   21   37:return          
	}

	public void setDirection(boolean flag)
	{
		if(flag == mIsRtl)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #34  <Field boolean mIsRtl>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mIsRtl = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #34  <Field boolean mIsRtl>
		if(mIsRelative)
	//*   8   14:aload_0         
	//*   9   15:getfield        #36  <Field boolean mIsRelative>
	//*  10   18:ifeq            135
		{
			if(flag)
	//*  11   21:iload_1         
	//*  12   22:ifeq            80
			{
				int i;
				if(mEnd != 0x80000000)
	//*  13   25:aload_0         
	//*  14   26:getfield        #28  <Field int mEnd>
	//*  15   29:ldc1            #7   <Int 0x80000000>
	//*  16   31:icmpeq          42
					i = mEnd;
	//   17   34:aload_0         
	//   18   35:getfield        #28  <Field int mEnd>
	//   19   38:istore_2        
				else
	//*  20   39:goto            47
					i = mExplicitLeft;
	//   21   42:aload_0         
	//   22   43:getfield        #30  <Field int mExplicitLeft>
	//   23   46:istore_2        
				mLeft = i;
	//   24   47:aload_0         
	//   25   48:iload_2         
	//   26   49:putfield        #22  <Field int mLeft>
				if(mStart != 0x80000000)
	//*  27   52:aload_0         
	//*  28   53:getfield        #26  <Field int mStart>
	//*  29   56:ldc1            #7   <Int 0x80000000>
	//*  30   58:icmpeq          69
					i = mStart;
	//   31   61:aload_0         
	//   32   62:getfield        #26  <Field int mStart>
	//   33   65:istore_2        
				else
	//*  34   66:goto            74
					i = mExplicitRight;
	//   35   69:aload_0         
	//   36   70:getfield        #32  <Field int mExplicitRight>
	//   37   73:istore_2        
				mRight = i;
	//   38   74:aload_0         
	//   39   75:iload_2         
	//   40   76:putfield        #24  <Field int mRight>
				return;
	//   41   79:return          
			}
			int j;
			if(mStart != 0x80000000)
	//*  42   80:aload_0         
	//*  43   81:getfield        #26  <Field int mStart>
	//*  44   84:ldc1            #7   <Int 0x80000000>
	//*  45   86:icmpeq          97
				j = mStart;
	//   46   89:aload_0         
	//   47   90:getfield        #26  <Field int mStart>
	//   48   93:istore_2        
			else
	//*  49   94:goto            102
				j = mExplicitLeft;
	//   50   97:aload_0         
	//   51   98:getfield        #30  <Field int mExplicitLeft>
	//   52  101:istore_2        
			mLeft = j;
	//   53  102:aload_0         
	//   54  103:iload_2         
	//   55  104:putfield        #22  <Field int mLeft>
			if(mEnd != 0x80000000)
	//*  56  107:aload_0         
	//*  57  108:getfield        #28  <Field int mEnd>
	//*  58  111:ldc1            #7   <Int 0x80000000>
	//*  59  113:icmpeq          124
				j = mEnd;
	//   60  116:aload_0         
	//   61  117:getfield        #28  <Field int mEnd>
	//   62  120:istore_2        
			else
	//*  63  121:goto            129
				j = mExplicitRight;
	//   64  124:aload_0         
	//   65  125:getfield        #32  <Field int mExplicitRight>
	//   66  128:istore_2        
			mRight = j;
	//   67  129:aload_0         
	//   68  130:iload_2         
	//   69  131:putfield        #24  <Field int mRight>
			return;
	//   70  134:return          
		} else
		{
			mLeft = mExplicitLeft;
	//   71  135:aload_0         
	//   72  136:aload_0         
	//   73  137:getfield        #30  <Field int mExplicitLeft>
	//   74  140:putfield        #22  <Field int mLeft>
			mRight = mExplicitRight;
	//   75  143:aload_0         
	//   76  144:aload_0         
	//   77  145:getfield        #32  <Field int mExplicitRight>
	//   78  148:putfield        #24  <Field int mRight>
			return;
	//   79  151:return          
		}
	}

	public void setRelative(int i, int j)
	{
		mStart = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field int mStart>
		mEnd = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #28  <Field int mEnd>
		mIsRelative = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #36  <Field boolean mIsRelative>
		if(mIsRtl)
	//*   9   15:aload_0         
	//*  10   16:getfield        #34  <Field boolean mIsRtl>
	//*  11   19:ifeq            45
		{
			if(j != 0x80000000)
	//*  12   22:iload_2         
	//*  13   23:ldc1            #7   <Int 0x80000000>
	//*  14   25:icmpeq          33
				mLeft = j;
	//   15   28:aload_0         
	//   16   29:iload_2         
	//   17   30:putfield        #22  <Field int mLeft>
			if(i != 0x80000000)
	//*  18   33:iload_1         
	//*  19   34:ldc1            #7   <Int 0x80000000>
	//*  20   36:icmpeq          67
			{
				mRight = i;
	//   21   39:aload_0         
	//   22   40:iload_1         
	//   23   41:putfield        #24  <Field int mRight>
				return;
	//   24   44:return          
			}
		} else
		{
			if(i != 0x80000000)
	//*  25   45:iload_1         
	//*  26   46:ldc1            #7   <Int 0x80000000>
	//*  27   48:icmpeq          56
				mLeft = i;
	//   28   51:aload_0         
	//   29   52:iload_1         
	//   30   53:putfield        #22  <Field int mLeft>
			if(j != 0x80000000)
	//*  31   56:iload_2         
	//*  32   57:ldc1            #7   <Int 0x80000000>
	//*  33   59:icmpeq          67
				mRight = j;
	//   34   62:aload_0         
	//   35   63:iload_2         
	//   36   64:putfield        #24  <Field int mRight>
		}
	//   37   67:return          
	}

	public static final int UNDEFINED = 0x80000000;
	private int mEnd;
	private int mExplicitLeft;
	private int mExplicitRight;
	private boolean mIsRelative;
	private boolean mIsRtl;
	private int mLeft;
	private int mRight;
	private int mStart;
}
