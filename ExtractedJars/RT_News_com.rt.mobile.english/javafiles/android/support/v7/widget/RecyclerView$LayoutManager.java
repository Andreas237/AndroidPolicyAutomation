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
		Object obj = ((Object) (RecyclerView.getChildViewHolderInt(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore          6
		if(!flag && !((RecyclerView.ViewHolder) (obj)).isRemoved())
	//*   3    6:iload_3         
	//*   4    7:ifne            36
	//*   5   10:aload           6
	//*   6   12:invokevirtual   #93  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*   7   15:ifeq            21
	//*   8   18:goto            36
			mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(((RecyclerView.ViewHolder) (obj)));
	//    9   21:aload_0         
	//   10   22:getfield        #95  <Field RecyclerView mRecyclerView>
	//   11   25:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   12   28:aload           6
	//   13   30:invokevirtual   #105 <Method void ViewInfoStore.removeFromDisappearedInLayout(RecyclerView$ViewHolder)>
		else
	//*  14   33:goto            48
			mRecyclerView.mViewInfoStore.addToDisappearedInLayout(((RecyclerView.ViewHolder) (obj)));
	//   15   36:aload_0         
	//   16   37:getfield        #95  <Field RecyclerView mRecyclerView>
	//   17   40:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   18   43:aload           6
	//   19   45:invokevirtual   #108 <Method void ViewInfoStore.addToDisappearedInLayout(RecyclerView$ViewHolder)>
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//   20   48:aload_1         
	//   21   49:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   22   52:checkcast       #116 <Class RecyclerView$LayoutParams>
	//   23   55:astore          7
		if(!((RecyclerView.ViewHolder) (obj)).wasReturnedFromScrap() && !((RecyclerView.ViewHolder) (obj)).isScrap())
	//*  24   57:aload           6
	//*  25   59:invokevirtual   #119 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  26   62:ifne            245
	//*  27   65:aload           6
	//*  28   67:invokevirtual   #122 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*  29   70:ifeq            76
	//*  30   73:goto            245
		{
			if(view.getParent() == mRecyclerView)
	//*  31   76:aload_1         
	//*  32   77:invokevirtual   #126 <Method android.view.ViewParent View.getParent()>
	//*  33   80:aload_0         
	//*  34   81:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  35   84:if_acmpne       201
			{
				int k = mChildHelper.indexOfChild(view);
	//   36   87:aload_0         
	//   37   88:getfield        #128 <Field ChildHelper mChildHelper>
	//   38   91:aload_1         
	//   39   92:invokevirtual   #134 <Method int ChildHelper.indexOfChild(View)>
	//   40   95:istore          5
				int j = i;
	//   41   97:iload_2         
	//   42   98:istore          4
				if(i == -1)
	//*  43  100:iload_2         
	//*  44  101:iconst_m1       
	//*  45  102:icmpne          114
					j = mChildHelper.getChildCount();
	//   46  105:aload_0         
	//   47  106:getfield        #128 <Field ChildHelper mChildHelper>
	//   48  109:invokevirtual   #138 <Method int ChildHelper.getChildCount()>
	//   49  112:istore          4
				if(k == -1)
	//*  50  114:iload           5
	//*  51  116:iconst_m1       
	//*  52  117:icmpne          177
				{
					obj = ((Object) (new StringBuilder()));
	//   53  120:new             #140 <Class StringBuilder>
	//   54  123:dup             
	//   55  124:invokespecial   #141 <Method void StringBuilder()>
	//   56  127:astore          6
					((StringBuilder) (obj)).append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
	//   57  129:aload           6
	//   58  131:ldc1            #143 <String "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:">
	//   59  133:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   60  136:pop             
					((StringBuilder) (obj)).append(mRecyclerView.indexOfChild(view));
	//   61  137:aload           6
	//   62  139:aload_0         
	//   63  140:getfield        #95  <Field RecyclerView mRecyclerView>
	//   64  143:aload_1         
	//   65  144:invokevirtual   #148 <Method int RecyclerView.indexOfChild(View)>
	//   66  147:invokevirtual   #151 <Method StringBuilder StringBuilder.append(int)>
	//   67  150:pop             
					((StringBuilder) (obj)).append(mRecyclerView.exceptionLabel());
	//   68  151:aload           6
	//   69  153:aload_0         
	//   70  154:getfield        #95  <Field RecyclerView mRecyclerView>
	//   71  157:invokevirtual   #155 <Method String RecyclerView.exceptionLabel()>
	//   72  160:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   73  163:pop             
					throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   74  164:new             #157 <Class IllegalStateException>
	//   75  167:dup             
	//   76  168:aload           6
	//   77  170:invokevirtual   #160 <Method String StringBuilder.toString()>
	//   78  173:invokespecial   #163 <Method void IllegalStateException(String)>
	//   79  176:athrow          
				}
				if(k != j)
	//*  80  177:iload           5
	//*  81  179:iload           4
	//*  82  181:icmpeq          280
					mRecyclerView.mLayout.moveView(k, j);
	//   83  184:aload_0         
	//   84  185:getfield        #95  <Field RecyclerView mRecyclerView>
	//   85  188:getfield        #167 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   86  191:iload           5
	//   87  193:iload           4
	//   88  195:invokevirtual   #171 <Method void moveView(int, int)>
			} else
	//*  89  198:goto            280
			{
				mChildHelper.addView(view, i, false);
	//   90  201:aload_0         
	//   91  202:getfield        #128 <Field ChildHelper mChildHelper>
	//   92  205:aload_1         
	//   93  206:iload_2         
	//   94  207:iconst_0        
	//   95  208:invokevirtual   #174 <Method void ChildHelper.addView(View, int, boolean)>
				layoutparams.mInsetsDirty = true;
	//   96  211:aload           7
	//   97  213:iconst_1        
	//   98  214:putfield        #177 <Field boolean RecyclerView$LayoutParams.mInsetsDirty>
				if(mSmoothScroller != null && mSmoothScroller.isRunning())
	//*  99  217:aload_0         
	//* 100  218:getfield        #179 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//* 101  221:ifnull          280
	//* 102  224:aload_0         
	//* 103  225:getfield        #179 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//* 104  228:invokevirtual   #184 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//* 105  231:ifeq            280
					mSmoothScroller.onChildAttachedToWindow(view);
	//  106  234:aload_0         
	//  107  235:getfield        #179 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//  108  238:aload_1         
	//  109  239:invokevirtual   #188 <Method void RecyclerView$SmoothScroller.onChildAttachedToWindow(View)>
			}
		} else
	//* 110  242:goto            280
		{
			if(((RecyclerView.ViewHolder) (obj)).isScrap())
	//* 111  245:aload           6
	//* 112  247:invokevirtual   #122 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//* 113  250:ifeq            261
				((RecyclerView.ViewHolder) (obj)).unScrap();
	//  114  253:aload           6
	//  115  255:invokevirtual   #191 <Method void RecyclerView$ViewHolder.unScrap()>
			else
	//* 116  258:goto            266
				((RecyclerView.ViewHolder) (obj)).clearReturnedFromScrapFlag();
	//  117  261:aload           6
	//  118  263:invokevirtual   #194 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
			mChildHelper.attachViewToParent(view, i, view.getLayoutParams(), false);
	//  119  266:aload_0         
	//  120  267:getfield        #128 <Field ChildHelper mChildHelper>
	//  121  270:aload_1         
	//  122  271:iload_2         
	//  123  272:aload_1         
	//  124  273:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  125  276:iconst_0        
	//  126  277:invokevirtual   #198 <Method void ChildHelper.attachViewToParent(View, int, android.view.ViewGroup$LayoutParams, boolean)>
		}
		if(layoutparams.mPendingInvalidate)
	//* 127  280:aload           7
	//* 128  282:getfield        #201 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
	//* 129  285:ifeq            302
		{
			((RecyclerView.ViewHolder) (obj)).itemView.invalidate();
	//  130  288:aload           6
	//  131  290:getfield        #205 <Field View RecyclerView$ViewHolder.itemView>
	//  132  293:invokevirtual   #208 <Method void View.invalidate()>
			layoutparams.mPendingInvalidate = false;
	//  133  296:aload           7
	//  134  298:iconst_0        
	//  135  299:putfield        #201 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
		}
	//  136  302:return          
	}

	public static int chooseSize(int i, int j, int k)
	{
		int l = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #216 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		i = android.view.View.MeasureSpec.getSize(i);
	//    3    5:iload_0         
	//    4    6:invokestatic    #219 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_0        
		if(l != 0x80000000)
	//*   6   10:iload_3         
	//*   7   11:ldc1            #220 <Int 0x80000000>
	//*   8   13:icmpeq          30
		{
			if(l != 0x40000000)
	//*   9   16:iload_3         
	//*  10   17:ldc1            #221 <Int 0x40000000>
	//*  11   19:icmpeq          28
				return Math.max(j, k);
	//   12   22:iload_1         
	//   13   23:iload_2         
	//   14   24:invokestatic    #227 <Method int Math.max(int, int)>
	//   15   27:ireturn         
			else
				return i;
	//   16   28:iload_0         
	//   17   29:ireturn         
		} else
		{
			return Math.min(i, Math.max(j, k));
	//   18   30:iload_0         
	//   19   31:iload_1         
	//   20   32:iload_2         
	//   21   33:invokestatic    #227 <Method int Math.max(int, int)>
	//   22   36:invokestatic    #230 <Method int Math.min(int, int)>
	//   23   39:ireturn         
		}
	}

	private void detachViewInternal(int i, View view)
	{
		mChildHelper.detachViewFromParent(i);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field ChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #236 <Method void ChildHelper.detachViewFromParent(int)>
	//    4    8:return          
	}

	public static int getChildMeasureSpec(int i, int j, int k, int l, boolean flag)
	{
		int i1;
		boolean flag1;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		i1 = Math.max(0, i - k);
	//    2    3:iconst_0        
	//    3    4:iload_0         
	//    4    5:iload_2         
	//    5    6:isub            
	//    6    7:invokestatic    #227 <Method int Math.max(int, int)>
	//    7   10:istore          5
		if(!flag) goto _L2; else goto _L1
	//    8   12:iload           4
	//    9   14:ifeq            67
_L1:
		if(l < 0) goto _L4; else goto _L3
	//   10   17:iload_3         
	//   11   18:iflt            29
_L3:
		k = l;
	//   12   21:iload_3         
	//   13   22:istore_2        
		i = 0x40000000;
	//   14   23:ldc1            #221 <Int 0x40000000>
	//   15   25:istore_0        
		break MISSING_BLOCK_LABEL_125;
	//   16   26:goto            125
_L4:
		if(l == -1)
	//*  17   29:iload_3         
	//*  18   30:iconst_m1       
	//*  19   31:icmpne          120
		{
			if(j != 0x80000000 && (j == 0 || j != 0x40000000))
	//*  20   34:iload_1         
	//*  21   35:ldc1            #220 <Int 0x80000000>
	//*  22   37:icmpeq          57
	//*  23   40:iload_1         
	//*  24   41:ifeq            50
	//*  25   44:iload_1         
	//*  26   45:ldc1            #221 <Int 0x40000000>
	//*  27   47:icmpeq          57
			{
				j = 0;
	//   28   50:iconst_0        
	//   29   51:istore_1        
				i = j;
	//   30   52:iload_1         
	//   31   53:istore_0        
			} else
	//*  32   54:goto            60
			{
				i = i1;
	//   33   57:iload           5
	//   34   59:istore_0        
			}
			k = i;
	//   35   60:iload_0         
	//   36   61:istore_2        
			i = j;
	//   37   62:iload_1         
	//   38   63:istore_0        
			break MISSING_BLOCK_LABEL_125;
	//   39   64:goto            125
		}
		break; /* Loop/switch isn't completed */
_L2:
		if(l >= 0)
	//*  40   67:iload_3         
	//*  41   68:iflt            74
			continue; /* Loop/switch isn't completed */
	//   42   71:goto            21
		if(l == -1)
	//*  43   74:iload_3         
	//*  44   75:iconst_m1       
	//*  45   76:icmpne          87
		{
			i = j;
	//   46   79:iload_1         
	//   47   80:istore_0        
			k = i1;
	//   48   81:iload           5
	//   49   83:istore_2        
			break MISSING_BLOCK_LABEL_125;
	//   50   84:goto            125
		}
		if(l == -2)
	//*  51   87:iload_3         
	//*  52   88:bipush          -2
	//*  53   90:icmpne          120
		{
			if(j != 0x80000000)
	//*  54   93:iload_1         
	//*  55   94:ldc1            #220 <Int 0x80000000>
	//*  56   96:icmpeq          111
			{
				k = i1;
	//   57   99:iload           5
	//   58  101:istore_2        
				i = ((int) (flag1));
	//   59  102:iload           6
	//   60  104:istore_0        
				if(j != 0x40000000)
					break MISSING_BLOCK_LABEL_125;
	//   61  105:iload_1         
	//   62  106:ldc1            #221 <Int 0x40000000>
	//   63  108:icmpne          125
			}
			i = 0x80000000;
	//   64  111:ldc1            #220 <Int 0x80000000>
	//   65  113:istore_0        
			k = i1;
	//   66  114:iload           5
	//   67  116:istore_2        
			break MISSING_BLOCK_LABEL_125;
	//   68  117:goto            125
		}
		break; /* Loop/switch isn't completed */
		if(true) goto _L3; else goto _L5
_L5:
		k = 0;
	//   69  120:iconst_0        
	//   70  121:istore_2        
		i = ((int) (flag1));
	//   71  122:iload           6
	//   72  124:istore_0        
		return android.view.View.MeasureSpec.makeMeasureSpec(k, i);
	//   73  125:iload_2         
	//   74  126:iload_0         
	//   75  127:invokestatic    #241 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   76  130:ireturn         
	}

	public static int getChildMeasureSpec(int i, int j, int k, boolean flag)
	{
		boolean flag1;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		i = Math.max(0, i - j);
	//    2    3:iconst_0        
	//    3    4:iload_0         
	//    4    5:iload_1         
	//    5    6:isub            
	//    6    7:invokestatic    #227 <Method int Math.max(int, int)>
	//    7   10:istore_0        
		if(!flag) goto _L2; else goto _L1
	//    8   11:iload_3         
	//    9   12:ifeq            35
_L1:
		if(k < 0) goto _L4; else goto _L3
	//   10   15:iload_2         
	//   11   16:iflt            27
_L3:
		i = k;
	//   12   19:iload_2         
	//   13   20:istore_0        
_L7:
		j = 0x40000000;
	//   14   21:ldc1            #221 <Int 0x40000000>
	//   15   23:istore_1        
		  goto _L5
	//*  16   24:goto            59
_L4:
		i = 0;
	//   17   27:iconst_0        
	//   18   28:istore_0        
		j = ((int) (flag1));
	//   19   29:iload           4
	//   20   31:istore_1        
		break; /* Loop/switch isn't completed */
	//   21   32:goto            59
_L2:
		if(k < 0) goto _L6; else goto _L3
	//   22   35:iload_2         
	//   23   36:iflt            42
	//*  24   39:goto            19
_L6:
		if(k != -1) goto _L8; else goto _L7
	//   25   42:iload_2         
	//   26   43:iconst_m1       
	//   27   44:icmpne          50
	//*  28   47:goto            21
_L8:
		if(k != -2)
			continue; /* Loop/switch isn't completed */
	//   29   50:iload_2         
	//   30   51:bipush          -2
	//   31   53:icmpne          27
		j = 0x80000000;
	//   32   56:ldc1            #220 <Int 0x80000000>
	//   33   58:istore_1        
		break; /* Loop/switch isn't completed */
		if(true) goto _L4; else goto _L5
_L5:
		return android.view.View.MeasureSpec.makeMeasureSpec(i, j);
	//   34   59:iload_0         
	//   35   60:iload_1         
	//   36   61:invokestatic    #241 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   37   64:ireturn         
	}

	private int[] getChildRectangleOnScreenScrollAmount(RecyclerView recyclerview, View view, Rect rect, boolean flag)
	{
		int i = getPaddingLeft();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #249 <Method int getPaddingLeft()>
	//    2    4:istore          5
		int j = getPaddingTop();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #252 <Method int getPaddingTop()>
	//    5   10:istore          6
		int k = getWidth();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #255 <Method int getWidth()>
	//    8   16:istore          7
		int j2 = getPaddingRight();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #258 <Method int getPaddingRight()>
	//   11   22:istore          14
		int i1 = getHeight();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #261 <Method int getHeight()>
	//   14   28:istore          9
		int j1 = getPaddingBottom();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #264 <Method int getPaddingBottom()>
	//   17   34:istore          10
		int k2 = (view.getLeft() + rect.left) - view.getScrollX();
	//   18   36:aload_2         
	//   19   37:invokevirtual   #267 <Method int View.getLeft()>
	//   20   40:aload_3         
	//   21   41:getfield        #272 <Field int Rect.left>
	//   22   44:iadd            
	//   23   45:aload_2         
	//   24   46:invokevirtual   #275 <Method int View.getScrollX()>
	//   25   49:isub            
	//   26   50:istore          15
		int k1 = (view.getTop() + rect.top) - view.getScrollY();
	//   27   52:aload_2         
	//   28   53:invokevirtual   #278 <Method int View.getTop()>
	//   29   56:aload_3         
	//   30   57:getfield        #281 <Field int Rect.top>
	//   31   60:iadd            
	//   32   61:aload_2         
	//   33   62:invokevirtual   #284 <Method int View.getScrollY()>
	//   34   65:isub            
	//   35   66:istore          11
		int l2 = rect.width();
	//   36   68:aload_3         
	//   37   69:invokevirtual   #287 <Method int Rect.width()>
	//   38   72:istore          16
		int l1 = rect.height();
	//   39   74:aload_3         
	//   40   75:invokevirtual   #290 <Method int Rect.height()>
	//   41   78:istore          12
		int i2 = k2 - i;
	//   42   80:iload           15
	//   43   82:iload           5
	//   44   84:isub            
	//   45   85:istore          13
		i = Math.min(0, i2);
	//   46   87:iconst_0        
	//   47   88:iload           13
	//   48   90:invokestatic    #230 <Method int Math.min(int, int)>
	//   49   93:istore          5
		int l = k1 - j;
	//   50   95:iload           11
	//   51   97:iload           6
	//   52   99:isub            
	//   53  100:istore          8
		j = Math.min(0, l);
	//   54  102:iconst_0        
	//   55  103:iload           8
	//   56  105:invokestatic    #230 <Method int Math.min(int, int)>
	//   57  108:istore          6
		j2 = (l2 + k2) - (k - j2);
	//   58  110:iload           16
	//   59  112:iload           15
	//   60  114:iadd            
	//   61  115:iload           7
	//   62  117:iload           14
	//   63  119:isub            
	//   64  120:isub            
	//   65  121:istore          14
		k = Math.max(0, j2);
	//   66  123:iconst_0        
	//   67  124:iload           14
	//   68  126:invokestatic    #227 <Method int Math.max(int, int)>
	//   69  129:istore          7
		i1 = Math.max(0, (l1 + k1) - (i1 - j1));
	//   70  131:iconst_0        
	//   71  132:iload           12
	//   72  134:iload           11
	//   73  136:iadd            
	//   74  137:iload           9
	//   75  139:iload           10
	//   76  141:isub            
	//   77  142:isub            
	//   78  143:invokestatic    #227 <Method int Math.max(int, int)>
	//   79  146:istore          9
		if(getLayoutDirection() == 1)
	//*  80  148:aload_0         
	//*  81  149:invokevirtual   #293 <Method int getLayoutDirection()>
	//*  82  152:iconst_1        
	//*  83  153:icmpne          180
		{
			if(k != 0)
	//*  84  156:iload           7
	//*  85  158:ifeq            168
				i = k;
	//   86  161:iload           7
	//   87  163:istore          5
			else
	//*  88  165:goto            200
				i = Math.max(i, j2);
	//   89  168:iload           5
	//   90  170:iload           14
	//   91  172:invokestatic    #227 <Method int Math.max(int, int)>
	//   92  175:istore          5
		} else
	//*  93  177:goto            200
		if(i == 0)
	//*  94  180:iload           5
	//*  95  182:ifeq            188
	//*  96  185:goto            200
			i = Math.min(i2, k);
	//   97  188:iload           13
	//   98  190:iload           7
	//   99  192:invokestatic    #230 <Method int Math.min(int, int)>
	//  100  195:istore          5
	//* 101  197:goto            185
		if(j == 0)
	//* 102  200:iload           6
	//* 103  202:ifeq            208
	//* 104  205:goto            217
			j = Math.min(l, i1);
	//  105  208:iload           8
	//  106  210:iload           9
	//  107  212:invokestatic    #230 <Method int Math.min(int, int)>
	//  108  215:istore          6
		return (new int[] {
			i, j
		});
	//  109  217:iconst_2        
	//  110  218:newarray        int[]
	//  111  220:dup             
	//  112  221:iconst_0        
	//  113  222:iload           5
	//  114  224:iastore         
	//  115  225:dup             
	//  116  226:iconst_1        
	//  117  227:iload           6
	//  118  229:iastore         
	//  119  230:areturn         
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
		if(recyclerview == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
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
		if(rect.left - i < i1 - j1 && rect.right - i > k && rect.top - j < k1 - l1)
	//*  33   63:aload           10
	//*  34   65:getfield        #272 <Field int Rect.left>
	//*  35   68:iload_2         
	//*  36   69:isub            
	//*  37   70:iload           6
	//*  38   72:iload           7
	//*  39   74:isub            
	//*  40   75:icmpge          121
	//*  41   78:aload           10
	//*  42   80:getfield        #361 <Field int Rect.right>
	//*  43   83:iload_2         
	//*  44   84:isub            
	//*  45   85:iload           4
	//*  46   87:icmple          121
	//*  47   90:aload           10
	//*  48   92:getfield        #281 <Field int Rect.top>
	//*  49   95:iload_3         
	//*  50   96:isub            
	//*  51   97:iload           8
	//*  52   99:iload           9
	//*  53  101:isub            
	//*  54  102:icmpge          121
			return rect.bottom - j > l;
	//   55  105:aload           10
	//   56  107:getfield        #364 <Field int Rect.bottom>
	//   57  110:iload_3         
	//   58  111:isub            
	//   59  112:iload           5
	//   60  114:icmpgt          119
	//   61  117:iconst_0        
	//   62  118:ireturn         
	//   63  119:iconst_1        
	//   64  120:ireturn         
		else
			return false;
	//   65  121:iconst_0        
	//   66  122:ireturn         
	}

	private static boolean isMeasurementUpToDate(int i, int j, int k)
	{
		int l = android.view.View.MeasureSpec.getMode(j);
	//    0    0:iload_1         
	//    1    1:invokestatic    #216 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		j = android.view.View.MeasureSpec.getSize(j);
	//    3    5:iload_1         
	//    4    6:invokestatic    #219 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_1        
		boolean flag1 = false;
	//    6   10:iconst_0        
	//    7   11:istore          5
		boolean flag = false;
	//    8   13:iconst_0        
	//    9   14:istore          4
		if(k > 0 && i != k)
	//*  10   16:iload_2         
	//*  11   17:ifle            27
	//*  12   20:iload_0         
	//*  13   21:iload_2         
	//*  14   22:icmpeq          27
			return false;
	//   15   25:iconst_0        
	//   16   26:ireturn         
		if(l != 0x80000000)
	//*  17   27:iload_3         
	//*  18   28:ldc1            #220 <Int 0x80000000>
	//*  19   30:icmpeq          58
			if(l != 0)
	//*  20   33:iload_3         
	//*  21   34:ifeq            56
			{
				if(l != 0x40000000)
	//*  22   37:iload_3         
	//*  23   38:ldc1            #221 <Int 0x40000000>
	//*  24   40:icmpeq          45
					return false;
	//   25   43:iconst_0        
	//   26   44:ireturn         
				if(j == i)
	//*  27   45:iload_1         
	//*  28   46:iload_0         
	//*  29   47:icmpne          53
					flag = true;
	//   30   50:iconst_1        
	//   31   51:istore          4
				return flag;
	//   32   53:iload           4
	//   33   55:ireturn         
			} else
			{
				return true;
	//   34   56:iconst_1        
	//   35   57:ireturn         
			}
		flag = flag1;
	//   36   58:iload           5
	//   37   60:istore          4
		if(j >= i)
	//*  38   62:iload_1         
	//*  39   63:iload_0         
	//*  40   64:icmplt          70
			flag = true;
	//   41   67:iconst_1        
	//   42   68:istore          4
		return flag;
	//   43   70:iload           4
	//   44   72:ireturn         
	}

	private void onSmoothScrollerStopped( )
	{
		if(mSmoothScroller == )
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       13
			mSmoothScroller = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #179 <Field RecyclerView$SmoothScroller mSmoothScroller>
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
	//    4    4:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    5    7:checkcast       #116 <Class RecyclerView$LayoutParams>
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
	//*   5   11:ifeq            29
			mRecyclerView.mViewInfoStore.addToDisappearedInLayout(viewholder);
	//    6   14:aload_0         
	//    7   15:getfield        #95  <Field RecyclerView mRecyclerView>
	//    8   18:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//    9   21:aload           4
	//   10   23:invokevirtual   #108 <Method void ViewInfoStore.addToDisappearedInLayout(RecyclerView$ViewHolder)>
		else
	//*  11   26:goto            41
			mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(viewholder);
	//   12   29:aload_0         
	//   13   30:getfield        #95  <Field RecyclerView mRecyclerView>
	//   14   33:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   15   36:aload           4
	//   16   38:invokevirtual   #105 <Method void ViewInfoStore.removeFromDisappearedInLayout(RecyclerView$ViewHolder)>
		mChildHelper.attachViewToParent(view, i, ((android.view.ViewGroup.LayoutParams) (layoutparams)), viewholder.isRemoved());
	//   17   41:aload_0         
	//   18   42:getfield        #128 <Field ChildHelper mChildHelper>
	//   19   45:aload_1         
	//   20   46:iload_2         
	//   21   47:aload_3         
	//   22   48:aload           4
	//   23   50:invokevirtual   #93  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//   24   53:invokevirtual   #198 <Method void ChildHelper.attachViewToParent(View, int, android.view.ViewGroup$LayoutParams, boolean)>
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
	//    3    3:getfield        #128 <Field ChildHelper mChildHelper>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #134 <Method int ChildHelper.indexOfChild(View)>
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
	//    1    1:getfield        #128 <Field ChildHelper mChildHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #134 <Method int ChildHelper.indexOfChild(View)>
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
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		view = mRecyclerView.findContainingItemView(view);
	//    5    9:aload_0         
	//    6   10:getfield        #95  <Field RecyclerView mRecyclerView>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #486 <Method View RecyclerView.findContainingItemView(View)>
	//    9   17:astore_1        
		if(view == null)
	//*  10   18:aload_1         
	//*  11   19:ifnonnull       24
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		if(mChildHelper.isHidden(view))
	//*  14   24:aload_0         
	//*  15   25:getfield        #128 <Field ChildHelper mChildHelper>
	//*  16   28:aload_1         
	//*  17   29:invokevirtual   #490 <Method boolean ChildHelper.isHidden(View)>
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
	//    1    1:invokevirtual   #450 <Method int getChildCount()>
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
	//   10   14:invokevirtual   #454 <Method View getChildAt(int)>
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
	//*  19   36:invokevirtual   #495 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//*  20   39:iload_1         
	//*  21   40:icmpne          75
	//*  22   43:aload           5
	//*  23   45:invokevirtual   #371 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  24   48:ifne            75
	//*  25   51:aload_0         
	//*  26   52:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  27   55:getfield        #499 <Field RecyclerView$State RecyclerView.mState>
	//*  28   58:invokevirtual   #504 <Method boolean RecyclerView$State.isPreLayout()>
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
	//    4    6:invokespecial   #511 <Method void RecyclerView$LayoutParams(Context, AttributeSet)>
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
	//    7   15:invokespecial   #515 <Method void RecyclerView$LayoutParams(RecyclerView$LayoutParams)>
	//    8   18:areturn         
		if(layoutparams instanceof android.view.s)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #517 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return new RecyclerView.LayoutParams((android.view.s)layoutparams);
	//   12   26:new             #116 <Class RecyclerView$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #517 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #520 <Method void RecyclerView$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return new RecyclerView.LayoutParams(layoutparams);
	//   18   38:new             #116 <Class RecyclerView$LayoutParams>
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
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #528 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:getfield        #364 <Field int Rect.bottom>
	//    5   13:ireturn         
	}

	public View getChildAt(int i)
	{
		if(mChildHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field ChildHelper mChildHelper>
	//*   2    4:ifnull          16
			return mChildHelper.getChildAt(i);
	//    3    7:aload_0         
	//    4    8:getfield        #128 <Field ChildHelper mChildHelper>
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
	//*   1    1:getfield        #128 <Field ChildHelper mChildHelper>
	//*   2    4:ifnull          15
			return mChildHelper.getChildCount();
	//    3    7:aload_0         
	//    4    8:getfield        #128 <Field ChildHelper mChildHelper>
	//    5   11:invokevirtual   #138 <Method int ChildHelper.getChildCount()>
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
		recycler = ((RecyclerView.Recycler) (mRecyclerView));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:astore_1        
		int i = 1;
	//    3    5:iconst_1        
	//    4    6:istore_3        
		if(recycler != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          43
		{
			if(mRecyclerView.mAdapter == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   9   15:getfield        #378 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  10   18:ifnonnull       23
				return 1;
	//   11   21:iconst_1        
	//   12   22:ireturn         
			if(canScrollHorizontally())
	//*  13   23:aload_0         
	//*  14   24:invokevirtual   #537 <Method boolean canScrollHorizontally()>
	//*  15   27:ifeq            41
				i = mRecyclerView.mAdapter.getItemCount();
	//   16   30:aload_0         
	//   17   31:getfield        #95  <Field RecyclerView mRecyclerView>
	//   18   34:getfield        #378 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   19   37:invokevirtual   #540 <Method int RecyclerView$Adapter.getItemCount()>
	//   20   40:istore_3        
			return i;
	//   21   41:iload_3         
	//   22   42:ireturn         
		} else
		{
			return 1;
	//   23   43:iconst_1        
	//   24   44:ireturn         
		}
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
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
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
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
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
	//    7   13:invokevirtual   #350 <Method View RecyclerView.getFocusedChild()>
	//    8   16:astore_1        
		if(view != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          36
		{
			if(mChildHelper.isHidden(view))
	//*  11   21:aload_0         
	//*  12   22:getfield        #128 <Field ChildHelper mChildHelper>
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #490 <Method boolean ChildHelper.isHidden(View)>
	//*  15   29:ifeq            34
				return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
			else
				return view;
	//   18   34:aload_1         
	//   19   35:areturn         
		} else
		{
			return null;
	//   20   36:aconst_null     
	//   21   37:areturn         
		}
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
	//*   2    4:ifnull          18
			adapter = mRecyclerView.getAdapter();
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field RecyclerView mRecyclerView>
	//    5   11:invokevirtual   #581 <Method RecyclerView$Adapter RecyclerView.getAdapter()>
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
	//   13   25:invokevirtual   #540 <Method int RecyclerView$Adapter.getItemCount()>
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
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
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
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:invokevirtual   #608 <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
	//    4   10:ireturn         
	}

	public int getRightDecorationWidth(View view)
	{
		return ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets.right;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #528 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:getfield        #361 <Field int Rect.right>
	//    5   13:ireturn         
	}

	public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		recycler = ((RecyclerView.Recycler) (mRecyclerView));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//    2    4:astore_1        
		int i = 1;
	//    3    5:iconst_1        
	//    4    6:istore_3        
		if(recycler != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          43
		{
			if(mRecyclerView.mAdapter == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   9   15:getfield        #378 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  10   18:ifnonnull       23
				return 1;
	//   11   21:iconst_1        
	//   12   22:ireturn         
			if(canScrollVertically())
	//*  13   23:aload_0         
	//*  14   24:invokevirtual   #611 <Method boolean canScrollVertically()>
	//*  15   27:ifeq            41
				i = mRecyclerView.mAdapter.getItemCount();
	//   16   30:aload_0         
	//   17   31:getfield        #95  <Field RecyclerView mRecyclerView>
	//   18   34:getfield        #378 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   19   37:invokevirtual   #540 <Method int RecyclerView$Adapter.getItemCount()>
	//   20   40:istore_3        
			return i;
	//   21   41:iload_3         
	//   22   42:ireturn         
		} else
		{
			return 1;
	//   23   43:iconst_1        
	//   24   44:ireturn         
		}
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
	//    3    7:getfield        #528 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:getfield        #281 <Field int Rect.top>
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
	//*  25   52:goto            69
		{
			rect.set(0, 0, view.getWidth(), view.getHeight());
	//   26   55:aload_3         
	//   27   56:iconst_0        
	//   28   57:iconst_0        
	//   29   58:aload_1         
	//   30   59:invokevirtual   #615 <Method int View.getWidth()>
	//   31   62:aload_1         
	//   32   63:invokevirtual   #616 <Method int View.getHeight()>
	//   33   66:invokevirtual   #425 <Method void Rect.set(int, int, int, int)>
		}
		if(mRecyclerView != null)
	//*  34   69:aload_0         
	//*  35   70:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  36   73:ifnull          162
		{
			Matrix matrix = view.getMatrix();
	//   37   76:aload_1         
	//   38   77:invokevirtual   #620 <Method Matrix View.getMatrix()>
	//   39   80:astore          4
			if(matrix != null && !matrix.isIdentity())
	//*  40   82:aload           4
	//*  41   84:ifnull          162
	//*  42   87:aload           4
	//*  43   89:invokevirtual   #625 <Method boolean Matrix.isIdentity()>
	//*  44   92:ifne            162
			{
				RectF rectf = mRecyclerView.mTempRectF;
	//   45   95:aload_0         
	//   46   96:getfield        #95  <Field RecyclerView mRecyclerView>
	//   47   99:getfield        #629 <Field RectF RecyclerView.mTempRectF>
	//   48  102:astore          5
				rectf.set(rect);
	//   49  104:aload           5
	//   50  106:aload_3         
	//   51  107:invokevirtual   #632 <Method void RectF.set(Rect)>
				matrix.mapRect(rectf);
	//   52  110:aload           4
	//   53  112:aload           5
	//   54  114:invokevirtual   #636 <Method boolean Matrix.mapRect(RectF)>
	//   55  117:pop             
				rect.set((int)Math.floor(rectf.left), (int)Math.floor(rectf.top), (int)Math.ceil(rectf.right), (int)Math.ceil(rectf.bottom));
	//   56  118:aload_3         
	//   57  119:aload           5
	//   58  121:getfield        #639 <Field float RectF.left>
	//   59  124:f2d             
	//   60  125:invokestatic    #643 <Method double Math.floor(double)>
	//   61  128:d2i             
	//   62  129:aload           5
	//   63  131:getfield        #645 <Field float RectF.top>
	//   64  134:f2d             
	//   65  135:invokestatic    #643 <Method double Math.floor(double)>
	//   66  138:d2i             
	//   67  139:aload           5
	//   68  141:getfield        #647 <Field float RectF.right>
	//   69  144:f2d             
	//   70  145:invokestatic    #650 <Method double Math.ceil(double)>
	//   71  148:d2i             
	//   72  149:aload           5
	//   73  151:getfield        #652 <Field float RectF.bottom>
	//   74  154:f2d             
	//   75  155:invokestatic    #650 <Method double Math.ceil(double)>
	//   76  158:d2i             
	//   77  159:invokevirtual   #425 <Method void Rect.set(int, int, int, int)>
			}
		}
		rect.offset(view.getLeft(), view.getTop());
	//   78  162:aload_3         
	//   79  163:aload_1         
	//   80  164:invokevirtual   #267 <Method int View.getLeft()>
	//   81  167:aload_1         
	//   82  168:invokevirtual   #278 <Method int View.getTop()>
	//   83  171:invokevirtual   #655 <Method void Rect.offset(int, int)>
	//   84  174:return          
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
	//   11   17:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
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
		if(view.getParent() == mRecyclerView && mRecyclerView.indexOfChild(view) != -1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #126 <Method android.view.ViewParent View.getParent()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   4    8:if_acmpne       50
	//*   5   11:aload_0         
	//*   6   12:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #148 <Method int RecyclerView.indexOfChild(View)>
	//*   9   19:iconst_m1       
	//*  10   20:icmpne          26
	//*  11   23:goto            50
		{
			view = ((View) (RecyclerView.getChildViewHolderInt(view)));
	//   12   26:aload_1         
	//   13   27:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//   14   30:astore_1        
			((RecyclerView.ViewHolder) (view)).addFlags(128);
	//   15   31:aload_1         
	//   16   32:sipush          128
	//   17   35:invokevirtual   #674 <Method void RecyclerView$ViewHolder.addFlags(int)>
			mRecyclerView.mViewInfoStore.removeViewHolder(((RecyclerView.ViewHolder) (view)));
	//   18   38:aload_0         
	//   19   39:getfield        #95  <Field RecyclerView mRecyclerView>
	//   20   42:getfield        #99  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #677 <Method void ViewInfoStore.removeViewHolder(RecyclerView$ViewHolder)>
			return;
	//   23   49:return          
		} else
		{
			view = ((View) (new StringBuilder()));
	//   24   50:new             #140 <Class StringBuilder>
	//   25   53:dup             
	//   26   54:invokespecial   #141 <Method void StringBuilder()>
	//   27   57:astore_1        
			((StringBuilder) (view)).append("View should be fully attached to be ignored");
	//   28   58:aload_1         
	//   29   59:ldc2            #679 <String "View should be fully attached to be ignored">
	//   30   62:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   31   65:pop             
			((StringBuilder) (view)).append(mRecyclerView.exceptionLabel());
	//   32   66:aload_1         
	//   33   67:aload_0         
	//   34   68:getfield        #95  <Field RecyclerView mRecyclerView>
	//   35   71:invokevirtual   #155 <Method String RecyclerView.exceptionLabel()>
	//   36   74:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:pop             
			throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   38   78:new             #681 <Class IllegalArgumentException>
	//   39   81:dup             
	//   40   82:aload_1         
	//   41   83:invokevirtual   #160 <Method String StringBuilder.toString()>
	//   42   86:invokespecial   #682 <Method void IllegalArgumentException(String)>
	//   43   89:athrow          
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
	//    1    1:getfield        #179 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #179 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//    5   11:invokevirtual   #184 <Method boolean RecyclerView$SmoothScroller.isRunning()>
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
	//*   4    8:invokevirtual   #699 <Method boolean ViewBoundsCheck.isViewWithinBoundFlags(View, int)>
	//*   5   11:ifeq            33
	//*   6   14:aload_0         
	//*   7   15:getfield        #64  <Field ViewBoundsCheck mVerticalBoundCheck>
	//*   8   18:aload_1         
	//*   9   19:sipush          24579
	//*  10   22:invokevirtual   #699 <Method boolean ViewBoundsCheck.isViewWithinBoundFlags(View, int)>
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
		else
			return flag1 ^ true;
	//   21   41:iload_3         
	//   22   42:iconst_1        
	//   23   43:ixor            
	//   24   44:ireturn         
	}

	public void layoutDecorated(View view, int i, int j, int k, int l)
	{
		Rect rect = ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #528 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:astore          6
		view.layout(i + rect.left, j + rect.top, k - rect.right, l - rect.bottom);
	//    5   12:aload_1         
	//    6   13:iload_2         
	//    7   14:aload           6
	//    8   16:getfield        #272 <Field int Rect.left>
	//    9   19:iadd            
	//   10   20:iload_3         
	//   11   21:aload           6
	//   12   23:getfield        #281 <Field int Rect.top>
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
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
	//    3    7:astore          6
		Rect rect = layoutparams.mDecorInsets;
	//    4    9:aload           6
	//    5   11:getfield        #528 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    6   14:astore          7
		view.layout(i + rect.left + layoutparams.leftMargin, j + rect.top + layoutparams.topMargin, k - rect.right - layoutparams.rightMargin, l - rect.bottom - layoutparams.bottomMargin);
	//    7   16:aload_1         
	//    8   17:iload_2         
	//    9   18:aload           7
	//   10   20:getfield        #272 <Field int Rect.left>
	//   11   23:iadd            
	//   12   24:aload           6
	//   13   26:getfield        #709 <Field int RecyclerView$LayoutParams.leftMargin>
	//   14   29:iadd            
	//   15   30:iload_3         
	//   16   31:aload           7
	//   17   33:getfield        #281 <Field int Rect.top>
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
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
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
	//    1    1:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #116 <Class RecyclerView$LayoutParams>
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
		Object obj = ((Object) (getChildAt(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #454 <Method View getChildAt(int)>
	//    3    5:astore_3        
		if(obj == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       56
		{
			obj = ((Object) (new StringBuilder()));
	//    6   10:new             #140 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #141 <Method void StringBuilder()>
	//    9   17:astore_3        
			((StringBuilder) (obj)).append("Cannot move a child from non-existing index:");
	//   10   18:aload_3         
	//   11   19:ldc2            #738 <String "Cannot move a child from non-existing index:">
	//   12   22:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
			((StringBuilder) (obj)).append(i);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokevirtual   #151 <Method StringBuilder StringBuilder.append(int)>
	//   17   31:pop             
			((StringBuilder) (obj)).append(mRecyclerView.toString());
	//   18   32:aload_3         
	//   19   33:aload_0         
	//   20   34:getfield        #95  <Field RecyclerView mRecyclerView>
	//   21   37:invokevirtual   #739 <Method String RecyclerView.toString()>
	//   22   40:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   24   44:new             #681 <Class IllegalArgumentException>
	//   25   47:dup             
	//   26   48:aload_3         
	//   27   49:invokevirtual   #160 <Method String StringBuilder.toString()>
	//   28   52:invokespecial   #682 <Method void IllegalArgumentException(String)>
	//   29   55:athrow          
		} else
		{
			detachViewAt(i);
	//   30   56:aload_0         
	//   31   57:iload_1         
	//   32   58:invokevirtual   #394 <Method void detachViewAt(int)>
			attachView(((View) (obj)), j);
	//   33   61:aload_0         
	//   34   62:aload_3         
	//   35   63:iload_2         
	//   36   64:invokevirtual   #417 <Method void attachView(View, int)>
			return;
	//   37   67:return          
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
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnull          114
		{
			if(accessibilityevent == null)
	//*   3    7:aload_3         
	//*   4    8:ifnonnull       12
				return;
	//    5   11:return          
			recycler = ((RecyclerView.Recycler) (mRecyclerView));
	//    6   12:aload_0         
	//    7   13:getfield        #95  <Field RecyclerView mRecyclerView>
	//    8   16:astore_1        
			boolean flag1 = true;
	//    9   17:iconst_1        
	//   10   18:istore          5
			boolean flag = flag1;
	//   11   20:iload           5
	//   12   22:istore          4
			if(!((RecyclerView) (recycler)).canScrollVertically(1))
	//*  13   24:aload_1         
	//*  14   25:iconst_1        
	//*  15   26:invokevirtual   #761 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  16   29:ifne            83
			{
				flag = flag1;
	//   17   32:iload           5
	//   18   34:istore          4
				if(!mRecyclerView.canScrollVertically(-1))
	//*  19   36:aload_0         
	//*  20   37:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  21   40:iconst_m1       
	//*  22   41:invokevirtual   #761 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  23   44:ifne            83
				{
					flag = flag1;
	//   24   47:iload           5
	//   25   49:istore          4
					if(!mRecyclerView.canScrollHorizontally(-1))
	//*  26   51:aload_0         
	//*  27   52:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  28   55:iconst_m1       
	//*  29   56:invokevirtual   #763 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  30   59:ifne            83
						if(mRecyclerView.canScrollHorizontally(1))
	//*  31   62:aload_0         
	//*  32   63:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  33   66:iconst_1        
	//*  34   67:invokevirtual   #763 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  35   70:ifeq            80
							flag = flag1;
	//   36   73:iload           5
	//   37   75:istore          4
						else
	//*  38   77:goto            83
							flag = false;
	//   39   80:iconst_0        
	//   40   81:istore          4
				}
			}
			accessibilityevent.setScrollable(flag);
	//   41   83:aload_3         
	//   42   84:iload           4
	//   43   86:invokevirtual   #769 <Method void AccessibilityEvent.setScrollable(boolean)>
			if(mRecyclerView.mAdapter != null)
	//*  44   89:aload_0         
	//*  45   90:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  46   93:getfield        #378 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  47   96:ifnull          113
				accessibilityevent.setItemCount(mRecyclerView.mAdapter.getItemCount());
	//   48   99:aload_3         
	//   49  100:aload_0         
	//   50  101:getfield        #95  <Field RecyclerView mRecyclerView>
	//   51  104:getfield        #378 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   52  107:invokevirtual   #540 <Method int RecyclerView$Adapter.getItemCount()>
	//   53  110:invokevirtual   #772 <Method void AccessibilityEvent.setItemCount(int)>
			return;
	//   54  113:return          
		} else
		{
			return;
	//   55  114:return          
		}
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
		boolean flag = canScrollVertically();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #611 <Method boolean canScrollVertically()>
	//    2    4:istore          7
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore          6
		int i;
		if(flag)
	//*   5    9:iload           7
	//*   6   11:ifeq            24
			i = getPosition(view);
	//    7   14:aload_0         
	//    8   15:aload_3         
	//    9   16:invokevirtual   #812 <Method int getPosition(View)>
	//   10   19:istore          5
		else
	//*  11   21:goto            27
			i = 0;
	//   12   24:iconst_0        
	//   13   25:istore          5
		if(canScrollHorizontally())
	//*  14   27:aload_0         
	//*  15   28:invokevirtual   #537 <Method boolean canScrollHorizontally()>
	//*  16   31:ifeq            41
			j = getPosition(view);
	//   17   34:aload_0         
	//   18   35:aload_3         
	//   19   36:invokevirtual   #812 <Method int getPosition(View)>
	//   20   39:istore          6
		accessibilitynodeinfocompat.setCollectionItemInfo(((Object) (android.support.v4.view.accessibility..CollectionItemInfoCompat.obtain(i, 1, j, 1, false, false))));
	//   21   41:aload           4
	//   22   43:iload           5
	//   23   45:iconst_1        
	//   24   46:iload           6
	//   25   48:iconst_1        
	//   26   49:iconst_0        
	//   27   50:iconst_0        
	//   28   51:invokestatic    #817 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//   29   54:invokevirtual   #820 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
	//   30   57:return          
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
	//*   9   17:getfield        #128 <Field ChildHelper mChildHelper>
	//*  10   20:aload_3         
	//*  11   21:getfield        #205 <Field View RecyclerView$ViewHolder.itemView>
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
	//    2    4:ifne            19
	//    3    7:aload_1         
	//    4    8:invokevirtual   #863 <Method boolean RecyclerView.isComputingLayout()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
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
		int j;
label0:
		{
			if(mRecyclerView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnonnull       9
				return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
			int k;
			if(i != 4096)
	//*   5    9:iload_3         
	//*   6   10:sipush          4096
	//*   7   13:icmpeq          97
			{
				if(i != 8192)
	//*   8   16:iload_3         
	//*   9   17:sipush          8192
	//*  10   20:icmpeq          31
				{
					i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_3        
					j = i;
	//   13   25:iload_3         
	//   14   26:istore          5
					break label0;
	//   15   28:goto            167
				}
				if(mRecyclerView.canScrollVertically(-1))
	//*  16   31:aload_0         
	//*  17   32:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  18   35:iconst_m1       
	//*  19   36:invokevirtual   #761 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  20   39:ifeq            61
					i = -(getHeight() - getPaddingTop() - getPaddingBottom());
	//   21   42:aload_0         
	//   22   43:invokevirtual   #261 <Method int getHeight()>
	//   23   46:aload_0         
	//   24   47:invokevirtual   #252 <Method int getPaddingTop()>
	//   25   50:isub            
	//   26   51:aload_0         
	//   27   52:invokevirtual   #264 <Method int getPaddingBottom()>
	//   28   55:isub            
	//   29   56:ineg            
	//   30   57:istore_3        
				else
	//*  31   58:goto            63
					i = 0;
	//   32   61:iconst_0        
	//   33   62:istore_3        
				k = i;
	//   34   63:iload_3         
	//   35   64:istore          6
				if(mRecyclerView.canScrollHorizontally(-1))
	//*  36   66:aload_0         
	//*  37   67:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  38   70:iconst_m1       
	//*  39   71:invokevirtual   #763 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  40   74:ifeq            161
				{
					j = -(getWidth() - getPaddingLeft() - getPaddingRight());
	//   41   77:aload_0         
	//   42   78:invokevirtual   #255 <Method int getWidth()>
	//   43   81:aload_0         
	//   44   82:invokevirtual   #249 <Method int getPaddingLeft()>
	//   45   85:isub            
	//   46   86:aload_0         
	//   47   87:invokevirtual   #258 <Method int getPaddingRight()>
	//   48   90:isub            
	//   49   91:ineg            
	//   50   92:istore          5
					break label0;
	//   51   94:goto            167
				}
			} else
			{
				if(mRecyclerView.canScrollVertically(1))
	//*  52   97:aload_0         
	//*  53   98:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  54  101:iconst_1        
	//*  55  102:invokevirtual   #761 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  56  105:ifeq            126
					i = getHeight() - getPaddingTop() - getPaddingBottom();
	//   57  108:aload_0         
	//   58  109:invokevirtual   #261 <Method int getHeight()>
	//   59  112:aload_0         
	//   60  113:invokevirtual   #252 <Method int getPaddingTop()>
	//   61  116:isub            
	//   62  117:aload_0         
	//   63  118:invokevirtual   #264 <Method int getPaddingBottom()>
	//   64  121:isub            
	//   65  122:istore_3        
				else
	//*  66  123:goto            128
					i = 0;
	//   67  126:iconst_0        
	//   68  127:istore_3        
				k = i;
	//   69  128:iload_3         
	//   70  129:istore          6
				if(mRecyclerView.canScrollHorizontally(1))
	//*  71  131:aload_0         
	//*  72  132:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  73  135:iconst_1        
	//*  74  136:invokevirtual   #763 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  75  139:ifeq            161
				{
					j = getWidth() - getPaddingLeft() - getPaddingRight();
	//   76  142:aload_0         
	//   77  143:invokevirtual   #255 <Method int getWidth()>
	//   78  146:aload_0         
	//   79  147:invokevirtual   #249 <Method int getPaddingLeft()>
	//   80  150:isub            
	//   81  151:aload_0         
	//   82  152:invokevirtual   #258 <Method int getPaddingRight()>
	//   83  155:isub            
	//   84  156:istore          5
					break label0;
	//   85  158:goto            167
				}
			}
			j = 0;
	//   86  161:iconst_0        
	//   87  162:istore          5
			i = k;
	//   88  164:iload           6
	//   89  166:istore_3        
		}
		if(i == 0 && j == 0)
	//*  90  167:iload_3         
	//*  91  168:ifne            178
	//*  92  171:iload           5
	//*  93  173:ifne            178
		{
			return false;
	//   94  176:iconst_0        
	//   95  177:ireturn         
		} else
		{
			mRecyclerView.scrollBy(j, i);
	//   96  178:aload_0         
	//   97  179:getfield        #95  <Field RecyclerView mRecyclerView>
	//   98  182:iload           5
	//   99  184:iload_3         
	//  100  185:invokevirtual   #876 <Method void RecyclerView.scrollBy(int, int)>
			return true;
	//  101  188:iconst_1        
	//  102  189:ireturn         
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
	//    8   12:getfield        #128 <Field ChildHelper mChildHelper>
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
	//   11   15:invokevirtual   #899 <Method View RecyclerView$Recycler.getScrapViewAt(int)>
	//   12   18:astore          4
			RecyclerView.ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
	//   13   20:aload           4
	//   14   22:invokestatic    #87  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//   15   25:astore          5
			if(viewholder.shouldIgnore())
	//*  16   27:aload           5
	//*  17   29:invokevirtual   #371 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  18   32:ifeq            38
				continue;
	//   19   35:goto            96
			viewholder.setIsRecyclable(false);
	//   20   38:aload           5
	//   21   40:iconst_0        
	//   22   41:invokevirtual   #902 <Method void RecyclerView$ViewHolder.setIsRecyclable(boolean)>
			if(viewholder.isTmpDetached())
	//*  23   44:aload           5
	//*  24   46:invokevirtual   #905 <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*  25   49:ifeq            62
				mRecyclerView.removeDetachedView(view, false);
	//   26   52:aload_0         
	//   27   53:getfield        #95  <Field RecyclerView mRecyclerView>
	//   28   56:aload           4
	//   29   58:iconst_0        
	//   30   59:invokevirtual   #909 <Method void RecyclerView.removeDetachedView(View, boolean)>
			if(mRecyclerView.mItemAnimator != null)
	//*  31   62:aload_0         
	//*  32   63:getfield        #95  <Field RecyclerView mRecyclerView>
	//*  33   66:getfield        #478 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//*  34   69:ifnull          84
				mRecyclerView.mItemAnimator.endAnimation(viewholder);
	//   35   72:aload_0         
	//   36   73:getfield        #95  <Field RecyclerView mRecyclerView>
	//   37   76:getfield        #478 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//   38   79:aload           5
	//   39   81:invokevirtual   #482 <Method void RecyclerView$ItemAnimator.endAnimation(RecyclerView$ViewHolder)>
			viewholder.setIsRecyclable(true);
	//   40   84:aload           5
	//   41   86:iconst_1        
	//   42   87:invokevirtual   #902 <Method void RecyclerView$ViewHolder.setIsRecyclable(boolean)>
			recycler.quickRecycleScrapView(view);
	//   43   90:aload_1         
	//   44   91:aload           4
	//   45   93:invokevirtual   #912 <Method void RecyclerView$Recycler.quickRecycleScrapView(View)>
		}

	//   46   96:iload_2         
	//   47   97:iconst_1        
	//   48   98:isub            
	//   49   99:istore_2        
	//*  50  100:goto            9
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
	//    1    1:getfield        #128 <Field ChildHelper mChildHelper>
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
	//    5    9:getfield        #128 <Field ChildHelper mChildHelper>
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
		view = ((View) (getChildRectangleOnScreenScrollAmount(recyclerview, view, rect, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #935 <Method int[] getChildRectangleOnScreenScrollAmount(RecyclerView, View, Rect, boolean)>
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
		if(flag1 && !isFocusedChildVisibleAfterScrolling(recyclerview, i, j) || i == 0 && j == 0)
	//*  15   20:iload           5
	//*  16   22:ifeq            37
	//*  17   25:aload_0         
	//*  18   26:aload_1         
	//*  19   27:iload           6
	//*  20   29:iload           7
	//*  21   31:invokespecial   #937 <Method boolean isFocusedChildVisibleAfterScrolling(RecyclerView, int, int)>
	//*  22   34:ifeq            50
	//*  23   37:iload           6
	//*  24   39:ifne            52
	//*  25   42:iload           7
	//*  26   44:ifeq            50
	//*  27   47:goto            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		if(flag)
	//*  30   52:iload           4
	//*  31   54:ifeq            67
		{
			recyclerview.scrollBy(i, j);
	//   32   57:aload_1         
	//   33   58:iload           6
	//   34   60:iload           7
	//   35   62:invokevirtual   #876 <Method void RecyclerView.scrollBy(int, int)>
			return true;
	//   36   65:iconst_1        
	//   37   66:ireturn         
		} else
		{
			recyclerview.smoothScrollBy(i, j);
	//   38   67:aload_1         
	//   39   68:iload           6
	//   40   70:iload           7
	//   41   72:invokevirtual   #940 <Method void RecyclerView.smoothScrollBy(int, int)>
			return true;
	//   42   75:iconst_1        
	//   43   76:ireturn         
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
	//    3    5:ldc1            #221 <Int 0x40000000>
	//    4    7:invokestatic    #241 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #952 <Method int RecyclerView.getHeight()>
	//    7   14:ldc1            #221 <Int 0x40000000>
	//    8   16:invokestatic    #241 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
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
		int k2 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #450 <Method int getChildCount()>
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
	//    9   17:invokevirtual   #853 <Method void RecyclerView.defaultOnMeasure(int, int)>
			return;
	//   10   20:return          
		}
		int l = 0;
	//   11   21:iconst_0        
	//   12   22:istore          4
		int i2 = 0x7fffffff;
	//   13   24:ldc2            #979 <Int 0x7fffffff>
	//   14   27:istore          9
		int k1 = 0x80000000;
	//   15   29:ldc1            #220 <Int 0x80000000>
	//   16   31:istore          7
		int k = k1;
	//   17   33:iload           7
	//   18   35:istore_3        
		int j1 = 0x7fffffff;
	//   19   36:ldc2            #979 <Int 0x7fffffff>
	//   20   39:istore          6
		while(l < k2) 
	//*  21   41:iload           4
	//*  22   43:iload           11
	//*  23   45:icmpge          179
		{
			View view = getChildAt(l);
	//   24   48:aload_0         
	//   25   49:iload           4
	//   26   51:invokevirtual   #454 <Method View getChildAt(int)>
	//   27   54:astore          12
			Rect rect = mRecyclerView.mTempRect;
	//   28   56:aload_0         
	//   29   57:getfield        #95  <Field RecyclerView mRecyclerView>
	//   30   60:getfield        #354 <Field Rect RecyclerView.mTempRect>
	//   31   63:astore          13
			getDecoratedBoundsWithMargins(view, rect);
	//   32   65:aload_0         
	//   33   66:aload           12
	//   34   68:aload           13
	//   35   70:invokevirtual   #358 <Method void getDecoratedBoundsWithMargins(View, Rect)>
			int i1 = i2;
	//   36   73:iload           9
	//   37   75:istore          5
			if(rect.left < i2)
	//*  38   77:aload           13
	//*  39   79:getfield        #272 <Field int Rect.left>
	//*  40   82:iload           9
	//*  41   84:icmpge          94
				i1 = rect.left;
	//   42   87:aload           13
	//   43   89:getfield        #272 <Field int Rect.left>
	//   44   92:istore          5
			int l1 = k1;
	//   45   94:iload           7
	//   46   96:istore          8
			if(rect.right > k1)
	//*  47   98:aload           13
	//*  48  100:getfield        #361 <Field int Rect.right>
	//*  49  103:iload           7
	//*  50  105:icmple          115
				l1 = rect.right;
	//   51  108:aload           13
	//   52  110:getfield        #361 <Field int Rect.right>
	//   53  113:istore          8
			k1 = j1;
	//   54  115:iload           6
	//   55  117:istore          7
			if(rect.top < j1)
	//*  56  119:aload           13
	//*  57  121:getfield        #281 <Field int Rect.top>
	//*  58  124:iload           6
	//*  59  126:icmpge          136
				k1 = rect.top;
	//   60  129:aload           13
	//   61  131:getfield        #281 <Field int Rect.top>
	//   62  134:istore          7
			int j2 = k;
	//   63  136:iload_3         
	//   64  137:istore          10
			if(rect.bottom > k)
	//*  65  139:aload           13
	//*  66  141:getfield        #364 <Field int Rect.bottom>
	//*  67  144:iload_3         
	//*  68  145:icmple          155
				j2 = rect.bottom;
	//   69  148:aload           13
	//   70  150:getfield        #364 <Field int Rect.bottom>
	//   71  153:istore          10
			l++;
	//   72  155:iload           4
	//   73  157:iconst_1        
	//   74  158:iadd            
	//   75  159:istore          4
			j1 = k1;
	//   76  161:iload           7
	//   77  163:istore          6
			i2 = i1;
	//   78  165:iload           5
	//   79  167:istore          9
			k1 = l1;
	//   80  169:iload           8
	//   81  171:istore          7
			k = j2;
	//   82  173:iload           10
	//   83  175:istore_3        
		}
	//*  84  176:goto            41
		mRecyclerView.mTempRect.set(i2, j1, k1, k);
	//   85  179:aload_0         
	//   86  180:getfield        #95  <Field RecyclerView mRecyclerView>
	//   87  183:getfield        #354 <Field Rect RecyclerView.mTempRect>
	//   88  186:iload           9
	//   89  188:iload           6
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
	//*   1    1:ifnonnull       27
		{
			mRecyclerView = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #95  <Field RecyclerView mRecyclerView>
			mChildHelper = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #128 <Field ChildHelper mChildHelper>
			mWidth = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #657 <Field int mWidth>
			mHeight = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #574 <Field int mHeight>
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
	//   20   34:getfield        #984 <Field ChildHelper RecyclerView.mChildHelper>
	//   21   37:putfield        #128 <Field ChildHelper mChildHelper>
			mWidth = recyclerview.getWidth();
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:invokevirtual   #951 <Method int RecyclerView.getWidth()>
	//   25   45:putfield        #657 <Field int mWidth>
			mHeight = recyclerview.getHeight();
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #952 <Method int RecyclerView.getHeight()>
	//   29   53:putfield        #574 <Field int mHeight>
		}
		mWidthMode = 0x40000000;
	//   30   56:aload_0         
	//   31   57:ldc1            #221 <Int 0x40000000>
	//   32   59:putfield        #660 <Field int mWidthMode>
		mHeightMode = 0x40000000;
	//   33   62:aload_0         
	//   34   63:ldc1            #221 <Int 0x40000000>
	//   35   65:putfield        #577 <Field int mHeightMode>
	//   36   68:return          
	}

	boolean shouldMeasureChild(View view, int i, int j, RecyclerView.LayoutParams layoutparams)
	{
		return view.isLayoutRequested() || !mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getWidth(), i, layoutparams.width) || !isMeasurementUpToDate(view.getHeight(), j, layoutparams.height);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #987 <Method boolean View.isLayoutRequested()>
	//    2    4:ifne            51
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field boolean mMeasurementCacheEnabled>
	//    5   11:ifeq            51
	//    6   14:aload_1         
	//    7   15:invokevirtual   #615 <Method int View.getWidth()>
	//    8   18:iload_2         
	//    9   19:aload           4
	//   10   21:getfield        #723 <Field int RecyclerView$LayoutParams.width>
	//   11   24:invokestatic    #989 <Method boolean isMeasurementUpToDate(int, int, int)>
	//   12   27:ifeq            51
	//   13   30:aload_1         
	//   14   31:invokevirtual   #616 <Method int View.getHeight()>
	//   15   34:iload_3         
	//   16   35:aload           4
	//   17   37:getfield        #728 <Field int RecyclerView$LayoutParams.height>
	//   18   40:invokestatic    #989 <Method boolean isMeasurementUpToDate(int, int, int)>
	//   19   43:ifne            49
	//   20   46:goto            51
	//   21   49:iconst_0        
	//   22   50:ireturn         
	//   23   51:iconst_1        
	//   24   52:ireturn         
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
	//    2    4:ifeq            44
	//    3    7:aload_1         
	//    4    8:invokevirtual   #561 <Method int View.getMeasuredWidth()>
	//    5   11:iload_2         
	//    6   12:aload           4
	//    7   14:getfield        #723 <Field int RecyclerView$LayoutParams.width>
	//    8   17:invokestatic    #989 <Method boolean isMeasurementUpToDate(int, int, int)>
	//    9   20:ifeq            44
	//   10   23:aload_1         
	//   11   24:invokevirtual   #557 <Method int View.getMeasuredHeight()>
	//   12   27:iload_3         
	//   13   28:aload           4
	//   14   30:getfield        #728 <Field int RecyclerView$LayoutParams.height>
	//   15   33:invokestatic    #989 <Method boolean isMeasurementUpToDate(int, int, int)>
	//   16   36:ifne            42
	//   17   39:goto            44
	//   18   42:iconst_0        
	//   19   43:ireturn         
	//   20   44:iconst_1        
	//   21   45:ireturn         
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
	//*   1    1:getfield        #179 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   2    4:ifnull          32
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #179 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   6   12:if_acmpeq       32
	//*   7   15:aload_0         
	//*   8   16:getfield        #179 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   9   19:invokevirtual   #184 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//*  10   22:ifeq            32
			mSmoothScroller.stop();
	//   11   25:aload_0         
	//   12   26:getfield        #179 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//   13   29:invokevirtual   #999 <Method void RecyclerView$SmoothScroller.stop()>
		mSmoothScroller = ;
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:putfield        #179 <Field RecyclerView$SmoothScroller mSmoothScroller>
		mSmoothScroller.start(mRecyclerView, this);
	//   17   37:aload_0         
	//   18   38:getfield        #179 <Field RecyclerView$SmoothScroller mSmoothScroller>
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
	//    9   15:invokevirtual   #674 <Method void RecyclerView$ViewHolder.addFlags(int)>
	//   10   18:return          
	}

	void stopSmoothScroller()
	{
		if(mSmoothScroller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   2    4:ifnull          14
			mSmoothScroller.stop();
	//    3    7:aload_0         
	//    4    8:getfield        #179 <Field RecyclerView$SmoothScroller mSmoothScroller>
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
