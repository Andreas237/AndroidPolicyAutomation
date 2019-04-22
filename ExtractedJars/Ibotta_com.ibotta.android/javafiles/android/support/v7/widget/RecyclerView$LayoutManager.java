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
	//    1    1:invokestatic    #81  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore          6
		if(!flag && !((RecyclerView.ViewHolder) (obj)).isRemoved())
	//*   3    6:iload_3         
	//*   4    7:ifne            36
	//*   5   10:aload           6
	//*   6   12:invokevirtual   #87  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*   7   15:ifeq            21
	//*   8   18:goto            36
			mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(((RecyclerView.ViewHolder) (obj)));
	//    9   21:aload_0         
	//   10   22:getfield        #89  <Field RecyclerView mRecyclerView>
	//   11   25:getfield        #93  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   12   28:aload           6
	//   13   30:invokevirtual   #99  <Method void ViewInfoStore.removeFromDisappearedInLayout(RecyclerView$ViewHolder)>
		else
	//*  14   33:goto            48
			mRecyclerView.mViewInfoStore.addToDisappearedInLayout(((RecyclerView.ViewHolder) (obj)));
	//   15   36:aload_0         
	//   16   37:getfield        #89  <Field RecyclerView mRecyclerView>
	//   17   40:getfield        #93  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   18   43:aload           6
	//   19   45:invokevirtual   #102 <Method void ViewInfoStore.addToDisappearedInLayout(RecyclerView$ViewHolder)>
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//   20   48:aload_1         
	//   21   49:invokevirtual   #108 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   22   52:checkcast       #110 <Class RecyclerView$LayoutParams>
	//   23   55:astore          7
		if(!((RecyclerView.ViewHolder) (obj)).wasReturnedFromScrap() && !((RecyclerView.ViewHolder) (obj)).isScrap())
	//*  24   57:aload           6
	//*  25   59:invokevirtual   #113 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  26   62:ifne            247
	//*  27   65:aload           6
	//*  28   67:invokevirtual   #116 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*  29   70:ifeq            76
	//*  30   73:goto            247
		{
			if(view.getParent() == mRecyclerView)
	//*  31   76:aload_1         
	//*  32   77:invokevirtual   #120 <Method android.view.ViewParent View.getParent()>
	//*  33   80:aload_0         
	//*  34   81:getfield        #89  <Field RecyclerView mRecyclerView>
	//*  35   84:if_acmpne       201
			{
				int k = mChildHelper.indexOfChild(view);
	//   36   87:aload_0         
	//   37   88:getfield        #122 <Field ChildHelper mChildHelper>
	//   38   91:aload_1         
	//   39   92:invokevirtual   #128 <Method int ChildHelper.indexOfChild(View)>
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
	//   47  106:getfield        #122 <Field ChildHelper mChildHelper>
	//   48  109:invokevirtual   #132 <Method int ChildHelper.getChildCount()>
	//   49  112:istore          4
				if(k != -1)
	//*  50  114:iload           5
	//*  51  116:iconst_m1       
	//*  52  117:icmpeq          144
				{
					if(k != j)
	//*  53  120:iload           5
	//*  54  122:iload           4
	//*  55  124:icmpeq          282
						mRecyclerView.mLayout.moveView(k, j);
	//   56  127:aload_0         
	//   57  128:getfield        #89  <Field RecyclerView mRecyclerView>
	//   58  131:getfield        #136 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   59  134:iload           5
	//   60  136:iload           4
	//   61  138:invokevirtual   #140 <Method void moveView(int, int)>
				} else
	//*  62  141:goto            282
				{
					obj = ((Object) (new StringBuilder()));
	//   63  144:new             #142 <Class StringBuilder>
	//   64  147:dup             
	//   65  148:invokespecial   #143 <Method void StringBuilder()>
	//   66  151:astore          6
					((StringBuilder) (obj)).append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
	//   67  153:aload           6
	//   68  155:ldc1            #145 <String "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:">
	//   69  157:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   70  160:pop             
					((StringBuilder) (obj)).append(mRecyclerView.indexOfChild(view));
	//   71  161:aload           6
	//   72  163:aload_0         
	//   73  164:getfield        #89  <Field RecyclerView mRecyclerView>
	//   74  167:aload_1         
	//   75  168:invokevirtual   #150 <Method int RecyclerView.indexOfChild(View)>
	//   76  171:invokevirtual   #153 <Method StringBuilder StringBuilder.append(int)>
	//   77  174:pop             
					((StringBuilder) (obj)).append(mRecyclerView.exceptionLabel());
	//   78  175:aload           6
	//   79  177:aload_0         
	//   80  178:getfield        #89  <Field RecyclerView mRecyclerView>
	//   81  181:invokevirtual   #157 <Method String RecyclerView.exceptionLabel()>
	//   82  184:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   83  187:pop             
					throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   84  188:new             #159 <Class IllegalStateException>
	//   85  191:dup             
	//   86  192:aload           6
	//   87  194:invokevirtual   #162 <Method String StringBuilder.toString()>
	//   88  197:invokespecial   #165 <Method void IllegalStateException(String)>
	//   89  200:athrow          
				}
			} else
			{
				mChildHelper.addView(view, i, false);
	//   90  201:aload_0         
	//   91  202:getfield        #122 <Field ChildHelper mChildHelper>
	//   92  205:aload_1         
	//   93  206:iload_2         
	//   94  207:iconst_0        
	//   95  208:invokevirtual   #168 <Method void ChildHelper.addView(View, int, boolean)>
				layoutparams.mInsetsDirty = true;
	//   96  211:aload           7
	//   97  213:iconst_1        
	//   98  214:putfield        #171 <Field boolean RecyclerView$LayoutParams.mInsetsDirty>
				  = mSmoothScroller;
	//   99  217:aload_0         
	//  100  218:getfield        #173 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//  101  221:astore          8
				if( != null && .isRunning())
	//* 102  223:aload           8
	//* 103  225:ifnull          282
	//* 104  228:aload           8
	//* 105  230:invokevirtual   #178 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//* 106  233:ifeq            282
					mSmoothScroller.onChildAttachedToWindow(view);
	//  107  236:aload_0         
	//  108  237:getfield        #173 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//  109  240:aload_1         
	//  110  241:invokevirtual   #182 <Method void RecyclerView$SmoothScroller.onChildAttachedToWindow(View)>
			}
		} else
	//* 111  244:goto            282
		{
			if(((RecyclerView.ViewHolder) (obj)).isScrap())
	//* 112  247:aload           6
	//* 113  249:invokevirtual   #116 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//* 114  252:ifeq            263
				((RecyclerView.ViewHolder) (obj)).unScrap();
	//  115  255:aload           6
	//  116  257:invokevirtual   #185 <Method void RecyclerView$ViewHolder.unScrap()>
			else
	//* 117  260:goto            268
				((RecyclerView.ViewHolder) (obj)).clearReturnedFromScrapFlag();
	//  118  263:aload           6
	//  119  265:invokevirtual   #188 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
			mChildHelper.attachViewToParent(view, i, view.getLayoutParams(), false);
	//  120  268:aload_0         
	//  121  269:getfield        #122 <Field ChildHelper mChildHelper>
	//  122  272:aload_1         
	//  123  273:iload_2         
	//  124  274:aload_1         
	//  125  275:invokevirtual   #108 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  126  278:iconst_0        
	//  127  279:invokevirtual   #192 <Method void ChildHelper.attachViewToParent(View, int, android.view.ViewGroup$LayoutParams, boolean)>
		}
		if(layoutparams.mPendingInvalidate)
	//* 128  282:aload           7
	//* 129  284:getfield        #195 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
	//* 130  287:ifeq            304
		{
			((RecyclerView.ViewHolder) (obj)).itemView.invalidate();
	//  131  290:aload           6
	//  132  292:getfield        #199 <Field View RecyclerView$ViewHolder.itemView>
	//  133  295:invokevirtual   #202 <Method void View.invalidate()>
			layoutparams.mPendingInvalidate = false;
	//  134  298:aload           7
	//  135  300:iconst_0        
	//  136  301:putfield        #195 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
		}
	//  137  304:return          
	}

	public static int chooseSize(int i, int j, int k)
	{
		int l = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #210 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		i = android.view.View.MeasureSpec.getSize(i);
	//    3    5:iload_0         
	//    4    6:invokestatic    #213 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_0        
		if(l != 0x80000000)
	//*   6   10:iload_3         
	//*   7   11:ldc1            #214 <Int 0x80000000>
	//*   8   13:icmpeq          30
		{
			if(l != 0x40000000)
	//*   9   16:iload_3         
	//*  10   17:ldc1            #215 <Int 0x40000000>
	//*  11   19:icmpeq          28
				return Math.max(j, k);
	//   12   22:iload_1         
	//   13   23:iload_2         
	//   14   24:invokestatic    #221 <Method int Math.max(int, int)>
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
	//   21   33:invokestatic    #221 <Method int Math.max(int, int)>
	//   22   36:invokestatic    #224 <Method int Math.min(int, int)>
	//   23   39:ireturn         
		}
	}

	private void detachViewInternal(int i, View view)
	{
		mChildHelper.detachViewFromParent(i);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field ChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #231 <Method void ChildHelper.detachViewFromParent(int)>
	//    4    8:return          
	}

	public static int getChildMeasureSpec(int i, int j, int k, int l, boolean flag)
	{
label0:
		{
			boolean flag1;
label1:
			{
				int i1;
label2:
				{
label3:
					{
label4:
						{
							flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
							i1 = Math.max(0, i - k);
	//    2    3:iconst_0        
	//    3    4:iload_0         
	//    4    5:iload_2         
	//    5    6:isub            
	//    6    7:invokestatic    #221 <Method int Math.max(int, int)>
	//    7   10:istore          5
							if(!flag)
								break label2;
	//    8   12:iload           4
	//    9   14:ifeq            86
							if(l >= 0)
	//*  10   17:iload_3         
	//*  11   18:iflt            29
							{
								i = l;
	//   12   21:iload_3         
	//   13   22:istore_0        
								k = 0x40000000;
	//   14   23:ldc1            #215 <Int 0x40000000>
	//   15   25:istore_2        
								break label0;
	//   16   26:goto            149
							}
							if(l != -1)
								break label3;
	//   17   29:iload_3         
	//   18   30:iconst_m1       
	//   19   31:icmpne          72
							if(j != 0x80000000)
	//*  20   34:iload_1         
	//*  21   35:ldc1            #214 <Int 0x80000000>
	//*  22   37:icmpeq          64
								if(j != 0)
	//*  23   40:iload_1         
	//*  24   41:ifeq            57
								{
									if(j != 0x40000000)
	//*  25   44:iload_1         
	//*  26   45:ldc1            #215 <Int 0x40000000>
	//*  27   47:icmpeq          64
									{
										j = 0;
	//   28   50:iconst_0        
	//   29   51:istore_1        
										i = 0;
	//   30   52:iconst_0        
	//   31   53:istore_0        
										break label4;
	//   32   54:goto            67
									}
								} else
								{
									j = 0;
	//   33   57:iconst_0        
	//   34   58:istore_1        
									i = 0;
	//   35   59:iconst_0        
	//   36   60:istore_0        
									break label4;
	//   37   61:goto            67
								}
							i = i1;
	//   38   64:iload           5
	//   39   66:istore_0        
						}
						k = j;
	//   40   67:iload_1         
	//   41   68:istore_2        
						break label0;
	//   42   69:goto            149
					}
					if(l == -2)
	//*  43   72:iload_3         
	//*  44   73:bipush          -2
	//*  45   75:icmpne          144
					{
						i = 0;
	//   46   78:iconst_0        
	//   47   79:istore_0        
						k = ((int) (flag1));
	//   48   80:iload           6
	//   49   82:istore_2        
						break label0;
	//   50   83:goto            149
					}
					break label1;
				}
				if(l >= 0)
	//*  51   86:iload_3         
	//*  52   87:iflt            98
				{
					i = l;
	//   53   90:iload_3         
	//   54   91:istore_0        
					k = 0x40000000;
	//   55   92:ldc1            #215 <Int 0x40000000>
	//   56   94:istore_2        
					break label0;
	//   57   95:goto            149
				}
				if(l == -1)
	//*  58   98:iload_3         
	//*  59   99:iconst_m1       
	//*  60  100:icmpne          111
				{
					i = i1;
	//   61  103:iload           5
	//   62  105:istore_0        
					k = j;
	//   63  106:iload_1         
	//   64  107:istore_2        
					break label0;
	//   65  108:goto            149
				}
				if(l == -2)
	//*  66  111:iload_3         
	//*  67  112:bipush          -2
	//*  68  114:icmpne          144
				{
					if(j != 0x80000000)
	//*  69  117:iload_1         
	//*  70  118:ldc1            #214 <Int 0x80000000>
	//*  71  120:icmpeq          135
					{
						i = i1;
	//   72  123:iload           5
	//   73  125:istore_0        
						k = ((int) (flag1));
	//   74  126:iload           6
	//   75  128:istore_2        
						if(j != 0x40000000)
							break label0;
	//   76  129:iload_1         
	//   77  130:ldc1            #215 <Int 0x40000000>
	//   78  132:icmpne          149
					}
					k = 0x80000000;
	//   79  135:ldc1            #214 <Int 0x80000000>
	//   80  137:istore_2        
					i = i1;
	//   81  138:iload           5
	//   82  140:istore_0        
					break label0;
	//   83  141:goto            149
				}
			}
			i = 0;
	//   84  144:iconst_0        
	//   85  145:istore_0        
			k = ((int) (flag1));
	//   86  146:iload           6
	//   87  148:istore_2        
		}
		return android.view.View.MeasureSpec.makeMeasureSpec(i, k);
	//   88  149:iload_0         
	//   89  150:iload_2         
	//   90  151:invokestatic    #237 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   91  154:ireturn         
	}

	private int[] getChildRectangleOnScreenScrollAmount(RecyclerView recyclerview, View view, Rect rect, boolean flag)
	{
		int i = getPaddingLeft();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #242 <Method int getPaddingLeft()>
	//    2    4:istore          5
		int j = getPaddingTop();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #245 <Method int getPaddingTop()>
	//    5   10:istore          6
		int k = getWidth();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #248 <Method int getWidth()>
	//    8   16:istore          7
		int j2 = getPaddingRight();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #251 <Method int getPaddingRight()>
	//   11   22:istore          14
		int i1 = getHeight();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #254 <Method int getHeight()>
	//   14   28:istore          9
		int j1 = getPaddingBottom();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #257 <Method int getPaddingBottom()>
	//   17   34:istore          10
		int k2 = (view.getLeft() + rect.left) - view.getScrollX();
	//   18   36:aload_2         
	//   19   37:invokevirtual   #260 <Method int View.getLeft()>
	//   20   40:aload_3         
	//   21   41:getfield        #265 <Field int Rect.left>
	//   22   44:iadd            
	//   23   45:aload_2         
	//   24   46:invokevirtual   #268 <Method int View.getScrollX()>
	//   25   49:isub            
	//   26   50:istore          15
		int k1 = (view.getTop() + rect.top) - view.getScrollY();
	//   27   52:aload_2         
	//   28   53:invokevirtual   #271 <Method int View.getTop()>
	//   29   56:aload_3         
	//   30   57:getfield        #274 <Field int Rect.top>
	//   31   60:iadd            
	//   32   61:aload_2         
	//   33   62:invokevirtual   #277 <Method int View.getScrollY()>
	//   34   65:isub            
	//   35   66:istore          11
		int l2 = rect.width();
	//   36   68:aload_3         
	//   37   69:invokevirtual   #280 <Method int Rect.width()>
	//   38   72:istore          16
		int l1 = rect.height();
	//   39   74:aload_3         
	//   40   75:invokevirtual   #283 <Method int Rect.height()>
	//   41   78:istore          12
		int i2 = k2 - i;
	//   42   80:iload           15
	//   43   82:iload           5
	//   44   84:isub            
	//   45   85:istore          13
		i = Math.min(0, i2);
	//   46   87:iconst_0        
	//   47   88:iload           13
	//   48   90:invokestatic    #224 <Method int Math.min(int, int)>
	//   49   93:istore          5
		int l = k1 - j;
	//   50   95:iload           11
	//   51   97:iload           6
	//   52   99:isub            
	//   53  100:istore          8
		j = Math.min(0, l);
	//   54  102:iconst_0        
	//   55  103:iload           8
	//   56  105:invokestatic    #224 <Method int Math.min(int, int)>
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
	//   68  126:invokestatic    #221 <Method int Math.max(int, int)>
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
	//   78  143:invokestatic    #221 <Method int Math.max(int, int)>
	//   79  146:istore          9
		if(getLayoutDirection() == 1)
	//*  80  148:aload_0         
	//*  81  149:invokevirtual   #286 <Method int getLayoutDirection()>
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
	//*  88  165:goto            197
				i = Math.max(i, j2);
	//   89  168:iload           5
	//   90  170:iload           14
	//   91  172:invokestatic    #221 <Method int Math.max(int, int)>
	//   92  175:istore          5
		} else
	//*  93  177:goto            197
		if(i == 0)
	//*  94  180:iload           5
	//*  95  182:ifeq            188
	//*  96  185:goto            197
			i = Math.min(i2, k);
	//   97  188:iload           13
	//   98  190:iload           7
	//   99  192:invokestatic    #224 <Method int Math.min(int, int)>
	//  100  195:istore          5
		if(j == 0)
	//* 101  197:iload           6
	//* 102  199:ifeq            205
	//* 103  202:goto            214
			j = Math.min(l, i1);
	//  104  205:iload           8
	//  105  207:iload           9
	//  106  209:invokestatic    #224 <Method int Math.min(int, int)>
	//  107  212:istore          6
		return (new int[] {
			i, j
		});
	//  108  214:iconst_2        
	//  109  215:newarray        int[]
	//  110  217:dup             
	//  111  218:iconst_0        
	//  112  219:iload           5
	//  113  221:iastore         
	//  114  222:dup             
	//  115  223:iconst_1        
	//  116  224:iload           6
	//  117  226:iastore         
	//  118  227:areturn         
	}

	public static Properties getProperties(Context context, AttributeSet attributeset, int i, int j)
	{
		Properties properties = new Properties();
	//    0    0:new             #16  <Class RecyclerView$LayoutManager$Properties>
	//    1    3:dup             
	//    2    4:invokespecial   #289 <Method void RecyclerView$LayoutManager$Properties()>
	//    3    7:astore          4
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.recyclerview.R.styleable.RecyclerView, i, j)));
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:getstatic       #295 <Field int[] android.support.v7.recyclerview.R$styleable.RecyclerView>
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokevirtual   #301 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   10   19:astore_0        
		properties.orientation = ((TypedArray) (context)).getInt(android.support.v7.recyclerview.R.styleable.RecyclerView_android_orientation, 1);
	//   11   20:aload           4
	//   12   22:aload_0         
	//   13   23:getstatic       #304 <Field int android.support.v7.recyclerview.R$styleable.RecyclerView_android_orientation>
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #309 <Method int TypedArray.getInt(int, int)>
	//   16   30:putfield        #312 <Field int RecyclerView$LayoutManager$Properties.orientation>
		properties.spanCount = ((TypedArray) (context)).getInt(android.support.v7.recyclerview.R.styleable.RecyclerView_spanCount, 1);
	//   17   33:aload           4
	//   18   35:aload_0         
	//   19   36:getstatic       #315 <Field int android.support.v7.recyclerview.R$styleable.RecyclerView_spanCount>
	//   20   39:iconst_1        
	//   21   40:invokevirtual   #309 <Method int TypedArray.getInt(int, int)>
	//   22   43:putfield        #318 <Field int RecyclerView$LayoutManager$Properties.spanCount>
		properties.reverseLayout = ((TypedArray) (context)).getBoolean(android.support.v7.recyclerview.R.styleable.RecyclerView_reverseLayout, false);
	//   23   46:aload           4
	//   24   48:aload_0         
	//   25   49:getstatic       #321 <Field int android.support.v7.recyclerview.R$styleable.RecyclerView_reverseLayout>
	//   26   52:iconst_0        
	//   27   53:invokevirtual   #325 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   28   56:putfield        #328 <Field boolean RecyclerView$LayoutManager$Properties.reverseLayout>
		properties.stackFromEnd = ((TypedArray) (context)).getBoolean(android.support.v7.recyclerview.R.styleable.RecyclerView_stackFromEnd, false);
	//   29   59:aload           4
	//   30   61:aload_0         
	//   31   62:getstatic       #331 <Field int android.support.v7.recyclerview.R$styleable.RecyclerView_stackFromEnd>
	//   32   65:iconst_0        
	//   33   66:invokevirtual   #325 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   34   69:putfield        #334 <Field boolean RecyclerView$LayoutManager$Properties.stackFromEnd>
		((TypedArray) (context)).recycle();
	//   35   72:aload_0         
	//   36   73:invokevirtual   #337 <Method void TypedArray.recycle()>
		return properties;
	//   37   76:aload           4
	//   38   78:areturn         
	}

	private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerview, int i, int j)
	{
		recyclerview = ((RecyclerView) (recyclerview.getFocusedChild()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #343 <Method View RecyclerView.getFocusedChild()>
	//    2    4:astore_1        
		if(recyclerview == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		int k = getPaddingLeft();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #242 <Method int getPaddingLeft()>
	//    9   15:istore          4
		int l = getPaddingTop();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #245 <Method int getPaddingTop()>
	//   12   21:istore          5
		int i1 = getWidth();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #248 <Method int getWidth()>
	//   15   27:istore          6
		int j1 = getPaddingRight();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #251 <Method int getPaddingRight()>
	//   18   33:istore          7
		int k1 = getHeight();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #254 <Method int getHeight()>
	//   21   39:istore          8
		int l1 = getPaddingBottom();
	//   22   41:aload_0         
	//   23   42:invokevirtual   #257 <Method int getPaddingBottom()>
	//   24   45:istore          9
		Rect rect = mRecyclerView.mTempRect;
	//   25   47:aload_0         
	//   26   48:getfield        #89  <Field RecyclerView mRecyclerView>
	//   27   51:getfield        #347 <Field Rect RecyclerView.mTempRect>
	//   28   54:astore          10
		getDecoratedBoundsWithMargins(((View) (recyclerview)), rect);
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:aload           10
	//   32   60:invokevirtual   #351 <Method void getDecoratedBoundsWithMargins(View, Rect)>
		if(rect.left - i < i1 - j1 && rect.right - i > k && rect.top - j < k1 - l1)
	//*  33   63:aload           10
	//*  34   65:getfield        #265 <Field int Rect.left>
	//*  35   68:iload_2         
	//*  36   69:isub            
	//*  37   70:iload           6
	//*  38   72:iload           7
	//*  39   74:isub            
	//*  40   75:icmpge          121
	//*  41   78:aload           10
	//*  42   80:getfield        #354 <Field int Rect.right>
	//*  43   83:iload_2         
	//*  44   84:isub            
	//*  45   85:iload           4
	//*  46   87:icmple          121
	//*  47   90:aload           10
	//*  48   92:getfield        #274 <Field int Rect.top>
	//*  49   95:iload_3         
	//*  50   96:isub            
	//*  51   97:iload           8
	//*  52   99:iload           9
	//*  53  101:isub            
	//*  54  102:icmpge          121
			return rect.bottom - j > l;
	//   55  105:aload           10
	//   56  107:getfield        #357 <Field int Rect.bottom>
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
	//    1    1:invokestatic    #210 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		j = android.view.View.MeasureSpec.getSize(j);
	//    3    5:iload_1         
	//    4    6:invokestatic    #213 <Method int android.view.View$MeasureSpec.getSize(int)>
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
	//*  18   28:ldc1            #214 <Int 0x80000000>
	//*  19   30:icmpeq          58
			if(l != 0)
	//*  20   33:iload_3         
	//*  21   34:ifeq            56
			{
				if(l != 0x40000000)
	//*  22   37:iload_3         
	//*  23   38:ldc1            #215 <Int 0x40000000>
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

	private void scrapOrRecycleView(RecyclerView.Recycler recycler, int i, View view)
	{
		RecyclerView.ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
	//    0    0:aload_3         
	//    1    1:invokestatic    #81  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore          4
		if(viewholder.shouldIgnore())
	//*   3    6:aload           4
	//*   4    8:invokevirtual   #364 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		if(viewholder.isInvalid() && !viewholder.isRemoved() && !mRecyclerView.mAdapter.hasStableIds())
	//*   7   15:aload           4
	//*   8   17:invokevirtual   #367 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*   9   20:ifeq            56
	//*  10   23:aload           4
	//*  11   25:invokevirtual   #87  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  12   28:ifne            56
	//*  13   31:aload_0         
	//*  14   32:getfield        #89  <Field RecyclerView mRecyclerView>
	//*  15   35:getfield        #371 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  16   38:invokevirtual   #376 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  17   41:ifne            56
		{
			removeViewAt(i);
	//   18   44:aload_0         
	//   19   45:iload_2         
	//   20   46:invokevirtual   #379 <Method void removeViewAt(int)>
			recycler.recycleViewHolderInternal(viewholder);
	//   21   49:aload_1         
	//   22   50:aload           4
	//   23   52:invokevirtual   #384 <Method void RecyclerView$Recycler.recycleViewHolderInternal(RecyclerView$ViewHolder)>
			return;
	//   24   55:return          
		} else
		{
			detachViewAt(i);
	//   25   56:aload_0         
	//   26   57:iload_2         
	//   27   58:invokevirtual   #387 <Method void detachViewAt(int)>
			recycler.scrapView(view);
	//   28   61:aload_1         
	//   29   62:aload_3         
	//   30   63:invokevirtual   #390 <Method void RecyclerView$Recycler.scrapView(View)>
			mRecyclerView.mViewInfoStore.onViewDetached(viewholder);
	//   31   66:aload_0         
	//   32   67:getfield        #89  <Field RecyclerView mRecyclerView>
	//   33   70:getfield        #93  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   34   73:aload           4
	//   35   75:invokevirtual   #393 <Method void ViewInfoStore.onViewDetached(RecyclerView$ViewHolder)>
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
	//    3    3:invokevirtual   #397 <Method void addDisappearingView(View, int)>
	//    4    6:return          
	}

	public void addDisappearingView(View view, int i)
	{
		addViewInt(view, i, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #399 <Method void addViewInt(View, int, boolean)>
	//    5    7:return          
	}

	public void addView(View view)
	{
		addView(view, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #401 <Method void addView(View, int)>
	//    4    6:return          
	}

	public void addView(View view, int i)
	{
		addViewInt(view, i, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #399 <Method void addViewInt(View, int, boolean)>
	//    5    7:return          
	}

	public void assertNotInLayoutOrScroll(String s)
	{
		RecyclerView recyclerview = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_2        
		if(recyclerview != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			recyclerview.assertNotInLayoutOrScroll(s);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #404 <Method void RecyclerView.assertNotInLayoutOrScroll(String)>
	//    8   14:return          
	}

	public void attachView(View view, int i)
	{
		attachView(view, i, (RecyclerView.LayoutParams)view.getLayoutParams());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #108 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    5    7:checkcast       #110 <Class RecyclerView$LayoutParams>
	//    6   10:invokevirtual   #408 <Method void attachView(View, int, RecyclerView$LayoutParams)>
	//    7   13:return          
	}

	public void attachView(View view, int i, RecyclerView.LayoutParams layoutparams)
	{
		RecyclerView.ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #81  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore          4
		if(viewholder.isRemoved())
	//*   3    6:aload           4
	//*   4    8:invokevirtual   #87  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*   5   11:ifeq            29
			mRecyclerView.mViewInfoStore.addToDisappearedInLayout(viewholder);
	//    6   14:aload_0         
	//    7   15:getfield        #89  <Field RecyclerView mRecyclerView>
	//    8   18:getfield        #93  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//    9   21:aload           4
	//   10   23:invokevirtual   #102 <Method void ViewInfoStore.addToDisappearedInLayout(RecyclerView$ViewHolder)>
		else
	//*  11   26:goto            41
			mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(viewholder);
	//   12   29:aload_0         
	//   13   30:getfield        #89  <Field RecyclerView mRecyclerView>
	//   14   33:getfield        #93  <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   15   36:aload           4
	//   16   38:invokevirtual   #99  <Method void ViewInfoStore.removeFromDisappearedInLayout(RecyclerView$ViewHolder)>
		mChildHelper.attachViewToParent(view, i, ((android.view.ViewGroup.LayoutParams) (layoutparams)), viewholder.isRemoved());
	//   17   41:aload_0         
	//   18   42:getfield        #122 <Field ChildHelper mChildHelper>
	//   19   45:aload_1         
	//   20   46:iload_2         
	//   21   47:aload_3         
	//   22   48:aload           4
	//   23   50:invokevirtual   #87  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//   24   53:invokevirtual   #192 <Method void ChildHelper.attachViewToParent(View, int, android.view.ViewGroup$LayoutParams, boolean)>
	//   25   56:return          
	}

	public void calculateItemDecorationsForChild(View view, Rect rect)
	{
		RecyclerView recyclerview = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_3        
		if(recyclerview == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       18
		{
			rect.set(0, 0, 0, 0);
	//    5    9:aload_2         
	//    6   10:iconst_0        
	//    7   11:iconst_0        
	//    8   12:iconst_0        
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #413 <Method void Rect.set(int, int, int, int)>
			return;
	//   11   17:return          
		} else
		{
			rect.set(recyclerview.getItemDecorInsetsForChild(view));
	//   12   18:aload_2         
	//   13   19:aload_3         
	//   14   20:aload_1         
	//   15   21:invokevirtual   #417 <Method Rect RecyclerView.getItemDecorInsetsForChild(View)>
	//   16   24:invokevirtual   #420 <Method void Rect.set(Rect)>
			return;
	//   17   27:return          
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
	//*   1    1:invokevirtual   #438 <Method int getChildCount()>
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
	//   12   16:invokevirtual   #442 <Method View getChildAt(int)>
	//   13   19:invokespecial   #444 <Method void scrapOrRecycleView(RecyclerView$Recycler, int, View)>

	//   14   22:iload_2         
	//   15   23:iconst_1        
	//   16   24:isub            
	//   17   25:istore_2        
	//*  18   26:goto            7
	//   19   29:return          
	}

	public void detachViewAt(int i)
	{
		detachViewInternal(i, getChildAt(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokevirtual   #442 <Method View getChildAt(int)>
	//    5    7:invokespecial   #446 <Method void detachViewInternal(int, View)>
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
	//    5    7:invokevirtual   #451 <Method void onAttachedToWindow(RecyclerView)>
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
	//    6    8:invokevirtual   #456 <Method void onDetachedFromWindow(RecyclerView, RecyclerView$Recycler)>
	//    7   11:return          
	}

	public View findContainingItemView(View view)
	{
		RecyclerView recyclerview = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_2        
		if(recyclerview == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		view = recyclerview.findContainingItemView(view);
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #460 <Method View RecyclerView.findContainingItemView(View)>
	//   10   16:astore_1        
		if(view == null)
	//*  11   17:aload_1         
	//*  12   18:ifnonnull       23
			return null;
	//   13   21:aconst_null     
	//   14   22:areturn         
		if(mChildHelper.isHidden(view))
	//*  15   23:aload_0         
	//*  16   24:getfield        #122 <Field ChildHelper mChildHelper>
	//*  17   27:aload_1         
	//*  18   28:invokevirtual   #464 <Method boolean ChildHelper.isHidden(View)>
	//*  19   31:ifeq            36
			return null;
	//   20   34:aconst_null     
	//   21   35:areturn         
		else
			return view;
	//   22   36:aload_1         
	//   23   37:areturn         
	}

	public View findViewByPosition(int i)
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #438 <Method int getChildCount()>
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
	//   10   14:invokevirtual   #442 <Method View getChildAt(int)>
	//   11   17:astore          4
			RecyclerView.ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
	//   12   19:aload           4
	//   13   21:invokestatic    #81  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//   14   24:astore          5
			if(viewholder != null && viewholder.getLayoutPosition() == i && !viewholder.shouldIgnore() && (mRecyclerView.mState.isPreLayout() || !viewholder.isRemoved()))
	//*  15   26:aload           5
	//*  16   28:ifnonnull       34
	//*  17   31:goto            75
	//*  18   34:aload           5
	//*  19   36:invokevirtual   #469 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//*  20   39:iload_1         
	//*  21   40:icmpne          75
	//*  22   43:aload           5
	//*  23   45:invokevirtual   #364 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  24   48:ifne            75
	//*  25   51:aload_0         
	//*  26   52:getfield        #89  <Field RecyclerView mRecyclerView>
	//*  27   55:getfield        #473 <Field RecyclerView$State RecyclerView.mState>
	//*  28   58:invokevirtual   #478 <Method boolean RecyclerView$State.isPreLayout()>
	//*  29   61:ifne            72
	//*  30   64:aload           5
	//*  31   66:invokevirtual   #87  <Method boolean RecyclerView$ViewHolder.isRemoved()>
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
	//    0    0:new             #110 <Class RecyclerView$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #485 <Method void RecyclerView$LayoutParams(Context, AttributeSet)>
	//    5    9:areturn         
	}

	public RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof RecyclerView.LayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #110 <Class RecyclerView$LayoutParams>
	//*   2    4:ifeq            19
			return new RecyclerView.LayoutParams((RecyclerView.LayoutParams)layoutparams);
	//    3    7:new             #110 <Class RecyclerView$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #110 <Class RecyclerView$LayoutParams>
	//    7   15:invokespecial   #489 <Method void RecyclerView$LayoutParams(RecyclerView$LayoutParams)>
	//    8   18:areturn         
		if(layoutparams instanceof android.view.s)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #491 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return new RecyclerView.LayoutParams((android.view.s)layoutparams);
	//   12   26:new             #110 <Class RecyclerView$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #491 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #494 <Method void RecyclerView$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return new RecyclerView.LayoutParams(layoutparams);
	//   18   38:new             #110 <Class RecyclerView$LayoutParams>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #497 <Method void RecyclerView$LayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//    1    1:invokevirtual   #108 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #110 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #502 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:getfield        #357 <Field int Rect.bottom>
	//    5   13:ireturn         
	}

	public View getChildAt(int i)
	{
		ChildHelper childhelper = mChildHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field ChildHelper mChildHelper>
	//    2    4:astore_2        
		if(childhelper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			return childhelper.getChildAt(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #503 <Method View ChildHelper.getChildAt(int)>
	//    8   14:areturn         
		else
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
	}

	public int getChildCount()
	{
		ChildHelper childhelper = mChildHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field ChildHelper mChildHelper>
	//    2    4:astore_1        
		if(childhelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return childhelper.getChildCount();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #132 <Method int ChildHelper.getChildCount()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean getClipToPadding()
	{
		RecyclerView recyclerview = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_1        
		return recyclerview != null && recyclerview.mClipToPadding;
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:getfield        #507 <Field boolean RecyclerView.mClipToPadding>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		recycler = ((RecyclerView.Recycler) (mRecyclerView));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_1        
		int i = 1;
	//    3    5:iconst_1        
	//    4    6:istore_3        
		if(recycler != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          40
		{
			if(((RecyclerView) (recycler)).mAdapter == null)
	//*   7   11:aload_1         
	//*   8   12:getfield        #371 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*   9   15:ifnonnull       20
				return 1;
	//   10   18:iconst_1        
	//   11   19:ireturn         
			if(canScrollHorizontally())
	//*  12   20:aload_0         
	//*  13   21:invokevirtual   #511 <Method boolean canScrollHorizontally()>
	//*  14   24:ifeq            38
				i = mRecyclerView.mAdapter.getItemCount();
	//   15   27:aload_0         
	//   16   28:getfield        #89  <Field RecyclerView mRecyclerView>
	//   17   31:getfield        #371 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   18   34:invokevirtual   #514 <Method int RecyclerView$Adapter.getItemCount()>
	//   19   37:istore_3        
			return i;
	//   20   38:iload_3         
	//   21   39:ireturn         
		} else
		{
			return 1;
	//   22   40:iconst_1        
	//   23   41:ireturn         
		}
	}

	public int getDecoratedBottom(View view)
	{
		return view.getBottom() + getBottomDecorationHeight(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #518 <Method int View.getBottom()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #520 <Method int getBottomDecorationHeight(View)>
	//    5    9:iadd            
	//    6   10:ireturn         
	}

	public void getDecoratedBoundsWithMargins(View view, Rect rect)
	{
		RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #523 <Method void RecyclerView.getDecoratedBoundsWithMarginsInt(View, Rect)>
	//    3    5:return          
	}

	public int getDecoratedLeft(View view)
	{
		return view.getLeft() - getLeftDecorationWidth(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #260 <Method int View.getLeft()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #527 <Method int getLeftDecorationWidth(View)>
	//    5    9:isub            
	//    6   10:ireturn         
	}

	public int getDecoratedMeasuredHeight(View view)
	{
		Rect rect = ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #108 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #110 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #502 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:astore_2        
		return view.getMeasuredHeight() + rect.top + rect.bottom;
	//    5   11:aload_1         
	//    6   12:invokevirtual   #531 <Method int View.getMeasuredHeight()>
	//    7   15:aload_2         
	//    8   16:getfield        #274 <Field int Rect.top>
	//    9   19:iadd            
	//   10   20:aload_2         
	//   11   21:getfield        #357 <Field int Rect.bottom>
	//   12   24:iadd            
	//   13   25:ireturn         
	}

	public int getDecoratedMeasuredWidth(View view)
	{
		Rect rect = ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #108 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #110 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #502 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:astore_2        
		return view.getMeasuredWidth() + rect.left + rect.right;
	//    5   11:aload_1         
	//    6   12:invokevirtual   #535 <Method int View.getMeasuredWidth()>
	//    7   15:aload_2         
	//    8   16:getfield        #265 <Field int Rect.left>
	//    9   19:iadd            
	//   10   20:aload_2         
	//   11   21:getfield        #354 <Field int Rect.right>
	//   12   24:iadd            
	//   13   25:ireturn         
	}

	public int getDecoratedRight(View view)
	{
		return view.getRight() + getRightDecorationWidth(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #539 <Method int View.getRight()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #542 <Method int getRightDecorationWidth(View)>
	//    5    9:iadd            
	//    6   10:ireturn         
	}

	public int getDecoratedTop(View view)
	{
		return view.getTop() - getTopDecorationHeight(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #271 <Method int View.getTop()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #546 <Method int getTopDecorationHeight(View)>
	//    5    9:isub            
	//    6   10:ireturn         
	}

	public View getFocusedChild()
	{
		Object obj = ((Object) (mRecyclerView));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		obj = ((Object) (((RecyclerView) (obj)).getFocusedChild()));
	//    7   11:aload_1         
	//    8   12:invokevirtual   #343 <Method View RecyclerView.getFocusedChild()>
	//    9   15:astore_1        
		if(obj != null)
	//*  10   16:aload_1         
	//*  11   17:ifnull          35
		{
			if(mChildHelper.isHidden(((View) (obj))))
	//*  12   20:aload_0         
	//*  13   21:getfield        #122 <Field ChildHelper mChildHelper>
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #464 <Method boolean ChildHelper.isHidden(View)>
	//*  16   28:ifeq            33
				return null;
	//   17   31:aconst_null     
	//   18   32:areturn         
			else
				return ((View) (obj));
	//   19   33:aload_1         
	//   20   34:areturn         
		} else
		{
			return null;
	//   21   35:aconst_null     
	//   22   36:areturn         
		}
	}

	public int getHeight()
	{
		return mHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #549 <Field int mHeight>
	//    2    4:ireturn         
	}

	public int getHeightMode()
	{
		return mHeightMode;
	//    0    0:aload_0         
	//    1    1:getfield        #552 <Field int mHeightMode>
	//    2    4:ireturn         
	}

	public int getItemCount()
	{
		Object obj = ((Object) (mRecyclerView));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			obj = ((Object) (((RecyclerView) (obj)).getAdapter()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #556 <Method RecyclerView$Adapter RecyclerView.getAdapter()>
	//    7   13:astore_1        
		else
	//*   8   14:goto            19
			obj = null;
	//    9   17:aconst_null     
	//   10   18:astore_1        
		if(obj != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          28
			return ((RecyclerView.Adapter) (obj)).getItemCount();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #514 <Method int RecyclerView$Adapter.getItemCount()>
	//   15   27:ireturn         
		else
			return 0;
	//   16   28:iconst_0        
	//   17   29:ireturn         
	}

	public int getLayoutDirection()
	{
		return ViewCompat.getLayoutDirection(((View) (mRecyclerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:invokestatic    #560 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    7:ireturn         
	}

	public int getLeftDecorationWidth(View view)
	{
		return ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets.left;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #108 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #110 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #502 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:getfield        #265 <Field int Rect.left>
	//    5   13:ireturn         
	}

	public int getMinimumHeight()
	{
		return ViewCompat.getMinimumHeight(((View) (mRecyclerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:invokestatic    #563 <Method int ViewCompat.getMinimumHeight(View)>
	//    3    7:ireturn         
	}

	public int getMinimumWidth()
	{
		return ViewCompat.getMinimumWidth(((View) (mRecyclerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:invokestatic    #566 <Method int ViewCompat.getMinimumWidth(View)>
	//    3    7:ireturn         
	}

	public int getPaddingBottom()
	{
		RecyclerView recyclerview = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_1        
		if(recyclerview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return recyclerview.getPaddingBottom();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #567 <Method int RecyclerView.getPaddingBottom()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int getPaddingLeft()
	{
		RecyclerView recyclerview = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_1        
		if(recyclerview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return recyclerview.getPaddingLeft();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #568 <Method int RecyclerView.getPaddingLeft()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int getPaddingRight()
	{
		RecyclerView recyclerview = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_1        
		if(recyclerview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return recyclerview.getPaddingRight();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #569 <Method int RecyclerView.getPaddingRight()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int getPaddingTop()
	{
		RecyclerView recyclerview = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_1        
		if(recyclerview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return recyclerview.getPaddingTop();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #570 <Method int RecyclerView.getPaddingTop()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int getPosition(View view)
	{
		return ((RecyclerView.LayoutParams)view.getLayoutParams()).getViewLayoutPosition();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #108 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #110 <Class RecyclerView$LayoutParams>
	//    3    7:invokevirtual   #574 <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
	//    4   10:ireturn         
	}

	public int getRightDecorationWidth(View view)
	{
		return ((RecyclerView.LayoutParams)view.getLayoutParams()).mDecorInsets.right;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #108 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #110 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #502 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:getfield        #354 <Field int Rect.right>
	//    5   13:ireturn         
	}

	public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		recycler = ((RecyclerView.Recycler) (mRecyclerView));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_1        
		int i = 1;
	//    3    5:iconst_1        
	//    4    6:istore_3        
		if(recycler != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          40
		{
			if(((RecyclerView) (recycler)).mAdapter == null)
	//*   7   11:aload_1         
	//*   8   12:getfield        #371 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*   9   15:ifnonnull       20
				return 1;
	//   10   18:iconst_1        
	//   11   19:ireturn         
			if(canScrollVertically())
	//*  12   20:aload_0         
	//*  13   21:invokevirtual   #577 <Method boolean canScrollVertically()>
	//*  14   24:ifeq            38
				i = mRecyclerView.mAdapter.getItemCount();
	//   15   27:aload_0         
	//   16   28:getfield        #89  <Field RecyclerView mRecyclerView>
	//   17   31:getfield        #371 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   18   34:invokevirtual   #514 <Method int RecyclerView$Adapter.getItemCount()>
	//   19   37:istore_3        
			return i;
	//   20   38:iload_3         
	//   21   39:ireturn         
		} else
		{
			return 1;
	//   22   40:iconst_1        
	//   23   41:ireturn         
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
	//    1    1:invokevirtual   #108 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #110 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #502 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    4   10:getfield        #274 <Field int Rect.top>
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
	//    3    5:invokevirtual   #108 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    4    8:checkcast       #110 <Class RecyclerView$LayoutParams>
	//    5   11:getfield        #502 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    6   14:astore          4
			rect.set(-rect1.left, -rect1.top, view.getWidth() + rect1.right, view.getHeight() + rect1.bottom);
	//    7   16:aload_3         
	//    8   17:aload           4
	//    9   19:getfield        #265 <Field int Rect.left>
	//   10   22:ineg            
	//   11   23:aload           4
	//   12   25:getfield        #274 <Field int Rect.top>
	//   13   28:ineg            
	//   14   29:aload_1         
	//   15   30:invokevirtual   #581 <Method int View.getWidth()>
	//   16   33:aload           4
	//   17   35:getfield        #354 <Field int Rect.right>
	//   18   38:iadd            
	//   19   39:aload_1         
	//   20   40:invokevirtual   #582 <Method int View.getHeight()>
	//   21   43:aload           4
	//   22   45:getfield        #357 <Field int Rect.bottom>
	//   23   48:iadd            
	//   24   49:invokevirtual   #413 <Method void Rect.set(int, int, int, int)>
		} else
	//*  25   52:goto            69
		{
			rect.set(0, 0, view.getWidth(), view.getHeight());
	//   26   55:aload_3         
	//   27   56:iconst_0        
	//   28   57:iconst_0        
	//   29   58:aload_1         
	//   30   59:invokevirtual   #581 <Method int View.getWidth()>
	//   31   62:aload_1         
	//   32   63:invokevirtual   #582 <Method int View.getHeight()>
	//   33   66:invokevirtual   #413 <Method void Rect.set(int, int, int, int)>
		}
		if(mRecyclerView != null)
	//*  34   69:aload_0         
	//*  35   70:getfield        #89  <Field RecyclerView mRecyclerView>
	//*  36   73:ifnull          162
		{
			Matrix matrix = view.getMatrix();
	//   37   76:aload_1         
	//   38   77:invokevirtual   #586 <Method Matrix View.getMatrix()>
	//   39   80:astore          4
			if(matrix != null && !matrix.isIdentity())
	//*  40   82:aload           4
	//*  41   84:ifnull          162
	//*  42   87:aload           4
	//*  43   89:invokevirtual   #591 <Method boolean Matrix.isIdentity()>
	//*  44   92:ifne            162
			{
				RectF rectf = mRecyclerView.mTempRectF;
	//   45   95:aload_0         
	//   46   96:getfield        #89  <Field RecyclerView mRecyclerView>
	//   47   99:getfield        #595 <Field RectF RecyclerView.mTempRectF>
	//   48  102:astore          5
				rectf.set(rect);
	//   49  104:aload           5
	//   50  106:aload_3         
	//   51  107:invokevirtual   #598 <Method void RectF.set(Rect)>
				matrix.mapRect(rectf);
	//   52  110:aload           4
	//   53  112:aload           5
	//   54  114:invokevirtual   #602 <Method boolean Matrix.mapRect(RectF)>
	//   55  117:pop             
				rect.set((int)Math.floor(rectf.left), (int)Math.floor(rectf.top), (int)Math.ceil(rectf.right), (int)Math.ceil(rectf.bottom));
	//   56  118:aload_3         
	//   57  119:aload           5
	//   58  121:getfield        #605 <Field float RectF.left>
	//   59  124:f2d             
	//   60  125:invokestatic    #609 <Method double Math.floor(double)>
	//   61  128:d2i             
	//   62  129:aload           5
	//   63  131:getfield        #611 <Field float RectF.top>
	//   64  134:f2d             
	//   65  135:invokestatic    #609 <Method double Math.floor(double)>
	//   66  138:d2i             
	//   67  139:aload           5
	//   68  141:getfield        #613 <Field float RectF.right>
	//   69  144:f2d             
	//   70  145:invokestatic    #616 <Method double Math.ceil(double)>
	//   71  148:d2i             
	//   72  149:aload           5
	//   73  151:getfield        #618 <Field float RectF.bottom>
	//   74  154:f2d             
	//   75  155:invokestatic    #616 <Method double Math.ceil(double)>
	//   76  158:d2i             
	//   77  159:invokevirtual   #413 <Method void Rect.set(int, int, int, int)>
			}
		}
		rect.offset(view.getLeft(), view.getTop());
	//   78  162:aload_3         
	//   79  163:aload_1         
	//   80  164:invokevirtual   #260 <Method int View.getLeft()>
	//   81  167:aload_1         
	//   82  168:invokevirtual   #271 <Method int View.getTop()>
	//   83  171:invokevirtual   #621 <Method void Rect.offset(int, int)>
	//   84  174:return          
	}

	public int getWidth()
	{
		return mWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #623 <Field int mWidth>
	//    2    4:ireturn         
	}

	public int getWidthMode()
	{
		return mWidthMode;
	//    0    0:aload_0         
	//    1    1:getfield        #626 <Field int mWidthMode>
	//    2    4:ireturn         
	}

	boolean hasFlexibleChildInBothOrientations()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #438 <Method int getChildCount()>
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
	//   10   14:invokevirtual   #442 <Method View getChildAt(int)>
	//   11   17:invokevirtual   #108 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   20:astore_3        
			if(layoutparams.width < 0 && layoutparams.height < 0)
	//*  13   21:aload_3         
	//*  14   22:getfield        #631 <Field int android.view.ViewGroup$LayoutParams.width>
	//*  15   25:ifge            37
	//*  16   28:aload_3         
	//*  17   29:getfield        #633 <Field int android.view.ViewGroup$LayoutParams.height>
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

	public boolean isSmoothScrolling()
	{
		  = mSmoothScroller;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//    2    4:astore_1        
		return  != null && .isRunning();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #178 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean isViewPartiallyVisible(View view, boolean flag, boolean flag1)
	{
		if(mHorizontalBoundCheck.isViewWithinBoundFlags(view, 24579) && mVerticalBoundCheck.isViewWithinBoundFlags(view, 24579))
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field ViewBoundsCheck mHorizontalBoundCheck>
	//*   2    4:aload_1         
	//*   3    5:sipush          24579
	//*   4    8:invokevirtual   #645 <Method boolean ViewBoundsCheck.isViewWithinBoundFlags(View, int)>
	//*   5   11:ifeq            33
	//*   6   14:aload_0         
	//*   7   15:getfield        #64  <Field ViewBoundsCheck mVerticalBoundCheck>
	//*   8   18:aload_1         
	//*   9   19:sipush          24579
	//*  10   22:invokevirtual   #645 <Method boolean ViewBoundsCheck.isViewWithinBoundFlags(View, int)>
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

	public void layoutDecoratedWithMargins(View view, int i, int j, int k, int l)
	{
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #108 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #110 <Class RecyclerView$LayoutParams>
	//    3    7:astore          6
		Rect rect = layoutparams.mDecorInsets;
	//    4    9:aload           6
	//    5   11:getfield        #502 <Field Rect RecyclerView$LayoutParams.mDecorInsets>
	//    6   14:astore          7
		view.layout(i + rect.left + layoutparams.leftMargin, j + rect.top + layoutparams.topMargin, k - rect.right - layoutparams.rightMargin, l - rect.bottom - layoutparams.bottomMargin);
	//    7   16:aload_1         
	//    8   17:iload_2         
	//    9   18:aload           7
	//   10   20:getfield        #265 <Field int Rect.left>
	//   11   23:iadd            
	//   12   24:aload           6
	//   13   26:getfield        #650 <Field int RecyclerView$LayoutParams.leftMargin>
	//   14   29:iadd            
	//   15   30:iload_3         
	//   16   31:aload           7
	//   17   33:getfield        #274 <Field int Rect.top>
	//   18   36:iadd            
	//   19   37:aload           6
	//   20   39:getfield        #653 <Field int RecyclerView$LayoutParams.topMargin>
	//   21   42:iadd            
	//   22   43:iload           4
	//   23   45:aload           7
	//   24   47:getfield        #354 <Field int Rect.right>
	//   25   50:isub            
	//   26   51:aload           6
	//   27   53:getfield        #656 <Field int RecyclerView$LayoutParams.rightMargin>
	//   28   56:isub            
	//   29   57:iload           5
	//   30   59:aload           7
	//   31   61:getfield        #357 <Field int Rect.bottom>
	//   32   64:isub            
	//   33   65:aload           6
	//   34   67:getfield        #659 <Field int RecyclerView$LayoutParams.bottomMargin>
	//   35   70:isub            
	//   36   71:invokevirtual   #662 <Method void View.layout(int, int, int, int)>
	//   37   74:return          
	}

	public void measureChildWithMargins(View view, int i, int j)
	{
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #108 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #110 <Class RecyclerView$LayoutParams>
	//    3    7:astore          8
		Rect rect = mRecyclerView.getItemDecorInsetsForChild(view);
	//    4    9:aload_0         
	//    5   10:getfield        #89  <Field RecyclerView mRecyclerView>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #417 <Method Rect RecyclerView.getItemDecorInsetsForChild(View)>
	//    8   17:astore          9
		int i1 = rect.left;
	//    9   19:aload           9
	//   10   21:getfield        #265 <Field int Rect.left>
	//   11   24:istore          6
		int j1 = rect.right;
	//   12   26:aload           9
	//   13   28:getfield        #354 <Field int Rect.right>
	//   14   31:istore          7
		int k = rect.top;
	//   15   33:aload           9
	//   16   35:getfield        #274 <Field int Rect.top>
	//   17   38:istore          4
		int l = rect.bottom;
	//   18   40:aload           9
	//   19   42:getfield        #357 <Field int Rect.bottom>
	//   20   45:istore          5
		i = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + layoutparams.leftMargin + layoutparams.rightMargin + (i + (i1 + j1)), layoutparams.width, canScrollHorizontally());
	//   21   47:aload_0         
	//   22   48:invokevirtual   #248 <Method int getWidth()>
	//   23   51:aload_0         
	//   24   52:invokevirtual   #666 <Method int getWidthMode()>
	//   25   55:aload_0         
	//   26   56:invokevirtual   #242 <Method int getPaddingLeft()>
	//   27   59:aload_0         
	//   28   60:invokevirtual   #251 <Method int getPaddingRight()>
	//   29   63:iadd            
	//   30   64:aload           8
	//   31   66:getfield        #650 <Field int RecyclerView$LayoutParams.leftMargin>
	//   32   69:iadd            
	//   33   70:aload           8
	//   34   72:getfield        #656 <Field int RecyclerView$LayoutParams.rightMargin>
	//   35   75:iadd            
	//   36   76:iload_2         
	//   37   77:iload           6
	//   38   79:iload           7
	//   39   81:iadd            
	//   40   82:iadd            
	//   41   83:iadd            
	//   42   84:aload           8
	//   43   86:getfield        #667 <Field int RecyclerView$LayoutParams.width>
	//   44   89:aload_0         
	//   45   90:invokevirtual   #511 <Method boolean canScrollHorizontally()>
	//   46   93:invokestatic    #669 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   47   96:istore_2        
		j = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + layoutparams.topMargin + layoutparams.bottomMargin + (j + (k + l)), layoutparams.height, canScrollVertically());
	//   48   97:aload_0         
	//   49   98:invokevirtual   #254 <Method int getHeight()>
	//   50  101:aload_0         
	//   51  102:invokevirtual   #671 <Method int getHeightMode()>
	//   52  105:aload_0         
	//   53  106:invokevirtual   #245 <Method int getPaddingTop()>
	//   54  109:aload_0         
	//   55  110:invokevirtual   #257 <Method int getPaddingBottom()>
	//   56  113:iadd            
	//   57  114:aload           8
	//   58  116:getfield        #653 <Field int RecyclerView$LayoutParams.topMargin>
	//   59  119:iadd            
	//   60  120:aload           8
	//   61  122:getfield        #659 <Field int RecyclerView$LayoutParams.bottomMargin>
	//   62  125:iadd            
	//   63  126:iload_3         
	//   64  127:iload           4
	//   65  129:iload           5
	//   66  131:iadd            
	//   67  132:iadd            
	//   68  133:iadd            
	//   69  134:aload           8
	//   70  136:getfield        #672 <Field int RecyclerView$LayoutParams.height>
	//   71  139:aload_0         
	//   72  140:invokevirtual   #577 <Method boolean canScrollVertically()>
	//   73  143:invokestatic    #669 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   74  146:istore_3        
		if(shouldMeasureChild(view, i, j, layoutparams))
	//*  75  147:aload_0         
	//*  76  148:aload_1         
	//*  77  149:iload_2         
	//*  78  150:iload_3         
	//*  79  151:aload           8
	//*  80  153:invokevirtual   #676 <Method boolean shouldMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//*  81  156:ifeq            165
			view.measure(i, j);
	//   82  159:aload_1         
	//   83  160:iload_2         
	//   84  161:iload_3         
	//   85  162:invokevirtual   #679 <Method void View.measure(int, int)>
	//   86  165:return          
	}

	public void moveView(int i, int j)
	{
		View view = getChildAt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #442 <Method View getChildAt(int)>
	//    3    5:astore_3        
		if(view != null)
	//*   4    6:aload_3         
	//*   5    7:ifnull          22
		{
			detachViewAt(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #387 <Method void detachViewAt(int)>
			attachView(view, j);
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #681 <Method void attachView(View, int)>
			return;
	//   13   21:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   14   22:new             #142 <Class StringBuilder>
	//   15   25:dup             
	//   16   26:invokespecial   #143 <Method void StringBuilder()>
	//   17   29:astore_3        
			stringbuilder.append("Cannot move a child from non-existing index:");
	//   18   30:aload_3         
	//   19   31:ldc2            #683 <String "Cannot move a child from non-existing index:">
	//   20   34:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   21   37:pop             
			stringbuilder.append(i);
	//   22   38:aload_3         
	//   23   39:iload_1         
	//   24   40:invokevirtual   #153 <Method StringBuilder StringBuilder.append(int)>
	//   25   43:pop             
			stringbuilder.append(mRecyclerView.toString());
	//   26   44:aload_3         
	//   27   45:aload_0         
	//   28   46:getfield        #89  <Field RecyclerView mRecyclerView>
	//   29   49:invokevirtual   #684 <Method String RecyclerView.toString()>
	//   30   52:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   31   55:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   32   56:new             #686 <Class IllegalArgumentException>
	//   33   59:dup             
	//   34   60:aload_3         
	//   35   61:invokevirtual   #162 <Method String StringBuilder.toString()>
	//   36   64:invokespecial   #687 <Method void IllegalArgumentException(String)>
	//   37   67:athrow          
		}
	}

	public void offsetChildrenHorizontal(int i)
	{
		RecyclerView recyclerview = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_2        
		if(recyclerview != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			recyclerview.offsetChildrenHorizontal(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #690 <Method void RecyclerView.offsetChildrenHorizontal(int)>
	//    8   14:return          
	}

	public void offsetChildrenVertical(int i)
	{
		RecyclerView recyclerview = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_2        
		if(recyclerview != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			recyclerview.offsetChildrenVertical(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #693 <Method void RecyclerView.offsetChildrenVertical(int)>
	//    8   14:return          
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
	//    2    2:invokevirtual   #704 <Method void onDetachedFromWindow(RecyclerView)>
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
		recycler = ((RecyclerView.Recycler) (mRecyclerView));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_1        
		if(recycler != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          111
		{
			if(accessibilityevent == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       14
				return;
	//    7   13:return          
			boolean flag1 = true;
	//    8   14:iconst_1        
	//    9   15:istore          5
			boolean flag = flag1;
	//   10   17:iload           5
	//   11   19:istore          4
			if(!((RecyclerView) (recycler)).canScrollVertically(1))
	//*  12   21:aload_1         
	//*  13   22:iconst_1        
	//*  14   23:invokevirtual   #711 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  15   26:ifne            80
			{
				flag = flag1;
	//   16   29:iload           5
	//   17   31:istore          4
				if(!mRecyclerView.canScrollVertically(-1))
	//*  18   33:aload_0         
	//*  19   34:getfield        #89  <Field RecyclerView mRecyclerView>
	//*  20   37:iconst_m1       
	//*  21   38:invokevirtual   #711 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  22   41:ifne            80
				{
					flag = flag1;
	//   23   44:iload           5
	//   24   46:istore          4
					if(!mRecyclerView.canScrollHorizontally(-1))
	//*  25   48:aload_0         
	//*  26   49:getfield        #89  <Field RecyclerView mRecyclerView>
	//*  27   52:iconst_m1       
	//*  28   53:invokevirtual   #713 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  29   56:ifne            80
						if(mRecyclerView.canScrollHorizontally(1))
	//*  30   59:aload_0         
	//*  31   60:getfield        #89  <Field RecyclerView mRecyclerView>
	//*  32   63:iconst_1        
	//*  33   64:invokevirtual   #713 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  34   67:ifeq            77
							flag = flag1;
	//   35   70:iload           5
	//   36   72:istore          4
						else
	//*  37   74:goto            80
							flag = false;
	//   38   77:iconst_0        
	//   39   78:istore          4
				}
			}
			accessibilityevent.setScrollable(flag);
	//   40   80:aload_3         
	//   41   81:iload           4
	//   42   83:invokevirtual   #719 <Method void AccessibilityEvent.setScrollable(boolean)>
			if(mRecyclerView.mAdapter != null)
	//*  43   86:aload_0         
	//*  44   87:getfield        #89  <Field RecyclerView mRecyclerView>
	//*  45   90:getfield        #371 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  46   93:ifnull          110
				accessibilityevent.setItemCount(mRecyclerView.mAdapter.getItemCount());
	//   47   96:aload_3         
	//   48   97:aload_0         
	//   49   98:getfield        #89  <Field RecyclerView mRecyclerView>
	//   50  101:getfield        #371 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   51  104:invokevirtual   #514 <Method int RecyclerView$Adapter.getItemCount()>
	//   52  107:invokevirtual   #722 <Method void AccessibilityEvent.setItemCount(int)>
			return;
	//   53  110:return          
		} else
		{
			return;
	//   54  111:return          
		}
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		onInitializeAccessibilityEvent(mRecyclerView.mRecycler, mRecyclerView.mState, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #89  <Field RecyclerView mRecyclerView>
	//    3    5:getfield        #727 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    4    8:aload_0         
	//    5    9:getfield        #89  <Field RecyclerView mRecyclerView>
	//    6   12:getfield        #473 <Field RecyclerView$State RecyclerView.mState>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #729 <Method void onInitializeAccessibilityEvent(RecyclerView$Recycler, RecyclerView$State, AccessibilityEvent)>
	//    9   19:return          
	}

	void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		onInitializeAccessibilityNodeInfo(mRecyclerView.mRecycler, mRecyclerView.mState, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #89  <Field RecyclerView mRecyclerView>
	//    3    5:getfield        #727 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    4    8:aload_0         
	//    5    9:getfield        #89  <Field RecyclerView mRecyclerView>
	//    6   12:getfield        #473 <Field RecyclerView$State RecyclerView.mState>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #734 <Method void onInitializeAccessibilityNodeInfo(RecyclerView$Recycler, RecyclerView$State, AccessibilityNodeInfoCompat)>
	//    9   19:return          
	}

	public void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		if(mRecyclerView.canScrollVertically(-1) || mRecyclerView.canScrollHorizontally(-1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//*   2    4:iconst_m1       
	//*   3    5:invokevirtual   #711 <Method boolean RecyclerView.canScrollVertically(int)>
	//*   4    8:ifne            22
	//*   5   11:aload_0         
	//*   6   12:getfield        #89  <Field RecyclerView mRecyclerView>
	//*   7   15:iconst_m1       
	//*   8   16:invokevirtual   #713 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*   9   19:ifeq            34
		{
			accessibilitynodeinfocompat.addAction(8192);
	//   10   22:aload_3         
	//   11   23:sipush          8192
	//   12   26:invokevirtual   #739 <Method void AccessibilityNodeInfoCompat.addAction(int)>
			accessibilitynodeinfocompat.setScrollable(true);
	//   13   29:aload_3         
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #740 <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
		}
		if(mRecyclerView.canScrollVertically(1) || mRecyclerView.canScrollHorizontally(1))
	//*  16   34:aload_0         
	//*  17   35:getfield        #89  <Field RecyclerView mRecyclerView>
	//*  18   38:iconst_1        
	//*  19   39:invokevirtual   #711 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  20   42:ifne            56
	//*  21   45:aload_0         
	//*  22   46:getfield        #89  <Field RecyclerView mRecyclerView>
	//*  23   49:iconst_1        
	//*  24   50:invokevirtual   #713 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  25   53:ifeq            68
		{
			accessibilitynodeinfocompat.addAction(4096);
	//   26   56:aload_3         
	//   27   57:sipush          4096
	//   28   60:invokevirtual   #739 <Method void AccessibilityNodeInfoCompat.addAction(int)>
			accessibilitynodeinfocompat.setScrollable(true);
	//   29   63:aload_3         
	//   30   64:iconst_1        
	//   31   65:invokevirtual   #740 <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
		}
		accessibilitynodeinfocompat.setCollectionInfo(((Object) (android.support.v4.view.accessibility..CollectionInfoCompat.obtain(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), isLayoutHierarchical(recycler, state), getSelectionModeForAccessibility(recycler, state)))));
	//   32   68:aload_3         
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:aload_2         
	//   36   72:invokevirtual   #742 <Method int getRowCountForAccessibility(RecyclerView$Recycler, RecyclerView$State)>
	//   37   75:aload_0         
	//   38   76:aload_1         
	//   39   77:aload_2         
	//   40   78:invokevirtual   #744 <Method int getColumnCountForAccessibility(RecyclerView$Recycler, RecyclerView$State)>
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:aload_2         
	//   44   84:invokevirtual   #746 <Method boolean isLayoutHierarchical(RecyclerView$Recycler, RecyclerView$State)>
	//   45   87:aload_0         
	//   46   88:aload_1         
	//   47   89:aload_2         
	//   48   90:invokevirtual   #748 <Method int getSelectionModeForAccessibility(RecyclerView$Recycler, RecyclerView$State)>
	//   49   93:invokestatic    #754 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat.obtain(int, int, boolean, int)>
	//   50   96:invokevirtual   #758 <Method void AccessibilityNodeInfoCompat.setCollectionInfo(Object)>
	//   51   99:return          
	}

	public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		int i;
		if(canScrollVertically())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #577 <Method boolean canScrollVertically()>
	//*   2    4:ifeq            17
			i = getPosition(view);
	//    3    7:aload_0         
	//    4    8:aload_3         
	//    5    9:invokevirtual   #762 <Method int getPosition(View)>
	//    6   12:istore          5
		else
	//*   7   14:goto            20
			i = 0;
	//    8   17:iconst_0        
	//    9   18:istore          5
		int j;
		if(canScrollHorizontally())
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #511 <Method boolean canScrollHorizontally()>
	//*  12   24:ifeq            37
			j = getPosition(view);
	//   13   27:aload_0         
	//   14   28:aload_3         
	//   15   29:invokevirtual   #762 <Method int getPosition(View)>
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
	//   27   50:invokestatic    #767 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//   28   53:invokevirtual   #770 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
	//   29   56:return          
	}

	void onInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		RecyclerView.ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #81  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore_3        
		if(viewholder != null && !viewholder.isRemoved() && !mChildHelper.isHidden(viewholder.itemView))
	//*   3    5:aload_3         
	//*   4    6:ifnull          50
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #87  <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*   7   13:ifne            50
	//*   8   16:aload_0         
	//*   9   17:getfield        #122 <Field ChildHelper mChildHelper>
	//*  10   20:aload_3         
	//*  11   21:getfield        #199 <Field View RecyclerView$ViewHolder.itemView>
	//*  12   24:invokevirtual   #464 <Method boolean ChildHelper.isHidden(View)>
	//*  13   27:ifne            50
			onInitializeAccessibilityNodeInfoForItem(mRecyclerView.mRecycler, mRecyclerView.mState, view, accessibilitynodeinfocompat);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #89  <Field RecyclerView mRecyclerView>
	//   17   35:getfield        #727 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//   18   38:aload_0         
	//   19   39:getfield        #89  <Field RecyclerView mRecyclerView>
	//   20   42:getfield        #473 <Field RecyclerView$State RecyclerView.mState>
	//   21   45:aload_1         
	//   22   46:aload_2         
	//   23   47:invokevirtual   #773 <Method void onInitializeAccessibilityNodeInfoForItem(RecyclerView$Recycler, RecyclerView$State, View, AccessibilityNodeInfoCompat)>
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
	//    4    4:invokevirtual   #785 <Method void onItemsUpdated(RecyclerView, int, int)>
	//    5    7:return          
	}

	public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
	//    0    0:ldc2            #788 <String "RecyclerView">
	//    1    3:ldc2            #790 <String "You must override onLayoutChildren(Recycler recycler, State state) ">
	//    2    6:invokestatic    #796 <Method int Log.e(String, String)>
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
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:iload_3         
	//    3    5:iload           4
	//    4    7:invokevirtual   #803 <Method void RecyclerView.defaultOnMeasure(int, int)>
	//    5   10:return          
	}

	public boolean onRequestChildFocus(RecyclerView recyclerview, RecyclerView.State state, View view, View view1)
	{
		return onRequestChildFocus(recyclerview, view, view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokevirtual   #808 <Method boolean onRequestChildFocus(RecyclerView, View, View)>
	//    5    8:ireturn         
	}

	public boolean onRequestChildFocus(RecyclerView recyclerview, View view, View view1)
	{
		return isSmoothScrolling() || recyclerview.isComputingLayout();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #810 <Method boolean isSmoothScrolling()>
	//    2    4:ifne            19
	//    3    7:aload_1         
	//    4    8:invokevirtual   #813 <Method boolean RecyclerView.isComputingLayout()>
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

	void onSmoothScrollerStopped( )
	{
		if(mSmoothScroller == )
	//*   0    0:aload_0         
	//*   1    1:getfield        #173 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       13
			mSmoothScroller = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #173 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//    7   13:return          
	}

	boolean performAccessibilityAction(int i, Bundle bundle)
	{
		return performAccessibilityAction(mRecyclerView.mRecycler, mRecyclerView.mState, i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #89  <Field RecyclerView mRecyclerView>
	//    3    5:getfield        #727 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    4    8:aload_0         
	//    5    9:getfield        #89  <Field RecyclerView mRecyclerView>
	//    6   12:getfield        #473 <Field RecyclerView$State RecyclerView.mState>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #825 <Method boolean performAccessibilityAction(RecyclerView$Recycler, RecyclerView$State, int, Bundle)>
	//   10   20:ireturn         
	}

	public boolean performAccessibilityAction(RecyclerView.Recycler recycler, RecyclerView.State state, int i, Bundle bundle)
	{
		recycler = ((RecyclerView.Recycler) (mRecyclerView));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_1        
		if(recycler == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		int j;
		if(i != 4096)
	//*   7   11:iload_3         
	//*   8   12:sipush          4096
	//*   9   15:icmpeq          99
		{
			if(i != 8192)
	//*  10   18:iload_3         
	//*  11   19:sipush          8192
	//*  12   22:icmpeq          33
			{
				j = 0;
	//   13   25:iconst_0        
	//   14   26:istore          5
				i = 0;
	//   15   28:iconst_0        
	//   16   29:istore_3        
			} else
	//*  17   30:goto            160
			{
				if(((RecyclerView) (recycler)).canScrollVertically(-1))
	//*  18   33:aload_1         
	//*  19   34:iconst_m1       
	//*  20   35:invokevirtual   #711 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  21   38:ifeq            61
					j = -(getHeight() - getPaddingTop() - getPaddingBottom());
	//   22   41:aload_0         
	//   23   42:invokevirtual   #254 <Method int getHeight()>
	//   24   45:aload_0         
	//   25   46:invokevirtual   #245 <Method int getPaddingTop()>
	//   26   49:isub            
	//   27   50:aload_0         
	//   28   51:invokevirtual   #257 <Method int getPaddingBottom()>
	//   29   54:isub            
	//   30   55:ineg            
	//   31   56:istore          5
				else
	//*  32   58:goto            64
					j = 0;
	//   33   61:iconst_0        
	//   34   62:istore          5
				if(mRecyclerView.canScrollHorizontally(-1))
	//*  35   64:aload_0         
	//*  36   65:getfield        #89  <Field RecyclerView mRecyclerView>
	//*  37   68:iconst_m1       
	//*  38   69:invokevirtual   #713 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  39   72:ifeq            94
					i = -(getWidth() - getPaddingLeft() - getPaddingRight());
	//   40   75:aload_0         
	//   41   76:invokevirtual   #248 <Method int getWidth()>
	//   42   79:aload_0         
	//   43   80:invokevirtual   #242 <Method int getPaddingLeft()>
	//   44   83:isub            
	//   45   84:aload_0         
	//   46   85:invokevirtual   #251 <Method int getPaddingRight()>
	//   47   88:isub            
	//   48   89:ineg            
	//   49   90:istore_3        
				else
	//*  50   91:goto            160
					i = 0;
	//   51   94:iconst_0        
	//   52   95:istore_3        
			}
		} else
	//*  53   96:goto            160
		{
			if(((RecyclerView) (recycler)).canScrollVertically(1))
	//*  54   99:aload_1         
	//*  55  100:iconst_1        
	//*  56  101:invokevirtual   #711 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  57  104:ifeq            126
				j = getHeight() - getPaddingTop() - getPaddingBottom();
	//   58  107:aload_0         
	//   59  108:invokevirtual   #254 <Method int getHeight()>
	//   60  111:aload_0         
	//   61  112:invokevirtual   #245 <Method int getPaddingTop()>
	//   62  115:isub            
	//   63  116:aload_0         
	//   64  117:invokevirtual   #257 <Method int getPaddingBottom()>
	//   65  120:isub            
	//   66  121:istore          5
			else
	//*  67  123:goto            129
				j = 0;
	//   68  126:iconst_0        
	//   69  127:istore          5
			if(mRecyclerView.canScrollHorizontally(1))
	//*  70  129:aload_0         
	//*  71  130:getfield        #89  <Field RecyclerView mRecyclerView>
	//*  72  133:iconst_1        
	//*  73  134:invokevirtual   #713 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  74  137:ifeq            158
				i = getWidth() - getPaddingLeft() - getPaddingRight();
	//   75  140:aload_0         
	//   76  141:invokevirtual   #248 <Method int getWidth()>
	//   77  144:aload_0         
	//   78  145:invokevirtual   #242 <Method int getPaddingLeft()>
	//   79  148:isub            
	//   80  149:aload_0         
	//   81  150:invokevirtual   #251 <Method int getPaddingRight()>
	//   82  153:isub            
	//   83  154:istore_3        
			else
	//*  84  155:goto            160
				i = 0;
	//   85  158:iconst_0        
	//   86  159:istore_3        
		}
		if(j == 0 && i == 0)
	//*  87  160:iload           5
	//*  88  162:ifne            171
	//*  89  165:iload_3         
	//*  90  166:ifne            171
		{
			return false;
	//   91  169:iconst_0        
	//   92  170:ireturn         
		} else
		{
			mRecyclerView.smoothScrollBy(i, j);
	//   93  171:aload_0         
	//   94  172:getfield        #89  <Field RecyclerView mRecyclerView>
	//   95  175:iload_3         
	//   96  176:iload           5
	//   97  178:invokevirtual   #828 <Method void RecyclerView.smoothScrollBy(int, int)>
			return true;
	//   98  181:iconst_1        
	//   99  182:ireturn         
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
	//    2    2:getfield        #89  <Field RecyclerView mRecyclerView>
	//    3    5:getfield        #727 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    4    8:aload_0         
	//    5    9:getfield        #89  <Field RecyclerView mRecyclerView>
	//    6   12:getfield        #473 <Field RecyclerView$State RecyclerView.mState>
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:aload_3         
	//   10   18:invokevirtual   #833 <Method boolean performAccessibilityActionForItem(RecyclerView$Recycler, RecyclerView$State, View, int, Bundle)>
	//   11   21:ireturn         
	}

	public void removeAndRecycleAllViews(RecyclerView.Recycler recycler)
	{
		for(int i = getChildCount() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #438 <Method int getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            38
			if(!RecyclerView.getChildViewHolderInt(getChildAt(i)).shouldIgnore())
	//*   7   11:aload_0         
	//*   8   12:iload_2         
	//*   9   13:invokevirtual   #442 <Method View getChildAt(int)>
	//*  10   16:invokestatic    #81  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//*  11   19:invokevirtual   #364 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  12   22:ifne            31
				removeAndRecycleViewAt(i, recycler);
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #838 <Method void removeAndRecycleViewAt(int, RecyclerView$Recycler)>

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
	//    1    1:invokevirtual   #842 <Method int RecyclerView$Recycler.getScrapCount()>
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
	//   11   15:invokevirtual   #845 <Method View RecyclerView$Recycler.getScrapViewAt(int)>
	//   12   18:astore          4
			RecyclerView.ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
	//   13   20:aload           4
	//   14   22:invokestatic    #81  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//   15   25:astore          5
			if(viewholder.shouldIgnore())
	//*  16   27:aload           5
	//*  17   29:invokevirtual   #364 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  18   32:ifeq            38
				continue;
	//   19   35:goto            96
			viewholder.setIsRecyclable(false);
	//   20   38:aload           5
	//   21   40:iconst_0        
	//   22   41:invokevirtual   #848 <Method void RecyclerView$ViewHolder.setIsRecyclable(boolean)>
			if(viewholder.isTmpDetached())
	//*  23   44:aload           5
	//*  24   46:invokevirtual   #851 <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*  25   49:ifeq            62
				mRecyclerView.removeDetachedView(view, false);
	//   26   52:aload_0         
	//   27   53:getfield        #89  <Field RecyclerView mRecyclerView>
	//   28   56:aload           4
	//   29   58:iconst_0        
	//   30   59:invokevirtual   #855 <Method void RecyclerView.removeDetachedView(View, boolean)>
			if(mRecyclerView.mItemAnimator != null)
	//*  31   62:aload_0         
	//*  32   63:getfield        #89  <Field RecyclerView mRecyclerView>
	//*  33   66:getfield        #859 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//*  34   69:ifnull          84
				mRecyclerView.mItemAnimator.endAnimation(viewholder);
	//   35   72:aload_0         
	//   36   73:getfield        #89  <Field RecyclerView mRecyclerView>
	//   37   76:getfield        #859 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//   38   79:aload           5
	//   39   81:invokevirtual   #864 <Method void RecyclerView$ItemAnimator.endAnimation(RecyclerView$ViewHolder)>
			viewholder.setIsRecyclable(true);
	//   40   84:aload           5
	//   41   86:iconst_1        
	//   42   87:invokevirtual   #848 <Method void RecyclerView$ViewHolder.setIsRecyclable(boolean)>
			recycler.quickRecycleScrapView(view);
	//   43   90:aload_1         
	//   44   91:aload           4
	//   45   93:invokevirtual   #867 <Method void RecyclerView$Recycler.quickRecycleScrapView(View)>
		}

	//   46   96:iload_2         
	//   47   97:iconst_1        
	//   48   98:isub            
	//   49   99:istore_2        
	//*  50  100:goto            9
		recycler.clearScrap();
	//   51  103:aload_1         
	//   52  104:invokevirtual   #870 <Method void RecyclerView$Recycler.clearScrap()>
		if(j > 0)
	//*  53  107:iload_3         
	//*  54  108:ifle            118
			mRecyclerView.invalidate();
	//   55  111:aload_0         
	//   56  112:getfield        #89  <Field RecyclerView mRecyclerView>
	//   57  115:invokevirtual   #871 <Method void RecyclerView.invalidate()>
	//   58  118:return          
	}

	public void removeAndRecycleView(View view, RecyclerView.Recycler recycler)
	{
		removeView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #876 <Method void removeView(View)>
		recycler.recycleView(view);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #879 <Method void RecyclerView$Recycler.recycleView(View)>
	//    6   10:return          
	}

	public void removeAndRecycleViewAt(int i, RecyclerView.Recycler recycler)
	{
		View view = getChildAt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #442 <Method View getChildAt(int)>
	//    3    5:astore_3        
		removeViewAt(i);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:invokevirtual   #379 <Method void removeViewAt(int)>
		recycler.recycleView(view);
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #879 <Method void RecyclerView$Recycler.recycleView(View)>
	//   10   16:return          
	}

	public boolean removeCallbacks(Runnable runnable)
	{
		RecyclerView recyclerview = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_2        
		if(recyclerview != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			return recyclerview.removeCallbacks(runnable);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #883 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//    8   14:ireturn         
		else
			return false;
	//    9   15:iconst_0        
	//   10   16:ireturn         
	}

	public void removeView(View view)
	{
		mChildHelper.removeView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field ChildHelper mChildHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #884 <Method void ChildHelper.removeView(View)>
	//    4    8:return          
	}

	public void removeViewAt(int i)
	{
		if(getChildAt(i) != null)
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokevirtual   #442 <Method View getChildAt(int)>
	//*   3    5:ifnull          16
			mChildHelper.removeViewAt(i);
	//    4    8:aload_0         
	//    5    9:getfield        #122 <Field ChildHelper mChildHelper>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #885 <Method void ChildHelper.removeViewAt(int)>
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
	//    6    7:invokevirtual   #890 <Method boolean requestChildRectangleOnScreen(RecyclerView, View, Rect, boolean, boolean)>
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
	//    5    6:invokespecial   #892 <Method int[] getChildRectangleOnScreenScrollAmount(RecyclerView, View, Rect, boolean)>
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
	//*  21   31:invokespecial   #894 <Method boolean isFocusedChildVisibleAfterScrolling(RecyclerView, int, int)>
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
	//   35   62:invokevirtual   #897 <Method void RecyclerView.scrollBy(int, int)>
			return true;
	//   36   65:iconst_1        
	//   37   66:ireturn         
		} else
		{
			recyclerview.smoothScrollBy(i, j);
	//   38   67:aload_1         
	//   39   68:iload           6
	//   40   70:iload           7
	//   41   72:invokevirtual   #828 <Method void RecyclerView.smoothScrollBy(int, int)>
			return true;
	//   42   75:iconst_1        
	//   43   76:ireturn         
		}
	}

	public void requestLayout()
	{
		RecyclerView recyclerview = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:astore_1        
		if(recyclerview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			recyclerview.requestLayout();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #900 <Method void RecyclerView.requestLayout()>
	//    7   13:return          
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

	void setExactMeasureSpecsFrom(RecyclerView recyclerview)
	{
		setMeasureSpecs(android.view.View.MeasureSpec.makeMeasureSpec(recyclerview.getWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(recyclerview.getHeight(), 0x40000000));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #907 <Method int RecyclerView.getWidth()>
	//    3    5:ldc1            #215 <Int 0x40000000>
	//    4    7:invokestatic    #237 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #908 <Method int RecyclerView.getHeight()>
	//    7   14:ldc1            #215 <Int 0x40000000>
	//    8   16:invokestatic    #237 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    9   19:invokevirtual   #911 <Method void setMeasureSpecs(int, int)>
	//   10   22:return          
	}

	void setMeasureSpecs(int i, int j)
	{
		mWidth = android.view.View.MeasureSpec.getSize(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #213 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    3    5:putfield        #623 <Field int mWidth>
		mWidthMode = android.view.View.MeasureSpec.getMode(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokestatic    #210 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    7   13:putfield        #626 <Field int mWidthMode>
		if(mWidthMode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC)
	//*   8   16:aload_0         
	//*   9   17:getfield        #626 <Field int mWidthMode>
	//*  10   20:ifne            34
	//*  11   23:getstatic       #914 <Field boolean RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC>
	//*  12   26:ifne            34
			mWidth = 0;
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:putfield        #623 <Field int mWidth>
		mHeight = android.view.View.MeasureSpec.getSize(j);
	//   16   34:aload_0         
	//   17   35:iload_2         
	//   18   36:invokestatic    #213 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   19   39:putfield        #549 <Field int mHeight>
		mHeightMode = android.view.View.MeasureSpec.getMode(j);
	//   20   42:aload_0         
	//   21   43:iload_2         
	//   22   44:invokestatic    #210 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   23   47:putfield        #552 <Field int mHeightMode>
		if(mHeightMode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC)
	//*  24   50:aload_0         
	//*  25   51:getfield        #552 <Field int mHeightMode>
	//*  26   54:ifne            68
	//*  27   57:getstatic       #914 <Field boolean RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC>
	//*  28   60:ifne            68
			mHeight = 0;
	//   29   63:aload_0         
	//   30   64:iconst_0        
	//   31   65:putfield        #549 <Field int mHeight>
	//   32   68:return          
	}

	public void setMeasuredDimension(int i, int j)
	{
		RecyclerView.access$300(mRecyclerView, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RecyclerView mRecyclerView>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #918 <Method void RecyclerView.access$300(RecyclerView, int, int)>
	//    5    9:return          
	}

	public void setMeasuredDimension(Rect rect, int i, int j)
	{
		int k = rect.width();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #280 <Method int Rect.width()>
	//    2    4:istore          4
		int l = getPaddingLeft();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #242 <Method int getPaddingLeft()>
	//    5   10:istore          5
		int i1 = getPaddingRight();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #251 <Method int getPaddingRight()>
	//    8   16:istore          6
		int j1 = rect.height();
	//    9   18:aload_1         
	//   10   19:invokevirtual   #283 <Method int Rect.height()>
	//   11   22:istore          7
		int k1 = getPaddingTop();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #245 <Method int getPaddingTop()>
	//   14   28:istore          8
		int l1 = getPaddingBottom();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #257 <Method int getPaddingBottom()>
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
	//   26   47:invokevirtual   #921 <Method int getMinimumWidth()>
	//   27   50:invokestatic    #923 <Method int chooseSize(int, int, int)>
	//   28   53:iload_3         
	//   29   54:iload           7
	//   30   56:iload           8
	//   31   58:iadd            
	//   32   59:iload           9
	//   33   61:iadd            
	//   34   62:aload_0         
	//   35   63:invokevirtual   #925 <Method int getMinimumHeight()>
	//   36   66:invokestatic    #923 <Method int chooseSize(int, int, int)>
	//   37   69:invokevirtual   #927 <Method void setMeasuredDimension(int, int)>
	//   38   72:return          
	}

	void setMeasuredDimensionFromChildren(int i, int j)
	{
		int k2 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #438 <Method int getChildCount()>
	//    2    4:istore          11
		if(k2 == 0)
	//*   3    6:iload           11
	//*   4    8:ifne            21
		{
			mRecyclerView.defaultOnMeasure(i, j);
	//    5   11:aload_0         
	//    6   12:getfield        #89  <Field RecyclerView mRecyclerView>
	//    7   15:iload_1         
	//    8   16:iload_2         
	//    9   17:invokevirtual   #803 <Method void RecyclerView.defaultOnMeasure(int, int)>
			return;
	//   10   20:return          
		}
		int l = 0;
	//   11   21:iconst_0        
	//   12   22:istore          4
		int i2 = 0x7fffffff;
	//   13   24:ldc2            #929 <Int 0x7fffffff>
	//   14   27:istore          9
		int j1 = 0x7fffffff;
	//   15   29:ldc2            #929 <Int 0x7fffffff>
	//   16   32:istore          6
		int k1 = 0x80000000;
	//   17   34:ldc1            #214 <Int 0x80000000>
	//   18   36:istore          7
		int k;
		int j2;
		for(k = 0x80000000; l < k2; k = j2)
	//*  19   38:ldc1            #214 <Int 0x80000000>
	//*  20   40:istore_3        
	//*  21   41:iload           4
	//*  22   43:iload           11
	//*  23   45:icmpge          179
		{
			View view = getChildAt(l);
	//   24   48:aload_0         
	//   25   49:iload           4
	//   26   51:invokevirtual   #442 <Method View getChildAt(int)>
	//   27   54:astore          12
			Rect rect = mRecyclerView.mTempRect;
	//   28   56:aload_0         
	//   29   57:getfield        #89  <Field RecyclerView mRecyclerView>
	//   30   60:getfield        #347 <Field Rect RecyclerView.mTempRect>
	//   31   63:astore          13
			getDecoratedBoundsWithMargins(view, rect);
	//   32   65:aload_0         
	//   33   66:aload           12
	//   34   68:aload           13
	//   35   70:invokevirtual   #351 <Method void getDecoratedBoundsWithMargins(View, Rect)>
			int i1 = i2;
	//   36   73:iload           9
	//   37   75:istore          5
			if(rect.left < i2)
	//*  38   77:aload           13
	//*  39   79:getfield        #265 <Field int Rect.left>
	//*  40   82:iload           9
	//*  41   84:icmpge          94
				i1 = rect.left;
	//   42   87:aload           13
	//   43   89:getfield        #265 <Field int Rect.left>
	//   44   92:istore          5
			int l1 = k1;
	//   45   94:iload           7
	//   46   96:istore          8
			if(rect.right > k1)
	//*  47   98:aload           13
	//*  48  100:getfield        #354 <Field int Rect.right>
	//*  49  103:iload           7
	//*  50  105:icmple          115
				l1 = rect.right;
	//   51  108:aload           13
	//   52  110:getfield        #354 <Field int Rect.right>
	//   53  113:istore          8
			k1 = j1;
	//   54  115:iload           6
	//   55  117:istore          7
			if(rect.top < j1)
	//*  56  119:aload           13
	//*  57  121:getfield        #274 <Field int Rect.top>
	//*  58  124:iload           6
	//*  59  126:icmpge          136
				k1 = rect.top;
	//   60  129:aload           13
	//   61  131:getfield        #274 <Field int Rect.top>
	//   62  134:istore          7
			j2 = k;
	//   63  136:iload_3         
	//   64  137:istore          10
			if(rect.bottom > k)
	//*  65  139:aload           13
	//*  66  141:getfield        #357 <Field int Rect.bottom>
	//*  67  144:iload_3         
	//*  68  145:icmple          155
				j2 = rect.bottom;
	//   69  148:aload           13
	//   70  150:getfield        #357 <Field int Rect.bottom>
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
		}

	//   82  173:iload           10
	//   83  175:istore_3        
	//*  84  176:goto            41
		mRecyclerView.mTempRect.set(i2, j1, k1, k);
	//   85  179:aload_0         
	//   86  180:getfield        #89  <Field RecyclerView mRecyclerView>
	//   87  183:getfield        #347 <Field Rect RecyclerView.mTempRect>
	//   88  186:iload           9
	//   89  188:iload           6
	//   90  190:iload           7
	//   91  192:iload_3         
	//   92  193:invokevirtual   #413 <Method void Rect.set(int, int, int, int)>
		setMeasuredDimension(mRecyclerView.mTempRect, i, j);
	//   93  196:aload_0         
	//   94  197:aload_0         
	//   95  198:getfield        #89  <Field RecyclerView mRecyclerView>
	//   96  201:getfield        #347 <Field Rect RecyclerView.mTempRect>
	//   97  204:iload_1         
	//   98  205:iload_2         
	//   99  206:invokevirtual   #931 <Method void setMeasuredDimension(Rect, int, int)>
	//  100  209:return          
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
	//    4    6:putfield        #89  <Field RecyclerView mRecyclerView>
			mChildHelper = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #122 <Field ChildHelper mChildHelper>
			mWidth = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #623 <Field int mWidth>
			mHeight = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #549 <Field int mHeight>
		} else
	//*  14   24:goto            56
		{
			mRecyclerView = recyclerview;
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:putfield        #89  <Field RecyclerView mRecyclerView>
			mChildHelper = recyclerview.mChildHelper;
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:getfield        #933 <Field ChildHelper RecyclerView.mChildHelper>
	//   21   37:putfield        #122 <Field ChildHelper mChildHelper>
			mWidth = recyclerview.getWidth();
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:invokevirtual   #907 <Method int RecyclerView.getWidth()>
	//   25   45:putfield        #623 <Field int mWidth>
			mHeight = recyclerview.getHeight();
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #908 <Method int RecyclerView.getHeight()>
	//   29   53:putfield        #549 <Field int mHeight>
		}
		mWidthMode = 0x40000000;
	//   30   56:aload_0         
	//   31   57:ldc1            #215 <Int 0x40000000>
	//   32   59:putfield        #626 <Field int mWidthMode>
		mHeightMode = 0x40000000;
	//   33   62:aload_0         
	//   34   63:ldc1            #215 <Int 0x40000000>
	//   35   65:putfield        #552 <Field int mHeightMode>
	//   36   68:return          
	}

	boolean shouldMeasureChild(View view, int i, int j, RecyclerView.LayoutParams layoutparams)
	{
		return view.isLayoutRequested() || !mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getWidth(), i, layoutparams.width) || !isMeasurementUpToDate(view.getHeight(), j, layoutparams.height);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #936 <Method boolean View.isLayoutRequested()>
	//    2    4:ifne            51
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field boolean mMeasurementCacheEnabled>
	//    5   11:ifeq            51
	//    6   14:aload_1         
	//    7   15:invokevirtual   #581 <Method int View.getWidth()>
	//    8   18:iload_2         
	//    9   19:aload           4
	//   10   21:getfield        #667 <Field int RecyclerView$LayoutParams.width>
	//   11   24:invokestatic    #938 <Method boolean isMeasurementUpToDate(int, int, int)>
	//   12   27:ifeq            51
	//   13   30:aload_1         
	//   14   31:invokevirtual   #582 <Method int View.getHeight()>
	//   15   34:iload_3         
	//   16   35:aload           4
	//   17   37:getfield        #672 <Field int RecyclerView$LayoutParams.height>
	//   18   40:invokestatic    #938 <Method boolean isMeasurementUpToDate(int, int, int)>
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
	//    4    8:invokevirtual   #535 <Method int View.getMeasuredWidth()>
	//    5   11:iload_2         
	//    6   12:aload           4
	//    7   14:getfield        #667 <Field int RecyclerView$LayoutParams.width>
	//    8   17:invokestatic    #938 <Method boolean isMeasurementUpToDate(int, int, int)>
	//    9   20:ifeq            44
	//   10   23:aload_1         
	//   11   24:invokevirtual   #531 <Method int View.getMeasuredHeight()>
	//   12   27:iload_3         
	//   13   28:aload           4
	//   14   30:getfield        #672 <Field int RecyclerView$LayoutParams.height>
	//   15   33:invokestatic    #938 <Method boolean isMeasurementUpToDate(int, int, int)>
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
	//    0    0:ldc2            #788 <String "RecyclerView">
	//    1    3:ldc2            #944 <String "You must override smoothScrollToPosition to support smooth scrolling">
	//    2    6:invokestatic    #796 <Method int Log.e(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void startSmoothScroll( )
	{
		 1 = mSmoothScroller;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//    2    4:astore_2        
		if(1 != null &&  != 1 && 1.isRunning())
	//*   3    5:aload_2         
	//*   4    6:ifnull          28
	//*   5    9:aload_1         
	//*   6   10:aload_2         
	//*   7   11:if_acmpeq       28
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #178 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//*  10   18:ifeq            28
			mSmoothScroller.stop();
	//   11   21:aload_0         
	//   12   22:getfield        #173 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//   13   25:invokevirtual   #948 <Method void RecyclerView$SmoothScroller.stop()>
		mSmoothScroller = ;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #173 <Field RecyclerView$SmoothScroller mSmoothScroller>
		mSmoothScroller.start(mRecyclerView, this);
	//   17   33:aload_0         
	//   18   34:getfield        #173 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//   19   37:aload_0         
	//   20   38:getfield        #89  <Field RecyclerView mRecyclerView>
	//   21   41:aload_0         
	//   22   42:invokevirtual   #952 <Method void RecyclerView$SmoothScroller.start(RecyclerView, RecyclerView$LayoutManager)>
	//   23   45:return          
	}

	void stopSmoothScroller()
	{
		  = mSmoothScroller;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field RecyclerView$SmoothScroller mSmoothScroller>
	//    2    4:astore_1        
		if( != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			.stop();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #948 <Method void RecyclerView$SmoothScroller.stop()>
	//    7   13:return          
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
