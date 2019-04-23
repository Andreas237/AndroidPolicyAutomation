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
		if(j > i)
	//*   8   22:iload_2         
	//*   9   23:iload_1         
	//*  10   24:icmple          33
			byte0 = 1;
	//   11   27:iconst_1        
	//   12   28:istore          5
		else
	//*  13   30:goto            36
			byte0 = -1;
	//   14   33:iconst_m1       
	//   15   34:istore          5
		View view;
		View view1;
		for(view = null; i != j; view = view1)
	//*  16   36:aconst_null     
	//*  17   37:astore          10
	//*  18   39:iload_1         
	//*  19   40:iload_2         
	//*  20   41:icmpeq          184
		{
			View view2 = mCallback.getChildAt(i);
	//   21   44:aload_0         
	//   22   45:getfield        #61  <Field ViewBoundsCheck$Callback mCallback>
	//   23   48:iload_1         
	//   24   49:invokeinterface #78  <Method View ViewBoundsCheck$Callback.getChildAt(int)>
	//   25   54:astore          12
			int k1 = mCallback.getChildStart(view2);
	//   26   56:aload_0         
	//   27   57:getfield        #61  <Field ViewBoundsCheck$Callback mCallback>
	//   28   60:aload           12
	//   29   62:invokeinterface #82  <Method int ViewBoundsCheck$Callback.getChildStart(View)>
	//   30   67:istore          8
			int l1 = mCallback.getChildEnd(view2);
	//   31   69:aload_0         
	//   32   70:getfield        #61  <Field ViewBoundsCheck$Callback mCallback>
	//   33   73:aload           12
	//   34   75:invokeinterface #85  <Method int ViewBoundsCheck$Callback.getChildEnd(View)>
	//   35   80:istore          9
			mBoundFlags.setBounds(i1, j1, k1, l1);
	//   36   82:aload_0         
	//   37   83:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//   38   86:iload           6
	//   39   88:iload           7
	//   40   90:iload           8
	//   41   92:iload           9
	//   42   94:invokevirtual   #89  <Method void ViewBoundsCheck$BoundFlags.setBounds(int, int, int, int)>
			if(k != 0)
	//*  43   97:iload_3         
	//*  44   98:ifeq            129
			{
				mBoundFlags.resetFlags();
	//   45  101:aload_0         
	//   46  102:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//   47  105:invokevirtual   #92  <Method void ViewBoundsCheck$BoundFlags.resetFlags()>
				mBoundFlags.addFlags(k);
	//   48  108:aload_0         
	//   49  109:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//   50  112:iload_3         
	//   51  113:invokevirtual   #96  <Method void ViewBoundsCheck$BoundFlags.addFlags(int)>
				if(mBoundFlags.boundsMatch())
	//*  52  116:aload_0         
	//*  53  117:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//*  54  120:invokevirtual   #100 <Method boolean ViewBoundsCheck$BoundFlags.boundsMatch()>
	//*  55  123:ifeq            129
					return view2;
	//   56  126:aload           12
	//   57  128:areturn         
			}
			view1 = view;
	//   58  129:aload           10
	//   59  131:astore          11
			if(l != 0)
	//*  60  133:iload           4
	//*  61  135:ifeq            172
			{
				mBoundFlags.resetFlags();
	//   62  138:aload_0         
	//   63  139:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//   64  142:invokevirtual   #92  <Method void ViewBoundsCheck$BoundFlags.resetFlags()>
				mBoundFlags.addFlags(l);
	//   65  145:aload_0         
	//   66  146:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//   67  149:iload           4
	//   68  151:invokevirtual   #96  <Method void ViewBoundsCheck$BoundFlags.addFlags(int)>
				view1 = view;
	//   69  154:aload           10
	//   70  156:astore          11
				if(mBoundFlags.boundsMatch())
	//*  71  158:aload_0         
	//*  72  159:getfield        #64  <Field ViewBoundsCheck$BoundFlags mBoundFlags>
	//*  73  162:invokevirtual   #100 <Method boolean ViewBoundsCheck$BoundFlags.boundsMatch()>
	//*  74  165:ifeq            172
					view1 = view2;
	//   75  168:aload           12
	//   76  170:astore          11
			}
			i += ((int) (byte0));
	//   77  172:iload_1         
	//   78  173:iload           5
	//   79  175:iadd            
	//   80  176:istore_1        
		}

	//   81  177:aload           11
	//   82  179:astore          10
	//*  83  181:goto            39
		return view;
	//   84  184:aload           10
	//   85  186:areturn         
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
