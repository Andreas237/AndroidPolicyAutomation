// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.*;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.*;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView, ViewBoundsCheck, ViewInfoStore, ChildHelper

public static abstract class RecyclerView$LayoutManager
{
	public static interface LayoutPrefetchRegistry
	{

		public abstract void addPosition(int i, int j);
	}

	public static class Properties
	{

		public int orientation;
		public boolean reverseLayout;
		public int spanCount;
		public boolean stackFromEnd;

		public Properties()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}


	private void addViewInt(View view, int i, boolean flag)
	{
		RecyclerView.ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore          6
		if(flag || viewholder.isRemoved())
	//*   3    6:iload_3         
	//*   4    7:ifne            18
	//*   5   10:aload           6
	//*   6   12:invokevirtual   #93  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*   7   15:ifeq            33
			mRecyclerView.mViewInfoStore.addToDisappearedInLayout(viewholder);
	//    8   18:aload_0         
	//    9   19:getfield        #95  <Field RecyclerView mRecyclerView>
	//   10   22:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   11   25:aload           6
	//   12   27:invokevirtual   #105 <Method void ViewInfoStore.addToDisappearedInLayout(RecyclerView$ViewHolder)>
		else
	//*  13   30:goto            45
			mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(viewholder);
	//   14   33:aload_0         
	//   15   34:getfield        #95  <Field RecyclerView mRecyclerView>
	//   16   37:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   17   40:aload           6
	//   18   42:invokevirtual   #108 <Method void ViewInfoStore.removeFromDisappearedInLayout(RecyclerView$ViewHolder)>
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//   19   45:aload_1         
	//   20   46:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   21   49:checkcast       #116 <Class RecyclerView$LayoutParams>
	//   22   52:astore          7
		if(viewholder.wasReturnedFromScrap() || viewholder.isScrap())
	//*  23   54:aload           6
	//*  24   56:invokevirtual   #119 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  25   59:ifne            70
	//*  26   62:aload           6
	//*  27   64:invokevirtual   #122 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*  28   67:ifeq            108
		{
			if(viewholder.isScrap())
	//*  29   70:aload           6
	//*  30   72:invokevirtual   #122 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*  31   75:ifeq            86
				viewholder.unScrap();
	//   32   78:aload           6
	//   33   80:invokevirtual   #125 <Method void RecyclerView$ViewHolder.unScrap()>
			else
	//*  34   83:goto            91
				viewholder.clearReturnedFromScrapFlag();
	//   35   86:aload           6
	//   36   88:invokevirtual   #128 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
			mChildHelper.attachViewToParent(view, i, view.getLayoutParams(), false);
	//   37   91:aload_0         
	//   38   92:getfield        #130 <Field ChildHelper mChildHelper>
	//   39   95:aload_1         
	//   40   96:iload_2         
	//   41   97:aload_1         
	//   42   98:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   43  101:iconst_0        
	//   44  102:invokevirtual   #136 <Method void ChildHelper.attachViewToParent(View, int, android.view.ViewGroup$LayoutParams, boolean)>
		} else
	//*  45  105:goto            251
		if(view.getParent() == mRecyclerView)
	//*  46  108:aload_1         
	//*  47  109:invokevirtual   #140 <Method android.view.ViewParent View.getParent()>
	//*  48  112:aload_0         
	//*  49  113:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  50  116:if_acmpne       210
		{
			int k = mChildHelper.indexOfChild(view);
	//   51  119:aload_0         
	//   52  120:getfield        #130 <Field ChildHelper mChildHelper>
	//   53  123:aload_1         
	//   54  124:invokevirtual   #144 <Method int ChildHelper.indexOfChild(View)>
	//   55  127:istore          5
			int j = i;
	//   56  129:iload_2         
	//   57  130:istore          4
			if(i == -1)
	//*  58  132:iload_2         
	//*  59  133:iconst_m1       
	//*  60  134:icmpne          146
				j = mChildHelper.getChildCount();
	//   61  137:aload_0         
	//   62  138:getfield        #130 <Field ChildHelper mChildHelper>
	//   63  141:invokevirtual   #148 <Method int ChildHelper.getChildCount()>
	//   64  144:istore          4
			if(k == -1)
	//*  65  146:iload           5
	//*  66  148:iconst_m1       
	//*  67  149:icmpne          186
				throw new IllegalStateException((new StringBuilder()).append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:").append(mRecyclerView.indexOfChild(view)).toString());
	//   68  152:new             #150 <Class IllegalStateException>
	//   69  155:dup             
	//   70  156:new             #152 <Class StringBuilder>
	//   71  159:dup             
	//   72  160:invokespecial   #153 <Method void StringBuilder()>
	//   73  163:ldc1            #155 <String "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:">
	//   74  165:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   75  168:aload_0         
	//   76  169:getfield        #95  <Field RecyclerView mRecyclerView>
	//   77  172:aload_1         
	//   78  173:invokevirtual   #160 <Method int RecyclerView.indexOfChild(View)>
	//   79  176:invokevirtual   #163 <Method StringBuilder StringBuilder.append(int)>
	//   80  179:invokevirtual   #167 <Method String StringBuilder.toString()>
	//   81  182:invokespecial   #170 <Method void IllegalStateException(String)>
	//   82  185:athrow          
			if(k != j)
	//*  83  186:iload           5
	//*  84  188:iload           4
	//*  85  190:icmpeq          207
				mRecyclerView.mLayout.moveView(k, j);
	//   86  193:aload_0         
	//   87  194:getfield        #95  <Field RecyclerView mRecyclerView>
	//   88  197:getfield        #174 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   89  200:iload           5
	//   90  202:iload           4
	//   91  204:invokevirtual   #178 <Method void moveView(int, int)>
		} else
	//*  92  207:goto            251
		{
			mChildHelper.addView(view, i, false);
	//   93  210:aload_0         
	//   94  211:getfield        #130 <Field ChildHelper mChildHelper>
	//   95  214:aload_1         
	//   96  215:iload_2         
	//   97  216:iconst_0        
	//   98  217:invokevirtual   #181 <Method void ChildHelper.addView(View, int, boolean)>
			layoutparams.mInsetsDirty = true;
	//   99  220:aload           7
	//  100  222:iconst_1        
	//  101  223:putfield        #184 <Field boolean RecyclerView$LayoutParams.mInsetsDirty>
			if(mSmoothScroller != null && mSmoothScroller.isRunning())
	//* 102  226:aload_0         
	//* 103  227:getfield        #186 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//* 104  230:ifnull          251
	//* 105  233:aload_0         
	//* 106  234:getfield        #186 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//* 107  237:invokevirtual   #191 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//* 108  240:ifeq            251
				mSmoothScroller.onChildAttachedToWindow(view);
	//  109  243:aload_0         
	//  110  244:getfield        #186 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//  111  247:aload_1         
	//  112  248:invokevirtual   #195 <Method void RecyclerView$SmoothScroller.onChildAttachedToWindow(View)>
		}
		if(layoutparams.mPendingInvalidate)
	//* 113  251:aload           7
	//* 114  253:getfield        #198 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
	//* 115  256:ifeq            273
		{
			viewholder.itemView.invalidate();
	//  116  259:aload           6
	//  117  261:getfield        #202 <Field View RecyclerView$ViewHolder.itemView>
	//  118  264:invokevirtual   #205 <Method void View.invalidate()>
			layoutparams.mPendingInvalidate = false;
	//  119  267:aload           7
	//  120  269:iconst_0        
	//  121  270:putfield        #198 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
		}
	//  122  273:return          
	}

	public static int chooseSize(int i, int j, int k)
	{
		int l = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #213 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		i = android.view.View.MeasureSpec.getSize(i);
	//    3    5:iload_0         
	//    4    6:invokestatic    #216 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_0        
		switch(l)
	//*   6   10:iload_3         
		{
	//*   7   11:lookupswitch    3: default 44
	//	               -2147483648: 49
	//	               0: 59
	//	               1073741824: 47
	//*   8   44:goto            59
		case 1073741824: 
			return i;
	//    9   47:iload_0         
	//   10   48:ireturn         

		case -2147483648: 
			return Math.min(i, Math.max(j, k));
	//   11   49:iload_0         
	//   12   50:iload_1         
	//   13   51:iload_2         
	//   14   52:invokestatic    #222 <Method int Math.max(int, int)>
	//   15   55:invokestatic    #225 <Method int Math.min(int, int)>
	//   16   58:ireturn         
		}
		return Math.max(j, k);
	//   17   59:iload_1         
	//   18   60:iload_2         
	//   19   61:invokestatic    #222 <Method int Math.max(int, int)>
	//   20   64:ireturn         
	}

	private void detachViewInternal(int i, View view)
	{
		mChildHelper.detachViewFromParent(i);
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field ChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #231 <Method void ChildHelper.detachViewFromParent(int)>
	//    4    8:return          
	}

	public static int getChildMeasureSpec(int i, int j, int k, int l, boolean flag)
	{
		int i1 = Math.max(0, i - k);
	//    0    0:iconst_0        
	//    1    1:iload_0         
	//    2    2:iload_2         
	//    3    3:isub            
	//    4    4:invokestatic    #222 <Method int Math.max(int, int)>
	//    5    7:istore          5
		boolean flag2 = false;
	//    6    9:iconst_0        
	//    7   10:istore          7
		k = 0;
	//    8   12:iconst_0        
	//    9   13:istore_2        
		boolean flag1 = false;
	//   10   14:iconst_0        
	//   11   15:istore          6
		i = 0;
	//   12   17:iconst_0        
	//   13   18:istore_0        
		if(flag)
	//*  14   19:iload           4
	//*  15   21:ifeq            113
		{
			if(l >= 0)
	//*  16   24:iload_3         
	//*  17   25:iflt            36
			{
				k = l;
	//   18   28:iload_3         
	//   19   29:istore_2        
				i = 0x40000000;
	//   20   30:ldc1            #234 <Int 0x40000000>
	//   21   32:istore_0        
			} else
	//*  22   33:goto            173
			if(l == -1)
	//*  23   36:iload_3         
	//*  24   37:iconst_m1       
	//*  25   38:icmpne          94
			{
				switch(j)
	//*  26   41:iload_1         
				{
	//*  27   42:lookupswitch    3: default 76
	//	               -2147483648: 79
	//	               0: 87
	//	               1073741824: 79
	//*  28   76:goto            91
				case -2147483648: 
				case 1073741824: 
					k = i1;
	//   29   79:iload           5
	//   30   81:istore_2        
					i = j;
	//   31   82:iload_1         
	//   32   83:istore_0        
					break;

	//*  33   84:goto            91
				case 0: // '\0'
					k = 0;
	//   34   87:iconst_0        
	//   35   88:istore_2        
					i = 0;
	//   36   89:iconst_0        
	//   37   90:istore_0        
					break;
				}
			} else
	//*  38   91:goto            173
			{
				k = ((int) (flag2));
	//   39   94:iload           7
	//   40   96:istore_2        
				i = ((int) (flag1));
	//   41   97:iload           6
	//   42   99:istore_0        
				if(l == -2)
	//*  43  100:iload_3         
	//*  44  101:bipush          -2
	//*  45  103:icmpne          173
				{
					k = 0;
	//   46  106:iconst_0        
	//   47  107:istore_2        
					i = 0;
	//   48  108:iconst_0        
	//   49  109:istore_0        
				}
			}
		} else
	//*  50  110:goto            173
		if(l >= 0)
	//*  51  113:iload_3         
	//*  52  114:iflt            125
		{
			k = l;
	//   53  117:iload_3         
	//   54  118:istore_2        
			i = 0x40000000;
	//   55  119:ldc1            #234 <Int 0x40000000>
	//   56  121:istore_0        
		} else
	//*  57  122:goto            173
		if(l == -1)
	//*  58  125:iload_3         
	//*  59  126:iconst_m1       
	//*  60  127:icmpne          138
		{
			k = i1;
	//   61  130:iload           5
	//   62  132:istore_2        
			i = j;
	//   63  133:iload_1         
	//   64  134:istore_0        
		} else
	//*  65  135:goto            173
		{
			k = ((int) (flag2));
	//   66  138:iload           7
	//   67  140:istore_2        
			i = ((int) (flag1));
	//   68  141:iload           6
	//   69  143:istore_0        
			if(l == -2)
	//*  70  144:iload_3         
	//*  71  145:bipush          -2
	//*  72  147:icmpne          173
			{
				k = i1;
	//   73  150:iload           5
	//   74  152:istore_2        
				if(j == 0x80000000 || j == 0x40000000)
	//*  75  153:iload_1         
	//*  76  154:ldc1            #235 <Int 0x80000000>
	//*  77  156:icmpeq          165
	//*  78  159:iload_1         
	//*  79  160:ldc1            #234 <Int 0x40000000>
	//*  80  162:icmpne          171
					i = 0x80000000;
	//   81  165:ldc1            #235 <Int 0x80000000>
	//   82  167:istore_0        
				else
	//*  83  168:goto            173
					i = 0;
	//   84  171:iconst_0        
	//   85  172:istore_0        
			}
		}
		return android.view.View.MeasureSpec.makeMeasureSpec(k, i);
	//   86  173:iload_2         
	//   87  174:iload_0         
	//   88  175:invokestatic    #238 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   89  178:ireturn         
	}

	public static int getChildMeasureSpec(int i, int j, int k, boolean flag)
	{
		int l = Math.max(0, i - j);
	//    0    0:iconst_0        
	//    1    1:iload_0         
	//    2    2:iload_1         
	//    3    3:isub            
	//    4    4:invokestatic    #222 <Method int Math.max(int, int)>
	//    5    7:istore          4
		i = 0;
	//    6    9:iconst_0        
	//    7   10:istore_0        
		j = 0;
	//    8   11:iconst_0        
	//    9   12:istore_1        
		if(flag)
	//*  10   13:iload_3         
	//*  11   14:ifeq            36
		{
			if(k >= 0)
	//*  12   17:iload_2         
	//*  13   18:iflt            29
			{
				i = k;
	//   14   21:iload_2         
	//   15   22:istore_0        
				j = 0x40000000;
	//   16   23:ldc1            #234 <Int 0x40000000>
	//   17   25:istore_1        
			} else
	//*  18   26:goto            74
			{
				i = 0;
	//   19   29:iconst_0        
	//   20   30:istore_0        
				j = 0;
	//   21   31:iconst_0        
	//   22   32:istore_1        
			}
		} else
	//*  23   33:goto            74
		if(k >= 0)
	//*  24   36:iload_2         
	//*  25   37:iflt            48
		{
			i = k;
	//   26   40:iload_2         
	//   27   41:istore_0        
			j = 0x40000000;
	//   28   42:ldc1            #234 <Int 0x40000000>
	//   29   44:istore_1        
		} else
	//*  30   45:goto            74
		if(k == -1)
	//*  31   48:iload_2         
	//*  32   49:iconst_m1       
	//*  33   50:icmpne          62
		{
			i = l;
	//   34   53:iload           4
	//   35   55:istore_0        
			j = 0x40000000;
	//   36   56:ldc1            #234 <Int 0x40000000>
	//   37   58:istore_1        
		} else
	//*  38   59:goto            74
		if(k == -2)
	//*  39   62:iload_2         
	//*  40   63:bipush          -2
	//*  41   65:icmpne          74
		{
			i = l;
	//   42   68:iload           4
	//   43   70:istore_0        
			j = 0x80000000;
	//   44   71:ldc1            #235 <Int 0x80000000>
	//   45   73:istore_1        
		}
		return android.view.View.MeasureSpec.makeMeasureSpec(i, j);
	//   46   74:iload_0         
	//   47   75:iload_1         
	//   48   76:invokestatic    #238 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   49   79:ireturn         
	}

	private int[] getChildRectangleOnScreenScrollAmount(RecyclerView recyclerview, View view, Rect rect, boolean flag)
	{
		int k1 = getPaddingLeft();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #246 <Method int getPaddingLeft()>
	//    2    4:istore          11
		int l = getPaddingTop();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #249 <Method int getPaddingTop()>
	//    5   10:istore          8
		int l1 = getWidth() - getPaddingRight();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #252 <Method int getWidth()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #255 <Method int getPaddingRight()>
	//   10   20:isub            
	//   11   21:istore          12
		int j1 = getHeight();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #258 <Method int getHeight()>
	//   14   27:istore          10
		int k2 = getPaddingBottom();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #261 <Method int getPaddingBottom()>
	//   17   33:istore          15
		int i2 = (view.getLeft() + rect.left) - view.getScrollX();
	//   18   35:aload_2         
	//   19   36:invokevirtual   #264 <Method int View.getLeft()>
	//   20   39:aload_3         
	//   21   40:getfield        #269 <Field int Rect.left>
	//   22   43:iadd            
	//   23   44:aload_2         
	//   24   45:invokevirtual   #272 <Method int View.getScrollX()>
	//   25   48:isub            
	//   26   49:istore          13
		int i1 = (view.getTop() + rect.top) - view.getScrollY();
	//   27   51:aload_2         
	//   28   52:invokevirtual   #275 <Method int View.getTop()>
	//   29   55:aload_3         
	//   30   56:getfield        #278 <Field int Rect.top>
	//   31   59:iadd            
	//   32   60:aload_2         
	//   33   61:invokevirtual   #281 <Method int View.getScrollY()>
	//   34   64:isub            
	//   35   65:istore          9
		int j2 = i2 + rect.width();
	//   36   67:iload           13
	//   37   69:aload_3         
	//   38   70:invokevirtual   #284 <Method int Rect.width()>
	//   39   73:iadd            
	//   40   74:istore          14
		int l2 = rect.height();
	//   41   76:aload_3         
	//   42   77:invokevirtual   #287 <Method int Rect.height()>
	//   43   80:istore          16
		int i = Math.min(0, i2 - k1);
	//   44   82:iconst_0        
	//   45   83:iload           13
	//   46   85:iload           11
	//   47   87:isub            
	//   48   88:invokestatic    #225 <Method int Math.min(int, int)>
	//   49   91:istore          5
		int j = Math.min(0, i1 - l);
	//   50   93:iconst_0        
	//   51   94:iload           9
	//   52   96:iload           8
	//   53   98:isub            
	//   54   99:invokestatic    #225 <Method int Math.min(int, int)>
	//   55  102:istore          6
		int k = Math.max(0, j2 - l1);
	//   56  104:iconst_0        
	//   57  105:iload           14
	//   58  107:iload           12
	//   59  109:isub            
	//   60  110:invokestatic    #222 <Method int Math.max(int, int)>
	//   61  113:istore          7
		j1 = Math.max(0, (i1 + l2) - (j1 - k2));
	//   62  115:iconst_0        
	//   63  116:iload           9
	//   64  118:iload           16
	//   65  120:iadd            
	//   66  121:iload           10
	//   67  123:iload           15
	//   68  125:isub            
	//   69  126:isub            
	//   70  127:invokestatic    #222 <Method int Math.max(int, int)>
	//   71  130:istore          10
		if(getLayoutDirection() == 1)
	//*  72  132:aload_0         
	//*  73  133:invokevirtual   #290 <Method int getLayoutDirection()>
	//*  74  136:iconst_1        
	//*  75  137:icmpne          167
		{
			if(k != 0)
	//*  76  140:iload           7
	//*  77  142:ifeq            152
				i = k;
	//   78  145:iload           7
	//   79  147:istore          5
			else
	//*  80  149:goto            164
				i = Math.max(i, j2 - l1);
	//   81  152:iload           5
	//   82  154:iload           14
	//   83  156:iload           12
	//   84  158:isub            
	//   85  159:invokestatic    #222 <Method int Math.max(int, int)>
	//   86  162:istore          5
		} else
	//*  87  164:goto            187
		if(i == 0)
	//*  88  167:iload           5
	//*  89  169:ifeq            175
	//*  90  172:goto            187
			i = Math.min(i2 - k1, k);
	//   91  175:iload           13
	//   92  177:iload           11
	//   93  179:isub            
	//   94  180:iload           7
	//   95  182:invokestatic    #225 <Method int Math.min(int, int)>
	//   96  185:istore          5
		if(j == 0)
	//*  97  187:iload           6
	//*  98  189:ifeq            195
	//*  99  192:goto            207
			j = Math.min(i1 - l, j1);
	//  100  195:iload           9
	//  101  197:iload           8
	//  102  199:isub            
	//  103  200:iload           10
	//  104  202:invokestatic    #225 <Method int Math.min(int, int)>
	//  105  205:istore          6
		return (new int[] {
			i, j
		});
	//  106  207:iconst_2        
	//  107  208:newarray        int[]
	//  108  210:dup             
	//  109  211:iconst_0        
	//  110  212:iload           5
	//  111  214:iastore         
	//  112  215:dup             
	//  113  216:iconst_1        
	//  114  217:iload           6
	//  115  219:iastore         
	//  116  220:areturn         
	}

	public static Properties getProperties(Context context, AttributeSet attributeset, int i, int j)
	{
		Properties properties = new Properties();
	//    0    0:new             #16  <Class RecyclerView$LayoutManager$Properties>
	//    1    3:dup             
	//    2    4:invokespecial   #293 <Method void RecyclerView$LayoutManager$Properties()>
	//    3    7:astore          4
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.recyclerview.R.styleable.RecyclerView, i, j)));
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:getstatic       #299 <Field int[] android.support.v7.recyclerview.R$styleable.RecyclerView>
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokevirtual   #305 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   10   19:astore_0        
		properties.orientation = ((TypedArray) (context)).getInt(android.support.v7.recyclerview.R.styleable.RecyclerView_android_orientation, 1);
	//   11   20:aload           4
	//   12   22:aload_0         
	//   13   23:getstatic       #308 <Field int android.support.v7.recyclerview.R$styleable.RecyclerView_android_orientation>
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #313 <Method int TypedArray.getInt(int, int)>
	//   16   30:putfield        #316 <Field int RecyclerView$LayoutManager$Properties.orientation>
		properties.spanCount = ((TypedArray) (context)).getInt(android.support.v7.recyclerview.R.styleable.RecyclerView_spanCount, 1);
	//   17   33:aload           4
	//   18   35:aload_0         
	//   19   36:getstatic       #319 <Field int android.support.v7.recyclerview.R$styleable.RecyclerView_spanCount>
	//   20   39:iconst_1        
	//   21   40:invokevirtual   #313 <Method int TypedArray.getInt(int, int)>
	//   22   43:putfield        #322 <Field int RecyclerView$LayoutManager$Properties.spanCount>
		properties.reverseLayout = ((TypedArray) (context)).getBoolean(android.support.v7.recyclerview.R.styleable.RecyclerView_reverseLayout, false);
	//   23   46:aload           4
	//   24   48:aload_0         
	//   25   49:getstatic       #325 <Field int android.support.v7.recyclerview.R$styleable.RecyclerView_reverseLayout>
	//   26   52:iconst_0        
	//   27   53:invokevirtual   #329 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   28   56:putfield        #332 <Field boolean RecyclerView$LayoutManager$Properties.reverseLayout>
		properties.stackFromEnd = ((TypedArray) (context)).getBoolean(android.support.v7.recyclerview.R.styleable.RecyclerView_stackFromEnd, false);
	//   29   59:aload           4
	//   30   61:aload_0         
	//   31   62:getstatic       #335 <Field int android.support.v7.recyclerview.R$styleable.RecyclerView_stackFromEnd>
	//   32   65:iconst_0        
	//   33   66:invokevirtual   #329 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   34   69:putfield        #338 <Field boolean RecyclerView$LayoutManager$Properties.stackFromEnd>
		((TypedArray) (context)).recycle();
	//   35   72:aload_0         
	//   36   73:invokevirtual   #341 <Method void TypedArray.recycle()>
		return properties;
	//   37   76:aload           4
	//   38   78:areturn         
	}

	private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerview, int i, int j)
	{
		recyclerview = ((RecyclerView) (recyclerview.getFocusedChild()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #347 <Method View RecyclerView.getFocusedChild()>
	//    2    4:astore_1        
		if(recyclerview == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		int k = getPaddingLeft();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #246 <Method int getPaddingLeft()>
	//    9   15:istore          4
		int l = getPaddingTop();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #249 <Method int getPaddingTop()>
	//   12   21:istore          5
		int i1 = getWidth();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #252 <Method int getWidth()>
	//   15   27:istore          6
		int j1 = getPaddingRight();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #255 <Method int getPaddingRight()>
	//   18   33:istore          7
		int k1 = getHeight();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #258 <Method int getHeight()>
	//   21   39:istore          8
		int l1 = getPaddingBottom();
	//   22   41:aload_0         
	//   23   42:invokevirtual   #261 <Method int getPaddingBottom()>
	//   24   45:istore          9
		Rect rect = mRecyclerView.mTempRect;
	//   25   47:aload_0         
	//   26   48:getfield        #95  <Field RecyclerView mRecyclerView>
	//   27   51:getfield        #351 <Field Rect RecyclerView.mTempRect>
	//   28   54:astore          10
		getDecoratedBoundsWithMargins(((View) (recyclerview)), rect);
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:aload           10
	//   32   60:invokevirtual   #355 <Method void getDecoratedBoundsWithMargins(View, Rect)>
		return rect.left - i < i1 - j1 && rect.right - i > k && rect.top - j < k1 - l1 && rect.bottom - j > l;
	//   33   63:aload           10
	//   34   65:getfield        #269 <Field int Rect.left>
	//   35   68:iload_2         
	//   36   69:isub            
	//   37   70:iload           6
	//   38   72:iload           7
	//   39   74:isub            
	//   40   75:icmpge          117
	//   41   78:aload           10
	//   42   80:getfield        #358 <Field int Rect.right>
	//   43   83:iload_2         
	//   44   84:isub            
	//   45   85:iload           4
	//   46   87:icmple          117
	//   47   90:aload           10
	//   48   92:getfield        #278 <Field int Rect.top>
	//   49   95:iload_3         
	//   50   96:isub            
	//   51   97:iload           8
	//   52   99:iload           9
	//   53  101:isub            
	//   54  102:icmpge          117
	//   55  105:aload           10
	//   56  107:getfield        #361 <Field int Rect.bottom>
	//   57  110:iload_3         
	//   58  111:isub            
	//   59  112:iload           5
	//   60  114:icmpgt          119
	//   61  117:iconst_0        
	//   62  118:ireturn         
	//   63  119:iconst_1        
	//   64  120:ireturn         
	}

	private static boolean isMeasurementUpToDate(int i, int j, int k)
	{
		int l = android.view.View.MeasureSpec.getMode(j);
	//    0    0:iload_1         
	//    1    1:invokestatic    #213 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		j = android.view.View.MeasureSpec.getSize(j);
	//    3    5:iload_1         
	//    4    6:invokestatic    #216 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_1        
		if(k > 0 && i != k)
	//*   6   10:iload_2         
	//*   7   11:ifle            21
	//*   8   14:iload_0         
	//*   9   15:iload_2         
	//*  10   16:icmpeq          21
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		switch(l)
	//*  13   21:iload_3         
		{
	//*  14   22:lookupswitch    3: default 56
	//	               -2147483648: 61
	//	               0: 59
	//	               1073741824: 70
	//*  15   56:goto            79
		case 0: // '\0'
			return true;
	//   16   59:iconst_1        
	//   17   60:ireturn         

		case -2147483648: 
			return j >= i;
	//   18   61:iload_1         
	//   19   62:iload_0         
	//   20   63:icmplt          68
	//   21   66:iconst_1        
	//   22   67:ireturn         
	//   23   68:iconst_0        
	//   24   69:ireturn         

		case 1073741824: 
			return j == i;
	//   25   70:iload_1         
	//   26   71:iload_0         
	//   27   72:icmpne          77
	//   28   75:iconst_1        
	//   29   76:ireturn         
	//   30   77:iconst_0        
	//   31   78:ireturn         
		}
		return false;
	//   32   79:iconst_0        
	//   33   80:ireturn         
	}

	private void onSmoothScrollerStopped( )
	{
		if(mSmoothScroller == )
	//*   0    0:aload_0         
	//*   1    1:getfield        #186 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       13
			mSmoothScroller = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #186 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//    7   13:return          
	}

	private void scrapOrRecycleView(RecyclerView.Recycler recycler, int i, View view)
	{
		RecyclerView.ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
	//    0    0:aload_3         
	//    1    1:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore          4
		if(viewholder.shouldIgnore())
	//*   3    6:aload           4
	//*   4    8:invokevirtual   #368 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		if(viewholder.isInvalid() && !viewholder.isRemoved() && !mRecyclerView.mAdapter.hasStableIds())
	//*   7   15:aload           4
	//*   8   17:invokevirtual   #371 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*   9   20:ifeq            56
	//*  10   23:aload           4
	//*  11   25:invokevirtual   #93  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  12   28:ifne            56
	//*  13   31:aload_0         
	//*  14   32:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  15   35:getfield        #375 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  16   38:invokevirtual   #380 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  17   41:ifne            56
		{
			removeViewAt(i);
	//   18   44:aload_0         
	//   19   45:iload_2         
	//   20   46:invokevirtual   #383 <Method void removeViewAt(int)>
			recycler.recycleViewHolderInternal(viewholder);
	//   21   49:aload_1         
	//   22   50:aload           4
	//   23   52:invokevirtual   #388 <Method void RecyclerView$Recycler.recycleViewHolderInternal(RecyclerView$ViewHolder)>
			return;
	//   24   55:return          
		} else
		{
			detachViewAt(i);
	//   25   56:aload_0         
	//   26   57:iload_2         
	//   27   58:invokevirtual   #391 <Method void detachViewAt(int)>
			recycler.scrapView(view);
	//   28   61:aload_1         
	//   29   62:aload_3         
	//   30   63:invokevirtual   #394 <Method void RecyclerView$Recycler.scrapView(View)>
			mRecyclerView.mViewInfoStore.onViewDetached(viewholder);
	//   31   66:aload_0         
	//   32   67:getfield        #95  <Field RecyclerView mRecyclerView>
	//   33   70:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   34   73:aload           4
	//   35   75:invokevirtual   #397 <Method void ViewInfoStore.onViewDetached(RecyclerView$ViewHolder)>
			return;
	//   36   78:return          
		}
	}

	public void addDisappearingView(View view)
	{
		addDisappearingView(view, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #401 <Method void addDisappearingView(View, int)>
	//    4    6:return          
	}

	public void addDisappearingView(View view, int i)
	{
		addViewInt(view, i, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #403 <Method void addViewInt(View, int, boolean)>
	//    5    7:return          
	}

	public void addView(View view)
	{
		addView(view, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #405 <Method void addView(View, int)>
	//    4    6:return          
	}

	public void addView(View view, int i)
	{
		addViewInt(view, i, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #403 <Method void addViewInt(View, int, boolean)>
	//    5    7:return          
	}

	public void assertInLayoutOrScroll(String s)
	{
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          15
			mRecyclerView.assertInLayoutOrScroll(s);
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #408 <Method void RecyclerView.assertInLayoutOrScroll(String)>
	//    7   15:return          
	}

	public void assertNotInLayoutOrScroll(String s)
	{
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          15
			mRecyclerView.assertNotInLayoutOrScroll(s);
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #411 <Method void RecyclerView.assertNotInLayoutOrScroll(String)>
	//    7   15:return          
	}

	public void attachView(View view)
	{
		attachView(view, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #414 <Method void attachView(View, int)>
	//    4    6:return          
	}

	public void attachView(View view, int i)
	{
		attachView(view, i, (RecyclerView.LayoutParams)view.getLayoutParams());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    5    7:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    6   10:invokevirtual   #417 <Method void attachView(View, int, RecyclerView$LayoutParams)>
	//    7   13:return          
	}

	public void attachView(View view, int i, RecyclerView.LayoutParams layoutparams)
	{
		RecyclerView.ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore          4
		if(viewholder.isRemoved())
	//*   3    6:aload           4
	//*   4    8:invokevirtual   #93  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*   5   11:ifeq            29
			mRecyclerView.mViewInfoStore.addToDisappearedInLayout(viewholder);
	//    6   14:aload_0         
	//    7   15:getfield        #95  <Field RecyclerView mRecyclerView>
	//    8   18:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//    9   21:aload           4
	//   10   23:invokevirtual   #105 <Method void ViewInfoStore.addToDisappearedInLayout(RecyclerView$ViewHolder)>
		else
	//*  11   26:goto            41
			mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(viewholder);
	//   12   29:aload_0         
	//   13   30:getfield        #95  <Field RecyclerView mRecyclerView>
	//   14   33:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   15   36:aload           4
	//   16   38:invokevirtual   #108 <Method void ViewInfoStore.removeFromDisappearedInLayout(RecyclerView$ViewHolder)>
		mChildHelper.attachViewToParent(view, i, ((android.view.ViewGroup.LayoutParams) (layoutparams)), viewholder.isRemoved());
	//   17   41:aload_0         
	//   18   42:getfield        #130 <Field ChildHelper mChildHelper>
	//   19   45:aload_1         
	//   20   46:iload_2         
	//   21   47:aload_3         
	//   22   48:aload           4
	//   23   50:invokevirtual   #93  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//   24   53:invokevirtual   #136 <Method void ChildHelper.attachViewToParent(View, int, android.view.ViewGroup$LayoutParams, boolean)>
	//   25   56:return          
	}

	public void calculateItemDecorationsForChild(View view, Rect rect)
	{
		if(mRecyclerView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnonnull       16
		{
			rect.set(0, 0, 0, 0);
	//    3    7:aload_2         
	//    4    8:iconst_0        
	//    5    9:iconst_0        
	//    6   10:iconst_0        
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #422 <Method void Rect.set(int, int, int, int)>
			return;
	//    9   15:return          
		} else
		{
			rect.set(mRecyclerView.getItemDecorInsetsForChild(view));
	//   10   16:aload_2         
	//   11   17:aload_0         
	//   12   18:getfield        #95  <Field RecyclerView mRecyclerView>
	//   13   21:aload_1         
	//   14   22:invokevirtual   #426 <Method Rect RecyclerView.getItemDecorInsetsForChild(View)>
	//   15   25:invokevirtual   #429 <Method void Rect.set(Rect)>
			return;
	//   16   28:return          
		}
	}

	public boolean canScrollHorizontally()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canScrollVertically()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean checkLayoutParams(RecyclerView.LayoutParams layoutparams)
	{
		return layoutparams != null;
	//    0    0:aload_1         
	//    1    1:ifnull          6
	//    2    4:iconst_1        
	//    3    5:ireturn         
	//    4    6:iconst_0        
	//    5    7:ireturn         
	}

	public void collectAdjacentPrefetchPositions(int i, int j, RecyclerView.State state, LayoutPrefetchRegistry layoutprefetchregistry)
	{
	//    0    0:return          
	}

	public void collectInitialPrefetchPositions(int i, LayoutPrefetchRegistry layoutprefetchregistry)
	{
	//    0    0:return          
	}

	public int computeHorizontalScrollExtent(RecyclerView.State state)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int computeHorizontalScrollOffset(RecyclerView.State state)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int computeHorizontalScrollRange(RecyclerView.State state)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int computeVerticalScrollExtent(RecyclerView.State state)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int computeVerticalScrollOffset(RecyclerView.State state)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int computeVerticalScrollRange(RecyclerView.State state)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void detachAndScrapAttachedViews(RecyclerView.Recycler recycler)
	{
		for(int i = getChildCount() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #447 <Method int getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            29
			scrapOrRecycleView(recycler, i, getChildAt(i));
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:iload_2         
	//   10   14:aload_0         
	//   11   15:iload_2         
	//   12   16:invokevirtual   #451 <Method View getChildAt(int)>
	//   13   19:invokespecial   #453 <Method void scrapOrRecycleView(RecyclerView$Recycler, int, View)>

	//   14   22:iload_2         
	//   15   23:iconst_1        
	//   16   24:isub            
	//   17   25:istore_2        
	//*  18   26:goto            7
	//   19   29:return          
	}

	public void detachAndScrapView(View view, RecyclerView.Recycler recycler)
	{
		scrapOrRecycleView(recycler, mChildHelper.indexOfChild(view), view);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #130 <Field ChildHelper mChildHelper>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #144 <Method int ChildHelper.indexOfChild(View)>
	//    6   10:aload_1         
	//    7   11:invokespecial   #453 <Method void scrapOrRecycleView(RecyclerView$Recycler, int, View)>
	//    8   14:return          
	}

	public void detachAndScrapViewAt(int i, RecyclerView.Recycler recycler)
	{
		scrapOrRecycleView(recycler, i, getChildAt(i));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:iload_1         
	//    3    3:aload_0         
	//    4    4:iload_1         
	//    5    5:invokevirtual   #451 <Method View getChildAt(int)>
	//    6    8:invokespecial   #453 <Method void scrapOrRecycleView(RecyclerView$Recycler, int, View)>
	//    7   11:return          
	}

	public void detachView(View view)
	{
		int i = mChildHelper.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field ChildHelper mChildHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #144 <Method int ChildHelper.indexOfChild(View)>
	//    4    8:istore_2        
		if(i >= 0)
	//*   5    9:iload_2         
	//*   6   10:iflt            19
			detachViewInternal(i, view);
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:aload_1         
	//   10   16:invokespecial   #460 <Method void detachViewInternal(int, View)>
	//   11   19:return          
	}

	public void detachViewAt(int i)
	{
		detachViewInternal(i, getChildAt(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokevirtual   #451 <Method View getChildAt(int)>
	//    5    7:invokespecial   #460 <Method void detachViewInternal(int, View)>
	//    6   10:return          
	}

	void dispatchAttachedToWindow(RecyclerView recyclerview)
	{
		mIsAttachedToWindow = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #68  <Field boolean mIsAttachedToWindow>
		onAttachedToWindow(recyclerview);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #465 <Method void onAttachedToWindow(RecyclerView)>
	//    6   10:return          
	}

	void dispatchDetachedFromWindow(RecyclerView recyclerview, RecyclerView.Recycler recycler)
	{
		mIsAttachedToWindow = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #68  <Field boolean mIsAttachedToWindow>
		onDetachedFromWindow(recyclerview, recycler);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #470 <Method void onDetachedFromWindow(RecyclerView, RecyclerView$Recycler)>
	//    7   11:return          
	}

	public void endAnimation(View view)
	{
		if(mRecyclerView.mItemAnimator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:getfield        #475 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//*   3    7:ifnull          24
			mRecyclerView.mItemAnimator.endAnimation(RecyclerView.getChildViewHolderInt(view));
	//    4   10:aload_0         
	//    5   11:getfield        #95  <Field RecyclerView mRecyclerView>
	//    6   14:getfield        #475 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//    7   17:aload_1         
	//    8   18:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    9   21:invokevirtual   #479 <Method void RecyclerView$ItemAnimator.endAnimation(RecyclerView$ViewHolder)>
	//   10   24:return          
	}

	public View findContainingItemView(View view)
	{
		if(mRecyclerView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		view = mRecyclerView.findContainingItemView(view);
	//    5    9:aload_0         
	//    6   10:getfield        #95  <Field RecyclerView mRecyclerView>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #483 <Method View RecyclerView.findContainingItemView(View)>
	//    9   17:astore_1        
		if(view == null)
	//*  10   18:aload_1         
	//*  11   19:ifnonnull       24
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		if(mChildHelper.isHidden(view))
	//*  14   24:aload_0         
	//*  15   25:getfield        #130 <Field ChildHelper mChildHelper>
	//*  16   28:aload_1         
	//*  17   29:invokevirtual   #487 <Method boolean ChildHelper.isHidden(View)>
	//*  18   32:ifeq            37
			return null;
	//   19   35:aconst_null     
	//   20   36:areturn         
		else
			return view;
	//   21   37:aload_1         
	//   22   38:areturn         
	}

	public View findViewByPosition(int i)
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #447 <Method int getChildCount()>
	//    2    4:istore_3        
		for(int j = 0; j < k; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          82
		{
			View view = getChildAt(j);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #451 <Method View getChildAt(int)>
	//   11   17:astore          4
			RecyclerView.ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
	//   12   19:aload           4
	//   13   21:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//   14   24:astore          5
			if(viewholder != null && viewholder.getLayoutPosition() == i && !viewholder.shouldIgnore() && (mRecyclerView.mState.isPreLayout() || !viewholder.isRemoved()))
	//*  15   26:aload           5
	//*  16   28:ifnonnull       34
	//*  17   31:goto            75
	//*  18   34:aload           5
	//*  19   36:invokevirtual   #492 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//*  20   39:iload_1         
	//*  21   40:icmpne          75
	//*  22   43:aload           5
	//*  23   45:invokevirtual   #368 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  24   48:ifne            75
	//*  25   51:aload_0         
	//*  26   52:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  27   55:getfield        #496 <Field RecyclerView$State RecyclerView.mState>
	//*  28   58:invokevirtual   #501 <Method boolean RecyclerView$State.isPreLayout()>
	//*  29   61:ifne            72
	//*  30   64:aload           5
	//*  31   66:invokevirtual   #93  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  32   69:ifne            75
				return view;
	//   33   72:aload           4
	//   34   74:areturn         
		}

	//   35   75:iload_2         
	//   36   76:iconst_1        
	//   37   77:iadd            
	//   38   78:istore_2        
	//*  39   79:goto            7
		return null;
	//   40   82:aconst_null     
	//   41   83:areturn         
	}

	public abstract RecyclerView.LayoutParams generateDefaultLayoutParams();

	public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeset)
	{
		return new RecyclerView.LayoutParams(context, attributeset);
	//    0    0:new             #116 <Class RecyclerView$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #508 <Method void RecyclerView$LayoutParams(Context, AttributeSet)>
	//    5    9:areturn         
	}

	public RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof RecyclerView.LayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #116 <Class RecyclerView$LayoutParams>
	//*   2    4:ifeq            19
			return new RecyclerView.LayoutParams((RecyclerView.LayoutParams)layoutparams);
	//    3    7:new             #116 <Class RecyclerView$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    7   15:invokespecial   #512 <Method void RecyclerView$LayoutParams(RecyclerView$LayoutParams)>
	//    8   18:areturn         
		if(layoutparams instanceof android.view.s)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #514 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return new RecyclerView.LayoutParams((android.view.s)layoutparams);
	//   12   26:new             #116 <Class RecyclerView$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #514 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #517 <Method void RecyclerView$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return new RecyclerView.LayoutParams(layoutparams);
	//   18   38:new             #116 <Class RecyclerView$LayoutParams>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #520 <Method void RecyclerView$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   22   46:areturn         
	}

	public int getBaseline()
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public int getBottomDecorationHeight(View view)
	{
		return ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets.bottom;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #525 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:getfield        #361 <Field int Rect.bottom>
	//    5   13:ireturn         
	}

	public View getChildAt(int i)
	{
		if(mChildHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field ChildHelper mChildHelper>
	//*   2    4:ifnull          16
			return mChildHelper.getChildAt(i);
	//    3    7:aload_0         
	//    4    8:getfield        #130 <Field ChildHelper mChildHelper>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #526 <Method View ChildHelper.getChildAt(int)>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	public int getChildCount()
	{
		if(mChildHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field ChildHelper mChildHelper>
	//*   2    4:ifnull          15
			return mChildHelper.getChildCount();
	//    3    7:aload_0         
	//    4    8:getfield        #130 <Field ChildHelper mChildHelper>
	//    5   11:invokevirtual   #148 <Method int ChildHelper.getChildCount()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean getClipToPadding()
	{
		return mRecyclerView != null && mRecyclerView.mClipToPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:getfield        #530 <Field boolean RecyclerView.mClipToPadding>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mRecyclerView == null || mRecyclerView.mAdapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   5   11:getfield        #375 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*   6   14:ifnonnull       19
			return 1;
	//    7   17:iconst_1        
	//    8   18:ireturn         
		if(canScrollHorizontally())
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #534 <Method boolean canScrollHorizontally()>
	//*  11   23:ifeq            37
			return mRecyclerView.mAdapter.getItemCount();
	//   12   26:aload_0         
	//   13   27:getfield        #95  <Field RecyclerView mRecyclerView>
	//   14   30:getfield        #375 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   15   33:invokevirtual   #537 <Method int RecyclerView$Adapter.getItemCount()>
	//   16   36:ireturn         
		else
			return 1;
	//   17   37:iconst_1        
	//   18   38:ireturn         
	}

	public int getDecoratedBottom(View view)
	{
		return view.getBottom() + getBottomDecorationHeight(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #541 <Method int View.getBottom()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #543 <Method int getBottomDecorationHeight(View)>
	//    5    9:iadd            
	//    6   10:ireturn         
	}

	public void getDecoratedBoundsWithMargins(View view, Rect rect)
	{
		RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #546 <Method void RecyclerView.getDecoratedBoundsWithMarginsInt(View, Rect)>
	//    3    5:return          
	}

	public int getDecoratedLeft(View view)
	{
		return view.getLeft() - getLeftDecorationWidth(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #264 <Method int View.getLeft()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #550 <Method int getLeftDecorationWidth(View)>
	//    5    9:isub            
	//    6   10:ireturn         
	}

	public int getDecoratedMeasuredHeight(View view)
	{
		Rect rect = ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #525 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:astore_2        
		return view.getMeasuredHeight() + rect.top + rect.bottom;
	//    5   11:aload_1         
	//    6   12:invokevirtual   #554 <Method int View.getMeasuredHeight()>
	//    7   15:aload_2         
	//    8   16:getfield        #278 <Field int Rect.top>
	//    9   19:iadd            
	//   10   20:aload_2         
	//   11   21:getfield        #361 <Field int Rect.bottom>
	//   12   24:iadd            
	//   13   25:ireturn         
	}

	public int getDecoratedMeasuredWidth(View view)
	{
		Rect rect = ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #525 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:astore_2        
		return view.getMeasuredWidth() + rect.left + rect.right;
	//    5   11:aload_1         
	//    6   12:invokevirtual   #558 <Method int View.getMeasuredWidth()>
	//    7   15:aload_2         
	//    8   16:getfield        #269 <Field int Rect.left>
	//    9   19:iadd            
	//   10   20:aload_2         
	//   11   21:getfield        #358 <Field int Rect.right>
	//   12   24:iadd            
	//   13   25:ireturn         
	}

	public int getDecoratedRight(View view)
	{
		return view.getRight() + getRightDecorationWidth(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #562 <Method int View.getRight()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #565 <Method int getRightDecorationWidth(View)>
	//    5    9:iadd            
	//    6   10:ireturn         
	}

	public int getDecoratedTop(View view)
	{
		return view.getTop() - getTopDecorationHeight(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #275 <Method int View.getTop()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #569 <Method int getTopDecorationHeight(View)>
	//    5    9:isub            
	//    6   10:ireturn         
	}

	public View getFocusedChild()
	{
		if(mRecyclerView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		View view = mRecyclerView.getFocusedChild();
	//    5    9:aload_0         
	//    6   10:getfield        #95  <Field RecyclerView mRecyclerView>
	//    7   13:invokevirtual   #347 <Method View RecyclerView.getFocusedChild()>
	//    8   16:astore_1        
		if(view == null || mChildHelper.isHidden(view))
	//*   9   17:aload_1         
	//*  10   18:ifnull          32
	//*  11   21:aload_0         
	//*  12   22:getfield        #130 <Field ChildHelper mChildHelper>
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #487 <Method boolean ChildHelper.isHidden(View)>
	//*  15   29:ifeq            34
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
		else
			return view;
	//   18   34:aload_1         
	//   19   35:areturn         
	}

	public int getHeight()
	{
		return mHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #571 <Field int mHeight>
	//    2    4:ireturn         
	}

	public int getHeightMode()
	{
		return mHeightMode;
	//    0    0:aload_0         
	//    1    1:getfield        #574 <Field int mHeightMode>
	//    2    4:ireturn         
	}

	public int getItemCount()
	{
		RecyclerView.Adapter adapter;
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          18
			adapter = mRecyclerView.getAdapter();
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:invokevirtual   #578 <Method RecyclerView$Adapter RecyclerView.getAdapter()>
	//    6   14:astore_1        
		else
	//*   7   15:goto            20
			adapter = null;
	//    8   18:aconst_null     
	//    9   19:astore_1        
		if(adapter != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			return adapter.getItemCount();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #537 <Method int RecyclerView$Adapter.getItemCount()>
	//   14   28:ireturn         
		else
			return 0;
	//   15   29:iconst_0        
	//   16   30:ireturn         
	}

	public int getItemViewType(View view)
	{
		return RecyclerView.getChildViewHolderInt(view).getItemViewType();
	//    0    0:aload_1         
	//    1    1:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:invokevirtual   #581 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//    3    7:ireturn         
	}

	public int getLayoutDirection()
	{
		return ViewCompat.getLayoutDirection(((View) (mRecyclerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:invokestatic    #585 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    7:ireturn         
	}

	public int getLeftDecorationWidth(View view)
	{
		return ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets.left;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #525 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:getfield        #269 <Field int Rect.left>
	//    5   13:ireturn         
	}

	public int getMinimumHeight()
	{
		return ViewCompat.getMinimumHeight(((View) (mRecyclerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:invokestatic    #588 <Method int ViewCompat.getMinimumHeight(View)>
	//    3    7:ireturn         
	}

	public int getMinimumWidth()
	{
		return ViewCompat.getMinimumWidth(((View) (mRecyclerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:invokestatic    #591 <Method int ViewCompat.getMinimumWidth(View)>
	//    3    7:ireturn         
	}

	public int getPaddingBottom()
	{
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          15
			return mRecyclerView.getPaddingBottom();
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:invokevirtual   #592 <Method int RecyclerView.getPaddingBottom()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getPaddingEnd()
	{
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          15
			return ViewCompat.getPaddingEnd(((View) (mRecyclerView)));
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:invokestatic    #595 <Method int ViewCompat.getPaddingEnd(View)>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getPaddingLeft()
	{
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          15
			return mRecyclerView.getPaddingLeft();
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:invokevirtual   #596 <Method int RecyclerView.getPaddingLeft()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getPaddingRight()
	{
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          15
			return mRecyclerView.getPaddingRight();
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:invokevirtual   #597 <Method int RecyclerView.getPaddingRight()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getPaddingStart()
	{
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          15
			return ViewCompat.getPaddingStart(((View) (mRecyclerView)));
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:invokestatic    #600 <Method int ViewCompat.getPaddingStart(View)>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getPaddingTop()
	{
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          15
			return mRecyclerView.getPaddingTop();
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:invokevirtual   #601 <Method int RecyclerView.getPaddingTop()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getPosition(View view)
	{
		return ((RecyclerView.LayoutParams)view.getLayoutParams()).getViewLayoutPosition();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:invokevirtual   #605 <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
	//    4   10:ireturn         
	}

	public int getRightDecorationWidth(View view)
	{
		return ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets.right;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #525 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:getfield        #358 <Field int Rect.right>
	//    5   13:ireturn         
	}

	public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mRecyclerView == null || mRecyclerView.mAdapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   5   11:getfield        #375 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*   6   14:ifnonnull       19
			return 1;
	//    7   17:iconst_1        
	//    8   18:ireturn         
		if(canScrollVertically())
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #608 <Method boolean canScrollVertically()>
	//*  11   23:ifeq            37
			return mRecyclerView.mAdapter.getItemCount();
	//   12   26:aload_0         
	//   13   27:getfield        #95  <Field RecyclerView mRecyclerView>
	//   14   30:getfield        #375 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   15   33:invokevirtual   #537 <Method int RecyclerView$Adapter.getItemCount()>
	//   16   36:ireturn         
		else
			return 1;
	//   17   37:iconst_1        
	//   18   38:ireturn         
	}

	public int getSelectionModeForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getTopDecorationHeight(View view)
	{
		return ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets.top;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #525 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:getfield        #278 <Field int Rect.top>
	//    5   13:ireturn         
	}

	public void getTransformedBoundingBox(View view, boolean flag, Rect rect)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            55
		{
			Rect rect1 = ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets;
	//    2    4:aload_1         
	//    3    5:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    4    8:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    5   11:getfield        #525 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    6   14:astore          4
			rect.set(-rect1.left, -rect1.top, view.getWidth() + rect1.right, view.getHeight() + rect1.bottom);
	//    7   16:aload_3         
	//    8   17:aload           4
	//    9   19:getfield        #269 <Field int Rect.left>
	//   10   22:ineg            
	//   11   23:aload           4
	//   12   25:getfield        #278 <Field int Rect.top>
	//   13   28:ineg            
	//   14   29:aload_1         
	//   15   30:invokevirtual   #612 <Method int View.getWidth()>
	//   16   33:aload           4
	//   17   35:getfield        #358 <Field int Rect.right>
	//   18   38:iadd            
	//   19   39:aload_1         
	//   20   40:invokevirtual   #613 <Method int View.getHeight()>
	//   21   43:aload           4
	//   22   45:getfield        #361 <Field int Rect.bottom>
	//   23   48:iadd            
	//   24   49:invokevirtual   #422 <Method void Rect.set(int, int, int, int)>
		} else
	//*  25   52:goto            69
		{
			rect.set(0, 0, view.getWidth(), view.getHeight());
	//   26   55:aload_3         
	//   27   56:iconst_0        
	//   28   57:iconst_0        
	//   29   58:aload_1         
	//   30   59:invokevirtual   #612 <Method int View.getWidth()>
	//   31   62:aload_1         
	//   32   63:invokevirtual   #613 <Method int View.getHeight()>
	//   33   66:invokevirtual   #422 <Method void Rect.set(int, int, int, int)>
		}
		if(mRecyclerView != null)
	//*  34   69:aload_0         
	//*  35   70:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  36   73:ifnull          162
		{
			Matrix matrix = view.getMatrix();
	//   37   76:aload_1         
	//   38   77:invokevirtual   #617 <Method Matrix View.getMatrix()>
	//   39   80:astore          4
			if(matrix != null && !matrix.isIdentity())
	//*  40   82:aload           4
	//*  41   84:ifnull          162
	//*  42   87:aload           4
	//*  43   89:invokevirtual   #622 <Method boolean Matrix.isIdentity()>
	//*  44   92:ifne            162
			{
				RectF rectf = mRecyclerView.mTempRectF;
	//   45   95:aload_0         
	//   46   96:getfield        #95  <Field RecyclerView mRecyclerView>
	//   47   99:getfield        #626 <Field RectF RecyclerView.mTempRectF>
	//   48  102:astore          5
				rectf.set(rect);
	//   49  104:aload           5
	//   50  106:aload_3         
	//   51  107:invokevirtual   #629 <Method void RectF.set(Rect)>
				matrix.mapRect(rectf);
	//   52  110:aload           4
	//   53  112:aload           5
	//   54  114:invokevirtual   #633 <Method boolean Matrix.mapRect(RectF)>
	//   55  117:pop             
				rect.set((int)Math.floor(rectf.left), (int)Math.floor(rectf.top), (int)Math.ceil(rectf.right), (int)Math.ceil(rectf.bottom));
	//   56  118:aload_3         
	//   57  119:aload           5
	//   58  121:getfield        #636 <Field float RectF.left>
	//   59  124:f2d             
	//   60  125:invokestatic    #640 <Method double Math.floor(double)>
	//   61  128:d2i             
	//   62  129:aload           5
	//   63  131:getfield        #642 <Field float RectF.top>
	//   64  134:f2d             
	//   65  135:invokestatic    #640 <Method double Math.floor(double)>
	//   66  138:d2i             
	//   67  139:aload           5
	//   68  141:getfield        #644 <Field float RectF.right>
	//   69  144:f2d             
	//   70  145:invokestatic    #647 <Method double Math.ceil(double)>
	//   71  148:d2i             
	//   72  149:aload           5
	//   73  151:getfield        #649 <Field float RectF.bottom>
	//   74  154:f2d             
	//   75  155:invokestatic    #647 <Method double Math.ceil(double)>
	//   76  158:d2i             
	//   77  159:invokevirtual   #422 <Method void Rect.set(int, int, int, int)>
			}
		}
		rect.offset(view.getLeft(), view.getTop());
	//   78  162:aload_3         
	//   79  163:aload_1         
	//   80  164:invokevirtual   #264 <Method int View.getLeft()>
	//   81  167:aload_1         
	//   82  168:invokevirtual   #275 <Method int View.getTop()>
	//   83  171:invokevirtual   #652 <Method void Rect.offset(int, int)>
	//   84  174:return          
	}

	public int getWidth()
	{
		return mWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #654 <Field int mWidth>
	//    2    4:ireturn         
	}

	public int getWidthMode()
	{
		return mWidthMode;
	//    0    0:aload_0         
	//    1    1:getfield        #657 <Field int mWidthMode>
	//    2    4:ireturn         
	}

	boolean hasFlexibleChildInBothOrientations()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #447 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          44
		{
			android.view.ViewGroup.LayoutParams layoutparams = getChildAt(i).getLayoutParams();
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #451 <Method View getChildAt(int)>
	//   11   17:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   20:astore_3        
			if(layoutparams.width < 0 && layoutparams.height < 0)
	//*  13   21:aload_3         
	//*  14   22:getfield        #662 <Field int android.view.ViewGroup$LayoutParams.width>
	//*  15   25:ifge            37
	//*  16   28:aload_3         
	//*  17   29:getfield        #664 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  18   32:ifge            37
				return true;
	//   19   35:iconst_1        
	//   20   36:ireturn         
		}

	//   21   37:iload_1         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore_1        
	//*  25   41:goto            7
		return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
	}

	public boolean hasFocus()
	{
		return mRecyclerView != null && mRecyclerView.hasFocus();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:invokevirtual   #667 <Method boolean RecyclerView.hasFocus()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void ignoreView(View view)
	{
		if(view.getParent() != mRecyclerView || mRecyclerView.indexOfChild(view) == -1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #140 <Method android.view.ViewParent View.getParent()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   4    8:if_acmpne       23
	//*   5   11:aload_0         
	//*   6   12:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #160 <Method int RecyclerView.indexOfChild(View)>
	//*   9   19:iconst_m1       
	//*  10   20:icmpne          34
		{
			throw new IllegalArgumentException("View should be fully attached to be ignored");
	//   11   23:new             #670 <Class IllegalArgumentException>
	//   12   26:dup             
	//   13   27:ldc2            #672 <String "View should be fully attached to be ignored">
	//   14   30:invokespecial   #673 <Method void IllegalArgumentException(String)>
	//   15   33:athrow          
		} else
		{
			view = ((View) (RecyclerView.getChildViewHolderInt(view)));
	//   16   34:aload_1         
	//   17   35:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//   18   38:astore_1        
			((RecyclerView.ViewHolder) (view)).addFlags(128);
	//   19   39:aload_1         
	//   20   40:sipush          128
	//   21   43:invokevirtual   #676 <Method void RecyclerView$ViewHolder.addFlags(int)>
			mRecyclerView.mViewInfoStore.removeViewHolder(((RecyclerView.ViewHolder) (view)));
	//   22   46:aload_0         
	//   23   47:getfield        #95  <Field RecyclerView mRecyclerView>
	//   24   50:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   25   53:aload_1         
	//   26   54:invokevirtual   #679 <Method void ViewInfoStore.removeViewHolder(RecyclerView$ViewHolder)>
			return;
	//   27   57:return          
		}
	}

	public boolean isAttachedToWindow()
	{
		return mIsAttachedToWindow;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field boolean mIsAttachedToWindow>
	//    2    4:ireturn         
	}

	public boolean isAutoMeasureEnabled()
	{
		return mAutoMeasure;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field boolean mAutoMeasure>
	//    2    4:ireturn         
	}

	public boolean isFocused()
	{
		return mRecyclerView != null && mRecyclerView.isFocused();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:invokevirtual   #684 <Method boolean RecyclerView.isFocused()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public final boolean isItemPrefetchEnabled()
	{
		return mItemPrefetchEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field boolean mItemPrefetchEnabled>
	//    2    4:ireturn         
	}

	public boolean isLayoutHierarchical(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isMeasurementCacheEnabled()
	{
		return mMeasurementCacheEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field boolean mMeasurementCacheEnabled>
	//    2    4:ireturn         
	}

	public boolean isSmoothScrolling()
	{
		return mSmoothScroller != null && mSmoothScroller.isRunning();
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #186 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//    5   11:invokevirtual   #191 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean isViewPartiallyVisible(View view, boolean flag, boolean flag1)
	{
		if(mHorizontalBoundCheck.isViewWithinBoundFlags(view, 24579) && mVerticalBoundCheck.isViewWithinBoundFlags(view, 24579))
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field ViewBoundsCheck mHorizontalBoundCheck>
	//*   2    4:aload_1         
	//*   3    5:sipush          24579
	//*   4    8:invokevirtual   #696 <Method boolean ViewBoundsCheck.isViewWithinBoundFlags(View, int)>
	//*   5   11:ifeq            33
	//*   6   14:aload_0         
	//*   7   15:getfield        #64  <Field ViewBoundsCheck mVerticalBoundCheck>
	//*   8   18:aload_1         
	//*   9   19:sipush          24579
	//*  10   22:invokevirtual   #696 <Method boolean ViewBoundsCheck.isViewWithinBoundFlags(View, int)>
	//*  11   25:ifeq            33
			flag1 = true;
	//   12   28:iconst_1        
	//   13   29:istore_3        
		else
	//*  14   30:goto            35
			flag1 = false;
	//   15   33:iconst_0        
	//   16   34:istore_3        
		if(flag)
	//*  17   35:iload_2         
	//*  18   36:ifeq            41
			return flag1;
	//   19   39:iload_3         
	//   20   40:ireturn         
		return !flag1;
	//   21   41:iload_3         
	//   22   42:ifne            47
	//   23   45:iconst_1        
	//   24   46:ireturn         
	//   25   47:iconst_0        
	//   26   48:ireturn         
	}

	public void layoutDecorated(View view, int i, int j, int k, int l)
	{
		Rect rect = ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #525 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:astore          6
		view.layout(rect.left + i, rect.top + j, k - rect.right, l - rect.bottom);
	//    5   12:aload_1         
	//    6   13:aload           6
	//    7   15:getfield        #269 <Field int Rect.left>
	//    8   18:iload_2         
	//    9   19:iadd            
	//   10   20:aload           6
	//   11   22:getfield        #278 <Field int Rect.top>
	//   12   25:iload_3         
	//   13   26:iadd            
	//   14   27:iload           4
	//   15   29:aload           6
	//   16   31:getfield        #358 <Field int Rect.right>
	//   17   34:isub            
	//   18   35:iload           5
	//   19   37:aload           6
	//   20   39:getfield        #361 <Field int Rect.bottom>
	//   21   42:isub            
	//   22   43:invokevirtual   #702 <Method void View.layout(int, int, int, int)>
	//   23   46:return          
	}

	public void layoutDecoratedWithMargins(View view, int i, int j, int k, int l)
	{
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:astore          6
		Rect rect = layoutparams.mDecorInsets;
	//    4    9:aload           6
	//    5   11:getfield        #525 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    6   14:astore          7
		view.layout(rect.left + i + layoutparams.leftMargin, rect.top + j + layoutparams.topMargin, k - rect.right - layoutparams.rightMargin, l - rect.bottom - layoutparams.bottomMargin);
	//    7   16:aload_1         
	//    8   17:aload           7
	//    9   19:getfield        #269 <Field int Rect.left>
	//   10   22:iload_2         
	//   11   23:iadd            
	//   12   24:aload           6
	//   13   26:getfield        #706 <Field int RecyclerView$LayoutParams.leftMargin>
	//   14   29:iadd            
	//   15   30:aload           7
	//   16   32:getfield        #278 <Field int Rect.top>
	//   17   35:iload_3         
	//   18   36:iadd            
	//   19   37:aload           6
	//   20   39:getfield        #709 <Field int RecyclerView$LayoutParams.topMargin>
	//   21   42:iadd            
	//   22   43:iload           4
	//   23   45:aload           7
	//   24   47:getfield        #358 <Field int Rect.right>
	//   25   50:isub            
	//   26   51:aload           6
	//   27   53:getfield        #712 <Field int RecyclerView$LayoutParams.rightMargin>
	//   28   56:isub            
	//   29   57:iload           5
	//   30   59:aload           7
	//   31   61:getfield        #361 <Field int Rect.bottom>
	//   32   64:isub            
	//   33   65:aload           6
	//   34   67:getfield        #715 <Field int RecyclerView$LayoutParams.bottomMargin>
	//   35   70:isub            
	//   36   71:invokevirtual   #702 <Method void View.layout(int, int, int, int)>
	//   37   74:return          
	}

	public void measureChild(View view, int i, int j)
	{
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:astore          8
		Rect rect = mRecyclerView.getItemDecorInsetsForChild(view);
	//    4    9:aload_0         
	//    5   10:getfield        #95  <Field RecyclerView mRecyclerView>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #426 <Method Rect RecyclerView.getItemDecorInsetsForChild(View)>
	//    8   17:astore          9
		int i1 = rect.left;
	//    9   19:aload           9
	//   10   21:getfield        #269 <Field int Rect.left>
	//   11   24:istore          6
		int j1 = rect.right;
	//   12   26:aload           9
	//   13   28:getfield        #358 <Field int Rect.right>
	//   14   31:istore          7
		int k = rect.top;
	//   15   33:aload           9
	//   16   35:getfield        #278 <Field int Rect.top>
	//   17   38:istore          4
		int l = rect.bottom;
	//   18   40:aload           9
	//   19   42:getfield        #361 <Field int Rect.bottom>
	//   20   45:istore          5
		i = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + (i + (i1 + j1)), layoutparams.width, canScrollHorizontally());
	//   21   47:aload_0         
	//   22   48:invokevirtual   #252 <Method int getWidth()>
	//   23   51:aload_0         
	//   24   52:invokevirtual   #719 <Method int getWidthMode()>
	//   25   55:aload_0         
	//   26   56:invokevirtual   #246 <Method int getPaddingLeft()>
	//   27   59:aload_0         
	//   28   60:invokevirtual   #255 <Method int getPaddingRight()>
	//   29   63:iadd            
	//   30   64:iload_2         
	//   31   65:iload           6
	//   32   67:iload           7
	//   33   69:iadd            
	//   34   70:iadd            
	//   35   71:iadd            
	//   36   72:aload           8
	//   37   74:getfield        #720 <Field int RecyclerView$LayoutParams.width>
	//   38   77:aload_0         
	//   39   78:invokevirtual   #534 <Method boolean canScrollHorizontally()>
	//   40   81:invokestatic    #722 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   41   84:istore_2        
		j = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + (j + (k + l)), layoutparams.height, canScrollVertically());
	//   42   85:aload_0         
	//   43   86:invokevirtual   #258 <Method int getHeight()>
	//   44   89:aload_0         
	//   45   90:invokevirtual   #724 <Method int getHeightMode()>
	//   46   93:aload_0         
	//   47   94:invokevirtual   #249 <Method int getPaddingTop()>
	//   48   97:aload_0         
	//   49   98:invokevirtual   #261 <Method int getPaddingBottom()>
	//   50  101:iadd            
	//   51  102:iload_3         
	//   52  103:iload           4
	//   53  105:iload           5
	//   54  107:iadd            
	//   55  108:iadd            
	//   56  109:iadd            
	//   57  110:aload           8
	//   58  112:getfield        #725 <Field int RecyclerView$LayoutParams.height>
	//   59  115:aload_0         
	//   60  116:invokevirtual   #608 <Method boolean canScrollVertically()>
	//   61  119:invokestatic    #722 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   62  122:istore_3        
		if(shouldMeasureChild(view, i, j, layoutparams))
	//*  63  123:aload_0         
	//*  64  124:aload_1         
	//*  65  125:iload_2         
	//*  66  126:iload_3         
	//*  67  127:aload           8
	//*  68  129:invokevirtual   #729 <Method boolean shouldMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//*  69  132:ifeq            141
			view.measure(i, j);
	//   70  135:aload_1         
	//   71  136:iload_2         
	//   72  137:iload_3         
	//   73  138:invokevirtual   #732 <Method void View.measure(int, int)>
	//   74  141:return          
	}

	public void measureChildWithMargins(View view, int i, int j)
	{
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:astore          8
		Rect rect = mRecyclerView.getItemDecorInsetsForChild(view);
	//    4    9:aload_0         
	//    5   10:getfield        #95  <Field RecyclerView mRecyclerView>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #426 <Method Rect RecyclerView.getItemDecorInsetsForChild(View)>
	//    8   17:astore          9
		int i1 = rect.left;
	//    9   19:aload           9
	//   10   21:getfield        #269 <Field int Rect.left>
	//   11   24:istore          6
		int j1 = rect.right;
	//   12   26:aload           9
	//   13   28:getfield        #358 <Field int Rect.right>
	//   14   31:istore          7
		int k = rect.top;
	//   15   33:aload           9
	//   16   35:getfield        #278 <Field int Rect.top>
	//   17   38:istore          4
		int l = rect.bottom;
	//   18   40:aload           9
	//   19   42:getfield        #361 <Field int Rect.bottom>
	//   20   45:istore          5
		i = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + layoutparams.leftMargin + layoutparams.rightMargin + (i + (i1 + j1)), layoutparams.width, canScrollHorizontally());
	//   21   47:aload_0         
	//   22   48:invokevirtual   #252 <Method int getWidth()>
	//   23   51:aload_0         
	//   24   52:invokevirtual   #719 <Method int getWidthMode()>
	//   25   55:aload_0         
	//   26   56:invokevirtual   #246 <Method int getPaddingLeft()>
	//   27   59:aload_0         
	//   28   60:invokevirtual   #255 <Method int getPaddingRight()>
	//   29   63:iadd            
	//   30   64:aload           8
	//   31   66:getfield        #706 <Field int RecyclerView$LayoutParams.leftMargin>
	//   32   69:iadd            
	//   33   70:aload           8
	//   34   72:getfield        #712 <Field int RecyclerView$LayoutParams.rightMargin>
	//   35   75:iadd            
	//   36   76:iload_2         
	//   37   77:iload           6
	//   38   79:iload           7
	//   39   81:iadd            
	//   40   82:iadd            
	//   41   83:iadd            
	//   42   84:aload           8
	//   43   86:getfield        #720 <Field int RecyclerView$LayoutParams.width>
	//   44   89:aload_0         
	//   45   90:invokevirtual   #534 <Method boolean canScrollHorizontally()>
	//   46   93:invokestatic    #722 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   47   96:istore_2        
		j = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + layoutparams.topMargin + layoutparams.bottomMargin + (j + (k + l)), layoutparams.height, canScrollVertically());
	//   48   97:aload_0         
	//   49   98:invokevirtual   #258 <Method int getHeight()>
	//   50  101:aload_0         
	//   51  102:invokevirtual   #724 <Method int getHeightMode()>
	//   52  105:aload_0         
	//   53  106:invokevirtual   #249 <Method int getPaddingTop()>
	//   54  109:aload_0         
	//   55  110:invokevirtual   #261 <Method int getPaddingBottom()>
	//   56  113:iadd            
	//   57  114:aload           8
	//   58  116:getfield        #709 <Field int RecyclerView$LayoutParams.topMargin>
	//   59  119:iadd            
	//   60  120:aload           8
	//   61  122:getfield        #715 <Field int RecyclerView$LayoutParams.bottomMargin>
	//   62  125:iadd            
	//   63  126:iload_3         
	//   64  127:iload           4
	//   65  129:iload           5
	//   66  131:iadd            
	//   67  132:iadd            
	//   68  133:iadd            
	//   69  134:aload           8
	//   70  136:getfield        #725 <Field int RecyclerView$LayoutParams.height>
	//   71  139:aload_0         
	//   72  140:invokevirtual   #608 <Method boolean canScrollVertically()>
	//   73  143:invokestatic    #722 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   74  146:istore_3        
		if(shouldMeasureChild(view, i, j, layoutparams))
	//*  75  147:aload_0         
	//*  76  148:aload_1         
	//*  77  149:iload_2         
	//*  78  150:iload_3         
	//*  79  151:aload           8
	//*  80  153:invokevirtual   #729 <Method boolean shouldMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//*  81  156:ifeq            165
			view.measure(i, j);
	//   82  159:aload_1         
	//   83  160:iload_2         
	//   84  161:iload_3         
	//   85  162:invokevirtual   #732 <Method void View.measure(int, int)>
	//   86  165:return          
	}

	public void moveView(int i, int j)
	{
		View view = getChildAt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #451 <Method View getChildAt(int)>
	//    3    5:astore_3        
		if(view == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       38
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Cannot move a child from non-existing index:").append(i).toString());
	//    6   10:new             #670 <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:new             #152 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #153 <Method void StringBuilder()>
	//   11   21:ldc2            #735 <String "Cannot move a child from non-existing index:">
	//   12   24:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:iload_1         
	//   14   28:invokevirtual   #163 <Method StringBuilder StringBuilder.append(int)>
	//   15   31:invokevirtual   #167 <Method String StringBuilder.toString()>
	//   16   34:invokespecial   #673 <Method void IllegalArgumentException(String)>
	//   17   37:athrow          
		} else
		{
			detachViewAt(i);
	//   18   38:aload_0         
	//   19   39:iload_1         
	//   20   40:invokevirtual   #391 <Method void detachViewAt(int)>
			attachView(view, j);
	//   21   43:aload_0         
	//   22   44:aload_3         
	//   23   45:iload_2         
	//   24   46:invokevirtual   #414 <Method void attachView(View, int)>
			return;
	//   25   49:return          
		}
	}

	public void offsetChildrenHorizontal(int i)
	{
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          15
			mRecyclerView.offsetChildrenHorizontal(i);
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #738 <Method void RecyclerView.offsetChildrenHorizontal(int)>
	//    7   15:return          
	}

	public void offsetChildrenVertical(int i)
	{
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          15
			mRecyclerView.offsetChildrenVertical(i);
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #741 <Method void RecyclerView.offsetChildrenVertical(int)>
	//    7   15:return          
	}

	public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter1)
	{
	//    0    0:return          
	}

	public boolean onAddFocusables(RecyclerView recyclerview, ArrayList arraylist, int i, int j)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onAttachedToWindow(RecyclerView recyclerview)
	{
	//    0    0:return          
	}

	public void onDetachedFromWindow(RecyclerView recyclerview)
	{
	//    0    0:return          
	}

	public void onDetachedFromWindow(RecyclerView recyclerview, RecyclerView.Recycler recycler)
	{
		onDetachedFromWindow(recyclerview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #750 <Method void onDetachedFromWindow(RecyclerView)>
	//    3    5:return          
	}

	public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onInitializeAccessibilityEvent(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityEvent accessibilityevent)
	{
		recycler = ((RecyclerView.Recycler) (AccessibilityEventCompat.asRecord(accessibilityevent)));
	//    0    0:aload_3         
	//    1    1:invokestatic    #760 <Method AccessibilityRecordCompat AccessibilityEventCompat.asRecord(AccessibilityEvent)>
	//    2    4:astore_1        
		if(mRecyclerView == null || recycler == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   5    9:ifnull          16
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       17
			return;
	//    8   16:return          
		boolean flag;
		if(mRecyclerView.canScrollVertically(1) || mRecyclerView.canScrollVertically(-1) || mRecyclerView.canScrollHorizontally(-1) || mRecyclerView.canScrollHorizontally(1))
	//*   9   17:aload_0         
	//*  10   18:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  11   21:iconst_1        
	//*  12   22:invokevirtual   #763 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  13   25:ifne            61
	//*  14   28:aload_0         
	//*  15   29:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  16   32:iconst_m1       
	//*  17   33:invokevirtual   #763 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  18   36:ifne            61
	//*  19   39:aload_0         
	//*  20   40:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  21   43:iconst_m1       
	//*  22   44:invokevirtual   #765 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  23   47:ifne            61
	//*  24   50:aload_0         
	//*  25   51:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  26   54:iconst_1        
	//*  27   55:invokevirtual   #765 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  28   58:ifeq            67
			flag = true;
	//   29   61:iconst_1        
	//   30   62:istore          4
		else
	//*  31   64:goto            70
			flag = false;
	//   32   67:iconst_0        
	//   33   68:istore          4
		((AccessibilityRecordCompat) (recycler)).setScrollable(flag);
	//   34   70:aload_1         
	//   35   71:iload           4
	//   36   73:invokevirtual   #771 <Method void AccessibilityRecordCompat.setScrollable(boolean)>
		if(mRecyclerView.mAdapter != null)
	//*  37   76:aload_0         
	//*  38   77:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  39   80:getfield        #375 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  40   83:ifnull          100
			((AccessibilityRecordCompat) (recycler)).setItemCount(mRecyclerView.mAdapter.getItemCount());
	//   41   86:aload_1         
	//   42   87:aload_0         
	//   43   88:getfield        #95  <Field RecyclerView mRecyclerView>
	//   44   91:getfield        #375 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   45   94:invokevirtual   #537 <Method int RecyclerView$Adapter.getItemCount()>
	//   46   97:invokevirtual   #774 <Method void AccessibilityRecordCompat.setItemCount(int)>
	//   47  100:return          
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		onInitializeAccessibilityEvent(mRecyclerView.mRecycler, mRecyclerView.mState, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field RecyclerView mRecyclerView>
	//    3    5:getfield        #779 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    4    8:aload_0         
	//    5    9:getfield        #95  <Field RecyclerView mRecyclerView>
	//    6   12:getfield        #496 <Field RecyclerView$State RecyclerView.mState>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #781 <Method void onInitializeAccessibilityEvent(RecyclerView$Recycler, RecyclerView$State, AccessibilityEvent)>
	//    9   19:return          
	}

	void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		onInitializeAccessibilityNodeInfo(mRecyclerView.mRecycler, mRecyclerView.mState, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field RecyclerView mRecyclerView>
	//    3    5:getfield        #779 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    4    8:aload_0         
	//    5    9:getfield        #95  <Field RecyclerView mRecyclerView>
	//    6   12:getfield        #496 <Field RecyclerView$State RecyclerView.mState>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #786 <Method void onInitializeAccessibilityNodeInfo(RecyclerView$Recycler, RecyclerView$State, AccessibilityNodeInfoCompat)>
	//    9   19:return          
	}

	public void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		if(mRecyclerView.canScrollVertically(-1) || mRecyclerView.canScrollHorizontally(-1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:iconst_m1       
	//*   3    5:invokevirtual   #763 <Method boolean RecyclerView.canScrollVertically(int)>
	//*   4    8:ifne            22
	//*   5   11:aload_0         
	//*   6   12:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   7   15:iconst_m1       
	//*   8   16:invokevirtual   #765 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*   9   19:ifeq            34
		{
			accessibilitynodeinfocompat.addAction(8192);
	//   10   22:aload_3         
	//   11   23:sipush          8192
	//   12   26:invokevirtual   #791 <Method void AccessibilityNodeInfoCompat.addAction(int)>
			accessibilitynodeinfocompat.setScrollable(true);
	//   13   29:aload_3         
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #792 <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
		}
		if(mRecyclerView.canScrollVertically(1) || mRecyclerView.canScrollHorizontally(1))
	//*  16   34:aload_0         
	//*  17   35:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  18   38:iconst_1        
	//*  19   39:invokevirtual   #763 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  20   42:ifne            56
	//*  21   45:aload_0         
	//*  22   46:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  23   49:iconst_1        
	//*  24   50:invokevirtual   #765 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  25   53:ifeq            68
		{
			accessibilitynodeinfocompat.addAction(4096);
	//   26   56:aload_3         
	//   27   57:sipush          4096
	//   28   60:invokevirtual   #791 <Method void AccessibilityNodeInfoCompat.addAction(int)>
			accessibilitynodeinfocompat.setScrollable(true);
	//   29   63:aload_3         
	//   30   64:iconst_1        
	//   31   65:invokevirtual   #792 <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
		}
		accessibilitynodeinfocompat.setCollectionInfo(((Object) (android.support.v4.view.accessibility..CollectionInfoCompat.obtain(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), isLayoutHierarchical(recycler, state), getSelectionModeForAccessibility(recycler, state)))));
	//   32   68:aload_3         
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:aload_2         
	//   36   72:invokevirtual   #794 <Method int getRowCountForAccessibility(RecyclerView$Recycler, RecyclerView$State)>
	//   37   75:aload_0         
	//   38   76:aload_1         
	//   39   77:aload_2         
	//   40   78:invokevirtual   #796 <Method int getColumnCountForAccessibility(RecyclerView$Recycler, RecyclerView$State)>
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:aload_2         
	//   44   84:invokevirtual   #798 <Method boolean isLayoutHierarchical(RecyclerView$Recycler, RecyclerView$State)>
	//   45   87:aload_0         
	//   46   88:aload_1         
	//   47   89:aload_2         
	//   48   90:invokevirtual   #800 <Method int getSelectionModeForAccessibility(RecyclerView$Recycler, RecyclerView$State)>
	//   49   93:invokestatic    #806 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat.obtain(int, int, boolean, int)>
	//   50   96:invokevirtual   #810 <Method void AccessibilityNodeInfoCompat.setCollectionInfo(Object)>
	//   51   99:return          
	}

	public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		int i;
		if(canScrollVertically())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #608 <Method boolean canScrollVertically()>
	//*   2    4:ifeq            17
			i = getPosition(view);
	//    3    7:aload_0         
	//    4    8:aload_3         
	//    5    9:invokevirtual   #814 <Method int getPosition(View)>
	//    6   12:istore          5
		else
	//*   7   14:goto            20
			i = 0;
	//    8   17:iconst_0        
	//    9   18:istore          5
		int j;
		if(canScrollHorizontally())
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #534 <Method boolean canScrollHorizontally()>
	//*  12   24:ifeq            37
			j = getPosition(view);
	//   13   27:aload_0         
	//   14   28:aload_3         
	//   15   29:invokevirtual   #814 <Method int getPosition(View)>
	//   16   32:istore          6
		else
	//*  17   34:goto            40
			j = 0;
	//   18   37:iconst_0        
	//   19   38:istore          6
		accessibilitynodeinfocompat.setCollectionItemInfo(((Object) (android.support.v4.view.accessibility..CollectionItemInfoCompat.obtain(i, 1, j, 1, false, false))));
	//   20   40:aload           4
	//   21   42:iload           5
	//   22   44:iconst_1        
	//   23   45:iload           6
	//   24   47:iconst_1        
	//   25   48:iconst_0        
	//   26   49:iconst_0        
	//   27   50:invokestatic    #819 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//   28   53:invokevirtual   #822 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
	//   29   56:return          
	}

	void onInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		RecyclerView.ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore_3        
		if(viewholder != null && !viewholder.isRemoved() && !mChildHelper.isHidden(viewholder.itemView))
	//*   3    5:aload_3         
	//*   4    6:ifnull          50
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #93  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*   7   13:ifne            50
	//*   8   16:aload_0         
	//*   9   17:getfield        #130 <Field ChildHelper mChildHelper>
	//*  10   20:aload_3         
	//*  11   21:getfield        #202 <Field View RecyclerView$ViewHolder.itemView>
	//*  12   24:invokevirtual   #487 <Method boolean ChildHelper.isHidden(View)>
	//*  13   27:ifne            50
			onInitializeAccessibilityNodeInfoForItem(mRecyclerView.mRecycler, mRecyclerView.mState, view, accessibilitynodeinfocompat);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #95  <Field RecyclerView mRecyclerView>
	//   17   35:getfield        #779 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//   18   38:aload_0         
	//   19   39:getfield        #95  <Field RecyclerView mRecyclerView>
	//   20   42:getfield        #496 <Field RecyclerView$State RecyclerView.mState>
	//   21   45:aload_1         
	//   22   46:aload_2         
	//   23   47:invokevirtual   #825 <Method void onInitializeAccessibilityNodeInfoForItem(RecyclerView$Recycler, RecyclerView$State, View, AccessibilityNodeInfoCompat)>
	//   24   50:return          
	}

	public View onInterceptFocusSearch(View view, int i)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onItemsAdded(RecyclerView recyclerview, int i, int j)
	{
	//    0    0:return          
	}

	public void onItemsChanged(RecyclerView recyclerview)
	{
	//    0    0:return          
	}

	public void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onItemsRemoved(RecyclerView recyclerview, int i, int j)
	{
	//    0    0:return          
	}

	public void onItemsUpdated(RecyclerView recyclerview, int i, int j)
	{
	//    0    0:return          
	}

	public void onItemsUpdated(RecyclerView recyclerview, int i, int j, Object obj)
	{
		onItemsUpdated(recyclerview, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #837 <Method void onItemsUpdated(RecyclerView, int, int)>
	//    5    7:return          
	}

	public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
	//    0    0:ldc2            #840 <String "RecyclerView">
	//    1    3:ldc2            #842 <String "You must override onLayoutChildren(Recycler recycler, State state) ">
	//    2    6:invokestatic    #848 <Method int Log.e(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void onLayoutCompleted(RecyclerView.State state)
	{
	//    0    0:return          
	}

	public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j)
	{
		mRecyclerView.defaultOnMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:iload_3         
	//    3    5:iload           4
	//    4    7:invokevirtual   #855 <Method void RecyclerView.defaultOnMeasure(int, int)>
	//    5   10:return          
	}

	public boolean onRequestChildFocus(RecyclerView recyclerview, RecyclerView.State state, View view, View view1)
	{
		return onRequestChildFocus(recyclerview, view, view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokevirtual   #860 <Method boolean onRequestChildFocus(RecyclerView, View, View)>
	//    5    8:ireturn         
	}

	public boolean onRequestChildFocus(RecyclerView recyclerview, View view, View view1)
	{
		return isSmoothScrolling() || recyclerview.isComputingLayout();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #862 <Method boolean isSmoothScrolling()>
	//    2    4:ifne            14
	//    3    7:aload_1         
	//    4    8:invokevirtual   #865 <Method boolean RecyclerView.isComputingLayout()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
	//    0    0:return          
	}

	public Parcelable onSaveInstanceState()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onScrollStateChanged(int i)
	{
	//    0    0:return          
	}

	boolean performAccessibilityAction(int i, Bundle bundle)
	{
		return performAccessibilityAction(mRecyclerView.mRecycler, mRecyclerView.mState, i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field RecyclerView mRecyclerView>
	//    3    5:getfield        #779 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    4    8:aload_0         
	//    5    9:getfield        #95  <Field RecyclerView mRecyclerView>
	//    6   12:getfield        #496 <Field RecyclerView$State RecyclerView.mState>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #875 <Method boolean performAccessibilityAction(RecyclerView$Recycler, RecyclerView$State, int, Bundle)>
	//   10   20:ireturn         
	}

	public boolean performAccessibilityAction(RecyclerView.Recycler recycler, RecyclerView.State state, int i, Bundle bundle)
	{
		if(mRecyclerView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore          7
		boolean flag1 = false;
	//    7   12:iconst_0        
	//    8   13:istore          8
		int j = 0;
	//    9   15:iconst_0        
	//   10   16:istore          5
		int l = 0;
	//   11   18:iconst_0        
	//   12   19:istore          6
		switch(i)
	//*  13   21:iload_3         
		{
	//*  14   22:lookupswitch    2: default 48
	//	               4096: 119
	//	               8192: 54
		default:
			i = ((int) (flag1));
	//   15   48:iload           8
	//   16   50:istore_3        
			break;

	//*  17   51:goto            183
		case 8192: 
			if(mRecyclerView.canScrollVertically(-1))
	//*  18   54:aload_0         
	//*  19   55:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  20   58:iconst_m1       
	//*  21   59:invokevirtual   #763 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  22   62:ifeq            82
				j = -(getHeight() - getPaddingTop() - getPaddingBottom());
	//   23   65:aload_0         
	//   24   66:invokevirtual   #258 <Method int getHeight()>
	//   25   69:aload_0         
	//   26   70:invokevirtual   #249 <Method int getPaddingTop()>
	//   27   73:isub            
	//   28   74:aload_0         
	//   29   75:invokevirtual   #261 <Method int getPaddingBottom()>
	//   30   78:isub            
	//   31   79:ineg            
	//   32   80:istore          5
			i = j;
	//   33   82:iload           5
	//   34   84:istore_3        
			if(mRecyclerView.canScrollHorizontally(-1))
	//*  35   85:aload_0         
	//*  36   86:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  37   89:iconst_m1       
	//*  38   90:invokevirtual   #765 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  39   93:ifeq            183
			{
				l = -(getWidth() - getPaddingLeft() - getPaddingRight());
	//   40   96:aload_0         
	//   41   97:invokevirtual   #252 <Method int getWidth()>
	//   42  100:aload_0         
	//   43  101:invokevirtual   #246 <Method int getPaddingLeft()>
	//   44  104:isub            
	//   45  105:aload_0         
	//   46  106:invokevirtual   #255 <Method int getPaddingRight()>
	//   47  109:isub            
	//   48  110:ineg            
	//   49  111:istore          6
				i = j;
	//   50  113:iload           5
	//   51  115:istore_3        
			}
			break;

	//*  52  116:goto            183
		case 4096: 
			int k = ((int) (flag));
	//   53  119:iload           7
	//   54  121:istore          5
			if(mRecyclerView.canScrollVertically(1))
	//*  55  123:aload_0         
	//*  56  124:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  57  127:iconst_1        
	//*  58  128:invokevirtual   #763 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  59  131:ifeq            150
				k = getHeight() - getPaddingTop() - getPaddingBottom();
	//   60  134:aload_0         
	//   61  135:invokevirtual   #258 <Method int getHeight()>
	//   62  138:aload_0         
	//   63  139:invokevirtual   #249 <Method int getPaddingTop()>
	//   64  142:isub            
	//   65  143:aload_0         
	//   66  144:invokevirtual   #261 <Method int getPaddingBottom()>
	//   67  147:isub            
	//   68  148:istore          5
			i = k;
	//   69  150:iload           5
	//   70  152:istore_3        
			if(mRecyclerView.canScrollHorizontally(1))
	//*  71  153:aload_0         
	//*  72  154:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  73  157:iconst_1        
	//*  74  158:invokevirtual   #765 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  75  161:ifeq            183
			{
				l = getWidth() - getPaddingLeft() - getPaddingRight();
	//   76  164:aload_0         
	//   77  165:invokevirtual   #252 <Method int getWidth()>
	//   78  168:aload_0         
	//   79  169:invokevirtual   #246 <Method int getPaddingLeft()>
	//   80  172:isub            
	//   81  173:aload_0         
	//   82  174:invokevirtual   #255 <Method int getPaddingRight()>
	//   83  177:isub            
	//   84  178:istore          6
				i = k;
	//   85  180:iload           5
	//   86  182:istore_3        
			}
			break;
		}
		if(i == 0 && l == 0)
	//*  87  183:iload_3         
	//*  88  184:ifne            194
	//*  89  187:iload           6
	//*  90  189:ifne            194
		{
			return false;
	//   91  192:iconst_0        
	//   92  193:ireturn         
		} else
		{
			mRecyclerView.scrollBy(l, i);
	//   93  194:aload_0         
	//   94  195:getfield        #95  <Field RecyclerView mRecyclerView>
	//   95  198:iload           6
	//   96  200:iload_3         
	//   97  201:invokevirtual   #878 <Method void RecyclerView.scrollBy(int, int)>
			return true;
	//   98  204:iconst_1        
	//   99  205:ireturn         
		}
	}

	public boolean performAccessibilityActionForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, int i, Bundle bundle)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	boolean performAccessibilityActionForItem(View view, int i, Bundle bundle)
	{
		return performAccessibilityActionForItem(mRecyclerView.mRecycler, mRecyclerView.mState, view, i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field RecyclerView mRecyclerView>
	//    3    5:getfield        #779 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    4    8:aload_0         
	//    5    9:getfield        #95  <Field RecyclerView mRecyclerView>
	//    6   12:getfield        #496 <Field RecyclerView$State RecyclerView.mState>
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:aload_3         
	//   10   18:invokevirtual   #883 <Method boolean performAccessibilityActionForItem(RecyclerView$Recycler, RecyclerView$State, View, int, Bundle)>
	//   11   21:ireturn         
	}

	public void postOnAnimation(Runnable runnable)
	{
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          15
			ViewCompat.postOnAnimation(((View) (mRecyclerView)), runnable);
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:aload_1         
	//    6   12:invokestatic    #888 <Method void ViewCompat.postOnAnimation(View, Runnable)>
	//    7   15:return          
	}

	public void removeAllViews()
	{
		for(int i = getChildCount() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #447 <Method int getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iflt            26
			mChildHelper.removeViewAt(i);
	//    7   11:aload_0         
	//    8   12:getfield        #130 <Field ChildHelper mChildHelper>
	//    9   15:iload_1         
	//   10   16:invokevirtual   #890 <Method void ChildHelper.removeViewAt(int)>

	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:istore_1        
	//*  15   23:goto            7
	//   16   26:return          
	}

	public void removeAndRecycleAllViews(RecyclerView.Recycler recycler)
	{
		for(int i = getChildCount() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #447 <Method int getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            38
			if(!RecyclerView.getChildViewHolderInt(getChildAt(i)).shouldIgnore())
	//*   7   11:aload_0         
	//*   8   12:iload_2         
	//*   9   13:invokevirtual   #451 <Method View getChildAt(int)>
	//*  10   16:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//*  11   19:invokevirtual   #368 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  12   22:ifne            31
				removeAndRecycleViewAt(i, recycler);
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #894 <Method void removeAndRecycleViewAt(int, RecyclerView$Recycler)>

	//   17   31:iload_2         
	//   18   32:iconst_1        
	//   19   33:isub            
	//   20   34:istore_2        
	//*  21   35:goto            7
	//   22   38:return          
	}

	void removeAndRecycleScrapInt(RecyclerView.Recycler recycler)
	{
		int j = recycler.getScrapCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #898 <Method int RecyclerView$Recycler.getScrapCount()>
	//    2    4:istore_3        
		for(int i = j - 1; i >= 0; i--)
	//*   3    5:iload_3         
	//*   4    6:iconst_1        
	//*   5    7:isub            
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:iflt            103
		{
			View view = recycler.getScrapViewAt(i);
	//    9   13:aload_1         
	//   10   14:iload_2         
	//   11   15:invokevirtual   #901 <Method View RecyclerView$Recycler.getScrapViewAt(int)>
	//   12   18:astore          4
			RecyclerView.ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
	//   13   20:aload           4
	//   14   22:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//   15   25:astore          5
			if(viewholder.shouldIgnore())
	//*  16   27:aload           5
	//*  17   29:invokevirtual   #368 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  18   32:ifeq            38
				continue;
	//   19   35:goto            96
			viewholder.setIsRecyclable(false);
	//   20   38:aload           5
	//   21   40:iconst_0        
	//   22   41:invokevirtual   #904 <Method void RecyclerView$ViewHolder.setIsRecyclable(boolean)>
			if(viewholder.isTmpDetached())
	//*  23   44:aload           5
	//*  24   46:invokevirtual   #907 <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*  25   49:ifeq            62
				mRecyclerView.removeDetachedView(view, false);
	//   26   52:aload_0         
	//   27   53:getfield        #95  <Field RecyclerView mRecyclerView>
	//   28   56:aload           4
	//   29   58:iconst_0        
	//   30   59:invokevirtual   #911 <Method void RecyclerView.removeDetachedView(View, boolean)>
			if(mRecyclerView.mItemAnimator != null)
	//*  31   62:aload_0         
	//*  32   63:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  33   66:getfield        #475 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//*  34   69:ifnull          84
				mRecyclerView.mItemAnimator.endAnimation(viewholder);
	//   35   72:aload_0         
	//   36   73:getfield        #95  <Field RecyclerView mRecyclerView>
	//   37   76:getfield        #475 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//   38   79:aload           5
	//   39   81:invokevirtual   #479 <Method void RecyclerView$ItemAnimator.endAnimation(RecyclerView$ViewHolder)>
			viewholder.setIsRecyclable(true);
	//   40   84:aload           5
	//   41   86:iconst_1        
	//   42   87:invokevirtual   #904 <Method void RecyclerView$ViewHolder.setIsRecyclable(boolean)>
			recycler.quickRecycleScrapView(view);
	//   43   90:aload_1         
	//   44   91:aload           4
	//   45   93:invokevirtual   #914 <Method void RecyclerView$Recycler.quickRecycleScrapView(View)>
		}

	//   46   96:iload_2         
	//   47   97:iconst_1        
	//   48   98:isub            
	//   49   99:istore_2        
	//*  50  100:goto            9
		recycler.clearScrap();
	//   51  103:aload_1         
	//   52  104:invokevirtual   #917 <Method void RecyclerView$Recycler.clearScrap()>
		if(j > 0)
	//*  53  107:iload_3         
	//*  54  108:ifle            118
			mRecyclerView.invalidate();
	//   55  111:aload_0         
	//   56  112:getfield        #95  <Field RecyclerView mRecyclerView>
	//   57  115:invokevirtual   #918 <Method void RecyclerView.invalidate()>
	//   58  118:return          
	}

	public void removeAndRecycleView(View view, RecyclerView.Recycler recycler)
	{
		removeView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #922 <Method void removeView(View)>
		recycler.recycleView(view);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #925 <Method void RecyclerView$Recycler.recycleView(View)>
	//    6   10:return          
	}

	public void removeAndRecycleViewAt(int i, RecyclerView.Recycler recycler)
	{
		View view = getChildAt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #451 <Method View getChildAt(int)>
	//    3    5:astore_3        
		removeViewAt(i);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:invokevirtual   #383 <Method void removeViewAt(int)>
		recycler.recycleView(view);
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #925 <Method void RecyclerView$Recycler.recycleView(View)>
	//   10   16:return          
	}

	public boolean removeCallbacks(Runnable runnable)
	{
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          16
			return mRecyclerView.removeCallbacks(runnable);
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #929 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//    7   15:ireturn         
		else
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public void removeDetachedView(View view)
	{
		mRecyclerView.removeDetachedView(view, false);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #911 <Method void RecyclerView.removeDetachedView(View, boolean)>
	//    5    9:return          
	}

	public void removeView(View view)
	{
		mChildHelper.removeView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field ChildHelper mChildHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #930 <Method void ChildHelper.removeView(View)>
	//    4    8:return          
	}

	public void removeViewAt(int i)
	{
		if(getChildAt(i) != null)
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokevirtual   #451 <Method View getChildAt(int)>
	//*   3    5:ifnull          16
			mChildHelper.removeViewAt(i);
	//    4    8:aload_0         
	//    5    9:getfield        #130 <Field ChildHelper mChildHelper>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #890 <Method void ChildHelper.removeViewAt(int)>
	//    8   16:return          
	}

	public boolean requestChildRectangleOnScreen(RecyclerView recyclerview, View view, Rect rect, boolean flag)
	{
		return requestChildRectangleOnScreen(recyclerview, view, rect, flag, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iconst_0        
	//    6    7:invokevirtual   #935 <Method boolean requestChildRectangleOnScreen(RecyclerView, View, Rect, boolean, boolean)>
	//    7   10:ireturn         
	}

	public boolean requestChildRectangleOnScreen(RecyclerView recyclerview, View view, Rect rect, boolean flag, boolean flag1)
	{
		view = ((View) (getChildRectangleOnScreenScrollAmount(recyclerview, view, rect, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #937 <Method int[] getChildRectangleOnScreenScrollAmount(RecyclerView, View, Rect, boolean)>
	//    6    9:astore_2        
		int i = view[0];
	//    7   10:aload_2         
	//    8   11:iconst_0        
	//    9   12:iaload          
	//   10   13:istore          6
		int j = view[1];
	//   11   15:aload_2         
	//   12   16:iconst_1        
	//   13   17:iaload          
	//   14   18:istore          7
		if((!flag1 || isFocusedChildVisibleAfterScrolling(recyclerview, i, j)) && (i != 0 || j != 0))
	//*  15   20:iload           5
	//*  16   22:ifeq            37
	//*  17   25:aload_0         
	//*  18   26:aload_1         
	//*  19   27:iload           6
	//*  20   29:iload           7
	//*  21   31:invokespecial   #939 <Method boolean isFocusedChildVisibleAfterScrolling(RecyclerView, int, int)>
	//*  22   34:ifeq            73
	//*  23   37:iload           6
	//*  24   39:ifne            47
	//*  25   42:iload           7
	//*  26   44:ifeq            73
		{
			if(flag)
	//*  27   47:iload           4
	//*  28   49:ifeq            63
				recyclerview.scrollBy(i, j);
	//   29   52:aload_1         
	//   30   53:iload           6
	//   31   55:iload           7
	//   32   57:invokevirtual   #878 <Method void RecyclerView.scrollBy(int, int)>
			else
	//*  33   60:goto            71
				recyclerview.smoothScrollBy(i, j);
	//   34   63:aload_1         
	//   35   64:iload           6
	//   36   66:iload           7
	//   37   68:invokevirtual   #942 <Method void RecyclerView.smoothScrollBy(int, int)>
			return true;
	//   38   71:iconst_1        
	//   39   72:ireturn         
		} else
		{
			return false;
	//   40   73:iconst_0        
	//   41   74:ireturn         
		}
	}

	public void requestLayout()
	{
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          14
			mRecyclerView.requestLayout();
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:invokevirtual   #945 <Method void RecyclerView.requestLayout()>
	//    6   14:return          
	}

	public void requestSimpleAnimationsInNextLayout()
	{
		mRequestedSimpleAnimations = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #66  <Field boolean mRequestedSimpleAnimations>
	//    3    5:return          
	}

	public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void scrollToPosition(int i)
	{
	//    0    0:return          
	}

	public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setAutoMeasureEnabled(boolean flag)
	{
		mAutoMeasure = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #70  <Field boolean mAutoMeasure>
	//    3    5:return          
	}

	void setExactMeasureSpecsFrom(RecyclerView recyclerview)
	{
		setMeasureSpecs(android.view.View.MeasureSpec.makeMeasureSpec(recyclerview.getWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(recyclerview.getHeight(), 0x40000000));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #953 <Method int RecyclerView.getWidth()>
	//    3    5:ldc1            #234 <Int 0x40000000>
	//    4    7:invokestatic    #238 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #954 <Method int RecyclerView.getHeight()>
	//    7   14:ldc1            #234 <Int 0x40000000>
	//    8   16:invokestatic    #238 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    9   19:invokevirtual   #957 <Method void setMeasureSpecs(int, int)>
	//   10   22:return          
	}

	public final void setItemPrefetchEnabled(boolean flag)
	{
		if(flag != mItemPrefetchEnabled)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #74  <Field boolean mItemPrefetchEnabled>
	//*   3    5:icmpeq          35
		{
			mItemPrefetchEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #74  <Field boolean mItemPrefetchEnabled>
			mPrefetchMaxCountObserved = 0;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #960 <Field int mPrefetchMaxCountObserved>
			if(mRecyclerView != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  12   22:ifnull          35
				mRecyclerView.mRecycler.updateViewCacheSize();
	//   13   25:aload_0         
	//   14   26:getfield        #95  <Field RecyclerView mRecyclerView>
	//   15   29:getfield        #779 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//   16   32:invokevirtual   #963 <Method void RecyclerView$Recycler.updateViewCacheSize()>
		}
	//   17   35:return          
	}

	void setMeasureSpecs(int i, int j)
	{
		mWidth = android.view.View.MeasureSpec.getSize(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #216 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    3    5:putfield        #654 <Field int mWidth>
		mWidthMode = android.view.View.MeasureSpec.getMode(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokestatic    #213 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    7   13:putfield        #657 <Field int mWidthMode>
		if(mWidthMode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC)
	//*   8   16:aload_0         
	//*   9   17:getfield        #657 <Field int mWidthMode>
	//*  10   20:ifne            34
	//*  11   23:getstatic       #966 <Field boolean RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC>
	//*  12   26:ifne            34
			mWidth = 0;
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:putfield        #654 <Field int mWidth>
		mHeight = android.view.View.MeasureSpec.getSize(j);
	//   16   34:aload_0         
	//   17   35:iload_2         
	//   18   36:invokestatic    #216 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   19   39:putfield        #571 <Field int mHeight>
		mHeightMode = android.view.View.MeasureSpec.getMode(j);
	//   20   42:aload_0         
	//   21   43:iload_2         
	//   22   44:invokestatic    #213 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   23   47:putfield        #574 <Field int mHeightMode>
		if(mHeightMode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC)
	//*  24   50:aload_0         
	//*  25   51:getfield        #574 <Field int mHeightMode>
	//*  26   54:ifne            68
	//*  27   57:getstatic       #966 <Field boolean RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC>
	//*  28   60:ifne            68
			mHeight = 0;
	//   29   63:aload_0         
	//   30   64:iconst_0        
	//   31   65:putfield        #571 <Field int mHeight>
	//   32   68:return          
	}

	public void setMeasuredDimension(int i, int j)
	{
		RecyclerView.access$1000(mRecyclerView, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #970 <Method void RecyclerView.access$1000(RecyclerView, int, int)>
	//    5    9:return          
	}

	public void setMeasuredDimension(Rect rect, int i, int j)
	{
		int k = rect.width();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #284 <Method int Rect.width()>
	//    2    4:istore          4
		int l = getPaddingLeft();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #246 <Method int getPaddingLeft()>
	//    5   10:istore          5
		int i1 = getPaddingRight();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #255 <Method int getPaddingRight()>
	//    8   16:istore          6
		int j1 = rect.height();
	//    9   18:aload_1         
	//   10   19:invokevirtual   #287 <Method int Rect.height()>
	//   11   22:istore          7
		int k1 = getPaddingTop();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #249 <Method int getPaddingTop()>
	//   14   28:istore          8
		int l1 = getPaddingBottom();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #261 <Method int getPaddingBottom()>
	//   17   34:istore          9
		setMeasuredDimension(chooseSize(i, k + l + i1, getMinimumWidth()), chooseSize(j, j1 + k1 + l1, getMinimumHeight()));
	//   18   36:aload_0         
	//   19   37:iload_2         
	//   20   38:iload           4
	//   21   40:iload           5
	//   22   42:iadd            
	//   23   43:iload           6
	//   24   45:iadd            
	//   25   46:aload_0         
	//   26   47:invokevirtual   #973 <Method int getMinimumWidth()>
	//   27   50:invokestatic    #975 <Method int chooseSize(int, int, int)>
	//   28   53:iload_3         
	//   29   54:iload           7
	//   30   56:iload           8
	//   31   58:iadd            
	//   32   59:iload           9
	//   33   61:iadd            
	//   34   62:aload_0         
	//   35   63:invokevirtual   #977 <Method int getMinimumHeight()>
	//   36   66:invokestatic    #975 <Method int chooseSize(int, int, int)>
	//   37   69:invokevirtual   #979 <Method void setMeasuredDimension(int, int)>
	//   38   72:return          
	}

	void setMeasuredDimensionFromChildren(int i, int j)
	{
		int k2 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #447 <Method int getChildCount()>
	//    2    4:istore          11
		if(k2 == 0)
	//*   3    6:iload           11
	//*   4    8:ifne            21
		{
			mRecyclerView.defaultOnMeasure(i, j);
	//    5   11:aload_0         
	//    6   12:getfield        #95  <Field RecyclerView mRecyclerView>
	//    7   15:iload_1         
	//    8   16:iload_2         
	//    9   17:invokevirtual   #855 <Method void RecyclerView.defaultOnMeasure(int, int)>
			return;
	//   10   20:return          
		}
		int i2 = 0x7fffffff;
	//   11   21:ldc2            #981 <Int 0x7fffffff>
	//   12   24:istore          9
		int i1 = 0x7fffffff;
	//   13   26:ldc2            #981 <Int 0x7fffffff>
	//   14   29:istore          5
		int k1 = 0x80000000;
	//   15   31:ldc1            #235 <Int 0x80000000>
	//   16   33:istore          7
		int l = 0x80000000;
	//   17   35:ldc1            #235 <Int 0x80000000>
	//   18   37:istore          4
		for(int k = 0; k < k2;)
	//*  19   39:iconst_0        
	//*  20   40:istore_3        
	//*  21   41:iload_3         
	//*  22   42:iload           11
	//*  23   44:icmpge          178
		{
			View view = getChildAt(k);
	//   24   47:aload_0         
	//   25   48:iload_3         
	//   26   49:invokevirtual   #451 <Method View getChildAt(int)>
	//   27   52:astore          12
			Rect rect = mRecyclerView.mTempRect;
	//   28   54:aload_0         
	//   29   55:getfield        #95  <Field RecyclerView mRecyclerView>
	//   30   58:getfield        #351 <Field Rect RecyclerView.mTempRect>
	//   31   61:astore          13
			getDecoratedBoundsWithMargins(view, rect);
	//   32   63:aload_0         
	//   33   64:aload           12
	//   34   66:aload           13
	//   35   68:invokevirtual   #355 <Method void getDecoratedBoundsWithMargins(View, Rect)>
			int j1 = i2;
	//   36   71:iload           9
	//   37   73:istore          6
			if(rect.left < i2)
	//*  38   75:aload           13
	//*  39   77:getfield        #269 <Field int Rect.left>
	//*  40   80:iload           9
	//*  41   82:icmpge          92
				j1 = rect.left;
	//   42   85:aload           13
	//   43   87:getfield        #269 <Field int Rect.left>
	//   44   90:istore          6
			int l1 = k1;
	//   45   92:iload           7
	//   46   94:istore          8
			if(rect.right > k1)
	//*  47   96:aload           13
	//*  48   98:getfield        #358 <Field int Rect.right>
	//*  49  101:iload           7
	//*  50  103:icmple          113
				l1 = rect.right;
	//   51  106:aload           13
	//   52  108:getfield        #358 <Field int Rect.right>
	//   53  111:istore          8
			k1 = i1;
	//   54  113:iload           5
	//   55  115:istore          7
			if(rect.top < i1)
	//*  56  117:aload           13
	//*  57  119:getfield        #278 <Field int Rect.top>
	//*  58  122:iload           5
	//*  59  124:icmpge          134
				k1 = rect.top;
	//   60  127:aload           13
	//   61  129:getfield        #278 <Field int Rect.top>
	//   62  132:istore          7
			int j2 = l;
	//   63  134:iload           4
	//   64  136:istore          10
			if(rect.bottom > l)
	//*  65  138:aload           13
	//*  66  140:getfield        #361 <Field int Rect.bottom>
	//*  67  143:iload           4
	//*  68  145:icmple          155
				j2 = rect.bottom;
	//   69  148:aload           13
	//   70  150:getfield        #361 <Field int Rect.bottom>
	//   71  153:istore          10
			k++;
	//   72  155:iload_3         
	//   73  156:iconst_1        
	//   74  157:iadd            
	//   75  158:istore_3        
			i2 = j1;
	//   76  159:iload           6
	//   77  161:istore          9
			i1 = k1;
	//   78  163:iload           7
	//   79  165:istore          5
			k1 = l1;
	//   80  167:iload           8
	//   81  169:istore          7
			l = j2;
	//   82  171:iload           10
	//   83  173:istore          4
		}

	//*  84  175:goto            41
		mRecyclerView.mTempRect.set(i2, i1, k1, l);
	//   85  178:aload_0         
	//   86  179:getfield        #95  <Field RecyclerView mRecyclerView>
	//   87  182:getfield        #351 <Field Rect RecyclerView.mTempRect>
	//   88  185:iload           9
	//   89  187:iload           5
	//   90  189:iload           7
	//   91  191:iload           4
	//   92  193:invokevirtual   #422 <Method void Rect.set(int, int, int, int)>
		setMeasuredDimension(mRecyclerView.mTempRect, i, j);
	//   93  196:aload_0         
	//   94  197:aload_0         
	//   95  198:getfield        #95  <Field RecyclerView mRecyclerView>
	//   96  201:getfield        #351 <Field Rect RecyclerView.mTempRect>
	//   97  204:iload_1         
	//   98  205:iload_2         
	//   99  206:invokevirtual   #983 <Method void setMeasuredDimension(Rect, int, int)>
	//  100  209:return          
	}

	public void setMeasurementCacheEnabled(boolean flag)
	{
		mMeasurementCacheEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field boolean mMeasurementCacheEnabled>
	//    3    5:return          
	}

	void setRecyclerView(RecyclerView recyclerview)
	{
		if(recyclerview == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       27
		{
			mRecyclerView = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #95  <Field RecyclerView mRecyclerView>
			mChildHelper = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #130 <Field ChildHelper mChildHelper>
			mWidth = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #654 <Field int mWidth>
			mHeight = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #571 <Field int mHeight>
		} else
	//*  14   24:goto            56
		{
			mRecyclerView = recyclerview;
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:putfield        #95  <Field RecyclerView mRecyclerView>
			mChildHelper = recyclerview.mChildHelper;
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:getfield        #986 <Field ChildHelper RecyclerView.mChildHelper>
	//   21   37:putfield        #130 <Field ChildHelper mChildHelper>
			mWidth = recyclerview.getWidth();
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:invokevirtual   #953 <Method int RecyclerView.getWidth()>
	//   25   45:putfield        #654 <Field int mWidth>
			mHeight = recyclerview.getHeight();
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #954 <Method int RecyclerView.getHeight()>
	//   29   53:putfield        #571 <Field int mHeight>
		}
		mWidthMode = 0x40000000;
	//   30   56:aload_0         
	//   31   57:ldc1            #234 <Int 0x40000000>
	//   32   59:putfield        #657 <Field int mWidthMode>
		mHeightMode = 0x40000000;
	//   33   62:aload_0         
	//   34   63:ldc1            #234 <Int 0x40000000>
	//   35   65:putfield        #574 <Field int mHeightMode>
	//   36   68:return          
	}

	boolean shouldMeasureChild(View view, int i, int j, RecyclerView.LayoutParams layoutparams)
	{
		return view.isLayoutRequested() || !mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getWidth(), i, layoutparams.width) || !isMeasurementUpToDate(view.getHeight(), j, layoutparams.height);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #989 <Method boolean View.isLayoutRequested()>
	//    2    4:ifne            46
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field boolean mMeasurementCacheEnabled>
	//    5   11:ifeq            46
	//    6   14:aload_1         
	//    7   15:invokevirtual   #612 <Method int View.getWidth()>
	//    8   18:iload_2         
	//    9   19:aload           4
	//   10   21:getfield        #720 <Field int RecyclerView$LayoutParams.width>
	//   11   24:invokestatic    #991 <Method boolean isMeasurementUpToDate(int, int, int)>
	//   12   27:ifeq            46
	//   13   30:aload_1         
	//   14   31:invokevirtual   #613 <Method int View.getHeight()>
	//   15   34:iload_3         
	//   16   35:aload           4
	//   17   37:getfield        #725 <Field int RecyclerView$LayoutParams.height>
	//   18   40:invokestatic    #991 <Method boolean isMeasurementUpToDate(int, int, int)>
	//   19   43:ifne            48
	//   20   46:iconst_1        
	//   21   47:ireturn         
	//   22   48:iconst_0        
	//   23   49:ireturn         
	}

	boolean shouldMeasureTwice()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	boolean shouldReMeasureChild(View view, int i, int j, RecyclerView.LayoutParams layoutparams)
	{
		return !mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getMeasuredWidth(), i, layoutparams.width) || !isMeasurementUpToDate(view.getMeasuredHeight(), j, layoutparams.height);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field boolean mMeasurementCacheEnabled>
	//    2    4:ifeq            39
	//    3    7:aload_1         
	//    4    8:invokevirtual   #558 <Method int View.getMeasuredWidth()>
	//    5   11:iload_2         
	//    6   12:aload           4
	//    7   14:getfield        #720 <Field int RecyclerView$LayoutParams.width>
	//    8   17:invokestatic    #991 <Method boolean isMeasurementUpToDate(int, int, int)>
	//    9   20:ifeq            39
	//   10   23:aload_1         
	//   11   24:invokevirtual   #554 <Method int View.getMeasuredHeight()>
	//   12   27:iload_3         
	//   13   28:aload           4
	//   14   30:getfield        #725 <Field int RecyclerView$LayoutParams.height>
	//   15   33:invokestatic    #991 <Method boolean isMeasurementUpToDate(int, int, int)>
	//   16   36:ifne            41
	//   17   39:iconst_1        
	//   18   40:ireturn         
	//   19   41:iconst_0        
	//   20   42:ireturn         
	}

	public void smoothScrollToPosition(RecyclerView recyclerview, RecyclerView.State state, int i)
	{
		Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
	//    0    0:ldc2            #840 <String "RecyclerView">
	//    1    3:ldc2            #997 <String "You must override smoothScrollToPosition to support smooth scrolling">
	//    2    6:invokestatic    #848 <Method int Log.e(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void startSmoothScroll( )
	{
		if(mSmoothScroller != null &&  != mSmoothScroller && mSmoothScroller.isRunning())
	//*   0    0:aload_0         
	//*   1    1:getfield        #186 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   2    4:ifnull          32
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #186 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   6   12:if_acmpeq       32
	//*   7   15:aload_0         
	//*   8   16:getfield        #186 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   9   19:invokevirtual   #191 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//*  10   22:ifeq            32
			mSmoothScroller.stop();
	//   11   25:aload_0         
	//   12   26:getfield        #186 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//   13   29:invokevirtual   #1001 <Method void RecyclerView$SmoothScroller.stop()>
		mSmoothScroller = ;
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:putfield        #186 <Field RecyclerView$SmoothScroller mSmoothScroller>
		mSmoothScroller.start(mRecyclerView, this);
	//   17   37:aload_0         
	//   18   38:getfield        #186 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//   19   41:aload_0         
	//   20   42:getfield        #95  <Field RecyclerView mRecyclerView>
	//   21   45:aload_0         
	//   22   46:invokevirtual   #1005 <Method void RecyclerView$SmoothScroller.start(RecyclerView, RecyclerView$LayoutManager)>
	//   23   49:return          
	}

	public void stopIgnoringView(View view)
	{
		view = ((View) (RecyclerView.getChildViewHolderInt(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore_1        
		((RecyclerView.ViewHolder) (view)).stopIgnoring();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1009 <Method void RecyclerView$ViewHolder.stopIgnoring()>
		((RecyclerView.ViewHolder) (view)).resetInternal();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1012 <Method void RecyclerView$ViewHolder.resetInternal()>
		((RecyclerView.ViewHolder) (view)).addFlags(4);
	//    7   13:aload_1         
	//    8   14:iconst_4        
	//    9   15:invokevirtual   #676 <Method void RecyclerView$ViewHolder.addFlags(int)>
	//   10   18:return          
	}

	void stopSmoothScroller()
	{
		if(mSmoothScroller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #186 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   2    4:ifnull          14
			mSmoothScroller.stop();
	//    3    7:aload_0         
	//    4    8:getfield        #186 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//    5   11:invokevirtual   #1001 <Method void RecyclerView$SmoothScroller.stop()>
	//    6   14:return          
	}

	public boolean supportsPredictiveItemAnimations()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	boolean mAutoMeasure;
	ChildHelper mChildHelper;
	private int mHeight;
	private int mHeightMode;
	ViewBoundsCheck mHorizontalBoundCheck;
	private final ViewBoundsCheck.Callback mHorizontalBoundCheckCallback = new ViewBoundsCheck.Callback() {

		public View getChildAt(int i)
		{
			return RecyclerView.LayoutManager.this.getChildAt(i);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #25  <Method View RecyclerView$LayoutManager.getChildAt(int)>
		//    4    8:areturn         
		}

		public int getChildCount()
		{
			return RecyclerView.LayoutManager.this.getChildCount();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    2    4:invokevirtual   #29  <Method int RecyclerView$LayoutManager.getChildCount()>
		//    3    7:ireturn         
		}

		public int getChildEnd(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #37  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #39  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return getDecoratedRight(view) + layoutparams.rightMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #42  <Method int RecyclerView$LayoutManager.getDecoratedRight(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #46  <Field int RecyclerView$LayoutParams.rightMargin>
		//   10   20:iadd            
		//   11   21:ireturn         
		}

		public int getChildStart(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #37  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #39  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return getDecoratedLeft(view) - layoutparams.leftMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #50  <Method int RecyclerView$LayoutManager.getDecoratedLeft(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #53  <Field int RecyclerView$LayoutParams.leftMargin>
		//   10   20:isub            
		//   11   21:ireturn         
		}

		public View getParent()
		{
			return ((View) (mRecyclerView));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    2    4:getfield        #59  <Field RecyclerView RecyclerView$LayoutManager.mRecyclerView>
		//    3    7:areturn         
		}

		public int getParentEnd()
		{
			return getWidth() - getPaddingRight();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    2    4:invokevirtual   #63  <Method int RecyclerView$LayoutManager.getWidth()>
		//    3    7:aload_0         
		//    4    8:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    5   11:invokevirtual   #66  <Method int RecyclerView$LayoutManager.getPaddingRight()>
		//    6   14:isub            
		//    7   15:ireturn         
		}

		public int getParentStart()
		{
			return getPaddingLeft();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    2    4:invokevirtual   #70  <Method int RecyclerView$LayoutManager.getPaddingLeft()>
		//    3    7:ireturn         
		}

		final RecyclerView.LayoutManager this$0;

			
			{
				this$0 = RecyclerView.LayoutManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RecyclerView$LayoutManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}
;
	boolean mIsAttachedToWindow;
	private boolean mItemPrefetchEnabled;
	private boolean mMeasurementCacheEnabled;
	int mPrefetchMaxCountObserved;
	boolean mPrefetchMaxObservedInInitialPrefetch;
	RecyclerView mRecyclerView;
	boolean mRequestedSimpleAnimations;
	 mSmoothScroller;
	ViewBoundsCheck mVerticalBoundCheck;
	private final ViewBoundsCheck.Callback mVerticalBoundCheckCallback = new ViewBoundsCheck.Callback() {

		public View getChildAt(int i)
		{
			return RecyclerView.LayoutManager.this.getChildAt(i);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #25  <Method View RecyclerView$LayoutManager.getChildAt(int)>
		//    4    8:areturn         
		}

		public int getChildCount()
		{
			return RecyclerView.LayoutManager.this.getChildCount();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    2    4:invokevirtual   #29  <Method int RecyclerView$LayoutManager.getChildCount()>
		//    3    7:ireturn         
		}

		public int getChildEnd(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #37  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #39  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return getDecoratedBottom(view) + layoutparams.bottomMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #42  <Method int RecyclerView$LayoutManager.getDecoratedBottom(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #46  <Field int RecyclerView$LayoutParams.bottomMargin>
		//   10   20:iadd            
		//   11   21:ireturn         
		}

		public int getChildStart(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #37  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #39  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return getDecoratedTop(view) - layoutparams.topMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #50  <Method int RecyclerView$LayoutManager.getDecoratedTop(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #53  <Field int RecyclerView$LayoutParams.topMargin>
		//   10   20:isub            
		//   11   21:ireturn         
		}

		public View getParent()
		{
			return ((View) (mRecyclerView));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    2    4:getfield        #59  <Field RecyclerView RecyclerView$LayoutManager.mRecyclerView>
		//    3    7:areturn         
		}

		public int getParentEnd()
		{
			return getHeight() - getPaddingBottom();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    2    4:invokevirtual   #63  <Method int RecyclerView$LayoutManager.getHeight()>
		//    3    7:aload_0         
		//    4    8:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    5   11:invokevirtual   #66  <Method int RecyclerView$LayoutManager.getPaddingBottom()>
		//    6   14:isub            
		//    7   15:ireturn         
		}

		public int getParentStart()
		{
			return getPaddingTop();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$LayoutManager this$0>
		//    2    4:invokevirtual   #70  <Method int RecyclerView$LayoutManager.getPaddingTop()>
		//    3    7:ireturn         
		}

		final RecyclerView.LayoutManager this$0;

			
			{
				this$0 = RecyclerView.LayoutManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RecyclerView$LayoutManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private int mWidth;
	private int mWidthMode;


/*
	static void access$1200(RecyclerView$LayoutManager recyclerview$layoutmanager,  )
	{
		recyclerview$layoutmanager.onSmoothScrollerStopped();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #81  <Method void onSmoothScrollerStopped(RecyclerView$SmoothScroller)>
		return;
	//    3    5:return          
	}

*/

	public RecyclerView$LayoutManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #9   <Class RecyclerView$LayoutManager$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #50  <Method void RecyclerView$LayoutManager$1(RecyclerView$LayoutManager)>
	//    7   13:putfield        #52  <Field ViewBoundsCheck$Callback mHorizontalBoundCheckCallback>
	//    8   16:aload_0         
	//    9   17:new             #11  <Class RecyclerView$LayoutManager$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #53  <Method void RecyclerView$LayoutManager$2(RecyclerView$LayoutManager)>
	//   13   25:putfield        #55  <Field ViewBoundsCheck$Callback mVerticalBoundCheckCallback>
		mHorizontalBoundCheck = new ViewBoundsCheck(mHorizontalBoundCheckCallback);
	//   14   28:aload_0         
	//   15   29:new             #57  <Class ViewBoundsCheck>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:getfield        #52  <Field ViewBoundsCheck$Callback mHorizontalBoundCheckCallback>
	//   19   37:invokespecial   #60  <Method void ViewBoundsCheck(ViewBoundsCheck$Callback)>
	//   20   40:putfield        #62  <Field ViewBoundsCheck mHorizontalBoundCheck>
		mVerticalBoundCheck = new ViewBoundsCheck(mVerticalBoundCheckCallback);
	//   21   43:aload_0         
	//   22   44:new             #57  <Class ViewBoundsCheck>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:getfield        #55  <Field ViewBoundsCheck$Callback mVerticalBoundCheckCallback>
	//   26   52:invokespecial   #60  <Method void ViewBoundsCheck(ViewBoundsCheck$Callback)>
	//   27   55:putfield        #64  <Field ViewBoundsCheck mVerticalBoundCheck>
		mRequestedSimpleAnimations = false;
	//   28   58:aload_0         
	//   29   59:iconst_0        
	//   30   60:putfield        #66  <Field boolean mRequestedSimpleAnimations>
		mIsAttachedToWindow = false;
	//   31   63:aload_0         
	//   32   64:iconst_0        
	//   33   65:putfield        #68  <Field boolean mIsAttachedToWindow>
		mAutoMeasure = false;
	//   34   68:aload_0         
	//   35   69:iconst_0        
	//   36   70:putfield        #70  <Field boolean mAutoMeasure>
		mMeasurementCacheEnabled = true;
	//   37   73:aload_0         
	//   38   74:iconst_1        
	//   39   75:putfield        #72  <Field boolean mMeasurementCacheEnabled>
		mItemPrefetchEnabled = true;
	//   40   78:aload_0         
	//   41   79:iconst_1        
	//   42   80:putfield        #74  <Field boolean mItemPrefetchEnabled>
	//   43   83:return          
	}
}
