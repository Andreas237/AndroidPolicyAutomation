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
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
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
		RecyclerView.ViewHolder viewholder;
		RecyclerView.LayoutParams layoutparams;
		viewholder = RecyclerView.getChildViewHolderInt(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore          6
		if(flag || viewholder.isRemoved())
	//*   3    6:iload_3         
	//*   4    7:ifne            18
	//*   5   10:aload           6
	//*   6   12:invokevirtual   #93  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*   7   15:ifeq            105
			mRecyclerView.mViewInfoStore.addToDisappearedInLayout(viewholder);
	//    8   18:aload_0         
	//    9   19:getfield        #95  <Field RecyclerView mRecyclerView>
	//   10   22:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   11   25:aload           6
	//   12   27:invokevirtual   #105 <Method void ViewInfoStore.addToDisappearedInLayout(RecyclerView$ViewHolder)>
		else
	//*  13   30:aload_1         
	//*  14   31:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  15   34:checkcast       #113 <Class RecyclerView$LayoutParams>
	//*  16   37:astore          7
	//*  17   39:aload           6
	//*  18   41:invokevirtual   #116 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  19   44:ifne            55
	//*  20   47:aload           6
	//*  21   49:invokevirtual   #119 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*  22   52:ifeq            128
	//*  23   55:aload           6
	//*  24   57:invokevirtual   #119 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*  25   60:ifeq            120
	//*  26   63:aload           6
	//*  27   65:invokevirtual   #122 <Method void RecyclerView$ViewHolder.unScrap()>
	//*  28   68:aload_0         
	//*  29   69:getfield        #124 <Field ChildHelper mChildHelper>
	//*  30   72:aload_1         
	//*  31   73:iload_2         
	//*  32   74:aload_1         
	//*  33   75:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  34   78:iconst_0        
	//*  35   79:invokevirtual   #130 <Method void ChildHelper.attachViewToParent(View, int, android.view.ViewGroup$LayoutParams, boolean)>
	//*  36   82:aload           7
	//*  37   84:getfield        #133 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
	//*  38   87:ifeq            104
	//*  39   90:aload           6
	//*  40   92:getfield        #137 <Field View RecyclerView$ViewHolder.itemView>
	//*  41   95:invokevirtual   #140 <Method void View.invalidate()>
	//*  42   98:aload           7
	//*  43  100:iconst_0        
	//*  44  101:putfield        #133 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
	//*  45  104:return          
			mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(viewholder);
	//   46  105:aload_0         
	//   47  106:getfield        #95  <Field RecyclerView mRecyclerView>
	//   48  109:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   49  112:aload           6
	//   50  114:invokevirtual   #143 <Method void ViewInfoStore.removeFromDisappearedInLayout(RecyclerView$ViewHolder)>
		layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		if(!viewholder.wasReturnedFromScrap() && !viewholder.isScrap()) goto _L2; else goto _L1
_L1:
		if(viewholder.isScrap())
			viewholder.unScrap();
		else
	//*  51  117:goto            30
			viewholder.clearReturnedFromScrapFlag();
	//   52  120:aload           6
	//   53  122:invokevirtual   #146 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
		mChildHelper.attachViewToParent(view, i, view.getLayoutParams(), false);
_L4:
		if(layoutparams.mPendingInvalidate)
		{
			viewholder.itemView.invalidate();
			layoutparams.mPendingInvalidate = false;
		}
		return;
	//*  54  125:goto            68
_L2:
		if(view.getParent() == mRecyclerView)
	//*  55  128:aload_1         
	//*  56  129:invokevirtual   #150 <Method android.view.ViewParent View.getParent()>
	//*  57  132:aload_0         
	//*  58  133:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  59  136:if_acmpne       240
		{
			int k = mChildHelper.indexOfChild(view);
	//   60  139:aload_0         
	//   61  140:getfield        #124 <Field ChildHelper mChildHelper>
	//   62  143:aload_1         
	//   63  144:invokevirtual   #154 <Method int ChildHelper.indexOfChild(View)>
	//   64  147:istore          5
			int j = i;
	//   65  149:iload_2         
	//   66  150:istore          4
			if(i == -1)
	//*  67  152:iload_2         
	//*  68  153:iconst_m1       
	//*  69  154:icmpne          166
				j = mChildHelper.getChildCount();
	//   70  157:aload_0         
	//   71  158:getfield        #124 <Field ChildHelper mChildHelper>
	//   72  161:invokevirtual   #158 <Method int ChildHelper.getChildCount()>
	//   73  164:istore          4
			if(k == -1)
	//*  74  166:iload           5
	//*  75  168:iconst_m1       
	//*  76  169:icmpne          216
				throw new IllegalStateException((new StringBuilder()).append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:").append(mRecyclerView.indexOfChild(view)).append(mRecyclerView.exceptionLabel()).toString());
	//   77  172:new             #160 <Class IllegalStateException>
	//   78  175:dup             
	//   79  176:new             #162 <Class StringBuilder>
	//   80  179:dup             
	//   81  180:invokespecial   #163 <Method void StringBuilder()>
	//   82  183:ldc1            #165 <String "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:">
	//   83  185:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   84  188:aload_0         
	//   85  189:getfield        #95  <Field RecyclerView mRecyclerView>
	//   86  192:aload_1         
	//   87  193:invokevirtual   #170 <Method int RecyclerView.indexOfChild(View)>
	//   88  196:invokevirtual   #173 <Method StringBuilder StringBuilder.append(int)>
	//   89  199:aload_0         
	//   90  200:getfield        #95  <Field RecyclerView mRecyclerView>
	//   91  203:invokevirtual   #177 <Method String RecyclerView.exceptionLabel()>
	//   92  206:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   93  209:invokevirtual   #180 <Method String StringBuilder.toString()>
	//   94  212:invokespecial   #183 <Method void IllegalStateException(String)>
	//   95  215:athrow          
			if(k != j)
	//*  96  216:iload           5
	//*  97  218:iload           4
	//*  98  220:icmpeq          82
				mRecyclerView.mLayout.moveView(k, j);
	//   99  223:aload_0         
	//  100  224:getfield        #95  <Field RecyclerView mRecyclerView>
	//  101  227:getfield        #187 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//  102  230:iload           5
	//  103  232:iload           4
	//  104  234:invokevirtual   #191 <Method void moveView(int, int)>
		} else
	//* 105  237:goto            82
		{
			mChildHelper.addView(view, i, false);
	//  106  240:aload_0         
	//  107  241:getfield        #124 <Field ChildHelper mChildHelper>
	//  108  244:aload_1         
	//  109  245:iload_2         
	//  110  246:iconst_0        
	//  111  247:invokevirtual   #194 <Method void ChildHelper.addView(View, int, boolean)>
			layoutparams.mInsetsDirty = true;
	//  112  250:aload           7
	//  113  252:iconst_1        
	//  114  253:putfield        #197 <Field boolean RecyclerView$LayoutParams.mInsetsDirty>
			if(mSmoothScroller != null && mSmoothScroller.isRunning())
	//* 115  256:aload_0         
	//* 116  257:getfield        #199 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//* 117  260:ifnull          82
	//* 118  263:aload_0         
	//* 119  264:getfield        #199 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//* 120  267:invokevirtual   #204 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//* 121  270:ifeq            82
				mSmoothScroller.onChildAttachedToWindow(view);
	//  122  273:aload_0         
	//  123  274:getfield        #199 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//  124  277:aload_1         
	//  125  278:invokevirtual   #208 <Method void RecyclerView$SmoothScroller.onChildAttachedToWindow(View)>
		}
		if(true) goto _L4; else goto _L3
	//  126  281:goto            82
_L3:
	}

	public static int chooseSize(int i, int j, int k)
	{
		int i1 = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #216 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          4
		int l = android.view.View.MeasureSpec.getSize(i);
	//    3    6:iload_0         
	//    4    7:invokestatic    #219 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore_3        
		i = l;
	//    6   11:iload_3         
	//    7   12:istore_0        
		switch(i1)
	//*   8   13:iload           4
		{
	//*   9   15:lookupswitch    2: default 40
	//	               -2147483648: 48
	//	               1073741824: 46
		default:
			i = Math.max(j, k);
	//   10   40:iload_1         
	//   11   41:iload_2         
	//   12   42:invokestatic    #225 <Method int Math.max(int, int)>
	//   13   45:istore_0        
			// fall through

		case 1073741824: 
			return i;
	//   14   46:iload_0         
	//   15   47:ireturn         

		case -2147483648: 
			return Math.min(l, Math.max(j, k));
	//   16   48:iload_3         
	//   17   49:iload_1         
	//   18   50:iload_2         
	//   19   51:invokestatic    #225 <Method int Math.max(int, int)>
	//   20   54:invokestatic    #228 <Method int Math.min(int, int)>
	//   21   57:ireturn         
		}
	}

	private void detachViewInternal(int i, View view)
	{
		mChildHelper.detachViewFromParent(i);
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field ChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #234 <Method void ChildHelper.detachViewFromParent(int)>
	//    4    8:return          
	}

	public static int getChildMeasureSpec(int i, int j, int k, int l, boolean flag)
	{
		int i1;
		i1 = Math.max(0, i - k);
	//    0    0:iconst_0        
	//    1    1:iload_0         
	//    2    2:iload_2         
	//    3    3:isub            
	//    4    4:invokestatic    #225 <Method int Math.max(int, int)>
	//    5    7:istore          5
		k = 0;
	//    6    9:iconst_0        
	//    7   10:istore_2        
		i = 0;
	//    8   11:iconst_0        
	//    9   12:istore_0        
		if(!flag) goto _L2; else goto _L1
	//   10   13:iload           4
	//   11   15:ifeq            103
_L1:
		if(l < 0) goto _L4; else goto _L3
	//   12   18:iload_3         
	//   13   19:iflt            33
_L3:
		k = l;
	//   14   22:iload_3         
	//   15   23:istore_2        
		i = 0x40000000;
	//   16   24:ldc1            #237 <Int 0x40000000>
	//   17   26:istore_0        
_L6:
		return android.view.View.MeasureSpec.makeMeasureSpec(k, i);
	//   18   27:iload_2         
	//   19   28:iload_0         
	//   20   29:invokestatic    #240 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   21   32:ireturn         
_L4:
		if(l == -1)
	//*  22   33:iload_3         
	//*  23   34:iconst_m1       
	//*  24   35:icmpne          90
			switch(j)
	//*  25   38:iload_1         
			{
	//*  26   39:lookupswitch    3: default 72
	//	               -2147483648: 75
	//	               0: 83
	//	               1073741824: 75
	//*  27   72:goto            27
			case -2147483648: 
			case 1073741824: 
				k = i1;
	//   28   75:iload           5
	//   29   77:istore_2        
				i = j;
	//   30   78:iload_1         
	//   31   79:istore_0        
				break;

	//*  32   80:goto            27
			case 0: // '\0'
				k = 0;
	//   33   83:iconst_0        
	//   34   84:istore_2        
				i = 0;
	//   35   85:iconst_0        
	//   36   86:istore_0        
				break;
			}
		else
	//*  37   87:goto            27
		if(l == -2)
	//*  38   90:iload_3         
	//*  39   91:bipush          -2
	//*  40   93:icmpne          27
		{
			k = 0;
	//   41   96:iconst_0        
	//   42   97:istore_2        
			i = 0;
	//   43   98:iconst_0        
	//   44   99:istore_0        
		}
		continue; /* Loop/switch isn't completed */
	//   45  100:goto            27
_L2:
		if(l >= 0)
	//*  46  103:iload_3         
	//*  47  104:iflt            115
		{
			k = l;
	//   48  107:iload_3         
	//   49  108:istore_2        
			i = 0x40000000;
	//   50  109:ldc1            #237 <Int 0x40000000>
	//   51  111:istore_0        
		} else
	//*  52  112:goto            27
		if(l == -1)
	//*  53  115:iload_3         
	//*  54  116:iconst_m1       
	//*  55  117:icmpne          128
		{
			k = i1;
	//   56  120:iload           5
	//   57  122:istore_2        
			i = j;
	//   58  123:iload_1         
	//   59  124:istore_0        
		} else
	//*  60  125:goto            27
		if(l == -2)
	//*  61  128:iload_3         
	//*  62  129:bipush          -2
	//*  63  131:icmpne          27
		{
			k = i1;
	//   64  134:iload           5
	//   65  136:istore_2        
			if(j == 0x80000000 || j == 0x40000000)
	//*  66  137:iload_1         
	//*  67  138:ldc1            #241 <Int 0x80000000>
	//*  68  140:icmpeq          149
	//*  69  143:iload_1         
	//*  70  144:ldc1            #237 <Int 0x40000000>
	//*  71  146:icmpne          155
				i = 0x80000000;
	//   72  149:ldc1            #241 <Int 0x80000000>
	//   73  151:istore_0        
			else
	//*  74  152:goto            27
				i = 0;
	//   75  155:iconst_0        
	//   76  156:istore_0        
		}
		if(true) goto _L6; else goto _L5
_L5:
	//*  77  157:goto            27
	}

	public static int getChildMeasureSpec(int i, int j, int k, boolean flag)
	{
		int l;
		l = Math.max(0, i - j);
	//    0    0:iconst_0        
	//    1    1:iload_0         
	//    2    2:iload_1         
	//    3    3:isub            
	//    4    4:invokestatic    #225 <Method int Math.max(int, int)>
	//    5    7:istore          4
		j = 0;
	//    6    9:iconst_0        
	//    7   10:istore_1        
		i = 0;
	//    8   11:iconst_0        
	//    9   12:istore_0        
		if(!flag) goto _L2; else goto _L1
	//   10   13:iload_3         
	//   11   14:ifeq            39
_L1:
		if(k >= 0)
	//*  12   17:iload_2         
	//*  13   18:iflt            32
		{
			j = k;
	//   14   21:iload_2         
	//   15   22:istore_1        
			i = 0x40000000;
	//   16   23:ldc1            #237 <Int 0x40000000>
	//   17   25:istore_0        
		} else
	//*  18   26:iload_1         
	//*  19   27:iload_0         
	//*  20   28:invokestatic    #240 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  21   31:ireturn         
		{
			j = 0;
	//   22   32:iconst_0        
	//   23   33:istore_1        
			i = 0;
	//   24   34:iconst_0        
	//   25   35:istore_0        
		}
_L4:
		return android.view.View.MeasureSpec.makeMeasureSpec(j, i);
	//*  26   36:goto            26
_L2:
		if(k >= 0)
	//*  27   39:iload_2         
	//*  28   40:iflt            51
		{
			j = k;
	//   29   43:iload_2         
	//   30   44:istore_1        
			i = 0x40000000;
	//   31   45:ldc1            #237 <Int 0x40000000>
	//   32   47:istore_0        
		} else
	//*  33   48:goto            26
		if(k == -1)
	//*  34   51:iload_2         
	//*  35   52:iconst_m1       
	//*  36   53:icmpne          65
		{
			j = l;
	//   37   56:iload           4
	//   38   58:istore_1        
			i = 0x40000000;
	//   39   59:ldc1            #237 <Int 0x40000000>
	//   40   61:istore_0        
		} else
	//*  41   62:goto            26
		if(k == -2)
	//*  42   65:iload_2         
	//*  43   66:bipush          -2
	//*  44   68:icmpne          26
		{
			j = l;
	//   45   71:iload           4
	//   46   73:istore_1        
			i = 0x80000000;
	//   47   74:ldc1            #241 <Int 0x80000000>
	//   48   76:istore_0        
		}
		if(true) goto _L4; else goto _L3
	//   49   77:goto            26
_L3:
	}

	private int[] getChildRectangleOnScreenScrollAmount(RecyclerView recyclerview, View view, Rect rect, boolean flag)
	{
		int k1 = getPaddingLeft();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #249 <Method int getPaddingLeft()>
	//    2    4:istore          11
		int l = getPaddingTop();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #252 <Method int getPaddingTop()>
	//    5   10:istore          8
		int l1 = getWidth() - getPaddingRight();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #255 <Method int getWidth()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #258 <Method int getPaddingRight()>
	//   10   20:isub            
	//   11   21:istore          12
		int j1 = getHeight();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #261 <Method int getHeight()>
	//   14   27:istore          10
		int k2 = getPaddingBottom();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #264 <Method int getPaddingBottom()>
	//   17   33:istore          15
		int i2 = (view.getLeft() + rect.left) - view.getScrollX();
	//   18   35:aload_2         
	//   19   36:invokevirtual   #267 <Method int View.getLeft()>
	//   20   39:aload_3         
	//   21   40:getfield        #272 <Field int Rect.left>
	//   22   43:iadd            
	//   23   44:aload_2         
	//   24   45:invokevirtual   #275 <Method int View.getScrollX()>
	//   25   48:isub            
	//   26   49:istore          13
		int i1 = (view.getTop() + rect.top) - view.getScrollY();
	//   27   51:aload_2         
	//   28   52:invokevirtual   #278 <Method int View.getTop()>
	//   29   55:aload_3         
	//   30   56:getfield        #281 <Field int Rect.top>
	//   31   59:iadd            
	//   32   60:aload_2         
	//   33   61:invokevirtual   #284 <Method int View.getScrollY()>
	//   34   64:isub            
	//   35   65:istore          9
		int j2 = i2 + rect.width();
	//   36   67:iload           13
	//   37   69:aload_3         
	//   38   70:invokevirtual   #287 <Method int Rect.width()>
	//   39   73:iadd            
	//   40   74:istore          14
		int l2 = rect.height();
	//   41   76:aload_3         
	//   42   77:invokevirtual   #290 <Method int Rect.height()>
	//   43   80:istore          16
		int i = Math.min(0, i2 - k1);
	//   44   82:iconst_0        
	//   45   83:iload           13
	//   46   85:iload           11
	//   47   87:isub            
	//   48   88:invokestatic    #228 <Method int Math.min(int, int)>
	//   49   91:istore          5
		int j = Math.min(0, i1 - l);
	//   50   93:iconst_0        
	//   51   94:iload           9
	//   52   96:iload           8
	//   53   98:isub            
	//   54   99:invokestatic    #228 <Method int Math.min(int, int)>
	//   55  102:istore          6
		int k = Math.max(0, j2 - l1);
	//   56  104:iconst_0        
	//   57  105:iload           14
	//   58  107:iload           12
	//   59  109:isub            
	//   60  110:invokestatic    #225 <Method int Math.max(int, int)>
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
	//   70  127:invokestatic    #225 <Method int Math.max(int, int)>
	//   71  130:istore          10
		if(getLayoutDirection() == 1)
	//*  72  132:aload_0         
	//*  73  133:invokevirtual   #293 <Method int getLayoutDirection()>
	//*  74  136:iconst_1        
	//*  75  137:icmpne          183
		{
			if(k != 0)
	//*  76  140:iload           7
	//*  77  142:ifeq            168
				i = k;
	//   78  145:iload           7
	//   79  147:istore          5
			else
	//*  80  149:iload           6
	//*  81  151:ifeq            206
	//*  82  154:iconst_2        
	//*  83  155:newarray        int[]
	//*  84  157:dup             
	//*  85  158:iconst_0        
	//*  86  159:iload           5
	//*  87  161:iastore         
	//*  88  162:dup             
	//*  89  163:iconst_1        
	//*  90  164:iload           6
	//*  91  166:iastore         
	//*  92  167:areturn         
				i = Math.max(i, j2 - l1);
	//   93  168:iload           5
	//   94  170:iload           14
	//   95  172:iload           12
	//   96  174:isub            
	//   97  175:invokestatic    #225 <Method int Math.max(int, int)>
	//   98  178:istore          5
		} else
	//*  99  180:goto            149
		if(i == 0)
	//* 100  183:iload           5
	//* 101  185:ifeq            191
	//* 102  188:goto            149
			i = Math.min(i2 - k1, k);
	//  103  191:iload           13
	//  104  193:iload           11
	//  105  195:isub            
	//  106  196:iload           7
	//  107  198:invokestatic    #228 <Method int Math.min(int, int)>
	//  108  201:istore          5
		if(j == 0)
	//* 109  203:goto            188
			j = Math.min(i1 - l, j1);
	//  110  206:iload           9
	//  111  208:iload           8
	//  112  210:isub            
	//  113  211:iload           10
	//  114  213:invokestatic    #228 <Method int Math.min(int, int)>
	//  115  216:istore          6
		return (new int[] {
			i, j
		});
	//* 116  218:goto            154
	}

	public static Properties getProperties(Context context, AttributeSet attributeset, int i, int j)
	{
		Properties properties = new Properties();
	//    0    0:new             #16  <Class RecyclerView$LayoutManager$Properties>
	//    1    3:dup             
	//    2    4:invokespecial   #296 <Method void RecyclerView$LayoutManager$Properties()>
	//    3    7:astore          4
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.recyclerview.R.styleable.RecyclerView, i, j)));
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:getstatic       #302 <Field int[] android.support.v7.recyclerview.R$styleable.RecyclerView>
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokevirtual   #308 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   10   19:astore_0        
		properties.orientation = ((TypedArray) (context)).getInt(android.support.v7.recyclerview.R.styleable.RecyclerView_android_orientation, 1);
	//   11   20:aload           4
	//   12   22:aload_0         
	//   13   23:getstatic       #311 <Field int android.support.v7.recyclerview.R$styleable.RecyclerView_android_orientation>
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #316 <Method int TypedArray.getInt(int, int)>
	//   16   30:putfield        #319 <Field int RecyclerView$LayoutManager$Properties.orientation>
		properties.spanCount = ((TypedArray) (context)).getInt(android.support.v7.recyclerview.R.styleable.RecyclerView_spanCount, 1);
	//   17   33:aload           4
	//   18   35:aload_0         
	//   19   36:getstatic       #322 <Field int android.support.v7.recyclerview.R$styleable.RecyclerView_spanCount>
	//   20   39:iconst_1        
	//   21   40:invokevirtual   #316 <Method int TypedArray.getInt(int, int)>
	//   22   43:putfield        #325 <Field int RecyclerView$LayoutManager$Properties.spanCount>
		properties.reverseLayout = ((TypedArray) (context)).getBoolean(android.support.v7.recyclerview.R.styleable.RecyclerView_reverseLayout, false);
	//   23   46:aload           4
	//   24   48:aload_0         
	//   25   49:getstatic       #328 <Field int android.support.v7.recyclerview.R$styleable.RecyclerView_reverseLayout>
	//   26   52:iconst_0        
	//   27   53:invokevirtual   #332 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   28   56:putfield        #335 <Field boolean RecyclerView$LayoutManager$Properties.reverseLayout>
		properties.stackFromEnd = ((TypedArray) (context)).getBoolean(android.support.v7.recyclerview.R.styleable.RecyclerView_stackFromEnd, false);
	//   29   59:aload           4
	//   30   61:aload_0         
	//   31   62:getstatic       #338 <Field int android.support.v7.recyclerview.R$styleable.RecyclerView_stackFromEnd>
	//   32   65:iconst_0        
	//   33   66:invokevirtual   #332 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   34   69:putfield        #341 <Field boolean RecyclerView$LayoutManager$Properties.stackFromEnd>
		((TypedArray) (context)).recycle();
	//   35   72:aload_0         
	//   36   73:invokevirtual   #344 <Method void TypedArray.recycle()>
		return properties;
	//   37   76:aload           4
	//   38   78:areturn         
	}

	private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerview, int i, int j)
	{
		recyclerview = ((RecyclerView) (recyclerview.getFocusedChild()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #350 <Method View RecyclerView.getFocusedChild()>
	//    2    4:astore_1        
		if(recyclerview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
	//*   5    9:iconst_0        
	//*   6   10:ireturn         
		{
			int k = getPaddingLeft();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #249 <Method int getPaddingLeft()>
	//    9   15:istore          4
			int l = getPaddingTop();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #252 <Method int getPaddingTop()>
	//   12   21:istore          5
			int i1 = getWidth();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #255 <Method int getWidth()>
	//   15   27:istore          6
			int j1 = getPaddingRight();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #258 <Method int getPaddingRight()>
	//   18   33:istore          7
			int k1 = getHeight();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #261 <Method int getHeight()>
	//   21   39:istore          8
			int l1 = getPaddingBottom();
	//   22   41:aload_0         
	//   23   42:invokevirtual   #264 <Method int getPaddingBottom()>
	//   24   45:istore          9
			Rect rect = mRecyclerView.mTempRect;
	//   25   47:aload_0         
	//   26   48:getfield        #95  <Field RecyclerView mRecyclerView>
	//   27   51:getfield        #354 <Field Rect RecyclerView.mTempRect>
	//   28   54:astore          10
			getDecoratedBoundsWithMargins(((View) (recyclerview)), rect);
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:aload           10
	//   32   60:invokevirtual   #358 <Method void getDecoratedBoundsWithMargins(View, Rect)>
			if(rect.left - i < i1 - j1 && rect.right - i > k && rect.top - j < k1 - l1 && rect.bottom - j > l)
	//*  33   63:aload           10
	//*  34   65:getfield        #272 <Field int Rect.left>
	//*  35   68:iload_2         
	//*  36   69:isub            
	//*  37   70:iload           6
	//*  38   72:iload           7
	//*  39   74:isub            
	//*  40   75:icmpge          9
	//*  41   78:aload           10
	//*  42   80:getfield        #361 <Field int Rect.right>
	//*  43   83:iload_2         
	//*  44   84:isub            
	//*  45   85:iload           4
	//*  46   87:icmple          9
	//*  47   90:aload           10
	//*  48   92:getfield        #281 <Field int Rect.top>
	//*  49   95:iload_3         
	//*  50   96:isub            
	//*  51   97:iload           8
	//*  52   99:iload           9
	//*  53  101:isub            
	//*  54  102:icmpge          9
	//*  55  105:aload           10
	//*  56  107:getfield        #364 <Field int Rect.bottom>
	//*  57  110:iload_3         
	//*  58  111:isub            
	//*  59  112:iload           5
	//*  60  114:icmple          9
				return true;
	//   61  117:iconst_1        
	//   62  118:ireturn         
		}
		return false;
	}

	private static boolean isMeasurementUpToDate(int i, int j, int k)
	{
		int l;
		boolean flag1;
		flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		l = android.view.View.MeasureSpec.getMode(j);
	//    2    3:iload_1         
	//    3    4:invokestatic    #216 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    4    7:istore_3        
		j = android.view.View.MeasureSpec.getSize(j);
	//    5    8:iload_1         
	//    6    9:invokestatic    #219 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    7   12:istore_1        
		if(k <= 0 || i == k) goto _L2; else goto _L1
	//    8   13:iload_2         
	//    9   14:ifle            28
	//   10   17:iload_0         
	//   11   18:iload_2         
	//   12   19:icmpeq          28
_L1:
		boolean flag = false;
	//   13   22:iconst_0        
	//   14   23:istore          4
_L4:
		return flag;
	//   15   25:iload           4
	//   16   27:ireturn         
_L2:
		flag = flag1;
	//   17   28:iload           5
	//   18   30:istore          4
		switch(l)
	//*  19   32:iload_3         
		{
	//*  20   33:lookupswitch    3: default 68
	//	               -2147483648: 70
	//	               0: 25
	//	               1073741824: 81
		default:
			return false;
	//   21   68:iconst_0        
	//   22   69:ireturn         

		case 0: // '\0'
			break;

		case -2147483648: 
			flag = flag1;
	//   23   70:iload           5
	//   24   72:istore          4
			if(j < i)
	//*  25   74:iload_1         
	//*  26   75:iload_0         
	//*  27   76:icmpge          25
				return false;
	//   28   79:iconst_0        
	//   29   80:ireturn         
			break;

		case 1073741824: 
			flag = flag1;
	//   30   81:iload           5
	//   31   83:istore          4
			continue; /* Loop/switch isn't completed */
		}
		if(true) goto _L4; else goto _L3
_L3:
		if(j == i) goto _L4; else goto _L5
	//   32   85:iload_1         
	//   33   86:iload_0         
	//   34   87:icmpeq          25
_L5:
		return false;
	//   35   90:iconst_0        
	//   36   91:ireturn         
	}

	private void onSmoothScrollerStopped( )
	{
		if(mSmoothScroller == )
	//*   0    0:aload_0         
	//*   1    1:getfield        #199 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       13
			mSmoothScroller = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #199 <Field RecyclerView$SmoothScroller mSmoothScroller>
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
	//*   4    8:invokevirtual   #371 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		if(viewholder.isInvalid() && !viewholder.isRemoved() && !mRecyclerView.mAdapter.hasStableIds())
	//*   7   15:aload           4
	//*   8   17:invokevirtual   #374 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*   9   20:ifeq            56
	//*  10   23:aload           4
	//*  11   25:invokevirtual   #93  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  12   28:ifne            56
	//*  13   31:aload_0         
	//*  14   32:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  15   35:getfield        #378 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  16   38:invokevirtual   #383 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  17   41:ifne            56
		{
			removeViewAt(i);
	//   18   44:aload_0         
	//   19   45:iload_2         
	//   20   46:invokevirtual   #386 <Method void removeViewAt(int)>
			recycler.recycleViewHolderInternal(viewholder);
	//   21   49:aload_1         
	//   22   50:aload           4
	//   23   52:invokevirtual   #391 <Method void RecyclerView$Recycler.recycleViewHolderInternal(RecyclerView$ViewHolder)>
			return;
	//   24   55:return          
		} else
		{
			detachViewAt(i);
	//   25   56:aload_0         
	//   26   57:iload_2         
	//   27   58:invokevirtual   #394 <Method void detachViewAt(int)>
			recycler.scrapView(view);
	//   28   61:aload_1         
	//   29   62:aload_3         
	//   30   63:invokevirtual   #397 <Method void RecyclerView$Recycler.scrapView(View)>
			mRecyclerView.mViewInfoStore.onViewDetached(viewholder);
	//   31   66:aload_0         
	//   32   67:getfield        #95  <Field RecyclerView mRecyclerView>
	//   33   70:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   34   73:aload           4
	//   35   75:invokevirtual   #400 <Method void ViewInfoStore.onViewDetached(RecyclerView$ViewHolder)>
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
	//    3    3:invokevirtual   #404 <Method void addDisappearingView(View, int)>
	//    4    6:return          
	}

	public void addDisappearingView(View view, int i)
	{
		addViewInt(view, i, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #406 <Method void addViewInt(View, int, boolean)>
	//    5    7:return          
	}

	public void addView(View view)
	{
		addView(view, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #408 <Method void addView(View, int)>
	//    4    6:return          
	}

	public void addView(View view, int i)
	{
		addViewInt(view, i, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #406 <Method void addViewInt(View, int, boolean)>
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
	//    6   12:invokevirtual   #411 <Method void RecyclerView.assertInLayoutOrScroll(String)>
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
	//    6   12:invokevirtual   #414 <Method void RecyclerView.assertNotInLayoutOrScroll(String)>
	//    7   15:return          
	}

	public void attachView(View view)
	{
		attachView(view, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #417 <Method void attachView(View, int)>
	//    4    6:return          
	}

	public void attachView(View view, int i)
	{
		attachView(view, i, (RecyclerView.LayoutParams)view.getLayoutParams());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    5    7:checkcast       #113 <Class RecyclerView$LayoutParams>
	//    6   10:invokevirtual   #420 <Method void attachView(View, int, RecyclerView$LayoutParams)>
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
	//*   5   11:ifeq            42
			mRecyclerView.mViewInfoStore.addToDisappearedInLayout(viewholder);
	//    6   14:aload_0         
	//    7   15:getfield        #95  <Field RecyclerView mRecyclerView>
	//    8   18:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//    9   21:aload           4
	//   10   23:invokevirtual   #105 <Method void ViewInfoStore.addToDisappearedInLayout(RecyclerView$ViewHolder)>
		else
	//*  11   26:aload_0         
	//*  12   27:getfield        #124 <Field ChildHelper mChildHelper>
	//*  13   30:aload_1         
	//*  14   31:iload_2         
	//*  15   32:aload_3         
	//*  16   33:aload           4
	//*  17   35:invokevirtual   #93  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  18   38:invokevirtual   #130 <Method void ChildHelper.attachViewToParent(View, int, android.view.ViewGroup$LayoutParams, boolean)>
	//*  19   41:return          
			mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(viewholder);
	//   20   42:aload_0         
	//   21   43:getfield        #95  <Field RecyclerView mRecyclerView>
	//   22   46:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   23   49:aload           4
	//   24   51:invokevirtual   #143 <Method void ViewInfoStore.removeFromDisappearedInLayout(RecyclerView$ViewHolder)>
		mChildHelper.attachViewToParent(view, i, ((android.view.ViewGroup.LayoutParams) (layoutparams)), viewholder.isRemoved());
	//*  25   54:goto            26
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
	//    8   12:invokevirtual   #425 <Method void Rect.set(int, int, int, int)>
			return;
	//    9   15:return          
		} else
		{
			rect.set(mRecyclerView.getItemDecorInsetsForChild(view));
	//   10   16:aload_2         
	//   11   17:aload_0         
	//   12   18:getfield        #95  <Field RecyclerView mRecyclerView>
	//   13   21:aload_1         
	//   14   22:invokevirtual   #429 <Method Rect RecyclerView.getItemDecorInsetsForChild(View)>
	//   15   25:invokevirtual   #432 <Method void Rect.set(Rect)>
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
	//*   1    1:invokevirtual   #450 <Method int getChildCount()>
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
	//   12   16:invokevirtual   #454 <Method View getChildAt(int)>
	//   13   19:invokespecial   #456 <Method void scrapOrRecycleView(RecyclerView$Recycler, int, View)>

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
	//    3    3:getfield        #124 <Field ChildHelper mChildHelper>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #154 <Method int ChildHelper.indexOfChild(View)>
	//    6   10:aload_1         
	//    7   11:invokespecial   #456 <Method void scrapOrRecycleView(RecyclerView$Recycler, int, View)>
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
	//    5    5:invokevirtual   #454 <Method View getChildAt(int)>
	//    6    8:invokespecial   #456 <Method void scrapOrRecycleView(RecyclerView$Recycler, int, View)>
	//    7   11:return          
	}

	public void detachView(View view)
	{
		int i = mChildHelper.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field ChildHelper mChildHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #154 <Method int ChildHelper.indexOfChild(View)>
	//    4    8:istore_2        
		if(i >= 0)
	//*   5    9:iload_2         
	//*   6   10:iflt            19
			detachViewInternal(i, view);
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:aload_1         
	//   10   16:invokespecial   #463 <Method void detachViewInternal(int, View)>
	//   11   19:return          
	}

	public void detachViewAt(int i)
	{
		detachViewInternal(i, getChildAt(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokevirtual   #454 <Method View getChildAt(int)>
	//    5    7:invokespecial   #463 <Method void detachViewInternal(int, View)>
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
	//    5    7:invokevirtual   #468 <Method void onAttachedToWindow(RecyclerView)>
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
	//    6    8:invokevirtual   #473 <Method void onDetachedFromWindow(RecyclerView, RecyclerView$Recycler)>
	//    7   11:return          
	}

	public void endAnimation(View view)
	{
		if(mRecyclerView.mItemAnimator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:getfield        #478 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//*   3    7:ifnull          24
			mRecyclerView.mItemAnimator.endAnimation(RecyclerView.getChildViewHolderInt(view));
	//    4   10:aload_0         
	//    5   11:getfield        #95  <Field RecyclerView mRecyclerView>
	//    6   14:getfield        #478 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//    7   17:aload_1         
	//    8   18:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    9   21:invokevirtual   #482 <Method void RecyclerView$ItemAnimator.endAnimation(RecyclerView$ViewHolder)>
	//   10   24:return          
	}

	public View findContainingItemView(View view)
	{
		if(mRecyclerView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnonnull       11
		{
			view = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		} else
	//*   5    9:aload_1         
	//*   6   10:areturn         
		{
			View view1 = mRecyclerView.findContainingItemView(view);
	//    7   11:aload_0         
	//    8   12:getfield        #95  <Field RecyclerView mRecyclerView>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #486 <Method View RecyclerView.findContainingItemView(View)>
	//   11   19:astore_2        
			if(view1 == null)
	//*  12   20:aload_2         
	//*  13   21:ifnonnull       26
				return null;
	//   14   24:aconst_null     
	//   15   25:areturn         
			view = view1;
	//   16   26:aload_2         
	//   17   27:astore_1        
			if(mChildHelper.isHidden(view1))
	//*  18   28:aload_0         
	//*  19   29:getfield        #124 <Field ChildHelper mChildHelper>
	//*  20   32:aload_2         
	//*  21   33:invokevirtual   #490 <Method boolean ChildHelper.isHidden(View)>
	//*  22   36:ifeq            9
				return null;
	//   23   39:aconst_null     
	//   24   40:areturn         
		}
		return view;
	}

	public View findViewByPosition(int i)
	{
		int j;
		int k;
		k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #450 <Method int getChildCount()>
	//    2    4:istore_3        
		j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
_L3:
		View view;
		RecyclerView.ViewHolder viewholder;
		if(j >= k)
			break; /* Loop/switch isn't completed */
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:icmpge          79
		view = getChildAt(j);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #454 <Method View getChildAt(int)>
	//   11   17:astore          4
		viewholder = RecyclerView.getChildViewHolderInt(view);
	//   12   19:aload           4
	//   13   21:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//   14   24:astore          5
		  goto _L1
	//*  15   26:aload           5
	//*  16   28:ifnonnull       38
_L5:
		j++;
	//   17   31:iload_2         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_2        
		if(true) goto _L3; else goto _L2
	//   21   35:goto            7
_L1:
		if(viewholder == null || viewholder.getLayoutPosition() != i || viewholder.shouldIgnore() || !mRecyclerView.mState.isPreLayout() && viewholder.isRemoved()) goto _L5; else goto _L4
	//   22   38:aload           5
	//   23   40:invokevirtual   #495 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//   24   43:iload_1         
	//   25   44:icmpne          31
	//   26   47:aload           5
	//   27   49:invokevirtual   #371 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//   28   52:ifne            31
	//   29   55:aload_0         
	//   30   56:getfield        #95  <Field RecyclerView mRecyclerView>
	//   31   59:getfield        #499 <Field RecyclerView$State RecyclerView.mState>
	//   32   62:invokevirtual   #504 <Method boolean RecyclerView$State.isPreLayout()>
	//   33   65:ifne            76
	//   34   68:aload           5
	//   35   70:invokevirtual   #93  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//   36   73:ifne            31
_L4:
		return view;
	//   37   76:aload           4
	//   38   78:areturn         
_L2:
		return null;
	//   39   79:aconst_null     
	//   40   80:areturn         
	}

	public abstract RecyclerView.LayoutParams generateDefaultLayoutParams();

	public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeset)
	{
		return new RecyclerView.LayoutParams(context, attributeset);
	//    0    0:new             #113 <Class RecyclerView$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #511 <Method void RecyclerView$LayoutParams(Context, AttributeSet)>
	//    5    9:areturn         
	}

	public RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof RecyclerView.LayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #113 <Class RecyclerView$LayoutParams>
	//*   2    4:ifeq            19
			return new RecyclerView.LayoutParams((RecyclerView.LayoutParams)layoutparams);
	//    3    7:new             #113 <Class RecyclerView$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #113 <Class RecyclerView$LayoutParams>
	//    7   15:invokespecial   #515 <Method void RecyclerView$LayoutParams(RecyclerView$LayoutParams)>
	//    8   18:areturn         
		if(layoutparams instanceof android.view.s)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #517 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return new RecyclerView.LayoutParams((android.view.s)layoutparams);
	//   12   26:new             #113 <Class RecyclerView$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #517 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #520 <Method void RecyclerView$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return new RecyclerView.LayoutParams(layoutparams);
	//   18   38:new             #113 <Class RecyclerView$LayoutParams>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #523 <Method void RecyclerView$LayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//    1    1:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #113 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #528 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:getfield        #364 <Field int Rect.bottom>
	//    5   13:ireturn         
	}

	public View getChildAt(int i)
	{
		if(mChildHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #124 <Field ChildHelper mChildHelper>
	//*   2    4:ifnull          16
			return mChildHelper.getChildAt(i);
	//    3    7:aload_0         
	//    4    8:getfield        #124 <Field ChildHelper mChildHelper>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #529 <Method View ChildHelper.getChildAt(int)>
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
	//*   1    1:getfield        #124 <Field ChildHelper mChildHelper>
	//*   2    4:ifnull          15
			return mChildHelper.getChildCount();
	//    3    7:aload_0         
	//    4    8:getfield        #124 <Field ChildHelper mChildHelper>
	//    5   11:invokevirtual   #158 <Method int ChildHelper.getChildCount()>
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
	//    5   11:getfield        #533 <Field boolean RecyclerView.mClipToPadding>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		while(mRecyclerView == null || mRecyclerView.mAdapter == null || !canScrollHorizontally()) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   5   11:getfield        #378 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*   6   14:ifnonnull       19
			return 1;
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:aload_0         
	//   10   20:invokevirtual   #537 <Method boolean canScrollHorizontally()>
	//   11   23:ifeq            17
		return mRecyclerView.mAdapter.getItemCount();
	//   12   26:aload_0         
	//   13   27:getfield        #95  <Field RecyclerView mRecyclerView>
	//   14   30:getfield        #378 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   15   33:invokevirtual   #540 <Method int RecyclerView$Adapter.getItemCount()>
	//   16   36:ireturn         
	}

	public int getDecoratedBottom(View view)
	{
		return view.getBottom() + getBottomDecorationHeight(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #544 <Method int View.getBottom()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #546 <Method int getBottomDecorationHeight(View)>
	//    5    9:iadd            
	//    6   10:ireturn         
	}

	public void getDecoratedBoundsWithMargins(View view, Rect rect)
	{
		RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #549 <Method void RecyclerView.getDecoratedBoundsWithMarginsInt(View, Rect)>
	//    3    5:return          
	}

	public int getDecoratedLeft(View view)
	{
		return view.getLeft() - getLeftDecorationWidth(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #267 <Method int View.getLeft()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #553 <Method int getLeftDecorationWidth(View)>
	//    5    9:isub            
	//    6   10:ireturn         
	}

	public int getDecoratedMeasuredHeight(View view)
	{
		Rect rect = ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #113 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #528 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:astore_2        
		return view.getMeasuredHeight() + rect.top + rect.bottom;
	//    5   11:aload_1         
	//    6   12:invokevirtual   #557 <Method int View.getMeasuredHeight()>
	//    7   15:aload_2         
	//    8   16:getfield        #281 <Field int Rect.top>
	//    9   19:iadd            
	//   10   20:aload_2         
	//   11   21:getfield        #364 <Field int Rect.bottom>
	//   12   24:iadd            
	//   13   25:ireturn         
	}

	public int getDecoratedMeasuredWidth(View view)
	{
		Rect rect = ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #113 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #528 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:astore_2        
		return view.getMeasuredWidth() + rect.left + rect.right;
	//    5   11:aload_1         
	//    6   12:invokevirtual   #561 <Method int View.getMeasuredWidth()>
	//    7   15:aload_2         
	//    8   16:getfield        #272 <Field int Rect.left>
	//    9   19:iadd            
	//   10   20:aload_2         
	//   11   21:getfield        #361 <Field int Rect.right>
	//   12   24:iadd            
	//   13   25:ireturn         
	}

	public int getDecoratedRight(View view)
	{
		return view.getRight() + getRightDecorationWidth(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #565 <Method int View.getRight()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #568 <Method int getRightDecorationWidth(View)>
	//    5    9:iadd            
	//    6   10:ireturn         
	}

	public int getDecoratedTop(View view)
	{
		return view.getTop() - getTopDecorationHeight(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #278 <Method int View.getTop()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #572 <Method int getTopDecorationHeight(View)>
	//    5    9:isub            
	//    6   10:ireturn         
	}

	public View getFocusedChild()
	{
		if(mRecyclerView != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:ifnonnull       11
_L1:
		View view = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
_L4:
		return view;
	//    5    9:aload_1         
	//    6   10:areturn         
_L2:
		View view1;
		view1 = mRecyclerView.getFocusedChild();
	//    7   11:aload_0         
	//    8   12:getfield        #95  <Field RecyclerView mRecyclerView>
	//    9   15:invokevirtual   #350 <Method View RecyclerView.getFocusedChild()>
	//   10   18:astore_2        
		if(view1 == null)
			break; /* Loop/switch isn't completed */
	//   11   19:aload_2         
	//   12   20:ifnull          36
		view = view1;
	//   13   23:aload_2         
	//   14   24:astore_1        
		if(!mChildHelper.isHidden(view1)) goto _L4; else goto _L3
	//   15   25:aload_0         
	//   16   26:getfield        #124 <Field ChildHelper mChildHelper>
	//   17   29:aload_2         
	//   18   30:invokevirtual   #490 <Method boolean ChildHelper.isHidden(View)>
	//   19   33:ifeq            9
_L3:
		return null;
	//   20   36:aconst_null     
	//   21   37:areturn         
	}

	public int getHeight()
	{
		return mHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #574 <Field int mHeight>
	//    2    4:ireturn         
	}

	public int getHeightMode()
	{
		return mHeightMode;
	//    0    0:aload_0         
	//    1    1:getfield        #577 <Field int mHeightMode>
	//    2    4:ireturn         
	}

	public int getItemCount()
	{
		RecyclerView.Adapter adapter;
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          24
			adapter = mRecyclerView.getAdapter();
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:invokevirtual   #581 <Method RecyclerView$Adapter RecyclerView.getAdapter()>
	//    6   14:astore_1        
		else
	//*   7   15:aload_1         
	//*   8   16:ifnull          29
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #540 <Method int RecyclerView$Adapter.getItemCount()>
	//*  11   23:ireturn         
			adapter = null;
	//   12   24:aconst_null     
	//   13   25:astore_1        
		if(adapter != null)
			return adapter.getItemCount();
		else
	//*  14   26:goto            15
			return 0;
	//   15   29:iconst_0        
	//   16   30:ireturn         
	}

	public int getItemViewType(View view)
	{
		return RecyclerView.getChildViewHolderInt(view).getItemViewType();
	//    0    0:aload_1         
	//    1    1:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:invokevirtual   #584 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//    3    7:ireturn         
	}

	public int getLayoutDirection()
	{
		return ViewCompat.getLayoutDirection(((View) (mRecyclerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:invokestatic    #588 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    7:ireturn         
	}

	public int getLeftDecorationWidth(View view)
	{
		return ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets.left;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #113 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #528 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:getfield        #272 <Field int Rect.left>
	//    5   13:ireturn         
	}

	public int getMinimumHeight()
	{
		return ViewCompat.getMinimumHeight(((View) (mRecyclerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:invokestatic    #591 <Method int ViewCompat.getMinimumHeight(View)>
	//    3    7:ireturn         
	}

	public int getMinimumWidth()
	{
		return ViewCompat.getMinimumWidth(((View) (mRecyclerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:invokestatic    #594 <Method int ViewCompat.getMinimumWidth(View)>
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
	//    5   11:invokevirtual   #595 <Method int RecyclerView.getPaddingBottom()>
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
	//    5   11:invokestatic    #598 <Method int ViewCompat.getPaddingEnd(View)>
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
	//    5   11:invokevirtual   #599 <Method int RecyclerView.getPaddingLeft()>
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
	//    5   11:invokevirtual   #600 <Method int RecyclerView.getPaddingRight()>
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
	//    5   11:invokestatic    #603 <Method int ViewCompat.getPaddingStart(View)>
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
	//    5   11:invokevirtual   #604 <Method int RecyclerView.getPaddingTop()>
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
	//    1    1:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #113 <Class RecyclerView$LayoutParams>
	//    3    7:invokevirtual   #608 <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
	//    4   10:ireturn         
	}

	public int getRightDecorationWidth(View view)
	{
		return ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets.right;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #113 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #528 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:getfield        #361 <Field int Rect.right>
	//    5   13:ireturn         
	}

	public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		while(mRecyclerView == null || mRecyclerView.mAdapter == null || !canScrollVertically()) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   5   11:getfield        #378 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*   6   14:ifnonnull       19
			return 1;
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:aload_0         
	//   10   20:invokevirtual   #611 <Method boolean canScrollVertically()>
	//   11   23:ifeq            17
		return mRecyclerView.mAdapter.getItemCount();
	//   12   26:aload_0         
	//   13   27:getfield        #95  <Field RecyclerView mRecyclerView>
	//   14   30:getfield        #378 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   15   33:invokevirtual   #540 <Method int RecyclerView$Adapter.getItemCount()>
	//   16   36:ireturn         
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
	//    1    1:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #113 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #528 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:getfield        #281 <Field int Rect.top>
	//    5   13:ireturn         
	}

	public void getTransformedBoundingBox(View view, boolean flag, Rect rect)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            158
		{
			Rect rect1 = ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets;
	//    2    4:aload_1         
	//    3    5:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    4    8:checkcast       #113 <Class RecyclerView$LayoutParams>
	//    5   11:getfield        #528 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    6   14:astore          4
			rect.set(-rect1.left, -rect1.top, view.getWidth() + rect1.right, view.getHeight() + rect1.bottom);
	//    7   16:aload_3         
	//    8   17:aload           4
	//    9   19:getfield        #272 <Field int Rect.left>
	//   10   22:ineg            
	//   11   23:aload           4
	//   12   25:getfield        #281 <Field int Rect.top>
	//   13   28:ineg            
	//   14   29:aload_1         
	//   15   30:invokevirtual   #615 <Method int View.getWidth()>
	//   16   33:aload           4
	//   17   35:getfield        #361 <Field int Rect.right>
	//   18   38:iadd            
	//   19   39:aload_1         
	//   20   40:invokevirtual   #616 <Method int View.getHeight()>
	//   21   43:aload           4
	//   22   45:getfield        #364 <Field int Rect.bottom>
	//   23   48:iadd            
	//   24   49:invokevirtual   #425 <Method void Rect.set(int, int, int, int)>
		} else
	//*  25   52:aload_0         
	//*  26   53:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  27   56:ifnull          145
	//*  28   59:aload_1         
	//*  29   60:invokevirtual   #620 <Method Matrix View.getMatrix()>
	//*  30   63:astore          4
	//*  31   65:aload           4
	//*  32   67:ifnull          145
	//*  33   70:aload           4
	//*  34   72:invokevirtual   #625 <Method boolean Matrix.isIdentity()>
	//*  35   75:ifne            145
	//*  36   78:aload_0         
	//*  37   79:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  38   82:getfield        #629 <Field RectF RecyclerView.mTempRectF>
	//*  39   85:astore          5
	//*  40   87:aload           5
	//*  41   89:aload_3         
	//*  42   90:invokevirtual   #632 <Method void RectF.set(Rect)>
	//*  43   93:aload           4
	//*  44   95:aload           5
	//*  45   97:invokevirtual   #636 <Method boolean Matrix.mapRect(RectF)>
	//*  46  100:pop             
	//*  47  101:aload_3         
	//*  48  102:aload           5
	//*  49  104:getfield        #639 <Field float RectF.left>
	//*  50  107:f2d             
	//*  51  108:invokestatic    #643 <Method double Math.floor(double)>
	//*  52  111:d2i             
	//*  53  112:aload           5
	//*  54  114:getfield        #645 <Field float RectF.top>
	//*  55  117:f2d             
	//*  56  118:invokestatic    #643 <Method double Math.floor(double)>
	//*  57  121:d2i             
	//*  58  122:aload           5
	//*  59  124:getfield        #647 <Field float RectF.right>
	//*  60  127:f2d             
	//*  61  128:invokestatic    #650 <Method double Math.ceil(double)>
	//*  62  131:d2i             
	//*  63  132:aload           5
	//*  64  134:getfield        #652 <Field float RectF.bottom>
	//*  65  137:f2d             
	//*  66  138:invokestatic    #650 <Method double Math.ceil(double)>
	//*  67  141:d2i             
	//*  68  142:invokevirtual   #425 <Method void Rect.set(int, int, int, int)>
	//*  69  145:aload_3         
	//*  70  146:aload_1         
	//*  71  147:invokevirtual   #267 <Method int View.getLeft()>
	//*  72  150:aload_1         
	//*  73  151:invokevirtual   #278 <Method int View.getTop()>
	//*  74  154:invokevirtual   #655 <Method void Rect.offset(int, int)>
	//*  75  157:return          
		{
			rect.set(0, 0, view.getWidth(), view.getHeight());
	//   76  158:aload_3         
	//   77  159:iconst_0        
	//   78  160:iconst_0        
	//   79  161:aload_1         
	//   80  162:invokevirtual   #615 <Method int View.getWidth()>
	//   81  165:aload_1         
	//   82  166:invokevirtual   #616 <Method int View.getHeight()>
	//   83  169:invokevirtual   #425 <Method void Rect.set(int, int, int, int)>
		}
		if(mRecyclerView != null)
		{
			Matrix matrix = view.getMatrix();
			if(matrix != null && !matrix.isIdentity())
			{
				RectF rectf = mRecyclerView.mTempRectF;
				rectf.set(rect);
				matrix.mapRect(rectf);
				rect.set((int)Math.floor(rectf.left), (int)Math.floor(rectf.top), (int)Math.ceil(rectf.right), (int)Math.ceil(rectf.bottom));
			}
		}
		rect.offset(view.getLeft(), view.getTop());
	//*  84  172:goto            52
	}

	public int getWidth()
	{
		return mWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #657 <Field int mWidth>
	//    2    4:ireturn         
	}

	public int getWidthMode()
	{
		return mWidthMode;
	//    0    0:aload_0         
	//    1    1:getfield        #660 <Field int mWidthMode>
	//    2    4:ireturn         
	}

	boolean hasFlexibleChildInBothOrientations()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #450 <Method int getChildCount()>
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
	//   10   14:invokevirtual   #454 <Method View getChildAt(int)>
	//   11   17:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   20:astore_3        
			if(layoutparams.width < 0 && layoutparams.height < 0)
	//*  13   21:aload_3         
	//*  14   22:getfield        #665 <Field int android.view.ViewGroup$LayoutParams.width>
	//*  15   25:ifge            37
	//*  16   28:aload_3         
	//*  17   29:getfield        #667 <Field int android.view.ViewGroup$LayoutParams.height>
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
	//    5   11:invokevirtual   #670 <Method boolean RecyclerView.hasFocus()>
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
	//*   1    1:invokevirtual   #150 <Method android.view.ViewParent View.getParent()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   4    8:if_acmpne       23
	//*   5   11:aload_0         
	//*   6   12:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #170 <Method int RecyclerView.indexOfChild(View)>
	//*   9   19:iconst_m1       
	//*  10   20:icmpne          57
		{
			throw new IllegalArgumentException((new StringBuilder()).append("View should be fully attached to be ignored").append(mRecyclerView.exceptionLabel()).toString());
	//   11   23:new             #673 <Class IllegalArgumentException>
	//   12   26:dup             
	//   13   27:new             #162 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #163 <Method void StringBuilder()>
	//   16   34:ldc2            #675 <String "View should be fully attached to be ignored">
	//   17   37:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:aload_0         
	//   19   41:getfield        #95  <Field RecyclerView mRecyclerView>
	//   20   44:invokevirtual   #177 <Method String RecyclerView.exceptionLabel()>
	//   21   47:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   22   50:invokevirtual   #180 <Method String StringBuilder.toString()>
	//   23   53:invokespecial   #676 <Method void IllegalArgumentException(String)>
	//   24   56:athrow          
		} else
		{
			view = ((View) (RecyclerView.getChildViewHolderInt(view)));
	//   25   57:aload_1         
	//   26   58:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//   27   61:astore_1        
			((RecyclerView.ViewHolder) (view)).addFlags(128);
	//   28   62:aload_1         
	//   29   63:sipush          128
	//   30   66:invokevirtual   #679 <Method void RecyclerView$ViewHolder.addFlags(int)>
			mRecyclerView.mViewInfoStore.removeViewHolder(((RecyclerView.ViewHolder) (view)));
	//   31   69:aload_0         
	//   32   70:getfield        #95  <Field RecyclerView mRecyclerView>
	//   33   73:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   34   76:aload_1         
	//   35   77:invokevirtual   #682 <Method void ViewInfoStore.removeViewHolder(RecyclerView$ViewHolder)>
			return;
	//   36   80:return          
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
	//    5   11:invokevirtual   #687 <Method boolean RecyclerView.isFocused()>
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
	//    1    1:getfield        #199 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #199 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//    5   11:invokevirtual   #204 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean isViewPartiallyVisible(View view, boolean flag, boolean flag1)
	{
		boolean flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		if(mHorizontalBoundCheck.isViewWithinBoundFlags(view, 24579) && mVerticalBoundCheck.isViewWithinBoundFlags(view, 24579))
	//*   2    3:aload_0         
	//*   3    4:getfield        #62  <Field ViewBoundsCheck mHorizontalBoundCheck>
	//*   4    7:aload_1         
	//*   5    8:sipush          24579
	//*   6   11:invokevirtual   #699 <Method boolean ViewBoundsCheck.isViewWithinBoundFlags(View, int)>
	//*   7   14:ifeq            39
	//*   8   17:aload_0         
	//*   9   18:getfield        #64  <Field ViewBoundsCheck mVerticalBoundCheck>
	//*  10   21:aload_1         
	//*  11   22:sipush          24579
	//*  12   25:invokevirtual   #699 <Method boolean ViewBoundsCheck.isViewWithinBoundFlags(View, int)>
	//*  13   28:ifeq            39
			flag1 = true;
	//   14   31:iconst_1        
	//   15   32:istore_3        
		else
	//*  16   33:iload_2         
	//*  17   34:ifeq            44
	//*  18   37:iload_3         
	//*  19   38:ireturn         
			flag1 = false;
	//   20   39:iconst_0        
	//   21   40:istore_3        
		if(flag)
			return flag1;
	//*  22   41:goto            33
		if(!flag1)
	//*  23   44:iload_3         
	//*  24   45:ifne            53
			flag = flag2;
	//   25   48:iload           4
	//   26   50:istore_2        
		else
	//*  27   51:iload_2         
	//*  28   52:ireturn         
			flag = false;
	//   29   53:iconst_0        
	//   30   54:istore_2        
		return flag;
	//*  31   55:goto            51
	}

	public void layoutDecorated(View view, int i, int j, int k, int l)
	{
		Rect rect = ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #113 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #528 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:astore          6
		view.layout(rect.left + i, rect.top + j, k - rect.right, l - rect.bottom);
	//    5   12:aload_1         
	//    6   13:aload           6
	//    7   15:getfield        #272 <Field int Rect.left>
	//    8   18:iload_2         
	//    9   19:iadd            
	//   10   20:aload           6
	//   11   22:getfield        #281 <Field int Rect.top>
	//   12   25:iload_3         
	//   13   26:iadd            
	//   14   27:iload           4
	//   15   29:aload           6
	//   16   31:getfield        #361 <Field int Rect.right>
	//   17   34:isub            
	//   18   35:iload           5
	//   19   37:aload           6
	//   20   39:getfield        #364 <Field int Rect.bottom>
	//   21   42:isub            
	//   22   43:invokevirtual   #705 <Method void View.layout(int, int, int, int)>
	//   23   46:return          
	}

	public void layoutDecoratedWithMargins(View view, int i, int j, int k, int l)
	{
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #113 <Class RecyclerView$LayoutParams>
	//    3    7:astore          6
		Rect rect = layoutparams.mDecorInsets;
	//    4    9:aload           6
	//    5   11:getfield        #528 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    6   14:astore          7
		view.layout(rect.left + i + layoutparams.leftMargin, rect.top + j + layoutparams.topMargin, k - rect.right - layoutparams.rightMargin, l - rect.bottom - layoutparams.bottomMargin);
	//    7   16:aload_1         
	//    8   17:aload           7
	//    9   19:getfield        #272 <Field int Rect.left>
	//   10   22:iload_2         
	//   11   23:iadd            
	//   12   24:aload           6
	//   13   26:getfield        #709 <Field int RecyclerView$LayoutParams.leftMargin>
	//   14   29:iadd            
	//   15   30:aload           7
	//   16   32:getfield        #281 <Field int Rect.top>
	//   17   35:iload_3         
	//   18   36:iadd            
	//   19   37:aload           6
	//   20   39:getfield        #712 <Field int RecyclerView$LayoutParams.topMargin>
	//   21   42:iadd            
	//   22   43:iload           4
	//   23   45:aload           7
	//   24   47:getfield        #361 <Field int Rect.right>
	//   25   50:isub            
	//   26   51:aload           6
	//   27   53:getfield        #715 <Field int RecyclerView$LayoutParams.rightMargin>
	//   28   56:isub            
	//   29   57:iload           5
	//   30   59:aload           7
	//   31   61:getfield        #364 <Field int Rect.bottom>
	//   32   64:isub            
	//   33   65:aload           6
	//   34   67:getfield        #718 <Field int RecyclerView$LayoutParams.bottomMargin>
	//   35   70:isub            
	//   36   71:invokevirtual   #705 <Method void View.layout(int, int, int, int)>
	//   37   74:return          
	}

	public void measureChild(View view, int i, int j)
	{
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #113 <Class RecyclerView$LayoutParams>
	//    3    7:astore          8
		Rect rect = mRecyclerView.getItemDecorInsetsForChild(view);
	//    4    9:aload_0         
	//    5   10:getfield        #95  <Field RecyclerView mRecyclerView>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #429 <Method Rect RecyclerView.getItemDecorInsetsForChild(View)>
	//    8   17:astore          9
		int i1 = rect.left;
	//    9   19:aload           9
	//   10   21:getfield        #272 <Field int Rect.left>
	//   11   24:istore          6
		int j1 = rect.right;
	//   12   26:aload           9
	//   13   28:getfield        #361 <Field int Rect.right>
	//   14   31:istore          7
		int k = rect.top;
	//   15   33:aload           9
	//   16   35:getfield        #281 <Field int Rect.top>
	//   17   38:istore          4
		int l = rect.bottom;
	//   18   40:aload           9
	//   19   42:getfield        #364 <Field int Rect.bottom>
	//   20   45:istore          5
		i = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + (i + (i1 + j1)), layoutparams.width, canScrollHorizontally());
	//   21   47:aload_0         
	//   22   48:invokevirtual   #255 <Method int getWidth()>
	//   23   51:aload_0         
	//   24   52:invokevirtual   #722 <Method int getWidthMode()>
	//   25   55:aload_0         
	//   26   56:invokevirtual   #249 <Method int getPaddingLeft()>
	//   27   59:aload_0         
	//   28   60:invokevirtual   #258 <Method int getPaddingRight()>
	//   29   63:iadd            
	//   30   64:iload_2         
	//   31   65:iload           6
	//   32   67:iload           7
	//   33   69:iadd            
	//   34   70:iadd            
	//   35   71:iadd            
	//   36   72:aload           8
	//   37   74:getfield        #723 <Field int RecyclerView$LayoutParams.width>
	//   38   77:aload_0         
	//   39   78:invokevirtual   #537 <Method boolean canScrollHorizontally()>
	//   40   81:invokestatic    #725 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   41   84:istore_2        
		j = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + (j + (k + l)), layoutparams.height, canScrollVertically());
	//   42   85:aload_0         
	//   43   86:invokevirtual   #261 <Method int getHeight()>
	//   44   89:aload_0         
	//   45   90:invokevirtual   #727 <Method int getHeightMode()>
	//   46   93:aload_0         
	//   47   94:invokevirtual   #252 <Method int getPaddingTop()>
	//   48   97:aload_0         
	//   49   98:invokevirtual   #264 <Method int getPaddingBottom()>
	//   50  101:iadd            
	//   51  102:iload_3         
	//   52  103:iload           4
	//   53  105:iload           5
	//   54  107:iadd            
	//   55  108:iadd            
	//   56  109:iadd            
	//   57  110:aload           8
	//   58  112:getfield        #728 <Field int RecyclerView$LayoutParams.height>
	//   59  115:aload_0         
	//   60  116:invokevirtual   #611 <Method boolean canScrollVertically()>
	//   61  119:invokestatic    #725 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   62  122:istore_3        
		if(shouldMeasureChild(view, i, j, layoutparams))
	//*  63  123:aload_0         
	//*  64  124:aload_1         
	//*  65  125:iload_2         
	//*  66  126:iload_3         
	//*  67  127:aload           8
	//*  68  129:invokevirtual   #732 <Method boolean shouldMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//*  69  132:ifeq            141
			view.measure(i, j);
	//   70  135:aload_1         
	//   71  136:iload_2         
	//   72  137:iload_3         
	//   73  138:invokevirtual   #735 <Method void View.measure(int, int)>
	//   74  141:return          
	}

	public void measureChildWithMargins(View view, int i, int j)
	{
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #111 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #113 <Class RecyclerView$LayoutParams>
	//    3    7:astore          8
		Rect rect = mRecyclerView.getItemDecorInsetsForChild(view);
	//    4    9:aload_0         
	//    5   10:getfield        #95  <Field RecyclerView mRecyclerView>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #429 <Method Rect RecyclerView.getItemDecorInsetsForChild(View)>
	//    8   17:astore          9
		int i1 = rect.left;
	//    9   19:aload           9
	//   10   21:getfield        #272 <Field int Rect.left>
	//   11   24:istore          6
		int j1 = rect.right;
	//   12   26:aload           9
	//   13   28:getfield        #361 <Field int Rect.right>
	//   14   31:istore          7
		int k = rect.top;
	//   15   33:aload           9
	//   16   35:getfield        #281 <Field int Rect.top>
	//   17   38:istore          4
		int l = rect.bottom;
	//   18   40:aload           9
	//   19   42:getfield        #364 <Field int Rect.bottom>
	//   20   45:istore          5
		i = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + layoutparams.leftMargin + layoutparams.rightMargin + (i + (i1 + j1)), layoutparams.width, canScrollHorizontally());
	//   21   47:aload_0         
	//   22   48:invokevirtual   #255 <Method int getWidth()>
	//   23   51:aload_0         
	//   24   52:invokevirtual   #722 <Method int getWidthMode()>
	//   25   55:aload_0         
	//   26   56:invokevirtual   #249 <Method int getPaddingLeft()>
	//   27   59:aload_0         
	//   28   60:invokevirtual   #258 <Method int getPaddingRight()>
	//   29   63:iadd            
	//   30   64:aload           8
	//   31   66:getfield        #709 <Field int RecyclerView$LayoutParams.leftMargin>
	//   32   69:iadd            
	//   33   70:aload           8
	//   34   72:getfield        #715 <Field int RecyclerView$LayoutParams.rightMargin>
	//   35   75:iadd            
	//   36   76:iload_2         
	//   37   77:iload           6
	//   38   79:iload           7
	//   39   81:iadd            
	//   40   82:iadd            
	//   41   83:iadd            
	//   42   84:aload           8
	//   43   86:getfield        #723 <Field int RecyclerView$LayoutParams.width>
	//   44   89:aload_0         
	//   45   90:invokevirtual   #537 <Method boolean canScrollHorizontally()>
	//   46   93:invokestatic    #725 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   47   96:istore_2        
		j = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + layoutparams.topMargin + layoutparams.bottomMargin + (j + (k + l)), layoutparams.height, canScrollVertically());
	//   48   97:aload_0         
	//   49   98:invokevirtual   #261 <Method int getHeight()>
	//   50  101:aload_0         
	//   51  102:invokevirtual   #727 <Method int getHeightMode()>
	//   52  105:aload_0         
	//   53  106:invokevirtual   #252 <Method int getPaddingTop()>
	//   54  109:aload_0         
	//   55  110:invokevirtual   #264 <Method int getPaddingBottom()>
	//   56  113:iadd            
	//   57  114:aload           8
	//   58  116:getfield        #712 <Field int RecyclerView$LayoutParams.topMargin>
	//   59  119:iadd            
	//   60  120:aload           8
	//   61  122:getfield        #718 <Field int RecyclerView$LayoutParams.bottomMargin>
	//   62  125:iadd            
	//   63  126:iload_3         
	//   64  127:iload           4
	//   65  129:iload           5
	//   66  131:iadd            
	//   67  132:iadd            
	//   68  133:iadd            
	//   69  134:aload           8
	//   70  136:getfield        #728 <Field int RecyclerView$LayoutParams.height>
	//   71  139:aload_0         
	//   72  140:invokevirtual   #611 <Method boolean canScrollVertically()>
	//   73  143:invokestatic    #725 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   74  146:istore_3        
		if(shouldMeasureChild(view, i, j, layoutparams))
	//*  75  147:aload_0         
	//*  76  148:aload_1         
	//*  77  149:iload_2         
	//*  78  150:iload_3         
	//*  79  151:aload           8
	//*  80  153:invokevirtual   #732 <Method boolean shouldMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//*  81  156:ifeq            165
			view.measure(i, j);
	//   82  159:aload_1         
	//   83  160:iload_2         
	//   84  161:iload_3         
	//   85  162:invokevirtual   #735 <Method void View.measure(int, int)>
	//   86  165:return          
	}

	public void moveView(int i, int j)
	{
		View view = getChildAt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #454 <Method View getChildAt(int)>
	//    3    5:astore_3        
		if(view == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       48
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Cannot move a child from non-existing index:").append(i).append(mRecyclerView.toString()).toString());
	//    6   10:new             #673 <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:new             #162 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #163 <Method void StringBuilder()>
	//   11   21:ldc2            #738 <String "Cannot move a child from non-existing index:">
	//   12   24:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:iload_1         
	//   14   28:invokevirtual   #173 <Method StringBuilder StringBuilder.append(int)>
	//   15   31:aload_0         
	//   16   32:getfield        #95  <Field RecyclerView mRecyclerView>
	//   17   35:invokevirtual   #739 <Method String RecyclerView.toString()>
	//   18   38:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:invokevirtual   #180 <Method String StringBuilder.toString()>
	//   20   44:invokespecial   #676 <Method void IllegalArgumentException(String)>
	//   21   47:athrow          
		} else
		{
			detachViewAt(i);
	//   22   48:aload_0         
	//   23   49:iload_1         
	//   24   50:invokevirtual   #394 <Method void detachViewAt(int)>
			attachView(view, j);
	//   25   53:aload_0         
	//   26   54:aload_3         
	//   27   55:iload_2         
	//   28   56:invokevirtual   #417 <Method void attachView(View, int)>
			return;
	//   29   59:return          
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
	//    6   12:invokevirtual   #742 <Method void RecyclerView.offsetChildrenHorizontal(int)>
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
	//    6   12:invokevirtual   #745 <Method void RecyclerView.offsetChildrenVertical(int)>
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
	//    2    2:invokevirtual   #754 <Method void onDetachedFromWindow(RecyclerView)>
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
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		if(mRecyclerView != null && accessibilityevent != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   4    7:ifnull          14
	//*   5   10:aload_3         
	//*   6   11:ifnonnull       15
	//*   7   14:return          
		{
			boolean flag = flag1;
	//    8   15:iload           5
	//    9   17:istore          4
			if(!mRecyclerView.canScrollVertically(1))
	//*  10   19:aload_0         
	//*  11   20:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  12   23:iconst_1        
	//*  13   24:invokevirtual   #761 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  14   27:ifne            75
			{
				flag = flag1;
	//   15   30:iload           5
	//   16   32:istore          4
				if(!mRecyclerView.canScrollVertically(-1))
	//*  17   34:aload_0         
	//*  18   35:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  19   38:iconst_m1       
	//*  20   39:invokevirtual   #761 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  21   42:ifne            75
				{
					flag = flag1;
	//   22   45:iload           5
	//   23   47:istore          4
					if(!mRecyclerView.canScrollHorizontally(-1))
	//*  24   49:aload_0         
	//*  25   50:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  26   53:iconst_m1       
	//*  27   54:invokevirtual   #763 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  28   57:ifne            75
						if(mRecyclerView.canScrollHorizontally(1))
	//*  29   60:aload_0         
	//*  30   61:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  31   64:iconst_1        
	//*  32   65:invokevirtual   #763 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  33   68:ifeq            106
							flag = flag1;
	//   34   71:iload           5
	//   35   73:istore          4
						else
	//*  36   75:aload_3         
	//*  37   76:iload           4
	//*  38   78:invokevirtual   #769 <Method void AccessibilityEvent.setScrollable(boolean)>
	//*  39   81:aload_0         
	//*  40   82:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  41   85:getfield        #378 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  42   88:ifnull          14
	//*  43   91:aload_3         
	//*  44   92:aload_0         
	//*  45   93:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  46   96:getfield        #378 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  47   99:invokevirtual   #540 <Method int RecyclerView$Adapter.getItemCount()>
	//*  48  102:invokevirtual   #772 <Method void AccessibilityEvent.setItemCount(int)>
	//*  49  105:return          
							flag = false;
	//   50  106:iconst_0        
	//   51  107:istore          4
				}
			}
			accessibilityevent.setScrollable(flag);
			if(mRecyclerView.mAdapter != null)
			{
				accessibilityevent.setItemCount(mRecyclerView.mAdapter.getItemCount());
				return;
			}
		}
	//*  52  109:goto            75
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		onInitializeAccessibilityEvent(mRecyclerView.mRecycler, mRecyclerView.mState, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field RecyclerView mRecyclerView>
	//    3    5:getfield        #777 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    4    8:aload_0         
	//    5    9:getfield        #95  <Field RecyclerView mRecyclerView>
	//    6   12:getfield        #499 <Field RecyclerView$State RecyclerView.mState>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #779 <Method void onInitializeAccessibilityEvent(RecyclerView$Recycler, RecyclerView$State, AccessibilityEvent)>
	//    9   19:return          
	}

	void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		onInitializeAccessibilityNodeInfo(mRecyclerView.mRecycler, mRecyclerView.mState, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field RecyclerView mRecyclerView>
	//    3    5:getfield        #777 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    4    8:aload_0         
	//    5    9:getfield        #95  <Field RecyclerView mRecyclerView>
	//    6   12:getfield        #499 <Field RecyclerView$State RecyclerView.mState>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #784 <Method void onInitializeAccessibilityNodeInfo(RecyclerView$Recycler, RecyclerView$State, AccessibilityNodeInfoCompat)>
	//    9   19:return          
	}

	public void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		if(mRecyclerView.canScrollVertically(-1) || mRecyclerView.canScrollHorizontally(-1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:iconst_m1       
	//*   3    5:invokevirtual   #761 <Method boolean RecyclerView.canScrollVertically(int)>
	//*   4    8:ifne            22
	//*   5   11:aload_0         
	//*   6   12:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   7   15:iconst_m1       
	//*   8   16:invokevirtual   #763 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*   9   19:ifeq            34
		{
			accessibilitynodeinfocompat.addAction(8192);
	//   10   22:aload_3         
	//   11   23:sipush          8192
	//   12   26:invokevirtual   #789 <Method void AccessibilityNodeInfoCompat.addAction(int)>
			accessibilitynodeinfocompat.setScrollable(true);
	//   13   29:aload_3         
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #790 <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
		}
		if(mRecyclerView.canScrollVertically(1) || mRecyclerView.canScrollHorizontally(1))
	//*  16   34:aload_0         
	//*  17   35:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  18   38:iconst_1        
	//*  19   39:invokevirtual   #761 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  20   42:ifne            56
	//*  21   45:aload_0         
	//*  22   46:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  23   49:iconst_1        
	//*  24   50:invokevirtual   #763 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  25   53:ifeq            68
		{
			accessibilitynodeinfocompat.addAction(4096);
	//   26   56:aload_3         
	//   27   57:sipush          4096
	//   28   60:invokevirtual   #789 <Method void AccessibilityNodeInfoCompat.addAction(int)>
			accessibilitynodeinfocompat.setScrollable(true);
	//   29   63:aload_3         
	//   30   64:iconst_1        
	//   31   65:invokevirtual   #790 <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
		}
		accessibilitynodeinfocompat.setCollectionInfo(((Object) (android.support.v4.view.accessibility..CollectionInfoCompat.obtain(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), isLayoutHierarchical(recycler, state), getSelectionModeForAccessibility(recycler, state)))));
	//   32   68:aload_3         
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:aload_2         
	//   36   72:invokevirtual   #792 <Method int getRowCountForAccessibility(RecyclerView$Recycler, RecyclerView$State)>
	//   37   75:aload_0         
	//   38   76:aload_1         
	//   39   77:aload_2         
	//   40   78:invokevirtual   #794 <Method int getColumnCountForAccessibility(RecyclerView$Recycler, RecyclerView$State)>
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:aload_2         
	//   44   84:invokevirtual   #796 <Method boolean isLayoutHierarchical(RecyclerView$Recycler, RecyclerView$State)>
	//   45   87:aload_0         
	//   46   88:aload_1         
	//   47   89:aload_2         
	//   48   90:invokevirtual   #798 <Method int getSelectionModeForAccessibility(RecyclerView$Recycler, RecyclerView$State)>
	//   49   93:invokestatic    #804 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat.obtain(int, int, boolean, int)>
	//   50   96:invokevirtual   #808 <Method void AccessibilityNodeInfoCompat.setCollectionInfo(Object)>
	//   51   99:return          
	}

	public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		int i;
		int j;
		if(canScrollVertically())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #611 <Method boolean canScrollVertically()>
	//*   2    4:ifeq            45
			i = getPosition(view);
	//    3    7:aload_0         
	//    4    8:aload_3         
	//    5    9:invokevirtual   #812 <Method int getPosition(View)>
	//    6   12:istore          5
		else
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #537 <Method boolean canScrollHorizontally()>
	//*   9   18:ifeq            51
	//*  10   21:aload_0         
	//*  11   22:aload_3         
	//*  12   23:invokevirtual   #812 <Method int getPosition(View)>
	//*  13   26:istore          6
	//*  14   28:aload           4
	//*  15   30:iload           5
	//*  16   32:iconst_1        
	//*  17   33:iload           6
	//*  18   35:iconst_1        
	//*  19   36:iconst_0        
	//*  20   37:iconst_0        
	//*  21   38:invokestatic    #817 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//*  22   41:invokevirtual   #820 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
	//*  23   44:return          
			i = 0;
	//   24   45:iconst_0        
	//   25   46:istore          5
		if(canScrollHorizontally())
			j = getPosition(view);
		else
	//*  26   48:goto            14
			j = 0;
	//   27   51:iconst_0        
	//   28   52:istore          6
		accessibilitynodeinfocompat.setCollectionItemInfo(((Object) (android.support.v4.view.accessibility..CollectionItemInfoCompat.obtain(i, 1, j, 1, false, false))));
	//*  29   54:goto            28
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
	//*   9   17:getfield        #124 <Field ChildHelper mChildHelper>
	//*  10   20:aload_3         
	//*  11   21:getfield        #137 <Field View RecyclerView$ViewHolder.itemView>
	//*  12   24:invokevirtual   #490 <Method boolean ChildHelper.isHidden(View)>
	//*  13   27:ifne            50
			onInitializeAccessibilityNodeInfoForItem(mRecyclerView.mRecycler, mRecyclerView.mState, view, accessibilitynodeinfocompat);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #95  <Field RecyclerView mRecyclerView>
	//   17   35:getfield        #777 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//   18   38:aload_0         
	//   19   39:getfield        #95  <Field RecyclerView mRecyclerView>
	//   20   42:getfield        #499 <Field RecyclerView$State RecyclerView.mState>
	//   21   45:aload_1         
	//   22   46:aload_2         
	//   23   47:invokevirtual   #823 <Method void onInitializeAccessibilityNodeInfoForItem(RecyclerView$Recycler, RecyclerView$State, View, AccessibilityNodeInfoCompat)>
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
	//    4    4:invokevirtual   #835 <Method void onItemsUpdated(RecyclerView, int, int)>
	//    5    7:return          
	}

	public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
	//    0    0:ldc2            #838 <String "RecyclerView">
	//    1    3:ldc2            #840 <String "You must override onLayoutChildren(Recycler recycler, State state) ">
	//    2    6:invokestatic    #846 <Method int Log.e(String, String)>
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
	//    4    7:invokevirtual   #853 <Method void RecyclerView.defaultOnMeasure(int, int)>
	//    5   10:return          
	}

	public boolean onRequestChildFocus(RecyclerView recyclerview, RecyclerView.State state, View view, View view1)
	{
		return onRequestChildFocus(recyclerview, view, view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokevirtual   #858 <Method boolean onRequestChildFocus(RecyclerView, View, View)>
	//    5    8:ireturn         
	}

	public boolean onRequestChildFocus(RecyclerView recyclerview, View view, View view1)
	{
		return isSmoothScrolling() || recyclerview.isComputingLayout();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #860 <Method boolean isSmoothScrolling()>
	//    2    4:ifne            14
	//    3    7:aload_1         
	//    4    8:invokevirtual   #863 <Method boolean RecyclerView.isComputingLayout()>
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
	//    3    5:getfield        #777 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    4    8:aload_0         
	//    5    9:getfield        #95  <Field RecyclerView mRecyclerView>
	//    6   12:getfield        #499 <Field RecyclerView$State RecyclerView.mState>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #873 <Method boolean performAccessibilityAction(RecyclerView$Recycler, RecyclerView$State, int, Bundle)>
	//   10   20:ireturn         
	}

	public boolean performAccessibilityAction(RecyclerView.Recycler recycler, RecyclerView.State state, int i, Bundle bundle)
	{
		if(mRecyclerView != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:ifnonnull       9
_L1:
		return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
_L2:
		int l;
		boolean flag1;
		boolean flag2;
		flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore          7
		flag2 = false;
	//    7   12:iconst_0        
	//    8   13:istore          8
		boolean flag = false;
	//    9   15:iconst_0        
	//   10   16:istore          5
		l = 0;
	//   11   18:iconst_0        
	//   12   19:istore          6
		switch(i)
	//*  13   21:iload_3         
		{
	//*  14   22:lookupswitch    2: default 48
	//	               4096: 141
	//	               8192: 72
		default:
			i = ((int) (flag));
	//   15   48:iload           5
	//   16   50:istore_3        
			break;

		case 4096: 
			break MISSING_BLOCK_LABEL_141;

		case 8192: 
			break; /* Loop/switch isn't completed */
		}
_L4:
		if(i != 0 || l != 0)
	//*  17   51:iload_3         
	//*  18   52:ifne            60
	//*  19   55:iload           6
	//*  20   57:ifeq            7
		{
			mRecyclerView.scrollBy(l, i);
	//   21   60:aload_0         
	//   22   61:getfield        #95  <Field RecyclerView mRecyclerView>
	//   23   64:iload           6
	//   24   66:iload_3         
	//   25   67:invokevirtual   #876 <Method void RecyclerView.scrollBy(int, int)>
			return true;
	//   26   70:iconst_1        
	//   27   71:ireturn         
		}
		if(true) goto _L1; else goto _L3
_L3:
		int j = ((int) (flag1));
	//   28   72:iload           7
	//   29   74:istore          5
		if(mRecyclerView.canScrollVertically(-1))
	//*  30   76:aload_0         
	//*  31   77:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  32   80:iconst_m1       
	//*  33   81:invokevirtual   #761 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  34   84:ifeq            104
			j = -(getHeight() - getPaddingTop() - getPaddingBottom());
	//   35   87:aload_0         
	//   36   88:invokevirtual   #261 <Method int getHeight()>
	//   37   91:aload_0         
	//   38   92:invokevirtual   #252 <Method int getPaddingTop()>
	//   39   95:isub            
	//   40   96:aload_0         
	//   41   97:invokevirtual   #264 <Method int getPaddingBottom()>
	//   42  100:isub            
	//   43  101:ineg            
	//   44  102:istore          5
		i = j;
	//   45  104:iload           5
	//   46  106:istore_3        
		if(mRecyclerView.canScrollHorizontally(-1))
	//*  47  107:aload_0         
	//*  48  108:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  49  111:iconst_m1       
	//*  50  112:invokevirtual   #763 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  51  115:ifeq            51
		{
			l = -(getWidth() - getPaddingLeft() - getPaddingRight());
	//   52  118:aload_0         
	//   53  119:invokevirtual   #255 <Method int getWidth()>
	//   54  122:aload_0         
	//   55  123:invokevirtual   #249 <Method int getPaddingLeft()>
	//   56  126:isub            
	//   57  127:aload_0         
	//   58  128:invokevirtual   #258 <Method int getPaddingRight()>
	//   59  131:isub            
	//   60  132:ineg            
	//   61  133:istore          6
			i = j;
	//   62  135:iload           5
	//   63  137:istore_3        
		}
		  goto _L4
	//*  64  138:goto            51
		int k = ((int) (flag2));
	//   65  141:iload           8
	//   66  143:istore          5
		if(mRecyclerView.canScrollVertically(1))
	//*  67  145:aload_0         
	//*  68  146:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  69  149:iconst_1        
	//*  70  150:invokevirtual   #761 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  71  153:ifeq            172
			k = getHeight() - getPaddingTop() - getPaddingBottom();
	//   72  156:aload_0         
	//   73  157:invokevirtual   #261 <Method int getHeight()>
	//   74  160:aload_0         
	//   75  161:invokevirtual   #252 <Method int getPaddingTop()>
	//   76  164:isub            
	//   77  165:aload_0         
	//   78  166:invokevirtual   #264 <Method int getPaddingBottom()>
	//   79  169:isub            
	//   80  170:istore          5
		i = k;
	//   81  172:iload           5
	//   82  174:istore_3        
		if(mRecyclerView.canScrollHorizontally(1))
	//*  83  175:aload_0         
	//*  84  176:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  85  179:iconst_1        
	//*  86  180:invokevirtual   #763 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  87  183:ifeq            51
		{
			l = getWidth() - getPaddingLeft() - getPaddingRight();
	//   88  186:aload_0         
	//   89  187:invokevirtual   #255 <Method int getWidth()>
	//   90  190:aload_0         
	//   91  191:invokevirtual   #249 <Method int getPaddingLeft()>
	//   92  194:isub            
	//   93  195:aload_0         
	//   94  196:invokevirtual   #258 <Method int getPaddingRight()>
	//   95  199:isub            
	//   96  200:istore          6
			i = k;
	//   97  202:iload           5
	//   98  204:istore_3        
		}
		  goto _L4
	//*  99  205:goto            51
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
	//    3    5:getfield        #777 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    4    8:aload_0         
	//    5    9:getfield        #95  <Field RecyclerView mRecyclerView>
	//    6   12:getfield        #499 <Field RecyclerView$State RecyclerView.mState>
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:aload_3         
	//   10   18:invokevirtual   #881 <Method boolean performAccessibilityActionForItem(RecyclerView$Recycler, RecyclerView$State, View, int, Bundle)>
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
	//    6   12:invokestatic    #886 <Method void ViewCompat.postOnAnimation(View, Runnable)>
	//    7   15:return          
	}

	public void removeAllViews()
	{
		for(int i = getChildCount() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #450 <Method int getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iflt            26
			mChildHelper.removeViewAt(i);
	//    7   11:aload_0         
	//    8   12:getfield        #124 <Field ChildHelper mChildHelper>
	//    9   15:iload_1         
	//   10   16:invokevirtual   #888 <Method void ChildHelper.removeViewAt(int)>

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
	//*   1    1:invokevirtual   #450 <Method int getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            38
			if(!RecyclerView.getChildViewHolderInt(getChildAt(i)).shouldIgnore())
	//*   7   11:aload_0         
	//*   8   12:iload_2         
	//*   9   13:invokevirtual   #454 <Method View getChildAt(int)>
	//*  10   16:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//*  11   19:invokevirtual   #371 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  12   22:ifne            31
				removeAndRecycleViewAt(i, recycler);
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #892 <Method void removeAndRecycleViewAt(int, RecyclerView$Recycler)>

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
	//    1    1:invokevirtual   #896 <Method int RecyclerView$Recycler.getScrapCount()>
	//    2    4:istore_3        
		int i = j - 1;
	//    3    5:iload_3         
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:istore_2        
		while(i >= 0) 
	//*   7    9:iload_2         
	//*   8   10:iflt            103
		{
			View view = recycler.getScrapViewAt(i);
	//    9   13:aload_1         
	//   10   14:iload_2         
	//   11   15:invokevirtual   #899 <Method View RecyclerView$Recycler.getScrapViewAt(int)>
	//   12   18:astore          4
			RecyclerView.ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
	//   13   20:aload           4
	//   14   22:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//   15   25:astore          5
			if(!viewholder.shouldIgnore())
	//*  16   27:aload           5
	//*  17   29:invokevirtual   #371 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  18   32:ifeq            42
	//*  19   35:iload_2         
	//*  20   36:iconst_1        
	//*  21   37:isub            
	//*  22   38:istore_2        
	//*  23   39:goto            9
			{
				viewholder.setIsRecyclable(false);
	//   24   42:aload           5
	//   25   44:iconst_0        
	//   26   45:invokevirtual   #902 <Method void RecyclerView$ViewHolder.setIsRecyclable(boolean)>
				if(viewholder.isTmpDetached())
	//*  27   48:aload           5
	//*  28   50:invokevirtual   #905 <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*  29   53:ifeq            66
					mRecyclerView.removeDetachedView(view, false);
	//   30   56:aload_0         
	//   31   57:getfield        #95  <Field RecyclerView mRecyclerView>
	//   32   60:aload           4
	//   33   62:iconst_0        
	//   34   63:invokevirtual   #909 <Method void RecyclerView.removeDetachedView(View, boolean)>
				if(mRecyclerView.mItemAnimator != null)
	//*  35   66:aload_0         
	//*  36   67:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  37   70:getfield        #478 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//*  38   73:ifnull          88
					mRecyclerView.mItemAnimator.endAnimation(viewholder);
	//   39   76:aload_0         
	//   40   77:getfield        #95  <Field RecyclerView mRecyclerView>
	//   41   80:getfield        #478 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//   42   83:aload           5
	//   43   85:invokevirtual   #482 <Method void RecyclerView$ItemAnimator.endAnimation(RecyclerView$ViewHolder)>
				viewholder.setIsRecyclable(true);
	//   44   88:aload           5
	//   45   90:iconst_1        
	//   46   91:invokevirtual   #902 <Method void RecyclerView$ViewHolder.setIsRecyclable(boolean)>
				recycler.quickRecycleScrapView(view);
	//   47   94:aload_1         
	//   48   95:aload           4
	//   49   97:invokevirtual   #912 <Method void RecyclerView$Recycler.quickRecycleScrapView(View)>
			}
			i--;
		}
	//*  50  100:goto            35
		recycler.clearScrap();
	//   51  103:aload_1         
	//   52  104:invokevirtual   #915 <Method void RecyclerView$Recycler.clearScrap()>
		if(j > 0)
	//*  53  107:iload_3         
	//*  54  108:ifle            118
			mRecyclerView.invalidate();
	//   55  111:aload_0         
	//   56  112:getfield        #95  <Field RecyclerView mRecyclerView>
	//   57  115:invokevirtual   #916 <Method void RecyclerView.invalidate()>
	//   58  118:return          
	}

	public void removeAndRecycleView(View view, RecyclerView.Recycler recycler)
	{
		removeView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #920 <Method void removeView(View)>
		recycler.recycleView(view);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #923 <Method void RecyclerView$Recycler.recycleView(View)>
	//    6   10:return          
	}

	public void removeAndRecycleViewAt(int i, RecyclerView.Recycler recycler)
	{
		View view = getChildAt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #454 <Method View getChildAt(int)>
	//    3    5:astore_3        
		removeViewAt(i);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:invokevirtual   #386 <Method void removeViewAt(int)>
		recycler.recycleView(view);
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #923 <Method void RecyclerView$Recycler.recycleView(View)>
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
	//    6   12:invokevirtual   #927 <Method boolean RecyclerView.removeCallbacks(Runnable)>
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
	//    4    6:invokevirtual   #909 <Method void RecyclerView.removeDetachedView(View, boolean)>
	//    5    9:return          
	}

	public void removeView(View view)
	{
		mChildHelper.removeView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field ChildHelper mChildHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #928 <Method void ChildHelper.removeView(View)>
	//    4    8:return          
	}

	public void removeViewAt(int i)
	{
		if(getChildAt(i) != null)
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokevirtual   #454 <Method View getChildAt(int)>
	//*   3    5:ifnull          16
			mChildHelper.removeViewAt(i);
	//    4    8:aload_0         
	//    5    9:getfield        #124 <Field ChildHelper mChildHelper>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #888 <Method void ChildHelper.removeViewAt(int)>
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
	//    6    7:invokevirtual   #933 <Method boolean requestChildRectangleOnScreen(RecyclerView, View, Rect, boolean, boolean)>
	//    7   10:ireturn         
	}

	public boolean requestChildRectangleOnScreen(RecyclerView recyclerview, View view, Rect rect, boolean flag, boolean flag1)
	{
label0:
		{
			boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          8
			view = ((View) (getChildRectangleOnScreenScrollAmount(recyclerview, view, rect, flag)));
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:aload_2         
	//    5    6:aload_3         
	//    6    7:iload           4
	//    7    9:invokespecial   #935 <Method int[] getChildRectangleOnScreenScrollAmount(RecyclerView, View, Rect, boolean)>
	//    8   12:astore_2        
			int i = view[0];
	//    9   13:aload_2         
	//   10   14:iconst_0        
	//   11   15:iaload          
	//   12   16:istore          6
			int j = view[1];
	//   13   18:aload_2         
	//   14   19:iconst_1        
	//   15   20:iaload          
	//   16   21:istore          7
			if(flag1)
	//*  17   23:iload           5
	//*  18   25:ifeq            44
			{
				flag1 = flag2;
	//   19   28:iload           8
	//   20   30:istore          5
				if(!isFocusedChildVisibleAfterScrolling(recyclerview, i, j))
					break label0;
	//   21   32:aload_0         
	//   22   33:aload_1         
	//   23   34:iload           6
	//   24   36:iload           7
	//   25   38:invokespecial   #937 <Method boolean isFocusedChildVisibleAfterScrolling(RecyclerView, int, int)>
	//   26   41:ifeq            74
			}
			if(i == 0)
	//*  27   44:iload           6
	//*  28   46:ifne            58
			{
				flag1 = flag2;
	//   29   49:iload           8
	//   30   51:istore          5
				if(j == 0)
					break label0;
	//   31   53:iload           7
	//   32   55:ifeq            74
			}
			if(flag)
	//*  33   58:iload           4
	//*  34   60:ifeq            77
				recyclerview.scrollBy(i, j);
	//   35   63:aload_1         
	//   36   64:iload           6
	//   37   66:iload           7
	//   38   68:invokevirtual   #876 <Method void RecyclerView.scrollBy(int, int)>
			else
	//*  39   71:iconst_1        
	//*  40   72:istore          5
	//*  41   74:iload           5
	//*  42   76:ireturn         
				recyclerview.smoothScrollBy(i, j);
	//   43   77:aload_1         
	//   44   78:iload           6
	//   45   80:iload           7
	//   46   82:invokevirtual   #940 <Method void RecyclerView.smoothScrollBy(int, int)>
			flag1 = true;
		}
		return flag1;
	//*  47   85:goto            71
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
	//    5   11:invokevirtual   #943 <Method void RecyclerView.requestLayout()>
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
	//    2    2:invokevirtual   #951 <Method int RecyclerView.getWidth()>
	//    3    5:ldc1            #237 <Int 0x40000000>
	//    4    7:invokestatic    #240 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #952 <Method int RecyclerView.getHeight()>
	//    7   14:ldc1            #237 <Int 0x40000000>
	//    8   16:invokestatic    #240 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    9   19:invokevirtual   #955 <Method void setMeasureSpecs(int, int)>
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
	//    9   15:putfield        #958 <Field int mPrefetchMaxCountObserved>
			if(mRecyclerView != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  12   22:ifnull          35
				mRecyclerView.mRecycler.updateViewCacheSize();
	//   13   25:aload_0         
	//   14   26:getfield        #95  <Field RecyclerView mRecyclerView>
	//   15   29:getfield        #777 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//   16   32:invokevirtual   #961 <Method void RecyclerView$Recycler.updateViewCacheSize()>
		}
	//   17   35:return          
	}

	void setMeasureSpecs(int i, int j)
	{
		mWidth = android.view.View.MeasureSpec.getSize(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #219 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    3    5:putfield        #657 <Field int mWidth>
		mWidthMode = android.view.View.MeasureSpec.getMode(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokestatic    #216 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    7   13:putfield        #660 <Field int mWidthMode>
		if(mWidthMode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC)
	//*   8   16:aload_0         
	//*   9   17:getfield        #660 <Field int mWidthMode>
	//*  10   20:ifne            34
	//*  11   23:getstatic       #964 <Field boolean RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC>
	//*  12   26:ifne            34
			mWidth = 0;
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:putfield        #657 <Field int mWidth>
		mHeight = android.view.View.MeasureSpec.getSize(j);
	//   16   34:aload_0         
	//   17   35:iload_2         
	//   18   36:invokestatic    #219 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   19   39:putfield        #574 <Field int mHeight>
		mHeightMode = android.view.View.MeasureSpec.getMode(j);
	//   20   42:aload_0         
	//   21   43:iload_2         
	//   22   44:invokestatic    #216 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   23   47:putfield        #577 <Field int mHeightMode>
		if(mHeightMode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC)
	//*  24   50:aload_0         
	//*  25   51:getfield        #577 <Field int mHeightMode>
	//*  26   54:ifne            68
	//*  27   57:getstatic       #964 <Field boolean RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC>
	//*  28   60:ifne            68
			mHeight = 0;
	//   29   63:aload_0         
	//   30   64:iconst_0        
	//   31   65:putfield        #574 <Field int mHeight>
	//   32   68:return          
	}

	public void setMeasuredDimension(int i, int j)
	{
		RecyclerView.access$1200(mRecyclerView, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #968 <Method void RecyclerView.access$1200(RecyclerView, int, int)>
	//    5    9:return          
	}

	public void setMeasuredDimension(Rect rect, int i, int j)
	{
		int k = rect.width();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #287 <Method int Rect.width()>
	//    2    4:istore          4
		int l = getPaddingLeft();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #249 <Method int getPaddingLeft()>
	//    5   10:istore          5
		int i1 = getPaddingRight();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #258 <Method int getPaddingRight()>
	//    8   16:istore          6
		int j1 = rect.height();
	//    9   18:aload_1         
	//   10   19:invokevirtual   #290 <Method int Rect.height()>
	//   11   22:istore          7
		int k1 = getPaddingTop();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #252 <Method int getPaddingTop()>
	//   14   28:istore          8
		int l1 = getPaddingBottom();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #264 <Method int getPaddingBottom()>
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
	//   26   47:invokevirtual   #971 <Method int getMinimumWidth()>
	//   27   50:invokestatic    #973 <Method int chooseSize(int, int, int)>
	//   28   53:iload_3         
	//   29   54:iload           7
	//   30   56:iload           8
	//   31   58:iadd            
	//   32   59:iload           9
	//   33   61:iadd            
	//   34   62:aload_0         
	//   35   63:invokevirtual   #975 <Method int getMinimumHeight()>
	//   36   66:invokestatic    #973 <Method int chooseSize(int, int, int)>
	//   37   69:invokevirtual   #977 <Method void setMeasuredDimension(int, int)>
	//   38   72:return          
	}

	void setMeasuredDimensionFromChildren(int i, int j)
	{
		int j2 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #450 <Method int getChildCount()>
	//    2    4:istore          10
		if(j2 == 0)
	//*   3    6:iload           10
	//*   4    8:ifne            21
		{
			mRecyclerView.defaultOnMeasure(i, j);
	//    5   11:aload_0         
	//    6   12:getfield        #95  <Field RecyclerView mRecyclerView>
	//    7   15:iload_1         
	//    8   16:iload_2         
	//    9   17:invokevirtual   #853 <Method void RecyclerView.defaultOnMeasure(int, int)>
			return;
	//   10   20:return          
		}
		int l1 = 0x7fffffff;
	//   11   21:ldc2            #979 <Int 0x7fffffff>
	//   12   24:istore          8
		int l = 0x7fffffff;
	//   13   26:ldc2            #979 <Int 0x7fffffff>
	//   14   29:istore          4
		int k1 = 0x80000000;
	//   15   31:ldc1            #241 <Int 0x80000000>
	//   16   33:istore          7
		int k = 0x80000000;
	//   17   35:ldc1            #241 <Int 0x80000000>
	//   18   37:istore_3        
		for(int i1 = 0; i1 < j2;)
	//*  19   38:iconst_0        
	//*  20   39:istore          5
	//*  21   41:iload           5
	//*  22   43:iload           10
	//*  23   45:icmpge          179
		{
			View view = getChildAt(i1);
	//   24   48:aload_0         
	//   25   49:iload           5
	//   26   51:invokevirtual   #454 <Method View getChildAt(int)>
	//   27   54:astore          11
			Rect rect = mRecyclerView.mTempRect;
	//   28   56:aload_0         
	//   29   57:getfield        #95  <Field RecyclerView mRecyclerView>
	//   30   60:getfield        #354 <Field Rect RecyclerView.mTempRect>
	//   31   63:astore          12
			getDecoratedBoundsWithMargins(view, rect);
	//   32   65:aload_0         
	//   33   66:aload           11
	//   34   68:aload           12
	//   35   70:invokevirtual   #358 <Method void getDecoratedBoundsWithMargins(View, Rect)>
			int j1 = l1;
	//   36   73:iload           8
	//   37   75:istore          6
			if(rect.left < l1)
	//*  38   77:aload           12
	//*  39   79:getfield        #272 <Field int Rect.left>
	//*  40   82:iload           8
	//*  41   84:icmpge          94
				j1 = rect.left;
	//   42   87:aload           12
	//   43   89:getfield        #272 <Field int Rect.left>
	//   44   92:istore          6
			l1 = k1;
	//   45   94:iload           7
	//   46   96:istore          8
			if(rect.right > k1)
	//*  47   98:aload           12
	//*  48  100:getfield        #361 <Field int Rect.right>
	//*  49  103:iload           7
	//*  50  105:icmple          115
				l1 = rect.right;
	//   51  108:aload           12
	//   52  110:getfield        #361 <Field int Rect.right>
	//   53  113:istore          8
			int i2 = l;
	//   54  115:iload           4
	//   55  117:istore          9
			if(rect.top < l)
	//*  56  119:aload           12
	//*  57  121:getfield        #281 <Field int Rect.top>
	//*  58  124:iload           4
	//*  59  126:icmpge          136
				i2 = rect.top;
	//   60  129:aload           12
	//   61  131:getfield        #281 <Field int Rect.top>
	//   62  134:istore          9
			l = k;
	//   63  136:iload_3         
	//   64  137:istore          4
			if(rect.bottom > k)
	//*  65  139:aload           12
	//*  66  141:getfield        #364 <Field int Rect.bottom>
	//*  67  144:iload_3         
	//*  68  145:icmple          155
				l = rect.bottom;
	//   69  148:aload           12
	//   70  150:getfield        #364 <Field int Rect.bottom>
	//   71  153:istore          4
			i1++;
	//   72  155:iload           5
	//   73  157:iconst_1        
	//   74  158:iadd            
	//   75  159:istore          5
			k1 = l1;
	//   76  161:iload           8
	//   77  163:istore          7
			k = l;
	//   78  165:iload           4
	//   79  167:istore_3        
			l1 = j1;
	//   80  168:iload           6
	//   81  170:istore          8
			l = i2;
	//   82  172:iload           9
	//   83  174:istore          4
		}

	//*  84  176:goto            41
		mRecyclerView.mTempRect.set(l1, l, k1, k);
	//   85  179:aload_0         
	//   86  180:getfield        #95  <Field RecyclerView mRecyclerView>
	//   87  183:getfield        #354 <Field Rect RecyclerView.mTempRect>
	//   88  186:iload           8
	//   89  188:iload           4
	//   90  190:iload           7
	//   91  192:iload_3         
	//   92  193:invokevirtual   #425 <Method void Rect.set(int, int, int, int)>
		setMeasuredDimension(mRecyclerView.mTempRect, i, j);
	//   93  196:aload_0         
	//   94  197:aload_0         
	//   95  198:getfield        #95  <Field RecyclerView mRecyclerView>
	//   96  201:getfield        #354 <Field Rect RecyclerView.mTempRect>
	//   97  204:iload_1         
	//   98  205:iload_2         
	//   99  206:invokevirtual   #981 <Method void setMeasuredDimension(Rect, int, int)>
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
	//*   1    1:ifnonnull       37
		{
			mRecyclerView = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #95  <Field RecyclerView mRecyclerView>
			mChildHelper = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #124 <Field ChildHelper mChildHelper>
			mWidth = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #657 <Field int mWidth>
			mHeight = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #574 <Field int mHeight>
		} else
	//*  14   24:aload_0         
	//*  15   25:ldc1            #237 <Int 0x40000000>
	//*  16   27:putfield        #660 <Field int mWidthMode>
	//*  17   30:aload_0         
	//*  18   31:ldc1            #237 <Int 0x40000000>
	//*  19   33:putfield        #577 <Field int mHeightMode>
	//*  20   36:return          
		{
			mRecyclerView = recyclerview;
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:putfield        #95  <Field RecyclerView mRecyclerView>
			mChildHelper = recyclerview.mChildHelper;
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:getfield        #984 <Field ChildHelper RecyclerView.mChildHelper>
	//   27   47:putfield        #124 <Field ChildHelper mChildHelper>
			mWidth = recyclerview.getWidth();
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:invokevirtual   #951 <Method int RecyclerView.getWidth()>
	//   31   55:putfield        #657 <Field int mWidth>
			mHeight = recyclerview.getHeight();
	//   32   58:aload_0         
	//   33   59:aload_1         
	//   34   60:invokevirtual   #952 <Method int RecyclerView.getHeight()>
	//   35   63:putfield        #574 <Field int mHeight>
		}
		mWidthMode = 0x40000000;
		mHeightMode = 0x40000000;
	//*  36   66:goto            24
	}

	boolean shouldMeasureChild(View view, int i, int j, RecyclerView.LayoutParams layoutparams)
	{
		return view.isLayoutRequested() || !mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getWidth(), i, layoutparams.width) || !isMeasurementUpToDate(view.getHeight(), j, layoutparams.height);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #987 <Method boolean View.isLayoutRequested()>
	//    2    4:ifne            46
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field boolean mMeasurementCacheEnabled>
	//    5   11:ifeq            46
	//    6   14:aload_1         
	//    7   15:invokevirtual   #615 <Method int View.getWidth()>
	//    8   18:iload_2         
	//    9   19:aload           4
	//   10   21:getfield        #723 <Field int RecyclerView$LayoutParams.width>
	//   11   24:invokestatic    #989 <Method boolean isMeasurementUpToDate(int, int, int)>
	//   12   27:ifeq            46
	//   13   30:aload_1         
	//   14   31:invokevirtual   #616 <Method int View.getHeight()>
	//   15   34:iload_3         
	//   16   35:aload           4
	//   17   37:getfield        #728 <Field int RecyclerView$LayoutParams.height>
	//   18   40:invokestatic    #989 <Method boolean isMeasurementUpToDate(int, int, int)>
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
	//    4    8:invokevirtual   #561 <Method int View.getMeasuredWidth()>
	//    5   11:iload_2         
	//    6   12:aload           4
	//    7   14:getfield        #723 <Field int RecyclerView$LayoutParams.width>
	//    8   17:invokestatic    #989 <Method boolean isMeasurementUpToDate(int, int, int)>
	//    9   20:ifeq            39
	//   10   23:aload_1         
	//   11   24:invokevirtual   #557 <Method int View.getMeasuredHeight()>
	//   12   27:iload_3         
	//   13   28:aload           4
	//   14   30:getfield        #728 <Field int RecyclerView$LayoutParams.height>
	//   15   33:invokestatic    #989 <Method boolean isMeasurementUpToDate(int, int, int)>
	//   16   36:ifne            41
	//   17   39:iconst_1        
	//   18   40:ireturn         
	//   19   41:iconst_0        
	//   20   42:ireturn         
	}

	public void smoothScrollToPosition(RecyclerView recyclerview, RecyclerView.State state, int i)
	{
		Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
	//    0    0:ldc2            #838 <String "RecyclerView">
	//    1    3:ldc2            #995 <String "You must override smoothScrollToPosition to support smooth scrolling">
	//    2    6:invokestatic    #846 <Method int Log.e(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void startSmoothScroll( )
	{
		if(mSmoothScroller != null &&  != mSmoothScroller && mSmoothScroller.isRunning())
	//*   0    0:aload_0         
	//*   1    1:getfield        #199 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   2    4:ifnull          32
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #199 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   6   12:if_acmpeq       32
	//*   7   15:aload_0         
	//*   8   16:getfield        #199 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   9   19:invokevirtual   #204 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//*  10   22:ifeq            32
			mSmoothScroller.stop();
	//   11   25:aload_0         
	//   12   26:getfield        #199 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//   13   29:invokevirtual   #999 <Method void RecyclerView$SmoothScroller.stop()>
		mSmoothScroller = ;
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:putfield        #199 <Field RecyclerView$SmoothScroller mSmoothScroller>
		mSmoothScroller.start(mRecyclerView, this);
	//   17   37:aload_0         
	//   18   38:getfield        #199 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//   19   41:aload_0         
	//   20   42:getfield        #95  <Field RecyclerView mRecyclerView>
	//   21   45:aload_0         
	//   22   46:invokevirtual   #1003 <Method void RecyclerView$SmoothScroller.start(RecyclerView, RecyclerView$LayoutManager)>
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
	//    4    6:invokevirtual   #1007 <Method void RecyclerView$ViewHolder.stopIgnoring()>
		((RecyclerView.ViewHolder) (view)).resetInternal();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1010 <Method void RecyclerView$ViewHolder.resetInternal()>
		((RecyclerView.ViewHolder) (view)).addFlags(4);
	//    7   13:aload_1         
	//    8   14:iconst_4        
	//    9   15:invokevirtual   #679 <Method void RecyclerView$ViewHolder.addFlags(int)>
	//   10   18:return          
	}

	void stopSmoothScroller()
	{
		if(mSmoothScroller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #199 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   2    4:ifnull          14
			mSmoothScroller.stop();
	//    3    7:aload_0         
	//    4    8:getfield        #199 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//    5   11:invokevirtual   #999 <Method void RecyclerView$SmoothScroller.stop()>
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
	static void access$1400(RecyclerView$LayoutManager recyclerview$layoutmanager,  )
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
