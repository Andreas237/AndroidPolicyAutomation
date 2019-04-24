// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import java.lang.annotation.Annotation;

class ViewBoundsCheck
{
	static class BoundFlags
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

		BoundFlags()
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

	static interface Callback
	{

		public abstract View getChildAt(int i);

		public abstract int getChildCount();

		public abstract int getChildEnd(View view);

		public abstract int getChildStart(View view);

		public abstract View getParent();

		public abstract int getParentEnd();

		public abstract int getParentStart();
	}

	public static interface ViewBounds
		extends Annotation
	{
	}


	ViewBoundsCheck(Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
		mCallback = callback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #61  <Field ViewBoundsCheck$Callback mCallback>
		mBoundFlags = new BoundFlags();
	//    5    9:aload_0         
	//    6   10:new             #6   <Class ViewBoundsCheck$BoundFlags>
	//    7   13:dup             
	//    8   14:invokespecial   #62  <Method void ViewBoundsCheck$BoundFlags()>
	//    9   17:putfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//   10   20:return          
	}

	View findOneViewWithinBoundFlags(int i, int j, int k, int l)
	{
		int i1 = mCallback.getParentStart();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ViewBoundsCheck$Callback mCallback>
	//    2    4:invokeinterface #71  <Method int ViewBoundsCheck$Callback.getParentStart()>
	//    3    9:istore          6
		int j1 = mCallback.getParentEnd();
	//    4   11:aload_0         
	//    5   12:getfield        #61  <Field ViewBoundsCheck$Callback mCallback>
	//    6   15:invokeinterface #74  <Method int ViewBoundsCheck$Callback.getParentEnd()>
	//    7   20:istore          7
		byte byte0;
		View view;
		if(j > i)
	//*   8   22:iload_2         
	//*   9   23:iload_1         
	//*  10   24:icmple          123
			byte0 = 1;
	//   11   27:iconst_1        
	//   12   28:istore          5
		else
	//*  13   30:aconst_null     
	//*  14   31:astore          10
	//*  15   33:iload_1         
	//*  16   34:iload_2         
	//*  17   35:icmpeq          172
	//*  18   38:aload_0         
	//*  19   39:getfield        #61  <Field ViewBoundsCheck$Callback mCallback>
	//*  20   42:iload_1         
	//*  21   43:invokeinterface #78  <Method View ViewBoundsCheck$Callback.getChildAt(int)>
	//*  22   48:astore          11
	//*  23   50:aload_0         
	//*  24   51:getfield        #61  <Field ViewBoundsCheck$Callback mCallback>
	//*  25   54:aload           11
	//*  26   56:invokeinterface #82  <Method int ViewBoundsCheck$Callback.getChildStart(View)>
	//*  27   61:istore          8
	//*  28   63:aload_0         
	//*  29   64:getfield        #61  <Field ViewBoundsCheck$Callback mCallback>
	//*  30   67:aload           11
	//*  31   69:invokeinterface #85  <Method int ViewBoundsCheck$Callback.getChildEnd(View)>
	//*  32   74:istore          9
	//*  33   76:aload_0         
	//*  34   77:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//*  35   80:iload           6
	//*  36   82:iload           7
	//*  37   84:iload           8
	//*  38   86:iload           9
	//*  39   88:invokevirtual   #89  <Method void ViewBoundsCheck$BoundFlags.setBounds(int, int, int, int)>
	//*  40   91:iload_3         
	//*  41   92:ifeq            129
	//*  42   95:aload_0         
	//*  43   96:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//*  44   99:invokevirtual   #92  <Method void ViewBoundsCheck$BoundFlags.resetFlags()>
	//*  45  102:aload_0         
	//*  46  103:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//*  47  106:iload_3         
	//*  48  107:invokevirtual   #96  <Method void ViewBoundsCheck$BoundFlags.addFlags(int)>
	//*  49  110:aload_0         
	//*  50  111:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//*  51  114:invokevirtual   #100 <Method boolean ViewBoundsCheck$BoundFlags.boundsMatch()>
	//*  52  117:ifeq            129
	//*  53  120:aload           11
	//*  54  122:areturn         
			byte0 = -1;
	//   55  123:iconst_m1       
	//   56  124:istore          5
		view = null;
		for(; i != j; i += ((int) (byte0)))
		{
			View view1 = mCallback.getChildAt(i);
			int k1 = mCallback.getChildStart(view1);
			int l1 = mCallback.getChildEnd(view1);
			mBoundFlags.setBounds(i1, j1, k1, l1);
			if(k != 0)
			{
				mBoundFlags.resetFlags();
				mBoundFlags.addFlags(k);
				if(mBoundFlags.boundsMatch())
					return view1;
			}
	//*  57  126:goto            30
			if(l == 0)
				continue;
	//   58  129:iload           4
	//   59  131:ifeq            175
			mBoundFlags.resetFlags();
	//   60  134:aload_0         
	//   61  135:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//   62  138:invokevirtual   #92  <Method void ViewBoundsCheck$BoundFlags.resetFlags()>
			mBoundFlags.addFlags(l);
	//   63  141:aload_0         
	//   64  142:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//   65  145:iload           4
	//   66  147:invokevirtual   #96  <Method void ViewBoundsCheck$BoundFlags.addFlags(int)>
			if(mBoundFlags.boundsMatch())
	//*  67  150:aload_0         
	//*  68  151:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//*  69  154:invokevirtual   #100 <Method boolean ViewBoundsCheck$BoundFlags.boundsMatch()>
	//*  70  157:ifeq            175
				view = view1;
	//   71  160:aload           11
	//   72  162:astore          10
		}

	//   73  164:iload_1         
	//   74  165:iload           5
	//   75  167:iadd            
	//   76  168:istore_1        
	//*  77  169:goto            33
		return view;
	//   78  172:aload           10
	//   79  174:areturn         
	//*  80  175:goto            164
	}

	boolean isViewWithinBoundFlags(View view, int i)
	{
		mBoundFlags.setBounds(mCallback.getParentStart(), mCallback.getParentEnd(), mCallback.getChildStart(view), mCallback.getChildEnd(view));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field ViewBoundsCheck$Callback mCallback>
	//    4    8:invokeinterface #71  <Method int ViewBoundsCheck$Callback.getParentStart()>
	//    5   13:aload_0         
	//    6   14:getfield        #61  <Field ViewBoundsCheck$Callback mCallback>
	//    7   17:invokeinterface #74  <Method int ViewBoundsCheck$Callback.getParentEnd()>
	//    8   22:aload_0         
	//    9   23:getfield        #61  <Field ViewBoundsCheck$Callback mCallback>
	//   10   26:aload_1         
	//   11   27:invokeinterface #82  <Method int ViewBoundsCheck$Callback.getChildStart(View)>
	//   12   32:aload_0         
	//   13   33:getfield        #61  <Field ViewBoundsCheck$Callback mCallback>
	//   14   36:aload_1         
	//   15   37:invokeinterface #85  <Method int ViewBoundsCheck$Callback.getChildEnd(View)>
	//   16   42:invokevirtual   #89  <Method void ViewBoundsCheck$BoundFlags.setBounds(int, int, int, int)>
		if(i != 0)
	//*  17   45:iload_2         
	//*  18   46:ifeq            72
		{
			mBoundFlags.resetFlags();
	//   19   49:aload_0         
	//   20   50:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//   21   53:invokevirtual   #92  <Method void ViewBoundsCheck$BoundFlags.resetFlags()>
			mBoundFlags.addFlags(i);
	//   22   56:aload_0         
	//   23   57:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//   24   60:iload_2         
	//   25   61:invokevirtual   #96  <Method void ViewBoundsCheck$BoundFlags.addFlags(int)>
			return mBoundFlags.boundsMatch();
	//   26   64:aload_0         
	//   27   65:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//   28   68:invokevirtual   #100 <Method boolean ViewBoundsCheck$BoundFlags.boundsMatch()>
	//   29   71:ireturn         
		} else
		{
			return false;
	//   30   72:iconst_0        
	//   31   73:ireturn         
		}
	}

	static final int CVE_PVE_POS = 12;
	static final int CVE_PVS_POS = 8;
	static final int CVS_PVE_POS = 4;
	static final int CVS_PVS_POS = 0;
	static final int EQ = 2;
	static final int FLAG_CVE_EQ_PVE = 8192;
	static final int FLAG_CVE_EQ_PVS = 512;
	static final int FLAG_CVE_GT_PVE = 4096;
	static final int FLAG_CVE_GT_PVS = 256;
	static final int FLAG_CVE_LT_PVE = 16384;
	static final int FLAG_CVE_LT_PVS = 1024;
	static final int FLAG_CVS_EQ_PVE = 32;
	static final int FLAG_CVS_EQ_PVS = 2;
	static final int FLAG_CVS_GT_PVE = 16;
	static final int FLAG_CVS_GT_PVS = 1;
	static final int FLAG_CVS_LT_PVE = 64;
	static final int FLAG_CVS_LT_PVS = 4;
	static final int GT = 1;
	static final int LT = 4;
	static final int MASK = 7;
	BoundFlags mBoundFlags;
	final Callback mCallback;
}
