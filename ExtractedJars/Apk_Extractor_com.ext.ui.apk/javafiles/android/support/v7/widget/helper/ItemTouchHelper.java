// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.*;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchUIUtil

public class ItemTouchHelper extends android.support.v7.widget.RecyclerView.ItemDecoration
	implements android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
{
	public static abstract class Callback
	{

		public static int convertToRelativeDirection(int i, int j)
		{
			int k = i & 0xc0c0c;
		//    0    0:iload_0         
		//    1    1:ldc1            #14  <Int 0xc0c0c>
		//    2    3:iand            
		//    3    4:istore_2        
			if(k == 0)
		//*   4    5:iload_2         
		//*   5    6:ifne            11
				return i;
		//    6    9:iload_0         
		//    7   10:ireturn         
			i = ~k & i;
		//    8   11:iload_2         
		//    9   12:iconst_m1       
		//   10   13:ixor            
		//   11   14:iload_0         
		//   12   15:iand            
		//   13   16:istore_0        
			if(j == 0)
		//*  14   17:iload_1         
		//*  15   18:ifne            27
				return i | k << 2;
		//   16   21:iload_0         
		//   17   22:iload_2         
		//   18   23:iconst_2        
		//   19   24:ishl            
		//   20   25:ior             
		//   21   26:ireturn         
			else
				return i | k << 1 & 0xfff3f3f3 | (k << 1 & 0xc0c0c) << 2;
		//   22   27:iload_0         
		//   23   28:iload_2         
		//   24   29:iconst_1        
		//   25   30:ishl            
		//   26   31:ldc1            #60  <Int 0xfff3f3f3>
		//   27   33:iand            
		//   28   34:ior             
		//   29   35:iload_2         
		//   30   36:iconst_1        
		//   31   37:ishl            
		//   32   38:ldc1            #14  <Int 0xc0c0c>
		//   33   40:iand            
		//   34   41:iconst_2        
		//   35   42:ishl            
		//   36   43:ior             
		//   37   44:ireturn         
		}

		public static ItemTouchUIUtil getDefaultUIUtil()
		{
			return sUICallback;
		//    0    0:getstatic       #50  <Field ItemTouchUIUtil sUICallback>
		//    1    3:areturn         
		}

		private int getMaxDragScroll(RecyclerView recyclerview)
		{
			if(mCachedMaxScrollSpeed == -1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #57  <Field int mCachedMaxScrollSpeed>
		//*   2    4:iconst_m1       
		//*   3    5:icmpne          22
				mCachedMaxScrollSpeed = recyclerview.getResources().getDimensionPixelSize(android.support.v7.recyclerview.R.dimen.item_touch_helper_max_drag_scroll_per_frame);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #70  <Method Resources RecyclerView.getResources()>
		//    7   13:getstatic       #75  <Field int android.support.v7.recyclerview.R$dimen.item_touch_helper_max_drag_scroll_per_frame>
		//    8   16:invokevirtual   #81  <Method int Resources.getDimensionPixelSize(int)>
		//    9   19:putfield        #57  <Field int mCachedMaxScrollSpeed>
			return mCachedMaxScrollSpeed;
		//   10   22:aload_0         
		//   11   23:getfield        #57  <Field int mCachedMaxScrollSpeed>
		//   12   26:ireturn         
		}

		public static int makeFlag(int i, int j)
		{
			return j << i * 8;
		//    0    0:iload_1         
		//    1    1:iload_0         
		//    2    2:bipush          8
		//    3    4:imul            
		//    4    5:ishl            
		//    5    6:ireturn         
		}

		public static int makeMovementFlags(int i, int j)
		{
			return makeFlag(0, j | i) | makeFlag(1, j) | makeFlag(2, i);
		//    0    0:iconst_0        
		//    1    1:iload_1         
		//    2    2:iload_0         
		//    3    3:ior             
		//    4    4:invokestatic    #85  <Method int makeFlag(int, int)>
		//    5    7:iconst_1        
		//    6    8:iload_1         
		//    7    9:invokestatic    #85  <Method int makeFlag(int, int)>
		//    8   12:ior             
		//    9   13:iconst_2        
		//   10   14:iload_0         
		//   11   15:invokestatic    #85  <Method int makeFlag(int, int)>
		//   12   18:ior             
		//   13   19:ireturn         
		}

		public boolean canDropOver(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, android.support.v7.widget.RecyclerView.ViewHolder viewholder1)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public android.support.v7.widget.RecyclerView.ViewHolder chooseDropTarget(android.support.v7.widget.RecyclerView.ViewHolder viewholder, List list, int i, int j)
		{
			int k;
			int l;
			int i2;
			int j2;
			int k2;
			int l2;
			int i3;
			android.support.v7.widget.RecyclerView.ViewHolder viewholder2;
			i2 = viewholder.itemView.getWidth();
		//    0    0:aload_1         
		//    1    1:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    2    4:invokevirtual   #101 <Method int View.getWidth()>
		//    3    7:istore          8
			j2 = viewholder.itemView.getHeight();
		//    4    9:aload_1         
		//    5   10:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    6   13:invokevirtual   #104 <Method int View.getHeight()>
		//    7   16:istore          9
			viewholder2 = null;
		//    8   18:aconst_null     
		//    9   19:astore          14
			k = -1;
		//   10   21:iconst_m1       
		//   11   22:istore          5
			k2 = i - viewholder.itemView.getLeft();
		//   12   24:iload_3         
		//   13   25:aload_1         
		//   14   26:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   15   29:invokevirtual   #107 <Method int View.getLeft()>
		//   16   32:isub            
		//   17   33:istore          10
			l2 = j - viewholder.itemView.getTop();
		//   18   35:iload           4
		//   19   37:aload_1         
		//   20   38:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   21   41:invokevirtual   #110 <Method int View.getTop()>
		//   22   44:isub            
		//   23   45:istore          11
			i3 = list.size();
		//   24   47:aload_2         
		//   25   48:invokeinterface #115 <Method int List.size()>
		//   26   53:istore          12
			l = 0;
		//   27   55:iconst_0        
		//   28   56:istore          6
_L2:
			android.support.v7.widget.RecyclerView.ViewHolder viewholder1;
			if(l >= i3)
				break; /* Loop/switch isn't completed */
		//   29   58:iload           6
		//   30   60:iload           12
		//   31   62:icmpge          343
			viewholder1 = (android.support.v7.widget.RecyclerView.ViewHolder)list.get(l);
		//   32   65:aload_2         
		//   33   66:iload           6
		//   34   68:invokeinterface #119 <Method Object List.get(int)>
		//   35   73:checkcast       #91  <Class android.support.v7.widget.RecyclerView$ViewHolder>
		//   36   76:astore          13
			if(k2 > 0)
		//*  37   78:iload           10
		//*  38   80:ifle            346
			{
				int i1 = viewholder1.itemView.getRight() - (i + i2);
		//   39   83:aload           13
		//   40   85:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   41   88:invokevirtual   #122 <Method int View.getRight()>
		//   42   91:iload_3         
		//   43   92:iload           8
		//   44   94:iadd            
		//   45   95:isub            
		//   46   96:istore          7
				if(i1 < 0 && viewholder1.itemView.getRight() > viewholder.itemView.getRight())
		//*  47   98:iload           7
		//*  48  100:ifge            346
		//*  49  103:aload           13
		//*  50  105:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  51  108:invokevirtual   #122 <Method int View.getRight()>
		//*  52  111:aload_1         
		//*  53  112:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  54  115:invokevirtual   #122 <Method int View.getRight()>
		//*  55  118:icmple          346
				{
					i1 = Math.abs(i1);
		//   56  121:iload           7
		//   57  123:invokestatic    #127 <Method int Math.abs(int)>
		//   58  126:istore          7
					if(i1 > k)
		//*  59  128:iload           7
		//*  60  130:iload           5
		//*  61  132:icmple          346
					{
						k = i1;
		//   62  135:iload           7
		//   63  137:istore          5
						viewholder2 = viewholder1;
		//   64  139:aload           13
		//   65  141:astore          14
					}
				}
			}
			if(k2 < 0)
		//*  66  143:iload           10
		//*  67  145:ifge            359
			{
				int j1 = viewholder1.itemView.getLeft() - i;
		//   68  148:aload           13
		//   69  150:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   70  153:invokevirtual   #107 <Method int View.getLeft()>
		//   71  156:iload_3         
		//   72  157:isub            
		//   73  158:istore          7
				if(j1 > 0 && viewholder1.itemView.getLeft() < viewholder.itemView.getLeft())
		//*  74  160:iload           7
		//*  75  162:ifle            359
		//*  76  165:aload           13
		//*  77  167:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  78  170:invokevirtual   #107 <Method int View.getLeft()>
		//*  79  173:aload_1         
		//*  80  174:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  81  177:invokevirtual   #107 <Method int View.getLeft()>
		//*  82  180:icmpge          359
				{
					j1 = Math.abs(j1);
		//   83  183:iload           7
		//   84  185:invokestatic    #127 <Method int Math.abs(int)>
		//   85  188:istore          7
					if(j1 > k)
		//*  86  190:iload           7
		//*  87  192:iload           5
		//*  88  194:icmple          359
					{
						viewholder2 = viewholder1;
		//   89  197:aload           13
		//   90  199:astore          14
						k = j1;
		//   91  201:iload           7
		//   92  203:istore          5
					}
				}
			}
			if(l2 < 0)
		//*  93  205:iload           11
		//*  94  207:ifge            356
			{
				int k1 = viewholder1.itemView.getTop() - j;
		//   95  210:aload           13
		//   96  212:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   97  215:invokevirtual   #110 <Method int View.getTop()>
		//   98  218:iload           4
		//   99  220:isub            
		//  100  221:istore          7
				if(k1 > 0 && viewholder1.itemView.getTop() < viewholder.itemView.getTop())
		//* 101  223:iload           7
		//* 102  225:ifle            356
		//* 103  228:aload           13
		//* 104  230:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//* 105  233:invokevirtual   #110 <Method int View.getTop()>
		//* 106  236:aload_1         
		//* 107  237:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//* 108  240:invokevirtual   #110 <Method int View.getTop()>
		//* 109  243:icmpge          356
				{
					k1 = Math.abs(k1);
		//  110  246:iload           7
		//  111  248:invokestatic    #127 <Method int Math.abs(int)>
		//  112  251:istore          7
					if(k1 > k)
		//* 113  253:iload           7
		//* 114  255:iload           5
		//* 115  257:icmple          356
					{
						viewholder2 = viewholder1;
		//  116  260:aload           13
		//  117  262:astore          14
						k = k1;
		//  118  264:iload           7
		//  119  266:istore          5
					}
				}
			}
			if(l2 <= 0)
				break MISSING_BLOCK_LABEL_349;
		//  120  268:iload           11
		//  121  270:ifle            349
			int l1 = viewholder1.itemView.getBottom() - (j + j2);
		//  122  273:aload           13
		//  123  275:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//  124  278:invokevirtual   #130 <Method int View.getBottom()>
		//  125  281:iload           4
		//  126  283:iload           9
		//  127  285:iadd            
		//  128  286:isub            
		//  129  287:istore          7
			if(l1 >= 0 || viewholder1.itemView.getBottom() <= viewholder.itemView.getBottom())
				break MISSING_BLOCK_LABEL_349;
		//  130  289:iload           7
		//  131  291:ifge            349
		//  132  294:aload           13
		//  133  296:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//  134  299:invokevirtual   #130 <Method int View.getBottom()>
		//  135  302:aload_1         
		//  136  303:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//  137  306:invokevirtual   #130 <Method int View.getBottom()>
		//  138  309:icmple          349
			l1 = Math.abs(l1);
		//  139  312:iload           7
		//  140  314:invokestatic    #127 <Method int Math.abs(int)>
		//  141  317:istore          7
			if(l1 <= k)
				break MISSING_BLOCK_LABEL_349;
		//  142  319:iload           7
		//  143  321:iload           5
		//  144  323:icmple          349
			k = l1;
		//  145  326:iload           7
		//  146  328:istore          5
_L3:
			l++;
		//  147  330:iload           6
		//  148  332:iconst_1        
		//  149  333:iadd            
		//  150  334:istore          6
			viewholder2 = viewholder1;
		//  151  336:aload           13
		//  152  338:astore          14
			if(true) goto _L2; else goto _L1
		//  153  340:goto            58
_L1:
			return viewholder2;
		//  154  343:aload           14
		//  155  345:areturn         
		//* 156  346:goto            143
			viewholder1 = viewholder2;
		//  157  349:aload           14
		//  158  351:astore          13
			  goto _L3
		//* 159  353:goto            330
		//* 160  356:goto            268
		//* 161  359:goto            205
		}

		public void clearView(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			sUICallback.clearView(viewholder.itemView);
		//    0    0:getstatic       #50  <Field ItemTouchUIUtil sUICallback>
		//    1    3:aload_2         
		//    2    4:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    3    7:invokeinterface #139 <Method void ItemTouchUIUtil.clearView(View)>
		//    4   12:return          
		}

		public int convertToAbsoluteDirection(int i, int j)
		{
			int k = i & 0x303030;
		//    0    0:iload_1         
		//    1    1:ldc1            #24  <Int 0x303030>
		//    2    3:iand            
		//    3    4:istore_3        
			if(k == 0)
		//*   4    5:iload_3         
		//*   5    6:ifne            11
				return i;
		//    6    9:iload_1         
		//    7   10:ireturn         
			i = ~k & i;
		//    8   11:iload_3         
		//    9   12:iconst_m1       
		//   10   13:ixor            
		//   11   14:iload_1         
		//   12   15:iand            
		//   13   16:istore_1        
			if(j == 0)
		//*  14   17:iload_2         
		//*  15   18:ifne            27
				return i | k >> 2;
		//   16   21:iload_1         
		//   17   22:iload_3         
		//   18   23:iconst_2        
		//   19   24:ishr            
		//   20   25:ior             
		//   21   26:ireturn         
			else
				return i | k >> 1 & 0xffcfcfcf | (k >> 1 & 0x303030) >> 2;
		//   22   27:iload_1         
		//   23   28:iload_3         
		//   24   29:iconst_1        
		//   25   30:ishr            
		//   26   31:ldc1            #141 <Int 0xffcfcfcf>
		//   27   33:iand            
		//   28   34:ior             
		//   29   35:iload_3         
		//   30   36:iconst_1        
		//   31   37:ishr            
		//   32   38:ldc1            #24  <Int 0x303030>
		//   33   40:iand            
		//   34   41:iconst_2        
		//   35   42:ishr            
		//   36   43:ior             
		//   37   44:ireturn         
		}

		final int getAbsoluteMovementFlags(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			return convertToAbsoluteDirection(getMovementFlags(recyclerview, viewholder), ViewCompat.getLayoutDirection(((View) (recyclerview))));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:aload_1         
		//    3    3:aload_2         
		//    4    4:invokevirtual   #146 <Method int getMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		//    5    7:aload_1         
		//    6    8:invokestatic    #152 <Method int ViewCompat.getLayoutDirection(View)>
		//    7   11:invokevirtual   #154 <Method int convertToAbsoluteDirection(int, int)>
		//    8   14:ireturn         
		}

		public long getAnimationDuration(RecyclerView recyclerview, int i, float f, float f1)
		{
			recyclerview = ((RecyclerView) (recyclerview.getItemAnimator()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #160 <Method android.support.v7.widget.RecyclerView$ItemAnimator RecyclerView.getItemAnimator()>
		//    2    4:astore_1        
			if(recyclerview == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       23
				return i != 8 ? 250L : 200L;
		//    5    9:iload_2         
		//    6   10:bipush          8
		//    7   12:icmpne          19
		//    8   15:ldc2w           #161 <Long 200L>
		//    9   18:lreturn         
		//   10   19:ldc2w           #163 <Long 250L>
		//   11   22:lreturn         
			if(i == 8)
		//*  12   23:iload_2         
		//*  13   24:bipush          8
		//*  14   26:icmpne          34
				return ((android.support.v7.widget.RecyclerView.ItemAnimator) (recyclerview)).getMoveDuration();
		//   15   29:aload_1         
		//   16   30:invokevirtual   #170 <Method long android.support.v7.widget.RecyclerView$ItemAnimator.getMoveDuration()>
		//   17   33:lreturn         
			else
				return ((android.support.v7.widget.RecyclerView.ItemAnimator) (recyclerview)).getRemoveDuration();
		//   18   34:aload_1         
		//   19   35:invokevirtual   #173 <Method long android.support.v7.widget.RecyclerView$ItemAnimator.getRemoveDuration()>
		//   20   38:lreturn         
		}

		public int getBoundingBoxMargin()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public float getMoveThreshold(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			return 0.5F;
		//    0    0:ldc1            #177 <Float 0.5F>
		//    1    2:freturn         
		}

		public abstract int getMovementFlags(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder);

		public float getSwipeEscapeVelocity(float f)
		{
			return f;
		//    0    0:fload_1         
		//    1    1:freturn         
		}

		public float getSwipeThreshold(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			return 0.5F;
		//    0    0:ldc1            #177 <Float 0.5F>
		//    1    2:freturn         
		}

		public float getSwipeVelocityThreshold(float f)
		{
			return f;
		//    0    0:fload_1         
		//    1    1:freturn         
		}

		boolean hasDragFlag(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			return (getAbsoluteMovementFlags(recyclerview, viewholder) & 0xff0000) != 0;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #185 <Method int getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		//    4    6:ldc1            #186 <Int 0xff0000>
		//    5    8:iand            
		//    6    9:ifeq            14
		//    7   12:iconst_1        
		//    8   13:ireturn         
		//    9   14:iconst_0        
		//   10   15:ireturn         
		}

		boolean hasSwipeFlag(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			return (getAbsoluteMovementFlags(recyclerview, viewholder) & 0xff00) != 0;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #185 <Method int getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		//    4    6:ldc1            #188 <Int 65280>
		//    5    8:iand            
		//    6    9:ifeq            14
		//    7   12:iconst_1        
		//    8   13:ireturn         
		//    9   14:iconst_0        
		//   10   15:ireturn         
		}

		public int interpolateOutOfBoundsScroll(RecyclerView recyclerview, int i, int j, int k, long l)
		{
label0:
			{
				float f = 1.0F;
		//    0    0:fconst_1        
		//    1    1:fstore          7
				k = getMaxDragScroll(recyclerview);
		//    2    3:aload_0         
		//    3    4:aload_1         
		//    4    5:invokespecial   #192 <Method int getMaxDragScroll(RecyclerView)>
		//    5    8:istore          4
				int i1 = Math.abs(j);
		//    6   10:iload_3         
		//    7   11:invokestatic    #127 <Method int Math.abs(int)>
		//    8   14:istore          9
				int j1 = (int)Math.signum(j);
		//    9   16:iload_3         
		//   10   17:i2f             
		//   11   18:invokestatic    #195 <Method float Math.signum(float)>
		//   12   21:f2i             
		//   13   22:istore          10
				float f1 = Math.min(1.0F, ((float)i1 * 1.0F) / (float)i);
		//   14   24:fconst_1        
		//   15   25:iload           9
		//   16   27:i2f             
		//   17   28:fconst_1        
		//   18   29:fmul            
		//   19   30:iload_2         
		//   20   31:i2f             
		//   21   32:fdiv            
		//   22   33:invokestatic    #199 <Method float Math.min(float, float)>
		//   23   36:fstore          8
				i = (int)((float)(k * j1) * sDragViewScrollCapInterpolator.getInterpolation(f1));
		//   24   38:iload           4
		//   25   40:iload           10
		//   26   42:imul            
		//   27   43:i2f             
		//   28   44:getstatic       #40  <Field Interpolator sDragViewScrollCapInterpolator>
		//   29   47:fload           8
		//   30   49:invokeinterface #204 <Method float Interpolator.getInterpolation(float)>
		//   31   54:fmul            
		//   32   55:f2i             
		//   33   56:istore_2        
				if(l <= 2000L)
		//*  34   57:lload           5
		//*  35   59:ldc2w           #21  <Long 2000L>
		//*  36   62:lcmp            
		//*  37   63:ifle            102
		//*  38   66:iload_2         
		//*  39   67:i2f             
		//*  40   68:fstore          8
		//*  41   70:getstatic       #37  <Field Interpolator sDragScrollInterpolator>
		//*  42   73:fload           7
		//*  43   75:invokeinterface #204 <Method float Interpolator.getInterpolation(float)>
		//*  44   80:fload           8
		//*  45   82:fmul            
		//*  46   83:f2i             
		//*  47   84:istore          4
		//*  48   86:iload           4
		//*  49   88:istore_2        
		//*  50   89:iload           4
		//*  51   91:ifne            100
		//*  52   94:iload_3         
		//*  53   95:ifle            113
		//*  54   98:iconst_1        
		//*  55   99:istore_2        
		//*  56  100:iload_2         
		//*  57  101:ireturn         
					f = (float)l / 2000F;
		//   58  102:lload           5
		//   59  104:l2f             
		//   60  105:ldc1            #205 <Float 2000F>
		//   61  107:fdiv            
		//   62  108:fstore          7
				f1 = i;
				k = (int)(sDragScrollInterpolator.getInterpolation(f) * f1);
				i = k;
				if(k == 0)
				{
					if(j <= 0)
						break label0;
					i = 1;
				}
				return i;
			}
		//*  63  110:goto            66
			return -1;
		//   64  113:iconst_m1       
		//   65  114:ireturn         
		}

		public boolean isItemViewSwipeEnabled()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean isLongPressDragEnabled()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public void onChildDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, float f, float f1, int i, boolean flag)
		{
			sUICallback.onDraw(canvas, recyclerview, viewholder.itemView, f, f1, i, flag);
		//    0    0:getstatic       #50  <Field ItemTouchUIUtil sUICallback>
		//    1    3:aload_1         
		//    2    4:aload_2         
		//    3    5:aload_3         
		//    4    6:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    5    9:fload           4
		//    6   11:fload           5
		//    7   13:iload           6
		//    8   15:iload           7
		//    9   17:invokeinterface #214 <Method void ItemTouchUIUtil.onDraw(Canvas, RecyclerView, View, float, float, int, boolean)>
		//   10   22:return          
		}

		public void onChildDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, float f, float f1, int i, boolean flag)
		{
			sUICallback.onDrawOver(canvas, recyclerview, viewholder.itemView, f, f1, i, flag);
		//    0    0:getstatic       #50  <Field ItemTouchUIUtil sUICallback>
		//    1    3:aload_1         
		//    2    4:aload_2         
		//    3    5:aload_3         
		//    4    6:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    5    9:fload           4
		//    6   11:fload           5
		//    7   13:iload           6
		//    8   15:iload           7
		//    9   17:invokeinterface #218 <Method void ItemTouchUIUtil.onDrawOver(Canvas, RecyclerView, View, float, float, int, boolean)>
		//   10   22:return          
		}

		void onDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, List list, int i, float f, float f1)
		{
			int l = list.size();
		//    0    0:aload           4
		//    1    2:invokeinterface #115 <Method int List.size()>
		//    2    7:istore          9
			for(int j = 0; j < l; j++)
		//*   3    9:iconst_0        
		//*   4   10:istore          8
		//*   5   12:iload           8
		//*   6   14:iload           9
		//*   7   16:icmpge          86
			{
				RecoverAnimation recoveranimation = (RecoverAnimation)list.get(j);
		//    8   19:aload           4
		//    9   21:iload           8
		//   10   23:invokeinterface #119 <Method Object List.get(int)>
		//   11   28:checkcast       #221 <Class ItemTouchHelper$RecoverAnimation>
		//   12   31:astore          11
				recoveranimation.update();
		//   13   33:aload           11
		//   14   35:invokevirtual   #224 <Method void ItemTouchHelper$RecoverAnimation.update()>
				int i1 = canvas.save();
		//   15   38:aload_1         
		//   16   39:invokevirtual   #229 <Method int Canvas.save()>
		//   17   42:istore          10
				onChildDraw(canvas, recyclerview, recoveranimation.mViewHolder, recoveranimation.mX, recoveranimation.mY, recoveranimation.mActionState, false);
		//   18   44:aload_0         
		//   19   45:aload_1         
		//   20   46:aload_2         
		//   21   47:aload           11
		//   22   49:getfield        #233 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//   23   52:aload           11
		//   24   54:getfield        #237 <Field float ItemTouchHelper$RecoverAnimation.mX>
		//   25   57:aload           11
		//   26   59:getfield        #240 <Field float ItemTouchHelper$RecoverAnimation.mY>
		//   27   62:aload           11
		//   28   64:getfield        #243 <Field int ItemTouchHelper$RecoverAnimation.mActionState>
		//   29   67:iconst_0        
		//   30   68:invokevirtual   #245 <Method void onChildDraw(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
				canvas.restoreToCount(i1);
		//   31   71:aload_1         
		//   32   72:iload           10
		//   33   74:invokevirtual   #249 <Method void Canvas.restoreToCount(int)>
			}

		//   34   77:iload           8
		//   35   79:iconst_1        
		//   36   80:iadd            
		//   37   81:istore          8
		//*  38   83:goto            12
			if(viewholder != null)
		//*  39   86:aload_3         
		//*  40   87:ifnull          116
			{
				int k = canvas.save();
		//   41   90:aload_1         
		//   42   91:invokevirtual   #229 <Method int Canvas.save()>
		//   43   94:istore          8
				onChildDraw(canvas, recyclerview, viewholder, f, f1, i, true);
		//   44   96:aload_0         
		//   45   97:aload_1         
		//   46   98:aload_2         
		//   47   99:aload_3         
		//   48  100:fload           6
		//   49  102:fload           7
		//   50  104:iload           5
		//   51  106:iconst_1        
		//   52  107:invokevirtual   #245 <Method void onChildDraw(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
				canvas.restoreToCount(k);
		//   53  110:aload_1         
		//   54  111:iload           8
		//   55  113:invokevirtual   #249 <Method void Canvas.restoreToCount(int)>
			}
		//   56  116:return          
		}

		void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, List list, int i, float f, float f1)
		{
			int i1 = list.size();
		//    0    0:aload           4
		//    1    2:invokeinterface #115 <Method int List.size()>
		//    2    7:istore          9
			for(int j = 0; j < i1; j++)
		//*   3    9:iconst_0        
		//*   4   10:istore          8
		//*   5   12:iload           8
		//*   6   14:iload           9
		//*   7   16:icmpge          81
			{
				RecoverAnimation recoveranimation = (RecoverAnimation)list.get(j);
		//    8   19:aload           4
		//    9   21:iload           8
		//   10   23:invokeinterface #119 <Method Object List.get(int)>
		//   11   28:checkcast       #221 <Class ItemTouchHelper$RecoverAnimation>
		//   12   31:astore          11
				int j1 = canvas.save();
		//   13   33:aload_1         
		//   14   34:invokevirtual   #229 <Method int Canvas.save()>
		//   15   37:istore          10
				onChildDrawOver(canvas, recyclerview, recoveranimation.mViewHolder, recoveranimation.mX, recoveranimation.mY, recoveranimation.mActionState, false);
		//   16   39:aload_0         
		//   17   40:aload_1         
		//   18   41:aload_2         
		//   19   42:aload           11
		//   20   44:getfield        #233 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//   21   47:aload           11
		//   22   49:getfield        #237 <Field float ItemTouchHelper$RecoverAnimation.mX>
		//   23   52:aload           11
		//   24   54:getfield        #240 <Field float ItemTouchHelper$RecoverAnimation.mY>
		//   25   57:aload           11
		//   26   59:getfield        #243 <Field int ItemTouchHelper$RecoverAnimation.mActionState>
		//   27   62:iconst_0        
		//   28   63:invokevirtual   #252 <Method void onChildDrawOver(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
				canvas.restoreToCount(j1);
		//   29   66:aload_1         
		//   30   67:iload           10
		//   31   69:invokevirtual   #249 <Method void Canvas.restoreToCount(int)>
			}

		//   32   72:iload           8
		//   33   74:iconst_1        
		//   34   75:iadd            
		//   35   76:istore          8
		//*  36   78:goto            12
			if(viewholder != null)
		//*  37   81:aload_3         
		//*  38   82:ifnull          111
			{
				int k = canvas.save();
		//   39   85:aload_1         
		//   40   86:invokevirtual   #229 <Method int Canvas.save()>
		//   41   89:istore          8
				onChildDrawOver(canvas, recyclerview, viewholder, f, f1, i, true);
		//   42   91:aload_0         
		//   43   92:aload_1         
		//   44   93:aload_2         
		//   45   94:aload_3         
		//   46   95:fload           6
		//   47   97:fload           7
		//   48   99:iload           5
		//   49  101:iconst_1        
		//   50  102:invokevirtual   #252 <Method void onChildDrawOver(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
				canvas.restoreToCount(k);
		//   51  105:aload_1         
		//   52  106:iload           8
		//   53  108:invokevirtual   #249 <Method void Canvas.restoreToCount(int)>
			}
			i = 0;
		//   54  111:iconst_0        
		//   55  112:istore          5
			int l = i1 - 1;
		//   56  114:iload           9
		//   57  116:iconst_1        
		//   58  117:isub            
		//   59  118:istore          8
			while(l >= 0) 
		//*  60  120:iload           8
		//*  61  122:iflt            184
			{
				canvas = ((Canvas) ((RecoverAnimation)list.get(l)));
		//   62  125:aload           4
		//   63  127:iload           8
		//   64  129:invokeinterface #119 <Method Object List.get(int)>
		//   65  134:checkcast       #221 <Class ItemTouchHelper$RecoverAnimation>
		//   66  137:astore_1        
				if(((RecoverAnimation) (canvas)).mEnded && !((RecoverAnimation) (canvas)).mIsPendingCleanup)
		//*  67  138:aload_1         
		//*  68  139:getfield        #256 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
		//*  69  142:ifeq            171
		//*  70  145:aload_1         
		//*  71  146:getfield        #259 <Field boolean ItemTouchHelper$RecoverAnimation.mIsPendingCleanup>
		//*  72  149:ifne            171
					list.remove(l);
		//   73  152:aload           4
		//   74  154:iload           8
		//   75  156:invokeinterface #262 <Method Object List.remove(int)>
		//   76  161:pop             
				else
		//*  77  162:iload           8
		//*  78  164:iconst_1        
		//*  79  165:isub            
		//*  80  166:istore          8
		//*  81  168:goto            120
				if(!((RecoverAnimation) (canvas)).mEnded)
		//*  82  171:aload_1         
		//*  83  172:getfield        #256 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
		//*  84  175:ifne            194
					i = 1;
		//   85  178:iconst_1        
		//   86  179:istore          5
				l--;
			}
		//*  87  181:goto            162
			if(i != 0)
		//*  88  184:iload           5
		//*  89  186:ifeq            193
				recyclerview.invalidate();
		//   90  189:aload_2         
		//   91  190:invokevirtual   #265 <Method void RecyclerView.invalidate()>
		//   92  193:return          
		//*  93  194:goto            162
		}

		public abstract boolean onMove(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, android.support.v7.widget.RecyclerView.ViewHolder viewholder1);

		public void onMoved(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i, android.support.v7.widget.RecyclerView.ViewHolder viewholder1, int j, int k, int l)
		{
			android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = recyclerview.getLayoutManager();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #272 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
		//    2    4:astore          8
			if(layoutmanager instanceof ViewDropHandler)
		//*   3    6:aload           8
		//*   4    8:instanceof      #274 <Class ItemTouchHelper$ViewDropHandler>
		//*   5   11:ifeq            38
			{
				((ViewDropHandler)layoutmanager).prepareForDrop(viewholder.itemView, viewholder1.itemView, k, l);
		//    6   14:aload           8
		//    7   16:checkcast       #274 <Class ItemTouchHelper$ViewDropHandler>
		//    8   19:aload_2         
		//    9   20:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   10   23:aload           4
		//   11   25:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   12   28:iload           6
		//   13   30:iload           7
		//   14   32:invokeinterface #278 <Method void ItemTouchHelper$ViewDropHandler.prepareForDrop(View, View, int, int)>
			} else
		//*  15   37:return          
			{
				if(layoutmanager.canScrollHorizontally())
		//*  16   38:aload           8
		//*  17   40:invokevirtual   #283 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollHorizontally()>
		//*  18   43:ifeq            97
				{
					if(layoutmanager.getDecoratedLeft(viewholder1.itemView) <= recyclerview.getPaddingLeft())
		//*  19   46:aload           8
		//*  20   48:aload           4
		//*  21   50:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  22   53:invokevirtual   #286 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedLeft(View)>
		//*  23   56:aload_1         
		//*  24   57:invokevirtual   #289 <Method int RecyclerView.getPaddingLeft()>
		//*  25   60:icmpgt          69
						recyclerview.scrollToPosition(j);
		//   26   63:aload_1         
		//   27   64:iload           5
		//   28   66:invokevirtual   #292 <Method void RecyclerView.scrollToPosition(int)>
					if(layoutmanager.getDecoratedRight(viewholder1.itemView) >= recyclerview.getWidth() - recyclerview.getPaddingRight())
		//*  29   69:aload           8
		//*  30   71:aload           4
		//*  31   73:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  32   76:invokevirtual   #295 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedRight(View)>
		//*  33   79:aload_1         
		//*  34   80:invokevirtual   #296 <Method int RecyclerView.getWidth()>
		//*  35   83:aload_1         
		//*  36   84:invokevirtual   #299 <Method int RecyclerView.getPaddingRight()>
		//*  37   87:isub            
		//*  38   88:icmplt          97
						recyclerview.scrollToPosition(j);
		//   39   91:aload_1         
		//   40   92:iload           5
		//   41   94:invokevirtual   #292 <Method void RecyclerView.scrollToPosition(int)>
				}
				if(layoutmanager.canScrollVertically())
		//*  42   97:aload           8
		//*  43   99:invokevirtual   #302 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollVertically()>
		//*  44  102:ifeq            37
				{
					if(layoutmanager.getDecoratedTop(viewholder1.itemView) <= recyclerview.getPaddingTop())
		//*  45  105:aload           8
		//*  46  107:aload           4
		//*  47  109:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  48  112:invokevirtual   #305 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedTop(View)>
		//*  49  115:aload_1         
		//*  50  116:invokevirtual   #308 <Method int RecyclerView.getPaddingTop()>
		//*  51  119:icmpgt          128
						recyclerview.scrollToPosition(j);
		//   52  122:aload_1         
		//   53  123:iload           5
		//   54  125:invokevirtual   #292 <Method void RecyclerView.scrollToPosition(int)>
					if(layoutmanager.getDecoratedBottom(viewholder1.itemView) >= recyclerview.getHeight() - recyclerview.getPaddingBottom())
		//*  55  128:aload           8
		//*  56  130:aload           4
		//*  57  132:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  58  135:invokevirtual   #311 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedBottom(View)>
		//*  59  138:aload_1         
		//*  60  139:invokevirtual   #312 <Method int RecyclerView.getHeight()>
		//*  61  142:aload_1         
		//*  62  143:invokevirtual   #315 <Method int RecyclerView.getPaddingBottom()>
		//*  63  146:isub            
		//*  64  147:icmplt          37
					{
						recyclerview.scrollToPosition(j);
		//   65  150:aload_1         
		//   66  151:iload           5
		//   67  153:invokevirtual   #292 <Method void RecyclerView.scrollToPosition(int)>
						return;
		//   68  156:return          
					}
				}
			}
		}

		public void onSelectedChanged(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
		{
			if(viewholder != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          16
				sUICallback.onSelected(viewholder.itemView);
		//    2    4:getstatic       #50  <Field ItemTouchUIUtil sUICallback>
		//    3    7:aload_1         
		//    4    8:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    5   11:invokeinterface #320 <Method void ItemTouchUIUtil.onSelected(View)>
		//    6   16:return          
		}

		public abstract void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i);

		private static final int ABS_HORIZONTAL_DIR_FLAGS = 0xc0c0c;
		public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
		public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
		private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000L;
		static final int RELATIVE_DIR_FLAGS = 0x303030;
		private static final Interpolator sDragScrollInterpolator = new Interpolator() {

			public float getInterpolation(float f)
			{
				return f * f * f * f * f;
			//    0    0:fload_1         
			//    1    1:fload_1         
			//    2    2:fmul            
			//    3    3:fload_1         
			//    4    4:fmul            
			//    5    5:fload_1         
			//    6    6:fmul            
			//    7    7:fload_1         
			//    8    8:fmul            
			//    9    9:freturn         
			}

		}
;
		private static final Interpolator sDragViewScrollCapInterpolator = new Interpolator() {

			public float getInterpolation(float f)
			{
				f--;
			//    0    0:fload_1         
			//    1    1:fconst_1        
			//    2    2:fsub            
			//    3    3:fstore_1        
				return f * (f * f * f * f) + 1.0F;
			//    4    4:fload_1         
			//    5    5:fload_1         
			//    6    6:fload_1         
			//    7    7:fmul            
			//    8    8:fload_1         
			//    9    9:fmul            
			//   10   10:fload_1         
			//   11   11:fmul            
			//   12   12:fmul            
			//   13   13:fconst_1        
			//   14   14:fadd            
			//   15   15:freturn         
			}

		}
;
		private static final ItemTouchUIUtil sUICallback;
		private int mCachedMaxScrollSpeed;

		static 
		{
		//    0    0:new             #9   <Class ItemTouchHelper$Callback$1>
		//    1    3:dup             
		//    2    4:invokespecial   #35  <Method void ItemTouchHelper$Callback$1()>
		//    3    7:putstatic       #37  <Field Interpolator sDragScrollInterpolator>
		//    4   10:new             #11  <Class ItemTouchHelper$Callback$2>
		//    5   13:dup             
		//    6   14:invokespecial   #38  <Method void ItemTouchHelper$Callback$2()>
		//    7   17:putstatic       #40  <Field Interpolator sDragViewScrollCapInterpolator>
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   8   20:getstatic       #45  <Field int android.os.Build$VERSION.SDK_INT>
		//*   9   23:bipush          21
		//*  10   25:icmplt          39
				sUICallback = ((ItemTouchUIUtil) (new ItemTouchUIUtilImpl.Api21Impl()));
		//   11   28:new             #47  <Class ItemTouchUIUtilImpl$Api21Impl>
		//   12   31:dup             
		//   13   32:invokespecial   #48  <Method void ItemTouchUIUtilImpl$Api21Impl()>
		//   14   35:putstatic       #50  <Field ItemTouchUIUtil sUICallback>
		//   15   38:return          
			else
				sUICallback = ((ItemTouchUIUtil) (new ItemTouchUIUtilImpl.BaseImpl()));
		//   16   39:new             #52  <Class ItemTouchUIUtilImpl$BaseImpl>
		//   17   42:dup             
		//   18   43:invokespecial   #53  <Method void ItemTouchUIUtilImpl$BaseImpl()>
		//   19   46:putstatic       #50  <Field ItemTouchUIUtil sUICallback>
		//*  20   49:return          
		}

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #55  <Method void Object()>
			mCachedMaxScrollSpeed = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #57  <Field int mCachedMaxScrollSpeed>
		//    5    9:return          
		}
	}

	private class ItemTouchHelperGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
	{

		public boolean onDown(MotionEvent motionevent)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public void onLongPress(MotionEvent motionevent)
		{
			Object obj;
			obj = ((Object) (findChildView(motionevent)));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ItemTouchHelper this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #25  <Method View ItemTouchHelper.findChildView(MotionEvent)>
		//    4    8:astore          5
			if(obj != null)
		//*   5   10:aload           5
		//*   6   12:ifnull          56
			{
				obj = ((Object) (mRecyclerView.getChildViewHolder(((View) (obj)))));
		//    7   15:aload_0         
		//    8   16:getfield        #13  <Field ItemTouchHelper this$0>
		//    9   19:getfield        #29  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   10   22:aload           5
		//   11   24:invokevirtual   #35  <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
		//   12   27:astore          5
				break MISSING_BLOCK_LABEL_29;
			}
		//*  13   29:aload           5
		//*  14   31:ifnull          56
		//*  15   34:aload_0         
		//*  16   35:getfield        #13  <Field ItemTouchHelper this$0>
		//*  17   38:getfield        #39  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
		//*  18   41:aload_0         
		//*  19   42:getfield        #13  <Field ItemTouchHelper this$0>
		//*  20   45:getfield        #29  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//*  21   48:aload           5
		//*  22   50:invokevirtual   #45  <Method boolean ItemTouchHelper$Callback.hasDragFlag(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		//*  23   53:ifne            57
_L1:
			return;
		//   24   56:return          
			if(obj != null && mCallback.hasDragFlag(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj))) && motionevent.getPointerId(0) == mActivePointerId)
		//*  25   57:aload_1         
		//*  26   58:iconst_0        
		//*  27   59:invokevirtual   #51  <Method int MotionEvent.getPointerId(int)>
		//*  28   62:aload_0         
		//*  29   63:getfield        #13  <Field ItemTouchHelper this$0>
		//*  30   66:getfield        #55  <Field int ItemTouchHelper.mActivePointerId>
		//*  31   69:icmpne          56
			{
				int i = motionevent.findPointerIndex(mActivePointerId);
		//   32   72:aload_1         
		//   33   73:aload_0         
		//   34   74:getfield        #13  <Field ItemTouchHelper this$0>
		//   35   77:getfield        #55  <Field int ItemTouchHelper.mActivePointerId>
		//   36   80:invokevirtual   #58  <Method int MotionEvent.findPointerIndex(int)>
		//   37   83:istore          4
				float f = motionevent.getX(i);
		//   38   85:aload_1         
		//   39   86:iload           4
		//   40   88:invokevirtual   #62  <Method float MotionEvent.getX(int)>
		//   41   91:fstore_2        
				float f1 = motionevent.getY(i);
		//   42   92:aload_1         
		//   43   93:iload           4
		//   44   95:invokevirtual   #65  <Method float MotionEvent.getY(int)>
		//   45   98:fstore_3        
				mInitialTouchX = f;
		//   46   99:aload_0         
		//   47  100:getfield        #13  <Field ItemTouchHelper this$0>
		//   48  103:fload_2         
		//   49  104:putfield        #69  <Field float ItemTouchHelper.mInitialTouchX>
				mInitialTouchY = f1;
		//   50  107:aload_0         
		//   51  108:getfield        #13  <Field ItemTouchHelper this$0>
		//   52  111:fload_3         
		//   53  112:putfield        #72  <Field float ItemTouchHelper.mInitialTouchY>
				motionevent = ((MotionEvent) (ItemTouchHelper.this));
		//   54  115:aload_0         
		//   55  116:getfield        #13  <Field ItemTouchHelper this$0>
		//   56  119:astore_1        
				mDy = 0.0F;
		//   57  120:aload_0         
		//   58  121:getfield        #13  <Field ItemTouchHelper this$0>
		//   59  124:fconst_0        
		//   60  125:putfield        #75  <Field float ItemTouchHelper.mDy>
				motionevent.mDx = 0.0F;
		//   61  128:aload_1         
		//   62  129:fconst_0        
		//   63  130:putfield        #78  <Field float ItemTouchHelper.mDx>
				if(mCallback.isLongPressDragEnabled())
		//*  64  133:aload_0         
		//*  65  134:getfield        #13  <Field ItemTouchHelper this$0>
		//*  66  137:getfield        #39  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
		//*  67  140:invokevirtual   #82  <Method boolean ItemTouchHelper$Callback.isLongPressDragEnabled()>
		//*  68  143:ifeq            56
				{
					select(((android.support.v7.widget.RecyclerView.ViewHolder) (obj)), 2);
		//   69  146:aload_0         
		//   70  147:getfield        #13  <Field ItemTouchHelper this$0>
		//   71  150:aload           5
		//   72  152:iconst_2        
		//   73  153:invokevirtual   #86  <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
					return;
		//   74  156:return          
				}
			}
			  goto _L1
		}

		final ItemTouchHelper this$0;

		ItemTouchHelperGestureListener()
		{
			this$0 = ItemTouchHelper.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ItemTouchHelper this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
		//    5    9:return          
		}
	}

	private static class RecoverAnimation
		implements android.animation.Animator.AnimatorListener
	{

		public void cancel()
		{
			mValueAnimator.cancel();
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field ValueAnimator mValueAnimator>
		//    2    4:invokevirtual   #90  <Method void ValueAnimator.cancel()>
		//    3    7:return          
		}

		public void onAnimationCancel(Animator animator)
		{
			setFraction(1.0F);
		//    0    0:aload_0         
		//    1    1:fconst_1        
		//    2    2:invokevirtual   #86  <Method void setFraction(float)>
		//    3    5:return          
		}

		public void onAnimationEnd(Animator animator)
		{
			if(!mEnded)
		//*   0    0:aload_0         
		//*   1    1:getfield        #39  <Field boolean mEnded>
		//*   2    4:ifne            15
				mViewHolder.setIsRecyclable(true);
		//    3    7:aload_0         
		//    4    8:getfield        #45  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		//    5   11:iconst_1        
		//    6   12:invokevirtual   #97  <Method void android.support.v7.widget.RecyclerView$ViewHolder.setIsRecyclable(boolean)>
			mEnded = true;
		//    7   15:aload_0         
		//    8   16:iconst_1        
		//    9   17:putfield        #39  <Field boolean mEnded>
		//   10   20:return          
		}

		public void onAnimationRepeat(Animator animator)
		{
		//    0    0:return          
		}

		public void onAnimationStart(Animator animator)
		{
		//    0    0:return          
		}

		public void setDuration(long l)
		{
			mValueAnimator.setDuration(l);
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field ValueAnimator mValueAnimator>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #104 <Method ValueAnimator ValueAnimator.setDuration(long)>
		//    4    8:pop             
		//    5    9:return          
		}

		public void setFraction(float f)
		{
			mFraction = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #106 <Field float mFraction>
		//    3    5:return          
		}

		public void start()
		{
			mViewHolder.setIsRecyclable(false);
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #97  <Method void android.support.v7.widget.RecyclerView$ViewHolder.setIsRecyclable(boolean)>
			mValueAnimator.start();
		//    4    8:aload_0         
		//    5    9:getfield        #61  <Field ValueAnimator mValueAnimator>
		//    6   12:invokevirtual   #109 <Method void ValueAnimator.start()>
		//    7   15:return          
		}

		public void update()
		{
			if(mStartDx == mTargetX)
		//*   0    0:aload_0         
		//*   1    1:getfield        #47  <Field float mStartDx>
		//*   2    4:aload_0         
		//*   3    5:getfield        #51  <Field float mTargetX>
		//*   4    8:fcmpl           
		//*   5    9:ifne            53
				mX = mViewHolder.itemView.getTranslationX();
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #45  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		//    9   17:getfield        #74  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   10   20:invokevirtual   #116 <Method float View.getTranslationX()>
		//   11   23:putfield        #118 <Field float mX>
			else
		//*  12   26:aload_0         
		//*  13   27:getfield        #49  <Field float mStartDy>
		//*  14   30:aload_0         
		//*  15   31:getfield        #53  <Field float mTargetY>
		//*  16   34:fcmpl           
		//*  17   35:ifne            79
		//*  18   38:aload_0         
		//*  19   39:aload_0         
		//*  20   40:getfield        #45  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		//*  21   43:getfield        #74  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  22   46:invokevirtual   #121 <Method float View.getTranslationY()>
		//*  23   49:putfield        #123 <Field float mY>
		//*  24   52:return          
				mX = mStartDx + mFraction * (mTargetX - mStartDx);
		//   25   53:aload_0         
		//   26   54:aload_0         
		//   27   55:getfield        #47  <Field float mStartDx>
		//   28   58:aload_0         
		//   29   59:getfield        #106 <Field float mFraction>
		//   30   62:aload_0         
		//   31   63:getfield        #51  <Field float mTargetX>
		//   32   66:aload_0         
		//   33   67:getfield        #47  <Field float mStartDx>
		//   34   70:fsub            
		//   35   71:fmul            
		//   36   72:fadd            
		//   37   73:putfield        #118 <Field float mX>
			if(mStartDy == mTargetY)
			{
				mY = mViewHolder.itemView.getTranslationY();
				return;
			} else
		//*  38   76:goto            26
			{
				mY = mStartDy + mFraction * (mTargetY - mStartDy);
		//   39   79:aload_0         
		//   40   80:aload_0         
		//   41   81:getfield        #49  <Field float mStartDy>
		//   42   84:aload_0         
		//   43   85:getfield        #106 <Field float mFraction>
		//   44   88:aload_0         
		//   45   89:getfield        #53  <Field float mTargetY>
		//   46   92:aload_0         
		//   47   93:getfield        #49  <Field float mStartDy>
		//   48   96:fsub            
		//   49   97:fmul            
		//   50   98:fadd            
		//   51   99:putfield        #123 <Field float mY>
				return;
		//   52  102:return          
			}
		}

		final int mActionState;
		final int mAnimationType;
		boolean mEnded;
		private float mFraction;
		public boolean mIsPendingCleanup;
		boolean mOverridden;
		final float mStartDx;
		final float mStartDy;
		final float mTargetX;
		final float mTargetY;
		private final ValueAnimator mValueAnimator = ValueAnimator.ofFloat(new float[] {
			0.0F, 1.0F
		});
		final android.support.v7.widget.RecyclerView.ViewHolder mViewHolder;
		float mX;
		float mY;

		RecoverAnimation(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i, int j, float f, float f1, float f2, float f3)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
			mOverridden = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #37  <Field boolean mOverridden>
			mEnded = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #39  <Field boolean mEnded>
			mActionState = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #41  <Field int mActionState>
			mAnimationType = i;
		//   11   19:aload_0         
		//   12   20:iload_2         
		//   13   21:putfield        #43  <Field int mAnimationType>
			mViewHolder = viewholder;
		//   14   24:aload_0         
		//   15   25:aload_1         
		//   16   26:putfield        #45  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
			mStartDx = f;
		//   17   29:aload_0         
		//   18   30:fload           4
		//   19   32:putfield        #47  <Field float mStartDx>
			mStartDy = f1;
		//   20   35:aload_0         
		//   21   36:fload           5
		//   22   38:putfield        #49  <Field float mStartDy>
			mTargetX = f2;
		//   23   41:aload_0         
		//   24   42:fload           6
		//   25   44:putfield        #51  <Field float mTargetX>
			mTargetY = f3;
		//   26   47:aload_0         
		//   27   48:fload           7
		//   28   50:putfield        #53  <Field float mTargetY>
		//   29   53:aload_0         
		//   30   54:iconst_2        
		//   31   55:newarray        float[]
		//   32   57:dup             
		//   33   58:iconst_0        
		//   34   59:fconst_0        
		//   35   60:fastore         
		//   36   61:dup             
		//   37   62:iconst_1        
		//   38   63:fconst_1        
		//   39   64:fastore         
		//   40   65:invokestatic    #59  <Method ValueAnimator ValueAnimator.ofFloat(float[])>
		//   41   68:putfield        #61  <Field ValueAnimator mValueAnimator>
			mValueAnimator.addUpdateListener(new _cls1());
		//   42   71:aload_0         
		//   43   72:getfield        #61  <Field ValueAnimator mValueAnimator>
		//   44   75:new             #11  <Class ItemTouchHelper$RecoverAnimation$1>
		//   45   78:dup             
		//   46   79:aload_0         
		//   47   80:invokespecial   #64  <Method void ItemTouchHelper$RecoverAnimation$1(ItemTouchHelper$RecoverAnimation)>
		//   48   83:invokevirtual   #68  <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			mValueAnimator.setTarget(((Object) (viewholder.itemView)));
		//   49   86:aload_0         
		//   50   87:getfield        #61  <Field ValueAnimator mValueAnimator>
		//   51   90:aload_1         
		//   52   91:getfield        #74  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   53   94:invokevirtual   #78  <Method void ValueAnimator.setTarget(Object)>
			mValueAnimator.addListener(((android.animation.Animator.AnimatorListener) (this)));
		//   54   97:aload_0         
		//   55   98:getfield        #61  <Field ValueAnimator mValueAnimator>
		//   56  101:aload_0         
		//   57  102:invokevirtual   #82  <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
			setFraction(0.0F);
		//   58  105:aload_0         
		//   59  106:fconst_0        
		//   60  107:invokevirtual   #86  <Method void setFraction(float)>
		//   61  110:return          
		}
	}

	public static abstract class SimpleCallback extends Callback
	{

		public int getDragDirs(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			return mDefaultDragDirs;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int mDefaultDragDirs>
		//    2    4:ireturn         
		}

		public int getMovementFlags(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			return makeMovementFlags(getDragDirs(recyclerview, viewholder), getSwipeDirs(recyclerview, viewholder));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #25  <Method int getDragDirs(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokevirtual   #28  <Method int getSwipeDirs(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		//    8   12:invokestatic    #32  <Method int makeMovementFlags(int, int)>
		//    9   15:ireturn         
		}

		public int getSwipeDirs(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			return mDefaultSwipeDirs;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field int mDefaultSwipeDirs>
		//    2    4:ireturn         
		}

		public void setDefaultDragDirs(int i)
		{
			mDefaultDragDirs = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #19  <Field int mDefaultDragDirs>
		//    3    5:return          
		}

		public void setDefaultSwipeDirs(int i)
		{
			mDefaultSwipeDirs = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #17  <Field int mDefaultSwipeDirs>
		//    3    5:return          
		}

		private int mDefaultDragDirs;
		private int mDefaultSwipeDirs;

		public SimpleCallback(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void ItemTouchHelper$Callback()>
			mDefaultSwipeDirs = j;
		//    2    4:aload_0         
		//    3    5:iload_2         
		//    4    6:putfield        #17  <Field int mDefaultSwipeDirs>
			mDefaultDragDirs = i;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #19  <Field int mDefaultDragDirs>
		//    8   14:return          
		}
	}

	public static interface ViewDropHandler
	{

		public abstract void prepareForDrop(View view, View view1, int i, int j);
	}


	public ItemTouchHelper(Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #126 <Method void android.support.v7.widget.RecyclerView$ItemDecoration()>
	//    2    4:aload_0         
	//    3    5:new             #128 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #129 <Method void ArrayList()>
	//    6   12:putfield        #131 <Field List mPendingCleanup>
	//    7   15:aload_0         
	//    8   16:iconst_2        
	//    9   17:newarray        float[]
	//   10   19:putfield        #133 <Field float[] mTmpPosition>
		mSelected = null;
	//   11   22:aload_0         
	//   12   23:aconst_null     
	//   13   24:putfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
		mActivePointerId = -1;
	//   14   27:aload_0         
	//   15   28:iconst_m1       
	//   16   29:putfield        #137 <Field int mActivePointerId>
		mActionState = 0;
	//   17   32:aload_0         
	//   18   33:iconst_0        
	//   19   34:putfield        #139 <Field int mActionState>
		mRecoverAnimations = ((List) (new ArrayList()));
	//   20   37:aload_0         
	//   21   38:new             #128 <Class ArrayList>
	//   22   41:dup             
	//   23   42:invokespecial   #129 <Method void ArrayList()>
	//   24   45:putfield        #141 <Field List mRecoverAnimations>
	//   25   48:aload_0         
	//   26   49:new             #8   <Class ItemTouchHelper$1>
	//   27   52:dup             
	//   28   53:aload_0         
	//   29   54:invokespecial   #144 <Method void ItemTouchHelper$1(ItemTouchHelper)>
	//   30   57:putfield        #146 <Field Runnable mScrollRunnable>
		mChildDrawingOrderCallback = null;
	//   31   60:aload_0         
	//   32   61:aconst_null     
	//   33   62:putfield        #148 <Field android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback mChildDrawingOrderCallback>
		mOverdrawChild = null;
	//   34   65:aload_0         
	//   35   66:aconst_null     
	//   36   67:putfield        #150 <Field View mOverdrawChild>
		mOverdrawChildPosition = -1;
	//   37   70:aload_0         
	//   38   71:iconst_m1       
	//   39   72:putfield        #152 <Field int mOverdrawChildPosition>
	//   40   75:aload_0         
	//   41   76:new             #10  <Class ItemTouchHelper$2>
	//   42   79:dup             
	//   43   80:aload_0         
	//   44   81:invokespecial   #153 <Method void ItemTouchHelper$2(ItemTouchHelper)>
	//   45   84:putfield        #155 <Field android.support.v7.widget.RecyclerView$OnItemTouchListener mOnItemTouchListener>
		mCallback = callback;
	//   46   87:aload_0         
	//   47   88:aload_1         
	//   48   89:putfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   49   92:return          
	}

	private void addChildDrawingOrderCallback()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #164 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          9
			return;
	//    3    8:return          
		if(mChildDrawingOrderCallback == null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #148 <Field android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback mChildDrawingOrderCallback>
	//*   6   13:ifnonnull       28
			mChildDrawingOrderCallback = new android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback() {

				public int onGetChildDrawingOrder(int i, int j)
				{
					if(mOverdrawChild != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field ItemTouchHelper this$0>
				//*   2    4:getfield        #26  <Field View ItemTouchHelper.mOverdrawChild>
				//*   3    7:ifnonnull       12
				//*   4   10:iload_2         
				//*   5   11:ireturn         
					{
						int l = mOverdrawChildPosition;
				//    6   12:aload_0         
				//    7   13:getfield        #17  <Field ItemTouchHelper this$0>
				//    8   16:getfield        #30  <Field int ItemTouchHelper.mOverdrawChildPosition>
				//    9   19:istore          4
						int k = l;
				//   10   21:iload           4
				//   11   23:istore_3        
						if(l == -1)
				//*  12   24:iload           4
				//*  13   26:iconst_m1       
				//*  14   27:icmpne          56
						{
							k = mRecyclerView.indexOfChild(mOverdrawChild);
				//   15   30:aload_0         
				//   16   31:getfield        #17  <Field ItemTouchHelper this$0>
				//   17   34:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
				//   18   37:aload_0         
				//   19   38:getfield        #17  <Field ItemTouchHelper this$0>
				//   20   41:getfield        #26  <Field View ItemTouchHelper.mOverdrawChild>
				//   21   44:invokevirtual   #40  <Method int RecyclerView.indexOfChild(View)>
				//   22   47:istore_3        
							mOverdrawChildPosition = k;
				//   23   48:aload_0         
				//   24   49:getfield        #17  <Field ItemTouchHelper this$0>
				//   25   52:iload_3         
				//   26   53:putfield        #30  <Field int ItemTouchHelper.mOverdrawChildPosition>
						}
						if(j == i - 1)
				//*  27   56:iload_2         
				//*  28   57:iload_1         
				//*  29   58:iconst_1        
				//*  30   59:isub            
				//*  31   60:icmpne          65
							return k;
				//   32   63:iload_3         
				//   33   64:ireturn         
						if(j >= k)
				//*  34   65:iload_2         
				//*  35   66:iload_3         
				//*  36   67:icmplt          10
							return j + 1;
				//   37   70:iload_2         
				//   38   71:iconst_1        
				//   39   72:iadd            
				//   40   73:ireturn         
					}
					return j;
				}

				final ItemTouchHelper this$0;

			
			{
				this$0 = ItemTouchHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ItemTouchHelper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//    7   16:aload_0         
	//    8   17:new             #16  <Class ItemTouchHelper$5>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:invokespecial   #165 <Method void ItemTouchHelper$5(ItemTouchHelper)>
	//   12   25:putfield        #148 <Field android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback mChildDrawingOrderCallback>
		mRecyclerView.setChildDrawingOrderCallback(mChildDrawingOrderCallback);
	//   13   28:aload_0         
	//   14   29:getfield        #167 <Field RecyclerView mRecyclerView>
	//   15   32:aload_0         
	//   16   33:getfield        #148 <Field android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback mChildDrawingOrderCallback>
	//   17   36:invokevirtual   #173 <Method void RecyclerView.setChildDrawingOrderCallback(android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback)>
	//   18   39:return          
	}

	private int checkHorizontalSwipe(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		byte byte1 = 8;
	//    0    0:bipush          8
	//    1    2:istore          6
		if((i & 0xc) != 0)
	//*   2    4:iload_2         
	//*   3    5:bipush          12
	//*   4    7:iand            
	//*   5    8:ifeq            199
		{
			byte byte0;
			if(mDx > 0.0F)
	//*   6   11:aload_0         
	//*   7   12:getfield        #177 <Field float mDx>
	//*   8   15:fconst_0        
	//*   9   16:fcmpl           
	//*  10   17:ifle            143
				byte0 = 8;
	//   11   20:bipush          8
	//   12   22:istore          5
			else
	//*  13   24:aload_0         
	//*  14   25:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//*  15   28:ifnull          155
	//*  16   31:aload_0         
	//*  17   32:getfield        #137 <Field int mActivePointerId>
	//*  18   35:iconst_m1       
	//*  19   36:icmple          155
	//*  20   39:aload_0         
	//*  21   40:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//*  22   43:sipush          1000
	//*  23   46:aload_0         
	//*  24   47:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*  25   50:aload_0         
	//*  26   51:getfield        #181 <Field float mMaxSwipeVelocity>
	//*  27   54:invokevirtual   #185 <Method float ItemTouchHelper$Callback.getSwipeVelocityThreshold(float)>
	//*  28   57:invokevirtual   #191 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
	//*  29   60:aload_0         
	//*  30   61:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//*  31   64:aload_0         
	//*  32   65:getfield        #137 <Field int mActivePointerId>
	//*  33   68:invokevirtual   #195 <Method float VelocityTracker.getXVelocity(int)>
	//*  34   71:fstore          4
	//*  35   73:aload_0         
	//*  36   74:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//*  37   77:aload_0         
	//*  38   78:getfield        #137 <Field int mActivePointerId>
	//*  39   81:invokevirtual   #198 <Method float VelocityTracker.getYVelocity(int)>
	//*  40   84:fstore_3        
	//*  41   85:fload           4
	//*  42   87:fconst_0        
	//*  43   88:fcmpl           
	//*  44   89:ifle            149
	//*  45   92:fload           4
	//*  46   94:invokestatic    #203 <Method float Math.abs(float)>
	//*  47   97:fstore          4
	//*  48   99:iload           6
	//*  49  101:iload_2         
	//*  50  102:iand            
	//*  51  103:ifeq            155
	//*  52  106:iload           5
	//*  53  108:iload           6
	//*  54  110:icmpne          155
	//*  55  113:fload           4
	//*  56  115:aload_0         
	//*  57  116:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*  58  119:aload_0         
	//*  59  120:getfield        #205 <Field float mSwipeEscapeVelocity>
	//*  60  123:invokevirtual   #208 <Method float ItemTouchHelper$Callback.getSwipeEscapeVelocity(float)>
	//*  61  126:fcmpl           
	//*  62  127:iflt            155
	//*  63  130:fload           4
	//*  64  132:fload_3         
	//*  65  133:invokestatic    #203 <Method float Math.abs(float)>
	//*  66  136:fcmpl           
	//*  67  137:ifle            155
	//*  68  140:iload           6
	//*  69  142:ireturn         
				byte0 = 4;
	//   70  143:iconst_4        
	//   71  144:istore          5
			if(mVelocityTracker != null && mActivePointerId > -1)
			{
				mVelocityTracker.computeCurrentVelocity(1000, mCallback.getSwipeVelocityThreshold(mMaxSwipeVelocity));
				float f2 = mVelocityTracker.getXVelocity(mActivePointerId);
				float f = mVelocityTracker.getYVelocity(mActivePointerId);
				if(f2 <= 0.0F)
	//*  72  146:goto            24
					byte1 = 4;
	//   73  149:iconst_4        
	//   74  150:istore          6
				f2 = Math.abs(f2);
				if((byte1 & i) != 0 && byte0 == byte1 && f2 >= mCallback.getSwipeEscapeVelocity(mSwipeEscapeVelocity) && f2 > Math.abs(f))
					return ((int) (byte1));
			}
	//*  75  152:goto            92
			float f1 = mRecyclerView.getWidth();
	//   76  155:aload_0         
	//   77  156:getfield        #167 <Field RecyclerView mRecyclerView>
	//   78  159:invokevirtual   #212 <Method int RecyclerView.getWidth()>
	//   79  162:i2f             
	//   80  163:fstore_3        
			float f3 = mCallback.getSwipeThreshold(viewholder);
	//   81  164:aload_0         
	//   82  165:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   83  168:aload_1         
	//   84  169:invokevirtual   #216 <Method float ItemTouchHelper$Callback.getSwipeThreshold(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   85  172:fstore          4
			if((i & byte0) != 0 && Math.abs(mDx) > f1 * f3)
	//*  86  174:iload_2         
	//*  87  175:iload           5
	//*  88  177:iand            
	//*  89  178:ifeq            199
	//*  90  181:aload_0         
	//*  91  182:getfield        #177 <Field float mDx>
	//*  92  185:invokestatic    #203 <Method float Math.abs(float)>
	//*  93  188:fload_3         
	//*  94  189:fload           4
	//*  95  191:fmul            
	//*  96  192:fcmpl           
	//*  97  193:ifle            199
				return ((int) (byte0));
	//   98  196:iload           5
	//   99  198:ireturn         
		}
		return 0;
	//  100  199:iconst_0        
	//  101  200:ireturn         
	}

	private int checkVerticalSwipe(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		byte byte1 = 2;
	//    0    0:iconst_2        
	//    1    1:istore          6
		if((i & 3) != 0)
	//*   2    3:iload_2         
	//*   3    4:iconst_3        
	//*   4    5:iand            
	//*   5    6:ifeq            196
		{
			byte byte0;
			if(mDy > 0.0F)
	//*   6    9:aload_0         
	//*   7   10:getfield        #219 <Field float mDy>
	//*   8   13:fconst_0        
	//*   9   14:fcmpl           
	//*  10   15:ifle            140
				byte0 = 2;
	//   11   18:iconst_2        
	//   12   19:istore          5
			else
	//*  13   21:aload_0         
	//*  14   22:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//*  15   25:ifnull          152
	//*  16   28:aload_0         
	//*  17   29:getfield        #137 <Field int mActivePointerId>
	//*  18   32:iconst_m1       
	//*  19   33:icmple          152
	//*  20   36:aload_0         
	//*  21   37:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//*  22   40:sipush          1000
	//*  23   43:aload_0         
	//*  24   44:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*  25   47:aload_0         
	//*  26   48:getfield        #181 <Field float mMaxSwipeVelocity>
	//*  27   51:invokevirtual   #185 <Method float ItemTouchHelper$Callback.getSwipeVelocityThreshold(float)>
	//*  28   54:invokevirtual   #191 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
	//*  29   57:aload_0         
	//*  30   58:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//*  31   61:aload_0         
	//*  32   62:getfield        #137 <Field int mActivePointerId>
	//*  33   65:invokevirtual   #195 <Method float VelocityTracker.getXVelocity(int)>
	//*  34   68:fstore_3        
	//*  35   69:aload_0         
	//*  36   70:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//*  37   73:aload_0         
	//*  38   74:getfield        #137 <Field int mActivePointerId>
	//*  39   77:invokevirtual   #198 <Method float VelocityTracker.getYVelocity(int)>
	//*  40   80:fstore          4
	//*  41   82:fload           4
	//*  42   84:fconst_0        
	//*  43   85:fcmpl           
	//*  44   86:ifle            146
	//*  45   89:fload           4
	//*  46   91:invokestatic    #203 <Method float Math.abs(float)>
	//*  47   94:fstore          4
	//*  48   96:iload           6
	//*  49   98:iload_2         
	//*  50   99:iand            
	//*  51  100:ifeq            152
	//*  52  103:iload           6
	//*  53  105:iload           5
	//*  54  107:icmpne          152
	//*  55  110:fload           4
	//*  56  112:aload_0         
	//*  57  113:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*  58  116:aload_0         
	//*  59  117:getfield        #205 <Field float mSwipeEscapeVelocity>
	//*  60  120:invokevirtual   #208 <Method float ItemTouchHelper$Callback.getSwipeEscapeVelocity(float)>
	//*  61  123:fcmpl           
	//*  62  124:iflt            152
	//*  63  127:fload           4
	//*  64  129:fload_3         
	//*  65  130:invokestatic    #203 <Method float Math.abs(float)>
	//*  66  133:fcmpl           
	//*  67  134:ifle            152
	//*  68  137:iload           6
	//*  69  139:ireturn         
				byte0 = 1;
	//   70  140:iconst_1        
	//   71  141:istore          5
			if(mVelocityTracker != null && mActivePointerId > -1)
			{
				mVelocityTracker.computeCurrentVelocity(1000, mCallback.getSwipeVelocityThreshold(mMaxSwipeVelocity));
				float f = mVelocityTracker.getXVelocity(mActivePointerId);
				float f2 = mVelocityTracker.getYVelocity(mActivePointerId);
				if(f2 <= 0.0F)
	//*  72  143:goto            21
					byte1 = 1;
	//   73  146:iconst_1        
	//   74  147:istore          6
				f2 = Math.abs(f2);
				if((byte1 & i) != 0 && byte1 == byte0 && f2 >= mCallback.getSwipeEscapeVelocity(mSwipeEscapeVelocity) && f2 > Math.abs(f))
					return ((int) (byte1));
			}
	//*  75  149:goto            89
			float f1 = mRecyclerView.getHeight();
	//   76  152:aload_0         
	//   77  153:getfield        #167 <Field RecyclerView mRecyclerView>
	//   78  156:invokevirtual   #222 <Method int RecyclerView.getHeight()>
	//   79  159:i2f             
	//   80  160:fstore_3        
			float f3 = mCallback.getSwipeThreshold(viewholder);
	//   81  161:aload_0         
	//   82  162:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   83  165:aload_1         
	//   84  166:invokevirtual   #216 <Method float ItemTouchHelper$Callback.getSwipeThreshold(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   85  169:fstore          4
			if((i & byte0) != 0 && Math.abs(mDy) > f1 * f3)
	//*  86  171:iload_2         
	//*  87  172:iload           5
	//*  88  174:iand            
	//*  89  175:ifeq            196
	//*  90  178:aload_0         
	//*  91  179:getfield        #219 <Field float mDy>
	//*  92  182:invokestatic    #203 <Method float Math.abs(float)>
	//*  93  185:fload_3         
	//*  94  186:fload           4
	//*  95  188:fmul            
	//*  96  189:fcmpl           
	//*  97  190:ifle            196
				return ((int) (byte0));
	//   98  193:iload           5
	//   99  195:ireturn         
		}
		return 0;
	//  100  196:iconst_0        
	//  101  197:ireturn         
	}

	private void destroyCallbacks()
	{
		mRecyclerView.removeItemDecoration(((android.support.v7.widget.RecyclerView.ItemDecoration) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field RecyclerView mRecyclerView>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #227 <Method void RecyclerView.removeItemDecoration(android.support.v7.widget.RecyclerView$ItemDecoration)>
		mRecyclerView.removeOnItemTouchListener(mOnItemTouchListener);
	//    4    8:aload_0         
	//    5    9:getfield        #167 <Field RecyclerView mRecyclerView>
	//    6   12:aload_0         
	//    7   13:getfield        #155 <Field android.support.v7.widget.RecyclerView$OnItemTouchListener mOnItemTouchListener>
	//    8   16:invokevirtual   #231 <Method void RecyclerView.removeOnItemTouchListener(android.support.v7.widget.RecyclerView$OnItemTouchListener)>
		mRecyclerView.removeOnChildAttachStateChangeListener(((android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener) (this)));
	//    9   19:aload_0         
	//   10   20:getfield        #167 <Field RecyclerView mRecyclerView>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #235 <Method void RecyclerView.removeOnChildAttachStateChangeListener(android.support.v7.widget.RecyclerView$OnChildAttachStateChangeListener)>
		for(int i = mRecoverAnimations.size() - 1; i >= 0; i--)
	//*  13   27:aload_0         
	//*  14   28:getfield        #141 <Field List mRecoverAnimations>
	//*  15   31:invokeinterface #240 <Method int List.size()>
	//*  16   36:iconst_1        
	//*  17   37:isub            
	//*  18   38:istore_1        
	//*  19   39:iload_1         
	//*  20   40:iflt            79
		{
			RecoverAnimation recoveranimation = (RecoverAnimation)mRecoverAnimations.get(0);
	//   21   43:aload_0         
	//   22   44:getfield        #141 <Field List mRecoverAnimations>
	//   23   47:iconst_0        
	//   24   48:invokeinterface #244 <Method Object List.get(int)>
	//   25   53:checkcast       #28  <Class ItemTouchHelper$RecoverAnimation>
	//   26   56:astore_2        
			mCallback.clearView(mRecyclerView, recoveranimation.mViewHolder);
	//   27   57:aload_0         
	//   28   58:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   29   61:aload_0         
	//   30   62:getfield        #167 <Field RecyclerView mRecyclerView>
	//   31   65:aload_2         
	//   32   66:getfield        #247 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   33   69:invokevirtual   #251 <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		}

	//   34   72:iload_1         
	//   35   73:iconst_1        
	//   36   74:isub            
	//   37   75:istore_1        
	//*  38   76:goto            39
		mRecoverAnimations.clear();
	//   39   79:aload_0         
	//   40   80:getfield        #141 <Field List mRecoverAnimations>
	//   41   83:invokeinterface #254 <Method void List.clear()>
		mOverdrawChild = null;
	//   42   88:aload_0         
	//   43   89:aconst_null     
	//   44   90:putfield        #150 <Field View mOverdrawChild>
		mOverdrawChildPosition = -1;
	//   45   93:aload_0         
	//   46   94:iconst_m1       
	//   47   95:putfield        #152 <Field int mOverdrawChildPosition>
		releaseVelocityTracker();
	//   48   98:aload_0         
	//   49   99:invokespecial   #257 <Method void releaseVelocityTracker()>
	//   50  102:return          
	}

	private List findSwapTargets(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		int j2;
		View view;
		int i;
		int k2;
		android.support.v7.widget.RecyclerView.LayoutManager layoutmanager;
		if(mSwapTargets == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #261 <Field List mSwapTargets>
	//*   2    4:ifnonnull       167
		{
			mSwapTargets = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #128 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #129 <Method void ArrayList()>
	//    7   15:putfield        #261 <Field List mSwapTargets>
			mDistances = ((List) (new ArrayList()));
	//    8   18:aload_0         
	//    9   19:new             #128 <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #129 <Method void ArrayList()>
	//   12   26:putfield        #263 <Field List mDistances>
		} else
	//*  13   29:aload_0         
	//*  14   30:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*  15   33:invokevirtual   #266 <Method int ItemTouchHelper$Callback.getBoundingBoxMargin()>
	//*  16   36:istore_2        
	//*  17   37:aload_0         
	//*  18   38:getfield        #268 <Field float mSelectedStartX>
	//*  19   41:aload_0         
	//*  20   42:getfield        #177 <Field float mDx>
	//*  21   45:fadd            
	//*  22   46:invokestatic    #272 <Method int Math.round(float)>
	//*  23   49:iload_2         
	//*  24   50:isub            
	//*  25   51:istore          5
	//*  26   53:aload_0         
	//*  27   54:getfield        #274 <Field float mSelectedStartY>
	//*  28   57:aload_0         
	//*  29   58:getfield        #219 <Field float mDy>
	//*  30   61:fadd            
	//*  31   62:invokestatic    #272 <Method int Math.round(float)>
	//*  32   65:iload_2         
	//*  33   66:isub            
	//*  34   67:istore          6
	//*  35   69:aload_1         
	//*  36   70:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  37   73:invokevirtual   #282 <Method int View.getWidth()>
	//*  38   76:iload           5
	//*  39   78:iadd            
	//*  40   79:iload_2         
	//*  41   80:iconst_2        
	//*  42   81:imul            
	//*  43   82:iadd            
	//*  44   83:istore          7
	//*  45   85:aload_1         
	//*  46   86:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  47   89:invokevirtual   #283 <Method int View.getHeight()>
	//*  48   92:iload           6
	//*  49   94:iadd            
	//*  50   95:iload_2         
	//*  51   96:iconst_2        
	//*  52   97:imul            
	//*  53   98:iadd            
	//*  54   99:istore          8
	//*  55  101:iload           5
	//*  56  103:iload           7
	//*  57  105:iadd            
	//*  58  106:iconst_2        
	//*  59  107:idiv            
	//*  60  108:istore          9
	//*  61  110:iload           6
	//*  62  112:iload           8
	//*  63  114:iadd            
	//*  64  115:iconst_2        
	//*  65  116:idiv            
	//*  66  117:istore          10
	//*  67  119:aload_0         
	//*  68  120:getfield        #167 <Field RecyclerView mRecyclerView>
	//*  69  123:invokevirtual   #287 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//*  70  126:astore          14
	//*  71  128:aload           14
	//*  72  130:invokevirtual   #292 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getChildCount()>
	//*  73  133:istore          11
	//*  74  135:iconst_0        
	//*  75  136:istore_2        
	//*  76  137:iload_2         
	//*  77  138:iload           11
	//*  78  140:icmpge          403
	//*  79  143:aload           14
	//*  80  145:iload_2         
	//*  81  146:invokevirtual   #296 <Method View android.support.v7.widget.RecyclerView$LayoutManager.getChildAt(int)>
	//*  82  149:astore          15
	//*  83  151:aload           15
	//*  84  153:aload_1         
	//*  85  154:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  86  157:if_acmpne       188
	//*  87  160:iload_2         
	//*  88  161:iconst_1        
	//*  89  162:iadd            
	//*  90  163:istore_2        
	//*  91  164:goto            137
		{
			mSwapTargets.clear();
	//   92  167:aload_0         
	//   93  168:getfield        #261 <Field List mSwapTargets>
	//   94  171:invokeinterface #254 <Method void List.clear()>
			mDistances.clear();
	//   95  176:aload_0         
	//   96  177:getfield        #263 <Field List mDistances>
	//   97  180:invokeinterface #254 <Method void List.clear()>
		}
		i = mCallback.getBoundingBoxMargin();
		i1 = Math.round(mSelectedStartX + mDx) - i;
		j1 = Math.round(mSelectedStartY + mDy) - i;
		k1 = viewholder.itemView.getWidth() + i1 + i * 2;
		l1 = viewholder.itemView.getHeight() + j1 + i * 2;
		i2 = (i1 + k1) / 2;
		j2 = (j1 + l1) / 2;
		layoutmanager = mRecyclerView.getLayoutManager();
		k2 = layoutmanager.getChildCount();
		i = 0;
		if(i >= k2)
			break; /* Loop/switch isn't completed */
		view = layoutmanager.getChildAt(i);
		if(view != viewholder.itemView && view.getBottom() >= j1 && view.getTop() <= l1 && view.getRight() >= i1 && view.getLeft() <= k1)
	//*  98  185:goto            29
	//*  99  188:aload           15
	//* 100  190:invokevirtual   #299 <Method int View.getBottom()>
	//* 101  193:iload           6
	//* 102  195:icmplt          160
	//* 103  198:aload           15
	//* 104  200:invokevirtual   #302 <Method int View.getTop()>
	//* 105  203:iload           8
	//* 106  205:icmpgt          160
	//* 107  208:aload           15
	//* 108  210:invokevirtual   #305 <Method int View.getRight()>
	//* 109  213:iload           5
	//* 110  215:icmplt          160
	//* 111  218:aload           15
	//* 112  220:invokevirtual   #308 <Method int View.getLeft()>
	//* 113  223:iload           7
	//* 114  225:icmpgt          160
		{
			android.support.v7.widget.RecyclerView.ViewHolder viewholder1 = mRecyclerView.getChildViewHolder(view);
	//  115  228:aload_0         
	//  116  229:getfield        #167 <Field RecyclerView mRecyclerView>
	//  117  232:aload           15
	//  118  234:invokevirtual   #312 <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//  119  237:astore          16
			if(mCallback.canDropOver(mRecyclerView, mSelected, viewholder1))
	//* 120  239:aload_0         
	//* 121  240:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//* 122  243:aload_0         
	//* 123  244:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 124  247:aload_0         
	//* 125  248:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//* 126  251:aload           16
	//* 127  253:invokevirtual   #316 <Method boolean ItemTouchHelper$Callback.canDropOver(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, android.support.v7.widget.RecyclerView$ViewHolder)>
	//* 128  256:ifeq            160
			{
				int j = Math.abs(i2 - (view.getLeft() + view.getRight()) / 2);
	//  129  259:iload           9
	//  130  261:aload           15
	//  131  263:invokevirtual   #308 <Method int View.getLeft()>
	//  132  266:aload           15
	//  133  268:invokevirtual   #305 <Method int View.getRight()>
	//  134  271:iadd            
	//  135  272:iconst_2        
	//  136  273:idiv            
	//  137  274:isub            
	//  138  275:invokestatic    #319 <Method int Math.abs(int)>
	//  139  278:istore_3        
				int l = view.getTop();
	//  140  279:aload           15
	//  141  281:invokevirtual   #302 <Method int View.getTop()>
	//  142  284:istore          4
				l = Math.abs(j2 - (view.getBottom() + l) / 2);
	//  143  286:iload           10
	//  144  288:aload           15
	//  145  290:invokevirtual   #299 <Method int View.getBottom()>
	//  146  293:iload           4
	//  147  295:iadd            
	//  148  296:iconst_2        
	//  149  297:idiv            
	//  150  298:isub            
	//  151  299:invokestatic    #319 <Method int Math.abs(int)>
	//  152  302:istore          4
				int l2 = j * j + l * l;
	//  153  304:iload_3         
	//  154  305:iload_3         
	//  155  306:imul            
	//  156  307:iload           4
	//  157  309:iload           4
	//  158  311:imul            
	//  159  312:iadd            
	//  160  313:istore          12
				int i3 = mSwapTargets.size();
	//  161  315:aload_0         
	//  162  316:getfield        #261 <Field List mSwapTargets>
	//  163  319:invokeinterface #240 <Method int List.size()>
	//  164  324:istore          13
				l = 0;
	//  165  326:iconst_0        
	//  166  327:istore          4
				for(int k = 0; k < i3 && l2 > ((Integer)mDistances.get(k)).intValue(); k++)
	//* 167  329:iconst_0        
	//* 168  330:istore_3        
	//* 169  331:iload_3         
	//* 170  332:iload           13
	//* 171  334:icmpge          371
	//* 172  337:iload           12
	//* 173  339:aload_0         
	//* 174  340:getfield        #263 <Field List mDistances>
	//* 175  343:iload_3         
	//* 176  344:invokeinterface #244 <Method Object List.get(int)>
	//* 177  349:checkcast       #321 <Class Integer>
	//* 178  352:invokevirtual   #324 <Method int Integer.intValue()>
	//* 179  355:icmple          371
					l++;
	//  180  358:iload           4
	//  181  360:iconst_1        
	//  182  361:iadd            
	//  183  362:istore          4

	//  184  364:iload_3         
	//  185  365:iconst_1        
	//  186  366:iadd            
	//  187  367:istore_3        
	//* 188  368:goto            331
				mSwapTargets.add(l, ((Object) (viewholder1)));
	//  189  371:aload_0         
	//  190  372:getfield        #261 <Field List mSwapTargets>
	//  191  375:iload           4
	//  192  377:aload           16
	//  193  379:invokeinterface #328 <Method void List.add(int, Object)>
				mDistances.add(l, ((Object) (Integer.valueOf(l2))));
	//  194  384:aload_0         
	//  195  385:getfield        #263 <Field List mDistances>
	//  196  388:iload           4
	//  197  390:iload           12
	//  198  392:invokestatic    #332 <Method Integer Integer.valueOf(int)>
	//  199  395:invokeinterface #328 <Method void List.add(int, Object)>
			}
		}
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_137;
	//* 200  400:goto            160
_L1:
		return mSwapTargets;
	//  201  403:aload_0         
	//  202  404:getfield        #261 <Field List mSwapTargets>
	//  203  407:areturn         
	}

	private android.support.v7.widget.RecyclerView.ViewHolder findSwipedView(MotionEvent motionevent)
	{
		android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = mRecyclerView.getLayoutManager();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field RecyclerView mRecyclerView>
	//    2    4:invokevirtual   #287 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//    3    7:astore          7
		if(mActivePointerId != -1)
	//*   4    9:aload_0         
	//*   5   10:getfield        #137 <Field int mActivePointerId>
	//*   6   13:iconst_m1       
	//*   7   14:icmpne          19
	//*   8   17:aconst_null     
	//*   9   18:areturn         
		{
			int i = motionevent.findPointerIndex(mActivePointerId);
	//   10   19:aload_1         
	//   11   20:aload_0         
	//   12   21:getfield        #137 <Field int mActivePointerId>
	//   13   24:invokevirtual   #341 <Method int MotionEvent.findPointerIndex(int)>
	//   14   27:istore          6
			float f2 = motionevent.getX(i);
	//   15   29:aload_1         
	//   16   30:iload           6
	//   17   32:invokevirtual   #344 <Method float MotionEvent.getX(int)>
	//   18   35:fstore          4
			float f3 = mInitialTouchX;
	//   19   37:aload_0         
	//   20   38:getfield        #346 <Field float mInitialTouchX>
	//   21   41:fstore          5
			float f = motionevent.getY(i);
	//   22   43:aload_1         
	//   23   44:iload           6
	//   24   46:invokevirtual   #349 <Method float MotionEvent.getY(int)>
	//   25   49:fstore_2        
			float f1 = mInitialTouchY;
	//   26   50:aload_0         
	//   27   51:getfield        #351 <Field float mInitialTouchY>
	//   28   54:fstore_3        
			f2 = Math.abs(f2 - f3);
	//   29   55:fload           4
	//   30   57:fload           5
	//   31   59:fsub            
	//   32   60:invokestatic    #203 <Method float Math.abs(float)>
	//   33   63:fstore          4
			f = Math.abs(f - f1);
	//   34   65:fload_2         
	//   35   66:fload_3         
	//   36   67:fsub            
	//   37   68:invokestatic    #203 <Method float Math.abs(float)>
	//   38   71:fstore_2        
			if((f2 >= (float)mSlop || f >= (float)mSlop) && (f2 <= f || !layoutmanager.canScrollHorizontally()) && (f <= f2 || !layoutmanager.canScrollVertically()))
	//*  39   72:fload           4
	//*  40   74:aload_0         
	//*  41   75:getfield        #353 <Field int mSlop>
	//*  42   78:i2f             
	//*  43   79:fcmpg           
	//*  44   80:ifge            93
	//*  45   83:fload_2         
	//*  46   84:aload_0         
	//*  47   85:getfield        #353 <Field int mSlop>
	//*  48   88:i2f             
	//*  49   89:fcmpg           
	//*  50   90:iflt            17
	//*  51   93:fload           4
	//*  52   95:fload_2         
	//*  53   96:fcmpl           
	//*  54   97:ifle            108
	//*  55  100:aload           7
	//*  56  102:invokevirtual   #357 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  57  105:ifne            17
	//*  58  108:fload_2         
	//*  59  109:fload           4
	//*  60  111:fcmpl           
	//*  61  112:ifle            123
	//*  62  115:aload           7
	//*  63  117:invokevirtual   #360 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollVertically()>
	//*  64  120:ifne            17
			{
				motionevent = ((MotionEvent) (findChildView(motionevent)));
	//   65  123:aload_0         
	//   66  124:aload_1         
	//   67  125:invokevirtual   #364 <Method View findChildView(MotionEvent)>
	//   68  128:astore_1        
				if(motionevent != null)
	//*  69  129:aload_1         
	//*  70  130:ifnull          17
					return mRecyclerView.getChildViewHolder(((View) (motionevent)));
	//   71  133:aload_0         
	//   72  134:getfield        #167 <Field RecyclerView mRecyclerView>
	//   73  137:aload_1         
	//   74  138:invokevirtual   #312 <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//   75  141:areturn         
			}
		}
		return null;
	}

	private void getSelectedDxDy(float af[])
	{
		if((mSelectedFlags & 0xc) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #368 <Field int mSelectedFlags>
	//*   2    4:bipush          12
	//*   3    6:iand            
	//*   4    7:ifeq            68
			af[0] = (mSelectedStartX + mDx) - (float)mSelected.itemView.getLeft();
	//    5   10:aload_1         
	//    6   11:iconst_0        
	//    7   12:aload_0         
	//    8   13:getfield        #268 <Field float mSelectedStartX>
	//    9   16:aload_0         
	//   10   17:getfield        #177 <Field float mDx>
	//   11   20:fadd            
	//   12   21:aload_0         
	//   13   22:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   14   25:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   15   28:invokevirtual   #308 <Method int View.getLeft()>
	//   16   31:i2f             
	//   17   32:fsub            
	//   18   33:fastore         
		else
	//*  19   34:aload_0         
	//*  20   35:getfield        #368 <Field int mSelectedFlags>
	//*  21   38:iconst_3        
	//*  22   39:iand            
	//*  23   40:ifeq            84
	//*  24   43:aload_1         
	//*  25   44:iconst_1        
	//*  26   45:aload_0         
	//*  27   46:getfield        #274 <Field float mSelectedStartY>
	//*  28   49:aload_0         
	//*  29   50:getfield        #219 <Field float mDy>
	//*  30   53:fadd            
	//*  31   54:aload_0         
	//*  32   55:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*  33   58:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  34   61:invokevirtual   #302 <Method int View.getTop()>
	//*  35   64:i2f             
	//*  36   65:fsub            
	//*  37   66:fastore         
	//*  38   67:return          
			af[0] = mSelected.itemView.getTranslationX();
	//   39   68:aload_1         
	//   40   69:iconst_0        
	//   41   70:aload_0         
	//   42   71:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   43   74:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   44   77:invokevirtual   #372 <Method float View.getTranslationX()>
	//   45   80:fastore         
		if((mSelectedFlags & 3) != 0)
		{
			af[1] = (mSelectedStartY + mDy) - (float)mSelected.itemView.getTop();
			return;
		} else
	//*  46   81:goto            34
		{
			af[1] = mSelected.itemView.getTranslationY();
	//   47   84:aload_1         
	//   48   85:iconst_1        
	//   49   86:aload_0         
	//   50   87:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   51   90:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   52   93:invokevirtual   #375 <Method float View.getTranslationY()>
	//   53   96:fastore         
			return;
	//   54   97:return          
		}
	}

	private static boolean hitTest(View view, float f, float f1, float f2, float f3)
	{
		return f >= f2 && f <= (float)view.getWidth() + f2 && f1 >= f3 && f1 <= (float)view.getHeight() + f3;
	//    0    0:fload_1         
	//    1    1:fload_3         
	//    2    2:fcmpl           
	//    3    3:iflt            40
	//    4    6:fload_1         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #282 <Method int View.getWidth()>
	//    7   11:i2f             
	//    8   12:fload_3         
	//    9   13:fadd            
	//   10   14:fcmpg           
	//   11   15:ifgt            40
	//   12   18:fload_2         
	//   13   19:fload           4
	//   14   21:fcmpl           
	//   15   22:iflt            40
	//   16   25:fload_2         
	//   17   26:aload_0         
	//   18   27:invokevirtual   #283 <Method int View.getHeight()>
	//   19   30:i2f             
	//   20   31:fload           4
	//   21   33:fadd            
	//   22   34:fcmpg           
	//   23   35:ifgt            40
	//   24   38:iconst_1        
	//   25   39:ireturn         
	//   26   40:iconst_0        
	//   27   41:ireturn         
	}

	private void initGestureDetector()
	{
		if(mGestureDetector != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #380 <Field GestureDetectorCompat mGestureDetector>
	//*   2    4:ifnull          8
		{
			return;
	//    3    7:return          
		} else
		{
			mGestureDetector = new GestureDetectorCompat(mRecyclerView.getContext(), ((android.view.GestureDetector.OnGestureListener) (new ItemTouchHelperGestureListener())));
	//    4    8:aload_0         
	//    5    9:new             #382 <Class GestureDetectorCompat>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #167 <Field RecyclerView mRecyclerView>
	//    9   17:invokevirtual   #386 <Method android.content.Context RecyclerView.getContext()>
	//   10   20:new             #25  <Class ItemTouchHelper$ItemTouchHelperGestureListener>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #387 <Method void ItemTouchHelper$ItemTouchHelperGestureListener(ItemTouchHelper)>
	//   14   28:invokespecial   #390 <Method void GestureDetectorCompat(android.content.Context, android.view.GestureDetector$OnGestureListener)>
	//   15   31:putfield        #380 <Field GestureDetectorCompat mGestureDetector>
			return;
	//   16   34:return          
		}
	}

	private void releaseVelocityTracker()
	{
		if(mVelocityTracker != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnull          19
		{
			mVelocityTracker.recycle();
	//    3    7:aload_0         
	//    4    8:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//    5   11:invokevirtual   #393 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #179 <Field VelocityTracker mVelocityTracker>
		}
	//    9   19:return          
	}

	private void setupCallbacks()
	{
		mSlop = ViewConfiguration.get(mRecyclerView.getContext()).getScaledTouchSlop();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #167 <Field RecyclerView mRecyclerView>
	//    3    5:invokevirtual   #386 <Method android.content.Context RecyclerView.getContext()>
	//    4    8:invokestatic    #399 <Method ViewConfiguration ViewConfiguration.get(android.content.Context)>
	//    5   11:invokevirtual   #402 <Method int ViewConfiguration.getScaledTouchSlop()>
	//    6   14:putfield        #353 <Field int mSlop>
		mRecyclerView.addItemDecoration(((android.support.v7.widget.RecyclerView.ItemDecoration) (this)));
	//    7   17:aload_0         
	//    8   18:getfield        #167 <Field RecyclerView mRecyclerView>
	//    9   21:aload_0         
	//   10   22:invokevirtual   #405 <Method void RecyclerView.addItemDecoration(android.support.v7.widget.RecyclerView$ItemDecoration)>
		mRecyclerView.addOnItemTouchListener(mOnItemTouchListener);
	//   11   25:aload_0         
	//   12   26:getfield        #167 <Field RecyclerView mRecyclerView>
	//   13   29:aload_0         
	//   14   30:getfield        #155 <Field android.support.v7.widget.RecyclerView$OnItemTouchListener mOnItemTouchListener>
	//   15   33:invokevirtual   #408 <Method void RecyclerView.addOnItemTouchListener(android.support.v7.widget.RecyclerView$OnItemTouchListener)>
		mRecyclerView.addOnChildAttachStateChangeListener(((android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener) (this)));
	//   16   36:aload_0         
	//   17   37:getfield        #167 <Field RecyclerView mRecyclerView>
	//   18   40:aload_0         
	//   19   41:invokevirtual   #411 <Method void RecyclerView.addOnChildAttachStateChangeListener(android.support.v7.widget.RecyclerView$OnChildAttachStateChangeListener)>
		initGestureDetector();
	//   20   44:aload_0         
	//   21   45:invokespecial   #413 <Method void initGestureDetector()>
	//   22   48:return          
	}

	private int swipeIfNecessary(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		if(mActionState != 2) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field int mActionState>
	//    2    4:iconst_2        
	//    3    5:icmpne          10
_L1:
		return 0;
	//    4    8:iconst_0        
	//    5    9:ireturn         
_L2:
		int i;
		int j;
		j = mCallback.getMovementFlags(mRecyclerView, viewholder);
	//    6   10:aload_0         
	//    7   11:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//    8   14:aload_0         
	//    9   15:getfield        #167 <Field RecyclerView mRecyclerView>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #419 <Method int ItemTouchHelper$Callback.getMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//   12   22:istore_3        
		i = (mCallback.convertToAbsoluteDirection(j, ViewCompat.getLayoutDirection(((View) (mRecyclerView)))) & 0xff00) >> 8;
	//   13   23:aload_0         
	//   14   24:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   15   27:iload_3         
	//   16   28:aload_0         
	//   17   29:getfield        #167 <Field RecyclerView mRecyclerView>
	//   18   32:invokestatic    #425 <Method int ViewCompat.getLayoutDirection(View)>
	//   19   35:invokevirtual   #429 <Method int ItemTouchHelper$Callback.convertToAbsoluteDirection(int, int)>
	//   20   38:ldc1            #44  <Int 65280>
	//   21   40:iand            
	//   22   41:bipush          8
	//   23   43:ishr            
	//   24   44:istore_2        
		if(i == 0)
			continue; /* Loop/switch isn't completed */
	//   25   45:iload_2         
	//   26   46:ifeq            8
		j = (j & 0xff00) >> 8;
	//   27   49:iload_3         
	//   28   50:ldc1            #44  <Int 65280>
	//   29   52:iand            
	//   30   53:bipush          8
	//   31   55:ishr            
	//   32   56:istore_3        
		if(Math.abs(mDx) <= Math.abs(mDy))
			break; /* Loop/switch isn't completed */
	//   33   57:aload_0         
	//   34   58:getfield        #177 <Field float mDx>
	//   35   61:invokestatic    #203 <Method float Math.abs(float)>
	//   36   64:aload_0         
	//   37   65:getfield        #219 <Field float mDy>
	//   38   68:invokestatic    #203 <Method float Math.abs(float)>
	//   39   71:fcmpl           
	//   40   72:ifle            124
		int k = checkHorizontalSwipe(viewholder, i);
	//   41   75:aload_0         
	//   42   76:aload_1         
	//   43   77:iload_2         
	//   44   78:invokespecial   #431 <Method int checkHorizontalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
	//   45   81:istore          4
		if(k > 0)
	//*  46   83:iload           4
	//*  47   85:ifle            111
			if((j & k) == 0)
	//*  48   88:iload_3         
	//*  49   89:iload           4
	//*  50   91:iand            
	//*  51   92:ifne            108
				return Callback.convertToRelativeDirection(k, ViewCompat.getLayoutDirection(((View) (mRecyclerView))));
	//   52   95:iload           4
	//   53   97:aload_0         
	//   54   98:getfield        #167 <Field RecyclerView mRecyclerView>
	//   55  101:invokestatic    #425 <Method int ViewCompat.getLayoutDirection(View)>
	//   56  104:invokestatic    #434 <Method int ItemTouchHelper$Callback.convertToRelativeDirection(int, int)>
	//   57  107:ireturn         
			else
				return k;
	//   58  108:iload           4
	//   59  110:ireturn         
		i = checkVerticalSwipe(viewholder, i);
	//   60  111:aload_0         
	//   61  112:aload_1         
	//   62  113:iload_2         
	//   63  114:invokespecial   #436 <Method int checkVerticalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
	//   64  117:istore_2        
		if(i > 0)
	//*  65  118:iload_2         
	//*  66  119:ifle            8
			return i;
	//   67  122:iload_2         
	//   68  123:ireturn         
		if(true) goto _L1; else goto _L3
_L3:
		int l = checkVerticalSwipe(viewholder, i);
	//   69  124:aload_0         
	//   70  125:aload_1         
	//   71  126:iload_2         
	//   72  127:invokespecial   #436 <Method int checkVerticalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
	//   73  130:istore          4
		if(l > 0)
	//*  74  132:iload           4
	//*  75  134:ifle            140
			return l;
	//   76  137:iload           4
	//   77  139:ireturn         
		i = checkHorizontalSwipe(viewholder, i);
	//   78  140:aload_0         
	//   79  141:aload_1         
	//   80  142:iload_2         
	//   81  143:invokespecial   #431 <Method int checkHorizontalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
	//   82  146:istore_2        
		if(i > 0)
	//*  83  147:iload_2         
	//*  84  148:ifle            8
			if((j & i) == 0)
	//*  85  151:iload_3         
	//*  86  152:iload_2         
	//*  87  153:iand            
	//*  88  154:ifne            169
				return Callback.convertToRelativeDirection(i, ViewCompat.getLayoutDirection(((View) (mRecyclerView))));
	//   89  157:iload_2         
	//   90  158:aload_0         
	//   91  159:getfield        #167 <Field RecyclerView mRecyclerView>
	//   92  162:invokestatic    #425 <Method int ViewCompat.getLayoutDirection(View)>
	//   93  165:invokestatic    #434 <Method int ItemTouchHelper$Callback.convertToRelativeDirection(int, int)>
	//   94  168:ireturn         
			else
				return i;
	//   95  169:iload_2         
	//   96  170:ireturn         
		if(true) goto _L1; else goto _L4
_L4:
	}

	public void attachToRecyclerView(RecyclerView recyclerview)
	{
		if(mRecyclerView != recyclerview)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field RecyclerView mRecyclerView>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
	//*   4    8:return          
		{
			if(mRecyclerView != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #167 <Field RecyclerView mRecyclerView>
	//*   7   13:ifnull          20
				destroyCallbacks();
	//    8   16:aload_0         
	//    9   17:invokespecial   #441 <Method void destroyCallbacks()>
			mRecyclerView = recyclerview;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #167 <Field RecyclerView mRecyclerView>
			if(mRecyclerView != null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #167 <Field RecyclerView mRecyclerView>
	//*  15   29:ifnull          8
			{
				recyclerview = ((RecyclerView) (recyclerview.getResources()));
	//   16   32:aload_1         
	//   17   33:invokevirtual   #445 <Method Resources RecyclerView.getResources()>
	//   18   36:astore_1        
				mSwipeEscapeVelocity = ((Resources) (recyclerview)).getDimension(android.support.v7.recyclerview.R.dimen.item_touch_helper_swipe_escape_velocity);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:getstatic       #450 <Field int android.support.v7.recyclerview.R$dimen.item_touch_helper_swipe_escape_velocity>
	//   22   42:invokevirtual   #455 <Method float Resources.getDimension(int)>
	//   23   45:putfield        #205 <Field float mSwipeEscapeVelocity>
				mMaxSwipeVelocity = ((Resources) (recyclerview)).getDimension(android.support.v7.recyclerview.R.dimen.item_touch_helper_swipe_escape_max_velocity);
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getstatic       #458 <Field int android.support.v7.recyclerview.R$dimen.item_touch_helper_swipe_escape_max_velocity>
	//   27   53:invokevirtual   #455 <Method float Resources.getDimension(int)>
	//   28   56:putfield        #181 <Field float mMaxSwipeVelocity>
				setupCallbacks();
	//   29   59:aload_0         
	//   30   60:invokespecial   #460 <Method void setupCallbacks()>
				return;
	//   31   63:return          
			}
		}
	}

	boolean checkSelectForSwipe(int i, MotionEvent motionevent, int j)
	{
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   2    4:ifnonnull       30
	//*   3    7:iload_1         
	//*   4    8:iconst_2        
	//*   5    9:icmpne          30
	//*   6   12:aload_0         
	//*   7   13:getfield        #139 <Field int mActionState>
	//*   8   16:iconst_2        
	//*   9   17:icmpeq          30
	//*  10   20:aload_0         
	//*  11   21:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*  12   24:invokevirtual   #466 <Method boolean ItemTouchHelper$Callback.isItemViewSwipeEnabled()>
	//*  13   27:ifne            32
_L2:
		return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
		if(mSelected != null || i != 2 || mActionState == 2 || !mCallback.isItemViewSwipeEnabled() || mRecyclerView.getScrollState() == 1) goto _L2; else goto _L1
	//   16   32:aload_0         
	//   17   33:getfield        #167 <Field RecyclerView mRecyclerView>
	//   18   36:invokevirtual   #469 <Method int RecyclerView.getScrollState()>
	//   19   39:iconst_1        
	//   20   40:icmpeq          30
_L1:
		float f1;
		android.support.v7.widget.RecyclerView.ViewHolder viewholder;
		viewholder = findSwipedView(motionevent);
	//   21   43:aload_0         
	//   22   44:aload_2         
	//   23   45:invokespecial   #471 <Method android.support.v7.widget.RecyclerView$ViewHolder findSwipedView(MotionEvent)>
	//   24   48:astore          8
		if(viewholder == null)
			continue; /* Loop/switch isn't completed */
	//   25   50:aload           8
	//   26   52:ifnull          30
		i = (mCallback.getAbsoluteMovementFlags(mRecyclerView, viewholder) & 0xff00) >> 8;
	//   27   55:aload_0         
	//   28   56:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   29   59:aload_0         
	//   30   60:getfield        #167 <Field RecyclerView mRecyclerView>
	//   31   63:aload           8
	//   32   65:invokevirtual   #474 <Method int ItemTouchHelper$Callback.getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//   33   68:ldc1            #44  <Int 65280>
	//   34   70:iand            
	//   35   71:bipush          8
	//   36   73:ishr            
	//   37   74:istore_1        
		if(i == 0)
			continue; /* Loop/switch isn't completed */
	//   38   75:iload_1         
	//   39   76:ifeq            30
		float f = motionevent.getX(j);
	//   40   79:aload_2         
	//   41   80:iload_3         
	//   42   81:invokevirtual   #344 <Method float MotionEvent.getX(int)>
	//   43   84:fstore          4
		f1 = motionevent.getY(j);
	//   44   86:aload_2         
	//   45   87:iload_3         
	//   46   88:invokevirtual   #349 <Method float MotionEvent.getY(int)>
	//   47   91:fstore          5
		f -= mInitialTouchX;
	//   48   93:fload           4
	//   49   95:aload_0         
	//   50   96:getfield        #346 <Field float mInitialTouchX>
	//   51   99:fsub            
	//   52  100:fstore          4
		f1 -= mInitialTouchY;
	//   53  102:fload           5
	//   54  104:aload_0         
	//   55  105:getfield        #351 <Field float mInitialTouchY>
	//   56  108:fsub            
	//   57  109:fstore          5
		float f2 = Math.abs(f);
	//   58  111:fload           4
	//   59  113:invokestatic    #203 <Method float Math.abs(float)>
	//   60  116:fstore          6
		float f3 = Math.abs(f1);
	//   61  118:fload           5
	//   62  120:invokestatic    #203 <Method float Math.abs(float)>
	//   63  123:fstore          7
		if(f2 < (float)mSlop && f3 < (float)mSlop)
			continue; /* Loop/switch isn't completed */
	//   64  125:fload           6
	//   65  127:aload_0         
	//   66  128:getfield        #353 <Field int mSlop>
	//   67  131:i2f             
	//   68  132:fcmpg           
	//   69  133:ifge            147
	//   70  136:fload           7
	//   71  138:aload_0         
	//   72  139:getfield        #353 <Field int mSlop>
	//   73  142:i2f             
	//   74  143:fcmpg           
	//   75  144:iflt            30
		if(f2 <= f3)
			continue; /* Loop/switch isn't completed */
	//   76  147:fload           6
	//   77  149:fload           7
	//   78  151:fcmpl           
	//   79  152:ifle            210
		if(f < 0.0F && (i & 4) == 0 || f > 0.0F && (i & 8) == 0)
			continue; /* Loop/switch isn't completed */
	//   80  155:fload           4
	//   81  157:fconst_0        
	//   82  158:fcmpg           
	//   83  159:ifge            168
	//   84  162:iload_1         
	//   85  163:iconst_4        
	//   86  164:iand            
	//   87  165:ifeq            30
	//   88  168:fload           4
	//   89  170:fconst_0        
	//   90  171:fcmpl           
	//   91  172:ifle            182
	//   92  175:iload_1         
	//   93  176:bipush          8
	//   94  178:iand            
	//   95  179:ifeq            30
_L4:
		mDy = 0.0F;
	//   96  182:aload_0         
	//   97  183:fconst_0        
	//   98  184:putfield        #219 <Field float mDy>
		mDx = 0.0F;
	//   99  187:aload_0         
	//  100  188:fconst_0        
	//  101  189:putfield        #177 <Field float mDx>
		mActivePointerId = motionevent.getPointerId(0);
	//  102  192:aload_0         
	//  103  193:aload_2         
	//  104  194:iconst_0        
	//  105  195:invokevirtual   #477 <Method int MotionEvent.getPointerId(int)>
	//  106  198:putfield        #137 <Field int mActivePointerId>
		select(viewholder, 1);
	//  107  201:aload_0         
	//  108  202:aload           8
	//  109  204:iconst_1        
	//  110  205:invokevirtual   #481 <Method void select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
		return true;
	//  111  208:iconst_1        
	//  112  209:ireturn         
		if(f1 < 0.0F && (i & 1) == 0) goto _L2; else goto _L3
	//  113  210:fload           5
	//  114  212:fconst_0        
	//  115  213:fcmpg           
	//  116  214:ifge            223
	//  117  217:iload_1         
	//  118  218:iconst_1        
	//  119  219:iand            
	//  120  220:ifeq            30
_L3:
		if(f1 > 0.0F && (i & 2) == 0)
	//* 121  223:fload           5
	//* 122  225:fconst_0        
	//* 123  226:fcmpl           
	//* 124  227:ifle            182
	//* 125  230:iload_1         
	//* 126  231:iconst_2        
	//* 127  232:iand            
	//* 128  233:ifne            182
			return false;
	//  129  236:iconst_0        
	//  130  237:ireturn         
		  goto _L4
		if(true) goto _L2; else goto _L5
_L5:
	}

	int endRecoverAnimation(android.support.v7.widget.RecyclerView.ViewHolder viewholder, boolean flag)
	{
		for(int i = mRecoverAnimations.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field List mRecoverAnimations>
	//*   2    4:invokeinterface #240 <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:isub            
	//*   5   11:istore_3        
	//*   6   12:iload_3         
	//*   7   13:iflt            89
		{
			RecoverAnimation recoveranimation = (RecoverAnimation)mRecoverAnimations.get(i);
	//    8   16:aload_0         
	//    9   17:getfield        #141 <Field List mRecoverAnimations>
	//   10   20:iload_3         
	//   11   21:invokeinterface #244 <Method Object List.get(int)>
	//   12   26:checkcast       #28  <Class ItemTouchHelper$RecoverAnimation>
	//   13   29:astore          4
			if(recoveranimation.mViewHolder == viewholder)
	//*  14   31:aload           4
	//*  15   33:getfield        #247 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//*  16   36:aload_1         
	//*  17   37:if_acmpne       82
			{
				recoveranimation.mOverridden = recoveranimation.mOverridden | flag;
	//   18   40:aload           4
	//   19   42:aload           4
	//   20   44:getfield        #486 <Field boolean ItemTouchHelper$RecoverAnimation.mOverridden>
	//   21   47:iload_2         
	//   22   48:ior             
	//   23   49:putfield        #486 <Field boolean ItemTouchHelper$RecoverAnimation.mOverridden>
				if(!recoveranimation.mEnded)
	//*  24   52:aload           4
	//*  25   54:getfield        #489 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
	//*  26   57:ifne            65
					recoveranimation.cancel();
	//   27   60:aload           4
	//   28   62:invokevirtual   #492 <Method void ItemTouchHelper$RecoverAnimation.cancel()>
				mRecoverAnimations.remove(i);
	//   29   65:aload_0         
	//   30   66:getfield        #141 <Field List mRecoverAnimations>
	//   31   69:iload_3         
	//   32   70:invokeinterface #495 <Method Object List.remove(int)>
	//   33   75:pop             
				return recoveranimation.mAnimationType;
	//   34   76:aload           4
	//   35   78:getfield        #498 <Field int ItemTouchHelper$RecoverAnimation.mAnimationType>
	//   36   81:ireturn         
			}
		}

	//   37   82:iload_3         
	//   38   83:iconst_1        
	//   39   84:isub            
	//   40   85:istore_3        
	//*  41   86:goto            12
		return 0;
	//   42   89:iconst_0        
	//   43   90:ireturn         
	}

	RecoverAnimation findAnimation(MotionEvent motionevent)
	{
		if(!mRecoverAnimations.isEmpty()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field List mRecoverAnimations>
	//    2    4:invokeinterface #503 <Method boolean List.isEmpty()>
	//    3    9:ifeq            16
_L1:
		motionevent = null;
	//    4   12:aconst_null     
	//    5   13:astore_1        
_L4:
		return ((RecoverAnimation) (motionevent));
	//    6   14:aload_1         
	//    7   15:areturn         
_L2:
		View view = findChildView(motionevent);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #364 <Method View findChildView(MotionEvent)>
	//   11   21:astore          4
		int i = mRecoverAnimations.size() - 1;
	//   12   23:aload_0         
	//   13   24:getfield        #141 <Field List mRecoverAnimations>
	//   14   27:invokeinterface #240 <Method int List.size()>
	//   15   32:iconst_1        
	//   16   33:isub            
	//   17   34:istore_2        
label0:
		do
		{
label1:
			{
				if(i < 0)
					break label1;
	//   18   35:iload_2         
	//   19   36:iflt            74
				RecoverAnimation recoveranimation = (RecoverAnimation)mRecoverAnimations.get(i);
	//   20   39:aload_0         
	//   21   40:getfield        #141 <Field List mRecoverAnimations>
	//   22   43:iload_2         
	//   23   44:invokeinterface #244 <Method Object List.get(int)>
	//   24   49:checkcast       #28  <Class ItemTouchHelper$RecoverAnimation>
	//   25   52:astore_3        
				motionevent = ((MotionEvent) (recoveranimation));
	//   26   53:aload_3         
	//   27   54:astore_1        
				if(recoveranimation.mViewHolder.itemView == view)
					break label0;
	//   28   55:aload_3         
	//   29   56:getfield        #247 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   30   59:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   31   62:aload           4
	//   32   64:if_acmpeq       14
				i--;
	//   33   67:iload_2         
	//   34   68:iconst_1        
	//   35   69:isub            
	//   36   70:istore_2        
			}
		} while(true);
	//   37   71:goto            35
		if(true) goto _L4; else goto _L3
_L3:
		return null;
	//   38   74:aconst_null     
	//   39   75:areturn         
	}

	View findChildView(MotionEvent motionevent)
	{
		float f = motionevent.getX();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #505 <Method float MotionEvent.getX()>
	//    2    4:fstore_2        
		float f1 = motionevent.getY();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #507 <Method float MotionEvent.getY()>
	//    5    9:fstore_3        
		if(mSelected != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   8   14:ifnull          54
		{
			motionevent = ((MotionEvent) (mSelected.itemView));
	//    9   17:aload_0         
	//   10   18:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   11   21:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   12   24:astore_1        
			if(hitTest(((View) (motionevent)), f, f1, mSelectedStartX + mDx, mSelectedStartY + mDy))
	//*  13   25:aload_1         
	//*  14   26:fload_2         
	//*  15   27:fload_3         
	//*  16   28:aload_0         
	//*  17   29:getfield        #268 <Field float mSelectedStartX>
	//*  18   32:aload_0         
	//*  19   33:getfield        #177 <Field float mDx>
	//*  20   36:fadd            
	//*  21   37:aload_0         
	//*  22   38:getfield        #274 <Field float mSelectedStartY>
	//*  23   41:aload_0         
	//*  24   42:getfield        #219 <Field float mDy>
	//*  25   45:fadd            
	//*  26   46:invokestatic    #509 <Method boolean hitTest(View, float, float, float, float)>
	//*  27   49:ifeq            54
				return ((View) (motionevent));
	//   28   52:aload_1         
	//   29   53:areturn         
		}
		for(int i = mRecoverAnimations.size() - 1; i >= 0; i--)
	//*  30   54:aload_0         
	//*  31   55:getfield        #141 <Field List mRecoverAnimations>
	//*  32   58:invokeinterface #240 <Method int List.size()>
	//*  33   63:iconst_1        
	//*  34   64:isub            
	//*  35   65:istore          4
	//*  36   67:iload           4
	//*  37   69:iflt            126
		{
			motionevent = ((MotionEvent) ((RecoverAnimation)mRecoverAnimations.get(i)));
	//   38   72:aload_0         
	//   39   73:getfield        #141 <Field List mRecoverAnimations>
	//   40   76:iload           4
	//   41   78:invokeinterface #244 <Method Object List.get(int)>
	//   42   83:checkcast       #28  <Class ItemTouchHelper$RecoverAnimation>
	//   43   86:astore_1        
			View view = ((RecoverAnimation) (motionevent)).mViewHolder.itemView;
	//   44   87:aload_1         
	//   45   88:getfield        #247 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   46   91:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   47   94:astore          5
			if(hitTest(view, f, f1, ((RecoverAnimation) (motionevent)).mX, ((RecoverAnimation) (motionevent)).mY))
	//*  48   96:aload           5
	//*  49   98:fload_2         
	//*  50   99:fload_3         
	//*  51  100:aload_1         
	//*  52  101:getfield        #512 <Field float ItemTouchHelper$RecoverAnimation.mX>
	//*  53  104:aload_1         
	//*  54  105:getfield        #515 <Field float ItemTouchHelper$RecoverAnimation.mY>
	//*  55  108:invokestatic    #509 <Method boolean hitTest(View, float, float, float, float)>
	//*  56  111:ifeq            117
				return view;
	//   57  114:aload           5
	//   58  116:areturn         
		}

	//   59  117:iload           4
	//   60  119:iconst_1        
	//   61  120:isub            
	//   62  121:istore          4
	//*  63  123:goto            67
		return mRecyclerView.findChildViewUnder(f, f1);
	//   64  126:aload_0         
	//   65  127:getfield        #167 <Field RecyclerView mRecyclerView>
	//   66  130:fload_2         
	//   67  131:fload_3         
	//   68  132:invokevirtual   #519 <Method View RecyclerView.findChildViewUnder(float, float)>
	//   69  135:areturn         
	}

	public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
	{
		rect.setEmpty();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #526 <Method void Rect.setEmpty()>
	//    2    4:return          
	}

	boolean hasRunningRecoverAnim()
	{
		int j = mRecoverAnimations.size();
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field List mRecoverAnimations>
	//    2    4:invokeinterface #240 <Method int List.size()>
	//    3    9:istore_2        
		for(int i = 0; i < j; i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:iload_2         
	//*   8   14:icmpge          45
			if(!((RecoverAnimation)mRecoverAnimations.get(i)).mEnded)
	//*   9   17:aload_0         
	//*  10   18:getfield        #141 <Field List mRecoverAnimations>
	//*  11   21:iload_1         
	//*  12   22:invokeinterface #244 <Method Object List.get(int)>
	//*  13   27:checkcast       #28  <Class ItemTouchHelper$RecoverAnimation>
	//*  14   30:getfield        #489 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
	//*  15   33:ifne            38
				return true;
	//   16   36:iconst_1        
	//   17   37:ireturn         

	//   18   38:iload_1         
	//   19   39:iconst_1        
	//   20   40:iadd            
	//   21   41:istore_1        
	//*  22   42:goto            12
		return false;
	//   23   45:iconst_0        
	//   24   46:ireturn         
	}

	void moveIfNecessary(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		if(!mRecyclerView.isLayoutRequested() && mActionState == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field RecyclerView mRecyclerView>
	//*   2    4:invokevirtual   #532 <Method boolean RecyclerView.isLayoutRequested()>
	//*   3    7:ifeq            11
	//*   4   10:return          
	//*   5   11:aload_0         
	//*   6   12:getfield        #139 <Field int mActionState>
	//*   7   15:iconst_2        
	//*   8   16:icmpne          10
		{
			float f = mCallback.getMoveThreshold(viewholder);
	//    9   19:aload_0         
	//   10   20:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #535 <Method float ItemTouchHelper$Callback.getMoveThreshold(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   13   27:fstore_2        
			int i = (int)(mSelectedStartX + mDx);
	//   14   28:aload_0         
	//   15   29:getfield        #268 <Field float mSelectedStartX>
	//   16   32:aload_0         
	//   17   33:getfield        #177 <Field float mDx>
	//   18   36:fadd            
	//   19   37:f2i             
	//   20   38:istore_3        
			int j = (int)(mSelectedStartY + mDy);
	//   21   39:aload_0         
	//   22   40:getfield        #274 <Field float mSelectedStartY>
	//   23   43:aload_0         
	//   24   44:getfield        #219 <Field float mDy>
	//   25   47:fadd            
	//   26   48:f2i             
	//   27   49:istore          4
			if((float)Math.abs(j - viewholder.itemView.getTop()) >= (float)viewholder.itemView.getHeight() * f || (float)Math.abs(i - viewholder.itemView.getLeft()) >= f * (float)viewholder.itemView.getWidth())
	//*  28   51:iload           4
	//*  29   53:aload_1         
	//*  30   54:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  31   57:invokevirtual   #302 <Method int View.getTop()>
	//*  32   60:isub            
	//*  33   61:invokestatic    #319 <Method int Math.abs(int)>
	//*  34   64:i2f             
	//*  35   65:aload_1         
	//*  36   66:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  37   69:invokevirtual   #283 <Method int View.getHeight()>
	//*  38   72:i2f             
	//*  39   73:fload_2         
	//*  40   74:fmul            
	//*  41   75:fcmpg           
	//*  42   76:ifge            106
	//*  43   79:iload_3         
	//*  44   80:aload_1         
	//*  45   81:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  46   84:invokevirtual   #308 <Method int View.getLeft()>
	//*  47   87:isub            
	//*  48   88:invokestatic    #319 <Method int Math.abs(int)>
	//*  49   91:i2f             
	//*  50   92:fload_2         
	//*  51   93:aload_1         
	//*  52   94:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  53   97:invokevirtual   #282 <Method int View.getWidth()>
	//*  54  100:i2f             
	//*  55  101:fmul            
	//*  56  102:fcmpg           
	//*  57  103:iflt            10
			{
				Object obj = ((Object) (findSwapTargets(viewholder)));
	//   58  106:aload_0         
	//   59  107:aload_1         
	//   60  108:invokespecial   #537 <Method List findSwapTargets(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   61  111:astore          7
				if(((List) (obj)).size() != 0)
	//*  62  113:aload           7
	//*  63  115:invokeinterface #240 <Method int List.size()>
	//*  64  120:ifeq            10
				{
					obj = ((Object) (mCallback.chooseDropTarget(viewholder, ((List) (obj)), i, j)));
	//   65  123:aload_0         
	//   66  124:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   67  127:aload_1         
	//   68  128:aload           7
	//   69  130:iload_3         
	//   70  131:iload           4
	//   71  133:invokevirtual   #541 <Method android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$Callback.chooseDropTarget(android.support.v7.widget.RecyclerView$ViewHolder, List, int, int)>
	//   72  136:astore          7
					if(obj == null)
	//*  73  138:aload           7
	//*  74  140:ifnonnull       162
					{
						mSwapTargets.clear();
	//   75  143:aload_0         
	//   76  144:getfield        #261 <Field List mSwapTargets>
	//   77  147:invokeinterface #254 <Method void List.clear()>
						mDistances.clear();
	//   78  152:aload_0         
	//   79  153:getfield        #263 <Field List mDistances>
	//   80  156:invokeinterface #254 <Method void List.clear()>
						return;
	//   81  161:return          
					}
					int k = ((android.support.v7.widget.RecyclerView.ViewHolder) (obj)).getAdapterPosition();
	//   82  162:aload           7
	//   83  164:invokevirtual   #544 <Method int android.support.v7.widget.RecyclerView$ViewHolder.getAdapterPosition()>
	//   84  167:istore          5
					int l = viewholder.getAdapterPosition();
	//   85  169:aload_1         
	//   86  170:invokevirtual   #544 <Method int android.support.v7.widget.RecyclerView$ViewHolder.getAdapterPosition()>
	//   87  173:istore          6
					if(mCallback.onMove(mRecyclerView, viewholder, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj))))
	//*  88  175:aload_0         
	//*  89  176:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*  90  179:aload_0         
	//*  91  180:getfield        #167 <Field RecyclerView mRecyclerView>
	//*  92  183:aload_1         
	//*  93  184:aload           7
	//*  94  186:invokevirtual   #547 <Method boolean ItemTouchHelper$Callback.onMove(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, android.support.v7.widget.RecyclerView$ViewHolder)>
	//*  95  189:ifeq            10
					{
						mCallback.onMoved(mRecyclerView, viewholder, l, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj)), k, i, j);
	//   96  192:aload_0         
	//   97  193:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   98  196:aload_0         
	//   99  197:getfield        #167 <Field RecyclerView mRecyclerView>
	//  100  200:aload_1         
	//  101  201:iload           6
	//  102  203:aload           7
	//  103  205:iload           5
	//  104  207:iload_3         
	//  105  208:iload           4
	//  106  210:invokevirtual   #551 <Method void ItemTouchHelper$Callback.onMoved(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, int, android.support.v7.widget.RecyclerView$ViewHolder, int, int, int)>
						return;
	//  107  213:return          
					}
				}
			}
		}
	}

	void obtainVelocityTracker()
	{
		if(mVelocityTracker != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnull          14
			mVelocityTracker.recycle();
	//    3    7:aload_0         
	//    4    8:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//    5   11:invokevirtual   #393 <Method void VelocityTracker.recycle()>
		mVelocityTracker = VelocityTracker.obtain();
	//    6   14:aload_0         
	//    7   15:invokestatic    #556 <Method VelocityTracker VelocityTracker.obtain()>
	//    8   18:putfield        #179 <Field VelocityTracker mVelocityTracker>
	//    9   21:return          
	}

	public void onChildViewAttachedToWindow(View view)
	{
	//    0    0:return          
	}

	public void onChildViewDetachedFromWindow(View view)
	{
		removeChildDrawingOrderCallbackIfNecessary(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #562 <Method void removeChildDrawingOrderCallbackIfNecessary(View)>
		view = ((View) (mRecyclerView.getChildViewHolder(view)));
	//    3    5:aload_0         
	//    4    6:getfield        #167 <Field RecyclerView mRecyclerView>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #312 <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//    7   13:astore_1        
		if(view != null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       19
	//*  10   18:return          
		{
			if(mSelected != null && view == mSelected)
	//*  11   19:aload_0         
	//*  12   20:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*  13   23:ifnull          41
	//*  14   26:aload_1         
	//*  15   27:aload_0         
	//*  16   28:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*  17   31:if_acmpne       41
			{
				select(((android.support.v7.widget.RecyclerView.ViewHolder) (null)), 0);
	//   18   34:aload_0         
	//   19   35:aconst_null     
	//   20   36:iconst_0        
	//   21   37:invokevirtual   #481 <Method void select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
				return;
	//   22   40:return          
			}
			endRecoverAnimation(((android.support.v7.widget.RecyclerView.ViewHolder) (view)), false);
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:iconst_0        
	//   26   44:invokevirtual   #564 <Method int endRecoverAnimation(android.support.v7.widget.RecyclerView$ViewHolder, boolean)>
	//   27   47:pop             
			if(mPendingCleanup.remove(((Object) (((android.support.v7.widget.RecyclerView.ViewHolder) (view)).itemView))))
	//*  28   48:aload_0         
	//*  29   49:getfield        #131 <Field List mPendingCleanup>
	//*  30   52:aload_1         
	//*  31   53:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  32   56:invokeinterface #567 <Method boolean List.remove(Object)>
	//*  33   61:ifeq            18
			{
				mCallback.clearView(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (view)));
	//   34   64:aload_0         
	//   35   65:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   36   68:aload_0         
	//   37   69:getfield        #167 <Field RecyclerView mRecyclerView>
	//   38   72:aload_1         
	//   39   73:invokevirtual   #251 <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
				return;
	//   40   76:return          
			}
		}
	}

	public void onDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
	{
		float f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          5
		mOverdrawChildPosition = -1;
	//    2    3:aload_0         
	//    3    4:iconst_m1       
	//    4    5:putfield        #152 <Field int mOverdrawChildPosition>
		float f;
		if(mSelected != null)
	//*   5    8:aload_0         
	//*   6    9:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   7   12:ifnull          65
		{
			getSelectedDxDy(mTmpPosition);
	//    8   15:aload_0         
	//    9   16:aload_0         
	//   10   17:getfield        #133 <Field float[] mTmpPosition>
	//   11   20:invokespecial   #571 <Method void getSelectedDxDy(float[])>
			f = mTmpPosition[0];
	//   12   23:aload_0         
	//   13   24:getfield        #133 <Field float[] mTmpPosition>
	//   14   27:iconst_0        
	//   15   28:faload          
	//   16   29:fstore          4
			f1 = mTmpPosition[1];
	//   17   31:aload_0         
	//   18   32:getfield        #133 <Field float[] mTmpPosition>
	//   19   35:iconst_1        
	//   20   36:faload          
	//   21   37:fstore          5
		} else
	//*  22   39:aload_0         
	//*  23   40:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*  24   43:aload_1         
	//*  25   44:aload_2         
	//*  26   45:aload_0         
	//*  27   46:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*  28   49:aload_0         
	//*  29   50:getfield        #141 <Field List mRecoverAnimations>
	//*  30   53:aload_0         
	//*  31   54:getfield        #139 <Field int mActionState>
	//*  32   57:fload           4
	//*  33   59:fload           5
	//*  34   61:invokevirtual   #574 <Method void ItemTouchHelper$Callback.onDraw(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, List, int, float, float)>
	//*  35   64:return          
		{
			f = 0.0F;
	//   36   65:fconst_0        
	//   37   66:fstore          4
		}
		mCallback.onDraw(canvas, recyclerview, mSelected, mRecoverAnimations, mActionState, f, f1);
	//*  38   68:goto            39
	}

	public void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
	{
		float f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          5
		float f;
		if(mSelected != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   4    7:ifnull          60
		{
			getSelectedDxDy(mTmpPosition);
	//    5   10:aload_0         
	//    6   11:aload_0         
	//    7   12:getfield        #133 <Field float[] mTmpPosition>
	//    8   15:invokespecial   #571 <Method void getSelectedDxDy(float[])>
			f = mTmpPosition[0];
	//    9   18:aload_0         
	//   10   19:getfield        #133 <Field float[] mTmpPosition>
	//   11   22:iconst_0        
	//   12   23:faload          
	//   13   24:fstore          4
			f1 = mTmpPosition[1];
	//   14   26:aload_0         
	//   15   27:getfield        #133 <Field float[] mTmpPosition>
	//   16   30:iconst_1        
	//   17   31:faload          
	//   18   32:fstore          5
		} else
	//*  19   34:aload_0         
	//*  20   35:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*  21   38:aload_1         
	//*  22   39:aload_2         
	//*  23   40:aload_0         
	//*  24   41:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*  25   44:aload_0         
	//*  26   45:getfield        #141 <Field List mRecoverAnimations>
	//*  27   48:aload_0         
	//*  28   49:getfield        #139 <Field int mActionState>
	//*  29   52:fload           4
	//*  30   54:fload           5
	//*  31   56:invokevirtual   #577 <Method void ItemTouchHelper$Callback.onDrawOver(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, List, int, float, float)>
	//*  32   59:return          
		{
			f = 0.0F;
	//   33   60:fconst_0        
	//   34   61:fstore          4
		}
		mCallback.onDrawOver(canvas, recyclerview, mSelected, mRecoverAnimations, mActionState, f, f1);
	//*  35   63:goto            34
	}

	void postDispatchSwipe(final RecoverAnimation anim, final int swipeDir)
	{
		mRecyclerView.post(new Runnable() {

			public void run()
			{
label0:
				{
					if(mRecyclerView != null && mRecyclerView.isAttachedToWindow() && !anim.mOverridden && anim.mViewHolder.getAdapterPosition() != -1)
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field ItemTouchHelper this$0>
			//*   2    4:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
			//*   3    7:ifnull          101
			//*   4   10:aload_0         
			//*   5   11:getfield        #21  <Field ItemTouchHelper this$0>
			//*   6   14:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
			//*   7   17:invokevirtual   #40  <Method boolean RecyclerView.isAttachedToWindow()>
			//*   8   20:ifeq            101
			//*   9   23:aload_0         
			//*  10   24:getfield        #23  <Field ItemTouchHelper$RecoverAnimation val$anim>
			//*  11   27:getfield        #46  <Field boolean ItemTouchHelper$RecoverAnimation.mOverridden>
			//*  12   30:ifne            101
			//*  13   33:aload_0         
			//*  14   34:getfield        #23  <Field ItemTouchHelper$RecoverAnimation val$anim>
			//*  15   37:getfield        #50  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
			//*  16   40:invokevirtual   #56  <Method int android.support.v7.widget.RecyclerView$ViewHolder.getAdapterPosition()>
			//*  17   43:iconst_m1       
			//*  18   44:icmpeq          101
					{
						android.support.v7.widget.RecyclerView.ItemAnimator itemanimator = mRecyclerView.getItemAnimator();
			//   19   47:aload_0         
			//   20   48:getfield        #21  <Field ItemTouchHelper this$0>
			//   21   51:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
			//   22   54:invokevirtual   #60  <Method android.support.v7.widget.RecyclerView$ItemAnimator RecyclerView.getItemAnimator()>
			//   23   57:astore_1        
						if(itemanimator != null && itemanimator.isRunning(((android.support.v7.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener) (null))) || hasRunningRecoverAnim())
							break label0;
			//   24   58:aload_1         
			//   25   59:ifnull          70
			//   26   62:aload_1         
			//   27   63:aconst_null     
			//   28   64:invokevirtual   #66  <Method boolean android.support.v7.widget.RecyclerView$ItemAnimator.isRunning(android.support.v7.widget.RecyclerView$ItemAnimator$ItemAnimatorFinishedListener)>
			//   29   67:ifne            102
			//   30   70:aload_0         
			//   31   71:getfield        #21  <Field ItemTouchHelper this$0>
			//   32   74:invokevirtual   #69  <Method boolean ItemTouchHelper.hasRunningRecoverAnim()>
			//   33   77:ifne            102
						mCallback.onSwiped(anim.mViewHolder, swipeDir);
			//   34   80:aload_0         
			//   35   81:getfield        #21  <Field ItemTouchHelper this$0>
			//   36   84:getfield        #73  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
			//   37   87:aload_0         
			//   38   88:getfield        #23  <Field ItemTouchHelper$RecoverAnimation val$anim>
			//   39   91:getfield        #50  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
			//   40   94:aload_0         
			//   41   95:getfield        #25  <Field int val$swipeDir>
			//   42   98:invokevirtual   #79  <Method void ItemTouchHelper$Callback.onSwiped(android.support.v7.widget.RecyclerView$ViewHolder, int)>
					}
					return;
			//   43  101:return          
				}
				mRecyclerView.post(((Runnable) (this)));
			//   44  102:aload_0         
			//   45  103:getfield        #21  <Field ItemTouchHelper this$0>
			//   46  106:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
			//   47  109:aload_0         
			//   48  110:invokevirtual   #83  <Method boolean RecyclerView.post(Runnable)>
			//   49  113:pop             
			//   50  114:return          
			}

			final ItemTouchHelper this$0;
			final RecoverAnimation val$anim;
			final int val$swipeDir;

			
			{
				this$0 = ItemTouchHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ItemTouchHelper this$0>
				anim = recoveranimation;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ItemTouchHelper$RecoverAnimation val$anim>
				swipeDir = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int val$swipeDir>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field RecyclerView mRecyclerView>
	//    2    4:new             #14  <Class ItemTouchHelper$4>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokespecial   #582 <Method void ItemTouchHelper$4(ItemTouchHelper, ItemTouchHelper$RecoverAnimation, int)>
	//    8   14:invokevirtual   #586 <Method boolean RecyclerView.post(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	void removeChildDrawingOrderCallbackIfNecessary(View view)
	{
		if(view == mOverdrawChild)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #150 <Field View mOverdrawChild>
	//*   3    5:if_acmpne       28
		{
			mOverdrawChild = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #150 <Field View mOverdrawChild>
			if(mChildDrawingOrderCallback != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #148 <Field android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback mChildDrawingOrderCallback>
	//*   9   17:ifnull          28
				mRecyclerView.setChildDrawingOrderCallback(((android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback) (null)));
	//   10   20:aload_0         
	//   11   21:getfield        #167 <Field RecyclerView mRecyclerView>
	//   12   24:aconst_null     
	//   13   25:invokevirtual   #173 <Method void RecyclerView.setChildDrawingOrderCallback(android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback)>
		}
	//   14   28:return          
	}

	boolean scrollIfNecessary()
	{
		int i;
		int j;
		int k;
		if(mSelected == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   2    4:ifnonnull       16
		{
			mDragScrollStartTimeInMs = 0x0L;
	//    3    7:aload_0         
	//    4    8:ldc2w           #588 <Long 0x0L>
	//    5   11:putfield        #591 <Field long mDragScrollStartTimeInMs>
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		}
		long l1 = System.currentTimeMillis();
	//    8   16:invokestatic    #597 <Method long System.currentTimeMillis()>
	//    9   19:lstore          6
		long l;
		android.support.v7.widget.RecyclerView.LayoutManager layoutmanager;
		if(mDragScrollStartTimeInMs == 0x0L)
	//*  10   21:aload_0         
	//*  11   22:getfield        #591 <Field long mDragScrollStartTimeInMs>
	//*  12   25:ldc2w           #588 <Long 0x0L>
	//*  13   28:lcmp            
	//*  14   29:ifne            286
			l = 0L;
	//   15   32:lconst_0        
	//   16   33:lstore          4
		else
	//*  17   35:aload_0         
	//*  18   36:getfield        #167 <Field RecyclerView mRecyclerView>
	//*  19   39:invokevirtual   #287 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//*  20   42:astore          8
	//*  21   44:aload_0         
	//*  22   45:getfield        #599 <Field Rect mTmpRect>
	//*  23   48:ifnonnull       62
	//*  24   51:aload_0         
	//*  25   52:new             #523 <Class Rect>
	//*  26   55:dup             
	//*  27   56:invokespecial   #600 <Method void Rect()>
	//*  28   59:putfield        #599 <Field Rect mTmpRect>
	//*  29   62:aload           8
	//*  30   64:aload_0         
	//*  31   65:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*  32   68:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  33   71:aload_0         
	//*  34   72:getfield        #599 <Field Rect mTmpRect>
	//*  35   75:invokevirtual   #604 <Method void android.support.v7.widget.RecyclerView$LayoutManager.calculateItemDecorationsForChild(View, Rect)>
	//*  36   78:aload           8
	//*  37   80:invokevirtual   #357 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  38   83:ifeq            350
	//*  39   86:aload_0         
	//*  40   87:getfield        #268 <Field float mSelectedStartX>
	//*  41   90:aload_0         
	//*  42   91:getfield        #177 <Field float mDx>
	//*  43   94:fadd            
	//*  44   95:f2i             
	//*  45   96:istore_2        
	//*  46   97:iload_2         
	//*  47   98:aload_0         
	//*  48   99:getfield        #599 <Field Rect mTmpRect>
	//*  49  102:getfield        #607 <Field int Rect.left>
	//*  50  105:isub            
	//*  51  106:aload_0         
	//*  52  107:getfield        #167 <Field RecyclerView mRecyclerView>
	//*  53  110:invokevirtual   #610 <Method int RecyclerView.getPaddingLeft()>
	//*  54  113:isub            
	//*  55  114:istore_1        
	//*  56  115:aload_0         
	//*  57  116:getfield        #177 <Field float mDx>
	//*  58  119:fconst_0        
	//*  59  120:fcmpg           
	//*  60  121:ifge            298
	//*  61  124:iload_1         
	//*  62  125:ifge            298
	//*  63  128:aload           8
	//*  64  130:invokevirtual   #360 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollVertically()>
	//*  65  133:ifeq            407
	//*  66  136:aload_0         
	//*  67  137:getfield        #274 <Field float mSelectedStartY>
	//*  68  140:aload_0         
	//*  69  141:getfield        #219 <Field float mDy>
	//*  70  144:fadd            
	//*  71  145:f2i             
	//*  72  146:istore_3        
	//*  73  147:iload_3         
	//*  74  148:aload_0         
	//*  75  149:getfield        #599 <Field Rect mTmpRect>
	//*  76  152:getfield        #613 <Field int Rect.top>
	//*  77  155:isub            
	//*  78  156:aload_0         
	//*  79  157:getfield        #167 <Field RecyclerView mRecyclerView>
	//*  80  160:invokevirtual   #616 <Method int RecyclerView.getPaddingTop()>
	//*  81  163:isub            
	//*  82  164:istore_2        
	//*  83  165:aload_0         
	//*  84  166:getfield        #219 <Field float mDy>
	//*  85  169:fconst_0        
	//*  86  170:fcmpg           
	//*  87  171:ifge            355
	//*  88  174:iload_2         
	//*  89  175:ifge            355
	//*  90  178:iload_1         
	//*  91  179:ifeq            424
	//*  92  182:aload_0         
	//*  93  183:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*  94  186:aload_0         
	//*  95  187:getfield        #167 <Field RecyclerView mRecyclerView>
	//*  96  190:aload_0         
	//*  97  191:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*  98  194:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  99  197:invokevirtual   #282 <Method int View.getWidth()>
	//* 100  200:iload_1         
	//* 101  201:aload_0         
	//* 102  202:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 103  205:invokevirtual   #212 <Method int RecyclerView.getWidth()>
	//* 104  208:lload           4
	//* 105  210:invokevirtual   #620 <Method int ItemTouchHelper$Callback.interpolateOutOfBoundsScroll(RecyclerView, int, int, int, long)>
	//* 106  213:istore_1        
	//* 107  214:iload_2         
	//* 108  215:ifeq            421
	//* 109  218:aload_0         
	//* 110  219:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//* 111  222:aload_0         
	//* 112  223:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 113  226:aload_0         
	//* 114  227:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//* 115  230:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//* 116  233:invokevirtual   #283 <Method int View.getHeight()>
	//* 117  236:iload_2         
	//* 118  237:aload_0         
	//* 119  238:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 120  241:invokevirtual   #222 <Method int RecyclerView.getHeight()>
	//* 121  244:lload           4
	//* 122  246:invokevirtual   #620 <Method int ItemTouchHelper$Callback.interpolateOutOfBoundsScroll(RecyclerView, int, int, int, long)>
	//* 123  249:istore_2        
	//* 124  250:iload_1         
	//* 125  251:ifne            258
	//* 126  254:iload_2         
	//* 127  255:ifeq            412
	//* 128  258:aload_0         
	//* 129  259:getfield        #591 <Field long mDragScrollStartTimeInMs>
	//* 130  262:ldc2w           #588 <Long 0x0L>
	//* 131  265:lcmp            
	//* 132  266:ifne            275
	//* 133  269:aload_0         
	//* 134  270:lload           6
	//* 135  272:putfield        #591 <Field long mDragScrollStartTimeInMs>
	//* 136  275:aload_0         
	//* 137  276:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 138  279:iload_1         
	//* 139  280:iload_2         
	//* 140  281:invokevirtual   #624 <Method void RecyclerView.scrollBy(int, int)>
	//* 141  284:iconst_1        
	//* 142  285:ireturn         
			l = l1 - mDragScrollStartTimeInMs;
	//  143  286:lload           6
	//  144  288:aload_0         
	//  145  289:getfield        #591 <Field long mDragScrollStartTimeInMs>
	//  146  292:lsub            
	//  147  293:lstore          4
		layoutmanager = mRecyclerView.getLayoutManager();
		if(mTmpRect == null)
			mTmpRect = new Rect();
		layoutmanager.calculateItemDecorationsForChild(mSelected.itemView, mTmpRect);
		if(!layoutmanager.canScrollHorizontally()) goto _L2; else goto _L1
_L1:
		j = (int)(mSelectedStartX + mDx);
		i = j - mTmpRect.left - mRecyclerView.getPaddingLeft();
		if(mDx >= 0.0F || i >= 0) goto _L4; else goto _L3
_L3:
		if(!layoutmanager.canScrollVertically()) goto _L6; else goto _L5
_L5:
		k = (int)(mSelectedStartY + mDy);
		j = k - mTmpRect.top - mRecyclerView.getPaddingTop();
		if(mDy >= 0.0F || j >= 0) goto _L8; else goto _L7
_L7:
		if(i != 0)
			i = mCallback.interpolateOutOfBoundsScroll(mRecyclerView, mSelected.itemView.getWidth(), i, mRecyclerView.getWidth(), l);
		if(j != 0)
			j = mCallback.interpolateOutOfBoundsScroll(mRecyclerView, mSelected.itemView.getHeight(), j, mRecyclerView.getHeight(), l);
		if(i != 0 || j != 0)
		{
			if(mDragScrollStartTimeInMs == 0x0L)
				mDragScrollStartTimeInMs = l1;
			mRecyclerView.scrollBy(i, j);
			return true;
		} else
	//* 148  295:goto            35
	//* 149  298:aload_0         
	//* 150  299:getfield        #177 <Field float mDx>
	//* 151  302:fconst_0        
	//* 152  303:fcmpl           
	//* 153  304:ifle            350
	//* 154  307:iload_2         
	//* 155  308:aload_0         
	//* 156  309:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//* 157  312:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//* 158  315:invokevirtual   #282 <Method int View.getWidth()>
	//* 159  318:iadd            
	//* 160  319:aload_0         
	//* 161  320:getfield        #599 <Field Rect mTmpRect>
	//* 162  323:getfield        #627 <Field int Rect.right>
	//* 163  326:iadd            
	//* 164  327:aload_0         
	//* 165  328:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 166  331:invokevirtual   #212 <Method int RecyclerView.getWidth()>
	//* 167  334:aload_0         
	//* 168  335:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 169  338:invokevirtual   #630 <Method int RecyclerView.getPaddingRight()>
	//* 170  341:isub            
	//* 171  342:isub            
	//* 172  343:istore_2        
	//* 173  344:iload_2         
	//* 174  345:istore_1        
	//* 175  346:iload_2         
	//* 176  347:ifgt            128
	//* 177  350:iconst_0        
	//* 178  351:istore_1        
	//* 179  352:goto            128
	//* 180  355:aload_0         
	//* 181  356:getfield        #219 <Field float mDy>
	//* 182  359:fconst_0        
	//* 183  360:fcmpl           
	//* 184  361:ifle            407
	//* 185  364:iload_3         
	//* 186  365:aload_0         
	//* 187  366:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//* 188  369:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//* 189  372:invokevirtual   #283 <Method int View.getHeight()>
	//* 190  375:iadd            
	//* 191  376:aload_0         
	//* 192  377:getfield        #599 <Field Rect mTmpRect>
	//* 193  380:getfield        #633 <Field int Rect.bottom>
	//* 194  383:iadd            
	//* 195  384:aload_0         
	//* 196  385:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 197  388:invokevirtual   #222 <Method int RecyclerView.getHeight()>
	//* 198  391:aload_0         
	//* 199  392:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 200  395:invokevirtual   #636 <Method int RecyclerView.getPaddingBottom()>
	//* 201  398:isub            
	//* 202  399:isub            
	//* 203  400:istore_3        
	//* 204  401:iload_3         
	//* 205  402:istore_2        
	//* 206  403:iload_3         
	//* 207  404:ifgt            178
	//* 208  407:iconst_0        
	//* 209  408:istore_2        
	//* 210  409:goto            178
		{
			mDragScrollStartTimeInMs = 0x0L;
	//  211  412:aload_0         
	//  212  413:ldc2w           #588 <Long 0x0L>
	//  213  416:putfield        #591 <Field long mDragScrollStartTimeInMs>
			return false;
	//  214  419:iconst_0        
	//  215  420:ireturn         
		}
_L4:
		if(mDx <= 0.0F) goto _L2; else goto _L9
_L9:
		j = (j + mSelected.itemView.getWidth() + mTmpRect.right) - (mRecyclerView.getWidth() - mRecyclerView.getPaddingRight());
		i = j;
		if(j > 0) goto _L3; else goto _L2
_L2:
		i = 0;
		  goto _L3
_L8:
		if(mDy <= 0.0F) goto _L6; else goto _L10
_L10:
		k = (k + mSelected.itemView.getHeight() + mTmpRect.bottom) - (mRecyclerView.getHeight() - mRecyclerView.getPaddingBottom());
		j = k;
		if(k > 0) goto _L7; else goto _L6
_L6:
		j = 0;
		  goto _L7
	//* 216  421:goto            250
	//* 217  424:goto            214
	}

	void select(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		final int final_i;
		int j;
		int k;
		if(viewholder == mSelected && i == mActionState)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   3    5:if_acmpne       17
	//*   4    8:iload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #139 <Field int mActionState>
	//*   7   13:icmpne          17
			return;
	//    8   16:return          
		mDragScrollStartTimeInMs = 0x0L;
	//    9   17:aload_0         
	//   10   18:ldc2w           #588 <Long 0x0L>
	//   11   21:putfield        #591 <Field long mDragScrollStartTimeInMs>
		k = mActionState;
	//   12   24:aload_0         
	//   13   25:getfield        #139 <Field int mActionState>
	//   14   28:istore          9
		endRecoverAnimation(viewholder, true);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:iconst_1        
	//   18   33:invokevirtual   #564 <Method int endRecoverAnimation(android.support.v7.widget.RecyclerView$ViewHolder, boolean)>
	//   19   36:pop             
		mActionState = i;
	//   20   37:aload_0         
	//   21   38:iload_2         
	//   22   39:putfield        #139 <Field int mActionState>
		if(i == 2)
	//*  23   42:iload_2         
	//*  24   43:iconst_2        
	//*  25   44:icmpne          59
		{
			mOverdrawChild = viewholder.itemView;
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   29   52:putfield        #150 <Field View mOverdrawChild>
			addChildDrawingOrderCallback();
	//   30   55:aload_0         
	//   31   56:invokespecial   #638 <Method void addChildDrawingOrderCallback()>
		}
		final_i = 0;
	//   32   59:iconst_0        
	//   33   60:istore          7
		j = 0;
	//   34   62:iconst_0        
	//   35   63:istore          8
		if(mSelected == null) goto _L2; else goto _L1
	//   36   65:aload_0         
	//   37   66:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   38   69:ifnull          282
_L1:
		float f;
		float f1;
		final Object final_viewholder;
		final_viewholder = ((Object) (mSelected));
	//   39   72:aload_0         
	//   40   73:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   41   76:astore          11
		if(((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)).itemView.getParent() == null)
			break MISSING_BLOCK_LABEL_510;
	//   42   78:aload           11
	//   43   80:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   44   83:invokevirtual   #642 <Method ViewParent View.getParent()>
	//   45   86:ifnull          510
		float f2;
		float f3;
		if(k == 2)
	//*  46   89:iload           9
	//*  47   91:iconst_2        
	//*  48   92:icmpne          436
			j = 0;
	//   49   95:iconst_0        
	//   50   96:istore          8
		else
	//*  51   98:aload_0         
	//*  52   99:invokespecial   #257 <Method void releaseVelocityTracker()>
	//*  53  102:iload           8
	//*  54  104:lookupswitch    6: default 164
	//	               1: 470
	//	               2: 470
	//	               4: 447
	//	               8: 447
	//	               16: 447
	//	               32: 447
	//*  55  164:fconst_0        
	//*  56  165:fstore_3        
	//*  57  166:fconst_0        
	//*  58  167:fstore          4
	//*  59  169:iload           9
	//*  60  171:iconst_2        
	//*  61  172:icmpne          493
	//*  62  175:bipush          8
	//*  63  177:istore          7
	//*  64  179:aload_0         
	//*  65  180:aload_0         
	//*  66  181:getfield        #133 <Field float[] mTmpPosition>
	//*  67  184:invokespecial   #571 <Method void getSelectedDxDy(float[])>
	//*  68  187:aload_0         
	//*  69  188:getfield        #133 <Field float[] mTmpPosition>
	//*  70  191:iconst_0        
	//*  71  192:faload          
	//*  72  193:fstore          5
	//*  73  195:aload_0         
	//*  74  196:getfield        #133 <Field float[] mTmpPosition>
	//*  75  199:iconst_1        
	//*  76  200:faload          
	//*  77  201:fstore          6
	//*  78  203:new             #12  <Class ItemTouchHelper$3>
	//*  79  206:dup             
	//*  80  207:aload_0         
	//*  81  208:aload           11
	//*  82  210:iload           7
	//*  83  212:iload           9
	//*  84  214:fload           5
	//*  85  216:fload           6
	//*  86  218:fload_3         
	//*  87  219:fload           4
	//*  88  221:iload           8
	//*  89  223:aload           11
	//*  90  225:invokespecial   #645 <Method void ItemTouchHelper$3(ItemTouchHelper, android.support.v7.widget.RecyclerView$ViewHolder, int, int, float, float, float, float, int, android.support.v7.widget.RecyclerView$ViewHolder)>
	//*  91  228:astore          11
	//*  92  230:aload           11
	//*  93  232:aload_0         
	//*  94  233:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*  95  236:aload_0         
	//*  96  237:getfield        #167 <Field RecyclerView mRecyclerView>
	//*  97  240:iload           7
	//*  98  242:fload_3         
	//*  99  243:fload           5
	//* 100  245:fsub            
	//* 101  246:fload           4
	//* 102  248:fload           6
	//* 103  250:fsub            
	//* 104  251:invokevirtual   #649 <Method long ItemTouchHelper$Callback.getAnimationDuration(RecyclerView, int, float, float)>
	//* 105  254:invokevirtual   #653 <Method void ItemTouchHelper$RecoverAnimation.setDuration(long)>
	//* 106  257:aload_0         
	//* 107  258:getfield        #141 <Field List mRecoverAnimations>
	//* 108  261:aload           11
	//* 109  263:invokeinterface #655 <Method boolean List.add(Object)>
	//* 110  268:pop             
	//* 111  269:aload           11
	//* 112  271:invokevirtual   #658 <Method void ItemTouchHelper$RecoverAnimation.start()>
	//* 113  274:iconst_1        
	//* 114  275:istore          7
	//* 115  277:aload_0         
	//* 116  278:aconst_null     
	//* 117  279:putfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//* 118  282:aload_1         
	//* 119  283:ifnull          368
	//* 120  286:aload_0         
	//* 121  287:aload_0         
	//* 122  288:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//* 123  291:aload_0         
	//* 124  292:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 125  295:aload_1         
	//* 126  296:invokevirtual   #474 <Method int ItemTouchHelper$Callback.getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//* 127  299:iconst_1        
	//* 128  300:iload_2         
	//* 129  301:bipush          8
	//* 130  303:imul            
	//* 131  304:bipush          8
	//* 132  306:iadd            
	//* 133  307:ishl            
	//* 134  308:iconst_1        
	//* 135  309:isub            
	//* 136  310:iand            
	//* 137  311:aload_0         
	//* 138  312:getfield        #139 <Field int mActionState>
	//* 139  315:bipush          8
	//* 140  317:imul            
	//* 141  318:ishr            
	//* 142  319:putfield        #368 <Field int mSelectedFlags>
	//* 143  322:aload_0         
	//* 144  323:aload_1         
	//* 145  324:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//* 146  327:invokevirtual   #308 <Method int View.getLeft()>
	//* 147  330:i2f             
	//* 148  331:putfield        #268 <Field float mSelectedStartX>
	//* 149  334:aload_0         
	//* 150  335:aload_1         
	//* 151  336:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//* 152  339:invokevirtual   #302 <Method int View.getTop()>
	//* 153  342:i2f             
	//* 154  343:putfield        #274 <Field float mSelectedStartY>
	//* 155  346:aload_0         
	//* 156  347:aload_1         
	//* 157  348:putfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//* 158  351:iload_2         
	//* 159  352:iconst_2        
	//* 160  353:icmpne          368
	//* 161  356:aload_0         
	//* 162  357:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//* 163  360:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//* 164  363:iconst_0        
	//* 165  364:invokevirtual   #662 <Method boolean View.performHapticFeedback(int)>
	//* 166  367:pop             
	//* 167  368:aload_0         
	//* 168  369:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 169  372:invokevirtual   #663 <Method ViewParent RecyclerView.getParent()>
	//* 170  375:astore_1        
	//* 171  376:aload_1         
	//* 172  377:ifnull          398
	//* 173  380:aload_0         
	//* 174  381:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//* 175  384:ifnull          539
	//* 176  387:iconst_1        
	//* 177  388:istore          10
	//* 178  390:aload_1         
	//* 179  391:iload           10
	//* 180  393:invokeinterface #669 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//* 181  398:iload           7
	//* 182  400:ifne            413
	//* 183  403:aload_0         
	//* 184  404:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 185  407:invokevirtual   #287 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//* 186  410:invokevirtual   #672 <Method void android.support.v7.widget.RecyclerView$LayoutManager.requestSimpleAnimationsInNextLayout()>
	//* 187  413:aload_0         
	//* 188  414:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//* 189  417:aload_0         
	//* 190  418:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//* 191  421:aload_0         
	//* 192  422:getfield        #139 <Field int mActionState>
	//* 193  425:invokevirtual   #675 <Method void ItemTouchHelper$Callback.onSelectedChanged(android.support.v7.widget.RecyclerView$ViewHolder, int)>
	//* 194  428:aload_0         
	//* 195  429:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 196  432:invokevirtual   #678 <Method void RecyclerView.invalidate()>
	//* 197  435:return          
			j = swipeIfNecessary(((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)));
	//  198  436:aload_0         
	//  199  437:aload           11
	//  200  439:invokespecial   #680 <Method int swipeIfNecessary(android.support.v7.widget.RecyclerView$ViewHolder)>
	//  201  442:istore          8
		releaseVelocityTracker();
		j;
		JVM INSTR lookupswitch 6: default 164
	//	               1: 470
	//	               2: 470
	//	               4: 447
	//	               8: 447
	//	               16: 447
	//	               32: 447;
		   goto _L3 _L4 _L4 _L5 _L5 _L5 _L5
_L3:
		f = 0.0F;
		f1 = 0.0F;
_L6:
		if(k == 2)
			final_i = 8;
		else
	//* 202  444:goto            98
	//* 203  447:fconst_0        
	//* 204  448:fstore          4
	//* 205  450:aload_0         
	//* 206  451:getfield        #177 <Field float mDx>
	//* 207  454:invokestatic    #683 <Method float Math.signum(float)>
	//* 208  457:aload_0         
	//* 209  458:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 210  461:invokevirtual   #212 <Method int RecyclerView.getWidth()>
	//* 211  464:i2f             
	//* 212  465:fmul            
	//* 213  466:fstore_3        
	//* 214  467:goto            169
	//* 215  470:fconst_0        
	//* 216  471:fstore_3        
	//* 217  472:aload_0         
	//* 218  473:getfield        #219 <Field float mDy>
	//* 219  476:invokestatic    #683 <Method float Math.signum(float)>
	//* 220  479:aload_0         
	//* 221  480:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 222  483:invokevirtual   #222 <Method int RecyclerView.getHeight()>
	//* 223  486:i2f             
	//* 224  487:fmul            
	//* 225  488:fstore          4
	//* 226  490:goto            169
		if(j > 0)
	//* 227  493:iload           8
	//* 228  495:ifle            504
			final_i = 2;
	//  229  498:iconst_2        
	//  230  499:istore          7
		else
	//* 231  501:goto            179
			final_i = 4;
	//  232  504:iconst_4        
	//  233  505:istore          7
		getSelectedDxDy(mTmpPosition);
		f2 = mTmpPosition[0];
		f3 = mTmpPosition[1];
		final_viewholder = ((Object) (new RecoverAnimation(k, f2, f3, f, f1, j, ((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder))) {

			public void onAnimationEnd(Animator animator)
			{
				super.onAnimationEnd(animator);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokespecial   #31  <Method void ItemTouchHelper$RecoverAnimation.onAnimationEnd(Animator)>
				if(!mOverridden) goto _L2; else goto _L1
			//    3    5:aload_0         
			//    4    6:getfield        #35  <Field boolean mOverridden>
			//    5    9:ifeq            13
_L1:
				return;
			//    6   12:return          
_L2:
				if(swipeDir > 0)
					break; /* Loop/switch isn't completed */
			//    7   13:aload_0         
			//    8   14:getfield        #21  <Field int val$swipeDir>
			//    9   17:ifgt            73
				mCallback.clearView(mRecyclerView, prevSelected);
			//   10   20:aload_0         
			//   11   21:getfield        #19  <Field ItemTouchHelper this$0>
			//   12   24:getfield        #39  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
			//   13   27:aload_0         
			//   14   28:getfield        #19  <Field ItemTouchHelper this$0>
			//   15   31:getfield        #43  <Field RecyclerView ItemTouchHelper.mRecyclerView>
			//   16   34:aload_0         
			//   17   35:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
			//   18   38:invokevirtual   #49  <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
_L4:
				if(mOverdrawChild == prevSelected.itemView)
			//*  19   41:aload_0         
			//*  20   42:getfield        #19  <Field ItemTouchHelper this$0>
			//*  21   45:getfield        #53  <Field View ItemTouchHelper.mOverdrawChild>
			//*  22   48:aload_0         
			//*  23   49:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
			//*  24   52:getfield        #58  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
			//*  25   55:if_acmpne       12
				{
					removeChildDrawingOrderCallbackIfNecessary(prevSelected.itemView);
			//   26   58:aload_0         
			//   27   59:getfield        #19  <Field ItemTouchHelper this$0>
			//   28   62:aload_0         
			//   29   63:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
			//   30   66:getfield        #58  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
			//   31   69:invokevirtual   #62  <Method void ItemTouchHelper.removeChildDrawingOrderCallbackIfNecessary(View)>
					return;
			//   32   72:return          
				}
				if(true) goto _L1; else goto _L3
_L3:
				mPendingCleanup.add(((Object) (prevSelected.itemView)));
			//   33   73:aload_0         
			//   34   74:getfield        #19  <Field ItemTouchHelper this$0>
			//   35   77:getfield        #66  <Field List ItemTouchHelper.mPendingCleanup>
			//   36   80:aload_0         
			//   37   81:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
			//   38   84:getfield        #58  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
			//   39   87:invokeinterface #72  <Method boolean List.add(Object)>
			//   40   92:pop             
				mIsPendingCleanup = true;
			//   41   93:aload_0         
			//   42   94:iconst_1        
			//   43   95:putfield        #75  <Field boolean mIsPendingCleanup>
				if(swipeDir > 0)
			//*  44   98:aload_0         
			//*  45   99:getfield        #21  <Field int val$swipeDir>
			//*  46  102:ifle            41
					postDispatchSwipe(((RecoverAnimation) (this)), swipeDir);
			//   47  105:aload_0         
			//   48  106:getfield        #19  <Field ItemTouchHelper this$0>
			//   49  109:aload_0         
			//   50  110:aload_0         
			//   51  111:getfield        #21  <Field int val$swipeDir>
			//   52  114:invokevirtual   #79  <Method void ItemTouchHelper.postDispatchSwipe(ItemTouchHelper$RecoverAnimation, int)>
				  goto _L4
				if(true) goto _L1; else goto _L5
_L5:
			//*  53  117:goto            41
			}

			final ItemTouchHelper this$0;
			final android.support.v7.widget.RecyclerView.ViewHolder val$prevSelected;
			final int val$swipeDir;

			
			{
				this$0 = ItemTouchHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ItemTouchHelper this$0>
				swipeDir = k;
			//    3    5:aload_0         
			//    4    6:iload           9
			//    5    8:putfield        #21  <Field int val$swipeDir>
				prevSelected = viewholder1;
			//    6   11:aload_0         
			//    7   12:aload           10
			//    8   14:putfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
				super(final_viewholder, final_i, j, f, f1, f2, f3);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:iload_3         
			//   12   20:iload           4
			//   13   22:fload           5
			//   14   24:fload           6
			//   15   26:fload           7
			//   16   28:fload           8
			//   17   30:invokespecial   #26  <Method void ItemTouchHelper$RecoverAnimation(android.support.v7.widget.RecyclerView$ViewHolder, int, int, float, float, float, float)>
			//   18   33:return          
			}
		}
));
		((RecoverAnimation) (final_viewholder)).setDuration(mCallback.getAnimationDuration(mRecyclerView, final_i, f - f2, f1 - f3));
		mRecoverAnimations.add(final_viewholder);
		((RecoverAnimation) (final_viewholder)).start();
		final_i = 1;
_L7:
		mSelected = null;
_L2:
		if(viewholder != null)
		{
			mSelectedFlags = (mCallback.getAbsoluteMovementFlags(mRecyclerView, viewholder) & (1 << i * 8 + 8) - 1) >> mActionState * 8;
			mSelectedStartX = viewholder.itemView.getLeft();
			mSelectedStartY = viewholder.itemView.getTop();
			mSelected = viewholder;
			if(i == 2)
				mSelected.itemView.performHapticFeedback(0);
		}
		viewholder = ((android.support.v7.widget.RecyclerView.ViewHolder) (mRecyclerView.getParent()));
		if(viewholder != null)
		{
			boolean flag;
			if(mSelected != null)
				flag = true;
			else
	//* 234  507:goto            179
	//* 235  510:aload_0         
	//* 236  511:aload           11
	//* 237  513:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//* 238  516:invokevirtual   #562 <Method void removeChildDrawingOrderCallbackIfNecessary(View)>
	//* 239  519:aload_0         
	//* 240  520:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//* 241  523:aload_0         
	//* 242  524:getfield        #167 <Field RecyclerView mRecyclerView>
	//* 243  527:aload           11
	//* 244  529:invokevirtual   #251 <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//* 245  532:iload           8
	//* 246  534:istore          7
	//* 247  536:goto            277
				flag = false;
	//  248  539:iconst_0        
	//  249  540:istore          10
			((ViewParent) (viewholder)).requestDisallowInterceptTouchEvent(flag);
		}
		if(final_i == 0)
			mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
		mCallback.onSelectedChanged(mSelected, mActionState);
		mRecyclerView.invalidate();
		return;
_L5:
		f1 = 0.0F;
		f = Math.signum(mDx) * (float)mRecyclerView.getWidth();
		  goto _L6
_L4:
		f = 0.0F;
		f1 = Math.signum(mDy) * (float)mRecyclerView.getHeight();
		  goto _L6
		removeChildDrawingOrderCallbackIfNecessary(((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)).itemView);
		mCallback.clearView(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)));
		final_i = j;
		  goto _L7
	//* 250  542:goto            390
	}

	public void startDrag(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		if(!mCallback.hasDragFlag(mRecyclerView, viewholder))
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*   2    4:aload_0         
	//*   3    5:getfield        #167 <Field RecyclerView mRecyclerView>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #688 <Method boolean ItemTouchHelper$Callback.hasDragFlag(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//*   6   12:ifne            25
		{
			Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
	//    7   15:ldc1            #73  <String "ItemTouchHelper">
	//    8   17:ldc2            #690 <String "Start drag has been called but dragging is not enabled">
	//    9   20:invokestatic    #696 <Method int Log.e(String, String)>
	//   10   23:pop             
			return;
	//   11   24:return          
		}
		if(viewholder.itemView.getParent() != mRecyclerView)
	//*  12   25:aload_1         
	//*  13   26:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  14   29:invokevirtual   #642 <Method ViewParent View.getParent()>
	//*  15   32:aload_0         
	//*  16   33:getfield        #167 <Field RecyclerView mRecyclerView>
	//*  17   36:if_acmpeq       49
		{
			Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
	//   18   39:ldc1            #73  <String "ItemTouchHelper">
	//   19   41:ldc2            #698 <String "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.">
	//   20   44:invokestatic    #696 <Method int Log.e(String, String)>
	//   21   47:pop             
			return;
	//   22   48:return          
		} else
		{
			obtainVelocityTracker();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #700 <Method void obtainVelocityTracker()>
			mDy = 0.0F;
	//   25   53:aload_0         
	//   26   54:fconst_0        
	//   27   55:putfield        #219 <Field float mDy>
			mDx = 0.0F;
	//   28   58:aload_0         
	//   29   59:fconst_0        
	//   30   60:putfield        #177 <Field float mDx>
			select(viewholder, 2);
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:iconst_2        
	//   34   66:invokevirtual   #481 <Method void select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			return;
	//   35   69:return          
		}
	}

	public void startSwipe(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		if(!mCallback.hasSwipeFlag(mRecyclerView, viewholder))
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*   2    4:aload_0         
	//*   3    5:getfield        #167 <Field RecyclerView mRecyclerView>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #704 <Method boolean ItemTouchHelper$Callback.hasSwipeFlag(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//*   6   12:ifne            25
		{
			Log.e("ItemTouchHelper", "Start swipe has been called but swiping is not enabled");
	//    7   15:ldc1            #73  <String "ItemTouchHelper">
	//    8   17:ldc2            #706 <String "Start swipe has been called but swiping is not enabled">
	//    9   20:invokestatic    #696 <Method int Log.e(String, String)>
	//   10   23:pop             
			return;
	//   11   24:return          
		}
		if(viewholder.itemView.getParent() != mRecyclerView)
	//*  12   25:aload_1         
	//*  13   26:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  14   29:invokevirtual   #642 <Method ViewParent View.getParent()>
	//*  15   32:aload_0         
	//*  16   33:getfield        #167 <Field RecyclerView mRecyclerView>
	//*  17   36:if_acmpeq       49
		{
			Log.e("ItemTouchHelper", "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
	//   18   39:ldc1            #73  <String "ItemTouchHelper">
	//   19   41:ldc2            #708 <String "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.">
	//   20   44:invokestatic    #696 <Method int Log.e(String, String)>
	//   21   47:pop             
			return;
	//   22   48:return          
		} else
		{
			obtainVelocityTracker();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #700 <Method void obtainVelocityTracker()>
			mDy = 0.0F;
	//   25   53:aload_0         
	//   26   54:fconst_0        
	//   27   55:putfield        #219 <Field float mDy>
			mDx = 0.0F;
	//   28   58:aload_0         
	//   29   59:fconst_0        
	//   30   60:putfield        #177 <Field float mDx>
			select(viewholder, 1);
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:iconst_1        
	//   34   66:invokevirtual   #481 <Method void select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			return;
	//   35   69:return          
		}
	}

	void updateDxDy(MotionEvent motionevent, int i, int j)
	{
		float f = motionevent.getX(j);
	//    0    0:aload_1         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #344 <Method float MotionEvent.getX(int)>
	//    3    5:fstore          4
		float f1 = motionevent.getY(j);
	//    4    7:aload_1         
	//    5    8:iload_3         
	//    6    9:invokevirtual   #349 <Method float MotionEvent.getY(int)>
	//    7   12:fstore          5
		mDx = f - mInitialTouchX;
	//    8   14:aload_0         
	//    9   15:fload           4
	//   10   17:aload_0         
	//   11   18:getfield        #346 <Field float mInitialTouchX>
	//   12   21:fsub            
	//   13   22:putfield        #177 <Field float mDx>
		mDy = f1 - mInitialTouchY;
	//   14   25:aload_0         
	//   15   26:fload           5
	//   16   28:aload_0         
	//   17   29:getfield        #351 <Field float mInitialTouchY>
	//   18   32:fsub            
	//   19   33:putfield        #219 <Field float mDy>
		if((i & 4) == 0)
	//*  20   36:iload_2         
	//*  21   37:iconst_4        
	//*  22   38:iand            
	//*  23   39:ifne            54
			mDx = Math.max(0.0F, mDx);
	//   24   42:aload_0         
	//   25   43:fconst_0        
	//   26   44:aload_0         
	//   27   45:getfield        #177 <Field float mDx>
	//   28   48:invokestatic    #714 <Method float Math.max(float, float)>
	//   29   51:putfield        #177 <Field float mDx>
		if((i & 8) == 0)
	//*  30   54:iload_2         
	//*  31   55:bipush          8
	//*  32   57:iand            
	//*  33   58:ifne            73
			mDx = Math.min(0.0F, mDx);
	//   34   61:aload_0         
	//   35   62:fconst_0        
	//   36   63:aload_0         
	//   37   64:getfield        #177 <Field float mDx>
	//   38   67:invokestatic    #717 <Method float Math.min(float, float)>
	//   39   70:putfield        #177 <Field float mDx>
		if((i & 1) == 0)
	//*  40   73:iload_2         
	//*  41   74:iconst_1        
	//*  42   75:iand            
	//*  43   76:ifne            91
			mDy = Math.max(0.0F, mDy);
	//   44   79:aload_0         
	//   45   80:fconst_0        
	//   46   81:aload_0         
	//   47   82:getfield        #219 <Field float mDy>
	//   48   85:invokestatic    #714 <Method float Math.max(float, float)>
	//   49   88:putfield        #219 <Field float mDy>
		if((i & 2) == 0)
	//*  50   91:iload_2         
	//*  51   92:iconst_2        
	//*  52   93:iand            
	//*  53   94:ifne            109
			mDy = Math.min(0.0F, mDy);
	//   54   97:aload_0         
	//   55   98:fconst_0        
	//   56   99:aload_0         
	//   57  100:getfield        #219 <Field float mDy>
	//   58  103:invokestatic    #717 <Method float Math.min(float, float)>
	//   59  106:putfield        #219 <Field float mDy>
	//   60  109:return          
	}

	static final int ACTION_MODE_DRAG_MASK = 0xff0000;
	private static final int ACTION_MODE_IDLE_MASK = 255;
	static final int ACTION_MODE_SWIPE_MASK = 65280;
	public static final int ACTION_STATE_DRAG = 2;
	public static final int ACTION_STATE_IDLE = 0;
	public static final int ACTION_STATE_SWIPE = 1;
	static final int ACTIVE_POINTER_ID_NONE = -1;
	public static final int ANIMATION_TYPE_DRAG = 8;
	public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
	public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
	static final boolean DEBUG = false;
	static final int DIRECTION_FLAG_COUNT = 8;
	public static final int DOWN = 2;
	public static final int END = 32;
	public static final int LEFT = 4;
	private static final int PIXELS_PER_SECOND = 1000;
	public static final int RIGHT = 8;
	public static final int START = 16;
	static final String TAG = "ItemTouchHelper";
	public static final int UP = 1;
	int mActionState;
	int mActivePointerId;
	Callback mCallback;
	private android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
	private List mDistances;
	private long mDragScrollStartTimeInMs;
	float mDx;
	float mDy;
	GestureDetectorCompat mGestureDetector;
	float mInitialTouchX;
	float mInitialTouchY;
	float mMaxSwipeVelocity;
	private final android.support.v7.widget.RecyclerView.OnItemTouchListener mOnItemTouchListener = new android.support.v7.widget.RecyclerView.OnItemTouchListener() {

		public boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
		{
			mGestureDetector.onTouchEvent(motionevent);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field ItemTouchHelper this$0>
		//    2    4:getfield        #24  <Field GestureDetectorCompat ItemTouchHelper.mGestureDetector>
		//    3    7:aload_2         
		//    4    8:invokevirtual   #30  <Method boolean GestureDetectorCompat.onTouchEvent(MotionEvent)>
		//    5   11:pop             
			int i = motionevent.getActionMasked();
		//    6   12:aload_2         
		//    7   13:invokevirtual   #36  <Method int MotionEvent.getActionMasked()>
		//    8   16:istore_3        
			if(i == 0)
		//*   9   17:iload_3         
		//*  10   18:ifne            247
			{
				mActivePointerId = motionevent.getPointerId(0);
		//   11   21:aload_0         
		//   12   22:getfield        #14  <Field ItemTouchHelper this$0>
		//   13   25:aload_2         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
		//   16   30:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
				mInitialTouchX = motionevent.getX();
		//   17   33:aload_0         
		//   18   34:getfield        #14  <Field ItemTouchHelper this$0>
		//   19   37:aload_2         
		//   20   38:invokevirtual   #48  <Method float MotionEvent.getX()>
		//   21   41:putfield        #52  <Field float ItemTouchHelper.mInitialTouchX>
				mInitialTouchY = motionevent.getY();
		//   22   44:aload_0         
		//   23   45:getfield        #14  <Field ItemTouchHelper this$0>
		//   24   48:aload_2         
		//   25   49:invokevirtual   #55  <Method float MotionEvent.getY()>
		//   26   52:putfield        #58  <Field float ItemTouchHelper.mInitialTouchY>
				obtainVelocityTracker();
		//   27   55:aload_0         
		//   28   56:getfield        #14  <Field ItemTouchHelper this$0>
		//   29   59:invokevirtual   #61  <Method void ItemTouchHelper.obtainVelocityTracker()>
				if(mSelected == null)
		//*  30   62:aload_0         
		//*  31   63:getfield        #14  <Field ItemTouchHelper this$0>
		//*  32   66:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
		//*  33   69:ifnonnull       214
				{
					recyclerview = ((RecyclerView) (findAnimation(motionevent)));
		//   34   72:aload_0         
		//   35   73:getfield        #14  <Field ItemTouchHelper this$0>
		//   36   76:aload_2         
		//   37   77:invokevirtual   #69  <Method ItemTouchHelper$RecoverAnimation ItemTouchHelper.findAnimation(MotionEvent)>
		//   38   80:astore_1        
					if(recyclerview != null)
		//*  39   81:aload_1         
		//*  40   82:ifnull          214
					{
						ItemTouchHelper itemtouchhelper = ItemTouchHelper.this;
		//   41   85:aload_0         
		//   42   86:getfield        #14  <Field ItemTouchHelper this$0>
		//   43   89:astore          5
						itemtouchhelper.mInitialTouchX = itemtouchhelper.mInitialTouchX - ((RecoverAnimation) (recyclerview)).mX;
		//   44   91:aload           5
		//   45   93:aload           5
		//   46   95:getfield        #52  <Field float ItemTouchHelper.mInitialTouchX>
		//   47   98:aload_1         
		//   48   99:getfield        #74  <Field float ItemTouchHelper$RecoverAnimation.mX>
		//   49  102:fsub            
		//   50  103:putfield        #52  <Field float ItemTouchHelper.mInitialTouchX>
						itemtouchhelper = ItemTouchHelper.this;
		//   51  106:aload_0         
		//   52  107:getfield        #14  <Field ItemTouchHelper this$0>
		//   53  110:astore          5
						itemtouchhelper.mInitialTouchY = itemtouchhelper.mInitialTouchY - ((RecoverAnimation) (recyclerview)).mY;
		//   54  112:aload           5
		//   55  114:aload           5
		//   56  116:getfield        #58  <Field float ItemTouchHelper.mInitialTouchY>
		//   57  119:aload_1         
		//   58  120:getfield        #77  <Field float ItemTouchHelper$RecoverAnimation.mY>
		//   59  123:fsub            
		//   60  124:putfield        #58  <Field float ItemTouchHelper.mInitialTouchY>
						endRecoverAnimation(((RecoverAnimation) (recyclerview)).mViewHolder, true);
		//   61  127:aload_0         
		//   62  128:getfield        #14  <Field ItemTouchHelper this$0>
		//   63  131:aload_1         
		//   64  132:getfield        #80  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//   65  135:iconst_1        
		//   66  136:invokevirtual   #84  <Method int ItemTouchHelper.endRecoverAnimation(android.support.v7.widget.RecyclerView$ViewHolder, boolean)>
		//   67  139:pop             
						if(mPendingCleanup.remove(((Object) (((RecoverAnimation) (recyclerview)).mViewHolder.itemView))))
		//*  68  140:aload_0         
		//*  69  141:getfield        #14  <Field ItemTouchHelper this$0>
		//*  70  144:getfield        #88  <Field List ItemTouchHelper.mPendingCleanup>
		//*  71  147:aload_1         
		//*  72  148:getfield        #80  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//*  73  151:getfield        #94  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  74  154:invokeinterface #100 <Method boolean List.remove(Object)>
		//*  75  159:ifeq            183
							mCallback.clearView(mRecyclerView, ((RecoverAnimation) (recyclerview)).mViewHolder);
		//   76  162:aload_0         
		//   77  163:getfield        #14  <Field ItemTouchHelper this$0>
		//   78  166:getfield        #104 <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
		//   79  169:aload_0         
		//   80  170:getfield        #14  <Field ItemTouchHelper this$0>
		//   81  173:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   82  176:aload_1         
		//   83  177:getfield        #80  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//   84  180:invokevirtual   #114 <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
						select(((RecoverAnimation) (recyclerview)).mViewHolder, ((RecoverAnimation) (recyclerview)).mActionState);
		//   85  183:aload_0         
		//   86  184:getfield        #14  <Field ItemTouchHelper this$0>
		//   87  187:aload_1         
		//   88  188:getfield        #80  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//   89  191:aload_1         
		//   90  192:getfield        #117 <Field int ItemTouchHelper$RecoverAnimation.mActionState>
		//   91  195:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
						updateDxDy(motionevent, mSelectedFlags, 0);
		//   92  198:aload_0         
		//   93  199:getfield        #14  <Field ItemTouchHelper this$0>
		//   94  202:aload_2         
		//   95  203:aload_0         
		//   96  204:getfield        #14  <Field ItemTouchHelper this$0>
		//   97  207:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
		//   98  210:iconst_0        
		//   99  211:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
					}
				}
			} else
		//* 100  214:aload_0         
		//* 101  215:getfield        #14  <Field ItemTouchHelper this$0>
		//* 102  218:getfield        #132 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//* 103  221:ifnull          235
		//* 104  224:aload_0         
		//* 105  225:getfield        #14  <Field ItemTouchHelper this$0>
		//* 106  228:getfield        #132 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//* 107  231:aload_2         
		//* 108  232:invokevirtual   #138 <Method void VelocityTracker.addMovement(MotionEvent)>
		//* 109  235:aload_0         
		//* 110  236:getfield        #14  <Field ItemTouchHelper this$0>
		//* 111  239:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
		//* 112  242:ifnull          321
		//* 113  245:iconst_1        
		//* 114  246:ireturn         
			if(i == 3 || i == 1)
		//* 115  247:iload_3         
		//* 116  248:iconst_3        
		//* 117  249:icmpeq          257
		//* 118  252:iload_3         
		//* 119  253:iconst_1        
		//* 120  254:icmpne          277
			{
				mActivePointerId = -1;
		//  121  257:aload_0         
		//  122  258:getfield        #14  <Field ItemTouchHelper this$0>
		//  123  261:iconst_m1       
		//  124  262:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
				select(((android.support.v7.widget.RecyclerView.ViewHolder) (null)), 0);
		//  125  265:aload_0         
		//  126  266:getfield        #14  <Field ItemTouchHelper this$0>
		//  127  269:aconst_null     
		//  128  270:iconst_0        
		//  129  271:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			} else
		//* 130  274:goto            214
			if(mActivePointerId != -1)
		//* 131  277:aload_0         
		//* 132  278:getfield        #14  <Field ItemTouchHelper this$0>
		//* 133  281:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		//* 134  284:iconst_m1       
		//* 135  285:icmpeq          214
			{
				int j = motionevent.findPointerIndex(mActivePointerId);
		//  136  288:aload_2         
		//  137  289:aload_0         
		//  138  290:getfield        #14  <Field ItemTouchHelper this$0>
		//  139  293:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		//  140  296:invokevirtual   #141 <Method int MotionEvent.findPointerIndex(int)>
		//  141  299:istore          4
				if(j >= 0)
		//* 142  301:iload           4
		//* 143  303:iflt            214
					checkSelectForSwipe(i, motionevent, j);
		//  144  306:aload_0         
		//  145  307:getfield        #14  <Field ItemTouchHelper this$0>
		//  146  310:iload_3         
		//  147  311:aload_2         
		//  148  312:iload           4
		//  149  314:invokevirtual   #145 <Method boolean ItemTouchHelper.checkSelectForSwipe(int, MotionEvent, int)>
		//  150  317:pop             
			}
			if(mVelocityTracker != null)
				mVelocityTracker.addMovement(motionevent);
			return mSelected != null;
		//  151  318:goto            214
		//  152  321:iconst_0        
		//  153  322:ireturn         
		}

		public void onRequestDisallowInterceptTouchEvent(boolean flag)
		{
			if(!flag)
		//*   0    0:iload_1         
		//*   1    1:ifne            5
			{
				return;
		//    2    4:return          
			} else
			{
				select(((android.support.v7.widget.RecyclerView.ViewHolder) (null)), 0);
		//    3    5:aload_0         
		//    4    6:getfield        #14  <Field ItemTouchHelper this$0>
		//    5    9:aconst_null     
		//    6   10:iconst_0        
		//    7   11:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
				return;
		//    8   14:return          
			}
		}

		public void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
		{
			int i;
			i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_3        
			mGestureDetector.onTouchEvent(motionevent);
		//    2    2:aload_0         
		//    3    3:getfield        #14  <Field ItemTouchHelper this$0>
		//    4    6:getfield        #24  <Field GestureDetectorCompat ItemTouchHelper.mGestureDetector>
		//    5    9:aload_2         
		//    6   10:invokevirtual   #30  <Method boolean GestureDetectorCompat.onTouchEvent(MotionEvent)>
		//    7   13:pop             
			if(mVelocityTracker != null)
		//*   8   14:aload_0         
		//*   9   15:getfield        #14  <Field ItemTouchHelper this$0>
		//*  10   18:getfield        #132 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//*  11   21:ifnull          35
				mVelocityTracker.addMovement(motionevent);
		//   12   24:aload_0         
		//   13   25:getfield        #14  <Field ItemTouchHelper this$0>
		//   14   28:getfield        #132 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//   15   31:aload_2         
		//   16   32:invokevirtual   #138 <Method void VelocityTracker.addMovement(MotionEvent)>
			if(mActivePointerId != -1) goto _L2; else goto _L1
		//   17   35:aload_0         
		//   18   36:getfield        #14  <Field ItemTouchHelper this$0>
		//   19   39:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		//   20   42:iconst_m1       
		//   21   43:icmpne          47
_L1:
			return;
		//   22   46:return          
_L2:
			int j;
			int k;
			j = motionevent.getActionMasked();
		//   23   47:aload_2         
		//   24   48:invokevirtual   #36  <Method int MotionEvent.getActionMasked()>
		//   25   51:istore          4
			k = motionevent.findPointerIndex(mActivePointerId);
		//   26   53:aload_2         
		//   27   54:aload_0         
		//   28   55:getfield        #14  <Field ItemTouchHelper this$0>
		//   29   58:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		//   30   61:invokevirtual   #141 <Method int MotionEvent.findPointerIndex(int)>
		//   31   64:istore          5
			if(k >= 0)
		//*  32   66:iload           5
		//*  33   68:iflt            84
				checkSelectForSwipe(j, motionevent, k);
		//   34   71:aload_0         
		//   35   72:getfield        #14  <Field ItemTouchHelper this$0>
		//   36   75:iload           4
		//   37   77:aload_2         
		//   38   78:iload           5
		//   39   80:invokevirtual   #145 <Method boolean ItemTouchHelper.checkSelectForSwipe(int, MotionEvent, int)>
		//   40   83:pop             
			recyclerview = ((RecyclerView) (mSelected));
		//   41   84:aload_0         
		//   42   85:getfield        #14  <Field ItemTouchHelper this$0>
		//   43   88:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
		//   44   91:astore_1        
			if(recyclerview == null) goto _L1; else goto _L3
		//   45   92:aload_1         
		//   46   93:ifnull          46
_L3:
			j;
		//   47   96:iload           4
			JVM INSTR tableswitch 1 6: default 136
		//		               1 137
		//		               2 155
		//		               3 226
		//		               4 136
		//		               5 136
		//		               6 249;
		//   48   98:tableswitch     1 6: default 136
		//		               1 137
		//		               2 155
		//		               3 226
		//		               4 136
		//		               5 136
		//		               6 249
			   goto _L4 _L5 _L6 _L7 _L4 _L4 _L8
_L4:
			return;
		//   49  136:return          
_L5:
			select(((android.support.v7.widget.RecyclerView.ViewHolder) (null)), 0);
		//   50  137:aload_0         
		//   51  138:getfield        #14  <Field ItemTouchHelper this$0>
		//   52  141:aconst_null     
		//   53  142:iconst_0        
		//   54  143:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			mActivePointerId = -1;
		//   55  146:aload_0         
		//   56  147:getfield        #14  <Field ItemTouchHelper this$0>
		//   57  150:iconst_m1       
		//   58  151:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
			return;
		//   59  154:return          
_L6:
			if(k >= 0)
		//*  60  155:iload           5
		//*  61  157:iflt            46
			{
				updateDxDy(motionevent, mSelectedFlags, k);
		//   62  160:aload_0         
		//   63  161:getfield        #14  <Field ItemTouchHelper this$0>
		//   64  164:aload_2         
		//   65  165:aload_0         
		//   66  166:getfield        #14  <Field ItemTouchHelper this$0>
		//   67  169:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
		//   68  172:iload           5
		//   69  174:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
				moveIfNecessary(((android.support.v7.widget.RecyclerView.ViewHolder) (recyclerview)));
		//   70  177:aload_0         
		//   71  178:getfield        #14  <Field ItemTouchHelper this$0>
		//   72  181:aload_1         
		//   73  182:invokevirtual   #152 <Method void ItemTouchHelper.moveIfNecessary(android.support.v7.widget.RecyclerView$ViewHolder)>
				mRecyclerView.removeCallbacks(mScrollRunnable);
		//   74  185:aload_0         
		//   75  186:getfield        #14  <Field ItemTouchHelper this$0>
		//   76  189:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   77  192:aload_0         
		//   78  193:getfield        #14  <Field ItemTouchHelper this$0>
		//   79  196:getfield        #156 <Field Runnable ItemTouchHelper.mScrollRunnable>
		//   80  199:invokevirtual   #162 <Method boolean RecyclerView.removeCallbacks(Runnable)>
		//   81  202:pop             
				mScrollRunnable.run();
		//   82  203:aload_0         
		//   83  204:getfield        #14  <Field ItemTouchHelper this$0>
		//   84  207:getfield        #156 <Field Runnable ItemTouchHelper.mScrollRunnable>
		//   85  210:invokeinterface #167 <Method void Runnable.run()>
				mRecyclerView.invalidate();
		//   86  215:aload_0         
		//   87  216:getfield        #14  <Field ItemTouchHelper this$0>
		//   88  219:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   89  222:invokevirtual   #170 <Method void RecyclerView.invalidate()>
				return;
		//   90  225:return          
			}
			break; /* Loop/switch isn't completed */
_L7:
			if(mVelocityTracker != null)
		//*  91  226:aload_0         
		//*  92  227:getfield        #14  <Field ItemTouchHelper this$0>
		//*  93  230:getfield        #132 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//*  94  233:ifnull          137
				mVelocityTracker.clear();
		//   95  236:aload_0         
		//   96  237:getfield        #14  <Field ItemTouchHelper this$0>
		//   97  240:getfield        #132 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//   98  243:invokevirtual   #173 <Method void VelocityTracker.clear()>
			if(true) goto _L5; else goto _L9
		//   99  246:goto            137
_L9:
			break; /* Loop/switch isn't completed */
_L8:
			j = motionevent.getActionIndex();
		//  100  249:aload_2         
		//  101  250:invokevirtual   #176 <Method int MotionEvent.getActionIndex()>
		//  102  253:istore          4
			continue; /* Loop/switch isn't completed */
			if(true) goto _L1; else goto _L10
_L10:
			if(motionevent.getPointerId(j) != mActivePointerId) goto _L1; else goto _L11
		//  103  255:aload_2         
		//  104  256:iload           4
		//  105  258:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
		//  106  261:aload_0         
		//  107  262:getfield        #14  <Field ItemTouchHelper this$0>
		//  108  265:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		//  109  268:icmpne          46
_L11:
			if(j == 0)
		//* 110  271:iload           4
		//* 111  273:ifne            278
				i = 1;
		//  112  276:iconst_1        
		//  113  277:istore_3        
			mActivePointerId = motionevent.getPointerId(i);
		//  114  278:aload_0         
		//  115  279:getfield        #14  <Field ItemTouchHelper this$0>
		//  116  282:aload_2         
		//  117  283:iload_3         
		//  118  284:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
		//  119  287:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
			updateDxDy(motionevent, mSelectedFlags, j);
		//  120  290:aload_0         
		//  121  291:getfield        #14  <Field ItemTouchHelper this$0>
		//  122  294:aload_2         
		//  123  295:aload_0         
		//  124  296:getfield        #14  <Field ItemTouchHelper this$0>
		//  125  299:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
		//  126  302:iload           4
		//  127  304:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
			return;
		//  128  307:return          
		}

		final ItemTouchHelper this$0;

			
			{
				this$0 = ItemTouchHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ItemTouchHelper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	View mOverdrawChild;
	int mOverdrawChildPosition;
	final List mPendingCleanup = new ArrayList();
	List mRecoverAnimations;
	RecyclerView mRecyclerView;
	final Runnable mScrollRunnable = new Runnable() {

		public void run()
		{
			if(mSelected != null && scrollIfNecessary())
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field ItemTouchHelper this$0>
		//*   2    4:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
		//*   3    7:ifnull          73
		//*   4   10:aload_0         
		//*   5   11:getfield        #14  <Field ItemTouchHelper this$0>
		//*   6   14:invokevirtual   #27  <Method boolean ItemTouchHelper.scrollIfNecessary()>
		//*   7   17:ifeq            73
			{
				if(mSelected != null)
		//*   8   20:aload_0         
		//*   9   21:getfield        #14  <Field ItemTouchHelper this$0>
		//*  10   24:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
		//*  11   27:ifnull          44
					moveIfNecessary(mSelected);
		//   12   30:aload_0         
		//   13   31:getfield        #14  <Field ItemTouchHelper this$0>
		//   14   34:aload_0         
		//   15   35:getfield        #14  <Field ItemTouchHelper this$0>
		//   16   38:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
		//   17   41:invokevirtual   #31  <Method void ItemTouchHelper.moveIfNecessary(android.support.v7.widget.RecyclerView$ViewHolder)>
				mRecyclerView.removeCallbacks(mScrollRunnable);
		//   18   44:aload_0         
		//   19   45:getfield        #14  <Field ItemTouchHelper this$0>
		//   20   48:getfield        #35  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   21   51:aload_0         
		//   22   52:getfield        #14  <Field ItemTouchHelper this$0>
		//   23   55:getfield        #39  <Field Runnable ItemTouchHelper.mScrollRunnable>
		//   24   58:invokevirtual   #45  <Method boolean RecyclerView.removeCallbacks(Runnable)>
		//   25   61:pop             
				ViewCompat.postOnAnimation(((View) (mRecyclerView)), ((Runnable) (this)));
		//   26   62:aload_0         
		//   27   63:getfield        #14  <Field ItemTouchHelper this$0>
		//   28   66:getfield        #35  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   29   69:aload_0         
		//   30   70:invokestatic    #51  <Method void ViewCompat.postOnAnimation(View, Runnable)>
			}
		//   31   73:return          
		}

		final ItemTouchHelper this$0;

			
			{
				this$0 = ItemTouchHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ItemTouchHelper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	android.support.v7.widget.RecyclerView.ViewHolder mSelected;
	int mSelectedFlags;
	float mSelectedStartX;
	float mSelectedStartY;
	private int mSlop;
	private List mSwapTargets;
	float mSwipeEscapeVelocity;
	private final float mTmpPosition[] = new float[2];
	private Rect mTmpRect;
	VelocityTracker mVelocityTracker;

	// Unreferenced inner class android/support/v7/widget/helper/ItemTouchHelper$RecoverAnimation$1

/* anonymous class */
	class RecoverAnimation._cls1
		implements android.animation.ValueAnimator.AnimatorUpdateListener
	{

		public void onAnimationUpdate(ValueAnimator valueanimator)
		{
			setFraction(valueanimator.getAnimatedFraction());
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field ItemTouchHelper$RecoverAnimation this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #31  <Method float ValueAnimator.getAnimatedFraction()>
		//    4    8:invokevirtual   #35  <Method void ItemTouchHelper$RecoverAnimation.setFraction(float)>
		//    5   11:return          
		}

		final RecoverAnimation this$0;

			
			{
				this$0 = RecoverAnimation.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ItemTouchHelper$RecoverAnimation this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
	}

}
