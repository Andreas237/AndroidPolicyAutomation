// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			ViewBoundsCheck

static class ViewBoundsCheck$BoundFlags
{

	void addFlags(int i)
	{
		mBoundFlags = i | mBoundFlags;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field int mBoundFlags>
	//    4    6:ior             
	//    5    7:putfield        #19  <Field int mBoundFlags>
	//    6   10:return          
	}

	boolean boundsMatch()
	{
		int i = mBoundFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int mBoundFlags>
	//    2    4:istore_1        
		if((i & 7) != 0 && (i & compare(mChildStart, mRvStart) << 0) == 0)
	//*   3    5:iload_1         
	//*   4    6:bipush          7
	//*   5    8:iand            
	//*   6    9:ifeq            33
	//*   7   12:iload_1         
	//*   8   13:aload_0         
	//*   9   14:aload_0         
	//*  10   15:getfield        #26  <Field int mChildStart>
	//*  11   18:aload_0         
	//*  12   19:getfield        #28  <Field int mRvStart>
	//*  13   22:invokevirtual   #32  <Method int compare(int, int)>
	//*  14   25:iconst_0        
	//*  15   26:ishl            
	//*  16   27:iand            
	//*  17   28:ifne            33
			return false;
	//   18   31:iconst_0        
	//   19   32:ireturn         
		i = mBoundFlags;
	//   20   33:aload_0         
	//   21   34:getfield        #19  <Field int mBoundFlags>
	//   22   37:istore_1        
		if((i & 0x70) != 0 && (i & compare(mChildStart, mRvEnd) << 4) == 0)
	//*  23   38:iload_1         
	//*  24   39:bipush          112
	//*  25   41:iand            
	//*  26   42:ifeq            66
	//*  27   45:iload_1         
	//*  28   46:aload_0         
	//*  29   47:aload_0         
	//*  30   48:getfield        #26  <Field int mChildStart>
	//*  31   51:aload_0         
	//*  32   52:getfield        #34  <Field int mRvEnd>
	//*  33   55:invokevirtual   #32  <Method int compare(int, int)>
	//*  34   58:iconst_4        
	//*  35   59:ishl            
	//*  36   60:iand            
	//*  37   61:ifne            66
			return false;
	//   38   64:iconst_0        
	//   39   65:ireturn         
		i = mBoundFlags;
	//   40   66:aload_0         
	//   41   67:getfield        #19  <Field int mBoundFlags>
	//   42   70:istore_1        
		if((i & 0x700) != 0 && (i & compare(mChildEnd, mRvStart) << 8) == 0)
	//*  43   71:iload_1         
	//*  44   72:sipush          1792
	//*  45   75:iand            
	//*  46   76:ifeq            101
	//*  47   79:iload_1         
	//*  48   80:aload_0         
	//*  49   81:aload_0         
	//*  50   82:getfield        #36  <Field int mChildEnd>
	//*  51   85:aload_0         
	//*  52   86:getfield        #28  <Field int mRvStart>
	//*  53   89:invokevirtual   #32  <Method int compare(int, int)>
	//*  54   92:bipush          8
	//*  55   94:ishl            
	//*  56   95:iand            
	//*  57   96:ifne            101
			return false;
	//   58   99:iconst_0        
	//   59  100:ireturn         
		i = mBoundFlags;
	//   60  101:aload_0         
	//   61  102:getfield        #19  <Field int mBoundFlags>
	//   62  105:istore_1        
		return (i & 0x7000) == 0 || (i & compare(mChildEnd, mRvEnd) << 12) != 0;
	//   63  106:iload_1         
	//   64  107:sipush          28672
	//   65  110:iand            
	//   66  111:ifeq            136
	//   67  114:iload_1         
	//   68  115:aload_0         
	//   69  116:aload_0         
	//   70  117:getfield        #36  <Field int mChildEnd>
	//   71  120:aload_0         
	//   72  121:getfield        #34  <Field int mRvEnd>
	//   73  124:invokevirtual   #32  <Method int compare(int, int)>
	//   74  127:bipush          12
	//   75  129:ishl            
	//   76  130:iand            
	//   77  131:ifne            136
	//   78  134:iconst_0        
	//   79  135:ireturn         
	//   80  136:iconst_1        
	//   81  137:ireturn         
	}

	int compare(int i, int j)
	{
		if(i > j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmple          7
			return 1;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		return i != j ? 4 : 2;
	//    5    7:iload_1         
	//    6    8:iload_2         
	//    7    9:icmpne          14
	//    8   12:iconst_2        
	//    9   13:ireturn         
	//   10   14:iconst_4        
	//   11   15:ireturn         
	}

	void resetFlags()
	{
		mBoundFlags = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #19  <Field int mBoundFlags>
	//    3    5:return          
	}

	void setBounds(int i, int j, int k, int l)
	{
		mRvStart = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int mRvStart>
		mRvEnd = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #34  <Field int mRvEnd>
		mChildStart = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #26  <Field int mChildStart>
		mChildEnd = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #36  <Field int mChildEnd>
	//   12   21:return          
	}

	void setFlags(int i, int j)
	{
		mBoundFlags = i & j | mBoundFlags & j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iand            
	//    4    4:aload_0         
	//    5    5:getfield        #19  <Field int mBoundFlags>
	//    6    8:iload_2         
	//    7    9:iand            
	//    8   10:ior             
	//    9   11:putfield        #19  <Field int mBoundFlags>
	//   10   14:return          
	}

	int mBoundFlags;
	int mChildEnd;
	int mChildStart;
	int mRvEnd;
	int mRvStart;

	ViewBoundsCheck$BoundFlags()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mBoundFlags = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field int mBoundFlags>
	//    5    9:return          
	}
}
