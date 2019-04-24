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
		if((mBoundFlags & 7) != 0 && (mBoundFlags & compare(mChildStart, mRvStart) << 0) == 0)
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
		if((mBoundFlags & 0x70) != 0 && (mBoundFlags & compare(mChildStart, mRvEnd) << 4) == 0)
	//*  19   34:aload_0         
	//*  20   35:getfield        #19  <Field int mBoundFlags>
	//*  21   38:bipush          112
	//*  22   40:iand            
	//*  23   41:ifeq            68
	//*  24   44:aload_0         
	//*  25   45:getfield        #19  <Field int mBoundFlags>
	//*  26   48:aload_0         
	//*  27   49:aload_0         
	//*  28   50:getfield        #26  <Field int mChildStart>
	//*  29   53:aload_0         
	//*  30   54:getfield        #34  <Field int mRvEnd>
	//*  31   57:invokevirtual   #32  <Method int compare(int, int)>
	//*  32   60:iconst_4        
	//*  33   61:ishl            
	//*  34   62:iand            
	//*  35   63:ifne            68
			return false;
	//   36   66:iconst_0        
	//   37   67:ireturn         
		if((mBoundFlags & 0x700) != 0 && (mBoundFlags & compare(mChildEnd, mRvStart) << 8) == 0)
	//*  38   68:aload_0         
	//*  39   69:getfield        #19  <Field int mBoundFlags>
	//*  40   72:sipush          1792
	//*  41   75:iand            
	//*  42   76:ifeq            104
	//*  43   79:aload_0         
	//*  44   80:getfield        #19  <Field int mBoundFlags>
	//*  45   83:aload_0         
	//*  46   84:aload_0         
	//*  47   85:getfield        #36  <Field int mChildEnd>
	//*  48   88:aload_0         
	//*  49   89:getfield        #28  <Field int mRvStart>
	//*  50   92:invokevirtual   #32  <Method int compare(int, int)>
	//*  51   95:bipush          8
	//*  52   97:ishl            
	//*  53   98:iand            
	//*  54   99:ifne            104
			return false;
	//   55  102:iconst_0        
	//   56  103:ireturn         
		return (mBoundFlags & 0x7000) == 0 || (mBoundFlags & compare(mChildEnd, mRvEnd) << 12) != 0;
	//   57  104:aload_0         
	//   58  105:getfield        #19  <Field int mBoundFlags>
	//   59  108:sipush          28672
	//   60  111:iand            
	//   61  112:ifeq            140
	//   62  115:aload_0         
	//   63  116:getfield        #19  <Field int mBoundFlags>
	//   64  119:aload_0         
	//   65  120:aload_0         
	//   66  121:getfield        #36  <Field int mChildEnd>
	//   67  124:aload_0         
	//   68  125:getfield        #34  <Field int mRvEnd>
	//   69  128:invokevirtual   #32  <Method int compare(int, int)>
	//   70  131:bipush          12
	//   71  133:ishl            
	//   72  134:iand            
	//   73  135:ifne            140
	//   74  138:iconst_0        
	//   75  139:ireturn         
	//   76  140:iconst_1        
	//   77  141:ireturn         
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
		mBoundFlags = i & j | mBoundFlags & ~j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iand            
	//    4    4:aload_0         
	//    5    5:getfield        #19  <Field int mBoundFlags>
	//    6    8:iload_2         
	//    7    9:iconst_m1       
	//    8   10:ixor            
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
