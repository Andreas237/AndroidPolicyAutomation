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
		mBoundFlags = mBoundFlags | i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field int mBoundFlags>
	//    3    5:iload_1         
	//    4    6:ior             
	//    5    7:putfield        #19  <Field int mBoundFlags>
	//    6   10:return          
	}

	boolean boundsMatch()
	{
		while((mBoundFlags & 7) != 0 && (mBoundFlags & compare(mChildStart, mRvStart) << 0) == 0 || (mBoundFlags & 0x70) != 0 && (mBoundFlags & compare(mChildStart, mRvEnd) << 4) == 0 || (mBoundFlags & 0x700) != 0 && (mBoundFlags & compare(mChildEnd, mRvStart) << 8) == 0 || (mBoundFlags & 0x7000) != 0 && (mBoundFlags & compare(mChildEnd, mRvEnd) << 12) == 0) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field int mBoundFlags>
	//*   2    4:bipush          7
	//*   3    6:iand            
	//*   4    7:ifeq            34
	//*   5   10:aload_0         
	//*   6   11:getfield        #19  <Field int mBoundFlags>
	//*   7   14:aload_0         
	//*   8   15:aload_0         
	//*   9   16:getfield        #26  <Field int mChildStart>
	//*  10   19:aload_0         
	//*  11   20:getfield        #28  <Field int mRvStart>
	//*  12   23:invokevirtual   #32  <Method int compare(int, int)>
	//*  13   26:iconst_0        
	//*  14   27:ishl            
	//*  15   28:iand            
	//*  16   29:ifne            34
			return false;
	//   17   32:iconst_0        
	//   18   33:ireturn         
	//   19   34:aload_0         
	//   20   35:getfield        #19  <Field int mBoundFlags>
	//   21   38:bipush          112
	//   22   40:iand            
	//   23   41:ifeq            66
	//   24   44:aload_0         
	//   25   45:getfield        #19  <Field int mBoundFlags>
	//   26   48:aload_0         
	//   27   49:aload_0         
	//   28   50:getfield        #26  <Field int mChildStart>
	//   29   53:aload_0         
	//   30   54:getfield        #34  <Field int mRvEnd>
	//   31   57:invokevirtual   #32  <Method int compare(int, int)>
	//   32   60:iconst_4        
	//   33   61:ishl            
	//   34   62:iand            
	//   35   63:ifeq            32
	//   36   66:aload_0         
	//   37   67:getfield        #19  <Field int mBoundFlags>
	//   38   70:sipush          1792
	//   39   73:iand            
	//   40   74:ifeq            100
	//   41   77:aload_0         
	//   42   78:getfield        #19  <Field int mBoundFlags>
	//   43   81:aload_0         
	//   44   82:aload_0         
	//   45   83:getfield        #36  <Field int mChildEnd>
	//   46   86:aload_0         
	//   47   87:getfield        #28  <Field int mRvStart>
	//   48   90:invokevirtual   #32  <Method int compare(int, int)>
	//   49   93:bipush          8
	//   50   95:ishl            
	//   51   96:iand            
	//   52   97:ifeq            32
	//   53  100:aload_0         
	//   54  101:getfield        #19  <Field int mBoundFlags>
	//   55  104:sipush          28672
	//   56  107:iand            
	//   57  108:ifeq            134
	//   58  111:aload_0         
	//   59  112:getfield        #19  <Field int mBoundFlags>
	//   60  115:aload_0         
	//   61  116:aload_0         
	//   62  117:getfield        #36  <Field int mChildEnd>
	//   63  120:aload_0         
	//   64  121:getfield        #34  <Field int mRvEnd>
	//   65  124:invokevirtual   #32  <Method int compare(int, int)>
	//   66  127:bipush          12
	//   67  129:ishl            
	//   68  130:iand            
	//   69  131:ifeq            32
		return true;
	//   70  134:iconst_1        
	//   71  135:ireturn         
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
		mBoundFlags = mBoundFlags & ~j | i & j;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field int mBoundFlags>
	//    3    5:iload_2         
	//    4    6:iconst_m1       
	//    5    7:ixor            
	//    6    8:iand            
	//    7    9:iload_1         
	//    8   10:iload_2         
	//    9   11:iand            
	//   10   12:ior             
	//   11   13:putfield        #19  <Field int mBoundFlags>
	//   12   16:return          
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
